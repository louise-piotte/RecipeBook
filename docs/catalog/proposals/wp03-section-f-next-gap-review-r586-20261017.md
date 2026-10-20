# WP03 Section F R586 — Nature’s Path Superseeds & Grains oatmeal review (2026-10-17)

- **Status:** Integrated on 2026-10-17. The coordinator added the product identity and evidence record and updated the Section F plan, roadmap, this proposal, and integration README.
- **Plan anchors:** The open Section F checklist at [line 4516](../../RecipeBook-global-ingredient-catalog-plan.txt#L4525) calls for regionally significant cereal mixes and preprocessed grains. The broader open entries at [line 14940](../../RecipeBook-global-ingredient-catalog-plan.txt#L14968) and [line 15863](../../RecipeBook-global-ingredient-catalog-plan.txt#L15891) retain the same Section F cereal and preprocessed-grain review.
- **Recommendation:** Add one identity-only reference for the specific Nature’s Path Superseeds & Grains instant-oatmeal mix. Keep the product separate from generic oats and its component ingredients. This is distinct from R580’s sorghum source-access hold, R582’s Bob’s Red Mill 7 Grain Hot Cereal, and the R516/R519/R522 Canadian packaged-cereal decisions.

## Integrated reference

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-natures-path-superseeds-grains-oatmeal` |
| English display | `Superseeds & Grains instant oatmeal` |
| French display | `Gruau d’avoine et de supergrains biologique en sachets` |
| Category | `GRAIN_AND_CEREAL` |
| English / French aliases | None |
| Default density / unit mappings | `null` / `[]` |
| Forms, active measurements, recipe links, yields, conversions, substitutions | None |

The English product page identifies this as Nature’s Path’s Superseeds & Grains instant oatmeal and describes a formulated oatmeal product. Its full manufacturer title also includes “Organic,” “Superfood,” and “Gluten Free.” The French Canadian page retains the English product title, while the current Québec Super C listing supplies the French product title above for UPC `058449154006` [S01–S03]. The shorter English display keeps the distinctive product-line name and product type without turning the non-specific “Superfood” marketing descriptor into a singleton picker result.

## Product boundary and Québec wording

Nature’s Path describes the product as a blend of oats, chia, and hemp; its product page also presents buckwheat among the product’s organic ingredients [S01]. The Québec retailer’s label declaration identifies gluten-free whole-oat flakes, buckwheat groats, chia seeds, amaranth flakes, hemp seeds, sorghum flour, and quinoa flakes [S03]. This packaged blend is therefore not interchangeable as an identity with instant oats, rolled oats, or any one of those component ingredients. Keep those active ingredient references separate; do not add component names as aliases.

The French display is copied from the Québec retailer’s product-specific listing, not translated from the manufacturer’s awkward phrase “farine d’avoine super alimentaire.” The product-specific title is appropriate picker wording for this packaged item. OQLF defines *gruau* primarily as a cooked dish made with oat flakes, so do not extend the word to generic dry oats or use it as a broad alias. The OQLF source is terminology context; it does not override the exact Québec retail product title [S03, S06].

The manufacturer’s Canadian French oatmeal collection lists several sibling products carrying the “Superfood” descriptor, including Superseeds & Grains, Cinnamon Pumpkin Seed, Cacao, and Creamy Coconut variants [S05]. Do not add `superfood`, `Qi’a`, or `Nature’s Path` as aliases: those terms describe or identify broader product families. The display pair above leaves the brand and marketing descriptors out of search terms while preserving the distinctive product wording. Existing Nature’s Path entries such as Heritage Flakes, Heritage O’s, and Mesa Sunrise use product-specific displays without a Nature’s Path alias.

## Picker projection and current ownership

The current picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches bilingual names and aliases, preferring complete phrases before substring matches. A static projection of the current reference names plus the proposed bilingual display gives:

| Query | Current result count | With proposed reference | Effect |
|---|---:|---:|---|
| `Superseeds`; `Superseeds & Grains` | 0 | 1 | Resolves to this product. |
| `Superfood`; `Superfood oatmeal` | 0 | 0 | Remains unallocated; avoids a misleading singleton for the manufacturer’s broader Superfood oatmeal family. |
| `oatmeal` | 3 | 4 | Adds this product alongside two PC Blue Menu Supergrains oatmeals and Scottish oatmeal. |
| `supergrains` | 2 | 3 | Adds this product beside the two PC Blue Menu products. Quaker `Super Grains` remains a separate complete phrase. |
| `gruau` | 11 | 12 | Adds one product to the existing broad group. |
| `gruau d’avoine` | 1 | 2 | Returns this product and the existing whole oat-groats reference; that result distinction remains visible. |
| `Nature’s Path`; `Qi’a` | 0 | 0 | No brand or family alias is proposed. |

The candidate reference ID is absent from active references, forms, legacy-import identities, and the research ledger. Exact searches found no prior proposal or batch for this product identity. The English manufacturer product URL, French manufacturer product URL, and French oatmeal collection URL are not registered in the current ledger. The proposal-local source prefix `WP03-NATURESPATH-SUPERSEEDS-R586-20261017-` was checked against the proposal archive and ledger and is unused.

The Super C URL and UPC are already present under `ingredient-ref-amaranth-flakes` as source `WP03-AMARFLAKE-20261012-S02`. That record uses the product’s ingredient declaration to support its amaranth-flake evidence; it is not an existing cereal identity. Preserve that source ID and its current owner. If the product is integrated, the candidate reference should receive its own identity evidence; do not reassign the amaranth-flake source record. OQLF’s `gruau` source ID `WP03-S27` is already reused on other oat and cereal records and likewise should not be duplicated as a new R586 source.

## Recipe demand, measures, and substitutions

I scanned the 114 recipe files listed in the bundled-library manifest and all 1,123 structured ingredient rows. There is no mention of Superseeds & Grains, Qi’a, the manufacturer product name, UPC `058449154006`, or a link to the proposed reference. The bundled corpus gives no recipe-driven reason to add a recipe link, conversion, yield, or substitution.

The manufacturer offers a six-item multipack of 228 g packages, while Québec retailers describe the individual product as six 38 g sachets (228 g total) [S01–S04]. These are package formats, not kitchen measures. The pages do not establish a household cup measure, a reusable per-sachet conversion, or a density. Add no form under instant oats because this is a multi-ingredient packaged blend. No source reviewed here supports replacing another cereal or grain with this product, or replacing this product with its oat, chia, hemp, or other component ingredients. Add no global or contextual substitution rule.

## Sources

| ID / ownership | Source and evidence | Limitation |
|---|---|---|
| `WP03-NATURESPATH-SUPERSEEDS-R586-20261017-S01` | Nature’s Path Canada, [Superseeds & Grains Superfood Gluten Free Instant Oatmeal](https://naturespath.com/en-ca/products/superseed-hot-oatmeal-np-ca). Current manufacturer product page identifies the product, offers a six-item multipack of 228 g packages, and describes oats with chia and hemp. The product image text includes UPC `058449154006`. | The page showed “Sold out” when checked. That store status is time-sensitive and does not establish discontinuation or local availability. Packaged unit mass is not a household measure. |
| `WP03-NATURESPATH-SUPERSEEDS-R586-20261017-S02` | Nature’s Path Canada, [SuperSeeds & Grains Superfood Oatmeal, 228 g Boîte](https://naturespath.com/fr-ca/products/superseeds-grains-superfood-oatmeal-228-g-boite). The Canadian French manufacturer page has the same product image/UPC and offers a six-item multipack of 228 g packages. | Its product title remains English; the translated body uses the unsuitable literal wording “farine d’avoine super alimentaire.” It does not provide a clean French title or a serving-to-mass conversion. It also showed “Épuisé” when checked. |
| Existing source `[S03]` `WP03-AMARFLAKE-20261012-S02`, still owned by `ingredient-ref-amaranth-flakes` | Super C Québec, [Gruau d’avoine et de supergrains biologique en sachets — Nature’s Path](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/gruau-d-avoine-et-de-supergrains-biologique-en-sachets/p/058449154006). The Québec product listing identifies the French title, 6 × 38 g package, UPC, and the composite ingredient declaration. | Direct page retrieval returned HTTP 403; the current search index exposes the listing. The existing ledger entry is specifically ingredient evidence for amaranth flakes. Do not move that source ID or use retailer data as a current stock guarantee. |
| `WP03-NATURESPATH-SUPERSEEDS-R586-20261017-S04` | Metro, [Gruau d’avoine supergrains en sachets Qi’a](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/gruau-d-avoine-supergrains-en-sachets/p/058449154006). Corroborates the product code, Qi’a brand context, local French naming, and 6 × 38 g package. | The available page snapshot is old and reports out-of-stock at its selected store. Use only as corroborating product-title evidence, not as current availability or a family roster. |
| `WP03-NATURESPATH-SUPERSEEDS-R586-20261017-S05` | Nature’s Path Canada, [Organic Oatmeal collection (fr-CA)](https://naturespath.com/fr-ca/collections/gruau). Lists the Superseeds & Grains item among its oatmeal products and shows other Superfood oatmeal siblings. | The collection is not a complete global or historical SKU roster, and product availability labels on the collection page conflict with the individual product pages. It supports sibling-term boundaries only. |
| Existing OQLF source `[S06]` `WP03-S27`; terminology only | OQLF, [gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau). Defines the Québec term for cooked oatmeal and notes that the sense can extend to a dish made from other cereals. | Not a product-label source. Reuse the existing terminology source only; do not add or reassign an R586 ledger source. |

## Recommendation summary

The coordinator added the single identity-only `GRAIN_AND_CEREAL` reference with the bilingual display pair and empty aliases. The Nature’s Path brand and UPC remain in source evidence, not as search aliases. Ingredient components remain separate identities; active forms, numeric conversions, density, recipe links, yields, and substitutions are unchanged. Section F remains open. No software tests, build, emulator check, or deployment were run because this integration only adds database JSON data and planning documentation under `AGENTS.md`. See the [R586 integration README](../batches/wp03-section-f-natures-path-superseeds-grains-integration-r586-20261017/README.md).
