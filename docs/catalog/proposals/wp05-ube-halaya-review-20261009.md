# WP05 ube halaya review — 2026-10-09

Owner: `/root/sea_pantry_batch`. Scope: independently review the one pending ube halaya candidate in [`wp05-southeast-asian-condiments-followup.md`](wp05-southeast-asian-condiments-followup.md). The research packet was proposal-only; the coordinator integration result below records the accepted, scoped row. This does not complete Section X or WP05.

## Recommended identity

| Field | Recommendation |
|---|---|
| ID | `ingredient-ref-ube-halaya` |
| English display | `ube halaya (purple yam jam)` |
| Québec French display | `confiture d’ube (ube halaya)`; descriptive and provisional pending independent Québec review |
| Category | `SAUCE_AND_CONDIMENT`, following the current `raspberry jam` reference. This is the closest existing category for a sweet spread; the taxonomy has no jam/spread category. |
| English alias | `purple yam jam` — explicitly accepted as a product label by the Philippine standard for this product class. |
| French alias | `confiture d’ube` — supported by French usage and a Québec restaurant menu; retain `ube` without an accent as the source crop/product name. |
| Other aliases | None recommended at this review. In particular, do not activate bare `ube`, `purple yam`, `halaya`, or `ube jam` as an unqualified global alias. |
| Numeric/form/substitution data | None. Keep density, unit mappings, forms, package yields, and substitution rules absent. |

The product identity is well supported. The most precise formal boundary is PNS/FDA 24:2010, which applies to thermally processed purple yam/ube (*Dioscorea alata*) jam (halaya). The standard defines the product as comminuted, sweetened purple yam cooked to a suitable consistency, hermetically packed, and heat processed. It permits milk, coconut milk, butter or margarine, and honey as optional ingredients, so those are not universal recipe requirements. Its title and labeling section recognize “Purple Yam Jam” and other country-accepted product names. See S1–S2 below.

The standard distinguishes the prepared product from its root ingredient. DOST-FNRI identifies purple yam as *Dioscorea alata* (Ubi/Ube), while purple sweet potato is *Ipomoea batatas* and taro is *Colocasia esculenta*. Keep fresh, frozen, dried, or powdered ube; ube extract/flavouring; purple sweet potato; taro; and the prepared jam as different identities or products. Do not let color alone make them aliases. See S3.

There is a material naming caveat around `ube jam`. King Arthur Baking reports that U.S. recipes and retail products often use “ube jam” and “ube halaya” interchangeably, while Filipino usage distinguishes commercial ube jam from traditional halaya by texture and use. The PNS standard permits “Ube Jam” as a name when accepted in the distribution country, but that does not resolve this market variation. The Canadian Gusta listing also sells a product titled “BUENAS Ube Jam (Purple Yam Spread)” and suggests it for ube halaya, yet describes that SKU as purple yam, sugar, water, flavour, and colour. Keep `ube jam` out of the global alias list until a Canada-specific product/name review establishes that it consistently identifies the intended halaya product. Likewise, do not add generic `purple yam spread`, `jam`, `sweet potato jam`, or `camote halaya` as aliases. See S2, S4, and S5.

## Québec French naming

`Confiture d’ube` is the best supported concise French description located in this review. The Oobé French recipe article calls the product “confiture d’ube”; a Québec restaurant menu listing uses “confiture d’ubé (igname pourpre)” for the filling in an ube cheesecake. The latter is local usage evidence, not a terminology authority, and its acute accent appears to be a menu spelling rather than part of the name `ube`. The OQLF search found a generic entry for *igname* but no ube-specific term. I found no bilingual Canadian retail label for this product. Keep the proposed display as `confiture d’ube (ube halaya)` and `confiture d’ube` as the French alias provisional until a Québec reviewer confirms the wording. See S6–S8.

## Measurement and substitution review

| Evidence area | What the sources support | Catalog disposition |
|---|---|---|
| Ingredient mass/volume | The PNS has packaging/net-content requirements but no kitchen mass-to-volume factor for ube halaya. The reviewed retailer does not give a volume for its listed 340 g SKU. | Density, mass/volume mapping, and conversion remain unknown. Do not infer a cup weight from the product’s net mass. |
| Recipe yield | Oobé gives a 300–350 g output for its own powder-based recipe and lists that recipe’s ingredient amounts. This is one publisher’s recipe batch, not a measured density, generic yield, or package-size rule. | Keep out of catalog numeric fields. It could only be retained later as a clearly attributed recipe-specific observation if the ledger model supports a range and the source/method are reviewed. |
| Direct substitutions | King Arthur describes ube jam as a filling/spread used in cake batter, cookie dough, layer cakes, and sweet buns. It describes frozen grated ube as a substitute for fresh ube, which concerns the root ingredient rather than prepared halaya. Oobé’s powder recipe is a method for making halaya, not a tested replacement for halaya in another dish. | No source-reviewed directional substitute or ratio for ube halaya itself. Do not infer that red bean paste, ube powder, extract, frozen ube, taro, or purple sweet potato can replace it. |

Measurement status for a future ledger record: `researched_no_supported_value` for general density/unit mapping; the one retailer package mass is SKU-specific and not an ingredient conversion. Substitution status: `researched_no_supported_substitute` for a direct, actionable replacement of ube halaya; published use descriptions do not provide a tested substitute or adjustment. No ledger record is created in this packet.

## Live catalog and recipe audit

Rechecked against the live files during this review:

| Input | Count/state | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 409 references | `718d0f07ab55d405c2a1d2001f7b6f824761b62408d8a11c78d896e19b2cad99` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 16 forms; no ube/halaya form | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `docs/catalog/research-ledger.v1.json` | 574 records; no ube/halaya text or candidate record | `076ce61627440765175055ec4ae409c72e99010c1d5ff1f2218652e8b9d93eef` |
| Bundled recipes | 114 recipe files | — |

Using `normalize_search_key` from `tools/seed_package/bundled_seed_package.py`, I checked the proposed ID, both display names, the proposed aliases, and considered terms (`ube`, `ube jam`, `purple yam jam`, `purple yam spread`, `halaya`, and `halayang ube`) against every live reference display name and alias. Proposed normalized display/alias keys are `ube halaya purple yam jam`, `confiture d ube ube halaya`, `purple yam jam`, and `confiture d ube`; none collides with a live key. The proposed ID is unused. The 114 recipe files were scanned for whole-word `ube`, `halaya`, purple-yam/jam/spread phrases, French `confiture d’ube` variants, and `halayang ube`: zero whole-file text hits and zero ingredient-line hits. No recipe relinking is indicated.

The earlier WP05 follow-up contains this pending identity row; other packet mentions are cross-references rather than separate proposals. This packet reviews that row rather than opening a duplicate. Its older live-state counts are superseded by the recheck above.

## Recommended acceptance checks

1. Accept only the prepared Filipino ube halaya / standard-defined purple yam jam identity under `ingredient-ref-ube-halaya`; retain `SAUCE_AND_CONDIMENT` by the existing jam precedent.
2. Review `confiture d’ube (ube halaya)` and `confiture d’ube` independently for Québec French. Do not claim OQLF endorsement or bilingual Canadian packaging evidence.
3. Add only the source-backed `purple yam jam` English alias if the integration reviewer accepts the PNS label within this product boundary. Keep `ube jam` inactive pending market-specific resolution; omit generic root names and flavoring/product aliases.
4. Keep raw ube, frozen/grated ube, ube powder, ube extract/flavouring, purple sweet potato, taro, and generic jams/spreads distinct.
5. Leave all forms, density/unit mappings, package yields, and substitution rules empty. Recheck the 409-reference normalized-key audit and all 114 recipe files immediately before integration because the shared seed changes frequently.
6. Keep broader Southeast Asian coverage and Section X marked open.

## Sources accessed 2026-10-09

| ID | Source and locator | Source-to-claim mapping |
|---|---|---|
| S1 | Philippine FDA, *CFRR User Manual for the Modified E-portal*, p. 158, listing PNS/FDA 24:2010 and PNS/FDA 25:2010: [official FDA PDF](https://www.fda.gov.ph/wp-content/uploads/2022/04/CFRR-User-Manual-for-the-Modified-E-portal-V2.pdf) | Official FDA-hosted confirmation of the standard number/title and the companion processing/handling code. |
| S2 | Philippine National Standard PNS/FDA 24:2010, *Purple Yam (Ube) Jam (Halaya) — Specification*, §§1, 4.1, 5.1, 11.2–11.3.1: [public copy of the standard](https://archive.org/download/pns.24.2010/pns.24.2010.pdf) | Scope, species, product/process boundary, optional ingredients, packaging/net-content limit, and permitted label names. This accessible public copy bears the DTI Bureau of Product Standards heading; it is not hosted on the FDA site. |
| S3 | Philippine DOST Food and Nutrition Research Institute, Food Composition Table, entries B009–B024: [food table](https://i.fnri.dost.gov.ph/fct/library/food_content/B) | Separates purple sweet potato (*Ipomoea batatas*) from purple yam (*Dioscorea alata*, Ubi/Ube) and taro (*Colocasia esculenta*). |
| S4 | King Arthur Baking, “Your guide to baking with ube,” sections “Ube jam” and “Frozen ube”: [article](https://www.kingarthurbaking.com/blog/2024/05/15/what-is-ube) | Documents U.S. naming/texture variation; gives source-scoped uses for jam and a fresh/frozen-root substitution, not a halaya replacement ratio. |
| S5 | Gusta Supplies Canada, “BUENAS Ube Jam (Purple Yam Spread), 340g,” product description and ingredients: [Canadian retailer listing](https://supplies.gusta.ca/products/buenas-ube-jam-purple-yam-spread-340g) | Canadian retail naming and one product’s listed 340 g net mass/ingredient statement. Retail copy, not a manufacturer label or generic measurement source. |
| S6 | Kalapaw restaurant menu through SkipTheDishes, dessert section: [Québec menu listing](https://www.skipthedishes.com/kalapaw-boul-des-sources-e) | Local French wording “confiture d’ubé (igname pourpre)” for ube jam in cheesecake; source-specific menu wording only. |
| S7 | Oobé, “Ube Halaya : la confiture violette philippine (recette maison),” sections “C’est quoi l’ube halaya ?” and recipe ingredients: [French-language article](https://oobe.fr/blogs/actualites/ube-halaya-recette) | French descriptive phrase “confiture d’ube” and one product recipe’s ingredient/yield description; not a Québec authority or general conversion. |
| S8 | OQLF, Grand dictionnaire terminologique, generic entry *igname*: [entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26515067/igname) | Confirms the generic French word *igname* for *yam*; it does not provide an ube-specific term. |

## Coordinator integration result

Accepted as `ingredient-ref-ube-halaya` in `SAUCE_AND_CONDIMENT`. Displays are `ube halaya (purple yam jam)` and the descriptive, provisional `confiture d’ube (ube halaya)`; aliases are limited to `purple yam jam` and `confiture d’ube`. The French wording remains open for independent Québec review. The ledger record uses source IDs WP05-UBE-S01–S08, records no supported general measurement or direct substitute, and does not activate `ube jam` as an alias. The 300–350 g yield from one powder-based recipe remains source-specific. No forms, density, unit mappings, package yields, conversions, or substitution rules were added. The normalized-key and 114-recipe scan remained clear at merge time. Package, unit-test, instrumentation, and live-picker results are recorded in [`../batches/wp05-ube-halaya.md`](../batches/wp05-ube-halaya.md).
