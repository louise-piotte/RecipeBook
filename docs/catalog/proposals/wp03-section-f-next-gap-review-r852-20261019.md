# WP03 Section F R852 — Chocolate Strawberry Cheerios identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Plan anchor:** The still-open Section F checklist at [line 5034](../../RecipeBook-global-ingredient-catalog-plan.txt#L5043): “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.”
- **Candidate:** The Canadian limited-edition ready-to-eat cereal `Chocolate Strawberry Cheerios / Cheerios Chocolat et fraise`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference with the exact English and French manufacturer headings. Record no serving observation because the English manufacturer page conflicts on serving mass.
- **Status:** Integrated on 2026-10-19. The bilingual reference and ledger record are merged; the plan and progress records are updated in the [R851–R853 integration README](../batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md).
- **Scope:** This review covers this named Canadian limited-edition product only. It is separate from R849’s standard Chocolate Cheerios identity; the broader Cheerios lineup and Section F checklist remain open.

## Why this is a distinct open item

The current Cheerios Canada product list reports 17 products and lists `Chocolate Strawberry Cheerios` separately from R849’s `Chocolate Cheerios`. The Canadian English product page calls Chocolate Strawberry Cheerios a limited edition, offers a 309 g package, and gives a product description and ingredient declaration. Its product heading and the current English list use the exact title `Chocolate Strawberry Cheerios`; the fetched page metadata title misspells “Strawberry” as “Stawberry,” which is not a catalog term. The paired French manufacturer page uses the heading `Cheerios Chocolat et fraise`, describes the same limited-edition cereal, and also lists 309 g.

The English product page has conflicting serving masses: its promotional copy says 1 cup (38 g), while the Nutrition Facts panel says 1 cup (36 g). The French page reports 1 tasse (38 g) in both places. The English page says to treat the package as authoritative if online details differ, but neither page displays a UPC or package-code crosswalk. The serving evidence therefore does not support one mass for the named packaged product; this proposal records no measurement observation and sets measurement research to `researched_no_supported_value`.

This product is absent from the active reference catalog and has no focused prior review. R849’s decision mentions Chocolate Strawberry only as a distinct neighboring product; that mention did not allocate a reference or sources for it. The Canadian roster page is selection context only: its URL is already represented by R185 and R843 in the ledger, so no existing product-list source record is attached or changed here.

## Primary-source evidence

| Proposed source ID | Primary source and URL | What the page supports and its limits |
|---|---|---|
| `WP03-CHOCOLATE-STRAWBERRY-CHEERIOS-R852-20261019-S01` | General Mills / Cheerios Canada, [Chocolate Strawberry Cheerios](https://www.cheerios.ca/products/chocolate-strawberry-cheerios) | `sourceKind: manufacturer`; `accessedOn: 2026-10-19`; locator: H1, limited-edition description, ingredients, 309 g package statement, serving copy, and Nutrition Facts. The page conflicts: promotional copy says 1 cup (38 g), Nutrition Facts says 1 cup (36 g), and the package governs if online details differ. Its HTML metadata title misspells “Strawberry”; use the H1 and roster wording. |
| `WP03-CHOCOLATE-STRAWBERRY-CHEERIOS-R852-20261019-S02` | General Mills / Cheerios Canada, [Cheerios Chocolat et fraise](https://www.cheerios.ca/fr-CA/products/cheerios-chocolat-et-fraise) | `sourceKind: manufacturer`; `accessedOn: 2026-10-19`; locator: French H1, limited-edition description, ingredients, 309 g package statement, serving copy, and Nutrition Facts. Both page locations say 1 tasse (38 g); the package governs if online details differ. |

For selection context only, the current General Mills / Cheerios Canada [Our Products](https://www.cheerios.ca/products) page, rechecked 2026-10-19, reports 17 products and separately lists Chocolate Strawberry Cheerios and Chocolate Cheerios. The URL already has R185 and R843 ledger owners. This proposal does not attach or modify those existing source entries.

The source pages do not display a UPC or package-code crosswalk. The identity is limited to the current Canadian named product, not guaranteed store availability, a historical package, or future limited-edition formulations.

## Exact proposed data delta

### Active reference

Append this reference to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-chocolate-strawberry-cheerios",
  "nameEn": "Chocolate Strawberry Cheerios",
  "nameFr": "Cheerios Chocolat et fraise",
  "aliasesEn": [],
  "aliasesFr": [],
  "category": "GRAIN_AND_CEREAL",
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z"
}
```

Use the exact bilingual manufacturer headings as the only search terms. Add no alias, form, active measure, density, unit mapping, conversion, yield, recipe link, component identity, or substitution.

### Research ledger

Append this record to `docs/catalog/research-ledger.v1.json`:

```json
{
  "recordId": "ingredient-ref-chocolate-strawberry-cheerios",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-CHOCOLATE-STRAWBERRY-CHEERIOS-R852-20261019-S01",
      "url": "https://www.cheerios.ca/products/chocolate-strawberry-cheerios",
      "title": "Cheerios Canada, Chocolate Strawberry Cheerios",
      "accessedOn": "2026-10-19",
      "locator": "H1; limited-edition description; available 309 g size; ingredients; promotional serving copy; Nutrition Facts serving size; package accuracy disclaimer.",
      "supports": "The English manufacturer page names Chocolate Strawberry Cheerios as a limited-edition cereal and lists a 309 g package. Promotional copy states 1 cup (38 g), while Nutrition Facts states 1 cup (36 g); the page directs users to the package if online information conflicts. This source does not support one serving mass for the packaged product.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-CHOCOLATE-STRAWBERRY-CHEERIOS-R852-20261019-S02",
      "url": "https://www.cheerios.ca/fr-CA/products/cheerios-chocolat-et-fraise",
      "title": "Cheerios Canada, Cheerios Chocolat et fraise",
      "accessedOn": "2026-10-19",
      "locator": "H1; limited-edition description; available 309 g size; ingredients; promotional serving copy; Valeur nutritive serving size; package accuracy disclaimer.",
      "supports": "The French manufacturer page names Cheerios Chocolat et fraise as a limited-edition cereal and lists a 309 g package. Both serving locations state 1 tasse (38 g), but the paired English page conflicts and neither page identifies a package code. Do not use this page alone to resolve the product's serving mass.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only Chocolate Strawberry Cheerios / Cheerios Chocolat et fraise as the current Canadian limited-edition product. The English manufacturer page conflicts between 1 cup (38 g) in promotional copy and 1 cup (36 g) in Nutrition Facts; the French page gives 1 tasse (38 g) in both locations. Do not record a serving observation until package-matched evidence resolves the discrepancy. Add no aliases, forms, active measures, recipe links, conversions, yields, or substitutions.",
      "sourceIds": [
        "WP03-CHOCOLATE-STRAWBERRY-CHEERIOS-R852-20261019-S01",
        "WP03-CHOCOLATE-STRAWBERRY-CHEERIOS-R852-20261019-S02"
      ]
    }
  ]
}
```

No number from these product pages should enter an observation, active measure, density, mapping, conversion, package yield, or generic cereal measure. The differing serving values remain source text only until a package-matched label resolves them.

## Ownership, picker, rules, and recipe audit

| Surface | Current finding |
|---|---|
| Active catalog | The package has 1,889 references. No reference owns `ingredient-ref-chocolate-strawberry-cheerios`, `Chocolate Strawberry Cheerios`, or `Cheerios Chocolat et fraise` in its ID, display, or aliases. The current Cheerios references, including R849’s standard Chocolate Cheerios, remain separate. |
| Forms | The package has 201 forms. No form ID, label, match term, or parent reference is owned by this candidate. No form is proposed. |
| Legacy candidates | No legacy candidate ID, display name, or alias matches the proposed reference ID or exact bilingual title. |
| Research ledger and sources | The 2,297-record ledger has no Chocolate Strawberry reference, proposed R852 source ID, observation, or owner for either direct product-page URL. The name appears only in R849’s sibling-product decision context. The broad product-list URL is already represented under R185 and R843; neither owner is changed or attached to this new reference. |
| Rules | No global or contextual substitution rule refers to this candidate. No conversion or substitution is proposed. The new reference has null density and empty unit mappings. |
| Search projection | `IngredientSearch.kt` checks complete normalized word phrases before partial matches and folds accents. With the proposed reference, `Chocolate Strawberry Cheerios` and `Cheerios Chocolat et fraise` each return only the new row. `Cheerios` remains a family query, increasing from 12 to 13 results. Broad `chocolate` and `chocolat` queries increase from 19 to 20; `strawberry` increases from 6 to 7 and `fraise` from 3 to 4. No broad alias is added. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. No recipe title, description, instruction, ingredient text, or reference link mentions the exact English or French product name or the proposed reference ID. No recipe link or text change is proposed. |

## Boundaries and static checks

- The two direct manufacturer pages support the exact bilingual identity and both list a 309 g package. The identity covers only the currently listed Canadian limited-edition product; it does not imply retail availability or continuation in later seasons.
- The English serving disagreement and the French page’s 38 g serving are not resolved by a displayed package code. Record no serving value or product-code crosswalk.
- Ingredient declarations do not establish proportions or a stable formula. Add no component references, aliases, forms, substitutions, or formulation claims.
- The current [catalog workflow](../ingredient-catalog-workflow.md), [plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [roadmap](../../../roadmap.md), and [R848–R850 integration README](../batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md) were reviewed. The line-5013 checklist parent remains open; this proposal completes no broader Cheerios family or Section F work.
- Static ownership and picker checks found no reference, form, legacy, proposed source-ID, or rule collision. The recipe scan found 114 manifest files and 1,123 ingredient rows.
- The integrated data delta is limited to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` and `docs/catalog/research-ledger.v1.json`, plus the generated index and review documentation. Under `AGENTS.md`, no software tests, build, emulator run, or deployment were needed for these database JSON additions.
