# WP02/WP03/WP04 R990–R992 generic ingredient gap integration

Integrated 2026-10-19 from three proposal-only reviews. This batch continues generic ingredient diversity across flour evidence, fruit, and protein; it did not add or expand a brand, product-line, flavour-family, SKU, or retailer-variant roster.

## Changes

- **R990 — dark buckwheat flour:** kept the existing reference unchanged. Added one primary study source and a blocked, study-scoped substitution finding to its existing ledger record. The sample preparation, 15%/20%/25% replacement levels, dough moisture values, and results belong to the named sample and rusk-oriented bread formula. Applicability to the catalog’s Québec identity remains unresolved. Added no measurement observation, alias, form, rule, or recipe link.
- **R991 — mulberry:** added generic ingredient-ref-mulberry (mulberry / mûre (Morus)) in FRUIT, separate from blackberry / mûre and its Rubus scope. Added source-bounded food-use evidence and three distinct portion observations: USDA SR28 raw mulberries (1 cup = 140 g; 10 fruit = 15 g) and FPED’s 145 g raw/fresh berry cup equivalent. Kept these bases separate; added no default density or unit mapping. Recorded only a qualitative, directional blueberry-to-fresh-mulberry suggestion in a blueberry-crumble context; no amount, active rule, or recipe link was added.
- **R992 — pork:** added generic ingredient-ref-pork (pork / porc) in PROTEIN, without cut or preparation aliases. Recorded Health Canada’s source-specific 75 g cooked Food Guide serving. Its paired 125 mL remains source wording, not a conversion. No recipe row was relinked. Pork substitution research remains not_yet_researched; no finding or rule was added.
- Updated the Section 04 A6, Section M, and Section O checklists with their reviewed child outcomes. The broader parent work in all three sections remains open.
- Reaffirmed the all-category generic-only scope in the shared scope-review record. Existing branded references and product-scoped values remain unchanged.

## Validation

- Live data contains 2,007 ingredient references, 205 forms, and 2,413 research-ledger records.
- The ingredient-reference normalizer check, bundled-package normalization check, and generated Kotlin-index check passed; the package is valid and the index is current at 2,007 references.
- The research ledger passed its JSON Schema 2020-12 and URI-format checks. All 13 new source IDs are registered under exactly one intended record, and the new finding/observation references resolve.
- The recipe audit covered 114 files and 1,123 ingredient rows. There are no mulberry name/ID hits or new ingredient-ID links. The four pork/porc/cochon hits are specific pork ribs, a compound dry rub, boneless shoulder, and boneless loin chops; none was relinked.
- New plan/proposal links resolve. Bundled database JSON is ASCII-escaped with no BOM; edited documentation is UTF-8 without BOM.
- No software tests or builds were run. These changes add generic catalog data to JSON and update its generated index; AGENTS.md exempts database-JSON-only additions from testing.
