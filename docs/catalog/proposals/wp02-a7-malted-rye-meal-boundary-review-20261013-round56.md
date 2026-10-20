# WP02 A7 R56: Malted Rye Meal Product-Boundary Review

- **Reviewed:** 2026-10-13
- **Status:** Accepted and integrated as an unresolved ledger-only candidate. No active ingredient reference, form, recipe link, legacy identity, or runtime behavior was added.
- **A7 anchor:** The open parent item remains at [`docs/RecipeBook-global-ingredient-catalog-plan.txt#L1449`](../../RecipeBook-global-ingredient-catalog-plan.txt#L1449).
- **Scope:** The exact food-industry phrase `malted rye meal`. Keep it distinct from plain rye meal, malted rye flour, generic malt flour, malted rye grain, and toasted rye flour until a source establishes an identity boundary.
- **R56 source IDs:** `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S01` through `S07`. They were unique to this review and are now registered on its unresolved ledger candidate.

## Recommendation

**Root accepted `candidate-malted-rye-meal` as an unresolved ledger-only candidate; no active ingredient reference was created.** A current professional bakery supplier identifies malted rye meal as one ingredient in a commercial multi-grain bread blend [S01]. That is direct evidence of the phrase in human-food use, but it is not a standalone meal specification: the page does not disclose the component's grind, malting details, amount in the blend, or a Québec French product name.

A current Canadian retailer lists a related Finnish product as `Laihian Coarse Malted Rye Flour` and says the malt is used for brewing and baking [S02]. Its manufacturer distinguishes coarsely crushed rye malt from a pale, ground rye malt product in its own range [S03]. These neighboring products establish that malted rye is sold for food and that grind wording matters; they do not show that `malted rye meal`, `coarse malted rye flour`, and `malted rye flour` are equivalent products.

Keep the candidate unallocated. Do not alias it to active `ingredient-ref-rye-meal`, `ingredient-ref-malted-rye-flour`, or generic `ingredient-ref-malt-flour`; do not invent a French display. Leave density, unit mappings, forms, conversions, yields, recipe links, and substitutions empty. This proposal does not change any shared data.

## Food-use and Québec French boundary

Master Baker's current Grainex Dark page calls `malted rye meal` a component of a 25 kg German-origin multi-grain and oilseed concentrate for breads and rolls [S01]. The source establishes a food-use occurrence of the exact phrase, but the listed product is a blend of malted rye meal, soybean grits, oat flakes, maize semolina, linseed, and vegetable fats. Its stated 10–30% use rate applies to the complete concentrate, not to the malted rye meal component. The component's grind and standalone availability remain unspecified.

The Canadian Viking Foods listing uses the different product name `Laihian Coarse Malted Rye Flour`, describes it as dark rye malt for sahti and kalja, and also recommends it for cakes and baking [S02]. Laihian Mallas's own FAQ says its kalja malt is coarsely crushed rye malt, while its mämmi and bread malt is pale ground rye malt [S03]. That manufacturer wording is useful evidence that “coarse” can describe a crushed malt product distinct from a ground malt product. It does not establish that the Viking item is the same product as Grainex's meal component or that either name should be added as an alias to the active flour row.

Québec terminology does not supply a product-specific name for this candidate. TERMIUM Plus pairs plain `rye meal` with `gruau de seigle` and `semoule de seigle`, describing whole-kernel rye ground coarse and dark for pumpernickel [S05]. OQLF defines `malt` as a cereal that has been soaked, germinated, and dried; it notes that malt can be sold as grain or extract, but does not name a ground rye-malt food product [S06]. OQLF's `gruau` entry in the brewery/malt-crushing domain describes grits or semolina from crushed malt [S07]. This is a separate technical use of `gruau`, not evidence for `gruau de seigle malté` as a Québec food-picker label. Do not transfer `gruau de seigle`, `semoule de seigle`, `farine à pumpernickel`, or `farine de seigle malté` to this candidate.

No reviewed Canadian or Québec source provides an exact French display for standalone malted rye meal. This is a bounded source finding, not proof that the phrase or product cannot occur in Canada.

## Checklist, archive, and live ownership

The A7 parent checklist remains open for other grain meals, malted/toasted flour identities, and gluten-flour equivalence. The proposal archive contains adjacent decisions for plain rye meal, malted rye flour, toasted rye flour, and malted barley meal, but no prior A7 disposition or exact candidate for `malted rye meal` / `rye malt meal`. R45 covers barley and a nonfood malted-barley-meal product; it does not decide this rye food-use phrase. The existing rye-meal and malted-rye-flour records remain separate.

At this snapshot, the package has **1,379 active ingredient references and 100 forms**; the legacy-import file has **63 candidates**, and the research ledger has **1,709 records**.

| Current owner or record | Current state | Candidate boundary |
| --- | --- | --- |
| `ingredient-ref-rye-meal` | `rye meal / gruau de seigle`, `FLOUR_AND_STARCH`; French aliases `semoule de seigle`, `farine à pumpernickel`; English aliases `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`; null density and empty unit mappings. | Owns the plain coarse whole-kernel rye meal wording. No malting qualifier is present. |
| `ingredient-ref-malted-rye-flour` | `malted rye flour / farine de seigle malté`, `FLOUR_AND_STARCH`; no aliases, null density, empty unit mappings. | Owns the named flour identity. The current sources do not establish that meal is an alias or form of this flour. |
| `ingredient-ref-rye-flour` | `rye flour / farine de seigle`, `FLOUR_AND_STARCH`; no aliases. | Plain rye flour remains distinct from both meal and malted rye flour. |
| `ingredient-ref-malt-flour` | `malt flour / farine maltée`, `FLOUR_AND_STARCH`. | Generic malt flour does not identify rye species or a meal grind. |
| Rye-related forms | No matching rye, malt, meal, or seigle form in the 100 active forms. | No form record supports a same-ingredient malted-to-meal transition. |
| Legacy and research records at proposal snapshot | No exact `malted rye meal` / `rye malt meal` legacy candidate or `candidate-malted-rye-meal` ledger record. The ledger contains the separate active rye-meal and malted-rye-flour records and an unresolved toasted-rye-flour candidate. | Root integration added only this candidate as unresolved; neighboring records were not edited or merged. |

Proposal-time exact normalized searches of the active names and aliases, form labels and match terms, legacy candidate fields, A7 proposals, A7 checklist text, and ledger record IDs found no prior owner for `malted rye meal`, `rye malt meal`, `gruau de seigle malté`, or `semoule de seigle maltée`. The plain rye-meal and malted-rye-flour rows are adjacent owners, not exact matches.

## Picker consequences

The static query audit follows the complete normalized phrase matching and partial-match fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a projection over the current data, not an app-picker test.

| Query | Current picker result | Consequence if held as ledger-only |
| --- | --- | --- |
| `malted rye meal`; `rye malt meal`; `gruau de seigle malté` | No reference result. | No picker change. |
| `malted rye`; `malted rye flour`; `farine de seigle malté` | `ingredient-ref-malted-rye-flour`. | Keep the existing flour result unambiguous. |
| `rye meal`; `gruau de seigle` | `ingredient-ref-rye-meal`. | Preserve the plain meal owner. |
| `rye`; `seigle` | Ten rye references, including grain, berries, cracked rye, flakes, meal, and flour grades. | No broader rye result set. |
| `meal` | Five references: cornmeal, cracker crumbs, matzo meal, rye meal, and whole wheat meal. | No broader meal result set. |

If a future source supports an active row, an exact `malted rye meal` query could select it. That row would also make the partial phrase `malted rye` return both the current flour row and a meal row, and would expand the broad `rye` and `meal` result sets. The present evidence does not justify that picker cost or an exact bilingual display.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files and 1,123 ingredient rows**. There are zero file hits and zero ingredient-row hits for `malted rye meal`, `rye malt meal`, `coarse malted rye`, `malted rye flour`, `rye meal`, `farine de seigle malté`, and `gruau de seigle`. No bundled recipe demand, recipe link, or exact-form measurement need was found.

## Numeric and substitution limits

- Grainex's 25 kg package and 10–30% concentrate dosage describe the blend, not the amount or measure for its malted rye meal component [S01]. Do not transfer them to a candidate.
- Viking's 1 kg product package is not a volume conversion, density, or recipe measure for malted rye meal [S02].
- No reviewed source provides a household measure, mass-volume conversion, density, unit mapping, dry/cooked form, cooking yield, or tested substitution for the candidate. Add none.
- Do not infer equivalence among plain rye meal, malted rye flour, coarse crushed rye malt, toasted rye flour, or generic malt flour. No form or contextual substitution rule is proposed.

## R56 source register

Sources were reviewed on **2026-10-13**. The seven R56 IDs are now registered as sources on `candidate-malted-rye-meal` in the research ledger.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S01` | Master Baker Middle East, [Grainex Dark — Mix of Grains & Seeds](https://www.masterbakerme.com/product/grainex-dark-mix-of-grains-seeds/), composition and product details. | Current professional-bakery page names malted rye meal as one component of a 25 kg German-origin bread concentrate with other grains and seeds. It does not give the component's individual grind, proportion, source, standalone SKU, or Québec French name. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S02` | Viking Foods & Imports Inc., [Laihian Coarse Malted Rye Flour, 1 Kg](https://www.vikingfoods.ca/products/laihian-coarse-malted-rye-flour-1-kg), live Canadian product listing. | Names a related Finnish product and describes brewing and baking uses. It does not call the item meal or provide a French label; the page describes the whole malt product, not a milling specification. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S03` | Laihian Mallas, [Usein kysyttyä / Frequently asked questions](https://laihianmallas.fi/usein-kysyttya/), malt-product comparison. | The manufacturer's FAQ calls kalja malt coarsely crushed rye malt and distinguishes it from pale ground mämmi/bread rye malt. It documents that supplier's products, not a universal definition or a confirmed Grainex/Viking SKU equivalence. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S04` | Arva Flour Mill, [Rye Meal 650g](https://arvaflourmills.com/products/rye-meal), current Ontario product description. | Defines plain rye meal as coarsely ground whole rye flour including bran, germ, and endosperm. This is an unmalted product comparator; it does not define malted meal. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S05` | Government of Canada Translation Bureau, [TERMIUM Plus: rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE), Food Industries / Breadmaking, entry dated 2001-07-30. | Supports the existing plain rye-meal term and its whole-kernel, coarse/dark, pumpernickel context. It does not describe malted rye meal. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S06` | OQLF, [malt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26545137/malt), last updated 2018. | Defines malt as a cereal soaked, germinated, and dried; notes grain and extract presentations. It does not establish the French name for ground rye malt. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S07` | OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), brewing/malt-crushing domain, dated 1983. | Describes grits/semolina from malt crushing and notes fine/coarse grits. It does not establish `gruau de seigle malté` as a Québec consumer-food display. |

## Integration decision

Accepted as unresolved ledger-only `candidate-malted-rye-meal`, with identity `needs_clarification`, measurement research `researched_no_supported_value`, and substitution research `researched_no_supported_substitute`. The exact phrase is supported only as a concentrate component; the sources do not define a standalone grind or Québec French display. Keep it outside active references, aliases, forms, legacy identities, recipe links, and numeric or substitution behavior. Revisit active allocation only after a technically accountable food source defines the standalone meal's malting and grind boundary and a Québec French display is supported.

The proposal snapshot of 1,379 references, 100 forms, 63 legacy candidates, and 1,709 ledger records predates the R55 maize-rice integration. Immediately before this integration, the live package had 1,380 references, 100 forms, 63 legacy candidates, and 1,710 ledger records; the new candidate brings the ledger to 1,711 records. The complete recipe bundle remains 114 files and 1,123 ingredient rows, with no matching demand.

No app tests or emulator checks were run. This change adds database JSON research data and documentation only, so no tests were needed under the updated `AGENTS.md` rule. See the [integration README](../batches/wp02-a7-malted-rye-meal-boundary-hold-integration-20261013/README.md).
