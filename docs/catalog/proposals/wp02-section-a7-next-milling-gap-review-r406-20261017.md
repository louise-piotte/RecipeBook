# WP02 Section A7 R406: unqualified wheat-meal boundary recheck

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review changes no active catalog data, research ledger, plan, roadmap, recipe package, generated index, or tests.
- **Open checklist:** WP02 Section A7 still calls for review of other grain meals, including the unresolved wheat-meal candidate; see [the A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Candidate:** generic `wheat meal` and the closed spelling `wheatmeal`, kept distinct from the accepted `whole wheat meal` identity.
- **Proposal-local source IDs:** `WP02-A7-WHEAT-MEAL-R406-20261017-S01` through `S06`. They are not ledger entries.
- **Adjacent decisions:** This review retains the R22 and R104 generic-term holds. It does not reopen spring-wheat semolina (R394), barley semolina (R397), the buckwheat-semolina hold (R400), or the roasted-corn-semolina hold (R403); those identities and boundaries remain as integrated.

## Recommendation

**Keep unqualified `wheat meal` and `wheatmeal` unallocated.** Current Canadian primary sources recognize wheat meal as a human-food classification or bread ingredient but do not define one consumer milling boundary. OQLF's Québec French and English pair, `farine de blé entier brute` / `whole wheat meal`, is explicitly whole-wheat-qualified. Current manufacturer pages likewise identify whole wheat meal as whole grain and distinguish it from semolina [S01–S06].

Retain `ingredient-ref-wheat-meal` only for `whole wheat meal / farine de blé entier brute`, with its current `farine de blé complet brute` French alias. Do not add bare `wheat meal` or `wheatmeal` as aliases, create a second identity, or construct a generic Québec French display. The catalog may return the narrower whole-wheat row for the query `wheat meal` because the query is a complete phrase inside `whole wheat meal`; that search result is not evidence that the generic candidate is the same product.

## Product boundary and Québec French

The source-named whole-wheat product has a narrower boundary than a generic wheat meal. Heimatsmühle says its product is milled from whole, cleaned wheat and retains endosperm, bran, and germ; it is less finely milled than wholegrain flour and is offered in fine, medium, and coarse grades. Honeywell's manufacturer catalog lists **Whole Wheat Meal** as a whole-grain product and lists **Semolina** separately [S05, S06]. These are product-specific descriptions; they do not establish that every human-food product classified or sold as *wheat meal* shares the same kernel retention or milling grade.

OQLF's GDT gives `farine de blé entier brute` and `farine de blé complet brute` as preferred Québec French terms and lists `whole wheat meal` and `coarse whole wheat flour` as English terms. Its separate `farine de blé entier` entry defines whole-wheat flour as a milled-and-bolted product from which part of the outer bran layer may have been removed [S02, S03]. Neither entry names generic `wheat meal`. Do not infer `gruau de blé`, `gruaux de blé`, or `semoule de blé` as a generic display from dictionary, tariff, or grain-classification wording.

| Neighbor | Boundary to retain |
| --- | --- |
| `whole wheat meal / farine de blé entier brute` | Keep the existing narrow, whole-kernel product and its current French alias. Do not broaden it to bare `wheat meal` or the closed spelling `wheatmeal`. |
| Whole-wheat flour and wheat flour | Keep the flour rows separate. OQLF defines whole-wheat flour as milled and bolted wheat from which some outer bran may have been removed [S03]. |
| Cracked or coarse-ground wheat | Keep the separately named CFIA classes distinct. The CFIA definitions do not establish these names as synonyms for generic wheat meal [S01]. |
| Spring-wheat semolina | Keep `spring wheat semolina / semoule de blé tendre` from R394 distinct; its current source boundary is endosperm milling, and its French display is wheat-specific. Do not treat semolina as a generic alias for wheat meal. |
| Durum and remilled durum semolina | Keep their existing durum-qualified identities. The NAPCS exclusion of durum semolina from its wheat-meal example is a classification boundary, not a definition of all other wheat meal [S04]. |
| Barley, buckwheat, and roasted-corn semolina | Leave R397, R400, and R403 as separately reviewed grain-product decisions. Their outcomes do not establish that all `meal` or `semolina` names share a common milling specification or Québec display. |

## Live catalog, ledger, and archive audit

The audit used the live split seed package, `manifest.v1.json`, and the current catalog files. SHA-256 values identify the snapshot reviewed.

| Store | Snapshot | Ownership finding |
| --- | ---: | --- |
| Active ingredient references | 1,712 rows; SHA-256 `377899c4f71121ee543ef79abad12067808481451be6f959921dac7176758d01` | The only related active row is `ingredient-ref-wheat-meal`, displayed as `whole wheat meal / farine de blé entier brute`; its only alias is `farine de blé complet brute`. No exact active name or alias owns bare `wheatmeal` or a generic French candidate name. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form belongs to `ingredient-ref-wheat-meal`; no matching meal form was found. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No wheat-meal, wheatmeal, or wheat-groats candidate or alias was found. |
| Research ledger | 2,072 records / 9,372 source entries; SHA-256 `2798592c27b8fe3552b80526b57a712f406435765a1d410218038ca3d19956df` | No separate generic candidate record exists. The `ingredient-ref-wheat-meal` record has an accepted identity for the narrow whole-wheat product plus unresolved generic-term decisions, including R22 and R104. Its measurement and substitution states are `not_yet_researched`; it has no measurement observations or substitution findings. |
| Recipe manifest | 114 listed recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every manifest-listed file and structured ingredient row was scanned; no matching demand was found. |

The existing [R22 proposal](wp02-a7-unqualified-wheat-meal-round22-review-20261013.md) and [R104 proposal](wp02-a7-unqualified-wheat-meal-wheatmeal-boundary-review-20261014-r104.md) both hold generic wheat meal outside the active row. The later R394–R396, R397–R399, R400–R402, and R403–R405 integrated decisions add product-specific semolina distinctions but do not supply the missing generic product boundary or Québec French display.

## Phrase-first picker projection

This static projection follows the phrase-first, accent-folding search behavior in `IngredientSearch.kt`, with partial matching only when no complete phrase matches.

| Query | Current result | Boundary |
| --- | --- | --- |
| `wheat meal` | `ingredient-ref-wheat-meal` | The phrase occurs inside the display `whole wheat meal`; this does not make bare `wheat meal` an alias. |
| `wheatmeal` | None | No active exact owner. |
| `whole wheat meal`; `farine de blé entier brute`; `farine de blé complet brute` | `ingredient-ref-wheat-meal` | Exact qualified identity and its current French alternate. |
| `semoule de blé` | `ingredient-ref-durum-semolina`, `ingredient-ref-semola-rimacinata`, and `ingredient-ref-spring-wheat-semolina` | The query returns three qualified semolina identities; none is a generic wheat-meal owner. |
| `farina` | Four Italian soft-wheat flour-grade identities | Existing flour aliases own this query; do not reuse it for a generic meal. |
| `wheat farina`; `gruau de blé`; `gruaux de blé` | None | No generic wheat-meal owner is established. |

No picker or alias change is recommended.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned. The scan checked the serialized recipe files and each ingredient row for `wheat meal`, `wheatmeal`, `whole wheat meal`, wheat farina/groats/grits, `farine de blé entier brute`, `farine de blé complet brute`, `semoule de blé` and its qualified spring/durum names, `gruau(x) de blé`, and the neighboring cracked/coarse-ground wheat terms.

Results: **0 matching recipe files, 0 matching ingredient rows, and 0 links** to `ingredient-ref-wheat-meal` or the adjacent spring-wheat and durum-semolina references. The bundle provides no demand, recipe context, or recipe-line amount for the generic candidate.

## Measurements and substitutions

- CFIA lists `wheat meal` among optional grain ingredients in standardized bread, with the listed ingredients together limited to 5% of flour used for that bread class [S01]. This is a regulatory bread-formula limit, not a household measure, a generic wheat-meal specification, a conversion, or an amount-preserving substitution rule.
- Heimatsmühle's source-specific mill page gives product uses and nutrition per 100 g, but no household-volume measure, density, recipe quantity, or yield for generic wheat meal [S05]. Honeywell's separate catalog descriptions are product naming, not quantified recipe or replacement guidance [S06].
- No source reviewed for this generic candidate supports a reusable measure, density, unit mapping, cooking yield, or substitution to flour, semolina, cracked wheat, or another meal. Keep no generic ledger measurements or substitution finding.
- The existing whole-wheat-meal ledger record retains `not_yet_researched` measurement and substitution states. This proposal does not change those states or transfer generic evidence to that narrower product.

Add no forms, measures, density, unit mappings, conversions, package yields, recipe links, global substitutions, contextual substitutions, generic ledger candidate, or active reference.

## Source register

Sources were checked on 2026-10-17. Proposal-local IDs are not shared-ledger records.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Canadian Food Inspection Agency, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 12, §§12.1.6–12.1.7 and 12.2.1(h). | The bread standard lists wheat meal among permitted grain ingredients subject to a combined 5% flour-use limit; CFIA separately defines crushed/coarse-ground and cracked wheat. | The bread-ingredient line does not define wheat-meal composition or grind and gives no generic Québec French name. The 5% limit is not a substitution ratio. |
| **S02** | Office québécois de la langue française, [farine de blé entier brute (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute), updated 1984. | Preferred Québec French terms `farine de blé entier brute` and `farine de blé complet brute`; English terms `whole wheat meal` and `coarse whole wheat flour`. | Supports the qualified whole-wheat identity only; it does not name generic wheat meal. |
| **S03** | Office québécois de la langue française, [farine de blé entier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier), updated 2002. | Defines whole-wheat flour as milled and bolted wheat from which part of the outer bran layer may have been removed. | Defines whole-wheat flour, not meal or generic wheat meal. |
| **S04** | Statistics Canada, [NAPCS Canada 2022, 1821294: Grain products for human consumption, n.e.c.](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1821294&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502), modified 2026-01-08. | Lists `wheat meal (except durum semolina)` as a human-consumption classification example. | Classification evidence only; it supplies no milling specification, consumer label, measurement, or Québec French name. |
| **S05** | Heimatsmühle, [Wheat Meal Fine/Medium/Coarse](https://www.heimatsmuehle.com/en/commercial-customers/products/wheat-meal-fine-medium-coarse), current manufacturer product page. | Describes its product as whole cleaned wheat retaining endosperm, bran, and germ, less finely milled than wholegrain flour; lists fine, medium, and coarse grades and bread/muesli uses. | One German manufacturer product. It is not a Canadian generic definition and gives no household measure or general substitution. |
| **S06** | Honeywell Flour Mills, [Products](https://www.honeywellfood.com/products/), current manufacturer catalog. | Lists `Honeywell Whole Wheat Meal` as whole grain and `Honeywell Semolina` separately. | Product-line descriptions support these qualified SKUs only; they do not define generic wheat meal or a Québec display. |

## Disposition

Keep generic `wheat meal` and `wheatmeal` unallocated. Retain `ingredient-ref-wheat-meal` only as `whole wheat meal / farine de blé entier brute`, with its existing `farine de blé complet brute` alias and current catalog fields. Add no candidate, row, alias, form, measurement, conversion, yield, recipe link, or substitution. Reopen the generic candidate only if a source identifies a standalone human-food product called *wheat meal*, establishes its milling boundary apart from whole wheat meal, flour, cracked/coarse-ground wheat, and durum/spring semolina, and supports an independent Québec French name.
