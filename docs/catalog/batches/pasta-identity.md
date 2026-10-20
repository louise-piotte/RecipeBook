# WP03 generic pasta identity

- **Reviewed:** 2026-10-07
- **Status:** broad identity integrated; independent Québec French culinary review remains open.
- **Scope:** generic pasta as an ingredient product. Shape-specific and composition variants,
  preparation states, measurements, yields, conversions, and substitutions are tracked in follow-up
  batches such as [pasta shapes and Asian noodles](pasta-shapes-asian-noodles.md).

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-pasta` | pasta | pâtes alimentaires | FR: `pâte alimentaire` | `GRAIN_AND_CEREAL` | Broad formed pasta product. Keep dry/fresh, egg, whole-wheat, gluten-free, and shape identities distinct where useful. Do not alias `noodles` or `nouilles`. |

OQLF defines pasta as a formed food made from semolina or flour with water or eggs, cooked in a
boiling liquid. It gives *pâte alimentaire* as the preferred Québec French term and *pasta* in
English; the French terms are most often used in the plural. The catalog therefore displays the
product as *pâtes alimentaires* and retains the source's singular *pâte alimentaire* as an exact
French alias. The category follows the existing catalog's `GRAIN_AND_CEREAL` grouping for processed
cereal products. No ingredient forms, aliases beyond the singular French term, densities, unit
mappings, measurements, conversions, yields, or substitutions were added.

## Candidate boundaries

- **Dry and fresh pasta:** OQLF recognizes both; they remain separate preparation/product-state
  candidates. No generic form or mass/volume relationship is implied.
- **Egg, whole-wheat, and gluten-free pasta:** composition affects ingredient identity and culinary
  behavior. Keep these out of the generic row's aliases until separately reviewed.
- **Pasta shapes:** spaghetti is now integrated as a shape-specific candidate, not an alias for
  generic pasta; other common shapes such as orzo remain open.
- **Noodles / nouilles:** OQLF defines *nouilles* as flat, ribbon-shaped pasta. It notes that English
  *noodles* can be generic or refer to multiple specific products, and warns against using Québec
  French *nouilles* as a generic term for *pâtes alimentaires*, macaroni, or vermicelli. The English
  recipe mention was a serving instruction, not an ingredient line; neither term was activated as an
  alias.
- **Couscous:** the bundled turkey-meatball recipe mentions it only as a serving suggestion. The
  pasta identity does not absorb couscous or change that recipe.

## Recipe and collision audit

All 114 bundled recipe JSON files were scanned. The only pasta-adjacent mentions are `noodles` in the
beef Stroganov serving instruction and `couscous` in the turkey-meatball serving suggestion. No
matching pasta ingredient line was found, and no recipe was relinked. Normalized exact display-key
checks show `pasta`, `pâtes alimentaires`, and `pâte alimentaire` resolve only to
`ingredient-ref-pasta`; `noodles` and `nouilles` remain unassigned. The broad picker query can still
show other pasta-related products as separate results.

## Sources

- **WP03-S149 — OQLF, [pâte alimentaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870035/pate-alimentaire):** defines the food product, provides the preferred Québec French and English terms, and notes the use of fresh and dry pasta.
- **WP03-S150 — OQLF, [nouilles](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359483/nouilles):** defines Québec French *nouilles* as flat ribbon-shaped pasta and distinguishes it from the broader and variable English use of *noodles*.

## Verification record

Verified 2026-10-07 on the Pixel 9a profile, Android 16 / API 36 (1080×2424). The English picker
returned exactly one `pasta` result; the fr-CA picker returned exactly one `pâtes alimentaires`
result for the accent-folded query `pates alimentaires`. Screenshots:

- `pixel9a-pasta-picker-en.png` — SHA-256 `492725cdaa8680c9d10509c1207a39b2af67ece5629c83b85375f6df739b89a6`
- `pixel9a-pasta-picker-fr-ca.png` — SHA-256 `cd97f8beed48214600c2fbb85fded5d4b21c2881107395092be45ad151f55be7`

All 261 Android unit tests passed; 9 Python seed-package tests passed. Connected instrumentation
reported 29 tests: 27 passed, 2 environment-gated skips, 0 failures. The deploy script assembled,
installed, and launched the debug APK (SHA-256
`999472fc60f73ffefbf54a99732b0d5dc278283dbac60236b324e743e1a9a2f2`). Seed/package normalization,
schema validation, research-ledger validation, generated-index freshness, UTF-8/no-BOM and
mojibake checks, and `git diff --check` passed.

Final artifact hashes:

- Ingredient references (364 rows): `396fb89da5da6809028c2d2a84c7cb4eceed1e8535bd958d63ced8228fce30ed`
- Generated Kotlin catalog: `e4abed2df65d22281a0130d6297c2e1b3b6b558c570d07bee2f215b2a7d907c0`
- Research ledger (533 records): `db854863ee4ae97519c950e92d4c87e825481f51d435dcaeb54a7765dd498aac`

The manual recipe-editor probe remained unsaved. Verification ran on the separate temporary
`RecipeBook_Pixel_9a` AVD; the original `Pixel_9a` AVD remained connected and was not used for
installation or tests.
