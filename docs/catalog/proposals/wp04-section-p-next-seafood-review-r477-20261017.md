# WP04 Section P — smoked Greenland halibut product review (R477)

- **Review and source-access date:** 2026-10-17.
- **Checklist:** The open WP04 Section P preservation item for smoked, salt-cured, dried, canned, packed, and fermented seafood ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7270)).
- **Candidate:** Smoked Greenland halibut / *flétan du Groenland fumé*, limited to the species *Reinhardtius hippoglossoides*.
- **Recommendation:** Add identity-only `smoked Greenland halibut / flétan du Groenland fumé` as a separate `PROTEIN` finished-food reference. Keep species scope explicit. Add no aliases, forms, measures, recipe links, conversions, package yields, or substitutions.
- **Status:** Proposal only. This review changes only this proposal file. Root alone integrates shared catalog and checklist data. No tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-S01` through `S04`; audit label `WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-R01`. Existing terminology/species sources are reused by their current IDs.

## Gap and product boundary

The Section P preservation checklist remains open. Recent product decisions establish a useful pattern: smoked salmon, trout, mackerel, eel, and lake whitefish have separate prepared-food identities, while the earlier preservation review rejected universal `smoked` forms on raw fish. R191's smoked lake-whitefish decision is the closest precedent: it keeps a species-scoped smoked product separate from the raw species identity and leaves process, cut, amount, and readiness product-specific. None of these entries allocates a smoked Greenland-halibut product.

The current active reference `ingredient-ref-greenland-halibut` names *Reinhardtius hippoglossoides*. A manufacturer in Gaspé, Québec, maintains a product page for **Smoked Greenland Halibut fillets** and links a product specification that names the same species and describes a cured, maple-wood hot-smoked fillet. A Québec product-directory listing independently uses **Flétan du Groenland fumé** for one component of a 210 g trio of smoked fish. Together with OQLF and CFIA species terminology, these sources support a narrow, species-qualified market identity.

This is a finished-food search identity, not a new species and not a universal smoked form attached to raw Greenland halibut. The manufacturer sheet's cure, hot smoke, maple wood, sliced fillet format, frozen shatterpack, and 10 lb case are source-specific. The Québec directory's 210 g amount belongs to the whole mixed trio, not to its Greenland-halibut component. No shared processing state, cut, package basis, readiness, or amount is inferred.

Keep generic `smoked halibut / flétan fumé` unallocated: a Québec fishmonger lists `Flétan fumé` without identifying a halibut species. Do not assign the product to Atlantic or Pacific halibut, or use `turbot`, `turbot du Groenland`, or `Greenland turbot` as Québec-facing catalog aliases. OQLF identifies `flétan du Groenland` as the normalized Québec term and says `turbot` wording was not retained for Québec fish-product marketing because it can be confused with European turbot. [S04; reused OQLF source]

## Proposed catalog delta

If accepted, add only this identity-only reference:

```json
{
  "id": "ingredient-ref-smoked-greenland-halibut",
  "nameEn": "smoked Greenland halibut",
  "nameFr": "flétan du Groenland fumé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Keep aliases empty. Do not add `smoked halibut`, `flétan fumé`, `turbot fumé`, `turbot du Groenland fumé`, `smoked Greenland turbot`, `black halibut`, or product-specific `smoked Greenland halibut fillet(s)` aliases. The exact proposed display is searchable as written; the aliases either shed the species boundary or turn source-specific product wording into a catalog-wide equivalence. In particular, `smoked halibut` would encompass more than the single species established by the Québec display and manufacturer specification.

If accepted, create one `ingredient_reference` ledger record for the new identity with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Register S01–S04 and reuse the existing OQLF, CFIA, and MAPAQ source records listed below. Keep measurement observations empty. Add no form, legacy mapping, recipe-line link, active measure, density, mapping, conversion, package yield, or substitution rule.

## Ownership, source allocation, and snapshot audit

The live workspace snapshot on 2026-10-17 contains **1,755 ingredient references**, **142 forms**, **56 legacy candidates**, and **2,114 research-ledger records** with **9,636 source entries**, **8,183 distinct source IDs**, and **6,896 distinct source URLs**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact normalized-key checks covered active reference IDs, names, and aliases; form IDs, labels, and match terms; legacy-candidate IDs, names, and aliases; and ledger record IDs. No exact owner exists for `smoked Greenland halibut`, `smoked Greenland halibut fillet(s)`, `flétan du Groenland fumé`, `flétan fumé`, or `ingredient-ref-smoked-greenland-halibut`. The only active adjacent owner is the raw species reference `ingredient-ref-greenland-halibut`; it has no attached forms, `defaultDensity: null`, and `unitMappings: []`. Its existing French alias `flétan noir` stays on that raw species row.

The current raw-species ledger record has two Canadian Nutrient File observations for **raw** Greenland halibut: a source-listed half fillet at 204 g and a Food Guide serving at 90 g. Those observations do not describe a smoked product. The record's `substitutionResearchState` is `blocked_pending_evidence`; MAPAQ's existing species profile has a broad note that the fish can replace several other species, but gives no dish role, preparation match, method scope, or replacement amount. Do not transfer either raw measurement or that generic fish-substitution note to the smoked-product identity.

The active forms file has no Greenland-halibut form. The active package-yield file has one unrelated record; the global and contextual substitution-rule files contain no active rules. The shared ledger has two other form-conversion records and sixteen contextual-substitution research records, none for Greenland halibut or smoked fish. The existing raw-species record already owns the OQLF, CFIA, DFO, and MAPAQ sources for the taxon. Reuse only the OQLF GDT source `WP04-P-GREENLAND-HALIBUT-20261012-S01`, the CFIA Fish List source `WP04-P-GREENLAND-HALIBUT-20261012-S02`, and MAPAQ source `WP04-P-GREENLAND-HALIBUT-20261012-S06` where their scope is relevant; do not duplicate their URLs under new IDs.

The proposed reference ID, source prefix, new source URLs, and proposal path were unallocated in the active ledger and focused proposal/batch archive at review time. The three reused terminology/species URLs remain owned by their existing IDs and raw-species record. [R01]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized full word phrases are preferred across names, aliases, and attached forms, with substring fallback only when no full-phrase result exists. The hypothetical identity above has no aliases or forms.

| Query | Current result | With proposed reference | Effect |
|---|---|---|---|
| `smoked Greenland halibut`; `flétan du Groenland fumé` | None | The proposed smoked-product reference | Adds exact species-qualified English and French product search. |
| `Greenland halibut`; `flétan du Groenland` | `Greenland halibut / flétan du Groenland` | Raw species and smoked-product references | Makes the requested product state visible beside the species identity. |
| `halibut`; `flétan` | Three results: Atlantic, Greenland, and Pacific halibut | Those three plus the smoked Greenland-halibut product | Remains a multi-result search. |
| `smoked` | 17 results | The same 17 plus the smoked Greenland-halibut product | Remains a broad multi-result search. |
| `fumé` | 8 results | The same 8 plus the smoked Greenland-halibut product | Remains a multi-result search. |
| `flétan noir` | Greenland halibut / flétan du Groenland | Unchanged | The existing alias remains on the raw species identity. |
| `smoked halibut`; `flétan fumé`; `turbot fumé`; `turbot du Groenland` | None | None | No broad or rejected fish-label wording is added. |

The unqualified `flétan fumé` and `smoked halibut` queries remain unresolved because the reviewed Québec listing does not specify species for its `Flétan fumé` product. The new display intentionally requires the Greenland qualifier.

## Bundled recipe demand

The manifest-ordered audit parsed all **114 recipe files** and all **1,123 structured ingredient rows**, then scanned every decoded string field and each ingredient row for the candidate phrases and broader `Greenland halibut`, `flétan du Groenland`, and `turbot du Groenland` wording. It found **zero matching recipe files and zero matching ingredient rows**. The package supplies no recipe role, amount, method, smoked-product link, or substitution context. No recipe link or amount is proposed. [R01]

## Numeric, form, and substitution boundaries

- **Product identity:** Model the market product as a separate prepared-food reference, following the smoked-lake-whitefish and other smoked-product precedents. Do not add a `smoked` form to `ingredient-ref-greenland-halibut`; the available product evidence describes a prepared product, and its cure, smoke method, seasoning wood, cut, and storage details are not established as universal.
- **Package amounts:** The GaspéCured sheet's 10 lb carton is a manufacturer case format for its frozen shatterpack product. Aliments du Québec's 210 g amount is for a three-fish smoked assortment. Neither is an ingredient portion, mass-volume relationship, density, household measure, reusable package yield, or amount for the Greenland-halibut component. Keep both source-scoped and add no measurement observation or package-yield row.
- **Other numeric data:** The MAPAQ profile's `various formats` language and raw-fish nutrition profile do not support a smoked-product measure. Leave `defaultDensity` null and `unitMappings` empty; add no serving conversion, cured-to-raw ratio, smoking loss, thawing yield, or cooking yield.
- **Substitutions:** Add no replacement rule between smoked Greenland halibut and raw Greenland halibut, Atlantic or Pacific halibut, smoked lake whitefish, smoked salmon, or another fish. The raw species ledger's broad substitution note does not test this prepared product or establish a recipe role, method compatibility, or quantity. No bundled recipe supplies such a context.

## Source register and limits

New sources were accessed on **2026-10-17**. S01–S04 remain proposal-local and unallocated. The direct GaspéCured product page is current indexed manufacturer content dated 2026-05-07; the page and linked product-sheet PDF could not be fetched directly by the research browser, so the page title/date and PDF details were checked in its current indexed content. This supports the listed product but does not prove current inventory. The Aliments du Québec page is a Québec product-directory listing, not a standalone halibut package label. Reused sources retain their existing ledger IDs and URL owners.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-S01** | GaspéCured, [Smoked Greenland Halibut fillets](https://www.gaspecured.com/it/smoked-greenland-halibut-fillets-2/), manufacturer page dated 2026-05-07. | Current indexed page title links to a product specification for smoked Greenland-halibut fillets. Direct page fetch returned a cache miss; the indexed title/date and downloadable-sheet link were reviewed. It is manufacturer product information, not proof of current retail stock or a reusable measure. |
| **WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-S02** | GaspéCured, [Smoked Greenland Halibut Fillet product specification](https://www.gaspecured.com/wp-content/documents/files/produit/2.3.4_Smoked_Greenland%20Halibut%20Fillet.pdf). Names *Reinhardtius hippoglossoides* and describes a cured fillet hot-smoked over maple wood; it lists freshly skinned, sliced and frozen shatterpack packaging in 10 lb cartons, with variable sizing. | The manufacturer sheet is undated in the accessible extract; its format and package belong to this product specification only. Direct PDF fetch returned HTTP 403; indexed document content was reviewed. The 10 lb case is not a recipe quantity or transferable yield. |
| **WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-S03** | Aliments du Québec, [Trio de la mer fumé](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/trio-de-la-mer-fume). The Québec product listing says the smoked assortment includes Atlantic salmon, `saumon Arc-en-ciel fumé`, and `Flétan du Groenland fumé`; the full assortment is 210 g. | The listing establishes local French product wording for one component, not a standalone Greenland-halibut SKU, species-specific package weight, or component share of the trio. |
| **WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-S04** | Les Pêcheries Desbois, [Nos produits de la mer](https://pecheriesdesbois.ca/nos-produits/), Québec City fishmonger. Its current list includes unqualified `Flétan fumé` among smoked products and says products vary by season and arrivals. | Supports the broad Québec market phrase and the need to preserve species scope; the listing does not identify the halibut species, exact product, package, or process. |
| **Reused `WP04-P-GREENLAND-HALIBUT-20261012-S01`** | OQLF, [flétan du Groenland (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland). Normalizes the Québec French species name, pairs it with English `Greenland halibut` and *Reinhardtius hippoglossoides*, and states that `turbot`/`turbot du Groenland` were not retained for Québec fish-product marketing. | Existing raw-species name evidence; it does not define a smoked product or authorize a consumer label. Reuse the ledger ID rather than adding a second source record. |
| **Reused `WP04-P-GREENLAND-HALIBUT-20261012-S02`** | CFIA Fish List lookup for [*Reinhardtius hippoglossoides*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&lang=e&q=Reinhardtius+hippoglossoides). | Existing Canadian common-name/taxon source. It supports the species boundary, not a product process, package, amount, or recipe use. |
| **Reused `WP04-P-GREENLAND-HALIBUT-20261012-S06`** | MAPAQ, [Poissons de fond et pélagiques du Québec](https://www.mapaq.gouv.qc.ca/fr/Publications/Poissonsfond.pdf). The existing ledger entry records Greenland-halibut smoked product formats among Québec processor offerings. | Existing Québec fishery/product-profile source; it does not identify a current retail SKU, consumer portion, or kitchen conversion. Its broad raw-fish substitution comment is not transferred to the smoked product. |
| **WP04-SECTIONP-SMOKED-GREENLAND-HALIBUT-R477-20261017-R01** | Read-only audit of the [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7270), active references/forms, legacy candidates, research ledger/source allocations, package yields, conversion and substitution data, recent product decisions, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and all manifest-listed recipes. | Repository-snapshot record of exact ownership, source-ID/URL, picker, numeric/rule, and complete recipe-corpus checks; it adds no external product claim. |

## Disposition

**Recommend adding** identity-only `smoked Greenland halibut / flétan du Groenland fumé` as `ingredient-ref-smoked-greenland-halibut`, separate from raw `ingredient-ref-greenland-halibut`. The manufacturer names a species-qualified smoked product, the Québec product directory uses the matching French phrase, and OQLF/CFIA confirm the species boundary. Keep the species-qualified term in both displays; leave generic `smoked halibut / flétan fumé` and turbot wording unallocated. The bundle has no matching recipe demand and the available amounts do not support reusable numeric behavior. Add no aliases, forms, measures, mappings, recipe links, conversions, yields, or substitutions. Section P remains open.
