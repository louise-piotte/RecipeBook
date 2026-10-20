# WP05 — Sukang Iloko alias and Sukang Tuba boundary review

- **Status:** Integrated the `Sukang Iloko` aliases on `ingredient-ref-cane-vinegar`; `Sukang Tuba` remains held.
- **Reviewed:** 2026-10-18.
- **Decision:** Add the borrowed regional term `Sukang Iloko` to the English and French aliases of `cane vinegar / vinaigre de canne`. Do not add `Sukang Tuba` as an alias or a separate active identity.
- **Scope:** Resolve the earlier pending Iloko alias review using government, Canadian retail, and French product-title evidence; preserve the source-qualified coconut-sap boundary for Tuba.

## Decision and boundaries

Philippine DTI identifies `sukang iloko` as the local name for Ilocano native vinegar made from naturally fermented sugarcane. A current Canadian retailer uses `Sukang Iloko Vinegar` in its product title and lists cane vinegar among the ingredients. A French manufacturer product listing pairs `Vinaigre de Canne` with `(Sukang Iloko)`, while Mama Sita’s distinguishes Sukang Iloko cane vinegar from its Sukang Tuba coconut-floral-sap vinegar and its Sinamak spiced blend. These independent naming contexts support one regional-name alias on the existing cane-vinegar identity.

The alias is stored in both locale arrays because the term appears in both English and French product-title contexts. The canonical display names remain `cane vinegar / vinaigre de canne`. Do not add the spelling `Iloco`, `sukang maasim`, or broad `sugar vinegar` as aliases. The DTI’s reported strong scent and turbid color describe its regional source context; retailer ingredients and brand formulations remain product-specific rather than defining every cane vinegar.

`Sukang Tuba` remains unresolved. The manufacturer defines its named product as coconut floral-sap vinegar, and the Philippine Consulate General in Vancouver’s publication distinguishes coconut-sap vinegar from coconut-water vinegar. Those sources do not justify mapping the broader term to every coconut vinegar, nor do they establish a Québec-facing product name. The term remains outside active aliases and references pending a tighter regional and bilingual market boundary.

The 114 bundled recipes (1,123 ingredient rows) contain no exact `Sukang Iloko` or `Sukang Tuba` ingredient line. No forms, measurements, recipe links, conversions, yields, or substitutions were added.

## Picker and ownership review

Before integration, no active reference or form owned `Sukang Iloko` or `Sukang Tuba`; the existing `Sukang Pinakurat` alias remains attached only to the product-specific Suka Pinakurat reference. After integration, an exact `Sukang Iloko` search resolves to the existing cane-vinegar row. The broader `sukang` query returns the cane-vinegar and Suka Pinakurat rows, so it remains multi-result instead of selecting one named style. Generic `cane vinegar` and `vinaigre de canne` results remain unchanged.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-SUKANG-ILOKO-R612-S01** | Philippine Department of Trade and Industry, [La Torre Iloko Vinegar of Bacarra](https://www.dti.gov.ph/dti-archives/dti-regional-archived/dti-region-1-success-stories-regional-archived/dti-la-torre-iloko-vinegar-of-bacarra-a-taste-of-ilocano-ingenuity). | Identifies `sukang iloko` as a local name for naturally fermented sugarcane vinegar; sensory description is not generalized to all cane vinegar. |
| **WP05-SUKANG-ILOKO-R612-S02** | Save-On-Foods, [UFC Sukang Iloko Vinegar](https://www.saveonfoods.com/sm/planning/rsid/918/product/ufc-sukang-iloko-vinegar-id-00014285000518). | Current Canadian product title and ingredients support the name in retail use; package/serving data are not reusable measures. |
| **WP05-SUKANG-ILOKO-R612-S03** | SIAL Paris, [Vinaigre de Canne (Sukang Iloko)](https://www.sialparis.com/fr-FR/exposants-2026/Produit/Vinaigre-de-Canne-Sukang-Iloko-MARIGOLD-MANUFACTURING-CORPORATION). | French product title pairs the borrowed term with `vinaigre de canne`; this does not claim OQLF preference or Québec retail usage. |
| **WP05-SUKANG-ILOKO-R612-S04** | Mama Sita’s, [All-Natural Vinegars Get the Spotlight at the Philippine Harvest](https://mamasitas.com/all-natural-vinegars-get-the-spotlight-at-the-philippine-harvest/). | Manufacturer distinguishes Sukang Iloko cane vinegar, Sukang Tuba coconut-sap vinegar, and its Sinamak blend. |
| **WP05-SUKANG-ILOKO-R612-S05** | Mama Sita’s, [Sukang Tuba](https://mamasitas.com/product/mama-sitas-sukang-tuba/). | Manufacturer defines its named product as naturally fermented coconut floral sap; product-specific, not a universal alias. |
| **WP05-SUKANG-ILOKO-R612-S06** | Philippine Consulate General in Vancouver, [Coconut Vinegar](https://www.vancouverpcg.org/wp-content/uploads/2020/07/coconut-vinegar.pdf). | Distinguishes coconut-water and coconut-sap vinegar and describes Sukang Tuba as coconut-inflorescence-sap vinegar; does not establish Québec naming. |

## Static checks

Exact alias ownership, R612 source-ID/URL uniqueness, search-result impact, recipe-corpus demand, ledger schema, seed-package normalization and validation, generated-index freshness, UTF-8/no-BOM, local links, and scoped whitespace checks were reviewed. No app tests, builds, or emulator checks were run for this database-JSON catalog update.
