# WP03 Section U — marjoram / marjolaine identity review (R338, 2026-10-16)

- **Status:** Accepted and integrated by root on 2026-10-16; see the [R338 integration README](../batches/wp03-section-u-marjoram-identity-integration-r338-20261016/README.md). The proposal retains the source review and scope limits.
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” line 7646 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`. The open common-herb list names marjoram.
- **Candidate:** Culinary marjoram, *Origanum majorana* L.
- **Coordination:** This review does not reopen the integrated Chios mastic (R327), mahlab (R330), lemon balm (R324), lemon verbena (R332), or lovage (R296) work, nor the proposal-only perilla leaves review (R335). The recent WP04 amberjack reviews are fish identities and do not overlap Section U.
- **Disposition:** Advance the existing unreviewed legacy candidate as one identity-only HERB reference, `marjoram / marjolaine`. Retain the official alternate terms as scoped aliases and record the resulting `origan` picker ambiguity explicitly.

## Recommendation

Accept one culinary marjoram identity scoped to *Origanum majorana* L. The Office québécois de la langue française (OQLF) places `marjolaine` in the food/spice-and-seasoning domain, defines the plant as an aromatic, links it to *O. majorana*, and gives the English terms `marjoram`, `sweet marjoram`, and `knotted marjoram`. Kew’s Plants of the World Online accepts *O. majorana* and records it as used for food; its Flora of Tropical East Africa entry describes it as widely cultivated as a culinary herb. The OQLF entry also distinguishes marjolaine from origan as a close relative with a somewhat milder flavour. These sources support a bounded identity and its bilingual search wording without implying that marjoram and oregano are the same ingredient. [S01–S02]

| Field | Proposed value |
|---|---|
| Proposed ID | **ingredient-ref-marjoram** (reuse the existing legacy candidate ID; not present in active references) |
| Category | HERB |
| English display | marjoram |
| Québec French display | marjolaine |
| English aliases | sweet marjoram; knotted marjoram |
| French aliases | grand origan |
| Scope | Culinary marjoram named as *Origanum majorana* L. by OQLF |
| Forms | None |
| Recipe links | None |
| Density, unit mappings, measures, yields, conversions, active substitutions | None |

`Marjolaine` is the preferred Québec French display. OQLF also lists `grand origan` as a preferred French term; it is retained as an alias because it names the same scoped marjoram entry. Since the active dried-oregano reference already contains `origan séché`, the short French query `origan` will deliberately return both the marjoram and dried-oregano rows. The full query `grand origan` remains unique to marjoram. The displayed names keep the two identities clear. [S01; live catalog]

## Identity and product boundary

| Term or product | Disposition | Evidence boundary |
|---|---|---|
| Culinary marjoram, *Origanum majorana* | Proposed identity | OQLF names the species and defines the plant as an aromatic; Kew accepts the species and documents food use. This does not assign a variety, growing origin, or commercial grade. [S01–S02] |
| `marjoram`, `sweet marjoram`, `knotted marjoram`; `marjolaine`, `grand origan` | Proposed bilingual terms | These terms are listed by OQLF under the marjolaine entry. The French alias has a known picker consequence: a short `origan` query returns both marjoram and the existing dried-oregano row. Do not add bare `origan` as an alias. [S01] |
| Oregano / origan | Keep separate | OQLF describes marjolaine as a close relative of origan, not as the same ingredient. The active `ingredient-ref-dried-oregano` remains separate. Do not normalize marjoram to oregano or use oregano as a marjoram alias. [S01; live catalog] |
| Herbes de Provence and other herb blends | Keep separate | The existing blend review describes variable compositions; two source records mention marjoram only as one blend component. They do not define a universal blend recipe or establish a standalone marjoram recipe link. [S03] |
| Fresh, dried, ground, flowering-top, or other presentations | Leave unresolved | The reviewed terminology and botanical sources support the ingredient identity but no canonical form boundary, preparation conversion, or product-specific measures. Add a form only after evidence identifies its product and any behavior independently. [S01–S02] |
| Botanical names and medicinal products | Do not add as picker aliases or forms | The botanical name is used here for identity verification only. Kew records other non-culinary uses too; this review concerns the culinary herb and makes no medicinal, safety, dosage, extract, or essential-oil claim. [S02] |

## Catalog, ownership, and demand audit

The current manifest-listed package and catalog were scanned on 2026-10-16. Exact phrase ownership below follows `IngredientReferenceSearchIndex`’s normalization of case, accents, and punctuation.

| Artifact | Findings |
|---|---|
| Section U plan | The common-herb checklist remains open and names marjoram. The neighbouring regional items reviewed in R327/R330/R332 and the R335 perilla-leaf proposal are not repeated here. |
| Active references | `ingredient-references.v1.json`: 1,684 rows; SHA-256 `043620908142ef5fe60debabd7ddec902f87b47a431e8c3f19fdb4205a8a530e`. No exact owner for `marjoram`, `marjolaine`, `sweet marjoram`, `knotted marjoram`, or `grand origan`; no active `ingredient-ref-marjoram`. The nearby owner is `ingredient-ref-dried-oregano` (`origan séché` / `dried oregano`, English alias `oregano`). |
| Forms | `ingredient-forms.v1.json`: 129 rows; SHA-256 `78563e9c449a665f5d0490c0e2b9751681d78cfc1d039dbb03cee8c13d1540a1`. No marjoram form or form match term. |
| Legacy candidates | `legacy-import-identities.v1.json`: 58 candidates; SHA-256 `ebfba2ff9f30b48196c2f1da5fbf813df205298bd310c2af09fe87b08a2db4c1`. It contains the exact `ingredient-ref-marjoram` candidate with `nameEn: marjoram`, `nameFr: marjolaine`, category `HERB`, empty alias arrays, and `reviewState: unreviewed`. Reusing its ID avoids a duplicate legacy identity. |
| Research ledger | 2,032 records / 9,080 source entries; SHA-256 `aed06ac9b609f2bdbadf9c8fda1b8c086bc9111673f2cd72e863fd290f512d20`. The marjoram candidate record is `unreviewed`, has no sources, and only records that it was in the legacy RecipeKeeper catalog but absent from the canonical seed pending identity and alias review. Existing blend records mention marjoram in product-specific Herbes de Provence ingredient lists; neither is an item-level decision. |
| Proposals and batches | Exact-name archive search found no standalone marjoram review, hold, integration, or source-ID allocation. WP05’s accepted Herbes de Provence review covers the blend identity and expressly treats listed component herbs as product-specific composition, not a universal formula. [S03] |
| Bundled recipe corpus | All 114 manifest recipe files and 1,123 ingredient rows were scanned for `marjoram`, `marjolaine`, `sweet marjoram`, `knotted marjoram`, `grand origan`, *Origanum majorana*, and *Majorana hortensis*. There were zero full-file hits and zero ingredient-row hits. The corpus supplies no recipe link, measure, or recipe-specific substitution demand. |

The zero recipe-hit result describes only the bundled corpus. It does not negate the legacy-catalog candidate, the open Section U coverage item, or the direct terminology and botanical evidence. The review makes no recipe-line claim from component mentions in a variable herb blend.

## Exact picker projection

`IngredientReferenceSearchIndex` normalizes case, accents, and punctuation, prefers complete normalized word-phrase matches across names and aliases, then falls back to substring matches only when no complete phrase matches. Forms also contribute terms, but none is proposed here. Projection with the fields above:

| Query | Projected result |
|---|---|
| `marjoram` | `ingredient-ref-marjoram` only |
| `sweet marjoram` / `knotted marjoram` | `ingredient-ref-marjoram` only |
| `marjolaine` / `grand origan` | `ingredient-ref-marjoram` only |
| `origan` | `ingredient-ref-marjoram` and existing `ingredient-ref-dried-oregano`; both have `origan` as a complete word in a search term |
| `origan séché` | `ingredient-ref-dried-oregano` only; its complete phrase match takes precedence |
| `oregano` | `ingredient-ref-dried-oregano` only; no oregano alias is added to marjoram |
| `Origanum majorana` / `Majorana hortensis` | No result; botanical names are not proposed as picker aliases |

The broader `origan` query is the only intentional overlap. It follows OQLF’s `grand origan` term while preserving the separate French display `marjolaine` and separate English `marjoram`. If the project prefers to avoid that shared short query, omit `grand origan` from `aliasesFr`; the preferred bilingual display pair remains source-supported and unique.

## Measures and substitutions

Neither OQLF nor the reviewed Kew pages supplies a transferable household measure, mass-per-volume value, density, fresh-to-dried conversion, or recipe quantity. The recipe corpus contains no marjoram line. Do not infer a measure from its use in a commercial blend. No source establishes marjoram as a safe general substitute for oregano or another herb; no substitution, conversion, form, yield, unit mapping, or recipe link is proposed.

## Source register

Sources were accessed on 2026-10-16. Claims below are paraphrased. The source IDs are local to this proposal and have not been added to the shared ledger.

| ID | Source | Support and limits |
|---|---|---|
| **WP03-SECTIONU-MARJORAM-R338-20261016-S01** | Office québécois de la langue française, [GDT: marjolaine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361596/marjolaine). | Food, spice, and seasoning domain; preferred French terms `marjolaine` and `grand origan`; English translations `marjoram`, `sweet marjoram`, and `knotted marjoram`; linked Latin name *Origanum majorana*; aromatic-plant definition and distinction from origan. The entry says it was last updated in 2002; it supports Québec terminology, not current retail availability, recipes, forms, or measures. |
| **WP03-SECTIONU-MARJORAM-R338-20261016-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Origanum majorana* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:453303-1/general-information). | Accepts *O. majorana* as a species, states that it is used for food, and cites a flora description of it as widely cultivated as a culinary herb. Supports botanical identity and culinary scope; it is not a Québec label, recipe, measurement, or substitution source. |
| **WP03-SECTIONU-MARJORAM-R338-20261016-S03** | WP05, [Herbes de Provence identity review](wp05-herbes-de-provence-identity-review-20261011.md) and [integration README](../batches/wp05-section-t-spice-blends-identity-integration-20261011/README.md). | Project record showing that marjoram occurs as a component in variable source-specific blends. It supports keeping the blend separate and is not evidence for a standardized marjoram form, ratio, measure, or recipe line. |
| **WP03-SECTIONU-MARJORAM-R338-20261016-S04** | Repository audit of the active references/forms, legacy candidates, research ledger, manifest-listed recipes, proposal/batch archive, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Records exact ownership counts, recipe-line demand, legacy candidate status, and phrase-first picker projection for this proposal. This is project evidence only, not an external botanical or terminology source. |

## Remaining limits

This proposal resolves one open common-herb identity, not Section U as a whole. It does not establish fresh/dried/ground forms, botanical aliases, regional cultivar distinctions, culinary quantities, conversion behavior, or substitutions. The proposed French alias `grand origan` has a deliberate but visible broad-query overlap with the separate dried-oregano row; the reviewer can omit that alias without changing the recommended bilingual displays.
