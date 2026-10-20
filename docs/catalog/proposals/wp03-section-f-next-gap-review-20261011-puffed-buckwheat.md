# WP03 Section F: puffed-buckwheat identity review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** proposal only. No shared catalog, ledger, recipe, plan, roadmap, test, or other artifact was changed.
- **Scope:** one remaining Section F puffed-grain candidate: food-use puffed buckwheat, including its exact English and Québec French product wording, catalog boundary, recipe demand, and evidence limits.
- **Recommendation:** accept an identity-only `GRAIN_AND_CEREAL` reference as `puffed buckwheat / sarrasin soufflé`, with `buckwheat puffs` as the only proposed English alias. Treat the French name as Québec product-attested, not OQLF-standardized. Add no forms or quantity, conversion, yield, or substitution data.
- **Current package snapshot:** 895 active references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,145 research-ledger records, and 77 legacy candidates.
- **Fingerprint:** manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; references `bdbc64b60d828ee44fd3515ca4c37929e58c44fef4e0e8afd2231d17233be608`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; ledger `1add103daec0a0467dd4c5dcd74cd190a7d473c7289018af5b7c637c1c0293b4`.

## Why this is a distinct open item

The Section F checklist leaves “remaining puffed-grain candidates” open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1567). The same checklist already records puffed rice, wheat, quinoa, millet, amaranth, and sorghum, but has no buckwheat-puff decision. The aggregate checklist remains open for other products; this packet covers only puffed buckwheat.

The current catalog has separate identities for `buckwheat flakes / flocons de sarrasin`, `buckwheat flour / farine de sarrasin`, and `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`. None represents the puffed product. The active puffed-grain references also model the puffed product as its own identity rather than a preparation form.

A repository-wide search of prior Section F proposals, batch notes, the plan, and the package found no focused puffed-buckwheat or `sarrasin soufflé` review. The buckwheat-flakes and roasted-groat reviews address different products and do not decide this processing boundary.

## Identity and naming decision

The sources support a standalone product class. Simple Treasures lists `Buckwheat Puffs` separately from its buckwheat flakes and multigrain puffs. Its current Canadian-dollar shop page retains `Buckwheat Puffs` as a product; a Québec retailer lists the Simple Treasures product as `Sarrasin soufflé`. A separate manufacturer page describes a plain version made from 100% organic hulled buckwheat. Taken together, these sources support an identity for puffed buckwheat as a food ingredient, while not establishing the full composition of every product sold under the Québec listing.

| Candidate field | Proposal | Evidence boundary |
| --- | --- | --- |
| Stable ID | `ingredient-ref-puffed-buckwheat` | Available as a proposed ID in the current snapshot; it is not active or assigned to a form, legacy candidate, or ledger record. |
| English display | `puffed buckwheat` | A concise catalog display for the product sold as `Buckwheat Puffs`; retain the source wording as the only proposed English alias. |
| Québec French display | `sarrasin soufflé` | Directly attested in Satau's bilingual product portfolio and a Québec retail listing for Simple Treasures. This is product wording, not a claim of OQLF preference. |
| English alias | `buckwheat puffs` | Exact manufacturer/product-catalog wording. Do not add further variants without a useful, unambiguous source. |
| French aliases | None | Keep the source-attested display only. Do not create `grains de sarrasin soufflés` or another mechanical variant as an alias. |
| Category and numeric fields | `GRAIN_AND_CEREAL`; null default density; empty unit mappings | The current puffed-grain identities use this category. The reviewed sources do not establish transferable quantity data. |

Define the identity narrowly as buckwheat grain sold in puffed form for food use. Keep buckwheat flakes, flour, intact or roasted groats, soba noodles, and raw buckwheat separate. Keep multigrain puff products, formulated cereals, sweetened or coated snack products, bars, and puffed-grain cakes outside this identity unless a future exact ingredient line names puffed buckwheat itself. Do not infer a buckwheat species, cultivar, or puffing method from the product names.

## Catalog, collision, and recipe audit

The audit read the current split package and all 114 manifest-listed recipe files. Exact normalized-key checks used the repository's `normalize_search_key` behavior over these candidate terms: `puffed buckwheat`, `buckwheat puffs`, `buckwheat puff`, `sarrasin soufflé`, `sarrasin souffle`, `grains de sarrasin soufflés`, and `grains de sarrasin souffles`.

- The proposed ID is absent from active references, forms, the 77 legacy candidates, and all 1,145 ledger records.
- There is no exact normalized display, alias, or form-term collision for the proposed names. No exact candidate entry exists in the ledger or legacy file.
- The closest active identities are `ingredient-ref-buckwheat-flakes`, `ingredient-ref-buckwheat-flour`, `ingredient-ref-roasted-buckwheat-groats-dry`, and `ingredient-ref-soba-noodles`. None owns the proposed exact product keys.
- Those neighboring buckwheat references have null default density and empty unit mappings. The package has no buckwheat form, package-yield, or substitution entry; the eight research-ledger unit conversions also contain no buckwheat/sarrasin mapping. The current package has zero global or contextual substitution rules.
- Broad searches for `buckwheat` or `sarrasin` may also return those neighboring products; keep those broad terms off this new identity. Broad `puffed` searches similarly reach several existing puffed-grain rows.
- All 114 recipe files and 1,123 ingredient rows were searched for the candidate terms and neighboring buckwheat/sarrasin terms. There were **zero recipe-file hits and zero ingredient-row hits**. No recipe link or text change is proposed.

This is a catalog-snapshot audit, not a live picker test or an exhaustive retail survey. Recheck exact keys and recipe demand if this proposal is integrated against a later package snapshot.

## Forms, quantities, conversions, yields, and substitutions

- **Forms:** add none. Puffed buckwheat is a processed product identity, not a raw buckwheat preparation-state form. No bundled recipe calls for dry/cooked buckwheat puffs or another puffed state.
- **Measures and density:** add no default density, volume mapping, or serving measure. One manufacturer lists a 14 g serving for its own 100% buckwheat product; that value has no household-volume equivalent and is not transferable to another puffed-buckwheat product. Package weights in retail listings are package sizes, not recipe measures.
- **Conversions and yield:** add no raw-to-puffed conversion, mass-volume relation, or cooking yield. The sources provide no general puffing expansion ratio or quantity relation.
- **Substitutions:** add no global or contextual rule. Similar use as a topping or breakfast cereal does not establish a replacement amount, dish scope, or method.
- **Recipe links:** none. The corpus has no exact or neighboring buckwheat-puff ingredient line.

## Source register

Sources were accessed on 2026-10-11. IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PBUCKWHEAT-20261011-S01` | Good Morning Cereals, [Buckwheat Puffs](https://www.goodmorningcereals.com/products/buckwheat-puffs/), product and ingredient sections. | Manufacturer product page names `Buckwheat Puffs` and lists `Organic Hulled Buckwheat (100%)`. It establishes a single-grain human-food product example. Its 14 g serving and 125 g pack are specific to this manufacturer's product; they do not establish a general measure, density, or conversion. The page does not provide Québec French wording. |
| `WP03-PBUCKWHEAT-20261011-S02` | Simple Treasures Food Ltd., [Shop](https://simpletreasurefoods.com/shop/), cereal product list. | Current manufacturer shop lists `Buckwheat Puffs` as a separate item in its Puffs category, apart from `Buckwheat Flakes` and `Multi-grain Puffs`. The shop listing does not expose the buckwheat-puffs ingredient statement or processing method. |
| `WP03-PBUCKWHEAT-20261011-S03` | Satau, [Simple Treasures product portfolio, French edition](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-FR-2021-07-12.pdf), Simple Treasures cereal lineup. | Distributor portfolio pairs `Buckwheat Puffs / Sarrasin soufflé` and presents buckwheat puffs separately from multigrain puffs. The catalog is dated 2021; it supports the bilingual marketed wording, not current stock, ingredient composition, or a standardized French term. |
| `WP03-PBUCKWHEAT-20261011-S04` | Epipresto / À Votre Santé, [Sarrasin soufflé — Simple Treasures](https://epipresto.ca/products/sarrasin-souffle-a-votre-sante-175-g), Québec retail listing. | Québec retailer names the product `Sarrasin soufflé - Simple Treasures`. The page gives a package presentation but no ingredient statement or manufacturing detail. It supports Québec product usage, not a general composition or quantitative mapping. |

No food-specific OQLF entry for `sarrasin soufflé` was located in this review. Keep that phrase described as Québec product-attested wording and leave independent terminology review open; do not present it as an OQLF-preferred term.

## Review disposition

**Accept `ingredient-ref-puffed-buckwheat` for identity-only integration review** as `puffed buckwheat / sarrasin soufflé`, with only the English alias `buckwheat puffs`. The Section F checklist explicitly leaves puffed-grain coverage open, and current manufacturer plus Québec product evidence supports a bounded puffed-buckwheat ingredient identity and bilingual product wording. Preserve the distinction from flakes, flour, groats, noodles, and formulated grain products. Add no forms, recipe links, density, measures, conversions, yields, or substitutions. Keep the French term's status limited to product-attested wording.
