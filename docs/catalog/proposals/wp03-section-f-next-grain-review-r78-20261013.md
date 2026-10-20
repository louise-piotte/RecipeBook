# WP03 Section F R78 — Korean mixed seven-grain rice mix boundary review

## Review record

- **Reviewed:** 2026-10-13; local catalog and source pages checked on this date.
- **Status:** proposal only.
- **Chosen open checklist item:** `[ ] Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.` ([live Section F checklist, line 2750](../../RecipeBook-global-ingredient-catalog-plan.txt#L2750)).
- **Candidate:** a Korean-market packaged product listed as `CRD)Mixed 7Grains 10LB` / `초립동)칠곡미` in an Alberta H Mart flyer; a separate H Mart U.S. listing names a `Choripdong Mixed 7 Grains 5lb` product [S01–S02].
- **Recommendation:** **hold an active identity and aliases.** The listings establish a named retail candidate, but do not provide its ingredient declaration, establish that the Canadian and U.S. package listings share a formula, or give a Québec French title for this Korean SKU. The Québec wording found for a generic seven-grain rice mix does not resolve those product-specific gaps [S03].
- **Scope:** packaged Korean mixed-grain rice candidate only; its dry/raw state and preparation use remain unverified. Do not fold it into the prepared dish *ogokbap*, a general multigrain-rice identity, wild-rice blends, or hot cereal.
- **Proposal-only boundary:** no reference ID, candidate ID, source record, alias, form, recipe link, conversion, yield, substitution, or shared project file other than this proposal is added. No tests or emulator checks were run; this is research-only, and the current `AGENTS.md` rule says a future JSON-database-only addition needs no tests.

## Candidate identity and product limits

The Canadian H Mart flyer lists a bag under its “MIXED GRAINS” heading as `CRD)Mixed 7Grains 10LB` and prints the Korean text `초립동)칠곡미` [S01]. A separate H Mart U.S. product page identifies the brand as Choripdong and gives the product name `Mixed 7 Grains 5lb (2.27 kg)` [S02]. Together these support a distinct, regionally relevant retail candidate. They do **not** prove that the abbreviated Canadian `CRD` item and the U.S. Choripdong item are the same SKU or formulation. Neither accessible listing supplies a complete ingredient declaration or package preparation instructions.

The Canadian flyer is from H Mart’s Alberta site, not a Québec listing, and uses English and Korean titles. The Québec institutional recipe source calls a generic ingredient `MÉLANGE DE RIZ 7 GRAINS` [S03]. That is useful Québec French evidence for the general class, but it neither names Choripdong nor establishes that its seven-grain product has the same formula. Do not treat the phrase as a verified French title for this Korean item. The Korean Tourism Organization describes *ogokbap* as prepared steamed five-grain rice and notes regional variation in the grains used [S04]. That source supports keeping a cooked rice dish separate from a packaged grain product; it does not identify the flyer’s product or make *ogokbap* an alias for it.

## Identity, form, measurement, and use boundaries

| Dimension | Evidence | Boundary for this review |
|---|---|---|
| **Identity** | Retailers use the product titles above and present the Canadian item in a bag under “MIXED GRAINS” / rice-and-grain merchandising [S01–S02]. | A product-specific candidate is plausible, but no active identity is allocated until the Canadian item’s label and product scope are better established. Do not infer a standard Korean seven-grain formula. |
| **Species and composition** | The Canadian flyer exposes the Korean product text; the U.S. page gives a brand and title. Neither page has a usable ingredient panel [S01–S02]. | No species, grain list, percentages, allergen statement, or formula is assigned. Do not decompose the mix into component references. |
| **Form** | The listings show a packaged bag/product, but the retrieved text does not state dry/raw status or cooking instructions. The institutional Québec recipe cooks its own generic mix [S03]. | No `IngredientForm` and no claim that the Canadian package is interchangeable with another dry or cooked blend. A future product review should inspect the package and preparation panel. |
| **Measurement** | The flyer lists a 10 lb package; the separate U.S. listing lists a 5 lb package [S01–S02]. | These are package quantities only. There is no product serving, household measure, cup mass, or repeatable fill method. |
| **Conversion** | No source establishes a volume-to-mass relationship or a product-to-component ratio. | No density, unit mapping, or conversion. |
| **Yield** | A Québec institutional recipe reports 100 portions × 120 mL and lists 56.34 kg cold water with 11.27 kg `MÉLANGE DE RIZ 7 GRAINS` [S03]. It describes that recipe’s cooking method and notes the grains may not reach equal tenderness. | This is a source-specific institutional batch for an unnamed generic blend, not a home preparation instruction or transferable yield for the Korean package. Do not derive a ratio, serving size, or dry-to-cooked yield for this candidate. |
| **Substitution** | No reviewed source gives an exchange ratio or outcome for this SKU against white rice, wild-rice blend, a hot cereal, or another grain mix. | No global or contextual substitution rule and no recipe-line substitution link. A dish’s use of mixed rice does not establish a safe or equivalent replacement. |

## Current ownership, overlap, and picker audit

Read-only snapshot of the live split package and research data:

| Artifact | Current count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,402 | `73f233ded5a21acccc94615afd90d5d74a706fabb3f6fd23c565570205e27bc7` |
| Ingredient forms | 104 | `4190dc88d9dc7914b3ef5a497d9c4f50def881ade9c0348d37faec3f02a63798` |
| Legacy import candidates | 63 | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Research-ledger records | 1,740 | `1a0074e33ef41e87229dfc2179817fa0c06769e63ee19bc79777b621e0a163be` |
| Manifest-listed recipe files | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Normalized ownership checks over active reference names and aliases, form labels and match terms, legacy candidates, and ledger text found no exact owner for `Mixed 7 Grains`, `Choripdong Mixed 7 Grains`, `초립동)칠곡미`, `칠곡미`, `japgokbap`, `ogokbap`, or a Korean mixed-grain rice-mix identity. No prior focused proposal or batch decision for this Korean package was found. The prior R74 pearl-millet-flakes/Bajra Poha hold, R75 kishk hold, R76 Rogers blend, R77 Mighty Tasty cereal, and the separately integrated Rogers and Mighty Tasty rows do not describe this product.

The closest active owners remain distinct:

| Active owner | Current display and aliases | Boundary |
|---|---|---|
| `ingredient-ref-red-river-7-grain-hot-cereal` | `Red River 7 Grain Hot Cereal` / `Céréales chaudes Red River 7 grains`; English alias `Red River 7 Grain Cereal`; French alias `Red River Céréales Chaudes 7 Grains` | A branded hot cereal, not this rice-grain retail candidate. It currently owns the broad query `7 grain` / `7 grains`. |
| `ingredient-ref-red-river-cereal` | `Red River cereal` / `Céréales Red River`; aliases include `Red River hot cereal`, `Original Red River Cereal`, `céréales chaudes Red River`, and `céréale Red River` | A separate named hot cereal. |
| `ingredient-ref-multigrain-flakes` | `multigrain flakes` / `flocons multigrains`; English alias `multi-grain flakes` | A flake product, not a rice mix. |
| `ingredient-ref-wild-rice-blend` | `wild rice blend` / `mélange de riz sauvage`; no aliases | A separate blend identity; no formula or equivalence with this candidate is shown. |
| `ingredient-ref-baby-rice-cereal` | `baby rice cereal` / `céréales de riz pour bébés` | A different rice-cereal product and use. |

The static picker projection follows the current phrase-first search and substring fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L28):

| Query | Current result | Boundary |
|---|---|---|
| `Mixed 7 Grains`; `Choripdong Mixed 7 Grains`; `Korean mixed-grain rice mix`; `Mélange de riz 7 grains` | No active result | Exact candidate wording is currently unowned. No row is proposed in this review. |
| `7 grain`; `7 grains` | `ingredient-ref-red-river-7-grain-hot-cereal` | Do not add either short phrase as a candidate alias. If a future French display contains `7 grains`, the generic query will show both the product and Red River cereal; the displayed names must retain their rice/product and hot-cereal qualifiers. |
| `multigrain` | `ingredient-ref-multigrain-flakes` | Do not alias the candidate to the existing flakes identity. |
| `ogokbap`; `japgokbap` | No active result | Do not add either prepared-dish name as a dry-product alias. |
| `칠곡미` | All 1,402 references | Current search normalization strips Hangul as non-ASCII characters; the resulting empty query returns the full reference list. Do not add this Hangul spelling as an alias until the picker can search it safely. |

The exact retail title could support a future product-focused English lookup if the product is resolved. It does not justify broad aliases such as `7 grains`, `multigrain rice`, `mixed grains`, `Korean rice`, or the prepared-dish terms.

## Recipe demand

All 114 manifest-listed recipe files were scanned as serialized text, covering 1,123 top-level ingredient rows. **No recipe file or ingredient row** mentions the candidate’s English or Korean product title, `Choripdong`, `칠곡미`, or the proposed Korean mixed-grain-rice wording. There is no bundled recipe demand and no recipe line to link.

The Québec institutional source is external recipe evidence for the broader class only: its `7 Grains` page calls for a generic `MÉLANGE DE RIZ 7 GRAINS`, and the same booklet uses cooked 7-grain mixture in pilaf, salad, and soup recipes [S03]. Those dishes do not identify the Korean package, so they support cuisine-level relevance but not a product association, recipe link, or substitution.

## Exact integration delta

**None.** Keep the catalog, forms, ledger, recipes, and checklist unchanged. Do not allocate an active or provisional ID from the current evidence. A later proposal could reconsider a narrow product-specific identity after a legible Canadian package ingredient/preparation panel and SKU-specific Canadian French or Québec display evidence are available. Any future candidate should omit the Hangul alias unless search behavior is repaired, and should keep `7 grains` as a non-alias because of the existing Red River owner.

## Source register

Source IDs are local to this proposal and were checked absent from the current ledger and archive. Direct PDF retrieval for the H Mart flyer returned a cache miss; its indexed flyer text was reviewed. The remaining page scopes are limited as described.

| Source ID | Source and locator | What it supports and what it cannot establish |
|---|---|---|
| `WP03-KOREAN-MIXED-GRAIN-R78-20261013-S01` | H Mart Canada, Alberta flyer, [Grocery Apr 24–30](https://ab.hmart.ca/data/file/flyer/3091412006_DmHlGOin_22d5fdad73c61b82234ef225cfe0ec669fd65721.pdf), “MIXED GRAINS” section. | Indexed primary retailer flyer text lists `CRD)Mixed 7Grains 10LB` and `초립동)칠곡미`, with a bag image. It supports a Canadian retail title and package size. It is not a Québec listing and exposes no ingredient declaration, preparation method, French title, or proof that `CRD` is the full `Choripdong` brand name. Direct open returned a cache miss. |
| `WP03-KOREAN-MIXED-GRAIN-R78-20261013-S02` | H Mart U.S., [Mixed 7 Grains 5 lb (2.27 kg)](https://www.hmart.com/mixed-7-grains-5lb-2-27-kg--1/p), product details. | Current retailer page names brand `Choripdong`, product `Mixed 7 Grains 5lb`, and SKU `54`. It reports a package quantity only. It is not evidence of Canadian or Québec availability, the Canadian package’s exact brand/SKU, the ingredient formula, or a French name. |
| `WP03-KOREAN-MIXED-GRAIN-R78-20261013-S03` | CIUSSS Centre-Sud-de-l’Île-de-Montréal, [Recettes durables pour les institutions](https://www.cisssca.com/clients/CISSSCA/Professionnels__M%C3%A9decins_et_partenaires/Pr%C3%A9vention_promotion/Saines_habitudes_de_vie/Saine_alimentation/OUT_Recettes-durables-pour-les-institutions_2021-06.pdf), p. 46, “7 Grains”; see also its pilaf, salad, and soup uses. | A Québec institutional source uses the exact phrase `MÉLANGE DE RIZ 7 GRAINS`, gives a cooking method, and reports one institutional batch’s yield and quantities. It does not identify the product brand, composition, or a home-scale conversion. The quantities stay tied to that recipe. |
| `WP03-KOREAN-MIXED-GRAIN-R78-20261013-S04` | Korea Tourism Organization, [Steamed Five-Grain Rice (오곡밥 / Ogokbap)](https://english.visitkorea.or.kr/svc/thingsToDo/foodTrip/special_view.do?vcontsId=180131), “Korean_food” description. | Describes *ogokbap* as prepared steamed rice, notes regional naming/ingredient variation, and names common grains. It supports keeping a prepared dish distinct from a retail dry mix; it does not identify or define the Choripdong candidate. |

## Static review record

- Re-read current `AGENTS.md`, the exact open Section F checklist line, current reference/form/legacy/ledger data, recipe manifest, and proposal/batch archive.
- Checked normalized exact ownership, proposal filename, reference-ID namespace, and source-ID prefix. The target filename and R78 source-ID prefix were unused before this review.
- Scanned all 114 manifest recipe files and 1,123 ingredient rows; exact candidate-term hits: **0**.
- Projected picker behavior from the current source and active reference data; verified the existing Red River result for `7 grain(s)` and the empty-normalized Hangul query behavior. This is static analysis, not a live UI test.
- Checked the Canadian H Mart flyer, H Mart product page, Québec institutional recipe booklet, and Korea Tourism Organization dish description. Recorded retrieval and product-scope limits above.
- No tests or emulator were run. After saving, static checks were performed for UTF-8 without BOM, final newline, trailing whitespace/tabs, mojibake markers, local Markdown links, and proposal-scoped whitespace. No other file was written by this review.
