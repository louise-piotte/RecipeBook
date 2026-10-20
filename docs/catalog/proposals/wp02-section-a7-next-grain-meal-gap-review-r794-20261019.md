# WP02 Section A7 R794 — Quaker Quick Grits label portion

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. The accepted product-specific observation is in the existing hominy-grits ledger row; see the [R794–R796 integration README](../batches/wp02-wp03-wp04-r794-r796-gap-review-integration-20261019/README.md). No software tests were run after integration because the database change only adds JSON data, per `AGENTS.md`.
- **Plan anchor:** The active Section A7 parent remains open for other grain meals and milling products, including the unresolved wheat-meal candidate ([global catalog plan, line 2276](../../RecipeBook-global-ingredient-catalog-plan.txt#L2276)).
- **Target:** Existing `ingredient-ref-hominy-grits` (`hominy grits / gruau de maïs`).
- **Scope:** Research one named manufacturer's dry serving portion. This is not an identity, French-display, alias, form, or generic corn-grits review.
- **Proposal-local IDs:** `WP02-A7-HOMINY-GRITS-MEASURE-R794-20261019-S01` and `hominy-grits-pearl-milling-quick-grits-quarter-cup-37-g-r794-20261019` are local handles only; no shared IDs are allocated here.

## Recommendation

**Record one source-specific `portion_weight` observation** on the existing `ingredient-ref-hominy-grits` ledger row:

- Pearl Milling Company Quick Grits: **1/4 cup = 37 g**, as the current manufacturer product page's serving declaration.

If integrated, change the target ledger row's `measurementState` from `not_yet_researched` to `researched_supported`. Keep the observation scoped to this named quick-cooking product and its label serving. The page identifies the product as hominy grits, lists degerminated white corn grits as the primary ingredient, and instructs that the product be cooked before eating. It says product formulations and packaging may change, so the package label remains authoritative for a particular purchase.

Do not derive a general cup mass, density, unit mapping, or conversion. Do not transfer 37 g to regular or stone-ground corn grits, whole-kernel hominy, cornmeal, or other grits products. Add no alias, form, recipe link, package yield, or active substitution. Leave `substitutionResearchState` unchanged.

The current French display remains provisional. This measurement-only proposal does not resolve the R111 terminology concern: Québec sources use `gruau de maïs` for generic grits, and the reviewed Québec product pages do not identify those products as hominy grits. No French term or search key is changed.

## Source evidence and limits

Sources were checked online on 2026-10-19.

| Proposal-local handle / ownership | Source and evidence | Limits |
|---|---|---|
| **New, proposal-local** `WP02-A7-HOMINY-GRITS-MEASURE-R794-20261019-S01` | Pearl Milling Company, [Quick Grits](https://www.pearlmillingcompany.com/products/other_products/quick_grits), current manufacturer product page. It describes its Quick Grits as hominy grits, declares **Serving Size: 1/4 Cup (37 g)**, lists degerminated white corn grits first in the ingredients, says the product must be cooked before eating, and gives preparation instructions for one and four servings. | Product-label serving only. The page does not state cup capacity, filling/leveling method, or an independent weighing procedure. The page warns that formulations and packaging can change. It is an English-language U.S. manufacturer page, not a bilingual Québec package. |
| **New corroborating product document**, proposal-local handle `WP02-A7-HOMINY-GRITS-MEASURE-R794-20261019-S02` | Quaker / PepsiCo, [Product Formulation Statement for Quick Grits, enriched white hominy corn](https://resources.finalsite.net/images/v1760050531/pcsborg/ztitodchymtten0jchdw/Grits_Quick_8-5lb_Enriched_White_Hominy_Corn_488ct_Quaker-PepsiCo_04378.pdf), dated 2024-01-01. The manufacturer's statement identifies the 5 lb product as GTIN `00030000043707` / UPC `030000043707`, names Quaker Food and Beverage as manufacturer, and repeats 1/4 cup (37 g). The accessible copy is hosted by Pinellas County Schools; the page itself warns its information can differ from current package labels. | Product-identification and historical cross-check only, not independent measurement evidence. The current Pearl Milling page is the primary support for the proposed current serving declaration. |
| **Reuse existing** ledger sources `WP03-S138` and `WP03-S140` | Office québécois de la langue française, [gruau de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais), and Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), F232 row 918. OQLF's preferred term is `gruau de maïs` and its English terms include U.S.-scoped `hominy grits`; the food-code row directly pairs `Hominy grits / Gruau de maïs`. These existing rows support retaining the bilingual identity. | OQLF's entry is in brewing/malt crushing and dates to 1986; the food code is a classification crosswalk, not evidence of current Québec retail wording. No duplicate source rows are proposed. |
| **Previously reviewed in proposal-only R111 as local sources S07 and S08** | Bob's Red Mill Canada and Québec retailer La Moisson use `gruau de maïs` for a current white-corn grits product. See the [manufacturer page](https://www.bobsredmill.ca/produit/cereales-chaudes-de-gruau-de-mais-cremeux) and [Québec retailer listing](https://lamoisson.com/products/gruau-de-mais-blanc-cremeux-creamy-white-corn-grits). | These proposal-local R111 sources are not shared-ledger entries. They demonstrate Québec market wording for ordinary white-corn grits, not hominy processing, and do not support attaching the Quaker measure to the ordinary corn-grits row. |

## Existing-key and source-ownership audit

| Surface | Live state and disposition |
|---|---|
| Active reference | `ingredient-ref-hominy-grits` is verified as `hominy grits / gruau de maïs`, category `GRAIN_AND_CEREAL`, with empty English/French aliases, `defaultDensity: null`, and empty `unitMappings`. Preserve those fields. |
| Ledger | Measurement state is `not_yet_researched`; the row has no `measurementObservations`. Existing identity sources and decisions are retained. The recommended measure and two Quaker product URLs have no exact URL owners in the ledger. |
| Forms and active rules | No active ingredient form targets the reference. The global and contextual substitution rule files contain no hominy-grits rule. Add none. |
| Existing product/key owners | The distinct `ingredient-ref-corn-grits` row owns `corn grits / semoule de maïs de type grits`; `ingredient-ref-cornmeal` owns `cornmeal / semoule de maïs`; `ingredient-ref-hominy-corn` owns the whole-kernel product. Existing corn-grits evidence includes a Bob's Red Mill white-corn product portion of 1/4 cup (40 g); it belongs to the ordinary corn-grits row and is not transferable to hominy grits. No new aliases or search keys are proposed. |
| Québec display and prior hominy work | R111 retained `gruau de maïs` provisionally because Québec product usage also names ordinary corn grits this way. The current proposal preserves that limitation and does not reopen identity or display ownership. R111 and the older hominy-grits identity packet contain no measurement observations. |
| Other A7 archive ownership | Reviewed the A7 residual meal/boundary packets, including R605, R628, R631, R638, R643–R674, R698, and R710, along with R647/R666 cornmeal work and the R113 ordinary-corn-grits boundary review. None owns the Quaker Quick Grits label observation or either Quaker product URL. Their measurements and decisions remain product- and ingredient-scoped. |
| Bundled recipe corpus | Scanned all **114** recipe files listed in the live manifest and the serialized recipe contents for the target ID, `hominy`, `hominy grits`, `Quick Grits`, and `gruau de maïs`; no matching recipe file or line was found. This proposal adds no recipe demand or recipe link. |
| Proposal and source IDs | The R794 proposal path was free before drafting. The proposed source and observation handles were not present in the ledger or proposal/archive search before this file was created. No ingredient ID or shared source/observation ID is generated here. |

The manufacturer uses the consumer-facing name **Quick Grits**, while the French consumer-facing sources reviewed do not identify their ordinary grits products as hominy. Keep that phrase off the active aliases. Reusing the existing `gruau de maïs` display preserves the currently accepted bilingual mapping without claiming a Québec hominy-specific product label.

## Candidate data delta if accepted

Append one new manufacturer source entry and one observation to the existing `ingredient-ref-hominy-grits` ledger record. The exact shared records should be allocated and merged only during root integration.

```json
{
  "measurementState": "researched_supported",
  "source": {
    "sourceId": "WP02-A7-HOMINY-GRITS-MEASURE-R794-20261019-S01",
    "url": "https://www.pearlmillingcompany.com/products/other_products/quick_grits",
    "title": "Pearl Milling Company, Quick Grits",
    "accessedOn": "2026-10-19",
    "locator": "Nutrition Information serving size; product description, ingredients, and preparation directions",
    "supports": "The current manufacturer page identifies Quick Grits as hominy grits, declares a serving as 1/4 cup (37 g), lists degerminated white corn grits as the first ingredient, and says the product must be cooked before eating. Product-specific label portion only; no cup capacity or fill method is stated.",
    "sourceKind": "manufacturer"
  },
  "measurementObservation": {
    "observationId": "hominy-grits-pearl-milling-quick-grits-quarter-cup-37-g-r794-20261019",
    "relationship": "portion_weight",
    "value": 37,
    "valueUnit": "g",
    "foodDescription": "Pearl Milling Company Quick Grits, enriched white hominy grits.",
    "foodState": "Dry product as sold, before cooking.",
    "measurementMethod": "The current manufacturer nutrition information declares one serving as 1/4 cup (37 g); no independent weighing procedure is stated.",
    "quantityBasis": "One named product serving only. Do not transfer to regular or stone-ground grits, whole corn grits, cornmeal, or other brands; do not derive density or a generic cup conversion.",
    "sourceQuantity": {
      "amount": 0.25,
      "unit": "cup",
      "unitConvention": "Manufacturer label serving; cup capacity and fill/leveling method are unspecified."
    },
    "observedMassG": 37,
    "evidenceKind": "manufacturer_label",
    "sourceIds": ["WP02-A7-HOMINY-GRITS-MEASURE-R794-20261019-S01"]
  }
}
```

The historical product statement can be attached as the second source only if root wants its GTIN cross-check; it does not add a second independent observation. Reuse the current OQLF and Statistics Canada source IDs instead of creating duplicate source records.

## No-data / hold option

If product-specific amounts must have a current Canadian bilingual package source before any observation is accepted, hold the proposed measure. In that case preserve `measurementState: not_yet_researched`, the current identity and provisional French display, and the absence of observations. The sources do not support substituting the ordinary Bob's Red Mill corn-grits measure for hominy grits. No other data should be added under this proposal.

## Review checks performed

- Inspected the live A7 checklist, active reference and form catalogs, `ingredient-ref-hominy-grits` ledger history, substitution rule files, and all 114 manifest-listed recipes.
- Reviewed the A7 proposal and batch archive for the residual grain-meal and milling-product work, and the adjacent hominy, ordinary corn-grits, and cornmeal decisions.
- Checked current Pearl Milling manufacturer information, the Quaker product formulation statement, the OQLF entry, Statistics Canada's food-code mapping, and current Québec corn-grits product wording online.
- No tests, build, emulator run, or deployment were performed; this is a proposal-only review and makes no database change.
