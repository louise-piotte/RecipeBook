# WP04 Section P — Catla / carpe French-name boundary review (R622)

- **Status:** Accepted and integrated as a documentation-only terminology hold. See the [R622 integration README](../batches/wp04-section-p-catla-carpe-fr-name-boundary-hold-integration-r622-20261018/README.md). No catalog, ledger, recipe, or package data changed.
- **Review and access date:** 2026-10-18.
- **Open checklist anchor:** The broad finfish and regional-fish item remains open in [Section P](../../RecipeBook-global-ingredient-catalog-plan.txt#L6477). R594 integrated the separate Rohu identity and named Catla and Mrigal as neighboring fish; it did not allocate either one. The roadmap still says Section P remains open.
- **Candidate:** Catla, listed by CFIA as *Gibelion catla* (TSN 690299), and marketed in Montréal under the paired wording `CATLA I CARPE`.
- **Recommendation:** **Hold the Catla identity outside active references, aliases, legacy identities, and the shared research ledger.** The Canadian Fish List pairs the fish with English `Catla` and French `Carpe`, but OQLF assigns standardized Québec fish-market `carpe` to *Cyprinus carpio*. The Montréal storefront also applies `CARPE` to separately named Catla, Rohu, and Mrigal products. In the current picker, a row using the official French name would make the unqualified `carpe` query return Catla alone.
- **Scope boundary:** This is a narrow fr-CA picker and terminology hold. It does not dispute that Catla is a food fish or assign `Catla` and `Rohu` to one identity. It does not decide the taxonomic name to use outside CFIA’s Canadian fish-label context, and it does not assign the OQLF `carpe` term to Catla.
- **Exact proposed data delta:** **None.** Do not reserve `ingredient-ref-catla` or create a ledger candidate/source allocation. Keep the broader carp item and the existing Rohu identity unchanged.

## Evidence and reason for the hold

CFIA’s Fish List lookup output associates TSN 690299 and *Gibelion catla* with English `Catla`, French `Carpe`, and family Cyprinidae. CFIA explains that its Fish List provides the English and French common names used for fish labelling in Canada and connects them to scientific names and taxonomic serial numbers. That is strong Canadian identity and label evidence, but the French name does not transfer cleanly to RecipeBook’s Québec search vocabulary. [S01; reused `WP04-FINFISH-GAPS-20261010-S11`]

OQLF’s food-domain entry defines `carpe` as a commercial fish species in Québec and associates it with *Cyprinus carpio*. It explains that the Québec fish-product terminology committee normalized a single species-specific term to avoid consumer-label confusion. The entry does not identify Catla. Therefore, using the CFIA French label as the display name or alias would expose a Catla-only result under a word OQLF identifies with another species. [S02]

Bismillah Bazaar’s Montréal fish listings use `CATLA I CARPE`, `ROHU I CARPE`, and `MRIGAL I CARPE` in distinct product titles. This is direct local-market evidence that the seller uses the word for more than one named fish; it is not evidence that the three fish are taxonomic synonyms or interchangeable. The page lists a Catla product in a 3.3–3.5 kg range, but gives no recipe quantity or reusable portion standard. Do not turn that product range into a measure, yield, or form. [S03]

The Bangladesh Department of Fisheries’ 2023–24 yearbook lists Catla among the leading pond-aquaculture fish. This supports regional food-fish context, not a Canadian package specification or a product origin claim. The same yearbook is already owned in the ledger by R594’s source `WP04-SECTIONP-ROHU-R594-20261017-S01`; reuse that record if this evidence is needed in a later integration. [reused `WP04-SECTIONP-ROHU-R594-20261017-S01`]

A future identity review can reconsider Catla if a species-qualified Québec French label is established, or if picker behavior can preserve the competing scopes of `carpe`. A display such as `catla` in French would avoid the immediate query collision, but the current evidence does not establish it as the appropriate Québec French product name; this proposal does not promote that workaround.

## Ownership, picker projection, and neighboring identities

The active seed has **1,824 ingredient references** and **156 forms**. The legacy import file has **56 identities**; the research ledger has **2,196 records**. Exact normalized checks found no current reference, form, legacy-identity, or ledger owner for `ingredient-ref-catla`, `candidate-catla`, `Catla`, `Katla`, `Carpe Catla`, `Gibelion catla`, or `Catla catla`. No earlier Catla-specific proposal, hold, or batch allocation was found. R594 mentions Catla only as a neighboring fish and explicitly keeps it distinct from Rohu, Mrigal, and common carp. The broader [finfish gap review](wp04-finfish-gaps-20261010.md) already notes a conflict between CFIA’s `Carpe` assignments and OQLF’s Québec fish-market use; this R622 review applies that conflict to the unallocated Catla identity using current local product wording.

The picker normalizes accents and punctuation, prefers complete word phrases, then falls back to substring matching. The projection below models only a hypothetical row with the source-backed display terms English `Catla` and French `Carpe`, with no aliases or forms. It is not an active row or a proposed JSON change.

| Query | Current result | Hypothetical row | Consequence |
|---|---|---|---|
| `catla` | No result | Catla | Would make the exact English fish name searchable. |
| `carpe` | No result | Catla only | Would assign the OQLF common-carp term to Catla as a singleton. |
| `carp` | `mascarpone` (substring fallback) | `mascarpone` and Catla | The French display `carpe` also adds a false English-substring hit; it does not create a species-safe English carp choice. |
| `rohu` | Rohu | Rohu | Unchanged; the existing `ingredient-ref-rohu` remains separate. |
| `mrigal` | No result | No result | No neighboring fish identity is added. |
| `Gibelion catla` | No result | No result | Scientific names are not added as picker aliases. |

The source-backed `Carpe` display is the blocking term. A bare `Catla` French display might avoid this search collision, but no Québec terminology source reviewed here confirms that as the catalog’s bilingual French name. Adding `carp`, `carpe catla`, `Indian carp`, or `Katla` as aliases would either repeat the broad-name problem or exceed the reviewed labels. This hold does not reopen the separate generic/common-carp or frozen grass-carp-fillets holds recorded in Section P; those decisions remain unchanged.

## Recipe demand, forms, measures, and substitutions

The complete manifest-listed bundle was scanned: **114 recipe files**, **1,123 structured ingredient rows**, and **753,988 recipe-file bytes**. Whole-word searches covered `Catla`, `Katla`, `Gibelion catla`, `Catla catla`, `Indian carp`, `Carpe Catla`, and case/spacing variants. There were **zero matching recipe files and zero matching ingredient rows**. The existing Rohu recipe-corpus results are unchanged and do not establish Catla demand.

No bundled recipe selects Catla, specifies its cut or preparation, or supplies a recipe-line amount. The Québec seller’s 3.3–3.5 kg whole-fish product range is SKU-level evidence only. Add no form, recipe link, measurement observation, density, unit mapping, package yield, conversion, or global or contextual substitution. Neither the food-fish production source nor the retailer listing supports a household measure, an edible yield, or a tested replacement relationship with Rohu, Mrigal, common carp, or another fish.

## Source register and audit notes

The source IDs prefixed `WP04-SECTIONP-CATLA-CARPE-R622-20261018-` are **proposal-local only** and have not been allocated in the shared ledger. Existing shared sources are identified for reuse; this hold adds no ledger source entries.

| Source ID | Source and evidence | Limit and ownership |
|---|---|---|
| **WP04-SECTIONP-CATLA-CARPE-R622-20261018-S01** | CFIA, [Fish List lookup for Catla](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&lang=e&q=Catla), row returned for TSN 690299. | Lookup output pairs *Gibelion catla* with `Catla / Carpe`. It establishes Canadian fish-label naming, not consumer search behavior or culinary equivalence. The exact Catla-query URL was not already allocated in the ledger. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Defines the Fish List’s Canadian labelling role and its scientific-name/TSN scope. This source ID and URL are already in the ledger; do not duplicate them. |
| **WP04-SECTIONP-CATLA-CARPE-R622-20261018-S02** | Office québécois de la langue française, [GDT: carpe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198858/carpe), last updated 2011. | Associates the Québec fish-market term `carpe` with *Cyprinus carpio* and records it as an OQLF-normalized commercial-fish name. The URL had no exact source owner in the shared ledger. |
| **WP04-SECTIONP-CATLA-CARPE-R622-20261018-S03** | Bismillah Bazaar, [Montréal fish listings](https://www.newbismillahbazar.com/cat-products.php?cat-name=Fish&mec_catid=15), address shown as 6495 Avenue Victoria, Montréal, Québec. | Searchable listing titles use `CATLA I CARPE`, `ROHU I CARPE`, and `MRIGAL I CARPE`; the Catla listing shows a 3.3–3.5 kg product range. Vendor naming and SKU range only; no taxon or reusable measure. No exact URL owner was found in the shared ledger. |
| **Reused `WP04-SECTIONP-ROHU-R594-20261017-S01`** | Bangladesh Department of Fisheries, [Yearbook of Fisheries Statistics of Bangladesh 2023–24](https://fisheries.gov.bd/sites/default/files/files/fisheries.portal.gov.bd/publications/21964f20_05cc_4cf7_968b_9a351aa055f3/2025-06-15-10-40-24afb31473c54701bb5e3a4de91f8d41.pdf). | Lists Catla among major pond-aquaculture fish for the 2023–24 reporting year. Existing ledger record is attached to Rohu; reuse its source ID for the same document and do not create a duplicate URL record. It is regional production context, not Canadian product evidence. |
| **Reused `WP04-SECTIONP-NILETILAPIA-20261012-S06`** | CFIA, [Species susceptible to epizootic ulcerative syndrome](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species/epizootic-ulcerative-syndrome), row for *Gibelion catla*. | Confirms CFIA’s spelling and common name for the taxon; this disease reference is used only as a taxonomic cross-check, not as food, label, or import guidance. Existing source URL/source ID is owned in the ledger; do not duplicate it. |
| **WP04-SECTIONP-CATLA-CARPE-R622-20261018-R01** | Read-only audit of the Section P plan and roadmap, active references/forms, legacy identities, ledger, proposal/batch archive, picker code, package-yield and substitution files, and all manifest-listed recipes. | Repository snapshot only. No shared catalog, ledger, plan, roadmap, manifest, or generated-index file was modified. |

R01 verified exact candidate/name/identifier ownership and the hypothetical picker projection; reviewed the current Section P open finfish item and the adjacent R594 work; searched current proposal and batch archives; and scanned each manifest-listed recipe file and structured ingredient row. The exact OQLF and Montréal retailer URLs had no ledger owners. The official Fish List overview, the EUS page, and the Bangladesh yearbook are already recorded and must be reused if later cited. No active record, source ID, or candidate ID is allocated by this proposal.

Static proposal checks: valid UTF-8 without BOM; no mojibake markers; final newline present; no trailing whitespace; local links resolve; source-ID prefix unique in the workspace. No software tests, build, emulator run, or deployment were run or needed for this proposal-only hold under `AGENTS.md`.
