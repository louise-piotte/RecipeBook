# WP02 Section 04 B3 R266 — pregelatinized potato starch integration

Integrated the [R266 review proposal](../../proposals/wp02-next-open-b2-b3-gap-review-r266-20261016.md).

## Decision

Added `ingredient-ref-pregelatinized-potato-starch` as an identity-only `FLOUR_AND_STARCH` reference for `pregelatinized potato starch / fécule de pomme de terre prégélatinisée`. The English aliases are `pre-gelatinized potato starch`, `pregelatinised potato starch`, and the manufacturer wording `pregelatinized potato-based starch`. The French search alias `amidon de pomme de terre prégélatinisé` combines OQLF terminology for pregelatinized starch and potato starch; the French display remains provisional pending a Québec package with the complete phrase.

Keep the new identity separate from ordinary potato starch, modified potato starch, raw unmodified potato starch, and whole-potato flour. The generic terms `instant`, `precooked`, `cold-water-soluble`, and `native` are not assigned as aliases. The separate pregelatinized whole-potato-flour candidate remains held because the reviewed supplier evidence is not a current Canadian/Québec food product with a validated French display.

## Measures, substitutions, and recipe demand

Ingredion's specification identifies a coarse powder and a 55 lb bag, and a Canadian retailer lists a 25 kg SKU that displayed sold out. These are product/package facts, not household measures. No density, unit mapping, form, recipe link, conversion, yield, or substitution was added. The ledger records the completed measurement and substitution searches as `researched_no_supported_value` and `researched_no_supported_substitute`, with empty observations and findings.

The manifest-listed bundle has 114 recipes and 1,123 ingredient rows. The proposal's normalized corpus scan found no matching candidate name or existing potato flour/starch link; no recipe links were added.

## Integration record

- Added one ingredient reference and one verified research-ledger record. Reused existing ledger source IDs for the OQLF pregelatinized-starch entry, OQLF potato-starch entry, and CFIA common-name entry. Registered three new source IDs: R266 S01 for Ingredion, S05 for the Canadian retailer, and S06 for FAO product-boundary evidence.
- Updated the Section 04 B3 checklist, plan log, roadmap, and proposal status. Broader WP02 B2/B3 coverage remains open.
- Static seed-package normalization/validation, generated-index freshness, ledger schema/source-ID linkage, source-ID-to-URL ownership, picker projection, recipe-corpus, UTF-8/no-BOM, escaped seed Unicode, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run. The change only adds database JSON data under the current `AGENTS.md` rule.

## Source register mapping

| Proposal source | Ledger source ID used | Purpose |
|---|---|---|
| S01 | `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S01` | Ingredion product identity and Canadian label wording |
| S02 | `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S03` | OQLF generic pregelatinized-starch terminology (reused) |
| S03 | `WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S01` | OQLF potato-starch terminology (reused) |
| S04 | `WP02-B3-MODIFIED-POTATO-STARCH-20261014-R96-S01` | CFIA starch versus modified-starch common-name rule (reused) |
| S05 | `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S05` | Canadian 25 kg retailer listing and sold-out status |
| S06 | `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S06` | FAO whole-potato-flour versus extracted-starch boundary |
