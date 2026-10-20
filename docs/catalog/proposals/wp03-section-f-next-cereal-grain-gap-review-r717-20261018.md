# WP03 Section F R717: Canadian Bob's Red Mill 8 Grain serving-source review — 2026-10-18

**Disposition: Propose one source-specific 1/4 cup (45 g) portion observation for the existing Canadian 8 Grain reference.** Healthy Planet's Canadian listing matches the manufacturer P101125 catalog on product title, 709 g package size, and the soy-containing ingredient sequence; two obvious transcription errors appear to be `Cats` for oats and `Com` for corn. The retailer gives its own SKU A0063910 and posts the serving in both English and French. The page does not show the manufacturer UPC/item number, so the linkage is retailer-SKU-specific and not barcode-verified. That limit belongs in the source and observation notes; it does not require holding the observation out.

## Scope and prior decision boundary

This is a narrow source-match review under the still-open Section F checklist item **“Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps”** in `docs/RecipeBook-global-ingredient-catalog-plan.txt` (line 4716). It does not repeat R173's product-identity decision. R173 integrated the Canadian P101125 identity from the manufacturer catalog and a Canadian Well.ca listing, whose exact title, package size, and soy-containing formula supported the identity even though Well.ca showed no UPC. R173 left measurements empty because its sources gave no serving. Healthy Planet is new evidence: its bilingual title, matching 709 g package, matching formula, and retailer SKU identify the same listed product closely enough for one retailer-specific portion observation, while the missing UPC remains explicit.

R173's current identity and its exclusion of U.S. product P101124 remain unchanged. The R714 brown-rice-puffs hold and prior puffed-grain decisions are unrelated and are not reconsidered.

The recent roadmap/workflow entries still leave WP03 Section F open; R713–R715 covered cracked-wheat substitution, the brown-rice-puffs picker hold, and a coho-salmon alias. R717 stays within the open Section F scope but reviews a different, newly surfaced retailer serving source. See the [roadmap](../../../roadmap.md) and [catalog workflow](../ingredient-catalog-workflow.md).

## Current owner and record state

The live reference is `ingredient-ref-bobs-red-mill-8-grain-hot-cereal` in `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

- English: `Bob's Red Mill Gluten Free 8 Grain Hot Cereal`
- French: `Bob's Red Mill Céréales chaudes à 8 grains sans gluten`
- Existing English alias: `Cereal, 8 Grain Hot, Gluten Free`
- Existing French alias: `Céréales chaudes 8 grains`
- `defaultDensity`: `null`; `unitMappings`: `[]`

The live ledger record is identity-verified, has `measurementState: researched_no_supported_value`, `substitutionResearchState: not_yet_researched`, no measurement observations, and no substitution findings. Its three existing sources and accepted identity decision are owned by R173. There are no forms for this reference. If accepted, update the measurement state to `researched_supported` and add only the Healthy Planet source-specific portion observation below; leave the identity, substitution state, forms, density, and unit mappings unchanged.

## Evidence and limits

| Evidence | Direct support | Limit for this decision |
| --- | --- | --- |
| Existing R173 source `WP03-BRM8G-R173-20261016-S01`: Bob's Red Mill, [2026 Canadian French Product List, pp. 26–27](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/26-27/). | The maker lists `Cereal, 8 Grain Hot, Gluten Free / Céréales chaudes 8 grains`, item P101125, UPC `0-39978-00118-4`, GTIN `10039978001181`, package size 709 g, and a formula including gluten-free oats, brown rice, corn, soy beans, millet, sorghum, oat bran, sunflower seeds, and flaxseed. | It does not give a household portion. This source is already owned by the R173 ledger record and is cited here for SKU comparison only; it is not registered again. |
| Proposal-local `WP03-SECTION-F-BRM8G-MEASURE-R717-20261018-S01`: Healthy Planet Canada, [English product listing](https://www.healthyplanetcanada.com/en/bob-s-red-mills-hot-cereal-8-grain-gluten-free-709g.html), indexed listing checked 2026-10-18. | The listing names a 709 g Bob's Red Mill Gluten Free 8 Grain Hot Cereal, gives retailer SKU A0063910, and displays `Per 1/4 cup (45 g)`. Its soy-containing ingredient sequence aligns with the Canadian maker list; interpreting `Cats` and `Com` as transcription errors for oats and corn is an inference from the sequence. | It supplies no manufacturer UPC or item number. It is out of stock, and its displayed product expiry is 2026-10-03, before this review date. Direct page retrieval failed; indexed content was available. Treat this as a historical retailer-posted label transcription, not a claim about current stock or a barcode-verified package. |
| Proposal-local `WP03-SECTION-F-BRM8G-MEASURE-R717-20261018-S02`: Healthy Planet Canada, [French product listing](https://www.healthyplanetcanada.com/fr/bob-s-red-mills-hot-cereal-8-grain-gluten-free-709g.html), indexed result checked 2026-10-18. | The result names `Céréales chaudes Bob's Red Mill 8 céréales sans gluten 709 g`, gives the same retailer SKU A0063910, and displays `Par 1/4 tasse (45 g)`. Its `8 grains` heading supports the Canadian product wording. | The direct page returned a cache miss and the result was crawled about four months earlier. This is the French view of the same retailer listing, not an independent package source; it corroborates the transcribed portion and wording but does not supply a UPC. Its ingredient text mistranslates whole-grain oats as `Croquettes pour chats`; do not treat it as an independent formula source. |
| R173's excluded U.S. comparator sources, Bob's [U.S. 8 Grain Hot Cereal page](https://www.bobsredmill.com/product/8-grain-hot-cereal) and 2026 U.S. product list, summarized in the [R173 proposal](wp03-section-f-bobs-red-mill-8-grain-hot-cereal-identity-review-r173-20261016.md). | The U.S. product page identifies P101124 and reports 1/4 cup (40 g); its formula differs from the Canadian catalog. The U.S. catalog and product page also conflict on whether soy is listed. | P101124 is not Canadian item P101125. Neither its 40 g panel nor its formula should be transferred to the Canadian reference. R717 does not reopen that R173 boundary. |

The retailer statement supports only a source-specific portion: 1/4 cup (45 g) for the Healthy Planet SKU A0063910 listing. It does not create a default cereal measure or a density. The no-UPC limit means the link to P101125 rests on the Canadian retailer title, 709 g size, and matching soy-containing ingredient sequence rather than package barcode verification. The observation must retain that basis and must not absorb the U.S. P101124 1/4 cup (40 g) value.

## English and Québec French wording; identity boundaries

The current English/French reference names remain supported by the manufacturer catalog and R173's Canadian retailer evidence. The exact 2026 manufacturer French wording is `Céréales chaudes 8 grains`; the existing display adds the brand and gluten-free qualifier, and Well.ca's existing R173 French listing uses `Céréales chaudes à 8 grains sans gluten`. Healthy Planet's older indexed page says `8 céréales`, but that single retailer wording does not justify a new alias or display change. No OQLF terminology claim is made for this branded product phrase.

Keep the Canadian 8 Grain blend separate from Bob's 5 Grain, 7 Grain, and 10 Grain products and from its component oats, brown rice, corn, soybeans, millet, sorghum, oat bran, sunflower seeds, and flaxseed. Do not add `8 céréales`, generic `8-grain cereal`, or a component term as an alias on this record. Healthy Planet's French `8 céréales` wording is retailer-specific and does not change the existing display or aliases.

## Picker projection and ownership audit

`IngredientSearch.kt` normalizes accents and punctuation, checks whole word phrases first, then falls back to substring matching. A normalized scan of the live reference and form terms returns only this one reference for each current identifying query: `8 grain hot cereal`, the complete English display, `Cereal, 8 Grain Hot, Gluten Free`, `céréales chaudes 8 grains`, and the complete French display. The reference has no forms. This proposal adds no alias or form, so none of those picker results changes; a broad query such as `hot cereal` continues to return its existing set of distinct cereal products.

Ownership checks found the target reference and its three R173 ledger sources, with no existing owner for the two Healthy Planet URLs in the ledger. The exact source IDs and URLs in the R173 record remain untouched. R717's two source IDs and observation ID are proposal-local labels only; they are not allocated in the shared ledger by this review. If accepted, these local source/observation identifiers can be assigned during the authorized integration. No ingredient ID, form ID, alias, or integration identifier is proposed.

## Bundled recipe corpus

All 114 recipe files named by `app/src/main/assets/seed/bundled-library/manifest.v1.json` were scanned across their serialized content and ingredient rows (1,123 rows). The scan searched the English and French display names and aliases, `8 grain hot cereal`, Bob's Red Mill product wording, P101125, the UPC and GTIN, and spacing/hyphen variants. It found zero candidate lines, recipe links, or product-code references. The bundled corpus therefore supplies no recipe-specific reason to add a measure, preparation form, or substitution for this product.

## Proposed source-specific portion observation

The Canadian manufacturer catalog establishes the product identity and formula but no kitchen measure. Healthy Planet adds the same 709 g product title, a retailer SKU, an ingredient sequence that aligns with the maker list (with two inferred transcription repairs), and a bilingual Nutrition Facts portion. R173 accepted Well.ca's Canadian product identity on the same kind of product-level match without a UPC; this review applies that evidence threshold to the new label statement but keeps the observation explicitly tied to Healthy Planet SKU A0063910. The listing's expired/out-of-stock status limits any claim about current packaging or availability, but does not erase its historical serving text.

The observation uses the existing ingredient-reference ID, which is already shared. The observation and source IDs below are proposal-local examples only:

```json
{
  "observationId": "WP03-SECTION-F-BRM8G-MEASURE-R717-20261018-O01",
  "relationship": "portion_weight",
  "value": 45,
  "valueUnit": "g",
  "foodDescription": "Bob's Red Mill Gluten Free 8 Grain Hot Cereal, Healthy Planet SKU A0063910, 709 g listing",
  "quantityBasis": "Healthy Planet Nutrition Facts portion; match to Canadian item P101125 inferred from product title, package size, and soy-containing ingredient sequence; no UPC shown",
  "sourceQuantity": {
    "amount": 0.25,
    "unit": "cup"
  },
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP03-SECTION-F-BRM8G-MEASURE-R717-20261018-S01",
    "WP03-SECTION-F-BRM8G-MEASURE-R717-20261018-S02"
  ]
}
```

This `MeasurementObservation` shape matches `docs/catalog/research-ledger.schema.json`. It stores neither a cup convention nor an active conversion, and the source-match limit is part of the observation basis.

## Measurement, preparation, and substitution disposition

- Change only the ledger measurement state to `researched_supported` when adding the observation above. Do not infer a density, active cup mapping, or package yield from the package size or seller panel.
- This follows [Requirements.md](../../../Requirements.md): volume-to-mass conversion needs an ingredient density or mapping. One retailer's portion statement cannot establish a reusable cereal mapping.
- Add no form, cooking yield, dry-to-cooked conversion, or recipe link. The retail preparation directions do not establish a measured finished yield for P101125.
- Leave `substitutionResearchState` as `not_yet_researched`. The sources reviewed here do not test or quantify a replacement between this blend and another cereal or grain; no substitution conclusion is added.
- Do not promote the retailer-specific portion to a reusable mapping without separate evidence. Keep the no-UPC match limitation attached to the source and observation.

## Recommendation

**Add one source-specific 1/4 cup (45 g) observation** to the existing P101125 reference's research-ledger record, using Healthy Planet SKU A0063910 as the explicit scope. Keep the identity, bilingual display, aliases, forms, substitution state, density, and unit mappings unchanged. The observation is supported by a close Canadian product match consistent with R173's accepted no-UPC Well.ca identity precedent, but it is not barcode-verified and must not become a generic cereal conversion. No shared JSON or integration record is changed by this proposal-only review.
