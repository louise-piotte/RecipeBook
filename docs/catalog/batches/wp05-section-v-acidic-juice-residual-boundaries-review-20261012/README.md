# WP05 Section V — residual acidic-juice boundaries

- **Date:** 2026-10-12
- **Status:** bounded boundary review complete; non-current product states remain held until exact demand.
- **Scope:** lemon/lime concentrate and bottled-product boundaries, tamarind water and related liquids, and unripe-grape products beyond verjuice.

## Decision

Keep the current lemon and lime juice owners and aliases. Their `from concentrate` / `reconstituted` wording refers to same-fruit juice restored with water. Water-removed concentrate is a separate product state; represent it as a concentrated form under the matching juice identity only if a recipe names it. Do not alias it to ready-to-use juice or add a household dilution ratio.

Keep generic bottled citrus wording and brand names out of global aliases. ReaLemon/ReaLime describes its own products as same-fruit concentrate restored with filtered water, with sulfites and peel oil listed; its fresh-juice comparison is product-specific.

Hold tamarind water, juice/drink wording, and commercial extract/concentrate as separate preparations from tamarind fruit and tamarind paste. `eau de tamarin` is source-attested French wording but was not verified as an OQLF/Québec preferred term. Hold whole unripe grapes, processed koruk sour, dried sour-grape preparations, and reductions separately from the existing verjuice identity. The current `sour grape juice` alias remains limited to acidic juice explicitly pressed from unripe grapes.

The manifest audit found 13 juice-word rows: eight lemon-juice rows, two lime-juice rows, two maraschino-jar-juice rows, and one unlinked `vinegar or lime juice` alternative. None names bottled or concentrated citrus, tamarind water/juice/extract, whole unripe grapes, koruk sour, sour-grape powder, or sour-grape reduction. Keep every recipe row and link unchanged.

## Catalog and recipe effects

- No catalog references, forms, aliases, measurements, or recipe links changed.
- Existing same-fruit reconstituted aliases and the verjuice/sour-grape-juice alias remain as they are.
- No density, conversion, package yield, storage instruction, preservation guidance, or substitution was added.
- The bounded review is complete; revisit a held product state when an exact recipe or product supplies demand and naming evidence. Generic juice, nectar, and broader Section V coverage remain open.

## Current review snapshot

- 1,190 ingredient references / 86 forms / 66 legacy candidates.
- 114 manifest-listed recipes / 1,123 ingredient rows.
- 1,491 research-ledger records / 4,983 source entries / 4,066 distinct source IDs / 8 unit conversions; ledger SHA-256: `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914`.
- Recipe-corpus SHA-256: `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`.

## Sources and handoff

The [proposal packet](../../proposals/wp05-section-v-acidic-juice-residual-boundaries-review-20261012.md) records the source register, exact row owners, scoped terminology, and numeric/safety limits. Current Canadian standards distinguish named-fruit concentrate from same-fruit reconstituted juice; the [OQLF lemon-concentrate entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18968393/jus-de-citron-concentre) supplies Québec French wording. [ReaLemon/ReaLime](https://www.realemon.ca/fr/products) describes its own product formulation and claims only. Health Canada canning and CFIA unpasteurized-juice guidance apply to their stated processes; neither establishes shelf stability for tamarind water or every bottled citrus product.

This was a documentation-only review. No tests or emulator checks were needed.
