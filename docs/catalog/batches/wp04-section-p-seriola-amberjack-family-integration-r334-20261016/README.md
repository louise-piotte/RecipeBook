# WP04 Section P R334 — Seriola amberjack identity integration

Reviewed and integrated on 2026-10-16. Added two identity-only protein references:

- `ingredient-ref-greater-amberjack`: `Greater amberjack / sériole` for *Seriola dumerili*.
- `ingredient-ref-japanese-amberjack`: `Japanese amberjack / sériole du Japon` for *S. quinqueradiata*, with `hamachi` as its only alias in both language fields.

CFIA Fish List rows distinguish both taxa and their Canadian English/French common names. OQLF prefers `sériole` for *S. dumerili* and gives English `greater amberjack`; a current Québec sushi menu pairs `sériole du Japon` with `Hamachi`, while an Ontario retailer directly identifies its Hamachi product as *S. quinqueradiata*. ITIS confirms both scientific names as valid species. OQLF's fish-name entry was last updated in 2012; the CFIA list also documents other *Seriola* taxa and overlapping names, so these two rows represent partial coverage only.

The live catalog had no owner for either species or proposed ID in 1,681 references, 129 forms, 58 legacy candidates, or 2,029 ledger records. The manifest scan covered 114 recipes and 1,123 ingredient rows and found no matches for either binomial, the common names, `sériole`, `hamachi`, or the unallocated yellowtail-family phrases. No recipe link was added.

## Picker projection

This static projection follows the phrase-first behavior in `IngredientSearch.kt`. It includes all active rows and then the two proposed displays and the `hamachi` alias:

| Query | Current matches | After R334 |
|---|---:|---:|
| `amberjack` | 0 | 2 |
| `sériole` | 0 | 2 |
| `Greater amberjack` | 0 | 1 |
| `Japanese amberjack` | 0 | 1 |
| `sériole du Japon` | 0 | 1 |
| `hamachi` | 0 | 1 |
| `yellowtail`, `buri`, `kanpachi`, `kingfish`, `Sériole à ceintures`, `Great amberjack` | 0 | 0 |

No aliases were added for broad, overlapping, stage-dependent, or unverified names. In particular, the active pair is not an exhaustive representation of *Seriola*: CFIA also lists *S. lalandi*, *S. rivoliana*, *S. zonata*, and *Seriola* spp. with overlapping names. R85, R328, and R331 remain unchanged.

Both ledger rows are `identityState: verified`; measurement and substitution research remain `not_yet_researched`. No forms, measures, densities, unit mappings, conversions, yields, recipe links, or substitutions were added. Retail presentations in the sources are not reusable catalog forms or measures.

## Sources

- [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Seriola search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp): Canadian English/French common names and overlapping *Seriola* name assignments.
- [OQLF GDT, sériole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198975/seriole): preferred Québec French term and *S. dumerili* identity; updated 2012.
- [ITIS, *Seriola dumerili*, TSN 168689](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168689) and [*Seriola quinqueradiata*, TSN 168698](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168698): valid taxonomic identities.
- [Seafood Depot, Hamachi](https://www.seafooddepot.ca/product-Hamachi): Ontario retailer directly pairs `Hamachi` with *S. quinqueradiata*.
- [Masako Plus Sushi, Sushi & Sashimi](https://masakosushibar.ca/sushi-sashimi/): Québec menu pairs `SÉRIOLE DU JAPON` and `Hamachi`.

Static package validation and normalization, reference normalization, generated-index freshness, and ledger schema/semantic validation passed. The combined catalog contains 1,683 references, 129 forms, 58 legacy candidates, and 2,031 ledger records; the 114-recipe / 1,123-row corpus scan found no demand. Exact picker projection, escaped-Unicode JSON, UTF-8/no-BOM, local links, and whitespace checks passed. No software tests, builds, emulator checks, or deployment were run because this work only adds database JSON data and its generated index under `AGENTS.md`.
