# WP04 Section P — Seriola amberjack-family coverage review (R334)

- **Review and source-access date:** 2026-10-16.
- **Status:** Proposal only. No active catalog, research ledger, plan, checklist, roadmap, generated file, recipe, or app file was changed.
- **Recommendation:** Add two identity-only `PROTEIN` references: **Greater amberjack / sériole** for *Seriola dumerili*, and **Japanese amberjack / sériole du Japon** for *S. quinqueradiata*. Add `hamachi` as a bilingual search alias only to the Japanese-amberjack row. Leave forms, measures, recipe links, conversions, yields, and substitutions empty.
- **Boundary:** This review does not reopen the R85 hold for *S. lalandi* / Hiramasa, the R328 blackfin-sea-bass hold, or the R331 Asian-seabass / *bar* boundary. No currently accepted taxon is duplicated.

## Why the pair is a distinct open gap

The Section P finfish parent remains open in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5748). The active references have no amberjack or *Seriola* identity. No active form, legacy-import candidate, or ledger record allocates either *S. dumerili* or *S. quinqueradiata*. The proposed IDs `ingredient-ref-greater-amberjack` and `ingredient-ref-japanese-amberjack`, plus the proposal-local source-ID prefix below, are unallocated. [WP04-SECTION-P-SERIOLA-R334-20261016-R01]

The related R85 review concerns a different species, *S. lalandi*, and a Québec Hiramasa product listing that did not consistently identify the species. It notes *S. dumerili* and *S. quinqueradiata* only as other taxa in the CFIA name family; it does not allocate either one. This proposal keeps the R85 decision unchanged and does not transfer Hiramasa, Great Amberjack, Yellowtail Kingfish, or `yellowtail` wording to either proposed row. [WP04-SECTION-P-SERIOLA-R334-20261016-R02]

The current CFIA Fish List separates several *Seriola* taxa but reuses broad `Amberjack / Sériole` and `Sériole à ceintures` wording across them. OQLF independently gives Québec’s preferred edible-fish term `sériole` for *S. dumerili* and identifies English `greater amberjack`. CFIA names *S. quinqueradiata* **Japanese Amberjack / Sériole du Japon**. Pairing these two identities makes both broad `amberjack` and `sériole` searches return more than one qualified result, while preserving the exact Québec species name for Japanese amberjack. This is a partial identity set, not a claim to represent every CFIA-listed *Seriola* species or the full genus. [S01–S02]

## Candidate identity and bounded delta

| Field | Greater amberjack | Japanese amberjack |
|---|---|---|
| Proposed reference ID | `ingredient-ref-greater-amberjack` | `ingredient-ref-japanese-amberjack` |
| Category | `PROTEIN` | `PROTEIN` |
| English display | `Greater amberjack` | `Japanese amberjack` |
| fr-CA display | `sériole` | `sériole du Japon` |
| Taxon in evidence | *Seriola dumerili* | *Seriola quinqueradiata* |
| Aliases | None | `hamachi` in both alias lists; the identical borrowed term is used in English Canadian retail and Québec French menu wording. |
| Forms and numeric data | None | None |

Use OQLF’s preferred `sériole` for *S. dumerili*. Do not use the Fish List’s `Sériole à ceintures` as the display or alias: CFIA also assigns that French wording to *S. zonata*, and OQLF says `grande sériole` and `sériole couronnée` were not retained by the Québec fish-products terminology committee. [S01–S02]

Keep the Japanese row’s alias set to `hamachi`. Do not add `yellowtail`, `buri`, `kanpachi`, `kingfish`, bare `amberjack`, or the French `sériole` as aliases. The two canonical displays already cover the broad amberjack / sériole searches. Canadian retail sources use `yellowtail` for *S. quinqueradiata*, but CFIA lists other *Seriola* taxa under amberjack/sériole names, and CFIA also assigns `Yellowtail` to *Limanda ferruginea*. `Buri` has size- and region-dependent use in the historical Japanese naming source reviewed here. `Kanpachi` is not linked to a scientific name on the current Canadian listing reviewed here. These terms should not be treated as species-exclusive aliases. [S01, S05, S08–S11]

The schema has no scientific-name field. Store the taxa in the evidence record, not as an invented schema property. No recipe line or cited source establishes a reusable ingredient form, mass/volume measure, density, conversion, yield, or directed replacement. Add none; leave those areas unknown. A retailer’s raw/sashimi wording and package weights remain that SKU’s facts, not cooking instructions or catalog measures. [WP04-SECTION-P-SERIOLA-R334-20261016-R01, S05–S08, S11]

## Current ownership and recipe-demand audit

The read-only snapshot contains **1,681 active references**, **129 forms**, **58 legacy-import candidates**, and **2,029 ledger records**. Exact searches across the active references/forms, legacy candidates, and ledger record ownership found no owner for either taxon, proposed reference ID, `Greater amberjack`, `Japanese amberjack`, `sériole`, `sériole du Japon`, or `hamachi`. The ledger contains unrelated prose mentioning `yellowtail` and `buri`; no *Seriola* identity is allocated there. Archive search found the adjacent R85 *S. lalandi* boundary review described above, but no focused allocation or prior decision for these two species. [WP04-SECTION-P-SERIOLA-R334-20261016-R01, WP04-SECTION-P-SERIOLA-R334-20261016-R02]

The manifest-ordered recipe scan covered all **114 bundled recipe files and 1,123 ingredient rows**. Complete normalized phrase checks for both binomials, both CFIA names, `sériole`, `sériole du Japon`, `hamachi`, `yellowtail`, `buri`, and `amberjack` found **zero recipe-file matches and zero ingredient-row matches**. Do not add recipe links or infer a recipe amount, method, product state, or substitution. [WP04-SECTION-P-SERIOLA-R334-20261016-R01]

## Exact phrase-first picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches are returned before substring fallback. Aliases are included in the bilingual term set. Rows below show active-reference results; the proposal adds identity-only references and no forms.

| Query | Current results | With proposed pair | Decision |
|---|---|---|---|
| `amberjack` | None | Greater amberjack; Japanese amberjack | Two visibly species-qualified results; no false singleton. |
| `sériole` | None | Greater amberjack / sériole; Japanese amberjack / sériole du Japon | OQLF’s *S. dumerili* result remains distinguishable from the qualified Japanese identity. |
| `Greater amberjack` | None | Greater amberjack / sériole | Exact species-name search. |
| `Japanese amberjack` | None | Japanese amberjack / sériole du Japon | Exact species-name search. |
| `sériole du Japon` | None | Japanese amberjack / sériole du Japon | Exact Québec display search. |
| `hamachi` | None | Japanese amberjack / sériole du Japon | Source-backed Canadian and Québec product wording. |
| `yellowtail`; `buri`; `kanpachi`; `kingfish`; `Sériole à ceintures`; `Great amberjack` | None | None | Ambiguous, stage-dependent, unverified, or held wording stays unallocated. |

This projection is deliberately not exhaustive of CFIA’s *Seriola* rows. CFIA also lists *S. lalandi*, *S. rivoliana*, *S. zonata*, and *Seriola* spp. under overlapping names; those taxa are not added here. In particular, do not use the result set to change R85’s *S. lalandi* Hiramasa hold. [S01, WP04-SECTION-P-SERIOLA-R334-20261016-R02]

## Source register and limits

The source IDs are proposal-local and are not added to the shared research ledger.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTION-P-SERIOLA-R334-20261016-S01** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [searchable Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), accessed 2026-10-16. | The overview says the Fish List supplies English/French common names accepted in Canada for fish labelling and scientific names/TSNs. Its *Seriola* rows list *S. dumerili* as `Amberjack / Sériole` and `Greater Amberjack / Sériole à ceintures`; *S. quinqueradiata* as `Japanese Amberjack / Sériole du Japon`; and overlapping names for *S. lalandi*, *S. rivoliana*, *S. zonata*, and *Seriola* spp. The same list assigns `Yellowtail` to *Limanda ferruginea*; this is an additional reason not to use it as a Japanese-amberjack alias. This is Canadian labelling evidence, not a claim about current retail inventory or recipe equivalence. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S02** | OQLF, [sériole, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198975/seriole), accessed 2026-10-16. | Identifies the edible *S. dumerili*, prefers `sériole`, and gives `greater amberjack` as English. The entry says the species has commercial potential in Québec, but was last updated in 2012 and does not prove current stock. It rejects `grande sériole` and `sériole couronnée` as fish-products committee terms. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S03** | ITIS, [*Seriola dumerili*, TSN 168689](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168689). | Taxonomic identity and valid standing for the greater-amberjack candidate. Not a Québec consumer-name or current-market source. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S04** | ITIS, [*Seriola quinqueradiata*, TSN 168698](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168698). | Taxonomic identity and valid standing for the Japanese-amberjack candidate. Not a Canadian label or product-availability source. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S05** | Seafood Depot, Vaughan, Ontario, [Hamachi](https://www.seafooddepot.ca/product-Hamachi), accessed 2026-10-16. | Direct product page identifies `Hamachi — Seriola quinqueradiata`, says it is also called Yellowtail or Japanese Amber Jack, and describes whole/fillet, fresh/frozen supplier offerings. The page does not show current stock or a Québec sale; its presentations are supplier-specific. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S06** | Masako Plus Sushi, Saint-Jean-sur-Richelieu, [Sushi & Sashimi](https://masakosushibar.ca/sushi-sashimi/), accessed 2026-10-16. | Current Québec menu labels a sushi item `Sériole du Japon` and gives `Hamachi` beneath it. It supports local French and borrowed Japanese menu wording, but gives no binomial and does not independently prove the menu item’s exact species. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S07** | Aikawa, Montréal, [Sushi & nigiri](https://aikawa.ca/fr/sushi-nigiri-ouest-de-lile/), accessed 2026-10-16. | Québec menu pairs `Hamachi` with `sériole` wording. It supports local menu usage only; no scientific name is supplied. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S08** | Hu et al., [Seafood species substitution and mislabeling in Canadian markets](https://oceana.ca/sites/default/files/ubc_oceana_canada_seafood_fraud_study.pdf), *Food Control* 94 (2018), Metro Vancouver sample survey. | Canadian primary-market sampling discusses both *S. quinqueradiata* and *S. dumerili* among amberjack/yellowtail-labelled samples. It demonstrates historic Canadian term overlap, not current stock, a general recipe identity, or a present retailer’s taxon-specific label. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S09** | Seafood City, Granville Island, [weekly seafood picks](https://www.seafoodcitygi.com/), accessed 2026-10-16. | Current Canadian storefront displays `Kanpachi / Greater amberjack`. It gives no binomial; this listing is not used to assign `kanpachi` to *S. dumerili* or any other taxon. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S10** | W. A. Kennedy, Fisheries Research Board of Canada, [*Some Japanese Fish Culture Practices Observed in 1972*](https://waves-vagues.dfo-mpo.gc.ca/Library/88995.pdf), Confidential Report No. 26 (April 1973), p. 2. | Says Japanese names vary by size and locality and that `hamachi` and `buri` are names used for commercial-size fish. The report’s introduction transcribes the scientific name as `Seriola guingueradiata`; it is used only for the naming caveat, not as taxonomic evidence, and is historical Japanese culture context rather than current Canadian naming. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-S11** | Seaborn Toronto, [Hamachi / Yellowtail Loin](https://www.seaborntoronto.com/product-page/hamachi), accessed 2026-10-16. | Current product page identifies the item as `Yellowtail / Hamachi (Seriola quinqueradiata)` and gives a per-pack weight range. This supports the current Toronto market name and taxon; the pack weights and raw/sashimi handling language remain SKU-specific and do not support reusable forms or measures. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-R01** | Read-only audit of Section P plan, live references/forms, legacy identities, research ledger, proposal/batch archive, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Exact ownership and source-prefix checks, phrase-first picker projection, and recipe-corpus scan. Repository evidence only; not a shared-ledger source. |
| **WP04-SECTION-P-SERIOLA-R334-20261016-R02** | [R85 Hiramasa product-boundary review](wp04-section-p-hiramasa-product-boundary-review-r85-20261013.md). | Existing *S. lalandi* boundary only. Consulted to preserve its hold; no R85 decision or candidate is changed by this proposal. |

## Final recommendation

Recommend the paired identity-only rows **Greater amberjack / sériole** (*S. dumerili*) and **Japanese amberjack / sériole du Japon** (*S. quinqueradiata*), with `hamachi` as the Japanese row’s only alias. This gives the broad `amberjack` and `sériole` queries two qualified choices while the exact species names remain one-result searches. Keep `yellowtail`, `buri`, `kanpachi`, `kingfish`, genus-level *Seriola* scope, R85’s *S. lalandi*, and all unreviewed *Seriola* taxa outside this delta. No measure or substitution was researched or inferred because there is no recipe demand and no need for numeric behavior in an identity-only proposal.
