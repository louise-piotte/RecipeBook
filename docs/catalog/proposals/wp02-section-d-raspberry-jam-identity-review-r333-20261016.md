# WP02 Section D R333 — Raspberry jam identity review

- **Reviewed:** 2026-10-16
- **Status:** proposal only; no shared catalog or ledger files changed
- **Scope:** source review for the existing `ingredient-ref-raspberry-jam` identity
- **Recommendation:** **no catalog change**; the current bilingual identity is supported. The integration owner may mark its identity evidence reviewed in the ledger using this packet. Leave measurements and general substitution research unresolved.

## Recommendation

Keep the existing record as `raspberry jam / confiture de framboises` in `SAUCE_AND_CONDIMENT`, with no aliases, density, or unit mappings. Add no new reference and do not relink the existing recipe line. The current names are directly supported by Québec terminology, Canadian product standards, a Québec food-service retailer, and a Québec food listing.

Do not add the retail singular `confiture de framboise` as an alias. It is attested for a current Bonne Maman product in Québec, but the picker already returns only the raspberry-jam reference for that query through partial matching against `confiture de framboises`; an alias would not change the result. Keep the plural as the display name because OQLF says the fruit complement of *confiture* is generally plural and Québec food listings use `confiture de framboises`.

If integrated, attach proposal-local identity sources S01–S05 below to the existing ingredient-reference ledger row and set only `identityState` to `verified`. Keep `measurementState` and `substitutionResearchState` at their current `not_yet_researched` values. Keep reused R326 evidence with its existing owner; this proposal does not copy or edit ledger records.

## Ownership, current record, and prior-work audit

Section D is the owner for baking fruit products. The active seed and the fallback Kotlin catalog both contain the same record:

| Field | Current value |
|---|---|
| ID | `ingredient-ref-raspberry-jam` |
| English | `raspberry jam` |
| French (Québec) | `confiture de framboises` |
| Category | `SAUCE_AND_CONDIMENT` |
| Aliases | none |
| Density / unit mappings | `null` / empty |

The research-ledger row remains `identityState=unreviewed`, `measurementState=not_yet_researched`, `substitutionResearchState=not_yet_researched`, with no sources or decisions. No legacy candidate or second active owner for `raspberry jam` or `confiture de framboise(s)` was found. The active references for fresh raspberries, freeze-dried raspberries, strawberry jam, and strawberry purée remain separate.

Prior-work boundary:

- The 2026-10-10 WP02 fruit-product review and 2026-10-12 Section D gap sweep recorded the existing raspberry-jam link and left its identity ledger row unreviewed; neither resolved its naming evidence.
- The R326 strawberry-jam review explicitly scoped raspberry jam out. R326 recorded one source-specific strawberry-for-raspberry alternative for its Linzer filling under the strawberry-jam ledger record. This review cites that source only to preserve its ownership and does not duplicate or generalize the finding.
- WP03 fruit proposals mention the existing row as a neighbor; they do not own or resolve its WP02 identity evidence.
- R329 reviewed the dark-chocolate percentage qualifier and is unrelated to this fruit-product identity.

## Recipe demand and corpus boundary

The 114-recipe manifest has one direct raspberry-jam ingredient line:

| Recipe line | Authored text | Existing link | Disposition |
|---|---|---|---|
| 010 Linzer Cookies, `a1e9ba5d-be5c-447d-a368-3ae4954a0a07-ingredient-10` | `120 ml raspberry jam` | `ingredient-ref-raspberry-jam` | Keep text, quantity, unit, and link unchanged. |

The source recipe card lists `1/2 cup raspberry jam or strawberry jam strained (120 mL)` and recommends straining seeded jam; its seedless-jam amount is recipe-specific. The imported bundle contains only raspberry jam on this line. R326 already records the optional strawberry-jam alternative for this exact source formula, so R333 adds no alternate to the bundled recipe and no second substitution finding.

This decision is about the named jam product only. It does not claim that every raspberry jam has the same fruit percentage, pectin, seed state, sweetness, or texture. Keep jam separate from fresh or frozen raspberries, freeze-dried raspberries, raspberry purée, jelly, lower-sugar fruit spread, and prepared fruit filling. The CFIA standard gives separate definitions for jam, jelly, and pie filling; this supports keeping those catalog boundaries distinct.

## Identity and picker projection

No identity or alias change is proposed:

```text
id: ingredient-ref-raspberry-jam
nameEn: raspberry jam
nameFr: confiture de framboises
aliasesEn: []
aliasesFr: []
category: SAUCE_AND_CONDIMENT
defaultDensity: null
unitMappings: []
```

The picker uses bilingual names and aliases, folds accents and punctuation, and prefers complete word phrases before partial matches. With the current record and no new aliases, the projection is:

| Query | Match path | Result |
|---|---|---|
| `raspberry jam` | complete phrase | `ingredient-ref-raspberry-jam` only |
| `confiture de framboises` | complete phrase | `ingredient-ref-raspberry-jam` only |
| `confiture de framboise` | partial fallback against the plural display | `ingredient-ref-raspberry-jam` only |

The singular Québec retail wording therefore does not need an alias for picker reachability. The first two complete-phrase queries retain the unambiguous product identity. Broader queries such as `framboise` and `confiture` return multiple neighboring fruit or spread identities and should not be added as aliases.

## Measurement and substitution evidence

- The bundled line and its cited recipe source give a formula-specific volume amount: `120 mL` / `1/2 cup`. This is an authored recipe quantity, not a mass equivalence, ingredient density, or universal conversion.
- Mayrand lists a 250 mL Bonne Maman retail unit. Package volume is product-specific and is not a serving conversion or package yield for generic raspberry jam.
- No current source in this review pairs a generic raspberry-jam volume with mass. Keep density null and mappings empty; do not infer a gram value from the recipe, package label, calories, or another jam product.
- The Preppy Kitchen recipe explicitly permits strawberry or raspberry jam in that Linzer-cookie formula and gives a separate seedless amount. R326 already stores that scoped observation. It supports no global jam substitution, no substitution to fresh fruit or purée, and no general equivalence among raspberry jam, jelly, or fruit spread.

## Source register

Pages checked on 2026-10-16. IDs marked **reuse** are owned by prior packets; other IDs are proposal-local and were checked for collision.

| ID | Source and locator | Support and limits |
|---|---|---|
| `WP02-D-RASPBERRY-JAM-R333-20261016-S01` | OQLF, [confiture (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059918/confiture), definition, English term, and usage note. | Defines *confiture* as a spreadable preparation of whole or cut fruit cooked with sugar; gives English *jam* and says the fruit complement is generally plural. Supports the current product-class wording, not a raspberry recipe measure or a fixed commercial formula. |
| `WP02-D-RASPBERRY-JAM-R333-20261016-S02` | OQLF, [confiture de, compote de, jus de + nom](https://vitrinelinguistique.oqlf.gouv.qc.ca/index.php?id=22906), examples and grammatical note. | Supports plural complements for countable fruit names; does not itself provide a raspberry-jam product label. |
| `WP02-D-RASPBERRY-JAM-R333-20261016-S03` | OQLF, [linzertorte (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17038879/linzertorte), definition. | Describes this Québec culinary term as a tart filled with *confiture de framboises*. Supports the exact plural French phrase in baking context; does not establish an ingredient specification or measure. |
| `WP02-D-RASPBERRY-JAM-R333-20261016-S04` | Mayrand, [Raspberry Jam 250 ml](https://mayrand.ca/en/our-products/grocery/jam-and-spread/jelly-and-jam/confiture-de-framboises-bonne-maman-05781) and [Confiture de framboise 250 ml](https://mayrand.ca/fr/nos-produits/epicerie/confiture-et-tartinade/gelee-et-confiture/confiture-de-framboises-bonne-maman-05781), Bonne Maman item 05781, UPC 088702016406. | Québec food-service retailer pairs the English product name with a singular French label on the same SKU. Confirms a local retail spelling and product package size; it is one branded item and does not override the OQLF plural convention or provide mass. |
| `WP02-D-RASPBERRY-JAM-R333-20261016-S05` | Aliments du Québec, [Confiture de framboises](https://alimentsduquebec.com/aliments-dici/confiseries-et-produits-sucres/confiture-de-framboises-6), product title. | A Québec product listing attests the plural display phrase. The listing does not establish a universal ingredient composition or conversion. |
| **Reuse `WP02-D-STRAWBERRY-JAM-R326-20261016-S02`** | CFIA, [Normes d’identité canadiennes, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§74–78. | The generic standard names `confiture de (nom du fruit)` and separately names `gelée de (nom du fruit)`; the exact locator is already owned by R326. Supports the jam/jelly product-class boundary, not a specific raspberries formula or measure. |
| **Reuse `WP02-D-STRAWBERRY-JAM-R326-20261016-S07`** | John Kanell / Preppy Kitchen, [Linzer Cookies](https://preppykitchen.com/linzer-cookies/), ingredient card and seedless-jam notes. | Lists `1/2 cup raspberry jam or strawberry jam strained (120 mL)` and gives an adjusted amount for seedless jam. R326 already recorded this as one source-formula-specific alternate; do not duplicate the ledger observation or generalize it. |

## Evidence gaps and integration boundary

- Identity wording is sufficiently supported for review of the existing bilingual row; commercial recipes and package formulas still vary.
- A current raspberry-jam-specific mass paired with volume was not established. Keep measurement state unresolved and all active conversion fields empty.
- R326's formula-specific jam alternative is not a global substitution rule. Keep general substitution state unresolved and add no active substitution.
- This is a proposal only. The integration owner controls ledger updates and any later shared catalog changes. No recipe, reference, alias, form, measure, mapping, density, or substitution was changed here.
