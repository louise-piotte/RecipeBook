# WP07 maple-syrup portion evidence review — R293 — 2026-10-16

## Scope and recommendation

- **Status:** Integrated on 2026-10-16. The existing maple-syrup ledger record now contains the identity review and ten historic CNF portion observations; no active conversion behavior or recipe line changed.

This WP07 follow-up covers the open measurement record `ingredient-ref-maple-syrup`. It is separate from R291 (WP03 Section F, crispy rice cereal) and R292 (WP04 Section Q, salted duck egg). I reviewed the current plan, roadmap, ingredient references, forms, substitution-rule files, research ledger, and proposal archive before selecting this gap.

The live reference is `maple syrup / sirop d'érable` in `SUGAR_AND_SWEETENER`, with no aliases, no default density, and no unit mappings. Its ledger record is identity `unreviewed`, measurement `blocked_pending_evidence`, and substitution research `not_yet_researched`; the record has no sources or observations. WP07 remains `in_review`, and its open priority is frequent pantry measurements ([plan, WP07 at line 1186](../../RecipeBook-global-ingredient-catalog-plan.txt)).

**Decision:** retain the existing bilingual identity and product boundary; mark its identity reviewed using OQLF and CFIA evidence; and record the 2015 CNF bulk and prepackaged values below as separate, explicitly historical `portion_weight` observations. Do not add an active density, unit mapping, form conversion, or substitution. The 2026 CNF has been published, while Health Canada identifies the online serving-size interface as 2015 interim data. The current 2026 Measure Weight Conversion CSV was not retrievable in this review, so this proposal makes no claim about whether that file contains a maple-syrup row. Keep any active volume-to-weight behavior unresolved until that exact 2026 row can be checked.

## Identity, picker, and corpus review

OQLF identifies *sirop d'érable* as the preferred French term and *maple syrup* as its English equivalent [S03]. CFIA defines maple syrup as a pure single-ingredient food obtained exclusively by concentrating maple sap or diluting/solving another maple product in potable water [S04]. This supports the existing bilingual name and keeps maple-flavoured/table syrups and the separate maple sugar, maple butter, and maple taffy identities out of this reference. OQLF's aged contextual phrase *sirop du pays* is not proposed as an alias.

The current picker projection was checked against all 1,663 live reference names and aliases using the same normalized phrase-first behavior as `IngredientReferenceSearchIndex`:

| Query | Live result |
|---|---|
| `maple syrup` | One result: `ingredient-ref-maple-syrup` |
| `sirop d'érable` | One result: `ingredient-ref-maple-syrup` |
| `maple` | Seven results: maple butter, maple sugar, maple syrup, maple taffy, and three named maple-flavoured cereals |
| `érable` | The same seven results as `maple` |

The broader queries already expose neighboring products without aliases that collapse them into syrup. No display change or alias is needed.

The bundled recipe package has three direct ingredient rows across three recipes:

| Recipe and row | Existing line | Relevance |
|---|---|---|
| 001 Air Fryer Baked Oats, row 8 | `1 tbsp maple syrup` | Direct volume use; 15 mL is a CNF source portion, but the recipe's tablespoon convention is not independently attested. |
| 025 Maple Pecan Cranberry Squares, row 6, Filling | `1/2 cup maple syrup` | Direct volume use; do not convert this cup to a metric volume because the recipe cup convention is not stated. |
| 085 Maple Chicken, row 7 | `3 1/2 tbsp maple syrup` | Direct volume use; no recipe edit or weight inference is proposed. |

Recipe 065 also mentions maple syrup as an example in an optional, unlinked “sweetener, to taste” note. It is not an exact maple-syrup ingredient row and is not treated as a fourth linked demand.

There are no `IngredientForm` rows attached to maple syrup and no global or contextual substitution rule referencing it. The existing [WP08 granulated-sugar review](wp08-granulated-sugar-liquid-sweetener-review-20261016.md) discusses replacing granulated sugar **with** maple syrup on the granulated-sugar record; its conflicting, adjustment-dependent baking advice is directional and does not establish a substitute **for** maple syrup. Do not copy that evidence onto this record or create a rule. Leave `substitutionResearchState` `not_yet_researched`.

## Historical CNF 2015 portions

The current official CNF serving-size pages report these available portions for separate foods. Each exact value can be retained as an edition- and food-code-qualified observation, not as a general maple-syrup density:

| CNF food code and descriptor | Published volume portion | Published mass | Source |
|---|---:|---:|---|
| 4326, `Sweets, syrups, maple, bulk` | 15 mL | 20.0 g | [S01](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326) |
| 4326, bulk | 30 mL | 39.9 g | [S01](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326) |
| 4326, bulk | 100 mL | 133.1 g | [S01](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326) |
| 4326, bulk | 125 mL | 166.4 g | [S01](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326) |
| 4326, bulk | 250 mL | 332.9 g | [S01](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326) |
| 6175, `sweets, syrups, maple, prepackaged` | 15 mL | 20.9 g | [S02](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175) |
| 6175, prepackaged | 30 mL | 40.6 g | [S02](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175) |
| 6175, prepackaged | 100 mL | 135.3 g | [S02](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175) |
| 6175, prepackaged | 125 mL | 169.1 g | [S02](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175) |
| 6175, prepackaged | 250 mL | 338.1 g | [S02](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175) |

Both CNF pages say “Available serving size(s)” and identify the 2015 online file (page modified 2019-03-01). They do not state how volume measures were filled or which product composition was sampled. The separate CNF classes also differ at every shared volume (for example, 15 mL is 20.0 g for bulk and 20.9 g for prepackaged). Preserve the values separately with their CNF code and 2015 edition; do not average them, fit a density, extrapolate a cup measure, or treat them as current 2026 observations. The tautological “100 grams of edible portion = 100 grams” line is not a useful conversion observation.

Health Canada's current CNF information page says CNF 2026 is distributed as relational CSV files and that the online 2015 CNF remains an interim access route [existing source `WP03-QCM-20261012-S05`]. The official 2026 Measure Weight Conversion resource is listed at [the current CSV URL, existing source `WP03-CNF2026-QUINOA-R267-S02`](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). Opening that resource and the dataset page returned HTTP 403 in the available web retrieval. I therefore did not inspect the 2026 food-name/measure-name/measure-type join for maple syrup; this is an access limitation, not evidence of a missing row. A later review should retrieve and join those official files by food and measure codes before considering active mappings.

The ledger now preserves the historical observations as source-specific evidence while keeping measurement research blocked for the unresolved 2026 check. `defaultDensity` remains null, `unitMappings` remains empty, the app picker is unchanged, and recipe quantities remain untouched.

## Source register and ownership

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP07-MAPLE-SYRUP-R293-20261016-S01` | Health Canada, [CNF 2015 serving-size page, code 4326](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326). Accessed 2026-10-16. | Exact available portions for the bulk descriptor only; no pour/fill method or general conversion. Exact URL had no existing owner in `docs/catalog/`. |
| `WP07-MAPLE-SYRUP-R293-20261016-S02` | Health Canada, [CNF 2015 serving-size page, code 6175](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175). Accessed 2026-10-16. | Exact available portions for the prepackaged descriptor only; no pour/fill method or general conversion. Exact URL had no existing owner in `docs/catalog/`. |
| `WP07-MAPLE-SYRUP-R293-20261016-S03` | Office québécois de la langue française, [GDT: *sirop d'érable*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358382/sirop-derable), last updated 2014. Accessed 2026-10-16. | Preferred French term and English equivalent; definition and variability note. Not measurement or substitution evidence. Exact URL had no existing owner. |
| `WP07-MAPLE-SYRUP-R293-20261016-S04` | CFIA, [Importing maple syrup and maple products](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/maple-products), modified 2026-01-13. Accessed 2026-10-16. | Current Canadian single-ingredient maple-syrup boundary; not a measure or substitution source. Exact URL had no existing owner. |
| Existing `WP03-QCM-20261012-S05` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page dated 2026-06-19. | CNF 2026 is the available relational dataset; 2015 online pages are interim. Reuse the existing source ID for this exact overview; it does not provide food-level portions. |
| Existing `WP03-CNF2026-QUINOA-R267-S02` | Health Canada, [CNF 2026 Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Reuse the existing source ID for this exact CSV URL. It identifies the required current file, but this review's 403 response prevented inspection of the maple row; no maple-specific result or absence claim is assigned to it. |

The older CFIA Volume 6 URL is already owned as `WP02-C-GS-20261011-S03` in the golden-syrup identity review, which already keeps maple syrup distinct. No second ID was minted for that URL and that decision was not reopened. The proposal filename and four new source IDs were checked against the current proposal archive and catalog sources; no collision was found. Integration changed only the research ledger, plan, roadmap, proposal, and batch README.

## Review checks

- Read current `AGENTS.md`, `Requirements.md`, the WP07 plan section, `roadmap.md`, live ingredient references/forms/rules, research ledger, and proposal/batch archive; confirmed R291 and R292 cover different work and found no prior maple-syrup measurement packet.
- Confirmed exact bilingual picker queries are unique and broader maple queries still surface seven separate products.
- Counted the three direct recipe-linked rows in the bundled package; did not infer metric equivalents from the recipe cup or tablespoon convention.
- Verified the CNF 2015 values and product descriptors against Health Canada's serving pages, then checked the current CNF publication notice and direct 2026 measure-file route. The 2026 retrieval returned 403; no row-presence or absence assertion is made.
- Checked source-ID and exact-URL ownership, reused the two existing CNF 2026 contextual source IDs, and reused the existing CFIA Volume 6 ownership by reference.
- Integration keeps `measurementState` blocked pending review of the 2026 conversion row, while preserving ten historical 2015 `portion_weight` observations. It leaves `defaultDensity` null, `unitMappings` empty, substitutions not yet researched, and recipe lines unchanged.
- Final totals: 1,663 references, 127 forms, 2,013 research-ledger records, 8,878 source entries, 7,516 distinct source IDs, and 6,277 distinct URLs. The recipe bundle remains 114 recipes and 1,123 ingredient rows.
- Static database/ledger checks passed. No software tests, builds, or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
