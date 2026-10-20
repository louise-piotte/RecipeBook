# WP04 Section P — salmon roe / ikura product-boundary review (round 33)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only product-identity, Canadian and Québec naming, exact ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Keep salmon roe / œufs de saumon out of active references until a bundled recipe selects a salmon-roe product. Keep ikura, salmon caviar, and other roe terms distinct; add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.
- **Write scope:** This proposal file only. No shared catalog, ledger, plan, roadmap, recipe, or code file changed.

## Open gap and bounded decision

The live [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4167) still includes “Roe, tobiko, masago, salmon roe, bottarga, and caviar where recipes call for them.” Salmon roe is an explicitly named product in that open item. The earlier [tobiko/masago review](wp04-tobiko-masago-roe-boundary-review-20261009.md) names salmon roe / ikura as a separate neighbor, and the [bottarga recheck](wp04-bottarga-coordinator-recheck-20261009.md) and [lumpfish-roe review](wp04-section-p-lumpfish-roe-caviar-product-boundary-review-20261012.md) likewise keep it separate. Those packets do not allocate a salmon-roe identity or assess its current Québec/Canadian product labels and picker behavior. This packet reviews only that remaining product boundary.

The bilingual terminology pair is well supported: OQLF gives the preferred Québec French term **œufs de saumon** and the English equivalent **salmon roe**. That entry is dated 1983 and does not identify a salmon species, curing state, package, or particular roe product. Current Canadian sellers use the name for differing listings: one Montreal shop page identifies an ikura product as salmon roe from Germany without a taxon, while an Edmonton supplier identifies its listing as Salmo salar and describes it as lightly salted and ready to eat. A current Metro product listing says Salmon Roe Caviar, but gives no species or ingredients and is marked out of stock. These listings do not establish one interchangeable product family.

Do not add a generic salmon-roe reference now. If a later bundled recipe specifies a product, review the exact recipe line and package label together. Keep any identified roe product separate from whole salmon, salmon fillets, tobiko, masago, lumpfish roe, bottarga, trout roe, and sturgeon caviar. Do not assume a species, curing method, salt level, or use of ikura from the unqualified term alone.

## English and Québec French naming

Use **salmon roe / œufs de saumon** as the OQLF-backed terminology pair when recording the candidate. Treat **ikura** as a source-attested product term, not a global alias: its Canadian and Montréal listings do not establish a single species or process across products. Keep **salmon caviar** and **caviar de saumon** out of aliases. A few retail and restaurant listings use “caviar” descriptively, while the current catalog already returns finger lime / lime caviar for a bare caviar query. Do not make a named roe product stand in for generic roe or caviar.

The Salmon Roe Caviar wording on one Metro listing is evidence for that retailer SKU title only. The Montreal product page uses Ikura and Salmon roe; the Edmonton supplier lists Ikura as another name for its Salmo salar product. These seller descriptions do not establish that all salmon roe is ikura or that ikura always has one species, origin, or curing state.

## Prior-work and exact-ownership audit

The live reference, form, legacy, and ledger values were checked using the same key normalization as IngredientSearch.kt: lowercase and NFKD, fold œ / æ / ß and &, remove diacritics, replace punctuation with spaces, and collapse whitespace. Exact checks covered salmon roe, salmon eggs, salmon caviar, ikura, œufs de saumon, caviar de saumon, generic roe / fish roe / fish eggs, candidate IDs, and the proposal-local source prefix.

| Candidate term or ID | Active reference owner | Form owner | Legacy owner | Ledger owner |
|---|---|---|---|---|
| salmon roe; œufs de saumon | None | None | None | None |
| ikura | None | None | None | None |
| salmon eggs; salmon caviar; caviar de saumon | None | None | None | None |
| roe; fish roe; fish eggs | No exact-key owner | None | None | No exact candidate record |
| ingredient-ref-salmon-roe; ingredient-ref-ikura; candidate-salmon-roe | None | None | None | None |
| WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33 source IDs | Not applicable | Not applicable | Not applicable | Unallocated |

The nearby active fish row is ingredient-ref-salmon-fillets-without-skin, displayed as salmon fillets / filet de saumon. It does not own any roe term. The audit snapshot contained 1,365 active references, 100 forms, 64 legacy candidates, and 1,692 ledger records. No dedicated salmon-roe proposal or batch was found; earlier roe packets mention it only as a distinct neighboring product.

## Picker projection

The table statically applies the current phrase-first then substring-fallback search behavior. The hypothetical entry is displayed only as salmon roe / œufs de saumon, without aliases or forms; it is not active.

| Query | Current result | Hypothetical result | Effect |
|---|---|---|---|
| salmon roe | None | Salmon roe / œufs de saumon | Exact product phrase would return the hypothetical row. |
| œufs de saumon | None | Salmon roe / œufs de saumon | Exact Québec French product phrase would return the hypothetical row. |
| ikura | None | None | No effect without an ikura alias; the alias is not recommended until a recipe selects that product. |
| salmon; saumon | Salmon fillets / filet de saumon | Salmon fillets and salmon roe | A broad species query would offer both flesh and roe. |
| roe | Greenland halibut / flétan du Groenland by substring fallback | Salmon roe only | The complete phrase inside salmon roe would suppress the current fallback result, making the still-generic roe query appear to identify salmon roe. |
| caviar | Finger lime / lime caviar | Finger lime / lime caviar | Unchanged with no caviar alias. Adding salmon caviar would make this generic query return another distinct product. |
| fish roe; fish eggs | None | None | No generic roe alias is proposed. |

The exact product query would be useful if a recipe named salmon roe, but the generic roe query effect is a material boundary problem. A single roe row would resolve a broad query to one species of roe while other roe products remain separate and unallocated. Keep the candidate out of the shared picker until a recipe specifies the required product and the broader search behavior can preserve that distinction.

## Bundled recipe demand

The full manifest-listed bundle was scanned in manifest order: **114 recipe files and 1,123 ingredient rows**. The scan covered complete UTF-8 recipe JSON plus ingredient rows for salmon roe, salmon eggs, salmon caviar, ikura, œufs de saumon, caviar de saumon, fish roe, fish eggs, and roe. It found **zero matching ingredient rows and zero matching recipe files**. No recipe link is supported.

Recipe 077 requests 675 g of skinless salmon fillets; that row belongs to the existing salmon-fillets reference and does not call for roe. A separate Metro-hosted recipe from 2013, credited to the Fédération des producteurs de lait du Québec, serves four and lists 1 oz (30 g) salmon roe as a garnish in a smoked-salmon-and-crab crisp. That is an external, source-specific recipe observation, not a bundled-library request or a general serving recommendation.

## Measures, numeric limits, and substitutions

The reviewed product pages list package quantities only: Metro lists one 50 g Salmon Roe Caviar SKU; the Montreal ikura page offers 50 g and 100 g sizes; and the Edmonton supplier lists seven 200 g jars with a 1.4 kg minimum order. These are seller-specific package facts. They do not establish a serving size, household measure, density, edible yield, count-to-mass conversion, or product equivalence.

The Edmonton supplier describes one Salmo salar product as fresh and lightly salted, ready to eat. This wording is specific to that supplier listing and does not establish a common state for the other products. The Metro recipe’s 1 oz (30 g) is an amount in one four-serving garnish recipe; do not convert it into a universal per-serving quantity. Add no default density, unit mapping, active measure, form, package yield, cooking conversion, or recipe amount.

No reviewed source validates a global or dish-scoped substitution among salmon roe, trout roe, lumpfish roe, masago, tobiko, bottarga, sea-urchin gonads, or sturgeon caviar. Keep substitution rules and recipe-line substitutions empty.

## Recommended next action

Leave the salmon-roe candidate unallocated and keep the Section P roe checklist open. Revisit when a bundled recipe requests salmon roe or ikura. At that point, capture the recipe’s exact wording and a matching current package label, resolve species and preparation scope, and repeat the live ownership and picker audit before proposing any identity, alias, form, quantity, or recipe link.

## Sources

Source IDs are proposal-local, were checked for exact collisions before use, and do not create ledger entries. Online sources were reviewed on 2026-10-13.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S01** | Office québécois de la langue française, [GDT: œufs de saumon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435824/oeufs-de-saumon), preferred term and English translation | Gives Québec French œufs de saumon and English salmon roe in the food/fish-product domain. Last updated 1983; does not identify species, product state, or current retail supply. |
| **WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S02** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Common name,” lines 62–80 | Sets the general common-name labeling framework for packaged fish products and points to CFIA Fish List names. It does not establish the recipe-catalog identity, species, or preparation of the reviewed roe listings. |
| **WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S03** | Metro, [Quintessence Salmon Roe Caviar](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/prepared-fish-seafood/spreads-mousse-caviar/salmon-roe-caviar/p/186866000108), product 186866000108 | Current indexed Québec-retailer listing gives the title Salmon Roe Caviar and a 50 g package; the item showed out of stock. Direct page retrieval was blocked. The listing gives no species, ingredient declaration, curing state, or Québec French title. |
| **WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S04** | Oysters & Caviar, Montréal, [Ikura / Salmon roe](https://oystersandcaviar.ca/products/salmon-roe) | Current shop page identifies an Ikura listing as Salmon roe, gives 50 g and 100 g options and Germany as origin, and says products are packed in Montréal. The listing showed sold out and supplies no species taxon or complete process/formulation. Retailer claims are product-specific. |
| **WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S05** | Salties, Edmonton, [Salmon Roe (ikura)](https://www.salties.ca/products/salmon-roe) | Supplier lists Salmo salar, French œufs de saumon, seven 200 g jars, ready-to-eat status, 1.4 kg minimum order, and year-round availability. Its description calls the roe fresh and lightly salted. These are one supplier’s claims and package terms, not a Québec household measure or common specification. |
| **WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S06** | Metro, [Smoked Salmon and Crab Crisp](https://www.metro.ca/en/recipes-occasions/recipes/smoked-salmon-and-crab-crisp), recipe dated 2013-08-06 | A four-serving recipe lists 1 oz (30 g) salmon roe as garnish. The recipe is external to the bundled library, is dated, and does not specify species or product state; preserve the amount only as this recipe’s observation. |

No app tests or emulator checks were run. This is a proposal-only documentation change; the catalog and app were not modified.
