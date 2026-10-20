# WP03 Section F R846 — Very Berry Cheerios identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Plan anchor:** The still-open Section F checklist at [line 5034](../../RecipeBook-global-ingredient-catalog-plan.txt#L5043): “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.”
- **Candidate:** Canadian ready-to-eat product `Very Berry Cheerios / Cheerios Petits fruits exquis`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `ingredient-ref-very-berry-cheerios`, with the exact manufacturer English and French titles. Record the manufacturer’s Nutrition Facts serving, 1 cup (36 g), only as product-specific ledger evidence.
- **Status:** Integrated as an identity-only bundled reference and one product-specific research-ledger serving observation. No generic cereal measure or substitution was added. See the [R845–R847 integration README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md).
- **Scope:** This review covers only the named Very Berry product. The broader Cheerios family and Section F checklist remain open.

## Why this is a distinct open item

The current Cheerios Canada product list reports 17 results and separately lists `Very Berry Cheerios`. Its paired manufacturer pages identify the French title as `Cheerios Petits fruits exquis`. Both pages show a 411 g offered package and a 1 cup / 1 tasse (36 g) serving. The product is distinct from the recently integrated `Fruity Cheerios / Cheerios fruitées`: the current English product pages list separate product titles and different ingredient declarations. Fruity Cheerios lists concentrated pear purée and fruit/vegetable juice concentrate; Very Berry lists a dried-berry blend with blueberry, strawberry, cranberry, and raspberry powders. These online ingredient declarations support separate named products; they are not encoded as stable component links or a fixed formulation.

The current active catalog has ten Cheerios references, including R843’s Fruity Cheerios, but no Very Berry reference. A search of active display names and aliases, forms, research-ledger records, legacy candidates, prior focused proposals, and integrated batches found no existing owner or focused disposition for the Very Berry product. [R843](wp03-section-f-next-gap-review-r843-20261019.md) explicitly limits its decision to Fruity Cheerios and says it is not a complete Cheerios roster. The latest [R842–R844 integration batch](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md) covers Janie’s Mill cracked-rye porridge evidence, Fruity Cheerios, and Atlantic-mackerel portions; R846 addresses a separate product title and serving.

## Primary-source evidence

| Source ID disposition | Primary source and URL | What the page supports |
|---|---|---|
| `WP03-VERY-BERRY-CHEERIOS-R846-20261019-S01` | General Mills / Cheerios Canada, [Very Berry Cheerios](https://www.cheerios.ca/products/very-berry-cheerios) | English product title and description, ingredient declaration, 411 g offered package, and Nutrition Facts serving of 1 cup (36 g). The page says the package should be treated as authoritative if online details differ. |
| `WP03-VERY-BERRY-CHEERIOS-R846-20261019-S02` | General Mills / Cheerios Canada, [Cheerios Petits fruits exquis](https://www.cheerios.ca/fr-CA/products/cheerios-petits-fruits-exquis) | Exact French manufacturer title and ingredient declaration, 411 g offered package, and Nutrition Facts serving of 1 tasse (36 g). It likewise directs customers to the package if information differs. |

For review-selection context only, General Mills / Cheerios Canada [Our Products](https://www.cheerios.ca/products), rechecked 2026-10-19, reports 17 results and displays Very Berry separately from Fruity Cheerios. That URL already has R185 and R843 ledger owners. Because S01 and S02 directly support the proposed identity and serving, this proposal does not attach or modify either existing product-list source entry.

Neither product page displays a UPC or package-code crosswalk. The proposal concerns the named Canadian manufacturer product and does not claim code-level identity across retail packages or historical formulations. The source pages warn that online product information can change and the actual package governs if details differ.

## Exact proposed data delta

### Active reference

Append one reference to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-very-berry-cheerios` |
| `nameEn` | `Very Berry Cheerios` |
| `nameFr` | `Cheerios Petits fruits exquis` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `[]` |
| `category` | `GRAIN_AND_CEREAL` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-19T00:00:00Z` |

Use the two exact bilingual product titles as the only search terms. Add no broader Cheerios-family or berry aliases, form, active measure, density, unit mapping, conversion, yield, recipe link, or substitution.

### Research ledger

Append one record to `docs/catalog/research-ledger.v1.json` with `recordType: ingredient_reference`, `recordId: ingredient-ref-very-berry-cheerios`, `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. Add new source entries S01 and S02 and one `portion_weight` observation:

| Field | Proposed value |
|---|---|
| `observationId` | `WP03-VERY-BERRY-CHEERIOS-R846-M1-LABEL-1-CUP-36G` |
| `value` / `valueUnit` | `36` / `g` |
| `sourceQuantity` | `1 cup` |
| `observedMassG` | `36` |
| `foodDescription` | `Very Berry Cheerios, Canadian manufacturer Nutrition Facts serving` |
| `foodState` | `Ready-to-eat cereal as sold` |
| `measurementMethod` | `Manufacturer Nutrition Facts serving-size label` |
| `quantityBasis` | `Product-specific serving only; no generic cereal measure, physical cup-fill method, density, or unit conversion is established.` |
| `evidenceKind` | `manufacturer_label` |
| `sourceIds` | S01 and S02 above |

The French 1 tasse (36 g) label corroborates the same product serving; do not create a second observation. Keep this value in the research ledger only. It does not establish package-code matching, generic cereal cup mass, physical fill method, active measure, density, mapping, conversion, or substitution.

## Ownership, picker, rules, and recipe audit

| Surface | Current finding |
|---|---|
| Active catalog | The package has 1,887 references. No reference owns `ingredient-ref-very-berry-cheerios`, `Very Berry Cheerios`, or `Cheerios Petits fruits exquis` in a display or alias field. The ten existing Cheerios identities remain separate; none is proposed for rename or merge. |
| Forms | The package has 201 forms. No form ID, label, match term, or parent reference is owned by this candidate. No form is proposed. |
| Legacy candidates | No candidate ID, display name, or alias in `docs/catalog/legacy-import-identities.v1.json` matches the proposed ID or titles. |
| Research ledger / sources | The 2,295-record ledger has no Very Berry record, R846 source ID, observation ID, or owner for either product-page URL. The product-list URL is already represented under R185 and R843, but remains review-selection context only; neither existing entry is changed or attached to this reference. |
| Rules | No global or contextual substitution rule refers to the candidate or Cheerios family. No substitution or conversion is proposed. The new reference keeps null density and empty unit mappings. |
| Search projection | `IngredientSearch.kt` checks complete normalized word phrases before partial matches and folds accents. With the proposed reference, `Very Berry Cheerios` and `Cheerios Petits fruits exquis` each return only the new row. `Cheerios` remains a family query, increasing from ten to eleven results. The existing `petits fruits` query already returns Oatmeal Crisp Triple Berry; the new French title adds Very Berry as a second result without adding a broad alias. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. No recipe title, description, instruction, ingredient text, or reference link mentions Very Berry Cheerios or Cheerios Petits fruits exquis. No recipe link or text change is proposed. |

## Boundaries and static checks

- The manufacturer pages list the product as 411 g and show a 1 cup / 1 tasse (36 g) serving. No UPC is displayed; do not claim a product-code crosswalk.
- The online ingredient lists are source-specific declarations. Do not encode component links, aliases, substitutions, or a stable product formula from them.
- The serving is not a physical measurement protocol and cannot establish a generic cereal cup measure, density, mapping, or conversion.
- Read the current [catalog workflow](../ingredient-catalog-workflow.md), [plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [roadmap](../../../roadmap.md), and [R842–R844 integration README](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md). The line-5003 checklist parent remains open; this proposal completes no broader family or Section F work.
- Static ownership and picker projection found no reference, form, ledger observation, new source-ID, alias, or rule collision. Recipe parsing found 114 manifest files and 1,123 ingredient rows.
- If accepted, the data delta is limited to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` and `docs/catalog/research-ledger.v1.json`; this proposal is the only file created for R846.
- This is a proposal-only document. If integrated, active changes are limited to bundled database JSON plus approved documentation/checklist updates. Under `AGENTS.md`, adding database JSON data does not require software tests, build, emulator run, or deployment. No software tests were run for this review.
