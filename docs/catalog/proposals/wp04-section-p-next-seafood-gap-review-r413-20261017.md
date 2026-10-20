# WP04 Section P — sujiko / salmon roe in the sac product boundary (R413)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** `sujiko`, a salmon-roe product kept in its ovarian skein; sources describe both fresh raw skein as an input and salted intact skein as a finished product.
- **Recommendation:** Keep `sujiko` unallocated as a reference, alias, and form for now. The existing `salmon roe / œufs de saumon` reference remains the broad roe identity. The sources distinguish the in-skein product from separated roe, but do not establish one consistent product state or a current Québec-facing bilingual label for the sujiko item.
- **Scope:** This proposal reviews the sujiko product-state boundary only. It does not reopen the integrated broad salmon-roe identity or its qualified caviar aliases, the product-specific `ikura` decision, the Montréal Nenu Dieune / mullet-roe hold, cod or trout roe, or any other prior roe decision.
- **Proposal-only status:** This is the only proposed file change. No shared catalog, ledger, plan, roadmap, generated file, recipe, or application code was edited. No software tests, build, emulator, or deployment was run.
- **Snapshot:** Counts, ownership, picker, and corpus results below describe the workspace before the R412–R414 integration; the integration README records the resulting state.
- **Proposal-local source IDs:** `WP04-SECTIONP-SUJIKO-R413-20261017-S01` and audit label `WP04-SECTIONP-SUJIKO-R413-20261017-R01`. The R413 labels are local to this proposal. Existing MAFF, OQLF, La Mer, and Ozawa identifiers are reused where noted.

## Why this is a distinct open boundary

The [Section P roe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7406) remains open after the [R407 salmon-roe integration](../batches/wp02-wp04-wp06-r406-r408-gap-review-integration-20261017/README.md) and the [R410 Nenu Dieune hold](../batches/wp02-wp04-wp06-r409-r411-gap-review-integration-20261017/README.md). R407 adopted a species-neutral salmon-roe identity and kept `ikura` product-specific. It cited a Hokkaido recipe that begins with a fresh salmon-roe sac (`sujiko`) and breaks it apart to make ikura; it did not decide whether an in-skein sujiko product deserves a searchable form. No focused sujiko review or exact sujiko catalog allocation appears in the proposal and batch archive. This packet addresses that narrow product-state question without changing R407's broader identity decision.

The sources document two related but non-identical uses. Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) distinguishes salted salmon or trout roe sac (`sujiko`) from salmon or trout roe in brine (`shio-ikura`). Its Hokkaido recipe also calls fresh raw salmon roe before separation `sujiko`, then instructs the cook to break up the sac and season the eggs as ikura. A North American processor, E&E Foods, uses `Sujiko` for salted salmon roe whose eggs remain intact in the skein, while a Canadian distributor's 2024 catalog lists `Sujiko / Chum Salmon Roe` as a seasonal product. These sources establish a recognizable in-skein product boundary, while leaving the intended state dependent on the specific use and source. [reused R40-S01; reused R407-S02; S01; reused R328-S04]

## Québec naming and product boundary

OQLF's preferred Québec term is the broad `œufs de saumon`, equivalent to `salmon roe`; the entry does not provide a distinct sujiko term. La Mer's current Montréal-facing French product page calls its general listing `Caviar de saumon frais`, while a separate Keta listing is titled `Caviar de saumon Keta (Ikura)`. Neither page identifies a roe sac or uses `sujiko`. The sources reviewed here did not establish a current Québec consumer product label pairing `sujiko` with a French name. [reused R33-S01; reused R407-S01; reused R96-S07]

`Œufs de saumon en poche` or `œufs de saumon en sac` could serve as literal descriptive wording, but neither is verified here as a Québec product name or OQLF term. Do not add either as an alias or form label, and do not transfer one seller's species, salting, freshness, or season to all salmon roe. Keep `sujiko` out of the active aliases/forms until a recipe or a current Québec package identifies the intended product state and its bilingual label. If that evidence later selects an in-skein salmon-roe ingredient, assess a product-state form attached to `ingredient-ref-salmon-roe` before considering a separate ingredient reference.

This boundary remains separate from the existing broad salmon-roe name, qualified `salmon caviar / caviar de saumon` aliases, and MAFF's ikura preparation. Do not add `ikura` as a sujiko alias: MAFF describes ikura as the separated eggs, and the integrated R407 decision keeps it product-specific. Do not use bare `caviar`, assign a salmon taxon, or treat sujiko as a form of salmon flesh.

## Live ownership, archive, and recipe audit

The repository snapshot contains **1,715 active references**, **141 forms**, **56 legacy candidates**, and **2,074 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**. Exact phrase ownership was checked across bilingual reference names and aliases, attached form labels and match terms, legacy names and aliases, and ledger record IDs.

The read-only inputs were the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The ledger contains R407's MAFF source note that gives half a salmon-roe sac as one recipe's input, but no sujiko record, candidate, or source entry. No R413 source prefix collision was found.

| Key or record | Current owner | Disposition |
|---|---|---|
| `salmon roe`, `œufs de saumon`, `salmon caviar`, `caviar de saumon` | `ingredient-ref-salmon-roe`; no attached form. | Preserve the R407 identity and its two qualified caviar aliases. |
| `sujiko`, `筋子`, `salmon roe in sac`, `salted salmon roe in sac`, `salmon roe skein`, `œufs de saumon en poche`, `œufs de saumon en sac` | No exact active reference, form, or legacy candidate; no sujiko ledger record or candidate ID. | Do not allocate a reference, alias, form, or ledger candidate. |
| `salmon roe sac` | No active reference/form owner. The R407 MAFF source note mentions a half-salmon-roe sac only as the input quantity in that recipe. | Keep that source-scoped recipe detail separate from a Sujiko identity or form. |
| `roe` | Four phrase-first results: bottarga, milt, salmon roe, and trout roe. | Keep the current four-result query. A form on salmon roe would remain part of the same result. |
| `salmon` / `saumon` | Ten phrase-first results, including the salmon-roe row and the active flesh and preserved-salmon products. | Do not add another result for an in-skein presentation. |
| `ingredient-ref-sujiko`, `candidate-sujiko`, R413 source prefix | No active allocation or source-ID prefix collision. | Keep all proposal-local IDs unallocated. Reuse existing IDs for repeated URLs. |

The [R407 proposal](wp04-section-p-next-seafood-gap-review-r407-20261017.md) is the only focused prior packet that mentions sujiko, as the source material in a recipe for ikura; it does not propose a sujiko row or form. The [R410 proposal](wp04-section-p-next-seafood-gap-review-r410-20261017.md) concerns a different, seller-specific mullet-roe listing and remains held. The prior [tobiko/masago boundary review](wp04-tobiko-masago-roe-boundary-review-20261009.md) and [R401 cod-roe hold](wp04-section-p-next-seafood-gap-review-r401-20261017.md) remain unchanged. No other focused sujiko proposal or batch decision was found. [R01]

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**. It searched complete recipe JSON and structured ingredient rows for `sujiko`, `筋子`, `salmon roe in sac`, `salmon roe sac`, `salted salmon roe`, `salmon roe skein`, `roe skein`, `œufs de saumon en poche`, `œufs de saumon en sac`, `ikura`, `salmon roe`, `œufs de saumon`, `salmon caviar`, and `caviar de saumon`. It found **zero matching files and zero matching rows**. No bundled recipe specifies a sujiko product, use, preparation, or amount. [R01]

## Picker projection

The projection follows the current phrase-first, then substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), across bilingual reference terms and attached forms. The hypothetical column shows what a form under `ingredient-ref-salmon-roe` would do; it is only a comparison and is not a data recommendation. `Œufs de saumon en poche` is an unverified literal translation used only to illustrate the query.

| Query | Current picker result | If a sujiko form were attached to salmon roe |
|---|---|---|
| `sujiko`, `salmon roe in sac`, `salted salmon roe in sac` | None | `salmon roe / œufs de saumon` |
| `œufs de saumon en poche` | None | `salmon roe / œufs de saumon` |
| `salmon roe`, `œufs de saumon` | `salmon roe / œufs de saumon` | Same single row |
| `roe` | Bottarga; milt; salmon roe; trout roe | Same four rows |
| `salmon`, `saumon` | Ten rows, including salmon roe | Same ten rows |
| `ikura` | None | None; do not attach ikura as a sujiko alias |
| `caviar` | Finger lime; salmon roe; trout roe | Same three rows |

The hypothetical form would expose exact product wording without increasing the broad `roe` or `salmon` result counts, since forms return their parent reference. Search projection alone does not resolve which sujiko state a recipe intends or validate a Québec French form label, so no form is proposed.

## Measures, forms, and substitutions

- **Form and process:** MAFF distinguishes raw salmon roe sacs used as the starting ingredient from the separated, seasoned ikura result. Its salted-food overview describes finished sujiko as salted salmon or trout ovary, and E&E's salmon-specific sujiko is salted with the eggs intact in the skein. No single preparation state can be applied to every source use of `sujiko`. Add no form, state, species, or process assertion to the active salmon-roe row.
- **Quantities:** MAFF's four-serving ikura recipe calls for `1/2 piece` of fresh sujiko before separation, with no mass or volume. This is recipe-specific input quantity, not a serving standard, package quantity, count-to-mass conversion, or app recipe measure. The Ozawa catalog's `WT 2.21 lbs ~` is a distributor product-size note, not a recipe portion or supported package yield. Add no measurement observation, default measure, density, unit mapping, conversion, cooking yield, or package yield. [reused R407-S02; reused R328-S04]
- **Substitution:** No reviewed source gives a tested replacement between sujiko and ikura, other salmon-roe products, trout roe, tobiko, masago, bottarga, milt, or another ingredient. MAFF's recipe describes processing sujiko into ikura; that preparation relationship does not establish a replacement ratio. Add no global or contextual substitution rule or recipe-line substitution. The existing salmon-roe ledger state remains `researched_no_supported_value` for measurement and `researched_no_supported_substitute` for substitution; it has no measurement observations, substitution findings, or unit-conversion row. The current rules files have no global or contextual substitution rows, and the package-yield file has no salmon-roe match. No sujiko ledger record is proposed.

## Source register

Sources were checked or rechecked on 2026-10-17. Reused IDs refer to sources already present in the proposal archive or ledger; the new E&E source ID below remains proposal-local.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **Reused WP04-SECTIONP-MENTAIKO-20261013-R40-S01** | MAFF, [Salted foods](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/siozuke.html), salted fish roe products. | Separates salted salmon or trout ovaries (`sujiko`) from salmon or trout roe in brine (`shio-ikura`), and distinguishes pollock tarako and herring kazunoko. Official Japanese product-state taxonomy; it does not set a Québec retail label. |
| **Reused WP04-SECTIONP-SALMON-ROE-R407-20261017-S02** | MAFF, [Ikura no Shoyu-zuke](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4769/index.html), Hokkaido description and four-serving recipe. | Describes fresh raw sujiko as the salmon-roe input, then breaks the sac and seasons the loose eggs as ikura. The recipe's half-piece quantity is specific to that four-serving recipe; it gives no mass or volume conversion. |
| **WP04-SECTIONP-SUJIKO-R413-20261017-S01** | E&E Foods, [Salmon Roe](https://www.eefoods.com/page/salmon-roe), product description for salted salmon roe (Sujiko). | Manufacturer says its salted sujiko is produced from King, Sockeye, and Coho salmon, with eggs intact in the skein; it says the item is for selected export markets. This is one producer's product specification, not a universal species or Québec availability claim. |
| **Reused WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S04** | Ozawa Canada / Tsukiji Ohta, [product catalogue (PDF)](https://ozawa.ca/wp-content/uploads/2024/12/Tsukiji-Ohta-Catalog.pdf), Sujiko entry. | Search-indexed text from the 2024 distributor catalogue labels a seasonal item `Sujiko / Chum Salmon Roe`, marks raw application, and prints a `WT 2.21 lbs ~` size note; direct PDF extraction returned an internal error. It does not give a French consumer label or establish present availability; the size note is not a reusable measure. |
| **Reused WP04-SECTIONP-SALMON-ROE-IKURA-20261013-R33-S01** | OQLF, [GDT: œufs de saumon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435824/oeufs-de-saumon), preferred Québec term and English equivalent. | Supports the broad pair `œufs de saumon / salmon roe`. It does not name sujiko or establish a French name for roe in the sac. |
| **Reused WP04-SECTIONP-SALMON-ROE-R407-20261017-S01** | Poissonnerie La Mer, [Caviar de saumon frais](https://www.lamer.ca/products/caviar-saumon-frais-pot), current Montréal product page. | Uses a French product title and offers 50 g / 100 g options for a general salmon-caviar product. It does not name sujiko or identify a roe sac; package options are SKU-specific. |
| **Reused WP04-SECTIONP-CHUM-SALMON-R96-20261014-S07** | Poissonnerie La Mer, [Caviar de saumon Keta (Ikura)](https://www.lamer.ca/products/caviar-saumon-keta), current Montréal product page. | Names a distinct Keta/Ikura salmon-roe SKU, marked frozen and sourced to British Columbia. It does not identify the sac form or define the state of other salmon roe. |
| **WP04-SECTIONP-SUJIKO-R413-20261017-R01** | Current [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt), references, forms, legacy identities, research ledger, proposal/batch archive, [manifest-listed recipes](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), substitution and yield data, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key/source ownership audit, phrase-first picker projection, full manifest recipe scan, and related data inspection at the snapshot counts above. It is repository evidence, not evidence of product availability beyond the linked sources. |

## Final disposition

**Keep sujiko as an unallocated, source-specific salmon-roe product state.** Preserve the MAFF and supplier distinction between roe in the skein and separated eggs, but do not add a separate ingredient reference, alias, form, legacy mapping, candidate, ledger source, measurement, conversion, yield, recipe link, or substitution. Reopen when a bundled recipe or current Québec-facing product label identifies the exact sujiko presentation and supports a French display. The broader R407 salmon-roe identity and all existing neighboring roe decisions remain unchanged.
