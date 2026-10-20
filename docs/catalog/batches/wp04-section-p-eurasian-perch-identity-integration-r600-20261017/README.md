# WP04 Section P R600 Eurasian perch identity integration

- **Status:** Integrated 2026-10-17.
- **Proposal:** [R600 identity review](../../proposals/wp04-section-p-eurasian-perch-identity-review-r600-20261017.md).
- **Plan anchors:** regional finfish at [lines 6421–6422](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6430) and broader Section P research at [line 14974](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15002).

## Catalog decision

Added identity-only `ingredient-ref-eurasian-perch` for *Perca fluviatilis*:

| Field | Value |
| --- | --- |
| Category | `PROTEIN` |
| English display | `Eurasian perch` |
| French display | `perche européenne` |
| English aliases | `European perch`; `European Yellow Perch` |
| French aliases | None |
| Density and unit mappings | `null` and empty |

The CFIA Fish List supports the Canadian bilingual display and the alternate English label for TSN 168470. The nearby TSN 168469 is Yellow Perch / Perchaude (*Perca flavescens*), so the two species remain separate. Keep broad `perch`, `perche`, `yellow perch`, `perchaude`, the scientific name, and unsourced `European Lake Yellow Perch` out of aliases. The Ontario product page is not linked to *P. fluviatilis* because it does not provide a binomial.

The accepted alternate label makes `yellow perch` return both separately named *Perca* species. Broad `perch` and `perche` searches also remain multi-result. The recipe corpus has no matching ingredient rows.

## Research record

The research ledger records the identity as verified, measurement research as `researched_no_supported_value`, and substitution research as `researched_no_supported_substitute`. Its sources include the CFIA results and overview, ITIS, European Commission, DGCCRF, OQLF, and an Ontario retailer page. The evidence does not support a reusable portion, density, volume mapping, package yield, form, cooking yield, or substitution. No form, measurement observation, unit conversion, recipe link, or substitution rule was added.

## Verification

The active reference and ledger JSON are checked with the bundled package, generated-catalog, and research-ledger static validators. No app tests, build, emulator run, or deployment are required for this database-JSON-only addition under `AGENTS.md`.
