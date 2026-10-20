# WP05 Section V water, sparkling water, and ice integration — 2026-10-12

## Catalog decisions

- Verified existing `ingredient-ref-water` (`water / eau`) using Canadian/French packaged-water common-name guidance. Its measurement state remains blocked; no water form or numeric behavior was added.
- Added identity-only `ingredient-ref-sparkling-water` as `sparkling water / eau pétillante`, category `SAUCE_AND_CONDIMENT`. Its aliases are French `eau gazeuse`, `eau gazéifiée`, `eau de Seltz` and English `carbonated water`, `soda water`, `seltzer water`, `seltzer`. OQLF terminology and the Canadian common-name rules support these terms for plain water containing dissolved carbon dioxide.
- Kept bare `soda` out because OQLF records both carbonated-water and sweetened-drink senses. Club soda remains a held candidate: the reviewed Canada Dry SKU includes potassium bicarbonate and citrate, but one product does not establish every formula. Tonic and flavoured/sweetened drinks remain separate.
- Kept source-defined mineral/spring water distinct from general sparkling water. Plain water remains separate from sparkling water and all stocks/broths.
- Held standalone ice and water-form modeling. Two recipe lines say `ice water` and already link to water; other mentions are process/equipment wording. No recipe row calls for a standalone ice ingredient. Added no ice reference or water form.

## Recipe and numeric data

The all-recipe scan found 21 linked water rows and no sparkling-water or standalone-ice ingredient rows. All recipe links remain unchanged. No forms, measurements, densities, unit mappings, conversions, yields, or substitutions were added.

The package has 1,152 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,448 ledger records / 4,841 source entries / 3,956 distinct source IDs / 8 unit conversions.

## Sources

- OQLF, [eau gazeuse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869752/eau-gazeuse), [eau gazéifiée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529363/eau-gazeifiee), and [soda](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529355/soda).
- CFIA, [English packaged water and ice labelling](https://inspection.canada.ca/en/food-labels/labelling/industry/prepackaged-water-and-ice) and [French packaged water and ice labelling](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/eau-glace-preemballees).
- Montellier Québec, [Eau pétillante Montellier Originale](https://montellier.ca/produits/gamme-eaux-petillantes-montellier/originale/).
- Canada Dry Canada, [Club Soda ingredients](https://canadadry.ca/product/club-soda/).
- OQLF / Institut international du froid, [cube de glace](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8477717/cube-de-glace).
- OQLF, [boisson gazeuse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870732/boisson-gazeuse) and [soda tonique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529270/soda-tonique), for beverage boundaries.

## Static validation

Seed normalization/checking, package validation, generated-index freshness, research-ledger validation, exact-key ownership, recipe-link scan, UTF-8/no-BOM, and scoped whitespace checks passed after integration. No tests or emulator checks were run because this change only adds database JSON data, as directed by `AGENTS.md`.
