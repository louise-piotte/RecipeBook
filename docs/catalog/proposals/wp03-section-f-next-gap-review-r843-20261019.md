# WP03 Section F R843 — Fruity Cheerios identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Plan anchor:** The still-open Section F checklist at [line 5034](../../RecipeBook-global-ingredient-catalog-plan.txt#L5043): “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.”
- **Candidate:** The Canadian manufacturer-listed ready-to-eat product `Fruity Cheerios / Cheerios fruitées`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `ingredient-ref-fruity-cheerios`, with the manufacturer’s exact English and French titles. Record the manufacturer Nutrition Facts serving, 1 cup (38 g), only as a product-specific ledger observation.
- **Status:** Integrated as an identity-only bundled reference and a product-specific research-ledger serving observation. No generic cereal measure or substitution was added. See the [R842–R844 integration README](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md).
- **Scope:** This review covers the named Fruity Cheerios product only. It does not complete or claim a complete Cheerios roster.

## Why this is an open item

The current Cheerios Canada product list shows 17 results and includes Fruity Cheerios. The linked English and French manufacturer product pages identify the named product, show a 311 g package, and publish a 1 cup / 1 tasse (38 g) Nutrition Facts serving. This is a distinct formulated cereal product, not an alias for the cereal's oat, fruit, or starch components.

The active catalog already has nine separate Cheerios products: Cheerios, Apple Cinnamon, Multi-Grain, Strawberry Banana, three Oat Crunch flavors, and standard / Lower Sugar Naturally Flavoured Honey Nut. It has no Fruity Cheerios reference. R180’s Multi-Grain review and R185’s Strawberry Banana review name other current family members as context but do not disposition Fruity Cheerios. A full exact-title and proposed-ID search found no earlier focused review or hold for this item. The latest [R839–R841 integration batch](../batches/wp02-wp03-wp04-r839-r841-gap-review-integration-20261019/README.md) concerns white whole-wheat flour, couscous forms, and Atlantic-cod portions; none overlaps this cereal identity.

The prior [R185 Strawberry Banana Cheerios proposal](wp03-section-f-strawberry-banana-cheerios-identity-review-r185-20261016.md) already records the manufacturer product-list URL as source `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03`. This review rechecked that same current list and adds no claim that one cereal represents the broader family. It records fresh English and French product-page evidence for the proposed product itself.

## Primary-source evidence

| Proposed source ID | Primary source and URL | What the page supports |
|---|---|---|
| `WP03-FRUITY-CHEERIOS-R843-20261019-S01` | General Mills / Cheerios Canada, [Fruity Cheerios](https://www.cheerios.ca/products/fruity-cheerios) | Current English product title and description, ingredients, 311 g offered package, and Nutrition Facts serving of 1 cup (38 g). The page says the package should be treated as authoritative if online details differ. |
| `WP03-FRUITY-CHEERIOS-R843-20261019-S02` | General Mills / Cheerios Canada, [Cheerios fruitées](https://www.cheerios.ca/fr-CA/products/cheerios-fruitees) | Exact French manufacturer title and description, French ingredients, 311 g offered package, and serving of 1 tasse (38 g). The page likewise directs customers to the package if information differs. |
| `WP03-FRUITY-CHEERIOS-R843-20261019-S03` | General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products) | Rechecked 2026-10-19: the Canadian listing displays 17 results and lists Fruity Cheerios among its named product choices. This is family and picker context, not evidence that all listed products must be cataloged. The same URL is already present under R185 source S03; this proposed new source ID captures the refreshed date and specific Fruity Cheerios listing claim. |

The product pages do not provide a UPC or package-code crosswalk. The recommendation is for the named Canadian manufacturer product; it does not assert that every retail package or historical formulation has the same code or composition. The on-page serving is evidence for that product only, not for generic cereal cup mass, density, or conversion.

## Exact proposed data delta

### Active reference

Append one reference to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-fruity-cheerios` |
| `nameEn` | `Fruity Cheerios` |
| `nameFr` | `Cheerios fruitées` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `[]` |
| `category` | `GRAIN_AND_CEREAL` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |

The exact bilingual manufacturer titles are sufficient search terms. Add no brand-family or component aliases, generic cereal identity, form, active measure, density, unit mapping, conversion, yield, recipe link, or substitution.

### Research ledger

Add one `ingredient_reference` record with `recordId: ingredient-ref-fruity-cheerios`, `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. Add the three source entries above. Record one `portion_weight` observation:

| Field | Proposed value |
|---|---|
| `observationId` | `WP03-FRUITY-CHEERIOS-R843-M1-LABEL-1-CUP-38G` |
| `value` / `valueUnit` | `38` / `g` |
| `sourceQuantity` | `1 cup` |
| `observedMassG` | `38` |
| `foodDescription` | `Fruity Cheerios, Canadian manufacturer Nutrition Facts serving` |
| `foodState` | `Ready-to-eat cereal as sold` |
| `measurementMethod` | `Manufacturer Nutrition Facts serving-size label` |
| `quantityBasis` | `Product-specific serving only; no generic cereal measure, physical cup-fill method, density, or unit conversion is established.` |
| `evidenceKind` | `manufacturer_label` |
| `sourceIds` | S01 and S02 above |

Use the French product page to corroborate the same mass and localized title. Do not create an additional observation for `1 tasse`; it is the French rendering of the same serving, not a separate quantity. The serving belongs in the research ledger only; do not add it to active `unitMappings` or an active measure field. The decision should state that the product remains distinct from plain Cheerios, the other named Cheerios products, generic cereal, and its listed component ingredients.

## Ownership, rules, picker, and recipe audit

| Surface | Current finding |
|---|---|
| Active catalog | The package has 1,886 references. No reference owns `ingredient-ref-fruity-cheerios`, `Fruity Cheerios`, or `Cheerios fruitées` in a display or alias field. The nine existing Cheerios references remain separate; none is proposed for rename or merge. |
| Forms | The active package has 201 forms. No form ID, label, match term, or parent reference is owned by the proposed product or exact titles. No form is proposed. |
| Legacy candidates | No candidate ID, display name, or alias in `docs/catalog/legacy-import-identities.v1.json` matches the proposed ID or titles. |
| Research ledger / sources | The 2,294-record ledger has no Fruity Cheerios record, no proposed R843 source ID, and no owner for either product-page URL. The product-list URL is already recorded as R185 source S03; R843 proposes only a new dated source entry for the refreshed listing claim. |
| Rules | Neither global nor contextual substitution rules contain a Cheerios rule. No substitution or conversion is proposed. The new reference keeps null density and empty unit mappings. |
| Search projection | `IngredientSearch.kt` normalizes accents and checks complete word phrases before partial matches. With the proposed reference, `Fruity Cheerios` returns only the new row; accent-folded `Cheerios fruitées` returns the same row. `Cheerios` remains a multi-result query: the nine current product results gain this tenth separately named product. No broad family alias is added. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. No recipe title, description, instruction, ingredient text, or reference link mentions Fruity Cheerios or Cheerios fruitées. No recipe link or text change is proposed. |

## Boundaries and static checks

- The Canadian English and French product pages both state a 311 g offered package and a 38 g household serving. No UPC is displayed, so do not claim code-level package matching.
- The ingredient lists are product declarations and are not encoded as recipe components, aliases, ingredient links, or a reusable formulation.
- The 1 cup (38 g) serving is not a physical measurement protocol. It must not establish an active cup mapping, density, generic cereal measure, conversion, or substitution.
- Read the current [catalog workflow](../ingredient-catalog-workflow.md), [plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [roadmap](../../../roadmap.md), and latest integrated batch. The named line-5003 checklist parent remains open; the latest batch is R839–R841 and does not cover this candidate.
- Static ownership and picker projection checks found no ID/title/form/alias/ledger/rule collision; recipe parsing found 114 files and 1,123 ingredient rows.
- This proposal does not modify database files. If integrated, the proposed change is limited to bundled database JSON plus its approved documentation/checklist updates. Under `AGENTS.md`, data-only database JSON additions do not require software tests, build, emulator run, or deployment. No software tests were run for this proposal.
