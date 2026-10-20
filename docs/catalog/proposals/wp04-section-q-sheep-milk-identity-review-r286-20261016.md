# WP04 Section Q proposal: sheep milk identity

- **Reviewed:** 2026-10-16
- **Status:** Integrated. See [R286 integration README](../batches/wp04-section-q-sheep-milk-identity-integration-r286-20261016/README.md).
- **Target anchor:** [WP04, Section Q, milk identities and forms](../../RecipeBook-global-ingredient-catalog-plan.txt#L7069).
- **Integrated identity:** One identity-only DAIRY_AND_ALTERNATIVE reference for **sheep milk / lait de brebis**, with the OQLF-backed English aliases **sheep's milk** and **ewe's milk**. Forms, measurements, density, unit mappings, conversions, recipe links, yields, and substitutions remain empty.
- **Reference ID:** ingredient-ref-sheep-milk.

## Why this is the next distinct gap

The Section Q milk checklist remains open after R283 added goat milk / lait de chèvre. R281 and R282 covered unrelated WP02 and WP03 gaps; R283 is already integrated and is not reopened here. The older [protein and dairy identity packet](../batches/protein-dairy-identities.md) lists sheep's milk / lait de brebis as a family candidate, but it does not allocate the live reference, a focused research-ledger identity, or a hold. The proposal and batch archive search found no earlier sheep-milk decision.

The current bundled snapshot has 1,660 ingredient references, 126 forms, 2,009 research-ledger records, and 114 manifest-listed recipes containing 1,123 ingredient rows. There is no active reference or form with an exact normalized owner for sheep milk, sheep's milk, ewe's milk, or lait de brebis. The only active milk-source references in this family are cow milk and the newly integrated goat milk; sheep milk is a genuinely missing species distinction.

## Integrated identity and boundary

| Field | Proposal |
| --- | --- |
| ID | ingredient-ref-sheep-milk |
| Category | DAIRY_AND_ALTERNATIVE |
| English display | sheep milk |
| Québec French display | lait de brebis |
| English aliases | sheep's milk; ewe's milk |
| French aliases | none |
| Default density / unit mappings | null / empty |

This means fluid sheep milk used as human food. Keep it separate from cow milk, goat milk, sheep-milk cheese, yogurt, kefir, whey, butter, or powder; lamb and mutton meat; lactose-free products; infant formula; animal feed; and non-food products. Do not alias the generic words milk or lait, the standalone species terms sheep or brebis, ovine milk, lamb milk, or lait de mouton. The chosen bilingual display already identifies both the animal source and the dairy product.

The existing goat-milk identity remains a separate candidate, with its current goat's-milk alias and picker behavior unchanged. This proposal does not combine sheep, goat, or cow milks or reopen the existing goat meat / goat milk boundary.

## Naming and identity evidence

OQLF's GDT entry gives **lait de brebis** as the preferred French term and lists **sheep's milk** and **ewe's milk** as its English translations. It explains that sheep can refer to the species generally, while ewe refers specifically to the female. The English display follows the current Canadian product label wording; the two English aliases preserve the OQLF terms. The 1983 terminology record supports names, not current supply, processing, measures, or interchangeability. [S01]

The Government of Québec's current sheep-sector page reports dairy-sheep production in Québec and says the milk is used mainly to make cheese and yogurt. Its production figures are explicitly historical (milk volume is for 2019); this is regional-use context and does not establish how much fluid milk is retailed. The page was updated 2026-03-05. [S02]

The current Canadian Ambrosia listing for HOPE Eco Farms names a 1 L product **Grassfed Sheep Milk**, identifies its ingredient as pasteurized sheep milk, and suggests drinking it or using it in cooking and baking. It lists in-store availability in several Ontario locations, subject to stock changes. This confirms a present consumer-facing fluid-milk product and culinary use. The product's 1 L package is source-specific; the retailer's promotional digestion and lactose claims are not evidence that sheep milk is lactose-free. [S04]

CFIA's current dairy-label guidance says unqualified milk refers to cow milk for the applicable Canadian standard and that dairy products made from another animal must identify that animal source. This supports an explicit species-qualified reference, not a culinary replacement rule. The CFIA URL is already owned by other dairy source records; see the ownership table below. [S03]

## Picker projection

I projected the candidate against current bundled reference names and aliases using the accent- and punctuation-folding, complete-word phrase search in IngredientSearch.kt. Counts below are current results followed by projected results after adding the proposed row. No standalone sheep or brebis alias is proposed; those single-word searches still match the species word in the bilingual display.

| Query | Current results | Projected results |
| --- | --- | --- |
| sheep milk | 0 | 1 — sheep milk |
| sheep's milk | 0 | 1 — sheep milk |
| ewe's milk | 0 | 1 — sheep milk |
| lait de brebis | 0 | 1 — sheep milk |
| sheep / brebis | 0 | 1 — sheep milk, by display-word match |
| milk | 8 | 9 |
| lait | 10 | 11 |
| goat / chèvre | 2 — goat meat, goat milk | unchanged |

The exact bilingual product phrases each resolve to the one species-specific dairy row. The broader sheep/brebis queries also return only that row because no sheep/lamb/mutton meat reference is active; the result label remains explicit that it is milk. The picker filters a visible result list and does not automatically attach the row. Do not turn sheep or brebis into aliases. The goat and chèvre queries continue to return both goat meat and goat milk, consistent with R283.

## Recipe demand and numeric behavior

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for sheep milk, sheep's milk, ewe's milk, lait de brebis, lait de mouton, ovine milk, sheep, and brebis using normalized complete-word phrases. There are zero matching recipe files and zero matching ingredient rows. No recipe link or recipe-specific numeric behavior is supported by the bundle.

- **Forms:** Add none. Species source is an identity distinction, not a preparation-state form. One retailer's whole, pasteurized product does not establish a universal whole-milk or pasteurized form for sheep milk.
- **Measures and density:** Add none. The retailer's 1 L unit is a package presentation, not a reusable household measure or mass value. No source reviewed here supports a transferable g/ml density or volume-to-mass conversion. Do not copy cow- or goat-milk density or mappings.
- **Conversions and yields:** Add none. No same-ingredient form conversion, package conversion, reconstitution ratio, or yield is supported.
- **Substitutions:** Add no global or contextual sheep-to-cow, sheep-to-goat, or other milk replacement. The product and naming sources establish identity and use, not a recipe-role-specific replacement amount or behavior.
- **Recipe links:** None. The bundled corpus contains no sheep-milk ingredient demand.

## Source ID and URL ownership

The four source IDs below were allocated to the sheep-milk ledger record during integration. The OQLF, Québec-sector, and Ambrosia product URLs had no existing exact URL entry in the reviewed catalog archive. The CFIA URL is already owned by other dairy source records; the focused R286 ID preserves the sheep-specific locator and support without changing those mappings.

| Source ID | Source and supported claim | Limit |
| --- | --- | --- |
| WP04-SHEEP-MILK-IDENTITY-20261016-S01 | Office québécois de la langue française, [GDT: lait de brebis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298770/lait-de-brebis). Preferred French term and English translations sheep's milk / ewe's milk. | Terminology only; entry was last updated in 1983. |
| WP04-SHEEP-MILK-IDENTITY-20261016-S02 | Gouvernement du Québec, [Élevage ovin (agneau)](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-ovin-agneau). Current Québec dairy-sheep sector and predominant cheese/yogurt uses; updated 2026-03-05. | Milk-volume statistics are for 2019; the page does not establish consumer fluid-milk package measures. |
| WP04-SHEEP-MILK-IDENTITY-20261016-S03 | CFIA, [Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy). Cow-milk default in the Canadian standard and source-identification requirement for dairy from another animal. | Labeling context; not a recipe or substitution source. This URL already appears under WP04-BUTTER-PRODUCTS-20261010-S03, WP04-CULTURED-GAP-20261010-S06, WP04-GREEK-YOGURT-20261010-S02, and WP04-GOAT-MILK-IDENTITY-20261016-S04. Keep those existing IDs mapped as-is; allocate the new focused ID only if an R286 ledger record is created. |
| WP04-SHEEP-MILK-IDENTITY-20261016-S04 | Ambrosia, [Grassfed Sheep Milk](https://canada.ambrosia.ca/products/grassfed-sheep-milk), HOPE Eco Farms product listing. Product title, pasteurized sheep-milk ingredient, 1 L package, cooking/baking use, and current in-store listing. | Retailer and SKU-specific evidence; package size and availability can change and do not imply a reusable measurement. |

## Recommendation

The integrated reference is identity-only sheep milk / lait de brebis in DAIRY_AND_ALTERNATIVE, with only the two OQLF-backed English aliases. Keep the identity distinct from cow and goat milk, processed sheep dairy, sheep meat, and lactose-free products. Forms, density, measures, conversions, yields, recipe links, and substitutions remain unset. This is one child gap only; the broader Section Q milk, fat-class, processed-milk, and dairy checklist remains open.

## Verification performed

- Read the current AGENTS.md, Requirements.md ingredient/conversion requirements, roadmap entry, Section Q plan, R281–R283 proposals and integration README.
- Searched the live references and forms, proposal/batch archive, and research ledger for exact candidate terms, ownership, holds, source IDs, and source URLs.
- Checked the current online OQLF, Government of Québec, CFIA, and Canadian retailer pages listed above.
- Reproduced the current phrase-first picker projection from the implementation's normalization and matching rules, and scanned the manifest-listed recipe corpus.
- No software tests, builds, or emulator checks were run; this is a proposal-only static research task.
