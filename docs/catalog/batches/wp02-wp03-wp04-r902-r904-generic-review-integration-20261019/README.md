# WP02/WP03/WP04 R902–R904 generic ingredient review and integration

Date: 2026-10-19

Scope: generic culinary ingredient diversity across grain milling, edible plant parts, and seafood naming.

## Decisions

- **R902 — quinoa bran:** Reviewed the generic milling fraction and kept it out of active picker data. Primary milling and bread research establish a named quinoa fraction and experimental food use, while an independent study reports a saponin concern for its tested samples. The accessible evidence does not establish the processing state of the bread-study material or a transferable food-use boundary for a generic recipe-picker ingredient. Study sample values, fractions, methods, formulas, and outcomes stay source-specific; no household saponin-removal method or category-wide safety claim is inferred. Reopen when transferable food-processing evidence establishes the ingredient boundary, then review the provisional French display. The [TUM indexed abstract](https://portal.fis.tum.de/en/publications/impact-of-quinoa-bran-on-gluten-free-dough-and-bread-characteristics/), [CFTRI milling study](https://ir.cftri.res.in/14798/), [Oxford Academic fractionation study](https://academic.oup.com/ijfst/article/58/12/6530/7807322), and [PubMed study abstract](https://pubmed.ncbi.nlm.nih.gov/37600465/) were reviewed. The CFTRI page describes dehulled, polished study input; that processing and any residual saponin level are not generalized.
- **R903 — grape leaves:** Added identity-only `grape leaves / feuilles de vigne` (`ingredient-ref-grape-leaves`) as `VEGETABLE_AND_AROMATIC`, limited to food-grade culinary leaves of cultivated grapevine with *Vitis vinifera* directly documented. Added only `grape leaf` and `feuille de vigne` singular aliases. The [OQLF dolma entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502233/dolma) supports Québec wording and cooked-wrapper context; the [UIC Heritage Garden page](https://heritagegarden.uic.edu/grape-vitis-vinifera) supports edible leaf use for the titled plant. RICARDO’s page could not be opened directly and was excluded from ledger evidence. Its indexed recipe amounts and directions were not generalized.
- **R904 — conch name group:** Added qualified `conch (name used for multiple gastropod taxa) / conque (nom utilisé pour plusieurs taxons de gastéropodes)` (`ingredient-ref-conch-market-group`) as `PROTEIN`, with plural search inflections only. The directly reviewed [CFIA Fish List results table](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s) shows the exact `Conch / Conque` pair for both *Lobatus gigas* and *Strombus* spp. CFIA’s [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) supports only the species-linked naming context and says group names may be considered; it does not approve the catalog-authored qualified display. The [OQLF strombe entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358684/strombe) and [Government of Canada Queen Conch notice](https://www.canada.ca/en/environment-climate-change/services/environmental-enforcement/notifications/import-queen-conch-meat.html) support culinary context only within their stated genus/species scopes. This name group is not a taxon, species assignment, product specification, label authorization, or culinary-equivalence claim.

## Preservation and cross-category scope

- R904 created a new record and did not convert `candidate-conch`. The candidate’s unresolved decision, all 13 source entries, and all product-specific observations remain unchanged. The current CFIA results-table URL already had two sea-cucumber-scoped ledger owners; R904 adds a separate conch-scoped source entry and leaves those records untouched. Queen/Pink Conch, *Strombus gigas*, *Strombus* spp., Busycon/whelks, and adjacent shellfish names remain distinct; no product measure, species claim, or product state was transferred.
- R903 kept grape fruit, juice, seed flour, oil, and verjuice separate. It added no recipe link, form, density, unit mapping, measure, conversion, yield, or substitution. Its measurement and substitution research remains open.
- R904 added no form, density, unit mapping, measure, conversion, yield, recipe link, or substitution. Its measurement and substitution research remains open. The 114-recipe scan found no matching conch recipe file or ingredient row.
- R903’s scan found no grape-leaf mention in the 114 bundled recipes and 1,123 ingredient rows. No recipe-specific amount or direction was carried into the catalog.
- The cross-category queue review marked the two Section F cereal commercial-roster clauses out of scope because commercial-product counts do not add ingredient diversity. The R902–R904 disposition is appended to the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md). Further Anson Mills named-product-only wheat-meal research remains out of scope for the same reason; preserve its historical R605 record and product-specific evidence. No other brand, product-line, flavour, SKU, or retailer-only task was pursued here.
- Existing branded rows and their source evidence remain intact. Manufacturer pages remain usable for generic claims only when the claim genuinely transfers beyond the named product. Product-specific measurements remain scoped to their products.

## Picker projection

A static projection using the current phrase-first then substring fallback in [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) confirms:

- `grape leaves`, `grape leaf`, `feuilles de vigne`, and `feuille de vigne` resolve to `ingredient-ref-grape-leaves`.
- `conch`, `conchs`, `conque`, and `conques` resolve to the visibly qualified name group. `Queen Conch`, `strombe`, and Busycon-specific `conque canaliculée` remain unassigned.
- No candidate products or species were made aliases for either new reference.

## Validation

Passed:

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — 1,932 references
- `validate_research_ledger()` — 2,335 records, zero errors
- Exact reference/source ownership and picker phrase projections for the new terms
- UTF-8 without BOM; bundled JSON keeps non-ASCII text as explicit Unicode escapes
- Local proposal/README links and plan line anchors; scoped whitespace checks

The R899–R901 reference and ledger fingerprints are reproduced exactly after removing only the R903 and R904 appended entries. This preserves all previous rows and records, including branded entries and the unresolved conch candidate.

Current package totals: **1,932 references / 201 forms / 114 recipes / 1,123 ingredient rows**. Current ledger totals: **2,335 records / 11,010 source entries / 9,236 distinct source IDs / 7,853 distinct URLs / 8 unit conversions**.

No software tests, build, emulator, or deployment were run. The only active catalog changes add database JSON data, which `AGENTS.md` explicitly exempts from testing; R902 is a documentation-only hold.

## File fingerprints

- `ingredient-references.v1.json`: `772f5a7b9aa7d541f1afdd5c4c1bd04cb620b8a44db2697ac1423666c5e2217b`
- `research-ledger.v1.json`: `6e4eaee4bc077bd939e88c52cf872c25f92df858ed38e882a4598f1d6553aac5`
- `BundledIngredientCatalog.kt`: `0387cf5affcc2181be98fd9efa9ce13cc5df2ea834e9136f44a44fb3d9adbd90`
- Recovered R899–R901 snapshot after excluding only R903/R904 additions: references `dd3773adee9d6a3c9750cba37aac2385be09b43a429c7061eb032a1a4d5aacf4`; ledger `e2e7f8b10b6cf57198b2dce099f3f8d12e48fe6fcb32f8dbc54bf18f414ab85a`.
