# WP03 Section F rye-berries evidence recheck

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** research-only proposal. This file is the only write in this batch; the shared catalog, ledger, recipe files, forms, plan, workflow, and roadmap were not changed.
- **Scope:** independently recheck the held whole-kernel rye / “rye berries” candidate. The existing [residual grain identities review](wp03-section-f-residual-grain-identities-review-20261010.md) already proposes this identity. This delta refreshes the live audit and adds source-qualified measurement and substitution findings; it does not reopen other cereal decisions.
- **Recommendation:** accept `ingredient-ref-rye-berries` for integration review as a marketed intact-kernel food-grain identity. Proposed display pair: `rye berries / grains de seigle`; English alias: `rye kernels`; French aliases: none. Keep the French display explicitly product-source-backed rather than OQLF-preferred, and obtain independent Québec French review. Add no forms, density, unit mapping, yield, conversion, recipe link, or active substitution.
- **Live snapshot inspected:** 878 active ingredient references; 48 forms; 114 manifest-listed recipe files and 1,123 ingredient rows; 1,123 research-ledger records / 2,745 source entries; 77 legacy candidates.

## Candidate boundary and naming

| Term or boundary | Disposition | Evidence and limit |
| --- | --- | --- |
| `rye berries` | Accept as the English display for food-grade whole rye kernels marketed for cooking or milling. | A Québec retailer explicitly identifies rye berries as intact rye kernels; a Canadian farm independently markets whole rye berries for cooking or milling. Treat this as a consumer product distinction, not a new rye species. |
| `rye kernels` | Add as the sole proposed English alias. | The Québec retailer directly says its rye kernels are also known as rye berries. Keep the source-attested plural phrase. |
| `grains de seigle` | Use as a provisional fr-CA display; add no French aliases. | La Milanaise, a Québec mill, sells a consumer product under “Seigle biologique” in its “Grains biologiques” section and describes it as “grains de seigle.” OQLF confirms that *seigle* denotes both the plant and the grain, but does not establish this longer phrase as the official or preferred term for rye berries. |
| `rye / seigle`, `rye grain(s)`, `grain(s) de seigle`, `whole rye`, `seigle entier`, `seigle en grains` | Do not add as aliases. | These broader or descriptive phrases do not uniquely distinguish the marketed intact-kernel product from the existing broad rye identity. Preserve the current broad rye row. |
| `seigle criblé` | Do not add as a French alias. | This appears in a Québec retailer’s product title, but one retail title does not establish a general fr-CA term for rye berries. |
| `hulled` / a hulling claim | Do not encode as a canonical qualifier or form. | The retailer describes its product as “hulled, intact kernels”; the other reviewed Canadian sources do not establish a universal hulling specification for the product class. “Intact” is the bounded product distinction; no hull-removal rule is proposed. |
| Rye flour, rye meal, malted rye flour, cracked rye, flakes, bran, sprouted rye, feed, and planting seed | Keep separate or outside this row. | The proposed identity is only the intact food-grain product; no additional rye product identity is reviewed here. |

## Proposed canonical row

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and numeric fields |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-rye-berries` | `rye berries` | `grains de seigle` | `rye kernels` | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

The French wording is directly attested in Québec food-product copy, but it is not presented as an OQLF-preferred product term. Do not add an organic qualifier, species, cultivar, `whole`, or processing qualifier to the display. Keep separate from the existing broad `rye / seigle` identity and from rye flour and rye meal.

## Current catalog, ledger, legacy, and normalized-key audit

The active references include `ingredient-ref-rye-grain` (`rye / seigle`), `ingredient-ref-rye-flour` (`rye flour / farine de seigle`), `ingredient-ref-rye-meal` (`rye meal / gruau de seigle`), and `ingredient-ref-malted-rye-flour` (`malted rye flour / farine de seigle malté`). Their aliases remain unchanged. There is no active rye-berries form.

The current ledger has no rye-berries record; its relevant rye/seigle decision is the verified `ingredient-ref-rye-grain` record. That 2026-10-06 decision excludes rye berries and grain de seigle pending product-level evidence. No separate rye-berries ledger record or rye/seigle legacy candidate exists. If integrated, add the product sources to a new or updated rye-berries ledger record and revise the old hold rationale so it no longer implies product evidence is absent. The legacy candidate list currently has 77 records and no rye/seigle candidate.

Using the application’s `normalize_search_key` rules, the proposed ID is unused and these exact keys have no matches in active reference displays/aliases or form labels/match terms:

| Candidate exact key | Active reference/form matches |
| --- | --- |
| `rye berries` | none |
| `rye kernels` | none |
| `grains de seigle` | none |

This is an exact-key result, not a claim that broad searches are unique. Searches for `rye` or `seigle` still reach neighboring rye identities, including the broad grain, flour, meal, and malted-flour rows. Rerun this audit at merge time because the live package is being updated concurrently.

## Bundled recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned, including bilingual recipe text, ingredient `originalText`, `ingredientName`, and reference IDs. Searches covered `rye`, `seigle`, `rye berry/berries`, `rye kernel/kernels`, `whole rye`, `whole-kernel rye`, `grain(s) de seigle`, `seigle en grains`, and `seigle entier`.

| Scope | Recipe files with a hit | Ingredient lines with a hit |
| --- | ---: | ---: |
| Exact product terms and broader rye/seigle terms above | 0 | 0 |

There is no bundled recipe demand or recipe link to add. Do not infer recipe demand from the manufacturer’s general serving suggestions.

## Identity, forms, measurements, yields, and substitutions

| Concern | Evidence-qualified disposition |
| --- | --- |
| **Identity** | The source-backed product is intact rye kernels sold for food use. A separate catalog identity is a consumer-search choice consistent with the existing wheat-berries pattern; it does not assert that broad rye is a different species or botanical grain. Keep flour, meal, and other processing products separate. |
| **Forms** | Add no `IngredientForm` rows. “Whole” and “intact” describe this product boundary, not a preparation-state form. The cited 8–24-hour soaking direction is recipe-use guidance for bread, not a form definition. No recipe line requires dry/cooked matching. |
| **Measurement** | USDA SR28 (2015), NDB 20062, lists `Rye grain` with one measure of **1 cup = 169 g**. Keep this only as a source-specific historical observation for the USDA rye-grain record. The source does not name “rye berries,” specify a cup-filling method, or establish a Canadian household measure; do not copy it to the proposed row or use it as a default density, mapping, or universal mass-volume conversion. The reviewed product pages supply no general rye-berries measure. Candidate-specific measurement state: `researched_no_supported_value`. |
| **Conversions and yields** | Add no density, unit mapping, package yield, soaking expansion, or dry-to-cooked yield. The USDA cup observation is not a cooking yield. La Milanaise’s soaking duration has no amount relation. |
| **Substitutions** | La Milanaise says its grains of rye can replace rice in soups or salads. This is a source-backed, dish-context suggestion, not a general or quantified substitution rule. Record, if useful, a blocked evidence finding scoped to rye grain in soups/salads with no replacement amounts; activate no global or contextual rule. Candidate substitution research should be `blocked_pending_evidence`, not treated as unresearched. |

## Online source register

All sources below were accessed on 2026-10-10. Source IDs are local to this proposal; they are not yet ledger IDs.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-RYE-RECHECK-20261010-S01` | OQLF, [seigle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle) (last updated 2018), preferred term and bilingual equivalence | Gives French `seigle` and English `rye`, and explicitly says *seigle* names both the plant and its grain. Supports the broad active identity and Québec word choice; it does not define “rye berries” or the longer phrase `grains de seigle` as a preferred product name. |
| `WP03-RYE-RECHECK-20261010-S02` | La Milanaise, [Seigle biologique](https://lamilanaise.com/produits/seigle-biologique/) | Québec manufacturer page places the consumer product under “Grains biologiques” and calls them “grains de seigle.” It says they can replace rice in soups or salads and can be used in bread after soaking 8–24 hours. It supports Québec food-use wording and a narrow contextual replacement observation; it supplies no quantity ratio, dry/cooked yield, or English “rye berries” equivalence. |
| `WP03-RYE-RECHECK-20261010-S03` | Silo EST, Sherbrooke, [Seigle Criblé Bio](https://catalogue.lesilo.co/en/T-seigle-crible-bio) | Québec retailer’s English product description says “Organic rye kernels, also known as rye berries” and describes hulled, intact kernels. It supports the English alias and intact-kernel product boundary. Do not generalize the page’s `hulled` wording or French product title to all rye berries. |
| `WP03-RYE-RECHECK-20261010-S04` | Fresh Acres, [Organic Rye Berries](https://freshacres.ca/products/organic-rye-berries) | Canadian farm describes whole, Canadian-grown rye berries for milling, sprouting, or cooking as a grain. It corroborates current Canadian product naming and use; it does not establish Québec French wording or a general volume measure. |
| `WP03-RYE-RECHECK-20261010-S05` | USDA, [National Nutrient Database for Standard Reference, Release 28, food group 20](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg20.pdf), NDB 20062 | The 2015 report labels the food `Rye grain` and records `1 cup = 169 g`. This is one source-specific portion observation, not a current app conversion, exact rye-berries equivalence, or published cup-filling method. |

## Integration recommendation and acceptance checks

Accept the intact-kernel product boundary and proposed identity for coordinator integration review. Use `ingredient-ref-rye-berries`, English display `rye berries`, provisional fr-CA display `grains de seigle`, English alias `rye kernels`, and no French aliases. Keep an independent Québec terminology review open for the French display. Do not add recipe links, forms, numeric catalog data, conversions, yields, or active substitution rules. Update the old broad-rye hold rationale if the new product record is accepted.

Before merge, check that:

1. The ID and exact normalized names remain collision-free against the live references, forms, and legacy candidates; confirm broad rye/seigle search behavior still exposes existing neighboring products.
2. The recipe audit remains at zero hits across the current manifest and ingredient lines; preserve recipe files unchanged.
3. The catalog row contains only the proposed identity, category, alias, and empty numeric fields; no form or process claim is attached.
4. The ledger cites the product-boundary sources, keeps the USDA 169 g value source-specific and out of active mappings, and records the unquantified rice-use suggestion as blocked from runtime substitution.
5. The broader Section F checklist stays open.

## Remaining Section F gaps

This rye review does not close the plan’s open Section F aggregates. Current named or summarized gaps include generic sushi rice; unqualified farro; pot/Scotch barley’s unresolved Québec display; remaining species-level millet, sorghum, fonio, quinoa, and amaranth review; generic grits and polenta; pearled hominy, pozole corn, and dried sweet corn; other puffed-grain products; regionally significant cereal mixes and preprocessed grains; dry/cooked forms where an exact recipe or measurement need remains; and independent Québec terminology review. The already integrated hominy grits, puffed wheat/quinoa/millet, popcorn, corn flakes, crispy rice cereal, puffed rice, flattened rice, and completed grain identities are not reopened here.
