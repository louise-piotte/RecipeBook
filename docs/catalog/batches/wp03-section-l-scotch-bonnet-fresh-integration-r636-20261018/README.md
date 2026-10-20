# WP03 Section L R636 — Scotch Bonnet fresh-market form

**Status:** Accepted and integrated on 2026-10-18.

## Change

Added one `fresh` form under the existing verified `ingredient-ref-scotch-bonnet-pepper` reference: `fresh Scotch Bonnet pepper` / `piment Scotch Bonnet frais`. The existing display names and empty alias arrays remain unchanged. The form has no match terms, density, measure, or recipe link. The separate Scotch Bonnet sauce reference remains unchanged.

Added CFIA source `WP03-L-SCOTCH-BONNET-20261018-R636-S01` and one accepted fresh-form decision to the existing ledger record. The earlier OQLF and Jamaica sources remain attached to that record. No identity, measurement, or substitution research state changed.

## Evidence and scope

CFIA's 2026 report covers 854 whole fresh hot-pepper retail samples collected in 11 Canadian cities, including Québec and Montréal; Table 5 lists `Piment Scotch Bonnet` separately with 32 samples. Jamaica's Ministry of Agriculture produce manual explicitly scopes its Scotch Bonnet specification to fresh pepper. OQLF already supports the retained French and English base names. These sources support the fresh-market state only; they do not establish a general measure, density, alias, or recipe use.

- [CFIA 2026 final report](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf)
- [Jamaica Ministry of Agriculture Produce Grading Manual](https://tradeportal.moa.gov.jm/static/files/Produce-Grading-Manual.pdf)
- [OQLF GDT: piment Scotch Bonnet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037054/piment-scotch-bonnet)
- [R636 proposal](../../proposals/wp03-section-l-next-fresh-chile-gap-review-r636-20261018.md)

## Package and picker checks

The package now has 1,828 active references and 159 forms. The static picker projection retains the existing broad `Scotch Bonnet` and `pepper` behavior while exact fresh-form phrases resolve to the pepper reference. The recipe manifest still contains 114 recipes and 1,123 ingredient rows, with no Scotch Bonnet recipe line; no recipe link was added.

No software tests, build, or emulator run were needed because this change only adds database JSON data under `AGENTS.md`. Package normalization, generated-index freshness, ledger validation, picker projection, recipe scan, UTF-8, and local-link checks are recorded in the integration log.

See the [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6132), the [catalog workflow](../../ingredient-catalog-workflow.md), and the [research ledger](../../research-ledger.v1.json).
