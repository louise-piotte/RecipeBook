param(
    [string]$InputHtml = 'docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes.html',
    [string]$OutputDir = 'docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes'
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'
Add-Type -AssemblyName System.Web

function Decode-Html([string]$value) {
    [System.Web.HttpUtility]::HtmlDecode($value).Trim()
}

function Slugify([string]$value) {
    $normalized = $value.ToLowerInvariant()
    $normalized = [regex]::Replace($normalized, '[^a-z0-9]+', '-')
    $normalized = $normalized.Trim('-')
    if ([string]::IsNullOrWhiteSpace($normalized)) { return 'recipe' }
    return $normalized
}

function Read-MetaContent([string]$block, [string]$itemprop) {
    $match = [regex]::Match($block, '<meta\s+content="([^"]*)"\s+itemprop="' + [regex]::Escape($itemprop) + '"')
    if (-not $match.Success) { return $null }
    return Decode-Html $match.Groups[1].Value
}

function Read-MetaContents([string]$block, [string]$itemprop) {
    return [regex]::Matches($block, '<meta\s+content="([^"]*)"\s+itemprop="' + [regex]::Escape($itemprop) + '"') |
        ForEach-Object { Decode-Html $_.Groups[1].Value } |
        Where-Object { -not [string]::IsNullOrWhiteSpace($_) }
}

function Read-SpanValue([string]$block, [string]$itemprop) {
    $match = [regex]::Match($block, 'itemprop="' + [regex]::Escape($itemprop) + '">([\s\S]*?)</')
    if (-not $match.Success) { return $null }
    return Decode-Html ($match.Groups[1].Value -replace '<[^>]+>', '')
}

function Read-ParagraphList([string]$block, [string]$containerPattern) {
    $container = [regex]::Match($block, $containerPattern)
    if (-not $container.Success) { return @() }
    return [regex]::Matches($container.Groups[1].Value, '<p>([\s\S]*?)</p>') |
        ForEach-Object { Decode-Html ($_.Groups[1].Value -replace '<[^>]+>', '') } |
        Where-Object { -not [string]::IsNullOrWhiteSpace($_) }
}

function Read-PhotoPaths([string]$block) {
    $seen = [System.Collections.Generic.HashSet[string]]::new([System.StringComparer]::OrdinalIgnoreCase)
    $paths = [System.Collections.Generic.List[string]]::new()
    foreach ($match in [regex]::Matches($block, '<img\s+src="([^"]+)"')) {
        $path = Decode-Html $match.Groups[1].Value
        if ([string]::IsNullOrWhiteSpace($path)) { continue }
        if ($seen.Add($path)) { $paths.Add($path) }
    }
    return $paths
}

if (-not (Test-Path $InputHtml)) {
    throw "Input HTML not found: $InputHtml"
}

New-Item -ItemType Directory -Path $OutputDir -Force | Out-Null
Get-ChildItem $OutputDir -File | Remove-Item -Force

$html = Get-Content $InputHtml -Raw
$blocks = [regex]::Matches($html, '<div class="recipe-details">([\s\S]*?)<hr\s*/>\s*</div>')
$manifest = [System.Collections.Generic.List[object]]::new()
$sequence = 0

foreach ($match in $blocks) {
    $sequence++
    $block = $match.Value
    $recipeId = Read-MetaContent $block 'recipeId'
    $title = Decode-Html (([regex]::Match($block, '<h2 itemprop="name">([\s\S]*?)</h2>').Groups[1].Value -replace '<[^>]+>', ''))
    $sourceUrl = $null
    $sourceUrlMatch = [regex]::Match($block, '<span itemprop="recipeSource"><a href="([^"]+)"')
    if ($sourceUrlMatch.Success) { $sourceUrl = Decode-Html $sourceUrlMatch.Groups[1].Value }

    $record = [ordered]@{
        recipeId = $recipeId
        title = $title
        recipeShareId = Read-MetaContent $block 'recipeShareId'
        linkedRecipeId = Read-MetaContent $block 'recipeLinkedRecipeId'
        isFavourite = Read-MetaContent $block 'recipeIsFavourite'
        rating = Read-MetaContent $block 'recipeRating'
        course = Read-SpanValue $block 'recipeCourse'
        categories = @(Read-MetaContents $block 'recipeCategory')
        collections = @(Read-MetaContents $block 'recipeCollection')
        sourceUrl = $sourceUrl
        yield = Read-SpanValue $block 'recipeYield'
        prepTimeIso = Read-MetaContent $block 'prepTime'
        cookTimeIso = Read-MetaContent $block 'cookTime'
        ingredientLines = @(Read-ParagraphList $block '<div class="recipe-ingredients" itemprop="recipeIngredients">([\s\S]*?)</div>')
        directionLines = @(Read-ParagraphList $block '<div itemprop="recipeDirections">([\s\S]*?)</div>')
        notes = @(Read-ParagraphList $block '<div class="recipe-notes" itemprop="recipeNotes">([\s\S]*?)</div>')
        nutrition = [ordered]@{
            servingSize = Read-MetaContent $block 'recipeNutServingSize'
            calories = Read-MetaContent $block 'recipeNutCalories'
            totalFat = Read-MetaContent $block 'recipeNutTotalFat'
            saturatedFat = Read-MetaContent $block 'recipeNutSaturatedFat'
            cholesterol = Read-MetaContent $block 'recipeNutCholesterol'
            sodium = Read-MetaContent $block 'recipeNutSodium'
            totalCarbohydrate = Read-MetaContent $block 'recipeNutTotalCarbohydrate'
            dietaryFiber = Read-MetaContent $block 'recipeNutDietaryFiber'
            sugars = Read-MetaContent $block 'recipeNutSugars'
            protein = Read-MetaContent $block 'recipeNutProtein'
        }
        photoPaths = @(Read-PhotoPaths $block)
    }

    $fileName = ('{0:D3}-{1}-{2}.json' -f $sequence, (Slugify $title), $recipeId)
    $outputPath = Join-Path $OutputDir $fileName
    $record | ConvertTo-Json -Depth 6 | Set-Content $outputPath

    $manifest.Add([ordered]@{
        recipeId = $recipeId
        title = $title
        fileName = $fileName
        photoCount = $record.photoPaths.Count
        photoPaths = $record.photoPaths
    })
}

$manifestPath = Join-Path $OutputDir '_manifest.json'
$manifest | ConvertTo-Json -Depth 4 | Set-Content $manifestPath
Write-Output "Wrote $sequence recipe files to $OutputDir"
