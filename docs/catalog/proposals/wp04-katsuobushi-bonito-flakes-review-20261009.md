# WP04 Section P — Katsuobushi and dried bonito-flake boundary review

- **Packet type:** proposal only.
- **Prepared and source-access date:** 2026-10-09.
- **Scope:** dried bonito products named katsuobushi and the source-supported shaved/flaked products; whole bonito fish and dashi/stock are boundary checks.
- **Status:** integrated on 2026-10-09 after coordinator review; Section P remains open.
- **Source IDs:** `WP04-KAT-S01` through `WP04-KAT-S09`. The `WP04-KAT-S` namespace was checked in the current ledger, proposals, and batches before assignment; no collision was found.

## Coordinator recommendation

Review one new `PROTEIN` identity for **dried bonito / katsuobushi**. Use EN `dried bonito (katsuobushi)` and fr-CA `bonito séché (katsuobushi)`. Accept source-backed shaved-product search wording only when it names bonito specifically: EN `dried bonito flakes`, `bonito flakes`, and `katsuobushi flakes`; fr-CA `flocons de bonite séchée` is directly used by a Montréal supplier and on a Canadian French product listing. These phrases refer to the dried bonito product when verified as bonito; do not broaden them to all dried-fish shavings.

The evidence treats katsuobushi as a dried bonito product family with process variants, while Japanese food-labeling rules separately name shaved products. Bonito flakes can be made from more than one bonito processing state; katsuobushi flakes are a more specific product label. Do not create a separate form for “shaved” in this packet: the current form model describes preparation states, and the source evidence supports a product/cut descriptor, not a catalog conversion. If a future recipe specifically distinguishes an unshaved block from ready-shaved flakes, review whether that warrants a separate record or form then.

Keep these boundaries explicit:

- **Whole fresh/frozen bonito fish** is not dried bonito or katsuobushi. Do not alias bare `bonito` or `bonite` to the prepared dried product. The Québec fish term `bonite à dos rayé` names *Sarda sarda*, while MAFF’s katsuobushi sources describe a processed bonito product and another MAFF source calls it dried skipjack tuna; the local retail wording `bonite` is recorded only as a product phrase, not a species crosswalk.
- **Other dried-fish shavings** (`kezuribushi`, Japanese `削りぶし`) include non-bonito species and mixed products under Japanese standards. Do not add `kezuribushi`, `dried fish flakes`, or `mixed fish flakes` as aliases for bonito.
- **Dashi / broth / stock** is an extracted liquid or prepared stock base made using bonito flakes, kombu, or other ingredients. Keep it in `STOCK_AND_BROTH`, separate from the dried fish in `PROTEIN`. A stock-use or garnish-use description is not an equivalence or substitution rule.
- **Bare `katsuobushi` versus shaved `katsuobushi`** is supported as one dried bonito product family, but the package/cut distinction is real. The recommended searchable identity covers the dried bonito ingredient; do not infer a mass-volume conversion or a different fish species from the word `bonito`.

No density, unit mapping, package-yield relation, conversion, or substitution rule is proposed. MAFF’s moisture ceiling and recipe-specific gram quantities, and one Montréal listing’s 20 g package, do not establish a density or a general cooking conversion.

## Proposed names and scope

| Candidate / boundary | EN proposal | fr-CA proposal and status | Alias and identity recommendation |
|---|---|---|---|
| Dried bonito / katsuobushi | `dried bonito (katsuobushi)` | `bonito séché (katsuobushi)`. The OQLF GDT entry `bonito` describes a very hard dried fish that is grated and notes that it also exists in flakes; its cited author is Fondation Est-Ouest de Toulouse, 1985, not the OQLF. Québec product listings use `flocons de bonite séchée` / `Flocons de Bonite Katsuo Bushi` [S06–S09]. | One proposed dried-bonito ingredient identity, category `PROTEIN`. Proposed EN aliases: `katsuobushi`, `dried bonito flakes`, `bonito flakes`, `katsuobushi flakes`. Proposed FR alias: `flocons de bonite séchée`. Do not alias bare `bonito`, bare `bonite`, `bonite à dos rayé`, `tuna` / `thon`, or generic `dried fish shavings`. The French compound phrase is product terminology, not a biological equivalence to the Québec fish species entry. |
| Whole bonito fish | No new identity from this review. | No fr-CA name selected for this packet. OQLF lists `bonite à dos rayé` for *Sarda sarda*; that species-specific term is not an alias for katsuobushi [S07]. | Keep fresh/frozen whole fish separate from dried bonito. The live seed has generic `tuna` / `thon`; this packet does not map that row to bonito, skipjack, or katsuobushi. |
| Generic dried-fish shavings / Japanese `kezuribushi` | No new identity. | No global French display selected. | Japanese standards include shavings from multiple fish species and mixtures. Only a product identified as bonito supports the proposed bonito identity; generic `kezuribushi`, mixed shavings, and shavings made from other fish remain separate or unresolved [S03, S04]. |
| Dashi / bonito stock | Existing stock identities remain out of this packet. | Existing stock terminology remains unchanged. | Dashi/broth is a prepared stock product or liquid extraction, not dried bonito flakes. Keep it separate from the `PROTEIN` identity and do not add a dashi alias [S05, S08]. |

### Processing terms and limits

MAFF describes katsuobushi as boiled bonito repeatedly roast-dried to a moisture level of 26% or less. It names process variants including arabushi, karebushi, and honkarebushi. This supports a dried product family, not one universal manufacturing method. Japanese Food Labeling Standards separately distinguish shaved products by source and cut; for example, single-species bonito shaving names differ from bonito karebushi shavings, and mixed-fish shavings use a mixed-product name. The legal category `削りぶし` is broader than bonito alone. Preserve those distinctions in product notes; no arabushi/karebushi identity split or cut form is proposed without recipe or catalog requirements [S01, S02, S04].

## Measurement and substitution status

| Evidence | What it supports | What it does not support |
|---|---|---|
| MAFF katsuobushi description | A product-definition moisture ceiling of 26% or less for the described katsuobushi; a source-specific recipe uses katsuobushi flakes by weight [S01]. | No density or spoon-to-mass value. Moisture content is not a volume conversion. The recipe quantity is not a general dose. |
| La Brasserie San-O listing | One Québec sale package is 20 g; the product is described for garnish and broth [S08]. | No volume, general package yield, density, or substitution measure. |
| MAFF dashi descriptions | Dried bonito flakes may be used to extract dashi stock [S05]. | No ratio between flakes and prepared stock, Hondashi, kombu stock, or other fish shavings. |

No density, unit mapping, mass-volume conversion, standard yield, form conversion, or ingredient substitution is proposed. A use in broth, as a garnish, or in another savory dish does not establish replacement equivalence.

## Live catalog, legacy, forms, source, and recipe audit

Snapshot checked on 2026-10-09 before writing this packet:

| Artifact | Count / SHA-256 |
|---|---|
| Seed manifest `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references | 414 rows; `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e` |
| Ingredient forms | 16 rows; `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| Legacy candidates | 99 rows; `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Research ledger | 579 records; `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647` |
| Recipe JSON files | 114 files, 1,123 ingredient lines; ordered recipe digest `344a67efba2bba5d65a6ae79ea1f9c4d4fdf9237271d3410c1041bff39a748f6` |

Each file hash is SHA-256 of its exact bytes. The recipe digest is SHA-256 over recipe basenames sorted lexically, each followed by a NUL byte, its exact file bytes, and another NUL byte.

The exact-key audit mirrored `normalizeIngredientSearchKey` in `IngredientSearch.kt` (lowercase/NFKD, `œ`/`æ`/`ß` folding, combining-mark removal, ampersand expansion, non-ASCII-alphanumeric-to-space, and whitespace collapse). It checked English and French candidate names and variants, source terminology, product-boundary queries, dashi terms, and current fish/stock names against active reference names and aliases, form labels and match terms, and all legacy names and aliases.

- No exact active reference, form, or legacy key matched the proposed names or aliases: `dried bonito (katsuobushi)`, `bonito séché (katsuobushi)`, `katsuobushi`, `dried bonito flakes`, `bonito flakes`, `katsuobushi flakes`, and `flocons de bonite séchée`. Boundary and excluded terms were also checked, including `kezuribushi`, `dried fish shavings`, `tuna`, `thon`, `dashi`, and `hondashi`.
- Boundary keys with expected current matches were `tuna` and `thon` → `ingredient-ref-tuna` (`PROTEIN`), and `hondashi` → `ingredient-ref-hondashi` (`STOCK_AND_BROTH`). None is proposed as an alias. The active references contain no bonito/katsuobushi identity; the forms file contains no matching form; the legacy file has no matching candidate; the ledger has no bonito/katsuobushi candidate record.
- The only adjacent existing proposal wording found is the Japanese condiment proposal’s mention of a Kappo Shirodashi product with bonito in its title. It concerns prepared dashi, not a dried-bonito-flake identity. No existing proposal/batch has a katsuobushi/bonito identity disposition. The `WP04-KAT-S` source-ID prefix was absent from ledger/proposal/batch files before this proposal.
- Whole-phrase recipe scan across all 114 manifest-listed recipes returned two **boundary-only** matches: `1 tsp hondashi` in recipe 066 and `1 tuna steak` in recipe 111. No bonito, katsuobushi, bonito-flake, or dried-fish-shaving term matched an ingredient line. These two existing rows are not katsuobushi usage.

## Source search log

All source searches and accesses were performed on 2026-10-09. Search terms are representative.

| Search group | Representative queries | Result / limit |
|---|---|---|
| Japanese food standards and product | `site:maff.go.jp katsuobushi kezuribushi shaved bonito flakes JAS`; `site:caa.go.jp かつお削りぶし かつおぶし削りぶし`; `JAS 1122 shavings of dried fish`; `site:maff.go.jp katsuobushi dashi bonito flakes` | MAFF and CAA sources distinguish dried bonito, shaved products, other dried-fish products, and dashi use. The CAA current Annex 1–8 gives product-name and cut descriptors; its 2026-10-01 amendment PDF was also checked and has no `削りぶし` or `かつお` text. These standards do not establish a conversion or universal recipe. |
| Québec French terminology | `site:vitrinelinguistique.oqlf.gouv.qc.ca katsuobushi`; `site:vitrinelinguistique.oqlf.gouv.qc.ca flocons de bonite séchée`; `Québec flocons de bonite séchée katsuobushi Montreal` | No OQLF entry for `katsuobushi` or `flocons de bonite séchée` was found. The GDT has a separate culinary `bonito` entry and species entries for `bonite`; Montréal/Canadian product listings attest `flocons de bonite séchée` and `Katsuo Bushi`. These are product-language sources, not a species crosswalk. |
| Ingredient collision / recipe audit | `bonito`, `bonite`, `dried bonito`, `bonito flakes`, `katsuobushi`, `kezuribushi`, `dashi`, `hondashi`, `tuna` | Live exact-key and recipe scan found no candidate identity match; only expected separate tuna and Hondashi boundary hits. |

## Source-to-claim map

IDs were assigned after checking `WP04-KAT-S` against the ledger and existing proposals/batches. All sources below were accessed 2026-10-09.

| ID | Source | Evidence used and limits |
|---|---|---|
| **WP04-KAT-S01** | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), [Dried Bonito — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/dried_bonito.html) | Defines katsuobushi as a processed bonito product; describes boiling and repeated roasting/drying to a stated moisture ceiling; names arabushi, karebushi, and honkarebushi; identifies stock and cooking uses. Does not make katsuobushi a stock itself. |
| **WP04-KAT-S02** | MAFF, [Katsuobushi and Similar Products](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/husirui.html) | Distinguishes dried bonito from sodabushi, magurobushi, sababushi, murobushi, urumebushi, and iwashibushi, and describes their differing source fish and stock uses. Supports keeping other dried fish products separate. |
| **WP04-KAT-S03** | MAFF, [List of Japanese Agricultural Standards](https://www.maff.go.jp/e/policies/standard/jas/list.html) and [JAS 1122: Shavings of Dried Fish (Kezuribushi)](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-360.pdf) | MAFF lists a separate standard for `削りぶし` / `Kezuribushi`, revised 2024-08-30. Confirms a dried-fish-shavings product class; the class is not restricted to bonito. |
| **WP04-KAT-S04** | Japan Consumer Affairs Agency, [Food Labeling Standards, Annex 1–8](https://www.caa.go.jp/policies/policy/food_labeling/food_labeling_act/assets/food_labeling_cms201_260401_02.pdf) (posted in the [CAA current standards package](https://www.caa.go.jp/policies/policy/food_labeling/food_labeling_act)) | Food-labeling rules distinguish single-species shaved fish, karebushi shavings, and mixed shavings; they specify cut descriptors such as thin, thick, thread-shaped, fragments, and powder. The CAA page lists a 2026-10-01 amendment; checking that amendment found no `削りぶし` or `かつお` text. This supports product boundaries, not a general alias for `kezuribushi`. |
| **WP04-KAT-S05** | MAFF, [Discover Dashi, the Basis of Japanese Cuisine](https://www.maff.go.jp/e/policies/rural_dev/eatmeetjapan/winners-2019/14.html) | Describes katsuobushi flakes being shaved and used to make dashi stock. Supports the ingredient-versus-extract distinction; no recipe ratio or substitute value is proposed. |
| **WP04-KAT-S06** | OQLF GDT, [bonito](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17566115/bonito) | Entry defines `bonito` as a very hard dried fish that is grated and says it also exists in flakes. Its recorded author is Fondation Est-Ouest de Toulouse (1985), not the OQLF; use as Québec-hosted terminology evidence, not as an OQLF-preferred term. |
| **WP04-KAT-S07** | OQLF GDT, [bonite à dos rayé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198927/bonite-a-dos-raye) | OQLF identifies this species-specific fish as *Sarda sarda* and warns that commercial seafood names should avoid species confusion. Do not use bare `bonite` or `bonite à dos rayé` as a global alias for katsuobushi. |
| **WP04-KAT-S08** | La Brasserie San-O (Montréal), [catalogue](https://labrasseriesan-o.ca/fr/pages/catalogue) | Local product listing says `Flocons de Bonite Katsuo Bushi` and `Bonite séchée traditionnelle pour garniture et bouillon`, with a 20 g package. The same catalog separately lists a `Dashi Bonito & Kombu` stock base. Supports local French product wording and product/stock distinction, not species equivalence or conversion. |
| **WP04-KAT-S09** | Walmart Canada, [JFC Flocons de Bonite Séchée Katsuobushi](https://www.walmart.ca/fr/ip/BONITO-FLAKE-FLOCONS-DE-BONITE/6000188761440) | Canadian French retail listing directly attests `Flocons de Bonite Séchée Katsuobushi`. Marketplace title is product-specific and not a terminology standard. |

## Coordinator checks before any integration

1. Recheck the live seed, forms, legacy candidates, ledger, and all recipes against the final display names and aliases.
2. Preserve the distinction between whole bonito fish, dried bonito/katsuobushi, species-specific bonito flakes, mixed `kezuribushi`, and prepared dashi/stock.
3. Keep bare `bonito`/`bonite` out of the alias set; if integrating French `flocons de bonite séchée`, retain its source-specific product qualifier and do not imply it is OQLF’s `bonite à dos rayé` species.
4. Leave density, unit conversion, package yield, form conversion, and substitution fields unset unless exact product evidence supports them.
5. Leave Section P open. This proposal does not complete other dried/cured seafood, fish, stock, or regional protein reviews.

## Coordinator integration result

Added `dried bonito (katsuobushi) / bonito séché (katsuobushi)` as a protein identity, with only
the product-qualified aliases listed in the proposal. Bare `bonito`/`bonite`, generic dried-fish
flakes, and dashi/stock remain outside the row. No density, mapping, form, recipe link, or
substitution rule was added. Québec review and wider Section P coverage remain open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
