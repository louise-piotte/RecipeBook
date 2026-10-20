# WP04 Section O corned-beef scope hold — 2026-10-12

- **Status:** reviewed; no active reference integrated. The broader Section O checklist remains open.
- **Recipe demand:** the 114-recipe / 1,123-row audit found no corned-beef line. Recipe 089's `diced ham` remains on the existing ham reference.
- **Evidence:** CFIA Volume 7, Table 2, item 22, standardizes `Corned Beef / Bœuf salé` as coarsely cut, pre-cooked boneless beef treated by cooking and curing; its 21% protein requirement applies only when the product is hermetically sealed. The 1982 OQLF entry also maps corned beef to `bœuf salé` but describes salted brisket ordinarily boiled. A separate 1984 OQLF entry distinguishes Québec restaurant `bœuf salé` from canned `corned-beef`. MAPAQ's 2024 *Bottin* lists `bœuf en conserve (corned beef)` as a retail category, not a standard term or general alias.
- **Decision:** hold an active `ingredient-ref-corned-beef` row. The catalog uses `nameFr` as a search term, so an active `bœuf salé` display would match bare Québec wording that can refer to the restaurant dish. With no recipe request, there is no need to choose between CFIA's standardized French common name and OQLF's canned-product loanword. `bœuf en conserve` is not activated as an alias.
- **Ledger:** added `ingredient-ref-corned-beef` as `recordType: candidate`, `identityState: needs_clarification`, with five source records and an unresolved decision. No active reference, aliases, recipe links, forms, measurements, conversions, or substitutions were added.

## Sources

- [`wp04-cured-pork-open-gap-followup-review-20261012.md`](../../proposals/wp04-cured-pork-open-gap-followup-review-20261012.md) contains the full exact-key/recipe audit and source-to-claim register.
- The ledger record references the OQLF 1982 and 1984 GDT entries, current bilingual CFIA Volume 7, CFIA meat-labelling guidance, and MAPAQ's 2024 *Bottin*.

## Validation

- Package: 1,197 references, 86 forms, 114 recipes, 1,123 ingredient rows, and 66 legacy candidates.
- Ledger: 1,499 records, 5,048 source entries, 4,118 distinct source IDs, and 8 unit conversions.
- Seed-package normalization and validation, research-ledger schema validation, exact-name ownership and recipe-demand review, UTF-8/no-BOM, and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds a candidate record to the research-ledger JSON database.
- SHA-256: references `4d12c120489d6076127f3b797f439ebdafbe8b1db4706c46b8c6467b8b699be1`; ledger `4fcb1fc52a2387b821f5293945576d337a2e01b7e60082fea5b3816241e0ea89`.
