# R382 walnut-butter formulation evidence

Integrated 2026-10-16 under the open WP03 Section I formulation checklist.

## Decision

Added two product-specific sources and one decision to the existing verified `ingredient-ref-walnut-butter` record in the [research ledger](../../research-ledger.v1.json). Balsam Tahini describes its SKU as 100% dry-roasted walnuts. Good Form lists sprouted walnuts, vanilla, and monk fruit and describes a salt-water soaking step before drying. This does not establish residual salt in the finished butter. Keep each formula and process claim tied to its product.

The active `walnut butter / beurre de noix de Grenoble` reference, its aliases, and its null density/empty mappings remain unchanged. No forms, measurements, recipe links, conversions, yields, or substitutions were added; measurement and substitution research remain not yet researched. The broader Section I formulation checklist stays open. See the [R382 proposal](../../proposals/wp03-section-i-next-gap-review-r382-20261016.md) for the source register and picker boundary.

## Verification

- The two new source IDs and URLs were absent from the live ledger and earlier proposal/batch archive; they are pairwise distinct.
- Ledger totals after integration: 2,055 records, 9,264 source entries, 7,840 distinct source IDs, and 6,562 distinct URLs.
- All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. There is no walnut-butter-specific recipe match or direct link. Recipe 031’s generic nut-butter instructions have three separate peanut, hazelnut, and almond ingredient rows; recipes 055 and 058 link chopped walnuts to the whole-walnut reference.
- Static ledger schema, source-linkage, encoding, local-link, whitespace, and scoped-change checks passed.
- No software tests, build, emulator, or deployment checks were run because this addition only adds JSON research data under `AGENTS.md`.
