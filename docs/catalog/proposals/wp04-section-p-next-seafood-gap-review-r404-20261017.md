# WP04 Section P — ankimo / steamed monkfish liver product-identity review (R404)

- **Review and source-access date:** 2026-10-17.
- **Checklist:** the open Section P finfish and regional-fish coverage in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5999).
- **Candidate:** Azuma Foods (Canada) product 63142, sold as **Ankimo / Steamed Monkfish Liver / Foie de baudroie cuit à la vapeur**.
- **Recommendation:** Add one identity-only `PROTEIN` reference for this prepared product, displayed as **steamed monkfish liver / foie de baudroie cuit à la vapeur**, with the source-attested English alias **ankimo**. Keep it species-neutral. In the ledger, record the Azuma ramen's **20 g** broth amount as one two-serving, recipe-specific `portion_weight` observation and set `measurementState` to `researched_supported` for that observation only. Do not add an active measure or runtime conversion. The broad `monkfish` and `baudroie` queries would return this liver product as their sole result; that picker effect is documented for review. Leave `substitutionResearchState` as `not_yet_researched` because the checked product and recipe pages are not a focused substitution review.
- **Boundary:** This is a specific steamed liver product, not whole monkfish, raw monkfish liver, freshwater burbot / `lotte`, cod liver, fish roe, or a taxonomic assignment to one *Lophius* species. Do not add generic `monkfish`, `baudroie`, `lotte`, `fish liver`, `foie`, `roe`, or `caviar` aliases.
- **Proposal-only status:** This file is the only change. No shared reference/form/ledger JSON, generated catalog, recipe, plan, roadmap, or application code was edited. No tests, build, emulator, or deployment were run.
- **Proposal-local evidence labels:** `WP04-SECTIONP-ANKIMO-R404-20261017-S01` and `S02`, plus static audit label `WP04-SECTIONP-ANKIMO-R404-20261017-R01`. Existing OQLF and DFO sources are cross-referenced under their archived IDs below. These labels are not ledger entries.

## Why this is a separate open product gap

The open Section P checklist still asks for broader fish and regional-seafood coverage. The recent [R395 trout-roe review](wp04-section-p-next-fish-shellfish-gap-review-r395-20261017.md), [R398 salted-pollock review](wp04-section-p-boneless-salted-pollock-product-boundary-review-r398-20261017.md), and [R401 cod-roe hold](wp04-section-p-next-seafood-gap-review-r401-20261017.md) address different ingredients and remain unchanged.

The existing [monkfish / baudroie picker-boundary review](wp04-section-p-monkfish-baudroie-picker-boundary-review-20261012.md) held a whole-fish or species row: Québec terminology and CFIA sources span more than one *Lophius* species, and a hypothetical species row would catch the unqualified query. This R404 review does not allocate that species row. It addresses the newly checked, named prepared product on a current Canadian manufacturer page and a product-matched manufacturer recipe. Neither earlier decision reviewed `ankimo`, steamed monkfish liver, or the product's bilingual display.

The manufacturer's product is already steamed and frozen as sold. It therefore needs its own product-identity review; it is not a universal steamed/frozen form for a whole-fish reference. Its source label omits a binomial, origin, and explicit species, so keep the row species-neutral. [S01, reused S03]

## Product identity and Québec naming

Azuma Foods (Canada) lists product 63142 under **Ankimo**, with **Steamed Monkfish Liver** and **Foie de baudroie cuit à la vapeur** as the paired English and French names. The page lists monkfish liver and salt as main ingredients and describes a frozen shelf life. This is direct manufacturer evidence for one finished-food product and a Québec-readable French display. It does not state the raw fish's binomial, origin, curing method, recipe role beyond the manufacturer's menu pages, or composition of every product sold as ankimo. [S01]

OQLF's Québec fish-product entry prefers **baudroie**, gives English `monk fish`, and scopes the market term to *Lophius* sp.; its note says *L. piscatorius* and *L. americanus* may both occur in commerce. The manufacturer does not choose between them. Do not assign the Azuma product to *L. americanus* based on DFO's profile for that one species. [reused S03, reused S05]

Use the manufacturer's exact French phrase `foie de baudroie cuit à la vapeur`. Do not substitute `foie de lotte`: OQLF defines Québec `lotte` as burbot (*Lota lota*) and warns against using `lotte` for `baudroie`; the active catalog also has `ingredient-ref-burbot` displayed as `burbot / lotte`. The product's French name makes this Québec distinction useful. [reused S04]

Keep `ankimo` as the only proposed alias. Do not add `foie gras de la mer`, `foie de poisson`, Japanese writing not shown on the manufacturer label, raw-liver terms, or other fish-liver wording as synonyms. The marketing phrase “Foie Gras of the Sea” appears on the manufacturer's separate recipe page but is not a product synonym or ingredient identity. [S02]

## Live ownership and archive scan

The read-only snapshot from the current worktree contains **1,710 active references**, **141 forms**, **56 legacy-import candidates**, and **2,070 research-ledger records**. The ledger has **9,359 source entries**, **7,926 distinct source IDs**, and **6,644 distinct source URLs**. Current file SHA-256 values are: references `3d621ad22ad38453a709f7603e83f01c87c2f0d1f2e48ed9b7e78abada56e827`, forms `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed`, legacy identities `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720`, and ledger `35013eaf441ae3c257733da1045ad3acef19c5191fd1921e076a625184f60668`.

Exact normalized-key checks followed `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). They covered active reference names/aliases, form labels/match terms, legacy names/aliases, and ledger record IDs. The live files have no exact owner for `ankimo`, `steamed monkfish liver`, `monkfish liver`, `foie de baudroie cuit à la vapeur`, `foie de baudroie`, `Lophius americanus`, `Lophius piscatorius`, `ingredient-ref-steamed-monkfish-liver`, or `candidate-steamed-monkfish-liver`. There is no liver/foie reference, form, or legacy owner. The active burbot row is a different *Lota lota* identity, and the three active roe-adjacent references—bottarga, fish milt, and trout roe—remain distinct.

| Existing owner or review | Current scope | R404 boundary |
|---|---|---|
| `ingredient-ref-burbot` / `burbot / lotte` | Freshwater burbot, *Lota lota*. | Keep it distinct; do not use `lotte` as an alias for the marine liver product. |
| Monkfish / baudroie review, R12 | Whole-fish and species-name picker hold; source names span *L. americanus* and *L. piscatorius*. | This product review does not allocate a whole-fish row or assign either species. |
| `ingredient-ref-bottarga`, `ingredient-ref-fish-milt`, `ingredient-ref-trout-roe` | Separate fish roe products and male fish gonad. | Ankimo is liver tissue, not roe, caviar, or milt. |
| R395, R398, and R401 | Trout roe addition, boneless salted pollock product review, and cod-roe hold. | Separate product identities; none owns liver wording or ankimo. |
| Cod-liver and other fish-liver searches | No active exact owner for `cod liver`, `foie de morue`, `fish liver`, or bare `liver`/`foie`. | Keep those absent terms unassigned; do not turn one ankimo product into a general fish-liver identity. |

A focused search of the current Section P plan and proposal/batch archive found no previous `ankimo`, monkfish-liver, or `foie de baudroie` product review, allocation, or source-ID-prefix use. The older whole-monkfish hold is relevant species-boundary context, not duplicate product work. The two Azuma URLs and the proposed product/reference IDs were absent from the live ledger. The existing OQLF `lotte` URL is already recorded as `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S02`; reuse that source ID. The OQLF `baudroie` and DFO monkfish pages were previously documented in the R12 proposal as `WP04-SECTIONP-MONKFISH-20261012-S01` and `S03`; retain those archive IDs rather than inventing new claims or IDs for the same URLs. The proposed R404 source prefix and both new Azuma source URLs were checked against the ledger and proposal/batch archive and are unused. [R01]

## Phrase-first picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches across bilingual names, aliases, and attached forms are returned before substring fallback. The hypothetical row has the two reviewed display names and only `ankimo` as an alias.

| Query | Current results | With proposed row | Effect |
|---|---|---|---|
| `ankimo`; `monkfish liver`; `steamed monkfish liver`; `foie de baudroie cuit à la vapeur` | None | Steamed monkfish liver / foie de baudroie cuit à la vapeur | The intended product becomes directly searchable. |
| `monkfish`; `baudroie` | None | The same product only | The row would be the sole picker result for broad fish-name queries, while the whole-fish identity remains held. Its visible label does identify liver, but this is a query-breadth cost. |
| `liver`; `foie` | None | The same product only | A single specialist liver product could look like complete liver coverage. |
| `fish liver` | None | The same product through substring fallback | The substring in `monkfish liver` contains the searched tail `fish liver`; no `fish liver` alias is proposed. |
| `steamed` | Attiéké only | Attiéké and ankimo | A second exact-term result. |
| `cuit à la vapeur` | None | Ankimo only | This phrase becomes searchable through the French product display. |
| `monk fish`; `lotte`; `cod liver`; `foie de morue` | No monkfish result; `lotte` returns burbot; the remaining queries return none | Unchanged | Do not add `monk fish`, `lotte`, or cod-liver aliases. |
| `roe`; `caviar` | Bottarga, milt, and trout roe; finger lime and trout roe | Unchanged | Ankimo does not own roe/caviar wording and does not broaden those queries. |

The product-qualified display and alias make the exact culinary item searchable, while broad `monkfish`, `baudroie`, `liver`, and `foie` searches would expose the picker limitation. The proposal recommends the product-specific row because it does not claim a species or a universal liver identity; the narrow displayed name keeps the choice visible at selection time. If the reviewer considers those broad singleton results unacceptable, keep the product unallocated until search can separate product terms from broad word hits.

## Bundled recipe demand

The audit parsed every path in the current manifest in manifest order: **114 recipe files and 1,123 structured ingredient rows**. It checked all parsed recipe text and each ingredient row for `ankimo`, `あん肝`, `steamed monkfish liver`, `monkfish liver(s)`, `monkfish`, `monk fish`, `baudroie`, `foie de baudroie`, `foie de baudroie cuit à la vapeur`, `foie de lotte`, `fish liver`, *Lophius*, *L. americanus*, and *L. piscatorius*. There were **zero matching files and zero matching ingredient rows**. The manifest-ordered corpus digest (each manifest-relative path, NUL, exact file bytes, NUL) is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. [R01]

Azuma's external Ankimo Ramen page is product-matched context, not a bundled recipe or recipe-link request. Do not attach the external recipe to a bundled row or fabricate a recipe relationship. [S02]

## Measurement, forms, and substitution evidence

- **Source-specific quantity evidence:** Azuma's two-serving Ankimo Ramen lists **20 g** ankimo in the broth and **2 slices** of steamed ankimo as a topping. If accepted, record exactly one two-serving, recipe-specific `portion_weight` observation for the 20 g broth amount, with S02 as its source and `measurementState: researched_supported` limited to that observation. Do not divide it into a per-person amount or treat it as a generally preferred portion. Keep the two-slice topping as unweighted recipe text; do not infer a slice mass or add a second measurement observation. [S02]
- **Package evidence:** Product 63142's page says `15 pieces / 190 g / case`, but does not unambiguously state whether 190 g is a piece, inner pack, or case amount. Preserve that wording as product-specific source text only; it is not a household measure, count-to-mass conversion, serving, edible yield, or package-yield observation. Do not resolve the ambiguity or convert the package statement. The frozen shelf-life statement is SKU-specific and does not create a general storage rule. [S01]
- **Forms and transformations:** Add no `IngredientForm`. The candidate is already the named steamed liver product; do not attach steaming, freezing, salting, or thawing as reusable states to a hypothetical generic monkfish reference. No source supports raw-to-steamed conversion or general cooking guidance.
- **Density and unit mappings:** No volume amount, mass-volume relationship, density, or reusable count mapping is supported. Set `defaultDensity` to `null` and `unitMappings` to `[]` if integrated.
- **Yields and conversions:** No organ edible-yield factor, cleaning loss, drained mass, cooked yield, or package conversion is supported. Add none.
- **Substitutions:** Neither the Azuma product page nor its checked Ankimo Ramen recipe lists a substitute. This is only an observation about those two sources: no focused substitution-source review was conducted, and the complete bundled-recipe scan found no ankimo occurrence. Keep `substitutionResearchState` as `not_yet_researched`; do not record `researched_no_supported_substitute`. No global or contextual substitution rule or recipe-line substitution link is supported now. Leave possible replacements and their method/quantity compatibility unreviewed.

## Proposed reference and ledger disposition

If accepted, add only this product-level identity row:

```json
{
  "id": "ingredient-ref-steamed-monkfish-liver",
  "nameEn": "steamed monkfish liver",
  "nameFr": "foie de baudroie cuit à la vapeur",
  "aliasesEn": ["ankimo"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

Use a matching identity ledger record with no species/taxon assignment. Preserve Azuma's product names, ingredient list, and package statement as SKU-specific source evidence. Set `measurementState` to `researched_supported` for the single source-specific 20 g broth observation below only; the `2 slices` topping remains unweighted and the package statement remains non-convertible. This state does not imply a general serving size, recipe linkage, active measure, or runtime conversion. Set `substitutionResearchState` to `not_yet_researched`: the checked Azuma pages do not list a replacement, but they do not amount to a focused substitution review. No form, legacy mapping, recipe link, package yield, density, unit mapping, active measure, conversion, edible yield, or substitution rule is proposed. The whole-monkfish species hold remains in place.

If accepted, append this one observation to the product identity's research-ledger record:

```json
{
  "measurementState": "researched_supported",
  "measurementObservations": [
    {
      "observationId": "azuma-ankimo-ramen-broth-20g-two-servings-r404",
      "relationship": "portion_weight",
      "value": 20,
      "valueUnit": "g",
      "foodDescription": "Ankimo as named in Azuma Foods (Canada)'s Ankimo Ramen recipe; the recipe does not identify a product SKU.",
      "foodState": "Recipe-listed ankimo in broth; the recipe does not specify handling state.",
      "measurementMethod": "Azuma's two-serving recipe lists 20 g ankimo for the broth.",
      "quantityBasis": "One source-listed amount for the complete two-serving Ankimo Ramen recipe only; not a per-person amount or general ankimo portion.",
      "sourceQuantity": { "amount": 2, "unit": "servings" },
      "observedMassG": 20,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP04-SECTIONP-ANKIMO-R404-20261017-S02"]
    }
  ]
}
```

The ledger status applies only to this supported, recipe-specific observation. Do not add the topping as a weighted observation. Keep `defaultDensity` null and `unitMappings` empty; do not add any active measure, package-yield observation, recipe-line link, or runtime conversion.

## Source register and limits

Sources were accessed or rechecked on 2026-10-17. New source IDs below are proposal-local and were not written to the shared ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ANKIMO-R404-20261017-S01** | Azuma Foods (Canada), [Ankimo / Steamed Monkfish Liver](https://azumafoods.ca/products/ankimo/), product 63142. | Manufacturer page pairs `Ankimo`, `Steamed Monkfish Liver`, and `Foie de baudroie cuit à la vapeur`; lists monkfish liver and salt as main ingredients, a frozen shelf-life statement, and `15 pieces / 190 g / case`. It gives no scientific species, harvest origin, ingredient percentages, preparation instructions, per-piece mass, or clear case-vs-inner-pack mass basis. Direct product evidence; not a Québec retailer-stock guarantee. |
| **WP04-SECTIONP-ANKIMO-R404-20261017-S02** | Azuma Foods (Canada), [Ankimo (Monkfish Liver) Ramen](https://azumafoods.ca/menu/ankimo-monkfish-liver-ramen/), serves 2. | Manufacturer recipe uses 20 g ankimo in broth and lists 2 slices of steamed ankimo as topping. These quantities belong to this external recipe; two slices have no mass. The page lists no substitute, which is only a page-level observation and not a focused substitution review or evidence that no supported substitute exists. |
| **Reused `WP04-SECTIONP-MONKFISH-20261012-S01`** | OQLF GDT, [baudroie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198872/baudroie), updated 2011. | Prefers Québec `baudroie`, gives English `monk fish` and *Lophius* sp., and says *L. piscatorius* and *L. americanus* may occur in commerce. It supports French terminology and species-neutral market scope, not the Azuma SKU's taxon. ID is reused from the archived whole-monkfish proposal. |
| **Reused `WP04-SECTIONP-BURBOT-IDENTITY-20261012-S02`** | OQLF GDT, [lotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198860/lotte), updated 2011. | Gives Québec `lotte`, English `burbot`, and *Lota lota*; notes French usage of `lotte` for `baudroie` but that is not the Québec species identity. Supports keeping `foie de lotte` off this row. Already registered on `ingredient-ref-burbot`; reuse the existing source ID. |
| **Reused `WP04-SECTIONP-MONKFISH-20261012-S03`** | Fisheries and Oceans Canada, [Monkfish](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/monkfish-baudroie-amerique-eng.html). | Identifies *Lophius americanus* as one Canadian monkfish species. The profile does not identify the manufacturer product's species, liver, or package. Reused from the archived whole-monkfish proposal only as taxonomic context. |
| **WP04-SECTIONP-ANKIMO-R404-20261017-R01** | Current Section P plan, active references/forms, legacy-import candidates, research ledger, proposal/batch archive, and manifest-listed recipe package. | Read-only exact-key, archive/source-ID, picker-projection, and complete corpus audit against the snapshot counts, hashes, and 114-file/1,123-row corpus above. Repository evidence only; it does not establish product availability outside the linked manufacturer page or demand outside the bundled recipes. |

## Final disposition

**Advance one identity-only prepared-product reference for steamed monkfish liver / foie de baudroie cuit à la vapeur, with `ankimo` as the only alias, plus one ledger-only `portion_weight` observation for 20 g in the full two-serving Azuma ramen recipe.** Keep it species-neutral, keep `lotte` with freshwater burbot, and preserve the whole-monkfish species hold. The observation's `researched_supported` measurement state applies only to that source-specific recipe quantity; no active measure or runtime conversion follows. Keep the two-slice topping unweighted and the ambiguous package statement non-convertible. The broad-query singleton effects are material and should be reviewed with the proposed row. Section P remains open; this proposal changes no shared data and runs no tests.
