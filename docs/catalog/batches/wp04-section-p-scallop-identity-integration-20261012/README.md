# WP04 Section P scallop / pétoncle identity integration

## Decision

Promoted the held `ingredient-ref-scallop` candidate in place to identity-only `scallop / pétoncle`
in `PROTEIN`. The identity covers the species-unspecified consumer ingredient sold as the edible
adductor muscle. It does not include the whole animal or shell.

Added only `scallops`, `pétoncles`, and `scallop meat` as aliases. Kept dried scallop and `conpoy`,
roe, named species, Bay and Hokkaido product names, breaded preparations, freshness/frozen descriptors,
bare `noix`, and European `coquille Saint-Jacques` separate. No forms, measurements, density, unit
mappings, recipe links, conversions, yields, or substitutions were added. The 114 manifest-listed
recipes and all 1,123 ingredient rows have no scallop match.

## Evidence

- [OQLF — pétoncle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle) gives the preferred Québec term, describes the marketed product as the adductor muscle (sometimes with attached roe), lists English `scallop` and `scallop meat`, and discourages `coquille Saint-Jacques` for Canadian scallops.
- [Fisheries and Oceans Canada — Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm) lists several harvested scallop species as distinct taxa.
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) attaches `Scallop` and/or `Pétoncle` to multiple Pectinidae species while also listing species-specific names.
- [CFIA — Canadian Standards of Identity, Volume 3: Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3) separates breaded scallops from scallop meat and excludes roe and other extraneous material from the meat standard.
- [Metro — Scallops](https://api.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/petoncles) describes the shared species-group name, marketed muscle, and fresh/frozen retail offerings.
- [Mayrand Québec — Pétoncle surgelé](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/petoncle-surgele) lists unqualified, Bay, and Hokkaido products separately.

Six new source records and an accepted decision were added to the existing ledger record. The prior
unresolved decision remains as review history. See the [source review](../../proposals/wp04-section-p-fresh-scallop-identity-boundary-review-20261012.md)
for the exact-key audit and source limitations.

## Snapshot and validation

Snapshot after integration; hashes cover exact file bytes.

| Surface | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 1,228 | `b9371dba388639d211f9b856e4e76de168edd372785206c90f8fc6e951c05a7d` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import identities | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,526 records; 5,223 source entries; 4,286 distinct source IDs | `8a606c12f274d4cd87f8c154280211df2b6f8b04b5ba1a2dca7417806d605dfe` |
| Generated Kotlin catalog | 1,228 references | `e2c09021b4878149a8a7f06018b9b779955a983600ac2fe8a5ceea580ce5e19b` |
| Seed manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe content | 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

Seed-package validation, reference normalization, generated-catalog freshness, ledger validation,
exact-key ownership, full recipe scanning, UTF-8/no-BOM, and scoped whitespace checks passed. No tests
or emulator checks were run because the change only adds database JSON data, as directed in
`AGENTS.md`.
