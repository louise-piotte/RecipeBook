# WP04 Section P R523 — fish-floss product boundary review

- **Reviewed:** 2026-10-17
- **Status:** Documented hold; no catalog or shared-ledger changes.
- **Scope:** Current Canadian human-food retail wording for fish floss, the species/flavour variants shown by one Canadian seller, available French naming, exact live-catalog and source ownership, picker projections, and the complete bundled recipe corpus.
- **Recommendation:** Keep generic `fish floss` unallocated from active references and the shared research ledger for now. Current Canadian evidence confirms a real named fish product family, but its Québec-facing French product name and a sufficiently clear consumer-level boundary are not established. Do not create species-specific marlin, pollock, or tuna floss rows from one seller’s assortment.
- **Mutation scope:** This is a proposal-only hold. No shared reference, form, legacy mapping, recipe link, ledger record, source entry, measure, conversion, yield, or substitution is proposed. No tests, build, emulator, or deployment were run.

## Decision in context

The open WP04 Section P checklist covers fish powder, fish balls, surimi, and other named seafood work; the broader fish and regional-seafood headings remain open in the [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6228) and [roadmap](../../../roadmap.md). Fish floss is not currently named as its own checklist item; this review considers it under the open regional/named-seafood coverage and the [fish-product gap](../../RecipeBook-global-ingredient-catalog-plan.txt#L7590). It does not reopen the [dried fish-maw hold](wp04-section-p-dried-fish-maw-product-boundary-review-20261013-round30.md), the [generic fish-powder hold](wp04-section-p-generic-fish-powder-boundary-review-r190-20261016.md), or the [surimi-sticks hold](wp04-section-p-fish-powder-surimi-gap-review-r387-20261017.md).

Chuang’s Company’s current Canadian product index groups **Pollock Floss**, **Marlin Fish Floss**, and **Seaweed & Sesame Tuna Fish Floss** in one dry-grocery assortment. Its separate soy-floss products show that the unqualified word `floss` spans non-fish items too. The marlin listing gives a 200 g package presentation, but neither listing supplies a complete ingredient declaration, species composition, preparation specification, Québec French product label, or recipe-use amount. The listings support retailer naming and multiple product variants, not a universal formula or one species-specific record. [S01, S02]

The Canadian Intellectual Property Office (CIPO) uses `fish floss` in an active food-goods registration. A CIPO French trademark journal includes several fish-floss renderings in a goods list, including `rousong de poisson`, `chair de poisson effilochée`, and `flocons de chair de poisson séchée`; the Emerald Seas application is identified as English-language, and the journal’s notice says French descriptions of English-language applications are translated. Another French CIPO journal entry describes `filaments de poisson séché [fish floss]` in retail-service wording. These are Canadian administrative/trademark descriptions, not a food standard, an OQLF term decision, or a Québec package label. They do not establish which French display is understood as the product name in Québec. [S04–S06]

Because the corpus has no candidate-specific demand and the French consumer label remains unsettled, keep the general category unallocated. Revisit after a Québec-facing human-food package or recipe supplies a clear bilingual product name and enough ingredient/process context to distinguish fish floss from other shredded, flaked, powdered, or fish-paste products.

## Bounded scope and exclusions

The research target is the market phrase `fish floss` for a prepared edible fish product. This review does **not** assert that all products carrying that name have the same species, ingredients, seasoning, moisture, or process. It makes no identity claim for a specific marlin, pollock, tuna, or salmon product.

Keep the phrase distinct from:

- soy or vegetable `floss` products;
- fresh or simply shredded fish flesh, fish flakes, fish jerky, dried bonito, or dried-fish snacks;
- fish powder, feed-grade fish meal, fish stock, fish sauce, fish balls, fish cakes, surimi paste, finished surimi products, and fish tofu;
- fish maw / swim bladder, roe, and other fish organs;
- the catalog’s active crab-flavoured pollock-flakes identity and named fish species.

No alias, form, measure, density, unit mapping, recipe link, conversion, package yield, cooking or rehydration rule, or substitution is proposed. A 200 g retail package is SKU-specific and supplies no household measure or recipe quantity. No reviewed source establishes a replacement ratio with any other fish product.

## Ownership and archive audit

The read-only audit covered active ingredient references and forms, legacy import identities, the research ledger, the live plan and roadmap, and the proposal/batch archive. Normalized term searches found no owner for `fish floss`, `marlin fish floss`, `pollock floss`, `tuna fish floss`, `salmon fish floss`, `rousong`, `rousong de poisson`, `rou song`, `chair de poisson effilochée`, `filaments de poisson séché`, or the candidate ID `ingredient-ref-fish-floss` in live references, forms, legacy candidates, or ledger records. The exact phrase and proposed identity also have no prior focused proposal or integration. The R30 fish-maw, R190 fish-powder, and R387 surimi work concerns different products and remains unchanged.

No exact URL below or `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S01` through `S06` source ID is currently owned in the research ledger or proposal/batch archive. Each ID maps to exactly one URL in the source register. Since this is a hold, those IDs are proposal citations only; do not add them to the shared ledger as part of this review.

| Live artifact | Current total | SHA-256 |
|---|---:|---|
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,797 | `bb380278585b32b2785b8b1bad1907b5f1b1b3903ef32ad5c5c345a849f11923` |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| [Legacy import identities](../legacy-import-identities.v1.json) | 56 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json) | 2,153 records; 9,886 source entries; 8,365 distinct source IDs; 7,075 distinct URLs | `28211fb36c8cec0819fd763715866ff8da0150d25cbe374055b0f198aa8009a5` |
| [Bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete word-phrase matches first, and falls back to substring matches. The projection below was calculated against all current reference names, aliases, and attached form terms. The hypothetical row has only `fish floss / rousong de poisson`; it has no extra aliases and is **not** recommended for integration.

| Query | Current | Hypothetical row | Interpretation |
|---|---:|---:|---|
| `fish floss` | 0 | 1 | Exact English product phrase would return the hypothetical group row. |
| `rousong de poisson` | 0 | 1 | The proposed French display would return that row; it is not verified as Québec consumer wording. |
| `fish` | 13 | 14 | Remains a broad multi-result query. |
| `poisson` | 12 | 13 | Remains a broad multi-result query. |
| `pollock` | 4 | 4 | No pollock alias is proposed. |
| `tuna` | 9 | 9 | No tuna alias is proposed. |
| `marlin` | 0 | 0 | No species-specific alias is proposed. |
| `floss` | 0 | 1 | A bare query would return only fish floss even though the same Canadian retailer lists soy-floss products; do not add an unqualified `floss` alias. |

The broad `fish` and `poisson` queries would not become singletons. The product-class risk is narrower: the source material does not support turning one retailer’s English/Chinese assortment into a French-Canadian picker identity, and a species-specific row would make the broad `fish floss` phrase appear to select that one species/product.

## Full bundled-recipe scan

The scan parsed every manifest-listed recipe JSON file and every structured ingredient row, searched the full decoded recipe text, and separately checked ingredient rows and existing reference links. It covered `fish floss`, marlin/pollock/tuna/salmon floss, `rousong`, `rou song`, `yu song`, `yú sōng`, `魚鬆`, `鱼松`, `rousong de poisson`, `chair de poisson effilochée`, `filaments de poisson séché`, and `flocons de chair de poisson séchée`.

- **114 manifest-listed recipes** and **1,123 ingredient rows** scanned.
- **753,988 exact recipe-file bytes** scanned.
- **Zero matching recipe files, ingredient rows, or linked rows.**
- Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path encoded as UTF-8, a NUL byte, exact recipe-file bytes, and a NUL byte, in manifest order.

The empty corpus result is a demand finding for the current bundle, not evidence that the product is unavailable in Canada or never used in Québec.

## Evidence limits and follow-up

- Chuang’s is a current Canadian seller with Canadian offices, but its listing does not identify the complete formula or processing method. Its 200 g figure is the package quantity for one listed SKU only. [S01–S03]
- The current product index presents species and flavour variants under similar floss wording; it does not establish that they share exact ingredient lists, preparation, storage, or substitution behavior. [S01]
- CIPO’s registered goods and French trademark text establish that the terms are used in Canadian registry records. They are not regulatory food definitions, OQLF recommendations, or current Québec consumer packaging. [S04, S05]
- No Québec-facing bilingual package or recipe selecting a French fish-floss term was verified. The recipe bundle supplies no evidence to choose among the recorded French renderings.
- No product or recipe source supports a unit measure, density, rehydration yield, package yield, conversion, or substitution. Do not infer any from package mass or from shared fish-protein content.

**Follow-up:** Keep the proposed identity unallocated. Reopen if a Québec-facing human-food listing or recipe provides the bilingual name and product panel/context, or if a language authority resolves a stable Québec French term. Then repeat the ownership, picker, and full-corpus audit before adding an identity, aliases, variants, forms, or any numeric behavior.

## Source register

| ID | Source and locator | Evidence and limits | Existing owner |
|---|---|---|---|
| `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S01` | Chuang’s Company Ltd., [Dry Grocery product index](https://chuangscompany.ca/collections/dry-grocery-%E4%B9%BE%E9%9B%9C%E8%B2%A8), current listings for Pollock Floss, Marlin Fish Floss, Seaweed & Sesame Tuna Fish Floss, and soy-floss variants; accessed 2026-10-17. | Current Canadian retailer terminology and assortment evidence. Listings do not establish full ingredient panels, processing, or equivalence among variants. | None; exact URL absent from ledger and archive. |
| `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S02` | Chuang’s Company Ltd., [Marlin Fish Floss](https://chuangscompany.ca/products/marlin-fish-floss-%E5%BB%BA%E6%A6%AE%E6%97%97%E9%AD%9A%E9%AC%86), title and 200 g / unit presentation; accessed 2026-10-17. | Current product page supports one named marlin SKU and its package quantity. It does not publish its ingredients, French label, preparation details, or a recipe measure. | None; exact URL absent from ledger and archive. |
| `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S03` | Chuang’s Company Ltd., [Contact Us](https://chuangscompany.ca/zh-cn/pages/maps), Toronto division in Markham, Ontario and Vancouver division in Richmond, British Columbia; accessed 2026-10-17. | Establishes the seller’s Canadian operating addresses; does not establish where the specific SKU is stocked or distributed. | None; exact URL absent from ledger and archive. |
| `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S04` | Canadian Intellectual Property Office, [Nissui Logo registration 2240278](https://ised-isde.canada.ca/cipo/trademark-search/2240278), registered goods, Nice class 29; current status checked 2026-10-17. | The active Canadian registration includes `Fish floss` among fish goods. A goods list is not a product formula, Canadian retail label, or identity standard. | None; exact URL absent from ledger and archive. |
| `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S05` | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 71, no 3618, 28 février 2024 (édition française)](https://publications.gc.ca/collections/collection_2024/opic-cipo/RG42-2-71-3618-fra.pdf), p. 231, Emerald Seas application 1,972,887, filed in English; fish-goods wording includes `rousong de poisson`, `chair de poisson effilochée`, and `flocons de chair de poisson séchée`; accessed 2026-10-17. | The journal notice explains that French descriptions for English-language applications are translated. These Canadian registry translations neither select a Québec-preferred consumer name nor show that the expressions are interchangeable aliases. | None; exact URL absent from ledger and archive. |
| `WP04-SECTIONP-FISH-FLOSS-R523-20261017-S06` | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 72, no 3664, 15 janvier 2025 (édition française)](https://publications.gc.ca/collections/collection_2025/opic-cipo/RG42-2-72-3664-fra.pdf), search-indexed retail/wholesale service entry including `filaments de poisson séché [fish floss]`; the PDF page number was not independently verified because direct extraction exceeded the browser's content limit; accessed 2026-10-17. | Supplies another French registry rendering, but in a services description rather than product packaging or a language-authority recommendation. It reinforces the naming evidence limit, not a preferred Québec term. | None; exact URL absent from ledger and archive. |
