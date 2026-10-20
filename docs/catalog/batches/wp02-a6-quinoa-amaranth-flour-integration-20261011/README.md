# WP02 A6 — Color-Qualified Quinoa Flour and Sprouted Amaranth Flour

- **Status:** Integrated, identity-only; broader A6 grain-flour review remains open.
- **Integration date:** 2026-10-11.
- **Scope:** white, red, and black quinoa flour as distinct color-qualified products; sprouted amaranth flour as a separately named processed flour.

## Catalog rows

| ID | English display | Québec French display | Aliases | Category |
|---|---|---|---|---|
| `ingredient-ref-white-quinoa-flour` | `white quinoa flour` | `farine de quinoa blanc` | None | `FLOUR_AND_STARCH` |
| `ingredient-ref-red-quinoa-flour` | `red quinoa flour` | `farine de quinoa rouge` | None | `FLOUR_AND_STARCH` |
| `ingredient-ref-black-quinoa-flour` | `black quinoa flour` | `farine de quinoa noir` | None | `FLOUR_AND_STARCH` |
| `ingredient-ref-sprouted-amaranth-flour` | `sprouted amaranth flour` | `farine d'amarante germée` | None | `FLOUR_AND_STARCH` |

The generic `quinoa flour / farine de quinoa` and `amaranth flour / farine d'amarante` rows remain unchanged. Generic quinoa flour does not default to white. The French color terms qualify quinoa, so `blanc` and `noir` remain masculine. Independent Québec review accepted all four displays. The black-quinoa French wording is supported by a French Canadian certification annex, not a consumer package; the sprouted-amaranth French retail evidence names the whole sprouted grain, while the flour product page is English-only.

## Evidence and boundaries

- Québec and Canadian flour sources support white quinoa flour; Canadian French ingredient declarations name red quinoa flour inside pasta products; Ecocert Canada's 2025 French annex lists black quinoa flour as a product class.
- A current Ontario supplier names sprouted amaranth flour. The identity is separate from generic amaranth flour; no species or universal sprouting protocol is inferred.
- [Independent Québec wording review](../../proposals/wp02-a6-quinoa-amaranth-quebec-wording-review-20261011.md) accepts the exact displays and documents the narrower evidence for black quinoa and sprouted amaranth. The [identity review](../../proposals/wp02-a6-quinoa-amaranth-flour-identity-review-20261011.md) contains the full source register, collision audit, and held regional products.
- No bundled recipe line matched these products. No aliases, forms, recipe links, density, unit mappings, measures, conversions, yields, or substitutions were added.

## Validation

- Current package: **1,087 references**, **79 forms**, **114 recipes / 1,123 ingredient rows**.
- Research ledger: **1,386 records**, **4,613 source entries**, **3,773 distinct source IDs**.
- Reference normalization, bundled-package normalization and validation, ledger-schema validation, generated-index freshness, exact-name/source-ID checks, no-demand scan, UTF-8/no-BOM, and whitespace checks passed.
- No tests or emulator runs were performed. The change only adds database JSON data, as allowed by [`AGENTS.md`](../../../../AGENTS.md).
