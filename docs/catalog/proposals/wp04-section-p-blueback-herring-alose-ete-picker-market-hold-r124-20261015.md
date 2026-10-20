# WP04 Section P — blueback herring / alose d’été picker and market review (R124)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** blueback herring, *Alosa aestivalis* (CFIA TSN 161703).
- **Distinct question:** Can this species have a separate active Québec-facing ingredient row when the candidate’s French label is also used for alewife and the Canadian fishery commonly treats both species as one gaspereau group?
- **Recommendation:** Keep *A. aestivalis* outside active references and the research ledger. CFIA and a current Québec species page establish the taxon and its name, but Canadian fishery and Québec food-market evidence does not show a distinct blueback product; it groups blueback herring with alewife. Québec sources also use `alose d’été` for both *A. aestivalis* and *A. pseudoharengus*. A lone hypothetical row would turn `alose d’été` and `blueback` into single-result picker queries. The bundled recipe corpus has no demand.
- **Shared-data effect:** none. No ingredient reference, candidate record, ledger entry, alias, form, measurement, recipe link, conversion, yield, or substitution is proposed.
- **Tests:** none; proposal-only documentation.

## Why this is a distinct unresolved question

The Section P finfish checklist remains open for regional fish in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4656). The existing [alewife / gaspareau hold](wp04-section-p-alewife-gaspareau-picker-hold-review-20261012.md) addresses *Alosa pseudoharengus* and the broader Maritime fishery use of `gaspereau`; it does not decide whether *A. aestivalis* should receive its own row or resolve the French `alose d’été` overlap. The [American-shad review](wp04-section-p-american-shad-identity-review-20261012.md) lists *A. aestivalis* only as a separate neighboring species. The [coho-salmon review](wp04-section-p-coho-salmon-identity-review-r104-20261014.md) excludes `Blueback Salmon` because CFIA assigns that name to coho, not to this herring.

No focused blueback-herring proposal, batch, active reference, form, legacy candidate, or species-specific ledger record was found. This review evaluates *A. aestivalis* itself and does not change the earlier alewife hold, the American-shad row, or the coho/sockeye name boundaries.

## Canadian and Québec names

The current CFIA Fish List assigns TSN 161703 and *Alosa aestivalis* to **Blueback Herring** and separately to **Herring / Alose d’été**. Its adjacent *A. pseudoharengus* rows use **Alewife / Faux Hareng**, **River Herring / Hareng de rivière**, and **Gasperau / Gaspareau**. The Fish List identifies Canadian fish-labelling names and taxa; it does not establish culinary interchangeability or prescribe RecipeBook picker behavior. CFIA also assigns **Blueback Salmon / Saumon Coho** to coho salmon, *Oncorhynchus kisutch* (TSN 161977). Keep that different fish name out of this candidate’s aliases. The Fish List reports a 2023-09-18 data-modification date. [S01]

OQLF’s GDT entry for **gaspareau**, last updated in 2011, prefers the Québec edible-fish term for *A. pseudoharengus* and notes commercial potential in Québec. It does not identify *A. aestivalis* as that species. No OQLF entry for blueback herring or *A. aestivalis* was located in this bounded search. [S02]

Two Québec-facing species pages use `alose d’été` across the two taxa. The current Savoirs.Québec **Alose d’été** page identifies *A. aestivalis*, reports two GBIF occurrences in Québec, and says the species has historically been confused with gaspareau. The Savoirs.Québec **Gaspareau** page identifies *A. pseudoharengus* and also calls it `alose d’été`. These pages provide local biological and naming context; they do not establish that a Québec retail fish product labelled `alose d’été` has been taxonomically verified. [S03–S04]

## Canadian and Québec market evidence and limits

DFO’s 2021 Maritimes gaspereau plan says alewife (*A. pseudoharengus*) and blueback herring (*A. aestivalis*) are collectively known as `gaspereau` and that harvesters generally do not distinguish them. The plan describes commercial harvest for local sale, export, and bait, while its landing and trade tables report the fishery under the group name. It also documents historical surplus fish sold for market. This is evidence of a Canadian food and bait fishery for the combined group, not a species-specific Blueback Herring consumer product or a current Québec retail SKU. [S05]

The 2022 DFO Gulf stock-status report likewise covers alewife and blueback herring under a gaspereau assessment. Exploramer’s 2022 Québec supplier directory lists **Gaspareau, Alewife, *A. pseudoharengus*** and reported no distributor in that directory at publication time; that dated directory does not prove current absence. The Québec **Mange ton Saint-Laurent!** food page also presents gaspareau as *A. pseudoharengus* and a regional food fish. None of these sources identifies a current Québec product as *A. aestivalis*. [S06–S08]

Focused searches of Canadian and Québec food listings for `Blueback Herring`, `alose d’été`, and *A. aestivalis* found no current species-identified consumer product. This is a bounded search result, not proof that no product has ever been sold or that no fish is eaten. The evidence supports a distinct biological taxon and a combined regional fishery, but not a distinct blueback ingredient identity in the current consumer picker.

## Ownership and picker projection

The live snapshot contains **1,470 ingredient references, 105 forms, 63 legacy candidates, 1,811 research-ledger records, and 114 manifest-listed recipe files**. Exact normalized-key checks found no active owner for `Blueback herring`, `alose d’été`, *A. aestivalis*, `ingredient-ref-blueback-herring`, or `candidate-blueback-herring` in references, forms, legacy candidates, or ledger record IDs. The existing Atlantic- and Pacific-herring rows are separate taxa. The existing American-shad row is `American shad / alose savoureuse`; it does not own the candidate’s full French name. The alewife is held outside active references and the ledger, so it is not a current picker result. The source-ID prefix below was unused in the proposal archive, batch archive, and ledger before drafting.

The projection follows the current phrase-first normalized matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete word phrases in bilingual names, aliases, and attached forms are checked first, then matching falls back to substrings. I compared the live references and forms with one hypothetical alias-free row, **Blueback herring / alose d’été**. This is a static source-code projection, not a UI or emulator test.

| Query | Current active results | With a hypothetical row | Picker implication |
|---|---|---|---|
| `Blueback herring` | None | Blueback herring only | Species-qualified English query. |
| `alose d’été` | None | Blueback herring only | A single result would imply a species-specific Québec name even though the Québec gaspareau page applies this phrase to *A. pseudoharengus* too. |
| `blueback` | None | Blueback herring only | A single result would hide CFIA’s separate `Blueback Salmon` name for coho. That phrase is not an alias in the active coho row, but the source name makes the fragment ambiguous. |
| `herring` | Atlantic herring; Pacific herring | Atlantic herring; Pacific herring; Blueback herring | The English genus/common-word query remains plural. |
| `hareng` | Atlantic herring; Pacific herring | Unchanged | The hypothetical French display does not contain this token. |
| `alose` | American shad | American shad; Blueback herring | The broader French fragment remains plural, but it still omits the unallocated alewife. |
| `gaspareau` / `gaspereau` | None | None, with no aliases | Do not assign a collective fishery name to a single taxon. |
| `river herring` / `hareng de rivière` | None | None, with no aliases | CFIA associates these names with alewife; no blueback alias is proposed. |
| `Blueback salmon` | None | None, with no aliases | Keep coho’s separate CFIA name out of the blueback-herring row. |

The hypothetical display itself makes `alose d’été` and the shorter `blueback` queries look species-specific. The first term has conflicting Québec species scope; the second overlaps another CFIA fish name. Empty aliases alone cannot prevent either effect because both words occur in the display. Do not create a separate active row until the picker can expose the documented shared scopes or a current species-identified food request establishes a useful qualified choice.

## Bundled recipe demand and data boundaries

All **114** manifest-listed recipe JSON files and **1,123** ingredient rows were scanned for `Blueback herring`, `blueback`, `alose d’été`, *Alosa aestivalis*, `gaspareau`, `gaspereau`, `river herring`, and `hareng de rivière`. The scan found **zero matching recipe files and zero matching ingredient rows**. It also found no broader `herring`, `hareng`, or `alose` ingredient-row request. No recipe link, relink, amount, preparation state, or recipe-scoped substitution is supported.

The fishery reports and biological size notes do not provide recipe portions, density, volume-to-mass mappings, count weights, edible yield, or cooking yield. The local food evidence belongs to gaspareau as a group or to *A. pseudoharengus*, not a Blueback Herring SKU. Add no form, fresh/smoked/canned product state, density, unit mapping, measure, conversion, yield, or package observation.

No reviewed recipe or source establishes a directed, dish-, role-, and method-scoped substitute involving blueback herring. Do not substitute it for alewife, Atlantic or Pacific herring, American shad, or another fish based on the shared fishery group or biological family. Add no global or contextual substitution rule.

## Recommendation

Keep *Alosa aestivalis* outside active references and the research ledger. A future conditional row would be `Blueback herring / alose d’été` in `PROTEIN`, with empty alias arrays, null default density, and empty unit mappings, but it is not proposed for activation now. Do not add `blueback`, `Blueback Salmon`, `gaspareau`, `gaspereau`, `river herring`, `hareng de rivière`, `alose`, or the binomial as aliases. Do not create a candidate record or infer a form, measure, recipe link, conversion, yield, or substitute.

Reconsider only if a current Canadian/Québec food package or bundled recipe identifies *A. aestivalis* and the picker can preserve the documented scopes of `alose d’été`, `blueback`, and the gaspereau fishery group. Section P remains open.

## Source register

Sources were accessed or rechecked on 2026-10-15. Proposal-local source IDs are not shared-ledger records. Each source is limited to the evidence described.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S01** | Canadian Food Inspection Agency, [Fish List results for blueback herring](https://active.inspection.canada.ca/scripts/fssa/fispoi/fpresults.asp?cmbIn=e&q=blueback) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists TSN 161703, *A. aestivalis*, as `Blueback Herring` and `Herring / Alose d’été`; lists TSN 161706, *A. pseudoharengus*, with Alewife, River Herring, and Gasperau/Gaspareau names; assigns `Blueback Salmon / Saumon Coho` to *O. kisutch*. The Fish List is Canadian fish-labelling name/taxon evidence, not a consumer-product survey or culinary-equivalence standard; it reports a 2023-09-18 modification date. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S02** | Office québécois de la langue française, [GDT: gaspareau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198866/gaspareau) | Last updated 2011; places `gaspareau` in zoology/ichthyology and edible-fish domains, identifies *A. pseudoharengus*, and notes commercial potential in Québec. It does not identify *A. aestivalis* or a current SKU. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S03** | Savoirs.Québec, [Alose d’été](https://savoirs.quebec/vivant/alose-d-ete), published 2026-09-05 and updated 2026-09-14 | Identifies `alose d’été` as *A. aestivalis*, reports two GBIF observations in Québec, and notes historical confusion with gaspareau. Species and occurrence page, not retail or fish-product labeling evidence. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S04** | Savoirs.Québec, [Gaspareau](https://savoirs.quebec/vivant/gaspareau) | Identifies gaspareau as *A. pseudoharengus*, also uses `alose d’été`, and says the species is referenced by Fourchette bleue and Mange ton Saint-Laurent as a Saint-Lawrence product. This is the Québec naming overlap; it does not claim that a product is *A. aestivalis*. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S05** | Fisheries and Oceans Canada, [2021 Gaspereau Integrated Fishery Management Plan, Maritimes Region](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/gaspereau-gaspareau/index-eng.html) | Defines gaspereau as both *A. pseudoharengus* and *A. aestivalis*, says harvesters generally do not distinguish them, and describes local sale, export, and bait uses. The landings/market category is collective and regional; historical plan data does not identify a current Québec retail species or recipe product. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S06** | Fisheries and Oceans Canada, [Stock status of alewife and blueback herring (Gaspereau) in the DFO Gulf region](https://publications.gc.ca/collections/collection_2022/mpo-dfo/fs70-6/Fs70-6-2022-014-eng.pdf), 2022 | DFO stock-status report covers both taxa as a gaspereau assessment. Fishery/stock evidence only; it does not establish a species-specific retail listing, culinary use, or household amount. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S07** | Exploramer, [Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf), p. 7 | Lists `Gaspareau, Alewife, Alosa pseudoharengus` and “Aucun distributeur” in that directory. This is a dated supplier snapshot for alewife, not a current market census or Blueback Herring listing. |
| **WP04-SECTIONP-BLUEBACK-HERRING-R124-20261015-S08** | Mange ton Saint-Laurent!, [Gaspareau](https://mangetonsaintlaurent.com/especes/gaspareau/) | Food-species page identifies *A. pseudoharengus* and describes gaspareau harvesting and food characteristics; last modified 2023-05-23. It supports Québec food use for the named alewife species, not a Blueback Herring product. |

## Static review record

- Read `AGENTS.md`, the open Section P plan item, the recent R121–R123 WP04 proposals and batch READMEs, the alewife/gaspareau hold, the American-shad decision, the coho name boundary, current reference/form/legacy JSON, the ledger, manifest-listed recipes, and matcher source.
- Audited 1,470 references, 105 forms, 63 legacy candidates, and 1,811 ledger records. No exact owner or focused blueback-herring review was found; earlier mentions are adjacent taxon boundaries only.
- Projected the current matcher with a hypothetical alias-free `Blueback herring / alose d’été` row, including broad `blueback`, `alose`, `herring`, and `gaspareau` queries.
- Parsed all 114 manifest recipes and 1,123 ingredient rows. Candidate and neighboring fish-name scans returned zero file or ingredient-row matches.
- Checked the R124 proposal-local source-ID prefix against current proposals, batches, and ledger source IDs; no collision was found. Local links, UTF-8/no-BOM encoding, LF line endings, final newline, and whitespace were checked after writing.
- This is one proposal-only file. No shared catalog, ledger, plan, roadmap, generated index, recipe, code, or batch file was changed. No app, Gradle, instrumentation, or emulator tests were run.

## Integration disposition

Integrated as a documentation-only hold. No Blueback Herring reference, candidate, or research-ledger record was added. Keep *A. aestivalis* available for reconsideration if a species-identified recipe/product and a picker representation for its shared French and fishery names become available. No tests were needed. See the [integration record](../batches/wp04-section-p-blueback-herring-alose-ete-picker-hold-integration-r124-20261015/README.md).
