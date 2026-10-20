# WP05 mango and lime pickle identities

- Integrated: 2026-10-08; coordinator-owned canonical merge.
- Status: two identity-only records integrated; wider pantry and regional checklist remains open.
- Inputs: WP05 Section Y proposal and direct review of Patak's Canada English/French product pages plus OQLF terminology.
- New rows: ingredient-ref-mango-pickle (mango pickle / marinade de mangue) and ingredient-ref-lime-pickle (lime pickle / marinade de lime).
- The manufacturer names each as a distinct Indian-style pickle; OQLF defines Québec French marinades as preserved fruits or vegetables in salted, spiced vinegar and gives English pickles. The product-specific French titles are retained.
- Mango pickle stays separate from sweet mango chutney and fresh mango; lime pickle stays separate from mango pickle and fresh lime. No spelling aliases or generic formulations are inferred.
- Both use SAUCE_AND_CONDIMENT; no forms, density, unit mappings, package yields, measurement observations, conversions, or substitutions were added.
- Sources: [Patak's Mango Pickle](https://pataks.ca/products/mango-pickle), [Patak's Marinade de mangue](https://pataks.ca/fr/products/mango-pickle), [Patak's Lime Pickle](https://pataks.ca/products/lime-pickle), [Patak's Marinade de lime](https://pataks.ca/fr/products/lime-pickle), [OQLF, marinades](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095319/marinades).
- Validation: 9 Python package tests and 274 Android unit tests passed; generated index and normalizer checks pass; git diff --check is clean. Recipe-text audit across 114 bundled recipes found no matching pickle terms.
