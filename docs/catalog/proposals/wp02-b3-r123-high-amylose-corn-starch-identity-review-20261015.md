# WP02 Section 04 B3 R123 — high-amylose corn starch identity and recipe boundary

- **Reviewed:** 2026-10-15.
- **Status:** Integrated on 2026-10-15; see [the batch README](../batches/wp02-b3-high-amylose-corn-starch-identity-integration-r123-20261015/README.md).
- **Scope:** The Canadian accepted-fibre class named `resistant corn starch` / `high amylose corn starch`, distinct from ordinary corn starch, chemically modified corn starch, and other resistant-starch sources.
- **Proposal-local source-ID prefix:** `WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015`; checked against the current ledger and proposal/batch archive with no collision found.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **high amylose corn starch / amidon de maïs à haute teneur en amylose**, proposed as `ingredient-ref-high-amylose-corn-starch`. Add `resistant corn starch` and `amidon résistant de maïs` as English and French search aliases, respectively. Keep density null, unit mappings empty, and add no forms, conversions, yields, recipe links, or active substitutions.

Health Canada lists `resistant corn starch` and `high amylose corn starch` as names for one class produced by milling high-amylose corn grain, with or without hydrothermal treatment; its French table gives the parallel names `amidon résistant de maïs` and `amidon de maïs à haute teneur en amylose`. It reports that amylose in the high-amylose corn grain ranges from 50% to 90%. This source-defined class is distinct from generic cornstarch and from the separate, chemically modified corn-starch identity integrated in R92. [S01–S02, S07]

Ingredion's 2025 ingredient statement identifies HI-MAIZE® 260 as 100% corn starch derived from high-amylose corn, and its January 2026 origin statement says that product is sold to customers in Canada and the United States. This supports a current Canadian commercial example, not consumer-size or Québec retail availability. Diabète Québec uses the shorter local wording `amidon résistant de maïs`; the proposed French display follows Health Canada's more specific bilingual class name. No OQLF entry for this high-amylose qualifier was found. [S03–S05]

Do not add generic `corn starch` / `amidon de maïs`, `resistant starch` / `amidon résistant`, `RS2`, `HI-MAIZE 260`, or product-grade names as aliases. The generic corn-starch names belong to the existing ordinary cornstarch row; `resistant starch` omits the source and can cover other classes; `HI-MAIZE 260` is a brand/product. Keep this identity separate from R92 `modified corn starch / amidon de maïs modifié`. [S01–S02, S06–S07]

### Proposed reference delta

```json
{
  "id": "ingredient-ref-high-amylose-corn-starch",
  "nameEn": "high amylose corn starch",
  "nameFr": "amidon de maïs à haute teneur en amylose",
  "aliasesEn": ["resistant corn starch"],
  "aliasesFr": ["amidon résistant de maïs"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

If accepted, add a verified `ingredient_reference` ledger record with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_supported`. The latter reflects only the bounded bagel-study finding below; it must not create a `SubstitutionRule`, a `ContextualSubstitutionRule`, or recipe-line links.

## Canadian and Québec scope

Health Canada's federal English and French pages use the same paired class names and process description. The federal source therefore supports the Canadian names and identity boundary; it does not guarantee that every product labelled `resistant corn starch` is this high-amylose product unless it fits the listed class. Ingredion's current origin statement supports sale of its named HI-MAIZE® 260 product to Canadian customers, while the product statement independently ties that SKU to high-amylose corn. Neither source establishes grocery distribution or Québec inventory. [S01–S04]

Diabète Québec's current public-facing article uses `amidon résistant de maïs` in a section about newer dietary fibres recognized by Health Canada. This corroborates the shorter French search phrase in Québec. It is not a retail listing or a technical definition of every corn-derived resistant starch. The display `amidon de maïs à haute teneur en amylose` is copied from Santé Canada's French table, not presented as an OQLF-approved term. [S02, S05]

## Identity and picker audit

The active catalog has separate ordinary `cornstarch / fécule de maïs` (`ingredient-ref-cornstarch`) and `modified corn starch / amidon de maïs modifié` (`ingredient-ref-modified-corn-starch`) references. The exact high-amylose/resistant-corn terms were not found in the active reference catalog, forms, ledger, or earlier proposal/batch files. The proposed exact names return the new identity alone under the current phrase-first picker search. Queries for unqualified `corn starch` or `amidon de maïs` return the three source-qualified identities below, while the modified phrase remains specific to R92.

| Query | Projected picker results with the proposed row |
|---|---|
| `high amylose corn starch` | High amylose corn starch |
| `resistant corn starch` | High amylose corn starch |
| `amidon de maïs à haute teneur en amylose` | High amylose corn starch |
| `amidon résistant de maïs` | High amylose corn starch |
| `corn starch` | Cornstarch; modified corn starch; high amylose corn starch |
| `amidon de maïs` | Cornstarch; modified corn starch; high amylose corn starch |
| `modified corn starch` / `amidon de maïs modifié` | Modified corn starch |
| `cornstarch` | Cornstarch |
| `resistant starch` | No result |

The proposed canonical French name contains the broad phrase `amidon de maïs`, so that broad query will include this row. This is intentional and keeps high-amylose corn source-qualified in the visible result. Do not add the broader French alias `amidon résistant`, which would hide the corn source and could absorb potato, wheat, or other resistant-starch queries.

## Measurement, recipe, and substitution boundary

The candidate has no supported household mass-per-volume value, scoop, or general unit mapping. Product fibre or amylose content is composition data, not a density or kitchen conversion. Keep `defaultDensity` null and the ledger measurement state at `researched_no_supported_value`.

A University of Guelph thesis documents one commercial bagel formulation using HI-MAIZE® 260: 168 kg high-amylose corn starch and 112 kg hard-wheat flour in place of 280 kg hard-wheat flour, with water increased from 136.1 kg to 224 kg and 28 kg gluten added. The formulation process also addressed a slight bitter taste with a flavour modulator. In the tested product, the study reported 25.4 g resistant starch per roughly 120 g RS bagel, versus 6.83 g in its control bagel. These are study- and product-specific facts, not a 60% general substitution recommendation, ingredient yield, universal water adjustment, or ingredient-level fibre measure. [S06]

If accepted, ledger the observed flour replacement only as a source-scoped `substitutionFinding`, including the formula changes and limitations. Do not encode the study quantity as a reusable ratio or conversion, and do not infer that ordinary corn starch, another high-amylose grade, or another recipe can use the same formulation. No current recipe names this candidate, and no active global or contextual substitution rule is supported.

The manifest-listed package contains 114 recipes and 1,123 ingredient rows. No high-amylose/resistant-corn candidate terms appear in those recipes. Ordinary cornstarch remains linked in 9 ingredient rows across 8 recipes; no recipe relinking is proposed. The current B3 plan parent item “Water-chestnut flour and other documented regional starches” remains open; this proposal adds no plan, ledger, or shared catalog edits.

## Source register

All sources were checked on 2026-10-15.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S01** | Health Canada, [*List of Dietary Fibres Reviewed and Accepted by Health Canada's Food Directorate*](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html) | Updated 2021-06-25; Table 1. Lists `resistant corn starch` / `high amylose corn starch`, the milling and optional hydrothermal process, and 50–90% amylose in high-amylose corn grain. This is a fibre-class source, not a retail package or kitchen-measure source. |
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S02** | Santé Canada, [*Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments*](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html) | Updated 2021-06-25; Table 1. Gives the exact French class names `amidon résistant de maïs` / `amidon de maïs à haute teneur en amylose` and the same process and amylose range. Federal terminology; not an OQLF entry. |
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S03** | Ingredion, [HI-MAIZE® 260 Ingredient Statement](https://www.ingredion.com/content/dam/ingredion/technical-documents/na/HI-MAIZE%20260%20Ingredient%20Statement.pdf) | Dated 2025-04-28, next review 2028-04-28. States that this named product is 100% corn starch derived from high-amylose corn. Manufacturer evidence for one product, not every high-amylose starch grade. |
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S04** | Ingredion Canada, [HI-MAIZE® 260 Country of Origin / USMCA statement](https://www.ingredion.ca/content/dam/ingredion/technical-documents/na/HI-MAIZE%20260%20-%20Country%20of%20Origin%20-%20USMCA.pdf) | Dated 2026-01-08, valid through 2028-01-08. Identifies product PIN 22000B00 and says HI-MAIZE® 260 is sold to customers in Canada and the United States. This is current commercial-supply evidence, not Québec retail or consumer-pack availability. |
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S05** | Diabète Québec, [*Les fibres alimentaires*](https://www.diabete.qc.ca/le-diabete/la-gestion-du-diabete/alimentation/les-fibres-alimentaires/) | Current Québec-facing article, © 2024-09. Uses `amidon résistant de maïs` and attributes the fibre class to Health Canada's recognition. Supports local wording, not product-specific naming, a technical definition, or local product inventory. |
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S06** | Sarah A. Dainty, University of Guelph, [*The Effect of Resistant Starch Bagels on Glycemic Response in Adults at Risk for Type 2 Diabetes*](https://central.bac-lac.gc.ca/.item?app=Library&id=TC-OGU-8790&oclc_number=1033018072&op=pdf), MSc thesis, 2015 | Table 7 gives the commercial bagel formula and ingredient weights; pp. 59–60 describe flavour-modulator work and slight bitterness; Table 8 gives per-bagel resistant-starch values. One industrially produced study recipe, not a general home-baking ratio or conversion. |
| **WP02-B3-HIGH-AMYLOSE-CORN-STARCH-R123-20261015-S07** | [R92 modified corn-starch integration note](../batches/wp02-b3-modified-corn-starch-identity-integration-20261014/README.md) and [R92 review](wp02-b3-r92-modified-corn-starch-review-20261014.md) | Project history showing the separate `modified corn starch / amidon de maïs modifié` identity and its broad-query boundary. This is catalog history, not external technical evidence. |

## Static checks performed

- Read `AGENTS.md`, the current Section 04 B3 plan entry, R92 modified-corn-starch integration history, R121 and R122 proposals, active reference JSON, research ledger, manifest, and picker implementation.
- Parsed the current package inventory: 1,467 references, 105 forms, 1,808 ledger records, 205 candidate records, 114 manifest-listed recipes, and 1,123 ingredient rows. The proposed reference ID, ledger record ID, and source-ID prefix are unused.
- Checked the proposal and batch archive for the exact high-amylose/resistant-corn name family; no earlier focused review was found. Mirrored the picker’s normalization and phrase-first matching for the query projection above.
- Scanned all 114 manifest-listed recipe files and their 1,123 ingredient rows: no candidate terms; 9 existing cornstarch rows across 8 recipes.
- Integrated with an identity-only reference and source-specific ledger finding on 2026-10-15. No
  app, Gradle, instrumentation, emulator, or deployment tests were run under the updated JSON-only
  rule; package, ledger, normalization, and generated-index static checks are recorded in the batch
  README.
