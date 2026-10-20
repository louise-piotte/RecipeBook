# WP05 — Generic Filipino `suka` search alias review

- **Status:** Integrated `suka` on the existing generic `ingredient-ref-vinegar` reference.
- **Reviewed:** 2026-10-18.
- **Decision:** Add the borrowed Filipino term `suka` to both locale alias arrays for `vinegar / vinaigre`.
- **Scope:** Fix the exact broad `suka` picker query, which previously returned only the product-specific Suka Pinakurat row.

## Decision and boundaries

The Philippine Department of Agriculture’s KADIWA page explicitly pairs `suka` with generic `vinegar` while listing common Filipino condiments. A second Department of Agriculture statement discusses `suka` as a generic sour condiment/vinegar across multiple agricultural sources. These sources support `suka` on the generic vinegar row, without assigning it to coconut, cane, spiced, or another specific vinegar class.

The term is stored as a searchable borrowed alias in both locale arrays. It is not used as a French display label or a product identity. Keep `Suka Pinakurat` separate as the specific spiced coconut-vinegar product, `Sukang Iloko` on cane vinegar, and Sinamak as its own regional spiced-vinegar identity.

Before integration, an exact `suka` query returned only `ingredient-ref-suka-pinakurat`, because `Suka` is the first word of its canonical product title and complete-word matches take precedence in the picker. After integration, `suka` returns generic `ingredient-ref-vinegar` and specific `ingredient-ref-suka-pinakurat`. The result is intentionally multi-row: one generic vinegar and one named product. Existing `sukang` results remain the cane-vinegar and Suka Pinakurat rows; `sukang iloko` continues to resolve to cane vinegar.

No recipe ingredient line contains `suka` as a standalone requested ingredient or links to a source-specific vinegar. No forms, measurements, recipe links, conversions, yields, or substitutions were added.

## Ownership and source review

Before integration, no active reference or form owned the exact term `suka`; it occurred only as part of the separate Suka Pinakurat product name. No legacy candidate owns the exact term.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-SUKA-R613-S01** | Philippine Department of Agriculture, KADIWA, [#PreserveFilipinoFood: DA Leads Filipino Food Month 2023 Celebration](https://kadiwa.da.gov.ph/index.php/preservefilipinofood-da-leads-filipino-food-month-2023-celebration/). | Explicitly glosses `suka` as `vinegar` in a generic list of Filipino condiments; it does not assign a vinegar source or style. |
| **WP05-SUKA-R613-S02** | Philippine Department of Agriculture, [Statement of the DA Secretary on the Fake Vinegar Issue](https://www.da.gov.ph/statement-of-the-da-secretary-on-the-fake-vinegar-issue/). | Discusses `suka` as a generic sour condiment/vinegar and notes several agricultural sources. It is not a bilingual Canadian terminology source. |

## Static checks

Exact alias ownership, R613 source-ID/URL uniqueness, picker-result impact, recipe-corpus demand, ledger schema, seed-package normalization and validation, generated-index freshness, UTF-8/no-BOM, local links, and scoped whitespace checks were reviewed. No app tests, builds, or emulator checks were run for this database-JSON catalog update.
