# WP02/WP03/WP04 R773–R775 gap-review integration

Date: 2026-10-18

## Decisions

- **R773 — generic quinoa-flour substitution:** marked the existing `ingredient-ref-quinoa-flour` substitution research `blocked_pending_evidence`. Added separate findings for Kurek and Sokolova’s bread optimization and Cuisine Soleil’s branded blend/muffin guidance. The study’s local wheat-flour grade and quinoa product are unidentified; the manufacturer’s examples do not instruct replacing wheat flour. Preserved R719’s product-specific portion evidence and added no source-flour mapping, active substitution, or recipe link.
- **R774 — Barbara’s Puffins:** added Canadian Original and Cinnamon Puffins as two bilingual `GRAIN_AND_CEREAL` references. Recorded the manufacturer’s 1 cup / 1 tasse portions as product-specific observations: Original 42 g; Cinnamon 43 g. The manufacturer pages support the two-product Canadian set. The US portfolio’s Peanut Butter variety and Walmart Canada listing remain documented as out-of-scope evidence; no global-assortment claim or Peanut Butter identity was added.
- **R775 — Arctic char:** added one state-neutral `whole_fish` form, `whole Arctic char / omble chevalier entier`, under the existing verified *Salvelinus alpinus* identity. Match-term arrays are empty and density is null. Supplier weights, fresh/frozen state, cleaning details, MAPAQ’s recipe quantity, measures, yields, conversions, recipe links, and substitutions remain outside reusable form data.

## Package snapshot

- **1,866 ingredient references and 190 forms.** R774 adds two references; R775 adds one form.
- **2,265 research-ledger records, 10,626 source entries, 8,947 distinct source IDs, and 7,594 distinct source URLs.** R773 adds two sources/findings to an existing record and reuses the R719 Cuisine Soleil product source. R774 adds two records with shared family context and product-specific sources. R775 adds one form record, four product/recipe sources, and reuses the two Arctic-char identity sources.
- **114 manifest-listed recipes and 1,123 structured ingredient rows.** The reviewed identities and form have no direct bundled recipe demand or links.

## Static verification

- Bundled seed package normalization and schema/linkage validation passed with `python3 tools/seed_package/normalize_bundled_seed_package.py --check`.
- Generated catalog freshness passed with `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` at 1,866 references.
- Research-ledger schema and ownership validation passed: 2,265 records and zero errors.
- Confirmed source-ID ownership and URL reuse, escaped Unicode in bundled JSON, UTF-8 without BOM, proposal and README links, picker projections, unchanged recipe corpus, mojibake markers, and scoped whitespace.
- Picker effects: R773 changes no search terms; `Puffins` adds two results, `cereal` moves 91→93, and `céréales` moves 88→90. R775 makes `whole Arctic char` and `omble chevalier entier` resolve to Arctic char while broad `whole fish` and `poisson entier` remain on Whole Tilapia; `whole` moves 55→56 and `entier` 28→29.
- **No software tests, build, emulator run, or deployment were performed.** The changes add database JSON data and documentation, so testing is not needed under the updated `AGENTS.md` rule.

Sections A6, F, and P remain open.

## Proposals

- [R773 generic quinoa-flour substitution review](../../proposals/wp02-a6-next-gap-review-r773-20261018.md)
- [R774 Barbara’s Puffins family review](../../proposals/wp03-section-f-barbaras-puffins-family-picker-review-r774-20261018.md)
- [R775 whole Arctic-char form review](../../proposals/wp04-section-p-next-open-gap-review-r775-20261018.md)
