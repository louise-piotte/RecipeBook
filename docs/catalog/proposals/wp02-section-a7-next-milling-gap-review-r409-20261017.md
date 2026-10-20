# WP02 Section A7 R409: triticale-grits gap review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. No catalog data, research ledger, plan, roadmap, recipe package, generated index, or tests are changed.
- **Open checklist:** WP02 Section A7 remains open for grain meals and other milling identities, including the unresolved wheat-meal candidate; see [the A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Candidate:** English `triticale grits`, treated as a possible separate milling product rather than an alias for triticale grain, flour, flakes, or meal.
- **Proposal-local source IDs:** `WP02-A7-TRITICALE-GRITS-R409-20261017-S01` through `S03`. These IDs are local to this review and are not research-ledger records.
- **Prior-review boundary:** The exact English candidate `triticale grits` was not found in the proposal archive, active references, forms, legacy identities, ledger, or bundled recipes. R41 reviewed `triticale meal` and mentioned `gruau de triticale` only as an unsupported possible French wording; that meal decision remains intact and is not reopened here.

## Recommendation

**Hold `triticale grits` outside active references.** MEGRO's current food-industry product list names `Triticale grits`, and a peer-reviewed food study describes grits made by chopping hulled triticale grain [S01–S02]. Together, these sources support an English food-processing term and indicate that the term can refer to a separate triticale milling product.

The evidence does not establish a Québec-facing product name or a product-specific grind boundary. MEGRO's listing gives no triticale-grit size or retained-fraction specification, while the study's chopped grain is tied to an experimental extruded crispbread process. The reviewed Québec terminology sources support `triticale` and `farine de triticale`, but do not establish `gruau de triticale` or `semoule de triticale` as the display for this product [S03 and reused sources below]. Keep the candidate separate from the active triticale grain, flour, and flakes, and separate from the R41 triticale-meal hold.

Add no active reference, alias, form, legacy identity, ledger candidate, measure, density, unit mapping, recipe link, conversion, yield, or substitution. Reopen if a Québec-facing product or terminology source identifies the French display for a specified triticale-grits product.

## Product boundary and bilingual identity

The source evidence supports a candidate boundary, but not a complete bilingual identity. MEGRO places `Triticale grits` in a product overview for grain ingredients supplied to food manufacturers. The study's material is made by chopping hulled grain, but it does not show that every product sold as triticale grits has that exact preparation or particle size. OQLF's technical entry describes English *grits* as coarser than flour or meal, but its record is in malt crushing and does not name triticale [S02–S03].

| Neighbor or candidate | Boundary to retain |
|---|---|
| Triticale grain | Keep `triticale / triticale` as the cereal-grain reference. The species name does not identify a milled product. |
| Triticale flour | Keep `triticale flour / farine de triticale` as the active flour reference. The OQLF term covers flour only. |
| Triticale flakes | Keep `triticale flakes / flocons de triticale` as the separate flaked product. A flaked product is not a grits alias. |
| Triticale meal (R41) | Keep the existing R41 hold on `triticale meal`. The R41 review does not establish grits as meal or vice versa. |
| Triticale grits candidate | Treat the English label as a possible separate coarse milling product, but leave it unallocated until the exact product boundary and a Québec French display are supported. |
| `gruau de triticale`; `semoule de triticale` | Do not add either as a name or alias. The reviewed French sources do not attach either term to a triticale-grits product. The OQLF `gruau de maïs` record is corn-specific and cannot be generalized to triticale [S03]. |

The OQLF entry notes that some authors use `gruau` synonymously with `semoule`; it also limits its French definition to technical milling senses and its English description to grits. This variation is further reason to avoid translating the English candidate by analogy [S03].

## Live catalog, ledger, and archive audit

Snapshot hashes identify the data reviewed on 2026-10-17.

| Store | Snapshot | Ownership finding |
|---|---:|---|
| Active ingredient references | 1,714 rows; SHA-256 `bb8d34e3d1bf275525eec3cccf3f6e470e3af9d713236078a98544b3d465020d` | The only active triticale references are `ingredient-ref-triticale-grain` (`triticale / triticale`, `GRAIN_AND_CEREAL`), `ingredient-ref-triticale-flour` (`triticale flour / farine de triticale`, `FLOUR_AND_STARCH`), and `ingredient-ref-triticale-flakes` (`triticale flakes / flocons de triticale`, `GRAIN_AND_CEREAL`). None has aliases; all have null default density and empty unit mappings. No active row owns `triticale grits` or the proposed French phrases. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No triticale form exists. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No triticale-grits candidate or alias exists. |
| Research ledger | 2,073 records; SHA-256 `603809ff8b3fbe90ecaae75084a2a98b2d9a14ea11c2023879afb745dd3c5fd2` | Active records cover triticale grain, flour, and flakes. A separate `candidate-sprouted-triticale-grain` record is still unresolved and concerns sprouted grain, not grits. No grits record or exact grits measurement/substitution finding exists. |
| Recipe manifest | 114 recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All files and their 1,123 structured ingredient rows were scanned; there are no candidate hits. |
| Generated ingredient index | SHA-256 `d99f54762429dfff847cb68ded2815b2b056e517b1a78055f0cb3d286df48833` | No triticale-grits entry is projected in the generated index. |

The R41 archive review keeps triticale meal inactive and leaves the French rendering unresolved. This review extends A7 to a distinct English grits candidate because grits has a separate product signal and a different coarse-milling boundary in the terminology source; it does not replace or broaden the R41 meal decision.

## Phrase-first picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): names and aliases are normalized, complete word phrases are preferred across results, and partial matching is used only if no complete phrase matches.

| Query | Current result | Boundary if a future row were approved |
|---|---|---|
| `triticale grits`; `triticale grit` | None | An English display `triticale grits` would return that row for the full phrase. No French phrase is currently approved. |
| `triticale` | Grain, flour, and flakes: 3 references | A separate row would broaden this broad query; keep its full name qualified. |
| `triticale flour`; `farine de triticale` | `ingredient-ref-triticale-flour` only | Keep these queries owned by flour. |
| `triticale flakes`; `flocons de triticale` | `ingredient-ref-triticale-flakes` only | Keep these queries owned by flakes. |
| `grits` | `ingredient-ref-attieke`, `ingredient-ref-corn-grits`, `ingredient-ref-hominy-grits`, `ingredient-ref-sorghum-grits` | No triticale-grits result exists. Do not add a short alias that would broaden other products' search. |
| `gruau` | `ingredient-ref-hominy-grits`, `ingredient-ref-oat-groats`, `ingredient-ref-pc-blue-menu-maple-brown-sugar-supergrains-oatmeal`, `ingredient-ref-pc-blue-menu-regular-supergrains-oatmeal`, `ingredient-ref-quaker-super-grains-hot-cereal`, `ingredient-ref-raw-buckwheat-groats`, `ingredient-ref-rye-meal`, `ingredient-ref-scottish-oatmeal`, `ingredient-ref-sorghum-grits` | Adding an unsupported `gruau de triticale` term would broaden a query that already returns nine rows. |
| `gruau de triticale`; `semoule de triticale` | None | Keep both unowned until a source supports a product-specific Québec French name. |

This is a static search-index projection, not a live UI test. No picker change is proposed.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe JSON files** and their **1,123 structured ingredient rows** in the [bundled package](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json). Searches of complete serialized files and ingredient rows for `triticale grits`, `triticale grit`, reversed `grits triticale`, `triticale`, `triticale meal`, `triticale flour`, `triticale flakes`, `gruau de triticale`, `gruaux de triticale`, and `semoule de triticale` returned **zero file hits and zero row hits**. The package supplies no grits amount, recipe link, or line to relink.

## Measurements and substitutions

- MEGRO's general packaging FAQ says grain raw materials may be supplied in 25 kg bags or big bags up to 1,000 kg. This is a supplier-wide industrial packaging statement, not a triticale-grits package listing or a kitchen measure [S01].
- The study prepares crispbread using chopped hulled triticale grits and an extrusion process. Its additive quantities and extrusion parameters are experimental recipe details; they do not establish a reusable household measure, density, unit mapping, cooking yield, or substitution [S02].
- No reviewed source establishes a transferable mass-volume conversion or any equivalence with triticale grain, flour, flakes, or meal. No exact-form recipe demand appears in the bundled corpus.
- Add no form, density, measurement observation, unit mapping, conversion, package yield, recipe link, global form conversion, contextual substitution, or ledger candidate. Keep measurement and substitution research for this unallocated candidate out of active data.

## Sources and limits

Sources were checked on 2026-10-17. Proposal-local identifiers are not shared-ledger records.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-TRITICALE-GRITS-R409-20261017-S01` | MEGRO, [Products](https://megro-muehle.de/en/products/), product overview and `Triticale grits` entry; packaging FAQ. | The current product overview includes a named `Triticale grits` product in a mill serving food manufacturers. This supports an English product-form signal beyond the grain, flour, and flakes rows. | The page supplies no triticale-specific particle size, milling fraction, French name, household use, or Canadian/Québec availability. General package sizes are for the overall product range, not this item. |
| `WP02-A7-TRITICALE-GRITS-R409-20261017-S02` | Makowska, Majcher, and Mildner-Szkudlarz, “Triticale crisp bread enriched with selected bioactive additives,” *Journal of Food Science and Technology* 54 (2017), 3092–3101, [doi:10.1007/s13197-017-2745-y](https://doi.org/10.1007/s13197-017-2745-y); [open article](https://pmc.ncbi.nlm.nih.gov/articles/PMC5602972/), Materials and Methods. | Describes the study's raw material as triticale grits made by chopping hulled triticale grain and uses it for extruded crispbread. | This is a research material and specialized extrusion process, not a Québec product label or retail specification. It does not define a general particle grade, French display, household amount, or substitution. |
| `WP02-A7-TRITICALE-GRITS-R409-20261017-S03` | Office québécois de la langue française, [gruau de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais), preferred term, English term, and definition. | Provides the specific Québec French/English pair `gruau de maïs / grits` for a corn product. It shows that OQLF has grain-qualified terminology for corn grits. | It is corn-specific and gives no support for extending `gruau de` to triticale. |
| Reused: `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S05` | Office québécois de la langue française, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), 1983 technical milling/malt-crushing record. | Defines French technical *gruau* senses and the English translation *grits*; its English note says grits are ground more coarsely than flour or meal. | It is a general technical/malt entry, not a triticale product record and not authority for `gruau de triticale`. This source ID belongs to the R41 proposal, not a new ledger entry. |
| Reused: `WP03-TRITICALE-FLAKES-20261012-S04` | Office québécois de la langue française, [triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480832/triticale). | Supports the Québec French base cereal term `triticale`. | Names the cereal only; it does not name grits or another milled product. This source is already attached to the flakes ledger record. |
| Reused: `WP02-SECTION-A-TRITICALE-FLOUR-20261012-S01` | Office québécois de la langue française, [farine de triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497480/farine-de-triticale). | Supports `farine de triticale / triticale flour` as the qualified flour identity. | Names flour only; it does not provide a grits name or equivalence. This source is already attached to the flour ledger record. |

## Disposition

Keep `triticale grits` unallocated. Retain the active triticale grain, flour, and flakes identities unchanged, and keep the R41 triticale-meal hold separate. Add no candidate row, alias, form, measure, density, unit mapping, conversion, yield, recipe link, or substitution. Reopen only when a product-specific source establishes the grits boundary and a Québec-facing source supports the French display.
