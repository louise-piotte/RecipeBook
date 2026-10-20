# WP04 Section P — Tobiko, masago, and fish-roe boundaries

- **Packet type:** proposal-only identity research.
- **Research date:** 2026-10-09.
- **Scope:** Japanese culinary names `tobiko` and `masago`; product boundaries from generic fish roe, salmon roe/ikura, caviar, bottarga/poutargue/karasumi, and sea-urchin roe/uni.
- **Status:** proposal only. No canonical catalog, ledger, recipe, workflow, checklist, roadmap, code, or test was changed. Keep the broad Section P plan item open.
- **Snapshot:** 456 active references, 17 forms, 623 ledger records / 831 source entries, 99 legacy candidates, and 114 recipes / 1,123 ingredient rows. Exact hashes and audit method appear below.
- **Source-ID audit:** `WP04-ROE-S01` through `WP04-ROE-S14` were checked against the live ledger and proposal/batch files before use; no collision was found. The CFIA source already recorded in the live ledger is reused as `WP04-DOYS-S04` rather than assigned a duplicate ID.

## Coordinator recommendation

When a recipe needs either named product, represent **tobiko** and **masago** as two distinct `PROTEIN` ingredient identities. Their fish-source names are different in Japanese and Canadian sources, and the Quebec/Canadian fishery source specifically calls capelin eggs `masago` [S01–S04]. Do not create a generic fish-roe alias to either identity or map one to the other.

Use these bilingual display candidates:

| Candidate | EN display | fr-CA display | Supported search wording | Status and limits |
|---|---|---|---|---|
| Tobiko | `tobiko (flying fish roe)` | `tobiko (œufs de poisson volant)` | EN: `tobiko`, `flying fish roe`; FR: `œufs de poisson volant` | `Tobiko` is the Japanese culinary name for flying-fish eggs in the MAFF and local Canadian product sources [S04, S10]. The Quebec French phrase is directly attested by a Canadian retailer [S10]. Do not assign a flying-fish species or imply every packaged tobiko product contains only flying-fish roe. |
| Masago | `masago (capelin roe)` | `masago (œufs de capelan)` | EN: `masago`, `capelin roe`; FR: `œufs de capelan` | Canadian seafood/fishery sources link capelin eggs to `masago`; OQLF normalizes the Québec fish name as `capelan` [S01–S03]. Product ingredient statements vary; do not imply every seasoned masago product is pure capelin roe [S08]. |

The proposed descriptive aliases are for recipes that name the roe itself. A product’s actual ingredient statement takes precedence: Azuma Foods Canada lists several seasoned Tobikko products containing both flying-fish and herring roe, and its Masago products containing capelin and herring roe; individual recipes differ [S08–S09]. Thus, these are culinary product identities with source-specific compositions, not claims that every product is a single-species, unseasoned roe. No universal recipe, species, salt level, seasoning, dye, processing, or package specification is established.

`Tobikko` appears on a Canadian manufacturer’s brand and product labels [S08–S09]. Record it in evidence as a market spelling/brand form, but do not add it as a global alias from this evidence alone. A Japanese-script spelling such as `とびこ` is recorded as regional terminology below, not proposed as a searchable alias: the app normalizer produces an empty key for Japanese script.

No current recipe uses either product. These proposals should be integrated only if a recipe/product need is confirmed; no new active record is required merely to check off the broad plan item.

## Product boundaries and dispositions

| Term or neighboring product | Disposition | Evidence and limit |
|---|---|---|
| Generic `fish roe`, `fish eggs`, or `roe` | Keep unresolved as generic wording; no alias to tobiko or masago | These broad phrases do not identify the source fish or product. The CFIA common-name guidance asks for a generally known name or a non-generic name describing the fish product when no standardized name applies [existing `WP04-DOYS-S04`]. A future recipe saying only `roe` needs source-context review. |
| Flying-fish roe / tobiko | Distinct from capelin roe / masago | MAFF lists Japanese `とびこ` separately and identifies the source as flying fish; the current Canadian product label also names tobiko/flying-fish roe [S04, S08, S10]. MAFF’s regional terminology includes `ago no ko` for flying-fish roe used in a distinct Shimane braised dish. Do not equate that regional roe-piece preparation with seasoned sushi-style tobiko [S12]. |
| Capelin roe / masago | Distinct from flying-fish roe / tobiko | Canadian fishery sources identify capelin eggs as masago [S02–S03]. OQLF gives `capelan` as the normalized Québec fish name and identifies *Mallotus villosus* [S01]. This evidence supports the product-level capelin boundary, not a claim about the species composition of every branded product. |
| Local `œufs d’éperlan` wording for masago | Do not add as an alias on this evidence | One Québec sushi menu calls masago `œufs d’éperlan` [S13]. OQLF identifies `éperlan` as rainbow smelt (*Osmerus mordax*), while OQLF and Canadian fishery sources identify capelin separately [S01–S03, S07]. The menu wording is evidence of local usage, not enough to establish that masago and Québec smelt roe are the same ingredient. |
| Salmon roe / `ikura` | Separate roe product; no alias to either identity | MAFF distinguishes salmon eggs/`いくら・筋子` from flying-fish eggs/`とびこ` and capelin eggs. The live catalog has salmon fillets but no salmon-roe identity [S04]. |
| Caviar | Do not use bare `caviar` as an alias | `Caviar` is used as a product-category heading and in species-qualified commercial product names, including some Tobikko and Masago labels [S08–S09]. It is not a safe identity synonym. CFIA says fish-product common names should describe the food and not be generic where a standardized name does not apply [existing `WP04-DOYS-S04`]. Separately, U.S. FDA guidance reserves unqualified `caviar` for salted sturgeon roe and says other fish roe should be species-qualified; that is U.S. guidance, not a Canadian naming rule [S11]. |
| Bottarga / Québec `poutargue`; Japanese `karasumi` | Keep distinct from loose tobiko/masago roe | OQLF defines `poutargue` as roe that is lightly salted, heavily pressed, then dried, with English `bottarga` [S06]. MAFF describes karasumi as salted-and-dried mullet roe [S05]. Shared fish-roe origin does not make these processed products aliases for tobiko or masago; this packet does not decide whether all bottarga/karasumi traditions are identical. |
| Sea-urchin roe / `uni` | Distinct non-fish product boundary | Fisheries and Oceans Canada explains that the edible portion is commonly called roe but is technically gonads, including male and female gonads [S12]. This is not fish roe and must not alias to tobiko, masago, salmon roe, or caviar. Broader non-fish roe remains outside this packet. |
| Whole flying fish or whole capelin | Not an alias or form of the roe identities | Whole fish and their roe are distinct recipe products. This packet assigns no whole-fish identity, species mapping, or form conversion. |
| Colors, seasonings, blends, and brand variants | Retain as product-specific details, not universal forms | Azuma’s ingredient declarations vary between Tobikko SKUs and between Masago SKUs; the Gold Tobikko label explicitly lists flying-fish and herring caviar, and some Masago listings list capelin and herring caviar [S08–S09]. The evidence does not establish universal compositions or recipe-equivalent forms. |

## Measurement evidence — separately assessed

The 114-recipe ingredient audit found no tobiko, masago, generic fish-roe, salmon-roe, caviar, bottarga/poutargue/karasumi, or uni ingredient rows. Therefore, this corpus supplies no recipe amount to preserve for either candidate.

MAFF’s regional `Agono ko umani` recipe uses eight pieces of flying-fish roe in a four-serving braised dish [S12]. It is a source-specific amount for a distinct regional preparation, not a measure for seasoned tobiko granules and not an amount for masago. Azuma’s catalogue gives product package weights for named frozen SKUs, and the La Mer Tobiko listing is a 500 g retail product [S08, S10]; those package declarations do not establish a kitchen measure or general product yield.

Searches for authoritative product-specific spoon/cup weights, density, mass-volume conversions, package yields, or tobiko/masago cooking conversions found no evidence suitable for a global mapping. Keep density, unit mappings, count weights, conversions, forms, package yields, and rehydration data unset. Any package amount retained later must stay attached to its named product/SKU.

## Substitution evidence — separately assessed

Targeted searches of Canadian fishery/terminology sources, MAFF regional food sources, and Azuma Foods Canada product material found no tested general substitution rule between tobiko and masago, or between either roe and salmon roe/ikura, caviar, bottarga, or sea-urchin roe. Some general cooking pages discuss swapping these products, but they are not primary/authoritative evidence and the products differ in source and commercial formulation. No directed or contextual substitution, warning, conversion, or equivalence is proposed.

## Live snapshot and audit

Snapshot was re-read from the live files on 2026-10-09. File hashes are SHA-256 of exact bytes. The ordered recipe digest hashes each manifest-listed recipe basename in lexical order, followed by NUL, exact recipe-file bytes, then NUL.

| Artifact | Live count | SHA-256 / digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 456 active references | `94c76bcee57ffb4759eee5ff0d5778b6a530d5d362cd8a6a66edfa3633463296` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 17 forms | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `docs/catalog/legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `docs/catalog/research-ledger.v1.json` | 623 records / 831 source entries / 726 distinct source IDs | `61c8b5bda4dbb10eecda7e7aad842382903a8e7174e929e5a500584b97f382e5` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194` |

The normalized-key scan mirrored `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase and NFKD, fold `œ`/`æ`/`ß`, remove combining marks, expand `&` to `and`, replace other non-ASCII alphanumeric characters with spaces, and collapse whitespace. It compared English/French reference names and aliases, form labels and match terms, and all legacy names and aliases.

- **No exact normalized collisions** were found for the proposed names/aliases `tobiko`, `flying fish roe`, `œufs de poisson volant`, `masago`, `capelin roe`, or `œufs de capelan` in active references, forms, or legacy candidates. The spelling `tobikko` was also checked and has no exact match. No related active roe, caviar, bottarga, masago, tobiko, or uni record exists. The only nearby active records found were `ingredient-ref-salmon-fillets-without-skin` and the separately integrated `ingredient-ref-dried-bonito`; neither matches a proposed key or roe boundary.
- Neighboring and excluded keys checked included `fish roe`, `fish eggs`, `roe`, `ikura`, `salmon roe`, `œufs de saumon`, `caviar`, `sturgeon caviar`, `caviar d’esturgeon`, `bottarga`, `poutargue`, `karasumi`, `uni`, `sea urchin roe`, `œufs d’éperlan`, and `smelt roe`. No exact active-reference/form/legacy key was found for these roe terms.
- No active roe form exists among the 17 forms. No legacy candidate exactly matches the proposed or boundary terms.
- The recipe audit checked both `originalText` and `ingredientName` on every one of the 1,123 manifest-listed ingredient rows, including romanized and French/English search terms above and the Japanese source spellings `とびこ`, `トビウオ`, `いくら`, `からすみ`, and `キャビア`. It found **zero matching roe rows**. No quantity or substitution is therefore attached to a bundled recipe.
- Exact source URL review found the CFIA fish-labelling page already recorded as `WP04-DOYS-S04`; this packet reuses that existing source ID. The new `WP04-ROE-S01`–`S14` IDs were absent from the 726 live source IDs and all current proposal/batch files before assignment. No new source ID is assigned to the already-ledgered CFIA source.
- No existing proposal or batch sets a tobiko/masago/ikura/bottarga/uni identity or alias disposition. Existing dried-seafood and katsuobushi packets remain product-boundary references only.

## Source search log

Searches and source accesses were performed on 2026-10-09. Search strings below are representative.

| Topic | Representative searches | Result and limits |
|---|---|---|
| Canadian fish naming and Québec French | `site:inspection.canada.ca fish product common name caviar roe`; `site:vitrinelinguistique.oqlf.gouv.qc.ca capelan œufs`; `site:vitrinelinguistique.oqlf.gouv.qc.ca éperlan`; `tobiko œufs de poisson volant Québec`; `masago œufs de capelan Québec` | Reused CFIA common-name requirements; OQLF confirms `capelan` and distinguishes it from `éperlan`. Canadian seafood and Québec sushi/product pages support local product wording. No OQLF entry for the compound culinary terms `tobiko` or `masago` was found in targeted searches. |
| Japanese original terminology and food culture | `site:maff.go.jp とびこ トビウオ 魚卵`; `site:maff.go.jp flying fish roe tobiko`; `site:maff.go.jp karasumi salted dried mullet roe` | MAFF’s original Japanese text distinguishes `とびこ`, `いくら・筋子`, `からすみ`, and `キャビア` and maps the tobiko item to flying fish. A separate regional MAFF page documents Shimane `ago no ko` in a braised whole-roe dish. These sources do not establish a universal processing specification or species for packaged tobiko. |
| Manufacturer/product-label composition | `site:azumafoods.ca Tobikko Masago capelin herring`; `Azuma Foods Canada Tobikko Gold ingredients`; `Tobiko œufs de poisson volant Québec product` | Azuma Canada’s catalog and Tobikko Gold page show distinct named products and varying ingredient statements, including product-specific herring roe. A Canadian French retailer directly uses `tobiko` and `œufs de poisson volant`. Brand/SKU composition is not generalized. |
| Neighboring roe products | `site:oqlf.gouv.qc.ca poutargue bottarga`; `MAFF karasumi salted dried roe`; `DFO sea urchin roe gonads`; `FDA caviar use term labeling`; `OQLF capelan éperlan Mallotus villosus Osmerus mordax` | OQLF/MAFF distinguish processed poutargue/karasumi; DFO says sea-urchin “roe” is gonads; FDA supplies a U.S.-specific caviar-labeling policy; OQLF fish terms distinguish capelin from rainbow smelt. No equivalence is inferred across these products. |
| Measurement and substitution | `tobiko masago density grams cup teaspoon`; `site:maff.go.jp tobiko masago substitute`; `tobiko masago substitution`; `flying fish roe recipe measure`; `masago package weight conversion` | No source-qualified mass/volume mapping, general package yield, or validated substitution was found. A MAFF regional dish quantity is for a different whole-roe preparation; manufacturer package sizes are SKU facts only. General consumer cooking pages surfaced but were not used as authority for a global rule. |

## Source-to-claim map

New IDs were assigned only after checking the live ledger and proposals/batches. All new sources were accessed on 2026-10-09.

| ID | Source | Evidence used and limits |
|---|---|---|
| **WP04-ROE-S01** | OQLF GDT, [capelan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan) | Normalizes Québec fish name `capelan`, pairs it with English `capelin`, and lists *Mallotus villosus*. This names the fish and supports the French descriptor; it is not a universal masago product specification. |
| **WP04-ROE-S02** | Seafood from Canada, [Capelan](https://seafoodfromcanada.ca/fr/seafood/capelan/) | Names the species *Mallotus villosus* and says its eggs (`masago`) are used in sushi. Supports the Canadian capelin/masago link and local French fish term; does not establish ingredients of every processed product. |
| **WP04-ROE-S03** | Exploramer, Fourchette bleue, [Capelan](https://fourchettebleue.ca/produits/capelan/) | Says capelin eggs are called masago in Asian cuisine and accompany sushi; separately describes capelin consumed salted/dried, fried, pickled, or smoked. Supports local food usage and distinct roe-versus-fish boundaries, not a processing formula. |
| **WP04-ROE-S04** | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), [19年1月号 文字情報 — 特集2 魚卵アクアリウム](https://www.maff.go.jp/j/pr/aff/1901/characterinformation.html) | Original Japanese culinary terminology lists `とびこ` among fish-roe products and identifies flying fish as its source; separately identifies salmon `いくら・筋子`, sturgeon `キャビア`, and mullet `からすみ`. Supports separate identities and regional vocabulary, not a universal commercial recipe or all-species declaration. |
| **WP04-ROE-S05** | MAFF, [Dried foods — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kanbutu.html) | Describes karasumi as salt-cured and dried mullet roe and distinguishes it within a broader taxonomy of dried seafood. Supports boundary from loose tobiko/masago, not an equivalence between all national bottarga traditions. |
| **WP04-ROE-S06** | OQLF GDT, [poutargue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428124/poutargue) | Defines poutargue as roe of mullet, tuna, or other species, lightly salted, heavily pressed, then dried; gives English `bottarga`. Supports distinct processed-product boundary and Québec French term. |
| **WP04-ROE-S07** | OQLF GDT, [éperlan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198849/eperlan) | Gives normalized Québec fish name `éperlan`, English rainbow smelt, and Latin *Osmerus mordax*. Used to avoid adopting a single local menu’s “masago = œufs d’éperlan” wording as an alias. |
| **WP04-ROE-S08** | Azuma Foods (Canada) Co., Ltd., [Product Catalogue 2022](https://azumafoods.ca/wp-content/uploads/2022/07/Azuma-Foods-Canada-Product-Catalogue-2022.pdf) | Names Tobikko and Masago product families and documents per-SKU ingredients. Some tobikko products list flying-fish and herring roe; multiple masago products list capelin and herring roe, while one lists capelin roe plus soy protein and seasonings. These are product-specific declarations, not universal formulas. |
| **WP04-ROE-S09** | Azuma Foods (Canada) Co., Ltd., [Tobikko Gold](https://azumafoods.ca/products/tobikko-gold/) | Gives English product name `Tobikko Gold`, French descriptor “caviar assaisonné d'exocet et de hareng,” and ingredient statement naming both flying fish and herring caviar. Supports product-specific mixture and direct Canadian French product wording; `exocet` is not proposed as an all-products alias. |
| **WP04-ROE-S10** | La Mer, [Tobiko](https://www.lamer.ca/products/caviar-tobiko-orange) | Canadian retailer calls tobiko the Japanese name for `œufs de poisson volant` and lists multiple colors/flavours in a 500 g product. Product listing supports regional French wording and one SKU; size/color details are not generalized. |
| **WP04-ROE-S11** | Fisheries and Oceans Canada, [A Sea Urchin Fishery for Atlantic Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/88375.pdf) | Describes the consumed sea-urchin portion as commonly called roe but technically gonads, including male and female gonads. Supports a non-fish product boundary; its historical report is not a contemporary product-label standard. |
| **WP04-ROE-S12** | MAFF, [Agono ko umani (braised flying fish roe)](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/3699/index.html) | Documents Shimane regional `ago no ko`, source as flying fish, and one dish using roe pieces braised with dashi/seasonings. Supports original regional terminology and a distinct regional preparation; does not support tobiko dosage or substitute measurements. |
| **WP04-ROE-S13** | Saint-Sauveur Sushi, [2024 French menu](https://sushistsauveur.ca/pdf/alacarte-fr-2024.pdf) | One local menu labels tobiko as `œufs de poisson volant`, masago as `œufs d’éperlan`, and ikura as salmon roe. Used only to record regional menu wording and the `éperlan` conflict. Not a fish-authority source or proof of species equivalence. |
| **WP04-ROE-S14** | U.S. Food and Drug Administration, [CPG Sec. 540.150 — Caviar, Use of Term](https://www.fda.gov/regulatory-information/search-fda-guidance-documents/cpg-sec-540150-caviar-use-term-labeling) | U.S. policy says unqualified caviar should be used only for salted sturgeon roe, while other fish roe should be species-qualified. Used only as a jurisdiction-limited example explaining why bare `caviar` is an unsafe global alias; do not apply it as Canadian law. |

## Coordinator follow-up

1. Decide whether to add two identity-only candidates when a specific recipe needs them: `tobiko (flying fish roe)` / `tobiko (œufs de poisson volant)` and `masago (capelin roe)` / `masago (œufs de capelan)`.
2. Preserve the no-species-purity caveat. Branded seasoned products may contain herring roe, other seasonings, colors, or additional ingredients; consult the product label for the exact SKU.
3. Keep generic `roe`, bare `caviar`, salmon roe/ikura, processed bottarga/poutargue/karasumi, and sea-urchin roe/uni separate or unresolved. Do not accept `œufs d’éperlan` for masago without stronger product-specific evidence.
4. Leave density, quantities, conversions, package yields, forms, and substitutions inactive.
5. Keep the broad Section P plan item open. This packet makes no canonical edits and links no bundled recipe.
