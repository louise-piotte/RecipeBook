# WP03 Section I — almond-butter formulation evidence (R367, 2026-10-16)

## Integration record

- **Status:** Integrated on 2026-10-16; see the [proposal](../../proposals/wp03-section-i-next-gap-review-r367-20261016.md).
- **Change:** Verified the existing `almond butter / beurre d'amande` identity in the research ledger with five sources and one accepted decision.
- **Scope:** Kept the active reference, category, empty alias arrays, empty forms, recipes, measurement behavior, and substitution behavior unchanged. `measurementState` remains `blocked_pending_evidence`; `substitutionResearchState` remains `not_yet_researched`.

## Evidence and decision

The Québec Food Directory and Mille et Une Noix maker page support the existing bilingual almond-butter naming. The Québec directory lists one organic creamy SKU with an almonds-only ingredient declaration and a 1 tablespoon (15 g) nutrition panel. The maker explains that this product's natural oil can separate because no stabilizer is used. Barney Butter's smooth SKU includes palm fruit oil but no added sugar or salt; its crunchy SKU lists cane sugar, palm fruit oil, and sea salt. These are separate product formulas, not formulas for all almond butter.

The USDA Agricultural Marketing Service procurement specification A-A-20328C allows multiple almond-butter ingredients and separately lists texture, stabilization, and seasoning options. It provides a structured example of variation within the identity, but it is a U.S. procurement specification rather than a Canadian retail standard. Together, the sources justify recording product-specific formulation evidence while leaving these choices out of global aliases, forms, conversions, and substitutions.

## Picker and recipe impact

- No aliases or forms were added, so the existing picker ownership remains unchanged.
- Recipes `031#9`, `040#4`, and `070#14` continue to link their unqualified almond-butter lines to `ingredient-ref-almond-butter`; original text and amounts are unchanged.
- The directory's 1 tablespoon (15 g) panel is specific to one product and does not support a reusable density or cup-to-mass mapping. No recipe equivalence or substitution is established.

## Sources

- [Québec Food Directory — Organic creamy almond butter](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207930), product sheet (last updated 2025-02-11).
- [Mille et Une Noix — Beurre d’amande crémeux biologique](https://www.milleetunenoix.ca/products/organic-creamy-almond-butter).
- [Barney Butter — Bare Smooth Almond Butter](https://barneybutter.com/products/bare-smooth-almond-butter).
- [Barney Butter — Crunchy Almond Butter](https://barneybutter.com/products/crunchy-almond-butter).
- USDA Agricultural Marketing Service, [Nut Butters and Nut Spreads, A-A-20328C](https://www.ams.usda.gov/sites/default/files/media/NutButtersNutSpreads.pdf), Sections 3, 6.1.1, 6.3.1.2, and 6.4.1–6.4.2.

## Validation

- Confirmed that the five new source IDs and URLs were unused in the ledger and archive before integration.
- Validated the updated research-ledger JSON and schema, UTF-8/no-BOM encoding, local links, and scoped whitespace.
- No software tests, Gradle tasks, emulator checks, or deployment were run because this change only adds research data to database JSON and updates documentation under `AGENTS.md`.
