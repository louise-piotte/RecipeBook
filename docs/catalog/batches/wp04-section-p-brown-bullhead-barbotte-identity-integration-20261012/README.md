# WP04 — Brown bullhead / barbotte identity integration (2026-10-12)

## Decision

Added identity-only `brown bullhead / barbotte` for *Ameiurus nebulosus* as a `PROTEIN` reference.
Added `brown catfish` and `barbotte brune` as qualified search aliases. Keep bare `catfish` and
`bullhead`, channel catfish, yellow bullhead, stonecat, and other catfish taxa distinct.

OQLF normalizes `barbotte` for Québec edible-fish marketing and maps it to *A. nebulosus*. The Québec
species profile independently supports the English species name and lists `brown catfish` among
alternate names; a current local processor listing sells eviscerated, skinned, and skinless fillet
products as `Barbotte` from Lac Saint-Pierre. OQLF says `barbotte brune` was not retained for
commercial fish labeling, so that term is searchable only and is not the display.

The product listing's bulk format `4.54` has no explicit unit; the species profile's lengths and
whole-fish weights do not establish edible mass, portion size, fillet yield, density, or kitchen
conversion. The complete manifest-listed bundle has 0 matching hits across 114 recipes and 1,123
ingredient rows. No forms, density, unit mappings, measures, recipe links, conversions, yields, or
substitutions were added. The identity and six supporting source records are stored under
`ingredient-ref-brown-bullhead` in the research ledger.

## Evidence reviewed

The complete ownership audit, projected picker results, recipe scan, source limits, and pre-integration
snapshot are in the [review proposal](../../proposals/wp04-section-p-brown-bullhead-barbotte-identity-review-20261012.md).
Key sources include:

- Office québécois de la langue française, [barbotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198876/barbotte), which normalizes the Québec food-fish display and maps it to *A. nebulosus*.
- Gouvernement du Québec, [Barbotte brune species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/barbotte-brune), which lists `brown catfish`, `barbotte`, and other alternate names, distinguishes neighboring species, and reports commercial exploitation in the St. Lawrence.
- Gouvernement du Québec, [Portrait de la pêche commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-peche-commerciale), supporting the current freshwater commercial-fishery context.
- Aliments du Québec, [Barbotte — Simmer International](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/barbotte), a current Québec product listing with local source and product presentations.
- Canadian Food Inspection Agency, [Fish List brown bullhead query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Brown%20Bullhead), which links the species to its Canadian fish-label name.

## Static validation

- Bundled seed package validation passed at 1,286 references, 97 forms, and 114 recipe files.
- Ingredient-reference normalization and generated Kotlin index checks passed; the index contains 1,286 references.
- The evidence ledger contains 1,593 records, including six new source entries for this identity.
- Exact ownership and manifest-wide recipe checks found no duplicate owner and no recipe demand.
- UTF-8, escaped JSON Unicode, and whitespace checks passed.
- No app tests or emulator checks were run because this change only adds database JSON data.

At the post-integration checkpoint, `ingredient-references.v1.json` had SHA-256
`d1beaa8f10bab6f322aff6c4994c7badc61761706916c8d324b8cd13d889aec2`, and
`research-ledger.v1.json` had SHA-256
`ecc7df79b2f3b32b1f8d58bcc81cfb109e76f47def60c7cde38e21b640dda863`. The manifest-ordered recipe
corpus was unchanged at SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.
