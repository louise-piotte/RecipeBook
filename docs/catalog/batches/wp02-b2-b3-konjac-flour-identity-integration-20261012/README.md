# WP02 B2/B3 konjac flour identity integration — 2026-10-12

## Decision

Added identity-only `konjac flour / farine de konjac` as `ingredient-ref-konjac-flour` in
`FLOUR_AND_STARCH`. Scope the row to food-grade material sold as konjac flour made from a konjac
tuber or corm; do not assign one species or composition to every supplier. No aliases were added.
The Health Canada natural-health-products entry lists `konjac` and `konjac gum` among common names,
but it is not a food-label standard. KALYS distinguishes flour products and documents varied species
and specifications; the product research does not make flour, powder, gum, glucomannan, and prepared
konnyaku universal synonyms.

The Québec-facing Super C ingredient list uses `farine de konjac` in prepared Haiku vermicelli, and
OQLF accepts `konjac` in French and says its tuberous rhizome is used to make flour. The local retail
label supports French wording only; it does not establish standalone flour availability or a common
specification. Keep `konjac powder`, `konjac gum`, `glucomannan`, `konnyaku`, bare `konjac`, and
`elephant yam flour` out of the aliases. Keep true-yam flour and finished shirataki noodles separate.

The ledger contains four new source entries, one accepted identity decision, and two reused
OQLF/MAFF source IDs from the shirataki boundary record. Both `measurementState` and
`substitutionResearchState` remain `not_yet_researched`. No measurement observation, substitution
finding, form, density, unit mapping, conversion, yield, recipe link, or substitution rule was added.
The complete 114-recipe / 1,123-row corpus has no candidate-term hits and remains unchanged.

## Sources

- [Health Canada NHPID: Konjac flour](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/ingredReq?id=3974&lang=eng&wbdisable=true) lists the proper name and tuber part. The NHP entry is not a food-label standard.
- [KALYS Konjac Flours](https://www.kalys.com/en/produits/konjac-kalys) documents food uses, multiple edible species, and substantial grade/specification variation.
- Laignier et al., [“*Amorphophallus konjac*: A Novel Alternative Flour on Gluten-Free Bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8229984/) reports product- and formulation-specific findings, not a general measure or substitution ratio.
- [Super C: Haiku vermicelles de konjac](https://www.superc.ca/allees/garde-manger/pates-riz-et-feves/nouilles-et-vermicelle/vermicelles-de-konjac/p/055789720632) lists `farine de konjac` among the prepared noodle ingredients.
- Existing cross-references: [OQLF: konjac](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559799/konjac) supports the French borrowing and flour source; [Japan MAFF: konnyaku](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/nousan-kakou.html) describes konnyaku powder as an input to a separate prepared product.

The full prior-work and exact-key audit, recipe scan, source limits, and proposal-local source register
are in the [proposal](../../proposals/wp02-b2-b3-konjac-flour-identity-gap-review-20261012.md).

## Static verification

- Bundled seed package validation passed; reference normalization and generated-catalog freshness
  checks passed.
- Research-ledger schema/evidence validation passed with zero errors. The four new source IDs each
  occur once; reused OQLF/MAFF IDs remain on the existing shirataki record.
- Exact normalized ownership assigns only `konjac flour` and `farine de konjac` to the new row among
  reviewed candidate terms. No recipe line or file matched; the 114-file / 1,123-row corpus digest
  remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Changed JSON files are UTF-8 without BOM with French text stored as Unicode escapes. No tests or
  emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,238 references | `c30fa9e8000a1547f44a82c45cc574c5e840123197b595600649052a39ee8c11` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,537 records; 5,310 source entries; 4,352 distinct source IDs | `71bb49893b67b6f93d95304060c7c22c61a534635e4e3d1deee4581658f51d20` |
| `BundledIngredientCatalog.kt` | 1,238 generated references | `3b1edb28aa213222477ad558262e921193940febb30729f06039a1b86665f3a8` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

Broader WP02 B2/B3 flour and starch review remains open.
