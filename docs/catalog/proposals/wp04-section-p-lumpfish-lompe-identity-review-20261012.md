# WP04 Section P — lumpfish / lompe whole-fish identity review

**Reviewed:** 2026-10-12

**Recommendation:** Hold the whole-fish ingredient reference.

**Scope:** *Cyclopterus lumpus* as a whole-fish species identity; roe and caviar products are explicitly out of scope.

**Change status:** Root-reconciled as a documentation-only hold. No catalog or ledger allocation was made; see [`wp04-lumpfish-lompe-whole-fish-hold-integration-20261012/README.md`](../batches/wp04-lumpfish-lompe-whole-fish-hold-integration-20261012/README.md).

## Decision

The name pair is well established: the OQLF normalizes French **lompe**, the CFIA Fish List pairs **Lumpfish / Lompe** with *Cyclopterus lumpus*, and MAPAQ’s Québec seafood directory uses the same normalized commercial pair. The evidence does not support treating that as a currently available whole-fish cooking ingredient, though. MAPAQ’s product listings identify salted lumpfish roe and caviar, while DFO’s 2024 assessment says roe is the landed product and the carcass has little commercial value and is generally discarded. DFO’s current inshore landings table likewise reports the commodity as “Roe, lumpfish.” The bundled recipes have no lumpfish or roe demand.

The OQLF classifies the species under edible fish and says it has commercial potential in Québec. An older DFO fact sheet also reports some local consumption of the flesh. Those establish that lumpfish can be a food fish; they do not establish a current Québec whole-flesh product or a recipe need. Keep the whole-fish candidate unallocated until such evidence appears. Do not use roe or caviar product evidence to create a whole-fish reference.

This is not the same picker problem as the held Nile tilapia, cunner, gilthead bream, or common carp candidates. With the standardized display names only, a hypothetical `lumpfish / lompe` row would not appear for the generic `fish` or `poisson` query. The hold rests on the narrow whole-flesh product evidence and zero recipe demand, not on a generic-name collision.

## Identity and product boundary

| Item | Finding |
|---|---|
| Candidate | Whole-fish identity for *Cyclopterus lumpus* |
| English / Québec French | `lumpfish` / `lompe` |
| Taxon | *Cyclopterus lumpus*; confirmed by OQLF, CFIA, MAPAQ, and DFO |
| Québec naming | `lompe` is OQLF’s normalized French commercial term. OQLF does not retain `poule d’eau`, `poule de mer`, `grosse poule de mer`, or `lump` for Québec seafood marketing. |
| Commercial product evidence | Québec sources found salted lumpfish roe and `caviar de lompe`; these identify roe products, not a whole-flesh retail product. DFO describes roe as the Canadian landed product and the carcass as having little commercial value. |
| OQLF English variants | `lump fish`, `lumpsucker`, and `hen-fish` are listed as English terms, but they are not CFIA’s standardized Canadian display pair. Do not add them as aliases. `lump fish` would also make a generic `fish` query return the candidate. |
| Roe boundary | Keep `œufs de lompe`, salted lumpfish roe, and `caviar de lompe` as a distinct future product identity if recipe demand supports it. They are not aliases, forms, or substitutions for the whole-fish identity. “Caviar alternative” in fisheries sources does not establish equivalence to other caviar or roe. |
| Crab boundary | Recipe 019’s `jumbo lump crab meat` is crab meat of a named grade and already has a crab form. Its `lump` wording is unrelated to lumpfish. |

## Current ownership and review history

The live source-of-truth scan found no exact normalized name, alias, taxon, or proposed ID owner for `lumpfish`, `lompe`, *Cyclopterus lumpus*, `lump fish`, `lumpsucker`, `hen-fish`, `poule de mer`, or `grosse poule de mer` in the active ingredient references, ingredient forms, legacy candidates, or research-ledger record text. No `ingredient-ref-lumpfish`, `candidate-lumpfish`, `ingredient-form-lumpfish-*`, or matching ledger source ID exists. The proposal source prefix below is also unused in the current ledger.

The plan’s open Section P finfish bullet still includes “regional fish”; it does not name lumpfish. A repository-wide search of Section P proposal and integration archives found no prior lumpfish/lompe review. Adjacent roe work includes [`wp04-tobiko-masago-roe-boundary-review-20261009.md`](wp04-tobiko-masago-roe-boundary-review-20261009.md), [`wp04-bottarga-identity-boundary-20261009.md`](wp04-bottarga-identity-boundary-20261009.md), and [`wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md`](wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md); none names lumpfish or allocates its whole-fish identity. Those reviews reinforce keeping roe products distinct, but do not decide this species candidate.

## Live catalog snapshot

Snapshot read from the shared worktree on **2026-10-12**. SHA-256 values cover exact file bytes. The recipe-corpus digest hashes each manifest-listed relative recipe path, a NUL byte, the exact recipe bytes, and a NUL byte, in manifest order.

| Surface | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| Active ingredient references | 1,279 | 409,721 | `77f42f8abdab6d6320c0b6879144594dc2711d9d971f9e351d44f180bb1d09b3` |
| Ingredient forms | 94 | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy candidates | 65 | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,587 records; 5,642 source entries; 4,673 distinct source IDs; 8 conversions | 5,518,915 | `6be08066986efae74e61f5110018a821341f20ea5f7e40423f50f45e8564e578` |
| Seed manifest | 114 recipe files | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated Kotlin catalog | 1,279 references | 560,698 | `4532cd25162dce7020bd56dfb74c9d63e07d029b8fde163fb964326ca9f72303` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

No file above was edited for this review.

## Live picker audit

`IngredientSearch.kt` normalizes accents and punctuation, matches complete normalized word phrases across the result set first, and falls back to substring matching only when there are no complete phrase matches. Terms include the reference displays and aliases, plus attached form labels and match terms. The table below reports the current live results and the result projection if a row with only the proposed display names `lumpfish` / `lompe` were added. That projection is counterfactual: the recommendation is to hold.

| Query | Current live picker result | Projection with display names only | Behavior |
|---|---|---|---|
| `lumpfish` | none | proposed lumpfish row only | Complete word phrase |
| `lompe` | none | proposed lumpfish row only | Complete word phrase; accent-free spelling is the stored display |
| `lump fish` | none | none | No alias proposed |
| `lumpsucker` / `hen-fish` | none | none | OQLF variants omitted from aliases |
| `fish` | Bonga dried fish powder; fish balls; fish sauce; fish stock | unchanged | Complete word phrase; `lumpfish` is one token and does not contain the token `fish` |
| `poisson` | bagoong isda; Bonga dried fish powder; fish balls; fish sauce; fish stock; pla ra; prahok | unchanged | Complete word phrase |
| `roe` | Greenland halibut | unchanged | Existing substring fallback: normalized `roe` occurs inside French `Groenland`; this is not a roe identity |
| `fish roe` / `fish eggs` | none | none | No whole-fish or roe phrase match |
| `caviar` | finger lime (`lime caviar`) | unchanged | Complete word phrase; this is not lumpfish caviar |
| `œufs de lompe` / `caviar de lompe` | none | none | Roe products are not in the species row’s names or aliases |
| `lump` | crab meat (`jumbo lump` form) | unchanged | Complete form phrase; crab grade, not lumpfish |

Do not add `lump fish` as an alias: although OQLF lists the English variant, it would cause `fish` to return the proposed species row alongside the four current results. The full `lumpfish` display remains exact and species-scoped. The `roe` substring result is an existing false positive unrelated to this proposal; adding a whole-fish row must not be presented as resolving it.

## Bundled recipe demand

The full manifest scan covered all 114 recipe files and all 1,123 ingredient rows, and searched both ingredient rows and the full JSON text (titles, descriptions, instructions, and notes). It found **zero** occurrences of `lumpfish`, `lompe`, *Cyclopterus lumpus*, `lump fish`, `lumpsucker`, `hen-fish`, `poule de mer`, `œufs de lompe`, `caviar de lompe`, `roe`, `fish roe`, `fish eggs`, or `caviar`.

Nearby seafood lines do not support a lumpfish link:

| Recipe line | Bundled wording | Existing interpretation |
|---|---|---|
| 019#8 | `1 lb jumbo lump crab meat` | `ingredient-ref-crab`, form `ingredient-form-crab-jumbo-lump`; crab grade, not lumpfish |
| 023#1 | `140 g sliced calamari` | Calamari; unrelated species and product |
| 077#10 | `675 g salmon fillets without skin, cut into cubes` | Salmon; existing line-specific weight, not transferable |
| 093#4 | `Cooked meat or seafood, to taste` | Unlinked free-choice instruction; no species or quantity established |
| 093#6 and 095#5 | Fish sauce | Fermented condiment, not fish flesh |
| 111#1 | `1 tuna steak` | Tuna; its count-based source measurement does not transfer |

No recipe link, measurement, form, yield, or substitution is warranted.

## Measurement and substitution limits

There is no lumpfish portion weight, package yield, edible-flesh yield, density, or recipe measure in the reviewed sources. DFO’s 2024 fishery assessment explains that Canadian roe landings may be multiplied by four to estimate a round-weight equivalent for female fish. That is a fisheries-statistics conversion based on a historical factor, not a culinary conversion, edible yield, or recipe substitution. The 2024 inshore landing table puts 27,375 kg under `Landed WT Round Kgs` for the `Roe, lumpfish` commodity code; that is not a roe-package weight or a recipe quantity.

An undated DFO *Underwater World* factsheet reports a roughly 3 kg average fish, specimens up to 10 kg, and that a 45 cm female may produce up to 1 kg of roe; it also estimates roe at 20–30% of body weight during the harvest period. The same sheet describes some local flesh consumption and European smoked products, but its figures and market description are historical fisheries observations. They are not portion sizes, retail-package measures, edible yield factors, or evidence of current Québec whole-fish availability. Keep them only as source-specific context.

No substitute can be inferred between lumpfish flesh and roe, salted roe/caviar, other fish roe, crab, salmon, tuna, or another finfish. The evidence does not establish cooking equivalence, a preparation form, or a quantity ratio. Add no density, unit mapping, measure, yield, conversion, or substitution rule.

## Source register

Access date for all sources: **2026-10-12**. IDs are proposal-local and have not been added to the research ledger.

| Source ID | Source and direct URL | Supports | Limits |
|---|---|---|---|
| WP04-P-LOMPE-IDENTITY-20261012-S01 | Office québécois de la langue française, [GDT: lompe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198845/lompe), updated 2011 | `lompe`, English `lumpfish`, *Cyclopterus lumpus*; edible-fish domain; Québec commercial potential; rejected Québec marketing names; listed English variants | Terminology and potential, not proof of current whole-fish retail supply |
| WP04-P-LOMPE-IDENTITY-20261012-S02 | MAPAQ, [Répertoire des poissons et fruits de mer du Québec, 5e éd. (PDF)](https://www.mapaq.gouv.qc.ca/fr/Publications/repertoireFRfinal-b.pdf); searchable copy at [Merici](https://cdi.merici.ca/mapaq_quebec/repertoire-poissons-fruits-mer-quebec.pdf), 2009 | Normalized commercial pair `Lompe / Lumpfish / Cyclopterus lumpus`; Québec processors list `œufs de lompe saumurés` and `caviar de lompe` | Historical directory. It documents roe products and businesses as of publication, not current availability or whole-fish flesh sales. The MAPAQ URL redirected during page opening; indexed PDF text and the searchable copy supplied the listed entries. |
| WP04-P-LOMPE-IDENTITY-20261012-S03 | Canadian Food Inspection Agency, [Fish List search result for Cyclopterus lumpus](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [CFIA Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), list modified 2023-09-18 | Accepted Canadian labeling pair `Lumpfish / Lompe`, scientific name *Cyclopterus lumpus* (Fish List entry TSN 167612) | Naming/labeling authority, not consumer-market or recipe evidence; the result page is an interactive lookup |
| WP04-P-LOMPE-IDENTITY-20261012-S04 | Fisheries and Oceans Canada, [Recovery Potential Assessment of Common Lumpfish in the Atlantic and Arctic Oceans](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41230097.pdf), Research Document 2024/009, February 2024 | Current Canadian fishery scope: targeted females for roe; roe is landed, carcass has little commercial value and is generally discarded; factor of 4 used for round-weight statistical estimates | Fisheries assessment and landing history, not a cooking or market-substitution source |
| WP04-P-LOMPE-IDENTITY-20261012-S05 | Fisheries and Oceans Canada, [2024 inshore landings and landed value by species](https://inter-w02.dfo-mpo.gc.ca/publications/reports_rapports/Land_Inshore_Debarquer_cotiere_2024_eng.htm) | Lists the landed commodity as `Roe, lumpfish`; the table reports 27,375 in its `Landed WT Round Kgs` column | Aggregate inshore landing record; the round-weight column is not a roe-package weight or recipe amount, and does not establish Québec consumer retail or whole-fish availability |
| WP04-P-LOMPE-IDENTITY-20261012-S06 | Fisheries and Oceans Canada, [Underwater World: Lumpfish](https://waves-vagues.dfo-mpo.gc.ca/Library/4062691x.pdf), undated public factsheet | Historical local flesh consumption and fishery description; source-specific body and roe observations (about 3 kg average, up to 10 kg, up to 1 kg roe from a 45 cm female, about 20–30% of body weight during harvest) | Publication date is not shown in the PDF text; historical fishery observations, not recipe measures or current retail evidence |

## Exact proposed delta if reopened

**Current action: none.** Do not add an active reference, legacy candidate, research-ledger record, form, recipe link, measurement, conversion, yield, or substitution for this proposal.

If later evidence establishes a whole-fish culinary product or recipe demand, the bounded identity-only row would be:

```json
{
  "id": "ingredient-ref-lumpfish",
  "nameFr": "lompe",
  "nameEn": "lumpfish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "PROTEIN"
}
```

That future row would identify *Cyclopterus lumpus* only. It would not claim whole-fish retail availability, absorb roe/caviar, or include any form, source-specific numeric value, recipe link, or substitution. If an actual recipe later calls for salted lumpfish roe or caviar de lompe, review that processed roe product as its own identity with its own measurements and boundaries.

No tests or emulator checks were run; this is a proposal-only research document.
