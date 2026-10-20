# WP02 B9 — instant banana flour product-boundary review

- **Reviewed:** 2026-10-12.
- **Status:** Reviewed and held by root on 2026-10-12; see [hold integration record](../batches/wp02-b9-instant-banana-flour-product-boundary-hold-20261012/README.md). No catalog, ledger, recipe, generated, or application data changed; the plan and roadmap record the decision.
- **Scope:** Determine how the current BIRDC/Tooke product `Instant Tooke Flour` relates to the active green-banana-flour reference: a separate identity, a processed form, or a held product pending a verified package specification and Québec French display.
- **Checklist:** WP02 Section B9 remains open for raw versus pregelatinized/precooked distinctions. This packet does not reopen the existing green-banana-flour identity or the historical NuBana P500 form hold.
- **Proposal-local source IDs:** `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S01` through `S09`. The prefix was absent from the live ledger and archive when checked.

## Recommendation

**Hold a new form or identity for instant banana flour. Do not add generic instant-flour aliases to the active green-banana-flour row.** BIRDC currently distinguishes `Raw Tooke Flour` from `Instant Tooke Flour`. Its product page calls the latter pre-cooked through a specialized thermal process and ready to mix with hot water or milk; its FAQ says both Tooke flours use green, unripe East African highland cooking bananas. The East African standard for green/unripe banana and plantain flour explicitly excludes instant banana flour, but its catalogue does not define what “instant” means or whether the product is a form of single-ingredient flour. BIRDC directs buyers to the current package or specification for the product’s ingredients and formulation. [S01–S03]

The sources attest these **product-local names**:

| Language | Attested wording | Limit |
|---|---|---|
| English | `Instant Tooke Flour` | BIRDC brand/product name; not a generic catalog display. [S02] |
| English | `Instant Banana Flour` | Current Ugandan retailer title for a Tooke pack. It does not establish a generic market-wide identity. [S06] |
| French | `farine Tooke instantanée` | Exact wording on Tooke’s French-language product page. It is brand-specific and is not Québec product-label evidence. [S04] |
| English, technical | `instant green banana flour` | Name used for an extruded research material. This does not define the Tooke product or a retail name. [S05] |

No current Canadian or Québec product page or package for instant banana flour surfaced in the bounded search on 2026-10-12. The Québec French product wording for the instant state therefore remains unverified. Keep `instant banana flour`, `instant green banana flour`, `Instant Tooke Flour`, and `farine Tooke instantanée` unassigned in the catalog. Do not invent `farine de banane verte instantanée` or `farine de banane verte précuite` as Québec labels.

The current evidence supports a **possible pre-cooked form under `ingredient-ref-green-banana-flour`** only if a current product package confirms it is still single-ingredient green-banana flour. If the product includes carriers, other flour, or other ingredients, reassess it as a formulation-specific product instead. Do not equate “instant” with “pregelatinized”: the standard excludes instant flour without defining that class, the Tooke site describes only a specialized thermal process, and the primary study uses extrusion for its own instant flour. [S01–S05]

## Prior-work reconciliation

- The [B4 green-banana/plantain review](wp02-b4-banana-plantain-flour-review-20261010.md) records the EAS 1106:2023 exclusion of instant banana flour, but focuses on the raw green-banana and green-plantain identities. Its standard citation does not define the excluded instant product. [S01]
- The [2026-10-12 NuBana P500 review](wp02-section-b-pregelatinized-green-banana-flour-process-form-review-20261012.md) is specifically about a historical pregelatinized green-banana-flour product. It correctly says not to treat “instant banana flour” as a synonym for that proposed form. This review instead examines the current Tooke product family and does not reopen P500.
- The [live catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) still leaves the broader B9 raw-versus-precooked product distinction open. This narrow hold does not complete B9 or change the green-banana identity.

## Exact catalog, form, legacy, and ledger ownership

Read-only audit of the live shared worktree on 2026-10-12:

| Surface | Current owner/state |
|---|---|
| Active `ingredient-ref-green-banana-flour` | `green banana flour / farine de banane verte`, category `FLOUR_AND_STARCH`; no aliases, density is null, and unit mappings are empty. This is the only current flour identity that owns the base `green banana flour` phrase. |
| Active `ingredient-ref-green-plantain-flour` | `green plantain flour / farine de banane plantain verte`; aliases `plantain flour` and `farine de plantain`. Keep this distinct from green banana and instant banana products. |
| Active `ingredient-ref-banana` | Fresh `banana / banane`; its `mashed ripe bananas / purée de bananes mûres` form is a preparation of fresh fruit, not flour. |
| Active ingredient forms | No form is attached to `ingredient-ref-green-banana-flour`. No active form label or match term owns an instant, raw Tooke, pre-cooked banana-flour, or Tooke phrase. |
| Legacy import candidates | No candidate names or aliases match the reviewed instant, Tooke, or raw-banana-flour phrases. |
| Research ledger | `ingredient-ref-green-banana-flour` is identity-verified; measurement and substitution research remain `not_yet_researched`. Its sources already record the EAS instant-flour exclusion, but there is no instant-product record or `candidate-instant-banana-flour` record. No new candidate or ledger source is proposed here. |

Exact phrase ownership was checked after lowercasing, Unicode NFKD accent folding, punctuation-to-space normalization, and whitespace collapse across active reference names/aliases, form labels/match terms, and legacy names/aliases:

| Exact phrase | Current owner | Decision |
|---|---|---|
| `green banana flour` | `ingredient-ref-green-banana-flour` (`nameEn`) | Retain. |
| `farine de banane verte` | `ingredient-ref-green-banana-flour` (`nameFr`) | Retain. |
| `instant banana flour`; `instant green banana flour` | None | Keep unassigned. |
| `Instant Tooke Flour`; `TOOKE Instant Banana Flour`; `raw Tooke flour` | None | Keep as product-source wording only. |
| `farine Tooke instantanée`; `farine de banane instantanée`; `farine de banane verte précuite` | None | Do not add as aliases or labels. |
| `banana flour` | No exact stored term | The actual picker currently returns the green-banana-flour row because `banana flour` occurs as a complete word phrase within `green banana flour`. Do not add a broad alias or a second result without a validated product boundary. |

## Actual picker behavior

The ingredient picker in `RecipeEditorScreen.kt` builds `IngredientReferenceSearchIndex` with active references and forms, then calls `filterNormalized`. The implementation in `IngredientSearch.kt` first searches complete normalized word phrases across reference and form terms, then falls back to substring matching. The results below are a code-backed static replay against the live catalog and current picker implementation; no app test or emulator was run.

| Picker query | Current result |
|---|---|
| `instant banana flour` | No result |
| `instant green banana flour` | No result |
| `Instant Tooke Flour` | No result |
| `farine Tooke instantanée` | No result |
| `farine de banane verte précuite` | No result |
| `green banana flour` | `ingredient-ref-green-banana-flour` |
| `farine de banane verte` | `ingredient-ref-green-banana-flour` |
| `banana flour` | `ingredient-ref-green-banana-flour` |
| `instant` | Unrelated instant coffee, instant oats, and instant yeast references |

This proposal changes no picker terms, so the current results remain unchanged. Adding a generic instant alias to the existing green-banana row would make the instant query select a raw flour identity without indicating its state. Creating a second row would also make the already broad `banana flour` query return multiple candidates. Neither behavior is supported by the current package evidence.

## Full bundled-recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The full serialized recipe text and each ingredient row were checked for normalized phrase matches for:

`instant banana flour`, `instant green banana flour`, `Instant Tooke Flour`, `TOOKE Instant Banana Flour`, `farine Tooke instantanée`, `farine de banane instantanée`, `farine de banane verte précuite`, `raw Tooke flour`, `raw banana flour`, `matooke flour`, `green banana flour`, `farine de banane verte`, `banana meal`, and `banana starch`.

The scan found **zero candidate phrase hits in recipe text**, **zero matching ingredient lines**, and **zero ingredient rows linked to `ingredient-ref-green-banana-flour`**. Three ingredient lines across two recipes are linked to ordinary fresh `banana / banane`; one additional optional toppings note mentions bananas without a banana ingredient link. None is flour or a processed-banana demand. This scan supports no recipe link, relink, measure, or substitution.

## Numeric and substitution limits

- Keep `defaultDensity: null` and `unitMappings: []` on `ingredient-ref-green-banana-flour`; the active ledger’s measurement state remains `not_yet_researched`.
- BIRDC’s current product page gives hot water or milk as preparation context but no quantity ratio. Its current website says to consult the current package/specification for formulation and preparation details. [S02–S03]
- A Ugandan retailer lists a 250 g Tooke package and directions using 60 g flour with 200 ml boiling water for porridge. This is one product-specific porridge instruction on a third-party listing, not a household volume measure, density, generic hydration ratio, or package yield. The full package instructions are not reproduced there. Do not activate it as conversion data. [S06]
- The primary extrusion study reports technical material properties and process conditions for its extruded green-banana flour. It does not give a transferable household measure or establish that Tooke uses the same process. [S05]
- BIRDC’s wheat replacement statement applies to **Raw Tooke Flour**. The same site describes Instant Tooke Flour for hot-water/milk preparations; it provides no direct substitute claim for that product. Do not transfer the raw product’s claim to instant flour or create a raw-to-instant, wheat-to-instant, plantain-flour, starch, or fufu conversion/substitution. [S02–S03]

## Exact pre-integration snapshot

Snapshot refreshed from the live shared worktree on **2026-10-12 before any integration of this proposal**. Root-owned catalog work changed the reference and ledger surfaces during this review, so these are the final live counts and exact bytes used for the handoff. The recipe fingerprint hashes, in manifest order, each relative recipe path, a NUL byte, exact recipe bytes, and a trailing NUL byte.

| Surface | Count or scope | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,286 references | `d1beaa8f10bab6f322aff6c4994c7badc61761706916c8d324b8cd13d889aec2` |
| `ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `research-ledger.v1.json` | 1,593 records; 5,692 source entries / 4,723 distinct source IDs | `ecc7df79b2f3b32b1f8d58bcc81cfb109e76f47def60c7cde38e21b640dda863` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `IngredientSearch.kt` | Search normalization/index/filter | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |
| `RecipeEditorScreen.kt` | Picker wiring | `91aa383d7e418ef4150e86f2b3c75903ee51782b35803f33eabb2d2ef1784b98` |
| `RecipeBook-global-ingredient-catalog-plan.txt` | Active plan/checklist | `4981c538fa381bc960afde6e3f55ff2b56dfd8caad66f7fb19dba6b840499686` |

## Possible later integration delta

**Current proposed delta: none.** Do not change the active green-banana flour row, forms, ledger, recipe links, generated catalog, or checklist from this review.

If a future BIRDC package or specification confirms the instant product is single-ingredient flour from green bananas, and a Québec reviewer validates the French form wording, consider one `pre-cooked` form under `ingredient-ref-green-banana-flour`, with only exact source-supported English/French labels and match terms. Do not reserve a form ID or alias in advance. If its declared formula is a blend or includes carriers, reassess it as a distinct product-specific identity. In either case, keep generic measurements, density, mappings, yield, conversions, and substitutions unset absent separate evidence.

## Source register

All pages were accessed on **2026-10-12**. These IDs are proposal-local and were not written to the ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **S01 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S01`** | East African Community Secretariat, [*Catalogue of East African Standards 2025*](https://www.eac.int/documents?controller=download&file=177480db-3520-4d76-b686-1a6e0438a997&name=EAC+STANDARDS+CATALOGUE+2025.pdf&task=download.file), entry EAS 1106:2023, printed p. 129. The catalogue says the standard covers green/unripe banana and plantain flour and does not apply to instant banana flour. | Official regional standard catalogue. It gives the scope exclusion, not a definition, composition, process specification, Canadian requirement, or equivalence rule for instant flour. |
| **S02 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S02`** | Banana Industrial Research and Development Centre (BIRDC), [Tooke products](https://tookeonline.com/en/products/). The current page separately lists `Raw Tooke Flour` and `Instant Tooke Flour`; it calls the instant product pre-cooked by specialized thermal processing and ready for hot water or milk. It says current package/specification is the authority for current ingredients and product details. | Manufacturer product-family page; no current instant-product ingredient panel, thermal-process detail, Canadian listing, or package ratio is shown. The raw-product wheat claim does not extend to the instant product. |
| **S03 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S03`** | BIRDC/Tooke, [Frequently asked questions](https://tookeonline.com/en/faq/). Identifies Tooke flour as made from green highland cooking bananas (matooke) and distinguishes raw flour from pre-cooked instant flour intended for hot-water/milk preparation. | Manufacturer information; it directs buyers to check the exact product label and current formulation. It does not publish a complete instant-product formula or establish Québec wording. |
| **S04 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S04`** | BIRDC/Tooke, [Produits](https://tookeonline.com/fr/products/). The French-language product page uses `farine Tooke instantanée` for the product. | Manufacturer’s French wording, not a Québec/Canadian French label or terminology ruling. The page text was available in the search-indexed French result; direct page rendering did not load in this review. |
| **S05 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S05`** | Giraldo-Gómez, Rodríguez-Barona, and Sanabria-González, [“Preparation of instant green banana flour powders by an extrusion process”](https://doi.org/10.1016/j.powtec.2019.05.050), *Powder Technology* (2019). The primary study identifies an extruded instant green-banana-flour material and reports altered wetting/solubility compared with commercial flour. | One experimental extrusion route; not a standard, retail label, Québec name, household measure, substitution ratio, or evidence that Tooke uses extrusion. |
| **S06 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S06`** | Jumia Uganda, [TOOKE Instant Banana Flour, 250 g](https://www.jumia.ug/tooke-instant-banana-flour-250g-for-porridge-meals-versatile-nutritious.-24pkts-inside.-259984544.html). Current listing names the product `Instant Banana Flour`, describes pre-cooking, and gives one preparation using 60 g flour with 200 ml boiling water. | Third-party Ugandan retailer page, not the current BIRDC package/specification; the ratio is one porridge instruction only, not a general conversion. The 250 g value is pack mass only. |
| **S07 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S07`** | OnlineOrganics Canada, [Farine de bananes vertes biologique](https://onlineorganics.ca/fr/products/farine-de-bananes-vertes-biologique). A Canadian French listing uses the exact base-flour phrase and describes dried, ground unripe bananas. | The listed product was out of stock at access and is not an instant-flour listing. It supports only the existing raw green-banana flour wording. |
| **S08 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S08`** | Office québécois de la langue française, [*farine de banane* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489070/farine-de-banane), last updated 1982. It gives `farine de banane` with English `banana meal` and discusses banana maturity in its historical note. | Historical generic entry; it does not name instant Tooke flour, green-banana instant flour, or a modern Canadian product. Do not use it as an instant-product alias. |
| **S09 — `WP02-B9-INSTANT-BANANA-FLOUR-BOUNDARY-20261012-S09`** | La Moisson, [Rouleaux de coco saveur gingembre](https://lamoisson.com/products/rouleaux-de-coco-saveur-gingembre-ginger-coconut-rolls). Its current ingredient declaration uses `farine de banane verte biologique` in a packaged Québec-facing product. | Supports the local wording for the base flour only; this is a multi-ingredient snack, not an instant-flour package or process specification. |

## Hold outcome

Keep the current picker and catalog unchanged. Record this as a distinct open B9 question: a current manufacturer attests instant, pre-cooked green-banana flour, but the current package formula and Québec product name are not yet established. This documentation-only decision required no app tests or emulator checks.
