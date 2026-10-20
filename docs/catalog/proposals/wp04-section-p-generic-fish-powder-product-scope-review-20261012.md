# WP04 Section P — generic fish-powder product-scope review

- **Review date:** 2026-10-12.
- **Root disposition:** documentation-only hold; no generic fish-powder row or candidate is allocated.
- **Scope:** Generic `fish powder / poudre de poisson`, excluding the already integrated source-scoped Bonga dried fish powder and the separate anchovy-powder review. This review does not reopen fish balls, surimi, dried bonito, fish stock, or preserved-fish states.
- **Disposition:** **Hold** a generic active reference, alias, or form. Current Québec and Canadian retail pages confirm both generic phrases in food-product listings, but the listings do not establish one stable composition, species scope, or product state. The generic query already returns the Bonga-specific row through complete-phrase matching, and the recipe corpus has no demand that clarifies the intended product.
- **New source IDs:** `WP04-GENERIC-FISH-POWDER-20261012-S01` through `S05`. The prefix was checked against the live ledger, catalog, legacy identities, proposals, and batch documents before assignment; it had no existing occurrence. Existing Bonga and fish-stock sources are cited by their registered IDs, not reassigned.

## Recommendation

Keep generic `fish powder / poudre de poisson` unresolved. Do not add a reference, alias, or powdered form under `ingredient-ref-bonga-dried-fish-powder`, `ingredient-ref-anchovy`, or another fish identity.

A Québec grocery storefront currently lists **Poudre de Poisson, 100 g** beside a separate **Poudre de Crevette, 175 g** product. That is useful direct evidence for local French retail wording and a human-food product request. However, the listing gives no fish species, ingredients, drying or smoking state, or grinding description; its product-detail page could not be retrieved for inspection [S01]. A Richmond seller lists a Japanese-origin **Fish Powder, 1 kg**, but likewise gives no species, composition, processing, or cooking use in the accessible listing [S02]. The exact same English phrase also appears as one ingredient inside a multi-ingredient Canadian fish-bouillon blend, rather than as the name of a single-fish product [S03].

Those sources support a real retail naming pattern, but not a sufficiently bounded single ingredient. A generic food-class concept might eventually be useful if a recipe needs it and if the product is defined (for example, a source-attested dried-and-ground fish product with known species or blend). The current evidence does not establish that common boundary. Keep the Québec phrase in research evidence and await a package or recipe that supplies the missing product scope.

The existing Bonga identity remains specific: Marché Mamou identifies Bonga in its bilingual product listing, and the recorded FAO source identifies Bonga as *Ethmalosa fimbriata* [existing `WP04-BONGA-POWDER-20261011-S01`–`S03`]. Do not generalize that identity or species to unqualified `fish powder`.

## Live catalog, exact ownership, and picker behavior

The pre-integration package snapshot on 2026-10-12 contained **1,245 active ingredient references, 94 forms, 66 legacy-import candidates, and 1,552 research-ledger records**. The same-day red-rice-flakes integration added one unrelated reference and one ledger record; it does not match any fish-powder query or change this audit.

| Surface | Current owner or result |
|---|---|
| Active exact names and aliases | No reference has an exact normalized name or alias `fish powder`, `poudre de poisson`, `poisson en poudre`, `dried fish powder`, or `fish meal`. `ingredient-ref-bonga-dried-fish-powder` is displayed as `Bonga dried fish powder / poudre de poisson Bonga`, with no aliases. |
| Active forms | No form label or match term names generic fish powder. No powdered form is attached to Bonga, anchovy, fish stock, or another fish reference. |
| Legacy identities | No candidate name or alias contains an exact generic fish-powder term. |
| Research ledger | No generic fish-powder candidate exists. The Bonga reference is verified; fish stock is a separate active identity. Other ledger records mentioning powder language do not allocate the generic term. |
| Adjacent active identities | `ingredient-ref-anchovy` is `anchovy / anchois`; `ingredient-ref-anchovy-paste` is `anchovy paste / pâte d’anchois`; `ingredient-ref-fish-stock` is `fish stock / fumet de poisson`; `ingredient-ref-fish-balls` is formed fish balls; and dried bonito, fish sauce, stockfish, and Bonga powder remain separate. None has a generic powder alias or form. |

The recipe picker builds `IngredientReferenceSearchIndex` from active references and forms in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), as called by [RecipeEditorScreen.kt](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt). It normalizes accents and punctuation, then matches a complete sequence of query words anywhere within a reference or form search term. It returns every complete-phrase match; it does not require an exact alias or rank the Bonga qualifier above the query phrase.

A static query audit using that normalization and phrase rule returned:

| Query | Active result |
|---|---|
| `fish powder` | `ingredient-ref-bonga-dried-fish-powder` |
| `poudre de poisson` | `ingredient-ref-bonga-dried-fish-powder` |
| `dried fish powder` | `ingredient-ref-bonga-dried-fish-powder` |
| `poisson en poudre` | No result |
| `fish meal` / `farine de poisson` | No result |

The first three matches come from the Bonga row's displayed names, not aliases. Adding a generic reference would make the first two queries return both rows. That result set might become appropriate once a generic product scope is defined, but it would currently ask the user to choose between an underspecified identity and the already narrow Bonga product without recipe or package evidence to guide the choice.

## Current Canadian and Québec naming evidence

| Wording or product | Evidence and limits | Disposition |
|---|---|---|
| Québec `Poudre de Poisson` | Alièfè / Merveilles Services, a Québec grocery retailer, lists a 100 g `Poudre de Poisson` for $5 beside 175 g `Poudre de Crevette`. The storefront describes delivery in Québec City. The product-detail link returned a cache miss when opened, so the accessible page supplies no ingredient list, species, package image, or preparation state [S01]. | Confirms this unqualified French product name is in Québec retail use; insufficient to specify what fish or product state the picker should represent. Do not equate it automatically with Bonga. |
| Canadian `Fish Powder` | Ng Fung Foods in Richmond lists `Fish Powder`, **1 kg**, `Product of Japan`, and says it can arrange Canadian shipping. The page gives no species, ingredient list, preparation state, or culinary direction, and no French name [S02]. | Another underspecified retail name; origin alone does not identify the fish or culinary product. |
| Powder within fish bouillon | Metro lists fish powder within the ingredient declaration for its Chef’s Club fish-bouillon product, alongside dextrose, salt, MSG, palm oil, starch, gelatin, vegetables, spices, and other ingredients. The Metro page says the item is out of stock and warns that manufacturers can change product information [S03]. | Shows that `fish powder` can be a component of a compound stock seasoning; do not identify fish bouillon or its nested powder with a standalone ground-fish ingredient. |
| Canadian fish-label guidance | CFIA says the common name of fish products must use the prescribed or generally known food name; it describes species-qualified naming for single-species fish fillets/portions and permits generic `fish` in many multi-species products when the species are listed. This is labeling guidance, not a culinary catalog definition for powder [S04]. | Do not infer a species, single-species composition, or blend from an unqualified retail title. It does not independently establish a generic fish-powder ingredient class. |
| Québec `farine de poisson` | OQLF's GDT entry pairs `farine de poisson` with `fish meal`, places it in the fisheries domain, and describes use as poultry feed; it was last updated in 1990 [S05]. | Do not use `farine de poisson` as the French display or alias for a human-food fish powder. This older entry is a boundary reference, not evidence against newer consumer use of `poudre de poisson`. |

The names and pages establish that generic wording is encountered in Québec/Canadian retail contexts. They do not establish an agreed species set, whether the product is whole fish ground after drying, a species-specific powder, a mixture, or powder used in a formulated broth product. Treat seller page titles and manufacturer ingredient declarations as evidence about those listings only, not as biological taxonomy or a universal product standard.

## Recipe demand

The manifest-listed package contains **114 recipes and 1,123 ingredient rows**. A case-insensitive scan of all recipe JSON string values found **zero** matches for `fish powder`, `dried fish powder`, `powdered fish`, `poudre de poisson`, `poisson en poudre`, `fish meal`, `farine de poisson`, `anchovy powder`, `Bonga` powder, fish balls, or surimi. Recipe 093's generic optional “cooked meat or seafood, to taste” wording does not name a powder, species, stock base, or use amount. No recipe row or link is proposed.

## Numeric and substitution limits

The Québec storefront's **100 g** and Ng Fung's **1 kg** values are package sizes for separate listings, not serving measures or yield evidence. The Metro bouillon listing is a multi-ingredient product declaration without a recipe conversion for its fish-powder component. No reviewed source supports density, teaspoons per gram, a standard reconstitution ratio, species yield, or package-to-recipe yield for generic fish powder.

No substitution is supported among generic fish powder, Bonga powder, pure-ground anchovy, anchovy-extract blends, fish bouillon/stock, fish sauce, dried bonito, dried shrimp/scallop, surimi, fish balls, or fresh fish. Their species, ingredients, process, and intended uses differ or remain unknown. Add no form, measure, unit mapping, conversion, yield, recipe link, or substitution rule. Keep biological identity claims separate from culinary powder-product claims.

## Source register

Sources accessed or rechecked on 2026-10-12. Retail listings document the retailer's wording and listing contents; they are not independent composition or species tests.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-GENERIC-FISH-POWDER-20261012-S01** | Alièfè / Merveilles Services, [Québec grocery storefront](https://aliefeepicerieafricaine.com/) | Lists `Poudre de Poisson` at 100 g / $5 and a separate `Poudre de Crevette` at 175 g / $12; storefront identifies Québec City delivery. The product-detail link could not be opened (cache miss), so species and ingredients are unknown. |
| **WP04-GENERIC-FISH-POWDER-20261012-S02** | Ng Fung Foods, [Fish Powder](https://ngfungfood.com/en/home/279-fish-powder.html) | Richmond seller lists a 1 kg Japanese-origin product under the generic English title and says shipping within Canada can be arranged. No species, ingredients, process, cooking directions, or French product name are supplied on the accessible page. |
| **WP04-GENERIC-FISH-POWDER-20261012-S03** | Metro, [Fish Bouillon Chef’s Club](https://www.metro.ca/en/online-grocery/aisles/pantry/herbs-spices-sauces/marinades-cooking-pastes/fish-bouillon/p/065081500016) | Ingredient declaration includes fish powder inside a multi-ingredient bouillon product; page indicates out of stock and warns that manufacturer information can change. This is a stock-seasoning boundary, not a standalone powder definition. |
| **WP04-GENERIC-FISH-POWDER-20261012-S04** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Current Canadian labeling guidance covers common names, species-qualified naming examples, and generic fish names for multi-species products. Applied here only as context for the limits of unqualified retail titles, not as a catalog schema rule. |
| **WP04-GENERIC-FISH-POWDER-20261012-S05** | OQLF, [farine de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084085/farine-de-poisson) | Gives `farine de poisson` as the Québec French term for fish meal, with fisheries/feed notes; last updated 1990. Does not define human-food `poudre de poisson`. |

Existing sources reused without new IDs: Marché Mamou's Bonga listings and the FAO species source (`WP04-BONGA-POWDER-20261011-S01`–`S03`); the Marché Mamou Bonga integration record; and the OQLF/CFIA and fish-stock decisions in their existing ledger records.

## Next open work

Keep generic fish powder unresolved and leave the combined Section P fish-powder/fish-balls/surimi checklist open. Reopen this review when a recipe or exact package identifies its fish species or multi-species composition, ingredients, processing state, and Québec-facing product name. If the later decision creates a broad identity, audit how the picker should present that result alongside the Bonga-specific row. Any quantity or substitution behavior requires product-matched recipe evidence.

## Root review — 2026-10-12

The hold is accepted. The Québec retailer confirms `Poudre de Poisson` wording next to a separate `Poudre de Crevette` listing, while Ng Fung Foods uses `Fish Powder` for a Canadian-market product with unspecified species and process. Neither listing provides enough identity detail to choose a stable generic product boundary; the Bonga reference remains narrowly qualified. The app's phrase-first query behavior returns the Bonga row for `fish powder` and `poudre de poisson`, so adding a broad row now would leave the user choosing between an unspecified concept and the Bonga product without recipe context. Leave the generic phrases unallocated and do not add them to an alias or form. No catalog JSON, ledger record, recipe link, form, measurement, conversion, yield, or substitution was added. No tests or emulator checks were run. The docs-only hold is recorded in [the integration checkpoint](../batches/wp04-section-p-generic-fish-powder-search-hold-integration-20261012/README.md), the plan, and roadmap.
