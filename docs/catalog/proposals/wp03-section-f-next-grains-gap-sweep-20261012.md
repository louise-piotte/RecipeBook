# WP03 Section F next-grains gap sweep: wheat flakes (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated as one identity-only `wheat flakes / flocons de blé` reference. The seven proposal source IDs are now registered on the ledger record. The manufacturer’s 1/3 cup (30 g) serving is preserved only as a product-specific ledger observation; its rolled-oats replacement claim is blocked pending recipe-specific evidence. No recipe, form, active measure, density, unit mapping, conversion, yield, or substitution rule changed. No tests or emulator checks were run under the JSON-only data rule; see the [integration record](../batches/wp03-section-f-wheat-flakes-integration-20261012/README.md).
- **Scope:** select one bounded human-food grain product from the remaining Section F gaps, and recheck the plan's named unresolved candidates: unqualified farro, generic sushi rice, pearled hominy, and pozole corn.
- **Plan location:** Section F continues to leave identity and terminology coverage open, including remaining cereal products and regionally significant preprocessed grains ([plan lines 502–505](../../RecipeBook-global-ingredient-catalog-plan.txt#L502), [1896](../../RecipeBook-global-ingredient-catalog-plan.txt#L1989)). The newest Section F progress note is the 2026-10-11 independent quick/instant-oats review ([plan lines 7825–7824](../../RecipeBook-global-ingredient-catalog-plan.txt#L8108)).
- **Disposition:** recommend a single `GRAIN_AND_CEREAL` identity named **`wheat flakes / flocons de blé`**. Preserve the four earlier holds; this sweep does not promote them or reopen their completed evidence reviews.

## Current package snapshot

Read-only snapshot of the canonical split package at review time:

| Part | Current count |
| --- | ---: |
| Ingredient references | 1,214 |
| References classified `GRAIN_AND_CEREAL` | 104 |
| Ingredient forms | 86 |
| Manifest-listed recipes | 114 |
| Recipe ingredient rows | 1,123 |
| Legacy import identities | 66 |
| Research-ledger records | 1,517 |
| Ledger source entries / distinct source IDs | 5,120 / 4,183 |

The refreshed snapshot follows integration of one French alias in the existing whole-rye reference; the reference count and form count are unchanged. Active reference JSON SHA-256 is `a8326df9201bae959e611868b29383400d17f6c3ff4ccce961e70751b0962c82`; research-ledger SHA-256 is `3e227f82c0b4b5fe3a59a3d966f51bf1ecfac4a8ade128a8849e651287b3ce03`; generated catalog SHA-256 is `1cd5f43080f8d2ba471229b0d2f66c6845a961411c54dba39282dc48e1143599`. Recipe and manifest hashes are unchanged from the previous snapshot. The recipe count comes from `manifest.v1.json`; all listed recipe files were scanned. The previous plan checkpoint's lower counts are historical and are not used as the current snapshot.

## Candidate decision: plain wheat flakes

A Montréal-based Canadian food company currently lists a single-ingredient product under the English name **Organic Wheat Flakes** and the French name **Flocons de blé biologiques**. Its bilingual product pages identify Canada as origin, say the flakes are made from whole wheat, and describe one product-specific process (steaming, rolling/flattening, then light toasting). A separate current Canadian French retail listing uses the same product wording. This supports a plain human-food wheat-flake product and the exact Québec French display phrase without translating it mechanically.

The recommended identity is the plain wheat-flake product class. Do not import the source's organic status, named product, SKU, cooking directions, nutrition-serving mass, or water ratio. Do not infer a wheat species, a universal processing method, a form relationship to wheat berries, or an equivalence to oats.

| Proposed field | Decision |
| --- | --- |
| ID | `ingredient-ref-wheat-flakes` (currently unallocated) |
| English display | `wheat flakes` |
| Québec French display | `flocons de blé` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None |
| Recipe links | None; the corpus has no matching line |
| Forms, density, unit mappings, measures, yields, conversions, substitutions | None |

The `GRAIN_AND_CEREAL` assignment follows the existing grain-specific flake identities. Keep this product separate from intact wheat berries, cracked wheat, wheat bran, wheat flour, puffed wheat, and wheat-germ products. Keep spelt flakes and other species-qualified flakes under their existing names. Exclude malted wheat flakes, bran flakes, brewing adjuncts when their product scope is separately identified, and composite breakfast cereals. In particular, do not use product titles for Khorasan or multigrain cereals as aliases for this plain wheat-flake row.

The current Yupik page gives a product-specific `1/3 cup (30 g)` nutrition serving and a suggested `2 cups water : 1 cup flakes` preparation ratio; it also suggests replacing rolled oats in some recipes. These are not general density, unit-mapping, cooking-yield, or substitution evidence. Keep them out of runtime catalog data. The official Canadian breakfast-cereal specification below is withdrawn, so use it only as historical vocabulary/boundary evidence.

## Exact-key and recipe audit

The audit used the repository's `normalize_search_key` implementation from `tools/seed_package/bundled_seed_package.py` across active reference names and aliases, form labels and match terms, and all 66 legacy-import identities. It also checked the current ledger record IDs. This is a normalized exact-key and corpus-text audit, not a live picker test.

| Candidate term set | Exact active/form/legacy owners | Ledger state | Recipe files with a phrase hit | Ingredient rows with a phrase hit |
| --- | ---: | --- | ---: | ---: |
| Wheat flakes: `wheat flakes`, `wheat flake`, `whole wheat flakes`, `whole-wheat flakes`, `flocons de blé`, `flocon de blé`, `flocons de blé entier`, `flocons de blé complet`, `flaked wheat`, `rolled wheat` | 0 | No `ingredient-ref-wheat-flakes` or `candidate-wheat-flakes` record | 0 / 114 | 0 / 1,123 |
| Farro: `farro`, `farro grain`, `farro flour` | 0 | `ingredient-ref-farro`: candidate, `needs_clarification` | 0 / 114 | 0 / 1,123 |
| Sushi rice: `sushi rice`, `riz à sushi`, `riz sushi`, `riz à sushis` | 0 | `ingredient-ref-sushi-rice`: candidate, `needs_clarification` | 0 / 114 | 0 / 1,123 |
| Pearled hominy: `pearled hominy`, `hominy perlé`, `hominy pearl` | 0 | `ingredient-ref-pearled-hominy`: candidate, `needs_clarification` | 0 / 114 | 0 / 1,123 |
| Pozole corn: `pozole corn`, `posole corn`, `maize for pozole`, `maíz pozolero`, `maiz pozolero`, `maïs pozolero`, `maïs pour pozole`, `cacahuazintle`, `cacahuacintle` | 0 | `ingredient-ref-pozole-corn`: candidate, `needs_clarification` | 0 / 114 | 0 / 1,123 |

The corpus scan also checked broader boundary wording for the held candidates: `sushi`, `seasoned sushi rice`, `short-grain sushi rice`, `hominy`, `maïs lessivé`, `gruau de maïs`, `hominy grits`, `pozole`, `posole`, and `pozolero`. These terms produced 0 / 114 full-recipe hits and 0 / 1,123 ingredient-row hits. This is a recipe-text result; some neighboring product phrases, including `maïs lessivé` and `hominy grits`, are active catalog identities and are not being proposed again.

The complete manifest-listed recipe JSON was scanned for each term set, not only ingredient-line text. No exact normalized-key owner or corpus phrase hit was found for the proposed wheat-flake names. The nearest active identities are separate: `ingredient-ref-wheat-berries`, `ingredient-ref-cracked-wheat`, `ingredient-ref-wheat-bran`, `ingredient-ref-puffed-wheat`, and the existing barley, corn, rye, buckwheat, quinoa, and spelt flake rows. None is a wheat-flake alias or form.

## Rechecked holds

| Candidate | Decision | Evidence boundary and current owner |
| --- | --- | --- |
| Unqualified farro | Keep held in the ledger. | OQLF supports an emmer sense, while TERMIUM and the federal grain reference document broader usage across einkorn, emmer, and spelt; Canadian and Québec product labels also span grain and flour products. Keep it off emmer, spelt, and einkorn aliases. No active row or recipe demand was found. See the [2026-10-11 boundary review](./wp03-farro-boundary-review-20261011.md) and its cited source IDs `FARRO-S01`, `FARRO-S02`, `FARRO-S05`, and `WP03-FARRO-BOUNDARY-20261011-S01`. |
| Generic sushi rice | Keep held as `needs_clarification`. | Québec and Canadian retail uses include dry Calrose and Koshihikari products from different grain classes, while public-health and OQLF sources use the wording for cooked, seasoned sushi rice. Do not alias to Calrose, any length class, glutinous rice, or cooked rice. No bundled recipe demand. See the [independent 2026-10-11 review](./wp03-section-f-sushi-rice-independent-review-20261011.md), including `WP03-S73`, `WP03-S134`–`S136`, and `WP03-SUSHI-QC-20261011-S05`–`S09`. |
| Pearled hominy | Keep held as `needs_clarification`. | Dry-milled hominy is distinct from preserved whole-kernel `hominy corn / maïs lessivé`, hominy grits, cornmeal, and masa harina. The reviewed French hominy-perlé wording is feed-scoped; OQLF's broader `semoules du maïs` does not settle a separate human-food Québec name. See the [2026-10-10 refresh](./wp03-section-f-pozole-corn-boundary-review-20261010.md), reusing `WP03-S126`, `WP03-S139`, and `WP03-PZ-20261010-S09`. |
| Pozole corn | Keep held as `needs_clarification`. | The phrase spans dry regional maize and precooked/nixtamalized whole-kernel products; a Québec-market canned example overlaps existing `maïs lessivé`. No exact Québec French human-food name for the dry grain was established. Do not alias generic `pozole corn` to hominy. See the [2026-10-10 refresh](./wp03-section-f-pozole-corn-boundary-review-20261010.md), reusing `WP03-PZ-20261010-S01`–`S08` and `WP03-S125`. |

Each of these four ledger candidates still has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. This proposal adds no measurement, substitution, or alias evidence to them.

## Remaining Section F gaps

This one identity does not close Section F. The plan still lists unresolved grits and polenta, pearled hominy, pozole corn, dried sweet corn, remaining puffed-grain candidates, and regional/preprocessed cereal products. The held farro and sushi-rice questions remain open. Separate recent reviews also leave brown-top, barnyard, and Sikiya/crab-finger millet wording unallocated, and sorghum flakes and puffed oats remain held on product-scope or Québec-name evidence. Continue the broader bilingual review and do not infer grain-state combinations, forms, or numeric behavior from product names.

## Proposal-local source register

Source IDs below were unique to this proposal and checked absent from the shared ledger at review time. Integration registered S01–S07 on `ingredient-ref-wheat-flakes`. Pages were checked on 2026-10-12.

| Source ID | Source and locator | Supports / does not support |
| --- | --- | --- |
| `WP03-WFLAKE-20261012-S01` | Yupik, [Organic Wheat Flakes](https://yupik.com/en/organic-wheat-flakes-p31003), SKU P31003, product information and description. | Current English manufacturer page: Canada origin; the ingredient is listed as “Organic wheat flake”; describes steaming, rolling, and light toasting of whole-wheat grain, with cereal and baking uses. Supports one product's identity and process, not a universal method or species. Its 30 g serving, preparation ratio, and oat-replacement suggestion are product-specific and are not activated as conversions or substitutions. |
| `WP03-WFLAKE-20261012-S02` | Yupik, [Flocons de blé biologiques](https://yupik.com/fr/organic/organic-wheat-flakes-p31003), same SKU P31003, French product page. | Current Québec-French product wording from the Montreal-based Canadian brand: `flocons de blé`, Canada origin, and a single wheat-flake ingredient. Supports the exact French display; `biologiques` is a product qualifier, not an alias. The same product-specific amounts and preparation text are excluded from reusable catalog behavior. |
| `WP03-WFLAKE-20261012-S03` | Yupik, [About us](https://yupik.com/en/about-us) and [contact](https://yupik.com/contact/). | First-party company pages identify Yupik as Canadian and give its Montréal address. They establish local provenance, not a terminology rule or grain specification. |
| `WP03-WFLAKE-20261012-S04` | OQLF, [flocon d'avoine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine), GDT, food / treated cereal, updated 2017. | Québec terminology authority defines an oat flake as oat grain, whole or not, steamed and flattened; it prefers `flocon d'avoine` and discourages `avoine roulée`. This is an adjacent cereal term only; it does not define or directly name wheat flakes. The wheat wording comes from the Yupik French page. |
| `WP03-WFLAKE-20261012-S05` | Canadian General Standards Board, [Cereals, breakfast, prepared, ready-to-eat / Céréales à déjeuner, préparées et prêtes-à-servir](https://publications.gc.ca/site/eng/9.841373/publication.html), GCS 32.13-88, 1988/2014, §5.1.2–5.1.4; [archived standard PDF](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf). | Official archive confirms the bilingual standard was withdrawn in April 2020 and limited to ready-to-eat breakfast cereal procurement. The indexed §5.1.2–5.1.4 text distinguishes Wheat Flakes / Flocons de blé from Malted Wheat Flakes and Bran Flakes. Use only as historical bilingual boundary evidence, not a current specification; direct PDF retrieval was unavailable in this review. |
| `WP03-WFLAKE-20261012-S06` | OnlineOrganics, [Flocons de blé biologiques](https://onlineorganics.ca/fr/products/flocons-de-ble-biologiques), current Canadian retail listing. | Independently corroborates the French product wording, whole-wheat description, Canada origin, and flakes category. It is a retailer listing rather than the manufacturer specification; it does not establish a universal process or transferable measurements. |
| `WP03-WFLAKE-20261012-S07` | La Moisson, [Céréales – Flocons de Blé Khorasan](https://lamoisson.com/collections/cereales-granolas-breakfast-cereal-granola/products/cereales-flocons-de-ble-khorasan), Québec retailer product page. | Shows a nearby Québec product title containing `flocons de blé Khorasan` whose ingredients are Khorasan wheat flour, millet, brown-rice flour, and sweeteners. This is a composite breakfast cereal, not plain wheat flakes; exclude the full title and formula from the proposed identity. |

## Review disposition

**Recommend `wheat flakes / flocons de blé` as one identity-only Section F addition.** The current Canadian product evidence provides an unambiguous single-grain product boundary and an exact French product name; the normalized audit found no active exact-key owner or recipe demand. Keep aliases, forms, measurements, density, unit mappings, yields, conversions, and substitutions empty. Preserve the four unresolved ledger candidates and the other Section F gaps above.
