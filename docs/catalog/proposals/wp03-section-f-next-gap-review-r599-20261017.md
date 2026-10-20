# WP03 Section F R599 — Iwisa maize-rice serving evidence (2026-10-17)

- **Status:** Accepted and integrated as one product-specific research-ledger observation; no active measure or picker behavior changed.
- **Open plan anchor:** The regional cereal/preprocessed-grain umbrella remains open at [line 4516 of the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4525), with the broader follow-up still open at [line 14940](../../RecipeBook-global-ingredient-catalog-plan.txt#L14968). The specific maize-rice checklist at [line 269 of the plant-grains review](../batches/plant-grains-cereals.md#L269) keeps its French display provisional and its measure unresolved.
- **Scope:** One product-specific serving observation for the existing South African maize-rice identity, based on Premier FMCG’s current official Iwisa No.1 product page. This is separate from R586 Nature’s Path, R589 quick-oats CNF 2026 access, R592 Trix, and R596 Quaker rolled oats.
- **Decision:** **Evidence-only add.** Added one manufacturer-label `portion_weight` observation for Iwisa No.1 Maize Rice: one manufacturer-declared serving is 50 g, uncooked. Kept `measurementState: researched_no_supported_value` for reusable household measures and `defaultDensity: null` and `unitMappings: []`. No cup, volume, density, generic maize-rice conversion, or cooking yield was inferred.

## Existing identity and ownership

The active reference is `ingredient-ref-south-african-maize-rice`, category `GRAIN_AND_CEREAL`, displayed as `maize rice` in English and provisionally in French. It has the English alias `mealie rice`, no French aliases, null default density, and no unit mappings. It has no attached form. Reuse this reference and its R55 ledger record; do not create an Iwisa-only ingredient identity or form.

R55 established the separate South African maize-rice identity and product boundary. Its owned sources are the South African grading regulation (`WP03-SA-MZRICE-20261013-R55-S01`), Botselo Mills (`...R55-S02`), Woolworths South Africa (`...R55-S03`), and OQLF `semoule de maïs` (`WP03-S144`). Reuse them only for their existing identity, processing, and French-term boundaries. The existing R55 finding that no *reusable* household measure is supported remains valid; R599 adds a narrow branded label portion without changing that generic conclusion. See the [R55 proposal](wp03-section-f-south-african-maize-rice-identity-review-20261013-r55.md) and [R55 integration README](../batches/wp03-section-f-south-african-maize-rice-identity-integration-20261013/README.md).

## Current primary evidence

| Proposal-local source ID | Direct source and observed claim | Limits |
|---|---|---|
| `WP03-SA-MZRICE-IWISA-PORTION-R599-20261017-S01` | Premier FMCG, [Iwisa No.1 — Maize Rice](https://foodservices.premierfmcg.com/OurProducts/IwisaMaizeRice), official FoodServices product page, accessed 2026-10-17. The current page names `Maize Rice`, lists 1 kg, 2.5 kg, 5 kg, and 10 kg pack formats, and states `Single serving: 50 g maize rice (uncooked)`. Its nutrition table pairs 100 g of packed product with a 50 g single serving. | Supports one manufacturer-designated serving for this named product. The page gives no cup, household volume, fill method, or distinct preparation yield. Pack sizes are packaging data, not household measures. Do not generalize the serving to other maize-rice products or to cornmeal, grits, samp, or rice. |
| Existing `WP03-SA-MZRICE-20261013-R55-S03` | Woolworths South Africa, [Maize Rice 1 kg](https://www.woolworths.co.za/prod/_/A-6009189911248), existing R55 source record. | Reuse only for existing product identity and `mealie rice` naming; it does not support R599’s 50 g value. |

The official manufacturer page is the sole numeric source for this proposal. Its one-serving statement is direct product-label evidence, not a laboratory measurement or independent kitchen test. Do not calculate or infer serving counts from package weights.

## Integrated ledger observation

Added one observation to the existing `ingredient-ref-south-african-maize-rice` record:

| Field | Proposed value |
|---|---|
| `observationId` | `south-african-maize-rice-iwisa-50g-single-serving-r599-20261017` |
| `relationship` | `portion_weight` |
| `value` / `valueUnit` | `50` / `g` |
| `foodDescription` | Iwisa No.1 Maize Rice, manufacturer-declared serving; pack size not specified for this serving. |
| `foodState` | Uncooked maize rice, as named by the manufacturer. |
| `measurementMethod` | Manufacturer nutrition-serving declaration; no kitchen measuring or weighing method stated. |
| `quantityBasis` | One manufacturer-declared serving for Iwisa No.1 Maize Rice only; not a generic maize-rice portion or volume-to-mass conversion. |
| `sourceQuantity` | `1` `serving`, preserving the source’s single-serving basis; no household volume is stated. |
| `observedMassG` | `50` |
| `evidenceKind` | `manufacturer_label` |
| `sourceIds` | `WP03-SA-MZRICE-IWISA-PORTION-R599-20261017-S01` |

Kept generic/reusable `measurementState: researched_no_supported_value`, active density null, and unit mappings empty. Added a supplemental accepted decision for the Iwisa-specific serving and clarified R55’s earlier finding as “no reusable household measure”; the source-specific observation remains bounded to the named Iwisa product.

## French wording and picker effect

Keep `nameFr: maize rice` explicitly provisional and keep `aliasesFr` empty. The Premier page is English-only and does not establish a Québec French product name. The already-owned OQLF source `WP03-S144` defines `semoule de maïs` as ground dried maize and describes fine, medium, or coarse grinds; that broader term remains owned by cornmeal and is not a specific name for South African maize rice. Keep `riz de maïs`, `maïs concassé`, and other constructed French terms inactive pending direct Québec product or terminology evidence.

R599 proposes no display, alias, or form-term change, so it has no picker effect. The current phrase-first search returns only `ingredient-ref-south-african-maize-rice` for `maize rice` and `mealie rice`; `riz de maïs` currently returns no row; `semoule de maïs` returns cornmeal and corn grits; and `gruau de maïs` returns hominy grits. These results remain unchanged.

## Recipe demand, forms, and substitutions

I scanned all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** for `maize rice`, `mealie rice`, `mielie rys`, `riz de maïs`, `Iwisa Maize Rice`, and the exact maize-rice reference ID. There are no matching recipe files or ingredient rows and no direct recipe links. The source is therefore useful as bounded catalog evidence, not as support for a bundled recipe quantity or link.

No ingredient form is attached. The source’s `uncooked` qualifier does not establish a cooked form, dry-to-cooked conversion, cooking yield, density, or household measure. It also supplies no tested replacement relationship. Add no form, unit mapping, conversion, yield, recipe link, or substitution; keep the existing no-supported-substitute finding unchanged.

## Source ownership and collision audit

- The Premier FMCG product URL is not registered in the research ledger. The proposed source ID `WP03-SA-MZRICE-IWISA-PORTION-R599-20261017-S01` and observation ID `south-african-maize-rice-iwisa-50g-single-serving-r599-20261017` were checked against the ledger, proposal archive, batch archive, and roadmap; no prior owner or allocation was found.
- The official Premier source is new and distinct from the existing Woolworths `mealie rice` listing and from R55’s regulation, Botselo, and OQLF sources. Do not duplicate or reassign those existing IDs to support the 50 g serving.
- No ingredient-reference ID, form ID, alias, unit mapping, density, conversion, recipe link, or substitution rule was added.

## Static checks performed

- Confirmed the open parent anchors at plan lines 4504 and 14905, the specific regional-grain note at `plant-grains-cereals.md` line 269, and R55’s completed identity-only note at plan lines 4782–4790.
- Inspected the active maize-rice reference, forms, ledger states, existing observations/findings/decisions, R55 proposal, and R55 integration README.
- Opened Premier FMCG’s official current page and the already-owned OQLF `semoule de maïs` entry; checked the existing Woolworths R55 evidence boundary.
- Reproduced current phrase-first picker results from active bilingual terms and attached forms; this proposal changes none of them.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; found no target phrase, target reference link, or matching recipe demand.
- Validated the proposed Premier source and `MeasurementObservation` shapes against `research-ledger.schema.json`; both pass.
- Checked the source URL, source ID, and observation ID for ownership/collisions. Updated only research-ledger JSON plus the plan, roadmap, review packet, and integration README. No app tests, build, emulator run, or deployment were needed under the current `AGENTS.md` database-JSON rule.
