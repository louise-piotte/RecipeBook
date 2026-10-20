# WP05 Chunjang — Québec naming and black-bean boundary review

**Date:** 2026-10-11
**Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.
**Scope:** one open Korean condiment identity, chunjang, from Section W of the active catalog plan. This review excludes all sambal products.

## Recommendation

**Accept one identity-only reference**, with the borrowed product name `chunjang` in both locales. A current Korean standard names the distinct product `Chunjang`; a Montréal retailer sells a product titled `Chunjang Chinese Black Bean Paste`; and a Québec City retailer’s French listing includes `Chunjang` in the product title [S01–S04]. Keep the localized display name concise and source-backed; do not copy the retailers’ variable descriptive wording into aliases.

| Seed field | Value |
|---|---|
| ID | `ingredient-ref-chunjang` |
| English display | `chunjang` |
| Québec French display | `chunjang` |
| English / French aliases | None |
| Category | `SAUCE_AND_CONDIMENT` |
| Default density / unit mappings | `null` / none |

Do not activate `black bean paste`, `Chinese black bean paste`, `black bean sauce`, `pâte de haricots noirs`, `pâte de soya chinoise`, `tianmianjiang`, or `sweet bean paste` as aliases. Those terms are product descriptions or neighboring products, and the sources do not establish safe global crosswalks among them.

## Plan and prior-proposal audit

The Section W checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt` still leaves chunjang open alongside other Korean pastes and seasonings. The 2026-10-08 East Asian umbrella proposal lists chunjang as a separately named product and says its Québec display and product crosswalk need validation. The earlier Korean-pastes follow-up explicitly held chunjang because it had not settled the boundary from Chinese black-bean pastes/sauces. The 2026-10-10 Korean fermented-paste identity review accepted gochujang, doenjang, and ssamjang only; it does not propose chunjang. No earlier proposal or integration adds a chunjang reference.

This packet resolves only the named identity and borrowed display. It does not claim a general equivalence between the Korean product and Chinese sweet-bean, black-bean, or fermented-bean products.

## Live package, collision, and recipe audit

Snapshot read on 2026-10-11. Hashes are SHA-256 of the current files.

| Artifact | Current state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 904 references; no exact `chunjang` identity or alias | `ae957b92a8881a7a1d9bcdcdaf1666d4af6747aec66a2a40d579f1dc7775d207` |
| `ingredient-forms.v1.json` | 48 forms; no exact chunjang or black-bean-paste form | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `docs/catalog/research-ledger.v1.json` | 1,157 records; no chunjang identity record or Chunjang source-ID collision | `f59ffb96d41af8f7abfaf46023f1c71073476ded0b92bc7d6c879b23a42873ec` |
| `docs/catalog/legacy-import-identities.v1.json` | 77 candidates; no Chunjang candidate | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| `manifest.v1.json` | 114 recipes; 1,123 ingredient rows | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The normalized-key audit followed `normalizeIngredientSearchKey` in `IngredientSearch.kt` across active reference names and aliases, form labels and match terms, and legacy names and aliases. No exact collision was found for `chunjang`, `chun-jang`, `chun jang`, `black bean paste`, `Korean black bean paste`, `pâte de soya chinoise (chun-jang)`, or the Québec retailer’s French title wording. The proposed ID is absent from active references, forms, ledger, and legacy candidates. The new source-ID prefix `WP05-CHUNJANG-20261011` was absent from prior proposals, batches, and the ledger before this file was written.

The active neighboring references are `ingredient-ref-black-bean-sauce` (`black bean sauce` / `sauce de soja noir`, French alias `sauce de soya noir`), `ingredient-ref-black-beans` (`black beans` / `haricots noirs`), `ingredient-ref-douchi` (`douchi`, English alias `fermented black soybeans`), `ingredient-ref-doubanjiang`, `ingredient-ref-doenjang`, `ingredient-ref-gochujang`, `ingredient-ref-miso`, and `ingredient-ref-white-fermented-bean-curd`. Keep each distinct. In particular, the exact active query `black bean sauce` belongs to `ingredient-ref-black-bean-sauce`; do not add it to chunjang.

All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned. Searches of ingredient `originalText`, `ingredientName`, and `ingredientRefId`, plus a full-file scan for Chunjang and black-bean-paste variants, returned **zero recipe hits**. No recipe line or link is proposed.

## Identity and decision boundaries

- **Chunjang:** represent the named Korean fermented paste under its source-backed romanized name. Korean Standard KS H 2108 (current listing dated 2024-12-31) treats 춘장 / Chunjang as a separate standardized product class made from soybeans or defatted soybeans with cereal grains, fermented and matured, with caramel color added under the specified scope [S01].
- **Black bean sauce:** keep separate from chunjang. The active Québec French/OQLF-backed identity is a prepared sauce; the Korean standard describes chunjang as a fermented paste. No shared alias or recipe link follows from one retailer’s English parenthetical label.
- **Douchi and raw black beans:** keep separate. Douchi is the fermented black-soybean identity; ordinary black beans are a separate legume reference. Neither is a synonym for chunjang.
- **Doubanjiang, doenjang, and miso:** keep separate as other named fermented products. Shared soybeans, fermentation, or paste texture does not establish equivalence.
- **Tianmianjiang / sweet bean paste and generic `black bean paste`:** unresolved crosswalk. The Singsong manufacturer describes its own product as a traditional Chinese-style black bean paste, while current Canadian/Québec retailers use the same English descriptor for named Korean Chunjang [S02–S04]. This product-specific overlap does not establish that every Chunjang product is identical to tianmianjiang or to a generic black-bean paste. Add no alias or merge.
- **Cooked jjajang / jajang sauce:** keep out of this identity. A prepared noodle sauce or finished dish is not automatically the standalone paste.

No preparation form is proposed. A named condiment identity does not imply a raw/cooked form pair or a universal formulation.

## Measurements, conversions, yields, and substitutions

No supported kitchen conversion or package yield was found. Manufacturer package sizes and ingredient declarations describe individual products, not a standardized mass-per-volume value. Recommend `defaultDensity: null`, `unitMappings: []`, and no count, spoon, cup, or package conversion. No substitution is proposed: the reviewed sources establish product naming and boundaries, not an interchangeable ingredient or tested ratio. No recipe line exists to relink.

## Source register

Sources were checked on 2026-10-11.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-CHUNJANG-20261011-S01` | Korean Standards Association, [KS H 2108 — Chunjang](https://www.kssn.net/search/stddetail.do?itemNo=K001010150698), current standard metadata and scope summary. | Names the Korean standard in English as `Chunjang`, identifies its 2024-12-31 issue, and describes a fermented soy-and-grain paste with caramel color. The page lists the standard as promulgated by Korea’s Ministry of Agriculture, Food and Rural Affairs. The full standard is sold separately; this review uses the published metadata/scope summary, not unpublished numerical criteria. |
| `WP05-CHUNJANG-20261011-S02` | Singsong Food, [Singsong Chunjang (Black Bean Paste) 200g](https://singsongfood.com/en/bbs/product_detail.php?cat_no=40&idx=337&offset=&sk=&sw=), manufacturer product page. | Direct English product name and product type. The page lists one 200 g SKU and its ingredient statement; that formulation and size apply to this product only. The manufacturer calls it traditional Chinese-style black bean paste, which is not a universal crosswalk to tianmianjiang or every black-bean paste. |
| `WP05-CHUNJANG-20261011-S03` | Marché Korea, Montréal, [Paste category](https://marchekorea.com/product-category/sauces/paste/), product listing `SINGS Chunjang Chinese Black Bean Paste 춘장 200G`; store locations are listed on the same page. | Current English retail name for a Chunjang product sold by a Montréal Korean grocery. The retailer’s product title is not a product standard. |
| `WP05-CHUNJANG-20261011-S04` | Taiyo Canada, Québec City, [Pâte de soja coloré noir Obok Chunjang](https://taiyocanada.com/products/pate-de-soja-colore-noir-obok-chunjang%E9%9F%A9%E5%9B%BD%E7%82%B8%E9%85%B1%E9%9D%A2%E9%85%B1-500g) and [store locations](https://taiyocanada.com/pages/nous-contacter). | A Québec retailer’s French product title includes the exact borrowed name `Chunjang`; its contact page lists Ichiba Taiyo at 2700 boulevard Laurier, Québec. The page’s descriptor is retailer wording, has nonstandard agreement, and the item was out of stock at review time; neither fact supports copying the descriptor into the canonical display or an alias. |
| `WP05-CHUNJANG-20261011-S05` | Canadian Intellectual Property Office, [Trademarks Journal, Vol. 73 No. 3721 (18 Feb. 2026), application 2,295,738](https://www.ic.gc.ca/opic-cipo/tmj/eng/18Feb2026_fr.pdf?edition=02-18&year=2026), French goods list. | The applicant’s French goods text names `pâte de soya chinoise (chun-jang)` among Korean pastes and separately lists `ja-jang` as black-bean paste for noodle sauce. Useful Canadian French wording and boundary evidence, not an OQLF term decision, retail package label, or universal product crosswalk. |
| `WP05-CHUNJANG-20261011-S06` | Office québécois de la langue française, [sauce de soja noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095402/sauce-de-soja-noir). | Québec terminology for the existing prepared black-bean sauce reference, supporting that its active French/English pair is a distinct neighboring identity. A targeted OQLF lookup did not locate a dedicated chunjang entry. |

## Evidence limits and recommendation boundary

The evidence supports a distinct, identity-only `chunjang` reference and the same borrowed display name in English and Québec French. It does not establish a preferred Québec French translation for a descriptive gloss, a universal Chunjang recipe, or a crosswalk with Chinese tianmianjiang, sweet bean sauce, generic black-bean paste, douchi, or prepared black-bean sauce. Keep aliases, forms, numeric data, conversions, yields, substitutions, and recipe links empty. This proposal does not complete the broader Korean-paste or East Asian-condiment checklist.

No tests were run during the source review. Implementation verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
