# WP02 Section D proposal: white wafers and the chocolate-composition boundary (R427)

**Date:** 2026-10-17
**Status:** Proposal-only; root review required before integration
**Disposition:** **Hold** a generic chocolate-wafer form and the source-specific white-wafers term as catalog data.

## Scope and recommendation

Section D still asks for review of chocolate bars, wafers, fèves, grated or chopped chocolate, and other product forms. Earlier Section D decisions already held generic wafer forms for lack of recipe demand and warned against treating product names such as melting wafers as composition evidence. This review narrows that open boundary to one current Canadian market example: **Barry Callebaut white wafers**, listed in a bilingual Canadian distributor catalog as **Barry Callebaut pastilles blanc**.

The evidence makes a compound-coating interpretation plausible, but does not tie the distributor item to a manufacturer formula or to a Canadian retailer’s separately listed “White Wafers” item. “White” describes appearance or product family, while the discs’ composition could be compound coating or real white chocolate. Neither the English product phrase nor the distributor’s exact French wording is a safe generic alias. The Québec sources distinguish real white chocolate from compound coating and distinguish wafer sheets from confectionery discs, but they do not establish a preferred generic French name for chocolate wafers.

The full manifest recipe scan found no wafer, pastille, or gaufrette ingredient row and no occurrence in any other serialized recipe text. There is no bundled recipe demand for this product or form.

**Recommendation:** retain the separate active identities for **white chocolate / chocolat blanc** and **compound coating / enrobage composé**. Do not create a white-wafers identity, add a wafers form to either reference, attach the source phrase as an alias, or alter a recipe. Keep the broad wafer hold already recorded in the Section D review. Reopen this exact SKU boundary only if a recipe or picker need identifies the product and a source ties its name to its composition.

## Exact proposed data delta

| Data | R427 delta |
|---|---|
| Ingredient references / identities | None |
| Aliases | None; do not add “white wafers”, “white chocolate wafers”, “pastilles blanc”, “pastilles de chocolat blanc”, or “pépites blanches” |
| Ingredient forms | None; do not add wafers/pastilles to white chocolate or compound coating |
| Recipe links or text | None |
| Research-ledger records | None; source IDs below are packet-local |
| Density, unit mappings, or package yields | None |
| Global or contextual substitutions | None |

This hold does not equate wafers with chips or declare that every product sold as white wafers is compound coating. It keeps the unresolved source-specific composition out of the global bilingual catalog.

## Prior decisions and current ownership

The earlier Section D chocolate-boundary review added **compound coating / enrobage composé** as its own identity, separate from chocolate, and kept “melting wafers,” brand names, and product names out of its aliases because they do not prove composition. The confectionery/fruit sweep held wafers and other non-attested chocolate presentations because no bundled ingredient line requested them. R424 separately reviewed generic chocolate chunks and is not reopened here.

At this audit snapshot, the package contains **1,724 active ingredient references**, **141 forms**, **56 legacy candidates**, and **2,083 research-ledger records**. Exact normalized terms were checked in the live references and forms, legacy candidates, ledger text, and used IDs.

| Existing owner | Current bilingual wording and relevant data | Boundary |
|---|---|---|
| **ingredient-ref-compound-coating** | EN “compound coating”; FR “enrobage composé”; no aliases, density, or unit mappings | Keep as the existing compound product identity. No wafer/pastille form is attached. |
| **ingredient-ref-white-chocolate** | EN “white chocolate”; FR “chocolat blanc”; EN alias “white chocolate chips”; FR alias “pépites de chocolat blanc”; no density or unit mappings | Keep the existing real white-chocolate identity and its chip wording. Do not attach unqualified wafer wording. |
| **ingredient-ref-couverture-chocolate** | EN “couverture chocolate”; FR “chocolat de couverture” | A separate chocolate product class, not a generic owner for wafer-shaped coating. |
| **ingredient-ref-graham-cracker-crumbs** | EN “graham cracker crumbs”; alias “graham wafer crumbs”; FR “chapelure de biscuits graham”; alias “chapelure de gaufrettes Graham” | A genuine wafer/biscuit-word collision in broad searches; it remains separate from chocolate products. |

No exact active reference, form, legacy candidate, or ledger owner was found for “white wafers”, “white wafer”, “chocolate wafers”, “wafers”, “pastilles blanc”, “pastilles de chocolat blanc”, or “gaufrettes de chocolat”. Existing ledger records do cover the compound-coating identity and the white-chocolate and white-chip rows; they do not document the candidate white-wafer product. No candidate ID is reserved.

The picker normalizes case, accents, ligatures, and punctuation, prefers whole word phrases, then uses partial matching. Replaying those rules against the current reference/form snapshot gives:

| Query | Current result | Impact |
|---|---|---|
| “white wafers”, “white chocolate wafers”, “chocolate wafers”, “wafers”, “pastilles blanc”, “pastilles de chocolat blanc” | No result | No current owner exists for the specific product phrase. Adding an alias would route an unresolved composition to a chosen identity. |
| “wafer” | **ingredient-ref-graham-cracker-crumbs** | The existing “graham wafer crumbs” alias is returned. |
| “gaufrette” or “gaufrettes” | **ingredient-ref-graham-cracker-crumbs** | The existing French Graham-wafer alias is returned. |
| “pépites de chocolat blanc” | **ingredient-ref-white-chocolate** and its white-chocolate-chips form | Preserve the established chip wording; do not broaden it to “pépites blanches”. |

The OQLF term “feuille de gaufrette” is for a wafer sheet in bakery and pastry. It does not supply a French name for chocolate coating discs. The distributor’s source wording “Barry Callebaut pastilles blanc” is recorded as printed, including its unidiomatic agreement; it is not promoted to canonical French or corrected into the unverified “pastilles de chocolat blanc”.

## Complete bundled recipe corpus scan

The package manifest lists **114 recipe JSON files** containing **1,123 ingredient rows**. Every manifest-listed file was scanned across every serialized string field, including descriptions, instructions, ingredient text, preparation, and notes. A separate scan checked each ingredient row’s original text, ingredient name, preparation, and notes.

The scan searched for wafer and chocolate-wafer wording in both languages, including “white wafer(s)”, “chocolate wafer(s)”, “pastille(s) blanc”, “pastille(s) de chocolat blanc”, “pastille(s) mi-sucré”, “gaufrette(s)”, and close product variants. Results:

- **0** hits in all recipe text fields.
- **0** hits in ingredient rows.
- **0** instruction or description mentions.
- **0** ingredient rows requesting chocolate wafers, white wafers, pastilles, or gaufrettes.

The existing “graham wafer crumbs” catalog alias is not recipe demand; the scan found no “wafer” text in the bundled recipes. There is no recipe relink or form hint to add.

## Measurement and substitution status

The current white-chocolate and compound-coating references have defaultDensity null and empty unitMappings. The existing white-chocolate chips and melted forms have densityGPerMl null; there is no wafer form. The ledger retains two source-specific white-chip portions, each **1 cup = 170 g**: a historical USDA Home and Garden Bulletin 72 entry and a King Arthur Ingredient Weight Chart row. Both observations are explicitly about white chocolate chips and are not active density or unit conversions. They do not establish a wafer or compound-coating measure.

The Tootsi 25 lb package and Save-On-Foods 100 g retail listing are package-specific facts, not a cup measure, density, reusable package-yield record, or product-code crosswalk. The only current package-yield record belongs to canned black beans. Both global and contextual substitution files contain **zero rules**. No ratio supports substituting compound coating for real white chocolate, wafers for chips, or a product-specific white wafer for another white chocolate form. Keep all measurement and substitution data unchanged.

## Source register and evidence limits

Sources were accessed on 2026-10-17. These packet-local source IDs are not shared-ledger records.

| ID | Source and evidence used | Limit |
|---|---|---|
| **WP02-D-WAFERS-R427-20261017-S01** | Canadian Food Inspection Agency, [Labelling requirements for confectionery, chocolate and snack food products](https://inspection.canada.ca/en/food-labels/labelling/industry/confectionery-chocolate-and-snacks) and [French version](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/confiseries-chocolat-grignotines). The guidance connects standardized chocolate common names to composition standards and says compound coatings look like chocolate but do not have chocolate’s composition. | Authoritative Canadian identity boundary; it does not classify the Tootsi product or establish a generic wafer form. |
| **WP02-D-WAFERS-R427-20261017-S02** | Office québécois de la langue française, [chocolat blanc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8420754/chocolat-blanc). The entry defines white chocolate using cocoa butter, sugar, and milk ingredients and gives the English equivalent “white chocolate”. | Québec terminology and product-class evidence, not evidence about a wafer SKU. |
| **WP02-D-WAFERS-R427-20261017-S03** | Office québécois de la langue française, [feuille de gaufrette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488278/feuille-de-gaufrette). Preferred term “feuille de gaufrette” corresponds to “wafer sheet” in bakery and pastry. | Supports the baked wafer-sheet sense; does not name chocolate discs. |
| **WP02-D-WAFERS-R427-20261017-S04** | Tootsi Impex, [Canada catalog PDF, 2026](https://www.tootsi.com/forms/TOOTSI_CATALOG_CANADA.pdf). Under “Compound Baking Chocolates / Chocolats pâtissiers composés”, item 10846 is listed as “Barry Callebaut white wafers / Barry Callebaut pastilles blanc”, 25 lb / 11.34 kg. | Current Canadian bilingual distributor product wording and category context. No manufacturer SKU, ingredient declaration, or technical composition is provided for the item. |
| **WP02-D-WAFERS-R427-20261017-S05** | Save-On-Foods, [Barry Callebaut CLBAUT White Wafers](https://www.saveonfoods.com/sm/pickup/rsid/6630/product/barry-callebaut-clbaut-white-wafers-id-28904), product 28904, 100 g. The listing calls them sweet thin discs and gives sugar, modified palm or palm-kernel vegetable fat, skim milk powder, whey powder, soy lecithin, and natural vanilla extract. | Retailer evidence makes a compound-like composition plausible, but the page warns product information may be inaccurate and does not link this retail listing to Tootsi item 10846 or a manufacturer formula. No French product label is shown. |
| **WP02-D-WAFERS-R427-20261017-S06** | Barry Callebaut, [Sweet Classic White – Fully Hydro](https://www.barry-callebaut.com/en-PH/manufacturers/products/barry-callebaut-s00-hp27-wnv/S00-HP27-WNV-000), manufacturer SKU S00-HP27-WNV-000. The manufacturer identifies it as a white compound coating, in its compounds/coatings range, with 27.4% vegetable fat. | Primary example of a white compound coating, but not identified as the catalog’s white-wafer product. |
| **WP02-D-WAFERS-R427-20261017-S07** | Callebaut, [White Chocolate W – 2.5 kg Callets](https://www.callebaut.com/en-CA/products/callebaut/w/W-2B-U76), Canadian manufacturer page. It identifies product W as white chocolate/callets and reports 26.2% dry cocoa solids and 28.8% dry milk solids. | Primary real-white-chocolate comparator showing that callets are a shape of white chocolate; shape alone does not prove a compound composition. |
| **WP02-D-WAFERS-R427-20261017-S08** | Office québécois de la langue française, [pépite de chocolat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898216/pepite-de-chocolat), updated 2026. It defines a chocolate chip and gives the preferred French terms “pépite”, “brisure”, and “grain de chocolat”. | Supports the existing chip wording only; it does not make wafer discs chips or establish “pastille” as a generic chocolate term. |

## Evidence gaps and follow-up trigger

- No manufacturer page, formula, or product code ties the Save-On-Foods retail item to Tootsi item 10846.
- Tootsi supplies a bilingual catalog title and section heading, but not an exact Québec-preferred generic French term or a product composition.
- The retailer’s ingredient list supports only its own listing and carries an accuracy disclaimer.
- No bundled recipe requests the product, so there is no line-level product need or measure to resolve.
- Existing white-chip observations are not transferable to wafers; no wafer density, volume measure, package yield, or substitution ratio is supported.

Keep the specific white-wafer term and generic chocolate-wafer form held. If a future recipe names the product, first confirm its composition and product-code mapping. Use the existing compound-coating identity only when that composition is established, or the existing white-chocolate identity when the product meets the white-chocolate class. Revisit a physical form and its Québec name separately, and require separate evidence before activating measurements or substitutions.
