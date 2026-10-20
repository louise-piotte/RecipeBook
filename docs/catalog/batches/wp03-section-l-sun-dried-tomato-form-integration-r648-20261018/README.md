# WP03 Section L R648 integration — sun-dried tomato form

## Decision

Added one `sun_dried` form under the existing generic `tomatoes / tomates` identity, with the Québec-facing label `tomates séchées au soleil` and English label `sun-dried tomatoes`. The form models the dry state only. The Canadian Food Inspection Agency documents air-packed sun-dried tomato retail samples in Canada; Metro Québec uses the French label for specific products that contain oil and seasonings. The retailer listings were marked out of stock when checked, so no current availability is inferred.

The existing tomato reference and aliases remain unchanged. Oil, vinegar, herbs, package type, cultivar, cut, and hydration are not represented. Metro’s recipe quantities stay source-specific. No measure, density, mapping, conversion, package yield, recipe link, or substitution was added; the 182 g CNF observation for a large raw tomato remains on the generic tomato row and was not transferred to this form.

## Integration and checks

- Added `ingredient-form-tomatoes-sun-dried` to the bundled forms JSON, with the singular phrases as form match terms and null density.
- Added a form-specific `ingredient_form` research-ledger record with four sources and one accepted decision; no measurement observation was added.
- Updated the Section L checklist and progress record, roadmap, and workflow. The Section L parent checklist remains open.
- Static package validation, generated-index freshness, and research-ledger schema/source ownership checks passed. No app tests, build, emulator run, or deployment were needed because this only adds database JSON data under `AGENTS.md`.

## Sources

- [Canadian Food Inspection Agency — 2016–2017 Viruses in Sun-Dried Tomatoes](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/viruses-sun-dried-tomatoes)
- [Metro Québec — Kémia sun-dried tomatoes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil/p/6191457400254)
- [Metro Québec — Tuna salad with sun-dried tomatoes](https://www.metro.ca/recettes-et-occasions/recettes/salade-de-thon-et-tomates-sechees)
- [Metro Québec — Pastene sun-dried tomatoes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil/p/066086016052)

See the [R648 proposal](../../proposals/wp03-section-l-sun-dried-tomato-form-review-r648-20261018.md). Section L remains open.
