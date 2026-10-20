# WP02 plan generic gap R945: citric-acid identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated as an identity-only reference; see the [R945–R947 integration README](../batches/wp02-wp03-wp05-r945-r947-generic-gap-integration-20261019/README.md).
- **Open-plan anchor:** WP02 Section E remains open for leavening, fermentation, gelling, and technical baking ingredients; the exact open item includes citric acid ([plan, Section E](../../RecipeBook-global-ingredient-catalog-plan.txt#L4359); [open technical-ingredient item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4429)).
- **Selected gap:** Generic food-grade citric acid / `acide citrique`.
- **Integrated change:** Added one identity-only `BAKING_AND_SPICE` reference. Added no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

## Recommendation and identity boundary

The current Health Canada permitted-additives list names citric acid as an acidity regulator in specific food classes, including fruit jams and jellies, marmalades, canned fruits and vegetables, tomato products, pickles and relishes, and other listed uses subject to the applicable conditions. OQLF places `acide citrique` in the food-additive domain and documents its use in jams, carbonated beverages, preserves, and confectionery. Together these support one generic culinary ingredient identity for citric acid used as a food acidity regulator. They do not provide a household recipe amount or a general home-preservation instruction. [R945-S01; R945-S02]

Use `citric acid` / `acide citrique` for the food-grade acid itself. Keep it distinct from lemon and lime juice, cream of tartar (potassium bitartrate), tartaric acid, and citrate salts such as sodium citrate. Do not imply that the acid is obtained from citrus in every case: OQLF notes industrial production methods, while the Canadian permitted-use list identifies the substance by name. Do not add `sour salt`, `lemon salt`, `citrate`, or other aliases without separate terminology and picker-boundary evidence.

The prior WP02 Section E terminology review found these exact bilingual names unowned and found no bundled recipe demand, so it did not promote the identity. R945 does not claim new recipe demand. It recommends identity-only coverage because the generic food-use evidence supports an ingredient class in the still-open permitted-additive inventory; no numeric or recipe behavior follows from that evidence. See the [2026-10-12 technical-baking terminology review](./wp02-section-e-technical-baking-quebec-french-review-20261012.md).

## Scope and product boundary

This review uses only generic ingredient terminology and official generic food-use evidence. It does not research brands, product lines, flavour families, SKUs, or retailer variants. A queued task limited to those commercial rosters is out of scope because commercial-product counts do not add ingredient diversity; stop that line of work and select a generic ingredient gap. Preserve existing branded rows and their product-scoped evidence. Recommend no merge or deletion without a separate transferability review.

## Ownership, aliases, recipe demand, and nearby identities

Read-only audit of the current repository data on 2026-10-19:

| Surface | Current state | Proposed boundary |
| --- | --- | --- |
| Ingredient references | 1,964 references. No row owns `ingredient-ref-citric-acid`, `citric acid`, `acide citrique`, `sour salt`, or `lemon salt`. | Add one exact bilingual identity, with no aliases. |
| Ingredient forms | 205 forms; no exact citric-acid name or form hint. | Add no presentation or processing form. |
| Legacy identities | 55 candidates; no exact proposed ID or name. | No legacy promotion or merge. |
| Research ledger | At the review snapshot, 2,369 records contained no standalone citric-acid record or candidate. Six unrelated records mention citric acid incidentally in source or decision text, including ingredient declarations or product descriptions; none owns the acid as an ingredient identity or supplies a recipe link, transferable measure, or conversion. The Health Canada list URL is already recorded on ammonium-bicarbonate and ammonium-carbonate records under `WP02-E-AMMONIA-REREVIEW-20261012-S04`. | Added one `ingredient_reference` record and reused the source IDs below. Added no measurement observations or substitution findings. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned, including the full recipe text. No `citric acid`, `acide citrique`, or `ingredient-ref-citric-acid` match occurs. | No recipe link or amount is justified by current bundled demand. |

The current nearby active identities are lemon juice, lime juice, and cream of tartar. Lemon and lime juice are whole acidic ingredients; cream of tartar is potassium bitartrate. Keep their current names, aliases, and categories unchanged. The prior terminology review's six phrase hits in the research ledger are incidental source descriptions for unrelated identities such as mashed banana, sun-dried tomatoes, ayran, kaya, meringue powder, and seasoning salt, rather than citric-acid ownership.

The OQLF URL was not previously represented in the ledger; the integrated record uses the prior terminology review source ID `WP02-E-TECHBAKING-QC-20261012-S04`. The existing Health Canada source ID above is reused from its ammonium-bicarbonate and ammonium-carbonate records.

## Evidence limits

The Health Canada list is a regulatory source for permitted additive uses. Its enumerated foods, purpose, and use conditions are not a household dose, universal food-use authorization, food-grade specification, or safe home-canning procedure. The current listed jam/jelly/marmalade use is tied to provisions in Volume 10 of the Food Compositional Standards Document; keep that condition intact if describing it.

OQLF's food-additive entry was last updated in 1987. It supports the Québec French display, English equivalent, and historical food-use context; the current Health Canada list supplies the more recent generic use evidence. Neither source supports a household measure, density, conversion, recipe substitution, or package claim. Keep all those fields empty pending separate evidence.

## Proposed identity-only data

The integrated identity-only reference is:

```json
{
  "id": "ingredient-ref-citric-acid",
  "nameEn": "citric acid",
  "nameFr": "acide citrique",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "BAKING_AND_SPICE"
}
```

The `ingredient_reference` ledger record uses `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It reuses `WP02-E-AMMONIA-REREVIEW-20261012-S04` for the Health Canada URL, scoped to citric acid's C.16 entry and its listed acidity-regulator uses. It reuses `WP02-E-TECHBAKING-QC-20261012-S04` for OQLF's exact bilingual name pair and food-additive domain. No aliases, forms, measurements, conversions, yields, recipe links, or substitution findings were added.

## Evidence and source limits

| Review source | Source and support | Limit |
| --- | --- | --- |
| **R945-S01; reuse `WP02-E-AMMONIA-REREVIEW-20261012-S04`** | Health Canada, [List of Permitted Acidity Regulators and Acid-Reacting Materials](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/lists-permitted/10-adjusting-agents.html), item C.16 `Citric Acid`; published 2025-10-20, superseding the 2024-12-18 list. The table names its use as an acidity regulator in listed fruit jams/jellies/marmalades, canned products, tomato products, pickles/relishes, and other specified foods. | Current Canadian regulatory evidence for enumerated permitted food uses and conditions, not an unqualified statement about every food or a recipe amount. The item’s jam/jelly/marmalade conditions incorporate specified Food Compositional Standards provisions. The exact URL is already recorded on ammonium-bicarbonate and ammonium-carbonate ledger records; reuse the existing source ID. |
| **R945-S02; reuse `WP02-E-TECHBAKING-QC-20261012-S04`** | Office québécois de la langue française, [*acide citrique* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086269/acide-citrique), food-additive domain, preferred term and English translation; updated 1987. Its note describes use in jams, carbonated beverages, preserves, and confectionery. | Supports the exact French/English term pair and generic terminology context. The entry is dated and does not establish current permitted use conditions, a household dose, or a recipe conversion. The source ID appears in the prior terminology proposal but has no current ledger owner. |

## Remaining uncertainty

1. The identity is supported as a generic food acidity regulator, but no bundled recipe currently requests it.
2. No household measure, density, conversion, package yield, or general substitute is supported.
3. Keep citrate salts and other acids separate. Do not expand aliases from ingredient-list mentions in unrelated products.
4. Preserve branded rows and product-scoped claims. No commercial roster was pursued because product counts do not add ingredient diversity.

No software tests were run because the catalog change only adds database JSON under `AGENTS.md`; static validation is recorded in the integration README.
