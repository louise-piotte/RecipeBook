# WP03 Section F — tsampa and roasted-barley picker boundary hold (2026-10-13, R36)

## Review record

- **Scope:** one Tibetan regional preprocessed-grain candidate: *tsampa*, especially Canadian products sold as barley tsampa or roasted barley flour.
- **Open checklist:** the Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2417](../../RecipeBook-global-ingredient-catalog-plan.txt#L2510).
- **Status:** reviewed, bounded documentation-only hold integrated in the plan, roadmap, and batch README. No shared catalog, ledger, recipe, generated, or application file changed.
- **Recommendation:** keep *tsampa* unallocated. Do not add bare `tsampa` or qualified `barley tsampa` as an alias on the existing roasted-barley-flour row. The regional term can refer to roasted flour from crops other than barley and, in some regions, to dough; a qualified alias would still make the unqualified `tsampa` search return the barley row alone in the current picker.

This is distinct from Khao Mao, Ogi Baba, Fura, Tom Brown, Hausa Koko, Puttu podi, rice rava, cereal hot porridges, grain flakes, and the earlier Hattai-ko / mugikogashi boundary. It addresses only the roasted-flour name and its crop and product-state scope.

## Product boundary and bilingual naming

The Historical and Comparative Tibetic Lexicon says that in many regions *tsampa* means roasted highland barley flour. It also records lower-altitude versions made from wheat, corn, or peas. The same lexicon separately describes tsampa dough and, in some regions, uses the word *tsampa* for that dough [S01]. This is a source-grounded regional food name, but it is not a stable global synonym for barley flour.

Current Canadian producer pages confirm a barley-specific product use. A Toronto-area Tibetan-food producer titles its product “Tsampa - Roasted Barley,” and says it roasts, mills, and packages the product [S02]. A Calgary producer sells “Organic Barley Tsampa,” specifies 100% Alberta organic hulless barley, hand-roasted and stone-milled, and describes porridge and butter-tea uses [S03]. The latter page also lists separate banana-strawberry and peanut-butter-chocolate “Tsampa Superfood Blend” products; their titles do not disclose formulas or establish that every *tsampa* product is plain barley flour [S03]. These current products verify Canadian English product wording and local market presence, not a universal definition.

| Language | Supported wording and limit |
|---|---|
| English | Canadian product labels support `Tsampa - Roasted Barley` and `Organic Barley Tsampa` for specific barley products. They do not justify bare `tsampa` as a universal barley-flour alias. |
| Québec French | **No tsampa-specific Québec French display was verified.** The active row remains `roasted barley flour / farine d'orge torréfiée`, supported by the Québec mill's own French product page (reused ledger source `WP02-S124`). That page names its roasted-barley-flour product; it does not call it *tsampa*. A targeted OQLF and TERMIUM search did not surface a tsampa entry. A broader search surfaced a European product using `tsampa` and `farine d'orge grillée`, but that seller page and linked PDF returned 403 during this review and are not Québec evidence. Do not adopt that French wording as a Québec label. |

The existing French display is retained only for its current Québec-mill product. This proposal does not translate *tsampa* as `farine d'orge torréfiée`, `farine d'orge grillée`, or another French phrase.

## Exact ownership and archive audit

The live snapshot contains 1,365 active ingredient references, 100 forms, 64 legacy-import candidates, and 1,698 research-ledger records. Exact normalized searches for `tsampa`, `tsanpa`, `zanba`, `zamba`, `barley tsampa`, `tsampa flour`, and `tsampa dough` found no owner in active reference names or aliases, forms, legacy candidates, ledger records, or the proposal and batch archive. The proposal-local source-ID prefix `WP03-TSAMPA-R36-20261013-` was unused before this file was created.

| Current owner | Exact live boundary |
|---|---|
| Candidate terms `tsampa`, `barley tsampa`, and `tsampa flour` | No active reference, form, legacy candidate, ledger candidate, or earlier proposal/batch owns these terms. |
| `ingredient-ref-roasted-barley-flour` | `roasted barley flour / farine d'orge torréfiée`, category `FLOUR_AND_STARCH`; English alias `toasted barley flour`; no French aliases; `defaultDensity: null`; `unitMappings: []`; no attached forms. This row owns a generic roasted-barley-flour product class, not the regional word *tsampa*. |
| Generic and malted barley flour rows | Separate active identities. Do not merge *tsampa* with unroasted barley flour or malted barley flour based on crop alone. |
| Existing Hattai-ko / mugikogashi review | Those Japanese regional names remain separately unresolved because their crop inputs vary. This proposal does not reopen or map them to *tsampa*. |

The roasted-barley-flour ledger record is identity-verified, with `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. It has no measurement observations or substitution findings. Its existing sources concern the Québec mill's roasted barley flour, terminology for ordinary or malted barley flour, manufacturer use of “toasted barley flour,” and the separate Hattai-ko / mugikogashi boundary; none assigns *tsampa* to this row.

## Picker and recipe-corpus effects

This is a static projection of [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which matches a complete normalized word phrase within a term before falling back to substring matching. No picker data changes are proposed.

| Query | Current result | Bounded implication |
|---|---|---|
| `tsampa`, `barley tsampa`, `tsampa flour`, `tsanpa` | No result | Keep the regional candidate unallocated. |
| `roasted barley flour`, `toasted barley flour`, `farine d'orge torréfiée` | Only `ingredient-ref-roasted-barley-flour` | Preserve the existing bilingual owner for its supported generic product class. |
| `barley` / `orge` | Multiple qualified barley products | These broad crop words do not identify one processed flour. |

If `barley tsampa` were added as an alias to the existing row, a bare `tsampa` query would also match that alias as its only result under the current phrase search. Since the lexicon documents other-crop roasted-flour variants and a dough use, that singleton result would erase meaningful scope. Adding a separate bare-*tsampa* row would also require an unverified Québec French display and would collapse barley, other-crop, and dough uses into one identity.

All 114 manifest-listed bundled recipes and 1,123 ingredient rows were scanned for the candidate spellings and the existing row's English and French names. The scan found zero matching recipe files and zero matching ingredient rows. No bundled ingredient line references `ingredient-ref-roasted-barley-flour`; the current corpus provides no recipe demand to resolve the product boundary.

## Forms, measurements, and substitutions

- **Form/state:** the sources describe roasted and milled barley flour for particular Canadian products, while the lexicon records other roasted crops and a dough meaning. They do not establish a single retail form or a universal recipe-ready state. Add no dry, roasted, milled, dough, or porridge form to the existing barley-flour row.
- **Measures and density:** no reviewed source supplies an exact-form household volume measure, mass-to-volume conversion, bulk density, or recipe portion for plain tsampa. The Calgary package options (250 g, 650 g, 1 kg, and 5 kg) are product sizes, not serving or cup measures [S03]. Keep density and unit mappings inactive; do not infer values from another barley flour.
- **Preparation and yield:** roasting and milling descriptions are product/process statements, not a validated household yield or conversion. The described porridge and butter-tea uses supply no general ingredient quantity or preparation ratio [S02, S03].
- **Substitutions:** add no substitution between tsampa and ordinary, malted, toasted, or roasted barley flour, other-crop roasted flours, tsampa dough, or prepared porridge. The shared crop or regional name does not establish equivalent milling, water uptake, preparation state, or replacement amount.

## Source register

Sources were checked online on 2026-10-13. New source IDs use the proposal-local prefix `WP03-TSAMPA-R36-20261013-`; no source or decision was added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-TSAMPA-R36-20261013-S01` | Nicolas Tournadre and Hiroyuki Suzuki, *The Tibetic Languages: An Introduction to the Family of Languages Derived from Old Tibetan*, LACITO, 2023, Part 3, Chapter 12, HCTL entries 505–508, [Historical and Comparative Tibetic Lexicon](https://lacito.cnrs.fr/wp-content/uploads/2023/09/TibeticLangV1_Part3-App12.pdf), PDF pp. 844–845. | Entry 505 describes roasted highland barley flour as a common meaning, but also cites wheat, corn, and pea roasted-flour variants in lower-altitude regions. Entries 506–508 distinguish dough and porridge uses. This is lexicographic regional evidence, not a Québec retail standard or recipe measurement. |
| `WP03-TSAMPA-R36-20261013-S02` | Garleek Kitchen, Toronto-area, [Tibetan Food Products](https://www.garleekkitchen.com/tibetanproducts), “Tsampa - Roasted Barley.” | A current Canadian producer names a barley-specific tsampa product and says it roasts, mills, and packages it; it describes breakfast, snack, and bread uses. The page supplies no ingredient percentage, French label, serving size, density, or recipe ratio. |
| `WP03-TSAMPA-R36-20261013-S03` | Ama Tashi Foods, Calgary, [Organic Barley Tsampa](https://amatashifoods.ca/products/gluten-friendly-tsampa), current product page. | Specifies Alberta organic hulless barley, hand-roasting, stone-milling, porridge and butter-tea uses, and package sizes. Its product list separately names flavored tsampa blends. The package sizes are not reusable measures, and the blend titles do not disclose formulas. |
| Reused ledger source `WP02-S124` | Les Moulins de Soulanges, Québec, [Farine d'Orge Torréfié](https://moulinsdesoulanges.com/language/fr/farine-dorge-torrefie/), product heading and roasting description. | Supports the existing Québec French display boundary for `ingredient-ref-roasted-barley-flour`. It does not name or translate *tsampa*. |

## Next action

Keep *tsampa* unallocated and retain the existing `roasted barley flour / farine d'orge torréfiée` row unchanged. Reopen only when a Québec-facing French product label establishes the language pair and the picker can preserve barley qualification without making bare `tsampa` a singleton result while other-crop or dough meanings remain in scope. At that point, repeat exact ownership, picker, and recipe-demand checks; research measures and substitutions only for the exact verified product form. Until then, add no reference, alias, ledger candidate, form, measurement, density, unit mapping, recipe link, conversion, yield, or substitution.

No app, shared catalog, or ledger files changed. No tests were run because this was a documentation-only
boundary hold under the updated `AGENTS.md` rule.
