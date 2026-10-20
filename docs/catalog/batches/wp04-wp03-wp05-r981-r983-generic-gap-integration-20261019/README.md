# WP04/WP03/WP05 R981–R983 generic ingredient integration

Reviewed and integrated on 2026-10-19. The root checked identity, bilingual naming, source ownership, bundled recipe demand, evidence limits, and the all-category catalog scope before changing shared data.

## Dispositions

- **R981, fish skin:** added identity-only `fish skin / peau de poisson` in `PROTEIN`, with empty aliases and no species or processing qualifier. The French display is descriptive, not an officially standardized ingredient term. Health Canada and NOAA document skin-on fish cuts and salmon-specific cooking, while FAO documents detached culinary skin only for named shark species, regions, and preparations. Those claims do not imply universal fish-skin edibility, safety, or legal availability. No measures, forms, recipe links, conversions, yields, or substitutions were added.
- **R982, okra leaves:** added identity-only `okra leaves / feuilles de gombo` in `VEGETABLE_AND_AROMATIC` for food-use leaves of *Abelmoschus esculentus*. Kept the existing immature-pod `okra / gombo` reference, its aliases, and source ownership unchanged. Kew, NCSU Extension, PROSEA, and FAO/INFOODS support the species, culinary use, and bilingual plant-part name. The spinach comparison and food-composition values were not generalized into an alias, substitute, measure, form, or yield.
- **R983, Bashang suancai:** added identity-only `Bashang suancai / Bashang suancai` in `SAUCE_AND_CONDIMENT`, with no aliases. Kept the regional qualifier visible and the French display provisional; do not assign unqualified `suan cai`. The study’s possible vegetables, salt level, cut size, temperature, fermentation period, and analytical results remain study-specific. Preserve the existing Dongbei suancai row and its distinct source evidence. No forms, measures, recipe links, conversions, yields, or active substitutions were added.

## Cross-category scope and preservation

- The fresh open-plan scan across ingredient types found no new task whose sole deliverable was a commercial brand, product-line, flavour-family, SKU, or retailer-variant roster. Such roster-only work remains out of scope because commercial-product counts do not add ingredient diversity. The already dispositioned Section F cereal-roster clauses and named Anson Mills wheat-meal lead remain out of scope; generic ingredient diversity remains open across all categories.
- Existing branded entries and product-specific evidence were left intact. Manufacturer or product pages may support a generic ingredient when the claim applies beyond the named product; no product-specific amount or claim was generalized in this batch.
- The proposals record proposal-stage ownership and demand snapshots. Root review verified their claims against the cited sources before integration.

## Validation

Static reference normalization, bundled package validation, ledger JSON Schema validation, generated-catalog freshness, unique new reference, ledger, and source IDs, source ownership and decision/finding links, form ownership, candidate-name recipe scans, UTF-8/no-BOM and escaped-Unicode checks, local links, and scoped whitespace checks passed at **2,001 references, 205 forms, 55 legacy candidates, 2,406 ledger records, and 114 recipes / 1,123 ingredient rows**. Nine new source IDs were allocated. No software tests or builds were run because the app changes only add database JSON under `AGENTS.md`.

See the [R981 proposal](../../proposals/wp04-section-p-generic-fish-skin-identity-review-r981-20261019.md), [R982 proposal](../../proposals/wp03-section-k-generic-gap-review-r982-20261019.md), and [R983 proposal](../../proposals/wp05-section-w-generic-gap-review-r983-20261019.md).
