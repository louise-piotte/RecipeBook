# WP02 / WP03 / WP04 R552–R554 integration — 2026-10-17

Root reviewed and integrated three bounded proposals. The A4, Section F, and Section P parent checklists remain open.

## R552 — Roasted barley flour

Completed measurement and general home-recipe replacement research on the existing `ingredient-ref-roasted-barley-flour` ledger row. Its measurement state is now `researched_no_supported_value`; its substitution state is `researched_no_supported_substitute`. Added the original roasting study as source `WP02-A4-RBF-MEAS-SUB-R552-20261017-S01`, refreshed the Québec mill's English/French product source records, and updated Eurogerm source `WP02-S145` with the indicative 0.5–5% commercial addition, 25 kg bag, and 100 kg minimum order. The finding preserves the study-specific laboratory water absorption and the commercial range only as evidence. No measurement observations, household amount, density, mapping, form, conversion, yield, recipe link, or active substitution was added. The reference identity and aliases are unchanged.

Root independently reviewed the original study's methods, results, and conclusion; the English and French mill pages; and Eurogerm's Parfen brochure. The study's absorption data is not a kitchen measure or replacement ratio, and the brochure does not state a percentage denominator or replacement basis.

## R553 — Dry white rice, Food Code 4471

Added a form-level evidence record for the existing `ingredient-form-white-rice-dry`. It stores CNF 2026 100 mL = 78.191 g and 250 mL = 195.478 g as two separate `portion_weight` observations linked to four code-specific CNF 2026 CSV source records. These remain edition- and food-code-specific published portions. The 45 g mass-only row is not a volume observation, the refuse row is excluded, and “amount to make 125ml” remains uninterpreted. The generic dry-rice form, active density/mappings, conversions, cooking yield, recipe links, and substitution data are unchanged.

The proposal documents direct retrieval of the four official CNF 2026 relational CSVs, a complete join of all Food Code 4471 conversion rows to measure names/types, and checksums for each downloaded file. The web reader could not open the raw CSV download routes during root review; the recorded values and row join are therefore attributed to the proposal's direct HTTPS retrieval and checksums. Historical CNF 2015 evidence remains separate.

## R554 — Haddock loins / longes d’aiglefin

Accepted a documentation-only hold. Do not add a Haddock-loin form, alias, ledger row, or catalog data. The bilingual High Liner product labels would make bare `loins` and `longes` searches return Haddock alone, while current High Liner Foodservice listings also show Atlantic cod loins; the bundled recipe corpus has no Haddock-loin demand. Keep the species-qualified product wording proposal-local until picker behavior can represent the broader cut scope or a bundled/imported recipe creates a qualified need.

Root reviewed the High Liner Market Cuts bilingual product pages and the High Liner Foodservice Haddock and Atlantic cod product pages. Their serving/package values remain SKU-specific evidence and do not support a generic fish-loin measure or substitution.

## Shared files and validation

- Updated `docs/catalog/research-ledger.v1.json` for R552 and R553 only. No bundled ingredient reference, form JSON, package-yield file, substitution-rule file, recipe, or application code changed.
- Marked the three proposal files integrated and added checked children under the still-open WP02 Section A4, WP03 Section F, and WP04 Section P parents in `docs/RecipeBook-global-ingredient-catalog-plan.txt`.
- Updated `roadmap.md` with the batch outcome and links.
- Static ledger schema validation passed for 2,169 records. All source references added by R552 and R553 resolve on their own records; the five new source IDs had no prior collisions. A whole-ledger source-reference scan also found two dangling references on the unrelated `ingredient-ref-light-corn-syrup` finding (`WP02-C-SYR-20261009-S06` and `WP02-C-SYR-20261009-S07`); that record was not changed in this batch. The ledger contains 10,016 source entries, 8,463 distinct source IDs, and 7,143 distinct source URLs. JSON UTF-8/no-BOM/final-newline checks, local-link checks, and whitespace checks passed. No software tests, build, emulator check, or deployment were run because the active catalog changes only add database JSON data under `AGENTS.md`; R554 is documentation-only.
