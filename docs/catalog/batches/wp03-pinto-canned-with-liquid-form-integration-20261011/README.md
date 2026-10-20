# WP03 pinto canned-with-liquid form integration — 2026-10-11

## Decision

Add `ingredient-form-pinto-beans-canned-with-liquid` to the pinto-bean reference and link it only to recipe `007#4`. The recipe source explicitly says to add the whole can with its liquid. Unico lists a current 540 mL pinto product, and Metro’s same-SKU English and French pages identify that product’s ingredients as pinto beans, water / eau, salt, calcium chloride, and disodium EDTA. Those product pages establish an example, not the can used by the recipe.

## Changes

- Added the bilingual canned-with-liquid form and its scoped picker terms.
- Added only the form ID to recipe line `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-4` in `007#4`.
- Preserved the original recipe text and the existing one-can `CAN` / `NET_CONTENTS` package amount. Did not infer brand, size, packing medium, bean mass, density, can yield, or substitution.
- Added a four-source form record to the research ledger and marked the focused form review complete in the Section H plan.

The full source map and pre-integration corpus audit are in [`wp03-section-h-next-open-pulse-product-review-20261011.md`](../../proposals/wp03-section-h-next-open-pulse-product-review-20261011.md).

## Verification

- Bundled package normalization check and validation passed.
- The new form is attached only to `007#4`; its existing quantity, unit, text, and package amount are unchanged.
- Research-ledger schema validation passed with 1,320 records, 4,291 source entries, and 3,527 distinct source IDs; the new form record has four unique sources.
- Reference normalization and generated Kotlin catalog freshness checks passed; reference count remains 1,029.
- UTF-8/no-BOM, escaped-Unicode, and targeted whitespace checks passed.
- No tests or emulator run under the current `AGENTS.md` data-only rule.

Current package: 1,029 references / 72 forms / 114 recipes / 1,123 ingredient rows. SHA-256: research ledger `92cf8b08b1a7e70a5d4e38ceed67170d46ffc2d0969761f662ba569ad8f873b0`; forms `22688dde53382446d17da625d85c8c89648e9d4ff160202efa95b297482d0d05`; recipe 007 `acd452238703923ca29e031d7cd9185349981f86037f01cc85a923aa29417de8`.
