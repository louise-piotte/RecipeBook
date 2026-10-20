# WP03 Section I pistachio butter integration — 2026-10-11

## Accepted data

- Added `ingredient-ref-pistachio-butter` as `pistachio butter / beurre de pistache`, category
  `FAT_AND_OIL`, with empty aliases, null density, and no unit mappings.
- Kept the new butter identity separate from `ingredient-ref-pistachio-paste` and
  `ingredient-ref-pistachios`. No form, recipe link, measure, yield, conversion, or substitution was
  added.
- Added current product-name evidence from a Québec maker and a Canadian maker. A third,
  manufacturer-specific FAQ distinguishes its own pistachio butter and paste by particle size,
  texture, and use; that description is not generalized into a universal product specification.
- Added one Callebaut Canada source to the existing pistachio-paste ledger record and verified its
  identity. Its product formulation and uses remain source-specific. The existing recipe links
  `056#7` and `056#16` remain unchanged.
- The full bundled recipe audit found no ingredient line requesting pistachio butter. Existing
  pistachio-paste, pistachio-kernel, and other nut/seed butter lines remain unchanged.

## Evidence and held boundaries

- `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S01`: [Mille et Une Noix, Beurre de pistache](https://www.milleetunenoix.ca/products/pistachio-butter), current Québec product title and maker listing.
- `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S05`: [Nuts to You, Pistachio Butter Smooth](https://nutstoyou.ca/products/pistachio-butter-smooth/), current Canadian product title and ingredient listing.
- `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S07`: [The Pistachio Factory FAQ](https://pistachiofactory.com/pages/faq), one maker's distinction between its butter and paste products; not a universal definition.
- `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S06`: [Callebaut Canada, Pure Pistachio Paste / Pâte de pistache pure](https://www.callebaut.com/en-CA/products/callebaut/nuts-pure-pistachio-paste/NPO-PI1-2B-18A), bilingual product naming and source-specific composition/use evidence for the existing paste identity.

Generic or mixed nut/seed butter, hemp-seed butter, generic sesame paste/butter, black-sesame paste,
and unqualified pistachio cream/spread remain held. No source establishes a general butter-to-paste
equivalence or a universal product formula.

## Structural validation

- Final package: 1,088 ingredient references, 79 forms, 114 recipe files, and 1,123 ingredient rows.
- Research ledger: 1,387 records, 4,617 source entries, and 3,777 distinct source IDs.
- Ingredient-reference normalization completed; bundled-package normalization changed no package
  parts; bundled-package and research-ledger validation passed.
- Generated ingredient catalog is current at 1,088 entries.
- UTF-8/no-BOM and scoped whitespace checks passed.
- No app tests or emulator run were performed because this change only adds database JSON data, as
  specified by `AGENTS.md`.

## Fingerprints

| Artifact | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `9a819e2907e200f347938780134816bd6d8d013e651f1960985cb3b5d78dc385` |
| `ingredient-forms.v1.json` | `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| `research-ledger.v1.json` | `9300cacb81e4c2f225ca829fc1f15b603f31100cc243160c821594bb62c69c93` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | `aaf68a63440c40507fcf192bfee00e4928ff5e2ff369d8d1d0859f53348c5988` |
