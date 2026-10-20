# WP04 Section P — cuttlefish ink / encre de seiche product-boundary review (round 35)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only seafood product-identity, Canadian and Québec-facing naming, exact ownership, picker, recipe-demand, and product-measure review.
- **Recommendation:** Hold a separate cuttlefish-ink identity until a bundled recipe selects the product. Keep it distinct from cuttlefish flesh, squid/calamari, and mixed squid-or-cuttlefish ink listings; add no active row, alias, form, recipe link, measurement, conversion, yield, or substitution now.
- **Write scope:** This proposal file only. No shared catalog, ledger, plan, roadmap, recipe, or code file changed.

## Open product boundary and bounded decision

The Section P checklist still leaves preserved seafood product states and other regional seafood open. The [cuttlefish identity review](wp04-section-p-cuttlefish-identity-gap-sweep-20261012.md) explicitly kept **cuttlefish ink / encre de seiche** separate from the animal identity and said ink was not requested by the recipe bundle. No focused ink-product decision was made there. This packet advances only the commercial cuttlefish-ink boundary; it does not reopen whole cuttlefish, squid/calamari, fish powders, fish balls, surimi, roe, or other cephalopod products.

Current Canadian-facing product listings use **cuttlefish ink / encre de seiche** for separate jars, and a Canadian fishmonger also lists a French-titled sterilized product. Nortindal’s manufacturer pages describe a prepared product made with cuttlefish ink, water, salt, and sodium carboxymethylcellulose; the company sells both a 90 g room-temperature jar and a 500 g frozen product. This supports the named product boundary and observed bilingual retail wording, but it does not establish an OQLF-preferred terminology pair, a taxon below the seller’s “cuttlefish” wording, or one formulation across sellers. [S01–S03]

Keep a candidate `cuttlefish ink / encre de seiche` separate from the active whole-animal `cuttlefish / seiche` and `calamari / calmar` references. Do not model ink as a physical form of cuttlefish flesh. Do not add `squid ink / encre de calmar` as aliases: another current Canadian product page labels one 500 g jar **“Squid or Cuttlefish Ink”** and gives no ingredient declaration to resolve which source it contains. Do not generalize a seller’s prepared ink, formula, or package to all squid, cuttlefish, cephalopod species, inks, sauces, or ink-containing foods. [S03–S04]

The live bundle has no ink recipe request, and adding a display-only candidate changes both whole-cuttlefish searches and the generic `ink` query. Hold the candidate until a bundled recipe identifies the product and its package or recipe source resolves whether it is cuttlefish ink, squid ink, or a mixed-source product.

## Prior work and exact ownership

The [cuttlefish review](wp04-section-p-cuttlefish-identity-gap-sweep-20261012.md) assigned the whole-animal `cuttlefish / seiche` identity and explicitly left ink outside it. The [preserved-fish product-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) keeps universal preservation forms inactive without an exact recipe or product request; it does not allocate this ink product. No dedicated cuttlefish-ink proposal or active owner was found.

Exact normalized-name checks covered active reference names and aliases, every form label and match term, legacy candidate strings, and ledger record IDs. The live snapshot contained **1,365 active references, 100 forms, 64 legacy candidates, and 1,699 ledger records**.

| Candidate term or ID | Active reference / form owner | Legacy owner | Ledger owner |
|---|---|---|---|
| `cuttlefish ink`; `encre de seiche` | None | None | No dedicated ink-product record ID |
| `squid ink`; `encre de calmar`; `ink sac` | None | None | None |
| `ingredient-ref-cuttlefish-ink`; `candidate-cuttlefish-ink` | None | None | None |
| `WP04-SECTIONP-CUTTLEFISH-INK-20261013-R35-S…` | Not applicable | Not applicable | Unallocated; prefix checked against the live catalog archive |

The active `ingredient-ref-cuttlefish` is displayed as **cuttlefish / seiche**. The separate active `ingredient-ref-calamari` is displayed as **calamari / calmar** and owns the English alias `squid`. Neither reference nor any form owns an ink phrase. A ledger decision for whole cuttlefish mentions ink only to keep the product out of that animal identity; it is not an ink-product allocation.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases are tried first, then substring fallback. It compares the live 1,365 references and 100 forms with one hypothetical display-only row **cuttlefish ink / encre de seiche**, without aliases or forms. The candidate is not active.

| Query | Current result | Hypothetical result | Picker effect |
|---|---|---|---|
| `cuttlefish ink` | None | Cuttlefish ink / encre de seiche | Exact English product phrase becomes a singleton. |
| `encre de seiche` | None | Cuttlefish ink / encre de seiche | Exact French product phrase becomes a singleton. |
| `cuttlefish`; `seiche` | Cuttlefish / seiche | Cuttlefish / seiche plus cuttlefish ink | The animal query would visibly return the separate ink product as well. |
| `squid`; `calamari`; `calmar` | Calamari / calmar | Calamari / calmar | Unchanged; no squid or calamari alias is proposed for the ink. |
| `squid ink`; `encre de calmar` | None | None | Mixed-source retail wording does not become a synonym for the proposed cuttlefish product. |
| `ink` | Nine substring-fallback results, including almond beverage, Chinkiang vinegar, einkorn, pink pepper, and soy beverage | Cuttlefish ink only | The candidate’s complete `ink` word matches first and suppresses the unrelated substring fallbacks. |

The qualified product searches would be useful if a recipe requested cuttlefish ink. Bare `seiche` and `cuttlefish` would start returning an animal and its distinct ink product; bare `ink` would become a singleton despite other cephalopod inks remaining unallocated. Keep the candidate out of the picker until bundled demand selects the product and the broad-query behavior is reconsidered.

## Bundled recipe demand

The live manifest lists **114 recipe files and 1,123 ingredient rows**. The scan covered each parsed recipe document and all ingredient-row fields. Normalized search checked `cuttlefish ink`, `encre de seiche`, `squid ink`, `encre de calmar`, `ink sac`, and the neighboring cuttlefish/squid names. It found **zero matching recipe files and zero matching ingredient rows** for those ink-product terms.

One nearby row requests **140 g sliced calamari**. It links to the existing calamari reference and mentions no ink, so it supplies no demand, product match, or recipe-line link for cuttlefish ink. Manufacturer-published recipe titles show possible culinary uses, but they are outside the bundled recipe set and the reviewed product-page summaries supply no recipe quantity. [S03]

## Product state, numeric limits, and substitutions

The current listings describe different product presentations: Costco Canada lists a 500 g sterilized, ready-to-use jar; Capital Fish Market lists a 90 g product titled `encre de seiche stérilisée`; Nortindal describes a 90 g room-temperature jar and a separate 500 g frozen product. Nortindal’s own ingredient statement names cuttlefish ink, water, salt, and sodium carboxymethylcellulose; this is one producer’s prepared product, not a universal composition. Seafood Online Canada’s 500 g frozen listing groups “squid or cuttlefish ink” and provides no ingredients or nutritional declaration. Treat all weights as package sizes only. [S01–S04]

No reviewed exact-product source establishes a kitchen portion, volume-to-mass conversion, density, package yield, or recipe amount. Keep density unset and unit mappings empty. Do not derive a usable amount from package weight, a seller’s “small amount” wording, or an external recipe title.

No reviewed recipe or source validates replacing cuttlefish ink with squid ink, mixed-source cephalopod ink, food colouring, black salt, whole cuttlefish, or another seafood product. The shared colour or culinary use does not establish a directed substitution or equal amount. Add no global or contextual rule and no recipe-line substitution link.

## Recommended next action

Keep the cuttlefish-ink candidate unallocated and Section P open. Revisit when a bundled recipe names cuttlefish ink or squid ink and its source or package label establishes the intended product. Then decide whether to add a separate ingredient identity, preserve any mixture or stabilizer context, and rerun the picker projection before creating aliases or numeric behavior.

## Source register

Sources were accessed on 2026-10-13. Source IDs are local to this proposal.

| ID | Source | Evidence used | Limit |
|---|---|---|---|
| **WP04-SECTIONP-CUTTLEFISH-INK-20261013-R35-S01** | Costco Canada, [French listing: Taste for Luxury — Encre de seiche, 500 g](https://www.costco.ca/p/-/taste-for-luxury-cuttlefish-ink-500-g/4000414553?langId=-25) and [English listing: Taste for Luxury Cuttlefish Ink, 500 g](https://www.costco.ca/p/-/taste-for-luxury-encre-de-seiche-500-g/4000414553) | Current Canadian retail pages use the bilingual product terms and list a 500 g sterilized, ready-to-use jar made in Italy. | Retailer SKU wording and package data; page does not identify an exact cephalopod species or provide its ingredient declaration. |
| **WP04-SECTIONP-CUTTLEFISH-INK-20261013-R35-S02** | Capital Fish Market Ltd., [Encre de seiche stérilisée](https://www.capitalfish.ca/fr/product-page/encre-de-seiche-st%C3%A9rilis%C3%A9), product title and SKU 8436015207578. | French-language Canadian fishmonger product listing gives a 90 g pack under the phrase `encre de seiche stérilisée`. | Retail listing, not a product specification; does not identify species, ingredients, or recipe usage. |
| **WP04-SECTIONP-CUTTLEFISH-INK-20261013-R35-S03** | Nortindal, [Cuttlefish ink jar, 90 g](https://www.nortindal.com/en/product/cuttlefish-ink-room-temperature-jar-90g/) and [Encre de seiche, frozen box, 500 g](https://www.nortindal.com/fr/produit/encre-de-seiche-boite-500g-congele/), product headings, ingredient statements, and storage sections. | Manufacturer identifies its product as cuttlefish ink; lists ink, water, salt, and sodium carboxymethylcellulose; distinguishes a room-temperature sterilized jar from a frozen 500 g format; and gives culinary use descriptions. | One manufacturer’s products only. No exact species, universal formulation, app recipe, or recipe quantity is established. |
| **WP04-SECTIONP-CUTTLEFISH-INK-20261013-R35-S04** | Seafood Online Canada, [Ink / squid or cuttlefish, 500 g jar frozen](https://seafoodonline.ca/products/ink-squid-or-cuttlefish-ea-500g-jar), product title and description. | Canadian seafood seller groups squid and cuttlefish ink in one product title, says the 500 g product is from Chile, and requests an email for ingredient or nutrition information. | Seller does not distinguish which ink is in a given jar and supplies no ingredient declaration; this SKU must not be generalized to the specifically named cuttlefish product. |
