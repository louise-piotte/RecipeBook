# WP04 Section P — thorny skate / raie épineuse picker and Québec market-boundary review (R120)

- **Review date:** 2026-10-14.
- **Packet type:** species identity, Canadian and Québec naming, current product scope, picker behavior, recipe demand, and numeric/substitution boundary.
- **Candidate:** thorny skate / raie épineuse, *Amblyraja radiata* (Donovan, 1808).
- **Recommendation:** keep this species outside active ingredient references and the research ledger. Canadian sources support the species and its qualified names, but CFIA also assigns the generic label pair “Skate / Raie” to several skate taxa. Under the current phrase-first picker, a lone “thorny skate / raie épineuse” row would capture broad “skate” and “raie” searches. The Québec product listings reviewed use only the species-unspecified wing product name, so they do not support assigning that generic market request to *A. radiata*.
- **Shared-data effect:** none. This proposal adds no reference, alias, ledger record, form, measure, recipe link, conversion, package yield, or substitution.
- **Tests:** none. This is a proposal-only review.

## Why this is one distinct open candidate

The Section P plan leaves vernacular-fish identity resolution open. A search of active references, forms, legacy candidates, the research ledger, prior Section P proposals, and batch notes found no focused allocation or decision for *Amblyraja radiata*, thorny skate, or raie épineuse. The only nearby mention is the Atlantic cod-cheek review, which lists skate cheeks as a separate unreviewed cut and explicitly does not assign that cut to cod. It does not review this species or the generic skate-wing market product.

This review is limited to the species *A. radiata* and its picker boundary with the generic skate/raie market words and the species-unspecified wing product. The CFIA-listed winter skate (*Leucoraja ocellata*) is noted only to distinguish the shared market-name scope; it is not a second candidate.

## Canadian and Québec names and product evidence

The CFIA Fish List identifies *A. radiata* as **Thorny Skate / Raie épineuse** and also lists **Skate / Raie** for that same taxon. Its rows assign that same generic pair to other taxa as well, including big skate (*Beringraja binoculata*), smooth skate (*Malacoraja senta*), and longnose skate (*Raja rhina*). The list identifies winter skate separately as **Winter Skate / Raie tachetée**. This is accepted Canadian fish-labelling evidence; it documents shared common-name scope, not culinary equivalence among the species. [S01]

The OQLF GDT entry for **raie** is in zoology/ichthyology and edible-fish terminology, gives English **skate** and **ray**, and maps the Latin term to the family Rajidae. It notes commercial potential in Québec and says most marketed species belong to *Raja*. The entry supports the generic Québec word and family context, not *A. radiata* as the sole meaning of “raie.” [S02]

Fisheries and Oceans Canada identifies *A. radiata* as thorny skate and documents its Canadian Atlantic range and human-consumption fishery. Its general skate-fishery page says the Northwest Atlantic commercial fishery has primarily targeted winter and thorny skates and that their pectoral fins are marketed as wings. It also notes that Canadian landings are not consistently identified by species. These pages support a real Canadian edible-fish context, but do not establish that an unspecified wing SKU is thorny skate. [S03–S04]

Québec-facing market evidence remains product-group level:

- Poissonnerie La Mer’s bilingual arrival list dated 2026-01-23 lists “Ailes de raie / Skate wing” and “Ailes de raie nettoyée / Cleaned skatewing,” with Atlantic origin and kilograms as the commercial unit. It gives no scientific name or individual species. [S05]
- Mayrand lists “Aile de raie sans peau fraîche env. 500 g” and showed availability at its Anjou, Brossard, and Saint-Jérôme stores when accessed. The page does not identify the taxon. Its approximate half-kilogram size is a retailer SKU fact, not a recipe measure. [S06]

Together, these sources show current Québec market wording for a generic wing cut and Canadian support for multiple skate species. They do not show that the Québec wings are *A. radiata*, that all such products share one species, or that “thorny skate” is a current Québec retail label.

## Ownership and picker boundary

The audited package snapshot contains 1,464 ingredient references, 105 forms, 63 legacy candidates, and 1,805 research-ledger records. Exact-term scans found no owner for *A. radiata*, thorny skate, raie épineuse, generic skate/raie, skate wing, or aile de raie in references, forms, legacy candidates, or ledger. No existing ID owns the prospective ingredient-ref-thorny-skate or ingredient-ref-skate-wing keys. The proposed proposal-local source-ID prefix was also unused.

The projection below follows the current phrase-first normalized search in IngredientSearch.kt. Queries find complete word phrases inside display names before falling back to partial matches. A species-qualified display still contains the generic word token, even with empty aliases.

| Query | Current results | If a single thorny-skate row were added | Boundary |
|---|---|---|---|
| “thorny skate” | None | Thorny skate only | Species-qualified English query is specific. |
| “raie épineuse” | None | Thorny skate only | Species-qualified French query is specific. |
| “skate” | None | Thorny skate only | Misleading singleton: CFIA uses generic Skate for several taxa, and Québec listings leave the wing product unqualified. |
| “raie” | None | Thorny skate only | Misleading singleton: OQLF uses the term for Rajidae, and CFIA shares Raie across taxa. |
| “skate wing” | None | None | The species row does not represent the actual Québec product wording. |
| “aile de raie” | None | None | The species row does not represent the actual Québec product wording. |
| “winter skate” / “raie tachetée” | None | None | These remain a separate CFIA species pair. |
| “ray” | Three existing partial-match results | Same three | Do not add “ray” as an alias; it already collides with French “rayé” terms and is broader than this skate family. |

An alias-free species row would therefore still take generic “skate” and “raie” searches. The current display model cannot keep those queries shared while making the species-qualified terms discoverable. Keep the generic wing product separate from any future species row; the reviewed Québec product labels are not species evidence.

## Bundled recipe demand

I scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows, checking both ingredient names and original text for thorny skate, *A. radiata*, raie épineuse, skate wing(s), aile(s) de raie, generic skate/raie, and winter skate/raie tachetée. There were **zero matching recipe files and zero matching ingredient rows**. The corpus provides no line to link, preparation state to encode, product amount, or substitution context.

## Forms, quantities, and substitutions

- **Product state:** the Québec source examples are fresh, skinless or cleaned wing products. These are retailer-specific preparations and do not establish reusable species forms for *A. radiata*. Add no form.
- **Measures:** the Mayrand approximate 500 g listing and La Mer kilogram entries are SKU or wholesale-unit observations only. No recipe measure, density, unit mapping, package yield, or species-specific portion is supported here.
- **Substitution:** no bundled recipe names this candidate or the generic wing product. No source reviewed establishes a directed substitution between thorny skate, winter skate, other skates, or other seafood. Add no substitution rule or recipe-line link.

## Recommendation

Hold *Amblyraja radiata* outside active references and the ledger. Retain **thorny skate / raie épineuse** as a well-supported Canadian species-name pair in this proposal, but do not add it as a lone picker result for generic **skate / raie**. The CFIA list shows that the generic pair spans several skate species, while Québec products reviewed use only the unspecified wing term. Revisit if the user’s recipe or import explicitly identifies *A. radiata*, or if search can preserve shared-name scope while keeping the qualified species selectable.

Do not add aliases, a generic skate-wing reference, forms, measures, recipe links, conversions, yields, or substitutions in this packet. Section P remains open.

## Source register

Sources were accessed on 2026-10-14. IDs are local to this proposal and have not been entered in the shared research ledger.

| Source ID | Source and evidence | Limit |
|---|---|---|
| WP04-SECTIONP-THORNY-SKATE-R120-20261014-S01 | Canadian Food Inspection Agency, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). Search results for skate include *Amblyraja radiata* as Thorny Skate / Raie épineuse and Skate / Raie; *Beringraja binoculata*, *Malacoraja senta*, and *Raja rhina* also carry Skate / Raie. Winter skate *Leucoraja ocellata* is listed as Winter Skate / Raie tachetée. | Canadian fish-labelling common names; not evidence of culinary interchangeability or the species in an unspecified Québec SKU. |
| WP04-SECTIONP-THORNY-SKATE-R120-20261014-S02 | Office québécois de la langue française, [raie, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198838/raie). Preferred French term; edible-fish context; English translations skate and ray; Latin family Rajidae; note on Québec commercial potential and marketed *Raja* species. | Family/common-name scope, not a species identification or current retail listing. |
| WP04-SECTIONP-THORNY-SKATE-R120-20261014-S03 | Fisheries and Oceans Canada, [Thorny Skate (*Amblyraja radiata*) profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/thornyskate-raieepineuse2-eng.html). Identifies the species, Atlantic Canadian range, and human-consumption fisheries. | Species and fishery context; page modified 2018-11-22, not evidence of current Québec inventory. |
| WP04-SECTIONP-THORNY-SKATE-R120-20261014-S04 | Fisheries and Oceans Canada, [Skates and rays general information](https://www.dfo-mpo.gc.ca/species-especes/skates/info/index-eng.html). Describes edible wings, commercial attention to winter and thorny skate, commercial marketing of their pectoral fins, and species-unspecified landing records in Canada. | Fisheries context; the page includes historical management information and does not identify the local Québec products. |
| WP04-SECTIONP-THORNY-SKATE-R120-20261014-S05 | Poissonnerie La Mer, [bilingual arrival list, 2026-01-23](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_23-01-2026.pdf?v=1769118808), lines 58–59. Lists Atlantic-origin skate wings and cleaned skate wings as “Ailes de raie / Skate wing” and “Ailes de raie nettoyée / Cleaned skatewing,” sold by kilogram. | Supplier arrival-list snapshot; no taxon, stable availability claim, or household measure. |
| WP04-SECTIONP-THORNY-SKATE-R120-20261014-S06 | Mayrand, [Aile de raie sans peau fraîche env. 500 g](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/raie-aile-sans-peau-fr-52957). Retail listing with Québec store availability and approximate SKU weight. | Product page does not state the species; its approximate package weight is SKU-specific. |

## Static review record

- Read AGENTS.md, the Section P plan, current references and forms, legacy candidates, research ledger, relevant nearby proposals/batches, and current matcher source.
- Audited exact candidate terms and prospective identity keys against 1,464 references, 105 forms, 63 legacy candidates, and 1,805 ledger records; found no owners.
- Searched the proposal/batch archive for the species and product boundary. The only nearby skate reference is the cod-cheek review’s exclusion of skate cheeks; no focused thorny-skate or skate-wing review was found.
- Projected current picker behavior for the queries above using the current bilingual term matching rules.
- Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows; found no candidate or generic skate-wing demand.
- At proposal preparation, no catalog, ledger, recipe, plan, roadmap, generated index, source code, or batch README was changed. Root later recorded the documentation-only hold in the plan and batch README. No application tests or emulator checks were run.
