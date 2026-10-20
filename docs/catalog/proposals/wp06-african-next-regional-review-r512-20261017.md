# WP06 African regional review R512 — uziza leaves

- **Date:** 2026-10-17
- **Status:** Integrated as an identity-only catalog entry and research-ledger record; see the [R512 integration README](../batches/wp06-african-uziza-leaves-identity-integration-r512-20261017/README.md). No forms, reusable measures, conversions, yields, recipe links, or substitutions were added.
- **Scope:** One Southeast Nigerian leaf ingredient, the food-use leaves called uziza, source-identified as *Piper guineense*. The fruit/seed spice product and other *Piper* species are outside scope.
- **Recommendation:** Add identity-only `uziza leaves / feuilles d’uziza` as `ingredient-ref-uziza-leaves` in `HERB`. Use `uziza leaf` as the only English alias and no French aliases. Keep *Piper guineense* in research records under the catalog’s current scientific-name policy. Add no forms, measures, density, conversions, yields, recipe links, or substitutions.

## Open regional gap and prior decisions

The [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt) keeps Section 05’s regional cuisine sweeps open, and the [roadmap](../../../roadmap.md) records the R509 kinkeliba integration while continuing broader African coverage. This proposal is one leaf-product review, not a completion claim.

Recent African identities are distinct: R478 kuka powder, R481 dried Gnetum leaves, R484 grains of Selim, R487 ugu leaves, R490 shiro powder, R493 calabash nutmeg, R496 African basil leaves, R499 gboma leaves, R502 waterleaf, R505 garden egg fruit, and R509 dried kinkeliba leaves. None is *Piper guineense* leaf. The current African basil and other leaf rows remain separate by species and source name.

The [R493 review](wp06-african-next-regional-review-r493-20261017.md) lists African pepper (*Piper guineense*) as distinct from grains of Selim, grains of paradise, and prekese; it did not propose an uziza-leaf identity. The [R484 grains-of-Selim review](wp06-african-next-regional-review-r484-20261017.md) keeps broad `African pepper`, `Guinea pepper`, and `poivre de Guinée` source-scoped because sellers apply overlapping pepper names to different products. This proposal does not reopen those decisions or use those broad names as aliases. The [R509 kinkeliba review](wp06-african-next-regional-review-r509-20261017.md) remains integrated and separate.

## Bounded identity and names

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-uziza-leaves` |
| English display | `uziza leaves` |
| French display | `feuilles d’uziza` (provisional fr-CA wording; directly attested in Montréal-area seller copy) |
| Category | `HERB` |
| English aliases | `uziza leaf` |
| French aliases | None |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms, recipe links, conversions, yields, active substitutions | None |

The reviewed regional study names *Piper guineense* as uziza and describes the leaf as an ingredient in Southeast Nigerian pepper soup. A current Calgary specialty retailer lists `Uziza Leaves (Piper guineense)`. The Canadian French-language page from a Montréal-area seller uses `feuilles d’Uziza`. These sources support a leaf-specific name, while the display remains scoped to leaves rather than the plant or all products called uziza.

`HERB` is the proposed internal category because the cited regional source describes the peppery leaves as a seasoning in soup; the category does not extend this row to the plant’s separate fruit/seed spice.

The source evidence also shows that *P. guineense* fruits and leaves are both used for flavoring. Do not merge the seed/fruit spice with this leaf identity. Do not add bare `uziza` to an alias array; the display phrase still makes a one-word `uziza` query return this leaf result under the current picker’s word-phrase matching. A future seed identity could make that broad query multi-result. The specific query `uziza seeds` remains unassigned.

The Montréal-area page is collection copy rather than a dedicated uziza SKU, and no OQLF culinary entry or authoritative Québec term was found in the targeted search. Thus `feuilles d’uziza` is a source-attested, provisional local display, not a Québec terminology ruling. No regional language names such as `iyere` or `oziza` are needed for the proposed row.

## Duplicate, alias, and archive audit

Read-only review covered the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), live manifest and recipes, [picker search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), current workflow, plan, roadmap, and African proposal/batch archive.

The proposed reference ID is absent from active reference IDs, form IDs, legacy candidate IDs, and ledger record IDs. Exact normalized-name checks found no active reference, form, or legacy owner for `uziza`, `uziza leaf/leaves`, `feuilles d’uziza`, `Piper guineense`, `uziza seeds`, or the reviewed broad English/French pepper names. There is no current ledger record for the uziza identity. The R493 archive mention is a distinction only, not an existing candidate or row.

Relevant exact owners remain unchanged:

| Term | Current owner | Decision |
|---|---|---|
| `grains of Selim`; `poivre de Sélim` | `ingredient-ref-grains-of-selim` | Keep on the *Xylopia aethiopica* spice row. |
| `grains of paradise` | `ingredient-ref-grains-of-paradise` | Keep separate; do not transfer any pepper-like name to this row. |
| `black pepper` | `ingredient-ref-black-pepper` | Keep on the *Piper nigrum* row. |
| `Vernonia amygdalina leaves`; `onugbu`; `ewuro` | `ingredient-ref-vernonia-amygdalina-leaves` | Keep the active *Vernonia* leaf identity separate from *Piper guineense* leaves. |
| `African pepper`, `West African pepper`, `Guinea pepper`, `poivre de Guinée`, `Ashanti pepper`, `false cubeb` | No single safe active owner for the reviewed leaf product | Keep unassigned/source-scoped; these terms are broader, fruit-spice, or seller-dependent names. |
| `Piper guineense` | No active picker owner | Research-only taxon per current schema/workflow policy. |

The target file and source-ID prefix `WP06-AFRICA-UZIZA-LEAVES-R512-20261017-S` were absent before drafting. The exact candidate phrase and source-ID checks covered archived African proposals and batches, including R484 and R493. Recheck IDs, aliases, ledger URLs, and picker results before any later integration.

## Picker projection

Projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, and punctuation; return complete word-phrase matches first; then use substring fallback. It uses current references/forms plus the proposed bilingual displays and the single English alias. This is static projection, not runtime UI QA.

| Query | Current result | With proposal |
|---|---|---|
| `uziza leaves` | 0 | 1: `ingredient-ref-uziza-leaves` |
| `uziza leaf` | 0 | 1: proposed row through the English alias |
| `feuilles d’uziza` | 0 | 1: proposed row |
| `uziza` | 0 | 1: proposed leaf row, because the query is a complete word within its display phrase |
| `uziza seeds`; `uziza seed` | 0 | 0; seed/fruit product remains unassigned |
| `Piper guineense` | 0 | 0; scientific name is not an alias |
| `West African pepper`; `Guinea pepper`; `poivre de Guinée` | 0 | 0; held broad/source-scoped names remain unassigned |
| `poivre de Sélim`; `grains of Selim` | `ingredient-ref-grains-of-selim` | Unchanged |
| `grains of paradise` | `ingredient-ref-grains-of-paradise` | Unchanged |
| `pepper`; `poivre` | 34; 11 references | Unchanged; the proposed names add neither term |
| `leaves`; `feuilles` | 33; 41 references | 34; 42 references |

The phrase-specific searches resolve only to the new leaf identity. The one-word `uziza` query gains a result that visibly says `leaves`; this is a known boundary of the shared search behavior, not a proposed bare alias. The French singular `feuille d’uziza` is not added because the reviewed Québec copy uses the plural.

## Full recipe corpus and demand

The manifest snapshot contains **114 recipe files and 1,123 structured ingredient rows**, with 753,988 aggregate recipe bytes. Its fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; it hashes each manifest-ordered relative path, NUL, exact UTF-8 recipe bytes, and NUL.

All manifest-listed files and ingredient rows were scanned for `uziza`, `uziza leaf/leaves`, `feuilles d’uziza`, *Piper guineense*, `uziza seed(s)`, `West African pepper`, `African black pepper`, `Guinea pepper`, `poivre de Guinée`, and adjacent Selim/grains-of-paradise names. The scan found **zero candidate-related full-file hits and zero ingredient-row hits**. This bundled snapshot supplies no recipe demand, amount, or relink.

## Forms, measures, and substitutions

The identity should cover the source-named leaf food product without asserting that fresh, dried, frozen, or ground retail states are interchangeable. Retail pages list package weights or product options, not repeatable recipe measures; the study’s sample and lab-preparation quantities are not cooking conversions. If integrated, keep density null, unit mappings empty, and add no forms, conversions, package yields, or recipe links. A bounded ledger measurement state of `researched_no_supported_value` is appropriate for the reviewed evidence; no value is proposed for runtime use.

The sources describe culinary use, not a tested substitute relationship. Leave substitution research `not_yet_researched` unless a later focused review addresses it. Add no global or contextual rule, warning, substitute link, or inferred replacement for uziza leaves.

## Source register and source-ID ownership

The live ledger has **9,835 source entries, 8,323 distinct source IDs, and 7,033 distinct URLs**. Its global source-ID-to-URL audit found zero IDs mapped to multiple URLs. The exact URL inventory was checked against all 9,835 entries. New source IDs S01, S02, S04, and S05 each own one previously unregistered URL. S03 reuses its exact existing one-URL owner; do not create a duplicate source ID or URL entry.

| ID | Source and exact URL | Claim and limit; ownership |
|---|---|---|
| `WP06-AFRICA-UZIZA-LEAVES-R512-20261017-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Piper guineense*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:681598-1). | Accepts *P. guineense* and gives its tropical African/Madagascar native range. Taxonomy only; not a culinary name or leaf-use source. New source ID; this exact URL was unowned. |
| `WP06-AFRICA-UZIZA-LEAVES-R512-20261017-S02` | Ukom et al., [“Impact of cooking methods on the chemical and antioxidant composition of some indigenous vegetables used in different food dishes in Southeast Nigeria”](https://link.springer.com/article/10.1186/s42779-023-00170-x), *Journal of Ethnic Foods* (2023), introduction, figure description, and materials section. | Primary regional study identifies *P. guineense* as uziza, describes the leaf in pepper soups, and names it `West African pepper leaf` in sample procurement. The broad `West African pepper` phrase is not promoted as an alias; experimental nutrient/cooking data are not amounts, conversions, or substitution evidence. New source ID; this exact URL was unowned. |
| `WP05-WEST-AFRICA-VERNONIA-20261012-S02` (reuse) | FAO, [Évaluation des échanges des produits forestiers non ligneux entre l’Afrique subsaharienne et l’Europe](https://www.fao.org/4/x6612f/x6612f06.htm), §3.3.3 and market tables. | Shows that `bitter leaf`/`ndolè` market use spans several *Vernonia* species and reports that the surveyed market specimens could not be species-identified; a separate table lists Nigerian uziza leaves at *Piper* genus scope. Used only as a warning against generalizing market names. This exact URL already has one owner, source ID `WP05-WEST-AFRICA-VERNONIA-20261012-S02`, attached to `ingredient-ref-vernonia-amygdalina-leaves`; reuse that ID/URL. |
| `WP06-AFRICA-UZIZA-LEAVES-R512-20261017-S04` | Ugonwa’s, [Uziza Leaves (*Piper guineense*)](https://www.ugonwas.ca/product/uziza-leaves-piper-guineense/), Calgary, Alberta retailer page. | Current Canadian product listing ties the English leaf name to the species and states that both fruits and leaves are used for flavoring. Retailer wording is product-specific; listed package sizes are not recipe measures. New source ID; this exact URL was unowned. |
| `WP06-AFRICA-UZIZA-LEAVES-R512-20261017-S05` | Majibu, [Épices et assaisonnements africains](https://majibu.org/fr/products/african-spices-seasonings), French-language seller page serving Grand Montréal. | Collection copy lists `feuilles d’Uziza` separately from `graines d’Uda` and Ehuru. It supports one Québec-facing wording example, not a dedicated SKU, binomial crosswalk, OQLF term, or standardized Québec name. New source ID; this exact URL was unowned. |

## Proposed integration boundary and evidence limits

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-uziza-leaves",
  "nameFr": "feuilles d’uziza",
  "nameEn": "uziza leaves",
  "aliasesFr": [],
  "aliasesEn": ["uziza leaf"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "HERB"
}
```

Add a research-ledger identity record keyed by `ingredient-ref-uziza-leaves` with source IDs S01, S02, S04, and S05 plus the reused FAO source ID above. Keep taxonomy/provenance in the research record. The reviewed sources support a bounded Nigerian leaf ingredient and Canadian-market wording, but not a continent-wide alias set, a fixed product state, a Québec-standard French term, a cooking measure, a density, a substitution, or recipe-level use. Broader African regional coverage remains open.

The shared package now has 1,787 references and the ledger has 2,144 records, 9,840 source entries, 8,327 distinct source IDs, and 7,037 distinct URLs. Static package/ledger validation and generated-index freshness passed. No software tests, build, emulator, or deployment were run because the application data change only adds database JSON under `AGENTS.md`.
