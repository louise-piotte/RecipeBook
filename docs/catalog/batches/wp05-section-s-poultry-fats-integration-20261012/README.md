# WP05 Section S goose and chicken fats — 2026-10-12

## Catalog decisions

- Added identity-only `ingredient-ref-goose-fat` as `goose fat / graisse d’oie`, with French alias `gras d’oie`. A Québec goose producer and matching bilingual product pages establish a standalone culinary goose-fat product. They do not state that it is rendered, clarified, or water-free, so none of those properties is encoded.
- Added identity-only `ingredient-ref-rendered-chicken-fat` as `rendered chicken fat / gras de poulet fondu`, with English alias `chicken schmaltz`. Ontario and New Brunswick product sources explicitly call the product rendered chicken fat. The French display is supported by a paired Nestlé Professional Canada product label; that label names the fat as an ingredient in a compound chicken base, so it is not evidence of a standalone French product SKU.
- Kept both species separate from rendered duck fat. Held plain `chicken fat` / `gras de poulet`, raw chicken abdominal-fat tissue, generic `poultry fat` / `gras de volaille`, bare `schmaltz`, and `goose schmaltz`. The generic poultry-fat candidate is recorded as unresolved.
- No recipe row matched either species-specific fat. The existing source-unspecified `oil spray` row at 033#8 remains unlinked. No forms, measurements, densities, conversions, yields, or substitutions were added.

## Package audit

The package has 1,154 references / 83 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,456 ledger records / 4,866 source entries / 3,975 distinct source IDs / 8 unit conversions.

## Sources

- La Ferme Québec-Oies, [Graisse d’oie](https://boutique.lafermequebecoies.com/products/graisse-doie).
- Rougié, [Graisse d’oie](https://www.rougie.com/produit/graisse-doie-320g/) and [Goose fat](https://www.rougie.com/en/products/goose-fat-320g/).
- Costco Canada, [bilingual goose-rillettes ingredient declaration](https://www.costco.ca/wcsstore/CostcoCABCCatalogAssetStore/Attachment/8110122NutritionalFactsEN-FR.pdf); OQLF, [acide gras saturé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869227/acide-gras-sature).
- Olliffe, [Chicken Schmaltz](https://olliffe.ca/products/chicken-schmaltz); Bunnett Green Meadows Farm, [rendered chicken fat](https://bunnettgreenmeadows.ca/products/schmaltz-rendered-chicken-fat).
- Nestlé Professional Canada, [MINOR’S Chicken Base](https://www.nestleprofessional.ca/minors/minors-chicken-base-6-x-1-lb) and [Base de poulet](https://www.nestleprofessional.ca/fr/minors/minors-base-de-poulet-6-x-1-lb).
- Québec Food Directory, [Aylmer cream of chicken soup](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8219286); CFIA, [meat product standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) and [chicken nomenclature](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/viande-vendue-gros/poulet); Chabad, [What Is Schmaltz?](https://www.chabad.org/library/article_cdo/aid/4159121/jewish/What-Is-Schmaltz.htm).

## Static validation

Seed normalization/checking, package validation, generated-index freshness, ledger validation, exact-key ownership, all-recipe demand scan, UTF-8/no-BOM, and scoped whitespace checks passed after integration. No tests or emulator checks were run because this change only adds database JSON data, as directed by `AGENTS.md`.
