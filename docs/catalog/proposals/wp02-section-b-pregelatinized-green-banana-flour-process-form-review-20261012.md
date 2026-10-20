# WP02 B9 — Pregelatinized green-banana flour form review

- **Reviewed:** 2026-10-12; sources accessed 2026-10-12.
- **Status:** Reconciled as a documentation-only hold. The scoped B9 checklist item and integration record were updated; no canonical catalog data, ledger, recipe, generated source, or application file changed.
- **Scope:** One product-state gap under WP02 Section B9: pregelatinized green-banana flour in relation to the existing `green banana flour / farine de banane verte` identity. This review does not reopen held seed flours, polvilho, manioc/cassava or tapioca products, or the separate held plantain-starch candidate.
- **Source-ID prefix:** `WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012`. A repository search found no prior prefix use. IDs below are proposal-local and were not added to the ledger.

## Recommendation

**Hold an active pregelatinized form for now. Do not create a separate ingredient reference.** The technical distinction is real: IAG’s NuBana P500 was described as pregelatinized green-banana flour, while its N100 product was a native/cook-up starch; a patent filed by IAG defines pregelatinized green-banana flour as native green-banana flour treated to partially or wholly disrupt the starch granules. [S04–S05]

The current public NuBana page lists N100 and RS65, not P500. The Canadian and Québec evidence reviewed here supports the base green-banana flour wording but does not identify a currently sold local pregelatinized SKU or establish a Québec French label for that state. The bundle has no pregelatinized green-banana flour demand. Those gaps make an active catalog form premature even though the processing state is documented. [S01–S03, S06–S08]

| Phrase or identity | Disposition | Boundary |
|---|---|---|
| `pregelatinized green banana flour` | Keep as a source-attested candidate phrase; no active form or identity yet. | A historical manufacturer-specific grade of green-banana flour, not a second botanical ingredient. [S04–S05] |
| `farine de bananes vertes prégélatinisée` | Transparent French construction for review only; do not activate. | Health Canada supports `farine de bananes vertes` for the base product, and OQLF supports `amidon prégélatinisé` for starch. Neither validates this compound flour-form label. [S01–S03, S07] |
| `instant banana flour` / `instant green banana flour` | Do not add as aliases or as names for the proposed form. | EAS 1106:2023 excludes “instant banana flour” from its green/unripe banana and plantain flour specification. It does not say that instant flour and pregelatinized flour are the same class. [S03] |
| `banana flour`, `green banana flour`, `farine de banane verte` | Retain existing ownership; do not add or move aliases. | The live identity is already `ingredient-ref-green-banana-flour`; its display and empty alias arrays remain unchanged. [S09] |
| `banana starch`, `green banana starch`, `plantain starch` | Keep outside this flour-form review. | Isolated starch is not flour. `candidate-plantain-starch` remains a separate held candidate, and broad banana/plantain wording is not used to resolve it. [S10] |

## Checklist and prior-review boundary

WP02 Section B9 remains open for preserving whole-root flour versus extracted starch and raw versus pregelatinized/precooked products. The current checklist already records a general decision that native and pregelatinized starch are processing classes, not source-neutral identities. The earlier banana/plantain flour review also records that EAS 1106:2023 excludes instant banana flour, but it does not decide whether a pregelatinized green-banana flour should be represented as a form. [S03, S11–S12]

The proposal/archive check found no focused review of the P500 product or a pregelatinized green-banana-flour form. The prior materials mention “instant banana flour” only as a scope exclusion and discuss the different plantain-starch candidate separately. This review narrows the still-open B9 question to one source-attested flour state; it does not treat the standard’s “instant” exclusion as proof of synonymy or equivalence.

## Current ownership and search behavior

Snapshot captured from the shared worktree on 2026-10-12 at 20:07 UTC. Exact phrase ownership was checked in the active references, attached forms, legacy candidates, and ledger records. Phrase normalization follows the picker’s implementation: lowercasing, Unicode/diacritic folding, punctuation and spacing normalization, complete word-phrase matching first, then partial matching. The picker search index includes active reference names/aliases and attached form labels/match terms. [S13]

| Surface | Current state | Exact findings for this candidate |
|---|---|---|
| Active reference | `ingredient-ref-green-banana-flour` is `green banana flour / farine de banane verte`, category `FLOUR_AND_STARCH`, `aliasesEn: []`, `aliasesFr: []`, `defaultDensity: null`, `unitMappings: []`. | Existing owner of the base flour only. No active name or alias owns `pregelatinized green banana flour`, `instant banana flour`, or `farine de bananes vertes prégélatinisée`. |
| Attached forms | No forms are attached to `ingredient-ref-green-banana-flour`. The 94-row forms file has no exact label or match-term owner for the candidate wording. | No active `pregelatinized` or `instant` form is available for this flour. |
| Legacy import candidates | 65 candidates. None contains the candidate phrase or a pregelatinized/instant banana-flour name. | No legacy row to promote or reconcile. |
| Research ledger | 1,586 records. The existing `ingredient-ref-green-banana-flour` record accepts the base identity and says no other alias, form, measurement, recipe link, or substitution was added. There is no exact `candidate-pregelatinized-green-banana-flour` or equivalent record ID. | The related `candidate-plantain-starch` is a separate hold, not an owner of this flour form. |

Static evaluation of the live `IngredientReferenceSearchIndex` behavior against the active references and forms gives:

| Picker query | Current result |
|---|---|
| `pregelatinized green banana flour`, `pregelatinized flour`, `instant banana flour`, `instant green banana flour` | No result |
| `green banana flour`, `banana flour`, `farine de banane verte` | `ingredient-ref-green-banana-flour` only |
| `farine de bananes vertes`, `farine de bananes vertes prégélatinisée` | No exact current result; singular and plural forms are not stemmed |
| `banana` | Five broad results: banana, banana blossom, banana ketchup, green banana flour, and plantain banana |

This is a read-only evaluation of the current picker search implementation and catalog snapshot; no emulator interaction was needed for this proposal. If a form is accepted later, searching its full source-backed phrase should return the existing green-banana-flour reference with the exact form hint. A generic query such as `banana` must retain its current broader results.

## Bundled recipe demand

The scan covered all **114 manifest-listed recipe files**, **1,123 ingredient rows**, and **753,792 recipe-file bytes**. The manifest-ordered recipe fingerprint hashes each relative recipe path, a NUL byte, its exact file bytes, and a trailing NUL byte.

Case-, accent-, punctuation-, and spacing-normalized searches found **zero full-recipe hits and zero ingredient-line hits** for `pregelatinized green banana flour`, `pre-gelatinized green banana flour`, `pregelatinized flour`, `instant banana flour`, `instant green banana flour`, `green banana flour`, `banana flour`, `farine de banane verte`, `farine de bananes vertes`, `farine de bananes vertes prégélatinisée`, and `green banana starch`.

The only ordinary-banana ingredient demand occurs in two recipes: *Air Fryer Baked Oats* has two whole/overripe-banana lines, and *Chocolate Banana Bread* has one mashed-banana line. Each line is linked to `ingredient-ref-banana`; none asks for banana flour or a processing form. No recipe link, quantity, or form inference is supported.

## Product and naming boundaries

- Health Canada’s current bilingual accepted-fibre list names `Resistant green banana starch or green banana flour` and, in French, `Amidon résistant de bananes vertes ou farine de bananes vertes`. It defines these materials as coming from raw unripe banana pulp processed by conventional physical procedures without chemical modification. This supports Canadian base-product wording and a raw/unripe scope; it is not a pregelatinized-flour product label. The recommended high-temperature warning is specifically about retaining the described fibre properties, not a general direction that every banana flour recipe must be kept raw. [S01–S02]
- OQLF prefers generic `amidon`; it describes `fécule` as more specific for starch in tubers and other underground organs. Its separate `amidon prégélatinisé` entry defines dried starch made soluble in cold water and lists technical starch synonyms including `instant starch` and `precooked starch`. That starch entry does not establish a matching flour term, nor transfer those aliases to banana flour. [S07]
- The EAC standard covers green/unripe banana and plantain flour for human consumption or food-industry use, then explicitly excludes instant banana flour. The catalogue does not define “instant” as pregelatinized. Keep both phrases distinct pending a product-level definition. [S03]
- IAG’s patent describes several pregelatinization methods (including spray drying, drum drying, or cooking followed by further processing) and says the treatment may disrupt starch granules partially or wholly. It also notes that conditions can produce different degrees of pregelatinization. That is technical and product-process evidence, not one uniform retail form specification. [S05]
- OQLF’s `banane` record uses *Musa* spp. and discusses cooking bananas/plantains as well as sweet bananas. Do not infer that a source-named green-banana flour grade is a dessert-banana-only product, and do not redirect it to the held plantain-starch candidate. [S08, S10]

The currently advertised NuBana page shows N100 and RS65 as its two specialized formats; it does not list P500. Its “ready to eat” description for RS65 is not evidence that RS65 is pregelatinized. This current range does not prove that P500 has been discontinued, but it means the strongest pregelatinized example found in this review is historical and manufacturer-specific. [S04, S06]

## Measurements and substitution limits

- Keep `defaultDensity: null`, `unitMappings: []`, and any future form-level density null. None of the reviewed sources gives a household cup-to-mass value for pregelatinized green-banana flour.
- The patent includes source-specific non-dairy yogurt formulas using NuBana P500, expressed in parts by mass. These formula amounts do not establish a reusable measure, yield, or ratio for another recipe or P500 replacement. No mass-per-volume mapping or package-yield observation is supported. [S05]
- IFT reports that the named P500 product thickened without heat and could replace gums in gluten-free muffins, cookies, and breads. This is product-specific functional guidance, not a tested global substitution ratio or a recipe-line replacement rule. It does not justify replacing flour, starch, gums, or other ingredients by a universal amount. [S04]
- Add no global or contextual substitution. A future replacement rule would need an identified product, direction, recipe role/method, and tested amount and adjustments. The bundle currently supplies no such use case.
- Add no form yet. The experimental manufacturing routes in the patent are not a consumer form taxonomy, and no Canadian/Québec recipe or product demands this state. [S05]

## Precise possible delta

**Current catalog/data delta: none.** Keep the existing `ingredient-ref-green-banana-flour` row, forms file, ledger, and recipes unchanged; do not create an ingredient ID, ledger candidate, alias, form, density, unit mapping, recipe link, conversion, yield, or substitution rule from this packet. The plan now records this narrowly scoped hold, while the broader B9 product-distinction checklist remains open. See [the integration record](../batches/wp02-pregelatinized-green-banana-flour-hold-integration-20261012/README.md).

If a current Canadian/Québec package or recipe later names pregelatinized green-banana flour and an independent Québec wording review validates the form label, the bounded possible delta is **one `IngredientForm` attached to `ingredient-ref-green-banana-flour`**: a source-supported `formCode` for `pregelatinized`, a verified English label, a verified French label, and only exact source-supported match terms. Do not create a second ingredient reference. Do not alias `instant banana flour`, generic `instant flour`, or source-neutral `pregelatinized starch` to it. Keep density and substitution fields empty unless separately evidenced. No form ID or French wording is reserved by this proposal.

## Proposal-time snapshot

Hashes are SHA-256 of exact bytes. The recipe fingerprint uses manifest order, each relative recipe path, NUL separators, and the exact recipe bytes.

| Surface | Count/state | SHA-256 or fingerprint |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,278 references | `a70f429bacc4135384d86a22060c61ab4c53fb7b017b34fb3c1bce356d34d837` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `docs/catalog/legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `docs/catalog/research-ledger.v1.json` | 1,586 records; 5,636 source entries; 4,667 distinct source IDs | `6ae3850bdebeccc7654b1f0f7e9375ed942147bf102628c1e46565a5ca5709f2` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered bundled recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Source register

All pages below were accessed on 2026-10-12. The source IDs are proposal-local, unique to this packet, and are not ledger entries.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S01** | Health Canada, [List of Dietary Fibres Reviewed and Accepted by Health Canada’s Food Directorate](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html). Names resistant green banana starch or green banana flour; defines the accepted raw/unripe-pulp, conventional-physical-process scope and includes a heat warning for retaining the stated fibre properties. | Official Canadian fibre source and English terminology, not a flour-grade standard or pregelatinized-form label. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S02** | Santé Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html). Uses `amidon résistant de bananes vertes ou farine de bananes vertes` and the same raw, unripe-pulp process description. | Official Canadian French wording for the base fibre source; it does not qualify a pregelatinized flour. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S03** | East African Community, [Catalogue of East African Standards 2025](https://www.eac.int/documents?controller=download&file=177480db-3520-4d76-b686-1a6e0438a997&name=EAC+STANDARDS+CATALOGUE+2025.pdf&task=download.file), EAS 1106:2023. The standard covers green/unripe banana and plantain flour and excludes instant banana flour. | Regional standard scope only; its public catalogue listing does not define “instant” or equate it with pregelatinized flour. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S04** | Institute of Food Technologists, [“Unpeeling the Benefits of Green Bananas,” Food Technology (August 2017)](https://www.ift.org/~/media/food%20technology/pdf/2017/08/0817_feat6_ingredients.pdf), pp. 86–87. Reports IAG’s NuBana P500 Green Banana Flour as pregelatinized, thickening without heat and capable of replacing gums in selected gluten-free applications; distinguishes N100 and N200 product descriptions. | Industry reporting of manufacturer statements from 2017, not an independent recipe trial or current Canadian package label. The separate 30% sugar-replacement demonstration is not attributed to P500. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S05** | IAG, [WO2018049242A1, “Yogurt product from high starch fruits”](https://patents.google.com/patent/WO2018049242A1/en), published 2018. Defines pregelatinized green-banana flour as native flour treated to partially or wholly disrupt the starch granules; lists different processing routes and names NuBana P500 in examples. | Patent embodiments and company-specific formulas; not a market-wide specification, household measure, or general substitution instruction. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S06** | Terova, [NuBana Green Banana Powder](https://www.terova.com/nubana). Current public product page names RS65 and N100 as its two specialized formats. | Supports only what the current page presents. P500’s absence does not prove discontinuation. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S07** | OQLF, [amidon prégélatinisé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise), updated 2004. Defines dried starch made soluble in cold water; lists `amidon gélatinisé` and technical English equivalents. | Terminology for starch only. It does not validate a pregelatinized-flour compound or attach its technical aliases to a banana ingredient. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S08** | OQLF, [banane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane), updated 1990. Pairs French `banane` with English `banana` and *Musa* spp.; its note includes both cooking bananas/plantains and sweet bananas. | Québec fruit terminology only; it does not name banana flour, its ripeness grade, or the pregelatinized state. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S09** | Existing accepted catalog/ledger decision, [WP02 B4 banana and plantain flour review](wp02-b4-banana-plantain-flour-review-20261010.md) and [independent Québec display review](wp02-regional-root-flours-quebec-display-review-20261011.md). | Prior evidence supports only the active green-banana-flour identity and its current display. It is not reused as evidence for a pregelatinized form. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S10** | Existing `candidate-plantain-starch` hold, [WP02 B3 plantain-starch Québec naming review](wp02-b3-plantain-starch-quebec-naming-hold-review-20261012.md). | Cited solely to preserve the separate plantain-starch boundary; not a second review of the hold. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S11** | WP02 active checklist, [RecipeBook global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), Section B9; see also `docs/catalog/proposals/wp02-regional-starches-open-gap-review-20261010.md`. | Establishes the open checklist question and prior process-only decision; not product naming evidence. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S12** | Live picker implementation, [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) and [RecipeEditorScreen.kt](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt). | Used to evaluate current search behavior against the snapshot, not to claim an emulator/UI test. |
| **WP02-B9-GREEN-BANANA-PREGELATINIZED-20261012-S13** | Read-only catalog snapshot captured from the shared worktree on 2026-10-12 at 20:07 UTC: active references, forms, legacy import candidates, and research ledger. Exact file counts and hashes are recorded in the proposal-time snapshot table above. | Supports phrase ownership and absence findings for that snapshot only; it is not product or terminology evidence. |
