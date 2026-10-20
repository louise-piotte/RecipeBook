# WP05 Section Z giardiniera identity review

- **Date:** 2026-10-12.
- **Status:** integrated on 2026-10-12 as an identity-only reference and bounded ledger evidence; no recipe or runtime logic changed, and the generated catalog index was refreshed.
- **Plan item:** Section Z, “Sauerkraut, pickled cucumbers, capers/caperberries, olives, pickled onions, chutneys, relishes, piccalilli, giardiniera, and mustard-fruit preparations.” The preserved-condiment demand review explicitly left giardiniera outside its scope.
- **Integrated identity:** `ingredient-ref-giardiniera` is `giardiniera / giardiniera` in `SAUCE_AND_CONDIMENT`, with no aliases, forms, measurements, recipes, or active substitutions.

## Product identity and boundary

Québec culinary sources use *giardiniera* as the name of an Italian pickled-vegetable condiment. Stefano Faita’s French recipe page titles it *Giardiniera maison (Jardinière de légumes marinés)* and describes using it like relish or homemade Québec ketchup. *Je Cuisine* calls the product *légumes marinés style giardiniera* and describes vinegar- and oil-marinated variants. A current Metro listing uses the French title *Mélange de légumes dans l’huile épicés Giardiniera*; the product page returned 403 when opened, so the search-index result supports only that title and package size. Canadian producer Anducci labels a product *Mild Giardiniera / Légumes marinés* and lists a single mixed vegetable, oil, and vinegar formulation. Sanpellegrino’s French-language Canadian page distinguishes Italian vinegar-based giardiniera from a Chicago-style version with oil and peppers. These sources support one named family with regional and recipe variation, not one required ingredient list or preservation method.

| Field | Recommendation | Evidence and limit |
|---|---|---|
| ID | `ingredient-ref-giardiniera` | Absent from active references, forms, legacy candidates, and ledger IDs. |
| English display | `giardiniera` | Exact English product name on the Canadian Anducci product page. |
| Québec French display | `giardiniera` | Used as the named preparation in Québec culinary sources and a French Canadian grocery title. No OQLF preferred-term entry was found in the targeted search. |
| Aliases | None | Do not add generic `pickled vegetables`, `légumes marinés`, `jardinière`, `relish`, or `antipasto`; these phrases cover broader products or preparations. |
| Category | `SAUCE_AND_CONDIMENT` | The Québec culinary source explicitly presents giardiniera as a condiment; it can also be served as antipasto. |
| Product boundary | A named Italian mixed-pickled-vegetable condiment family | Sources document vinegar-based Italian styles and oil-containing Chicago styles. Keep generic pickled vegetables, antipasto, relish, chutney, piccalilli, and vegetable jardinière preparations separate. |
| Numeric and recipe behavior | None | Package sizes and recipe batch yields are source-specific; no transferable measure, density, yield, conversion, or recipe link is supported. |

## Exact ownership and recipe demand

The audit used the live phrase-first search normalization across reference names and aliases plus form labels and match terms. Before integration, `giardiniera`, `giardiniere`, `jardinière`, `jardiniere`, `légumes marinés`, `pickled vegetables`, `mixed vegetables`, `relish`, and `antipasto` have no active reference/form owner. No legacy candidate owns `giardiniera` or the proposed ID. With the proposed bilingual display, exact `giardiniera` resolves only to the new row. Leave generic French and English mixed-pickle queries unmatched.

I scanned all 114 manifest-listed recipe files (1,123 ingredient rows) for `giardiniera`, `giardiniere`, `jardinière`, `jardiniere`, `pickled vegetables`, and `légumes marinés`. There are zero recipe-file or ingredient-row matches. No recipe links are proposed.

The local Stefano Faita page says giardiniera is used “like relish or homemade Québec ketchup.” That is a role analogy, not a recipe replacement with a quantity, scope, or tested result. Record a blocked finding for possible giardiniera-to-relish/ketchup use if the identity is integrated; add no rule. No density or household measure is proposed. Recipe-specific jars and servings in the sources do not establish product mass, a standard yield, or volume-to-mass conversion.

## Live snapshot before integration

Read-only snapshot on 2026-10-12: 1,326 references; 98 forms; 64 legacy candidates; 1,634 ledger records; 114 manifest recipes and 1,123 ingredient rows. The recipe corpus hash is SHA-256 over manifest-ordered relative path, NUL, raw file bytes, NUL.

| Surface | SHA-256 |
|---|---|
| Ingredient references | `ab1e5c442eda5b096f9af62245e3b7f3e7add4810b71c85db8f3a659466e203e` |
| Seed manifest | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Research ledger | `f6af7ed7f4324ae69f9af62245e3b7f3e7add4810b71c85db8f3a659466e203e` |

## Source register

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP05-SECTION-Z-GIARDINIERA-20261012-S01` | Stefano Faita, [Giardiniera maison (Jardinière de légumes marinés)](https://www.stefanofaita.com/recettes/jardiniere-de-legumes-marines-giardiniera/), lines 16–24 and 29–78. | Québec French naming and condiment role; one refrigerated recipe with a particular vinegar brine and oil finish. Its jar count and ingredients are not a universal product specification. |
| `WP05-SECTION-Z-GIARDINIERA-20261012-S02` | *Je Cuisine*, [Légumes marinés style giardiniera](https://www.recettesjecuisine.com/fr/recettes/entrees-et-bouchees/legumes-marines-style-giardiniera/), lines 99–138. | Québec French uses the source-specific title and describes vinegar and oil styles, antipasto use, and condiment use. Its 2 × 1 L recipe yield and formula are not transferable measurements or a preservation standard. |
| `WP05-SECTION-Z-GIARDINIERA-20261012-S03` | Metro, [Mélange de légumes dans l’huile épicés Giardiniera, 225 mL](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/melange-de-legumes-dans-l-huile-epices/p/061659000308), search result checked 2026-10-12. | Current French Canadian grocery title uses the named product family. Direct page access returned 403; the indexed title/package result does not establish current inventory or full composition. |
| `WP05-SECTION-Z-GIARDINIERA-20261012-S04` | Anducci’s Food Company, [Mild Giardiniera](https://www.anduccis.com/product/mild-giardiniera/), product label and description. | Canadian producer page identifies *Mild Giardiniera*, labels it in French as *Légumes marinés*, and lists one formula containing mixed vegetables, oil, and vinegar. It is one SKU and its French generic descriptor is not promoted to a global alias. |
| `WP05-SECTION-Z-GIARDINIERA-20261012-S05` | Sanpellegrino Canada, [Recette de l’authentique Giardiniera](https://www.sanpellegrino.com/ca/fr-ca/boissons-petillantes/recettes-italiennes/giardiniera), lines 57–60 and 102–126. | French-language Canadian page describes Italian vinegar-based giardiniera and the Chicago-style oil-containing variant. This is a culinary overview, not an official terminology ruling or product standard. |

**Disposition:** integrated one bounded `giardiniera` identity in both locales, with no aliases and no active numeric or recipe behavior. Section Z remains open.


## Integration record

Added `ingredient-ref-giardiniera` with the same source-supported name in English and French, empty alias arrays, null density, and empty unit mappings. The ledger contains the five reviewed sources, `researched_no_supported_value` measurement state, and a blocked relish/ketchup role-analogy finding with no replacements. No forms, observations, recipe links, or active substitutions were added. Package validation, generated-index freshness, reference normalization, ledger schema, search ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No app tests were run because this change only adds database JSON data. See `docs/catalog/batches/wp05-section-z-giardiniera-identity-integration-20261012/README.md`.
