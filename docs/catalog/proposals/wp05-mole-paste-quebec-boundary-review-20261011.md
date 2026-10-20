# WP05 Section Z: Mexican mole paste identity and Québec naming review

## Scope and status

- **Review and source-access date:** 2026-10-11.
- **Scope:** Decide whether the open “Mole pastes” item supports a narrow product identity, and delimit mole paste from prepared mole sauce, dry mole products, and regionally named varieties.
- **Status:** Proposal only. No seed, ledger, plan, roadmap, recipe, code, test, or README file is changed.
- **Proposal-local source IDs:** `WP05-MOLE-PASTE-QC-20261011-S01` through `S10`. These IDs are local to this document, not research-ledger IDs.
- **Plan context:** Section Z leaves “Mole pastes” open with adobo sauces, achiote paste, chipotles in adobo, and other Latin American condiments. A prior WP06 Mexico/Central America sweep says not to make a generic mole ingredient from a finished dish, but allows a separately labeled retail paste to be reviewed as its own product family.

## Recommendation

**Accept one identity-only, paste-state product candidate.** Keep its use narrow and preserve named variants as separate product names rather than aliases.

| Field | Recommendation |
|---|---|
| ID | `ingredient-ref-mole-paste` |
| Category | `SAUCE_AND_CONDIMENT` |
| English display | `mole paste` |
| Provisional Québec French display | `mole en pâte` |
| Aliases | None proposed |
| Forms and numeric data | None |

The Mexican product standard and an official Mexican regulation text distinguish mole products by presentation, including paste, powder, and liquid, and say product naming follows formulation and, where applicable, geographic origin. A current Doña María manufacturer catalog also lists mole paste and ready-to-serve mole in separate groups; it lists several distinct paste varieties within the paste group. Québec French retail pages retain the product headword *mole* in names such as **Mole mexicain** and **Mole verde**, but the reviewed Québec listings do not establish a settled French label for the paste state. Therefore `mole en pâte` is a transparent, provisional display, not an OQLF-approved or Québec-retailer-attested term. [S01–S08]

The candidate should cover only an ingredient line or retail product explicitly identified as mole paste. It is a source-bounded product family, not a claim that all mole pastes share a recipe, region, flavor, ingredient list, or preparation instructions. It does not absorb products merely described as mole, a finished mole sauce, a dry mole powder or mix, a regional subtype, or a mole dish.

## Product boundary and alias exclusions

| Neighbor or label | Boundary decision |
|---|---|
| `mole paste` / Spanish product-type phrase `mole en pasta` | Include only the paste-state product when the recipe or product source actually names paste. The 1982 Mexican standard uses `mole en pasta` for one mole presentation type. No alias is necessary for the proposed English display. Keep the Spanish phrase as source wording in this review; do not claim it is English or French. [S01] |
| Ready-to-serve or liquid mole | Keep outside. The standard/regulation text distinguishes liquid mole from paste; Doña María separates **Ready to serve mole** from **Mole paste**; its rojo foodservice product describes preparing the paste into a sauce. Do not alias `mole sauce`, `ready-to-serve mole`, `mole listo`, or `sauce mole` to paste. Product-specific directions are not transferable conversions. [S01–S02, S05–S06] |
| Dry mole powder, granulated/compressed mole, or dry mix | Keep outside. The standard/regulation text lists powdered mole as a separate presentation from paste. Do not add `mole powder`, `mole en polvo`, `mole mix`, or other dry-mix terms as aliases or conversions. A dry mix may be reviewed separately if an exact bundled line or candidate demands it. [S01–S03] |
| Named regional or recipe varieties | Do not add `mole rojo`, `mole negro`, `mole verde`, `mole amarillo`/`amarillito`, `mole poblano`, `mole oaxaqueño`, `coloradito`, `manchamantel(es)`, `chichilo`, `almendrado`, or `pipián`/`pipian` as aliases. Mexican government sources describe these as named styles with regional or ingredient differences. Doña María markets Traditional, Pipian, Verde, and Adobo as separate paste varieties; a Québec retailer also lists green mole paste and pipián paste separately. A given named product may be a mole paste, but its exact name is not synonymous with unqualified `mole paste`. [S04–S05, S09] |
| Pipián | Keep the qualified name separate. SADER discusses pipián as its own Puebla type; Doña María markets Mole Pipian inside its paste range; and the Laval listing separately names `La costeña pipian Paste`. These sources show naming overlap by maker, not a universal rule that pipián is an alias for mole paste. [S04–S05, S09] |
| Finished mole dishes, including mole de olla | Keep outside. A cooked dish or broth-based preparation is not a packaged paste ingredient. The prior WP06 regional review explicitly excluded mole verde and mole de masa as finished dishes from ingredient-reference scope. [S10] |
| Adobo, achiote paste, chipotles in adobo, and other sauces | Keep separate under their own product names. Their presence in the adjacent plan checklist does not establish mole-paste synonymy. |
| Bare `mole` | Do not add as an alias. A query for `mole` will still match the proposed display phrase under current whole-word search, but that search behavior does not make every mole dish, sauce, or variety interchangeable with mole paste. |

The product standard and regulation text describe mole formulas and appearances as variable and say naming should reflect composition and region where applicable. Profeco’s 2023 industrial-mole study likewise reports different formulas and distinguishes paste from ready-to-serve products. This supports a narrow paste family while leaving formula, region, and product subtype unresolved; it does not support one universal mole recipe. [S01–S03]

## Current catalog, ledger, and collision audit

The live package snapshot inspected on 2026-10-11 contains **964 ingredient references**, **53 ingredient forms**, and a manifest of **114 recipes with 1,123 ingredient rows**.

| Surface | Current finding |
|---|---|
| Active references and forms | No active reference, alias, or form exactly names `mole paste`, `mole en pasta`, `mole sauce`, `mole rojo`, `mole verde`, or `pipián`. The only active reference text containing the character sequence `mole` is French `chérimole` for cherimoya; it is not an exact name collision. |
| Search behavior | Search prefers whole-word phrase matches before substring fallback. If `ingredient-ref-mole-paste` is added, a bare `mole` query can match the word in its display name. Without a whole-word mole entry, the fallback can also surface `chérimole`; neither behavior implies a synonym. Keep the exact display and alias list narrow, and recheck picker results at integration. |
| Legacy candidates and ledger | No mole paste or named mole-product candidate/decision was found in `legacy-import-identities.v1.json` or the research ledger. Existing ledger source records mention SADER’s Oaxaca mole verde recipe only to document epazote and hoja santa as distinct ingredients; that cooked recipe does not establish a paste identity or recipe demand. |
| Candidate ID and source IDs | `ingredient-ref-mole-paste` and the proposal-local source-ID prefix were unused in the inspected package, ledger, proposals, and batches before this file was written. Recheck at integration. |
| Prior boundary review | `wp06-mexico-central-america-gap-sweep-20261009.md` rejects a generic mole identity derived from a prepared dish, while allowing a separately labeled retail paste to be reviewed. It also keeps named recipes, regional recados, and product forms source-bounded. |

## Recipe audit

All 114 manifest-listed recipe JSON files were scanned across their full text and ingredient lines for `mole`, `mole paste`, `mole en pasta`, French paste phrases, ready-to-serve/liquid mole, dry mole powder/mix, regional mole names, pipián, and adjacent product names.

| Search surface | Candidate matches |
|---|---:|
| Full recipe JSON files | 0 |
| Ingredient rows | 0 |

No bundled recipe link or recipe-specific amount is proposed. The source-backed product family can be reviewed independently of current bundled demand; the zero-hit scan only means there is no exact seed line to attach.

## Measurements, forms, and behavior

Add no density, unit mapping, form, conversion, package yield, cooking yield, recipe amount, substitution, or recipe link. The manufacturer’s instructions show how one specified Doña María rojo paste product is prepared into sauce; they do not establish a universal paste-to-sauce ratio. No product weight, serving count, package size, ingredient list, or ready-to-serve preparation is used to derive catalog data. [S05]

## Québec French and product wording

The Québec French sources reviewed preserve *mole* as a borrowed product headword: Metro lists **Mole mexicain La Costeña**, and Épicerie Tropica in Québec City lists **Mole verde - La Costeña** in French. Neither listing says that its product is paste. The Laval Épicerie La Hacienda list distinguishes English product labels for Doña María mole sauce, La Costeña green mole paste, and La Costeña pipián paste, but does not provide French product names. A targeted OQLF search did not surface a dedicated entry for mole paste or a Québec-preferred French equivalent. [S07–S09]

For coordinator review, keep the borrowed headword `mole` and qualify the state in the provisional display `mole en pâte`. Do not add `sauce mole`, `pâte de mole`, or `pâte pour mole` as aliases without a Québec product-label or terminology source that confirms that wording for this item. Recheck bilingual labeling at integration.

## Sources

All web sources below were accessed on 2026-10-11. Source details support the stated product boundary only; they do not establish transferable recipe behavior.

| ID | Source and locator | Claim used | Limit |
|---|---|---|---|
| **S01** | Secretaría de Economía, [NMX-F-422-1982: Productos alimenticios para uso humano — alimentos regionales — mole y sus variedades](https://www.economia-nmx.gob.mx/normas/nmx/1982/nmx-f-422-1982.pdf), classification and denomination sections. | The standard distinguishes powdered, paste, and liquid presentations and says naming should follow formula and, when applicable, geographic region. | A 1982 Mexican standard used here for source terminology and product-state boundaries; no claim is made about its current legal force in Canada or Québec. |
| **S02** | Secretaría de Salud, [Reglamento de Control Sanitario de Productos y Servicios](https://www.salud.gob.mx/unidades/cdi/rlgsmcsaeps.html), Article 998. | The official regulation text describes mole as a product that may be presented as paste, powder, or liquid, and says naming follows formula and, when applicable, geographic region. | Used as source terminology/context only; this review does not determine the provision’s current legal status. |
| **S03** | Procuraduría Federal del Consumidor (PROFECO), [Mole industrializado](https://www.profeco.gob.mx/revista/RevistaDelConsumidor_560_Octubre_2023.pdf), October 2023 quality study. | The study separately samples packaged paste and ready-to-serve moles and discusses formulation differences across products. | Its tested brands and formulations are a sample, not all mole products; no measurements or ingredient proportions are proposed here. |
| **S04** | Secretaría de Agricultura y Desarrollo Rural, [El mole, para chuparse los dedos](https://www.gob.mx/agricultura/articulos/el-mole-un-platillo-para-chuparse-los-dedos), 2025-09-14. | Describes mole styles as region- and tradition-dependent and lists Puebla and Oaxaca varieties, including pipián as a named Puebla preparation. | Government culinary overview; not a product standard or universal taxonomy of retail paste. |
| **S05** | Doña María, [Products](https://www.salsas.com/dona-maria/products/), current product catalog. | Separates Mole paste from Ready to serve mole and lists Traditional, Pipian, Verde, and Adobo paste products separately. | One brand’s product line; its groupings and varieties are not universal synonyms. |
| **S06** | MegaMex Foods Foodservice, [DOÑA MARIA Mole Rojo Authentic Mole Paste](https://www.megamexfoodservice.com/products/dona-maria-mole-rojo-authentic-mole-paste/), product preparation. | Calls the specific product a paste and describes preparing it into a sauce. | One foodservice SKU. Its package amounts and preparation directions are excluded from reusable conversions or a family formula. |
| **S07** | Metro Québec, [Mole mexicain La Costeña](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/salsa-et-guacamole/mole-mexicain/p/076397889368), French product listing. | Current Québec French retailer title uses `Mole mexicain`; the listed page does not identify paste state. | Product-name evidence only. The page returned a fetch restriction during review; the search-indexed listing was used only for its title and item description. |
| **S08** | Épicerie Tropica, Québec City, [Mole verde - La Costeña](https://epicerietropica.com/product/mole-verde/), French retailer listing. | Current French-language Québec product page uses the untranslated name `Mole verde` and lists it under seasonings, spices, and dried herbs. | Listing does not say paste or establish a general French term for mole paste. |
| **S09** | Épicerie La Hacienda, Laval, [online grocery list](https://www.epicerielahacienda.com/commande), mole-product section; local address and store identity on [Épicerie La Hacienda](https://www.epicerielahacienda.com/). | Current local retailer lists Doña María mole sauce, Doña María mole verde, La Costeña green mole paste, and La Costeña pipián paste as separately named products. | Product names are in English; this is evidence of local product distinctions and listings, not Québec French wording or manufacturer taxonomy. |
| **S10** | WP06, [Mexico and Central America ingredient-identity gap sweep](wp06-mexico-central-america-gap-sweep-20261009.md), mole and prepared-dish boundaries. | Prior review says not to derive a generic mole identity from a dish and permits review of a separately labeled retail paste. | Project review context, not independent culinary or product evidence. |

## Decision boundary

Recommend coordinator review of the identity-only `mole paste / mole en pâte` candidate for unqualified, explicitly paste-state products. Keep ready-to-serve mole sauce, dry mole products, regional names, pipián, finished mole dishes, and neighboring adobo/achiote/chipotle products outside its alias set. The French display remains provisional because Québec pages attest the borrowed headword *mole* but do not yet show a paste-specific French product label. The source set establishes a bounded product category; it does not establish a universal recipe, a type taxonomy for every region, or any numeric behavior.
