# WP05 Section W proposal — saishikomi soy sauce

**Packet type:** proposal-only identity, naming, and evidence-scope review  
**Prepared/source access date:** 2026-10-09  
**Scope:** Japanese saishikomi shoyu (refermented / twice-brewed soy sauce); whether the accepted generic, tamari, Chinese-style light/dark, or Japanese white-shoyu identities can represent it; bilingual display candidates and source-scoped measurements/substitutions.  
**Checklist state:** keep Section W open. This packet covers one Japanese soy-sauce style only.

## Recommendation

1. **Add one separate identity for Japanese saishikomi shoyu.** JAS 1703 lists saishikomi as a named soy-sauce type and defines it by using finished pressed soy sauce (`kiage`) instead of salt water in the moromi. The Japanese Soy Sauce Information Center calls the style “refermented”; the Japanese food-composition table uses “Saishikomi-shoyu (refermented soy sauce).” This is a stable product/process identity, not a synonym for any soy sauce that has undergone more than one fermentation stage. [S01, S03, S07]
2. **Keep the identity separate from all five accepted rows.** Generic soy sauce remains the result for an unqualified request and retains `shoyu` as its broad English alias. Tamari has a different JAS ingredient/process definition. The current light and dark rows are documented as Chinese-style. White soy sauce is Japanese shiro shoyu, a separately named JAS type. JAS lists these types independently; none is a substitute identity for saishikomi. [S01, S02, S03]
3. **Proposed English display:** `saishikomi soy sauce`. Narrow English aliases: `saishikomi shoyu`, `refermented soy sauce`, and `twice-brewed soy sauce`. The first two are supported by the Japanese Soy Sauce Information Center and Japan’s food-composition table; the last is a direct synonym in a Canadian retailer’s style guide and a Canadian retail product is titled “Double Brewed” and explicitly identified as saishikomi. Do not add unqualified `shoyu`, `soy sauce`, `double-fermented soy sauce`, or `double-brewed soy sauce`; the first two are family terms and the latter two are less consistently tied to the specific Japanese style in the sources reviewed. [S03, S06, S07, S09]
4. **Provisional fr-CA display:** `sauce soya refermentée (saishikomi)`. The Japanese Soy Sauce Information Center’s French page calls it `sauce de soja refermentée`; OQLF supports `sauce soya` / `sauce de soya` as Québec terms for the generic family. Combining the Québec base term with the directly attested style descriptor and retaining the Japanese name is a transparent candidate, not a Québec-validated term. No OQLF entry or Québec product page using this exact style phrase was located. Do not add a French alias until a Québec terminology review confirms one. [S04, S05]
5. **No preparation form, default measurement, density, conversion, or global substitute is supported.** The 17 live forms do not model soy-sauce styles. The Japanese food-composition table reports composition per 100 g edible portion, not a culinary spoon/cup mass or density. One recipe gives `1/2 cup (120 ml)` as an explicit choice among koikuchi, tamari, and saishikomi for its teriyaki sauce; that amount and option remain attached to that recipe alone. No RecipeBook line names saishikomi. [S07, S08]

## Proposal-time snapshot

Hashes are SHA-256 of exact file bytes. The recipe-corpus digest is SHA-256 over manifest-listed recipe basenames sorted lexically, then each basename, a NUL byte, exact recipe-file bytes, and a trailing NUL byte. The recipe manifest itself is hashed separately.

| Input | Count at audit | SHA-256 |
|---|---:|---|
| Canonical ingredient references | 456 | `94c76bcee57ffb4759eee5ff0d5778b6a530d5d362cd8a6a66edfa3633463296` |
| Canonical ingredient forms | 17 | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| Research ledger | 623 records / 831 source entries | `61c8b5bda4dbb10eecda7e7aad842382903a8e7174e929e5a500584b97f382e5` |
| Legacy-import candidates | 99 | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Recipe manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194` |

There were 39 existing proposal files when source-ID reservations were checked. The live catalog rows relevant to this review were:

| ID | EN display | fr-CA display | Relevant aliases and numeric data |
|---|---|---|---|
| `ingredient-ref-soy-sauce` | `soy sauce` | `sauce soya` | FR alias `sauce soja`; EN alias `shoyu`; density null; no unit mappings. |
| `ingredient-ref-tamari` | `tamari` | `tamari` | No aliases; density null; no unit mappings. |
| `ingredient-ref-light-soy-sauce` | `light soy sauce` | `sauce soya claire` | No aliases; density null; no unit mappings; current research identifies this as Chinese-style, not Japanese usukuchi. |
| `ingredient-ref-dark-soy-sauce` | `dark soy sauce` | `sauce soya foncée` | No aliases; density null; no unit mappings; current research identifies this as Chinese-style. |
| `ingredient-ref-white-soy-sauce` | `white soy sauce` | `sauce soya extra-claire (shiro shoyu)` | EN alias `shiro shoyu`; density null; no unit mappings; Japanese shiro style. |

The forms seed has no soy-sauce style/preparation form. The ledger has no saishikomi identity record. The relevant generic, tamari, light, dark, and white records are present and their accepted scope is consistent with the references above.

## Normalized-key, candidate, and ID collision audit

Candidate terms were normalized with `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` (case-folding, Unicode NFKD/accent folding, punctuation-to-space, then trim). The audit scanned all 456 bilingual reference names and aliases, all 17 form records and their text fields, and all 99 legacy candidates and their text fields.

| Candidate term | Normalized key | Exact owner in refs/forms/legacy | Disposition |
|---|---|---|---|
| `saishikomi soy sauce` | `saishikomi soy sauce` | None | Proposed EN display. Generic `soy sauce` is only a contained family phrase. |
| `saishikomi shoyu` | `saishikomi shoyu` | None | Proposed narrow EN alias. Generic `shoyu` is a contained family alias, not an exact collision. |
| `refermented soy sauce` | `refermented soy sauce` | None | Proposed EN alias, scoped to sources that identify the Japanese saishikomi style. |
| `twice-brewed soy sauce` | `twice brewed soy sauce` | None | Proposed EN alias based on the direct Canadian crosswalk to saishikomi. |
| `double-fermented soy sauce` / `double-brewed soy sauce` | `double fermented soy sauce` / `double brewed soy sauce` | None | Not activated; these broader descriptors are less consistently tied to this named JAS type. |
| `sauce soya refermentée (saishikomi)` | `sauce soya refermentee saishikomi` | None | Provisional fr-CA display candidate only; no Québec source validates the complete phrase. |
| `sauce de soja refermentée` | `sauce de soja refermentee` | None | Direct French wording at the Japanese industry center, but not selected as fr-CA display because OQLF says `sauce soya` / `sauce de soya` are usual in Québec. |
| `sauce soya saishikomi` | `sauce soya saishikomi` | None | Qualified Japanese-style wording; not added as a second French alias pending Québec review. |
| `sauce soya` / `soy sauce` | `sauce soya` / `soy sauce` | `ingredient-ref-soy-sauce` | Keep family names on generic row; do not add to saishikomi. |
| `shoyu` | `shoyu` | EN alias on `ingredient-ref-soy-sauce` | Keep as generic Japanese family alias; do not add unqualified alias to style row. |
| `sauce soya claire` / `light soy sauce` | respective keys | `ingredient-ref-light-soy-sauce` | Chinese-style light row; not usukuchi or saishikomi. |
| `sauce soya foncée` / `dark soy sauce` | respective keys | `ingredient-ref-dark-soy-sauce` | Chinese-style dark row; not saishikomi. |
| `white soy sauce` / `shiro shoyu` | respective keys | `ingredient-ref-white-soy-sauce` | Existing Japanese shiro row; distinct named style. |
| `tamari` | `tamari` | `ingredient-ref-tamari` | Existing distinct identity. |
| `koikuchi` / `usukuchi` | respective keys | None | Separate Japanese styles; no alias proposed. |

No exact normalized-key collision was found for the proposed EN display, the three proposed EN aliases, or the provisional FR candidate across references, forms, or legacy candidates. `ingredient-ref-saishikomi-soy-sauce` is absent from live reference IDs, ledger record IDs, and legacy IDs. A broad search for `soy sauce`, `sauce soya`, or `shoyu` may return both family and style records; the qualified saishikomi names distinguish the identity.

## Recipe-line audit

All 114 manifest-listed recipe JSON files and all 1,123 `ingredients[]` rows were scanned, including whole-file recipe text, for `saishikomi`, `saishikomi shoyu`, `refermented`, `twice-brewed`, `double-fermented`, `double-brewed`, and the French candidates. **No saishikomi-specific row or recipe-text mention was found.** Three lines refer to generic soy sauce:

| Recipe | Ingredient line | Current link | Disposition |
|---|---|---|---|
| 066, Korean Soy-Marinated Jammy Eggs | `1 cup soy sauce or tamari` | `ingredient-ref-soy-sauce` | Keep as entered; the line names generic soy sauce and tamari, not saishikomi. |
| 085, Maple Chicken | `2 1/2 tbsp soy sauce` | `ingredient-ref-soy-sauce` | Keep generic. |
| 095, Satay | `1 tbsp soy sauce` | `ingredient-ref-soy-sauce` | Keep generic. |

No bundled recipe line needs relinking.

## Measurements and substitutions — separate evidence states

- **Measurement state: no supported default value.** MEXT food number 17010 is specifically `Saishikomi-shoyu (refermented soy sauce)` and presents nutrient values per 100 g edible portion. That basis is not a household spoon/cup measure, product density, or mass-per-volume conversion. JAS quality tests and concentrations are manufacturing/quality criteria, not recipe measurement factors. No reliable exact-style default g/mL, density, package yield, or household-measure mass was found. [S01, S07]
- **Recipe-local quantity:** Serious Eats lists `1/2 cup (120 ml) Koikuchi shoyu, tamari, or saishikomi shoyu` for its grilled cauliflower teriyaki sauce. Its accompanying note says saishikomi is the darkest, richest, most umami option and gives the sauce the greatest depth. This records one recipe’s explicit choice and listed amount only; it is not a global conversion or proof of identical flavor/result. [S08]
- **Substitution state: no global rule.** The Serious Eats OR-list supports an option among those named products in that recipe only. It does not support a general directed saishikomi-to-generic-soy or saishikomi-to-tamari substitution. No RecipeBook saishikomi line exists to relink or preserve as a contextual rule. Keep any future source-specific recipe alternative attached to that recipe and its exact amount/context. [S08]

## Proposed record treatment

| Field | Proposal |
|---|---|
| Stable identity | Japanese saishikomi shoyu / refermented soy-sauce style, bounded by the JAS process definition. |
| Suggested ID | `ingredient-ref-saishikomi-soy-sauce` |
| Category | `SAUCE_AND_CONDIMENT` |
| English display | `saishikomi soy sauce` |
| English aliases | `saishikomi shoyu`; `refermented soy sauce`; `twice-brewed soy sauce` |
| fr-CA display candidate | `sauce soya refermentée (saishikomi)` — provisional pending Québec terminology review. |
| French aliases | None proposed. |
| Forms / density / unit mappings / default measures | None proposed. |
| Conversions / package yields / substitutions | None activated; preserve the Serious Eats option as source-local evidence only. |
| Recipe relinking | None. |

The Canadian product page’s title and description call one item “Double Brewed Sashimi Soy Sauce (Saishikomi Shoyu).” That supports the English double-brewed crosswalk for that item; it does not support a broad `double-brewed` alias for every product or a culinary equivalence with other soy sauces. The Canadian JapaneseTaste article explicitly calls saishikomi “twice-brewed soy sauce.” The qualified style name remains the strongest identity search term. [S06, S09]

## Sources and unique proposed source IDs

The namespace `WP05-W-SAISHIKOMI-20261009-S01` through `WP05-W-SAISHIKOMI-20261009-S09` was checked against all 831 ledger source entries (726 distinct ledger source-ID strings) and the source-ID text in all 39 existing proposal files. No exact collision was found. These IDs are reserved only in this proposal and are not yet ledger entries.

| Proposed source ID | Source and claim supported | Source-to-claim limits |
|---|---|---|
| `WP05-W-SAISHIKOMI-20261009-S01` | Ministry of Agriculture, Forestry and Fisheries, [Japanese Agricultural Standard JAS 1703:2021, Soy Sauce (Shoyu)](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-470.pdf), scope §1 and definitions §§3.8–3.13, especially §3.12. Names five Japanese types and defines saishikomi by using pressed finished soy sauce (`kiage`) in place of salt water in the mash. | Primary Japanese product standard for identity/process. It does not define Québec French wording, a household measure, or a general substitution. The quality-test values are not culinary conversion data. |
| `WP05-W-SAISHIKOMI-20261009-S02` | MAFF, [Soy sauce, miso, other seasonings — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/syouyu-miso.html), soy-sauce section and style table. Lists the five styles and states that saishikomi uses kiage instead of salt water; describes its regional production and table/sushi/sashimi uses. | Official overview; the use cases do not imply interchangeability, a recipe measure, or a Québec term. |
| `WP05-W-SAISHIKOMI-20261009-S03` | Japanese Soy Sauce Information Center, [Types and how to use them (English)](https://www.soysauce.or.jp/en/types-and-how-to-use-them), “Saishikomi Shoyu (Refermented).” Describes brewing with soy sauce rather than brine and names sashimi/sushi/table uses. | Industry-center terminology and product description; not a legal English naming standard or a Québec authority. |
| `WP05-W-SAISHIKOMI-20261009-S04` | Japanese Soy Sauce Information Center, [About Soy Sauce — Français](https://www.soysauce.or.jp/fr), “Saishikomi shoyu (sauce de soja refermentée).” Direct French style wording and description. | French translation from a Japanese industry organization, not fr-CA/OQLF terminology. It does not validate the adapted Québec candidate `sauce soya refermentée`. |
| `WP05-W-SAISHIKOMI-20261009-S05` | Office québécois de la langue française, [sauce soya (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya). Supports the generic French terms and says Québec uses `sauce soya` or `sauce de soya`; notes clear and dark styles. | Supports only the Québec family term and existing light/dark wording. It does not mention saishikomi or endorse the proposed compound label. |
| `WP05-W-SAISHIKOMI-20261009-S06` | Fukuya Foods Canada, [Suehiro Double Brewed Sashimi Soy Sauce](https://fukuya.ca/products/suehiro-double-brewed-sashimi-soy-sauce), product title and description. Explicitly identifies its double-brewed product as `Saishikomi Shoyu` and describes finished soy sauce replacing saltwater in the second fermentation. | Canadian retailer listing for one product; useful retail crosswalk, not a Québec French source, universal product guarantee, or measure. Listed 150 mL package size is not a recipe yield. |
| `WP05-W-SAISHIKOMI-20261009-S07` | Ministry of Education, Culture, Sports, Science and Technology, [Standard Tables of Food Composition in Japan 2023, food no. 17010](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=17_17010_7), `Saishikomi-shoyu (refermented soy sauce)`. Nutrient table uses the edible 100 g basis. | Official food-composition entry and English crosswalk; it supports composition at the stated basis, not product density, spoon/cup conversion, or all commercial brands. |
| `WP05-W-SAISHIKOMI-20261009-S08` | Serious Eats, [Grilled Whole Cauliflower with Teriyaki Sauce](https://www.seriouseats.com/grilled-whole-cauliflower-with-teriyaki-sauce-recipe-8678549), ingredient list and notes. Lists `1/2 cup (120 ml)` of koikuchi shoyu, tamari, or saishikomi shoyu and describes the richer result when choosing saishikomi. | One named recipe’s OR-choice and quantity only. Not a general substitution, conversion, density, or proof that the options produce the same result. |
| `WP05-W-SAISHIKOMI-20261009-S09` | JapaneseTaste.ca, [Saishikomi Shoyu — A Guide to Japan’s Most Luxurious Type of Soy Sauce](https://japanesetaste.ca/blogs/japanese-taste-blog/saishikomi-shoyu-a-guide-to-japan-s-most-luxurious-type-of-soy-sauce), heading/definition section. Explicitly uses `saishikomi shoyu or twice-brewed soy sauce` and distinguishes it from koikuchi and tamari. | Canadian retailer/educational article, not a product standard or Québec French authority. Supports a narrow English style alias, not universal equivalence or measurement values. |

## Review disposition

**Recommend:** one separate `ingredient-ref-saishikomi-soy-sauce` identity; EN display `saishikomi soy sauce` with the three qualified aliases listed above; provisional fr-CA `sauce soya refermentée (saishikomi)` with no separate French aliases; no form, default measure, density, conversion, package yield, global substitute, or recipe relink.

**Keep open:** Section W is not complete. Obtain Québec terminology disposition for the French compound before treating it as canonical; review remaining Japanese and Chinese styles separately. Any “twice-brewed” or “double-fermented” product should be assigned to this identity only when the source/product itself ties the name to saishikomi or its defining process.

At proposal creation, this packet made no canonical catalog, ledger, recipe, plan, checklist, workflow, roadmap, code, or test changes.

## Coordinator integration note — 2026-10-09

Integrated `ingredient-ref-saishikomi-soy-sauce` with the proposed EN display and qualified aliases, provisional fr-CA display, `SAUCE_AND_CONDIMENT` category, and no active density or unit mappings. Added the nine proposal sources and the source-local recipe amount/substitution limitation to the research ledger. No bundled RecipeBook recipe was relinked, and no global conversion or substitution was activated. Section W and independent Québec terminology review remain open.
