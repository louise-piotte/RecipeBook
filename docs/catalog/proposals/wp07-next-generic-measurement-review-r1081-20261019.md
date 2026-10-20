# WP07 R1081 — Generic semisweet chocolate-chip portion review — 2026-10-19

**Status:** Integrated. Added one historical USDA published portion and its source to the existing semisweet-chocolate ledger row, scoped to the existing chips form. No seed identity, form, recipe quantity, density, or unit mapping changed. No software tests were run because the change only adds database JSON research data under `AGENTS.md`.

**Selected gap:** Existing generic `ingredient-ref-semisweet-chocolate`, scoped to its existing `ingredient-form-semisweet-chocolate-chips` form. The seed contains 19 semisweet-chocolate ingredient rows across 17 recipes, including five rows already assigned to the chip form. The measurement ledger has no observation or source for this reference. The USDA table below provides one historical, generic portion for the exact chip form. Keep the value form- and source-scoped; do not apply it to unformed, chopped, whole, melted, or other chocolate.

## Demand and existing recipe ownership

All 19 current recipe rows remain linked to `ingredient-ref-semisweet-chocolate`. Five rows are already explicitly assigned to the semisweet-chocolate chips form; four use volume and one uses mass. These recipe amounts show catalog demand only and are not measurement trials.

| Recipe | Ingredient-line ID | Source wording | Structured quantity | Existing form |
|---|---|---|---:|---|
| Air Fryer Baked Oats | `0a8b29b8-faf0-4597-8514-e09335de6c03-ingredient-10` | 2 tbsp chocolate chips | 2 tbsp | `ingredient-form-semisweet-chocolate-chips` |
| Nanaimo Bars | `9a714acf-d991-4932-bb4c-63af19051022-ingredient-12` | 5 oz semisweet chocolate | 5 oz | — |
| Chocolate Chip Cookies | `3e2bd9d9-95fc-43ea-8d33-140de5b7de25-ingredient-7` | 1 cup chocolate chips | 1 cup | `ingredient-form-semisweet-chocolate-chips` |
| Peanut Butter Brownies | `d73d6bff-fc0c-4b79-a607-441e546d32ad-ingredient-2` | 175 g semisweet chocolate, divided | 175 g | — |
| Yule Log | `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-19` | 28 g semisweet chocolate | 28 g | — |
| Yule Log | `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-25` | 170 g semisweet chocolate | 170 g | — |
| Buckeyes | `607adb61-ff54-49c9-8aaf-d02648a3ae90-ingredient-5` | 340 g semisweet chocolate | 340 g | — |
| Magic Cookie Bars | `ff66e4f7-c719-4203-970b-06993cdb25de-ingredient-4` | 1 1/3 cups semisweet chocolate chips | 1.333 cup | `ingredient-form-semisweet-chocolate-chips` |
| Chocolate Drip for Cakes | `1958c47a-95cf-46f1-ab81-fa71435b1ca5-ingredient-1` | 6 oz semisweet chocolate | 6 oz | — |
| Coconut Macaroons | `f99dad41-30f8-4294-bbba-4f0b555eda23-ingredient-6` | 170 g semisweet chocolate | 170 g | — |
| Chocolate Galettes | `3a206140-a145-4871-92c6-7024ce958858-ingredient-8` | 1 cup semisweet chocolate chips | 1 cup | `ingredient-form-semisweet-chocolate-chips` |
| Cookie Cake | `ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-9` | 270 g semisweet chocolate chips, plus more for decorating | 270 g | `ingredient-form-semisweet-chocolate-chips` |
| Chocolate Mousse | `2d53895b-8bd0-4225-bf63-766d29418eac-ingredient-2` | 6 oz semisweet chocolate | 6 oz | — |
| Nanaimo Cake | `f3ce6ed8-0389-457c-92ec-240cf53eacde-ingredient-4` | 56 g semisweet chocolate, finely chopped | 56 g | — |
| Nanaimo Cake | `f3ce6ed8-0389-457c-92ec-240cf53eacde-ingredient-20` | 113 g semisweet chocolate, finely chopped | 113 g | — |
| Easter Eggs | `fcd1d029-7265-4735-83d9-ce8ea7d40c2a-ingredient-7` | 680 g semisweet chocolate, melted | 680 g | `ingredient-form-semisweet-chocolate-melted` |
| Chocolate Banana Bread | `c5486a31-4047-4437-ad8b-14a6e776bdd5-ingredient-11` | 270 g semisweet chocolate | 270 g | — |
| Chocolate Pudding | `d9ce5a86-561d-4c36-975f-5f4249aa9df5-ingredient-7` | 1/3 cup semisweet chocolate, melted | 0.3333 cup | `ingredient-form-semisweet-chocolate-melted` |
| Red Velvet Fudge | `80ae1de5-0430-4ea0-8109-94b0dcc8453e-ingredient-7` | 1 cup semisweet chocolate | 1 cup | — |

## Existing row and evidence ownership

- The existing seed identity is `ingredient-ref-semisweet-chocolate`, `semisweet chocolate` / `chocolat mi-sucré`, category `CHOCOLATE_AND_CANDY`. Its aliases include generic chocolate-chip terms under the catalog rule that pure chocolate chips map to their matching base chocolate identity. Preserve all current aliases, links, and rows.
- The existing `ingredient-form-semisweet-chocolate-chips` is the owner of the five chip-form recipe rows above. It has no density. The separate `ingredient-form-semisweet-chocolate-melted` owns the two melted-form rows and remains distinct.
- The ledger record `ingredient-ref-semisweet-chocolate` has `measurementState: blocked_pending_evidence`, no sources, no measurement observations, and one existing decision explaining that a source-less draft density/mapping was removed. The reference has no measurement evidence to reuse or supersede. Keep that decision intact.
- Existing measurement ownership for white, dark, milk, and unsweetened chocolate stays on their own references. This proposal makes no claim about those types or forms and does not alter any branded entry or product-specific evidence.

## Generic source and proposed observation

The USDA Agricultural Research Service’s *Nutritive Value of Foods* (Home and Garden Bulletin 72, revised October 2002) reports a generic household portion for **“Chocolate chips, Semisweet”**: Food No. 960, 1 cup = 168 g. Its Table 9 data are from the USDA Nutrient Database for Standard Reference, Release 13. This matches the existing generic chip form by the source’s food description; it is not a value from a named manufacturer or product.

| Proposed observation ID | Source ID | Exact source locator | Published portion | Measure and form limit |
|---|---|---|---|---|
| `wp07-semisweet-chips-usda-hgb72-food960-cup-168g-r1081-20261019` | `WP07-SEMISWEET-CHIPS-R1081-20261019-S01` | USDA ARS, [*Nutritive Value of Foods*, Home and Garden Bulletin 72](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/hg72/hg72_2002.pdf), revised October 2002, Table 9, “Sugars and Sweets” → “Chocolate chips” → “Semisweet,” Food No. 960, printed p. 70 (PDF p. 77). Table 1, printed p. 3 (PDF p. 10), defines 1 cup as 237 mL / 8 fluid ounces. | 1 source cup = 168 g | Historical USDA SR Release 13 portion for generic semisweet chocolate chips only. No chip scooping, leveling, or packing method is stated. Do not promote to a universal cup mapping or density. |

The source’s Table 1 defines the standard U.S. cup as 8 fluid ounces (237 mL rounded), consistent with RecipeBook’s U.S. `cup` unit at 236.5882 mL (`app/src/main/assets/seed/bundled-library/units.v1.json`). The cup-volume convention is therefore aligned to the source’s published precision, but the portion table does not state how the chips were measured or packed. Retain the reported `1 cup / 168 g` as historical source-specific evidence only; do not infer a repeatable bulk density or activate a cup-to-mass mapping.

## State and catalog recommendation

Recommend recording the one `published_portion` observation on the existing `ingredient-ref-semisweet-chocolate` ledger record with `ingredientFormId: ingredient-form-semisweet-chocolate-chips`, `sourceQuantity: 1 cup`, `observedMassG: 168`, and the exact source food description. The row’s `measurementState` may become `researched_supported` for this bounded form-specific observation. Keep `defaultDensity` null and `unitMappings` empty. This does not support a whole-chocolate or melted-chocolate measure, a second cup convention, any other chocolate type, or a conversion for recipe use.

Do not add a form, alias, recipe link, or measurement to the seed catalog; do not edit recipe quantities or existing ingredient-form assignments. Preserve the whole/unformed and melted rows as they stand. No current-data claim is made from this 2002 handbook entry.

## ID audit, scope, and no-test disposition

The proposed source ID `WP07-SEMISWEET-CHIPS-R1081-20261019-S01` and observation ID `wp07-semisweet-chips-usda-hgb72-food960-cup-168g-r1081-20261019` were checked against live ledger source and observation IDs; neither collides. No other R1081 proposal existed before this file was created.

Research was limited to the generic semisweet chocolate-chip form and the generic USDA row that matches it. No brands, product lines, flavour rosters, SKUs, retailer variants, or commercial counts were pursued. This is a proposal-only documentation change; no software tests, build, emulator, or deployment were run.
