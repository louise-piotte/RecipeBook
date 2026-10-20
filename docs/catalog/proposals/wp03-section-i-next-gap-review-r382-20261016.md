# WP03 Section I — walnut-butter formulation and picker review (R382)

- **Review date:** 2026-10-16
- **Status:** integrated as a ledger-only formulation update; no active catalog fields changed
- **Scope:** the open Section I formulation-evidence subcheck for the existing walnut-butter identity

## Recommendation

Record two new, product-specific formulation sources under the existing ledger record **ingredient-ref-walnut-butter**. Keep its active reference unchanged: **walnut butter / beurre de noix de Grenoble**. Balsam Tahini’s Canadian product page describes its SKU as 100% dry-roasted walnuts. Good Form Foods’ Original Sprouted SKU lists walnuts, vanilla, and monk fruit and describes a salt-water soak before drying. These maker claims show that a walnut-butter product name does not guarantee one formula or process. They do not establish a universal ingredient list, salt content, texture, or recipe behavior.

If accepted, add only the two source entries and a product-specific decision to the existing walnut-butter ledger record. Keep identity state **verified**, measurement state **not_yet_researched**, and substitution research **not_yet_researched**. Add no reference, alias, form, density, unit mapping, measurement, recipe link, conversion, yield, or substitution. In particular, do not turn **roasted**, **sprouted**, **vanilla**, **monk fruit**, **creamy**, or **crunchy** into global forms or aliases. Keep any salt-handling statement tied to Good Form’s SKU; the page does not establish how much salt, if any, remains in the finished butter.

## Plan fit and prior coverage

Section I still has the open subcheck **“Record added sugar, salt, oil, and stabilizers when they materially affect culinary behavior”** in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). The focused almond-butter, sunflower-butter, cashew-butter, and macadamia-butter reviews in [R367](wp03-section-i-next-gap-review-r367-20261016.md), [R370](wp03-section-i-next-gap-review-r370-20261016.md), [R376](wp03-section-i-next-gap-review-r376-20261016.md), and [R379](wp03-section-i-next-gap-review-r379-20261016.md) address other identities; they do not decide walnut-butter formulation. The original [nut and seed product review](wp03-nut-seed-paste-product-gap-review-20261010.md) already created the walnut-butter identity and registered its original evidence. This proposal reuses those existing sources rather than duplicating them and keeps the broad formulation checklist open.

## Current owner, ledger state, and neighboring identities

The active row is **ingredient-ref-walnut-butter**, category **FAT_AND_OIL**, English display **walnut butter**, French display **beurre de noix de Grenoble**, with no aliases, no attached form, null default density, and empty unit mappings. Its ledger identity is verified; measurement and substitution research remain not yet researched. Its existing ledger entry has two sources and one accepted identity decision.

The whole-kernel row **ingredient-ref-walnuts** is displayed as **walnuts / noix de Grenoble** and owns the chopped-walnut form **ingredient-form-walnuts-chopped**. The separate oil row is **ingredient-ref-walnut-oil**, displayed as **walnut oil / huile de noix**. No form is attached to walnut butter. No legacy-import candidate owns this butter identity; the product qualifiers in the source table remain source wording, not proposed active terms. The historical WP02 defatted-walnut-flour hold concerns flour scope and is not an owner of this butter identity.

Reuse the existing sources **WP03-PASTE-PRODUCT-20261010-S10** (Cru Nature’s Québec product page, including its product-specific raw/activated wording) and **WP03-PASTE-PRODUCT-20261010-S13** (the CIPO goods-description wording). S10 supports the existing Québec product name and source-specific product title, not a universal formula. S13 is an official trademark-journal goods description, not an OQLF terminology ruling or a product-composition standard. Neither existing source ID or URL is re-registered below.

## Formulation evidence

Sources were accessed on 2026-10-16. New source IDs are proposal-local and have not been added to the ledger.

| Source ID | Source | Supports | Evidence limit |
|---|---|---|---|
| **WP03-I-WALNUT-BUTTER-FORMULATION-R382-20261016-S01** | Balsam Tahini, [Walnut Butter](https://balsamtahini.com/products/walnut-butter) | The Canadian seller’s product page describes its walnut butter as made from 100% dry-roasted walnuts and stone-ground in small batches. The page showed 310 g and 5 kg options when reviewed. | This is one maker’s product-page statement, not an independently verified package or a standard for other walnut butters. Do not generalize its roasting or formula. |
| **WP03-I-WALNUT-BUTTER-FORMULATION-R382-20261016-S02** | Good Form Foods, [Original Sprouted Walnut Butter — Creamy or Crunchy](https://www.goodformfoods.com/products/minimal-walnut-butter-crunchy) | The product page lists “Sprouted Walnuts, Madagascar Vanilla, Monk Fruit” and describes soaking the walnuts in pink Himalayan salt water before low-temperature drying. The page describes the flavor as subtly sweet. | The page showed the SKU sold out and prices in USD. It is maker-provided product evidence, not a Québec retail label or independent composition test. It does not state how much salt, if any, remains after processing; do not treat salt as a declared finished ingredient or infer a salt-free product. |

The two pages support different SKU claims: one product described as 100% dry-roasted walnuts, and one product with vanilla and monk fruit plus a salt-water soaking step. The product language is enough to record formulation variation under the existing identity. It is not evidence for general recipe substitutions, universal sweetness, an added-sugar claim, or a reusable preparation state. Good Form’s product page recommends use on toast, fruit, oats, yogurt, smoothies, baking, and sauces; these are manufacturer suggestions, not recipe tests or evidence for bundled-recipe links.

## Bilingual picker boundary

The current picker projection was checked against the active reference and form terms using the phrase-first, substring-fallback behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). This is a static code-based projection, not an Android picker observation. No alias or form change is proposed, so expected results remain the same.

| Query | Current result | After recommendation |
|---|---|---|
| **walnut butter** | ingredient-ref-walnut-butter | Same |
| **beurre de noix de Grenoble** | ingredient-ref-walnut-butter | Same; retain the Québec-facing display |
| **noix de Grenoble** | ingredient-ref-walnut-butter and ingredient-ref-walnuts | Same; the phrase is broad and reaches both butter and kernels |
| **walnuts** | ingredient-ref-walnuts | Same; the English plural remains on whole kernels |
| **walnut** | ingredient-ref-walnut-butter and ingredient-ref-walnut-oil | Same; this short query remains broad |
| **beurre de noix** | Brazil-nut butter, cashew butter, coconut butter, and walnut butter | Same; do not add this unqualified French alias |
| **beurre de noix de Grenoble crues** | No result | Same; keep the raw-product qualifier source-specific |
| **walnut butter sprouted** | No result | Same; do not add a product-process alias |

Retain the current French display, which the existing Québec maker source uses. Do not add **noix de Grenoble** as a butter alias, because it is already the whole-kernel display and currently resolves both records. Do not add broader **beurre de noix** or process/texture qualifiers. This preserves the bilingual search boundary without changing a working identity.

## Manifest-listed recipe-demand audit

All **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** were scanned across the full parsed recipe JSON for normalized whole-word matches to **walnut butter**, **walnut butters**, **walnut nut butter(s)**, **walnut butter spread(s)**, **beurre de noix de Grenoble**, **beurre de noix de Grenoble crues**, **beurre de noix de Grenoble activées**, **beurre aux noix de Grenoble**, **beurre de Grenoble**, *Juglans regia*, and **ingredient-ref-walnut-butter**. The scan found **0 candidate-specific matching files and 0 matching ingredient rows**; no structured ingredient row links to ingredient-ref-walnut-butter.

The broader generic phrases **nut butter** and **beurre de noix** each occur in one file, recipe 031, only in the bilingual instructions. That recipe’s structured rows explicitly list peanut butter, hazelnut butter, and almond butter as three separate variants; it has no walnut-butter row. Do not infer a walnut-specific recipe link from the generic instruction. Two other structured rows name **chopped walnuts** (recipes 055 and 058); both link to **ingredient-ref-walnuts**, not walnut butter. No recipe link, amount, or form hint is proposed.

## Snapshot and source-uniqueness audit

Pre-integration snapshot taken 2026-10-16. Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, that recipe’s exact bytes, and a trailing NUL byte in manifest order.

| Artifact | Snapshot | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,699 | 7de92a92313e3d0c364ca4a5a5bdf622e1b138a3ba6c42f194f5e85c410b810e |
| Active ingredient forms | 141 | 2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed |
| Legacy-import candidates | 56 | 8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720 |
| Research-ledger records | 2,055 | bf358f24c21015ec46f4111301ca8b86a61df71f4cd59f417be2f05dca989579 |
| Research-ledger source entries / distinct source IDs / distinct URLs | 9,262 / 7,838 / 6,560 | — |
| Manifest-listed recipe paths | 114 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 1,123 ingredient rows; 753,988 bytes | 847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e |

The proposed IDs **WP03-I-WALNUT-BUTTER-FORMULATION-R382-20261016-S01** and **S02** are distinct from each other. Before this proposal was created, both IDs had zero exact matches in the live ledger and pre-existing catalog proposal/batch archive. Their two URLs are pairwise distinct and likewise had zero exact matches there. Existing source IDs S10 and S13 remain reused. Active, form, legacy, and ledger ownership checks found no duplicate walnut-butter reference, form, legacy candidate, or alternate ledger record.

## Integration boundary

If accepted, add S01 and S02 plus a product-specific decision to the existing walnut-butter ledger record. Preserve its active display, aliases, category, and research states. Keep source-specific formulation and processing claims attached to their cited products. Leave forms, measures, density, unit mappings, recipe links, conversions, yields, and substitutions empty. Keep the broader Section I formulation checklist open for other identities.

At proposal-only handoff, only this proposal file was created. Root integration is recorded below. No software tests, builds, emulator checks, or deployment work were run.

## Root review and integration

Root independently reviewed both product pages. Balsam Tahini describes its walnut butter as 100% dry-roasted walnuts and stone-ground, and its page displays 310 g and 5 kg options with a Mississauga address and CAD pricing. Good Form lists sprouted walnuts, Madagascar vanilla, and monk fruit, and describes soaking the walnuts in pink Himalayan salt water before low-temperature drying; the page showed the SKU sold out. This process description does not establish how much salt, if any, remains in the finished product. Both records therefore remain product-specific.

Root reproduced the active-reference, form, legacy, ledger, and recipe snapshot hashes in the pre-integration table. The full manifest scan found no walnut-butter-specific recipe file, ingredient row, or direct ingredient-reference link; it confirmed the generic nut-butter instructions in recipe 031 and the separate chopped-walnut rows in recipes 055 and 058. The two new source IDs and URLs were absent from the live ledger and prior archive. Root added the two sources and one product-specific decision to the existing `ingredient-ref-walnut-butter` ledger record, with no active catalog change. The Section I formulation checklist remains open.

The ledger now has 2,055 records, 9,264 source entries, 7,840 distinct source IDs, and 6,562 distinct URLs. Static schema, ownership, source-linkage, encoding, local-link, whitespace, and scoped-change checks passed. No software tests, build, or emulator checks were run because this addition only adds JSON research data under the updated `AGENTS.md` rule.

