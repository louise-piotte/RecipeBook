# WP02 Section A7 R455: granular flour identity review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17; see [integration README](../batches/wp02-a7-granular-flour-identity-integration-r455-20261017/README.md).
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling products ([plan, A7 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004)).
- **Allocation:** R455 was not present in the proposal or batch archive when this review began.
- **Scope:** Assess Ardent Mills Canada’s current bilingual product pages titled **Granular Flour / Farine granulaire** as a separate wheat-milling identity. This review does not revisit R454’s exact Farina Flour aliases on spring wheat semolina.
- **Source IDs:** R455 S01–S04 below are registered in the granular-flour ledger record. The R454 Farina page source IDs cited for the neighboring identity are reused from the ledger.

## Recommendation

Add one identity-only reference for the named Canadian milling product:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-granular-flour` |
| English display | `granular flour` |
| French display | `farine granulaire` |
| Category | `FLOUR_AND_STARCH` |
| Aliases | None |
| Forms, measures, density, unit mappings, conversions, yields, recipe links, substitutions | None |

Ardent Mills Canada’s current English and French pages use these exact titles. They describe a high-flow flour made from top milling grades of Canadian hard red spring wheat and enriched to Canadian requirements [S01–S02]. The manufacturer’s linked portfolio separately lists Talisman Granular (code 10392), Farina, and Wheatlets; Wheatlets is described there as a coarse granular purified-endosperm product for applications requiring wheat middlings [S03–S04; reused R454 S01–S02]. This supports a bounded, product-named milling identity. It does not establish that granular flour is a kind of semolina, Farina, Wheatlets, or all-purpose flour.

Keep the row to the exact current page-title pair. Do not store `Talisman`, `Talisman granular`, `Wheatlets`, `instant blending flour`, `instant flour`, `farine granuleuse`, or `farine à mélanger instantanée` as aliases. The linked portfolio uses some of those phrases as brand or functional wording, but it does not define them as class-wide names; the more generic instant wording would also blur other milling-product candidates. The current localized page titles are enough for the bilingual identity.

## Pre-integration ownership and archive audit

This audit records the baseline observed before integration. It used the split seed package, live catalog and ledger, legacy-import candidates, A7 checklist, and proposal/batch archive.

| Store | Snapshot | Finding |
|---|---:|---|
| Ingredient references | 1,742 rows; SHA-256 `ebbac05ef2fba9098ef48eb3d201bcd49c1211ec283caca3c834817dda74302e` | No reference owns exact `granular flour` or `farine granulaire`; `ingredient-ref-granular-flour` is unused. The related active owner is `ingredient-ref-spring-wheat-semolina`, whose R454 aliases are specifically `farina flour` and `farine farina`. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term owns either proposed display. No form is proposed. |
| Legacy identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No candidate owns either proposed display or the proposed ID. |
| Research ledger | 2,101 records and 9,564 source entries; SHA-256 `4f1b33f941969e1a6ee7c0fa87354c573d46ce6f89bf7317908c6e8ccff0df32` | No record or source entry owns `granular flour` or `farine granulaire`. The `ingredient-ref-spring-wheat-semolina` record owns the R454 Farina alias decision. An unrelated malted-maize research record mentions an experimental instant corn flour; it does not own this wheat product or the proposed names. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All 114 files exist and parse; the complete corpus contains 1,123 ingredient rows. |
| A7 proposals and integration records | Current archive, checked 2026-10-17 | No previous granular-flour or R455 review/integration exists. R454 concerns the distinct Farina Flour product titles and keeps `Wheatlets` off that semolina row; it does not assign this granular-flour identity. The A7 parent remains open. |

The baseline ownership findings have been resolved by the accepted integration below. These counts and hashes describe the proposal-time snapshot, not the current package.

## Picker projection

The current picker normalizes accents and punctuation, returns whole-word phrase matches first, then falls back to substring matching. The projection adds only the proposed canonical pair with no aliases.

The first numeric result counts below are the pre-integration baseline; the projected column matches the integrated live catalog.

| Query | Current result | Projected result |
|---|---|---|
| `granular flour` | 0 | `ingredient-ref-granular-flour` |
| `farine granulaire` | 0 | `ingredient-ref-granular-flour` |
| `granular` | 0 | `ingredient-ref-granular-flour` |
| `granulaire` | 0 | `ingredient-ref-granular-flour` |
| `farine` | 171 results | Same 171 plus `ingredient-ref-granular-flour` (172) |
| `flour` | 170 results | Same 170 plus `ingredient-ref-granular-flour` (171) |
| `Talisman`, `Talisman granular`, `Wheatlets` | 0 for each | 0; no brand or neighboring-product alias is proposed |
| `instant blending flour`, `instant flour` | 0 for each | 0; portfolio wording remains descriptive evidence, not a stored alias |
| `farina flour` | `ingredient-ref-spring-wheat-semolina` | Unchanged |
| `semoule de blé tendre` | `ingredient-ref-spring-wheat-semolina` | Unchanged |
| `whole wheat meal` | `ingredient-ref-wheat-meal` | Unchanged |

The two broad flour-word queries gain one relevant row because each word occurs in a canonical display. No existing result is otherwise changed.

## Complete manifest recipe scan

All **114 manifest-listed recipe files** were read and parsed, covering all **1,123 structured ingredient rows**. The scan checked each complete decoded recipe JSON and each complete ingredient row using the same accent/ligature folding and word-boundary phrase matching used in the picker audit.

Searches for `granular flour`, `farine granulaire`, `farine granuleuse`, `Talisman granular`, `Talisman`, `Wheatlets`, `granules de blé`, `wheat middlings`, `instant blending flour`, `instant flour`, `semolina`, `semoule de blé`, `farina flour`, `farine farina`, `spring wheat semolina`, and `whole wheat meal` found **0 matching recipe files and 0 matching ingredient rows**. The bundle supplies no recipe demand for this product or its adjacent milling terms. No recipe links or edits are proposed.

## Evidence limits and data boundaries

- The current English and French pages are direct Canadian manufacturer evidence, and the French page provides local Canadian French wording. They are not an independent Québec terminology ruling or evidence of broad Québec retail usage.
- Ardent Mills identifies itself as a commercial supplier and says it does not sell directly to consumers. Its 20 kg bag and tote formats are industrial availability formats; they are not kitchen measures or package-yield evidence. Availability may vary by location and volume [S01–S02].
- The English page lists protein at 11–12.5%, ash at 0.43, and maximum moisture at 15%. These are manufacturer specifications for this product, not tested batch values or class-wide defaults. Do not store them as recipe amounts, density, or conversion data [S01–S02].
- The portfolio’s “instant blending flour” / `farine à mélanger instantanée` wording is a product-use description. It does not show that this product is interchangeable with generic instant flour, starch, semolina, or Wheatlets. Dusting and thickening applications are not substitution claims [S03–S04].
- The source calls the flour free-flowing and granular; those descriptors do not establish a prepared state or reusable `IngredientForm`. Add no form, form conversion, unit mapping, yield, or substitution.
- No Québec consumer package, household measure, independently validated density, recipe amount, or product-specific substitution was found. Keep all such fields empty.

## Source register

| Source ID | Source and locator | Supports | Limit |
|---|---|---|---|
| **Proposal-local** `WP02-A7-GRANULAR-FLOUR-R455-20261017-S01` | Ardent Mills Canada, [Granular Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/granular-flour/), accessed 2026-10-17. | Current English page title; high-flow description; Canadian hard red spring wheat and Canadian enrichment; applications, industrial formats, and product specifications. | Manufacturer-specific commercial product; no direct consumer sales, class-wide composition, home measure, density, or substitution evidence. |
| **Proposal-local** `WP02-A7-GRANULAR-FLOUR-R455-20261017-S02` | Ardent Mills Canada, [Farine granulaire](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/granular-flour/), accessed 2026-10-17. | Current French page title and matching Canadian product description; French-language manufacturer evidence. | Does not establish OQLF preference or independent Québec retail usage; no direct consumer sales. |
| **Proposal-local** `WP02-A7-GRANULAR-FLOUR-R455-20261017-S03` | Ardent Mills Canada, [Flour Portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf), linked from S01; accessed 2026-10-17. | Lists Talisman Granular, code 10392, separately from Farina and Wheatlets; describes it as an instant blending flour for dusting or thickening. | The PDF has no publication date shown; use for product-family distinctions and wording only, not current SKU availability or class-wide equivalence. |
| **Proposal-local** `WP02-A7-GRANULAR-FLOUR-R455-20261017-S04` | Ardent Mills Canada, [Gamme de farine](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf), linked from S02; dated 02/2023. | Lists code 10392 as `Talisman® Granuleuse`, calls it `farine à mélanger instantanée`, and lists Wheatlets separately as a coarse purified-endosperm product. | Manufacturer portfolio dated 2023; wording and SKU are not evidence of current retail stock. It does not establish a generic alias across suppliers. |
| **Reused — ledger** `WP02-A7-FARINA-ALIASES-R454-20261017-S01` | Ardent Mills Canada, [Farina Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/farina/). | Current neighboring manufacturer page for the distinct Farina product already represented by the spring-wheat-semolina row. | Supports that product’s alias decision only; it does not name or define Granular Flour. |
| **Reused — ledger** `WP02-A7-FARINA-ALIASES-R454-20261017-S02` | Ardent Mills Canada, [Farine Farina](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/farina/). | Current French counterpart to the neighboring Farina product page. | Does not establish `farine granulaire` as an alias for Farina or semolina. |

## Disposition

Integrated `ingredient-ref-granular-flour` as `granular flour / farine granulaire` in `FLOUR_AND_STARCH`, with the four R455 sources and one accepted identity decision. The canonical pair has no aliases, forms, measures, density, mappings, conversions, recipe links, yields, or substitutions. The R454 Farina row remains separate; this entry is not connected to Wheatlets or generic instant flour. The manifest contains no matching recipe demand. No software tests were run because this change only adds database JSON data, under the `AGENTS.md` rule. See the [integration README](../batches/wp02-a7-granular-flour-identity-integration-r455-20261017/README.md).
