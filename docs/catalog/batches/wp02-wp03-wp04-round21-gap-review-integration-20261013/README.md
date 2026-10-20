# WP02 / WP03 / WP04 round-twenty-one gap-review integration

Date: 2026-10-13

## Dispositions

- **WP03 Section G — bagel:** Added identity-only `bagel / bagel` as
  `ingredient-ref-bagel` in `BAKING_MIXIN_AND_PANTRY`, with English aliases `bagels` and `beigel`
  and French alias `baguel`. Kept generic bread rolls / `petit pain`, bagel crisps, pretzels, mini
  bagels, and flavor SKUs separate. Added no forms, active density, unit mappings, recipe links,
  conversions, package yields, or substitutions.
- **Package evidence:** Recorded Aliments du Québec’s six-unit / 410 g St-Viateur sesame-bagel
  listing only as a source-specific ledger observation. It is not divided into a per-bagel value and
  does not transfer to other products or varieties.
- **WP02 A7 — sprouted rye flour:** Kept the proposed flour unallocated pending independent Québec
  review. The provisional `farine de seigle germé` display makes bare `seigle germé` select the flour,
  while Québec-facing evidence also applies `Seigle Germé` to fresh living germinations. No active
  reference, alias, measure, form, recipe link, conversion, yield, or substitution was added.
- **WP04 Section O — beef bresaola:** Kept beef bresaola as a source-backed ledger-only candidate.
  A beef-only row would make bare `bresaola` resolve to beef despite one Canadian producer using the
  name for water-buffalo and turkey products. Revisit only after family-level representation or search
  disambiguation can avoid that misselection. No active reference, alias, form, measure, recipe link,
  conversion, yield, or substitution was added.

## Shared data changes

The active package now has **1,348 ingredient references** and **98 forms**. The ledger now has
**1,663 records**, **6,484 source entries**, **5,431 distinct source IDs**, and **4,521 distinct URLs**.
It retains **343 measurement observations** and **195 substitution findings**. Nineteen previously
unregistered source IDs were added; the OQLF rye-flour source and Québec germination source were reused
under existing IDs.

| Artifact | Count / state |
|---|---:|
| `ingredient-references.v1.json` | 1,348 references |
| `research-ledger.v1.json` | 1,663 records; 6,484 source entries; 5,431 IDs; 4,521 URLs |
| `BundledIngredientCatalog.kt` | 1,348 references |
| Ingredient forms | 98 forms |
| Measurement observations | 343 |
| Substitution findings | 195 |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes; SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Verification

- Bundled seed-package normalization and validation passed.
- The generated ingredient-catalog index is current.
- Research-ledger JSON Schema validation and source-ID/source-link checks passed.
- Focused ownership and picker projections confirmed the bagel spellings resolve to the new identity,
  `petit pain` remains on bread roll, bagel crisps stay unmatched, and neither held candidate enters
  the active picker.
- The manifest-ordered recipe corpus fingerprint is unchanged.
- UTF-8/no-BOM, Markdown links, and scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, or other tests were run because the active catalog changes
  add database JSON data, per the updated `AGENTS.md` rule.

See the [sprouted rye flour review](../../proposals/wp02-a7-next-flour-gap-review-20261013-round21-sprouted-rye-flour.md),
[bagel review](../../proposals/wp03-section-g-bagel-identity-review-20261013-round21.md), and
[beef bresaola review](../../proposals/wp04-section-o-bresaola-beef-product-gap-review-20261013-round21.md).
A6, Sections F, G, O, and P remain open.
