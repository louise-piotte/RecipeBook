# WP05 Section V — Acid concentration and preservation constraints

- **Date:** 2026-10-12
- **Status:** reviewed evidence audit; the audit subtask is integrated, while the full product/application constraint remains open
- **Scope:** product and concentration boundaries for active vinegar, lemon-juice, and lime-juice references; source-backed recipe-row audit; explicit preservation inference limit.
- **Repository snapshot (post-pandan):** 1,190 active ingredient references; 86 forms; 114 manifest recipes / 1,123 ingredient rows; 66 legacy candidates; 1,491 research-ledger records / 4,983 source entries / 4,066 distinct source IDs / 8 unit conversions. Research-ledger SHA-256: `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914`.
- **Source namespace:** `WP05-ACIDITY-PRESERVATION-20261012-S01` through `S20`. Checked against the current ledger and proposal files; no exact source-ID collision.

## Recommendation

Close only the identity-boundary portion of the remaining checklist. Keep the current vinegar subtypes distinct from generic `vinegar`; keep lemon juice distinct from lime juice; preserve `fresh`, `from concentrate`, and `reconstituted` as recipe/product qualifiers where present. For juice made from the named fruit's concentrate and restored with water, the CFIA standard treats it as the named juice class; this does not make a water-removed concentrate an alias for ready-to-use juice.

Do not add a default acid percentage, pH, titratable acidity, concentration form, conversion, recipe substitution, or preservation rule. Canadian standards establish class-level bounds for vinegar and minimum composition for named lemon/lime juice, while one current Canadian white-vinegar product page provides a product-specific label value. None of those establishes the actual acidity of any linked recipe product.

Apply this explicit catalog rule: **do not infer preservation suitability from the words `vinegar`, `white vinegar`, `lemon juice`, or `lime juice`, from an ingredient's recipe amount, or from a product name or general use claim.** No preservation recommendation is included here.

## Current catalog boundary

The live reference file has separate identities for generic and named vinegars, and for lemon and lime juice. Preserve those owners and their existing names/aliases as follows:

| Current reference | Current English / Québec French name | Relevant current aliases | Boundary recommendation |
|---|---|---|---|
| `ingredient-ref-vinegar` | `vinegar / vinaigre` | None | Keep generic. Do not add it as an alias on every subtype or use a subtype as a generic alias. |
| `ingredient-ref-white-vinegar` | `white vinegar / vinaigre blanc` | EN: `distilled white vinegar`, `spirit vinegar`, `alcohol vinegar`, `grain vinegar`; FR: `vinaigre blanc distillé`, `vinaigre d'alcool`, `vinaigre de grain` | Retain its current alias set. Keep it separate from wine, cider, malt, rice, balsamic, cane, coconut, and seasoned vinegars. |
| `ingredient-ref-lemon-juice` | `lemon juice / jus de citron` | EN: `fresh lemon juice`, `lemon juice from concentrate`, `reconstituted lemon juice`; FR: `jus de citron frais`, `jus de citron fait de concentré`, `jus de citron reconstitué` | Keep fresh and same-fruit reconstituted juice searchable under lemon juice, while preserving any source qualifier. Do not treat water-removed lemon juice concentrate as ready-to-use juice. |
| `ingredient-ref-lime-juice` | `lime juice / jus de lime` | EN: `fresh lime juice`, `lime juice from concentrate`, `reconstituted lime juice`; FR: `jus de citron vert`, `jus de lime frais`, `jus de lime fait de concentré`, `jus de lime reconstitué` | Keep separate from lemon juice. Retain `jus de citron vert` as a Québec French search alias; OQLF records `lime` as a preferred term and `citron vert` as a synonym for the fruit. Do not treat water-removed lime juice concentrate as ready-to-use juice. |

Other active vinegar identities inspected are `ingredient-ref-apple-cider-vinegar`, `ingredient-ref-balsamic-vinegar`, `ingredient-ref-cane-vinegar`, `ingredient-ref-chinkiang-vinegar`, `ingredient-ref-coconut-vinegar`, `ingredient-ref-malt-vinegar`, `ingredient-ref-red-wine-vinegar`, `ingredient-ref-rice-vinegar`, `ingredient-ref-seasoned-rice-vinegar`, `ingredient-ref-sherry-vinegar`, `ingredient-ref-white-wine-vinegar`, and `ingredient-ref-wine-vinegar`. Retain their current subtype names and aliases; none has an acidity measure in the active reference record. `ingredient-ref-verjuice` also remains separate from vinegar and from lemon/lime juice.

There are no matching vinegar, lemon-juice, lime-juice, or verjuice forms in the active forms file. The lemon, lime, and vinegar references have no default density or unit mappings. No exact vinegar/juice terms occur in the 66 legacy candidates. This audit proposes no new reference, form, alias, or relink.

## What the current acidity evidence establishes

| Evidence | Finding | Limit |
|---|---|---|
| Canadian Food and Drug Regulations, B.19.001 [S01] | The legal vinegar class is defined by acetous fermentation and has a permitted range of **4.1% to 12.3% acetic acid**. | This is a class-wide legal range, not the acidity value of generic vinegar, any particular subtype, any recipe ingredient, or a preservation suitability claim. |
| CFIA Canadian Food Compositional Standards, Vol. 10 §§10.3.7–10.3.8 and 10.3.15; Vol. 16 §§16.1.1–16.1.5 [S02] | Before sweetening and measured at 20°C, the named lemon-juice standard requires at least **5.0 g/100 mL acid calculated as anhydrous citric acid**; lime juice requires at least **5.5 g/100 mL**. Same-named reconstituted juice/from-concentrate juice complies with the named-juice standard. Vol. 16 distinguishes vinegar classes such as wine, spirit/white/grain, malt, cider/apple, and blended vinegar. | These are regulatory class specifications, not measured values for fresh fruit, a recipe, or a named retail package. The juice acid basis and units differ from vinegar's acetic-acid percentage; this review makes no conversion or equivalence between them. A concentrate with water removed is not the same product description as juice from concentrate. |
| Farm Boy Pure White Vinegar 4 L product page [S05] | One current Canadian bilingual product listing states that this product contains **5% acetic acid by volume**. | Product-specific evidence only. No bundled recipe names this product. The product-page use language is not used as evidence of recipe or preservation suitability. Do not apply its value to other white vinegars or to generic vinegar. |
| ReaLemon/ReaLime Canadian French product page [S06] | The manufacturer describes those bottled products as concentrated lemon/lime juice restored with filtered water and lists water, concentrated juice, sulphites, and lemon/lime oil. | The current ingredient list gives no acid percentage or assay. Its fresh-juice comparisons are manufacturer-specific and are not used as conversions or evidence of acidity. |
| Current linked recipe pages [S07–S20] | Pages identify vinegar, white vinegar, fresh lemon juice, lemon juice, lime juice, or a vinegar-or-lime-juice alternative. | The pages reviewed do not report pH, titratable acidity, acetic-acid percentage, citric-acid concentration, or a named acid-strength product for the recipe lines. A current page may also differ from the imported row; see the row audit below. |

Acetic-acid percentage by volume and grams of acid calculated as anhydrous citric acid per 100 mL are different source measures. The figures above are recorded only as evidence about the cited legal/product classes. They do not populate catalog measurements, constrain recipe quantities, or show that two products are interchangeable.

## Bundled recipe-row audit

Static audit of the current manifest: **114 recipes / 1,123 ingredient rows**. The 15 acid-related rows are listed below. Row text and active links are from the bundled recipe JSON, not reconstructed from a current web page. External source status notes identify where the page now differs or was unavailable.

| Recipe / row | Stored ingredient text | Active reference | Source / current-page check |
|---|---|---|---|
| 007#5, refried pinto beans | `5 g vinegar or lime juice` | Unlinked compound alternative | [S07] currently displays this choice and a separate vinegar line elsewhere on that page. The stored row does not identify which alternative was intended. |
| 012#6, lemon crinkle cookies | `60 ml fresh lemon juice` | `ingredient-ref-lemon-juice` | [S12] currently identifies fresh lemon juice. No product or acid strength is specified. |
| 014#4, blueberry cake filling | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` | [S13] currently describes fresh lemon juice; its ingredient card says lemon juice. No acidity value is given. |
| 019#5, crab balls | `2 tsp fresh lemon juice` | `ingredient-ref-lemon-juice` | [S14] currently shows fresh lemon juice. No product or acid strength is specified. |
| 024#3, date squares | `2 tbsp lemon juice` | `ingredient-ref-lemon-juice` | [S15] is the current French recipe page and labels the ingredient `jus de citron`. No acidity value is given. |
| 029#4, cherry cake filling | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` | [S16] discusses fresh lemon juice, but its ingredient card says lemon juice. No acidity value is given. |
| 034#13, classic beef chili | `3 tbsp lime juice` | `ingredient-ref-lime-juice` | [S17] currently lists lime juice. No product or acid strength is specified. |
| 074#15, meatloaf | `1 tbsp vinegar` | `ingredient-ref-vinegar` | [S08] is currently updated and no longer contains a vinegar ingredient. The stored row is not confirmed by the current source version. |
| 085#8, maple chicken | `1 tbsp vinegar` | `ingredient-ref-vinegar` | [S09] could not be fetched during this audit. The stored row remains the only available evidence for this line. |
| 091#10, red velvet cake | `1 tsp white vinegar` | `ingredient-ref-white-vinegar` | [S10] currently calls for distilled white vinegar. The source does not identify a brand or acid percentage. |
| 095#7, satay | `1 tbsp fresh lime juice` | `ingredient-ref-lime-juice` | The bundled recipe has no source URL metadata, so the original line could not be checked against a current source. |
| 101#8, Big Mac sauce | `1 tsp white vinegar` | `ingredient-ref-white-vinegar` | [S11] now redirects to a current recipe page that contains no vinegar line. The stored row is not confirmed by that current page. |
| 106#4, blueberry pie | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice` | [S18] currently lists 3 tbsp fresh lemon juice, so the current page differs from the stored amount. This review does not reconcile or change either amount. |
| 108#3, raspberry pie | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice` | [S19] currently lists 3 tbsp lemon juice for the filling and 1 tsp for crust; the stored row does not match that current page. This review does not reconcile or change either amount. |
| 113#5, tzatziki | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` | [S20] currently lists lemon juice. No product or acid strength is specified. |

The four explicitly linked vinegar rows use only generic vinegar or white vinegar. The source-labeled styles such as cider, wine, rice, malt, balsamic, and Chinkiang vinegar do not occur in these recipe rows. The audit found eight lemon-juice rows and two lime-juice rows, plus the unlinked vinegar-or-lime alternative. None identifies bottled brand, product label, acidity value, pH, or titratable acidity. The current-page amount mismatches and unavailable pages are evidence gaps; no recipe text or quantity is revised here.

## Rules for future catalog or recipe work

1. Record a product-specific acidity constraint only when the cited source identifies the exact product and value, preserving the source's stated acid basis, unit, and method. Do not copy a legal minimum/range into a generic ingredient default.
2. Keep lemon juice and lime juice separate. Keep vinegar type/source identities separate. The compound recipe text `vinegar or lime juice` stays unresolved unless a later source explicitly chooses one.
3. Preserve source qualifiers such as fresh, juice from concentrate, and reconstituted when those qualifiers are present. Do not let these aliases imply an acid-strength equivalence or collapse a water-removed concentrate into prepared juice.
4. Never infer preservation suitability from a product name, broad product class, recipe amount, recipe title, or retailer use claim. This packet has no preservation validation evidence and adds no preservation guidance.
5. Do not use these standards or the Farm Boy label to infer a conversion, substitute one acid product for another, or adjust a recipe. No numeric behavior is proposed.

## Active rules and ledger state

The bundled `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` arrays are both empty at this snapshot. The research ledger still contains blocked draft records for apple-cider-vinegar ↔ white-vinegar and lemon-juice ↔ lime-juice, and marks some active ingredient measurement/substitution research as blocked or needing review. Those ledger states are not active recipe rules. This review does not approve, restore, or modify a rule.

## Source register

| Source ID | Source | Evidence used and scope limit |
|---|---|---|
| `WP05-ACIDITY-PRESERVATION-20261012-S01` | Justice Canada, [Food and Drug Regulations B.19.001](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html), current to 2026-09-21. | Vinegar definition and legal 4.1–12.3% acetic-acid range; not an exact product value or preservation finding. |
| `WP05-ACIDITY-PRESERVATION-20261012-S02` | CFIA, [Canadian Food Compositional Standards (EN)](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 10 §§10.3.7–.8, .15 and Vol. 16 §§16.1.1–.5; [Normes canadiennes de composition des aliments (FR)](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), corresponding sections. | Lemon/lime juice class minima, same-named reconstituted juice, and named vinegar classes; class rules only, not recipe or retail-product assays. |
| `WP05-ACIDITY-PRESERVATION-20261012-S03` | OQLF, [vinaigre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095434/vinaigre) and [vinaigre d’alcool (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095435/vinaigre-dalcool). | Québec French term `vinaigre`; English `vinegar`; term `vinaigre d’alcool / spirit vinegar`. Terminology does not provide an acid concentration. |
| `WP05-ACIDITY-PRESERVATION-20261012-S04` | OQLF, [lime (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366576/lime); see also OQLF entries [limade](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26579766/limade) and [guacamole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502291/guacamole). | `lime` is the preferred Québec French fruit term and `citron vert` is also recorded; OQLF usage examples use `jus de lime`. This supports terminology, not product equivalence. |
| `WP05-ACIDITY-PRESERVATION-20261012-S05` | Farm Boy, [Farm Boy Pure White Vinegar (4 L)](https://www.farmboy.ca/products/farm-boy-pure-white-vinegar-4-l/). | Current bilingual product page identifies this single product as containing 5% acetic acid by volume. Not generalized to other vinegars or recipes. |
| `WP05-ACIDITY-PRESERVATION-20261012-S06` | ReaLemon/ReaLime, [Les produits (FR)](https://www.realemon.ca/fr/products). | Current brand-specific process description and ingredient lists; no acid percentage is published on this page. Its fresh-fruit quantity comparison is not used. |
| `WP05-ACIDITY-PRESERVATION-20261012-S07` | Ethan Chlebowski, [Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch). | Current page has a vinegar-or-lime-juice row and another vinegar line; no acidity value. The latter is not an additional bundled acid row. |
| `WP05-ACIDITY-PRESERVATION-20261012-S08` | Allrecipes, [Easy Meatloaf](https://www.allrecipes.com/recipe/16354/easy-meatloaf/). | Current page, updated July 2026, has no vinegar ingredient; cited only to document source-version mismatch with the stored row. |
| `WP05-ACIDITY-PRESERVATION-20261012-S09` | Foodie Badge, [One Pan Butter Garlic Chicken / Korean Soy Sauce Chicken](https://foodiebadge.com/one-pan-butter-garlic-chicken-korean-soy-sauce-chicken-chicken-breast-recipe/). | URL is stored as the recipe source; page was inaccessible to the browser audit. No independent current-page confirmation. |
| `WP05-ACIDITY-PRESERVATION-20261012-S10` | Sally’s Baking Addiction, [Red Velvet Cake with Cream Cheese Frosting](https://sallysbakingaddiction.com/red-velvet-layer-cake-with-cream-cheese-frosting/). | Current page specifies distilled white vinegar; no brand or acid percentage. |
| `WP05-ACIDITY-PRESERVATION-20261012-S11` | Joshua Weissman, [Big Mac recipe](https://www.joshuaweissman.com/post/mcdonald-s-big-mac-but-better) (redirects to current recipe page). | Current redirected page has no vinegar ingredient; cited only to document source-version mismatch. |
| `WP05-ACIDITY-PRESERVATION-20261012-S12` | Preppy Kitchen, [Lemon Crinkle Cookies](https://preppykitchen.com/lemon-crinkle-cookies/). | Current page specifies fresh lemon juice; no acidity value. |
| `WP05-ACIDITY-PRESERVATION-20261012-S13` | Baking with Butter, [Blueberry Cake Filling](https://bakingwithbutter.com/blueberry-cake-filling/). | Current page ingredient card says lemon juice and narrative specifies fresh lemon juice; no acidity value. |
| `WP05-ACIDITY-PRESERVATION-20261012-S14` | Eat Yourself Skinny, [Baked Crab Cake Balls](https://www.eatyourselfskinny.com/baked-crab-cake-bites-with-sriracha-dipping-sauce/). | Current page specifies fresh lemon juice; no acidity value. |
| `WP05-ACIDITY-PRESERVATION-20261012-S15` | Ricardo Cuisine, [Carré aux dattes (le meilleur)](https://www.ricardocuisine.com/recettes/5263-carre-aux-dattes-le-meilleur). | Current French recipe specifies `jus de citron`; no acidity value. |
| `WP05-ACIDITY-PRESERVATION-20261012-S16` | Baking with Butter, [Cherry Cake Filling](https://bakingwithbutter.com/cherry-cake-filling/#mv-creation-197-jtr). | Current ingredient card says lemon juice; narrative specifies fresh lemon juice. No acidity value. |
| `WP05-ACIDITY-PRESERVATION-20261012-S17` | Ricardo Cuisine, [Classic Beef Chili](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili). | Current page specifies lime juice; no acidity value. |
| `WP05-ACIDITY-PRESERVATION-20261012-S18` | Preppy Kitchen, [Blueberry Pie](https://preppykitchen.com/blueberry-pie/). | Current page lists 3 tbsp fresh lemon juice; differs from the stored row. No acidity value or reconciliation proposed. |
| `WP05-ACIDITY-PRESERVATION-20261012-S19` | The Busy Baker, [Classic Raspberry Pie](https://thebusybaker.ca/classic-raspberry-pie/). | Current page lists lemon juice in the filling and crust with quantities that differ from the stored row. No acidity value or reconciliation proposed. |
| `WP05-ACIDITY-PRESERVATION-20261012-S20` | Cookie and Kate, [Tzatziki](https://cookieandkate.com/how-to-make-tzatziki/). | Current page specifies lemon juice; no acidity value. |

## Remaining gaps

- No linked recipe identifies an exact acid product or reports its measured acidity, pH, or titratable acidity.
- No source establishes product-specific lemon or lime juice acidity for the recipe lines; current ReaLemon/ReaLime pages provide ingredients but no percentage.
- The current Foodie Badge page is inaccessible and recipe 095 has no source URL. Several stored recipe rows no longer match current source versions.
- The Canadian legal/class evidence cannot be promoted into product defaults or preservation guidance.
- The evidence audit does not close the full acid-concentration/product-constraints requirement: exact product and application evidence is still needed before recording a value or assessing preservation suitability. The integration note records the completed row audit and its open next-evidence gate.
