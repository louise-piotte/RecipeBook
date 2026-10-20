# WP02 proposal: gluten-free flour blend product boundaries

- **Reviewed:** 2026-10-10
- **Status:** Reviewed and integrated as a held product-family candidate by the coordinator on 2026-10-10; outcome recorded below.
- **Scope:** Open Section 04 B7: gluten-free all-purpose, cup-for-cup/1:1, bread, and pastry flour blends. The review separates exact product identity from a product's replacement claim. It does not revisit naturally gluten-free single-ingredient flours or starches.
- **Source IDs:** This proposal uses the unique prefix `WP02-GF-BLENDS-20261010`; suffixes `S01`–`S16` were collision-checked in `docs/` and `app/` before writing. These proposal-local IDs are not ledger records.

## Recommendation

**Keep B7 open and add no generic gluten-free blend reference or aliases.** The live bundled library contains no gluten-free flour blend recipe demand. Current Canadian product evidence shows that products sold as gluten-free all-purpose flour have materially different component ingredients and gum systems; “cup-for-cup” and “1:1” describe source-specific use claims rather than a shared formula. Bread and pastry products add further distinct formulations. The sources support product-specific records if an exact product is later named, but they do not define a generic composition or universal replacement class. [S03–S09, S12–S15]

For a future exact recipe demand, preserve the recipe's complete product wording and, where available, its brand/formula. Do not map any of these products to ordinary wheat all-purpose, bread, cake, or pastry flour. A generic “gluten-free flour blend” line without a formula remains underspecified until a recipe owner or source supplies the intended product.

## Current package, ledger, legacy, and recipe audit

The canonical manifest currently lists **114 recipes**; the ingredient-reference file has **843 references** and the forms file has **47 forms**. The live seed has no gluten-free flour blend reference or blend form. The existing enum includes `BAKING_MIXIN_AND_PANTRY`, but there is no composition/subcategory field that would turn a generic family label into a defined formula.

The closest active references are conventional wheat products:

| Active reference | Current EN/fr-CA display and aliases | Current measurement state |
|---|---|---|
| `ingredient-ref-all-purpose-flour` | all-purpose flour / farine tout usage; EN aliases: ap flour, plain flour; FR aliases: farine, farine ordinaire, farine tout usage non blanchie | Default density null; no unit mappings |
| `ingredient-ref-bread-flour` | bread flour / farine à pain; FR alias: farine pour pain | Default density null; no unit mappings |
| `ingredient-ref-pastry-flour` | pastry flour / farine à pâtisserie; no aliases | Default density null; no unit mappings |

No full normalized-key match was found for gluten-free flour, gluten-free flour blend, gluten-free all-purpose flour, cup-for-cup flour, gluten-free bread flour, gluten-free pastry flour, or their checked French qualified phrases. Two near-boundaries need protection during any later integration:

- The active `farine tout usage` belongs to ordinary Canadian wheat flour. Do not attach `farine tout usage sans gluten` or other gluten-free blend wording as an alias of that reference.
- The active `farine à pâtisserie` belongs to the existing pastry-flour identity. OQLF defines it as a fine, low-gluten soft-wheat flour. Canadian product labels also use qualified versions of this phrase for gluten-free products, including the 2026 Bob’s Red Mill names `farine à pâtisserie 1 pour 1 sans gluten` and `farine à pâtisserie tout usage sans gluten`. These qualified, product-specific labels must not collapse to the active unqualified pastry-flour key. [S02, S08–S11]

The 1,088-record research ledger contains ordinary wheat pastry-flour evidence, including a source-named wheat all-purpose-plus-pastry-flour blend. It does not define a gluten-free flour blend family or a gluten-free blend conversion. Its separate Queen Milling entries concern single-ingredient white and brown rice flours, not blended flour products. The 78 legacy import candidates include no gluten-free blend candidate; the one flour-related match is flour tortillas and is unrelated.

Scanning every manifest-listed recipe JSON for gluten-free/sans-gluten wording, blend wording, cup-for-cup/1:1 labels, and blend reference IDs found **zero gluten-free blend ingredient rows or recipe links**. There are 50 ordinary all-purpose-flour rows and two bread-flour rows; neither set is gluten-free demand. Relevant examples are 420 g bread flour in [recipe 072, Hamburger Buns](../../../app/src/main/assets/seed/bundled-library/recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json), 95 g bread flour in [recipe 094, Brownie Cookie Sandwiches](../../../app/src/main/assets/seed/bundled-library/recipes/094-sandwiches-de-biscuits-brownies-brownie-cookie-sandwiches-c97910fb-2301-40c7-8019-433bb361c44c.v1.json), and an all-purpose-flour-or-bread-flour option in [recipe 076, Pizza Dough](../../../app/src/main/assets/seed/bundled-library/recipes/076-pate-a-pizza-pizza-dough-14d20789-1967-432a-b9bc-0319599ffbd3.v1.json). Recipe 004's `1:1` text concerns the weight ratio between dried azuki beans and sugar, not flour. No recipe calls for pastry flour or any gluten-free blend.

## Product identity and composition evidence

| Product wording in market | Source-backed composition/scope observation | Identity boundary for review |
|---|---|---|
| Canadian gluten-free all-purpose blends | QUeen Milling's Canadian blend lists rice flour, wholegrain rice flour, and potato starch, with no xanthan gum. Bob’s Canadian French page lists chickpea flour, potato starch, tapioca flour, whole-grain sorghum flour, and fava flour, and says to add xanthan or guar gum as directed. Ardent Mills Canada declares white rice, potato starch, tapioca starch, whole sorghum, brown rice, quinoa flour, and xanthan gum. Québec Food Directory records another “Mélange à farine tout usage SG” formula with tapioca starch, sorghum, millet, potato starch, gluten-free oats, and xanthan gum. [S03–S07] | The category phrase does not imply a common ingredient list, grain profile, binder, or leavening state. Do not combine these as one canonical formula or general identity. |
| Cup-for-cup / 1:1 replacement blends | Ardent Mills titles its Canadian product “Gluten-Free All-Purpose 1:1 Flour Blend” and uses a cup-for-cup replacement description. Bob’s 1-to-1 product includes sweet white rice, brown rice, potato starch, sorghum, tapioca, and xanthan gum; its Canadian page says it is not meant for yeast dough. [S05–S06, S08, S16] | A replacement claim is attached to the named product and use scope. It is not a synonym for every gluten-free flour blend, and it does not establish a shared formula or an unrestricted recipe conversion. |
| Bread flour blends versus bread mixes | A Canadian “Naturally Gluten Free Bread Flour blend” lists tapioca starch, millet, white rice, sweet rice, sorghum, xanthan gum, and salt. The Québec product “Mélange à pain sans gluten” from Lulubelle includes a flour/starch blend plus cane sugar, baking powder, sea salt, and guar gum. [S12–S13] | Keep a flour blend distinct from a complete bread mix containing other recipe ingredients. No source establishes that all-purpose, cup-for-cup, and bread blends share a formula. |
| Pastry flour blends versus pastry mixes | Québec maker Susie’s “Pastry Flour” is a gluten-free blend of potato starch, brown and white rice flours, sorghum, tapioca starch, and xanthan gum. Its named pie-crust mix separately adds sugar and salt. Québec retailer wording calls the flour “Farine à pâtisserie sans gluten.” [S09–S11] | Keep the named gluten-free blend separate from the conventional wheat pastry flour and from complete pie-crust or pastry mixes. Do not generalize a brand’s 1:1 claim to all pastry blends. |

These are sampled Canadian/Québec-market examples, not an exhaustive market census. Formula evidence supports the open checklist's “composition-dependent products” description, but not a claim that every blend shares an ingredient, tolerance, or performance profile. Naturally gluten-free single-ingredient flours and extracted starches remain their existing identities; a gluten-free label alone does not create a new flour identity.

## Québec/Canadian names and alias boundaries

OQLF's preferred Canadian term `farine tout usage` is defined for flour made from hard- and soft-wheat milling products; its preferred `farine à pâtisserie` is defined for low-gluten soft-wheat flour. Neither OQLF entry defines a gluten-free compound blend. The wording below is therefore product-label evidence, not an OQLF-approved generic blend taxonomy. [S01–S02]

| Product concept | Source-attested EN wording | Source-attested fr-CA wording | Proposed handling |
|---|---|---|---|
| General gluten-free blend | gluten-free flour blend; gluten-free all-purpose flour blend | mélange de farine sans gluten; farine tout usage sans gluten; mélange à farine tout usage sans gluten | Keep as qualified, source-worded descriptions only. Do not add a global alias or attach them to wheat all-purpose flour. Product pages use both “farine” and “mélange”; no single generic French label is established. |
| Cup-for-cup / 1:1 blend | Gluten-Free All-Purpose 1:1 Flour Blend; Gluten Free 1-to-1 Baking Flour | Mélange à farine tout usage sans gluten 1 pour 1; the 2026 Bob’s French product list also uses farine à pâtisserie 1 pour 1 sans gluten | Keep “1:1,” “1 pour 1,” and “cup for cup” attached to the source-named product and claim. The Bob’s French wording collides semantically with the active wheat pastry-flour name if its qualifiers are dropped; do not alias the unqualified phrase `farine à pâtisserie`. |
| Bread flour blend | Naturally Gluten Free Bread Flour blend | No verified generic French product name for a standalone bread-flour blend was found | Keep the French display unresolved. Lulubelle's `mélange à pain sans gluten` is a complete bread mix and does not settle the name for a flour-only blend. Do not create `farine à pain sans gluten` by translation alone. |
| Pastry flour blend | Pastry Flour; gluten-free pastry flour | farine à pâtisserie sans gluten; product-specific listings also use farine à pâtisserie | The fully qualified phrase is attested for Susie's product. Keep it product-scoped; do not use plain `farine à pâtisserie` as a gluten-free alias or equate it with conventional wheat pastry flour. |

Do not activate unqualified `gluten-free flour`, `gluten-free flour blend`, `flour mix`, `cup-for-cup`, `1-to-1`, `farine sans gluten`, `farine de cuisson`, `mélange de farine`, or `mélange à pain` as aliases across these products. These phrases either lack a fixed composition, vary across actual product names, or can resolve to a different product class. Brand/product wording belongs only to the exact documented product if a later recipe requires it.

## Measurements and substitutions

No default density, household unit mapping, form conversion, yield, or runtime substitution is proposed. The evidence is product-specific and the current recipe bundle has no blend demand.

- Bob’s Canadian nutrition panels list 1/4 cup as 34 g for its all-purpose blend and 37 g for its 1-to-1 blend. These are package serving declarations, not a shared measurement protocol or a universal dry-cup density; do not derive an active conversion from them. [S03, S16]
- Ardent Mills' cup-for-cup statement applies to its named 1:1 product. Bob’s distinguishes its 1-to-1 flour from its general gluten-free all-purpose flour and excludes yeast dough for the former. King Arthur likewise separates a designated gluten-free blend (for recipes written for gluten-free flour) from a Measure for Measure replacement blend for non-yeasted wheat-flour recipes. These sources document different product scopes; they do not support a global substitution alias. [S05–S08, S14]
- King Arthur's separate gluten-free bread-flour advice gives product-specific extra liquid and rest/rise/bake adjustments. This is contextual bread-recipe guidance tied to that named product, not a general bread-blend rule. [S15]
- Susie advertises a 1:1 swap for its own pastry flour. A manufacturer's marketing/use statement does not validate the same ratio for other pastry blends, all-purpose blends, or bread formulas. [S09]

Any future density record needs an exact product, current label or reproducible measuring protocol, and a recipe or user need. Any future substitution record must identify source/target product and recipe context, direction, amount basis (mass or volume), method, and adjustments. Until then, keep numeric and functional behavior unavailable.

## Package implications if approved later

1. Do not add or reserve a generic gluten-free flour blend ID, alias, form, recipe link, density, unit mapping, yield, or substitution from this review.
2. Keep the active wheat all-purpose, bread, and pastry names/aliases as they are. Preserve full gluten-free qualifiers in any future display or searchable phrase.
3. If a later bundled recipe names an exact brand/product or formula, consider a separate product-level reference, using the existing `BAKING_MIXIN_AND_PANTRY` category only after integration review. Do not model a blend as a form of wheat flour or infer a new enum/subcategory.
4. Require independent fr-CA review before integrating `farine à pâtisserie sans gluten` or any brand-specific `1 pour 1` title; retain the distinction between flour blends and completed baking mixes.

## Coordinator integration outcome — 2026-10-10

No generic gluten-free blend reference, alias, form, recipe link, or active conversion was added.
Added one research-ledger candidate for the composition-dependent product family, with the 16 source
records and two product-specific Bob's Red Mill quarter-cup label observations (34 g and 37 g).
Those servings do not populate an active density or mapping. The plan's B7 review is complete, while
future exact product-level identities remain demand-driven. No recipe lines changed. See the
[baking/flour batch record](../batches/baking-flours-starches.md#2026-10-10-gluten-free-blend-boundary-review)
for the package decision.

## Sources

All web pages were accessed on **2026-10-10**. Publication/update dates are listed where exposed; otherwise the live page showed no publication date. Source IDs are proposal-local and use the collision-checked prefix above.

| Source ID | Source and date | Supports and limits |
|---|---|---|
| WP02-GF-BLENDS-20261010-S01 | [OQLF, farine tout usage, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage), last updated 2016 | Preferred Québec term and definition for Canadian wheat all-purpose flour; does not name a gluten-free blend. |
| WP02-GF-BLENDS-20261010-S02 | [OQLF, farine à pâtisserie, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031479/farine-a-patisserie), last updated 1990 | Preferred Québec term and soft-wheat/low-gluten definition for ordinary pastry flour; not a gluten-free product definition. |
| WP02-GF-BLENDS-20261010-S03 | [Bob’s Red Mill Canada, Farine tout usage sans gluten](https://www.bobsredmill.ca/produit/gluten-free-all-purpose-baking-flour), no page date shown | Current Canadian French page lists chickpea, potato, tapioca, sorghum, and fava components, no xanthan/guar, and a 1/4-cup (34 g) serving. Product-specific only. |
| WP02-GF-BLENDS-20261010-S04 | [QUeen Milling, Gluten Free All Purpose Flour Blend](https://www.queenmilling.ca/products/queen-milling-all-purpose-gluten-free-flour-blend), live page; © 2026 | Canadian manufacturer page shows rice flour, wholegrain rice flour, and potato starch, and identifies no xanthan gum. Product-specific only. |
| WP02-GF-BLENDS-20261010-S05 | [Ardent Mills Canada, Gluten-Free All-Purpose 1:1 Flour Blend product sheet](https://ardentmills.ca/media/2898/22325-gluten-free-1to1-all-purpose-flour-blend-10kg-4.pdf), © 2022 | Canadian food-service product title, cup-for-cup claim, product code, and ingredients; a named 10 kg product sheet, not a generic formulation standard. |
| WP02-GF-BLENDS-20261010-S06 | [Ardent Mills Canada, Mélange à farine tout usage sans gluten 1 pour 1](https://ardentmills.ca/fr/products/blends-mixes/flour-blends-mixes/gluten-free-all-purpose-flour-blend/), live page; © 2025 | Direct Québec/Canadian French product name and product-specific “tasse par tasse” wording; availability may vary. |
| WP02-GF-BLENDS-20261010-S07 | [Québec Food Directory, Lulubelle gluten-free all-purpose flour blend](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202592), last updated 2026-07-24 | Government directory listing reports a different formula, source product name `Mélange à farine tout usage SG`, and product-specific 1 cup for 1 cup suggestion. “SG” is retained as product wording, not a generic alias. |
| WP02-GF-BLENDS-20261010-S08 | [Bob’s Red Mill, 2026 Canadian French Product List](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/1), 2026 list | Manufacturer pairs “1-to-1 Baking Flour, Gluten Free” with `Farine à pâtisserie 1 pour 1 sans gluten` and “All Purpose Baking Flour, Gluten Free” with `Farine à pâtisserie tout usage sans gluten`; lists distinct ingredients. Product-list names expose a French collision risk, not a universal term. |
| WP02-GF-BLENDS-20261010-S09 | [Susie Sans Gluten, Pastry Flour](https://susiesansgluten.com/products/pastry-flour), no page date shown | Québec maker's named pastry blend, component list, suggested baking uses, and its own 1:1 claim. Does not establish a cross-brand ratio. |
| WP02-GF-BLENDS-20261010-S10 | [Aliments du Québec, Farine à pâtisserie](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-a-patisserie), no page date shown | Identifies the Québec Susie product under `Farine à pâtisserie`; retailer/category wording, not an OQLF blend definition. |
| WP02-GF-BLENDS-20261010-S11 | [Well.ca, Farine à pâtisserie sans gluten Susie](https://well.ca/fr/produits/susie-gluten-free-pastry-flour_318428.html), no publication date shown | Canadian retailer's exact French product listing and ingredient declaration. Secondary retail wording; use only as product-label evidence. |
| WP02-GF-BLENDS-20261010-S12 | [Naturally Gluten Free Bakery, Naturally Gluten Free Bread Flour blend](https://naturallygf.ca/products/odells-flour-blend), no page date shown | Canadian seller identifies a bread flour blend for yeast items and publishes its formulation. No French product label is given. |
| WP02-GF-BLENDS-20261010-S13 | [Lulubelle & Co, Mélange à pain sans gluten](https://lulubelleandco.com/fr/products/bread-mix-3-5-kg), live page; © 2025 | Québec French product name and list showing flour/starch blend plus sugar, baking powder, salt, and guar gum; supports bread-mix separation from flour blend. |
| WP02-GF-BLENDS-20261010-S14 | [King Arthur Baking, Which gluten-free flour should I use?](https://www.kingarthurbaking.com/blog/2023/05/04/which-gluten-free-flour-should-i-use), published 2023-05-04 | Manufacturer distinguishes its designated GF all-purpose flour, Measure for Measure replacement blend, and bread flour, with product-specific uses and formulas. U.S. product guidance; no claim is generalized to Canadian products. |
| WP02-GF-BLENDS-20261010-S15 | [King Arthur Baking, Gluten-Free Bread Flour](https://shop.kingarthurbaking.com/items/gluten-free-bread-flour), no page date shown | Named bread flour includes gluten-free wheat starch and has product-specific liquid/rest/rise/bake guidance. Illustrates a distinct composition and use; not a Canadian product standard or universal replacement rule. |
| WP02-GF-BLENDS-20261010-S16 | [Bob’s Red Mill Canada, Gluten Free 1-to-1 Baking Flour](https://www.bobsredmill.ca/produit/farine-de-cuisson-sans-gluten), no page date shown | Manufacturer page lists ingredients, distinguishes the 1-to-1 product from its all-purpose blend for yeast dough, and gives the 1/4-cup (37 g) package serving. Product-specific evidence only. |
