# WP02 A7 — Malted Naked Oat Flour Boundary Review (R33)

- Reviewed: 2026-10-13.
- Status: Proposal only. No shared catalog, research ledger, plan, roadmap, recipe, or package file was changed.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S01` through `S07`. These IDs belong only to this proposal; they are not ledger records.
- Scope: Hodmedod's recipe term `Malted Naked Oat Flour`, assessed as a separate candidate from the already integrated Castle Oat 80 identity `roasted oat malt flour`.
- Exclusions: This does not reopen Castle Oat 80, generic `malt flour`, plain oat flour, Scottish oatmeal, R32 malted finger millet flour, R31 rice grits, or the gluten-flour equivalence decision.

## Disposition

| Candidate | Recommendation | Active identity | Boundary |
|---|---|---|---|
| `malted naked oat flour` | **Keep unresolved and unallocated.** Add no active reference, alias, legacy identity, form, measurement, recipe link, or substitution. | None proposed | Hodmedod's current recipe uses this exact name and offers it as one recipe-specific alternative to malted wheat flour. The reviewed evidence does not establish a standalone current product specification, a stable Canadian or Québec product name, or a Québec French display. Research confirms that malted flour can be made from naked oats, but its experimental batches do not identify Hodmedod's recipe ingredient or Castle Oat 80. |

Do not map this phrase to `ingredient-ref-roasted-oat-malt-flour`, generic `ingredient-ref-malt-flour`, or plain `ingredient-ref-oat-flour`. Keep it separate from Hodmedod's `Whole Malted Naked Oats` and `Malted Wheat Flakes` recipe alternatives. In particular, do not add `malted naked oat flour` as an alias on Castle Oat 80: that product is explicitly roasted and non-enzymatic, while the Hodmedod recipe gives no process or enzyme specification for its naked-oat flour.

## A7 and archive check

The active A7 checklist remains open for other malted/toasted flour identities. R30 integrated Castle Oat 80 as `roasted oat malt flour / farine de malt d'avoine torréfiée`; its proposal explicitly left Hodmedod's `Malted Naked Oat Flour` outside that product decision because no equivalence was established. The archive has no separate adjudication of this candidate. This proposal reviews that named phrase independently; it does not repeat R30's Castle decision, R31's rice-grits hold, or R32's malted finger-millet hold.

## Live ownership and picker audit

Read-only snapshot: **1,364 active references**, **100 forms**, **64 legacy candidates**, **1,691 ledger records**, and **114 manifest-listed recipes**.

| Surface | Current finding |
|---|---|
| Active references | No exact owner for `malted naked oat flour`, `malted oat flour`, `naked oat flour`, or `farine d'avoine maltée`. The current `ingredient-ref-roasted-oat-malt-flour` is `roasted oat malt flour / farine de malt d'avoine torréfiée`, with no aliases. Plain oat flour and generic malt flour remain separate active rows. |
| Ingredient forms | No form label or search term owns malted naked oats or malted oat flour. The oat forms present are oat-bran states, not flour states. |
| Legacy candidates and research ledger | No legacy candidate or separate ledger candidate owns the phrase. The current Castle Oat 80 reference's R30 source list mentions Hodmedod's recipe as evidence that the names are distinct; its decision says not to equate them. |
| Prior proposal archive | R30 is the only focused archive mention. It excludes this phrase from its Castle product decision but does not resolve it as a separate identity. No R33 source-ID prefix collision was found in the proposal and batch archives or ledger. |

The picker in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` normalizes accents and punctuation, prefers complete word phrases, then uses substring matching. The following results are static projections from the live reference and form files:

| Query | Current picker result | Boundary |
|---|---|---|
| `malted naked oat flour`; `malted oat flour`; `naked oat flour` | No result | Candidate remains unallocated. |
| `oat malt flour`; `roasted oat malt flour` | Castle Oat 80 roasted oat malt flour | Existing phrase owner; do not attach Hodmedod's distinct wording to it. |
| `farine de malt d'avoine` | Castle Oat 80 roasted oat malt flour | Current display contains this phrase before `torréfiée`; do not use it as a broad alias for the candidate. |
| `oat flour`; `farine d'avoine` | Plain oat flour | Keep the existing unqualified identity separate. |
| `farine d'avoine maltée`; `avoine nue` | No result | These possible French wordings are not sourced as Québec names for the candidate. |
| `malt flour` | Generic malt flour; roasted oat malt flour; roasted wheat malt flour; malted spelt flour | Preserve the current multi-result behavior. |

No picker or catalog change is proposed. An English-only row would leave the French picker unresolved. A guessed French phrase would also need a collision check: the current `farine de malt d'avoine` query already returns Castle Oat 80.

## Bundled recipe demand

The manifest-listed package contains **114 recipe files and 1,123 ingredient rows**. I scanned each complete recipe file and every serialized ingredient row for `malted naked oat flour`, `malted oat flour`, `oat malt flour`, `naked oat flour`, `malted naked oats`, and the French phrases `farine d'avoine maltée`, `farine maltée d'avoine`, `farine de malt d'avoine`, and `farine de malt d'avoine torréfiée`. The scan found **zero matching ingredient rows and zero full-recipe file hits**. The external Hodmedod recipe is not bundled demand; no recipe link or relink is proposed.

## Measurement and substitution limits

- Hodmedod's recipe lists `50g Malted Wheat Flour or Malted Naked Oat Flour` for one loaf. This is an author-stated, same-recipe alternative at that line only. It is not evidence of a general malted-oat-for-malted-wheat rule, nor a substitution ratio for other recipes. Do not create a global or contextual substitution rule from this one recipe.
- The 50 g amount is recipe mass, not a household volume measure, a density observation, or a reusable unit mapping. None of the reviewed exact-form sources supplies a household mass-volume pair or a cooking yield for Hodmedod's product. Keep density null and unit mappings empty if the candidate is reconsidered.
- The research papers describe controlled, study-specific malting, milling, and baking procedures. Their process details and flour percentages are not transferable to a retail product, Hodmedod's recipe ingredient, or Castle Oat 80. Do not infer a form conversion, yield, general flour replacement, or equivalent product grade.

## Sources and limits

Sources were checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S01` | Hodmedod's, [Malted Loaf](https://hodmedods.co.uk/blogs/recipes/malted-naked-oat-loaf), published 2022-06-28; introduction and ingredient line. | Names `Malted Naked Oat Flour`; gives the line `50g Malted Wheat Flour or Malted Naked Oat Flour`; explains that malted flour may affect rise and proofing. | One UK loaf recipe, not a product specification, process description, Québec name, household conversion, or general substitution rule. |
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S02` | Hodmedod's, [2022 link archive](https://hodmedods.co.uk/pages/welcome-to-the-hodmedod-link-archive-2022), June 28 entry. | The producer's own archive calls the loaf a recipe using “our Malted Naked Oat Flour and Wholegrains,” supporting that the phrase referred to its ingredient in that recipe context. | Archive wording has no ingredients, milling process, package, current availability, or French display. |
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S03` | Hodmedod's, [current Organic collection](https://hodmedods.co.uk/collections/organic), visible product entries for “Naked Oats, Organic Wholegrain” and “Malted Wheat Flakes, Organic.” | The current collection page distinguishes the whole naked-oat grain and malted wheat flakes as separate products in the displayed listing. | The page is a dynamic collection with “Load More”; its visible entries are not proof that no other current product exists, and it gives no malted-naked-oat-flour specification. |
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S04` | Ninfali et al., [In vitro bioaccessibility of avenanthramides in cookies made with malted oat flours](https://academic.oup.com/ijfst/article/54/5/1558/7805526), Methods, malting/milling procedure and cookie preparation. | Uses naked oats (cultivar Luna), a specified five-day malting procedure, and flour milled at a stated sifting rate and sieve size; compares experimental cookies made with malted-oat flour against plain-oat flour. | A particular experimental cultivar and process, not a Hodmedod or retail product specification. Its formulation is research context, not a general substitution recommendation or household measure. |
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S05` | [Evaluation of the Possibilities of Using Oat Malt in Wheat Breadmaking](https://www.mdpi.com/2076-3417/14/10/4101), Methods §2.1.2 and breadmaking results. | Makes oat malt flour from naked oat grain on a microtechnical scale using a barley-malting procedure; studies malted/scalded oat-flour use in wheat bread. | Study-specific grain and treatment. Its bread formulation/performance does not establish a commercial grade, identify Hodmedod's flour, or provide a transferable substitution ratio. |
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S06` | Office québécois de la langue française, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine), definition, note, and preferred term (2017). | Defines `farine d'avoine` as flour milled from whole or non-whole oat grains and supports the Québec base term for oat flour. | Does not name a malted-oat flour or validate a French display for the candidate. |
| `WP02-A7-MALTED-NAKED-OAT-FLOUR-20261013-R33-S07` | Government of Canada Translation Bureau, [TERMIUM Plus: malt flour](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=CEREAL+PREPARATION), record dated 2011-02-18, English/French terms and definition. | Pairs English `malt flour` / `malted cereal flour` with French `farine maltée`; its definition specifies flour from malted wheat or barley. | Does not include oat malt in that definition and does not validate an oat-specific or Québec retail name. |

## Next action

Keep `malted naked oat flour` as an unresolved, unallocated A7 candidate. Reopen for an identity-only row only when a current product or technical source defines the exact food-flour product, a defensible Québec French display is supported, and the evidence distinguishes it from Castle's roasted, non-enzymatic oat malt flour. Research measurement and substitution separately if a bundled recipe later requests the exact product.
