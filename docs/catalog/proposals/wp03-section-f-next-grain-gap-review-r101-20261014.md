# WP03 Section F — Weetabix whole-grain cereal identity review (2026-10-14)

## Review record

- **Scope:** the current Canadian plain Weetabix whole-grain cereal biscuit product, its Québec French display, picker names, recipe demand, and supported measures.
- **Checklist:** Section F still leaves regionally significant cereal mixes and preprocessed grains open ([global plan, line 2906](../../RecipeBook-global-ingredient-catalog-plan.txt#L2906)). The checklist now includes Kashi GoActive Original, Bob’s Red Mill 10 Grain Hot Cereal, Biowig Millet Cream, and other distinct processed-cereal decisions. This review covers only Weetabix.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference for the currently listed Canadian Weetabix cereal. Do not create a generic wheat-cereal-biscuit identity, a form under shredded wheat, or a product-family row for other Weetabix variants.
- **Proposal status:** Accepted and integrated 2026-10-14. The ownership and picker audit below records the pre-integration snapshot.

## Identity and boundary

The Canadian catalog context is current: Post Consumer Brands Canada lists Weetabix among its Canadian cereal brands [S01–S02], and current Québec grocery and consumer-product pages list a 400 g Weetabix whole-grain cereal product [S03–S04]. Metro’s French product card calls it **Céréales à grains entiers Weetabix** and lists whole-grain wheat, malt extract, cane sugar, and salt. Health Canada’s Canadian Nutrient File (CNF) separately classifies “Weetabix” as ready-to-eat cereal under food code 1249 [S05]. These sources support one named, packaged cereal identity. They do not establish a universal wheat-biscuit process or make all products called cereal biscuits equivalent.

Keep the candidate limited to the plain Weetabix whole-grain cereal listed for Canadian sale. Keep Weetabix Chocolate, Crispy Minis, other formed or sweetened Weetabix products, generic shredded-wheat cereal, wheat flakes, puffed wheat, and wheat grain separate. The manufacturer lists Original and Chocolate as different products; the Canadian and Québec sources identify the local 400 g Weetabix product, but do not establish that its formulation is identical to the UK Original SKU [S03–S04, S06]. Protégez-Vous groups this product in a consumer category that includes biscuits of *blé filamenté*; this category label does not justify making `blé filamenté` an alias or treating Weetabix as the active shredded-wheat identity [S04].

## Proposed canonical reference if accepted

Use the locally listed product wording. The French display is directly attested by Québec retailer and consumer-product sources; this is not presented as an OQLF terminology ruling.

```json
{
  "id": "ingredient-ref-weetabix-whole-grain-cereal",
  "nameEn": "Weetabix whole-grain cereal",
  "nameFr": "Céréales à grains entiers Weetabix",
  "aliasesEn": ["Weetabix cereal"],
  "aliasesFr": ["Céréales Weetabix"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

`Weetabix cereal` is supported by current Canadian retail wording and the CNF product name; `Céréales Weetabix` is the source-attested shorter Québec product wording [S05, S08–S09]. Do not add aliases `Post`, `Post Weetabix Cereal`, `blé filamenté`, `biscuits de blé filamenté`, `wheat biscuits`, `whole wheat`, or `whole grain cereal`. The first two invite generic `post` matches, and the others broaden the row to wheat classes or names already associated with other cereal products.

## Current ownership and picker projection

The live snapshot contains 1,438 active ingredient references, 105 forms, 63 legacy import candidates, and 1,778 ledger records. Exact normalized-key searches found no owner for the proposed ID, English or French displays, or aliases across those files. No prior proposal, batch, plan entry, or roadmap decision names Weetabix. The adjacent active `shredded wheat cereal / blé filamenté` identity is a related cereal type, not an exact owner for this brand product. No Weetabix form exists.

The table applies the current phrase-first, then substring-fallback behavior in `IngredientSearch.kt` to the live package snapshot. It is a static projection, not emulator or UI testing.

| Query | Current results | With proposed row | Effect |
|---|---:|---:|---|
| `Weetabix` | 0 | 1 | Finds the named brand product. |
| `Weetabix cereal` | 0 | 1 | Finds the Canadian retail/CNF wording through the English alias. |
| `Céréales Weetabix` | 0 | 1 | Finds the shorter French retail wording through the French alias. |
| `Céréales à grains entiers Weetabix` | 0 | 1 | Finds the full Québec display. |
| `cereal` | 16 | 17 | Adds one product to the expected generic cereal results. |
| `céréales` | 12 | 13 | Adds one product to the expected French cereal results. |
| `whole grain` | 1 | 2 | Adds Weetabix beside the existing whole-grain mustard result. |
| `wheat` / `blé` | 44 / 47 | 44 / 47 | Unchanged; no generic wheat alias is proposed. |
| `blé filamenté` | 1 | 1 | Remains with the existing shredded-wheat identity. |
| `shredded wheat` | 1 | 1 | Remains with the existing shredded-wheat identity. |

The product is reachable by its brand name, product phrase, and French display. Broad cereal queries gain the expected named cereal. No existing wheat, *blé filamenté*, or shredded-wheat result is displaced or expanded.

## Bundled recipe demand

I scanned all 114 manifest-listed recipe files and each of their 1,123 ingredient rows. Search terms covered `Weetabix`, `Weetabix cereal`, `Post Weetabix`, both proposed displays and aliases, `Weetabix Original`, and cereal-biscuit wording in English and French. The scan found **zero recipe-file matches and zero ingredient-row matches**. No recipe link, relink, quantity assignment, recipe edit, or substitution is proposed.

## Forms, measures, and substitutions

- **Forms:** add none. The identity is the packaged ready-to-eat product itself. The source set does not establish a generic raw-grain state conversion or a separate form on wheat or shredded wheat.
- **CNF portions:** Health Canada food code 1249 lists 100 mL = 24.1 g, 250 mL = 60.2 g, 2 biscuits = 35.0 g, and 30 g = 30.0 g [S05]. Keep these as product-code-specific observations in research evidence only; do not add an active density, volume mapping, count measure, or conversion from this historical CNF record.
- **Manufacturer comparison:** the current Weetabix UK Original page lists 2 biscuits at 37.5 g, not the CNF’s 35.0 g. This supports the warning against transferring UK package quantities or formula to the Canadian product [S06]. Neither value should be averaged or used as a universal biscuit-cereal measure.
- **Density and mappings:** leave `defaultDensity` null and `unitMappings` empty. Do not derive a generic cereal density from CNF volume portions.
- **Substitutions:** add no global or contextual rule. Sources do not give a tested quantity for replacing Weetabix with shredded wheat, wheat flakes, or another ready-to-eat cereal.

## Source register

Sources were checked online on **2026-10-14**. Source IDs below are proposal-local; they have not been added to the research ledger.

| Source ID | Source and date | Supports and limits |
|---|---|---|
| `WP03-WEETABIX-20261014-S01` | Post Consumer Brands Canada, [Brands](https://www.postconsumerbrands.ca/category/brands/), current page, ©2026; accessed 2026-10-14. | The Canadian manufacturer’s brand directory lists Weetabix among cereal brands. It does not provide the Canadian product’s current ingredients or measurements. |
| `WP03-WEETABIX-20261014-S02` | Post Consumer Brands Canada, [Nos Marques](https://www.postconsumerbrands.ca/fr-ca/nos-marques/), page dated 2025-12-02; accessed 2026-10-14. | The Canadian company’s French-language brand page also lists Weetabix. It supports Canadian French brand context, not a translated product title or formula. |
| `WP03-WEETABIX-20261014-S03` | Metro, [Céréales à grains entiers Weetabix, 400 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-a-grains-entiers/p/628154490203), product UPC 628154490203; search-indexed page checked 2026-10-14. | The Québec retailer’s indexed card gives the French product title, 400 g package, and ingredient statement. Direct page opening returned 403 during this review; the title and ingredients were cross-checked against S04. Do not treat retailer package size as a measure. |
| `WP03-WEETABIX-20261014-S04` | Protégez-Vous, [WEETABIX Céréales à grains entiers](https://www.protegez-vous.ca/sante-et-alimentation/cereales/comparez-toutes-les-cereales-a-dejeuner/weetabix-cereales-a-grains-entiers), ©2025; accessed 2026-10-14. | Québec consumer-product page uses the full French product wording, lists a 400 g package and current retailer links including IGA, Maxi, Metro, Provigo, and Super C, and categorizes it with cereal biscuits. Its price is explicitly not current; it is naming/product-context evidence, not a label source or terminology ruling. |
| `WP03-WEETABIX-20261014-S05` | Health Canada, [Canadian Nutrient File food code 1249: serving sizes](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1249), page last modified 2019-03-01; accessed 2026-10-14. | Official bilingual name is “Cereal, ready to eat, Weetabix, Weetabix / Céréale, prête-à-manger, Weetabix, Weetabix.” It lists product-code portions including 100 mL, 250 mL, 2 biscuits, and 30 g. This is an older CNF observation, not a current package label or reusable cereal conversion. |
| `WP03-WEETABIX-20261014-S06` | Weetabix, [Weetabix Original](https://weetabix.com/our-products/weetabix/weetabix/), current UK manufacturer page, ©2026; accessed 2026-10-14. | Separately lists Original and Chocolate products and describes its UK Original cereal and ingredients. Its UK serving is 2 biscuits (37.5 g), differing from Health Canada’s 35.0 g. Use it only to bound product variants and demonstrate market-specific limits; do not transfer UK formulation or quantities to Canada. |
| `WP03-WEETABIX-20261014-S07` | Save-On-Foods, [Weetabix — Whole Grain Cereal, 400 g](https://www.saveonfoods.com/sm/pickup/rsid/953/product/weetabix-whole-grain-cereal-id-00628154490203), Canadian product listing; accessed 2026-10-14. | The indexed Canadian English listing supports the display wording and says the product is made with 100% whole-grain wheat. Its listed sale window ended 2026-10-08; no price or stock claim is used here. |
| `WP03-WEETABIX-20261014-S08` | Provigo, [Post Céréales Weetabix, 400 g](https://www.provigo.ca/fr/c-r-ales-weetabix/p/21713718_EA?icta=recommended-carousel), Québec French retailer listing; search-indexed page checked 2026-10-14. | The indexed product title directly supports the alias `Céréales Weetabix`. Direct page opening returned a cache miss during this review; use Metro and Protégez-Vous for the full French display and product cross-check. |
| `WP03-WEETABIX-20261014-S09` | Real Canadian Superstore, [Weetabix product search](https://www.realcanadiansuperstore.ca/en/search?search-bar=Weetabix), current Canadian retailer search page; checked 2026-10-14. | The indexed result is titled `Post Weetabix Cereal 400 g`, supporting the shorter English phrase used as an alias. The search page is not an ingredient label; no formula or measurement claim is taken from it. |

## Static checks and limits

- Exact normalized ownership check: no proposed ID/display/alias owner in the 1,438 active references, 105 forms, 63 legacy candidates, or 1,778 ledger records.
- Picker projection: followed the current `IngredientSearch.kt` phrase-first and substring-fallback rules against live references and forms; no emulator or UI check was run.
- Recipe scan: 114 manifest files, 1,123 ingredient rows, zero Weetabix/product-phrase hits.
- Scope check: no prior Weetabix proposal or batch and no exact plan/roadmap decision was found. The existing shredded-wheat row and Weetabix product are kept separately; `blé filamenté` is not added to the proposed aliases.
- Evidence limit: current Canadian brand and Québec retail pages establish a named local product, while CNF’s serving data is dated and manufacturer formula data available on Weetabix’s product page is UK-specific. This proposal therefore recommends identity-only data and no active quantity behavior.
- Document check: UTF-8 without BOM; source IDs are unique within this proposal; no mojibake markers or trailing whitespace. All local relative links were checked against the repository.
- No app tests or emulator work were run. This is a proposal-only review, and no database JSON was changed.

## Integration update

Added the identity-only Canadian Weetabix cereal reference with the proposed Québec display and two source-attested title variants. The four CNF portion values are retained in the ledger only as product-code-specific evidence; no active measure, density, mapping, form, conversion, yield, recipe link, or substitution was added. The checklist and roadmap record the integration. See the [integration README](../batches/wp03-section-f-weetabix-whole-grain-cereal-integration-20261014/README.md).

Static validation passed: bundled-package normalization and validation, reference normalization, generated-index freshness (1,440 references), and ledger validation (1,780 records, zero errors). Picker projections match the proposal; the 114-recipe / 1,123-row scan found no candidate demand. Encoding, local links, and scoped whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because this only adds database JSON data and its generated index.
