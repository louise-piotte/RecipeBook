# WP05 Section W R1015 generic pantry gap review: oi-sobagi

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal only. This file is the only write; the catalog, ledger, plan, roadmap, recipe files, generated files, and code were not edited.
- **Plan anchor:** Section W leaves “named kimchi types” open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10339), under “Gochujang, doenjang, ssamjang, chunjang, ganjang, gochugaru, named kimchi types, fermented shrimp, and other jeotgal.” This review advances one named type and does not close the parent checklist.
- **Scope:** One generic Korean cucumber-kimchi identity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Preserve existing branded rows and their evidence; keep any product-only claim scoped to the named product.

## Recommendation

Propose one identity-only reference for generic Korean **oi-sobagi**, the named kimchi preparation made with salted cucumber and a filling. Keep it distinct from the generic kimchi parent and the raw cucumber ingredient. Do not alias it to the generic kimchi row or infer that all cucumber pickles are kimchi.

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-oi-sobagi` |
| `nameEn` | `oi-sobagi` |
| `nameFr` | `oi-kimchi (oi-so-bagi)`; provisional fr-CA display, using the observed French rendering from the Korea Tourism Organization (KTO) |
| English aliases | `oisobagi`; `cucumber kimchi` (KTO’s English entry title pairs this gloss with the named Oisobagi identity) |
| French aliases | None |
| Category | `SAUCE_AND_CONDIMENT` |
| Forms, density, unit mappings, package yields | None; `defaultDensity: null`, `unitMappings: []` |
| Recipe links | None; no matching bundled recipe line |
| Ledger states if later integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |

The canonical name is the named subtype, not the broad descriptive English phrase. The KTO pairs “Cucumber Kimchi” with the Korean name and “Oisobagi,” and describes a salted cucumber with a spicy filling that includes chives and other ingredients. Its page therefore supports the narrow English alias for this named preparation. Do not extend it to every cucumber pickle, or treat it as a universal formulation. The French display is an observed official Korean tourism translation, not an OQLF or Québec terminology ruling; keep it provisional and add no French alias.

## Identity boundary and current neighbors

KTO’s overview lists oi-sobagi as one type among many types of kimchi and describes the type as cucumber with stuffing. That is enough to represent a named prepared-food identity separately from its raw vegetable and the generic parent. The recipe details and qualitative texture advice on the dedicated KTO entry remain source-specific; they do not define a standard ingredient list, fixed fermentation stage, storage instruction, or food-safety rule.

| Current reference | Boundary retained |
|---|---|
| `ingredient-ref-kimchi` — `kimchi / kimchi` | Keep as the generic prepared fermented-vegetable identity. Do not move oi-sobagi spellings onto this parent row. |
| `ingredient-ref-cucumber` — `cucumber / concombre` | Keep as the raw vegetable identity. Oi-sobagi is a prepared kimchi type, not a cucumber form. |
| `ingredient-ref-dongchimi` | Preserve the separate radish-water-kimchi identity and its `radish water kimchi` alias. |
| `ingredient-ref-nabak-kimchi` | Preserve the separate cabbage-and-radish water-kimchi identity. |
| `ingredient-ref-baek-kimchi` | Preserve the separate named white-kimchi identity. |
| `ingredient-ref-kkakdugi` | Preserve the separate diced-radish kimchi identity. |
| `ingredient-ref-gat-kimchi` and `ingredient-ref-yeolmu-kimchi` | Preserve their named mustard-leaf and young-summer-radish kimchi scopes. |
| `ingredient-ref-pickled-radish` | Preserve the generic salt-and-vinegar radish pickle identity; it is neither an oi-sobagi alias nor a supported replacement. |

No `IngredientForm` is proposed. Stuffing and seasoning describe the named prepared identity here, not a reusable preparation-state conversion for raw cucumber or generic kimchi. Do not infer forms from a specific recipe or source description.

## Normalized ownership and source audit

Recounted the live package on 2026-10-19:

| Artifact | Count/state |
|---|---:|
| Active ingredient references | 2,025 |
| Ingredient forms | 205 |
| Legacy-import candidates | 55 |
| Research-ledger records | 2,431 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

Exact normalized phrase checks followed `normalizeIngredientSearchKey` in `IngredientSearch.kt` for active reference IDs, display names, aliases, form labels and match terms, legacy names and aliases, and ledger record IDs. Queries covered `oi-sobagi`, `oi sobagi`, `oisobagi`, `oi-so-bagi`, `oi-kimchi`, `oi kimchi`, `cucumber kimchi`, and `stuffed cucumber kimchi`. No exact active reference, alias, form, legacy candidate, or ledger record ID owns these phrases. The Korean source spelling `오이소박이` was checked as raw Unicode because the app search normalizer removes non-ASCII characters; it has no raw match in those surfaces or in the bundled ingredient rows.

The proposal archive contains no dedicated oi-sobagi identity review. R986 mentions the KTO cucumber-kimchi entry only as one type in a list while reviewing yeolmu-kimchi; that mention did not propose an oi-sobagi row. The new candidate ID and source-ID prefix `WP05-SECTIONW-OI-SOBAGI-R1015-20261019-` are unowned in the current catalog and ledger.

The dedicated KTO `Cucumber Kimchi` page has no current ledger URL owner. Two useful KTO overview URLs already have other ledger owners: the English `Kimchi` overview is registered under `ingredient-ref-yeolmu-kimchi` as `WP05-SECTIONW-YEOLMU-KIMCHI-R986-20261019-S02`, and the French overview is registered under `ingredient-ref-nabak-kimchi` as `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S03`. Their relevant oi-sobagi passages support this proposal’s named-type and observed French-rendering context, but do not move or replace either existing ledger source entry. The existing OQLF `kimchi` source `WP05-EAST-S06` remains scoped to the generic parent term and does not name this subtype.

## Recipe demand and numeric behavior

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. Searches covered the English/French romanizations and aliases above plus raw Korean `오이소박이`; no ingredient row matched. No row contains both cucumber and kimchi wording. The bundle therefore provides no direct oi-sobagi demand, recipe role, recipe amount, or basis for linking a recipe line.

The KTO identity pages provide no reusable serving mass, volume, density, unit mapping, package yield, or conversion. The dedicated entry’s “best to eat right away” observation refers to its qualitative cucumber-texture explanation; it is not a storage duration, food-safety statement, or numeric rule. Propose no measure, form, conversion, yield, or density. No reviewed source recommends replacing finished oi-sobagi in a defined dish role, method, and amount. If later integrated, leave substitutions blocked pending evidence and activate no rule; do not infer replacement by generic kimchi, dongchimi, nabak-kimchi, baek-kimchi, kkakdugi, pickled radish, or raw cucumber.

## Commercial-roster scope

The selected open item is generic named-kimchi coverage, not a commercial-product roster. Any queued task whose only deliverable is brand, product-line, flavour-family, SKU, or retailer variants is out of scope because **commercial-product counts do not add ingredient diversity**; stop that line. Preserve existing branded entries and keep product-only values and claims at their source scope.

## Source register and limits

Sources were reviewed online on 2026-10-19. Existing ledger sources are cited in place; they are not transferred or rewritten by this proposal.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-OI-SOBAGI-R1015-20261019-S01` | Korea Tourism Organization, [Cucumber Kimchi (오이소박이 / Oisobagi)](https://english.visitkorea.or.kr/svc/contents/contentsView.do?vcontsId=179914), page dated 2023-10-19. | Names the Korean item and romanization, pairs it with “Cucumber Kimchi,” and describes salted cucumber with a spicy filling of chives and other ingredients. Its “best to eat right away” statement is qualitative texture advice for this page’s named dish, not a reusable storage, safety, or numeric rule. No recipe formula or measurement is generalized. The page URL has no current ledger owner. |
| Reused `WP05-SECTIONW-YEOLMU-KIMCHI-R986-20261019-S02` | Korea Tourism Organization, [Kimchi — English overview](https://english.visitkorea.or.kr/svc/contents/infoBscView.do?menuSn=202&vcontsId=140728), “Types of kimchi,” item 4. | Names “Oi sobagi (Cucumber kimchi)” as a kimchi type prepared by inserting stuffing in cucumbers and notes its usual spring/summer context. This source is already registered under `ingredient-ref-yeolmu-kimchi`; preserve that record and cite this relevant passage without moving it. It does not establish a universal formula or French term. |
| Reused `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S03` | Korea Tourism Organization, [Kimchi — French overview](https://english.visitkorea.or.kr/svc/contents/infoBscView.do?vcontsId=140803), “Type de kimchi,” item 4. | Uses `Oi-kimchi (Oi-so-bagi)` and describes filling inserted into cucumbers. This is an observed French-language rendering from the Korean tourism authority, not an OQLF or Québec naming ruling. The source is already registered under `ingredient-ref-nabak-kimchi`; preserve that record and do not transfer its evidence. |
| Reused `WP05-EAST-S06` | Office québécois de la langue française, [kimchi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi). | Existing ledger source for the parent French name and generic kimchi definition only. It does not name oi-sobagi or standardize a subtype display; keep its scope and ownership unchanged. |

**Disposition:** Propose identity-only generic `oi-sobagi / oi-kimchi (oi-so-bagi)` in `SAUCE_AND_CONDIMENT`, with the source-paired English aliases `oisobagi` and `cucumber kimchi`, no French aliases, forms, recipe links, numeric/conversion/yield data, or active substitutions. Keep the French display provisional and the named-kimchi checklist open. Preserve every active identity, branded row, and source-scoped claim. No commercial roster was researched. No tests or builds were run because this packet changes documentation only.
