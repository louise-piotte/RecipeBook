# WP02/WP03/WP05 R984–R986 generic ingredient integration

Reviewed and integrated on 2026-10-19. The work covers three generic gaps across grain milling, fruit, and named preserved foods. Existing commercial-product entries and their evidence remain intact.

## Dispositions

- **R984, barley meal:** kept `candidate-barley-meal` in `needs_clarification` and appended one bounded eCFR source plus an unresolved decision. The U.S. soluble-fiber health-claim section defines barley meal as unsifted ground barley grain with bran, germ, and endosperm retained, and names sieved barley meal separately. This regulatory definition does not resolve general consumer identity, grind boundary, Québec French display, or overlap with whole barley flour. No active ingredient reference or data behavior was added. Existing candidate sources and decisions remain intact.
- **R985, caimito:** added identity-only `caimito / caïmite` in `FRUIT`, with the source-attested `star apple` and `pomme de lait` aliases. Kept it separate from star fruit/carambole, sapote, and sapodilla. The French fruit terms are documented by Espace pour la vie but are not represented as OQLF-standardized. No forms, measures, recipe links, conversions, yields, or substitutions were added.
- **R986, yeolmu-kimchi:** added identity-only `yeolmu-kimchi / yeolmu-kimchi` in `SAUCE_AND_CONDIMENT`, with narrow English spelling/name aliases and no French aliases. Kept the provisional French display, and preserved the generic kimchi, other named kimchi types, fresh radish, and pickled-radish identities. Study fermentation results and the tourism page’s preparation details remain source-scoped. No forms, measures, recipe links, conversions, yields, or active substitutions were added.

## Cross-category scope and preservation

The open-plan scan found no new item whose only deliverable was a commercial brand, product-line, flavour-family, SKU, or retailer-variant roster. Previously dispositioned Section F commercial cereal rosters and the named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity. Generic parent gaps remain open across ingredient categories.

Existing branded entries and product-specific claims or measurements were not deleted, merged, or generalized. Manufacturer pages remain usable when their evidence supports a generic ingredient claim. Any transfer of product-specific evidence requires a separate review of whether it is genuinely transferable.

## Validation

Static package normalization and validation, reference normalization, ledger schema validation, generated-catalog freshness, new ID/source links, recipe-demand checks, UTF-8/no-BOM, local links, and scoped whitespace checks passed at **2,003 references, 205 forms, 55 legacy candidates, 2,408 ledger records, and 114 recipes / 1,123 ingredient rows**. Seven new source IDs were allocated across the three reviews; R984 adds a source to an existing candidate and creates no ledger record. No software tests or builds were run because the app changes only add ingredient database JSON under `AGENTS.md`.

See the [R984 proposal](../../proposals/wp02-a7-generic-gap-review-r984-20261019.md), [R985 proposal](../../proposals/wp03-generic-gap-review-r985-20261019.md), and [R986 proposal](../../proposals/wp05-generic-gap-review-r986-20261019.md).
