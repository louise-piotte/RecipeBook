# WP04 Section P — brown bullhead / barbotte identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only finfish identity, Québec market-name, picker, and recipe-demand review.
- **Disposition:** Integrated by root on 2026-10-12 as one identity-only `PROTEIN` reference for brown bullhead / `barbotte`, *Ameiurus nebulosus*, plus its evidence-ledger record; see [integration record](../batches/wp04-section-p-brown-bullhead-barbotte-identity-integration-20261012/README.md). Only the sourced search aliases `brown catfish` and `barbotte brune` were added. Generic `catfish` and `bullhead` remain unassigned; no forms, quantities, conversions, yields, recipe links, or substitutions were added.
- **Proposal worktree scope:** The research agent changed only this proposal file. Root made the data and plan/roadmap changes documented in the integration record. No app tests or emulator checks were run for the database-JSON addition.

## Candidate and boundary

Section P still leaves named finfish and regional fish coverage open. A scan of the current Section P proposal and batch archive found no dedicated brown-bullhead, *Ameiurus nebulosus*, or `barbotte` identity review. The earlier finfish-gap packet held a generic catfish row while advancing channel catfish / `barbue de rivière` for *Ictalurus punctatus*. This review considers a distinct, Québec-marketed species identity; it does not reopen that generic-catfish hold or expand the channel-catfish row.

The supported bounded row is:

| Proposed ID | Category | English display | Québec French display | Species | English aliases | French aliases |
|---|---|---|---|---|---|---|
| `ingredient-ref-brown-bullhead` | `PROTEIN` | **brown bullhead** | **barbotte** | *Ameiurus nebulosus* | `brown catfish` | `barbotte brune` |

OQLF’s edible-fish entry maps normalized Québec product term **barbotte** to **brown bullhead** and *A. nebulosus*. It explicitly says the longer `barbotte brune` was not retained for Québec fish-product marketing, where a single species-specific term was standardized. The current Québec product listing also uses **Barbotte** for products from Lac Saint-Pierre. Therefore `barbotte` is the proposed display; `barbotte brune` is only a source-backed internal search alias for users who know the government species-page name. The listing itself does not print a binomial, so its species linkage rests on the OQLF term mapping and Québec species evidence, not on a taxon printed on the product page. [S01, S03, S05]

The Gouvernement du Québec identifies *A. nebulosus* as brown bullhead, lists `barbotte` as an alternate French name, and reports commercial exploitation in the St. Lawrence. It distinguishes the species from yellow bullhead / `barbotte jaune`, stonecat / `barbotte des rapides`, and channel catfish / `barbue de rivière`. CFIA’s Fish List independently gives *A. nebulosus* as **Brown Bullhead / Barbotte**. The current listing by Simmer International, a Bécancour fish processor, describes eviscerated and skinned barbotte plus skinless frozen fillets, and names Lac Saint-Pierre as the source. Taken together, this is a current local food-product identity rather than a sport-fishing name alone. [S02–S06]

## Exact ownership and archive audit

I checked current references and aliases, form labels and match terms, legacy candidate names and aliases, ledger record IDs and identity records, and dedicated WP04 proposal/batch files for the proposed ID, taxon, display pair, aliases, and neighboring names. No exact current owner or prior dedicated review exists for `brown bullhead`, `barbotte`, `barbotte brune`, `brown catfish`, *A. nebulosus*, or `ingredient-ref-brown-bullhead`. No form is attached to the candidate. The existing `ingredient-ref-channel-catfish` owns **channel catfish / barbue de rivière**, which remains a separate species identity. None of the proposed source IDs below appears in the pre-existing ledger or any other proposal/batch file.

Snapshot counts and exact-file SHA-256 values below capture the live worktree before root's integration, on 2026-10-12:

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,285 references | `632470bdd715bf0ce33156c5a8f50aa07300295f3a2922e220cae711c3b4dbe1` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `docs/catalog/legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `docs/catalog/research-ledger.v1.json` | 1,592 records; 5,686 source entries; 4,717 distinct source IDs | `de2b5e50edadd552d53782300fba8c0f464c17f1df4ecb43bd8765ae90ae1073` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus digest iterates the manifest’s `recipeFiles` in stored order and hashes each UTF-8 relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte. Catalog-key normalization follows `normalizeIngredientSearchKey` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold common ligatures and `&`, remove combining marks, replace punctuation with spaces, then collapse whitespace.

The exact-key check found no reference, form, or legacy owner for the proposed identities and aliases. The word `catfish` is not an exact stored key by itself, but the current phrase picker already finds it inside the active `channel catfish` display. That substring behavior is relevant to the projected picker results below.

## Picker projection

I applied the current complete-word-phrase-first, substring-fallback search behavior to live references and attached form terms, then added the proposed display and aliases as a read-only projection:

| Query | Current result | Projected result | Match and limit |
|---|---|---|---|
| `brown bullhead` | None | Brown bullhead / barbotte | Complete phrase in the English display. |
| `barbotte` | None | Brown bullhead / barbotte | Complete phrase in the Québec French display; this is OQLF’s normalized product term. |
| `barbotte brune` | None | Brown bullhead / barbotte | Complete phrase in the search-only French alias. |
| `brown catfish` | None | Brown bullhead / barbotte | Complete phrase in the search-only English alias. |
| `catfish` | Channel catfish / barbue de rivière | Channel catfish / barbue de rivière; **Brown bullhead / barbotte** | The qualified `brown catfish` alias adds a second species result. No bare `catfish` alias is stored. |
| `bullhead` | None | Brown bullhead / barbotte | The word occurs in the qualified display, not in a stored bare alias; users still see the species name. This broad query can return only brown bullhead until other bullhead species are represented. |
| `barbue de rivière` | Channel catfish / barbue de rivière | Channel catfish / barbue de rivière | Channel catfish remains separate; no proposed name collides. |
| `common catfish`, `mudcat`, `hornpout` | None | None | Not added as aliases; the regional/alternate terms are not needed for the Québec product identity. |

The generic finfish-gap packet held broad `catfish` because CFIA applies that word across unrelated taxa and advanced only the channel-specific row. This proposal does not assign the generic English word to brown bullhead: `brown catfish` is qualified, and the broad `catfish` picker query will show two named species after integration. `bullhead` remains a broad-query limitation because it appears inside the mandatory species-qualified English display; it is not separately stored as an alias. This is the same visible-query behavior seen with other species-qualified displays and must not be interpreted as a generic bullhead identity.

## Full bundled recipe-demand scan

All 114 recipe files listed in the manifest, all 1,123 ingredient rows, and all strings in the complete recipe JSON documents were searched using whole normalized phrases for `brown bullhead`, `barbotte`, `barbotte brune`, `brown catfish`, `bullhead`, `catfish`, `common catfish`, `mudcat`, `hornpout`, *Ameiurus nebulosus*, and the obsolete combination *Ictalurus nebulosus*.

**Result: zero matching recipe files and zero matching ingredient rows.** No recipe requests this species, its local product name, or a catfish/bullhead ingredient. Nearby aquatic bundle lines remain distinct:

| Recipe / row | Ingredient text | Existing scope |
|---|---|---|
| 019 / 8 | `1 lb jumbo lump crab meat` | `ingredient-ref-crab`; crustacean meat. |
| 023 / 1 | `140 g sliced calamari` | `ingredient-ref-calamari`; mollusc. |
| 077 / 10 | `675 g salmon fillets without skin, cut into cubes` | `ingredient-ref-salmon-fillets-without-skin`; species unspecified. |
| 093 / 4 | `Cooked meat or seafood, to taste` | Unlinked generic optional text; it does not select finfish or catfish. |
| 093 / 6; 095 / 5 | `fish sauce` | `ingredient-ref-fish-sauce`; condiment. |
| 111 / 1 | `1 tuna steak` | `ingredient-ref-tuna`; species unspecified. |

There is no recipe link, recipe quantity, or contextual substitution to add. The proposed row is standalone identity coverage only.

## Product, numeric, and substitution limits

- The current Québec product page lists eviscerated, skinned, and skinless frozen-fillet products under `Barbotte`. It reports a bulk format as `4.54` without an explicit unit. Preserve that as product-page wording only; do not assume kilograms, package mass, serving size, or a general fillet weight. No product state is being promoted to a reusable ingredient form because no bundled recipe requests one. [S05]
- Québec’s species page gives body lengths commonly observed at 22–30 cm and reports that fish in the St. Lawrence can exceed 700 g. These are whole-fish biological observations, not cleaned edible mass, a portion, fillet yield, count-to-mass mapping, density, or cooking yield. [S03]
- No reviewed source supports an active measure, `g/ml` density, volume mapping, edible fraction, trim loss, package yield, or cooking conversion. Leave these unset.
- No recipe or cooking source compares brown bullhead with channel catfish or another fish using a specific method and quantity. Do not add global or contextual substitution rules; distinct family membership or a shared `catfish` query does not establish interchangeability.

## Integration record

Root integrated one `PROTEIN` reference and one identity record keyed to the same ID on 2026-10-12. No form, recipe link, number, conversion, yield, or substitution was added.

```json
{
  "id": "ingredient-ref-brown-bullhead",
  "nameFr": "barbotte",
  "nameEn": "brown bullhead",
  "aliasesFr": ["barbotte brune"],
  "aliasesEn": ["brown catfish"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "PROTEIN"
}
```

Record the identity scope as *Ameiurus nebulosus* only and cite S01–S06. Keep `catfish`, `bullhead`, `barbue de rivière`, yellow bullhead, stonecat, and other catfish taxa separate. Measurement and reusable substitution behavior remain unset; the source observations above do not meet those scopes.

## Source register

Sources were accessed on 2026-10-12. Source IDs S01–S06 were added to the shared research ledger at integration. S07 remains proposal-local and supports the neighboring-species boundary only.

| Source ID | Source and direct URL | Support and limit |
|---|---|---|
| `WP04-BROWN-BULLHEAD-20261012-S01` | OQLF GDT, [barbotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198876/barbotte) | Edible-fish and ichthyology entry; normalizes **barbotte**, translates it as catfish/brown bullhead, and assigns *A. nebulosus*. It explicitly says `barbotte brune` was not retained for Québec fish-product marketing. Terminology evidence, not a product listing. Last updated 2011. |
| `WP04-BROWN-BULLHEAD-20261012-S02` | CFIA Fish List, [brown bullhead query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Brown%20Bullhead) | Lists *A. nebulosus* as **Brown Bullhead / Barbotte** and also lists `Bullhead` for the species. Adjacent entries assign bullhead terms to other taxa, so do not store bare `bullhead` or `catfish` aliases. Canadian fish-label names, not recipe equivalence. |
| `WP04-BROWN-BULLHEAD-20261012-S03` | Gouvernement du Québec, [Barbotte brune species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/barbotte-brune) | Gives English brown bullhead, *A. nebulosus*, alternate French `barbotte`, neighboring species, St. Lawrence commercial exploitation, and whole-fish length/weight observations. Page updated 2026-10-02. Biological/profile facts are not kitchen measures. |
| `WP04-BROWN-BULLHEAD-20261012-S04` | Gouvernement du Québec, [Portrait de la pêche commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-peche-commerciale) | Current Québec fishery overview identifies brown bullhead among the principal freshwater commercial species and describes the St. Lawrence/Lake Saint-Pierre fishery. It does not give this species’ current volume, retail stock, or recipe use. |
| `WP04-BROWN-BULLHEAD-20261012-S05` | Aliments du Québec, [Barbotte — Simmer International](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/barbotte) | Current Québec product listing names eviscerated, skinned, and skinless frozen-fillet barbotte from Lac Saint-Pierre; gives bulk format `4.54` without a unit. It does not print a scientific name or establish a general product measure. |
| `WP04-BROWN-BULLHEAD-20261012-S06` | Gouvernement du Québec / MAPAQ, [Permis de pêche commerciale en eau douce](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce) | Lists brown bullhead among Québec freshwater species under commercial permits and limits sale to legally commercially caught fish destined for consumption. Regulatory/market pathway evidence, not a culinary quantity or recipe source. Page updated 2026-09-18. |
| `WP04-BROWN-BULLHEAD-20261012-S07` | Government of Canada, [Québec Fishery Regulations, Schedule 3](https://www.laws.justice.gc.ca/eng/regulations/SOR-90-214/page-8.html) | Names brown bullhead / `barbotte brune` as *A. nebulosus* under the broader `Bullhead / Barbottes` category, alongside stonecat and yellow bullhead. Supports taxonomic boundaries; the regulation is not a consumer-label or portion source. |

## Integration outcome

The Québec product name is directly standardized to *A. nebulosus* by OQLF, and current local product evidence uses that term. The qualified `brown catfish` alias makes broad `catfish` search return both brown bullhead and the existing channel-catfish identity. The `bullhead` query also finds the species-qualified English display; no generic alias is stored. Recipe demand is zero, and no numeric or substitution behavior is supported.

Static package, reference normalization, generated-index, ledger, ownership, corpus, encoding, and whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data.
