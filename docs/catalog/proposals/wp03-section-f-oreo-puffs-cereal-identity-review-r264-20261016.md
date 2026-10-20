# WP03 Section F — OREO PUFFS cereal identity review (R264, 2026-10-16)

## Review record

- **Status:** Integrated on 2026-10-16 as `ingredient-ref-oreo-puffs-cereal`; see the [integration README](../batches/wp03-section-f-oreo-puffs-cereal-integration-r264-20261016/README.md).
- **Scope:** One current Canadian Post Consumer Brands ready-to-eat cereal marketed as OREO PUFFS. This proposal addresses the cereal product only; it does not create a generic Oreo, cookie, chocolate, marshmallow, or puffed-grain identity.
- **Checklist context:** The active Section F checklist remains open for grain and cereal identity and terminology coverage ([global plan, line 528](../../RecipeBook-global-ingredient-catalog-plan.txt#L528)). The grain packet continues to mark regional cereal mixes and preprocessed grains as partial ([plant-grains-cereals.md, line 269](../batches/plant-grains-cereals.md#L269)). The recent R262 review concerns Post Cranberry Almond Crunch, a separate product; R251 concerns the Vector family. Neither allocates OREO PUFFS.
- **Archive audit:** Repository-wide searches of the plan, roadmap, active seed, proposal archive, and batch archive found no OREO PUFFS review, exact name owner, or allocated candidate. The Sona Masoori, Cranberry Almond Crunch, and Vector decisions cover different grain/cereal identities and do not imply a Post-wide catalog decision.
- **Recommendation:** **Add one identity-only `GRAIN_AND_CEREAL` reference** for `OREO PUFFS cereal / Céréales OREO PUFFS`.
- **Integrated ID:** `ingredient-ref-oreo-puffs-cereal`.
- **Integrated catalog effect:** Added the English/French display pair with empty aliases, no forms, `defaultDensity: null`, and `unitMappings: []`. Did not add `Post`, `Oreo`, `puffs`, `cookies and cream`, or ingredient-list terms as aliases.
- **Quantity and behavior limits:** The Canadian manufacturer and Québec retail listings show a 283 g package. This is package net mass only. The reviewed sources provide no household serving measure, density, conversion, yield, or tested substitution; add none.
- **Snapshot:** After integration the package contains 1,653 active references and 125 forms; the research ledger contains 2,001 records, and the manifest lists 114 recipes with 1,123 structured ingredient rows. The 61 legacy candidates remain unchanged.
- **Source IDs:** `WP03-OREO-PUFFS-R264-20261016-S01` through `S05` were proposal-local and are now registered on this ledger record.

## Identity and Québec wording

Post Consumer Brands Canada currently titles its English product page **OREO PUFFS™** and describes the item as cereal made from sweetened corn and oat cereal with marshmallows. The Canadian French page uses the same product title, **OREO PUFFS™**, and identifies the page and product as cereal; it also gives the 283 g package size. Its product details were updated on 2026-03-23 [WP03-OREO-PUFFS-R264-20261016-S01, WP03-OREO-PUFFS-R264-20261016-S02]. The French display adds the generic food class `Céréales` to the exact manufacturer brand/product name. This matches the manufacturer's French description and Québec retail wording; it is not an OQLF terminology ruling.

Metro Québec lists **Céréales biscuits et crème avec guimauves Oreo Puffs**, product number `628154458197`, at 283 g. Maxi's current French search listing uses **Post Oreo puffs céréales**, also at 283 g [WP03-OREO-PUFFS-R264-20261016-S04, WP03-OREO-PUFFS-R264-20261016-S05]. These retailer labels support a locally used cereal description and product identity. Their longer descriptive wording is not needed as an alias.

The finished product is a formulated, ready-to-eat cereal, not a pure puffed grain. The maker's ingredient declaration includes yellow corn flour, sugars, marshmallows, whole-grain oat flour, cocoa, wheat flour, degermed corn meal, and other ingredients. The formula is product-specific and may change; do not create links or aliases to its ingredients. Keep the row separate from plain puffed buckwheat, Khorasan wheat, millet, sorghum, and spelt, and from crispy rice cereal, marshmallow creme, and butter cookies.

## Proposed reference boundary

| Field | Proposed value | Limit |
|---|---|---|
| ID | `ingredient-ref-oreo-puffs-cereal` | Unallocated until integration. |
| English display | `OREO PUFFS cereal` | Preserves the manufacturer's exact Canadian product name and identifies the class. |
| fr-CA display | `Céréales OREO PUFFS` | Uses the manufacturer's Canadian French product wording with a generic class prefix. |
| Category | `GRAIN_AND_CEREAL` | Finished, dry, packaged breakfast cereal. |
| Aliases | None | Full English and French names provide the useful queries; avoid brand-only and ingredient-component aliases. |
| Forms | None | This row names the formulated cereal product as sold. |
| Density and unit mappings | Null and empty | A 283 g retail package is not a household-volume measurement. |
| Recipe links, conversions, yields, substitutions | None | No bundled recipe demand or transferable product behavior was found. |

Do not use `Oreo O's` as an alias. That is a distinct cereal name, including historical and non-Canadian product contexts, and the Canadian sources reviewed identify the current product as OREO PUFFS. Do not use `Oreo`, `Post`, `puffs`, `puffed cereal`, or `puffed grains` as aliases. The active puffed-grain rows cover separate plain grain products, and a short alias would broaden those queries without improving the product's specific English/French name search.

## Ownership and archive audit

A normalized exact-key audit covered all active reference IDs, English/French display names and aliases; all ingredient-form IDs, labels, and match terms; every legacy candidate; and every research-ledger record string. It found no exact owner for `OREO PUFFS`, `OREO PUFFS cereal`, `Céréales OREO PUFFS`, or `ingredient-ref-oreo-puffs-cereal`. No product form, recipe link, ingredient-reference allocation, or ledger identity currently owns the proposed product. The source IDs and URLs listed below were also checked absent from the research ledger.

| Current neighbor | Existing ownership | Boundary |
|---|---|---|
| `ingredient-ref-puffed-buckwheat`, `ingredient-ref-puffed-khorasan-wheat`, `ingredient-ref-puffed-millet`, `ingredient-ref-puffed-sorghum`, and `ingredient-ref-puffed-spelt` | Plain puffed-grain products | OREO PUFFS is a multi-ingredient cereal based on corn and oat flours; do not alias it to a single grain or treat it as a plain puffed kernel. |
| `ingredient-ref-corn-pops-cereal` | Named corn-based ready-to-eat cereal | Separate branded product and formulation. |
| `ingredient-ref-rice-cereal` | Crispy rice cereal | Distinct rice-based product identity. |
| `ingredient-ref-marshmallow-creme` and `ingredient-ref-butter-cookies` | Marshmallow spread and generic cookies | These do not own the cereal's finished-product name or formula. |

The Canadian manufacturer directory currently lists OREO PUFFS as one of its Canadian cereal brands, and the product page gives one 283 g size [WP03-OREO-PUFFS-R264-20261016-S01, WP03-OREO-PUFFS-R264-20261016-S03]. This supports the bounded current Canadian product row; it does not claim that all Oreo-related cereal products or markets are covered.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, and punctuation, prefers complete word-phrase matches, and uses substring matching only when no phrase match exists. The projection includes current form terms. It is not live Android picker QA.

| Query | Current results | With the proposed row | Interpretation |
|---|---:|---:|---|
| `OREO PUFFS cereal` | 0 | 1 | Full English product name. |
| `Céréales OREO PUFFS` | 0 | 1 | Full French display. |
| `OREO PUFFS` | 0 | 1 | Brand/product phrase without a generic suffix. |
| `oreo` | 0 | 1 | The candidate is the only current catalog match; no Oreo cookie ingredient row exists. |
| `puffs` | 5 | 6 | Adds this product alongside five plain puffed-grain identities; the results remain visibly distinct. |
| `puff` | 1 | 1 | The exact-phrase match for puff pastry takes priority, so this singular query does not fall through to the product's plural `Puffs` term. |
| `cereal` / `céréales` | 44 / 40 | 45 / 41 | After R262, these broad cereal-category counts increase by one. |
| `marshmallow` | 1 | 1 | Still resolves to marshmallow creme; the cereal's ingredient list is not copied into aliases. |
| `chocolate` | 11 | 11 | No chocolate alias is added from the product description or formula. |
| `cookies and cream` | 0 | 0 | The retailer's descriptive phrase is not a manufacturer product name or alias. |

No repeated `OREO PUFFS` alias is needed: both exact manufacturer displays are directly searchable. Keep `Post` out of the reference because it is the manufacturer name and would not identify this product family precisely.

## Bundled recipe-corpus demand

All 114 manifest-listed recipe files and their 1,123 structured ingredient rows were scanned for the proposed ID and product phrases, including `OREO PUFFS`, `OREO PUFFS cereal`, `Céréales OREO PUFFS`, `puffs cereal`, and `Post Oreo Puffs`. The audit found zero recipe-file hits and zero ingredient-row hits. No recipe link, relink, amount assignment, recipe edit, or substitution is supported.

## Unresolved follow-up

The Canadian manufacturer, Metro Québec, and Maxi Québec provide current English/French product identification. Independent human Québec-language approval for the display remains open under the broader Section F review. The row is integrated; recheck the package and current product page during future maintenance because the manufacturer warns that ingredient details can change. If a bundled recipe later names this product, link only that source-matched row and retain any package or serving statement as product-specific evidence; do not generalize a quantity mapping from the 283 g box.

## Source register

Sources were checked online on **2026-10-16**. The identifiers below were collision-checked while proposal-local and are now registered on the integrated ledger record.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-OREO-PUFFS-R264-20261016-S01` | Post Consumer Brands Canada, [OREO PUFFS Cereal](https://www.postconsumerbrands.ca/brand/oreo-puffs/oreo-puffs/). | Current Canadian English manufacturer product page. Names OREO PUFFS, lists 283 g, describes sweetened corn and oat cereal with marshmallows, and gives the current product ingredient declaration. The manufacturer says formulas may change and package information takes precedence. |
| `WP03-OREO-PUFFS-R264-20261016-S02` | Post Consumer Brands Canada, [Informations sur les céréales OREO PUFFS](https://www.postconsumerbrands.ca/fr-ca/marques/oreo-puffs/oreo-puffs/). | Current Canadian French product page; checked 2026-10-16 and page records a 2026-03-23 update. Supports `OREO PUFFS`, the French cereal description, 283 g package, and French product wording. This is manufacturer usage, not an OQLF ruling. |
| `WP03-OREO-PUFFS-R264-20261016-S03` | Post Consumer Brands Canada, [Canadian home and current brand directory](https://www.postconsumerbrands.ca/). | Current English manufacturer directory identifies OREO PUFFS among Canadian cereal brands and links the dedicated product page. Supports the current Canadian market scope, not every historical or international Oreo cereal. |
| `WP03-OREO-PUFFS-R264-20261016-S04` | Metro Québec, [Céréales biscuits et crème avec guimauves Oreo Puffs](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-biscuits-et-creme-avec-guimauves/p/628154458197). | Québec retailer listing names the 283 g item, product number `628154458197`, product description, and ingredient statement. The French route redirected to Metro's English detail page in the browser; no price, promotion, or stock claim is used. |
| `WP03-OREO-PUFFS-R264-20261016-S05` | Maxi Québec, [Céréales pour la famille product listings](https://www.maxi.ca/fr/clpplp/fr/alimentation/garde-manger/c-r-ales-et-petit-d-jeuner/c-r-ales-pour-la-famille/c/29894?page=1). | Current French category listing shows `Post Oreo puffs céréales`, 283 g. It supports a Québec retailer product title and package mass, not a reusable measure or ingredient-panel claim. |

## Disposition

**Integrated one identity-only `GRAIN_AND_CEREAL` row for `OREO PUFFS cereal / Céréales OREO PUFFS`.** Kept aliases, forms, density, unit mappings, recipe links, conversions, yields, and substitutions empty. Recorded 283 g only as package net mass. The Section F checklist, plan integration log, and roadmap now record this decision.
