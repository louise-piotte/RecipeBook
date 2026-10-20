# WP03 Section F R849 — Chocolate Cheerios identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated as an identity-only reference and product-specific 1 cup (38 g) ledger observation. See the [R848–R850 integration README](../batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md).
- **Plan anchor:** The still-open Section F checklist at [line 5034](../../RecipeBook-global-ingredient-catalog-plan.txt#L5043): “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.”
- **Candidate:** Current Canadian ready-to-eat cereal `Chocolate Cheerios / Chocolat Cheerios`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference with the exact bilingual manufacturer titles. Record 1 cup (38 g) only as this product’s manufacturer-label serving observation.
- **Scope:** This review covers only the named Chocolate Cheerios product. The broader Cheerios lineup and Section F checklist remain open.

## Why this is a distinct open item

General Mills / Cheerios Canada’s current English product list reports 17 products and displays `Chocolate Cheerios` separately from `Chocolate Strawberry Cheerios`. The paired Canadian product pages title the cereal `Chocolate Cheerios` and `Chocolat Cheerios`; both show a 420 g package and a serving of 1 cup / 1 tasse (38 g). This is a separate branded, ready-to-eat cereal from plain Cheerios and the distinct Chocolate Strawberry product.

The active reference catalog has 11 Cheerios identities after R846, including Very Berry Cheerios, but no Chocolate Cheerios identity. Exact searches of active names and aliases, forms, legacy candidates, ledger records, and the proposal and batch archives found no existing owner or focused review for this product. The product-list page is contextual evidence only here: its URL already has ledger owners under R185 and R843, and the direct English/French product pages provide the identity and serving evidence needed for this proposal.

The product pages provide ingredient declarations, but those declarations do not establish ingredient proportions or a stable formulation. They support keeping this named product distinct; they do not support component links, measures, forms, or substitutions.

## Primary-source evidence

| Proposed source ID | Primary source and URL | What the page supports |
|---|---|---|
| `WP03-CHOCOLATE-CHEERIOS-R849-20261019-S01` | General Mills / Cheerios Canada, [Chocolate Cheerios](https://www.cheerios.ca/products/chocolate-cheerios) | English manufacturer title and product description, ingredient declaration, 420 g offered package, and serving size of 1 cup (38 g). The page says the package governs if online details differ. |
| `WP03-CHOCOLATE-CHEERIOS-R849-20261019-S02` | General Mills / Cheerios Canada, [Chocolat Cheerios](https://www.cheerios.ca/fr-CA/products/chocolat-cheerios) | Exact French manufacturer title and product description, ingredient declaration, 420 g offered package, and serving of 1 tasse (38 g). It likewise directs customers to the package if information differs. |

For selection context only, the current General Mills / Cheerios Canada [Our Products](https://www.cheerios.ca/products) page, rechecked 2026-10-19, lists Chocolate Cheerios and Chocolate Strawberry Cheerios separately among 17 products. That URL is already represented by R185 and R843 in the ledger. This proposal does not attach or modify the existing product-list source records.

Neither product page displays a UPC or package-code crosswalk. The proposed identity is scoped to the named Canadian manufacturer product; it does not claim package-code matching across retail packages or historical formulations. The pages warn that online ingredients and nutrition details can change and the package governs if they differ.

## Exact proposed data delta

### Active reference

Append one reference to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-chocolate-cheerios` |
| `nameEn` | `Chocolate Cheerios` |
| `nameFr` | `Chocolat Cheerios` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `[]` |
| `category` | `GRAIN_AND_CEREAL` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-19T00:00:00Z` |

Use the exact bilingual product titles as the only search terms. Add no alias, form, active measure, density, unit mapping, conversion, yield, recipe link, component identity, or substitution.

### Research ledger

Append one record to `docs/catalog/research-ledger.v1.json` with `recordType: ingredient_reference`, `recordId: ingredient-ref-chocolate-cheerios`, `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. Add the two new sources above and one `portion_weight` observation:

| Field | Proposed value |
|---|---|
| `observationId` | `WP03-CHOCOLATE-CHEERIOS-R849-M1-LABEL-1-CUP-38G` |
| `value` / `valueUnit` | `38` / `g` |
| `sourceQuantity` | `{"amount": 1, "unit": "cup"}` |
| `observedMassG` | `38` |
| `foodDescription` | `Chocolate Cheerios, Canadian manufacturer Nutrition Facts serving` |
| `foodState` | `Ready-to-eat cereal as sold` |
| `measurementMethod` | `Manufacturer Nutrition Facts serving-size label` |
| `quantityBasis` | `Product-specific serving only; no generic cereal measure, physical cup-fill method, density, or unit conversion is established.` |
| `evidenceKind` | `manufacturer_label` |
| `sourceIds` | S01 and S02 above |

The French label corroborates the same serving; do not create a second observation. Keep the 38 g value in the research ledger only. It does not establish generic cereal cup mass, a physical fill method, an active measure, density, mapping, conversion, package yield, or substitution.

## Ownership, picker, rules, and recipe audit

| Surface | Current finding |
|---|---|
| Active catalog | The package has 1,888 references. No reference owns `ingredient-ref-chocolate-cheerios`, `Chocolate Cheerios`, or `Chocolat Cheerios` in an ID, display, or alias field. The 11 current Cheerios identities remain separate; none is proposed for rename or merge. |
| Forms | The package has 201 forms. No form ID, label, match term, or parent reference is owned by this candidate. No form is proposed. |
| Legacy candidates | No legacy candidate ID, display name, or alias matches the proposed reference ID or exact titles. |
| Research ledger and sources | The 2,296-record ledger has no Chocolate Cheerios reference, proposed source ID, observation ID, or owner for either product-page URL. The broad product-list URL is already represented under R185 and R843; those source entries are not changed or attached to this product. |
| Rules | Neither global nor contextual substitution rules refer to the candidate. No conversion or substitution is proposed. The new reference keeps null density and empty unit mappings. |
| Search projection | `IngredientSearch.kt` checks complete normalized word phrases before partial matches and folds accents. With the proposed reference, `Chocolate Cheerios` and `Chocolat Cheerios` each return only the new row. `Cheerios` remains a family query, increasing from 11 to 12 results; the broad `chocolate` and `chocolat` queries each increase from 18 to 19. No broad alias is added. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. No title, description, instruction, ingredient text, or reference link mentions Chocolate Cheerios or Chocolat Cheerios. No recipe link or text change is proposed. |

## Boundaries and static checks

- The paired manufacturer pages list a 420 g offered package and the same 1 cup / 1 tasse (38 g) serving. No UPC is displayed; do not claim a product-code crosswalk.
- Ingredient declarations are source-specific and do not define the product’s full stable formula. Do not encode component links, aliases, substitutions, or formulation claims.
- The manufacturer label serving does not establish a generic cereal cup measure, density, mapping, or conversion.
- The current [catalog workflow](../ingredient-catalog-workflow.md), [plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [roadmap](../../../roadmap.md), and [R845–R847 integration README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md) were reviewed. The line-5013 checklist parent remains open; this proposal completes no broader Cheerios family or Section F work.
- Static checks found no active reference, form, legacy, source-ID, observation-ID, or rule collision. The recipe scan found 114 manifest files and 1,123 ingredient rows.
- Integrated the reference and ledger observation, regenerated the bundled picker index, and left recipes/forms/rules unchanged.
- No software tests, build, emulator, or deployment were run for this database-JSON-only integration under `AGENTS.md`.
