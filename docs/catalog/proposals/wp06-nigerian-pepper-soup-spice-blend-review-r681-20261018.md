# WP06 African regional coverage R681 — Nigerian pepper-soup spice blend

- **Date:** 2026-10-18
- **Status:** Proposal only. This review creates no shared catalog or ledger data.
- **Scope:** One source-labeled dry seasoning blend used for Nigerian pepper soup.
- **Recommendation:** Add an identity-only `Nigerian pepper soup spice blend / mélange d’épices pour soupe nigériane épicée` reference in `BAKING_AND_SPICE`. Use `pepper soup spices` as the only English alias and no French aliases. Keep the French display descriptive and provisional pending Québec/community terminology review. Add no form, measurement, density, unit mapping, conversion, yield, substitution, or recipe link.

## Why this is an open WP06 item

The plan still marks WP06’s regional gap sweep open: it calls for source-grounded ingredient names and disposition of remaining benchmark misses ([plan, WP06](../../RecipeBook-global-ingredient-catalog-plan.txt#L1005)). R493 explicitly left “blended pepper-soup” products for a separate, product-scoped review ([R493 calabash-nutmeg proposal](wp06-african-next-regional-review-r493-20261017.md#L46)); this packet advances that boundary for the dry Nigerian seasoning blend, without revisiting calabash nutmeg. R512 covers the distinct uziza leaf ingredient used in pepper soups, not the blend ([R512 proposal](wp06-african-next-regional-review-r512-20261017.md#L30)). The ledger-only yaji candidate remains held because its product form is unresolved; this proposal does not map pepper-soup seasoning to yaji or suya spice ([African continuation review](wp06-african-regional-gap-continuation-20261013.md#L69)).

## Evidence and naming boundary

| Proposal-local source ID | Source | Evidence used and limit |
|---|---|---|
| `WP06-AFRICA-PEPPER-SOUP-SPICE-R681-20261018-S01` | Keswet and Abia, [“Sensory evaluation of four pepper soup dishes prepared with four varieties of protein sources using Itsekiri pepper soup spices”](https://academicjournals.org/journal/AJFS/article-full-text/C29669963737), *African Journal of Food Science* 14(4), 98–101 (2020), DOI 10.5897/AJFS2019.1888. | Primary Nigerian study says pepper-soup seasoning varies across cultures and describes an Itsekiri-specific combination of spices cleaned, mixed, ground, and sieved into powder. It supports a regional seasoning product and warns against treating that formula as universal. Use no study amounts, health claims, or preparation procedure as catalog behavior. |
| `WP06-AFRICA-PEPPER-SOUP-SPICE-R681-20261018-S02` | [Feco Foods — Pepper Soup Spices 200g](https://fecofoods.com.ng/product/pepper-soup-spice/), current product page. | Current Nigerian-market title uses the plural “Pepper Soup Spices” and describes a powder blend. The vendor’s ingredient descriptions are product-specific and do not define a standard formula. |
| `WP06-AFRICA-PEPPER-SOUP-SPICE-R681-20261018-S03` | [Poshy Foods — Pepper Soup Spice](https://poshyfoods.com/products/pepper-soup-spices/), current Canadian product page. | Ottawa retailer labels it a Nigerian spice blend and uses both “Pepper Soup Spice” and “Pepper Soup Spices.” The page was out of stock when reviewed, so it supports wording and product identity only, not availability. Its ingredient panel and FAQ also give different component lists; neither is promoted as a standard formula. |

Sources were accessed on 2026-10-18. The targeted OQLF search did not surface a product-specific Québec term for this seasoning; the French display is therefore descriptive and provisional.

The English display retains the source product name and makes its dry-blend form explicit. The proposed Québec French display, `mélange d’épices pour soupe nigériane épicée`, is a descriptive translation, not an OQLF preference or a locally attested retail label. It avoids `soupe au poivre`, which could suggest a black-pepper soup. No French alias is warranted by the reviewed sources.

Limit the identity to dry seasoning blends explicitly sold or described for Nigerian pepper soup. Do not imply one fixed ingredient list or extend it to the prepared soup, bouillon cubes, wet soup bases, individual spices, Itsekiri-only seasoning as a universal synonym, suya seasoning, or yaji. The paper’s Itsekiri formula is evidence of regional specificity, not a recipe for this catalog identity.

## Ownership, archive, and picker audit

The pre-integration package snapshot contained 1,837 ingredient references and 169 forms. Proposed ID `ingredient-ref-nigerian-pepper-soup-spice` was absent from active references, forms, legacy identities, and ledger record IDs. Exact active reference/form queries found no owner for `Nigerian pepper soup spice`, `pepper soup spices`, `pepper soup`, `Itsekiri pepper soup seasoning`, or the proposed French display. Existing `ingredient-ref-uziza-leaves`, `ingredient-ref-grains-of-selim`, and `ingredient-ref-calabash-nutmeg` remain individual component identities; none is an owner for the blend. `candidate-nigerian-yaji` remains ledger-only and distinct. The proposal path and source-ID prefix `WP06-AFRICA-PEPPER-SOUP-SPICE-R681-20261018-S` were free before drafting. The three exact source URLs above have no existing ledger owners; their S01–S03 IDs are proposal-local and are not added to the ledger.

Projection follows [`IngredientReferenceSearchIndex`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases win before substring fallback. The proposed terms are the two displays plus the single English alias.

| Query | Current results | With proposal |
|---|---:|---:|
| `Nigerian pepper soup spice blend`; `pepper soup spices`; `pepper soup` | 0 | 1 proposed row |
| `mélange d’épices pour soupe nigériane épicée` | 0 | 1 proposed row |
| `pepper`; `spice`; `épices` | 40; 5; 11 | 41; 6; 12 |
| `soup`; `soupe` | 0; 0 | 1; 1 |
| `uziza` | `ingredient-ref-uziza-leaves` | Unchanged; no alias added |
| `yaji`; `suya spice`; `poivre` | 0; 0; 11 | Unchanged |

## Full recipe-demand audit

All **114 manifest-listed recipe files and 1,123 structured ingredient rows** were scanned as UTF-8 text and as ingredient-row fields. Whole-phrase checks covered the proposed English and French displays, `pepper soup spices`, `pepper soup seasoning`, `Itsekiri pepper soup seasoning`, pepper-soup mix wording, the held yaji/suya boundary, and component names including ehuru, uziza, uda, grains of Selim, and calabash/African nutmeg. The audit found **zero matching recipe files and zero matching ingredient rows**. There is no bundled demand, quantity, or supported recipe link for this candidate.

## Proposed identity boundary

| Field | Recommendation |
|---|---|
| Reference ID | `ingredient-ref-nigerian-pepper-soup-spice` |
| English display | `Nigerian pepper soup spice blend` |
| Québec French display | `mélange d’épices pour soupe nigériane épicée` (descriptive, provisional) |
| English alias | `pepper soup spices` |
| French aliases | None |
| Category | `BAKING_AND_SPICE` |
| Forms and numeric data | None; null density and empty unit mappings |
| Recipes and substitutions | No relinks, yields, or substitution rules/findings |

Recheck name, ID, source URL, and picker ownership before any later integration. No plan, workflow, roadmap, catalog, ledger, manifest, generated file, or recipe changes are proposed here.

## Integration owner review — French naming gate

The active-reference recommendation is held pending a product-matched Québec French display. The reviewed candidate phrase `mélange d’épices pour soupe nigériane épicée` is descriptive, but none of the proposal's three product/study sources uses it as a French product name. The project plan prohibits invented translations, so the identity is not activated with that label.

Additional French-language evidence helps bound a future naming review:

- **Proposal-local S04 — Koki Afrique, [Soupe au poivre — Nigeria](https://www.kokiafrique.com/dishes/pepper-soup/):** a French-language recipe labels the dish `Soupe au poivre` and uses the ingredient wording `mélange d'épices soupe au poivre`. This is not a Québec source and the compound phrasing is not adopted as the catalog display.
- **Proposal-local S05 — Montréal restaurant menu presentation, [La Cuisine Nigerianne](https://prezi.com/p/waqyyjoqukvg/la-cuisine-nigerianne/):** a 2020 presentation lists `Soupe au Poivre` among the specialties of a Nigerian restaurant at a Montréal address. It supports local dish naming only, not a dry spice-blend label.
- **Proposal-local S06 — AfroSmartShop, [Soupe Africaine au Poivre (Poulet)](https://www.afrosmartshop.com/fr/recettes/soupe-africaine-au-poivre-poulet/):** a French-language recipe says this soup is served across West Africa, particularly Nigeria and Cameroon. Its recipe-specific seasoning list does not define or name a packaged blend.

Keep the dry-blend identity and proposed aliases outside active and ledger data until an exact Québec French display is supported or independently reviewed. No recipe, measure, form, source record, density, mapping, conversion, yield, or substitution is activated by this review.
