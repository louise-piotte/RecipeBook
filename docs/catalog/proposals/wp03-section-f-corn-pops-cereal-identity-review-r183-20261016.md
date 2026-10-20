# WP03 Section F: Corn Pops cereal identity review (R183)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Root integration confirmed. An identity-only reference and source-backed ledger record were added; no forms, active measures, conversions, yields, recipe links, or substitutions were added.
- **Open checklist:** Section F retains its open regional cereal and preprocessed-grain review in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt), with the broader Section F cereal/preprocessed-grain sweep still open.
- **Candidate:** the current Canadian ready-to-eat product **Corn Pops Cereal / Céréales Corn Pops**.
- **Recommendation:** Add identity-only `GRAIN_AND_CEREAL` reference `ingredient-ref-corn-pops-cereal` with these bilingual product displays. Keep aliases empty and add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions.

## Product identity and French naming

WK Kellogg Co Canada has current English and Canadian French product pages for **Corn Pops Cereal / Céréales Corn Pops**. The French SKU page uses the exact product title **Céréales Corn Pops**, names the ingredient `son de maïs`, and lists Québec as the selected region with Metro Québec among its retailer routes [S01–S03]. A current Provigo Québec catalog listing gives the retail title `Kellogg’s Corn Pops Céréales Corn Pops, format familial`, and the product-specific Provigo page lists the 515 g family package and item number `20054727_EA` [S04–S05]. Use the manufacturer's concise bilingual product titles as displays. The retailer's longer title is market evidence, not an alias.

WK Kellogg's English and French Corn Pops brand pages each list one cereal product, with the manufacturer's English SKU page available in 300 g, 515 g, and 730 g package options [S02–S03]. Those are package variants of the same named product, not separate ingredients. The product is a finished, formed ready-to-eat cereal. Its ingredient list includes cornmeal, sugars, corn bran, salt, whole-grain oat flour, and additives/vitamins. It is not plain corn flakes, corn bran, or cornmeal, and the ingredient list is not a quantified formula.

The research ledger already cites the French Corn Pops SKU page as `WP03-CORN-BRAN-20261013-S04`. Its existing Corn Bran record uses the page only as evidence that the composite cereal's label says `son de maïs`. The related proposal likewise names Corn Pops only as a finished product containing corn bran. Neither record assigns a Corn Pops identity, creates a picker term, or reviews the cereal product itself; reuse the existing French source citation rather than duplicating its URL or source ID [S01].

| Neighbor | Existing owner | Boundary |
|---|---|---|
| `corn flakes / flocons de maïs` | `ingredient-ref-corn-flakes` | A product made as toasted corn flakes; Corn Pops is a differently formed and sweetened finished cereal. Do not alias them. |
| `corn bran / son de maïs` | `ingredient-ref-corn-bran` | A cereal-bran ingredient. It is one component in the Corn Pops label, not the complete cereal identity. |
| Cornmeal / maize meal, whole-grain oat flour, and sugar references | Existing ingredient references | These label components are not aliases, mappings, or quantified formula parts for the complete product. |
| Crispy rice cereal and other ready-to-eat cereals | Existing cereal references | Keep their grain bases and product formulations distinct. |

## Ownership and source-collision audit

The working-tree snapshot contains **1,559 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,904 research-ledger records**, with **8,168 source entries**, **6,979 distinct source IDs**, and **5,775 distinct source URLs**.

Exact ownership searches across active reference displays and aliases, form labels and match terms, legacy-import names and aliases, ledger records, the plan, all proposal and batch files, and the bundled recipe corpus found no active row, legacy candidate, or focused Corn Pops identity review/hold for the proposed ID, `Corn Pops Cereal`, or `Céréales Corn Pops`. Search hits in the Corn Bran proposal and ledger are the contextual component evidence described above, not an existing cereal owner. `ingredient-ref-corn-flakes` and `ingredient-ref-corn-bran` are separate neighboring ingredient identities.

The proposed source IDs `WP03-CORN-POPS-R183-20261016-S01` and `S03` through `S05`, and their English SKU, English brand-page, Provigo product, and Provigo category URLs, were checked absent from the ledger and proposal archive. Reuse the already-registered French SKU source ID `WP03-CORN-BRAN-20261013-S04` for the French manufacturer product page; do not create a second source record for that same URL.

## Picker projection

The current picker normalizes accents and punctuation, prefers complete word-phrase matches across names and aliases, and falls back to substring matching only if no phrase matches. A static projection from the current catalog gives:

| Query | Current results | With proposed bilingual display |
|---|---:|---:|
| `Corn Pops` / `Corn Pops Cereal` | 0 / 0 | 1 proposed row / 1 proposed row |
| `céréales Corn Pops` | 0 | 1 proposed row |
| `corn flakes` | 1, `ingredient-ref-corn-flakes` | 1; the exact Corn Flakes query stays with its existing owner |
| `corn` | 32 | 33, adding the whole Corn Pops product to the broad corn result set |
| `cereal` / `céréales` | 20 / 17 | 21 / 18 |
| `pops` | 0 | 1 proposed row |

The exact product-name queries return the full cereal choice. The broad `corn` result adds a finished cereal beside corn grain and processed-corn ingredients, which is a reasonable search result as long as the identity remains product-qualified. Empty aliases prevent unqualified `corn cereal`, `corn flakes`, or `corn bran` from being mapped to Corn Pops.

## Recipe-corpus demand

The complete manifest corpus contains **114 recipe files and 1,123 ingredient rows**. Full recipe files and ingredient rows were searched for `Corn Pops`, `Corn Pops Cereal`, `Céréales Corn Pops`, and retailer number `20054727_EA`. The scan found **0 matching files and 0 matching ingredient rows**. No recipe link or recipe edit is supported.

## Numeric, preparation, and substitution boundaries

- **Nutrition serving:** The Provigo panel for its 515 g item lists **1 cup (32 g)** [S04]. Treat this only as a product-page serving observation if later recorded in the ledger. It does not establish a generic cup measure, cereal density, or volume-to-mass mapping.
- **Package sizes:** The manufacturer lists 300 g, 515 g, and 730 g packages; Provigo's 515 g item number `20054727_EA` is a seller/package identifier [S02, S04–S05]. These values are package amounts, not recipe portions or yields.
- **Composition:** The label lists cornmeal, corn bran, sugars, oat flour, and other ingredients without proportions. Do not create component links or a Corn Pops formula from the declaration.
- **Forms and preparation:** The product is ready to eat; the reviewed pages provide no reusable preparation conversion or cooking yield. Add no forms or yields.
- **Substitution:** No reviewed source establishes a tested, quantity-qualified replacement between Corn Pops, corn flakes, crispy rice cereal, or any other cereal. Add no global or contextual substitution.

## Source register

Sources accessed 2026-10-16, unless noted as previously registered evidence. Proposal-local IDs are not ledger additions.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-CORN-POPS-R183-20261016-S01` | WK Kellogg Co Canada, [Corn Pops Cereal](https://www.wkkellogg.ca/en/products/corn-pops-cereal-product), product title, description, ingredient declaration, sizes and retailer list. | Current Canadian manufacturer SKU page. Supports the English name, cornmeal/corn-bran/oat-flour ingredients, and 300 g, 515 g, and 730 g pack variants. It refers full nutrition information to SmartLabel; no general measure or formula is inferred. |
| Reused `WP03-CORN-BRAN-20261013-S04` | WK Kellogg Co Canada, [Céréales Corn Pops](https://www.wkkellogg.ca/fr/produits/cereales-corn-pops-product), French product title, ingredient declaration and Québec product selector; source originally accessed 2026-10-13 and reopened for this review. | Current Canada-French SKU page supports the exact French title and label term `son de maïs`; it shows Québec retailers including Metro Québec. In the existing Corn Bran ledger record it supports component wording only. No duplicate source record is proposed. |
| `WP03-CORN-POPS-R183-20261016-S03` | WK Kellogg Co Canada, [Corn Pops English brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/corn-pops), product list. | Lists Corn Pops Cereal as the brand's product. Supports a single current cereal listing, not a universal product formula. |
| `WP03-CORN-POPS-R183-20261016-S04` | Provigo, [Kelloggs Corn Pops Cereal, Family Size, 515 g](https://www.provigo.ca/en/corn-pops-cereal-family-size/p/20054727_EA), product number, nutrition panel, ingredients and package size. | Current Provigo product page identifies item `20054727_EA`, reports a 1 cup (32 g) panel serving, lists label ingredients, and says the product is prepared in Canada. Retailer nutrient data is approximate and item-specific; it is not a reusable measure. |
| `WP03-CORN-POPS-R183-20261016-S05` | Provigo Québec, [Céréales pour enfants](https://www.provigo.ca/fr/alimentation/garde-manger/c-r-ales-et-petit-d-jeuner/c-r-ales-pour-enfants/c/29892), current product listing. | Lists Kellogg’s Corn Pops Céréales Corn Pops in the 515 g family size and 300 g packages. Supports current Québec retail naming/availability and pack context, not recipe measure or formulation. |

## Recommendation

**Add identity-only `ingredient-ref-corn-pops-cereal` as `Corn Pops Cereal / Céréales Corn Pops`.** Current Canadian manufacturer pages identify one bilingual cereal product, and a Québec-facing retailer lists it in current 300 g and 515 g packages. Keep it distinct from corn flakes, corn bran, cornmeal, and other finished cereals. Keep aliases empty and add no forms, reusable measurements, density, mappings, conversions, yields, recipe links, or substitutions. The Section F sweep remains open.

## Root integration decision

**Addition confirmed.** Added `ingredient-ref-corn-pops-cereal` with the manufacturer-backed bilingual titles, empty aliases, and no forms or active conversion behavior. The Provigo 1 cup (32 g) panel basis is recorded only as a SKU-specific portion observation. The French manufacturer page reuses its existing source ID from the Corn Bran evidence; its Corn Pops identity and product-page scope are now also recorded on the new ledger row. No bundled recipe demand was found.
