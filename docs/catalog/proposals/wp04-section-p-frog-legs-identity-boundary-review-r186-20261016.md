# WP04 Section P — frog legs / cuisses de grenouille identity-boundary review (R186)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Commercial frog legs / `cuisses de grenouille`, including current Québec frozen-product listings.
- **Recommendation:** **Add** identity-only `ingredient-ref-frog-legs` in `PROTEIN`, displayed as `frog legs / cuisses de grenouille`, with the source-supported singular aliases `frog leg` and `cuisse de grenouille`. Add no forms, reusable measures, mappings, conversions, yields, recipe links, or substitutions.
- **Scope:** Edible frog-leg cuts sold as food. The integrated row is a market/cut identity, not a whole-frog identity or a biological species. All reviewed Québec retail product examples are frozen; do not turn frozen, raw, or cooked into a universal form from those SKUs.
- **Status:** Accepted and integrated as an identity-only catalog addition. The shared reference and ledger now contain the reviewed identity and source register; no forms, recipe links, reusable measures, conversions, yields, or substitutions were added.
- **Source IDs:** `WP04-SECTIONP-FROG-LEGS-R186-20261016-S01` through `S05`. Each ID below has exactly one URL.

## Why this is an open candidate

The active [animal-protein checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L839) remains open for reviewer-confirmed Canadian English and Québec French food names. The exact-topic archive scan found no prior proposal or batch mentioning `frog`, `frog leg(s)`, `grenouille`, or `cuisses de grenouille`. The pre-integration ownership audit found no candidate owner in references, forms, legacy identities, or the research ledger. The nearby [goat-meat review](wp04-goat-meat-identity-review-20261013.md) and [integration report](../batches/wp04-goat-meat-identity-integration-20261013/README.md) cover caprine meat, not amphibian cuts.

The recently integrated [R184 smoked-cod review](wp04-section-p-smoked-cod-market-boundary-review-r184-20261016.md) and [integration batch](../batches/wp02-wp03-wp04-r184-gap-review-integration-20261016/README.md) cover a preserved fish market group. This R186 candidate has no fish, smoked-product, or preservation scope; the two entries do not share an ingredient identity, form, alias, recipe link, or source.

The integrated identity is a named food cut, not a new species or a synonym for all frogs. OQLF pairs **cuisses de grenouille** with English **frog legs**, and current Québec sellers use the term for frozen food products [S01–S05]. Keep the whole-frog and taxonomic concepts outside this row. The market pages reviewed do not establish one species across products.

## Québec terminology and Canadian product evidence

| Source wording or product | Evidence | Limit |
|---|---|---|
| OQLF **cuisses de grenouille / frog legs** | The GDT lists `cuisses de grenouille` as its preferred French term in the food/dish domain and `frog legs` as the English translation [S01]. | This terminology entry was last updated in 1993 and describes a dish term; current retail pages are needed to establish packaged ingredient use. It does not identify a frog species or establish a measure. |
| Anchors Bay **Frog Legs 8/12 900 g**, Mayrand item 21112 | Mayrand lists the item under frozen seafood, provides unit UPC 832365003514, and displays Québec store locations [S02]. | The page title says 900 g while its price specification says unit 800 g and case 12 × 800 g. Preserve that conflict as page-specific; do not infer count, edible yield, or a standard package amount. Store stock is dynamic. |
| **Cuisses de grenouille 16–20 1 kg**, Congélo O Kilo | The Québec retailer’s French page describes a frozen product, says it serves a Mauricie delivery area, and displays `Produit du Québec` [S03]. | The page also says the format is unavailable while its product header says in stock. It names no species; its “Produit du Québec” claim is retailer wording, not a species or supplier crosswalk. Do not infer what the 16–20 count basis means. |
| **Cuisse de grenouille / Frog leg**, Aliments DKL | The Québec-facing seller lists French and English product titles, a frozen 2 kg box, two 2.2 lb bags, Quebec-wide delivery, and cooking/storage directions [S04–S05]. | No species, source farm, or package label is supplied. Its times, temperature, butter/oil directions, and storage duration belong to this seller’s product guidance, not a general cooking rule or recipe serving. |

The terminology and current seller pages support a useful bilingual edible-cut identity. They do not support naming bullfrog, leopard frog, or any other taxon; a single origin; a general fresh/frozen state; or one product preparation. Keep `frog`, `grenouille`, `bullfrog`, a scientific name, and broad `legs`/`cuisses` out of aliases. Use only the source-supported singular aliases `frog leg` and `cuisse de grenouille`; the canonical names already contain the broader animal and cut words.

## Product boundary and ownership audit

The pre-integration snapshot contained **1,565 active references, 122 forms, 61 legacy candidates, and 1,910 ledger records**. That ownership audit found no exact owner for `frog legs`, `frog leg`, `cuisses de grenouille`, `cuisse de grenouille`, `ingredient-ref-frog-legs`, or the R186 source-ID prefix. The full catalog proposal/batch archive search found no earlier frog-leg packet. After integration, the shared snapshot contains **1,566 references, 122 forms, 61 legacy candidates, and 1,911 ledger records / 8,220 source entries / 7,020 distinct source IDs / 5,814 URLs**. All five reviewed source IDs and URLs are registered once under `ingredient-ref-frog-legs`.

| Boundary | Disposition |
|---|---|
| Whole frog or a named frog species | Keep outside this row. The candidate is the edible leg cut; the Québec product pages do not agree on or declare a shared species. |
| R184 smoked cod / `morue fumée` | Keep as its own finished-food fish market group; it covers smoked cod products and has no frog-leg or amphibian scope. |
| Frozen, raw, cooked, breaded, or seasoned legs | Keep product state at the source/SKU level. The current Québec retail examples are frozen, but they do not establish a universal form or process. |
| Chicken meat | Keep separate. One seller compares flavour with chicken, but no source gives a recipe-level replacement or ratio. The comparison is not substitution evidence. |
| Other edible animal cuts | Keep separate. No source maps frog legs to chicken legs, fish, rabbit, or another meat. |
| Package/count wording | Keep with each source. The 800/900 g discrepancy, 16–20/1 kg wording, and 2 kg box are not reusable measures. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete-word phrase matches take priority, with substring fallback only when there are no phrase matches. Proposed names are `frog legs / cuisses de grenouille`; aliases are the two singular source forms above. No candidate form terms are attached.

| Query | Current results | With hypothetical row | Effect |
|---|---|---|---|
| `frog legs`; `frog leg` | No result | Frog legs only | Both the preferred English term and singular product wording resolve to the cut. |
| `cuisses de grenouille`; `cuisse de grenouille` | No result | Frog legs only | Both the Québec display and singular product wording resolve to the cut. |
| `frog`; `grenouille` | No result | Frog legs only | Broad animal-word searches show the explicit cut name; there is no whole-frog identity in the current picker. |
| `legs`; `cuisses` | No result | Frog legs only | These short part words also resolve to the cut. Do not add them as aliases; they already occur in the canonical names. |
| `chicken` | Six chicken references | Same six | The frog-leg row does not change the chicken results or suggest a substitution. |
| `frozen frog legs`; `Frog Legs 8/12`; `Hoplobatrachus rugulosus` | No result | No result | Longer SKU descriptions, package grades, and unshared species names are not aliases. |

## Bundled-recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 structured ingredient rows**. I searched all decoded recipe JSON and each ingredient row for `frog leg(s)`, `frog's legs`, `frogs' legs`, `cuisse(s) de grenouille`, `grenouille(s)`, and `Hoplobatrachus rugulosus`. The audit found **zero matching recipe files and zero matching ingredient rows**. No recipe amount, preparation method, role, or line link selects this ingredient.

## Numeric and substitution evidence

- Mayrand’s page conflicts between its 900 g title and 800 g unit/case specification [S02]. O Kilo presents `16–20 / 1 kg` without defining the count basis and has conflicting format-availability text [S03]. DKL lists a 2 kg box as two 2.2 lb bags [S04]. These are SKU page claims only; add no package measure, count-to-mass mapping, density, household volume, edible yield, or conversion.
- DKL gives product-specific soaking and cooking directions and a frozen-storage duration [S04]. They have no serving basis and do not establish general times, temperatures, or storage rules for frog legs.
- No reviewed source gives a common serving size, usable yield, raw-to-cooked yield, or general frog-leg recipe amount. No source compares a recipe and quantity to another food as a replacement. A flavour comparison to chicken is not a substitute instruction; add no global or contextual substitution rule.

The integrated research-ledger identity record is:

| Ledger field | Integrated value |
|---|---|
| `recordId` / `recordType` | `ingredient-ref-frog-legs` / `ingredient_reference` |
| `identityState` | `verified` |
| `measurementState` | `researched_no_supported_value` |
| `substitutionResearchState` | `researched_no_supported_substitute` |
| `sources` | One source object per S01–S05, using that source’s one URL, title, `accessedOn: 2026-10-16`, locator, support/limit statement, and `sourceKind` (`regional_authority` for S01; `other` for S02–S05). |
| `measurementObservations` | `[]` |
| `substitutionFindings` | `[]` |
| `decisions` | One accepted identity decision with all five R186 source IDs, explaining the species-neutral edible-cut identity and the no-form/no-measure/no-substitution disposition. |

The reference row’s `updatedAt` is `2026-10-16T00:00:00Z`.

## Integrated reference mapping

| Field | Integrated value |
|---|---|
| `id` | `ingredient-ref-frog-legs` |
| `nameEn` | `frog legs` |
| `nameFr` | `cuisses de grenouille` |
| `aliasesEn` | [`frog leg`] |
| `aliasesFr` | [`cuisse de grenouille`] |
| `category` | `PROTEIN` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-16T00:00:00Z` |
| Forms, recipe links, conversions, yields, substitutions | None |

## Source register

All pages below were accessed on 2026-10-16. Each source ID is registered once under the shared ledger record `ingredient-ref-frog-legs` and points to exactly one URL. Before integration, none of the five URLs or IDs was present in the ledger.

| Source ID | Source and locator | Supports | Limit |
|---|---|---|---|
| `WP04-SECTIONP-FROG-LEGS-R186-20261016-S01` | Office québécois de la langue française, [GDT: cuisses de grenouille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18048619/cuisses-de-grenouille), preferred term and English equivalent; updated 1993. | The Québec French term `cuisses de grenouille`, English `frog legs`, and food/dish domain. | Terminology, not a current SKU, taxonomic identity, recipe measure, or processing specification. |
| `WP04-SECTIONP-FROG-LEGS-R186-20261016-S02` | Mayrand, [Frog Legs 8/12 900 g](https://mayrand.ca/en/our-products/frozen-food/frozen-seafood/other-frozen-seafood/cuisses-de-grenouilles-812-surgelees-anchors-bay-21112), item 21112, unit UPC 832365003514. | Current Québec retailer product title, frozen-seafood placement, product code, displayed package values, and Québec store locations. | The title says 900 g while unit/case details say 800 g; displayed store stock is dynamic and not durable. No species is named. |
| `WP04-SECTIONP-FROG-LEGS-R186-20261016-S03` | Congélo O Kilo, [Cuisses de grenouille 16–20 1 kg](https://okilo.ca/products/%E2%9A%AB%EF%B8%8F-cuisses-de-grenouille-16-20-1kg), product listing. | Current Québec French wording, frozen-product state, seller’s `Produit du Québec` claim, package title, and Mauricie delivery context. | The same page conflicts between an in-stock banner and format-unavailable message. It gives no species, count basis, or independently verified origin. |
| `WP04-SECTIONP-FROG-LEGS-R186-20261016-S04` | Aliments DKL, [Cuisse de grenouille](https://alimentsdkl.com/products/cuisses-de-grenouille), current French product title, package, delivery, and preparation/storage lines. | A current Québec seller listing the singular product term, frozen 2 kg box, two 2.2 lb bags, Quebec-wide delivery, and SKU-specific directions. | No taxon, supplier/origin, standardized measure, serving basis, transferable cooking time, or substitution. |
| `WP04-SECTIONP-FROG-LEGS-R186-20261016-S05` | Aliments DKL, [Frog leg](https://alimentsdkl.com/en/products/cuisses-de-grenouille), current English product title and package details. | The Québec seller’s English page uses the exact singular phrase `Frog leg`, supporting the English search alias; the same listing states frozen-food shipping in Québec. | Package and preparation/storage details remain SKU-specific; the page does not establish a taxon, origin, standardized measure, serving basis, or substitution. |

## Reopen conditions

Reopen the boundary if a bundled recipe calls for whole frog, a named species, or a distinct prepared product rather than leg cuts; if a package establishes a reliable species or origin that changes the display; or if a source-backed recipe provides a matched amount or replacement instruction. Recheck local inventory before claiming current store availability. Keep all product weights, counts, freezing, processing, species, cooking guidance, and storage details tied to their source and SKU unless separate evidence supports generalization.

## Recommendation

**Add** identity-only `frog legs / cuisses de grenouille` as `ingredient-ref-frog-legs` in `PROTEIN`, with singular aliases `frog leg` and `cuisse de grenouille`. OQLF’s bilingual food term and current Québec retailer listings support the edible-cut identity, while the product pages do not establish one frog species or a shared package, frozen/cooked state, or method. Keep the whole animal, taxonomy, product states, and chicken-like flavour comparison separate. The recipe bundle has no matching demand; add no forms, measurements, recipe links, conversions, yields, or substitutions. The reviewed row and ledger record are integrated in the R186 batch README.
