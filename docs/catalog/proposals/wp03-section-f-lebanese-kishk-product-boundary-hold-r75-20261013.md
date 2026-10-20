# WP03 Section F R75 — kishk product-boundary hold

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** proposal only. No shared catalog, research ledger, recipe, checklist, roadmap, generated, or application file was changed.
- **Chosen open checklist item:** “[Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps](../../RecipeBook-global-ingredient-catalog-plan.txt#L2735).”
- **Scope:** the dry, fermented cereal-and-dairy product sold as *kishk*, with evidence focused on bulgur-and-yogurt products. This does not review every regional use of *kishk/kashk*, the prepared flatbread topping, or Turkish *tarhana*.
- **Recommendation:** keep the dry-product candidate out of active references. The manufacturer and Canadian retail evidence establish a product, but no Québec-facing French label or authoritative Québec term was found for that dry product. A Laval French menu uses *kishk* for a prepared manakish topping, which is related ingredient evidence rather than a standalone dry-product name. If the hold is recorded, add only a ledger candidate; do not allocate an active ID or search alias.

## Product identity and boundaries

The manufacturer LOZ names a product *Kishk* and describes its dried product as a mixture of bulgur, yogurt, and fermented milk, prepared for cooking. A Canadian storefront lists *Litani Kishk* made from cracked wheat and fermented milk. These sources establish a real dry cereal-milk product, not a form of plain bulgur or yogurt. They describe particular products and do not establish one formula for every food called *kishk*.

The 2017 Egyptian study by Gadallah and Hassan describes kishk as dried fermented cereal and yogurt, and experimentally compares wheat, barley, and pearl-millet grains with cow and goat yogurt. The broader cereal variation is a reason to keep the candidate narrow: the evidence does not justify treating all kishk products as one fixed bulgur recipe. The proposed candidate is therefore a **dry fermented cereal-and-dairy product family**, with bulgur-based retail examples; it is not a cereal species, a prepared soup, or a generic synonym for bulgur.

Keep these product boundaries explicit:

| Candidate or neighbor | Disposition |
|---|---|
| Dried *kishk* | Candidate product identity only. Do not activate while the Québec French display for the dry product remains unverified. |
| Bulgur / *boulgour* | Keep `ingredient-ref-bulgur` for the cereal component. Fermentation with dairy creates a distinct composite product; add no *kishk* alias or form to bulgur. |
| Plain yogurt / *yogourt nature* | Keep `ingredient-ref-plain-yogurt` for the dairy component. Do not treat it as a *kishk* alias or ingredient form. |
| Québec *Manakish Kishk* | Prepared flatbread topped with *kishk* made from fermented bulgur and yogurt; it is not the dry standalone product. |
| Turkish *tarhana* | Keep the separate product-family hold in [the R47 integration note](../batches/wp03-section-f-turkish-tarhana-family-boundary-hold-integration-20261013/README.md). Shared fermentation and cereal/dairy ingredients do not establish synonymy. |
| *kashk*, *kishka*, or constructed variants such as *kishk sec* | Add no alias. No reviewed source establishes these as same-product names for the dry candidate. |

## Live ownership, archive, and picker audit

The read-only snapshot used the current split seed package and research ledger on 2026-10-13:

| Artifact | Current state | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,398 references | `f7b73b82fda799ebbc092d1cc5123fab4a62adcd6b0c4c71c2141b455d9e640b` |
| Ingredient forms | 103 forms | `6392f5e14e6f8ff934880143feb0ea8b6dfd277f44e797f059f709b3068a7156` |
| Legacy import candidates | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Research ledger | 1,734 records | `99f9b87d189f41a7396a645f097d16141f7f77fb37cec838ed8f35c977a2dfba` |
| Recipe manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Normalized exact-key checks used the repository's `normalize_search_key` implementation across reference names/aliases, form labels/match terms, legacy names/aliases, and all ledger strings. No exact owner or prior catalog decision was found for `kishk`, `kishk powder`, `dried kishk`, `kishk baladi`, `kishk libanais`, `kishk sec`, `kishk séché`, or `kashk`. The proposed IDs `candidate-kishk` and `ingredient-ref-kishk`, and the proposal-local source-ID prefix below, are also absent. A repository-wide proposal/batch search and the open checklist found no previous focused *kishk* review.

The nearest live owners are:

| Current owner | Active names and aliases | Attached forms / numeric behavior |
|---|---|---|
| `ingredient-ref-bulgur` | `bulgur / boulgour`; no aliases | Four dry grind forms: fine, medium, coarse, and extra coarse. Null density; empty unit mappings. |
| `ingredient-ref-plain-yogurt` | `plain yogurt / yogourt nature`; English alias `plain yoghurt` | No *kishk* form or alias. |

No active *kishk* form, package yield, measurement, conversion, or substitution exists. The active picker currently returns no row for `kishk` or `kashk`; `bulgur` and `boulgour` resolve to the bulgur row, preserving the component boundary. Search behavior is a static projection from the current reference/form data and [picker implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L117), not a UI or emulator observation.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The scan checked complete serialized recipe text and ingredient `originalText`, `ingredientName`, `ingredientRefId`, and `ingredientFormId` values for `kishk`, `kishk powder`, `dried kishk`, `kishk baladi`, `kishk libanais`, `kishk sec`, `kishk séché`, and `kashk`.

| Result | Count |
|---|---:|
| Matching recipe files | 0 / 114 |
| Matching ingredient rows | 0 / 1,123 |
| Existing recipe links to a kishk identity | 0 |

No recipe link, amount, recipe text, or form assignment is justified by the current bundle. Québec restaurant-menu evidence outside the bundle establishes local product-context usage, not bundled demand.

## Québec French scope and evidence limits

The French-language Manakish HAJOUR menu in Laval, Québec, lists **Manakish Kishk** and describes it as a Lebanese flatbread topped with *kishk à base de boulgour fermenté et de yaourt*. This is useful Québec French evidence that the term *kishk* is used for a fermented bulgur-and-yogurt preparation. It does not label a bag or jar of the dry standalone ingredient, and it does not attest `kishk séché` or `kishk sec` as a Québec product name. A targeted OQLF GDT/Vitrine and TERMIUM search for *kishk* did not surface a terminology entry. Do not present that search result as proof that no such term exists.

The evidence supports product identity more strongly than it supports a Québec display. Keep the dry product unallocated until a Québec-facing producer/retailer label or a Québec terminology source names that product. Do not construct a French compound by translating *dried* or *cereal-milk mixture*.

## Measurements, forms, conversion, yield, and substitution

| Concern | Finding and recommendation |
|---|---|
| **Identity** | Product sources identify dried kishk as a cereal-and-fermented-dairy product. If later integrated, use a separate identity, not a form or alias on bulgur or yogurt. The stable English/French display pair is unresolved. |
| **Forms** | Add no form. The dried powder/product is the defining sold state in the reviewed product pages. The menu's ready-to-eat topping and the study's laboratory preparations do not define reusable forms attached to a generic reference. |
| **Measurements** | LOZ lists a 500 g package; Soha Nuts lists a 454 g product package. These are package quantities for specific SKUs, not servings, household measures, or generic mass values. Neither page gives a mass-per-volume relation. Keep density null and unit mappings empty if a later identity is accepted. |
| **Conversion** | No source establishes a conversion between dry kishk and bulgur, yogurt, water, or prepared kishk. Do not infer an ingredient-equivalence or rehydration ratio from recipe descriptions. |
| **Yield** | The pages give no reusable dry-to-cooked, fermentation, or cooking yield. The 2017 study's measured water activity and pH apply to its experimental samples and are not culinary yield or conversion data. |
| **Substitution** | Soup, breakfast, and manakish use descriptions do not establish that kishk can replace bulgur, yogurt, tarhana, or another cereal ingredient at a transferable amount or method. Add no global or contextual substitution rule. |

## Exact proposed shared-data delta

If this hold is accepted into the research ledger, add one unresolved record only:

| Field | Proposed value |
|---|---|
| `recordId` | `candidate-kishk` |
| `recordType` | `candidate` |
| `identityState` | `needs_clarification` |
| `measurementState` | `researched_no_supported_value` |
| `substitutionResearchState` | `researched_no_supported_substitute` |
| Sources | Proposal-local sources `WP03-KISHK-R75-20261013-S01` through `S05` below. |
| Decision | Keep the dried cereal-milk candidate unallocated until a Québec-facing dry-product name is verified; preserve its distinction from bulgur, yogurt, prepared manakish, and Turkish tarhana. |

Do not add `ingredient-ref-kishk`, aliases, forms, density, unit mappings, measurements, package yields, conversions, recipe links, or substitutions. Leave `ingredient-ref-bulgur`, `ingredient-ref-plain-yogurt`, the R47 tarhana hold, and all recipes unchanged. The ledger-only integration would change database JSON data only, for which current `AGENTS.md` says tests are not required. This proposal-only review ran no tests or emulator checks.

## Source register

These IDs are local to this proposal; none existed in the ledger or archive when checked. Pages were reviewed on 2026-10-13.

| Source ID | Direct source | Supports and limits |
|---|---|---|
| `WP03-KISHK-R75-20261013-S01` | Gadallah and Hassan, [Quality properties of Kishk (a dried fermented cereal-milk mixture) prepared from different raw materials](https://link.springer.com/article/10.1016/j.jssas.2017.02.003), *Journal of the Saudi Society of Agricultural Sciences* (2017), abstract and methods. | Primary Egyptian study describes kishk as a dried fermented cereal/yogurt mixture and compares wheat, barley, and pearl-millet samples with cow and goat yogurt. Its findings describe its experimental formulations, not a universal recipe, Québec name, household measure, or substitution. Reported water-activity/pH measurements are laboratory product data only. |
| `WP03-KISHK-R75-20261013-S02` | LOZ Food Products Company, [Kishk](https://loz-tic.com/en/products/kishk/), product description and product weight. | Manufacturer identifies a dried product made from bulgur, yogurt, and fermented milk, ready to cook; lists a 500 g product weight. It gives no French product label, serving, mass-volume measure, or generic yield. |
| `WP03-KISHK-R75-20261013-S03` | Soha Nuts, [Litani Kishk](https://sohanuts.com/products/litani-kishk), product description and package size. | Canadian-currency retail listing describes cracked wheat and fermented milk, a powdered product for soups/stews, and a 454 g package. The listing showed sold out at review; it does not establish Québec French wording, current availability, a serving, or a household measure. Direct page retrieval returned a cache miss, so the indexed product text was used with this limitation recorded. |
| `WP03-KISHK-R75-20261013-S04` | Manakish HAJOUR, [French Québec menu listing](https://www.ubereats.com/ca-fr/store/manakish-ha-jour-4195-bd-sainte-rose/fPMcC3W5XF2RFmYSHuE1OA), item `Manakish Kishk Manakeesh`. | Laval, Québec menu uses `kishk` in French and describes fermented bulgur/yogurt as a flatbread topping. This supports local prepared-food wording, not a standalone dry-product label or a product quantity. The source is the merchant menu as hosted on a delivery platform. |
| `WP03-KISHK-R75-20261013-S05` | FAO, [Fermented cereals: a global perspective](https://www.fao.org/4/x2184e/x2184e07.htm), section “Kishk.” | Technical overview describes one Egyptian preparation using parboiled wheat and soured milk, then fermentation and drying. It supports one regional process example; it is not a current specification and does not establish all kishk formulas. |

## Static checks

- Confirmed the selected checklist line remains open and no prior *kishk* decision exists in the proposal/batch archive.
- Confirmed exact-key ownership and proposed IDs/source IDs against live references, forms, legacy candidates, ledger, and archive.
- Recomputed recipe count and ingredient-row count from the current manifest and scanned the full listed corpus; 0 candidate hits.
- Verified source URLs and the local links in this proposal; recorded the Soha Nuts retrieval limitation.
- UTF-8 decode/no-BOM, final newline, trailing-whitespace, and local-link-target checks passed after saving.
- No tests or emulator were run for this proposal-only review.
