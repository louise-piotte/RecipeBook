# WP03 Section F R729 — PC Organics Ancient Grains cereal review

## Review record

- **Reviewed:** 2026-10-18.
- **Open-plan fit:** The active Section F checklist still requests remaining cereal and grain identity coverage, including other unresolved grain products ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)). Its regional cereal-mix/preprocessed-grain parent remains open ([plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4774)).
- **Scope:** One listed 375 g PC Organics ready-to-eat cereal, retailer product number `20036116_EA`, with a paired English and Québec French retail listing.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for **`Organic Ancient Grains Multigrain Cereal / Céréales Grains Anciens`**. Keep the brand in the source evidence, not as an alias or part of the picker display. Record the English listing's 60 g serving as one source-specific ledger observation only. Add no aliases, forms, active measurements, density, unit mappings, recipe links, conversions, yields, or substitutions.
- **Status:** Proposal only. This file is the sole intended change. No shared catalog, ledger, generated index, plan, roadmap, workflow, or integration file was changed.
- **Snapshot:** 1,846 active ingredient references, 174 forms, 114 manifest-listed recipe files with 1,123 structured ingredient rows, and 2,229 research-ledger records.

This is a single named retail cereal product, not a family review. It does not reopen R723's Froot Loops products or R726's Holy Crap family hold; those dispositions remain as recorded in the [R723 proposal](wp03-section-f-next-open-gap-review-r723-20261018.md), [R726 proposal](wp03-section-f-next-gap-review-r726-20261018.md), and the current [roadmap checkpoint](../../../roadmap.md#L1486) / [workflow checkpoint](../ingredient-catalog-workflow.md#L3001). The candidate also does not revisit other integrated or held grain decisions.

## Product identity and bilingual boundary

Loblaws currently lists the English product under the separate brand heading **PC Organics**, with the product title **Organic Ancient Grains Multigrain Cereal**, a 375 g package, and retailer product number `20036116_EA` [S01]. The product description presents it as a crisp cereal eaten with milk or fruit and yogurt. The listed formula includes Khorasan wheat flour, wheat bran, honey, oat flour, spelt flour, whole-wheat flour, millet, barley flour, malted-barley extract, quinoa, and salt. The English listing's “may contain” statement is an allergen advisory, not evidence that peanuts, tree nuts, or soy are ingredients.

Maxi's French indexed product page identifies the same 375 g retailer number as **PC Biologique — Céréales Grains Anciens** [S02]. Its French description calls it a multigrain cereal made from organic grains and its French ingredient list broadly tracks the English list. The English and French listings therefore support a paired retail identity for this SKU. Use the exact localized product titles after dropping the separate brand heading: `Organic Ancient Grains Multigrain Cereal` and `Céréales Grains Anciens`. The English title includes “Multigrain,” while the French product heading omits it; do not manufacture a literal French title from the description's broader multigrain wording. The French display is current Québec-market retailer wording, not an OQLF ruling or a generic translation recommendation.

Keep this one prepared cereal blend distinct from Khorasan wheat, wheat bran, oat flour, spelt flour, whole-wheat flour, millet, barley flour, quinoa, generic multigrain cereals, and the separate PC Organics 7 Reasons cereal. The product title may be searched as this exact product name; do not turn `ancient grains`, `grains anciens`, `multigrain cereal`, `céréales multigrains`, `organic`, or component names into aliases. R531 and R76 kept broad `grains anciens` / `ancient grains` wording out of aliases for other cereals; that boundary is retained here. This proposal uses the phrase only because it is part of this product's own English/French title, and does not assign it to other cereals ([R531](wp03-section-f-heritage-flakes-and-os-paired-review-r531-20261017.md), [R76](wp03-section-f-rogers-ancient-grain-porridge-blend-identity-review-r76-20261013.md)).

## Source evidence and limits

| Source ID | Source and locator | What it supports and what remains unverified |
|---|---|---|
| `WP03-PC-ANCIENT-GRAINS-20261018-R729-S01` | Loblaws, [PC Organics Organic Ancient Grains Multigrain Cereal, 375 g](https://www.loblaws.ca/en/organic-ancient-grains-cereal/p/20036116_EA), product heading, product number, product description, Nutrition Facts, ingredients, and disclaimer. | First-party Loblaw retail listing supports the current English product identity, its 375 g listed package, SKU `20036116_EA`, and a listed serving size of 60 g. It is not a manufacturer-hosted page or a direct inspection of a package; the page warns that product details may change. It gives no volume, cup basis, fill method, or UPC match. |
| `WP03-PC-ANCIENT-GRAINS-20261018-R729-S02` | Maxi, [PC Biologique Céréales Grains Anciens, 375 g](https://www.maxi.ca/fr/c-r-ales-grains-anciens/p/20036116_EA), French product title, product number, description, ingredient list, and Nutrition Facts. | The French search-index result, retrieved 2026-10-18 and marked crawled about three weeks earlier, supports a French product title and the same retailer number and package size. Direct page extraction returned no body, so the French page's indexed text is the evidence actually reviewed. Its indexed Nutrition Facts show `0 g` for the serving while reporting nonzero calories and nutrients; treat that serving field as malformed and do not use it to corroborate measurement. It supplies neither an UPC nor direct package verification. |

There is no separate manufacturer product page or verified package image in this review. The same Loblaw product number and size connect the two retailer records, but they do not establish UPC-level package/formula identity. Keep any future label change or package-level formula claim out of this row unless a current package or manufacturer source is checked.

### Serving and substitution boundary

The English Loblaws listing reports a 60 g serving. Record that only as a retailer-published, SKU-bound portion observation on the proposed reference's ledger record. It has no associated volume and does not establish a household measure, density, serving mass for other cereal products, or a conversion. Do not interpret the French listing's `0 g` field or derive a cup amount from the package size. The serving belongs to the listing with product number `20036116_EA`; without UPC or package confirmation it is not a verified physical-label match.

The page's suggestion to eat the cereal with milk or fruit/yogurt is a serving suggestion, not substitution evidence. No ingredient-to-ingredient replacement or same-ingredient form conversion is proposed; substitution research remains unreviewed.

## Current ownership and archive audit

The active references contain no PC Organics Ancient Grains product row, exact French title, product number, or matching English title. The nearest search identity is `ingredient-ref-rogers-ancient-grain-blend-porridge-oats` (`Rogers ancient grain blend porridge oats / Avoine porridge et grains anciens Rogers`): it is a different dry porridge-oats blend, not this ready-to-eat cereal. No active form label or match term refers to this product or SKU. The legacy-import identity file has no matching product entry. The ledger has no owner for either exact retailer URL, product number, or this product identity. The proposal-local source IDs below were checked and are not present in the live ledger or the review archive.

The R531 review left the Metro `grains anciens` wording inactive as a Heritage Flakes alias because that phrase is broad. R76 likewise excluded `ancient grains` as an alias for Rogers. Those decisions remain intact. R729 does not add either phrase as an alias; the current PC product titles themselves contain the wording, so phrase-first searches will show this product under its exact title and may return the already-distinct Rogers result for the French phrase `grains anciens`.

## Picker projection

The projection uses the current references and forms plus the proposed bilingual names with empty alias lists, following [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and ligature folding, punctuation normalization, complete word-phrase matches first, and substring matching only if no complete phrase matches.

| Query | Current results | With R729 | Projected result |
|---|---:|---:|---|
| `ancient grains` | 0 | 1 | Adds this cereal by its plural English product title. |
| `ancient grain` | 1 | 1 | Rogers remains the only phrase-first result; no unsourced singular alias is added to this plural-title product. |
| `grains anciens` | 1 | 2 | Rogers porridge blend and PC cereal appear as separately named products. |
| `céréales grains anciens` | 0 | 1 | Adds the French product-title phrase. |
| `multigrain cereal` | 1 | 2 | Adds this product beside Kellogg's Frosted Flakes Less Sugar Multigrain Cereal. |
| `céréales multigrains` | 3 | 3 | Unchanged; the proposed French display does not store the broad multigrain phrase. |
| `PC Organics`; `PC Biologique` | 0; 0 | 0; 0 | The brand remains source evidence, not a search alias or picker display prefix. |

This is a deterministic projection of current catalog terms, not an Android runtime picker test. It retains a known pluralization limit: a singular English query `ancient grain` returns the existing Rogers row and does not also return this candidate. Adding a singular alias would extend beyond the product's plural title, so it is not recommended. The French `grains anciens` query becomes a two-result choice with clear product labels rather than suppressing Rogers.

## Manifest recipe-corpus scan

All 114 paths listed in the live manifest were parsed: 1,123 structured ingredient rows. The corpus-wide search covered product titles, ingredient rows, and other string fields using the app's accent/punctuation-normalized terms. Searches for both proposed names, `PC Organics`, `PC Biologique`, `ancient grains`, `grains anciens`, `20036116_EA`, and the product-title phrases returned zero matching recipe files and zero matching ingredient rows. No recipe currently links to this product, so no recipe `ingredientRefId`, amount, or substitution link is proposed.

The corpus contains one component-level hit for `quinoa` in recipe 016's `2 cups cooked quinoa` line. That is the generic cooked quinoa ingredient and is not evidence of this packaged cereal blend. No `Khorasan`, `spelt`, or `millet` ingredient-row hits were found. The 114 recipe files were fingerprinted in manifest order as SHA-256 `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362` (each manifest-relative path, NUL, exact file bytes, NUL).

## Schema-shaped examples if accepted

The IDs below are proposal-local placeholders only; they are not allocated in shared data. The reference shape follows [`full-library.schema.v1.json`](../../schemas/full-library.schema.v1.json#L510); the sidecar entry follows [`research-ledger.schema.json`](../research-ledger.schema.json). French accents are JSON Unicode escapes to match the bundled database convention.

### Ingredient reference

```json
{
  "id": "proposal-local-ingredient-ref-r729-pc-organics-ancient-grains-cereal",
  "nameFr": "C\u00e9r\u00e9ales Grains Anciens",
  "nameEn": "Organic Ancient Grains Multigrain Cereal",
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
  "recordId": "proposal-local-ingredient-ref-r729-pc-organics-ancient-grains-cereal",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-PC-ANCIENT-GRAINS-20261018-R729-S01",
      "url": "https://www.loblaws.ca/en/organic-ancient-grains-cereal/p/20036116_EA",
      "title": "Loblaws, PC Organics Organic Ancient Grains Multigrain Cereal, 375 g",
      "accessedOn": "2026-10-18",
      "locator": "Product heading, retailer product number 20036116_EA, Nutrition Facts serving size, ingredients, and page disclaimer.",
      "supports": "The Loblaw retail listing identifies the English product title and 375 g offer and reports one 60 g serving. This supports a listing-specific portion observation, not a UPC-verified package label, household volume, generic cereal measure, or conversion.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-PC-ANCIENT-GRAINS-20261018-R729-S02",
      "url": "https://www.maxi.ca/fr/c-r-ales-grains-anciens/p/20036116_EA",
      "title": "Maxi, PC Biologique C\u00e9r\u00e9ales Grains Anciens, 375 g",
      "accessedOn": "2026-10-18",
      "locator": "Indexed French product title, package size, retailer product number, description, ingredients, and Nutrition Facts listing.",
      "supports": "The French index snapshot pairs the French product title with the same 375 g retailer number as the English listing. Direct page extraction returned no body; the indexed 0 g serving value is malformed and is not used as measurement evidence.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "proposal-local-r729-pc-organics-ancient-grains-60g-serving",
      "relationship": "portion_weight",
      "value": 60,
      "valueUnit": "g",
      "foodDescription": "PC Organics Organic Ancient Grains Multigrain Cereal, retailer product number 20036116_EA",
      "foodState": "Dry ready-to-eat cereal as listed.",
      "measurementMethod": "Serving-size statement displayed in the Loblaws product listing; no package or measuring method was inspected.",
      "quantityBasis": "One listing-specific serving mass only. No household volume, cup convention, or fill method is reported; this is not a generic cereal measure, density, or volume conversion.",
      "evidenceKind": "published_portion",
      "observedMassG": 60,
      "sourceIds": ["WP03-PC-ANCIENT-GRAINS-20261018-R729-S01"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one product-specific GRAIN_AND_CEREAL identity for the paired English and French retail title. Keep brand and component names out of aliases; record only the English listing's 60 g SKU-bound portion observation, with no active measure, form, density, unit mapping, recipe link, conversion, yield, or substitution.",
      "sourceIds": [
        "WP03-PC-ANCIENT-GRAINS-20261018-R729-S01",
        "WP03-PC-ANCIENT-GRAINS-20261018-R729-S02"
      ]
    }
  ]
}
```

## Bounded recommendation and static checks

Recommend one identity-only cereal reference under the exact product title pair and one source-specific 60 g ledger observation from S01. Keep both retailer source limits attached to the row. Do not create a general `ancient grains`/`grains anciens` class or alias, do not connect the blend to any component grain, and do not add package-, allergy-, nutrition-, recipe-, or substitution behavior. The broader Section F and regional cereal sweep remain open.

The live-reference, form, ledger/URL, prior-proposal, picker-projection, and complete 114-recipe/1,123-row corpus audits were read-only. The example reference and ledger record are JSON-shaped and use proposal-local IDs; no shared JSON was edited. Proposal links, schema fields, UTF-8/no-BOM encoding, and whitespace should be checked at save. No software tests, build, emulator, or deployment are applicable to this documentation-only proposal; the updated `AGENTS.md` JSON-data exemption remains in force for any later database-only integration.
