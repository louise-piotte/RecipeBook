# WP04 Section P — *Dissostichus* toothfish identity and market-name boundary

- **Review date:** 2026-10-13.
- **Status:** Reviewer proposal completed; root integrated both species-scoped toothfish identities with empty alias arrays and a source-scoped Patagonian product observation.
- **Recommendation:** Add a paired, identity-only choice for **Patagonian toothfish / légine australe** (*Dissostichus eleginoides*) and **Antarctic toothfish / légine antarctique** (*D. mawsoni*). Leave all aliases empty. The paired displays make broad `toothfish` and `légine` searches show both CFIA-recognized taxa; either row by itself would misleadingly capture those generic queries.
- **Market-name boundary:** Do not add `Chilean sea bass`, `sea bass`, `bar de Patagonie`, or `bar du Chili` as catalog aliases. Although a current Montréal listing uses these phrases for a *D. eleginoides* frozen fillet, Canadian wholesale evidence associates the English market label with both *Dissostichus* species. The current phrase-first picker would also turn `sea bass` or `bar` into a single narrow result.
- **Proposed picker rows:** `ingredient-ref-patagonian-toothfish` and `ingredient-ref-antarctic-toothfish`, both `PROTEIN`, with no aliases, forms, recipe links, default measures, density, mappings, or substitutions.

## Decision and scope

The active Section P parent still includes regional fish and remains open. Round ten’s European sea-bass hold named Patagonian toothfish only as a distinct neighboring taxon; it did not review or allocate either *Dissostichus* identity. In the current proposal and batch archive, that is the only focused prior mention: no dedicated *Dissostichus* review, hold, active row, form, or ledger candidate was found. The current CFIA list supplies separate English/French names and taxonomic serial numbers for the two species. Usito supplies Québec French lexical support for `légine australe` and identifies `bar du Chili` specifically in that sense. A current Montréal fishmonger listing identifies its frozen *D. eleginoides* fillet by scientific name and by the locally marketed `bar de Patagonie` name.

This is one paired naming boundary, not a generic sea-bass allocation. The two conditional rows denote only the CFIA-listed species. They do not make whole fish, fillets, smoked fish, Chilean sea bass, or other toothfish products interchangeable. The current Québec SKU is evidence for *D. eleginoides* product scope; the reviewed sources did not establish a Québec *D. mawsoni* SKU. The second row is included because CFIA recognizes it as a separate food-fish identity and because the current search must show it beside *D. eleginoides* when someone searches the broad word `toothfish` or `légine`.

The identity evidence supports the bilingual displays, but the market names do not make safe global aliases. CFIA currently names *D. eleginoides* `Patagonian Toothfish / Légine Australe` and *D. mawsoni* `Antarctic Toothfish / Légine Antarctique`. CFIA’s Canadian common-name guidance says the names listed for a species are the names to use for that species sold or processed in Canada. It does not establish cookbook usage or culinary substitution. Current retail wording is retained as market evidence and not promoted over the species-scoped display pair. [S01–S04]

## Taxon and Canadian / Québec naming evidence

The CFIA Fish List returns two distinct species rows: TSN 642807, *Dissostichus eleginoides*, **Patagonian Toothfish / Légine Australe**; and TSN 642808, *D. mawsoni*, **Antarctic Toothfish / Légine Antarctique**. Each has its own taxon and French/English label. The list also flags both under environmental contaminants; this proposal records that locator only and does not derive a safety claim, consumption limit, or recipe quantity from it. [S01]

Usito, a Québec French dictionary produced at Université de Sherbrooke, defines `légine` for the *Dissostichus* genus and gives `légine australe` for *D. eleginoides*. It lists `bar du Chili` as a synonym specifically “au sens de légine australe.” This is local lexical evidence for that taxon-specific meaning; it does not override the narrower Canadian labeling names or establish `bar du Chili` as a safe picker alias. No OQLF GDT entry for these two named species was located in the focused search. [S03]

Poissonnerie La Mer’s current Montréal product page is titled **Bar de Patagonie – 280 gr**. The French description identifies a frozen *D. eleginoides* fillet, says the product is also called `bar du Chili` or `légine australe`, specifies a minimum 280 g pavé described as ideal for two people, and gives Chile as the origin. Its paired English page titles the same listing **Chilean Sea Bass – 280 gr** and says it is also known as Patagonian toothfish. This is current local product evidence and SKU wording, not a standardized synonym set. [S04]

Current Canadian wholesale evidence demonstrates the collision directly. Pearlmark Foods’ 2026 product page places both *D. eleginoides* and *D. mawsoni* under **Sea Bass (Patagonian Toothfish)**, then says the product is often called **Chilean sea bass**. It lists catch-weight product descriptions, but does not allocate those package lines to either species. The retailer therefore supports a shared broad market label, not a universal taxon mapping or reusable measure. [S05]

Seafood Depot, a Canadian supplier, separately lists Chilean sea bass as *D. eleginoides*, also called Patagonian toothfish, and offers whole/fresh/frozen and fillet/fresh/frozen product presentations. It corroborates Canadian culinary market use for *D. eleginoides* but does not establish that every item labelled `Chilean sea bass` identifies that species. [S06]

Health Canada’s retail-fish report describes samples labelled `sea bass` from several countries as probably a mixture that could include European sea bass, black sea bass, and Patagonian toothfish. It says Patagonian toothfish is sometimes referred to as `Chilean sea bass`, a name not included in the CFIA Fish List. The report’s sample data and market prevalence are historical (2000s); use it only as corroboration of a long-standing naming risk. The current CFIA list and the current Pearlmark page provide the primary present-day name boundary. Do not use the historical contaminant data as current safety guidance. [S07]

## Active ownership and archive audit

Exact normalized ownership was checked across current reference displays and aliases, attached form labels and match terms, legacy-import candidates, and ledger record IDs. Search normalization follows [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD, accent folding, punctuation to spaces, and whitespace folding.

| Normalized name or ID | Current owner | Finding |
|---|---|---|
| `ingredient-ref-patagonian-toothfish`; `ingredient-ref-antarctic-toothfish` | None in references, forms, legacy candidates, or ledger records. | Both proposed IDs are unallocated. |
| `Patagonian toothfish`; `légine australe`; *Dissostichus eleginoides* | None in active reference/form/legacy exact terms or ledger record IDs. | Exact species identity is source-supported; do not add Latin as a search alias. |
| `Antarctic toothfish`; `légine antarctique`; *Dissostichus mawsoni* | None in active reference/form/legacy exact terms or ledger record IDs. | Distinct second species identity; do not assign Patagonian names to it. |
| `toothfish`; `légine` | No exact active reference/form/legacy owner. | The two proposed displays intentionally make these generic searches multiple-choice. |
| `Chilean sea bass`; `Chilean seabass`; `sea bass` | No exact active reference/form/legacy owner. | Do not add as aliases. The English market name spans species and can overlap the held sea-bass identities. |
| `bar de Patagonie`; `bar du Chili` | No exact active reference/form/legacy owner. | Source-backed Québec market/lexical wording for *D. eleginoides*, but not aliases: either phrase would cause the broad `bar` query to return the candidate alone. |
| `fish` | Four active exact phrase results: Bonga dried fish powder, fish balls, fish sauce, and fish stock. | `toothfish` is one word, so adding the paired rows does not alter this exact-query result set. |
| `bass` | Current substring fallback returns `ingredient-ref-bottle-gourd` through `courge calebasse`. | With no `bass` alias, the two rows do not change this unrelated existing fallback. A `Chilean sea bass` alias would instead take priority and make the query a false-specific singleton. |

The proposal source-ID prefix `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S` and finding ID `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-F01` were not found in the ledger, active catalog, legacy file, or proposal/batch archive. Each source ID below is new and unique within this packet. The only earlier archive hits are the brief exclusion mentions in [`wp04-section-p-next-finfish-gap-review-20261012-round10.md`](wp04-section-p-next-finfish-gap-review-20261012-round10.md) and the related European sea-bass hold batch. Neither allocates a row or resolves the *Dissostichus* pair.

## Picker projection, including attached forms

Projection uses live names, aliases, and attached form terms with the current phrase-first picker. It checks exact form terms, then complete normalized word phrases anywhere inside a display/search term, and only then uses substring fallback. Proposed rows have no attached forms.

| Query | Current picker result(s) and form(s) | If both proposed rows are added | Effect |
|---|---|---|---|
| `Patagonian toothfish` | None. | `ingredient-ref-patagonian-toothfish` / Patagonian toothfish — légine australe; no form. | Species-qualified result. |
| `légine australe` | None. | `ingredient-ref-patagonian-toothfish`; no form. | Species-qualified French result. |
| `Antarctic toothfish` | None. | `ingredient-ref-antarctic-toothfish` / Antarctic toothfish — légine antarctique; no form. | Species-qualified result. |
| `légine antarctique` | None. | `ingredient-ref-antarctic-toothfish`; no form. | Species-qualified French result. |
| `toothfish` | None. | Both proposed references; neither has a form. | Correctly presents both CFIA-listed species instead of a singleton. |
| `légine` | None. | Both proposed references; neither has a form. | The qualified displays share this genus-level French word, so the search remains multiple-choice. |
| `Chilean sea bass`; `sea bass` | None. | None; aliases remain empty. | No market-name alias or species inference. |
| `bar de Patagonie`; `bar du Chili` | None. | None; aliases remain empty. | Local market wording is documented but not globally indexed. |
| `bar` | 27 unrelated substring-fallback rows, including barley, Bambara, barramundi, barbotte, and other terms. | Same 27 rows. | No alias changes broad `bar` search. Adding `bar de Patagonie` or `bar du Chili` would trigger exact-phrase matching and return only *D. eleginoides*, hiding the current fallback results. |
| `bass` | `ingredient-ref-bottle-gourd` by substring fallback. | Same result. | No broad bass alias is added. A `Chilean sea bass` alias would make `bass` an exact single-species result. |
| `fish` | Bonga dried fish powder; fish balls; fish sauce; fish stock. | Same four references and attached forms. | The one-token word `toothfish` does not add an exact `fish` phrase match. |
| *Dissostichus eleginoides*; *D. mawsoni* | None. | None. | Scientific names remain taxon evidence, not search aliases. |

The key search/index risk is not that the taxon names are unclear; CFIA and Québec sources identify them separately. It is that current search treats shorter phrases inside names and aliases as complete matches. A single Patagonian row would make generic `toothfish` and `légine` appear species-specific. Adding the pair solves those broad queries. Adding the retailer’s `bar de Patagonie` or `bar du Chili` phrase would do the opposite for `bar`, and `Chilean sea bass` would do the same for `sea bass` and `bass`, so those market words stay outside aliases.

## Proposed catalog ownership

If integrated, add exactly these two references. Do not create a generic `toothfish`, `légine`, `sea bass`, `bar`, or `Chilean sea bass` row in this packet.

```json
{
  "id": "ingredient-ref-patagonian-toothfish",
  "nameFr": "légine australe",
  "nameEn": "Patagonian toothfish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

```json
{
  "id": "ingredient-ref-antarctic-toothfish",
  "nameFr": "légine antarctique",
  "nameEn": "Antarctic toothfish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

The ledger may keep the taxon on each accepted decision, not as a picker alias. Proposed record IDs are the same as the two reference IDs. Keep each evidence dimension scoped separately:

- **Identity:** accepted for the two separate CFIA taxon/name pairs. No genus-level identity or synonym merge is implied.
- **Measurement:** for *D. eleginoides*, the Montréal listing’s minimum 280 g pavé and `ideal for two people` are one current SKU observation only. They are not a general portion, count weight, fillet conversion, or package yield. No transferable ingredient-level mass, volume, density, unit mapping, or default measure was found. Use a researched-no-supported-value state for global measures, while retaining the SKU observation on its source. For *D. mawsoni*, no species-specific Québec product amount or culinary measure was found; leave measurement research open rather than asserting a universal zero-value finding.
- **Product states:** the Montréal item is a frozen fillet pavé of *D. eleginoides*. The Canadian supplier sources show whole and fillet fresh/frozen marketing for *D. eleginoides*, while the multi-taxon wholesale listing does not assign its catch-weight descriptions to a specific toothfish species. Add no global forms for either row.
- **Substitution:** no reviewed source establishes a directed substitution between these species, either one and European/black sea bass, or either species and another finfish. The market category and similar descriptions are not a cooking trial or replacement ratio. Keep substitutions unresearched; add no global or contextual substitution rule.
- **Recipe links:** none. No bundled recipe line names either species or the market phrases.

## Recipe demand

Every recipe path in the live `manifest.v1.json` was scanned. The pass checked complete UTF-8 recipe files and every `ingredients[]` row for the candidate IDs/names, scientific names, French names, and market terms: `Patagonian toothfish`, `Antarctic toothfish`, `toothfish`, `tooth fish`, `légine`, `légine australe`, `légine antarctique`, `Chilean sea bass`, `Chilean seabass`, `sea bass`, `bar de Patagonie`, `bar du Chili`, and both *Dissostichus* binomials.

**Result: zero matching files and zero matching ingredient rows among 114 manifest-listed recipes and 1,123 ingredient rows.** The broader seafood lines remain separate: recipe 019#8 requests Jumbo Lump crab meat, 023#1 sliced calamari, 077#10 salmon fillets, 093#4 says “Cooked meat or seafood, to taste,” recipes 093#6 and 095#5 request fish sauce, and 111#1 requests one tuna steak. None selects toothfish, a bar/sea-bass species, or a convertible substitute. Add no recipe links.

## Sources and ID register

Sources were checked on 2026-10-13. All seven source IDs below are new; the source prefix was absent from the current ledger and the existing proposal/batch archive. Online product pages establish market wording or a named item only within their stated scope.

| Source ID | Source and finding | Limits |
|---|---|---|
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S01` | CFIA, [Fish List search for *Dissostichus*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=Dissostichus) and [Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). Rows 642807 and 642808 respectively list Patagonian Toothfish / Légine Australe and Antarctic Toothfish / Légine Antarctique. | Canadian species-linked naming and taxonomic serial numbers; also shows the contaminant hazard flag for each. Not a recipe, safe-consumption recommendation, portion source, or evidence of local retail prevalence. |
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S02` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Says to use the common name(s) listed for the fish species and explains the Fish List’s bilingual names and TSNs. | Canadian labeling guidance; does not establish recipe identity, cooking form, or culinary equivalence. |
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S03` | Usito, [légine](https://usito.usherbrooke.ca/d%C3%A9finitions/l%C3%A9gine), Université de Sherbrooke. Defines the genus *Dissostichus*; gives the subentry légine australe (*D. eleginoides*) and associates `bar du Chili` specifically with that sense. | Québec lexicographic evidence. It does not establish `bar du Chili` as a globally safe picker term or override CFIA’s listed common names. Content last updated 2026-01-13. |
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S04` | Poissonnerie La Mer, [Bar de Patagonie – 280 gr](https://www.lamer.ca/products/bar-de-patagonie-200-gr) and its [English listing](https://www.lamer.ca/en/products/bar-de-patagonie-200-gr). Montréal retailer; French page identifies *D. eleginoides*, frozen fillet pavé, minimum 280 g, `ideal for two`, `bar du Chili` / `légine australe`, and Chile origin. | Current product/SKU evidence for one *D. eleginoides* listing. Weight and portion text are not reusable; retailer wording is not imported wholesale as aliases. |
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S05` | Pearlmark Foods, [Sea Bass (Patagonian Toothfish)](https://www.pearlmarkfoods.com/our-products/sea-bass-patagonian-toothfish). Current 2026 supplier page lists both *D. eleginoides* and *D. mawsoni* under the product heading and says the market item is often called Chilean sea bass. | Establishes a current multi-taxon commercial naming collision. Its catch-weight/boxed descriptions are not allocated to species and are not recipe amounts. |
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S06` | Seafood Depot, [Chilean Sea Bass](https://www.seafooddepot.ca/product-bassseachilean). Canadian supplier identifies *D. eleginoides*, names Patagonian toothfish, and lists whole or fillet, fresh or frozen products. | Commercial evidence for this supplier’s product scope; does not establish that the common retail phrase is species-exclusive across Canada. No package measure supplied. |
| `WP04-SECTIONP-DISSOSTICHUS-PAIR-IDENTITY-20261013-R7-S07` | Health Canada, [Updating the Existing Risk Management Strategy for Mercury in Retail Fish](https://www.canada.ca/en/health-canada/services/food-nutrition/reports-publications/updating-existing-management-strategy-mercury-fish.html), Section 3.4.7. Notes that historical `sea bass` samples could be mixed among European sea bass, black sea bass, and Patagonian toothfish; says Chilean sea bass is not included as an acceptable name in the CFIA Fish List. | Historical market/surveillance context from the 2000s, not current prevalence, mercury advice, or a current legal ruling. Current CFIA sources govern the proposed naming. |

## Baseline snapshot and static verification

Snapshot recomputed from the shared worktree on 2026-10-13. File hashes cover exact bytes. The corpus digest follows manifest order and hashes each relative recipe path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Artifact | Baseline count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,339 references / 429,172 bytes | `5779b779d58d428fbabd4c073ee4a303bdb5809af857300be35668c353c2df15` |
| `ingredient-forms.v1.json` | 98 forms / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,648 records; 6,280 source entries; 5,275 distinct source IDs / 6,248,852 bytes | `e53281fb3b3e9338bd46d8bee02e4e685f21eb21c3282deb66e9f04ab8247c01` |
| `manifest.v1.json` | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Static review confirmed zero current exact owners for candidate terms and IDs across references, forms, legacy candidates, and ledger IDs; no source-prefix collision in the ledger/archive; the paired picker projection and its no-alias boundary; and zero recipe-file/ingredient-row hits. The proposal was written as UTF-8 without a BOM. No app, unit, instrumentation, emulator, or application tests were run; this is proposal-only and the database-JSON-only exemption in `AGENTS.md` applies to any later data-only integration.


## Root integration result (2026-10-13)

Added paired identity-only references for Patagonian toothfish / légine australe and Antarctic toothfish / légine antarctique. Both have empty aliases, forms, recipe links, active measures, and substitutions. The Patagonian ledger record retains the Montréal retailer's minimum 280 g frozen pavé as a SKU-specific observation while general measurement research is `researched_no_supported_value`; Antarctic measurement research remains open. Chilean sea-bass and `bar` phrases remain out of aliases. Static package and ledger validation, generated-index checks, picker projections, recipe scan, and text checks passed; no app or emulator tests were run for this database-JSON-only change. See [the round-seven integration batch](../batches/wp02-wp03-wp04-round7-gap-review-integration-20261013/README.md).
