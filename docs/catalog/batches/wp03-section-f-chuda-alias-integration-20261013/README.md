# WP03 Section F: `chuda` flattened-rice alias integration (2026-10-13)

## Decision

Added the bare English-search alias `chuda` to the existing `ingredient-ref-flattened-rice-poha` reference. Odisha government and food-heritage sources identify chuda as flattened rice; a plain-product label pairs `Chuda` with `Poha`, and a Canada-facing listing uses `Chuda (Poha)` for a plain flattened-rice product. The reviewed evidence does not establish a universal rice cultivar, flake grade, or French label.

The alias stays on the existing flattened-rice identity. Prepared dishes and mixtures, including `chuda upma` and chivda, remain outside the alias. French display and aliases, the three thin/medium/thick poha forms, and all active numeric behavior remain unchanged.

## Evidence and numeric scope

The source register and limits are recorded in the [round-four proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round4.md). Five reviewed sources were added to the flattened-rice ledger record. The Odisha School Education Programme Authority menu shows `Chuda-50g`, but does not say whether it is dry or prepared, identify its grade, or provide a repeatable measure. That amount was not added as a generic observation.

The existing ledger observation for 60 g / 3 fistfuls remains scoped to the complete FAO / BBF *Chirar Polao* recipe formula, yielding one 230 g cooked bowl and two servings. It does not establish a general poha or chuda measure. The flattened-rice reference keeps null density, empty unit mappings, and blocked substitution research. No form, conversion, yield, substitution rule, recipe link, or recipe edit was added.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — package valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,338 references.
- Focused JSON assertions confirmed one `chuda` alias on the target, all five source IDs on its ledger record, the unchanged Chirar Polao observation, null density, empty mappings, and blocked substitutions.
- Static search projection including attached forms returns only flattened rice for `chuda`; existing results for `chira`, `achira starch`, `chuda upma`, `chivda`, `chiwda`, `poha`, `rice flakes`, and `mudhi` remain as expected.
- The manifest corpus scan covered 114 recipes and 1,123 ingredient rows; it found no chuda spelling and no existing flattened-rice links.
- No app, unit, instrumentation, or emulator tests were run. This change only adds database JSON data, so the repository's `AGENTS.md` testing rule exempts it.
- UTF-8 without BOM, mojibake markers, and scoped whitespace were checked for the edited data, proposal, batch note, plan, and roadmap.
