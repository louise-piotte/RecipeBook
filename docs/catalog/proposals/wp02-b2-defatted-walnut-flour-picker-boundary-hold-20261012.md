# WP02 B2 candidate review — defatted walnut flour

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No catalog JSON, ledger, manifest, generated index, checklist, roadmap, existing proposal, or recipe was changed.
- **Scope:** One distinct B2 flour candidate: walnut flour made from walnuts with oil removed. This does not review walnut butter, walnut oil, or the chopped-walnut form.
- **Source-ID prefix:** `WP02-B2-DEFATTED-WALNUT-FLOUR-20261012`; absent from the current ledger and proposal archive before this review.

## Recommendation

**Keep the defatted product as a held candidate until the picker can preserve its process qualifier.** Current sources establish a real defatted-walnut-flour product and a Canadian French ingredient label. However, the current picker indexes every word phrase inside a display name. Adding `defatted walnut flour` would make the unqualified query `walnut flour` select that narrower product; adding `farine de noix dégraissée` would make `farine de noix` select it as well. The market sources also use unqualified `walnut flour` for finely ground whole walnuts. With no source-supported way for the present data model to keep those broad queries distinct, adding only the defatted row would imply a false equivalence.

Keep the current whole-walnut, walnut-butter, walnut-oil, and chopped-walnut entries unchanged. Do not add the unqualified names `walnut flour`, `walnut meal`, `ground walnuts`, `walnut powder`, `farine de noix`, or `farine de noix de Grenoble` as displays or aliases. Reconsider the candidate after a picker rule can return a process-qualified result only for a process-qualified query, or can leave the broad query unresolved.

The evidence-backed draft row below is the precise candidate to reconsider. It is **not** a recommendation to apply it to the live catalog under current picker behavior.

## Draft candidate fields (held; do not integrate yet)

```json
{
  "id": "ingredient-ref-defatted-walnut-flour",
  "nameFr": "farine de noix dégraissée",
  "nameEn": "defatted walnut flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Scope that draft to walnut flour whose source or label explicitly states oil removal (defatted, including a product described as partially defatted). The Québec Metro listing supplies the French label `farine de noix dégraissée` on the same product number whose English listing says `Defatted walnut flour`. OQLF lists `noix de Grenoble` and `noix` as preferred terms for the edible walnut and gives English `walnut`; it does not define a flour-specific term. The Metro label is the direct Canadian French wording, not an OQLF ruling. [S01–S03]

No alias is proposed. In particular, the unqualified English market phrase `walnut flour` spans the defatted product and a full-fat, ground-walnut product. `Walnut meal`, `ground walnuts`, `walnut powder`, and the unqualified French `farine de noix` are not established as aliases for the defatted candidate. Do not add `farine de noix de Grenoble` by inference: the reviewed Québec label uses `farine de noix dégraissée`, and OQLF's entry covers the nut term rather than flour terminology.

## Why the candidate is held

The current search implementation normalizes a display name, then matches a query when its complete word phrase occurs anywhere within that display name. Thus `walnut flour` is a complete phrase inside `defatted walnut flour`, and `farine de noix` is a complete phrase inside `farine de noix dégraissée`. Aliases cannot solve this, because the broad terms arise from the canonical displays themselves. [S08]

### Bare-word picker check

At the current reference/form snapshot, the bare English query `walnut` returns exactly `ingredient-ref-walnut-butter` and `ingredient-ref-walnut-oil`. It does not return `ingredient-ref-walnuts`, because its English display is plural `walnuts`. The draft `defatted walnut flour` row would add a third result. That widens an already multi-result query but does not create a new unique-selection hazard; the singular/plural gap for the whole-walnut row already exists.

The bare French query `noix` already returns 22 references: Brazil nut, Brazil nut butter, bunya nuts, cashew butter, cashew flour, cashews, coconut, coconut beverage, coconut butter, coconut sugar, coconut vinegar, defatted coconut flour, deodorized coconut oil, macadamia nuts, nuts, pecans, pili nuts, pine nuts, virgin coconut oil, walnut butter, walnut oil, and walnuts. The draft French display would add defatted walnut flour as a 23rd result, leaving `noix` broad and ambiguous. This does not create a meaningful additional resolution risk.

The unqualified English label is process-ambiguous in the reviewed market evidence. Naturitas Canada sells a 250 g product titled `Walnut flour` and says the walnuts are defatted; its ingredient panel describes `Partially defatted ground walnuts`. HBS Natural Choice uses `Walnut Meal | Walnut Flour` for a finely ground product whose sole ingredient is walnuts and whose supplier nutrition table lists 68.5 g fat per 100 g. This second source is UK retail evidence, not Québec terminology, but it shows why the broad English term cannot safely stand for the defatted product alone. [S04–S05]

The research evidence supports product reality rather than a broad alias: Wójcik et al. specify partially defatted walnut flour from OlVita in a study recipe. A French producer likewise sells `farine de noix` made after pressing walnut kernels for oil. These process-specific sources do not establish `walnut meal` or `farine de noix` as universal names for one catalog identity. [S06–S07]

## Workspace snapshot and overlap check

Read-only shared-worktree snapshot on 2026-10-12. The current plan still has B2/B3 umbrella work open. The latest roadmap entry records the separate cashew-flour identity integration and states broader B2 remains open. Before this file was created, a search of the plan and proposal/batch archive found no walnut-flour/meal boundary review; the walnut-specific work already present concerns the whole-walnut identity and its chopped form. This candidate does not overlap the cashew identity or its measurement/substitution follow-up.

| Surface | Current snapshot |
|---|---|
| Ingredient references | 1,298 rows / 138 `FLOUR_AND_STARCH`; SHA-256 `a5857e552c35b15e206d16cd47fa14ddb257a96708bf9cb03632cccce6440195` |
| Ingredient forms | 98 rows; SHA-256 `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,606 records; SHA-256 `7ffa8fb3d2a53706143ec645edcd9fdda386c5242af16bc90cb96eb25285d720` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows; fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe fingerprint is SHA-256 over each manifest-ordered relative recipe path, a NUL byte, its file bytes, and a NUL byte, concatenated for all listed recipe files.

### Exact-key ownership and neighboring walnut entries

Exact normalized phrase ownership was checked across reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger identity records. The exact candidate keys below have no current owner. Phrase occurrences inside explanatory ledger prose are not identity keys.

| Phrase | Current exact owner |
|---|---|
| `walnut flour`, `defatted walnut flour`, `partially defatted walnut flour` | None |
| `walnut meal`, `ground walnuts`, `walnut powder` | None |
| `farine de noix dégraissée`, `farine de noix de Grenoble dégraissée`, `farine de noix de Grenoble` | None |
| `walnuts` / `noix de Grenoble` | `ingredient-ref-walnuts` |
| `noix` | `ingredient-ref-nuts` |

Current neighboring records are `ingredient-ref-walnuts` (`walnuts / noix de Grenoble`), `ingredient-ref-walnut-butter` (`walnut butter / beurre de noix de Grenoble`), and `ingredient-ref-walnut-oil` (`walnut oil / huile de noix`). The only walnut form is `ingredient-form-walnuts-chopped`, with `chopped walnuts` and `walnuts, chopped` search wording. The ledger has records for those existing identities and the chopped form, but none for walnut flour, defatted walnut flour, or walnut meal. No legacy candidate owns the proposed phrases.

### Bundled recipe demand

The manifest-ordered scan found zero occurrences of `walnut flour`, `defatted walnut flour`, `walnut meal`, `ground walnuts`, `walnut powder`, or `farine de noix` in the current recipe JSON. Two rows are linked to the whole-walnut identity:

| Recipe row | Existing wording and link |
|---|---|
| 055#10, Coffee Cake | `1 cup walnuts, chopped` → `ingredient-ref-walnuts` |
| 058#11, Queen Elizabeth Cake | `1/2 cup walnuts, chopped` → `ingredient-ref-walnuts` |

Neither row requests walnut flour. Keep both links and quantities unchanged; the corpus supports no flour form, recipe link, or measurement.

## Measurement and substitution limits

- The Canadian Naturitas product is packaged as 250 g and reports nutrition per 100 g. Neither is a kitchen volume measure or a bulk-density observation. [S04]
- HBS's per-100-g nutrition values characterize its own whole-ground meal product; they are not a density or unit conversion, and they do not transfer to the defatted product. No reviewed source provides a supported grams-per-cup value or bulk density for the proposed class. [S05]
- The 2023 bread study uses one supplier's partially defatted flour at 5–20% of the weight of a 1:1 buckwheat/flaxseed base, replacing that base flour in a formula containing psyllium, potato fiber, guar gum, yeast, and 130 mL water. That is a product- and recipe-specific experimental range, not a general flour substitution rule or a reusable recipe link. [S07]
- Naturitas says its product is suitable to replace other flours but gives no ratio or matching recipe test. Do not encode that marketing statement as a 1:1 substitution. [S04]
- Keep the draft values `defaultDensity: null` and `unitMappings: []`. Add no form, conversion, yield, package mapping, recipe link, or global/contextual substitution.

## Static validation plan if reconsidered

Before any future integration, repeat the normalized ownership scan over references, forms, legacy candidates, and ledger; ensure the candidate ID and process-qualified terms remain unique; and simulate both qualified and broad picker queries. The unqualified queries `walnut flour` and `farine de noix` must not silently resolve only to the defatted candidate. If the picker still does that, retain the hold. If accepted after the search boundary is resolved, verify the reference schema, `FLOUR_AND_STARCH` category, empty alias arrays, null density, empty unit mappings, ledger provenance, package normalization, generated-index freshness, and UTF-8/no-BOM. The AGENTS.md JSON-data exception means no app tests or emulator run is required for a future change limited to database JSON.

## Source register

All sources were accessed on 2026-10-12. Source IDs are proposal-local; no ledger entries were written.

| ID | Source and evidence | Limits |
|---|---|---|
| **S01** | Office québécois de la langue française, [Grand dictionnaire terminologique — *noix de Grenoble*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361125/noix-de-grenoble). Lists `noix de Grenoble` and `noix` as preferred terms for the edible walnut and English `walnut`. | Terminology for the nut only; no walnut-flour term. |
| **S02** | Metro Canada, [Organic Walnut Crispbreads, English product page](https://www.metro.ca/en/online-grocery/aisles/snacks/salty-snacks/crackers/organic-walnut-crispbreads/p/749544012086), product no. 749544012086. Ingredient statement includes `Defatted walnut flour* (10%)`. | Packaged-cracker ingredient evidence, not a standalone flour specification or measure. |
| **S03** | Metro Canada, [Craquelins aux noix biologiques, French product page](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/craquelins/craquelins-aux-noix-biologiques/p/749544012086), same product no. 749544012086. Ingredient statement includes `Farine de noix dégraissée* (10%)`. | Direct Canadian French product wording; the retailer cautions that labels may change. Not an OQLF terminology ruling. |
| **S04** | Naturitas Canada, [Salud Viva Walnut flour, 250 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/walnut-flour-250-g-salud-viva). The page calls the product `Walnut flour`, says the walnuts are previously defatted, lists `Partially defatted ground walnuts`, and gives nutrition per 100 g. | Canadian-facing English listing for one SKU; no Québec French display, cup measure, density, or quantified replacement ratio. |
| **S05** | HBS Natural Choice, [Walnut Meal | Walnut Flour](https://naturalchoice.co.uk/products/walnut-meal-flour). Describes fine walnut meal as flour-like, lists walnuts as the sole ingredient, and reports 68.50 g fat per 100 g. | UK retail product; supports whole-ground/full-fat meal scope and English-name ambiguity, not Québec terminology. |
| **S06** | La Belle Noix, [Farine de noix bio](https://www.labellenoix.fr/farine-de-noix-bio/). Calls the product `farine de noix` and says it is obtained after pressing walnut kernels for walnut oil. | French producer in France; process and French wording are product-specific and do not establish a Québec display preference. |
| **S07** | Wójcik et al., [*Walnut Flour as an Ingredient for Producing Low-Carbohydrate Bread: Physicochemical, Sensory, and Spectroscopic Characteristics*](https://pmc.ncbi.nlm.nih.gov/articles/PMC10486641/), 2023. Materials and methods identify partially defatted walnut flour from OlVita and describe formula-specific 5–20% replacement of a buckwheat/flaxseed flour base. | One supplier and bread formula; not a household measure, density study, or general substitution recommendation. |
| **S08** | RecipeBook, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), complete word-phrase matching. | Establishes current picker behavior only; it is not product evidence. |
