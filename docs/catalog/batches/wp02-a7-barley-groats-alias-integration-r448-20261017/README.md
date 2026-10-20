# WP02 Section A7 R448 barley-groats alias integration

Integrated on 2026-10-17 after root review of the [R448 proposal](../../proposals/wp02-section-a7-barley-groats-alias-review-r448-20261017.md).

## Decision

Added the English alias `barley groats` to the existing `ingredient-ref-hulled-barley` reference. The Canadian mill page explicitly uses it for barley with only the tough outer husk removed, and the Canadian retail listing “Kupiec Groats, Hulled Barley” identifies its ingredient as hulled barley groats. The CBSA tariff defines groats as fragmented cereal products within its heading 11.03 classification; this is tariff terminology, not a universal food-labeling rule. That boundary supports keeping the alias narrow and keeping `barley grits / gruau d'orge` separate.

Kept the display `hulled barley / orge mondé`, existing aliases, null density, empty unit mappings, and unresearched measurement/substitution states unchanged except for the new English alias and its update date. No French alias, new identity or candidate, form, measure, recipe link, conversion, yield, or substitution was added. The full 114-recipe / 1,123-row bundle has no matching demand.

## Validation

- Added three new source entries to the existing hulled-barley ledger record; no new ledger identity record was created.
- Reference count remains **1,740**, forms remain **141**, ledger remains **2,099 records**, and source entries increase from **9,540** to **9,543**.
- Bundled package normalization and ledger schema/ownership validation passed. The generated Kotlin index is current at **1,740 references**.
- No app tests, build, emulator check, or deployment was run because the active data change only updates database JSON under `AGENTS.md`.

The broader WP02 Section A7 review remains open for other grain meals and milling products.
