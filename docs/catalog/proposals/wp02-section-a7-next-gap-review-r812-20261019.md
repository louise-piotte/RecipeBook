# WP02 Section A7 R812 — einkorn-flour portion and substitution evidence review

- **Reviewed:** 2026-10-19
- **Status:** Proposal only; shared catalog, ledger, plan, and generated index are unchanged.
- **A7 anchor:** The open checklist still calls for review of other grain meals and milling products ([plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2282)). R809–R811 cover durum semolina, a branded granola, and Iceland cockle; they do not cover einkorn flour.

## Recommendation

On the existing `ingredient-ref-einkorn-flour` ledger row:

1. Set `measurementState` to `researched_supported` and add five source-scoped published-portion observations: one Québec product-directory portion and four Jovial formula portions. The manufacturer recipes consistently distinguish their named all-purpose and whole-grain products, so retain those measurements separately.
2. Set `substitutionResearchState` to `blocked_pending_evidence` and record the exact Jovial scone-formula choice between its named all-purpose and whole-grain flour products. The recipe is direct evidence for that formula only. Both choices currently map to one active ingredient ID, and the package has no einkorn flour-grade forms, so do not add a runtime rule or line-level substitution.

Keep the active bilingual identity, empty aliases, null `defaultDensity`, empty `unitMappings`, and current forms/rules unchanged. These product and formula amounts do not establish a shared cup standard or generic density.

## Candidate identity and boundary

The active row is `ingredient-ref-einkorn-flour`, `einkorn flour / farine de petit épeautre`, category `FLOUR_AND_STARCH`. The existing A4 identity sources remain the naming authority. La Milanaise's current Québec pages use **Organic Whole Einkorn Flour / Farine de petit épeautre entière biologique**, identify einkorn as *petit épeautre* (also called *engrain*), and distinguish it from spelt (*épeautre*). The Québec Food Directory's product record pairs **Organic Einkorn Flour / Farine de petit épeautre Biologique** for GTIN `10627062410270`.

Leave the displays and alias arrays unchanged. The La Milanaise wording is attached to a particular whole-grain product, while Jovial names both all-purpose and whole-grain products. Neither product title establishes a generic alias for the other milling grade. Do not add `engrain`, `whole grain einkorn flour`, `whole wheat einkorn flour`, `all-purpose einkorn flour`, or the product-qualified French title as aliases. Keep einkorn berries, spelt flour, emmer flour, farro flour, and malted einkorn/oat products separate.

The A7 open item is broader than this proposal. The prior malted-naked-oat flour hold, R660 malted-wheat portion, R806 malted-rye review, and R809 semolina review remain separate decisions; this proposal does not reopen them.

## Measurement evidence

### Québec product-specific portion

The current Québec Food Directory product sheet for La Milanaise's Organic Einkorn Flour reports a serving of **1/4 cup (30 g)**. Its French localized listing for the same product record and GTIN renders **1/4 tasse (30 g)**. The record says its product data come from GS1; this is a product-database transcription, not an inspected package image or an independent weighing. La Milanaise's manufacturer page identifies the linked product as its whole einkorn flour, but supplies no household portion. Record this as one portion for the listed product only.

### Jovial product-specific formula portions

Jovial's current *Fig and Goat Cheese Einkorn Galette* ingredient lines separately list **1 cup (120 g) Jovial All-Purpose Einkorn Flour** and **1 cup (96 g) Jovial Whole Grain Einkorn Flour**. Its *Einkorn Morning Glory Scones* line separately lists **3 cups (360 g)** for the all-purpose flour and **3 1/2 cups (336 g)** for the whole-grain flour. The two formulas repeat the same source-stated amount for each named type. These are published formula quantities, not independent weighings; neither page states a cup convention, fill method, or reusable volume-to-mass standard.

Retain the amounts exactly as published and keep all five observations separate. Do not calculate or activate density, a generic cup mapping, or a cross-brand einkorn measure. The Québec quarter-cup portion is not scaled to a cup.

## Substitution evidence

Jovial's *Einkorn Morning Glory Scones* recipe directly offers the two named flour products on one line using **“or”**: 3 cups (360 g) all-purpose einkorn flour or 3 1/2 cups (336 g) whole-grain einkorn flour. The formula makes 12 scones. This supports the product choice within that one formula, with its own stated amounts.

The active package has one einkorn-flour identity and no form for all-purpose versus whole grain. Recording the two choices as an active rule would point both alternatives back to the same ingredient ID and would lose the product-grade distinction. Keep the finding in the ledger as `blocked_pending_evidence`; do not generalize it to other recipes, brands, or flour grades, and add no form or active substitution rule.

## Catalog, ownership, picker, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Active identity | `ingredient-ref-einkorn-flour` owns `einkorn flour / farine de petit épeautre`; both alias lists are empty. No identity or name change. |
| Measurement | The ledger measurement state is `not_yet_researched` with no observations. The proposal adds one Québec product-database portion and four named Jovial formula portions. |
| Substitutions and forms | The ledger substitution state is `not_yet_researched`; no einkorn flour form exists. The package has 199 forms and zero global or contextual substitution rules. Record the formula-only alternative as blocked; add no rule or form. |
| Density and mappings | `defaultDensity` is null and `unitMappings` is empty. Both remain unchanged. |
| Neighboring ownership | Einkorn berries have their own `GRAIN_AND_CEREAL` row. Spelt and emmer flours remain separate; the existing unqualified `farro` and A7 malted-product boundaries are not changed. No legacy-import candidate owns the reviewed einkorn-flour phrases. |
| Source ownership | Reuse `WP02A4-EI-S03` for the existing Québec Food Directory URL and expand its locator/support for the current serving data. The two Jovial URLs and proposed source IDs below have no current ledger owner. All proposed observation and finding IDs are unowned. |
| Picker | No name or alias changes are proposed, so all results stay unchanged. The current phrase-first projection returns only `ingredient-ref-einkorn-flour` for `einkorn flour`, `farine de petit épeautre`, and accent-folded `farine de petit epeautre`. `einkorn` and `petit épeautre` each return both einkorn berries and einkorn flour. `whole grain einkorn flour`, `all-purpose einkorn flour`, and `farine de petit épeautre entière biologique` currently return no result; this proposal adds none of those product qualifiers as aliases. The broad `malt flour` query remains seven results, including malted rye flour through the contiguous `malt flour` subphrase in R806's `rye malt flour` alias; `rye malt flour` remains malted rye flour only. |
| Bundled recipe demand | The manifest has 114 recipes and 1,123 structured ingredient rows. A full scan of every manifest-listed recipe found no `ingredient-ref-einkorn-flour` link and no einkorn / petit-épeautre / engrain phrase in recipe files or ingredient rows. The cited sources are external recipe/product evidence, not bundled demand. |

No recipe link, active conversion, density, mapping, form, package yield, or line-level substitution is proposed.

## Exact proposed ledger delta

Apply these changes to `records[]` entry `recordId == "ingredient-ref-einkorn-flour"`. First update its existing source `WP02A4-EI-S03` in place; it is the sole current owner of the Québec Food Directory URL. Do not add a duplicate source record for that URL.

```json
{
  "replace": {
    "measurementState": "researched_supported",
    "substitutionResearchState": "blocked_pending_evidence"
  },
  "reuseAndUpdateSource": {
    "sourceId": "WP02A4-EI-S03",
    "accessedOn": "2026-10-19",
    "locator": "Current English product sheet and French localized listing: product name, GTIN 10627062410270, serving size, and serving description.",
    "supports": "The Québec Food Directory identifies the La Milanaise product as Organic Einkorn Flour / Farine de petit épeautre Biologique, GTIN 10627062410270, and reports 1/4 cup (30 g) / 1/4 tasse (30 g). The Directory says product data come from GS1. This is a product-specific published portion, not an inspected label image, independent weighing, or generic density."
  },
  "addSources": [
    {
      "sourceId": "WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S01",
      "url": "https://jovialfoods.com/blogs/recipes/fig-and-goat-cheese-einkorn-galette",
      "title": "Jovial Foods, Fig and Goat Cheese Einkorn Galette",
      "accessedOn": "2026-10-19",
      "locator": "Galette dough ingredient lines for the named all-purpose and whole-grain einkorn flours.",
      "supports": "Lists 1 cup (120 g) Jovial All-Purpose Einkorn Flour and 1 cup (96 g) Jovial Whole Grain Einkorn Flour in the same formula. Supports two formula-specific portions only; no cup convention, flour-measuring method, generic density, or reusable mapping is given.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02",
      "url": "https://jovialfoods.com/blogs/recipes/einkorn-morning-glory-scones",
      "title": "Jovial Foods, Einkorn Morning Glory Scones",
      "accessedOn": "2026-10-19",
      "locator": "The flour ingredient line and 12-scone yield.",
      "supports": "Lists 3 cups (360 g) Jovial All-Purpose Einkorn Flour or 3 1/2 cups (336 g) Jovial Whole Grain Einkorn Flour for one 12-scone formula. This is a named-recipe alternative and two formula-specific portions; no general substitution rule, cup convention, or measuring method is given.",
      "sourceKind": "culinary_reference"
    }
  ],
  "addMeasurementObservations": [
    {
      "observationId": "einkorn-flour-quebec-directory-30g-quarter-cup-r812-20261019",
      "relationship": "portion_weight",
      "value": 30,
      "valueUnit": "g",
      "foodDescription": "La Milanaise Organic Einkorn Flour / Farine de petit épeautre Biologique, Québec Food Directory GTIN 10627062410270.",
      "foodState": "Dry einkorn flour; product-directory record identifies organic einkorn as the ingredient.",
      "measurementMethod": "The Québec Food Directory reports a 1/4 cup (30 g) serving; its product data are sourced from GS1. No independent weighing method is reported.",
      "quantityBasis": "This exact Québec product record only. Do not scale the portion or transfer it to another brand, milling grade, or generic einkorn flour.",
      "sourceQuantity": { "amount": 0.25, "unit": "cup" },
      "observedMassG": 30,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02A4-EI-S03"]
    },
    {
      "observationId": "einkorn-flour-jovial-ap-galette-120g-r812-20261019",
      "relationship": "portion_weight",
      "value": 120,
      "valueUnit": "g",
      "foodDescription": "Jovial All-Purpose Einkorn Flour in Jovial's Fig and Goat Cheese Einkorn Galette dough.",
      "foodState": "Named all-purpose einkorn flour before mixing; the recipe does not state a measuring procedure.",
      "measurementMethod": "Published ingredient line lists 1 cup (120 g).",
      "quantityBasis": "One Jovial formula and named product only; not a generic cup weight, density, or mapping.",
      "sourceQuantity": { "amount": 1, "unit": "cup" },
      "observedMassG": 120,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S01"]
    },
    {
      "observationId": "einkorn-flour-jovial-whole-grain-galette-96g-r812-20261019",
      "relationship": "portion_weight",
      "value": 96,
      "valueUnit": "g",
      "foodDescription": "Jovial Whole Grain Einkorn Flour in Jovial's Fig and Goat Cheese Einkorn Galette dough.",
      "foodState": "Named whole-grain einkorn flour before mixing; the recipe does not state a measuring procedure.",
      "measurementMethod": "Published ingredient line lists 1 cup (96 g).",
      "quantityBasis": "One Jovial formula and named product only; not a generic cup weight, density, or mapping.",
      "sourceQuantity": { "amount": 1, "unit": "cup" },
      "observedMassG": 96,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S01"]
    },
    {
      "observationId": "einkorn-flour-jovial-ap-scones-360g-r812-20261019",
      "relationship": "portion_weight",
      "value": 360,
      "valueUnit": "g",
      "foodDescription": "Jovial All-Purpose Einkorn Flour in Jovial's Einkorn Morning Glory Scones.",
      "foodState": "Named all-purpose einkorn flour before mixing; the recipe does not state a measuring procedure.",
      "measurementMethod": "Published ingredient line lists 3 cups (360 g).",
      "quantityBasis": "One 12-scone Jovial formula and named product only; preserve the stated 3-cup quantity and do not normalize it to a generic mapping.",
      "sourceQuantity": { "amount": 3, "unit": "cup" },
      "observedMassG": 360,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02"]
    },
    {
      "observationId": "einkorn-flour-jovial-whole-grain-scones-336g-r812-20261019",
      "relationship": "portion_weight",
      "value": 336,
      "valueUnit": "g",
      "foodDescription": "Jovial Whole Grain Einkorn Flour in Jovial's Einkorn Morning Glory Scones.",
      "foodState": "Named whole-grain einkorn flour before mixing; the recipe does not state a measuring procedure.",
      "measurementMethod": "Published ingredient line lists 3 1/2 cups (336 g).",
      "quantityBasis": "One 12-scone Jovial formula and named product only; preserve the stated quantity and do not normalize it to a generic mapping.",
      "sourceQuantity": { "amount": 3.5, "unit": "cup" },
      "observedMassG": 336,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02"]
    }
  ],
  "addSubstitutionFinding": {
    "findingId": "einkorn-flour-jovial-scones-alternative-r812-20261019",
    "researchState": "blocked_pending_evidence",
    "fromIngredientRefId": "ingredient-ref-einkorn-flour",
    "replacements": [],
    "context": "Jovial Foods' Einkorn Morning Glory Scones formula only: its flour line offers 3 cups (360 g) Jovial All-Purpose Einkorn Flour or 3 1/2 cups (336 g) Jovial Whole Grain Einkorn Flour for one 12-scone batch.",
    "basis": "A current manufacturer recipe directly prints both named choices and both quantities on the same ingredient line.",
    "adjustments": [],
    "expectedEffects": [],
    "limitations": [
      "This is one brand's alternative in one named formula; it does not establish a general einkorn-flour replacement ratio.",
      "The active catalog has one einkorn-flour reference and no all-purpose or whole-grain forms. A runtime rule would lose this product-grade distinction; add no rule or recipe-line substitution."
    ],
    "sourceIds": ["WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02"]
  },
  "addDecisions": [
    {
      "outcome": "accepted",
      "reason": "Record one Québec Food Directory portion and four Jovial formula portions on the existing einkorn-flour ledger row, preserving each named product, formula amount, and source. Keep active density, unit mappings, forms, and conversions unchanged.",
      "sourceIds": [
        "WP02A4-EI-S03",
        "WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S01",
        "WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Retain the directly stated Jovial scone alternative as blocked, formula-scoped evidence. The single active einkorn-flour identity does not distinguish the two product grades, so this finding does not support an active directed substitution rule.",
      "sourceIds": ["WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02"]
    }
  ]
}
```

The ledger update changes only the existing einkorn-flour row. Do not create an ingredient reference, alias, form, density, unit mapping, conversion, package yield, recipe link, global rule, contextual rule, or line-level substitution.

## Sources and limits

| Source ID | Current source and exact evidence | Limits |
| --- | --- | --- |
| Reuse `WP02A4-EI-S03` | Gouvernement du Québec, [Répertoire des aliments québécois: Organic Einkorn Flour / Farine de petit épeautre Biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203721), GTIN `10627062410270`. The current product sheet reports 1/4 cup (30 g); the current French localized listing reports 1/4 tasse (30 g). | The Directory says the product data come from GS1 and MAPAQ disclaims responsibility for accuracy. No package image or independent weighing method is provided. Retain only as a portion for this exact product record. |
| `WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S01` | Jovial Foods, [Fig and Goat Cheese Einkorn Galette](https://jovialfoods.com/blogs/recipes/fig-and-goat-cheese-einkorn-galette), ingredient lines. | Direct source for its named flour-product amounts; cup convention and measuring method are unstated. It is not a general einkorn conversion table. |
| `WP02-A7-EINKORN-FLOUR-PORTION-R812-20261019-S02` | Jovial Foods, [Einkorn Morning Glory Scones](https://jovialfoods.com/blogs/recipes/einkorn-morning-glory-scones), flour line and 12-scone yield. | Direct evidence for a single formula's alternative and product-specific quantities; it does not validate an active or transferable substitution rule. |
| Reuse `WP02A4-EI-S01–S02` | La Milanaise, [farine de petit épeautre entière biologique](https://lamilanaise.com/produits/farine-de-petit-epeautre-entiere-biologique/) and [Organic Whole Einkorn Flour](https://lamilanaise.com/en/produits/organic-whole-einkorn-flour/). | Confirms the existing Québec-facing name and the whole-grain product's distinction from spelt. The manufacturer pages do not support the Directory's portion; they provide no reusable measure. |

## Static checks and test scope

- Read `AGENTS.md`, `Requirements.md`, `roadmap.md`, the current A7 checklist, the catalog workflow and ledger schema, the active reference/forms/rules, the einkorn identity sources, and the R806/R809–R811 reviews before selecting this gap.
- Reopened the current La Milanaise, Québec Food Directory, and Jovial sources on 2026-10-19. Checked identity, Québec French wording, aliases, portion values, cup/density limits, and the recipe-specific substitution independently.
- Audited source-ID/URL ownership, proposed observation/finding IDs, legacy candidates, product-grade term ownership, phrase-first picker projection including R806's contiguous subphrase result, active forms/rules, and all 114 manifest-listed recipes / 1,123 ingredient rows.
- This is a proposal only. If accepted, its data changes are limited to database JSON. Under `AGENTS.md`, database-JSON-only changes need no software tests; no tests, app build, emulator run, or deployment were performed.
