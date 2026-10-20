# WP02 Section A7 R647: cornmeal manufacturer-label portion review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated. The active catalog remains unchanged; this review adds one source-specific portion observation to an existing research-ledger row.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). This is a measurement review of the existing cornmeal identity, distinct from the R638 barley-grits, R640 emmer-semolina, R643 barley-semolina, and R646 cracked-rye reviews.
- **Candidate:** Existing `ingredient-ref-cornmeal` (`cornmeal / semoule de maïs`, `FLOUR_AND_STARCH`). Its ledger identity is verified, but `measurementState` is `not_yet_researched` and it has no measurement observations.
- **Scope:** Record only Bob’s Red Mill Canada’s published label portion for its coarse-ground cornmeal. Do not add an identity, alias, form, recipe link, conversion, yield, or substitution.
- **Avoided A7 reviews:** R605, R624, R628, R631, R635, R638, R640, R643, and R646.

## Recommendation

Update only the existing `ingredient-ref-cornmeal` ledger record:

1. Change `measurementState` from `not_yet_researched` to `researched_supported` for the bounded label observation below.
2. Add the Bob’s Red Mill Canada product page as one manufacturer source and append one `portion_weight` observation for its declared **1/4 cup (41 g)** serving.
3. Append one accepted, source-bounded decision. Keep `identityState: verified` and `substitutionResearchState: not_yet_researched` unchanged.

**Active numeric behavior supported:** none. The page reports a portion for one named coarse-ground product. It gives no cup convention or fill method and does not establish a general cornmeal cup weight, density, unit mapping, or conversion. Do not generalize it to medium/fine grinds, other brands, or corn grits.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| Bob’s Red Mill Canada, [Semoule de maïs à broyage grossier](https://www.bobsredmill.ca/produit/semoule-de-mais-a-broyage-grossier), current French product page, accessed 2026-10-18 | The title identifies coarse-ground cornmeal. The description says it is stone-ground from whole corn; the page says the germ and bran are retained and lists whole-grain corn as the ingredient. Its nutrition panel gives a serving size of **1/4 cup (41 g)**. | The serving belongs only to this manufacturer’s named coarse-ground product. The page does not specify a cup-volume convention, fill method, or independent weighing procedure, and does not establish a generic volume-to-mass conversion. |
| Existing ledger source `S5-cornmeal`, [OQLF, semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais) | The existing source defines the current broad cornmeal identity and includes fine, medium, and coarse grinds; it pairs `semoule de maïs` with `corn meal`. | This is Québec terminology and identity-scope evidence, not numeric evidence. Reuse the existing source record; do not duplicate it. |

The French manufacturer page supports the product-specific observation but does not change the existing Québec display or alias decision. Keep the broad `semoule de maïs` display on cornmeal. Do not add the product title, `coarse cornmeal`, or a grind descriptor as a global alias or separate identity.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R647 disposition |
|---|---|---|
| Active identity and terminology | `ingredient-ref-cornmeal` is `cornmeal / semoule de maïs`, category `FLOUR_AND_STARCH`, with English alias `corn meal` and no French aliases. Its `defaultDensity` is `null` and `unitMappings` is empty. Neighboring active `ingredient-ref-corn-grits` is separately named `corn grits / semoule de maïs de type grits`; ordinary grits, hominy grits, cornmeal, and prepared/retail polenta remain distinct. | Preserve both references, category, names, and aliases. Add no product, grind, or brand alias. The new evidence adds no search term. |
| Ledger and IDs | The cornmeal row is verified with measurement and substitution research both `not_yet_researched`, one existing source (`S5-cornmeal`), no observations, and no source-specific cornmeal measure. The proposed R647 source ID, observation ID, and proposal path are unowned; the Bob’s product URL is not already attached to a ledger record. | Add the R647 source, one observation, and one decision only. Reuse `S5-cornmeal` for the existing identity/grind boundary; do not copy its source entry. |
| Forms, rules, and package yields | No cornmeal form, ingredient-specific unit mapping, global conversion, contextual substitution rule, or package-yield record is present in the active package. | Add none. Keep density null, mappings empty, and substitution research open. |
| Picker | Exact normalized `cornmeal`, `corn meal`, and `semoule de maïs` terms are owned by `ingredient-ref-cornmeal`. The longer French display `semoule de maïs de type grits` also contains the `semoule de maïs` phrase, so the current phrase-first picker may show both cornmeal and corn grits for that broad French query. | The proposal is ledger-only, so all picker results remain unchanged. It neither resolves nor broadens the existing French phrase overlap. |
| Bundled recipe demand | Parsed all 114 manifest-listed recipes and their 1,123 structured ingredient rows. Found zero links to `ingredient-ref-cornmeal` and zero ingredient-line or full-recipe text hits for `cornmeal`, `corn meal`, or `semoule de maïs`. | The external product label is evidence only. Add no bundled recipe link or edit. |

The new source ID is `WP02-A7-CORNMEAL-R647-20261018-S01`; the new observation ID is `cornmeal-bobs-red-mill-coarse-label-quarter-cup-41-g-r647-20261018`. Both IDs, the exact source URL, and this proposal path were checked against the active ledger and proposal/batch archive before drafting.

## Exact proposed ledger delta

Merge into the ledger record with `recordId: ingredient-ref-cornmeal`. Retain all existing fields, source entries, and identity decision. Set `measurementState` to `researched_supported`; append the following source, observation, and decision. No active catalog JSON change is proposed.

```json
{
  "sourceId": "WP02-A7-CORNMEAL-R647-20261018-S01",
  "url": "https://www.bobsredmill.ca/produit/semoule-de-mais-a-broyage-grossier",
  "title": "Bob’s Red Mill Canada, Semoule de maïs à broyage grossier",
  "accessedOn": "2026-10-18",
  "locator": "Product description, nutrition panel serving size, and ingredients",
  "supports": "The Canadian French manufacturer page identifies coarse-ground cornmeal stone-ground from whole corn, says its germ and bran are retained, lists whole-grain corn as the ingredient, and declares a serving size of 1/4 cup (41 g). The portion is specific to this named product; the page gives no cup convention, fill method, or independent weighing procedure and does not support a general conversion.",
  "sourceKind": "manufacturer"
}
```

Append this product-specific observation. The source prints `1/4 cup (41 g)`; do not infer a milliliter volume or a generic cornmeal conversion.

```json
{
  "observationId": "cornmeal-bobs-red-mill-coarse-label-quarter-cup-41-g-r647-20261018",
  "relationship": "portion_weight",
  "value": 41,
  "valueUnit": "g",
  "foodDescription": "Bob’s Red Mill Canada coarse-ground cornmeal, stone-ground from whole corn, as named on the manufacturer page.",
  "foodState": "Unprepared product as sold; the page does not describe a cooked state.",
  "measurementMethod": "The manufacturer page's nutrition panel declares a serving size of 1/4 cup (41 g). It does not describe an independent weighing procedure or cup-fill method.",
  "quantityBasis": "One serving declaration for Bob’s Red Mill Canada Semoule de maïs à broyage grossier only. Do not infer a general cornmeal cup weight, cup-volume convention, density, unit mapping, or conversion, or apply it to other brands or grinds.",
  "sourceQuantity": {
    "amount": 0.25,
    "unit": "cup"
  },
  "observedMassG": 41,
  "evidenceKind": "manufacturer_label",
  "sourceIds": [
    "WP02-A7-CORNMEAL-R647-20261018-S01"
  ]
}
```

Append this decision. Keep `defaultDensity: null`, `unitMappings: []`, and `substitutionResearchState: not_yet_researched` unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record Bob’s Red Mill Canada’s published 1/4-cup (41-g) serving for its own coarse-ground cornmeal as a manufacturer-label observation only. The source does not define a cup convention or fill method, so this is not a reusable cornmeal measure, density, unit mapping, or conversion. Keep the existing cornmeal identity, Québec display, aliases, picker results, active numeric fields, forms, recipe links, yields, and substitution behavior unchanged.",
  "sourceIds": [
    "S5-cornmeal",
    "WP02-A7-CORNMEAL-R647-20261018-S01"
  ]
}
```

## Static review checks

- Re-read `AGENTS.md`, the relevant `Requirements.md` conversion rules, current A7 checklist and roadmap, active cornmeal reference and ledger record, forms and package parts, research-ledger schema, and the recent A7 proposal archive through R646.
- Reopened Bob’s Red Mill Canada’s current French product page. The product text and label directly support the named coarse-grind product and its 1/4-cup (41-g) serving; no unit conversion or general measure is derived.
- Audited exact active reference/form wording, source and observation ID ownership, source URL ownership, density, mappings, forms, rules, package yields, picker phrase overlap, and all 114 manifest-listed recipes / 1,123 ingredient rows.
- Parsed the proposed JSON blocks and checked the proposed source references and observation fields against `research-ledger.schema.json` using a simulated merge into the existing row. UTF-8, BOM, link, whitespace, and mojibake checks passed.
- The ledger and catalog documentation changed; no active catalog fields changed. No software tests, build, or emulator run were needed because this only adds database JSON data under `AGENTS.md`.
