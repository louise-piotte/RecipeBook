# WP03 Section F — brown-rice-puffs alias review (R714, 2026-10-18)

## Review record

- **Candidate:** `brown rice puffs` as an English search alias for the existing `ingredient-ref-puffed-brown-rice` (`puffed brown rice / riz brun soufflé`).
- **Recommendation: hold.** The exact manufacturer title denotes plain puffed brown rice, but adding it as an alias would also make the broader `rice puffs` query return only the brown-specific row. Current product sources use `rice puffs` for more than one composition. Keep the phrase out of active aliases pending a picker-scope decision.
- **Scope:** One English word-order variant on an existing identity. This does not propose a new identity, French alias, form, recipe link, measurement, conversion, yield, or substitution.
- **Section F context:** The global plan retains the general rule to use aliases for true synonyms and regional/spelling variants ([plan, alias rule](../../RecipeBook-global-ingredient-catalog-plan.txt#L1530)). The existing brown-rice puff identity was accepted in R79 without aliases ([R79 proposal](wp03-section-f-next-grain-review-r79-20261013.md), [R79 integration](../batches/wp02-wp03-wp04-r79-integration-20261013/README.md)). This packet reviews only the newly evidenced product phrase and its effect on the current picker.
- **Current package snapshot:** 1,841 ingredient references (276 `GRAIN_AND_CEREAL`), 174 forms, 56 legacy candidates, and 2,224 research-ledger records. The manifest lists 114 recipes and 1,123 ingredient rows.

## Evidence and limits

Good Morning Cereals' current product page is titled **Brown Rice Puffs**. It describes the product as puffed rice grains and declares `Organic Brown Rice (100%)` as its only ingredient [S01]. This directly supports the phrase as a name for plain puffed brown rice in that manufacturer's product range. It does not establish Québec usage, broad market frequency, or a universal product standard.

The problem is the phrase search projection. The current picker treats a complete word phrase inside an alias as a match. If `brown rice puffs` were stored on the brown-specific row, a query for `rice puffs` would match that alias and return only `puffed brown rice`, even though the query omits the brown qualifier. A live Coles product page uses **Rice Puffs** for a ready-to-eat cereal described as puffed whole white rice but whose listed ingredients also include sugar, glucose syrup, salt, barley malt extract, and other additions [S02]. Orgran's current product page also uses **Rice Puffs** for a product listing rice flour and rice bran, rather than a single-ingredient puffed-grain product [S03]. These pages demonstrate broader product use of the shorter phrase; they do not establish that those products should share the brown-rice identity.

The evidence therefore supports the fully qualified product name but does not settle whether the picker should route the nested, unqualified phrase `rice puffs` to this specific brown-rice row. No broader alias is assigned to generic puffed rice in this proposal: the reviewed product name spans plain grains and formulated cereal products, and the bundled catalog has no product-family rule for resolving that scope.

## Current ownership, alias, and source audit

| Surface | Current owner or status | R714 disposition |
|---|---|---|
| `ingredient-ref-puffed-brown-rice` | `puffed brown rice / riz brun soufflé`, category `GRAIN_AND_CEREAL`, empty alias arrays, null default density, and empty unit mappings. Its ledger identity is verified; its existing Yupik cup observation is product-specific. | Keep the reference and all fields unchanged. Do not add `brown rice puffs` to `aliasesEn` in this review. |
| `ingredient-ref-puffed-rice` | `puffed rice / riz soufflé`, category `GRAIN_AND_CEREAL`, current English aliases `muri` and `murmura`, no French aliases, no attached forms, null default density, and empty unit mappings. | Keep its generic display and aliases unchanged; do not add the unqualified `rice puffs` phrase here. |
| Exact normalized term ownership | No active reference name/alias or form label/match term owns `brown rice puffs`, `brown rice puff`, `rice puffs`, or `rice puff`. | The candidate has no current owner; no ID is requested. |
| Forms and legacy candidates | Neither puffed-rice row has an attached form. The 56-row legacy-import file has no matching phrase or candidate ID. | Add no form or legacy mapping. |
| Research ledger | The puffed-brown-rice record contains the accepted Yupik identity sources and a Yupik-only 1 cup / 15 g observation, with cup convention and fill method unspecified. It has no source entry for the Good Morning product page and no alias decision for `brown rice puffs`. | Do not alter the ledger or reinterpret the existing portion. The new source IDs below are citations local to this proposal only. |
| Source ownership | The Good Morning product URL, Coles URL, and Orgran URL below have no existing ledger source owner. Good Morning's separate `Our process` URL is already registered as `WP03-PUFSPELT-20261011-S04` on the puffed-spelt record; it is not duplicated or reassigned here. | Keep the three new source IDs and their URLs proposal-local. Reuse the existing process source only as shared manufacturer context. |
| Prior Section F work | R79 integrated the existing brown-rice puff identity with no aliases and noted `brown rice puffs` only in its ownership/corpus scan. R93 kept puffed brown rice distinct from generic puffed rice and puffed black rice. R708 reviewed `pori` for generic puffed rice; R711 added `tukda chawal` to broken rice. None decides this exact brown-rice alias. | This is a distinct alias-scope review; it does not reopen the R79 identity, R93 identity, R708 `pori` hold, or R711 broken-rice decision. |

The only earlier archive occurrence of the exact phrase `brown rice puffs` is R79's ownership and recipe-scan text. R79 did not add or reject an alias. Exact source-URL searches found no prior owner for the three new proposal-local URLs. The new R714 source IDs and URLs are not requested for the shared ledger; the reused process source remains registered on its existing puffed-spelt record.

## Bounded disposition

Keep both existing reference rows unchanged. Do not allocate a new identity, alias, form, or candidate record.

The only candidate field change, if a later picker review accepts the contained-query behavior, would be:

| Existing field | Current | Conditional candidate only; not requested in R714 |
|---|---|---|
| `ingredient-ref-puffed-brown-rice.aliasesEn` | `[]` | `["brown rice puffs"]` |

R714 does **not** request this change or a generic `rice puffs` alias. Reopen the phrase after the catalog decides whether `rice puffs` should return generic puffed rice plus the brown-rice subtype, and how formulated cereal products using the same wording should be represented. Do not make the Brown Rice Puffs product a separate identity or transfer its brand-specific serving data.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, and punctuation, returns complete word-phrase matches first, and uses substring matching only if that pass finds no row. The table shows a static projection from the checked-in references and forms. The conditional column demonstrates why R714 holds the alias; it is not live app QA.

| Query | Current result | If only `brown rice puffs` were added to the brown-specific row |
|---|---|---|
| `brown rice puffs` | No result | `ingredient-ref-puffed-brown-rice` only |
| `brown rice puff` | No result | `ingredient-ref-puffed-brown-rice` only via substring fallback |
| `rice puffs` | No result | `ingredient-ref-puffed-brown-rice` only, despite the missing brown qualifier |
| `rice puff` | No result | `ingredient-ref-puffed-brown-rice` only via substring fallback |
| `puffed brown rice`; `riz brun soufflé` | `ingredient-ref-puffed-brown-rice` only | Unchanged |
| `puffed rice`; `riz soufflé` | `ingredient-ref-puffed-rice` only | Unchanged; the generic row remains separate |
| `brown rice` | Six rows: brown rice, brown-rice flakes, brown-rice flour, brown-rice syrup, puffed brown rice, and sprouted brown rice | Same six rows; the existing display already contains the phrase |
| `puffs` | Six rows: OREO PUFFS cereal, puffed buckwheat, puffed Khorasan wheat, puffed millet, puffed sorghum, and puffed spelt | Those six plus puffed brown rice |

The picker consequence is not just a second spelling of the fully qualified display: it changes the result for the shorter `rice puffs` and `rice puff` queries. The current data has no generic `rice puffs` owner to preserve a broader result.

## Full recipe-corpus scan

All 114 manifest-listed recipe files and all 1,123 structured ingredient rows were scanned. The normalized phrase scan covered `brown rice puffs`, `brown rice puff`, `rice puffs`, `rice puff`, `puffed brown rice`, `puffed brown rice cereal`, `puffed rice cereal`, `rice puff cereal`, `riz brun soufflé` (with and without the accent), `riz soufflé brun` (with and without the accent), and `puffed rice`.

| Scan | Result |
|---|---:|
| Manifest recipe files | 114 |
| Ingredient rows | 1,123 |
| Files with candidate or boundary phrase | 0 |
| Ingredient rows with candidate or boundary phrase | 0 |
| Rows linked to `ingredient-ref-puffed-brown-rice` | 0 |
| Rows linked to `ingredient-ref-puffed-rice` | 0 |

The bundle has no matching demand for the phrase or either neighboring reference. No recipe link, text, amount, or substitution is proposed. This is a finding about the bundled corpus, not a claim about all user recipes.

## Forms, measurements, and substitutions

- **Identity and category:** Keep the existing `GRAIN_AND_CEREAL` identity `puffed brown rice / riz brun soufflé`. Do not create a second identity from the manufacturer's English word order, and do not merge it into generic puffed rice.
- **Forms:** Add none. The existing reference is a product identity, and no preparation-state form is requested.
- **Measurements:** Add no observation, default density, unit mapping, or active measure. Good Morning's 14 g serving and its other package details do not supply a volume-to-mass conversion. Leave the existing Yupik 1 cup / 15 g observation scoped to Yupik SKU P31093; do not transfer or combine it with the Good Morning serving.
- **Conversions and yields:** Add none. The product sources do not support a general cup measure, raw-to-puffed yield, or conversion between brown and generic puffed rice.
- **Substitutions:** Add no global or contextual rule. No source here establishes an amount or tested culinary interchangeability with generic puffed rice, other puffed grains, cereals, or snacks. Leave the existing ledger decision unchanged.
- **Recipe links:** Add none; the full bundled scan found no matching lines or reference links.

## Proposal-local sources

Checked on **2026-10-18**. The IDs below are citations local to R714 only; no shared-ledger source entry is requested.

| Proposal-local source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-BROWN-RICE-PUFFS-R714-20261018-S01` | Good Morning Cereals, [Brown Rice Puffs](https://www.goodmorningcereals.com/products/brown-rice-puffs/), product heading, product description, ingredient declaration. | Current manufacturer product page is titled `Brown Rice Puffs`, calls them puffed rice grains, and lists organic brown rice as the sole ingredient. Direct support for this manufacturer's fully qualified product wording; not Québec terminology guidance or proof of market-wide frequency. The 14 g serving is not used as a measure. |
| `WP03-BROWN-RICE-PUFFS-R714-20261018-S02` | Coles, [Coles Rice Puffs, 475 g](https://www.coles.com.au/product/coles-rice-puffs-475g-4769496), current product description and ingredient list. | Current retailer listing uses the unqualified title `Rice Puffs` and describes puffed whole white rice, while its ingredient panel includes rice, sugar, glucose syrup, salt, barley malt extract, and other additions. Shows that the short phrase can label a ready-to-eat cereal product; not evidence for a plain-ingredient alias. Retailer data may change. |
| `WP03-BROWN-RICE-PUFFS-R714-20261018-S03` | Orgran, [Orgran Rice Puffs](https://orgran.com/product/orgran-rice-puffs/), current product heading and ingredients. | Official brand page uses `Rice Puffs` for a cereal with rice flour (79%) and rice bran (21%). Shows a different composition under the same short product wording; the page does not specify its manufacturing process. Not evidence for the brown-rice identity or a generic alias. |
| Existing `WP03-PUFSPELT-20261011-S04` (reused; not reallocated) | Good Morning Cereals, [Our process](https://www.goodmorningcereals.com/our-process/), whole-grain puffing-process description. | Existing ledger source for puffed spelt. It says the manufacturer's puffing process heats whole grains in a pressure vessel; used only as general process context and not as new brown-rice evidence or a source-ID allocation. |

## Disposition

**Hold `brown rice puffs` out of active aliases in R714.** The source supports the fully qualified name for a plain puffed-brown-rice product, but current search would route the unqualified `rice puffs` query to that brown-specific reference alone. Current product evidence shows that the shorter phrase also names cereal products with different compositions. Keep the existing identities, aliases, ledger data, and recipes unchanged until the broader query behavior and product scope are resolved.
