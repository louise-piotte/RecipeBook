# WP02 Section A7 R824 — white whole-wheat flour recipe portion

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. This review changed no shared catalog, ledger, checklist, roadmap, workflow, generated index, or recipe files.
- **Open-plan anchor:** Section A7 remains open for other grain meals and milling products ([current plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2282)). R806 covered rye malt flour, R809 durum-semolina baking evidence, R812 einkorn flour, R815 malted wheat flour, R818 whole-wheat pastry flour, and R821 generic whole-wheat flour. This review concerns the separate ingredient-ref-white-whole-wheat-flour row; R821 explicitly excluded transferring its generic-flour observations to that row.

## Recommendation

Add one source-specific published portion observation to the existing ledger row ingredient-ref-white-whole-wheat-flour from King Arthur Baking's *Ancient Grains Bread* recipe. The recipe gives a shared flour line of **1 cup (113 g), “King Arthur Whole Wheat Flour, Premium or White Whole Wheat.”** It says to weigh the flour or measure it by gently spooning it into a cup and sweeping off any excess.

Attach the observation to the white whole-wheat row only with the source-line condition spelled out in its prose fields: the 1 cup (113 g) amount belongs to either option on this one line, and applies to white whole-wheat flour if that option is selected. The schema has no conditional observation field, so do not describe this as a distinct or independently published white-whole-wheat weight. Keep it as a source-scoped portion from one bread formula. Do not derive density or an active cup mapping from it.

No identity, display label, alias, active catalog measure, recipe link, form, conversion, or substitution rule is proposed. The recipe’s “Premium or White Whole Wheat” wording supports those alternatives only in this loaf. King Arthur’s current product information also gives brand-specific whole-grain substitution guidance, but its target is broadly called “white flour” and does not establish a generic catalog-level replacement. Keep that guidance separate from the proposed portion and do not infer a general rule.

## Identity, labels, and alias ownership

The active reference is ingredient-ref-white-whole-wheat-flour, category FLOUR_AND_STARCH, displayed as **white whole-wheat flour / farine intégrale de blé blanc**. It has the English alias **hard white whole wheat flour**, no French alias, defaultDensity null, and no unit mappings. Its identity is verified; the ledger measurement state is not_yet_researched, with no measurement observations. The existing Québec mill source identifies product MLCBIE20 as **Farine intégrale de blé blanc** and says it contains the whole grain. These existing identity sources support retaining the bilingual labels; no alias change is needed.

King Arthur’s recipe uses the words **White Whole Wheat** as one option. King Arthur announced in August 2024 that its own White Whole Wheat Flour was renamed Golden Wheat Whole Wheat Flour and describes that named product as milled from 100% hard white wheat. Its current product page identifies SKU 305555 as Golden Wheat Flour and says it is milled from hard white spring wheat. That brand renaming does not make **Golden Wheat Flour** a generic synonym, and the recipe does not name SKU 305555. Do not add the brand name as a catalog alias or claim that the recipe option is that exact SKU.

The separate ingredient-ref-whole-wheat-flour row owns **whole-wheat flour / farine de blé entier** and **entire wheat flour**; it remains distinct. No target name or alias is being moved or duplicated.

## Measurement evidence and limits

| Source | Exact evidence | Limit |
| --- | --- | --- |
| New source WP02-A7-WHITE-WHOLE-WHEAT-PORTION-R824-20261019-S01 — King Arthur Baking, [Ancient Grains Bread](https://www.kingarthurbaking.com/recipes/ancient-grains-bread-recipe), recipe updated October 8, 2026. | Ingredient line: **“1 cup (113g) King Arthur Whole Wheat Flour, Premium or White Whole Wheat.”** The yield is one 8 1/2-inch sandwich loaf. Instruction 1 says: **“Weigh your flour; or measure it by gently spooning it into a cup, then sweeping off any excess.”** | The cup and mass are published for the shared either/or line. The recipe does not state a separate weight for white whole-wheat flour alone, identify a specific white-whole-wheat SKU, or establish a general cup weight. The recipe’s own cup convention is not converted to mL. |
| Existing source WP02-WQF-20261010-S06 — Moulin de Charlevoix, [Des farines locales aux qualités uniques](https://www.moulin-charlevoix.net/farines-flour), product MLCBIE20. | Calls the product **Farine intégrale de blé blanc** and states that it contains the whole grain. | Supports the existing Québec French identity and whole-grain boundary only; it gives no measurement or recipe substitution. No source update is proposed. |
| King Arthur Baking, [2024 rename notice](https://www.kingarthurbaking.com/newsroom/2024/08/02/king-arthur-baking-company-renames-white-whole-wheat-flour-to-golden-wheat) and current [Golden Wheat product page](https://shop.kingarthurbaking.com/items/golden-wheat-flour), SKU 305555. | The notice says King Arthur renamed its former White Whole Wheat Flour to Golden Wheat Whole Wheat Flour and that the product is milled from 100% hard white wheat. The current product page says it is milled from hard white spring wheat and is whole grain. | Brand-specific identity corroboration only. The recipe option does not name the SKU. Do not add a brand alias or transfer the SKU’s product facts to every flour represented by the generic row. |

The portion is **source-scoped ledger evidence**, not active recipe data and not a reusable density or conversion. The recipe is external; no bundled recipe is linked or changed.

## Substitution review, separately

The *Ancient Grains Bread* line permits King Arthur Whole Wheat Flour, Premium **or** White Whole Wheat in this specific one-loaf formula at the same listed amount. Preserve that as the formula’s own alternative wording and scope. It is not a general equivalence statement for other flour products, recipes, or methods, and no active global or contextual substitution rule is warranted.

King Arthur’s current Golden Wheat product page says the named product may replace up to a third of the **white flour** in favorite recipes; its 2024 rename notice says some or all white flour may be replaced. This guidance concerns a King Arthur product, and “white flour” is not resolved to one specific active ingredient-reference ID by those statements. It therefore does not support a new generic replacement finding or a rule on this white whole-wheat row. Leave substitutionResearchState unchanged and keep this R824 proposal focused on the portion evidence.

## Catalog, picker, source, and recipe audit

| Surface | Current state and effect |
| --- | --- |
| Identity and aliases | The target ID and its English/Québec French displays and existing English alias are valid and already owned by this row. Keep them unchanged. Do not add Golden Wheat Flour; that is a brand product name. |
| Measurement, density, and mappings | The target ledger row has no observations and is not_yet_researched. Add one source-scoped observation for the shared recipe amount, with the white-option condition written into foodDescription and quantityBasis. Keep active defaultDensity null and unitMappings empty. |
| Forms and active substitution rules | The target has no forms. Neither substitution-rules.v1.json nor contextual-substitution-rules.v1.json contains a rule mentioning this target. Add none. |
| Source and observation ownership | The proposed recipe URL, source ID, and observation ID are absent from the current ledger. Existing source WP02-WQF-20261010-S06 remains the owner of the Québec mill identity URL. No duplicate identity source is proposed. |
| Phrase-first picker | With current names, aliases, and form terms, white whole wheat flour, white whole-wheat flour, hard white whole wheat flour, and farine intégrale de blé blanc each return only the target row. whole wheat flour returns three rows: sprouted whole wheat flour, white whole-wheat flour, and generic whole-wheat flour. farine de blé entier returns four rows: sprouted whole-wheat flour, whole-wheat meal, generic whole-wheat flour, and whole-wheat pastry flour; the meal is found through the contiguous subphrase in its longer French term. golden wheat flour returns no row. Since no name, alias, or form changes are proposed, all results remain unchanged. |
| Bundled recipe demand | A manifest-driven scan read the 114 recipe files listed by manifest.v1.json, counted 1,123 ingredient-array objects (1,097 with ingredientRefId), and found zero direct target links, zero full-file phrase hits, and zero ingredient-row phrase hits for the target’s English/French displays and aliases, Golden Wheat names, or the King Arthur recipe phrase. This external King Arthur formula is source evidence, not bundled corpus demand. No recipe link is proposed. |

The picker projection uses the app’s current lowercased NFKD search normalization, accent folding, punctuation-to-space conversion, and phrase-first contiguous-word matching, including matching a query within a longer term. The corpus scan used the manifest-listed files only; it counted ingredient-array objects separately from objects carrying ingredientRefId, then searched both complete normalized recipe JSON and normalized ingredient-row JSON.

## Exact proposed ledger delta

Apply only to records[] entry recordId == "ingredient-ref-white-whole-wheat-flour":

~~~json
{
  "replace": {
    "measurementState": "researched_supported"
  },
  "addSource": {
    "sourceId": "WP02-A7-WHITE-WHOLE-WHEAT-PORTION-R824-20261019-S01",
    "url": "https://www.kingarthurbaking.com/recipes/ancient-grains-bread-recipe",
    "title": "King Arthur Baking, Ancient Grains Bread",
    "accessedOn": "2026-10-19",
    "locator": "Updated October 8, 2026; ingredient line for King Arthur Whole Wheat Flour, Premium or White Whole Wheat, yield, and instruction 1 flour-measuring method.",
    "supports": "For one 8 1/2-inch sandwich loaf, the recipe lists 1 cup (113 g) King Arthur Whole Wheat Flour, Premium or White Whole Wheat. It directs the baker to weigh flour or gently spoon it into a cup and sweep off excess. This amount is shared by either listed option; it applies to white whole-wheat flour only if that option is selected. It is not a distinct white-whole-wheat-only weight, general cup weight, density, or active unit conversion.",
    "sourceKind": "test_kitchen"
  },
  "addMeasurementObservation": {
    "observationId": "white-whole-wheat-flour-kab-ancient-grains-bread-shared-portion-r824-20261019",
    "relationship": "portion_weight",
    "value": 113,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Ancient Grains Bread, one-loaf flour line: King Arthur Whole Wheat Flour, Premium or White Whole Wheat. This is a shared either/or amount; it concerns white whole-wheat flour only if that option is selected and is not a separately published white-whole-wheat-only weight.",
    "foodState": "Recipe flour option; the source names White Whole Wheat but does not identify a SKU or a finer milling state.",
    "measurementMethod": "The recipe line reports 1 cup (113 g). Its instruction says to weigh the flour or measure it by gently spooning into a cup and sweeping off any excess.",
    "quantityBasis": "Published amount shared by the Premium whole-wheat and White Whole Wheat alternatives in this one 8 1/2-inch sandwich-loaf formula; if White Whole Wheat is selected, the recipe assigns it 1 cup (113 g). Not an independent white-whole-wheat measurement, generic flour weight, density, or active conversion.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "cup",
      "unitConvention": "King Arthur recipe cup; no mL conversion is proposed."
    },
    "observedMassG": 113,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-A7-WHITE-WHOLE-WHEAT-PORTION-R824-20261019-S01"]
  },
  "addDecision": {
    "outcome": "accepted",
    "reason": "Record King Arthur Baking's shared 1 cup (113 g) recipe line as source-scoped evidence available for the white whole-wheat option in this one loaf. Preserve the alternative scope in prose because the schema has no conditional measurement field. Do not treat this as a stand-alone white-whole-wheat weight or create an active conversion.",
    "sourceIds": ["WP02-A7-WHITE-WHOLE-WHEAT-PORTION-R824-20261019-S01"]
  }
}
~~~

Do not change the generic whole-wheat-flour row, catalog references, aliases, density, unit mappings, forms, conversion rules, substitution findings or rules, bundled recipes, package yields, or generated index. Do not derive a cup-to-mL conversion or density from the source.

## Static checks and test scope

- Read the live Section A7 plan item, Requirements.md, current roadmap.md entries, catalog workflow and ledger schema, current target and neighboring reference/ledger rows, and the recent A7 proposals through R821 before selecting this distinct row.
- Reopened King Arthur’s current recipe, product page, and 2024 rename notice, plus the existing Québec mill identity source. Checked source wording, source/observation ID and URL ownership, target alias ownership, forms, active rules, picker projection, and all manifest-listed recipe files.
- This is proposal-only Markdown. If accepted, the integration changes only research-ledger JSON. Under AGENTS.md, a database-JSON-only change needs no software tests; no tests, build, emulator, or deployment were run.
