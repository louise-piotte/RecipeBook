# WP05 — Celery-seed identity integration (2026-10-12)

## Decision

Added identity-only `celery seed / graine de céleri` for food celery seed from *Apium graveolens*
in `BAKING_AND_SPICE`. The OQLF term is singular because it is used collectively; the English and
French plural forms `celery seeds` and `graines de céleri` are source-attested search aliases.

Keep the celery plant, celery root, celery salt, ground products, celery oil, and prepared blends
separate. The bundle has no matching recipe demand, so no form or recipe link was added. Club House's
label reports `0.5 g (1/4 tsp)` for one 500 g product. That is recorded only as a product-specific
ledger observation; no general measure, density, or unit mapping was added. No conversion, yield, or
substitution was added.

## Sources

- OQLF, [`graine de céleri` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299046/graine-de-celeri): preferred French spice term, English `celery seed`, *Apium graveolens*, and the collective-singular note.
- Club House for Chefs, [English product page](https://www.clubhouseforchefs.ca/en-ca/products/club-house/celery-seed500-gr) and [French product page](https://www.clubhouseforchefs.ca/fr-ca/produits/club-house/graines-de-celeri-500-g): Canadian product identity, bilingual naming, and the brand-specific label serving.
- Savcorp, [English `Celery seeds`](https://savcorp.ca/en/products/celery-seeds) and [French `Graines de céleri`](https://savcorp.ca/products/graines-de-celeri): current Canadian and Québec-market plural product wording.

The five sources and source-specific Club House portion observation are recorded on
`ingredient-ref-celery-seed` in `docs/catalog/research-ledger.v1.json`.

## Static verification

- Reference normalization, generated-index freshness, bundled-package validation, and research-ledger
  schema validation passed.
- Exact normalized name ownership was checked across active references, forms, and legacy candidates.
  The manifest-ordered scan found no target terms in the 114 recipes or 1,123 ingredient rows.
- JSON uses UTF-8 without BOM and explicit Unicode escapes. No tests or emulator checks were run
  because this change only adds database JSON data under `AGENTS.md`.
