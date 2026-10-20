# WP03 Section N — Sea-grape identity boundary review (R922)

- **Reviewed:** 2026-10-19
- **Status:** proposal only; no catalog JSON, ledger, checklist, roadmap, workflow, or batch file was changed.
- **Scope:** generic edible *Caulerpa* sea vegetables called sea grapes, green caviar, or raisins de mer; species boundary, Québec French naming, recipe demand, measurement, and substitution evidence.

## Recommendation

Keep the unqualified `sea grapes / raisins de mer` candidate on hold. Culinary use is well supported, but the market names do not identify one species: both *Caulerpa lentillifera* and *C. racemosa* are eaten and called sea grapes, and sources report the names “sea grapes” and “green/sea caviar” being used across both species. The existing candidate’s question is therefore a real identity boundary, not a lack of evidence that seaweeds are food.

A species-scoped identity for *C. lentillifera* is supportable if a recipe, source, or product explicitly identifies that species. That is a separate, narrower decision; it would not make unqualified sea grapes a safe alias for *C. lentillifera*. The current bundle has no such demand. Do not create an umbrella row or promote the existing `ingredient-ref-sea-grapes` hold candidate into an active generic identity from this evidence alone.

## Current catalog and ledger audit

- No active reference or form names sea grapes, green caviar, *Caulerpa*, `lato`, `latok`, `umibudo`, or `raisin de mer`.
- Related active sea-vegetable identities include nori, kombu, arame, sea lettuce, dulse, wakame, and *Alaria esculenta* / winged kelp. No row is a safe synonym or substitute for an unqualified Caulerpa product.
- The research ledger already has candidate `ingredient-ref-sea-grapes`, with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its earlier sources and hold should remain intact; this review adds evidence to the boundary question but does not authorize editing the shared ledger.
- No matching identity was found in `docs/catalog/legacy-import-identities.v1.json`.
- The reference category used for established sea vegetables is `VEGETABLE_AND_AROMATIC`; that is a catalog classification, not a botanical claim.

## Culinary and species boundary

FAO’s food chapter labels *C. lentillifera* “sea grapes or green caviar” and describes it as eaten in fresh salads. In the same section, FAO identifies *C. racemosa* as another popular edible Caulerpa, also used in fresh salads. A peer-reviewed comparative paper is more explicit: “sea grapes” is a collective term for edible Caulerpa varieties and compares *C. lentillifera* with *C. racemosa*. A separate peer-reviewed paper reports the two species are called “sea grapes” or “sea caviar” interchangeably in local usage and eaten raw as salad. These sources support the food category and explain why a generic name alone cannot assign a single species.

If later evidence supports a species-specific row, scope it to the Latin binomial and keep the common market term visibly qualified. Do not add genus-wide identity aliases for `Caulerpa`, `sea grapes`, `green caviar`, `sea caviar`, `lato`, or `latok`; their observed use does not resolve the species. A recipe naming *C. lentillifera* could support that species row and its source-backed local names, while *C. racemosa* would remain separate. Do not merge those taxa because they share a market name.

## French-Canada naming and picker consequences

No Québec-authority entry was found that assigns a preferred French culinary name to the Caulerpa ingredient. The OQLF entry for singular **`raisin de mer`** is botanical and identifies *Coccoloba uvifera*, an unrelated seaside-grape plant. France’s 2025 DGCCRF commercial-name table lists `raisin de mer / umibodo / groseille de mer` for *C. lentillifera*, and French culinary coverage uses `caviar vert` and `raisins de mer`; those are useful French evidence but do not establish a preferred Québec term. The French article itself phrases the identification as a question, so it is not used here to settle species assignment.

Avoid bare `raisin de mer` as the Québec display or an unqualified French alias. If a future species-scoped row is justified, keep *Caulerpa lentillifera* in both localized display labels and obtain Québec terminology review before choosing a French common-name display. A taxon-qualified French search term may be considered only if the interface policy permits qualified aliases; it should not be represented as an OQLF-preferred name.

Current picker owners and consequences, based on the app’s normalized full-word phrase matching followed by substring fallback:

| Query / term | Current or expected result | Boundary |
|---|---|---|
| `grapes` | Active fruit identity `ingredient-ref-grapes` (`grapes` / `raisin`) | A future `sea grapes` display or alias would co-display on this one-word query; this is a useful visible collision, not a synonym relationship. |
| `raisin` | Active fresh grape `ingredient-ref-grapes` (`raisin`); other raisin-related culinary identities remain separate | A future `raisin de mer` alias would also match this one-word query. Do not merge or rename the grape identity to resolve the overlap. |
| `raisin de mer` | No active culinary identity | The OQLF botanical homonym is *Coccoloba uvifera*; do not map that unqualified Québec term to an alga. |
| `caviar vert` | No active exact phrase found | A full phrase could identify a future, qualified sea-vegetable row; a shorter `caviar` query already returns salmon roe and trout roe, so the broader query would show distinct results. |
| `sea grapes`, `green caviar`, `lato`, `latok`, `Caulerpa` | No active matching Caulerpa identity | Do not let a one-result picker falsely imply that any of these market names uniquely determines *C. lentillifera*. |

These are predicted search consequences from the current reference names and the implementation of `filterByIngredientSearchQuery`; this proposal did not run the app or perform live picker QA.

## Recipe demand

I scanned all 114 manifest-listed recipes and 1,123 ingredient rows, including string-valued ingredient fields, for sea-grape names, French terms, regional names, and Caulerpa taxa. No matching ingredient row was found. There is no recipe row to link, no line qualifier to normalize, and no recipe-based reason to choose *C. lentillifera* over *C. racemosa*. This absence does not negate their culinary use; it means no recipe-specific mapping or quantity should be inferred.

## Measurement, density, and form evidence

- **Current active data:** no sea-grape form, density, unit mapping, package yield, or conversion exists.
- **Category-level value:** no source found for a transferable mass/volume measure or `g/ml` density. Keep density null and add no unit mapping.
- **Species/state evidence:** PROSEA reports fresh *C. lentillifera* fronds in 100–200 g packages in Japan and says salted/dehydrated material expands when soaked in fresh water. The package size is market- and source-specific; the hydration statement gives no starting state, mass ratio, drain specification, or reusable yield.
- **Product-scoped example:** Kaviari’s named 100 g product is identified as *C. lentillifera* with salt and gives a three-minute soak-and-drain instruction. Keep that package weight and instruction scoped to the named product. They do not establish a generic serving, density, or hydration conversion for sea grapes.
- **Ledger disposition if the held candidate is updated:** `measurementState: researched_no_supported_value`. The sources were reviewed, but they supply no transferable ingredient-level numeric value. If a future recipe names a preserved form, research its exact product state separately instead of generalizing a manufacturer’s direction.

## Substitution evidence

No source reviewed recommends replacing one Caulerpa species with another or replacing Caulerpa with nori, wakame, kelp, or another sea vegetable in a recipe. The comparative research distinguishes species and reports differences in morphology and composition; shared raw-salad use does not prove sensory or functional interchangeability. Do not add a global substitution rule or contextual replacement from this evidence. For the existing unresolved umbrella candidate, an updated ledger could record `substitutionResearchState: researched_no_supported_substitute` with the limited scope stated here; no substitute identity or recipe-line link is supported.

## Sources

| Source | Evidence and limit |
|---|---|
| [FAO, *A guide to the seaweed industry*, section 8.8](https://www.fao.org/4/y4765e/y4765e0b.htm) (existing ledger source `WP03-SEA-VEGETABLES-20261009-S12`) | Calls *C. lentillifera* sea grapes / green caviar and describes salad use; also says *C. racemosa* is another popular edible Caulerpa. Supports the culinary and species boundary, not Québec naming or a recipe measure. |
| [Paul et al., “Comparative production and nutritional value of ‘sea grapes’” (2014), University of the Sunshine Coast record](https://research.usc.edu.au/esploro/outputs/journalArticle/Comparative-production-and-nutritional-value-of/99450698602621) | Peer-reviewed abstract explicitly calls sea grapes a collective term for edible Caulerpa varieties and compares *C. lentillifera* and *C. racemosa*. Reports species differences; not a substitution guide. |
| [Yap et al., Malaysian green seaweeds study (2019), PubMed Central](https://pmc.ncbi.nlm.nih.gov/articles/PMC6783820/) | States that both distinct edible species are called sea grapes / sea caviar interchangeably in local usage and eaten raw as salads. Confirms that the common names do not uniquely identify one species. |
| [PROSEA, *Caulerpa lentillifera* species record](https://prosea.prota4u.org/view.aspx?id=719) | Species-specific vernacular names, salad use, salted exports, package and soaking observations. Its local production and package facts are not universal measures. |
| [Philippines National Nutrition Council, “Facts you should know about Sea Grapes”](https://nnc.gov.ph/mindanao-region/facts-you-should-know-about-sea-grapes/) (existing ledger source `WP03-SEA-VEGETABLES-20261009-S13`) | Associates *C. lentillifera* with sea grapes, lato, latok, and green caviar. Supports regional naming only; its unsourced health claims are not used. |
| [OQLF, `raisin de mer`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18047317/raisin-de-mer) | Québec botanical entry identifies *Coccoloba uvifera*, not an alga. Supports avoiding the bare French term as an unqualified algal alias. |
| [France DGCCRF, *Liste des algues*, version applicable since September 2025](https://www.economie.gouv.fr/files/files/directions_services/dgccrf/consommation/Produits-de-la-mer/liste-algues-202509.pdf) | Lists `raisin de mer / umibodo / groseille de mer` for *C. lentillifera*. A France-specific commercial-name record, not a Québec preferred-term ruling. |
| [Régal, “Le caviar vert d’Okinawa”](https://www.regal.fr/produits/rares/le-caviar-vert-dokinawa-1061341) | French culinary usage includes `raisins de mer`, `caviar vert`, and `lato`, but the page questions the species identification; use only as evidence of French culinary wording, not taxonomic assignment. |
| [Kaviari, “Raisins de mer” product page](https://kaviari.com/fr/produits/autres-produits-de-la-mer/raisins-de-la-mer) | Manufacturer page identifies its named product as *C. lentillifera* and salt, lists 100 g and a 3-minute soak/drain direction. Product-scoped evidence only; no values are generalized to the ingredient category. |

## Disposition summary

Retain the existing `ingredient-ref-sea-grapes` ledger candidate as unresolved and document this species/name boundary. Do not add recipe links, forms, density, unit mappings, yields, conversions, or substitutions. A future species-specific *C. lentillifera* identity remains possible, but it requires an explicit species boundary and Québec-safe French display decision; it must not absorb *C. racemosa* or the OQLF botanical `raisin de mer` identity.
