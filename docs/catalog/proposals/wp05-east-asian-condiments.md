# WP05 Section W — East Asian sauces, pastes, preserves, and seasonings

**Packet type:** proposal only  
**Owner/author:** `/root/wp05_east_asia` (delegated research packet)  
**Reviewer:** pending coordinator review  
**Status:** prepared from web evidence; not accepted or integrated  
**Prepared/access date:** 2026-10-08  
**Scope:** plan checklist Section W only  
**Input revision observed during earlier approved read-only inspection:** commit `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`  
**Input snapshots observed:** bundled ingredient-reference seed SHA-256 `fdcd098c132be936363e8ab03240d4a74f51c956233eda2c842b1194749912b4`; research ledger SHA-256 `73238ffd801031b55bc4f8b26d68e305f9ddce714d596b5533a7f956c22d505d`.

## Acceptance and integration state

This file is an evidence proposal. No canonical seed, Kotlin/code, tests, plan, workflow ledger, or progress record was changed, and no checklist item was integrated or marked complete. The previously observed checkout had pre-existing edits and untracked files; they were not modified. Forms-file and recipe-mention overlap checks could not be completed because a later WSL read was denied. Recheck all candidate keys, forms, aliases, ledger entries, and recipe usage before integration.

## Candidate dispositions and proposed boundaries

Disposition terms below are recommendations for review, not catalog changes. Where the canonical schema supports it, prefer a parent identity with typed style/form records over aliases for meaningful product differences.

| Section W candidate(s) | Proposed identity/form boundary and evidence-based names | Alias or crosswalk disposition |
|---|---|---|
| Soy sauce; light/dark; shoyu; tamari; white soy; double-fermented; Chinese regional soy styles | Keep generic **soy sauce / sauce soya** and **tamari / tamari** separate. Light/dark are distinct styles, not synonyms. Japanese JAS terms usukuchi (light), koikuchi (common), shiro (extra-light/white), and saishikomi (refermented) should be represented as styles/forms if supported. | OQLF supports French spellings **sauce soya**, **sauce de soya**, **sauce soja**, and **sauce de soja**. Do not add `shoyu` as a global alias without a direct term crosswalk. Do not merge region-specific Chinese styles without product/standard evidence. The existing tamari alias `gluten-free tamari` is not established as universal; flag for review rather than applying it to every product. |
| Oyster sauce | Prepared oyster-based condiment, separate from stock and recipes for sauce with oysters. Proposed **oyster sauce / sauce d’huître**. | OQLF term supports the condiment; its page distinguishes it from classical cooked `sauce aux huîtres`. |
| Vegetarian mushroom sauce | The reviewed manufacturer item is a particular **Vegetarian Stir-Fry Sauce**, described as mushroom-flavored. Keep that product/style distinct. | Do not alias to oyster sauce, “vegetarian oyster sauce,” or a generic mushroom sauce. Generic English/French display names need further evidence. |
| Hoisin; plum sauce | Distinct prepared compounds. Proposed **hoisin sauce / sauce hoisin** and **plum sauce / sauce aux prunes**. | OQLF sources support these pairings; keep them separate from black-bean sauce and soy sauce. |
| Sweet bean sauce / tianmianjiang; yellow bean/soybean sauce | Keep sweet bean paste/sauce distinct from yellow soybean paste/sauce. LKK identifies its Sweet Bean Sauce as “Tien Mien Jiang”; constrain that alias to the corresponding product/style pending broader evidence. Yellow Bean Sauce is also called Soy Bean Sauce on an LKK page, but this is product evidence, not proof of universal equivalence. | Do not alias yellow bean sauce to sweet bean sauce. Generic Chinese bean-sauce terms need regional/product review. |
| Doubanjiang; douchi; black-bean sauce | Keep fermented black beans (douchi) as a preserved ingredient distinct from prepared black-bean sauce. OQLF supports **black bean sauce / sauce de soja noir** or **sauce de soya noir** as a distinct prepared condiment. LKK’s Chili Bean Sauce (Toban Djan) is a specific prepared product. | Hold `doubanjiang` ↔ `Toban Djan` / `chili bean sauce` mapping pending direct crosswalk by regional style/product. Do not alias douchi to the sauce. |
| White/red fermented bean curd; sesame paste | Preserve white/red as forms/styles if verified by the accepted evidence standard; distinguish sesame paste from tahini and from whole sesame seeds. | Exact French names, identity granularity, and sesame-paste/tahini mapping remain unresolved; no alias proposed. |
| Chili crisp; chili oil; XO; sha/sa cha; char siu | Chili oil and chili crisp/crisp oil are separate forms/products (oil versus oil with crisp solids); do not alias. XO, Sa Cha, and char siu sauces are distinct prepared compounds. | LKK manufacturer pages support product distinctions and specific ingredient examples, not universal formulations. Hold `sha cha` ↔ `sa cha` spelling equivalence pending direct evidence. Do not map Sa Cha to Southeast Asian satay sauce. |
| Miso styles | Keep general **miso / miso** distinct from the existing white-miso-paste entry. Rice-, barley-, and soybean-koji styles and white/red color styles should be modeled as style dimensions or distinct forms if schema permits. | OQLF supports the generic term *miso*. Do not use white/red or rice/barley as aliases for generic miso. No complete fr-CA style vocabulary proposed. |
| Shio koji; amazake | Separate fermented salt seasoning (shio koji) from sweet koji/rice amazake products; amazake drink and cooking base may need separate forms. | Do not alias shio koji to salt, miso, mirin, or amazake. Exact French displays and drink/base boundaries need product evidence. |
| Ponzu; mentsuyu; shiro dashi; teriyaki/tare; tonkatsu and okonomiyaki sauces | Keep prepared blended sauces/bases distinct from their ingredients and from stocks. Shiro dashi is a concentrated liquid dashi/soy seasoning base and should not be merged with existing Hondashi instant stock. Mentsuyu/tsuyu is a noodle soup base. Treat tonkatsu and okonomiyaki sauces as separate compounds. | Unqualified `ponzu` is ambiguous: plain citrus-plus-vinegar ponzu differs from soy-citrus ponzu sauce. Hold until identity and usage are selected. `Tare` is a broad sauce term; no universal crosswalk proposed. Teriyaki may name a cooking method or prepared sauce; product/context review needed. |
| Japanese mayonnaise | Subtype/form of generic mayonnaise, not an alias for all mayonnaise. | Kewpie’s egg-yolk formulation is product-specific; do not generalize it to all Japanese mayonnaise. Existing generic mayo identity stays unchanged pending review. |
| Yuzu kosho; umeboshi; pickled ginger; regional Japanese preserves | Keep umeboshi distinct from ume fruit. Keep preserved condiment identities distinct by preparation. | MAFF uses `yuzugosho`; hold `yuzu kosho` ↔ `yuzu gosho` spelling alias pending editorial standard. Hold `gari`/red ginger/pickled ginger crosswalks and any broad “pickled condiment” alias. |
| Gochujang; doenjang; ssamjang; chunjang; ganjang; gochugaru | Keep these as separately named products/identities subject to exact current Food Code or bilingual product validation. Gochugaru (dry chili seasoning) must be distinct from gochujang paste. Ssamjang is a compound condiment, not an alias for gochujang or doenjang. | No crosswalk among doenjang, chunjang, ganjang, or generic fermented bean paste proposed. Exact fr-CA displays remain to be verified from authoritative or bilingual evidence. |
| Kimchi types; fermented shrimp; jeotgal | Keep generic kimchi distinct from named varieties (e.g., baechu kimchi, chonggak kimchi) as style/form records, not generic aliases. Keep fermented shrimp/jeotgal distinct from fish sauce and generic shrimp paste. | Specific jeotgal varieties and shrimp-product crosswalks remain unresolved until relevant Food Code clauses/product labels are checked. |
| Chinese preserved mustard greens; zha cai; ya cai; pickled radish; fermented bamboo shoots; other preserves | Treat regional and preparation forms separately. Current standard evidence supports a specific zha cai product category. Fermented bamboo shoots should be distinct from fresh/canned bamboo. | Do not infer `ya cai` aliases for zha cai or generic preserved mustard greens. Hold broad preserved-mustard-green and pickled-radish crosswalks pending region, vegetable, and preparation evidence. Add other regional preserves only with item-specific sources. |
| Distinguish prepared sauce from dry spice/base/seasoning mixture | Preserve form and preparation boundaries: e.g. gochugaru versus gochujang; chili oil versus crisp; douchi versus black-bean sauce; dashi stock versus shiro dashi or Hondashi; soy sauce versus dashi/tsuyu blend. | Do not alias compounds to base ingredients or infer ingredient substitutions from shared flavor/region. |

## Existing catalog/ledger observations from earlier approved read-only inspection

The bundled seed already contained `ingredient-ref-soy-sauce` (English *soy sauce*, French *sauce soya*, French alias *sauce soja*), `ingredient-ref-tamari`, `ingredient-ref-white-miso-paste`, `ingredient-ref-hondashi`, `ingredient-ref-mirin`, and `ingredient-ref-mayo`. The ledger included unreviewed candidate entries for hoisin sauce and generic miso; their current status should be rechecked before any integration. A full scan of ingredient forms and recipe mentions was blocked and is still required. These observations are only a snapshot and must not be treated as a current post-merge status.

## Evidence sources

All sources below were accessed 2026-10-08. Direct URLs are recorded so reviewers can verify definitions and scope.

### Canadian/OQLF terminology

- OQLF, “sauce soya”: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya
- OQLF, “tamari”: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17560426/tamari
- OQLF, “miso”: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351909/miso
- OQLF, “sauce de soja noir” (black bean sauce): https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095402/sauce-de-soja-noir
- OQLF, “sauce d’huître”: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095130/sauce-dhuitre
- OQLF, “sauce hoisin”: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095133/sauce-hoisin
- OQLF, “sauce aux prunes”: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095129/sauce-aux-prunes

### Government, standards, and official producer evidence

- Japanese Soy Sauce Information Center, “Types and how to use them”: https://www.soysauce.or.jp/en/types-and-how-to-use-them
- Japan MAFF, “Soy sauce, miso, other seasonings”: https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/syouyu-miso.html
- Japan MAFF, “Pickled”: https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/tukemono.html
- Japan MAFF, “Yuzu Ponzu”: https://www.maff.go.jp/e/policies/market/dento_syoku/menu/yuzu_ponzu.html
- Japan MAFF, “Yuzu Gosho (Yuzu Citrus Pepper)”: https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/5740/index.html
- Japan MAFF, “Umeboshi”: https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/2705/index.html
- MFDS Korea, current 2026 Food Code notice (Korean): https://www.mfds.go.kr/law/board/boardDetail.do?brdId=data0005&menuKey=27&seq=14983
- MFDS Korea, notice about the English Food Code translation’s status: https://www.mfds.go.kr/eng/brd/m_15/view.do?seq=72437
- China SAMR standards platform, GH/T 1011-2022 榨菜: https://std.samr.gov.cn/hb/search/stdHBDetailed?id=F34DFEDDA36A044CE05397BE0A0A3FB7
- Liuzhou Market Regulation Bureau, sour bamboo shoots: https://scjgj.liuzhou.gov.cn/xwzx/zwdt/202608/t20260812_3783156.shtml
- Lee Kum Kee, product/category evidence:
  - Bean Sauces: https://ca.lkk.com/en/products/saucetype/bean-sauces
  - Sweet Bean Sauce: https://ca.lkk.com/en/products/sweet-bean-sauce
  - Tien Mien Jiang product: https://usa.lkk.com/en/industrial/products/sweet-bean-sauce-tien-mien-jiang
  - Yellow Bean/Soy Bean Sauce (UK): https://uk.lkk.com/products/soy-bean-sauce
  - Chili Bean Sauce (Toban Djan): https://ca.lkk.com/en/products/chili-bean-sauce-toban-djan-2
  - Black Bean Garlic Sauce: https://ca.lkk.com/en/products/black-bean-garlic-sauce
  - Vegetarian Stir-Fry Sauce: https://ca.lkk.com/en/products/vegetarian-stir-fry-sauce
  - Chili oils/crisp: https://ca.lkk.com/en/products/saucetype/chili-oil
  - XO Sauce: https://ca.lkk.com/en/products/xo-sauce
  - Sa Cha Sauce: https://ca.lkk.com/en/products/sa-cha-sauce
  - Char Siu Sauce: https://ca.lkk.com/en/products/char-siu-sauce---chinese-barbecue-sauce
- Kojiya Japan, product guide: https://kojiya.jp/english/products/index.html
- Kikkoman, ponzu glossary: https://www.kikkoman.com/en/cookbook/glossary/ponzu.html
- Yamaki USA, Kappo Shirodashi: https://yamakiusa.com/products/yamaki-all-in-one-bonito-dashi-base-kappo-shirodashi-500-ml-16-9-fl-oz
- Kikkoman, zaru soba and tsuyu recipe context: https://www.kikkoman.com/en/cookbook/washoku/zarusoba.html
- Kewpie, mayonnaise: https://www.kewpie.com/en/products/mayonnaise/
- Bibigo, product lineup: https://www.bibigo.com/kr/en/products
- Korea MAFRA, kimchi awards and variety names: https://www.mafra.go.kr/bbs/english/25/578657/artclView.do

## Measurement and substitution proposals

**Unavailable for all Section W candidates in this packet.** No source reviewed establishes a supported exact-form density or unit conversion for the candidate products. Brand formulations and physical forms vary. No substitution ratio was proposed: a source-backed substitution would need to specify the exact product/form and recipe context. Do not use category averages or infer interchangeability from shared saltiness, fermentation, heat, or cuisine.

## Required checks before integration

1. Re-open the current canonical seed, ingredient forms, proposal/ledger state, and relevant recipe mentions; confirm no parallel worker has added overlapping records.
2. Validate preferred EN and fr-CA names and aliases against current OQLF/official evidence and the project’s normalization/locale rules.
3. Confirm identity versus form boundaries in the actual schema; use stable candidate IDs only after duplicate/form/recipe-use review.
4. If records are later integrated, run the repository’s relevant catalog schema/validation and seed-generation consistency checks, then record actual results in the canonical progress tracking.
5. Resolve the listed Food Code, regional preserve, French terminology, and product crosswalk gaps before claiming acceptance.
