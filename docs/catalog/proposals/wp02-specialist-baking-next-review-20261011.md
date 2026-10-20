# WP02 Section A specialist-baking gap: Japanese weak wheat flour (hakurikiko)

**Date:** 2026-10-11  
**Status:** Root review accepted the identity-only class row and integrated it into the catalog and ledger on 2026-10-11; the French compound remains provisional pending independent Québec review.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for the Japanese wheat-flour class 薄力粉 (*hakurikiko*):

| Proposed ID | English display | Proposed fr-CA display | English aliases | fr-CA aliases |
|---|---|---|---|---|
| `ingredient-ref-japanese-weak-wheat-flour` | `Japanese weak wheat flour (hakurikiko)` | `farine de blé tendre japonaise (hakurikiko)` | `Japanese soft wheat flour` | `farine de blé mou japonaise` |

The English display uses the wording on a retailer product title for “Hakurikiko Violet Weak Wheat Flour.” The French display is a transparent construction from the OQLF-preferred generic term *farine de blé tendre* plus a Japanese-class qualifier; the OQLF entry does not attest this full compound, so retain it as provisional until independent Québec review. The OQLF-listed alternate *farine de blé mou* supports the qualified French alias.

Treat *hakurikiko* as a national milling/functional class identity, not a preparation form or a product blend. Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) describes the class as having less gluten and a softer character than the stronger flour classes, and says it is used for cakes, many confectionery products, and thickening. This meets the open Section 04 A request for functionally distinct regional wheat-flour identities. Keep the country/class qualifier visible.

Do not add `hakurikiko`, `薄力粉`, `Japanese cake flour`, or `cake flour` as aliases to the existing generic `cake flour / farine à gâteau` row. A Canadian Japanese-market retailer does describe one Nissin Violet product as cake flour, and another retailer labels a Japanese Violet item with *hakurikiko* and “weak wheat flour.” Those are product-level bridges; they do not establish that every Japanese weak-flour product is compositionally or functionally identical to every Canadian/North American cake flour. The existing cake-flour identity should remain searchable for unqualified `cake flour` queries.

## Boundary, collisions, and exclusions

- At proposal time, the 948-reference catalog contained generic cake flour, pastry flour, bread flour, high-gluten flour, self-rising flour, whole-wheat pastry flour, Italian types 00/0/1/2, and French types 45/55/65/80/110/150, with no exact owner for the proposed qualified class terms. Root later added the qualified Japanese weak-wheat-flour class without taking over generic cake-flour terms.
- Under the current search normalizer, `soft wheat flour` and `farine de blé tendre` each match the ten existing Italian/French national-grade rows. Keep those broad terms off the new row’s aliases. The qualified proposed displays retain the distinction while still allowing broad family searches to find the Japanese class.
- `cake flour` currently matches only `ingredient-ref-cake-flour`. Keep `Japanese cake flour` as a held product phrase until evidence establishes that it is a class-wide synonym, not just retailer wording for selected imported products. Do not alias `pastry flour`, `farine à pâtisserie`, or any unqualified `weak flour` / `soft flour` phrase.
- The existing Japanese *Hattai-ko / mugikogashi* review concerns roasted whole-grain products, not this wheat-flour class. The Japanese rice-flour product review concerns *mochiko* and *shiratamako*. Neither is a duplicate or alias source for *hakurikiko*.
- The Japanese-script query `薄力粉` currently normalizes to an empty search key and returns the entire catalog. Do not add that script as an active alias until search normalization supports non-Latin scripts. The Latin spelling *hakurikiko* remains searchable in the proposed bilingual displays.
- Do not create separate rows for Nissin/Nisshin Violet, Super Violet, or other manufacturer product names. The Nisshin catalog shows several pastry products with product-specific specifications and uses; it does not supply a single universal numeric specification for the Japanese weak-flour class.

The suggested search audit was replayed against the live bilingual reference names and aliases using `normalizeIngredientSearchKey` behavior:

| Query | Current result | Disposition |
|---|---|---|
| `hakurikiko` | No reference | Candidate term has no current owner. |
| `Japanese weak wheat flour` / `Japanese soft wheat flour` | No reference | Qualified candidate terms have no current owner. |
| `farine de blé tendre japonaise` | No reference | Qualified candidate term has no current owner. |
| `soft wheat flour` / `farine de blé tendre` | Ten Italian/French type rows | Broad class query; do not add as aliases. |
| `cake flour` | Existing cake-flour row only | Preserve the existing unqualified result. |

## Recipe demand and behavior limits

The 114 manifest-listed recipe files contain 1,123 ingredient rows. A full-text scan found no *hakurikiko*, `薄力粉`, Japanese weak/soft wheat-flour, Japanese cake-flour, or proposed French-name hits. Four recipe ingredient rows explicitly request `cake flour` (Vanilla Cake, Yule Log, Strawberry Cake, and Red Velvet Cake), but none identifies Japanese flour. Add no recipe link on this evidence; the four cake-flour rows remain on the existing generic cake-flour identity.

No generic protein or ash threshold was found in the MAFF class description. Nisshin’s manufacturer catalog includes product-specific protein and ash values, but those figures vary by named pastry product and are not a class-wide specification. Keep the candidate at `defaultDensity: null` with empty unit mappings. Add no forms, package yields, measurement conversions, recipe quantities, or global/contextual substitutions. In particular, do not claim a ratio to Canadian cake flour, pastry flour, all-purpose flour, or any other flour class.

## Source register

Sources accessed 2026-10-11. The non-English government source is paraphrased; no text is quoted at length.

| ID | Source | Evidence and limit |
|---|---|---|
| WP02-JSF-20261011-S01 | Japan Ministry of Agriculture, Forestry and Fisheries, [“小麦粉の種類について教えてください”](https://www.maff.go.jp/j/heya/sodan/1106/02.html) (updated in 2023) | Primary government source: classifies wheat flour broadly by gluten strength and describes 薄力粉 as low in gluten, soft in quality, and used for cakes, confectionery, and thickening. It gives no numeric class threshold or translation equivalence to North American cake flour. |
| WP02-JSF-20261011-S02 | Office québécois de la langue française, [*farine de blé tendre*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) | Preferred Québec terms are *farine de blé tendre* and *farine de blé mou*; the definition says this lower-gluten flour is mainly used for cakes, biscuits, and similar pastry. It supports the generic French base only, not the Japanese-qualified compound. |
| WP02-JSF-20261011-S03 | Nisshin Seifun Group, [Flour Products Collection (English PDF)](https://nisshin-seifun.com/assets/pdf/nsf_catalog_english_2p.pdf) | Primary manufacturer catalog lists several distinct pastry-flour products for Japanese and Western confectionery with product-specific descriptions/specifications. It supports keeping named products and their specifications out of a generic class row; the catalog notes its products are basically for the Japanese market. |
| WP02-JSF-20261011-S04 | Suzuya Japanese Market (Burnaby, BC), [Nissin Violet Flour 1 kg](https://suzuya.ecwid.com/Nissin-Violet-Flour-1kg-p808562702) | Canadian Japanese-market retailer calls this one imported item “Cake flour” and recommends pastries and tempura. The page is a named product listing, marked sold out when accessed; it does not establish class-wide equivalence. |
| WP02-JSF-20261011-S05 | Marukai Wholesale Mart, [Nisshin Shokai Hakurikiko Violet Weak Wheat Flour](https://shop.marukaihawaii.com/store/marukai-hawaii/products/24162212-nisshin-shokai-hakurikiko-violet-weak-wheat-flour-2-2-lb) | Product-title evidence for the romanized name *hakurikiko* alongside “weak wheat flour”; a retailer listing for one named item, not a generic product standard or Canadian terminology source. |
| WP02-JSF-20261011-S06 | Japan MAFF, [“Grain products”](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html) | MAFF English overview says Japanese wheat flour is classed by gluten amount into bread, all-purpose, and cake flour. This general English summary helps explain the market bridge but does not explicitly map 薄力粉 to every product called cake flour. |

## Remaining review

Before catalog integration, independently review the proposed Québec compound *farine de blé tendre japonaise*. Recheck the retailer product listings and catalog collisions at integration time. Keep product-label-specific flour specifications in the evidence ledger only; measurement, conversion, yield, and substitution research remains unavailable for this class.


## Root integration note

Root verified the MAFF class description, OQLF generic terminology, Nisshin manufacturer catalog, Suzuya product listing, Marukai product title, and MAFF English overview. The accepted row is `ingredient-ref-japanese-weak-wheat-flour`; its French compound stays explicitly provisional. It has no forms, measures, conversions, yields, recipe link, or substitution, and generic cake-flour search ownership is unchanged.
