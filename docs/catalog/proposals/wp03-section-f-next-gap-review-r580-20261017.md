# WP03 Section F — Grain sorghum state-boundary and CNF 2026 access review (R580)

- **Status:** integrated as a documentation-only CNF 2026 access hold; see the [R580 integration README](../batches/wp03-r580-cnf2026-sorghum-access-integration-20261017/README.md).
- **Scope:** the existing generic human-food identity `grain sorghum / sorgho à graine` and the state boundary of its Health Canada CNF Food Code 4432 portion data. This is a focused follow-up to the open dry/cooked-form question; it does not reopen R169’s French display review, prior sorghum alias decisions, R576’s roasted buckwheat code 4412, R573’s quick-oats work, or R570’s cooked-millet access check.
- **Plan anchor:** [Section F dry-versus-cooked forms](../../RecipeBook-global-ingredient-catalog-plan.txt#L4396) remains open: “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.” The species-level millet/sorghum parent also remains open at [plan line 4169](../../RecipeBook-global-ingredient-catalog-plan.txt#L4178).
- **Decision:** **Hold a dry or cooked form for generic grain sorghum and hold new CNF 2026 measurement observations.** The already-recorded CNF 2015 Food Code 4432 portions do not identify whole versus decorticated grain or raw versus cooked state. The 2026 relational CSVs are listed by Health Canada, but the four row files could not be retrieved and joined in this environment. Make no 2026 row-presence, row-absence, state-label, or value claim.
- **Bounded delta:** no catalog, ledger, recipe, form, measure, density, conversion, yield, or substitution change is proposed. Record the code-4432 state/access hold beneath the open Section F form checklist and leave the CNF 2026 row join open for a successful retrieval.

## Why this is a distinct open item

The active identity is complete, but its Food Code 4432 measurements have never been tied to an explicit raw/dry or cooked form. Prior sorghum work remains relevant context: R169 reaffirmed the Québec display and explicitly declined to create forms from the state-unspecified CNF entry; the 2026-10-12 sorghum alias review recorded the CNF 2015 portion observations on the identity. Those reviews did not join the four CNF 2026 CSV tables for Food Code 4432. This proposal examines that separate, still-open current-file question and does not duplicate the earlier alias, French-display, or portion work.

The open checklist’s wording limits form work to grains for which recipes or measurements need forms. The complete bundled corpus has no sorghum mention or sorghum reference link, and the current CNF entry is not state-qualified. On the evidence available here, adding a dry form would assign a state that the measurement source does not say; adding a cooked form would be less supported still.

## Existing catalog and evidence ownership

The active reference is `ingredient-ref-grain-sorghum`, in `GRAIN_AND_CEREAL`:

| Field | Current value | R580 treatment |
|---|---|---|
| English / French display | `grain sorghum / sorgho à graine` | Retain. OQLF source `WP03-S22` owns this bilingual term pair. |
| English aliases | `jowar whole`; `guinea corn`; `red sorghum` | Retain. These are qualified, previously reviewed aliases; add none. |
| French aliases | `sorgho en grains`; `sorgho en grain` | Retain. Do not add the Québec retailer’s product-specific `grain de sorgho` wording. |
| Density / unit mappings | `defaultDensity: null`; `unitMappings: []` | Retain. Do not derive density from either CNF portion. |
| Attached forms | None | Add no dry or cooked form from an unqualified food-code label. |
| Ledger record | `ingredient_reference`; `identityState: verified`; `measurementState: researched_supported`; `substitutionResearchState: not_yet_researched` | Preserve all states. `researched_supported` describes source-specific portions, not a validated state-specific mapping. |

The existing ledger record already owns source IDs `WP03-S22`, `WP03-SORGHUM-GRAINS-20261012-S01` through `S05`, and the later alias-review sources. Its three `portion_weight` observations are historical, source-specific CNF 2015 code-4432 values:

| Published portion | Existing observed mass | Limitation retained in the ledger |
|---|---:|---|
| 100 mL | 81.2 g | No whole/decorticated or raw/cooked state; no filling or packing method. |
| 250 mL | 202.9 g | Same. |
| 1 serving | 20.0 g | CNF serving label only; no recipe use or household-volume equivalence. |

Do not append these existing values a second time, combine them with a new edition, or transfer them to a newly constructed form. The CNF 2015 serving page also displays 100 grams of edible portion = 100 grams and 0% total refuse; those entries do not establish an uncooked form or packing method.

Related active references remain separate: `ingredient-ref-puffed-sorghum`, `ingredient-ref-sorghum-flour`, `ingredient-ref-sorghum-grits`, `ingredient-ref-sorghum-semolina`, and `ingredient-ref-sorghum-starch`. No sorghum form exists in `ingredient-forms.v1.json`; neither generic sorghum nor one of those processed identities should inherit another row’s state or measurements.

The old CNF source IDs remain owned by the code-4432 ledger evidence. The four CNF 2026 CSV URLs are shared dataset resources also cited for other Food Codes, so any future row evidence must use new code-specific source records. Proposal-local IDs `WP03-CNF2026-SORGHUM-4432-R580-S01` through `S06` were checked against the existing ledger and proposal archive before drafting and are not allocated there. They are used below only for current dataset metadata and attempted file access; they do not support a row-level claim.

## Picker projection and recipe demand

Static projection against the active references, forms, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) confirms that complete normalized phrases are preferred before substring fallback. There are no sorghum forms or form-match terms. Current example results are:

| Query | Current results | Effect of R580 |
|---|---|---|
| `grain sorghum`; `sorgho à graine`; `sorgho en grains`; `sorgho en grain`; `jowar whole` | `ingredient-ref-grain-sorghum` only | No change. |
| `sorghum`; `sorgho` | Six clearly labeled references: grain, puffed, flour, grits, semolina, and starch | No new row or form broadens these family searches. |
| `jowar` | Grain sorghum, sorghum flour, and sorghum semolina | Keep this existing regional-name overlap visible. |
| `red sorghum` | Grain sorghum and sorghum flour | Keep the existing product/class results; do not add a red-specific identity. |
| `dry sorghum`; `sorghum dry`; `grain de sorgho` | No exact or substring result | R580 adds none; the locally used `grain de sorgho` phrase remains product-specific rather than an alias. |

I scanned all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows**. The complete serialized recipe files and structured rows contain zero `sorghum`/`sorgho` hits; there are zero `ingredient-ref-grain-sorghum` links. The corpus provides no recipe-driven state, measure, conversion, substitution, or relinking need.

## Form, measurement, and substitution limits

Health Canada’s [CNF code-4432 serving page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4432) identifies the bilingual description as `Grains, sorghum / Grains céréaliers, sorgho` and gives 100 mL = 81.2 g, 250 mL = 202.9 g, and 1 serving = 20.0 g. Its page details show a 2019-03-01 modification date. Health Canada’s current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2015 online database remains accessible as an interim route while it works toward easier access to CNF 2026. Together these sources support treating the current online portion page as CNF 2015 evidence, as the existing ledger already does; they do not supply a 2026 row or a preparation-state label.

The existing Codex source `WP03-SORGHUM-GRAINS-20261012-S01` concerns human-food sorghum grain, including whole or decorticated grain. It does not establish whether CNF code 4432 means raw, cooked, or a particular retail preparation. Existing Québec retailer source `WP03-SORGHUM-GRAINS-20261012-S05` describes one `Grain de Sorgho` product as dry grains lightly ground for porridge. That product-specific wording is not evidence that CNF 4432 has the same milling or state scope. Its 500 g package is not a kitchen measure.

There is no reviewed sorghum-grain substitution rule or finding in the ledger or global/contextual substitution files. The recipes do not request sorghum, and the sources reviewed here provide no tested replacement ratio, dish-specific replacement, or method-specific guidance. Keep `substitutionResearchState: not_yet_researched`; do not add a global or contextual substitution, recipe-line link, or “similar grain” inference. This R580 check does not claim to have completed substitution research.

## CNF 2026 resource audit and exact access failure

Health Canada’s current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes CNF 2026 as downloadable relational CSVs, and the [official Open Government dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the files below. On 2026-10-17 I attempted read-only retrieval of each exact official file with Python `urllib.request`, then attempted browser-tool `open` on each direct URL. Local requests failed with `URLError: [Errno -3] Temporary failure in name resolution`; browser `open` responded that each URL was not accessible via that tool. No bytes or CSV rows were received, so no hash, row count, join, or Food Code 4432 row claim is made.

| Proposal-local ID | Official resource URL | Exact bounded result |
|---|---|---|
| `WP03-CNF2026-SORGHUM-4432-R580-S01` | [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Confirms the CNF is bilingual, published as relational CSVs, and that the online 2015 file remains interim. It does not report Food Code 4432’s 2026 row. |
| `WP03-CNF2026-SORGHUM-4432-R580-S02` | [CNF 2026 Open Government listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Confirms the official resource listing. Metadata is not row content. |
| `WP03-CNF2026-SORGHUM-4432-R580-S03` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Access attempt failed; Food Code 4432 presence, absence, name, and state are unverified. |
| `WP03-CNF2026-SORGHUM-4432-R580-S04` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Access attempt failed; no measure rows, values, or types are claimed. |
| `WP03-CNF2026-SORGHUM-4432-R580-S05` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Access attempt failed; no bilingual measure labels are claimed. |
| `WP03-CNF2026-SORGHUM-4432-R580-S06` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Access attempt failed; no type labels or semantic interpretations are claimed. |

The dataset listing demonstrates that the files exist, not that Food Code 4432 is in them. The older 2015 online page cannot fill that gap. Reopen the join only after all four file rows can be fetched and the Food Code / Measure Code / Measure Type keys checked together. If the 2026 code label still omits preparation state, preserve that limit rather than attaching its volume observations to a dry or cooked form.

## Integration recommendation

If root records R580, record only an unresolved, source-scoped state/access decision on the existing `ingredient-ref-grain-sorghum` ledger entry:

- Keep the three CNF 2015 code-4432 observations and existing source ownership unchanged.
- Do not append duplicate CNF 2015 observations or claim new CNF 2026 observations.
- Do not create a dry or cooked form, measurement mapping, density, conversion, cooking yield, recipe link, or substitution from the unqualified page.
- Keep the current reference displays and aliases, picker projection, and all recipe files unchanged.
- Keep the CNF 2026 Food Code 4432 row join open; the direct CSV retrieval limitation is not evidence that the row is missing.
- Keep the broad species and dry/cooked checklist parents open.

Root recorded this access hold in the plan, roadmap, and [integration README](../batches/wp03-r580-cnf2026-sorghum-access-integration-20261017/README.md). No catalog, ledger, recipe, or code data changed. No software tests, build, emulator run, or deployment were run for this documentation-only review.
