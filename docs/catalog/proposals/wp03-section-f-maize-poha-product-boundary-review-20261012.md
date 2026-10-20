# WP03 Section F — maize poha product boundary review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as identity-only `ingredient-ref-corn-poha`; see the batch README for root disposition and post-integration validation.
- **Scope:** The open Section F checklist names regionally significant cereal mixes and preprocessed grains. Its poha follow-up explicitly keeps maize poha outside the generic flattened-rice identity ([plan, poha follow-up](../../RecipeBook-global-ingredient-catalog-plan.txt#L6154)). This review covers the separate maize product commonly marketed as corn/maize poha; it does not reopen rice-poha synonyms, grades, or the chiwda/chivda hold.
- **Recent-work check:** No focused maize-poha proposal or ledger candidate was found. Recent rice-poha, cereal-flake, and lyed-corn reviews cover adjacent naming only.

## Recommendation

**Accept one identity-only, human-food reference** with names that keep it separate from ready-to-eat breakfast corn flakes:

| Proposed field | Value |
| --- | --- |
| ID | `ingredient-ref-corn-poha` (unallocated in the current package and ledger) |
| English display | `corn poha` |
| Québec French display | `poha de maïs` |
| English aliases | `maize poha`, `makai poha`, `makka poha` |
| French aliases | `makkai poha` |
| Category | `GRAIN_AND_CEREAL` |
| Recipe links | None |
| Forms, density, unit mappings, measures, conversions, yields, substitutions | None |

The English name and aliases appear in the Canadian Rani product listing. Its French title is **Poha de Maïs**; a French-language Canadian specialty retailer also labels a related product **Makkai Poha**. These are market-attested names, not an OQLF or TERMIUM terminology ruling. A targeted OQLF/TERMIUM search did not surface a record for maize poha.

The proposed scope is plain, single-ingredient, human-food flattened maize sold under the poha name. A Gujarat manufacturer describes one process in which maize is boiled, rolled flat, and air-dried. Other sellers and manufacturers describe their own products differently, so do not make that sequence a universal catalog attribute. Keep formulated snack mixtures, feed products, maize grits, cornmeal, fresh corn kernels, and ready-to-eat breakfast corn flakes outside this reference.

Do **not** add `corn flakes` or `flocons de maïs` as aliases. OQLF defines that exact bilingual pair for a toasted breakfast cereal, and the active catalog already assigns both terms to `ingredient-ref-corn-flakes`. Although one manufacturer markets a product as “Corn Flakes (Makai Poha),” that product title does not make plain maize poha interchangeable with the Québec-defined ready-to-eat cereal.

## Current package and exact-owner audit

Pre-maize-integration snapshot on 2026-10-12: **1,246 active ingredient references, 94 forms, 114 manifest-listed recipe files / 1,123 ingredient rows, 66 legacy candidates, and 1,553 ledger records**. This snapshot predates the same-day pea-starch and maize-poha additions. The normalized exact-key audit used the repository's `normalize_search_key` helper across every active reference display and alias, form label and match term, legacy candidate display and alias, and the current ledger.

| Existing owner | Live state and boundary |
| --- | --- |
| `ingredient-ref-corn-flakes` | `corn flakes / flocons de maïs`, `GRAIN_AND_CEREAL`; no aliases, density null, no unit mappings. Its ledger identity is verified; measurement and substitution research remain not yet researched. OQLF source `WP03-S25` defines a ready-to-eat breakfast cereal and owns this bilingual pair. |
| `ingredient-ref-corn-kernels` | `corn kernels / maïs`, `VEGETABLE_AND_AROMATIC`. Keep the fresh/kernel identity separate from the proposed dry processed product. |
| `ingredient-ref-cornmeal` | `cornmeal / semoule de maïs`, `FLOUR_AND_STARCH`; English alias `corn meal`. Keep ground maize separate. |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)` with rice-flake aliases and thin/medium/thick rice-poha forms. It is rice-based and does not cover the maize product. |

No exact active, form, legacy, or ledger owner exists for `corn poha`, `maize poha`, `makai poha`, `makka poha`, `makkai poha`, `poha de maïs`, or `maïs pressé`. The exact terms `corn flakes` and `flocons de maïs` remain owned by `ingredient-ref-corn-flakes`. No corn-poha ID or candidate record already exists.

The manifest-listed corpus was scanned across all 114 recipe files and 1,123 ingredient rows for `corn poha`, `maize poha`, `makai poha`, `makka poha`, `makkai poha`, `poha de maïs`, and `maïs pressé`. The exact boundary names `corn flakes` and `flocons de maïs` were also checked. Result: **zero matching recipe files and zero matching ingredient rows**. No recipe link or amount depends on this product.

## Picker phrase behavior

The accepted names avoid the exact ready-to-eat corn-flakes owner. Reading `IngredientSearch.kt`'s phrase-priority matcher gives these post-integration results; this is a source-code assessment, not live picker QA:

- `corn poha`, `maize poha`, `makai poha`, `makka poha`, `makkai poha`, and `poha de maïs` match the proposed reference only.
- `corn flakes` and `flocons de maïs` continue to match only `ingredient-ref-corn-flakes`. Adding either as a candidate name or alias would make those exact queries return both references, so the proposal excludes them.
- A broad `poha` query returns the existing flattened-rice-poha row, the integrated red-rice-flakes row (through its `red rice poha` alias), and this maize-poha row because all three contain that phrase. Their full names and aliases retain the rice/maize distinction.

No result ordering, picker screen, or runtime ranking was verified.

## Product and data boundaries

- **Ready-to-eat cereal:** OQLF's `flocons de maïs / corn flakes` definition describes coarse maize meal cooked, dried, rolled, and toasted as a breakfast cereal. The Gujarat maker's maize poha page describes a different product line and a boil/flatten/air-dry example. Keep the products separate; do not use `Corn Flakes (Makai Poha)` as a global alias.
- **Process:** one manufacturer describes boiling, flattening, and air-drying maize; a Canadian listing calls its product raw dried corn flakes. Another maker calls a similarly named product `Corn Flakes (Makai Poha)`. The sources establish market identity but do not establish one universal process sequence or final cooking method.
- **Neighboring products:** exclude `corn flakes` / `flocons de maïs`, generic corn kernels, cornmeal / `semoule de maïs`, corn grits, rice poha, composite namkeen/chivda mixtures, and feed-only items such as `poha waste`. One maker separately lists a small maize-poha product made from small maize grits; do not import that manufacturer's size class as a global form.
- **Numbers:** a Rani listing shows a 14 oz (400 g) package; one specialty retailer page is for a 400 g item; Babji lists bulk pack sizes of 10, 17, and 25 kg and a separate 25 kg small grade. These are product/package details, not servings, mass-to-volume conversions, density, or transferable recipe quantities.
- **Forms and yields:** no source establishes standard thickness or size cutoffs, density, unit mappings, hydration ratio, dry-to-cooked yield, or cooking time for the general identity. Add none.
- **Substitution:** no source or bundled recipe supports substitution between maize poha, ready-to-eat corn flakes, cornmeal, or rice poha. Add no global or contextual rule.

## Source register

The four `WP03-MAKAI-20261012` source IDs below were searched across proposal files and the shared ledger before use; none was previously allocated. Existing source `WP03-S25` is reused for the Québec ready-to-eat corn-flakes boundary and is not duplicated.

| Source ID | Source | Claim supported and limit |
| --- | --- | --- |
| `WP03-MAKAI-20261012-S01` | Gujarat Food Products, [Makai poha](https://www.gujaratfoodproducts.in/) and [product range](https://www.gujaratfoodproducts.in/products), manufacturer pages. | First-party Gujarat maker names four `Makai Poha` labels and describes one process: source maize, boil, flatten with rollers, air-dry, inspect, and pack. It also distinguishes a cattle-feed line. Supports a regional human-food product identity and one manufacturer's process, not a universal specification or Québec name. |
| `WP03-MAKAI-20261012-S02` | Walmart Canada (French), [Rani Poha de Maïs 14 oz (400 g)](https://www.walmart.ca/fr/ip/Rani-Corn-Poha-14oz-400g-Tout-Naturel-Compatible-avec-le-Sans-Gluten-V-g-talien-Casher-Origine-Indienne/2UJ2ER2NTK7K), title, product details, and ingredient listing. | Provides the exact French retail title `Poha de Maïs`; its product details list `Corn Poha`, `Maize Poha`, `Makai Poha`, and `Makka Poha` as names, and list maize as the ingredient. The page says Rani is the brand owner/seller but notes that product text is supplied by sellers; use it as label/name evidence, not a government definition or manufacturing specification. Its 14 oz (400 g) size is SKU data only. |
| `WP03-MAKAI-20261012-S03` | Spice Divine (Canadian French), [Flocons de maïs From The Earth (Makkai Poha) 400 g](https://spicedivine.ca/fr/products/from-the-earth-corn-flakes-makkai-poha-400g), indexed product title and description. | Supports Canadian French retail use of `Makkai Poha` and the product title's `Flocons de maïs` wording; its description contrasts the product with typical corn flakes. Direct page retrieval returned a cache miss, so this review uses indexed title/description text only and makes no stock claim. `Flocons de maïs` is not proposed as an alias because the OQLF-defined breakfast-cereal term already has an active owner. |
| `WP03-MAKAI-20261012-S04` | Babji Food Industries, [Maize flakes and Makai Poha](https://babjifoods.com/), product descriptions. | Manufacturer calls one product `Corn Flakes (Makai Poha)` and separately lists small maize poha, grits-based flakes, and feed-only poha waste. Supports the need to preserve the `corn flakes` and feed boundaries. Its bulk packaging and small-grade claims are product-specific and are not used as shared measurements or forms. |

Reused ledger source **`WP03-S25`**, OQLF, [flocons de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17029622/flocons-de-mais), defines the Québec French term and its English equivalent `corn flakes` as a breakfast cereal. It supports the adjacent active identity and the reason not to reuse that exact phrase for poha.

## Next open work

Root accepted the proposed identity, names, category, and source-backed aliases. The French display remains provisional; `corn flakes / flocons de maïs` stays exclusively on `ingredient-ref-corn-flakes`. Integration added one reference and one ledger record, with no recipe links, forms, numeric properties, yields, or substitutions. The post-integration package has 1,248 references / 94 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,555 records / 5,400 source entries / 4,438 distinct source IDs. Static package, reference, generated-index, picker-phrase, and ledger validation passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

This integration resolves only the maize-poha product boundary. The broader Section F regional cereal-mix and preprocessed-grain checklist remains open ([plan, regional cereal coverage](../../RecipeBook-global-ingredient-catalog-plan.txt#L2067)). Continue the other open Section F candidates and obtain independent Québec terminology authority review if a formally preferred term for maize poha is required.
