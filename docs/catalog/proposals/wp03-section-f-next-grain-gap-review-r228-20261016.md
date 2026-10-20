# WP03 Section F — cracked sorghum identity boundary review (R228)

## Review record

- **Reviewed:** 2026-10-16.
- **Scope:** The unallocated food-grain phrase **cracked sorghum**, with Québec French product wording **sorgho concassé**. This is a standalone-identity boundary review, not a review of a sorghum-flake product or a proposal to add a form to whole grain sorghum.
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, or checklist data was changed.
- **Disposition:** Keep the candidate unallocated pending evidence that distinguishes the label phrase from existing sorghum grits and semolina. Do not add an active reference, alias, form, measure, recipe link, conversion, yield, or substitution.
- **Open checklist:** Section F still has remaining grain and processed-grain coverage open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L528) and its current continuation; the recent [R217 cereal review](wp03-section-f-next-cereal-gap-review-r217-20261016.md) also records that the Section F parent remains open.

This is a dedicated review of a real, unowned label phrase, not a reopening of an earlier accepted or held `cracked sorghum` candidate. The archive does mention cracked sorghum as a component and says to keep it separate from flakes, but those are product-boundary notes: they allocate no reference or candidate ID and make no standalone identity decision. The earlier [sorghum-flakes review](wp03-section-f-next-grain-product-review-20261011.md) and [R226 recheck](wp03-section-f-white-sorghum-poha-boundary-recheck-r226-20261016.md) remain closed at their stated scopes. R220 canjiquinha is also outside this review.

## Evidence and bounded decision

Current Canadian product evidence identifies **Cracked Sorghum** as an ingredient in Country Harvest's 14-grain bread blend. A current Québec-facing Provigo listing for the Bon Matin 14-cereal bread uses **sorgho concassé** in its French ingredient declaration, and the Québec Food Directory's product record describes the same local bread. Puratos Canada's current Softgrain Treize listing also names cracked sorghum separately among the ready-to-use mix's other grain and seed ingredients [S01–S04]. These sources establish current human-food ingredient wording and a Québec French phrase. They do **not** describe a standalone retail sorghum product.

The remaining question is the product class. FAO's human-food processing chapter describes sorghum grain being pounded, crushed, or ground, sometimes after hull or bran removal, to produce coarse grits or fine flour [S05]. The component labels do not state whether their `cracked sorghum` is intact whole grain broken into large pieces, a decorticated fraction, a coarse-milled product equivalent to grits, or another screened grade. They give no particle-size, hull-removal, or preparation specification. The category word `cracked` alone cannot establish that this is separate from the already active **sorghum grits / gruau de sorgho** identity or from **sorghum semolina / semoule de sorgho**.

OQLF's base entry supports **sorgho** as the Québec French name for sorghum; it does not establish a standardized standalone term or processing class for `sorgho concassé` [S06]. The term **gruau de sorgho** is already owned by the active sorghum-grits row, and Québec/Canadian terminology references leave distinctions around “grits” and “groats” source-specific [S07]. Assigning `sorgho concassé` as a new active name or an alias to grain sorghum, sorghum grits, or sorghum semolina would therefore claim a product relationship that the reviewed label evidence does not define.

| Candidate wording or neighbor | Recommendation | Evidence boundary |
|---|---|---|
| `cracked sorghum` / `sorgho concassé` | Keep as an unallocated research candidate. Do not reserve `ingredient-ref-cracked-sorghum` or create `candidate-cracked-sorghum` in shared data. | Current Canadian and Québec product pages use the phrases as blend components, but do not identify a separately sold product or define its particle size, hull state, or milling process. |
| `grain sorghum / sorgho à graine` | Keep the whole-kernel identity unchanged. | The active reference is a broad grain identity; component labels do not establish that “cracked” is a form of whole grain or define the point at which the source product leaves the whole-kernel scope. |
| `sorghum grits / gruau de sorgho` | Keep the active row and its exact French name unchanged. Do not alias `cracked sorghum` or `sorgho concassé` to it. | FAO documents coarse-grit production from sorghum, while the blend labels do not distinguish a cracked grain from a grits product. The existing name is an exact active owner. |
| `sorghum semolina / semoule de sorgho` | Keep the active row unchanged. Do not alias the candidate to it. | Semolina is an existing processed-grain identity; none of the Canadian labels specifies a semolina or rava process. |
| `sorghum flour`, `sorghum starch`, `puffed sorghum`, sorghum flakes, sprouted grain, and cereal blends | Keep outside the candidate. | They are already distinct rows, other processing questions, or composite products. The current blend declarations do not imply ingredient links or equivalence. |
| `cracked grain sorghum`, `cracked sorghum grain`, `cracked jowar`, `sorghum chops`, `sorghum groats`, `sorghum dalia/daliya`, `sorghum grits`, and `gruau de sorgho` | Do not add as aliases. | No reviewed current Canadian/Québec product source establishes these as equivalent names for the component phrase. Some collide directly with existing sorghum-grits or semolina terminology. |

If a future review accepts a distinct standalone identity, it would likely be in `GRAIN_AND_CEREAL`, with no aliases or attached form until further product evidence exists. That conditional shape is not a recommendation to integrate now.

## Exact ownership, archive, and picker audit

The read-only snapshot contains **1,619 active ingredient references**, **122 forms**, **61 legacy-import candidates**, and **1,964 research-ledger records**. Exact normalized-key checks used the app's case-, punctuation-, accent-, and ligature-folding search rule from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Surface | Result |
|---|---|
| Active reference IDs, names, and aliases | No exact owner for `cracked sorghum`, `sorgho concassé`, `cracked grain sorghum`, `cracked jowar`, `sorghum chops`, `sorghum groats`, `ingredient-ref-cracked-sorghum`, or `candidate-cracked-sorghum`. The active neighbors are `ingredient-ref-grain-sorghum`, `ingredient-ref-sorghum-grits`, `ingredient-ref-sorghum-semolina`, `ingredient-ref-sorghum-flour`, `ingredient-ref-puffed-sorghum`, and `ingredient-ref-sorghum-starch`. |
| Active forms | No sorghum/sorgho form, label, or match term is present. There is no cracked-grain form under `ingredient-ref-grain-sorghum` or another reference. |
| Legacy-import identities | None of the exact candidate phrases or IDs appears among the 61 legacy candidates. |
| Research ledger | No dedicated `ingredient-ref-cracked-sorghum` or `candidate-cracked-sorghum` record or decision exists. The phrase occurs in the existing `candidate-sorghum-flakes` boundary text and source `WP03-SORGFLAKE-20261011-S06` only. |
| Proposal and batch archive | No focused accepted or held cracked-sorghum identity review was found. Earlier mentions are limited to keeping cracked sorghum separate from flakes and citing it as a grain-mix component. |
| Source-ID and URL ownership | The Country Harvest and Provigo product URLs and `WP03-CRACKEDSORG-R228-20261016-S01` / `S02` are absent from the current ledger and proposal/batch archive. The two IDs are proposal-local and unallocated. Reuse existing source IDs for Puratos, the Québec Food Directory, FAO, OQLF, and TERMIUM; do not mint duplicate IDs for those URLs. |

### Current picker collisions

The source search implementation first returns complete phrase matches across names, aliases, and forms, then falls back to substring matching. Static results from the active JSON are:

| Query | Current results |
|---|---|
| `cracked sorghum`; `sorgho concassé` | No result. |
| `sorghum`; `sorgho` | Six each: whole grain sorghum, puffed sorghum, sorghum flour, sorghum grits, sorghum semolina, and sorghum starch. |
| `sorghum grits`; `sorghum grit`; `gruau de sorgho` | `ingredient-ref-sorghum-grits` only. |
| `sorghum semolina`; `semoule de sorgho` | `ingredient-ref-sorghum-semolina` only. |
| `grits` | Four: attiéké, corn grits, hominy grits, and sorghum grits. |
| `gruau` | Six: hominy grits, oat groats, raw buckwheat groats, rye meal, Scottish oatmeal, and sorghum grits. |

An active `cracked sorghum / sorgho concassé` row would make those two exact candidate queries resolve, and broad `sorghum` and `sorgho` queries would each gain a seventh result. The broad results would be expected, but the candidate's relationship to the grits and semolina rows would remain unclear. Do not add aliases that reroute the existing exact `sorghum grits`, `gruau de sorgho`, or `sorghum semolina` queries.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned using normalized candidate spellings, including `cracked sorghum`, `sorgho concassé`, `cracked grain sorghum`, `cracked jowar`, `sorghum chops`, `sorghum groats`, `sorghum grits`, `sorghum semolina`, and the broader `sorghum`, `sorgho`, and `jowar` terms. The scan found **zero matching files and zero matching ingredient rows**. No recipe link or recipe-text change is supported.

## Forms, measures, yields, and substitutions

- **Forms:** Add none. The current sources do not establish `cracked` as a state of a specific active reference, and the candidate may instead be a separate milling product. No dry/cooked or prepared form is supported.
- **Density and unit mappings:** No candidate-specific mass-to-volume evidence exists. Country Harvest reports 2 slices (80 g) for the complete finished bread; Provigo reports a bread portion of 2 slices (85 g); neither amount measures the sorghum component. Puratos' 16.5 kg specification is for the complete Softgrain Treize mix. Do not turn any of these product amounts into a cracked-sorghum serving, density, or mapping.
- **Preparation and yield:** No source gives a recipe preparation method or cooking yield for the grain component. FAO's milling and recovery descriptions concern processing operations, not a transferable household cooking yield or dry-to-cooked relation.
- **Conversions:** Add no grain-to-grits, grain-to-semolina, or cracked-to-cooked conversion. No source defines the underlying product grade or a quantified crosswalk.
- **Substitution:** Add no substitution to grain sorghum, sorghum grits, semolina, another cereal, or a bread-blend ingredient. Component co-occurrence and similar grain roles do not establish an amount-qualified, method-scoped replacement.

## Source register

Sources were reviewed on 2026-10-16. Newly assigned IDs below are local to this proposal only; they are not shared-ledger allocations. Existing source IDs are reused where the URL was already recorded.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-CRACKEDSORG-R228-20261016-S01` | Country Harvest, [Sans Sucre Ajouté 14 Grains](https://countryharvest.com/products/14-grains-no-sugar-added/), current product ingredient list and nutrition panel. | The current Canadian manufacturer's product page lists `Cracked Sorghum` within a whole-grain and seed mix, separately from cracked wheat and rye and from buckwheat grits. It supports the English ingredient phrase in a finished bread; it does not identify a standalone product, specify the sorghum component's share or process, or provide a sorghum measure. Its 2-slice (80 g) label amount belongs to the bread. |
| `WP03-CRACKEDSORG-R228-20261016-S02` | Provigo, [Pain avec grains entiers 14 céréales — Bon Matin, 595 g](https://www.provigo.ca/fr/pain-avec-grains-entiers-14-c-r-ales/p/21693797_EA), current French product listing and ingredient statement. | The French listing names `Sorgho Concassé` within the cereal blend, describes the bread as prepared in Québec, and gives a finished-bread portion. The current indexed page text was available during review; opening the page directly returned no readable lines. The label is evidence for Québec ingredient wording, not a standalone sorghum product or measurement. |
| Reused `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S06` | Gouvernement du Québec, [Répertoire des aliments québécois: Bon Matin 14 céréales](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207424). | The same Québec bread SKU and its French ingredient declaration appear in the current indexed product record. This source ID was previously cited for `triticale concassé`; reuse it for the same product page rather than assign a duplicate. The record confirms the finished Québec bread context; it does not independently define the sorghum component. |
| Reused `WP03-SORGFLAKE-20261011-S06` | Puratos Canada, [Softgrain Treize](https://www.puratos.ca/en/products/Softgrain-Treize), ingredient statement and product specification. | The current manufacturer page names cracked sorghum as one of the ingredients in the ready-to-use bakery mix. It is B2B evidence for an ingredient-list term, not a standalone consumer product or a sorghum-specific amount. Its ledger record is attached to the earlier sorghum-flakes boundary review. |
| Reused `WP03-SORGHUM-GRITS-20261013-S03` | FAO, [Sorghum and millets in human nutrition, processing chapter](https://www.fao.org/4/T0818e/T0818E09.HTM), traditional and industrial sorghum processing. | Describes grain crushing/ground particle reduction to coarse grits or fine flour, and notes that hull or bran removal may occur in processing. This supports the class-boundary concern; it does not define the Canadian blend component named cracked sorghum or equate it with grits. |
| Reused `WP03-SORGFLAKE-20261011-S01` | Office québécois de la langue française, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | Supports the base Québec French term `sorgho` for the sorghum plant/grain. It does not establish a preferred standalone name or processing definition for `sorgho concassé`. |
| Reused `WP03-SORGHUM-GRITS-20261013-S01` and `S02` | OQLF, [gruau de sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18062438/gruau-de-sorgho); Translation Bureau, [TERMIUM Plus: gruau de sorgho](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SORGO). | These existing catalog sources support the active sorghum-grits terminology and the need to preserve that exact owner. They do not establish that every product labelled cracked sorghum is grits or that it is a whole-kernel product. |

## Recommendation and reopen conditions

**Hold `cracked sorghum` / `sorgho concassé` as an unallocated Section F identity candidate.** Current Canadian and Québec food-product labels make the phrase source-verifiable as a grain component, but the reviewed products are blends and leave the component's size and milling state unspecified. The evidence does not show whether it is the same kind of coarse product as active sorghum grits, another semolina-like granulation, or simply broken whole kernels. No bundled recipe needs it, and no reusable measures, forms, yield, or substitution is supported.

Reopen only when a current Canadian/Québec standalone human-food product or authoritative product specification establishes the processing state and a defensible relationship to sorghum grits and semolina, with a product-matched French name. At that point rerun exact ownership, picker, and corpus audits before deciding whether the evidence supports a separate identity, an alias, or no catalog change. Do not infer an active identity, alias, or form from the current blend ingredient statements alone.
