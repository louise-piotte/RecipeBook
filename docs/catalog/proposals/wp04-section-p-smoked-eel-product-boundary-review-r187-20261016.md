# WP04 Section P — smoked eel product-boundary review (R187)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Smoked eel / anguille fumée as a species-neutral finished-food market group.
- **Recommendation:** **Accepted and integrated** as identity-only ingredient-ref-smoked-eel, category PROTEIN, with no aliases, forms, measures, unit mappings, conversions, yields, recipe links, or substitutions.
- **Status:** Integrated into the shared reference catalog, research ledger, generated index, active plan, roadmap, and batch README. No forms, legacy identities, recipe links, or substitutions changed. No software tests were run because this change only adds database JSON data under AGENTS.md.
- **New shared-ledger source IDs:** WP04-SECTIONP-SMOKED-EEL-R187-20261016-S01 through S04; each identifies one new URL. Four existing source IDs are reused without reallocation.

## Why this is a distinct open gap

The active [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6064) still includes smoked fish and other preserved fish/seafood states. Its completed boundary review keeps universal preservation forms inactive unless an exact product or recipe request supports them. This proposal reviews only the distinct finished-food market group **smoked eel / anguille fumée**; it does not activate a universal smoked form or a generic eel identity.

The earlier [unqualified-eel review](wp04-unqualified-eel-identity-boundary-review-20261011.md) retains the broad eel identity question because CFIA applies Eel / Anguille to multiple taxa, while the OQLF entry scopes Québec food-fish anguille to American eel. That ledger candidate mentions smoked-eel products as evidence but does not allocate a smoked-eel row. The [R175 unagi kabayaki review](wp04-section-p-unagi-kabayaki-product-state-boundary-review-r175-20261016.md) also explicitly found no smoked-eel product/form owner and keeps smoked sliced unagi distinct from kabayaki. This proposal follows up on that unallocated market group without resolving or changing either earlier boundary.

Other preservation decisions are also separate: the [R167 smoked-mackerel group](wp04-section-p-smoked-mackerel-product-boundary-review-r167-20261016.md), [R180 smoked herring fillets in oil](wp04-section-p-smoked-herring-fillets-in-oil-boundary-review-r180-20261016.md), and [R184 smoked-cod group](wp04-section-p-smoked-cod-market-boundary-review-r184-20261016.md) concern different market products. The broader R184 batch keeps smoked cod distinct from other smoked fish. None allocates smoked eel, and none is reopened here.

Current Québec sources use the French product name anguille fumée. Frandon’s English and French lists identify the more specific retail wording smoked sliced unagi eel / anguille unagi tranchée fumée; Les Saveurs du Bas-Saint-Laurent lists a separate anguille fumée product with Québec points of sale; and other Québec sellers list the product by the same French base name. The products do not supply a shared scientific species, cut, smoke process, cure, or package basis. The market phrase supports a product-group identity while leaving those details product-specific. [S01–S04; reused Frandon source below]

## Product identity and boundaries

| Evidence or nearby identity | What it supports | Limit and disposition |
|---|---|---|
| Les Saveurs du Bas-Saint-Laurent lists an “Anguille fumée” product from Les Trésors du fleuve under fish and seafood. Its page describes a pavé with maple aroma and lists sales points including Montréal and Québec locations. | Direct Québec French market wording and a locally marketed smoked-eel product. | The page gives no binomial, standardized cut, ingredients, cure, smoke method, or weight. Its pavé and maple details remain product-specific. |
| Frandon’s current English list places “SMOKED SLICED UNAGI EEL” among specialty smoked products; its French list says “ANGUILLE UNAGI TRANCHÉE FUMÉE.” | Bilingual Québec supplier wording for one smoked-eel product. | It names no taxon and does not show that unagi always means smoked eel or that every smoked eel is sliced/unagi. Keep the SKU phrase out of global aliases. |
| Capone Gourmet lists “Anguille fumée (Unagi)” with 340 g and 5 kg / 10 kg package options and calls its item ready to eat. | Current Shawinigan seller usage of the base French phrase and one market product. | The product page could not be opened directly in this review; the current search-index result exposes the seller listing. Product amount, package options, ready-to-eat claim, and “Unagi” wording are SKU-specific and do not identify a species or shared preparation. |
| Fumoir St-Antoine’s current fishmonger menu includes “Anguille fumée” and warns that products and prices can change. | Additional French-language seller use of the base product name. | The page does not state the seller’s location and gives no species, processing details, packaging, or amount. |
| OQLF’s GDT entry maps unqualified Québec food-fish anguille to American eel / *Anguilla rostrata*; CFIA’s Fish List currently shows Eel / Anguille on multiple *Anguilla* taxa. | The active American-eel row is species-scoped; generic eel terms do not resolve every eel product to that row. | These fish-name sources do not identify the species in any smoked product above. A market-group row must not be presented as a CFIA species label or as an *A. rostrata* form. |

The integrated row represents the **prepared-food market name** smoked eel / anguille fumée. It is not a new generic eel / anguille species identity, not a taxonomic claim, and not a form attached to American eel. Keep the active American eel identity and the existing unqualified-eel candidate unchanged.

Do not add unagi, Japanese eel, anago, conger, smoked sliced unagi eel, or anguille unagi tranchée fumée as aliases. In this picker, any such longer alias would also make its shorter component query such as unagi resolve to this row. That would reopen the separately held unagi/kabayaki boundary and would treat one supplier’s product wording as a universal synonym. Keep eel sausage, merrine d’anguille, kabayaki, salt-cured eel, and other smoked fish products distinct.

## Ownership and archive audit

The pre-integration snapshot contained **1,567 active references, 122 forms, 61 legacy-import candidates, and 1,912 research-ledger records**. The live manifest contained **114 recipe files and 1,123 structured ingredient rows**. Integration added one reference and one identity-ledger record.

Exact normalized pre-integration ownership checks covered reference IDs, names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; ledger record IDs, source IDs and source URLs; and the focused proposal/batch archive. They found no owner for the proposed reference or exact prepared-food phrase. The integrated row now owns only the canonical smoked eel / anguille fumée identity; no form or legacy allocation was added.

| Current owner | Live state | Disposition |
|---|---|---|
| ingredient-ref-american-eel | American eel / anguille; PROTEIN; no aliases, attached forms, density, or unit mappings. Its OQLF evidence maps anguille to *Anguilla rostrata*. | Preserve this species-scoped reference unchanged. Do not attach smoked eel, unagi, or a smoke form to it. |
| candidate-unqualified-eel-identity-boundary | The sole unresolved broad eel identity candidate. It cites Québec smoked-eel examples but does not allocate a prepared-food product row. | Keep the broad species question owned by this record; do not create a second generic-eel candidate or duplicate its sources. |
| Exact smoked-eel reference/form/legacy terms | No owner at the pre-integration snapshot. | The new reference now owns the canonical identity; no form or legacy mapping was added. |
| R187 source IDs S01–S04 | No ID collision at integration. | Registered to ingredient-ref-smoked-eel, one URL per ID. |
| New market URLs S01–S04 | No exact URL owner at integration. The Frandon English URL was only a companion link in an older proposal. | Registered as four new one-URL sources. The already-ledgered French Frandon page is reused below. |

The existing ledger also owns the OQLF anguille page, CFIA eel Fish List result, CFIA common-name guidance, and Frandon French products page. The source register reuses those exact ledger IDs and URLs; it does not assign them a second R187 ID. The American-eel row has no attached form, and the legacy file has no eel-specific candidate.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and punctuation folding, complete word-phrase matches first, then substring fallback only if there are no phrase matches. The integrated row contains only the canonical names smoked eel / anguille fumée.

| Query | Pre-integration results | With integrated row | Consequence |
|---|---|---|---|
| smoked eel | No result | Smoked eel / anguille fumée | The exact English market phrase becomes selectable. |
| anguille fumée | No result | Smoked eel / anguille fumée | The exact Québec French market phrase becomes selectable. |
| eel | American eel / anguille | American eel / anguille; smoked eel / anguille fumée | Remains a two-result choice, separating the existing species identity from the finished-food group. |
| anguille | American eel / anguille | American eel / anguille; smoked eel / anguille fumée | Broad French search remains multi-result. |
| unagi | No result | No result | No alias is added, so R175’s unagi boundary stays held. |
| smoked sliced unagi eel; anguille unagi tranchée fumée | No result | No result | These exact Frandon SKU phrases remain outside the global search aliases to avoid making broad unagi select this product. |
| smoked; fumée | 12 and 5 results, respectively | 13 and 6 results | Both broad process queries remain multi-result. |

## Bundled-recipe demand

The manifest-ordered audit parsed all **114 recipe files** and **1,123 structured ingredient rows**. It searched every recipe’s decoded JSON text and every ingredient row for eel, eels, American eel, smoked eel, smoked eels, smoked sliced unagi eel, anguille, anguilles, anguille fumée, anguille unagi tranchée fumée, and unagi. It found **zero matching recipe files and zero matching ingredient rows**. There is no bundled recipe amount, preparation, link, ingredient role, or substitution to attach to this product group.

## Numeric evidence and substitutions

Capone Gourmet’s indexed seller page reports one 340 g package and 5 kg / 10 kg formats, with the seller’s case estimates of 14–15 and 29–30 340 g portions. Les Saveurs describes a pavé without a mass, and the Fumoir St-Antoine menu gives no amount. These are product/listing details; they do not establish a household portion, count weight, density, volume-to-mass mapping, edible yield, smoked-to-raw yield, or reusable package conversion.

No reviewed source gives a reusable measurement or compares smoked eel with another eel, fish, or seafood as a recipe substitute. The source pages’ serving suggestions are not substitution instructions. Do not add measurement observations, package-yield records, conversions, contextual or global substitution rules, or recipe-line links. Keep any future label quantity, serving statement, cure, glaze, smoke process, and ready-to-eat wording tied to its named product.

## Integrated reference and ledger mapping

| Reference field | Integrated value |
|---|---|
| id | ingredient-ref-smoked-eel |
| nameEn | smoked eel |
| nameFr | anguille fumée |
| aliasesEn / aliasesFr | [] / [] |
| category | PROTEIN |
| defaultDensity | null |
| unitMappings | [] |
| updatedAt | 2026-10-16T00:00:00Z |
| Forms, legacy mappings, recipe links, conversions, yields, substitutions | None |

One identity-ledger record was added:

| Ledger field | Integrated value |
|---|---|
| recordId / recordType | ingredient-ref-smoked-eel / ingredient_reference |
| identityState | verified |
| measurementState | researched_no_supported_value |
| substitutionResearchState | researched_no_supported_substitute |
| sources | One source object for each new S01–S04 plus the four reused existing source IDs listed below. Each source object keeps its registered single URL, title, 2026-10-16 access date where rechecked, locator, and product/identity limits. Use regional_authority for OQLF and CFIA; use other for seller/market listings. |
| measurementObservations | [] |
| substitutionFindings | [] |
| decisions | One accepted decision stating that this is a species-neutral finished-food market group, not a species row or form; preserve the existing generic-eel candidate; add no aliases, forms, reusable measurements, recipe links, conversions, yields, or substitutions. The decision sourceIds are WP04-SECTIONP-SMOKED-EEL-R187-20261016-S01, WP04-SECTIONP-SMOKED-EEL-R187-20261016-S02, WP04-SECTIONP-SMOKED-EEL-R187-20261016-S03, WP04-SECTIONP-SMOKED-EEL-R187-20261016-S04, WP04-EEL-GENERIC-20261011-S04, WP04-SEA-GAP-20261009-S03, WP04-EEL-GENERIC-20261011-S01, and WP04-EEL-GENERIC-20261011-S02. |

The ledger record uses the [current research-ledger schema](../research-ledger.schema.json). Do not add a separate generic eel candidate or a form under American eel.

## Source register

Market pages were checked on 2026-10-16. Each source ID below has one URL. R187 S01–S04 are registered on ingredient-ref-smoked-eel. The remaining source IDs were already in the shared ledger and are reused unchanged.

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP04-SECTIONP-SMOKED-EEL-R187-20261016-S01 | Les Saveurs du Bas-Saint-Laurent, [Anguille fumée](https://saveursbsl.com/product/anguille-fume-les-trsors-du-fleuve/) | Current product listing names anguille fumée, identifies Les Trésors du fleuve, describes a pavé with maple aroma, and lists Québec points of sale. It gives no species/binomial, recipe weight, standardized process, or common form. |
| WP04-SECTIONP-SMOKED-EEL-R187-20261016-S02 | Frandon Seafoods, [Products](https://frandon.ca/language/en/products/) | Current English supplier page lists smoked sliced unagi eel under smoked products and gives its Québec business contact. It is one product title, not a taxon, universal alias, measure, or preparation standard. This URL is mentioned as an English companion in an older periwinkle proposal but has no exact shared-ledger URL owner. |
| WP04-SECTIONP-SMOKED-EEL-R187-20261016-S03 | Capone Gourmet, [Anguille fumée 340 g & caisses 5–10 kg](https://caponegourmet.com/collections/poissons-fruits-de-mer-surgeles/products/anguille-fumee-340g-capone-gourmet) | Current indexed product listing identifies a Shawinigan seller and the phrase anguille fumée (Unagi); it reports 340 g, 5 kg, and 10 kg formats and a ready-to-eat product claim. The direct page returned a cache miss; treat the seller’s figures and wording as SKU-specific, with no species or shared serving basis. |
| WP04-SECTIONP-SMOKED-EEL-R187-20261016-S04 | Fumoir St-Antoine, [Notre poissonnerie](https://www.fumoirstantoine.com/notre-poissonnerie) | Current fishmonger menu includes anguille fumée and says products/prices can change without notice. It supplies no species, amount, cut, cure, smoke method, or ready-to-eat specification. |
| WP04-EEL-GENERIC-20261011-S04 (reused) | Frandon Seafoods, [Produits](https://frandon.ca/produits/) | Existing ledger source for the French wording anguille unagi tranchée fumée. Reuse this same URL and ID; it does not establish species or make unagi a global synonym. |
| WP04-SEA-GAP-20261009-S03 (reused) | OQLF, [GDT: anguille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199945/anguille) | Existing ledger source, rechecked online. OQLF lists Québec anguille as American eel / *Anguilla rostrata*; last updated 2011. It anchors the species-scoped active row, not the species of smoked products. |
| WP04-EEL-GENERIC-20261011-S01 (reused) | CFIA, [Fish List eel search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=eel) | Existing ledger source; current Fish List search results show Eel / Anguille for multiple *Anguilla* taxa, with American eel as a separately qualified name for *A. rostrata*. The dynamic results page was not directly openable in this review. It supports the species boundary, not the smoked product group’s taxon. |
| WP04-EEL-GENERIC-20261011-S02 (reused) | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Existing ledger source, rechecked online; the current guidance says the Fish List supplies English and French common names for fish labelling and that only names listed for a species should be used for that species. This is regulatory naming guidance, not a recipe alias or an identity for the sellers’ smoked products. |

## Reopen conditions

Reopen if a bundled recipe or exact product request needs a species-specific smoked eel, a defined product alias, a package serving or yield, a form conversion, or a substitution. Reconsider the broad unagi query only when a separate review can represent both smoked and kabayaki product scopes without making one seller’s SKU the sole generic result.
