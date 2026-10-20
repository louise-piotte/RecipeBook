# WP03 Section F Haudenosaunee Lyed-Corn Alias Review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated as one English alias on the existing hominy-corn reference. No recipe, numeric, form, conversion, or substitution data changed. No tests were run.
- **Scope:** one newly found regional term, `lyed corn`, used for a Haudenosaunee white-corn food product. This is a narrow follow-up to the open hominy/pozole boundary, not a repeat of the generic `pearled hominy` and `pozole corn` reviews.
- **Plan location:** this source-backed regional product fits the still-open Section F entries for regional/preprocessed grain products at [plan lines 1953–1955](../../RecipeBook-global-ingredient-catalog-plan.txt#L2046) and [line 8746](../../RecipeBook-global-ingredient-catalog-plan.txt#L9027). The broader hominy/pozole candidates remain open at [plan lines 1891–1892](../../RecipeBook-global-ingredient-catalog-plan.txt#L1984).

**Recommendation:** add the exact English alias `lyed corn` to the existing `ingredient-ref-hominy-corn` reference (`hominy corn / maïs lessivé`). Do not create a separate identity. Do not add a French alias, forms, measures, recipe links, conversions, yields, or substitutions.

**Root disposition:** accepted and integrated. The live reference now has `lyed corn` as its only English alias; the research ledger records the three reviewed sources and accepted alias decision. See the [integration record](../batches/wp03-section-f-haudenosaunee-lyed-corn-alias-integration-20261012/README.md).

The phrase is directly used for a contemporary Haudenosaunee corn product, and a Haudenosaunee educator explicitly identifies the lye-treated result as “lyed corn (also called hominy).” The existing Québec OQLF record supplies the English/French display pair `hominy corn / maïs lessivé` and describes the corresponding alkaline treatment [WP03-LYEDCORN-QC-20261012-S01–S03; reused `WP03-S125`]. The evidence supports one exact input synonym; it does not establish a new product state or a French rendering of the culturally specific product name.

## Current owner and demand audit

The read-only audit was made before integration against the live package and ledger on 2026-10-12: **1,246 active references, 94 forms, 114 manifest-listed recipe files / 1,123 ingredient rows, 66 legacy candidates, and 1,552 ledger records**. The current package has 1,245 active references after the unrelated Nile tilapia search hold; hominy corn remains the owner of `lyed corn`.

| Current record | Live state | Disposition in this proposal |
| --- | --- | --- |
| `ingredient-ref-hominy-corn` | Active; `hominy corn / maïs lessivé`; `VEGETABLE_AND_AROMATIC`; now has only the English alias `lyed corn`; density null; no unit mappings. Ledger identity verified; measurement and substitution research not yet researched. | Keep the source-attested English alias. The French display, category, forms, and numeric fields remain unchanged. |
| `ingredient-ref-corn-kernels` | Active; `corn kernels / maïs`; `VEGETABLE_AND_AROMATIC`. | Keep plain corn kernels separate from the lye-treated product. |
| `ingredient-ref-hominy-grits` | Active; `hominy grits / gruau de maïs`; `GRAIN_AND_CEREAL`. | Keep the ground product separate from whole lyed corn. |
| `ingredient-ref-cornmeal` and `ingredient-ref-masa-harina` | Active ground maize products. | No alias or merge proposed. |
| `ingredient-ref-pearled-hominy` and `ingredient-ref-pozole-corn` | Ledger-only candidates, both `needs_clarification`; no active rows. | Leave both holds intact. The Haudenosaunee term does not resolve dry-milled pearled hominy or Mexican pozole-maize scope. |

Using the repository's `normalize_search_key`, the pre-integration exact-key check found no active reference, form, or legacy owner for `lyed corn`, `lyed white corn`, `lye corn`, `Haudenosaunee lyed corn`, `kanenhstóhare`, or `kanenhstóhare onòn:tara`. After integration, `lyed corn` is owned only by `ingredient-ref-hominy-corn`; the other checked terms remain unallocated. `hominy corn` and `maïs lessivé` remain on the existing owner. The full manifest-listed recipe corpus has **zero file and zero ingredient-row hits** for the proposed alias and the checked regional terms. No recipe relink was made.

## Identity and terminology boundary

Six Nations Tourism identifies Hill’s Native Foods as a local supplier of “lyed white corn” to area businesses. Its 2024 profile describes the family processing white corn into `lyed corn` and selling the regional products through a family store and local businesses [WP03-LYEDCORN-QC-20261012-S01–S02]. These pages establish current regional product wording, not one botanical cultivar specification or a Québec retail name.

Kiera Brant-Birioukov, a Haudenosaunee educator from Tyendinaga Mohawk Territory, describes drying and harvesting corn and then transforming the dried corn into “lyed corn (also called hominy)” through a lye process [WP03-LYEDCORN-QC-20261012-S03]. This directly supports the term-to-product relationship within that foodway. It does not establish that every product called corn or white corn is lyed, nor that the Six Nations supplier follows one universal manufacturing specification.

OQLF’s existing record `WP03-S125` pairs `hominy corn` with the preferred Québec French term `maïs lessivé`. Its definition describes mature dry yellow or white corn placed in preserving liquid, and its note describes alkali treatment to remove the hull. The record was rechecked on 2026-10-12; its original ledger source ID and access date are retained. The educator’s direct equation of lyed corn with hominy, together with OQLF’s lye-treatment note, supports `lyed corn` as one English alias of the existing identity. The Québec display remains the OQLF term; this review does not construct `maïs lyé` or `maïs lessivé blanc` as new aliases.

### Proposed fields

| Field | Recommendation |
| --- | --- |
| Existing ID | `ingredient-ref-hominy-corn` |
| English display | Keep `hominy corn` |
| Québec French display | Keep `maïs lessivé` |
| English alias | `lyed corn` (integrated) |
| French aliases | None |
| Category | Keep `VEGETABLE_AND_AROMATIC` |
| Forms, densities, unit mappings, measures, yields, conversions | None |
| Recipe links | None; no matching demand in the bundled corpus |
| Substitutions | None |

Keep `lyed white corn` out of global aliases because the source phrases it as one locally specific product; keep `kanenhstóhare` out because the cited source uses it for the corn-soup dish. Do not alias `lye corn`, `lying corn`, generic white corn, raw/dried corn, `pearled hominy`, `pozole corn`, hominy grits, cornmeal, or masa harina. Their scopes are not established by the exact `lyed corn` sources.

The cited cultural recipe pages contain amounts and preparation directions for their own dishes. None is transferred to the catalog. This review establishes no general preparation ratio, cooking yield, density, unit conversion, form conversion, or substitution.

## Relation to recent holds

The broad `pearled hominy` / `pozole corn` boundary and the recipe-demand hold were already documented in the [2026-10-10 boundary review](./wp03-section-f-pozole-corn-boundary-review-20261010.md) and rechecked in the [2026-10-12 next-grains sweep](./wp03-section-f-next-grains-gap-sweep-20261012.md). This proposal adds the previously unaudited local term `lyed corn` to the already active processed-corn identity. It does not reopen or resolve those two ledger candidates, and it does not close the open aggregate Section F checklist.

## Proposal-local sources

IDs `WP03-LYEDCORN-QC-20261012-S01` through `S03` were checked absent from the current ledger’s source IDs and the existing `docs/catalog/proposals/` and `docs/catalog/batches/` Markdown before assignment. Existing OQLF source `WP03-S125` is reused as-is and is not reissued.

| Source ID | Source and locator | Supports / does not support |
| --- | --- | --- |
| `WP03-LYEDCORN-QC-20261012-S01` | Six Nations Tourism, [Native Plant Species on Six Nations: Sourcing & Growing for Sustainability](https://www.sixnationstourism.ca/news-media/native-plant-species-on-six-nations-sourcing-growing-for-sustainability), paragraph on Hill’s Native Foods. | The Six Nations Tourism page identifies Hill’s Native Foods as a local supplier of `lyed white corn` to area businesses and says its owner grows, harvests, and processes it. Supports local commercial use of the exact term; does not give a French display or a technical product specification. |
| `WP03-LYEDCORN-QC-20261012-S02` | Six Nations Tourism, [Hill’s Native Foods: Sharing Knowledge + Growing Community](https://www.ontarioculinary.com/hills-native-foods-sharing-knowledge-growing-community/), published 2024-04-03, paragraphs “The Origins” and “Back to Family Roots.” | Six Nations Tourism’s profile says the family processes white corn into `lyed corn` and sells its regional products through local outlets. Supports the English product name and regional sale context; does not set a universal corn type, process, package form, or Québec French name. |
| `WP03-LYEDCORN-QC-20261012-S03` | Kiera Brant-Birioukov, [Life in the Longhouse: Haudenosaunee Primer Video #3](https://earthtotables.org/essays/life-in-the-longhouse/), section “Our First Teacher: Kanenhstóhare.” | The Haudenosaunee educator describes transforming dried corn into `lyed corn (also called hominy)` through a lye process. Supports the exact alias within this foodway. It is not a product label or specification for every corn product. |
| Reused `WP03-S125` | OQLF, [maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive), preferred term, definition, English equivalent, and note. | Directly pairs Québec French `maïs lessivé` with English `hominy corn`; defines the product and notes alkaline hull removal. Existing shared-ledger source; accessed there on 2026-10-07 and rechecked on 2026-10-12. |

## Next open work

This alias would not resolve the outstanding English/French naming and product-state boundaries for dry pearled hominy, pozole corn, generic grits/polenta, dried sweet corn, or other regional/preprocessed grains. Keep those reviews separate. If a future proposal needs `lyed white corn` as a narrower reference or any form data, obtain a product-specific preparation and package source first; this proposal only maps the unqualified, source-attested alias `lyed corn` to the existing hominy identity.
