# WP03 Section F — cooked quinoa portion evidence review (2026-10-12)

## Packet record

- **Status:** proposal review partially integrated on 2026-10-12. The root agent added the accessible 2008 and 2015 portion observations to the existing cooked-form ledger record; review of CNF 2026 item-level rows remains open.
- **Scope:** portion evidence for the existing generic cooked-quinoa form only.
- **Open work:** the Section F plan still leaves dry/cooked grain measurement questions open where a recipe or evidence needs them; cooking yield is a separate relation ([plan, line 2119](../../RecipeBook-global-ingredient-catalog-plan.txt#L2212)).
- **Decision:** retain four source-version-specific cooked-quinoa portion observations in the research ledger under the existing cooked form. Leave `measurementState` as `not_yet_researched` because Health Canada now identifies CNF 2026 as the current relational dataset, and its item-level quinoa rows have not been verified. Keep active density, unit mappings, conversions, yield, and substitution data empty.
- **Recipe handling:** leave recipe 016#1 linked to the existing quinoa reference and cooked form. Preserve its exact quantity, unit, and wording.

This is a measurement review, not a new quinoa identity or form proposal. It does not reopen quinoa’s established Québec display or change its aliases.

### Integration update

The 2015 CNF portions and the 2008 household portion are now present as dated ledger observations.
The 125 mL values remain separate (97.7 g in the 2015 CNF; 73 g in the 2008 booklet). The Health
Canada page confirms the newer CNF 2026 relational files and says the online 2015 CNF is an interim
access method. The official 2026 CSV pages could not be fetched through the available browser tool
(403), so the plan item remains open and the ledger research state stays `not_yet_researched`.
No active measure, cooking yield, recipe edit, or app behavior was added.

## Current package snapshot

Read-only snapshot of the live split package on 2026-10-12. File hashes cover exact bytes. The ordered recipe digest hashes each manifest-relative recipe path, a NUL byte, its exact file bytes, and a trailing NUL byte.

| Artifact | Current state | SHA-256 / corpus digest |
|---|---:|---|
| Ingredient references | 1,300 references; 416,162 bytes | e8017fbccef0477fa66b70f41300e44ae79082b1a55c51e3bf3d3418913c2b07 |
| Ingredient forms | 98 forms; 73,589 bytes | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import identities | 64 candidates; 15,264 bytes | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Research ledger | 1,608 records; 5,823 source entries; 4,846 distinct source IDs; 5,726,560 bytes | e5ed17619386c80455b128f3df6b6827d68bad8cbf3a6fec389f890c048c8b1d |
| Manifest | 114 recipe paths; 12,011 bytes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |
| Generated BundledIngredientCatalog.kt | 1,300 references; 569,671 bytes | ea4935810332ce5abf52afe201d1e732ec675ac88325cf2affcda975a5b84606 |

All manifest-listed files were present in the read-only scan. The snapshot reflects the partial integration above.

## Exact-key ownership and neighboring records

The active ingredient search key normalizer folds case and accents, expands common ligatures, and treats punctuation as spacing. The audit checked exact normalized names and aliases in references, form labels and match terms, all legacy candidates, and ledger record IDs.

| Exact key | Current owner and boundary |
|---|---|
| quinoa | The only exact bilingual reference key is ingredient-ref-quinoa, displayed as quinoa / quinoa. Its alias arrays are empty, density is null, and unit mappings are empty. |
| quinoa cooked / quinoa cuit | Exact form labels belong to ingredient-form-quinoa-cooked under ingredient-ref-quinoa. Both match-term arrays are empty. No reference alias or legacy candidate owns either key. |
| quinoa dry / quinoa sec | Exact form labels belong to ingredient-form-quinoa-dry under ingredient-ref-quinoa. Both match-term arrays are empty. No reference alias or legacy candidate owns either key. |
| cooked quinoa / dry quinoa | No exact active reference or form key, alias, or legacy candidate owns these reversed word-order phrases. The recipe line is already explicitly linked to the cooked form; no search alias is proposed. |
| Measurement observation IDs below | The four observation IDs now belong to `ingredient-form-quinoa-cooked`; the relevant ledger record IDs remain ingredient-ref-quinoa, ingredient-form-quinoa-cooked, and ingredient-form-quinoa-dry. |

Adjacent active references remain separate: quinoa flakes, quinoa flour, puffed quinoa, and the white, red, black, and roasted quinoa-flour products. They have no exact ownership of the cooked-form labels or proposed portion-observation IDs.

OQLF’s current quinoa entry confirms the Québec French name quinoa and lists petit riz du Pérou and riz du Pérou as other preferred terms. The active row currently has no French aliases. This measurement packet adds none: the base and cooked-form names are already clear, and it does not reopen picker terminology.

## Recipe corpus demand

The scan covered all 114 manifest-listed recipe files and all 1,123 structured ingredient rows.

| Recipe | Exact line and fields | Finding |
|---|---|---|
| 016, Quinoa Bites, ingredient 1 | 2 cups cooked quinoa; quantity 2; unit cup; ingredientRefId ingredient-ref-quinoa; ingredientFormId ingredient-form-quinoa-cooked | The sole structured quinoa ingredient row. Preserve the existing link and quantity. |
| 018, Turkey Meatballs | Quinoa appears in serving prose, but not in a structured ingredient row. | Narrative mention only; it adds no measured ingredient demand. |

The source publisher’s current page repeats the 2 cups cooked quinoa quantity and describes cooking quinoa in 1 1/2 cups of broth, but it does not state the amount of dry quinoa that produces the recipe quantity. It also supplies no mass for the two-cup cooked amount. This does not establish a dry-to-cooked yield or a mass conversion.

## Measurement evidence and proposed ledger decision

Health Canada CNF 2015 food code 5917 identifies “Grains, quinoa, cooked / Grains céréaliers, quinoa, cuit” and lists these serving portions:

| Proposed source observation ID | Source-specific portion | Proposed ledger treatment |
|---|---:|---|
| quinoa-cooked-cnf2015-100ml-portion-20261012 | 100 mL = 78.2 g | Record only as a published portion for CNF 2015 food code 5917. |
| quinoa-cooked-cnf2015-125ml-portion-20261012 | 125 mL = 97.7 g | Record only as a published portion for CNF 2015 food code 5917. |
| quinoa-cooked-cnf2015-250ml-portion-20261012 | 250 mL = 195.5 g | Record only as a published portion for CNF 2015 food code 5917. |
| quinoa-cooked-nvscf2008-125ml-portion-20261012 | 125 mL = 73 g | Record separately as the 2008 booklet’s ready-to-eat household portion. |

For each row, use relationship `portion_weight`, ingredientFormId `ingredient-form-quinoa-cooked`, valueUnit `g`, sourceQuantity in mL, observedVolumeMl, observedMassG, and evidenceKind `published_portion`. For the three CNF rows, use a measurementMethod that identifies the CNF 2015 serving-size page and says the packing method is unstated. For the 2008 row, identify the published average household portion for ready-to-eat food and keep its method/version separate from the CNF observations. All four quantityBasis values should say that these are publication-specific portions, not a reusable conversion.

The 125 mL entries conflict: the 2015 CNF gives 97.7 g and Health Canada’s 2008 common-food booklet gives 73 g. Keep them as distinct observations with their publication/version metadata. Do not average them, choose one as the default, or turn them into a density or unit mapping.

The four historical observations are recorded on the existing ingredient-form-quinoa-cooked ledger record. Its measurement state remains `not_yet_researched` until CNF 2026's current item-level quinoa rows can be retrieved and checked. If those rows do not support one reusable measure, retain that conclusion separately from the historical numeric observations.

The proposal does not create additional forms. It leaves ingredient-ref-quinoa.defaultDensity null, ingredient-form-quinoa-cooked.densityGPerMl null, ingredient-form-quinoa-dry.densityGPerMl null, and all unitMappings empty. It adds no unit conversion, package yield, or contextual substitution. The portion pages do not specify cup semantics or packing protocol, and recipe 016 gives no mass. The two separate CNF dry/cooked food entries are not a paired cooking-yield trial.

## Source register

Sources below were opened or checked online on 2026-10-12. Existing source ID WP03-S5-COOKED-5917 is already attached to the cooked-quinoa form for the CNF 2015 state label; it is reused for the 2015 portion observations rather than duplicated.

| Source ID | Source and locator | What it supports and limits |
|---|---|---|
| WP03-QCM-20261012-S01 | Office québécois de la langue française, [quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), GDT, updated 2025. | Supports the Québec French display quinoa, the botanical distinction from cereals, and the pseudocereal classification. OQLF also lists petit riz du Pérou and riz du Pérou; this packet proposes no aliases. It gives no cooked-state portion. |
| WP03-S5-COOKED-5917 (existing; rechecked) | Health Canada, [CNF 2015 cooked quinoa, food code 5917](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917). | Directly accessible. Supports the exact bilingual cooked-state label, 100 mL = 78.2 g, 125 mL = 97.7 g, 250 mL = 195.5 g, and 0% total refuse on this 2015 CNF page. The page does not describe packing method. |
| WP03-QCM-20261012-S03 | Health Canada, [CNF 2015 dry quinoa, food code 4495](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495). | Directly accessible. Gives the separate bilingual dry-state label and dry-food portions, including 100 mL = 71.9 g and 250 mL = 179.6 g. It is a different dry food record, not a cooked-yield pairing. |
| WP03-QCM-20261012-S04 | Health Canada, [Nutrient Value of Some Common Foods, 2008](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html), introduction and Breads, Cereals and Other Grain Products table. | Directly accessible. The 2008 table lists cooked quinoa at 125 mL and 73 g. The introduction says the booklet uses reasonable average household measures for ready-to-eat food. The stated portion remains specific to that publication; it is not reconciled with the later CNF page. |
| WP03-QCM-20261012-S05 | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Directly accessible. Health Canada says CNF 2026 is published as relational CSV files and the 2015 online search remains available as an interim access measure. This page establishes the newer publication context, not quinoa’s 2026 portion values. |
| WP03-QCM-20261012-S06 | Open Government Portal, [Canadian Nutrient File, 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | The dataset and file listings are discoverable; the Open Government pages and CSVs returned 403 when opened through the web tool. No CNF 2026 quinoa row or value is claimed here. Before later integration, retrieve these rows by exact bilingual food description/code and verify their measure fields directly. |
| WP03-QCM-20261012-S07 | Eat Yourself Skinny, [Cheesy Broccoli Quinoa Bites](https://www.eatyourselfskinny.com/cheesy-broccoli-quinoa-bites/), ingredient list and cooking instructions. | Directly accessible; page updated 2026-05-07. Confirms 2 cups cooked quinoa and the recipe method, but gives no mass for the cooked amount and no dry quinoa amount or yield. It does not support a quinoa substitution. |

## Scope limits and static review steps

- Preserve the exact active displays quinoa / quinoa, quinoa, cooked / quinoa, cuit, and quinoa, dry / quinoa, sec. Keep all current aliases empty.
- Keep recipe 016#1 attached to ingredient-ref-quinoa and ingredient-form-quinoa-cooked; preserve originalText, quantity 2, and unit cup.
- Treat the proposed observations as source-version-specific ledger records only. Do not promote them into default density, unit mappings, conversions, or cooking yield.
- Before closing the measurement review, retrieve the relevant CNF 2026 Food Name and Measure Weight Conversion rows and compare the current bilingual name, code, portion amount, and mass. Record any CNF 2026 value as its own dated source observation; do not silently overwrite or merge the 2008/2015 entries.
- Recheck exact ownership across references, forms, legacy candidates, ledger records, recipe manifest, and adjacent quinoa product identities against the then-current package.
- Validate the ledger JSON/schema, bundled package, generated-catalog freshness, exact-key ownership, UTF-8/no-BOM, and whitespace after any later data integration. Under the current AGENTS.md rule, a change confined to database JSON does not require app tests or emulator checks.

The initial proposal review changed no shared data files. The subsequent partial ledger integration is documented above and in `docs/catalog/batches/wp03-section-f-cooked-quinoa-portion-integration-20261012/README.md`. No app tests or emulator checks were run because the shared change only adds research data to database JSON files.
