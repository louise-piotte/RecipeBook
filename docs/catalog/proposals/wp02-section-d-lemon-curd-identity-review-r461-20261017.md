# WP02 Section D — Lemon curd identity review (R461)

- Reviewed: 2026-10-17
- Status: accepted and integrated; one identity-only reference
- Scope: lemon curd within the open Section D fruit-product coverage item

## Recommendation and disposition

Add one identity-only reference: English **lemon curd**, Québec French **crème au citron**, category `SAUCE_AND_CONDIMENT`. Add only the French alias **crème de citron**, attested on the current French Canadian PC Collection noire product listing. Leave English aliases empty. Keep OQLF’s English equivalents **lemon cheese**, **lemon cheese curd**, and **lemon butter** out of picker aliases: the cheese and butter terms would broaden unrelated base-ingredient searches.

The Office québécois de la langue française defines the product as a creamy egg, sugar, butter, lemon-juice, and zest preparation used as a tart or cake filling or a spread. It gives *crème au citron* as the preferred French term and lists *lemon curd* among the English equivalents. A current Canadian PC product is sold as Lemon Curd; the French Loblaws listing for the same 250 ml item says Crème de citron. These sources support the bilingual product identity without making its product-specific formula a generic composition standard.

Keep the entry separate from lemon, lemon juice, lemon zest, fruit purée, jam, caramel sauce, and dulce de leche. Add no form, density, unit mapping, measurement observation, recipe link, conversion, yield, or substitution. Measurement research found no reusable value: the PC product’s 250 ml package and 34 ml labelled serving are SKU-specific. Substitution research remains not yet researched.

## Catalog and picker audit

The pre-integration snapshot contained 1,744 ingredient references, 141 forms, 2,103 ledger records, and 56 legacy candidates. No exact owner existed for lemon curd, crème au citron, or crème de citron in references, forms, legacy identities, or ledger record IDs. The proposed reference ID, source-ID prefix, and source URLs were unused.

The manifest-listed corpus contains 114 recipe files and 1,123 ingredient rows. A normalized scan of ingredient-row text found no occurrence of lemon curd, crème au citron, crème de citron, lemon cheese curd, lemon cheese, or lemon butter. No recipe line is linked to this new identity.

The picker uses whole-phrase matches before substring fallback. Projected results after adding the two canonical names and the one French alias are:

| Query | Before | After | Effect |
| --- | ---: | ---: | --- |
| lemon curd | 0 | 1 | New identity |
| crème au citron | 0 | 1 | New identity |
| crème de citron | 0 | 1 | New identity |
| lemon | 7 | 8 | Adds the named lemon product |
| citron | 8 | 9 | Adds the named lemon product |
| crème | 17 | 18 | Adds the French product phrase |
| curd | 3 | 4 | Adds the named product alongside bean curd and tofu |
| cheese | 15 | 15 | No change; cheese synonyms stay unindexed |
| butter | 25 | 25 | No change; butter synonym stays unindexed |

Pre-integration file hashes: manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; references `aeb7f6ae5de1f32f68cd0c27e16e445d7c656d4731691017d2132375ac21535c`; forms `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed`; research ledger `e6dacf3d3466befd237621feb59b55f1dae7897bebd0d1042554b45628b4c79a`; legacy identities `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720`. The corpus audit used the manifest’s 114 listed recipe paths and all 1,123 ingredient rows.

## Evidence and limits

All pages were accessed 2026-10-17.

| Source | Evidence used | Limit |
| --- | --- | --- |
| [OQLF GDT — crème au citron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26534379/creme-au-citron) | Definition, preferred French term, filling and spread uses, and English equivalents. | Does not establish household measures, a fixed commercial formula, or a substitution. |
| [Independent City Market — PC Black Label Lemon Curd](https://www.independentcitymarket.ca/en/lemon-curd/p/20956704_EA) | Current Canadian product name, 250 ml SKU, ingredient list, 34 ml labelled serving, and dessert uses. | Retailer product data; package and serving are specific to this SKU and do not support reusable conversions. Availability and price are not asserted. |
| [Loblaws — French search results for lemon curd](https://www.loblaws.ca/fr/search?search-bar=lemon+curd) | Lists the matching PC Collection noire item as Crème de citron, 250 ml, and distinguishes Bonne Maman tartinade de citron and E.D. Smith garniture pour tarte au citron. | Search results are location- and time-sensitive. The separate spread and pie filling are not aliases for lemon curd. |

## Integration

Added `ingredient-ref-lemon-curd` with canonical names lemon curd / crème au citron, French alias crème de citron, category `SAUCE_AND_CONDIMENT`, null density, and no unit mappings. Added the matching verified identity record and three source entries to the research ledger. Regenerated the derived Kotlin ingredient import-audit catalog. Static package normalization, generated-index freshness, ledger-schema validation, source ownership, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. No recipe data changed and no app or Android tests were run for this database-JSON addition under `AGENTS.md`. The broader Section D fruit-product item remains open for powders, freeze-dried products, pastes, jams, other curds and fillings, and remaining dulce-de-leche coverage.
