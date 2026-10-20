# R999 generic Khorasan-bran integration

Added identity-only `ingredient-ref-khorasan-bran` in `GRAIN_AND_CEREAL` for the bran fraction of Khorasan wheat (*Triticum turgidum* subsp. *turanicum*). The French display `son de blé khorasan` is descriptive and provisional for Québec. Keep it separate from Khorasan grain, flour, flakes, semolina, puffed wheat, and generic wheat bran.

The 2025 study supports human-food research use of one Khorasan-bran sample. Its sample preparation, lab grinding, sieve aliquots, analyses, 20% common-wheat type 00 bread formula, and formula-specific water adjustments remain source-scoped. The ledger records the trial as `blocked_pending_evidence`; no reusable measure, form, recipe link, conversion, yield, or active substitution was added. Existing Khorasan and wheat-bran entries and product-specific evidence remain intact.

This was generic ingredient research, not a commercial product roster. The queue scan found no new brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task. The Section F commercial cereal rosters and named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity.

## Static validation

- Added 1 generic reference and 1 research-ledger record; no forms or recipe links were added. Counts are now 2,014 references, 205 forms, and 2,420 ledger records. One new source ID was allocated; existing OQLF terminology source IDs were reused only for crop naming and the French milling base term.
- Reference normalization, bundled-package validation and ledger-schema checks passed. The generated Kotlin index is current at 2,014 references. New reference/source ownership checks, UTF-8/no-BOM checks, recipe-demand scan (114 recipes / 1,123 rows; zero new-name or ID hits), local links, and scoped whitespace checks passed.
- No software tests, builds, emulator checks, or deployment were run. This change adds database JSON and catalog documentation only, per `AGENTS.md`.

See the [R999 proposal](../../proposals/wp02-a7-generic-gap-review-r999-20261019.md).
