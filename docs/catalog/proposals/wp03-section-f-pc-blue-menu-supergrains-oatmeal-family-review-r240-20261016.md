# WP03 Section F R240 — PC Blue Menu Supergrains oatmeal family review (2026-10-16)

**Status:** Accepted and integrated on 2026-10-16 by the parent agent. The catalog JSON, research ledger, generated index, plan, roadmap, and batch README are updated.

**Recommendation:** Add the two currently listed Canadian PC Blue Menu Supergrains oatmeal products together as identity-only `GRAIN_AND_CEREAL` references. Reviewing both SKUs together prevents a broad Supergrains query from selecting just one flavor.

| Field | Regular |
|---|---|
| Proposed ID | `ingredient-ref-pc-blue-menu-regular-supergrains-oatmeal` (unallocated) |
| English display | `PC Blue Menu Regular Supergrains Oatmeal` |
| Québec French display | `Gruau supergrains nature Menu Bleu` |
| English / French aliases | `[]` / `[]` |
| Category; density; unit mappings | `GRAIN_AND_CEREAL`; `null`; `[]` |

| Field | Maple and brown sugar |
|---|---|
| Proposed ID | `ingredient-ref-pc-blue-menu-maple-brown-sugar-supergrains-oatmeal` (unallocated) |
| English display | `PC Blue Menu Maple and Brown Sugar Flavour Supergrains Oatmeal` |
| Québec French display | `Gruau supergrains à saveur d’érable et cassonade Menu Bleu` |
| English / French aliases | `[]` / `[]` |
| Category; density; unit mappings | `GRAIN_AND_CEREAL`; `null`; `[]` |

The Section F checklist still leaves regional cereal mixes and preprocessed grains open ([current plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L3714)). R237 already covers Quaker Super Grains Hot Cereal / Gruau Quaker Super Grains; this proposal covers separate PC Blue Menu single-serve oatmeal products, not another Quaker product or a generic supergrain blend.

## Product boundary and Québec naming

Current Loblaws product listings name both English SKUs, each as an eight-pack of 38 g sachets. The store’s French product pages name them **Gruau supergrains nature Menu Bleu** and **Gruau supergrains à saveur d’érable et cassonade Menu Bleu** and show distinct product numbers, 21000529_EA and 21004695_EA [S01–S04]. Current Québec Maxi listings independently show both French product names [S05]. These are current retailer product titles and market naming, not an OQLF terminology ruling.

The regular product description says it contains flax and chia; its English product listing supplies the full current ingredient declaration, including a multigrain blend of barley, wheat, and rye flakes, oat bran, flaxseed, and black chia seed [S01]. The French descriptions for both SKUs also mention flax and chia [S02, S04]. That evidence does not establish that every current or future Supergrains product shares one formula. Keep these two branded products separate from each other, Quaker Super Grains Hot Cereal, plain rolled oats, generic instant oatmeal, PC Blue Menu steel-cut oats, and their constituent grains. Do not add component ingredients as aliases.

The French wording is direct Québec retailer naming. It uses *gruau*, which also names a prepared dish in Québec; retain the explicit product qualifiers in these displays and add no bare `gruau` alias.

## Catalog, forms, ledger, and archive audit

Read-only snapshot at review time: **1,632 active references, 122 forms, 61 legacy-import candidates, 1,977 research-ledger records, and 114 manifest-listed recipes / 1,123 structured ingredient rows**. I normalized the candidate titles using the same accent-, punctuation-, and case-folding rules as `IngredientSearch.kt`, then checked reference displays and aliases, form labels and match terms, and legacy-import displays and aliases.

| Surface | Finding |
|---|---|
| Active references | No exact normalized owner for either proposed English or French display, either product number, or the phrases `PC Blue Menu Regular Supergrains Oatmeal`, `PC Blue Menu Maple and Brown Sugar Flavour Supergrains Oatmeal`, `Gruau supergrains nature Menu Bleu`, and `Gruau supergrains à saveur d’érable et cassonade Menu Bleu`. R237’s Quaker title is a related but distinct product. |
| Forms | No exact product title or product-specific form among the 122 active forms. Both proposals would have no forms. |
| Legacy import | No exact product candidate among the 61 legacy candidates. Both proposed reference IDs are unallocated. |
| Research ledger | No exact product title, product number, proposed reference ID, or proposed R240 source ID was found among the 1,977 records. Existing supergrain-related notes concern other products and do not identify these PC Blue Menu SKUs. |
| Proposal / batch archive | Before this proposal was created, no focused review or disposition for these products, product numbers, proposed IDs, or R240 was found. The previous Quaker Super Grains review is not a duplicate. |
| Recipe corpus | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for the product titles, French titles, product numbers, and Supergrains query phrases. Found zero recipe-file hits, zero ingredient-row hits, and zero recipe links. |

## Picker projection

This static projection applies the complete-word-phrase-first matching in `IngredientSearch.kt` across current reference and form terms, then repeats with only the two proposed bilingual displays. It is not live picker QA.

| Query | Current results | With both proposed displays |
|---|---:|---:|
| `supergrains` / `supergrains oatmeal` | 0 / 0 | 2 / 2 |
| `PC Blue Menu` | 0 | 2 |
| `gruau supergrains` | 0 | 2 |
| `super grains` | 1 (Quaker) | 1 (Quaker; unchanged) |
| `gruau` | 7 | 9 |
| `oatmeal` | 1 | 3 |
| `oats` | 9 | 9 (unchanged) |

Keep aliases empty. The bilingual titles provide narrow product searches; adding `super grains` would blur the spelling distinction with the Quaker product, while bare `oatmeal`, `gruau`, `oats`, or component aliases would widen results beyond these named SKUs. The picker result counts show that broad Supergrains queries would return both family members.

## Measurements, forms, preparation, and substitutions

- Retailer product titles show **8 × 38.0 g** for both boxes [S03–S05]. Valu-Mart’s regular-product page identifies a product-specific **38 g** serving and ingredient list [S01]. Retain these only as source-specific package or label observations if the proposal is accepted; do not make them reusable measures or infer a volume-to-mass conversion. The Loblaws French page currently emits an erroneous `Portion 0 g` field, so it is not used as a quantity [S02, S04].
- No default density or kitchen-unit mapping is supported.
- The products are sold as instant oatmeal sachets. Retail descriptions do not establish a standardized cooked yield, a dry/cooked conversion, or a transferable preparation quantity. Add no forms, package yields, or conversion rules.
- No checked source gives an ingredient-for-ingredient replacement ratio or recipe context. Add no global or contextual substitution rule between either SKU, Quaker Super Grains, plain oats, other hot cereals, or any component grain.
- The corpus contains no product-specific recipe demand. Add no recipe links.

## Proposal-local source register

The IDs are proposal-local and unallocated. Sources were checked online on 2026-10-16.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-PC-BLUE-MENU-SUPERGRAINS-R240-20261016-S01` | Valu-Mart, [Blue Menu Regular Supergrains Oatmeal](https://www.valumart.ca/en/blue-menu-regular-supergrains-oatmeal/p/21000529_EA?source=nspt). | Current product page gives item number 21000529_EA, 8 × 38.0 g package, 38 g serving, product description, and full ingredient declaration. The ingredient list is SKU-specific and not a transferable formula. |
| `WP03-PC-BLUE-MENU-SUPERGRAINS-R240-20261016-S02` | Loblaws Québec, [Gruau supergrains nature Menu Bleu](https://www.loblaws.ca/fr/gruau-supergrains-nature-menu-bleu/p/21000529_EA). | Current French product page identifies item 21000529_EA, the Québec display title, 8 × 38.0 g listing, and a description naming flax and chia. Its displayed serving field says 0 g and is treated as a data error, not usable measurement evidence. |
| `WP03-PC-BLUE-MENU-SUPERGRAINS-R240-20261016-S03` | Loblaws, [Blue Menu oatmeal search results](https://www.loblaws.ca/en/search?search-bar=blue+menu+oatmeal). | Current Canadian product search lists both regular and maple/brown sugar Supergrains oatmeal products, each 8 × 38.0 g. Availability and price are store- and date-dependent. |
| `WP03-PC-BLUE-MENU-SUPERGRAINS-R240-20261016-S04` | Loblaws Québec, [Gruau supergrains à saveur d’érable et cassonade Menu Bleu](https://www.loblaws.ca/fr/gruau-supergrains-saveur-d-rable-et-cassonade-menu/p/21004695_EA). | The current indexed French product page identifies item 21004695_EA, the Québec title, 8 × 38.0 g listing, and a description naming flax and chia. Direct page retrieval returned a cache miss during this review; its indexed result also has the erroneous 0 g serving field. Do not treat that field as measurement evidence or assume a full formula from the product description. |
| `WP03-PC-BLUE-MENU-SUPERGRAINS-R240-20261016-S05` | Maxi Québec, [Céréales et petit-déjeuner listings](https://www.maxi.ca/fr/alimentation/garde-manger/c-r-ales-et-petit-d-jeuner/c/28183?page=5). | Current French-category listings independently show both product titles and 8 × 38.0 g packaging. This supports local product naming and current listing, not an OQLF ruling or availability across Québec. |

## Disposition

Recommend two identity-only `GRAIN_AND_CEREAL` references using the product-qualified English and Québec French displays above, with empty aliases and forms, null densities, and empty unit mappings. Preserve only the SKU-specific 8 × 38.0 g packaging and the regular product’s 38 g label portion as ledger observations if integrated. Keep the two SKUs separate, preserve the 0 g French serving-field anomaly as an explicit source limitation, and add no recipe links, conversions, yields, or substitutions. The broader Section F regional cereal-mix and preprocessed-grain checklist remains open.

The parent agent integrated both identities, source-scoped package observations, and the checklist update; no recipe rows or active conversions were changed.

