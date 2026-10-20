# WP04 Section P R256 — Smoked Sardine Fillets Integration

- **Status:** Integrated one species-neutral `PROTEIN` reference.
- **Review date:** 2026-10-16.

## Integrated identity

| English display | French display | Aliases | Category |
|---|---|---|---|
| `smoked sardine fillets` | `filets de sardines fumés` | `golden smoked sardine fillets`; `filets de sardines fumés dorés` | `PROTEIN` |

The identity represents a finished smoked-fillet market group. It does not assign a fish taxon, universal smoking process, or common formula. Keep it separate from the canned-sardine group, raw sardine species, herring products, and Brunswick's unresolved Kippered sardine product. No form was added to any fish species or the canned-sardine reference.

## Source-specific observations

The ledger records Brunswick's 1 can drained (80 g) Nutrition Facts basis, Metro's 92 g package listing for the matching UPC, and Wild Canadian Seafood's 180 g product format as separate package observations. They do not establish a shared can size, a drained yield from package mass, density, or reusable kitchen measure. The active reference has null density and empty unit mappings.

No forms, active conversions, generalized yields, recipe links, or substitutions were added. Brunswick and Metro show different ingredient panels for the same product listing; neither is generalized into a shared formula.

## Picker and recipe-corpus audit

Phrase-first projection returns this row for `smoked sardine fillets`, `filets de sardines fumés`, `golden smoked sardine fillets`, and `filets de sardines fumés dorés`. Broad `sardine` and `sardines` queries remain multi-result. `canned sardines` and `sardines en conserve` remain on the canned-sardine row. `smoked sardines` and `sardines fumées` remain unassigned.

French search normalization removes accents but preserves grammatical endings. The display has masculine `fumés`, agreeing with `filets`; the broader `sardines fumées` uses feminine agreement, so it is not an exact phrase in the display. This keeps the broader wording unassigned even though Nice Cans uses it for a product whose listing does not state a fillet cut.

The manifest-listed bundle contains 114 recipes and 1,123 structured ingredient rows. It has no matching sardine, smoked-fillet, or direct reference demand.

## Sources and static checks

The [R256 proposal](../../proposals/wp04-section-p-gap-review-r256-20261016.md) contains the source register, ownership audit, product boundaries, and measurement limits. It also distinguishes the existing shared OQLF / CFIA / Brunswick FAQ sources from the R154 proposal-only Kippered page source ID reused for this record.

Static checks passed for bundled seed-package normalization and validation, generated-index freshness, research-ledger schema and source ID/URL consistency, exact ownership, picker projection, recipe corpus, UTF-8/no-BOM, local links, and scoped whitespace.

Totals: **1,651 references**, **125 forms**, and **1,999 ledger records / 8,749 source entries / 7,413 distinct source IDs / 6,182 distinct source URLs**; 114 recipes / 1,123 ingredient rows.

No software tests, emulator checks, or deployment were run because this batch adds database JSON data and its generated catalog index. Broader Section P product-state and species coverage remains open.
