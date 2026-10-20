# WP03/WP04/WP06 R476–R478 gap review integration — 2026-10-17

## Decisions

| Review | Disposition | Boundary |
|---|---|---|
| [R476 foxtail millet flakes](../../proposals/wp03-section-f-next-gap-review-r476-20261017.md) | Held outside active references and the research ledger. | Current product listings establish the English product class, but no product-matched Québec French name is supported. Keep the plausible `flocons de millet d'Italie` construction unallocated, following R74's pearl-millet-flakes precedent. No shared data changed for this hold. |
| [R477 smoked Greenland halibut](../../proposals/wp04-section-p-next-seafood-review-r477-20261017.md) | Added identity-only `ingredient-ref-smoked-greenland-halibut`, category `PROTEIN`, with displays `smoked Greenland halibut / flétan du Groenland fumé` and no aliases. | Kept it separate from raw Greenland halibut and unqualified `smoked halibut / flétan fumé`. The manufacturer’s 10 lb case and the 210 g mixed-fish trio remain product-specific. No forms, measures, mappings, conversions, recipe links, package yields, or substitutions were added. |
| [R478 Kuka / baobab leaf powder](../../proposals/wp06-african-next-regional-review-r478-20261017.md) | Added identity-only `ingredient-ref-baobab-leaf-powder`, category `VEGETABLE_AND_AROMATIC`, with the sole English alias `baobab leaves powder`. | Kept it separate from baobab fruit products, fresh or whole dried leaves, and prepared `miyan kuka`. Added one ledger observation for the Nupe Eni Kuka recipe’s 50 g powder amount. Its local “small tin cup of milk” measure is undefined, and no active conversion, form, recipe link, package yield, density, unit mapping, or substitution was added. |

R478’s study also reports a 25–75 g ingredient variation and a 638.33 g average prepared-soup yield. The variation is noted with the source and the average yield is not treated as a baobab-powder measure or yield. `lalo` / `laalo` stays unindexed because the reviewed sources use it in region-specific contexts and the catalog cannot encode locale scope on an alias.

## Evidence and corpus

- R476 follows the source boundary in R74: a species term plus generic French flake wording is not enough to create a Québec-facing product name. Its product sources remain in the proposal and were not added as ledger sources for a held candidate.
- R477 adds four new manufacturer, product-directory, and fishmonger source entries. It reuses the existing OQLF, CFIA, and MAPAQ source IDs already attached to raw Greenland halibut; their URL ownership is unchanged.
- R478 adds three new sources from the National Academies Press, IRD/INSTAPA, and the *Nigerian Journal of Nutritional Sciences*. It reuses the existing OQLF and Kew baobab source IDs. The 50 g observation is tied only to the reported Nupe Eni Kuka formulation and source wording; it does not establish a reusable portion or volume conversion.
- The manifest-ordered scan covered all **114 recipe files** and **1,123 ingredient rows**. It found no matching candidate or boundary terms. No recipe files or ingredient rows changed.

## Picker projection

- R476 leaves all picker results unchanged.
- R477 exact English and French smoked Greenland-halibut phrases resolve to the new row. The broad `smoked halibut`, `flétan fumé`, and turbot phrases remain unassigned; generic `flétan`, `smoked`, and `fumé` searches now include the species-qualified prepared product.
- R478 exact `kuka` and leaf-powder phrases resolve to the new identity. Broad `baobab` offers both fruit pulp and leaf powder. `lalo`, `laalo`, and `miyan kuka` remain unassigned.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` and `--check` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 1,757 references.
- Research-ledger JSON Schema validation passed. A source ownership audit found one URL per source ID, no unowned new URL, and no dangling decision or observation source IDs.
- The 114-file / 1,123-row corpus scan found no candidate hits. UTF-8/no-BOM checks passed, and new bundled JSON text is stored with explicit Unicode escapes.
- A scoped `git diff --check` passed for files changed by this batch. A whole-worktree check still reports trailing whitespace in unrelated modified files under `docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes`; those files were not changed here.
- No app tests, builds, emulator checks, or deployment were run. The active catalog changes add database JSON data and regenerate its data-derived Kotlin index, under the current `AGENTS.md` rule.

## Snapshot after integration

- 1,757 ingredient references; 142 forms; 56 legacy-import candidates.
- 2,116 ledger records; 9,648 source entries; 8,190 distinct source IDs; 6,903 distinct source URLs.
- 114 recipes; 1,123 ingredient rows; manifest-ordered recipe corpus SHA-256: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.
- Reference JSON SHA-256: `2ddb0accff533d31bde9e28fbcab09df94ce63434a9c8342e220f57fe96eff58`.
- Form JSON SHA-256: `19efc2f40ddd50e33c1373a997d6940962cabe32d929efedaab38934e46bea62`.
- Research-ledger SHA-256: `66ea3489b2237dcdc3bac5c545a65767bc52f18280177c73b632de99706ff0b0`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.

Broader Section F grain coverage, Section P seafood coverage, and African regional coverage remain open.
