# WP02/WP03/WP04 R86 catalog integration (2026-10-13)

## Decisions integrated

- **WP02 B2 — Bunya nut flour:** Held outside active references and the research ledger. Product sources support Bunya flour as a food ingredient, but the current phrase-first picker would make broad `nut flour` search return only Bunya and hide seven existing flour results. No Québec French flour label or bundled recipe demand was found. The whole Bunya nut and Brazilian pinhão-flour entries remain distinct. See the [WP02 proposal](../../proposals/wp02-b2-bunya-nut-flour-picker-boundary-hold-r86-20261013.md).
- **WP03 Section F — mochigome:** Added `mochigome` as the sole new English alias on the existing `glutinous rice / riz gluant` reference. Its displays and other aliases remain unchanged; black glutinous rice remains separate. The broad regular-rice replacement statement is recorded as unsupported for a reusable substitution rule. No form, measurement, conversion, yield, recipe link, or rule was added. See the [WP03 proposal](../../proposals/wp03-section-f-mochigome-alias-review-r86-20261013.md).
- **WP04 Section P — bocaccio:** Added identity-only `bocaccio / bocaccio` for *Sebastes paucispinis*, with category `PROTEIN` and empty aliases. Shared snapper/rock-salmon names and `sébaste bocace` remain outside the picker; the row makes no claim about Québec retail availability. No form, measurement, conversion, yield, recipe link, or substitution was added. See the [WP04 proposal](../../proposals/wp04-section-p-bocaccio-species-identity-review-r86-20261013.md).

The catalog now contains **1,418 ingredient references, 104 forms, and 1,757 research-ledger records**. The manifest remains at **114 recipes** and **1,123 ingredient rows**. Static picker projections are unchanged for broad rice, redfish, rockfish, snapper, and salmon queries; exact `mochigome` selects glutinous rice, and exact `bocaccio` selects its new row. The recipe corpus has zero candidate-name or ingredient-row matches.

## Static validation

Passed:

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` (includes research-ledger schema validation)
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Picker boundary projection and recipe corpus scan (114 files / 1,123 ingredient rows)
- UTF-8 without BOM, JSON Unicode escaping, final newlines, no trailing whitespace or mojibake, local proposal links, and scoped `git diff --check`

No app tests, Gradle tasks, emulator runs, or deployment were needed for these database-JSON additions under the updated `AGENTS.md` rule.
