# WP06 maple sugar identity integration and Pixel 9a QA

## Accepted scope

Promoted the pending `ingredient-ref-maple-sugar` candidate to a distinct
`maple sugar / sucre d’érable` reference in `SUGAR_AND_SWEETENER`. It stays separate from maple
syrup and generic granulated sugar. No aliases were added: the OQLF’s rare Québec terms
`sucre du pays` and `sucre d’habitant` carry regional scope that the current alias model cannot
retain. No form, density, unit mapping, measurement, conversion, substitution, or recipe link was
added.

## Evidence and package snapshot

The identity is supported by the [OQLF Grand dictionnaire terminologique entry for
sucre d’érable](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358379/sucre-derable),
updated in 2004 and accessed on 2026-10-09. The entry defines a maple-syrup-derived crystalline
solid, describes soft through very hard consistencies, and pairs the preferred French term with
English `maple sugar`. It does not establish recipe quantities or conversions. The canonical
source record is `WP06-NA-CUISINE-20261009-S01`; the broader evidence review is in the
[North American WP06 proposal](../../proposals/wp06-north-american-cuisine-gap-sweep-20261009.md).

- 459 ingredient references; SHA-256
  `daedf64ca9b31302665f8dbe63e8af96236842b55efb6b22e680b030dc2c5502`.
- 17 ingredient forms.
- 625 research-ledger records, 844 source entries, and 739 distinct source IDs; ledger SHA-256
  `690134f2d8978fe286b85016764db5b7744473e674f9166244a7f3b96cd23e18`.
- 99 legacy candidates; 114 recipes and 1,123 ingredient lines. The proposal’s full manifest scan
  found no maple-sugar recipe-line hit.

## Verification

- Bundled package and research-ledger validation passed; the seed-reference normalizer and generated
  catalog check passed at 459 rows; `git diff --check` passed.
- All 9 Python package tests and all 284 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML test cases, 27 passed, 2
  skipped, 0 failures, and 0 errors. The repository deploy script installed and launched the debug
  app on this emulator.
- English query `maple sugar` displayed one `maple sugar` result. In French, the normalized query
  `sucre d erable` displayed `sucre d’érable`. The blank draft was discarded; the French home
  returned to `Toutes les recettes (114)`.

## Screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English `maple sugar` result | [maple-sugar-en.png](maple-sugar-en.png) | `02402326f95e67a8519592fb8241d041c9fff5652b43d6f242f2f822b19f69ab` |
| French `sucre d’érable` result | [maple-sugar-fr-ca.png](maple-sugar-fr-ca.png) | `202c4f0645ad82b5e61990b4546504a9850b3b5956b643e422f5b53b40f1b857` |
| French library home after discarding the draft | [home-fr-ca-114.png](home-fr-ca-114.png) | `9095c8aeb756bfca1b3ab7c1d2e375ed82328a59ab2c03dae8cb9db308a652f7` |
