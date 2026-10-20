#!/usr/bin/env python3
"""Generate the import audit's Kotlin reference index from the canonical split seed catalog."""

from __future__ import annotations

import argparse
import json
import sys
from pathlib import Path
from typing import Any


REPO_ROOT = Path(__file__).resolve().parents[2]
SOURCE_PATH = REPO_ROOT / "app/src/main/assets/seed/bundled-library/ingredient-references.v1.json"
OUTPUT_PATH = REPO_ROOT / "app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt"
REFERENCES_PER_CHUNK = 64


def kotlin_string(value: str) -> str:
    # JSON string syntax is compatible with Kotlin strings for the characters emitted here.
    return json.dumps(value, ensure_ascii=False).replace("$", r"\$")


def kotlin_number(value: int | float) -> str:
    rendered = repr(value)
    return f"{rendered}.0" if isinstance(value, int) else rendered


def reference_chunks(references: list[dict[str, Any]]) -> list[list[dict[str, Any]]]:
    return [
        references[start:start + REFERENCES_PER_CHUNK]
        for start in range(0, len(references), REFERENCES_PER_CHUNK)
    ]


def render_reference(reference: dict[str, Any], is_last: bool) -> list[str]:
    suffix = "" if is_last else ","
    lines = [
        "        IngredientReference(",
        f"            id = {kotlin_string(reference['id'])},",
        f"            nameFr = {kotlin_string(reference['nameFr'])},",
        f"            nameEn = {kotlin_string(reference['nameEn'])},",
        f"            category = IngredientCategory.{reference['category']},",
        f"            aliasesFr = listOf({', '.join(kotlin_string(value) for value in reference.get('aliasesFr', []))}),",
        f"            aliasesEn = listOf({', '.join(kotlin_string(value) for value in reference.get('aliasesEn', []))}),",
        f"            defaultDensity = {kotlin_number(reference['defaultDensity']) if reference.get('defaultDensity') is not None else 'null'},",
    ]
    mappings = reference.get("unitMappings", [])
    if mappings:
        lines.append("            unitMappings = listOf(")
        for mapping_index, mapping in enumerate(mappings):
            mapping_suffix = "," if mapping_index < len(mappings) - 1 else ""
            lines.append(
                "                IngredientUnitMapping("
                f"{kotlin_string(mapping['fromUnit'])}, {kotlin_string(mapping['toUnit'])}, "
                f"{kotlin_number(mapping['factor'])}){mapping_suffix}"
            )
        lines.append("            ),")
    else:
        lines.append("            unitMappings = emptyList(),")
    lines.extend([
        f"            updatedAt = {kotlin_string(reference['updatedAt'])}",
        f"        ){suffix}"
    ])
    return lines


def render_catalog(references: list[dict[str, Any]]) -> str:
    chunks = reference_chunks(references)
    lines = [
        "package app.recipebook.data.local.recipes",
        "",
        "import app.recipebook.domain.model.IngredientCategory",
        "import app.recipebook.domain.model.IngredientReference",
        "import app.recipebook.domain.model.IngredientUnitMapping",
        "",
        "/** Generated from the canonical bundled seed catalog in bounded chunks; regenerate instead of editing. */",
        "internal object BundledIngredientCatalog {",
        "    val references: List<IngredientReference> = buildReferences()",
        "",
        "    private fun buildReferences(): List<IngredientReference> = buildList {"
    ]
    for chunk_index in range(len(chunks)):
        lines.append(f"        addAll(referenceChunk{chunk_index:02d}())")
    lines.extend(["    }", ""])

    for chunk_index, chunk in enumerate(chunks):
        lines.append(
            f"    private fun referenceChunk{chunk_index:02d}(): List<IngredientReference> = listOf("
        )
        for reference_index, reference in enumerate(chunk):
            lines.extend(render_reference(reference, reference_index == len(chunk) - 1))
        lines.extend(["    )", ""])

    lines.extend(["}", ""])
    return "\n".join(lines)


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--check", action="store_true", help="fail if the generated Kotlin file is stale")
    args = parser.parse_args()

    references = json.loads(SOURCE_PATH.read_text(encoding="utf-8"))
    if any(not reference.get("category") for reference in references):
        print("canonical ingredient references must have explicit categories", file=sys.stderr)
        return 1
    generated = render_catalog(references)
    current = OUTPUT_PATH.read_text(encoding="utf-8") if OUTPUT_PATH.exists() else None
    if args.check:
        if current != generated:
            print(f"generated catalog is stale: {OUTPUT_PATH.relative_to(REPO_ROOT)}", file=sys.stderr)
            return 1
        print(f"generated catalog is current ({len(references)} references)")
        return 0
    OUTPUT_PATH.write_text(generated, encoding="utf-8", newline="\n")
    print(f"generated {OUTPUT_PATH.relative_to(REPO_ROOT)} ({len(references)} references)")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
