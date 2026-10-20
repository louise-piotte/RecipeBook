# WP02 Section A7 R671: roasted corn flour measurement and substitution review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated as research-state updates on `ingredient-ref-roasted-corn-flour`. No active catalog values or recipe data changed.
- **Plan anchor:** The open WP02 Section A7 checklist follows the identity-only Québec-mill roasted-corn-flour entry and continues review of other grain meals and milling products ([plan, lines 2091–2095](../../RecipeBook-global-ingredient-catalog-plan.txt#L2091)). The identity packet explicitly leaves measurement and substitution research open ([identity packet](../batches/roasted-corn-flour-identity.md#remaining-work)).
- **Candidate:** Existing `ingredient-ref-roasted-corn-flour`, distinct from [R666's cornmeal measurement/substitution review](wp02-a7-cornmeal-measure-substitution-review-r666-20261018.md) and [R663's roasted-wheat-malt-flour package boundary](wp02-a7-roasted-wheat-malt-flour-package-review-r663-20261018.md).
- **Prior-review audit:** [R59](wp02-a7-gaude-flour-roasted-corn-equivalence-boundary-review-20261013-round59.md) examined French *gaude* products against the Québec mill product and rejected equivalence; it did not close the active row's measurement or substitution research states. The 15 kg and 1 kg sizes in that packet belong to other, source-named French products. R666's cornmeal observations likewise do not transfer to roasted corn flour.

## Current record and picker/corpus snapshot

| Surface | Current state |
|---|---|
| Active reference | `ingredient-ref-roasted-corn-flour`; `roasted corn flour / farine de maïs torréfiée`; category `FLOUR_AND_STARCH`; no aliases; `defaultDensity: null`; `unitMappings: []`. The display and identity are already reviewed; this batch raises no naming issue. |
| Research ledger | Identity `verified`; measurement and substitution states both `not_yet_researched`; no `measurementObservations` or `substitutionFindings`. Existing sources `WP02-S130` and `WP02-S131` are the bilingual Moulins de Soulanges product pages. |
| Forms, rules, and yield | No form references this ingredient. The active global and contextual substitution-rule files contain zero rules; the sole package-yield record is for S&W black beans and does not mention this ingredient. |
| Exact picker projection | `roasted corn flour`, `roasted corn`, and both accented and accent-folded full French phrases each return only `ingredient-ref-roasted-corn-flour`. `toasted corn flour` returns no result. |
| Broad picker projection | `farine de maïs` returns four rows: masa harina, precooked corn flour, roasted corn flour, and whole-kernel corn flour. `corn flour` returns four: precooked corn flour, roasted corn flour, sorghum flour (through `guinea corn flour`), and whole-kernel corn flour. `semoule de maïs` returns corn grits and cornmeal. With no name or alias change, these results remain unchanged. |
| Bundled recipe benchmark | The 114 manifest-listed recipe files and 1,123 ingredient rows contain no text hits for `roasted corn flour`, `farine de maïs torréfiée` (accented or folded), `roasted corn`, or neighboring `cornmeal`/`semoule de maïs` terms; no ingredient row links to the target ID. The bundle supplies no recipe demand or quantity for this identity. |

The picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt); corpus and catalog counts were checked against the live manifest and package files.

## Evidence and limits

| Source and locator | Evidence and disposition |
|---|---|
| Les Moulins de Soulanges, [Roasted Corn Flour](https://moulinsdesoulanges.com/language/en/roasted-corn-flour/), product heading and technical description, “Suggested uses” (current page; accessed 2026-10-18). Existing ledger source `WP02-S130`. | The mill describes heat treatment intended to promote gelatinization of corn starch and lists muffins, cookies, sourdough bread, and cake as use categories. The page gives no recipe amount, replacement percentage, package quantity, mass/volume pair, density, or measurement method. Application categories do not establish a substitution. |
| Les Moulins de Soulanges, [Farine de Maïs Torréfié](https://moulinsdesoulanges.com/language/fr/farine-de-mais-torrefie/), product heading and technical description, “Suggestions d'utilisation” (current page; accessed 2026-10-18). Existing ledger source `WP02-S131`. | The French page describes the same product and suggests muffins, biscuits, miche, and cake; it supplies no quantities, recipe ratio, density, or substitution guidance. Keep the accepted display `farine de maïs torréfiée`; the source's page spelling does not create a naming or alias issue. |
| Mills of Crete / Vero Cereal, [Roasted corn flour](https://www.mills.gr/en/product/roasted-corn-flour/), product description and “Uses,” lines 135–165; accessed 2026-10-18. Proposal-local source `WP02-A7-ROASTED-CORN-FLOUR-MEASURE-SUB-R671-20261018-S01`. | This separate Greek product page says the flour is made by roasting corn and grinding it. It says this product can replace 5%–20% of “traditional flour” in breads, cookies, sweets, or pies, and can be blended with wheat or rye flour. This is evidence for a product-specific, broad-use recommendation on that product. It does not identify the substituted flour precisely or establish equivalence with the Québec mill's functional flour, so do not attach this ratio or a runtime rule to the active row. |
| Nyefene et al., [“Nutritional Composition and Acceptability of Egg Powder-Fortified Tom Brown…”](https://onlinelibrary.wiley.com/doi/full/10.1002/fsn3.70288), *Food Science & Nutrition* (2025), materials and methods §§2.1/2.12 and Table 6, lines 196–198, 297–310, and 361–369; accessed 2026-10-18. Proposal-local source `WP02-A7-ROASTED-CORN-FLOUR-MEASURE-SUB-R671-20261018-S02`. | The study prepares its own Ghanaian roasted corn flour from Wa-market yellow corn, oven-roasted at about 150–200°C until brown, cooled, then milled. Its Table 6 reports bulk density of **0.6 g/mL** for the study's corn flour and **0.65 g/mL** for its egg-powder composite; the paper does not give the bulk-density test procedure. The study also uses 100 g flour with 10, 15, or 20 g egg powder in its formulation table and reports a larger batch of 2,000 g flour, 400 g egg powder, and 4,800 g water. These are study-product measurements and a Tom Brown fortification formula, not a Moulins product measure or a flour-to-flour substitution. Do not transfer them, derive a conversion, or set `defaultDensity`. |
| Farinex, [catalog listing](https://farinex.ca/product?category=&kosher=&page=92&search=), search-result snippet only; accessed 2026-10-18. | A stale search snippet names a 20 kg Les Moulins de Soulanges roasted-corn-flour item, but the opened page no longer exposes that row or quantity. This is not accepted as current package evidence; even if current, a bag size would not establish a household measure or density. |

The manufacturer's broader English and French functional-ingredient pages repeat the Moulins description and use categories; they add no quantitative or substitute evidence, so no duplicate source records are proposed. Current Moulins sources remain the source-of-truth for the active identity. The manufacturer's claims about nutrition, gluten, preservation, and performance are not used as measurements or substitution support.

## Recommendation

Update only the existing `ingredient-ref-roasted-corn-flour` research-ledger record:

- Set `measurementState` to `researched_no_supported_value` for the active Québec-mill product. Refresh existing sources `WP02-S130` and `WP02-S131` to the current access date and locators above; do not create duplicate Moulins source IDs. Append an accepted decision stating that the current product pages provide application categories but no supported measurement, density, or conversion.
- Set `substitutionResearchState` to `researched_no_supported_substitute` for the active Québec-mill product. Append an accepted decision stating that the manufacturer's application suggestions do not recommend a replacement. Document Mills of Crete's 5%–20% advice and the Ghana study's density/formula as out-of-scope product-specific evidence in this proposal; do not assign their values to the active Moulins record.
- Keep the active reference, French display, aliases, category, `defaultDensity: null`, and `unitMappings: []` unchanged. Add no measurement observation, substitution finding, form, global form-conversion rule, contextual substitution rule, package yield, recipe link, or numeric conversion.

This closes the research questions for the current source-defined Moulins product while preserving the unknowns for that product. It does not claim that all roasted-corn-flour products lack measurements or replacement advice.

## Source and identifier ownership audit

| URL or ID | Current owner / disposition |
|---|---|
| Moulins English URL / `WP02-S130` | Already owned by `ingredient-ref-roasted-corn-flour` only. Reuse and refresh; do not duplicate. |
| Moulins French URL / `WP02-S131` | Already owned by `ingredient-ref-roasted-corn-flour` only. Reuse and refresh; do not duplicate. |
| Mills of Crete URL | No current ledger URL owner. Its R671 identifier is proposal-local; no ledger source entry is proposed because the product is not established as equivalent to the active Québec product. |
| Wiley article URL / DOI `10.1002/fsn3.70288` | No current ledger URL owner. Its R671 identifier is proposal-local; no ledger observation or source entry is proposed for the active item because the study flour has its own explicitly described process and food context. |
| Farinex listing URL | No current ledger owner. Not accepted as current evidence and no ID proposed. |
| R671 proposal path and proposal-local source IDs | The proposal path was absent before drafting; the S01/S02 IDs were searched in the current proposal archive and ledger and are unowned. These IDs are not active-ledger IDs. |

The existing R59 proposal-local Moulins citations use the same manufacturer URLs but are not ledger source owners. The current ledger still has exactly one owner for each URL and each active source ID.

## Static checks reviewed during integration

- The only active-ledger target remains `ingredient-ref-roasted-corn-flour`; identity, bilingual name, aliases, category, density, and mappings remain unchanged.
- The two research states are `researched_no_supported_value` and `researched_no_supported_substitute`, with accepted decisions citing the reused `WP02-S130` and `WP02-S131` sources; both manufacturer sources were refreshed to the 2026-10-18 review date.
- No Moulins recipe amount, product density, mass/volume mapping, conversion, substitution finding, active rule, form, yield, or recipe link is added.
- Mills of Crete's 5%–20% replacement guidance and the Ghana study's 0.6 g/mL bulk-density result, 100 g flour formulations, and 2,000 g batch remain explicitly limited to their source-defined products and contexts.
- Exact picker results and the 114-recipe / 1,123-row benchmark remain unchanged; the target stays absent from forms, substitution-rule files, and package yields.
- Research-ledger schema/custom validation, source ID/URL ownership, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were performed because this change only updates database JSON under `AGENTS.md`.
