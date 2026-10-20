# WP04 R906 — Fish heads integration

Integrated 2026-10-19. Added one generic culinary fish-part identity and reviewed the cross-category research queue.

## Decision and source scope

Added identity-only `fish heads / têtes de poisson` (`ingredient-ref-fish-heads`) as `PROTEIN`, with singular aliases `fish head` and `tête de poisson`. The bilingual Metro recipe supports using fish head with bones for fish stock; its English `1 fish head and bones` quantity is composite and recipe-specific, while its French ingredient list renders a whole fish. The Northwest Territories French traditional-food guide independently names fish heads and describes a chowder use.

Recorded the guide’s `Tête de corégone, cuite (75 g)` item as a `published_portion` observation for cooked whitefish head only. It is not an individual head mass or a generic fish-head portion. No default density, unit mapping, conversion, generic measure, form, recipe link, yield, or substitution was added. No bundled recipe ingredient row matched.

Existing fish species, fish stock, fish balls, fish tofu, and other seafood identities remain unchanged. Existing branded rows and measurements remain intact; no product-specific data was transferred.

## Queue review

No new brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task was found. The two Section F cereal-roster clauses and further research on Anson Mills’ named wheat-meal product remain out of scope because commercial-product counts do not add ingredient diversity. Generic cereal diversity and generic wheat-meal evidence remain open. The current collaboration list had no running subagents.

## Validation

- Seed reference and package normalizers completed; the package normalizer reported zero additional part changes after reference normalization.
- Research-ledger schema and package validation passed.
- Generated Kotlin ingredient catalog is current at 1,934 references.
- Unique reference ID, source IDs and URLs, exact picker phrases, and source ownership checked.
- Static picker projection resolves `fish heads`, `fish head`, `têtes de poisson`, and `tête de poisson` to the new row; existing exact queries for `fish stock` and `fish balls` retain their previous owners.
- All 114 manifest-listed recipes and 1,123 ingredient rows were scanned; no fish-head match was found.
- JSON remains ASCII with French accents escaped; modified files are UTF-8 without BOM. Local links and scoped whitespace checked.

No software tests, build, emulator, or deployment were run. This change only adds ingredient database JSON, covered by the JSON-only testing exception in `AGENTS.md`.

See the [R906 proposal](../../proposals/wp04-generic-fish-heads-identity-review-r906-20261019.md) and [generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md).
