# WP02 Section B R284 integration: chickpea-flour measurements and substitutions

Completed bounded measurement and substitution research for the existing generic `chickpea flour / farine de pois chiche` identity. Recorded Cuisine Soleil's and Bob's Red Mill's `1/4 cup (30 g)` manufacturer-label servings as two separate product-specific observations. The cup convention and fill method are unspecified, so neither observation supports a reusable density or mass-volume conversion.

Health Canada's CNF food code 4886 is explicitly named `Chickpea flour (besan)` and lists volume/mass portions. Those values are retained only as a source record and are not applied to the generic row because the product scope is not matched. The existing OQLF `pois chiche` source is reused for identity-boundary context only. No density, unit mapping, reusable measure, conversion, form, yield, recipe link, or active substitution was added.

Bob's Red Mill recommends replacing up to 25% of flour in baking with its own chickpea flour, while two studies evaluate specific wheat-flour replacement levels in bread and shortbread-cookie formulas. The ledger records the manufacturer advice and study outcomes as scoped, blocked findings; they do not establish one general or recipe-role-qualified rule for the catalog identity.

The current `gram flour` picker query returns the chana sattu identity because its existing alias `roasted Bengal gram flour` contains the query phrase. This search consequence is documented without assigning a broad alias or changing search behavior. A separate search-boundary review can address the substring match.

## Files

- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- `docs/catalog/proposals/wp02-b2-chickpea-flour-measurement-substitution-review-r284-20261016.md`

## Verification

Static data and package checks passed:

- Bundled package normalization/validation, ingredient-reference normalization, and generated picker-index freshness.
- Research-ledger schema and source-ID/URL ownership validation for the R284 sources and observations.
- Picker projection and manifest-listed recipe-corpus scan.
- UTF-8 without BOM, escaped Unicode in database JSON, local Markdown links, and scoped whitespace checks.

Totals: 1,661 ingredient references, 126 forms, and 2,010 research-ledger records / 8,847 source entries / 7,489 distinct source IDs / 6,251 distinct URLs; 114 bundled recipes / 1,123 ingredient rows.

No software tests, builds, or emulator checks were run. This change adds research data to the database JSON; no generated catalog code changed.

## Sources

- [R284 chickpea-flour measurement and substitution proposal](../../proposals/wp02-b2-chickpea-flour-measurement-substitution-review-r284-20261016.md)
- [Québec Food Directory: Cuisine Soleil Organic Chickpea Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223780)
- [Aliments du Québec: Farine de Pois Chiche Biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-pois-chiche-biologique)
- [Bob's Red Mill: Chickpea Flour](https://www.bobsredmill.com/product/garbanzo-bean-flour)
- [Health Canada: CNF Chickpea flour (besan), code 4886](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4886)
- [Mohammed, Ahmed, and Senge: wheat–chickpea flour blends](https://www.sciencedirect.com/science/article/pii/S0926669011003815)
- [Felisiak et al.: chickpea flour in shortbread cookies](https://www.mdpi.com/2304-8158/13/15/2356)
