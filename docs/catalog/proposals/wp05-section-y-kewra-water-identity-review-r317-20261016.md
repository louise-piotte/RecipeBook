# WP05 Section Y R317 — Kewra Water Identity and Essence Boundary Review

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only; pending coordinator review. No shared catalog, ledger, plan, roadmap, generated index, recipe, or integration README was changed.
- **Open checklist:** [WP05 Section Y](../../RecipeBook-global-ingredient-catalog-plan.txt#L8013) includes “Rose syrup, kewra water, regional souring agents, sesame/nut sauces, and concentrated dairy/sweet preparations.” This packet covers kewra only; the checklist remains open.
- **Prior ownership:** The partially accepted [`wp05-south-central-asia-mena.md`](wp05-south-central-asia-mena.md) already owns the pending kewra candidate. It proposed `kewra water / eau de kewra` and left `kewda water` and `keora water` aliases pending review. The accepted [`wp05-pandan-product-boundary-review-20261009.md`](wp05-pandan-product-boundary-review-20261009.md) says kewra remains separate from pandan leaves, but did not re-review kewra evidence. I found no dedicated kewra proposal or integration batch. `/root` remains the sole merge owner.

## Recommendation

Add one identity-only culinary flower-water row, with exact spelling aliases supported by current Canadian product listings:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-kewra-water` |
| English name | `kewra water` |
| French display | `eau de kewra` |
| English aliases | `keora water`; `kewda water` |
| French aliases | none |
| Category | `BAKING_AND_SPICE` |
| Density / unit mappings | `null` / `[]` |
| Forms, package yields, measurements, conversions, substitutions | none |

`eau de kewra` is a Canadian French product-page wording, not an OQLF preferred-term claim. The Montréal-area distributor listing and the current GTA product title support the exact English aliases `kewda water` and `keora water`. Do not add the unqualified terms `kewda`, `keora`, `kewra extract`, `pandan`, `pandanus`, `pandanus flower water`, or `screwpine water`. Health Canada describes kewra water itself as a steam-distilled flower extract; that does not establish that every product called a `kewra extract` shares that water formulation.

Do not add `kewra essence` as an alias for the water. Canadian retailers list `SAC Kewra Essence` as a separate product. The checked evidence does not establish one generic formula for “kewra essence,” a French Québec display for it, or equivalence to the steam-distilled flower water. Hold any essence identity for an exact-product review.

Keep this flower-water identity distinct from:

- `ingredient-ref-pandan-leaves` and its powdered-leaf form. The existing leaf evidence is for *Pandanus amaryllifolius* leaves; Health Canada’s kewra-water definition names steam-distilled flowers of *Pandanus odoratissimus*. The live `pandan` picker already returns two rows, pandan leaves and McCormick Pandan Flavor.
- Rose water (`ingredient-ref-rose-water`) and orange blossom water (`ingredient-ref-orange-blossom-water`), which are separate active flower-water identities with their own source-backed names.
- Concentrated food essences, absolute oils, essential oils, perfumes, and skincare hydrosols. A shared flower or botanical name does not establish a culinary identity or ingredient equivalence.

## Source findings

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP05-SECTIONY-KEWRA-R317-20261016-S01` | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), kewra entry dated 2025-07-07. | Officially defines kewra water as an extract obtained from *Pandanus odoratissimus* flowers by steam distillation and gives a history-of-safe-use-as-food rationale. This supports the bounded food identity and plant part. It is not a product approval, formula standard, Québec name recommendation, or conversion source. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S02` | PRAN Foods, [Kewra Water](https://www.pranfoods.net/public/brand/product/199). | Manufacturer calls the product `Kewra Water`, says it is made with flower extracts distilled from *Pandanus*, and describes food flavouring use. It supports the product name and culinary boundary; it does not establish Canadian or Québec wording. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S03` | Nutrifresh Foods, [Beverages product index](https://nutrifreshfoods.ca/product-category/beverages/). | The indexed page lists `Specialty Kewda Water` and identifies the Montréal branch in Pointe-Claire, Québec. This is Québec-market English-name evidence only. Direct page opening returned a verification interstitial, so I could not verify the live product page, formula, or stock. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S04` | GroceryBee, [Dabur Keora (Kewra) Water 250 ml](https://grocerybee.ca/products/dabur-keora-water). | A GTA retailer presents `Keora` and `Kewra` together in one culinary product title. This directly supports the exact English alias `keora water`, not a botanical genus alias or an essence equivalence. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S05` | Swadesh Supermarket, [Kewda Water 500 ml](https://www.swadesh.ca/products/kewda-water-500-ml-bottle). | The retailer explicitly states that Kewda Water is also known as Kewra Water and describes flower-derived use in South Asian cooking. This supports `kewda water` as an English search alias. Its product description also mentions non-culinary cultural uses; that does not make every kewda-labelled product food-grade. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S06` | Spice Divine, [Eau de Kewra Key Brand 200 ml](https://spicedivine.ca/fr/products/key-brand-kewra-water-200ml). | The Canadian French-language product page uses both the title `Eau de Kewra` and the description `eau de kewra` for a culinary water. The retrieved listing showed `Épuisé`; this is wording evidence, not an availability claim or Québec terminology ruling. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S07` | Bombay Grocers, [Food Colour & Essence product listing](https://bombaygrocers.ca/collections/food-colour-amp-essence). | One retailer lists `Dabur - Kewra Water - 250ml` (SKU `8901207003936`) and separately lists `SAC KEWRA ESSENCE` (SKU `8964000379073`). The distinct listing names support keeping the essence product out of the water aliases; they disclose no common formula or equivalence. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S08` | Well.ca, [Ember Wellness 05 Facial Hydrosol Kewra Water](https://well.ca/products/ember-wellness-05-facial-hydrosol_279790.html). | The search-result page classifies this as facial skincare, labels the ingredient `Kewra Water 100% (Pandanus Odoratissimus)`, and says not to consume. Direct opening returned HTTP 403; I use the indexed text only as a boundary warning, not as current availability or food-product evidence. |
| `WP05-SECTIONY-KEWRA-R317-20261016-S09` | India Aroma Oils, [Kewra/Keora/Kewda Water](https://www.indiaaromaoils.com/product/kewra-keora-kewda-water/), cited as S16 in the broad proposal. | The title lists all three spellings, but the detailed product description identifies `Kewda ... absolute oil`, gives oil constituents, and places the product among aromatic/cosmetic uses. Because the page conflates water and absolute-oil language, it is not used to add aliases or food-water measurements. Its displayed specific gravity `0.932–0.934 @ 20°C` is excluded as an unvalidated, product-specific value for this water identity. |

I searched the OQLF GDT and TERMIUM for `kewra`, `kewda`, `keora`, and `eau de kewra`; no authoritative terminology entry surfaced in those searches. This does not establish that no entry exists. The proposed French display is therefore limited to the product wording above and is not labelled a Québec-preferred term.

## Live catalog, picker, and recipe audit

The live checkout at review time contained 1,673 active references, 127 forms, 2,020 ledger records, 59 legacy-import candidates, and 114 manifest-listed recipes with 1,123 structured ingredient rows. Relevant file hashes were:

| File | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `2109a3aeb97c0d8e1cc102e935836f567db3cfcf54f1a07b62e348bbf11710ee` |
| `ingredient-forms.v1.json` | `aa10345fa769bb94f7827d6b7eaa52be865d4e608deb726b23f035d6bfd50cb2` |
| `research-ledger.v1.json` | `ab3ea19f1dc526f02105be31580617a9c98adf79a2a3179e8a6aab9c429f8c13` |
| `legacy-import-identities.v1.json` | `9167695ce41884213efb2dedc05fd3f4f56590a15c3add833239a43bf1a47fe8` |
| Manifest-listed recipe digest | `6da951379f244128afc89f9f0e347df7713928ba78cb6256937a637583410c5d` |

The references, forms, ledger, legacy candidates, package-yield record, and substitution files contain no kewra/kewda/keora entry or candidate. The package has one unrelated package-yield record and zero global and contextual substitution rules.

I applied the phrase-first matching behavior in `IngredientSearch.kt` to the live references and forms:

- Current `kewra water`, `eau de kewra`, `keora water`, `kewda water`, `kewra essence`, and `screwpine` queries return no rows.
- `rose water` / `eau de rose` return only `ingredient-ref-rose-water`; `orange blossom water` / `eau de fleur d’oranger` return only `ingredient-ref-orange-blossom-water`.
- `pandan` returns both `ingredient-ref-pandan-leaves` and `ingredient-ref-mccormick-pandan-flavor`; `pandan leaves` and `feuilles de pandan` return the leaf row.
- With the proposed names and exact aliases, `kewra water`, `eau de kewra`, `keora water`, and `kewda water` would each select the new single identity. `kewra essence`, `pandan`, and `screwpine` would remain outside it.

I scanned all 114 manifest-listed recipe JSON files recursively. There are zero matches for kewra/kewda/keora, kewra essence, `Pandanus odoratissimus`, screwpine, rose water, or orange blossom water in the 1,123 ingredient rows and other recipe text. No recipe link or relink is proposed; this is a regional catalog-coverage decision, not a recipe-demand claim.

## Measurements and active data disposition

**No reusable numeric value is supported.** Sources provide package listings and qualitative use descriptions, but no general recipe portion, mass-for-volume value, density, unit mapping, preparation yield, conversion, or substitution for culinary kewra water. Package size is not a portion or conversion. The India Aroma Oils specific-gravity number is excluded for the page’s absolute-oil ambiguity noted above.

Proposed ledger disposition if accepted: add one `ingredient_reference` identity record for `ingredient-ref-kewra-water`, with source-backed EN aliases `keora water` and `kewda water`, French display `eau de kewra`, no FR aliases, no measurement observations, and no substitution findings. Keep `kewra essence` pending a separate exact-product and Québec French review. No JSON, plan, roadmap, generated file, recipe, or integration README change is proposed here.

No software tests, builds, emulator checks, or deployment were run; this deliverable is proposal-only.
