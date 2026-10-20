# WP02 / WP03 / WP04 round-twenty gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — Navane foxtail-millet flour:** Added only `navane atta` to the existing
  `ingredient-ref-foxtail-millet-flour` English aliases. ICAR–IIMR maps Kannada Navane to foxtail
  millet, DistaCart's Canada-locale listing supplies the exact flour-qualified product wording, and
  a current Canada-facing Silkrute listing includes Navane in a foxtail-millet-flour product name.
  The DistaCart item was sold out in its stale indexed snapshot and is used for naming only. Kept
  `navane flour`, other transliterations, and French Navane constructions inactive. Preserved the
  French display, source-specific measurement observations, null active density, empty mappings,
  forms, recipe links, and blocked substitution research.
- **WP03 Section F — barley couscous:** Added identity-only `barley couscous / couscous d'orge` as
  `ingredient-ref-barley-couscous`, with `belboula` as its sole English alias. DARI's product pages
  and brand history plus a Québec-market-facing retailer support the named product. The English
  product page says 100% barley semolina while the French ingredient field says 100% durum-wheat
  semolina; that contradiction is retained explicitly and no universal composition claim is made.
  Kept `malthouth` unassigned because the sources do not establish that regional ground-barley food
  as a stable synonym for this packaged product. Generic couscous measures do not transfer. No
  forms, measurements, conversions, yields, recipe links, or substitutions were added.
- **WP04 Section P — Northern wolffish:** Kept Northern wolffish / loup à tête large
  (*Anarhichas denticulatus*) outside the active catalog and research ledger. Canadian and Québec
  government sources support the distinct species and bilingual name pair; current Québec culinary
  product evidence and bundled recipe demand were not found. The official recovery strategy records
  no commercial value, while current recreational retention restrictions remain scoped to their
  stated fishery. This is a bounded hold, not a claim that no product could exist in every market.

## Shared data changes

The active reference package now has **1,347 references** and **98 forms**. One new reference was
added, and `navane atta` was added to an existing flour reference. The generated Kotlin index was
refreshed to **1,347 references**. No form, recipe link, active measure, conversion, yield, or
substitution was added.

The research ledger now has **1,660 records**, **6,463 source entries**, **5,412 distinct source
IDs**, and **4,502 distinct URLs**. It retains **342 measurement observations** and **195
substitution findings**. Eight new source IDs and URLs were registered; two existing couscous
sources and the existing Silkrute source ID were reused. The Northern-wolffish hold adds no ledger
candidate or source record.

| Artifact | Count/state | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,347 references | `92afa0f16bdada79553b5037085a6eaeaab6949dc54a0e25ddec5d7c9994a41d` |
| `research-ledger.v1.json` | 1,660 records; 6,463 source entries; 5,412 source IDs; 4,502 URLs | `8a8406c75995d2c0cce50bd59b7e81f0752d1c9de29c6027e717b6bd19cf2c57` |
| `BundledIngredientCatalog.kt` | 1,347 references | `b8ad70699e6e6c2f3f4160c4418448b45f90f56e2e98a280f4e1f76660953777` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Verification

- Bundled seed-package validation and normalized-state checks passed.
- Generated ingredient-catalog index freshness and reference normalization checks passed.
- Research-ledger JSON Schema validation passed.
- Exact-name ownership, added source-ID/URL collision checks, focused picker projections, and
  candidate-term recipe scans passed. The 114-file / 1,123-row manifest-ordered recipe corpus is
  unchanged.
- UTF-8 without BOM, local Markdown links, and R20-file whitespace checks passed. Repository-wide
  `git diff --check` also found trailing whitespace in already-dirty exported RecipeKeeper files
  outside this round; those unrelated files were left untouched.
- No app, unit, instrumentation, emulator, or other tests were run. These catalog additions change
  database JSON data only, and the Northern-wolffish decision is documentation-only, so tests were
  not needed under the updated `AGENTS.md` rule.

See the [WP02 Navane-flour review](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round20-navane-flour.md),
[WP03 barley-couscous review](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round20-barley-couscous.md),
and [WP04 Northern-wolffish review](../../proposals/wp04-section-p-northern-wolffish-loup-a-tete-large-picker-and-market-hold-review-20261013-round20.md).
A6, Section F, and Section P remain open.
