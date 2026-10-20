# WP05 Section V — Acidic juice and preparation boundaries

- **Date:** 2026-10-12
- **Status:** proposal only; Section V remains open
- **Scope:** lemon/lime juice labels and fresh/bottled boundary; verjus and sour-grape naming; tamarind paste versus tamarind fruit and water; existing pomegranate-molasses identity.
- **Source namespace:** `WP05-ACID-JUICE-20261012-S01` through `S09`; checked against the current ledger and proposal/batch files, with no source-ID collision.

## Recommendation

Advance a small identity-and-alias tranche:

1. Keep the existing `ingredient-ref-lemon-juice` and `ingredient-ref-lime-juice` identities. Add exact English aliases `fresh lemon juice` and `fresh lime juice`; add French `jus de lime frais` to the lime reference. The lemon reference already has French `jus de citron frais`. Keep `fresh` as a recipe-line preparation state where recorded.
2. Add a separate identity candidate `ingredient-ref-verjuice`, displayed as `verjus / verjuice`, with the English alias `sour grape juice`. OQLF defines verjus as acidic juice from grapes picked before maturity and pairs it with English `verjuice`; current producer and retail sources also use “sour grape juice” for this product [S02–S04]. This is a juice identity, not vinegar.
3. Add a separate identity candidate `ingredient-ref-tamarind-paste`, displayed as `pâte de tamarin / tamarind paste`, with no aliases. OQLF records this exact bilingual term for treated fruit, and Canadian product/ingredient listings attest it as a distinct paste product [S06–S08]. Keep the active `ingredient-ref-tamarind` for the fruit.
4. Retain `ingredient-ref-pomegranate-molasses` unchanged as `mélasse de grenade / pomegranate molasses`, with no aliases. Keep Narsharab unresolved and separate pending the existing boundary decision.

Do not add a generic bottled-juice alias, a tamarind-water identity or alias, or a broad `green grape juice`/`sour grape` alias. No forms, measurements, preservation guidance, conversions, or substitutions are proposed. These are name and identity recommendations only.

## Identity and alias recommendations

| Action | Proposed reference | French / English | Alias recommendation | Boundary |
|---|---|---|---|---|
| Reuse | `ingredient-ref-lemon-juice` | `jus de citron` / `lemon juice` | Add EN `fresh lemon juice`; retain existing FR `jus de citron frais`. | “Fresh” is present on two linked recipe lines and is recorded as line preparation. Do not imply that a bottled product has the same composition. |
| Reuse | `ingredient-ref-lime-juice` | `jus de lime` / `lime juice` | Add FR `jus de lime frais` and EN `fresh lime juice`; retain FR `jus de citron vert`. | The manufacturer’s Québec French page uses `jus de lime` and `jus de lime frais`. Keep citrus juice separate from vinegar. |
| New identity candidate | `ingredient-ref-verjuice` | `verjus` / `verjuice` | Add EN `sour grape juice`; no FR alias. | Limit the candidate to acidic juice from unripe grapes. Do not add generic `grape juice`, `green grape juice`, `sour grapes`, grape molasses, or unrelated sour-fruit preparations. Category suggestion: `SAUCE_AND_CONDIMENT`, consistent with the existing lemon/lime juice references. |
| New identity candidate | `ingredient-ref-tamarind-paste` | `pâte de tamarin` / `tamarind paste` | None. | Keep distinct from the active tamarind fruit reference and from tamarind water, tamarind juice, block tamarind, extract, or concentrate. Suggested category: `FRUIT`, following the OQLF treated-fruit domain and the active tamarind reference. |
| Retain | `ingredient-ref-pomegranate-molasses` | `mélasse de grenade` / `pomegranate molasses` | None. | Do not add `narsharab`, `pomegranate syrup`, pomegranate juice/concentrate, grape molasses, or sour-grape wording as aliases. |

The proposed verjuice and tamarind-paste IDs are absent from current references, forms, legacy IDs, and ledger `recordId` values. The alias strings above do not have another exact canonical owner in the current reference/form data. No recipe relinking follows from this audit.

## Product boundaries

### Lemon and lime juice: fresh versus bottled

The active juice references already cover the plain culinary names; no second generic lemon-juice or lime-juice identity is supported. Three linked recipe rows explicitly record fresh preparation: two lemon-juice rows and one lime-juice row. The ReaLemon/ReaLime Canadian French product page labels the products `jus de citron` and `jus de lime`, separately calls out fresh juice, and lists water, concentrated juice, sulphites, and peel oil for the branded bottled products [S05]. This supports the exact language recommendations while showing why a single brand page should not establish a general bottled-juice alias.

Do not add `bottled lemon juice`, `bottled lime juice`, `ReaLemon`, `ReaLime`, `lemon juice concentrate`, or `lime juice concentrate` as aliases on the plain juice references. A specific bottle, a concentrate, and a pressed fresh juice can have different product descriptions; the current sources do not establish one shared bottled form. Keep the recipe line’s `fresh` preparation metadata where it exists.

### Verjus, sour-grape products, and vinegar

OQLF’s preferred French term is `verjus`, with English `verjuice`; its definition is acidic juice from unripe grapes [S02]. A Québec retailer’s current product page lists `Verjus` and green-grape juice as its ingredient [S03]. A manufacturer explicitly titles another product `Sour Grape Juice | Verjuice`, and a Toronto retailer lists `Kambiz Verjuice` as `Natural Sour Grape Juice` [S04]. These independent naming contexts support `sour grape juice` as a narrowly scoped English alias for the verjuice candidate. They do not support a generic `green grape juice` alias: green can describe grape colour rather than maturity.

The Canadian Food and Drug Regulations define vinegar as liquid obtained by acetous fermentation of an alcoholic liquid [S01]. Verjus is unfermented acidic fruit juice under the reviewed terminology/product evidence, so it remains distinct from the integrated vinegar references. The OQLF note that verjus can be used in some of the same dishes is not catalog equivalence or substitution evidence.

Keep other sour-grape preparations unresolved unless the product is explicitly identified as verjus/verjuice or sour-grape juice from unripe grapes. Do not generalize to sweet grape juice, grape molasses, a sour-grape concentrate, salted regional preparations, or vinegar.

### Cooking wines

The current references include white wine, mirin, and separately named red- and white-wine vinegars; there is no generic cooking-wine reference or recipe line. Preserve the earlier WP05 boundary: salted or sweetened cooking-wine products are not aliases of drinking wine or vinegar. No cooking-wine identity is proposed in this acidic-juice tranche.

### Tamarind fruit, paste, and water

The live catalog has `ingredient-ref-tamarind` (`tamarin / tamarind`, category `FRUIT`) and no tamarind form. The OQLF term record pairs `pâte de tamarin` with `tamarind paste` in its treated-fruit domain [S06]. A Canadian supplier lists a seedless Thai tamarind paste product and describes the product as tamarind pulp; Farm Boy’s bilingual Canadian ingredient list uses `Tamarind Paste / Pâte de Tamarin` [S07–S08]. Together these sources support one narrowly named paste identity, without implying a universal texture, recipe, concentration, or conversion from the whole fruit.

No reviewed source settles a single culinary identity for `tamarind water` / `eau de tamarin`. Keep that phrase unassigned and distinct from tamarind paste, tamarind juice, and the whole fruit. The older WP05 and WP06 holds on broad tamarind preparations remain in place outside this exact paste term; this proposal does not reopen broad tamarind/calamansi preparations.

### Pomegranate molasses and Narsharab

The live `ingredient-ref-pomegranate-molasses` already has the bilingual names and no aliases. The current Québec maker’s French and English product pages use `mélasse de grenade` and `pomegranate molasses` for the same named product [S09]. Preserve the existing reference and aliases as-is.

The prior WP05 MENA review accepted pomegranate molasses as its own condiment identity, while the separate Narsharab review left Narsharab unresolved against it because regional-standard and retail-product scopes overlap without establishing a universal synonym. Keep that decision: no Narsharab alias or new Narsharab reference is recommended here. Pomegranate juice/concentrate remains distinct from the finished molasses product.

## Live repository and recipe audit

The current bundled package has **1,121 ingredient references**, **79 forms**, **114 recipes**, and **1,123 ingredient rows**. The legacy file has **71 candidates**; the research ledger has **1,418 records**. This snapshot is after the 2026-10-12 vinegar integration.

Relevant live references:

- `ingredient-ref-lemon-juice` — `jus de citron / lemon juice`; FR alias `jus de citron frais`.
- `ingredient-ref-lime-juice` — `jus de lime / lime juice`; FR alias `jus de citron vert`.
- `ingredient-ref-tamarind` — `tamarin / tamarind`, category `FRUIT`.
- `ingredient-ref-pomegranate-molasses` — `mélasse de grenade / pomegranate molasses`, category `SAUCE_AND_CONDIMENT`, no aliases.
- The live vinegar family includes generic vinegar, white vinegar, apple cider, red/white wine, balsamic, malt, coconut, cane, plain/seasoned rice, and Chinkiang vinegar. The prior integration records the generic-vinegar/verjus boundary.
- White wine and mirin have their own existing references; the current catalog has no generic cooking-wine reference.

There is no lemon/lime juice form, tamarind form, tamarind-paste reference, verjuice reference, or pomegranate-molasses form in the current form file. The legacy file has no lemon/lime juice, tamarind paste, verjuice, or pomegranate-molasses candidate; its only pomegranate match is pomegranate seeds. The ledger has accepted records for tamarind and pomegranate molasses and records verjus only as the vinegar boundary source; it has no separate verjuice or tamarind-paste identity record.

All **114 recipe JSON files** were scanned, including their ingredient rows and serialized text. The 15 acid-term ingredient-row hits are:

| Recipe | Ingredient line | Current link |
|---|---|---|
| 007 — Refried Pinto Beans | `vinegar or lime juice` | Unlinked compound alternative; leave unchanged. |
| 012 — Lemon Crinkle Cookies | `fresh lemon juice` | `ingredient-ref-lemon-juice`; preparation `fresh`. |
| 014 — Blueberry Cake Filling | `lemon juice` | `ingredient-ref-lemon-juice`. |
| 019 — Crab Balls | `fresh lemon juice` | `ingredient-ref-lemon-juice`; preparation `fresh`. |
| 024 — Date Squares | `lemon juice` | `ingredient-ref-lemon-juice`. |
| 029 — Cherry Cake Filling | `lemon juice` | `ingredient-ref-lemon-juice`. |
| 034 — Classic Beef Chili | `lime juice` | `ingredient-ref-lime-juice`. |
| 074 — Meatloaf | `vinegar` | `ingredient-ref-vinegar`. |
| 085 — Maple Chicken | `vinegar` | `ingredient-ref-vinegar`. |
| 091 — Red Velvet Cake with Cream Cheese Frosting | `white vinegar` | `ingredient-ref-white-vinegar`. |
| 095 — Satay | `fresh lime juice` | `ingredient-ref-lime-juice`; preparation `fresh`. |
| 101 — Big Mac Sauce | `white vinegar` | `ingredient-ref-white-vinegar`. |
| 106 — Blueberry Pie | `lemon juice` | `ingredient-ref-lemon-juice`. |
| 108 — Raspberry Pie | `lemon juice` | `ingredient-ref-lemon-juice`. |
| 113 — Tzatziki | `lemon juice` | `ingredient-ref-lemon-juice`. |

The ingredient rows contain eight linked lemon-juice lines, two linked lime-juice lines, four vinegar-only lines, and one unlinked vinegar-or-lime line. Thirteen recipe files repeat generic citrus-juice or vinegar wording in their instructions; those text matches add no new ingredient identity or product state. Across the full recipe JSON, no ingredient or other text mentions bottled lemon/lime juice, tamarind or its paste/water, pomegranate molasses, verjus/verjuice, sour-grape products, or cooking wine. Recipe demand supports alias coverage for fresh lemon/lime juice only; the other identity candidates are Section V pantry coverage, not recipe relinking.

## Prior WP05/WP06/WP08 decisions

- The integrated [WP05 Section V vinegar packet](wp05-section-v-vinegar-acid-gap-review-20261012.md) and [integration batch](../batches/wp05-section-v-vinegar-acid-integration-20261012/README.md) preserve vinegar as an acetous-fermentation product and record verjus as a separate juice boundary. This proposal follows that distinction.
- The [WP05 MENA pantry packet](wp05-mena-pantry-batch-20261008.md) already added the pomegranate-molasses identity. The [Narsharab boundary review](wp05-narsharab-boundary-review-20261009.md) keeps Narsharab unresolved rather than merging or aliasing it. No new pomegranate-molasses row is warranted.
- The [WP05 Southeast Asian condiments review](wp05-southeast-asian-condiments.md) and [WP06 Southeast Asia sweep](wp06-southeast-asia-cuisine-gap-sweep-20261011.md) hold broad tamarind/calamansi preparations unresolved. The exact `pâte de tamarin / tamarind paste` proposal is narrower and supported by direct terminology and Canadian product evidence; tamarind water and other preparations stay held.
- The [WP06 Mexico/Central America sweep](wp06-mexico-central-america-gap-sweep-20261009.md) leaves sour-orange juice unresolved. Do not transfer that term to lemon juice, lime juice, verjus, or vinegar.
- The [WP08 acidified-milk review](wp08-buttermilk-acidified-milk-context-review-20261010.md) is limited to milk-plus-acid preparation in named baking contexts. This proposal neither changes those contextual findings nor creates a global acid conversion or substitution.

## Sources

| ID | Source | Supports | Limit |
|---|---|---|---|
| `WP05-ACID-JUICE-20261012-S01` | Department of Justice Canada, [Food and Drug Regulations B.19.001](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html), current version accessed 2026-10-12. | Defines vinegar by acetous fermentation; establishes the fermentation boundary against juice. | Used only for category distinction; no acidity value, preservation instruction, or usage inference is applied. |
| `WP05-ACID-JUICE-20261012-S02` | OQLF, [verjus (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503324/verjus), term and definition. | Preferred FR `verjus`, EN `verjuice`, and acidic juice from grapes picked before maturity. | OQLF’s cooking-use note does not establish catalog equivalence or substitution. |
| `WP05-ACID-JUICE-20261012-S03` | Racines boréales, [Verjus](https://racinesboreales.ca/products/verjus), Québec retailer/product page. | Current Québec product title `Verjus`; ingredient listed as green-grape juice; product described as pressed immature grapes. | One local product page, not a standard for all sour-grape products. |
| `WP05-ACID-JUICE-20261012-S04` | Sadaf, [Sour Grape Juice \| Verjuice](https://www.sadaf.com/collections/all-products/products/sadaf-sour-grape-juice-36-5855); and Ava Esfahan Food Market, [Kambiz Verjuice / Natural Sour Grape Juice](https://en.avafood.ca/shop/natural-sour-grape-juice/). | A manufacturer and Canadian retailer explicitly associate `sour grape juice` with `verjuice`. | Product wording only; Sadaf’s product-specific water content is not generalized. |
| `WP05-ACID-JUICE-20261012-S05` | ReaLemon/ReaLime, [Les produits](https://www.realemon.ca/fr/products), Canadian French manufacturer page. | `jus de citron`, `jus de lime`, `jus de citron ou de lime frais`; product ingredient lists show the branded bottled products contain water, concentrated juice, sulphites, and peel oil. | Brand-specific composition; the page’s quantity comparisons are not used as conversions. |
| `WP05-ACID-JUICE-20261012-S06` | OQLF, [pâte de tamarin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423438/pate-de-tamarin). | Exact bilingual term pair `pâte de tamarin / tamarind paste`, in the treated-fruit domain. | Terminology evidence, not a universal product specification. |
| `WP05-ACID-JUICE-20261012-S07` | Qualifirst, [Pâte de Tamarin Thaï](https://odoo.qualifirst.com/fr_CA/food/hot_sauces_and_pastes/tamarind-paste-seedless-m). | Canadian product listing for a seedless tamarind-paste product and product-specific description as tamarind pulp. | One supplier product; does not define every tamarind paste or establish a conversion from fruit. |
| `WP05-ACID-JUICE-20261012-S08` | Farm Boy, [Indian-Style Dahl ingredient list](https://www.farmboy.ca/products/farm-boy-indian-style-dahl-canned-side-dish-425-g/). | Canadian bilingual ingredient names `Tamarind Paste / Pâte de Tamarin`. | Ingredient-list wording only; not a definition of tamarind water or paste variants. |
| `WP05-ACID-JUICE-20261012-S09` | Les Filles Fattoush, [Mélasse de grenade](https://lesfillesfattoush.com/products/melasse-grenade) and [Pomegranate molasses](https://lesfillesfattoush.com/en/products/melasse-grenade). | Current Québec maker’s bilingual names for the existing pomegranate-molasses identity. | Confirms the existing name; does not resolve Narsharab, grape molasses, or other pomegranate products. |

## Limits and next review

This packet adds no canonical data, ledger record, recipe link, form, measurement, conversion, preservation instruction, or substitution. The recipe scan does not support relinking any current row. Retail and manufacturer pages document specific products and may change; identity boundaries should follow the explicit product terms above, not extrapolate product formulas. Keep tamarind water, bottled-juice subtypes, broader sour-grape preparations, Narsharab, and general acid substitutions unresolved. Section V remains open for the remaining stocks, beverages, cooking alcohol, and additional vinegar/product boundaries.
