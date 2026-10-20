# WP07 R1084 — Generic vegetable-oil portion review — 2026-10-19

**Status:** Integrated. Two historical, source-qualified portions for USDA’s generic `Vegetable oil, NFS` food code were added to the existing vegetable-oil ledger record. Keep the measurement method unknown and do not activate a density, unit mapping, or form conversion.

**Selected gap:** Existing generic `ingredient-ref-vegetable-oil` (`vegetable oil` / `huile végétale`, category `FAT_AND_OIL`). The live bundled recipe corpus uses this reference on 9 ingredient lines across 9 recipes. The reference has no measurement observations and no assigned ingredient form. R1081 is already integrated for semisweet chocolate chips; this proposal reviews vegetable oil as a separate generic gap. Recipe quantities below show demand only and are not measurement trials.

## Demand and existing recipe ownership

| Recipe | Ingredient-line ID | Existing source wording | Structured amount |
|---|---|---|---|
| Red Velvet Cake | `0bc95db3-300b-4594-88ca-ade36c66cde1-ingredient-7` | 240 ml vegetable oil | 240 ml |
| Waffles | `9ae958d9-1f55-4906-84bc-8f3436ce70ff-ingredient-4` | 1/2 cup vegetable oil | 0.5 cup |
| Steamed Bao Buns | `559fff48-4d46-4922-b1b8-66808cb0715c-ingredient-4` | 1 tbsp vegetable oil | 1 tbsp |
| Chocolate Galettes | `3a206140-a145-4871-92c6-7024ce958858-ingredient-6` | 1/2 cup vegetable oil | 0.5 cup |
| Devil’s Food Cake | `4207e09a-429f-437b-f7bd-14e862d6d696-ingredient-7` | 1/2 cup (120 ml) vegetable oil | 0.5 cup |
| Refried Pinto Beans | `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-1` | 10 g vegetable oil | 10 g |
| Yule Log | `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-11` | 30 ml vegetable oil | 30 ml |
| German Chocolate Cake | `e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-8` | 1/2 cup (120 ml) canola or vegetable oil | 120 ml |
| Carrot Cake | `1da10533-75ef-41b4-af55-298775c4c9ea-ingredient-3` | 1 1/2 cups vegetable oil | 1.5 cups |

## Existing row and evidence ownership

- The existing seed reference is source-unspecified `ingredient-ref-vegetable-oil`. It has `defaultDensity: null`, `unitMappings: []`, and no vegetable-oil form. Preserve the identity and every recipe link.
- Its ledger record is `measurementState: blocked_pending_evidence`, with three existing sources and no measurement observations. The CFIA source `WP05-OIL-INT-20261012-S01` documents Canadian naming for single-source and multisource oils; it does not provide a measure. The two R1072 sources (`WP08-R1072-VEGOIL-S01/S02`) list canola or vegetable oil in the same measured slot in two named cake formulas. Their 240 ml and 120 ml amounts and methods remain recipe-specific choices, not generic oil measurements or equivalence tests. Preserve their two existing substitution findings and the source-less-draft decision.
- `ingredient-ref-canola-oil`, `ingredient-ref-olive-oil`, and `ingredient-ref-extra-virgin-olive-oil` remain separate identities. The olive-oil ledger’s three CNF 2015 observations belong only to Food Code 422. Do not transfer them or any canola-, olive-, almond-, coconut-, or corn-oil values to vegetable oil.
- No new form, alias, recipe link, or quantity edit is proposed. The USDA NFS food description supports only the generic source identity named in the row; its value is not evidence for a particular oil source, blend, or preparation.

## Generic USDA source and registered observations

The USDA Agricultural Research Service’s *Manual of Food Codes for Individual Intake* (CSFII 85, October 1986) lists `Vegetable oil, NFS` (including `oil, NFS`) under Food Code `821-0100`. The codebook gives a historical 1-cup portion of 218 g and a 1-tablespoon portion of 13.6 g. It separately lists named oils, including olive oil at different amounts; those rows do not belong to this proposal.

| Observation ID | Source ID | Exact source locator | Published portion | Scope and method limit |
|---|---|---|---|---|
| `wp07-vegoil-usda-codebook-821-0100-cup-218g-r1084-20261019` | `WP07-VEGOIL-R1084-20261019-S01` | USDA ARS, [*Manual of Food Codes for Individual Intake*](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/8586/csfii85_4days_codebook.pdf), CSFII 85, October 1986, printed p. 709 (PDF p. 717), row `Vegetable oil, NFS (Include oil, NFS)`, Food Code `821-0100`, `1 cup` portion. The codebook note on printed p. 1 (PDF p. 9) defines 1 cup as 8 fluid ounces. | 1 source cup = 218 g | Historical USDA CSFII portion for this generic NFS row only. The row does not specify a pour, fill, or measurement protocol. The cup note records the source convention; it does not establish RecipeBook runtime mapping. |
| `wp07-vegoil-usda-codebook-821-0100-tbsp-13-6g-r1084-20261019` | `WP07-VEGOIL-R1084-20261019-S01` | Same codebook table and row, printed p. 709 (PDF p. 717), `1 tbsp` portion. | 1 source tablespoon = 13.6 g | Historical USDA CSFII portion for this generic NFS row only. The codebook does not state the filling/pouring method or tablespoon volume convention for this entry. |

The codebook table also prints 13.6 g in its separate “edible serving not specified” column beside the 1-cup entry. Do not interpret that column as a second cup equivalent or an additional unit mapping; the proposed observations use only the two explicitly named common-measure portions above.

### Current-data context and follow-up boundary

USDA’s [FNDDS 2021–2023 documentation](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/fndds/2021_2023_FNDDS_Doc.pdf) identifies current generic food code `82101000 Vegetable oil, NFS` as a top-reported NFS code reviewed for each survey cycle (p. 11). It explains that FNDDS portion weights represent groups or composites of foods and beverages and may not apply to density or weight per volume for a specific liquid (pp. 13–14). The [official FNDDS download page](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/food-surveys-research-group/docs/fndds-download-databases) lists the 2021–2023 *Portions and Weights.xlsx* workbook, but its exact `82101000` row has not been inspected for this review. Therefore no current FNDDS portion value, continuity claim, or density is proposed.

## Measurement and catalog recommendation

Integration recorded the two `published_portion` observations on existing ledger record `ingredient-ref-vegetable-oil` with `relationship: portion_weight`, `foodDescription: USDA CSFII 1986 Food Code 821-0100, Vegetable oil, NFS (Include oil, NFS)`, and no `ingredientFormId`. The source-native common measures and masses remain tied to the historical vintage and unknown measurement method.

The ledger now marks `measurementState` as `researched_supported` for these bounded historical observations, while `defaultDensity` remains null and `unitMappings` remains empty. This status records source-supported portions; it does not make them active conversions. Do not infer g/mL from either portion, derive one measure from the other, equate either with the app cup or tablespoon unit, or generalize to vegetable-oil subtypes or other liquid fats.

No seed references, forms, recipe links, recipe amounts, substitution rules, generated files, or app behavior were changed. Any future FNDDS workbook review would need to retain values under their exact dataset food code and portion descriptions.

## ID, scope, and no-test disposition

The registered source ID is `WP07-VEGOIL-R1084-20261019-S01`; both observation IDs above are registered on the vegetable-oil ledger record and do not collide with existing IDs. The unused proposed S02 identifier was not registered.

This review covers generic vegetable oil only. No brand, product line, flavour family, SKU, retailer variant, or commercial roster work was pursued; commercial-product counts do not add ingredient diversity. Existing branded rows and product-scoped evidence remain preserved. No software tests, build, emulator, or deployment were run because integration only added research data to a database JSON record under `AGENTS.md`.
