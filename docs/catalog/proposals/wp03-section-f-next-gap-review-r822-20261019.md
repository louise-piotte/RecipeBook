# WP03 Section F R822 — generic couscous CNF 2015 measurement evidence

- **Reviewed:** 2026-10-19.
- **Target:** Existing `ingredient-ref-couscous`, displayed as `couscous / couscous` and scoped to the OQLF-defined durum-semolina product.
- **Recommendation:** Record five historical Health Canada CNF 2015 volume portions and the Food Code 4420 “amount to make 125 mL” relation on the existing generic couscous ledger record. Set only `measurementState` to `researched_supported` for these edition- and code-specific observations; keep the CNF 2026 row review open.
- **Write scope:** Proposal only. If accepted, add sources, measurement observations, and one measurement decision to the existing research-ledger JSON record. Do not change active references, forms, aliases, density, unit mappings, runtime conversions, recipes, package yields, substitutions, or the generated search index.

## Open checklist and distinction from recent work

The live Section F parent remains open for additional grain and cereal identity/terminology work, including farro species and flour boundaries, pearled hominy, pozole corn, and other unresolved grain products ([plan, line 564](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)). R822 fills a separate measurement-evidence gap on an existing grain identity.

This does not repeat R813’s hold on a generic dry-millet form, R816’s Froot Loops GTIN portions, or R819’s Frosted Flakes label portion. Those reviews concern a species-qualified millet state or brand-specific ready-to-eat cereals; this proposal concerns historical CNF portions attached to the plain couscous product. No new couscous identity or terminology is proposed.

## Identity and measurement evidence

The existing bilingual identity is well-scoped for this measurement review. The OQLF’s [couscous entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous) lists the preferred French term and English equivalent as “couscous,” defines the food ingredient as agglomerated durum-wheat semolina grains that are steamed and dried, and notes that couscous also names the prepared dish. The entry was last updated in 2009; its current online wording supports Québec naming and product-versus-dish scope, not preparation instructions or measures. The existing ledger record already owns this identity evidence.

The [Codex Standard for Couscous CXS 202-1995](https://www.fao.org/input/download/standards/65/CXS_202e.pdf) defines standardized couscous as a durum-wheat-semolina product physically treated through processes such as cooking and drying. It corroborates the product boundary, but does not provide household measures, cooking instructions, a transferable preparation yield, or substitution guidance.

Health Canada’s bilingual 2015 CNF serving pages publish two different food states:

| CNF 2015 food code | Bilingual source food name | Published available serving sizes | Page detail date |
|---|---|---|---|
| **4420** | “Grains, couscous, dry” / “Grains céréaliers, couscous, sec” | 100 mL = 73.1 g; 250 mL = 182.8 g; “amount to make 125 mL” = 34.5 g; 0% refuse. | 2019-03-01 |
| **4490** | “Grains, couscous, cooked” / “Grains céréaliers, couscous, cuit” | 100 mL = 66.4 g; 125 mL = 82.9 g; 250 mL = 165.9 g; 0% refuse. | 2019-03-01 |

Sources: Health Canada [Food Code 4420, dry couscous](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4420&lang=eng&wbdisable=true) and [Food Code 4490, cooked couscous](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4490). The pages identify the CNF food codes and provide the exact English and French names and serving entries. Their published masses do not disclose a cup-filling, packing, preparation, or weighing protocol. Record the direct volume portions as historical `portion_weight` observations only; they do not establish a reusable couscous density, active unit mapping, or current package measure.

### Direction of the “amount to make” entry

The 4420 page separately lists “amount to make 125 mL = 34.5 g.” Health Canada’s current [Table of Reference Amounts notice](https://www.canada.ca/en/health-canada/services/food-nutrition/public-involvement-partnerships/notice-modification-update-incorporated-reference-document-nutrition-labelling-table-reference-amounts-food.html) says this declaration is used for foods sold in a format requiring further preparation. The Canadian Food Inspection Agency’s current [Nutrition Facts table guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table) explains that, where a product requires further preparation, the reference amount may be the amount of product required to prepare the reference amount of finished food; its example describes grams of powder needed to make a stated final drink volume.

The ledger schema allows a `cooking_yield` observation with the input amount in `sourceQuantity` and the produced amount in `value`/`valueUnit` (as in the existing whole-sorghum yield observation). R822 can therefore preserve this CNF statement with the correct direction: **34.5 g dry couscous input → 125 mL final prepared-product amount**. Use `relationship: cooking_yield` and `evidenceKind: published_portion`, but leave `ingredientFormId` unset. This is one Food Code 4420, CNF 2015 source-specific relation, not an active dry-to-cooked conversion. The CNF page gives no package instructions, water quantity, cooking protocol, hydration endpoint, brand, or final texture; do not infer them. It also does not say that this target is the same food or preparation represented by the separate Food Code 4490 cooked-couscous row.

Do not treat the 34.5 g entry as a 125 mL portion of dry couscous, combine it with the 4490 portions, derive ratios for other volumes, or transfer it to pearl, whole-wheat, barley, millet, Baddaz, Khoumassi, or maftool products. The 0% refuse fields and “100 grams of edible portion = 100 grams” entries are not additional kitchen measures. No density, volume conversion, or generic recipe yield should be computed from the reported portions.

### Current CNF edition

Health Canada’s current [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2026 CNF is available as relational CSV files and that the 2015 online search remains an interim access method while a more user-friendly 2026 interface is developed. The official Open Canada [CNF 2026 dataset page](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) returned 403 through the available reader, and its [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) were not accessible through that reader. No 2026 Food Name or measure-row contents were available. This proposal makes no claim that either 2015 food code remains in the 2026 file or that its serving values were carried forward. Reopen the row join after the actual current files can be inspected; keep the proposed evidence explicitly edition-specific.

## Live catalog, ledger, and source ownership

The current seed snapshot has **1,886 references** and **199 forms**. The active reference `ingredient-ref-couscous` is bilingual `couscous / couscous`, category `GRAIN_AND_CEREAL`, with no aliases, null `defaultDensity`, and empty `unitMappings`. No active ingredient form belongs to it. Its ledger record is identity-verified, has `measurementState: not_yet_researched`, and has no measurement observations. Its two existing OQLF sources and accepted decision already scope the ingredient separately from the prepared dish; keep that decision and the active row unchanged.

Other active couscous-family identities remain separately owned: Baddaz (Moroccan corn couscous), barley couscous, Keskes Khoumassi, maftool, millet couscous (thiéré), pearl couscous, and whole-wheat couscous. No source or measure should be transferred across those references.

| Proposed source | Ownership and proposed record use |
|---|---|
| **WP03-COUSCOUS-CNF-PORTIONS-R822-20261019-S01** — Health Canada, [CNF 2015 Food Code 4420](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4420&lang=eng&wbdisable=true). | The exact page URL is already cited under the separate barley-couscous ledger record as `WP03-BARLEY-COUSCOUS-R20-20261013-S06`, but has no measurement observations there. Create a new record-scoped source entry under generic couscous so observations are owned by the product named on the page; do not use Food Code 4420 as barley-couscous measurement evidence. The proposed R822 source ID is unused. Use `sourceKind: food_composition`, `accessedOn: 2026-10-19`, and locator “Bilingual food name, Food Code 4420, serving sizes, and amount to make 125 mL.” |
| **WP03-COUSCOUS-CNF-PORTIONS-R822-20261019-S02** — Health Canada, [CNF 2015 Food Code 4490](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4490). | No exact 4490 serving-page owner or measurement observation was found in the ledger. Use `sourceKind: food_composition`, `accessedOn: 2026-10-19`, and locator “Bilingual cooked-couscous food name, Food Code 4490, and available serving sizes.” |
| **WP03-COUSCOUS-CNF-PORTIONS-R822-20261019-S03** — CFIA, [Information within the Nutrition Facts table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table). | The policy page is already cited on other ledger records; add a unique record-scoped source ID only to preserve the interpretation supporting the 4420 amount-to-make observation. Use `sourceKind: other`, `accessedOn: 2026-10-19`, and locator “Serving-size declarations for foods requiring further preparation; quantity needed to prepare the reference amount of finished food.” It supports the direction of the declared amount, not any additional couscous quantity or preparation method. |

The 2026 CNF overview is contextual freshness evidence only and does not support a couscous row value. Existing generic couscous source IDs `WP03-S164` and `WP03-S165` continue to support identity and the Québec term pair; no new alias source is needed. The three proposed R822 source IDs and all six observation IDs were checked against the live ledger and proposal/batch archive; no collisions were found.

## Proposed ledger delta

On the existing `ingredient-ref-couscous` ledger record:

1. Append the three source rows listed above.
2. Append the six observations below, preserving each code and state independently. Use `valueUnit: g`, `evidenceKind: published_portion`, and the listed mass as both `value` and `observedMassG` for the five direct volume portions. Use `sourceQuantity` and `observedVolumeMl` as listed. Leave `ingredientFormId` unset.

| Observation ID | Relationship and source quantity | Reported result | Food state and source scope |
|---|---|---:|---|
| **couscous-dry-cnf2015-100ml-r822-20261019** | `portion_weight`; 100 mL | 73.1 g | Food Code 4420, dry couscous; reported portion only. |
| **couscous-dry-cnf2015-250ml-r822-20261019** | `portion_weight`; 250 mL | 182.8 g | Food Code 4420, dry couscous; reported portion only. |
| **couscous-dry-to-made-125ml-cnf2015-r822-20261019** | `cooking_yield`; input `sourceQuantity: { amount: 34.5, unit: g }` | output `value: 125`, `valueUnit: mL` | Food Code 4420 “amount to make 125 mL”; input is dry product, output is the stated final prepared-product amount. No form ID or method is supplied. |
| **couscous-cooked-cnf2015-100ml-r822-20261019** | `portion_weight`; 100 mL | 66.4 g | Food Code 4490, cooked couscous; reported portion only. |
| **couscous-cooked-cnf2015-125ml-r822-20261019** | `portion_weight`; 125 mL | 82.9 g | Food Code 4490, cooked couscous; reported portion only. |
| **couscous-cooked-cnf2015-250ml-r822-20261019** | `portion_weight`; 250 mL | 165.9 g | Food Code 4490, cooked couscous; reported portion only. |

For the five `portion_weight` rows, use `foodDescription` with the full bilingual source name and code; state that the reported state is the CNF 2015 dry or cooked category; and use `measurementMethod: Published CNF 2015 serving-page portion; the volume fill and weighing protocol are not stated.` Use `quantityBasis` to restrict each value to its exact CNF food code and state, and explicitly disallow general density, universal cup conversion, current-package transfer, or cross-product transfer. Set the matching source ID to S01 or S02.

For the `cooking_yield` row, put the dry-input quantity (34.5 g) in `sourceQuantity`, the prepared target amount (125 mL) in `value`/`valueUnit`, and 125 in `observedVolumeMl`; do not put the input mass in `value` or invent an `observedMassG` for the output. Use S01 and S03 as its `sourceIds`. State in `foodState`, `measurementMethod`, and `quantityBasis` that the CNF and serving-size guidance support only this stated input/output direction, with no instructions, water quantity, or protocol. This is a ledger-only published yield relationship, not a cooking instruction or runtime conversion.

Append one accepted measurement decision citing S01–S03: accept only the five code- and state-specific CNF 2015 portions and the one directly stated Food Code 4420 “amount to make” relationship; keep CNF 2026 row inspection open. Set only `measurementState` to `researched_supported`. Keep identity verified and leave `substitutionResearchState: not_yet_researched` unchanged. The cited sources do not establish a recipe-tested substitute, contextual interchangeability, or replacement ratio. Add no substitution finding or rule.

## Picker projection and phrase search audit

The current `IngredientSearch.kt` gives exact form-label keys priority, then returns complete query phrases found anywhere inside a longer indexed term, and uses substring matching only if no complete phrase matches. The active couscous-family terms therefore produce these current and projected results; R822 changes ledger evidence only, so no search result or form hint changes:

| Query | Current and projected results |
|---|---|
| `couscous` | 8 distinct identities: generic couscous, Baddaz, barley couscous, Keskes Khoumassi, maftool, thiéré, pearl couscous, and whole-wheat couscous. The phrase is found inside longer product terms as well as the generic label, so this broad query is intentionally multi-result. |
| `couscous de maïs` | Baddaz only. |
| `couscous d’orge` | barley couscous only. |
| `couscous de mil` | thiéré only. |
| `couscous perlé` | pearl couscous only. |
| `couscous de blé entier` | whole-wheat couscous only. |
| `couscous sec`, `couscous dry`, `dry couscous`, `couscous cuit`, or `cooked couscous` | No result; this proposal adds no preparation form, label, or alias. |
| Broad `sec` / `dry` / `cuit` / `cooked` | 9 / 13 / 11 / 14 results respectively; unchanged, with no new generic couscous match terms. |

No alias or form search terms are proposed. In particular, do not add broad `dry`, `sec`, `cooked`, or `cuit` terms to generic couscous; the historical portions and yield stay in the research ledger.

## Bundled recipe demand and substitution boundary

Scanned the full manifest-listed corpus of **114 recipes** and **1,123 structured ingredient rows**, including names, descriptions, instructions, ingredient text, and reference links. There are no structured ingredient rows containing couscous wording and no links to `ingredient-ref-couscous`. One file, recipe 018 [Turkey Meatballs](../../../app/src/main/assets/seed/bundled-library/recipes/018-boulette-de-dinde-turkey-meatballs-43199cff-7fba-4cd0-8447-2c7265b0bb1c.v1.json), mentions couscous in English and French as an optional accompaniment (“serve over couscous, quinoa, or salad greens”). This is qualitative serving-suggestion demand, not an ingredient-line quantity or form selection.

Identity, measurement, and substitution remain separate. The reviewed OQLF, Codex, and CNF sources address the product, terminology, food codes, and measurements; they give no replacement ratios or recipe-tested substitutions. The existing recipe’s alternative serving suggestions do not establish that quinoa can replace couscous in a recipe line or in every serving context. Leave substitution research at `not_yet_researched`, add no rule or finding, and do not transfer a measure or yield to quinoa, bulgur, rice, pearl couscous, or the other couscous-family products.

## Static disposition and test rule

The live identity, form, ledger, related couscous products, source owners, phrase-first search behavior, and manifest recipe corpus were checked. The proposal changes no shared file. If accepted integration only adds research-ledger JSON data, the user-provided `AGENTS.md` explicitly says no software testing is needed; do not run app tests, a build, emulator, or deployment for that JSON-only change. Static ledger/source/ID validation is appropriate at integration.
