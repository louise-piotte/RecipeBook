# WP05 Section T — jerk, Cajun, Creole, and adobo seasoning review

## Scope and disposition

- **Review and source-access date:** 2026-10-11.
- **Scope:** Dry jerk seasoning, Cajun seasoning, Creole seasoning, and dry adobo seasoning. This packet does not cover sazón; the WP06 Caribbean/Spanish-language sweep keeps that product-family question unresolved.
- **Status:** Integrated as identity-only references after exact-name, recipe, and boundary review.
- **Source IDs:** `WP05-JERKSEASONING-20261011-S01`–`S03`, `WP05-CAJUN-20261011-S01`–`S03`, `WP05-CREOLE-20261011-S01`–`S03`, and `WP05-ADOBOSPICE-20261011-S01`–`S03`. These IDs were checked against the live ledger and existing proposal/batch files before assignment.

## Accepted identities

| ID | English / French display | Category | Boundary |
|---|---|---|---|
| `ingredient-ref-jerk-seasoning` | `jerk seasoning` / `assaisonnement jerk` | `BAKING_AND_SPICE` | Applies to dry spice blends explicitly named or marketed as jerk seasoning. Keep the existing `Jamaican jerk paste` reference, marinades, and jerk barbecue/table sauces separate. The Canadian government culinary guide describes variable mixtures and both dry and wet products; its ingredient examples are not a universal formula. |
| `ingredient-ref-cajun-seasoning` | `Cajun seasoning` / `épices cajun` | `BAKING_AND_SPICE` | Applies to dry blends explicitly named Cajun seasoning or épices cajun. Product composition and heat vary; do not infer a universal formula. |
| `ingredient-ref-creole-seasoning` | `Creole seasoning` / `assaisonnement créole` | `BAKING_AND_SPICE` | Applies to dry blends explicitly named Creole seasoning or assaisonnement créole. Keep separate from Cajun seasoning even where a seller describes similar ingredient profiles or uses. |
| `ingredient-ref-adobo-seasoning` | `adobo seasoning` / `assaisonnement adobo` | `BAKING_AND_SPICE` | Applies to dry seasoning blends explicitly named adobo seasoning. Keep separate from Mexican adobo sauce, adobo paste, Filipino adobo cooking products, chipotles in adobo, and finished adobo dishes. Do not infer one regional or brand formula. |

All four rows have no aliases, forms, recipe links, density, unit mappings, package yields, conversions, or substitutions. Ingredient lists and heat/allergen claims remain product-specific. The existing jerk-paste row and the existing Mexican adobo-sauce row remain unchanged.

## Catalog and recipe audit

The pre-integration package contained **1,042 active references, 72 forms, 75 legacy candidates, 1,334 research-ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows**. Exact normalized-key checks used the app's `normalizeIngredientSearchKey` behavior across active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. There was no exact owner for the four accepted bilingual display pairs. The neighboring existing `Jamaican jerk paste`, `Mexican adobo sauce`, and `chipotle in adobo` are distinct phrase-level identities, not exact collisions.

The 114 manifest recipes and all 1,123 ingredient rows were searched for these phrases and common accent/punctuation variants. No jerk, Cajun, Creole, or dry adobo-seasoning line matched. The only `adobo` ingredient line is recipe `007#3`, `1 chipotle in adobo, minced`, already linked to `ingredient-ref-chipotle-in-adobo`; it was preserved. No recipe relinking is indicated.

## Evidence and limits

- The Department of National Defence culinary reference gives the French names `assaisonnement jerk` and `épices jerk`, describes a blend centered on allspice and Scotch bonnet, notes possible additional ingredients, and states that the product is sold as a dry marinade or wet paste. McCormick Gourmet’s Canadian page separately names a Jamaican Jerk Seasoning product and describes dry-rub use. These sources support a dry seasoning identity and the boundary from the existing paste; they do not establish one recipe or a dry-to-paste conversion.
- Québec product listings attest the bilingual market wording `Cajun Seasoning` / `Épices Cajun` and the local `épices cajun` name. Crousset sells Cajun as a spice blend. The identity does not assert a single composition.
- Québec retail wording attests `Assaisonnement créole`; Crousset sells a `Créoles` spice blend and says its blend resembles Cajun while being hotter. That comparison supports keeping the named blends distinct, not treating them as aliases or as a fixed regional formula. Tony Chachere's own catalog uses `Original Creole Seasoning` for its product.
- Montréal-based A Spice Affair sells a dry `Adobo Seasoning` product with French heading `Adobo Assaisonnement`; Québec retail listings also use `Assaisonnement adobo avec poivre` for a Goya dry seasoning. OQLF's broad `adobo` entry includes marinade and Filipino-dish senses, so the unqualified word is not added as an alias.

## Source register

Sources were accessed on 2026-10-11. Manufacturer and retailer pages support only the named product or term shown.

| Source ID | Source | Evidence used and limit |
|---|---|---|
| `WP05-JERKSEASONING-20261011-S01` | Department of National Defence, [Table of herbs and spices (French culinary reference)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-31-2018-fra.pdf), PDF pp. 7–8. | Attests `assaisonnement jerk` / `épices jerk`, a variable blend with allspice and Scotch bonnet as principal ingredients, and dry-marinade or wet-paste presentations. Not a formula or conversion source. |
| `WP05-JERKSEASONING-20261011-S02` | McCormick Gourmet Canada, [Jamaican Jerk Seasoning](https://www.clubhouse.ca/en-ca/mccormick-gourmet/products/blends/jamaican-jerk-seasoning). | Manufacturer names the blend and describes dry-rub use; its ingredients and uses apply to this product only. |
| `WP05-JERKSEASONING-20261011-S03` | Bulk Mart Canada, [Assaisonnement Jerk](https://bulkmart.ca/fr/products/premium-spices-jerk-seasoning-454-g). | French Canadian retail heading and dry-blend product context. Its formula and use descriptions are not generalized. |
| `WP05-CAJUN-20261011-S01` | Québec Répertoire des aliments québécois, [Firebarns Épices Cajun Seasoning Mardi Gras](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8224076). | Québec government product directory records the bilingual product name and classifies it among seasonings/spices. The ingredient statement describes one SKU. |
| `WP05-CAJUN-20261011-S02` | Épices Crousset, [Cajun](https://crousset.com/produit/cajun/). | Québec manufacturer identifies Cajun as a spice blend and describes one product's flavor/use. Not a universal formula. |
| `WP05-CAJUN-20261011-S03` | Super C Québec, [Épices cajun Dion](https://www.superc.ca/allees/garde-manger/fines-herbes-epices-et-sauces/melanges-de-fines-herbes-et-d-epices/epices-cajun/p/620383011280). | Québec retail name and one product's ingredient declaration; does not define every Cajun blend. |
| `WP05-CREOLE-20261011-S01` | IGA Québec, [Assaisonnement créole — Les Aliments G. Dion](https://www.iga.net/fr/epicerie_en_ligne/parcourir/aliments-du-qu%C3%A9bec?fq=BrandName_Facet%3ALes+Aliments+G.+Dion&page=1&pageSize=60&sort=IsPopular%3Adesc%3Bscore%3Adesc). | Québec retailer listing attests the French product name for a named seasoning; its exact blend is product-specific. |
| `WP05-CREOLE-20261011-S02` | Épices Crousset, [Créoles](https://crousset.com/produit/creoles/). | Québec manufacturer sells a spice blend as `Créoles`, describes its relation to Cajun, and lists one SKU formula. Similarity does not establish synonymy. |
| `WP05-CREOLE-20261011-S03` | Tony Chachere's, [French-language product catalog](https://www.tonychacherecom.com/fr/). | Manufacturer history and product heading attest its `Original Creole Seasoning` product name. Does not define other Creole seasoning formulas. |
| `WP05-ADOBOSPICE-20261011-S01` | A Spice Affair / Aliments NutriVilla, [Adobo Seasoning](https://aspiceaffair.com/fr/products/adobo-seasoning). | Montréal-based producer uses the bilingual product wording `Adobo Assaisonnement` / `Adobo Seasoning` and lists one dry-blend formula. Product-specific evidence only. |
| `WP05-ADOBOSPICE-20261011-S02` | Super C Québec, [Goya Assaisonnement adobo avec poivre](https://www.superc.ca/allees/garde-manger/fines-herbes-epices-et-sauces/sauces-et-assaisonnements-en-sachet/assaisonnement-adobo-avec-poivre/p/041331078047). | Québec retail product name and package listing attest a dry adobo seasoning; the `avec poivre` modifier is not added as a global alias. |
| `WP05-ADOBOSPICE-20261011-S03` | Office québécois de la langue française, [adobo (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26561587/adobo). | Documents broader marinade and Filipino-dish senses; supports keeping the dry seasoning phrase separate and excluding bare `adobo` as an alias. |

## Integration note

The four accepted identities add no general composition, amount, form, recipe link, conversion, yield, allergen profile, or substitution behavior. They leave the existing jerk-paste and adobo-sauce records intact. The separate WP06 sazón hold remains unresolved because the available packet describes a broad, product-dependent class rather than a stable standalone identity.
