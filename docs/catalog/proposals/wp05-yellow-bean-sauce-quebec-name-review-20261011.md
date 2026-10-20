# WP05 — Yellow-bean sauce Québec naming and scope review

- **Packet type:** proposal-only research; no catalog integration performed.
- **Reviewed/source access date:** 2026-10-11.
- **Scope:** held yellow-bean/soy-bean sauce terms in Section W; exact ownership across live references, forms, legacy candidates, and research ledger; Canadian/Québec French wording; whole-bean versus crushed product labels; all manifest-listed recipe demand.
- **Recommendation:** keep the general Chinese yellow-bean sauce family **on hold**. Do not add an identity, alias, form, recipe link, or conversion. A current Thai manufacturer page directly supplies the French display `sauce aux haricots jaunes` for its own product, but that evidence does not establish a Québec/Canadian label or shared scope for the Chinese whole-bean, crushed, or ground products. If that exact Thai product is separately represented later, retain the maker’s product-specific wording and do not reuse it as a global synonym. [S01–S02]
- **Write scope:** this proposal file only. No shared catalog, recipe, ledger, roadmap, plan, checklist, generated file, or batch README was edited. No tests were run.

## Pre-integration snapshot

Counts and hashes identify the catalog and recipe corpus reviewed before any proposed integration. The recipe corpus digest sorts the paths from the bundled manifest and hashes each relative path, a NUL byte, and the file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,081 | `3a381c9d6293786ddf26f8f9dcff3688400caebace60c293175797b67a7a87ab` |
| Ingredient forms | 79 | `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| Legacy candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Research ledger records | 1,380 | `951867ea3e6f3d035d484d84234dd223996080e5c74b27422193be5f040c2258` |
| Manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe ingredient rows | 1,123 | Recipe corpus SHA-256: `ecced6649f648c0c09161e315efa047f0fd8c8835a83e49978533fb4c00616ab` |

## Decision and bounded wording

| Candidate | Current evidence and exact owner | Disposition |
|---|---|---|
| `yellow bean sauce` | No exact active reference, form, legacy candidate, or matching yellow-bean ledger record. The term occurs on products from different regional lines. | **HOLD** as a general identity. Do not use the Pantai French label to establish a shared Chinese/Thai identity. |
| `soy bean sauce` / `soybean sauce` | No exact active owner. Lee Kum Kee’s UK product page says its specific whole-soybean product is also called `Soy Bean Sauce`; this is a manufacturer-specific equivalence only. [S03] | **HOLD** as a global alias or separate row. Do not attach to generic `soy sauce`. |
| `crushed yellow bean sauce` | No exact active owner. Current Canadian retailer and distributor listings carry Pearl River Bridge `Crushed Yellow Bean Sauce`; a 2026 supplier catalogue also lists LKK `Crushed Yellow Bean` as a separate 470 g tin. [S04–S06] | **HOLD** as an identity or form. Preserve “crushed” when referring to these product listings; current sources do not establish a cross-brand equivalence or recipe interchangeability. |
| `ground bean sauce` | No exact active owner, form, legacy candidate, or recipe demand. No reviewed Québec or Canadian French package label settled this name. | **HOLD.** Do not alias it to crushed yellow-bean sauce, generic bean paste, doubanjiang, or soy sauce. |
| `yellow bean paste` / `yellow soybean paste` | No exact active owner, form, legacy candidate, or recipe demand. The reviewed sources do not show that every paste and sauce label denotes one interchangeable product. | **HOLD.** Do not merge paste and sauce identities without a product-specific crosswalk. |
| `sauce aux haricots jaunes` | Pantai Norasingh’s French manufacturer page uses this exact wording for its Thai Yellow Bean Sauce and lists soy as 56% of that product. It identifies the product as Thai / made in Thailand. [S01] | **ACCEPT ONLY as the maker’s French wording for that specific Thai product if it is modeled later.** It is not proposed as the global fr-CA display for the held Section W Chinese family. |
| `sauce de haricots jaunes` | An older Canadian trademark journal contains this wording in a product list. It is not a current Québec terminology decision or current Canadian retail label. [S08] | **HOLD.** Historical wording is not sufficient to choose the catalog display. |
| `pâte de haricots jaunes` | A 2019 Canadian trademark journal product list uses this different French wording. A trademark goods list is not a terminology authority or current package label. [S09] | **HOLD** as a general French display or alias. It also preserves “paste,” not “sauce.” |
| `sauce haricot jaune` | A current Verdun restaurant listing uses this phrase in a dish name, paired with English `yellow bean sauce`; it is not a packaged-product label and may be platform-generated. [S10] | **Do not adopt.** This is weak local menu evidence, not a stable fr-CA ingredient name. |
| `sauce aux fèves jaunes`, `sauce de fèves jaunes`, `sauce de soja jaune` | No exact active owner or reviewed Canadian/Québec product label. | **HOLD.** Do not add these unsupported variants. |

No identity row is recommended in this packet. The positive French evidence is limited to Pantai’s Thai product; its exact displayed phrase may be retained if that exact product ever becomes a catalog candidate. It does not settle whether a generic entry should be called `sauce aux haricots jaunes`, nor whether Chinese whole-bean, crushed, and ground products belong under one identity.

## Exact owner and collision audit

Exact-key checks use the app’s `normalizeIngredientSearchKey` behavior: lowercase/NFKD, `œ`/`æ`/`ß` folding, combining-mark removal, ampersand expansion, non-alphanumeric characters to spaces, and whitespace collapse. Canonical names and aliases in the live references were checked against normalized query phrases; the same whole-phrase checks covered form labels/match terms and legacy names/aliases. Ledger text was checked separately. Recipe strings were also searched with the normalized whole phrases.

| Exact term or boundary | Active owner | Forms / legacy / ledger result | Recommendation |
|---|---|---|---|
| `yellow bean sauce`; `soy bean sauce`; `soybean sauce`; `crushed yellow bean sauce`; `ground bean sauce`; `yellow bean paste`; `yellow soybean paste` | None | No exact form or legacy owner and no matching yellow-bean ledger record. | Keep each term held; do not create an alias network. |
| `sauce aux haricots jaunes`; `sauce de haricots jaunes`; `sauce aux fèves jaunes`; `sauce de fèves jaunes`; `sauce de soja jaune`; `sauce soya jaune`; `pâte de haricots jaunes` | None | No exact form, legacy owner, or exact yellow-bean ledger record. | Use `sauce aux haricots jaunes` only when describing Pantai’s source-named Thai product; do not add a catalog alias. |
| `sweet bean sauce`; `sauce douce au soja` | `ingredient-ref-sweet-bean-sauce` owns both canonical names; it has no aliases. | No exact matching form. The ledger and current Lee Kum Kee product pages cover product-specific Sweet Bean Sauce and the maker’s “Tien Mien Jiang” pairing. [S11–S12] | Keep as a separate identity. Do not transfer `tien mien jiang` or `tianmianjiang` to yellow-bean sauce. |
| `soy sauce` | `ingredient-ref-soy-sauce` | No yellow-bean alias or form match. | Do not alias `soy bean sauce` to liquid soy sauce. |
| `black bean sauce`; `sauce de soja noir`; `sauce de soya noir` | `ingredient-ref-black-bean-sauce`; its French alias remains `sauce de soya noir`. | No yellow-bean form or legacy match. | Keep black-bean sauce separate; no `black bean` cross-alias. |
| `douchi`; `fermented black soybeans` | `ingredient-ref-douchi`; `fermented black soybeans` is its English alias. | No yellow-bean form or legacy match. | Douchi is a separate fermented-bean identity, not a yellow-bean sauce alias. |
| `doubanjiang` | `ingredient-ref-doubanjiang` | No yellow-bean form or legacy match. | Keep the chili-bean paste distinct; shared soy/bean language does not establish equivalence. |
| `chunjang` | `ingredient-ref-chunjang` | No yellow-bean form or legacy match. | Keep the Korean paste distinct. |
| `sweet soy sauce`; `black bean paste`; `fermented bean paste`; `tianmianjiang`; `tien mien jiang` | No exact owner in the current reference catalog for these phrases. | No exact matching yellow-bean form or legacy owner. | Do not add these as yellow-bean aliases. The maker’s specific sweet-bean product pairing does not establish a global crosswalk. |

The live neighboring owners above were read from `ingredient-references.v1.json`. The exact-match audit does not treat the historical trademark phrases or product-page wording as existing catalog owners.

## Whole-bean, crushed, and Thai product comparison

- **Whole-bean product:** Lee Kum Kee’s current UK manufacturer page labels one product `Yellow Bean Sauce`, says it is made from naturally fermented whole soybeans, and states that this particular product is also called `Soy Bean Sauce`. Its listed key ingredients include soybeans at 27%. This supports the scope of that product page only; it does not authorize a global `soy bean sauce` alias. [S03]
- **Crushed product:** Canadian PriceSmart and Locsky listings identify Pearl River Bridge `Crushed Yellow Bean Sauce` (260 g). PriceSmart’s body text describes Pearl River Bridge Yellow Lantern Chilli Sauce, which conflicts with the item title; I therefore use only its product title, item number, and package listing, not that body text as a formula. Locsky separately lists the 260 g product and pack size. [S04–S05]
- **Another crushed product:** A 2026 supplier brochure separately lists Lee Kum Kee `Crushed Yellow Bean` in a 470 g tin from Hong Kong. This documents another commercial product style; it does not establish an alias to LKK’s whole-bean product or to Pearl River Bridge. [S06]
- **Thai product and French label:** Pantai Norasingh’s current manufacturer pages list its product as `Yellow Bean Sauce` in English and `Sauce aux haricots jaunes` in French. The French page marks it Thai / made in Thailand and lists soy at 56%. That source supports the maker’s own French product wording and this product’s stated ingredient listing, not a general Chinese product scope or Canadian shelf label. [S01–S02]

The sources show that product pages use `yellow bean sauce` for more than one maker/region and add “whole” or “crushed” when distinguishing product styles. They do not provide a Canadian/Québec product-label crosswalk among whole-bean, crushed, ground, Thai, and paste products. Preserve the product qualifier in source-specific records; do not infer that a generic recipe line can use each product interchangeably.

## Québec / Canadian French assessment

The strongest current French label found is Pantai’s direct manufacturer wording `Sauce aux haricots jaunes` for its Thai product. It is useful product-specific French evidence, but the page is not a Québec or Canadian bilingual label. A HelloFresh Canada recipe page in a French locale leaves the ingredient as `Yellow Bean Sauce` in English, which shows Canadian recipe-page use without supplying a French display. [S01, S07]

Canadian sources provide inconsistent and limited French cues: a 2000 Canadian trademark journal lists `sauce aux haricots jaunes`; a 2019 journal uses `pâte de haricots jaunes`; and a current local restaurant menu listing uses `sauce haricot jaune`. These are respectively historical goods text, an applicant’s goods wording, and a dish listing; none is an authoritative Québec terminology recommendation or a current bilingual retail product label. The reviewed OQLF searches for `yellow bean sauce`, `sauce aux haricots jaunes`, and `haricots jaunes` did not return a relevant terminology entry. This search outcome is not proof that no such entry exists.

**Québec recommendation:** do not invent or standardize a French display for the general Chinese yellow-bean family yet. Do not use `sauce aux fèves jaunes` or a soy-sauce calque as an alias. Keep the documented `sauce aux haricots jaunes` wording scoped to Pantai’s exact Thai product unless a current Canadian/Québec label or authoritative terminology source supports a broader identity.

## Exact bundled-recipe demand

All **114** paths in the bundled manifest and all **1,123** `ingredients[]` rows were scanned. The scan covered every string field in each recipe, including source text, ingredient names, original text, references, instructions, and notes. It searched these normalized whole phrases and close boundary names:

`yellow bean sauce`; `soy bean sauce`; `soybean sauce`; `crushed yellow bean sauce`; `ground bean sauce`; `yellow bean paste`; `yellow soybean paste`; `sauce aux haricots jaunes`; `sauce de haricots jaunes`; `sauce aux fèves jaunes`; `sauce de fèves jaunes`; `sauce de soja jaune`; `sauce soya jaune`; `pâte de haricots jaunes`; `sweet bean sauce`; `tianmianjiang`; `tien mien jiang`; `douchi`; `fermented black soybeans`; `doubanjiang`; `chunjang`; and `black bean sauce`.

| Candidate group | Recipe text matches | Ingredient-row matches | Recipe lines |
|---|---:|---:|---|
| Yellow-bean/soy-bean sauce and paste terms, including French variants | 0 | 0 | None |
| Sweet bean sauce / `tianmianjiang` neighbors | 0 | 0 | None |
| Douchi / doubanjiang / chunjang / black-bean boundaries | 0 | 0 | None |

No recipe links, relinks, form conversions, or contextual substitutions are recommended. Manufacturer serving suggestions, package sizes, and ingredient percentages describe particular products and do not establish density, unit mappings, recipe substitutions, package yields, or conversion behavior. Keep `defaultDensity` unavailable and `unitMappings` empty if this identity is reviewed again.

## Source-to-claim register

The source IDs `WP05-YELLOWBEAN-QC-20261011-S01`–`S12` were checked against the current proposal and batch documents and the research ledger before use; no ID collision was found. Pages were accessed 2026-10-11 unless a publication/catalogue date is stated.

| ID | Source | Claims supported and limits |
|---|---|---|
| **WP05-YELLOWBEAN-QC-20261011-S01** | Pantai Norasingh, [Sauce aux haricots jaunes](https://pantainorasingh.com/fr-products/yellow-bean-sauce) | Current Thai manufacturer’s French page uses `sauce aux haricots jaunes`, identifies a 454 g product as Thai / made in Thailand, and lists soy at 56%. Supports that exact maker/product wording, not a fr-CA standard or Chinese product equivalence. |
| **WP05-YELLOWBEAN-QC-20261011-S02** | Pantai Norasingh, [Yellow Bean Sauce](https://pantainorasingh.com/products/yellow-bean-sauce) | Manufacturer English page lists the product as `Yellow Bean Sauce` and shows 454 g packaging. Does not itself supply Canadian retail availability or a Canadian French label. |
| **WP05-YELLOWBEAN-QC-20261011-S03** | Lee Kum Kee UK, [Yellow Bean Sauce / Soy Bean Sauce](https://uk.lkk.com/products/soy-bean-sauce) | Current maker page calls one product `Yellow Bean Sauce`, says it is also called `Soy Bean Sauce`, specifies naturally fermented whole soybeans, and lists soybeans at 27% among key ingredients. This is product-specific UK wording, not a global alias rule or Canadian French term. |
| **WP05-YELLOWBEAN-QC-20261011-S04** | PriceSmart Foods Canada, [Pearl River Bridge Crushed Yellow Bean Sauce](https://www.pricesmartfoods.com/product/pearl-river-bridge-crushed-yellow-bean-sauce-id-00845603000169) | Current Canadian retailer title and item details identify a 260 g `Crushed Yellow Bean Sauce`. Its description is copied from a different Yellow Lantern Chilli Sauce product and is excluded as formula evidence. |
| **WP05-YELLOWBEAN-QC-20261011-S05** | Locsky Trading, [Pearl River Bridge product list](https://www.locsky.ca/items-pearlriverbridge) | Canadian distributor lists `Crushed Yellow Bean Sauce`, 260 g, 24 units per case, alongside distinct garlic-black-bean and hoisin products. Supports current distribution naming and package size only; it gives no French label or formula. |
| **WP05-YELLOWBEAN-QC-20261011-S06** | SOP International, [2026 product brochure, Lee Kum Kee section](https://sopinternational.com/storage/user/Brochure/SOP%202026%20Product%20Brochure%20Final_180226.pdf) | Current supplier catalogue lists `Lee Kum Kee Crushed Yellow Bean (Tin)`, 12 × 470 g, origin Hong Kong. Supports a separately named crushed commercial product; it is not a Canadian French label or formula source. |
| **WP05-YELLOWBEAN-QC-20261011-S07** | HelloFresh Canada, [Speedy Yakisoba Noodles, French locale](https://www.hellofresh.ca/recipes/speedy-yakisoba-noodles-59551740c9fd0838e15cc6a2?locale=fr-CA) | French-locale Canadian recipe page lists ingredient `Yellow Bean Sauce (Wheat, Soy)` in English. Shows recipe-page use but supplies no French translation or product identity beyond the meal-kit ingredient label. |
| **WP05-YELLOWBEAN-QC-20261011-S08** | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 47 No. 2391 (2000)](https://publications.gc.ca/collections/Collection/RG42-2-47-2391.pdf) | A historical Canadian goods list includes `sauce aux haricots jaunes`. It is not current product packaging, a Québec terminology decision, or proof that multiple regional products share one identity. |
| **WP05-YELLOWBEAN-QC-20261011-S09** | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 66 No. 3362 (2019)](https://publications.gc.ca/collections/collection_2019/opic-cipo/RG42-2-66-3362-fra.pdf) | A goods list includes `pâte de haricots jaunes`, an alternate sauce/paste phrasing. Applicant goods wording does not establish a recommended fr-CA display or product crosswalk. |
| **WP05-YELLOWBEAN-QC-20261011-S10** | DoorDash, [LaSalle-area Thai listings](https://www.doordash.com/fr-CA/food-delivery/lasalle-qc-restaurants/thai/) | A current Québec-area menu result for Verdun restaurant Plats de Pâtes Hong Mère renders `Noodle with yellow bean sauce and ground pork` as `Nouille avec sauce haricot jaune et porc haché`. This is weak dish-level/platform wording, not a manufacturer label or standardized ingredient name. |
| **WP05-YELLOWBEAN-QC-20261011-S11** | Lee Kum Kee Canada, [Sauce douce au soja / Sweet Bean Sauce](https://ca.lkk.com/fr-ca/products/sweet-bean-sauce) | Current Canadian maker page confirms the exact neighboring active display `sauce douce au soja` for Sweet Bean Sauce. Its product formula is product-specific; it does not link the row to yellow-bean sauce. |
| **WP05-YELLOWBEAN-QC-20261011-S12** | Lee Kum Kee Industrial USA, [Sweet Bean Sauce (Tien Mien Jiang)](https://usa.lkk.com/en/industrial/products/sweet-bean-sauce-tien-mien-jiang) | Direct manufacturer pairing of a specific Sweet Bean Sauce product with `Tien Mien Jiang`. Supports the neighboring product boundary only, not a global alias or a yellow-bean equivalence. |

## Review and check notes

- Rechecked Section W’s held yellow-bean line and the 2026-10-11 follow-up in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt); it remains open pending supported shared scope and Québec French display.
- Rechecked live references, forms, legacy candidates, ledger, and all manifest-listed recipes against the snapshot in this packet. Exact candidate terms have no active/form/legacy/ledger owner; nearest live soy/bean identities are separately listed above.
- Rechecked the proposed source-ID prefix against proposal/batch Markdown and ledger before writing; no collision was found.
- This is a research-only note, so no app tests were run. UTF-8 text and the proposal-only write scope were checked after saving.
