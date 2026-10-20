# WP03 Section F: corn bran identity review

## Review record

- **Reviewed:** 2026-10-13; sources checked on this date.
- **Status:** integrated 2026-10-13. The identity reference and research-ledger record were added; see the [integration batch](../batches/wp03-section-f-corn-bran-identity-integration-20261013/README.md).
- **Scope:** human-food corn bran sold or used as a grain-milling ingredient. The proposal does not cover prepared cereals containing corn bran, animal-feed ingredients, or isolated corn-fibre products.
- **Open checklist:** the live Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2201](../../RecipeBook-global-ingredient-catalog-plan.txt#L2294). Rice bran is integrated separately at [plan line 2245](../../RecipeBook-global-ingredient-catalog-plan.txt#L2338). Corn bran is now integrated as a distinct corn-milling-fraction identity; the broader checklist remains open.

## Recommendation

Accept one identity-only `GRAIN_AND_CEREAL` reference for the food ingredient **corn bran / son de maïs**. CFIA's Canadian labelling guidance names corn as a distinct bran source, Cargill offers a corn-bran ingredient for food manufacturers, and current French-Canadian cereal pages use **son de maïs** in product naming or ingredient text. These sources establish the ingredient identity and bilingual wording, but not a universal milling specification or household measure.

| Proposed field | Value | Evidence boundary |
|---|---|---|
| ID | `ingredient-ref-corn-bran` | No active owner of this ID was found. |
| English display | `corn bran` | Directly used by CFIA and Cargill. |
| Québec French display | `son de maïs` | Directly used in current French-Canadian food-product text; CFIA's French guide also requires naming a non-wheat cereal source. This is not an OQLF ruling. |
| Category | `GRAIN_AND_CEREAL` | A cereal milling fraction, grouped with the separate oat, rice, and wheat bran identities. |
| English and French aliases | None | Keep the picker terms to the attested display pair. Do not add brand, feed, fibre-claim, or speculative terminology. |
| Default density and unit mappings | `null`; `[]` | No transferable ingredient-level volume-to-mass evidence. |
| Forms, conversions, yields, recipe links, substitutions | None | The evidence and recipe audit do not justify these behaviors. |

## Open checklist and prior coverage

The plan's regional-cereal/preprocessed-grain checklist is still open after focused work on products such as Sankhal, arraw, thiakry, quick-cooking rice, sprouted brown rice, and rice bran. The integrated **rice bran / son de riz** row is a different grain fraction, and the active rice-bran-oil row remains a separate fat. The [bran-flakes cereal review](./wp03-section-f-bran-flakes-cereal-identity-review-20261012.md) covers a formulated breakfast cereal, not a plain corn milling fraction. None of these reviews decides the identity of corn bran.

The active corn references already distinguish kernels, cornmeal, corn flakes, corn poha, corn oil, corn syrup, corn tortillas, hominy corn, hominy grits, and several corn flours. Those products do not name the corn-bran fraction. A repository search of the plan, proposals, batches, reference catalog, forms, legacy identities, and ledger found no prior focused corn-bran review or exact term owner.

## Product identity and boundaries

CFIA's nutrient-claim guidance says that unqualified **bran** refers to wheat bran and discusses **milled corn bran** separately. Cargill describes corn bran as an ingredient for food manufacturers, including use in bakery products, snacks, and cereals. Together these sources support a distinct food-ingredient identity. They do not establish a universal bran composition, particle size, stabilization treatment, or home-cooking method.

| Product or term | Boundary for this proposal |
|---|---|
| Plain food-grade corn bran | The proposed milling-fraction ingredient, identified as `corn bran / son de maïs`. The proposal does not standardize its milling process, fibre percentage, or commercial treatment. |
| Rice, oat, and wheat bran | Keep each source separate. The live catalog already has `ingredient-ref-rice-bran`, `ingredient-ref-oat-bran`, and `ingredient-ref-wheat-bran`; an unqualified `bran` query remains broad. |
| Rice bran oil | Keep `ingredient-ref-rice-bran-oil` in `FAT_AND_OIL`. It is not a bran ingredient and is not an alias for corn bran. |
| Corn Pops, Quaker Corn Bran Squares, and other formulated cereals | Keep as prepared products. Their labels show corn bran as one component but do not define a universal cereal or corn-bran formula. The Quaker ready-to-eat cereal's portion data does not describe plain bran. |
| Corn flakes, cornmeal, hominy grits, hominy corn, and corn flour | Keep as separate products or processing classes. Their shared source grain does not make them bran or substitutes for it. |
| Isolated corn fibre or branded fibre ingredients | Do not merge or alias these to corn bran. Cargill's page markets a branded corn-bran ingredient product; it does not establish that every isolated corn-fibre product is the same food ingredient. |

## Québec and Canadian naming

CFIA's French grain-and-bakery guide says **son** without a source qualifier refers to wheat bran, and that the grain source must be named when it is another cereal. Its example is **son d'avoine**; it does not prescribe the exact term **son de maïs**. The current French WK Kellogg Canada page for *Céréales Corn Pops* lists **son de maïs** in the ingredient declaration and shows Québec as the selected region. PepsiCo Canada's French Quaker page also refers to **céréales Squares Son de maïs**. These are Canadian product-language attestations for the source-qualified French name; they do not make either finished cereal identical to plain bran.

The Canadian ingredient supplier and CFIA use **corn bran** in English. No alternate French alias is needed for the proposed row. The phrase **milled corn bran** appears in CFIA's nutrient-claim guidance, but the cited use is regulatory fibre-claim wording rather than a separate market display, so it is not proposed as a picker alias. Likewise, the MaizeWise brand name does not support `maize bran` as a generic alias.

## Exact ownership and package snapshot

The read-only live snapshot before integration on 2026-10-13 contains **1,331 ingredient references**, **98 ingredient forms**, **64 legacy candidates**, and **1,639 research-ledger records**. Exact-key checks used the repository's `normalize_search_key` function, which case-folds, folds accents and ligatures, and maps punctuation to spaces. Candidate phrases included `corn bran`, `corn brans`, `milled corn bran`, `maize bran`, `son de maïs`, and `son de mais`.

| Surface | Result |
|---|---|
| Active ingredient references | No exact normalized candidate name or alias, and no `ingredient-ref-corn-bran` ID. Nearby exact identities include wheat bran, oat bran, rice bran, bran-flakes cereal, and rice-bran oil; the corn-family products listed above remain separate. |
| Ingredient forms | No exact candidate label or match term. |
| Legacy candidates | No exact candidate ID, name, or alias. |
| Research ledger | No exact candidate ID or phrase, and no focused corn-bran decision. No source ID with prefix `WP03-CORN-BRAN-20261013` is allocated. |

## Picker projection

`IngredientReferenceSearchIndex` indexes reference names and aliases together with attached form labels and match terms. It returns complete normalized word-phrase matches first, then falls back to substring matching. The results below are a static projection of that implementation against the live catalog with the proposed display pair appended; they are not a runtime or emulator observation.

| Query | Projected result |
|---|---|
| `corn bran` | Proposed `ingredient-ref-corn-bran` only. |
| `son de maïs` | Proposed `ingredient-ref-corn-bran` only. Accent normalization also covers `son de mais`. |
| `milled corn bran` / `maize bran` | No result. Neither phrase is added as an alias; the CFIA regulatory wording and the MaizeWise brand do not establish a separate Canadian consumer search name. |
| `corn` | 15 results: the proposed row plus 14 existing corn-family references. This is intentionally broad. |
| `maïs` | 19 results: the proposed row plus 18 existing corn-family references. This is intentionally broad. |
| `bran` | Six results: bran-flakes cereal, oat bran, rice bran, rice-bran oil, wheat bran, and proposed corn bran. |
| `son` | Five results: bran-flakes cereal, oat bran, rice bran, wheat bran, and proposed corn bran. |
| `rice bran` / `rice bran oil` | `rice bran` returns the existing rice-bran and rice-bran-oil rows; `rice bran oil` returns only the oil row. Both remain unchanged. |

The exact source-qualified phrase **son de maïs** is uniquely selectable under the proposed names. Bare `son`, `bran`, `corn`, and `maïs` searches return multiple related products, as expected; the proposal does not broaden those terms with aliases.

## Recipe-corpus demand

The current seed manifest lists **114 recipe files** containing **1,123 ingredient rows**. Every manifest-listed JSON file and ingredient row was scanned using normalized phrase matching for `corn bran`, `corn brans`, `milled corn bran`, `maize bran`, `son de maïs`, `son de mais`, `bran de maïs`, `bran de mais`, `corn bran cereal`, `corn bran fiber`, and the proposed ID. Results: **0 matching recipe files and 0 matching ingredient rows**. No recipe link or recipe-text edit is supported.

## Measures, forms, and substitutions

CFIA's guidance says conventionally milled corn bran traditionally contains **60–65% dietary fibre** and uses **2 g of fibre from conventionally milled corn bran** as a condition for a fibre-source claim. These are nutrient-claim statements, not a serving amount, product composition guarantee, density, or conversion. Cargill describes only low-to-minimal inclusion rates and provides no transferable recipe quantity.

Health Canada's Canadian Nutrient File lists a separate ready-to-eat product, *Cereal, ready to eat, Corn Bran Squares, Quaker* (food code 1477), with **30 g** and volume equivalents of **100 mL = 15.2 g**, **125 mL = 19.0 g**, **175 mL = 26.6 g**, and **250 mL = 38.0 g**. This is a shaped, prepared cereal, not isolated corn bran; retain these values only as product-specific evidence and do not transfer them to the proposed ingredient. The CNF serving page reports a 2019 modification date; it was checked on 2026-10-13.

| Data area | Recommendation |
|---|---|
| Ingredient forms | Add none. The sources do not establish a recipe-relevant generic dry/cooked or stabilized/unstabilized form. |
| Measures and density | Keep no default measure or density. Do not apply the Quaker cereal portions or CFIA fibre percentages to plain corn bran. |
| Unit mappings, conversions, and yields | Keep empty. No reusable volume-to-mass, cooking, or package-yield evidence was found. |
| Recipe links | Add none; the full bundled corpus has no matching ingredient row. |
| Substitutions | Add no global or contextual rule. Ingredient-use examples and low-inclusion marketing do not establish an amount-qualified replacement for another ingredient. |

## Source register

All sources were accessed on 2026-10-13. These proposal-local source IDs were checked absent from the live ledger and existing proposal files before drafting.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-CORN-BRAN-20261013-S01` | Canadian Food Inspection Agency, [Specific nutrient content claim requirements](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrient-content/specific-requirements), “Fibre sources.” | Says unqualified bran refers to wheat bran; names milled corn bran separately, reports its traditional dietary-fibre range, and states a fibre-claim condition. Supports source distinction, not a serving, density, universal composition, or recipe conversion. |
| `WP03-CORN-BRAN-20261013-S02` | Agence canadienne d'inspection des aliments, [Exigences d'étiquetage et de composition pour les céréales et les produits de boulangerie](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie), « Son », lines 61–64. | Says unqualified **son** refers to wheat bran and names **son d'avoine** as an example of a different cereal source. Supports source qualification; does not specifically prescribe **son de maïs**. |
| `WP03-CORN-BRAN-20261013-S03` | Cargill, [MaizeWise Corn Bran](https://www.cargill.com/food-bev/na/maizewise-corn-bran), current North American ingredient page. | Describes a corn-bran insoluble-fibre ingredient for snacks, cereals, and bakery applications. Gives no household quantity or general formula and cautions that product approvals and usage levels depend on geography and end use. |
| `WP03-CORN-BRAN-20261013-S04` | WK Kellogg Co Canada, [Céréales Corn Pops®](https://www.wkkellogg.ca/fr/produits/cereales-corn-pops-product), French-Canadian product page. | Current page's ingredient list includes **son de maïs**; it lists Québec as the selected region and shows retail channels including Metro Québec. The cereal is a composite product, not a plain-bran specification or serving measure. |
| `WP03-CORN-BRAN-20261013-S05` | PepsiCo Canada, [Quaker® Céréales Squares au maïs](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-squares-au-mais), French-Canadian product page. | Uses the product wording **céréales Squares Son de maïs** and lists a 30 g product serving. Its accessible page text does not provide a plain-bran formulation; the serving applies only to the finished cereal. |
| `WP03-CORN-BRAN-20261013-S06` | Health Canada, [Taille de portion: Céréale, prête-à-manger, son de maïs carrées, Quaker](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1477&lang=fre), food code 1477. | Lists 30 g and the stated volume-to-mass portions for the ready-to-eat cereal. Page modification date is 2019-03-01. These product-specific values are not corn-bran ingredient measures. |

## Disposition

Integrated `ingredient-ref-corn-bran` as an identity-only **corn bran / son de maïs** reference in `GRAIN_AND_CEREAL`. Kept rice bran, rice-bran oil, wheat/oat bran, bran-flakes cereal, and other corn products separate. Added no aliases, forms, numeric behavior, recipe links, or active substitutions. The Section F regional-cereal checklist remains open.
