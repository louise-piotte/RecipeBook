# R1022–R1024 generic ingredient integration

Reviewed 2026-10-19. This cross-category batch adds two identity-only generic ingredients, maintains one existing evidence-bounded hold, and pursues no commercial-product roster.

## Decisions

- **R1022 — corn bran flour / farine de son de maïs:** Added `ingredient-ref-corn-bran-flour` as `FLOUR_AND_STARCH`. The French display is descriptive and provisional. The steamed-bread study names corn bran flour; a USDA ARS cake-study abstract independently documents food-grade milled corn bran used as a flour substitute. Keep each study's grind, sample, formulation percentages, and results source-scoped. No aliases, forms, measures, recipe links, conversions, yields, or active substitutions were added. Keep this identity distinct from corn bran, cornmeal, corn flour, corn germ, corn fibre, composite bran-enriched flour, and prepared cereal products.
- **R1023 — moringa pods / gousses de moringa:** Added `ingredient-ref-moringa-pods` as `VEGETABLE_AND_AROMATIC`, scoped to culinary pods of *Moringa oleifera*. Keep it separate from the existing moringa-leaves entry and other plant parts. Omit `drumstick` as an alias because it is ambiguous with chicken. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added; leaf-specific observations remain on the leaf identity.
- **R1024 — sea-urchin gonads / uni:** Maintained the existing unresolved `candidate-sea-urchin-gonads-uni` record. The reviewed bundle has no matching recipe demand, and the candidate's existing activation condition remains unmet. No active reference, alias, form, measure, recipe link, or substitution was added. Existing retailer-pack observations and historical fishery evidence remain with their current owners.

## Scope and evidence boundaries

- All three assignments covered generic milling, produce-part, or seafood identity questions. No brand, product-line, flavour-family, SKU, or retailer-variant-only task was found in this batch. The already dispositioned Section F cereal rosters and named Anson Mills product lead remain out of scope because commercial-product counts do not add ingredient diversity.
- Existing branded rows were preserved. Product-specific measurements and claims were not moved to generic ingredient records without a separate transferability review.
- The corn-bran studies establish the ingredient's food use but not a universal flour grade, household measure, density, or replacement ratio. The 2011 USDA ARS abstract is explicitly an abstract-only study; its milling and formula details remain attached to that source.
- Moringa source examples support the species and edible pod boundary. The food-composition record's per-100-g nutrition values are not kitchen measures; existing leaf recipe amounts were not transferred.
- The MAPAQ source URL in R1024 currently redirects when opened directly. The hold remains based on the existing candidate's explicit activation condition and the recipe-demand audit, not on assigning new evidence to that source.

## Static checks

Snapshot before integration: 2,033 references, 205 forms, 2,438 ledger records, 55 legacy candidates, and 114 recipes / 1,123 structured ingredient rows.

Post-integration counts: **2,035 references**, **205 forms**, **2,440 ledger records** with **11,418 source entries**, **55 legacy candidates**, and **114 recipes / 1,123 structured ingredient rows**. The sea-urchin candidate remains unresolved and unchanged.

- `normalize_bundled_seed_package.py` reported zero changed parts; package validation passed.
- Ingredient references are normalized; the generated catalog index is current at 2,035 references.
- `validate_research_ledger()` accepted all 2,440 records with zero errors.
- Each new reference and ledger record has exactly one owner. The shared CFIA bran naming source and OQLF moringa source retain their prior owners and are also scoped to the new identity records.
- Neither new ingredient phrase occurs in the 114 bundled recipes; no forms, recipe links, or recipe-specific quantities were added.
- JSON files are UTF-8 without BOM; French accents in bundled JSON remain explicit Unicode escapes. Nine maintained Markdown files passed UTF-8/no-BOM, final-newline, local-link, and whitespace checks; scoped `git diff --check` passed.

No software tests, build, emulator check, or deployment were run because the active app-data changes only add database JSON under `AGENTS.md`.

See the [R1022 milling review](../../proposals/wp02-next-generic-milling-gap-review-r1022-20261019.md), [R1023 produce review](../../proposals/wp03-next-generic-produce-gap-review-r1023-20261019.md), and [R1024 seafood review](../../proposals/wp04-next-generic-seafood-gap-review-r1024-20261019.md).
