# WP04 Section P — yellow bullhead / barbotte jaune identity review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only freshwater finfish identity, Canadian/Québec naming, picker, and recipe-demand review.
- **Recommendation:** Advance an identity-only `PROTEIN` row for yellow bullhead / `barbotte jaune`, *Ameiurus natalis*, with no aliases. Keep its other CFIA-listed names inactive until a Québec-facing food-product source supports their use. Add no form, measure, density, mapping, recipe link, conversion, yield, or substitution.
- **Disposition:** Accepted and integrated on 2026-10-13 as identity-only `ingredient-ref-yellow-bullhead`; recipe rows, forms, measures, and active substitutions remain unchanged.

## Candidate and boundary

The candidate is yellow bullhead, *Ameiurus natalis*. It is a distinct species from the active brown bullhead / `barbotte`, *A. nebulosus*, and from channel catfish / `barbue de rivière`, *Ictalurus punctatus*. Québec’s current fishery regulation explicitly lists **Yellow bullhead (Barbotte jaune)** as *A. natalis* within a larger bullhead group that also includes brown bullhead and stonecat. The Québec freshwater-fish identification poster independently lists `Barbotte jaune` and *A. natalis*. CFIA’s Fish List attaches *A. natalis* to several label names, including `Bullhead / Barbotte Jaune`. [S01–S03]

| Proposed ID | Category | English display | Québec French display | Taxon | Aliases proposed |
|---|---|---|---|---|---|
| `ingredient-ref-yellow-bullhead` | `PROTEIN` | **yellow bullhead** | **barbotte jaune** | *Ameiurus natalis* | None |

This pair is supported as an official Québec fish name and species pairing by the fishery regulation, and as Canadian fish-label terminology by CFIA. I found no OQLF entry specifically for yellow bullhead. OQLF’s `barbotte` edible-fish entry maps that unqualified Québec product term to brown bullhead, *A. nebulosus*, and says `barbotte brune` was not retained for Québec fish-product labeling. Accordingly, do not shorten the proposed French display to `barbotte`, and do not treat the nearby brown-bullhead decision as covering this candidate. [S04]

The previous brown-bullhead proposal and integration note mention yellow bullhead only as an excluded neighboring species. The live research ledger repeats that distinction inside the accepted *A. nebulosus* record; that is contextual boundary evidence, not an identity allocation, source allocation, or dedicated yellow-bullhead review. The current Québec commercial-fishing overview and product listing concern **barbotte brune / brown bullhead**. They do not establish that a current local product is *A. natalis*. CFIA’s listing supplies an accepted Canadian label name, but does not establish current Québec retail stock. [S05–S07]

## Exact ownership and prior-review audit

Before integration, the live references, forms, legacy candidates, and ledger were checked for normalized exact values matching the candidate ID, name pair, common names, and taxon. The 1,335-reference baseline had no exact owner for `ingredient-ref-yellow-bullhead`, `yellow bullhead`, `barbotte jaune`, `yellow catfish`, `Pimélode des marais`, `silure jaune`, or *Ameiurus natalis*. No form was attached to the candidate. The only baseline ledger text hit was in `ingredient-ref-brown-bullhead`: its Québec species source notes yellow bullhead as a distinct neighboring species, and its decision says to keep yellow bullhead separate. The accepted identity is now allocated to `ingredient-ref-yellow-bullhead`.

| Neighboring live owner | Existing scope | Separation retained |
|---|---|---|
| `ingredient-ref-brown-bullhead` | brown bullhead / barbotte; aliases `brown catfish` and `barbotte brune`; *A. nebulosus* | Do not move its Québec product evidence or aliases to *A. natalis*. |
| `ingredient-ref-channel-catfish` | channel catfish / barbue de rivière; *I. punctatus* | Keep channel catfish separate; do not add `catfish` or `poisson-chat` as yellow-bullhead aliases. |

The archive search, before this review’s integration, found no yellow-bullhead-specific proposal, hold, batch, active catalog row, form, legacy candidate, or ledger record. The previous brown-bullhead packet is linked here for its limited exclusion context: [proposal](wp04-section-p-brown-bullhead-barbotte-identity-review-20261012.md), [integration note](../batches/wp04-section-p-brown-bullhead-barbotte-identity-integration-20261012/README.md).

Baseline snapshot read immediately before allocating this candidate on 2026-10-13; counts reflect the same-day sorghum-grits integration, and hashes cover exact file bytes.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,335 references | 427,754 | `eed892ceab9408c4b62e4d67adce86b89a9d4b88be66bbd279dc6e559ada9e56` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,643 records; 6,173 source entries; 5,180 distinct source IDs; 8 unit conversions | 6,133,983 | `fbeb8c3f421983f0c39fa554715d9f86ec2a1bcf00963c24ba77a9c4a6b3debc` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Name scope and picker projection

CFIA associates *A. natalis* with **Yellow Bullhead / Pimélode des marais**, **Yellow Catfish / Silure Jaune**, and **Bullhead / Barbotte Jaune**. It separately associates *A. nebulosus* with **Brown Bullhead / Barbotte** and another `Bullhead` entry. Québec’s fisheries regulation and species-identification material provide the qualified pair **Yellow bullhead / Barbotte jaune**; use that display only. Do not activate `yellow catfish`, `pimélode des marais`, `silure jaune`, bare `bullhead`, bare `barbotte`, generic `catfish`, or scientific names as aliases. The bare-query results below come from words embedded in the species-qualified displays, not a generic alias allocation. [S01–S04]

The projection applies the current normalization and whole-word phrase-first, substring-fallback logic in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), across reference names, aliases, and attached form terms. The candidate row is integrated in the live catalog; the projection below compares the captured baseline with the validated current behavior.

| Query | Before integration | After integration | Interpretation |
|---|---|---|---|
| `yellow bullhead` | None | Yellow bullhead / barbotte jaune | Exact candidate display phrase. |
| `barbotte jaune` | None | Yellow bullhead / barbotte jaune | Exact Québec-qualified display phrase. |
| `bullhead` | Brown bullhead / barbotte | Brown bullhead / barbotte; Yellow bullhead / barbotte jaune | Both represented species remain visible. |
| `barbotte` | Brown bullhead / barbotte | Brown bullhead / barbotte; Yellow bullhead / barbotte jaune | The qualified candidate appears alongside the existing local product identity. |
| `catfish` | Brown bullhead / barbotte; channel catfish / barbue de rivière | Same two results | The proposed row has no `catfish` alias or display term. |
| `yellow catfish`; `Pimélode des marais`; `silure jaune`; *A. natalis* | None | None | CFIA name alternatives and the scientific name are not proposed as picker terms. |

The projection does not make a generic `bullhead` or `barbotte` query resolve to one species. It also does not make the `catfish` query return this species because that broad alternative label is not retained in the row. If a Québec-facing consumer product later appears under one of CFIA’s other names, review that exact label before adding an alias.

## Bundled recipe demand

All **114** manifest-listed recipe files, all **1,123** ingredient rows, and all string values in the parsed recipe documents were scanned. The normalized whole-phrase scan covered `yellow bullhead`, `barbotte jaune`, `yellow catfish`, `Pimélode des marais`, `silure jaune`, *Ameiurus natalis*, *A. nebulosus*, `brown bullhead`, `barbotte`, `barbottes`, `bullhead`, `catfish`, `stonecat`, `barbotte des rapides`, `channel catfish`, and *Ictalurus punctatus*.

**Result: zero candidate or neighboring-name hits in recipe files and zero matching ingredient rows.** The bundle therefore supports no recipe link, form, product state, amount, or contextual substitute for yellow bullhead. The existing generic `Cooked meat or seafood, to taste` line does not choose a fish species. Fish sauce entries are condiments and remain unrelated.

## Product state, measurements, and substitutions

- The Québec freshwater-fish poster shows **200–300 mm** as a biological identification length range for *A. natalis*. It is not a food portion, fillet weight, edible yield, or count-to-mass conversion. [S03]
- The live Québec commercial overview names brown bullhead among principal freshwater commercial species; it does not name yellow bullhead. Aliments du Québec currently lists eviscerated, skinned, and skinless frozen fillet products under **Barbotte** from Lac Saint-Pierre. OQLF and the Québec species profile scope that local `barbotte` identity to *A. nebulosus*. The product listing’s `4.54 vrac` is unit-unspecified and belongs to the brown-bullhead item; neither the product forms nor this quantity transfer to *A. natalis*. [S04–S06]
- CFIA’s species-specific labelling names establish a Canadian fish-name boundary, not retail availability or culinary measures. The Health Canada searchable CNF interface identifies itself as the 2015 publication and says it is not being updated; targeted searches did not retrieve a yellow-bullhead-specific serving. Do not reuse a generic catfish, bullhead, or other fish CNF portion. [S01, S08]
- No evidence supports a default density, volume mapping, edible fraction, fillet or package measure, preparation form, cooking yield, or conversion for this candidate. Keep all numeric and form fields unset.
- No bundled recipe or reviewed current source establishes a method- and quantity-scoped substitution to brown bullhead, channel catfish, or another fish. Keep global and contextual substitutions inactive; do not infer equivalence from family membership or overlapping market words.

## Proposal outcome

Root disposition (2026-10-13): accepted and integrated **yellow bullhead / barbotte jaune**, *Ameiurus natalis*, in `PROTEIN` with empty alias arrays. The qualified displays preserve both results for broad `bullhead` and `barbotte` searches, and do not reassign the existing local `barbotte` product. The catalog record does not claim present Québec retail availability; the ledger keeps measurements and substitutions inactive. No forms, measures, mappings, recipe links, conversions, yields, or active substitution rules were added. No app tests or emulator checks were run because this update only adds database JSON data and catalog documentation.

## Sources

Sources accessed 2026-10-13. The eight source IDs below are registered under `ingredient-ref-yellow-bullhead` in the research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-YELLOW-BULLHEAD-20261013-S01** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [current Yellow Bullhead search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Yellow%20Bullhead) | Current results identify *A. natalis* (TSN 164041) and list Yellow Bullhead / Pimélode des marais, Yellow Catfish / Silure Jaune, and Bullhead / Barbotte Jaune. Nearby *A. nebulosus* entries include Brown Bullhead / Barbotte and Bullhead. Canadian accepted label names, not proof of present Québec inventory. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S02** | Government of Canada, [Québec Fishery Regulations, Schedule 3](https://laws.justice.gc.ca/eng/regulations/SOR-90-214/section-sched922404.html) | Current consolidated regulation lists Yellow bullhead / Barbotte jaune as *A. natalis*, separately from brown bullhead / barbotte brune and stonecat / barbotte des rapides. Regulatory species naming, not evidence of commercial sale or recipe use. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S03** | Gouvernement du Québec, [Poissons d’eau douce du Québec identification poster](https://cdn-contenu.quebec.ca/cdn-contenu/faune/documents/animaux/affiche-poissons-eau-douce.pdf) | Gives Barbotte jaune, *A. natalis*, with a 200–300 mm biological identification length range; lists brown bullhead, channel catfish, and stonecat separately. The lengths are not edible-food portions. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S04** | OQLF GDT, [barbotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198876/barbotte) | Food-fish entry maps Québec `barbotte` to brown bullhead, *A. nebulosus*, and says `barbotte brune` was not retained for Québec fish-product labeling. It does not provide a yellow-bullhead entry; used here to preserve the existing French product boundary. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S05** | Gouvernement du Québec / MAPAQ, [Permis de pêche commerciale en eau douce](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce) and [Portrait de la pêche commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-peche-commerciale) | Current pages describe Québec commercial freshwater fishing and identify brown bullhead among examples/principal species; neither names yellow bullhead as a current commercial product. This is a gap in evidence, not proof of no lawful sale. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S06** | Aliments du Québec, [Barbotte — Simmer International](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/barbotte) | Current local listing gives eviscerated, skinned, and skinless frozen-fillet `barbotte` from Lac Saint-Pierre and the unit-unspecified `4.54 vrac` wording. It does not name *A. natalis*; linked French terminology identifies the brown-bullhead product, so the presentation and amount are not transferred. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S07** | Gouvernement du Québec, [Barbotte brune species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/barbotte-brune) | Identifies *A. nebulosus*, lists yellow bullhead / barbotte jaune as a similar but separate species, and reports brown-bullhead commercial exploitation. The evidence is not applied to *A. natalis*. |
| **WP04-P-YELLOW-BULLHEAD-20261013-S08** | Health Canada, [Canadian Nutrient File food search](https://food-nutrition.canada.ca/cnf-fce/newSearch) and [search guide](https://food-nutrition.canada.ca/cnf-fce/help-aide) | The searchable 2015 CNF interface documents whole/partial-name search and its non-updated status. Targeted candidate-name searches did not retrieve a yellow-bullhead serving. Generic catfish and other fish entries are not substitutes for a species-specific portion. |

## Static checks

- Parsed the pre-integration references, forms, legacy identities, ledger, manifest, and all manifest-listed recipe JSON files; counts and exact byte hashes are recorded above.
- Recomputed the post-integration picker projection using the code’s normalization and phrase-first matching behavior; specific names select the new row while broad `bullhead` and `barbotte` searches retain both species.
- Scanned all manifest-listed recipe text and ingredient rows for the species, bilingual names, alternate labels, binomials, and adjacent catfish/bullhead terms; no match was found.
- Added the reference and research-ledger record, regenerated the Kotlin search index, and refreshed the source snapshot after the same-day sorghum-grits integration. Package, ledger, search-projection, ownership, and encoding checks passed; no app tests or emulator checks were run because this change only adds database JSON data and catalog documentation.
