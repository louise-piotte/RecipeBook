# WP02 / WP03 / WP04 R149 gap-review integration

Reviewed residual WP02 flour, WP03 grain, and WP04 fish-product gaps. Integrated three identity-only references:

- **WP02 Section 04 A6 — wild rice flour / farine de riz sauvage:** a standalone Canadian flour-market identity, distinct from wild rice grain, wild-rice blends, puffed wild rice, and Oryza rice flours. The French phrase is attested in a Canadian bilingual ingredient list; this does not establish an OQLF-preferred flour name or standalone Québec retail prevalence.
- **WP03 Section F — Red Fife wheat berries / grains de blé Red Fife:** separate from generic wheat berries and both Red Fife flour references. The English product is current in Canadian listings. The French display is a source-informed construction, not an OQLF-preferred or currently verified Québec retail title.
- **WP04 Section P — smoked haddock / aiglefin fumé:** separate from plain haddock and from mixed/canned `gades fumés` / Finnan haddie wording. The product listings do not establish one common smoke process, storage state, cut, package, measure, or cooking behavior.

The 114-recipe / 1,123-ingredient-row bundle has no matching ingredient demand. All three references have empty alias lists; no forms, reusable measures, density, unit mappings, conversions, recipe links, yields, or active substitutions were added. Package totals are **1,514 references and 119 forms**; the research ledger has **1,859 records, 7,838 source entries, and 6,693 distinct source IDs**. The generated Kotlin index contains 1,514 references.

Static checks passed: bundled package validation and normalization, reference normalization, generated-index freshness, ledger JSON Schema validation and new-source linkage, picker projections, recipe-corpus scan, UTF-8 without BOM, local Markdown links, and whitespace checks. **No app, Android, emulator, or test-suite checks were run** because these changes only add database JSON data under `AGENTS.md`.

See the [wild rice flour proposal](../../proposals/wp02-a6-wild-rice-flour-identity-review-r149-20261015.md), [Red Fife wheat berries proposal](../../proposals/wp03-section-f-red-fife-wheat-berries-identity-review-r149-20261015.md), [smoked haddock proposal](../../proposals/wp04-section-p-smoked-haddock-product-identity-review-r149-20261015.md), and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). The broader WP02 A/A6, Section F, and Section P parents remain open.
