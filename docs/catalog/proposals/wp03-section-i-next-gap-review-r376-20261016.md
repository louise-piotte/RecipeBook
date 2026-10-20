# WP03 Section I — cashew-butter formulation and portion evidence review (R376)

- **Review date:** 2026-10-16
- **Status:** proposal only; no shared catalog, ledger, plan, roadmap, batch, code, or test files changed
- **Scope:** the open Section I formulation-evidence subcheck for the existing cashew-butter identity; no new ingredient identity is proposed

## Recommendation

Keep the active **cashew butter / beurre de noix de cajou** reference, `ingredient-ref-cashew-butter`, and its current alias `beurre de cajous` unchanged. Add source-specific formulation evidence to its existing ledger record and record Health Canada's three portion weights for CNF food code 2548 as source-specific observations. Keep all product recipes, states, and portions tied to their cited pages; add no aliases, forms, density, unit mappings, recipe links, or substitutions.

The reviewed sources show that cashew-butter formulas vary. A Québec maker describes one product made only from cashews; another Canadian maker's organic SKU contains dry-roasted cashews and sunflower oil. The English and French pages for the same Mille et Une Noix item disagree about whether oil is present, while a Québec product-directory record for that GTIN agrees with the French page. Preserve that conflict instead of deciding which page represents the current package. It confirms that one supplier's listed formula cannot define the active identity.

Health Canada's CNF page for “Nuts, cashew butter, plain” (food code 2548) lists 15 ml = 16.2 g, 30 ml = 32.4 g, and 100 ml = 108.1 g. The Québec directory separately gives 1 tbsp = 15 g for one identified 225 g organic SKU. Record these as separate source-bounded observations. Do not infer a catalog density, universal tablespoon weight, unit mapping, or conversion from them.

## Plan fit and previous coverage

The [Section I formulation subcheck](../../RecipeBook-global-ingredient-catalog-plan.txt#L5282) remains open after the focused almond-butter review in [R367](wp03-section-i-next-gap-review-r367-20261016.md) and sunflower-butter review in [R370](wp03-section-i-next-gap-review-r370-20261016.md). The original [nut and seed product review](wp03-nut-seed-paste-product-gap-review-20261010.md) verified cashew butter as a separate identity and recorded one Nuts to You cashew-plus-sunflower-oil product. Its existing source IDs remain in the ledger and must be reused; do not add their URLs again. The [R361 raw-cashew hold](wp03-section-i-raw-cashew-kernel-form-hold-review-r361-20261016.md) expressly did not review cashew butter. This proposal extends only the unreviewed cashew-butter formula and portion evidence.

## Current owner, state, and picker boundary

The live reference is `ingredient-ref-cashew-butter`, category `FAT_AND_OIL`, English display **cashew butter**, French display **beurre de noix de cajou**, and French alias **beurre de cajous**. It has no English aliases, no attached forms, `defaultDensity: null`, and empty `unitMappings`. Its ledger identity state is `verified`; measurement and substitution research remain `not_yet_researched`. The record already has four sources and one accepted identity decision.

The complete current owners and search behavior were checked against [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), the [research ledger](../research-ledger.v1.json), and `IngredientSearch.kt`. Static picker projection follows normalized whole-word phrase matching followed by substring fallback; it is not an Android picker observation.

| Query | Current result | Proposal effect |
| --- | --- | --- |
| **cashew butter** | `ingredient-ref-cashew-butter` | Same |
| **beurre de noix de cajou** | `ingredient-ref-cashew-butter` | Same |
| **beurre de cajous** | `ingredient-ref-cashew-butter` | Same |
| **beurre de cajou** | `ingredient-ref-cashew-butter` by substring fallback | Same; the Québec maker's shorter product wording does not need a redundant alias |
| **cashew** | `ingredient-ref-cashew-butter` and `ingredient-ref-cashew-flour` | Same |
| **cashews** | `ingredient-ref-cashews` | Same |
| **noix de cajou** | `ingredient-ref-cashews`, `ingredient-ref-cashew-flour`, and `ingredient-ref-cashew-butter` | Same; preserve the broad French overlap |
| **cashew butter smooth** | No result | Same; no smooth form or alias is proposed |

The exact normalized owner of **cashew butter** and **beurre de noix de cajou** is the active cashew-butter reference. `ingredient-ref-cashew-flour` separately owns **cashew flour / farine de noix de cajou**, and `ingredient-ref-cashews` owns whole cashews. There is no cashew-butter form or legacy candidate. The shorter French phrase **beurre de cajou** is not an exact alias, but it already returns the cashew-butter row through the existing plural alias; adding it would not improve this picker projection. Do not move `noix de cajou`, flour wording, or any butter phrase onto another owner.

## Formulation and portion evidence

Sources were accessed on 2026-10-16. The proposed source IDs are local to this review and have not been added to the ledger.

| Source ID | Source | Supports | Evidence limit |
| --- | --- | --- | --- |
| **WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S01** | Health Canada, [Canadian Nutrient File: Nuts, cashew butter, plain, food code 2548](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2548&lang=eng&wbdisable=true) | Lists 15 ml = 16.2 g, 30 ml = 32.4 g, and 100 ml = 108.1 g under the “plain” cashew-butter record. | The page is a food-code observation, last modified 2019-03-01. It is not a product formula, recipe conversion, or universal packing convention. |
| **WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S02** | Umano, [Cashew Butter — Organic/Fair Trade](https://www.umano.ca/en/products/beurre-de-noix-de-cajou-biologique-equitable) | Describes a Québec-made, Sherbrooke product containing cashew nuts only, with no added oil or sugar. | One maker's SKU and product statement; it does not establish the composition or processing of other cashew butters. |
| **WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S03** | Aliments du Québec, [Beurre de cajou biologique](https://alimentsduquebec.com/aliments-dici/collation/beurre-de-cajou-biologique) | Gives Québec French wording for the Umano product and repeats its cashew-only/no-oil description. | A product-directory entry for the same Umano product, not an independent composition test or terminology ruling. |
| **WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S04** | Mille et Une Noix, [Beurre de cajou naturel](https://www.milleetunenoix.ca/products/cashew-butter) | French page lists cashews and organic sunflower oil and describes stirring to maintain a homogeneous texture. | The page marked its 225 g and 1 kg options sold out at review. It documents the maker's current French-page claims, not a verified package. |
| **WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S05** | Mille et Une Noix, [Natural Cashew Butter](https://www.milleetunenoix.ca/en/products/cashew-butter) | English page for the same named product and package sizes says it contains cashews only, with no oil, sugar, or salt. | Also marked sold out. Its formula statement conflicts with the maker's French page; the review could not determine whether this is a translation/data error or a formula change. Do not select either statement as canonical. |
| **WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S06** | Québec Food Directory, [Beurre de cajous bio](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207927) | Identifies the 225 g Mille et Une Noix item by GTIN 628110294531, lists organic cashews and organic sunflower oil, and gives 1 tablespoon (15 g). | The record was last updated 2025-10-29, contains company-supplied data, and includes a government accuracy disclaimer. It matches the French page but cannot resolve the current bilingual-page conflict or confirm today's package. |

The existing ledger sources `WP03-PASTE-PRODUCT-20261010-S05` and `WP03-PASTE-PRODUCT-20261010-S06` already document a separate Nuts to You cashew-butter SKU and its French wording, including that SKU's roasted-cashew-and-sunflower-oil formula. Reuse those IDs and citations in any future decision; do not re-register their URLs. Together with S02–S06, the evidence supports recording product-specific oil/composition claims and the unresolved page conflict. It does not support adding a smooth, roasted, salted, sweetened, unsalted, or “natural” form. No reliable source in this bounded review resolves a general salt, sugar, or stabilizer rule.

If accepted, attach S01–S06 and the decision to the existing `ingredient-ref-cashew-butter` ledger record. Record the three CNF weights and the directory's 1 tbsp / 15 g as separate observations with their source and code/SKU. The measurements support `researched_supported` for these documented portions only; keep density and unit mappings empty. Keep identity `verified` and substitution research `not_yet_researched`. Leave the Section I formulation subcheck open for other butter and paste identities.

## Recipe-demand audit

The [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists 114 recipe files and 1,123 structured ingredient rows. All recipe JSON was scanned for normalized whole-word occurrences of **cashew**, **cashews**, **cashew butter**, **beurre de cajou**, **beurre de cajous**, **beurre de noix de cajou**, **noix de cajou**, and *Anacardium occidentale*. The scan found no matching recipe text or ingredient line. This proposal adds no recipe link or form hint.

## Snapshot and uniqueness audit

Snapshot taken 2026-10-16. SHA-256 values pin the package and ledger files read for this proposal.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,698 | b18f0d523b37ee2ef087f9cf2dbb7074537a6f07f87abb8867bcc61a05790b7d |
| Active ingredient forms | 141 | 2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed |
| Legacy-import candidates | 56 | 8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720 |
| Research-ledger records | 2,054 | fe7b0a0ae84edad3565d07b46201ed1086fa91de0a3c02730564367d6a32c80d |
| Seed-package manifest recipe paths | 114 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 1,123 ingredient rows | 847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e |

The six proposal source IDs are distinct within this file and each had zero exact occurrences in the live research ledger and prior catalog proposal/batch archive. Their six URLs are pairwise distinct and each had zero exact occurrences in the live ledger or prior proposal/batch archive. The existing cashew-butter record and its four ledger sources were checked in place; its old sources remain reused rather than duplicated. Exact normalized search ownership was checked across active references, form IDs and match terms, legacy names and aliases, and ledger record/source text.

This is a proposal only. No shared reference, form, legacy, ledger, plan, roadmap, or batch file was edited. No tests, build, emulator, or deployment work was run.
