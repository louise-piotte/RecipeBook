# WP04 Section P — Dried shrimp and dried scallop boundary review

- **Packet type:** proposal-only research followed by coordinator integration.
- **Prepared and source-access date:** 2026-10-09.
- **Scope:** dried shrimp and dried scallop products, their Québec French wording, and boundaries against fresh/cooked shellfish, paste, powder, stock, and other dried seafood.
- **Status:** Integrated on 2026-10-09. The proposal batch itself changed no canonical files; the coordinator accepted the two separate identity rows and source-supported aliases below. Section P remains open.
- **Source IDs:** `WP04-DRSC-S01` through `WP04-DRSC-S10`. The namespace was checked before assignment and again against the completed integration snapshot, ledger, proposals, and batches; no collision was found.
- **Audit timing:** Final snapshot hashes, normalized-key comparisons, source-ID checks, and recipe-line audit were completed after coordinator integration on 2026-10-09.

## Coordinator recommendation

Keep two separate product candidates in `PROTEIN`:

1. **Dried shrimp** — provisional EN display `dried shrimp`; fr-CA display `crevette séchée`. The OQLF has this French term as a preferred term, but its definition describes a particular small, peeled, strongly salty product. Treat it as Quebec terminology evidence, not as a universal species, shelling, or salt specification [S05]. Do not map it to fresh/cooked shrimp, shrimp paste, shrimp powder, or stock powder.
2. **Dried scallop** — provisional EN display `dried scallop`; fr-CA display `pétoncle séché`. The OQLF normalizes `pétoncle` for the Canadian scallop product and discourages `coquille Saint-Jacques`; a Canadian manufacturer uses `pétoncles séchés` on a French ingredient list [S06–S07]. Use `conpoy` only as a source-supported regional alias for dried scallop; do not map it to fresh/cooked scallop or scallop/seafood powder [S08].

These are product-identity candidates, not proposed forms of a generic fresh seafood row. The live catalog currently has no generic shrimp or scallop reference. If such base identities are later reviewed, a same-species dried form relation should be considered only when the product's species and processing are explicit. No species crosswalk or form relation is proposed here.

The sources document meaningful product-state and market differences. Taiwan's agricultural research station distinguishes two `蝦米` dried-shrimp styles, including differences in size and whether they are whole or peeled, and defines `干貝` as dehydrated bivalve adductor muscle. Hong Kong government categories list live/unprocessed shrimp/prawn and scallop separately from dried shrimp and dried scallop [S02–S03]. Preserve source qualifiers for variants such as `冬蝦`, `蝦米`, and product-labeled northern Mauxia shrimp; do not make these global aliases or infer a species [S03, S07].

Keep these boundaries explicit:

- **Fresh or cooked shrimp / scallop:** separate preparation and sale states. No fresh/cooked identity, species mapping, or dried-to-cooked conversion is added. Canadian standards define cooked shrimp cocktail and cooked/uncooked breaded scallops as prepared products, not as dried shellfish [S01].
- **Kapi and other shrimp pastes:** the live seed contains `ingredient-ref-kapi-shrimp-paste` (`kapi` / `pâte de crevettes Kapi`, `SAUCE_AND_CONDIMENT`). Its separately reviewed Thai standard defines Kapi as shrimp paste made from fermented krill and/or shrimp with salt. It stays separate from dried whole/small shrimp; the Kapi packet did not review dried shrimp [existing ledger source `WP05-SEA2-S01`; `docs/catalog/batches/wp05-kapi-shrimp-paste.md`].
- **Powders and stock/bouillon:** no alias is proposed for `shrimp powder`, `scallop powder`, `seafood powder`, or broth/bouillon products. A powder may be ground seafood or a compound seasoning; without its ingredient statement, its identity is unresolved. Existing Hondashi and broth-concentrate references remain separate `STOCK_AND_BROTH` identities. Hong Kong's official classification lists dried seafood separately from concentrated soup/mix/paste/broth/bouillon and seasoning powders [S10].
- **Other dried seafood:** dried scallop, dried shrimp, dried oyster, dried squid, dried bonito, shrimp egg, salted fish, and other products appear as separate names in the Hong Kong government seafood classification. Do not collapse them into one dried-seafood ingredient [S02].
- **Regional names:** do not add `dried prawns`, `xiami`/`蝦米`, `winter shrimp`/`冬蝦`, `ganbei`/`干貝`, or `瑤柱` as universal catalog aliases in this packet. Preserve those terms only when the source or product uses them and a future review verifies the product scope. `Conpoy` has a direct dried-scallop source gloss and is the only regional alias proposed [S03, S08].

## Proposed names and disposition

| Candidate | EN proposal | fr-CA proposal and evidence status | Identity / alias recommendation |
|---|---|---|---|
| Dried shrimp | `dried shrimp` | `crevette séchée` is an OQLF preferred term. Its 1982 definition is specifically a small peeled dried shrimp with a strong salty taste. Canadian manufacturer labeling uses the plural `crevettes séchées`, and identifies one product's shrimp as `crevettes nordiques Mauxia` [S05, S07]. | One broad dried-shrimp product candidate; no species or salt level selected. Search aliases proposed: EN `dried shrimps`; FR `crevettes séchées`. Do not add `dried prawns`, `shrimp paste`, `shrimp powder`, `shrimp stock`, or the regional forms above without a scoped review. A source that explicitly identifies a species should retain that qualifier. |
| Dried scallop | `dried scallop` | `pétoncle séché` follows the OQLF's normalized Quebec term `pétoncle`; the Canadian manufacturer uses the plural `pétoncles séchés` [S06–S07]. | One dried-scallop product candidate. Search aliases proposed: EN `dried scallops`, `conpoy`; FR `pétoncles séchés`, `conpoy`. Do not alias `scallop`, `pétoncle`, `coquille Saint-Jacques`, fresh/cooked scallop, scallop powder, or stock/bouillon. `Conpoy` is retained only for a label/source identifying dried scallops [S08]. |

Neither row receives a default density, unit mapping, package yield, form, form conversion, or substitution rule. No active recipe relinking is proposed.

## Measurement evidence — separate from identity

The sources offer a few narrowly scoped observations but no general cooking conversion:

| Evidence | What it supports | What it does not support |
|---|---|---|
| Hong Kong Centre for Food Safety (CFS) moisture/conversion-factor examples | For interpretation of **metal maximum limits**, the CFS lists water-content ranges and factors of 0.13–0.56 for dried shrimp and 0.13–0.40 for dried scallops. It explicitly says moisture and the factor vary by species, season, location, and processing; the examples are assembled from several food-composition databases [S04]. | These regulatory contaminant factors are not culinary fresh-to-dried yield ratios. They do not support recipe mass conversion, mass-volume conversion, density, count weight, or rehydration yield. No value from the table is proposed for catalog use. |
| Taiwan Health Promotion Administration dietary exchange guide | For a specific dietary exchange table, edible-weight portions are listed as 10 g dried shrimp = one `免洗湯匙` (disposable soup spoon) and 10 g dried scallop (`乾干貝`) = one such spoon [S09]. | The source does not define the spoon's volume, fill level, product species, shell state, or package. This Taiwan exchange measure is not a North American teaspoon/tablespoon mapping or a general recipe conversion. No unit mapping is proposed. |
| Hong Kong Department of Health recipe, stewed steamed rice with conpoy and egg | One recipe serving two uses 15 g dried scallops (conpoy) and 300 g broth [S08]. | This is one recipe's ingredient quantity, not a serving standard, density, volume conversion, stock ratio, or substitution rule. |
| Taiwan agricultural research station dried-goods guide | Recommends briefly soaking one `冬蝦` product in warm water and soaking `干貝` for about half a day before softening and separating it for cooking [S03]. | No starting quantity, drained weight, water uptake, or generic rehydration ratio is supplied. These instructions are product-specific and are not conversion evidence. |

No authoritative general mass-per-piece or volume-to-mass measure was found for dried shrimp or dried scallop. Keep all numeric fields unset. Do not turn the regulatory moisture-based contaminant factors, dietary spoon, or recipe quantity into global mappings.

## Substitution evidence — separate from identity and measurement

No tested, source-scoped substitution rule was found for replacing dried shrimp with dried scallop, fresh/cooked shrimp or scallop, fish/seafood powder, stock/bouillon, or another dried seafood. These products have separate names and uses in the reviewed regional and regulatory sources. Shared savory/umami use alone is not evidence of interchangeability. No direct or contextual substitution rule, ratio, warning, or alias is proposed.

## Final live snapshot, normalized-key, and recipe audit

The completed shared snapshot was checked on 2026-10-09. SHA-256 values below are over the exact file bytes. The ordered recipe digest is SHA-256 over each manifest-listed recipe basename in lexical order, a NUL byte, the exact recipe file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Seed manifest `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references `ingredient-references.v1.json` | 447 rows | `b5b527cb3d6be40aba99939183b36aece0ff1c8e37d2fe2c63e943e3ee29e577` |
| Ingredient forms `ingredient-forms.v1.json` | 17 rows | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| Legacy candidates `docs/catalog/legacy-import-identities.v1.json` | 99 rows | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Research ledger `docs/catalog/research-ledger.v1.json` | 614 records; 764 source entries | `e32ac1d3c1a6c01f409c30c8b7f50f14cc2218c06e674784609c29243d36457a` |
| Manifest-listed recipe files | 114 files; 1,123 ingredient rows | `7498b32d956db5a5d60f920da2ac41876db9c787ed132c60deb4f9ac1e121bab` |

The exact-key audit mirrored `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase and NFKD, fold `œ`/`æ`/`ß`, remove combining marks, expand `&` to `and`, map other characters outside ASCII letters/digits to spaces, and collapse whitespace. It compared active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. It also checked current proposals, batches, and ledger text for existing dispositions.

- None of the proposed searchable names/aliases had an exact normalized-key match in active references, forms, or legacy candidates: `dried shrimp`, `dried shrimps`, `crevette séchée`, `crevettes séchées`, `dried scallop`, `dried scallops`, `pétoncle séché`, `pétoncles séchés`, and `conpoy`.
- The separately excluded Kapi boundary terms matched only the active `ingredient-ref-kapi-shrimp-paste`: `kapi` and `pâte de crevettes Kapi`. The stock boundary checks found the distinct active `ingredient-ref-hondashi` (`hondashi`, category `STOCK_AND_BROTH`) and `ingredient-ref-broth-concentrate` (`broth concentrate` / `concentré de bouillon`, with `better than bouillon` aliases, also `STOCK_AND_BROTH`). None is an alias for either dried product. No exact key matched for the other checked boundaries, including `dried prawns`, fresh/cooked shrimp or scallop terms, `shrimp paste`, `shrimp powder`, `shrimp stock`, `scallop powder`, `seafood powder`, `dried seafood`, `dried oyster`, `dried squid`, `dried bonito`, `salted fish`, `dashi`, or bare `bouillon`.
- Traditional and simplified source-script terms (`蝦米`, `冬蝦`, `干貝`, `瑤柱`, `虾米`, `冬虾`, `干贝`, `瑶柱`) normalize to an empty key under the app's Latin search-key rule, so they were checked literally in references, forms, legacy candidates, ledger, and recipe ingredient fields. No literal match was found.
- Exact proposed product phrases were absent from all other current proposal and batch files. The existing Kapi packet remains the adjacent, separate product review. The Section P checklist line remains unchecked: `[ ] Dried shrimp, dried scallop, stockfish, salt cod, bonito flakes/katsuobushi, fish powder, fish balls, and surimi.`
- This packet has ten unique source IDs. None of `WP04-DRSC-S01` through `WP04-DRSC-S10` occurs in the completed ledger's 764 source entries or in another proposal/batch. The separately cited `WP05-SEA2-S01` is an existing Kapi source already recorded in the ledger, not a new source ID for this packet.

The recipe audit scanned both `originalText` and `ingredientName` in all 1,123 ingredient rows from the 114 manifest-listed recipes. No proposed dried-shrimp/scallop name or alias, generic shrimp/scallop/prawn term, French equivalent, paste/powder/seafood-stock boundary, conpoy, or source-script term appeared. Three stock-boundary rows matched: recipe 044, row 5, `2 tsp broth concentrate` (`ingredient-ref-broth-concentrate`); recipe 066, row 12, `1 tsp hondashi` (`ingredient-ref-hondashi`); and recipe 099, row 3, `1 tbsp Better Than Bouillon` (`ingredient-ref-broth-concentrate`). These are existing `STOCK_AND_BROTH` identities, not dried seafood.

## Source search log

Searches were conducted on 2026-10-09. Results below describe the evidence and its limits; a missing result is not treated as proof that a term does not exist.

| Search group | Representative queries | Result / limit |
|---|---|---|
| Canada / Québec product terms | `site:vitrinelinguistique.oqlf.gouv.qc.ca crevette séchée`; `site:vitrinelinguistique.oqlf.gouv.qc.ca pétoncle scallop`; `Canada French pétoncles séchés crevettes séchées product` | OQLF confirms `crevette séchée` and normalizes `pétoncle`; Lee Kum Kee Canada confirms current French ingredient-list wording `crevettes séchées` and `pétoncles séchés`. No OQLF dried-scallop entry was found. `Coquille Saint-Jacques` is not used as the Quebec equivalent for Canadian scallops [S05–S07]. |
| Chinese regional dried seafood | `site:tcdares.gov.tw 蝦米 干貝 乾貨`; `site:fehd.gov.hk dried seafood dried shrimp dried scallop 瑤柱`; `site:restaurant.eatsmart.gov.hk conpoy dried scallops` | Taiwan's agricultural extension source distinguishes dried-shrimp styles and describes dried bivalve adductor as `干貝`; Hong Kong government lists dried shrimp/scallop separately and a Department of Health recipe labels dried scallops `conpoy`. No cross-region species or processing identity follows from these names [S02–S03, S08]. |
| Product boundaries / powder | `site:fehd.gov.hk "Dried shrimp" "Dried scallop" "Shrimp/Prawn"`; `site:cfs.gov.hk "Concentrated soup/mix/paste/broth/bouillon" seasoning powders`; `site:inspection.canada.ca scallop meat cooked shrimp cocktail dried seafood` | Hong Kong government lists live/unprocessed shellfish, dried seafood, other processed aquatic products, concentrated soup/broth, and seasoning powders as separate food classes. CFIA standards describe cooked shrimp cocktail and cooked/uncooked breaded scallops. These support boundaries, not aliases or conversion rules [S01–S02, S10]. |
| Measurement | `CFS metal maximum limit conversion factor dried scallops dried shrimps`; `Taiwan HPA 蝦米 乾干貝 免洗湯匙 10克`; `dried conpoy recipe grams` | CFS factors are for contaminant-limit interpretation and vary by species/process; HPA's utensil is not volumetrically defined; the HK recipe quantity is one dish-specific measure. No broad cooking conversion was found [S04, S08–S09]. |
| Substitution | `dried shrimp replace dried scallop conpoy tested recipe`; `dried scallop substitute stock powder dried seafood authority`; `dried shrimp fresh shrimp substitution food authority` | No authoritative tested general substitution or ratio was found. No source-scoped rule is proposed. |

## Source-to-claim map

The `WP04-DRSC-S` namespace was checked for collisions before assigning these IDs. Sources were accessed on 2026-10-09.

| ID | Source | Evidence used and limits |
|---|---|---|
| **WP04-DRSC-S01** | Canadian Food Inspection Agency, [Canadian Standards of Identity: Volume 3 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3) | Current page says breaded scallops have different cooked/uncooked meat percentages, scallop meat must be free of specified inedible/extraneous material, and shrimp cocktail is made from cooked, peeled shrimp meat. This distinguishes prepared products; it does not define dried shellfish. |
| **WP04-DRSC-S02** | Hong Kong Food and Environmental Hygiene Department, [Guide to Application for Food Trader Licence](https://www.fehd.gov.hk/english/forms/FSO_guide.pdf) | Government food-classification guide separates live/unprocessed shrimp/prawn and scallop from dried seafood; the dried list includes dried shrimp and dried scallop as separate entries. It does not define species or culinary equivalence. |
| **WP04-DRSC-S03** | Taichung District Agricultural Research and Extension Station, [精挑細選買乾貨 (Selecting Dried Goods)](https://www.tcdares.gov.tw/ws.php?id=1526) | Describes `蝦米` as dried small shrimp with two source-described types, including differences in size, shape, and shell/head removal; notes salt/moisture sensitivity and a brief warm-water soak for `冬蝦`. Describes `干貝` as dehydrated bivalve adductor muscle and gives a source-specific soak/soften method. Does not establish universal cross-region aliases or ratios. |
| **WP04-DRSC-S04** | Hong Kong Centre for Food Safety, [FAQ on conversion factors for dried/dehydrated foods](https://www.cfs.gov.hk/english/whatsnew/whatsnew_fstr/whatsnew_fstr_PA_Food_Adulteration_Metallic_Contamination_FAQ_Metals.html) | Gives source-based water-content ranges and contaminant-limit factors for dried shrimp and dried scallop. The method is for proportionally adjusting metal maximum limits, not cooking yields; the CFS explicitly notes species, season, geography, and process variation. |
| **WP04-DRSC-S05** | OQLF Grand dictionnaire terminologique, [crevette séchée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8435043/crevette-sechee) | OQLF preferred term; definition says small, peeled, dried, strongly salty shrimp. It also lists uses in soups, vegetables, salads, and noodles. The 1982 entry is not a universal species, salt, or shell-state standard. |
| **WP04-DRSC-S06** | OQLF Grand dictionnaire terminologique, [pétoncle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle) | OQLF-normalized Quebec term for `scallop`; under this commercial name in Quebec, only the adductor muscle, sometimes with roe, is sold, not the whole animal. `Coquille Saint-Jacques` is discouraged for Canadian scallops because it refers to specified European species. This supports the base FR term, not a dried-product definition. |
| **WP04-DRSC-S07** | Lee Kum Kee Canada, [Fine Seafood XO Sauce (fr-CA)](https://ca.lkk.com/fr-ca/products/fine-seafood-xo-sauce) | Canadian French ingredient list separately names `crevettes séchées (crevettes nordiques Mauxia)` and `pétoncles séchés`. It is one compound sauce's label and does not support species-wide aliases, measures, or substitutions. |
| **WP04-DRSC-S08** | Hong Kong Department of Health EatSmart, [Stewed Steamed Rice with Conpoy & Egg](https://restaurant.eatsmart.gov.hk/eng/content.aspx?content_id=750) | Recipe explicitly glosses `Dried scallops (conpoy)` and lists 15 g for two servings. A recipe-specific quantity only. |
| **WP04-DRSC-S09** | Taiwan Health Promotion Administration, [MyPlate Handbook PDF](https://health.hpa.gov.tw/UploadFolder/upload/files/04_%E8%81%B7%E5%A0%B4%E5%81%A5%E5%BA%B7%E6%88%91%E7%9A%84%E9%A4%90%E7%9B%A4.pdf) | Dietary exchange table gives 10 g dried shrimp and 10 g dry scallop (`乾干貝`) as one disposable soup spoon each, within a Taiwan low-fat protein-food exchange portion list. The spoon volume/fill is not specified. Not a global unit mapping. |
| **WP04-DRSC-S10** | Hong Kong Centre for Food Safety, [Food Classification — Part C(iii)](https://www.cfs.gov.hk/english/public/public_fifdrs/files/fehe245_a1.pdf) | Current 2026-03 food-classification guide separates dried seafood (including dried shrimp and dried scallop) from live/unprocessed shellfish, other processed aquatic products, concentrated soup/mix/paste/broth/bouillon, and seasoning powders. Classification evidence only; it does not decide ingredient formulation or substitutions. |

Adjacent boundary evidence already recorded in the shared ledger, not assigned a new WP04 source ID: `WP05-SEA2-S01` (Thai Community Product Standard TCPS 61/2561) supports the existing Kapi identity's fermented shrimp-paste boundary; see ledger record `ingredient-ref-kapi-shrimp-paste`. It is not evidence that dried shrimp and Kapi are aliases or substitutes.

## Coordinator follow-up

1. Decide whether to accept the two separate identity candidates and source-supported aliases after cross-proposal review.
2. Keep dried shrimp and dried scallop separate; preserve source-specific product qualifiers; keep powders, pastes, stock, fresh/cooked shellfish, and other dried seafood out of the proposed aliases.
3. Leave density, unit mapping, rehydration yield, cooking conversion, and substitution inactive unless a future source supports a well-scoped rule.
4. Leave the broad Section P item open.

## Coordinator integration — 2026-10-09

Accepted `ingredient-ref-dried-shrimp` (`dried shrimp` / `crevette séchée`) and `ingredient-ref-dried-scallop` (`dried scallop` / `pétoncle séché`), with only the supported plural and `conpoy` aliases recorded in the catalog. No recipe links, forms, density, unit mappings, rehydration yields, conversions, or substitutions were added. The source-specific contaminant factors and undefined dietary-spoon portions remain evidence only. Section P stays open.

At integration, the package grew from the proposal-time snapshot of 447 references, 17 forms, 614 research-ledger records, 764 source entries, 99 legacy candidates, and 114 recipes / 1,123 ingredient rows to 453 references, 17 forms, 620 records, 808 source entries, 99 legacy candidates, and 114 recipes / 1,123 rows. Current reference, form, manifest, ledger, and recipe-corpus SHA-256 values are recorded in the global checklist and workflow checkpoint. The final package and Android/emulator verification results are also recorded there.

The proposal research itself changed only this file. The later coordinator integration changed canonical seed references and ledger, generated index, checklist, workflow, roadmap, and relevant tests; recipe data was unchanged by this packet's integration.
