# WP03/WP04/WP06 R473–R475 gap review integration — 2026-10-17

## Disposition

Integrated three bounded catalog decisions from independent proposals:

| Review | Accepted change | Boundary |
|---|---|---|
| [R473 Bob’s Red Mill 5 Grain Hot Cereal](../../proposals/wp03-section-f-next-gap-review-r473-20261017.md) | Added `ingredient-ref-bobs-red-mill-5-grain-hot-cereal` as `GRAIN_AND_CEREAL`, with the manufacturer’s English title and Québec retail French title/aliases. | Kept it separate from other named grain blends and component grains. Recorded 1/3 cup (40 g) as one product-label portion only. The rolled-oat suggestion has no supported amount, role, or tested result, so no substitution rule was added. |
| [R474 cooked octopus tentacles](../../proposals/wp04-section-p-next-seafood-review-r474-20261017.md) | Added `ingredient-form-octopus-cooked-tentacles` under the existing generic octopus reference. | Kept the Metro “previously frozen/thawed” detail product-specific. The listing’s 150 g average tray amount is not a recipe measure or yield. No species, conversion, recipe link, or substitution was added. Bare `tentacles` / `tentacules` searches now surface generic octopus with the cooked-tentacles form hint; OQLF also identifies squid as a principal tentacle product, so this broad-query effect remains visible for future review. |
| [R475 Voatsiperifery pepper](../../proposals/wp06-regional-next-identity-review-r475-20261017.md) | Added `ingredient-ref-voatsiperifery-pepper` as `BAKING_AND_SPICE`, displayed as `Voatsiperifery pepper / poivre Voatsiperifery`, with no aliases. | Kept unsettled species names and broad “wild pepper” descriptions out of the catalog. The exporter’s bulk-density range has no measurement basis, and one Québec recipe’s black-pepper option is retained only as a scoped ledger finding without an active rule. |

All three full-library scans found no candidate-specific recipe demand in the 114 manifest-listed recipes or 1,123 ingredient rows. No recipe data was changed.

## Evidence and source handling

- R473 uses the current Bob’s Red Mill product page, Metro Québec’s same-item listing, and existing Canadian product-list source IDs `WP02-GF-BLENDS-20261010-S08` and `WP03-MIGHTYTASTY-R77-20261013-S05`. The 1/3 cup (40 g) observation is product-specific; the manufacturer’s unquantified rolled-oat suggestion is not treated as an automatic replacement.
- R474 adds OQLF’s `tentacule / tentacle` term and Metro’s paired product 244396 pages. Metro’s indexed English and French listings describe cooked octopus tentacles and an average 150 g tray; the paired pages are one SKU, not independent product evidence. No package amount or thaw state is generalized.
- R475 adds the FOFIFA thesis, 2018 taxonomy paper, 2025 metabolomics paper, CIRAD naming article, Montréal retailer, Québec chef recipe, and exporter sheet. The source-named food identity does not assert a species. The optional black-pepper alternative is limited to the named sauce recipe.
- The ledger gained 12 new source entries and 2 new ingredient-reference records. Existing Bob’s Red Mill source IDs were reused without duplicate source entries.

## Picker projection

The proposals audited search behavior against `IngredientSearch.kt` before integration:

- R473 exact English/French product phrases gain the new product. Broad `hot cereal`, `cereal`, and `céréales` queries each gain one expected blend; exact 10-grain queries stay on the existing row.
- R474 exact cooked-octopus phrases return the existing octopus reference with a form hint. Bare `tentacles` / `tentacules` also return generic octopus because the qualified form label is searchable.
- R475 exact Voatsiperifery names resolve to the new identity. Broad `pepper` and `poivre` each gain one result; black pepper remains a separate identity.

## Static validation

- Bundled seed normalization check and validation-only mode passed.
- Generated Kotlin catalog index is current at 1,755 references.
- Research-ledger JSON Schema validation passed; all source IDs and URLs were reviewed for ownership.
- UTF-8/no-BOM checks passed. New seed text is serialized with explicit Unicode escapes.
- The manifest-ordered recipe corpus remains 114 files and 1,123 ingredient rows, with no candidate phrase hits.
- A repository-wide `git diff --check` reports trailing whitespace in unrelated modified exported-recipe-list files in the worktree. The files changed by this batch pass a scoped whitespace check.
- No app tests, build, emulator run, or deployment were performed for this batch: its active changes add database JSON data and regenerate the data-derived Kotlin index, under the current `AGENTS.md` rule.

## Snapshot after integration

- 1,755 ingredient references; 142 forms; 56 legacy-import candidates.
- 2,114 ledger records; 9,636 source entries; 8,183 distinct source IDs.
- 114 recipes; 1,123 ingredient rows; 753,988 recipe-file bytes.
- Reference JSON SHA-256: `56cdacf37c74d85ffb33c0eda77be0c8874cf5c1439863a89662fe9c8a95668c`.
- Form JSON SHA-256: `19efc2f40ddd50e33c1373a997d6940962cabe32d929efedaab38934e46bea62`.
- Research ledger SHA-256: `d2b5951fa5104941f8f52daaadae956e40fc4410f0d6e624763fd30bdc9b6344`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Manifest-ordered recipe corpus SHA-256: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

Broader Section F cereal-mix coverage, WP04 Section P seafood coverage, and the WP06 African cuisine review remain open.
