# WP02 B2 — Kudzu starch botanical-scope review (R73)

- **Status:** Integrated R73; the existing kudzu ledger record now includes this bounded nomenclature crosswalk. Active catalog data is unchanged.
- **Scope:** Resolve the botanical nomenclature behind an official Japanese food-table entry for kudzu starch and determine whether that evidence supports changing the existing identity's scope. This review does not reopen the accepted `kudzu flour` alias, the separate whole-root-powder boundary, water-chestnut decisions, or any arrowroot alias decision.
- **Proposed source IDs:** `WP02-B2-KUDZU-BOTANICAL-20261013-S01` through `S04`. This prefix was checked against the current research ledger, proposal archive, and batch archive; no collision was found.
- **Disposition:** Keep `ingredient-ref-kudzu-starch` and all current displays, aliases, numeric fields, and recipe links unchanged. Add a ledger-only taxonomic crosswalk for the MEXT food-table item; retain the overall ledger identity state as `needs_clarification` because the named species scope of the full commercial class is still unresolved.

## Decision

Japan's current Food Composition Database calls food item 02029 “kudzu starch” and gives its scientific name as *Pueraria lobata*. Kew's current Plants of the World Online treats *Pueraria montana* var. *lobata* as the accepted name and lists *P. lobata* (Willd.) Ohwi as a homotypic synonym. The older and accepted names therefore refer to the same botanical variety for this MEXT item. Kew also lists three accepted varieties under *P. montana* (var. *lobata*, var. *montana*, and var. *thomsonii*), so a source naming the species *P. montana* alone does not identify var. *lobata*.

This resolves the nomenclature bridge for the exact MEXT food-table entry; it does **not** establish that every food product sold or described as kudzu starch, kuzu starch, or kouzou is made from var. *lobata*. OQLF defines `kouzou` as a food starch extracted from a wild perennial root but supplies no Latin name. Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) describes Yoshino Hon-kuzu as starch extracted and refined from kudzu roots, but it gives no Latin name. The Government of Québec uses `Kudzu` in both language fields and identifies the plant at species rank as *Pueraria montana*; that flora page is botanical and regulatory information, not a starch product label.

**Integrated ledger outcome:** A bounded accepted decision and the new Kew, MEXT, and Québec sources were added to the existing `ingredient-ref-kudzu-starch` record, explaining that *P. lobata* in MEXT item 02029 maps to accepted *P. montana* var. *lobata*. `identityState: needs_clarification` remains because the taxon for the broad active commercial identity is still not settled by the generic OQLF and MAFF descriptions. The active identity remains source-neutral, and the scientific synonym is not a picker alias.

## Current ownership and prior review boundary

| Surface | Current owner/state | R73 finding |
|---|---|---|
| Active reference | `ingredient-ref-kudzu-starch`; EN `kudzu starch`; FR `kouzou`; category `FLOUR_AND_STARCH`; EN aliases `kudzu flour`, `kuzu starch`; no FR aliases; `defaultDensity: null`; `unitMappings: []`. | One accepted extracted-starch identity. Preserve this row exactly. |
| Ingredient forms | 102 active forms total; no form refers to `ingredient-ref-kudzu-starch`, `kudzu`, `kuzu`, or `kouzou`. | Add no form. A botanical taxon is not a culinary preparation form. |
| Legacy candidates | 63 candidates in `docs/catalog/legacy-import-identities.v1.json`; no kudzu/kuzu/kouzou/Pueraria match. | No legacy owner or collision. |
| Research ledger | Existing `ingredient-ref-kudzu-starch`: `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, `substitutionResearchState: researched_no_supported_substitute`; prior accepted decisions cover the extracted-starch identity and exact English `kudzu flour` alias, while an unresolved decision keeps whole-root powder distinct. | Added the scoped taxonomic crosswalk while preserving the existing overall state and prior decisions. |
| Prior review | [Regional-starches residual review](./wp02-b2-b3-regional-starches-residual-gap-review-20261010.md) and [water-chestnut/kudzu-flour review](./wp02-water-chestnut-kudzu-flour-review-20261010.md) explicitly left the active kudzu starch's botanical scope unresolved. | This is the open B2 botanical-scope subitem; prior alias and product-boundary decisions remain closed. |

The current reference search index uses display names and aliases, preferring complete word-phrase matches and then falling back to substring matching. Its projected results are:

| Query | Current result |
|---|---|
| `kudzu starch`, `kudzu flour`, `kuzu starch`, `kouzou` | `ingredient-ref-kudzu-starch` only |
| `kudzu`, `kuzu` | `ingredient-ref-kudzu-starch` only, through a complete word match in its existing terms |
| `kuzu flour`, `Japanese arrowroot` | No match |
| `Pueraria lobata`, `Pueraria montana`, `Pueraria montana var. lobata` | No match |

No active search terms change under this proposal. Do not add the scientific names as aliases; the accepted synonymy is ledger taxonomy evidence, not user-facing food-name equivalence. Preserve `Japanese arrowroot` as inactive under the existing arrowroot/kudzu boundary.

## Québec French and product scope

The existing French display `kouzou` has direct OQLF support in the food-starch/fécule domain. The entry defines it as starch extracted from a wild perennial root and notes culinary use in sauces and desserts; it does not name a species. This gives high confidence in the existing Québec French display as a term, but no new species-qualified French product name follows from the taxonomy crosswalk.

The Government of Québec's flora page lists `Kudzu` as both French and English common name for the plant and gives *Pueraria montana* at species rank. This supports a local plant name, not a French label for a starch. No Canadian or Québec product listing was reviewed or newly verified in this botanical-only pass. Keep `amidon de kudzu`, `fécule de Pueraria`, and species-qualified French compounds out of the active aliases unless a food-product or Québec terminology source supports them.

MAFF establishes a human-food product boundary for its Yoshino Hon-kuzu example: kudzu root is ground, washed and settled repeatedly to isolate starch, then the starch is dried. The page calls the resulting edible powder `kuzu-ko` and identifies Yoshino Hon-kuzu as a product made from 100% pure kudzu starch. This is clear food-use evidence for that named product, not a botanical specification for all commercial kudzu starch.

## Bundled recipe demand

The live package has 114 recipe files and 1,123 ingredient rows. A case-insensitive scan of the complete recipe JSON payloads found no `kudzu`, `kuzu`, `kouzou`, or `Pueraria` occurrence and no recipe ingredient linked to this identity. No bundled demand requires a form, alias, measure, or substitution update.

## Numeric and substitution limits

- MEXT's food-composition entry reports a food-table sample of kudzu starch at 13.9 g water and 85.6 g starch per 100 g edible portion. These are composition values, not bulk density, a household measure, or a volume-to-mass conversion. They should not be transferred to `defaultDensity` or `unitMappings`.
- MAFF gives a source-specific kuzuyu recipe using 25 g Hon-kuzu with 180 cc plus 5 tablespoons of hot water, yielding one cup. That is a finished-drink recipe quantity for the named Hon-kuzu preparation, not a starch cup mass, a density, or a reusable conversion.
- MAFF says the product can be used as a thickener, but provides no ratio or specific ingredient replacement. The existing ledger already records no supported reusable measure or substitute. Keep density null, mappings empty, and substitution behavior unchanged.

## Integrated data disposition

| Data surface | Integrated disposition | Change from the reviewed snapshot |
|---|---|---|
| Active catalog reference | Keep `ingredient-ref-kudzu-starch` as `kudzu starch / kouzou`, preserve `kudzu flour` and `kuzu starch`, and keep all other aliases absent. | None |
| Forms, recipes, conversion and substitution data | Add no forms, recipe links, measurements, density, unit mappings, yield, conversion, or substitution. | None |
| Research ledger | Four sources and a scoped decision crosswalking MEXT item 02029's *P. lobata* name to Kew's accepted *P. montana* var. *lobata* were added. The broad identity remains `needs_clarification` because OQLF and MAFF do not identify a species and Kew recognizes other varieties under *P. montana*. | Ledger-only evidence/decision update; measurement and substitution states are unchanged. |

Integration changed only `docs/catalog/research-ledger.v1.json`: four sources and one accepted decision were added to the existing record. No reference, form, picker term, measurement, conversion, yield, recipe link, or substitution changed. The broader B2 checklist remains open.

## Source register

Sources accessed 2026-10-13. The source IDs below are proposal-local and were checked for collision.

- **S01 — Kew, [*Pueraria montana* var. *lobata*](https://powo.science.kew.org/taxon/967441-1), Plants of the World Online.** Kew accepts var. *lobata*, nests it under *P. montana*, and lists *Pueraria lobata* (Willd.) Ohwi as a homotypic synonym. **Limit:** plant taxonomy; it does not define the plant source of every food product sold as kudzu starch.
- **S02 — Kew, [*Pueraria montana*](https://powo.science.kew.org/taxon/516708-1), Plants of the World Online.** Kew lists three accepted infraspecific varieties, including var. *lobata*. **Limit:** species-level naming alone does not identify the variety used in a food product.
- **S03 — Japan Ministry of Education, Culture, Sports, Science and Technology (MEXT), [Food Composition Database item 02029: kudzu starch](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=2_02029_7&MODE=7), source noted as the Standard Tables of Food Composition in Japan, 2023 edition supplement.** The item is classified as starch/kudzu starch and names *Pueraria lobata*; it reports composition values per 100 g edible portion. **Limit:** the scientific name applies to this table item; the nutrient values do not establish density, measures, conversions, or substitutions.
- **S04 — Gouvernement du Québec, [Kudzu flora page](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/flore/fiches-especes-floristiques/kudzu).** Uses `Kudzu` in both French and English common-name fields and gives *Pueraria montana* as the scientific name. It also states that sale of the plant and cultivation for propagation are prohibited in Québec. **Limit:** botanical/regulatory plant information, not a processed-food label or a variety-level food source; it makes no claim about finished extracted starch.
- **Existing context — OQLF, [kouzou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17566111/kouzou).** Food-starch entry; definition is extracted starch from a wild perennial root; source attribution is Fondation Est-Ouest de Toulouse, 1985. **Limit:** no Latin species or English synonym.
- **Existing context — Japan MAFF, [Yoshino Hon-kuzu, Kuzumochi](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/yoshino_hon_kuzu_kuzumochi.html).** Describes the extracted, washed, refined, dried edible root starch and a source-specific kuzuyu recipe. **Limit:** does not provide a Latin taxon or a reusable measure/conversion.
