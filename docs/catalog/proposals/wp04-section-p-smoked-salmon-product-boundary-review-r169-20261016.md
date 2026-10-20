# WP04 Section P — smoked salmon product-boundary review (R169)

- **Review and source-access date:** 2026-10-16.
- **Recommendation:** Integrate identity-only `smoked salmon / saumon fumé` as `ingredient-ref-smoked-salmon`, category `PROTEIN`, with no aliases or forms.
- **Scope:** A species-neutral finished-food market group for salmon products explicitly sold as smoked salmon. It is not a salmon species, a form on a raw-salmon row, or a claim that products share species, smoke method, cure, cut, storage state, readiness, or use.
- **Status:** Proposal-only. No shared catalog or ledger JSON, generated file, plan, roadmap, batch README, recipe, or code was changed. No app/build/emulator tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S01` through `S05`; audit ID `WP04-SECTIONP-SMOKED-SALMON-R169-20261016-R01`. S01 is excluded from the recommendation and proposed ledger record; all five IDs remain unallocated pending review.

## Distinct open gap

The [active Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5914) keeps smoked, salt-cured, dried, canned, packed, and fermented seafood product states open. The [broad preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) named the OQLF term pair `smoked salmon / saumon fumé` but deferred a product row and universal smoked form without focused market evidence. Later focused work added identity-only smoked trout and smoked mackerel rows; those decisions do not cover salmon. The R47 [Gravlax-style salmon review](wp04-section-p-gravlax-style-semi-smoked-salmon-product-boundary-review-20261013-round47.md) holds one semi-smoked Grizzly SKU and bare `gravlax`; it did not decide the broader smoked-salmon market group.

Current Québec-facing product listings support the narrow group: Aliments du Québec lists cold-smoked Atlantic salmon and a separate hot-smoked salmon product, and a Québec producer markets `Saumon Fumé` separately from its mixed smoked-salmon premix. Together with OQLF's bilingual term pair, these sources establish the product category and Québec French wording. The different processes and prepared mixture show why species, process, storage, package, and composition remain product-specific. [S02–S05; reused sources below]

## Name and product-state boundary

OQLF gives **saumon fumé** as the preferred Québec French term and **smoked salmon** as its English equivalent. This terminology entry was last updated in 1984; current Québec producer and product-directory pages confirm ongoing market use. [Reused `WP04-PFSTATE-20261012-S02`; S02–S05]

The proposed identity covers only a salmon product marketed as smoked salmon. Current Québec listings show cold-smoked Atlantic salmon and a separate hot-smoked salmon product. They do not show that all smoked salmon belongs to one species or shares one process, cure, cut, storage state, ready-to-eat status, or recipe use. Do not add `Atlantic salmon`, `coho salmon`, `sockeye salmon`, `cold-smoked`, `hot-smoked`, `sliced`, `gravlax`, `gravlax style`, or `semi-smoked` as aliases. Keep those details on product-specific records when a recipe or import requires them.

Keep the raw/unspecified `salmon fillets / filet de saumon` row and the Atlantic, Chinook, chum, coho, pink, and sockeye salmon species rows unchanged. The proposed display is an app search identity, not authorization to label a particular fish product only `smoked salmon`; retain the species and condition declarations shown on commercial product labels. [Reused `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`]

Keep raw-cured gravlax distinct from smoked salmon. The Grizzly semi-smoked Gravlax-style SKU remains under the exact R47 hold; this proposal creates neither a `gravlax` alias nor a product link for it. Keep Loutre's premix of smoked salmon, olive oil, capers, and red onions separate from plain smoked salmon. Also exclude salmon jerky, smoked-salmon spreads, pizzas, and other composite products.

## Exact-key and source-ownership audit

The current snapshot contains **1,544 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,888 ledger records** with **8,078 source entries / 6,910 distinct source IDs / 5,706 distinct URLs**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact-key checks mirrored `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`, NFKD fold, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace other punctuation runs with spaces, then collapse whitespace. Checks covered reference names/aliases, form labels/match terms, legacy names/aliases, ledger record strings/IDs, source IDs/URLs, and proposal/batch archive ownership.

| Candidate phrase or key | Current exact owner | Disposition |
|---|---|---|
| `smoked salmon`; `saumon fumé`; `cold smoked salmon`; `hot smoked salmon`; `smoked Atlantic salmon`; `saumon fumé à froid`; `saumon fumé à chaud`; `saumon atlantique fumé`; `smoked salmon premix`; `gravlax` | No exact active reference, form, legacy candidate, or ledger identity field owns these terms. | `smoked salmon / saumon fumé` is unallocated. Do not add species, temperature, storage, premix, or Gravlax wording as aliases. |
| `ingredient-ref-smoked-salmon`; `candidate-smoked-salmon` | No exact active reference, form, legacy ID, or ledger record ID. | Reference ID is proposed; no legacy candidate is proposed. |
| `WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S01`–`S05`; audit `…-R01` | No exact collision in the active ledger or inspected proposal/batch archive. | S01 is excluded from evidence and ledger integration; S02–S05 and R01 remain proposal-local and unallocated. |
| `ingredient-ref-salmon-fillets-without-skin` | Active `salmon fillets / filet de saumon`; no aliases or attached forms. One bundled line, Recipe 077#10, requests 675 g of cubed salmon fillets. | Keep the generic/raw identity and its recipe link unchanged; it does not mean smoked salmon. |
| `ingredient-ref-atlantic-salmon`; `ingredient-ref-chinook-salmon`; `ingredient-ref-chum-salmon`; `ingredient-ref-coho-salmon`; `ingredient-ref-pink-salmon`; `ingredient-ref-sockeye-salmon` | Active species-qualified identities; none has a smoked form attached. | Keep each species separate. Do not assign a species to the new market group. |
| `ingredient-ref-smoked-haddock`; `ingredient-ref-smoked-mackerel`; `ingredient-ref-smoked-mussels`; `ingredient-ref-smoked-trout` | Active identities for other smoked fish/seafood products. | Retain those product boundaries; none owns a salmon key. |

One ledger substring match is not an identity owner: `WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S06` is a Metro external recipe titled “Smoked Salmon and Crab Crisp.” Its only cited quantity is 1 oz (30 g) salmon roe as garnish, not smoked salmon. The source belongs to the salmon-roe research record and is not bundled-recipe demand. The [R47 review](wp04-section-p-gravlax-style-semi-smoked-salmon-product-boundary-review-20261013-round47.md) likewise keeps its exact semi-smoked SKU and Gravlax wording separate.

S01's source ID and URL have no exact owner in the live ledger or inspected archive, but the source is excluded from this proposal's evidence and ledger delta because its page restricts reproduction/distribution of the product information. The S02–S05 URLs have no exact owner in the live ledger or inspected archive. Reused ownership is explicit: the OQLF page remains proposal-local under `WP04-PFSTATE-20261012-S02`; the CFIA fish-label page remains owned by `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`; and the Grizzly Gravlax product sources remain proposal-local under R47 S03/S04. None is newly allocated here.

## Picker projection

The projection follows phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), over bilingual reference names, aliases, and attached forms. The proposed row has only `smoked salmon / saumon fumé`, empty aliases, and no form.

| Query | Current result | With proposed row | Consequence |
|---|---|---|---|
| `smoked salmon` | No result | Smoked salmon / saumon fumé | Exact English product search finds the finished-food identity. |
| `saumon fumé` | No result | Smoked salmon / saumon fumé | Exact Québec French product search finds the same identity. |
| `salmon`; `saumon` | Seven results each: Atlantic, Chinook, chum, coho, pink, salmon fillets, and sockeye salmon | Those seven plus smoked salmon | Broad searches remain multi-result; no raw or species row is replaced. |
| `smoked` | Nine existing results | Those nine plus smoked salmon | Remains broad and multi-result. |
| `fumé` | Five existing results | Those five plus smoked salmon | Remains multi-result. |
| `Atlantic salmon`; `saumon de l’Atlantique` | Atlantic salmon | Unchanged | The species-qualified identity remains distinct. |
| `cold smoked salmon`; `hot smoked salmon`; `saumon fumé à froid`; `saumon fumé à chaud`; `smoked fish`; `poisson fumé`; `gravlax` | No exact result | No exact result | No process-specific, species-specific, generic fish, or Gravlax alias is added. |

No form hint is produced. The row improves exact product lookup without implying a smoke method, species, product composition, or ready-to-eat state.

## Manifest recipe demand

The manifest-ordered audit parsed all **114 recipe files and 1,123 structured ingredient rows**, then scanned every decoded JSON string and row value for `smoked salmon`, `saumon fumé`, species-qualified smoked salmon phrases, cold/hot-smoke variants, `gravlax`, and smoked-fish terms. It found **zero matching bundled ingredient rows and zero matching recipe files**. A broader `salmon / saumon` row search found only Recipe 077#10: `675 g salmon fillets without skin, cut into cubes`, linked to `ingredient-ref-salmon-fillets-without-skin` ([recipe file](../../../app/src/main/assets/seed/bundled-library/recipes/077-pate-au-saumon-salmon-pot-pie-b8e3b67d-3a62-4e68-8842-457c86bbab5f.v1.json)). It identifies raw fillets, not a smoked product. [R01]

No recipe link or ingredient line is proposed. The external R33-S06 recipe-title occurrence above is source text in a roe study and does not change this manifest result.

## Forms, numeric data, conversions, and substitutions

- **Forms:** No form is attached to the generic/raw salmon row or any salmon species row. Add no smoked form to those rows and no form to the proposed finished-product identity. Hot/cold smoke, cure, cut, storage, and readiness remain product-specific.
- **Package and serving amounts:** The reviewed Québec product listings include cold-smoked Atlantic formats of 125 g and 250 g (another listing is 113 g), and hot-smoked formats of 100 g and 3 kg. These are product or sales-channel package sizes, not servings, pieces, density observations, or reusable kitchen measures. Loutre's 125 g/250 g premix sizes describe a separate mixed appetizer. [S02–S05]
- **Existing salmon numeric evidence:** Some species ledger records retain source-code-specific raw, baked/broiled, or canned food values; none establishes smoked-salmon density, household mapping, or yield. The generic salmon reference has `defaultDensity: null` and `unitMappings: []`. The eight ledger unit conversions contain no salmon rule. Add no measure, default density, mapping, package conversion, thawing factor, draining yield, or cooking yield.
- **Substitutions:** The global and contextual substitution files contain zero active rules. No bundled method or dish requests smoked salmon. Add no rule, warning, amount, or recipe-line substitution link between raw salmon, species-specific salmon, Gravlax, smoked trout/mackerel/haddock, or any other fish.

## Proposed delta

Add one identity-only reference:

```json
{
  "id": "ingredient-ref-smoked-salmon",
  "nameFr": "saumon fumé",
  "nameEn": "smoked salmon",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

If accepted, record `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. The record should use S02–S05 and the reused OQLF terminology source. Exclude S01 from the record and this recommendation. Keep the source decisions limited to this species-neutral smoked-salmon market group. Add no aliases, forms, species assignments, legacy identity, recipe link, conversion, yield, or substitution. Keep all new source IDs proposal-local until integration.

## Source register

New sources were accessed on 2026-10-16. S01 is excluded and unallocated; S02–S05 are proposal-local and unallocated.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S01 — excluded** | Gouvernement du Québec / MAPAQ, [Québec Food Directory product page](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204360). | Excluded from this review's supporting evidence and proposed ledger record because the page notice restricts reproduction/distribution of its product information without the company's authorization. Do not use or reproduce product details from this page. S01 remains unallocated. |
| **WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S02** | Aliments du Québec, [Saumon Fumé Classique](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/saumon-fume-classique), Fumoir de la Loutre. | Product page describes Atlantic salmon cold-smoked with four wood types, lightly salted and matured; it lists frozen storage and 125 g / 250 g formats. Those are specific product facts, not the general row’s state or measure. |
| **WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S03** | Aliments du Québec, [Saumon fumé à chaud](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/saumon-fume-a-chaud), La Boucanerie d’Henri. | Current Québec product listing distinguishes a hot-smoked salmon product and offers body, centre, and tail portions in 100 g and 3 kg formats. Does not establish one species, package size, cut, or storage state for all smoked salmon. |
| **WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S04** | Aliments du Québec, [Saumon fumé biologique](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/saumon-fume-biologique), Fumoir la Fée des Grèves. | Describes Atlantic salmon cold-smoked; lists a 113 g format and Québec retailers. Supports another current product variant, not an Atlantic-species mapping for the proposed group. |
| **WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S05** | Fumoir de la Loutre, [current product page](https://www.laloutre.ca/). | Québec maker page currently lists plain `Saumon Fumé` Classique separately from a ready-to-serve premix containing olive oil, capers, and red onions. It says orders are made on request and products are available across Québec; availability wording is maker-specific, not a catalog property. |
| **Reused `WP04-PFSTATE-20261012-S02`** | OQLF, [GDT: saumon fumé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497427/saumon-fume), terminology entry last updated 1984. | Preferred French term `saumon fumé` and English equivalent `smoked salmon`. Reused from the broad preservation review; do not allocate a duplicate ID or claim a recent terminology update. |
| **Reused `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Fish-label naming guidance links common names to species-specific Fish List entries. The app’s proposed product-group name is not a legal label authorization. |
| **Reused R47 `WP04-SECTIONP-GRAVLAX-20261013-R47-S03/S04`** | MAPAQ / Fumoir Grizzly, exact semi-smoked Gravlax-style SKU record and maker pages, documented in the [R47 proposal](wp04-section-p-gravlax-style-semi-smoked-salmon-product-boundary-review-20261013-round47.md). | Existing proposal-local sources for the specific 100 g Atlantic semi-smoked product. Its hold and the bare `gravlax` boundary remain unchanged; do not reallocate these IDs. |
| **WP04-SECTIONP-SMOKED-SALMON-R169-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5914), recent R158/R167 proposals, prior preserved-fish and Gravlax proposals, active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), every manifest-listed recipe, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key/source ownership, source-ID/URL collision, picker projection, recipe corpus, forms/numeric/substitution, and archive audit at the snapshot counts above. |

## Final disposition

**Integrate** `ingredient-ref-smoked-salmon` as the identity-only market group `smoked salmon / saumon fumé`. Keep it separate from raw salmon fillets and each salmon species. Preserve hot/cold method, species, cure, cut, package, storage, readiness, and mixed preparations as product-specific details. Add no aliases, forms, reusable measures, conversions, yields, recipe links, or substitutions. Exact smoked-salmon queries become searchable while broad `salmon / saumon` and `smoked / fumé` searches remain multi-result.
