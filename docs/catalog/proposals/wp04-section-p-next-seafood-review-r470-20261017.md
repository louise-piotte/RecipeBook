# WP04 Section P R470 — breaded calamari rings product review

- **Review and source-access date:** 2026-10-17.
- **Checklist context:** Section P shellfish and seafood product boundaries remain open. The current plan also keeps broader preserved and prepared seafood review open.
- **Scope:** Canadian and Québec market products sold as breaded calamari/squid rings. This is a product identity review, separate from the existing cut-only `calamari rings / rondelles de calmar` form.
- **Recommendation:** Add identity-only **`breaded calamari rings / rondelles de calmar panées`** as `ingredient-ref-breaded-calamari-rings`, category `PROTEIN`. Keep species, breading formula, storage state, and pre-cooking state unspecified. Add no forms, numeric behavior, recipe links, conversions, yields, or substitutions.
- **Status:** Integrated on 2026-10-17. The shared reference catalog and research ledger now contain the accepted identity-only row; the generated picker index, Section P checklist, roadmap, workflow, and integration record were updated. No recipe files changed.

## Candidate boundary and recent decisions

The active `ingredient-ref-calamari` already has a cut-only `ingredient-form-calamari-rings`. R368 linked only recipe `023#1` to that form and explicitly left breading, cooking, and frozen state outside its definition. Its Québec product source distinguishes unbreaded calamari rings from a separate breaded frozen product. This review takes up that product boundary; it does not revise the R368 form or its recipe link.

The recent shrimp and crustacean decisions remain separate. R459 added generic breaded shrimp, R467 held shrimp crackers, and R463 held salmon jerky; none allocates a squid or calamari product. R438/R441/R444 cover other shrimp preparations, and the crab-cake, crab-claw, crab-leg, and lobster-claw decisions are not reopened. R160’s calamari-in-marinara hold and the dried-squid and squid-shiokara holds concern other products. No focused breaded-calamari-ring decision was found. R368 mentions the product only to distinguish breading from a cut-only form.

The proposed identity is limited to marketed **breaded rings**. Do not fold in breaded ring-and-tentacle mixes, whole or tentacled calamari, salt-and-pepper products, generic fried calamari, tempura, or the raw calamari ring form. The reviewed labels vary in product composition and cooking state, so this row describes a market product group rather than a common ingredient formula or preparation protocol.

## Proposed catalog row

If accepted, use this identity-only row:

```json
{
  "id": "ingredient-ref-breaded-calamari-rings",
  "nameEn": "breaded calamari rings",
  "nameFr": "rondelles de calmar panées",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The English display is supported by the Canadian Toppits product page; the Québec retailer’s product wording supports the French display. Keep `frozen` and `surgelées` product-specific rather than placing them in the global display or aliases. Do not add the unqualified terms `calamari rings`, `squid rings`, or `rondelles de calmar` as aliases: the current ring-cut form already owns those qualified shape queries. Do not add a generic `breaded squid` alias; the product evidence is ring-specific.

## Ownership, allocation, and snapshot audit

The read-only audit covered active references and forms, legacy-import candidates, the research ledger and its source IDs/URLs, package yields, unit conversions, both substitution-rule files, relevant Section P proposals and integration records, the current search implementation, and the complete manifest-listed recipe corpus. Counts in the following table are the pre-integration snapshot read on 2026-10-17.

| Surface | Pre-integration snapshot | Integrated handling |
|---|---|---|
| Active catalog | **1,752 references** and **141 forms**. No exact normalized owner existed for `breaded calamari rings`, `rondelles de calmar panées`, or `ingredient-ref-breaded-calamari-rings`. | Added only the new product identity; breading was not attached to the raw calamari identity or its ring form. |
| Existing calamari owner | `ingredient-ref-calamari` is `calamari / calmar`, with English alias `squid`. Its only form is `ingredient-form-calamari-rings`, labeled `calamari rings / rondelles de calmar` with `squid rings` as an English match term. The reference has null default density and empty unit mappings. | Preserve the active identity and cut-only form unchanged. The product is distinct because breading is an added composite preparation. |
| Nearby prepared-food owners | Existing rows include breaded shrimp, breaded butterfly shrimp, popcorn shrimp, and frozen breaded fish sticks. R459 is the generic shrimp preparation; these rows do not own calamari. | Keep each identity and its aliases unchanged. Do not assign fish-stick, shrimp, or squid terms to the wrong seafood product. |
| Legacy candidates and ledger | **56** legacy candidates and **2,111** ledger records. No exact candidate, product identity, or proposed reference ID existed. The active calamari ledger record contains the OQLF source `WP04-S38`; its measurement and substitution states were `not_yet_researched`, with no measurement or substitution observations. | Added no legacy mapping; created a distinct ledger record and reused `WP04-S38` only for base `calmar / squid` terminology. |
| Source allocation | The ledger has **9,621 source entries**, **8,168 distinct source IDs**, and **6,881 distinct URLs**. The proposed R470 source prefix is unused. Toppits and High Liner URLs have no exact ledger owner. The Mayrand catalog URL was already cited by R368’s proposal-local source `WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S02`; this integration records it under that existing citation ID. | Record Toppits and High Liner under the two new R470 IDs and register the previously proposal-local Mayrand citation under its R368 ID. Reuse OQLF `WP04-S38` without duplicating it. |
| Numeric and rule data | The shared ledger has **8 unit-conversion records**. The package-yield file has **1 unrelated black-bean record**. Global and contextual substitution-rule files each have **0 rules**. No calamari-specific package yield, conversion, or substitution is recorded. | Add no measure, density, unit mapping, conversion, package yield, or substitution rule. |
| Proposal allocation | Before this review, the R470 proposal path and `ingredient-ref-breaded-calamari-rings` were unused; the proposed reference ID was unallocated in shared data. Exact product phrases had no reference, form, legacy, or ledger-record owner. | Allocated the identity and three source entries to the shared catalog and ledger after review. |

These counts are a repository snapshot taken before R470 integration on 2026-10-17 and may differ from the current live catalog after other reviews integrate. The accepted R459 breaded-shrimp row is not an exact owner or alias for calamari.

## Picker projection

Projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases match first; substring fallback runs only if no complete phrase is found. Attached form phrases are projected onto their parent reference, and an exact form query returns the parent with its form hint. The projection uses the proposed display pair above and no aliases.

| Query | Current results | With the proposed row | Effect |
|---|---|---|---|
| `breaded calamari rings`; `rondelles de calmar panées` | None | `ingredient-ref-breaded-calamari-rings` only | Adds direct, product-qualified searches. |
| `calamari`; `calmar` | `ingredient-ref-calamari` | `ingredient-ref-calamari` plus the proposed row | These broader terms show both the raw calamari identity and the prepared product. |
| `squid` | `ingredient-ref-calamari` | `ingredient-ref-calamari` | The proposed display pair contains no `squid` term, so this existing English alias remains on the current owner. |
| `calamari rings`; `squid rings`; `rondelles de calmar` | `ingredient-ref-calamari`, with the ring-cut form | Same parent result with the same form hint | Exact queries continue to select the cut-only form; breaded intent requires the breaded qualifier. |
| `breaded` | Four current product results, including breaded shrimp and breaded fish sticks | Those four plus breaded calamari rings | Adds one relevant product to an existing multi-result preparation query. |
| `rings`; `rondelles` | `ingredient-ref-calamari` | `ingredient-ref-calamari` plus the proposed row | Shape-only search gains a second, correctly labeled option. |
| `calmars` | No result | No result | No plural-only French alias is added that would make a broad query point only to this product. |

The new row makes `calamari`, `calmar`, `breaded`, `rings`, and `rondelles` return multiple relevant results. The `squid` query remains on the existing calamari reference because no `squid` alias is proposed. Exact unbreaded ring queries continue to return the existing calamari form because exact-form lookup takes precedence; the qualified breaded phrase leads to the prepared product.

## Recipe demand across the complete bundle

The scan parsed all **114** files listed in `manifest.v1.json` and all **1,123** ingredient rows. It checked full recipe JSON documents and structured rows for the proposed English/French product phrases and related spellings. There are **zero ingredient rows** requesting breaded or frozen breaded calamari rings and no recipe-reference link to a prepared calamari product.

Recipe 023 is the one relevant recipe, not a purchased-product request. Its English description says “Panko-crusted calamari rings”; its French description says `Des rondelles de calamar panées au panko`. The structured ingredient row remains `140 g sliced calamari`, linked to `ingredient-ref-calamari` and `ingredient-form-calamari-rings`. Panko, egg, milk, and flour are separate ingredients; the recipe instructions coat the plain calamari rings as a cooking step. Preserve that row and its amount. Do not relink it to the commercial breaded-ring identity, add a second calamari ingredient row, or infer that 140 g is a portion for a ready-breaded product.

This is therefore a market-name gap rather than a bundle-driven recipe link. No recipe-specific amount, measure, yield, form, or substitution is proposed.

## Forms, measures, conversions, yields, and substitutions

- **Product boundary and forms:** Keep `ingredient-form-calamari-rings` as cut shape only. Do not add a breaded form to raw calamari: breaded products contain additional ingredients, and the primary/retail pages do not establish one universal coating or heat state. The proposal is a separate prepared-food identity, with no attached forms. Keep ring-only products separate from ring-and-tentacle mixtures.
- **Measurements:** Toppits lists a 500 g retail package; Mayrand lists a 907 g SKU; High Liner Foodservice lists 20 × 227 g units in a 4.54 kg case and a nutrition panel per 100 g. These are product-specific package and label values, not a common recipe serving, ring count, mass-per-volume density, or reusable mapping. A nutrition basis of 100 g is not a count-to-mass conversion.
- **Conversions and yields:** No reviewed source gives a transferable volume-to-mass conversion, piece-to-mass relation, thawing or draining loss, edible yield, package yield, or cooking yield for the proposed identity. Do not map a recipe’s 140 g raw calamari to a commercial package or to a quantity of breaded rings.
- **Substitutions:** No recipe or product evidence validates replacing raw calamari, breaded calamari rings, ring-and-tentacle products, fish sticks, breaded shrimp, squid/cuttlefish, or another seafood product in an equal amount or recipe role. Add no global form conversion, contextual substitution, warning, or recipe-line link.

The integrated reference has null density and empty unit mappings. It has no form, reusable measure, conversion, package yield, recipe link, or substitution rule. Its ledger record uses `measurementState: researched_no_supported_value`; substitution research remains `not_yet_researched` because no recipe-scoped substitute study was established.

## Sources and limits

Sources were checked online on **2026-10-17**. Manufacturer pages describe their own products. Mayrand’s Québec catalog is a live product-listing page; its package and case formats are SKU-specific. OQLF supports the base bilingual species/product word, not a breaded-food standard. The evidence supports a bounded market product name, not one formula, species, cooking state, package, or recipe method.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-BREADED-CALAMARI-RINGS-R470-20261017-S01** | Toppits Foods / Export Packers, [Wild Caught Breaded Calamari Rings](https://www.toppits.com/toppits-breaded-calamari-rings), Canadian product page. The page names breaded calamari rings and lists its own ingredients, uncooked/oven-ready state, cooking directions, and 500 g pack. | One branded retail product; its ingredients, state, instructions, and package do not define all breaded-ring products. The page lists Ontario retail availability only; no Québec availability is inferred. |
| **WP04-SECTIONP-BREADED-CALAMARI-RINGS-R470-20261017-S02** | High Liner Foodservice Canada, [DIP’T & DUSTED Southern Style Breaded Calamari, Squid Rings and Tentacles](https://www.highlinerfoodservice.com/en-CA/products/breaded/da8132b2-1a23-49cd-ab0d-b76a9beba4f1/high-liner-foodservice-454-kg-10-lb-dipt-dusted-southern-style-breaded-calamari-squid-rings-and-tentacles-uncooked-20-x-227-g-8-oz), product code 12300294. The current Canadian supplier page identifies a breaded uncooked product containing rings and tentacles, lists its ingredient declaration, and provides a nutrition panel per 100 g. | A foodservice product with mixed cuts; it is not proposed as the ring-only identity. Its case pack and nutrition panel are product-specific and establish no kitchen measure or conversion. |
| **Reused `WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S02`** | Mayrand, [Calamar surgelé](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/calamar-surgele), current Québec catalog. It lists both unbreaded `Rondelles de calmar` and `Rondelles de calmar panées surgelées`, as well as other distinct breaded/pre-fried calamari products. | R368 cited this exact URL as proposal-local evidence; R470 registered it under the same source ID on the breaded-calamari ledger record. The current page’s SKU sizes and product distinctions do not create a generic form or reusable quantity. |
| **Reused `WP04-S38`** | Office québécois de la langue française, [calmar (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), last updated 1998. Preferred Québec term `calmar`; English equivalent `squid`. | Base mollusc terminology only; it does not endorse a breaded product label, cut form, or product-state equivalence. This URL and source ID already belong to `ingredient-ref-calamari`. |
| **WP04-SECTIONP-BREADED-CALAMARI-RINGS-R470-20261017-R01** | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt), live references/forms/legacy/ledger and package-yield/substitution files, relevant proposal/integration archive, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and every manifest-listed recipe. | Repository snapshot only; it records exact ownership/source allocation, picker projection, and 114-file / 1,123-row recipe coverage. It adds no external product claim. |

## Disposition

Integrated identity-only **`breaded calamari rings / rondelles de calmar panées`** as `ingredient-ref-breaded-calamari-rings` in `PROTEIN`, with no aliases. The Canadian manufacturer and Québec retailer evidence support the bounded market name. The existing `ingredient-form-calamari-rings` remains cut shape only. Exact breaded-product queries resolve to the new identity; exact unbreaded ring queries still return the existing calamari reference with its ring-cut form. Broader `calamari` and `calmar` searches show both identities, while `squid` remains on the existing raw identity. Recipe 023’s 140 g ingredient row is still raw calamari and remains unchanged.

No forms, measures, density, unit mappings, conversions, package yields, recipe links, or substitutions were added. Static package normalization, generated-index freshness, ledger schema and source ownership, picker projection, full recipe scan, encoding, local links, and whitespace checks passed. No software tests, build, emulator run, or deployment were performed for this database-JSON addition under `AGENTS.md`.

Post-integration snapshot: 1,753 ingredient references / 141 forms; 2,112 ledger records / 9,624 source entries / 8,171 distinct source IDs / 6,884 distinct source URLs; 114 recipes / 1,123 ingredient rows.
