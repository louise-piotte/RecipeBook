# WP04 Section P — Pacific ocean perch picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only finfish identity, Québec naming, picker, ownership, and recipe-demand review.
- **Disposition:** **Hold** Pacific ocean perch / sébaste à longue mâchoire (*Sebastes alutus*) outside the active catalog and ledger. The species and bilingual pair are supported by CFIA and DFO, but the current picker would return this one Pacific species for the broader query `ocean perch` and the Québec product term `sébaste`. Do not add aliases, forms, measurements, conversions, yields, recipe links, or substitutions.
- **Worktree scope:** this proposal file only. No catalog JSON, forms, legacy candidates, ledger, recipes, generated code, plan, roadmap, tests, or emulator state was changed.

## Candidate and recommendation

The Section P checklist remains open for finfish and regional fish. A search of the current checklist, catalog proposals, batches, active references, forms, legacy candidates, and ledger found no prior identity review or allocation for Pacific ocean perch, sébaste à longue mâchoire, or *Sebastes alutus*. The proposed future identity is:

| Candidate ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-pacific-ocean-perch` | `PROTEIN` | **Pacific Ocean Perch** | **sébaste à longue mâchoire** | *Sebastes alutus* | None |

CFIA directly associates *S. alutus* with the bilingual species-qualified pair. DFO’s English and French species profiles use the same pair and identify a commercial fishery in British Columbia [S01–S03]. The issue is not whether this is a documented food fish. The issue is that its full display names contain two shorter Québec/Canadian fish-market terms that do not reliably identify this Pacific species.

OQLF treats **sébaste** as an edible-fish and ichthyology term, maps it to *Sebastes* sp. and English `redfish`, `rosefish`, and `ocean perch`, and notes that Québec catches under this term include three other species: *S. marinus*, *S. fasciatus*, and *S. mentella* [S04]. CFIA also assigns `Ocean Perch` to more than one species and uses `Rockfish`, `Redfish`, and `Rosefish` for multiple rockfish taxa [S01]. Because the current picker treats every display phrase as searchable, adding only the proposed species row would make bare `sébaste` and `ocean perch` searches return *S. alutus* alone. Hold this row until search can preserve the broader wording or a reviewed set of species results prevents that false narrowing.

This is a picker-scope hold, not a claim that Pacific ocean perch is unavailable or that the species name is invalid. DFO describes it as commercially important in British Columbia; that fishery evidence does not establish current Québec retail stock or a Québec consumer-label pattern [S02–S03].

## Taxon and naming boundary

- Limit any later reference to *Sebastes alutus*. DFO’s English and French profiles explicitly identify Pacific Ocean Perch / sébaste à longue mâchoire with that taxon [S02–S03].
- Use the complete proposed displays only if the picker boundary is resolved. Do not add **ocean perch**, **sébaste**, **redfish**, **rosefish**, **rockfish**, **Pacific rockfish**, or **Pacific snapper** as aliases. CFIA associates several of these names with multiple *Sebastes* species; OQLF’s broader `sébaste` entry is *Sebastes* sp., not *S. alutus* specifically [S01, S04].
- Keep Atlantic redfish / Atlantic ocean-perch terms for *S. marinus*, *S. fasciatus*, and *S. mentella* outside this candidate. OQLF describes those three species in Québec catches, and CFIA assigns some of the overlapping English terms to them [S01, S04].
- Keep every other Pacific rockfish, including yellowmouth, sharpchin, redstripe, and redbanded rockfish, separate. DFO notes that Pacific ocean perch can be confused with other rockfish, and its identification guide lists the species individually [S02, S05]. Do not infer identity from colour, family, capture area, or a broad seafood name.
- The existing yellow-perch row is a distinct freshwater species. It is not an alias, sibling form, or substitution for *S. alutus*.

## Exact catalog, form, legacy, and ledger ownership audit

The review-time scan followed `normalizeIngredientSearchKey`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, convert punctuation to spaces, and collapse whitespace. It checked active reference IDs, English/French displays and aliases; form IDs, labels, and match terms; every legacy-candidate ID, name, and alias; and ledger record IDs and full evidence text. File hashes cover exact bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,258 | `fe5119d6027e9916aec60272233b4ce2f92f5e0efc26e769e720ef81689ac085` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research-ledger records; source entries; distinct source IDs | 1,567; 5,491; 4,529 | `3e66158bfcbdc4d7b64175666b63997c1235d92623c144c03e21b44c868af515` |
| Recipe manifest | 114 paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Candidate key or ID | Exact owner and consequence |
|---|---|
| `Pacific Ocean Perch` / `sébaste à longue mâchoire` / *Sebastes alutus* | No exact active reference, form, legacy candidate, or ledger identity record owns these keys. |
| `ingredient-ref-pacific-ocean-perch` / `candidate-pacific-ocean-perch` | Neither ID is allocated in active references, forms, legacy candidates, or ledger record IDs. |
| `ocean perch` / `sébaste` | No exact active or legacy owner exists. OQLF and CFIA attach these shorter terms to more than one *Sebastes* taxon; they are not safe aliases for the candidate. The proposed full displays would nevertheless match these queries under the current picker. |
| `redfish` / `rosefish` / `rockfish` / `Pacific snapper` | No exact candidate identity is proposed. CFIA applies these and related market names across multiple species; do not add them as aliases to *S. alutus* [S01]. |
| `ingredient-ref-yellow-perch` | Existing distinct freshwater reference for yellow perch / perchaude. It owns the exact phrase `yellow perch`, not Pacific ocean perch, `ocean perch`, or `sébaste`. A short `perch` query would return both species if this candidate were later added. |

No active form is attached to a Pacific ocean-perch identity. No exact candidate phrase or proposed ID was found in the current ledger. The proposal-local source-ID prefix `WP04-PACIFIC-OCEAN-PERCH-20261012` was absent from the ledger and existing catalog research documents before this file was created.

## Picker phrase boundary

The app’s reference search normalizes a query and returns any display or alias that contains the query as a complete word phrase; it falls back to partial matching only when there are no complete-phrase matches [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

If the candidate were activated with only the proposed displays:

- `Pacific Ocean Perch` and `sébaste à longue mâchoire` would retrieve the intended species row.
- `ocean perch` would also retrieve that same single row because the phrase occurs inside the English display. This is unsafe as a result boundary: CFIA also assigns `Ocean Perch` to Atlantic *Sebastes* taxa, and OQLF lists it as an English translation of the broader *Sebastes* sp. Québec term [S01, S04].
- `sébaste` would retrieve the same single row because it occurs inside the French display, even though OQLF’s Quebec edible-fish entry uses it for a catch comprising *S. marinus*, *S. fasciatus*, and *S. mentella* [S04].
- `perch` would retrieve the existing yellow-perch row plus the candidate; this is a broader search, but it would at least present more than one fish result. Do not add `perch` or `perche` as an alias.
- `rockfish`, `redfish`, `rosefish`, and `Pacific snapper` are not proposed aliases. Their regulatory common-name use spans different taxa [S01].

Keep the identity unallocated until the picker can show the species-qualified row without making a broader `ocean perch` or `sébaste` query resolve to only *S. alutus*. No generic *Sebastes* identity is proposed by this packet.

## Bundled recipe-corpus demand audit

All 114 manifest-listed recipe files, all 1,123 ingredient rows, and complete recipe JSON text were scanned for `Pacific Ocean Perch`, `sébaste à longue mâchoire`, *Sebastes alutus*, `ocean perch`, and `longjaw rockfish` using normalized whole-phrase matching.

**Result: zero candidate phrase hits in ingredient rows and zero matching recipe files.** No bundled recipe asks for this species, identifies a rockfish product, or supports a new recipe link. The separate fish-ball product identity and broad redfish product listings are not species-specific demand for *S. alutus*.

## Québec and Canadian source limits

- OQLF’s `sébaste` entry is in edible-fish and ichthyology domains and gives the Québec market context, competing species, and broader English terms. It was last updated in 2012; it does not establish present retail labeling or current availability [S04].
- CFIA’s Fish List gives the species-qualified English/French pair and demonstrates overlap across the common names `Ocean Perch`, `Redfish`, `Rosefish`, and `Rockfish`. It is Canadian fish-label terminology evidence, not proof that a current Québec retailer stocks this product [S01].
- DFO’s English and French profiles provide current Canadian species, distribution, and fishery context, including commercial importance in British Columbia. They do not establish a Québec consumer-label practice or current retailer inventory [S02–S03].
- DFO’s Pacific identification guide independently pairs the two species-qualified names and taxon, while also distinguishing many Pacific rockfish. It is a species-identification guide, not a food-label or recipe standard [S05].

The evidence is sufficient to define a future species identity but not to make the current query boundary safe. This review makes no claim about where a particular catch was taken, how it was labelled for retail, or whether a specific product is available to a Québec consumer.

## Forms, numeric, and substitution limits

DFO reports a maximum size of approximately 50 cm and maximum weight of approximately 2.05 kg for the species. These are biological maximum observations, not a recipe portion, market unit, fillet weight, density, edible fraction, or cooking yield [S02–S03]. Do not place them in a catalog measurement field.

No reviewed source establishes a transferable portion, count weight, density, volume-to-mass mapping, edible yield, package yield, or cooked yield. Add no fresh, frozen, whole, fillet, cooked, smoked, dried, salted, canned, or other forms. No recipe or source supports substituting Pacific ocean perch for yellow perch, Atlantic redfish, another rockfish, cod, or another finfish. Add no global or contextual substitution, conversion, recipe link, or food-safety equivalence.

## Source register

Sources were accessed on 2026-10-12. These proposal-local IDs are not ledger additions.

| Source ID | Source | Claim supported and limit |
|---|---|---|
| WP04-PACIFIC-OCEAN-PERCH-20261012-S01 | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *Sebastes alutus* as Pacific Ocean Perch / Sébaste à Longue Machoire, as well as Ocean Perch / Sébaste, Rockfish, Redfish, and Rosefish. The same Fish List assigns Ocean Perch and overlapping common names to other *Sebastes* species. Fish-name evidence; not current Québec retail inventory or recipe equivalence. |
| WP04-PACIFIC-OCEAN-PERCH-20261012-S02 | Fisheries and Oceans Canada, [Pacific Ocean Perch (*Sebastes alutus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-ocean-perch-sebaste-a-longue-machoire-eng.html) | Pairs the English name and taxon, reports the species as commercially important in British Columbia, gives distribution/biology, and reports maximum size/weight. Fishery and biology evidence; not a Québec market measure or retail listing. Page modified 2025-07-04. |
| WP04-PACIFIC-OCEAN-PERCH-20261012-S03 | Pêches et Océans Canada, [Sébaste à longue mâchoire (*Sebastes alutus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-ocean-perch-sebaste-a-longue-machoire-fra.html) | Pairs the Québec French display and taxon, describes the species’ commercial importance in British Columbia, and reports maximum size/weight. Fishery and biology evidence; not a Québec retail listing or recipe-measure source. Page modified 2025-07-04. |
| WP04-PACIFIC-OCEAN-PERCH-20261012-S04 | OQLF, [sébaste, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Places `sébaste` in edible-fish and ichthyology contexts; maps it to *Sebastes* sp. and English `redfish`, `rosefish`, and `ocean perch`; notes Québec catches of *S. marinus*, *S. fasciatus*, and *S. mentella*. Last updated 2012; Québec terminology/scope evidence, not the candidate’s species-specific name or current retail supply. |
| WP04-PACIFIC-OCEAN-PERCH-20261012-S05 | Fisheries and Oceans Canada, [BC sport-fishing identification guide (French)](https://www.pac.dfo-mpo.gc.ca/fm-gp/rec/identify-identifier-fra.html) | Lists Pacific Ocean Perch / Sébaste à longue mâchoire / *S. alutus* separately from other Pacific rockfish. Species-identification evidence, not a consumer-label standard. |

## Recommendation

**Hold** `ingredient-ref-pacific-ocean-perch` outside the active reference catalog and ledger. The species-qualified bilingual name is well supported, but the current picker would make `ocean perch` and `sébaste` single-result queries for *S. alutus*, despite authoritative Québec and Canadian usage spanning other *Sebastes* taxa. Revisit when picker semantics preserve that broader boundary. If later accepted, use `Pacific Ocean Perch / sébaste à longue mâchoire` with no aliases, forms, measurement defaults, conversions, recipe links, or substitutions unless new direct evidence supports them.

No app tests or emulator checks were run for this proposal-only review.
