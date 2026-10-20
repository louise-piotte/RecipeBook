# WP04 Section P — hickory shad market and picker review (R126)

- **Review and source-access date:** 2026-10-15.
- **Status:** Documentation-only hold integrated into the plan and roadmap; see the [R126 batch
  README](../batches/wp04-section-p-hickory-shad-market-picker-hold-integration-r126-20261015/README.md).
- **Candidate:** hickory shad, *Alosa mediocris* (ITIS TSN 161704; WoRMS AphiaID 158668).
- **Distinct question:** Does the named species have enough current Canadian/Québec human-food evidence or bundled recipe demand for an active identity, and how would its Québec-region name affect the existing shad picker?
- **Recommendation:** Keep *A. mediocris* outside active ingredient references and the research ledger until a Canadian/Québec human-food product or bundled recipe identifies it. DFO Québec supports the technical name pair `Hickory shad / alose hickory`, but this is a regional science-code entry rather than retail-name or food-market evidence. The bounded search found no current Québec or Canadian human-food listing. U.S. commercial removals establish fishery activity, not the destination or consumer use of those landings.
- **Shared-data effect:** none. This is one proposal-only hold; no reference, legacy candidate, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution is proposed.
- **Tests:** none; this review changes documentation only.

## Why this is a distinct unresolved question

The regional-fish checklist remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4662). The recent R121 winter-skate hold, R122 European-smelt review, R123 Atlantic-saury hold, R124 blueback-herring hold, and R125 Atlantic-menhaden hold address different taxa and boundaries. The [American-shad identity review](wp04-section-p-american-shad-identity-review-20261012.md) covers *Alosa sapidissima*, while this review concerns *A. mediocris*. The [blueback herring](wp04-section-p-blueback-herring-alose-ete-picker-market-hold-r124-20261015.md), [European smelt](wp04-section-p-european-smelt-picker-boundary-review-r122-20261015.md), [Atlantic saury](wp04-section-p-atlantic-saury-paired-picker-market-hold-r123-20261015.md), and [Atlantic menhaden](wp04-section-p-atlantic-menhaden-human-food-market-picker-hold-r125-20261015.md) packets do not allocate Hickory shad or its name.

## Name and Canadian/Québec market evidence

The 2014 Fisheries and Oceans Canada (DFO) Québec Region code list pairs *Alosa mediocris* with **alose hickory / hickory shad**. It identifies itself as a scientific database code list; it says the French and English vernacular names draw on multiple sources and that many were adapted to Québec-region usage. This supports a regional taxon-name pair, not a CFIA-approved food label, current occurrence, consumer product, or culinary use. The same table distinguishes American shad, blueback herring, alewife, Atlantic menhaden, and gizzard shad as separate taxa. [S01]

Taxonomic sources identify the species consistently but leave a geographic qualification. ITIS lists the valid name *Alosa mediocris* and the common name **Hickory shad**. The California Academy of Sciences' *Catalog of Fishes*, updated 2026-06-10, also treats the name as valid and gives a northwestern Atlantic range from Canada south to Florida. A Canadian DFO fish reference published in 1966, however, says the species had been reported in Canada only once, in 1852, that the identification was doubtful, and that it was not treated as occurring in Canadian waters. The older report and modern catalog do not establish present-day Canadian abundance or harvest; neither is evidence of Canadian food-market availability. [S02–S04]

CFIA describes its [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) as the source of English and French common names acceptable in Canada for fish labelling, together with scientific names and TSNs. I could not retrieve a species-level result for *A. mediocris* from its interactive list in this review, so this packet does not claim that `alose hickory` is an accepted Canadian retail label. No OQLF GDT entry for the candidate was found in the bounded terminology search.

The market evidence is limited and mixed by geography and activity:

- Targeted searches for `Hickory shad`, *Alosa mediocris*, `alose hickory`, and the historical French rendering `matowacca` across Québec and Canadian grocery/fishmonger results found no current human-food product listing. This is a bounded search result, not proof that no niche, imported, direct-sale, or historically consumed product exists.
- An Atlantic States Marine Fisheries Commission supplement reports 99,419 lb of U.S. commercial and bycatch removals in 2021; its North Carolina sustainable-fishery plan records 806 confirmed hickory shad in the 2022 Tar-Pamlico recreational survey, with zero trips targeting that species. Those fishery figures do not identify a human-food product, sales channel, or end use. [S06]
- South Carolina DNR says hickory shad are not used as human food in South Carolina. That is a regional species-page statement and does not establish practice across the species' range. [S07]
- A current Canadian tackle retailer lists `Hickory Shad` as a colour option for a fishing lure. It is bait styling, not a fish product or evidence of household food demand. [S09]
- The U.S. FDA Seafood List calls **Shad** an acceptable U.S. market name for *A. mediocris*, **Hickory Shad** its common name, and labels Hickory Jack, Hick, Bonejack, Shad Herring, and Fall Herring as vernacular cross-reference names that generally are not acceptable U.S. label names. This is U.S. naming guidance only; it is useful as a warning not to treat the short market name or vernaculars as Canadian picker aliases. [S08]

Taken together, the sources establish a distinct species and a DFO Québec technical bilingual name, but not a current Canadian/Québec household food ingredient. The hold makes no claim about edibility or U.S. regional consumption. Reopen after a Canadian/Québec human-food listing with species identity or a bundled recipe that names the species.

## Current ownership and picker projection

The live package snapshot contains **1,474 ingredient references, 106 forms, 63 legacy candidates, and 1,816 research-ledger records** with **7,513 source entries and 6,388 distinct source IDs**. The manifest lists **114 recipes and 1,123 ingredient rows**. No current reference, form, legacy candidate, ledger record, or recipe ingredient row owns `Hickory shad`, `alose hickory`, *A. mediocris*, or `matowacca`; no focused Hickory-shad proposal or batch was found. The potential ID `ingredient-ref-hickory-shad` and this proposal's source-ID prefix are unallocated.

The projection follows the phrase-first matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which folds accents and punctuation, checks complete normalized word phrases, then uses substring fallback. I projected a hypothetical alias-free row displayed as `Hickory shad / alose hickory`; this is not a request to create it.

| Query | Current results | With hypothetical row | Picker effect |
|---|---|---|---|
| `Hickory shad` | None | Hickory shad | Qualified English term resolves to the species. |
| `alose hickory` | None | Hickory shad | Qualified DFO Québec term resolves to the species. |
| `shad` | American shad | American shad; Hickory shad | The display correctly turns a one-result generic query into a two-species query. |
| `alose` | American shad | American shad; Hickory shad | The French display similarly broadens the current result. |
| `herring` | Atlantic herring; Pacific herring | Atlantic herring; Pacific herring | No effect when no herring alias is added. |
| `hick` (fragment) | 14 results, including chicken- and chickpea-named ingredients | The same 14, plus Hickory shad | The matcher uses substring fallback for this short query. Do not add `Hick` as an alias; the projected hit is not evidence of species-specific intent. |
| `hickory jack`, `bonejack`, `shad herring`, `fall herring`, `freshwater taylor`, `matowacca`, `Alosa mediocris` | None | None | Do not add English vernaculars, the historical French rendering, or the binomial as aliases without current Canadian recipe or market demand. |

Keep the candidate out of the active picker now. If a future review supports activation, reassess the bilingual display against CFIA's current species-level Fish List entry and Québec food terminology. Do not treat `shad`, `alose`, `herring`, `matowacca`, the binomial, or FDA/ITIS vernaculars as aliases. The broad-query expansion shown above is an expected consequence of adding a real species identity, not independent evidence of food use.

## Recipe demand and data boundaries

All **114** manifest-listed recipe files and their **1,123** ingredient rows were scanned for `Hickory shad`, `hickory`, *Alosa mediocris*, `alose hickory`, `matowacca`, `hickory jack`, `bonejack`, `shad herring`, `fall herring`, and `freshwater taylor`. The scan found **zero matching recipe files and zero matching ingredient rows**. It also found no direct recipe demand for `shad`, `alose`, or `herring` as ingredient text. The short vernacular `Hick` was excluded from recipe phrase scanning because substring matching would produce false positives inside `chicken` and `chickpea`; the picker projection separately records that fragment behavior.

No source reviewed here supports an ingredient form, default density, unit mapping, mass/volume conversion, count measure, usable yield, cooking yield, or substitution. Do not infer a substitution for American shad, blueback herring, alewife, Atlantic herring, or gizzard shad from a shared order/family or fishery context. No form, recipe link, measure, density, mapping, conversion, yield, or contextual/global substitution rule is proposed.

If a future review supports a consumer-facing identity, treat it as a species-scoped `PROTEIN` row only after verifying its current Canadian food name. Any future display may use `Hickory shad / alose hickory` provisionally, with empty alias arrays; no forms, density, mappings, or recipe links are justified by this packet.

## Source register

These IDs are proposal-local and are not shared-ledger records. The `WP04-SECTIONP-HICKORY-SHAD-R126-20261015` prefix was checked against the catalog and proposal/batch archive before drafting.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S01** | Fisheries and Oceans Canada, [Code List of Marine Plants, Invertebrates and Vertebrates Used by the Quebec Region of DFO](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-13-1254.pdf), 2014, pp. 59, 83. Pairs *A. mediocris* with `alose hickory / hickory shad` and identifies TSN 161704 / AphiaID 158668. | Internal/regional science-code list, not a current food-label standard or market survey. Its French name documents DFO Québec usage, not proven everyday retail wording. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S02** | ITIS, [*Alosa mediocris* report, TSN 161704](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=161704). Supports valid species name and English common/vernacular names. | Taxonomy and common-name record; no Canadian food-label or market claim. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S03** | California Academy of Sciences, [Eschmeyer's Catalog of Fishes: *Alosa mediocris*](https://researcharchive.calacademy.org/research/ichthyology/catalog/fishcatget.asp?spid=62923), online version updated 2026-06-10. Lists current valid name and a Northwestern Atlantic range from Canada to Florida. | Broad range statement, not proof of current Canadian occurrence, harvest, or food-market availability. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S04** | Fisheries Research Board of Canada, [Bulletin No. 155 at DFO](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/9973.pdf), 1966, p. 86. Says the single 1852 Canadian report was doubtful and does not treat *A. mediocris* as a Canadian species. | Historical statement; it conflicts with the modern catalog's broad range and is not a contemporary occurrence survey. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S05** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). Defines its scope as English/French names acceptable in Canada for fish labelling with scientific names and TSNs. | The species-level interactive result was not retrievable in this review; no CFIA status for *A. mediocris* is asserted. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S06** | Atlantic States Marine Fisheries Commission, [Shad and River Herring Supplemental Materials, February 2023](https://asmfc.org/wp-content/uploads/2025/01/ShadandRiverHerringSupplemental_Feb2023.pdf), pp. 87–88 and 40. Reports 2021 U.S. landings/removals and the 2022 Tar-Pamlico recreational survey. | U.S. fishery data; landings and catch do not identify human-food use or a Canadian retail product. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S07** | South Carolina Department of Natural Resources, [Hickory shad species page](https://www.dnr.sc.gov/fish/species/hickoryshad.html). Says the species is not used as human food in South Carolina. | Regional state statement, not a range-wide culinary rule or Canadian market survey. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S08** | U.S. FDA, [Seafood List entry for *Alosa mediocris*](https://hfpappexternal.fda.gov/scripts/Fdcc/index.cfm?id=Alosa_mediocris&set=SeafoodList). Lists market name `Shad`, common name `Hickory Shad`, and labels five vernaculars as cross-reference names generally not acceptable for U.S. interstate labeling. | U.S. label guidance only; it does not establish Canadian accepted names or retail supply. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S09** | Tackle Depot, [Berkley PowerBait Nessie](https://www.tackledepot.ca/products/berkley-powerbait-nessie). Canadian listing offers `Hickory Shad` as a lure colour. | Fishing tackle, not a fish product or evidence of food use. |
| **WP04-SECTIONP-HICKORY-SHAD-R126-20261015-S10** | Local static audit of the current reference/form JSON, legacy candidate file, research ledger, matcher, manifest, and all manifest-listed recipes; bounded Canadian/Québec grocery and fishmonger keyword search, accessed 2026-10-15. | Repository inventory and search result only; absence from the bundle or selected search results does not prove worldwide or Canadian nonexistence. |

## Static review record

- Read `AGENTS.md`, the global plan's open Section P regional-fish item, the recent R121–R125 proposals and batch READMEs, the American-shad review, current references/forms/legacy candidates/ledger, the manifest, and the matcher.
- Confirmed no current reference, form, legacy candidate, focused proposal/batch, ledger record, or recipe ingredient line owns the candidate name, binomial, or historical French rendering. Refreshed the inventory snapshot from the current JSON rather than reusing a prior R125 total.
- Projected the current phrase-first search behavior for qualified names and broad `shad`, `alose`, and `herring` queries, including a hypothetical alias-free row.
- Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows; candidate and historical-name scans returned zero matches.
- Confirmed the R126 source-ID prefix had no prior owner in the ledger or proposal/batch archive. At the proposal snapshot, this file was the only change from the review; the later hold integration adds only a batch README and plan/roadmap notes.
- No app, Gradle, instrumentation, emulator, or unit tests were run; the review is proposal-only and changes no database JSON.
