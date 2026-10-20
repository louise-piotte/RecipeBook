# WP03 Section F R491 — Cocoa Loops cereal identity review (2026-10-17)

## Decision

- **Recommendation:** Add one identity-only reference for `Cocoa Loops cereal / Céréales Cocoa Loops` in `GRAIN_AND_CEREAL`.
- **Proposed ID:** `ingredient-ref-cocoa-loops-cereal`.
- **Status:** Proposal only. No active catalog, forms, legacy identities, research ledger, recipes, plan, roadmap, workflow, or generated index were changed.
- **Scope boundary:** This is the named cocoa cereal product. Keep it distinct from Froot Loops cereal, Cocoa Puffs, chocolate cereals, and generic cocoa/cacao. Do not add `Froot Loops`, `cocoa cereal`, or other broad terms as aliases.

Section F remains open for packaged cereals and other grain products ([plan, Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L552)). This review has no overlap with the Chex family resolved in R488.

## Proposed identity

| Field | Proposed value | Evidence limit |
|---|---|---|
| ID | `ingredient-ref-cocoa-loops-cereal` | Not allocated in the active catalog or ledger. |
| Category | `GRAIN_AND_CEREAL` | A named ready-to-eat cereal product. |
| English display | `Cocoa Loops cereal` | WK Kellogg Canada SmartLabel's current product title is `Kellogg's Cocoa Loops Cereal`. |
| Québec French display | `Céréales Cocoa Loops` | WK Kellogg Canada's French locator and Québec-facing retail listings use this product name. |
| English/French aliases | None | The exact product phrase is in the displays. Do not use `Froot Loops` or generic cocoa/cereal wording as aliases. |
| Density / unit mappings | `null` / `[]` | SmartLabel reports one product-specific serving portion; it does not support a reusable kitchen measure, density, or mapping. |
| Forms, yields, conversions, recipe links, substitutions | None | No preparation state or cooking equivalence is established here. |

The manufacturer describes Cocoa Loops as a separate cocoa product associated with its Froot Loops brand family. Its own product title and current Canadian product record support a distinct named cereal identity, not an alias of Froot Loops or a cocoa ingredient. Keep any brand-family relation out of picker aliases.

## Ownership and archive audit

The read-only audit used the current workspace snapshot: **1,769 ingredient references** (252 in `GRAIN_AND_CEREAL`), **143 forms**, **56 legacy-import candidates**, and **2,127 research-ledger records** containing **9,725 source entries**, **8,241 distinct source IDs**, and **6,954 distinct source URLs**.

| Surface | Finding |
|---|---|
| Active references and aliases | No exact normalized owner for `Cocoa Loops`, `Cocoa Loops cereal`, `Céréales Cocoa Loops`, or the proposed ID. Existing cocoa and chocolate identities do not contain the full product phrase. |
| Ingredient forms | No exact proposed phrase or proposed ID among the 143 active forms. No form is proposed. |
| Legacy-import candidates | No exact proposed phrase or proposed ID among the 56 candidates. |
| Research ledger | No Cocoa Loops text or proposed identity ID in the 2,127 records. The exact WK Kellogg French locator URL is already registered as `WP03-ALL-BRAN-FAMILY-R203-20261016-S03` on four All-Bran records. If this proposal is integrated, reuse that source ID and extend its locator to the Cocoa Loops listing; do not register the URL twice. Other source URLs and the four R491 source IDs below have no exact ledger owner. |
| Prior proposal and batch archive | No Cocoa Loops identity review or integration was found. The current R488 Chex decisions remain separate. |

## Phrase-first picker projection

This is a static projection using the current `IngredientReferenceSearchIndex` terms and phrase-first matching behavior. It is not an Android picker test.

| Query | Current results | With proposal | Effect |
|---|---:|---:|---|
| `Cocoa Loops` | 0 | 1 | Returns Cocoa Loops cereal. |
| `Cocoa Loops cereal` | 0 | 1 | Returns Cocoa Loops cereal. |
| `Céréales Cocoa Loops` | 0 | 1 | Returns Cocoa Loops cereal. |
| `loops` | 0 | 1 | Returns the named Loops cereal. |
| `cocoa` | 8 | 9 | Adds the product to cocoa searches through its English display. |
| `cacao` | 8 | 8 | Unchanged; no unsupported French cacao alias is added. |
| `cereal` / `céréales` | 52 / 48 | 53 / 49 | Adds one branded cereal to each broad language query. |
| `Froot Loops` | 0 | 0 | Remains unowned; Cocoa Loops is not mapped to the Froot Loops product. |
| `chocolate cereal` | 0 | 0 | Remains unowned; the source-backed Cocoa Loops display does not add a broad chocolate-cereal alias. |

## Bundled recipe corpus

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It searched the recipe JSON and ingredient rows for Cocoa Loops, Cocoa Loops cereal, Céréales Cocoa Loops, and the proposed reference ID.

- Matching recipe files: **0**.
- Matching ingredient rows: **0**.
- No recipe link or substitution is proposed.

## Measurement and substitution evidence state

The identity is source-supported. If integrated, set `measurementState: researched_no_supported_value` to record that no reusable catalog measure is supported. The active SmartLabel product record (GTIN `00059724103757`) reports **Per 1 cup (33 g)**. Preserve that one product-specific serving as a ledger-only `manufacturer_label` `portion_weight` observation; do not derive or add a density, `defaultDensity`, unit mapping, or conversion. SmartLabel does not state the cup volume or fill method, so do not equate its labeled cup with RecipeBook's cup or use the observation for another cereal. The manufacturer's and retailers' package sizes remain SKU identifiers, not kitchen measures. Leave `substitutionResearchState: not_yet_researched`; no substitute was assessed.

Proposed ledger observation (not an active catalog mapping):

| Field | Proposed value |
|---|---|
| Observation ID | `cocoa-loops-smartlabel-cup-33g-r491-20261017` |
| Relationship / evidence | `portion_weight` / `manufacturer_label` |
| Product scope | Kellogg's Cocoa Loops Cereal, GTIN `00059724103757`, as sold |
| Source quantity | `1 cup`, as printed on this product's Canadian SmartLabel; volume convention and fill method are unstated |
| Observed mass | `33 g` |
| Source | `WP03-COCOA-LOOPS-R491-20261017-S02` |
| Quantity basis | Product-specific nutrition-label serving only; not transferable and not a reusable recipe measure or density |

## Sources

Sources were checked on 2026-10-17. The R491 source IDs are proposal-local and remain unallocated in the research ledger.

| Source ID / reuse | Source | Support and limits |
|---|---|---|
| `WP03-COCOA-LOOPS-R491-20261017-S01` | WK Kellogg Canada, [Kellogg's Froot Loops](https://www.wkkellogg.ca/en/our-foods/our-brands/froot-loops). | Current Canadian brand page lists `Kellogg's Cocoa Loops Cereal` as a separate product alongside the Less Sugar, with Marshmallow, and original Froot Loops cereals. This supports the product boundary under the Froot Loops brand; SmartLabel S02 supplies the exact Cocoa Loops product record and nutrition label. |
| `WP03-COCOA-LOOPS-R491-20261017-S02` | WK Kellogg Canada SmartLabel, [Cocoa Loops product record](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724103757). | Current Canadian product record identifies Cocoa Loops (GTIN `00059724103757`), distributor WK Kellogg Canada Corp., and prints the nutrition serving **Per 1 cup (33 g)**. Retain this as one product-specific portion observation only. The page does not state the cup volume or filling method; it does not establish a reusable recipe quantity, density, or mapping. |
| `WP03-COCOA-LOOPS-R491-20261017-S03` | Super C, [Céréales pour la famille, page 2](https://prod-ereceipt.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille-page-2). | Current Québec-facing French listing uses `Kellogg's Céréales au cacao, Cocoa Loops`. This supports the local product name, not stock at a particular store. The broader `au cacao` wording is not proposed as an alias. |
| `WP03-COCOA-LOOPS-R491-20261017-S04` | Costco Business Centre, [Cocoa Loops Céréales](https://www.costcobusinesscentre.ca/p/-/cocoa-loops-cereal-879g/4201055702?langId=-25). | Current Canadian French product listing uses the Cocoa Loops name. The listed bulk package quantity is SKU-specific and is not a kitchen measure. |
| Reuse `WP03-ALL-BRAN-FAMILY-R203-20261016-S03` | WK Kellogg Canada, [Où acheter](https://www.wkkellogg.ca/fr/ou-acheter), Québec region. | Current official French locator lists `Céréales Cocoa Loops`; it showed zero online retailers for that product when reviewed. This records manufacturer terminology and locator status only; it does not establish that the product is unavailable or discontinued. Its exact URL is already owned by the All-Bran family source entry, which should be reused and extended if integrated. |

## Test requirement

This is proposal-only, so no tests, builds, emulator checks, or deployment were run. If accepted as additions only to database JSON, the `AGENTS.md` database-JSON rule requires no software tests.

## Recommendation

Accept one `Cocoa Loops cereal / Céréales Cocoa Loops` reference with no aliases, forms, active measures, recipe links, conversions, yields, or substitutions. If integrated, retain the SmartLabel's `1 cup (33 g)` as the single product-specific `portion_weight` observation above, set `measurementState: researched_no_supported_value`, and leave density and unit mappings empty. Keep substitution research `not_yet_researched`, preserve the product boundary, and reuse the existing French manufacturer-locator source ID.
