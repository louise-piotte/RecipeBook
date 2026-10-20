# WP04 Section P R201 — Canned Trout Integration

- **Status:** Integrated as one identity-only `PROTEIN` market-group reference.
- **Reference:** `ingredient-ref-canned-trout` — `canned trout / truite en conserve`.
- **Boundary:** Keep the finished canned-trout product group separate from raw trout species and smoked trout. Do not assign a species, universal recipe, packing medium, presentation, storage state, or drained amount.
- **Data scope:** Empty aliases, no forms, null density, empty unit mappings, no recipe links, conversions, yields, or substitutions.

## Evidence and limits

Scout Canning's Canadian product line includes Ontario Trout with Dill. A Hamilton retailer lists a 90 g Scout package, and another Canadian retailer page describes the SKU as Ontario rainbow trout with oil, dill, and salt. Those are product-specific details; they do not define every canned-trout product. The listed 90 g amount and an external recipe's use of two tins remain source-specific.

A Québec home recipe titled *Truite en conserve* identifies small brook trout as *omble fontaine* / *truite mouchetée*. This supports the French recipe-search phrase, but it is not a current Québec commercial label or terminology ruling. No Québec commercial French package name was established. OQLF and CFIA fish-name sources are reused only for species/common-name boundaries; the app picker row is not a fish-label authorization.

## Ownership and recipe demand

Before integration, the package contained 1,579 references, 122 forms, 61 legacy candidates, and 1,924 ledger records. No exact active owner existed for either proposed display or ID. Existing brook trout, lake trout, rainbow trout, and smoked trout rows remain distinct. The five new R201 source IDs map to five unique URLs; OQLF and CFIA source records are reused verbatim under their R158 IDs.

The manifest-listed bundle has 114 recipes and 1,123 ingredient rows. It contains no canned-trout phrase or trout ingredient row, so no recipe link or substitution was added.

## Integration and verification

Added one bilingual reference and one accepted research-ledger record with five new source entries and two reused source entries. `canned trout` and `truite en conserve` each return the new row; broad `trout` and `truite` searches remain multi-result.

Static seed/package validation, ingredient-reference normalization, generated-index freshness, research-ledger schema validation, source-ID/URL ownership, reference-to-ledger linkage, picker projection, full recipe-corpus scan, UTF-8/no-BOM and escaped-Unicode checks, local links, and scoped whitespace checks passed. Final totals after R199–R201 are **1,588 references**, **122 forms**, and **1,933 ledger records / 8,346 source entries / 7,101 distinct source IDs / 5,891 distinct URLs**.

No software tests or emulator checks were run because the application change adds database JSON data under the updated `AGENTS.md` rule.

See the [R201 proposal and source register](../../proposals/wp04-section-p-canned-trout-product-boundary-review-r201-20261016.md).
