# WP05 Section W — Hoisin, plum, yellow bean, and black-bean sauce gap review

- **Packet type:** research proposal only; no catalog integration performed.
- **Reviewed/source access date:** 2026-10-11.
- **Scope:** the Section W hoisin, plum sauce, yellow bean sauce, and black-bean sauce candidates; exact owners and collisions in the live references, forms, legacy candidates, and research ledger; all manifest-listed bundled recipes; and current Canadian/Québec product naming.
- **Recommendation:** retain the existing hoisin, plum sauce, and black-bean sauce rows and their bounded names; hold yellow bean sauce and its commercial variants pending a stable product scope and supported fr-CA name. Propose no new identity or alias rows.
- **Write scope:** this proposal file only. No shared catalog, recipe, ledger, roadmap, plan/checklist, generated, or batch README files were edited. No tests were run.

## Final review snapshot

The shared catalog and recipe corpus changed during this review when a separate integration added a rye reference and yellow-pea form. I rechecked exact sauce ownership, forms, legacy candidates, the ledger, and all manifest-listed recipes afterward. Counts and hashes below identify the final snapshot used; the recipe corpus hash is calculated by sorting manifest recipe paths and hashing each path, a NUL byte, and its current file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,081 | `3a381c9d6293786ddf26f8f9dcff3688400caebace60c293175797b67a7a87ab` |
| Ingredient forms | 79 | `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| Legacy candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Research ledger records | 1,380 | `951867ea3e6f3d035d484d84234dd223996080e5c74b27422193be5f040c2258` |
| Manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe ingredient rows | 1,123 | Recipe corpus SHA-256: `ecced6649f648c0c09161e315efa047f0fd8c8835a83e49978533fb4c00616ab` |

## Recommendations and dispositions

| Candidate | Current owner | Disposition |
|---|---|---|
| Hoisin sauce | `ingredient-ref-hoisin-sauce`: `hoisin sauce` / `sauce hoisin`; EN alias `hoi sin sauce` | **KEEP.** Preserve the current display and the OQLF-supported English spelling alias. Add no garlic, barbecue, or other product-style aliases. [S01–S02] |
| Plum sauce | `ingredient-ref-plum-sauce`: `plum sauce` / `sauce aux prunes`; no aliases | **KEEP.** Preserve the current bilingual display without aliases. The Québec terminology entry and current Canadian manufacturer page support the prepared Chinese plum condiment. Do not merge it with plum fruit, jam, or other plum preserves. [S03–S04] |
| Yellow bean sauce | No exact active reference, form, or legacy candidate | **HOLD.** Do not create a generic or product-specific row yet. Current sources show different product labels and descriptions, but no current Canadian/Québec French product label or authoritative local term that settles a fr-CA display and product scope. Hold `yellow bean sauce`, `soy bean sauce`, `crushed yellow bean sauce`, `ground bean sauce`, and `yellow bean paste`; do not add any as aliases to sweet bean sauce or generic soy sauce. [S08–S09, S14–S17] |
| Black-bean sauce | `ingredient-ref-black-bean-sauce`: `black bean sauce` / `sauce de soja noir`; FR alias `sauce de soya noir` | **KEEP.** Preserve the OQLF-supported bilingual identity and French variant. Add no aliases for the less precise phrase `sauce aux haricots noirs`, garlic or chili product variants, whole fermented black beans, or Korean chunjang. [S05–S07, S11–S13] |

These decisions add no forms, recipe links, densities, unit mappings, conversions, package yields, or substitutions. External package sizes and suggested uses describe particular products and do not establish reusable measurement behavior.

## Exact owner and collision audit

Exact-name checks normalize case, accents, and punctuation, then compare canonical names, aliases, form labels/match terms, and legacy candidate names. Ledger text was checked separately for exact terms and relevant owner records.

| Exact term or boundary | Active reference owner | Form/legacy/ledger result | Disposition |
|---|---|---|---|
| `hoisin sauce`; `sauce hoisin`; `hoi sin sauce` | `ingredient-ref-hoisin-sauce`; `hoi sin sauce` is its only current alias | No matching form. The legacy file has a same-ID `hoisin sauce / sauce hoisin` candidate marked `unreviewed`; the live reference and verified ledger record already own the identity. | Retain the live row and its alias; do not revive the legacy candidate as a new row. |
| `plum sauce`; `sauce aux prunes` | `ingredient-ref-plum-sauce` | No matching form or legacy candidate; ledger has the existing verified plum-sauce record. | Retain current names; no alias expansion. |
| `yellow bean sauce`; `soy bean sauce`; `crushed yellow bean sauce`; `ground bean sauce`; `yellow bean paste` | No exact active owner | No exact form or legacy candidate and no matching yellow-bean ledger record. | Hold each query term. Product labels do not settle a shared identity or fr-CA display. |
| `black bean sauce`; `sauce de soja noir`; `sauce de soya noir` | `ingredient-ref-black-bean-sauce`; `sauce de soya noir` is its only current alias | No matching form or legacy candidate; the ledger has a verified OQLF-backed record. | Retain exact live names. OQLF lists `sauce aux haricots noirs` as an expression used for the notion, but says it is less precise and does not retain it as a synonym. [S05] |
| `sweet bean sauce`; `sauce douce au soja` | Separate owner `ingredient-ref-sweet-bean-sauce` | No aliases on this row. The ledger documents the manufacturer’s product-specific `Tien Mien Jiang` pairing. | Keep separate from yellow bean sauce and sweet soy sauce. Do not globalize `tianmianjiang` or `tien mien jiang`. [S08–S09] |
| `douchi`; `fermented black soybeans` | Separate owner `ingredient-ref-douchi`; the English phrase is its alias | No form match. The verified ledger records douchi separately from black-bean sauce and doubanjiang. | Treat douchi as the named fermented-bean ingredient, not the prepared sauce made with it. [S06–S07, S11–S12] |
| `doubanjiang`; `Toban Djan`; `chili bean sauce`; `sauce aux fèves et au piment rouge` | `ingredient-ref-doubanjiang` owns `doubanjiang`; the product-style names have no exact active aliases | No form match. The ledger already records doubanjiang as a separate identity. | Keep the active doubanjiang row separate. A Canadian manufacturer’s Chili Bean Sauce (Toban Djan) is one Sichuan-style chili product, not an alias for generic black- or yellow-bean sauce. [S10] |
| `black bean garlic sauce`; `sauce aux haricots noirs et à l’ail`; `chili black bean sauce`; `sauce aux piments et aux haricots noirs` | No exact active reference | These are current manufacturer product labels, not current catalog aliases. | Keep product qualifiers out of the generic black-bean row. Products can contain multiple sauces, aromatics, and fermented black beans. [S06–S07, S13] |
| `chunjang`; `black bean paste` | `ingredient-ref-chunjang` owns `chunjang`; `black bean paste` is not a catalog alias | No exact active `black bean paste` owner or form. | Preserve chunjang separately. A manufacturer’s English descriptor “Black Bean Paste” is product-specific; it does not establish equivalence to prepared black-bean sauce. [S13] |
| `black beans`; `haricots noirs` | Separate ingredient owner `ingredient-ref-black-beans` | No sauce alias on the bean reference. | Keep the ordinary bean ingredient separate from douchi and all prepared sauces. |
| `soy sauce`; `sauce soya`; dark soy sauce | Generic soy owner `ingredient-ref-soy-sauce` and style owner `ingredient-ref-dark-soy-sauce` | No exact alias collision with `sauce de soja noir`. | Preserve black-bean sauce as its own prepared condiment; OQLF explicitly distinguishes it from bottled liquid soy sauce. [S05] |

Other active fermented or bean-paste references include doenjang, gochujang, ssamjang, miso, white/red fermented bean curd, Chinese sesame paste, and generic soy sauce. None is an alias for these four sauce candidates. No bean-family equivalence or substitution follows from shared soybean ingredients.

## Product variation and Québec French naming

- **Hoisin:** OQLF’s entry gives `sauce hoisin`, `hoisin sauce`, and `hoi sin sauce`. Lee Kum Kee Canada currently uses `sauce hoisin` for a prepared sweet sauce with soy ingredients and lists distinct hoisin products, including garlic-flavoured sauce. These source-specific ingredients and variants support the existing narrow owner but not a universal formula or variant alias. [S01–S02]
- **Plum sauce:** OQLF’s Chinese-condiment entry gives `sauce aux prunes / plum sauce` and describes a sweet-and-piquant prepared condiment. Lee Kum Kee Canada uses the same French display for a product made with Chinese plums, ginger, and chili. Ingredient lists vary by source/product; the identity should not be widened to plum preserves generally. [S03–S04]
- **Black-bean sauce:** OQLF gives `sauce de soja noir` and `sauce de soya noir`; its note says the sauce is a prepared, thick condiment and distinguishes it from bottled soy sauce. Current Lee Kum Kee Canada product labels include garlic-black-bean sauce and chili-black-bean sauce, each with its own prepared formula. The distributor list also distinguishes garlic black-bean, black-bean spare-rib, and crushed yellow-bean products. These commercial variants do not warrant aliases on the generic row. [S05–S07, S16]
- **Yellow-bean products:** Lee Kum Kee UK calls one product `Yellow Bean Sauce` and says it is “also called Soy Bean Sauce,” describing that SKU as made from naturally fermented whole soybeans. Canadian listings show Pearl River Bridge `Crushed Yellow Bean Sauce`; the retailer provides no dependable ingredient description, and its displayed description is copied from an unrelated yellow-chili sauce. The product names therefore document market variation, but they do not settle whether the whole-bean and crushed products should share a generic identity. [S14–S16]
- **Historical French phrase:** A 2005 WIPO goods list renders `yellow bean sauce` as `sauce de haricots jaunes`. This is a useful translation lead, but it is an old international trademark goods list, not a current Canadian product label or Québec terminology decision. It does not settle whole-versus-crushed scope. Do not adopt it as a catalog display yet. [S17]
- **Sweet bean and nearby bean pastes:** The live Canadian French Lee Kum Kee product name for Sweet Bean Sauce is `sauce douce au soja`. A separate U.S. manufacturer product page pairs its specific Sweet Bean Sauce product with “Tien Mien Jiang.” Keep the active sweet-bean identity separate from yellow-bean products and from sweet soy sauce; neither one manufacturer pairing nor romanization variation supports a universal alias. [S08–S09]
- **Douchi, doubanjiang, and chunjang:** The Canadian IP Office goods list glosses douchi as fermented black soybeans, while the Chinese market regulator lists 豆豉 (douchi) among fermented bean products. Lee Kum Kee’s black-bean product pages use fermented black beans as components of prepared sauces. Lee Kum Kee’s Canadian Doubanjiang/Toban Djan product is a separate Sichuan-style chili sauce containing fermented bean pastes. Singsong markets Chunjang as “Black Bean Paste,” but that is a chunjang product descriptor. These sources support keeping the active rows distinct; they do not support cross-aliases among them. [S06–S07, S10–S13]

Searches for current fr-CA product wording included `sauce aux fèves jaunes`, `sauce aux haricots jaunes`, `yellow bean sauce français Canada`, and the French Lee Kum Kee product catalogue. I found no current Québec/Canadian manufacturer or retailer French label for the yellow-bean candidates. This is a documented search result, not proof that no local wording exists. Hold the term until a product-specific or authoritative Québec French source supports both its display and scope.

## Exact bundled-recipe demand audit

All **114** paths in `manifest.v1.json` and all **1,123** `ingredients[]` rows were scanned. The search covered every string field in each recipe, including ingredient text, names, and reference IDs, for exact normalized terms and close product-boundary phrases. There were **zero text matches and zero ingredient-row matches** for each group.

| Candidate group searched | Recipe text matches | Ingredient-row matches | Recipe-line IDs |
|---|---:|---:|---|
| Hoisin / hoi sin sauce | 0 | 0 | None |
| Plum sauce / sauce aux prunes | 0 | 0 | None |
| Yellow bean, soy bean, crushed yellow bean, ground bean sauce, and yellow bean paste | 0 | 0 | None |
| Black-bean sauce, black-bean garlic sauce, chili black-bean sauce, and French product labels | 0 | 0 | None |
| Neighboring sweet bean / tianmianjiang, douchi / fermented black soybeans, doubanjiang / Toban Djan, chunjang / black bean paste | 0 | 0 | None |

No bundled recipe line demands these identities. No recipe links or relinks are proposed. Manufacturer recipe pages are external product examples and do not establish demand in the bundled manifest.

## Source-to-claim register

The new source IDs `WP05-W-CONDIMENT-GAP-20261011-S01`–`S17` were checked against existing proposal/batch Markdown and the current research ledger before use; no collisions were found. All pages were accessed 2026-10-11 unless a publication date is stated.

| ID | Source | Claims supported and limits |
|---|---|---|
| **WP05-W-CONDIMENT-GAP-20261011-S01** | Office québécois de la langue française, [sauce hoisin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095133/sauce-hoisin) | Preferred fr-CA term `sauce hoisin`; English terms `hoisin sauce` and `hoi sin sauce`; prepared Chinese sauce scope. The entry was last updated in 1982, so its definition is not treated as a current universal formula. |
| **WP05-W-CONDIMENT-GAP-20261011-S02** | Lee Kum Kee Canada, [Sauce hoisin (bouteille)](https://ca.lkk.com/fr-ca/products/hoisin-sauce--bottle), [Hoisin Sauce](https://ca.lkk.com/en/products/hoisin-sauce--bottle), and [Hoisin product family](https://ca.lkk.com/fr-ca/products/saucetype/hoisin) | Current Canadian French product name and one manufacturer’s product description; the product family shows a garlic variant. Product labels and ingredients are SKU-specific. |
| **WP05-W-CONDIMENT-GAP-20261011-S03** | OQLF, [sauce aux prunes (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095129/sauce-aux-prunes) | Preferred fr-CA `sauce aux prunes`, English `plum sauce`, and prepared Chinese condiment scope. Last updated 1982; not a universal formula. |
| **WP05-W-CONDIMENT-GAP-20261011-S04** | Lee Kum Kee Canada, [Sauce aux prunes](https://ca.lkk.com/fr-ca/products/plum-sauce) | Current Canadian French display and one product’s ingredients/use description. Does not support a generic plum preserve alias. |
| **WP05-W-CONDIMENT-GAP-20261011-S05** | OQLF, [sauce de soja noir (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095402/sauce-de-soja-noir) | Preferred French terms `sauce de soja noir` and `sauce de soya noir`; English `black bean sauce`; says `sauce aux haricots noirs` is less precise and distinguishes the prepared condiment from bottled liquid soy sauce. Last updated 1982. |
| **WP05-W-CONDIMENT-GAP-20261011-S06** | Lee Kum Kee Canada, [Sauce aux haricots noirs et à l’ail](https://ca.lkk.com/fr-ca/foodservices/products/black-bean-garlic-sauce) and [Black Bean Garlic Sauce](https://ca.lkk.com/en/products/black-bean-garlic-sauce) | Current Canadian product variant and its compound ingredients. Supports a garlic-specific commercial product, not a generic alias or universal black-bean-sauce formula. |
| **WP05-W-CONDIMENT-GAP-20261011-S07** | Lee Kum Kee Canada, [Sauce aux piments et aux haricots noirs](https://ca.lkk.com/fr-ca/products/chili-black-bean-sauce) and [Chili Black Bean Sauce](https://ca.lkk.com/en/products/chili-black-bean-sauce) | Current chili-black-bean product name and one product’s formula; fermented black beans are ingredients in a prepared chili sauce. Not a douchi label or a generic alias. |
| **WP05-W-CONDIMENT-GAP-20261011-S08** | Lee Kum Kee Canada, [Sauce douce au soja / Sweet Bean Sauce](https://ca.lkk.com/fr-ca/products/sweet-bean-sauce) and [Sweet Bean Sauce](https://ca.lkk.com/en/products/sweet-bean-sauce) | Current Canadian paired display and one product’s contents. Supports the distinct live sweet-bean owner only. |
| **WP05-W-CONDIMENT-GAP-20261011-S09** | Lee Kum Kee Industrial USA, [Sweet Bean Sauce (Tien Mien Jiang)](https://usa.lkk.com/en/industrial/products/sweet-bean-sauce-tien-mien-jiang) | A maker-specific pairing on one industrial product page. It does not establish global aliases for every spelling of tianmianjiang or for yellow-bean products. |
| **WP05-W-CONDIMENT-GAP-20261011-S10** | Lee Kum Kee Canada, [Sauce aux fèves et au piment rouge (Doubanjiang)](https://ca.lkk.com/fr-ca/industrial/products/chili-bean-sauce---toban-djan) and [Chili Bean Sauce (Toban Djan)](https://ca.lkk.com/en/products/chili-bean-sauce-toban-djan-2) | Current Canadian manufacturer labels one product as doubanjiang/Toban Djan and describes a Sichuan-style chili sauce with fermented soybean and broad-bean pastes. Product-specific; not a cross-alias among generic bean sauces. |
| **WP05-W-CONDIMENT-GAP-20261011-S11** | China State Administration for Market Regulation, [Soy product production-license review rules](https://www.samr.gov.cn/spscs/tzgg/art/2023/art_8c3dc6a187e443328a830dd87b424839.html) | Lists 豆豉 (douchi) among fermented bean products, separately from non-fermented bean products. Supports product-class distinction, not Canadian French naming or a recipe formula. |
| **WP05-W-CONDIMENT-GAP-20261011-S12** | Canadian Intellectual Property Office, [Trademarks Journal, 2026-04-08](https://www.ic.gc.ca/opic-cipo/tmj/eng/08Apr2026_en.pdf?edition=04-08&year=2026) | A Canadian goods list uses `douchi (fermented black soybeans)`. A trademark goods list supports the wording in that filing, not a food standard or French alias. |
| **WP05-W-CONDIMENT-GAP-20261011-S13** | Singsong Food, [Singsong Chunjang (Black Bean Paste)](https://singsongfood.com/en/bbs/product_detail.php?cat_no=40&idx=337&offset=&sk=&sw=) | Current manufacturer page names a particular product Chunjang and uses “Black Bean Paste” as its English descriptor. It does not establish a general synonym with Chinese black-bean sauce. |
| **WP05-W-CONDIMENT-GAP-20261011-S14** | Lee Kum Kee UK, [Yellow Bean Sauce / Soy Bean Sauce](https://uk.lkk.com/products/soy-bean-sauce) | Current UK manufacturer page labels one product `Yellow Bean Sauce` and says “also called Soy Bean Sauce”; describes that product as made from naturally fermented whole soybeans. It is not Canadian/Québec French terminology and does not establish a global alias. |
| **WP05-W-CONDIMENT-GAP-20261011-S15** | PriceSmart Foods Canada, [Pearl River Bridge Crushed Yellow Bean Sauce](https://www.pricesmartfoods.com/product/pearl-river-bridge-crushed-yellow-bean-sauce-id-00845603000169) | Current Canadian retailer product title and listed package establish the market label `Crushed Yellow Bean Sauce`. The listing’s description names an unrelated Pearl River Bridge yellow-chili sauce, so it is not used for composition or product identity. |
| **WP05-W-CONDIMENT-GAP-20261011-S16** | Locsky Trading, [Pearl River Bridge product list](https://www.locsky.ca/items-pearlriverbridge) | Current Canadian distributor list includes `Crushed Yellow Bean Sauce`, `Garlic Black Bean Sauce`, and other named sauce products. Supports label variation only; it gives no French display or formula for the yellow-bean item. |
| **WP05-W-CONDIMENT-GAP-20261011-S17** | World Intellectual Property Organization, [Madrid goods list, 2005](https://www.wipo.int/edocs/madgdocs/en/2005/madrid_g_2005_30.pdf) | One old international goods list translates `yellow bean sauce` as `sauce de haricots jaunes`. It is a historical trademark translation, not current Canadian/Québec use, a product label, or evidence resolving whole-versus-crushed scope. |

## Review and check notes

- Checked Section W and its linked reviews/batches, including the [Chinese-condiment boundary review](wp05-chinese-condiments-boundary-review-20261009.md), [fermented-soy/sauce-preserve follow-up](wp05-east-asian-sauce-preserve-followup-20261010.md), [Section W review](wp05-east-asian-condiments-section-w-review-20261011.md), and [2026-10-11 Section W integration](../batches/wp05-section-w-east-asian-condiment-identities-20261011/README.md). The live active rows confirm that hoisin, plum sauce, black-bean sauce, sweet bean sauce, doubanjiang, douchi, and chunjang already have distinct owners; the new Section W checklist follow-up still holds generic yellow bean sauce.
- The exact owner audit found no cross-owner alias collision among the four target identities. The only legacy overlap is the same-ID hoisin candidate marked `unreviewed`; it does not justify another row.
- Recipe search covered all manifest-listed files and all their string fields. No matching product name, ingredient row, recipe-line ID, or relink was found.
- No new source ID prefix collision was found in existing proposal/batch Markdown or the research ledger.
- No density, unit conversion, measurement mapping, preparation form, yield, or substitution is proposed. Product package labels and recipe suggestions remain product-specific.
- Source access is documented as of 2026-10-11. The OQLF entries and WIPO record are dated terminology evidence; current manufacturer, retailer, and distributor listings support product labels, while regulatory and CIPO sources support the limited bean-class terminology claims.
- No app tests were run because this packet records research and changes no app/data files.
