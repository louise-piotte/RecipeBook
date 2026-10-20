# WP03 Section F: All-Bran Canadian cereal family review (R203)

## Packet record

- **Status:** Integrated as four identity-only references with product-specific ledger observations.
- **Reviewed:** 2026-10-16.
- **Open plan item:** the WP03 Section F parent at [the regional cereal-mix and preprocessed-grain checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3626).
- **Reopened condition:** R187 held All-Bran Buds until the manufacturer-listed family could be reviewed together. This packet completes that family review. See the [R187 proposal](wp03-section-f-all-bran-buds-family-picker-hold-review-r187-20261016.md) and [hold integration README](../batches/wp03-section-f-all-bran-buds-family-picker-hold-integration-r187-20261016/README.md).
- **Recommendation:** add the four separately named All-Bran ready-to-eat cereal products together as identity-only `GRAIN_AND_CEREAL` references. Keep their aliases empty and retain each supported serving only as a SKU-specific ledger observation.
- **Scope:** All-Bran Flakes, All-Bran Original, All-Bran Buds, and All-Bran Frosted Bran Flakes. Do not merge the finished products with each other, generic bran-flakes cereal, wheat bran, or psyllium.

## Decision and identity boundary

The Canadian manufacturer’s English and Québec French Where-to-Buy pages list four All-Bran products. The French page uses the Québec region selector and reports the Frosted Bran Flakes product from one online retailer. The manufacturer’s French All-Bran family page also lists four; its English brand landing page currently lists three, omitting Frosted Bran Flakes. The English and French Where-to-Buy pages both list all four. The Frosted Bran Flakes product-detail URLs now return “Product Not Available,” while the manufacturer Where-to-Buy page and a Québec Metro listing still carry the product. The Metro listing was out of stock for the selected store during the check. Preserve that source conflict and do not claim current local stock.

The manufacturer’s product titles support these four narrow identities:

| Proposed reference ID | English display | French display | Boundary |
| --- | --- | --- | --- |
| `ingredient-ref-all-bran-flakes-cereal` | `All-Bran Flakes Cereal` | `Céréales All-Bran Flakes` | The named All-Bran product, separate from the generic `bran flakes cereal` row. |
| `ingredient-ref-all-bran-original-cereal` | `All-Bran Original Cereal` | `Céréales All-Bran Original` | The named Original product; do not alias it to wheat bran or generic bran cereal. |
| `ingredient-ref-all-bran-buds-cereal` | `All-Bran Buds Cereal` | `Céréales All-Bran Buds` | The named Buds product, including the manufacturer’s product-specific bran/psyllium formulation. This is the ID previously sketched in R187. |
| `ingredient-ref-all-bran-frosted-bran-flakes` | `All-Bran Frosted Bran Flakes` | `Flocons de son givrés All-Bran` | The separately listed Frosted product; retain the product-qualified French wording from the manufacturer and Québec market. |

Use no aliases. The four bilingual product names already make broad `All-Bran` searches return the family. Do not add the Québec retailer phrase `céréales de son en flocons format familial` as a Flakes alias: it normalizes to the existing generic French display `céréales de son en flocons`. Do not add `All-Bran` as a separate alias to any row. This is current commercial French, not an OQLF terminology ruling.

## Ownership and archive audit

Read-only audit of the live package and ledger on 2026-10-16:

| Surface | Current state and result |
| --- | --- |
| Active ingredient references | 1,588 references. No exact normalized owner exists for the four proposed bilingual product pairs or IDs. The existing `ingredient-ref-bran-flakes-cereal` owns only generic `bran flakes cereal / céréales de son en flocons`; the R203 proposal keeps it unchanged. |
| Ingredient forms | 122 forms. None owns an All-Bran title or product state; no form is proposed. |
| Legacy import identities | 61 candidates. No exact product title or proposed ID is allocated. |
| Research ledger | 1,933 records. No All-Bran Buds, Original, Flakes, or Frosted product record exists. The existing generic bran-flakes record cites All-Bran sources as product-boundary evidence; that source ownership does not convert its generic identity into a branded SKU. |
| Prior All-Bran work | R187 held Buds outside active data and reserved `ingredient-ref-all-bran-buds-cereal` as a future ID; reuse that ID and its R187 source IDs. The current manufacturer family source already on the generic bran-flakes record is `WP03-BRAN-FLAKES-CEREAL-20261012-S04`; reuse that source ID instead of registering the same URL again. The Flakes manufacturer product-page sources `WP03-BRAN-FLAKES-CEREAL-20261012-S01` and `-S02` are also already registered; reuse them. The [generic bran-flakes proposal](wp03-section-f-bran-flakes-cereal-identity-review-20261012.md) and [batch README](../batches/wp03-section-f-bran-flakes-cereal-identity-integration-20261012/README.md) keep that broad identity separate. |
| Other source ownership | New R203 source IDs and new R203 URLs S01–S08 were checked against the live ledger and proposal/batch archive. Each new ID maps to one URL; no new URL is repeated. Reuse R187 Buds IDs `WP03-ALL-BRAN-BUDS-R187-20261016-S01–S04` without minting replacements; those source IDs are reserved in R187 but not yet registered in the shared ledger. |
| Bundled recipe corpus | All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned for All-Bran family names, normalized variants, Buds/Flakes terms, and French product wording. No matching row, recipe link, or product demand was found. |

The exact-key ownership audit used the project’s search normalization for reference names and aliases, form labels and match terms, legacy candidates, and ledger IDs. The broad English word `bran` is already used by several ingredient and cereal identities; none is a named All-Bran SKU. The product title `Céréales de son en flocons` remains owned by the generic bran-flakes row and is not transferred.

## Picker projection

The picker prefers complete normalized word phrases, then falls back to partial matching. The projection below adds only the four canonical names and no aliases or forms.

| Query | Current result | With the four references |
| --- | --- | --- |
| `All-Bran` / `All Bran` | 0 | Four All-Bran products. This completes the R187 family-query boundary. |
| `All-Bran Buds Cereal` | 0 | Buds only. |
| `All-Bran Original Cereal` | 0 | Original only. |
| `All-Bran Flakes Cereal` | 0 | Flakes only. |
| `All-Bran Frosted Bran Flakes` | 0 | Frosted Bran Flakes only. |
| `bran flakes cereal` | Generic bran-flakes cereal only. | Generic bran-flakes cereal and All-Bran Flakes. |
| `bran flakes` | Generic bran-flakes cereal only. | Generic bran-flakes cereal, All-Bran Flakes, and All-Bran Frosted Bran Flakes. |
| `céréales de son en flocons` | Generic bran-flakes cereal only. | Same generic result; the retailer’s overlapping phrase is not added as an alias. |
| `Flocons de son givrés` | 0 | All-Bran Frosted Bran Flakes only. |

Queries such as `bran` remain broad and may return other bran ingredients; the proposal adds no broad `bran` alias. The product-family names remain individually selectable without presenting the generic bran-flakes row as one of the manufacturer SKUs.

## Product-specific measures and substitution boundary

| Product | Source-reported label evidence | Proposed ledger treatment |
| --- | --- | --- |
| All-Bran Flakes | Manufacturer’s current product page reports a 34 g serving, without a household volume. A current Provigo search-indexed listing reports 1 cup (34 g), but direct page retrieval returned no body during this review. | Keep the manufacturer’s 34 g statement as source-specific product context. Do not create a cup-to-mass observation from the inaccessible retailer panel unless the package or page is directly reviewable during integration. Set no active measure, density, or mapping. |
| All-Bran Original | Manufacturer’s English and French product pages report 1/2 cup (36 g), with a 525 g package. | Record the manufacturer serving only as an Original-SKU ledger observation. Package size is not a portion or conversion. |
| All-Bran Buds | Manufacturer’s English and French pages report 1/3 cup (28 g), with 500 g and 1,050 g packages. | Reuse the R187 product-page IDs for one Buds-SKU ledger observation. Do not transfer its measure to other cereals. |
| All-Bran Frosted Bran Flakes | WK Kellogg SmartLabel gives 1 cup (44 g) for GTIN `00059724103221`, 360 g. | Record one manufacturer-label observation for that Frosted SKU. The product detail page’s unavailable state and Metro’s selected-store stock state do not make the label a family measure. |

No label establishes loose-fill methodology or a reusable density. Keep `defaultDensity` null and `unitMappings` empty for all four rows. Do not infer a measure from package weight, nutritional serving size, or a different cereal’s serving.

The manufacturer’s `Simple Savoury Topping` recipe lists 2 cups All-Bran Buds **or** 2 cups All-Bran Original for that one named preparation [reused R187 S04]. Record this only as a recipe-specific manufacturer option if the evidence is retained in the ledger. It does not establish general ingredient interchangeability, a reusable mass ratio, or a runtime contextual substitution. The recipe corpus has no matching line, so add no recipe link or substitution rule.

## Conditional reference and ledger details

If accepted, add exactly these identity-only rows to `ingredient-references.v1.json`:

```json
[
  {
    "id": "ingredient-ref-all-bran-flakes-cereal",
    "nameEn": "All-Bran Flakes Cereal",
    "nameFr": "C\u00e9r\u00e9ales All-Bran Flakes",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-16T00:00:00Z",
    "category": "GRAIN_AND_CEREAL"
  },
  {
    "id": "ingredient-ref-all-bran-original-cereal",
    "nameEn": "All-Bran Original Cereal",
    "nameFr": "C\u00e9r\u00e9ales All-Bran Original",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-16T00:00:00Z",
    "category": "GRAIN_AND_CEREAL"
  },
  {
    "id": "ingredient-ref-all-bran-buds-cereal",
    "nameEn": "All-Bran Buds Cereal",
    "nameFr": "C\u00e9r\u00e9ales All-Bran Buds",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-16T00:00:00Z",
    "category": "GRAIN_AND_CEREAL"
  },
  {
    "id": "ingredient-ref-all-bran-frosted-bran-flakes",
    "nameEn": "All-Bran Frosted Bran Flakes",
    "nameFr": "Flocons de son givr\u00e9s All-Bran",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-16T00:00:00Z",
    "category": "GRAIN_AND_CEREAL"
  }
]
```

For each new reference, append an `ingredient_reference` ledger record keyed by the same ID, with `identityState: verified`, `substitutionResearchState: researched_no_supported_substitute`, no forms, and one accepted decision scoped to the named Canadian SKU. Add the current Where-to-Buy sources S02/S03 to the family decision as roster evidence; reuse existing family-page ID `WP03-BRAN-FLAKES-CEREAL-20261012-S04`. Do not duplicate a URL under a new source ID.

Use these row-level source and measurement assignments; add each source object once per source ID/URL and reuse an existing ID when listed:

| Ledger record | Row-specific sources in addition to shared family sources S02/S03 | Measurement state and observation |
| --- | --- | --- |
| `ingredient-ref-all-bran-flakes-cereal` | Reuse `WP03-BRAN-FLAKES-CEREAL-20261012-S01`, `-S02`, and family page `-S04`; add R203 S06 for the current Provigo listing. | `researched_no_supported_value`; no observation until the inaccessible Provigo nutrition panel can be checked directly. |
| `ingredient-ref-all-bran-original-cereal` | R203 S04 and S05. | `researched_supported`; `all-bran-original-half-cup-36g-r203-20261016`, source quantity 1/2 cup, observed mass 36 g, sources S04/S05. |
| `ingredient-ref-all-bran-buds-cereal` | Reuse archived R187 S01 and S02 for the manufacturer pages and R187 S03 for the Metro Québec listing. Include R187 S04 on the Buds record only if retaining its recipe-specific Buds-or-Original option as a ledger note. | `researched_supported`; `all-bran-buds-one-third-cup-28g-r203-20261016`, source quantity 1/3 cup, observed mass 28 g, sources R187 S01/S02. |
| `ingredient-ref-all-bran-frosted-bran-flakes` | R203 S07/S08, plus reused `WP03-BRAN-FLAKES-CEREAL-20261012-S04` for the French family title. | `researched_supported`; `all-bran-frosted-one-cup-44g-r203-20261016`, source quantity 1 cup, observed mass 44 g, source S08. |

Each portion observation uses `relationship: portion_weight`, `valueUnit: g`, `foodState: dry ready-to-eat cereal, as sold`, and a quantity basis that limits it to that SKU and rejects a generic cereal measure, density, or conversion. Use `evidenceKind: manufacturer_label` for Original, Buds, and Frosted. The manufacturer does not specify a cup convention; record that limit in the observation's measurement method or quantity basis, not as a separate schema field.

Record SKU-specific `portion_weight` observations only for Original (1/2 cup, 36 g), Buds (1/3 cup, 28 g), and Frosted Bran Flakes (1 cup, 44 g), using each product’s own source ID(s), `foodState: dry ready-to-eat cereal, as sold`, and a quantity basis stating that the serving applies only to that SKU and is not a general cereal measure, density, or conversion. Use `unitConvention: Not specified by the manufacturer` for cup observations where the source does not define the cup convention. Set each of those rows’ `measurementState: researched_supported`.

For Flakes, the manufacturer’s 34 g-only serving does not supply a household-volume measure; the Provigo panel is not directly retrievable in this review. Set `measurementState: researched_no_supported_value` and add no measurement observation unless an integration reviewer can inspect a current package or directly accessible label. No default measure, density, mapping, form, conversion, yield, recipe link, or global/contextual substitution rule is proposed for any row.

## Source register and reuse audit

Sources checked online on 2026-10-16. Each **new** source ID below maps to one new URL. The current English family landing page lists three products; the current English and French Where-to-Buy pages list four. The older direct Frosted product pages return “Product Not Available”; do not register those former product URLs as new sources. No source below establishes general formula equivalence among the four products.

| Source ID | Source URL | Supports and limits |
| --- | --- | --- |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S01` | WK Kellogg Co Canada, [All-Bran English family page](https://www.wkkellogg.ca/en/our-foods/our-brands/all-bran) | Current brand landing page lists Flakes, Original, and Buds. It omits Frosted Bran Flakes, so do not use it alone as the complete roster. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S02` | WK Kellogg Co Canada, [English Where to Buy](https://www.wkkellogg.ca/en/where-to-buy) | Current Canadian listing names all four All-Bran products; Frosted is shown with two online retailers in the Ontario view. Supports manufacturer roster and English product titles, not Québec inventory. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S03` | WK Kellogg Co Canada, [Où Acheter](https://www.wkkellogg.ca/fr/ou-acheter) | Current French page uses Québec region and lists all four; Frosted is shown with one online retailer. The displayed English product title for Frosted is not by itself a French naming source. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S04` | WK Kellogg Co Canada, [All-Bran Original Cereal](https://www.wkkellogg.ca/en/products/all-bran-original-cereal-product) | Current English product name, ingredients, 525 g package, and 1/2 cup (36 g) manufacturer serving. SKU-specific evidence only. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S05` | WK Kellogg Co Canada, [Céréales All-Bran Original](https://www.wkkellogg.ca/fr/produits/cereales-all-bran-original-product) | Current Québec-facing French product title, the same product-specific 1/2 cup (36 g) serving, and Québec retailer links. Manufacturer French wording, not an OQLF ruling. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S06` | Provigo Québec, [All-Bran Flakes listing](https://www.provigo.ca/fr/all-bran-all-bran-c-r-ales-flakes/p/21653774_EA?source=sptd) | Current indexed Québec listing identifies product 21653774_EA and reports 1 cup (34 g), with Longueuil availability. Direct page retrieval returned no body; treat its volume/mass panel as provisional retailer evidence, not as a finalized reusable measure. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S07` | Metro Québec, [Céréales de flocons de son givrés, All-Bran](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-de-flocons-de-son-givres/p/059724103221) | Québec retailer listing for All-Bran product 059724103221, 360 g, with French title and ingredient information. The page redirected to English and reported out of stock for the selected store; do not claim local stock. |
| `WP03-ALL-BRAN-FAMILY-R203-20261016-S08` | WK Kellogg Canada SmartLabel, [Flocons de son givrés All-Bran](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00059724103221) | Current manufacturer label for GTIN 00059724103221 reports 1 cup (44 g), 360 g product, ingredients, and French product title. SKU-specific nutrition-label evidence only. |
| Reuse `WP03-BRAN-FLAKES-CEREAL-20261012-S01` | WK Kellogg Co Canada, [All-Bran Flakes Cereal](https://www.wkkellogg.ca/en/products/all-bran-flakes-cereal-product) | Already registered on `ingredient-ref-bran-flakes-cereal`. Reuse its existing source ID for the current English branded product title and 34 g serving; do not register the URL again. |
| Reuse `WP03-BRAN-FLAKES-CEREAL-20261012-S02` | WK Kellogg Co Canada, [Céréales All-Bran Flakes](https://www.wkkellogg.ca/fr/produits/cereales-all-bran-flakes-product) | Already registered on the generic bran-flakes record. Reuse its existing source ID for the current French branded title and Québec retailer listings. |
| Reuse `WP03-BRAN-FLAKES-CEREAL-20261012-S04` | WK Kellogg Co Canada, [All-Bran French family page](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/all-bran) | Existing ledger source; currently lists all four French family titles. Reuse the existing ID and URL. |
| Reuse `WP03-ALL-BRAN-BUDS-R187-20261016-S01` | WK Kellogg Co Canada, [All-Bran Buds Cereal](https://www.wkkellogg.ca/en/products/all-bran-buds-cereal-product) | Reserved in R187, not yet in the live ledger. Reuse this ID for the current English title and 1/3 cup (28 g) serving; do not mint another ID for the URL. |
| Reuse `WP03-ALL-BRAN-BUDS-R187-20261016-S02` | WK Kellogg Co Canada, [Céréales All-Bran Buds](https://www.wkkellogg.ca/fr/produits/cereales-all-bran-buds-product) | Reserved in R187, not yet in the live ledger. Reuse for the current Québec-facing French title and same manufacturer serving. |
| Reuse `WP03-ALL-BRAN-BUDS-R187-20261016-S03` | Metro Québec, [Céréales de son, All-Bran Buds](https://www.metro.ca/epicerie-en-ligne/allees/aliments-vegetariens-et-vegetaliens/garde-manger/cereales-de-son/p/064100000704) | Reserved in R187, not yet in the live ledger. Reuse for the Québec retailer title and product number; do not use it for nutrition data. |
| Reuse `WP03-ALL-BRAN-BUDS-R187-20261016-S04` | WK Kellogg Co Canada, [Simple Savoury Topping](https://www.wkkellogg.ca/en/recipes/simple-savoury-topping-recipe) | Reserved in R187, not yet in the live ledger. Reuse only for the one recipe’s “2 cups Buds or 2 cups Original” option; it does not support a general substitution. |

## Reopen conditions

Recheck the family if either current manufacturer Where-to-Buy page removes or renames a product, if Québec product listings change the French titles, or if new package evidence changes an individual serving. Reopen numeric behavior only with evidence for a reproducible household measure or density on that specific product; reopen substitution modeling only with a clear recipe role and bounded dish/method scope. Reopen recipe linking if an All-Bran product appears in the bundled corpus. If the Frosted product disappears from both manufacturer Where-to-Buy pages and Québec product listings, revisit its active identity separately. The current evidence does not support forms, density, unit mappings, conversions, yields, recipe links, or reusable substitution rules.

## Verification scope

This packet changes documentation only. It does not edit shared catalog or ledger JSON, the checklist, roadmap, or generated data. No software tests or emulator checks were run. If integration only adds database JSON data, the workspace `AGENTS.md` rule says testing is not needed.
