# WP03 Section F R596 — Quaker large-flake oats portion evidence (2026-10-17)

- **Status:** Integrated as one product-specific portion observation on the existing rolled-oats ledger record. See the [integration README](../batches/wp03-section-f-quaker-large-flake-oats-portion-integration-r596-20261017/README.md).
- **Plan anchor:** Open checklist at [line 4396](../../RecipeBook-global-ingredient-catalog-plan.txt#L4405), “Dry versus cooked forms for remaining grains where recipes or measurements need them.” The broader Section F review remains open at [line 14940](../../RecipeBook-global-ingredient-catalog-plan.txt#L14968).
- **Scope:** One manufacturer-declared serving for Quaker Canada Large Flake Oats, attached as source-specific evidence to the existing generic rolled-oats reference. This is separate from R586’s Nature’s Path oatmeal blend, R589’s inaccessible CNF 2026 quick-oats join, and R592’s Trix identity review.
- **Recommendation:** **Evidence-only.** Add one `portion_weight` observation for Quaker Large Flake Oats: `1/3 cup = 30 g`, dry and as sold. Keep `measurementState: blocked_pending_evidence`, `defaultDensity: null`, and `unitMappings: []`. Do not treat the serving as a generic cup conversion or as a measurement for other brands.

## Current catalog and ownership

The active reference is `ingredient-ref-rolled-oats`, displayed as `rolled oats / flocons d'avoine` in category `GRAIN_AND_CEREAL`. Its English aliases are `old-fashioned oats` and `old-fashioned rolled oats`; its French alias is `gros flocons d'avoine`. It has no active density or unit mappings. The matching ledger record is identity-verified, has `measurementState: blocked_pending_evidence`, and already contains one source-specific AgroFusion observation: 54 g per 1/2 cup for that Québec directory product (`WP03-LFOATS-R7-20261013-S05`). Keep that observation and its source ownership unchanged.

Before this proposal was written, exact searches of the active reference data, research ledger, proposal archive, batch archive, and roadmap found no owner for either Quaker URL below, either proposed R596 source ID, the proposed observation ID, or the R596 source-ID prefix. The new sources are not reused from another record. In particular, the CFIA nutrition-label guidance source registered to quick oats is not reassigned or duplicated here. Reuse the existing `ingredient-ref-rolled-oats` identity; do not create another reference.

## Manufacturer evidence

| Proposal source ID | Direct source and relevant evidence | Limits |
|---|---|---|
| `WP03-ROLLED-OATS-QUAKER-LARGEFLAKE-R596-20261017-S01` | Quaker / PepsiCo Canada, [Large Flake Oats](https://www.tastyrewards.com/en-ca/brands/quaker/products/large-flake-quakerr-oats), checked 2026-10-17. The product page says one serving is 1/3 cup (30 g); its nutrition heading repeats `Per 1/3 Cup (30 g)`, and the ingredient declaration is `100% rolled oats`. | This is the manufacturer's declared portion for its named product. It gives no cup volume in millilitres, filling method, or transferable generic oat measure. |
| `WP03-ROLLED-OATS-QUAKER-LARGEFLAKE-R596-20261017-S02` | Quaker / PepsiCo Canada, [Gruau Quaker® Gros flocons](https://www.tastyrewards.com/fr-ca/node/3022), checked 2026-10-17. The French narrative says `Une portion de 1/3 de tasse (30 g)` and the ingredient declaration says `100 % de flocons d'avoine`. | The nutrition panel has the apparent typo `Pour 1/3 coup (30 g)`. Use the French narrative and English nutrition heading together; do not interpret `coup` as a unit or add it as a spelling alias. |

These bilingual pages describe the same branded product and one published portion, not two independent measurements. The label does not state how the cup is filled or whether the stated mass represents a repeatable kitchen-measuring method. Keep the observation attached to the named Quaker product, preserve `1/3 cup` as written, and do not infer a cup capacity or extrapolate to another quantity.

## Proposed ledger observation

If accepted, add one observation to `ingredient-ref-rolled-oats`:

| Field | Proposed value |
|---|---|
| `observationId` | `rolled-oats-quaker-largeflake-30g-third-cup-r596-20261017` |
| `relationship` | `portion_weight` |
| `value` / `valueUnit` | `30` / `g` |
| `foodDescription` | Quaker Canada Large Flake Oats, manufacturer-declared serving. |
| `foodState` | Dry product as sold. |
| `measurementMethod` | Manufacturer nutrition-serving declaration; no cup-filling or weighing method stated. |
| `quantityBasis` | One Quaker product-specific label portion only; not a generic cup mass, density, or conversion. |
| `sourceQuantity` | `1/3 cup`, as published; no millilitre conversion. |
| `observedMassG` | `30` |
| `evidenceKind` | `manufacturer_label` |
| `sourceIds` | S01 and S02 above. |

Retain `measurementState: blocked_pending_evidence`, `defaultDensity: null`, and `unitMappings: []`. Do not add a reusable measure, unit mapping, density, conversion, or yield. This manufacturer portion does not resolve the generic rolled-oats measurement question or the checklist's dry/cooked-form question.

## French wording and picker effect

Keep the existing French display `flocons d'avoine` and alias `gros flocons d'avoine`. The source title `Gruau Quaker® Gros flocons` is product wording, not a Québec terminology ruling or a proposed alias. Do not add `large flake oats`, `gruau Quaker`, or other brand/product text to either alias list. R7 already held `large flake oats` inactive because adding it would make the broad `flake` query return only rolled oats and suppress its existing multi-result fallback. Since this proposal changes no display or alias, it has no picker effect.

## Bundled recipe demand

The manifest-listed bundle contains 114 recipes and 1,123 ingredient rows. A full reference-ID scan found exactly two rows for `ingredient-ref-rolled-oats`, neither branded Quaker:

| Recipe line | Existing ingredient text | Relevance |
|---|---|---|
| `001#1` | `1/2 cup old-fashioned rolled oats` | Its generic 1/2-cup amount cannot be converted with Quaker's 1/3-cup label portion. Keep the recipe line unchanged. |
| `065#1` | `1 part rolled oats` | The ratio has no household volume or mass basis, so the label observation cannot resolve it. Keep the recipe line unchanged. |

No recipe edit, recipe link, or Quaker alias is warranted. No matching Quaker-branded recipe row was found.

## Forms, cooking yield, and substitutions

The rolled-oats entry has no form row, and the bundle has no rolled-oats conversion, yield, or substitution rule. This label concerns a dry product as sold; it does not establish a cooked form, dry-to-cooked yield, or a form-to-form conversion. No substitution source or recipe context is part of this review, so leave `substitutionResearchState: not_yet_researched` and add no substitution finding or rule.

## Static review checks

- Confirmed the current open Section F checklist at plan line 4384 and broader review anchor at line 14905.
- Inspected the live rolled-oats reference, its existing ledger record and AgroFusion observation, form data, and nearby R7 alias and measurement decisions.
- Checked the current English and French Quaker manufacturer pages directly; recorded the French narrative and nutrition-panel typo separately.
- Searched active catalog data, ledger source IDs and URLs, proposals, batches, and roadmap for collisions or existing ownership of the proposed R596 IDs and exact Quaker URLs.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; found the two linked rolled-oats lines above and no Quaker-branded recipe row.
- The accepted observation and decision are now in `docs/catalog/research-ledger.v1.json`. No application code changed. Database-JSON-only additions required no app tests, build, emulator run, or deployment under `AGENTS.md`.
