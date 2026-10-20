# R890–R892 generic ingredient gap integration

Reviewed and integrated on 2026-10-19 after independent root review of the three proposal-only reviews.

## Accepted identities

- **R890 — foxtail millet bran / son de millet d'Italie:** added identity-only `ingredient-ref-foxtail-millet-bran` as `GRAIN_AND_CEREAL`. The French compound remains provisional. Keep husk, edible grain, flour, other species-specific brans, and the study's mixed bran-rich fraction separate. The studies' samples, processing, particle sizes, formulations, amounts, and findings remain study-specific.
- **R891 — black elderflowers / fleurs de sureau noir:** added identity-only `ingredient-ref-black-elderflowers` for the culinary flowers or inflorescences of *Sambucus nigra* as `VEGETABLE_AND_AROMATIC`. The French compound is descriptive, not a separate OQLF ruling. Keep elderberry fruit, other *Sambucus* taxa, and syrups, cordials, wines, jellies, and other preparations separate. The Québec recipe does not identify a species; its quantity and method remain recipe-specific and were not linked.
- **R892 — clam / palourde name group:** promoted existing candidate `ingredient-ref-clam` in place to the visibly qualified `clam (name used for multiple clam species) / palourde (nom utilisé pour plusieurs espèces de palourdes)` identity in `PROTEIN`. Kept the earlier unresolved decision for assigning bare terms to one species, all species-specific holds, and the distinction between CFIA label overlap and biological or culinary equivalence.

No forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions were added. Only the explicitly reviewed search aliases were added to the elderflower and clam rows. Measurement and substitution research remain unresearched for the new identities. CNF Food Code 3109 portions remain code-specific.

## Cross-category scope disposition

- The user clarified that brand and commercial-product roster work is out of scope across every ingredient type. All R890–R892 assignments were generic identity reviews; none pursued brands, product lines, flavours, SKUs, or retailer variants.
- The queue review found no open checklist item whose sole deliverable is a commercial roster. The two open Section F cereal-mix parents remain open for generic ingredient diversity only; commercial rosters are out of scope because product counts do not add ingredient diversity.
- Existing branded references and their evidence were preserved. No branded row was deleted, merged, or generalized. Manufacturer and retail pages remain usable as evidence for a generic ingredient only where the underlying claim transfers; named-product measures and claims stay product-scoped.
- The existing Anson Mills wheat-meal product-only disposition and R605 history remain unchanged. Generic wheat meal remains unresolved.

## Root source recheck

- CFIA's current Fish List results table independently shows the repeated exact `Clam / Palourde` label pair for *Gari solida*, *Meretrix lyrata*, and *Protothaca thaca*. The interactive query endpoint did not render directly; the official results table and official guidance were rechecked. This supports a qualified label-name group, not a taxon, exhaustive membership list, or culinary-equivalence claim. Sources: [CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names).
- Health Canada's [CNF Food Code 3109](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3109) lists raw mixed-species clam. Its individual portions and shell-removal value remain tied to that code.
- OQLF's [elderflower](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544160/fleur-de-sureau) and [black elder](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19474900/sureau-noir) entries provide the genus-level French flower term and *Sambucus nigra* naming boundary; the [RHS edible-flower guide](https://www.rhs.org.uk/herbs/edible-flowers) documents culinary use for *S. nigra*. The [Québec elderflower lemonade recipe](https://defijemangelocal.ca/limonade-aux-fleurs-de-sureau/) supports local wording only and names no species.
- Foxtail-millet identity, food-study, and provisional French terminology evidence is recorded in the [R890 proposal](../../proposals/wp02-next-generic-grain-gap-review-r890-20261019.md); it keeps the mixed study fraction and all product- or sample-specific claims scoped.

## Static validation

Static package validation and normalization passed at **1,921 references / 201 forms**. Research-ledger validation passed with **2,324 records, zero errors, 10,965 source entries, 9,206 distinct source IDs, 7,827 distinct URLs, and 8 unit conversions**. The generated Kotlin catalog is current at 1,921 references.

Exact display/alias ownership found no collisions. New rows have no forms, density, or unit mappings. The phrase-first picker projection returns one result for each exact new identity. Broad searches return 3 for `foxtail millet` and `millet d'Italie`, 22 for `millet`, and 21 for `bran`; `elder` and `sureau` return the separate elderberry and black-elderflower rows. `clam`, `clams`, `palourde`, and `palourdes` return the visibly qualified clam group; `mye` and `coque` remain on their existing unrelated results. All 114 manifest-listed recipes / 1,123 ingredient rows were scanned; none contains an exact proposed ingredient phrase or reference link.

The 2,844 local links in the reviewed documentation resolve, and all 1,358 local plan line anchors remain within the plan after line-number updates. UTF-8 without BOM, mojibake, and trailing-whitespace checks passed for the plan, roadmap, workflow, scope review, integration README, and three proposals. No software tests, build, emulator run, or deployment were performed because the database data changes only add JSON under `AGENTS.md`.

## Proposal records

- [R890 foxtail-millet bran](../../proposals/wp02-next-generic-grain-gap-review-r890-20261019.md)
- [R891 black elderflowers](../../proposals/wp03-section-k-black-elderflowers-identity-review-r891-20261019.md)
- [R892 clam name group](../../proposals/wp04-section-p-generic-clam-market-group-review-r892-20261019.md)
