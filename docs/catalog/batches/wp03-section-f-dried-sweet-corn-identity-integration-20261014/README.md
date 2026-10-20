# WP03 Section F R112: dried sweet corn identity

## Disposition

Added identity-only `dried sweet corn kernels / maïs sucré séché` as
`ingredient-ref-dried-sweet-corn-kernels` in `VEGETABLE_AND_AROMATIC`. Aliases are empty;
density is null and unit mappings are empty. The row has no form, active measure, recipe link,
conversion, cooking yield, or substitution.

The sweet-corn kernel boundary remains distinct from field corn, hominy, grits, and milled corn.
The manifest-listed recipe corpus has no matching demand. The Augason Farms 1/2 cup (19 g) figure
is retained only as a product-specific portion observation in the research ledger. Nayi et al.'s
rehydration ratios stay source notes: their ranges depend on blanching treatment, and the article's
conclusion conflicts with its steam-blanch results. No reusable rehydration or cooking value was
activated.

## Evidence

- [CFIA maize biology, French edition](https://inspection.canada.ca/fr/protection-vegetaux/varietes-vegetales/caracteres-nouveaux/demandeurs/directive-94-08/documents-biologie/zea-mays-lmais) distinguishes sweet corn from dent, floury, and popping corn.
- [OQLF: maïs sucré](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082787/mais-sucre) supports the Québec base term. [HarvestGuide Canada's French guide](https://www.harvestguide.ca/fr/blog/how-to-dehydrate-corn-canada/) uses `maïs sucré séché` for dried kernels and keeps grain corn separate.
- [Nayi et al. (2023)](https://onlinelibrary.wiley.com/doi/full/10.1002/fsn3.3303) studies treatment-specific sweet-corn rehydration; values were not generalized.
- [Total Prepare Canada's Augason listing](https://totalprepare.ca/products/augason-farms-freeze-dried-sweet-corn) reports its product-specific 1/2 cup (19 g) dry serving. A [Canadian French Walmart listing](https://www.walmart.ca/fr/ip/Ma-s-sucr-lyophilis-br-bo-te-de-conserve-no-10-Nutristore/6000199988644) uses `maïs sucré lyophilisé` for a whole-kernel product.
- [OQLF: maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive) and [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais) support keeping hominy and milled corn outside this identity.

The proposal contains the full source table, corpus scan, numeric limits, and the corrected account of
the Nayi paper's internal discrepancy: [R112 proposal](../../proposals/wp03-section-f-dried-sweet-corn-identity-review-r112-20261014.md).
The [research ledger](../../research-ledger.v1.json) records the sources, accepted identity, and
product-specific portion observation.

## Static checks

Package validation, reference normalization, ledger schema/reference checks, generated-index
freshness, search-key ownership, picker projection, recipe scan, UTF-8/no-BOM, links, and whitespace
were checked. No app tests or emulator checks were run because the change only adds database JSON
data and its generated catalog entry, under the updated `AGENTS.md` rule.

Section F remains open.
