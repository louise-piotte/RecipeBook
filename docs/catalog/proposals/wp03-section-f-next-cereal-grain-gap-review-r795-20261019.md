# WP03 Section F R795 — Red River Cream of Whole Wheat bilingual identity recheck (2026-10-19)

## Review record

- **Status:** Integrated on 2026-10-19 as an identity-only reference; the earlier R175 French-name hold is resolved. See the [R794–R796 integration README](../batches/wp02-wp03-wp04-r794-r796-gap-review-integration-20261019/README.md). No software tests were run after integration because the database change only adds JSON data, per `AGENTS.md`.
- **Open checklist:** The Section F item “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” remains open at [the global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4921).
- **Selected gap:** Recheck the held Red River Cream of Whole Wheat cereal identity from R175. R175 kept it outside active data pending a process-matched Québec French name ([R175 proposal](wp03-section-f-red-river-cream-whole-wheat-product-boundary-review-r175-20261016.md), [R175 integration record](../batches/wp02-wp03-wp04-r175-boundary-hold-integration-20261016/README.md); current hold at [plan line 20518](../../RecipeBook-global-ingredient-catalog-plan.txt#L20546)). This review addresses that exact gap; it is distinct from R789 Quaker Squares and R792 Kellogg’s Krave.
- **Recommendation:** Accept one identity-only `GRAIN_AND_CEREAL` reference. New, product-matched French evidence is available in Arva’s French Red River collection and a Canadian French retail listing. Keep the former hold's boundaries on measures, density, aliases, and substitutions.
- **Current snapshot:** 1,879 ingredient references, 197 forms, 56 legacy-import candidates, and 2,285 research-ledger records. The manifest contains 114 recipe files with 1,123 ingredient rows.

## Product scope and proposed bilingual identity

Arva’s current product page names **Red River Cream of Whole Wheat Cereal**, calls it a hot cereal, describes a 100% hard red winter wheat product, and says the mill extracts small midlings (farina) at the first and second breaks while leaving bran particles in the product [S01]. The current English manufacturer collection lists it separately from Original Red River cereal and Red River 7 Grain Hot Cereal [S02]. The French Arva collection lists `Céréales Red River CRÈME DE BLÉ ENTIER 908 g (non originales)` as a separate item; a French Canadian Walmart listing uses `Red River Céréales chaudes à la crème de blé entier` for its five-bag package [reused source; S03].

| Proposed field | Value |
|---|---|
| Reference ID | `ingredient-ref-red-river-cream-of-whole-wheat-cereal` |
| English display | `Red River Cream of Whole Wheat cereal` |
| French display | `Céréales chaudes Red River à la crème de blé entier` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None |
| Density / unit mappings | `null` / `[]` |

Use the French retailer phrase as current Canadian French product wording, corroborated by the manufacturer’s French product list. It is not an OQLF or TERMIUM ruling. Keep this as the named Red River hot-cereal product, separate from `ingredient-ref-cream-of-wheat-hot-cereal` (`cream of wheat hot cereal / crème de blé`), Original Red River cereal, Red River 7 Grain, the wheat, bran and farina references, and the component ingredients in any composite cereal. Do not infer equivalence from “cream of wheat” in customer reviews or shared breakfast use.

## Catalog ownership and picker effects

The active references already include the generic cream-of-wheat hot cereal, Original Red River cereal, and Red River 7 Grain Hot Cereal. Exact candidate-ID and title checks found no current reference, form, legacy identity, or dedicated ledger record for this product. No form or substitution rule names the candidate. The reference and form files, legacy identities, and all ledger text were searched for the proposed ID, exact bilingual phrases, and close spellings.

| Query | Current results | Projected with the proposed display | Notes |
|---|---:|---:|---|
| `Red River` | 2 | 3 | Adds Cream of Whole Wheat alongside Original and 7 Grain, matching the three cereal products in Arva’s current lineup. |
| `Red River Cream of Whole Wheat` | 0 | 1 | Resolves the exact English product request. |
| `cream of whole wheat` | 0 | 1 | Product-qualified wheat fraction. |
| `cream of wheat` | 1 | 1 | Continues to resolve to the generic cream-of-wheat reference; `whole` interrupts this phrase in the new English display. |
| `crème de blé` | 1 | 2 | Shows the generic product and the explicitly whole-wheat Red River product as separate choices. |
| `crème de blé entier` | 0 | 1 | Resolves the product-qualified French wording. |

This projection follows the phrase-first matching behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt); it is static analysis, not a live picker test. Add no aliases such as `cream of wheat`, `crème de blé`, `farina`, `midlings`, `Red River hot cereal`, or component names. `Red River` already occurs in the complete product display and will correctly return the three named products; no family alias is needed.

## Bundled-recipe demand

I parsed all 114 recipe files listed in the manifest and scanned all 1,123 ingredient rows and complete recipe text for the proposed identity, the R175 candidate phrases, the French product wording, `farina`, and `midlings`. There were **zero recipe-file hits, zero ingredient-row hits, and zero direct links**. No recipe relink, text change, or recipe-specific measure is proposed.

## Measurement and substitution boundaries

- The manufacturer’s 908 g figure is package net mass, not a portion. Its page provides no serving mass, mass/volume pair, or density. A customer review mentions one person's cooking quantities, but that is not a manufacturer instruction, direct measurement, reusable household measure, or product substitution; exclude it.
- Arva’s separate [general hot-cereal instructions](https://arvaflourmills.com/blogs/recipes/arva-flour-mills-hot-cereal-cooking-instructions) list oats, Scotch oatmeal, Arva 8 Grain, and oat groats, but not this Red River Cream of Whole Wheat product. Do not transfer their per-serving quantities or water ratios to it.
- If integrated, record `measurementState: researched_no_supported_value`; add no measurement observation, form, default density, unit mapping, conversion, yield, or package-yield rule.
- Arva’s separate [Red River Cereal Quick Bread](https://arvaflourmills.com/blogs/recipes/red-river-cereal-quick-bread) labels its ingredient `Red River Cereal (cooked)` and allows `Red River Cereal (or granola)` in that formula. That is an Original Red River recipe; it does not name Cream of Whole Wheat or establish a substitute for it. Do not transfer the formula-specific alternative to this product.
- No reviewed product-matched source recommends replacing this Cream of Whole Wheat product with Original Red River, 7 Grain, generic cream of wheat, or another ingredient. If integrated, record `substitutionResearchState: researched_no_supported_substitute`; add no global or contextual rule and no recipe-line link.
- Do not interpret the milling description’s parenthetical `farina` as a retail alias or imply that the product is equivalent to flour, wheat middlings, semolina, or a standalone farina product.

## Source register and ownership

The new IDs below are proposal-local and were checked against the current ledger and archive. R175’s manufacturer-page source ID was never registered because that proposal held the candidate; this recheck assigns a new source ID to the same product URL. The French collection URL is already owned as `WP03-REDRIVER-20261012-S06` on `ingredient-ref-red-river-cereal`; reuse that ID and retain its owner rather than registering the same URL again.

| Source ID | Source and evidence | Limits / ownership |
|---|---|---|
| `WP03-RR-COWW-R795-20261019-S01` | Arva Flour Mills, [Red River CREAM OF WHOLE WHEAT Cereal 908 g (Not Original)](https://arvaflourmills.com/products/red-river-cream-of-whole-wheat-cereal-908g), accessed 2026-10-19. Direct current manufacturer product page. | Identifies the product, 908 g package, 100% hard red winter wheat, and its milling description. Does not state a serving or household measure. |
| `WP03-RR-COWW-R795-20261019-S02` | Arva Flour Mills, [Red River Cereal collection (English)](https://arvaflourmills.com/collections/red-river-cereal), accessed 2026-10-19. | Current collection at lines 97–98, 140–148 lists Original, 7 Grain, and Cream of Whole Wheat as separate cereal products. Package bundles and apparel are not separate ingredient identities. |
| Reuse `WP03-REDRIVER-20261012-S06` | Arva Flour Mills, [Céréales Red River collection (French)](https://arvaflourmills.com/fr/collections/red-river-cereal), rechecked 2026-10-19. | The current indexed French collection lists `Céréales Red River CRÈME DE BLÉ ENTIER 908 g (non originales)` beside Original and 7 Grain. Direct web opening returned a cache miss; preserve the existing source ID and extend its locator/support if integrated. |
| `WP03-RR-COWW-R795-20261019-S03` | Walmart Canada, [Red River Céréales chaudes à la crème de blé entier, 908 g, lot de 5](https://www.walmart.ca/fr/ip/Red-River-C-r-ales-Chaudes-la-Cr-me-de-Bl-Entier-908-g-Lot-de-5-Livraison-Gratuite-au-Canada/4CAGI1SCMQ2O), French listing, checked 2026-10-19. | Search-indexed Canadian French product title and description identify the same Arva product and 5 × 908 g package. Direct web opening returned a cache miss. Use for wording corroboration only; it does not establish store stock or a Québec-specific point of sale. |

The English collection and product-page URLs and the Walmart URL had no exact ledger owner at review time. No source ID uses the `WP03-RR-COWW-R795-20261019-` prefix. The manufacturer French collection remains the sole reused URL and source ID.

## Precise proposed delta

If accepted, add only `ingredient-ref-red-river-cream-of-whole-wheat-cereal` with the bilingual displays above, empty aliases, null density, and empty unit mappings. Add one verified `ingredient_reference` research-ledger record with the source entries above, no measurement observations, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Preserve all three existing neighboring rows and their current owners. Add no form, recipe link, yield, conversion, or substitution.

## Proposal-only checks

- [x] Read `AGENTS.md`, the open Section F item, the R175 hold and integration record, and the current reference/form/legacy/ledger data before rechecking this exact candidate.
- [x] Audited exact active names/aliases, forms, ledger records, existing source-URL ownership, both substitution files, package yields, and the 114-file manifest recipe corpus.
- [x] Reopened the current English manufacturer product and collection pages; checked the manufacturer’s French collection listing and current Canadian French retailer result, recording cache-miss limitations where the web reader could not open a page directly.
- [x] Projected phrase-first picker behavior and kept product package mass, user-review cooking quantities, component milling terminology, and any assumed swaps out of reusable data.
- **No software tests, build, emulator checks, or deployment were run.** This proposal changes documentation only; no database JSON or executable code changed.
