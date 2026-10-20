# WP04 Section P R661 — Greenland shark food-market boundary review

- **Status:** Integrated hold; no active catalog or ledger data changed. The checklist, roadmap, workflow, and batch README record the disposition.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** The Section P finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6616).
- **Candidate:** Greenland shark, *Somniosus microcephalus*; the 2025 Canadian status report gives French **laimargue atlantique** as its preferred name and also lists **requin du Groenland**.
- **Recommendation:** Hold outside active ingredient references and the research ledger. The taxon and bilingual wildlife names are supported. The 2025 assessment describes Canadian catches as bycatch and says retention is prohibited; it also documents directed artisanal fisheries in Iceland and Greenland. DFO's older profile warns that fresh meat is poisonous and needs special processing. Targeted Québec market searches found no current consumer product, and the bundle has no recipe demand. A display containing `shark` would also make the bare `shark` picker query select this one candidate.
- **Scope:** One regional shark candidate. This does not reopen the R581 Bluegill or R655 White Sucker decisions, the R658 Yellowfin Sole integration, or the R48 spiny-dogfish hold.

## Evidence and bounded identity

The 2025 COSEWIC assessment identifies *Somniosus microcephalus*, gives **Greenland Shark / laimargue atlantique** as the English and preferred French names, lists Québec in its Canadian range, and designates the species **Special Concern**. It describes Canadian occurrences primarily as incidental catch in trawl, benthic longline, and gillnet fisheries and says retention is prohibited in Canada. Its technical summary also lists `laimargue de l’Atlantique`, `requin du Groenland`, and `Iqalukjuaq`; these are source-reported names, not all equally suitable for a global recipe picker. [S01–S02]

DFO’s species profile independently pairs **Greenland shark** with *S. microcephalus*, notes occurrences in the Gulf of St. Lawrence and the Saguenay, and says the species is often caught while fishers target halibut and other deep-water species. DFO warns that the meat is poisonous when fresh and requires special processing. The 2018 page also says there is no longer a directed fishery, while the newer 2025 COSEWIC report documents directed artisanal fisheries in Iceland and Greenland. I therefore do not use DFO's older fishery statement as a current global-market claim; current Canadian context comes from the 2025 report. DFO's warning supports a food-safety boundary, but this proposal does not turn it into cooking instructions, a product form, or a claim that one preparation is a safe recipe procedure. [S03–S04]

The 2025 assessment describes directed artisanal fisheries in Iceland and Greenland, but characterizes Canadian catch as bycatch and says caught animals are released alive under the cited Canadian fishery practice. It does not establish a current Québec retail product or a Québec recipe use. I searched the candidate's common and French names against Québec-facing seafood listings and targeted retailer queries for Poissonnerie La Mer, Poissonnerie Odessa, Metro, and IGA; these bounded searches returned no verifiable current Québec consumer listing. This is a limited search result, not proof that an imported product could never be sold in Québec.

The OQLF site search did not surface a GDT fiche for `laimargue atlantique` or `requin du Groenland`. The French common name used here is supported by the 2025 Canadian assessment and DFO, not described as an OQLF-normalized Québec fish-market label. A targeted CFIA Fish List lookup also did not surface a candidate-specific record through the available search interface; CFIA’s overview says that list supplies acceptable Canadian fish-labelling names. I therefore do not make a claim that the candidate lacks a legally usable label, or substitute a new French label based on translation. [S05]

## Ownership and picker audit

The post-R657/R658/R660 snapshot contains **1,836 active references**, **164 forms**, **56 legacy-import candidates**, and **2,209 research-ledger records**. Exact and normalized scans found no owner or focused prior allocation for `Greenland shark`, *Somniosus microcephalus*, `laimargue atlantique`, `laimargue de l’Atlantique`, `requin du Groenland`, the cited alternate common names, `ingredient-ref-greenland-shark`, or `candidate-greenland-shark` in those collections, the Section P proposal and batch archive, or the plan. The same scan found no source-ID owner for `WP04-SECTIONP-GREENLAND-SHARK-R661-20261018-S01` through `S05`.

The five proposed source IDs are proposal-local only. The COSEWIC English and French report URLs and DFO English and French profile URLs have **zero** exact URL owners in the current ledger. The CFIA Fish List overview URL has **32** existing owners; it is used only for its general description of the list, without creating a duplicate ledger row. Since this is a hold, no shared ledger source IDs or URL owners are proposed.

Picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases match before substring fallback, across reference names, aliases, and attached form terms. The hypothetical bilingual identity below is a projection only, not a proposed row.

| Query | Current picker | Hypothetical `Greenland shark / laimargue atlantique` row | Boundary |
|---|---|---|---|
| `shark` | No result | Greenland shark only | A broad request would appear to resolve to one shark species. This is the main picker boundary. |
| `Greenland shark` | No result | Greenland shark only | Species-qualified English phrase. |
| `laimargue atlantique` | No result | Greenland shark only | French name reported by COSEWIC/DFO; no OQLF normalization claim. |
| `requin` | No result | No result if the preferred French display is used without aliases | Do not add `requin du Groenland` as an alias; it would make generic `requin` return this candidate alone. |
| `requin du Groenland` | No result | Greenland shark only if added as an alias | Keep this alternate wording out of active search terms until broad shark scope can be preserved. |
| `Iqalukjuaq` | No result | No result unless added as an alias | Do not add Indigenous-language names from a wildlife status report without specific community and recipe context. |

## Recipe demand and exact disposition

The manifest lists **114 recipe files**. I scanned all **1,123 ingredient rows** and the full JSON text in every listed file for `Greenland shark`, *Somniosus microcephalus*, `laimargue atlantique`, `laimargue de l’Atlantique`, `requin du Groenland`, `requin dormeur`, `requin de fond`, `requin de glace`, `requin du nord`, and `Iqalukjuaq` / `Iqalujjuaq` name variants. The scan found **zero matching files and zero matching ingredient rows**. No recipe link, form, quantity, preparation instruction, measurement, conversion, yield, or substitution follows from the bundle. The DFO warning about fresh meat reinforces that no general fish-to-fish substitution or generic ready-to-cook form can be inferred.

**Exact disposition: hold *Somniosus microcephalus* outside active references, forms, legacy-import identities, and the research ledger.** Add no candidate row, source record, alias, recipe link, form, measure, density, unit mapping, conversion, yield, or substitution. The supported bilingual wildlife identity may be reconsidered if a current Québec-facing food product or bundled recipe provides a concrete ingredient use, the relevant Québec market wording is confirmed, and picker behavior can preserve broad `shark` / `requin` scope. Any handling or preparation guidance would need its own current food-safety sources.

## Source-ID ownership and sources

| ID | Source and locator | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-GREENLAND-SHARK-R661-20261018-S01** | COSEWIC, [2025 French assessment: laimargue atlantique](https://www.canada.ca/fr/environnement-changement-climatique/services/registre-public-especes-peril/evaluations-rapports-situations-cosepac/laimargue-atlantiqu-2025.html) | Pairs the taxon with preferred French `laimargue atlantique`, reports Québec occurrence, Special Concern status, and Canadian bycatch. It is a wildlife assessment, not a Québec product label or recipe source. |
| **WP04-SECTIONP-GREENLAND-SHARK-R661-20261018-S02** | COSEWIC, [2025 English assessment: Greenland Shark](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/greenland-shark-2025.html) | Pairs the taxon with `Greenland Shark`, describes Canadian bycatch and live-release practices, and lists additional English/French/common-language names. The assessment also describes artisanal fisheries outside Canada; it does not establish Québec retail availability. |
| **WP04-SECTIONP-GREENLAND-SHARK-R661-20261018-S03** | Fisheries and Oceans Canada, [Greenland shark species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenlandshark-laimargueatlantique-eng.html) | Identifies *S. microcephalus*, documents Gulf of St. Lawrence and Saguenay occurrence, says there is no longer a directed fishery, and warns that fresh meat is poisonous and requires special processing. Page last modified 2018-11-23; it is not a current retail listing or recipe-preparation guide. |
| **WP04-SECTIONP-GREENLAND-SHARK-R661-20261018-S04** | Fisheries and Oceans Canada, [Laimargue atlantique species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenlandshark-laimargueatlantique-fra.html) | French counterpart to S03; supports the French species name. It is not an OQLF market-term normalization or product listing. |
| **WP04-SECTIONP-GREENLAND-SHARK-R661-20261018-S05** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the Fish List as the source for acceptable Canadian fish-labelling names and linked scientific names. The overview URL has 32 existing ledger owners and is cited only for scope; the candidate-specific Fish List result was not retrievable in the bounded lookup. |

## Integration disposition

Accepted the recommendation to hold *Somniosus microcephalus* outside active references, forms, legacy-import identities, and the research ledger. The catalog, ledger, generated index, and bundled recipe files remain unchanged. The Section P checklist is checked with this bounded hold, and the active roadmap and workflow record the evidence and open re-entry conditions.

The post-integration data snapshot remains **1,836 references**, **164 forms**, **56 legacy-import candidates**, and **2,209 research-ledger records**. The accepted disposition adds no shared source ID or URL owner. The 2025 COSEWIC report supports the current Canadian bycatch/retention boundary while explicitly documenting artisanal fisheries in Iceland and Greenland; the older DFO statement is retained only with its date and scope caveat. No software tests, build, emulator, or deployment were run for this documentation-only hold. See the [R661 hold integration README](../batches/wp04-section-p-greenland-shark-boundary-hold-integration-r661-20261018/README.md).

## Static proposal checks

- Confirmed the candidate, proposed reference ID, and R661 source-ID prefix are not already allocated in active references/forms, legacy identities, the ledger, or prior WP04 proposal/batch files.
- Counted the live reference/form/legacy/ledger snapshot and scanned the full 114-file manifest corpus and all 1,123 ingredient rows.
- Reproduced complete-phrase then substring picker behavior with attached form terms for the current and hypothetical bilingual display.
- Reviewed the proposal links, UTF-8 text, and whitespace. This is proposal-only documentation; no software tests, build, emulator, or deployment was run.
