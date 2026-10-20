# WP02 A4 whole barley flour measurement and substitution review — R281 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Integrated on 2026-10-16 in the [R281–R283 integration README](../batches/wp02-wp03-wp04-r281-r283-gap-review-integration-20261016/README.md). The existing ledger record now captures the reviewed measurement and substitution evidence; no reusable measure or rule was added.
- **Scope:** Research the unfinished measurement and substitution fields on the existing `ingredient-ref-whole-barley-flour` identity. This does not reopen its accepted name or create another barley identity.
- **Checklist anchors:** The accepted whole-barley-flour identity under WP02 Section A is recorded at [plan line 250](../../RecipeBook-global-ingredient-catalog-plan.txt#L250). The broader open Section A item at [plan line 1567](../../RecipeBook-global-ingredient-catalog-plan.txt#L1567) still covers other barley flour grades and distinctions.
- **New source-ID namespace:** `WP02-A4-WBF-R281-20261016-S01` through `S07`. The new namespace, output filename, and seven exact URLs were checked against the current catalog archive; none was already owned. Existing source IDs cited below remain owned by their original ledger records and are reused without proposing duplicate source entries.

## Recommendation

**Keep the existing identity and record no reusable measure or substitution rule.** If accepted into the ledger, set `measurementState` to `researched_no_supported_value` and `substitutionResearchState` to `blocked_pending_evidence` for general home-recipe replacement. Record no `measurementObservations`. Add one `substitutionFindings` entry with `researchState: blocked_pending_evidence` for unscoped wheat-flour replacement using whole barley flour; cite the whole-flour study findings and the current product guidance, and record no replacement ratio. Keep `identityState: verified`.

The current row remains `whole barley flour / farine d'orge entière`, with no aliases, `defaultDensity: null`, and empty `unitMappings`. Add no ingredient form, mass-volume conversion, yield, recipe link, global form rule, contextual replacement rule, or ingredient-line substitution. The reviewed ratios are experimental recipe formulations and do not provide a general exchange amount.

## Existing ownership and prior work

The active `ingredient-ref-whole-barley-flour` row has the verified bilingual identity, no aliases, no density, and no unit mappings. Its ledger record still says `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. The forms package has no form attached to this row; neither global nor contextual substitution files contain a rule involving it.

The completed [A4 identity proposal](wp02-a4-whole-barley-flour-grade-boundary-review-20261011.md) deliberately added no measures, forms, or substitutions. The [A6 jau atta review](wp02-a6-jau-atta-barley-flour-alias-review-20261012-round11.md) researches the separate, generic `ingredient-ref-barley-flour` row. It already records the historical generic barley-flour cup value, one study-specific bulk-density result, and formula-scoped flour studies. Those generic-row values do not become whole-barley-flour values merely because one source used whole barley flour in an experiment.

| Nearby row or evidence | Existing scope | R281 boundary |
|---|---|---|
| `ingredient-ref-barley-flour` | `barley flour / farine d'orge`, with its own source-specific historical portion and experimental sample density. | Do not transfer the generic `1 cup unsifted = 0.225 lb` or `0.44 g/mL` sample value to the whole-grain row. The measurement sources do not identify a whole-barley-flour consumer product or a transferable measuring method. |
| `ingredient-ref-malted-barley-flour` | Distinct malted product identity. | No malting form, measurement, or substitution is proposed here. |
| `ingredient-ref-roasted-barley-flour` | Distinct roasted product identity. | No toasted/roasted alias or measurement is proposed here. |
| `ingredient-ref-whole-barley-flour` | Product-grade identity for flour expressly named whole barley flour. | Keep the identity and picker terms intact; only its unresearched measurement and general substitution research are assessed. |
| `candidate-barley-meal` | Separate held meal/grit/texture candidate. | Do not map meal, grits, groats, or semolina findings to this flour. |

No prior proposal was found that specifically researches measurements or substitution behavior for the active whole-barley-flour reference. The new product-page and article URLs below, their proposal-local IDs, and the output path were absent from the existing catalog archive at review time.

## Naming and picker projection

Keep the current exact displays `whole barley flour / farine d'orge entière`. La Milanaise's bilingual product pages support these names [reused identity sources `WP02-A4-WBF-20261011-S01` and `S02`]. Its `T150` equivalence is product-specific; do not add `T150`, `farine T150`, `organic`, or `biologique` as aliases or create a barley-to-wheat-grade crosswalk. Whole-grain milling remains distinct from generic, malted, and roasted barley flour and from barley meal.

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers complete word phrases before falling back to partial matching. Applying that projection to the current ingredient-reference package gives:

| Query | Current results | R281 effect |
|---|---|---|
| `whole barley flour` | 1 — `whole barley flour / farine d'orge entière` | No change. |
| `farine d'orge entière` | 1 — `whole barley flour / farine d'orge entière` | No change. |
| `barley flour` | 4 — generic, malted, roasted, and whole barley flour | No change; retain all four. |
| `farine d'orge` | 4 — generic, malted, roasted, and whole barley flour | No change; retain all four. |

No new alias or form term is proposed, so the picker projection stays unchanged.

## Bundled recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Case-insensitive scans of each row's `originalText`, `ingredientName`, and `ingredientRefId` for `barley`, `whole barley flour`, `farine d'orge`, and the target reference ID found **zero matching ingredient rows**. A broad substring search finds `orge` only inside the French instruction verb `dégorger` in the strawberry-shortcake recipe; it is not a barley ingredient. No recipe link or recipe-specific measure is supported.

The external GoBarley pancake recipe uses `2 cups (500 mL) whole barley flour` but gives no mass equivalent [S05]. This is useful volume-only recipe context, not a bundled recipe match or a volume-to-mass mapping.

## Measurement and conversion evidence

- La Milanaise's current Québec product pages identify its whole barley flour and list a 1 kg package. They provide no household volume, measured flour mass, or conversion. The English and French pages advise combining the flour with wheat flour for best results but give no ratio [reused sources `WP02-A4-WBF-20261011-S01–S02`]. A package mass is not a volume mapping.
- Green Star Organic Milling describes its named barley flour as made from the entire kernel and lists 2 lb, 4 lb, and 20 lb packages [S03]. Its current recipe examples use volume amounts without paired masses. The page is a US maker's source, not a Québec naming authority or an availability claim for this review.
- The Whole Grains Council's Canada-filtered 100% Stamp listing gives Green Star's 20 lb organic barley flour entry as “40 grams” [S01]. Its consumer FAQ explains that this figure is the amount of whole grain in a full product serving [S02]; the listing does not state the product-serving mass, household measure, or cup fill method. Do not import 40 g as a flour portion or conversion.
- GoBarley's nutrition table reports `barley flour (1/4 cup, 37 g)` but explicitly says that flour is made from **pearled barley** [S04]. It is a different milling grade and cannot supply a whole-barley-flour measure.
- The generic barley-flour ledger record cites an older USDA survey's `1 cup, unsifted = 0.225 lb` portion and an experimental sample's `0.44 g/mL` bulk density [existing source IDs `WP02-A6-JAU-ATTA-BARLEY-20261012-S06` and `S07`]. Neither source identifies whole barley flour or a transferable product and measuring procedure. Keep both observations scoped to the generic row.

No reviewed source supports a reusable density, cup-to-mass mapping, or whole-barley-flour portion observation. Keep the user-facing conversion prompt behavior for a missing density; do not silently substitute a generic barley-flour value.

## Substitution and form evidence

GoBarley says flour can be milled from either pearled barley or whole, dehulled barley and used as a complete or partial wheat-flour replacement [S04]. Its general wording gives no ratio and spans two different milling grades. La Milanaise recommends blending its specific whole-barley product with wheat flour but supplies no amount [reused sources `WP02-A4-WBF-20261011-S01–S02`]. These are not executable conversion rules.

Primary studies show why a broad replacement rule would be unreliable:

- One whole-barley-flour biscuit study tested 20% and 40% replacement of wheat flour [S06]. At those study levels, farinograph water absorption changed from 60.5% in the control to 66.2% and 71.0%; the results are tied to the tested flour and biscuit formula. These percentages do not specify how much water a home recipe should add.
- A hull-less-barley bread study used a formula of 80% wholegrain barley flour and 20% wheat flour, with 30 g added wheat gluten; the authors also report processing and sensory tradeoffs [S07]. It is a specific experimental formula, not a barley-to-wheat exchange rule for other dishes.
- The existing Boz study source tests whole barley flour at 20%, 40%, and 60% in bread while varying separate Cephalaria flour and using farinograph-based water handling [reused source `WP02-A6-JAU-ATTA-BARLEY-20261012-S09`]. Its findings remain formula-specific and do not supply a household conversion.

No global same-ingredient form conversion applies: whole-grain milling is part of this identity, not a cooking state. If a future recipe-specific replacement is considered, it is a contextual wheat-to-barley substitution and must be scoped by dish type, ingredient role, and method under [Requirements FR-5 and §6.5](../../../Requirements.md). The current bundle provides no whole-barley-flour line from which to define such a context. Add no form, global rule, contextual rule, preferred alternative, or recipe-line link.

## Source register

New sources were accessed on **2026-10-16**. At proposal stage, R281 source IDs were local to this review. Integration records S01–S07 on the existing whole-barley-flour row and reuses previously owned La Milanaise and barley-study sources without changing their original records.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A4-WBF-R281-20261016-S01` | Whole Grains Council, [Stamped Products search](https://wholegrainscouncil.org/find-whole-grains/stamped-products/search?field_test_country_tid_1=92&items_per_page=100&keys=&order=field_brand_name&page=1&sort=asc&stamp%5B0%5D=100%25&term_node_tid_depth_join=All), Canada-filtered 100% Stamp listing, Green Star Organic Milling barley-flour row. | Lists the 20 lb product with a 100% Stamp and “40 grams.” The grams column is whole-grain content per full serving, not a household flour measure; see S02. |
| `WP02-A4-WBF-R281-20261016-S02` | Whole Grains Council, [Stamp FAQ for Consumers](https://wholegrainscouncil.org/whole-grain-stamp/stamp-faq-consumers), explanation of grams on the Stamp and full-serving whole-grain amount. | Defines the displayed gram figure as the whole-grain amount in a full serving. It does not give the product serving's total mass or volume. |
| `WP02-A4-WBF-R281-20261016-S03` | Green Star Organic Milling, [Barley Flour](https://www.greenstarmilling.com/products/barley-flour), product description, package formats, and recipes. | Names a whole-kernel flour, lists package weights, and gives recipes with volume quantities but no paired masses. US product context; not a Québec terminology source or a claim of current stock. |
| `WP02-A4-WBF-R281-20261016-S04` | GoBarley, [Health and Nutrition](https://gobarley.com/health-nutrition/), whole-barley processing explanation and Table 1. | Distinguishes pearled from whole, dehulled barley and states the 37 g per 1/4 cup barley-flour row is made from pearled barley. It does not provide a whole-barley-flour mass measure. |
| `WP02-A4-WBF-R281-20261016-S05` | GoBarley, [Barley Pancakes](https://gobarley.com/barley-pancakes/), ingredient list. | Specifies 2 cups (500 mL) whole barley flour, with no mass equivalent. The recipe does not support a density or unit mapping. |
| `WP02-A4-WBF-R281-20261016-S06` | [Addition of Whole Barley Flour as a Partial Substitute of Wheat Flour to Enhance the Nutritional Value of Biscuits](https://arabjchem.org/addition-of-whole-barley-flour-as-a-partial-substitute-of-wheat-flour-to-enhance-the-nutritional-value-of-biscuits/), 2021, abstract, formulation tables, and farinograph results. | Tests whole-barley flour at 20% and 40% in one biscuit study and reports increasing water absorption. Formula-specific experimental data; no general home-recipe ratio or water correction. |
| `WP02-A4-WBF-R281-20261016-S07` | [Effects of the addition of waxy and normal hull-less barley flours on the farinograph and pasting properties of composite flours and on the nutritional value, textural qualities, and in vitro digestibility of resultant breads](https://pubmed.ncbi.nlm.nih.gov/32857867/), PubMed abstract and practical application. | Reports an 80% wholegrain hull-less barley flour / 20% wheat flour bread formulation with 30 g wheat gluten and processing/sensory effects. A specialized study formula, not a general substitution. |
| Reused `WP02-A4-WBF-20261011-S01–S02` | La Milanaise, [Organic Whole Barley Flour](https://lamilanaise.com/en/produits/organic-whole-barley-flour/) and [Farine d’orge entière biologique](https://lamilanaise.com/produits/farine-orge-entiere-biologique/), current bilingual product pages. | Preserve the existing identity ownership. Current pages list a 1 kg product format and recommend combining with wheat, but provide no volume-to-mass value or replacement ratio. |
| Reused `WP02-A6-JAU-ATTA-BARLEY-20261012-S06–S07` | USDA, [Manual of Food Codes and Weights for the 1977–78 Nationwide Food Consumption Survey](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/7778/cfe_admin_rep_335.pdf); El-Sherif and Kenawi, [Studies on Some Bakery Products Fortified with Barley and Sorghum Flour](https://jfds.journals.ekb.eg/article_115825_90511f1aef060b1d0f5bc1434f8dde1.pdf). | Existing generic-row evidence for an unsifted barley-flour portion and one experimental bulk-density sample. Neither identifies a whole-barley-flour consumer measure; no transfer is proposed. |
| Reused `WP02-A6-JAU-ATTA-BARLEY-20261012-S09` | Boz, [The Effects of Cephalaria Syriaca Flour on Dough and Bread Containing Different Levels of Barley Flour](https://onlinelibrary.wiley.com/doi/10.1111/jfq.12155), *Journal of Food Quality* (2015), abstract, methods, and results. | Already registered against the generic barley-flour record. It tests whole barley flour in specific bread formulations with separate Cephalaria levels and farinograph-based water; cite the existing ID rather than allocate a duplicate. |

## Local evidence references

- Existing whole-barley-flour identity and deliberate identity-only scope: [WP02 A4 proposal](wp02-a4-whole-barley-flour-grade-boundary-review-20261011.md).
- Generic barley-flour measurement and substitution research: [WP02 A6 jau atta proposal](wp02-a6-jau-atta-barley-flour-alias-review-20261012-round11.md).
- Active source of truth: [whole-barley-flour reference](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [global rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [research ledger](../research-ledger.v1.json), [recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), and manifest-listed recipes.
