from __future__ import annotations

import argparse
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
if str(ROOT) not in sys.path:
    sys.path.insert(0, str(ROOT))


from tools.seed_package.bundled_seed_package import load_seed_package
from tools.seed_package.bundled_seed_package import normalize_ingredient_references
from tools.seed_package.bundled_seed_package import serialize_json
from tools.seed_package.bundled_seed_package import validate_seed_package
from tools.seed_package.bundled_seed_package import write_seed_package


PART_NAME = "ingredientReferences"


def main() -> int:
    parser = argparse.ArgumentParser(
        description="Normalize bundled ingredient reference nomenclature and alias hygiene in place."
    )
    parser.add_argument("--check", action="store_true", help="Report whether the ingredient reference file is already normalized.")
    args = parser.parse_args()

    _, part_paths, payload = load_seed_package()
    payload[PART_NAME] = normalize_ingredient_references(payload[PART_NAME])
    errors = validate_seed_package(payload, part_paths)
    if errors:
        for error in errors:
            print(error)
        return 1

    current_text = part_paths[PART_NAME].read_text(encoding="utf-8")
    normalized_text = serialize_json(payload[PART_NAME])

    if args.check:
        if current_text == normalized_text:
            print("ingredient references are already normalized")
            return 0
        print("ingredient references need normalization")
        return 1

    write_seed_package({PART_NAME: part_paths[PART_NAME]}, payload)
    print(f"normalized {len(payload[PART_NAME])} ingredient references in {part_paths[PART_NAME]}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
