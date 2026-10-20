# WP04 Section P American lobster identity integration

## Decision

Promoted the held `ingredient-ref-lobster` candidate in place to identity-only
`American lobster / homard d’Amérique`, scoped to *Homarus americanus*, in `PROTEIN`. Added only
`lobster`, `North American lobster`, `homard`, and `homard américain` as search aliases. Kept
European lobster, langoustine, langouste/spiny lobster, crayfish, and distinct lobster products
outside this row. Added no forms, recipe links, measures, conversions, yields, or substitutions.

The [source review](../../proposals/wp04-section-p-generic-lobster-homard-identity-review-20261012.md)
documents the Canadian common-name boundary. The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp)
pairs `Lobster / Homard` and `American Lobster / Homard Américain` with *H. americanus*, and the
[Atlantic Fishery Regulations](https://laws-lois.justice.gc.ca/eng/regulations/SOR-86-21/section-sched892491.html)
list `Lobster` as *H. americanus*. [CFIA guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names)
describes the Fish List as the English/French common-name collection for Canadian sales and
processing. OQLF records both the qualified American name and the separate European-lobster species;
the integration keeps those identities distinct. Current [MAPAQ](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentaire/peche/FI_crustaces-quebec_MAPAQ.pdf)
and [Metro](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/homard-cuit/p/221532)
sources connect Québec `homard` products to *H. americanus*.

The 114 bundled recipes contain no lobster or homard ingredient row or recipe-text match, so the
identity has no recipe links.

## Live data snapshot

Snapshot after the 2026-10-12 integration batch:

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,224 rows; 391,453 bytes | `cb5bc0962c77e97dcad944c6352ed933002dd6d2ea2c7ef9a578c6064c3f8fcf` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,523 records; 5,192 sources; 4,255 distinct source IDs; 5,037,117 bytes | `05223549fbf89b9e452282865ea1c551013d12f5d3a4214fa5d8792c984732fb` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1,224 references; 536,146 bytes | `dad935ecd939cdbea8cc1e53b511ac8ffce5f36b4f74b4d4e29bbb6cc3f0e751` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file
bytes, and a trailing NUL byte. File hashes cover exact bytes.

## Static verification

- Bundled seed package validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger validation passed with 1,523 records and zero errors.
- Exact normalized ownership assigns the new displays and four aliases only to
  `ingredient-ref-lobster`. European-lobster and langouste terms remain outside; the existing
  `ingredient-ref-langoustine` does not own any lobster key.
- All 114 manifest recipes / 1,123 ingredient rows were scanned; no candidate phrase occurs.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
