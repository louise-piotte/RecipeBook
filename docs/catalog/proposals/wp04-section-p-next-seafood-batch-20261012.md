# WP04 Section P: Yellowtail flounder / limande à queue jaune search-boundary review

- **Review date:** 2026-10-12
- **Status:** Proposal only. The species identity and bilingual name pair are source-verified. Hold the active catalog row until the broader flounder-query behavior is reviewed.
- **Disposition:** Do not add a reference, legacy candidate, ledger identity record, form, recipe link, measurement, conversion, yield, density, or substitution in this pass.

## Decision

Yellowtail flounder is a verifiable species identity: current DFO science uses *Myzopsetta ferruginea*; the Québec-preferred French name is **limande à queue jaune**; and OQLF gives **yellowtail flounder** as the English equivalent. Older Canadian names sources use *Limanda ferruginea*, which WoRMS lists as a synonym accepted as *Myzopsetta ferruginea*. This is a resolved naming identity, not an unresolved taxon [S01, S03–S05].

Keep that identity out of the active picker until its broad-query behavior is reviewed. The current catalog has no result for the query **flounder**. Adding the source-verified English display name would make the new species the only result for that query because the picker searches complete word phrases inside display names. CFIA’s Fish List uses the common English term **Flounder** across multiple taxa and lists French **Plie** for several as well. Some rows pair the generic terms (for example, *Glyptocephalus cynoglossus*, *Glyptocephalus zachirus*, and *Limanda ferruginea*); others include Flounder within a species-qualified name, such as arrowtooth flounder, American plaice, winter flounder, and California flounder. A single yellowtail-flounder result would therefore make an unqualified query look species-specific when the source terminology is not [S02].

This is a species-specific follow-up to the earlier generic sole/flounder hold, not a reopening of that decision. The earlier finfish gap proposal mentioned limande à queue jaune only as one of several flatfish sometimes sold as “sole”; it did not allocate this species or check the current picker result for the word flounder ([earlier finfish gap review](wp04-finfish-gaps-20261010.md), S14). The Section P finfish checklist remains open.

## Search boundary and exact term decisions

The app search index uses normalized English/French display names and aliases. It first returns rows containing the whole query phrase within those terms, then falls back to partial matching. The current 1,297-reference catalog has zero matches for **flounder**, **yellowtail flounder**, **yellowtail**, **rusty dab**, **sandy dab**, **sole**, **dab**, and **limande**; **plie** returns only the existing American plaice reference. These counts were calculated against active reference displays and aliases using the normalization and phrase rules in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

If a row with the canonical English display were activated now:

- **yellowtail flounder** would return the intended species.
- The shorter query **flounder** would also return that same single row, even though CFIA uses Flounder / Plie for multiple taxa.
- The shorter query **yellowtail** would return that same row, even though CFIA also lists Yellowtail Snapper, Yellowtail Rockfish, and Yellowtail Scad.
- French queries for **limande** and **queue jaune** would match the canonical French display. The evidence establishes the species-qualified name, but this pass does not establish that the shorter query limande should select only this species.

Do not promote the following source-attested terms into aliases during this hold:

| Term | Source evidence | Decision |
|---|---|---|
| yellowtail flounder / limande à queue jaune | OQLF pairs the English term with the Québec-normalized French term; DFO’s 2026 report uses the current binomial. | Verified conditional display pair only. Do not activate until flounder-query behavior is resolved. |
| yellowtail | OQLF lists it as an English equivalent; CFIA also lists Yellowtail Snapper, Yellowtail Rockfish, and Yellowtail Scad. | Do not add as an alias. The word is already embedded in the proposed English display, which is another reason to hold the row. |
| rusty dab / sandy dab | OQLF lists both as English equivalents. Each would also make the broader query **dab** return this one species. | Keep in evidence notes; no alias promotion. |
| queue jaune / limande ferrugineuse | Fourchette Bleue gives these as other French names. The latter would also make the shorter query **limande** return this one species. | Keep in evidence notes; no alias promotion. |
| dab / plie | CFIA lists Dab / Limande à Queue Jaune and Flounder / Plie for this taxon, while assigning these short terms to other flatfish as well. | Do not add as aliases. |
| sole | OQLF discourages this market name for the species because it can be confused with common sole; Fourchette Bleue describes culinary “sole” as a name grouping several flatfish species. CFIA also applies Sole / Sole to multiple taxa. | Do not use as a display, alias, or identity merge. |

Omitting explicit aliases would not fix the broad-query issue: **flounder**, **yellowtail**, **limande**, and **queue jaune** occur within the proposed displays themselves. Adding aliases for **sole**, **plie**, or **dab** would add broad terms directly; the longer aliases **rusty dab**, **sandy dab**, and **limande ferrugineuse** would also match shorter searches for those component words. Keep the identity verified in this proposal, but do not allocate an active row until the picker can expose a meaningful broader flounder result set or clearly communicate ambiguity. Reconsider species-scoped aliases only after checking that each proposed term does not make a broader query falsely appear species-specific.

## Conditional catalog shape

The following fields document the verified candidate only. This block is not an active row, does not reserve an ID, and should not be copied into the seed package until the picker boundary is resolved.

    {
      "id": "ingredient-ref-yellowtail-flounder",
      "nameFr": "limande \u00e0 queue jaune",
      "nameEn": "yellowtail flounder",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-12T00:00:00Z",
      "category": "PROTEIN"
    }

No exact owner was found in active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, or ledger record IDs for the proposed ID **ingredient-ref-yellowtail-flounder** or these normalized candidate-specific terms: **yellowtail flounder**, **limande à queue jaune**, **yellowtail**, **rusty dab**, **sandy dab**, **queue jaune**, **limande ferrugineuse**, *Myzopsetta ferruginea*, *Limanda ferruginea*, and *Pleuronectes ferrugineus*. The broader query **plie** is owned by the existing American plaice display, as noted above; generic mentions of search terms inside ledger evidence text are not additional key owners. The proposal-local source prefix WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012 had no prior occurrence in active data, the ledger, or existing catalog research documents.

## Recipe and package-demand audit

The manifest lists 114 recipe files, containing 1,123 ingredient rows. All manifest-listed recipe text was checked for the English/French names, listed synonyms, and scientific names; there were no full-text hits. The normalized search over ingredient rows also found zero hits for the candidate names and for the reviewed broad terms **flounder**, **sole**, **plie**, **dab**, and **limande**. There is no recipe line to link, no species or product state to infer, and no recipe measure to preserve.

Snapshot of the shared package reviewed on 2026-10-12:

| Artifact | Count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 1,297 references | 963c463748970e5c1d9031d11c5d614e7def608ff25f157f2ac7df21acd9ef4a |
| ingredient-forms.v1.json | 98 forms | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| legacy-import-identities.v1.json | 64 candidates | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| research-ledger.v1.json | 1,605 records; 5,794 source entries; 4,819 distinct source IDs | 402f1746165778202dd6d7486793b839060fb93672825707f8afda4a0891c9fe |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

## Forms, measurements, conversions, and substitutions

- OQLF, DFO, and Fourchette Bleue support the species identity and name pair, not a kitchen measure, density, edible yield, or count-to-mass conversion.
- Canadian Seafood Treasures, an Atlantic Groundfish Council initiative, lists fresh whole, head-off/gutted, and fillet products; frozen whole, head-off/gutted, and fillets; and frozen-at-sea whole and head-off/gutted products. It also describes 10 lb and 20 lb cartons and a 0.5–1 kg “common weight.” These are commercial product specifications and fish-size information, not household portions, standardized package yields, a recipe measure, or ingredient density. No form, unit mapping, default density, yield, or conversion is proposed [S06].
- That page calls yellowtail flounder an increasingly used recipe replacement for “Plaice,” but it does not identify which plaice taxon, recipe role, method, ratio, or conditions. Do not turn that broad product statement into a substitution rule for active American plaice or any generic flounder [S06].
- If a ledger record is created after the search-boundary review, measurement status should remain researched with no supported value, and substitution research should remain researched with no supported substitute unless new evidence is found.
- DFO’s May 2026 4T stock advice says the southern Gulf commercial fishery has been closed since 2023; the 2026 Georges Bank 5Z plan gives yellowtail flounder a bycatch-only allocation. These regional management facts do not establish present retail availability elsewhere in Canada; do not make a blanket sourcing or availability claim [S03, S07].

## Sources

Online sources were accessed 2026-10-12. IDs below are local to this proposal and are not additions to the shared research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S01 | OQLF, [limande à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198645/limande-a-queue-jaune) | Québec-normalized French display; English terms yellowtail flounder, yellowtail, rusty dab, and sandy dab; older names Limanda ferruginea and Pleuronectes ferrugineus. OQLF discourages sole because Canadian market use can confuse this species with common sole. Last updated 2004; terminology, not current market availability. |
| WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02 | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [complete searchable list](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), [search tips](https://active.inspection.gc.ca/eng/fssa/fispoi/fplist/helpaidee.asp?wbdisable=true), and [flounder query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=flounder) | Fish List records *Limanda ferruginea* with Yellowtail Flounder, Dab / Limande à Queue Jaune, Flounder / Plie, Yellowtail, Sole / Sole, and Rusty Dab. It also uses the English term Flounder and the French term Plie across other flatfish rows; examples include *Atheresthes stomias*, *Hippoglossoides platessoides*, *Glyptocephalus cynoglossus*, *Glyptocephalus zachirus*, *Pseudopleuronectes americanus*, and *Paralichthys californicus*. CFIA search tips confirm searches may use partial terms. This is Canadian fish-label naming evidence, not ingredient interchangeability guidance; the Fish List page shows a 2023-09-18 modification date. |
| WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S03 | DFO, [2026 NAFO Division 4T yellowtail flounder stock assessment](https://publications.gc.ca/collections/collection_2026/mpo-dfo/fs70-6/Fs70-6-2026-022-eng.pdf) and [2026 Georges Bank 5Z fishery plan](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-5-fra.html) | Current English species identity *Myzopsetta ferruginea*; reports the 4T commercial fishery closed since 2023 and the 2026 5Z allocation for bycatch only. Fishery science and management, not culinary measures or retail inventory. |
| WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S04 | WoRMS, [Limanda taxon list](https://www.marinespecies.org/aphia.php?p=taxlist&tName=Limanda) | Lists *Limanda ferruginea* as accepted as *Myzopsetta ferruginea*. Taxonomy evidence; no consumer name or food form claim. |
| WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S05 | Fourchette Bleue par Exploramer, [limande à queue jaune](https://fourchettebleue.ca/produits/limande-a-queue-jaune/) | Québec resource page uses *Myzopsetta ferruginea*, French display limande à queue jaune, other names queue jaune and limande ferrugineuse, and describes culinary sole as a group name for several flatfish. It gives cooking suggestions but no standardized measure, density, yield, or substitution ratio. |
| WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S06 | Canadian Seafood Treasures / Atlantic Groundfish Council, [Yellowtail Flounder](https://www.canadianseafoodtreasures.com/species/yellowtail-flounder) | Uses the older synonym *Limanda ferruginea*; documents commercial product states, carton sizes, common weight, and a generic “Plaice” replacement claim. Commercial information does not establish household measures, edible yield, or a taxon-specific recipe substitution. |

## Completion boundary

This proposal resolves the species identity and Québec display, but the active catalog remains unchanged. Revisit the row only after reviewing how the picker should respond to **flounder** when several species-specific identities can match, and how it should handle the short display token **yellowtail**. Do not add aliases for broad or potentially overlapping market terms in order to force a single species result. Section P remains open.

No tests were run. This proposal changes no application code or database JSON.
