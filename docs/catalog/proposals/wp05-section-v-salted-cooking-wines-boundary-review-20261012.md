# WP05 Section V — Salted and Sweetened Cooking-Wine Boundary Review

- Date: 2026-10-12
- Status: proposal only; no catalog, recipe, ledger, workflow, roadmap, or plan files changed.
- Scope: salt-added white and red cooking wines, salt-added Shaoxing cooking wine, and sweetened mirin-style cooking seasonings. This is a narrow follow-up to [the broader WP05 culinary-alcohol review](wp05-section-v-culinary-alcohol-boundary-review-20261012.md), not a repeat of its general wine, sake, mirin, or fortified-wine decisions.

## Recommendation

Treat a recipe-qualified, salt-added cooking wine as a separate ingredient identity from the existing white-wine or red-wine identity when a current product label establishes that boundary. Treat a mirin-style sweet cooking seasoning as a separate identity from generic mirin when the named product is actually requested. These are composition differences, not preparation forms. Keep the candidate identities inactive until a recipe or imported library supplies product-specific demand.

Do not create a generic salted cooking wine alias. Canadian listings cover grape wines, Shaoxing products, Huadiao products, rice cooking wines, and sweetened mirin-style seasonings under overlapping cooking-use wording. The available sources do not establish a single composition for that umbrella. Do not infer alcohol content, salt or sugar equivalence, recipe conversions, or substitutions from these labels.

## Static catalog and demand audit

The live manifest currently contains **1,176 ingredient references, 85 forms, 114 recipes, and 1,123 ingredient rows**. The legacy-import file contains **66 candidates**.

| Active reference | Current English / French display | Active aliases | Boundary relevant here |
|---|---|---|---|
| ingredient-ref-white-wine | white wine / vin blanc | None | Owns unqualified white wine only. |
| ingredient-ref-red-wine | red wine / vin rouge | None | Owns unqualified red wine only. |
| ingredient-ref-mirin | mirin / mirin | None | The one bundled recipe use is unqualified. Do not broaden it to a named cooking seasoning or salted subtype. |
| ingredient-ref-sake | sake / saké | English: saki; Japanese rice wine | The qualified Japanese term stays with sake. No Shaoxing or broad rice-wine owner exists. |
| ingredient-ref-red-wine-vinegar | red wine vinegar / vinaigre de vin rouge | None | Separate acid identity; not a cooking-wine owner. |
| ingredient-ref-white-wine-vinegar | white wine vinegar / vinaigre de vin blanc | None | Separate acid identity; not a cooking-wine owner. |
| ingredient-ref-wine-vinegar | wine vinegar / vinaigre de vin | None | Separate acid identity; not a cooking-wine owner. |

There is no active reference or alias for cooking wine, vin de cuisine, salted cooking wine, cooking sake, Shaoxing wine, shio mirin, or mirin-style sweet cooking seasoning. No ingredient form belongs to the wine, sake, or mirin references above. A scan of all 66 legacy candidate records found no cooking-wine, mirin-variant, sake, or Shaoxing candidate.

Every ingredient row in the 114 manifest recipes was scanned for the relevant English, French, and common Shaoxing/rice-cooking terms. The scan found two related rows and no row specifying a salted or sweetened product:

| Recipe row | Exact source text | Current owner | Demand result |
|---|---|---|---|
| 066#9, Korean Soy-Marinated Jammy Eggs | 3 tbsp mirin | ingredient-ref-mirin | Supports only generic mirin; no type or product name. |
| 096#4, Pizza Sauce | 1 tbsp white wine | ingredient-ref-white-wine | Plain white wine; no cooking-wine qualifier. |

No ingredient row names salted white or red cooking wine, generic cooking wine, shio mirin, mirin-style seasoning, Shaoxing cooking wine, Huadiao cooking wine, or rice cooking wine. No recipe relinking is proposed.

## Candidate decisions

| Candidate and current label evidence | Recommendation | Proposed bilingual display and aliases | Current owner and bundled demand |
|---|---|---|---|
| Salt-added white cooking wine. Metro currently lists Château Thierry White Cooking Wine and reports ingredients as “Wine (1.5 gram of salt per 100 ml), Sulphites.” | Separate identity from white wine if a recipe names this product class; not a form and not an alias of plain white wine. Defer activation because recipe demand is zero. | Provisional display: “salted white cooking wine” / “vin blanc de cuisson salé”. Keep aliases empty for now: the unsalted status of every product called “white cooking wine” is not established. Do not alias white wine or vin blanc. | No exact active owner. ingredient-ref-white-wine remains the owner of plain white wine. No recipe row names cooking wine. |
| Salt-added red cooking wine. Loblaws lists Kedem Cooking Wine, Red and gives “Selected Red Grapes Seasoned With 1 1/2% Salt” as its ingredient statement. Its Québec listing label is “Kedem Vin de cuisine, rouge.” | Separate identity from red wine if a recipe names the salt-added cooking product; not a form. Defer activation for lack of recipe demand. | Provisional display: “salted red cooking wine” / “vin rouge de cuisson salé”. Keep aliases empty until a recipe’s exact product scope is known. Do not alias red wine or vin rouge. | No exact active owner. ingredient-ref-red-wine remains the owner of plain red wine. No recipe row names cooking wine. |
| Salted Shaoxing cooking wine. Walmart Canada lists Double Happiness Salted Shao Xing Cooking Wine with ingredients WATER, GLUTINOUS RICE, WHEAT, SALT, CARAMEL COLOUR. Its French listing is titled “Double Happiness Shao Xing Vin de Cuisine Salé.” | Separate product identity if this named salted product is requested; not a form and not an alias of sake, mirin, generic rice wine, or a Shaoxing beverage. Defer activation because no recipe names it. | Proposed display: “salted Shaoxing cooking wine” / “vin de cuisine Shaoxing salé”. The only proposed spelling aliases are “salted Shao Xing cooking wine” and “Shao Xing Vin de Cuisine Salé”, matching the retailer's product wording. Do not alias unqualified “Shaoxing cooking wine.” | No exact active owner. ingredient-ref-sake owns only its current name and listed aliases, including Japanese rice wine. No recipe row names a Chinese rice wine. |
| Kikkoman Kotteri Mirin-Style Sweet Cooking Seasoning. Metro Canada lists this product and gives an ingredient list beginning with corn syrup and glucose-fructose, followed by water, fermented rice seasoning, vinegar, and sodium benzoate. | Separate identity from generic mirin if the named style or product is requested; not a form and not an alias of mirin. Defer activation because the only recipe says “mirin.” | Proposed display: “Kotteri mirin-style sweet cooking seasoning” / provisional “assaisonnement de cuisine sucré de style mirin Kotteri”. No aliases. In particular, do not alias “mirin,” “mirin sauce,” or “sweet seasoning” to this product. The French wording follows Kikkoman’s French product-family wording and is not an OQLF-preferred compound. | ingredient-ref-mirin owns only generic mirin. Recipe 066#9 is unqualified and does not support this product. |
| Shio mirin. OQLF’s mirin entry names shio mirin as a salted type; the reviewed sources did not establish a current Canadian product label for a specific shio mirin product. | Hold pending exact recipe or product demand. If later named, keep it as a separate identity from generic mirin; not an alias or form. | Potential display: “shio mirin” / “shio mirin”. Keep aliases empty. OQLF supports the Japanese subtype name and its salt qualifier; it does not make the subtype interchangeable with every mirin product. | ingredient-ref-mirin is the nearby active identity, but has no shio alias. No recipe row names shio mirin. |
| Generic cooking wine / vin de cuisine. OQLF records this bilingual term pair, but the entry does not specify product composition. | Hold as an umbrella identity and alias. Do not route it to grape wine, Shaoxing wine, mirin, sake, or vinegar. | Exact terminology: “cooking wine” / “vin de cuisine”. No aliases. If a recipe later says only this phrase, inspect its source or product before selecting a narrower identity. | No active owner. No recipe row uses either term. |
| T&T Shaoxing Cooking Wine, T&T Huadiao Cooking Wine 10, and T&T Rice Cooking Wine 10. Current Loblaws listings provide English and French product titles, including “Vin de cuisine Shaoxing,” “Vin de Huadiao 10,” and “Vin de riz pour cuisson.” The accessible product pages do not provide ingredient lists. | Hold each product label from catalog matching until its package ingredients and exact recipe demand are available. Do not infer salt status or combine these products under a new generic Chinese cooking-wine identity. | Preserve the exact source labels as evidence only: “Shaoxing Cooking Wine” / “Vin de cuisine Shaoxing”; “Huadiao Cooking Wine 10” / “Vin de Huadiao 10”; “Rice Cooking Wine 10” / “Vin de riz pour cuisson”. No aliases or active display proposed yet. | No exact active owner. ingredient-ref-sake’s Japanese rice wine alias does not own these named Chinese products. No recipe row names any of them. |
| Mizkan Sweet Cooking Seasoning (Mirin). Current Canadian grocery listings show this exact English product label, but the accessible listing does not provide an ingredient declaration or product-specific French label. | Hold pending the package ingredient list and French product wording. If a recipe names the product, evaluate it as a candidate separate from generic mirin; do not add the retailer’s parenthetical “(Mirin)” as an alias to ingredient-ref-mirin. | Preserve the exact English product label as research evidence only. No approved French display or aliases yet; do not borrow a different manufacturer’s French label as if it were Mizkan’s. | ingredient-ref-mirin owns only the generic active term. No recipe row names the Mizkan product or “sweet cooking seasoning.” |

### Interpretation limits

- The white, red, Shaoxing, and Kotteri examples above are separate product labels with their own reported ingredients. They do not establish one composition for all cooking wines or mirin-style seasonings.
- The retailer listings are product-specific evidence and may change. Walmart says supplier-provided listing information is not independently verified; Metro likewise advises checking packaging. Confirm the physical package before any future catalog integration.
- “Shio mirin” is retained as a named subtype only. The OQLF entry does not support an alias from all mirin to salted mirin.
- No form, measure, density, conversion, yield, substitution, or recipe preparation change is proposed.

## Sources

Pages were reviewed on 2026-10-12. Current retail listings establish only the named product wording and ingredient text shown on each listing.

| Source | Evidence and limits |
|---|---|
| OQLF, [vin de cuisine / cooking wine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18058010/vin-de-cuisine) | Authoritative Québec bilingual term pair. The entry does not define a single product formulation. |
| OQLF, [mirin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544925/mirin) | Accepts mirin in both French and English and identifies hon, shin, and shio types; its note says shio mirin is salted. This does not define a catalog alias or recipe substitution. |
| Metro, [Château Thierry White Cooking Wine](https://www.metro.ca/en/online-grocery/aisles/pantry/oils-vinegars/wine-apple-cider-vinegar/white-cooking-wine/p/055789000093) | Current Canadian listing; product ingredient declaration reports wine with salt and sulphites. Product-specific only. |
| OQLF, [vin blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353540/vin-blanc) and [vin rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354290/vin-rouge) | Authoritative Québec color terms used in the provisional labels above. |
| Loblaws, [Kedem Cooking Wine, Red](https://www.loblaws.ca/en/cooking-wine-red/p/20275765002_EA) and [Québec cooking-wine listings](https://www.loblaws.ca/fr/search?search-bar=cooking+wine+shaoxing) | Current Canadian product listing reports selected red grapes seasoned with salt. The Québec listing displays “Kedem Vin de cuisine, rouge,” “Château Vin blanc de cuisson,” and other product labels; retailer names are not OQLF entries. |
| Walmart Canada, [Double Happiness Salted Shao Xing Cooking Wine](https://www.walmart.ca/en/ip/double-happiness-salted-shao-xing-cooking-wine/10279203) and [French listing](https://www.walmart.ca/fr/ip/Double-Happiness-Shao-Xing-Vin-de-Cuisine-Sal/10279203) | Product title, French listing title, and listed ingredients WATER, GLUTINOUS RICE, WHEAT, SALT, CARAMEL COLOUR. Walmart notes product details are supplier-provided and not separately verified. |
| Metro, [Kikkoman Kotteri Mirin-Style Sweet Cooking Seasoning](https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/international-condiments/mirin-style-sweet-cooking-seasoning/p/041390020995) | Current Canadian label and ingredient list for one Kotteri product. No inference is made about all mirin or all sweet cooking seasonings. |
| Kikkoman France, [Assaisonnement de cuisine sucré de style Mirin](https://www.kikkoman.fr/restauration/produits/detail/fs-assaisonnement-de-cuisine-sucre-de-style-mirin-kikkoman) | French manufacturer wording for a mirin-style product family. This supports the provisional French phrase only; it does not establish a Québec-preferred term or an identical Canadian formulation. |
| Real Canadian Superstore, [T&T Shaoxing Cooking Wine](https://www.realcanadiansuperstore.ca/en/shaoxing-cooking-wine/p/21636866_EA) and Loblaws Québec, [Chinese cooking-wine product listings](https://www.loblaws.ca/fr/search?search-bar=cooking+wine+shaoxing) | Current Canadian titles establish product naming, including Shaoxing, Huadiao, and rice-cooking products. Accessible listings do not expose ingredient declarations for these products. |
| Provigo, [Mizkan Sweet Cooking Seasoning (Mirin)](https://www.provigo.ca/en/mirin-sweet-cooking-seasoning/p/21503878_EA) | Current Canadian product name; the accessible listing did not expose an ingredient list or French product label. |

## Remaining gaps and disposition

The corpus has no recipe demand for any salted or sweetened cooking-wine product. Product evidence supports keeping named salted cooking wines and mirin-style sweet cooking seasoning distinct from their plain counterparts if they are later requested, but it does not justify active rows or aliases now. Obtain package-backed ingredient and French-label evidence for the T&T Huadiao/rice products and Mizkan seasoning before a product-specific integration. Preserve the broad culinary-alcohol proposal’s existing sake, mirin, Shaoxing-beverage, and vinegar boundaries.

No app tests or emulator checks were run for this proposal-only research.
