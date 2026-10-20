# WP02/WP03/WP04 R689–R691 gap review integration

Integrated 2026-10-18 from the proposal-only reviews for the whole-grain oat-flour substitution evidence gap, the No. 5 half-cuts bulgur form, and the Ontario Yellow perch fillet boundary.

## Decisions

| Review | Integration | Boundary |
|---|---|---|
| R689 — whole-grain oat flour | Added two Bob’s Red Mill sources and one evidence-only substitution finding to the existing `ingredient-ref-whole-grain-oat-flour` ledger record. | The 20% / 1/4 cup per 1 1/4 cups advice stays specific to the manufacturer’s cookie guidance. No active substitution rule was added; generic oat flour, sprouted oat flour, the existing CNF 6275 observation, picker data, and recipes are unchanged. |
| R690 — No. 5 half-cuts bulgur | Added `ingredient-form-bulgur-no-5-half-cuts` under `ingredient-ref-bulgur` and a form-level ledger record with the reused federal/OQLF sources and two new Sunnyland sources. | Match only the No. 5 half-cuts wording. Keep generic “very coarse,” standalone `#5`, manufacturer “extra-large grind,” and cross-brand grade mappings unassigned. The federal four-sizes/No. 5 inconsistency remains unresolved. No measure, density, conversion, yield, recipe link, or substitution was added. |
| R691 — Ontario Yellow perch fillets | Recorded a documentation-only hold in the plan and workflow; left active data unchanged. | Metro’s SKU wording would make broad `perch fillets` appear species-resolved as Yellow perch while the catalog has five perch-family results. The source IDs remain proposal-local; no new ledger allocation was made. |

The open WP02 Section A, WP03 Section F, and WP04 Section P work remains open beyond these bounded reviews.

## Validation

- `normalize_bundled_seed_package.py --validate-only` passed; `--check` reported the package already normalized. The package has 171 forms, and `generate_bundled_ingredient_catalog.py --check` reported 1,838 references current.
- Ledger validation passed with 2,218 records, 10,395 source entries, and 8,775 distinct source IDs; no source ID maps to multiple URLs. The R690 form’s parent, code, preparation state, and bounded match terms were checked.
- UTF-8/no-BOM, final newline, mojibake, and whitespace checks passed for the touched data and documentation files. A scoped `git diff --check` passed for tracked integration files.
- No software tests, builds, emulator run, or deployment were performed. The data changes are database JSON additions under `AGENTS.md`; R691 is documentation-only.

## Review records

- [R689 proposal](../../proposals/wp02-a4-whole-grain-oat-flour-substitution-review-r689-20261018.md)
- [R690 proposal](../../proposals/wp03-section-f-bulgur-no5-half-cuts-form-review-r690-20261018.md)
- [R691 proposal](../../proposals/wp04-section-p-yellow-perch-ontario-fillet-boundary-review-r691-20261018.md)
