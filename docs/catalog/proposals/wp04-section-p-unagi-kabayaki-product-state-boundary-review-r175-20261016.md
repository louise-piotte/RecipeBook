# WP04 Section P — unagi kabayaki product-state boundary review (R175)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Japanese `unagi kabayaki` / glazed, grilled eel.
- **Recommendation:** **Hold** a generic kabayaki identity or form outside active references, forms, legacy mappings, and the research ledger.
- **Scope:** One regional prepared-fish product-state boundary. This is distinct from R174's Filipino dried-salted `tuyo`, and does not reopen the active American eel identity or the prior unresolved generic eel boundary.
- **Status:** Proposal-only. No shared catalog JSON, generated Kotlin, research ledger, roadmap, plan checklist, recipe, manifest, batch README, or code was changed. No tests or builds were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S01` through `S06`, plus audit ID `WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-A01`. These IDs remain unallocated and are not shared-ledger records.

## Why this is a distinct open boundary

Section P still leaves regional seafood and fish product states open. The R174 tuyo review concerns a Philippine dried-salted fish term whose species and product variants are unresolved. This review concerns a Japanese eel preparation: a fish is split, deboned, grilled, and glazed with a soy-based tare; regional cooking can include steaming. It therefore raises a different product and identity question from dried fish, fish powder, formed seafood, canned seafood, or the existing raw/species-level eel reference.

The prior [unqualified-eel review](wp04-unqualified-eel-identity-boundary-review-20261011.md) already established that `eel / anguille` is not a safe generic identity: CFIA applies the common name across multiple *Anguilla* taxa and lists Conger separately, while the active catalog has only `American eel / anguille`. That review also found Canadian and Québec `unagi` product mentions without species links. R175 narrows the unresolved space to the kabayaki prepared product, rather than redoing the generic eel review.

## Terminology and product evidence

| Evidence | What it supports | Limit |
|---|---|---|
| Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), Tokyo regional cuisine entry [S01] | Defines `Unagi no Kabayaki` as glaze-grilled eel; describes splitting, removing bones/entrails, grilling, and basting with sauce. Kanto and Kansai processes differ, including steaming in the former description. | It is a Japanese regional dish/preparation source, not a universal manufacturing specification or proof that Canadian products use one eel species or process. |
| Japan Ministry of Education, Culture, Sports, Science and Technology (MEXT), food database entry [S02] | Lists `eel, “Kabayaki” (seasoned and baked fillet)` and identifies the sampled item as *Anguilla japonica*. Its note describes a soy/sugar tare and a product cooked without the steaming step. | This is a species-qualified Japanese food-table sample, not evidence that all Canadian `unagi` or kabayaki uses *A. japonica*. The food-composition basis is not a recipe measure or transferable yield. |
| Fukuya Foods Canada, `Unagi Kabayaki` [S03] | A current Canadian seller labels its product `Unagi Kabayaki`, describes Japanese-raised eel, grilling, glaze, warming instructions, and package variants. | The page says sold out and provides no binomial or full ingredient panel in the accessible product text. Product variant weights are SKU sizes, not recipe measures. Seller claims do not establish the species of every unagi product. |
| Walmart Canada, Searay roasted eel fillet / unagi [S04] | Current Canadian listing describes a frozen roasted eel fillet coated with sweet soy-based kabayaki sauce and identifies China as product origin. | The retailer listing provides no binomial; product origin is not fish-species identity. The package's 198 g is SKU-specific. |
| Aji Bar Sushi & Izakaya MTL, Montréal menu [S05] | The current restaurant menu names `Anguille Grillée · Unagi` and describes it as grilled eel with house kabayaki sauce. This is direct Québec French usage for grilled unagi. | Restaurant menu language, not a standalone retail ingredient label. It does not identify the eel species or establish `anguille` as a generic alias for the active American eel identity. |
| Frandon Seafoods, Québec bilingual/current product listing [S06] | Uses `anguille unagi tranchée fumée` / `smoked sliced unagi eel` for a smoked product, showing that local unagi wording can refer to a different processed state. | No species or binomial is stated. This is smoked eel, not kabayaki; do not treat it as a product synonym or as evidence of kabayaki's universal state. |

Together, the sources support the culinary meaning of kabayaki, a Japanese *A. japonica* food-table example, and current Canadian/Québec market usage. They do not support a species-neutral generic product identity or a single process state across products. Keep `unagi`, `kabayaki`, `Anguilla japonica`, `American eel`, `anago/conger`, and local smoked-unagi wording distinct until a recipe or exact product request supplies enough context.

## Ownership, picker, and corpus audit

At this read-only snapshot the canonical seed has **1,550 references** and **120 forms**; the legacy identity file has **61 candidates**; the research ledger has **1,895 records / 8,128 source entries**. The manifest lists **114 recipes / 1,123 ingredient rows**.

An exact bilingual name/alias and ID review found no active, form, or legacy owner for `unagi`, `kabayaki`, `unagi kabayaki`, `Japanese eel`, or `glaze-grilled eel`. The research ledger already contains `candidate-unqualified-eel-identity-boundary`; it is the owner of the generic eel question, not a kabayaki identity. Do not make a second generic-eel candidate or reissue sources from that prior record.

| Search phrase | Current active result | Consequence |
|---|---|---|
| `unagi`; `kabayaki`; `unagi kabayaki` | None | No current exact picker owner. A new row would make these queries resolve, but the reviewed sources do not settle the row's species and product scope. |
| `eel` | `American eel / anguille` | Phrase matching returns the active species display. Do not add `unagi`, `kabayaki`, or generic eel aliases to it. |
| `anguille` | `American eel / anguille` | Existing Québec display is species-scoped by OQLF evidence; a generic kabayaki row or alias could make this broad French query misleading. |
| `smoked eel`; `anguille fumée` | No exact product/form owner | Frandon's product remains listing-specific and is not kabayaki evidence. |
| `anago`; `conger` | None | Preserve the separate conger boundary from the earlier eel review. |

The audit used the picker behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases win over substring fallback. No aliases or search behavior are proposed.

The manifest-ordered corpus audit parsed all 114 recipe files and 1,123 ingredient rows, and searched full JSON text and ingredient rows for `unagi`, `kabayaki`, `eel kabayaki`, `glaze-grilled eel`, `Japanese eel`, `roasted eel`, `anguille grillée`, and `anguille glacée`. It found **zero matching recipe files and zero matching ingredient rows**. [A01]

## Forms, measurements, conversions, yields, and substitutions

- **Forms:** Do not attach a kabayaki form to `ingredient-ref-american-eel`. Kabayaki is a finished preparation with deboning, grilling, glazing, and sometimes steaming; the sources do not establish it as a reusable form of American eel or of a single species-neutral eel reference.
- **Measures and density:** The 120 g, 170 g, and 230 g Canadian product variants, Walmart's 198 g package, and the restaurant's eight pieces are source-specific retail/menu facts. None establishes household measure, serving weight for a generic recipe, count-to-weight conversion, density, edible portion, or common package size.
- **Conversions and yields:** No general raw-to-kabayaki cooking yield, sauce uptake, portion conversion, or reheat conversion is supported. MEXT's nutrient-table sampling description and product package amounts are not such evidence.
- **Substitutions:** The corpus has no dish context or amount. Do not suggest kabayaki as a substitute for American eel, conger/anago, other fish, or vice versa. No global or contextual substitution, warning, ratio, or recipe-line link is supported.

## Proposed delta

**No catalog or shared-ledger delta is proposed.** Do not create `ingredient-ref-unagi-kabayaki`, a generic eel form, legacy mapping, or second ledger candidate; do not attach `unagi`, `kabayaki`, or `anguille` to `ingredient-ref-american-eel`. Keep the observed Québec restaurant composite and Canadian SKUs source-specific. Reopen if a recipe or exact product request identifies the eel species and whether it needs plain grilled eel, glazed kabayaki, a retail reheating product, or a composite sushi ingredient.

## Source register

Online sources were accessed on 2026-10-16. Proposal-local IDs are not ledger allocations.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S01** | MAFF, [Unagi no Kabayaki (Glaze-grilled Eel)](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/6616/index.html) | Official Japanese regional-cuisine entry; supports preparation terminology and regional process variation. |
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S02** | MEXT, [Food Database item 10070: eel, kabayaki](https://fooddb.mext.go.jp/details/foodInfo.pl?ITEM_NO=10_10070_7) | Official Japanese food-table entry identifies its kabayaki sample as *Anguilla japonica* and describes a particular preparation/sample. No numeric conversion is inferred. |
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S03** | Fukuya Foods Canada, [Unagi Kabayaki](https://fukuya.ca/products/unagi) | Current Canadian retail product page; Japanese-raised product claim, glaze/grill preparation, warming directions, sizes, and sold-out state are product-specific. No taxon stated. |
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S04** | Walmart Canada, [Searay Roasted Eel Fillet (Unagi), Frozen, 198 g](https://www.walmart.ca/en/ip/Roasted-Eel-Fillet-Frozen-198-g/4PBO4X33ZIK0) | Current retailer listing describes roasted eel with kabayaki-style soy sauce; no binomial. Package amount and China origin are product facts only. |
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S05** | Aji Bar Sushi & Izakaya MTL, [current Montréal French menu](https://ajisushimtl.ca/carte) | The direct restaurant page uses `Anguille Grillée · Unagi` and says `Anguille grillée, sauce kabayaki maison`. It supports local French terminology and a prepared menu item, not species identity or retail ingredient scope. |
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-S06** | Frandon Seafoods, [Québec seafood product list](https://frandon.ca/produits/) | Current Québec product wording `anguille unagi tranchée fumée`; supports local wording but is a different smoked product and does not identify species. |
| **WP04-SECTIONP-UNAGI-KABAYAKI-R175-20261016-A01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5126), [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest-listed recipes, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and the eel/tuyo proposal archive. | Proposal-local audit ID only. Supports the ownership, candidate, search, recipe-demand, numeric, and substitution checks reported here. The prior unqualified-eel proposal owns the generic eel boundary and its source entries. |

## Final disposition

**Hold** an unqualified `unagi kabayaki` catalog row or `kabayaki` form pending a recipe/product request with a resolved eel source and intended product scope. Japanese authoritative sources establish a recognizable glazed-grilled eel preparation and one *A. japonica* table sample; current Canadian and Québec listings show diverse products, with no universal taxon or process specification. Preserve `American eel / anguille` unchanged, keep its generic-eel candidate as the sole owner of that unresolved identity question, and add no form, measure, conversion, yield, recipe link, or substitution.
