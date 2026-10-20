# WP04 Section P — dried-squid picker hold (round 36)

**Date:** 2026-10-13

**Decision:** Keep dried squid / `calmar séché` unallocated until a bundled recipe requests the product with enough presentation context.

The CFIA compendium names dried squid / calmar séché as an export-grade product and sets a 22% moisture limit for those specified export grades. OQLF supplies the general food-language pair `calmar` / `squid`. Québec-facing retail listings use `calmar séché` and `Encornet séché` for products with different or incomplete product detail. These sources establish a real dried product state, but do not identify one species or one universal retail formulation. The 22% limit is an export-grading requirement, not a conversion, rehydration ratio, recipe measure, or cooking yield.

The existing active identity is `calamari / calmar`, with `squid` as its English alias and no attached forms. A hypothetical identity-only row `dried squid / calmar séché` would make `dried squid` and `calmar séché` return a direct result, while broad `squid` and `calmar` searches would grow from one result to two. The bundle has no dried-squid line, so keep the candidate out of active references and forms. Do not infer a species, attach a dried form to generic calamari, add an `encornet` alias, or create a substitution.

The 114 manifest-listed recipe files contain 1,123 ingredient rows and no dried-squid candidate wording. Recipe 023, ingredient row 1, asks for `140 g sliced calamari` and links to `ingredient-ref-calamari`; this is not dried-product demand.

## Files updated

- `docs/catalog/proposals/wp04-section-p-dried-squid-product-boundary-review-20261013-round36.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

No shared database JSON, recipe, code, or ledger file changed.

## Verification

Static package validation, normalized reference/package checks, generated-index freshness, exact active/form/legacy/ledger ownership, picker projections, and the recipe scan passed. The proposal's four source IDs are distinct and its source prefix is unique in the catalog archive. Local links resolve; modified text is UTF-8 without BOM; scoped whitespace checks pass.

No tests were run because this documentation-only hold adds no database JSON data. Section P remains open.
