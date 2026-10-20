# WP02 Section A7 R385: Finnish rye semolina (`Ruismanna`) boundary

- **Reviewed:** 2026-10-17
- **Status:** Research proposal only. No seed catalog, form, recipe, ledger, plan, checklist, roadmap, README, or generated file was changed.
- **Scope:** One previously unallocated rye milling candidate: the Finnish mill product `Ruismanna`, marketed by one Finnish retailer in English as `rye semolina`. This review does not reopen the accepted `rye meal / gruau de seigle` identity, the `semoule de seigle` alias assigned to it, or other A7 candidates.
- **Proposal-local source IDs:** `WP02-A7-RYE-SEMOLINA-R385-20261017-S01` through `S03`. Existing source ID `WP02-RYEMEAL-20261010-S01` is reused for the already integrated rye-meal boundary; do not duplicate that ledger source.

## Recommendation

**Hold `rye semolina / Ruismanna` outside the active catalog.** The current Finnish mill source identifies a whole-grain rye product that it says works like wheat semolina and categorizes it among porridge products. A Finnish retailer gives the English title `rye semolina` and describes that SKU as steamed and suitable for rye porridge and breading. These are product-specific facts. The sources do not establish a general rye-semolina class, particle size, equivalence to the Canadian rye-meal identity, or a Canadian/Québec product and French picker name.

Do not add `rye semolina` as an English alias to `ingredient-ref-rye-meal`. The active rye-meal row is scoped by Canadian terminology evidence to whole-kernel rye ground coarse and dark for pumpernickel. The Finnish source does not establish that milling boundary, and the retailer adds a steam-treatment claim for its individual SKU. Do not create a separate active identity or use an inferred French translation. In particular, **do not assign `semoule de seigle` to this candidate**: that exact French phrase is already an alias on `ingredient-ref-rye-meal`, supported by the federal rye-meal terminology record. A new row with the same display/alias would create a picker collision and imply an equivalence the sources do not establish.

The French-language evidence threshold for reconsideration is a current Canadian or Québec source that names this product or a clearly equivalent marketed product in French, with enough product context to distinguish it from the existing coarse rye meal. A Québec terminology record naming the product would also qualify. Do not construct `semoule de seigle cuite à la vapeur`, `gruau de seigle vapeur`, or any other product name from separate source phrases.

## Catalog ownership and picker impact

Exact normalized searches found no owner for `rye semolina` or `Ruismanna` among the active references, forms, legacy-import identities, or research-ledger record IDs. No new candidate record is needed to record a general identity: the available evidence is one foreign product with no Québec French identity, while the exact French term suggested by a literal translation already belongs to another product boundary.

The neighboring active rows are:

| Current row | Existing terms | Boundary to retain |
| --- | --- | --- |
| `ingredient-ref-rye-meal` | `rye meal / gruau de seigle`; EN aliases `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`; FR aliases `semoule de seigle`, `farine à pumpernickel` | TERMIUM describes whole-kernel rye ground coarse and dark for pumpernickel. Keep the accepted Québec/French terms here. |
| `ingredient-ref-rye-flour` | `rye flour / farine de seigle` | General rye flour; not evidence for a semolina-like or steam-treated product. |
| `ingredient-ref-whole-rye-flour` | `whole rye flour / farine entière de seigle` | Whole-rye flour identity; no alias for `rye semolina`. |
| `ingredient-ref-durum-semolina` | `durum semolina / semoule de blé dur` | Wheat-specific semolina identity; do not extend its grain scope to rye. |

There is no active exact owner for the English phrase `rye semolina`. A future alias on the current rye-meal row would make a `rye semolina` lookup select the coarse pumpernickel-meal concept, although the Finnish source does not establish that same milling state. A distinct row would need its own source-backed Québec French name because the direct French phrase `semoule de seigle` already belongs to the rye-meal row. Keep `rye semolina`, `Ruismanna`, `rye meal`, and `semoule de seigle` unmerged pending qualifying Canadian/Québec evidence.

## Full bundled-recipe demand check

The scan followed all **114** recipe paths in `manifest.v1.json`, covering **1,123 ingredient rows**. It searched each complete serialized recipe and each ingredient row for `rye semolina`, `Ruismanna`, `semoule de seigle`, `rye meal`, `rye grits`, and `rye porridge`. There were no phrase hits in any recipe or ingredient row and no recipe links to the candidate. The bundled library supplies no demand, use-context, or measure evidence for this product.

## Data decision

- **Active reference or alias:** None. Keep all rye rows and their terms unchanged.
- **Forms / legacy identity:** None.
- **Measurements:** None. The retailer's 0.6 kg package size is packaging, not a household measure.
- **Density, mapping, conversion, or yield:** None. No numeric behavior may be inferred from the product description or package size.
- **Substitution:** None. Product use as porridge or breading does not establish a replacement relationship or quantity.
- **Recipe links:** None; no bundled recipe matches.
- **Revisit trigger:** A current Canadian/Québec product or authority source that verifies both a French display and a product boundary separate from the existing coarse rye meal.

## Evidence

| ID | Source | Supports | Limits |
| --- | --- | --- | --- |
| **WP02-A7-RYE-SEMOLINA-R385-20261017-S01** | Riihipuoti, [Myllytuotteet (Mill products)](https://riihipuoti.fi/myllytuotteet/), accessed 2026-10-17. | The current mill product list presents `Ruismanna` under `Muut Puurokset` (other porridge products) and describes it as `Täysjyvärukkiista, toimii kuten vehnämanna` (from whole-grain rye; works like wheat semolina). This establishes a source-named Finnish rye product and a semolina-like use. | The page does not specify a particle-size class or the milling/steam process, provide an English or French product name, or establish Canadian/Québec availability. It is not evidence that this product is the same as Canadian rye meal. |
| **WP02-A7-RYE-SEMOLINA-R385-20261017-S02** | Kärkkäinen, [Riihipuoti Organic 0.6 kg rye semolina](https://www.karkkainen.com/en/riihipuoti-organic-0-6kg-rye-semolina), accessed 2026-10-17. | Finnish retailer's English title uses the exact phrase `rye semolina`. Its product copy says the SKU is fully steamed, can make rye porridge, may be used for breading, and lists organic rye as the ingredient and Finland as the origin. | This is retailer wording and a product-specific description, not a Québec term or a universal process definition. It does not give milling granulation or establish Canadian availability. The 0.6 kg value is only package size. |
| **WP02-A7-RYE-SEMOLINA-R385-20261017-S03** | Office québécois de la langue française, [semoule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule), accessed 2026-10-17. | The entry defines `semoule` for soft-wheat milling and durum-wheat pasta products. It does not provide a rye-semolina product name, so it cannot independently establish a Québec French display for `Ruismanna`. | This general OQLF entry is not evidence about Finnish rye products. The existing phrase `semoule de seigle` belongs to the separately scoped rye-meal row based on TERMIUM, not to a Finnish steam-treated product. |
| **Reused: WP02-RYEMEAL-20261010-S01** | Translation Bureau, TERMIUM Plus, [rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE), existing ledger source. | Defines the active rye-meal context as whole-kernel rye ground coarse and dark for pumpernickel. Lists `semoule de seigle` as a French term along with `gruau de seigle`. This documents the exact live French-term owner and its product scope. | This record does not discuss `Ruismanna`, steam-treated rye semolina, or a Finnish cereal product. Do not duplicate the source entry or stretch it to cover this candidate. |

## Review notes

- Repository searches found no earlier A7 proposal or checklist decision for `rye semolina` or `Ruismanna`.
- The proposal adds no source entry to the shared research ledger. Source IDs above are proposal-local except the explicitly reused rye-meal source ID.
- This is a proposal-only documentation change. No software tests, build, or emulator check was run.
