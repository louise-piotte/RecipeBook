# WP02 Section A7 R698 — Wheatlets milling-product identity review

- **Reviewed:** 2026-10-18
- **Status:** Proposal only. This review does not change catalog JSON, the research ledger, the plan, roadmap, workflow, or any recipe.
- **Scope:** One open A7 milling-product gap: Ardent Mills Canada’s Wheatlets. R695 Scottish-oatmeal substitution and R692 roasted-wheat-flour evidence are excluded.

## Recommendation

**Accept one identity-only reference:** `ingredient-ref-wheatlets`, category `FLOUR_AND_STARCH`, with the bilingual displays `Wheatlets / Wheatlets` and empty alias arrays. Ardent Mills’ Canadian English and French portfolios name Wheatlets separately and describe a coarse granular product made from purified wheat endosperm. Retain the source product name in both locales; do not invent a generic translation or alias from its process description.

This recommendation covers only the manufacturer-named product. The portfolio’s statement that Wheatlets is useful where wheat middlings are required describes an application; it does not establish equivalence with every wheat-middlings product or support substitutions. The proposal adds no forms, measurements, density, mappings, conversions, package yields, recipe links, or substitution rules.

## Why this is an open A7 gap

The unchecked parent at plan line 2114 keeps review of other grain meals and milling products open. The earlier A7 boundaries packet names meal and malted/toasted candidates but does not adjudicate Wheatlets as a standalone identity. R455 mentions Wheatlets as a neighboring product while deciding granular flour; it excludes Wheatlets as an alias on that row and explicitly keeps the products distinct. R454 likewise excludes Wheatlets as an alias on spring-wheat semolina. Neither proposal assigns a Wheatlets row or holds the standalone identity. The current workflow records Wheatlets only as a distinct portfolio neighbor, and the roadmap still reports A7 open after R695–R697.

The current reference package has 1,838 rows. No active reference, form, legacy-import candidate, or ledger record owns `ingredient-ref-wheatlets`. The phrase appears in the granular-flour evidence and decision as a distinct neighbor, not as an allocated Wheatlets candidate. The proposed ID is unused. No prior A7 proposal or integration has Wheatlets as its target.

## Current owners and boundaries

| Current owner | Current display and category | Boundary for this proposal |
| --- | --- | --- |
| `ingredient-ref-granular-flour` | `granular flour / farine granulaire`; `FLOUR_AND_STARCH` | Ardent’s separate Talisman product (portfolio code 10392). Do not add Wheatlets as an alias or merge the products. |
| `ingredient-ref-spring-wheat-semolina` | `spring wheat semolina / semoule de blé tendre`; `FLOUR_AND_STARCH`; aliases `farina flour` and `farine farina` | Farina is a separate milling product. Keep Wheatlets off this row. |
| `ingredient-ref-durum-semolina` | `durum semolina / semoule de blé dur`; `FLOUR_AND_STARCH` | Durum wheat product; no cross-grain alias. |
| `ingredient-ref-semola-rimacinata` | `remilled durum semolina / semoule de blé dur remoulue`; `FLOUR_AND_STARCH` | Explicitly remilled durum semolina; no Wheatlets equivalence. |
| `ingredient-ref-wheat-meal` | `whole wheat meal / farine de blé entier brute`; `FLOUR_AND_STARCH` | Owns only the qualified whole-wheat meal. Generic `wheat meal` remains unresolved. |
| `ingredient-ref-cracked-wheat` | `cracked wheat / blé concassé`; `GRAIN_AND_CEREAL` | Cracked kernels, not a purified-endosperm milling product. |
| `ingredient-ref-wheat-berries` | `wheat berries / grains de blé entiers`; `GRAIN_AND_CEREAL` | Whole kernels, not Wheatlets. |
| `ingredient-ref-wheat-bran` | `wheat bran / son de blé`; `GRAIN_AND_CEREAL` | Bran is a different milling fraction. |
| `ingredient-ref-cream-of-wheat-hot-cereal` | `cream of wheat hot cereal / crème de blé`; `GRAIN_AND_CEREAL` | Prepared hot-cereal identity; not the Wheatlets milling product. |

Do not alias `wheat middlings`, `wheat midds`, `wheat meal`, `wheat grits`, `farina`, `semolina`, `granular flour`, `coarse wheat granules`, `gruau de blé`, or `granules de blé` to Wheatlets. These terms either name neighboring owners, remain unresolved, or describe a broader class than this named product.

## Source and URL allocation

The two product-defining sources below are already in the shared ledger on `ingredient-ref-granular-flour`. Reuse their exact source IDs and URLs if this identity is integrated; do not duplicate either URL under a new source ID. Their existing source summaries identify Wheatlets as the separate adjacent product. The R698 use is the Wheatlets product section itself.

| Source ID and owner | Primary source / locator | Supports | Limits |
| --- | --- | --- | --- |
| **Reuse:** `WP02-A7-GRANULAR-FLOUR-R455-20261017-S03`, currently on `ingredient-ref-granular-flour` | Ardent Mills Canada, [Flour Portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf), February 2023, Wheatlets product section, code 10287. | English product name `Wheatlets`; coarse-granular, purified-endosperm description; source-stated application where wheat middlings are needed. It also lists Wheatlets separately from Farina and Talisman Granular. | The portfolio is manufacturer evidence, not a household retail label or a transferable milling standard. Its use statement is not a substitution claim. |
| **Reuse:** `WP02-A7-GRANULAR-FLOUR-R455-20261017-S04`, currently on `ingredient-ref-granular-flour` | Ardent Mills Canada, [Gamme de farine](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf), February 2023, Wheatlets product section. | The French-language Canadian portfolio uses the product name `Wheatlets` and provides a French description of its coarse-granular purified-endosperm product. This supports the same proper product name in both locales. | It does not establish a generic Québec French term for all wheat granules or middlings. Keep descriptive French wording out of aliases. |
| **Proposal-local corroboration only:** `WP02-A7-WHEATLETS-R698-20261018-S01` | COR, [Ardent Mills Saskatoon Plant kosher certification](https://www.ardentmills.com/media/c4olr1ts/am-kosher-saskatoon-mill-2025.pdf), issued 2024-11-26, pp. 3–4. | The certifier’s Canadian plant list names codes 10287 `Wheatlets Coarse` and 10288 `Wheatlets Coarse Wheat Granules`. | The letter expired 2025-12-31. It is not evidence of current availability, does not define a relationship between the two codes, and is not used to merge them or create aliases. It is not currently in the shared ledger. |

## Recipe demand and picker audit

The read-only corpus scan covered all 114 manifest-listed recipe files and 1,123 structured ingredient rows. It found zero hits for `Wheatlets`, `Wheatlets Coarse`, `Wheatlets Coarse Wheat Granules`, `wheat middlings`, `wheat midds`, `wheat granules`, or `granules de blé`, and zero links to a Wheatlets reference. The bundle has no recipe demand or portion evidence for this product.

The picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, punctuation, and spacing; prefer complete word-phrase matches; then use substring matches. The current catalog and the proposed name-only row with empty aliases yield:

| Query | Current result | Projected result |
| --- | --- | --- |
| `Wheatlets` | 0 | `ingredient-ref-wheatlets` |
| `granules de blé`; `wheatlets coarse`; `wheatlets coarse wheat granules` | 0 | 0; no descriptor alias is proposed |
| `granular flour`; `farine granulaire` | `ingredient-ref-granular-flour` | unchanged |
| `farina` | 5 rows, including `ingredient-ref-spring-wheat-semolina` | unchanged |
| `semoule de blé tendre` | `ingredient-ref-spring-wheat-semolina` | unchanged |
| `wheat meal` | `ingredient-ref-wheat-meal` (qualified whole-wheat-meal display match) | unchanged; generic wheat meal remains unresolved |
| `wheat`; `blé` | 62 and 67 rows, respectively | unchanged because neither display contains those as standalone terms |

The full-phrase query `Wheatlets` gains the new row; normal substring matching can also surface it for partial queries. Existing owner results for the boundary terms in the table remain unchanged. The zero-result descriptive phrases are intentionally not introduced as aliases: the manufacturer uses them as a product description or use context, not as additional generic names.

## Integration limits and static review scope

- Keep the proposed identity to the manufacturer-named Wheatlets product; do not infer a general wheat-granule class or resolve generic wheat meal, grits, or middlings.
- Do not turn industrial package formats or product codes into a kitchen measure, volume-to-mass conversion, density, recipe amount, or package yield.
- Do not transfer any values or substitutions from wheat flour, semolina, whole-wheat meal, cracked wheat, bran, or other cereal products. The wheat-middlings application note is not reusable replacement guidance.
- This was static source, archive, bundled-recipe, and picker-projection review only. No tests, build, emulator, or deployment were run. No files were changed as part of this proposal other than this proposal document.
