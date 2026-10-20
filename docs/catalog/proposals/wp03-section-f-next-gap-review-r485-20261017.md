# WP03 Section F R485: Rice Chex cereal family picker hold (2026-10-17)

## Review record

- **Reviewed:** 2026-10-17.
- **Work package:** WP03, Section F.
- **Open-plan fit:** The active Section F checklist continues identity and terminology coverage, including the remaining regional cereal and preprocessed-grain sweep ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L552)). This review concerns one source-attested, ready-to-eat cereal product that is absent from the catalog.
- **Candidate:** Canadian Rice Chex, product code `19797000`, package GTIN `65633197978`, 340 g; Canadian French product wording `Chex au riz`.
- **Recommendation:** **Hold a single Rice Chex row pending a family-wide Chex picker review.** Product identity and French wording are supported, but adding only this sibling would make `Chex` return Rice Chex as the sole active result while General Mills Canada currently lists four other Chex cereal products. Keep the candidate outside active references and the ledger until those siblings or a family-level search behavior are reviewed together.
- **Proposal status:** Proposal-only. No shared catalog, ledger, plan, roadmap, generated-index, or batch files changed.

## Product and family evidence

General Mills Canada's May 2025 foodservice product guide lists `Rice Chex™` as a 340 g Chex gluten-free cereal, product code `19797000`, package GTIN `65633197978`. In the same current Canadian lineup it lists `Chocolate Chex`, `Cinnamon Chex`, `Corn Chex`, and `Honey Nut Chex` as separately coded products [S01]. These are distinct current manufacturer-listed product names, not aliases or package variants of Rice Chex.

The Canadian French General Mills product guide records `Chex™ au riz` for product code `19797000`, package GTIN `65633197978`, and a 340 g package [S02]. A current Maxi Québec product listing calls the item `General Mills Chex au riz sans gluten`, 340 g [S03]. The local retailer title corroborates Québec-facing wording; `sans gluten` is a product claim and is not part of the proposed identity. The French display below adds only the generic cereal class to the manufacturer wording; it is not presented as an OQLF decision.

Food Basics' Canadian listing for package number `065633197978` identifies the item as `Rice Cereal`, 340 g, and lists whole-grain rice, rice, sugars, salt, and other ingredients [S04]. The page showed the item unavailable at its selected store during this review, so it supports package and composition details, not current local availability. The ingredient list and manufacturer category support a formulated finished cereal product; they do not make it equivalent to plain rice, puffed rice, crispy rice cereal, or its other Chex siblings.

## Ownership and archive audit

The active plan leaves Section F cereal/preprocessed-grain coverage open. A case-insensitive search of the current plan, roadmap, proposals, batch archive, reference package, and research ledger found no earlier Chex-focused proposal, hold, source record, or active identity. This check did not reopen or repeat R479, R482, or R484 work.

The read-only ownership audit covered the live ingredient references and aliases, form labels and match terms, legacy-import candidates, the research ledger, and the proposal/batch archive. The working-tree snapshot contained **1,760 ingredient references** (247 `GRAIN_AND_CEREAL`), **143 ingredient forms**, **56 legacy-import candidates**, and **2,119 ledger records** with **9,674 source entries**, **8,208 distinct source IDs**, and **6,921 distinct URLs**.

| Surface | Result |
|---|---|
| Active reference names and aliases | No exact normalized owner for `Rice Chex`, `Rice Chex cereal`, `Chex au riz`, `Céréales Chex au riz`, or `Chex au riz sans gluten`. The proposed ID `ingredient-ref-rice-chex-cereal` is unallocated. |
| Ingredient forms | No exact candidate term or proposed ID. No form is proposed. |
| Legacy identities | No exact candidate term or proposed ID among 56 candidates. |
| Research ledger | No Rice Chex record, candidate, decision, exact candidate phrase, or proposed ID. |
| Source IDs and URLs | Proposal-local IDs `WP03-RICE-CHEX-R485-20261017-S01` through `S04` and the exact URLs below have no existing ledger owner. No source is added to the shared ledger while the identity is held. |
| Proposal and batch archive | No prior Chex-specific identity, family review, or picker hold. |

The Canadian manufacturer guide supplies an exact proposed English title and SKU. Its family list also establishes the picker issue; the candidate is not being held for a product-identity or French-name gap.

## Conditional identity boundary

If a future family review supports a Rice Chex row, keep it as a separately named finished cereal product, with no aliases:

| Field | Conditional value | Limit |
|---|---|---|
| ID | `ingredient-ref-rice-chex-cereal` | Unallocated while the hold stands. |
| English display | `Rice Chex cereal` | Manufacturer's `Rice Chex` title plus the product class. |
| French display | `Céréales Chex au riz` | Québec product wording `Chex au riz` plus the generic cereal class. |
| Category | `GRAIN_AND_CEREAL` | A packaged ready-to-eat cereal, not a rice form. |
| Aliases | None | The exact product phrase is already searchable from the displays. Do not add `Chex` as a separate alias; it would not fix the family undercoverage. |
| Density and unit mappings | `null` and `[]` | No transferable volume-to-mass value is supported. |
| Forms, recipe links, conversions, yields, substitutions | None | The reviewed evidence establishes no reusable form or culinary equivalence. |

Keep this product separate from `ingredient-ref-rice-cereal` (`crispy rice cereal`), `ingredient-ref-baby-rice-cereal`, `ingredient-ref-puffed-rice`, ordinary rice, and all other Chex flavors. The shared rice substrate or similar ready-to-eat use does not establish the same product identity, recipe link, or substitution.

## Picker projection

This static projection follows the current phrase-first `IngredientReferenceSearchIndex` behavior and includes the existing bilingual reference and form terms. It is an audit of search-term matches, not an Android picker test. Counts are from the working-tree snapshot above.

| Query | Current results | With Rice Chex alone | Impact |
|---|---:|---:|---|
| `Rice Chex` / `Rice Chex cereal` | 0 | 1: Rice Chex | Useful exact English query. |
| `Chex au riz` / `Céréales Chex au riz` | 0 | 1: Rice Chex | Useful exact French query. |
| `Chex` | 0 | 1: Rice Chex | Misleading family result: four other current Canadian Chex products are omitted. |
| `rice cereal` | 2: baby rice cereal; crispy rice cereal | Same 2 | The proposed `Rice Chex cereal` display does not match the contiguous `rice cereal` phrase, so generic cereal results remain stable. |
| `cereal` / `céréales` | 47 / 43 | 48 / 44 | Broad category searches gain one product if the row is later integrated. |

The one-result `Chex` query is the blocking concern. Do not attempt to solve it with a broader alias, because an alias would retain the same singleton result. Reopen after reviewing the current Canadian Chex lineup together and deciding which siblings need distinct localized identities.

## Bundled recipe corpus

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for the proposed English/French names, Chex spellings, product code, and proposed ID. No recipe file or ingredient row contains a candidate match or link.

Recipe `040` contains one nearby row, `6 cups crispy rice cereal`, linked to `ingredient-ref-rice-cereal`. That generic ingredient is not Rice Chex. The existing query `rice cereal` continues to resolve to the generic crispy-cereal and baby-rice-cereal identities, and no bundled recipe supplies a reason to relink it to Chex. Add no recipe link or substitution from this mention.

## Numeric, form, yield, and substitution limits

- The manufacturer guide and Québec listing give **340 g** only as a product package quantity. It is not a serving, kitchen measure, density, or conversion.
- The Canadian retail ingredient statement is qualitative. Do not infer ingredient ratios, a universal formulation, or nutrient values from it.
- The reviewed Canadian sources give no transferable cup weight, dry-to-cooked relation, preparation yield, package yield, density, or unit mapping. Do not import US Rice Chex nutrition portions as Canadian package measures.
- No dry/cooked or other ingredient form is needed for the packaged ready-to-eat product. Add no form or preparation conversion.
- Shared breakfast or snack use does not establish a global or contextual substitution to crispy rice cereal, puffed rice, Rice Krispies, another Chex flavor, or any plain rice ingredient.
- Add no recipe link, cooking yield, substitution rule, or other active numeric behavior.

## Source register

Sources were checked on 2026-10-17. The IDs below are proposal-local and remain unallocated in the research ledger.

| Source ID | Source | Support and limits |
|---|---|---|
| `WP03-RICE-CHEX-R485-20261017-S01` | General Mills Foodservice Canada, [Product Guide, updated May 2025](https://www.generalmillsfoodservice.ca/wp-content/uploads/2025/05/GM-Complete-Product-Guide-May-2025-ENG.pdf), cereal product list, printed page 8 (PDF page index 7). | Primary Canadian manufacturer source. Lists `Rice Chex™`, code `19797000`, package GTIN `65633197978`, 340 g, and four other Chex cereal products. Establishes Canadian product naming and the family picker boundary; it does not give recipe measures or household conversions. |
| `WP03-RICE-CHEX-R485-20261017-S02` | General Mills Foodservice Canada, [Guide des produits, updated September 2023](https://www.generalmillsfoodservice.ca/wp-content/uploads/2023/10/GM-guide-des-produits-Sept-23.pdf), cereal product list, printed page 8 (PDF page index 7). | Manufacturer French wording `Chex™ au riz` for code `19797000`, the same package GTIN, and 340 g. Retained for the exact product-specific French label; the later English guide and current Québec retail listing corroborate the item. |
| `WP03-RICE-CHEX-R485-20261017-S03` | Maxi Québec, [Chex au riz sans gluten, 340 g](https://www.maxi.ca/fr/chex-au-riz-sans-gluten/p/21535225_EA). | Québec retail listing indexed with the French product title and 340 g package. The direct product page has no readable page text in this review; use its indexed listing for local naming and package context, not composition or measures. The gluten-free phrase is product-claim wording and is not retained in the proposed identity. |
| `WP03-RICE-CHEX-R485-20261017-S04` | Food Basics Canada, [Chex Rice Cereal, 340 g](https://www.foodbasics.ca/aisles/pantry/cereals-spreads-syrups/granola-healthier-cereals/rice-cereal/p/065633197978), product number `065633197978`. | Canadian retailer listing provides the product name, matching package number/size, and ingredient statement. It was marked unavailable at the selected store when reviewed; supports product details, not active local stock. |

## Reopen condition

Keep Rice Chex outside active references and the research ledger until the open Section F cereal sweep resolves the Chex family picker behavior. Reopen with a current Canadian-family audit that names the active siblings, reviews Québec French titles for each considered product, reruns exact ownership and the 114-recipe/1,123-row corpus check, and projects the broad `Chex` query. Section F remains open.
