# WP06 Section 05 — Norwegian brunost identity review (R393)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review changes no canonical catalog data, forms, research ledger, recipes, generated files, global plan, workflow, or roadmap.
- **Scope:** One Nordic cheese candidate: the Norwegian whey-based brown cheese called *brunost*.
- **Source-ID prefix:** `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017`. All IDs below are proposal-local and were checked for collisions.

## Recommendation

Add one identity-only `CHEESE` reference for **Norwegian brown cheese / brunost (fromage brun norvégien)**. Preserve the Norwegian source name in French and qualify the English display with the product family. Keep the descriptive French parenthetical provisional: no OQLF or TERMIUM preferred term was located. Add no aliases, forms, measurements, density, unit mappings, package yields, conversions, recipe links, or substitutions.

TINE describes brunost as a Norwegian product made by caramelizing whey with cow’s and/or goat’s milk and cream, and documents use on bread and waffles and in brownies or sauces. Visit Norway describes distinct local recipes and names Gudbrandsdalsost and Heidalsost as products of the Gudbrandsdalen area. This supports the *brunost* family identity and a small number of named examples; it does not make one product, farm, recipe, or source representative of Norway or Europe. [S01–S03]

Current Canadian distributor evidence makes the item relevant to the catalog: Norseland lists Ski Queen in English and French as a Norwegian whey-cheese product and identifies its office in Montréal. Its site states that TINE cheeses are distributed through Canadian chains and independent cheese shops. A Canadian cheese supplier separately lists “Gjetost (Ski Queen Classic)” as a Norwegian product. These listings support present-day Canadian product naming and availability context, not a universal brunost formula or a claim that any one local shop has stock. [S04–S06]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-brunost",
  "nameFr": "brunost (fromage brun norvégien)",
  "nameEn": "Norwegian brown cheese (brunost)",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The displays contain the source name and descriptive wording, so separate aliases are unnecessary. The French wording is explanatory, not a claim of an OQLF-approved or standardized Québec term. No form is proposed: the sources describe family and producer variation, but the bundled corpus has no matching demand for a product-specific state.

## Product and naming boundaries

Brunost is a source-named family of brown Norwegian whey cheeses. TINE’s family description allows whey with cow’s and/or goat’s milk and cream. Its Gudbrandsdalsost product page gives one exact formulation, while Visit Norway reports local variation in recipe and taste. Do not transfer a single product label, ingredient ratio, milk source, color, flavor strength, storage detail, or process setting to all brunost. [S01–S03]

Keep the following names out of the proposed alias arrays:

- **`Gjetost` / `geitost`:** `Gjetost` appears in a Canadian supplier’s title for a Ski Queen product, while TINE separately lists a `Geitost` product within its brown-cheese collection. Treat these as product-specific names; do not make either a global synonym for the family. [S03, S06]
- **`Gudbrandsdalsost` and `Heidalsost`:** Visit Norway describes them as named local brunost products. Keep their exact names available for later product-specific review; this proposal does not create separate rows or aliases for them. [S02]
- **`Ski Queen`:** a brand/product label, not a general ingredient synonym. Norseland’s Canadian listing supports the named product and its whey-cheese category. [S04–S05]
- **`mysost`:** recorded in regional source material, but not activated as a global alias because this review does not establish its full cross-market scope. [S02]
- **`goat cheese` / `fromage de chèvre`:** a distinct generic category. The legacy file has an unreviewed `ingredient-ref-goat-cheese` candidate; leave it inactive. Brunost is not a synonym for goat cheese, and the active goat-milk reference remains separate.
- **Whey, whey protein, caramel sauce, dulce de leche, and sweetened condensed milk:** not aliases or substitutions. A shared dairy source or caramel-like taste does not make these products equivalent.

### Québec French terminology limit

Searches of the OQLF Grand dictionnaire and TERMIUM Plus for `brunost` and `fromage brun` did not surface a relevant terminology entry. This is a bounded search result, not proof that no related term exists. Retain `brunost` in the French display and add the parenthetical `fromage brun norvégien` only as a provisional descriptive gloss. A Québec French recipe publisher uses `fromage brun (brunost)` for the ingredient, and Norseland’s French product page describes Ski Queen as a Norwegian whey cheese; these attest local descriptive usage but do not establish a preferred standard term. [S04, S07]

## Live ownership and archive audit

Read-only snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,701 | No `ingredient-ref-brunost` row and no exact owner for `brunost`, `Norwegian brown cheese`, `brown cheese`, or `fromage brun`. |
| Ingredient forms | 141 | No brunost, brown-cheese, or Norwegian-whey-cheese form label or match term. |
| Legacy import candidates | 56 | No brunost candidate. The inactive generic `ingredient-ref-goat-cheese` candidate remains separate. |
| Research-ledger records | 2,057 records; 9,272 source entries; 7,846 distinct source IDs | No brunost-family record or source-prefix collision. The proposal’s R393 source IDs are not present in the ledger. |
| Manifest-listed bundled recipes | 114 files; 1,123 ingredient rows | No brunost-family match or linked recipe line; scan details follow. |

The exact target names were checked across active reference names and aliases, every form label and match term, legacy candidate names and aliases, the ledger, and proposal/batch archive text. No prior WP06 Europe/Norway brunost packet or integration was found. Other archived European work on seafood and Mediterranean condiments addresses different catalog scopes and does not resolve this cheese identity. The proposal/batch archive has no match for `brunost`, `gjetost`, `geitost`, `Gudbrandsdalsost`, `Heidalsost`, `Ski Queen`, `brown cheese`, `brown whey cheese`, or the proposed French wording. No `R393` or source-prefix collision was found in the archive or ledger.

The open global plan item is **“Western, Southern, Northern, Central, and Eastern Europe; include breads, pastry, charcuterie, pickles, and cheese traditions.”** It remains unchecked. This single candidate does not complete, sample representatively, or otherwise close any part of the overall European coverage task. The workflow and roadmap contain no earlier WP06/Norway brunost decision; no shared checklist or progress file was edited.

### Related active references

| Active owner | Current scope | Decision here |
|---|---|---|
| `ingredient-ref-goat-milk` | `goat milk / lait de chèvre` | Retain as milk, not cheese; no brunost alias. |
| `ingredient-ref-quark` | `quark / quark` | Keep as a separate dairy product. |
| `ingredient-ref-cheese-curds` | `cheese curds / fromage en grains` | Keep fresh curds separate from the whey-based brown-cheese family. |
| `ingredient-ref-cream-cheese` | `cream cheese / fromage à la crème` | No alias or substitution. |
| `ingredient-ref-caramel-sauce`, `ingredient-ref-dulce-de-leche` | Prepared sweet products | Keep separate despite brunost’s caramelized flavor. |
| Legacy `ingredient-ref-goat-cheese` | Unreviewed `goat cheese / fromage de chèvre` import candidate | Do not promote or merge as part of this proposal. |

## Exact picker projection

The current picker normalizes case, accents, punctuation, and spacing, prefers full word-phrase matches, and falls back to partial matches. The exact phrase audit included reference names/aliases and form labels/match terms. Adding the proposed bilingual displays yields:

| Query | Current result | With proposed row |
|---|---|---|
| `brunost` | No result | `ingredient-ref-brunost` only |
| `Norwegian brown cheese` / `brown cheese` | No result | `ingredient-ref-brunost` only |
| `fromage brun norvégien` / `fromage brun` | No result | `ingredient-ref-brunost` only |
| `brown whey cheese` / `whey cheese` | No result | No result; not added as a broad descriptor alias |
| `gjetost`, `geitost`, `mysost` | No result | No result; observed source/product terms remain outside global aliases |
| `Gudbrandsdalsost`, `Heidalsost`, `Ski Queen` | No result | No result; named local or brand products are not aliases |
| `goat cheese` | No active result; one unreviewed legacy candidate | No active result; legacy candidate stays inactive |
| `goat milk` | `ingredient-ref-goat-milk` | Same single result |
| `cheese` | 10 broad cheese results | 11, including the proposed identity |

The new row is uniquely found through its source name and displayed descriptions. Product-specific Gjetost, Geitost, Gudbrandsdalsost, Heidalsost, and Ski Queen searches deliberately remain unallocated because their exact family/product scope has not been established as a global synonym set.

## Complete bundled recipe scan

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were parsed as UTF-8. The pass searched complete recipe text and each ingredient object, including `originalText`, `ingredientName`, `ingredientRefId`, and `ingredientFormId`. Search phrases included `brunost`, `brun ost`, `brown cheese`, `Norwegian brown cheese`, `brown whey cheese`, `Norwegian brown whey cheese`, `fromage brun`, `fromage brun norvégien`, `fromage de lactosérum`, `whey cheese`, `gjetost`, `geitost`, `mysost`, `Gudbrandsdalsost`, `Heidalsost`, `Ski Queen`, and `Ekte Geitost`; text comparison used case/diacritic folding and whole-phrase boundaries. It found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**.

For reproducibility, the manifest-order recipe fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. It was computed by hashing each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashing the concatenated bytes.

## Numeric, form, and substitution boundaries

- TINE publishes product-specific ingredients, package sizes, storage, and nutrition for Gudbrandsdalsost. Those details describe that SKU and remain out of the active catalog’s general measurement behavior. No density, spoon conversion, volume-to-mass mapping, yield, or conversion is proposed. [S03]
- A Québec recipe publisher gives `100 g brunost` in one Norwegian-style meatball recipe. This is one recipe’s amount, not a reusable portion or a representative Norwegian formula. The source is used only for local wording and one culinary-use example. [S07]
- The current Norseland page gives product-specific descriptions and packaging for Ski Queen. They do not establish a universal package yield, form, or preparation state. [S04–S05]
- No global or contextual substitution is supported. Do not infer substitution with goat cheese, fresh cheese, caramel, dulce de leche, or another whey product from the shared source or flavor.

## Source register

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S01` | TINE, [The TINE Brunost Collection](https://www.tine.no/english/products/the-tine-brunost-collection), accessed 2026-10-17. | Norwegian producer source for the brunost family, whey/milk/cream composition, caramelization, and serving/cooking uses. It does not define one formula for all products. |
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S02` | Visit Norway, [A taste of Gudbrandsdalen valley](https://www.visitnorway.com/places-to-go/eastern-norway/gourmet-road-trip/a-taste-of-gudbrandsdalen/), accessed 2026-10-17, “Traditional brown cheese” and “Gudbrandsdalsost.” | Official Norway tourism source placing brunost, Gudbrandsdalsost, and Heidalsost in a specific Gudbrandsdalen food context. This regional article is not a survey of all Norwegian or European cuisine. |
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S03` | TINE, [Gudbrandsdalsost](https://www.tine.no/merkevarer/tine-brunost/produkter/tine-gudbrandsdalsost-g35), accessed 2026-10-17, product composition/use sections. | A producer’s exact formulation and consumer-use examples for one named product within the family. Product-specific ratios, nutrition, storage, and package sizes are not transferred. |
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S04` | Norseland / Jarlsberg, [Ski Queen — English product page](https://www.norseland.ca/en/products/ski-queen/), accessed 2026-10-17. | Current Canadian distributor page for the named TINE product. It describes a Norwegian whey cheese and product uses and states broad Canadian TINE distribution; that statement is not proof of SKU stock at every retailer. |
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S05` | Norseland / Jarlsberg, [Ski Queen — French product page](https://www.norseland.ca/produits/ski-queen/), accessed 2026-10-17. | Montréal-based distributor’s French description and product listing. The page uses explanatory wording for Ski Queen; it is not an OQLF or TERMIUM terminology ruling. |
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S06` | Springbank Cheese Co., [Gjetost (Ski Queen Classic), 250 g, Norway](https://western.springbankcheese.ca/product/gjetost-ski-queen-f-w-250g-norway/), accessed 2026-10-17. | Canadian cheese-supplier listing supporting a current export/retail title and Norwegian origin. Its product metadata says cow’s milk, which is not used to define the family and differs from TINE’s Gudbrandsdalsost listing; no composition claim is generalized from this listing. |
| `WP06-EUROPE-NORWAY-BRUNOST-R393-20261017-S07` | Jonathan Michaud, [Boulettes norvégiennes au brunost (fromage brun)](https://www.jonathanmichaudcuisine.com/recettes/boulettes-norvegiennes-brunost), published 2023-03-16, accessed 2026-10-17. | Québec French wording and a single recipe use. The listed amount is recipe-specific; this publisher and dish do not define standard Québec terminology or represent Norwegian cuisine. |

## Disposition

Proceed only with the one identity-only row above if accepted. Leave the global Europe checklist open, preserve the inactive generic goat-cheese legacy candidate, and route any Gjetost/Geitost or individual producer-variant naming to a separate product-scope review. No software tests, build, or emulator run were performed because this is a proposal-only documentation change.
