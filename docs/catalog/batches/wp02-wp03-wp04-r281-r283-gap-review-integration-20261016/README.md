# WP02 / WP03 / WP04 R281–R283 gap review integration

## R281 — Whole barley flour

Updated the existing whole-barley-flour research-ledger record. Measurement research now records that no reusable measure is supported. General wheat-flour replacement remains blocked pending recipe-specific evidence.

The Whole Grain Stamp's 40 g figure is whole-grain content per serving; GoBarley's 37 g measure is for pearled-barley flour; its whole-barley pancake recipe gives volume without mass. The reviewed baking studies test specific formulas and do not establish a transferable replacement ratio. No measurement observation, density, mapping, form, conversion, yield, recipe link, or active substitution rule was added.

## R282 — Dried curry leaves

Added dried curry leaves / feuilles de cari séchées as the dried form under the existing curry-leaf identity. The form recognizes exact dried and freeze-dried wording, including feuilles de cari lyophilisées. Whole dried leaves remain distinct from fresh leaves, ground leaf, curry powder, and curry paste.

Added a form-level ledger record. Canadian and Québec product quantities remain SKU-specific. No measure, density, conversion, rehydration ratio, yield, recipe link, or substitution was added.

## R283 — Goat milk

Added identity-only goat milk / lait de chèvre in DAIRY_AND_ALTERNATIVE, with goat's milk as its only alias. The record remains separate from goat meat, cow milk, fat classes, and processed goat-milk products. No form, density, unit mapping, measurement, conversion, yield, recipe link, or substitution was added.

## Checklist and roadmap

Added checked child items under WP02 Section A, WP03 Section K, and WP04 Section Q. The broader sections remain open. The roadmap records this integration.

## Verification

Static checks passed:

- Bundled seed package validation and normalization check.
- Ingredient-reference normalizer check and generated Kotlin index freshness check.
- Research-ledger schema validation and source-ID-to-URL ownership checks for the integrated records.
- Picker projection: goat milk, goat's milk, and lait de chèvre each return the goat-milk identity; goat and chèvre return goat meat and goat milk. Dried curry-leaf phrases return the existing curry-leaf identity with its form hint. Curry powder remains on its own identity; the six current curry-paste results do not include curry leaves.
- Manifest-listed corpus scan: 114 recipes and 1,123 ingredient rows; no matching barley, curry-leaf, or goat-milk ingredient rows.
- UTF-8, no-BOM, escaped-Unicode database JSON, local-link, and scoped whitespace checks.

Totals after integration: 1,660 ingredient references, 126 forms, and 2,009 research-ledger records / 8,833 source entries / 7,476 distinct source IDs / 6,239 distinct URLs; 114 bundled recipes / 1,123 ingredient rows.

No software tests, builds, or emulator checks were run. The active catalog changes add database JSON data; the generated index was refreshed from the canonical references.

## Proposals

- [R281 whole-barley-flour measurement and substitution review](../../proposals/wp02-a4-whole-barley-flour-measurement-substitution-review-r281-20261016.md)
- [R282 dried curry-leaf form review](../../proposals/wp03-section-k-curry-leaves-dried-form-review-20261016.md)
- [R283 goat-milk identity review](../../proposals/wp04-section-q-goat-milk-identity-review-20261016.md)
