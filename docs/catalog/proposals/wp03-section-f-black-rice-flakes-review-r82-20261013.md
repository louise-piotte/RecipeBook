# WP03 Section F R82 — black-rice flakes product boundary review

- **Status:** Proposal-only review; hold active allocation.
- **Open checklist:** Regionally significant cereal mixes and preprocessed grains remains open at [plan line 2782](../../RecipeBook-global-ingredient-catalog-plan.txt#L2782).
- **Scope:** Whether plain black-rice flakes/poha, including the source-specific Karuppu Kavuni product, should receive a new processed-grain identity distinct from intact black rice and generic flattened rice (poha). This review does not assign a rice cultivar to the generic black-rice row, create a form, or review prepared black-rice-poha dishes.
- **Decision:** **Hold `black rice flakes` out of the active catalog.** Current product pages support the product concept, but the reviewed product examples are India-market listings and no Canadian or Québec French product label establishes a precise bilingual identity. Do not construct a French display such as `flocons de riz noir` from separately supported base terms.

## Evidence and product scope

Ulamart currently lists **Black Rice Flakes | Poha** and identifies the product with the specific Karuppu Kavuni rice variety. The listing places it in its Poha & Millet Flakes section and shows it in stock at its Pondicherry, India store. It is useful current market evidence for a real black-rice-flake product and for the specific variety boundary. It is not a Canadian label, does not establish a Québec French name, and does not justify treating every black-rice flake product as Karuppu Kavuni.

Freshly Ground Foods currently describes **Black Rice Flakes (Poha) / Karuppu Kavuni Aval** as whole black rice grains cleaned and processed into thin flakes. Its page supports a human-food, whole-grain flake product rather than intact black rice or a cooked poha dish. The same page showed the SKU sold out and says shipping is within India. Neither reviewed listing supplies a Québec French product label.

The active black-rice row already has the federally attested bilingual display `black rice / riz noir`. That evidence is for the intact edible grain. The active generic flattened-rice display `flattened rice (poha) / flocons de riz (poha)` describes the broad flaked-rice product; it does not attest the color-qualified French phrase. The separate accepted `brown rice flakes / flocons de riz brun` and `red rice flakes / riz rouge aplati` identities show that color-qualified flake products can warrant distinct identities when their product and bilingual wording are supported. Those neighboring decisions do not authorize an unverified black-rice French compound.

## Ownership, archive, and snapshot

The current package snapshot contains **1,409 ingredient references, 104 forms, 1,748 ledger records, and 63 legacy candidates**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Current owner or boundary | Current data | R82 disposition |
| --- | --- | --- |
| Intact black rice | [`ingredient-ref-black-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L1900), `black rice / riz noir`, `GRAIN_AND_CEREAL`; aliases empty; density null; mappings empty. Its [`verified` ledger record](../research-ledger.v1.json#L25428) has measurement and substitution research `not_yet_researched`. | Keep intact rice as-is. Do not add `black rice flakes`, `black rice poha`, or `Karuppu Kavuni` to the raw-grain aliases. |
| Generic flattened rice | [`ingredient-ref-flattened-rice-poha`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L6037), with generic `rice flakes` and regional names plus thin, medium, and thick forms. Its ledger record keeps grade-substitution research blocked. | Do not assign a color-specific product name to this generic row or add `black rice poha` as a broad alias. |
| Brown-rice flakes | [`ingredient-ref-brown-rice-flakes`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L2454), `brown rice flakes / flocons de riz brun`. Canadian product naming supports this distinct identity. | Keep its color and product boundary unchanged. Its bilingual evidence is not transferable to black rice. |
| Red-rice flakes | [`ingredient-ref-red-rice-flakes`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L13518), `red rice flakes / riz rouge aplati`, with `red rice poha` and `poha rouge`. | Keep its specific names and aliases unchanged. Do not use its French display as a template for an unverified black-rice display. |

Normalized exact-key checks found no active reference or alias, form, legacy candidate, or ledger record ID for `black rice flakes`, `black rice poha`, `Karuppu Kavuni`, `Karuppu Kavuni Aval`, `flocons de riz noir`, or `riz noir aplati`. Searches of the proposal and batch archive found no focused earlier review or decision for black-rice flakes or Karuppu Kavuni poha. The R79 puffed-brown-rice and R80 puffed-wild-rice identities concern expanded grain, not flattened black rice; R81 concerns the popped-barley alias. This candidate does not reopen them.

## Recipe demand and picker projection

The audit parsed every manifest-listed recipe and all **1,123 ingredient rows**, scanning serialized recipe text and ingredient references for the six candidate phrases above plus the proposed ID `ingredient-ref-black-rice-flakes`. It found no candidate-term hits, black-rice recipe rows, or direct links to a black-rice reference. There is no bundled recipe demand for a new row or alias.

`IngredientSearch.kt` searches bilingual reference terms and attached form terms and normalizes accents and punctuation. Exact attached-form terms take priority; otherwise it returns complete word-phrase matches first, then uses substring fallback ([normalization](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L10), [reference and form indexing](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L69), [exact-form and phrase-first filter](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L117), [reference/form term lists](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L186)). None of the six queries below has an exact attached-form term in the current data. The current projection and the hypothetical projection for a future separate row are:

| Query | Current picker result | If a future `black rice flakes / flocons de riz noir` row were supported |
| --- | --- | --- |
| `black rice flakes` | No result | `ingredient-ref-black-rice-flakes` only |
| `black rice` | `ingredient-ref-black-rice` | `ingredient-ref-black-rice` and the qualified flake row |
| `rice flakes` | Generic flattened rice, brown-rice flakes, and red-rice flakes | Those three plus the qualified flake row |
| `poha` | Generic flattened rice, red-rice flakes, and corn poha | Unchanged if no `poha` alias is added to the new row |
| `flocons de riz noir` | No result | Qualified flake row only, if that exact Québec French name is later verified |
| `flocons de riz` | Generic flattened rice and brown-rice flakes | Those two plus the qualified flake row, if its French display is verified |

The hypothetical French row is only a picker scenario, not a recommendation or supported translation. Do not add `poha`, `aval`, or `avalakki` as candidate aliases: the source pages use them for the specific product, while the active catalog already assigns generic flattened-rice names and forms to a broad result set. A future review should keep any accepted display qualified by black rice and check the exact French term before allocating it.

## Identity, form, and numeric boundaries

- **Identity:** The commercial sources support black rice processed as flakes. Their specificity is limited: Ulamart names Karuppu Kavuni and Freshly Ground Foods says whole black rice; the sources do not establish that every product called black-rice flakes shares one cultivar or process. Do not create a generic active row until a Canadian/Québec product source supports its bilingual scope. If that evidence is obtained, first evaluate a separate `GRAIN_AND_CEREAL` identity with stable ID `ingredient-ref-black-rice-flakes`; do not merge it into intact black rice or generic poha.
- **Forms:** Add no `IngredientForm`. Flaking is the processed product being considered, not a dry/cooked state conversion. Existing rice-poha thickness forms do not establish black-rice flake grades.
- **Measures and density:** The 0.5 kg Ulamart option and 200 g Freshly Ground Foods SKU are package weights only. No source supports a household measure, density, or unit mapping. Keep all numeric catalog fields empty.
- **Conversion and yield:** The listings do not report an input-to-output ratio or a reusable cooking yield. Add none.
- **Substitution:** No reviewed source recommends black-rice flakes as a quantity-preserving substitute for generic poha, red/brown rice flakes, or intact black rice. Add no global or contextual substitution rule or recipe-line substitution link.
- **Recommended integration delta now:** none. Do not change the active references, forms, ledger, recipe links, or aliases.

## Source register

| ID | Source | What it establishes and limits |
| --- | --- | --- |
| `WP03-BLACKRICE-FLAKES-R82-20261013-S01` | Ulamart, [Black Rice Flakes | Poha](https://www.ulamart.com/flakes-black-rice), current product page, accessed 2026-10-13. | Product title and description connect black-rice flakes/poha to the specific Karuppu Kavuni variety; the listing showed in-stock options and an India store address. It is India-market retailer evidence, not a Canadian/Québec label, an ingredient-panel specification, or a general black-rice-flake formula. Package weights are not recipe measures. |
| `WP03-BLACKRICE-FLAKES-R82-20261013-S02` | Freshly Ground Foods, [Black Rice Flakes (Poha) / Karuppu Kavuni Aval, 200 g](https://freshlygroundfoods.com/products/black-rice-flakes-poha-karuppu-kavuni-aval-200g), current product page, accessed 2026-10-13. | Describes whole black rice grains cleaned and processed into thin flakes; identifies the item as a breakfast food and poha product. The listing showed sold out and says the seller ships in India. It does not provide Canadian/Québec French labeling, species identification, a reusable measure, or a tested conversion. |
| Reused `WP03-S128` | Government of Canada, [Food Quality Specifications — Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf), FQS-22-02, Black Rice. | Supports the existing generic edible black-rice identity and names Indonesian and Thai black-rice examples. It does not describe flakes or identify Karuppu Kavuni. |
| Reused `WP03-S129` | Government of Canada, [Spécifications sur la qualité des aliments — Riz (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), SQA-22-02, Riz noir. | Supports `riz noir` for the intact edible grain in the federal specification; not the French name of black-rice flakes or a Québec synonym ruling. |
| Reused `WP03-S130` | International Rice Research Institute, [Innovators in rice science](https://ricetoday.irri.org/innovators-in-rice-science/), black-rice variety discussion. | Reports both glutinous and non-glutinous black-rice varieties. Do not infer the candidate product's variety or alias it to glutinous rice from a color-qualified product title. |
| Reused `WP03-S92` | Central Food Technological Research Institute, [Improvement of the traditional process for rice flakes](https://ir.cftri.res.in/6762/), abstract. | Describes rice flakes/poha as a distinct processed-food class and one traditional process. It does not define black-rice flakes, a Canadian product, or a household conversion. |
| Reused `WP03-RRFLAKE-QC-ALIAS-20261012-S04` | Government of Canada, TERMIUM Plus, [rice flake / flocon de riz](https://www.btb.termiumplus.gc.ca/tpv2source?fchrcrdnm=41&i=1&index=enb&lang=eng&rlang=fr&src_id=OCDE-1021999%2CSRCL37642002%2CSRCL37642004&srchtxt=UP+INCLUDING&titl=flocon+de+riz), record 41. | Supports the general bilingual term `rice flake / flocon de riz`; it does not establish the compound `flocons de riz noir` as a Canadian or Québec product name. |
| Reused `WP03-BRFLAKE-20261012-S03` | Well.ca, [Flocons de Riz Brun Bio Eden](https://well.ca/fr/produits/eden-organic-brown-rice-flakes_18292.html), French Canadian product page. | Supports Canadian French `flocons de riz brun` for a distinct brown-rice-flake SKU. It is not evidence for a black-rice flake name. |

No new source IDs are proposed for the shared ledger while active allocation is held. The two R82 source IDs are proposal-local and were checked against the current ledger, proposal archive, and batch archive.

## Static review record

Static review on 2026-10-13: the proposal is UTF-8 without BOM, ends with a newline, and has no trailing whitespace. All local Markdown links and line anchors resolve. The live reference, form, ledger, legacy, and manifest files parsed as JSON; snapshot counts and recipe-row totals are recorded above. The candidate phrase and proposed ID scans found no exact existing owner or archive decision. New source IDs are unique and absent from the live ledger and archive; every reused source ID occurs in the live ledger. Picker projections were mirrored from the current `IngredientSearch.kt` exact-form-term check, reference/form terms, phrase-first matching, and substring fallback; none of the listed queries matches an exact form term. This R82 review wrote only this proposal and did not edit the shared catalog, ledger, plan, roadmap, or generated files. No app tests or emulator work were run for this proposal-only review; the current `AGENTS.md` rule also exempts database-JSON-only additions from tests.
