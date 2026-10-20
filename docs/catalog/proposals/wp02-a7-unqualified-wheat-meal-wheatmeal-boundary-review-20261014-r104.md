# WP02 Section A7: unqualified wheat meal / wheatmeal boundary recheck (R104)

## Review record

- **Review date:** 2026-10-14
- **Candidate spellings:** `wheat meal` and `wheatmeal`
- **Disposition:** **Hold both spellings unresolved.** Keep the existing whole-wheat-meal identity narrowly scoped; add no active reference or alias.
- **Status:** Integrated hold. The root added nine source records and one unresolved decision to the existing `ingredient-ref-wheat-meal` ledger record; no active identity or alias was added.
- **Question:** Does current Canadian evidence establish one culinary product boundary and a Québec French name for unqualified `wheat meal`, including the closed spelling `wheatmeal`?

## Recommendation

Keep the generic candidate unresolved and out of the active reference and alias sets. The current Canadian sources use `wheat meal` in food regulation and grain classifications, but they do not specify one consumer milling product. The current Canadian tariff gives a real *customs* boundary for the combined heading “groats and meal”: fragmented cereal products of non-corn cereals must meet a 95%-through-1.25-mm sieve criterion. The same heading groups groats and meal together, however, and does not specify the wheat kernel fractions, recipe use, or a Québec consumer name. That classification cannot resolve a culinary identity by itself.

Do not treat `wheatmeal` as an alias of the accepted `whole wheat meal` reference. Current English dictionaries record the closed spelling as a broad flour term, without a Canadian milling specification; Cambridge’s entry describes brown flour containing some, but not all, of the wheat grain’s outer and central parts. This does not establish that every `wheatmeal` label means the whole-kernel product already in the catalog. No Québec source found in this recheck assigns a French name to generic `wheat meal` or `wheatmeal`.

The existing `ingredient-ref-wheat-meal` remains the narrower **whole wheat meal / farine de blé entier brute** identity, with **farine de blé complet brute** as its French alternate. This decision is consistent with the earlier product-boundary reviews and the 2026-10-13 R22 ledger refresh; see the [2026-10-11 product-boundary review](wp02-a7-wheat-meal-current-product-boundary-review-20261011.md), the [R22 recheck](wp02-a7-unqualified-wheat-meal-round22-review-20261013.md), and the [R22 integration record](../batches/wp02-wp03-wp04-round22-gap-review-integration-20261013/README.md). At proposal time, the [catalog plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt) and [roadmap summary](../../../roadmap.md) left unqualified wheat meal unresolved; the R104 hold is now recorded there.

## Identity and naming boundary

| Phrase or nearby identity | Evidence and scope | Disposition |
| --- | --- | --- |
| `whole wheat meal` | The current Honeywell manufacturer catalogue labels its product **Whole Wheat Meal** and **Whole Grain** and lists semolina separately. A current Canadian retailer describes its Honeywell item as 100% whole wheat, finely milled, and prepared as a swallow; it was marked sold out at review time. These support that qualified product only. | Retain the active identity unchanged. |
| `farine de blé entier brute` / `farine de blé complet brute` | OQLF’s 1984 terminology record lists both as preferred French terms and gives `whole wheat meal` and `coarse whole wheat flour` as English equivalents. It is terminology support for the qualified whole-wheat term, not a generic wheat-meal standard. | Retain the existing French display and alternate. Do not broaden their scope. |
| `wheat meal` | CFIA lists wheat meal as a possible bread ingredient without defining it in that provision. Statistics Canada’s NAPCS Canada 2022 classification (modified 2026-01-08) places “wheat meal (except durum semolina)” among human-consumption grain products n.e.c. and excludes wheat meal from the wheat-flour subclass. These classify a recognized product family, not one milling specification. | Keep unresolved and inactive. Do not add as an alias to the whole-wheat row. |
| `wheatmeal` | Oxford gives a broad flour sense (“uses more of the grain than white flour”); Cambridge gives a broad brown-flour sense that may contain some but not all of the outer and central wheat-grain parts. Neither is a Canadian product standard or Québec display source. | Keep unresolved. Do not alias to `whole wheat meal` or invent a French equivalent. |
| `gruaux et semoules de froment (blé)` / `semoule de blé` | The French Customs Tariff groups wheat groats and meal collectively under `gruaux et semoules`. This is customs wording, not an isolated Québec retail name. `semoule de blé` also overlaps active durum-semolina searches. | Do not add as a generic French display or alias. |
| Whole-wheat flour, cracked/coarse-ground wheat, wheat groats, and durum semolina | CFIA defines whole-wheat flour, crushed/coarse-ground wheat, and cracked wheat separately; the tariff separates flour headings from its groat/meal heading. The active catalog also keeps wheat flour, whole-wheat flour, durum semolina, and remilled durum semolina distinct. | Keep separate; do not infer synonyms from shared wheat source or tariff grouping. |

The tariff’s 1.25-mm rule is the useful new boundary check: it confirms that the unqualified trade term has a size-based customs context. It still groups `groats` and `meal`, does not identify a whole-kernel versus refined wheat fraction, and does not give a recipe-facing Québec product name. No threshold from a tariff classification is proposed as an ingredient value or kitchen grind specification.

## Catalog, picker, ledger, and recipe audit

At review time, the split package contained **1,442 ingredient references** and **105 forms**; the research ledger contained **1,782 records**, and `legacy-import-identities.v1.json` contained **63 candidates**. The only active wheat-meal owner is `ingredient-ref-wheat-meal`:

| Field | Current value |
| --- | --- |
| English display | `whole wheat meal` |
| French display | `farine de blé entier brute` |
| English aliases | none |
| French aliases | `farine de blé complet brute` |
| Category | `FLOUR_AND_STARCH` |
| Default density / unit mappings | `null` / empty |

No active reference, alias, form term, or legacy candidate has exact spelling `wheatmeal`. At review time, the existing ledger record had 25 sources and five decisions: it is verified for the accepted narrow identity and retains a separate unresolved decision for bare `wheat meal`. Do not create a duplicate ledger or legacy candidate.

The current picker normalizes accents and punctuation, prefers complete word phrases, then falls back to substring matching. A static projection over the live names, aliases, and form terms gives:

| Query | Current result | Interpretation |
| --- | --- | --- |
| `whole wheat meal` | `ingredient-ref-wheat-meal` | Exact qualified identity. |
| `wheat meal` | `ingredient-ref-wheat-meal` | The phrase occurs inside `whole wheat meal`; this overlap does not resolve generic wheat meal. |
| `wheatmeal` | no result | No active exact or partial owner for the closed spelling. |
| `farine de blé entier brute` / `farine de blé complet brute` | `ingredient-ref-wheat-meal` | Exact qualified French names. |
| `semoule de blé` | `ingredient-ref-durum-semolina`; `ingredient-ref-semola-rimacinata` | Existing durum-semolina overlap; do not assign this generic alias. |
| `wheat groats` | raw and roasted buckwheat-groats references | Substring fallback within `buckwheat groats`, not a wheat-groats identity. |

The current manifest lists **114 recipes / 1,123 ingredient rows**. A case-insensitive search of all manifest-listed recipe files and ingredient rows found **zero** matches for `wheat meal`, `wheatmeal`, `whole wheat meal`, `whole grain wheat meal`, wheat groats/grits, cracked or coarse-ground wheat, and the relevant French candidate terms. There is no recipe demand or recipe link that supports selecting a broader boundary.

No forms or substitution rules refer to `ingredient-ref-wheat-meal`; its default density is null and unit-mapping list is empty. The package-yield data has no wheat-meal reference. No exact-product household measure, density, conversion, package yield, or substitution evidence was established for the unresolved generic candidate. Keep all such behavior absent; do not transfer values from the qualified whole-wheat product, wheat flour, semolina, or trade rules.

## Exact proposed disposition

1. Keep unqualified `wheat meal` and `wheatmeal` unresolved and inactive. Do not add either as an alias to `ingredient-ref-wheat-meal`.
2. Retain `whole wheat meal / farine de blé entier brute`, with the existing `farine de blé complet brute` French alternate, unchanged.
3. Do not assign generic French `gruau(x) de blé`, `semoule de blé`, `gruaux et semoules de froment (blé)`, or a translated form invented from tariff wording. Do not add `coarse whole wheat flour` as an English alias: the OQLF term overlaps the whole-wheat-flour picker search.
4. Add no reference, form, alias, recipe link, measure, density, unit mapping, conversion, yield, or substitution. If this hold is integrated, add the source records and a new unresolved decision to the existing `ingredient-ref-wheat-meal` ledger record; keep its verified identity state scoped to the active whole-wheat-meal row and create no duplicate candidate.
5. Reopen only when a Canadian or Québec-facing producer, product label, or authority supplies a standalone generic product boundary and independently supported Québec French wording that distinguish it from whole wheat meal, whole-wheat flour, cracked/coarse-ground wheat, wheat groats, and durum semolina.

## Proposal-local source register

All web pages below were accessed on **2026-10-14**. Source dates are noted where the publisher provides them. Findings are limited to the evidence stated in each row.

| Source ID | Source and date | Finding and limit |
| --- | --- | --- |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S01 | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), page modified 2025-05-01; Volume 12, sections 12.1.3, 12.1.6–12.1.7, and 12.2.1(h). | Lists wheat meal as a possible bread ingredient without defining it there. Separately defines whole-wheat flour and crushed/coarse-ground and cracked wheat with composition or sieve criteria. No equivalence is inferred. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02 | CBSA, [Customs Tariff T2026-2, Chapter 11 (English)](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html), 2026 edition; heading 11.03 and Note 3. | Groups wheat products under “Groats and meal: of wheat.” For heading 11.03, defines groats and meal collectively as fragmented cereal grains, with at least 95% of non-corn cereal product by weight passing a 1.25-mm sieve. A tariff class, not a culinary or whole-kernel definition. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S03 | ASFC, [Tarif des douanes T2026-2, chapitre 11 (français)](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html), 2026 edition; heading 11.03 and Note 3. | Uses collective `gruaux et semoules` for the wheat groat/meal heading and the same 1.25-mm classification rule. It does not identify an isolated Québec French name for generic wheat meal. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S04 | Statistics Canada, [NAPCS Canada 2022, 1821294: Grain products for human consumption, n.e.c.](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1517204&D=1&Function=getVD&MLV=6&TVD=1517136&db=IMDB), modified 2026-01-08. | Lists `wheat meal (except durum semolina)` as an illustrative human-food classification and groups it with several other grain products. The wheat-flour subclass excludes wheat meal. This is current classification evidence, not a milling specification or retail name. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S05 | OQLF, [farine de blé entier brute (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute), terminology record last updated 1984. | Lists `farine de blé entier brute` and `farine de blé complet brute` as preferred French and `whole wheat meal` and `coarse whole wheat flour` as English terms. Supports only the qualified whole-wheat terminology. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S06 | Honeywell Flour Mills, [Products](https://www.honeywellfood.com/products/), current manufacturer catalogue; page copyright 2025. | Lists **Honeywell Whole Wheat Meal** as whole grain and **Honeywell Semolina** separately. Product-line naming supports qualified products only; it does not define bare wheat meal or Canadian/Québec naming. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S07 | MyChopChop, [Honeywell Whole Wheat Meal - 900g](https://www.mychopchop.ca/products/honeywell-whole-wheat-meal), current Canadian retailer listing. | Names a 900-g product, describes it as 100% whole wheat and finely milled for swallow; the page showed **sold out** when accessed. It supports this branded qualified product, not generic wheat meal, Québec French, or a reusable kitchen measure. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S08 | Oxford University Press, [wheatmeal, Oxford Advanced Learner’s Dictionary](https://www.oxfordlearnersdictionaries.com/us/definition/english/wheatmeal), page date not stated. | Records the closed spelling as a type of wheat flour that uses more of the grain than white flour. Linguistic evidence only; no composition threshold, Canadian use, or Québec equivalent. |
| WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S09 | Cambridge University Press, [wheatmeal, Cambridge Dictionary](https://dictionary.cambridge.org/dictionary/english/wheatmeal), page date not stated. | Records a UK sense for brown flour containing some but not all of the outer and central wheat-grain parts. This shows why the spelling cannot safely be treated as a synonym for the catalog’s whole-kernel product; dictionary wording is not a Canadian standard. |

The search-indexed Ottawa Valley Grain page titled “Whole Grain Wheat Meal” was **not** relied on: direct access returned 404 on 2026-10-14. The R22 review already records the earlier source attempts and the generic hold; this recheck does not treat the indexed snippet as a current accessible product specification.

## Static review checks

- Read the current `ingredient-references.v1.json`, `ingredient-forms.v1.json`, `legacy-import-identities.v1.json`, `research-ledger.v1.json`, and manifest-listed recipe files. Counts and the owner/alias/form/recipe findings above reflect the live files at review time.
- Read the current `IngredientSearch.kt` query normalization and phrase-then-substring matching logic; the picker table is a static projection of its behavior over the live names, aliases, and forms.
- Checked exact wheat-meal reference IDs in forms, general and contextual substitution rules, and package-yield data; none found.
- No app tests, Gradle tasks, emulator runs, or deployments were run; this source-backed hold only updates database JSON evidence and its documentation under the current `AGENTS.md` rule.


## Root integration (2026-10-14)

The root appended all nine R104 source records and one unresolved decision to the existing
`ingredient-ref-wheat-meal` research-ledger entry. Its verified identity still describes only
`whole wheat meal / farine de blé entier brute`; the new decision keeps generic `wheat meal` and
`wheatmeal` inactive. No reference, alias, recipe link, form, measure, conversion, yield, or
substitution was added. The record now contains 34 sources and six decisions; no duplicate candidate
or ledger record was created.

Ledger schema validation and the bundled package, reference, and generated-index static checks
passed. No app or Gradle tests were run because this update only adds database JSON evidence and
documentation under `AGENTS.md`.
