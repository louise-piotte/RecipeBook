# WP03 Section K lotus-leaf wrapper identity review (R127)

- **Reviewed:** 2026-10-15.
- **Status:** Integrated into the reference catalog, forms, and research ledger; see the [R127 batch
  README](../batches/wp03-section-k-lotus-leaves-wrapper-identity-integration-r127-20261015/README.md).
  At the review snapshot, no shared catalog or planning file had changed.
- **Scope:** Resolve whether lotus leaves used for wrapping sticky rice need a plant-part identity, the Québec-French display and narrow aliases, and whether a dried form is sufficiently supported.
- **Recommendation:** Add one wrapper identity, `lotus leaves / feuilles de lotus`, with singular aliases. Add one `dried` form from a current Canadian product listing. Keep it separate from lotus root, lotus seeds, lotus-root starch, and leaf wrappers made from other plants. Add no measurements, recipe links, mappings, yields, or substitutions.
- **Source-ID prefix:** `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S`; checked against the live ledger and proposal/batch queue before drafting.

## Open Section K question

The [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) still lists lotus leaves among culinary wrapper and aromatic leaves, and cautions that not all wrappers are eaten. The R125 banana-leaf and R126 corn-husk integrations resolve distinct wrappers; neither covers lotus leaves. The current catalog has separate lotus-root, lotus-root-starch, lotus-seed, lotus-seed-flour, and lotus-seed-starch references, but no lotus-leaf identity or form. No focused lotus-leaf proposal or ledger decision was found.

At the proposal snapshot, the package contains 1,474 ingredient references and 106 forms; the research ledger contains 1,816 records, 7,513 source entries, and 6,388 distinct source IDs. The manifest lists 114 recipes and 1,123 ingredient rows. These counts are snapshot values and may move as other lanes integrate.

## Proposed catalog entry

| Field | Recommendation |
|---|---|
| Reference ID | `ingredient-ref-lotus-leaves` |
| English display | `lotus leaves` |
| Québec-French display | `feuilles de lotus` |
| English aliases | `lotus leaf` |
| French aliases | `feuille de lotus` |
| Category | `VEGETABLE_AND_AROMATIC`, as a distinct culinary plant part. The category does not mean that a wrapper is eaten. |
| Default density | None |
| Unit mappings | None |

Add one source-supported product-state form under that identity:

| Form field | Recommendation |
|---|---|
| Form ID / code | `ingredient-form-lotus-leaves-dried` / `dried` |
| English label | `dried lotus leaves` |
| Québec-French label | `feuilles de lotus séchées` |
| English match term | `dried lotus leaf` |
| French match term | `feuille de lotus séchée` |
| Preparation state | `dry` |
| Density | None |

Do not add a fresh form: the Montréal raw-leaf listing does not state a preparation state, and the bundle has no recipe line that needs one. The dried form is limited to the explicitly dried commercial product. Do not infer rehydration ratios or equivalence between dried and fresh leaves.

## Evidence and limits

Current Pointe-Claire menu wording directly supports the Québec-French phrase: Restaurant Impérial lists `Riz collant en feuille de lotus` and the English `Sticky Rice in Lotus Leaf` as steamed dim sum [S04]. This is local restaurant-market evidence for a recognizable dish and culinary role, not a raw-leaf product listing or a statement that the wrapping leaf is eaten.

Montréal grocer Marché FuTai lists `Lotus leaf / 荷叶 - 400 g`, product code GLL02, and its product page displays “In Stock” [S05]. The linked delivery-area page lists Montréal-area neighbourhoods. The product page gives no French title, species, fresh/dried state, or leaf count. Its stock display has no timestamp and is time-sensitive; treat it as a local-market listing, not a guarantee of current inventory. The 400 g package is not a mass-per-leaf measure.

Superwafer lists `Super Dry Lotus Leaf`, 400 g, in its Dried Food category and displays it as in stock [S06]. This supports a `dried` product form on a Canadian online storefront. Delivery dates depend on address and service-area settings, so this page does not establish Québec availability; its own notice says displayed product information may be incomplete or outdated.

The 2019 peer-reviewed review on leaves used for food wraps identifies the lotus leaf as *Nelumbo nucifera* and describes fresh and dried lotus leaves used to wrap cooked foods and during steam cooking [S03]. It is a review of Indian cultural practices, not a primary Cantonese recipe or evidence of Québec terminology, local stock, ingredient measures, or universal edibility. Kew's Plants of the World Online accepts *Nelumbo nucifera* and places it in Nelumbonaceae [S01]. Kew explains that sacred lotus is distinct from water lilies despite historical comparisons; do not add `water lily` or `nénuphar` aliases. The French-language Muséum national d'Histoire naturelle identifies the species as `lotus sacré` and labels its plant part `feuilles de lotus sacré` [S02]. That supports botanical interpretation, not a Québec standard or an active alias.

An Edmonton packaged-food product lists `Lotus leaf / Feuille de lotus` and tells the cook to remove the wrapper before serving [S07]. This is useful Canadian French and wrapper-role evidence, but it is not Québec product evidence. The local restaurant listing independently supports the singular French phrase. The targeted exact-phrase search did not surface an OQLF or TERMIUM entry; use the documented local phrase without claiming an official terminology ruling.

## Picker projection

The projection follows accent folding and complete-word-phrase-first matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static simulation over the 1,474-reference / 106-form snapshot, not live picker QA.

| Query | Current results | With proposal | Picker effect |
|---|---:|---:|---|
| `lotus leaf`; `lotus leaves` | 0 | 1 each | Singular and plural English queries select the new identity. |
| `feuille de lotus`; `feuilles de lotus` | 0 | 1 each | Québec restaurant wording and its plural resolve to the same leaf identity. |
| `dried lotus leaves`; `feuilles de lotus séchées` | 0 | 1 each | Both complete phrases return the identity with the `dried` form hint. |
| `lotus` | 5 | 6 | Adds one choice alongside lotus root, lotus-root starch, lotus seeds, lotus-seed flour, and lotus-seed starch. |
| `lotus root`; `lotus seed` | 2; 3 | 2; 3 | Existing root and seed search results are unchanged; no alias is added to them. |
| `leaf`; `leaves` | 10; 23 | 11; 24 | Broad English leaf searches each gain one wrapper choice. |
| `feuille`; `feuilles` | 6; 31 | 7; 32 | Broad French leaf searches each gain one wrapper choice. |
| `water lily`; `nénuphar` | 0; 0 | 0; 0 | No water-lily synonym is introduced. |

Do not add bare `lotus`, `sacred lotus`, `Nelumbo`, `leaf/leaves`, or `feuille(s)` aliases. In particular, `sacred lotus` already returns the three seed-related identities; using it for leaves would blur a plant-part boundary. Keep the active aliases qualified, and do not add `lo mai gai` (a prepared dish), `lotus-root leaf`, or generic wrapper terms.

## Bundle demand and recipe matches

I scanned all 114 manifest-listed recipe files and their 1,123 ingredient rows, including recipe titles, ingredient names, and source text. No row or title mentions lotus leaves, `lotus leaf`, `feuille(s) de lotus`, `Nelumbo`, or lotus-wrapped sticky rice; no recipe links to a lotus-leaf reference. There is no direct bundled recipe demand or recipe link to add.

Demand outside the bundle is concrete: the current Pointe-Claire dim-sum menu names steamed sticky rice in a lotus leaf, and the Montréal grocer lists a 400 g lotus-leaf product. These sources establish a use case and a local retail listing without supporting bundle measurements or substitutions.

## Alias, form, measurement, and substitution decisions

| Catalog behavior | Recommendation |
|---|---|
| Identity | Add one lotus-leaf wrapper identity distinct from lotus root, seed products, banana leaves, and corn husks. |
| Aliases | Add only singular `lotus leaf` and `feuille de lotus`; retain plural display forms. Keep all aliases plant-part-qualified. |
| Form | Add only `dried`, based on the explicit Canadian dried-food SKU and review evidence. Do not add a fresh form from FuTai's state-unspecified item. |
| Density / volume-to-mass | None. Neither 400 g retail listing gives a leaf count or packing basis. |
| Unit mapping / count | None. No source supports a general count per package, mass per leaf, or wrapper-per-serving rule. |
| Yield / conversion | None. No fresh-to-dried or rehydration conversion was established. |
| Substitution | None. Do not substitute banana leaves, corn husks, or bamboo leaves; shared wrapper use does not establish interchangeability. |
| Recipe links | None; the bundled corpus has no matching row. |

## Source register

| Source ID | Source | Evidence used and limits |
|---|---|---|
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S01` | Kew Science, [Plants of the World Online: *Nelumbo nucifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605422-1/general-information). | Accepts *Nelumbo nucifera* and classifies it in Nelumbonaceae. Botanical identity, not Québec ingredient terminology or verification of the FuTai product's species. |
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S02` | Muséum national d'Histoire naturelle, [Lotus sacré](https://www.mnhn.fr/fr/lotus-sacre). | Names *Nelumbo nucifera* `lotus sacré` and labels the leaves `feuilles de lotus sacré`. France-based botanical wording, not a Québec terminology ruling. |
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S03` | Aruna Jyothi Kora, [Leaves as dining plates, food wraps and food packing material: Importance of renewable resources in Indian culture](https://doi.org/10.1186/s42269-019-0231-6), *Bulletin of the National Research Centre* 43 (2019), article 205. | Review describes *N. nucifera* leaves as food wrappers and reports fresh/dried use. Evidence summarizes Indian cultural practice; it does not establish a recipe measure, Québec market, or universal edibility. |
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S04` | Restaurant Impérial Pointe-Claire, [menu dim sum](https://imperialmontreal.com/fr/pointe-claire/menu-dim-sum/). | Current bilingual local menu lists steamed `Riz collant en feuille de lotus / Sticky Rice in Lotus Leaf`. Supports local use and phrasing, not raw-leaf availability or wrapper edibility. |
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S05` | Marché FuTai, [Lotus leaf / 荷叶 – 400 g](https://www.marchefutai.ca/Lotus-leaf.html) and [delivery area](https://www.marchefutai.ca/delivery-area). | Product code GLL02; product page displays “In Stock”; delivery page identifies Montréal-area service. Listing does not state species, French name, leaf count, or preparation state; stock status is undated. |
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S06` | Superwafer, [Super Dry Lotus Leaf](https://www.superwafer.ca/en/product/7896/super-dry-lotus-leaf). | Canadian online listing calls the 400 g product dried and categorizes it as Dried Food. Delivery region is address-dependent, and the site cautions that product information may not be current or complete. |
| `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S07` | KC Food Products, [Sticky rice](https://www.kcfood.ca/product-page/sticky-rice). | Edmonton prepared-food listing gives English `Lotus leaf`, French `Feuille de lotus`, and instructions to remove the wrapper before serving. Canadian French/product-role evidence, not Québec sourcing. |

## Static checks

- Confirmed no exact lotus-leaf reference, form, focused proposal, or ledger decision exists; the R127 source-ID prefix is absent from the current ledger, proposal queue, and batch READMEs.
- Rechecked current reference, form, ledger, manifest, and recipe-file inventories; confirmed the 114-recipe / 1,123-row scan has no lotus-leaf match.
- Simulated the proposed bilingual aliases and dried form with the search behavior in `IngredientSearch.kt`; documented both exact phrase resolution and the expected broad leaf and lotus result growth.
- Checked the linked Kew, MNHN, journal, Pointe-Claire restaurant, Montréal retailer, Canadian online product, and Edmonton prepared-food pages for the claims above. No shared catalog, ledger, plan, roadmap, batch, or generated-index file was edited.
- No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. This is a proposal-only review, and `AGENTS.md` waives testing for database-JSON-only additions.
