# WP04 Section P R637 — Northern searobin identity integration

- **Status:** Integrated 2026-10-18.
- **Proposal:** [R637 review](../../proposals/wp04-section-p-next-regional-fish-gap-review-r637-20261018.md).
- **Plan anchor:** Broad finfish and regional fish at [the Section P checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6536).

## Catalog decision

Added identity-only `ingredient-ref-northern-searobin` for *Prionotus carolinus*:

| Field | Value |
| --- | --- |
| Category | `PROTEIN` |
| English display | `Northern searobin` |
| Québec French display | `grondin` |
| Aliases | None |
| Density and unit mappings | `null` and empty |

OQLF fiche 1199013 explicitly ties the normalized Québec fish-product term `grondin` to *P. carolinus* and lists `northern searobin` among its English translations. DFO species code 800 independently pairs the species with `northern searobin / prionote du nord`; the latter remains taxonomic evidence and was not added as a picker alias because OQLF excludes `prionote` from its Québec commercial context.

CFIA lists `Searobin` and `Gurnard / Grondin` at *Prionotus* genus scope and uses Gurnard / Grondin for additional taxa. Keep these broad labels as search-scope context. The active row does not claim the genus or add broad aliases. The separate Houbou menu phrase `Sea Robin` remains outside the row; no spaced alias was added. The 114-recipe corpus has no matching demand.

## Research record

The research ledger records the identity as verified. Measurement and substitution research remain `not_yet_researched`; no supported measurement observation, recipe behavior, or substitution was established by this identity review. The record has no form, measurement observation, recipe link, conversion, yield, or substitution finding. It includes the CFIA genus-scope result, DFO species-code report, and OQLF generic and species-specific terminology evidence. The shared CFIA overview source ID was reused; the same DFO Atlantic-coast book URL was not duplicated.

## Verification

Static package normalization and generated catalog freshness passed; the generated index contains 1,829 references. Ledger schema and source-ID checks, source ownership, picker projection, the 114-recipe / 1,123-row scan, local links, UTF-8/no-BOM, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were needed for this database-JSON-only update under `AGENTS.md`.
