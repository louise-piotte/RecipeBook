# WP02/WP03/WP04 R791–R793 integration — 2026-10-19

Integrated three reviewed gaps across polvilho substitution evidence, the Kellogg's Krave cereal
family, and water-packed canned salmon. The additions remain within the source and product scopes
established by the reviews.

## Decisions

- **R791 — polvilho doce cheese-bread comparison:** Added four source entries and one
  `blocked_pending_evidence` finding to the existing `ingredient-ref-brazil-polvilho-doce` ledger
  row. The full indexed Ana Maria Braga page snapshot describes a sweet-to-sour suggestion for a
  1 kg sweet-polvilho recipe, while the directly accessible canonical page serves a different,
  sour-polvilho formula without that tip. Preserve the source-version conflict as unresolved; keep
  R688's product-specific measurement and R716's separate sour-to-sweet biscuit evidence intact.
  Added no active substitution, recipe link, measurement, or alias. See the
  [R791 proposal](../../proposals/wp02-b3-polvilho-doce-cheese-bread-comparison-review-r791-20261019.md).
- **R792 — Kellogg's Krave cereal family:** Added three bilingual `GRAIN_AND_CEREAL` references for
  Brownie Flavour, Cinnamon Sugar Churro Flavour, and Chocolate Flavour. Each has one SmartLabel
  portion attached only to its exact reviewed GTIN/package: 1 cup / 43 g for GTIN `00064100146228`,
  1 cup / 42 g for `00059724102088`, and 1 cup / 43 g for `00064100142305`. Added no forms, reusable
  cereal measure, density, mappings, recipe links, or substitutions. See the
  [R792 proposal](../../proposals/wp03-section-f-next-open-gap-review-r792-20261019.md).
- **R793 — canned salmon in water:** Added one bilingual `canned_in_water` form under the existing
  canned-salmon identity, plus one product-specific half-can drained (55 g) observation for the
  reviewed Clover Leaf pink-salmon product. Species, presentation, ingredients, package amount, and
  drained basis remain product-scoped; no general can measure, yield, recipe link, or substitution
  was added. See the
  [R793 proposal](../../proposals/wp04-section-p-canned-salmon-in-water-form-review-r793-20261019.md).

## Package state

- 1,879 ingredient references and 197 forms.
- 114 manifest-listed recipes and 1,123 structured ingredient rows; no recipe rows changed in this
  batch.
- 2,285 research-ledger records, 10,701 source entries, 9,003 distinct source IDs, 7,650 distinct
  source URLs, and 816 measurement observations.
- The generated Kotlin reference index is current at 1,879 references.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid, including
  bundled schema and research-ledger validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — current.
- Source ownership and uniqueness checks passed: R791's four new source IDs stay on the existing
  Doce record, and the R792/R793 source IDs map to their documented URLs. Reused French cereal
  family evidence and R793's Codex context remain with their previous owners.
- The recipe corpus remains 114 files / 1,123 rows; no Krave, canned-salmon-in-water, or
  polvilho cheese-bread recipe rows were added.
- Bundled JSON remains ASCII-escaped with no BOM; Markdown remains UTF-8 without BOM. Proposal and
  batch links, identifiers, and scoped whitespace were checked.

No software tests, build, emulator run, or deployment were performed because the application data
changes only add database JSON data, as specified in `AGENTS.md`. Sections B3, F, and P remain open.
