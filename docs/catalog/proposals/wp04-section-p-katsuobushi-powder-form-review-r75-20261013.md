# WP04 Section P — powdered katsuobushi form review (R75)

- **Review and source-access date:** 2026-10-13.
- **Status:** Proposal only; no shared catalog, ledger, checklist, roadmap, batch, or application file was edited.
- **Recommendation:** Integrate one `powdered` form under the existing dried-bonito/katsuobushi reference. Do not create a separate fish identity.
- **Checklist scope:** The still-open line is [Fish powder, fish balls, and surimi; the other named seafood work below remains open](../../RecipeBook-global-ingredient-catalog-plan.txt#L4591). This review covers only powdered katsuobushi. It does not reopen R74 Northern shrimp, prior fish-powder/ball/surimi decisions, or other seafood taxa.
- **Source IDs:** `WP04-SECTIONP-KATSUO-POWDER-R75-S01` through `S09`, local to this proposal. The prefix was checked against the live ledger and proposal/batch archive before use.

## Decision and product boundary

Recommend one presentation form for powdered dried bonito (katsuobushi), attached to `ingredient-ref-dried-bonito`. Kyuemon, the katsuobushi maker, describes powder shaving as one of the ways katsuobushi is cut for cooking, dashi, and toppings [S01]. A current Canadian Kyuemon listing describes a 60 g product as powder made from bonito flakes, identifies its ingredient as bonito (katsuobushi), and gives no other ingredient [S02]. These sources support a powder form of the existing dried product, not a separate species identity.

The retailer markets the Kyuemon item for both seasoning and dashi use. Fukuya Foods also lists a finely milled katsuobushi powder product used to prepare broth [S03]. Use in broth does not make the dry powder a stock or broth. Keep it distinct from prepared dashi, Hondashi, broth concentrate, and multi-ingredient stock powders. Japanese food-labeling rules also distinguish powder from mixed powder within the dried-fish-shavings labeling provisions [S05]. This supports the product boundary; it is not a Canadian or Québec naming rule.

Do not assign a scientific species from the product pages. Fukuya describes its SKU as skipjack tuna, but does not give a Latin name; MAFF describes katsuobushi as processed bonito without supplying a species for this catalog entry [S03, S04]. Keep the current active `Atlantic bonito / bonite à dos rayé` (*Sarda sarda*) identity separate [S08].

The earlier katsuobushi review accepted one dried-bonito identity with qualified flake aliases and no measure or substitution. It did not allocate a powder form [prior review]. The new review is limited to a powder presentation supported by a maker’s description and current Canadian product listings; the earlier identity and alias decision remain unchanged.

## Québec French scope

The live reference uses `bonito séché (katsuobushi)` and already owns `flocons de bonite séchée`. OQLF’s GDT entry for `bonito` describes a very hard dried fish that is grated and also exists in flakes, but the entry records Fondation Est-Ouest de Toulouse (1985), not OQLF, as its author [S07]. OQLF separately normalizes `bonite à dos rayé` for *Sarda sarda* and cautions against confusing commercial fish names [S06]. Do not use bare `bonite`, `poudre de bonite`, or the species name `bonite à dos rayé` as a global synonym for this form.

A current Québec grocery inventory lists `Flocons de bonite (bonito)` and `Bouillon Dashi (bouillon de bonite séchée)` as separate products [S08]. A French Walmart Canada listing for Marukome tofu miso soup includes `Poudre de bonite séchée` in the ingredients of a multi-ingredient soup mix [S09]. That listing supports the existence of this ingredient wording in a Québec-facing product label, but it does not identify katsuobushi, give the powder a standalone product identity, or establish a pure powder SKU. Walmart says product details can come from suppliers or third parties and are not independently verified.

For the form’s French display, use **`bonito séché en poudre`** as a descriptive, provisional rendering built from the live reference name. Do not add a French match term. The source set supports a Québec French description and product boundary, but not a standardized French name for a standalone katsuobushi-powder SKU. In particular, do not convert the Walmart soup ingredient phrase into a synonym for all powdered bonito or use it to assign a species.

## Current ownership and archive audit

The current read-only snapshot has 1,398 active references, 103 forms, 63 legacy candidates, 1,734 research-ledger records, and 114 manifest-listed recipe files. The recipe files contain 1,123 ingredient rows. Live source paths are the [reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json).

| Current owner | Live names, aliases, and relevant data | Effect of this proposal |
|---|---|---|
| `ingredient-ref-dried-bonito` (`PROTEIN`) | EN `dried bonito (katsuobushi)`; FR `bonito séché (katsuobushi)`; EN aliases `katsuobushi`, `dried bonito flakes`, `bonito flakes`, `katsuobushi flakes`; FR alias `flocons de bonite séchée`. `defaultDensity` is null and `unitMappings` is empty. No attached form exists. | Attach one proposed powder form. Keep all existing names and aliases unchanged. |
| `ingredient-ref-atlantic-bonito` (`PROTEIN`) | EN `Atlantic bonito`; FR `bonite à dos rayé`; no aliases. OQLF identifies the species as *Sarda sarda* [S06]. | Remains a separate fish identity; no new bare `bonite` alias. |
| `ingredient-ref-bonga-dried-fish-powder` (`PROTEIN`) | EN `Bonga dried fish powder`; FR `poudre de poisson Bonga`; no aliases. It is the only result for the exact broad queries `fish powder` and `poudre de poisson`. | Remains the only owner of those broad phrases. Generic fish-powder work remains open. |
| `ingredient-ref-fish-balls` (`PROTEIN`) | EN `fish balls`; FR `boulettes de poisson`; singular aliases `fish ball` and `boulette de poisson`. | Unchanged. |
| `candidate-surimi-product-boundary` | Ledger state `needs_clarification`; no active generic surimi reference. | Unchanged; the proposed form adds no surimi term. |

No active form is attached to dried bonito. The proposed form ID `ingredient-form-dried-bonito-powder`, exact names `dried bonito powder` / `bonito séché en poudre`, and source-ID prefix were not found as allocated entries in the live catalog, ledger, or proposal/batch archive. The existing [katsuobushi review](wp04-katsuobushi-bonito-flakes-review-20261009.md) decided the base identity and flake wording, not a powder form. The [Bonga powder review](wp04-section-p-fish-powder-identity-boundary-review-20261011.md), [generic fish-powder hold](wp04-section-p-generic-fish-powder-product-scope-review-20261012.md), and [fish-ball/surimi reassessment](wp04-fish-balls-surimi-current-source-reassessment-20261011.md) remain in force. No older held or integrated species is reopened.

## Picker projection

The projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) algorithm: normalized full phrases take priority, followed by substring fallback; a form hint appears only when the whole query exactly equals a form label or match term. The hypothetical form uses the labels and English match terms in the integration delta below, with no French match terms.

| Query | Current result | With proposed form | Form hint / boundary |
|---|---|---|---|
| `katsuobushi` | `ingredient-ref-dried-bonito` | Same single reference | No powder hint; the existing exact owner remains unchanged. |
| `katsuobushi powder` | No result | `ingredient-ref-dried-bonito` | Powder form hint. |
| `bonito powder`, `dried bonito powder` | No result | `ingredient-ref-dried-bonito` | Powder form hint for the same identity. |
| `bonito séché en poudre` | No result | `ingredient-ref-dried-bonito` | The proposed descriptive FR display surfaces the form; it is not a standardized term. |
| `poudre de bonite séchée` | No result | No result | Deliberately not indexed: the Walmart source is a soup-mix ingredient label and does not identify katsuobushi [S09]. |
| `katsuobushi flakes`, `dried bonito flakes`, `bonito flakes` | `ingredient-ref-dried-bonito` | Same single reference | No powder hint; no proposed term contains `flakes` or `flocons`. |
| `bonito` | `ingredient-ref-atlantic-bonito` and `ingredient-ref-dried-bonito` | Same two references | Broad search remains ambiguous; no new bare alias is added. |
| `bonite à dos rayé` | `ingredient-ref-atlantic-bonito` | Same single reference | Species-specific Québec name remains separate. |
| `fish powder`, `poudre de poisson` | `ingredient-ref-bonga-dried-fish-powder` | Same single reference | No generic fish-powder match is added. |
| `fish balls` | `ingredient-ref-fish-balls` | Same single reference | Unchanged. |
| `surimi` | No result | No result | Held candidate remains unresolved. |
| Broad `powder`, `poudre` | 40, 36 references | 41, 37 references | Adds the dried-bonito reference through its proposed form label; no exact form hint for either broad query. |

The exact bare `katsuobushi` and flake queries keep the same owner, with no powder hint. The powder-specific English phrases reach that same reference and expose the form hint. Broad `powder`/`poudre` searches gain one result each, which is the material picker cost of the new form. The current matcher does not turn the new form into a separate ingredient identity.

## Bundled recipe demand

I scanned every manifest-listed recipe file and all 1,123 ingredient rows, including stored ingredient names, original text, linked IDs, and full recipe JSON, for `katsuobushi powder`, `powdered katsuobushi`, `bonito powder`, `dried bonito powder`, `katsuo powder`, `bonito séché en poudre`, `poudre de bonite séchée`, `poudre de bonito`, and Japanese bonito/katsuobushi powder wording. **No candidate phrase occurs in the bundled recipes.** Recipe 066 contains `Hondashi`, an adjacent prepared seasoning/stock product only; it is not demand for powdered katsuobushi. No recipe link or amount is proposed.

## Identity, form, measurements, conversion, yield, and substitution

- **Identity:** Keep one dried-bonito/katsuobushi ingredient identity. Powder is a named presentation of that product. Do not create a separate bonito species or generic fish-powder identity.
- **Form:** Add one `powdered` dry presentation. It records how the dried ingredient is sold or cut. It does not imply that every product titled “dashi powder” is pure bonito.
- **Measurements:** Kyuemon lists a 60 g retail package and nutrition per 100 g; these are SKU-specific package and nutrition facts, not a cooking amount, density, or volume measure [S02]. Fukuya lists a 100 g pack and instructs users to add an unspecified “desired amount” to 500–600 ml water and simmer for about 15 minutes; the page showed the product sold out [S03]. The water amount and time are product-specific directions with no powder mass, so they do not establish a recipe ratio or conversion. MAFF’s katsuobushi moisture ceiling of 26% or less is a product-process description, not a measure or yield [S04].
- **Conversion:** Add no mass-volume conversion, teaspoon/gram measure, density, unit mapping, or flake-to-powder conversion. Powder and flakes share the identity, but these sources give no cross-form culinary equivalence.
- **Yield:** Add no package yield or broth yield. The Fukuya direction omits the powder mass and is not transferable to another product [S03].
- **Substitution:** Add no substitution to dried-bonito flakes, Bonga powder, generic fish powder, anchovy powder, Atlantic bonito, fish stock, Hondashi, fish balls, or surimi. The sources document product form and use, not interchangeable amounts or outcomes.

## Exact proposed integration delta

If accepted, add one row to `ingredient-forms.v1.json` and one source-backed form record to `docs/catalog/research-ledger.v1.json`. Do not change the reference row, its aliases, recipe links, or other database files.

| Form field | Proposed value |
|---|---|
| `id` | `ingredient-form-dried-bonito-powder` |
| `ingredientRefId` | `ingredient-ref-dried-bonito` |
| `formCode` | `powdered` |
| `labelEn` | `dried bonito powder` |
| `labelFr` | `bonito séché en poudre` (descriptive/provisional) |
| `prepState` | `dry` |
| `matchTermsEn` | `bonito powder`; `katsuobushi powder` |
| `matchTermsFr` | Empty array |
| `densityGPerMl` | `null` |
| `notesEn` | Commercial powder presentation only; no measure or conversion is established. |
| `notesFr` | Présentation commerciale en poudre seulement; aucune mesure ni conversion n’est établie. |
| `updatedAt` | `2026-10-13T00:00:00Z` |

The ledger record should use `recordId: ingredient-form-dried-bonito-powder`, `recordType: ingredient_form`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Register only this proposal’s sources that support the form and its limits. Keep recipe-line links, unit mappings, form conversions, yields, and substitution rules absent. Leave the combined Section P checklist open.

## Source register

Sources were accessed on 2026-10-13. Retailer entries support only the named SKU and seller-provided product details. Source IDs are local to this proposal; no shared source records were created.

| ID | Source and locator | Evidence used | Evidence limit |
|---|---|---|---|
| **WP04-SECTIONP-KATSUO-POWDER-R75-S01** | Hayashi Kyuemon Shoten, [Katsuobushi](https://kyuemon.com/abroad/en/katsuobushi/), “Traditional Japanese food made from the gift of nature and craftsmanship.” | The manufacturer describes powder shaving among katsuobushi’s shaving methods for dashi-stock or topping use. Supports powder as a cut/presentation of katsuobushi. | General maker description, not a specific Canadian product label, Québec French name, measure, or conversion. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S02** | Japanese Taste Canada, [Kyuemon Katsuobushi Powder, 60 g](https://japanesetaste.ca/products/kyuemon-katsuobushi-powder-bonito-seasoning-dashi-powder-60g), description and details. | The Canadian listing describes powder made from Japanese bonito flakes, lists `Bonito (katsuobushi)` as the ingredient, gives a 60 g package, and recommends topping and dashi uses. | Retail listing for one SKU; not an independent audit of the label or a universal product specification. The package weight is not a portion or conversion. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S03** | Fukuya Foods, Richmond, [Kaneninishi Katsuo Powder (Bonito Soup Stock Powder)](https://fukuya.ca/products/kaneninishi-katsuo-powder-bonito-soup), description and instructions. | Seller describes a finely milled Japanese bonito/katsuobushi powder; lists a 100 g pack and a broth method using an unspecified desired powder amount, 500–600 ml water, and about 15 minutes of simmering. | Listing showed sold out. The method omits the powder amount and applies only to that SKU. The seller’s “skipjack tuna” wording includes no Latin species name. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S04** | Japan Ministry of Agriculture, Forestry and Fisheries, [Dried Bonito — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/dried_bonito.html), product overview and production method. | Classifies katsuobushi as processed seafood made from bonito and describes repeated roasting/drying; states a moisture content of 26% or less for the described product. | Supports product identity and process only; moisture is not a kitchen measure, density, or yield. No Latin species is named for this catalog row. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S05** | Japan Consumer Affairs Agency, current [Food Labeling Standards page](https://www.caa.go.jp/policies/policy/food_labeling/food_labeling_act/) and its [Annex 1–8](https://www.caa.go.jp/policies/policy/food_labeling/food_labeling_act/assets/food_labeling_cms201_260401_02.pdf), fish-shavings product-name rules, pp. 132–133; [2026-10-01 amendatory ordinance](https://www.caa.go.jp/policies/policy/food_labeling/food_labeling_act/assets/food_labeling_cms201_261001_05.pdf) also checked. | The current page lists the Annex 1–8 PDF as a latest standard. It distinguishes powder presentation from mixed fish-shavings powder within Japanese labeling rules. The 2026-10-01 amendment text contains no `削りぶし`, `粉末`, or `かつお` wording. | Japanese product-labeling rules, not Canadian/Québec naming or a recipe conversion. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S06** | OQLF GDT, [bonite à dos rayé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198927/bonite-a-dos-raye), terminology and translations. | OQLF prefers `bonite à dos rayé`, identifies *Sarda sarda*, and warns against seafood-name confusion. | Species terminology; not a dried-katsuobushi product name. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S07** | OQLF GDT, [bonito](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17566115/bonito), definition and note. | Describes `bonito` as a very hard dried fish that is grated and may be sold in flakes; informs the descriptive French rendering. | The entry credits Fondation Est-Ouest de Toulouse (1985), not OQLF. It does not define powdered katsuobushi or establish an official Québec term. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S08** | Chanhda, Québec, [Épicerie asiatique](https://www.chanhda.ca/epicerie.php), inventory list. | Lists bonito flakes and dashi broth as separate items, with French product wording. | A partial store inventory; no powder SKU or powder-form name is listed. |
| **WP04-SECTIONP-KATSUO-POWDER-R75-S09** | Walmart Canada, [Marukome instant tofu miso soup, French listing](https://www.walmart.ca/fr/ip/MARUKOME-SOUPE-MISO-INSTANTAN-E-TOFU/73ZAX6C6S3PE), ingredient list. | Lists `Poudre de bonite séchée` as one ingredient among several in a prepared soup mix; directly attests this phrase in a French Canadian retail listing. | The ingredient is not identified as katsuobushi or a standalone powder product. Walmart says product details may be supplied by manufacturers, suppliers, or third parties and are not independently verified. It does not support a species assignment or global alias. |

## Static review checks

- Rechecked the exact still-open checklist line, current `AGENTS.md`, active references/forms, legacy candidates, research ledger, relevant prior proposals, and WP04 batch archive.
- Verified the proposed form ID and names have no existing live owner, no dried-bonito form is active, and the new source-ID prefix is unused in the ledger/proposal/batch archive.
- Recounted the current catalog, ledger, manifest-listed recipes, and ingredient rows; scanned all 114 recipes / 1,123 rows for candidate powder phrases and the adjacent Hondashi boundary.
- Projected the stated picker queries against the current `IngredientSearch.kt` logic with the proposed labels and terms; no runtime UI or emulator was used.
- Checked the current Japanese standards page, its linked Annex 1–8, and the 2026-10-01 amendment; the amendment text has no `削りぶし`, `粉末`, or `かつお` wording.
- No tests or emulator were run for this proposal-only review. The project instructions also exempt changes limited to new database JSON data from testing.
- Verified this file as strict UTF-8 without BOM, with no mojibake or trailing whitespace and with a final newline; all 10 local Markdown links and the checklist line anchor resolve. No shared integration file is part of this proposal change.
