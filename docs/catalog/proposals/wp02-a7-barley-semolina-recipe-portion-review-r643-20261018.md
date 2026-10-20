# WP02 Section A7 R643: barley-semolina recipe portion review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated on 2026-10-18. The existing barley-semolina ledger row now records one formula-specific portion observation; active catalog behavior is unchanged.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). R638 covered barley grits, and the separate R640 proposal covers emmer semolina; this review uses the existing barley-semolina identity.
- **Scope:** Record one source-reported quantity from the existing Québec *Pouding semoule d'orge* recipe on `ingredient-ref-barley-semolina`. Do not reopen its identity, medium-size aliases, or substitution finding.
- **Prior-review check:** R397 added the distinct identity `barley semolina / semoule d'orge` and discussed this recipe's amount as recipe-specific evidence. Its ledger row still has no measurement observations. This proposal adds a bounded ledger observation only; it does not make a generic measure or conversion.
- **Avoided prior batches:** R605 toasted stone-cut wheat meal; R624 wheat germ; R628 wheat bran; R631 Scottish oatmeal; R635 durum semolina; R638 barley grits; and R640 emmer semolina.

## Recommendation

Update only the existing `ingredient-ref-barley-semolina` research-ledger record:

- Set `measurementState` from `researched_no_supported_value` to `researched_supported` for the evidence recorded on this row.
- Append one `portion_weight` observation from the existing R397 source S01, the 2025 Québec *Pouding semoule d'orge* recipe: **1½ cups (315 g)** of medium-size barley semolina for a 25-portion batch.
- Append one accepted ledger decision that preserves this as a recipe-formula amount only. Reuse S01; add no source record, active ingredient measure, density, unit mapping, form, yield, recipe link, or substitution.

**Active numeric behavior supported:** none. The source reports both quantities for one formula, but does not establish a reusable household conversion, density, or per-serving amount. Do not divide the batch amount by 25 or extrapolate it to other recipes, suppliers, or grades.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| [Centdegrés / M361, *Pour des aliments québécois dans nos écoles*](https://apprendre.centdegres.ca/wp-content/uploads/2025/12/MAPAQ_Repertoire-recettes-vf.pdf), recipe “Pouding semoule d'orge,” printed pp. 28–29 (existing S01) | Ingredient list gives **1½ tasse (315 g) de semoule d'orge grosseur moyenne** and identifies the formula as 25 portions. The next steps pour the semolina into boiling milk and cook until thickened. The local-buying guide names Moulin Abénakis and Semican for the medium-size ingredient. | This is one batch formula, not 25 separately weighed ingredient portions. The publication does not give a semolina-specific fill/packing method or reusable volume-to-mass relationship. Its general table defines a cup as 250 mL, but that does not establish a barley-semolina density or justify a general conversion. The source does not state that either named supplier's exact product was used in the recipe. |

The source is a Québec recipe directory published in fall 2025 with MAPAQ funding and ITHQ participation. It directly supports the bilingual catalog's existing Québec ingredient wording and a paired amount for the named medium-size barley semolina in this formula. It does not support a product label measure, a supplier-specific SKU value, a cooking yield, or an active conversion.

## Ownership, picker, forms, substitutions, and recipe-demand audit

| Surface | Current state | R643 disposition |
|---|---|---|
| Active identity and Québec wording | `ingredient-ref-barley-semolina`, `barley semolina / semoule d'orge`, category `GRAIN_AND_CEREAL`; existing aliases are `medium barley semolina` and `semoule d'orge grosseur moyenne`. R397 grounded the French phrase in Québec food-use evidence; it is not presented as an OQLF ruling. | Preserve the identity, French display, aliases, category, and picker projection unchanged. No new alias or translation is proposed. |
| Source and observation ownership | Existing ledger source `WP02-A7-BARLEY-SEMOLINA-R397-20261017-S01` already owns the MAPAQ-funded recipe URL and the paired amount. The proposed R643 observation ID and proposal path are unowned. | Reuse S01; append only the new observation and decision. Do not duplicate the source URL or source ID. |
| Density and unit mappings | Active `defaultDensity` is `null`; `unitMappings` is empty. | Keep both fields unchanged. The published recipe pair stays in the research ledger only. |
| Forms, rules, and yields | No matching ingredient form, global form-conversion rule, contextual substitution rule, or package-yield record is present for this identity. The ledger's substitution state is already `researched_no_supported_substitute`. | Add none; preserve the existing substitution finding and state. |
| Picker effect | Names and aliases remain unchanged, and the measurement observation is ledger-only. | No search result changes. |
| Bundled recipe demand | Parsed all 114 manifest-listed recipe files and 1,123 structured ingredient rows. No `ingredient-ref-barley-semolina`, `barley semolina`, `semolina barley`, `semoule d'orge`, or `semoule d'orge grosseur moyenne` ingredient match was found. | The external Québec pudding is source evidence only. Add no bundled recipe link or edit. |

The proposal path `wp02-a7-barley-semolina-recipe-portion-review-r643-20261018.md` and observation ID `barley-semolina-ithq-pouding-1-5-cups-315-g-r643-20261018` were absent before this review. The R397 source S01 and its URL are already attached to the target ledger row.

## Exact proposed ledger delta

Merge the following into the current ledger record whose `recordId` is `ingredient-ref-barley-semolina`. Retain all other record fields and source entries.

1. Set `measurementState` to `researched_supported`.
2. Append this one formula-specific observation. Keep the published amounts exactly as stated; do not derive a per-serving value, `observedVolumeMl`, density, or conversion.

```json
{
  "observationId": "barley-semolina-ithq-pouding-1-5-cups-315-g-r643-20261018",
  "relationship": "portion_weight",
  "value": 315,
  "valueUnit": "g",
  "foodDescription": "Medium-size barley semolina listed in the ITHQ Pouding semoule d'orge recipe in the Québec recipe directory.",
  "foodState": "Semolina as listed in the ingredient line before it is added to boiling milk; the source does not give a separate preparation state.",
  "measurementMethod": "The published formula lists 1½ tasse (315 g). It does not describe an independent weighing procedure or a semolina fill/packing method.",
  "quantityBasis": "One 25-portion Pouding semoule d'orge batch formula only. Preserve the published cup and gram pair; do not infer a per-serving amount, general cup weight, density, conversion, or value for another supplier or grade.",
  "sourceQuantity": {
    "amount": 1.5,
    "unit": "cup",
    "unitConvention": "The source states 1½ tasse and its general table defines 1 tasse as 250 mL; no semolina-specific fill or packing method is given."
  },
  "observedMassG": 315,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-BARLEY-SEMOLINA-R397-20261017-S01"
  ]
}
```

3. Append this decision. Keep `substitutionResearchState: researched_no_supported_substitute`, `defaultDensity: null`, and `unitMappings: []` unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record one source-reported recipe amount, 1½ cups (315 g), for medium-size barley semolina in the Québec Pouding semoule d'orge formula for 25 portions. This is a batch-formula quantity, not a per-serving amount, supplier-specific package serving, direct weighing protocol, or general volume-to-mass conversion. Retain the published pair only in the research ledger; keep active names, aliases, picker results, density, unit mappings, forms, yields, recipe links, and substitution behavior unchanged.",
  "sourceIds": [
    "WP02-A7-BARLEY-SEMOLINA-R397-20261017-S01"
  ]
}
```

## Static review checks

- Read `AGENTS.md`, the relevant `Requirements.md` conversion rules, current A7 checklist and roadmap, active reference and ledger row, research-ledger schema, and recent A7 proposal and integration history.
- Reopened the current MAPAQ-funded Québec recipe directory. The recipe page directly gives 1½ cups (315 g), identifies medium-size barley semolina, and reports a 25-portion batch. No derived value is proposed.
- Audited current display/alias ownership, active density and mappings, forms, global and contextual rules, package yields, and bundled recipe ingredient rows. No catalog, picker, recipe, or substitution behavior change is proposed.
- Confirmed that the reused source ID/URL already belong to the target row and that the proposed observation ID and proposal path are unowned.
- Parsed all 114 manifest-listed recipes and 1,123 ingredient rows; no barley-semolina ingredient demand was found.
- Checked the source, observation, and decision examples against `docs/catalog/research-ledger.schema.json` through a simulated row merge. This is proposal-only static validation; no software tests, build, emulator checks, or shared-file edits were made.

## Root integration review

- Rechecked the existing R397 S01 source ID and URL on `ingredient-ref-barley-semolina`; added no duplicate source record.
- Added the published 1½-cup (315 g) amount as one observation for the named medium-size semolina in this 25-portion formula. No per-serving amount, density, conversion, form, recipe link, or substitution was derived.
- Static package, generated-index, ledger-schema, ownership, encoding, link, and scoped-whitespace checks passed. No software tests were run because this update only adds database JSON data under `AGENTS.md`.
