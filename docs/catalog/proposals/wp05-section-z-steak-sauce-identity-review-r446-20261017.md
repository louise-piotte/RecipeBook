# WP05 Section Z — steak sauce identity review (R446)

- **Packet type:** root-reviewed integration; this review adds only an identity reference and its evidence ledger record.
- **Scope:** one still-open WP05 Section Z condiment family: commercially marketed steak sauce. Audit covers current references, forms, ledger ownership, picker terms, and every manifest-listed recipe.
- **Research date:** 2026-10-17.
- **Decision:** add identity-only `steak sauce / sauce à bifteck`, with the source-attested French alias `sauce à steak`. Keep it separate from North American barbecue sauce and Worcestershire sauce; do not treat it as a synonym for every sauce served with steak or as a shared formula.

## Catalog delta

| Field | Value |
|---|---|
| `id` | `ingredient-ref-steak-sauce` |
| `nameEn` | `steak sauce` |
| `nameFr` | `sauce à bifteck` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `["sauce à steak"]` |
| `category` | `SAUCE_AND_CONDIMENT` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-17T00:00:00Z` |

The Canadian Kraft Heinz product page names A.1. Original Steak Sauce in English and Sauce à bifteck originale in French. Its French A.1. page also uses the phrase `sauce à steak`; a current Canadian grocery shelf groups A1, HP, and The Keg products under BBQ and steak sauces. This supports a useful commercial condiment identity and a narrow French alias, but the retailer examples do not establish one composition. The Canadian Beef French recipe uses `sauce à bifteck` as a separately named marinade ingredient. OQLF identifies `bifteck` as a preferred Québec French term and also accepts `steak`. [S01–S05]

The identity is for products explicitly marketed as steak sauce. It does not cover every composed sauce served with steak, such as Béarnaise, peppercorn sauce, or chimichurri. Keep barbecue sauce and Worcestershire sauce in their existing identities. Do not add HP, A1/A.1., The Keg, `brown sauce`, or a generic `sauce brune` alias; keep the broader brown-sauce review open. The products vary by maker, and no universal formula is supported.

Add one ledger record for `ingredient-ref-steak-sauce`, with `identityState=verified`, `measurementState=researched_no_supported_value`, and `substitutionResearchState=not_yet_researched`. Record the official A.1. 1 tbsp (15 mL) nutrition serving only as product-specific source evidence; do not create a generic measurement observation. The Canadian Beef recipe quantities are recipe-specific and do not establish a reusable measure. No form, density, mapping, recipe link, conversion, yield, or substitution is added.

## Ownership and bundled recipe scan

The active catalog has no `steak sauce`, `sauce à bifteck`, or `sauce à steak` reference or form. The 114 manifest-listed recipe files contain 1,123 ingredient rows. A full scan found no candidate-specific mention or link. The only adjacent sauce matches are existing barbecue sauce in recipes 036 and 082, and Worcestershire sauce in recipes 074 and 078; their current reference links remain unchanged.

The row is identity-only, so exact searches for `steak sauce`, `sauce à bifteck`, and `sauce à steak` return this reference. Broad `sauce` search remains a large multi-result query. No recipe rows or recipe quantities change.

## Sources accessed 2026-10-17

| ID | Source | Support and limits |
|---|---|---|
| **WP05-STEAKSAUCE-R446-20261017-S01** | Kraft Heinz Canada, [Original Steak Sauce](https://www.kraftheinz.com/en-CA/heinz-a1-sauce/products/00062287170111-original-steak-sauce). | Current Canadian manufacturer product title and description establish the English market wording. Its 1 tbsp (15 mL) serving and product composition are specific to A.1.; neither is a generic measure or formula. |
| **WP05-STEAKSAUCE-R446-20261017-S02** | Heinz Canada, [Sauce à bifteck originale](https://www.kraftheinz.com/fr-CA/heinz-a1-sauce/produits/00062287170111-sauce-a-bifteck-originale). | French product title, description, ingredient list, and serving panel for the same Canadian product ID support `sauce à bifteck`; label quantities remain product-specific. |
| **WP05-STEAKSAUCE-R446-20261017-S03** | Kraft Heinz Canada, [A1 - Sauce à steak](https://www.kraftheinz.com/fr-CA/a1). | French A.1. brand page title and copy support `sauce à steak` as a narrow search alias. It does not establish a shared French formula. |
| **WP05-STEAKSAUCE-R446-20261017-S04** | Your Independent Grocer, [Sauces BBQ et à bifteck](https://www.yourindependentgrocer.ca/fr/alimentation/garde-manger/condiments-et-garnitures/sauces-bbq-et-bifteck/c/29899). | Current Canadian French retail category includes A1 `Sauce à bifteck`, HP `Sauce à bifteck`, and The Keg `Sauce à steak`. This supports market usage and product diversity, not formula equivalence or a universal standard. |
| **WP05-STEAKSAUCE-R446-20261017-S05** | Canadian Beef, [Merveilleuses marinades pour les biftecks à mariner](https://fr.canadabeef.ca/recipes/merveilleuses-marinades-pour-les-biftecks-a-mariner/). | A French Canadian beef recipe uses `sauce à bifteck` as a named marinade ingredient in recipe-specific quantities. The source does not provide a reusable measure or define all steak sauces. |
| **WP05-STEAKSAUCE-R446-20261017-S06** | Office québécois de la langue française, [bifteck](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358742/bifteck). | Gives `bifteck` and `steak` as acceptable Québec French terms for steak. This supports local wording only; it does not name or define a sauce. |

The full-library checklist remains open for ketchup, mustard varieties, mayonnaise and other remaining condiment identities, plus the separate brown-sauce review.
