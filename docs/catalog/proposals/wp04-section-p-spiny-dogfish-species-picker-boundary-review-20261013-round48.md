# WP04 Section P — spiny dogfish species / picker-boundary review (round 48)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** finfish identity, Québec naming, exact ownership, picker projection, recipe-demand, and numeric/substitution boundary review.
- **Recommendation:** **Hold** Atlantic spiny dogfish, *Squalus acanthias*, outside active references and the research ledger. OQLF supports the qualified Québec French term `aiguillat commun`, and Canadian sources document both Atlantic and Pacific spiny dogfish as food-fish candidates. However, CFIA assigns `Spiny Dogfish` to both *S. acanthias* and the separately recognized Pacific species *S. suckleyi*. Under current phrase-first search, a hypothetical `Atlantic spiny dogfish / aiguillat commun` row would make broad `spiny dogfish`, `dogfish`, and `aiguillat` queries return the Atlantic candidate alone. Keep the species out of the picker until search can preserve the species choice for those broader names.
- **Worktree scope:** proposal file only. No shared catalog, forms, legacy identities, ledger, recipe, plan, roadmap, or application data changed. No tests or emulator checks were run for this documentation-only proposal.

## Why this is a distinct open Section P gap

The active Section P checklist remains open for fish identities and for resolving vernacular fish names against appropriate identity evidence. The current fish and regional-seafood proposals and integration archive contain no focused review, allocation, or hold for spiny dogfish, *Squalus acanthias*, or *Squalus suckleyi*. The nearby `requin d’eau douce` mention belongs to a muskellunge proposal, where it is rejected as an unrelated secondary name; it does not review sharks or dogfish. The generic Section P fish-name work does not resolve this species boundary.

This review concerns the Atlantic spiny dogfish identity *S. acanthias* and its name overlap with Pacific spiny dogfish *S. suckleyi*. It does not propose a generic shark, dogfish, or “white fish” identity, and it does not reopen any integrated Section P species or seafood product.

## Identity evidence and Québec naming

OQLF’s GDT places **aiguillat commun** in both ichthyology and edible-fish terminology. It identifies *Squalus acanthias*, directly gives English **spiny dogfish**, and recommends `aiguillat commun` for Québec fish-product marketing. OQLF says the shorter `aiguillat`, `chien`, `chien de mer`, and `saumonette` were not retained in that marketing context to avoid consumer-label confusion. The entry was last updated in 2013. It establishes a Québec term-to-species association, not current Québec inventory. [S01]

CFIA’s Fish List provides the relevant Canadian fish-label boundary. Its rows include:

| Taxon and TSN | Listed English / French names relevant to this review |
|---|---|
| *Squalus acanthias* — 160617 | `Spiny Dogfish` (no French name in that row); `Dogfish / Aiguillat`; `Greyfish / Aiguillat Commun`; and other shark rows. |
| *Squalus suckleyi* — 160620 | `Spiny Dogfish / Aiguillat`. |
| *Squalus blainville* — 160621 | `Dogfish / Aiguillat Galludo`; also `Shark / Requin`. |

The same Fish List also assigns `Dogfish` to unrelated fish, including *Amia calva*. The list links fish-label names to scientific names and taxonomic serial numbers; it is not a culinary equivalence rule. The exact broad English label `Spiny Dogfish` therefore does not distinguish the two *Squalus* species in Canadian naming evidence. [S02–S03]

DFO’s Pacific spiny-dogfish research page says the Pacific population was recognized as distinct from the Atlantic population and adopted the name *S. suckleyi*. It also documents a Pacific commercial fishery and use as a food source in some export markets. This supports keeping the Pacific taxon distinct; it does not establish Canadian or Québec retail wording for a particular package. DFO’s Atlantic dogfish fishery page identifies a directed Atlantic fishery and links current 2026–27 groundfish notices. These fisheries pages establish regional fishery context, not Québec retail availability or a recipe product state. [S04–S06]

A conditional species row, if search later preserves broad-name scope, would be `Atlantic spiny dogfish / aiguillat commun` for *S. acanthias*, with no aliases. The `Atlantic` qualifier is descriptive of the species boundary used in DFO’s Atlantic/Pacific distinction; it is not a separate OQLF headword. Do not use `Spiny Dogfish / Aiguillat` as an unqualified row, because CFIA assigns that label pair to two taxa. Do not add `dogfish`, `aiguillat`, `shark`, `requin`, `greyfish`, `spur dog`, `chien de mer`, or `saumonette` as aliases.

## Current ownership and prior-review audit

The live reference file, attached forms, legacy-import candidates, and research ledger were searched separately for normalized candidate terms, species names, and IDs. Exact terms checked included `Atlantic spiny dogfish`, `spiny dogfish`, `dogfish`, `aiguillat commun`, `aiguillat`, `greyfish`, `shark`, `requin`, *Squalus acanthias*, *Squalus suckleyi*, `ingredient-ref-atlantic-spiny-dogfish`, and `candidate-atlantic-spiny-dogfish`.

| Candidate key or identifier | Active reference | Attached form | Legacy candidate | Ledger record |
|---|---|---|---|---|
| `spiny dogfish`, `dogfish`, `aiguillat commun`, `aiguillat`, *S. acanthias*, *S. suckleyi* | None | None | None | None |
| `ingredient-ref-atlantic-spiny-dogfish`; `candidate-atlantic-spiny-dogfish` | None | None | None | None |
| `WP04-P-DOGFISH-BOUNDARY-20261013-R48-S01` through `-S06` | Not applicable | Not applicable | Not applicable | Prefix checked; no duplicate source IDs found. |

No active form, measurement observation, substitution finding, or ledger decision is attached to either species. No existing reference is proposed for relinking. The proposal and batch archive has no prior focused dogfish review or product-boundary decision. The full-name and taxon matches above were also searched across existing Section P proposals and batches; the unrelated muskellunge use of `requin d’eau douce` is kept separate.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are matched before substring fallback. Current references and their forms were searched, then compared with one hypothetical alias-free row displayed as `Atlantic spiny dogfish / aiguillat commun`.

| Query | Current picker | With hypothetical row | Boundary |
|---|---|---|---|
| `Atlantic spiny dogfish` | No result | Atlantic spiny dogfish / aiguillat commun | The qualified English phrase selects the candidate. |
| `aiguillat commun` | No result | Atlantic spiny dogfish / aiguillat commun | OQLF’s qualified Québec term selects *S. acanthias*. |
| `spiny dogfish` | No result | Atlantic spiny dogfish / aiguillat commun only | The broader CFIA label also belongs to *S. suckleyi*, which is not represented. |
| `dogfish` | No result | Atlantic spiny dogfish / aiguillat commun only | CFIA uses `Dogfish` for multiple other taxa as well. |
| `aiguillat` | No result | Atlantic spiny dogfish / aiguillat commun only | CFIA uses `Aiguillat` for *S. acanthias*, *S. suckleyi*, and other dogfish taxa; OQLF does not retain the short form for Québec fish-product marketing. |
| `shark`; `requin` | No result | No result | These broad terms are not proposed as aliases or display terms. |
| `Squalus acanthias`; `Squalus suckleyi` | No result | No result | Scientific names remain evidence, not picker aliases. |

Although the qualified bilingual name can identify *S. acanthias*, its display still contains the ambiguous phrases above. Omitting aliases would not prevent the current picker from returning the candidate as the only result for the broader searches. A row therefore risks making a generic recipe or product request look species-resolved. Keep the identity unallocated until picker behavior can preserve a generic or species-selection choice.

## Bundled recipe demand

The manifest-ordered package contains **114 recipe files and 1,123 ingredient rows**. All recipe JSON and ingredient-row fields were scanned for `spiny dogfish`, `Atlantic spiny dogfish`, `Pacific spiny dogfish`, `dogfish`, `greyfish`, `aiguillat commun`, `aiguillat`, `aiguillat du Pacifique`, `Squalus acanthias`, and `Squalus suckleyi`. The scan found **zero candidate-term hits in the recipe files and zero hits in ingredient rows**. There is no matching recipe line, linked reference, amount, form, or recipe-specific substitution. Generic “cooked meat or seafood, to taste” wording elsewhere in the package does not select either species.

## Forms, measures, numeric evidence, and substitutions

No supplied recipe or current Québec product page selects a preparation state for this candidate. Do not add fresh, frozen, fillet, cooked, smoked, or other forms based only on fishery or biological sources.

The DFO species pages report body-size and fishery information, including maximum fish lengths. Those are biological or fishery observations, not recipe portions, kitchen counts, edible-yield factors, densities, or unit mappings. No species-specific culinary measure or conversion is established in the reviewed evidence, and the live ledger contains no observation for either *Squalus* identity. Keep density unset and mappings, forms, conversions, yields, and recipe links absent if the candidate is revisited. The accessible numeric values do not support an active measure.

No bundled recipe or reviewed source documents a directed substitution between Atlantic spiny dogfish and Pacific spiny dogfish, generic shark, cod, or another fish. Do not infer interchangeability from shared common-name wording or fish-market grouping. Add no global or contextual substitution, and no recipe-line substitution link.

## Sources

Sources were accessed or checked on 2026-10-13. Proposal-local IDs below were checked against the live research ledger and proposal/batch archive; none was already assigned.

| Source ID | Source | Finding and limit |
|---|---|---|
| **WP04-P-DOGFISH-BOUNDARY-20261013-R48-S01** | OQLF, [GDT: aiguillat commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26511887/aiguillat-commun) | Recommends Québec French `aiguillat commun` for *S. acanthias*, directly gives English `spiny dogfish`, and excludes shorter/contextual names from fish-product marketing. Last updated 2013; terminology evidence, not current stock. |
| **WP04-P-DOGFISH-BOUNDARY-20261013-R48-S02** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *S. acanthias* (TSN 160617) and *S. suckleyi* (TSN 160620) under `Spiny Dogfish`; also lists `Dogfish`/`Aiguillat` names for additional taxa. The page says the list was modified 2023-09-18. Canadian fish-label naming evidence, not culinary equivalence. |
| **WP04-P-DOGFISH-BOUNDARY-20261013-R48-S03** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains the Fish List’s role in fish labelling and its name/taxon entries. Does not establish current product stock or recipe use. |
| **WP04-P-DOGFISH-BOUNDARY-20261013-R48-S04** | Fisheries and Oceans Canada, [Pacific spiny dogfish research](https://www.dfo-mpo.gc.ca/species-especes/sharks/research/dogfish-eng.html) | Identifies Pacific spiny dogfish as *S. suckleyi*, says it is taxonomically distinct from Atlantic *S. acanthias*, and describes historical/current fishery and food-market context. Regional biological/fishery evidence, not a Québec product label or portion. |
| **WP04-P-DOGFISH-BOUNDARY-20261013-R48-S05** | Fisheries and Oceans Canada, [Spiny Dogfish profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/spiny-dogfish-aiguillat-commun-eng.html) | Identifies *S. acanthias* and reports biological size and distribution information. The page was last modified 2016-12-19; its numeric biology is not a culinary measure. |
| **WP04-P-DOGFISH-BOUNDARY-20261013-R48-S06** | Fisheries and Oceans Canada, [Commercial fisheries for spiny dogfish](https://www.dfo-mpo.gc.ca/fisheries-peches/commercial-commerciale/atl-arc/spiny-dogfish-aiguillat-commun-eng.html) | Current Atlantic fishery page links 2026–27 groundfish notices and regional fishery information. This supports Atlantic commercial-fishery context, not Québec retail availability, species-specific consumer packages, or recipe amounts. |

## Recommendation

**Hold** the prospective Atlantic spiny-dogfish identity outside active references and the ledger. The qualified Québec French name and Atlantic species identity are supported, but Canadian fish-label nomenclature uses the bare English phrase `Spiny Dogfish` for both *S. acanthias* and *S. suckleyi*, while the current phrase-first picker would expose only the Atlantic candidate for that query. Bare `dogfish` and `aiguillat` have still broader official naming use. Keep aliases, forms, measurements, recipe links, and substitution behavior absent. Revisit when the picker can preserve these broader scopes or when a product or recipe flow can explicitly retain the intended species without making an unqualified name look resolved.
