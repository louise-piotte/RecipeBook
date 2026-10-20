# WP04 Section P — salmon roe picker reassessment after R395 (R407)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** salmon roe / `œufs de saumon` as a species-neutral edible roe product.
- **Recommendation:** Add identity-only `ingredient-ref-salmon-roe` in `PROTEIN`, displayed as **salmon roe / œufs de saumon**, with only the qualified aliases **salmon caviar** and **caviar de saumon**. Keep `ikura` as a product-specific term rather than a global alias or form.
- **Scope:** This is a post-R395 recheck of the salmon-roe decision in the open Section P roe checklist. It does not reopen trout roe, cod roe, bottarga, milt, tobiko, masago, lumpfish roe, sturgeon caviar, or ankimo.
- **Proposal-only status:** This file is the only change. No shared references, forms, ledger, archive, generated index, checklist, roadmap, recipe, or application code was edited. No tests, build, emulator, or deployment was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SALMON-ROE-R407-20261017-S01`–`S02`, plus audit label `WP04-SECTIONP-SALMON-ROE-R407-20261017-R01`. These labels belong only to this proposal. Existing source URLs and IDs are reused where noted below.

## Why reopen the existing hold

The [open Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7384) still lists salmon roe among the recipe-conditioned roe gaps. R33 held the existing ledger candidate until a recipe selected a product, partly because adding the phrase `salmon roe` would have made bare `roe` resolve to a misleading singleton. The search result has changed since that review: R395 added trout roe / `œufs de truite` with qualified caviar aliases, and the live picker now returns bottarga, milt, and trout roe for `roe`. A salmon-roe row would make that broad query a four-item result rather than replacing one incidental substring hit with a singleton.

Current Montréal retail evidence now identifies both an unqualified salmon-roe product and a separately named Keta/Ikura product. OQLF supplies the Québec French term `œufs de saumon`. Together, these support a narrow culinary identity for salmon roe without assigning a species, origin, cure, or frozen/fresh state to every product. The exact product phrase would be directly searchable, and the broadened `roe` result would show several distinct roe products. The bundled recipe scan still finds no salmon-roe demand; after R395's recipe-independent trout-roe identity decision, lack of a bundle match alone does not require holding this equally bounded product category.

R33's previously cited Metro 50 g listing returned 403 during this recheck, so it is not relied on for current availability, naming, or package facts. The directly accessible La Mer pages provide current Québec retail evidence instead.

This revises the R33 disposition on salmon roe only. It preserves the R33 boundaries around `ikura` and product state, and it does not change the separate R401 cod-roe hold.

## Names and product boundary

OQLF gives preferred Québec French `œufs de saumon` and English `salmon roe`; its entry is old and supplies terminology, not product specifications. OQLF's caviar entry says to qualify caviar made from non-sturgeon eggs with the fish name, using salmon as an example. La Mer's Montréal listing uses `Caviar de saumon frais` in French and `Salmon Caviar` in English; these source-attested phrases justify the two qualified aliases, not bare `caviar` or `caviar rouge`. [R33-S01; reused R34-S01; S01]

Keep the reference species-neutral. La Mer sells a general `Caviar de saumon frais` listing without naming a species, as well as a separate frozen `Caviar de saumon Keta (Ikura)` product from British Columbia. Salties labels its own product `Salmon Roe (ikura)`, assigns it to *Salmo salar*, and describes it as lightly salted. Oysters & Caviar Montréal lists an `Ikura` product as salmon roe from Germany but gives no binomial. These product pages establish variation, not one species or a universal state. Do not attach *Salmo salar*, Keta, a country of origin, pasteurization, salt level, or a fresh/frozen form to the general row. [S01; reused R96-S07, R33-S04–S05]

Keep `ikura` out of global aliases and forms. The Japanese Ministry of Agriculture, Forestry and Fisheries describes ikura as separated salmon roe prepared from the salmon roe sac (`sujiko`), and its example seasons the eggs with salt or soy sauce. Canadian and Montréal sellers also apply the name to particular products, including a Keta SKU. Those sources make `ikura` a useful product-specific term, but they do not show that it names every salmon-roe presentation. Preserve the exact term in recipe text when needed and revisit a dedicated form or alias if a bundled recipe selects that preparation. [S02; reused R96-S07, R33-S04–S05]

Keep salmon roe separate from salmon flesh, trout roe, cod roe, bottarga, milt, and monkfish liver. R395's trout-roe page calls salmon roe a stronger-flavoured alternative, but gives no dish context, replacement ratio, or tested outcome; this does not support a substitution rule in either direction. R401's cod-roe review remains a distinct hold because its product evidence does not select a Québec presentation. R404's 20 g ankimo broth amount belongs only to its complete two-serving recipe and is unrelated to roe measurement or substitution. [reused R395-S02; R401; R404]

## Live ownership, archive, and recipe audit

The current snapshot contains **1,712 active references**, **141 forms**, **56 legacy candidates**, and **2,072 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**. Exact normalized-key checks used the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) rules and compared bilingual reference terms, form terms, legacy candidates, and ledger record IDs/text.

| Key or record | Current owner | Proposed disposition |
|---|---|---|
| `salmon roe`; `œufs de saumon`; `salmon caviar`; `caviar de saumon` | No exact reference or form owner; the ledger has the existing unresolved `candidate-salmon-roe`. | Promote that existing candidate to one verified reference at integration; do not leave a duplicate candidate. |
| `ikura`; `salmon eggs`; `caviar rouge`; `red caviar` | No exact active reference, form, or legacy owner. | Add none of these as aliases. |
| `roe`; `fish roe`; `fish eggs` | `roe` has phrase matches for bottarga, milt (`soft roe`), and trout roe. `fish roe` is in bottarga's descriptive display; `fish eggs` has no exact result. | Do not add a generic roe or fish-egg alias. |
| `caviar` | Finger lime and trout roe are current phrase matches. | Qualified salmon-caviar aliases add salmon roe as a third result; do not add bare `caviar`. |
| `ingredient-ref-salmon-roe` | No active reference; `candidate-salmon-roe` is the existing research record. | Create the active reference and convert the existing candidate record in place during integration. |
| R407 source prefix | No R407 source ID or source URL is allocated in the live ledger or prior proposal/batch files. | Keep S01–S02 and R01 proposal-local. Reuse existing archive IDs for repeated URLs below. |

The focused proposal/archive review found the R33 salmon-roe hold, the R395 trout-roe addition, the R401 cod-roe hold, and the R404 ankimo addition. None allocates salmon roe as an active identity. The manifest-ordered scan parsed **114 recipe files / 1,123 ingredient rows** and searched complete recipe JSON plus ingredient rows for `salmon roe`, `salmon caviar`, `œufs de saumon`, `caviar de saumon`, `ikura`, `salmon eggs`, and nearby generic roe phrases. It found **zero matching files and zero matching rows**. No recipe link or recipe quantity is proposed. [R01]

## Picker projection

This projection follows the current phrase-first then substring-fallback behavior over bilingual names, aliases, and attached forms. The hypothetical row has the two display names and only `salmon caviar` / `caviar de saumon` aliases.

| Query | Current result | With proposed row |
|---|---|---|
| `salmon roe`; `œufs de saumon`; `salmon caviar`; `caviar de saumon` | No result | Salmon roe / œufs de saumon |
| `ikura` | No result | No result; the product-specific term remains unallocated |
| `roe` | Bottarga; milt; trout roe | The same three plus salmon roe |
| `fish roe`; `œufs de poisson` | Bottarga | Unchanged |
| `fish eggs` | No result | Unchanged |
| `caviar` | Finger lime; trout roe | Finger lime; trout roe; salmon roe |
| `salmon`; `saumon` | Nine salmon flesh/product results, including canned and smoked salmon | The same nine plus salmon roe |

The exact bilingual terms become searchable. Broad `roe` gains a fourth distinct result, while broad `caviar` retains the existing finger-lime collision and gains salmon roe through its qualified aliases. Keep those effects explicit; do not add generic aliases to conceal or broaden them.

## Measures, forms, and substitutions

- **Packages:** La Mer's general fresh salmon-caviar SKU offers 50 g and 100 g options. Its separate Keta/Ikura SKU is frozen and 500 g. Oysters & Caviar Montréal lists 50 g and 100 g for a Germany-origin Ikura SKU; Salties lists seven 200 g jars of one *Salmo salar* SKU. These are listing-specific package facts, not servings, reusable measures, count conversions, package yields, or evidence for a universal state. [S01; reused R96-S07, R33-S04–S05]
- **Recipe amount:** MAFF's four-serving ikura recipe lists half of one piece of fresh salmon roe sac (`sujiko`) before separating and seasoning it. That recipe-specific count is not a mass, a general roe portion, or a bundled recipe amount. Do not record it as a reusable measure or link it to an app recipe. [S02]
- **Runtime data:** Add no form, density, unit mapping, active measure, conversion, package yield, cooking yield, or measurement observation. Preserve the existing candidate's `researched_no_supported_value` measurement state.
- **Substitutions:** The R395 retailer comparison describes flavour but gives no replacement method or ratio. No reviewed source supports a global or contextual replacement among salmon roe, trout roe, cod roe, tobiko, masago, bottarga, milt, sturgeon caviar, or uni. Add no substitution rule or recipe-line substitution, and preserve the candidate's `researched_no_supported_substitute` state.

## Proposed data disposition

At integration, promote the existing ledger candidate to a verified identity record and add this identity-only reference:

```json
{
  "id": "ingredient-ref-salmon-roe",
  "nameEn": "salmon roe",
  "nameFr": "œufs de saumon",
  "aliasesEn": ["salmon caviar"],
  "aliasesFr": ["caviar de saumon"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Carry forward the existing OQLF salmon-roe source and R33 product-boundary research; add S01–S02 to the converted identity record. Reuse the existing R96 source ID for the Keta/Ikura page and the R33 IDs for the Oysters & Caviar Montréal and Salties pages. Reuse the archived R34 OQLF caviar source ID for the qualified caviar wording. Do not create a separate new ledger candidate, package-yield row, form, recipe link, measurement observation, conversion, or substitution. The Section P roe checklist remains open for tobiko, masago, cod roe, and other distinct products.

## Sources

Sources were checked on 2026-10-17. Proposal-local IDs are evidence labels only; existing IDs identify repeated URLs already recorded in the ledger or prior proposal archive.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **Reused R33-S01** | OQLF, [GDT: œufs de saumon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435824/oeufs-de-saumon), preferred term and English equivalent. | Supports the Québec French `œufs de saumon` / English `salmon roe` name pair. The 1983 entry does not set species or product state. |
| **Reused R34-S01** | OQLF, [GDT: caviar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428361/caviar), definition and terminology note. | Says to qualify caviar made from non-sturgeon eggs with the fish name, giving salmon and cod as examples. Supports `caviar de saumon`; it does not support a bare `caviar` alias. |
| **R407-S01** | Poissonnerie La Mer, [Caviar de saumon frais](https://www.lamer.ca/products/caviar-saumon-frais-pot), product title, options, description, and Montréal retailer information. | Uses the French product title and supports 50 g / 100 g SKU formats. Its description says large soft grains and moderate salting, specific to this product; the listing gives no species. |
| **Reused R96-S07** | Poissonnerie La Mer, [Caviar de saumon Keta (Ikura)](https://www.lamer.ca/products/caviar-saumon-keta), product title, format, state, and origin. | Identifies a separate Keta SKU as frozen, 500 g, from British Columbia. It does not provide a taxonomic binomial or establish those traits for general salmon roe. |
| **R407-S02** | Japan Ministry of Agriculture, Forestry and Fisheries, [Ikura no Shoyu-zuke (Soy Sauce-marinated Salmon Roe)](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4769/index.html), description and four-serving recipe. | Defines ikura in relation to broken-down raw salmon roe sacs and describes salt or soy-seasoned preparations. The half-skein quantity is specific to this recipe. It supports keeping `ikura` as a narrower product term, not a global synonym for every salmon-roe product. |
| **Reused R33-S04** | Oysters & Caviar Montréal, [Ikura / Salmon roe](https://oystersandcaviar.ca/products/salmon-roe), product name, formats, origin, and Montréal packing note. | Lists 50 g / 100 g options and Germany as origin. The page identifies the item as salmon roe but gives no species or general process specification; it showed sold out during review. |
| **Reused R33-S05** | Salties, [Salmon Roe (ikura)](https://www.salties.ca/products/salmon-roe), label, species, package, and product description. | The Edmonton supplier identifies one SKU as *Salmo salar*, 7 × 200 g, ready to eat, and lightly salted. These are supplier-specific claims, not a Québec product label or reusable measure. |
| **Reused R395-S02** | CaviarHub, [Trout Roe](https://caviarhub.ca/products/trout-roe-red-caviar), product comparison section. | Calls salmon roe a bolder, more intense alternative to the retailer's trout roe. It gives no dish context, quantity ratio, or replacement outcome and does not support a substitution rule. |
| **R01** | Current manifest, references, forms, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), legacy candidates, research ledger, Section P proposals/batches, and manifest-listed recipe corpus. | Static exact-key ownership, archive/source-ID, picker projection, and recipe scan for the current snapshot (1,712 references, 141 forms, 56 legacy candidates, 2,072 ledger records, 114 recipes / 1,123 ingredient rows). It is a repository audit, not evidence of product availability beyond the pages above. |

## Final disposition

**Add identity-only salmon roe / œufs de saumon** with the two qualified caviar aliases. The R395 addition changes the `roe` query from a misleading singleton to a multi-result search, and current Montréal product listings provide a direct Québec-facing salmon-roe product. Keep `ikura` as a narrower product term, preserve trout and cod roe boundaries, and add no numeric or substitution behavior. No catalog or ledger data changed in this proposal-only review.
