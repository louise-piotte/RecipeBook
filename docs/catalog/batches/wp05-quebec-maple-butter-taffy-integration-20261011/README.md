# Québec maple butter and maple taffy — 2026-10-11

## Integrated identities

- Added `maple butter / beurre d’érable` as a `SUGAR_AND_SWEETENER` reference with only the English aliases `maple cream` and `maple spread`. OQLF defines it as a spread made from maple syrup and lists those English terms. Érable du Québec states that its maple butter contains no dairy and is derived from maple sap. Keep it separate from dairy butter and the existing maple syrup and maple sugar identities.
- Added `maple taffy / tire d’érable` as a separate `SUGAR_AND_SWEETENER` reference. OQLF distinguishes the pure maple-syrup confection `tire d’érable` from glucose-containing `tire à l’érable` / `maple taffy blend`. Do not alias the specific Québec product to generic `taffy`, `maple wax`, `maple toffee`, or a snow-service phrase.
- The 114-recipe / 1,123-row corpus has no matching maple-butter or maple-taffy ingredient line. No recipe links, forms, measurements, density, unit mappings, conversions, yields, or substitutions were added.

## Evidence

- [OQLF, beurre d’érable](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358380/beurre-derable) defines the maple spread and lists `maple butter`, `maple cream`, and `maple spread`; the entry also describes its maple-only product boundary.
- [Érable du Québec, Beurre d’érable](https://erableduquebec.ca/produits/beurre-derable/) says the product contains no butter or dairy, is derived from maple sap, and is used as a culinary topping and ingredient.
- [OQLF, tire d’érable](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8871557/tire-derable) gives the Québec term, English `maple taffy`, and the distinction from glucose-containing `tire à l’érable` / `maple taffy blend`.
- [Érable du Québec, Tire d’érable](https://erableduquebec.ca/produits/tire-derable/) lists the product and describes current Québec uses beyond serving it on snow.

The OQLF entries include process temperatures and composition limits, but this batch uses them only to define product identity and boundaries. No numeric values were copied into the catalog or ledger.

## Validation

- 1,026 ingredient references, 70 forms, 114 recipes / 1,123 ingredient rows.
- 1,313 ledger records, 4,250 source entries, 3,488 distinct source IDs, and 8 unit conversions.
- Bundled package and ledger schema validation, ingredient-reference normalization, and generated-catalog freshness passed. The relevant database JSON is UTF-8 without BOM or mojibake and uses explicit Unicode escapes.
- No tests or emulator run were performed because this change only adds ingredient-catalog data to database JSON, as directed in `AGENTS.md`.

## Artifact hashes

- `ingredient-references.v1.json`: `84cab1720518bd6e5a72af4e02e0b61bc1f24c447b80bb7acfcabf540ab2935c`
- `research-ledger.v1.json`: `1c8bc75f4567faa40a569182a988598964d91c8f303e05daf53edb11d0946a47`
- generated `BundledIngredientCatalog.kt`: `2dd0495df0a55942f692b92832b366d8f2aff26dea93cc834301c72e2f2d92b5`
