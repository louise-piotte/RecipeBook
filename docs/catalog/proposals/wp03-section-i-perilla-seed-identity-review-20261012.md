# WP03 Section I — culinary perilla-seed identity review

- **Reviewed:** 2026-10-12
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp03-section-i-perilla-seeds-identity-integration-20261012/README.md) for refreshed validation and current counts. The ownership table and counts below are the proposal-time pre-integration snapshot.
- **Scope:** One identity candidate: the culinary seed of *Perilla frutescens*. This does not review or add perilla leaves, oil, or ground/powdered products.

## Accepted identity

Added one identity-only reference:

| Field | Accepted value |
| --- | --- |
| Stable ID | `ingredient-ref-perilla-seeds` |
| English display | `perilla seeds` |
| Québec French display | `graines de périlla` |
| English alias | `perilla seed` |
| French alias | `graine de périlla` |
| Category | `NUT_SEED_AND_DRIED_FRUIT` |

Scope the identity to the edible seeds of *Perilla frutescens* sold for food, whole or minimally processed. Health Canada lists this species’ whole or minimally processed seeds as a food ingredient with a history of safe use; Ontario’s Ministry of Agriculture, Food and Rural Affairs says the seeds are eaten cooked or pressed for oil [S01–S03]. This supports a distinct food-seed identity, not a cooking instruction, raw-use claim, or seed-oil identity.

Keep the recommendation identity-only: add no forms, density, unit mappings, portion values, yields, recipe links, conversions, or substitutions. The proposed singular aliases are directly supported by the English product compound “Perilla Seed Powder” and Health Canada’s French “Graine de perilla”; they normalize separately from the plural displays [S02, S04].

## Identity and naming boundary

| Term or product | Decision | Evidence boundary |
| --- | --- | --- |
| Culinary perilla seeds, *Perilla frutescens* | Add as `perilla seeds / graines de périlla`. | Limit the identity to the edible seed. Health Canada separates the species’ seed from its leaf and leaf oil entries; OMAFRA lists seed use separately from leaf use [S01–S03]. |
| Perilla leaves / shiso leaves | Keep separate. | Same species does not make the edible parts interchangeable. Québec garden-retail wording uses `périlla` and `shiso` for the aromatic leaf plant; it does not establish either bare plant name as a seed alias [S06]. |
| Perilla oil | Keep separate. | Oil is a processed product. Health Canada lists perilla seed oil separately and OMAFRA describes oil extraction as a seed use [S01–S03]. |
| Perilla seed powder | Keep separate from the whole-seed identity. | Current Montreal listings name perilla seed powder and French `poudre de périlla`; a Korean manufacturer describes a ground 100% perilla-seed product. These sources establish product names and processing, not a general seed form or composition for every powder [S04, S05, S07]. |
| Sowing seed | Exclude from the food identity. | Québec horticultural listings identify *Perilla frutescens* seed packets for planting. A food ingredient reference must not be treated as seed-sowing guidance [S06]. |
| Bare `perilla`, `shiso`, `sesame` / `sésame sauvage`, or Korean-language terms | Do not add as aliases. | Bare plant and regional words do not preserve the seed-only boundary in the sources reviewed. Do not merge perilla seeds with the active sesame-seed identities. |

Use `graines de périlla` as a clear, descriptive Québec French display, not as an OQLF ruling. Health Canada’s French page uses the singular `Graine de perilla`; a Québec horticultural retailer uses the accented plant name `Périlla`, and a Montreal Korean grocer lists `Poudre de périlla` for a processed product [S02, S05, S06]. No OQLF food entry for perilla seed was located in this review.

## Reconciliation with previous Section H/I work

The current Section I checklist leaves additional seed identities and regional culinary kernels open. The prior integrated records cover sesame, chia, pumpkin/squash, sunflower, flax, poppy, hemp hearts and whole hemp seeds, egusi, dried watermelon kernels, sacred lotus, makhana, sacha inchi, and several nut identities. This proposal does not duplicate those species or their processed products.

The [2026-10-11 H/I corpus review](wp03-section-h-i-pulses-nuts-gap-review-20261011.md) and its [integration batch](../batches/wp03-section-h-i-pulses-nuts-gap-integration-20261011/README.md) concern adzuki, generic nuts, peanut, and pecan recipe rows and source-specific pecan portion evidence. The recent chickpea, pea, peanut, and pecan work is outside this candidate. The [2026-10-12 pili-nut proposal](wp03-section-i-pili-nut-identity-review-20261012.md) is also distinct: it concerns *Canarium ovatum*, not a culinary seed of *Perilla frutescens*.

The existing [magaz/magaj](wp03-section-i-magaz-melon-kernel-product-boundary-review-20261011.md) and [regional melon-product](wp03-section-i-melon-seed-regional-kernel-gap-review-20261011.md) holds concern crop-ambiguous or shell-state-ambiguous cucurbit kernels and blends; they do not cover perilla. The [candlenut](wp03-candlenut-kemiri-boundary-review-20261009.md) candidate remains a processing-sensitive kernel, and [hemp-seed butter](wp03-hemp-seed-butter-hull-boundary-review-20261011.md) remains held over hull state. Neither is a seed identity covered here. The plan’s broad future `shiso/perilla` herb mention is an herb/leaf-coverage item, not a seed identity decision.

## Proposal-time catalog ownership and collision audit

The snapshot was read on 2026-10-12 from the live split seed package and ledger:

| Artifact | Live count | Candidate check |
| --- | ---: | --- |
| Active ingredient references | 1,238 | 49 references use `NUT_SEED_AND_DRIED_FRUIT`; no perilla-seed identity or proposed ID. |
| Active ingredient forms | 86 | No perilla-seed form or exact candidate label/match term. |
| Legacy import candidates | 66 | No perilla-seed candidate ID, name, or alias. |
| Research-ledger records | 1,537 | No perilla-seed record ID or exact normalized candidate phrase. |
| Ledger source entries / distinct source IDs | 5,310 / 4,352 | All seven source IDs in this proposal were checked and are absent. |
| Manifest recipes / ingredient rows | 114 / 1,123 | No perilla-seed demand or term hit; details below. |

I used the repository’s `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` against all active reference names and aliases, all form labels and match terms, all legacy names and aliases, and ledger strings. The function folds case, accents and ligatures, normalizes punctuation, and collapses whitespace. The proposed stable ID `ingredient-ref-perilla-seeds` is absent from references, forms, legacy candidates, and ledger record IDs.

| Proposed display or alias | Normalized key | Exact owner in references, forms, legacy candidates, or ledger | Result |
| --- | --- | --- | --- |
| `perilla seeds` | `perilla seeds` | None | Available |
| `perilla seed` | `perilla seed` | None | Available |
| `graines de périlla` | `graines de perilla` | None | Available |
| `graine de périlla` | `graine de perilla` | None | Available |

The nearby active `ingredient-ref-sesame-seeds` and `ingredient-ref-white-sesame-seeds` remain separate. Other active seed references such as `ingredient-ref-flax-seeds`, `ingredient-ref-chia-seeds`, `ingredient-ref-poppy-seeds`, `ingredient-ref-egusi-seeds`, and `ingredient-ref-whole-hemp-seeds` own no exact perilla key. Search terms such as bare `seed`, `seeds`, `graine`, or `graines` are broad partial queries and are not proposed aliases.

The source-ID prefix `WP03-I-PERILLA-SEEDS-20261012` and proposed IDs `S01`–`S07` were checked against the complete live ledger source-ID set and prior `docs/catalog/proposals/` and `docs/catalog/batches/` text. No prior record or packet uses them.

## Complete manifest recipe-demand audit

I read all 114 recipe paths in `app/src/main/assets/seed/bundled-library/manifest.v1.json`, covering 1,123 ingredient rows. The full JSON files and each line’s `originalText`, `ingredientName`, `ingredientRefId`, `ingredientFormId`, and French/English preparation text were searched for `perilla`, `perilla seed(s)`, French `graine(s) de périlla/perilla`, `shiso`, `deulkkae` / `deulgae`, `egoma`, `zisu`, and `sésame sauvage`.

**Result: zero full-recipe file hits and zero ingredient-row hits.** No current line calls for perilla seed, leaf, oil, or powder. Do not link generic nuts or sesame rows, and do not create a recipe-specific form in the absence of demand.

## Measurement, substitution, and processing evidence

- **Household measure and density:** Unknown. None of the accepted identity sources supplies a transferable cup/spoon mass, bulk density, or g/ml value for whole perilla seeds. The Montreal package sizes refer to named perilla-seed powder products and are package weights, not recipe measures [S04, S05].
- **Form:** Do not add a cooked, roasted, ground, powdered, hulled, or other form. OMAFRA’s statement that seeds are eaten cooked is a culinary-use note; it gives no recipe quantity, preparation specification, or reason to model a form in this bundle [S03].
- **Yield and conversion:** Unknown. No source supports a seed-to-powder yield or conversion, or an oil extraction yield usable for a recipe line.
- **Substitution:** No global or contextual substitute is supported. Do not substitute sesame, flax, chia, or another seed automatically; the sources provide no tested ratio, recipe function, or method scope.
- **Safety:** The Health Canada determination records a history of food use for whole or minimally processed *P. frutescens* seeds. It is not a preparation guide or a blanket regulatory conclusion for every seed product. No raw-use or home-processing claim is proposed [S01, S02].

## Recommended integration delta (implemented)

1. Added `ingredient-ref-perilla-seeds` in `NUT_SEED_AND_DRIED_FRUIT`, with the bilingual displays and only the singular aliases listed above; `defaultDensity` is null and `unitMappings` is empty.
2. Added an identity-only ledger record for this reference, using the seven source IDs below. Measurement and substitution states remain `not_yet_researched`; no numeric values or automatic behavior were added.
3. Added no form, recipe link, measurement, yield, conversion, or substitution. The broader Section I seed-coverage checklist remains open.

## Source register

All sources were checked online on 2026-10-12. IDs are new to this proposal and were checked against the live ledger and prior proposal/batch files. S01 and S02 are the English and French presentations of one Health Canada list, not independent determinations. S04 and S05 are separate product listings from the same Montreal retailer, not independent retailers.

| ID | Source | What it supports and what it does not |
| --- | --- | --- |
| `WP03-I-PERILLA-SEEDS-20261012-S01` | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), entry dated 2017-05-02. | Lists *Perilla frutescens* seeds and “whole or minimally processed perilla seeds,” with a history of safe use as food. The same table separately lists leaf and leaf oil entries. This is identity and history-of-use evidence, not a kitchen measure or general preparation/safety guide. |
| `WP03-I-PERILLA-SEEDS-20261012-S02` | Health Canada, [Liste des déterminations d’aliments et d’ingrédients alimentaires qui ne sont pas nouveaux](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html), entry dated 2017-05-02. | Gives `Graine de perilla (Perilla frutescens)` and `Graine de perilla entière ou minimalement transformée`. Supports the French singular wording and species; not a Québec OQLF preference. |
| `WP03-I-PERILLA-SEEDS-20261012-S03` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Specialty Cropportunities: Perilla](https://www.omafra.gov.on.ca/CropOp/en/herbs/culinary/peril.html), “Uses and Markets.” | Identifies *Perilla frutescens* and says seeds are eaten cooked or oil is extracted; also describes culinary leaf uses and lists shiso among common names. It provides no recipe measure, density, or substitution. |
| `WP03-I-PERILLA-SEEDS-20261012-S04` | Marché Korea, Montréal, [CHOYA Perilla Seed Powder 들깨가루 200G](https://marchekorea.com/shop/choya-perilla-seed-powder-%EB%93%A4%EA%B9%A8%EA%B0%80%EB%A3%A8-200g/), product heading and Montreal store address. | Current Québec retail listing for a named perilla-seed powder product; the page title gives a 200 g pack size and identifies Montreal locations. This is product-name and availability context only, not a whole-seed measure or ingredient-composition source. |
| `WP03-I-PERILLA-SEEDS-20261012-S05` | Marché Korea, Montréal, [powder and dry-mix listings](https://marchekorea.com/product-category/grocery/powderflourdrymix/), current SAMJIN product titles. | Lists `Poudre de périlla` and `Poudre de périlla molle` for 1 kg perilla-powder products. Supports Québec French product wording for powders only; the package weight is not a kitchen conversion, and the listing does not name a whole-seed product. |
| `WP03-I-PERILLA-SEEDS-20261012-S06` | Pépinière.ca, [Périlla en pot — Fine herbe asiatique](https://www.pepiniere.ca/products/pepiniere-ca-perilla), common name and botanical/culinary description. | Québec horticultural retailer uses the accented French plant name `Périlla`, gives *Perilla frutescens*, and describes the leaves in cooking. It is plant/leaf terminology, not an edible-seed product label. |
| `WP03-I-PERILLA-SEEDS-20261012-S07` | Gimpo Malt Food Co., [Perilla Seeds Powder (Korean, Imported)](https://en.kimpomaca.co.kr/product/perilla-seeds-powder-korean-imported/53/), manufacturer product description. | Identifies a food powder made from 100% perilla seeds and names porridge and seasoned vegetables as uses. The product page marks it out of stock, so it is composition and processing evidence, not current availability. It gives no transferable measure, density, or whole-seed form specification. |

## Prior packets checked

- [WP03 Section H/I gap review](wp03-section-h-i-pulses-nuts-gap-review-20261011.md) and [H/I integration batch](../batches/wp03-section-h-i-pulses-nuts-gap-integration-20261011/README.md)
- [Flax, hemp hearts, and poppy-seed review](wp03-flax-hemp-poppy-seed-gap-review-20261010.md) and [seed-kernel integration batch](../batches/wp03-seed-kernel-identities-integration-20261010/README.md)
- [Egusi and dried watermelon-seed review](wp03-egusi-melon-seeds-identity-review-20261009.md), [regional melon-kernel gap review](wp03-section-i-melon-seed-regional-kernel-gap-review-20261011.md), and [magaz/magaj boundary review](wp03-section-i-magaz-melon-kernel-product-boundary-review-20261011.md)
- [Whole-hemp boundary review](wp03-whole-hemp-seed-canadian-quebec-boundary-review-20261011.md), [lotus-seed boundary review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md), [makhana identity review](wp03-makhana-fox-nut-identity-20261009.md), [roasted sacha inchi integration](../batches/wp03-roasted-sacha-inchi-seeds-integration-20261011/README.md), and [pili-nut identity proposal](wp03-section-i-pili-nut-identity-review-20261012.md)

This packet creates one proposed perilla-seed identity and does not close the wider Section I seed, kernel, or preparation checklist.

No tests or emulator checks were run because the integration only adds database JSON data under `AGENTS.md`.
