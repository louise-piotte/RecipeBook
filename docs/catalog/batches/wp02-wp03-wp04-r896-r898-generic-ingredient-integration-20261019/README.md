# WP02/WP03/WP04 R896–R898 generic ingredient integration

Date: 2026-10-19
Scope: generic culinary ingredient diversity across grain milling, plant parts, and seafood naming.

## Decisions

- **R896 — pearl-millet bran:** added identity-only `pearl millet bran / son de millet perle` as `GRAIN_AND_CEREAL`, with no aliases. The French compound remains provisional. Two primary studies support a grain-qualified bran fraction/by-product and specialized food-component research use. The cited CFTRI report PDF could not be loaded during root review and was excluded from the ledger; its reported 20% bread formula is not active evidence.
- **R897 — kohlrabi leaves:** added identity-only `kohlrabi leaves / feuilles de chou-rave` as `VEGETABLE_AND_AROMATIC`, with only part-qualified English and French aliases. OQLF supports the base crop name and taxon; the crop/taxon connection to Ricardo's leaf wording is cross-source inference. University sources support culinary leaf use. Cooking analogies, storage directions, and recipe instructions remain source-scoped.
- **R898 — sea-cucumber name group:** added a separate visibly qualified `sea cucumber (name used for multiple species) / concombre de mer (nom utilisé pour plusieurs espèces)` reference as `PROTEIN`, with plural search inflections only. The exact CFIA bilingual pair applies to multiple taxa. This is a shared label-name group, not a taxon, species list, edible-part identity, marketing authorization, or culinary-equivalence claim.

For R898, the existing `candidate-sea-cucumber` record, its unresolved decision, measurement state, and all 13 source entries remain unchanged. The giant-red and orange-footed species references and the orange-footed dried-body-wall form also remain unchanged. The new group reuses only the previously reviewed generic OQLF name source; it does not copy species- or product-specific candidate evidence.

No forms, density values, unit mappings, measurement observations, conversions, yields, recipe links, or substitution rules were added. All three new references have null density and empty unit mappings. Product-, recipe-, storage-, processing-, study-, and label-specific claims remain within their source contexts.

## Source review

- R896 PubMed and PMC records directly support pearl-millet bran-rich milling fractions, the processing by-product description, and specialized research as a food component. OQLF supports `millet perle` as the crop term only, not the full French bran compound. The CFTRI report could not be fetched in root review and is not in the active ledger.
- R897 OQLF identifies `chou-rave / kohlrabi` and *Brassica oleracea* var. *gongylodes*; Ricardo uses the exact phrase `feuilles de chou-rave` and describes raw/cooked use; University of Minnesota and Iowa State Extension describe culinary use of the leaves/greens. No measure or storage rule was transferred.
- R898 current indexed CFIA Fish List results show the exact `Sea Cucumber / Concombre De Mer` pair for multiple species, including *Athyonidium chilensis*, *Cucumaria frondosa*, *Holothuria scabra*, and *Parastichopus tremulus*. The dynamic query endpoint did not render directly in the web reader; the official indexed results table was rechecked. OQLF supports the generic name and multi-species wording but cautions against it as a Québec fish-product marketing label; CFIA guidance says group names may be considered for multiple species.

See the [R896](../../proposals/wp02-next-generic-grain-gap-review-r896-20261019.md), [R897](../../proposals/wp03-section-k-kohlrabi-leaves-identity-review-r897-20261019.md), and [R898](../../proposals/wp04-section-p-sea-cucumber-generic-name-group-review-r898-20261019.md) proposals for detailed source limits and identity boundaries.

## Cross-category scope review

The user clarified that the generic-ingredient scope applies across every ingredient type. A fresh scan of open checklist entries found no task limited to a named brand, product line, flavour family, SKU, or retailer variant. The two explicit Section F commercial-roster portions remain out of scope because commercial-product counts do not add ingredient diversity; generic cereal diversity remains open. Other brand/manufacturer mentions describe source quality or measurement-scoping rules, not roster work.

Existing branded references and product-specific evidence were preserved. Manufacturer sources remain usable for generic claims where evidence applies beyond a named product. No product-specific measure or claim was transferred without an explicit transferability review.

## Picker and recipe checks

The static projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches take precedence, with substring matching only when no phrase match exists.

- `pearl millet bran` and `son de millet perle` resolve to the new bran row. `pearl millet` / `millet perle` add the bran beside existing grain and flour rows; `bran` gains one generic row.
- `kohlrabi leaves`, `kohlrabi leaf`, `kohlrabi greens`, `feuilles de chou-rave`, and `feuille de chou-rave` resolve to the new leaf row. Broad `kohlrabi` / `chou-rave` also returns the existing crop row; no bare leaf/greens/cabbage alias was added.
- `sea cucumber`, `sea cucumbers`, `concombre de mer`, and `concombres de mer` resolve to the qualified group alongside the existing species references where applicable. Species names and product-part terms remain species-scoped; no *holothurie*, *bêche-de-mer*, *bêche de mer*, *biche-de-mer*, *trepang*, *tripang*, or *sea slug* alias was added.
- All 114 manifest-listed recipe files / 1,123 ingredient rows were scanned for the proposed terms; there were no candidate-specific recipe hits. No recipe line or amount was added.

## Data and validation

After integration the package contains **1,927 references / 201 forms / 114 recipes / 1,123 ingredient rows**. The ledger contains **2,330 records / 10,990 source entries / 9,224 distinct source IDs / 7,843 distinct URLs / 8 unit conversions**. The 13-source `candidate-sea-cucumber` record is unchanged (stable serialized-record SHA-256: `cc73af81af79664013f8ea97217a9b0a7c2a9f8780cd04e1405ffca13947bbd2`).

Passed:

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- `validate_research_ledger()`: 2,330 records, 0 errors
- Exact reference/source ownership, candidate-preservation fingerprint, static picker projection, and the 114-recipe / 1,123-row scan
- UTF-8/no-BOM, escaped bundled JSON, local Markdown links/anchors, and scoped whitespace checks

No software tests, build, emulator, or deployment were run because these active changes only add database JSON data, as permitted by `AGENTS.md`.

## File fingerprints

- `ingredient-references.v1.json`: `a33922a3158ec8e5ea056ab677ec88bb548c20021493a0f9ab35ab27ea4da2a7`
- `research-ledger.v1.json`: `4db499e82dcfbb3fbd75f803aefd9814dacc602728e6c627bb8836ef53315656`
- `BundledIngredientCatalog.kt`: `59cb54e71a7cd6c57187e0c6cf928fbf13c8b24a1f09bdcf0ca9925d8ef6e1af`

Sections A7, K, and P remain open for other generic gaps.
