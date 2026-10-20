# WP02 A7 R443 / WP04 Section P R444 / WP06 Europe R445 integration

Integrated on 2026-10-17 after root review of [R443](../../proposals/wp02-section-a7-next-gap-review-r443-20261017.md), [R444](../../proposals/wp04-section-p-next-seafood-gap-review-r444-20261017.md), and [R445](../../proposals/wp06-europe-next-gap-review-r445-20261017.md).

## Decisions

- **R443 — spelt semolina:** kept `spelt semolina / semoule d'épeautre` unallocated. Canadian and mill sources support the English product wording, but the exact French product name appears only in a France-market listing; Québec-facing evidence is not strong enough for a bilingual picker identity. No active row, candidate record, alias, form, measure, recipe link, or substitution was added.
- **R444 — popcorn shrimp:** added species-neutral `popcorn shrimp / crevettes popcorn` as `ingredient-ref-popcorn-shrimp` in `PROTEIN`. Kept only the supported search aliases `breaded popcorn shrimp`, `jumbo popcorn shrimp`, `crevette popcorn`, and `crevettes popcorn panées`; SKU-specific size, tail, frozen, and seasoning wording stays out of the aliases and forms. Preserved regular and coconut butterfly shrimp, popcorn corn, and other shrimp identities. No form, reusable measure, conversion, yield, recipe link, or substitution was added.
- **R445 — Grana Padano PDO:** added identity-only `Grana Padano AOP / Grana Padano PDO` as `ingredient-ref-grana-padano-pdo` in `CHEESE`, with no aliases. Kept generic Parmesan, Parmigiano Reggiano, Pecorino Romano, and the other named cheeses distinct. No form, measure, conversion, yield, recipe link, or substitution was added.

## Catalog and recipe effects

- Active ingredient references: **1,739**; ingredient forms: **141**.
- The ledger contains **2,098 records** and **9,533 source entries**. The batch adds two identity records and eleven new source entries; already-recorded OQLF, CFIA, Metro, and neighboring-product source IDs are referenced in the decision records without duplicating source entries.
- All three proposals report no candidate-specific demand in the 114 manifest-listed recipes and 1,123 ingredient rows. Recipe data and links were not changed.
- `popcorn shrimp`, `breaded popcorn shrimp`, `jumbo popcorn shrimp`, `crevettes popcorn`, `crevette popcorn`, and `crevettes popcorn panées` resolve to the new identity. Broad `popcorn` now returns both popped corn and popcorn shrimp. Broad `shrimp` and `crevettes` each gain one result.
- Grana Padano AOP/PDO searches resolve to the new identity. `parmesan` and `fromage parmesan` still resolve only to generic Parmesan; the new row has no aliases.
- R443 changes no picker results; the open A7 checklist records the naming hold for future evidence.

## Validation

- Bundled seed package normalization and validation passed with zero changed package parts; this also validated the research ledger against its schema and catalog ownership rules.
- The generated `BundledIngredientCatalog.kt` index was regenerated for **1,739 references**.
- Seed French text uses explicit Unicode escapes. The edited JSON and generated Kotlin file are UTF-8 without BOM.
- No tests, build, or emulator run was needed because the data changes only add database JSON data; the remaining changes update catalog documentation.

## Snapshot hashes

- References: `798afd6aa45fa8725b81e212b53586c10462491121ae12d5aa24f1b2c30b2351`
- Forms: `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed`
- Research ledger: `04e160b974f41e7bb741e282b75a5b660ca3f0dfecec33ff003866d6d05f8ae9`
- Generated Kotlin index: `09af5cb0202bdbebb33f2ac63773bea62e02061b7af7efd98a3a9ae499c95853`

WP02 A7, WP04 Section P, and WP06 Europe remain open for their other milling, seafood, and regional-identity gaps.
