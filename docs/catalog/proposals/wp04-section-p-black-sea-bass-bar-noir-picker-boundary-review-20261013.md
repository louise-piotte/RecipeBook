# WP04 Section P — black sea bass / bar noir picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** species identity, Québec naming, catalog ownership, recipe-demand, and picker-boundary review.
- **Integration status:** The hold was accepted on 2026-10-13 and recorded in the Section P plan, roadmap, and integration README. No catalog, ledger, form, recipe, or application data changed; no tests or emulator checks were needed for this documentation-only hold.
- **Disposition:** **Hold** *Centropristis striata* outside the active reference catalog and research ledger. OQLF supports the qualified pair `black sea bass / bar noir`, but activating it would make the broader `bass`, `sea bass`, and `bar` picker queries return this candidate alone. CFIA assigns those name components to several distinct fish taxa. Keep the broad searches unresolved until the picker can preserve that scope.
- **Worktree scope:** the review added no shared catalog or forms JSON, legacy candidate, ledger, recipe, application code, or tests. The plan, roadmap, and integration README were updated to record the accepted hold.

## Candidate and prior review scope

The current Section P parent checklist still includes `sea bass` among the open fish and seafood families. Earlier packets held the generic sea-bass/bream names and identified black sea bass as a possible future species review. The later European sea bass, white bass, and striped bass packets address *Dicentrarchus labrax*, *Morone chrysops*, and *Morone saxatilis* respectively; none reviews *C. striata* as its subject.

A proposal and batch search found only comparative mentions of black sea bass in [the generic finfish gaps review](wp04-finfish-gaps-20261010.md), [the striped-bass picker review](wp04-section-p-striped-bass-picker-boundary-review-20261012.md), and [the European sea-bass review](wp04-section-p-next-finfish-gap-review-20261012-round10.md). Those mentions preserve adjacent species boundaries; they do not allocate *C. striata*, evaluate its Québec product name, or simulate its picker behavior. No dedicated black-sea-bass proposal, batch, or integrated row was found. This review does not reopen the already held species above.

## Identity and Québec naming

CFIA's Fish List associates TSN 167687 and *Centropristis striata* with `Black Sea Bass / Fanfre Noir`; it also lists a separate French-only `Bar noir` row for that same taxon. The list identifies these as fish-label common names linked to scientific names and TSNs. That is species-name evidence, not a culinary equivalence rule.

OQLF's GDT entry is in both zoology/ichthyology and edible-fish terminology. It gives **bar noir** as the preferred Québec term and directly pairs it with English **black sea bass** and *Centropristis striata*. Its note says the species has commercial potential in Québec; that is not evidence of current stock by itself.

La Mer, a Montréal fish market, provides current Québec-facing product evidence under the English product title **Black Sea Bass** and French listing **Bar noir**. Its English product page offers a 1 kg format with scraped-and-gutted, whole, fillet, and steak cuts; the description says a 1.2 kg minimum weight. The current French whole-fish listing also shows `Bar noir`. The retailer page does not give the scientific name, so it supports local naming and a seller-specific presentation, while OQLF and CFIA support the taxon association. Its English 1 kg format and 1.2 kg minimum do not form a standard household measure. An older French-language product-page capture for the same product path shows 800 g; treat these varying seller values as product-specific and inconsistent, not as a recipe conversion.

OQLF records `fanfre noir` as a France/Europe term and says `fanfre noir`, `achigan noir de mer`, and `perche noire` were not retained by the Fish Products Terminology Committee. It lists `blackfish` and `black jewfish` as English terms. These terminology entries are not a reason to add aliases. Keep all of those strings, the CFIA `Fanfre Noir` label, and the scientific name inactive in the app picker while the identity is held. If a future row is accepted, `black sea bass / bar noir` is the supported qualified display pair; do not shorten it to `bass` or `bar`.

### Exact CFIA scope overlap

The ambiguity is in the shared query words, not in a claim that CFIA assigns the exact full label `Black Sea Bass` to multiple taxa. The current Fish List ties these distinct names to different species:

| CFIA taxon and TSN | Listed English / French name rows relevant to the broad query |
|---|---|
| *Centropristis striata* — 167687 | `Black Sea Bass / Fanfre Noir`; separate French-only `Bar noir` |
| *Dicentrarchus labrax* — 170317 | `Sea Bass / Bar Commun` |
| *Lateolabrax latus* — 643281 | `Blackfin Sea Bass / Bar à nageoires noires` |
| *Lateolabrax japonicus* — 167951 | `Asian Seabass / Bar d'Asie` |
| *Morone saxatilis* — 167680 | `Striped Bass / Bar d'Amérique`; separate French-only `Bar Rayé` |
| *Morone chrysops* — 167682 | `White Bass / Bar Blanc` |
| *Ambloplites rupestris* — 168097 | `Rock Bass / Crapet de Roche` |

The exact English phrase and Québec French term can identify *C. striata* in a curated taxonomy, but the component queries `bass`, `sea bass`, and `bar` span or are used for other taxa in the official Canadian list. An active single species row would make those broader words look resolved before the other species or a generic scope is available in the picker.

## Refreshed ownership and recipe audit

The snapshot below was read before drafting. File digests are SHA-256 over exact bytes. The recipe-corpus digest hashes every manifest-listed relative path, a NUL byte, the recipe's exact bytes, and a NUL byte in manifest order.

| Artifact | Current size | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,330 references | `160e2a43bd4626bf60f428e49102f80c7c0cfad59e0c1a444ea98d8767d48ede` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `docs/catalog/legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `docs/catalog/research-ledger.v1.json` | 1,638 records; 6,108 source entries / 5,123 distinct source IDs; 8 unit conversions | `a5b97343b8b82a3d314bc49261df3779718691e2d93354ed40fc2eaa0b0bf264` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 recipes / 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Active global catalog plan | Section P parent remains open; see `docs/RecipeBook-global-ingredient-catalog-plan.txt` | `7f34d727b14fa729e7107c50cfd44b901b0a0aaa693f4d2cd6cfb9f2fc8707de` |

Using the picker normalization (lowercase, Unicode decomposition and accent folding, punctuation-to-space, and collapsed whitespace), whole-value checks across all string values in active references, forms, legacy candidates, and ledger evidence found no exact owner for `ingredient-ref-black-sea-bass`, `candidate-black-sea-bass`, `black sea bass`, `bar noir`, *Centropristis striata*, `fanfre noir`, `blackfish`, `black jewfish`, `achigan noir de mer`, or `perche noire`. No exact source-ID prefix `WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013` occurs in the existing proposal/batch files or ledger. There is no active reference for an existing form to attach to, and no prior ledger allocation for this candidate.

All 114 manifest-listed recipe JSON files and all 1,123 `ingredients[]` rows were scanned. Candidate phrases, scientific and listed names, plus the broad adjacent phrases `sea bass`, `bass`, `bar`, `perche`, and `achigan` produced **zero whole-phrase hits** in recipe JSON text and **zero ingredient-row hits**. The bundled library provides no recipe link, amount, preparation state, form, or recipe-scoped substitution for *C. striata*.

## Current picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the app prefers complete normalized word phrases across reference names, aliases, and attached form terms; only if none match does it fall back to substring matching. The hypothetical row below uses only the qualified display pair `black sea bass / bar noir`, with no aliases or forms.

| Query | Current picker | With hypothetical candidate | Effect |
|---|---|---|---|
| `black sea bass` | No result | `black sea bass / bar noir` only | Qualified English phrase is supported. |
| `bar noir` | No result | `black sea bass / bar noir` only | Qualified OQLF French phrase is supported. |
| `sea bass` | No result | `black sea bass / bar noir` only | The broader CFIA name component would appear resolved to this species. |
| `bass` | `bottle gourd / courge bouteille` only, via the substring `bass` in French alias `courge calebasse` | `black sea bass / bar noir` only | Phrase-first matching selects the fish and suppresses the unrelated current fallback. |
| `bar` | 26 substring-fallback rows (listed below) | `black sea bass / bar noir` only | Phrase-first matching selects the fish and suppresses all 26 current fallback rows. |

The current 26 `bar` fallback results are **Bambara beans / pois bambara; barley flakes / flocons d'orge; barley flour / farine d'orge; barramundi / barramundi; baru seeds / graines de baru; BBQ sauce / sauce barbecue; brown bullhead / barbotte; burdock / bardane; channel catfish / barbue de rivière; cream of barley cereal / crème d’orge; dried barberry / épine-vinette séchée; hulled barley / orge mondé; Malabar spinach / baselle; malted barley flour / farine d'orge maltée; narrow-barred Spanish mackerel / thazard rayé indo-pacifique; pearl barley / orge perlé; pot barley / orge en pot; prickly pear / figue de Barbarie; puffed barley / orge soufflée; quick-cooking barley / orge à cuisson rapide; rhubarb / rhubarbe; roasted barley flour / farine d'orge torréfiée; sambar powder / poudre de sambar; sprouted barley, dried / orge avec écorce germée séchée; white perch / baret; and whole barley flour / farine d'orge entière.**

`blackfish`, `black jewfish`, `fanfre noir`, `achigan noir de mer`, and `perche noire` currently return no result. They would remain absent in the hypothetical projection because this proposal does not activate them as aliases. The picker does not show the other CFIA species in the query results because their names are not active rows; their absent rows do not make bare `bass`, `sea bass`, or `bar` a safe species-specific search.

## Measures, forms, and substitutions

Health Canada's accessible 2015 online Canadian Nutrient File has food code 3056, **“Fish, sea bass, mixed species, raw”** / **“Poisson, bar commun (serran), espèces diverses, crues.”** It reports 132.7 g per fillet, a 90 g Food Guide serving, and 62% total refuse. This is a mixed-species record, not a measurement assigned to *C. striata*. Do not attach it as a black-sea-bass default, count weight, or edible-yield rule.

The 2026 CNF release is published as a Canadian dataset with food-name and measure-weight resources, but the downloadable tables could not be inspected through the available browser. The accessible 2015 search interface is explicitly an older publication that Health Canada is not updating. No species-matched 2026 measure was verified here; treat that evidence as unresolved, not as proof that no record exists.

The La Mer page's 1 kg format, stated 1.2 kg minimum, older French-page 800 g display, and offered whole/cleaned/fillet/steak cuts are seller-specific presentation details. They do not establish a common recipe serving, density, volume measure, whole-to-fillet yield, or conversion. No source reviewed supports a directed substitution from *C. striata* to European sea bass, white bass, striped bass, another fish, or a generic “white fish.” Add no form, unit mapping, density, conversion, yield, or global/contextual substitution. Do not infer cooking, curing, storage, or raw-consumption equivalence from shared market words or related taxa.

## Sources

Sources were accessed 2026-10-13. These source IDs are proposal-local and are not ledger records.

| Source ID | Source | Finding and limit |
|---|---|---|
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S01** | CFIA, [Fish List search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists *C. striata* as `Black Sea Bass / Fanfre Noir` plus French-only `Bar noir`, and links TSN 167687 to that taxon. The same list assigns `Sea Bass / Bar Commun`, `Blackfin Sea Bass / Bar à nageoires noires`, `Asian Seabass / Bar d'Asie`, `Striped Bass / Bar d'Amérique`, `White Bass / Bar Blanc`, and `Rock Bass / Crapet de roche` to separate taxa. These are Canadian fish-label names, not evidence of culinary equivalence. |
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S02** | CFIA, [Guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | States that the Fish List is a collection of English/French names recognized for fish labeling and that its scientific names are verified with ITIS. Regulatory naming scope, not a recipe or substitution source. |
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S03** | OQLF, GDT, [bar noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198928/bar-noir) — last updated 2011 | Preferred Québec edible-fish term; directly pairs `bar noir`, `black sea bass`, and *Centropristis striata*. Records regional/contextual terms and notes which French names were not retained by the Fish Products Terminology Committee. Terminology evidence, not current retail inventory. |
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S04** | Poissonnerie La Mer, [Black Sea Bass product page](https://www.lamer.ca/en/products/bar-noir-entier) and [older French-language product-page capture](https://www.lamer.ca/products/bar-noir-entier) | Montréal fish-market product uses the English title `Black Sea Bass`; the newer English snapshot shows a 1 kg selected format and 1.2 kg minimum-weight statement, while an older French snapshot for the same path shows 800 g. It offers whole/cleaned/fillet/steak cuts and does not identify the Latin species. These are inconsistent, seller-specific presentations, not a common measure or yield. |
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S05** | Poissonnerie La Mer, [French whole-fish listing](https://www.lamer.ca/collections/poissons-entiers) and [Notre poissonnerie](https://www.lamer.ca/pages/notre-poissonnerie) | Current French-facing listing shows `Bar noir` and describes the retailer as serving Montréal. This supports Québec market naming; it does not name the taxon or guarantee real-time stock. |
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S06** | Health Canada, [CNF serving-size record, food code 3056](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3056) | Reports 132.7 g per fillet, a 90 g Food Guide serving, and 62% refuse for mixed-species raw sea bass / bar commun. Not species-specific to *C. striata*; do not use as its default or yield. |
| **WP04-P-BLACK-SEA-BASS-BOUNDARY-20261013-S07** | Health Canada, [2015 CNF search interface](https://food-nutrition.canada.ca/cnf-fce/newSearch) and [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | The old interface identifies itself as the 2015 publication and says it is not being updated; the 2026 release provides downloadable food and measure data. The 2026 tables could not be inspected in this review, so a species-specific current measure remains unverified. |

## Recommendation

**Hold** the prospective `ingredient-ref-black-sea-bass` row outside the active reference catalog and ledger. The identity and qualified bilingual pair are well supported, and **`bar noir` is a safe qualified French display for this species**. It is not safe to activate that row in the current picker: its English display contains the broad token `bass`, while its French display contains the broad token `bar`; either query would return this species alone and suppress current unrelated fallback rows while the CFIA list documents other species under those shared components. Keep `blackfish`, `black jewfish`, `fanfre noir`, `achigan noir de mer`, `perche noire`, the scientific name, all forms, and all numeric/substitution behavior inactive. Revisit after picker behavior can preserve the broader query scope; recheck ownership, recipes, and projection before any future allocation.
