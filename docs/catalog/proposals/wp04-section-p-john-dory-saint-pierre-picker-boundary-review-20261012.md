# WP04 Section P: John Dory / saint-pierre picker-boundary review

- **Review date:** 2026-10-12
- **Status:** Proposal only. The species identity and bilingual name pair are source-verified. Hold the active catalog row until broader dory-query behavior is reviewed.
- **Disposition:** Do not add an active reference, legacy candidate, ledger identity record, form, recipe link, measurement, conversion, density, or substitution in this pass.

## Decision

The identity is verifiable as *Zeus faber*. The OQLF Grand dictionnaire terminologique gives Québec French **saint-pierre**, English **John Dory** and **dory**, and the Latin name *Zeus faber*. The CFIA Fish List independently pairs *Zeus faber* with **John Dory / Saint-pierre** for Canadian fish labelling. This resolves the species identity and bilingual name pair [S01–S03].

Keep this identity out of the active picker until the broader **dory** and **saint-pierre** query behavior is reviewed. CFIA also applies dory names to Oreo dories from other taxa, and its French label **Saint-pierre** is used for more than one taxon. The current picker has no results for these terms. If the candidate were added with the verified display pair, the current phrase matcher would make it the sole result for the broad queries **dory** and **saint** as well as the species-specific query **John Dory**. That result would make the broader query appear species-specific [S02–S03].

This is a distinct finfish identity and picker boundary after the yellowtail-flounder review. It does not reopen that proposal. Current reference, form, legacy-identity, ledger-ID, and bundled-recipe audits found no John Dory / *Zeus faber* identity owner or recipe demand. The ledger does mention Lac Saint-Pierre as a place name in unrelated barbotte evidence; that is not an ingredient identity owner.

## Search boundary and exact-term decisions

The current search implementation normalizes case, accents, punctuation, and spacing; it first matches a complete query phrase within display names, aliases, and form terms, then falls back to substring matching. This behavior is implemented in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

The live 1,298-reference catalog returns no result for **John Dory**, **dory**, **saint-pierre**, **saint**, **saint-pierre de Nouvelle-Zélande**, or **Oreo Dory**. A local projection of the current matcher with one hypothetical candidate using the verified name pair would return that sole candidate for **John Dory**, **dory**, **saint-pierre**, and **saint**. This is a source-code projection; the proposed row is not present in the application.

| Term or coverage | Source evidence | Decision |
|---|---|---|
| John Dory / saint-pierre / *Zeus faber* | OQLF and CFIA pair the name with this species. | Verified conditional display pair. Hold the active row pending broader picker review. |
| dory | OQLF lists **dory** as an English term for *Z. faber*, while CFIA uses names containing **Dory** for *Z. faber*, *Allocyttus niger*, *Neocyttus rhomboidalis*, and *Pseudocyttus maculatus*. | Do not add **dory** as an alias. It is already embedded in **John Dory**, so omitting the alias alone cannot prevent the current broad query from returning this candidate. |
| saint-pierre | CFIA gives this French label for *Z. faber* and *N. rhomboidalis*. Its *P. maculatus* entry gives **Saint-pierre de Nouvelle-Zélande**. | Keep as the source-verified conditional French display only; hold the row because the term crosses taxa. |
| saint-pierre de Nouvelle-Zélande | CFIA assigns the phrase to *P. maculatus* (listed with **Smooth Oreo Dory / Oreo Dory**). | Do not attach it as an alias or form of *Z. faber*. |
| Oreo Dory / Black Oreo Dory / Spiky Oreo Dory / Smooth Oreo Dory | CFIA assigns these names to the three Oreo-dory taxa above. | Keep each identity separate. Do not promote Oreo-dory names to John Dory aliases. |
| *Zeus faber* | OQLF and CFIA support the binomial as the identity. | Retain in evidence and source records; do not add it as a recipe-search alias in this pass. |

No alias promotion is recommended. Adding the source-attested short term **dory** would directly broaden results, and the longer French display **saint-pierre** itself already matches the broad query. A picker change should first make the multiple fish identities visible for those broad searches or otherwise communicate the ambiguity; reassess the row and any search terms after that behavior is reviewed.

## Conditional catalog shape

These fields document a candidate only. The ID is currently unowned in the audited data, but is not reserved or allocated by this proposal. Do not copy this block into the seed package until the picker boundary is resolved.

    {
      "id": "ingredient-ref-john-dory",
      "nameFr": "saint-pierre",
      "nameEn": "John Dory",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-12T00:00:00Z",
      "category": "PROTEIN"
    }

No exact owner was found for the candidate ID **ingredient-ref-john-dory**, the proposed display pair, **dory**, **Zeus faber**, or **candidate-john-dory** in active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, or ledger record IDs. Generic source-text mentions of Saint-Pierre as a geographic name are not ingredient-key ownership. No earlier John Dory or *Zeus faber* review or proposal was found in the current catalog research files.

## Recipe and package-demand audit

The live package manifest lists 114 recipe files with 1,123 ingredient rows. A full-text scan of all manifest-listed recipe JSON found zero matches for **John Dory**, **dory**, **saint-pierre**, **saint pierre**, or *Zeus faber*. No bundled recipe line exists to link, and there is no package-derived recipe quantity or product form to preserve.

External recipe pages show the term in cooking contexts, but are not evidence of bundled demand:

- Metro’s 2013 French recipe lists **4 × 100 g filets de saint-pierre** for four servings. Its preparation section is headed **Abadèche**, despite the saint-pierre ingredient line. Because that page is internally inconsistent, do not treat its quantity as a reliable John Dory measure, link it to a catalog row, or use it for density or conversion [S06].
- A community recipe on Recettes du Québec, dated 2012, gives **300 g filets de turbot (ou barbue ou saint-pierre)** in a four-serving steamed mixed-fish dish. It names no taxon. This records one recipe-specific alternative in one ingredient slot; it does not establish taxon identity, a generally interchangeable fish, or a directed catalog substitution rule [S07].

## Forms, measurements, conversions, and substitutions

- OQLF and CFIA establish names and labelling identity, not a kitchen unit, household portion, edible yield, density, count-to-mass conversion, or package yield [S01–S03].
- Metro’s consumer fish guide describes John Dory fillets as frozen and suggests cooking methods. Its wording is a retail guide, not evidence of current stock or a universal product form [S04].
- Seafood Depot lists *Zeus faber* as whole or fillet, fresh and frozen, wild, and product of New Zealand. These are seller-specific presentation and origin statements; they do not establish forms universally available in Québec or a household measure [S05].
- No default density, unit mapping, yield, or measurement is supported by the reviewed evidence. Keep density null and unit mappings empty in the candidate sketch; do not create form records from vendor-specific product descriptions.
- The Recettes du Québec alternative is confined to one mixed-fish recipe with no taxon attribution. It is insufficient for a global conversion or a reusable directed substitution rule. No substitution is proposed.

## Current ownership snapshot

Read-only audit on 2026-10-12:

| Artifact | Live count | Candidate-specific result |
|---|---:|---|
| ingredient-references.v1.json | 1,298 references | No John Dory / *Zeus faber* owner; proposed ID unused. |
| ingredient-forms.v1.json | 98 forms | No John Dory / *Zeus faber* label or match-term owner. |
| legacy-import-identities.v1.json | 64 candidates | No John Dory / *Zeus faber* candidate. |
| research-ledger.v1.json | 1,606 records | No candidate identity record or source-ID collision; place-name mentions of Saint-Pierre are unrelated. |
| manifest.v1.json and recipe files | 114 recipe paths; 1,123 ingredient rows | Zero candidate-term hits in bundled recipe text. |

## Sources

Online sources were accessed 2026-10-12. The IDs below are local to this proposal and are not additions to the shared research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP04-JOHN-DORY-BOUNDARY-20261012-S01 | OQLF, [saint-pierre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198951/saint-pierre) | Québec-preferred French term; English terms John Dory and dory; Latin name *Zeus faber*. The entry was last updated in 1998. Its note about commercial potential is not evidence of present market availability. |
| WP04-JOHN-DORY-BOUNDARY-20261012-S02 | CFIA, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the list provides English and French names acceptable for Canadian fish labelling and the scientific names used to identify species on import notifications. Labelling evidence is not recipe equivalence or ingredient-substitution guidance. |
| WP04-JOHN-DORY-BOUNDARY-20261012-S03 | CFIA, [complete searchable Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *Z. faber* as John Dory / Saint-pierre; *A. niger* as Oreo Dory / Black Oreo Dory; *N. rhomboidalis* as Spiky Oreo Dory / Saint-pierre; and *P. maculatus* as Smooth Oreo Dory / Oreo Dory / Saint-pierre de Nouvelle-Zélande. The list is fish-labelling terminology, not culinary interchangeability guidance; it shows a 2023-09-18 modification date. |
| WP04-JOHN-DORY-BOUNDARY-20261012-S04 | Metro, [John Dory fish guide](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/john-dory) | Says the fish was formerly called Saint-Pierre and that Metro fish experts carry frozen John Dory fillets; gives preparation suggestions. This is a consumer guide, not present inventory or universal product-form evidence. |
| WP04-JOHN-DORY-BOUNDARY-20261012-S05 | Seafood Depot, [John Dory product page](https://www.seafooddepot.ca/product-johndory) | Names *Zeus faber* and lists whole or fillet, fresh or frozen, wild, product of New Zealand. Seller-specific product information; not a general Québec market or kitchen-measure source. |
| WP04-JOHN-DORY-BOUNDARY-20261012-S06 | Metro, [Filets de poisson blanc au four sur risotto](https://api.metro.ca/recettes-et-occasions/recettes/filets-de-poisson-blanc-au-four-sur-risotto) | Recipe dated 2013-08-06; four servings and four 100 g saint-pierre fillets appear in the ingredient list, but the preparation heading says Abadèche. Do not use its quantity as a transferable species measure. |
| WP04-JOHN-DORY-BOUNDARY-20261012-S07 | Recettes du Québec, [Panaché de poisson à la vapeur, sauce à l’aneth](https://www.recettes.qc.ca/recettes/recette/panache-de-poisson-a-la-vapeur-sauce-a-l-aneth-204991) | Community recipe dated 2012-01-30; four servings and 300 g turbot fillets with barbue or saint-pierre as alternatives. It does not give a taxon for the alternative or establish a general substitution. |

## Completion boundary

The species identity is source-verified, but the active catalog row remains held until the broader **dory** and **saint-pierre** picker behavior is reviewed. Do not promote aliases that would make either broad query appear species-specific. The proposal changes no application code, shared catalog JSON, ledger, manifest, generated catalog, checklist, or roadmap. No tests were run because this is a proposal-only document with no database JSON changes.
