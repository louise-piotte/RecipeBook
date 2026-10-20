# WP04 Section P — Fumoir d’Antan smoked scallop product-boundary review (round 44)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only Canadian/Québec product naming, active ownership, picker, bundled-recipe demand, and numeric/substitution review.
- **Recommendation:** Keep the exact Fumoir d’Antan smoked-scallop product unallocated in the active references, forms, and shared ledger until a bundled recipe requests it. Add no alias, form, measure, density, unit mapping, recipe link, conversion, yield, or substitution now.
- **Write scope:** This proposal file only. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch README was changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-`. The prefix and this filename were absent from the checked proposal/archive, plan, batch, and ledger files before this packet. The proposal-local source IDs below are not ledger records.

## Bounded gap and decision

The live [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) leaves smoked, salt-cured, dried, canned, oil- or water-packed, and fermented seafood forms open. Its existing [preservation-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) kept generic preservation identities and universal forms inactive without an exact product or recipe request. This packet follows up on one exact product that was not individually reviewed there: **Fumoir d’Antan smoked scallops / pétoncle fumé d’Antan**, sold by a Montréal fishmonger and listed by Metro.

Keep this branded, source-specific product as a research candidate. The Québec retailer uses `Pétoncle fumé d’Antan`; its English collection uses `Smoked scallops d’Antan`, and Metro lists the same maker as `Smoked Scallop`. Those product labels establish a real Canadian-market item, but they do not establish that this product should be a new ingredient identity or a general smoked form of all scallops. The full bundled corpus has no matching demand. [S01–S03]

If a future bundled recipe calls for this product, first compare its exact wording and package against the maker’s current label. Then decide whether its scope belongs in a narrow product identity or a form under the existing generic scallop reference. Do not extend this evidence to other smoked scallops, species, or producers.

## Naming and product boundary

| Wording or evidence | What it supports | Limit |
|---|---|---|
| **Pétoncle fumé d’Antan** | La Mer’s current French product detail and listings use this name. The product detail calls it an artisanal frozen item from Fumoir d’Antan. [S01–S02] | The retailer page does not show an ingredient panel, scallop species, smoke method, salt level, or ready-to-eat statement. |
| **Smoked scallops d’Antan** | La Mer’s English collection uses this source wording. Metro lists the maker’s item in the singular as **Le fumoir d’Antan Smoked Scallop**. [S02–S03] | These are seller labels for the named product. They do not support bare `smoked scallop(s)` as a family-wide alias or identity. |
| **Pétoncle / scallop** | The reused OQLF GDT source pairs Québec `pétoncle` with English `scallop` and scopes the term to Pectinidae. OQLF notes that Québec catches include Iceland and sea scallops. DFO’s current bilingual identification pages list multiple harvested scallop species in Canada. [existing `WP04-FRESH-SCALLOP-IDENTITY-20261012-S01`; S06] | These sources establish the broad food-name and species context, not the species used in this product. OQLF’s entry was last updated in 1998; DFO’s identification page was modified in 2021. |
| **Lightly smoked product from the Magdalen Islands** | A 2020 regional producer directory describes Fumoir d’Antan’s scallops as vacuum packed, lightly smoked, in 200 g and 1 kg formats, and consumable as-is or warmed. [S04] | This is dated producer-profile material. It does not name a species, smoke temperature or duration, ingredients, salt level, safety status, or the current retail pack. Do not treat “as-is” as a general handling or food-safety instruction. |

Keep the candidate separate from the generic scallop reference, dried scallop / `pétoncle séché`, scallop roe, and unrelated smoked fish or seafood. Do not map it to a scallop species from the Magdalen Islands description, or infer that smoked products from other suppliers share its process.

## Exact ownership audit

The live reference catalog contains **1,369 references**, the forms file **100 forms**, the legacy file **64 candidates**, and the research ledger **1,699 records**. Exact normalized-key checks covered active reference names/aliases, form labels/match terms, legacy names/aliases, ledger record IDs and source text, and the prior proposal/archive search. The normalization follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Exact key or owner | Current owner and effect |
|---|---|
| `ingredient-ref-scallop` | Active `PROTEIN` reference **scallop / pétoncle**. English aliases: `scallops`, `scallop meat`; French alias: `pétoncles`. Density is null and unit mappings are empty. Its ledger research states for measurements and substitutions remain `not_yet_researched`. |
| `ingredient-ref-dried-scallop` | Separate active **dried scallop / pétoncle séché** reference, with `conpoy` and plural aliases. Its ledger records no supported numeric value or substitution. It has no attached form. |
| Fumoir d’Antan product terms | No exact active reference, form, legacy candidate, or dedicated ledger candidate owns `smoked scallop`, `smoked scallops`, `smoked scallops d’Antan`, `pétoncle fumé`, `pétoncles fumés`, `pétoncle fumé d’Antan`, or `Fumoir d’Antan`. Neither active scallop reference has an attached form. No product-specific candidate ID is allocated or proposed here. |

The exact product search returned no prior matching Section P proposal, integration batch, or source-ID collision. The two existing scallop references remain distinct; this review allocates neither a product identity nor a form.

## Picker/search projection

The picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) checks complete word-phrase matches first and uses substring fallback only if no phrase matches. The projection below compares the live references and forms with a **hypothetical display-only row** using the source-backed pair `Smoked scallops d’Antan / pétoncle fumé d’Antan`, with no aliases or forms. It is a search-impact analysis, not an integration recommendation.

| Query | Current results | With hypothetical row |
|---|---|---|
| `scallop` | Generic scallop; dried scallop | Same two. The English retailer wording is plural `scallops`, so it does not add a complete-word match for singular `scallop`. |
| `scallops` | Generic scallop; dried scallop | Those two plus the Fumoir d’Antan product. |
| `pétoncle` | Generic scallop; dried scallop | Those two plus the Fumoir d’Antan product. |
| `smoked scallops` | No result | Fumoir d’Antan product only. |
| `smoked scallop` | No result | Fumoir d’Antan product through substring fallback. |
| `pétoncle fumé` or `pétoncle fumé d’Antan` | No result | Fumoir d’Antan product only. |
| `smoked` | Montreal smoked meat, Peruvian Amazon cecina, smoked paprika, smoked salt, smoked tofu | Those five plus the Fumoir d’Antan product. |

This entry would make broad plural `scallops` and French `pétoncle` searches offer a third product while leaving singular `scallop` at two results. It would also make `smoked` return another unrelated ingredient/product result. The exact product terms are currently unavailable in the picker, and the bundle does not request them. Keep the active search results unchanged.

## Bundled recipe demand

The full manifest-listed bundle was scanned: **114 recipe files and 1,123 ingredient rows**. Each complete UTF-8 recipe document and each ingredient row was checked for `scallop`, `scallops`, `smoked scallop(s)`, `Fumoir d’Antan`, `pétoncle`, `pétoncles`, `pétoncle fumé`, and `pétoncle fumé d’Antan`. The scan found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe link is supported.

Fumoir d’Antan’s external [Smoked scallop crostini](https://fumoirdantan.com/en/smoked-scallop-crostini/) recipe, dated 2021-05-10, calls for one 200 g package of smoked scallops. It does not state a serving count. This is evidence of one maker-specific external recipe use and does not create demand in the bundled RecipeBook corpus or a standard portion. [S05]

## Numeric, conversion, and substitution limits

The numeric sources disagree about the retail package quantity. La Mer’s French and English collection listings show **150 g**, while its linked product detail shows **200 g**. Metro also lists the maker’s item as **200 g**, but the page marked it out of stock when reviewed. Fumoir d’Antan’s 2020 directory lists 200 g and 1 kg producer formats; the maker’s 2021 crostini recipe uses one 200 g package. These values are source- and page-specific package/use observations, not serving sizes. [S01–S05]

No reviewed source supports a density, household measure, count-to-mass mapping, edible yield, cooking yield, or package yield for this exact product. Add no density or unit mapping. Do not use the 200 g recipe quantity to repair the retailer’s 150 g listing or to create a general serving conversion.

No source or bundled recipe supports substituting the Fumoir d’Antan product for fresh, frozen, or dried scallops, scallop roe, another smoked seafood product, or another scallop species. The manufacturer recipe is a use example, not a substitute comparison. Add no global form conversion, contextual substitution, warning, or recipe-line substitution link.

## Next action

Keep the Fumoir d’Antan smoked scallop product unallocated and the Section P preserved-seafood item open. Revisit only when a bundled recipe names the product or otherwise supplies a matching package and preparation context. Then resolve whether the recipe should link to a narrow producer/product identity or to a supported form on `ingredient-ref-scallop`, and repeat the live ownership, picker, and numeric review. Do not assign a species or make a family-wide smoked-scallop claim from the current sources.

## Source register

Online sources were checked on 2026-10-13. The proposal-local source IDs do not create ledger records.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-S01** | Poissonnerie La Mer, [Pétoncle fumé d’Antan product detail](https://www.lamer.ca/products/petoncle-fume-200-gr), title, package title, and description. | French product title says 200 g, artisanal, frozen, and from Fumoir d’Antan. The page gives no ingredient panel, species, or smoke method. Seller details can change. |
| **WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-S02** | Poissonnerie La Mer, [French Pétoncles collection](https://www.lamer.ca/collections/petoncles) and [French smoked-products collection](https://www.lamer.ca/collections/produits-fumes); [English smoked-products collection](https://www.lamer.ca/en/collections/produits-fumes). | Current collection titles give French `Pétoncle fumé d’Antan - 150 gr` and English `Smoked scallops d’Antan - 150 gr`. The linked detail page says 200 g, so do not choose one collection figure as a reliable universal package quantity. |
| **WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-S03** | Metro, [Le fumoir d’Antan Smoked Scallop](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/petoncle-fume/p/627843771494), product number `627843771494`, title and package weight. | Lists `Smoked Scallop`, 200 g; the page marked it out of stock. Its product-information note directs consumers to the physical package for current ingredients and allergen details. This does not confirm species or current availability. |
| **WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-S04** | La Gamme Gaspésie–Îles, [Répertoire des produits régionaux, octobre 2020](https://lagammegaspesieiles.ca/wp-content/uploads/2020/10/GAMME-Repertoire-Octobre2020-Web.pdf), p. 3, `Pétoncles fumés`. | Describes Fumoir d’Antan Magdalen Islands scallops as vacuum packed, lightly smoked, and sold in 200 g and 1 kg formats; says they may be eaten as-is or warmed. This is a 2020 producer-profile entry, not a current package declaration, species identification, or safety standard. |
| **WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-S05** | Le Fumoir d’Antan, [Smoked scallop crostini](https://fumoirdantan.com/en/smoked-scallop-crostini/), dated 2021-05-10, recipe ingredient list. | Uses one 200 g package of smoked scallops in one external recipe. No serving count or general portion is given. |
| **WP04-SECTIONP-SMOKED-SCALLOP-DANTAN-20261013-R44-S06** | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) and [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm), scallop sections; pages modified 2021-06-09. | Lists separate harvested scallop species in Canada in English and French. Species context only; it does not identify the species in Fumoir d’Antan’s product or establish product processing, measures, or substitutions. |
| **Reused `WP04-FRESH-SCALLOP-IDENTITY-20261012-S01`** | Office québécois de la langue française, [GDT: pétoncle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199064/petoncle), preferred term, English equivalent, and taxonomic note. | Reused from the existing scallop ledger record; pairs `pétoncle / scallop` and gives Pectinidae context. Last updated in 1998; it does not name a smoked product or identify this producer’s scallop species. |

The only source IDs newly assigned here are S01–S06 under the R44 prefix above. They remain in this proposal only.
