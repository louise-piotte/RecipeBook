# WP03 Section F R804 — Love Crunch Dark Chocolate & Coconut identity review (2026-10-19)

## Decision summary

- **Open parent:** “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” remains open in the [Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4925). The integrated [R800–R802 batch](../batches/wp02-wp03-wp04-r800-r802-gap-review-integration-20261019/README.md) already adds the distinct Love Crunch Red Berries variant; this review selects the Coconut product by its separate name and UPC.
- **Recommendation:** Add one identity-only bilingual `GRAIN_AND_CEREAL` reference for **Love Crunch Organic Dark Chocolate & Coconut Granola / Granola avec noix de coco et chocolat noir biologique, Love Crunch**. This is one product, not a complete Love Crunch roster.
- **Product match:** Nature’s Path’s Canada product page uses the English product name. Its indexed product-image filename includes `058449772019-772012`; Metro’s Québec French product listing pairs product number `058449772019` with the French display wording and a 325 g package. That number differs from R801’s Red Berries UPC `058449771760`.
- **Scope:** Keep this finished granola distinct from generic granola, coconut, oats, dark chocolate, and other cereal products. Add no aliases, forms, measurements, package-yield observations, component or recipe links, conversions, or substitutions. Package sizes and the retailer’s 325 g listing are identity evidence only, not recipe measures.
- **Identifiers:** `R804-CANDIDATE`, `R804-S01`, and `R804-S02` below are proposal-local handles only. No shared catalog, source, or ledger ID is reserved.

## Evidence and product boundary

Nature’s Path’s current Canada-region page is titled **Love Crunch Organic Dark Chocolate & Coconut Granola**. It describes crunchy granola clusters with coconut and dark chocolate and lists six-packs in 700 g and 325 g sizes. The page marks the offer sold out. Its indexed product-image filename includes `058449772019-772012`; the page’s parsed text does not expose the number separately, so the product-code match is corroborated by the Metro listing below rather than treated as visible page text. This manufacturer page supports the named finished-product identity, not a household measure, ingredient proportions, or availability at a particular retailer. [R804-S01]

Metro’s Québec French product result is titled **Granola avec noix de coco et chocolat noir biologique, Love Crunch** and identifies product number `058449772019` and a 325 g package. Its description names Nature’s Path and the same coconut-and-dark-chocolate granola blend. The French API listing was returned in the current search index, but direct page opening was unavailable in the browser tool; treat the exact French wording and number as indexed listing evidence. Product availability is store- and time-dependent, so this review makes no current stock or price claim. [R804-S02]

The two product codes distinguish this candidate from the already integrated Red Berries reference: Coconut `058449772019` versus Red Berries `058449771760`. The manufacturer also displays the two as separately named products. Do not broaden this review into another Love Crunch variant or a family roster. [R804-S01; R801]

| Proposal-local handle | Source and evidence | Limit |
|---|---|---|
| **R804-S01** | Nature’s Path, [Love Crunch Organic Dark Chocolate & Coconut Granola](https://naturespath.com/en-ca/products/dark-chocolate-and-coconut-granola-lc-ca), Canada-region product page, checked 2026-10-19. Product heading, coconut/dark-chocolate description, six-pack sizes, and sold-out notice; indexed image filename includes `058449772019-772012`. | The parsed page does not separately show the product number or a single serving. Do not infer a measure, stock status elsewhere, or complete family roster. |
| **R804-S02** | Metro Québec, [Granola avec noix de coco et chocolat noir biologique, Love Crunch](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/granola-avec-noix-de-coco-et-chocolat-noir-biologique/p/058449772019), French indexed product result, checked 2026-10-19. French product wording, product number `058449772019`, and 325 g package. | Search-index evidence only because direct opening of the French API URL failed in the browser tool. Do not claim local store availability or current price. |

## Exact ownership audit

The integrated R800–R802 snapshot has **1,883 references**, **198 forms**, **56 legacy-import candidates**, and **2,290 research-ledger records**. Exact searches for candidate wording, the French listing name, and UPC `058449772019` found no Coconut-product owner in references, forms, legacy candidates, or ledger records. The only related active identity is the R801 Red Berries reference and its ledger row; its product code is different.

| Surface | Candidate-specific result | Related ownership and boundary |
|---|---|---|
| Ingredient references | No Coconut name or UPC. | R801 owns only the bilingual Red Berries identity; generic granola and its component ingredients remain separate. |
| Ingredient forms | No Coconut label, match term, or UPC. | No form distinction is needed for this branded finished product. |
| Legacy-import identities | No exact candidate phrase or UPC among 56 rows. | No historical identity needs reconciliation. |
| Research ledger | No Coconut product phrase, UPC, or product-specific source URL among 2,290 records. | R801 is the one related Love Crunch identity. Its manufacturer collection URL, `https://naturespath.com/en-ca/collections/love-crunch`, is already owned under source `WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S04`; do not allocate a duplicate collection source. The candidate-specific Nature’s Path and Metro URLs above have no ledger owner. |
| Proposals and batches | No earlier focused proposal or batch for UPC `058449772019` was found. | [R801](wp03-section-f-love-crunch-red-berries-identity-review-r801-20261019.md) and the R800–R802 README cover Red Berries only, with no claim of a complete Love Crunch roster. |

The candidate-specific source handles above are local review labels, not proposed shared source IDs. If accepted, integration can add the two product-specific sources to one identity record while leaving R801’s collection-source ownership intact.

## Picker and recipe-corpus impact

The projection uses the current phrase-first matcher over all active reference names, aliases, and form terms. With only the proposed bilingual display names and no aliases:

| Query | Current | After proposed reference |
|---|---:|---:|
| `Love Crunch` | 1 | 2 |
| `dark chocolate and coconut` | 0 | 1 |
| `noix de coco et chocolat noir` | 0 | 1 |
| `granola` | 7 | 8 |
| `coconut`; `noix de coco` | 16 / 11 | 17 / 12 |
| `red berries`; `baies rouges` | 2 / 2 | 2 / 2 |
| `Cranberry Almond Crunch` | 1 | 1 |

A scan of the current manifest-listed corpus covered **114 recipes and 1,123 structured ingredient rows**. No row contains Love Crunch, the Coconut product name, its French listing wording, or UPC `058449772019`. There is no current recipe-line demand signal for this exact product; its catalog value is a distinct, bilingual branded-product choice under the still-open regional cereal-mix sweep. The scan does not imply an absence of recipes using coconut, oats, chocolate, or generic granola.

## Proposed delta

Add one `GRAIN_AND_CEREAL` ingredient reference using the proposal-local handle **`R804-CANDIDATE`**:

| Field | Proposed value |
|---|---|
| English display name | `Love Crunch Organic Dark Chocolate & Coconut Granola` |
| French display name | `Granola avec noix de coco et chocolat noir biologique, Love Crunch` |
| Aliases | None |
| Forms and measures | None |
| Density, unit mappings, package yields, or conversions | None |
| Recipe or component links | None |
| Substitutions | None |

Do not add the 325 g retailer package or manufacturer multipack options as recipe quantities, do not normalize the finished blend into coconut/oats/chocolate component references, and do not infer a general granola measure. Keep the broader Section F item open for other cereal mixes and preprocessed grains.

## Integration status

**Integrated** on 2026-10-19 as `ingredient-ref-love-crunch-dark-chocolate-coconut-granola`, category `GRAIN_AND_CEREAL`, with no aliases, forms, or numeric behavior. The allocated sources are `WP03-SECTIONF-LOVE-CRUNCH-COCONUT-IDENTITY-R804-20261019-S01` (Nature’s Path Canada product page) and `WP03-SECTIONF-LOVE-CRUNCH-COCONUT-IDENTITY-R804-20261019-S02` (Metro Québec indexed listing). Both are product-specific identity sources; the listing does not support a stock or price claim.

Static package, generated-index, source-ownership, picker, corpus, encoding, link, and whitespace checks are recorded in the [R803–R805 integration README](../batches/wp02-wp03-wp04-r803-r805-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because this adds database JSON data under `AGENTS.md`.
