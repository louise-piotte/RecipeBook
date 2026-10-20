# WP02 B2 next gap review — pecan flour and pecan meal boundary

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as a documentation-only boundary hold on 2026-10-12. No catalog JSON, research ledger, recipe, or generated file changed. See the [hold integration README](../batches/wp02-b2b3-pecan-flour-boundary-hold-integration-20261012/README.md).
- **Scope:** One previously unreviewed B2 seed-derived flour family: pecan flour and pecan meal. This does not reopen the active pecan or pecan-butter identities, or the separate almond, walnut, Brazil-nut, and other flour reviews.
- **Proposal-local source IDs:** `WP02-B2-PECAN-FLOUR-IDENTITY-20261012-S01` through `S08`. The prefix was absent from the ledger, proposal archive, and batch archive when checked.

## Recommendation

**Keep `pecan flour` and `pecan meal` unassigned pending a product-scope and Québec French naming decision.** Current food products and primary research establish at least two materially different products under overlapping names:

1. Some makers sell finely ground whole pecans as `pecan flour` or `pecan meal`.
2. Food-science sources use `pecan flour` or `pecan nut expeller meal` for the solid cake left after pecan-oil pressing, sometimes further defatted.

The products differ in starting material, fat content, particle size, bulk density, and tested baking behavior. The wording does not reliably disclose which material a recipe means. Canada recognizes a pecan flour/meal/powder import class, but that customs grouping also does not settle the process boundary. [S02–S04, S07–S08]

Do not create an active identity or assign `ingredient-ref-pecan-flour` in this packet. Do not put `pecan flour`, `pecan meal`, or their French candidates on the whole-pecan or pecan-butter rows. No name, alias, form, measurement, conversion, recipe link, or substitution is proposed for integration.

## Identity and name boundary

| Phrase or product | Disposition | Evidence and limit |
|---|---|---|
| `pecan flour` made from finely ground whole pecans | **Real product, but keep unassigned for now.** | Hearthy labels a single-ingredient product `Pecan Flour` and describes it as freshly milled American pecans. This establishes that the whole-kernel product exists; other primary sources also use `pecan flour` for oil-press residue. [S03, S08] |
| `pecan meal` made from whole pecans | Keep unassigned; do not automatically alias to `pecan flour`. | Pearson Farm calls finely ground pecans `Pecan Meal` and lists pecans as its ingredients. A Canadian retailer also uses `pecan meal` as a synonym for flour without publishing a process specification. The name can refer to whole-ground nuts or to press-cake meal. [S04, S08] |
| `pecan nut expeller meal` / pecan press-cake flour | Keep the source-qualified phrase documentary only. | Primary studies identify this material as the co-product of oil pressing; one evaluates it as a partial wheat-flour replacement in muffins. Do not map it to an unqualified whole-pecan flour identity. [S07] |
| Defatted or low-lipid pecan flour | Keep separate from whole-ground pecans; no active identity proposed. | A 2025 study starts with cold-pressed pecan-oil residue and then uses solvent extraction to create a lower-lipid sample. That research product is a processing-specific material, not a synonym for finely ground pecans. [S08] |
| `pecan powder`, `ground pecans`, `pecan nut flour` | Leave unassigned. | The sources do not establish these as stable market-wide aliases for one milling grade or oil-removal scope. |
| `farine de pacane` / `farine de noix de pacane` | Keep as terminology candidates, not active displays or aliases. | OQLF prefers `pacane` and `noix de pacane` for Québec/Canada; it labels `noix de pécan` as France/Europe. A Québec retailer's French ingredient list uses `farine de noix de pécan` for a cracker, but that is not a standalone flour package or a terminology ruling. The evidence does not yet settle one Québec flour name across the competing product scopes. [S01, S05–S06] |
| `farine de noix de pécan` | Record as observed Québec-facing label wording only. | Avril's Nut-Thins listing uses this phrase in the cracker ingredient list. OQLF's regional label for the base nut term makes it insufficient by itself to establish the preferred catalog display. [S01, S05–S06] |

The whole pecan is not the flour: grinding creates a distinct milling product. However, the exact English phrase `pecan flour` also appears on source-described press-cake material. Creating one row under that unqualified key would merge products whose measured and functional properties differ; creating process-qualified rows now would require choosing names that current Canadian/Québec product evidence does not settle.

## Current catalog, ledger, and recipe audit

Read-only snapshot from the shared worktree on 2026-10-12:

| Surface | Snapshot |
|---|---|
| Active ingredient references | 1,306; SHA-256 `71f144acf8f5f81da44d2f85533f183ed9066f3d67385bfe460397f1d4b37e15` |
| Active ingredient forms | 98; SHA-256 `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,614; SHA-256 `df65f0b3ed1c5bac33da04ba482a2a2ffb7df14118d9a12217a02b8151507ac1` |
| Manifest-listed recipes / ingredient rows | 114 / 1,123; manifest-order recipe fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The normalized exact-key audit across active references, forms, and legacy candidates found no exact owner for `pecan flour`, `pecan meal`, `pecan nut flour`, `pecan powder`, `ground pecans`, `farine de pacane`, `farine de noix de pacane`, or `farine de noix de pécan`. No pecan-flour identity or candidate record exists in the research ledger, and a repository search found no prior focused pecan-flour review or use of this proposal's source-ID prefix.

Nearby active references remain distinct:

| Active ID | Current identity | Decision |
|---|---|---|
| `ingredient-ref-pecans` | `pecans / pacanes`; French aliases include `pacane` and `noix de pacane`; English alias `pecan halves` | Keep whole and chopped pecans here. Do not alias flour or meal to the kernel identity. |
| `ingredient-ref-pecan-butter` | `pecan butter / beurre de pacanes` | Keep the spread identity separate. It does not identify a flour process. |

All 114 recipe files and 1,123 ingredient rows were scanned for the candidate English and French phrases. **There were zero direct flour/meal phrase hits and zero full-recipe text hits.** The bundle has six pecan ingredient lines, all whole or chopped pecans linked to `ingredient-ref-pecans`; none requests flour or meal. The existing ledger's `1 cup / 125 g` observation is specifically for chopped pecans in recipe 114#20 and must not be reused as a flour measure. [S01, WP03-HI-GAP-20261011-S07]

## Measurement and substitution boundaries

- CFIA's import classification recognizes “Flour, meal and powder: Pecan nut,” but a tariff class is not a culinary measure, density, or statement that whole-ground and press-cake materials are interchangeable. [S02]
- The 2025 primary study reports laboratory **tapped bulk density**, not a kitchen cup conversion. Its high-lipid and low-lipid samples measured 0.532 ± 0.003 g/mL and 0.217 ± 0.005 g/mL, respectively. The high-lipid sample was already residue from cold-press oil extraction; the low-lipid sample was further defatted. The method tapped 10 g in a graduated cylinder until volume stopped changing. These values are sample- and method-specific; keep them out of any generic default density or unit mapping. [S08]
- A 454 g package is net weight, not a household measure. No reviewed Canadian source provides a reproducible household measure for an exact, process-defined pecan flour. [S03]
- The 2018 muffin study replaced up to 40 g per 100 g of wheat flour with **pecan nut expeller meal**. Its findings apply to that press-cake material and muffin formula only; they do not establish a general ratio for whole-ground pecan flour, other flour types, or other recipes. [S07]
- No global or contextual substitution rule is proposed. A seller's broad “flour substitute” wording is not a controlled, transferable ratio; the source-specific muffin trial does not support applying its ratio outside the tested formulation. [S03, S07]

## Integration outcome

Keep the broader WP02 B2/B3 checklist open. Before a later integration, resolve whether the intended product is finely milled whole pecans or oil-press cake, then obtain a current Canadian product specification and a Québec-facing French name for that same process-defined material. Keep `pecan meal` unassigned unless a stable grind or processing boundary is shown. No catalog row, alias, form, measurement, conversion, yield, recipe link, or substitution was added.

## Source register

All live pages and documents were accessed on 2026-10-12. Proposal source IDs are local to this file and are not ledger records.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **S01** | Office québécois de la langue française, [*noix de pacane* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083802/noix-de-pacane), updated 2023. | Identifies `noix de pacane` and `pacane` as Québec/Canada terms and labels `noix de pécan` as France/Europe. | Defines the nut, not a flour product. |
| **S02** | Canadian Food Inspection Agency, [CFIA-AIRS updates, 2024-12-02](https://inspection.canada.ca/en/importing-food-plants-animals/plant-and-plant-product/airs/cfia-airs-updates-2024-12-02), code 11.06.30.7118.01 and organic code .02. | Official Canadian import classification for pecan-nut flour, meal, and powder. | Customs grouping; does not resolve milling, pressing, fat content, Québec retail wording, or cooking equivalence. |
| **S03** | Hearthy Foods, [*Pecan Flour — Handcrafted Milled*](https://www.hearthyfoods.com/en-ca/products/pecan-flour), Canadian-facing product page. | Exact product name `Pecan Flour`; page says it is freshly milled from American pecans, has one ingredient, and is sold in a 16 oz / 454 g package. | One maker's product; it does not define the wider market's use of `pecan flour` or publish a general recipe substitution ratio. |
| **S04** | Pearson Farm, [*Pecan Meal*](https://pearsonfarm.com/products/pecan-meal), current maker listing. | Calls finely ground farm pecans `pecan meal`; lists pecans as the ingredient and recommends it as a flour alternative. | Product-specific naming and use; no general grind standard or transferable replacement quantity. |
| **S05** | Avril, [*Nut-Thins pacanes*](https://avril.ca/en/craquelins-nut-thins-pacanes-52255-1.html), Québec retailer listing. | French cracker ingredient list contains `farine de noix de pécan`. | A composite cracker ingredient declaration, not a standalone pecan-flour package or terminology authority. |
| **S06** | Avril, [French home page](https://avril.ca/fr), current Québec chain description. | Identifies Avril as a Québec natural-products retail chain. | Establishes retailer location, not the flour's manufacturing origin or a preferred flour term. |
| **S07** | L. Marchetti, A. N. Califano, and S. C. Andrés, [“Partial replacement of wheat flour by pecan nut expeller meal on bakery products. Effect on muffins quality,” *LWT* 95 (2018), 85–91](https://doi.org/10.1016/j.lwt.2018.04.050). | Primary muffin trial evaluates 0–40 g/100 g wheat-flour replacement with pecan-nut expeller meal and reports formulation-specific results. | Press-cake ingredient and muffin recipe only; not whole-ground pecan flour or a universal substitution rule. |
| **S08** | [“Study on techno-functional properties of pecan flour with different lipid content,” *Brazilian Journal of Food Technology* 28 (2025)](https://doi.org/10.1590/1981-6723.10624). | Primary study defines press-derived flour, compares high- and low-lipid samples, gives a tapped-density method, and reports sample-specific bulk densities. | Laboratory observations; the high/low lipid samples are not a universal commercial specification or kitchen measure. |
