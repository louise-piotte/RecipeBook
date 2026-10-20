# WP04 Section P — Pacific tomcod identity and market-scope review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Proposal-only review of one open whole-fish species candidate, Canadian and Québec names, picker behavior, recipe demand, and market evidence.
- **Disposition:** **Hold from the active catalog** for now. The species identity and bilingual regulatory common-name pair are clear, but this review found no current Canadian consumer-label or Québec retail evidence for *Microgadus proximus*. The CFIA Fish List entry for `Tomcod` is *M. tomcod* (Atlantic tomcod), not *M. proximus*. Do not add an active reference, aliases, forms, recipe links, measurements, conversions, yields, or substitutions at this time.
- **Candidate if the market boundary is later established:** `ingredient-ref-pacific-tomcod`, category `PROTEIN`, English display `Pacific tomcod`, fr-CA display `poulamon du Pacifique`, no aliases, taxon *Microgadus proximus*. This describes a potential species identity only; it is not an active catalog row or a whole-fish product form.
- **Source IDs:** Proposal-local IDs `WP04-P-PACIFIC-TOMCOD-20261012-R4-S01` through `S07`; the prefix was checked against the live ledger and repository text and had no existing occurrence.
- **Shared disposition:** Recorded as a documentation hold in the [integration note](../batches/wp04-section-p-pacific-tomcod-market-scope-hold-integration-20261012/README.md); no active or ledger identity was created.

## Candidate and scope

The open Section P work calls for meaningful fish identities while keeping species, products, and forms distinct. This review selects Pacific tomcod (*Microgadus proximus*), a separate species mentioned as an unallocated boundary in the Atlantic-tomcod work. Atlantic tomcod / poulamon (*M. tomcod*) is already integrated as `ingredient-ref-atlantic-tomcod`; it is not the Pacific species. Pacific tomcod is also distinct from Atlantic and Pacific cod, Arctic cod, burbot / lotte, Pacific hake, and walleye pollock. The federal regulation groups it under the common-name heading “Cod,” but assigns it its own qualified name and taxon. That regulatory grouping does not justify merging it into a cod identity. [S01, S03–S05]

The available Canadian sources establish a coherent taxon and bilingual name pair. They do not establish that the fish is currently sold as a food product in Canada or Québec under that pair. Exact-term searches for `Pacific tomcod`, `poulamon du Pacifique`, and *Microgadus proximus* did not identify a current Canadian or Québec species-qualified retail listing. The 1973 DFO fish reference says it appeared in small quantities on local markets; DFO landing data also separately recorded Pacific tomcod in 2003–2005. Both are historical evidence, not current retail availability. The current CFIA Fish List search instead shows *M. tomcod* under `Tomcod` and `Atlantic Tomcod / Poulamon`; it contains no *M. proximus* or `Pacific Tomcod` entry. That omission does not prove sale is prohibited or impossible, but it leaves the consumer-label scope unestablished for an active recipe-picker identity. [S04–S06]

Reconsider activation if a current Canadian fish processor, retailer, or other authoritative food-market source provides a species-identified *M. proximus* product and a usable English/French food name, or if a recipe explicitly requests this fish. Until then, preserve the candidate in this review only. Do not create a generic legacy candidate from these sources.

## Names, taxonomy, and market-source limits

- **Current bilingual regulatory name:** The current consolidated Pacific Fishery Regulations, 1993 list `Pacific tomcod` and `Poulamon du Pacifique` in the bilingual Schedule I common-and-scientific-name table, both paired with *Microgadus proximus*. The French name is capitalized in the schedule; use normal sentence case, `poulamon du Pacifique`, if the candidate is ever displayed. This is a regulatory fish-name source, not a CFIA food-label authorization or a Québec retail listing. [S01]
- **CFIA disease-list corroboration:** CFIA’s English and French susceptible aquatic species lists pair *M. proximus* with `Pacific tomcod` and `poulamon du Pacifique`. These are disease-susceptibility records, not food-label or market sources. [S02]
- **TERMIUM anomaly:** TERMIUM Plus record 2 pairs the French term `poulamon du Pacifique` with *M. proximus*, but the same record’s English main term says `Atlantic tomcod`. That English field conflicts with the species and the current bilingual regulation. Do not copy `Atlantic tomcod` from this record or use TERMIUM to support the English display. [S03]
- **CFIA Fish List boundary:** The CFIA Fish List’s `Tomcod` query identifies *M. tomcod* as `Tomcod` and `Atlantic Tomcod / Poulamon`; the reviewed results do not list *M. proximus*. Do not transfer the accepted CFIA name `Tomcod`, or its French `Poulamon`, to Pacific tomcod as an unqualified alias. This negative result is specific to the Fish List snapshot reviewed and is not proof that the species cannot be sold. [S04]
- **Historical food-market evidence:** DFO’s *Fishes of the Pacific Coast of Canada* (1973), p. 164, says Pacific tomcod occurred along the coast and appeared in small quantities on local markets. DFO’s national landing table for 2003–2005 separately reports `Tomcod, Pacific`. The sources establish historical food-fish and landing context only; they do not show current Canadian or Québec retail supply. [S05–S06]
- **Québec display:** No OQLF food-product entry for this species was located in the reviewed sources. Use the bilingual federal schedule’s French species name only as a candidate display, not as a claim that OQLF has normalized it for Québec fish-product marketing.

If later admitted, keep the display qualified and aliases empty. In particular, do not add `tomcod`, `poulamon`, `cod`, `morue`, `Atlantic tomcod`, `frostfish`, `California tomcod`, *Microgadus proximus*, or the historical name `Gadus proximus` as aliases. Bare `tomcod` and `poulamon` already resolve to the integrated Atlantic-tomcod display and are not evidenced as shared Canadian retail names. Generic cod terms have multiple existing owners. The U.S.-associated `California tomcod` name is outside the Canadian and Québec evidence gathered here.

## Live catalog, ledger, and prior-work audit

Read-only snapshot from the shared worktree on 2026-10-12. Hashes cover exact file bytes. The recipe corpus digest follows manifest order and hashes each relative path, a NUL byte, exact recipe bytes, and another NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,310 references | `c789c90328c3e1849d11a1a6940869f0c96bfafbe1074beb7b5249d21e8b18ca` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,618 records; 5,901 source entries; 4,922 distinct source IDs | `780bf24cbfb759c19a42ca89599e2766b3d2a0171aa1d9cc1a936e3f1defb6ac` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The exact-name audit checked reference displays and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs. It found no exact owner for `Pacific tomcod`, `poulamon du Pacifique`, *Microgadus proximus*, `ingredient-ref-pacific-tomcod`, or `candidate-pacific-tomcod`. There is no active form, legacy candidate, dedicated ledger record, proposal, or hold for this Pacific species. The name and taxon appear as exclusion/boundary mentions in the Atlantic-tomcod and burbot reviews; those notes do not allocate the candidate. `Atlantic tomcod / poulamon` remains owned by `ingredient-ref-atlantic-tomcod`.

Nearby active identities that must remain distinct include `ingredient-ref-atlantic-cod` (`Atlantic cod`), `ingredient-ref-pacific-cod` (`Pacific cod`), `ingredient-ref-arctic-cod` (`Arctic cod`), `ingredient-ref-salt-cod` (`salt cod`), and `ingredient-ref-sablefish` (which owns the alias `black cod`). The existing burbot row is `ingredient-ref-burbot`. The candidate uses no shared identity or alias from these rows.

## Picker behavior

The current `IngredientReferenceSearchIndex` in `IngredientSearch.kt` normalizes accents and punctuation, returns complete word-phrase matches before substring fallback, and does not store scientific names automatically. The following read-only projection adds only the candidate display pair to the current names and forms; because disposition is hold, these are expected future results, not current picker behavior.

| Query | Projected result if activated | Boundary |
|---|---|---|
| `Pacific tomcod` | Pacific tomcod candidate only | Qualified English display. |
| `poulamon du Pacifique` | Pacific tomcod candidate only | Qualified French candidate display. |
| `tomcod` | Atlantic tomcod and Pacific tomcod | Both remain visibly qualified. No duplicate alias is needed. |
| `poulamon` | Atlantic tomcod and Pacific tomcod | Both remain visibly qualified; do not alias the bare term. |
| `Atlantic tomcod` | Atlantic tomcod only | Existing species-specific display. |
| `Pacific cod` | Pacific cod only | Does not select Pacific tomcod. |
| `cod` / `morue` | Atlantic cod, Pacific cod, Arctic cod, salt cod, and sablefish | Existing whole-word matches; `tomcod` is one token and does not match `cod`. |
| `Microgadus proximus` | No row | Keep the taxon in review/source evidence, not as a picker alias. |

The review therefore supports a clean result boundary if the identity is later admitted, but picker behavior alone does not resolve the missing current food-market evidence. No source-backed alias should be added to force the held species into the catalog.

## Recipe demand audit

I scanned every one of the 114 manifest-listed recipe JSON files, all 1,123 ingredient rows, and parsed string fields for normalized whole-word phrases. The scan covered `Pacific tomcod`, `poulamon du Pacifique`, *Microgadus proximus*, `tomcod`, `poulamon`, `cod`, `morue`, `Pacific cod`, `Atlantic cod`, `pollock`, `goberge`, `fish powder`, `fish ball`, and `surimi`.

**Result: zero exact phrase matches for the candidate or the broader fish terms in ingredient rows and recipe text.** The corpus supplies no request for this species, product state, amount, unit, preparation, conversion, yield, or substitution. The adjacent Section P fish-powder, fish-ball, and surimi reviews concern different processed identities and do not establish a Pacific-tomcod product. Do not infer demand from other seafood or from the federal regulatory group heading `Cod`.

## Forms, measurements, and substitutions

The candidate is species-level only. Even if activated, a whole-fish species identity must not be converted into a `whole`, `fresh`, `frozen`, `gutted`, `fillet`, `cooked`, `dried`, `powdered`, or other form without product-state evidence. Add no form rows, density, unit mappings, default quantity, package measurement, edible yield, or count-to-mass conversion. DFO’s biological size description is not a kitchen measure.

No recipe or source establishes a same-fish form conversion or a contextual recipe substitution. Add no global or contextual substitution between Pacific tomcod and Atlantic tomcod, Pacific or Atlantic cod, Arctic cod, pollock, hake, burbot, or another fish. Shared family, regulatory grouping, and culinary similarity do not establish equivalence.

## Static checks performed

- Re-read `AGENTS.md`, the current Section P plan, the live references, forms, legacy candidates, ledger, and prior tomcod/bonito proposals and integration notes.
- Checked exact catalog ownership and source-ID prefix collisions; the proposed ID and prefix have no active allocation or collision. At proposal creation, no shared files other than this proposal were intentionally edited.
- Read the picker search implementation and statically projected phrase results with the candidate display pair and no aliases or forms.
- Scanned the manifest-ordered 114-recipe corpus and all ingredient rows/string fields for candidate, generic cod, and adjacent fish-product phrases; zero matches were found.
- No app tests, emulator checks, or deployment were run because this is a documentation-only market-scope hold; no database data was changed.
- The saved proposal was checked as UTF-8 without BOM and for trailing whitespace.

## Sources

Sources were accessed on 2026-10-12. The proposal-local source IDs are not registered in the shared ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S01** | Department of Justice Canada, [Pacific Fishery Regulations, 1993, full text (English)](https://laws-lois.justice.gc.ca/eng/regulations/SOR-93-54/FullText.html) and [Règlement de pêche du Pacifique (1993), texte complet (French)](https://lois-laws.justice.gc.ca/fra/reglements/DORS-93-54/TexteComplet.html); consolidated text is current to 2026-09-21. | Lists `Pacific tomcod` / `Poulamon du Pacifique` with *Microgadus proximus* in the bilingual common-and-scientific-name schedule. The names occur under a regulatory `Cod` grouping; this does not establish a consumer label, retail supply, product form, or culinary equivalence. |
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S02** | CFIA, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species) and [Espèces d’animaux aquatiques vulnérables](https://inspection.canada.ca/fr/sante-animaux/animaux-aquatiques/maladies/especes-vulnerables). | English and French disease-susceptibility lists pair *M. proximus* with `Pacific tomcod` and `poulamon du Pacifique`. Disease-control nomenclature only; not a food-label or retail source. |
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S03** | TERMIUM Plus, Government of Canada, [poulamon search record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frr&lang=eng&srchtxt=POULAMON), Record 2, dated 2016-03-14. | French entry gives `poulamon du Pacifique` for *M. proximus*. The record’s English entry says `Atlantic tomcod` for that same species and is inconsistent; this review excludes that English field and relies on S01–S02 for the English name. |
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S04** | CFIA, [Fish List search results for “Tomcod”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Tomcod&wbdisable=true). | The list identifies *M. tomcod* as `Tomcod` and `Atlantic Tomcod / Poulamon`; the reviewed result contains no *M. proximus* or `Pacific Tomcod`. This is a list-scope observation, not proof that the fish cannot be sold. |
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S05** | Fisheries Research Board of Canada / DFO, J. L. Hart, [*Pacific Fishes of Canada*](https://waves-vagues.dfo-mpo.gc.ca/Library/39032_P1.pdf) (1973), p. 164. | Identifies Pacific tomcod as *M. proximus* and says it occurred in small quantities on local markets. Historical species and market context only; no present-day availability, product label, or recipe measure. |
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S06** | DFO, [Commercial fisheries and aquaculture statistics, Section 3: landed volume by species, 2003–2005](https://www.dfo-mpo.gc.ca/stats/commercial/cfs/2005/section8-3-eng.htm), table 3.1.2. | Separately reports a `Tomcod, Pacific` landing line. This old national landing record supports historical Canadian fishery recognition, not a current Québec consumer product or a cooking quantity. |
| **WP04-P-PACIFIC-TOMCOD-20261012-R4-S07** | U.S. FDA, [The Seafood List: *Microgadus proximus*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Microgadus_proximus&order=ASC&search=cod&set=SeafoodList&sort=MARKET_NAME&startrow=1&type=basic). | Lists `Tomcod` as the acceptable U.S. market name, `Pacific Tomcod` as a common name, and `California Tomcod` as a vernacular cross-reference. This is U.S.-only naming evidence and does not establish Canadian labeling or justify a Canadian alias. |
