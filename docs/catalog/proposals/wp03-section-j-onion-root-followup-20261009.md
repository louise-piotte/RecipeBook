# WP03 Section J onion and root identity follow-up

- **Reviewed:** 2026-10-09
- **Status:** Proposal only. No shared catalog, research ledger, legacy file, recipe, plan, roadmap, code, or test file was changed.
- **Scope:** Remaining Section J onion names, fingerroot, wasabi root, eddoe, arrowhead, and explicitly adjacent unresolved tubers.
- **Recommendation:** Accept five identity-only candidates: yellow onion, Spanish onion, sweet onion, fingerroot, and wasabi root. Hold pearl/pickling onions, spring onion, eddoe, and the broad arrowhead name. Carry forward the existing oca/ulluco/mashua proposal without duplicating it.

## Snapshot and audit

The shared tree changed during this review. The final read-only snapshot below is the one used for this proposal.

| Artifact | Count | SHA-256 |
|---|---:|---|
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 577 references | 483ca85b139e436ed9d584c6dd1584bf5a6ff5026e49b160874b6534a9922d4f |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 33 forms | 275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732 |
| docs/catalog/research-ledger.v1.json | 753 records; 1,236 source entries; 1,048 distinct source IDs | cb51a416be272965edf70d105e89685763e6d378a02362f06cfd63cd34a26fe8 |
| docs/catalog/legacy-import-identities.v1.json | 92 candidates | 1a439d0f9949856f2720a6b69d422fcf75648f37db477a1b1f96ff3e6a35a603 |
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 1,123 ingredient rows | 3c50ccdabfb6bb2ed047f7106338bace0e2c251d50e60c4513b465304e2856d8 |

The recipe corpus digest hashes each manifest-listed relative recipe path, a NUL byte, that recipe file’s SHA-256 hex digest, and a newline, in manifest order.

I scanned all 577 active references, all 33 forms, all 92 legacy candidates, the 753 ledger records, and every ingredient row in the 114 manifest recipes. Candidate names were checked by exact normalized key against active reference names and aliases, form labels and match terms, and legacy names and aliases. The recipe scan checked whole-phrase matches in each row’s original text, ingredient name, reference ID, and preparation strings. Normalization follows the app search routine: lowercase, Unicode NFKD, fold œ/æ/ß and ampersand, remove combining marks, and collapse punctuation and whitespace.

No form is attached to any reviewed Section J reference or proposed candidate. All five proposed IDs are absent from active references, forms, legacy candidates, and ledger records. Of the five proposed names, yellow onion is currently an alias of generic onion; the other four names have no exact active owner. No proposed phrase is owned by a form, legacy candidate, or ledger record. The exact current owners are recorded below.

## Identity-only candidates

All five candidates belong in VEGETABLE_AND_AROMATIC. They should have null density and empty unit mappings, with no forms or numeric data.

| Candidate ID | Recommendation | EN / proposed fr-CA display | Alias proposal and boundary |
|---|---|---|---|
| ingredient-ref-yellow-onion | Accept | yellow onion / oignon jaune | No additional aliases. Move the existing yellow onion alias from generic onion to this candidate if integrated, and remove the English phrase from generic onion’s French alias array. Keep recipe links unchanged in this proposal. OQLF directly pairs the English and French terms and identifies Allium cepa. [S01] |
| ingredient-ref-spanish-onion | Accept | Spanish onion / oignon d’Espagne | No aliases. Keep distinct from generic onion and sweet onion. OQLF identifies a named class of large-bulbed mild onions; this does not make every Spanish onion a synonym of every sweet onion. [S02, S05] |
| ingredient-ref-sweet-onion | Accept | sweet onion / oignon doux | No aliases. Health Canada uses this exact bilingual food name, and Agriculture and Agri-Food Canada classifies sweet onions among Canadian dry onion types. Do not map Spanish onion or a named sweet cultivar to this broad class without product-specific evidence. CNF serving entries were not treated as measurements. [S03, S04, S05] |
| ingredient-ref-fingerroot | Accept | fingerroot / krachai | Candidate EN alias: Chinese key. Candidate FR spelling aliases: kachai and krachaï. Keep Chinese ginger, lesser/false galangal, small galangal, camphor galangal, and petits doigts inactive; those source-attested names risk collisions with the existing ginger and galangal identities. The proposed French display is borrowed culinary usage documented in Québec, not an OQLF-preferred term, and remains provisional pending independent review. [S10–S12] |
| ingredient-ref-wasabi-root | Accept | wasabi root / racine de wasabi | No aliases. Keep unqualified wasabi/wasabe and Japanese horseradish/raifort japonais out of the root row: OQLF says the name covers both the plant and the condiment made from its root. Do not map prepared wasabi paste or powder to this root identity. [S13] |

The yellow-onion proposal addresses an exact current collision: yellow onion is presently an English alias of generic onion and is also incorrectly stored in that reference’s French alias array. If the candidate is accepted, the active English alias should belong to the named yellow identity; this proposal does not relink the four existing yellow-onion recipe rows.

## Existing identities and current owners

| Current identity or phrase | Exact current state | Review result |
|---|---|---|
| onion / oignon | ingredient-ref-onion; English alias yellow onion; French aliases gros oignon and yellow onion | Keep the generic identity. Yellow onion is proposed as a separate named identity above. The French alias array’s English phrase is a language-key error. The generic gros oignon alias was not promoted or used to name another identity in this review. |
| red onion / oignon rouge | ingredient-ref-red-onion | Existing verified identity. Keep separate from generic onion and other color classes. |
| white onion / oignon blanc | ingredient-ref-white-onion | Existing verified identity. Keep separate from generic onion and other color classes. |
| shallot / échalote française | ingredient-ref-shallot; EN aliases eschalot and shallots; FR alias échalote sèche | Existing verified identity. Keep unqualified échalote inactive because Québec usage overlaps with immature onion and ciboule. |
| green onions / oignons verts | ingredient-ref-green-onions; EN alias scallions | Existing row, currently unreviewed in the ledger. OQLF supports oignon vert and oignon nouveau, but its Québec note documents overlap among immature onion, ciboule, and shallot. Do not add spring onion, oignon nouveau, or unqualified échalote in this proposal. [S07, S09] |
| garlic, leek, chives, Chinese chives, ginger, turmeric, greater galangal, horseradish, taro, malanga, true yam, cassava root, potato, Russet potato, sweet potato, and arracacha | Existing active references | No new identity proposed. The current catalog keeps ground ginger and ground turmeric separate from the whole-root identities, taro separate from malanga and true yam, and Russet potato separate from generic potato. |

The active reference file also contains exact names for the resolved red/white onion, shallot, chive, garlic-scape, horseradish, galangal, taro, malanga, true-yam, Russet, cassava, and arracacha identities. No reviewed phrase is owned by a form. The legacy file still has same-ID unreviewed duplicates for ingredient-ref-shallot and ingredient-ref-chives; these are stale legacy records, not new identities. The ledger has no entries for the five proposed IDs. Existing identity records for generic onion, garlic, green onions, leek, ginger, turmeric, and generic potato remain unreviewed; the verified rows and states are reflected in the source packet.

The exact relevant ledger states are:

| Record ID | Identity | Measurement | Substitution |
|---|---|---|---|
| ingredient-ref-onion | unreviewed | blocked_pending_evidence | not_yet_researched |
| ingredient-ref-green-onions | unreviewed | not_yet_researched | not_yet_researched |
| ingredient-ref-garlic | unreviewed | blocked_pending_evidence | not_yet_researched |
| ingredient-ref-leek, ingredient-ref-ginger, ingredient-ref-ground-ginger, ingredient-ref-turmeric, ingredient-ref-ground-turmeric | unreviewed | not_yet_researched | not_yet_researched |
| ingredient-ref-potato | unreviewed | blocked_pending_evidence | not_yet_researched |
| ingredient-ref-sweet-potato | unreviewed | not_yet_researched | not_yet_researched |
| ingredient-ref-red-onion, ingredient-ref-white-onion, ingredient-ref-shallot, ingredient-ref-chives, ingredient-ref-chinese-chives, ingredient-ref-garlic-scape, ingredient-ref-greater-galangal, ingredient-ref-horseradish, ingredient-ref-taro, ingredient-ref-malanga, ingredient-ref-yam, ingredient-ref-russet-potato, ingredient-ref-cassava-root, ingredient-ref-arracacha | verified | not_yet_researched | not_yet_researched |

The ledger record named “medium onion” is a source-free unit_definition with no measurement evidence. It does not support any count-to-weight value, serving-size default, or conversion.

## Recipe demand and no-link boundary

The complete 1,123-row scan found:

| Current link / exact ingredient wording | Demand |
|---|---:|
| ingredient-ref-onion | 14 rows |
| └ 7 unspecified onion lines | 7 rows |
| └ yellow onion | 4 rows: 027#2, 037#3, 066#2, 078#2 |
| └ red onion | 1 row: 018#4 |
| └ Spanish onion | 1 row: 096#3 |
| └ sweet onion | 1 row: 101#4 |
| ingredient-ref-green-onions | 2 rows: 019#6 and 066#3 |
| ingredient-ref-garlic | 15 rows |
| ingredient-ref-leek | 2 rows |
| ingredient-ref-ginger | 3 rows |
| ingredient-ref-turmeric | 2 rows |
| ingredient-ref-potato / ingredient-ref-russet-potato | 2 / 1 rows |
| ingredient-ref-sweet-potato | 2 rows |
| fingerroot, krachai, wasabi, eddoe, arrowhead, wapato, oca, ulluco, mashua | 0 ingredient-row phrase hits each |

The four named onion candidates each have one direct recipe-line use, but all four lines currently point to generic onion. This proposal changes no recipe text or reference link. It proposes no relinks, forms, conversions, yields, serving sizes, densities, or substitutions.

## Hold and defer decisions

| Name or boundary | Recommendation | Reason and rejected aliases |
|---|---|---|
| Pearl, cocktail, pickling, or small onions | Hold | OQLF defines petit oignon as an immature Allium cepa bulb barely formed before maturity and reserves pearl/cocktail names for small onions used for pickling. The identity-versus-size/maturity decision remains open, and there are no recipe-row hits. Do not alias pearl onion, cocktail onion, pickling onion, oignon perle, oignon perlé, or oignon à mariner to generic onion, nor to preserved pickled onions. [S08] |
| Spring onion | Hold | OQLF lists spring onion under oignon vert, but its same Québec entry explains the local overlap among immature Allium cepa, ciboule, and shallot. No recipe row uses spring onion. Keep it out of the green-onion and shallot aliases pending a context-specific regional decision. [S07, S09] |
| Eddoe / eddo / dasheen / arvi / kalo | Defer | CFIA groups taro, arvi, dasheen, eddo, and kalo under Colocasia esculenta for import classification. FAO distinguishes an eddoe cultivar type from dasheen but says these names are not consistently applied and intermediate forms occur. This does not justify a broad eddoe alias on taro or a stable separate fr-CA display. Do not merge with taro or malanga; no recipe row uses these names. [S14, S15] |
| Arrowhead | Defer | USDA NRCS documents edible Sagittaria latifolia tubers and the names broadleaf arrowhead, Indian potato, tule potato, and wapato. USDA APHIS separately documents Sagittaria sagittifolia as Arrowhead and a food tuber. The common name therefore does not establish one species or product; no Québec French food name or bundled recipe demand was found. Do not alias arrowhead to potato, water chestnut, arrowroot, taro, or wapato. A species-scoped wapato candidate needs separate Québec terminology review. [S16, S17] |
| Oca, ulluco, mashua | Carry forward existing proposal | The current package still has no active owner, form, legacy owner, or ingredient-row hit for these terms. The existing proposal, docs/catalog/proposals/wp06-andean-tubers-review-20261009.md, recommends separate identity-only rows with narrowly scoped aliases and records the shared regional-name exclusions. Do not duplicate that proposal here. |
| Other adjacent listed roots | No new candidate | Arracacha, cassava root, taro, malanga, true yam, generic/sweet/Russet potato, horseradish, greater galangal, and lemongrass are already active. Preserve the current distinctions. Do not merge true yam with sweet potato or turnip with rutabaga; those are separate active identities. |

## Rejected alias boundaries

- Do not map Spanish onion and sweet onion to each other. Their source descriptions overlap in mildness, but neither source establishes synonymy.
- Do not leave yellow onion as an alias of generic onion if the separate yellow identity is integrated. Do not place the English spelling in aliasesFr.
- Do not map pearl/pickling onion phrases to generic onion or to a pickled product.
- Do not add spring onion or unqualified échalote to the green-onion or shallot rows.
- Do not map Chinese ginger, lesser/false galangal, or small galangal to fingerroot or ginger. The candidate is specifically Boesenbergia rotunda; common names that contain “ginger” or “galangal” are not sufficient to merge identities.
- Do not map wasabi, wasabe, Japanese horseradish, or raifort japonais to the root identity or the generic horseradish identity. The source term spans plant and condiment, while the candidate here is the root.
- Do not add eddoe, dasheen, or broad cocoyam aliases to taro or malanga from taxonomic grouping alone.
- Do not map arrowhead to wapato or another tuber without a species-qualified product.
- For the existing Andean proposal, keep ruba out of both oca and ulluco, cubio/cubios out of oca and mashua, and unqualified nabo/nabos out of mashua, as detailed in that proposal.

## Evidence register

All web sources below were consulted on 2026-10-09. The WP03 source IDs are proposal-local and have not been added to the shared research ledger.

| Source ID | Source and URL | Supports and limits |
|---|---|---|
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S01 | OQLF, oignon jaune: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296971/oignon-jaune | Directly pairs yellow onion / oignon jaune and identifies Allium cepa. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S02 | OQLF, oignon d’Espagne: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083678/oignon-despagne | Directly pairs Spanish onion / oignon d’Espagne and defines large-bulbed, mild-flavored onions. It does not equate all Spanish onions with all sweet onions. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S03 | Health Canada, Canadian Nutrient File, Onion, sweet, raw / Oignon, doux, cru: https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5414 | Supports the bilingual food name only. Its portion values are not proposed as conversions or catalog measurements. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S04 | Agriculture and Agri-Food Canada, Crop Profile for Allium Vegetables in Canada, 2024: https://agriculture.canada.ca/en/science/agriculture-and-agri-food-research-centres/pest-management-centre/pesticide-risk-reduction-pest-management-centre/crop-profiles/crop-profile-allium-vegetables-canada-2024 | Separates dry onions, including storage and sweet onions, onion sets, and green onions; identifies Canadian green onion, scallion, leek, garlic, and shallot crops. Crop terminology, not alias permission for every regional term. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S05 | IGA Québec, Oignons: https://www.iga.ca/fr/articles/oignons | Regional corroboration that yellow, red, white, Spanish, Vidalia, pearl, green onions, and shallots are treated as different grocery names. Retail culinary descriptions do not establish equivalence or conversion data. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S06 | OQLF, oignon: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542439/oignon | Supports generic onion / oignon as Allium cepa and notes color varieties. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S07 | OQLF, oignon vert: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083674/oignon-vert | Defines immature onion, lists oignon vert/oignon nouveau and English spring onion/scallion terms, and documents Québec overlap with ciboule and shallot. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S08 | OQLF, petit oignon: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870618/petit-oignon | Defines immature small bulb and contextual pearl/pickling terminology. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S09 | OQLF, échalote: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083670/echalote | Supports shallot identity and explains the Québec ambiguity with immature onion and ciboule. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S10 | Royal Botanic Gardens, Kew, Plants of the World Online, Boesenbergia rotunda: https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:872224-1/general-information | Accepted species; Kew describes fingerroot as a culinary herb used in Thai cuisine as krachai and in food as a flavoring/vegetable. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S11 | Japan International Research Center for Agricultural Sciences, Boesenbergia rotunda: https://www.jircas.go.jp/en/database/thaivege/019 | Gives fingerroot and Chinese key as English names, Krachaai as a local name, and describes rhizome use as a spice. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S12 | Eh Toque!, Krachai ou kachai (Boesenbergia rotunda): https://ehtoque.ca/2020/04/24/krachai-ou-kachai-boesenbergia-rotunda/ | Québec French culinary source identifies the species, uses krachai/kachai/krachaï, and reports finding krachai in Québec. Its additional ginger/galangal-like names are excluded from aliases. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S13 | OQLF, wasabi: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533049/wasabi | Identifies Eutrema japonicum, says its root is used to make the condiment, and notes the condiment is also called wasabi. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S14 | Canadian Food Inspection Agency, D-94-26: https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/94-26 | Groups taro, arvi, dasheen, eddo, and kalo under Colocasia esculenta for phytosanitary import scope; this is not a culinary synonym standard. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S15 | FAO, Traditional post-harvest technology of perishable tropical staples, Chapter 5: https://www.fao.org/4/x5045e/x5045e07.htm | Describes eddoe and dasheen as rough Colocasia cultivar types and notes inconsistent application/intermediate forms. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S16 | USDA NRCS, Broadleaf Arrowhead, Sagittaria latifolia: https://plants.usda.gov/DocumentLibrary/plantguide/pdf/cs_sala2.pdf | Documents edible S. latifolia tubers and names including broadleaf arrowhead and wapato. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S17 | USDA APHIS, Weed Risk Assessment for Sagittaria sagittifolia: https://www.aphis.usda.gov/sites/default/files/sagittaria-sagittifolia-wra.pdf | Separately calls S. sagittifolia Arrowhead and records its food tuber, showing that unqualified arrowhead does not identify one food species. |
| WP03-SECTION-J-IDENTITY-FOLLOWUP-20261009-S18 | OQLF, taro: https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro | Supports the existing taro identity and its Colocasia scope; it does not support an eddoe alias. |

No tests were run. This file is a proposal only; implementation, source-ledger updates, plan changes, and recipe-link decisions remain with the shared catalog owner.
