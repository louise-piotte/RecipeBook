# WP03 Section F R810 — Love Crunch Peanut Butter Protein Granola identity review (2026-10-19)

## Decision summary

- **Open parent:** The Section F checklist still includes regional cereal mixes and preprocessed grains. R801 and R804 added two individual Love Crunch granola variants; neither establishes the family roster. This is a separate, manufacturer-listed product under that open parent ([catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4942), [R801](wp03-section-f-love-crunch-red-berries-identity-review-r801-20261019.md), [R804](wp03-section-f-love-crunch-dark-chocolate-coconut-identity-review-r804-20261019.md)).
- **Recommendation: accept one identity-only `GRAIN_AND_CEREAL` reference** for the Canadian Love Crunch Organic Peanut Butter Protein Granola, matched to product number/UPC `058449251309` by the Nature’s Path image filename and Metro’s English and French listings.
- **Proposed displays:** `Love Crunch Organic Peanut Butter Protein Granola` / `Granola protéiné au beurre d’arachide biologique, Love Crunch`.
- **Aliases:** retain Metro’s exact product-title order as one product-qualified alias in each language: `Organic Peanut Butter Protein Granola, Love Crunch` and `Granola protéiné au beurre arachide biologique, Love Crunch`. The French display uses OQLF-supported `beurre d’arachide`; the alias preserves Metro’s current Québec listing wording. Add no shorter flavor, component, or family aliases.
- Keep the identity distinct from generic granola, peanut butter, peanuts, oats, and the already integrated Red Berries and Coconut variants. Add no forms, recipe/component links, density, unit mappings, measures, yields, conversions, or substitutions. `312 g` is package net mass only.
- `R810-S01` through `R810-S05` below are proposal-local source handles. They do not reserve shared source IDs. Reuse the already registered Love Crunch collection source and OQLF source IDs listed below instead of duplicating them.

## Product identity and Québec French

Nature’s Path’s current Canada-region English product page is headed **Love Crunch Organic Peanut Butter Protein Granola**. Its product-image filename contains `058449251309-25130`, and the page places it under the Love Crunch Protein Granola collection. It describes finished organic granola clusters covered in peanut butter and mixed with roasted peanuts. The French-localized Canadian product page retains the same English heading and image-code digits, so it corroborates the product match but does not provide a French product name. [R810-S01; R810-S02]

Metro’s English detail page identifies **Organic Peanut Butter Protein Granola, Love Crunch**, product number `058449251309`, and a 312 g package. The corresponding French Québec listing identifies **Granola protéiné au beurre arachide biologique, Love Crunch**, the same number, and the same 312 g package. The French detail route returned HTTP 403 on direct opening; its current indexed listing supplied the title, product number, and package mass. Treat that French title as retailer-index evidence, with the access limitation visible. [R810-S03; R810-S04]

The proposed French display retains Metro’s product wording while adding the preposition in OQLF’s Québec term `beurre d’arachide`. OQLF’s 2024 entry lists `granola` as the preferred French term for this prepared cereal, and its 2023 entry recognizes `beurre d’arachides` and `beurre d’arachide` in Québec usage. These entries support the generic terms, not a translation of the brand or a claim that OQLF approved this commercial product name. Reuse existing ledger sources `WP03-FCR-20261010-S15` (granola) and `WP03-I-PB-FORMULATION-R213-20261016-S02` (beurre d’arachides). [R810-S05; R810-S06]

The current Nature’s Path Love Crunch collection lists this as a separately named product alongside other distinct variants. Reuse the collection URL already owned by R801 source `WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S04`; it supports the product-family boundary only and is not evidence for a complete family roster.

## Measurements, density, and substitutions

The manufacturer page offers six-packs of 312 g units; Metro lists a single 312 g unit with the matching product number. Neither accessible product page provides a household portion, mass-per-volume observation, or volume measure. The French Metro page is index-only for this review. Do not copy package mass into `unitMappings`, and do not infer a serving from the package size. [R810-S01; R810-S03; R810-S04]

Well.ca’s current Canadian listing for a 312 g Love Crunch peanut-butter-protein granola pouch exposes a `120 g` “serving size” in its indexed nutrition fields, but it gives no UPC and no household volume. Direct page opening returned a cache miss. The amount therefore cannot be tied to the `058449251309` package or used to establish a cup mapping; retain it only as an unverified measurement lead and add no portion observation. No source provides a supported density in g/ml. [R810-S05]

The manufacturer describes a finished blend containing granola clusters, peanut butter, roasted peanuts, rolled oats, sugar, oils, pea proteins, starches, salt, and other ingredients. It publishes no replacement ratio or form-to-form conversion for recipes. Keep this branded product separate from its ingredient components and generic granola; add no active substitution or yield. [R810-S01; R810-S04]

## Ownership audit

The current seed snapshot has **1,885 references**, **199 forms**, **56 legacy-import candidates**, **2,293 ledger records**, and **114 manifest-listed recipes with 1,123 ingredient rows**.

| Surface | Result |
|---|---|
| References and forms | No exact candidate name, product title, or `058449251309` appears. The only Love Crunch references are `ingredient-ref-love-crunch-dark-chocolate-red-berries-granola` and `ingredient-ref-love-crunch-dark-chocolate-coconut-granola`, with distinct product codes. The canonical exact English and French names and the proposed retailer-title aliases have no existing exact term owner. |
| Broad component terms | Generic `granola` remains owned by `ingredient-ref-granola`; `peanut butter` and `beurre d’arachide` remain owned by `ingredient-ref-peanut-butter`. The candidate will be found for those phrases because they occur inside its complete product displays; that is a picker projection, not a new component alias or identity merge. |
| Legacy identities and ledger | No exact product name, French listing title, alias, or product number is present. The only Love Crunch ledger rows are the R801 Red Berries and R804 Coconut identities. |
| Product source URLs | The candidate’s English and French manufacturer product URLs, both Metro detail URLs, and Well.ca listing URL have no ledger owner. The Nature’s Path Love Crunch collection URL is already owned by R801 and should be reused. The two OQLF terminology URLs are already registered under the existing source IDs above. |

## Picker projection

The audit follows `IngredientSearch.kt`: normalized query phrases are matched contiguously anywhere within an indexed display, alias, or form term before partial matching is considered. Projection adds only the proposed displays and the two Metro title aliases; result counts below compare the current 1,885 references to that snapshot plus one proposed reference.

| Query | Current | Projected | Why it changes |
|---|---:|---:|---|
| `Love Crunch` | 2 | 3 | Adds this separately named Love Crunch product. |
| `Love Crunch Organic Peanut Butter Protein Granola` | 0 | 1 | Full manufacturer product name. |
| `Organic Peanut Butter Protein Granola, Love Crunch` | 0 | 1 | Full Metro English title alias. |
| `Granola protéiné au beurre d’arachide biologique, Love Crunch` | 0 | 1 | Proposed French display. |
| `Granola protéiné au beurre arachide biologique, Love Crunch` | 0 | 1 | Full Metro French title alias. |
| `granola` | 8 | 9 | The new finished product joins generic granola and existing named cereals. |
| `peanut butter` | 4 | 5 | The phrase occurs inside the product’s full English name. |
| `beurre d’arachide` | 2 | 3 | The phrase occurs inside the proposed Québec French display. |
| `protein`; `protein granola`; `granola protein` | 3 / 0 / 0 | 4 / 1 / 1 | Product-name subphrases; `granola protein` is a partial fallback against normalized `granola protéiné`. |
| `peanut`; `arachide` | 7 / 4 | 8 / 5 | Ingredient words occur inside the product displays. |
| `peanut butter granola` | 0 | 0 | No alias is added for this reordered, broader phrase. |
| `oats`; `flocons d’avoine`; `cereal`; `céréales` | 12 / 4 / 106 / 103 | unchanged | No oat or generic cereal aliases are proposed. |

The broad hits are limited to phrases explicitly contained in the product’s full name and add one clearly branded result to the current peanut-butter and granola choices. The title makes the finished cereal identity visible, while no standalone component aliases or component links are created. `Love Crunch` remains a partial family projection of three reviewed products, not a claim that these are the only current variants.

## Recipe-corpus audit

All **114** recipe files named by the seed manifest and all **1,123** structured ingredient rows were checked. A whole-document scan found no `Love Crunch`, UPC `058449251309`, `peanut butter protein granola`, `granola protéiné au beurre`, `granola`, or `protein granola` occurrence. No recipe link, substitution link, or recipe edit is proposed. This is a catalog identity gap, not a seed-recipe demand finding.

## Exact proposed delta

Add one reference with these values:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-love-crunch-peanut-butter-protein-granola` |
| `category` | `GRAIN_AND_CEREAL` |
| `nameEn` | `Love Crunch Organic Peanut Butter Protein Granola` |
| `nameFr` | `Granola protéiné au beurre d’arachide biologique, Love Crunch` |
| `aliasesEn` | `["Organic Peanut Butter Protein Granola, Love Crunch"]` |
| `aliasesFr` | `["Granola protéiné au beurre arachide biologique, Love Crunch"]` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `forms`, recipe/component links, yields, substitutions | None |

If the proposal is integrated, set the ledger identity state to `verified`, measurement state to `researched_no_supported_value`, and substitution research state to `researched_no_supported_substitute`. Keep package mass in evidence only. Add the product-specific English manufacturer, French-indexed retailer, and English retailer sources; record Well.ca’s unmatched 120 g field only with its source limits. Reuse the existing R801 collection and OQLF source IDs instead of assigning duplicate URLs. Do not allocate a recipe-line link or measurement observation.

The broader Section F cereal-mix item remains open. This is a one-variant identity decision, not a family audit.

The eventual accepted delta only adds database JSON data, so the testing exception in `AGENTS.md` applies. No tests, build, emulator, deployment, or shared-data edits were performed for this proposal.

## Sources

| Handle | Source and observed evidence | Limit |
|---|---|---|
| **R810-S01** | Nature’s Path Canada, [Love Crunch Organic Peanut Butter Protein Granola](https://naturespath.com/en-ca/products/peanut-butter-protein-granola-lc-ca), checked 2026-10-19. Product heading, product-image filename `Peanut_Butter_Protein_Granola_058449251309-25130`, Canadian product page, six-pack selection of 312 g units, and product description. | Product number appears in the image filename rather than a separate barcode field. Package size is not a portion; the accessible page has no serving size or density evidence. Availability is not asserted. |
| **R810-S02** | Nature’s Path Canada French-localized product page, [Love Crunch Organic Peanut Butter Protein Granola](https://naturespath.com/fr-ca/collections/love-crunch/products/peanut-butter-protein-granola-lc-ca), checked 2026-10-19. French-locale Canadian page, same product-image code, and Love Crunch Protein Granola breadcrumb. | The page title and product copy remain in English; it does not support the French display wording. |
| **R810-S03** | Metro Québec, [Granola protéiné au beurre arachide biologique, Love Crunch](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/granola-proteine-au-beurre-arachide-biologique/p/058449251309), retrieved from current search-indexed product detail on 2026-10-19. The listing pairs the French title and 312 g package with product number `058449251309`; indexed ingredients identify a granola blend with oats, peanut butter, peanuts, pea proteins, starches, and other ingredients. | Direct detail-page retrieval returned HTTP 403. Use the indexed product title, code, package, and ingredient declaration as retailer evidence; do not claim a current price, stock, or label inspection. |
| **R810-S04** | Metro, [Organic Peanut Butter Protein Granola, Love Crunch](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/granola-healthier-cereals/organic-peanut-butter-protein-granola/p/058449251309), product number `058449251309`, 312 g package, English product title. | The accessible detail page gives package mass and product identity, not a household measure. Its crawl may lag current retailer inventory. |
| **R810-S05** | Well.ca, [Nature’s Path Love Crunch Organic Protein Peanut Butter Granola Pouch](https://well.ca/products/sachet-de-granola-protin-au-beurre-de-cacahute-biologique-love-crunch-de-natures-path_320223.html), current indexed 312 g listing. The search result exposes a `120 g` serving-size field and related nutrition values. | No UPC or household volume is shown; direct page opening returned a cache miss. Do not match that serving field to UPC `058449251309` or infer a volume mapping. |
| **R810-S06** | OQLF, [granola (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542365/granola), entry updated 2024; existing source `WP03-FCR-20261010-S15`. | Supports generic Québec terminology and cereal classification, not this brand or product title. |
| **R810-S07** | OQLF, [beurre d’arachides (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360854/beurre-darachides), entry updated 2023; existing source `WP03-I-PB-FORMULATION-R213-20261016-S02`. | Supports the Québec generic term `beurre d’arachides` / `beurre d’arachide`, not this branded product name. |
| **Reuse R801-S04** | Nature’s Path, [Love Crunch collection](https://naturespath.com/en-ca/collections/love-crunch), already registered as `WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S04`. The current collection lists separately named Love Crunch variants, including this protein granola. | Reuse the existing source ID; this collection is not a stable or complete family roster. |
