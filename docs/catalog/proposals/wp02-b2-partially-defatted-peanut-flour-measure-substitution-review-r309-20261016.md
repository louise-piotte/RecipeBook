# WP02 B2 partially defatted peanut flour measurement and substitution review — R309

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal only. This file is the only proposed change; no shared catalog, ledger, checklist, roadmap, generated file, recipe, integration README, or test file was changed.
- **Open checklist:** [WP02 Section 04 B2](../../RecipeBook-global-ingredient-catalog-plan.txt#L2363), the open alternative-flour family. Its checked identity child at [line 2528](../../RecipeBook-global-ingredient-catalog-plan.txt#L2528) added partially defatted peanut flour as identity-only.
- **Record under review:** `ingredient-ref-partially-defatted-peanut-flour`, displayed as `partially defatted peanut flour / farine d’arachide partiellement dégraissée`.
- **Source-ID prefix:** `WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S`. The prefix and requested proposal path were checked against the current archive; neither was already present.
- **Scope:** Measurement and substitution evidence for this exact reference only. This review does not reopen its identity or add aliases, forms, recipe links, measurements to the catalog row, or active rules.

## Recommendation

Record one **product-listing-specific** `portion_weight` observation from the Protein Plus bulk-flour label: **¼ cup = 30 g**. The retail page identifies Protein Plus defatted peanut flour and reproduces a label that lists roasted peanuts as the ingredient, 4 g fat per 30 g, and a ¼-cup/30-g serving [S01]. The listing says its product is repackaged from a 50-lb source bag and has `SKU: N/A`; it does not name the fat or roast grade or specify cup capacity, leveling, or packing method. Keep the observation tied to that listing and label; do not assign it to all partially defatted peanut flour or any named 12%/28% grade.

If integrated, set `measurementState` to `researched_supported` to retain that supported product-specific portion. Keep `defaultDensity: null` and `unitMappings: []`. Do not derive 120 g per cup, a g/ml density, or any reusable conversion from the serving. ADM currently describes distinct 12% and 28% fat grades and different roast grades; those product differences make one listing insufficient as a class-wide value [reused S07–S08].

Set `substitutionResearchState` to `researched_supported` and record two narrowly scoped findings from the primary study: (1) the study flour replacing 10% or 20% of wheat flour in the authors' specified experimental bread formula, and (2) study flour replacing the wheat-flour component in their cookie formula, where the authors say shortening was increased relative to a standard formula. The bread conclusion explicitly says the tested peanut flour could replace up to 20% of wheat flour without adversely affecting the listed dough and bread qualities; the cookie conclusion explicitly describes total replacement of wheat flour in that cookie formulation [S04].

This follows the integrated R302 green-lentil-flour pattern: `researched_supported` records evidence for the exact formulation, while its limitations rule out generalizing that evidence. It does **not** mean the catalog has a reusable substitution instruction. For these findings, include the wheat-flour source and peanut-flour replacement in each finding, but no `ruleId`; keep both global and contextual runtime rules empty. Nuts.com's advice to add extra liquid to its own 12%-defatted flour has no amount or method and remains a product note, not a separate substitution finding [S03]. Neither study formula is a bundled recipe, and neither licenses a general exchange ratio, hydration correction, or arbitrary-recipe recommendation for this multi-grade catalog identity.

For a later ledger integration, add the single label observation and two formula-scoped supported findings with no `ruleId`. Make no changes to the active reference, forms, unit mappings, conversion data, substitution rules, or recipes. Keep the B2 parent open.

## Current ownership and prior work

The live reference row has the exact bilingual display above, empty alias arrays, `defaultDensity: null`, `unitMappings: []`, and category `FLOUR_AND_STARCH`. It has no attached forms. The existing ledger entry is `identityState: verified`, with `measurementState` and `substitutionResearchState` both still `not_yet_researched`; it already owns the three identity sources from the 2026-10-10 residual-flour review. That review accepted only the explicitly partially defatted product class and kept whole ground peanuts, peanut meal, peanut butter, powdered peanut-butter mixes, protein isolates, and cross-product aliases separate. This evidence review preserves those boundaries.

ADM’s current English and Canadian French pages were re-opened. They identify partially defatted peanut flour and specify 12% and 28% fat grades, with roast options that vary by grade [reused `WP02-B23-FLOUR-RESIDUAL-20261010-S07` and `-S08`]. This review uses those pages only to bound the class; their grade information is not a measurement or substitution value.

The target reference is absent from the legacy-import identity list. Neither the global form-conversion rules nor contextual substitution rules contain a rule for it.

## Picker and bundled-recipe boundaries

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) uses complete normalized word-phrase matches before substring fallback. Projecting the live reference names, aliases, and forms through that logic gives:

| Query | Current result |
|---|---|
| `partially defatted peanut flour`; `peanut flour` | Partially defatted peanut flour only |
| `farine d’arachide partiellement dégraissée`; `farine d’arachide` | Partially defatted peanut flour only |
| `peanut` | Partially defatted peanut flour, peanut butter, peanut butter chips, peanut oil, and Vector peanut-butter-flavour cereal; the phrase-first result set does not include whole `peanuts` |
| `arachide` | Partially defatted peanut flour, peanut butter, and peanut oil |

Keep aliases empty. The exact family queries already find the row through its display; adding unqualified `peanut flour` or `farine d’arachide` aliases would weaken the accepted defatted boundary.

The manifest-listed package contains **114 recipe files and 1,123 ingredient rows**. A scan of ingredient names, original text, preparation/notes, and reference IDs found no exact peanut-flour phrase or link to this ID. Ten nearby peanut rows across eight recipes link only to `ingredient-ref-peanut-butter` or `ingredient-ref-peanuts`; Recipe 090 has peanut butter plus a separate peanut garnish, and Recipe 085 links chopped roasted peanuts. These lines do not provide flour demand, measures, or a substitution context. No recipe link or edit is proposed.

## Measurement and conversion evidence

- The Mill Creek listing for Protein Plus’s bulk defatted peanut flour reproduces a label serving of **¼ cup (30 g)**, with roasted peanuts as the ingredient and 4 g total fat [S01]. It is the only reviewed source that pairs a volume with a mass for a product in this class. The page does not state a grade, lot, cup convention, or filling method and has no SKU. Store this only as the observation for the named listing and its displayed label; do not treat it as a class-wide conversion.
- Nuts.com identifies its own pure peanut-flour product as **12% defatted** and reports a **30 g** serving without a household volume [S03]. This is a distinct product-specific mass portion. It cannot be combined with the Mill Creek portion to derive a shared cup measure.
- ADM’s current product family includes **12% and 28% fat** flours and several roast levels [reused S07–S08]. A serving or flour behavior for one grade must not be applied across the family.
- Labuckas et al. report water-holding capacity of **2.7 mL/g** for their laboratory flour [S04]. Their method disperses flour in water, stirs it, centrifuges it, and reports retained water per gram. This functional assay is not bulk density, a household volume conversion, or a recipe hydration adjustment.

Proposed observation for the existing ledger record:

- `observationId`: `protein-plus-bulk-defatted-peanut-flour-quarter-cup-30g-r309-20261016`
- `relationship`: `portion_weight`; `sourceQuantity`: 0.25 `cup`; `value`: 30 `g`
- `foodDescription`: Protein Plus bulk defatted peanut flour as described in the Mill Creek listing; retailer-hosted label, roasted-peanut ingredient; fat and roast grade not stated; listing has no SKU.
- `evidenceKind`: `manufacturer_label`; `sourceIds`: `WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S01`

The listing does not document cup capacity or a filling method. Do not infer a one-cup measure, `defaultDensity`, `unitMappings`, or a saved mass-volume conversion.

## Substitution evidence and limits

- Nuts.com says its product can be used in baking and recommends adding extra liquid because its high-protein flour absorbs extra liquid [S03]. The page gives no liquid amount, target recipe, flour type being replaced, or adjustment basis. Keep this as product advice, not an active recommendation for the catalog identity.
- Labuckas et al. made flour from dehulled Runner market-type peanuts by partial n-hexane extraction; the study flour retained 11.5% oil. Their bread trials explicitly replaced wheat flour with peanut flour at 10% and 20% of the flour blend. The 63.4% flour fraction was combined with 34.3% water, 0.65% shortening, 0.65% brewer's yeast, and 1% salt; the dough was mixed, fermented for 3 hours, shaped into 10 cm cylinders, and baked at 190 °C for 1 hour. The authors conclude that this partially defatted flour may replace up to 20% of wheat flour without adversely affecting dough handling, baking performance, loaf volume, crust and crumb color, or texture [S04]. Record this as a supported finding for that flour and formula only; the experiment does not justify a default for other breads or a reusable catalog rule.
- In the same study, the cookie formula used peanut flour in place of its wheat-flour component while retaining 42.0% cornstarch. The paper reports a formula with 10.5% flour, 42.0% cornstarch, 15.7% shortening, 2.2% water, 11.8% egg yolk, 15.7% sugar, and 2.1% baking powder. It says shortening was increased substantially relative to the standard ACC formula to improve spread, and concludes that peanut flour can totally replace wheat flour in a cookie formulation with that adjustment [S04]. Record only this flour-component replacement in this study formula: the text does not quantify the shortening increase relative to the standard formula, and the finding is not a general cookie recipe instruction.
- The maker’s Protein Plus recipe booklet labels its recipe context as **12% light-roast peanut flour** and gives recipe-specific uses [S02]. It provides examples, not a general wheat-flour exchange rule. The 28% grade and other roast levels remain distinct product cases [reused S07–S08].

The recipe corpus has no target flour line to supply a dish role or recipe method. A same-ingredient form conversion is also inapplicable: partial defatting defines this processed flour identity, and there is no attached cooking/preparation form. Do not add a global form rule, contextual flour-for-flour substitution, peanut-butter reconstitution rule, water adjustment, confidence/risk rating, or recipe-line substitution link.

Proposed ledger disposition:

| Field | Proposed value | Scope |
|---|---|---|
| `identityState` | `verified` | Retain unchanged. |
| `measurementState` | `researched_supported` | One product-listing label portion only; this does not authorize a reusable measure. |
| `measurementObservations` | One `portion_weight` observation | Protein Plus bulk listing: ¼ cup = 30 g; grade, cup convention, and filling method unspecified. |
| `substitutionResearchState` | `researched_supported` | Two source-scoped, formula-specific flour replacements are supported; this state is evidence bookkeeping, not an active or reusable rule. |
| `substitutionFindings` | Two `researched_supported` findings | One wheat-flour-to-peanut-flour bread finding for the tested 10% and 20% blends; one wheat-flour-to-peanut-flour cookie finding for the study formula with increased shortening. Each has a replacement but no `ruleId`; limitations retain its exact product and formula scope. |
| Active reference, forms, mappings, rules, recipes | No change | Keep density null, mappings and aliases empty, no form/link/rule. |

For the bread finding, use `fromIngredientRefId: ingredient-ref-wheat-flour` and a replacement of `ingredient-ref-partially-defatted-peanut-flour`; identify the 10% and 20% tested levels in `context` and `roleInCompound`. For the cookie finding, use the same direction and make clear that the peanut flour replaces only the wheat-flour component while cornstarch remains in the formula. Do not add quantities as reusable `Replacement.quantity` values: the percentages and formula amounts belong in the finding text, where their denominators and recipe scope are explicit. Do not add `ruleId` to either finding.

Suggested finding payloads, for ledger integration review:

```json
{
  "findingId": "partially-defatted-peanut-flour-wheat-bread-labuckas-r309-20261016",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-wheat-flour",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-partially-defatted-peanut-flour",
      "roleInCompound": "Replaces 10% or 20% of wheat flour in the named experimental bread formula; no general recipe ratio."
    }
  ],
  "context": "Labuckas et al. bread made with laboratory flour from dehulled Runner market-type peanuts, partially extracted with n-hexane (11.5% oil), desolventized at 30 °C and milled so 90% passed a 100-mesh screen. PFB1/PFB2 replaced wheat flour at 10%/20% of the 63.4% flour fraction. The formula also used 34.3% water, 0.65% shortening, 0.65% brewer's yeast, and 1.0% salt; the dough was mixed, fermented 3 h, shaped into 10 cm cylinders, and baked at 190 °C for 1 h.",
  "basis": "The authors conclude that this partially defatted flour may replace up to 20% of wheat flour without adversely affecting dough handling, baking performance, loaf volume, crust and crumb color, or texture. Both tested peanut-flour breads had increased protein and fiber compared with the all-wheat bread.",
  "expectedEffects": [
    "In this formula only, 10% and 20% wheat-flour replacement increased bread protein and fiber.",
    "The study reports no adverse effect through the tested 20% level on the listed dough and bread qualities."
  ],
  "limitations": [
    "The flour was laboratory-made from one Runner market-type peanut source and one extraction/milling process; it was not matched to a commercial grade or SKU in this catalog class.",
    "This finding is bounded to the tested bread formula, mixing, fermentation, shaping, and baking process. Do not generalize the tested percentages as a recommendation for other bread formulas or dishes.",
    "It does not establish a volume conversion, hydration correction, arbitrary-recipe substitution, or active global/contextual rule."
  ],
  "sourceIds": [
    "WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S04"
  ]
}
```

```json
{
  "findingId": "partially-defatted-peanut-flour-wheat-cookie-labuckas-r309-20261016",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-wheat-flour",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-partially-defatted-peanut-flour",
      "roleInCompound": "Replaces the wheat-flour component in the named cookie formula; cornstarch remains."
    }
  ],
  "context": "Labuckas et al. peanut-flour cookie formula: 10.5% flour, 42.0% cornstarch, 15.7% shortening, 2.2% water, 11.8% egg yolk, 15.7% sugar, and 2.1% baking powder; dough rolled to 5 mm, cut to 60 mm, and baked at 180 °C for 12 min. The authors state shortening was substantially increased relative to the standard ACC formula to improve spread, but do not report the numeric adjustment from that baseline.",
  "basis": "The authors conclude that peanut flour can totally replace wheat flour in a cookie formulation when shortening is increased. Their peanut-flour cookies showed good spread and similar sensory results to wheat-flour cookies except for a higher texture score.",
  "expectedEffects": [
    "The tested peanut-flour cookie replaces its wheat-flour component while retaining cornstarch.",
    "The authors report the shortening adjustment improved cookie spread in this formulation."
  ],
  "limitations": [
    "One laboratory-made flour and a single cookie formula; the paper does not give the numeric shortening increase relative to the standard ACC baseline.",
    "This finding concerns replacement of the wheat-flour component only; do not treat it as replacement of cornstarch or as an instruction for other cookie recipes.",
    "It does not establish a reusable shortening correction or active global/contextual rule."
  ],
  "sourceIds": [
    "WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S04"
  ]
}
```

The schema requires a non-empty `replacements` array for a `researched_supported` finding, but it does not require a `ruleId`; the integrated R302 record likewise uses supported, formula-bounded findings without active rule IDs. Here, setting the record's research state to `researched_no_supported_substitute` would obscure the two direct, explicit experimental replacements. The supported state is accurate only when paired with the narrow contexts and limitations above; it must not be read as runtime activation or support for arbitrary recipes.

## Source register

New sources were opened on **2026-10-16**. The new IDs are proposal-local; later integration should add them to this existing ledger record, not create a second ingredient identity.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S01` | Mill Creek General Store, [Gluten Free Peanut Flour](https://www.millcreekgeneralstore.com/product/gluten-free-peanut-flour/), product description and reproduced Nutrition Facts. | Identifies bulk Protein Plus defatted peanut flour, says it is repackaged from a 50-lb bag with `SKU: N/A`, lists roasted peanuts, and reports ¼ cup (30 g). Product-listing label only; grade, lot, cup convention, and filling method are unstated. |
| `WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S02` | Protein Plus, LLC, [Peanut Flour Recipes](https://www.proteinplusflour.com/images/peanutflourrecipes.pdf), revision 5, product statement and recipes. | Identifies recipes using 12% light-roast peanut flour and shows its use in named formulas. Does not establish the Mill Creek listing’s exact grade or a general substitution ratio. |
| `WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S03` | Nuts.com, [Peanut Flour](https://nuts.com/products/peanut-flour?variant=67354952171542), product details and Nutrition Facts. | Names its pure peanut-flour product as 12% defatted, gives a 30 g serving without volume, and recommends additional liquid in baking without an amount. Product-specific only. |
| `WP02-B2-PARTIALLY-DEFATTED-PEANUT-FLOUR-R309-20261016-S04` | Labuckas, Lamarque & Maestri, [“Partially defatted peanut flour: a functional ingredient to improve nutritional value of bakery products”](https://www.scielo.cl/scielo.php?lng=en&nrm=iso&pid=S0717-75182016000400007&script=sci_arttext), *Revista Chilena de Nutrición* 43(4) (2016), DOI [10.4067/S0717-75182016000400007](https://doi.org/10.4067/S0717-75182016000400007), abstract, methods, results, and conclusions. | Primary study of one solvent-extracted flour (11.5% oil), its lab water-holding assay, breads replacing wheat flour at 10%/20% of the flour blend, and a cookie formula replacing the wheat-flour component with increased shortening. Supports those study-specific formulas only; not a general substitution, measure, or adjustment. |
| Reused `WP02-B23-FLOUR-RESIDUAL-20261010-S07` and `-S08` | ADM, [Peanut Flour](https://www.adm.com/en-us/products-services/human-nutrition/products/peanuts/nuts/) and [Farine d’arachide (partiellement dégraissée)](https://www.adm.com/fr-ca/produits-et-services/nutrition-humaine/produits/noix/), current product-family sections, rechecked 2026-10-16. | Existing target-record sources; confirm current partially defatted product wording and 12%/28% fat grades with roast variation. Used only for product-class boundaries, not measurements or substitution. |

## Verification record

Re-read `AGENTS.md`, the relevant ingredient-reference and substitution requirements, the open B2 checklist, roadmap progress, the residual-flour identity proposal and integration note, current reference/forms/rules/ledger state, picker code, and manifest-listed recipe bundle. Compared the schema's supported-finding contract and the integrated R302 green-lentil-flour evidence pattern. Checked source-ID and proposal-path ownership, projected picker results from the current phrase-first search code, and scanned all 114 manifest-listed recipes / 1,123 ingredient rows. Opened the current product pages, manufacturer recipe PDF, ADM English/Canadian French pages, and the full SciELO primary study, including its bread conclusions and cookie formulation. No software tests, builds, emulator checks, or deployment were run, as instructed for this proposal-only task.
