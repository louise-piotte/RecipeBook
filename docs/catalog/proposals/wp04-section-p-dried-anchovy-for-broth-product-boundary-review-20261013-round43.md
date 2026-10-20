# WP04 Section P — dried anchovies for broth product-boundary review (round 43)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only Canadian/Québec naming, product boundary, ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Hold the dried-anchovy-for-broth product state outside active references, forms, and the shared ledger until a bundled recipe requests it with enough product context. Add no alias, form, measure, recipe link, conversion, yield, or substitution now.
- **Write scope:** This review changed this proposal only; it made no shared catalog, ledger, checklist, roadmap, recipe, code, or batch README changes.
- **New source-ID prefix:** `WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-`. The prefix was absent from the active ledger and archive before this review; IDs below remain local to this proposal.

## Bounded gap and decision

The live checklist leaves preservation forms open and separately keeps fish powder, fish balls, and surimi coverage open ([preserved-fish section](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207), [fish-powder section](../../RecipeBook-global-ingredient-catalog-plan.txt#L4285)). The candidate reviewed here is the product-specific **dried anchovy for broth** listing sold by Canadian retailer The K Mart. A Québec City retailer lists the French product name **anchois séchés**. These sources establish a named dried product in the Canadian market; they do not establish bundled recipe demand or one universal dried-anchovy preparation. Keep it held.

Use **dried anchovy for broth** only to describe the cited Suhyup retailer listing. Use **anchois séchés** as the Québec retailer's product wording. OQLF supplies the underlying French term `anchois` and English `anchovy` for the Engraulidae family; it does not standardize a product-specific phrase for dried anchovies. **Anchois séchés pour bouillon** is a transparent descriptive rendering of the English listing, not an OQLF term or a French label verified on that package. [S01–S03]

Do not infer a scientific species or generalize the Suhyup product to every dried anchovy, every broth-grade anchovy, or all Engraulidae. The retailer lists `Anchovy 100%` and origin `Republic of Korea` but does not provide a scientific name or a complete package-label image. The Québec listing has no ingredient panel or product size and currently shows the item as sold out. [S01–S02]

Keep this candidate distinct from dried anchovy powder / `myeolchi garu`, salted or fermented anchovies / `myeolchi-jeot`, anchovy paste, Bonga dried fish powder, dried bonito / katsuobushi, fish stock, and cooked anchovy side dishes. A Montréal restaurant menu places `Myulchee (dried anchovies) Bokkum` under banchan, a prepared side-dish category; it does not document a plain dried ingredient. The previous powder packet concerns ground fish and a Canadian extract/carrier blend; the jeotgal packet concerns a salted fermented product. Neither allocates this dried fish product. [S05, R01]

## English and Québec French naming boundary

| Wording | Evidence and limit |
|---|---|
| **dried anchovy for broth** | The K Mart product title is `Suhyup Dried Anchovy for Broth 1.5KG`; its listing describes a Korean-origin pack selected for broth-making and gives `Anchovy 100%` as the ingredient. The listing is currently marked sold out and does not give a scientific species or detailed preparation. [S01] |
| **dried anchovies** | Chez Bong's Montréal menu uses `dried anchovies` in `Myulchee (dried anchovies) Bokkum`, under its banchan section. This corroborates the English phrase in a prepared side-dish name, not as the label for a plain pantry product. [S05] |
| **anchois séchés** | Marché des Continents in Québec City uses this exact French product title. Its page does not state the package size, fish species, ingredient declaration, or preparation beyond the dried product wording; it currently shows sold out. [S02] |
| **anchois / anchovy** | OQLF's GDT pairs French `anchois` with English `anchovy` and identifies the edible-fish group as Engraulidae. This supports the base bilingual term and family scope, not a dried-product name or individual species. [S03] |
| **anchois séchés pour bouillon** | Proposed only as a descriptive French rendering of The K Mart's English use context. No OQLF entry or package label reviewed here standardizes this complete phrase. |

## Exact ownership and archive audit

The live package contains **1,369 active references**, **100 forms**, **64 legacy-import candidates**, and **1,699 research-ledger records**. Exact checks covered reference names and aliases, form labels and match terms, legacy-candidate names and aliases, ledger IDs/source text, the Section P plan, proposals, and batch notes. No active reference, form, legacy candidate, or dedicated ledger decision owns `dried anchovy`, `dried anchovies`, `dried anchovy for broth`, `anchois séchés`, or `anchois séchés pour bouillon`. [R01]

| Nearby live owner or prior mention | Exact boundary |
|---|---|
| `ingredient-ref-anchovy` / `anchovy` / `anchois` | Active family-scoped edible-fish identity for Engraulidae; no dried form is attached. |
| `ingredient-ref-anchovy-paste` / `anchovy paste` / `pâte d’anchois` | Separate paste product; it does not own dried anchovy. |
| `ingredient-ref-bonga-dried-fish-powder` / Bonga dried fish powder | Source-specific single-fish powder; it does not own generic dried fish or dried anchovy. |
| `ingredient-ref-fish-stock` / fish stock / `fumet de poisson` | Stock identity; it does not own dried fish used to make broth. |
| Prior anchovy-powder hold | Discusses ground `myeolchi garu` and extract/carrier-containing prepared-dressing ingredients; not whole or otherwise unground dried anchovy. |
| Prior Korean jeotgal review | Mentions `myeolchi-jeot` / salted anchovies as a separate fermented product and leaves it for individual product review; it is not a dried-only identity. |

The earlier generic preserved-fish review keeps universal dried forms inactive absent an exact recipe/product need. That broad decision is relevant context, but no prior packet makes a product-specific allocation for dried anchovy for broth. The nearby active anchovy and anchovy-paste rows, Bonga powder, dried bonito, and other dried seafood remain separate. [R01]

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, and punctuation; prefer complete word-phrase matches across reference and form terms; use substring fallback only when no phrase matches. The hypothetical is a **standalone product reference** displayed as **dried anchovy for broth / anchois séchés pour bouillon**, using the Canadian product's singular English title and the Québec retailer's plural French wording, with no aliases or forms. This projection is an audit scenario, not an integration proposal.

| Query | Current result | Hypothetical result | Picker effect |
|---|---|---|---|
| `dried anchovy for broth`; `dried anchovy`; `anchois séchés`; `anchois séchés pour bouillon` | None | Dried anchovy for broth only | The product-specific terms become searchable in both languages. |
| `dried anchovies` | None | None | A plural English variant is not covered by the singular Canadian product title without an extra alias. |
| `anchovy`; `anchois` | Anchovy; anchovy paste | Anchovy; anchovy paste; dried anchovy for broth | A broad family query also surfaces a distinct processed product. |
| `dried` | Existing broad set of dried ingredients, including Bonga dried fish powder, dried bonito, dried oyster, dried scallop, and dried shrimp | Existing set plus dried anchovy for broth | A generic process query gains another product. |
| `fish powder` | Bonga dried fish powder | Bonga dried fish powder | No effect if the candidate has no fish-powder alias. |
| `myeolchi` | None | None | No Korean transliteration is proposed as an alias; the current normalizer strips Hangul, so a Hangul query normalizes empty and does not filter the picker. |

A form attached to `ingredient-ref-anchovy` would keep the product under that family-level owner rather than add a separate result, but it would imply a reusable dried state for that broad identity. The package and recipe corpus do not establish which dried-anchovy state should be modeled. Keep both a standalone row and a generic active form out of the picker for now.

## Bundled recipe demand

The scan covered all manifest-listed bundled recipes: **114 files and 1,123 ingredient rows**. It searched full recipe JSON and ingredient rows for `dried anchovy`, `dried anchovies`, `dried anchovy for broth`, `anchois séchés`, `anchois séchés pour bouillon`, `myeolchi`, `멸치`, and `anchovy for broth`. It found **zero matching recipe files and zero matching ingredient rows**. This establishes no demand in the bundled recipe corpus only; it does not cover recipes outside the bundle. [R01]

## Numeric and substitution limits

The K Mart listing reports a **1.5 kg package** and a nutrition panel per **100 g**, but the page marks that item sold out and gives no household measure, count, serving basis, dried-to-rehydrated yield, or broth extraction ratio. The Québec listing provides no package size. Do not treat the package amount or nutrition panel as a recipe portion or transferable measure. [S01–S02]

No reviewed source or recipe establishes density, mass-to-volume mapping, count weight, rehydration yield, edible yield, salinity, or stock-making ratio for the exact candidate. Do not add an active measure, density, unit mapping, package yield, preparation conversion, or dried-to-fresh yield.

No reviewed recipe supports substituting dried anchovies for broth for fresh anchovy, anchovy paste, anchovy powder, Bonga fish powder, dried bonito/katsuobushi, fish stock, salted/fermented anchovies, or another dried seafood. Similar broth use does not establish ingredient composition, extraction strength, salt level, or a usable ratio. Add no global conversion or contextual substitution.

## Recommended next action

Keep dried anchovies for broth unallocated and the Section P preserved-fish item open. Revisit only when a bundled recipe names the product or its package and gives enough context to distinguish dried anchovies used for broth from another dried, salted, powdered, or prepared anchovy product. At that point, match the exact package declaration to a form under the family-scoped anchovy reference only if that form is supported; otherwise keep the product identity separate. Rerun exact ownership, picker, and quantity review before integration.

## Source register

Online pages were accessed on 2026-10-13. These proposal-local source IDs do not create ledger records.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-S01** | The K Mart, [Suhyup Dried Anchovy for Broth 1.5KG](https://www.thekmart.ca/en/products/%EC%88%98%ED%98%91-%EB%8B%A4%EC%8B%9C%EB%A9%B8%EC%B9%98-1-5kg), product title, description, ingredients, origin, and nutrition panel. | Canadian retailer describes a 1.5 kg Korea-origin item for broth-making; lists `Anchovy 100%` and nutrients per 100 g. The page marks the SKU sold out. It supplies no scientific name, complete package-label image, serving basis, or transferable broth ratio. |
| **WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-S02** | Marché des Continents, Québec City, [Anchois séchés](https://marchedescontinents.ca/products/anchois-seches), product title and retailer address. | Supports the Québec retailer's French product wording and local listing. The page currently shows sold out and gives no package size, ingredient panel, species, or preparation details. |
| **WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-S03** | Office québécois de la langue française, [GDT: anchois](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois), preferred term and English translation. | Pairs `anchois` with `anchovy` and identifies family Engraulidae. The entry was updated in 2011 and does not establish a processed-product term or individual species. |
| **WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-S04** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Descriptive words about the true nature of fish products.” | Current federal guidance says condition descriptors such as `dried` may be needed to distinguish a fish product's true nature. It does not prescribe a RecipeBook form, recipe measure, species, or dried-anchovy preparation. |
| **WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-S05** | Chez Bong, Montréal, [Shop/Magasin](https://www.chezbong.ca/shop), Banchan section and `Myulchee (dried anchovies) Bokkum` listing. | Québec food-service menu wording for a prepared anchovy side dish. It supports keeping the cooked banchan distinct from plain dried fish; it does not identify the packaged raw/dried product, species, or a recipe ingredient quantity. |
| **WP04-SECTIONP-DRIED-ANCHOVY-20261013-R43-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and the proposal/archive search. | Static audit used the live ownership files, search implementation, archive and plan, plus all manifest-listed recipe rows. It found no dedicated dried-anchovy owner and 0 of 114 recipe files / 1,123 ingredient rows matching the reviewed terms. Adjacent powder and salted-fermented anchovy mentions remain distinct. |

No app tests or emulator checks were run. This is a proposal-only documentation change; catalog data and app behavior were not modified.
