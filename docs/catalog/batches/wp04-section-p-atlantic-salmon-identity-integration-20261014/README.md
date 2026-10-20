# WP04 Section P R115: Atlantic salmon identity integration

Reviewed and integrated on 2026-10-14. Section P remains open.

## Change

Added identity-only `Atlantic salmon / saumon de l’Atlantique` for *Salmo salar* as
`ingredient-ref-atlantic-salmon`. The preferred Québec display follows OQLF; the qualified French
search alias `saumon atlantique` is supported by current Canadian/Québec fish wording. Do not display
the alias as preferred wording, and do not add bare `salmon` / `saumon`, `ouananiche`, or `saumon de
Gaspé` aliases.

The R114 generic salmon-group hold remains in place. Keep the existing generic `salmon fillets /
filet de saumon` reference and recipe 077#10 unchanged. No form, active measure, density, unit
mapping, recipe link, conversion, yield, or substitution was added. No bundled recipe names
Atlantic salmon or *S. salar*.

The ledger record stores the four reviewed identity sources, an accepted species-identity decision,
and unresolved measurement and substitution decisions. Product-specific Metro wording and
provenance were not generalized into reusable product-state, numeric, or origin claims.

## Picker and recipe boundary

The post-integration phrase-first projection returns one result for `Atlantic salmon`, `saumon de
l’Atlantique`, and `saumon atlantique`. Broad `salmon` and `saumon` queries each return seven rows:
the five Pacific species, generic salmon fillets, and Atlantic salmon. `salmon fillets` and `filet de
saumon` remain on the generic fillets row; `ouananiche` remains unassigned.

The manifest still lists 114 recipes and the proposal's full scan still found 1,123 ingredient rows.
Recipe 077 row 10 remains 675 g of generic salmon fillets without skin, linked to
`ingredient-ref-salmon-fillets-without-skin`; this line does not establish a species.

## Evidence

- OQLF, [saumon de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198857/saumon-de-latlantique), supports the preferred Québec display, English equivalent, and *Salmo salar* identity.
- CFIA, [Fish List results for *Salmo salar*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Salmo%20salar), supports the Canadian qualified common names and the shared unqualified label boundary.
- Gouvernement du Québec, [Saumon atlantique](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/saumon-atlantique), identifies *Salmo salar* and describes ouananiche as its freshwater-confined form.
- Metro Québec, [Filets de saumon Atlantique frais, product 222357](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/saumons-truites-et-thons/filets-de-saumon-atlantique-frais/p/222357), uses the qualified term and identifies *S. salar* for one product with Chilean provenance; its SKU wording is not generalized.
- The proposal contains the full ownership, picker, corpus, numeric/form/substitution boundary review and source limitations: [R115 proposal](../../proposals/wp04-section-p-atlantic-salmon-identity-review-r115-20261014.md).

## Static verification

- Ingredient-reference normalization, bundled-package validation (including ledger schema/source checks), and generated Kotlin catalog freshness passed. Current totals are 1,457 references, 105 forms, and 1,797 research-ledger records.
- The 63 legacy-import candidates retain no Atlantic-salmon identity; no recipe, form, or substitution data changed for this integration.
- Focused picker projection and recipe-link boundary are recorded above; the proposal documents the complete phrase-first query comparison and 114-recipe / 1,123-row corpus scan.
- No app, Gradle, instrumentation, or emulator tests were run because this integration only adds database JSON data and its generated catalog entry, as directed by `AGENTS.md`.
- Section P remains open.
