# WP02 Section A7 — whole-wheat pastry flour portion review R803

**Review date:** 2026-10-19

**Disposition (revised after direct-page audit):** Retain only King Arthur’s product-scoped `portion_weight` observation. Hold both quantity fields on the Québec Food Directory page because the same GTIN listing presents conflicting serving data with no explanation. Do not use either Québec quantity until the manufacturer or an authoritative label source resolves the context. The King Arthur value does not establish a default whole-wheat pastry-flour cup weight.

## Scope and prior work

The live checklist still has the broad Section A7 item open: “Continue A7 review of other grain meals (including the unresolved wheat-meal candidate) and milling products.” The R800–R802 integration covers emmer flour, a Love Crunch granola identity, and canned tuna in olive oil; none covers whole-wheat pastry flour. See the [current A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2276) and [R800–R802 integration](../batches/wp02-wp03-wp04-r800-r802-gap-review-integration-20261019/README.md).

The whole-wheat pastry-flour reference was previously accepted as an identity, with the Québec French product name and whole-kernel distinction supported. At initial R803 drafting, its ledger row had `measurementState: not_yet_researched` and no measurement observations. The corrected integration now retains only the King Arthur chart observation; the conflicting Québec quantities are documented but not adopted. This does not revisit the identity or prior flour/Graham boundary decisions.

## Current evidence

| Evidence | What it supports | Limits and proposed use |
|---|---|---|
| [Répertoire des aliments québécois, La Milanaise Organic Whole Wheat Pastry Flour, GTIN 627062110319](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205134), accessed 2026-10-19. Under **Nutrition Facts** it says **per 1/4 cup (30 g)** (lines 97–99). Later, under **Additionals informations**, it says **Serving size: 60 gr** and **Per 1/3 Cup (60g)**, followed by **Serve prepared: Yes** (lines 148–152). The page says product data come from GS1, was last updated 2026-07-24, and disclaims MAPAQ responsibility for data accuracy (lines 61, 182–185). | The page identifies the Québec product and its French-market context. It does not provide one unambiguous portion. The two fields are attached to the same GTIN and source record. | **Hold both quantities.** The later field may be a different GS1 serving metadata field or may be stale or incorrect; `Serve prepared: Yes` hints at a context difference but does not define one. The source never reconciles these entries, so treating one as authoritative or interpreting 60 g as prepared would be unsupported. The current [La Milanaise product page](https://lamilanaise.com/produits/farine-de-ble-entier-a-patisserie-biologique/) confirms the French product name but gives no numeric portion. |
| [King Arthur Baking Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), accessed 2026-10-19. The row “Whole Wheat Pastry Flour / Graham Flour” lists **1 cup = 3 3/8 oz = 96 g** and links to [Whole Wheat Pastry Graham Flour, SKU 212374](https://shop.kingarthurbaking.com/items/whole-wheat-pastry-graham-flour). | One chart value for the exact linked King Arthur product. Its current product page identifies it as a whole-wheat pastry flour made from the complete wheat kernel. | The chart uses a combined pastry/Graham row and the product has a composite name. Keep the evidence attached only to this named product; do not create a Graham-flour alias or move this portion to the separate Graham-flour reference. The chart does not state cup capacity or a row-specific fill method and notes that recipe-page values can differ. |
| [La Milanaise hosted energy-cookie recipe](https://lamilanaise.com/recette/galettes-energisantes-a-la-farine-de-ble-entier-a-patisserie/), accessed 2026-10-19. The ingredient list calls for **1 cup (250 ml)** of its whole-wheat pastry flour. | External culinary use demonstrates a real volume-based recipe need for this named Québec product. | The recipe does not publish a mass. Do not derive a weight from its cup amount or treat its optional spelt suggestion as a substitution rule. This URL is context only; no recipe link or ledger source is proposed. |

Do not record either Québec directory amount as an observation, compare it numerically with the King Arthur value, or infer a conversion. The 30 g and 60 g fields cannot be assigned distinct supported states from this page alone. King Arthur’s chart remains usable only for its separately linked SKU 212374 product; it does not resolve the Québec record’s internal conflict.

## Catalog and source ownership audit

| Item | Current owner and finding |
|---|---|
| Active catalog key | `ingredient-ref-whole-wheat-pastry-flour` already exists as `whole-wheat pastry flour / farine de blé entier à pâtisserie`, category `FLOUR_AND_STARCH`, with no aliases, null `defaultDensity`, and empty `unitMappings`. No catalog key, name, or alias is proposed. |
| Ledger target | The corrected record has `identityState: verified`, `measurementState: researched_supported`, one King Arthur chart observation, and `substitutionResearchState: not_yet_researched`. |
| Québec product URL | The exact directory URL has one ledger source entry: `WP02A1-S03` on the target row. Reuse it, but change its locator/support to document both conflicting fields and the source's GS1/MAPAQ limits. Do not attach either 30 g or 60 g to an observation, and do not allocate another source ID for this URL. |
| King Arthur product URL | The exact product URL has two existing ledger entries: `WP02A1-S04` on the target row and `WP02-A4-GRAHAM-FLOUR-20261011-S04` on the separate Graham-flour boundary record. Reuse the target-owned `WP02A1-S04`; preserve the other record’s scope. |
| King Arthur chart URL | The exact chart URL appears in 28 ledger source entries. `WP07-KAB-IWC` is an existing shared source ID and maps to this chart URL only. Reuse that ID and attach a source entry scoped to the chart row on the target record; do not mint a duplicate chart ID. |
| Current La Milanaise product page | The exact manufacturer URL is not currently in the ledger. It confirms current French product naming and package options but adds no measurement. Use it as review context only; no new ledger source ID is proposed. |
| Recipe and observation ownership | The hosted recipe URL has no current ledger owner and remains external demand context only. The target ledger contains only the King Arthur observation handle; the La Milanaise 30 g handle was removed because the GTIN-matched directory page also lists an unexplained 60 g serving. |

Prior non-R803 work is identity-only: [the specialist wheat-flour batch](../batches/baking-specialty-wheat-flours.md), the whole-wheat French alias review, and the Graham-flour boundary review do not record either portion. A7’s wheat-bran, durum-flour, emmer-flour, and meal/grit entries belong to other ingredient references and are not transferred here.

## Recipe corpus and picker impact

The current manifest lists 114 recipes and 1,123 ingredient rows. A scan of every manifest-listed recipe found no target reference ID, whole-wheat-pastry wording in English or French, product name, or Québec GTIN. The current forms and global/contextual substitution files also contain no entry for this reference. No bundled recipe link or recipe-line edit is proposed.

This proposal changes ledger evidence only. The existing picker names stay unchanged, no alias or form is added, and current English/French query results remain unchanged. In particular, the broader French wording `farine de blé entier` remains unmodified and ambiguous across related whole-wheat references.

## Integrated ledger delta

On `ingredient-ref-whole-wheat-pastry-flour`:

- Keep `measurementState: researched_supported` only for the King Arthur SKU 212374 chart observation. Neither Québec quantity is an observation.
- Refresh existing source `WP02A1-S03` with the current locator/support documenting both conflicting directory fields and their unresolved context; retain its URL and ID. Do not cite it for an accepted measurement.
- Attach the existing shared `WP07-KAB-IWC` chart source ID to this row with the precise combined chart-row locator and its limitations. Retain `WP02A1-S04` unchanged as the linked product-identity evidence.
- Keep `identityState: verified`, `substitutionResearchState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`. Add no form, active conversion, package yield, recipe link, alias, or substitution.

The two source objects below are record-level references to existing source IDs and URLs. Refresh `WP02A1-S03` in place to record the unresolved conflict; add `WP07-KAB-IWC` to this target row using the established chart ID. Do not allocate either as a new source ID.

```json
[
  {
    "sourceId": "WP02A1-S03",
    "url": "https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205134",
    "title": "Répertoire des aliments québécois, Farine de blé entier à pâtisserie biologique / Organic Whole Wheat Pastry Flour",
    "accessedOn": "2026-10-19",
    "locator": "Product name and GTIN 627062110319; Nutrition Facts field (per 1/4 cup (30 g)); Additional information fields (Serving size: 60 gr; Per 1/3 Cup (60g); Serve prepared: Yes); page source and accuracy notes.",
    "supports": "Identifies the Québec-market La Milanaise whole-wheat pastry-flour product. The same GS1-fed page shows 1/4 cup (30 g) under Nutrition Facts and a separate 1/3 cup (60 g) serving field with Serve prepared: Yes, without explaining their relationship. MAPAQ says the page was last updated 2026-07-24 and disclaims responsibility for data accuracy. Do not use either quantity as an observation until reconciled.",
    "sourceKind": "regional_authority"
  },
  {
    "sourceId": "WP07-KAB-IWC",
    "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
    "title": "King Arthur Baking, Ingredient Weight Chart",
    "accessedOn": "2026-10-19",
    "locator": "‘Whole Wheat Pastry Flour / Graham Flour’ row: 1 cup = 3 3/8 oz = 96 g; row links to Whole Wheat Pastry Graham Flour, SKU 212374.",
    "supports": "Publishes a one-cup, 96 g equivalency for the linked named King Arthur product. The chart does not state cup capacity or a row-specific filling method and notes that recipe-page weights may differ.",
    "sourceKind": "culinary_reference"
  }
]
```

The King Arthur observation was already integrated under the handle below. The former La Milanaise 30 g observation was removed; no shared IDs are allocated by this proposal revision.

```json
[
  {
    "observationId": "whole-wheat-pastry-flour-king-arthur-whole-wheat-pastry-graham-one-cup-96-g-r803-20261019",
    "relationship": "portion_weight",
    "value": 96,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Whole Wheat Pastry Graham Flour, SKU 212374",
    "foodState": "Named flour product as sold; its composite product name is retained as source wording.",
    "measurementMethod": "Published King Arthur Baking Ingredient Weight Chart; row-specific cup filling method is not stated.",
    "quantityBasis": "One chart-listed cup for the linked product only. Cup capacity and packing convention are unspecified; the chart advises following recipe weights where values differ.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "cup",
      "unitConvention": "As stated in the chart; capacity and fill method are unspecified."
    },
    "observedMassG": 96,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP07-KAB-IWC", "WP02A1-S04"]
  }
]
```

### Hold option

The La Milanaise observation is held now: the 30 g Nutrition Facts field and 60 g supplemental serving fields share one GS1-fed GTIN page and have no explained relationship. If future manufacturer/label evidence cannot resolve that conflict, keep both out of the ledger indefinitely. If the King Arthur product/chart association cannot be kept product-specific or its combined row is considered too ambiguous for the whole-wheat pastry reference, hold the remaining observation too and set `measurementState: not_yet_researched`. Do not average, scale, or map either Québec amount to King Arthur or to a generic flour measure.

## Review checks

- Read the active A7 checklist and the completed R800–R802 integration before selecting this distinct row.
- Checked the live reference, existing ledger record and source URLs, prior A1/A4 proposals, A7 proposals/batches, forms, substitution rules, and all 114 manifest-listed recipes.
- Verified current primary evidence online on 2026-10-19. No software tests, build, emulator, or deployment were run for this proposal-only document.

## Integration status

**Integrated and corrected** on 2026-10-19 on `ingredient-ref-whole-wheat-pastry-flour`. The existing source `WP02A1-S03` now documents the same-GTIN conflict between the 1/4 cup (30 g) Nutrition Facts field and the 1/3 cup (60 g) supplemental serving field; neither value is recorded. The shared chart source `WP07-KAB-IWC` was reused with `WP02A1-S04` as the linked-product source. The only retained observation is `whole-wheat-pastry-flour-king-arthur-whole-wheat-pastry-graham-one-cup-96-g-r803-20261019` for King Arthur SKU 212374.

The initial integration briefly included a 30 g La Milanaise observation; it was removed after direct source review found the unexplained 60 g field. The reference, null density, empty unit mappings, and `not_yet_researched` substitution state remain unchanged. Package and ledger validation, generated-index freshness, source ownership, picker, corpus, encoding, links, and scoped whitespace checks are recorded in the [R803–R805 integration README](../batches/wp02-wp03-wp04-r803-r805-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the active database changes only add JSON data under `AGENTS.md`.
