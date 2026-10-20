# WP06 R684 — Nigerian pepper-soup spice blend French display gate

- **Date:** 2026-10-18
- **Status:** Proposal only; no shared catalog or ledger data is created.
- **Scope:** Recheck the Québec French display gate for the dry Nigerian pepper-soup seasoning candidate held by [R681](wp06-nigerian-pepper-soup-spice-blend-review-r681-20261018.md#integration-owner-review--french-naming-gate).
- **Recommendation:** Continue the hold. Savanna Select’s French-language Canadian recipe supports the wording `mélange d’épices Pepper Soup` as a recipe ingredient, but does not attest it as a product title or Québec display. Do not activate the candidate, French display, or French alias until a French product name tied to this blend is documented or reviewed by a Québec terminology source.

## Naming evidence and limits

| Proposal-local source ID | Current source | What it establishes |
|---|---|---|
| `WP06-AFRICA-PEPPER-SOUP-FR-NAMING-R684-20261018-S01` | [Savanna Select, Pepper Soup recipe](https://savannaselect.ca/blog/recette-pepper-soup) | A French-language recipe dated 2026-08-01 lists `mélange d’épices Pepper Soup (uziza, calabash nutmeg, piment)` and uses the same phrase in its preparation. Its paired English text says `Pepper Soup spice blend`. This is meaningful Canadian French ingredient wording, but the phrase is not attached to a product page, package, SKU, or brand label. |
| `WP06-AFRICA-PEPPER-SOUP-FR-NAMING-R684-20261018-S02` | [Savanna Select contact](https://savannaselect.ca/contact) | Places the retailer in Calgary, Alberta. This confirms Canadian French retail context, not Québec usage. |
| `WP06-AFRICA-PEPPER-SOUP-FR-NAMING-R684-20261018-S03` | [Koshé Quick Mart, Pepper Soup Spice Blend](https://koshequickmart.com/products/pepper-soup-spice-blend) | A current Canadian listing identifies a ready-to-use dry blend for Nigerian pepper soup and says it ships from Winnipeg. Its product title is English; its ingredients are given in English and French, but no French product display is provided. Bilingual ingredient text does not establish the blend’s French name. |
| `WP06-AFRICA-PEPPER-SOUP-FR-NAMING-R684-20261018-S04` | [Marché Ndolo, products in Québec City](https://marchendolo.ca/produits/) | A Québec African grocer lists a general `Épices et assaisonnements` category with `mélanges traditionnels` and offers special orders. Its public page does not name this Nigerian blend, so it cannot support a product-matched display. |

The focused search of the [OQLF Banque de dépannage linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/banque-de-depannage-linguistique) did not return a product-specific Québec term for the dry seasoning. R681’s French recipe sources use `soupe au poivre` or `mélange d’épices soupe au poivre` for recipe wording; neither source is a Québec product label. Keep those phrases out of the catalog display and aliases. The previously reviewed Nigerian and Canadian product listings remain useful for the English identity only; see R681’s source table.

Accordingly, `mélange d’épices Pepper Soup` is recorded here only as bounded Canadian French recipe wording. It does not pass the project’s product-matched Québec French naming gate. Do not replace it with an invented translation such as `mélange d’épices pour soupe nigériane épicée` or infer the dry blend’s label from a name for the prepared soup.

## Ownership, picker, and demand audit

- The live seed snapshot contains **1,838 references** and **169 forms**; the research ledger has **2,216 records**. Proposed ID `ingredient-ref-nigerian-pepper-soup-spice` is absent from active references, forms, and ledger record IDs. Its only earlier proposal use is R681’s held candidate; R684 retains that candidate identity without assigning a second ID.
- The R684 proposal path and source-ID prefix above were free before drafting. Each of the four source URLs in the table had zero exact URL owners in the active ledger and proposal archive. R681’s Feco Foods and Poshy Foods sources are reused by reference and are not registered again.
- The separate active identities `ingredient-ref-uziza-leaves`, `ingredient-ref-grains-of-selim`, and `ingredient-ref-calabash-nutmeg` remain component ingredients, not owners of the blend. `candidate-nigerian-yaji` remains a separate ledger-only candidate.

The picker uses normalized ingredient phrases and partial matching through [`IngredientReferenceSearchIndex`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Since this proposal activates nothing, actual results stay unchanged:

| Query | Current picker result | After R684 |
|---|---|---|
| `Nigerian pepper soup spice blend`; `pepper soup spices`; `pepper soup` | 0 | 0 |
| `mélange d’épices Pepper Soup`; `mélange d’épices pour soupe nigériane épicée`; `soupe au poivre` | 0 | 0 |
| `uziza` | `ingredient-ref-uziza-leaves` | Unchanged |

For comparison only, a future English-only activation using R681’s English display and alias would return one candidate for `Nigerian pepper soup spice blend`, `pepper soup spices`, and `pepper soup`; French queries would remain unmatched. R684 does not approve that activation.

The full manifest-listed recipe corpus was scanned as UTF-8 text and in structured ingredient fields: **114 recipe files, 1,123 ingredient rows, 754,048 bytes**. Searches covered the English candidate display and alias, `pepper soup spice`/`seasoning` variants, Savanna Select’s French recipe phrase, R681’s `soupe au poivre` wording, Itsekiri seasoning, yaji/suya, and the named component spices. There were **zero matching recipe files and zero matching ingredient rows**. The bundled corpus supplies no demand, quantity, or recipe link for this candidate.

## Revisit condition

Keep the dry-blend identity and all terms out of active and ledger data. Reopen the naming decision when a Québec or Canadian product page/package tied to a dry Nigerian pepper-soup spice SKU provides its French product name, or when a Québec terminology/community reviewer attests a precise display for this product. A recipe ingredient phrase alone can inform search research but cannot clear that gate. No forms, measurements, conversions, yields, substitutions, or recipe links are proposed.
