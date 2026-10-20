# WP03 Section F R563 integration — 2026-10-17

Added the missing CNF 2015 portions for dry white long-grain regular rice, Food Code 4471, to its existing form-level ledger record. R553's CNF 2026 observations remain separate:

- CNF 2015: 100 mL = 78.2 g; 250 mL = 195.5 g.
- CNF 2026: 100 mL = 78.191 g; 250 mL = 195.478 g.

The official [CNF 2015 serving-size page for Food Code 4471](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471) also lists an “amount to make 125ml” entry and zero refuse; neither was added as a portion. The two editions' matching rounded values are not independent kitchen measurements. No active measure, density, mapping, conversion, cooking yield, recipe link, or substitution was added, and generic rice remains unchanged.

## Shared files and static checks

- Updated `docs/catalog/research-ledger.v1.json`, the Section F checklist, `roadmap.md`, the R563 proposal status, and this README. Active reference/form JSON, recipes, and code were unchanged.
- `validate_research_ledger()` accepted **2,169 records** with **0 schema/source errors**. The ledger now has **10,036 source entries**, **8,481 distinct source IDs**, and **7,146 distinct source URLs**.
- Targeted checks confirmed the two R563 observations cite the new record-local CNF 2015 source, R553's 2026 observations remain, UTF-8 without BOM, and a final newline. Local Markdown links and `git diff --check` passed.
- No app tests, build, emulator check, or deployment were run. This change only adds data to the database JSON and documentation; `AGENTS.md` says database-JSON-only additions need no testing.
