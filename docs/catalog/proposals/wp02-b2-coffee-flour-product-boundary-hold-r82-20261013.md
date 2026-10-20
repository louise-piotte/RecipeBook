# WP02 B2 coffee-flour product boundary — R82 hold

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, forms, ledger, plan, roadmap, generated, or application files were changed.
- **Open checklist item:** Section 04, B2, line 1832: “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1832). Coffee flour is an additional alternative-flour gap within this still-open coverage; it is not one of the line's named products.
- **Candidate reviewed:** Unqualified `coffee flour` and the product scope it would claim.
- **Snapshot:** Post-R81 live data has 1,409 ingredient references, 104 forms, and 1,748 research-ledger records. The manifest-ordered bundled corpus has 114 recipes and 1,123 ingredient rows.
- **Archive and collision audit:** Exact searches for `coffee flour`, `coffee cherry flour`, `coffee bean flour`, `farine de café`, `farine de cerise de café`, `farine de pulpe de cerise de café`, the proposed R82 source-ID prefix, and candidate IDs found no focused flour proposal/batch, active reference/form, legacy-import identity, or flour-specific ledger record. The earlier WP05 coffee/tea batch covers coffee as a beverage and roasted/instant coffee, not flour. The R81 flour proposal covers grape-seed flour and does not overlap this candidate.

## Recommendation

**Hold the unqualified `coffee flour` reference and alias.** Do not add a reference, form, alias, recipe link, or candidate ledger record. The strongest warranted identity boundary is that coffee-cherry-derived flour and par-baked coffee-bean flour are distinct products; neither may be merged with brewed, instant, ground, or whole-bean coffee. The evidence reviewed does not settle one stable, Québec-ready product name and scope for a reusable `coffee flour` catalog key.

A Canadian retail page currently lists `Coffee Flour` as a food product made from coffee cherry and gives baking uses, but it is sold out and does not specify the exact fruit fraction or a Québec French package name. Separately, the maker of JavaPower Coffee Bean Flour says its product is made from coffee beans that are par-baked and milled. That is a different feedstock and process, not a form of the cherry-derived flour or roasted coffee. These records establish that coffee-derived flours exist; they do not establish that an unqualified catalog identity has one consistent product scope. [S01–S02]

Québec sources support the base terms `cerise de café` for the whole fruit and `grain de café` for the dried seed. A Canadian French article uses `farine de café` specifically for flour made by drying and grinding coffee-cherry pulp, but this is editorial wording rather than a Québec product label or manufacturer specification. A precise descriptive phrase such as `farine de pulpe de cerise de café` would be provisional and would still need a product source confirming that pulp-only scope. [S03–S06]

This is a hold on the **unqualified catalog key**, not a claim that coffee-cherry flour is not a real food product. Reopen for a separately scoped `coffee cherry flour` or `coffee bean flour` only when a current product specification or package establishes its source material and the bilingual display can be bounded. Do not alias either candidate to the existing coffee rows. [S01–S05]

## Identity and product boundaries

| Product or phrase | Decision | Evidence boundary |
|---|---|---|
| `coffee flour` | Hold as an unqualified display/alias. | A Canadian retailer uses this exact product title for a coffee-cherry-derived flour, but the page gives no exact fruit fraction or Québec French label and currently says the item is sold out. A separate bean-derived flour exists under the more specific name `coffee bean flour`. [S01–S02] |
| Coffee-cherry flour | Treat as a plausible distinct flour identity for future review, not as a form of coffee beans or coffee beverage. | The Canadian listing says its flour is made from coffee cherry; the Canadian French article describes flour made by drying and grinding cherry pulp. Neither confirms that both sources describe the same standardized product or specifies one common fruit fraction. [S01, S06] |
| Coffee-bean flour | Keep separate from cherry-derived flour and unreviewed as a catalog candidate in this proposal. | The manufacturer identifies its product as coffee-bean flour made from par-baked whole coffee beans. This evidence does not support renaming it `coffee flour`, nor mapping it to roasted or ground coffee. [S02] |
| Whole coffee fruit powders/extracts sold as CoffeeBerry® | Keep outside this flour review. | Health Canada's no-objection assessment concerns specified whole-fruit powders/granules and extract sold to food manufacturers under stated conditions. It does not identify the Canadian retail flour as the same preparation or approve an arbitrary coffee-flour use. [S07–S08] |
| `coffee`, `instant coffee`, `roasted coffee`, ground coffee, whole-bean coffee | Preserve current owners and forms. | These rows cover beverage/instant coffee and commercial presentations of roasted coffee. None names a coffee-derived flour. |
| `farine de café` | Do not add as a Québec display or alias in this review. | The phrase is used in a Canadian French explanatory article for coffee-cherry-pulp flour; no Québec package or manufacturer page reviewed confirms it as a standardized product label. [S06] |
| `farine de pulpe de cerise de café` | Do not activate yet. | It is a clear descriptive translation assembled from the Canadian French product description and OQLF terms, but it is not an attested Québec package name and the Canadian retailer does not specify pulp-only composition. [S01, S03, S06] |
| Coffee-cherry cascara, coffee-cherry tea, coffee, coffee extract, and supplements | Keep separate. | Beverage, extract, and supplement forms are not flour. The Health Canada whole-fruit assessment is specific to named CoffeeBerry® preparations and conditions. [S07–S08] |

## Québec French and Canadian product scope

The Office québécois de la langue française defines **cerise de café** as the whole coffee fruit, generally containing two seeds under pulp and skin; its coffee-industry entry defines a **grain de café** as the dried, shelled seed of that fruit. These Québec terms confirm the fruit/seed boundary, not a flour name or milling specification. [S03–S04]

Deuxième Récolte (Second Harvest) uses the Canadian French phrase **farine de café** and describes it as dried and ground coffee-cherry pulp. This is useful language evidence for a food use in French, but it is not a Québec product label, does not name a manufacturer SKU, and does not establish that the product is the same as the currently sold-out Canadian `Coffee Flour` listing. No Québec French product name was verified. [S01, S06]

Health Canada's CoffeeBerry® page describes specific whole-fruit powders/granules and extract, including the seeds, and its French page gives the corresponding Canadian French description. That source is relevant to separating product scope, not to accepting a flour display, safety claim, recipe instruction, or ingredient composition for the retail coffee flour. [S07–S08]

## Current ownership and picker boundary

The read-only audit covered live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), the [research ledger](../research-ledger.v1.json), [legacy import identities](../legacy-import-identities.v1.json), the full bundled recipe corpus, and the WP02 proposal/batch archive.

| Current owner | Stored names and aliases | Scope |
|---|---|---|
| `ingredient-ref-coffee` | `coffee / café`; English aliases `regular coffee`, `strong coffee`; French alias `café fort` | Existing coffee ingredient used for brewed coffee in the recipe corpus; category `OTHER`, no forms. |
| `ingredient-ref-instant-coffee` | `instant coffee / café soluble`; English alias `soluble coffee`; French alias `café instantané` | Instant coffee; category `OTHER`, no forms. |
| `ingredient-ref-roasted-coffee` | `roasted coffee / café torréfié` | Roasted coffee; category `OTHER`. Owns forms `ground coffee / café moulu` and `whole-bean coffee / café en grains`. |

No exact flour name, alias, dedicated ID, form, legacy identity, or flour-specific ledger candidate is currently owned. The IDs `ingredient-ref-coffee-cherry-flour` and `ingredient-ref-coffee-bean-flour` are not reserved; this hold creates neither.

The projection below follows current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, returns complete contiguous phrase matches first, and uses partial matching only when no phrase result exists. These are static projections from the current live catalog, not UI test results.

| Query | Current result | With this hold | Picker boundary |
|---|---|---|---|
| `coffee` | `ingredient-ref-coffee`, `ingredient-ref-instant-coffee`, `ingredient-ref-roasted-coffee` | Same three rows | Broad coffee-family query remains broad and unchanged. |
| `café` | The same three rows | Same three rows | Accent-folded broad French query remains unchanged. |
| `coffee flour` | No result | No result | Do not select a cherry-derived product until a bounded identity is approved. |
| `coffee cherry flour` | No result | No result | A future exact phrase would require its own source-bounded row. |
| `coffee bean flour` | No result | No result | Do not route this to roasted/ground coffee or to a cherry-flour row. |
| `farine de café` | No result | No result | Keep the Canadian French editorial phrase documentary until Québec product scope is resolved. |
| `farine de pulpe de cerise de café` | No result | No result | Keep the descriptive provisional translation inactive. |
| `cerise de café` / `grain de café` | No result | No result | OQLF terminology does not by itself create an ingredient-reference result. |

If a future review accepts a cherry-specific row, its exact display and aliases must be evaluated separately. In particular, a display that contains `coffee` or `café` will appear in those broad family queries under the phrase-first matcher; this broadening is expected but does not make cherry flour equivalent to beans or beverage coffee. A future bean-flour row must remain distinct, and `coffee flour`/`farine de café` must not be assigned to it without direct source evidence.

## Bundled recipe demand

The manifest lists 114 bundled recipes with 1,123 ingredient rows. A full scan of each recipe JSON and ingredient row for `coffee flour`, `coffee cherry flour`, `coffee bean flour`, `farine de café`, `farine de cerise de café`, and `farine de pulpe de cerise de café` found zero candidate mentions or ingredient-line hits.

The corpus has three coffee-related ingredient lines, none for flour: `050#14` uses hot coffee and links to `ingredient-ref-coffee`; `034#10` uses strong coffee and links to that same row; `114#13` is the combined “hot water or hot coffee” line and has no ingredient-reference link. This demand does not support a flour row, recipe relink, or substitution. It is a statement about this 114-recipe corpus only.

## Forms, numeric evidence, and substitution limits

- **Forms:** Add none. The evidence does not establish reusable forms such as whole-fruit, pulp-only, husk, defatted, roasted, or par-baked flour. The separate manufacturer product is not a form of existing roasted coffee.
- **Package mass:** The Canadian retailer lists a 2 lb / 908 g package for its `Coffee Flour`. This is one listed package size, not a portion, unit mapping, or density. The page currently marks it sold out. [S01]
- **Retailer use claim:** The same listing says its product may replace up to 10% of flour in recipes. The basis and exact product specification are not sufficiently detailed for a reusable conversion or substitution rule; keep it source-specific. [S01]
- **Bean-flour use claim:** The JavaPower licensee describes a 5%–10% dry-weight use for its par-baked coffee-bean flour. This applies to its separate product, not coffee-cherry flour or wheat flour generally. [S02, S05]
- **Health Canada quantity:** The 300 mg per serving condition applies to specified CoffeeBerry® whole-fruit powders/granules or extract sold to food manufacturers. It is not a retail flour measure, permitted-recipe dose for the Buy Coffee Canada product, or generic flour conversion. [S07–S08]
- **Density, conversion, and yield:** No reviewed source gives a reusable g/mL density, grams-per-cup measure, milling yield, or cooked yield for a bounded coffee-flour product. Add none.
- **Substitution:** Do not create a coffee-flour-to-wheat-flour, coffee-bean-flour-to-coffee-cherry-flour, or other ingredient substitution. The two published replacement percentages apply to different named products and are not a shared rule. [S01–S02]

## Exact proposed JSON delta

**None.** This is a hold: add no ingredient-reference JSON row, form, alias, unit mapping, density, recipe link, yield, substitution, or ledger record. Do not reserve `ingredient-ref-coffee-cherry-flour` or `ingredient-ref-coffee-bean-flour`. Keep the Section 04 B2 checklist line open. Reopen after a current package or manufacturer specification establishes the flour's fruit/seed source and a Québec-ready bilingual product name.

## Source register

All web sources were checked on 2026-10-13. Source IDs are local to this proposal; none were written to the shared ledger.

| ID | Source and support | Limits |
|---|---|---|
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S01** | Buy Coffee Canada, [Coffee Flour](https://buycoffeecanada.com/products/coffee-flour). Canadian storefront, product title and description; lists 2 lb / 908 g, says it is made from coffee cherry, and describes baking uses and a “up to 10%” flour-replacement suggestion. | Retail listing, not manufacturer specification or Québec product label. It currently says sold out. Does not identify the exact coffee-fruit fraction or a reproducible recipe basis. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S02** | Greenwood Innovation / JavaPower, [Coffee Bean Flour](https://www.coffeebeanflour.com/). Manufacturer/licensee product page. Says the food ingredient is made from coffee beans that are par-baked and milled. | Establishes a separate bean-derived product and process for this maker; not evidence that bean flour equals cherry flour or roasted coffee. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S03** | Greenwood Innovation / JavaPower, [Applications for Coffee Bean Flour](https://www.coffeebeanflour.com/applicationscoffeebeanflour). Gives product-specific 5%–10% dry-weight formulation guidance. | Applies to this par-baked coffee-bean product only; not transferred to coffee-cherry flour or encoded as a general substitution. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S04** | Office québécois de la langue française, [cerise de café (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353854/cerise-de-cafe). Defines the whole coffee fruit and gives English `coffee cherry` and `coffee berry`. | Québec terminology for the fruit, not for flour or a processing product. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S05** | Office québécois de la langue française, [grain de café (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353856/grain-de-cafe). Defines the dried, shelled coffee seed and gives English `coffee bean`. | Québec terminology for the seed, not for bean flour or its preparation. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S06** | Deuxième Récolte (Second Harvest), [La puissance de la farine](https://www.secondharvest.ca/fr-ca/post/flour-power), section “Farine de café”. Uses the French phrase `farine de café` for flour made by drying and grinding coffee-cherry pulp. | Canadian French editorial article, not a Québec package label, product specification, or proof of equivalence to the listed retail product. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S07** | Health Canada, [Novel Food Information — CoffeeBerry® Whole Coffee Fruit Derivatives](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/approved-products/novel-food-information-coffeeberry-whole-coffee-fruit-derivatives.html). Describes named whole-fruit powders/granules and extract, their food-manufacturer use, and the maximum intended level of 300 mg per serving. | Applies to specified CoffeeBerry® whole-fruit derivatives under the stated conditions, not to an arbitrary retail coffee flour or the two products above. |
| **WP02-B2-COFFEE-FLOUR-R82-20261013-S08** | Santé Canada, [Renseignements sur les aliments nouveaux — produits CoffeeBerry dérivés du fruit entier du café](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/renseignements-aliments-nouveaux-produits-coffeeberry-derives-fruit-entier-cafe.html). French counterpart for the same product family and conditions. | Same scope limit as S07; it is not a flour naming ruling or retail flour approval. |

## Static review record

- Re-read the current `AGENTS.md`, Section 04 B2 checklist line, live reference/form files, ledger, legacy identities, WP02 proposal/batch archive, and the current phrase-first search implementation.
- Verified the post-R81 counts: 1,409 references, 104 forms, 1,748 ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows.
- Searched candidate terms, French phrases, proposed IDs, and the R82 source-ID prefix across the active catalog, forms, legacy identities, ledger, proposals, batches, and bundled recipe corpus; found no prior focused flour owner or decision.
- Projected the current picker results for the broad coffee terms and all candidate exact phrases from the live bilingual names, aliases, and forms. Confirmed the hold leaves current query results unchanged.
- Rechecked current Canadian retail, product-maker, OQLF, Canadian French, and Health Canada sources on 2026-10-13. Kept product-specific weights, use percentages, and Health Canada conditions out of reusable numeric fields.
- Static checks only: UTF-8 without BOM, final newline, no trailing whitespace, source IDs match the source register, linked local audit files exist, and source URLs are recorded as direct pages. No app tests or emulator were run. No shared file was changed by this proposal review.
