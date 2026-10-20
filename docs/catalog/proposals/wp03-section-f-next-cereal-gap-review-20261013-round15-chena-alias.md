# WP03 Section F — common-millet `chena` alias review (2026-10-13, round 15)

## Review record

- **Status:** Proposal packet; root integration is complete. The integrated outcome is recorded below and in the [round-fifteen integration](../batches/wp02-wp03-wp04-round15-gap-review-integration-20261013/README.md).
- **Scope:** One regional grain name, `chena`, for the existing common-millet grain `ingredient-ref-common-millet`.
- **Distinct from recent reviews:** This reviews a name for *Panicum miliaceum*. It does not repeat the finger-millet-rava hold (round 12), the black-fonio `iburu` alias (round 13), or the foxtail-millet `navane` alias (round 14). The earlier proso-millet-flour review used IIMR grain-name evidence only as source context and did not review grain aliases.
- **Plan location:** The broad species-level millet review remains open at [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2240). The common-millet row is already defined as *Panicum miliaceum* and currently has only `proso millet` as an English alias ([plan lines 2159–2161](../../RecipeBook-global-ingredient-catalog-plan.txt#L2252)).
- **Recommendation:** Add only **`chena`** as an English search alias to `ingredient-ref-common-millet`. Preserve `millet commun` as the French display. Do not add this alias to the separate proso-millet-flour row.

## Identity and evidence boundary

The current ICAR–Indian Institute of Millets Research (IIMR) language-name table pairs English `Proso Millet` with Hindi `Chena; Barri`, Gujarati `Cheno`, and regional names in other languages. The page is marked updated 2026-07-07. IIMR is the primary source for the regional-name-to-crop crosswalk; it does not establish Canadian or Québec usage [reused source `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`].

A current A1 Indian Grocery listing in Barrie, Ontario, titles a 2.2 lb product **“Proso Millet (Chena / Cheno / Barri)”** and offers it for online purchase [S01]. The current retailer listing corroborates Canadian use of `Chena` for a proso-millet grain product. It is retailer product copy rather than a package ingredient declaration, gives no Latin name, and warns that inventory can change. The IIMR mapping supplies the crop identity.

The OQLF Grand dictionnaire terminologique entry gives `millet commun` as a preferred Québec French term for *Panicum miliaceum*, with `common millet` and `proso millet` among its English translations [reused source `WP03-S180`]. The live entry was checked on 2026-10-13 but was last updated in 2010; it does not mention `chena` or define a retail product. The current Québec Mayrand product page lists `Graines de millet crues 1 kg` and showed stock at its Anjou, Laval, Brossard, and Saint-Jérôme stores when checked [S02]. That page supports contemporary Québec French grain-product wording only: it does not identify the millet species or use `Chena`.

| Candidate or neighbor | Decision | Boundary |
|---|---|---|
| `chena` | Add as one English search alias on `ingredient-ref-common-millet`. | IIMR maps the Hindi name to proso millet, and a current Canadian grocery listing applies it to a proso-millet grain product. No separate ingredient identity or French alias is needed. |
| `chena flour` / `chena atta` | Do not add to the grain or flour row. | This review is about whole grain. The separate `ingredient-ref-proso-millet-flour` retains its existing display and `proso millet atta` alias. Neither source reviewed here establishes a Canadian or Québec flour label using `chena`. |
| `cheno`, `barri`, and `cheena` | Leave inactive in this proposal. | IIMR and the retailer document related regional spellings, but this decision adds only the exact `Chena` spelling supported by the Canadian listing and Hindi mapping. No Québec product label was found for these names. They remain independently auditable search keys. |
| `chana` and chickpea products | Keep their existing ownership unchanged. | The spellings differ. The current `chana` query already returns the active black-chickpea, chana-sattu, desi-chickpea, and kabuli-chickpea references; adding `chena` does not change those results. |
| `common millet`, `proso millet`, `millet commun`, and generic `millet` | Keep existing ownership unchanged. | This proposal adds a species-level alias only. It does not move or duplicate the broader generic-millet name, change the Québec display, or alter the flour result. |

## Proposed catalog fields

| Field | Current | Proposed |
|---|---|---|
| ID | `ingredient-ref-common-millet` | Unchanged |
| English display | `common millet` | Unchanged |
| French display | `millet commun` | Unchanged |
| English aliases | `proso millet` | Add only `chena` |
| French aliases | `[]` | Unchanged |
| Category | `GRAIN_AND_CEREAL` | Unchanged |
| Default density / unit mappings | `null` / `[]` | Unchanged |
| Forms, recipe links, substitutions | None | None |

The flour row `ingredient-ref-proso-millet-flour` remains `proso millet flour / farine de millet commun`, with only its existing `proso millet atta` English alias. No grain-to-flour relation, form, or recipe-line link is proposed.

## Proposal-time ownership and picker projection

This ownership and picker snapshot records the state before root integration.

The read-only audit used the repository's normalization: lowercase, compatibility decomposition, accent and common-ligature folding, punctuation-to-space conversion, and whitespace collapse. It checked active ingredient names and aliases, form labels and match terms, legacy candidates, and ledger record IDs.

| Surface | Current result |
|---|---|
| Active references | No exact `chena` owner. `ingredient-ref-common-millet` owns `common millet / millet commun` and alias `proso millet`; `ingredient-ref-proso-millet-flour` is a separate milling product. No existing exact `chena`, `cheno`, `cheena`, or `barri` key was found. |
| Ingredient forms | 98 forms checked; no `chena` match term or common-millet form. |
| Legacy identities | 64 candidates checked; no exact `chena` owner. |
| Research ledger | 1,655 records checked; no record ID for `chena`. The existing common-millet ledger record cites OQLF `WP03-S180` and Health Canada `WP03-S181`. The IIMR source ID `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` is already registered on the separate flour record and is reused here, not reissued. |
| Proposal / batch archive and source IDs | No focused grain-level `chena` alias decision was found. Before this packet was written, proposal-local IDs `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` and `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02`, and the A1 and Mayrand URLs, were absent from the live ledger and earlier proposal/batch files. Root has since registered both IDs and URLs in the shared ledger. |

The following is a static projection of [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), whose complete-phrase matching precedes substring fallback. It is not a runtime picker or emulator test.

| Query | Current result | After adding only `chena` |
|---|---|---|
| `chena` | No result | `ingredient-ref-common-millet` only |
| `chena flour` | No result | No result; the grain alias does not create a flour-qualified match |
| `chana` | Four chickpea references | Same four chickpea references |
| `cheno`, `cheena`, `barri` | No result | No result |
| `common millet` | `ingredient-ref-common-millet` only | Same result |
| `proso millet` | Common millet and proso-millet flour | Same two results |
| `proso millet flour` | Proso-millet flour only | Same result |
| `millet commun` | Common millet and proso-millet flour | Same two results |

## Recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were parsed. Whole-phrase scans of the recipe files and ingredient-row values for `chena`, `cheena`, `cheno`, `barri`, `proso millet`, `common millet`, and `millet commun` found **zero recipe-file hits and zero ingredient-row hits**. There are **zero direct links** to `ingredient-ref-common-millet`. This is regional catalog coverage, not a recipe-demand change.

The manifest-ordered corpus contains **753,792 bytes** and has fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The digest hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

## Measures and substitutions

- Keep `measurementState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []` on the common-millet grain. The A1 `2.2 lb` and Mayrand `1 kg` figures are package sizes, not recipe quantities, portions, volume-to-mass conversions, densities, or cooking yields. Mayrand's displayed in-store stock can change.
- Add no dry/cooked form, preparation state, yield, conversion, or measurement observation. The alias identifies the same grain and carries no new quantitative behavior.
- Keep `substitutionResearchState: not_yet_researched`; create no global or contextual rule and no recipe-line substitution link. No source reviewed here tests a recipe replacement or ratio for common millet.
- Do not infer an alias or substitution from the Mayrand page's generic grain title, the A1 product package, or IIMR's crop-name table.

## Proposal-time baseline and collision audit

Snapshot checked on 2026-10-13 before integration. The active package then contained **1,343 ingredient references**, **98 forms**, **64 legacy identities**, and **1,655 ledger records** with **5,361 distinct source IDs**. The common-millet row had only `proso millet` as an English alias, no French aliases, null density, and no unit mappings. The separate proso-flour row had `proso millet atta` and no forms.

Both new source IDs and URLs were absent from the ledger and earlier proposal/batch archive at proposal time; they are now registered in the shared ledger. Existing IDs `WP03-S180`, `WP03-S181`, and `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` remain reused source evidence. No new catalog ID, record ID, finding ID, or measurement ID was proposed.

## Source register

Sources were reopened or checked on 2026-10-13. Existing ledger sources are reused under their current IDs.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Reused `WP03-S180` | Office québécois de la langue française, [GDT: millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), definition, preferred terms, translations, and Latin name. | Official Québec terminology for the French display and *Panicum miliaceum*; English translations include `common millet` and `proso millet`. The page says it was last updated in 2010 and does not mention `Chena` or define a retail grain product. |
| Reused `WP03-S181` | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal-grain subgroup. | Federal crop listing places proso millet (*Panicum miliaceum* subsp. *miliaceum*) separately from other millet taxa. It supports the existing species boundary, not the regional name `Chena` or a human-food label. |
| Reused `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | ICAR–Indian Institute of Millets Research, [Millets Information: Common name of Millets in Indian Languages](https://www.millets.res.in/millets_info.php), proso-millet entry; page marked updated 2026-07-07. | Current primary crop-language source lists `Chena; Barri` under Hindi for English `Proso Millet` and separately lists Gujarati `Cheno`. This is not Canadian retail or Québec terminology evidence. The source ID is already registered on the proso-flour ledger record and is reused here rather than duplicated. |
| `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` | A1 Indian Grocery Online, [Proso Millet 2.2LB (Chena / Cheno / Barri)](https://a1grocery.ca/product/proso-millet-2-2lb-chena-cheno-barri/) and [current shop listing](https://a1grocery.ca/new-shop-page/); product title and add-to-cart listing. | Canadian retailer product copy connects the exact spelling `Chena` to a proso-millet grain product; the current shop page lists the item with an add-to-cart option. A1's listed address is Barrie, Ontario. This is not a package ingredient declaration or a Québec product label, and the site warns that inventory may change. The package weight is not a kitchen measure. |
| `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand, [Graines de millet crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix-et-fruits-secs-vrac/graine-de-millet-crue-mayrand-chef-27825); listing and store-availability section. | Current Québec retail page uses the French product wording `Graines de millet crues` and displayed stock at four Québec stores when checked. It does not identify *Panicum miliaceum* or use `Chena`; this is local French product-context evidence only. The 1 kg and case sizes are product/package quantities, not kitchen measures. |

## Disposition

**Recommend adding only `chena` to the English aliases of `ingredient-ref-common-millet`.** Keep `millet commun`, the current aliases and fields on the proso-millet-flour row, measurements, forms, recipe links, and substitutions unchanged. The current IIMR regional-name table and a current Canadian grain listing support the exact alias. OQLF retains the Québec French display, while the Québec retail evidence does not establish local use of `Chena`. No recipe demand or reusable numeric behavior was found. The broader Section F species-level review remains open.

## Root integration status

**Integrated.** Added only `chena` to the English aliases for `ingredient-ref-common-millet`; the other catalog and numeric fields remain unchanged. See [round-fifteen integration](../batches/wp02-wp03-wp04-round15-gap-review-integration-20261013/README.md). No app or emulator tests were run because the shared changes add database JSON data and documentation.
