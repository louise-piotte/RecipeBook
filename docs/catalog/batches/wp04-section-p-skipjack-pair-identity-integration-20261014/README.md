# WP04 Section P — paired skipjack-tuna identity integration (R117)

Integrated on 2026-10-14. The Section P fish and seafood checklist remains open.

## Decision

Added both species in the same data change, under `PROTEIN`, with empty alias arrays, null densities, and empty unit mappings:

| Taxon | English display | fr-CA display | Reference ID |
|---|---|---|---|
| *Katsuwonus pelamis* | `Skipjack tuna (Listao)` | `Thon listao (bonite à ventre rayé)` | `ingredient-ref-katsuwonus-pelamis` |
| *Euthynnus lineatus* | `Black skipjack tuna (Listao)` | `Thonine noire (thon)` | `ingredient-ref-euthynnus-lineatus` |

These qualified displays preserve the current CFIA Fish List’s shared names without making a singleton species claim. The query `skipjack`, `skipjack tuna`, or `listao` returns both rows. The qualified queries `black skipjack tuna`, `thonine noire`, and `bonite à ventre rayé` return the intended individual row. Broad `tuna` and `thon` queries each return the six existing tuna identities plus these two rows.

The current CFIA Fish List is the name crosswalk for the pair. OQLF supports the Québec term `thonine`; CFIA supplies the full current name `Thonine Noire`. No retail product state was inferred for *E. lineatus*.

## Source-status correction and measurement boundary

The 2017 Canada Gazette Part I table cited in the R116 proposal is **proposal-era text**, not a current SFCR species-name table. Current SFCR §262 addresses flesh-colour expressions for tuna in hermetically sealed packages. The CFIA Fish List independently confirms the cross-taxon `Skipjack` / `Listao` names that drove the original picker hold.

Health Canada CNF code 3082 applies to raw fresh *K. pelamis*. Its half-fillet portion (98 g) and Food Guide portion (90 g) are retained as source-specific ledger observations on the *K. pelamis* record only. The 100 g edible-portion basis and 65% total-refuse field are not activated as catalog values or yields. No CNF measure is transferred to *E. lineatus*, canned products, or a default serving.

No forms, bundled recipe links, conversions, yields, or substitutions were added. Generic `ingredient-ref-tuna` and recipe `111#1` remain unchanged. The R116 hold proposal and README now document that the singleton hold was superseded by this pair.

See the [R117 paired-picker proposal](../../proposals/wp04-next-section-p-euthynnus-lineatus-pair-picker-review-20261014-r2.md) and [R116 boundary proposal](../../proposals/wp04-next-section-p-finfish-gap-review-20261014-r1.md).

## Verification

- Bundled reference normalization and package validation passed.
- The generated `BundledIngredientCatalog.kt` index was refreshed and its `--check` passed.
- Research-ledger schema/semantic validation passed.
- Picker projection confirmed the shared and qualified query results listed above.
- Current CFIA Fish List and SFCR §262 source wording was checked; the 2017 Gazette table is identified as proposal-era.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No app or emulator tests were run because this change adds database JSON data under the updated `AGENTS.md` rule.
