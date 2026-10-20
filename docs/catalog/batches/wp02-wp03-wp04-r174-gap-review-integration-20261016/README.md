# WP02/WP03/WP04 R174 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Chinese water chestnut starch](../../proposals/wp02-alternative-flour-starch-gap-review-r174-20261016-worker1.md), [Québec oat-rice product and hulless-oat boundary](../../proposals/wp03-section-f-cereal-mix-preprocessed-grain-gap-review-r174-20261016-worker2.md), and [Filipino tuyo boundary](../../proposals/wp04-section-p-regional-seafood-gap-review-r174-20261016-worker3.md).

## Integrated decisions

- **WP02 Section 04 B3 — Chinese water chestnut starch:** Added identity-only `Chinese water chestnut starch / amidon de châtaigne d’eau chinoise` for extracted *Eleocharis dulcis* corm starch. The French display is descriptive and provisional. The research paper distinguishes whole-corm flour from extracted starch, while the current Canadian product title does not state a species; mapping that unqualified retail wording to *E. dulcis* remains an inference. No aliases, form, density, unit mapping, conversion, yield, recipe link, or reusable substitution was added. `candidate-water-chestnut-flour` remains unresolved; *Trapa* Singoda flour and the water-chestnut vegetable stay separate.
- **WP03 Section F — hulless oats:** Added `hulless oats` and `avoine nue` as aliases to `ingredient-ref-oat-groats`. Kept `Organic Oat Rice` and `Riz d’avoine biologique` out of aliases because they would insert oat groats into broad `rice` and `riz` queries. No separate rice-style identity or cooked form was added; package quantities and cooking wording remain source-specific.
- **WP04 Section P — tuyo:** Held unqualified `tuyo / tuyong isda` outside active references, forms, legacy mappings, and the research ledger. Philippine sources use the term across dried-fish descriptions, while Canadian listings cover dried-herring and further prepared products. No stable species-neutral catalog scope or Québec French product name is established, and the bundled recipe corpus has no demand. Proposal-local IDs remain unallocated.

## Source registration

- Added seven new source IDs and URLs to the research ledger: four for the starch identity and three for the oat-groats alias decision.
- Reused five existing source records on the starch identity and one TERMIUM source on oat groats. These add six source entries but no source IDs or URLs.
- Total ledger change: one new ingredient-reference record, twelve source entries, seven distinct source IDs, and seven distinct URLs. No tuyo source was allocated to the shared ledger.

## Static validation

- Bundled package validation and normalization check passed. Ingredient-reference normalization passed, and the generated Kotlin catalog is current at **1,550 references**.
- Research-ledger schema validation passed with **1,895 records and zero errors**. Record IDs remain sorted and unique.
- Static picker projection confirmed `water chestnut starch` returns the new starch row; `water chestnut` and `châtaigne d’eau` return both the existing vegetable and the new starch; `chestnut starch` returns tree-chestnut starch and the new row. `water chestnut flour` remains unassigned. `hulless oats` and `avoine nue` each return only oat groats. The rice-style title phrases remain unassigned, and broad `rice` / `riz` results remain at **66 / 61**.
- A manifest-ordered scan covered **114 recipe files / 1,123 ingredient rows** and found no R174 candidate terms or ingredient links.
- Bundled database JSON remains ASCII-escaped, UTF-8 files have no BOM, and the scoped local-link and whitespace checks passed.
- Totals: **1,550 references**, **120 forms**, **1,895 ledger records / 8,128 source entries / 6,947 distinct source IDs / 5,743 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No software tests, builds, emulator checks, or deployment were run. This batch only adds or updates database JSON data and documentation under the `AGENTS.md` rule.

Sections 04 B3, F, and P remain open for broader candidate coverage.
