# WP04 Section P R112: albacore tuna identity

## Disposition

Added identity-only `albacore tuna / germon` for *Thunnus alalunga* as
`ingredient-ref-albacore-tuna`. English `long-fin tuna` and French `thon germon blanc` are
qualified aliases. Added French `thon albacore` to the existing yellowfin reference for
*T. albacares*. With both rows, a bare `albacore` search returns both species; the qualified English
and French phrases select their respective rows.

The new row has no density, unit mappings, forms, active measures, recipe links, conversions, yields,
or substitutions. Recipe 111 remains generic tuna because its line says only “1 tuna steak.” No
species-specific numeric evidence or albacore recipe demand was found.

## Evidence and limits

- The [CFIA Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna) documents the Canadian common-name collision: *T. alalunga* has albacore/germon names, while yellowfin *T. albacares* also has a Tuna / Albacore row.
- The [Québec government fish table](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson) pairs *T. alalunga* with `Albacore tuna / Thon germon blanc` and yellowfin with `Yellowfin tuna / Thon albacore`.
- [OQLF's germon entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198922/germon) gives preferred French `germon` and English `long-fin tuna`, and scopes `thon blanc` to canned product wording. [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=THUNNUS+ALALUNGA) confirms the Canadian term overlap.

The [R112 proposal](../../proposals/wp04-section-p-albacore-tuna-identity-review-r112-20261014.md)
documents the complete source table, search projection, recipe scan, and numeric/substitution limits.
The [research ledger](../../research-ledger.v1.json) records the sources and accepted identity.

## Static checks

Package validation, reference normalization, ledger schema/reference checks, generated-index
freshness, search-key ownership, picker projection, recipe scan, UTF-8/no-BOM, links, and whitespace
were checked. No app tests or emulator checks were run because the change only adds database JSON
data and its generated catalog entry, under the updated `AGENTS.md` rule.

Section P remains open; recipe 111 remains linked to generic tuna.
