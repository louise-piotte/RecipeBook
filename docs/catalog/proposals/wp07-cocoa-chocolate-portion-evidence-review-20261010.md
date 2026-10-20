# WP07 cocoa and chocolate portion evidence review — 2026-10-10

**Status:** Proposal only; no shared catalog, ledger, recipe, test, plan, or roadmap edits.  
**Scope:** Cocoa powder and baking chocolate/chocolate-chip portions.  
**Recommendation:** Preserve the values below as source-scoped portion observations only after reviewer acceptance. Keep ingredient measurement states blocked where evidence does not meet the existing identity, portion, and unit-convention requirements. Add no active density, unit mapping, conversion, or recipe quantity.

## Current snapshot

Snapshot read on 2026-10-10 from the live bundled seed and ledger:

| File | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 753 refs | `eaccfeb7fe5c4cf25dea4ad4d844bf6b2b3b41e7fc7bf9b0f01440b36a3fef5b` |
| `ingredient-forms.v1.json` | 36 forms | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `units.v1.json` | 30 units | `6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4` |
| `manifest.v1.json` | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/research-ledger.v1.json` | 958 records; 1,951 source entries; 1,582 distinct source IDs | `43698af32c2dcc1885d9b1998725924c8f303d40e1869c0cc5dac4c266261420` |

The recipe package has 114 recipe files and 1,123 ingredient rows. Counts and hashes describe the read snapshot; this proposal does not validate or refresh the package manifest.

## Identity, form, unit, and workflow reconciliation

- Cocoa remains split between `ingredient-ref-unsweetened-cocoa-powder` (displayed as unsweetened cocoa powder; aliases include cocoa powder and natural cocoa powder) and `ingredient-ref-dutch-process-cocoa-powder`. Both have null default density and no unit mappings. Their ledger measurement states remain `blocked_pending_evidence`.
- Chocolate identities include semisweet, white, dark, milk, bittersweet, and unsweetened chocolate. Their current default densities are null and unit mappings empty. Milk chocolate is identity-reviewed but measurement research remains `not_yet_researched`; the other scoped chocolate records remain blocked pending measurement evidence.
- The six relevant existing chocolate forms are semisweet, white, dark, and milk chocolate chips, plus melted semisweet and white chocolate. All form densities are null. WP-D identity/form decisions normalize generic “chocolate chips” to semisweet and qualified white, dark, milk, and bittersweet chip names to their matching chocolate identities. There is no `ingredient-form-bittersweet-chocolate-chips`; do not create a form as part of this proposal.
- App units currently define `cup = 236.5882 mL`, `tbsp = 14.78676 mL`, `tsp = 4.928922 mL`, and `oz = 28.34952 g`. Preserve source cups and tablespoons as published. FDA nutrition-label household equivalents use 240 mL/cup and 15 mL/tbsp; neither that convention nor a source's unspecified cup is interchangeable with the app's unit definition without evidence.
- The [WP07 common baking measurement packet](../batches/common-baking-measurements.md) remains `in_review`. It already treats portion observations separately from active mappings and notes that the King Arthur chart does not state its cup convention or row-specific filling method. This review narrows two earlier chart rows using their live product links; it does not change the WP07 plan.
- Existing search behavior is consistent with the identity decisions: generic “chocolate chips” selects semisweet chocolate and its chips form; white, dark, and milk qualifiers select their corresponding identities/forms. “Bittersweet chocolate chips” resolves to the bittersweet identity but has no chip form. Generic/natural cocoa aliases select unsweetened cocoa; Dutch-process cocoa remains separate. The checked-in search and catalog tests assert these paths; no tests were run for this proposal.

## Active recipe-line hits

These are 20 structured volume rows in the current 114-recipe seed: 10 cocoa, 8 chocolate-chip, and 2 other chocolate rows. Recipe-line IDs are included for direct lookup. Original text and selected form are shown so that product-specific evidence is not mistaken for a recipe correction.

| Ingredient line | Current structured quantity |
| --- | --- |
| Nanaimo Bars `9a714acf-d991-4932-bb4c-63af19051022-ingredient-2` — unsweetened cocoa | 5 tbsp |
| Yule Log `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-18` — unsweetened cocoa, dusting | 1/2 tsp |
| Nutella Hot Chocolate `dfa44a33-5dff-4304-9308-1d8326055a58-ingredient-3` — unsweetened cocoa | 2 tbsp |
| Cookie Cake `ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-12` — cocoa powder | 3 tbsp |
| Chocolate Truffle Cake `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-4` — unsweetened cocoa | 1/3 cup |
| Chocolate Truffle Cake `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-23` — unsweetened cocoa | 6 tbsp |
| Double Chocolate Muffins `81d376ac-c305-402f-a73d-8bb721045319-ingredient-8` — unsweetened cocoa | 1/3 cup |
| Nanaimo Cake `f3ce6ed8-0389-457c-92ec-240cf53eacde-ingredient-9` — unsweetened cocoa | 1/3 cup |
| Chocolate Pudding `d9ce5a86-561d-4c36-975f-5f4249aa9df5-ingredient-1` — unsweetened cocoa | 1/3 cup |
| Chocolate Syrup `43dd1f6e-ab29-4365-bfee-a7ecb0d6309b-ingredient-3` — unsweetened cocoa | 1/2 cup |
| Air Fryer Baked Oats `0a8b29b8-faf0-4597-8514-e09335de6c03-ingredient-10` — generic chocolate chips (semisweet chip form) | 2 tbsp |
| Chocolate Chip Cookies `3e2bd9d9-95fc-43ea-8d33-140de5b7de25-ingredient-7` — generic chocolate chips (semisweet chip form) | 1 cup |
| Magic Cookie Bars `ff66e4f7-c719-4203-970b-06993cdb25de-ingredient-4` — semisweet chocolate chips | 1 1/3 cups |
| Chocolate Nutty Crisp `798352ab-d4ad-4e5d-9c90-f0484609bca2-ingredient-3` — dark chocolate chips | 2 cups |
| Chocolate Galettes `3a206140-a145-4871-92c6-7024ce958858-ingredient-8` — semisweet chocolate chips | 1 cup |
| My Cherry Blossom Version `4a10822e-551d-4738-b0c2-d7492fb5b86f-ingredient-1` — dark chocolate chips | 1 cup |
| My Cherry Blossom Version `4a10822e-551d-4738-b0c2-d7492fb5b86f-ingredient-2` — milk chocolate chips | 1 cup |
| Double Chocolate Muffins `81d376ac-c305-402f-a73d-8bb721045319-ingredient-9` — white chocolate chips | 1 cup |
| Chocolate Pudding `d9ce5a86-561d-4c36-975f-5f4249aa9df5-ingredient-7` — melted semisweet chocolate | 1/3 cup |
| Red Velvet Fudge `80ae1de5-0430-4ea0-8109-94b0dcc8453e-ingredient-7` — semisweet chocolate, form unspecified | 1 cup |

Adjacent cocoa mass rows include 50 g unsweetened cocoa; Yule Log's 10 g, 15 g, and 5 g unsweetened cocoa; 100 g sifted Dutch-process cocoa; 10 g unsweetened natural cocoa; 25 g sifted Dutch-process cocoa; and a German Chocolate Cake source line reading `3/4 cup (62 g)` whose structured quantity is 62 g. These are mass quantities or recipe text, not validation of a volume factor. Other chocolate recipe lines are predominantly g/oz and require no volume conversion.

## Source-scoped observations for reviewer consideration

All values below should retain the named product or exact source food, published portion, preparation, source date/status, and unreported conventions. They are evidence observations, not normalized factors. “Method not stated” remains an explicit limitation.

| Proposed source ID | Exact source and evidence | Proposed scope and limits |
| --- | --- | --- |
| `WP07-COCOA-CHOC-20261010-S01` | USDA ARS [Standard Reference Release 28 Food Group 19](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg19.pdf) (Release 28, 2015; accessed 2026-10-10), p. 324, NDB 19165: “Cocoa, dry powder, unsweetened,” 1 cup = 86 g and 1 tbsp = 5.4 g; p. 330, NDB 19166: “Cocoa, dry powder, unsweetened, processed with alkali,” same portions; pp. 326–327, NDB 19171: HERSHEY'S European Style Cocoa, 1 tbsp = 5.0 g. | Retain separate records. NDB 19165 does not state processing; NDB 19166 explicitly describes alkali processing. NDB 19171 is a distinct older Hershey product, not the current natural-cocoa label. USDA common-measure entries do not state cup capacity or fill method. Do not merge identities or activate a mapping. |
| `WP07-COCOA-CHOC-20261010-S02` | Hershey's manufacturer page for [100% Cacao Natural Unsweetened Cocoa](https://www.hersheyland.com/products/hersheys-cocoa-100-cacao-natural-unsweetened-8-oz-can.html.html), accessed 2026-10-10: Nutrition Facts serving size 1 tbsp (5 g). | Exact product and natural/unsweetened label portion. Treat as a nutrition-label portion, not a kitchen bulk-fill procedure or density. FDA guidance is separately identified below; the app tbsp is 14.78676 mL. No app tbsp mapping follows. |
| `WP07-COCOA-CHOC-20261010-S03` | FDA [Guidance for Industry: Guidelines for Determining Metric Equivalents of Household Measures](https://www.fda.gov/regulatory-information/search-fda-guidance-documents/guidance-industry-guidelines-determining-metric-equivalents-household-measures), undated page accessed 2026-10-10: nutrition-label tbsp = 15 mL, cup = 240 mL, tsp = 5 mL. | Unit-convention context for label portions only. It does not define recipe/chart cups or app units and supplies no cocoa/chocolate mass. |
| `WP07-COCOA-CHOC-20261010-S04` | King Arthur Baking, [Classic Birthday Cake / 2019 Recipe of the Year](https://www.kingarthurbaking.com/blog/2018/12/31/introducing-our-2019-recipe-of-the-year?page=34), dated 2018-12-31: 1 1/4 cups (106 g) natural cocoa powder for frosting, sifted if lumpy; the lighter-frosting option is exactly 1 cup (85 g), with Dutch-process cocoa permitted as a frosting substitution. | Recipe-specific natural cocoa and frosting portions. Cup convention and measuring/filling procedure are not stated. Keep the two published recipe amounts as written; do not derive a conversion or generalize the Dutch substitution to other uses. |
| `WP07-COCOA-CHOC-20261010-S05` | King Arthur Baking, [Easy Chocolate Chip Cookies made with All-Purpose Baking Mix](https://www.kingarthurbaking.com/recipes/easy-chocolate-chip-cookies-made-with-all-purpose-baking-mix-recipe), updated 2025-01-27: 2 cups (340 g) semisweet or bittersweet chocolate chips. Its semisweet product link is Callebaut SKU 209671. | Recipe-specific portion for the linked semisweet chip product; cup convention and chip-filling method are not stated. Keep separate from package label servings. |
| `WP07-COCOA-CHOC-20261010-S06` | Callebaut SKU 209671 [manufacturer package PDF](https://shop.kingarthurbaking.com/content/packaging/209671_new.pdf), accessed 2026-10-10: Nutrition Facts serving 1 tbsp (14 g); package recipe prints 2 cups (340 g) semisweet chocolate chips. | Preserve the label tbsp and package recipe cups as separate source statements for this exact semisweet product. The label serving is not the recipe's measuring protocol; the source gives no cup convention or chip-filling method. Do not derive g/mL or average/reconcile portions. |
| `WP07-KAB-IWC` (existing source ID; reuse) | King Arthur Baking [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), live undated page accessed 2026-10-10: “Cocoa (unsweetened)” 1/2 cup = 1 1/2 oz = 42 g; “Chocolate Chips” 1 cup = 6 oz = 170 g; white chips 1 cup = 6 oz = 170 g; mini chips 1 cup = 6 1/4 oz = 177 g. | The chart's “Cocoa (unsweetened)” row links to [Triple Cocoa Blend, SKU 211782](https://shop.kingarthurbaking.com/items/triple-cocoa-blend), a Dutch/natural/black cocoa blend; it is not assignable to either current cocoa reference. “Chocolate Chips” links to [Guittard Bittersweet Chocolate Chips, SKU 208600](https://shop.kingarthurbaking.com/items/guittard-bittersweet-chocolate-chips), so it is product-qualified bittersweet evidence, not generic semisweet evidence. White-chip identity is stated but chip size/product/method are not. Mini-chip type is unspecified. No chart row states cup capacity or fill method. Do not scale the half-cup cocoa value. |
| `WP07-COCOA-CHOC-20261010-S07` | USDA ARS [SR28 Food Group 19](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg19.pdf), p. 281, NDB 19701, “Candies, semisweet chocolate, made with butter”: 1 cup chips (6 oz package) = 170 g; 1 cup large chips = 182 g; 1 cup mini chips = 173 g. | Preserve chip size and USDA food description per portion. This is not an all-product semisweet factor; cup capacity/fill method are unspecified. |
| `WP07-COCOA-CHOC-20261010-S08` | USDA [Home and Garden Bulletin 72, Table 9](https://www.ars.usda.gov/ARSUserFiles/80400525/data/hg72/hg72_2002.pdf), revised 2002-10: chocolate chips per cup—milk 168 g, semisweet 168 g, white 170 g. | Keep as historical source observations with source food and source version. The cup convention/method are unspecified. The semisweet value differs by 2 g from several 170 g observations; retain both, do not average. |

The chart product-link finding revises the earlier packet's provisional description: its cocoa row is not merely process-unspecified generic cocoa, and its “Chocolate Chips” row is not actually type-unspecified once the linked product is followed. The exact values remain chart-specific and do not become active measurements.

## Conflicts and blocked values

- **Cocoa:** USDA NDB 19165 and 19166 each publish 86 g/cup and 5.4 g/tbsp but describe different processing scope; Hershey's current natural-cocoa label gives 5 g per label tablespoon; King Arthur's frosting recipe gives 85 g/cup; and the chart's 42 g per half-cup is linked to a triple-cocoa blend. These are not a single comparable natural-cocoa conversion. Keep original source amounts and process/product qualifiers. The chart's 42 g half-cup must not be doubled or reassigned.
- **Semisweet chips:** KAB's Callebaut recipe, KAB's label, USDA SR28's standard chips, and the 2002 USDA table publish differing portion types or values (2 cups/340 g, 1 tbsp/14 g, 1 cup/170 g, and 1 cup/168 g). The label serving and kitchen cup are different measurement bases. The 168/170 g cup difference is retained, not averaged. USDA's 182 g large and 173 g mini-chip measures show particle size matters.
- **Other chips:** KAB's 170 g chart value is product-linked bittersweet Guittard chips; the white-chip row has no product/size method; SR28's mini-chip food is specifically “made with butter,” unlike a universal chocolate-chip identity. Keep these rows source-scoped. Bittersweet chip evidence cannot be encoded on a nonexistent form.
- **Unit behavior:** FDA nutrition-label tablespoon/cup conventions, unspecified recipe/chart cups, USDA common-measure cups, and the app's U.S. cup/tablespoon definitions are separate until an exact convention is demonstrated. Portion equivalence is not physical `g/mL` density.
- **Unsupported runtime values:** Keep all cocoa/chocolate reference measurement states as currently recorded. Do not add `defaultDensity`, `unitMappings`, form density, chip conversions, or any recipe quantity edits. Do not transfer chip observations to melted, chopped, chunk, or plain chocolate forms.

## Source-ID collision audit

The following proposed IDs were absent from the live ledger snapshot: `WP07-COCOA-CHOC-20261010-S01` through `S08`. The existing `WP07-KAB-IWC` is present and should be reused for the chart/product-page evidence rather than duplicated. This was checked against all 1,582 distinct source IDs in the snapshot.

## Reviewer disposition requested

If accepted, add only source-qualified portion observations with exact source description, product/NDB identifier, published amount and unit, preparation/context, source date or access date, and explicit unknown cup/method fields. Keep catalog measurement states blocked where the identity or measure convention is unresolved. No active runtime conversion qualifies from this review.
