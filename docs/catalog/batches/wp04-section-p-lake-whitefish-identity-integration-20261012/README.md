# WP04 Section P lake whitefish identity integration — 2026-10-12

## Decision

Added identity-only `lake whitefish / grand corégone` as `ingredient-ref-lake-whitefish` in
`PROTEIN`, scoped to *Coregonus clupeaformis*. No aliases were added. OQLF pairs the English and
French names with this taxon and identifies `grand corégone` as Québec's standardized edible-fish
term. DFO's English and French profiles confirm the species. Broader `whitefish`, `corégone`, and
`poisson blanc` wording remains outside the aliases because it can refer to other fish or, for
`poisson blanc`, pale-fleshed fish generally.

The ledger records six sources, one source-specific baked-food observation, and an accepted finding
that no recipe substitute was supported in the reviewed scope. Health Canada's Table 8 lists
“Whitefish, lake, native, baked” at a 75 g measure / 75 g weight. This is retained only as the exact
prepared-food table observation; it is not a raw-fish portion, count weight, general density, or
recipe-serving recommendation.

No recipe line, form, default density, unit mapping, conversion, yield, or substitution rule was
added. All 114 manifest recipes and 1,123 ingredient rows remain unchanged, with no candidate-term
matches. Exact normalized ownership now assigns `lake whitefish` and `grand corégone` to the new
reference; no exact field owner exists for *Coregonus clupeaformis*, `whitefish`, `white fish`,
`corégone`, `corégone de lac`, or `poisson blanc`.

## Sources

- [OQLF: grand corégone](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199106/grand-coregone) directly pairs the Québec term with lake whitefish and *Coregonus clupeaformis*, and explains why broader commercial names are not retained.
- Fisheries and Oceans Canada profiles [Lake Whitefish](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-whitefish-grand-coregone-eng.html) and [Grand corégone](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-whitefish-grand-coregone-fra.html) confirm the English/French species names and taxon.
- [TERMIUM Plus: lake whitefish](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=SAULT+WHITEFISH) supports the bilingual commercial term for the same taxon.
- [Health Canada Table 8: Fish and Shellfish](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html) supplies the baked-food 75 g reference entry. The [CFIA Fish List query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Lake%20Whitefish) shows multiple rows for *C. clupeaformis* and broader naming that is not promoted to aliases.

The detailed prior-work, key-ownership, recipe-demand, source-register, and measurement review is
in the [proposal](../../proposals/wp04-section-p-lake-whitefish-identity-review-20261012.md).

## Static verification

- Bundled seed package validation passed; reference normalization and generated-catalog freshness
  checks passed.
- Research-ledger schema/evidence validation passed with zero errors. The six new source IDs and
  the observation ID each occur once in the ledger.
- The manifest still lists 114 recipes and the corpus has 1,123 ingredient rows; its
  manifest-ordered SHA-256 digest remains
  `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Changed JSON files are UTF-8 without BOM and retain French accents as Unicode escapes. No tests
  or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,237 references | `bc1019f85e7a9fd2a51b3d0ef869021ac692739b3215e80d50fa85ae3e693961` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,536 records; 5,306 source entries; 4,348 distinct source IDs | `bc91b5d06952415060722f077428885e521fbfc524a4bd3f17d0c113b1ceb334` |
| `BundledIngredientCatalog.kt` | 1,237 generated references | `51fc242214c36f0adf4bbeda88b3a3f5322b8f7cb32ac595dcde58f93ee3da60` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

Section P remains open for its other identities and product boundaries.
