# WP02 Section A7 R653: remilled durum-semolina recipe-portion review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated as a ledger-only evidence update. Active reference, forms, units, recipes, and app code were unchanged.
- **Plan anchor:** The parent Section A7 item remains open for further grain-meal and milling-product review in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2088). The roadmap now records R650, while A7 remains open.
- **Candidate:** Existing `ingredient-ref-semola-rimacinata` (`remilled durum semolina / semoule de blé dur remoulue`), with the existing aliases `semola rimacinata` and `semolina rimacinata`. Its identity is verified. Before R653, measurement and substitution research were both `not_yet_researched`, with no measurement observations; R653 added one source-specific measurement observation and left substitution research open.
- **Scope:** Add one source-specific gram amount from the manufacturer's own pasta formula to the existing research-ledger row. Do not add an active measure, density, mapping, conversion, form, alias, recipe link, yield, or substitution.
- **Distinctness:** R635 records portions for ordinary durum semolina; this review concerns the separate double-milled product identity. R640, R643, R646, R647, and R650 cover other identities and findings. No earlier review records a Caputo semolina-formula amount on the remilled-durum-semolina ledger row.

## Recommendation

Update only the `ingredient-ref-semola-rimacinata` research-ledger record:

1. Change `measurementState` from `not_yet_researched` to `researched_supported` for the narrow formula observation below.
2. Add the current Caputo Semolina Flour product page and its official Traditional Semolina Pasta Dough recipe page as sources.
3. Append one `portion_weight` observation for the recipe's published **300 g Caputo Semolina Flour** amount, and one accepted source-bounded decision.
4. Leave `identityState: verified` and `substitutionResearchState: not_yet_researched` unchanged.

**Active numeric behavior supported:** none. The recipe reports a gram amount for one named formula. It supplies no volume amount, reusable measure, density, unit mapping, conversion, semolina yield, or serving amount.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| Caputo Flour, [Caputo Semolina Flour](https://caputoflour.com/products/caputo-semolina-flour), current manufacturer product page; accessed 2026-10-18 | The manufacturer identifies the named product as made from pure durum wheat and double-milled for a fine texture; the product page lists a 1 kg package. This product-process description supports reviewing its recipe amount under the existing remilled-durum-semolina identity. | Do not record the 1 kg package size as a serving or measure. The page gives no household measure or general density. Its double-milling statement is product-specific and is not generalized to all durum semolina. |
| Caputo Flour, [Traditional Semolina Pasta Dough](https://caputoflour.com/blogs/recipes/traditional-semolina-pasta-dough), official recipe page; accessed 2026-10-18 | The page describes the formula as using only Caputo Semolina Flour and water and lists **300 g Caputo Semolina Flour**. The ingredient name links to the Caputo product. | This is one manufacturer formula, not a reusable quantity. The page reports 460 g dough yield and gives 160–180 g water; that dough yield is not an ingredient yield or a basis for deriving another mass. The page gives no volume or filling method. |
| Existing ledger sources `WP02A2-S05` and `WP02A2-S06` | The Italian regulation already attached to the target row permits remilling of durum semolina, and the EU product specification identifies *semola rimacinata* as an extra-fine durum-semolina product class distinct from ordinary semolina. | Reuse the existing identity-boundary sources; do not duplicate them or infer a universal grind specification from the Caputo product page. |

The direct product page and recipe page are both from Caputo Flour. Their linked product and formula establish a source-specific portion for Caputo's double-milled durum semolina only. Keep the amount as **300 g per formula**; do not add the product name as an active alias or transfer the amount to ordinary durum semolina, other remilled semolinas, or other brands.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R653 disposition |
|---|---|---|
| Active identity and aliases | `ingredient-ref-semola-rimacinata` is `remilled durum semolina / semoule de blé dur remoulue`, category `FLOUR_AND_STARCH`, with English aliases `semola rimacinata` and `semolina rimacinata`, French alias `semola rimacinata`, `defaultDensity: null`, and `unitMappings: []`. Exact normalized ownership of these four terms belongs to this row. | Preserve the reference, category, aliases, and active numeric fields. Do not add `Caputo Semolina Flour` as an alias. |
| Neighboring semolinas | `ingredient-ref-durum-semolina` is the ordinary durum product and carries the R635 source-specific observations. Before R653, the active remilled row had no observations; it now has only the Caputo formula observation. Spring-wheat, emmer, Khorasan, barley, and sorghum semolinas remain separate identities. | Add the R653 observation only to `ingredient-ref-semola-rimacinata`; do not move, average, or reuse R635's ordinary durum-semolina values. |
| Ledger and source ownership | Before R653, the target row was verified, measurement/substitution states were both `not_yet_researched`, and it had zero measurement observations. Neither Caputo URL, either R653 source ID, nor the observation ID was present in the active ledger or prior proposal/batch archive. The integrated row now contains the two Caputo sources, one observation, and one accepted decision. | Reuse identity sources `WP02A2-S05` and `WP02A2-S06`; do not duplicate them. |
| Forms, conversions, substitutions, and package yields | No ingredient form, same-ingredient conversion, contextual substitution, or package-yield entry refers to the target ID. Density is null and mappings are empty. | Add none. Keep substitution research open; the recipe describes mixing semolina with water but does not establish a form conversion or yield. |
| Picker | `remilled durum semolina`, `semolina rimacinata`, `semoule de blé dur remoulue`, and `semola rimacinata` are owned by the active remilled row. Broader `semolina` and `semoule de blé dur` queries already reach multiple qualified semolina references. | The ledger-only proposal adds no display or alias, so picker matches and ranking remain unchanged. Keep the product name out of picker data. |
| Bundled recipe demand | Parsed all 114 manifest-listed recipes and their 1,123 structured ingredient rows. No row links to `ingredient-ref-semola-rimacinata`, and no recipe text or ingredient line contains `remilled durum semolina`, `semola rimacinata`, `semolina rimacinata`, or `semoule de blé dur remoulue`. | The external Caputo recipe is evidence only. Add no bundled recipe link or edit. |

Proposal-local IDs are `WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S01`, `WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S02`, and `remilled-durum-semolina-caputo-traditional-pasta-dough-300-g-r653-20261018`. Both exact Caputo URLs and all three IDs were checked against the current ledger and proposal/batch archive before drafting; the R653 proposal path was unowned.

## Exact proposed ledger delta

Integrated into `recordId: ingredient-ref-semola-rimacinata`, preserving its existing identity and source entries. Set `measurementState` to `researched_supported`, appended the two Caputo sources, one observation, and the accepted decision below. No active reference, form, unit, recipe, conversion, or substitution JSON changed.

```json
[
  {
    "sourceId": "WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S01",
    "url": "https://caputoflour.com/products/caputo-semolina-flour",
    "title": "Caputo Flour, Caputo Semolina Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product description, grain, double-milling statement, and product size",
    "supports": "The manufacturer identifies Caputo Semolina Flour as made from pure durum wheat and double-milled for fine texture. Supports this named product's remilled durum-semolina identity only; the product page gives no household measure or general density.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S02",
    "url": "https://caputoflour.com/blogs/recipes/traditional-semolina-pasta-dough",
    "title": "Caputo Flour, Traditional Semolina Pasta Dough",
    "accessedOn": "2026-10-18",
    "locator": "Formula description, ingredient list, and product link",
    "supports": "The official recipe describes a two-ingredient dough made with Caputo Semolina Flour and water and lists 300 g of the named semolina flour. The product link points to the manufacturer's double-milled, pure-durum product page. This supports one formula-specific mass amount only; it gives no volume measure or reusable conversion.",
    "sourceKind": "culinary_reference"
  }
]
```

Append this observation. The source quantity is published directly as mass, so no volume quantity or conversion is entered.

```json
{
  "observationId": "remilled-durum-semolina-caputo-traditional-pasta-dough-300-g-r653-20261018",
  "relationship": "portion_weight",
  "value": 300,
  "valueUnit": "g",
  "foodDescription": "Caputo Semolina Flour, which the manufacturer describes as pure-durum and double-milled, in its Traditional Semolina Pasta Dough formula.",
  "foodState": "Dry semolina flour as listed before mixing with water.",
  "measurementMethod": "The recipe ingredient list directly gives 300 g. It reports no volume quantity, cup-fill method, or separate weighing procedure.",
  "quantityBasis": "One Caputo pasta-dough formula only. The page's reported 460 g dough yield is prepared dough, not a semolina yield or serving amount; do not infer a measure, density, unit mapping, conversion, or value for another product or formula.",
  "observedMassG": 300,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S01",
    "WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S02"
  ]
}
```

Append this decision. Keep `defaultDensity: null`, `unitMappings: []`, and `substitutionResearchState: not_yet_researched` unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record Caputo Flour's published 300 g amount of its double-milled durum semolina in the Traditional Semolina Pasta Dough formula only. The source gives no volume amount, fill method, or separate weighing procedure; the reported dough yield is not an ingredient yield. This observation is not a reusable semolina measure, density, unit mapping, conversion, serving amount, or value for ordinary durum or another brand. Preserve active names, aliases, picker behavior, null density, empty mappings, forms, recipe links, and substitution behavior.",
  "sourceIds": [
    "WP02A2-S05",
    "WP02A2-S06",
    "WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S01",
    "WP02-A7-REMILLED-DURUM-SEMOLINA-R653-20261018-S02"
  ]
}
```

## Static review checks

- Re-read `AGENTS.md`, relevant `Requirements.md` conversion rules, the current A7 checklist and roadmap, active reference and ledger row, package manifest, forms/rules/yields, and recent A7 proposal history through R650.
- Reopened Caputo's current product page and official recipe. The product page directly states pure durum wheat and double milling; the linked recipe directly lists 300 g Caputo Semolina Flour. No cup value, density, conversion, serving yield, or substitute was derived.
- Audited exact alias ownership, neighboring semolina identities and R635 scope, existing Dalia-independent ledger sources, source URL/ID ownership, forms/rules/package yields, picker effects, and all 114 recipes / 1,123 ingredient rows.
- Parsed and integrated the JSON fragments into the current ledger row and validated the result against `research-ledger.schema.json`. UTF-8 without BOM, relative links, whitespace, source/ID ownership, package-reference, and recipe-demand checks passed. No software tests, build, emulator run, or deployment were run, consistent with `AGENTS.md` for JSON-only data additions.
