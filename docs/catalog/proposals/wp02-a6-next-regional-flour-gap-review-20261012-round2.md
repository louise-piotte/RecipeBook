# WP02 A6 Regional Flour Review: Makki Atta / Makki Ka Atta — 2026-10-13

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Integrated on 2026-10-13. The existing reference now has the two accepted English aliases; source-specific CNF observations and research limits are recorded in the ledger. See [the integration note](../batches/wp02-a6-makki-atta-alias-integration-20261013/README.md).
- **Scope:** Review the English flour names **makki atta** and **makki ka atta** as search aliases for the existing whole-kernel corn-flour identity. This is not a new ingredient identity or a review of every maize product.
- **Plan context:** WP02 A6 remains open for regional grain flours. Generic and species-specific millet flours, fonio, Job's tears, quinoa/amaranth variants, kodo/proso/foxtail millet flours, the reviewed holds, and sprouted buckwheat flour are already accounted for in the plan and recent proposals. This review does not reopen them.
- **Proposal-local source IDs:** WP02-A6-MAKKI-ATTA-20261013-S01 through S06. This prefix was absent from the ledger and proposal archive at the snapshot below.
- **Existing Québec terminology sources reused:** S5-corn-flour and S5-cornmeal, already attached to the corresponding live ledger records; both were rechecked on 2026-10-13.

## Recommendation

Add the English aliases **makki atta** and **makki ka atta** to the existing reference **ingredient-ref-whole-kernel-corn-flour**, displayed as **whole-kernel corn flour / farine de maïs**. Keep the reference category, displays, French aliases, forms, density, and unit mappings unchanged. Do not allocate a new reference ID.

The exact Canadian product wording and product descriptions reviewed here identify these phrases with maize flour made from whole corn. The current Canadian examples include a Burlington mill's Makki Atta page describing flour stone-ground from whole dried corn, a Greater Toronto Area listing titled “Deep Corn Flour/Makki ka Atta,” and a Canadian marketplace listing titled “Corn Flour (Makki Ka Atta)” whose ingredient statement is “Organic whole yellow corn flour” [S02–S04]. The FSSAI standard independently defines whole maize flour as ground from whole kernels and distinguishes its separate degermed maize-meal standard [S01]. These sources support an alias-only mapping to the existing whole-kernel flour identity.

| Candidate or field | Disposition | Evidence boundary |
|---|---|---|
| makki atta | **Accept as an English alias** on ingredient-ref-whole-kernel-corn-flour. | Exact wording appears in a Canadian mill product title; the maker describes that product as stone-ground from whole dried corn [S02]. This is product naming, not a universal process or grind specification. |
| makki ka atta | **Accept as an English alias** on the same reference. | Exact wording appears on a current GTA grocery listing and a Canadian retail listing. The latter pairs the name with an ingredient statement for whole yellow corn flour [S03–S04]. The marketplace information is seller-supplied and is not independently verified by Walmart. |
| French display and aliases | Retain farine de maïs; leave aliasesFr empty. | OQLF defines the preferred Québec term as fine powder of ground maize. No reviewed Québec source establishes a French Makki term [S5-corn-flour]. |
| makki da atta, makki ki atta, makai atta, makka atta, makkai atta, makki flour | **Do not add in this bounded review.** | They are not part of the two exact phrases approved for review here. A broad makka query already reaches the separate corn-poha reference through its makka poha alias. |
| Unqualified corn flour or maize flour | Keep unassigned as aliases. | OQLF documents corn flour as Québec English for farine de maïs and as a United Kingdom English term for cornstarch. The picker also returns several qualified corn-flour identities for corn flour [S5-corn-flour]. |
| Cornmeal, corn meal, semoule de maïs | Retain on ingredient-ref-cornmeal. | OQLF defines semoule de maïs as a milling of dried maize grains and says it may be fine, medium, or coarse. The FSSAI degermed-meal standard provides a distinct product scope; neither source justifies moving all cornmeal names to the whole-kernel-flour row [S01, S5-cornmeal]. |
| Cornstarch, masa harina, precooked corn flour, roasted corn flour | Retain their existing separate identities. | These names refer to extracted starch, nixtamalized flour, source-named precooked flour, and source-named roasted flour, respectively. No equivalence is proposed. |
| New ID, form, recipe link, conversion, yield, or active substitution | Do not add. | The evidence supports two names only. Measurement observations remain source-scoped, and no reusable substitution rule is supported. |

## Identity and product boundaries

The accepted alias target is the existing untreated whole-kernel corn-flour row. FSSAI's current 2025 cereal standard says whole maize flour is prepared by grinding whole maize kernels so that the entire grain is comminuted. It separately describes degermed maize meal as ground from kernels from which bran and germ are removed [S01]. Its quality and sieve criteria are regulatory product standards, not household measures, and are not being added to the catalog.

The Québec OQLF entry defines farine de maïs as fine powder of ground maize and maps its English term corn flour to a UK use of cornstarch as well. OQLF defines semoule de maïs separately as ground dried maize and allows fine, medium, and coarse grinds [S5-corn-flour; S5-cornmeal]. Keep the whole-kernel flour and cornmeal identities distinct. Do not infer that every product sold as cornmeal is degermed; the FSSAI standard specifically concerns degermed maize meal.

The live catalog also has separate rows for cornstarch / fécule de maïs, masa harina / farine de maïs nixtamalisée, precooked corn flour / farine de maïs précuite, and roasted corn flour / farine de maïs torréfiée. Makki wording found in the reviewed product pages does not establish any equivalence with these products. Do not alias colored maize, sweet-corn flour, masa, meal, grits, starch, precooked flour, or roasted flour under the two proposed phrases.

The listing of traditional uses such as makki di roti or cornbread is product or culinary context. It does not define a standardized ingredient form, a universal particle size, or a substitution ratio.

## Live catalog, ledger, exact-key, and snapshot audit

Snapshot read from the shared workspace on 2026-10-13. Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Store | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,329 rows | 9b7f314205bddd57e6dab025c73dbcc4e96d945a3f8b0f349af3e6b832669853 |
| Ingredient forms | 98 rows | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import candidates | 64 rows | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Research ledger | 1,637 records; 6,089 source entries; 5,105 distinct source IDs; 8 unit conversions | a976db6579ae00a627c2f95633dfd5955c3d82b62a4e77ebd0ac553c685437b2 |
| Seed manifest | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

The active target row is ingredient-ref-whole-kernel-corn-flour, category FLOUR_AND_STARCH, with empty alias arrays, defaultDensity null, and unitMappings empty. No form is attached to it. Its ledger record is verified; measurementState and substitutionResearchState are both not_yet_researched. There is no active reference, form, legacy candidate, or ledger record ID for a new Makki flour identity, and this proposal allocates none.

Exact normalized-key ownership was checked across active reference displays and aliases, form display and match terms, legacy candidate names and aliases, and ledger record IDs. Normalization follows the project search key: lowercase, NFKD, fold accents and the œ/æ/ß/& cases, replace punctuation with spaces, then collapse whitespace.

| Exact normalized key | Active reference owner | Form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| makki atta | none | none | none | none |
| makki ka atta | none | none | none | none |
| whole-kernel corn flour | ingredient-ref-whole-kernel-corn-flour | none | none | none |
| farine de maïs | ingredient-ref-whole-kernel-corn-flour | none | none | none |
| cornmeal / corn meal / semoule de maïs | ingredient-ref-cornmeal | none | none | none |
| corn flour | none | none | none | none |
| cornstarch | ingredient-ref-cornstarch | none | none | none |
| masa harina | ingredient-ref-masa-harina | none | none | none |
| precooked corn flour | ingredient-ref-precooked-corn-flour | none | none | none |
| roasted corn flour | ingredient-ref-roasted-corn-flour | none | none | none |

Current French labels and English canonical names for the comparison rows are:

| Live ID | Current display pair | Boundary |
|---|---|---|
| ingredient-ref-cornmeal | cornmeal / semoule de maïs | Fine, medium, and coarse are grind descriptions under this identity. |
| ingredient-ref-cornstarch | cornstarch / fécule de maïs | Extracted starch. |
| ingredient-ref-masa-harina | masa harina / farine de maïs nixtamalisée | Nixtamalized product. |
| ingredient-ref-precooked-corn-flour | precooked corn flour / farine de maïs précuite | Separate precooked product identity. |
| ingredient-ref-roasted-corn-flour | roasted corn flour / farine de maïs torréfiée | Separate source-named roasted product identity. |
| ingredient-ref-whole-kernel-corn-flour | whole-kernel corn flour / farine de maïs | Proposed alias target. |

## Picker phrase behavior

IngredientSearch normalizes the query and candidate terms, prefers complete contiguous word-phrase matches, then falls back to substring matches. The results below were simulated against all current reference and form search terms, then repeated with only the two proposed aliases appended to the target reference.

| Query | Current result | With proposed aliases | Effect |
|---|---|---|---|
| makki atta | none | ingredient-ref-whole-kernel-corn-flour | Exact qualified phrase selects the target alone. |
| makki ka atta | none | ingredient-ref-whole-kernel-corn-flour | Exact qualified phrase selects the target alone. |
| makki | none | ingredient-ref-whole-kernel-corn-flour | Phrase containment inside the aliases returns the target; this broad query does not become a bare Makki alias. |
| atta | 5 references: amaranth flour, atta, barley flour, buckwheat flour, finger-millet flour | Those 5 plus ingredient-ref-whole-kernel-corn-flour | Generic atta remains broad; the new result is the expected phrase overlap. |
| makka | ingredient-ref-corn-poha | unchanged | The existing makka poha alias stays on the separate corn-poha identity; neither proposed alias uses makka. |
| corn flour | precooked, roasted, and whole-kernel corn flour | unchanged | The picker displays qualified choices; the exact unqualified key remains without an owner. |
| farine de maïs | masa harina, precooked, roasted, and whole-kernel corn flour | unchanged | The broader French phrase still shows the qualified choices. |
| cornmeal / semoule de maïs | ingredient-ref-cornmeal | unchanged | Meal remains distinct. |
| cornstarch | ingredient-ref-cornstarch | unchanged | Extracted starch remains distinct. |
| maize flour | none | none | No broad alias is added. |
| farine de maïs précuite / farine de maïs torréfiée | the corresponding precooked / roasted row alone | unchanged | Qualified process names remain on their current rows. |

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned after project-style normalization. Candidate phrases included makki atta, makki ka atta, makki da atta, makki ki atta, makai atta, makka atta, makkai atta, and makki flour. Comparison phrases covered whole-kernel corn flour, farine de maïs, cornmeal/corn meal/semoule de maïs, cornstarch, masa harina, precooked and roasted corn flour, and their qualified French names.

- Candidate Makki phrases: **0 recipe-file hits and 0 ingredient-row hits**.
- Whole-kernel corn-flour phrases and direct ingredientRefId links to ingredient-ref-whole-kernel-corn-flour: **0**.
- Cornmeal phrases: **0**.
- Other maize-product comparator hits: **8 recipe files / 9 ingredient rows**, all for cornstarch. These rows remain attached to ingredient-ref-cornstarch and are not Makki or whole-kernel-flour demand.

No bundled recipe supports a recipe link, amount, instruction, substitution, or new identity for Makki flour.

## Measurements, density, and substitutions

Health Canada's Canadian Nutrient File serving page identifies food code 4417 as “Grains, corn flour, yellow, whole-grain” / “Grains céréaliers, farine de maïs, jaune, grain entier.” It lists 100 mL = 49.5 g, 250 mL = 123.6 g, and one serving = 20.0 g [S05]. These are published Canadian database portions for the named whole-grain yellow corn-flour food, not a measurement of any Makki retail package, recipe, or defined packing method.

If integrated, record those exact source-scoped observations on the existing ledger record and set measurementState to researched_supported. Preserve the CNF food description and food code. Do not derive or activate a general g/mL density; leave defaultDensity null and unitMappings empty. Do not turn the 20 g database serving into a recipe serving or recipe-line measure.

The retailer and maker pages mention traditional roti or other uses, but give no reusable substitution ratio [S02–S04]. Rai et al. tested maize-meal replacement in a defined wheat-bread study; they observed higher water absorption as maize-meal proportion increased, reduced loaf weight/volume/height at higher levels, and reported 25% replacement as more acceptable than the control [S06]. The study describes maize meal, not a Makki product identified as whole-kernel corn flour. It does not support a global flour replacement, a contextual substitution rule, a conversion to or from cornmeal, or a recipe-line link.

If integrated, set substitutionResearchState to blocked_pending_evidence for a reusable rule. Keep all active global and contextual substitutions, yields, forms, conversions, and recipe links empty.

## Integration record

Root applied the following data changes:

1. Append only makki atta and makki ka atta to aliasesEn on ingredient-ref-whole-kernel-corn-flour. Retain the existing display pair, empty aliasesFr, FLOUR_AND_STARCH category, null defaultDensity, and empty unitMappings.
2. Add sources S01–S06, the reused OQLF cornmeal terminology source S5-cornmeal, and one accepted alias decision to the existing ingredient-ref-whole-kernel-corn-flour ledger record. Retain its existing S5-corn-flour entry.
3. Record the CNF amounts as source-specific observations and set measurementState to researched_supported; do not activate an active density or unit mapping.
4. Set substitutionResearchState to blocked_pending_evidence and add no global or contextual substitution rule.
5. Add no new reference, form, legacy identity, recipe link, conversion, yield, or French alias. Keep the broad WP02 A6 checklist open.

The review left application behavior and recipe data unchanged. Root integrated only the accepted aliases, source-scoped CNF observations, ledger evidence, and the generated ingredient index. No app or emulator tests were run because this was a catalog-data update with no behavior change.

## Sources

All new web sources below were checked on 2026-10-13. Proposal-local source IDs are not ledger entries.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-A6-MAKKI-ATTA-20261013-S01** | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (07.05.2025), §§2.4.21 and 2.4.24, PDF pp. 62–68. Whole maize flour is made by grinding whole maize kernels so the entire grain is comminuted; its separate degermed maize meal and grits standard specifies removal of bran and germ. | Indian regulatory standard used for product boundary only. It does not define the South Asian name Makki atta, a Canadian product, a recipe measure, or household behavior. Its quality and sieve values are not imported. |
| **WP02-A6-MAKKI-ATTA-20261013-S02** | The Ancient Pantry, Burlington, Ontario, [Makki Atta (Maize Flour)](https://www.ancientpantry.ca/products/maize-flour-makki-atta). The product title uses Makki Atta and its indexed maker description says it is stone-ground from whole dried corn. | Current manufacturer listing surfaced in search on 2026-10-13; direct page fetch returned a cache miss, so use the indexed title and description only. Stone grinding, freshness, nutrition, package size, and product claims are maker-specific. |
| **WP02-A6-MAKKI-ATTA-20261013-S03** | GroceryBee, Greater Toronto Area, [Deep Corn Flour 2lb](https://grocerybee.ca/products/corn-flour). Current product page says “Deep Corn Flour/Makki ka Atta (2 Lb)” and identifies the seller as a GTA grocery business with an Etobicoke address. | Local retailer wording establishes the Canadian market phrase. The listing does not provide a full ingredient declaration or a standardized milling description. Package mass is not a recipe measure. |
| **WP02-A6-MAKKI-ATTA-20261013-S04** | Walmart Canada, [Taj Mahal Organic Corn Flour (Makki Ka Atta)](https://www.walmart.ca/en/ip/Taj-Mahal-Organic-Corn-Flour-Makki-Ka-Atta-3-Pack-908g-Each-Gluten-Free-Indian-Flour/2OWZ5N3977ZX). The listing title uses the exact phrase; its ingredient field says “Organic whole yellow corn flour.” | Canadian marketplace listing sold by Jiva Organics; Walmart says product details are supplied by marketplace sellers and are not separately verified. Used for title/ingredient wording only; no stock or performance claim. |
| **WP02-A6-MAKKI-ATTA-20261013-S05** | Health Canada, Canadian Nutrient File, [Serving size, food code 4417](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4417). Names whole-grain yellow corn flour in English and French and lists 100 mL = 49.5 g, 250 mL = 123.6 g, and one serving = 20.0 g. | Canadian food-database observations, not a Makki package measure or a defined density. Keep all values source-scoped and inactive in runtime conversions. |
| **WP02-A6-MAKKI-ATTA-20261013-S06** | Rai et al., “Quality characteristics of bread produced from wheat, rice and maize flours,” *Journal of Food Science and Technology* 49(6), 2012, [PubMed record](https://pubmed.ncbi.nlm.nih.gov/24293700/), DOI 10.1007/s13197-011-0548-0. Abstract reports a defined wheat-bread study using maize meal at replacement levels from 0–100%; higher maize-meal levels increased baking absorption and reduced loaf weight and volume, while 25% replacement was more acceptable than the control. | Primary study is formula-specific and calls its material maize meal. It does not identify Makki atta or establish whole-kernel flour equivalence or a general substitution rule. |

**Existing source S5-corn-flour:** OQLF, [farine de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais), GDT updated 2025. Reused from the active whole-kernel corn-flour ledger record; defines the preferred French term and records the Québec/UK English naming overlap.

**Existing source S5-cornmeal:** OQLF, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), GDT updated 2019. Reused from the active cornmeal ledger record; defines the milling of dried maize grains and documents fine, medium, and coarse grinds.
