# WP03 Section I — macadamia-butter formulation and picker review (R379)

- **Review date:** 2026-10-16
- **Status:** integrated on 2026-10-16; one English alias and product-specific ledger evidence were added
- **Scope:** the open Section I formulation-evidence subcheck for the existing `macadamia butter / beurre de macadamia` identity; one exact English alias is considered, with a French picker boundary check

## Recommendation

Keep `ingredient-ref-macadamia-butter` as the single macadamia-butter identity. Add only the English alias `macadamia nut butter`, which is an exact product-name phrase on a current manufacturer page and currently has no picker result. Keep the existing French display `beurre de macadamia` and its empty French alias list unchanged. Although current Québec product pages also use `beurre de noix de macadamia`, adding that phrase would make the narrower query `noix de macadamia` return both whole macadamia nuts and their butter; retain that phrase as source wording rather than a global alias.

Record the new product claims under the existing ledger record. Nuts to You’s already registered product page documents a dry-roasted-macadamia-only SKU. House of Macadamias’ current product page lists macadamias, a sunflower stabilizer, and sea salt; it also says the product has no added sugar and no seed oils and may separate, with a stirring instruction. A Québec seller page independently identifies that product in French, while a Québec product page for a separate SKU names dry-roasted macadamias as its only ingredient. These are product-specific labels. They show variation in salt and stabilizer use, but do not establish one general formula, demonstrate a recipe outcome, or justify a `salted`, `stabilized`, `smooth`, or `roasted` form.

Add no forms, density, unit mappings, measurements, recipe links, conversions, yields, or substitutions. Keep measurement and substitution research states unchanged. The manifest-listed recipe scan found no macadamia demand.

## Plan fit and prior coverage

The Section I plan keeps the broader item **“Record added sugar, salt, oil, and stabilizers when they materially affect culinary behavior”** open after the focused almond review in [R367](wp03-section-i-next-gap-review-r367-20261016.md), sunflower-butter review in [R370](wp03-section-i-next-gap-review-r370-20261016.md), and cashew-butter review in [R376](wp03-section-i-next-gap-review-r376-20261016.md). This proposal applies that unfinished subcheck to a different existing butter identity. It does not repeat any of those reviews or close the broader formulation item.

The original [nut and seed product review](wp03-nut-seed-paste-product-gap-review-20261010.md) established the macadamia-butter identity and recorded a single Canadian Nuts to You product. Its source IDs `WP03-PASTE-PRODUCT-20261010-S04`, `-S07`, and `-S13` remain on the ledger and must be reused, not re-added. The present gap is a comparison with current product and Québec naming evidence, plus the English query boundary.

## Pre-integration owner and state

The active reference is `ingredient-ref-macadamia-butter`, category `FAT_AND_OIL`, English display `macadamia butter`, French display `beurre de macadamia`, no aliases, `defaultDensity: null`, and empty `unitMappings`. No form is attached. Its ledger identity state is `verified`; measurement and substitution research remain `not_yet_researched`. The record has three existing sources and one accepted identity decision.

The neighboring whole-kernel owner is `ingredient-ref-macadamia-nuts`, displayed as `macadamia nuts / noix de macadamia`, with no aliases. No legacy candidate or form owns the proposed English alias or any macadamia-butter state. Keep whole kernels, butter, and macadamia oil separate.

## Formulation evidence and limits

New sources S01-S03 were added to the existing macadamia-butter ledger record. The already registered Nuts to You sources remain reused and were not assigned another ID.

| Source ID | Source | Supports | Evidence limit |
|---|---|---|---|
| **WP03-I-MACADAMIA-BUTTER-FORMULATION-R379-20261016-S01** | House of Macadamias, [Macadamia Nut Butter Sea Salt Flavor](https://www.houseofmacadamias.com/collections/all-products/products/macadamia-nut-butter-sea-salt-flavor) | The manufacturer page names the SKU and lists “Macadamia Nuts, Stabilizer (Sunflower), Sea Salt.” It says no added sugars or seed oils and directs users to stir if slight oil separation occurs. | The page showed the jar as sold out when reviewed. The declaration supports this named product only; it does not establish the composition or handling of every macadamia butter. “No seed oils” is not evidence that the product has no sunflower-derived ingredient: the ingredient list separately names a sunflower stabilizer. |
| **WP03-I-MACADAMIA-BUTTER-FORMULATION-R379-20261016-S02** | Keys Nutrition, [Beurre de noix de macadamia, sel de mer, 250 g](https://keysnutrition.com/en/products/house-of-macadamias-beurre-de-noix-de-macadamia-sel-de-mer-250g-keys-nutrition) | A current Québec retailer listing uses the French product wording for the House of Macadamias sea-salt SKU. Its indexed description mentions macadamias and sea salt. | Direct page retrieval returned a cache miss on review; the search-indexed listing is used only for the title and local retail evidence. It does not provide a complete ingredient label, establish an OQLF-preferred term, or override the manufacturer’s sunflower-stabilizer declaration. |
| **WP03-I-MACADAMIA-BUTTER-FORMULATION-R379-20261016-S03** | La Natura Casa, [Beurre de noix de macadamia biologique](https://lanaturacasa.com/products/beurre-de-noix-de-macadamia-biologique) | The Québec seller’s indexed product page names a 400 g French-language macadamia butter and lists organic dry-roasted macadamias as its only ingredient. | Direct page retrieval returned a cache miss. The indexed page contains conflicting availability text (“1 en stock” and a sold-out notice); no availability claim is used. Its one-ingredient declaration and French title are product-page claims, not a universal formula or terminology ruling. |

The existing ledger source `WP03-PASTE-PRODUCT-20261010-S07` ([Nuts to You Macadamia Butter Smooth](https://nutstoyou.ca/products/macadamia-butter-smooth/)) already records that its current Canadian SKU lists dry-roasted macadamia nuts only and says no salt, sugar, or hydrogenated oil is added. Reuse this source and its registered URL. Existing source `WP03-PASTE-PRODUCT-20261010-S04` ([Nuts to You French product catalogue](https://nutstoyou.ca/fr/nos-beurres/)) already supports `beurre de macadamia` as Canadian/French market wording. The CIPO goods-list source `WP03-PASTE-PRODUCT-20261010-S13` also remains reused, with its prior limitation: goods-description evidence is not a consumer-label standard.

The complete product claims support recording source-specific salt and sunflower-stabilizer presence for the House of Macadamias SKU, and retaining the product-specific macadamias-only formulation evidence already held for Nuts to You. They do not establish a general need for stabilizers, a universal no-added-oil rule, a fixed salt state, or tested recipe effects. Do not infer that all macadamia butter is roasted, unsalted, sweetened, smooth, or stabilized. No reusable amount, measure, density, unit mapping, conversion, yield, or substitution follows from the product pages.

## Bilingual picker boundary

The current picker indexes active bilingual reference names, aliases, and form terms. It prefers complete normalized word phrases, then uses substring fallback, as implemented in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). This table is a static projection, not an Android picker observation.

| Query | Current result | After recommendation |
|---|---|---|
| `macadamia butter` | `ingredient-ref-macadamia-butter` | Same |
| `macadamia nut butter` | No result | `ingredient-ref-macadamia-butter` via the exact English alias |
| `beurre de macadamia` | `ingredient-ref-macadamia-butter` | Same; retain the current French display |
| `beurre de noix de macadamia` | No result | No result; do not add this French alias because it overlaps the whole-kernel name below |
| `macadamia nuts` | `ingredient-ref-macadamia-nuts` | Same |
| `noix de macadamia` | `ingredient-ref-macadamia-nuts` | Same; adding `beurre de noix de macadamia` would also return the butter row |
| `macadamia` | `ingredient-ref-macadamia-butter` and `ingredient-ref-macadamia-nuts` | Same |
| `macadamia nut butter sea salt flavor` | No result | No result; keep product qualifiers out of the generic alias |

The proposed English alias is distinct from `macadamia nuts` and does not add the whole-kernel row to that complete query. Do not move whole-macadamia names, macadamia oil, or qualified product formulations onto this identity’s aliases. The French active display already resolves the simple Québec-facing phrase; the longer Québec product wording remains documented as product terminology without changing the narrower whole-nut query.

## Recipe-demand audit

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for whole-word occurrences of `macadamia`, `macadamias`, `macadamia butter`, `macadamia nut butter`, `macadamia nut butters`, `macadamia spread`, `beurre de macadamia`, `beurre de noix de macadamia`, `beurre de macadamia et cajous`, `noix de macadamia`, *Macadamia integrifolia*, and *Macadamia tetraphylla*. The scan found **0 matching files and 0 matching ingredient rows**. No recipe link, form, or recipe-specific amount is proposed.

## Snapshot and uniqueness audit

Pre-integration snapshot taken 2026-10-16 from the split package and research files.

| Artifact | Pre-integration count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,699 | `9f21e7ddaab4101c1fe3aab333226a8916f7c8cec79dcea5ab3ab1e2d7685991` |
| Active ingredient forms | 141 | `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` |
| Legacy-import candidates | 56 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Research-ledger records | 2,055 | `a34fe0a3c3d646eb47738442c83cce02eaf5bac1b87158384da6331b22bf7391` |
| Manifest-listed recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 1,123 ingredient rows; 753,988 bytes | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

Before integration, the three new source IDs were distinct within this document and absent from the live research ledger and proposal/batch archive; the three URLs were pairwise distinct and absent from the existing ledger/archive. Existing macadamia-butter sources S04, S07, and S13 remain reused rather than duplicated. Exact picker ownership was checked across active reference names and aliases, form labels and match terms, and legacy candidate names and aliases.

## Integration status

Integrated on 2026-10-16: added English alias `macadamia nut butter`, attached S01-S03 under the existing ledger record, and preserved its identity, measurement, and substitution research states. The product formulas and handling remain SKU-specific. See the [integration README](../batches/wp03-section-i-macadamia-butter-formulation-integration-r379-20261016/README.md). No software tests, builds, emulator checks, or deployment work were run because the shared change only adds database JSON data under `AGENTS.md`; static validation is recorded in the README.
