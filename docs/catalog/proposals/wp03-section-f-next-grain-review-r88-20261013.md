# WP03 Section F — hulless barley terminology review (R88)

## Review record

- **Reviewed:** 2026-10-13.
- **Open checklist:** `[ ] Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.` ([live plan, line 2828](../../RecipeBook-global-ingredient-catalog-plan.txt#L2828)).
- **Candidate:** plain whole hulless barley kernels, also called naked barley; French technical type wording `orge à grains nus`.
- **Recommendation: Add three search aliases to the existing `ingredient-ref-hulled-barley` row.** Append English `hulless barley` and `naked barley`, and French `orge à grains nus`. Keep the display `hulled barley / orge mondé`; add no identity row or form. Canadian Grain Commission terminology identifies a hulless barley type and maps it to `orge à grains nus`; the federal bilingual food specification states that hulled, whole, or hull-less barley has only the inedible outer husk removed. That edible whole-kernel state matches the existing OQLF-backed hulled-barley identity. The French alias is a Canadian grain-class term, not a Québec retail label.
- **Work boundary:** Proposal only. No shared catalog, form, ledger, checklist, roadmap, application code, generated file, or batch README was edited.

## Identity and product boundary

The Canadian Grain Commission (CGC) defines hulless barley as varieties whose outer hull adheres loosely and is usually removed during field harvest; processors often call the type “naked” barley. Its current guide lists hulless varieties within food-grade barley classes and separates food barley from general-purpose barley, which is primarily for animal feed [S01]. The French CGC page gives `orge à grains nus` for the same type and says processors often call it `orge nue` [S02].

The Canadian federal food-purchase specification describes the food product more specifically: it calls hulled, whole, or hull-less barley a whole grain with only the inedible outer husk removed [S03]. The French document names the corresponding whole-grain product `orge entière` and describes the hulless variety as `orge à grains nus` [S04]. OQLF’s existing entry pairs **hulled barley / orge mondé** and defines removal of the outer hull [WP03-S32]. Read together, these sources support sending consumer searches for plain whole hulless barley to that existing culinary identity. They do not establish a separate cooked ingredient identity based on barley variety.

The alias is a search route from a barley-type term to the food-ready whole-kernel product. It does not claim that a grower mechanically dehulled the kernels. CGC says the loose hull usually falls away during harvest and warns that residual hull fragments may still need mechanical removal before consumption [S01, S06]. The current hulled-barley display describes the edible kernel state; it does not specify the process used to reach that state.

Living Sky Farms, a Canadian grain seller, has a product titled **Hulless Barley Kernels** and describes whole kernels for milling or cooking in soups, stews, and barley salads [S05]. Its page showed the product as sold out during this review, so it supports Canadian product wording and use rather than current stock. It lists 5, 10, 20, and 50 lb package sizes; these are SKU/package options, not kitchen measures.

CGC notes that hulless barley may retain adhering hull remnants that must be removed mechanically before the grain is suitable for consumption [S06]. The alias applies to the edible whole-kernel product described by the food specification and seller. It does not certify an uncleaned bulk sample, animal-feed grade, malt, flour, grits, or barley meal as a hulled-barley recipe ingredient.

## Québec French scope

Keep the active display `hulled barley / orge mondé`. OQLF supplies that bilingual term and the culinary outer-hull definition in the existing hulled-barley ledger record [WP03-S32]. CGC’s French `orge à grains nus` is an official Canadian grain-class term and is included as a search alias so that a French query for the documented type reaches the existing whole-grain choice. No Québec retail package or OQLF entry for a hulless-specific consumer label was found; this review does not describe `orge à grains nus` as a preferred Québec display.

Do not add `orge nue`: CGC reports it as a processor synonym, while a Québec food producer separately lists `orge nue germée maltée`, a sprouted malted product [S07]. Do not add `orge entière`: the federal French purchasing specification uses it for whole hull-less/hulled barley, but the current catalog already has `whole barley flour / farine d’orge entière`, so this query phrase would collide with a flour product. The technical French alias `orge à grains nus` avoids those ambiguities and leaves the current OQLF display visible.

## Live ownership and archive audit

The current package has **1,419 ingredient references, 104 forms, 63 legacy candidates, and 1,758 ledger records**. The manifest contains **114 recipe files and 1,123 ingredient rows**. Exact searches found no active reference, attached form, or legacy candidate for `hulless barley`, `hull-less barley`, `naked barley`, or `orge à grains nus`, and no previous decision assigned these terms to the hulled-barley owner. R52 excluded hulless terms from the broader generic `barley / orge` aliases; this proposal keeps that row unchanged and attaches the documented whole-kernel wording to the existing qualified owner.

| Current owner | Live fields and boundary | R88 action |
|---|---|---|
| [`ingredient-ref-hulled-barley`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L8079) | `hulled barley / orge mondé`, `GRAIN_AND_CEREAL`, no aliases, `defaultDensity: null`, `unitMappings: []`. Its [ledger record](../research-ledger.v1.json#L60679) is identity-verified; measurement and substitution research remain `not_yet_researched`. | Add two English and one narrowly worded French search alias. Preserve display and ledger states. |
| `ingredient-ref-barley` | Generic `barley / orge`, no aliases. R52 deliberately kept hulless wording off the generic row because the broader term includes multiple barley types and product states [R52 proposal](wp03-section-f-generic-barley-grain-identity-review-20261013-r52.md#L26). | Leave the generic row unchanged; the proposed aliases belong to the whole-kernel owner. |
| `ingredient-ref-pearl-barley`, `ingredient-ref-pot-barley` | Separate pearl-polished and partially polished product owners; the current picker maps `pearl barley` and `pot barley` to their own rows. | Keep distinct. The new aliases do not include either product name. |
| Barley meals, grits, flours, flakes, malt, puffed barley, sprouted barley, and barley couscous | Existing product owners or separately bounded candidates. R36 mentions hulless barley as a tsampa input; the WP02 meal review documents a Canadian mill’s cross-cut hulless pieces called barley meal/grits. Neither decides plain-kernel ownership [R36 proposal](wp03-section-f-tsampa-roasted-barley-picker-boundary-hold-20261013-r36.md#L16). | Keep these products and processing states separate. Longer phrases such as `naked barley flour` do not become aliases. |
| Exact candidate terms | No active exact owner, legacy candidate, or focused prior alias decision found. | No new reference, form, or candidate ledger record. |

## Recipe demand

A read-only scan covered all **114 manifest-listed recipe files and 1,123 ingredient rows**. Whole-phrase searches for `hulless barley`, `hull-less barley`, `naked barley`, `orge à grains nus`, `orge nue`, and `hulled barley` found **zero matching recipe files and zero matching ingredient rows**. There are no recipe links to `ingredient-ref-hulled-barley`. This alias fills a bilingual picker term gap; it does not add recipe demand or recipe links.

## Picker projection

`IngredientSearch.kt` normalizes accents and punctuation, returns complete word-phrase matches first, and uses substring matching only when no exact phrase matches ([picker, lines 7–20 and 23–44](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L7)). A read-only projection using the live references and forms plus the proposed aliases yields:

| Query | Current result | With R88 aliases |
|---|---|---|
| `hulless barley`, `naked barley`, `orge à grains nus` | No results. | `ingredient-ref-hulled-barley` only. |
| `hulled barley`, `orge mondé` | `ingredient-ref-hulled-barley` only. | Same single owner. |
| `orge nue` | No active result. | Still no result; do not route the Québec malted-sprouted phrase to hulled grain. |
| `naked barley flour` | No result. | No result; the aliases do not claim a flour or meal product. |
| `pearl barley`, `pot barley` | Their separate existing rows only. | Unchanged. |
| Broad `barley`, `orge` | 17 matching rows for each query. | Same 17 rows; no row is added. |

`orge entière` is not proposed as an alias because the phrase appears within the existing `farine d’orge entière` display and would return the whole-barley-flour row alongside hulled barley. `orge nue` remains excluded because of the Québec producer’s separate `orge nue germée maltée` wording. These boundaries preserve exact picker ownership for the qualified grain query.

## Identity, form, numeric evidence, and substitution limits

| Dimension | Evidence limit and R88 action |
|---|---|
| **Identity** | `Hulless` / `naked` describes a barley type whose outer hull usually comes off during harvest [S01–S02]. The edible whole-kernel product is the whole-grain state with only the inedible outer husk removed [S03–S04], matching OQLF’s current hulled-barley owner. Add aliases there; do not create a second culinary identity. CGC’s note that residual hulls need mechanical removal means the alias does not certify every raw hulless sample as ready to cook [S06]. |
| **Form** | Hulless is a variety/type, not a cooked, dried, sprouted, or milled state. Add no `IngredientForm`. Keep the current dry/cooked state work scoped to its own source-backed recipe need. |
| **Measurements and density** | The seller’s 5–50 lb values are package-size selections. The federal specification gives qualitative soaking/cooking guidance but no transferable volume-to-mass measure or numerical cooking time [S03–S05]. Add no measurement observation, default density, or unit mapping. |
| **Conversion and yield** | No reviewed source gives a hulless-barley household conversion or a reusable cooking expansion. The federal note that whole barley takes longer to cook than pearl barley is qualitative and does not define a conversion or yield [S03–S04]. Add no conversion or yield. |
| **Substitution** | Living Sky suggests using whole hulless kernels in place of rice or other grain dishes [S05], but supplies no tested ratio, dish/method scope, or adjustment. Treat it as seller guidance only. Add no global or contextual substitution rule; leave the existing ledger state `not_yet_researched`. |

## Exact prospective JSON delta

Append the following aliases to the existing reference and leave all other reference fields unchanged. The French accent is escaped as required for bundled database JSON:

```json
{
  "id": "ingredient-ref-hulled-barley",
  "aliasesEn": ["hulless barley", "naked barley"],
  "aliasesFr": ["orge \u00e0 grains nus"]
}
```

Append six source records and the accepted decision below to the existing `ingredient-ref-hulled-barley` ledger record. `WP03-S32` is already on that record and remains the OQLF support. DND English/French URLs are cited on the pot-barley record under earlier source IDs; the R88 IDs below are unique and support this record’s hulless-to-whole-kernel mapping. Do not add a candidate record or change identity, measurement, or substitution states.

```json
[
  {
    "sourceId": "WP03-HULLESS-BARLEY-R88-20261013-S01",
    "url": "https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/06-barley/classes-types-varieties.html",
    "title": "Canadian Grain Commission, Barley: classes, types and varieties",
    "accessedOn": "2026-10-13",
    "locator": "Food and general-purpose classes; Hulless type; food-barley variety list",
    "supports": "Defines hulless barley as varieties whose outer hull is loosely adhered and usually removed at harvest, says processors often call it naked barley, and lists hulless food-grade classes. This is a Canadian grain classification, not a Québec retail label or a measure source.",
    "sourceKind": "regional_authority"
  },
  {
    "sourceId": "WP03-HULLESS-BARLEY-R88-20261013-S02",
    "url": "https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/06-orge/classes-types-varietes.html",
    "title": "Commission canadienne des grains, Orge : classes, types et vari\u00e9t\u00e9s",
    "accessedOn": "2026-10-13",
    "locator": "Food-grade barley classes; hulless type; variety list",
    "supports": "Uses orge \u00e0 grains nus for hulless barley and notes that processors often call it orge nue. Supports the technical French query term only; it does not establish a Qu\u00e9bec-preferred consumer display.",
    "sourceKind": "regional_authority"
  },
  {
    "sourceId": "WP03-HULLESS-BARLEY-R88-20261013-S03",
    "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf",
    "title": "Department of National Defence, Food Quality Specifications: Grains",
    "versionOrDate": "2018-04-01",
    "accessedOn": "2026-10-13",
    "locator": "FQS 24-01, paragraphs 8–15, pp. 2–3",
    "supports": "For food barley, distinguishes covered and hulless varieties, identifies hulless as usually shedding the outer hull at harvest, and describes hulled, whole, or hull-less barley as retaining the whole grain after only the inedible outer husk is removed. Separates pearl and Scotch/pot products. Gives no reusable kitchen measure.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP03-HULLESS-BARLEY-R88-20261013-S04",
    "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf",
    "title": "Minist\u00e8re de la D\u00e9fense nationale, Sp\u00e9cifications de qualit\u00e9 des aliments : grain c\u00e9r\u00e9alier",
    "versionOrDate": "2018-04-01",
    "accessedOn": "2026-10-13",
    "locator": "SQA 24-01, paragraphes 8–15, p. 2–3",
    "supports": "Uses orge \u00e0 grains nus for the hulless type and orge enti\u00e8re for the whole-kernel product from which only the outer husk is removed. Keeps orge mond\u00e9 and orge perl\u00e9 in separate product descriptions. This is federal purchasing terminology, not a Qu\u00e9bec retail label.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP03-HULLESS-BARLEY-R88-20261013-S05",
    "url": "https://livingskyfarms.ca/products/hulless-barley-kernels",
    "title": "Living Sky Farms, Hulless Barley Kernels",
    "accessedOn": "2026-10-13",
    "locator": "Product title, kernel description, cooking uses, and package-size options",
    "supports": "A Canadian grain seller names whole hulless barley kernels for milling or cooking in soups, stews, and salads. The listing was sold out when reviewed. Its 5\u201350 lb choices are package sizes, not household measures; its rice-replacement suggestion gives no ratio or method.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP03-HULLESS-BARLEY-R88-20261013-S06",
    "url": "https://www.grainscanada.gc.ca/en/grain-research/export-quality/cereals/malting-barley/nutritional-components-barley-grain.html",
    "title": "Canadian Grain Commission, Nutritional components in barley grain",
    "accessedOn": "2026-10-13",
    "locator": "Hulless and covered barley edible-grain processing notes",
    "supports": "Says hulless barley can retain adhering hull remnants that must be mechanically removed before it is suitable for consumption. Limits the alias to the food-ready whole-kernel product scope and prevents treating every uncleaned sample as a cooking ingredient.",
    "sourceKind": "regional_authority"
  }
]
```

```json
{
  "outcome": "accepted",
  "reason": "Add only hulless barley and naked barley as English aliases and orge \u00e0 grains nus as a technical French search alias on ingredient-ref-hulled-barley. The Canadian Grain Commission identifies the hulless/naked type and its French term; the federal bilingual food specification describes hulled, whole, or hull-less barley as whole grain with only the inedible outer husk removed, matching the existing OQLF-backed hulled-barley identity. This search route denotes the edible whole-kernel product and does not claim a mechanical dehulling process. Keep the Qu\u00e9bec display orge mond\u00e9. Do not add orge nue, which can route an ambiguous search toward the separate orge nue germ\u00e9e malt\u00e9e product, or orge enti\u00e8re, which overlaps the existing whole-barley-flour phrase. Add no row, form, measure, conversion, yield, recipe link, or substitution; leave measurement and substitution states unchanged.",
  "sourceIds": [
    "WP03-S32",
    "WP03-HULLESS-BARLEY-R88-20261013-S01",
    "WP03-HULLESS-BARLEY-R88-20261013-S02",
    "WP03-HULLESS-BARLEY-R88-20261013-S03",
    "WP03-HULLESS-BARLEY-R88-20261013-S04",
    "WP03-HULLESS-BARLEY-R88-20261013-S05",
    "WP03-HULLESS-BARLEY-R88-20261013-S06"
  ]
}
```

## Static review record

- Recounted current data from the live files: **1,419 references, 104 forms, 63 legacy candidates, 1,758 ledger records, 114 manifest recipes, and 1,123 ingredient rows**.
- Scanned the proposal/batch archive, live references, forms, ledger, legacy candidates, and recipe corpus for exact candidate ownership and overlap. Found no exact active owner, legacy candidate, hulled-row alias decision, form, or recipe demand. Recorded adjacent R36, R52, and WP02 barley-meal mentions as non-owning evidence.
- Reproduced the picker’s normalized complete-phrase-first behavior from `IngredientSearch.kt` in a read-only projection. Verified the three proposed terms return only `ingredient-ref-hulled-barley`, broad `barley` and `orge` remain at 17 results, and pearl/pot barley boundaries remain unchanged.
- Checked proposed reference, source-array, and decision JSON fragments parse; checked all six R88 source IDs are absent from the current ledger and unique within the proposal. Existing OQLF source `WP03-S32` is reused; DND URLs already occur on the pot-barley record, with distinct R88 IDs here.
- Checked every local Markdown link target and line anchor, UTF-8 without BOM, final newline, no trailing whitespace, and no mojibake. No app tests, Gradle tasks, emulator, or deployment were run for this proposal-only research.
