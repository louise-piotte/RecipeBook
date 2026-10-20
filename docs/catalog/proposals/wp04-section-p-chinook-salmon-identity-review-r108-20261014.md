# WP04 Section P — Chinook salmon / saumon quinnat identity review (R108)

- **Review date:** 2026-10-14
- **Scope:** Chinook salmon, *Oncorhynchus tshawytscha* (CFIA TSN 161980).
- **Recommendation:** Add identity-only `chinook salmon / saumon quinnat` as `PROTEIN`. Keep `king salmon` as an English alias and `saumon royal` as a French alias. Add no forms, active measures, density, unit mappings, recipe links, conversions, yields, or substitutions.
- **Recipe boundary:** Keep recipe 077 row 10 linked to generic `salmon fillets / filet de saumon`; no species is named.

## Names and taxon

OQLF's edible-fish entry identifies *Oncorhynchus tshawytscha* and names both `saumon quinnat` and `saumon royal` as preferred French terms. Its English translations include `chinook salmon` and `king salmon`. OQLF says `saumon chinook` and `saumon roi` were not retained by the fish-product terminology committee. Use `chinook salmon / saumon quinnat` as the displays, and retain `king salmon` and the preferred `saumon royal` as aliases. [S01]

CFIA's Fish List assigns TSN 161980 to *O. tshawytscha* and lists Chinook Salmon, King Salmon, and Spring Salmon under that taxon. DFO also identifies Chinook salmon as *O. tshawytscha*. DFO describes Chinook as “spring salmon” because some populations return to rivers earlier; it also documents multiple spring, fall, and winter runs. Do not add `spring salmon` as a catalog alias because that term also names a run timing. Keep `saumon de printemps`, `saumon chinook`, and `saumon roi` out of the aliases. [S02–S03]

A current Metro Québec grocery listing identifies an `Organic King Salmon Fillet` as *O. tshawytscha*, from the Northeast Pacific/Canada, and farm raised. The selected store showed the listing out of stock when reviewed. This is evidence for a species-qualified Canadian product and the `king salmon` wording, not a claim about general Québec availability or a reusable fillet size. [S04]

## CNF portions and catalog limits

Health Canada's 2019 Canadian Nutrient File has separate raw and smoked Chinook entries. Raw code 3051 lists a 198 g half-fillet and a 90 g Food Guide serving. Smoked code 3050 lists 57.5 g per 100 mL flaked, 143.7 g per 250 mL, and 20 g per piece. Keep these five portions as code-specific ledger observations. They do not establish general Chinook measures, a density, a raw-to-smoked yield, or a recipe quantity. [S05–S06]

The product listing and CNF entries do not support a universal form set or equal-amount substitution between Chinook, generic salmon fillets, chum, pink, coho, sockeye, or other fish. Add no form, measure, density, mapping, conversion, yield, or substitution.

## Ownership, recipe demand, and picker projection

The catalog snapshot before integration had 1,447 references, 105 forms, 63 legacy candidates, and 1,787 ledger records. Exact normalized ownership checks found no existing owner for `chinook salmon`, `saumon quinnat`, `saumon royal`, `king salmon`, *O. tshawytscha*, or `ingredient-ref-chinook-salmon`. No Chinook identity record or R108 source-ID prefix was allocated. The existing salmon rows are generic salmon fillets, chum, pink, coho, and sockeye.

The phrase-first picker matches full terms before substring fallback. Projection with the proposed displays and aliases gives:

| Query | Current results | With proposed row |
|---|---|---|
| `chinook salmon` / `chinook` | None | Chinook salmon / saumon quinnat |
| `saumon quinnat` / `quinnat` | None | Chinook salmon / saumon quinnat |
| `saumon royal` | None | Chinook salmon / saumon quinnat |
| `king salmon` | None | Chinook salmon / saumon quinnat |
| `salmon` / `saumon` | Generic salmon fillets; chum; coho; pink; sockeye | Those five plus Chinook |
| `salmon fillets` / `filet de saumon` | Generic salmon fillets | Generic salmon fillets |
| `chum salmon`, `pink salmon`, `coho salmon`, `sockeye salmon` | Their existing species rows | Unchanged |
| `spring salmon` | None | None; term omitted because it also describes Chinook run timing |
| `king` / `royal` | One unrelated King oyster mushroom row | That row plus Chinook; neither broad query is a singleton |

The full manifest-listed bundle contains 114 recipe files and 1,123 ingredient rows. A scan of every recipe file and ingredient row found no Chinook, quinnat, king-salmon, or *O. tshawytscha* demand. Recipe 077#10 remains 675 g of generic salmon fillets without skin, linked to `ingredient-ref-salmon-fillets-without-skin`.

## Proposed canonical reference

```json
{
  "id": "ingredient-ref-chinook-salmon",
  "nameEn": "chinook salmon",
  "nameFr": "saumon quinnat",
  "aliasesEn": ["king salmon"],
  "aliasesFr": ["saumon royal"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
```

## Sources

| ID | Source | Evidence and limit |
|---|---|---|
| `WP04-SECTIONP-CHINOOK-SALMON-R108-20261014-S01` | OQLF, [saumon quinnat, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198948/saumon-quinnat), updated 2012. | Identifies *O. tshawytscha*; gives `saumon quinnat` and `saumon royal` as preferred terms and `chinook salmon`, `spring salmon`, `king salmon` in English; says `saumon chinook` and `saumon roi` were not retained for fish-product terminology. |
| `WP04-SECTIONP-CHINOOK-SALMON-R108-20261014-S02` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=chinook), modified 2023-09-18. | Assigns TSN 161980 to *O. tshawytscha* and lists Chinook Salmon, King Salmon, and Spring Salmon. Name-to-taxon evidence; not recipe evidence. |
| `WP04-SECTIONP-CHINOOK-SALMON-R108-20261014-S03` | Fisheries and Oceans Canada, [Information about Pacific salmon](https://www.pac.dfo-mpo.gc.ca/fm-gp/salmon-saumon/facts-infos-eng.html). | Identifies Chinook as *O. tshawytscha*; explains “spring salmon” by earlier river returns in some populations and notes multiple run timings. Does not select recipe 077's species. |
| `WP04-SECTIONP-CHINOOK-SALMON-R108-20261014-S04` | Metro, [Organic King Salmon Fillet, product 239573](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/salmon-trout-tuna/organic-chinook-salmon-fillet/p/239573), accessed 2026-10-14. | Product page identifies *O. tshawytscha*, Northeast Pacific/Canada provenance, and farmed method. Selected store showed out of stock; seller-specific item, not general availability or a fillet measure. |
| `WP04-SECTIONP-CHINOOK-SALMON-R108-20261014-S05` | Health Canada, [CNF food code 3051: raw Chinook](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3051), modified 2019-03-01. | Raw food-code half-fillet and Food Guide portion; not a general fillet measure or recipe quantity. |
| `WP04-SECTIONP-CHINOOK-SALMON-R108-20261014-S06` | Health Canada, [CNF food code 3050: smoked Chinook](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3050), modified 2019-03-01. | Smoked food-code flaked-volume and piece portions; not raw density or conversion evidence. |

## Static review and integration status

Root rechecked ownership across references, forms, legacy candidates, and ledger identity records, reproduced the picker projection, verified the six primary/regional sources, and scanned the full recipe manifest. The identity was integrated as recommended: one reference, six sources, three decisions, and five ledger-only CNF observations. Static package, reference, generated-index, ledger, picker, corpus, encoding, link, and whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated catalog index.


The integration is complete. The generated catalog row preserves the reviewed displays and aliases, null density, and empty unit mappings. The ledger contains six sources, three decisions, and five code-specific observations. No app or Gradle tests were run because this change only adds database JSON data and its generated catalog index.
