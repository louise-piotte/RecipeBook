# WP02/WP03/WP04 R770–R772 gap-review integration

Date: 2026-10-18

## Decisions

- **R770 — black-fonio flour measurement:** updated the existing `ingredient-ref-black-fonio-flour` ledger row with separate 3-day and 5-day fermented Iburu flour bulk-density observations: 0.80 ± 0.03 and 0.83 ± 0.05 g/mL. The article does not define the ± statistic; its abstract's 0.83–0.94 range conflicts with the I3 table/discussion result. Values remain source-scoped lab evidence, with no default density, kitchen measure, unit mapping, or form. R761's blocked substitution finding is preserved. See the [R770 proposal](../../proposals/wp02-a6-black-fonio-flour-measurement-review-r770-20261018.md).
- **R771 — Oatmeal Crisp family:** added all seven current English/French manufacturer products as separate `GRAIN_AND_CEREAL` references. Each has one product-specific 1 cup / 1 tasse serving observation: six list 58 g; Triple Berry lists 54 g. These label portions do not establish a generic cereal cup measure, fill method, density, or unit mapping. No aliases, forms, recipes, conversions, yields, or substitutions were added. See the [R771 proposal](../../proposals/wp03-section-f-oatmeal-crisp-family-picker-review-r771-20261018.md).
- **R772 — bluefish:** added a state-neutral `whole_fish` form, `whole bluefish / tassergal entier`, under the existing verified *Pomatomus saltatrix* identity. Its match-term arrays are empty and its density is null. The retailer package estimate and supplier's undefined 50% value remain unmodeled; no temperature or cleaning state, measure, yield, recipe link, conversion, or substitution was added. See the [R772 proposal](../../proposals/wp04-section-p-next-open-gap-review-r772-20261018.md).

## Package snapshot

- **1,864 ingredient references and 189 forms.** R771 adds seven references; R772 adds one form.
- **2,262 research-ledger records, 10,610 source entries, 8,935 distinct source IDs, and 7,582 distinct source URLs.** R770 reuses its existing article source. R771 adds 7 ledger records and 16 product/family source IDs and URLs (family source entries recur on the seven rows). R772 adds one form record, two new product-source IDs/URLs, and reuses two bluefish identity sources.
- **114 manifest-listed recipes and 1,123 structured ingredient rows.** The reviews found no matching recipe demand or direct links for these additions.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — bundled seed package normalization and schema/linkage validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog freshness at 1,864 references.
- Confirmed proposed IDs and URLs are unique; the Oatmeal Crisp family sources are shared only across that family's rows; bluefish identity sources are reused rather than duplicated.
- Reprojected the live picker: `Oatmeal Crisp`, `Avoine Croquante`, and `Céréales Avoine Croquante` each return seven references; `Oatmeal Crisp Protein` returns two; each full variant title returns one. With phrase-first matching, `cereal` returns 91 exact-term results, seven more than the 84 exact English matches in the pre-R771 catalog. The R771 projection forecast of 89 before / 96 after counted five French `céréales` substring matches, but those are not returned when the exact English result set is nonempty. The French `céréales` query returns 88 (81 before R771). No aliases were added to the unrelated rows. Qualified `whole bluefish` and `tassergal entier` return Bluefish; broad `whole fish` and `poisson entier` remain on Whole Tilapia, and `whole` returns 55.
- Checked the seven cereal display pairs and product-specific observations, fonio source-scoped values, bluefish form and source boundaries, unchanged 114-recipe / 1,123-row corpus, UTF-8 without BOM, escaped Unicode in bundled JSON, Markdown links, mojibake markers, and scoped whitespace.
- **No software tests, build, emulator run, or deployment were performed.** The active data changes are database JSON additions, so software testing is not required by `AGENTS.md`.

Sections A6, F, and P remain open.
