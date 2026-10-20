# WP03 Section F — red rice flakes / poha product boundary review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated as an identity-only red-rice-flakes reference; no recipe or numeric data was added.
- **Scope:** the plan explicitly keeps red-rice poha outside the generic flattened-rice reference while thin, medium, and thick generic poha grades are integrated ([plan, poha follow-up](../../RecipeBook-global-ingredient-catalog-plan.txt#L6154)). This review considers one named red-rice flake product class, not a rice-colour-by-processing matrix.
- **Related completed work:** the independent Québec review retained the existing edible-grain display `red rice / riz rouge` without aliases ([red-rice terminology review](./wp03-section-f-red-rice-quebec-terminology-review-20261011.md)). The generic poha synonym, grade, and chiwda/chivda reviews remain separate.

## Recommendation

**Accept one identity-only product reference**, subject to the search overlap recorded below:

| Proposed field | Value |
| --- | --- |
| ID | `ingredient-ref-red-rice-flakes` (unallocated in the current package and ledger) |
| English display | `red rice flakes` |
| Québec French display | `riz rouge aplati` |
| English alias | `red rice poha` |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` |
| Recipe links | None |
| Forms, density, unit mappings, measures, conversions, yields, substitutions | None |

The English display and alias are directly attested by Canadian retail and a product maker. A French-language Canadian marketplace listing calls its item `Riz Rouge Poha / Matta Aval` and uses `Riz Rouge Aplati` in the title and product description. Use `riz rouge aplati` as a **market-attested provisional fr-CA display**, not as an OQLF or TERMIUM preferred term. This review found no Québec terminology authority entry for red rice flakes specifically.

The scope is plain flattened flakes marketed as made from red rice. It is separate from intact `red rice / riz rouge`, the generic `flattened rice (poha) / flocons de riz (poha)` row, and roasted red rice flour. The manufacturer describes one product as red rice that is parboiled, flattened, and dried; that establishes one product example, not a universal process for every red-rice flake. Keep the accepted `red rice poha` alias only. Do not add `Sivappu Aval`, `Matta Aval`, `red rice aval`, or other region-specific forms as global aliases: the available labels tie those names to particular products and do not establish broad equivalence.

### Picker query behavior

The exact normalized-key audit below found no existing exact owner for `red rice flakes` or `red rice poha`. There is, however, a predictable phrase overlap with existing names. In `IngredientSearch.kt`, the phrase-priority pass matches a query phrase inside a longer indexed term; it does not require the whole term to equal the query. Therefore:

- A bare **`red rice`** query returns `ingredient-ref-red-rice`, the existing `ingredient-ref-roasted-red-rice-flour`, and the proposed `ingredient-ref-red-rice-flakes`: all three indexed names contain that exact word phrase. Neither existing result is suppressed; the query returns three clearly qualified rows rather than one.
- A **`rice flakes`** query would match the existing generic flattened-rice reference and the proposed red-rice-flakes reference.
- A **`red rice flakes`** query should select the proposed name by phrase match; this is a source-code behavior assessment, not live picker QA. No result ranking or screen behavior was verified.

This proposal accepts those qualified product results as useful disambiguation: the raw grain and the plainly named flakes remain separately labeled. If the product requirement is that a bare `red rice` search resolve to only one row, hold this identity until the picker can preserve that narrower query intent.

## Current package, ownership, and demand audit

Pre-integration read-only snapshot on 2026-10-12: **1,245 active ingredient references, 94 forms, 114 manifest-listed recipe files / 1,123 ingredient rows, 66 legacy candidates, and 1,552 ledger records**. The exact-key audit used the repository's `normalize_search_key` helper across all active reference displays and aliases, form labels and match terms, and legacy candidate displays and aliases. It also checked the current ledger records. The root integration below adds one reference and one ledger record; the red-rice-flakes source keys had no exact owner in this pre-integration snapshot.

| Existing owner | Live state and boundary |
| --- | --- |
| `ingredient-ref-red-rice` | `red rice / riz rouge`, `GRAIN_AND_CEREAL`; aliases empty, density null, no unit mappings. Its ledger identity is verified; measurement and substitution research remain not yet researched. This is the intact edible red-bran grain, not the flakes product. |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`, `GRAIN_AND_CEREAL`; aliases include `rice flakes`, `flaked rice`, `beaten rice`, `riz aplati`, and `riz battu`; no density or unit mappings. Its ledger measurement is not yet researched and substitution is blocked pending evidence. |
| Poha forms | Thin, medium, and thick commercial grades attach to the generic flattened-rice reference. None is red-rice-specific; the grade sources do not establish red-rice interchangeability. |
| `ingredient-ref-roasted-red-rice-flour` | `roasted red rice flour / farine de riz rouge torréfiée`, `FLOUR_AND_STARCH`; keep the milled flour separate from both grain references. |

No active reference, form, legacy candidate, or ledger record has an exact normalized key for `red rice flakes`, `red rice flake`, `red rice poha`, `riz rouge aplati`, `flocons de riz rouge`, `poha rouge`, `sivappu aval`, or `matta aval`. The existing exact owners for `red rice` / `riz rouge` and `rice flakes` / `flaked rice` remain the two rows above. No new candidate ledger record exists.

The audit scanned all 114 manifest-listed recipes and each ingredient row for the candidate names and spelling variants: `red rice flakes`, `red rice poha`, `red rice aval`, `red poha`, `sivappu aval`, `matta aval`, `riz rouge aplati`, `flocons de riz rouge`, and `poha rouge`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe link or quantity change is proposed.

## Product, numeric, and substitution boundaries

- **Product identity:** the proposed row is for plain red-rice flakes/poha. Do not map every red-rice product, the generic poha name, a prepared poha dish, or an unspecified rice-flake product to this row.
- **Manufacturing:** Daivik describes its own red rice poha as parboiled, flattened, then dried. Do not store that exact sequence as universal process metadata or infer that another seller's product follows it.
- **Package and nutrition numbers:** the Canadian listings show 400 g and 500 g product sizes; Daivik lists a 1/2 kg option and product-specific nutritional and preparation claims, including an 8–10 minute cooking statement. These are listing-specific label data, not a standard serving, volume conversion, density, cooking yield, or recipe instruction for the proposed identity.
- **Forms and conversions:** no source establishes standardized red-poha thickness grades, a red-rice-to-flake conversion, density, unit mapping, dry-to-prepared yield, or equivalence with the generic thin/medium/thick poha forms. Add none.
- **Substitution:** no source establishes a global substitution between intact red rice, red rice flakes, generic rice flakes, or another cereal. Add no rule.

## Source register

The three `WP03-RRPOHA-20261012` source IDs below were checked against proposal files and the shared research ledger before use; none was previously allocated. Reused source IDs are identified as existing ledger evidence and are not new source records.

| Source ID | Source | Claim supported and limit |
| --- | --- | --- |
| `WP03-RRPOHA-20261012-S01` | Indian Spice Haven, [Red Rice flakes (Aval/poha) 400g](https://www.indianspicehaven.ca/product-page/red-rice-flakes-400g), product title and listing. | Canadian retail listing directly uses `Red Rice flakes (Aval/poha)`. Supports the English product wording and co-occurrence of `poha` as a label; it provides no grain variety or processing specification. Its 400 g package is SKU data only. |
| `WP03-RRPOHA-20261012-S02` | Walmart Canada (French), [Unitaste Riz Rouge Poha / Matta Aval — Riz Rouge Aplati](https://www.walmart.ca/fr/ip/Unitaste-Riz-Rouge-Poha-Matta-Aval-500g-17-6oz-Riz-Rouge-Aplati-pour-Recettes-Traditionnelles/1EW9HTGVSXW8), product title, description, and details. | The French marketplace listing calls the item `Riz Rouge Poha / Matta Aval`, describes red rice flattened into flakes, labels its food type `Flocons`, and lists `Riz Rouge` as ingredient. Supports the exact marketplace phrase `Riz Rouge Aplati` as provisional display wording. Direct page opening returned a cache miss, so the review relies on the search-indexed listing text; it makes no stock or availability claim. `Matta Aval` remains product-qualified, not a global alias. |
| `WP03-RRPOHA-20261012-S03` | Daivik Organic, [Red Rice Poha / Sivappu Aval](https://daivikorganic.com/products/red-rice-poha-sivappu-aval), product heading and description. | Manufacturer names a red-rice-poha product and describes one process: parboil red rice, flatten, and dry to make flakes. Supports `red rice poha` as the sole proposed English alias and the processed-product boundary. Does not define a universal process, standardized grade, or Québec French term. Its health, package, nutrition, and cooking claims are outside this proposal's reusable data. |

Existing ledger sources reused for adjacent boundaries: **`WP03-S92`** identifies rice flakes as Poha/Avalakki and documents a general process; **`WP03-S94`** describes poha as flattened parboiled rice without establishing a universal rice variety; **`WP03-S128` / `WP03-S129`** provide the federal English/French pair `Red Rice / Riz rouge` for the edible red-bran grain; **`WP03-S95`** records generic Canadian French product wording `Flocons de riz (Poha)`. These sources support the neighboring identities only; none alone establishes red rice flakes as a Québec terminology-authority term.

## Next open work

This proposal does not close the Section F checklist. Continue the regional cereal-mix and preprocessed-grain sweep ([plan, open regional coverage](../../RecipeBook-global-ingredient-catalog-plan.txt#L2067)), and obtain independent Québec terminology review if a formal preferred term for red rice flakes is required. Keep the existing red-rice identity, generic poha row, poha grades, and lyed-corn decision as reviewed; this packet introduces only the red-rice-flakes product boundary.

## Root integration — 2026-10-12

Integrated `ingredient-ref-red-rice-flakes` as `red rice flakes / riz rouge aplati` in `GRAIN_AND_CEREAL`, with the single English alias `red rice poha`. The French display is provisional product wording from the Canadian French marketplace listing, not an OQLF or TERMIUM preferred term. Kept intact red rice and generic flattened rice/poha as separate identities. The app's phrase-first picker returns three rows for bare `red rice`: intact red rice, roasted red rice flour, and red rice flakes. This source-code behavior was verified from `IngredientSearch.kt`, not through live UI QA. The 114-recipe / 1,123-row corpus has no candidate phrase match. No forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions were added; ledger measurement and substitution states remain `not_yet_researched`. The three reviewed source records are now attached to the accepted ledger record. See [the integration batch](../batches/wp03-section-f-red-rice-poha-identity-integration-20261012/README.md). No app tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`.
