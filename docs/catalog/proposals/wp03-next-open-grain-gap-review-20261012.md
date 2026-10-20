# WP03 Section F: Red River cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12; canonical reference and ledger record are live, the generated picker catalog is current, and the live plan and roadmap record the disposition. See [integration record](../batches/wp03-section-f-red-river-cereal-integration-20261012/README.md).
- **Scope:** The original dry Red River hot-cereal mix currently sold by Arva Flour Mills.
- **Recommendation:** Integrate one identity-only `GRAIN_AND_CEREAL` reference for **`Red River cereal / Céréales Red River`** with the narrowly supported bilingual aliases below. Do not add forms, numeric behavior, recipe links, or substitutions.
- **Open checklist:** The live Section F checklist leaves “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” open at [plan line 2069](../../RecipeBook-global-ingredient-catalog-plan.txt#L2162); the broader continuation is still open at [line 8980](../../RecipeBook-global-ingredient-catalog-plan.txt#L9261).
- **Candidate freshness:** Exact Red River wording, the proposed reference ID, and a Red River ledger record are absent from current references, forms, legacy-import candidates, research ledger, bundled recipes, the exported recipe archive, earlier catalog proposals/batches, and roadmap text. Nearby grain components are already represented separately, but none owns this named mix.

This is a bounded regional cereal-product candidate within the still-open Section F review. Current manufacturer pages identify the original Canadian hot cereal and its formulation; a French Canadian grocery title and a public-sector French cookbook support French naming and cooking context. These sources support considering the named product in a regional catalog; they do not establish its prevalence in Québec households.

## Live package and archive snapshot

SHA-256 values below cover exact bytes. The recipe-corpus digest is computed in manifest order by hashing each manifest-relative path in UTF-8, a NUL byte, and that recipe file's exact bytes. The hashes are a dated shared-workspace snapshot; recheck before any later integration.

| Artifact | Count and size at review | SHA-256 / corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,272 references; 121 `GRAIN_AND_CEREAL`; 407,321 bytes | `2b94176589510c344eedf318a03659005a7ab8883e755f79c6fb2b933bfc0e56` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,580 records; 5,591 source entries; 4,627 distinct source IDs; 8 unit conversions; 5,470,716 bytes | `0ce7c077364b57ac61626932bc40c766c29f829d07a284a9dbd3c93be797a7e3` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed bundled recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes | `42e3a13c9b9a1630c85296b4dd65b57b7b849bb07171a02d238d3524944ae70a` |
| Generated `BundledIngredientCatalog.kt` | 557,520 bytes | `aeabed47aa25137f2fe88587b857028576be7f62b61c33efe16f0df4b6348487` |
| Original RecipeKeeper ZIP, `docs/exported-recipe-lists/RecipeKeeper_20260320_143058.zip` | 157 members; 11,028,534 bytes | `1eeb368beb7aef5f26086d978369a36186543ac202f1c6c74fdb841f340b63df` |
| Extracted RecipeKeeper `recipes.html` | 814,743 bytes | `f7893f4b6ddddf6ba66682eec95cd9e25d809c50459610e4ca7e48388abc850c` |

The ZIP contains the original HTML export and associated assets; its text-extractable members contain no Red River phrase. The extracted archive also contains 114 processed per-recipe JSON files plus a manifest; all 114 JSON files were searched and returned no Red River phrase hit. No source or processed archive file was modified.

## Proposed identity and exact product boundary

Arva's current English product page names **Red River Cereal 908g**, describes it as a hot cereal, identifies the original formulation as cracked wheat, cracked rye, cracked flax and whole flax, and reports approximately 200 g per cup of dry raw cereal [S01]. Arva's French product page is titled **Céréales Red River 908 g** and gives the corresponding French component names [S02]. Arva's FAQ says the Original Red River cereal has four ingredients [S03].

The four named components are four ingredient states/components, not four grain species: cracked wheat, cracked rye, cracked flax, and whole flax. Their proportions and particle-size specifications are not published on the reviewed manufacturer pages. The product is a composite cereal identity, not a synonym for any one component.

| Proposed field | Recommendation |
|---|---|
| ID | `ingredient-ref-red-river-cereal` |
| English display | `Red River cereal` |
| French display | `Céréales Red River` |
| English aliases | `Red River hot cereal`; `Original Red River Cereal` |
| French aliases | `céréales chaudes Red River`; `céréale Red River` |
| Category | `GRAIN_AND_CEREAL` |
| Product boundary | Original branded dry raw Red River cereal mix; keep the branded identity as sold, regardless of the fact that its constituent grains also have independent catalog rows. |
| Forms | None. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []`. |
| Recipe links and yields | None. |
| Conversions and substitutions | None. |

The French display follows the manufacturer's French product title. `Céréales chaudes Red River` is attested as a Québec grocery title by Metro [S04]; the Nunavut French breakfast cookbook uses the singular recipe name `Céréale Red River®` [S05]. These support the proposed display and aliases as source-attested terms, not as an OQLF ruling. Retain the proper brand wording `Red River` in French.

Keep this row separate from the existing `cracked wheat / blé concassé`, `rye berries / grains de seigle`, `rye flakes / flocons de seigle`, and `flax seeds / graines de lin` references. Do not attach `cracked wheat`, `cracked rye`, `cracked flax`, or `whole flax` as aliases to the composite row. Do not add the generic terms `hot cereal` or `céréales chaudes` as aliases, because they describe multiple cereal products. Do not conflate the original mix with Arva's separate `Red River 7 Grain Hot Cereal`, whose published list includes oats, wheat, cream of whole wheat, cornmeal, sunflower seeds, and flax [S06], or with its separately listed non-original cream-of-whole-wheat product [S07].

## Ownership, picker, and recipe-demand audit

### Exact ownership

The current catalog and archive checks found:

| Search surface | Result |
|---|---|
| Active reference IDs, names, and aliases | Proposed ID and all Red River phrases have zero owners. |
| Ingredient-form IDs, labels, and match terms | Zero Red River terms; no Red River form exists. |
| Legacy-import candidates | Zero Red River candidates among 65. |
| Research-ledger record IDs and serialized record content | Zero Red River mentions among 1,580 records. The proposed record ID and the source-ID prefix used below are unclaimed. |
| Earlier catalog proposals/batches, the plan, and roadmap | No prior Red River-focused review or recorded disposition was found. The broad Section F cereal-mix/preprocessed-grain checklist remains open. |
| Bundled and archived recipe text | See the full-corpus results below; no candidate phrase hit. |

The existing component rows remain the correct owners for component-specific queries. Existing hot-cereal references include cream of rice, cream of wheat, and creamy buckwheat; none is an exact owner for Red River cereal.

### Actual picker behavior

The recipe editor uses `IngredientReferenceSearchIndex` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) from [RecipeEditorScreen.kt](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt). The current implementation normalizes case, accents, ligatures, punctuation, and spaces; prioritizes an exact attached-form phrase; then prefers complete word-phrase matches across names and aliases; and falls back to substring matches. The table records the pre-integration comparison between the live picker and the proposed row. Final picker results against the integrated catalog are recorded in the [batch README](../batches/wp03-section-f-red-river-cereal-integration-20261012/README.md); no UI or emulator run was performed.

| Picker query | Current results | With proposed row |
|---|---|---|
| `Red River cereal` | none | Red River cereal |
| `Original Red River Cereal` | none | Red River cereal |
| `Red River hot cereal` | none | Red River cereal |
| `Red River` | none | Red River cereal |
| `céréales Red River` | none | Red River cereal |
| `céréales chaudes Red River` | none | Red River cereal |
| `céréale Red River` | none | Red River cereal |
| `hot cereal` | cream of rice hot cereal; cream of wheat hot cereal; creamy buckwheat hot cereal | those three plus Red River cereal |
| `céréales chaudes` | creamy buckwheat hot cereal | creamy buckwheat hot cereal plus Red River cereal |
| `cracked wheat` | cracked wheat | cracked wheat |
| `cracked rye`; `cracked flax`; `whole flax` | none | none |
| `Red River 7 Grain`; `Red River CREAM OF WHOLE WHEAT` | none | none |

The specific brand phrases resolve only to the proposed row. Generic hot-cereal searches gain the proposed identity as expected; the component search stays with its existing owner. The variants remain outside the candidate because they are not aliases.

### Full recipe results

All 114 manifest-listed bundled recipe files and all 1,123 ingredient rows were searched. Searches included `Red River`, `red-river`, `redriver`, `Red River cereal`, `Original Red River Cereal`, `Red River hot cereal`, `Céréales Red River`, `Céréales chaudes Red River`, and `Céréale Red River`, with accents and case folded. **Result: 0 recipe-file hits, 0 ingredient-row hits, and 0 recipe links.**

The extracted RecipeKeeper archive was checked separately: **0 hits across 114 processed recipe JSON files and 0 text hits in the original `recipes.html`**. The source ZIP's text-extractable members also returned zero hits. The Government of Nunavut cookbook has a named Red River recipe and serving directions, but it is external evidence, not a bundled RecipeBook recipe or a recipe link in this library.

No current app recipe needs a link, form, measure, recipe-text change, or substitution for this product. The absence of bundled demand limits integration to the identity and search names supported by the external Canadian product sources.

## Forms, measurements, preparation, and substitutions

| Question | Evidence reviewed | Recommendation and limit |
|---|---|---|
| Product state | Arva calls the measure “dry raw” and sells the original cereal as a dry mix [S01]. | The identity row denotes the original mix as sold. Do not create a separate `dry` form without recipe or conversion demand. No cooked form is needed by a bundled recipe. |
| Current mass/volume evidence | Arva reports approximately 200 g per cup of dry raw Red River cereal [S01]. It does not specify the cup volume or whether it means a metric or US customary cup. The app's `cup` is 236.5882 mL. | Keep this approximate manufacturer statement only as a source-specific ledger observation. Do not infer a default density, active measure, or cup mapping from the unspecified cup convention. |
| Canadian reference data | Health Canada's Canadian Nutrient File page for the dry Robin Hood Red River product (food code 5231) lists 50 mL = 40 g, 100 mL = 80 g, and 250 mL = 200 g; it also lists 35 g dry cereal to make 175 mL cooked [S08]. The page was modified 2019-03-01. | This is a product-specific historical Robin Hood record, not a measured current Arva package or confirmation of the app's cup convention. Do not convert these values into an Arva default density or a current catalog mapping. |
| Preparation and portion | The 2013 Nunavut cookbook calls it a porridge, lists 3⅓ cups cereal and 13⅓ cups water for 20 portions, gives a ¾-cup portion, and instructs cooking for 5 minutes plus a short rest [S05]. | Preserve this as a source-specific recipe example only. Its older formula, unspecified cup volume, and recipe yield do not establish a reusable current product yield, form conversion, or general cooked serving. |
| Substitution | The manufacturer pages identify product formulation but provide no tested general replacement. Ingredient proportions and grind details are not published [S01–S03]. | Add no substitution rule and no finding that proposes an interchangeable recipe replacement. Replacing the blend with its separately cataloged components in unknown ratios, or with another hot cereal, is unsupported. A general substitute remains unverified. |

The integrated ledger uses `measurementState: researched_supported` for the single manufacturer-reported approximate cup-mass observation, while its unspecified cup convention prevents a reusable app conversion. `substitutionResearchState: researched_no_supported_substitute` records the scoped search for a general replacement. No active rules were added, and no recipe-specific substitute is ruled out by this review.

## Evidence limits

- The manufacturer publishes component names and an approximate cup weight, but not component proportions, exact particle sizes, the cup's volume, or a current label measurement method.
- The French manufacturer product title is useful direct product evidence. Metro provides a Québec grocery title, but its page at retrieval listed the item out of stock and did not expose the formulation in French; use it for lexical evidence only.
- The Nunavut cookbook is an official French public-sector culinary source, but it is older and is not Québec terminology review. Its recipe does not establish the current Arva formula or a transferable yield.
- The Health Canada reference is a historical Robin Hood entry. It must not be silently treated as a current Arva measurement.
- The sources support a named Canadian product and bounded identity, but do not quantify its regional prevalence or establish a generic Red River-style cereal class.
- No source reviewed validates a substitute for the current dry mix. There is no bundled recipe demand to justify a recipe-context trial.

## Integration result

1. The canonical `ingredient-references.v1.json` contains the accepted bilingual identity and aliases with `defaultDensity: null` and `unitMappings: []`.
2. The accepted `ingredient_reference` ledger record uses sources S01–S08 and preserves the approximately 200 g per manufacturer cup only as one source-specific observation. It adds no active measure, form, recipe link, package yield, conversion, or substitution rule.
3. The generated picker catalog is current. No recipe or existing component row changed.
4. The scoped decision is recorded beneath the still-open Section F regional cereal-mix/preprocessed-grain item.

The accepted integration is recorded in the [batch README](../batches/wp03-section-f-red-river-cereal-integration-20261012/README.md). The initial research phase created this proposal; integration later changed only the canonical reference/ledger JSON, generated Kotlin catalog, plan, roadmap, and batch documentation. It did not change recipe files or application logic. No app tests or emulator checks were run because this was a data-only change.

## Proposal-local source register

Source IDs below were checked absent from the shared ledger before drafting. All pages were accessed on 2026-10-12.

| Source ID | Direct source and locator | Supports and limits |
|---|---|---|
| `WP03-REDRIVER-20261012-S01` | Arva Flour Mills, [Red River Cereal 908g](https://arvaflourmills.com/products/red-river-cereal-908g/1000), product title and description. | Current manufacturer's English page calls it the original hot cereal, lists cracked wheat, cracked rye, cracked and whole flax, and reports approximately 200 g per cup of dry raw cereal. It provides no ingredient proportions or cup-volume convention. |
| `WP03-REDRIVER-20261012-S02` | Arva Flour Mills, [Céréales Red River 908 g](https://arvaflourmills.com/fr/products/red-river-cereal-908g), French product title and description. | Manufacturer's French page names the product `Céréales Red River`, describes the hot-cereal context, and lists blé concassé, seigle concassé, lin concassé et entier. Its wording is manufacturer translation, not independent Québec editorial review. |
| `WP03-REDRIVER-20261012-S03` | Arva Flour Mills, [FAQ: Red River Cereal](https://arvaflourmills.com/pages/arva-faq), “Has the Red River cereal recipe changed?” answer. | Manufacturer says the Original Red River cereal has four ingredients and follows production protocols. Combined with S01/S02, this supports the four-component product boundary; it does not state proportions. |
| `WP03-REDRIVER-20261012-S04` | Metro, [Céréales chaudes Red River 1,35 kg](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/cereales-chaudes/p/059000039602), French product title; product number `059000039602`. | Québec grocery listing supports the French title `Céréales chaudes Red River`. It was marked out of stock at review and is used for name evidence only, not current availability or formulation. |
| `WP03-REDRIVER-20261012-S05` | Government of Nunavut, [Breakfast Programs Cookbook (French PDF)](https://livehealthy.gov.nu.ca/sites/default/files/BPCB_FRsm.pdf), 2013 edition, printed page 22. | Uses `Les céréales Red River` in the description and `Céréale Red River®` as the recipe title; provides a 20-portion cooking example, portion, and timing. This is historical French culinary usage and recipe context, not a current Arva formula or general yield. |
| `WP03-REDRIVER-20261012-S06` | Arva Flour Mills, [Red River cereal collection (French)](https://arvaflourmills.com/fr/collections/red-river-cereal), product list and collection description. | Distinguishes the original cereal from the separate 7-grain and non-original cream-of-whole-wheat products. Collection wording does not make those products aliases for the original. |
| `WP03-REDRIVER-20261012-S07` | Arva Flour Mills, [Red River 7 Grain Hot Cereal](https://arvaflourmills.com/products/red-river-7-grain-hot-cereal), product description. | Names quick-cooking and large-flake oats, cracked wheat, cream of whole wheat, cornmeal, sunflower seeds, and flax seeds. Establishes a separate composite product, not a synonym for the original blend. |
| `WP03-REDRIVER-20261012-S08` | Health Canada, [Canadian Nutrient File serving size: Cereal, hot, Red River, dry, Robin Hood (food code 5231)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=5231), serving-size rows; modified 2019-03-01. | Provides product-specific historical dry-volume/mass figures and dry amount for a cooked volume. The brand and date differ from the current Arva product; no current default density or mapping is inferred. |

