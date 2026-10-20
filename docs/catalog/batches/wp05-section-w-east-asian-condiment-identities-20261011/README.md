# WP05 Section W — East Asian condiment identities

Integrated six identity-only references from the reviewed proposal:

| Reference | English / fr-CA display | Aliases | Scope and boundary |
|---|---|---|---|
| `ingredient-ref-sweet-bean-sauce` | sweet bean sauce / sauce douce au soja | None | Lee Kum Kee's Canadian French product name. Kept separate from its sweet soy sauce; its product-specific “Tien Mien Jiang” wording was not made a global alias. [Canadian product page](https://ca.lkk.com/fr-ca/products/sweet-bean-sauce), [separate sweet soy product](https://ca.lkk.com/fr-ca/products/sweet-soy-sauce), [manufacturer product page](https://usa.lkk.com/en/industrial/products/sweet-bean-sauce-tien-mien-jiang). |
| `ingredient-ref-tonkatsu-sauce` | tonkatsu sauce / sauce tonkatsu | None | Prepared Japanese condiment, distinct from chuno/Worcestershire, okonomi, takoyaki, and yakisoba sauces. [Bull-Dog products](https://www.bulldogsauce-global.com/products/), [Provigo Québec listing](https://www.provigo.ca/fr/sauce-tonkatsu/p/21576312_EA?source=nspt). |
| `ingredient-ref-okonomi-sauce` | okonomi sauce / sauce okonomi | EN: `okonomiyaki sauce` | Added only the manufacturer-supported alternate name. Kept distinct from tonkatsu, takoyaki, and yakisoba sauces; no universal formula or dietary status is implied. [Otafuku product](https://otafukufoods.com/collections/okonomiyaki/products/okonomi-sauce-17-6oz), [GFS Canada recipe wording](https://gfs.ca/fr-ca/idees/recette/okonomiyaki-classique/), [Canadian French retail listing](https://haisue.ca/fr/products/otafuku-okonomi-sauce-500g). |
| `ingredient-ref-gochugaru` | gochugaru / piment coréen gochugaru | None | Named Korean-cuisine dried ground pepper seasoning. Product grind and pepper origin vary; no form or universal origin is asserted. [Québec product page](https://shop.revolutionfermentation.ca/products/piment-coreen-gochugaru-500g), [Korean Food Trade product listing](https://www.k-foodtrade.or.kr/product/m_2/productView.do?catalogId=131653), [Canadian retailer collection](https://haisue.ca/collections/dry-seasonings-spices). |
| `ingredient-ref-zha-cai` | zha cai / zha cai | None | Source-named Chinese preserved mustard-tuber product, kept separate from fresh mustard greens and other preserved mustard products. Supplier presentation variants do not establish catalog forms or measures. [China standard record](https://std.samr.gov.cn/hb/search/stdHBDetailed?id=F34DFEDDA36A044CE05397BE0A0A3FB7), [supplier product page](https://www.marumatsu-mb.co.jp/English/products/en.06Zha_cai.html). |
| `ingredient-ref-yibin-ya-cai` | Yibin ya cai / Yibin ya cai | None | Bounded to the geographically registered product name. No generic `ya cai` alias or potentially misleading “Yibin Bean Sprout” alias was added. [China Ministry of Commerce register](https://ipr.mofcom.gov.cn/hwwq_2/chn_eu_gi/chn/chn-cat-02-1.6.html), [European Commission technical specification](https://ec.europa.eu/geographical-indications-register/eambrosia-public-api/api/v1/attachments/65598). |

The full review, including the complete source-to-claim register and unresolved Section W dispositions, is in [the proposal](../../proposals/wp05-east-asian-condiments-section-w-review-20261011.md). Other held candidates remain open, including generic yellow bean sauce, `tianmianjiang` as a global alias, generic `tare`, Japanese mayonnaise, and broader regional preserves.

## Integration checks

- A live recipe-line audit found no match for these six identities among the 114 bundled recipes / 1,123 ingredient rows. No recipe link, form, default density, unit mapping, measurement, conversion, package yield, or active substitution was added.
- The only new alias is English `okonomiyaki sauce` for `ingredient-ref-okonomi-sauce`.
- All six records have verified identity state and explicitly retain unavailable measurement and substitution behavior. The ledger adds 18 source entries across six records, using 17 distinct source IDs because the Bull-Dog product-list source supports both Japanese sauce identities.
- Package validation, generated-catalog freshness, and research-ledger schema validation passed. The JSON database additions required no tests or emulator run under the rule in `AGENTS.md`.

## Current package snapshot

Counts and hashes cover the shared checkout after integration. Recipe digest hashes each manifest-listed recipe basename, a NUL byte, exact file bytes, and a trailing NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,078 | `e4c0e3cff89aac84631dd845d6c64a234c059f7b3f07e7f2df9a97a158cdfe20` |
| Ingredient forms | 78 | `e80adb0f8d0f7a83c4726f4e60995d924bbd7c4c2324367ac43f69aa5fdf037d` |
| Research ledger | 1,376 records; 4,535 source entries; 3,713 distinct source IDs | `cfd1e9f57e79fd24aa738f0c049dce6592108a56825ab51dd4bbab559835facf` |
| Manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows | `abc542ed162722c03eef640864478f7788196509b0f9620b27c98fcce1c19530` |
| Generated Kotlin index | 1,078 references | `562735bb01590a9d18e4b22145151f8de654cbd59b1b9558b6ecce9f277a0f66` |

The database JSON files are UTF-8 without BOM and keep non-ASCII text escaped. Broader Section W coverage and independent Québec terminology review remain open.
