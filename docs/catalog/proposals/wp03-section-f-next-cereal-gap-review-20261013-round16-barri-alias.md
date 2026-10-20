# WP03 Section F — common-millet `barri` alias review (2026-10-13, round 16)

## Review record

- **Status:** Proposal packet; root integration is complete. The integrated result is recorded below and in the [round-sixteen integration](../batches/wp02-wp03-wp04-round16-gap-review-integration-20261013/README.md).
- **Scope:** Decide whether the exact regional grain name `barri` belongs as an English search alias on the existing common-millet grain, `ingredient-ref-common-millet`.
- **Distinct from recent reviews:** Round 15 added `chena` to this row. It explicitly left `barri`, `cheno`, and `cheena` unallocated for separate review. This packet addresses only `barri`; it does not repeat the finger-millet-rava hold (round 12), black-fonio `iburu` alias (round 13), foxtail-millet `navane` alias (round 14), or round-15 `chena` decision.
- **Plan location:** The Section F species-level millet review remains open at [plan lines 2147–2161](../../RecipeBook-global-ingredient-catalog-plan.txt#L2240). The active common-millet row is already scoped to *Panicum miliaceum* and currently has `proso millet` and `chena` as English aliases.
- **Recommendation:** Add only **`barri`** to `aliasesEn` on `ingredient-ref-common-millet`. Keep the French display `millet commun`; do not add `barri` to the separate proso-millet-flour row.

## Identity and evidence boundary

The Indian Council of Agricultural Research's Indian Institute of Millets Research (ICAR–IIMR) table maps English `Proso Millet` to Hindi `Chena; Barri`; the page reports an update on 2026-07-07 [reused source `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`]. This is primary, current regional-name-to-crop evidence. It establishes the crop mapping, not Canadian naming practice.

A1 Indian Grocery Online, a retailer in Barrie, Ontario, currently presents the product title **“Proso Millet 2.2LB (Chena / Cheno / Barri)”** with an add-to-cart control [reused source `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01`]. The direct product page was reopened on 2026-10-13. Its title places the exact spelling `Barri` on a proso-millet grain listing, but it is retailer copy rather than a package ingredient declaration or botanical identification. The search index's crawl timestamp is older than this review date; the page itself remained accessible and displayed the product and add-to-cart control. Do not treat the listing as a durable inventory claim.

OQLF's GDT identifies *Panicum miliaceum*, gives `millet commun` as a preferred Québec French term, and lists `common millet` and `proso millet` in English; that entry was last updated in 2010 [reused source `WP03-S180`]. A current Mayrand page in Québec uses the generic French product title `Graines de millet crues 1 kg` and displayed store availability when checked [reused source `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02`]. Mayrand does not identify the taxon or use `barri`. These local sources support preserving the established French display, not a French alias `barri` or a claim that the regional term is established in Québec French.

Health Canada's crop-group listing separately identifies proso millet as *Panicum miliaceum* subsp. *miliaceum*, distinct from other millet taxa [reused source `WP03-S181`]. This supports the existing species boundary, not the word `barri` or a retail product specification.

| Candidate or neighbor | Decision | Boundary |
|---|---|---|
| `barri` | Add as one English alias on `ingredient-ref-common-millet`. | ICAR–IIMR maps Hindi `Barri` to proso millet; the Canadian-facing A1 product title pairs `Barri` with `Proso Millet`. This is a search name for the existing grain, not a second identity. |
| `barri flour`, `barri atta`, and other flour-qualified phrases | Leave unassigned. | The reviewed listing is a grain product. No Canadian or Québec source reviewed here establishes those exact flour names. Keep `ingredient-ref-proso-millet-flour` and its existing `proso millet atta` alias unchanged. |
| `cheno` and `cheena` | Leave unassigned in this packet. | Round 15 listed these as separate spellings for later review. This packet neither adds them nor treats the shared retail title as an automatic endorsement of every spelling in it. |
| French `barri` / `millet barri` | Do not add as French display or alias. | The OQLF and Québec retail wording support `millet commun` / `Graines de millet crues`; no reviewed Québec source uses `barri` in French. |
| Generic `millet` / `mil` and other millet species | Keep current ownership unchanged. | OQLF treats short `millet` and `mil` terms as generic or species-abbreviating names. Do not move them to common millet or add them as aliases here. |

The catalog identity remains the human-food grain *Panicum miliaceum*. No claim is made about a particular cultivar, hull status, color, or processing method. The product title, IIMR crosswalk, and common-millet identity do not justify a flour, feed, prepared cereal, or species-agnostic millet interpretation.

## Proposed catalog delta

| Field | Current | Proposed |
|---|---|---|
| ID | `ingredient-ref-common-millet` | Unchanged |
| English display | `common millet` | Unchanged |
| French display | `millet commun` | Unchanged |
| English aliases | `chena`, `proso millet` | Add only `barri` |
| French aliases | `[]` | Unchanged |
| Category | `GRAIN_AND_CEREAL` | Unchanged |
| Default density / unit mappings | `null` / `[]` | Unchanged |
| Forms, recipe links, yields, conversions, substitutions | None | None |

Keep the separate `ingredient-ref-proso-millet-flour` row unchanged as `proso millet flour / farine de millet commun`, with its existing `proso millet atta` alias. Do not create a new reference, form, ledger record, recipe link, or grain-to-flour relationship.

## Exact ownership and picker projection

The read-only audit applied the normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, accent and common-ligature folding, punctuation-to-space conversion, and whitespace collapse. It checked reference names and aliases, attached form labels and match terms, legacy candidates, ledger records, and prior proposal/batch text.

| Surface | Current finding |
|---|---|
| Active references | No exact normalized `barri` owner. The common-millet row owns `common millet / millet commun` and aliases `proso millet` and `chena`; the separate flour row owns its flour-qualified names. No active reference term contains the `barri` substring. |
| Ingredient forms | 98 forms checked; no exact `barri` label or match term and no common-millet form. |
| Legacy identities | 64 candidates checked; no exact `barri` owner. |
| Research ledger | 1,657 records checked. `Barri` appears in the already registered ICAR–IIMR source material and in the A1 product-title source attached to the existing common-millet record. The ledger contains the round-15 `chena` decision but no separate accepted `barri` alias decision or candidate record. |
| Proposal and batch archive | Round 15 explicitly left `barri` inactive for separate review. No prior focused `barri` alias decision or round-16 ID was found. |

`IngredientReferenceSearchIndex` returns complete normalized phrase matches before substring fallback. The table below is a static projection from current source code and JSON, not live UI or emulator QA.

| Query | Current projection | With only `barri` added to common millet |
|---|---|---|
| `barri` | No result | `ingredient-ref-common-millet` only |
| `barri flour` | No result | No result; the alias does not imply a flour identity |
| `barri atta` | No result | No result |
| `proso millet` | Common millet and proso-millet flour | Same two results |
| `proso millet flour` | Proso-millet flour only | Same result |
| `common millet` | Common millet only | Same result |
| `millet commun` | Common millet and proso-millet flour | Same two results |
| `millet` | 18 generic, species, flour, and processed millet results | Same 18 results |
| `chena` / `cheno` | Common millet only / no result | Same results; this review does not change either key |

The alias fills a zero-result exact query. It does not change an existing broad millet query or a flour-qualified result.

## Recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. Whole-phrase scans of recipe text and ingredient-row values for `barri`, `barri millet`, `barri flour`, `proso millet`, `common millet`, `millet commun`, `chena`, `cheno`, and `cheena` found **zero recipe-file hits and zero ingredient-row hits**. There are **zero links** to `ingredient-ref-common-millet`. No recipe link or recipe text change is proposed.

The manifest-ordered corpus contains **753,792 bytes** and has fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

## Measures, package sizes, and substitutions

- Keep `measurementState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []` for common millet. A1's **2.2 lb** and Mayrand's **1 kg** are package sizes, not recipe measures, portions, mass-volume observations, densities, or cooking yields.
- Add no dry/cooked form, preparation state, conversion, package yield, or measurement observation. The alias names the same grain and provides no quantitative behavior.
- Keep `substitutionResearchState: not_yet_researched`; add no global or contextual substitution rule or recipe-line link. None of the sources tests a replacement quantity, cooking method, or dish role for proso millet.
- Do not infer density from the 2.2 lb or 1 kg package sizes, or a substitute from general serving or cooking suggestions on retailer pages.

## Proposal-time baseline and source-ID / URL collision audit

Snapshot checked on 2026-10-13 before integration: **1,344 active references**, **98 forms**, **64 legacy candidates**, and **1,657 ledger records** with **6,419 source entries** and **5,377 distinct source IDs**. The common-millet row then had `chena` and `proso millet`; its density was null, unit mappings and forms were empty, and no recipe links were assigned.

No new source ID or URL was proposed or added. The evidence records below reuse IDs and URLs already present in the ledger; these are not duplicate registrations:

| Reused source ID | Existing ledger ownership and use in this proposal |
|---|---|
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | ICAR–IIMR multilingual table; already registered on common-millet and proso-millet-flour records. Reuse the same source and URL for the `Barri` crop-name crosswalk. |
| `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` | A1 Ontario product page; already registered on the common-millet record for the round-15 `chena` review. Its page title includes `Barri`; no second source ID or duplicate URL registration is needed. |
| `WP03-S180` | OQLF GDT `millet commun`; already registered on the common-millet record and supports the existing French display and species identity. |
| `WP03-S181` | Health Canada crop-group listing; already registered on the common-millet record and supports the proso-millet taxon boundary. |
| `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand Québec listing; already registered on the common-millet record and supports contemporary local generic French grain wording only. |

The proposed alias introduces no ingredient, form, finding, measurement, or substitution ID. If root accepts the alias, the existing source records can support the corresponding accepted boundary decision; do not mint duplicate source IDs for the same URLs.

## Source register

Sources were reopened or checked on 2026-10-13. Existing ledger IDs are reused.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Reused `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | ICAR–Indian Institute of Millets Research, [Millets Information: Common name of Millets in Indian Languages](https://www.millets.res.in/millets_info.php), proso-millet entry. | Primary source maps Hindi `Chena; Barri` to English `Proso Millet`; page states updated 2026-07-07. Supports the exact crop crosswalk. Does not establish Canadian or Québec usage, package contents, or recipe behavior. The same source ID is already registered and is reused. |
| Reused `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` | A1 Indian Grocery Online, [Proso Millet 2.2LB (Chena / Cheno / Barri)](https://a1grocery.ca/product/proso-millet-2-2lb-chena-cheno-barri/), product title and add-to-cart control. | Canadian retailer in Barrie, Ontario pairs exact `Barri` wording with a proso-millet grain listing. Page was directly reopened on 2026-10-13 and displayed the product and add-to-cart control; the search index reports an older crawl, so current stock is not asserted. The listing has no botanical name or package ingredient declaration. The 2.2 lb figure is package size only. Existing source ID and URL are reused from round 15. |
| Reused `WP03-S180` | Office québécois de la langue française, [GDT: millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), definition, preferred terms, translations, and Latin name. | Supports `millet commun`, *Panicum miliaceum*, and English `common millet` / `proso millet`. Page last updated in 2010; it does not mention `Barri` or define a current retail grain package. |
| Reused `WP03-S181` | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal-grain subgroup. | Separates proso millet (*Panicum miliaceum* subsp. *miliaceum*) from other millet taxa. Regulatory crop-group evidence only; it does not establish a consumer alias or quantitative kitchen data. |
| Reused `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand, [Graines de millet crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix-et-fruits-secs-vrac/graine-de-millet-crue-mayrand-chef-27825), product listing and store-availability section. | Current Québec retailer page uses generic French wording and displayed store availability at Anjou, Laval, Brossard, and Saint-Jérôme when checked. It does not identify *Panicum miliaceum* or use `Barri`; the 1 kg is a package size, not a measure. Existing source ID and URL are reused from round 15. |

## Disposition

**Recommend adding only `barri` to the English aliases of `ingredient-ref-common-millet`.** ICAR–IIMR supplies the current primary crop-name mapping, and A1's Canada-facing product title uses the exact spelling beside `Proso Millet`. Keep `millet commun` as the Québec French display; the current Québec retail evidence is generic and does not attest the regional alias in French. No recipe demand or reusable numeric behavior was found. Leave the flour row, forms, measurements, conversions, yields, and substitutions unchanged.

## Root integration status

**Integrated.** Added only `barri` to the English aliases for `ingredient-ref-common-millet`. The reused ICAR–IIMR and A1 source records now support this separate accepted alias decision; the French display, flour row, measurements, forms, recipe links, and substitutions remain unchanged. See [round-sixteen integration](../batches/wp02-wp03-wp04-round16-gap-review-integration-20261013/README.md). No app or emulator tests were run because the changes only add database JSON data and documentation.
