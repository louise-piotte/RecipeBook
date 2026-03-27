from __future__ import annotations

import argparse
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
if str(ROOT) not in sys.path:
    sys.path.insert(0, str(ROOT))


from tools.seed_package.bundled_seed_package import load_seed_package
from tools.seed_package.bundled_seed_package import normalize_seed_package
from tools.seed_package.bundled_seed_package import serialize_json
from tools.seed_package.bundled_seed_package import validate_seed_package
from tools.seed_package.bundled_seed_package import write_seed_package


def main() -> int:
    parser = argparse.ArgumentParser(
        description="Normalize and validate the bundled seed package in app/src/main/assets/seed/bundled-library."
    )
    parser.add_argument("--check", action="store_true", help="Fail if any seed-package part is not normalized.")
    parser.add_argument("--validate-only", action="store_true", help="Validate without rewriting files.")
    args = parser.parse_args()

    _, part_paths, payload = load_seed_package()
    normalized_payload = normalize_seed_package(payload)
    errors = validate_seed_package(normalized_payload, part_paths)
    if errors:
        for error in errors:
            print(error)
        return 1

    changed_parts = [
        part_name
        for part_name, path in part_paths.items()
        if path.read_text(encoding="utf-8") != serialize_json(normalized_payload[part_name])
    ]

    if args.validate_only:
        print("bundled seed package is valid")
        return 0

    if args.check:
        if changed_parts:
            print("bundled seed package needs normalization:")
            for part_name in changed_parts:
                print(f"- {part_name}")
            return 1
        print("bundled seed package is already normalized")
        return 0

    write_seed_package(part_paths, normalized_payload)
    print(f"normalized bundled seed package ({len(changed_parts)} changed part(s))")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
