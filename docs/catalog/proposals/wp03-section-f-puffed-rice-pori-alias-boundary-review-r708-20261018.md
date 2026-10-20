# WP03 Section F — `pori` alias boundary review (R708, 2026-10-18)

## Review record

- **Candidate:** `pori` as a possible search alias for the existing `ingredient-ref-puffed-rice` identity.
- **Recommendation: hold.** Two official Tamil Nadu sources assign `pori` to different process-defined rice products. Keep it out of the active catalog until an authoritative source clarifies whether its use covers both products or only the expanded-rice product described in the Crop Production Guide.
- **Scope:** This review considers one regional name only. It proposes no new identity, variety, form, recipe link, numeric value, or substitution.
- **Section F context:** The active checklist leaves specialized regional terms open while identifying puffed rice as integrated at its supported scope ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4517)).
- **Proposed catalog effect:** None. Keep `ingredient-ref-puffed-rice` as `puffed rice / riz soufflé`, category `GRAIN_AND_CEREAL`, with its current English aliases `muri` and `murmura`, no French aliases, no attached forms, null default density, and empty unit mappings.
- **Snapshot:** 1,841 ingredient references (276 `GRAIN_AND_CEREAL`), 173 forms, 56 legacy candidates, and 2,223 research-ledger records. The manifest lists 114 recipes with 1,123 ingredient rows.
- **Allocation:** The reference ID remains the existing `ingredient-ref-puffed-rice`. The two source IDs below are proposal-local and unallocated; this review adds no ledger entry or shared ID.

## Evidence and decision

The Tamil Nadu Department of Agriculture and Farmers Welfare Crop Production Guide labels a section “Expanded rice (Pori)” and describes “expanded rice (murmura, pori, muri)” made from parboiled paddy, followed by milling and roasting for expansion. In the same guide, a separate “Popped Rice” section describes a product made by directly roasting raw paddy. The guide also distinguishes “Puffed Rice” prepared using milled rice from those sections [S01].

Tamil Nadu Agricultural University’s rice MDU 6 variety page says the rice is suitable for raw rice, aval (flaked rice), and “Pori (Popped rice) making” [S02]. The page does not explain the processing method. This official usage associates `pori` with the separately described popped-rice product, whereas the Crop Production Guide associates it with expanded rice and lists it alongside `murmura` and `muri`.

The evidence supports `pori` as a rice-product name, but does not establish one sufficiently bounded mapping to the catalog’s generic heat-expanded `puffed rice` identity. Because the ambiguity concerns product scope rather than spelling alone, hold the alias. Do not create a second identity: neither source establishes that the names designate a distinct ingredient rather than differing process or regional usage. If later evidence resolves the scope, review `pori` as a non-French Latin-script alias alongside `muri` and `murmura`; this proposal does not assign it to `aliasesEn` or `aliasesFr`.

## Ownership and related-review audit

The live [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) row for `ingredient-ref-puffed-rice` is already owned by the bilingual display `puffed rice / riz soufflé`. It has aliases `muri` and `murmura`, category `GRAIN_AND_CEREAL`, and no attached forms. The [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) file contains 173 forms; none belongs to this reference. Its ledger record in [`research-ledger.v1.json`](../research-ledger.v1.json) is identity-verified, with measurement and substitution research still `not_yet_researched`.

An exact normalized-key audit found no `pori` owner in active reference names or aliases, form labels or match terms, or the 56 [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) candidates. The term also has no exact occurrence in the existing proposals, batches, or Section F plan, and the ledger has no `pori` candidate or source record. The proposal-local source IDs and exact URLs below do not occur in the current ledger. No new reference or legacy candidate ID is requested.

Related work has narrower scopes:

- The [puffed-rice identity batch](../batches/instant-oats-puffed-rice-identities.md) defines the existing identity as whole rice grains expanded by heat and keeps it distinct from generic rice, flattened rice, and crispy rice cereal.
- [R11](wp03-section-f-next-cereal-gap-review-20261013-round11-puffed-rice-regional-aliases.md) integrated only `muri` and `murmura` as aliases on the existing row. It did not decide `pori`.
- [R259](wp03-section-f-next-gap-review-r259-20261016.md) rechecked the French display and retained `riz soufflé`; it did not add regional aliases or decide `pori`.
- The [plant and grain batch](../batches/plant-grains-cereals.md) leaves other specialized regional terms within the wider Section F review.

| Neighbor or term | Current owner / status | Boundary for this review |
|---|---|---|
| `puffed rice` / `riz soufflé`; `muri`; `murmura` | `ingredient-ref-puffed-rice` | Keep current display and accepted aliases unchanged. |
| `pori` | No exact current owner or prior focused decision | Hold; do not allocate to an active reference yet. |
| `popped rice` | No exact active reference | Do not treat the TNAU variety-page wording as evidence to add `popped rice` to puffed rice. |
| `flattened rice` / `aval` | Separate flattened-rice identity | Keep the flaked product distinct from expanded or popped rice. |
| Puffed black, brown, and wild rice | Separate color- or grain-qualified identities | Do not transfer `pori` to these rows without evidence for those products. |
| `pori urundai` and other prepared dishes | Outside this ingredient-name review | Do not add a prepared dish or composite food as an alias. |

## Phrase-first picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes search terms, returns complete word-phrase matches first, and uses substring matching only when that pass finds no rows. This is a static projection from the checked-in references, forms, and picker behavior, not live app QA.

| Query | Current result | Effect of this hold / boundary |
|---|---|---|
| `pori` | No result | Remains unallocated. If later approved as an exact alias, the phrase pass would return only `ingredient-ref-puffed-rice`. |
| `puffed rice` / `riz soufflé` | `ingredient-ref-puffed-rice` only | Unchanged. |
| `muri` / `murmura` | `ingredient-ref-puffed-rice` only | Existing aliases remain unchanged. |
| `pori urundai` | No result | Remains no result; a single-word `pori` alias would not match this full phrase, and it does not establish an ingredient identity. |
| `popped rice` | No result | Unchanged; do not infer this two-word phrase from `pori`. |
| `rice cereal` | `ingredient-ref-baby-rice-cereal` and `ingredient-ref-rice-cereal` | Unchanged; the broader cereal query remains separate from puffed rice. |

## Manifest recipe scan

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned using normalized complete-phrase matching across serialized recipe content and row fields. The scan covered `pori`, `pori urundai`, `puffed rice`, `muri`, `murmura`, `riz soufflé`, `rice puffs`, and `popped rice`.

| Scan measure | Result |
|---|---:|
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Exact candidate-phrase hits in recipe files | 0 |
| Candidate-phrase hits in ingredient rows | 0 |
| Links to `ingredient-ref-puffed-rice` | 0 |

No recipe text, ingredient link, quantity, or substitution is proposed. The existing recipe-040 crispy-rice-cereal ingredient is a separate catalog identity and does not support this alias.

## Forms, measurement, and substitution boundary

- **Identity and category:** Keep the existing `GRAIN_AND_CEREAL` puffed-rice identity. The sources do not justify a second generic rice-product identity or an allocation to a specific puffing process.
- **Forms:** Add none. `pori` is presented as a product name, not a preparation state or grade of the active identity.
- **Measurement:** Add no density, unit mapping, measure, conversion, or yield. Neither source provides a generic household quantity or conversion.
- **Substitution:** Add no global or contextual rule. The sources do not establish an interchangeable ingredient, amount, or recipe scope.
- **Research states:** Leave the existing ledger measurement and substitution states unchanged at `not_yet_researched`.

## Source register

Sources checked online on **2026-10-18**. IDs below are local to this proposal only.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-PUFFED-RICE-PORI-ALIAS-R708-20261018-S01` | Tamil Nadu Department of Agriculture and Farmers Welfare, [Crop Production Guide — Rice](https://tnagriculture.in/dashboard/CPG/01_Rice.pdf), printed pp. 48–50, sections “Expanded rice (Pori),” “Puffed Rice,” and “Popped Rice.” | Calls expanded rice “murmura, pori, muri” and describes expansion from parboiled paddy; separately describes popped rice made by directly roasting raw paddy. Official state crop-processing guide; it does not settle all regional uses of `pori`. |
| `WP03-PUFFED-RICE-PORI-ALIAS-R708-20261018-S02` | Tamil Nadu Agricultural University, [Rice MDU 6](https://agritech.tnau.ac.in/agriculture/MDU6.html), salient feature, page updated January 2023. | Says MDU 6 is suitable for “Pori (Popped rice) making.” The page does not specify the process or define whether this usage is interchangeable with the Crop Production Guide’s expanded-rice usage. |

## Disposition

**Hold `pori` out of active aliases and identities pending authoritative product-scope clarification.** Retain `ingredient-ref-puffed-rice` and its existing `muri` and `murmura` aliases as they are. No catalog, ledger, plan, roadmap, workflow, generated-file, recipe, or other proposal change is included; broader Section F review remains open.
