# WP02 Section A7 R646: cracked-rye recipe-portion review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated. This review adds one product-specific portion observation to an existing research-ledger row; the active catalog stays unchanged.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). The A7 rye-grits boundary review preserves `seigle concassé` on the existing cracked-rye identity [R434](../batches/wp02-wp04-wp06-r434-r436-gap-review-integration-20261017/README.md#L7). This review covers a measurement gap on that neighboring milling product; the identity itself was integrated under WP03 Section F.
- **Candidate:** Existing `ingredient-ref-cracked-rye` (`cracked rye / seigle concassé`), whose ledger measurement state is still `not_yet_researched` and which has no observations.
- **Scope:** Record the explicit amount in Janie's Mill's own Pumpkin Rye Scones recipe for its named Cracked Rye product. Do not add aliases, identity records, recipe links, conversions, yields, or substitutions.
- **Avoided reviews:** R605, R624, R628, R631, R635, R638, R640, and R643. This review covers neither barley grits nor any semolina identity or finding.

## Recommendation

Update only the existing `ingredient-ref-cracked-rye` ledger record:

1. Change `measurementState` from `not_yet_researched` to `researched_supported` for the narrow observation recorded here.
2. Add the two current Janie's Mill pages below as sources and append one `portion_weight` observation: the recipe lists **⅓ cup (70 g)** of Janie's Mill Cracked Rye in its Pumpkin Rye Scones formula.
3. Append an accepted, source-bounded decision. Keep `identityState: verified` and `substitutionResearchState: not_yet_researched` unchanged.

**Active numeric behavior supported:** none. The recipe's explicit pair supports a ledger observation for this exact product in this formula only. It does not establish a general cup weight, density, unit mapping, per-scone amount, cooking yield, or value for another mill or granulation.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| Janie's Mill, [Organic Cracked Rye product page](https://www.janiesmill.com/products/cracked-rye-chops), current manufacturer page | Identifies the product as Organic Cracked Rye, made from organic whole rye berries; describes medium-fine granules and the product-specific term “rye chops.” | Supports this manufacturer's product and granulation only. It does not support adding `rye chops`, `organic cracked rye`, or `cracked rye berries` as global aliases, or a crosswalk to other suppliers' particle sizes. |
| Janie's Mill, [Pumpkin Rye Scones](https://www.janiesmill.com/blogs/recipes/pumpkin-rye-scones), posted December 10, 2024; rechecked 2026-10-18 | The ingredient list explicitly gives **⅓ cup (70 g) Janie's Mill Cracked Rye**. The first instruction cooks that cracked rye with water until tender and the water has evaporated. | This is one recipe-formula amount, before cooking. The page does not report an independent weighing procedure, cup-fill method, cooked mass, or a per-scone ingredient quantity. |
| Existing ledger source `WP03-CRYE-20261012-S06`, [Janie's Mill Cracked Rye Chops](https://www.janiesmill.com/collections/retail/products/cracked-rye-chops) | Already records this mill's product-specific cracked-rye wording and medium-fine granulation on the target row. The current manufacturer page above confirms the same product under its current canonical path. | This existing source is reused for the product/identity boundary; it is not independent measurement evidence. |

The new measurement is limited to the named mill product. The source's later cooking step does not establish an ingredient yield: it gives no mass or final volume after cooking, and the recipe's water quantity must not be treated as a cracked-rye conversion.

## Ownership, terminology, picker, and recipe-demand audit

| Surface | Current state | R646 disposition |
|---|---|---|
| Active identity and aliases | `ingredient-ref-cracked-rye` is `cracked rye / seigle concassé`, category `GRAIN_AND_CEREAL`, with empty English and French alias arrays, null `defaultDensity`, and empty `unitMappings`. The separate `ingredient-ref-rye-meal` owns `rye meal / gruau de seigle` and its meal aliases. | Preserve both identities and all active fields. Do not add `rye chops`, `organic cracked rye`, `cracked rye berries`, or a new French term. The French wording remains supported by the Québec mill and Québec food-directory evidence already on the cracked-rye row; Janie's Mill is not Québec terminology evidence. |
| Research ledger and IDs | The target row is verified, with measurement and substitution research both `not_yet_researched` and zero measurement observations. Existing source `WP03-CRYE-20261012-S06` already records Janie's Mill product evidence. The R646 source IDs, observation ID, and proposal path were absent before this review; the new page URLs were not already ledger sources. | Reuse S06 for the product boundary and append only the R646 sources, observation, and decision shown below. Do not duplicate S06 or change the identity decision. |
| Forms, mappings, and rules | No ingredient form or ingredient-specific unit conversion references cracked rye. Active density is null and mappings are empty. The bundled same-ingredient and contextual substitution-rule arrays are empty; no package-yield record applies to rye. | Add none. Preserve substitution research as `not_yet_researched`; the recipe's cooking instruction is not a yield or substitution rule. |
| Picker | The exact English and French names belong only to `ingredient-ref-cracked-rye`; `rye chops` is not an active alias. | No search behavior changes because the proposal touches the research ledger only. |
| Bundled recipe demand | Parsed all 114 manifest-listed recipe files and all 1,123 structured ingredient rows. No line uses `ingredient-ref-cracked-rye` or names cracked rye / `seigle concassé` / rye chops. | The external scone formula is evidence only. Add no bundled recipe line or link. |

The new source IDs are `WP02-A7-CRACKED-RYE-R646-20261018-S01` and `WP02-A7-CRACKED-RYE-R646-20261018-S02`; the new observation ID is `cracked-rye-janies-mill-pumpkin-rye-scones-one-third-cup-70-g-r646-20261018`. All were searched across the active ledger, proposal archive, and batch archive before drafting. The exact proposal path was also absent.

## Exact proposed ledger delta

In the `ingredient-ref-cracked-rye` record, append these sources, set `measurementState` to `researched_supported`, append the observation, and append the decision. Keep all other fields and existing source entries unchanged.

```json
[
  {
    "sourceId": "WP02-A7-CRACKED-RYE-R646-20261018-S01",
    "url": "https://www.janiesmill.com/products/cracked-rye-chops",
    "title": "Janie's Mill, Organic Cracked Rye",
    "accessedOn": "2026-10-18",
    "locator": "Product Info",
    "supports": "The current manufacturer page identifies Organic Cracked Rye as medium-fine granules milled from organic whole rye berries and describes rye chops as this product's term. Supports only this product and granulation; it does not establish a global alias or cross-supplier grind equivalence.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-CRACKED-RYE-R646-20261018-S02",
    "url": "https://www.janiesmill.com/blogs/recipes/pumpkin-rye-scones",
    "title": "Janie's Mill, Pumpkin Rye Scones",
    "versionOrDate": "Posted 2024-12-10",
    "accessedOn": "2026-10-18",
    "locator": "Ingredient list and instruction 1",
    "supports": "The formula lists ⅓ cup (70 g) of Janie's Mill Cracked Rye. Its first instruction cooks the cracked rye with water until tender and the water has evaporated. The amount is specific to this recipe and product; no fill method, independent weighing method, cooked yield, or per-scone amount is reported.",
    "sourceKind": "culinary_reference"
  }
]
```

Append this observation. The cup amount is retained exactly in the text fields; no decimal approximation of the printed common fraction is stored, and no volume-to-mass mapping is proposed.

```json
{
  "observationId": "cracked-rye-janies-mill-pumpkin-rye-scones-one-third-cup-70-g-r646-20261018",
  "relationship": "portion_weight",
  "value": 70,
  "valueUnit": "g",
  "foodDescription": "Janie's Mill Cracked Rye, the manufacturer's medium-fine cracked whole-rye granules, in its Pumpkin Rye Scones formula.",
  "foodState": "Dry, uncooked cracked rye as listed in the recipe ingredient line, before the recipe cooks it with water.",
  "measurementMethod": "The published ingredient line directly reports ⅓ cup (70 g). The source does not describe an independent weighing procedure or how the cup was filled.",
  "quantityBasis": "One Pumpkin Rye Scones formula only. Keep the published ⅓-cup / 70-g pair source-specific; do not infer a per-scone amount, general cup weight, density, unit conversion, cooking yield, or value for another supplier or granulation.",
  "observedMassG": 70,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-CRACKED-RYE-R646-20261018-S01",
    "WP02-A7-CRACKED-RYE-R646-20261018-S02"
  ]
}
```

Append this decision. Keep `defaultDensity: null`, `unitMappings: []`, and `substitutionResearchState: not_yet_researched` unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record Janie's Mill's published ⅓-cup (70-g) amount for its own cracked-rye product in the Pumpkin Rye Scones formula only. This formula-specific ingredient portion is not a general cracked-rye cup weight, independent measure, per-scone amount, cooking yield, density, unit mapping, or conversion. Keep active names, aliases, picker results, density, mappings, forms, recipe links, and substitution behavior unchanged.",
  "sourceIds": [
    "WP02-A7-CRACKED-RYE-R646-20261018-S01",
    "WP02-A7-CRACKED-RYE-R646-20261018-S02"
  ]
}
```

## Static review checks

- Re-read `AGENTS.md`, the Requirements conversion rules, current roadmap and A7 checklist, active reference and ledger records, the research-ledger schema, and recent A7 proposals through R643.
- Reopened Janie's Mill's current product page and reviewed the official recipe page's indexed ingredient list and instructions; direct fetch of the recipe page returned a cache miss. The product source defines the named medium-fine cracked rye from whole rye berries; the recipe directly reports ⅓ cup (70 g) and then describes cooking. No mass, volume, density, or yield was derived.
- Audited exact active-name and alias ownership, ledger source IDs and URLs, measurement observations, forms, rules, mappings, density, substitutions, and package yields for the rye milling products.
- Parsed all 114 bundled recipes and 1,123 ingredient rows; found no cracked-rye recipe-line demand or existing recipe link.
- Checked the proposed new source IDs, observation ID, source URLs, and proposal path for prior ownership. Reused existing Janie's Mill identity evidence on the target row without copying its source record.
- Parsed the three proposed JSON blocks and integrated them into the active ledger row; the complete ledger validates against `research-ledger.schema.json`, and every observation/decision source ID resolves. UTF-8, BOM, whitespace, and mojibake checks passed. The ledger and catalog documentation changed; no active catalog fields changed. No software tests, build, or emulator run were needed because this only adds database JSON data under `AGENTS.md`.

