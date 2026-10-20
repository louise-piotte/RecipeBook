# WP04 Section Q proposal: water buffalo milk identity

- **Reviewed:** 2026-10-16
- **Status:** Integrated into the bundled reference catalog, research ledger, checklist, and roadmap on 2026-10-16; see the [R289 integration README](../batches/wp04-section-q-water-buffalo-milk-integration-r289-20261016/README.md).
- **Target anchor:** [WP04, Section Q, milk identities and forms](../../RecipeBook-global-ingredient-catalog-plan.txt#L7082).
- **Recommendation:** Add one identity-only `DAIRY_AND_ALTERNATIVE` reference for **water buffalo milk / lait de bufflonne**, with the OQLF-backed aliases **buffalo's milk** and **lait de bufflesse**. Leave forms, measurements, density, unit mappings, conversions, yields, recipe links, and substitutions empty.
- **Candidate ID:** `ingredient-ref-water-buffalo-milk`.

## Why this is a distinct open gap

The Section Q milk checklist remains open after the integrated R283 goat-milk and R286 sheep-milk identities. R281 and R282 covered unrelated WP02 and WP03 work; R284 and R285 also covered unrelated WP02 and WP03 gaps. The archive search found no focused water-buffalo-milk proposal, integration, or hold. The older cheese/dairy review mentions buffalo milk as a possible source for mozzarella and mascarpone; it does not allocate a fluid-milk identity.

The current bundled snapshot has 1,661 ingredient references, 126 forms, 2,010 research-ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows. There is no active reference or form with an exact normalized owner for `water buffalo milk`, `buffalo milk`, `buffalo's milk`, `lait de bufflonne`, `lait de bufflesse`, `lait de buffle`, `bison milk`, or `lait de bison`. This is a genuinely missing species-qualified fluid-milk identity.

## Proposed identity and boundary

| Field | Proposal |
| --- | --- |
| ID | `ingredient-ref-water-buffalo-milk` |
| Category | `DAIRY_AND_ALTERNATIVE` |
| English display | water buffalo milk |
| Québec French display | lait de bufflonne |
| English aliases | buffalo's milk |
| French aliases | lait de bufflesse |
| Default density / unit mappings | `null` / `[]` |

This identity means fluid water-buffalo milk intended as human food. Keep it distinct from cow, goat, and sheep milk; bison and buffalo meat; buffalo-milk mozzarella and other cheeses; yogurt, cultured products, butter, whey, milk powder, concentrated milk, infant formula, animal feed, and cosmetic products. Do not add bare `buffalo`, `bison`, `bison milk`, `lait de bison`, or `lait de buffle` as aliases. The explicit English display keeps the water-buffalo source visible.

OQLF lists **lait de bufflonne** and **lait de bufflesse** as preferred French terms and gives **buffalo's milk** as the English term. Its entry was last updated in 1983, so it supports terminology only, not current retail use, product composition, or recipe interchangeability. [S01]

The current Gouvernement du Québec dairy-plant permit page explicitly includes treatment and processing of non-cow milks such as goat, sheep, and **bufflonne** milk. The page was updated 2026-05-04. This confirms that the term is used in Québec dairy-sector guidance; it does not establish a fluid retail package or a conversion. [S02]

CFIA's retail survey report identifies water-buffalo milk as a distinct Canadian retail product and lists 42 samples collected from 2019 to 2023. It supports the species-qualified identity and Canadian market context, not current stock, recipe demand, or numeric behavior. [S03]

The current Ambrosia listing from HOPE Eco Farms is titled **Water Buffalo Whole Milk**, identifies pasteurized water buffalo milk as the ingredient, and suggests use in cooking and baking. The page shows a 1 L package and current in-store availability at four of five listed Ontario stores, subject to inventory fluctuations. These are product-specific observations. Its marketing line “Lactose Intolerant? Try Buffalo milk” does not establish lactose-free status or justify a substitution. [S04]

CFIA's current dairy-label guidance says that, for the applicable Canadian compositional standard, unqualified `milk` refers to cow's milk and dairy products from another animal must identify the animal source. This supports a species-qualified display name, not a culinary replacement rule. [S05]

## Picker projection

I projected the candidate against current reference names and aliases using the normalization, complete-word phrase matching, and partial-match fallback in `IngredientSearch.kt`. Counts below are current results followed by projected results after adding the candidate. The ingredient picker presents filtered rows for a user to select; it does not attach a row automatically.

| Query | Current results | Projected results |
| --- | --- | --- |
| `water buffalo milk` | 0 | 1 — water buffalo milk |
| `buffalo's milk` | 0 | 1 — water buffalo milk |
| `buffalo milk` | 0 | 1 — water buffalo milk, matching the display phrase |
| `lait de bufflonne` / `lait de bufflesse` | 0 | 1 — water buffalo milk |
| `water buffalo` / `bufflonne` | 0 | 1 — water buffalo milk |
| `buffalo` | 0 | 1 — water buffalo milk, matching the visible display name |
| `bison` / `lait de bison` | 0 | 0 |
| `milk` / `lait` | 9 / 11 | 10 / 12 |
| `goat` / `chèvre` | 2 — goat meat and goat milk | unchanged |
| `sheep` / `brebis` | 1 — sheep milk | unchanged |

The broad `buffalo` query will show one explicitly qualified water-buffalo-milk row because the display name contains that word. Do not turn `buffalo` into an alias. The row label preserves the milk and animal source, and selection remains explicit. The `bison` query remains empty; if a bison ingredient reference is added later, revisit this cross-search projection.

## Recipe demand and numeric behavior

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `water buffalo milk`, `buffalo's milk`, `buffalo milk`, `lait de bufflonne`, `lait de bufflesse`, `lait de buffle`, `bison milk`, `lait de bison`, and the broader `buffalo` and `bison` terms using normalized complete-word phrases. There are zero matching recipe files and zero matching ingredient rows. The bundle provides no recipe link or recipe-specific basis for numeric or substitution behavior.

- **Forms:** Add none. The retailer's whole and pasteurized descriptors apply to one product listing; they do not establish general water-buffalo fat-class or processing forms.
- **Measures and density:** Add none. The 1 L value is a package size, not a reusable kitchen measure. No reviewed source supports a transferable density, volume-to-mass conversion, or unit mapping. Do not reuse cow-, goat-, or sheep-milk values.
- **Conversions and yields:** Add none. No same-ingredient form conversion, package conversion, reconstitution ratio, or yield is supported.
- **Substitutions:** Add no water-buffalo-to-cow, goat, or sheep milk rule. The sources establish terminology, product identity, and cooking use, not general or role-specific equivalence. The retailer's lactose-related marketing is not a basis for a lactose-free claim or substitution.
- **Recipe links:** None. The bundled recipe corpus contains no matching demand.

## Source ID and URL ownership

The IDs below are now recorded on the focused water-buffalo-milk ledger record. The OQLF, MAPAQ, CFIA retail-survey, and Ambrosia URLs had no existing exact URL owner in the reviewed archive. The CFIA dairy-labelling URL already appears in nine source references under five existing IDs; those mappings remain unchanged, and the R289 record uses its own focused source ID.

| Source ID | Source and supported claim | Limit / ownership |
| --- | --- | --- |
| `WP04-WATER-BUFFALO-MILK-IDENTITY-20261016-S01` | Office québécois de la langue française, [GDT: lait de bufflonne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298608/lait-de-bufflonne). Preferred French forms **lait de bufflonne** and **lait de bufflesse**; English term **buffalo's milk**. | Terminology only; last updated 1983. The exact URL has no existing owner in the reviewed catalog archive. |
| `WP04-WATER-BUFFALO-MILK-IDENTITY-20261016-S02` | Gouvernement du Québec, [Fabrication de produits laitiers et permis d'usine laitière](https://www.quebec.ca/entreprises-et-travailleurs-autonomes/industrie-bioalimentaire/permis-alimentaires/fabrication-produits-laitiers-usine-laitiere). Current category 3 guidance includes processing milk other than cow milk, including lait de bufflonne; updated 2026-05-04. | Québec dairy-sector context, not proof of retail availability or culinary conversion. The exact URL has no existing owner in the reviewed catalog archive. |
| `WP04-WATER-BUFFALO-MILK-IDENTITY-20261016-S03` | CFIA, [Bacterial Pathogens and Indicators in Pasteurized Goat, Sheep, and Water Buffalo Milk – April 1, 2019 to March 31, 2023](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/testing-reports-and-journal-articles/bacterial-pathogens-and-indicators-1). Distinguishes water-buffalo milk as a Canadian retail-survey category and reports 42 samples. | Survey context from 2019–2023, not present-day stock or recipe-use evidence. The exact URL has no existing owner in the reviewed catalog archive. |
| `WP04-WATER-BUFFALO-MILK-IDENTITY-20261016-S04` | Ambrosia / HOPE Eco Farms, [Water Buffalo Whole Milk](https://canada.ambrosia.ca/products/water-buffalo-whole-milk). Current product title, pasteurized water-buffalo-milk ingredient, cooking/baking use, 1 L package, and listed store availability. | Retailer/SKU-specific. Package size and stock are not reusable measures; marketing language does not establish lactose-free status. The exact URL has no existing owner in the reviewed catalog archive. |
| `WP04-WATER-BUFFALO-MILK-IDENTITY-20261016-S05` | CFIA, [Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy). Unqualified milk refers to cow's milk under the applicable standard; dairy products from another animal identify their source. | Regulatory naming context only. This URL already occurs in nine source references under `WP04-BUTTER-PRODUCTS-20261010-S03`, `WP04-CULTURED-GAP-20261010-S06`, `WP04-GOAT-MILK-IDENTITY-20261016-S04`, `WP04-GREEK-YOGURT-20261010-S02`, and `WP04-SHEEP-MILK-IDENTITY-20261016-S03`; retain those owners unchanged. |

## Recommendation

Accept one identity-only candidate for **water buffalo milk / lait de bufflonne** in `DAIRY_AND_ALTERNATIVE`, with the two terminology-backed aliases above. Keep its animal source explicit, and keep buffalo meat, bison, other milks, and processed buffalo dairy separate. Leave forms, density, measures, mappings, conversions, yields, recipe links, and substitutions unset. This proposal addresses only the water-buffalo-milk gap; the broader Section Q milk, fat-class, processed-milk, and dairy checklist remains open.

## Verification performed

- Read the current `AGENTS.md`, relevant `Requirements.md` conversion and ingredient-reference sections, roadmap entries, and Section Q plan; searched the R281–R286 proposal and integration archive for prior allocation, and reviewed the relevant WP04 R283 and R286 records.
- Searched current references, forms, research ledger, proposals, and batch archive for candidate identities, prior proposals/holds, source-ID ownership, and exact URL ownership.
- Checked the current online OQLF, Gouvernement du Québec, CFIA, and retailer pages listed above.
- Reproduced reference-picker search projections from the implemented normalization and phrase-first matching rules; scanned every manifest-listed recipe file and ingredient row.
- No software tests, builds, or emulator checks were run. This integration adds database JSON data, as permitted by `AGENTS.md`.
