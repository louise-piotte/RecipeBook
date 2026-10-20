# WP02 A7: Light Caramelized Barley Malt Flour Review

- **Reviewed:** 2026-10-14
- **Status:** Integrated in the R110 catalog batch. The reference, research ledger, generated index, plan, roadmap, and batch README now record the accepted identity.
- **Scope:** Castle Ingredients' source-named `light caramelized barley malt flour`, and its boundary with the active roasted-barley-malt, malted-barley, roasted-barley, and generic malt-flour identities. This is a new candidate; it does not reopen the accepted R57 roasted-barley-malt identity or R58 toasted-wheat-malt boundary.
- **Source IDs:** `WP02-A7-LIGHT-CARAMELIZED-BARLEY-MALT-FLOUR-20261014-S01` through `S03`; the same IDs are recorded on the accepted research-ledger entry.

## Recommendation

Accept one identity-only `FLOUR_AND_STARCH` reference for the named flour product:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-light-caramelized-barley-malt-flour` |
| English display | `light caramelized barley malt flour` |
| Québec French display | `farine de malt d'orge légèrement caramélisée` |
| English and French aliases | None |
| Density and unit mappings | Null density; no mappings |
| Forms, conversions, yields, recipe links, substitutions | None |

Castle Ingredients' current English and French bakery-flour listings name the same CaraBelga 30 product `Light caramelized barley malt flour, non-diastatic` and `Farine de malt d'orge légèrement caramélisée, non diastatique` [S01–S02]. Use the manufacturer-attested bilingual name above. The French wording comes from a Belgian French product listing, not an OQLF ruling or Québec retail declaration, so keep the display provisional for independent Québec review.

Keep this source-named product separate from `ingredient-ref-roasted-barley-malt-flour`. Castle's same catalog lists the roasted-barley-malt products separately from CaraBelga 30 [S01–S02], while IREKS North America's current Canadian product page names its adjacent product `Light-coloured roasted barley malt flour` and describes a caramel flavor note [S03]. A flavor note does not establish a caramelized product or process. This supports separate source-named identities; it does **not** establish a universal chemical or processing boundary between caramelized and roasted malt products. Do not add either term as an alias of the other.

Treat `non-diastatic` as a specification of the named CaraBelga 30 product, not as a separate identity, form, or reusable property of all caramelized barley malt flour. The reviewed listings do not establish a wider universal class, a processing sequence, or equivalence to roasted products.

## Current ownership and archive check

The A7 parent checklist remains open for other grain meals and malted/toasted flour identities in `docs/RecipeBook-global-ingredient-catalog-plan.txt` (Section 04, A7). The neighboring R57 proposal accepted roasted barley malt flour; it did not review the caramelized product. The R58 proposal addressed toasted wheat malt flour, not this barley product.

At this review snapshot the seed has 1,449 ingredient references and 105 forms; the legacy-import file has 63 candidates; the ledger has 1,789 records and 7,301 source entries; the manifest lists 114 recipes. Exact and normalized searches of the active references, forms, legacy candidates, ledger, and proposal/batch archive found no owner or prior disposition for `light caramelized barley malt flour`, `caramelized barley malt flour`, `farine de malt d'orge légèrement caramélisée`, or the proposed ID. R57's roasted-barley-malt reference is the nearest neighbor, not an exact owner.

| Existing owner | Current identity | Boundary for this proposal |
| --- | --- | --- |
| `ingredient-ref-roasted-barley-malt-flour` | `roasted barley malt flour / farine de malt d'orge, pâle et grillée`; no aliases; `FLOUR_AND_STARCH` | Retain. Its manufacturer sources name a roasted product. Do not add caramelized wording as an alias. |
| `ingredient-ref-malted-barley-flour` | `malted barley flour / farine d'orge maltée`; EN alias `malt barley flour` | Retain as the ordinary malted-barley-flour identity. Do not broaden it to caramelized wording. |
| `ingredient-ref-roasted-barley-flour` | `roasted barley flour / farine d'orge torréfiée`; EN alias `toasted barley flour` | Retain as flour made from roasted barley; it is not the malted product. |
| `ingredient-ref-malt-flour` | `malt flour / farine maltée`; EN alias `malted cereal flour` | Retain as the generic malt-flour identity. Do not attach a barley-specific product as its alias. |
| Forms | No form currently belongs to the neighboring barley/malt-flour identities. | Do not model caramelization or non-diastatic status as a form. |

## Picker effect

The static projection uses the current normalized complete-phrase search and partial-match fallback in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`; it is not a live app-picker test.

| Query | Current results | With the proposed row |
| --- | --- | --- |
| `light caramelized barley malt flour`; `caramelized barley malt flour` | None | Proposed row only |
| `farine de malt d'orge légèrement caramélisée` | None | Proposed row only |
| `barley malt flour` | `ingredient-ref-roasted-barley-malt-flour` | That row plus the proposed row |
| `farine de malt d'orge` | `ingredient-ref-roasted-barley-malt-flour` | That row plus the proposed row |
| `malted barley flour` | `ingredient-ref-malted-barley-flour` | Unchanged; the exact ordinary-malt phrase stays on its current owner |
| `roasted barley malt flour` | `ingredient-ref-roasted-barley-malt-flour` | Unchanged; the roasted phrase stays on its current owner |
| `malt flour` | Five references, including generic, spelt, oat, wheat, and roasted-barley malt-flour rows | Six, including the proposed row |

The new row makes the exact caramelized product phrase selectable. Broad barley-malt searches gain one qualified choice; the result labels preserve the caramelized/roasted distinction. Add no short `barley malt flour`, `malt flour`, `roasted barley malt flour`, or French generic alias.

## Recipe demand, measures, and substitutions

I checked all 114 manifest-listed recipe files and their 1,123 ingredient rows for the proposed English and French names, spelling variants, and `CaraBelga 30`. There were no full-file or ingredient-row matches. No recipe link or relink is supported by the bundled corpus.

The reviewed Castle category listings give a product name and product-family descriptions, not a household serving, cup/spoon amount, density, unit mapping, or recipe-ready substitution. IREKS's 25 kg package and 1–5% flour-basis dosage apply only to its separate roasted product [S03] and must not be transferred. Leave density null and all measure, conversion, yield, and substitution data empty. No recipe or source supports replacing this caramelized product with roasted barley malt flour, ordinary malted barley flour, generic malt flour, or roasted barley flour.

## Source register

Sources were accessed on **2026-10-14**. The source IDs below are also used by the integrated research-ledger record.

| Source ID | Primary source | Supports and limits |
| --- | --- | --- |
| `WP02-A7-LIGHT-CARAMELIZED-BARLEY-MALT-FLOUR-20261014-S01` | Castle Ingredients, [Malt Flours](https://www.shop.castle-ingredients.com/shop/category/baking-flours-malt-15?order=name+asc), current English product-family page. | Names Castle CaraBelga 30 `Light caramelized barley malt flour, non-diastatic` and lists roasted barley-malt products separately. Supports the manufacturer's product wording and its own catalog distinction only; it does not give CaraBelga 30's composition, caramelization sequence, or a universal product definition. The linked item-detail page was not retrievable during this review, so no detail beyond the catalog listing is used. |
| `WP02-A7-LIGHT-CARAMELIZED-BARLEY-MALT-FLOUR-20261014-S02` | Castle Ingredients, [Farines de boulangerie](https://www.shop.castle-ingredients.com/fr/shop/category/farines-de-boulangerie-9), current French product-family page. | Names CaraBelga 30 `Farine de malt d'orge légèrement caramélisée, non diastatique` and lists roasted barley malt flour separately. Supports the manufacturer's French wording, not Québec usage or a terminology-authority ruling. |
| `WP02-A7-LIGHT-CARAMELIZED-BARLEY-MALT-FLOUR-20261014-S03` | IREKS North America, [IREKS AROMA BARLEY MALT K](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-barley-malt-k), current Canadian product page. | Names its separate item `Light-coloured roasted barley malt flour` and gives its own 25 kg package and 1–5% flour-basis dosage. Supports the active R57 neighboring product and demonstrates why its commercial quantities cannot be assigned to CaraBelga 30. It does not establish equivalence between the two manufacturers' products. |

## Integration limits

This integration records the exact manufacturer-named flour identity only. Keep the French display provisional pending independent Québec review. Do not generalize the brand's `non-diastatic` specification, EBC/color values from unrelated product-family entries, or any industrial package/dosage information into catalog behavior. The remaining A7 review and independent Québec, measurement, and substitution research remain open.
