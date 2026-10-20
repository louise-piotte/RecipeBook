# WP02/WP03/WP04 R833–R835 gap review integration — 2026-10-19

## Scope and disposition

Integrated two evidence additions and one bounded data-access hold. Broader WP02 Section A7, WP03 Section F, and WP04 Section P work remains open.

- **R833 — granular flour:** completed the substitution-evidence review for the existing Ardent Mills granular-flour identity. Current bilingual product pages and February 2023 portfolios document bakery, dusting, and thickening applications but no replacement ingredient, direction, quantity, ratio, or method. Added a source-bounded no-supported-substitute finding; no active substitution rule was added.
- **R834 — dry parboiled rice:** rechecked access to CNF 2026 Food Code 4472. The official release metadata lists the relational CSV files and the portal’s documented CKAN API, but the file contents and API responses were inaccessible through the available web and workspace paths. No claim is made about row presence, absence, or values. The 2026 join remains open, separate from R825’s completed CNF 2015 observations.
- **R835 — American lobster:** recorded four historical CNF 2015 Food Code 3210 portions for boiled or steamed American (northern) lobster: 100 mL diced = 61.3 g; 250 mL = 153.2 g; one food-guide serving = 75.0 g; 125 mL = 76.6 g. Kept the separately listed 78% refuse field as context only; no shell-on mass or yield was inferred. CNF 2026 continuity was not inspected.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,795 source entries**, **9,085 distinct source IDs**, **7,719 distinct source URLs**, **868 measurement observations**, and **363 substitution findings**. R835 adds three source entries and four measurement observations; R833 adds one substitution finding using four existing Ardent Mills source records; R834 makes no ledger change. No source ID maps to conflicting URLs, and no observation or finding ID is duplicated.

The active catalog remains at **1,886 references and 199 forms**. No active reference, form, alias, generated index, density, unit mapping, conversion, package yield, recipe link, or active substitution rule changed. The bundle remains at **114 recipes** and **1,123 structured ingredient rows**, including **1,097** with an ingredientRefId; no recipe file changed.

## Static validation

- Research-ledger JSON Schema, source-ID/URL integrity, source ownership for the added R835 measurements and R833 finding, and observation/finding-ID uniqueness checks passed.
- Reopened the official [Ardent Mills English](https://ardentmills.ca/products/traditional-wheat/standard-flours/granular-flour/) and [French](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/granular-flour/) product pages and the [English](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf) and [French](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf) February 2023 portfolios. Their use descriptions do not state a substitution relation.
- Rechecked the [official CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), [Health Canada’s CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), the documented [Open Government API](https://open.canada.ca/en/access-our-application-programming-interface-api), and R825’s [CNF 2015 Food Code 4472 page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4472). This did not expose the 2026 Food Code 4472 rows.
- Verified [CNF 2015 Food Code 3210](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3210) and the [CNF 2015 Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html). The serving page supplies the four portions and separate refuse percentage; the guide states portion weights are edible material without refuse.
- The active catalog, generated index, and recipe corpus were unchanged. The research ledger remains stable-format UTF-8 without BOM with its established ASCII escaping. Local links, mojibake scan, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were performed. Under AGENTS.md, database-JSON-only changes need no software tests.

See the [R833 proposal](../../proposals/wp02-section-a7-next-gap-review-r833-20261019.md), [R834 proposal](../../proposals/wp03-section-f-cnf2026-parboiled-rice-row-recheck-r834-20261019.md), and [R835 proposal](../../proposals/wp04-section-p-next-gap-review-r835-20261019.md).
