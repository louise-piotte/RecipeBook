# WP03/WP04/WP06 R500–R502 gap review integration

Integrated on 2026-10-17 after root review of [R500](../../proposals/wp03-section-f-cinnamon-toast-crunch-family-review-r500-20261017.md), [R501](../../proposals/wp04-section-p-crayfish-boundary-recheck-r501-20261017.md), and [R502](../../proposals/wp06-african-next-regional-review-r502-20261017.md).

## Decisions

- **R500 — Cinnamon Toast Crunch family:** Reassessed R358 using current Canadian retailer listings. Keep the plain cereal outside active references and the shared ledger because no current Canadian manufacturer roster or stable bilingual family-query rule covers the differently named siblings. Several Québec-facing products are currently listed, but this is not a complete or consistent family roster. No shared catalog data changed.
- **R501 — crayfish:** Promoted the existing `ingredient-ref-crayfish` candidate in place to identity-only `freshwater crayfish / écrevisse d’eau douce` in `PROTEIN`. Keep the scope species-neutral and freshwater; do not add `crawfish`, `crawdad`, species names, forms, measures, conversions, yields, recipe links, or active substitutions. Measurement research found no reusable value; substitution research remains open.
- **R502 — waterleaf:** Added identity-only `waterleaf (Talinum fruticosum) / water leaf (Talinum fruticosum)` for edible leaves. Keep *Talinum triangulare* as a synonym alias and the French display provisional. The retailer metadata wording `Feuilles d'eau` and other local names remain evidence only, without global aliases. Add no forms, measures, conversions, yields, recipe links, or substitutions.

## Catalog, evidence, and picker effects

- Active references: **1,783**, up from 1,781. Forms remain **143**; legacy-import candidates remain **56**.
- Research ledger: **2,140 records**, **9,808 source entries**, **8,303 distinct source IDs**, and **7,013 distinct URLs**. R501 updated the existing crayfish candidate and added seven source entries/source IDs and five newly owned URLs, reusing the live OQLF mapping. R502 added one waterleaf record with seven source entries/source IDs and seven URLs. R500 added no shared ledger or catalog record. Each source ID maps to exactly one URL.
- **R500:** Cinnamon Toast Crunch / Croque Cannelle and reviewed sibling queries remain at zero active results. The broader `cereal` / `céréales` results remain 56 / 52.
- **R501:** `crayfish`, `freshwater crayfish`, `écrevisse`, and `écrevisse d’eau douce` each return one scoped result. `crawfish` and `crawdads` remain unassigned.
- **R502:** `waterleaf`, `water leaf`, *Talinum fruticosum*, and *Talinum triangulare* each return one result. `Feuilles d’eau`, `gbure`, and `bologi` remain unassigned. `water` grows from 12 to 13 partial results; the separate water-spinach queries are unchanged.
- The manifest-order corpus scan covers **114 recipe files**, **1,123 ingredient rows**, and **753,988 bytes**; candidate-specific hits and direct recipe links are **0**. Fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**.

## Validation

- Ingredient-reference normalization check passed at **1,783 references**.
- Bundled-package normalization check and validation passed.
- Generated Kotlin catalog freshness check passed at **1,783 references**.
- Research-ledger schema and semantic validation passed with **2,140 records and zero errors**. Source-ID-to-URL ownership validation found no IDs assigned to multiple URLs.
- Static phrase-first picker projections matched the documented results. The recipe corpus counts and fingerprint are unchanged.
- Seed JSON remains ASCII-escaped and UTF-8 without BOM; the ledger and documentation are UTF-8 without BOM. Scoped link, mojibake, and whitespace checks passed.
- No software tests, builds, emulator checks, or deployment were run. R501 and R502 only add database JSON data under the updated `AGENTS.md` rule; R500 is a documentation-only hold review.

## Snapshot hashes

- Ingredient references: `239c64b203cb049a3e1182f9b713cdd7231c083a3f5a5ca1e4ef77783c8199bd`
- Ingredient forms (unchanged): `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`
- Research ledger: `2b8b6527045f0c3468cb604bc2b5c0741934a45a3e5a3b8090678a963ceb9950`
- Generated Kotlin catalog: `625f6dd9919e2856c08f478499e3e92cfab51fbcf89fd1f39efec6c058cb07a2`
- Manifest (unchanged): `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`
