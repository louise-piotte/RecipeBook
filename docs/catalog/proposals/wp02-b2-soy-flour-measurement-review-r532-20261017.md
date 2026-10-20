# WP02 B2 generic soy-flour measurement review (R532)

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated into the shared research ledger on 2026-10-17. Added three source-specific measurement observations and set the generic soy-flour record to `researched_supported`; the picker, forms, mappings, and active substitution rules remain unchanged.
- **Open checklist:** WP02 B2, alternative flours and starches, including soy flour, at [the active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2612).
- **Record under review:** `ingredient-ref-soy-flour`, the existing `soy flour / farine de soya` identity.
- **Source-ID prefix:** `WP02-B2-SOY-FLOUR-MEASUREMENT-R532-20261017-S`. The proposed IDs and new URLs below were checked against the live ledger and proposal/batch archive.
- **Scope:** Published volume-to-mass portions for generic soy flour, with product-state and measuring-method limits. This does not reopen the identity/alias decision and does not review a reusable substitution.

## Recommendation

Integrate three source-specific portions on the existing `ingredient-ref-soy-flour` ledger record:

1. Health Canada's Canadian Nutrient File (CNF) lists **100 mL stirred = 35.9 g** and **250 mL stirred = 89.8 g** for the specific food `Soy flour, full-fat, raw` / `Soya, farine, non dégraissée, nature` (food code 3322).
2. King Arthur Baking's ingredient-weight chart lists **¼ cup = 1¼ oz = 35 g** for its unqualified “soy flour” row. Its Portuguese-muffin recipe independently uses ¼ cup (35 g) in one stated formula.

Set the target record's `measurementState` to `researched_supported` if these observations are integrated. Preserve each food description and quantity basis exactly. Do not average the values or derive a standard cup mass, default density, `g/ml` conversion, reusable unit mapping, or form. The CNF measure is specifically stirred full-fat raw soy flour; King Arthur does not identify its flour's fat or heat treatment or the chart's filling method. Their differing volume measures therefore remain separate source reports.

Leave `substitutionResearchState` at `not_yet_researched`. King Arthur's muffin recipe makes soy flour optional and says to reduce milk by one tablespoon if omitting the optional potato and/or soy flour; that is a single-formula omission adjustment, not a replacement ingredient or transferable substitution finding. Add no `ruleId`, active substitution, form, alias, recipe link, or recipe edit. The B2 parent remains open.

## Plan fit and prior decisions

The broad B2 checklist is still open. The generic soy-flour identity and OQLF-listed English/French variants were integrated earlier; the [roadmap's WP02 status](../../../roadmap.md#L366) summarizes soy flour and Kinako as identity work. The current generic soy-flour ledger record still has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`, so this is a separate measurement gap. It is distinct from the defatted-soy identity review, whose row already has `researched_no_supported_value` and `researched_no_supported_substitute` in the [roadmap entry](../../../roadmap.md#L893), and from Kinako, the source-named roasted soybean flour identity. R529 addressed *Lupinus albus* flour and is unrelated to soy.

## Active ownership and picker projection

The current generic row is:

| Field | Current value |
|---|---|
| Reference | `ingredient-ref-soy-flour` |
| Display | `soy flour / farine de soya` |
| English aliases | `soybean flour`; `soya flour` |
| French aliases | `farine de soja` |
| Category | `FLOUR_AND_STARCH` |
| Active numeric/forms | `defaultDensity: null`; `unitMappings: []`; no attached forms |
| Ledger state | Identity `verified`; measurement and substitution `not_yet_researched` |

Keep the adjacent rows separate. `ingredient-ref-defatted-soy-flour` is `defatted soy flour / farine de soya dégraissée` and has its own reviewed no-value/no-substitute research. `ingredient-ref-kinako` is `kinako / poudre de soja Kinako`, with `roasted soybean flour` as its English alias. Do not attach CNF's raw full-fat quantities to the defatted or roasted products.

The current picker uses complete normalized word-phrase matches before substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). These results were projected from the references and forms; the app picker was not run. Since R532 changes no searchable terms, proposed results are unchanged.

| Query | Current results | Proposed results | Form hint |
|---|---|---|---|
| `soy flour` | Generic soy flour; defatted soy flour | Same | None |
| `farine de soya` | Generic soy flour; defatted soy flour | Same | None |
| `farine de soja` | Generic soy flour | Same | None |
| `soybean flour` | Generic soy flour; Kinako | Same | None |
| `soya flour` | Generic soy flour | Same | None |
| `full-fat raw soy flour` | None | None | None; no alias/form proposed |
| `Soya, farine, non dégraissée, nature` | None | None | None; CNF wording is retained only in the scoped observation |
| `roasted soybean flour` | Kinako | Same | None |

The Québec French display remains OQLF's preferred `farine de soya`; its accepted French variant `farine de soja` remains an alias. The CNF's technical French food description supports the scope of its food-code row, not a new consumer display or alias.

## Measurement observations and limits

### Canadian Nutrient File, food code 3322

Health Canada's CNF page identifies the item as “Soy flour, full-fat, raw” and gives the French database wording “Soya, farine, non dégraissée, nature.” Its available serving portions list 100 mL stirred at 35.9 g and 250 mL stirred at 89.8 g. The page also lists a 20 g serving without a volume unit; that value is not used as a household portion.

Record the two stirred volume portions separately. “Stirred” is the CNF's stated measure condition; the page does not provide a sifting, spooning, leveling, or packing procedure. It is not evidence for arbitrary soy flour, the defatted row, Kinako, or a default volume conversion.

### King Arthur Baking chart and formula

King Arthur's chart row says “Soy flour,” ¼ cup, 1¼ ounces, 35 g. The chart is a baking-reference value but does not name a product, fat status, heat treatment, cup convention, or fill method. The King Arthur Portuguese-muffin recipe independently lists ¼ cup (35 g) soy flour in one formula. Its general instruction says to weigh flour or spoon it into the cup and sweep off excess; it does not identify the flour's process or establish a universal measure. The recipe makes soy flour optional and advises reducing milk by one tablespoon when the optional soy and/or potato flour is omitted. Do not reinterpret this as a soy-flour-for-milk substitution rule.

The CNF's two stirred portions and King Arthur's ¼-cup chart/recipe entry are not collapsed into one reusable value. Retain the source's stated volume, state, and technique. In particular, do not calculate a density from these portions, infer an unstated serving mass, or use any one observation as a whole-ingredient conversion.

Integrated ledger observations:

```json
[
  {
    "observationId": "cnf-3322-soy-flour-full-fat-raw-100ml-stirred-r532-20261017",
    "relationship": "portion_weight",
    "value": 35.9,
    "valueUnit": "g",
    "foodDescription": "Health Canada CNF food code 3322: soy flour, full-fat, raw / soya, farine, non dégraissée, nature.",
    "foodState": "Full-fat, raw; stirred volume measure as named by CNF.",
    "measurementMethod": "Published CNF serving-portion entry; source says 100 mL stirred.",
    "quantityBasis": "Food-code-specific published volume portion; not a default conversion for all soy flours.",
    "sourceQuantity": {"amount": 100, "unit": "ml"},
    "observedMassG": 35.9,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-B2-SOY-FLOUR-MEASUREMENT-R532-20261017-S01"]
  },
  {
    "observationId": "cnf-3322-soy-flour-full-fat-raw-250ml-stirred-r532-20261017",
    "relationship": "portion_weight",
    "value": 89.8,
    "valueUnit": "g",
    "foodDescription": "Health Canada CNF food code 3322: soy flour, full-fat, raw / soya, farine, non dégraissée, nature.",
    "foodState": "Full-fat, raw; stirred volume measure as named by CNF.",
    "measurementMethod": "Published CNF serving-portion entry; source says 250 mL stirred.",
    "quantityBasis": "Food-code-specific published volume portion; not a default conversion for all soy flours.",
    "sourceQuantity": {"amount": 250, "unit": "ml"},
    "observedMassG": 89.8,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-B2-SOY-FLOUR-MEASUREMENT-R532-20261017-S01"]
  },
  {
    "observationId": "king-arthur-soy-flour-quarter-cup-chart-r532-20261017",
    "relationship": "portion_weight",
    "value": 35,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking ingredient-weight chart, unqualified soy flour row.",
    "foodState": "Chart does not state fat status, heat treatment, product, or lot.",
    "measurementMethod": "King Arthur chart publishes 1/4 cup = 1 1/4 oz = 35 g; its Portuguese-muffin formula also lists 1/4 cup (35 g).",
    "quantityBasis": "Baking-chart and recipe-specific published portion; measuring method and cup standard are not defined by the chart.",
    "sourceQuantity": {"amount": 0.25, "unit": "cup"},
    "observedMassG": 35,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP07-KAB-IWC", "WP02-B2-SOY-FLOUR-MEASUREMENT-R532-20261017-S02"]
  }
]
```

This remains ledger evidence only. `defaultDensity` is null, `unitMappings` are empty, and no active form, conversion, recipe link, yield, or substitution rule was added. Substitution research remains unreviewed; the one muffin omission note does not establish a substitute.

## Recipe corpus and package snapshot

The manifest-ordered bundled corpus was scanned on 2026-10-17. It contains **114 recipes / 1,123 ingredient rows**. A case-insensitive scan of every ingredient row for `soy flour`, `soybean flour`, `soya flour`, `farine de soya`, and `farine de soja` found **0 matching rows**, **0 matching recipe files**, and **0 links** to `ingredient-ref-soy-flour`. The defatted-soy and Kinako references also have no bundled ingredient links. The external King Arthur muffin formula is evidence, not a bundled recipe demand.

| File | Rows/count | SHA-256 |
|---|---:|---|
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe filenames and bytes, hashed as `filename + NUL + file bytes` | 114 recipes / 1,123 ingredient rows | `d870d4e10ea14513b63e36f522668d948df59f27e9b21882826885a549ac26cd` |

Review-time package totals: 1,799 ingredient references; 144 forms; 2,156 ledger records; 9,910 source entries; 8,388 distinct source IDs; 7,096 distinct source URLs; 8 unit conversions; 56 legacy candidates. These totals describe the inspected shared worktree and are not a merge instruction.

| Current file | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `d653bdc31f156a1610dbbb4e3c2e6fa73de4adaed777ced14b9fcbc0643dce13` |
| `ingredient-forms.v1.json` | `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| `research-ledger.v1.json` | `465813a45eea6e9444260ab3ae39b6557c57ae70943ffba3e2c640b3bc5dd37f` |
| `legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |

## Source ownership and register

The existing target row owns OQLF source `WP02-S132`; reuse it for the Québec French identity definition rather than assigning a new ID. The King Arthur ingredient-weight chart is already cited for other ledger rows under the existing source ID `WP07-KAB-IWC`; reuse that ID for its soy-flour chart row. Its exact URL has 19 current ledger source entries, none attached to the generic soy-flour record, and the Portuguese-muffin recipe URL has no ledger owner. The CNF food-code URL and the new R532 prefix were searched in the live ledger and proposal/batch archive; neither already has an owner.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-S132` (existing) | OQLF, [farine de soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya), preferred terms and definition. | Existing source for `farine de soya` / `farine de soja` and `soy flour` / `soybean flour` / `soya flour`; supports current Québec naming and broad identity only. |
| `WP02-B2-SOY-FLOUR-MEASUREMENT-R532-20261017-S01` | Health Canada, [CNF serving portion, food code 3322](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3322), food names and available serving sizes. | Official CNF entry for full-fat raw soy flour: 100 mL stirred = 35.9 g; 250 mL stirred = 89.8 g; 20 g serving has no volume. Page metadata says last modified 2019-03-01. These are food-code-specific database portions, not a contemporary retail label or default soy-flour measure. |
| `WP07-KAB-IWC` (existing) | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), “Soy flour” row. | Publishes ¼ cup = 1¼ oz = 35 g. This exact chart URL is already used elsewhere under this existing ID; chart row lacks product, fat/heat treatment, cup convention, and fill-method detail. |
| `WP02-B2-SOY-FLOUR-MEASUREMENT-R532-20261017-S02` | King Arthur Baking, [Portuguese Muffins (Bolo Levedo)](https://www.kingarthurbaking.com/recipes/portuguese-muffins-bolo-levedo-recipe), ingredient list, flour-measuring instruction, and baker's tip. | Uses ¼ cup (35 g) soy flour in one optional muffin formula; says to reduce milk by 1 tbsp if omitting optional soy and/or potato flour. Supports one recipe-specific portion and formula context only, not a generic substitute. |

## Static review record

- Re-read `AGENTS.md`, the active B2 plan item and roadmap status, the generic/defatted/Kinako references, current forms and full ledger, ledger schema, legacy-candidate index, prior soy/flour decisions, picker implementation, and manifest-listed recipe corpus.
- Confirmed the generic row's measurement state is still unresearched, there are no attached forms or numeric mappings, and the defatted-soy row's separate research must not be merged into it.
- Checked the CNF code and source content online. Checked the King Arthur chart and its recipe directly. Reused existing OQLF and King Arthur chart source IDs; assigned new IDs only to unowned source records.
- Reconstructed current picker results for exact English/French, full-fat/raw, soybean, and roasted-soy queries. No names, aliases, forms, or search behavior are proposed for change.
- Scanned every ingredient row in all 114 manifest-listed recipes; no soy-flour text or target reference demand was found.
- Verified proposal UTF-8 decoding, no BOM, final newline, no mojibake markers, no trailing whitespace, local links, and new source-ID/URL ownership after writing. No software tests, build, emulator, or deployment were run. The shared change adds only research data to the JSON ledger, as permitted by AGENTS.md.
