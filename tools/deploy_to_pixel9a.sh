#!/usr/bin/env bash
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
ADB_EXE='/mnt/c/Users/Louise/AppData/Local/Android/Sdk/platform-tools/adb.exe'
APK_PATH_WSL="$REPO_ROOT/app/build/outputs/apk/debug/app-debug.apk"
APK_PATH_WIN="$(wslpath -w "$APK_PATH_WSL")"
APP_ID='app.recipebook'
LAUNCH_ACTIVITY='app.recipebook/.MainActivity'
TARGET_MODEL='model:Pixel_9a'

export GRADLE_USER_HOME="$REPO_ROOT/.gradle-user-home"

run_adb() {
    "$ADB_EXE" "$@"
}

device_lines="$(
    run_adb devices -l |
        tr -d '\r' |
        grep -v '^List of devices attached$' |
        grep -v '^$' |
        grep ' device ' |
        grep "$TARGET_MODEL" |
        grep -v '^emulator-'
)"

device_count="$(printf '%s\n' "$device_lines" | sed '/^$/d' | wc -l)"
if [ "$device_count" -ne 1 ]; then
    echo "Expected exactly one connected physical Pixel 9a, found $device_count." >&2
    printf '%s\n' "$device_lines" >&2
    exit 1
fi

device_serial="$(printf '%s\n' "$device_lines" | awk 'NR==1 { print $1 }')"

cd "$REPO_ROOT"
./gradlew test --no-daemon --console=plain
./gradlew :app:assembleDebug --no-daemon --console=plain

if [ ! -f "$APK_PATH_WSL" ]; then
    echo "APK not found at $APK_PATH_WSL" >&2
    exit 1
fi

run_adb -s "$device_serial" uninstall "$APP_ID" || true
run_adb -s "$device_serial" install "$APK_PATH_WIN"
run_adb -s "$device_serial" shell am start -n "$LAUNCH_ACTIVITY"
