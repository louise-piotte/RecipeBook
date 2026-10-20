# WP03 Section F: puffed-barley identity review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** integrated on 2026-10-11; see `docs/catalog/batches/wp02-wp03-wp04-catalog-gap-integration-20261011/README.md`.
- **Scope:** one uncaptured candidate under the open Section F “remaining puffed-grain candidates” item: human-food puffed barley, its Québec French wording, product boundaries, recipe demand, and form/numeric evidence.
- **Recommendation:** accept an identity-only `GRAIN_AND_CEREAL` reference as `puffed barley / orge soufflée`, with no aliases. The French phrase appears in a current Québec restaurant menu, and OQLF confirms the feminine base noun `orge`; this is local culinary usage, not an OQLF-approved compound or a Québec retail package label. Add no forms, recipe links, density, measures, mappings, conversions, yields, or substitutions.
- **Current package snapshot:** 895 active ingredient references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,145 research-ledger records, and 77 legacy candidates.
- **Fingerprints:** manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; references `bdbc64b60d828ee44fd3515ca4c37929e58c44fef4e0e8afd2231d17233be608`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; ledger `1add103daec0a0467dd4c5dcd74cd190a7d473c7289018af5b7c637c1c0293b4`; legacy candidates `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57`.

## Checklist scope and prior coverage

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1567) leaves “remaining puffed-grain candidates” open. It records puffed rice, wheat, quinoa, millet, and amaranth as integrated; the later sorghum integration is recorded in the plan and roadmap. Focused reviews also cover puffed buckwheat and puffed spelt. A repository-wide search of prior Section F proposals, batch notes, the active plan, ledger, legacy candidates, forms, references, and recipe package found no focused puffed-barley identity decision or exact `puffed barley` / `orge soufflée` candidate. This packet covers only puffed barley.

The live package has separate barley identities for flakes, flour, hulled barley, pearl barley, malted barley flour, and roasted barley flour. The ledger also holds distinct candidates for pot barley and barley meal. None represents barley kernels sold puffed for human food. The feed-only phrase `orge soufflée` in an EU feed catalogue is not used to define this candidate; that catalogue entry is for a milled or broken feed material, while the human-food manufacturer source below describes kernels that retain their original shape.

## Identity and naming disposition

Current manufacturer pages identify a plain puffed-barley grain product. SchapfenMühle says its product is made from barley kernels using pressure and steam, and that each grain retains its original shape. Probios sells a separate puffed-barley breakfast ingredient whose ingredient statement is puffed barley. A current Naturitas Canada product listing names the Probios item and its 125 g package; it does not confirm Québec delivery. Together, these sources support a human-food product identity distinct from raw barley and milled, rolled, hulled, or pearled products.

| Candidate field or term | Proposed decision | Evidence boundary |
| --- | --- | --- |
| Stable ID | `ingredient-ref-puffed-barley` | Unallocated in active references, forms, ledger, and legacy candidates at the audited snapshot. |
| English display | `puffed barley` | Exact wording on current manufacturer and Canadian retailer product pages. Keep the identity to plain barley grain in puffed form; do not imply one hull state or one puffing process across suppliers. |
| Québec French display | `orge soufflée` | Exact phrase appears in a 2026 Québec restaurant event menu for a food dish. OQLF confirms `orge` is feminine for the grain. This supports source-attested local culinary wording, not a standardized compound or a standalone retail label. |
| English aliases | None | The reviewed manufacturer title is already `Puffed barley`; no additional alias is needed. Do not add `barley puffs`, `puffed barley cereal`, or broad `puffed grain(s)` without evidence of unambiguous search need. |
| French aliases | None | Keep the exact local phrase as the display only. Do not add the masculine `orge soufflé` spelling found elsewhere in the same event menu, or mechanically constructed variants. Accent-folded search covers the unaccented form of the chosen display. |
| Category and numeric fields | `GRAIN_AND_CEREAL`; null `defaultDensity`; empty `unitMappings` | Follows the active puffed-grain pattern. No transferable quantity observation was found. |
| Keep separate from | Raw barley, hulled barley / `orge mondé`, pearl barley / `orge perlé`, barley flakes / `flocons d'orge`, barley flour / `farine d'orge`, barley meal, malted barley flour, roasted barley flour, feed grains, sweetened or coated cereal pieces, and mixed-grain products. | The sources identify different barley products and processing scopes; shared grain or puffing terminology does not make them aliases. |

The Québec menu PDF uses `orge soufflée` in one dish and `orge soufflé caramélisé` in another. The menu is direct evidence of local culinary usage but not a package name or terminology ruling; the inconsistent grammatical forms are not promoted to aliases. OQLF's food-cereal entry names `orge` and says it is feminine for the grain, while separately noting masculine `orge mondé` and `orge perlé`. The proposed display uses only the feminine phrase actually present in the menu and keeps the compound's status bounded.

Do not assign a common cultivar, botanical species, hull status, or expansion method. SchapfenMühle documents one pressure-and-steam method; Probios gives a separate Italian product and a single-ingredient declaration. These do not establish a universal process or kernel specification.

## Live package, collision, and recipe audit

The audit read the current split package, all 48 forms, all 1,145 ledger records, all 77 legacy candidates, and every manifest-listed recipe. Exact keys used the repository's `normalize_search_key` function, which folds accents, case, punctuation, and ligatures. The candidate set included `puffed barley`, `barley puffs`, `barley puff`, `puffed barley cereal`, `puffed barley grain`, `orge soufflée` / its accent-folded form, `orge soufflé`, and the two menu variants noted above.

| Search scope | Result |
| --- | --- |
| Exact normalized-key collisions against active reference names/aliases, ingredient-form labels/match terms, legacy candidate names/aliases, or ledger strings | 0 for the reviewed candidate terms. |
| Exact proposed ID or candidate identity in active references, forms, ledger, or legacy candidates | None. `ingredient-ref-puffed-barley` is unallocated. |
| Nearby active references | `ingredient-ref-barley-flakes`, `ingredient-ref-barley-flour`, `ingredient-ref-hulled-barley`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-pearl-barley`, and `ingredient-ref-roasted-barley-flour`; none has the proposed exact display or alias. |
| Nearby ledger candidates | Pot barley and barley meal remain separate held candidates. Neither names puffed barley. |
| Candidate terms in manifest recipes | 0 of 114 recipe files; 0 of 1,123 ingredient rows. A broader search for any barley/`orge` term also found 0 ingredient rows. |
| Forms and numeric records | No barley-puff form, package-yield observation, or barley-related ledger unit conversion. The eight ledger unit conversions are unrelated. One existing package-yield record is for canned black beans. The nearby barley references have null density and empty unit mappings. |
| Substitution rules | The package's global and contextual substitution-rule arrays are empty; no puffed-barley rule or contextual finding exists. |

The exact candidate keys do not collide, but broad queries for `barley` or `orge` may surface multiple barley products. The full qualified display should remain distinct; this audit did not run a live picker-rank test. The zero recipe count means no recipe line, measure, or link should be inferred from the external cereal, muesli, dessert, or garnish uses.

## Forms, quantities, conversions, yields, and substitutions

- **Forms:** add no `IngredientForm`. Puffed barley is a named processed grain product, not a dry/cooked state form of hulled barley, pearl barley, barley flakes, or flour. The manufacturer describes a ready-to-use food ingredient, not a cooking state.
- **Measures and density:** add no serving mass, household volume, density, or unit mapping. Probios reports a 125 g package and nutrition values per 100 g for its own SKU; neither supplies a household-volume relation. The package size is not a recipe measure.
- **Conversions and yields:** add no raw-to-puffed factor, puffing yield, cooking yield, mass/volume conversion, or package yield. The manufacturers describe product characteristics and processes, not a transferable input/output ratio.
- **Substitutions:** add no global or contextual rule. Shared topping, muesli, or cereal-bar use does not establish a replacement quantity or equivalence with puffed wheat, rice, quinoa, millet, amaranth, sorghum, buckwheat, or spelt.
- **Recipe links:** add none. The bundled corpus contains no barley or puffed-barley ingredient row.
- **Data not researched:** do not infer a standard cultivar/species, dehulling sequence, nutrient defaults, moisture, shelf life, or a general serving from supplier-specific listings.

## Proposal-local source register

Sources were accessed or their indexed source page was reviewed on 2026-10-11. IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PBARLEY-20261011-S01` | SchapfenMühle, manufacturer, [Puffed barley](https://schapfenmuehle.de/en/commercial-customers/products/puffed-cereals/puffed-barley). | Current human-food ingredient page: barley kernels are expanded with pressure and steam, and each grain retains its original shape; muesli is a listed use. It is one supplier's process, not a universal method or hull specification. |
| `WP03-PBARLEY-20261011-S02` | Probios, manufacturer, [Orzo soffiato](https://shop.probios.it/prodotti/cereali-colazne/cereali-soffiati/orzo-soffiato-italiano.html), product FIOOS0012. | Current page names a plain puffed-barley product, lists `orzo soffiato` as the ingredient, gives a 125 g package, and reports product-specific nutrition per 100 g. It is an Italian product page, not Canadian terminology or a household measure. |
| `WP03-PBARLEY-20261011-S03` | Naturitas Canada, retailer, [Puffed barley, Probios, 125 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/mueslis-and-breakfast-cereals/puffed-barley-125-g-probios). | Current Canada storefront lists the same Probios product as in stock and identifies puffed barley as its ingredient. The listing says it cannot confirm delivery timing; it supports a Canadian-market listing, not Québec stock or delivery. Its 125 g is package quantity only. |
| `WP03-PBARLEY-20261011-S04` | Office québécois de la langue française, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), updated 2019. | Québec terminology authority pairs `orge` with English `barley`, places it in food/cereal terminology, and confirms feminine gender for plant and grain. It does not standardize `orge soufflée` as a product compound. |
| `WP03-PBARLEY-20261011-S05` | Chez Rioux & Pettigrew, Québec City, [Offres événementielles 2026–2027](https://chezriouxetpettigrew.com/wp-content/uploads/2026/04/FR_Blanche-Offres-evenementielles-2026-2027.pdf), spring/summer 2026 menu. | Current local restaurant menu text indexed `orge soufflée` as a brunch component and also uses `orge soufflé caramélisé` in another dish. Direct PDF retrieval exceeded the browser's content-size limit, so this is indexed menu-text evidence. It demonstrates Québec culinary wording, not a packaged-product label or standardized terminology. Only the exact feminine form is proposed, aligned with OQLF's base-noun gender. |
| `WP03-PBARLEY-20261011-S06` | Commission Regulation (EU) No 68/2013, as amended by [Regulation (EU) 2022/1104](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32022R1104), Annex, Part C, entry 1.1.2. | Official French feed-material catalogue uses `orge soufflée` for a feed product defined as milled or broken barley treated in warm, humid conditions under pressure. This is explicitly animal-feed scope and is not used to define the human-food kernel product; it warns against merging feed material with whole-grain food puff products. |
| `WP03-PBARLEY-20261011-S07` | Éditions Debeur, [47e Parallèle seasonal menu coverage](https://www.debeur.com/site/index.php?cntnt01articleid=1627&cntnt01category_id=3&cntnt01origid=58&cntnt01returnid=58&mact=News%2Ccntnt01%2Cdetail%2C0), 2019. | Québec restaurant coverage records `orge soufflée` as a ceviche component. This is older secondary coverage and is only corroborative local culinary usage, not a product label or current availability signal. |

## Review disposition

**Integrated `ingredient-ref-puffed-barley`** as identity-only `puffed barley / orge soufflée`, with no aliases. Current manufacturer evidence establishes a plain human-food puffed-barley product; a current Québec restaurant menu supplies the exact French phrase, and OQLF supports the base noun and its gender. The French term is recorded as local culinary wording rather than an OQLF-preferred compound or retail-label standard. It remains separate from barley flakes, hulled/pearl/pot barley, barley meals/flours, feed materials, and formulated or coated products. No forms, recipe links, density, measures, mappings, conversions, yields, or substitutions were added. Supplier-specific package, nutrition, cultivar, hull, and process details remain outside the general identity. The catalog and ledger integration, search QA, and historical verification are in the batch README.
