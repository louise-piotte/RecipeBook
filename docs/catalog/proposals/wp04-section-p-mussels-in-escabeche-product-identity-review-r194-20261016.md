# WP04 Section P — mussels in escabeche product identity review (R194)

- **Reviewed / sources accessed:** 2026-10-16.
- **Status:** Integrated as one identity-only `PROTEIN` reference and ledger record. No aliases, forms, recipe links, measures, conversions, yields, or substitutions were added. No software tests were run.
- **Decision:** Added one identity-only prepared-food reference for **canned mussels in escabeche / conserve de moules à l’escabèche**, category `PROTEIN`, with no aliases or forms.
- **Scope:** Commercially packed mussels sold with a sauce or marinade specifically named escabeche / escabèche. Current Canadian examples are canned products. The row does not assign mussel species, one sauce formula, package size, drained amount, readiness, shelf-storage requirement, or home-preparation method.

## Decision and product boundary

Current Canadian listings support a recurring packed-food product class. Berchicci’s Québec-facing Cantara listing is in stock and describes fresh mussels preserved in a lightly acidic escabeche sauce. Its ingredient declaration names Mediterranean mussels, sunflower oil, wine vinegar, aromatics, and salt. A separate Canada-facing French listing names an Ati Manel product **Conserve de moules à l’escabèche** and describes mussels canned in oil, wine vinegar, garlic, bay leaf, spices, and salt. A Canadian conservas retailer lists La Curiosa large mussels in escabeche and says the selected mussels are fried in olive oil, packed by hand in a can, and covered with a spice marinade. Together these pages support a named product category across more than one brand, while also showing that recipes and formulations vary. [S01–S03]

Usito, a Québec dictionary, defines *escabèche* as a cold aromatic marinade generally used to preserve small cooked fish, or food prepared that way. Metro Québec uses the exact phrase **moules à l’escabèche** for a separate fresh-mussel recipe: the mussels are cooked, marinated, refrigerated, and served in shells. That recipe is not a canned-food listing. It confirms the French culinary term and is a reason to scope this proposed reference to the commercially packed product family described by the Canadian retail sources. It does not establish that every dish prepared at home in escabèche is canned or shelf-stable. [S04–S05]

The integrated identity is a finished product group, not a `canned` or `marinated` form attached to raw mussels. Keep it separate from:

- Blue, green-lipped, and Mediterranean mussel species references. A named species on an individual can does not make the escabeche product family a species identity.
- **Smoked mussels / moules fumées**, already reviewed as a separate prepared-food group in R159. A can’s oil or package does not make it an escabeche product.
- Sardo’s **herb-and-garlic marinated mussels**, held separately in R46. That retailer SKU has a distinct formula and product name; the R46 review does not allocate a generic escabeche product.
- Fresh mussels marinated at home, including Metro’s chilled recipe. Do not map that recipe’s raw shell mussels to the proposed packaged-product reference.
- Other packed seafood, such as sardines, herring, canned mackerel, canned tuna, smoked oysters, and octopus in olive oil. Shared canning or marinade language does not make them aliases or substitutes.

Do not add a general `mussels in marinade`, `canned mussels`, or `mussels in oil` identity from this evidence. Do not record a universal escabeche sauce formula: the reviewed ingredient percentages, oil, vinegar, vegetables, and seasonings belong to named products.

## Exact ownership and archive audit

The proposal audit snapshot, before the later R192 and R193 integrations, contained **1,572 ingredient references, 122 forms, 61 legacy candidates, and 1,917 ledger records** with **8,265 source entries / 7,054 distinct source IDs**. After those batches, the current pre-R194 snapshot contained **1,573 references, 122 forms, 61 legacy candidates, and 1,918 ledger records**, with **8,275 source entries / 7,059 distinct source IDs**. The manifest contains **114 recipes and 1,123 ingredient rows**. A fresh exact-key check against the current references, forms, legacy candidates, and ledger found no owner for the proposed bilingual names or ID.

Normalized exact-key checks covered active reference names and aliases, form labels and match terms, legacy candidate names and aliases, prospective IDs, and ledger record text. There is no exact owner for the proposed bilingual names **canned mussels in escabeche / conserve de moules à l’escabèche**, their complete shorter product phrases, or the proposed ID `ingredient-ref-mussels-in-escabeche`.

| Existing owner or proposal | Current scope and effect |
|---|---|
| `ingredient-ref-blue-mussel`, `ingredient-ref-green-lipped-mussel`, and `ingredient-ref-mediterranean-mussel` | Active species-level references; no escabeche names, aliases, or attached forms. Keep their raw/species boundaries. |
| `ingredient-ref-smoked-mussels` | Active prepared-food identity for smoked mussels. Its source and decision are scoped to smoke, not escabeche. |
| `ingredient-ref-mussel` | Ledger-only unresolved candidate for generic mussel naming. It does not own this distinct, source-named prepared product and should remain unchanged. |
| R159 smoked-mussel proposal | Accepts a separate smoked product; it names the R46 marinated product only as a boundary and does not cover escabeche. |
| R46 Sardo marinated-mussel proposal | Holds one named herb-and-garlic SKU with species and drained-quantity gaps. It does not decide a multi-brand canned escabeche group. |
| General preserved-fish product-state review and the open Section P checklist | Reject universal preservation forms but allow review of bounded product identities. Neither allocates an escabeche row. |

No form, legacy entry, recipe link, or previous focused proposal owns the proposed phrases. At proposal audit time, the reference ID and new R194 source-ID prefix were absent from the live ledger and archive. The reused CFIA labeling source already had ledger owners under R159; it was reused without changing its URL or adding a duplicate source row under a new ID.

## Picker projection

The projection follows the live [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, and punctuation, prefers complete word-phrase matches, and uses substring matching only when no full-phrase result exists. The integrated reference uses the English and French names as its only search terms, with no aliases and no forms.

| Query | Before integration | After integration |
|---|---|---|
| `canned mussels in escabeche`; `mussels in escabeche`; `conserve de moules à l’escabèche`; `moules à l’escabèche` | No result | The prepared escabeche product identity. |
| `escabeche`; `escabèche` | No result | The prepared escabeche product. No generic sauce or pepper alias was added. |
| `mussel`; `moule` | Blue mussel, green-lipped mussel, Mediterranean mussel | Unchanged; the plural product names do not alter the complete singular phrase matches. |
| `mussels`; `moules` | Blue mussel, Mediterranean mussel, smoked mussels | Those three plus the prepared escabeche product. Both queries remain visibly multi-result. |
| Species-qualified mussel names | The corresponding species reference | Unchanged; no species alias or relationship is added. |

The exact product phrases are searchable. Broad plural searches gain one result and continue to distinguish species from finished foods. Bare `mussel` and `moule` continue to show species results because the picker returns complete phrase matches before considering substring matches. No alias was needed to produce the documented behavior.

## Bundled recipe demand

The complete manifest scan read all **114 recipe files / 1,123 structured ingredient rows** and searched both ingredient rows and full recipe JSON text for `mussels`, `moules`, `escabeche`, `escabèche`, the proposed bilingual product phrases, canned mussels, and marinated mussels. It found **zero matching ingredient rows** and no escabeche or mussel product request in recipe text. The 12 full-file matches for French `moules` refer to baking pans, including in recipe 077; none is a seafood ingredient. No recipe link should be added.

No recipe in the bundle asks for this product, gives a cooking method or role for it, or supports substituting it for plain mussels, smoked mussels, or another packed seafood product.

## Numeric and substitution evidence

The Canadian retail pages show product-specific pack and composition details:

- Berchicci lists the Cantara pack as **110 g** and gives the SKU’s ingredient percentages, including **63.64%** mussels, **24.80%** sunflower oil, and **9.90%** wine vinegar. These are label declarations for one product, not a drained yield or general mussel measure. [S01]
- Luisa Paixao lists the Ati Manel conserve as **110 g** and gives **64%** mussels with oil, vinegar, garlic, bay leaf, spices, and salt. The page showed the item out of stock when searched; it supports the product wording and SKU details, not current availability. [S02]
- Spanish Pig’s La Curiosa page identifies **6–8 mussels per can** as a product size grade and describes hand-canning. That count does not give a reusable piece weight or a measure for another brand. [S03]
- Metro’s recipe uses **2 kg** fresh shell mussels plus a measured marinade and calls for cooking and chilling the prepared dish. Those are amounts for a separate home recipe, not a conversion or substitution for a packed escabeche product. [S05]

Record no density, unit mapping, household measure, serving size, count-to-mass conversion, drained weight, package yield, cooking yield, or generic preservation conversion. Do not transfer product percentages to another brand, or turn package mass into mussel flesh mass.

No source or bundled recipe provides a direction-specific amount, dish/method scope, or tested result for substituting this seasoned packed food for fresh mussels, smoked mussels, Sardo herb-and-garlic marinated mussels, or another fish/seafood product. Add no global or contextual substitution, warning, or recipe-line substitution link.

## Integrated data mapping

Added one `PROTEIN` reference:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-mussels-in-escabeche` |
| `nameEn` | `canned mussels in escabeche` |
| `nameFr` | `conserve de moules à l’escabèche` |
| `aliasesEn`, `aliasesFr` | Empty arrays |
| `defaultDensity` | `null` |
| `unitMappings` | Empty array |
| Forms, recipe links, yields, and substitutions | None |

Added one `ingredient_reference` ledger record under the same ID with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It links sources S01–S05 and reuses the existing CFIA source ID. `measurementObservations` and `substitutionFindings` are empty; the no-supported-value decisions are recorded in the ledger states and accepted decision. No generic canned-mussel record, legacy mapping, or recipe link was created, and `ingredient-ref-mussel` remains unchanged.

Integrated decision: Add only the commercially packed escabeche product group. Keep species, sauce formulation, storage/readiness, package quantity, and drained amount product-specific. Do not assign the fresh mussels in Metro’s chilled recipe to this canned-product reference or add a general marinated-mussel form. Cite R194 sources S01–S05 and reuse the R159 CFIA labeling source.

## Source register

Online sources were checked on 2026-10-16. Each R194 source ID is registered in the shared ledger and maps to one exact URL. The CFIA source ID is reused from R159.

| Source ID | Source and exact URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MUSSELS-ESCABECHE-R194-20261016-S01** | Berchicci, [Cantara Moules en Sauce Marinade](https://store.berchicci.ca/fr-ca/Cantara-Moules-Sauce-Marinade) | Current Québec-facing retailer listing marked in stock. The French product title uses *moules en sauce marinade*; its description specifically calls the sauce an escabeche. Gives one 110 g SKU, *Mytilus galloprovincialis*, and SKU-specific ingredients/percentages. It does not establish one formulation for all products in this class. |
| **WP04-SECTIONP-MUSSELS-ESCABECHE-R194-20261016-S02** | Luisa Paixao, [Conserve de moules à l’escabèche](https://luisa-paixao.com/fr-ca/products/conserve-de-moules-a-lescabeche) | Canadian French storefront uses the exact product wording and describes mussels canned in oil/vinegar with aromatics; gives one 110 g SKU and *Mytilus galloprovincialis*. The search page reported out of stock, so it is naming and product evidence, not current availability. |
| **WP04-SECTIONP-MUSSELS-ESCABECHE-R194-20261016-S03** | Spanish Pig, [La Curiosa Large Mussels (6/8 per can)](https://spanishpig.ca/products/la-curiosa-large-mussels-6-8) | Canadian conservas retailer describes a product prepared in escabeche sauce, hand-packed and canned, using *Mytilus galloprovincialis*. The 6/8 count is a SKU size grade; the page does not give a reusable count/weight relation. |
| **WP04-SECTIONP-MUSSELS-ESCABECHE-R194-20261016-S04** | Usito, [escabèche](https://usito.usherbrooke.ca/lexies/mots/escab%C3%A8che) | Québec dictionary entry defines the word as a cold aromatic marinade generally used to preserve small cooked fish and as food prepared that way. Supports Québec French spelling/meaning, not a fixed sauce composition or a canned-mussel standard. |
| **WP04-SECTIONP-MUSSELS-ESCABECHE-R194-20261016-S05** | Metro, [Moules à l’escabèche hors-d’œuvre froid](https://www.metro.ca/recettes-et-occasions/recettes/moules-a-lescabeche-hors-doeuvre-froid) | Québec retailer recipe uses the exact French culinary phrase for fresh shell mussels cooked, marinated, refrigerated, and served in shells. It distinguishes the home-prepared dish from a packaged conserve; its amounts are not product measurements. |
| **Reused `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | General Canadian labeling guidance treats product form/style, packing medium, and condition as separate descriptive dimensions and discusses hermetically sealed fish products. It supports not turning the preparation into a universal mussel form; it is not an escabeche product-name standard. |

## Reopen conditions

Revisit the display if a current Canadian product label consistently uses different bilingual wording or if a recipe requests only an unqualified “marinated mussels” product that cannot be distinguished from Sardo’s herb-and-garlic SKU. Reassess product scope if Canadian sources show that the same market phrase routinely denotes a chilled, non-canned item and users need storage state in the identity. Add numeric evidence only from a named product with an explicit usable/drained basis or a directly measured kitchen relationship. Add substitution guidance only after a source or test supplies the amount, dish role, and method conditions.

**Disposition:** Recommend one identity-only `canned mussels in escabeche / conserve de moules à l’escabèche` product reference. Keep generic preserved-fish forms, other marinated mussels, species identities, and all numeric mappings and substitutions unchanged. Broader Section P work remains open.
