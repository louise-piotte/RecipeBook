# WP03 Section F R732 — Kellogg’s Apple Jacks cereal review

## Review record

- **Reviewed:** 2026-10-18.
- **Open-plan fit:** Section F continues identity and terminology coverage for grains and cereals ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)); the regional cereal and preprocessed-grain checklist also remains open ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4774)).
- **Candidate:** one Canadian Kellogg’s Apple Jacks ready-to-eat cereal product.
- **Recommendation:** Add one `GRAIN_AND_CEREAL` identity with bilingual names taken from the manufacturer’s Canadian SmartLabel pages. Record its manufacturer-listed **1 cup (39 g)** serving as a product-specific observation for UPC `00064100133396`. Add no aliases, forms, active cup conversion, default density, recipe link, cooking yield, or substitution.
- **Status:** Proposal only. This file is the only intended change; shared catalog data, ledger, plan, roadmap, workflow, and generated files were not edited.
- **Snapshot:** 1,847 active references, 174 forms, 56 legacy candidates, 2,230 ledger records, and 114 manifest-listed recipes / 1,123 structured ingredient rows.

This is a single product identity review. It does not reopen the R723 Froot Loops products, R726 Holy Crap family hold, or R729 PC Organics Ancient Grains product. Those neighboring decisions remain as recorded in the [R723](wp03-section-f-next-open-gap-review-r723-20261018.md), [R726](wp03-section-f-next-gap-review-r726-20261018.md), and [R729](wp03-section-f-next-gap-review-r729-20261018.md) proposals and the current [roadmap checkpoint](../../../roadmap.md#L1487) / [workflow checkpoint](../ingredient-catalog-workflow.md#L3011).

## Product identity and bilingual boundary

The manufacturer’s Canadian SmartLabel pages use the English title **Kellogg’s Apple Jacks Cereal** and French title **Céréales Kellogg’s Apple Jacks**. Both pages identify UPC `00064100133396`, the same 345 g label package, and the same listed portion, **1 cup (39 g)** [S01–S02]. The SmartLabel record says it was last updated 2025-01-24 and cautions that product information can change; these records support the named Canadian cereal and a label-specific observation, not a guarantee about every current package.

The same label identifies a formulated, ready-to-eat multigrain cereal, with corn, wheat, and oat ingredients, dried apple, cinnamon, sugars, and other ingredients. Treat the complete product as one cereal identity, not as a synonym for any of its components. Keep it separate from Apple Cinnamon Chex, Froot Loops, Trix, corn flakes, and loose corn, wheat, oat, apple, and cinnamon ingredients. Do not add `Apple Cinnamon` as an alias; the live picker already returns Apple Cinnamon Chex for that phrase.

Use these bilingual picker names, omitting the source’s asterisks used for trademark/footnote markers:

| Field | Proposed value | Basis |
|---|---|---|
| `nameEn` | `Kellogg's Apple Jacks cereal` | Normalized from the Canadian manufacturer title `Kellogg’s* Apple Jacks* Cereal`. |
| `nameFr` | `Céréales Kellogg's Apple Jacks` | Manufacturer’s Canadian French SmartLabel title. |
| `aliasesEn`, `aliasesFr` | Empty arrays | Both displays already contain the brand and product wording. No additional wording is needed for the exact product search. |
| `category` | `GRAIN_AND_CEREAL` | Finished breakfast cereal product. |

The English and French titles use different word order but resolve to the same UPC on the manufacturer-hosted Canadian labels. The French product title is direct Canadian label wording, not an OQLF ruling. Do not translate the title into a generic apple-and-cinnamon cereal name or broaden it to cereal-family aliases.

## Source evidence and limits

| Source ID | Source and locator | What it supports and what remains unverified |
|---|---|---|
| `WP03-APPLE-JACKS-R732-20261018-S01` | WK Kellogg Canada, [Kellogg’s Apple Jacks Cereal — Canadian English SmartLabel](https://smartlabel.kelloggs.com/en_CA/Product/Index/00064100133396), product title, UPC, 345 g package, serving declaration, ingredient list, and update notice. | Manufacturer-hosted English Canadian label record identifies the title and UPC `00064100133396`, reports 1 cup (39 g), and lists the product’s ingredients. Indexed page text was available when checked 2026-10-18; direct page opening timed out. It says last updated 2025-01-24 and warns product information may change. No physical package was inspected, and it gives no cup convention or fill method. |
| `WP03-APPLE-JACKS-R732-20261018-S02` | WK Kellogg Canada, [Céréales Kellogg’s Apple Jacks — Canadian French SmartLabel](https://smartlabel.kelloggs.com/fr_CA/Product/Index/00064100133396), product title, UPC, 345 g package, serving declaration, ingredient list, and update notice. | Directly readable manufacturer-hosted French Canadian label record pairs the French title with the same UPC and reports 1 tasse (39 g). It corroborates the bilingual wording and serving for this label record, not independent physical package inspection or an OQLF-preferred product title. It carries the same 2025-01-24 update date and change warning. |
| `WP03-APPLE-JACKS-R732-20261018-S03` | Walmart Canada, [Céréales Kellogg’s Apple Jacks 320 g](https://www.walmart.ca/fr/ip/C-r-ales-Kellogg-s-Apple-Jacks-320g/260GKXQ1MP9R), product title, product details, and availability banner. | Canadian retailer listing currently uses the French product wording and shows a 320 g page, but no UPC was visible. The listing says the details may be supplied by manufacturers, suppliers, or marketplace sellers and are not individually verified; it showed out of stock for the selected Heartland / Mississauga location. It does not crosswalk to the manufacturer’s 345 g, UPC `00064100133396` record and is not used for measurement. |

The 320 g retailer page is not a barcode or package match for the manufacturer’s 345 g label record. Keep the 320 g retailer figure out of the ledger observation and do not claim that its package, formula, or UPC is the manufacturer SmartLabel SKU. It corroborates Canadian retail use of the product name only. The manufacturer’s UPC-bound serving remains an observation for the cited label record, with no transfer to a differently sized listing.

## Portion and substitution boundary

The Canadian manufacturer SmartLabel states **1 cup (39 g)** for UPC `00064100133396` in both language views [S01–S02]. This is sufficient for one `portion_weight` observation tied to the named UPC. It is not a reusable cup-to-mass mapping: neither page states the cup convention, fill method, or measuring protocol, and no physical package was inspected. Keep `defaultDensity` null and `unitMappings` empty. Do not generalize the portion to other Apple Jacks listings, cereals, cereal shapes, or dry grains.

No source reviewed here supports replacing Apple Jacks with another cereal or grain ingredient. Add no substitution finding or runtime rule; leave substitution research `not_yet_researched`. No dry/cooked form, conversion, cooking yield, package yield, recipe link, or recipe amount is proposed.

## Current ownership and archive audit

The ownership audit covered active ingredient references, ingredient forms and their match terms, legacy-import candidates, research-ledger identities and source URLs, and the proposal/batch archive. No exact owner or prior focused review was found for `Apple Jacks`, either bilingual title, UPC `00064100133396`, Walmart product key `260GKXQ1MP9R`, or the proposed ID. Neighboring fruit-flavored cereal identities remain separate. No relevant form or legacy candidate owns these terms.

The three URLs and source IDs in this proposal have no exact owner in the live ledger. No shared source IDs or catalog IDs are allocated by this review; all IDs shown below are proposal-local placeholders. A future integration must repeat the ownership check against its then-current seed and ledger before ID allocation.

## Picker projection

The projection uses the live [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior: lowercase and NFKD normalization, accent/ligature and punctuation folding, full word-phrase matching first, then substring fallback only if there is no phrase match. The hypothetical row uses the bilingual names above and empty alias arrays.

| Query | Current results | With R732 | Effect |
|---|---:|---:|---|
| `Apple Jacks`; `Kellogg's Apple Jacks`; `Kellogg's Apple Jacks cereal` | 0; 0; 0 | 1; 1; 1 | Exact product wording returns the proposed identity. |
| `Céréales Kellogg's Apple Jacks` | 0 | 1 | Exact French display phrase returns the same product identity. |
| `apple` | 4 | 5 | Adds one clearly named cereal to a broad partial query. |
| `apple cinnamon` | 1 | 1 | Apple Cinnamon Chex remains the only result; no broad alias is added. |
| `Kellogg's` | 5 | 6 | Adds a product title that explicitly includes its maker’s brand. |
| `cereal`; `céréales` | 76; 72 | 77; 73 | Adds one product to each broad cereal query. |

This is a static projection of the live reference/form names and aliases, not an Android runtime picker test. The recommendation deliberately does not add `Apple`, `Apple Cinnamon`, `fruit cereal`, `cereal rings`, or the generic `Kellogg’s` brand as aliases.

## Manifest-listed recipe corpus

All **114** recipe files listed in the current manifest were parsed, covering **1,123** structured ingredient rows. The full recipe documents and ingredient rows were checked for `Apple Jacks`, both proposed titles, the manufacturer UPC, Walmart key `260GKXQ1MP9R`, and the proposal-local reference ID. Result: **0 candidate-specific recipe files, 0 candidate-specific ingredient rows, and 0 direct reference links**. Generic component mentions such as apples, corn, wheat, oats, or cinnamon are not treated as demand for this formulated cereal. No recipe or substitution edits are proposed.

The manifest-ordered corpus fingerprint (relative path, NUL, exact bytes, NUL) is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`; the 114 files contain 754,048 bytes.

## Schema-shaped examples if accepted

The identifiers below are proposal-local examples only. They are not reserved or allocated. The reference example follows [`IngredientReference` in the full-library schema](../../schemas/full-library.schema.v1.json#L510); the ledger record follows the [`research-ledger.schema.json`](../research-ledger.schema.json). French database text is shown with JSON Unicode escapes to match the bundled seed convention.

### Ingredient reference

```json
{
  "id": "proposal-local-ingredient-ref-r732-kelloggs-apple-jacks-cereal",
  "nameFr": "C\u00e9r\u00e9ales Kellogg's Apple Jacks",
  "nameEn": "Kellogg's Apple Jacks cereal",
  "category": "GRAIN_AND_CEREAL",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

### Research-ledger record

```json
{
  "recordId": "proposal-local-ingredient-ref-r732-kelloggs-apple-jacks-cereal",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-APPLE-JACKS-R732-20261018-S01",
      "url": "https://smartlabel.kelloggs.com/en_CA/Product/Index/00064100133396",
      "title": "WK Kellogg Canada, Kellogg's Apple Jacks Cereal — Canadian English SmartLabel",
      "versionOrDate": "Last updated 2025-01-24",
      "accessedOn": "2026-10-18",
      "locator": "Product title, UPC 00064100133396, 345 g page, 1 cup (39 g) portion, ingredient list, and change notice.",
      "supports": "Manufacturer-hosted English Canadian SmartLabel record for the named cereal. It reports one cup (39 g) for UPC 00064100133396; no cup convention or fill method is specified, the package was not inspected, and product information may change.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-APPLE-JACKS-R732-20261018-S02",
      "url": "https://smartlabel.kelloggs.com/fr_CA/Product/Index/00064100133396",
      "title": "WK Kellogg Canada, C\u00e9r\u00e9ales Kellogg's Apple Jacks — Canadian French SmartLabel",
      "versionOrDate": "Last updated 2025-01-24",
      "accessedOn": "2026-10-18",
      "locator": "French product title, UPC 00064100133396, 345 g page, 1 tasse (39 g) portion, ingredient list, and change notice.",
      "supports": "Manufacturer-hosted French Canadian SmartLabel record pairs the French product title and the same UPC with the English label record. It corroborates the same product-specific one-cup mass but is not independent package inspection or a Québec terminology ruling.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-APPLE-JACKS-R732-20261018-S03",
      "url": "https://www.walmart.ca/fr/ip/C-r-ales-Kellogg-s-Apple-Jacks-320g/260GKXQ1MP9R",
      "title": "Walmart Canada, C\u00e9r\u00e9ales Kellogg's Apple Jacks 320 g",
      "accessedOn": "2026-10-18",
      "locator": "French product title, 320 g listing details, availability banner, and retailer product-information disclaimer.",
      "supports": "Canadian retailer listing for Apple Jacks with a 320 g package title. No UPC crosswalk to the 345 g manufacturer SmartLabel record is displayed; the page says supplier information may not be separately verified and showed out of stock for the selected Mississauga store. It is not used for the portion observation.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "proposal-local-r732-apple-jacks-upc-00064100133396-one-cup-39g",
      "relationship": "portion_weight",
      "value": 39,
      "valueUnit": "g",
      "foodDescription": "Kellogg's Apple Jacks cereal, Canadian manufacturer SmartLabel UPC 00064100133396",
      "foodState": "Dry ready-to-eat cereal as listed.",
      "measurementMethod": "Manufacturer-hosted Canadian SmartLabel serving declaration; package and cup fill method were not inspected.",
      "quantityBasis": "One listed 1 cup (39 g) serving for this UPC only. The cup convention and fill method are unstated; this is not a reusable cup mapping, generic cereal measure, or density.",
      "sourceQuantity": {
        "amount": 1,
        "unit": "cup"
      },
      "observedMassG": 39,
      "evidenceKind": "manufacturer_label",
      "sourceIds": ["WP03-APPLE-JACKS-R732-20261018-S01"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one bilingual identity for the named Canadian ready-to-eat cereal. Record only the manufacturer-listed 1 cup (39 g) portion for UPC 00064100133396 as a product-specific observation. Do not match the separate 320 g retailer listing to this UPC, or add aliases, forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions.",
      "sourceIds": [
        "WP03-APPLE-JACKS-R732-20261018-S01",
        "WP03-APPLE-JACKS-R732-20261018-S02",
        "WP03-APPLE-JACKS-R732-20261018-S03"
      ]
    }
  ]
}
```

The 39 g observation remains sidecar research evidence. The only active quantity remains the product label’s unit-specific portion statement; no density, unit mapping, or conversion is derived. The product’s ingredients and serving suggestion do not justify substitutions to oats, corn, other cereal, or another grain.

## Static checks and test scope

- [x] Read current `AGENTS.md`, relevant `Requirements.md` ingredient-reference provisions, the exact open Section F checklist items, recent roadmap/workflow checkpoint, active references/forms/ledger/legacy candidates, and relevant adjacent cereal proposals before candidate selection.
- [x] Checked the official English/French Canadian manufacturer label records and the separate Canadian retailer listing; recorded the label update date, UPC, package-size discrepancy, direct-open timeout, retailer stock/location limit, and source limits.
- [x] Checked current active ownership, exact normalized name/alias/form terms, ledger IDs/URLs, and the prior proposal/batch archive. No source ownership or catalog ID was allocated.
- [x] Projected exact and broad queries using the phrase-first and substring matching behavior in `IngredientSearch.kt`.
- [x] Parsed all 114 manifest-listed recipes and 1,123 ingredient rows; found no product-specific demand or links.
- [x] Included reference and ledger JSON examples shaped to the current schemas and using proposal-local identifiers only.
- [x] The final Markdown file and local links, example JSON, UTF-8/no-BOM encoding, and whitespace are checked after writing.
- **No software tests, build, emulator, or deployment were run.** This is proposal-only documentation and changes no database JSON. If root later integrates only database JSON, the current `AGENTS.md` rule exempts that work from software testing; static package/schema/ownership checks remain appropriate.
