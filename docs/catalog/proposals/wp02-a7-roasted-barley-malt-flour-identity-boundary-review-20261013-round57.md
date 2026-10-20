# WP02 A7 R57: Roasted Barley Malt Flour Identity and Québec French Boundary Review

- **Reviewed:** 2026-10-13
- **Status:** Accepted and integrated on 2026-10-13 as identity-only `ingredient-ref-roasted-barley-malt-flour`; independent Québec French review remains open. Root integration updated the reference JSON, research ledger, generated index, plan, roadmap, and batch checklist. No recipe row changed.
- **A7 anchor:** The open parent item remains in [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt) under Section A7.
- **Scope:** The current Canadian ingredient product `roasted barley malt flour`, and its boundary with roasted barley flour, malted barley flour, generic malt flour, and roasted wheat malt flour. This does not reopen prior A7 meal, gluten-flour, or other malted/toasted-flour decisions.
- **Proposal-local source IDs:** `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S01` through `S06`. These IDs are local to this packet, are not ledger records, and use the common prefix abbreviated below as `[S01]`–`[S06]`.

## Recommendation

**Accept one identity-only `FLOUR_AND_STARCH` reference, provisionally named `roasted barley malt flour / farine de malt d'orge, pâle et grillée`.** Proposed ID: `ingredient-ref-roasted-barley-malt-flour`. The current IREKS North America product page names a 25 kg product “Light-coloured roasted barley malt flour”; the same company's current French page gives `Farine de malt d'orge, pâle et grillée` for that product [S01–S02]. The Canadian subsidiary is listed at its Brampton, Ontario address on both product pages. The French display is manufacturer wording for this named Canadian-market product, not an OQLF ruling or a Quebec-produced retail label.

Keep the proposed identity separate from `ingredient-ref-roasted-barley-flour`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-malt-flour`, and `ingredient-ref-roasted-wheat-malt-flour`. IREKS's exact name includes the combined malt and roast qualifiers. A separate manufacturer describes roasted barley malt flour as ground from roasted barley malt, supporting the distinction from flour made by roasting barley without establishing a universal recipe or process specification [S06].

Add no aliases, forms, density, unit mappings, recipe links, measurements, conversions, yields, or substitutions. Do not transfer IREKS's 25 kg package or its 1–5% flour-basis industrial dosage to household measures or catalog numeric data [S01]. If a reviewer rejects the French display because it is tied to the named product page, keep the candidate unallocated rather than inventing a generic French term.

## Checklist and archive review

Section A7 remains open for other grain meals, malted/toasted flour identities, and the gluten-flour boundary. The archive has focused decisions for roasted barley flour, malted barley flour, roasted wheat malt flour, roasted oat malt flour, malted spelt flour, malted barley meal, and multiple other meal and toasted/malted flour candidates. A search of A7 proposals, the live ingredient references, forms, legacy candidates, and ledger record IDs found no prior disposition or exact owner for `roasted barley malt flour`, `barley malt flour roasted`, or `farine de malt d'orge pâle et grillée`. Those closest rows are adjacent product identities rather than exact matches.

At proposal review time the bundled package had **1,380 active ingredient references and 100 forms**; the legacy-import file had **63 candidates**, the research ledger had **1,711 records**, and the manifest listed **114 recipes** with **1,123 ingredient rows**. Root integration added this reference and ledger record; the current package has **1,382 references, 100 forms, 63 legacy-import candidates, and 1,713 ledger records**.

## Identity boundary and exact ownership

| Current owner or record | Current state | Relationship to this candidate |
| --- | --- | --- |
| `ingredient-ref-roasted-barley-flour` | `roasted barley flour / farine d'orge torréfiée`; English alias `toasted barley flour`; null density and empty unit mappings. | The Quebec mill page names a roasted barley flour and describes heat treatment of selected barley varieties; it does not name malt as the input. Keep the existing row and aliases intact [S03]. |
| `ingredient-ref-malted-barley-flour` | `malted barley flour / farine d'orge maltée`; English alias `malt barley flour`; null density and empty unit mappings. | Arva's current Ontario product describes barley that germinates, dries, and is ground. Its French page uses `farine d'orge maltée`. Neither page calls that product roasted [S04]. |
| `ingredient-ref-malt-flour` | `malt flour / farine maltée`; English alias `malted cereal flour`. | Generic malt-flour wording does not specify barley and roasting together. Do not attach this product-specific identity as an alias to the generic row. |
| `ingredient-ref-roasted-wheat-malt-flour` | `roasted wheat malt flour / farine de malt de blé torréfié`. | This established wheat identity is a structural analogy only. It does not own barley wording. |
| `ingredient-ref-barley-flour` and `ingredient-ref-whole-barley-flour` | Plain barley flour and whole-barley flour identities. | Neither row records malting or roasting. Keep their current names and ownership. |
| Forms | No active form belongs to any of the barley-flour/malt-flour rows. The only barley forms are dry and cooked pearl barley under `ingredient-ref-pearl-barley`. | No form supports a roast, malt, cooked, or other same-ingredient state for this candidate. Do not create a form under a neighboring row. |
| Legacy and ledger | No exact legacy candidate or ledger record for this candidate phrase or proposed ID. | No existing candidate disposition or source record needs to be merged or rewritten. |

## Picker consequences

The projection below follows normalized complete-phrase matching and the partial-match fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static projection over current reference terms, not an app-picker test.

| Query | Current result | After the proposed identity | Decision |
| --- | --- | --- | --- |
| `roasted barley malt flour` | No result | Proposed row only | Exact product phrase would become searchable. |
| `barley malt flour` | No result | Proposed row only | Phrase appears contiguously within the proposed English display; no extra alias is needed. |
| `farine de malt d'orge, pâle et grillée` | No result | Proposed row only | The bilingual manufacturer's wording would return the named product. |
| `malted barley flour`; `malt barley flour` | `ingredient-ref-malted-barley-flour` | Same existing row | Preserve the unroasted malted-barley owner. |
| `roasted barley flour`; `toasted barley flour`; `farine d'orge torréfiée` | `ingredient-ref-roasted-barley-flour` | Same existing row | Do not add the new identity as an alias or merge it into this existing roasted-flour row. |
| `barley flour` | Four rows: generic, malted, roasted, and whole barley flour | Same four rows | The new display does not contain the contiguous phrase `barley flour`, so the query stays focused. |
| `barley` | Fourteen barley-related references | Fifteen, including the proposed row | Broad barley search grows by one. |
| `malt flour` | Four rows: generic malt flour, roasted oat malt flour, roasted wheat malt flour, and malted spelt flour | Five, including the proposed row | The query remains broad; keep the cereal and roasting qualifiers visible in the result. |

Do not add aliases `roasted barley flour`, `toasted barley flour`, `malted barley flour`, `malt flour`, `roasted barley malt`, or an unqualified `farine d'orge torréfiée`. Their current exact owners or broader scope would be misleading for this combined product.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files** and **1,123 ingredient rows**, checking the full recipe JSON and ingredient-row objects for `roasted barley malt flour`, `barley malt flour`, French malted/roasted barley flour wording, `malted barley flour`, `roasted barley flour`, `toasted barley flour`, and `roasted wheat malt flour`. There were **zero full-recipe hits and zero ingredient-row hits**. No recipe link, relink, or form-specific need is proposed.

## Forms, numeric evidence, and substitution

- IREKS lists a 25 kg package and a 1–5% dosage based on flour weight [S01]. These are supplier-specific professional bakery details, not a kitchen measure, volume-to-mass conversion, density, or reusable recipe instruction.
- The product page describes quality advantages for its named industrial product. Those statements do not establish household behavior or that it can replace roasted barley flour, ordinary malted barley flour, generic malt flour, or roasted wheat malt flour [S01].
- No current source reviewed gives a household serving, cup or spoon measure, density, unit mapping, cooked state, cooking yield, or transferable substitution ratio for this product. Add none.
- Do not infer that the IREKS product shares an enzyme activity, color grade, nutrition, or performance specification with other roasted or malted barley products. The second manufacturer's process description supports product-class distinction only [S06].

## Source register

Sources were reviewed on **2026-10-13**.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S01` | IREKS North America, [IREKS AROMA BARLEY MALT K](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-barley-malt-k), current product detail and product range, accessed 2026-10-13. | Names “Light-coloured roasted barley malt flour,” places the product in the North American `Malts` range, lists a 25 kg paper bag and a 1–5% flour-basis dosage, and lists IREKS North America at its Brampton, Ontario address. Product-specific commercial guidance only. |
| `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S02` | IREKS North America, [French product page for IREKS AROMA BARLEY MALT K](https://www.ireksnorthamerica.com/fr/produits/recherche-de-produits?cHash=b216dd7f734a6dff5e98ca234832a40d&tx_ireksproduct_product%5Baction%5D=detail&tx_ireksproduct_product%5Bcontroller%5D=Product&tx_ireksproduct_product%5Bproduct%5D=100378), French product description, accessed 2026-10-13. | The same Canadian supplier's French page says `Farine de malt d'orge, pâle et grillée avec une note de caramel malté`. Supports a product-specific Canadian French display; not a Québec terminology-authority ruling. |
| `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S03` | Les Moulins de Soulanges, [Roasted Barley Flour](https://moulinsdesoulanges.com/language/en/roasted-barley-flour/) and [Farine d'Orge Torréfié](https://moulinsdesoulanges.com/language/fr/farine-dorge-torrefie/), current bilingual product pages, accessed 2026-10-13. | A Québec mill names the existing roasted barley flour and describes heat treatment of selected barley varieties. It does not call its product malted; this is a neighboring product comparator, not evidence of identical processing or performance. |
| `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S04` | Arva Flour Mills, [Malted Barley Flour](https://arvaflourmills.com/products/malted-barley-flour) and [Farine d'orge maltée](https://arvaflourmills.com/fr/products/malted-barley-flour), current Ontario retail product pages, accessed 2026-10-13. | Describes barley germination, drying, and milling and provides a current French product name for ordinary malted barley flour. The English and French pages identify the available version as diastatic; no roast is specified. No product values are imported. |
| `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S05` | Office québécois de la langue française, [farine d'orge maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee), terminology record. | Supports the established Québec French term for the adjacent ordinary malted-barley-flour identity. It does not name or standardize roasted barley malt flour. |
| `WP02-A7-ROASTED-BARLEY-MALT-FLOUR-20261013-R57-S06` | Muntons, [PlantMalt Product Guide](https://www.muntons.com/wp-content/uploads/2022/09/PlantMalt-Product-Guide-1.pdf), `Mill-roast 1250` description and ingredient-declaration guidance, 2022. | The manufacturer says this product range is made by milling roasted malted barley and permits an ingredient declaration `Roasted Barley Malt Flour`. Supports a distinct roast-plus-malt class; does not establish IREKS's process, color grade, enzyme state, or Canadian availability. |

## Limits and review notes

- The recommended French wording comes from a current French-language page of a Canadian supplier based in Ontario. I did not find an OQLF entry or a Québec retailer label for this exact flour name. The Québec mill's `farine d'orge torréfiée` belongs to the separate active roasted-barley-flour row and is not a safe substitute French name for the malted product.
- IREKS markets a particular 25 kg bakery ingredient; no source establishes consumer-sized availability, bundled recipe demand, or a universal roasting/malting specification across manufacturers.
- This packet proposes one distinct active name, not a behavior model. The full A7 checklist remains open after this review.
- No app tests or emulator checks were needed for this database-JSON addition.

## Root integration result

Accepted as recommended. The live reference has no aliases, null density, empty unit mappings, and category `FLOUR_AND_STARCH`; its verified ledger record keeps the IREKS package and dosage source-specific and records no supported measure or substitution. No recipe link, form, legacy candidate, or additional active behavior was added. The regenerated catalog index now contains 1,382 references. Static seed-package normalization, ingredient-reference normalization, catalog generation, and research-ledger validation passed; the ledger has 1,713 records and zero errors. See [`wp02-a7-roasted-barley-malt-flour-identity-integration-20261013/README.md`](../batches/wp02-a7-roasted-barley-malt-flour-identity-integration-20261013/README.md).
