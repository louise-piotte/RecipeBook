# WP04 Section P — Butterfish / stromatée à fossettes picker-boundary review (R88)

- **Review date:** 2026-10-13.
- **Checklist item:** the open Section P parent in [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt): “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.”
- **Candidate:** *Peprilus triacanthus*, called butterfish in Canadian and U.S. sources and `stromatée à fossettes` in Québec and federal French-language records.
- **Recommendation:** **Hold** this candidate outside active references, forms, and the research ledger. CFIA currently assigns the accepted Canadian label `Butterfish / Stromaté` to five *Peprilus* taxa. The federal foreign-vessel regulation separately maps `Butterfish / Stromatée à fossettes` to *P. triacanthus* for that regulation’s scope, but this does not resolve the broader fish-labelling list or local menu wording. A single active species row would make the picker present a shared term as species-specific. The bundled recipes do not request this fish.
- **Proposed JSON delta:** none. Add no reference, alias, form, recipe link, ledger candidate, measure, conversion, yield, or substitution.
- **Worktree scope:** this proposal file only. No shared catalog, ledger, plan, roadmap, batch README, generated file, or app code was changed.

## Candidate and archive boundary

The parent checklist remains open for regional fish. I found no dedicated prior review or allocation for *P. triacanthus* or a `butterfish` identity. Two earlier references to the word are narrower: the [sablefish review](wp04-section-p-sablefish-identity-boundary-review-20261011.md) declines `butterfish` as a sablefish alias, and the [R64 escolar review](wp04-section-p-escolar-oilfish-identity-boundary-review-20261013-round64.md) includes `butterfish` in a list of terms that must not be attached to one escolar taxon. Neither assigns the name to *P. triacanthus*. This review does not reopen either decision.

At the current snapshot, normalized phrase checks across active reference names and aliases, attached-form labels and match terms, legacy-import candidates, and research-ledger record/source/decision text found no owner for `butterfish`, `American butterfish`, `Atlantic butterfish`, `stromaté`, `stromatée à fossettes`, `Peprilus triacanthus`, or the proposed ID `ingredient-ref-butterfish`. No form or legacy candidate is allocated to this fish. The exact source-ID prefix `WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-` was not present in the ledger or proposal/batch archive before this file was written.

The live package contained **1,419 ingredient references, 104 forms, 63 legacy candidates, 1,758 research-ledger records, and 8 unit-conversion records**. The manifest lists **114 recipe files with 1,123 ingredient rows**. These are review-time counts from the shared worktree; the worktree is changing concurrently, so recheck before any later integration.

## Identity, names, and Québec scope

The candidate taxon is *Peprilus triacanthus* (CFIA TSN 172567). CFIA’s current Fish List query for `Butterfish` returns five *Peprilus* species under the accepted English/French pair `Butterfish / Stromaté`: *P. burti*, *P. medius*, *P. paru*, *P. simillimus*, and *P. triacanthus*. The same query also gives *P. medius* the more qualified pair `Pacific Butterfish / Stromaté du Pacifique`, and *P. paru* `American Harvestfish / Stromaté Lune`. CFIA describes the Fish List as common names acceptable in Canada for fish labelling, paired to scientific names. [S01–S02]

There is a narrow, apparently species-scoped French name in another federal source. Schedule VIII of the *Foreign Vessel Fishing Regulations*, current to 2025-03-17, pairs `Butterfish / Stromatée à fossettes` with *P. triacanthus*. The schedule’s name-to-taxon mapping is explicitly for that regulation. It does not replace the current CFIA Fish List’s broader set of accepted fish-label names, so it is not enough to make unqualified `butterfish` a safe one-row picker name. [S03]

A Québec BAPE environmental report dated 2017 lists `Stromatée à fossettes — Peprilus triacanthus` among fish recorded or expected in the Saint-Lawrence study area; the table’s cited occurrence data are from the Québec natural heritage data centre in 2016. This supports Québec French naming and local ecological occurrence, not food-market availability. Targeted OQLF GDT searches for `butterfish`, `Peprilus triacanthus`, and `stromatée à fossettes` did not surface a dedicated preferred-term entry. I therefore do not describe `stromatée à fossettes` as an OQLF-preferred culinary or fish-product label. [S04]

The local market evidence is mixed and limited. A Québec City Shogun Sushi menu on a third-party ordering page lists `Poisson-beurre / Butterfish Sushi` without a scientific name, species declaration, or product specification. This establishes local use of the phrase for a prepared menu item, not that the item contains *P. triacanthus*. A 2012 DFO ecological report describes butterfish as a seasonal, sparse Gulf of St. Lawrence visitor and reported no commercial fishery for butterfish in Canadian Atlantic waters at that time, with incidental catch used for fishmeal and pet food. Those are historical regional findings and do not establish present-day Canadian or Québec availability or absence. NOAA’s current profile confirms a U.S. commercial fishery and identifies `American butterfish` and `Atlantic butterfish` as alternate names for *P. triacanthus*; those U.S. names are not the matching CFIA common-name rows, and U.S. landings do not demonstrate Canadian retail supply. [S05–S07]

## Ownership and picker projection

The projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are preferred; substring matching is the fallback. I simulated the current names, aliases, and attached-form terms, then a hypothetical one-row display `American butterfish / stromatée à fossettes` with no aliases. It is a static projection of the current implementation, not an emulator or UI test.

| Query | Current picker | With hypothetical one-row display | Why this matters |
|---|---|---|---|
| `butterfish` | No result | One result | CFIA assigns this English common name to five *Peprilus* species, so one active row would imply a unique species the label does not identify. |
| `American butterfish` | No result | One result | This is a species-specific U.S. term, but the Canadian Fish List uses the broader `Butterfish` name for multiple taxa. |
| `stromatée à fossettes` | No result | One result | The qualified French term identifies *P. triacanthus* in the regulation and Québec ecological record. |
| `stromaté` | No result | One result by substring fallback | CFIA uses `Stromaté` for all five *Peprilus* taxa. |
| `Peprilus triacanthus` | No result | No result | Scientific names are evidence for this audit and are not proposed as ingredient aliases. |
| `poisson-beurre` | No result | No result | The Québec menu phrase is product-specific and is not proposed as an alias for the candidate taxon. |

The hold preserves the current empty results for broad `butterfish` and `stromaté` queries rather than showing a single one of several possible taxa. It also avoids adding `American butterfish`, `Atlantic butterfish`, `harvestfish`, `sheepshead`, `dollarfish`, `shiner`, or `skipjack` as aliases: these are not all CFIA names for the same single taxon, and some have unrelated or cross-taxon uses.

## Bundled recipe demand and field limits

I scanned full JSON text and every ingredient row in all 114 manifest-listed recipe files. Whole-phrase searches for `butterfish`, `American butterfish`, `Atlantic butterfish`, `stromaté`, `stromatée à fossettes`, `Peprilus triacanthus`, and `poisson-beurre` found **0 recipe files and 0 ingredient rows**. No recipe link or recipe-specific amount is supported.

| Dimension | Evidence and boundary |
|---|---|
| **Identity** | Canadian and Québec sources support the taxon and source-specific bilingual names, but the accepted Canadian English/French labels also cover other *Peprilus* species. Keep the candidate unallocated. |
| **Forms** | No bundled recipe identifies fresh, frozen, whole, fillet, canned, dried, or prepared *P. triacanthus*. The Québec sushi menu does not identify its fish taxon or define a reusable form. Add no form. |
| **Measurements** | DFO’s 2012 report gives an average adult length of 15–23 cm; NOAA gives a usual 6–9 inch length, up to 12 inches, and a maximum weight of 1.25 lb. These are biological dimensions, not edible portion, recipe serving, or count-to-weight evidence. NOAA’s 2024 U.S. commercial landing estimate (about 4 million lb) is a fishery total, not a household measure. [S05–S06] |
| **Conversions** | No source supports a density, cup-to-mass mapping, count conversion, or raw-to-cooked conversion for this candidate. Add none. |
| **Yield** | No source establishes a transferable edible yield, fillet yield, package yield, or preparation loss for a home recipe. Add none. |
| **Substitution** | No bundled recipe or reviewed source establishes a global or dish-scoped substitute for *P. triacanthus*. Do not infer substitution from its size, market position, or general use as fish. |

## Decision and revisit condition

Keep *Peprilus triacanthus* outside the active catalog and ledger. The exact JSON delta is **none**. Revisit if a future recipe requires this taxon or a current Canadian/Québec package supplies an identifying name that can be represented without making the shared CFIA terms appear species-exclusive. A later review should distinguish a species identity from a market product, then assess forms, recipe measurements, conversions, yield, and substitutions independently.

No tests, Gradle tasks, emulator, or deployment were run. This was proposal-only research, with static data and text checks only.

## Sources

Sources were accessed or checked on 2026-10-13. These IDs are local to this proposal and were not added to the research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S01** | CFIA, [Fish List query for Butterfish](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Butterfish) | Live result rows for five *Peprilus* taxa and their accepted English/French common names; Fish List modification date shown as 2023-09-18. Naming evidence for Canadian fish labels, not a recipe or market-availability survey. |
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the list supplies English/French names acceptable for Canadian fish labelling and links them to scientific names/TSNs. It is not a culinary equivalence source. |
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S03** | Government of Canada, [Foreign Vessel Fishing Regulations, Schedule VIII](https://laws-lois.justice.gc.ca/fra/reglements/C.R.C.%2C_ch._815/page-10.html?wbdisable=true) | In the schedule’s foreign-vessel regulatory scope, maps English `Butterfish` and French `Stromatée à fossettes` to *P. triacanthus*. Current to 2025-03-17; this does not establish the CFIA fish-labelling scope or current retail inventory. |
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S04** | Québec Bureau d’audiences publiques sur l’environnement, [PR3.3 impact-study summary](https://voute.bape.gouv.qc.ca/dl/?id=00000322740), Table 3, pp. 22–23 | Lists `Stromatée à fossettes` and *P. triacanthus* in a Québec Saint-Lawrence study-area fish table. The table points to 2016 Québec natural-heritage data; ecological occurrence, not a food-product listing. |
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S05** | Fisheries and Oceans Canada, [Butterfish ecology in the southern Gulf of St. Lawrence](https://waves-vagues.dfo-mpo.gc.ca/Library/347263.pdf), report RES2012/087, pp. 21–22 | Identifies butterfish as *P. triacanthus*, describes sparse seasonal Gulf presence, biological length, and reports no Canadian Atlantic commercial fishery at the time of publication. This historical statement does not establish current availability. |
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S06** | NOAA Fisheries, [Butterfish species profile](https://www.fisheries.noaa.gov/species/butterfish), updated 2026-10-05 | Identifies *P. triacanthus*, lists U.S. alternate names including `American butterfish` and `Atlantic butterfish`, reports 2024 U.S. landings, fishery scope, and biological size/weight. U.S. names and landings are not Canadian label or Québec product evidence. |
| **WP04-SECTIONP-BUTTERFISH-BOUNDARY-R88-20261013-S07** | Shogun Sushi, [Québec City French-language ordering page](https://order.online/fr-CA/store/shogun-sushi-qu%C3%A9bec-26024937), `Poisson-beurre / Butterfish Sushi` | Current Québec-facing menu wording for a prepared item. The third-party listing gives no species, binomial, package label, or supplier; it does not identify *P. triacanthus*. |

## Static review record

- The saved file decodes as UTF-8 without a BOM, ends with LF, contains no CRLF or trailing whitespace, and has no checked mojibake markers.
- All four local Markdown links resolve. The seven source IDs are unique in this proposal; the R88 prefix has no collision in the shared ledger or prior proposal/batch archive.
- Exact candidate ownership checks found no matching entry in active references, forms, legacy candidates, or ledger records. Picker projection and the 114-file / 1,123-row phrase scan returned the results above.
- This proposal contains no JSON snippet, so a JSON parse/schema check is not applicable. No app tests, Gradle tasks, emulator, or deployment were run.
