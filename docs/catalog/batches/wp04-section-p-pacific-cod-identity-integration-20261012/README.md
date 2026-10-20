# WP04 Section P Pacific cod identity integration — 2026-10-12

## Decision

Added identity-only `Pacific cod / morue du Pacifique` as `ingredient-ref-pacific-cod` in
`PROTEIN`, scoped to *Gadus macrocephalus*. The only aliases are `gray cod` and `grey cod` in
English. Generic `cod / morue`, Atlantic cod, Alaska pollock, salt cod, and stockfish remain
separate. CFIA, DFO, and TERMIUM support the species name, taxon, bilingual display, and English
spelling variants. DFO's marketplace-equivalence statement for Atlantic cod is not recipe
substitution guidance.

The ledger has six source entries, an accepted identity decision, three source-specific Canadian
Nutrient File observations, and a bounded finding that no supported recipe substitute was located
in the reviewed scope. The raw one-fillet observation is 119.3 g, but the same source reports 66%
total refuse without explaining its relationship to that portion. It is not an edible-fillet
conversion or yield. The other two observations apply only to baked or broiled flaked cod: 100 mL
is 57.5 g and 250 mL is 143.7 g. They are not raw-fish density or general volume mappings.

No recipe line, form, default density, unit mapping, conversion, yield, or substitution rule was
added. All 114 manifest recipes and 1,123 ingredient rows remain unchanged; none matched the
candidate terms. Exact normalized reference ownership now points the four accepted display/alias
terms to `ingredient-ref-pacific-cod`; no active row owns *Gadus macrocephalus*, generic `cod`, or
generic `morue` as an exact field value.

## Sources

- [CFIA Fish List: Pacific Cod](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pacific%20Cod) lists *Gadus macrocephalus* as Pacific Cod and Grey Cod / Morue du Pacifique.
- [DFO: Pacific Cod](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-eng.html) and [Pêches et Océans Canada: Morue du Pacifique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-fra.html) pair the bilingual names with the same taxon. Their market-equivalence wording does not establish culinary substitution.
- [TERMIUM Plus: gray cod](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=GRAY+COD) supports the gray/grey spellings and standardized commercial French term; `morue grise` is identified as European usage and was not added.
- Health Canada's [CNF food 3196](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3196) supports the raw-fillet observation and its unresolved refuse caveat. [CNF food 3139](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3139) supports the two prepared, flaked portions.

The detailed boundary, source register, measurement limits, and pre-integration ownership audit are
in the [proposal](../../proposals/wp04-section-p-uncovered-seafood-gap-review-20261012.md).

## Static verification

- Bundled seed package validation passed; reference normalization and generated-catalog freshness
  checks passed.
- Research-ledger schema/evidence validation passed with zero errors. The six new source IDs and
  three observation IDs are unique within the ledger.
- The manifest still lists 114 recipes and the recipe corpus has 1,123 ingredient rows; its
  manifest-ordered SHA-256 digest is unchanged at
  `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Both changed JSON files are UTF-8 without BOM. No tests or emulator checks were run because this
  change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,236 references | `5777a596ace933894fca32a4b5f0269894a4543b10d45f798013d05f3dda1c9f` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,535 records; 5,300 source entries; 4,342 distinct source IDs | `9b330827411ea776a62e8b68a21a49ea7a809ccf1e5d3f64febc34c08bcacb23` |
| `BundledIngredientCatalog.kt` | 1,236 generated references | `ad8eabce6f1aa18d84c20d5803f2ede2ebb3485f98a9bf3ac4ce24cd4f6c16fa` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

Section P remains open for its other identities and product boundaries.
