# WP03 Section I next-gap review: sunflower-seed butter (R370)

**Status:** proposal only; no shared catalog, plan, roadmap, README batch, code, or test files were changed.

## Proposed disposition

Advance the existing `ingredient-ref-sunflower-seed-butter` owner with two common product-name aliases and a bounded formulation review. Add `sunflower butter` (EN) and `beurre de tournesol` (FR) to that reference only. Keep the displays `sunflower seed butter / beurre de graines de tournesol`, category `FAT_AND_OIL`, and the separate whole-seed and oil identities.

Record the reviewed product formulas as SKU-specific evidence in the existing ledger row. The products show meaningful differences in added sugar, salt, and oil. Do not make any one formula the generic definition or add sweetened, unsweetened, organic, salted, or smooth forms. Record Health Canada's source-specific portion weights as measurement observations only; keep `defaultDensity: null` and `unitMappings: []`. Add no recipe link or substitution rule. Keep `substitutionResearchState: not_yet_researched` because no source supports a general replacement ratio or safe culinary interchange.

This is a fresh subgap under Section I's still-open instruction to record added sugar, salt, oil, and stabilizers when they materially affect culinary behavior. R367 already handled almond-butter formulation evidence. The peanut-butter formulation review is separately proposed in R213 and is not repeated here. The existing sunflower-butter identity was accepted in the 2026-10-10 product review, but that review did not compare formulations or add picker aliases.

## Active owner and boundaries

The bundled reference in `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` is `ingredient-ref-sunflower-seed-butter`, with EN display `sunflower seed butter`, FR display `beurre de graines de tournesol`, category `FAT_AND_OIL`, no aliases, and no forms. Its reference has `defaultDensity: null` and no unit mappings. The ledger row has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`.

The ledger already owns the identity under `ingredient-ref-sunflower-seed-butter`. USDA ARS uses `sunflower butter` as an English product name for a seed-based spread [S05], and a Québec retailer attests `beurre de tournesol` [S03]. Reuse the existing product evidence IDs `WP03-PASTE-PRODUCT-20261010-S04` (Nuts to You French catalog) and `WP03-PASTE-PRODUCT-20261010-S09` (Nuts to You product page); do not re-register those URLs. Those sources establish the named Canadian product and one dry-roasted-seed-plus-oil formula, not a universal formula. The adjacent `ingredient-ref-sunflower-seeds` owns whole seeds and the FR singular alias `graine de tournesol`; `ingredient-ref-sunflower-oil` owns the oil and its seed-oil aliases. No matching sunflower/tournesol legacy candidate was found. Keep butter terminology off the whole-seed and oil owners.

At the review snapshot, the package contains 1,695 ingredient references, 140 forms, 56 legacy candidates, and a research ledger with 2,051 records and 9,222 source entries. The bundled corpus has 114 recipes and 1,123 ingredient rows.

## Recipe demand and picker effect

A full search of the bundled recipe files and ingredient rows found no occurrences of `sunflower seed butter`, `sunflower butter`, `beurre de graines de tournesol`, or `beurre de tournesol`. There is no current recipe demand or line to link. The aliases are a small discoverability improvement for the existing product identity, not a reason to alter recipes.

The picker applies accent-folded phrase matching. Static projection against the current owner terms gives:

| Query | Current result | Proposed result |
| --- | --- | --- |
| `sunflower seed butter` | `ingredient-ref-sunflower-seed-butter` | Same |
| `beurre de graines de tournesol` | `ingredient-ref-sunflower-seed-butter` | Same |
| `sunflower butter` | No result | `ingredient-ref-sunflower-seed-butter` through EN alias |
| `beurre de tournesol` | No result | `ingredient-ref-sunflower-seed-butter` through FR alias |
| `sunflower seeds` | `ingredient-ref-sunflower-seeds` | Same |
| `graines de tournesol` | Whole-seed and butter references | Same; retain the existing phrase overlap |
| `sunflower oil` | `ingredient-ref-sunflower-oil` | Same |

OQLF's GDT entry supports `graine de tournesol` as the seed term; it does not prescribe a name for the prepared butter. The proposed short French alias is supported by a Québec retailer's French product listing, so describe it as attested retail wording rather than an OQLF recommendation.

## Formulation evidence

The three new manufacturer/retailer sources were checked on 2026-10-16. They demonstrate product variation, not interchangeable generic recipes:

| Product evidence | Formula shown | Boundary |
| --- | --- | --- |
| Nuts to You Sunflower Seed Butter Smooth [existing S09] | Dry-roasted Canadian sunflower seeds and sunflower oil; the product page says no added salt, sugar, or hydrogenated oil. | Existing Canadian formula; retain as SKU-specific evidence. |
| SunButter Canada No Sugar Added [S01] | Roasted sunflower seeds and salt; page states 0 g added sugars. The page showed the item sold out online when reviewed. | A no-added-sugar product can still contain salt. Do not infer current availability. |
| SunButter Canada Original [S02] | Roasted sunflower seeds, sugar, and salt; page states 3 g added sugars per serving. The page showed the item sold out online when reviewed. | Formula and nutrition claim apply to this listed SKU; do not infer current availability. |
| Maison Jacynthe, `Beurre de tournesol biologique` [S03] | Organic dry-roasted sunflower seeds and sunflower oil; listing says no added salt, sugar, or hydrogenated oil. | Attests the short French product wording and one organic product. Do not create an organic form or treat package size as a recipe measure. |

These examples show that sugar and salt can differ and that oil may be added. The proposal should record those exact product statements with their source IDs. They do not support one default formula, a universal stabilizer rule, or a form split. Leave `SunButter` as a brand name, not a generic alias.

## Numeric and substitution limits

Health Canada's Canadian Nutrient File lists food code 2529 as `Seeds, sunflower seed butter / Graines, beurre de tournesol` and provides these portion weights: 15 mL = 16.2 g, 30 mL = 32.4 g, and 100 mL = 108.1 g [S04]. Recommend recording each as a `portion_weight` observation under the existing butter ledger row, with the CNF food code and exact source basis. This is sufficient to change that row's measurement state to `researched_supported` for documented source portions only. It does not support an identity-wide density, cup conversion, product-form equivalence, or app mapping; keep `defaultDensity` null and `unitMappings` empty. Do not transfer these figures to whole seeds or sunflower oil.

The product pages and CNF entry supply no recipe-specific alternative, ratio, adjustment, or method constraint. Keep `substitutionResearchState: not_yet_researched`; add no global form conversion or contextual ingredient substitution.

## Proposed ledger sources and uniqueness check

The following five new source IDs and URLs were checked against the current research ledger and proposal/batch archive. No ID or URL collision was found. The already-owned Nuts to You sources remain referenced by their existing IDs above.

| ID | Source and evidence to record |
| --- | --- |
| `WP03-I-SUNFLOWER-BUTTER-R370-20261016-S01` | SunButter Canada, [No Sugar Added SunButter](https://sunbutter.com/products/canadian-no-sugar-added-sunbutter%C2%AE-sunflower-butter). Ingredient list and added-sugar statement; product page showed sold out online at review. Formula evidence only. |
| `WP03-I-SUNFLOWER-BUTTER-R370-20261016-S02` | SunButter Canada, [Original SunButter](https://sunbutter.com/products/canadian-original-sunbutter%C2%AE-sunflower-butter). Ingredient list and added-sugar statement; product page showed sold out online at review. Formula evidence only. |
| `WP03-I-SUNFLOWER-BUTTER-R370-20261016-S03` | Maison Jacynthe, [Beurre de tournesol biologique](https://maisonjacynthe.ca/products/beurre-de-tournesol-bio-500g). Québec French product wording and SKU ingredient list. |
| `WP03-I-SUNFLOWER-BUTTER-R370-20261016-S04` | Health Canada, [Canadian Nutrient File serving portions, food code 2529](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2529). Exact bilingual food name and source-specific portion weights. |
| `WP03-I-SUNFLOWER-BUTTER-R370-20261016-S05` | USDA Agricultural Research Service, [Sunflower Butter](https://www.ars.usda.gov/is/br/sunbutter/sunbutter.pdf), November 2010. Uses “sunflower butter” as a product name for a spread made from sunflower seeds. |

## Proposed integration boundary

1. Add only `sunflower butter` and `beurre de tournesol` as aliases on `ingredient-ref-sunflower-seed-butter`.
2. Add S01–S05 to that same ledger row and append the three exact CNF portion observations. Set `measurementState: researched_supported` only for those supported observations; keep active density/mappings empty and substitution research untouched.
3. Preserve the current display names, category, no-form state, and separation from whole seeds and oil. Add no candidate, legacy row, recipe link, form, default formula, conversion, yield, or substitution rule.

Section I remains open for other nut/seed form coverage and formulation review.

## Sources

- OQLF, [GDT: graine de tournesol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015064/graine-de-tournesol) — seed terminology only; not a prepared-butter naming ruling.
- Reuse existing ledger sources `WP03-PASTE-PRODUCT-20261010-S04` and `WP03-PASTE-PRODUCT-20261010-S09` from the Nuts to You French catalog and product page, respectively.
- New sources S01–S05 are listed above; accessed 2026-10-16.
