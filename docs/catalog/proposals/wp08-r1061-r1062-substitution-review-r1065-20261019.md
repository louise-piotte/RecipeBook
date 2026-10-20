# WP08 R1065 — substitution review for R1061 and R1062

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This is the only proposed file change. No shared JSON, ledger, plan, roadmap, generated file, recipe, or code was edited; no software tests were run.
- **Scope:** Complete a focused online substitution review for the accepted generic identities `ingredient-ref-jackfruit-seeds` and `ingredient-ref-matsumae-zuke`. Search for source-backed recommendations in defined culinary contexts. Do not pursue brands, product lines, flavour families, SKUs, retailer variants, or commercial rosters; commercial-product counts do not add ingredient diversity.

## Recommendation summary

| Ingredient | Recommended research state | Finding |
| --- | --- | --- |
| `ingredient-ref-jackfruit-seeds` | `blocked_pending_evidence` | A Konkani jackfruit-seed curry recipe explicitly suggests potato, yam, or eggplant and says to cook the replacement until tender. The recipe gives 20–30 peeled seeds for six servings, but gives no replacement amount or basis. Other surfaced legume suggestions likewise have no replacement quantity and one source page could not be opened directly. Record the curry-specific suggestion as incomplete evidence; do not infer an equal count, mass, or volume and add no active rule. |
| `ingredient-ref-matsumae-zuke` | `researched_no_supported_substitute` | For the reviewed uses of the finished preserve, no source recommends a replacement. A recipe transcript suggests ingredient swaps while making Matsumae-zuke itself; those are component-level substitutions, not a substitute for the accepted finished-food identity. Close the reviewed scope with no active rule. |

These states describe only the research scope below. `researched_no_supported_substitute` means no defensible substitute was found in the documented contexts, not that no possible alternative exists.

## Live record and rule audit

Read the current ingredient references, forms, and research ledger before research. Both accepted references exist under the stated IDs. Neither has an attached ingredient form. Jackfruit seeds currently have `substitutionResearchState: not_yet_researched` and no substitution findings. Matsumae-zuke currently has `substitutionResearchState: blocked_pending_evidence` and the R1062 finding `matsumae-zuke-substitution-blocked-r1062-20261019`. Both global and contextual substitution-rule files currently contain zero rules, and neither target has a rule.

Preserve the R1061 jackfruit boundary and its existing seed-part sources. In particular, the R1061 proposal records that an IAC chestnut comparison is sensory description, not substitution evidence. Keep the whole-fruit reference, young-jackfruit-in-brine form, and R138 seed-starch/R181 seed-flour holds unchanged. Preserve the R1062 Matsumae-zuke identity boundary, its two MAFF source records, and Nishin Zuke as a separate identity. Do not reassign or duplicate existing ledger sources.

## Jackfruit seeds

### Context reviewed

The search focused on cooked jackfruit-seed pieces as the solid ingredient in regional curry, with rice accompaniment. In the directly opened Konkani curry recipe, the source formula is for six servings and uses **20–30 peeled jackfruit seeds**, pressure-cooked before coconut-spice gravy is added. Its note explicitly proposes potatoes, yam, or eggplant as alternatives and says to cook them until tender. It also distinguishes the longer seed cooking time (4–5 pressure-cooker whistles) from the suggested alternatives. This is a specific culinary recommendation, not a taste analogy.

The source does **not** state how many potatoes, how much yam, or how much eggplant replaces 20–30 seeds, or whether the basis should be count, mass, or volume. It gives no comparison recipe testing, required liquid adjustment, or substitute-specific outcome. Do not infer that the source’s 20–30 seed amount transfers to an equal count or any other amount.

### Candidates considered

| Candidate | Evidence and disposition |
| --- | --- |
| Potato, yam, or eggplant in the linked Konkani jackfruit-seed curry | **Source-recommended but incomplete for an app rule.** Cook with Kushi’s recipe names the specific curry, gives 20–30 peeled seeds for six servings, recommends these three replacements, and says to cook until tender. It omits each replacement amount and any quantity basis. Keep as scoped incomplete evidence; no rule or amount is proposed. |
| Chickpeas or cooked kidney beans in an Indian-inspired jackfruit-seed curry | An Honest Cooking search-result preview attributes this advice to its recipe author and provides a six-serving recipe with 1½ cups jackfruit seeds. The article page returned HTTP 403 when opened, so the preview is not treated as directly verified source evidence. Even in the preview, no amount for either legume is stated. Keep as an access-limited lead only; do not add it to the shared source ledger or use it to support a rule. |
| Frozen jackfruit seeds in Sri Lankan kos ata curry | CeylonCooking’s search-result preview lists thawed frozen jackfruit seeds as the same-ingredient alternative for its 300 g / four-serving curry. Its page open timed out. This is a sourcing/form alternative, not a different-ingredient substitute, and the source was not directly verified in this review. Do not treat frozen seeds as a new ingredient reference or form. |
| Chestnut | R1061’s reviewed IAC source compares sensory qualities; it does not recommend chestnut for the curry or another jackfruit-seed use, and supplies no replacement amount. Reject on resemblance alone. |
| Jackfruit flesh or other seeds | The R1061 identity review and focused searches provide no recommendation replacing culinary seeds with fruit flesh or another seed. Do not infer equivalence from common plant origin or broad similarity. |

### Proposed ledger disposition

If accepted by the integration owner, update only the existing jackfruit-seed ledger row’s substitution state to `blocked_pending_evidence` and append a blocked finding for the Konkani curry recommendation. The finding should retain the three named candidates as source-recommended but unquantified; it should have no `replacements` array because none meets the plan’s required replacement-amount and basis fields. Preserve the existing R1061 sources and decisions, measurement state, identity, and all active catalog fields. Do not add a global rule, contextual rule, recipe-line substitution, form, or recipe link.

Suggested finding ID: `jackfruit-seeds-konkani-curry-alternatives-unquantified-r1065-20261019`.

## Matsumae-zuke

### Contexts reviewed

The search covered replacement of the **finished Matsumae-zuke** in the uses listed by the Japan Ministry of Agriculture, Forestry and Fisheries (MAFF): ready-to-eat rice accompaniment or snack, ochazuke, pasta, omelets, seasoning-stock use of its marinade, and the MAFF cold-tofu topping example. The cold-tofu example specifies 100 g Matsumae-zuke on ½ block fine-grained tofu; these are source-recipe amounts only. MAFF and the Hokkaido Regional Agricultural Administration Office describe regional/household ingredient variation and optional additions, but neither recommends replacing the finished preserve in any of these roles.

### Candidates considered and rejected

| Candidate | Evidence and disposition |
| --- | --- |
| Nishin Zuke | Keep the active Hokkaido herring-and-vegetable preserve separate. No reviewed source recommends it in place of finished Matsumae-zuke; shared regional preservation context and `-zuke` wording do not establish substitution. |
| Plain squid, kombu, herring roe, or generic pickled seafood | These are components or broad neighbors, not a ready-made replacement for the finished mixed preserve. No source reviewed recommends one for the listed Matsumae-zuke uses. Do not flatten the preserve into one component. |
| Dried daikon or generic pickles | MAFF identifies daikon and other additions as source-specific recipe variation, not as replacements for the finished preserve. Similar preserved or pickled use does not establish direction, amount, or functional equivalence. |
| Ika-sōmen for surume and mentaiko for tarako | A TubeRecipe transcription of a named creator’s Matsumae-zuke recipe recommends these while **making Matsumae-zuke**. It lists 18–36 g ika-sōmen but no baseline surume amount. This is an ingredient-level recipe variation, not a substitute for finished Matsumae-zuke in a dish; reject for this target. |
| Scallop-, abalone-, or wasabi-green-containing variants | Not pursued as commercial product variants or a roster. Variation in a finished product’s composition is not evidence that it replaces generic Matsumae-zuke. |

### Proposed ledger disposition

If accepted by the integration owner, set the Matsumae-zuke record’s overall substitution state to `researched_no_supported_substitute` for the contexts reviewed and append a no-supported finding for the finished preserve. Keep the R1062 identity, measurement state, source records, and earlier scoped evidence. Add the Hokkaido MAFF recipe page below as a new source for the explicit recipe/process and household-variation scope; do not overwrite or duplicate either existing R1062 MAFF source. No rule, warning, recipe-line substitution, form, or recipe link is supported.

Suggested finding ID: `matsumae-zuke-finished-food-no-supported-substitute-r1065-20261019`.

## Queries recorded

Queries were run on 2026-10-19. Exact query wording included:

- `jackfruit seeds substitute recipe chestnuts jackfruit seeds alternative cooking recipe source`
- `"jackfruit seeds" "substitute" recipe`
- `jackfruit seed curry "potato" "substitute" recipe regional culinary`
- `"jackfruit seeds" "substitute" potatoes curry recipe`
- `"jackfruit seeds" "kidney beans" "substitute" curry recipe source`
- `"jackfruit seed" "potato" substitute "curry" recipe`
- `site:honestcooking.com/jackfruit-seed-curry "chickpeas"`
- `site:honestcooking.com/jackfruit-seed-curry "Ingredients" "jackfruit seeds" cup chickpeas`
- `site:honestcooking.com/jackfruit-seed-curry substitute amount grams chickpeas kidney beans`
- `"If jackfruit seeds are unavailable" "kidney beans"`
- `"can substitute jackfruit seeds with potatoes" "20 to 30"`
- `site:ceyloncooking.com/recipes/kos-ata-kalupol-maluwa "Substitutes"`
- `site:ceyloncooking.com/recipes/kos-ata-kalupol-maluwa substitute "jackfruit seeds" chickpeas amount`
- `site:ceyloncooking.com/recipes/kos-ata-kalupol-maluwa "What to substitute"`
- `site:ceyloncooking.com/recipes/kos-ata-kalupol-maluwa "potato" "grams"`
- `site:ceyloncooking.com/recipes/kos-ata-kalupol-maluwa "kidney beans"`
- `"Matsumae-zuke" substitute recipe alternative ingredient`
- `Matsumae-zuke replacement alternative topping substitute tofu rice pasta recipe`
- `松前漬け 代用 食材 代わり`
- `松前漬け 代用 食材 代わり 郷土料理 食材 置き換え`

Search-result leads whose page could not be opened are explicitly marked above and are not treated as verified support. No search-result popularity or flavor resemblance was promoted to a substitution finding.

## Sources and locators

All pages were searched or opened on **2026-10-19**. IDs prefixed `WP08-R1065` are proposal-local and are not allocated shared-ledger IDs.

| ID | Source | Locator, support, and limit |
| --- | --- | --- |
| Existing `WP03-M-JACKFRUIT-SEEDS-R1061-20261019-S01` | Institut agronomique néo-calédonien (IAC), Agripedia, [Jacque (*Artocarpus heterophyllus*)](https://www.agripedia.nc/ressources-vegetales/plantes-alimentaires/fruits/jacque). | Existing R1061 ledger source; food-use “Graines” section. Retain its seed use/crop context and taste comparison only; no replacement recommendation or ratio. Do not duplicate or reassign this source. |
| Existing `WP03-M-JACKFRUIT-SEEDS-R1061-20261019-S02` | Agence régionale de santé de La Réunion, [Le Jacquier recipe sheet (PDF)](https://www.lareunion.ars.sante.fr/system/files/2021-11/recette-jacquier.pdf). | Existing R1061 ledger source; “Graines de Jacquier” ingredient and preparation text. The 30 g / six-tartine recipe is not a substitute comparison. Preserve source ownership. |
| **WP08-R1065-JACKFRUIT-S01** | Cook with Kushi, [Jackfruit Seed Curry / Bikkand Gashi](https://www.cookwithkushi.com/jackfruit-seed-curry-recipe/). | Recipe introduction, recipe card ingredients, method, and note. Identifies the regional Konkani curry, six servings, 20–30 peeled seeds, pressure cooking, and potato/yam/eggplant alternatives cooked until tender. Does not give substitute amounts or basis; supports only the narrow recipe suggestion, not an active or scaled rule. `sourceKind: culinary_reference`. |
| Search lead; not proposed as a source record | Shashi Charles, [Jackfruit Seed Curry](https://honestcooking.com/jackfruit-seed-curry/), Honest Cooking. | Search-result preview only; the article page returned 403 on open. The preview surfaced chickpeas/cooked kidney beans as alternatives in the curry, but no replacement amount. Do not register or rely on the preview until the page is accessible and its claims can be checked directly. |
| Search lead; not proposed as a source record | CeylonCooking, [Kos Ata Kalupol Maluwa (Jackfruit Seed Curry)](https://ceyloncooking.com/recipes/kos-ata-kalupol-maluwa). | Search-result preview returned the four-serving recipe and frozen-jackfruit-seed suggestion; direct open timed out. The preview did not provide a different-ingredient substitute. Not relied on as direct source evidence. |
| Existing `WP05-SECTIONW-MATSUMAE-ZUKE-R1062-20261019-S01` | Japan MAFF, [Matsumae-zuke, Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/5943/index.html). | Existing R1062 source. Main consumption method and use of marinade; describes common roles but not replacements. Reuse only within its current owner; do not duplicate. |
| Existing `WP05-SECTIONW-MATSUMAE-ZUKE-R1062-20261019-S02` | Japan MAFF, [松前漬け（まつまえづけ）, Nippon Traditional Food Guide](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/matumaezuke.html). | Existing R1062 source. Identity, ingredients, and regional variation. Does not recommend replacing the finished food. Preserve source ownership. |
| **WP08-R1065-MATSU-S01** | Hokkaido Regional Agricultural Administration Office, [松前漬け](https://www.maff.go.jp/hokkaido/suishin/shokuiku/dentoshoku_matumaeduke.html). | Recipe method, notes, lines 100–119: strips of surume and kombu, sauce, refrigeration/mixing, optional kazunoko/chili/yuzu, kelp variation, and statement that ingredients/seasoning vary by household. This source offers recipe variation, not a replacement for the finished preserve; its week-long method is not reinterpreted as safety guidance. `sourceKind: regional_authority`. |
| **WP08-R1065-MATSU-S02** | TubeRecipe transcription of だれウマ’s [松前漬け recipe](https://tuberecipe.com/recipe/8192/detail). | Materials and “Point” section: 18–36 g ika-sōmen; advises using it instead of surume to avoid cutting the harder dried squid and says mentaiko may replace tarako. Component-level suggestions for making one Matsumae-zuke recipe, not replacement of the finished preserve. No baseline surume quantity. Not used to support the target identity’s substitution state. `sourceKind: culinary_reference` (transcription; original creator recipe). |

## Final proposal

- `ingredient-ref-jackfruit-seeds`: recommend `substitutionResearchState: blocked_pending_evidence`, with a blocked, curry-specific finding for the unquantified potato/yam/eggplant recommendations. Record the exact context and source’s tenderness/cooking-time note, but do not populate a numeric replacement or activate any rule. Revisit if an accessible source gives a replacement amount and basis, or a directly tested formulation supports one.
- `ingredient-ref-matsumae-zuke`: recommend `substitutionResearchState: researched_no_supported_substitute` for finished-preserve uses reviewed, with a no-supported finding and the component-level candidates documented as rejected. Preserve all existing identity/source decisions and add no active global or contextual rule.

No changes are proposed to references, forms, active substitution arrays, recipes, or shared ledger files. Preserve all existing generic and branded entries and their scoped evidence.
