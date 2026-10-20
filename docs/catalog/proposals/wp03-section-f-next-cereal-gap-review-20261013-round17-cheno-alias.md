# WP03 Section F — common-millet `cheno` alias review (2026-10-13, round 17)

## Review record

- **Status:** Integrated in [the round-17 integration README](../batches/wp02-wp03-wp04-round17-gap-review-integration-20261013/README.md).
- **Scope:** Decide whether the exact spelling `cheno` belongs as an English search alias on the existing common-millet grain, `ingredient-ref-common-millet`.
- **Next-gap selection:** Round 15 accepted `chena` and explicitly left `cheno` and `cheena` for separate review. Round 16 accepted `barri` and again left `cheno` and `cheena` inactive. This packet reviews only `cheno`; it does not repeat the finger-millet-rava hold (round 12), black-fonio `iburu` alias (round 13), foxtail-millet `navane` alias (round 14), `chena` (round 15), or `barri` (round 16).
- **Plan location:** Section F's species-level grain review remains open at [plan lines 2147–2161](../../RecipeBook-global-ingredient-catalog-plan.txt#L2240). The current common-millet row is scoped to *Panicum miliaceum* and now has `proso millet`, `chena`, and `barri` as English aliases.
- **Recommendation:** Add only **`cheno`** to `aliasesEn` for `ingredient-ref-common-millet`. Keep `millet commun` as the French display. Do not add it to the separate proso-millet-flour row.

## Identity and evidence boundary

The Indian Council of Agricultural Research's Indian Institute of Millets Research (ICAR–IIMR) multilingual table lists English `Proso Millet` and Gujarati `Cheno` on the same species entry. The page footer says it was updated 2026-07-07. This is primary, current regional-name-to-crop evidence; it does not establish Canadian or Québec naming practice [reused source `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`].

A1 Indian Grocery Online in Barrie, Ontario, lists **“Proso Millet 2.2LB (Chena / Cheno / Barri)”**. The product page has an add-to-cart control, and the retailer's current shop page places the item in its MILLET category with an add-to-cart option. This gives current Canadian retail wording for `Cheno` on a proso-millet grain product. It remains retailer copy: no botanical name, package ingredient declaration, or kernel-processing state is shown. The page warns that inventory can change [reused source `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01`].

The Office québécois de la langue française (OQLF) GDT identifies *Panicum miliaceum*, gives `millet commun` as a preferred Québec French term, and lists `common millet` and `proso millet` in English. The entry was last updated in 2010 and does not mention `Cheno` [reused source `WP03-S180`]. Mayrand's current Québec product page calls its product **“Graines de millet crues 1 kg”**; it does not identify a species or use `Cheno`. These Québec sources support preserving the French display and document local generic grain wording, not a French alias or local use of the regional spelling [reused source `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02`].

Health Canada's crop-group listing separates proso millet (*Panicum miliaceum* subsp. *miliaceum*) from other millet taxa. It supports the existing species boundary, not `Cheno`, a consumer label, or a recipe-measure claim [reused source `WP03-S181`].

| Candidate or neighbor | Decision | Boundary |
|---|---|---|
| `cheno` | Add only as an English search alias on `ingredient-ref-common-millet`. | ICAR–IIMR maps Gujarati `Cheno` to proso millet, and a current Canadian retailer applies the spelling to its proso-millet grain listing. It is a search name for the existing grain, not a new identity. |
| `cheno flour`, `cheno atta`, and other flour-qualified queries | Leave unassigned. | The reviewed Canadian listing is a grain product. No reviewed source establishes these flour names. Preserve the separate `ingredient-ref-proso-millet-flour` row and its existing `proso millet atta` alias. |
| `chena` and `barri` | Keep their current ownership on common millet. | These were separately reviewed and integrated in rounds 15 and 16. This packet adds neither spelling again. |
| `cheena` | Leave inactive for separate review. | ICAR–IIMR lists `Cheena` under other language labels, including Bengali and Punjabi. The evidence for exact Gujarati `Cheno` does not authorize this separate spelling. |
| French `cheno`, `millet cheno`, and French aliases | Do not add. | Neither OQLF nor the reviewed Québec retail listing uses `Cheno`; retain `millet commun` as the French display. |
| Generic `millet` / `mil` and other millet species | Keep existing ownership unchanged. | This review does not move generic millet terms or names of other species to the common-millet row. |

The catalog identity remains the edible cereal grain *Panicum miliaceum*. No claim is made about cultivar, hull status, color, or processing. The alias does not create a flour, feed, prepared cereal, or species-agnostic millet identity.

## Proposed catalog delta

| Field | Current | Proposed |
|---|---|---|
| ID | `ingredient-ref-common-millet` | Unchanged |
| English display | `common millet` | Unchanged |
| French display | `millet commun` | Unchanged |
| English aliases | `chena`, `proso millet`, `barri` | Add only `cheno` |
| French aliases | `[]` | Unchanged |
| Category | `GRAIN_AND_CEREAL` | Unchanged |
| Default density / unit mappings | `null` / `[]` | Unchanged |
| Forms, recipe links, substitutions | None | None |

The separate `ingredient-ref-proso-millet-flour` remains `proso millet flour / farine de millet commun`, with its existing `proso millet atta` alias. Do not create a new reference, form, flour alias, recipe link, or grain-to-flour relation.

## Exact ownership and picker projection

The read-only audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and NFKD normalization, diacritic and ligature folding, punctuation-to-space conversion, and whitespace collapse. Complete normalized phrase matching runs before partial matching. The following is a static projection of current JSON and that code path, not runtime picker or emulator QA.

| Surface | Current finding |
|---|---|
| Active ingredient references | No exact normalized `cheno` owner. `ingredient-ref-common-millet` owns `common millet / millet commun` and English aliases `proso millet`, `chena`, and `barri`. `ingredient-ref-proso-millet-flour` remains separate. |
| Ingredient forms | 98 forms checked; none belongs to common millet, and no form label or match term is `cheno`. |
| Legacy import candidates | 64 candidates checked; no exact `cheno` owner. |
| Research ledger | 1,657 records checked. The existing A1 source title includes `Cheno`, but there is no separate accepted `cheno` decision. Rounds 15 and 16 explicitly left it inactive. |
| Proposal and batch archive | No focused round-17 `cheno` packet exists before this file. Round 15 and round 16 proposals and integrations are the prior decisions for this same spelling, both leaving it to separate review. |

| Query | Current projection | With only `cheno` added |
|---|---|---|
| `cheno` | No result | `ingredient-ref-common-millet` only |
| `cheno flour` / `cheno atta` | No result | No result; the grain alias does not imply a flour identity |
| `chena` / `barri` | Common millet only | Same results |
| `cheena` | No result | No result |
| `common millet` | Common millet only | Same result |
| `proso millet` | Common millet and proso-millet flour | Same two results |
| `proso millet flour` | Proso-millet flour only | Same result |
| `millet commun` | Common millet and proso-millet flour | Same two results |
| `millet` | 18 generic, species, flour, and processed-millet results | Same 18 results |

The change fills a zero-result exact query and leaves existing broad or flour-qualified queries unchanged.

## Recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. Whole-phrase searches of recipe text and ingredient-row values for `cheno`, `cheno flour`, `cheno atta`, `chena`, `barri`, `cheena`, `proso millet`, `common millet`, and `millet commun` found **zero recipe-file hits and zero ingredient-row hits**. There are **zero direct links** to `ingredient-ref-common-millet`. No recipe text or recipe link change is proposed.

The manifest-ordered corpus contains **753,792 bytes** and has fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The digest includes each manifest-relative recipe path and exact file bytes in manifest order.

## Measures, package sizes, and substitutions

- Keep `measurementState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`. The common-millet reference has no attached forms or package-yield observations. A1's **2.2 lb** and Mayrand's **1 kg** are listed package quantities, not recipe measures, portions, volume-to-mass conversions, densities, or cooking yields.
- Add no dry/cooked form, preparation state, conversion, yield, or measurement observation. `cheno` is an alias for the same grain and adds no numeric behavior.
- Keep `substitutionResearchState: not_yet_researched`; add no global or contextual substitution rule or recipe-line link. The live package-yield and global/contextual substitution JSON files contain no common-millet reference. No source reviewed here tests an ingredient replacement, dish role, method, or ratio for common millet.

## Proposal-time baseline and source ID / URL reuse audit

Snapshot checked on 2026-10-13 after rounds 15 and 16 were integrated: **1,344 active references**, **98 forms**, **64 legacy candidates**, and **1,657 ledger records** containing **6,421 source entries**, **5,379 distinct source IDs**, and **4,469 distinct URLs**. The common-millet reference has English aliases `chena`, `proso millet`, and `barri`; its density is null, unit mappings and forms are empty, and there are no direct recipe links.

No new source ID or URL is proposed. The exact live ledger source ID for the ICAR–IIMR page is `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`; it is already attached to common millet and proso-millet flour. The R15 and R16 proposal references and active plan now use the full ID exactly as it appears in the ledger. The same IIMR URL is also present under an existing kodo-millet source ID, so the selected ID is specifically the existing proso-millet crosswalk record.

| Reused source ID | Exact URL and collision note |
|---|---|
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | `https://millets.res.in/millets_info.php`; existing on common millet and proso-millet flour. This URL also appears under an existing kodo-millet source ID; reuse the proso-millet source ID. |
| `WP03-S180` | OQLF `millet commun` URL; already registered on common millet and also referenced under an existing WP02 flour source. Reuse `WP03-S180`. |
| `WP03-S181` | Health Canada crop-groups URL; already registered on common millet and reused elsewhere for crop taxonomy. Reuse `WP03-S181`. |
| `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` | A1 product URL `https://a1grocery.ca/product/proso-millet-2-2lb-chena-cheno-barri/`; this exact URL is registered once in the ledger under this ID. The current shop-page URL `https://a1grocery.ca/new-shop-page/` was already cited in the round-15 packet under the same source ID but is not a separate ledger URL registration; it is used here only to recheck the current listing, with no new ID or ledger URL proposed. |
| `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand `Graines de millet crues 1 kg` URL; already registered on common millet. Reuse it for the Québec French product wording and listed package size. |

This proposal adds no ingredient ID, form ID, measurement ID, yield ID, substitution ID, source ID, or new source URL.

## Source register

Sources were reopened or checked on 2026-10-13. Source IDs and exact URLs are reused from the current ledger and prior catalog packets.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Reused `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | ICAR–Indian Institute of Millets Research, [Millets Information: common names in Indian languages](https://millets.res.in/millets_info.php), Proso Millet entry; footer says updated 2026-07-07. | Primary source places Gujarati `Cheno` under English `Proso Millet`. Supports the exact regional name-to-crop crosswalk, not Canadian retail usage, Québec French, package contents, or recipe quantities. |
| Reused `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` | A1 Indian Grocery Online, [Proso Millet 2.2LB (Chena / Cheno / Barri)](https://a1grocery.ca/product/proso-millet-2-2lb-chena-cheno-barri/) and previously cited [current shop listing](https://a1grocery.ca/new-shop-page/). | On 2026-10-13 the shop page showed the title under MILLET with an add-to-cart option; the product page presents the same title and package quantity. A1 is a Canadian retailer at 477 Grove Street East, Barrie, Ontario. Retailer copy is not a botanical identification or package ingredient declaration; page inventory may change. The 2.2 lb is package size only. |
| Reused `WP03-S180` | Office québécois de la langue française, [GDT: millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), preferred French terms, English translations, and Latin name. | Official Québec terminology supports `millet commun`, *Panicum miliaceum*, and English `common millet` / `proso millet`. Last updated in 2010; it does not mention `Cheno` or establish a current package label. |
| Reused `WP03-S181` | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal grains / crop subgroup 15-21E. | Lists proso millet (*Panicum miliaceum* subsp. *miliaceum*) separately from other millet taxa. Regulatory crop-group evidence only; no consumer alias or quantitative cooking data. |
| Reused `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand, [Graines de millet crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix-et-fruits-secs-vrac/graine-de-millet-crue-mayrand-chef-27825), product title and unit/package quantity. | Current Québec retailer wording documents generic raw millet grain and a 1 kg package. It does not use `Cheno` or identify the species; package quantity is not a household measure or density. |

## Disposition

**Recommend adding only `cheno` to the English aliases of `ingredient-ref-common-millet`.** ICAR–IIMR gives the current primary Gujarati-to-proso crosswalk, and a current Canadian retailer uses the exact spelling on a proso-millet grain listing. Keep `millet commun` as the Québec French display; the reviewed Québec product page is generic and does not attest `Cheno`. No recipe demand, package-derived measure, density, yield, or substitution behavior was found. Leave the flour row and all numeric fields unchanged.

## Root integration status

**Integrated:** `cheno` is now an English alias on `ingredient-ref-common-millet`. See the integration README for the shared data changes and static checks.
