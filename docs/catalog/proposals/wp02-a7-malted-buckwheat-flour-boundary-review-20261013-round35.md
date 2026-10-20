# WP02 A7 — Malted Buckwheat Flour Boundary Review (R35)

- Reviewed: 2026-10-13.
- Status: Proposal only. No shared catalog, research ledger, plan, roadmap, recipe, or package file was changed.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S01` through `S06`. These IDs belong only to this proposal; they are not ledger records.
- Scope: the candidate ingredient called `malted buckwheat flour` in research and recipes. This review does not reopen buckwheat meal (R23), sprouted buckwheat flour (A6), malted finger millet flour (R32), malted naked oat flour (R33), malted maize flour (R34), Castle Oat 80 roasted oat malt flour (R30), or the prior gluten-flour equivalence decision.

## Disposition

| Candidate | Recommendation | Active identity | Boundary |
|---|---|---|---|
| `malted buckwheat flour` | **Keep unresolved and unallocated.** Add no active reference, alias, legacy identity, form, measurement, recipe link, or substitution. | None proposed | Current Québec sources establish food-grade malted buckwheat and a general coarse-to-extra-fine/custom-milling capability. They do not identify a malted-buckwheat flour SKU, an item-specific fine grind/specification, or its Québec French product label. Research and an external bakery recipe show that malted buckwheat flour is a real baking ingredient, but do not establish that it is the same product as the Québec maker's grain. |

The source-supported English research/recipe wording is `malted buckwheat flour`. `Farine de sarrasin` is the OQLF-preferred Québec base term, and the local maker names its food product `Sarrasin malté`; `farine de sarrasin malté` is therefore a plausible descriptive construction, but none of the reviewed Québec sources uses it as the exact flour product name. Do not activate that construction or use `sarrasin malté` as an alias on a flour row until the maker confirms the product and Québec French display.

Keep the candidate distinct from `buckwheat flour / farine de sarrasin`, `sprouted buckwheat flour / farine de sarrasin germé`, whole `malted buckwheat / sarrasin malté`, and generic `malt flour / farine maltée`. Do not treat the several buckwheat malt grain variants as interchangeable flour feedstocks: the Québec product list distinguishes naked germinated/malted buckwheat, hull-on germinated/malted buckwheat, and unqualified malted buckwheat.

## A7 and archive check

The active checklist at [the A7 line](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) remains open for other grain meals, other malted/toasted flour identities, and gluten-flour equivalence. R32–R34 review malted finger millet, malted naked oat, and malted maize flour. The focused archive has no adjudication of malted buckwheat flour. The A6 [sprouted-buckwheat flour review](wp02-a6-sprouted-buckwheat-flour-identity-review-20261012.md) expressly excluded malted buckwheat because its then-reviewed sources did not support extending the sprouted identity; it did not decide a malted flour. The WP03 [sprouted-buckwheat grain review](wp03-section-f-next-gap-review-20261012-round9.md) keeps malted buckwheat separate from the dried sprouted grain, not as a flour resolution. R23 holds `buckwheat meal` over a separate flour-versus-coarse-grind naming problem and is not reopened here.

## Live ownership and picker audit

Read-only snapshot before R35 integration: **1,365 active references**, **100 forms**, **64 legacy candidates**, **1,697 research-ledger records**, **114 manifest-listed recipe files**, and **1,123 ingredient rows**. The five R33/R34 candidates had been integrated since the initial proposal snapshot.

| Surface | Current finding |
|---|---|
| Active references | No exact owner for `malted buckwheat flour`, `buckwheat malt flour`, `malted buckwheat`, or `farine de sarrasin malté(e)`. Neighboring owners are `ingredient-ref-buckwheat-flour` (`buckwheat flour / farine de sarrasin`), `ingredient-ref-sprouted-buckwheat-flour` (`sprouted buckwheat flour / farine de sarrasin germé`), `ingredient-ref-sprouted-buckwheat` (dried whole grain), and `ingredient-ref-malt-flour` (`malt flour / farine maltée`). Malted barley, wheat, rye, and spelt flours and roasted oat/wheat malt flours have separate identities. None is an exact owner for the candidate. |
| Forms and legacy candidates | No form label or match term, and no legacy candidate, owns an exact candidate phrase. No buckwheat flour form is active. |
| Research ledger | No exact candidate flour record exists. The sprouted-buckwheat grain record mentions malted buckwheat only as a distinct excluded product; it does not establish flour ownership, a product specification, or a flour name. |
| Proposal/source-ID archive | The focused archive has no malted-buckwheat-flour decision, and the `R35` source-ID prefix was absent from proposals, batches, and the live research ledger before this proposal. |

The picker in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` normalizes accents and punctuation, prefers complete word phrases, and then falls back to substring matches. Static projections from the live references and forms are:

| Query | Current result | Consequence if a row were added later |
|---|---|---|
| `malted buckwheat flour`; `malted buckwheat`; `buckwheat malt flour`; `sarrasin malté`; `farine de sarrasin malté(e)` | No result | The candidate currently has no picker owner. |
| `buckwheat flour`; `farine de sarrasin` | Plain buckwheat flour and sprouted buckwheat flour | A new row named `malted buckwheat flour / farine de sarrasin malté` would create a third result for each broad phrase. |
| `malt flour` | Generic malt flour, roasted oat malt flour, roasted wheat malt flour, malted spelt flour | Preserve the distinct cereal-specific identities; do not attach buckwheat wording to generic `malt flour`. |

No picker change is proposed. In particular, the source's grain display `sarrasin malté` is not an alias for a hypothetical flour: that would collapse the grain and milled product distinction. Do not add the unverified candidate phrase to the generic buckwheat-flour row.

## Bundled recipe demand

I scanned every manifest-listed recipe JSON file and serialized ingredient row for `malted buckwheat flour`, `malted buckwheat`, `buckwheat malt flour`, `buckwheat malt`, `farine de sarrasin malté(e)`, `sarrasin malté`, and the broader `buckwheat` and `sarrasin` terms. The 114-file, 1,123-row bundle contains **zero matching recipe files and zero matching ingredient rows**. No recipe link, relink, or import alias is supported by bundled demand.

An external Lost Bread Co. recipe page lists 100 g malted buckwheat flour in a pie crust and 75 g sifted malted buckwheat flour in a four-serving crêpe recipe [S06]. This establishes a specific English recipe use, not demand in this bundle or a Canadian/Québec product specification.

## Measurement, density, and substitution limits

- The Lost Bread recipes give mass-only amounts (100 g and 75 g); neither gives a household-volume equivalent. Keep those figures as recipe-specific observations only. They do not establish density, a reusable unit mapping, or a measure for another producer or grind.
- The 2026 steamed-bread study investigates 10–50% malted-buckwheat-flour addition levels and reports quality findings for its own wheat-dough process [S05]. These are study-specific formulation results, not a household conversion or a general buckwheat-flour-for-wheat-flour substitution rule. The abstract does not justify a transferable replacement ratio.
- No reviewed source tests the exact Québec maker's product as a replacement for ordinary buckwheat flour, wheat flour, generic malt flour, or another malted cereal flour. Add no density, unit mapping, form conversion, yield, or directed/contextual substitution rule.

## Sources and limits

Sources were checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S01` | Malterie Caux-Laflamme, [Aliments](https://malteriecauxlaflamme.com/aliments/) and [Food](https://malteriecauxlaflamme.com/en/food/), buckwheat food-product list and formats section. | A current Québec producer lists `Sarrasin malté` as well as distinct naked and hull-on germinated/malted buckwheat products; it says its grains/cereals are grown in Québec. The page says cereals are offered whole, crushed, or ground coarse-to-extra-fine. The English page renders the unqualified product as `Malted buckwheat`. | The format statement is general and does not name a malted-buckwheat flour SKU, exact flour grind, variety/species, hull state for the unqualified item, technical specification, or packaged retail product. The page's `Sarrasin nue germé séché` label has a grammatical agreement error; it is not adopted. |
| `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S02` | Malterie Caux-Laflamme, [Sarrasin malté](https://malteriecauxlaflamme.com/sarrasin-malte-2/), product title and description. | Confirms the named Québec malted-buckwheat food product and describes its firm, slightly crunchy texture and uses in specialty breads, granola, bars, and other preparations. | The page describes the malted buckwheat product, not a milled flour. It gives no flour grade, ingredient declaration, package, quantity, density, or flour substitution. |
| `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S03` | Malterie Caux-Laflamme, [Nos services](https://malteriecauxlaflamme.com/nos-services/), “Mouture personnalisable.” | Says the Québec producer offers custom milling according to customer needs, performed near delivery for freshness. | Establishes milling capability, not that the unqualified malted-buckwheat product has been milled into a defined consumer flour or that a particular fine grind is available for it. |
| `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S04` | Office québécois de la langue française, [farine de sarrasin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin), preferred term and English equivalent; updated 1984. | Supports the Québec base term `farine de sarrasin` and English `buckwheat flour`. | Does not establish a malted-buckwheat flour product label or validate the compound `farine de sarrasin malté`. |
| `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S05` | Song et al., [Effects of malted buckwheat addition level on wheat dough rheology and steamed bread quality](https://link.springer.com/article/10.1007/s11694-026-04719-7), *Journal of Food Measurement and Characterization*, published 2026-07-17, DOI `10.1007/s11694-026-04719-7`; abstract. | A primary research article uses the exact phrase `malted buckwheat flour` and studies its addition to wheat dough/steamed bread. | One research product/process; the abstract's 10–50% addition levels and quality findings do not identify a Québec product, commercial flour grade, household measure, or general substitution ratio. |
| `WP02-A7-MALTED-BUCKWHEAT-FLOUR-20261013-R35-S06` | Lost Bread Co., [Zines & Recipes](https://www.lostbreadco.com/zine), “Buckwheat Pie Crust” and “Buckwheat Crepes” ingredient lists. | Uses 100 g `Malted buckwheat flour` in pie crust and 75 g `sifted malted buckwheat flour` in a crêpe recipe stated to make four servings. | An external bakery recipe source; it does not identify the flour maker, local availability, exact species/hull or process, Québec French name, or a volume measure. The amounts apply only to those recipes. |

## Next action

Keep the candidate inactive and unallocated. Ask Malterie Caux-Laflamme whether its current `Sarrasin malté` food product is offered ground fine/extra-fine for culinary use; request the exact grain species/variety, hull state, processing and ingredient specification, and the product's English and Québec French name. If the maker confirms a distinct flour product, obtain independent Québec French review before adding an identity-only `FLOUR_AND_STARCH` row. Recheck picker behavior because the candidate would broaden both `buckwheat flour` and `farine de sarrasin`. Review measurements and substitutions only with exact-form, recipe-relevant evidence.
