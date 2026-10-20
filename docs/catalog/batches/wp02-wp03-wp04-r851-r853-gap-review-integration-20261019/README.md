# WP02/WP03/WP04 R851–R853 integration — 2026-10-19

Integrated three distinct research-ledger/catalog gaps. The broader Section A7, Section F, and
Section P checklists remain open.

## Changes

- **R851 — spring wheat semolina:** completed a bounded substitution review for the existing
  Canadian Red Spring Wheat semolina identity. The Canadian mill pages list applications but no
  replacements. U.S. Wheat Associates' statement runs in the direction U.S. Hard Red Spring flour or
  semolina → alternative to traditional durum semolina for pasta. It does not match the exact
  Canadian product or provide a grade, formula, amount, or ratio, so the ledger retains it only as a
  rejected, class-level lead. The accepted finding has no replacements; no active rule or catalog
  behavior changed.
- **R852 — Chocolate Strawberry Cheerios:** added identity-only `Chocolate Strawberry Cheerios /
  Cheerios Chocolat et fraise` as a distinct Canadian limited-edition `GRAIN_AND_CEREAL` product.
  The English page conflicts between 1 cup (38 g) in promotional text and 1 cup (36 g) in Nutrition
  Facts. Its paired French page says 1 tasse (38 g), but neither page identifies a package code, so
  no serving observation was recorded. No form, generic measure, component link, recipe link, or
  substitution was added.
- **R853 — Rainbow Trout:** recorded three historical CNF 2015 Food Code 3206 portions for the named
  wild, baked-or-broiled row: 100 mL flaked = 57.5 g, 250 mL = 143.7 g, and one food-guide serving =
  75.0 g. Keep the separate 65% refuse as context. The measures are not transferred to the current
  fresh-whole form; no raw mass, yield, density, or reusable conversion was inferred. CNF 2026 row
  continuity remains unchecked because the official dataset listing returned HTTP 403 in the web
  reader.

## Static validation

- The bundled package validator passed with `--validate-only`; package normalization passed with
  `--check`. The generated Kotlin reference index is current at 1,890 references.
- Research-ledger schema validation passed: 2,298 records, 10,834 source entries, 9,106 distinct
  source IDs, 7,739 distinct source URLs, 886 measurement observations, and 369 substitution
  findings. Source IDs map consistently to one URL; observation and finding IDs are unique. All
  R851–R853 citations resolve on their owning ledger records.
- The package contains 1,890 ingredient references and 201 forms. Its manifest lists 114 recipes and
  1,123 ingredient rows, including 1,097 with an `ingredientRefId`.
- Phrase-first picker projection returns the new row alone for `Chocolate Strawberry Cheerios` and
  `Cheerios Chocolat et fraise`; `Cheerios` returns 13 products, while `chocolate` and `chocolat`
  return 20 each. The R851 ledger-only finding does not change picker terms.
- A manifest-listed recipe scan found no R851–R853 candidate name or reference ID in the 114 recipes
  or 1,123 ingredient rows. No bundled recipe was edited.
- UTF-8/no-BOM, local Markdown links and plan line anchors, and scoped whitespace checks passed for
  the integration documents. The full worktree has unrelated pre-existing modifications; they were
  left untouched.
- No software tests, application build, emulator run, or deployment were performed. These catalog
  additions are database JSON data, and `AGENTS.md` exempts such changes from software testing.

## Review records

- [R851 proposal](../../proposals/wp02-section-a7-next-gap-review-r851-20261019.md)
- [R852 proposal](../../proposals/wp03-section-f-next-gap-review-r852-20261019.md)
- [R853 proposal](../../proposals/wp04-section-p-next-gap-review-r853-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
