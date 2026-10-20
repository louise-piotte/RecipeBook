# WP03 Section F glutinous-rice alias boundary review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** proposal only. No catalog/database JSON, ledger, recipe, plan, roadmap, generated-code, or test file was edited for this proposal.
- **Scope:** resolve the remaining four terminology candidates on the existing glutinous-rice grain identity: English **waxy rice** and **sweet rice**, and Québec French **riz glutineux** and **riz doux**.
- **Why this remains open:** the active plant/grain register explicitly keeps those four terms inactive pending separate review ([register row](../batches/plant-grains-cereals.md#L93), [catalog summary](../batches/plant-grains-cereals.md#L181)). The plan already closed the separate **sticky rice / riz collant** review by retaining its hold due to Canadian product-label collisions ([plan lines 1860–1863](../../RecipeBook-global-ingredient-catalog-plan.txt#L1953)). This proposal does not reopen that completed decision. The existing [next-grain gap review](wp03-section-f-next-grain-gap-review-20261012.md) covers rye-berries Québec wording, not these rice aliases.
- **Recommendation:** add the four full phrases as aliases on the existing **ingredient-ref-glutinous-rice** identity, retaining its displays **glutinous rice / riz gluant**. Do not create a second rice identity or add numeric, preparation, or substitution data.

## Read-only package snapshot

The split seed package, the live research ledger, and every manifest-listed recipe were read before drafting. File hashes are SHA-256 over exact bytes. The recipe fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte, in manifest order.

| Artifact | Snapshot | SHA-256 or fingerprint |
|---|---:|---|
| ingredient-references.v1.json | 1,267 references; 121 GRAIN_AND_CEREAL | 37c7db4bb2034b048ca937ac5a0e4aac6d5246bbc22acddb865c216a6bb83abc |
| ingredient-forms.v1.json | 94 forms | 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| legacy-import-identities.v1.json | 65 candidates | 7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7 |
| research-ledger.v1.json | 1,575 records; 5,551 source entries; 4,587 distinct source IDs | 836a54898d9e7b7fe6a4012c58eec41937d0172746cd966249680c373ff004c2 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

All 114 paths named by the manifest existed. These counts and hashes identify the 2026-10-12 audit snapshot; refresh them before any future integration if the shared package has changed.

This is the proposal-time snapshot. The integration README records the refreshed live snapshot after
the same-day catalog updates and alias addition.

## Terminology boundary

The terminology evidence supports one rice type, with existing Canadian product usage for the candidate English and French names. OQLF’s GDT lists **riz glutineux**, **riz gluant**, and **riz doux** as preferred terms and gives **sweet rice** and **glutinous rice** in English. The older OQLF page was last updated in 1997; use its term fields only, not its explanatory claim about gluten. USDA NAL’s controlled agricultural thesaurus independently lists **sweet rice** and **waxy rice** as synonyms of the preferred concept **glutinous rice**, while distinguishing the rice variety from stickiness as a quality of other cooked or processed rice. Canada's 2018 federal procurement specification also groups “Sweet or Waxy Rice” as a rice type. Current Canadian listings provide local product wording: a Montréal retailer shows sweet-rice products under its “Glutinous Rice” category, and a Canadian French grocery index lists both **Riz glutineux** and **Riz doux thaïlandais**.

| Phrase | Recommendation | Boundary |
|---|---|---|
| **waxy rice** | Add as the only new English alias for this phrase. | NAL and the Canadian procurement class support the name for glutinous rice. Keep **waxy rice starch** separate: a source-specific waxy-rice starch record is not a grain alias, and the active rice-starch reference has no such alias. |
| **sweet rice** | Add as an English alias. | OQLF, NAL, a Canadian rice supplier, and a Montréal retailer support this name for the grain. Do not imply added sugar. The broad picker query will also show the existing generic glutinous-rice-flour row because its alias is **sweet rice flour**; see picker results below. |
| **riz glutineux** | Add as a French alias. | OQLF lists it as a preferred term; current Canadian French grocery product titles corroborate the wording. Keep the existing display **riz gluant**. |
| **riz doux** | Add as a French alias. | OQLF lists it as a preferred term; current Canadian French retail wording includes the qualified product **Riz doux thaïlandais**. Keep the regional/variety qualifier out of the global alias. |
| **sticky rice / riz collant** | Keep withheld. | The existing accepted ledger decision rejects these as global aliases because Canadian manufacturer and retailer labels also use them for short-grain sushi rice and a ready-to-heat rice product. The new sources do not overturn that evidence. |
| **sweet brown rice** | Do not add. | OQLF includes it among English terms, but it combines a glutinous-rice term with the separate brown-milling distinction. Keep the brown qualifier available through the existing brown-rice identity rather than attaching a compound term to only one axis. |
| **Thai sweet rice / riz doux thaïlandais** | Do not add as aliases. | These are source-qualified product names, not a universal region or variety specification for the glutinous-rice identity. |
| **sweet rice flour / sweet rice powder** | Keep on the existing flour identity only. | These are active manufacturer-supported aliases of glutinous rice flour. Do not copy them to the grain row. |

The term **glutinous** is not treated as an allergen or nutrient field. No gluten-free claim, ingredient-safety claim, or flour equivalence is proposed.

## Active, form, legacy, and ledger ownership

The audit compared normalized full names and aliases separately from phrase-in-query matching. Accent and punctuation folding follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L21), which prefers complete normalized word-phrase matches and uses substring fallback only if no phrase match exists.

| Surface | Current owner or state |
|---|---|
| Exact active grain identity | **ingredient-ref-glutinous-rice**, category GRAIN_AND_CEREAL; display **glutinous rice / riz gluant**; EN/FR alias arrays empty; defaultDensity null; unitMappings empty. This remains the sole target row. |
| Exact candidate aliases | **waxy rice**, **sweet rice**, **riz glutineux**, and **riz doux** have no exact active reference or form owner. |
| Nearby active flour identities | **ingredient-ref-glutinous-rice-flour** is **glutinous rice flour / farine de riz gluant** with EN aliases **sweet rice flour** and **sweet rice powder**. **ingredient-ref-mochiko-glutinous-rice-flour** and **ingredient-ref-shiratamako-glutinous-rice-flour** remain separate named flour products. No flour aliases move. |
| Other rice identity | **ingredient-ref-rice-starch** remains the starch product. Its ledger evidence discusses one source-specific waxy-rice starch; it does not assign **waxy rice** as an active grain or starch alias. |
| Ingredient forms | No form belongs to **ingredient-ref-glutinous-rice** and no form owns any of the four candidate phrases. Existing dry/cooked forms belong to generic rice; separate dry/cooked forms belong to white rice. Do not copy those states to this variety without evidence. |
| Legacy import candidates | None of the 65 candidates has an exact normalized name or alias for the four terms, **sticky rice**, or **riz collant**. No legacy ID is promoted or renamed. |
| Research ledger | **ingredient-ref-glutinous-rice** is identity-verified; measurement and substitution states remain **not_yet_researched**. Its accepted identity decision uses existing OQLF source WP03-S11; its separate sticky-rice decision is rejected with sources WP03-S11, WP03-S31, and WP03-S121–S124. No ledger decision currently accepts or rejects the four remaining aliases. The generic glutinous-rice-flour ledger record owns the flour aliases and remains separate. |
| Proposal-local sources | IDs WP03-GLUTINOUS-RICE-ALIAS-20261012-S01 through S05 were absent from current ledger source IDs and proposal/archive search before drafting. OQLF source WP03-S11 is reused rather than duplicated. |

## Picker-query behavior

These are static results under the current phrase-first search implementation, not emulator screenshots. Forms are included in the index, but no glutinous-rice form terms exist.

| Query | Current results | Results after the proposed aliases |
|---|---|---|
| **waxy rice** | No result. | Only ingredient-ref-glutinous-rice. |
| **riz glutineux** | No result. | Only ingredient-ref-glutinous-rice. |
| **riz doux** | No result. | Only ingredient-ref-glutinous-rice. |
| **sweet rice** | Only ingredient-ref-glutinous-rice-flour, through the longer alias **sweet rice flour**. | ingredient-ref-glutinous-rice and ingredient-ref-glutinous-rice-flour. This is an explicit grain/flour family overlap; the rows remain separately named and selectable. |
| **sweet rice flour** or **sweet rice powder** | Only ingredient-ref-glutinous-rice-flour. | Unchanged. The longer query does not match the proposed shorter grain alias under the current phrase direction. |
| **glutinous rice** or **riz gluant** | The grain identity plus the generic, Mochiko, and Shiratamako flour identities; the full phrase occurs within the flour names. | Unchanged. This is existing broad parent/product retrieval. |
| **sticky rice** or **riz collant** | No result. | Unchanged; the held terms remain inactive. |
| **waxy rice starch**, **Thai sweet rice**, or **riz doux thaïlandais** | No result. | Unchanged. These qualified queries are not added as aliases. |

## Complete bundled-recipe audit

All 114 recipe files named in the current manifest and all 1,123 ingredient rows were scanned. Both the complete serialized recipe text and each ingredient’s originalText and ingredientName fields were checked for **glutinous rice**, **riz gluant**, **waxy rice**, **riz glutineux**, **sweet rice**, **riz doux**, **sticky rice**, and **riz collant**. The scan found **zero matching files and zero matching ingredient rows**. No recipe link, quantity, form, or substitution is proposed.

Five nearby rice-related rows were checked and kept distinct:

| Recipe | Current ingredient row | Ownership |
|---|---|---|
| 040 — Chocolate Nutty Crisp | 6 cups crispy rice cereal | ingredient-ref-rice-cereal; processed cereal, not this grain |
| 066 — Korean Soy-Marinated Jammy Eggs | Cooked white rice, for serving | ingredient-ref-white-rice with ingredient-form-white-rice-cooked |
| 086 — Butter Chicken | cooked rice, for serving | ingredient-ref-rice with ingredient-form-rice-cooked |
| 090 — African Peanut Stew | cooked rice, for serving | ingredient-ref-rice with ingredient-form-rice-cooked |
| 093 — Fried Rice | 1/3 cup cooked rice | ingredient-ref-rice with ingredient-form-rice-cooked |

## Aliases, measurements, forms, conversions, substitutions, and recipe links

| Data area | Recommendation |
|---|---|
| English aliases | Add **waxy rice** and **sweet rice** to the existing grain row. Add no regional or brown-milling compound. |
| French aliases | Add **riz glutineux** and **riz doux**. Keep **riz collant** withheld. |
| Default density and unit mappings | Keep defaultDensity null and unitMappings empty. No ingredient-specific density or unit mapping is supported. |
| Measurements | Add none. No household amount, mass-per-volume value, portion, or transferable package measure is supported. |
| Ingredient forms | Add none. No dry/cooked form, variety-grade form, or preparation state is established for this row. Generic rice and white-rice forms remain on their own identities. |
| Conversions and yields | Add none. No grain/flour, dry/cooked, volume/mass, or cooking-yield relation is supported. The federal specification’s grain description is not a conversion. |
| Substitutions | Add no active global or contextual substitution. No evidence supports replacing this rice with ordinary rice, flour, or another grain. |
| Recipe links | Add none. The complete current bundled recipe set contains no matching ingredient line. |

## Proposal-local source register

Sources were checked on 2026-10-12. Proposal-local IDs S01–S05 were absent from the shared ledger at drafting. The existing OQLF source WP03-S11 is reused.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Existing WP03-S11 | Office québécois de la langue française, [GDT: riz glutineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux), preferred terms and English equivalents; record last updated 1997. | Supports the French terms **riz glutineux**, **riz gluant**, **riz doux** and English **sweet rice**, **glutinous rice**. The entry also lists **sweet brown rice**. It is terminology evidence for the grain, not flour or allergen data; this proposal does not use the older explanatory gluten statement. |
| WP03-GLUTINOUS-RICE-ALIAS-20261012-S01 | USDA National Agricultural Library, [NAL Thesaurus: glutinous rice](https://lod.nal.usda.gov/nalt/en/page/68074), synonyms and scope note; last modified 2019-10-01. | Uses **glutinous rice** as preferred term and lists **sweet rice** and **waxy rice** as synonyms. Its scope note separates rice-variety identity from stickiness of any cooked or processed rice. The concept definition and its 0–2% amylose range are not stored as catalog numeric data. |
| WP03-GLUTINOUS-RICE-ALIAS-20261012-S02 | Government of Canada, Department of National Defence, [A-85-269-002/FP-Z01, Table 2: Rice](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf), 2018 procurement specification. | Defines a “Sweet or Waxy Rice” procurement class and describes its particular grain and cooking characteristics. Supports the English synonym class in a federal specification; it is not a current consumer label or a universal cooking/measurement standard. |
| WP03-GLUTINOUS-RICE-ALIAS-20261012-S03 | Western Rice Mills Ltd., [ASIAN DRAGON US Sweet Rice](https://www.westernricemills.com/our-products/asian-dragon-us-sweet-rice), Canadian supplier/importer product page. | Current Canadian rice supplier page uses the product name **US Sweet Rice**. Supports local English market wording for this named product only; the page does not establish its formula, a generic measure, or a rice-state conversion. |
| WP03-GLUTINOUS-RICE-ALIAS-20261012-S04 | Lordford, Montréal, [Glutinous Rice product category](https://lordford.ca/product-category/grainsoils/rice/glutinous-rice/), current listings. | The retailer places **Daichi SWEET RICE** and **Elephant Rice Fancy Sweet Rice** under its **Glutinous Rice** category. Supports local market association between the product title and grain class; it is retailer catalog context, not a verified ingredient panel or terminology ruling. |
| WP03-GLUTINOUS-RICE-ALIAS-20261012-S05 | Loblaws, [French-language Canadian grocery index for “sticky rice”](https://www.loblaws.ca/fr/search?search-bar=sticky+rice), current product titles. | Lists products titled **Riz doux thaïlandais**, **Riz glutineux**, and **Riz glutineux grain court**. Supports current Canadian French product wording; the page is a retailer index and the listed terms remain product/variety-qualified, not ingredient panels or OQLF rulings. |

## Review disposition

Accept the four aliases on the existing **ingredient-ref-glutinous-rice** row while retaining **glutinous rice / riz gluant** as the display. Keep the existing sticky-rice hold, the brown-rice identity, the generic and named glutinous-rice-flour rows, and all current recipe links unchanged. If this recommendation is later integrated, record an alias-only decision; leave measurements, default density, mappings, forms, conversions, yields, substitutions, and recipe links absent.

