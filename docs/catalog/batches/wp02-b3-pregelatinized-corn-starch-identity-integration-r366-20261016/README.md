# WP02 Section 04 B3 — pregelatinized corn starch (R366, 2026-10-16)

## Integration record

- **Status:** Integrated on 2026-10-16; see the [proposal](../../proposals/wp02-b3-next-gap-review-r366-20261016.md).
- **Change:** Added identity-only `pregelatinized corn starch / amidon de maïs prégélatinisé` and recorded four product sources plus two reused OQLF terminology sources in the research ledger.
- **Existing row:** Added the source-attested English alias `modified pregelatinized corn starch` to `ingredient-ref-modified-corn-starch`, with the Roquette product evidence linked to that ledger record.
- **Scope:** Kept ordinary corn starch, modified corn starch, high-amylose corn starch, native waxy maize starch, and corn flour identities distinct. The new row has no French aliases, forms, density, unit mappings, recipe links, measurements, conversions, yields, or substitutions. Measurement research remains `researched_no_supported_value`; substitution research remains `researched_no_supported_substitute`.

## Evidence and decision

AGRANA describes a food-grade family of pregelatinized corn starches produced without chemical modification. Roquette separately names PREGEFLO MM as pregelatinized corn starch and PREGEFLO MI 20 A as modified pregelatinized corn starch (E1412). Quadra lists a Canadian-available pregelatinized waxy maize starch, but its listing does not establish the grade's modification status. The product-specific evidence supports the general process-qualified identity while keeping the explicitly modified wording on the existing modified row and the waxy-qualified phrase unassigned.

The French display combines the OQLF preferred generic term `amidon prégélatinisé` with `amidon de maïs`. No reviewed source gives the complete corn-specific French phrase, so the display remains a terminology-based construction. No reusable kitchen measure, density, yield, or substitution ratio was found.

## Picker and recipe impact

- `pregelatinized corn starch` now returns both the general pregelatinized row and modified corn starch through its source-backed alias. `modified pregelatinized corn starch` resolves to the modified row.
- Broad corn-starch searches gain the new process-qualified identity. `waxy corn starch` stays on the native waxy-maize row, and `pregelatinized waxy maize starch` remains unassigned.
- The 114-recipe / 1,123-row bundle has no pregelatinized-corn demand. Existing ordinary cornstarch recipe links and quantities remain unchanged.

## Sources

- AGRANA, [QUEMLITE for Food & Beverages](https://www.agrana.com/products-and-solutions/product/quemlite-for-food-beverages).
- Quadra, [MERIGEL 300 NG Starch](https://www.quadragroup.store/products/merigel-300-ng-starch).
- Roquette, [PREGEFLO MM](https://www.roquette.com/food-nutrition/product-catalog/pregeflo-mm) and [PREGEFLO MI 20 A](https://www.roquette.com/food-nutrition/product-catalog/pregeflo-mi-20-a).
- OQLF, [amidon prégélatinisé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise) and [amidon de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais).

## Validation

- Confirmed source IDs and product URLs were unused before integration; reused OQLF records retain their existing IDs and URLs.
- Bundled seed package normalization and validation passed; research-ledger validation passed with 2,051 records and no errors.
- Verified UTF-8 without BOM and scoped links and whitespace.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change adds database JSON data under `AGENTS.md`.
