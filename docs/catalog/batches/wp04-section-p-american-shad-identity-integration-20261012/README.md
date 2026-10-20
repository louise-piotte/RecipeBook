# WP04 Section P American shad identity integration — 2026-10-12

## Decision

Added identity-only `american shad / alose savoureuse` as `ingredient-ref-american-shad` in
`PROTEIN`, scoped to *Alosa sapidissima*, with no aliases. OQLF identifies `alose savoureuse` as
the normalized Québec commercial-fish term and pairs it with American shad and the taxon. CFIA and
TERMIUM corroborate the same species and bilingual name. The unqualified words `shad` and `alose`
are not stored aliases. Search can still surface this row when those shorter words occur within a
display name; that does not make an unqualified recipe species-specific.

Keep *Alosa alosa*, gaspareau/alewife (*A. pseudoharengus*), herring, and other shad/alose species
separate. Do not add `alose d’Amérique`, which OQLF says was not retained for Québec fish-product
labeling and TERMIUM marks old. The Québec species profile currently lists the species as vulnerable
and describes its commercial fishery as marginal; the profile also notes that new spawning-ground
evidence questions the basis for that designation. The identity row does not imply product
availability, permission to catch or sell the fish, or sourcing advice.

Biological lengths and body weights are not recipe portions, fillet weights, yields, or kitchen
measures. No measure, default density, unit mapping, form, conversion, yield, recipe link, or
substitution rule was added. The ledger retains no supported culinary measurement and a bounded
no-supported-substitute finding. The full recipe corpus has no matching ingredient row.

## Evidence

- [OQLF: alose savoureuse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198929/alose-savoureuse) identifies the normalized Québec term, pairs it with American shad and *Alosa sapidissima*, and says `alose d’Amérique` was not retained for Québec fish-product labeling.
- OQLF’s separate [alose entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198932/alose) pairs unqualified `alose / shad` with *Alosa alosa*.
- The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=American%20Shad&wbdisable=true) lists *Alosa sapidissima* as `American Shad / Alose Savoureuse`, and separately lists `Shad` without a French name. It also shows a histamine risk group; this record stores no fish handling guidance.
- [TERMIUM Plus, record 20](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frr&lang=fra&srchtxt=CRUSTACES) pairs American shad with *Alosa sapidissima* and marks `alose savoureuse` as normalized; it lists `alose d’Amérique` as old.
- Fisheries and Oceans Canada profiles in [English](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/american-shad-alose-savoureuse-eng.html) and [French](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/american-shad-alose-savoureuse-fra.html) confirm the bilingual species name and taxon. Their biological sizes are not kitchen measures.
- The [Gouvernement du Québec species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/alose-savoureuse) gives the accepted names, related-species boundaries, body-size description, current status text, and marginal fishery context.

The proposal contains the exact-key ownership table, full recipe-demand audit, measurement limits,
substitution review, and seven-source register:
[WP04 Section P American shad identity review](../../proposals/wp04-section-p-american-shad-identity-review-20261012.md).

## Static verification

- Bundled seed-package validation, reference normalization, and generated-catalog freshness checks passed.
- Research-ledger validation passed with zero errors. Each of the seven new source IDs occurs once.
- Exact-key ownership assigns the English and French displays to the new reference; no alias or related-species key was added. The 114-recipe / 1,123-row corpus has no candidate-term match.
- The two changed JSON files are UTF-8 without BOM and store non-ASCII text with Unicode escapes. The corpus remains 752,993 bytes with manifest-ordered digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,240 references | `a3c211873aea5f994829e65a2a4c069db48dfbf4e9ed5f5ee2870ec711ff2341` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,539 records; 5,325 source entries; 4,367 distinct source IDs | `8819b1aff9867a26f3100e49c29422c1787223dbc60d26868ee8788c7efd6d20` |
| `BundledIngredientCatalog.kt` | 1,240 generated references | `8ac1ec1a271f2b18f1383810705e70afc3e4ab270872b21aa131565e3848c6af` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

Section P remains open for other fish and seafood identities and boundaries.
