# WP02 A7 — Malted Teff Flour Boundary Review (R37)

- Reviewed: 2026-10-13.
- Status: Integrated as a documentation-only hold. No shared catalog, ledger, recipe, or package file was changed.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S01` through `S06`. These IDs belong only to this proposal and are not ledger records.
- Scope: the experimental food-flour candidate described as `malted teff flour`. This is distinct from plain teff flour, whole teff malt used for brewing, generic malt flour, and cereal-specific malted flour identities. It does not reopen prior A7 meal, millet, sorghum, oat, buckwheat, maize, rice-grits, or gluten-flour reviews.

## Disposition

The review is recorded under the open A7 checklist item and in the active roadmap. Malted teff flour remains outside the active catalog and research ledger until a current Canadian or Québec product source establishes its commercial scope and French product name.

| Candidate | Recommendation | Active identity | Boundary |
|---|---|---|---|
| `malted teff flour` | **Keep unresolved and unallocated.** Add no active reference, alias, form, legacy identity, measurement, recipe link, or substitution. | None proposed | A research paper uses the exact English phrase for an experimental malt-porridge ingredient. Other primary sources establish teff malting for research and brewing. The sources do not establish a current Canadian/Québec standalone flour product, a consistent commercial specification, or a Québec French product name. |

The English candidate wording is attested in a study, not a manufacturer product name. A Québec-facing plain-flour listing uses `farine de teff`; OQLF's entry gives `tef` as the recommended but non-current crop spelling and translates it as `teff`. Neither source names a malted flour. `Farine de teff maltée` would be an unverified descriptive construction, so do not use it as a display name or alias.

Keep the candidate separate from `teff flour / farine de teff`, whole `teff / teff d'Abyssinie`, generic `malt flour / farine maltée`, and the existing malted barley, wheat, rye, spelt, roasted oat malt, and roasted wheat malt flour identities. Experimental whole-grain teff malt for brewing is not evidence that every malted teff product is a food flour.

## A7 and archive check

The active A7 parent item at [the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) remains open for other grain meals, other malted/toasted flour identities, and gluten-flour equivalence. Before this proposal, the archive contained no adjudication of malted teff flour or teff malt flour. Existing teff references and the separate WP03 puffed-teff review concern plain flour, whole grain, or puffed kernels; they do not resolve a malted flour. R32–R36 address other cereal-specific malted-flour candidates and do not include teff.

## Live ownership and picker audit

Read-only snapshot: **1,365 active references**, **100 forms**, **64 legacy candidates**, **1,699 research-ledger records**, **114 manifest-listed recipes**, and **1,123 ingredient rows**.

| Surface | Current finding |
|---|---|
| Active references | `ingredient-ref-teff-flour` owns `teff flour / farine de teff` (`FLOUR_AND_STARCH`), with no aliases, null `defaultDensity`, and no unit mappings. `ingredient-ref-teff-grain` owns `teff / teff d'Abyssinie` (`GRAIN_AND_CEREAL`), also with no aliases or numeric mappings. No active row owns a malted-teff phrase. The generic malt-flour row and other cereal-specific malted/roasted rows remain separate. |
| Forms | No form mentions teff or owns any candidate phrase. |
| Legacy and research ledger | No legacy candidate or ledger record owns `malted teff flour`, `malted tef flour`, `teff malt flour`, `malted teff`, or a French candidate phrase. The teff-flour ledger record supports only the plain product identity. |
| Proposal and source-ID archive | No prior proposal adjudicates malted teff flour. Before this proposal was created, its R37 filename and source-ID prefix were absent from the proposal, batch, and ledger archives. |

The picker implementation in `IngredientSearch.kt` normalizes accents and punctuation, prefers complete word-phrase matches, and then uses substring matching. Static projections from current references and forms are:

| Query | Current result |
|---|---|
| `malted teff flour`; `malted tef flour`; `teff malt flour`; `farine de teff maltée`; `farine de tef maltée` | No result |
| `teff flour`; `farine de teff` | `ingredient-ref-teff-flour` |
| `teff` | `ingredient-ref-teff-flour` and `ingredient-ref-teff-grain` |
| `malt flour` | Generic malt flour, roasted oat malt flour, roasted wheat malt flour, and malted spelt flour |

These are package/code projections, not a live UI picker test. If a future source-supported row used `malted teff flour / farine de teff maltée`, the broad `teff`, `teff flour`, and `farine de teff` searches would gain another result. No picker change is proposed now.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe JSON files** and their **1,123 ingredient rows** for the candidate English/French phrases and broader teff/tef terms. There were **zero matching recipe files and zero matching ingredient rows**. The bundled corpus supports no recipe link, relink, or import alias for this candidate.

## Measurement, density, and substitution limits

- The 2022 experimental study lists malted teff flour by mass in a specific malt-porridge formulation. That is a study-batch ingredient amount, not a reusable household measure, density, or mass-to-volume mapping.
- A separate primary study reports flour properties after cereal malting, including teff, but does not give a consumer product grade or household conversion. Do not use its flour-processing observations as a density or unit mapping.
- Bob's Red Mill's current serving amount and partial-replacement suggestion apply to its unqualified, whole-grain teff flour. They do not establish an amount or replacement ratio for malted teff flour and are not transferred here.
- The available malted-teff study uses an experimental food formulation. Its blend proportions and porridge method are not a general teff-flour substitution rule. No reviewed source tests malted teff flour as a replacement for plain teff flour, wheat flour, or another malted cereal flour.

Add no density, unit mapping, form conversion, yield, cooking ratio, or directed/contextual substitution rule. Reconsider measurements only after a product specification and exact-form household evidence are available; reconsider substitutions only with direct, recipe-relevant testing.

## Sources and limits

Sources checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S01` | Lavanya, Rani, Sangwan, and Godara, [“Optimization for Incorporating Teff, Sorghum and Soybean Blends in Traditional Food Preparation”](https://www.researchgate.net/publication/372438211_Optimization_for_Incorporating_Teff_Sorghum_and_Soybean_Blends_in_Traditional_Food_Preparation), *IAHRW International Journal of Social Sciences Review*, 10(4), 422–426 (2022); author-uploaded article, methods/flow chart and malt-porridge table. | Uses the exact phrase `malted teff flour` for an experimental porridge ingredient and describes germinating, drying, roasting, grinding, and sieving cereal samples. | One experimental composite-food study, hosted as author content; ResearchGate metadata shows a different year from the article header. It does not establish a current retail flour product, a standardized specification, Québec/Canadian availability, or French naming. Its formula and process are not generalized. |
| `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S02` | Griffith and Castell-Perez, [“Effects of Roasting and Malting on Physicochemical Properties of Select Cereals and Legumes”](https://www.cerealsgrains.org/publications/cc/1998/November/Pages/75_6_780.aspx), *Cereal Chemistry*, 75(6), 780–784; publisher abstract. | The experimental work includes teff and reports that malting affected grain/flour properties and yielded finer flours from malted seeds. | The abstract does not specify a commercial malted-teff flour, its grade, a Québec label, or a kitchen measure. The findings are not a product specification. |
| `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S03` | Gebremariam, Zarnkow, and Becker, [“Effect of teff (Eragrostis tef) variety and storage on malt quality attributes”](https://onlinelibrary.wiley.com/doi/full/10.1002/jib.65), *Journal of the Institute of Brewing*, 119(1–2), 64–70; abstract and Materials and methods, “Teff sample collection” and “Malting conditions.” | Primary research malted five teff varieties as grain for brewing and reports cultivar-dependent malt properties. | It concerns whole-grain brewing malt, not a culinary flour product, Québec product label, household amount, or baking substitution. |
| `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S04` | Office québécois de la langue française, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), definition, spelling note, and English terms. | Identifies `tef` as the recommended, non-current French crop spelling and lists English `teff`. | It does not name a flour or malted-teff product and does not validate `farine de teff maltée`. |
| `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S05` | La Chèvre et le Chou, [Farine de teff bio](https://lachevreetlechou.ca/produits/farine-de-teff-bio), active product page, title, status, and ingredient list. | Current Québec-facing French-market evidence for the plain product name `farine de teff`. | This is an unqualified product; it does not establish a malted variant. The package size and retail listing are not a reusable measure or density. |
| `WP02-A7-MALTED-TEFF-FLOUR-20261013-R37-S06` | Bob's Red Mill, [Teff Flour](https://www.bobsredmill.com/product/teff-flour), current manufacturer product page, title, ingredients, serving information, and usage suggestion. | Current English manufacturer wording for plain teff flour; the product lists whole grain teff as its ingredient. | Its serving amount and suggested partial replacement apply only to this plain whole-grain product. They are not transferred to malted teff flour. |

## Next action

Keep the candidate inactive and unallocated. Reopen only if a current Canadian or Québec-facing source identifies a standalone malted-teff food flour, establishes how it differs from plain flour and brewing malt, and provides an exact English and Québec French product name. Then review picker ownership again. Review exact-form measurement or substitution evidence separately; do not infer it from plain teff flour, brewing malt, composite formulas, or the experimental study.
