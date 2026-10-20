# R860 — Generic egg wash identity review

- **Status:** Integrated on 2026-10-19. The identity and recipe link were added; no reusable measurements or preparation ratios were inferred.
- **Scope:** Resolve the bundled recipe's unlinked generic `Egg wash` ingredient line as a bilingual catalog identity.

## Evidence

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP02-EGG-WASH-IDENTITY-R860-S01` | Office québécois de la langue française, [dorure (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17048956/dorure) | Defines beaten whole eggs or yolks slightly thinned with water as *dorure* and names *dorure à l'œuf*. Its notes also list milk, starch-water, and honey-water coatings, so bare `dorure` is too broad as an alias for an egg-only identity. |
| `WP02-EGG-WASH-IDENTITY-R860-S02` | King Arthur Baking, [How one plant-based milk became our test kitchen's favorite egg wash](https://www.kingarthurbaking.com/blog/2021/11/12/soy-milk-best-vegan-egg-wash) | Describes conventional egg wash as egg whisked with water and brushed on baked goods; discusses plant-based alternatives separately. Its example ratio is source-specific and is not stored as a reusable measure. |

The bundled [hamburger-bun recipe](../../../app/src/main/assets/seed/bundled-library/recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json) contains the unlinked topping line `Egg wash` and uses it to brush buns before baking. That line states no mixture composition or quantity.

## Decision

Add identity-only `egg wash / dorure à l'œuf` under the `EGG` category and link only the exact `Egg wash` line in recipe 072. Keep the generic identity separate from eggs and from unqualified `dorure`, which also names non-egg coatings. Do not add aliases, forms, measures, densities, unit mappings, conversions, yields, or substitutions. Do not activate the source's example ratio for other recipes.

## Integrated data

- Added `ingredient-ref-egg-wash` to `ingredient-references.v1.json` with no aliases, null density, and no unit mappings.
- Linked recipe 072 ingredient row 13 to the new reference, preserving its original text, name, and topping group.
- Added identity evidence to the research ledger. Measurement and substitution research remain `not_yet_researched`.
- Updated the plan's egg checklist, roadmap, and catalog workflow.

The database change adds JSON data only. Per `AGENTS.md`, no software testing was required. Static package and generated-index checks are recorded in the integration README.
