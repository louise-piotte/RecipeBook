# WP05 Section V — Culinary Alcohol Boundary Review

- Date: 2026-10-12
- Status: proposal only; no catalog or shared integration files changed.
- Scope: wine color and sweetness terms, sake, existing mirin and its product variants, Shaoxing and other rice wines, and cooking-wine labels.

## Recommendation

Keep the next activation tranche small: verify the existing `white wine / vin blanc` reference, add an identity-only `red wine / vin rouge` reference, and add a distinct `sake / saké` identity. The OQLF provides stable bilingual terminology for all three. Keep `dry` and `sweet` as recipe qualifiers rather than aliases or general wine identities. Verify the existing generic `mirin` identity, but do not map its unqualified recipe line to a particular mirin product type.

Hold Shaoxing and other regional rice wines, generic cooking wine, cooking sake, and salted or sweetened mirin-style products for a recipe- or product-specific review. Sources show that these labels can refer to products with different compositions. The corpus has no exact line naming any of these specific products, and the broad English phrase `rice wine` would incorrectly blur separate regional products.

Do not add measurements, forms, conversions, yields, preservation guidance, or substitutions in this tranche.

## Repository and recipe audit

At the working snapshot used for this review, the bundled package has **1,133 ingredient references, 79 forms, 114 recipes, and 1,123 ingredient rows**. The legacy-import file has **71 candidates**. The research ledger has **1,430 records, 4,763 source entries, 3,900 distinct source IDs, and 8 unit conversions**.

Exact active references relevant to the audit are:

| Reference | Current bilingual name | Current state and boundary |
|---|---|---|
| `ingredient-ref-white-wine` | `white wine / vin blanc` | Active, category `OTHER`, no aliases. Its ledger record is unreviewed and has no sources or decisions. Keep the existing identity; record the OQLF evidence if this tranche is accepted. |
| `ingredient-ref-mirin` | `mirin / mirin` | Active, category `SAUCE_AND_CONDIMENT`, no aliases. Its ledger record is unreviewed and has no sources or decisions. Keep the recipe’s unqualified wording unresolved by product subtype. |
| `ingredient-ref-brandy` | `brandy / brandy`; French alias `eau-de-vie de vin` | Active and verified. The earlier WP05 review treats it as a wine-derived spirit and keeps it distinct from wine and fruit spirits. |
| `ingredient-ref-red-wine-vinegar` | `red wine vinegar / vinaigre de vin rouge` | Active vinegar identity; do not use it as the owner of `red wine` or `wine`. |
| `ingredient-ref-white-wine-vinegar` | `white wine vinegar / vinaigre de vin blanc` | Active vinegar identity; do not use it as the owner of `white wine` or `wine`. |
| `ingredient-ref-frangelico-liqueur` | `frangelico liqueur / liqueur Frangelico` | Existing branded liqueur identity; it is not a wine or rice-wine candidate. |

No alcohol-related forms or legacy candidates were found. Exact name/alias checks found no active owner for `red wine`, `vin rouge`, `sake`, `saké`, `Shaoxing wine`, `rice wine`, `cooking wine`, or `vin de cuisine`. The generic phrase `wine vinegar` is also unassigned; qualified red- and white-wine vinegar references remain separate.

Scanning the ingredient names and source text across all 114 recipe files found four alcohol-related rows:

| Recipe and row | Exact line | Existing reference |
|---|---|---|
| 021, Yule Log, ingredient 21 | `30 ml Frangelico liqueur` | `ingredient-ref-frangelico-liqueur` |
| 057, Chocolate Truffle Cake, ingredient 25 | `1 tbsp brandy` | `ingredient-ref-brandy` |
| 066, Korean Soy-Marinated Jammy Eggs, ingredient 9 | `3 tbsp mirin` | `ingredient-ref-mirin` |
| 096, Pizza Sauce, ingredient 4 | `1 tbsp white wine` | `ingredient-ref-white-wine` |

No ingredient line names red wine, dry or sweet wine, sake, Shaoxing wine, regional rice wine, cooking wine, cooking sake, or a qualified mirin type. The existing white-wine, brandy, and mirin lines remain linked as they are. The extra recipe-text mentions of brandy, mirin, and white wine correspond to those same rows. No recipe relinking is proposed.

## Proposed identities and aliases

| Decision | Candidate identity and aliases | Rationale and limits |
|---|---|---|
| Verify existing | `ingredient-ref-white-wine`: EN `white wine`; fr-CA `vin blanc`; no aliases; category `OTHER`. | OQLF lists these as the English and preferred French terms. CFIA’s Canadian standard defines grape wine separately from fruit wine. Keep the existing recipe 096 link. Do not add `dry white wine`, `sweet white wine`, or `wine vinegar` as aliases. |
| Add | `ingredient-ref-red-wine`: EN `red wine`; fr-CA `vin rouge`; no aliases; category `OTHER`. | OQLF gives this direct bilingual pair. Keep it distinct from active `red wine vinegar`. There is no recipe demand in this bundle; this is an identity-only checklist addition, not a reason to infer a measure or recipe link. |
| Add | `ingredient-ref-sake`: EN `sake`; fr-CA `saké`; proposed EN aliases `saké`, `saki`, and the qualified term `Japanese rice wine`; category `OTHER`. | OQLF defines saké as a Japanese alcoholic beverage made from fermented rice and lists these English terms. Do not add the unqualified `rice wine` alias: it can refer to distinct regional products, including Shaoxing and other rice wines. Do not alias cooking sake to this beverage identity. |
| Verify existing | `ingredient-ref-mirin`: retain EN/FR `mirin`, no aliases, category `SAUCE_AND_CONDIMENT`. | OQLF uses `mirin` in both languages and describes it as a Japanese seasoning. Its market note distinguishes several types. The recipe says only `mirin`, so it does not support choosing a subtype or broadening the active alias set. |

These proposals add no alias for `dry wine / vin sec` or `sweet wine / vin doux`. OQLF records both as wine styles; the sweet-wine entry spans multiple wine kinds. Treat those words as source qualifiers, not synonyms for red or white wine. If future recipes require the distinction, preserve it in recipe text and review a suitable style field separately from ingredient identity.

## Source-backed holds and product boundaries

| Term or product | Recommendation | Evidence and limit |
|---|---|---|
| `hon mirin`, `shin mirin`, `shio mirin`; mirin-style and fermented mirin-type seasonings | Hold as aliases and as new active identities until a recipe or imported product specifies the type. | OQLF and Kikkoman distinguish traditional alcoholic mirin, a low-alcohol mirin-style sweet seasoning, and a fermented type with added salt. Kikkoman’s French product page also labels one retail formulation `assaisonnement de cuisine sucré de style Mirin`. A generic `mirin` line does not identify which product was intended. Do not collapse these products onto the current mirin identity. |
| Shaoxing rice wine and Shaoxing cooking wine | Hold both as active identities pending exact recipe/product demand; keep their labels and product formulations distinct. | The LCBO’s French product listing calls one beverage `Vin de riz Shaoxing` and describes that product as having no added salt. Québec retailer SUE Foods lists `Vin de cuisson shaoxing` with salt in its product ingredients. A Canadian Walmart product similarly labels a salted `Shao Xing Cooking Wine`. These are product-specific examples, not a universal formula for every Shaoxing product. Do not use `Shaoxing wine` and `Shaoxing cooking wine` as aliases for each other. |
| `rice wine`, `Chinese rice wine`, and regional rice wines | Hold an umbrella identity and umbrella alias. Review named regional products individually if they appear in recipes. | OQLF lists `Japanese rice wine` among English terms for saké, while Canadian retail listings distinguish a Shaoxing rice-wine beverage from salted Shaoxing cooking wine. The phrase `rice wine` is therefore too broad for a single cross-regional identity. Keep sake, Shaoxing, and other regional products separate. |
| Generic `cooking wine / vin de cuisine` | Hold as a catalog identity and do not alias it to grape wine, sake, mirin, Shaoxing wine, or vinegar. | OQLF supports the bilingual term pair but gives no product composition. The reviewed examples include salted Shaoxing cooking products and a sweetened mirin-style seasoning; they do not establish one formula for generic cooking wine. The phrase alone does not identify one consistent product. |
| Cooking sake / `料理酒` | Hold separately from unqualified sake. | Kikkoman says cooking sake may be pure rice sake or products with added corn syrup or salt; the manufacturer's glossary describes the salt-added product class. No corpus line names cooking sake. No alias or substitution follows from its use in cooking. |
| `port`, `Madeira`, `Marsala`, `sherry`, and vermouth | Leave open for separate identity and Québec naming reviews. | CFIA recognizes vermouth as a defined wine-based product, distinct from unqualified wine. This packet does not establish the names, aliases, or product scope for all listed fortified and aromatized wines. No recipe line requires any of them. |
| Wine vinegar and other acids | Keep separate from wine and alcoholic rice products. | The current WP05 vinegar decision promotes separate red- and white-wine-vinegar identities and leaves unqualified `wine vinegar` unassigned. The WP05 rice-vinegar decision explicitly excludes `rice wine vinegar` and `Shaoxing vinegar` aliases. Preserve those decisions. |

The Canadian compositional standard defines grape wine from fresh grapes and separately defines fruit wine and vermouth. This supports keeping grape wine apart from rice-based products and wine-based flavored products, but it is not a complete culinary taxonomy for imported regional beverages or cooking-labelled seasonings.

## Reconciliation with prior WP05, WP06, and WP08 work

- The current WP06 East Asia gap sweep routes sake, mirin types, Shaoxing wine, and regional rice wines to WP05 Section V. It says generic mirin is already active and warns against duplicate aliases or treating other rice wines as aliases. This proposal preserves that boundary while reviewing source evidence for a small red-wine/sake tranche.
- The WP05 Japanese-condiment review and its integration batch retain the existing generic mirin identity; neither supplies a product-type alias that should now be added. The present recipe line is still unqualified.
- The completed WP05 brandy review integrated the one exact brandy recipe line and kept brandy distinct from wine. That decision remains unchanged.
- The WP05 vinegar and acid reviews integrated wine-vinegar identities separately and left generic wine-vinegar wording unassigned. They also keep rice wines and Shaoxing wine distinct from vinegar. This proposal does not change those decisions.
- The reviewed WP08 proposals/batches have no culinary-alcohol decision that supersedes these boundaries.

## Evidence sources

All pages below were reviewed on 2026-10-12. Retail pages establish the wording and composition of the particular listed product only.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-ALCOHOL-20261012-S01` | CFIA, [Canadian Food Compositional Standards, Volume 2 — Alcoholic Beverages](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§2.7.1, 2.7.3–2.7.5. | Defines grape wine and separately identifies fruit wine and vermouth. This is a compositional standard, not a complete naming rule for rice wines or culinary seasonings. |
| `WP05-ALCOHOL-20261012-S02` | OQLF, [vin blanc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353540/vin-blanc). | Preferred French term `vin blanc` and English `white wine`; not a cooking-use equivalence. |
| `WP05-ALCOHOL-20261012-S03` | OQLF, [vin rouge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354290/vin-rouge). | Preferred French term `vin rouge` and English `red wine`; distinct from wine vinegar. |
| `WP05-ALCOHOL-20261012-S04` | OQLF, [vin sec (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18947718/vin-sec). | Bilingual style terms `vin sec / dry wine`; no standalone base identity or cross-color equivalence. |
| `WP05-ALCOHOL-20261012-S05` | OQLF, [vin doux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353665/vin-doux). | Bilingual style terms `vin doux / sweet wine`; its note spans several types and does not make it an alias for a specific wine color. |
| `WP05-ALCOHOL-20261012-S06` | OQLF, [saké (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434071/sake). | Preferred French `saké`, English `sake`, plus listed English terms `saké`, `saki`, `Japanese rice wine`, and `rice wine`. Only the qualified English term is proposed as an alias; the broader `rice wine` wording is held. |
| `WP05-ALCOHOL-20261012-S07` | OQLF, [mirin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544925/mirin). | Preferred `mirin` in French and English, and notes hon/shin/shio types with differing alcohol or salt status. It does not support merging each type as an alias. |
| `WP05-ALCOHOL-20261012-S08` | Kikkoman Japan, [About mirin](https://www.kikkoman.co.jp/enjoys/mirin/about.html). | Manufacturer distinguishes hon mirin, a mirin-style seasoning, and a fermented mirin-type seasoning; the latter can contain added salt. These are category/product boundaries, not universal ingredient quantities or interchangeability evidence. |
| `WP05-ALCOHOL-20261012-S09` | Kikkoman, [Sake (Japanese Cooking Sake) glossary](https://www.kikkoman.com/en/cookbook/glossary/sake.html). | Manufacturer distinguishes cooking-sake formulations, including pure rice sake and products with added corn syrup or salt. It does not establish a generic cooking-wine identity or a catalog substitution. |
| `WP05-ALCOHOL-20261012-S10` | LCBO, [Vin de riz Shaoxing Tapaijiu](https://www.lcbo.com/fr/tapaijiu-539783). | French listing title and one Shaoxing rice-wine beverage product described as having no added salt. This does not represent every Shaoxing wine product. |
| `WP05-ALCOHOL-20261012-S11` | SUE Foods, [Vin de cuisson Shaoxing](https://suefoods.com/products/tang-song-vin-de-cuisson-shaoxing). | French-language Canadian product page with the title `Vin de cuisson shaoxing` and salt in the listed ingredients. Retail listing; not a universal formula or standard. |
| `WP05-ALCOHOL-20261012-S12` | Walmart Canada, [Double Happiness Salted Shao Xing Cooking Wine](https://www.walmart.ca/en/ip/Double-Happiness-Salted-Shao-Xing-Cooking-Wine/10279203). | Canadian English product title and one salted Shao Xing product listing. Walmart notes that product information is supplier-provided and not independently verified; use only as a product-specific example. |
| `WP05-ALCOHOL-20261012-S13` | OQLF, [vin de cuisine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18058010/vin-de-cuisine). | Bilingual terms `vin de cuisine / cooking wine`; the entry does not define one composition. |
| `WP05-ALCOHOL-20261012-S14` | Kikkoman France, [Assaisonnement de cuisine sucré de style Mirin](https://www.kikkoman.fr/restauration/produits/detail/fs-assaisonnement-de-cuisine-sucre-de-style-mirin-kikkoman). | French manufacturer naming and one sweetened mirin-style product formulation. Supports keeping the product label distinct from generic mirin, not a Québec-preferred term. |

## Limits and next review

This packet does not propose database JSON, seed-package, recipe, legacy, ledger, checklist, roadmap, or workflow changes. It does not decide how alcohol-use notes, dietary restrictions, or product-specific salinity should be represented. It does not infer that every recipe calling for plain sake or mirin means a salted cooking product.

If a later recipe or imported product names Shaoxing wine, cooking wine, cooking sake, or a mirin subtype, review that exact label and its formulation before adding a reference or alias. Preserve qualifiers and keep the source recipe wording; do not convert one product into another. Leave broader Section V work on fortified wines and other alcoholic ingredients open.

No tests or emulator checks were run for this proposal-only review.
