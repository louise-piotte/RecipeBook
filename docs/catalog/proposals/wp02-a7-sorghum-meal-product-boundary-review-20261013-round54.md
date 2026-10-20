# WP02 A7 — Sorghum Meal Product-Boundary Review (R54)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. Recommend an unresolved ledger-only candidate; keep the product out of active references and forms. This file changes no shared catalog, ledger, legacy, recipe, plan, roadmap, batch, or generated file.
- **Proposal-local source IDs:** `WP02-A7-SORGHUM-MEAL-20261013-R54-S01` through `S05`. The prefix is unique in the proposal archive and research ledger; these citations are not ledger records.
- **Scope:** The human-food milling product named **sorghum meal**. Keep it separate from grain sorghum, sorghum flour, sorghum grits, sorghum semolina, regional Mabele products, and the prior malted/toasted-sorghum-flour candidates. This review does not change those existing identities or holds.

## Recommendation

**Record `candidate-sorghum-meal` as unresolved and keep it unallocated.** Do not add an active bilingual reference, alias, form, legacy identity, measure, density, unit mapping, conversion, yield, recipe link, or substitution.

The product class is supported by current milling-company and Canadian distributor pages. Nu Life Market distinguishes meal from its finely milled sorghum flour and offers whole-kernel and pearled-grain meal products with coarse, medium, and fine grind profiles [S01–S02]. Dempsey Food's current Canada product-line page lists Nu Life sorghum meal alongside sorghum flour and whole grain [S03]. These sources establish a real human-food product family, but they do not establish one generic meal grind or a Québec consumer name.

Québec terminology and product labels do not resolve the missing display. Les Aliments Kabeya International lists `farine de sorgho` as a powdery product made from dried, ground sorghum seeds, and separately lists `grain de sorgho` as dry sorghum grains that are slightly ground for porridge [S05]. The page does not use `sorghum meal` or offer a meal-specific French display. The exact French phrases `farine de sorgho`, `gruau de sorgho`, and `semoule de sorgho` already belong to distinct active flour, grits, and semolina references. Do not reuse any of them for meal.

Canada's current customs tariff defines “groats” and “meal” for heading 11.03 as fragmented cereal products and sets a sieve criterion that includes grain sorghum [S04]. That is a customs classification rule, not a consumer milling specification or Québec French label. Codex's existing sorghum-flour standard likewise keeps sorghum meal outside the standardized flour definition; it does not establish a universal boundary among meal, grits, and semolina [existing source `WP02-S33`].

The candidate warrants an unresolved ledger record because current sources establish a food product class and distinguish it from flour. They do not support a source-neutral picker row or an exact Québec French display. Keep the previous Mabele-name hold separate: A6 R12 kept regional `mabele`/`mabela` terms off sorghum grain and flour, and said the Mabele-meal product question belonged in A7 if resumed. R12 did not allocate a generic sorghum-meal row. This proposal does not add those regional spellings to the proposed candidate.

| Product or phrase | Disposition | Boundary |
| --- | --- | --- |
| `sorghum meal` | **Unresolved ledger-only candidate** | Human-food meal products exist, but current manufacturer evidence spans distinct grain preparation and multiple grind sizes; no Québec French product display is established. |
| `white whole sorghum meal` | **Keep as source-specific evidence on the candidate** | Nu Life identifies this coarse meal as made from the entire white grain. It is a defined manufacturer product, not a basis for making bare `sorghum meal` mean whole grain or coarse grind. |
| `white pearled sorghum meal` | **Keep separate; no active allocation** | Nu Life lists it as another meal product. No Québec name or general relationship to the whole-grain product is established. |
| `sorghum flour / farine de sorgho` | **Retain active identity unchanged** | The existing row covers the flour product. Do not add `meal` or `sorghum meal` as an alias. |
| `sorghum grits / gruau de sorgho` | **Retain active identity unchanged** | The existing row owns the exact French phrase `gruau de sorgho`; do not move or duplicate it. |
| `sorghum semolina / semoule de sorgho` | **Retain active identity unchanged** | The existing row owns this source-backed semolina phrase; do not use it as a meal translation. |
| `grain sorghum / sorgho à graine` | **Retain active identity unchanged** | Whole grain is not a meal alias or form. |
| `mabele`, `mabele meal`, `mabela`, `amabele` | **Keep the A6 R12 disposition separate** | Do not attach regional names to this generic meal candidate; R12 identified separate meal/flour and cross-grain naming risks. |
| Malted or toasted sorghum flour | **Keep R26/R36 candidates separate** | Their processing qualifiers and unresolved names do not define plain sorghum meal. |

No measures, density, forms, conversions, yields, recipe links, or substitutions are proposed.

## Checklist, archive, and exact-ownership audit

The active [WP02 A7 parent item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1449) remains open for other grain meals, malted/toasted flour identities, and gluten-flour equivalence. R51 quinoa meal, R52 teff meal/semoule, and R53 pearl-millet grits are distinct decisions and are not reopened here.

The archive has adjacent sorghum decisions, but none allocates or records a standalone generic sorghum-meal identity:

- A6 R12 held `mabele`, `mabele meal`, `mabele flour`, `amabele`, and `mabela` out of grain/flour aliases, and said the Mabele-meal product question belonged in a separate A7 grain-meal review if resumed. It did not create a generic sorghum-meal candidate or French display.
- WP03's sorghum-grits and sorghum-semolina reviews mention meal as a separate neighboring phrase and exclude it from those identities. They do not decide whether meal merits an A7 candidate.
- A7 R26 and R36 concern source-named toasted white sorghum flour and malted sorghum flour. They do not resolve an unqualified meal product.

At this working-tree snapshot the package contains **1,378 active references** and **100 ingredient forms**; the legacy-import file contains **63 candidates**, and the research ledger contains **1,707 records**.

| Current record | Current name and category | Current aliases and active numeric/form fields | Relevance |
| --- | --- | --- | --- |
| `ingredient-ref-grain-sorghum` | `grain sorghum / sorgho à graine`; `GRAIN_AND_CEREAL` | English `jowar whole`, `guinea corn`; French `sorgho en grains`, `sorgho en grain`; null default density, empty unit mappings, no attached form | Owns grain, not the meal product. |
| `ingredient-ref-sorghum-flour` | `sorghum flour / farine de sorgho`; `FLOUR_AND_STARCH` | English `jowar flour`, `jowar atta`, `guinea corn flour`; null default density, empty unit mappings, no attached form | Existing flour display owns `farine de sorgho`. Its source-specific label observation is not transferable to meal. |
| `ingredient-ref-sorghum-grits` | `sorghum grits / gruau de sorgho`; `GRAIN_AND_CEREAL` | English `sorghum grit`; null default density, empty unit mappings, no attached form | Owns the exact French grits phrase; meal is not an alias. |
| `ingredient-ref-sorghum-semolina` | `sorghum semolina / semoule de sorgho`; `GRAIN_AND_CEREAL` | English `jowar rava`, `sorghum rava`; null default density, empty unit mappings, no attached form | Owns the exact French semolina phrase. |
| `ingredient-ref-puffed-sorghum` | `puffed sorghum / sorgho soufflé`; `GRAIN_AND_CEREAL` | English `popped sorghum`, `sorghum puffs`; null default density, empty unit mappings, no attached form | Separate processed grain product. |
| `candidate-toasted-white-sorghum-flour`; `candidate-malted-sorghum-flour` | Unresolved source-specific candidates | No active rows or forms | Keep both A7 flour candidates unchanged and separate. |

Exact normalized searches of current reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs found no owner for `sorghum meal`, `whole grain sorghum meal`, `white whole sorghum meal`, `white pearled sorghum meal`, or `candidate-sorghum-meal`. The live ledger has incidental source and decision mentions of meal under other sorghum records, but no record with the proposed candidate ID. The legacy list has no sorghum-meal entry. The forms file has no sorghum form. No existing numerical evidence on sorghum grain or flour is assigned to the meal candidate.

The pre-draft audit found no `candidate-sorghum-meal` among live reference IDs, form IDs, legacy candidate IDs, or ledger record IDs. All five R54 source IDs were absent from the live ledger and proposal archive before this file was created. If integrated, record only the reviewed evidence and an unresolved identity decision; do not change neighboring records' identity states or numeric evidence.

## Picker and search consequences

The static picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes English/French names and aliases, prefers complete phrase matches, and falls back to substring matches. This is a projection over the live data, not an app-picker test.

| Query | Current picker result |
| --- | --- |
| `sorghum meal`, `whole grain sorghum meal`, `white whole sorghum meal`, `white pearled sorghum meal` | No result. |
| `sorghum flour`, `farine de sorgho` | `ingredient-ref-sorghum-flour`. |
| `sorghum grits`, `gruau de sorgho` | `ingredient-ref-sorghum-grits`. |
| `sorghum semolina`, `semoule de sorgho` | `ingredient-ref-sorghum-semolina`. |
| `sorghum`, `sorgho` | Five references: grain sorghum, puffed sorghum, sorghum flour, sorghum grits, and sorghum semolina. |
| `meal` | Five references: cornmeal, cracker crumbs, matzo meal, rye meal, and whole wheat meal. |

Because the source-backed French candidates are already allocated to different products, adding `farine de sorgho`, `gruau de sorgho`, or `semoule de sorgho` to a meal row would create duplicate French ownership. A hypothetical active `sorghum meal` row would also expand the broad `sorghum` result set and the broad `meal` result set. The proposed ledger-only candidate does not alter picker results. Keep all candidate phrases out of active names and aliases until a source-supported bilingual product boundary is available.

## Product, language, and recipe-demand audit

Nu Life Market's current `Sorghum Meal` page presents meal as a custom-milled commercial ingredient and lists products made from whole white or pearled sorghum [S01]. Its technical team offers coarse, medium, and fine meal profiles for different applications [S01]. The separate White Whole Sorghum Meal page identifies one product as coarse and made from the entire white grain [S02]. These are useful primary milling descriptions, but they show that the bare product name does not identify one fixed grind or one grain preparation.

Dempsey Food's Canadian product-line page lists Nu Life Market under its Canada section and describes a sorghum range including meal, flour, and whole grains [S03]. It establishes current Canadian ingredient-distribution context, not an exact consumer SKU, package label, stock status, or French display. The Québec Kabeya product list supplies local French contrast: `farine de sorgho` is described as powdery ground seed, while `grain de sorgho` is described as dry grain lightly ground for porridge [S05]. The page does not identify either one as `sorghum meal`, and its wording cannot be generalized to all Québec products.

The 2025 Canadian customs tariff offers a technical classification distinction: for heading 11.03, `groats` and `meal` are fragmented cereal products; its cereal table includes grain sorghum and the note sets a 1.25 mm sieve criterion for non-maize cereals [S04]. This classification does not prescribe a household product, differentiate meal from grits in ordinary retail language, or provide a French display. Existing OQLF/TERMIUM evidence for `gruau de sorgho` is already attached to the active sorghum-grits identity; the WP03 semolina record owns `semoule de sorgho`. Existing Codex source `WP02-S33` defines the standardized flour scope and excludes sorghum meal from that standard. None of these sources licenses transferring a neighboring French name to meal.

I scanned the complete serialized files and ingredient rows for every manifest-listed recipe: **114 recipe files and 1,123 ingredient rows**. Searches included `sorghum meal`, `whole grain sorghum meal`, `white whole sorghum meal`, `white pearled sorghum meal`, coarse/fine sorghum meal, `farine de sorgho`, `gruau de sorgho`, `semoule de sorgho`, and the broader `sorghum`/`sorgho` terms. The current corpus has **zero file hits and zero ingredient-row hits** for each term. There is no bundled demand, recipe link, or recipe-specific reason to add this candidate.

## Measurement and substitution limits

- No form or form hint belongs to a sorghum-meal product. Keep meal outside active ingredient forms.
- The Nu Life source describes industrial grind profiles and bulk manufacturer products, not household spoon/cup weights or a kitchen density [S01–S02]. Do not transfer package quantities, grain measurements, or the existing sorghum-flour label observation.
- No source establishes a general preparation ratio, cook time, cooked yield, or dry-to-cooked form for this generic candidate. Mabele porridge preparation remains regional and product-specific; this review does not reopen or generalize the A6 R12 Mabele evidence.
- No tested source supports global or contextual substitution between sorghum meal, flour, grits, semolina, whole sorghum, or another cereal. Add no substitution rule.

## Proposal-local source register

Sources were checked on **2026-10-13**. R54 IDs are local references for this proposal and are not ledger records. Existing OQLF and Codex evidence is referenced by its current ledger ID instead of being registered again.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Nu Life Market, [Sorghum Meal](https://nulifemarket.com/glutenfree/meal/), product overview, meal variants, grind profiles, and applications. | Current manufacturer page calls sorghum meal a custom-milled food ingredient, lists whole and pearled product variants, and offers coarse, medium, and fine grind profiles. | B2B manufacturer range; no Canadian consumer label, Québec French display, or single generic grind. |
| **S02** | Nu Life Market, [White Whole Sorghum Meal](https://nulifemarket.com/gf/white-whole-sorghum-meal/), product description and package formats. | Names a coarse meal made from the entire white sorghum grain and distinguishes it from other meal products. | One manufacturer-specific product; bulk sizes are packaging, not household measures or generic meal specifications. |
| **S03** | Dempsey Food, [Product Lines — Canada](https://www.dempseyfood.com/products-lines-canada), Nu Life Market entry under the Canada section. | Current Canadian distributor page lists sorghum meal, flour, and whole grains within Nu Life's product range. | Establishes commercial distribution context, not a retail label, current stock, exact meal SKU, or Québec French name. |
| **S04** | Statistics Canada, [Customs Tariff 2025, Section II: Vegetable Products](https://www150.statcan.gc.ca/n1/pub/65-209-x/2025001/section2-eng.htm), Chapter 11, cereal table and note 3. | Includes grain sorghum in the cereal table and defines `groats`/`meal` for heading 11.03 as fragmented cereal products meeting a specified sieve threshold. | Customs classification only; not a consumer milling standard, meal/grits synonym ruling, or French product display. |
| **S05** | Les Aliments Kabeya International, [Nos produits — Québec](https://www.lesalimentskabeya.com/nos-produits.php), entries `Farine de sorgho` and `Grain de Sorgho`. | Current Québec-facing product list distinguishes a powdery ground-sorghum flour from dry sorghum grain described as lightly ground for porridge. | This seller's product descriptions do not name sorghum meal or establish a generic Québec French meal term. |

## Integration handoff

If accepted, record `candidate-sorghum-meal` as `needs_clarification` with these source limits and an unresolved decision. Keep all current active references, forms, legacy candidates, recipes, measurements, and substitutions unchanged. Reopen active allocation only after a source establishes a product scope that separates meal from flour, grits, and semolina and a Québec French display that does not duplicate those existing owners.

No tests were run because this is a proposal-only documentation change and no shared JSON or application files were edited.


Root disposition (2026-10-13): accepted as unresolved ledger-only `candidate-sorghum-meal`, with
identity `needs_clarification`, measurement research `researched_no_supported_value`, and substitution
research `researched_no_supported_substitute`. The active catalog, forms, legacy candidates, recipe
links, and runtime numeric/substitution behavior remain unchanged. No tests were run because this adds
database JSON research data under the updated `AGENTS.md` rule. See
`docs/catalog/batches/wp02-a7-sorghum-meal-candidate-integration-20261013/README.md`.
