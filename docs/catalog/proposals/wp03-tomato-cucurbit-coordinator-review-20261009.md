# WP03 Section L — tomato and cucurbit checklist review

- **Reviewed:** 2026-10-09
- **Status:** proposal only; no shared catalog, ledger, recipe, plan, roadmap, generated file, code, or test was changed.
- **Scope:** the first two unchecked Section L lines at plan lines 1425–1428: tomato identities/forms; tomatillo, eggplant types, cucumber, zucchini, summer squash, pumpkin, butternut, acorn, kabocha, delicata, and spaghetti squash.
- **Recommendation:** preserve the four active produce references, add no unsupported forms or cross-product aliases in this proposal, and resolve the evidence gaps before marking either plan line complete. OQLF provides strong fr-CA identity terms for most fresh produce; CFIA distinguishes several processed tomato products and their standards. Only six recipe rows directly support this scope, and the catalog currently collapses canned diced tomatoes into the generic tomato reference.

## Snapshot and audit method

The live package snapshot at review time is:

| Artifact | State | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 509 references | `074c4381a10e397cbb289cb732b989496eb826e377a494f1451b7546e9777083` |
| `ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 689 records; 1,119 source references across 935 distinct source IDs | `e7f3afcaa8ac751c594e1cdf264cea6e4d8c10ea5b4e41f66050977d7bdccd9a` |
| `legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |

The audit read the live references, forms and their match terms, the ledger, the legacy candidate list, and every manifest-listed recipe. It scanned all 1,123 ingredient rows by original text, canonical name, and reference ID, then checked normalized picker phrase behavior against `IngredientSearch.kt` (lowercase, NFKD/accent folding, punctuation-to-space, complete word-phrase matches before substring fallback). Legacy candidates were treated as inactive review records; they are not live picker rows. Online terminology checks used OQLF GDT pages and CFIA’s incorporated standards. Source IDs below are proposal-local and have not been entered in the ledger.

## Live catalog and recipe demand

The active catalog contains these relevant references:

| Active reference | Current EN / fr-CA display | Category | Evidence state |
|---|---|---|---|
| `ingredient-ref-tomatoes` | `tomatoes` / `tomates`; FR alias `grosses tomates` | `VEGETABLE_AND_AROMATIC` | Ledger identity `unreviewed`, measurement `blocked_pending_evidence`, substitution `not_yet_researched`; zero source entries. |
| `ingredient-ref-tomato-paste` | `tomato paste` / `pâte de tomates` | `VEGETABLE_AND_AROMATIC` | Same evidence states; zero source entries. |
| `ingredient-ref-tomato-sauce` | `tomato sauce` / `sauce tomate` | `VEGETABLE_AND_AROMATIC` | Same evidence states; zero source entries. |
| `ingredient-ref-cucumber` | `cucumber` / `concombre` | `VEGETABLE_AND_AROMATIC` | Identity `unreviewed`, measurement and substitution `not_yet_researched`; zero source entries. |
| `ingredient-ref-pumpkin-spice` | `pumpkin spice` / `'épices tarte à la citrouille` | `BAKING_AND_SPICE` | Separate spice blend, not a pumpkin ingredient. |

None of the 32 active ingredient forms has a tomato, cucumber, squash, pumpkin, eggplant, zucchini, or tomatillo label or match term. There is no active reference for cherry/plum tomato, tomato purée, passata, sun-dried tomato, tomatillo, eggplant, zucchini, summer squash, pumpkin/citrouille, butternut, acorn, kabocha, delicata, or spaghetti squash.

Six bundled ingredient rows directly cover the checklist concepts:

| Recipe prefix / 1-based ingredient row | Recipe | Original line | Current link | Finding |
|---|---|---|---|---|
| `034#8` | *Chili classique au bœuf / Classic Beef Chili* | `798 ml canned diced tomatoes` | `ingredient-ref-tomatoes` | Exact canned/diced state is in line preparation/text, but not represented by a catalog form or identity. This is the one direct tomato link whose product state merits a form review. |
| `096#1` | *Sauce à pizza / Pizza Sauce* | `4 large tomatoes, diced` | `ingredient-ref-tomatoes` | Fresh/raw use is plausible from the source recipe context, while the line itself explicitly preserves size and diced preparation. Do not infer canned status or a catalog density from the four-count quantity. |
| `078#12` | *Pâté chinois / Shepherd's Pie* | `2 tbsp tomato paste` | `ingredient-ref-tomato-paste` | Already linked to the named product. |
| `086#12` | *Poulet au beurre / Butter Chicken* | `156 ml tomato paste` | `ingredient-ref-tomato-paste` | Already linked to the named product. The recipe volume is not a density observation. |
| `090#1` | *Ragoût aux arachides africain / African Peanut Stew* | `1 cup tomato sauce` | `ingredient-ref-tomato-sauce` | Already linked to the named prepared product; not a tomato-purée or paste line. |
| `113#1` | *Tzatziki* | `2 cups grated cucumber` | `ingredient-ref-cucumber` | Already linked to the generic cucumber identity; the recipe does not specify a cucumber cultivar. |

A nearby search/ingredient false positive is `073#6`, `1 tsp pumpkin pie spice`, linked to `ingredient-ref-pumpkin-spice`. It is not demand for pumpkin flesh or pumpkin purée. No direct row names cherry/plum tomatoes, canned whole/crushed tomatoes, tomato purée/passata, sun-dried/oil-packed tomatoes, tomatillo, aubergine, zucchini, squash, pumpkin, or the listed winter-squash types. This is a bundled-library result only, not a claim about external recipes.

The legacy candidate file has six relevant unreviewed entries: `ingredient-ref-whole-tomatoes`, `ingredient-ref-diced-tomatoes`, `ingredient-ref-crushed-tomatoes`, `ingredient-ref-pumpkin-puree`, `ingredient-ref-butternut-squash`, and `ingredient-ref-zucchini`. They have no active recipe links and no live picker behavior. Treat them as draft candidates to resolve in place; do not activate duplicates merely because they were once listed.

## Search collisions and naming behavior

The current search implementation returns complete phrase matches before falling back to partial substrings. This creates visible edge cases with plural canonical names:

| Query | Current live results | Consequence |
|---|---|---|
| `tomato` | `ingredient-ref-tomato-paste`, `ingredient-ref-tomato-sauce` | The generic `tomatoes` row is omitted because its current terms are plural. A carefully scoped singular alias on the generic reference could make it searchable, but then the expected result set includes the distinct paste and sauce products too. |
| `tomate` | `ingredient-ref-tomato-sauce` | Generic `tomates` and `pâte de tomates` use plural terms, so the bare singular query finds the sauce phrase only. Consider an alias on the generic tomato reference if live picker QA confirms it improves search without obscuring product choices. |
| `tomates` | `ingredient-ref-tomatoes`, `ingredient-ref-tomato-paste` | French plural phrase already spans whole tomatoes and paste because of the paste display. Keep the paste as a separate product; do not hide this valid multi-result behavior by collapsing it into the generic row. |
| `pumpkin`, `citrouille` | `ingredient-ref-pumpkin-spice` | Adding a fresh pumpkin identity will correctly produce more than one related result. Keep the spice and vegetable distinct; do not make `pumpkin`/`citrouille` a spice-only alias. |
| `cucumber`, `concombre` | `ingredient-ref-cucumber` | Exact expected owner. |
| `tomatillo` / `tomatille`, `eggplant` / `aubergine`, `zucchini` / `courgette`, `squash` / `courge`, `butternut`, `kabocha`, `delicata`, `spaghetti squash` | No active result | No current alias owner; the six legacy entries are not loaded in this search. |

When adding any missing product rows or aliases, rerun exact phrase and normalized search audits. In particular, keep `tomato paste`, `tomato sauce`, and any future tomato purée/passata product separate; keep pumpkin spice separate from the vegetable; keep tomatillo separate from tomato and from unripe green tomatoes; and do not add broad `squash`/`courge` aliases to a particular cultivar.

## Coordinator dispositions

| Checklist concept | Evidence-backed fr-CA / EN naming | Recommended disposition |
|---|---|---|
| Fresh tomato | `tomato` / `tomate`; current canonical plural is `tomatoes` / `tomates`. OQLF lists tomato as a food vegetable. | Retain the generic active identity. Review safe singular aliases `tomato` and `tomate` because of the present search gap. Do not add unqualified `green tomato` as an alias; maturity/color is a product distinction and can collide with unripe tomatoes. |
| Cherry tomato | `cherry tomato` / `tomate cerise`; OQLF also accepts `tomate cocktail` in Québec. | If this checklist batch creates the explicit variants, use a distinct named identity (or a deliberately tested specific variant mechanism), not a generic alias that erases cherry-product specificity. No bundled line currently requires it. |
| Plum / Italian tomato | `plum tomato` / `tomate prune`; OQLF also lists `tomate oblongue`, `tomate allongée`, and `tomate italienne`, the latter specifically noted as common in Québec. | Keep it distinct from cherry and generic tomatoes if activated. Do not add `tomate italienne` to a generic tomato row. No current recipe names it. |
| Whole, diced, crushed canned tomatoes | CFIA’s French identity standard places whole/almost-whole, pieces, wedges, sliced, diced, and chopped tomatoes under the same heat-processed tomato product standard. | Prefer forms under `ingredient-ref-tomatoes` for explicit canned/cut state (at minimum, review `canned_diced` for `034#8`). Keep `preparation` on the recipe row; a form is catalog guidance/search metadata and does not justify a new conversion. Reconcile or remove the matching inactive legacy IDs during later integration. |
| Tomato purée | OQLF: `tomato purée` / `purée de tomates`. CFIA also has a distinct standardized tomato-purée product. | Do not alias to paste, pulp, sauce, or passata. If activated, model as its own product identity or an explicit named form according to the coordinator’s established product/form boundary, and attach the source-defined boundary. No direct recipe use. |
| Passata | No reviewed OQLF/CFIA source established a Québec preferred equivalent or equivalence to puree/pulp/sauce. | Keep as an unresolved product candidate; require a Canadian bilingual product label or technical product source before choosing a French display or adding aliases. Do not map it to purée based on assumed similarity. |
| Tomato paste | `tomato paste` / `pâte de tomates` (Québec/Canada); OQLF also prefers `concentré de tomates`. | Retain the active identity and attach fresh evidence. Do not merge with purée, pulp, sauce, or generic tomato. CFIA separately names concentrated paste at a higher minimum tomato-solids standard; that is a compositional boundary, not a kitchen conversion. |
| Sun-dried, oil-packed tomatoes | A specific Canadian fr-CA product-label source was not located in this review. | Keep `sun-dried` and `oil-packed` as pending product/form distinctions. They describe preservation/packing states and may need separate combination terms; do not alias to fresh/canned tomato or infer an oil quantity. No direct recipe use. |
| Tomatillo | `tomatillo` / `tomatille`; OQLF also lists `alkékenge du Mexique`. | Add a distinct identity if completing the checklist row; never map it to tomato or green tomato. There is no recipe demand. The alternate `alkékenge du Mexique` is supported but may be omitted if a shorter bilingual alias set is preferred. |
| Eggplant and types | `eggplant` / `aubergine`. OQLF describes western and some Chinese, Japanese, and Thai varieties, but does not establish a complete fr-CA label set for the types. | Add one general identity if needed; defer type-specific rows/aliases until a recipe or bilingual product label identifies a type. Do not infer variety from color/shape descriptions or add generic `Asian eggplant` as a species-specific alias. |
| Cucumber | `cucumber` / `concombre` is already active. OQLF’s entry distinguishes slicing/table, pickling, and greenhouse classes; English/European cucumber is in its greenhouse class. | Retain the reference. Do not add separate forms from the broad checklist without a named line. Do not map pickled cucumbers to this raw identity; that is a preserved-product review. |
| Zucchini | `zucchini` / preferred `courgette`; OQLF notes `zucchini` is established in Québec/Canada culinary and food-trade usage. | Resolve the unreviewed legacy candidate as one identity if the row is completed; include both direct terms. Keep it separate from generic summer squash and winter squash. |
| Summer squash | `summer squash` / `courge d’été`; OQLF explicitly says the “summer” category is maturity/skin class, not necessarily seasonal availability, and includes zucchini plus several other types. | Keep as a broad class identity only if the catalog needs a searchable generic class. Do not assign `summer squash` as an alias of zucchini, chayote, or pattypan. No direct line. |
| Pumpkin | `pumpkin` / `citrouille` for the OQLF-described *Cucurbita pepo* product. `Potiron` is separately described as *Cucurbita maxima*. | Add the requested pumpkin/citrouille identity if completing the checklist; keep potiron distinct, and keep both separate from pumpkin spice. Do not use broad `winter squash` as an alias. |
| Butternut | `butternut squash` / `courge butternut`; `courge doubeurre` is also listed but identified as mainly European French. | Resolve the existing legacy candidate with the Québec-preferred `courge butternut`; keep the European term optional and regionally annotated rather than preferred. Keep it distinct from generic `courge musquée` if both identities are introduced; the latter is a broader species grouping. |
| Acorn | `acorn squash` / `courge poivrée`; OQLF also lists `courgeron` and English `pepper squash`. | Add a distinct named identity if completing the explicit checklist; avoid bare `acorn` and any mapping to generic pumpkin. |
| Kabocha | `kabocha` / `courge japonaise` is named in OQLF’s winter-squash list. | Candidate identity terms are supported by the list, but the entry does not give a separate bilingual headword pair. Preserve the product name and verify a Canadian bilingual product label before broad aliasing (especially `Japanese squash`). No direct demand. |
| Delicata | OQLF’s winter-squash list calls it `Delicata` and describes its club shape; it does not establish a preferred fr-CA translation. | Keep spelling `Delicata` in the candidate name; defer a French descriptive label and aliases until product-label confirmation. Do not infer a validated identity from the English word alone. |
| Spaghetti squash | `spaghetti squash` / `courge spaghetti`. | Add as its own vegetable identity if completing the checklist. Avoid `spaghetti végétal`, which OQLF marks inappropriate for the vegetable (it describes the cooked shredded result). Do not alias to pasta. |

The English OQLF entries for some classes are older and descriptive rather than current product-label standards. They provide reliable terminology and family boundaries, not evidence that every named variety needs a picker row. The explicit checklist can justify identity-only entries in a global catalog, but the absent recipe demand means no density, mass/volume map, package yield, form conversion, or substitution should be inferred.

## Evidence map and limits

Sources were accessed on 2026-10-09. Each link supports the limited claim noted; none was added to the shared ledger.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-TC-20261009-S01** | OQLF, [tomate](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082628/tomate) | Generic bilingual `tomate` / `tomato`; identifies cherry and plum among tomato varieties and says the plum variety is often called `tomate italienne` in Québec. Terminology/overview page, not exhaustive cultivar taxonomy. |
| **WP03-TC-20261009-S02** | OQLF, [tomate cerise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082629/tomate-cerise) | Preferred `tomate cerise`, alternate Québec `tomate cocktail`, English `cherry tomato`. The measurement note is size description, not an ingredient count-to-mass mapping. |
| **WP03-TC-20261009-S03** | OQLF, [tomate oblongue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082625/tomate-oblongue) | `plum tomato`, `tomate prune`, `tomate italienne`, `tomate oblongue`, `tomate allongée`; the entry describes a type, not a brand or preserved form. |
| **WP03-TC-20261009-S04** | CFIA, [Canadian Standards of Identity: Volume 4 — Processed Fruit or Vegetable Products](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§31–37 | Canadian French standard treats canned tomatoes as one product with whole/almost-whole, pieces, wedges, slices, diced, and chopped presentations; separately names tomato purée, pulp, paste, and concentrated paste. This supports product/form boundaries, not nutrition or recipe conversion. |
| **WP03-TC-20261009-S05** | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 10 §§10.2.4–10.2.8 | English standards define canned tomatoes, tomato paste, concentrated tomato paste, tomato pulp, and tomato purée separately. The tomato solids percentages and specific-gravity requirements are regulatory composition thresholds; they are not volume-to-weight densities or substitution ratios. |
| **WP03-TC-20261009-S06** | OQLF, [concentré de tomates](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8877778/concentre-de-tomates) | `tomato paste` / `concentré de tomates`; `pâte de tomates` is acceptable and specifically marked Québec/Canada. The recipe use is already linked to this product. |
| **WP03-TC-20261009-S07** | OQLF, [purée de tomates](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17023077/puree-de-tomates) | `tomato purée` / `purée de tomates`, defined as cooked, drained, sieved tomatoes. Different description from paste; it does not establish equivalence to Italian passata. |
| **WP03-TC-20261009-S08** | OQLF, [tomatille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361983/tomatille) | Preferred French `tomatille`, English `tomatillo`, with the alternate `alkékenge du Mexique` and species note. OQLF calls the fruit green but does not equate it with green/unripe tomato. |
| **WP03-TC-20261009-S09** | OQLF, [aubergine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine) | General `aubergine` / `eggplant` and examples of East Asian varieties. Does not provide validated local market names for every checklist type. |
| **WP03-TC-20261009-S10** | OQLF, [concombre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297014/concombre) | `concombre` / `cucumber`; English note distinguishes slicer/table, pickling, and greenhouse cucumber classes and places long European/English cucumber in the latter. Does not require separate catalog references absent demand. |
| **WP03-TC-20261009-S11** | OQLF, [courgette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359784/courgette) | Preferred `courgette`, English `zucchini squash`; notes `zucchini` is widely established in Québec and Canada’s culinary/trade usage. |
| **WP03-TC-20261009-S12** | OQLF, [courge d’été](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9483318/courge-dete) | `summer squash` / `courge d’été` and explains the maturity/skin category, including zucchini, chayote, cocozelle, neck squash, and pattypan. It is a group, not a synonym for any one member. |
| **WP03-TC-20261009-S13** | OQLF, [courge d’hiver](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver) | Descriptive list includes acorn, butternut, delicata, kabocha/Japanese squash, spaghetti squash, and pumpkin; supports family distinctions, but its variety list is not a current Canadian label catalogue or exhaustive taxonomy. |
| **WP03-TC-20261009-S14** | OQLF, [courge butternut](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083901/courge-butternut) | `butternut squash` / `courge butternut`; `courge doubeurre` is noted as mainly European French. Distinguishes the variety from broader `courge musquée`. |
| **WP03-TC-20261009-S15** | OQLF, [courge poivrée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083835/courge-poivree) | `acorn squash` / `courge poivrée`, `courgeron`, and English `pepper squash`. |
| **WP03-TC-20261009-S16** | OQLF, [courge spaghetti](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297000/courge-spaghetti) | `spaghetti squash` / `courge spaghetti`; explicitly discourages `spaghetti végétal` for the vegetable. |
| **WP03-TC-20261009-S17** | OQLF, [citrouille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520118/citrouille) | `pumpkin` / `citrouille` for the described *Cucurbita pepo* vegetable. |
| **WP03-TC-20261009-S18** | OQLF, [potiron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520105/potiron) | `pumpkin` / `potiron` is a separately described *Cucurbita maxima* item; English “pumpkin” spans broader consumer usage, so retain the specific FR distinctions and do not globally alias `potiron` to `citrouille`. |

The reviewed official sources do not settle a preferred fr-CA label or product boundary for passata, oil-packed tomatoes, sun-dried tomatoes, or delicata. Obtain a Canadian bilingual retail label or a specific technical source before enabling those aliases/forms. The review also did not seek kitchen-scale mass/volume data; the CFIA solids and gravity rules must not be converted into density values.

## Coordinator actions and open gaps

1. Retain the active tomato, paste, sauce, and cucumber rows and attach fresh identity sources in the ledger; they currently have no source entries. Preserve tomato paste and sauce as separate product identities.
2. Consider adding normalized singular search aliases `tomato` and `tomate` to the generic tomato reference, then recheck picker results. Keep related paste/sauce results visible where their terms match.
3. For the one canned-diced recipe row `034#8`, model that named canned/cut state as an explicit form under tomatoes if the current form model is accepted for canned vegetable states. Leave the recipe’s original wording/preparation intact. Do not add whole/crushed canned forms without a direct product or recipe need in a later batch.
4. Resolve the six matching legacy candidates against current source evidence in place; do not create compatibility links or runtime migration behavior for them.
5. If advancing the produce checklist now, use OQLF-backed bilingual entries for tomatillo, aubergine, zucchini, summer squash, citrouille, butternut, acorn, and spaghetti squash. Keep cucumber. For kabocha, delicata and eggplant subtypes, use product-specific bilingual labels before enabling aliases. Keep named tomato varieties separate and avoid broad cross-product aliases.
6. Leave passata, tomato purée, sun-dried/oil-packed products, and all uncited variant labels unresolved until the product/form modeling choice and Canadian product terms are source-backed. No linked recipe requires them.
7. Add no density, unit mapping, package yield, ingredient-form substitution, or tomato-to-tomatillo/pumpkin/squash substitution. No reviewed recipe line supports one.

Section L and both scoped checklist lines remain open in this proposal. The next coordinator integration should refresh hashes and collision checks at merge time because the shared seed and ledger can change while parallel proposal reviews are underway.
