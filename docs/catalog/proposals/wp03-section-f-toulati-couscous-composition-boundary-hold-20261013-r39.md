# WP03 Section F R39 — Toulati couscous composition boundary hold

- **Round:** R39, 2026-10-13.
- **Status:** Integrated documentation-only hold.
- **Open checklist:** Section F remains open for regionally significant cereal mixes and preprocessed grains ([live plan, line 2462](../../RecipeBook-global-ingredient-catalog-plan.txt#L2555)).
- **Candidate:** Southern Moroccan `Couscous Toulati`, also marketed with the descriptor `couscous tri-céréales`.
- **Recommendation:** keep this candidate out of the active reference catalog pending evidence of a stable product composition and a Québec-facing French label. Do not allocate a reference or ledger ID in this review.
- **Provisional source wording:** English `Toulati couscous`; French `couscous Toulati`. Current seller sources describe it as made from three cereal flours/grains, but do not name all three.
- **Boundary:** this is a separately named product, not an alias for the protected five-cereal `Keskes Khoumassi` added in R38 and not an identity for every `couscous tri-céréales` product. Do not assume the same formulation across producers.
- **Numeric and rule limits:** add no forms, recipe links, density, unit mappings, measures, yield, conversions, or substitutions. The source's 900 g amount is a package size only.

## Why this is a distinct open item

The live regional cereal-mix checklist has no Toulati-specific child decision. Exact local searches found no `Toulati` owner or prior decision in active references, forms, the 64 legacy-import candidates, the research ledger, proposals/batches, or bundled recipes. The R38 review treats `couscous tri-céréales` as too broad an alias for five-cereal Khoumassi; it does not review or assign the separately named product `Toulati` ([R38 proposal](wp03-section-f-keskes-khoumassi-five-cereal-couscous-boundary-review-20261013-r38.md)).

A current Moroccan government cooperative marketplace listing sells **Couscous toulati – 900 g** from the Assahra Dahabya cooperative. It describes a Southern Moroccan product made from three cereal flours, manually agglomerated with salted water, but does not identify the three flours [S01]. The same marketplace profile lists separate Toulati, Khoumassi, and bran-couscous products from that cooperative [S02]. A current Moroccan cooperative-marketplace profile uses the English wording **Toulati couscous** and describes three selected grains without naming them [S03]. A culinary-festival account identifies *toulati* among multi-cereal couscous products of southern Morocco, but offers no standardized formula [S04]. Together these sources establish a real regional product name, not a common formula across producers.

The unresolved point is the product boundary: one named retail SKU supplies only a cereal count and process summary; other cooperative profiles repeat the three-grain descriptor but not the ingredients. The targeted Québec/OQLF search found no Toulati-specific Québec product name or terminology ruling. The existing French seller title is a source-backed Moroccan French label, not enough by itself to approve it as a Québec display. Keep the candidate unallocated until a product specification or ingredient declaration establishes the three grains and a Québec-facing French source supports the label.

## Exact ownership and picker effects

At this static audit the live bundled package contained **1,367 active references**, **100 forms**, and **64 legacy-import candidates**; the research ledger contained **1,699 records**. Normalized searches for `Toulati`, `Toulati couscous`, `couscous Toulati`, `couscous tri-céréales`, and `three-cereal couscous` found no exact owner in references, forms, legacy identities, or ledger records. No prior Toulati proposal or source-ID allocation was found.

| Current owner | Scope and boundary |
|---|---|
| Candidate Toulati product | No active reference, form, legacy identity, exact ledger record, or prior Toulati decision owns it. This proposal does not allocate a candidate ID. |
| `ingredient-ref-couscous` | Generic `couscous / couscous`; remains the general owner and does not identify a regional three-cereal formula. |
| `ingredient-ref-keskes-khoumassi` | Protected five-cereal Moroccan GI `Keskes Khoumassi (five-cereal couscous) / couscous Khoumassi (cinq céréales)`; only legal alias is `Keskes Moukhamess`. Keep its exact GI formula separate. |
| `ingredient-ref-baddaz-corn-couscous` | Named Moroccan maize couscous `Baddaz`; not a three-cereal blend identity. |
| Other couscous owners | Pearl couscous, barley couscous, and millet couscous (thiéré) are separate products with their own existing names and boundaries. |

The search projection follows bilingual names and aliases plus attached form terms, with phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The current picker returns **0** results for `Toulati`, `Toulati couscous`, and `couscous Toulati`; the hold makes no picker change. For scale, `couscous` currently returns **6** results, including generic, pearl, barley, millet, Baddaz, and Khoumassi couscous. If a future qualified identity is approved, the `Toulati` and `couscous Toulati` searches would each gain one result and `couscous` would rise to seven. Do not make bare `tri-céréales` or `three-grain couscous` an alias; those phrases are broader than this candidate.

## Recipe-demand audit

All **114** manifest-listed recipes and **1,123** ingredient rows were scanned for normalized forms of `Toulati`, `Toulati couscous`, `couscous Toulati`, `couscous tri-céréales`, and `three-cereal/three-grain couscous`.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Recipe lines linked to a Toulati reference: **0**.
- General couscous wording is not evidence that a recipe requires this regional three-cereal product.

Current Moroccan listings support regional availability and product use; the bundled recipe corpus has no candidate-specific demand.

## Measurements, forms, and substitutions

- **Composition:** the current 900 g marketplace product is described as using three cereal flours, but the listing does not name them. Do not transfer the exact five-cereal Khoumassi formula or its percentages to Toulati.
- **Forms:** add none. Retail listings describe a packaged couscous product, but they do not establish a reusable form crosswalk or separate cooked/dry recipe state.
- **Package amounts:** the 900 g and 1 kg listings are package sizes, not household measures, ingredient portions, density observations, or unit mappings.
- **Other numeric data:** no validated grain proportions, hydration ratio, cooking time, cooking yield, mass-volume measure, or recipe serving was found.
- **Substitutions:** add no global or contextual rule. Three-grain wording alone does not establish an equivalent amount, hydration behavior, or method for replacing wheat couscous, Khoumassi, Baddaz, barley couscous, millet couscous, or another grain mix.

## Source register

Sources were checked online on 2026-10-13. Proposal-local IDs use the prechecked prefix `WP03-TOULATI-R39-20261013-`; no ledger source or status was added.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-TOULATI-R39-20261013-S01` | Terroir du Maroc, [Couscous toulati – 900 g](https://terroirdumaroc.gov.ma/fr_ma/catalog/product/view/id/1287/s/couscous-toulati-900-g-cooperative-assahra-dahabya/), government cooperative marketplace listing for Assahra Dahabya. | Current in-stock listing from Laâyoune names the product, calls it `couscous tri-céréales`, says it contains three cereal flours, and describes hand agglomeration with salted water. It does not name the cereals or provide a product specification, household measure, recipe ratio, or cooking directions. |
| `WP03-TOULATI-R39-20261013-S02` | Terroir du Maroc, [Assahra Dahabya cooperative profile](https://terroirdumaroc.gov.ma/fr_ma/marketplace/seller/profile/shop/CooprativeAssahraAddahabia). | Current seller profile lists separate `Couscous toulati – 900 g`, `Couscous Khoumassi – 900 g`, and bran-couscous products. This supports separate marketplace identities, not a common Toulati formula. |
| `WP03-TOULATI-R39-20261013-S03` | CoopMarketplace, [Kheir Zemmour cooperative profile, English](https://coopmarketplace.ma/An/cooperative/kheir-zemmour/487). | Current English profile names “Toulati couscous” and says it combines three selected grains, separately from Khoumassi. It does not identify the grains, publish a product specification, or establish a Québec term. |
| `WP03-TOULATI-R39-20261013-S04` | Festival Kouss•Kouss, Mayalen Zubillaga, [“Graine(s)”](https://kousskouss.com/graines-mayalen-zubillaga/). | Culinary discussion mentions *toulati* among southern Moroccan multi-cereal couscous products and explains that regional couscous may combine grains. It supports regional context, not a standardized ingredient formula or market label. |

## Next action

Keep Toulati unallocated. Reopen when a producer specification or exact product ingredient declaration names the three cereal flours and a Québec-facing French source supports the bilingual display. If that evidence arrives, review `Toulati couscous / couscous Toulati` as a qualified product identity, not as an alias for generic `couscous tri-céréales`. This review is recorded as a documentation-only hold in the live plan and roadmap; no catalog, ledger, or generated file changed, and no tests were needed.
