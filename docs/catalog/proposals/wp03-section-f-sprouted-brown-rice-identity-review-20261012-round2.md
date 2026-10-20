# WP03 Section F: sprouted brown-rice identity review (2026-10-12)

## Review record

- **Status:** Integrated on 2026-10-12. The active identity and source-specific ledger evidence are recorded in `ingredient-references.v1.json` and `research-ledger.v1.json`; see the integration batch README. No recipe, form, active measurement, conversion, yield, or substitution rule was added.
- **Scope:** One dry, uncooked, human-food product sold as sprouted or germinated brown rice. The review does not define a minimum sprout length, germination rate, drying process, or moisture specification.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference: **`sprouted brown rice / riz brun germé`**, proposed ID `ingredient-ref-sprouted-brown-rice`. Use `germinated brown rice` as the sole English alias. Keep French aliases, forms, measures, density, unit mappings, recipe links, conversions, yields, and substitutions empty.
- **Why this is a distinct open item:** Section F leaves regional cereal and preprocessed-grain coverage open ([plan, current checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2173), [later continuation](../../RecipeBook-global-ingredient-catalog-plan.txt#L9297)). The brown-rice integration covered the milling class and bounded aliases; it did not review a separately marketed germinated-grain product. The existing WP02 sprouted-black-bean-flour review mentions **sprouted brown-rice flour** only as a component of a finished cereal; it does not review this grain ([WP02 review](wp02-b2-sprouted-black-bean-flour-form-boundary-review-20261012.md)).

## Proposed identity and boundaries

The proposed row is for dry, shelf-stable brown-rice kernels that have been sprouted and are sold uncooked for cooking. First-party product information names sprouted brown rice as the ingredient; Canadian French product wording and an FAO conference paper use `riz brun germé`. The evidence supports an identity for this marketed processing class, not a universal germination protocol or health claim.

| Proposed field | Recommendation |
|---|---|
| Stable ID | `ingredient-ref-sprouted-brown-rice` (unallocated) |
| English display | `sprouted brown rice` |
| Québec French display | `riz brun germé` |
| Category | `GRAIN_AND_CEREAL` |
| English aliases | `germinated brown rice` only |
| French aliases | None |
| Forms | None |
| Recipe links | None |
| Default density / unit mappings | `null` / `[]` |

Keep the candidate separate from:

| Neighbor | Boundary |
|---|---|
| `brown rice / riz brun` | The active identity covers ordinary brown rice. This proposal describes a separately marketed sprouted product; do not move the sprouting wording onto the broad brown-rice row. |
| Black, red, glutinous, and named-variety rice | Do not generalize the candidate across bran colors, grain classes, or named varieties. In particular, a source-named sprouted red-rice product is not an alias for this brown-rice identity. |
| Parboiled and quick-cooking rice | Germination is not an alias for parboiling or precooking. No process equivalence is proposed. |
| Rice with germ / intact-germ rice | Retaining the rice germ is not the same as germinating the brown-rice kernel. Keep “rice with germ” out of the alias set. |
| Sprouted brown-rice flour or protein | Milling and protein extraction are separate product scopes. Do not use the grain identity for flour, protein powder, or a cereal ingredient declaration naming sprouted brown-rice flour. |
| Sprouted brown-rice crisps or ready-to-eat cereal | Puffed/crisped and formulated cereal products are not plain uncooked kernels. |
| Cooked or moist germinated brown rice | The proposed row is limited to the dry retail grain sold uncooked. The FAO paper discusses both dry and wet marketed products; it does not support collapsing their moisture and preparation states into one runtime form. Fully cooked ready-to-serve products remain outside this row. |

The French display is supported as Canadian French retail wording and in a French FAO paper. No OQLF or TERMIUM entry for this processed-grain compound was located. Describe the name as source-attested wording, not as an OQLF-preferred term.

## Current package snapshot and ownership audit

The read-only snapshot used the canonical split seed package and shared ledger on 2026-10-12.

| Artifact | Count |
|---|---:|
| Active ingredient references | 1,301 |
| Ingredient forms | 98 |
| Legacy-import candidates | 64 |
| Research-ledger records | 1,609 |
| Ledger source entries / distinct source IDs | 5,830 / 4,853 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

Normalized exact-key checks used the repository's `normalize_search_key` implementation. Candidate phrases checked included `sprouted brown rice`, `germinated brown rice`, `riz brun germé`, `riz brun germé biologique`, `sprouted brown basmati rice`, `sprouted short grain brown rice`, `sprouted red rice`, `riz complet germé`, `riz germé`, `rice with germ`, and `GABA rice`.

| Surface checked | Result |
|---|---|
| Active reference names and aliases | No exact normalized candidate phrase or proposed ID is owned. Nearby active references include brown rice, brown-rice flakes, brown-rice flour, and brown-rice syrup. |
| Form labels and match terms | No exact normalized candidate phrase or proposed ID is owned. No brown-rice sprouted form exists. |
| Legacy-import candidates | No exact normalized candidate phrase or proposed ID is present. |
| Research ledger | No exact candidate record, phrase, or proposed ID is present. Proposal-local source IDs `WP03-GBR-20261012-S01` through `S06` were absent from current ledger source IDs. |
| Proposal and batch archive | No dedicated sprouted/germinated brown-rice grain review was found. The WP02 sprouted-black-bean-flour packet contains one neighboring mention of sprouted brown-rice flour as a finished-cereal ingredient; that is not an exact grain identity or a prior decision on this candidate. |

`ingredient-ref-sprouted-brown-rice` and `candidate-sprouted-brown-rice` are currently unallocated. The exact-key audit is not a live emulator picker test.

## Phrase-first picker boundary

The static query check followed the current `IngredientReferenceSearchIndex` behavior: complete normalized word phrases across reference names, aliases, and attached form terms are returned first; substring fallback runs only when that pass is empty. The proposed result below is simulated in memory and does not change the catalog.

| Query | Current results | Results with proposed row | Decision |
|---|---|---|---|
| `sprouted brown rice` | None | Proposed sprouted-brown-rice row only | Accept as the English display query. |
| `germinated brown rice` | None | Proposed row only | Accept as the one English alias query. |
| `riz brun germé` | None | Proposed row only | Accept as the French display query. |
| `brown rice` / `riz brun` | Four brown-rice references | Those four plus proposed row | Broad family queries become less specific, but the full qualifier remains intact in the result name. Keep the display fully qualified. |
| `brown rice flour` | Brown-rice-flour row only | Brown-rice-flour row only | Keep flour separate. |
| `brown rice flakes` | Brown-rice-flakes row only | Brown-rice-flakes row only | Keep flakes separate. |
| `sprouted brown rice flour` | None | None | Do not let the grain row absorb a flour phrase; the related flour review remains a separate WP02 concern. |
| `GABA rice`, `sprouted rice`, `germinated rice`, `riz complet germé` | None | None | Keep these out of aliases: they are broader, source-specific, or unsupported French wording. |

The proposed full display and alias resolve to one row. The deliberate increase from four to five results for the broad `brown rice` and `riz brun` family searches is visible and bounded; no shorter alias such as `sprouted rice` or `riz germé` is proposed.

## Complete 114-recipe demand audit

All 114 manifest-listed recipe files were parsed, and all 1,123 ingredient rows were inspected. The scan covered the full serialized recipe text and each ingredient row's `originalText`, `ingredientName`, and `ingredientRefId`. The normalized phrase set covered the candidate and nearby boundaries listed above.

- **Full-recipe phrase hits:** 0 / 114.
- **Ingredient-row phrase hits:** 0 / 1,123.
- **Recipe links, amounts, and state hints:** none supported.

This is a result for the current bundled corpus, not a claim about all regional or external recipes.

## Forms, measurements, density, mappings, and substitutions

| Concern | Evidence and recommendation |
|---|---|
| Forms | Add none. The proposed identity already denotes the marketed uncooked grain product. Do not add a `sprouted` form to ordinary brown rice or infer a cooked form without a bundled recipe or separate form decision. |
| Measurements | NOW Foods gives one product's `1/4 cup dry (51 g)` label serving and a 16 oz package. Walmart Canada's French listing for the same brand shows `1/4 cup (46 g)` and a 16 oz package. Preserve the conflicting package-specific values as evidence only if later useful; add no active measure. Package size is not a recipe portion. |
| Density and unit mappings | Keep `defaultDensity: null` and `unitMappings: []`. The two product labels do not provide a consistent generic cup mass; neither establishes a reusable density. |
| Cooking instructions and yield | NOW's one-SKU instructions use one cup of rice with 2½ cups of water, cook for 45–50 minutes, then stand for 5 minutes. These are product-specific directions, not a general water conversion or yield. The FAO source distinguishes dry and moist commercial products and discusses preparation, but does not establish a reusable recipe ratio. Add no conversion or yield. |
| Substitutions | Add no rule. The FAO paper says the product can be cooked similarly to white rice, but gives no universal amount or preparation crosswalk. A NOW Foods power-bowl page lists sprouted brown rice or quinoa as selectable base options; that is source-specific recipe context, not a global or contextual substitution rule. Do not infer interchangeability with brown rice, white rice, quinoa, or any named variety. |
| Health claims | Do not carry marketing or research health claims into catalog notes, substitutions, or user-facing ingredient behavior. They are outside this identity decision. |

## Proposal-local source register

Sources were reviewed on 2026-10-12. The source IDs below are proposal-local and were checked absent from the 4,853 distinct IDs in the shared ledger.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-GBR-20261012-S01` | NOW Foods, [Sprouted Brown Rice, Organic](https://www.nowfoods.com/products/natural-foods/sprouted-brown-rice-organic?SKU=1043), product description, ingredients, nutrition label, and cooking directions. | First-party product page describes sprouted brown-rice grains sold in a 16 oz bag for cooking and lists sprouted brown rice as the sole ingredient. It reports a product-specific ¼-cup dry/51 g serving and cooking directions; none is generalized. |
| `WP03-GBR-20261012-S02` | Walmart Canada (French), [NOW Foods — Riz Brun Germé Biologique](https://www.walmart.ca/fr/ip/NOW-Foods-Riz-Brun-Germ-Biologique-16-oz/32HR7I4QR3G4), product title, ingredient line, and supplemental facts. | Canadian French retailer wording supports `riz brun germé`; the listing gives one 16 oz package and ¼ cup/46 g. Walmart says supplier and third-party marketplace details are not independently verified. The serving conflicts with NOW's own page, so it is evidence about that listing only. |
| `WP03-GBR-20261012-S03` | Food and Agriculture Organization, Ito and Ishikawa, [Marketing of value-added rice products in Japan: Germinated brown rice and rice bread](https://www.fao.org/4/a0033e/a0033e0a.htm), *Rice in Global Markets* conference proceedings, 2004, English and French sections. | Establishes a named product class in English and French (`germinated brown rice / riz brun germé`), describes soaking/germination, and distinguishes dry and moist commercial packages. It reports historical Japanese market context and source-specific process descriptions; it is not a Canadian retail standard, food-safety protocol, serving measure, or universal preparation rule. Nutritional and health statements are not adopted. |
| `WP03-GBR-20261012-S04` | Canadian Intellectual Property Office, [Canadian Patents Issued, September 30, 2003](https://publications.gc.ca/collections/collection_2016/opic-cipo/RG42-5-131-39.pdf), patent 2,346,582 title. | The official Canadian archive pairs the title `Germinated brown rice` with `Riz brun germé`. This corroborates bilingual technical wording, not an OQLF/TERMIUM ruling or current consumer-label practice. |
| `WP03-GBR-20261012-S05` | Well.ca, [Organic Sprouted Brown Basmati Rice](https://well.ca/products/lundberg-organic-sprouted-brown_143101.html) and [Organic Sprouted Short Brown Rice](https://well.ca/products/lundberg-organic-sprouted-short_143103.html). | Canadian retailer pages record separate sprouted brown-basmati and short-brown product names, ingredient wording, 454 g packages, and product-specific cook-time claims. The pages were marked no longer available when reviewed; use as historical Canadian listing evidence, not current availability or a name for every rice class. |
| `WP03-GBR-20261012-S06` | NOW Foods, [Build Your Power Bowls](https://www.nowfoods.com/healthy-living/recipes/build-your-power-bowls), base-selection section. | Lists the company's sprouted brown rice and quinoa as possible bowl bases. This is one recipe's choice and does not supply a transferable amount, conversion, or substitution rule. |

## Review disposition

**Recommend an identity-only `sprouted brown rice / riz brun germé` reference** with `germinated brown rice` as its sole English alias. The exact product and bilingual wording have Canadian retail, primary manufacturer, and FAO support, and the normalized ownership audit found no existing exact owner or bundled recipe demand. Keep the row in `GRAIN_AND_CEREAL`; add no French aliases, forms, measures, density, unit mappings, recipe links, conversions, yields, or substitution rules. Preserve the sprouted brown-rice flour, cooked/moist rice, and other rice-class boundaries above. This proposal does not close the broader Section F cereal/preprocessed-grain checklist.
