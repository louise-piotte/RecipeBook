# R1011 generic mutton identity integration

**Date:** 2026-10-19  
**Status:** Integrated  
**Scope:** One generic ovine-meat identity.

## Integrated data

Added identity-only `mutton / mouton` as a `PROTEIN` reference. The OQLF food-domain term and CFIA meat-cuts definition support the bilingual name and the Canadian boundary between lamb and mutton. Mutton remains distinct from `lamb / agneau`; the 75 g cooked Food Guide observation applies only to the lamb row and was not copied. No aliases, forms, measures, recipe links, density, unit mappings, conversions, yields, or substitutions were added.

The 114 bundled recipes (1,123 ingredient rows) contain no mutton or mouton line. The existing ground-lamb option in recipe 078#3 remains on the ground-beef row. Existing plant names containing “lamb,” sheep milk, and charqui stay unchanged.

## Cross-category scope

This was a generic culinary identity review. No brand, commercial product, product line, flavour family, SKU, or retailer-variant work was pursued. Commercial-only roster counts remain out of scope because they do not add ingredient diversity. Existing branded rows and their source ownership remain intact; no source-specific value was generalized.

## Data checks

- Bundled references: 2,025 (up from 2,024).
- Ingredient forms: 205 (unchanged).
- Research ledger: 2,431 records (up from 2,430).
- Legacy candidates: 55 (unchanged).
- Recipe corpus: 114 manifest-listed files and 1,123 ingredient rows (unchanged).
- Bundled package validation passed; the research-ledger schema and source linkage have zero errors; the generated Kotlin catalog is current at 2,025 references. Exact `mutton` and `mouton` ownership belongs only to the new identity, with no matching form, legacy candidate, ledger ID, or recipe row.
- UTF-8/no-BOM passed for the changed documentation and data files; 2,724 local Markdown targets resolve; `git diff --check` passed.
- Software tests, builds, emulator checks, and deployment: not run; this change only adds database JSON data under `AGENTS.md`.

See the [R1011 proposal](../../proposals/wp04-section-o-generic-mutton-identity-review-r1011-20261019.md) and the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).
