# WP04 Section P — tarako / salted pollock roe boundary (R156)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Japanese salted pollock roe, specifically the product called *shio-tarako* when Alaska pollock roe is intended.
- **Recommendation:** **Hold** outside active references, forms, legacy mappings, and the research ledger until a bundled recipe or explicit product request selects a product and resolves the fish species and presentation.
- **Scope:** This is a focused review of *tarako* as a roe product. It does not reopen the R40 mentaiko hold, salmon roe, kazunoko, tobiko, masago, caviar, Alaska pollock flesh, or Pacific cod flesh.
- **Proposal-only status:** This file is the only proposed artifact. No shared catalog, ledger, generated file, recipe, plan, roadmap, or integration README was changed. No tests or emulator checks were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-TARAKO-R156-20261015-S01` through `S06`, plus audit ID `WP04-SECTIONP-TARAKO-R156-20261015-R01`. They are source labels in this proposal only, not shared-ledger records.

## Why this is the next unfinished candidate

The open [Section P roe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5951) conditions roe coverage on recipe demand. The R40 [mentaiko product-boundary review](wp04-section-p-mentaiko-seasoned-roe-product-boundary-review-20261013-round40.md) explicitly keeps mentaiko distinct from *tarako*, but does not decide whether *tarako* merits a row, establish its Québec French name, or project its picker impact. The plan’s mentaiko note likewise says MAFF distinguishes *shio-tarako* from *karashi-mentaiko*; it is not a tarako decision. The R155 smoked-oyster review concerns a separate product family.

The live package contains **1,528 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,873 ledger records / 7,937 source entries / 6,785 distinct source IDs**. The manifest lists **114 recipe files / 1,123 ingredient rows**. No active identity, form, legacy candidate, or ledger record owns *tarako*, *shio-tarako*, or an exact pollock-roe product phrase. The ID `ingredient-ref-tarako` appears in R40’s ownership audit only as an unused ID; it has not been allocated or reserved.

## Product, species, and naming boundary

Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) distinguishes salted roe products from their seasoned derivatives: its salted-food classification identifies *shio-tarako* as Alaska-pollock roe and *karashi-mentaiko* as salted Alaska-pollock roe in liquid seasoning. This gives a useful product boundary for a specifically named Japanese product; it is not a Canadian package-label standard. [Reused source: `WP04-SECTIONP-MENTAIKO-20261013-R40-S01`]

The same ministry documents an important regional exception. In its Akita regional-cuisine entry, MAFF says that *tarako* generally means Alaska pollock roe, but in Akita it means Pacific cod roe. The local dish uses raw Pacific-cod roe, not the standardized salted Alaska-pollock product *shio-tarako*. Do not attach unqualified *tarako* to `ingredient-ref-alaska-pollock` or `ingredient-ref-pacific-cod`, and do not treat every recipe or market use of *tarako* as one species or preparation. [S01]

Japan’s 2023 Standard Tables of Food Composition list food number 10202 as walleye pollock “Tarako” (salted roe), raw, with scientific name *Theragra chalcogramma*. The Alaska Seafood Marketing Institute identifies Alaska pollock as *Gadus chalcogrammus* (synonym *Theragra chalcogramma*) and describes the Japanese distinction as tarako (salted) versus mentaiko (spiced). These sources support the species-scoped Japanese product sense, while not establishing a Québec consumer term or the identity of every Canadian pollock-roe product. [S02–S03]

The current H Mart Mall Toronto page lists **HS) Salted Pollock Roe**, 170 g, SKU `761898745298`, alongside the Korean name `한상) 명란젓`; the listing was out of stock when accessed. It does not identify a scientific species, give an ingredient declaration, or call the product *tarako*. Treat it as evidence that a salted pollock-roe product is listed in Canada, not as proof that this product is Japanese *shio-tarako* or that it is currently available in Québec. [S04]

The K Mart’s **Choripdong Pollock Roe for Spicy Fish Stew** is a different product: its ingredient list includes pollock roe, water, salt, sugar, mirin, seasoning extract, and preservative, and the listing says pollock roe originates in Russia or the USA and is processed in South Korea. The page showed the product sold out. This is prepared roe for stew, not a specification for plain salted *shio-tarako*. No tarako-flavoured snack or seasoning product was used as evidence for a standalone roe ingredient. [S05]

For French, the OQLF’s GDT normalizes **œufs** for English *roe* as the name of a marketable anatomical part, but it does not give a *tarako*-specific term. Its separate preferred species name is **goberge de l’Alaska** for *Theragra chalcogramma*; that is a fish name, not a roe-product name. A transparent phrase such as **œufs salés de goberge de l’Alaska** could be considered in a future product-specific review, but it is a descriptive construction, not an OQLF-approved compound or a verified Québec package name. A French sushi-education page uses *œufs salés de colin d’Alaska (Tarako)*; this is explanatory culinary wording outside Québec and does not resolve the local term. [Reused sources: `WP04-SECTIONP-MENTAIKO-20261013-R40-S03` and `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S03`; S06]

## Exact ownership and identifier audit

Exact-key checks use the normalization behavior of [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD folding, `œ` to `oe`, accent and punctuation removal, and whitespace collapse. The audit compared active bilingual reference names and aliases, form labels and match terms, all legacy candidate names and aliases, and ledger record IDs and text. It also checked the prior proposal and batch archive.

| Candidate key or ID | Current owner | Boundary |
|---|---|---|
| `tarako`; `shio-tarako`; `salted Alaska pollock roe`; `salted pollock roe`; `pollock roe`; `cod roe`; `œufs salés de goberge de l’Alaska` | No exact active reference, form, legacy, or ledger-term owner. | Do not add unqualified *tarako* as a species alias. The phrase *shio-tarako* is reserved here for the MAFF-described salted Alaska-pollock product. |
| `ingredient-ref-tarako`; `ingredient-ref-salted-pollock-roe`; `candidate-tarako`; `candidate-pollock-roe` | No active reference/form ID, legacy candidate ID, or ledger record ID. | `ingredient-ref-tarako` is mentioned as unused in R40’s audit, but no row or reservation exists. No ID is allocated by this hold. |
| `WP04-SECTIONP-TARAKO-R156-20261015-S01`–`S06`; `…-R01` | No prior source ID in the ledger or reviewed archive. | Proposal-local provenance only. MAFF classification, generic OQLF `œufs`, and OQLF `goberge de l’Alaska` are reused by their existing R40/ledger source IDs rather than assigned duplicate IDs. |
| Alaska pollock; Atlantic pollock; crab-flavoured pollock flakes | Existing fish-species or distinct product references. | None owns a roe phrase. Do not attach a roe product to Alaska pollock flesh or use the unqualified word *pollock* to assign species. |
| Pacific cod; Atlantic cod | Existing cod-species references. | The Akita raw-roe use of *tarako* does not make cod roe an alias or form of a cod-flesh reference. |
| `candidate-salmon-roe`; `candidate-sea-urchin-gonads-uni`; finger lime / `lime caviar` | Separate held roe candidate, sea-urchin gonad candidate, and citrus identity. | None owns tarako or pollock roe; retain each product boundary. |

The archive contains R40’s mentaiko review and hold, which mention *tarako* as a distinct neighboring product and note that `ingredient-ref-tarako` is unused. No focused tarako/shio-tarako review or active allocation was found. That mention is not a prior decision for the product under review.

## Picker projection

The projection follows phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms. The hypothetical row below is only for impact analysis: English `salted Alaska pollock roe`, French `tarako (œufs salés de goberge de l’Alaska)`, and no aliases or forms. It represents the narrow *shio-tarako* product sense, not regional raw Pacific-cod roe or a generic roe category.

| Query | Current result | Hypothetical result |
|---|---|---|
| `tarako`; `salted Alaska pollock roe`; `pollock roe` | None | One salted Alaska-pollock-roe result |
| `pollock` | Alaska pollock; Atlantic pollock; crab-flavoured pollock flakes | The same three plus the hypothetical roe product |
| `Alaska pollock`; `goberge de l’Alaska` | Alaska pollock | Alaska pollock plus the hypothetical roe product |
| `roe` | Greenland halibut / flétan du Groenland, through substring fallback on `Groenland` | The hypothetical product alone through phrase-first matching |
| `mentaiko`; `fish roe`; `œufs de poisson` | None | Unchanged; none are aliases in this projection |
| `caviar` | Finger lime / lime caviar | Unchanged |

Exact product search would become possible, but the same row would cause the generic `roe` query to select one held product and would add a roe product to broad pollock and Alaska-pollock searches. That is a poor picker result while the roe family remains incomplete and the source term has a documented regional species exception.

## Bundled-recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It searched complete recipe JSON text and ingredient-row content for `tarako`, `shio-tarako`, `pollock roe`, `salted pollock roe`, `salted Alaska pollock roe`, `cod roe`, `œufs salés de goberge de l’Alaska`, `mentaiko`, and adjacent roe wording. The scan found **zero matching recipe files and zero matching ingredient rows**. No bundled ingredient line, linked reference, amount, role, or cooking method selects tarako or another pollock-roe product. [R01]

## Forms, measures, and substitutions

- **Reference/form:** Add no reference, alias, or form. Salted roe is a separately prepared ingredient product, not a form of Alaska pollock flesh; the sources do not show one Canadian/Québec product specification that resolves the Japanese product term to a retail SKU.
- **French display:** Add no French display or alias. OQLF supports the generic anatomical term and the species name separately, not a normalized *tarako* compound. Keep `œufs salés de goberge de l’Alaska` as a possible explanatory draft pending Québec review.
- **Measures:** H Mart’s 170 g and The K Mart’s 340 g are package facts for separate products. Neither is a recipe amount, serving, household measure, roe-sack count, or reusable quantity.
- **Density, conversions, and yields:** No density, unit mapping, package yield, raw-to-salted relation, salt-rinse adjustment, cooking yield, or mass/volume conversion is supported.
- **Substitution:** Do not substitute pollock roe for mentaiko, salmon roe, kazunoko, tobiko, masago, cod roe, caviar, or fish flesh. Shared roe terminology or related fish taxonomy does not establish recipe suitability or quantity equivalence.

## Proposed reference and ledger delta

**No reference, form, legacy mapping, or ledger delta is proposed.** Do not create `ingredient-ref-tarako`, `ingredient-ref-salted-pollock-roe`, or a candidate ledger record under this hold. If a future recipe requests the product, review the exact wording first: determine whether it means Japanese *shio-tarako* from Alaska pollock, regional raw Pacific-cod roe, a Korean salted roe product, or seasoned roe prepared for another dish. Confirm the matching package and a Québec French display before deciding whether to allocate a species-scoped product row.

## Source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-TARAKO-R156-20261015-S01** | Japan Ministry of Agriculture, Forestry and Fisheries, [Taranokoiri (stir-fried cod roe), Akita Prefecture](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4839/index.html), accessed 2026-10-15. | Says *tarako* generally means Alaska-pollock roe, but in Akita means Pacific-cod roe; describes a regional dish using raw roe. Regional food evidence, not a standardized Canadian product label. |
| **WP04-SECTIONP-TARAKO-R156-20261015-S02** | Japan Ministry of Education, Culture, Sports, Science and Technology, [Standard Tables of Food Composition: food 10202, Tarako](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=10_10202_7&MODE=6), based on the 2023 expanded edition; accessed 2026-10-15. | Lists walleye pollock “Tarako” (salted roe), raw, with the scientific name *Theragra chalcogramma*. Food-composition classification, not a Canadian or Québec retail specification. No food-composition numbers are used as kitchen measures. |
| **WP04-SECTIONP-TARAKO-R156-20261015-S03** | Alaska Seafood Marketing Institute, [Alaska Pollock](https://www.alaskaseafood.org/species/alaska-pollock/), accessed 2026-10-15. | Gives *Gadus chalcogrammus* (*Theragra chalcogramma*) and describes Japanese tarako as salted and mentaiko as spiced Alaska-pollock roe. Industry promotion source; supports product vocabulary, not Québec naming or Canadian retail equivalence. |
| **WP04-SECTIONP-TARAKO-R156-20261015-S04** | H Mart Mall Toronto, [HS) Salted Pollock Roe](https://hpack.ca/products/761898745298), SKU `761898745298`, accessed 2026-10-15. | Product title, 170 g listing, Korean name `한상) 명란젓`; page showed out of stock. It gives no scientific species, ingredient declaration, or *tarako* name, and is not Québec availability evidence. |
| **WP04-SECTIONP-TARAKO-R156-20261015-S05** | The K Mart, [Choripdong Pollock Roe for Spicy Fish Stew, 340 g](https://www.thekmart.ca/en/products/%EC%B4%88%EB%A6%BD%EB%8F%99%EC%9D%B4%EC%95%8C%ED%83%95%EC%9A%A9%EB%AA%85%EB%9E%80-12oz340g), accessed 2026-10-15. | Product-specific name, ingredient list, stated origin of roe (Russia or USA), processing in South Korea, and frozen storage. The product is seasoned for stew and does not identify the pollock species or establish plain *shio-tarako*. Page showed sold out. |
| **WP04-SECTIONP-TARAKO-R156-20261015-S06** | Sushi University, [Pollock roe (Tarako), French visual dictionary](https://sushiuniversity.jp/french/visual-dictionary/?Name=Pollock-roe-%28Tarako%29), accessed 2026-10-15. | Uses descriptive French `œufs salés de colin d’Alaska (Tarako)` and contrasts tarako with spicy mentaiko. Non-Québec culinary source; not a French terminology authority or a Québec product label. |
| **Reused: `WP04-SECTIONP-MENTAIKO-20261013-R40-S01`** | MAFF, [Salted foods — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/siozuke.html), accessed 2026-10-15. | Existing R40 source ID reused for the *shio-tarako* / *karashi-mentaiko* product distinction. No duplicate source ID is allocated. |
| **Reused: `WP04-SECTIONP-MENTAIKO-20261013-R40-S03`** | OQLF, [GDT: œufs de poisson](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435851/oeufs-de-poisson), accessed 2026-10-15. | Existing R40 source ID reused for the generic Québec French term `œufs de poisson`; it does not name tarako. |
| **Reused: `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S03`** | OQLF, [GDT: goberge de l’Alaska](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199004/goberge-de-lalaska), accessed 2026-10-15. | Existing shared-ledger source ID reused for the Québec French species name *goberge de l’Alaska* / *Theragra chalcogramma*. It is not a roe-product term. |
| **WP04-SECTIONP-TARAKO-R156-20261015-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest-listed recipe files, and Section P archive. | Static exact-ownership, ID/source-ID, picker, and corpus audit against 1,528 references, 119 forms, 61 legacy candidates, 1,873 ledger records / 7,937 source entries / 6,785 distinct source IDs, and 114 recipes / 1,123 ingredient rows. Repository snapshot; does not establish product availability. |

## Final disposition

**Hold** tarako outside active references, forms, legacy mappings, and the research ledger. MAFF documents a common Alaska-pollock product sense and an Akita Pacific-cod regional use; current Canadian listings do not resolve those usages to one Québec recipe product. Preserve the existing Alaska-pollock, Pacific-cod, and held roe scopes. Reopen when a bundled recipe or explicit product request identifies the required species and product state, then confirm a Québec French display and picker behavior. No data was changed, and no tests were run for this documentation-only proposal.
