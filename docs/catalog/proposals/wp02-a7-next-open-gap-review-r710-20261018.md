# WP02 Section A7 R710 — durum-flour cup-weight evidence

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. No shared catalog, ledger, plan, workflow, roadmap, generated file, recipe, or integration README was changed.
- **Plan anchor:** The active A7 parent remains open to review other grain meals and milling products, including the unresolved wheat-meal candidate ([global plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2115)).
- **Target:** Existing `ingredient-ref-durum-flour` (`durum flour / farine de blé dur`).
- **Scope:** Review published cup-weight evidence for two named durum-flour products. This is separate from the Wheatlets identity/measurement/application reviews in R698, R701, and R707, and the sprouted whole-barley flour form review in R704. It does not reopen those decisions.

## Recommendation

**Add two source-specific `portion_weight` observations** to the existing `ingredient-ref-durum-flour` research-ledger row at integration:

1. King Arthur Baking's named Durum Flour product, SKU 100243: **1 cup = 124 g**.
2. Janie's Mill Organic Durum Flour: **1 cup = 129.5 g**.

Set the target row's `measurementState` to `researched_supported` when integrating these observations. Reuse the existing King Arthur chart source ID. The other source IDs and both observation IDs listed below are proposal-local handles only; this proposal allocates nothing.

Keep the evidence product-scoped. The two sources report different masses, and only Janie's Mill describes a flour filling method. Neither source establishes a shared cup capacity or a universal packing convention. Do **not** derive or activate a default density, unit mapping, generic cup conversion, form, recipe link, package yield, or substitution. Leave `identityState: verified` and `substitutionResearchState: not_yet_researched` unchanged.

## Source evidence and limits

Sources were accessed on 2026-10-18. “Cup” below repeats each publisher's wording; its capacity is not specified on either chart.

| Proposal-local source handle / ownership | Primary source and evidence | Limits |
|---|---|---|
| **Reuse existing** `WP07-KAB-IWC` for the chart; proposal-local product cross-check `WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S01` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), `Durum Flour` row: 1 cup, 4 3/8 oz, 124 g. The chart links the row to King Arthur's [Durum Flour product page](https://shop.kingarthurbaking.com/items/durum-flour), which identifies SKU 100243 and describes the product as finely textured flour ground from extra-hard wheat. | The chart recommends weighing ingredients and calls itself a quick reference, but does not state the cup capacity or a row-specific scoop, level, or packing method. Keep 124 g attached to this named product/chart entry. The product page does not itself give a cup measure. |
| Proposal-local `WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S02` | Janie's Mill, [Weight Conversion Chart](https://www.janiesmill.com/pages/weight-conversion-chart), “Our Flours”: `Durum Flour 4.6 oz | 129.5g` for 1 cup. The chart recommends a scale and says that, when using a cup, flour should be scooped in fluffy spoonfuls and gently leveled without packing. | This is the mill's chart guidance for its flours; it does not state the cup capacity or establish an app-wide or cross-brand cup standard. Retain the stated fill method with this source only. The neighboring `Sifted Durum Flour` row is a distinct chart entry at 4.7 oz / 133 g and is excluded. |
| Proposal-local `WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S03` | Janie's Mill, [Organic Durum Flour product page](https://www.janiesmill.com/products/durum-flour), names its product Organic Durum Flour and describes it as freshly stone-ground, 100% extraction, made from organic durum (ancient hard spring wheat), and whole-kernel. | Product-identity and process cross-check for the chart's unsifted `Durum Flour` entry; not a second measurement source. Do not transfer the chart value to the separately named sifted product or other mills' flours. |

The two values differ by 5.5 g per stated cup. Janie's Mill supplies a light-fill method; King Arthur does not give a row-specific fill method, and their cup conventions are unstated. The difference therefore remains visible as separate product observations. It is not averaged or used to calculate grams per millilitre.

## Current ownership and archive audit

The current package contains 1,841 ingredient references, 174 ingredient forms, 56 legacy-import candidates, and 2,224 research-ledger records.

| Surface | Current state and review disposition |
|---|---|
| Active reference | `ingredient-ref-durum-flour` is already owned by `durum flour / farine de blé dur`, with aliases `durum wheat flour` and `farine de blé durum`, category `FLOUR_AND_STARCH`, null `defaultDensity`, and empty `unitMappings`. No reference ID or name change is proposed. |
| Ledger row | Its identity is `verified`; measurement and substitution states are both `not_yet_researched`. It has no measurement observations. Existing identity sources are `WP02A2-S11` ([Italian regulation](https://www.gazzettaufficiale.it/atto/serie_generale/caricaArticolo?art.codiceRedazionale=001G0242&art.dataPubblicazioneGazzetta=2001-05-22&art.flagTipoArticolo=0&art.idArticolo=2&art.idGruppo=1&art.idSottoArticolo=1&art.idSottoArticolo1=10&art.progressivo=0&art.versione=1)), distinguishing non-granular durum flour from semola, and `WP02A2-S12` ([OQLF GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357377/farine-de-ble-dur)), supporting the terminology. Preserve those sources and the identity boundary. |
| Forms and neighboring identities | No form targets `ingredient-ref-durum-flour`. Keep `ingredient-ref-durum-semolina`, `ingredient-ref-semola-rimacinata`, and `ingredient-ref-durum-wheat-berries` distinct. In particular, do not transfer the ordinary durum-semolina measurements reviewed in R635 or the remilled-semolina formula amount reviewed in R653. |
| Legacy identities | `legacy-import-identities.v1.json` has 56 candidates and no durum-flour name, alias, or ID owner. No candidate or legacy ID is proposed. |
| King Arthur chart ownership | The exact chart URL already appears on 26 ledger records; 15 use the shared source ID `WP07-KAB-IWC`. None is the durum-flour row. Reuse `WP07-KAB-IWC`; do not register a second source object for that chart URL. The chart's exact 124 g durum-flour observation is absent from the target row and archived proposals/batches. |
| Product/chart URL ownership | The King Arthur product page, Janie's Mill chart, and Janie's Mill product page each have zero exact URL owners in the current ledger and zero exact URL occurrences in proposal/batch archives. The 129.5 g chart observation and `4.6 oz` entry were also absent from the archive. The R710 `S01`–`S03` IDs are proposal-local only. |
| Observation and proposal path ownership | The proposed observation IDs `durum-flour-king-arthur-sku-100243-one-cup-124-g-r710-20261018` and `durum-flour-janies-mill-organic-one-cup-129-5-g-r710-20261018` were absent from the active ledger and archive. The preferred R710 proposal path was absent before drafting. No ingredient ID, source ID, or observation ID is allocated here. |
| Related archive decisions | R698 and R701 concern Wheatlets identity and measurement; R707 records a blocked Wheatlets application lead; R704 concerns sprouted whole-barley flour. The R47 roasted-durum boundary review concerns a separate, deeply roasted product and explicitly does not supply measures transferable to it. None records the two named plain-durum-flour cup observations reviewed here. |

## Bundled recipe scan

Parsed all **114** recipe files listed by the current `manifest.v1.json` and all **1,123** structured ingredient rows. The full serialized recipe files and ingredient rows had zero matches for `ingredient-ref-durum-flour`, `durum flour`, `durum wheat flour`, `farine de blé dur`, `farine de blé durum`, or other durum / semolina terms. No ingredient row links to the target reference. The bundle supplies no recipe demand or recipe-specific measure; no recipe link is proposed.

## Phrase-first picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, punctuation, and spacing, then returns complete word-phrase matches before falling back to substring matches. This proposal changes only ledger evidence and research state; no searchable names, aliases, or forms change.

| Query | Current result | Projected result |
|---|---|---|
| `durum flour`; `durum wheat flour`; `farine de blé dur`; `farine de blé durum` | `ingredient-ref-durum-flour` | Unchanged: same single reference |
| `semoule de blé dur` | `ingredient-ref-durum-semolina`; `ingredient-ref-semola-rimacinata` | Unchanged |
| `durum wheat` | `ingredient-ref-durum-flour`; `ingredient-ref-durum-wheat-berries` | Unchanged |
| `durum` | `ingredient-ref-durum-flour`; `ingredient-ref-durum-semolina`; `ingredient-ref-durum-wheat-berries`; `ingredient-ref-semola-rimacinata` | Unchanged |

## Proposal-only ledger disposition

At integration, set `measurementState: researched_supported` on `ingredient-ref-durum-flour`, attach the shared King Arthur chart source reference under its already-used `WP07-KAB-IWC` ID, add new product-page source entry `S01` and Janie's Mill source entries `S02` and `S03`, then append the two `portion_weight` observations below. Every observation source ID is therefore present in the target record's `sources` array. `WP07-KAB-IWC` reuses the existing chart source ID and URL; it is not a new source ID or a new URL owner. The `S01`–`S03` handles and observation IDs remain proposal-local until integration. Keep `identityState: verified`, `substitutionResearchState: not_yet_researched`, `defaultDensity: null`, `unitMappings: []`, and the absence of target forms, recipe links, active conversions, and active substitutions.

### Source entries to attach to the target record

The first entry is a record-level reference to the already shared `WP07-KAB-IWC` source. Its source ID and URL are reused; the locator and support text scope the evidence on this target row. Only the three `S01`–`S03` IDs are new proposal-local source handles.

```json
[
  {
    "sourceId": "WP07-KAB-IWC",
    "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
    "title": "King Arthur Baking, Ingredient Weight Chart",
    "accessedOn": "2026-10-18",
    "locator": "‘Durum Flour’ row: 1 cup = 4 3/8 oz = 124 g; the row links to Durum Flour SKU 100243.",
    "supports": "The chart publishes a one-cup, 124 g equivalency for its linked Durum Flour product. The cup capacity and row-specific filling method are unstated.",
    "sourceKind": "culinary_reference"
  },
  {
    "sourceId": "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S01",
    "url": "https://shop.kingarthurbaking.com/items/durum-flour",
    "title": "King Arthur Baking, Durum Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product title, SKU 100243, and description.",
    "supports": "Identifies the chart-linked product as Durum Flour, SKU 100243, and describes finely textured flour ground from extra-hard wheat. This page provides no cup weight.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S02",
    "url": "https://www.janiesmill.com/pages/weight-conversion-chart",
    "title": "Janie's Mill, Weight Conversion Chart",
    "accessedOn": "2026-10-18",
    "locator": "Weight Conversion Chart, Our Flours, Durum Flour row and cup-measuring instructions.",
    "supports": "Lists Durum Flour at 1 cup = 4.6 oz / 129.5 g and recommends scooping fluffy spoonfuls, leveling gently, and not packing flour when using a measuring cup. The cup capacity is unstated.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S03",
    "url": "https://www.janiesmill.com/products/durum-flour",
    "title": "Janie's Mill, Organic Durum Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product Info, Milled From, Extraction, and More Info fields.",
    "supports": "Identifies the named product as organic durum flour, stone-ground at 100% extraction from durum wheat, and whole-kernel. This page provides no cup weight.",
    "sourceKind": "manufacturer"
  }
]
```

### Measurement observations to append

```json
[
  {
    "observationId": "durum-flour-king-arthur-sku-100243-one-cup-124-g-r710-20261018",
    "relationship": "portion_weight",
    "value": 124,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Durum Flour, SKU 100243",
    "foodState": "Named product as sold; the manufacturer describes it as finely textured flour ground from extra-hard wheat.",
    "measurementMethod": "Published King Arthur Ingredient Weight Chart equivalency; the row-specific cup-filling method is not stated.",
    "quantityBasis": "One source-specific cup equivalency only. Cup capacity and packing convention are not stated; do not generalize to other durum-flour products.",
    "sourceQuantity": { "amount": 1, "unit": "cup" },
    "observedMassG": 124,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP07-KAB-IWC", "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S01"]
  },
  {
    "observationId": "durum-flour-janies-mill-organic-one-cup-129-5-g-r710-20261018",
    "relationship": "portion_weight",
    "value": 129.5,
    "valueUnit": "g",
    "foodDescription": "Janie's Mill Organic Durum Flour, 100%-extraction whole-kernel stone-ground product.",
    "foodState": "Named product as sold.",
    "measurementMethod": "Published Janie's Mill Weight Conversion Chart; its flour guidance says to scoop fluffy spoonfuls, level gently, and not pack.",
    "quantityBasis": "One named-product cup equivalency only. Cup capacity is not stated; the chart's separate Sifted Durum Flour row is excluded.",
    "sourceQuantity": { "amount": 1, "unit": "cup" },
    "observedMassG": 129.5,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S02",
      "WP02-A7-DURUM-FLOUR-MEASURE-R710-20261018-S03"
    ]
  }
]
```


No tests, builds, emulator runs, or deployment were performed; this review adds no active application or catalog data.
