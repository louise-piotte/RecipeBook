# WP06 African regional gap review R493 — calabash nutmeg

- **Date:** 2026-10-17
- **Status:** Proposal only. This review writes only this file; no shared catalog, ledger, plan, roadmap, workflow, manifest, generated file, recipe, or code was changed.
- **Scope:** One West African seed-spice identity, checked against active ingredient/form/legacy/ledger ownership, phrase-first search, and the full bundled recipe corpus.
- **Recommendation:** Add identity-only `calabash nutmeg / muscade calebasse` as `ingredient-ref-calabash-nutmeg` in `BAKING_AND_SPICE`. Add `African nutmeg` as an English alias and `fausse muscade` as a French search alias. Keep it distinct from ordinary nutmeg (`Myristica fragrans`), grains of Selim, grains of paradise, and other African spices. Add no forms, measures, densities, mappings, conversions, recipe links, or active substitution rules. Record Kew's qualitative West African nutmeg-replacement statement as a source-scoped ledger finding only. The French display is source-attested but remains provisional pending Québec terminology review.

## Why this is an open regional gap

The global plan's Section 05 still leaves North, West, Central, Horn, East, and Southern African cuisine coverage open. The recent [R488–R490 integration](../batches/wp03-wp04-wp06-r488-r490-gap-review-integration-20261017/README.md) resolved Chex, canned cod liver, and shiro powder; it did not cover this spice. The same day's bounded Africa work added shiro powder after the earlier ugu, grains-of-Selim, baobab-leaf-powder, and dried-Gnetum reviews. This packet reviews a separate West African seed spice, not a country or continental coverage claim.

Kew accepts *Monodora myristica* and says its aromatic seeds are used in Africa as a spice; it specifically reports that the seeds are widely used in West Africa as a substitute for nutmeg in soups, stews, and cakes. Ghana's national report lists *M. myristica* as calabash nutmeg and lists it separately from *Myristica fragrans* nutmeg. A University of Cape Coast pharmacognosy profile also gives African nutmeg as a common name. These sources support one distinct spice-seed identity and a qualitative, region- and dish-bounded substitution finding. They do not establish a standard culinary dose, preparation method, broader substitution rule, or universal set of local names. [S01–S03, S05]

## Live package snapshot and ownership audit

Counts and hashes were refreshed from the shared worktree on 2026-10-17. The recipe-corpus fingerprint follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and a NUL byte.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,769 references | `8cccbeabdd1287821b0bbb1158c8cfdfde245a8b9925c4142eaf160b26a2af8d` |
| `ingredient-forms.v1.json` | 143 forms | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,127 records; 9,725 source entries; 8,241 distinct source IDs; 6,954 distinct URLs | `9ea8e1c813abf3b08d3b845b15db6435a24bd7b4c1249bb809895e217635f1b2` |
| `manifest.v1.json` | 114 recipe paths | — |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,988 aggregate bytes | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The proposed reference ID `ingredient-ref-calabash-nutmeg`, proposal path, and source-ID prefix `WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S` are absent from the active references, forms, legacy candidates, ledger IDs, and proposal/batch archive. Exact normalized phrase checks found no active reference, form, legacy, or ledger owner for `calabash nutmeg`, `African nutmeg`, `Monodora myristica`, `muscade calebasse`, or `fausse muscade`. The active `ingredient-ref-nutmeg` is the sole exact owner for `nutmeg`, `ground nutmeg`, and French `muscade`; it is a different species. No dedicated prior calabash-nutmeg packet was found. The 2026-10-16 prekese proposal mentions *M. myristica* only as a separate Ghanaian spice boundary; its shared Ghana report source is already owned and should be reused, not duplicated. Recheck these owners at integration.

The new source URLs listed below and R493 source-ID prefix were absent from the live ledger. The Ghana country report URL is already represented by source ID `WP06-PREKESE-IDENTITY-20261016-S03` under the existing prekese and grains-of-Selim records; reuse that source entry if needed rather than adding a duplicate. No new ledger entry is part of this proposal.

## Identity, naming, and boundary

| Proposed reference ID | English display | fr-CA display | Category | Aliases |
|---|---|---|---|---|
| `ingredient-ref-calabash-nutmeg` | `calabash nutmeg` | `muscade calebasse` (provisional) | `BAKING_AND_SPICE` | EN: `African nutmeg`; FR: `fausse muscade` |

The food identity is the aromatic seed spice of *M. myristica*. Kew documents the seeds as the economically important culinary part; the display names describe the spice, not the whole fruit, pulp, tree, or a prepared blend. The Ghana report's list of regional spices separates *M. myristica* / calabash nutmeg from *Myristica fragrans* / nutmeg. The French EU commodity list maps `Muscade calebasse/Fausse muscade` to *M. myristica*. OQLF's entry for `noix de muscade` maps that Québec French term to *Myristica fragrans*, so this proposal does not reuse `noix de muscade` as a French alias. Targeted OQLF searches did not surface an entry for *M. myristica* or `muscade calebasse`; this is not proof no such entry exists. Keep the proposed French label provisional. [S01–S04]

| Term or product | Disposition | Boundary |
|---|---|---|
| Calabash nutmeg / *Monodora myristica* seed spice | Add one identity-only spice reference. | Sources establish the species, seed spice, and regional food use. The row does not assert a particular milling or retail state. |
| `African nutmeg` | Add as one English alias. | University of Cape Coast source names it for *M. myristica*; it is narrower than bare `nutmeg` in the catalog. |
| `muscade calebasse` / `fausse muscade` | Use as provisional French display and one alias. | The species-specific wording appears in the EU commodity list, not an OQLF preference ruling. |
| Ordinary nutmeg / `noix de muscade` / *Myristica fragrans* | Keep on `ingredient-ref-nutmeg`. | OQLF identifies its French term with *M. fragrans*. Kew's narrow replacement-use report is recorded separately; it does not make the species identical or establish general interchangeability. |
| `ehuru` and other source-local names | Do not activate in this proposal. | Nigerian literature reports several local names with regional scope. `ehuru` is a useful follow-up candidate, but this review does not establish its Québec display or alias safety in the current partial-match picker; the related spelling `ehu` is also documented as a different close relative. |
| `Jamaican nutmeg`, `false nutmeg`, botanical synonyms, extracts, and prepared spice blends | Do not add as aliases or forms. | Caribbean use, older commodity wording, processed extracts, and blended pepper-soup products need separate, product-scoped review. |
| Grains of Selim (*Xylopia aethiopica*), grains of paradise (*Aframomum melegueta*), prekese (*Tetrapleura tetraptera*), and African pepper (*Piper guineense*) | Keep distinct. | Ghanaian sources list these as separate species/products. No equivalence or substitution is proposed. |

## Live phrase-first picker projection

The projection follows `IngredientReferenceSearchIndex`: normalize case, accents, punctuation, and spacing; return whole normalized word-phrase matches across the result set when any exist; otherwise fall back to substring matching. The proposed display and aliases were added only for this read-only projection.

| Query | Current result | With proposed row |
|---|---|---|
| `calabash nutmeg` | No result | `ingredient-ref-calabash-nutmeg` |
| `African nutmeg` | No result | `ingredient-ref-calabash-nutmeg` |
| `muscade calebasse` | No result | `ingredient-ref-calabash-nutmeg` |
| `fausse muscade` | No result | `ingredient-ref-calabash-nutmeg` |
| `nutmeg` | `ingredient-ref-nutmeg` | `ingredient-ref-nutmeg`, `ingredient-ref-calabash-nutmeg` |
| `muscade` | `ingredient-ref-nutmeg` | `ingredient-ref-nutmeg`, `ingredient-ref-calabash-nutmeg` |
| `ehuru` | No result | No result |
| `ehu` | Desi chickpeas and urad beans (substring matches in `dehulled` / `dehusked`) | Unchanged; no `ehu` or `ehuru` alias is added |

The exact product phrases are specific; broad nutmeg searches intentionally become two-result queries with the species-qualified labels. The current short `ehu` query already returns Desi chickpeas and urad beans because `ehu` appears inside `dehulled` and `dehusked`; this proposal leaves those existing substring results unchanged. Keeping `ehuru` outside the alias set avoids adding calabash nutmeg to that broad query until the regional naming and picker behavior are reviewed together.

## Bundled recipe demand

Every manifest-listed recipe file was parsed in full, including serialized recipe text, all ingredient fields, and linked reference IDs: **114 files and 1,123 ingredient rows**. Whole-phrase probes for `calabash nutmeg`, `African nutmeg`, `Monodora myristica`, `muscade calebasse`, `fausse muscade`, `ehuru`, `ehu`, and `pèbè` found **zero full-recipe hits and zero ingredient-row hits**. No candidate-specific line, recipe link, or relink is proposed.

The broad existing spice terms do occur as ordinary nutmeg. Recipe 048, Garam masala, and recipe 053, Carrot cake, each have a `1/2 tsp nutmeg` line linked to `ingredient-ref-nutmeg`. Neither line names calabash/African nutmeg or *M. myristica*; keep both links unchanged.

## Measurement, form, and substitution limits

No measurement evidence is proposed: keep `measurementResearchState` as `not_yet_researched` and add no density, unit mapping, conversion, household measure, or preparation yield. For substitution, the positive qualitative claim means the proposed record-level `substitutionResearchState` should be `researched_supported`, with one source-scoped `substitutionFindings` entry. Its finding state should also be `researched_supported`, from `ingredient-ref-nutmeg` to replacement `ingredient-ref-calabash-nutmeg`, citing Kew S01. Scope the context exactly to Kew's report of calabash-nutmeg seed use instead of nutmeg in West African soups, stews, and cakes. This records that a source reports the practice; it does not make the claim a tested or generally usable recipe recommendation.

Proposed ledger finding (research evidence only; do not create a `ruleId`, form link, recipe-line substitution, or active rule):

```json
{
  "findingId": "wp06-calabash-nutmeg-kew-west-african-use-r493-20261017",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-nutmeg",
  "replacements": [
    { "ingredientRefId": "ingredient-ref-calabash-nutmeg" }
  ],
  "context": "Kew reports that calabash nutmeg (Monodora myristica) seeds are widely used instead of nutmeg in West African soups, stews, and cakes.",
  "basis": "Kew directly reports this qualitative regional culinary use; it gives no replacement amount or preparation method.",
  "limitations": [
    "This is a source-scoped report of regional use, not a tested or recipe-by-recipe recommendation.",
    "Limit the finding to the stated West African soup, stew, and cake contexts; do not generalize it to other regions, dishes, methods, or all nutmeg uses.",
    "Kew names the source ingredient only as nutmeg, without specifying its species or preparation; the ledger source is the catalog's ordinary nutmeg identity.",
    "No ratio, amount, preparation form, adjustment, or expected sensory effect is established.",
    "Do not activate a global or contextual substitution rule or link it to a bundled recipe line."
  ],
  "sourceIds": [
    "WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S01"
  ]
}
```

Do not leave substitution research `not_yet_researched`: Kew provides direct positive evidence for the narrow claim above. The narrow ledger state preserves that evidence without asserting equivalence beyond Kew's stated contexts or implying a numeric replacement ratio.

If integrated, add this reference row and the separate source-scoped ledger finding above:

```json
{
  "id": "ingredient-ref-calabash-nutmeg",
  "nameFr": "muscade calebasse",
  "nameEn": "calabash nutmeg",
  "aliasesFr": ["fausse muscade"],
  "aliasesEn": ["African nutmeg"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "BAKING_AND_SPICE"
}
```

## Sources and limits

Sources were checked on 2026-10-17. Source IDs beginning `WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S` are proposal-local only. The Ghana report source below already exists in the live ledger as `WP06-PREKESE-IDENTITY-20261016-S03` and must be reused if integrated.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Monodora myristica*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:74141-1/general-information). | Accepts *M. myristica*, gives its native range from West Tropical Africa eastward to Kenya and Angola, and describes the aromatic brown seeds. Kew directly reports their use in Africa as a nutmeg substitute and says they are widely used in West Africa as a substitute in soups, stews, and cakes. Supports the proposed qualitative, context-limited ledger finding only; it gives no amount or preparation method and does not support an active general rule. |
| **WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S02** | University of Cape Coast, Department of Pharmacognosy & Herbal Medicine, [*Monodora myristica* profile](https://pharmacognosy.ucc.edu.gh/monodora-myristica). | Gives `calabash nutmeg` and `African nutmeg` as common names for this species. Only common-name evidence is used; medicinal statements on the page are outside this proposal. |
| **WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S03** | EUR-Lex, [Commission Regulation (EU) 2018/62, French text](https://eur-lex.europa.eu/eli/reg/2018/62/oj?locale=fr), Annex, commodity entry 0810090-004. | Lists `Muscade calebasse/Fausse muscade` with *Monodora myristica*. Supports species-specific French commodity wording; it is not a Québec terminology ruling or a culinary standard. |
| **WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S04** | Office québécois de la langue française, [GDT: noix de muscade](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095326/noix-de-muscade). | Identifies the preferred Québec term and species as `noix de muscade` / *Myristica fragrans*. Used only to keep ordinary nutmeg distinct. No OQLF entry for calabash nutmeg was found in the targeted query. |
| **WP06-PREKESE-IDENTITY-20261016-S03** (existing; reuse) | Ghana national authorities, [*Ghana: Country Report to the FAO International Technical Conference on Plant Genetic Resources*](https://www.fao.org/fileadmin/templates/agphome/documents/PGR/SoW1/africa/GHANA.PDF), §2.3, printed pp. 11–12 and Table 3, p. 32. | Lists *M. myristica* / calabash nutmeg among spices and separately lists *Myristica fragrans* / nutmeg. The report is historical and FAO states it is solely the Ghanaian authorities' responsibility, not verified by FAO. |
| **WP06-AFRICA-CALABASH-NUTMEG-R493-20261017-S05** | Ene-Obong et al., [“Chemical composition and antioxidant activities of some indigenous spices consumed in Nigeria”](https://www.sciencedirect.com/science/article/abs/pii/S0308814616320945), *Food Chemistry* 238 (2018), 58–64, DOI 10.1016/j.foodchem.2016.12.072. | University of Calabar and University of Nigeria authors identify *M. myristica* and source-local names including `ehuru`; the article also distinguishes the related term `ehu`. This review uses the naming only to keep those names out of active aliases because current search falls back to substring matches. Its analytical composition results are not measures, conversion data, safety advice, or substitution evidence. |

## Root-review recommendation

Accept one identity-only `calabash nutmeg / muscade calebasse` row in `BAKING_AND_SPICE`, with `African nutmeg` and the source-attested French `fausse muscade` as aliases. Keep ordinary *Myristica fragrans* nutmeg separate; leave local-language aliases, forms, numeric behavior, and recipe links out. Record Kew's West African use statement as the source-scoped ledger finding above, with record and finding states `researched_supported`, while activating no substitution rule. Keep the wider Section 05 African sweep open. This proposal changed only this Markdown file; no software tests, builds, emulator checks, or deployment were run.
