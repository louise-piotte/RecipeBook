# WP03 Section F R237 — Quaker Super Grains hot cereal identity review (2026-10-16)

**Status:** Proposal only. No shared catalog JSON, research ledger, generated index, plan, roadmap,
recipe, or batch README was changed.

**Recommendation:** Add one identity-only Canadian `GRAIN_AND_CEREAL` reference for the manufacturer-
named Quaker product:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-quaker-super-grains-hot-cereal` (unallocated) |
| English display | `Quaker Super Grains Hot Cereal` |
| Québec French display | `Gruau Quaker Super Grains` |
| English aliases | `[]` |
| French aliases | `[]` |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |

The current Section F checklist still leaves regional cereal mixes and preprocessed grains open
([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L3714)). This review covers
one current Canadian packaged blend only; it does not create a generic “super grains” ingredient or
reopen the integrated Red River, Bob's Red Mill, Rogers, or other hot-cereal products.

## Product boundary and naming

Quaker Canada’s English page names **Quaker Super Grains Hot Cereal** and describes the Original
hot cereal as a blend of whole-grain oats, flaxseed, and quinoa. Its ingredient declaration is
`Whole grain rolled oats, whole flaxseed, quinoa` [S01]. The corresponding official Canadian French
page is titled **Gruau Quaker® Super Grains**; its introduction calls it the Original product, says
it uses Canadian whole-grain oats, and gives the French ingredient declaration `Flocons d'avoine à
grains entiers, graines de lin entières, quinoa` [S02]. Use the manufacturer’s page title for each
display, omitting the trademark glyph. The French wording is Canadian manufacturer naming evidence,
not an OQLF ruling.

This is a branded, dry, ready-to-prepare hot-cereal blend. It is not a synonym or replacement identity
for rolled oats, flaxseed, quinoa, the generic `hot cereal` concept, or another grain blend. The
manufacturer gives no component proportions. Keep all three ingredient references unchanged and do
not add component names as aliases. Do not infer that every product marketed as “super grains” has
this formula.

The active catalog already contains, among others, Bob's Red Mill 10 Grain Hot Cereal,
Bob's Red Mill Gluten Free 8 Grain Hot Cereal, Red River Original and 7 Grain hot cereals, Rogers
ancient-grain porridge oats, Mighty Tasty, Sunny Boy, and Biowig millet cream. Those remain separate
product identities. Quaker Super Grains has a source-defined oats/flax/quinoa composition and an
official Canadian bilingual title; no active product has that exact identity.

## Current package, exact-key, and archive audit

Read-only snapshot at review time: **1,628 active references, 122 forms, 61 legacy-import candidates,
1,973 research-ledger records, and 114 manifest-listed recipes / 1,123 structured ingredient rows**.
Exact normalized-key review used the repository's case-, accent-, ligature-, and punctuation-folding
search normalizer across active reference displays and aliases, form labels and match terms, and
legacy-import displays and aliases.

| Surface | Finding |
|---|---|
| Active references | No exact owner for `Quaker Super Grains Hot Cereal`, `Quaker Super Grains`, `Quaker Super Grains Original Hot Cereal`, or `Gruau Quaker Super Grains`. Existing oat, flax, quinoa, and hot-cereal references remain distinct. |
| Forms | No exact product title or product form is assigned among the 122 active forms; the proposed reference would have no form. |
| Legacy import | No exact product candidate among the 61 legacy candidates. |
| Research ledger | No Quaker Super Grains product record, exact product-title mention, product-page URL, or Walmart item number `6000197182771` was found among the 1,973 records. Broader generic oat, flax, quinoa, and cereal evidence is not this product's identity record. |
| Proposal and batch archive | No focused Quaker Super Grains identity review or prior disposition was found. The source-ID prefix below and proposed reference ID are unallocated. R232 Special K, R173 Bob's Red Mill 8 Grain, the existing Bob's Red Mill 10 Grain row, and other cereal reviews concern different products. |

The product is not listed as a stand-alone ingredient in the bundled recipe corpus. A scan of every
manifest-listed recipe file and ingredient row for `Quaker Super Grains`, `Super Grains Hot Cereal`,
`Super Grains Original`, `Gruau Quaker Super Grains`, and item number `6000197182771` found **zero
recipe-file hits, zero ingredient-row hits, and zero recipe links**. This is regional/product
coverage, not a request to relink a bundled recipe.

## Picker projection

The projection applies [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which folds punctuation and accents and prefers complete word-phrase matches before its partial-match fallback. This is a static projection, not live picker QA.

| Query | Current matching references | With only the proposed bilingual displays |
|---|---:|---:|
| `Quaker Super Grains Hot Cereal` | 0 | 1 proposed reference |
| `Quaker Super Grains` / `super grains` | 0 / 0 | 1 / 1 proposed reference |
| `Gruau Quaker Super Grains` | 0 | 1 proposed reference |
| `gruau` | 6 | 7, including the proposed reference |
| `hot cereal` | 10 | 11, including the proposed reference |
| `céréales chaudes` | 7 | 7; the official French title uses `gruau` |
| `oats` / `avoine` | 9 / 15 | unchanged at 9 / 15 |
| `flaxseed` / `graines de lin` | no Quaker product result | unchanged; no component alias is proposed |
| `quinoa` | existing quinoa references | unchanged; no component alias is proposed |

The broader `gruau` and `hot cereal` results will gain one visibly product-qualified row. Keep aliases
empty: the bilingual product titles already support exact product searches, while adding ingredient
components or `Original` as aliases would broaden an identity for a particular blend. The official
French title is `Gruau Quaker® Super Grains`; the body’s “Original” wording is not part of that title.

## Measurements, forms, preparation, and substitutions

- The English and French manufacturer pages both report the nutrition serving **1/3 cup (30 g)**
  [S01–S02]. If integrated, retain it only as a product-specific serving observation in the ledger.
  It is not a reusable measure, default density, unit mapping, or basis for inferring the blend’s
  volume-to-mass behavior.
- Canadian retailer pages list package sizes of **511 g** (Walmart Québec, currently marked out of
  stock at the selected location) and **512 g** (recent Loblaws-family listings that show the item
  for sale/add-to-cart) [S03–S04]. Treat these as listing/SKU observations; the discrepancy does not
  support a canonical net mass or transferable recipe quantity. The brand page's purchase button
  and recent retailer listings support a current product listing, not nationwide stock guarantees.
- The product is sold as dry hot cereal. No reference form, cooked yield, process conversion,
  package yield, or recipe link is supported. The manufacturer's general statements that it can be
  prepared in minutes or used in baking do not establish a standardized preparation method or
  cooking yield.
- The ingredient statement establishes oats, flax, and quinoa as components but gives no proportions
  or tested replacement guidance. Do not infer substitutions to any component, cereal blend, oat
  product, or grain. Add no global or contextual substitution rule.
- Keep `defaultDensity: null`, `unitMappings: []`, forms empty, and active reusable measurements,
  conversions, yields, recipe links, and substitutions empty.

## Proposal-local source register

The IDs below are proposal-local and unallocated. Sources were checked online on 2026-10-16.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-QUAKER-SUPERGRAINS-R237-20261016-S01` | Quaker Canada / PepsiCo Canada, [Quaker Super Grains Hot Cereal](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-super-grains-hot-cereal). | Official Canadian English product page. Names the Original hot cereal, states the blend is whole-grain oats, flaxseed, and quinoa, gives the ingredient declaration and 1/3 cup (30 g) nutrition serving, and has a purchase link. The serving is product-specific; page access does not guarantee retail stock or establish a reusable volume conversion. |
| `WP03-QUAKER-SUPERGRAINS-R237-20261016-S02` | Quaker Canada / PepsiCo Canada, [Gruau Quaker® Super Grains](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/gruau-quakerr-super-grains). | Official Canadian French product page. Supports the French page title, Original-product context, Canadian whole-grain oats, French ingredient declaration, and the same 1/3 cup (30 g) serving. Product-title wording is manufacturer usage, not an OQLF ruling. |
| `WP03-QUAKER-SUPERGRAINS-R237-20261016-S03` | Real Canadian Superstore, [Oatmeal & Hot Cereals](https://www.realcanadiansuperstore.ca/en/food/pantry/cereal-breakfast/oatmeal-hot-cereals/c/29895), current indexed listing. | The retailer page/search result lists Quaker Super Grains Hot Cereal 512 g with an add-to-cart control. Store-specific availability and the displayed package size are not a reusable recipe measure. |
| `WP03-QUAKER-SUPERGRAINS-R237-20261016-S04` | Walmart Canada (French), [Quaker Gruau Super grains](https://www.walmart.ca/fr/ip/Quaker-Gruau-Super-grains/6000197182771). | Québec-facing product listing uses `Quaker Gruau Super grains`, gives the three-ingredient declaration, and shows 511 g. It was marked out of stock at the selected location when checked; it does not establish national availability or settle the 511/512 g package discrepancy. |

## Disposition

Recommend one identity-only reference with the official Canadian English and French product titles,
no aliases, no forms, null density, and empty unit mappings. Preserve the manufacturer's 1/3 cup
(30 g) label only as a product-specific ledger observation if root accepts the proposal. Preserve
both retailer package observations as source-scoped evidence and do not infer a common package size,
active conversion, preparation yield, or substitution. The broader Section F regional cereal-mix and
preprocessed-grain checklist remains open.

Root owns any shared catalog/ledger integration and checklist update. This proposal changes no shared
catalog data or checklist.
