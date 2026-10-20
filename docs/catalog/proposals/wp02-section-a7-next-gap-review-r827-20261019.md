# WP02 Section A7 R827 — pre-cooked white corn flour product portion

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, generated index, or recipe file was changed.
- **A7 anchor:** The open Section A7 item continues review of other grain meals and milling products ([current plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2283)). This review addresses an unmeasured, already verified milling-product identity. Its earlier WP02 A5 identity work explicitly left measurement and substitution research open. R824 covered the separate white whole-wheat flour row; R825 and R826 covered WP03 rice and WP04 scallop evidence. The new portion below does not overlap those reviews or any earlier A7 measurement on this row.

## Recommendation

On the existing ledger row ingredient-ref-precooked-corn-flour, add one manufacturer-label portion for P.A.N.’s 1 kg pre-cooked white corn product: **3 Tbsp. (30 g)**. Keep it product-specific. This is one serving-size entry on a named manufacturer label; it does not establish a generic measure for precooked corn flour or any other corn flour, cornmeal, or meal product.

Set measurementState to researched_supported for this one source-backed portion. Keep the active English and Québec French displays, empty alias lists, null defaultDensity, and empty unitMappings unchanged. Do not add a tablespoon-to-mass conversion, package yield, form, recipe link, alias, substitution finding, or active substitution rule.

The English title on P.A.N.’s nutrition page calls the item “PRE-COOKED WHITE CORN MEAL.” P.A.N.’s existing manufacturer page WP02-S86 describes its pre-cooked white product as “100% pre-cooked white corn flour,” which supports matching the product family to the existing precooked-corn-flour row. The portion remains limited to the 1 kg nutrition-page item; the page does not provide a SKU/GTIN that would justify further product matching or transfer.

## Identity, labels, and aliases

The active reference is ingredient-ref-precooked-corn-flour, category FLOUR_AND_STARCH, displayed as **precooked corn flour / farine de maïs précuite**. Both alias lists are empty; defaultDensity is null and unitMappings is empty. Its identity is verified, but its ledger row has no measurement observations and both measurement and substitution research are not_yet_researched.

The existing source WP02-S86 is P.A.N. Food Business Solutions’ product page, titled *P.A.N. Pre-cooked White Corn Meal*. It says the white product is pre-cooked and “100% pre-cooked white corn flour,” distinguishing it from whole corn and raw corn flour. Existing Québec-market source WP02-S87 is L’Española’s current French listing; it calls its distinct DOÑA AREPA product **Farine de maïs précuite** and lists that same ingredient. These sources support retaining the active generic English and Québec French labels. The P.A.N. label is evidence for one product portion only.

Do not add “P.A.N.,” “white corn flour,” “pre-cooked white corn meal,” “harina de maíz blanco precocida,” or DOÑA AREPA as aliases. The current identity review deliberately left brand, color, and precooked-cornmeal wording out of the generic search terms. The new observation is not a request to reopen those identity decisions.

## Measurement evidence and limits

| Source | Exact evidence | Limit |
| --- | --- | --- |
| New source WP02-A7-PRECOOKED-CORN-FLOUR-PORTION-R827-20261019-S01 — P.A.N. USA, [Nutritional Information: Pre-Cooked White Corn Meal 1 kg](https://us.allofpan.com/nutritional-information-pre-cooked-white-corn-meal-1kg/). | The page title identifies the 1 kg product as **PRE-COOKED WHITE CORN MEAL**; its ingredient declaration says **PRE-COOKED WHITE CORN MEAL ENRICHED**; the Nutrition Facts line says **“Serving size / 3 Tbsp. (30g).”** The page identifies International Grains & Cereal LLC as manufacturer under license of Alimentos Polar International. | The serving is for this named P.A.N. U.S. label item. The source gives no SKU/GTIN, spoon fill or leveling method, metric volume, or grind grade. Do not treat it as a generic tablespoon measure, density, or portion for another precooked or whole-kernel corn product. |
| Reuse existing source WP02-S86 — P.A.N. Food Business Solutions, [Pre-cooked White Corn Meal](https://panfoodbusiness.global/en/harina-precocida-de-maiz-blanco-english/). | The manufacturer page describes its P.A.N. white product as **“100% pre-cooked white corn flour”** and lists presentations of 5 lb and 50 lb. This supports the product-family match to the active flour identity. | The page does not give a serving measure and does not identify the U.S. 1 kg nutrition-page item by SKU. Reuse it only for the flour/process identity boundary; do not claim both pages describe an identical SKU or package. No source update is proposed. |
| Reuse existing source WP02-S87 — L’Española, [Farine de maïs précuite DOÑA AREPA](https://lespanola.com/fr/products/chapelure-pan-rallado-500-g-1). | The current Montréal Québec listing uses the French display **Farine de maïs précuite** and lists **farine de maïs précuite 100%** as its ingredient. | This is identity evidence for DOÑA AREPA, not portion evidence for P.A.N. No cross-brand amount is inferred and no source update is proposed. |

Record only the label’s 3 tablespoon / 30 g serving. The label’s “33 servings per container” does not establish an exact package yield. Do not derive a per-tablespoon conversion, cup value, density, or active conversion from the label.

## Substitution research, separately

The P.A.N. manufacturer page describes arepas, empanadas, tortillas, tamales, pancakes, and other applications, and says pre-cooking offers process advantages over whole corn or raw corn flour in manufacturing. These statements do not compare ingredient replacements in a household formula or give a ratio or method. No supported or blocked substitution finding is proposed; leave substitutionResearchState as not_yet_researched.

## Catalog, ownership, picker, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Identity and aliases | The target ID is valid. Its active names are precooked corn flour / farine de maïs précuite; aliases are empty. Keep it distinct from masa harina, whole-kernel corn flour, roasted corn flour, cornmeal, and cornstarch. No name, alias, or category change is proposed. |
| Measurement and conversion data | The ledger row currently has zero measurement observations. Add one P.A.N. product-specific serving observation. Keep active density null and unit mappings empty; add no form, unit conversion, or package yield. |
| Existing sources and ownership | Existing source WP02-S86 is the owner of the P.A.N. Food Business URL and WP02-S87 is the owner of the Québec French supplier URL. The proposed P.A.N. USA label URL and source ID are unowned; do not replace either existing source or duplicate either URL. The proposed observation ID is absent from the ledger. |
| Forms and substitution rules | The target has no forms. Neither substitution-rules.v1.json nor contextual-substitution-rules.v1.json contains a rule mentioning it. Add no form or rule; keep substitution research open because the reviewed sources give applications rather than comparative household substitution guidance. |
| Phrase-first picker | With current names, aliases, and form terms, “precooked corn flour” and “farine de maïs précuite” each return only the target. “Corn flour” returns four rows: precooked corn flour, roasted corn flour, sorghum flour (through its “guinea corn flour” alias), and whole-kernel corn flour. “Farine de maïs” returns four: masa harina, precooked corn flour, roasted corn flour, and whole-kernel corn flour; the shorter phrase matches within those longer terms. “Pre-cooked white corn meal” and “harina de maíz blanco precocida” return no row. These projections remain unchanged because no active search term is added. |
| Bundled recipe demand | A manifest-driven scan read all 114 files named by manifest.v1.json and counted 1,123 ingredient-array objects, of which 1,097 carry ingredientRefId. It found zero direct target links, zero full-file phrase hits, and zero ingredient-row phrase hits for the target names, P.A.N. product wording, or Spanish label wording. The corpus also has no arepa, empanada, or pupusa mention. No recipe link is proposed. |

Picker results were projected from the live references and forms using the current app’s lowercased NFKD search normalization, accent folding, punctuation-to-space conversion, and phrase-first contiguous-word matching, including matches inside longer terms. The recipe scan used manifest-listed recipe files only and separately checked normalized complete JSON and ingredient-row text, counting all ingredient-array objects separately from linked rows.

## Exact proposed ledger delta

Apply only to records[] entry recordId == "ingredient-ref-precooked-corn-flour":

~~~json
{
  "replace": {
    "measurementState": "researched_supported"
  },
  "addSource": {
    "sourceId": "WP02-A7-PRECOOKED-CORN-FLOUR-PORTION-R827-20261019-S01",
    "url": "https://us.allofpan.com/nutritional-information-pre-cooked-white-corn-meal-1kg/",
    "title": "P.A.N. USA, Nutritional Information: Pre-Cooked White Corn Meal 1 kg",
    "accessedOn": "2026-10-19",
    "locator": "Product title, ingredients declaration, and Nutrition Facts serving-size line for PRE-COOKED WHITE CORN MEAL 1KG.",
    "supports": "The official P.A.N. USA page identifies the product as PRE-COOKED WHITE CORN MEAL 1KG, declares PRE-COOKED WHITE CORN MEAL ENRICHED as its ingredient, and states serving size 3 Tbsp. (30g). This is a manufacturer-label portion for this named product only. No spoon preparation method, metric volume, SKU/GTIN, or general flour conversion is stated.",
    "sourceKind": "manufacturer"
  },
  "addMeasurementObservation": {
    "observationId": "precooked-corn-flour-pan-white-3tbsp-30g-r827-20261019",
    "relationship": "portion_weight",
    "value": 30,
    "valueUnit": "g",
    "foodDescription": "P.A.N. USA PRE-COOKED WHITE CORN MEAL, 1 kg label item, with an enriched pre-cooked white-corn ingredient declaration. Existing P.A.N. source WP02-S86 describes its pre-cooked white product as 100% pre-cooked white corn flour, supporting the product-family match; no exact SKU/GTIN crosswalk is claimed.",
    "foodState": "Named packaged pre-cooked white-corn product, enriched as declared on the label; grind grade and spoon-preparation state are not specified.",
    "measurementMethod": "The manufacturer label states a serving size of 3 Tbsp. (30g); it supplies no spoon filling or leveling method.",
    "quantityBasis": "P.A.N. USA label serving for the named 1 kg product only; not a generic measure, per-tablespoon conversion, density, or active unit mapping.",
    "sourceQuantity": {
      "amount": 3,
      "unit": "tbsp",
      "unitConvention": "The label prints 3 Tbsp.; it gives no metric volume or spoon-preparation method."
    },
    "observedMassG": 30,
    "evidenceKind": "manufacturer_label",
    "sourceIds": [
      "WP02-A7-PRECOOKED-CORN-FLOUR-PORTION-R827-20261019-S01",
      "WP02-S86"
    ]
  },
  "addDecision": {
    "outcome": "accepted",
    "reason": "Record the P.A.N. 1 kg label’s 3 Tbsp. (30 g) serving as manufacturer evidence for that named pre-cooked white-corn product on the existing precooked-corn-flour ledger row. Preserve the product scope; do not infer density, a generic serving, an active conversion, or a substitution.",
    "sourceIds": [
      "WP02-A7-PRECOOKED-CORN-FLOUR-PORTION-R827-20261019-S01",
      "WP02-S86"
    ]
  }
}
~~~

Do not change the active reference, aliases, density, unit mappings, forms, substitutions, rules, generated index, or bundled recipes. Do not add any yield from the package's serving count.

## Static checks and test scope

- Read the live Section A7 plan, the R824–R826 integration README, the prior precooked-corn-flour A5 checklist and identity proposal, the related corn-flour picker review, current target/reference and ledger rows, and recent A7 proposals through R824.
- Reopened P.A.N.’s current U.S. nutrition page and manufacturer product page; checked the existing Montréal Québec French listing separately for the active label. Verified source ID/URL ownership, observation ID availability, target aliases, forms, active rules, current picker projection, and all manifest-listed recipes.
- This is a proposal-only Markdown change. If accepted, integration changes only research-ledger JSON. Under AGENTS.md, a database-JSON-only change needs no software tests; no tests, build, emulator, or deployment were run.
