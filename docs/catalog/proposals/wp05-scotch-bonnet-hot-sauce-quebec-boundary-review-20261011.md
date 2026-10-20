# WP05 Section Z: Scotch Bonnet pepper sauce identity and Québec naming review

## Scope and status

- **Review and source-access date:** 2026-10-11.
- **Scope:** Whether current product sources support a narrowly named Scotch Bonnet pepper-sauce identity, including its Québec French product wording, and its boundary with fresh Scotch Bonnet pepper, jerk products, shito, and generic hot sauce.
- **Status:** Integrated on 2026-10-11 as an identity-only reference and research-ledger record; see the integration batch README.
- **Proposal-local source IDs:** `WP05-SB-HOTSAUCE-QC-20261011-S01` through `S11`. S01–S10 are recorded on the accepted research-ledger entry; S11 is an internal prior-review pointer.
- **Existing open item:** WP05 Section Z still lists “Jerk paste, Scotch-bonnet sauces, green seasoning, epis, pikliz, sofrito, and recaito.” Jerk paste, green seasoning, epis, and pikliz have prior identity reviews; this packet covers only the Scotch Bonnet pepper-sauce boundary.

## Recommendation

**Accept one identity-only product family candidate:**

| Field | Recommendation |
|---|---|
| ID | `ingredient-ref-scotch-bonnet-pepper-sauce` |
| Category | `SAUCE_AND_CONDIMENT` |
| English display | `Scotch Bonnet pepper sauce` |
| Québec French display | `sauce au piment fort Scotch Bonnet` |
| English aliases | `Scotch Bonnet hot pepper sauce`; `hot Scotch Bonnet pepper sauce`; `Scotch Bonnet sauce` |
| French aliases | None |
| Forms and numeric data | None |

Two current makers use the product name **Scotch Bonnet Pepper Sauce** or **Scotch Bonnet Hot Pepper Sauce**. A Québec Metro product listing gives the matching French product wording **Sauce au piment fort scotch bonnet** for Grace, with the same item number as Metro's English listing. OQLF separately supports the pepper term **piment Scotch Bonnet**; it does not define a sauce term. This is enough evidence for the named sauce family and local product wording, but not for one recipe or one regional style. [S01–S06]

The aliases above are limited to product names attached to Scotch Bonnet sauce products: the current Grace manufacturer title and Metro English listing, plus Grace's product-catalog wording **Scotch Bonnet Sauce**. Do not add bare `hot sauce`, `pepper sauce`, `hot pepper sauce`, `sauce piquante`, or `sauce au piment` as aliases. Those phrases describe broad product groups and are not equivalent to the pepper-qualified identity.

## Product scope and exclusions

The candidate covers a finished sauce sold under an unqualified Scotch Bonnet pepper-sauce name. It does not require a single recipe or pepper-only composition: Grace's Canadian page lists Scotch Bonnet peppers with water, vinegar, starch, salt, spices, and preservatives, while Cool Runnings' product page also lists habanero pepper, carrot purée, onion purée, starch, and acids. These are two named products, not a compositional standard. Do not set pepper percentage, texture, acidity, fermentation, color, heat, or processing requirements from them. [S02–S03]

| Neighbor or variant | Boundary decision |
|---|---|
| Fresh `Scotch Bonnet pepper / piment Scotch Bonnet` | Keep the active raw produce reference `ingredient-ref-scotch-bonnet-pepper` in `VEGETABLE_AND_AROMATIC`. A sauce is a prepared condiment, not a form or alias of fresh pepper. OQLF's entry names the pepper, not a prepared sauce. [S06] |
| Jamaican jerk paste, dry jerk seasoning, and jerk sauces | Keep the active `Jamaican jerk paste / pâte jerk` row and its `jerk paste` alias. A Scotch Bonnet pepper may occur in jerk seasoning, but that does not make the paste or a jerk BBQ/table sauce a Scotch Bonnet pepper sauce. The Caribbean review keeps jerk paste separate from dry seasoning, ready-made marinades, and jerk barbecue sauce. [S11] |
| Ghanaian shito | Keep `shito (Ghanaian pepper sauce) / shito (sauce au piment ghanéenne)` and its `shito sauce` alias as a separate regional identity. The Ghanaian standard notice names shito as a distinct pepper-sauce product, and Ghana's FDA lists `Pepper Sauce`, `Shito`, and `Shito Mix` separately. Do not add `shito` or `pepper sauce` as aliases here. [S09–S10] |
| Green or curry Scotch Bonnet sauces | Grace's current product range separately names **Green Scotch Bonnet Pepper Sauce** and **Caribbean Curry Scotch Bonnet Hot Pepper Sauce**. Keep these qualified product variants out of the unqualified alias set pending a separate variant/recipe review; do not use `green` or `curry` as aliases. [S07] |
| Other sauces that list Scotch Bonnet as an ingredient | Do not absorb a named marinade or meal sauce merely because its ingredient declaration includes Scotch Bonnet. Grace lists Scotch Bonnet in an oxtail marinade, for example; the marketed product remains an oxtail marinade. [S02] |
| Generic hot sauce, pepper sauce, chili sauce, and other regional pepper sauces | No umbrella identity or broad alias is proposed. Keep named products such as Sriracha, sambal oelek, sambal matah, and shito separate. A pepper named in a recipe or label does not make its sauce interchangeable with this product family. |

## Current catalog, ledger, and collision audit

The pre-integration live package snapshot rechecked on 2026-10-11 contained **971 ingredient references**, **61 ingredient forms**, and a manifest of **114 recipes with 1,123 ingredient rows**. The candidate ID, source IDs, exact search terms, and recipe corpus were rechecked immediately before integration.

| Surface | Current finding |
|---|---|
| Related active references | Before integration, `ingredient-ref-scotch-bonnet-pepper` was the fresh pepper; `ingredient-ref-jamaican-jerk-paste` was the Jamaican paste; and `ingredient-ref-shito` was Ghanaian shito. These remain separate after integration. Other distinct sauce/pepper references include Sriracha, sambal oelek, sambal matah, chili oil, and chili-crisp oil. |
| Exact normalized names | Before integration, no exact owner existed for `Scotch Bonnet pepper sauce`, `Scotch Bonnet hot pepper sauce`, `Hot Scotch Bonnet Pepper Sauce`, `Scotch Bonnet Sauce`, `sauce au piment fort scotch bonnet`, or `sauce au piment scotch bonnet` in active reference names/aliases, ingredient forms, or `legacy-import-identities.v1.json`. Integration now assigns the accepted product names and aliases to this sauce row. The exact French term `piment Scotch Bonnet` remains owned by the fresh pepper reference. |
| Research ledger | Before integration, the ledger had the verified fresh pepper identity, the accepted jerk-paste identity, and the accepted shito identity, but no Scotch Bonnet sauce entry. The accepted sauce record now carries S01–S10. |
| Candidate ID | `ingredient-ref-scotch-bonnet-pepper-sauce` was unused before integration and is now the accepted active identity. |
| Proposal and source IDs | The target file and the proposal-local `WP05-SB-HOTSAUCE-QC-20261011-S` prefix were absent before this packet was written. |

Search keys were compared case-insensitively after NFKD decomposition, accent folding, punctuation/whitespace normalization, and case folding. The query **Scotch Bonnet** will naturally retrieve both the raw pepper and the proposed sauce if this identity is added; that is a shared-word search result, not synonymy. Keep the full product names distinct. Do not add a bare-pepper alias to the sauce or a sauce alias to the fresh pepper.

## Recipe audit

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned for `Scotch Bonnet`, `Scotch Bonnet pepper sauce`, `Scotch Bonnet hot pepper sauce`, `Hot Scotch Bonnet Pepper Sauce`, `Scotch Bonnet Sauce`, `sauce au piment fort scotch bonnet`, `sauce au piment scotch bonnet`, bare `hot sauce` / `pepper sauce`, and the adjacent terms `jerk paste` and `shito`.

| Search surface | Candidate or boundary matches |
|---|---:|
| Ingredient rows | 0 |
| Full recipe JSON | 0 |

No bundled recipe link is proposed. The absence of a seed recipe match does not negate the current manufacturer and Québec product evidence; it only means this packet has no exact recipe row to attach.

## Measurements, forms, and behavior

Add no density, unit mapping, volume-to-mass conversion, package yield, cooking dose, serving conversion, form, process variant, recipe link, conversion, or substitution. Grace and Cool Runnings publish product-specific package/ingredient information; it does not supply transferable behavior for the sauce family. No product's serving size, listed volume, ingredient sequence, or heat rating is turned into a catalog value. Keep the raw Scotch Bonnet pepper separate even when a sauce formula names it as an ingredient.

## Sources

All source pages below were accessed on 2026-10-11. Product listings support the names and details of the listed products only; OQLF supports the pepper term, not a sauce standard.

| ID | Source and locator | Claim used | Limit |
|---|---|---|---|
| **S01** | Grace Foods, [Grace Scotch Bonnet Hot Pepper Sauce](https://gracefoods.com/products/product/view/22/467), product page. | Manufacturer product title directly uses `Scotch Bonnet Hot Pepper Sauce`. | Product name only; the page does not establish a universal sauce formula or fr-CA term. |
| **S02** | Grace Foods Canada, [Spices, Seasonings & Sauces](https://gracefoods.ca/product/seasonings-sauces/), Scotch Bonnet section and adjacent sauce listings. | Canadian manufacturer lists its Scotch Bonnet sauce product and a product-specific ingredient declaration. It separately shows hot pepper sauce, habanero pepper, ghost pepper, and named marinades. | One manufacturer's product line; its composition and size are not transferable, and a sauce ingredient inside a marinade does not change that marinade's identity. No heat rating or quantity is adopted. |
| **S03** | Cool Runnings Foods, [Scotch Bonnet Pepper Sauce](https://coolrunningsfoods.com/products/scotch-bonnet-pepper-sauce), product description and ingredients. | Independent manufacturer uses the exact English product name and lists a formula that includes Scotch Bonnet plus other peppers and vegetables. | One commercial formula. The page's serving information is not a density, conversion, or recipe-wide dose. |
| **S04** | Metro Québec, [Sauce au piment fort scotch bonnet Grace](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/sauces-de-cuisson/sauce-au-piment-fort-scotch-bonnet/p/055270839492), product 055270839492, French title and ingredient declaration. | Current French Canadian retailer wording for a Grace Scotch Bonnet pepper sauce. The page displayed the product as out of stock when checked. | Product-level fr-CA wording, not an OQLF-preferred sauce term, universal recipe, or stock guarantee. |
| **S05** | Metro, [Hot Scotch Bonnet Pepper Sauce Grace](https://www.metro.ca/en/online-grocery/aisles/pantry/herbs-spices-sauces/cooking-sauces/hot-scotch-bonnet-pepper-sauce/p/055270839492), product 055270839492. | English listing for the same item number as the French Metro page; supports the source-attested word order `Hot Scotch Bonnet Pepper Sauce`. | Retailer title for the Grace product only; not a broad synonym for hot sauce or pepper sauce. |
| **S06** | OQLF, [piment Scotch Bonnet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037054/piment-scotch-bonnet), entry last updated 1987. | Gives French `piment Scotch Bonnet` and English `Scotch Bonnet pepper`. | Entry is for fresh pepper, not sauce. The Metro product title supplies the sauce phrase. |
| **S07** | Grace Foods, [Pepper Sauces](https://gracefoods.com/pepper-sauces), current product-family page. | Lists a Scotch Bonnet sauce separately from Green Scotch Bonnet and other flavored/qualified sauces. | One manufacturer's assortment. It does not prove that all such variations share one formula or that qualified variants are aliases. |
| **S08** | Grace Foods Canada, [Hot Pepper Sauces catalogue](https://gracefoods.ca/wp-content/uploads/GraceCatalogue_2018Caribbean.pdf), Scotch Bonnet Sauce product row. | Manufacturer's catalog records the source name `Scotch Bonnet Sauce` with UPC 0 55270 83949 2, which corresponds to Metro item 055270839492. Supports the narrow English spelling alias. | 2018 product catalogue; used only to corroborate a label spelling and product-number match, not present-day availability or formula. |
| **S09** | Ghana Standards Authority, [Shito (Pepper Sauce) standard notice](https://www.linkedin.com/posts/ghana-standards-authority_standard-shito-peppersauce-activity-6924670620886552577-pI4E). | Names shito as a distinct Ghanaian pepper-sauce product. | Regional product context only; no equivalence to Scotch Bonnet sauce is inferred. |
| **S10** | Ghana FDA, [Food Product Category & Parameter Requirements](https://fdaghana.gov.gh/wp-content/uploads/2024/02/LOCAL-PARAMETERS-1.pdf), non-emulsified sauces and dips. | Lists `Pepper Sauce`, `Shito`, and `Shito Mix` separately. | Regional product/category context only; no equivalence to Scotch Bonnet sauce is inferred. |
| **S11** | WP05, [Caribbean condiment product-boundary review](wp05-caribbean-condiments-review-20261009.md), coordinator integration result and source map. | Existing Jamaican jerk paste, Haitian epis/pikliz, and Trinidadian green seasoning decisions; jerk paste remains separate from dry seasoning, ready-made marinade, and jerk barbecue/table sauce. | Internal prior-review context; the accepted product identity is supported by S01–S10. |

## Decision boundary

The accepted integration adds the narrowly named Scotch Bonnet pepper-sauce identity with the English/French displays above and only the listed product-name aliases. Green and curry variants, fresh pepper, jerk paste/seasoning/sauces, shito, and generic hot/pepper sauce names remain outside it. It adds no forms, numeric values, recipe links, conversions, yields, or substitutions. See `docs/catalog/batches/wp05-scotch-bonnet-sauce-integration-20261011/README.md`.
