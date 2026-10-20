# WP03 Section F R570 — cooked millet CNF 2026 row-access review

## Decision

- **Status:** Integrated as a bounded access disposition on 2026-10-17. No shared catalog, ledger, seed package, manifest, recipe, or code data changed; the CNF 2026 row join remains open.
- **Selected gap:** R567 integrated the generic cooked-millet form and CNF 2015 Food Code 4492 portions, while leaving the current CNF 2026 Food Name and measurement-row join open.
- **Recommendation:** Keep that edition-specific join open. The official CSV, ZIP, and portal API routes could not be read in this environment, so this review makes no claim that Food Code 4492 is present or absent in CNF 2026 and reports no current-edition food description, scientific name, measure code/type, portion, or weight.
- **Current data:** Retain R567's exact three CNF 2015 observations and `measurementState: researched_supported` on the cooked form. They remain valid CNF 2015 evidence; they do not close the CNF 2026 review.
- **No new data:** Add no source or observation to the shared ledger, no new form or alias, no density, mapping, active measure, conversion, yield, recipe link, or substitution. Do not infer current-edition absence from retrieval failure.

## Exact plan anchor and bounded scope

The still-open parent is [WP03 Section F, “Dry versus cooked forms for remaining grains”](../../RecipeBook-global-ingredient-catalog-plan.txt#L4383), which treats cooking yield as a separate quantity relation. The completed [R567 child at plan lines 4441–4446](../../RecipeBook-global-ingredient-catalog-plan.txt#L4450) adds `millet, cooked / millet, cuit` under generic `millet / millet` from CNF 2015 Food Code 4492 and expressly keeps the CNF 2026 join open. R570 is only a fresh attempt at that current-edition row inspection; it does not repeat R567's 2015 evidence, reopen the R547 dry common-millet identity, or close the broader grain-form parent.

## Current catalog, ledger, and source-ID ownership

| Owner | Current evidence and state | R570 boundary |
|---|---|---|
| `ingredient-ref-millet` | Generic `millet / millet`, category `GRAIN_AND_CEREAL`; empty aliases, null default density, and no unit mappings. Its identity sources include `WP03-S20` (OQLF's generic millet entry). | Keep the generic identity and its source ownership unchanged. OQLF supports the unqualified term, not a CNF 2026 Food Code 4492 row. |
| `ingredient-form-millet-cooked` | Integrated R567 form `millet, cooked / millet, cuit`, `formCode`/`prepState: cooked`; no match terms, null density; ledger `measurementState: researched_supported`, `substitutionResearchState: not_yet_researched`. | Preserve the form and its R567-supported 2015 measurement state. |
| R567 cooked-millet ledger record | Owns `WP03-CNF2015-MILLET-4492-R567-S01` for the CNF 2015 Food Code 4492 serving page and three distinct observations: 100 mL = 73.5 g, 125 mL = 91.9 g, and 250 mL = 183.9 g. | Keep all three edition-specific observations. They do not establish a current-edition row, reusable conversion, density, or cooking yield. |
| `ingredient-ref-common-millet` and `ingredient-form-common-millet-dry` | Separate species-qualified common-millet identity/form. R547's CNF 2015/2026 sources are Food Code 4491-specific; its CNF 2026 CSV sources use `WP03-CNF2026-COMMON-MILLET-4491-R547-S01` through `S04`. | Do not reuse code-4491 row sources, scientific name, values, or species scope for 4492. |
| Shared CNF context sources | `WP03-SECTION-F-R310-20261016-S03` (Health Canada CNF overview) and `...-S04` (Open Government CNF listing) are already recorded on the dry pearl-barley and common-millet form records. They support edition/file context and listing/resource access, not Food Code 4492 rows. R544's `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` is the API Guide's general Yield Amount source and is also shared on other form records. | Do not cite any of these as code-4492 row evidence. The API Guide's general Yield definition cannot identify the preparation basis of a particular inaccessible measure row. |

No source ID or observation in the shared ledger currently owns CNF 2026 Food Code 4492 row content. The direct CSV URLs below are already used by R547 for code 4491; that does not let code-4491 source IDs support code 4492. If the rows become readable, create fresh proposal-local IDs scoped to Food Code 4492 and each joined file. This access-only proposal does **not** allocate or register those row-source IDs.

## Official current-edition resources and retrieval result

Health Canada's [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes CNF 2026 as relational CSV files and the CNF 2015 online interface as interim access. The indexed [Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the CSV resources and all-files ZIP. Its indexed record reports a 2026-10-04 modification date; dataset metadata does not supply the target data rows.

On 2026-10-17, I attempted direct HTTPS GET retrieval using Python's CSV-reading workflow and the exact official URLs. Each connection failed before an HTTP response with `Temporary failure in name resolution`. The browser tool independently rejected all four direct CSV downloads as inaccessible. Opening the dataset listing and Food Name, Measure Name, and Measure Type resource pages returned HTTP 403; the Measure Weight Conversion resource page was inaccessible through the tool. Indexed search results exposed dataset/resource metadata and the Food Name data dictionary, but no Food Code 4492 row. I also attempted the official all-files ZIP, CNF Food Name and Measure Weight Conversion datastore-search URLs filtered for `Food_Code=4492`, and a Food Name CSV datastore dump; the browser reported each URL inaccessible. These failures describe this audit environment only.

| Required joined file | Official direct CSV URL | Result on 2026-10-17 |
|---|---|---|
| Food Name | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Direct Python HTTPS request failed at DNS resolution; browser open reported the URL inaccessible. No code-4492 Food Name row was read. |
| Measure Weight Conversion | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Direct Python HTTPS request failed at DNS resolution; browser open reported the URL inaccessible. No code-4492 measure row was read. |
| Measure Name | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Direct Python HTTPS request failed at DNS resolution; browser open reported the URL inaccessible. No measure-name joins were read. |
| Measure Type | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Direct Python HTTPS request failed at DNS resolution; browser open reported the URL inaccessible. No measure-type joins were read. |

Alternate attempted official routes were the [all-files ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip), the [Food Name datastore search](https://open.canada.ca/data/api/3/action/datastore_search?resource_id=e1ffee62-58cb-4e3e-b359-115c658388ad&filters=%7B%22Food_Code%22%3A%224492%22%7D), the [Measure Weight Conversion datastore search](https://open.canada.ca/data/api/3/action/datastore_search?resource_id=bb76d816-3ac0-4749-8c4b-f0dbfd0fac76&filters=%7B%22Food_Code%22%3A%224492%22%7D), and the [Food Name datastore CSV dump](https://open.canada.ca/data/en/datastore/dump/e1ffee62-58cb-4e3e-b359-115c658388ad?format=csv). None yielded file bytes or API rows. Do not treat the inaccessible routes as negative searches.

The exact evidence limit is therefore: **R570 confirms that Health Canada publishes a current relational CNF resource set, but it does not determine whether CNF 2026 contains Food Code 4492 or any cooked-millet row.** No current-edition bilingual description, species/scientific name, code match, measure code, measure label/type, row date, value, or absence claim is established. The accessible CNF 2015 Food Code 4492 page remains the sole row-level measurement source recorded for the form.

## Identity, bilingual naming, and picker effect

R567 uses the exact CNF 2015 state wording `Grains, millet, cooked / Grains céréaliers, millet, cuit` to label the generic cooked form. OQLF's [generic millet entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), owned by the generic reference as `WP03-S20`, allows unqualified millet to refer to a grouping of species or sometimes to a particular one. R570 found no current-edition row evidence that narrows or changes this scope. Keep the form attached to generic `ingredient-ref-millet`; do not assign it to common millet (*Panicum miliaceum*) or add cross-species aliases.

The current phrase-first `IngredientReferenceSearchIndex` has these relevant projections:

| Query | Current owner/result | R570 treatment |
|---|---|---|
| `millet cooked` | `ingredient-ref-millet`, with `ingredient-form-millet-cooked` as the exact form hint. | No change. |
| `millet cuit` | `ingredient-ref-millet`, with the same cooked-form hint. | No change. |
| `cooked millet` | `ingredient-ref-thiakry-millet-granules`, because its indexed product name includes `pre-cooked millet granules`. | Preserve this existing result; add no reversed-order alias or match term. |
| `millet` | 20 generic, species, and product references, including separate generic millet and common millet. | Do not broaden or narrow the list. |
| `common millet` | `ingredient-ref-common-millet`. | Keep its identity and dry form separate. |

No alias, form label, picker route, or user-facing French/English wording is proposed by R570. If a later row join contains a different 2026 description, review it against the generic/species distinction before any catalog naming update.

## Measurement, bundle demand, and substitution limits

The live cooked-millet form has null `densityGPerMl`, no match terms, no unit mappings, and no active measure; the reference has no default density or mappings. The ledger has only R567's three CNF 2015 `portion_weight` observations (100 mL = 73.5 g; 125 mL = 91.9 g; 250 mL = 183.9 g). The generic millet reference and cooked form have no substitution findings; the bundled global and contextual substitution-rule files have no millet entries, and there is no millet unit conversion. Keep all of these unchanged.

A static scan of all 114 manifest-listed bundled recipes and 1,123 structured ingredient rows found no millet or millet-species terms, no `ingredient-ref-millet` link, and no millet-form link. This catalog coverage review is not backed by current bundled recipe demand. No recipe line, package amount, retail serving, or substitution is proposed.

If a successful future join returns measurement rows, add only separately identified observations for rows whose joins are complete across Food Name, Measure Weight Conversion, Measure Name, and Measure Type. Keep each observation edition-, food-code-, measure-code-, and form-scoped. Do not derive density from published portions or treat them as reusable measures. Exclude mass-only and refuse rows from volume observations; do not interpret a type-9 `Yield` row as a kitchen measure, recipe amount, dry-to-cooked ratio, or yield without evidence tied to that exact row. Health Canada's API Guide, [Canadian Nutrient File API documentation](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html), gives only general `Yield Amount` field context in the existing ledger; that general definition does not identify an inaccessible code-4492 row's preparation basis.

## Bounded disposition

1. Keep R567's generic cooked-millet form, its current bilingual labels, and its three CNF 2015 observations unchanged.
2. Keep the CNF 2026 Food Code 4492 joined-row review explicitly open. Do not change `measurementState` based on this access failure; do not claim row presence or absence.
3. Add no row-specific CNF 2026 source IDs or observations until the official files and joins are actually read. If retrieval later succeeds, allocate fresh identifiers scoped to code 4492 rather than reuse R547's code-4491 sources or another food-code source.
4. Keep aliases, picker results, density, active measures, unit mappings, conversions, cooking yield, recipe links, and substitutions unchanged.

This disposition closes only the R570 access attempt. The CNF 2026 code-4492 measurement review and the broader Section F dry/cooked-grain parent remain open. No software tests were run or needed for this documentation-only access review.
