# WP04 Section P R432 crab-cake identity integration

**Date:** 2026-10-17
**Scope:** prepared crab cake / croquette identity.

## Integrated decision

Added identity-only `crab cake / croquette de crabe` as `ingredient-ref-crab-cake` in `PROTEIN`. English aliases are `crab cakes`, `crab croquette`, and `crab croquettes`; French aliases cover singular and plural `beignet`, `croquette`, and `galette de crabe` phrases. The plural `croquettes de crabe` was included during root picker review so the projected plural query resolves to the row.

Keep this prepared food separate from plain crab meat, crab balls, fish cakes, and imitation crab. Recipe 019 remains linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. No form, reusable measure, density, unit mapping, conversion, package yield, recipe link, or substitution was added. Measurement research is `researched_no_supported_value`; substitution research is `researched_no_supported_substitute`.

The ledger records OQLF's Québec terminology and two current Québec frozen-product listings. OQLF defines the prepared dish and supports its French and English naming. La Mer names a frozen ready-to-cook crab cake; Aliments DKL lists frozen crab cakes with a vendor-specific approximate piece count and case weight. Those retail details do not establish a common crab species, recipe formula, reusable measure, or yield.

The existing source `WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S05` for Clover Leaf's *Mini-croquettes de crabe* recipe remains attached to `ingredient-form-crab-canned`. It describes a recipe using three 120 g cans of crab, drained; it is not a picker owner or a retail crab-cake product specification. Its package quantity and drained state were not copied to the new identity.

## Picker and recipe-corpus projection

The phrase-first projection follows `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`.

| Query | Current result | After integration |
|---|---|---|
| `crab cake(s)`, `crab croquette(s)`, `croquette(s) de crabe`, `beignet(s) de crabe`, `galette(s) de crabe` | None | `ingredient-ref-crab-cake` only |
| `crab meat`, `chair de crabe`, `jumbo lump crab meat` | `ingredient-ref-crab` with its explicit Jumbo Lump form where applicable | Unchanged |
| `crab`, `crabe` | Seven identities: crab meat, blue crab, Dungeness crab, Jonah crab, northern stone crab, stone crab, and crab-flavoured pollock flakes | Same seven plus `ingredient-ref-crab-cake` |
| `cake` | Three cake-related identities | Same three plus `ingredient-ref-crab-cake` |
| `fish cake`, `crab balls`, `boulettes de crabe` | None | None; no broad alias was added |

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. Recipe 019's source URL contains “baked crab cake bites,” but the recipe is titled `Crab Balls / Boulettes de crabe` and its instructions describe homemade crab balls. Its only crab ingredient is row #8, `1 lb jumbo lump crab meat`, already linked to the crab-meat reference and form. No ingredient row requests a crab cake or crab croquette, so no recipe link or recipe edit was made.

## Validation

- The normalized package contains 1,729 ingredient references and 141 forms; the ledger contains 2,088 records, 9,467 source entries, 8,024 unique source IDs, and 6,740 unique URLs.
- The three ledger source IDs and URLs are unique. The OQLF source ID was cited in the earlier generic-crab boundary proposal; the OQLF page and both current retailer URLs were not previously attached to this ledger.
- Package and reference normalization, schema/ledger validation, generated-index freshness, picker projection, manifest recipe scan, UTF-8/no-BOM and escaped-Unicode checks, local links, and scoped whitespace checks passed.
- No app tests, builds, emulator checks, or deployment were run because the change only adds database JSON data, consistent with `AGENTS.md`.

See the [R432 review proposal](../../proposals/wp04-section-p-crab-cake-identity-review-r432-20261017.md). WP04 Section P remains open for the other shrimp, crab, and crayfish coverage gaps.
