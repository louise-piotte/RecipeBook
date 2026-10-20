# WP03 Section F R592 — Trix cereal identity review (2026-10-17)

- **Status:** Integrated as an identity-only catalog reference and verified ledger record. See the [integration README](../batches/wp03-section-f-trix-cereal-identity-integration-r592-20261017/README.md).
- **Open plan anchors:** The Section F item at [line 4516](../../RecipeBook-global-ingredient-catalog-plan.txt#L4525) calls for regionally significant cereal mixes and preprocessed grains. The broader Section F reviews remain open at [line 14940](../../RecipeBook-global-ingredient-catalog-plan.txt#L14968) and [line 15863](../../RecipeBook-global-ingredient-catalog-plan.txt#L15891).
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for the Canadian Trix ready-to-eat cereal. Keep it separate from generic grain and component ingredients. This is distinct from R586’s Nature’s Path Superseeds & Grains oatmeal, R589’s unresolved CNF 2026 quick-oats row join, R580’s sorghum access hold, R582’s Bob’s Red Mill 7 Grain Hot Cereal, and the completed Sugar Crisp, Honeycomb, and Honey Bunches of Oats reviews (R516, R519, R522).
- **Proposed reference:** `ingredient-ref-trix-cereal` — English display `Trix cereal`; French display `Céréales Trix`; category `GRAIN_AND_CEREAL`; no aliases.

## Evidence and product boundary

General Mills Canada’s English page names Trix and calls it a cereal. It describes six shapes of crispy puffs with fruit flavours. The manufacturer’s Canadian French page likewise calls it “La céréale” and describes six crispy-ball shapes [S01–S02]. Metro’s Québec listing uses the product-specific title “Céréales en forme de fruits, Trix,” refers to “les céréales Trix,” and lists a 303 g package under product number `065633150836` [S03].

The suggested French display, `Céréales Trix`, is a concise FR-CA catalog rendering supported by the manufacturer’s French wording and the Québec retailer’s product description. It is not presented as an OQLF ruling or exact retailer heading. Keep Metro’s full “en forme de fruits” product title as source evidence rather than an alias: adding `fruits` could redirect a broad fruit query to this cereal. Do not add `General Mills`, generic “fruit cereal” wording, or the family name as aliases.

Metro’s listing declares whole-grain corn, sugars, rice flour, oils, and other ingredients [S03]. This is evidence of one formulated, packaged cereal; it does not make the cereal synonymous with corn, rice flour, fruit, or any ingredient in its declaration. Keep the product distinct from corn flakes, puffed corn, and other named finished cereals. The product’s recipe, ingredient proportions, and formulation may change; no component links or recipe-specific composition claims are proposed.

## Proposed catalog scope

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-trix-cereal` |
| Category | `GRAIN_AND_CEREAL` |
| English display | `Trix cereal` |
| French display | `Céréales Trix` |
| English / French aliases | None |
| Forms and match terms | None |
| Default density / unit mappings | `null` / `[]` |
| Active measurements, recipe links, yields, conversions, substitutions | None |

The bilingual display pair is enough to support the specific cereal and its brand query. Do not add separate fruit-flavour, puff, corn, rice-flour, or component forms. The current sources give no safe basis for a reusable cup measure, density, unit mapping, or conversion. Metro’s 303 g is a package mass, not a kitchen measure. General Mills’ 14 g whole-grain statement is not the total mass or volume of a cereal serving [S01–S03]. No reviewed source supports a product yield or replacing this cereal with another cereal or grain; add no global or contextual substitution rule.

## Picker projection

The current phrase-first picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches bilingual display names and aliases, preferring complete word phrases before substring fallback. A static projection using its normalization and matching order gives:

| Query | Current results | With proposal | Effect |
|---|---:|---:|---|
| `Trix`; `Trix cereal`; `Céréales Trix` | 0; 0; 0 | 1; 1; 1 | Each resolves to this named cereal. |
| `cereal`; `céréales` | 70; 66 | 71; 67 | Each broad cereal query gains one result. |
| `fruit`; `fruity`; `Céréales en forme de fruits` | 14; 0; 0 | 14; 0; 0 | No generic fruit or retailer-title alias is added. |
| `corn flakes` | 1 | 1 | Existing exact phrase result is unchanged. |
| `General Mills` | 0 | 0 | No manufacturer alias is proposed. |

No component ingredient, flavor, shape description, or brand-family alias is needed for picker recall. The broad cereal-result increase is expected for a named finished cereal.

## Catalog ownership and bundled recipe demand

The read-only audit covered active references, forms, legacy-import identities, research-ledger records and source URLs, plus the proposal and batch archives. The live snapshot has 1,812 ingredient references, 154 forms, 56 legacy candidates, and 2,182 research-ledger records. Exact case-insensitive searches found no owner for the proposed reference ID, UPC `065633150836`, or the Trix product name in those catalog and ledger records. The exact manufacturer and Metro URLs below have no current ledger owner. Before this proposal was created, the R592 round and proposal-local source prefix `WP03-SECTIONF-TRIX-CEREAL-R592-20261017-` were unallocated in the proposal, batch, roadmap, and ledger archives. No existing source ID is being reassigned or reused.

I scanned all 114 recipe files listed in the bundled-library manifest and their 1,123 structured ingredient rows. Exact searches of full recipe JSON and ingredient rows for Trix, UPC `065633150836`, and the French retailer title found zero matching recipe files and zero matching rows. There is no bundled-recipe demand for a recipe link, ingredient quantity, or substitution.

## Sources

| Proposal-local source ID | Direct source and evidence | Limit |
|---|---|---|
| `WP03-SECTIONF-TRIX-CEREAL-R592-20261017-S01` | General Mills Canada, [Trix](https://www.generalmills.ca/our-food/brands/trix). The current Canadian manufacturer page identifies Trix as a cereal and describes six crispy puff shapes and 14 g of whole grain per serving. | Does not provide a full ingredient declaration, total serving mass/volume, or Québec retail availability. Whole-grain grams are not total cereal serving mass. |
| `WP03-SECTIONF-TRIX-CEREAL-R592-20261017-S02` | General Mills Canada (fr-CA), [Trix](https://www.generalmills.ca/fr-ca/our-food/brands/trix). Calls Trix “La céréale” and provides current French product-family wording. | Supports French-language cereal terminology, not a Québec terminology ruling, package weight, or full ingredient declaration. |
| `WP03-SECTIONF-TRIX-CEREAL-R592-20261017-S03` | Metro Québec, [Céréales en forme de fruits, Trix](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-en-forme-de-fruits/p/065633150836). The indexed Québec product listing and opened page snapshot show the Trix cereal, UPC `065633150836`, 303 g package, and French ingredient declaration. | The search index was crawled last month, while the opened page snapshot reports an older crawl; treat it as Québec product-name and SKU corroboration only. Retailer data and formulation may change. It is not evidence of a household measure, serving conversion, or current store availability. |

## Review checks

- [x] Confirmed the open Section F plan anchors and that R592 was not previously allocated.
- [x] Checked active reference, form, legacy, ledger, proposal, and batch ownership for the candidate, source URLs, and source-ID prefix.
- [x] Checked manufacturer English/French wording and a Québec retailer listing for FR-CA naming.
- [x] Projected phrase-first picker results, including broad cereal and fruit queries.
- [x] Scanned all manifest-listed recipes and structured ingredient rows for candidate demand.
- [x] Kept measures, forms, mappings, recipe links, yields, conversions, and substitutions out of scope where sources do not support them.
- [x] No software tests, builds, emulator runs, or deployment were performed for this proposal-only review.


## Integration outcome

Added `ingredient-ref-trix-cereal` with the proposed bilingual display and no aliases, forms, measurements, mappings, recipe links, yields, conversions, or substitutions. The evidence record keeps package details and whole-grain grams as product context only; they are not serving measures. Static JSON/package, generated-index, source-ownership, picker, corpus, encoding, link, and whitespace checks passed. No application tests, build, emulator check, or deployment were needed for this database-JSON addition under `AGENTS.md`.
