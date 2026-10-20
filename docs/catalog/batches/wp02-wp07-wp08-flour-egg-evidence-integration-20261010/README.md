# WP02, WP07, and WP08 integration — regional flours and egg/flour evidence

**Date:** 2026-10-10  
**Status:** Integrated and verified on Pixel 9a / Android 16; broader WP07/WP08 coverage remains open. Independent Québec terminology review is recorded separately.  
**Proposals:** [regional wheat-flour classes](../../proposals/wp02-regional-wheat-flour-classes-review-20261010.md), [chicken egg count-to-mass evidence](../../proposals/wp07-chicken-egg-count-mass-evidence-review-20261010.md), and [contextual wheat-flour substitutions](../../proposals/wp08-wheat-flour-contextual-substitution-review-20261010.md).

## Integrated catalog state

Ten identity-only flour references were added under `FLOUR_AND_STARCH`:

| Stable ID | English display | fr-CA display | Identity source criteria |
|---|---|---|---|
| `ingredient-ref-italian-type-00-flour` | Italian type 00 soft-wheat flour | farine de blé tendre de type 00 (Italie) | Italian DPR: max ash 0.55%; min protein 9.00% |
| `ingredient-ref-italian-type-0-flour` | Italian type 0 soft-wheat flour | farine de blé tendre de type 0 (Italie) | max ash 0.65%; min protein 11.00% |
| `ingredient-ref-italian-type-1-flour` | Italian type 1 soft-wheat flour | farine de blé tendre de type 1 (Italie) | max ash 0.80%; min protein 12.00% |
| `ingredient-ref-italian-type-2-flour` | Italian type 2 soft-wheat flour | farine de blé tendre de type 2 (Italie) | max ash 0.95%; min protein 12.00% |
| `ingredient-ref-french-type-45-flour` | French type 45 soft-wheat flour | farine de blé tendre de type 45 (France) | FranceAgriMer ash below 0.50% of dry matter |
| `ingredient-ref-french-type-55-flour` | French type 55 soft-wheat flour | farine de blé tendre de type 55 (France) | 0.50–0.60% |
| `ingredient-ref-french-type-65-flour` | French type 65 soft-wheat flour | farine de blé tendre de type 65 (France) | 0.62–0.75% |
| `ingredient-ref-french-type-80-flour` | French type 80 soft-wheat flour | farine de blé tendre de type 80 (France) | 0.75–0.90% |
| `ingredient-ref-french-type-110-flour` | French type 110 soft-wheat flour | farine de blé tendre de type 110 (France) | 1.00–1.20% |
| `ingredient-ref-french-type-150-flour` | French type 150 soft-wheat flour | farine de blé tendre de type 150 (France) | above 1.40% |

The Italian decree lists maximum ash and minimum protein values; no minimum ash value was inferred. FranceAgriMer prints gaps between some ash intervals; no missing grades or endpoints were interpolated. These identity criteria remain in source notes and do not populate recipe measurement fields. French grade display constructions are provisional: OQLF supports the generic `farine de blé tendre` wording, but the full type-number-country names and aliases need independent Québec review.

The classes have no forms, density, unit mappings, package yields, conversions, substitutions, or recipe links. Type 00 does not map globally to T50 or to “style 00”; type 150 is not an alias for whole-wheat flour; T45/T55 are not aliases for *gruau*. No Italian/French crosswalk or equivalence to North American flour grades was added.

## WP07 egg evidence

Twenty-three source-qualified count-to-edible-mass observations were added to the ledger: 13 for whole egg, five for egg white, and five for yolk. They retain their source and size qualifiers:

- CNF whole egg values include large 52.7 g, medium 46.4 g, small 41.6 g, extra large 58.1 g, jumbo 64.8 g, peewee 33.5 g, and two large 105.4 g. The CNF user guide qualifies household portions as edible weights without refuse.
- USDA SR28 records large/extra-large/jumbo whole egg at 50/56/63 g; the older USDA HG72 table records medium/large/extra large at 44/50/58 g and states its values derive from SR13.
- CNF and USDA record one large egg white at 33 g; CNF also lists three unsized whites at 99 g. Foodtasia's named cookie recipe gives a separate 60 g target for two large whites.
- CNF lists one large yolk at 16.1 g and also publishes unqualified two-yolk and four-yolk portions of 25 g and 68 g. USDA SR28 and HG72 list a large yolk at 17 g.

Shell-on Canadian and U.S. grade rules are recorded only to distinguish them from edible portions. No shell fraction, unspecified-size mapping, density, or runtime egg count conversion was added. The exact serving weights and variability in current USDA FoodData Central Foundation egg records remain an open source retrieval task.

## WP08 wheat-flour substitution evidence

Twelve directional and context-limited findings were added to the research ledger. They cover:

- all-purpose flour to bread flour in a named sandwich-bread formula and tested chocolate-chip cookies;
- bread flour to all-purpose flour in the reviewed yeast-bread comparisons and a tested snickerdoodle formula;
- cake flour to all-purpose flour, the absence of a general reverse substitution in AP-developed cakes/bars/cookies, and the source's AP-plus-cornstarch compound cake-flour formula;
- conditional all-purpose to self-rising flour changes and the reverse self-rising-to-AP-plus-baking-powder-plus-salt formula;
- bounded unsupported direct pastry-flour swaps and the limits of assigning King Arthur's product-specific Golden Wheat evidence to generic whole-wheat flour.

Every finding preserves its direction, recipe context, source brand, quantity basis (including when unstated), effects, and limitations. These remain ledger-only; the runtime resolver cannot express their required recipe-specific, compound, or unit-basis conditions. The existing all-purpose-flour state `existing_rule_needs_review` was preserved, and the prior cornstarch-to-flour sauce-thickening finding was not overwritten.

## Artifact snapshot

| Artifact | Integrated count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 691 references | `5922d0d6ab39f7954cf893193d74d7e6a72c51b2a48802c27b36f13a1c7bfe49` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `research-ledger.v1.json` | 878 records; 1,649 source entries; 1,356 distinct source IDs | `be599665ff1be0cc3dd1a25729702a8bf8ec43492b64721368ea6c4bb9cebed7` |
| Bundled recipes | 114 files; 1,123 ingredient rows | unchanged |

## Verification record

Integration added no recipe relinks, forms, runtime conversions, or runtime substitution rules.

- Bundled seed-package normalization and validation, ingredient-reference normalization, generated-catalog freshness, and research-ledger validation passed. All 10 Python seed-package tests passed.
- Android unit tests passed: 322 tests, 0 failures, 0 errors, 0 skipped.
- Connected Pixel 9a / Android 16 API 36 instrumentation passed: 30 cases, 28 passed, 2 skipped, 0 failures, 0 errors.
- On `emulator-5556`, English `Italian type 00 flour` returned `Italian type 00 soft-wheat flour`; French `farine de type 110` returned `farine de blé tendre de type 110 (France)`. `T50` and `style 00` returned no catalog rows. Both empty QA drafts were discarded without saving, and the French home was restored with all 114 recipes.
- Archived screenshots: [English type 00 picker](screenshots/en-italian-type-00.png), [French type 110 picker](screenshots/fr-french-type-110.png), and [French home with 114 recipes](screenshots/home-fr-114.png). Their SHA-256 checksums are recorded in [`SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).
