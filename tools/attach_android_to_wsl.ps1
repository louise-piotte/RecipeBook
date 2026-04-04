#Requires -Version 5.1
#Requires -RunAsAdministrator

[CmdletBinding()]
param(
    [string]$BusId,
    [string]$DeviceHint = 'Pixel 9a|Pixel|Android|Google',
    [string]$Distro,
    [switch]$Detach,
    [switch]$SkipWslCheck
)

$ErrorActionPreference = 'Stop'
Set-StrictMode -Version Latest

function Require-Command {
    param([Parameter(Mandatory = $true)][string]$Name)

    if (-not (Get-Command $Name -ErrorAction SilentlyContinue)) {
        throw "Required command '$Name' was not found in PATH."
    }
}

function Invoke-Checked {
    param(
        [Parameter(Mandatory = $true)][string]$FilePath,
        [Parameter(Mandatory = $true)][string[]]$Arguments
    )

    Write-Host "> $FilePath $($Arguments -join ' ')" -ForegroundColor Cyan
    & $FilePath @Arguments
    if ($LASTEXITCODE -ne 0) {
        throw "$FilePath exited with code $LASTEXITCODE."
    }
}

function Get-UsbipdEntries {
    $output = & usbipd list
    if ($LASTEXITCODE -ne 0) {
        throw "usbipd list failed."
    }

    $entries = @()
    foreach ($line in $output) {
        $trimmed = $line.Trim()
        if (-not $trimmed) {
            continue
        }

        if ($trimmed -match '^(Connected:|Persisted:|BUSID\s+)') {
            continue
        }

        $columns = $trimmed -split '\s{2,}'
        if ($columns.Length -lt 4) {
            continue
        }

        if ($columns[0] -notmatch '^\d+-\d+(?:-\d+)*$') {
            continue
        }

        $entries += [pscustomobject]@{
            BusId  = $columns[0]
            VidPid = $columns[1]
            Device = $columns[2]
            State  = ($columns[3..($columns.Length - 1)] -join '  ')
        }
    }

    return $entries
}

function Find-UsbipdEntry {
    param(
        [string]$BusId,
        [string]$DeviceHint,
        [switch]$PreferAttached
    )

    $entries = @(Get-UsbipdEntries)

    if ($entries.Count -eq 0) {
        throw "usbipd did not report any USB devices."
    }

    if ($BusId) {
        $match = @($entries | Where-Object { $_.BusId -eq $BusId })
        if ($match.Count -eq 1) {
            return $match[0]
        }

        $table = ($entries | Format-Table BusId, VidPid, Device, State -AutoSize | Out-String).Trim()
        throw "BusId '$BusId' was not found.`n`n$table"
    }

    $matches = @($entries | Where-Object { $_.Device -match $DeviceHint })
    if ($PreferAttached) {
        $attached = @($matches | Where-Object { $_.State -match '^Attached' })
        if ($attached.Count -eq 1) {
            return $attached[0]
        }
    }

    if ($matches.Count -eq 1) {
        return $matches[0]
    }

    $table = ($entries | Format-Table BusId, VidPid, Device, State -AutoSize | Out-String).Trim()
    if ($matches.Count -eq 0) {
        throw "No USB device matched DeviceHint '$DeviceHint'. Pass -BusId to select one explicitly.`n`n$table"
    }

    throw "More than one USB device matched DeviceHint '$DeviceHint'. Pass -BusId to select one explicitly.`n`n$table"
}

function Invoke-WslCheck {
    param([string]$Distro)

    $baseArgs = @()
    if ($Distro) {
        $baseArgs += @('-d', $Distro)
    }

    Write-Host 'lsusb:' -ForegroundColor Cyan
    & wsl.exe @baseArgs -- lsusb

    Write-Host ''
    Write-Host 'adb devices -l:' -ForegroundColor Cyan
    & wsl.exe @baseArgs -- adb start-server | Out-Null
    & wsl.exe @baseArgs -- adb devices -l
    if ($LASTEXITCODE -ne 0) {
        throw "WSL adb check exited with code $LASTEXITCODE."
    }
}

Require-Command -Name 'usbipd'
Require-Command -Name 'wsl.exe'

$entry = Find-UsbipdEntry -BusId $BusId -DeviceHint $DeviceHint -PreferAttached:$Detach

if ($Detach) {
    Invoke-Checked -FilePath 'usbipd' -Arguments @('detach', '--busid', $entry.BusId)
    Write-Host "Detached $($entry.Device) ($($entry.BusId)) from WSL." -ForegroundColor Green
    exit 0
}

if ($entry.State -match '^Not shared') {
    Invoke-Checked -FilePath 'usbipd' -Arguments @('bind', '--busid', $entry.BusId)
}
else {
    Write-Host "Skipping bind because the device is already shared or attached." -ForegroundColor Yellow
}

$entry = Find-UsbipdEntry -BusId $entry.BusId -DeviceHint $DeviceHint
if ($entry.State -notmatch '^Attached') {
    Invoke-Checked -FilePath 'usbipd' -Arguments @('attach', '--wsl', '--busid', $entry.BusId)
}
else {
    Write-Host "Device is already attached to WSL." -ForegroundColor Yellow
}

Write-Host "Attached $($entry.Device) ($($entry.BusId)) to WSL." -ForegroundColor Green

if (-not $SkipWslCheck) {
    Invoke-WslCheck -Distro $Distro
    Write-Host "If adb shows 'unauthorized', unlock the phone and accept the USB debugging prompt, then rerun this script." -ForegroundColor Yellow
}
