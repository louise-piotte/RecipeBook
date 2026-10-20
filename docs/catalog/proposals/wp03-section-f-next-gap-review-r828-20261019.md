# WP03 Section F R828 — common-millet “amount to make” evidence

- **Reviewed:** 2026-10-19.
- **Target:** Existing `ingredient-form-common-millet-dry` under `ingredient-ref-common-millet`, for the Code 4491 dry product.
- **Recommendation:** Add two separate, ledger-only `cooking_yield` observations for CNF 2015 and CNF 2026 “amount to make 125 mL” entries: 46.0 g and 46.04 g, respectively. Record only each edition’s stated dry-product input to prepared-product volume relation. Do not compare or average the values.
- **Write scope:** Proposal only. If accepted, update the existing dry common-millet research-ledger record. Do not edit the active catalog, forms, aliases, density, mappings, conversions, recipes, or substitutions.

## Open checklist and distinction from prior reviews

The broad WP03 Section F checklist remains open for additional grain and cereal identity and terminology coverage ([plan, Section F parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)). The plan’s completed R547 child added the Code 4491 dry form and four CNF volume portions, but deliberately left both editions’ “amount to make 125ml” rows uninterpreted ([R547 checklist item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4898)). R828 addresses only that narrow, source-specific measurement gap.

This is distinct from R813’s hold on a generic dry-millet form, R822’s Code 4420 couscous measurements, and R825’s Code 4472 parboiled-rice measurements. It does not create a generic millet state, a cooked common-millet form, or another millet identity. It does not repeat R547’s already integrated volume portions.

## Identity and bilingual terminology

The active catalog already has a species-qualified `common millet / millet commun` reference. OQLF’s [millet commun entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun) gives *Panicum miliaceum*, lists `millet commun` as a preferred French term, and provides `common millet` and `proso millet` in English. The OQLF page was last updated in 2010 and describes the plant, not a dry retail grade. The existing bilingual form `common millet, dry / millet commun, sec` combines that scoped name with the CNF dry state already reviewed in R547.

CNF 2015 itself names Code 4491 `Grains, millet, dry / Grains céréaliers, millet, sec` but does not provide a scientific name. The CNF 2026 Food Name row, already captured in R547’s joined source record, identifies Code 4491 as *Panicum miliaceum*. R828 retains the established R547 ownership for both Code 4491 evidence sets; it does not claim the 2015 page independently resolves species or transfer either value to broad `millet`.

The reference already owns English aliases `chena`, `proso millet`, `barri`, `cheno`, `cheena`, `cheena millet`, and `panivaragu`; French aliases remain empty. No alias, display name, form label, or match term is proposed. Keep generic `millet / millet`, pearl millet, finger millet, foxtail millet, millet flour, and proso-millet flour distinct.

## Published entries and directional interpretation

Health Canada’s [CNF 2015 serving page for Food Code 4491](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4491) currently displays the bilingual dry-food name and `amount to make 125ml = 46.0 g`. It also displays the two volume portions already recorded by R547 and a zero-refuse row. The page’s details give a 2019-03-01 modification date. The source does not name a preparation method, water quantity, brand, hydration endpoint, or final cooked mass.

R547’s direct CNF 2026 row join recorded the Food Code 4491 type-9 Measure Weight Conversion row as Measure Code 921, value 46.04; the joined bilingual Measure Name is `amount to make 125ml / quantité requise pour préparer 125ml`, and the Measure Type is `Yield / Rendement`. Its matching Food Name row says `Grains, millet, dry / Grains céréaliers, millet, sec` and names *Panicum miliaceum*. The type-9 classification alone is ambiguous: Health Canada’s general CNF API Guide says Yield Amounts can describe yields from refuse and/or cooking losses, often for inventory use, but it does not explain the preparation basis of this particular measure. This review does not use type 9 alone to infer a cooking protocol.

The Canadian Food Inspection Agency’s current [Nutrition Facts table guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table) says that where a food requires further preparation and has no separate unprepared reference amount, the reference amount is the quantity needed to prepare the finished-product reference amount. Its iced-tea-powder example explicitly gives powder mass needed to make a specified final beverage volume. This is general nutrition-labelling guidance, not millet-specific evidence. Applying it to CNF’s exact “amount to make 125ml” wording is a narrow interpretation of direction: **dry Code 4491 input → stated 125 mL prepared-product amount**.

The CNF 2026 value comes from its already recorded official joined CSV evidence, parsed for R547 on 2026-10-17. The current [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) confirms that the 2026 file is published as relational CSVs and that the CNF 2015 search remains an interim route. During this R828 review the official 2026 CSV download links were listed by Open Government, but the browser reader returned an access error for their file contents. Therefore R828 relies on the existing R547 file hashes, joined rows, and sources; it does not claim a fresh R828 download or a new 2026 status check beyond that recorded evidence.

Preserve the editions as separate published statements. Do not infer that 46.0 g and 46.04 g are replicates, compare them as a measurement trend, or average them. Neither entry is a 125 mL dry portion, a mass for the prepared millet, a density, a reusable ratio, or an active dry-to-cooked conversion. The output is not explicitly labeled cooked; add no cooked form or recipe instruction.

## Existing catalog and source ownership

The live bundled snapshot has **1,886 ingredient references** and **199 forms**. The existing reference has null default density and empty unit mappings. Its dry form has `formCode: dry`, `prepState: dry`, no match terms, and null form density. The ledger record `ingredient-form-common-millet-dry` already has `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`; it contains R547’s four separate 2015/2026 Code 4491 `portion_weight` observations.

The ledger already owns the 2015 Code 4491 page as `WP03-CNF2015-COMMON-MILLET-4491-R547-S01`, and the four 2026 Code 4491 CSV sources as `WP03-CNF2026-COMMON-MILLET-4491-R547-S01` through `S04`. The existing 2015 source description and the 2026 Measure Weight Conversion source description state that their amount-to-make rows were excluded or left uninterpreted. If integrated, update those two existing source descriptions to record that R828 adds only a direction-level interpretation with CFIA guidance; keep the original R547 decision as historical context. Do not duplicate the CNF source IDs.

The current CFIA URL is already cited under other ledger records, so add one source ID scoped to this dry common-millet record. The proposed source ID and both observation IDs were checked against the live ledger and proposal/batch archive and are unused.

| Source | Existing or proposed owner | Evidence and limit |
|---|---|---|
| Health Canada, [CNF 2015 Food Code 4491 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4491) | Existing `WP03-CNF2015-COMMON-MILLET-4491-R547-S01` | Bilingual dry-food description and exact 46.0 g line. It does not describe method, water, or output mass; it does not give a scientific name. |
| Health Canada, [CNF 2026 Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Existing `WP03-CNF2026-COMMON-MILLET-4491-R547-S01` | Establishes bilingual Code 4491 dry name and *Panicum miliaceum* in the 2026 file. It does not establish cooking method. |
| Health Canada, [CNF 2026 Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Existing `WP03-CNF2026-COMMON-MILLET-4491-R547-S02` | Records Code 4491 Measure Code 921, value 46.04, type code 9. Its general type label does not resolve this row’s preparation basis. |
| Health Canada, [CNF 2026 Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) and [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Existing `WP03-CNF2026-COMMON-MILLET-4491-R547-S03` and `...-S04` | Join Code 921 to bilingual `amount to make 125ml / quantité requise pour préparer 125ml` and `Yield / Rendement`. The label supports the wording; the type is not a millet-specific protocol. |
| CFIA, [Information within the Nutrition Facts table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table) | Proposed `WP03-COMMON-MILLET-AMOUNT-MAKE-R828-20261019-S01` | Current general further-preparation direction and iced-tea-powder example. Supports only input-to-prepared-reference-amount direction, not millet-specific cooking or a measured result. |

The OQLF identity source `WP03-S180`, CNF overview `WP03-SECTION-F-R310-20261016-S03`, and general CNF API Guide source `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` are already recorded on the dry-form ledger record. Reuse those existing sources for their limited roles; do not add new copies. The API Guide explains broad Yield Amount semantics only and does not override the row’s bilingual “amount to make” label or supply the missing method.

## Exact proposed ledger delta

On the existing ledger record with `recordId: ingredient-form-common-millet-dry`:

1. Update the two existing source descriptions as follows. Preserve their source IDs, original access dates, file hashes, and the historical R547 decision.

   | Existing source ID | Proposed locator | Proposed supports text |
   |---|---|---|
   | `WP03-CNF2015-COMMON-MILLET-4491-R547-S01` | `Food Code 4491 bilingual dry-food name; 100 mL and 250 mL portions; “amount to make 125ml”; page details date.` | `Lists Grains, millet, dry / Grains céréaliers, millet, sec (Food Code 4491), 100 mL = 84.5 g, 250 mL = 211.3 g, and “amount to make 125ml” = 46.0 g. R547 records the two volume portions separately. R828 proposes recording 46.0 g only as input to the stated prepared-product amount, using CFIA further-preparation guidance for direction. The page does not identify species, method, water quantity, or output mass.` |
   | `WP03-CNF2026-COMMON-MILLET-4491-R547-S02` | `All five joined Food Code 4491 rows, including Measure Code 921, Measure Type Code 9, value, and row date.` | `Reports five joined Food Code 4491 measure rows. R547 records the two volume portions separately and excludes the 45 g mass-only and total-refuse rows. This source also reports Measure Code 921, type code 9, value 46.04; joined Measure Name says “amount to make 125ml”. R828 proposes recording only the label’s input-to-stated-prepared-volume direction with CFIA guidance. Type code 9 alone does not identify a method, water quantity, or output mass.` |

2. Append the CFIA source with these fields:

   | Field | Proposed value |
   |---|---|
   | `sourceId` | `WP03-COMMON-MILLET-AMOUNT-MAKE-R828-20261019-S01` |
   | `url` | `https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table` |
   | `title` | `CFIA, Information within the Nutrition Facts table` |
   | `accessedOn` | `2026-10-19` |
   | `sourceKind` | `other` |
   | `locator` | `Serving sizes and reference amounts; further preparation; iced tea powder example.` |
   | `supports` | CFIA says that for foods requiring further preparation, the product quantity may be the amount needed to prepare the finished-product reference amount. Its iced-tea-powder example supports direction only; it gives no millet method, water amount, or actual cooking result. |

   The CFIA URL already appears on other ingredient records, so this new ID must remain specific to the common-millet dry-form record.
3. Append these two observations. Keep each edition separate. Omit `observedMassG`; the reported gram amount is the input, not the mass of the prepared output. Omit `ingredientFormId` inside each observation because no output form is named; the observations remain on the existing dry-form ledger record and the input state is stated explicitly.

| Observation ID | Relationship and exact stored quantities | Food description and limits |
|---|---|---|
| `common-millet-dry-cnf2015-amount-make-125ml-r828-20261019` | `cooking_yield`; `sourceQuantity: { amount: 46.0, unit: "g" }`; `value: 125`; `valueUnit: "mL"`; `observedVolumeMl: 125`; `evidenceKind: published_portion`; `sourceIds: [WP03-CNF2015-COMMON-MILLET-4491-R547-S01, WP03-COMMON-MILLET-AMOUNT-MAKE-R828-20261019-S01]` | CNF 2015, “Grains, millet, dry” / “Grains céréaliers, millet, sec,” Food Code 4491. Dry-product input to the stated prepared-product amount only. |
| `common-millet-dry-cnf2026-amount-make-125ml-r828-20261019` | `cooking_yield`; `sourceQuantity: { amount: 46.04, unit: "g" }`; `value: 125`; `valueUnit: "mL"`; `observedVolumeMl: 125`; `evidenceKind: published_portion`; `sourceIds: [WP03-CNF2026-COMMON-MILLET-4491-R547-S01, WP03-CNF2026-COMMON-MILLET-4491-R547-S02, WP03-CNF2026-COMMON-MILLET-4491-R547-S03, WP03-CNF2026-COMMON-MILLET-4491-R547-S04, WP03-COMMON-MILLET-AMOUNT-MAKE-R828-20261019-S01]` | CNF 2026, “Grains, millet, dry” / “Grains céréaliers, millet, sec,” Food Code 4491, Measure Code 921. Dry-product input to the stated prepared-product amount only. |

Populate `foodState`, `measurementMethod`, and `quantityBasis` so each observation says the source identifies dry product as input and a stated 125 mL amount to make, but gives no resulting form, water quantity, method, output mass, or kitchen protocol. The schema’s `cooking_yield` relationship is used only to preserve the one-way source statement in the ledger; it does not turn these into tested yields or runtime conversions.

Append this accepted measurement decision to the existing form ledger record:

```json
{
  "outcome": "accepted",
  "reason": "Record the CNF 2015 and CNF 2026 Food Code 4491 amount-to-make entries as separate source-specific inputs to the stated 125 mL prepared-product amount (46.0 g and 46.04 g). The exact bilingual measure wording together with CFIA further-preparation guidance supports direction only. Do not compare or average editions, infer method, water quantity, or output mass, or activate a conversion.",
  "sourceIds": [
    "WP03-CNF2015-COMMON-MILLET-4491-R547-S01",
    "WP03-CNF2026-COMMON-MILLET-4491-R547-S01",
    "WP03-CNF2026-COMMON-MILLET-4491-R547-S02",
    "WP03-CNF2026-COMMON-MILLET-4491-R547-S03",
    "WP03-CNF2026-COMMON-MILLET-4491-R547-S04",
    "WP03-COMMON-MILLET-AMOUNT-MAKE-R828-20261019-S01"
  ]
}
```

Keep `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched` unchanged. Add no density, unit mapping, conversion, cooked form, recipe link, or substitution finding/rule.

## Picker projection and phrase-search audit

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) checks exact form labels first, then complete query phrases anywhere inside longer indexed terms, then substring fallback. Form hints are returned only for the exact normalized form label or match term. Since R828 adds ledger evidence only, every result below is unchanged:

| Query | Current and projected result |
|---|---|
| `common millet` | `ingredient-ref-common-millet`; no form hint. |
| `millet commun` | `ingredient-ref-common-millet` and `ingredient-ref-proso-millet-flour`; no form hint. |
| `proso millet` | `ingredient-ref-common-millet` and `ingredient-ref-proso-millet-flour`; no form hint. |
| `millet` | 20 references, including broad, species, and product identities; this broad phrase remains multi-result. |
| `millet dry` | `ingredient-ref-common-millet` by phrase match inside the longer `common millet, dry` form label; the query is not itself an exact form label, so it has no form hint. |
| `common millet, dry` | `ingredient-ref-common-millet` with the existing dry-form hint. |
| `millet commun, sec` | `ingredient-ref-common-millet` with the existing dry-form hint. |
| `millet sec` | No result; those words are not a contiguous phrase in the indexed label. |
| `amount to make` | No result; measurements in the ledger are not picker search terms. |

No reference, form, display, alias, or match term changes, so broad and subphrase query behavior remains as it is today. In particular, this proposal creates no generic dry-millet result and changes no ownership of generic `millet`, `millet commun`, `common millet`, or `proso millet`.

## Recipe demand, density, and substitution boundary

The full manifest lists **114 recipes** and **1,123 structured ingredient rows**. A scan of every manifest-listed recipe’s text and structured data found no `millet`, `common millet`, `millet commun`, `proso millet`, or *Panicum miliaceum* mention and no link to `ingredient-ref-common-millet`. This adds source-backed evidence to an existing form; it does not answer an existing recipe line.

Keep the existing R547 100 mL and 250 mL portions as separate edition-specific `portion_weight` observations. Those are not converted into densities or reusable cup measures. The new entries are directional amount-to-make relations, not `portion_weight` evidence and not output masses. None of the terminology, CNF, or CFIA sources evaluates a substitute. Keep substitution research `not_yet_researched` and add no global or contextual substitution rule.

## Static disposition and no-test rule

R828 is proposal-only and touches no shared file. The source owner, form, prior observations, planned identifiers, current search behavior, and manifest-listed recipe corpus were checked. The user-provided `AGENTS.md` says that no testing is needed when an accepted change only adds database JSON data. If accepted integration is limited to this research-ledger JSON evidence, no app tests, build, emulator, or deployment are needed; static JSON and ID validation are sufficient.
