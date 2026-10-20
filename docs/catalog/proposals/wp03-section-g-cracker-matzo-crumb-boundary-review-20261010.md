# WP03 Section G cracker-crumb and matzo-meal boundary review — 2026-10-10

- **Packet type:** source review with accepted identity-only integration recorded below.
- **Scope:** cracker crumbs and matzo meal, with a bounded audit of the active generic breadcrumb, Graham-crumb, and panko references. Fresh/dry generic breadcrumb work remains open.
- **Disposition:** retain breadcrumb, Graham-crumb, and panko as separate products; integrate identity-only references for cracker crumbs and matzo meal. The bundled corpus has no exact cracker-crumb or matzo-meal rows to relink. Keep generic breadcrumb forms, measurements, and substitutions unresolved.
- **Access date:** 2026-10-10 for all online sources listed below.

## Checklist mapping

The [active Section G checklist](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt) has the still-open line “Fresh/dry breadcrumbs, panko, cracker crumbs, graham crumbs, matzo meal, bread cubes, and croutons.” Its panko child is checked and integrated in [the accepted panko review](wp03-section-g-panko-identity-review-20261010.md); the parent checklist line correctly remains open.

This packet supports retaining the active Graham-crumb identity and integrating distinct, identity-only references for cracker crumbs and matzo meal. It does not close the checklist: generic fresh/dry breadcrumbs, bread cubes, croutons, and other Section G families remain open. The scope excludes the integrated panko identity and its three linked rows from reconsideration.

## Live snapshot and audit method

Snapshot read on 2026-10-10. The manifest lists 114 recipe files. I scanned every ingredient row's `originalText`, `ingredientName`, and `ingredientRefId` for exact ingredient-name terms and spelling variants for Graham, cracker, matzo, chapelure, breadcrumbs, and crumbs. Instruction prose and recipe descriptions do not count as ingredient demand.

| Artifact | Current count | SHA-256 |
| --- | ---: | --- |
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 manifest-listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 869 references | `85041671d69daa5763acd9940cae78131c8ea8d8877680970f14295b9b4826e4` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 48 forms; no crumb, Graham, or matzo form match | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| [Research ledger](../research-ledger.v1.json) | 1,115 records | `68efe3269ea8b83090bd76ea3e9e558a4159245554cd604050478f37ab734129` |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus | 1,123 ingredient rows; 751,959 recipe-file bytes; 8 matching rows | Ordered digest `009a0dbd340a3e85e8a6809bc19e871f911b110357b127d55f7eb50c0cbf1055` |

The recipe digest is SHA-256 over each manifest-listed relative path, a NUL byte, and its raw file bytes, concatenated in manifest order. Local recipe links below point into the canonical seed package.

## Exact bundled ingredient rows

The scan found two generic breadcrumb rows, three Graham-crumb rows, and three panko rows. It found **zero** cracker-crumb or matzo-meal ingredient rows. Panko rows are shown only to document the exclusion; they are already integrated under `ingredient-ref-panko`.

| Row | Ingredient text and current reference | Saved quantity/detail | Recipe-local path |
| --- | --- | --- | --- |
| `006#5` | `175 g graham cracker crumbs` → `ingredient-ref-graham-cracker-crumbs` | 175 g; group `Base` | [006 Nanaimo Bars](../../../app/src/main/assets/seed/bundled-library/recipes/006-barres-nanaimo-nanaimo-bars-9a714acf-d991-4932-bb4c-63af19051022.v1.json) |
| `018#2` | `125 g bread crumbs` → `ingredient-ref-breadcrumbs` | 125 g | [018 Turkey Meatballs](../../../app/src/main/assets/seed/bundled-library/recipes/018-boulette-de-dinde-turkey-meatballs-43199cff-7fba-4cd0-8447-2c7265b0bb1c.v1.json) |
| `019#9` — **excluded** | `1 cup panko bread crumbs` → `ingredient-ref-panko` | 1 cup; `panko` preparation; group `Crab balls` | [019 Crab Balls](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json) |
| `023#2` — **excluded** | `1/2 cup panko` → `ingredient-ref-panko` | 1/2 cup; `panko` preparation | [023 Air Fried Calamari](../../../app/src/main/assets/seed/bundled-library/recipes/023-calamar-frit-a-l-air-air-fried-calamari-5fecccc1-d734-4f2b-9958-ac0c6a960f29.v1.json) |
| `026#1` | `2 cups graham cracker crumbs` → `ingredient-ref-graham-cracker-crumbs` | 2 cups | [026 Magic Cookie Bars](../../../app/src/main/assets/seed/bundled-library/recipes/026-carres-magiques-magic-cookie-bars-ff66e4f7-c719-4203-970b-06993cdb25de.v1.json) |
| `074#5` | `1 cup dried bread crumbs` → `ingredient-ref-breadcrumbs` | 1 cup; preparation is `dried` / `séché` | [074 Meatloaf](../../../app/src/main/assets/seed/bundled-library/recipes/074-pain-de-viande-meatloaf-35267f47-fcd6-4d69-9124-c6e8ac85aa57.v1.json) |
| `081#1` | `1 1/2 cups graham cracker crumbs` → `ingredient-ref-graham-cracker-crumbs` | 1 1/2 cups; group `Crust` | [081 Pistachio Coconut Amaretto Cheesecake](../../../app/src/main/assets/seed/bundled-library/recipes/081-pistachio-coconut-amaretto-cheesecake-c838fd50-8230-4df7-bc03-a90f3928c39a.v1.json) |
| `087#4` — **excluded** | `1 cup panko bread crumbs` → `ingredient-ref-panko` | 1 cup; note `panko` | [087 Chicken Parmesan](../../../app/src/main/assets/seed/bundled-library/recipes/087-poulet-parmesan-chicken-parmesan-c68bebce-c549-4789-a5b4-d023ed58f782.v1.json) |

Do not reinterpret row `074#5` as a new dry form or a separate dry-crumb reference. Its source text and structured preparation preserve the dried state at the recipe line; there is no fresh-breadcrumb row in the bundle. The three panko rows are intentionally not repeated as open demand.

## Current identities, aliases, and collisions

Exact live references checked:

| Active ID | English display / aliases | French display / aliases | Current disposition |
| --- | --- | --- | --- |
| `ingredient-ref-breadcrumbs` | `bread crumbs`; `breadcrumbs`, `dried bread crumbs` | `chapelure`; none | Retain for generic bread-derived crumbs. Ledger identity is `unreviewed`; measurements and substitutions are `not_yet_researched`. Keep the dried descriptor on row `074#5`; the alias is not an active dried form. |
| `ingredient-ref-graham-cracker-crumbs` | `graham cracker crumbs`; no aliases | `chapelure de biscuits graham`; `chapelure de gaufrettes Graham` | Retain as a distinct sweet Graham-biscuit crumb product. Ledger identity is `unreviewed`; measurement is `blocked_pending_evidence` after source-less draft values were removed. Current Québec French usage supports both stored phrases. |
| `ingredient-ref-panko` | `panko bread crumbs`; `panko`, `panko breadcrumbs`, `Japanese breadcrumbs`, `Japanese bread crumbs` | `chapelure panko`; `panko`, `chapelure japonaise` | Already verified and integrated. Preserve its identity and three exact rows; no re-opening. |

At the proposal snapshot, no active exact normalized key existed for `cracker crumbs`, `cracker meal`, `chapelure de craquelins`, `matzo meal`, `farine de pain azyme`, or `chapelure azyme`. Integration now assigns the first three phrases to `ingredient-ref-cracker-crumbs` and the latter two product terms to `ingredient-ref-matzo-meal`. The relevant generic keys remain owned by `ingredient-ref-breadcrumbs`; Graham's display and alias remain owned by `ingredient-ref-graham-cracker-crumbs`. No exact alias collision was found.

The legacy file has one adjacent candidate, `ingredient-ref-bread-crumbs` (`bread crumbs` / `chapelure`), with no aliases. Its ledger record is unresolved because it is absent from the active seed. Reconcile or merge this candidate into the already active `ingredient-ref-breadcrumbs`; do not create a second generic breadcrumb identity. No legacy Graham, cracker-crumb, or matzo-meal candidate was found.

## Identity recommendations and fr-CA displays

| Recommendation | Candidate or active ID | Proposed English display and aliases | Proposed French display and aliases | Boundary |
| --- | --- | --- | --- | --- |
| **Retain; verify terminology** | `ingredient-ref-breadcrumbs` | `bread crumbs`; retain `breadcrumbs` and current searchable alias `dried bread crumbs` | `chapelure`; no new aliases | OQLF defines *chapelure* as dried bread crumb or crust reduced to powder. Do not merge with cracker-, Graham-, matzo-, or panko-derived products. Keep fresh/dry states open. |
| **Retain; verify terminology** | `ingredient-ref-graham-cracker-crumbs` | `graham cracker crumbs`; no new English alias | `chapelure de biscuits graham`; retain `chapelure de gaufrettes Graham` | Local Canadian product labeling and French recipes attest the primary term; Eagle Brand also uses the current stored alias verbatim. Preserve as its own biscuit-derived product, not an alias of plain cracker crumbs. |
| **Already accepted; exclude** | `ingredient-ref-panko` | `panko bread crumbs`; keep existing aliases | `chapelure panko`; keep existing aliases | Panko is a separately integrated named product. Do not use its alias set or recipe rows as evidence that generic crumbs, crackers, or matzo are equivalent. |
| **Integrated; no recipe relink** | `ingredient-ref-cracker-crumbs` | `cracker crumbs`; English alias `cracker meal` | `chapelure de craquelins`; no additional French aliases | TERMIUM recognizes the English term and `cracker meal`, defines the product as crushed crackers, and gives `chapelure de craquelins`. This is separate from bread crumb, named Graham biscuit crumb, and panko identities. No bundle demand exists. |
| **Integrated; no recipe relink** | `ingredient-ref-matzo-meal` | `matzo meal`; English aliases `matzoh meal`, `matza meal`, `matzah meal` | `farine de pain azyme`; no additional French aliases | Manufacturer and food-reference evidence support a distinct ground matzo product; current French-Canadian editorial evidence supports the fr-CA display. Bare `matzo` or `pain azyme` can still surface this named product as a search suggestion because the picker searches phrases inside display names; selecting a result remains explicit. The whole bread, prepared matzo-ball mix, farfel, and finer cake meal remain distinct. No bundle demand exists. |

Both references use the existing `BAKING_MIXIN_AND_PANTRY` category. No active measurement, form, or substitution behavior was added.

### Boundary and merge decisions

- **Cracker crumbs vs generic breadcrumbs:** keep separate. TERMIUM defines cracker crumbs as crushed crackers, while OQLF's generic *chapelure* entry defines bread crumb or bread crust dried and powdered. Québec recipe use of cracker-derived crumbs does not make the products synonyms.
- **Cracker crumbs vs Graham crumbs:** keep separate. Graham crumbs retain a specific biscuit product identity with a sweetened Graham-flour formulation in current product evidence. Preserve the active Graham identity and both validated French display phrases.
- **Matzo meal vs ordinary crumbs:** keep separate. Matzo meal is meal ground from matzo, a distinct unleavened bread. A manufacturer markets it as a breadcrumb replacement, and the LCBO article says it can be used as a substitute, but neither claim supplies a universal measure, recipe scope, or risk policy. Do not create a global substitution rule.
- **Cracker crumbs vs panko:** keep separate. Panko is already verified and linked; its source-backed identity must not be treated as generic cracker crumbs or aliases.
- **Legacy generic breadcrumb:** merge/reconcile `ingredient-ref-bread-crumbs` to `ingredient-ref-breadcrumbs`; do not add another active ID.
- **Generic fresh/dry crumbs:** hold as an open form/state question. The bundle contains one dried line only, and no separate fresh product line. Keep its recipe-specific preparation and do not infer forms or conversions.

## Measurements, forms, and substitutions

No density, unit mapping, yield, form, or substitution rule is proposed. The references table currently has no density or unit mappings for the adjacent breadcrumb products, and the 48-form file has no crumb/Graham/matzo form. The recipe quantities in the table are saved recipe amounts, not calibration data. Do not calculate a cup weight from the one Graham product recipe or import a product package weight as a conversion.

For `ingredient-ref-breadcrumbs`, measurement and substitution research remain not yet researched. Graham measurement is blocked pending food/form/unit/method evidence; the current source-less density and mappings should stay removed. Panko has no supported generic volume conversion or fresh/dry state, and its prior review remains closed. The new cracker-crumb and matzo-meal ledger records keep measurement and substitution research not yet researched.

External sources mention product-specific uses, including cracker crumbs for a coating and matzo meal as a breadcrumb replacement. These are not enough to define a same-ingredient form conversion or a safe contextual substitution rule. Keep all conversions, yields, and substitutions unknown.

## Picker search expectations

Ingredient filtering returns selectable suggestions; it does not assign a result automatically. The package regression test covers these outcomes:

1. `chapelure` and `bread crumbs` continue to return `ingredient-ref-breadcrumbs`; `chapelure panko` and `panko` return the already active `ingredient-ref-panko`.
2. `chapelure de biscuits graham` and `chapelure de gaufrettes Graham` continue to return `ingredient-ref-graham-cracker-crumbs`.
3. `cracker meal` and `chapelure de craquelins` return `ingredient-ref-cracker-crumbs`. The broader `cracker crumbs` phrase returns both cracker crumbs and Graham cracker crumbs as selectable suggestions because the phrase occurs in both display names.
4. `matzo meal`, `matzoh meal`, `matza meal`, `matzah meal`, and `farine de pain azyme` return `ingredient-ref-matzo-meal`. Shorter queries `matzo` and `pain azyme` also return this named product as a selectable suggestion; they do not select or assign it automatically.
5. `dried bread crumbs` continues to resolve to the generic breadcrumb reference while the row-level `dried` / `séché` preparation remains intact; no fresh or dried catalog form is implied.
6. No identity gets a density, unit conversion, yield, form, or substitution from these wording matches.

## Remaining Section G work

The crumb checklist remains open after this integration. Generic fresh/dry breadcrumbs and bread cubes remain for future review; croutons have a separate integrated identity-only reference. The wider Section G checklist also keeps open or unresolved:

- dry/fresh, egg, whole-wheat, gluten-free, common-shape, and behaviorally distinct pasta forms;
- broader rice noodles, including flat rice noodles, rice sticks, and glass noodles distinguished by starch source;
- corn/wheat tortillas and regional breads such as pita, lavash, naan, roti, paratha, injera, flatbreads, sandwich bread, rolls, and sourdough;
- puff and rough puff, phyllo, kataifi, shortcrust, pie shells, pizza and biscuit dough, and bought choux preparations;
- rice cakes, Korean tteok, Chinese niangao, and comparable prepared starches;
- the open generic wrapper terms identified by the [wrapper boundary review](wp03-section-g-wrapper-boundaries-review-20261010.md).

The wrapper packet's accepted rice-paper, wonton, gyoza, wheat spring-roll, and egg-roll identities are integrated; generic dumpling wrappers and unqualified spring-roll terms remain held. This packet does not modify that status.

## Sources and access limits

All online sources below were accessed on **2026-10-10**. Terminology sources support names and definitions; recipe and product listings support only their source-specific wording or product. No online source was used to infer a RecipeBook unit conversion.

| ID | Source and support | Access limit |
| --- | --- | --- |
| **S01** | Translation Bureau, [TERMIUM Plus, `cracker crumbs`](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=CRACKER+CRUMBS). The indexed record lists `cracker crumbs` and `cracker meal` as correct English terms, defines the product as crushed crackers, and gives the French term `chapelure de craquelins`. | Search-result record text was accessible; direct page opening returned an internal fetch error. Used only for the term, not measurements. |
| **S02** | Office québécois de la langue française, [*chapelure* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429217/chapelure). Defines *chapelure* as dried bread crumb or crust reduced to powder and lists `bread crumbs` / `breadcrumbs`. | Directly opened. Supports generic bread-derived crumbs; it does not define cracker or matzo meal. |
| **S03** | Le Poulet du Québec, [*Poulet à l'orange croustillant*](https://lepoulet.qc.ca/recettes/poulet-a-lorange-croustillant/). Ingredient line says `chapelure de craquelins non salés, écrasés finement`; instructions use that cracker crumb to coat chicken. | Directly opened; Québec recipe usage only. Its unsalted state, fine grind, and amount are recipe-specific. |
| **S04** | Eagle Brand Canada, [FAQ on crumb crusts and biscuit crumbs](https://www.eaglebrand.ca/fr/faq). Uses `chapelure de craquelins ou de biscuits` and explains crushing crackers with a rolling pin; separately identifies Graham-biscuit crumbs for a crust. | Directly opened. Manufacturer recipe guidance is not a terminology authority or a universal crumb specification. |
| **S05** | Eagle Brand Canada, [*Carrés-rochers*](https://www.eaglebrand.ca/fr/recettes/barres-et-biscuits/carres-rochers). Ingredient line uses `chapelure de gaufrettes graham`, matching the current Graham alias. | Directly opened. Supports French usage only; its recipe amount is not a cup-to-weight conversion. |
| **S06** | Compliments, [*Chapelure de biscuits graham, 400 g*](https://www.compliments.ca/fr/products/chapelure-de-biscuits-graham-400-g/). Product display exactly matches `chapelure de biscuits graham`; listed ingredients include enriched wheat flour, Graham flour, sugars, oil, water, and salt. | Directly opened. One product label; formulation may vary by item or change over time. |
| **S07** | Manischewitz, [*Matzo Meal*](https://manischewitz.com/products/matzo-meal/). Manufacturer lists Matzo Meal under “Coating & Crumbs” and markets it as a breadcrumb replacement. | Directly opened. Product identity evidence; the replacement wording is not evidence for a general substitution rule or amount. |
| **S08** | Streit’s, [*Full Product List*](https://www.streitsmatzos.com/2021productlist). Lists `Matzo Meal` as a daily matzo-meal product distinct from matzo, gluten-free matzo meal, matzo pieces, and matzo-ball mix. | Directly opened; manufacturer lineup page is marked 2021 and is not a current formulation document. |
| **S09** | LCBO, [*À bon verre, bonne table*, printemps 2024](https://lcbofoodanddrink.cld.bz/ABVBT-Printemps2024). French editorial defines `farine de pain azyme` as coarsely ground pain azyme and distinguishes finer-ground cake meal; it says the former is used in matzo balls and may serve as breadcrumb substitute. | Directly opened. Strong French-Canadian food wording, but an Ontario publication rather than OQLF terminology guidance; its substitution statement lacks scope and amount. |
| **S10** | OQLF, [*pain azyme* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502100/pain-azyme). Defines the whole unleavened bread and preferred French term. | Directly opened. Supports the bread term; it does not define the ground meal. |
| **S11** | Cambridge Dictionary, [*matzo meal*](https://dictionary.cambridge.org/us/dictionary/english/matzo-meal?topic=bread). Defines it as crushed matzo and lists `matzoh meal`, `matza meal`, and `matzah meal` variants. | Search-result excerpt accessible; direct page returned a cache-miss. English-language lexical evidence, not French or Québec terminology evidence. |
| **S12** | Loblaws Canada, [French `matzo` product search](https://www.loblaws.ca/fr/search?search-bar=matzo). Search excerpt labels a Streit's 354 g matzo-meal item `Farine de pain azyme casher`. | Search-result excerpt only; the later direct page snapshot did not expose that exact item. Corroborating market wording, not the sole basis for the French display. |

## Source access and completion note

Online access was sufficient for the bounded product and wording decisions above. TERMIUM and Cambridge result excerpts could not be opened directly, and the Loblaws product wording was visible only in its indexed French search result; those access limits remain explicit. The two references and their evidence-ledger entries are integrated. The picker fixture description above now reflects partial phrase suggestions; package regression coverage and normalizer checks are recorded in the batch README.
