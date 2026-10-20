# WP02 Section A7 R984: source-bounded barley-meal evidence review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, forms, legacy identities, research ledger, plan, roadmap, recipes, generated files, or tests are changed.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling products, including the held wheat-meal candidate ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected gap:** The already-open generic `candidate-barley-meal`; this review adds one official, source-bounded definition not present in its current evidence.
- **Scope:** Determine what the current U.S. federal definition and existing Canadian French product-class terminology establish. This is ingredient-identity research, not a product roster.

## Recommendation

**Keep `candidate-barley-meal` unresolved and inactive.** Add one current eCFR source to the candidate only if this proposal is accepted for ledger integration. The new source narrows one regulatory use of *barley meal*: under 21 CFR §101.81, it is unsifted, ground barley grain not processed to separate bran, germ, and endosperm. The same section lists it among dry-milled barley products and defines sieved barley meal separately as an endosperm cell-wall-enriched fraction separated from ground meal. This is a useful source-defined class boundary, but it is part of U.S. health-claim eligibility rules, not a general North American consumer or milling standard. The section’s fiber eligibility criteria are not catalog composition values or health claims for this candidate. [eCFR §101.81(c)(2)(ii)(A)(5)](https://www.ecfr.gov/current/title-21/chapter-I/subchapter-B/part-101/subpart-E/section-101.81)

The source still does not establish a useful grind or particle-size threshold, nor does it show that this unsifted whole-kernel grind is distinct from the existing `whole barley flour` identity. Health Canada’s existing 2012 footnote lists `orge moulue`, `farine d’orge`, and `semoule d’orge` as separate barley-grain product types, but it does not give English-French pairings for those terms, a process definition, or a Québec-preferred display. The Canadian terminology therefore cannot establish `orge moulue` as a catalog alias for *barley meal*. [Health Canada, footnote 5](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/etiquetage-aliments/allegations-sante/examen/evaluation-allegation-sante-sujet-produits-base-orge-diminution-cholesterol.html)

Earlier evidence on the held candidate already documents conflicting generic-looking English use: one cited Canadian milling product applies *barley meal* to cross-cut whole-barley pieces, while another product profile uses the name for whole barley that it crushes and grinds. Those statements remain scoped to their cited products; the new regulatory definition does not make either product evidence transferable to a general meal identity. The existing `barley grits` row, including its product-label portion observation, remains separate and unchanged.

## Existing ownership and demand audit

Read-only checks used the current split seed package, ledger, legacy identity list, and recipe manifest.

| Store | Current snapshot | Finding |
|---|---:|---|
| Ingredient references | 2,001 rows | No active English `barley meal` or French `orge moulue` name or alias. Exact neighboring ownership remains `ingredient-ref-barley-flour` — `barley flour / farine d’orge`; `ingredient-ref-whole-barley-flour` — `whole barley flour / farine d’orge entière`; `ingredient-ref-barley-grits` — `barley grits / gruau d’orge`; and `ingredient-ref-barley-semolina` — `barley semolina / semoule d’orge`. Preserve each identity and its evidence. |
| Ingredient forms | 205 rows | No barley-meal or `orge moulue` form, label, or match term. Existing dry/cooked forms belong to pearl barley and are not transferable. |
| Legacy import identities | 55 candidates | No exact `barley meal`, `whole grain barley meal`, or `orge moulue` owner. |
| Research ledger | 2,406 records | `candidate-barley-meal` remains `needs_clarification`; measurement and substitution states remain `not_yet_researched`. Its existing unresolved decisions are retained. The new eCFR source ID proposed below is unused in the ledger. |
| Recipe corpus | 114 manifest-listed files; 1,123 ingredient rows | Searches of recipe text and ingredient-row text for `barley meal`, `whole grain barley meal`, `barley grits`, `orge moulue`, `gruau d’orge`, and `semoule d’orge` found 0 matching files and 0 matching ingredient rows. No recipe link or recipe edit is supported. |

`WP02-A7-BARLEY-SEMOLINA-R397-20261017-S02` is already recorded on `ingredient-ref-barley-semolina`. Its footnote-5 terminology is reused here only to inspect adjacent category wording; it should not be duplicated onto the meal candidate or treated as a meal-specific definition. The OQLF `farine d’orge` entry is already recorded on the meal candidate and directly supports the existing barley-flour French name only. It does not transfer that name to meal. [OQLF, farine d’orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge)

## Proposed minimal state (not applied)

| Field or store | Proposed value |
|---|---|
| Existing candidate | Keep `candidate-barley-meal`; `identityState: needs_clarification`. |
| New source record | Append only `WP02-A7-BARLEY-MEAL-R984-20261019-S01` to that candidate, scoped to §101.81(c)(2)(ii)(A)(5). Preserve all existing candidate sources. |
| Candidate decision | Retain an unresolved outcome, adding that U.S. claim-rule wording supports one unsifted-ground-barley use but does not establish a general Québec-facing identity or distinguish meal from whole barley flour. Reference the new source only for this bounded definition. |
| Active reference and category | None. Do not create `ingredient-ref-barley-meal` or assign a catalog category while the identity boundary remains unresolved. |
| Names and aliases | Do not add `barley meal`, `orge moulue`, `farine d’orge`, `gruau d’orge`, or `semoule d’orge` to an active row. Existing ownership stays as audited above. |
| Forms and behavior | No forms, measurements, default density, unit mappings, conversions, yields, recipe links, or substitutions. Keep the candidate’s measurement and substitution states unchanged. |

The eCFR distinguishes ground meal from a sieved endosperm-enriched fraction within this rule, but does not set a particle-size range or show how its class maps to Québec retail terminology. It also does not resolve potential overlap with whole barley flour. The identity should be reconsidered only when general-use milling evidence defines a boundary usable in the picker and a Québec-facing French display that does not collide with existing flour, grits, or semolina identities.

The named Anson Mills toasted stone-cut wheat-meal lead remains out of scope as already recorded at R875: **commercial-product counts do not add ingredient diversity**. This review did not pursue that product-only line. Existing branded references and product-scoped evidence remain untouched; no measurement or claim is generalized from a product to generic barley meal.

## Source register

Sources were reviewed on 2026-10-19. The Health Canada and OQLF sources below are already owned by the cited ledger records; they are not new source records in this proposal.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-BARLEY-MEAL-R984-20261019-S01` (proposed) | U.S. Food and Drug Administration, [eCFR, 21 CFR §101.81](https://www.ecfr.gov/current/title-21/chapter-I/subchapter-B/part-101/subpart-E/section-101.81), (c)(2)(ii)(A)(5), accessed 2026-10-19; page current as of 2026-10-15. | Defines barley meal for this section as unsifted, ground barley grain without processing to separate bran, germ, and endosperm; names it within dry-milled barley products and distinguishes sieved barley meal. | Health-claim regulation context; eCFR identifies itself as authoritative but unofficial. The definition does not establish Canadian/Québec consumer meaning, a Québec French display, a particle-size threshold, or a distinct catalog boundary against whole barley flour. Fiber thresholds and claim eligibility remain outside catalog data. |
| Reused `WP02-A7-BARLEY-SEMOLINA-R397-20261017-S02` | Health Canada, [Résumé de l’évaluation d’une allégation santé au sujet des produits à base d’orge](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/etiquetage-aliments/allegations-sante/examen/evaluation-allegation-sante-sujet-produits-base-orge-diminution-cholesterol.html), footnote 5. Current ledger owner: `ingredient-ref-barley-semolina`. | Lists `semoule d’orge`, `orge moulue`, `farine d’orge`, and `son d’orge` separately among barley-grain product types. | The footnote does not pair each French term to an English equivalent or define grind/process. It is a health-claim review, not a Québec naming standard. No health finding or measurement is reused. |
| Existing `WP02-A7-BARLEY-MEAL-20261011-S09` | OQLF, [farine d’orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge). Current candidate source. | Directly pairs Québec French `farine d’orge` with barley flour. | Supports the active flour name only; it does not provide a meal name. |

## Disposition

Record the new eCFR source as a bounded evidence update on the existing unresolved generic candidate only if accepted for later integration. Keep the catalog, forms, recipe package, and all existing branded references unchanged. This documentation-only proposal has no tests or build work.
