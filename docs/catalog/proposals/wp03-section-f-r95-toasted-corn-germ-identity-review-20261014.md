# WP03 Section F R95 — Toasted Corn Germ Identity Review

Review and integration date: 2026-10-14
Status: accepted and integrated as one identity-only reference and one research-ledger record.

## Candidate and recommendation

Candidate: **toasted corn germ**, the toasted food ingredient made from the germ fraction of *Zea mays*. A current Canadian Tostitos product ingredient list names `Toasted Corn Germ`; a current French-language Quebec retailer listing gives `Germe de maïs grillé`. Supplier evidence also describes toasted corn germ as a distinct ingredient used in snacks, bakery products, toppings, and coatings.

Section F leaves its sweep for regionally significant cereal mixes and preprocessed grains open. The checklist does not name corn germ, and no prior dedicated review was found; this proposal treats toasted corn germ as a new candidate within that open preprocessed-grain sweep, not as a named checklist item.

Decision: add one identity-only `GRAIN_AND_CEREAL` reference, `toasted corn germ / germe de maïs grillé`, with empty alias arrays. This is a market-attested Canadian French display, not an OQLF-preferred term. Keep unheated corn germ and corn germ meal/cake outside this identity. The existing corn-oil row remains the owner of the French oil alias `huile de germes de maïs`. Do not create forms, numeric data, recipe links, or substitutions.

The recommendation is for the toasted ingredient class only. The current evidence does not support using it as a universal identity for raw corn germ or oil-milling/feed co-products.

## Exact product boundary

Include only toasted or heat-stabilized corn-kernel germ marketed for direct use as a human-food ingredient. The sources use both intact and granulated material; particle size is not enough to establish a separate ingredient identity or a reusable catalog form.

Keep these neighboring products outside this candidate:

- unheated corn germ, including germ sold as input for corn-oil production;
- corn germ oil and corn oil; the existing corn-oil row owns the French alias `huile de germes de maïs`;
- corn germ meal/cake left after oil extraction, including feed-grade wet- or dry-milling products;
- corn bran (`corn bran / son de maïs`), cornmeal, corn grits, hominy grits, hominy, whole corn, and corn flour;
- tortilla chips, cereal blends, spreads, and other composite foods that list toasted corn germ as one ingredient.

This review does not rely on a feed-standard or trademark definition as proof of a consumer product. The current retail and supplier evidence is sufficient for the narrow toasted food-ingredient identity; it is not sufficient to merge every material called `corn germ` into one row.

## Catalog and Quebec naming

The live catalog already has `corn bran / son de maïs` and `wheat germ / germe de blé`, along with corn kernels, corn oil, cornmeal, corn grits, corn flakes, hominy grits, and other corn products. Corn oil has the French alias `huile de germes de maïs`; keep that oil term on the corn-oil row. No active reference/form, legacy candidate, or ledger record owns the exact proposed bilingual pair `toasted corn germ / germe de maïs grillé`.

Quebec retail ingredient wording directly attests `germe de maïs grillé` in a Tostitos multigrain tortilla-chip ingredient list. The English product page and Canadian supplier/industry sources attest `toasted corn germ`. No exact OQLF term entry was found for this processed germ product, so do not describe the French display as OQLF-approved. The phrase is supported as current Canadian consumer-label wording. Do not add `corn germ`, `maize germ`, `corn embryo`, `germes de maïs`, `germe de maïs`, `VitaGerm`, or `corn germ meal` as aliases: some drop the toasted qualification, denote a different fraction or oil/feed use, or name one past brand.

The proposed display itself is sufficient for phrase search: `corn germ` occurs inside the English display, and `germe de maïs` occurs inside the French display. Empty alias arrays avoid assigning broader names than the evidence supports.

## Picker and search implications

The current picker prefers full word-phrase matches and then falls back to substring matching. With one proposed row and no aliases:

| Query | Projected result | Boundary |
| --- | --- | --- |
| `toasted corn germ` | Toasted corn germ | Exact English product phrase. |
| `corn germ` | Toasted corn germ | The displayed qualifier remains visible; this is the only proposed human-food corn-germ row. Do not create a generic raw-germ row from this evidence. |
| `germe de maïs grillé` | Germe de maïs grillé | Exact Canadian French retail wording. |
| `germe de maïs` | Germe de maïs grillé | The displayed qualifier makes the product scope explicit. |
| `germes de maïs` | Corn oil | Existing plural French oil alias remains owned by `ingredient-ref-corn-oil`; it is not an alias for toasted germ. |
| `germ` | Wheat germ and toasted corn germ | These are different grain fractions; keep their displays qualified. |
| `germe` | Wheat germ, toasted corn germ, and four existing sprouted-grain/flour rows | Accent folding makes `germe` also match `germé`; this short query is already broad. |
| `corn` / `maïs` | Many corn rows, including this one | Expected broad-corn discovery behavior; do not add corn-only aliases. |

Exact normalized-key inspection found no collision for the proposed English or French display. The existing plural corn-oil alias does not normalize to the proposed singular French phrase.

## Repository demand and market evidence

Before this identity was added, the 2026-10-14 package contained 1,427 ingredient references, 105 forms, 63 legacy candidates, and 1,767 research-ledger records. The manifest lists 114 recipes. A scan of all recipe files and structured ingredient rows found no mention of `toasted corn germ`, `corn germ`, `germe de maïs grillé`, or `germe de maïs`; no recipe link or recipe demand exists in the bundle.

Market evidence is real but limited. A current Canadian manufacturer/brand page and Walmart Canada listing show toasted corn germ as an ingredient in Tostitos Multigrain Rounds; the French Quebec retail listing gives `germe de maïs grillé`. These listings establish an ingredient name in a current composite product, not direct household demand for a bag of germ. A 2014 Grain Farmers of Ontario article describes VitaGerm as a standalone toasted product used as a snack, salad/yogurt topping, and ingredient in breads and spreads, but the report is historical and describes market penetration as slow. Current supplier evidence is B2B and not Quebec-specific. No quantified query-volume evidence isolates toasted corn germ or corn germ.

## Measures, forms, and substitutions

- **Forms:** add none. The supplied products vary between intact and granulated germ, but no recipe line needs a persistent whole/granulated distinction. Toasting defines this candidate identity; it should not be represented as an unqualified `corn germ` form without a separately established base identity.
- **Measures and density:** leave unset. The Canadian `50 g` serving on Tostitos pages is the weight of the finished chip product, not the amount of toasted corn germ. Supplier bag and big-bag sizes are business packaging, not household measures. No source supports a cup-to-mass value or density.
- **Conversion or yield:** add none. Sources give no germ-to-corn-kernel yield, toast loss, cooked yield, or mass-volume conversion suitable for recipe use.
- **Substitution:** add none. Historical VitaGerm material describes toasted germ as nutty and suitable for toppings or foods intended to avoid nuts, but supplies no quantified ratio or tested replacement behavior. Similar topping use is not a global ingredient substitution. No contextual rule is supported.
- **Recipe links:** none; the bundled corpus has no matching demand.

## Risks and uncertainties

1. The strongest Quebec French evidence is a component ingredient list in a composite snack, not a standalone corn-germ package. Treat `germe de maïs grillé` as market-attested wording, not a terminology ruling.
2. The Canadian standalone VitaGerm account is from 2014 and is not proof that the product remains available. The recent Canadian listing is for a composite tortilla chip.
3. Raw germ, heat-stabilized germ, toasted whole germ, granulated germ, and defatted germ meal are related but not interchangeable. Product-specific heat treatment, particle size, and oil extraction differ across suppliers.
4. Search for bare `corn germ` / `germe de maïs` would return the qualified toasted item as the only reviewed human-food choice. The result label preserves the toasted qualifier. Add no generic raw-germ alias or identity until a separate human-food product scope is supported.
5. Current product/retail pages may change. No standalone commercial specification or ingredient assay was accessible for the exact Canadian Tostitos source.

## Sources

| Source | Evidence used | Limits |
| --- | --- | --- |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S01** — Tostitos / Tasty Rewards Canada, [Multigrain Rounds Tortilla Chips](https://www.tastyrewards.com/en-ca/brands/tostitos/products/tostitosr-multigrain-rounds-tortilla-chips) | Current Canadian product page lists `Toasted Corn Germ` among ingredients. It reports 50 g per 36 chips for the finished snack. | Component label only; finished-chip serving cannot be assigned to corn germ. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S02** — Walmart Canada, [Tostitos Multigrain Rounds Tortilla Chips](https://www.walmart.ca/en/ip/Tostitos-Multigrain-Rounds-Tortilla-Chips/6000197240203) | Current Canadian listing shows the item for sale and the same ingredient statement. The page snapshot reported 1,000+ purchases in the past month. | Sales and serving data belong to the chips, not to toasted germ as a separate SKU. Ingredient data is supplier-provided per Walmart's disclaimer. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S03** — Walmart Canada (French), [Chips tortilla Tostitos Multigrain Rondes](https://www.walmart.ca/fr/ip/Chips-tortilla-Tostitos-Multigrain-Rondes/6000197240203?classType=REGULAR) | Current French product detail uses `Germe de maïs grillé` in the ingredient list. | Retail label wording, not an OQLF terminology record or a standalone germ product. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S04** — Metro Québec, [Croustilles de tortillas multigrains, Scoops](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/croustilles-de-mais-et-tortillas/croustilles-de-tortillas-multigrain/p/060410901151) | Current indexed ingredient list uses `Germe de maïs grillé`; the listing is in Metro's Québec grocery catalog. | The phrase supports local label wording, not a standalone germ package or product specification. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S05** — CerealVeneta, [Toasted granulated corn germ](https://cerealveneta.it/en/semi-finished/toasted-granulated-corn-germ/) | Current supplier page describes low-temperature heat treatment to stabilize lipids, followed by rolling and sifting; names applications in snacks, bakery, toppings, coatings, and meat replacements. | B2B semi-finished product in Italy; not Canadian terminology or a product-specific household measure. Product sheet is gated. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S06** — Grain Farmers of Ontario, [Beyond ethanol: A profile of GreenField Naturals](https://ontariograinfarmer.ca/2014/10/01/beyond-ethanol/) | Reports VitaGerm as a whole-germ, slow-toasted product, used as a snack or salad/yogurt topping and in breads and spreads. It also describes then-slow market adoption and low use per finished product. | Dated 2014 account; does not establish current VitaGerm availability or present-day consumer demand. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S07** — Molino Peila, [Corn germ](https://www.molinopeila.it/en/products/mais/corn-germ) | Current supplier page distinguishes raw corn germ obtained by wet degermination from a heat-treated item; describes use for corn oil and other food applications. | Italian B2B page; not evidence that raw germ is a Quebec consumer ingredient or identical to toasted germ. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S08** — Codex Alimentarius, [Standard for Degermed Maize (Corn) Meal and Maize (Corn) Grits](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B155-1985%252FCXS_155e.pdf) | Defines degermed corn meal and grits as products from which bran and germ are removed, supporting the distinction from corn germ. | Does not standardize toasted germ or name it as a separate human-food product. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S09** — CFIA, [Canadian Feed Ingredients Table](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table?wbdisable=false) | Entry 1-302-044 describes dry-milled mechanically extracted corn germ meal as germ plus some/all remaining corn kernel after oil removal. Supports excluding feed meal/cake from the toasted food ingredient. | Animal-feed standard only; not a human-food definition or synonym source. |
| **WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S10** — Agriculture and Agri-Food Canada, [Global food and drink product trends containing malt-based and germ of cereal ingredients](https://agriculture.canada.ca/en/international-trade/reports-and-guides/customized-report-service-global-food-and-drink-product-trends-containing-malt-based-and-germ-cereal) | Current trade report separates wheat germ from other cereal germs in grouped 2023 trade data. | Aggregates multiple cereal species and product states; it cannot establish corn-germ demand or corn-specific import volume. |

## Integration shape

The following identity-only row was integrated:

```json
{
  "id": "ingredient-ref-toasted-corn-germ",
  "nameEn": "toasted corn germ",
  "nameFr": "germe de ma\u00efs grill\u00e9",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add forms, serving observations, density, unit mappings, conversions, yields, recipe links, or substitution data. Keep the existing corn-oil French alias and all neighboring corn identities unchanged. Section F and its broader preprocessed-grain checklist remain open.

The accepted `ingredient_reference` ledger record stores all ten source records, no measurement
observations, no substitution findings, and one decision. It marks measurements as researched with
no supported reusable value and substitution research as researched with no supported substitute.
The finished-chip serving remains outside the corn-germ record.

## Accepted research-ledger record

```json
{
  "recordId": "ingredient-ref-toasted-corn-germ",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S01",
      "url": "https://www.tastyrewards.com/en-ca/brands/tostitos/products/tostitosr-multigrain-rounds-tortilla-chips",
      "title": "Tostitos / Tasty Rewards Canada \u2014 Multigrain Rounds Tortilla Chips",
      "accessedOn": "2026-10-14",
      "locator": "Ingredient statement; 50 g per 36 chips serving.",
      "supports": "Names toasted corn germ as an ingredient in a current Canadian composite snack. The finished-chip serving does not measure the germ.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S02",
      "url": "https://www.walmart.ca/en/ip/Tostitos-Multigrain-Rounds-Tortilla-Chips/6000197240203",
      "title": "Walmart Canada \u2014 Tostitos Multigrain Rounds Tortilla Chips",
      "accessedOn": "2026-10-14",
      "locator": "Current product listing and ingredient statement.",
      "supports": "Lists toasted corn germ in the current Canadian composite snack; product sales and package serving belong to the chips, not to germ as a separate SKU.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S03",
      "url": "https://www.walmart.ca/fr/ip/Chips-tortilla-Tostitos-Multigrain-Rondes/6000197240203?classType=REGULAR",
      "title": "Walmart Canada \u2014 Chips tortilla Tostitos Multigrain Rondes",
      "accessedOn": "2026-10-14",
      "locator": "French product detail and ingredient list.",
      "supports": "Uses the Canadian French wording Germe de ma\u00efs grill\u00e9 in a composite product ingredient declaration; it is not a standalone product specification or OQLF term entry.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S04",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/croustilles-de-mais-et-tortillas/croustilles-de-tortillas-multigrain/p/060410901151",
      "title": "Metro Qu\u00e9bec \u2014 Croustilles de tortillas multigrains, Scoops",
      "accessedOn": "2026-10-14",
      "locator": "Current Qu\u00e9bec grocery listing and ingredient list.",
      "supports": "Uses Germe de ma\u00efs grill\u00e9 in the product ingredient declaration; supports local label wording, not a standalone germ package or specification.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S05",
      "url": "https://cerealveneta.it/en/semi-finished/toasted-granulated-corn-germ/",
      "title": "CerealVeneta \u2014 Toasted granulated corn germ",
      "accessedOn": "2026-10-14",
      "locator": "Product description and listed applications.",
      "supports": "Describes a toasted/granulated corn-germ food ingredient, heat stabilization, and industrial food uses; this B2B Italian source provides no household measure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S06",
      "url": "https://ontariograinfarmer.ca/2014/10/01/beyond-ethanol/",
      "title": "Grain Farmers of Ontario \u2014 Beyond ethanol: A profile of GreenField Naturals",
      "accessedOn": "2026-10-14",
      "locator": "2014 VitaGerm product account.",
      "supports": "Describes a slow-toasted whole-germ product and food uses, while reporting slow market adoption at that time; it does not establish current availability.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S07",
      "url": "https://www.molinopeila.it/en/products/mais/corn-germ",
      "title": "Molino Peila \u2014 Corn germ",
      "accessedOn": "2026-10-14",
      "locator": "Raw and heat-treated corn-germ product descriptions.",
      "supports": "Distinguishes raw wet-degermed corn germ and heat-treated germ; does not establish Canadian terminology or household use.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S08",
      "url": "https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B155-1985%252FCXS_155e.pdf",
      "title": "Codex Alimentarius \u2014 Standard for Degermed Maize (Corn) Meal and Maize (Corn) Grits",
      "accessedOn": "2026-10-14",
      "locator": "Definitions of degermed corn meal and grits.",
      "supports": "Defines meal and grits from which bran and germ are removed, supporting their distinction from the germ fraction; it does not standardize toasted corn germ.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S09",
      "url": "https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table?wbdisable=false",
      "title": "CFIA \u2014 Canadian Feed Ingredients Table",
      "accessedOn": "2026-10-14",
      "locator": "Entry 1-302-044, mechanically extracted corn germ meal.",
      "supports": "Describes feed-grade germ meal after oil removal, supporting exclusion of that co-product from the toasted human-food ingredient.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S10",
      "url": "https://agriculture.canada.ca/en/international-trade/reports-and-guides/customized-report-service-global-food-and-drink-product-trends-containing-malt-based-and-germ-cereal",
      "title": "Agriculture and Agri-Food Canada \u2014 Global food and drink product trends containing malt-based and germ of cereal ingredients",
      "accessedOn": "2026-10-14",
      "locator": "Cereal-germ trade discussion based on grouped 2023 data.",
      "supports": "Separates wheat germ from other cereal germ in aggregated trade data; it cannot establish corn-specific demand or import volume.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only toasted corn germ / germe de ma\u00efs grill\u00e9 for the human-food ingredient class supported by a current Canadian English product declaration and Qu\u00e9bec French retail label wording. The French display is market-attested, not OQLF-preferred. Keep raw corn germ, oil-milling germ meal/cake, corn germ oil, and composite foods distinct. The finished Tostitos serving is not a measure for its germ ingredient. Keep aliases and forms empty, default density null, unit mappings empty, and add no measurements, recipe links, conversions, yields, or substitutions. No bundled recipe demand was found.",
      "sourceIds": [
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S01",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S02",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S03",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S04",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S05",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S06",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S07",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S08",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S09",
        "WP03-SECTIONF-TOASTED-CORN-GERM-20261014-R95-S10"
      ]
    }
  ]
}
```

## Static checks performed

- Re-read the current `AGENTS.md`, requirements context, live Section F plan, plant-grains packet, active corn references, and Section F proposal/batch archive.
- Scanned active references, forms, all 63 legacy candidates, ledger IDs, prior proposals/batches, the plan, and all 114 bundled recipe files for the candidate name set; found no exact candidate owner or recipe occurrence. This pre-integration snapshot held 1,427 references, 105 forms, and 1,767 ledger records; the post-integration package holds 1,428 references, 105 forms, and 1,768 ledger records.
- Counted 1,123 bundled ingredient rows across the 114 manifest-listed recipes.
- Reproduced the phrase-first picker projection for the queries above using the current search rules; checked the existing `huile de germes de maïs` corn-oil phrase boundary.
- After integration, the seed-package, reference-normalization, ledger-schema, and generated-index checks passed. The ten candidate source IDs are unique and do not occur elsewhere in the ledger; this row has no measurement or substitution observations. Picker projection and document UTF-8/no-BOM/whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated catalog index under `AGENTS.md`.
