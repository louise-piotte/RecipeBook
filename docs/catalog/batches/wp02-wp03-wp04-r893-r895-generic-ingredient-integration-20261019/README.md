# WP02/WP03/WP04 R893–R895 generic ingredient integration

Date: 2026-10-19
Scope: generic culinary ingredient coverage across grain, plant-part, and seafood categories.

## Decisions

- **R893 — finger-millet bran:** added identity-only `finger millet bran / son d'éleusine cultivée` as `GRAIN_AND_CEREAL`, with only the source-attested English names `ragi bran`, `finger millet seed coat`, and `finger millet seed coat matter`. The French compound remains provisional because the FAO source supports the crop name, not the bran compound. Keep the ingredient separate from finger-millet grain/flour and all other cereal brans. Study fractions, cultivar/process details, formula percentages, extraction yields, compositions, and findings remain study-specific.
- **R894 — dill flower heads:** added identity-only `dill flower heads / ombelles d’aneth` as `VEGETABLE_AND_AROMATIC`, scoped to the whole green/flexible umbel of *Anethum graveolens* used in pickling. Added `dill head(s)` and singular descriptive `ombelle d’aneth` search aliases. The French compound remains provisional. Keep leaves, mature dried seeds, pickles, and infused preparations separate; Minnesota’s per-jar direction and NDSU’s 8–16 heads for 4 lb of beans remain source-specific.
- **R895 — abalone name group:** added `abalone (name used for multiple abalone species) / ormeau (nom utilisé pour plusieurs espèces d’ormeaux)` as a separate active reference with plural search inflections. The repeated CFIA `Abalone / Ormeau` pair appears for multiple *Haliotis* taxa. This is a qualified label-name group, not a taxon, exhaustive membership list, harvest/sale authorization, or culinary-equivalence claim. The pre-existing broad candidate and unresolved decision remain unchanged. Northern Abalone remains excluded from aliases and retains its species-specific protection boundary.

No forms, density values, unit mappings, measurement observations, conversions, yields, recipe links, or substitution rules were added. The existing abalone candidate and its eight source entries, including manufacturer-specific evidence, remain unchanged. The new label-group ledger record has no supplier evidence. CNF Food Code 3107 values and supplier quantities remain source-scoped and were not generalized.

## Source review

- R893 primary studies support the edible finger-millet seed-coat fraction as a milling by-product, the source-attested name `ragi bran`, and its specialized food-use context. FAO supports `éleusine cultivée` as the source-grain name only.
- R894 OQLF supports `aneth` for *Anethum graveolens* and botanical `ombelle`; University of Minnesota and North Dakota State Extension document whole dill heads/umbels in pickling. Recipe ratios and maturity instructions remain attached to their cited recipes.
- R895’s current official CFIA Fish List result table recheck found the exact pair for *H. laevigata*, *H. roei*, *H. rubra*, *H. rufescens*, and *Haliotis* spp. The dynamic query URL did not open directly in the browser, but the current indexed official results table was rechecked and its rows are recorded as `R895-S03`. CFIA common-name guidance supports species-linked label names and consideration of multi-species group names. Health Canada CNF Food Code 3107 identifies raw mixed-species abalone; its 100 g edible portion and 90 g food-guide serving remain code-specific. DFO’s Northern Abalone restrictions remain species- and jurisdiction-specific.

See the [R893](../../proposals/wp02-next-generic-grain-gap-review-r893-20261019.md), [R894](../../proposals/wp03-section-k-generic-plant-gap-review-r894-20261019.md), and [R895](../../proposals/wp04-section-p-generic-seafood-gap-review-r895-20261019.md) proposals for source-by-source limits.

## Cross-category scope review

The user clarified that the generic-ingredient scope applies across every ingredient type. A fresh scan of open checklist entries mentioning brands, commercial products, retailers, manufacturers, flavours, or variants found no new queued task limited to a named brand or retailer variant. The two explicit Section F commercial-roster portions remain out of scope because commercial-product counts do not add ingredient diversity; generic cereal diversity remains open. Other open mentions describe broad ingredient classes, evidence-quality and product-measurement rules, evidence-refresh guidance, or the exact specification gate for generic allulose.

Existing branded references and product-specific evidence were preserved. Manufacturer evidence remains usable for generic claims where it applies beyond a named product. No source-specific amount, formula, measurement, or claim was transferred without an independent transferability review.

## Picker and recipe checks

The static projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches take precedence, with substring matching only when no phrase match exists.

- Finger-millet bran exact terms each resolve to one row. `finger millet` and `ragi` resolve to three rows (grain, flour, bran); `millet` resolves to 23, up from 22; `bran` resolves to 22, up from 21.
- `dill head`, `dill heads`, `dill flower heads`, and `ombelles d’aneth` each resolve to the new flower-head row. Broad `dill` and `aneth` each resolve to four rows; this includes the existing canned Québec redfish row through its exact “with dill and mustard” source aliases. That row and its aliases remain unchanged. `dill seed` still resolves only to the seed identity.
- `abalone`, `abalones`, `ormeau`, and `ormeaux` each resolve to the qualified abalone name group. `paua` and `pāua` retain the existing flattened-rice result; `oreille de mer` remains unassigned.
- All 114 manifest-listed recipe files / 1,123 ingredient rows were scanned for the proposed terms; there were zero hits. No recipe link or amount was added.

## Data and validation

After integration the package contains **1,924 references / 201 forms / 114 recipes / 1,123 ingredient rows**. The ledger contains **2,327 records / 10,979 source entries / 9,216 distinct source IDs / 7,836 distinct URLs / 8 unit conversions**. The three new active references have null density and empty unit mappings.

Passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- `validate_research_ledger()`: 2,327 records, 0 errors
- Exact active-reference ownership, source-ID ownership, static picker projections, and the 114-recipe / 1,123-row corpus scan
- UTF-8, no BOM, escaped bundled JSON, scoped whitespace, and local-link checks

No software tests, build, emulator, or deployment were run because the active database changes only add ingredient-catalog JSON, as permitted by `AGENTS.md`.

## File fingerprints

- `ingredient-references.v1.json`: `7f49b2af354df4336ab87c5008c279c4df8045a03ac89dcd920a7d8eb92e5ce5`
- `research-ledger.v1.json`: `03be4ec59be68fe4f3cab04cb39a4cc613367c2bc719bf1e110248577d6982a5`
- `BundledIngredientCatalog.kt`: `6c62dca0828db0a932291d8523952a4f406860142c3ea33eef2122ff509ad6e8`

Sections A7, K, and P remain open for other generic gaps.
