# WP02 Section A7 wheat starch reference-amount review — R558 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17 as a ledger-only evidence update and documentation. No active catalog, recipe, or code data was changed.
- **Scope:** Research one bounded numeric gap for the existing `ingredient-ref-wheat-starch`: Health Canada's current C.10 label reference amount. This does not reopen the identity or French wording review, and it leaves the separate substitution question open.
- **Exact plan anchors:** The open A7 parent at [line 2053](../../RecipeBook-global-ingredient-catalog-plan.txt#L2053) continues review of grain meals and other milling products. The existing A7 wheat-starch item at [lines 2600–2602](../../RecipeBook-global-ingredient-catalog-plan.txt#L2600) already identifies `wheat starch / amidon de blé`, keeps `amidon de froment` as its French alias, and leaves numeric and substitution data empty. Its detailed identity checkpoint at [lines 11210–11217](../../RecipeBook-global-ingredient-catalog-plan.txt#L11238) likewise records no measurement. R558 proposes a measurement-ledger follow-up only; it does not close the A7 parent.
- **New source ID:** `WP02-A7-WHEAT-STARCH-C10-RA-R558-20261017-S01` is proposal-local for Health Canada's current Table of Reference Amounts for Food, item C.10. That page URL already has ledger sources for other items, but none locates C.10. Reuse the existing OQLF, CFIA, and Allzone source IDs for their unchanged claims rather than registering those URLs again.

## Bounded decision

**Add one source-specific 10 g regulatory reference-amount observation; add no kitchen conversion or substitution behavior.** If accepted, set the target ledger row's `measurementState` to `researched_supported`, scoped only to Health Canada's current Canadian nutrition-labelling reference amount for the starch category that explicitly includes wheat starch.

Use a `portion_weight` observation with `value: 10`, `valueUnit: "g"`, and `evidenceKind: "published_portion"`. Describe the food as the C.10 starch category including wheat starch, and make the `quantityBasis` explicit that this is a nutrition-labelling reference amount, not a product-specific label serving, recipe amount, household weight-to-volume measure, or density. The table's household-measure instruction says to use the number of teaspoons closest in weight to the reference amount; it supplies no wheat-starch-specific teaspoon count or grams-per-teaspoon conversion. Do not infer one.

Keep `defaultDensity: null`, `unitMappings: []`, and the catalog reference unchanged. Add no form, package yield, cooking yield, recipe link, unit conversion, source quantity in volume units, or active rule. Keep `substitutionResearchState: not_yet_researched` and add no substitution finding: the C.10 evidence is not recipe replacement research.

## Current catalog, ledger, and source-ID ownership

The active reference is `ingredient-ref-wheat-starch`, displayed as `wheat starch / amidon de blé`, with the French alias `amidon de froment`, category `FLOUR_AND_STARCH`, null default density, and no unit mappings. Its research-ledger row is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It has no measurement observations or substitution findings. There is no attached form, form-conversion or contextual-substitution rule, or package-yield entry. Related active rows remain separate: modified, pregelatinized, and resistant wheat starch.

| Existing source ID or URL | Current owner and scope | R558 handling |
|---|---|---|
| `WP02-S108` | OQLF's `amidon de froment` entry, owned by `ingredient-ref-wheat-starch`. It defines wheat starch from *Triticum* species and lists `amidon de froment`, `amidon de blé`, and `wheat starch`. | Reuse only for the existing identity and names; it provides no mass, volume, or kitchen measure. |
| `WP02-S109` | CFIA Canadian Food Compositional Standards, owned by `ingredient-ref-wheat-starch`, Volume 12, standard 12.2.1(h). It lists wheat starch separately from flour and meal among permitted optional bread ingredients. | Reuse as a product-separation and substitution-scope boundary. The standard's combined 5%-of-flour ceiling for listed ingredients is not a home-recipe replacement ratio. |
| `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | Health Canada reference-amount page, used for C.6 in the medium-rye and sprouted-buckwheat ledger rows. | Do not repurpose its C.6 locator for C.10; retain it for the flour reference-amount scope it records. |
| `WP04-SECTIONP-BLUEFISH-20261012-S05`; `WP04-PIE-CRUST-089-20261011-S04`; `WP04-PIE-CRUST-108-20261011-S08`; `WP04-PIE-CRUST-109-20261011-S09` | Same Health Canada URL, owned by bluefish or pie-crust ledger rows for their distinct regulatory table items. | Do not repurpose these item-specific source IDs for C.10. Add the new R558 source ID for the new C.10 locator. |
| `WP02-SECTION-04-B3-WAXY-WHEAT-STARCH-R199-20261016-S04` | Existing R199 proposal source ID for Allzone Trading's current Canadian `Wheat Starch — Bulk Supply Canada` page; the ledger has no duplicate source entry for that URL. The supplier describes generic native food-grade starch, but grade, package, and documentation are quotation-dependent. | Reuse for generic product-market context only. The page does not provide a consumer serving, household measure, or conversion. |
| `WP02-A7-WHEAT-STARCH-C10-RA-R558-20261017-S01` | No current owner; new ID for the exact Health Canada C.10 table locator. | If accepted, add once to the target ledger row and its 10 g observation. |

The new source ID and observation ID were not found in the current ledger or proposal archive. The same Health Canada URL is already used with other source IDs and item locators; R558 keeps those owners and locators intact.

## Bilingual names and picker projection

Retain the current English display `wheat starch`, French display `amidon de blé`, and French alias `amidon de froment`. R558 proposes no aliases, forms, or picker changes. A static projection of the current refs and forms following [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) gives:

| Query | Current results | R558 effect |
|---|---|---|
| `wheat starch` | Four rows: ordinary, modified, pregelatinized, and resistant wheat starch. | No change; keep all starch grades distinct. |
| `amidon de blé` | Three rows: ordinary, modified, and pregelatinized wheat starch. | No change. |
| `amidon de froment` | Only ordinary wheat starch. | No change; preserve the existing exact French alias. |
| `corn starch` | Six rows across ordinary and process/source-qualified corn starches. | No cross-grain alias or substitution is proposed. |

This is a static search projection, not an Android picker test. Because the proposed delta is ledger-only, picker results do not change.

## Bundled recipe demand and product context

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Case-insensitive searches of ingredient names, original ingredient text, reference IDs, and full recipe documents for `wheat starch`, `amidon de blé`, `amidon de froment`, and `ingredient-ref-wheat-starch` found **zero matches**. The bundle has no wheat-starch recipe line, package, dish context, or substitution demand.

Allzone's current Canadian bulk-supply page describes generic native food-grade wheat starch and states that grade, packing, and documentation are confirmed by quotation [reused R199 S04]. It does not provide a consumer serving or spoon-to-mass figure. This is one supplier page, not a claim that no consumer package exists elsewhere.

## Measurement and conversion evidence

- Health Canada's current [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html) identifies a reference amount as the basis for nutrition-label serving presentation and describes the table as the current version, published October 18, 2024. Item C.10 explicitly covers “Starch, such as cornstarch, potato starch, tapioca starch or wheat starch” and sets **10 g**. Its household-measure instruction is the number of teaspoons closest in weight to the reference amount. This supports one regulatory category-level weight observation, not a product-specific package serving or a teaspoon conversion [new R558 S01]. The page notes that the prior November 2022 table may still be used for labelling until December 31, 2027; R558 does not claim that every current package label uses the 2024 amount.
- OQLF's existing `WP02-S108` supports the identity and exact Québec French wording but supplies no product mass or volume. Its general note about the physical character of starch is not a density or household-measure observation.
- The CFIA standard already recorded under `WP02-S109` lists wheat starch as a distinct possible bread ingredient and permits a combined amount of listed optional ingredients not exceeding 5% of flour used for the standard bread class. This is a regulatory composition ceiling, not a wheat-starch-for-flour or wheat-starch-for-cornstarch replacement formula.

The supported numeric delta is only the **10 g C.10 reference amount**. Do not set density, `observedVolumeMl`, `sourceQuantity` in a volume unit, or any `unitMappings` from the table's teaspoon-label instruction. Requirements FR-5 and §6.2 require a density or mapping for weight-volume conversion; neither is present here.

## Substitution boundary

The existing ledger does not contain substitution research for ordinary wheat starch. The sources reviewed for R558 do not provide a reusable home-recipe replacement amount: OQLF provides terminology, Health Canada C.10 provides a nutrition-labelling reference amount, Allzone lists industrial food applications on a quotation basis, and CFIA's 5% figure is a standard-bread composition limit. Do **not** mark this separate research question as complete, infer a corn-starch equivalence, or activate a contextual substitution. Keep `substitutionResearchState: not_yet_researched`; a future review would need a defined dish, role, method, and source-tested replacement ratio before considering a contextual rule under [Requirements FR-5](../../../Requirements.md#L322) and [§6.5](../../../Requirements.md#L641).

## Proposed ledger delta and integration recommendation

If accepted, update only `ingredient-ref-wheat-starch` in [`research-ledger.v1.json`](../research-ledger.v1.json):

| Field | Proposed value |
|---|---|
| `identityState` | Keep `verified`. |
| `measurementState` | `researched_supported`, scoped to one current regulatory reference amount only. |
| Observation ID | `wheat-starch-health-canada-c10-ra-r558-20261017`. |
| Observation | `relationship: portion_weight`; `value: 10`; `valueUnit: g`; `evidenceKind: published_portion`; `sourceIds: [WP02-A7-WHEAT-STARCH-C10-RA-R558-20261017-S01]`. |
| Observation scope | `foodDescription: Health Canada Table of Reference Amounts for Food, item C.10: starch including wheat starch`; `foodState: regulatory category; no product grade or sample identified`; `measurementMethod: published nutrition-labelling reference amount, not direct weighing`; `quantityBasis: Canadian label reference amount only; not a package serving, recipe amount, household conversion, or density`. Omit `sourceQuantity`, `observedMassG`, and `observedVolumeMl`; the source reports a regulatory weight amount, not a volume measurement. |
| `substitutionResearchState` | Keep `not_yet_researched`; add no substitution finding. |

Keep the reference JSON, French and English names/aliases, forms, density, unit mappings, package yields, global/contextual substitution files, and recipes unchanged. Close only this C.10 measurement-evidence subtask if integrated; keep the A7 parent and substitution research open.

## Source register

Sources were accessed on **2026-10-17** unless an existing record lists an earlier access date. Reused IDs remain owned by their existing records or proposal.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-A7-WHEAT-STARCH-C10-RA-R558-20261017-S01` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), current version published 2024-10-18, item C.10. | 10 g reference amount for starch, explicitly including wheat starch; household label expression uses the number of teaspoons closest in weight. This is a nutrition-labelling reference, not a product-specific serving, cooking amount, or conversion. Prior-table transition ends 2027-12-31 for the November 2022 version. |
| Reused `WP02-S108` | OQLF, [amidon de froment (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432751/amidon-de-froment), existing ledger record. | Defines wheat starch from *Triticum* species and lists the preferred French terms and English equivalent. Terminology and identity only. |
| Reused `WP02-S109` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, 12.2.1(h), existing ledger record. | Permits wheat starch among several optional ingredients within a combined 5%-of-flour limit in standard bread. Not a home-recipe substitution ratio. |
| Reused `WP02-SECTION-04-B3-WAXY-WHEAT-STARCH-R199-20261016-S04` | Allzone Trading, [Wheat Starch — Bulk Supply Canada](https://allzonetrading.ca/supply/wheat-starch), source in the R199 proposal. | Current Canadian supplier context for generic native food-grade wheat starch; packing and grade are quotation-dependent. No consumer measure or recipe ratio. |
| **R01 — repository audit** | Current reference catalog, forms, package-yield and substitution files, research ledger, A7 plan items, earlier wheat-starch and R199 proposals, picker implementation, and manifest-listed recipes. | Workspace snapshot on 2026-10-17. Confirms current owners/states, picker projections, and zero wheat-starch recipe demand. |

## Review-only verification

Re-read `AGENTS.md`, the relevant Requirements conversion/substitution rules, the open A7 parent, the A7 wheat-starch identity decision, the target reference and ledger rows, adjacent wheat-starch identities, the R199 product-boundary proposal, `IngredientSearch.kt`, and the package manifest. Rechecked source-ID/URL ownership, forms and rule links, the static picker projection, and all 114 manifest-listed recipes. After integration, the ledger validator and encoding checks passed. No app tests, builds, emulator checks, or deploys were run for this database-JSON-only change under `AGENTS.md`.
