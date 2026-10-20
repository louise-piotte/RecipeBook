#!/usr/bin/env bash
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
ADB_EXE="${RECIPEBOOK_ADB_EXE:-/mnt/c/Users/Louise/AppData/Local/Android/Sdk/platform-tools/adb.exe}"
EMULATOR_EXE='/mnt/c/Users/Louise/AppData/Local/Android/Sdk/emulator/emulator.exe'
AVD_NAME='Pixel_9a'
APK_PATH_WSL="${RECIPEBOOK_APK_PATH:-$REPO_ROOT/app/build/outputs/apk/debug/app-debug.apk}"
if [[ "$ADB_EXE" == *.exe ]]; then
    APK_PATH_DEVICE="$(wslpath -w "$APK_PATH_WSL")"
else
    APK_PATH_DEVICE="$APK_PATH_WSL"
fi
APP_ID="${RECIPEBOOK_APP_ID:-app.recipebook}"
LAUNCH_ACTIVITY="$APP_ID/app.recipebook.MainActivity"

export GRADLE_USER_HOME="$REPO_ROOT/.gradle-user-home"

run_adb() {
    "$ADB_EXE" "$@"
}

find_emulator_serial() {
    run_adb devices -l |
        tr -d '\r' |
        awk '$1 ~ /^emulator-/ && $2 == "device" { print $1 }'
}

emulator_serial="${RECIPEBOOK_EMULATOR_SERIAL:-$(find_emulator_serial | head -n 1)}"

if [ -z "$emulator_serial" ]; then
    powershell.exe -NoProfile -Command "& \"$EMULATOR_EXE\" -avd $AVD_NAME" >/dev/null 2>&1 &

    boot_deadline=$((SECONDS + 180))
    while [ "$SECONDS" -lt "$boot_deadline" ]; do
        emulator_serial="$(find_emulator_serial | head -n 1)"
        if [ -n "$emulator_serial" ]; then
            break
        fi
        sleep 2
    done
fi

if [ -z "$emulator_serial" ]; then
    echo "Unable to find a running Android emulator for AVD '$AVD_NAME'." >&2
    exit 1
fi

boot_completed=""
boot_deadline=$((SECONDS + 180))
while [ "$SECONDS" -lt "$boot_deadline" ]; do
    boot_completed="$(run_adb -s "$emulator_serial" shell getprop sys.boot_completed 2>/dev/null | tr -d '\r[:space:]')"
    if [ "$boot_completed" = "1" ]; then
        break
    fi
    sleep 2
done

if [ "$boot_completed" != "1" ]; then
    echo "Emulator '$emulator_serial' did not finish booting in time." >&2
    exit 1
fi

cd "$REPO_ROOT"
gradle_args=()
if [ -n "${RECIPEBOOK_GRADLE_INIT_SCRIPT:-}" ]; then
    gradle_args+=(-I "$RECIPEBOOK_GRADLE_INIT_SCRIPT")
fi
./gradlew "${gradle_args[@]}" test --no-daemon --console=plain
./gradlew "${gradle_args[@]}" :app:assembleDebug --no-daemon --console=plain

if [ ! -f "$APK_PATH_WSL" ]; then
    echo "APK not found at $APK_PATH_WSL" >&2
    exit 1
fi

run_adb -s "$emulator_serial" install -r "$APK_PATH_DEVICE"
run_adb -s "$emulator_serial" shell am start -n "$LAUNCH_ACTIVITY"
