# WP03 Section F R513 — Inno Foods Blueberry Oat Puffs review (2026-10-17)

## Decision

**Hold this one ready-to-eat cereal outside active references, forms, legacy mappings, and the shared research ledger.** The manufacturer's current Canadian product page confirms the product title and a formulated cereal containing oat puffs, blueberry puree, sugars, coconut, and seeds. Recent Canadian retailer indexing also names a 680 g product. I could not verify a Québec-facing French product title or directly read the French text on the manufacturer's linked Canadian package mockup. Do not invent a French display or alias from the English title.

This is a distinct candidate under the still-open Section F sweep for regionally significant cereal mixes and preprocessed grains ([plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4385)). It is a formulated cereal, not the plain whole-kernel puffed-oats identity held in the [earlier puffed-oats review](./wp03-section-f-next-gap-review-20261011-puffed-oats.md). The separate [R500 Cinnamon Toast Crunch family hold](./wp03-section-f-cinnamon-toast-crunch-family-review-r500-20261017.md) and [R510 pearl-barley CNF access review](./wp03-section-f-next-gap-review-r510-20261017.md) address different candidates and are not reopened here.

**No catalog or ledger fields are proposed.** Do not allocate an ID, English or French display, aliases, form, measurement observation, legacy mapping, recipe link, conversion, yield, or substitution from this hold. The unallocated string `ingredient-ref-inno-foods-oat-puffs-blueberry-cereal` is used below only to model a possible future picker result; it is not reserved.

## Product evidence and identity boundary

Inno Foods' current product page calls the product **Oat Puffs Blueberry Cereal**. It describes crispy whole-grain oat puffs with blueberry puree, seeds, and coconut. The ingredient declaration names the oat-puff component as gluten-free rolled oats, brown rice flour, coconut oil, psyllium husk powder, sea salt, and baking soda, then lists sugars, blueberry puree, coconut chips, sunflower and pumpkin seeds, additional oats, and other ingredients [S01]. This formula distinguishes the finished cereal from plain puffed oat kernels and from a single-ingredient puffed-oats product.

The manufacturer page links three image assets whose alternative text identifies a Canadian front mockup, back mockup, and Nutrition Facts mockup. The text-readable page itself provides only the English product title and ingredient wording. The available text extraction did not expose the lettering inside those images, so it neither verifies nor disproves an exact French package name [S01]. The manufacturer product page displays “Notify Me”; do not use it alone to claim the product is orderable now [S01]. Its current Granola & Cereal collection also lists the item as a new product [S02].

A Canadian Instacart/Costco listing uses **Inno Foods Blueberry Oat Puffs Cereal**, directly displays a 680 g package, and shows a price [S03]. The page does not provide a visible product-code crosswalk to the manufacturer's page. A Costco East fan blog's 2026-10-14 Ontario & Atlantic Canada post lists item 2069789 as **INNO FOODS BLUEBERRY OAT PUFFS 680 G** [S04]. This is timely secondary retailer evidence for that region, not a Québec listing or a guarantee of local stock.

Targeted web searches on 2026-10-17 for `Inno Foods` with `Oat Puffs`, `bleuets`, and `céréales` did not surface a product-matched French Québec title. That search result is bounded evidence about sources located in this review, not proof that no French package wording exists. Because the local-language name remains unverified, leave the bilingual identity unallocated.

## Current ownership and archive audit

The audit read the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy-import candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), current Section F plan and roadmap, prior proposals, and the manifest-listed recipe corpus.

Current snapshot: **1,787 active references**, **143 forms**, **56 legacy candidates**, and **2,144 ledger records**. The ledger has **9,840 source entries**, **8,327 distinct source IDs**, and **7,037 distinct URLs**. A whole-ledger audit found no source ID mapped to more than one URL.

| Surface | Finding |
|---|---|
| Active references | No exact or normalized owner for `Inno Foods Oat Puffs Blueberry Cereal`, `Oat Puffs Blueberry Cereal`, `Inno Foods Blueberry Oat Puffs Cereal`, the proposed projection ID, or the retail item number. No active puffed-oats identity exists. Nearby oat references such as oat groats, rolled oats, quick oats, instant oats, oat bran, oat flour, and oat-milk references remain separate products. |
| Forms | No Inno Foods cereal form or matching form label/match term among the 143 forms. The ready-to-eat cereal is not a cooked/dry form of oat groats or rolled oats. |
| Legacy candidates | None of the 56 candidates owns this product name, brand, or item number. |
| Research ledger | No Inno Foods product identity, exact product-title candidate, or matching source URL exists. The separate `candidate-puffed-oats` record remains `needs_clarification` with measurement and substitution research `not_yet_researched`; its eight sources concern plain whole-kernel puffed oats, historical flour-based cereal wording, or related terminology. Do not repurpose or close it with this formulated cereal. |
| Prior review archive | The focused puffed-oats review concerns whole kernels and lacks verified Québec product wording. The R500 Cinnamon Toast Crunch review concerns an unrelated flavored cereal family. Searches of current proposals and batches found no prior Inno Foods Blueberry Oat Puffs decision. |
| Source ownership | None of the four URLs in this proposal is currently present in the ledger. All four proposal-local IDs below are unallocated, each maps to one URL, and no existing source ID is reused. |

The manufacturer's ingredient declaration does not quantify component proportions. Do not create links to rolled oats, rice flour, blueberry, coconut, or seeds as recipe components, and do not infer that this product can replace any of them.

## Phrase-first picker projection

The projection follows the live [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spacing; prefer complete normalized word phrases in reference names, aliases, and attached form terms; use substring fallback only when no phrase match exists. The conditional column models a single hypothetical English-only row named with the exact manufacturer title `Oat Puffs Blueberry Cereal`; that title is not proposed as a bilingual display and is not active data.

| Query | Current result count | Conditional count with that English-only title | Note |
|---|---:|---:|---|
| `Oat Puffs Blueberry Cereal` | 0 | 1 | Exact manufacturer title would be findable. |
| `Oat Puffs` | 0 | 1 | The title contains this phrase; no alias is needed for this English query. |
| `Inno Foods Blueberry Oat Puffs Cereal` | 0 | 0 | The retailer uses a different word order; that wording is not added as an alias without a verified product-code crosswalk. |
| `puffed oats` | 0 | 0 | It does not match the held plain whole-kernel candidate or this formulated cereal's title. Keep the product identities separate. |
| `Blueberry` | 1 | 2 | The current result is Mini-Wheats Blueberry; the cereal would be a separate product. |
| `oat` / `oats` | 9 / 9 | 10 / 9 | The English title contains singular `oat`, not the separate token `oats`. |
| `cereal` / `céréales` | 56 / 52 | 57 / 52 | Without sourced French wording the hypothetical English-only row would not support the French category phrase. This is a reason to keep the bilingual row held. |
| `Inno Foods` | 0 | 0 | The manufacturer product title is unbranded. Adding the retailer's brand-prefixed title as an alias would make this the only active Inno result even though the manufacturer lists other cereals; no such alias or brand-family claim is proposed. |

No form hint is available or proposed. No French product query is projected because no product-matched French display or alias is supported by the reviewed sources. These are static projections of catalog terms, not live Android picker QA.

## Manifest recipe demand and fingerprint

The scan parsed all **114 recipe files** listed in the current split seed manifest, covering **1,123 structured ingredient rows** and **753,988 raw recipe-file bytes**. The manifest-ordered corpus SHA-256 is **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, hashing each manifest-relative path, a NUL byte, the exact file bytes, and a trailing NUL byte.

Full-file and ingredient-row scans for `Inno Foods`, `Oat Puffs Blueberry Cereal`, `Blueberry Oat Puffs`, `oat puffs`, item `2069789`, and the projection ID found **zero matching files, zero matching ingredient rows, and zero reference links**. This is no bundled recipe demand for the reviewed product. General oat or blueberry recipes were not treated as demand for this formulated cereal.

## Fields and numeric behavior

This review proposes a **hold with no data fields**. If reopened after a product-matched French title is verified, assess one brand/product-specific `GRAIN_AND_CEREAL` reference separately. Use only product-backed English and French displays; do not guess a French translation from the English manufacturer title. Recheck whether the reference should carry the brand in its display and whether other Inno cereal products need a coordinated broad-brand picker decision. Do not add generic `blueberry cereal`, `oat puffs`, or `puffed oats` aliases by assumption.

The 680 g listing is package net mass, not a kitchen amount or serving conversion. The manufacturer page gives no source-backed cup measure, density, or preparation yield; the indexed retailer title and package size add none. Add no form, mass/volume mapping, measurement observation, density, conversion, package yield, or cooking yield. The ingredient declaration and breakfast use description establish no global or contextual substitution with oats, other puffed grains, or cereal blends. There are no recipe links to add.

## Source-ID to URL map

Sources checked online on **2026-10-17**. Each source ID below points to exactly one URL. These IDs are proposal-local and remain unregistered while the hold stands.

| Source ID | One source URL | Ownership and scope |
|---|---|---|
| `WP03-INNO-OATPUFF-R513-20261017-S01` | Inno Foods, [Oat Puffs Blueberry Cereal](https://innofoods.shop/products/oat-puffs-blueberry-cereal/) | Primary manufacturer source for the English product title, product description, ingredient declaration, Canadian mockup image labels, manufacturer address, and current “Notify Me” page state. It does not provide text-readable French product wording or a household measure. |
| `WP03-INNO-OATPUFF-R513-20261017-S02` | Inno Foods, [Granola & Cereal collection](https://innofoods.shop/product-category/granola-cereal/) | Primary manufacturer collection listing. Supports that the product appears in the current collection; the collection lists other cereal items and is not a Québec French label. |
| `WP03-INNO-OATPUFF-R513-20261017-S03` | Instacart/Costco Canada, [Inno Foods Blueberry Oat Puffs Cereal, 680 g](https://www.instacart.ca/products/131552614-inno-foods-blueberry-oat-puffs-cereal-680-g?retailerSlug=costco-canada) | Secondary retailer listing directly displays the alternate English title, 680 g package, and a price. It does not provide a Québec-specific display or product-code crosswalk to the manufacturer's page. |
| `WP03-INNO-OATPUFF-R513-20261017-S04` | Costco East Fan Blog, [Breakfast & pantry super post, October 14, 2026](https://cocoeast.ca/costco-east-breakfast-pantry-super-post-oct-14th-2026-ontario-atlantic-canada/) | Secondary Ontario & Atlantic Costco-listing corroboration: item 2069789, Inno Foods Blueberry Oat Puffs, 680 g. Not a Québec listing, manufacturer evidence, or store-stock guarantee. |

## Evidence limits and reopen conditions

- The product itself is established by a current manufacturer page, but the exact Québec-facing French product title remains unverified. The linked Canadian mockup images were identified by alternative text but their printed text could not be read through the available browser extraction.
- The Instacart/Costco page directly lists the alternate English title and a 680 g package, but does not establish availability in Québec. The October 14 Costco East listing is explicitly for Ontario and Atlantic Canada. Do not infer Québec presence or absence from either retailer source.
- The manufacturer product page says “Notify Me”; retailer listings are not proof of present stock. Recheck direct Canadian/Québec product details and exact product-code matching before asserting active sale status.
- Search non-results do not prove that French package wording or Québec availability does not exist. Reopen when an inspectable manufacturer label, Québec-facing retailer listing, or other direct local source supports the product-matched French display.
- The no-demand result covers the current manifest-listed recipe corpus only. New recipes may create later demand.

**Integration status:** Recorded as a documentation-only hold; no catalog, ledger, generated-index, or recipe data changed. See the [R513 integration README](../batches/wp03-section-f-inno-blueberry-oat-puffs-boundary-hold-integration-r513-20261017/README.md). Static reference/form/legacy/ledger ownership, source-ID/URL ownership, archive, picker, manifest-corpus, UTF-8, and relative-link checks were performed. No software tests, builds, emulator runs, or deployment were needed.
