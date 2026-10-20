# WP03 Section F — Muri and murmura alias review (2026-10-13, round 11)

## Review record

- **Status:** Integrated by root in round eleven; the original review and integration record are preserved below.
- **Recommendation:** Add the regional names `muri` and `murmura` to `aliasesEn` on the existing `ingredient-ref-puffed-rice` row.
- **Scope:** Two bounded search aliases for the existing plain puffed-rice product. This does not create another identity, classify a variety or puffing method, add a French synonym, or review prepared snacks.
- **Plan context:** The active Section F checklist says puffed rice is integrated at its supported scope while “other specialized regional terms” remain open ([plan lines 2185–2192](../../RecipeBook-global-ingredient-catalog-plan.txt#L2278)).

## Prior review and ownership audit

The original puffed-rice identity review integrated `puffed rice / riz soufflé` with no aliases, forms, or numeric data ([identity batch](../batches/instant-oats-puffed-rice-identities.md#L10); [ledger record](../research-ledger.v1.json)). This review fills a new source-backed alias gap; it does not reopen the identity or replace that earlier product boundary.

The recent `chuda` review is adjacent but distinct. It added `chuda` to flattened rice and discussed Odisha `mudhi` as the separate puffed-rice neighbor; it did not assign `muri` or `murmura` ([round-four proposal](wp03-section-f-next-cereal-gap-review-20261013-round4.md#L21); [integration record](../batches/wp03-section-f-chuda-alias-integration-20261013/README.md)). The Nepal chiura review's `murai` wording is also a different spelling and was recorded only to distinguish puffed rice from flattened rice ([chiura review](wp03-section-f-chiura-beaten-rice-alias-boundary-review-20261012.md#L51)). No focused prior proposal or accepted ledger decision assigns `muri` or `murmura`.

A case-, accent-, punctuation-, and whitespace-normalized exact-key audit covered all active reference names and aliases, all 98 form labels and match terms, all 64 legacy-import candidates, and ledger record IDs. Neither `muri` nor `murmura` has an exact current owner in those fields. The ledger has no separate candidate for either spelling. The existing `ingredient-ref-puffed-rice` is the only owner for `puffed rice` and `riz soufflé`.

| Current row or neighbor | Current ownership | Boundary retained |
|---|---|---|
| `ingredient-ref-puffed-rice` | `puffed rice / riz soufflé`; aliases empty; `GRAIN_AND_CEREAL` | Proposed owner of the two rice-specific puffed-grain names. |
| `ingredient-ref-rice-cereal` | `crispy rice cereal / céréales de riz croustillantes` | Keep ready-to-eat crispy cereal and `riz croustillant` separate. |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`; regional aliases include `chira` and `chuda` | Keep rice flakes and their regional names separate from puffed rice. |
| `ingredient-ref-rice` | Generic rice | Do not transfer the aliases to raw rice. |

The NIFTEM PDF already appears in the ledger as `WP03-AVAL-20261012-S01` for its flaked-rice names. The puffed-rice section on that same source separately lists `Muri (Murmura)` and identifies flaked-rice names on another page. Reuse that source ID with a puffed-rice locator if the proposal is integrated; do not create a second ID for the same PDF. The additional sources below are new and collision-free.

## Identity, language, and product boundary

India’s Ministry of Statistics and Programme Implementation classifies `Rice puffed (murmura/ muri )` separately from `Rice flake (Chira/Chudwa/ Chidwa/Poha)`. The Government of India’s NIFTEM training material likewise names puffed rice as `Muri (Murmura)` and lists flaked-rice names separately. A Government of India KVIC project profile calls the product “Puffed Rice (Murmura).” Current Ontario retail listings pair `Murmura` and `Muri` directly with puffed rice. Together these sources support the two spellings as regional names for the existing heat-expanded rice-grain product, not new ingredient identities. [S01–S05; reused NIFTEM `WP03-AVAL-20261012-S01`]

Keep the proposed names in `aliasesEn` as non-French Latin-script search aliases, following the existing catalog pattern for regional names such as `chira` and `chuda`. Keep the current `nameEn` and `nameFr` values unchanged because this proposal addresses only aliases; it does not newly validate the French display. The existing ledger attributes Québec/Canada usage to Usito source `WP03-S102`, but the currently visible Usito entry marks `riz soufflé` F/E and marks `riz croustillant` Q/C for a Rice-Krispies product. Treat that mismatch as an inherited French-terminology question for separate review. No reviewed Québec source calls `muri` or `murmura` a French term, so add neither to `aliasesFr` and do not construct a French translation.

| Term or product | Disposition | Boundary |
|---|---|---|
| `muri`, `murmura` | Add as the only proposed aliases. | Regional names tied by official classifications and current Canadian product pages to puffed rice. |
| `mudi` | Hold outside this change. | NIFTEM lists it as a Bengali name, but it is not paired with puffed rice in the reviewed current Canadian listings or in MOSPI’s `murmura/muri` class. Keep it for a separately bounded review. |
| `mudhi` | Do not add here. | The Odisha `chuda` review already records it as a separate nearby name; retain that spelling and scope without equating it with `muri`. |
| `murai` | Do not add here. | Appears in the Nepal chiura source as a puffed-rice neighbor; that source does not establish it as a general Canadian picker alias. |
| `mamra`, `kurmura`, `hurum` | Do not add. | Some listings or technical material use these terms, but the reviewed evidence does not establish the same bounded, repeated Canadian label pairing as for `muri` and `murmura`. Product titles such as `Mamra Puffed Rice (Muri)` remain SKU evidence, not grounds to add every token. |
| Bhel puri, murmura mixture, seasoned snack mixes | Keep outside the row. | Prepared dishes and composite or seasoned products are not the plain rice-grain ingredient. |
| `puffed rice cereal`, `crispy rice cereal`, `riz croustillant` | Keep separate. | The existing crispy-cereal identity remains distinct from plain puffed rice. |

The evidence does not establish a universal cultivar, rice color, salt or oil content, or one puffing process. The KVIC profile describes a specific manufacturing process and says methods vary. Do not encode any of those product-specific details in the general reference.

## Exact picker projection

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds accents and punctuation, prefers complete word-phrase matches, then uses substring matching only when the phrase pass returns no rows. The static projection below includes all active reference terms and attached forms; the puffed-rice row currently has no forms.

| Query | Current picker result | With only `muri` and `murmura` added |
|---|---|---|
| `muri` | No result | Sole result: `ingredient-ref-puffed-rice` — `puffed rice / riz soufflé` |
| `murmura` | No result | Sole result: `ingredient-ref-puffed-rice` — `puffed rice / riz soufflé` |
| `puffed rice` or `riz soufflé` | `ingredient-ref-puffed-rice` | Same sole result. |
| `puffed rice cereal` | No result | No result; no broader cereal alias is added. |
| `crispy rice cereal` or `riz croustillant` | `ingredient-ref-rice-cereal` | Same distinct crispy-cereal result. |
| `muri mixture` or `murmura snack` | No result | No result; no prepared-dish phrase is added. |
| `poha` | Three results: corn poha, flattened rice (poha), red rice flakes | Same three results. |
| `chira` or `chuda` | `ingredient-ref-flattened-rice-poha` | Same flattened-rice result. |
| `mudhi`, `mudi`, `mamra`, or `kurmura` | No result | No result; these names are outside this alias decision. |

This is a static projection of the checked-in search behavior and data, not a live picker or emulator check.

## Recipe-demand scan

Every manifest-listed recipe file was scanned in full, along with every ingredient row and `ingredientRefId`. The candidate set included `muri`, `murmura`, `puffed rice`, `rice puff(s)`, `mudi`, `mudhi`, `murai`, `mamra`, `kurmura`, the current puffed-rice English/French displays, and adjacent poha and crispy-rice-cereal terms.

| Corpus measure | Result |
|---|---:|
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Exact candidate-term hits in serialized recipe files | 0 |
| Candidate-term hits in ingredient rows | 0 |
| Links to `ingredient-ref-puffed-rice` | 0 |
| Adjacent boundary hit | Recipe 040 mentions `céréales de riz croustillantes` and has `6 cups crispy rice cereal`, linked to `ingredient-ref-rice-cereal`; it is not puffed rice. |
| Total recipe bytes | 753,792 |
| Manifest-order corpus fingerprint | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order. No recipe link, recipe text, quantity, or substitution is proposed.

## Forms, measurements, and substitutions

| Dimension | Current evidence | Recommendation |
|---|---|---|
| Forms | No active form is attached to `ingredient-ref-puffed-rice`; no source distinguishes `muri` or `murmura` as a state or grade. | Add no `IngredientForm`; leave puffing as the existing product identity. |
| Measurement | The new Canadian listings show 100 g, 400 g, and 500 g package sizes, which are SKU net contents. The official statistics table uses tonnes as its reporting unit. KVIC/NIFTEM processing values describe manufacturing conditions, not household amounts, volume-to-mass conversions, or recipe yield. | Add no measurement observation, default measure, density, unit mapping, conversion, or package/cooking yield. Keep `measurementState: not_yet_researched`; this alias review is not a full portion study. |
| Substitution | The official and retailer sources describe puffed rice and its uses in cereal or snacks; none gives a tested replacement, amount, dish-specific rule, or method-qualified interchange with another grain. | Add no global or contextual substitution finding or rule. Keep `substitutionResearchState: not_yet_researched`. |

## Exact proposed fields and disposition

| Target | Proposed effect |
|---|---|
| `ingredient-ref-puffed-rice.aliasesEn` | Change from `[]` to `["muri", "murmura"]`. |
| `ingredient-ref-puffed-rice.updatedAt` | Set to `2026-10-13T00:00:00Z` when integrated. |
| `nameEn`, `nameFr`, `aliasesFr`, category | Keep `puffed rice`, `riz soufflé`, `[]`, and `GRAIN_AND_CEREAL` unchanged. |
| Density, unit mappings, forms, measures, conversions, yields | Keep `null`, `[]`, or absent as currently stored; add none. |
| Recipe links and substitutions | Add none. |
| New identity or legacy candidate | None. |
| Puffed-rice ledger record | Add the source records below and a narrow accepted alias decision; preserve existing identity decision and retain both research states as `not_yet_researched`. Add no measurement observation or substitution finding. |

**Recommendation: integrate the two aliases only.** Current official regional classification and processing evidence plus current Canadian puffed-rice listings support both names on the existing row. The proposal does not broaden the product to prepared snacks or add unsupported measurement, form, or substitution behavior.

## Source register and collision audit

Sources were checked on 2026-10-13. New source IDs `WP03-PUFFRICE-REGIONAL-ALIAS-20261013-R11-S01` through `S05` were absent from the current ledger, proposals, batches, and plan before drafting. Their exact URLs were also absent from the ledger. Reused IDs are identified explicitly and are not counted as new sources.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Reuse `WP03-AVAL-20261012-S01` | Indian Institute of Food Processing Technology / NIFTEM PMFME, [Puffed and Flaked Rice](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-based-product-Process-PPT.pdf), common names, pp. 1–2 / PDF slides 1–2. | The existing source is already recorded for flaked-rice terminology. Its puffed-rice section states `Puffed Rice or Muri (Murmura) or Hurum` and lists Hindi `Murmura` and Bengali `Mudi`; the following flaked-rice list is separate. Reuse the same source ID with this additional locator if integrated. It is technical training material, not a Canadian package label, a Québec terminology ruling, or household-measure evidence. |
| `WP03-PUFFRICE-REGIONAL-ALIAS-20261013-R11-S01` | Government of India, Ministry of Statistics and Programme Implementation, [National Product Classification for Manufacturing Sector, 2011 — Revised](https://www.mospi.gov.in/sites/default/files/main_menu/national_product_classification/NPCMS_2011_revised.pdf), PDF p. 43, product codes 2316101 and 2316105. | Separates `Rice flake (Chira/Chudwa/Chidwa/Poha)` from `Rice puffed (murmura/muri)`. This is an official statistical classification, not a retail product standard or recipe source. |
| `WP03-PUFFRICE-REGIONAL-ALIAS-20261013-R11-S02` | Government of India, Khadi and Village Industries Commission, [Puffed Rice (Murmura) Manufacturing Unit](https://www.kviconline.gov.in/pmegp/pmegpweb/docs/commonprojectprofile/PuffedRice.pdf), product introduction and process description. | Names puffed rice as murmura and describes one manufacturing process. The profile is a project model; process details are not universal and do not establish a household measure. |
| `WP03-PUFFRICE-REGIONAL-ALIAS-20261013-R11-S03` | Namaste Supermarket, Mississauga, [Teer Puffed Rice 500g](https://namastemississauga.ca/products/teer-puffed-rice-500gm/019a4e90-8b5a-788c-ac77-f05742bbc659), product title and description. | The retailer page says the product is “Known as ‘Murmura’” and lists its Mississauga, Ontario address. It supports Canadian product wording, not manufacturer-level composition or a transferable 500 g measure. |
| `WP03-PUFFRICE-REGIONAL-ALIAS-20261013-R11-S04` | Surma Supermarket, [ACI Pure Puffed Rice (Muri)](https://surmasupermarket.ca/products/aci-pure-puffed-rice-muri-400g), product title/details. | A Canadian retailer pairs `Muri` with `Puffed Rice`; the page was marked sold out when accessed, so it supports the label, not current availability. Its 400 g bundle is package data only. |
| `WP03-PUFFRICE-REGIONAL-ALIAS-20261013-R11-S05` | Walmart Canada, [Mother’s Recipe Basmati Murmura, 100 g](https://www.walmart.ca/en/ip/Mother-s-Recipe-Basmati-Murmura-100g/2HH9V014CDZ5), product title/details. | Current listing identifies `MOTHER'S MURMURA (Puffed Rice)` and is sold and shipped by Walmart. Walmart says product details may be supplied by vendors and are not independently verified; use it for Canadian listing wording only, not a manufacturer specification or household quantity. |
| Reuse `WP03-S102` | Usito, [riz](https://usito.usherbrooke.ca/d%C3%A9finitions/riz), entry `riz`, subentries `riz soufflé` and `riz croustillant`. | The current visible entry marks `riz soufflé` F/E and `riz croustillant` Q/C for a Rice-Krispies product. The existing ledger locator describes Québec/Canada usage, so this proposal flags a source/ledger terminology mismatch. It leaves `nameFr: riz soufflé` unchanged and proposes no French alias or claim that this is the Québec-preferred display. |

The proposed source-ID prefix has no prior record. The `ingredient-ref-puffed-rice` identity is already allocated; no candidate or new reference ID is proposed. Exact normalized ownership checks found no conflict for `muri` or `murmura` in active references, forms, or legacy candidates.

## Review-time baseline snapshot

Read-only baseline at proposal time on 2026-10-13. SHA-256 values cover exact file bytes. The recipe fingerprint uses the manifest-order method described above.

| Artifact | Count / bytes | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,342 references; 148 `GRAIN_AND_CEREAL`; 430,224 bytes | `1a66cb1c4ac57ffff1df85a058c94fe10d5d85385c3b2c12107326e712cc7d5f` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes; none on puffed rice | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,653 records; 6,345 source entries; 6,312,486 bytes | `4b85be2b024f00cc20bb2bafb80a8cbd549b70549cbe5107c41e03e2b71af0f0` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-order recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `BundledIngredientCatalog.kt` | 588,540 bytes | `35742dd9a9f5bb52b4eb45b1826fcf9633e58ffd4002ac97b95c1877a7ec0165` |
| Global substitution rules | 0 rules; 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rules; 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `package-yields.v1.json` | 1 record; 853 bytes; none for puffed rice | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |

## Static review checks

- Re-read the active Section F checklist, existing puffed-rice ledger entry, related rice identities/forms, and the round-four `chuda` and prior chiura/avalakki records.
- Recomputed normalized ownership, current and hypothetical picker projections, source-ID/URL collisions, package baseline hashes, and the complete recipe corpus scan from the current worktree.
- Reviewed the linked official and current Canada-facing sources. No application, unit, instrumentation, or emulator tests were run; this proposal makes no shared data change, and the repository rule exempts JSON-only catalog data additions from app testing.
- Checked the saved proposal for UTF-8 without BOM, mojibake markers, and trailing whitespace.

## Root integration result (2026-10-13)

Added `muri` and `murmura` to `ingredient-ref-puffed-rice.aliasesEn`. Registered the five new S01–S05 sources and reused `WP03-AVAL-20261012-S01` with its puffed-rice locator; recorded one accepted alias decision. The inherited Usito French terminology question remains open, so the display pair and French aliases are unchanged. Both research states remain `not_yet_researched`; no form, measurement, recipe link, or substitution was added.
