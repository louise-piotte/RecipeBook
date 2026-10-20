# WP04 Section P — rock crab species and picker-boundary review (R77)

- **Review and source-access date:** 2026-10-13.
- **Status:** Proposal only. No catalog, ledger, checklist, roadmap, batch, generated file, recipe, or application code was edited.
- **Open checklist line:** [Shrimp/prawn by meaningful preparation; crab and crayfish](../../RecipeBook-global-ingredient-catalog-plan.txt#L4375).
- **Candidate:** Rock crab / crabe commun, *Cancer irroratus*.
- **Recommendation:** Hold the species-specific active row. The qualified binomial is clear, but its Québec market name `crabe commun` is also used for Jonah crab, and CFIA assigns `Rock Crab / Crabe Commun` to several taxa. The current phrase-first picker would make each overlapping common phrase a singleton result for *C. irroratus*.
- **Source IDs:** `WP04-P-ROCK-CRAB-20261013-R77-S01` through `S05`, local to this proposal.

## Candidate and prior-review boundary

This review covers only rock crab, *Cancer irroratus*, as a Québec seafood identity and product boundary. The candidate has good local grounding: Québec's MAPAQ crustacean guide pairs *Cancer irroratus* with English `Rock crab`, and a seller in the Îles-de-la-Madeleine identifies a locally caught `crabe commun` product as *C. irroratus* [S03, S04]. The naming problem is equally concrete. OQLF uses `crabe commun` for *C. irroratus* but notes that *C. irroratus* and Jonah crab (*Cancer borealis*) are often marketed indistinguishably under that name [S01]. CFIA also lists `Rock Crab / Crabe Commun` for *C. irroratus*, *Cancer productus*, and *Metacarcinus edwardsii*, and `Rock Crab` for *Cancer pagurus* [S02].

The older [generic-crab review](wp04-section-p-generic-crab-identity-boundary-review-20261012.md) already cited the same Madeleine Islands picked-leg product as evidence that a local, species-named product exists. It held only a second generic `crab / crabe` row and did not allocate *C. irroratus* or project its species-name searches. The [Jonah-crab review](wp04-section-p-jonah-crab-identity-boundary-review-20261013-r28.md) subsequently added `Jonah crab / crabe nordique` without aliases and explicitly left `crabe commun` unassigned. This review follows that still-open rock-crab species question; it does not repeat either completed decision.

Other current crab boundaries remain separate: generic `crab meat / chair de crabe` with its Jumbo Lump form, Dungeness crab, blue crab, Jonah crab, and crab-flavoured pollock flakes. Earlier holds for snow crab, golden king crab, European green crab, generic crab, and crayfish remain unchanged. Shrimp work is out of scope.

## Québec naming and species boundary

OQLF standardizes `crabe commun` and maps it to *Cancer irroratus*, but its note warns that this name is also commonly used in commerce for *Cancer borealis* [S01]. MAPAQ uses the same French name and pairs *C. irroratus* with `Rock crab` in its Québec crustacean guide [S03]. The local seller's page independently uses `crabe commun`, identifies *C. irroratus*, and describes a locally caught product from the Îles-de-la-Madeleine [S04]. These sources establish a real Québec product and a source-backed French term; they do not establish a differentiating consumer name for this species.

The Canadian Fish List creates a second picker collision. In addition to *C. irroratus*, CFIA maps `Rock Crab / Crabe Commun` to *C. productus* and *M. edwardsii*, and `Rock Crab` to *C. pagurus* [S02]. Those taxa do not all describe the Québec fishery, but the shared catalog and search are not region-scoped. Do not invent `crabe commun atlantique`, `crabe de roche`, `crabe rocheux`, or a Latin-name alias to force a result: none is needed as a supported Québec consumer name in the reviewed sources.

## Current ownership and archive audit

The live snapshot contains 1,401 active references, 104 forms, 63 legacy-import candidates, 1,739 research-ledger records, and 8 ledger unit conversions. The manifest lists 114 recipe files with 1,123 ingredient rows.

| Current owner or boundary | Live data | Treatment here |
|---|---|---|
| `ingredient-ref-crab` (`PROTEIN`) | `crab meat / chair de crabe`; no aliases, density, or unit mappings. | Keep the generic edible product distinct from whole/species-named crab. |
| `ingredient-form-crab-jumbo-lump` | `jumbo lump crab meat / chair de crabe en gros morceaux (jumbo lump)`, attached to `ingredient-ref-crab`; no density. | Keep recipe 019's named commercial grade attached to generic crab meat. |
| `ingredient-ref-jonah-crab` (`PROTEIN`) | `Jonah crab / crabe nordique`; no aliases, density, or unit mappings. | Keep this distinct species identity; do not add ambiguous `crabe commun` as a synonym. |
| `ingredient-ref-blue-crab` (`PROTEIN`) | `blue crab / crabe bleu`; no aliases, density, or unit mappings. | Keep the qualified species display. |
| `ingredient-ref-dungeness-crab` (`PROTEIN`) | `Dungeness crab / crabe dormeur`; French aliases `crabe Dungeness`, `crabe de Dungeness`; no English aliases, density, or unit mappings. | Keep the qualified species display and existing aliases. |
| `ingredient-ref-crab-flavoured-pollock-flakes` (`PROTEIN`) | `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe`; French alias `flocons de goberge à saveur de crabe`, English alias `flake style crab flavoured pollock`; no density or unit mappings. | Keep it separate from crab species and actual crab meat. |
| Prospective `ingredient-ref-rock-crab` / *C. irroratus* | No active reference, form, legacy candidate, or species-specific ledger record. The exact R77 source-ID prefix is absent from the current ledger and proposal/batch archive. | Hold; no identifier or ledger record is allocated. |

The only active form containing crab wording is `ingredient-form-crab-jumbo-lump`; it is not a rock-crab form. A repository-wide archive review found no focused rock-crab proposal or integration. The generic-crab review's reuse of the Madeleine Islands product and the Jonah review's explicit `crabe commun` exclusion are the relevant prior boundaries described above. No recipe, reference, form, or candidate owner is transferred from those records.

## Picker projection and hold reason

The projection below mirrors [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): a complete normalized word phrase contained in a reference name, alias, or attached form is returned before substring fallback. It tests a counterfactual species row displayed as `Rock crab / crabe commun`, with no aliases; this pair is **not** a proposed integration payload.

| Query | Current result | If the counterfactual row were added | Boundary |
|---|---|---|---|
| `rock crab` | No result | `ingredient-ref-rock-crab` alone | CFIA assigns this common English phrase to at least four taxa in its crab results [S02]. The singleton would overstate species certainty. |
| `crabe commun` | No result | `ingredient-ref-rock-crab` alone | OQLF documents market overlap with Jonah crab; CFIA uses this French name for multiple taxa [S01, S02]. |
| `crab` | Blue crab; crab meat; crab-flavoured pollock flakes; Dungeness crab; Jonah crab | Those five plus the counterfactual row | Broad search remains a multi-result list, but does not cure the two misleading qualified-name singletons above. |
| `crabe` | Blue crab; crab meat; crab-flavoured pollock flakes; Dungeness crab; Jonah crab | Those five plus the counterfactual row | Same multi-result behavior in French. |
| `crab meat`; `chair de crabe` | `ingredient-ref-crab` | Same result | The candidate row would not take the established generic meat query or its Jumbo Lump form. |
| `Jonah crab`; `crabe nordique` | `ingredient-ref-jonah-crab` | Same result | The accepted, species-qualified Jonah identity remains distinct. |
| `Cancer irroratus` | No result | No result | The binomial is evidence, not a proposed search alias. |

The current index has no second species row to make `rock crab` or `crabe commun` visibly multi-choice. Adding `crabe commun` to the Jonah row would expose the known two-species Québec overlap, but it would not resolve the additional CFIA taxa and would broaden an accepted alias set without a catalog-wide collision plan. Hold the rock-crab row until search can present these common-name queries as an ambiguity set or a source-backed Québec consumer term uniquely identifies *C. irroratus*.

## Bundled recipe demand

The manifest-listed corpus scan covered all 114 recipe files and all 1,123 ingredient rows for `rock crab`, `crabe commun`, *Cancer irroratus*, picked crab-leg wording, and related product phrases. It found no rock-crab name, binomial, reference ID, form ID, or species-specific recipe link.

The only bundled crab-meat request is recipe [019, `Boulettes de crabe / Crab Balls`](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json), ingredient row 8: `1 lb jumbo lump crab meat`. It is already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. The recipe does not specify *C. irroratus*, `crabe commun`, or picked leg meat; do not reassign or use this generic recipe quantity to infer a rock-crab measure.

## Product, measurement, conversion, yield, and substitution limits

- **Identity:** *Cancer irroratus* is the species-level candidate, supported by OQLF, CFIA, MAPAQ, and the local seller [S01–S04]. Keep it distinct from Jonah crab (*C. borealis*), Dungeness crab, blue crab, and imitation/pollock products.
- **Product:** The Madeleine Islands seller describes picked leg meat from locally caught crab and identifies *C. irroratus* [S04]. MAPAQ also lists leg meat, salad meat, shredded meat, and blended salad/leg products for `crabe commun` [S03]. These establish commercial product examples, not a species-wide form model or the state of every package.
- **Numeric observations:** The seller offers 227 g and 454 g packages; these are SKU package masses. Its storage guidance says up to 4 days refrigerated at 4 °C or up to 2 years frozen at −18 °C; those are seller-specific storage instructions, not recipe behavior [S04]. MAPAQ lists leg meat in 227 g and 2.27 kg packages, shredded meat and salad meat at 2.27 kg, and salad/leg blends at 60/40 or 80/20 [S03]. These are commercial formats or blend ratios, not household measures or transferable conversions. MAPAQ's nutrition panel is based on 100 g of cooked meat; it is not a serving recommendation. Its reported male size/weight observations (up to 14 cm and 250 g) are biological, not edible yield or kitchen portion evidence [S03].
- **Forms and measurements:** Add no active form, density, unit mapping, volume measure, or count-to-mass conversion. Product-specific picked-leg wording does not define a general crab form under the existing generic meat row.
- **Conversions and yields:** Add no shell-on-to-meat, raw-to-cooked, frozen-to-thawed, package-to-ingredient, cooking-loss, or edible-yield rule. The cited package weights and commercial blend ratios cannot support those calculations.
- **Substitutions:** Add no rule between rock crab, Jonah crab, Dungeness crab, blue crab, crab meat/Jumbo Lump, pollock flakes, or other seafood. The reviewed sources do not establish recipe interchangeability or a quantity ratio.

## Disposition

**Hold** `ingredient-ref-rock-crab` outside the active catalog. Do not add a row, alias, form, measurement, ledger identity record, recipe link, conversion, yield, or substitution now. Keep `crabe commun` unassigned in picker data, preserve the Jonah and generic crab-meat entries as they are, and reopen only if the picker can represent the name collision or a source-backed Québec term uniquely distinguishes the intended product/species.

## Source register

Sources were accessed on 2026-10-13. IDs are local to this proposal; no shared source records were created.

| ID | Source and locator | Evidence used | Evidence limit |
|---|---|---|---|
| **WP04-P-ROCK-CRAB-20261013-R77-S01** | Office québécois de la langue française, [crabe commun (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198892/crabe-commun). | Standardizes Québec French `crabe commun` for *Cancer irroratus*. The note states *C. irroratus* and Jonah crab (*C. borealis*) are often marketed indistinguishably under this name. | Terminology and Québec market-name caveat; it does not identify every retail lot or provide a product conversion. |
| **WP04-P-ROCK-CRAB-20261013-R77-S02** | Canadian Food Inspection Agency, [Fish List lookup for `crab`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on%2F1000&cmbIn=e&lang=e&q=crab). | Lists *C. irroratus* as `Rock Crab / Crabe Commun`; also applies `Rock Crab / Crabe Commun` to *C. productus* and *M. edwardsii*, and `Rock Crab` to *C. pagurus*. | Canadian fish-label name list, not evidence that all listed taxa are sold in Québec or interchangeable in recipes. |
| **WP04-P-ROCK-CRAB-20261013-R77-S03** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Les crustacés du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), PDF p. 2. | Pairs *Cancer irroratus* with `Rock crab`; documents Québec fishery context, meat product types, package formats, a cooked-meat nutrition basis, and biological size/weight observations. | Commercial pack sizes, nutritional basis, and biological data are not recipe measures, yields, densities, or conversions. The guide does not define a universal product state. |
| **WP04-P-ROCK-CRAB-20261013-R77-S04** | Les Fruits de mer Madeleine, [Chair de pattes de crabe commun](https://www.fruitsdemermadeleine.com/nos-produits/nos-crabes/crabe-commun/chair-de-crabe-commun). | A Québec seller identifies locally caught *C. irroratus*, describes picked leg meat from the Îles-de-la-Madeleine, and lists package options. | One seller's product. Its package amounts and storage details do not establish common measures, species-wide preparation, yield, or current availability beyond the listing. |
| **WP04-P-ROCK-CRAB-20261013-R77-S05** | Fisheries and Oceans Canada, [Commercial fisheries for Rock crab, Toad crab and Jonah crab](https://www.dfo-mpo.gc.ca/fisheries-peches/commercial-commerciale/atl-arc/crab-crabe-eng.html). | The Québec regional maps include rock-crab fishing areas for the North Shore and Magdalen Islands; the current page was modified 2026-06-26. | Fishery-area evidence only; it does not establish a picker name, retail product state, recipe measure, or species synonym by itself. |

## Static review record

- Read current `AGENTS.md`, the open checklist line, active reference and form files, legacy candidates, research ledger, bundled recipe corpus, and relevant crab proposal/batch archive before selecting the candidate.
- Rechecked exact candidate-ID and source-prefix collisions; reviewed current reference/form owners, ledger boundaries, and prior generic-crab/Jonah decisions.
- Recounted 1,401 active references, 104 forms, 63 legacy candidates, 1,739 ledger records, 8 unit conversions, 114 recipes, and 1,123 ingredient rows from the live files.
- Scanned the manifest-listed recipe corpus for the species, common names, and picked-leg product; found no candidate-specific recipe demand.
- Projected the counterfactual row against current `IngredientSearch.kt` phrase-first behavior. This is static analysis, not an app, runtime picker, or emulator check.
- No tests or emulator were run for proposal-only research. The project instructions also exempt changes limited to new database JSON data from testing.
- Checked this proposal as strict UTF-8 without BOM, with no mojibake or trailing whitespace and a final newline; local Markdown links and the checklist line anchor were checked after writing. No other file is part of this R77 change.
