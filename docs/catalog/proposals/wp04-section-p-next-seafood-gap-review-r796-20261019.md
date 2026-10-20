# WP04 Section P — dried flatfish powder identity review (R796)

- **Review and source-access date:** 2026-10-19.
- **Open checklist:** [Section P fish powder, fish balls, and surimi item](../../RecipeBook-global-ingredient-catalog-plan.txt#L8634).
- **Research question:** Does the Canadian/Québec market usage of `dried flatfish powder` / 大地魚粉 support one bounded food-ingredient identity, or should the wording remain folded into generic fish powder or a fish-species name group?
- **Recommendation:** Add one identity-only, species-neutral product reference for **dried flatfish powder / poudre de poissons plats séchés**. Keep it separate from generic `fish powder`, Bonga powder, dried bonito, and the active flounder and sole market-name groups.
- **Boundary:** This packet covers the culinary powder named `dried flatfish powder` or 大地魚粉 only. It does not identify the fish species or species mix, assign the powder to one species group, establish a universal recipe or ingredient panel, or reopen the generic fish-powder, fish-ball, or surimi decisions.
- **Status:** Integrated on 2026-10-19 as an identity-only reference with one English alias. The new reference, ledger record, and source IDs are allocated; see the [R794–R796 integration README](../batches/wp02-wp03-wp04-r794-r796-gap-review-integration-20261019/README.md). No software tests were run after integration because the database change only adds JSON data, per `AGENTS.md`.

## Finding

There is a distinct, source-backed Canadian food-market term for a powder made from dried flatfish. T&T lists `Sunnymark Dried Flatfish Powder` in English and `新唛大地鱼粉` in Chinese under the same SKU, `51369401`; its T&T storefront on Instacart repeats `Sunnymark Dried Flat Fish Powder`. A current Hong Kong government small-volume-exemption list independently names `安記大地魚粉 / On Kee Dried Flatfish Powder`. In the Toronto and Markham area, a Chinese-language retailer lists 大地魚粉 for cooking, while Markham restaurant Kwan Kee describes its broth as containing “dried flounder fish powder” and gives 大地魚 in the paired Chinese description. Its retail collection also lists a `Dried Flounder Fish Powder Retail Bottle`. These sources establish a recognizable product name and culinary use, not a universal composition or a single species.

Hong Kong's Centre for Food Safety gives a matching culinary explanation: 大地魚粉 may be made by baking dried 大地魚 flesh until crisp, tearing it into small pieces, and grinding it; the powder is used as a flavouring in a lotus-root patty. This is an official recipe description, not a specification for T&T's or EasyFun's retail item. The OQLF's 2026 terminology entry uses **poissons plats** in common French for flatfishes and lists plies, soles, turbots, and halibuts within the group. It supports a cautious descriptive French label, while ruling against inferring one species from `flatfish`.

This resolves a narrow product identity without making a generic `fish powder / poudre de poisson` row. R190 held the generic phrase because retail titles did not establish a common powder scope. Here, `flatfish` is part of the product name, a local restaurant uses a flounder-qualified phrase, and a government culinary source documents the named 大地魚 powder's use. The resulting row must stay specific to that named flatfish-powder class; no unqualified fish-powder alias is proposed.

## Product and naming scope

| Evidence or term | Supported scope | Catalog treatment |
|---|---|---|
| T&T `Sunnymark Dried Flatfish Powder` and `新唛大地鱼粉` | T&T's English and Chinese product records use the same SKU, `51369401`, and package size, 110 g. The English product page is JavaScript-gated in a text browser; its indexed product title and current Instacart T&T listing corroborate the English name. The Chinese product page is likewise JavaScript-gated; the indexed record provides the matching Chinese name and SKU. Neither page exposes an ingredient panel. | Use the English term `dried flatfish powder` as the display name. Treat the Chinese wording as source evidence, not an app alias. Do not treat package size as a measure. |
| Hong Kong Centre for Food Safety's 2026 SVE product list | The government list pairs `安記大地魚粉` with `On Kee Dried Flatfish Powder` and identifies On Kee as the brand. | This is an official bilingual product-name record, not an ingredient declaration or species determination for the Canadian T&T product. |
| EasyFun Toronto listing for 香港直飛純正大地魚粉 | A Toronto-area Chinese retailer uses 大地魚粉 for a product marketed for soups, noodles, congee, vegetables, and meat seasoning. It gives a seller-specific small-spoon suggestion and says the product is imported from Hong Kong; those are seller claims, not a package label or shared specification. | Supports Canadian culinary-market relevance and the product name. Do not infer origin, purity, composition, or a standard spoon amount for all products. |
| Kwan Kee Markham product and broth wording | Its Markham retail collection lists a `Dried Flounder Fish Powder Retail Bottle`; its English restaurant page says the broth includes “dried flounder fish powder,” while the paired Chinese description says 大地魚 is used in the broth, without repeating 粉. | The exact English phrase may be an English alias for this powder identity. The indexed retail item was marked sold out in the reviewed snapshot; its title is identity evidence, not current availability, a direct bilingual label, or a species assignment. |
| Hong Kong CFS recipe | Describes making 大地魚粉 from dried fish flesh by baking until crisp and grinding; uses it as a savoury addition to lotus-root patties. It does not provide an ingredient panel or identify a species. | Supports the bounded culinary product concept and direct use as a seasoning ingredient. Do not transfer the described process to every retail powder. |
| OQLF `pleuronectiformes` | The 2026 GDT entry recognizes `poissons plats` in common usage and notes plies, soles, turbots, and flétans within the order. | Use `poudre de poissons plats séchés` as a descriptive French display, not as a source-attested retail label or a taxonomic determination for the package products. |
| Generic fish powder and adjacent active references | The existing Bonga identity is species-qualified; dried bonito is a separate identity with its own powder form. Generic fish powder remains held by R190. Flounder and sole are active market-name groups, each explicitly scoped across several species. | Keep every existing identity unchanged. Do not alias this row to `fish powder`, `poudre de poisson`, `Bonga`, `bonito`, `flounder / plie`, or `sole`. |

The proposed identity is a named product class, not a claim that all products use one recipe. No reviewed consumer package or manufacturer ingredient declaration reveals the fish species, fish part, salt or additive content, smoking, or other processing for the T&T and EasyFun listings. The CFS recipe and restaurant menu corroborate what the product term means in culinary use; they do not fill those product-label gaps.

## Prior-work boundary

- [R190 generic fish-powder review](wp04-section-p-generic-fish-powder-boundary-review-r190-20261016.md) holds unqualified `fish powder / poudre de poisson` because current retail listings do not establish one shared composition. This proposal does not create that generic row or use Bonga, anchovy, stock powders, fish meal, or bonito as evidence for it.
- [R280 flounder market-group review](wp04-section-p-flounder-market-group-review-r280-20261016.md) and [R277 sole market-gap review](wp04-section-p-sole-market-gap-review-r277-20261016.md) establish broad, species-neutral market-name groups. They do not identify the species or source fish in this powdered product. Keep the powder as its own processed-product identity, without a form or alias on either group.
- Existing fish balls remain their own formed-fish identity. Generic surimi remains unresolved; the recent crab-flavoured surimi-sticks hold and other formed-fish product decisions do not concern powder.
- [R793 water-packed canned-salmon form review](wp04-section-p-canned-salmon-in-water-form-review-r793-20261019.md) adds one packing-medium form under canned salmon. It does not cover dried powder and is not duplicated here.

## Ownership, picker, and corpus audit

At this read-only snapshot, the bundled package has **1,879 ingredient references**, **197 forms**, and **114 manifest-listed recipe files with 1,123 ingredient rows**. The legacy import file has **56 candidates**; the research ledger has **2,285 records**.

At the proposal snapshot, the exact-phrase and focused-archive audit found no owner for `dried flatfish powder`, `flatfish powder`, `dried flounder fish powder`, `poudre de poissons plats séchés`, 大地魚粉, or 大地鱼粉 in active references, forms, legacy identities, or ledger records. The reference, record, and source IDs and the nine product/terminology URLs were then unallocated. Root integration has since added the reference and ledger row and registered those nine source URLs. The adjacent active rows remain:

| Current owner | Live state | Boundary |
|---|---|---|
| `ingredient-ref-bonga-dried-fish-powder` | `Bonga dried fish powder / poudre de poisson Bonga`, `PROTEIN`, no aliases. | Keep the specific fish and its existing source ownership. Do not change it into generic or flatfish powder. |
| `ingredient-ref-dried-bonito` and `ingredient-form-dried-bonito-powder` | Dried bonito (katsuobushi), with an attached species/product-specific powder form. | Keep bonito separate; its powder form is not a generic fish-powder form. |
| `ingredient-ref-flounder-market-group` | `flounder (name used for multiple fish species) / plie (nom utilisé pour plusieurs espèces de poissons)`. | Retain as a broad fish-name group; the powder sources do not identify one taxon. |
| `ingredient-ref-sole-market-group` | `sole (market name used for multiple fish species) / sole (appellation commerciale utilisée pour plusieurs espèces de poissons)`. | Retain as a separate market group; no source assigns this powder to sole. |
| `ingredient-ref-fish-balls` and unresolved `candidate-surimi-product-boundary` | Active generic fish balls; the bare surimi identity remains unresolved. | No powder form, alias, or relationship is proposed. |

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns full contiguous word-phrase matches before using a substring fallback. With the proposed English display and the one exact source-attested alias, `dried flatfish powder` and `dried flounder fish powder` would select the proposed row. The shorter `flounder` search would return the existing labelled market group and this separately labelled powder, without selecting a species. `fish powder` would return Bonga plus the new powder through the full alias phrase; it would not resolve to a new generic identity. `poudre de poissons plats séchés` would select the new row. Add no standalone `fish`, `flounder`, `sole`, `fish powder`, `poudre de poisson`, or `poisson` alias. The search normalizer discards Chinese-script characters, so Chinese names are documented as evidence rather than saved as nonfunctional aliases.

A case-insensitive scan of all **114** files in the manifest and their **1,123** ingredient rows found no matches for `flatfish powder`, `dried flatfish`, `dried flounder fish powder`, 大地魚粉, 大地鱼粉, or the proposed French terms. No recipe link, quantity, or substitution is proposed.

## Measurement and substitution limits

The retail pages show package sizes, not household measures or conversions. EasyFun's seller suggests a “small spoon” for its product in several dishes, but does not define a spoon, named recipe, or transferable quantity. The CFS recipe gives no dose for the powder. No reviewed source supports a standard mass/volume amount, density, serving, yield, package-to-recipe conversion, or substitution.

Do not infer a substitution between dried flatfish powder and generic fish powder, Bonga powder, dried bonito powder, anchovy powder, fish-stock or compound seasoning powders, fish sauce, fresh fish, fish balls, or surimi. Add no form, density, unit mapping, yield, measure, conversion, warning, recipe-line link, or substitution.

## Integrated delta

The accepted data matches the bounded recommendation below. The reference and ledger identifiers are allocated in the shared catalog and ledger.

| Field | Recommended value |
|---|---|
| Reference key | `ingredient-ref-dried-flatfish-powder` |
| Category | `PROTEIN` |
| English display | `dried flatfish powder` |
| French display | `poudre de poissons plats séchés` — descriptive Québec French based on OQLF's `poissons plats`; not a verified package label. |
| English aliases | `dried flounder fish powder` only, from the Markham restaurant's exact English wording. |
| French aliases | None. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []`. |
| Forms and recipe links | None. |
| Ledger state | `recordType: ingredient_reference`; `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: researched_no_supported_substitute`. |
| Ledger source IDs | Allocated IDs `WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S01` through `-S09`. Existing flounder/sole market-group evidence remains with its current ledger owner. |
| Observations | None. Product package weights and an undefined small-spoon seller suggestion are not reusable measures. |

Do not add an unqualified `fish powder` or `poudre de poisson` reference, species assignment, brand alias, Chinese alias, recipe link, measure, conversion, or substitution.

## Source register

The product and official terminology sources were checked online on 2026-10-19. Source IDs S01–S09 were allocated during integration; R01 remains a proposal-local read-only audit reference.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S01** | T&T Supermarket, [Sunnymark Dried Flatfish Powder (110 g)](https://www.tntsupermarket.com/eng/51369401-sunnymark-dried-flatfish-powder.html), product page / indexed product record 51369401. | The first-party product title identifies the powder. Direct text browsing is JavaScript-gated; the indexed record returns the exact title. Used for name only, not composition or package-size evidence. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S02** | T&T Supermarket, [新唛大地鱼粉 (110g)](https://www.tntsupermarket.com/chs/51369401-sunnymark-dried-flatfish-powder.html), Chinese product page, SKU 51369401. | The indexed page displays the Chinese product name and the same SKU and 110 g package size as the English product page. Direct text browsing is JavaScript-gated. Used for the product-name crosswalk only; no ingredient declaration is exposed. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S03** | Instacart/T&T, [Sunnymark Dried Flat Fish Powder](https://www.instacart.ca/store/products/104143990-sunnymark-dried-flat-fish-powder-110-g). | The T&T storefront names the item as `Sunnymark Dried Flat Fish Powder`; its listing was indexed on the review date. This is Canadian retail availability/title corroboration, not a manufacturer label or ingredient source. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S04** | EasyFun Toronto, [香港直飛純正大地魚粉](https://easyfun.ca/product/104754/), product description and store/pickup information. | Toronto retailer page uses `大地魚粉` for a cooking ingredient and lists uses in noodles, soups, congee, vegetables, and meat seasoning. It includes an undefined small-spoon seller suggestion and seller claims about purity/origin; neither is treated as a general specification or measure. The page provides no ingredient panel or scientific species. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S05** | Kwan Kee Bamboo Noodle Markham, [restaurant description](https://kwankeebamboonoodle.ca/), soup-base description and Markham location. | The English page describes broth with `dried flounder fish powder`; the Chinese text says 大地魚 is used in the broth but does not repeat 粉. Supports local culinary use and the English phrase only; not a package label or species determination. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S06** | Hong Kong Centre for Food Safety, [Food Safety Bulletin, 2018 issue 1](https://www.cfs.gov.hk/tc_chi/multimedia/multimedia_pub/files/public_201801.pdf), page 6, chef's note 8 and pages 6–7 recipe. | Says 大地魚粉 can be made by baking dried fish flesh until crisp, tearing it into pieces, and grinding it; the powder is added to lotus-root patty filling for flavour. Official culinary evidence for this named product concept, not a current retail-product formula or taxonomic ID. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S07** | OQLF, [pleuronectiformes (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26589618/pleuronectiformes), last updated 2026. | Lists `poissons plats` as a term used in common contexts and names plies, soles, turbots, and halibuts among the order. Supports the descriptive French display and the multi-species boundary, not the identity of a specific package fish. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S08** | Kwan Kee Bamboo Noodle, [All Products](https://kwankeebamboonoodle.ca/collections/frontpage), retail collection. | The indexed product list names a `Kwan Kee Dried Flounder Fish Powder Retail Bottle`. The reviewed snapshot marked the item sold out; direct page opening returned a cache miss. Supports the exact English alias and retail-product scope, not current availability, product composition, a standard measure, or a species determination. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-S09** | Hong Kong Centre for Food Safety, [List of Small Volume Exemption Products](https://www.cfs.gov.hk/tc_chi/programme/programme_nifl/files/SVE_exempted_product.pdf), generated 2026-10-16, page 26, product record `21-006404`. | The current government list pairs the brand `安記海味 / On Kee` and food name `安記大地魚粉 / On Kee Dried Flatfish Powder`. Supports a product-name crosswalk for this powder class; not an ingredient declaration or species determination for T&T's product. |
| **WP04-SECTIONP-DRIED-FLATFISH-POWDER-R796-20261019-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L8634), active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipe files, focused prior proposals/batches, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Proposal-local audit only. Records the read-only identity, source-ownership, picker, archive, and recipe-demand review; it is not a source or a shared ledger record. |

## Bounded recommendation

Accept one new identity-only, species-neutral **dried flatfish powder / poudre de poissons plats séchés** product reference, with the exact English restaurant phrase `dried flounder fish powder` as its only alias. The product-name and culinary evidence is relevant to Canadian/Québec use, while the official OQLF and CFS sources constrain translation and product scope. Keep all species, package composition, recipe amounts, forms, measures, conversions, yields, and substitutions unresolved. This proposal advances only one narrow powder identity; the broader Section P fish-powder, fish-ball, and surimi checklist remains open.
