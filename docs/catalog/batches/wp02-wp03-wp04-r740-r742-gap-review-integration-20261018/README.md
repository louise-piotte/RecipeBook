# WP02/WP03/WP04 R740–R742 integration — 2026-10-18

## Decisions

- **R740 — black quinoa flour:** Added one formula-specific `blocked_pending_evidence` finding and its primary-study source to the existing `ingredient-ref-black-quinoa-flour` ledger row. The study used whole black royal quinoa flour in one bread formula at 25 g per 100 g flour, but identifies only supermarket wheat flour and does not match the tested quinoa flour to Naturquinoa's product. No source-flour reference, reusable replacement amount, active rule, form, alias, or recipe link was added.
- **R741 — cooked millet:** Accepted a documentation-only access hold. Health Canada's 2026 listing exposes relational CSV resources, but the Food Code 4492 rows were not available in the review environment. The existing 100/125/250 mL values (73.5/91.9/183.9 g) remain CNF 2015 observations. No 2026 presence or absence claim or shared data change was made; the current-edition join remains open.
- **R742 — Pacific cod:** Added `fresh whole Pacific cod / morue du Pacifique fraîche entière` as one `fresh_whole` form under the existing Pacific-cod identity. Current Metro English/French guidance describes Pacific cod as offered fresh or frozen, whole or in fillets in species context. Canfisco's June 2023 catalogue explicitly lists fresh/frozen Pacific cod as whole round; its current product page confirms supplier activity but does not pair whole-round with fresh. The form makes no SKU, Québec inventory, cleaning-state, measure, yield, conversion, or substitution claim.

## Data boundaries

- Active ingredient references remain unchanged at 1,848. The bundled form count is now 178.
- R740 adds no active catalog behavior. Its study ratio stays attached to the black-quinoa-flour evidence finding, with no `fromIngredientRefId`, `replacements`, or `ruleId`.
- R741 leaves the cooked-millet form and all three CNF 2015 observations unchanged. The CNF 2026 code-4492 row join remains open.
- R742 adds one Pacific-cod form and one form-level ledger record. It reuses existing CFIA/DFO identity sources and adds four product sources. It adds no match terms, density, recipe link, measure, yield, conversion, or substitution.
- The R737–R739 results remain unchanged. All three parent work-plan areas—A6, Section F, and Section P—remain open.

## Static verification

- Bundled seed package normalization completed with **0 changed parts**; `normalize_bundled_seed_package.py --check` passed.
- Generated ingredient catalog remained current at **1,848 references**.
- Research ledger validation passed with **2,235 records and zero errors**. It contains **10,491 source entries, 8,855 distinct source IDs, and 7,502 distinct URLs**; no source ID points to multiple URLs.
- The package contains **114 manifest-listed recipes and 1,123 structured ingredient rows**. The candidate terms had no matching recipe demand, as documented in the R740 and R742 proposals.
- No software tests, build, emulator run, or deployment were performed. R740 and R742 only add database JSON; the updated `AGENTS.md` says this work does not need testing. R741 changes documentation only.

## Review files

- [R740 black-quinoa-flour review](../../proposals/wp02-a6-black-quinoa-flour-substitution-review-r740-20261018.md)
- [R741 CNF 2026 cooked-millet access review](../../proposals/wp03-section-f-cnf-2026-cooked-millet-row-review-r741-20261018.md)
- [R742 Pacific-cod fresh-whole review](../../proposals/wp04-section-p-pacific-cod-fresh-whole-form-review-r742-20261018.md)
- [Global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
- [Workflow checkpoints](../../ingredient-catalog-workflow.md)
- [Roadmap](../../../../roadmap.md)
