# WP03 Section F — brown rice flakes identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** accepted and integrated as identity-only `ingredient-ref-brown-rice-flakes`; see the batch README.
- **Scope:** one product-identity boundary in the open Section F sweep for regionally significant cereal products and preprocessed grains ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2106)).
- **Overlap check:** repository search found no prior dedicated review, proposal, batch, active reference, or legacy candidate for `brown rice flakes` / `flocons de riz brun`. The existing red-rice-flakes identity and generic poha reviews are adjacent boundaries, not duplicates; this review does not reopen them. The recent malted-wheat-flakes proposal concerns a different grain and product.
- **Disposition:** recommend one identity-only `GRAIN_AND_CEREAL` reference for **`brown rice flakes / flocons de riz brun`**, with no aliases or numeric behavior. The English product class is supported by a current manufacturer and Canadian retailer; a current Canadian French Eden listing and a French Canadian retailer support the French display. Treat the French wording as product-label evidence, not an OQLF ruling.

## Current package snapshot

Read-only counts at review time:

| Artifact | Count |
|---|---:|
| Active ingredient references | 1,260 |
| Ingredient forms | 94 |
| Legacy import candidates | 66 |
| Research-ledger records | 1,569 |
| Manifest-listed recipes | 114 |
| Ingredient rows in those recipes | 1,123 |

## Proposed identity and product boundary

| Proposed field | Decision |
|---|---|
| ID | `ingredient-ref-brown-rice-flakes` (unallocated) |
| English display | `brown rice flakes` |
| Québec French display | `flocons de riz brun` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None |
| Recipe links | None; no candidate phrase occurs in the bundled corpus |
| Forms, density, unit mappings, measurements, conversions, yields, substitutions | None |

This row denotes plain flakes sold as made from whole-grain brown rice. Eden describes its short-grain brown-rice product as roasted and rolled; a Canadian retailer independently sells brown-rice flakes as quick-cooking flakes milled from whole-grain brown rice. The label `brown rice flakes` is thus a sourced product name, not an inference from the active brown-rice ingredient.

Keep this product distinct from intact `brown rice / riz brun`, brown-rice flour, brown-rice syrup, rice flour, `cream of rice hot cereal / crème de riz`, crispy or puffed rice cereal, and the existing flattened-rice/poha identity. In particular, do not alias bare `rice flakes`, `flaked rice`, `flattened rice`, `poha`, or `riz aplati` to this row: those phrases already belong to the generic poha identity. The existing `red rice flakes / riz rouge aplati` identity is a separate color-qualified product and remains unchanged.

The two flake products have overlapping culinary uses, and both are rice products sold as flakes. The source evidence does not establish that every brown-rice-flake product follows one manufacturing sequence or is universally different in cooking behavior from every poha product. It does establish a distinct, current market name for whole-grain brown rice flakes and one manufacturer-documented roasted-and-rolled product. Use the qualified display with no broad aliases so the catalog preserves the purchased product name without claiming all rice flakes are interchangeable or share one process.

## Exact active, form, legacy, and ledger ownership

The exact-key audit used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` across reference displays and aliases, form labels and match terms, all 66 legacy candidate names and aliases, and all ledger record/source/decision text. It compared whole normalized terms, separately from phrase-inside-longer-name picker behavior.

| Phrase family | Active reference / form owner | Legacy owner | Ledger state |
|---|---|---|---|
| `brown rice flakes`, `brown rice flake`, `flocons de riz brun`, `flocons de riz brun rond`, `flocons de riz complet` | No exact reference or form owner. | None. | No exact phrase, candidate record, or `ingredient-ref-brown-rice-flakes` record in the 1,569 records. |
| `brown rice` / `riz brun` | `ingredient-ref-brown-rice`, `GRAIN_AND_CEREAL`, owns both exact display keys; it also owns `hulled rice` / `riz cargo`. No forms, density, or unit mappings. | None. | `ingredient-ref-brown-rice` is verified from existing TERMIUM, Codex, federal, and OQLF evidence (`WP03-S115`–`S118`). Measurement and substitution research remain `not_yet_researched`. |
| `rice flakes` / `flaked rice` | Exact English aliases of `ingredient-ref-flattened-rice-poha`; no density or unit mappings. | None. | `ingredient-ref-flattened-rice-poha` is verified; measurement is `not_yet_researched`, and substitution is `blocked_pending_evidence`. Existing sources include CFTRI/CSIR rice-flake and poha context (`WP03-S92`–`S96`) and later synonym/grade reviews. |
| `medium rice flakes`, `thick rice flakes`, `thin rice flakes` | Existing medium, thick, and thin commercial poha forms attached only to `ingredient-ref-flattened-rice-poha`. Their source notes say no standardized thickness cutoffs or conversion is established. | None. | Existing verified form records; no brown-rice qualification. |
| `red rice flakes` / `red rice poha` | `ingredient-ref-red-rice-flakes`, `GRAIN_AND_CEREAL`; `red rice poha` is its only English alias. | None. | Existing accepted record `ingredient-ref-red-rice-flakes`, with the recent Canadian market/product evidence. No forms or numeric data. |
| `brown rice flour` / `farine de riz brun`; `brown rice syrup` / `sirop de riz brun` | Separate active identities `ingredient-ref-brown-rice-flour` and `ingredient-ref-brown-rice-syrup`. | None. | Their records concern flour and sweetener, not flakes. |

No active reference or form has an exact normalized key for the candidate name family, and no legacy candidate claims it. The only related exact English `rice flakes` owner is generic flattened rice/poha; the brown-rice base and red-rice-flakes row are separate owners. The candidate has no ledger record, so these proposal-local source IDs below are new and were checked absent from the ledger.

## Picker phrase boundary

`IngredientSearch.kt` normalizes accents and gives complete word-phrase matches in longer indexed terms. The outcomes below are source-code behavior assessments, not live picker QA:

- `brown rice flakes` or accent-folded `flocons de riz brun` should return the proposed qualified name.
- `brown rice` / `riz brun` would match both intact brown rice and the proposed flake product. Their full displays preserve the distinction.
- `rice flakes` / `flaked rice` would match generic flattened rice/poha, red rice flakes, and the proposed brown rice flakes. Do not reassign the generic alias to either color-qualified row.
- `flocons de riz` would match generic poha and the proposed brown-rice-flakes display; the existing red-rice-flakes French display is `riz rouge aplati` and does not contain that phrase.
- `brown rice flour`, `brown rice syrup`, and `cream of rice` remain qualified longer names for separate products.

These broader searches return qualified names rather than proving that a bare rice-flake query identifies one process. A live ordering or selection was not tested.

## Recipe-corpus demand audit

All 114 manifest-listed recipe JSON files were scanned after the repository's accent/punctuation normalization, including serialized recipe text and every ingredient row. Search phrases included `brown rice flakes`, singular and short-/whole-grain variants, `flocons de riz brun`, `flocons de riz brun rond`, `flocons de riz complet`, and neighboring `brown rice`, `riz brun`, `rice flakes`, `flaked rice`, `flattened rice`, `red rice flakes`, and `red rice poha`.

| Phrase group | Full recipe files with a hit | Ingredient rows with a hit |
|---|---:|---:|
| Candidate English and French phrase variants | 0 / 114 | 0 / 1,123 |
| Existing brown-rice and rice-flake boundary phrases listed above | 0 / 114 | 0 / 1,123 |

No recipe link or quantity change is recommended. Integration would cover a distinct sourced ingredient name, not a current bundled-recipe request.

## English and Québec French evidence; limits

Current product evidence identifies brown rice flakes as a plain, whole-grain rice flake. Eden's product page lists organic short-grain brown rice as its sole ingredient and says its product is roasted and rolled; it describes porridge, soups/stews, granola/muesli, baking, and confectionery uses. A current Canadian retailer independently lists organic brown rice flakes made from whole-grain brown rice. Those sources support the English identity, not universal processing or substitution behavior.

For French, Eden's Canadian product image/listing pairs `Brown Rice Flakes` with **`Flocons de Riz Brun Rond`**; the Canadian French Well.ca page lists the product as **`Flocons de Riz Brun Bio Eden`**. The proposed generic display drops the brand, organic claim, and the particular short-grain/round qualifier. This is current Canadian product-label usage, not a formal Québec terminology ruling. The bounded OQLF/TERMIUM search did not locate a term specific to brown-rice flakes. Existing TERMIUM/OQLF evidence supports the base French identity `riz brun` (and the existing `riz cargo` alias) only; it does not define the flake product.

French manufacturer Celnat uses `flocons de riz complet` for its steamed whole-rice-flake product. That is France-based product wording and a product-specific process; it is not used here as an fr-CA alias. Keep `flocons de riz complet` out of the active aliases pending Québec review because it was not attested in the Canadian product evidence reviewed. The selected French display is supported directly by Eden's Canadian bilingual label and the French Canadian retailer.

## Numeric, form, and substitution limits

- Eden's package size is a product-specific 16 oz / 454 g SKU detail, not a serving, volume-to-mass conversion, or reusable package yield.
- Eden says the flakes cook in “just minutes”; an older catalog and some retailer copy give product-specific quick-cooking directions. Celnat's separate product suggests 4 tablespoons per person, 100 ml water, 5 minutes of cooking, and 2 minutes of resting. These product/package instructions do not define a general amount, ratio, or cooking time for the proposed identity.
- No source establishes a catalog density, cup or spoon mass, standard serving, flake-size thresholds, dry-to-prepared yield, or a brown-rice-flake-to-poha form conversion. Do not attach the existing thin/medium/thick poha grades to this row.
- No global or contextual substitution is supported between brown rice flakes, generic poha, red rice flakes, rolled oats, rice, or cream-of-rice hot cereal. Similar cereal uses do not establish recipe interchangeability. Add no substitution rule.
- Keep organic status, short-/round-grain specification, product recipe suggestions, package data, and supplier directions out of the identity-level fields.

## Source register

The source IDs below were checked absent from `docs/catalog/research-ledger.v1.json` during the initial review and were added to the accepted reference record during integration. Well.ca's French Canadian product listing and description are available in the current search index; no stock or availability claim is made from it.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-BRFLAKE-20261012-S01` | Eden Foods, [Brown Rice Flakes organic](https://store.edenfoods.com/brown-rice-flakes-organic/), product title, ingredient declaration, and details. | Current manufacturer page names brown rice flakes, lists organic short-grain brown rice as the ingredient, and describes its own product as gas-fire roasted then rolled. It describes several uses and quick cooking but does not give a general household conversion, density, yield, or substitution. Package size and cooking claims remain SKU-specific. |
| `WP03-BRFLAKE-20261012-S02` | Eden Foods, [Canadian product image catalogue](https://www.edenfoods.com/galleries/browse.php?categories_id=8&lang=B), Cereal » Flakes entry 183055. | Bilingual Canadian listing calls the product `Brown Rice Flakes / Flocons de Riz Brun Rond`. Supports Canadian bilingual product wording; `rond` is a product-specific qualifier and is not imported into the proposed generic display. |
| `WP03-BRFLAKE-20261012-S03` | Well.ca, [Flocons de Riz Brun Bio Eden](https://well.ca/fr/produits/eden-organic-brown-rice-flakes_18292.html), French Canadian listing. | Current indexed Canadian French product title and description corroborate `flocons de riz brun` and describe brown rice processed into flakes. The direct page was not retrievable in this review; use only indexed title/description wording and make no availability claim. |
| `WP03-BRFLAKE-20261012-S04` | Galloway's Wholesome Foods, [Organic brown rice flakes](https://www.gallowaysfoods.com/products/organic-brown-rice-flakes), product details. | Canadian retailer identifies brown rice flakes as quick-cooking flakes milled from whole-grain brown rice and lists uses. Supports the English market product class; its 455 g option is SKU/package data only. |
| `WP03-BRFLAKE-20261012-S05` | Celnat, [Flocons de riz](https://www.celnat.fr/ref/flocons-de-riz), product description, ingredients, and preparation. | French manufacturer describes steamed flakes of whole rice using `flocons de riz complet` and gives product-specific preparation. This supports a French-market example and illustrates product variation; it does not establish the Canadian display or a universal process. |

Existing ledger evidence reused for adjacent terms and collision boundaries (not new source IDs): `WP03-S115` (TERMIUM `brown rice / riz brun`), `WP03-S118` (OQLF `riz cargo`), `WP03-S92`/`S93` (CFTRI/CSIR rice-flake and poha naming/process context), `WP03-S94` (National Portal of India poha description), and `WP03-S95`/`S96` (Canadian French `flocons de riz (poha)` / `riz aplati` usage). These records support the neighboring identities; they do not establish brown rice flakes as an OQLF term or a synonym of all poha.

## Decision

**Accepted as one identity-only `GRAIN_AND_CEREAL` row: `brown rice flakes / flocons de riz brun`.** No aliases, forms, recipe links, measurements, density, unit mappings, conversions, yields, or substitutions were added. The row preserves the picker boundary with generic poha and red rice flakes. The French wording is current Canadian product-language evidence, not an official Québec terminology decision. Section F remains open. See `docs/catalog/batches/wp03-section-f-brown-rice-flakes-integration-20261012/README.md`.
