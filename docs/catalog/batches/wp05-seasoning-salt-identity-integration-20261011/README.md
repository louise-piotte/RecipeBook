# WP05 seasoning salt identity integration

## Decision

Added identity-only `seasoning salt / sel aux épices`, with English alias `seasoned salt` and French
alias `sel épicé`. OQLF lists both French terms as preferred and discourages `sel assaisonné`; its
1982 composition note was not adopted as a current generic formula. Current Club House pages use
bilingual salt-blend terms and show that brand formulations vary.

Kept plain salt, garlic salt, celery salt, brand-specific products, MSG status, and other seasoning
blends separate. The bundled recipes have no direct seasoning-salt line; recipe 019’s garlic-salt line
remains unchanged. Added no density, unit mapping, recipe link, form, package yield, conversion, or
substitution.

Sources: [seasoning-salt review](../../proposals/wp05-seasoning-salt-mixture-boundary-review-20261011.md),
[OQLF terminology](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095247/sel-aux-epices),
[Club House English](https://www.clubhouseforchefs.ca/en-ca/products/club-house/seasoned-salt10-kg),
[Club House French](https://www.clubhouseforchefs.ca/fr-ca/produits/club-house/sel-assaisonne-10-kg),
[Lawry’s French](https://www.clubhouseforchefs.ca/fr-ca/produits/lawrys/sel-epice-lawrys-11-kg).

## Files and verification

Updated the reference JSON, generated Kotlin search index, research ledger, global plan, and roadmap. The
package has 1,035 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,327
records / 4,341 source entries / 3,574 distinct source IDs.

Package normalization and validation, reference normalization, generated-index freshness, research-ledger
schema validation, exact collision and recipe-demand checks, UTF-8/no-BOM, whitespace, and scoped
`git diff --check` passed. No tests or emulator were needed for the database JSON addition.
