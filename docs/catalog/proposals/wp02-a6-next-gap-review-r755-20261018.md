# WP02 A6 R755 — Job’s-tears-flour measurement review — 2026-10-18

- **Status:** Proposed; no shared catalog or roadmap data has been edited.
- **Checklist fit:** The broad [WP02 A6 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838) remains open for regional and specialty grain flours. This review addresses the unresearched measurement state of the existing `ingredient-ref-jobs-tears-flour` identity. It does not repeat the recent white-, red-, or black-quinoa reviews (R737, R740, R749), fonio-flour review (R743), teff-flour review (R746), or millet-flour work (R752).
- **Recommendation:** Record the retailer-published **2 spoon (approximately 30 g)** preparation quantity only as a named-product `portion_weight` observation for Natural Blue’s Greenmax-Adlay Powder listing. Set the generic reusable measurement state to `researched_no_supported_value`. Leave density, unit mappings, aliases, forms, yields, recipe links, and active substitution behavior unchanged.

## Current row and exact boundary

The active reference is `Job’s tears flour / farine de larmes de Job`, ID `ingredient-ref-jobs-tears-flour`, category `FLOUR_AND_STARCH`, with no aliases, null `defaultDensity`, and empty `unitMappings`. Its ledger row has verified identity, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and no measurement observations. No Job’s-tears flour form, global or contextual substitution rule, or package yield is present.

The existing identity proposal deliberately kept `adlay flour`, `adlay powder`, `Job’s tears powder`, and similar product or process terms out of the global aliases. R755 does not change that decision: the retail wording remains inside the product-specific observation, and `Adlay Powder` is not proposed as an alias or form. The retailer separately says the powder can be used as a baking ingredient, but the quantity instruction is explicitly for making a beverage with warm water; it is not a baking measure.

The most recent A6 checkpoints were reviewed against this exact question. R743 closes the white-fonio-flour measurement review; R746 addresses Bob’s Red Mill teff flour; R749 addresses red quinoa flour; and R752 records generic millet-flour substitution trials. None reviews Job’s-tears-flour measurement. The current bundled package contains 114 manifest-listed recipes and 1,123 ingredient rows. A scan of all 114 recipe files and their serialized text found no target ID or hits for Job’s-tears flour, its French name, adlay flour/powder, or Coix flour.

## Evidence and limits

Natural Blue Marketing’s current [Greenmax-Adlay Powder listing](https://www.naturalblue.com.my/usr/product.aspx?id=33&pgid=4) identifies the item as `P016/IND082G03`, lists Adlay as its ingredient, gives 300 g net weight, and prints the direction “Add 2 spoon (approx. 30gm) powder to 250-300ml to warm water.” It also says the powder can be used as a baking ingredient. Its Chinese product-description section calls it 100% ground adlay. The page classifies the item under cereal and powder drinks, and does not define the spoon size, spoon volume, or weighing method. This supports one approximate serving observation for this retailer’s named listing only.

Kew Science’s [Medicinal Plant Names Services entry for “adlay”](https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=adlay) lists *Coix lacryma-jobi* L. among the accepted names associated with “adlay.” It is a name crosswalk, not evidence that a particular product lot has a verified botanical specification or a particular flour grade. It supports interpreting the retailer’s ingredient term conservatively without activating an `adlay` or `adlay powder` catalog alias.

Ahmad et al.’s 2024 [Food Chemistry: X study of wild adlay accessions](https://www.sciencedirect.com/science/article/pii/S2590157524003055) reports a flour-density column for seven wild accessions. Table 1 labels its flour-density values `g/mL³`, while the accompanying narrative reports the average as `g/m³`; the reported units conflict and cannot be normalized without guessing. The study concerns wild-accession samples rather than the retail powder. Do not record its values as bulk density, specific density, or a default density.

The existing [Watanabe et al. Job’s-tears-flour study](https://www.jstage.jst.go.jp/article/cookeryscience/49/2/49_128/_article/-char/en) remains the identity source already attached to this row. Its abstract documents a flour-based food-substitution study but supplies no general household spoon, cup, or density conversion for the catalog. No substitution decision is proposed here.

## Proposed source entries

Append these source records to the existing `ingredient-ref-jobs-tears-flour` ledger row. The source IDs and exact URLs were checked against the current ledger and proposal archive and were unowned at review time.

| Source ID | Source and supported scope |
|---|---|
| `WP02-A6-JOBSTEAR-MEAS-R755-20261018-S01` | Natural Blue Marketing Sdn Bhd, [Greenmax-Adlay Powder, P016/IND082G03](https://www.naturalblue.com.my/usr/product.aspx?id=33&pgid=4). Accessed 2026-10-18. Locator: product identifier, ingredients, preparation direction, baking-use statement, and net weight. Supports the retailer-listed 2-spoon (approximately 30 g) beverage-preparation amount for this named product only; spoon capacity and weighing method are unspecified. Source kind: `other`. |
| `WP02-A6-JOBSTEAR-MEAS-R755-20261018-S02` | Kew Science, [Medicinal Plant Names Services: adlay](https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=adlay). Accessed 2026-10-18. Locator: accepted-name crosswalk for “adlay.” Supports the common-name association with *Coix lacryma-jobi*; it does not establish the identity or processing of the retailer’s particular lot. Source kind: `other`. |
| `WP02-A6-JOBSTEAR-MEAS-R755-20261018-S03` | Ahmad et al., [“Physicochemical and nutritional profiles of wild adlay accessions…”](https://www.sciencedirect.com/science/article/pii/S2590157524003055), *Food Chemistry: X* 22 (2024), 101418, DOI [10.1016/j.fochx.2024.101418](https://doi.org/10.1016/j.fochx.2024.101418). Accessed 2026-10-18. Locator: Table 1 flour-density row and following density discussion. Documents accessions and the incompatible `g/mL³` table / `g/m³` narrative unit text; no value is adopted. Source kind: `direct_measurement`. |

Do not add a new source for the existing Watanabe et al. URL; reuse its existing source ID `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10` for identity context only.

## Exact proposed ledger delta

On the existing `ingredient-ref-jobs-tears-flour` record only:

1. Append source entries S01–S03 above.
2. Set `measurementState` to `researched_no_supported_value` for reusable generic kitchen measurements. Leave `substitutionResearchState` at `not_yet_researched`.
3. Append the following product-specific observation:

```json
{
  "observationId": "jobs-tears-flour-greenmax-adlay-powder-two-spoons-approx-30-g-r755-20261018",
  "relationship": "portion_weight",
  "value": 30,
  "valueUnit": "g",
  "foodDescription": "Greenmax-Adlay Powder, Natural Blue retailer listing P016/IND082G03; ingredient listed as Adlay; named-product observation only.",
  "foodState": "Powder as sold; retailer direction prepares it as a beverage.",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP02-A6-JOBSTEAR-MEAS-R755-20261018-S01"],
  "sourceQuantity": {
    "amount": 2,
    "unit": "spoon",
    "unitConvention": "Retailer prints '2 spoon'; spoon size and capacity are not stated. Do not normalize to teaspoon, tablespoon, or another unit."
  },
  "observedMassG": 30,
  "quantityBasis": "Retailer-published beverage preparation direction: 2 spoon (approximately 30 g) powder for 250–300 ml warm water. The page separately permits baking use but gives no baking quantity.",
  "measurementMethod": "Published retailer preparation direction; the amount is approximate and no weighing method or spoon volume is stated."
}
```

4. Append one accepted measurement decision citing S01–S03: preserve the approximate 30 g amount as evidence for this named retailer listing only; leave reusable generic measures, cup/spoon mappings, and density unsupported because the retail spoon is undefined and the study density units conflict. The product observation does not establish a standard serving for all Job’s-tears flours.

Keep the active reference name and aliases unchanged, `defaultDensity` null, `unitMappings` empty, and forms, package yields, recipe links, conversions, and substitution rules untouched. Do not transfer the retail quantity to Job’s-tears grain, other Coix products, or another brand. No active catalog behavior is added.

## Ownership and review checks

- Confirmed the exact current reference and ledger states, and found no matching form, active rule, package yield, or recipe-corpus row.
- Reviewed the A6 plan, current roadmap entries through R752–R754, the prior Job’s-tears-flour identity proposal, and the recent A6 measurement/substitution proposals. The proposed product observation is separate from those recent quinoa, fonio, teff, and millet findings.
- Verified the retailer’s serving wording, item code, listed ingredient, and baking-use note; verified the Kew common-name record and the current publisher page for the wild-adlay study. No cup capacity, normalized spoon size, usable density, generic kitchen measure, or product-independent substitution was supported.
- Checked new source IDs, observation ID, and exact source URLs against the current documentation and research ledger; they have no prior owner.
- Scanned all 114 recipe files named in the current manifest (1,123 ingredient rows); found no target reference or text match. No recipe line or corpus-derived amount is proposed.
- This proposal is documentation for a database-JSON-only ledger addition. No software tests, build, emulator run, or deployment were performed, consistent with `AGENTS.md`.

This review would resolve only the existing Job’s-tears-flour measurement gap with one scoped retailer-product observation. The broader Section A6 review remains open.
