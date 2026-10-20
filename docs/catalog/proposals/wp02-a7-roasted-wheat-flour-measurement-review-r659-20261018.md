# WP02 Section A7 R659: roasted-wheat-flour measurement review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated on 2026-10-18 after root review.
- **Plan anchor:** The parent checklist remains open for other grain meals and malted/toasted flour identities in [WP02 Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094).
- **Scope:** Complete a bounded measurement-evidence review for the existing Québec-mill product `ingredient-ref-roasted-wheat-flour`. This does not reopen its identity, French display, or separation from malted and other roasted flours.
- **Distinct scope:** R656 concerns Khorasan semolina. R552 concerns roasted barley flour. The prior wheat-malt equivalence review R58 concerns a different ingredient row. R659 reviews measurement support for the Québec mill's roasted **wheat flour** product only.

## Recommendation

**Record that measurement research found no supported value for the existing `ingredient-ref-roasted-wheat-flour` row. Keep active numeric behavior unsupported.** The current English and French manufacturer pages identify the product and suggest bakery applications, but provide no serving size, package mass, exact recipe quantity, mass-to-volume pair, density, or measurement method. They do not establish an amount that can safely be applied to a recipe line.

Propose a **ledger-only** update:

1. Set the existing row's `measurementState` to `researched_no_supported_value`.
2. Refresh its existing manufacturer source records `WP02-S126` and `WP02-S127` with the current-page locators and evidence limits below. Do not add duplicate source IDs or URLs.
3. Append the decision below. Leave `observations` empty and keep `substitutionResearchState: not_yet_researched`.

No active density, unit mapping, conversion, form, package yield, recipe link, or substitution is supported. The proposal does not infer a dose from the manufacturer's descriptions of flour performance or suggest replacement of ordinary wheat flour.

## Source evidence and limits

Les Moulins de Soulanges' current [English product page](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/) calls the product **Roasted Wheat Flour**, describes flavor/aroma and handling benefits, and lists sourdough bread, baguette, pie, and brioche as suggested uses. The page gives no formula, dose, serving, package size, mass, or volume measure.

Its current [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/) names **Farine de Blé Torréfié**, describes the roasting of the wheat flour, and gives the same broad application examples. It likewise supplies no recipe quantity or measure. Retain the existing Québec French display `farine de blé torréfiée`; this measurement review makes no terminology or alias change.

The manufacturer’s broader [Functional Ingredients page](https://moulinsdesoulanges.com/language/en/functional-ingredients-2/) lists roasted wheat flour among specialty flour products. It provides general product claims and no quantity or formula. Its URL is already recorded as source `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S06` on the roasted-quinoa-flour ledger row, so R659 does not copy it into this row or use it to derive a measurement.

These sources support identity and suggested-use context only. The conclusion is bounded to the current pages reviewed; it does not claim that no unpublished technical sheet or customer-specific bakery formula exists.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R659 disposition |
|---|---|---|
| Active identity | `ingredient-ref-roasted-wheat-flour`, displayed `roasted wheat flour / farine de blé torréfiée`, category `FLOUR_AND_STARCH`; English and French alias lists are empty. | Keep the row and names unchanged. Add no alias or new identity. |
| Numeric catalog fields | `defaultDensity` is `null`; `unitMappings` is empty. | Preserve both. No mass-volume conversion can be calculated from this row. |
| Source ownership | The English and French product URLs are already owned by this row as `WP02-S126` and `WP02-S127`. Their IDs and URLs are reused and refreshed, not duplicated. The broader functional-ingredients URL is already recorded on another row and is not copied. | Add no source ID. No source URL changes owner. |
| Adjacent identities | Roasted wheat malt flour, malted wheat flour, roasted barley flour, roasted corn flour, and general wheat flour remain separate active rows. | Do not transfer a serving, recipe amount, density, or dosage among these products. |
| Forms, rules, and yields | No form, direct substitution rule, contextual substitution rule, or package yield references the target ID. | Add none. Keep substitution research `not_yet_researched`. |
| Picker effect | The existing canonical English and Québec French names remain exact owners; no aliases are added. | No picker results change. |
| Bundled recipes | Parsed all 114 manifest-listed recipe files and all 1,123 structured ingredient rows. The serialized recipe files and ingredient rows contain no roasted-wheat-flour name, reviewed French wording, or direct target reference ID. | No bundled recipe demand, link, relink, or recipe edit is proposed. |

The current package contains 1,833 active ingredient references, 164 forms, zero global substitution rules, zero contextual substitution rules, and one package-yield entry. None of the latter three data sets references `ingredient-ref-roasted-wheat-flour`.

## Integrated ledger delta

Apply these changes only to ledger record `ingredient-ref-roasted-wheat-flour`; retain its other sources and decisions.

### Measurement state

```json
{
  "measurementState": "researched_no_supported_value"
}
```

### Refresh the two existing source records

```json
[
  {
    "sourceId": "WP02-S126",
    "url": "https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/",
    "title": "Les Moulins de Soulanges, Roasted Wheat Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product description and suggested uses.",
    "supports": "The current Québec manufacturer page identifies a roasted wheat flour product, describes its flavor/aroma and handling roles, and suggests sourdough bread, baguette, pie, and brioche. It gives no exact recipe quantity, serving size, package amount, mass-to-volume pair, density, or measurement method; the use examples do not establish a general dose.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-S127",
    "url": "https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/",
    "title": "Les Moulins de Soulanges, Farine de Blé Torréfié",
    "accessedOn": "2026-10-18",
    "locator": "French product description and suggested uses.",
    "supports": "The current Québec manufacturer page names Farine de Blé Torréfié, discusses roasting of the wheat flour, and suggests Miche Campagnarde, baguette, pie, and brioche. It gives no exact recipe quantity, serving size, package amount, mass-to-volume pair, density, or measurement method; the use examples do not establish a general dose. The active catalog's feminine display farine de blé torréfiée remains unchanged.",
    "sourceKind": "manufacturer"
  }
]
```

### Append one decision

```json
{
  "outcome": "accepted",
  "reason": "For the existing Québec-mill roasted-wheat-flour identity, the current bilingual manufacturer pages provide the product name and broad suggested bakery uses but no exact formula quantity, serving, package amount, mass-to-volume pair, density, or measurement method. Mark measurement research as researched_no_supported_value. Keep observations empty, defaultDensity null, unitMappings empty, substitution research unchanged, and active catalog behavior, forms, conversions, yields, recipe links, and substitutions unchanged.",
  "sourceIds": [
    "WP02-S126",
    "WP02-S127"
  ]
}
```

There is no observation delta. In particular, do not record a guessed recipe amount, derive grams from a photograph or nutrition claim, or reuse quantities from roasted barley, roasted wheat malt flour, malted wheat flour, or unroasted flour.

## Source and identifier audit

The active ledger already contains the exact English and French product URLs under source IDs `WP02-S126` and `WP02-S127`, both owned by `ingredient-ref-roasted-wheat-flour`. R659 reuses those existing records and introduces no source ID, observation ID, candidate ID, alias, or ingredient ID. The wider functional-ingredients URL remains with its existing source ID `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S06` on the separate roasted-quinoa record and is not duplicated. The R659 proposal path was absent before drafting.

## Static checks

- Re-read `AGENTS.md`, the relevant weight-volume rule in `Requirements.md`, the active roadmap, current A7 checklist, baking-flour reference notes, source records, measurement-ledger schema, package references/forms/rules/yields, and recent A7 proposals through R656.
- Confirmed `measurementState: not_yet_researched`, no measurement observations, and `substitutionResearchState: not_yet_researched` on the target ledger row before this proposal.
- Checked the current bilingual manufacturer pages directly on 2026-10-18. Their accessible product/use descriptions contain no numeric formula or serving data for this product.
- Audited source-ID and URL ownership, active aliases and adjacent identities, forms/rules/yields, and all 114 recipes / 1,123 ingredient rows.
- Ledger schema/custom validation passed after integration; the existing source IDs and URLs remain attached to the target record, with no duplicate source or observation identifiers. Static package and generated-index checks, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed because this update changes only database JSON under `AGENTS.md`.
