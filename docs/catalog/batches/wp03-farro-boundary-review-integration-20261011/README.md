# WP03 farro boundary review integration — 2026-10-11

## Decision

Keep unqualified `farro` as an unresolved candidate. OQLF supports the Québec French term for emmer, but TERMIUM treats it as an ethnobotanical label covering einkorn, emmer, and spelt. Current Canadian product pages show both emmer and spelt use, including different grain and flour contexts. Do not add a generic farro reference, alias, form, recipe link, measurement, conversion, yield, or substitution.

The new Canadian source is The Gourmet Warehouse's *Farro – Emmer & Spelt* listing. Its product description expressly uses farro for a product described as emmer and spelt. This is retailer-level wording, not a package ingredient declaration or universal taxonomy. It supports the unresolved boundary without determining one global identity.

## Changes

- Added `WP03-FARRO-BOUNDARY-20261011-S01` to the existing `ingredient-ref-farro` candidate in `docs/catalog/research-ledger.v1.json`, with one unresolved decision grounded in the new source and prior OQLF, TERMIUM, and Metro evidence.
- Added the focused recheck to the Section F progress list and appended this checkpoint to `roadmap.md`.
- Updated the proposal with the coordinator disposition and current integration counts: [`wp03-farro-boundary-review-20261011.md`](../../proposals/wp03-farro-boundary-review-20261011.md).
- No active references, forms, recipe links, quantities, conversions, or substitutions changed.

## Validation

- Research ledger JSON parsed and matched its schema.
- Bundled package validation, reference normalization, generated-index freshness, and recipe/name collision audit passed. The package remains at 1,030 references, 72 forms, 114 recipes, and 1,123 ingredient rows.
- The research ledger has 1,321 records, 4,299 source entries, and 3,535 distinct source IDs. The farro candidate has 15 sources and remains `needs_clarification`.
- UTF-8/no-BOM and targeted whitespace checks passed.
- No tests or emulator were run because this update only adds database JSON evidence, as specified in `AGENTS.md`.

The unresolved farro and wider Section F checklist items remain open.
