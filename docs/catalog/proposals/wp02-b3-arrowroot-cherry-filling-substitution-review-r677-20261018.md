# WP02 B3 R677: arrowroot in Cherry Cake Filling

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated 2026-10-18; see the [integration README](../batches/wp02-b3-arrowroot-cherry-filling-substitution-integration-r677-20261018/README.md).
- **Plan anchors:** The open B3 parent lists arrowroot among the cassava/tapioca/potato/kudzu/sweet-potato starch work ([plan, line 3155](../../RecipeBook-global-ingredient-catalog-plan.txt#L3164)); broader B2/B3 flour and starch work remains open ([line 16346](../../RecipeBook-global-ingredient-catalog-plan.txt#L16374)).
- **Target:** Existing **`ingredient-ref-arrowroot`**, `arrowroot / arrow-root`, category `FLOUR_AND_STARCH`.
- **Selection audit:** The arrowroot ledger row has `substitutionResearchState: not_yet_researched` and no substitution findings or active rules. The B2/B3 residual review identified Cherry Cake Filling's `cornstarch or arrowroot` line and explicitly deferred its recipe-specific review. R588 reviewed cornstarch portions and left that line attached to cornstarch; it did not review the arrowroot row. This proposal evaluates only the arrowroot side of that existing recipe option.
- **R677 identifier check:** The proposal path and finding ID `arrowroot-cherry-cake-filling-cornstarch-option-r677-20261018` were free before drafting. The recipe URL already has a ledger owner, so this proposal reuses its source ID and allocates no new source ID.

## Recommendation

**Record the recipe option as a blocked, source-scoped ledger finding; keep any active substitution and the recipe link unchanged.** The current Baking With Butter card lists 2½ tablespoons of “cornstarch or arrowroot,” but its method says to mix the cornstarch into cold water, bring the filling to a boil, and continue boiling for about five minutes. A reader comment reports a gloopy result after trying arrowroot. The comment is anecdotal and does not overturn the author's stated option, but it reinforces that the arrowroot method has not been demonstrated by the recipe instructions.

Bob’s Red Mill recommends its arrowroot starch as a 1:1 cornstarch replacement for sauces, stews, and soups, while also warning that long, high-temperature cooking can break arrowroot down. That product guidance does not establish how this recipe's five-minute boil affects the result. Cherry filling is acidic; the manufacturer says arrowroot works with acidic ingredients, but the recipe page does not report an arrowroot test. Preserve the competing evidence as one recipe-bounded blocked finding rather than a reusable ratio or rule.

The integration sets `substitutionResearchState` to `blocked_pending_evidence` and appends one blocked finding that records the published option, method limits, and user report. The active `arrowroot / arrow-root` terms and French aliases, existing measurement state and observations, null density, empty unit mappings, forms, global/contextual rules, and bundled recipe line remain unchanged. It adds no `marante` alias and does not link recipe 029's cornstarch line to arrowroot.

## Source evidence and ownership

| Source and current owner | Evidence checked 2026-10-18 | Scope and limit |
|---|---|---|
| Baking With Butter, [Cherry Cake Filling](https://bakingwithbutter.com/cherry-cake-filling/#mv-creation-197-jtr); reuse `WP03-FRUIT-PITTED-20261011-S05`, currently on `ingredient-form-cherries-pitted`. | Page updated June 4, 2026; yield 2 cups. The current card lists `2½ Tablespoons cornstarch or arrowroot`. Steps use a cornstarch slurry with 2½ tbsp cold water and boil the filling for about 5 minutes. A May 18, 2025 reader comment says they tried arrowroot and the result was “gloopy and slimy.” | The published ingredient option is explicit, but its instructions demonstrate only cornstarch. The comment is a single reader report, not a controlled or author-confirmed test. Reuse the existing source ID/URL on the arrowroot record with an expanded locator; do not create a duplicate URL or ID. |
| Bob’s Red Mill, [All About Starches](https://www.bobsredmill.com/articles/all-about-starches); reuse `WP02-B23-RESIDUAL-20261010-S04`, already on `ingredient-ref-arrowroot`. | Manufacturer says arrowroot starch can replace cornstarch 1:1 for sauces, stews, and soups; make a slurry; low-to-moderate heat is suitable, but long, high-temperature cooking can break it down. It says arrowroot works with acidic ingredients and may curdle milk-based sauces. | Product guidance supports its own bounded thickening advice, not the Cherry Cake Filling method or a general app rule. Reuse the existing source ID; do not add another row for the same URL.
| OQLF, [arrow-root (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522596/arrow-root); reuse `WP02-B23-RESIDUAL-20261010-S01` on `ingredient-ref-arrowroot`. | OQLF's preferred French term is `arrow-root`; its English equivalents are `arrowroot starch` and `arrowroot`. It defines the food starch as extracted from roots of various tropical plants and used as a thickener. | Supports the existing Québec display and broad botanical scope. It does not list `marante` as the preferred product term or address recipe substitution.
| Metro Canada, [Bob’s Red Mill Gluten Free Arrowroot Flour, 454 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-d-arrow-root-sans-gluten/p/039978335050); reuse `WP02-B23-RESIDUAL-20261010-S06` on the target. | Current listing identifies a 454 g Bob’s Red Mill product with ingredient `ARROWROOT STARCH`; the page showed it out of stock at the selected store. The previously reviewed French listing calls it `Farine d’arrow-root sans gluten` and lists `fécule d’arrow-root` as the ingredient. | Product and French label evidence already supports the existing aliases. The listing makes no claim about the recipe alternative.

The recipe URL's current shared-ledger owner is `WP03-FRUIT-PITTED-20261011-S05`, whose existing locator/support covers pitted-cherry quantity. For an arrowroot finding, reuse that URL/source ID on the arrowroot record, refresh `accessedOn` to 2026-10-18, and add a target-specific locator/support summary while preserving its pitted-cherry use. The B2/B3 residual proposal's source ID S08 is proposal-local, not a shared-ledger allocation. The R677 finding ID is new and unique.

## Active owner and picker impact

The active row is `ingredient-ref-arrowroot`, displayed `arrowroot / arrow-root`, with English aliases `arrowroot flour`, `arrowroot powder`, and `arrowroot starch`; French aliases `farine d'arrow-root` and `fécule d'arrow-root`; category `FLOUR_AND_STARCH`; `defaultDensity: null`; and no unit mappings. It has no attached forms or active substitution rules. The ledger identity is verified; measurement is `blocked_pending_evidence` with two Bob’s Red Mill chart observations; substitution is `not_yet_researched` with no findings.

| Query | Current result | R677 effect |
|---|---|---|
| `arrowroot`, `arrow-root`, `arrowroot starch`, `arrowroot flour`, `arrowroot powder` | Only `ingredient-ref-arrowroot` | No display or alias changes. |
| `farine d'arrow-root`, `fécule d'arrow-root` | Only `ingredient-ref-arrowroot` | Keep both current French aliases. |
| `marante` | Six amaranth rows, through current substring fallback | Do not add the recipe's `marante` note as an arrowroot alias; a full-phrase alias would replace those current results with the arrowroot row alone. |

Search behavior follows the phrase-first normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The recipe's `ou marante` remains source text on its existing cornstarch line; it is not Québec terminology evidence for changing the picker.

## Bundled recipe-demand audit

The current manifest lists **114 recipe files** and **1,123 structured ingredient rows** (manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; recipe-corpus fingerprint `8ac44a8938adcc48b4f84d16be97492233ccd714e3381d9245058267ebe2ed2d`). A full normalized search of recipe JSON text and ingredient rows for `arrowroot`, `arrow-root`, `arrowroot starch`, `arrowroot flour`, `arrowroot powder`, `farine d'arrow-root`, `fécule d'arrow-root`, `marante`, and `ingredient-ref-arrowroot` found:

- **1 text hit:** recipe 029, Cherry Cake Filling, original line `2 tbsp cornstarch or arrowroot`, with English note `or arrowroot` and French note `ou marante`.
- **0 ingredient rows linked** to `ingredient-ref-arrowroot`; recipe 029 remains linked to `ingredient-ref-cornstarch`.
- **0 other matching recipe files or rows.** Recipe 014's Blueberry Cake Filling has a cornstarch line but no arrowroot wording.

The current publisher page lists 2½ tablespoons, while bundled recipe 029 stores 2 tablespoons. Preserve this source/seed quantity difference: this review changes no recipe text, quantity, source snapshot, ingredient link, or recipe-line substitution. The one indirect occurrence is evidence for this bounded review, not a request for a new recipe link.

## Integrated ledger disposition

- Reuse source ID `WP03-FRUIT-PITTED-20261011-S05` for the Baking With Butter page on the arrowroot record; reuse the existing Bob’s Red Mill and OQLF sources above. Allocate no source URL or ID duplicate.
- Set arrowroot's `substitutionResearchState` to `blocked_pending_evidence` and append one blocked finding, `arrowroot-cherry-cake-filling-cornstarch-option-r677-20261018`, citing the recipe source and Bob’s Red Mill guidance. Scope it to Baking With Butter's cherry filling only. State that the page lists arrowroot as an option but gives cornstarch-only slurry instructions, includes a five-minute boil, and has one reader-reported poor outcome. Do not treat the reader comment as a controlled result.
- Keep `measurementState: blocked_pending_evidence` and its existing source-specific 36 g per 1/4 cup and 144 g per cup observations unchanged. Do not infer a mass or volume for the recipe's 2½ tbsp option.
- Add no global or contextual substitution rule, recipe-line substitution link, form, conversion, density, unit mapping, alias, or recipe edit.

No software tests were run because this update only adds database JSON research data and documentation under `AGENTS.md`.
