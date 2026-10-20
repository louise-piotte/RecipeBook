# WP04 Section P — winter skate / raie tachetée picker-boundary review (R121)

- **Review and source-access date:** 2026-10-15.
- **Integration outcome:** Documentation-only hold recorded on 2026-10-15; see [the batch README](../batches/wp04-section-p-winter-skate-picker-boundary-hold-r121-20261015/README.md).
- **Packet type:** one species identity, Canadian and Québec naming, alias boundary, picker projection, market evidence, and recipe-demand review.
- **Candidate:** winter skate / raie tachetée, *Leucoraja ocellata* (Mitchill, 1815; CFIA TSN 564145).
- **Recommendation:** keep this species outside active ingredient references and the shared research ledger. The CFIA Fish List supports the qualified name pair, but adding only this species would make the broad `skate` and `raie` queries return a misleading single result. Current Québec retail evidence identifies only a generic skate-wing product, not *L. ocellata*. Do not add the DFO alternatives `big skate` or `eyed skate` as aliases; notably, the current CFIA list assigns `Big Skate` to *Beringraja binoculata*.
- **Shared-data effect:** none. This proposal adds no reference, alias, ledger record, form, measure, recipe link, conversion, yield, or substitution.
- **Tests:** none; proposal-only documentation.

## Why this is a distinct unresolved question

The open Section P finfish item in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4656) still covers regional fish and picker boundaries. The recent [R120 thorny-skate review](wp04-section-p-thorny-skate-picker-market-boundary-review-r120-20261014.md) scoped its candidate to *Amblyraja radiata*. It cited winter skate only as another CFIA taxon sharing the generic `Skate / Raie` pair; it did not evaluate *L. ocellata* as its own candidate, its DFO-listed `big skate` and `eyed skate` alternatives, or the effect of a winter-skate display on the live picker. The [R120 integration README](../batches/wp04-section-p-thorny-skate-picker-boundary-hold-r120-20261014/README.md) did not allocate winter skate or the generic wing product.

The bounded question here is whether the specific *L. ocellata* identity can be exposed in the current ingredient picker as **winter skate / raie tachetée** while generic market searches remain useful. This review does not reopen thorny skate, assign a species to generic skate wings, or treat the skate species as culinary substitutes.

## Canadian and Québec name and market evidence

The CFIA Fish List gives *L. ocellata* (TSN 564145) the qualified pair **Winter Skate / Raie tachetée**. The same current list assigns the generic **Skate / Raie** pair to other taxa, including *Amblyraja radiata*, *Beringraja binoculata*, *Malacoraja senta*, and *Raja rhina*. CFIA describes the list as common names acceptable in Canada for fish labelling, with scientific names and TSNs for species identification. Those rows establish the names’ scope; they do not imply that the species or their products are interchangeable. The Fish List reports a data modification date of 2023-09-18. [S01]

The OQLF GDT entry for **raie** places the word in zoology/ichthyology and edible-fish domains, gives English **skate** and **ray**, and identifies the Latin family Rajidae. It notes commercial potential in Québec and that most commercialized species belong to *Raja*. The entry was last updated in 2011; it supports a broad Québec market term, not *L. ocellata* as its only species. [S02]

Fisheries and Oceans Canada identifies *L. ocellata* as winter skate, gives its Northwest Atlantic range, and says its profile also uses **big skate** and **eyed skate**. That page was modified in 2018 and is biology/fishery context, not current Québec retail terminology. Its `big skate` wording conflicts with the CFIA Fish List’s current food-labelling entry, which assigns **Big Skate** to *B. binoculata* while giving *L. ocellata* **Winter Skate / Raie tachetée**. Keep `big skate` out of this candidate’s aliases. `Eyed skate` also has no current Québec product evidence and is not needed for the qualified display. [S01, S03]

Recent federal fisheries data confirms a commercial-record category without identifying a Québec consumer product: DFO’s eastern-Canada landing dataset covers 2014–2023 and includes Quebec-region harvest data and a `WinterSkate` species/gear type. This source does not establish that a particular retail item is winter skate, that winter skate is currently available at a Québec retailer, or that it is the species behind an unqualified skate-wing product. [S04]

Québec-facing market evidence remains species-unspecified:

- Mayrand currently lists **Aile de raie sans peau fraîche env. 500 g** (product 52957) and showed the item in stock at its Anjou, Brossard, and Saint-Jérôme stores when accessed. The listing gives no scientific name, species, fishery area, or population. Its approximate 0.5 kg is a retailer SKU quantity only. [S05]
- Poissonnerie La Mer’s bilingual arrival list dated 2026-01-23 uses **Ailes de raie / Skate wing** and **Ailes de raie nettoyée / Cleaned skatewing**, with Atlantic origin and sale by kilogram. It names no taxon and is a dated supplier snapshot, not a statement of October inventory. [S06]

The Government of Québec’s species list names the **Gulf of St. Lawrence population** of raie tachetée under its threatened-species list. This is a population-scoped conservation entry, not evidence that Mayrand’s unqualified SKU came from that population or a food-label restriction. Do not infer the SKU’s species or population from its Québec sale location. [S07]

## Ownership and picker projection

The read-only package snapshot contains **1,465 ingredient references, 105 forms, 63 legacy candidates, 1,806 research-ledger records, and 114 manifest-listed recipe files**. Exact normalized-key checks found no owner in references, forms, legacy candidates, or ledger record IDs for *L. ocellata*, `winter skate`, `raie tachetée`, `big skate`, `eyed skate`, `skate wing`, `aile de raie`, `ingredient-ref-winter-skate`, or `candidate-winter-skate`. Repository review found no focused winter-skate proposal or batch; R120 is the only nearby focused review and mentions winter skate as a separate CFIA name only. The R121 source-ID prefix in the register below was absent from the proposal archive and ledger when checked.

The projection follows the current bilingual matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents/punctuation, returns complete word-phrase matches first, then uses substring fallback. I projected an alias-free hypothetical row named **winter skate / raie tachetée** against all active references and forms. It is a static code-behavior projection, not a UI or emulator test.

| Query | Current results | With a hypothetical winter-skate row | Picker consequence |
|---|---|---|---|
| `winter skate` | None | Winter skate only | The English species-qualified query is specific. |
| `raie tachetée` | None | Winter skate only | The CFIA French species-qualified query is specific. |
| `skate` | None | Winter skate only | Misleading singleton: CFIA uses `Skate / Raie` for several taxa; an unqualified search would look resolved. |
| `raie` | None | Winter skate only | Misleading singleton: OQLF’s Québec term and CFIA’s pair span skate species. |
| `big skate` / `eyed skate` | None | None with empty aliases | Do not add these source alternatives as aliases. CFIA currently gives `Big Skate` to *B. binoculata*, and no Québec SKU reviewed here uses either term. |
| `skate wing` / `aile de raie` | None | None | The species row would not represent the actual Québec product title. |

The display alone creates the singleton `skate` and `raie` results, so empty alias arrays do not resolve the boundary. Adding `big skate` would create a second name conflict: the DFO species profile uses the phrase for *L. ocellata*, while CFIA’s food-name list assigns it to a distinct Pacific skate, *B. binoculata*. Keep the candidate unallocated unless picker behavior can preserve the broader choice set or a source-qualified user entry supplies *L. ocellata*.

## Bundled recipe demand and product-state boundary

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned, including ingredient names, original text, linked identifiers, and all parsed string values. The exact phrase scan covered `winter skate`, *L. ocellata*, `raie tachetée`, `big skate`, `eyed skate`, `skate`, `raie`, `skate wing`, and `aile de raie`. It found **zero matching recipe files and zero matching ingredient rows**. The bundle has no line to link, amount to preserve, preparation state to encode, or substitution context to apply.

The Mayrand fresh, skinless wing title and La Mer’s cleaned-wing listing are product-specific, species-unspecified evidence. They do not support attaching a wing form to *L. ocellata*, creating a generic skate identity, or inferring skinning, edible yield, cooking yield, density, count, package conversion, or a default measure. The DFO fisheries data and profile are not recipe-measure sources. Add no form, quantity, recipe link, conversion, yield, or substitution; in particular, do not infer interchangeability between winter skate, thorny skate, or another seafood from their shared market word.

## Recommendation and remaining question

Keep *Leucoraja ocellata* outside active references and the shared ledger. Retain **winter skate / raie tachetée** as a source-supported Canadian species name in this proposal, but do not add the row while it would be the only result for broad **skate / raie** searches. Do not use **big skate** or **eyed skate** as aliases. Do not map the Québec **aile de raie** products to this taxon.

**Reviewer question:** Should the picker represent the broader skate/raie name group before exposing a single skate species for those shared terms, or should it allow a singleton result for a species-qualified display? Under the current matcher and product evidence, this proposal recommends holding the row. Revisit if picker behavior preserves shared-name scope or a current Québec product explicitly identifies *L. ocellata*. Section P remains open.

The documentation-only hold was integrated on 2026-10-15. No catalog reference or ledger record was added; the plan, roadmap, and batch README now record the decision. No forms, measures, recipe links, conversions, yields, or substitutions were added. No app, Gradle, instrumentation, emulator, or deployment tests were run.

## Source register

Sources were checked on 2026-10-15. Proposal-local source IDs below are not shared-ledger records. Retailer and fisheries observations are limited to the pages or dataset snapshots reviewed.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S01** | Canadian Food Inspection Agency, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [searchable results](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=skate) | Current online list gives TSN 564145, *L. ocellata*, `Winter Skate / Raie tachetée`; also shows `Skate / Raie` for *A. radiata*, *B. binoculata*, *M. senta*, and *R. rhina*. Its separate *B. binoculata* entry is `Big Skate`. CFIA identifies the Fish List as Canadian fish-labelling common-name and taxon information; it does not prescribe RecipeBook search behavior or culinary equivalence. The query/list data reports modification date 2023-09-18. |
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S02** | Office québécois de la langue française, [GDT: raie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198838/raie) | Last updated 2011; Québec edible-fish term, English `skate`/`ray`, Latin family Rajidae, and a note that most commercialized species belong to *Raja*. Family/common-market terminology, not a species crosswalk for a retail item. |
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S03** | Fisheries and Oceans Canada, [Winter Skate (*Leucoraja ocellata*) profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/winterskate-raietachetee-eng.html) | Identifies the species, Northwest Atlantic range, and alternative names `big skate` / `eyed skate`; says the directed eastern Scotian Shelf fishery shut down and winter skate continues as bycatch. Page modified 2018-11-22; not current Québec retail naming or availability evidence. Its `big skate` wording is not adopted because CFIA’s food-labelling list assigns that name to *B. binoculata*. |
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S04** | Fisheries and Oceans Canada, [Eastern Canadian commercial fishing dataset layers](https://egisp.dfo-mpo.gc.ca/arcgis/rest/services/open_data_donnees_ouvertes/eastern_canadian_commercial_fishing/MapServer/layers) | The dataset describes 2014–2023 commercial species/gear landings for Newfoundland and Labrador, Maritimes, Gulf, Quebec, and Eastern Arctic regions and lists `WinterSkate` among skate layer types. Fisheries-record scope only; it does not identify any retail SKU or establish present inventory. |
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S05** | Mayrand, [Aile de raie sans peau fraîche env. 500 g](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/raie-aile-sans-peau-fr-52957) | Current Québec product page, product 52957; approximate 0.5 kg unit and store availability were displayed when accessed. No scientific name, species, origin, or population. SKU weight is not a serving, measure, or yield. |
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S06** | Poissonnerie La Mer, [bilingual arrival list, 2026-01-23](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_23-01-2026.pdf?v=1769118808) | Lists Atlantic-origin `Ailes de raie / Skate wing` and cleaned wings by kilogram. Supplier arrival-list snapshot; no binomial or individual skate species, and it does not establish October stock. |
| **WP04-SECTIONP-WINTER-SKATE-R121-20261015-S07** | Gouvernement du Québec, [Liste des espèces fauniques menacées ou vulnérables](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/gestion-faune-habitats-fauniques/especes-fauniques-menacees-vulnerables/liste) | Page last updated 2025-03-31; lists the Gulf of St. Lawrence population of `raie tachetée` under threatened species. Population-specific conservation context only; it does not identify the retailer’s product or establish its harvest area. |

## Static review record

- Read `AGENTS.md`, the Section P plan, the R120 proposal and batch README, nearby recent WP04 proposals, the live reference and form JSON, research ledger, legacy candidates, manifest, and matcher source.
- Audited 1,465 references, 105 forms, 63 legacy candidates, and 1,806 ledger records for exact candidate terms and proposed IDs; no owner was found. Checked the R121 proposal source prefix against the current proposal and batch archive and ledger; no collision was found.
- Reproduced the current phrase-first picker projection for current and hypothetical winter-skate names, including the `big skate` alias boundary.
- Parsed all 114 manifest-listed recipes and 1,123 ingredient rows; the exact phrase scan found no candidate or generic skate/raie demand.
- This is a documentation-only proposal. No app, Gradle, instrumentation, or emulator tests were run.
