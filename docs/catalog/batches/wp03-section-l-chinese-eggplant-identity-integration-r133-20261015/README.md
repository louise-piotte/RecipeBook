# WP03 Section L R133 — Chinese eggplant integration

## Decision

Added identity-only `Chinese eggplant / aubergine chinoise` as `ingredient-ref-chinese-eggplant` in `VEGETABLE_AND_AROMATIC`, with empty alias lists. The name is tied to Metro's current bilingual product 3089; the older OQLF description is retained for Québec terminology and the fact that Chinese and Japanese eggplants are separately named, not used to infer Metro's cultivar. The two pages are one listing, not independent samples.

Metro's displayed 200 g average is stored only as a product-specific ledger estimate. Its older grilled-eggplant recipe's Chinese-or-two-large-regular option is stored only as a single-dish ledger finding. Neither becomes a reusable count measure or active substitution. No forms, recipe links, conversions, yields, or active rules were added. The bundled recipes have no Chinese-eggplant subtype demand.

## Evidence and review

The proposal documents the discrepancy and picker boundary: [R133 Chinese-eggplant review](../../proposals/wp03-section-l-chinese-eggplant-identity-review-20261015-r133.md). Root independently rechecked [OQLF's aubergine entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine), [Metro Québec product 3089](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/aubergine-chinoise/p/3089), and Metro's [indexed recipe ingredient line](https://api.metro.ca/en/recipes-occasions/recipes/marinated-sea-trout-and-grilled-eggplant-with-garlic-oil).

## Static verification

- Reference and ledger schema validation passed.
- Bundled package semantic validation and normalization checks passed.
- Generated ingredient index is current at 1,486 references.
- Static picker projection returns the proposed row for both bilingual qualified names; generic `eggplant` / `aubergine` returns the general and named rows.
- Ingredient-field scan found 0 subtype matches across 114 manifest-listed recipes / 1,123 ingredient rows.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.

No app, Gradle, unit, instrumentation, emulator, or deployment tests were run because this change adds database JSON data and refreshes its generated index under `AGENTS.md`. Section L remains open.
