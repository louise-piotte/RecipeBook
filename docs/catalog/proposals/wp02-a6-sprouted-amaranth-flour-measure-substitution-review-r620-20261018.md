# WP02 A6 sprouted amaranth flour measurement and substitution review — R620 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated as a ledger-only evidence update. See the [R620 integration README](../batches/wp02-a6-sprouted-amaranth-flour-measure-substitution-integration-r620-20261018/README.md). No active catalog data or executable code changed.
- **Scope:** Complete the open measurement and reusable-replacement research for the existing `ingredient-ref-sprouted-amaranth-flour` row.
- **Plan anchor:** [WP02 Section A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1784) remains open. This review closes the open measurement and substitution research questions without expanding the active identity.
- **Distinct from R616:** R616 reviewed the separate roasted-quinoa-flour row; R620 concerns sprouted amaranth flour.
- **Uniqueness:** Before the R620 integration, the proposal name, finding ID, and proposed source-ID prefix were absent from the ledger and proposal/batch archive. The five new source URLs below were not already registered in the ledger.

## Recommendation

For `ingredient-ref-sprouted-amaranth-flour`, set `measurementState` to `researched_no_supported_value` for a transferable measure and `substitutionResearchState` to `researched_no_supported_substitute`. Preserve one PureLiving product-label serving as a source-specific observation, record the dough-study and product-guidance limits in one evidence-only substitution finding, and leave the active reference unchanged.

Everspring Farms is the current Ontario bulk supplier that anchors the active identity. Its current product page lists 50 lb and 20 kg bags with a 250 lb minimum order, but no household serving, cup-to-mass pair, or density. A retail listing reproduces the PureLiving product label's `1/4 cup (31 g)` serving for a separate Canadian-origin sprouted amaranth flour. Record that one product-specific portion only; do not make it the identity's default measure. A primary study uses measured flour percentages in controlled dough experiments, but does not establish a home measure or a ready-to-use recipe replacement for Everspring's product. Two makers publish different replacement recommendations for their own sprouted amaranth products. Keep those brand-specific statements as evidence; do not promote them to an identity-wide rule.

## Current ownership and prior review boundary

| Surface | Current state | R620 treatment |
|---|---|---|
| Active reference | `ingredient-ref-sprouted-amaranth-flour`, `sprouted amaranth flour / farine d'amarante germée`, category `FLOUR_AND_STARCH`; no aliases; `defaultDensity: null`; `unitMappings: []`. | Preserve the identity, French display, aliases, category, and empty numeric fields. |
| Forms | No form is attached to the reference. | No form or conversion is proposed. |
| Research ledger | `identityState: verified`; both measurement and substitution research are `not_yet_researched`; no measurement observations or substitution findings. | Record one PureLiving product-label portion observation, conclude that no transferable measure is supported for the active identity, and complete reusable-replacement research with one finding. |
| Active substitutions and yields | No global rule, contextual rule, or package-yield record references the target. | Add none. |
| Recipe links | No bundled recipe line references the target. | Add none. |

The earlier [identity review](wp02-a6-quinoa-amaranth-flour-identity-review-20261011.md), [independent Québec wording review](wp02-a6-quinoa-amaranth-quebec-wording-review-20261011.md), and [integration README](../batches/wp02-a6-quinoa-amaranth-flour-integration-20261011/README.md) established the process-qualified identity and accepted `farine d'amarante germée` as a linguistically supported display. They did not review measurement or substitution behavior. The French compound is supported compositionally by OQLF's feminine `amarante`, OQLF's `graine germée`, and a Canadian French product label for whole sprouted amaranth; it is not an exact Québec flour-package label or a complete OQLF term.

## Product, measurement, and French evidence

- The current [Everspring Farms product page](https://www.everspringfarms.ca/product/sprouted-amaranth-flour/) lists conventional and organic sprouted amaranth flour SKUs sourced from Peru/India and packages them in 50 lb or 20 kg bags, with a 250 lb minimum. This is bulk procurement information, not a recipe portion or household measure. The product page does not give a volume-to-mass pair or density.
- The current [PureLiving product page](https://shilohfarms.com/pureliving-sprouted-amaranth-flour/) describes organic sprouted whole-grain amaranth flour and gives country of origin as Canada. The iHerb listing for Pure Living's named 24 oz / 680 g sprouted amaranth flour, UPC 037247020119, indexes its nutrition panel as **1/4 cup (31 g)** per serving. Its direct page redirected to an inaccessible regional page, but the same UPC's [Vitacost listing](https://www.vitacost.com/products/pure-living-organic-sprouted-grain-amaranth-flour-24-oz-680-g-158169) directly exposes the same panel and confirms the serving. Preserve this as a source-specific product-label portion; neither listing specifies the cup convention or how the flour is filled. The product's recommendation to replace 10%–20% of recipe flour is addressed below.
- The primary [Guardianelli, Salinas, and Puppo study](https://doi.org/10.1016/j.foodhyd.2019.105242) tested germinated and non-germinated amaranth flour in wheat-flour dough at 5%, 15%, and 25%. Its methods describe germination for 18 hours at 30°C and farinograph-based water absorption. The study uses controlled mass-based formulations and reports dough hydration/rheology; it does not report a household measure, volume-to-mass value, or reusable flour density. It does not identify its amaranth flour as Everspring's product.
- [OQLF's GDT entry for *amarante*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante) gives the preferred Québec French term, feminine gender, English `amaranth`, and notes that the seeds may be milled into flour. OQLF's [*graine germée* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541740/graine-germee) supports the French sprouted-seed concept. The Canadian French [Healthy Planet listing](https://www.healthyplanetcanada.com/fr/second-spring-organic-sprouted-amaranth-454g.html) uses `amarante germée biologique` for the whole sprouted seed, not flour. These sources support the existing display's grammar and meaning without claiming that this exact flour compound is standardized or package-attested in Québec.
- Other current sprouted-amaranth product pages do not supply a transferable measure. Blue Mountain Organics lists a 5 lb product but no kitchen volume or flour mass per volume. PureLiving's label quantity remains specific to its named Canadian-origin SKU; do not transfer it to Everspring's bulk SKUs or other sprouted amaranth flours.

Measurement conclusion: add one product-specific `portion_weight` observation for PureLiving's labeled `1/4 cup (31 g)` serving, while setting the active identity's measurement research state to `researched_no_supported_value` because the label does not establish a transferable measure. Keep `defaultDensity: null` and `unitMappings: []`; the label does not establish the active identity's default measure, a standardized fill method, or a general density.

## Substitution evidence and limits

- Blue Mountain Organics' [sprouted organic amaranth flour page](https://www.bluemountainorganics.com/stone-ground-organic-sprouted-amaranth-flour-5-lb.html) describes a soaked, dehydrated, stone-ground product and advises replacing up to 50% of flour with amaranth flour in its listed applications. The statement applies to that maker's product and gives no replacement basis or method-specific adjustment.
- The official PureLiving [sprouted amaranth flour product page](https://shilohfarms.com/pureliving-sprouted-amaranth-flour/) recommends using its flour in combination with other alternative flours and replacing 10%–20% of the recipe's total flour. It is also product-specific guidance; the page does not define a common dish method or transferable brand-neutral ratio.
- Guardianelli et al. studied dough, not completed home recipes. At the 25% germinated-amaranth formulation, the dough had lower consistency and a higher loss-to-storage modulus ratio than the wheat control; these are experimental dough results, not a user-facing adjustment rule. The study's controlled flour and process do not establish a match to Everspring's commercial product.

The manufacturer recommendations differ (10%–20% versus up to 50%) and are not tied to the active identity's bulk SKU or a common recipe method. Record the literature and manufacturer instructions without activating a global or contextual replacement. A contextual rule would need a product/form match and a bounded dish, role, method, basis, and adjustment that these sources do not jointly establish.

## Picker and recipe-corpus impact

The active phrase-first picker currently projects:

| Query | Current result IDs |
|---|---|
| `amaranth flour` | `ingredient-ref-amaranth-flour`, `ingredient-ref-sprouted-amaranth-flour` |
| `farine d'amarante` | `ingredient-ref-amaranth-flour`, `ingredient-ref-sprouted-amaranth-flour` |
| `sprouted amaranth flour` | `ingredient-ref-sprouted-amaranth-flour` |
| `farine d'amarante germée` | `ingredient-ref-sprouted-amaranth-flour` |
| `amaranth` / `amarante` | Six related identities: grain, flour, flakes, greens, puffed amaranth, and sprouted-amaranth flour |

The review adds no reference, alias, form, or picker term, so these results and the existing generic/sprouted distinction remain unchanged. This leaves the broad family query as a six-choice result and the full sprouted-flour phrase specific to its active row.

The manifest-ordered static scan covered **114 recipe files and 1,123 ingredient rows**. It found no direct target ID, English/French display, or sprouted-amaranth-flour phrase match. No bundled recipe demand supports an active measure or recipe-line substitution.

## Exact proposed ledger delta

Reuse the current source records already attached to the target for Everspring and the French terminology review. Refresh the existing Everspring source (`WP02-A6-QAM-FLOUR-20261011-S14`) to reflect the current product page's packaging and bulk-only status; do not register the same URL a second time. Add five new source records below, set the research states, and append one measurement observation, one substitution finding, and one decision on the existing ledger row. No other ledger record changes.

For the Everspring source update, set:

```json
{
  "sourceId": "WP02-A6-QAM-FLOUR-20261011-S14",
  "accessedOn": "2026-10-18",
  "locator": "Current product title, product details, and sizing sections.",
  "supports": "The Ontario supplier lists conventional and organic sprouted amaranth flour SKUs sourced from Peru/India and packages them in 50 lb or 20 kg bags with a 250 lb minimum order. The current bulk listing gives no household serving, cup-to-mass pair, or flour density and provides no product-matched replacement ratio. It remains English-only and does not specify one universal sprouting protocol."
}
```

Append these source records to the same target record's `sources` array:

```json
[
  {
    "sourceId": "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S01",
    "url": "https://doi.org/10.1016/j.foodhyd.2019.105242",
    "title": "Guardianelli, Luciano M., María V. Salinas, and María C. Puppo. Hydration and rheological properties of amaranth-wheat flour dough: Influence of germination of amaranth seeds",
    "versionOrDate": "Food Hydrocolloids 97 (2019), 105242; DOI 10.1016/j.foodhyd.2019.105242",
    "accessedOn": "2026-10-18",
    "locator": "Abstract; Materials and Methods §§2.1–2.2; dough hydration and rheology results.",
    "supports": "Primary study tested germinated and non-germinated amaranth flour in wheat dough at 5%, 15%, and 25%; germinated seeds were prepared for 18 hours at 30°C. The controlled flour percentages and farinograph water-absorption results describe experimental dough formulations, not a household measure, mass-volume conversion, or reusable home-recipe replacement. The study does not identify its flour as Everspring's commercial product.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S02",
    "url": "https://www.bluemountainorganics.com/stone-ground-organic-sprouted-amaranth-flour-5-lb.html",
    "title": "Blue Mountain Organics, Amaranth Flour 5 lb, Sprouted, Organic",
    "accessedOn": "2026-10-18",
    "locator": "Product title, process description, package size, and use guidance.",
    "supports": "The maker describes its own sprouted flour as soaked, dehydrated, and stone-ground and recommends replacing up to 50% of flour in listed applications. Its product page supplies no cup-to-mass measure or density and does not specify a common replacement basis or method-specific adjustment. The recommendation is product-specific, not a general rule for the Everspring SKU or all sprouted amaranth flour.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S03",
    "url": "https://shilohfarms.com/pureliving-sprouted-amaranth-flour/",
    "title": "Shiloh Farms / PureLiving, Sprouted Amaranth Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product description, usage guidance, and whole-grain serving statement.",
    "supports": "The official product page identifies organic sprouted whole-grain amaranth flour, gives Canada as its country of origin, recommends combining it with other alternative flours, and recommends replacing 10%–20% of total recipe flour. Its 31 g whole-grain-per-serving claim does not give a household volume or cup-to-mass statement. The page supplies no transferable, method-specific replacement rule.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S04",
    "url": "https://www.iherb.com/pr/pure-living-organic-sprouted-grain-amaranth-flour-24-oz-680-g/158169",
    "title": "iHerb, Pure Living Organic Sprouted Grain Amaranth Flour, 24 oz (680 g)",
    "accessedOn": "2026-10-18",
    "locator": "Search-indexed product details, ingredient statement, and reproduced Nutrition Facts panel.",
    "supports": "The iHerb retail listing identifies the 24 oz / 680 g Pure Living sprouted whole-grain amaranth flour, UPC 037247020119, and its search-indexed nutrition panel reports 1/4 cup (31 g). Direct page access redirected to an inaccessible regional page; the serving is independently confirmed by the accessible Vitacost listing for the same UPC. The cup convention and fill method are not specified, and current stock is not relied upon.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S05",
    "url": "https://www.vitacost.com/products/pure-living-organic-sprouted-grain-amaranth-flour-24-oz-680-g-158169",
    "title": "Vitacost, Pure Living Organic Sprouted Grain Amaranth Flour, 24 oz (680 g)",
    "accessedOn": "2026-10-18",
    "locator": "Product title, UPC, and reproduced Nutrition Facts serving size.",
    "supports": "The accessible retail listing identifies Pure Living Organic Sprouted Grain Amaranth Flour, 24 oz / 680 g, UPC 037247020119, and reproduces a product-label serving size of 1/4 cup (31 g). It independently confirms the indexed iHerb serving for the same product. The cup convention and fill method are not specified; this is a source-specific product portion only.",
    "sourceKind": "other"
  }
]
```

Apply these target-record field values and append the indicated finding and decision:

```json
{
  "recordId": "ingredient-ref-sprouted-amaranth-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "measurementObservations": [
    {
      "observationId": "sprouted-amaranth-flour-pureliving-quarter-cup-31-g-label-r620-20261018",
      "relationship": "portion_weight",
      "value": 31,
      "valueUnit": "g",
      "foodDescription": "Pure Living Organic Sprouted Grain Amaranth Flour, 24 oz / 680 g package, UPC 037247020119",
      "foodState": "Dry, as sold; product-label serving.",
      "measurementMethod": "The iHerb listing indexes, and the Vitacost listing reproduces, the product Nutrition Facts serving size 1/4 cup (31 g); cup reference and fill method are not specified.",
      "quantityBasis": "One named product-label serving only. Do not infer a default measure, standardized cup-fill method, or general density for sprouted amaranth flour.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Label-stated cup; reference volume and fill method are unspecified."
      },
      "observedMassG": 31,
      "evidenceKind": "manufacturer_label",
      "sourceIds": [
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S04",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S05"
      ]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "sprouted-amaranth-flour-no-reusable-measure-or-general-replacement-r620-20261018",
      "researchState": "researched_no_supported_substitute",
      "fromIngredientRefId": "ingredient-ref-sprouted-amaranth-flour",
      "context": "Whether the active sprouted-amaranth-flour identity supports a reusable household measure or a general home-recipe replacement.",
      "basis": "Everspring's current product listing provides bulk bag sizes only. One PureLiving label lists 1/4 cup (31 g) for its Canadian-origin SKU, but this supports a source-specific portion observation only, not a default measure for all sprouted amaranth flour or a density. Guardianelli et al. tested controlled germinated-amaranth flour blends at 5%, 15%, and 25% and measured dough hydration and rheology; the study does not identify the flour as Everspring's product or validate a home-recipe exchange. Blue Mountain recommends up to 50% replacement for its own product, while PureLiving recommends 10%–20% of total flour for its product; neither page provides a shared method-specific ratio or adjustment transferable across products.",
      "expectedEffects": [
        "In Guardianelli et al.'s controlled dough study, the 25% germinated-amaranth blend had lower consistency and a higher loss-to-storage modulus ratio than the wheat control; those rheological results are specific to the tested flour and formula."
      ],
      "limitations": [
        "Do not interpret Everspring's bulk bag weights or experimental formula percentages as a household measure, density, or mass-volume conversion. Keep PureLiving's 1/4 cup (31 g) serving tied to that exact product; it does not establish a general density or default for the active identity.",
        "Keep the 10%–20% PureLiving and up-to-50% Blue Mountain recommendations scoped to their named products; do not apply them to the Everspring supplier row or unspecified recipes.",
        "Do not activate a global or contextual substitution rule or attach a recipe-line substitution; the bundled corpus has no matching sprouted-amaranth-flour line."
      ],
      "sourceIds": [
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S01",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S02",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S03",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S04",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S05",
        "WP02-A6-QAM-FLOUR-20261011-S14"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the separate evidence review for the verified sprouted-amaranth-flour identity. Current Everspring product data provides bulk package mass but no household measure; one PureLiving product label supports a source-specific 1/4 cup (31 g) portion without supporting a default for the identity. Controlled dough research and differing brand-specific replacement recommendations do not establish a general home-recipe substitute. Keep active numeric fields and runtime substitution behavior unchanged.",
      "sourceIds": [
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S01",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S02",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S03",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S04",
        "WP02-A6-SPROUTED-AMARANTH-MEASURE-SUB-R620-20261018-S05",
        "WP02-A6-QAM-FLOUR-20261011-S14",
        "WP02-A6-FRWORD-20261011-S02",
        "WP02-A6-FRWORD-20261011-S03",
        "WP02-A6-FRWORD-20261011-S09"
      ]
    }
  ]
}
```

The ledger's existing `sources`, `decisions`, and source-specific evidence remain in place. Do not add a form, default density, unit mapping, conversion, package yield, recipe link, or active global/contextual substitution rule. Do not change active references or generated files.

## Open risks

- The Everspring listing is wholesale and names Peru/India as product origin; it does not provide a consumer-package serving or a quantified sprouting protocol. The PureLiving portion remains tied to one named Canadian-origin retail SKU; the iHerb page redirected, but Vitacost directly exposed the matching UPC and serving-size panel. Neither retail page specifies the cup convention or fill method. Another product could use a different cultivar or process.
- The French display is accepted as a transparent Québec-appropriate construction but is not an exact bilingual flour label. Keep that evidence distinction in future reviews.
- Other product makers may eventually provide a method-specific recipe with a stated replacement basis. If so, evaluate the exact product and recipe context before considering a scoped rule.

## Static checks performed

- Read the current `AGENTS.md`, `roadmap.md`, Section A6 and measurement/substitution requirements in the global plan, the active target reference and ledger row, its forms, global and contextual rules, package yields, and related identity/Québec wording proposals.
- Parsed the active reference and ledger JSON and validated the projected R620 target-record update against the research-ledger schema in memory. Confirmed the target identity, current research states, empty aliases, null default density, empty unit mappings, no attached forms, and no rule/yield ownership.
- Rechecked current primary/product pages for Everspring, Blue Mountain Organics, and PureLiving; the Guardianelli et al. primary study; OQLF terminology; and Canadian French `amarante germée` product wording. Reused existing source registrations for Everspring and the French terminology evidence. The iHerb page redirected to an inaccessible regional page, but Vitacost's directly accessible listing for the same UPC reproduces the same Nutrition Facts serving. The observation remains attached to both retailer sources and to the named Pure Living product.
- Recomputed the active phrase-first picker projection from the current reference JSON: complete sprouted-flour queries return the target alone; generic English/French flour queries return both generic and sprouted flour; broad `amaranth` / `amarante` queries return six related identities. R620 proposes no search term or picker change.
- Scanned all manifest-listed recipes: 114 recipe files and 1,123 ingredient rows; no target ID, exact English/French display, or sprouted-amaranth-flour phrase match was found.
- Confirmed the R620 filename, finding ID, source-ID prefix, and five new source URLs are unique within the existing proposal/batch archive and ledger. The integration changes only the research ledger; no software tests, build, emulator run, or deployment were needed under `AGENTS.md`.
- The saved proposal was checked as UTF-8 without BOM, with a final newline and no mojibake markers. Its proposed JSON code blocks parse successfully.
