# WP05 Section V acidic juice identity integration

- Date: 2026-10-12
- Status: a bounded identity-and-alias tranche is integrated; broader Section V remains open.
- Review packet: [acidic juice and preparation-boundary review](../../proposals/wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md).
- Related batch: [vinegar identity integration](../wp05-section-v-vinegar-acid-integration-20261012/README.md).

## Integrated decisions

- Kept the existing lemon-juice and lime-juice references. Added English aliases `fresh lemon juice` and `fresh lime juice`; added French `jus de lime frais` to lime juice. The existing French lemon alias `jus de citron frais` remains.
- Added identity-only `verjus / verjuice` with the narrowly supported English alias `sour grape juice`. Kept this acidic juice separate from vinegar, generic grape juice, green grape juice, grape molasses, and other sour-fruit preparations.
- Added identity-only `pâte de tamarin / tamarind paste`, distinct from the existing whole-fruit tamarind identity. No aliases were needed.
- Retained pomegranate molasses unchanged. Narsharab and pomegranate-syrup wording remain unresolved.
- Kept all recipe links and rows unchanged. The 114-file audit found two fresh lemon-juice rows and one fresh lime-juice row already linked to their current references; no recipe ingredient line requested verjuice or tamarind paste.
- Added no forms, density, unit mappings, measurements, conversions, preservation instructions, or substitutions. Bottled lemon/lime subtypes, tamarind water, broad sour-grape terms, and related product boundaries remain open.

## Evidence and boundaries

- OQLF's [verjus entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503324/verjus) pairs the Québec French term `verjus` with English `verjuice` and defines the acidic juice from unripe grapes. A Québec [Racines boréales product page](https://racinesboreales.ca/products/verjus) describes pressed immature grapes, while Sadaf's [Sour Grape Juice | Verjuice](https://www.sadaf.com/collections/all-products/products/sadaf-sour-grape-juice-36-5855) supports the exact, narrowly scoped English alias. The existing vinegar ledger records the [Canadian vinegar definition](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html), keeping vinegar's acetous-fermentation category distinct. Shared culinary uses do not establish equivalence or substitution.
- OQLF's [pâte de tamarin entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423438/pate-de-tamarin) records the exact bilingual term. A Canadian [Qualifirst listing](https://odoo.qualifirst.com/fr_CA/food/hot_sauces_and_pastes/tamarind-paste-seedless-m) and [Farm Boy ingredient list](https://www.farmboy.ca/products/farm-boy-indian-style-dahl-canned-side-dish-425-g/) provide product and bilingual-ingredient corroboration. These sources do not define all paste formulations or establish conversion from whole tamarind.
- The Canadian French [ReaLemon/ReaLime product page](https://www.realemon.ca/fr/products) uses lemon/lime juice labels and fresh-juice wording. Its branded product composition and quantity comparisons were not generalized into a bottled-juice identity, conversion, or substitution.

## Data checks

The bundle contains 1,123 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 71 entries. The ledger contains 1,420 records / 4,744 source entries / 3,882 distinct source IDs / 8 unit conversions.

Seed-package validation and normalization checks passed; the generated Kotlin index is current; the research ledger validates with no errors. Exact phrase checks found one canonical owner for each added alias/name across references, forms, and legacy candidates. The recipe scan found only the three already-linked fresh citrus lines and no verjuice or tamarind-paste demand. UTF-8/no-BOM and scoped `git diff --check` passed. No tests or emulator checks were run because this change only adds or updates database JSON data, consistent with `AGENTS.md`.

Section V remains open for bottled-juice boundaries, tamarind water and other tamarind preparations, broader sour-grape products, Narsharab, and the remaining identity and terminology reviews.
