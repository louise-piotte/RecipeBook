# WP04 Section P — myeolchi-jeot product-boundary review (R374)

- **Review/source-access date:** 2026-10-16.
- **Status:** Proposal only. No catalog, ledger, plan, roadmap, batch README, recipe, code, or test file changed.
- **Scope:** The Korean named salted-fermented anchovy product `myeolchi-jeot` (멸치젓), as distinct from dried anchovies, anchovy paste, and liquid anchovy fish sauce. This review does not reopen generic fish powder, fish balls, generic surimi, or the R371 croaker decisions.
- **Recommendation:** Add one identity-only `SAUCE_AND_CONDIMENT` reference for `myeolchi-jeot (fermented salted anchovies) / myeolchi-jeot (anchois fermentés au sel)`, with the source-attested unhyphenated English search alias `myeolchijeot`. Treat the French phrase as a clear descriptive construction, not a Québec-authority or Québec-package term. Keep independent Québec wording review open.

## Open gap and prior-work boundary

The WP04 Section P preservation checklist remains open for fermented fish and seafood products ([plan, preserved-product checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6904)). The Section P fish-powder/fish-balls/surimi parent also remains open, though its named subreviews have separately resolved or held the generic fish-ball, surimi, shreds, naruto-maki, fish-tofu, and crab-flavoured-pollock-flake questions ([plan, product checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7091)). This packet covers a specifically named fermented product; it does not reuse those decisions.

The WP05 Korean jeotgal review explicitly left `myeolchi-jeot / salted anchovies` for a separate bilingual product review. The WP04 dried-anchovy-for-broth review mentions it only as an excluded fermented neighbor. Neither allocated an active reference, form, legacy identity, or dedicated ledger record ([WP05 review](wp05-section-w-korean-fermented-vegetable-jeotgal-gap-review-20261012.md), [WP04 R43 review](wp04-section-p-dried-anchovy-for-broth-product-boundary-review-20261013-round43.md)).

## Product identity and evidence limits

The National Institute of Korean Language’s food-name table pairs `Myeolchi-jeot` with `Salted Anchovies` and lists it separately from `Saeu-jeot / Salted Shrimp` and the broader `Jeotgal / Salted Seafood`. This is official Korean romanization and English naming; it supplies no French equivalent or package specification. [reused `WP05-W-KIMCHI-JEOTGAL-20261012-S13`]

The Korean Food Code defines the broad jeotgal category as salted-fermented seafood, then distinguishes fermented items, seasoned items, and liquid products separated from or filtered out of the fermented seafood (`aekjeot`). That supports keeping the anchovy solids product apart from anchovy fish sauce; it does not by itself give a product-specific retail name for myeolchi-jeot. [reused `WP05-W-KIMCHI-JEOTGAL-20261012-S05`]

The Rural Development Administration’s Korean Traditional Knowledge Portal lists `Myeolchi Jeot (Salted/Fermented anchovies)` in its salted-fish category and reproduces historical recipes that use anchovy and salt. One account says the fermented product may be eaten seasoned or its juice used for kimchi. Those historical recipe amounts, fermentation times, and liquid use describe the cited preparations only; they do not establish a current commercial formula, a universal product state, or a reusable recipe measure. [S01]

A current Wooltari USA listing is titled `Gampo Jeonchon Jeosgal Salted Anchovy 500g` and displays the Korean product wording. This corroborates a modern commercial product presentation outside Canada. It does not establish Canadian availability, Québec French wording, the exact product composition, or current stock; 500 g is a package size only. The retailer page could not be opened in the web retrieval, so this proposal uses only its indexed title and listing URL. [S02]

Maangchi’s Korean cooking-ingredient page uses `Fermented salted anchovies`, names the Korean product, and lists `myeolchijeot` as an unhyphenated spelling. It supports the search variant and culinary identity, but it is a cooking reference rather than a Québec terminology authority or current Canadian product label. [S03]

OQLF prefers `anchois` for the French name of the edible fish. It does not provide a myeolchi-jeot entry or approve the full phrase `anchois fermentés au sel`; that phrase is a transparent French description based on the product definition and the standard French word for fermentation. It must not be described as a sourced Québec package label. [reused `WP04-ANCHOVY-20261011-S01`, `WP05-W-KIMCHI-JEOTGAL-20261012-S12`]

## Proposed bounded identity

| Field | Proposal |
|---|---|
| Reference ID | `ingredient-ref-myeolchi-jeot` |
| English display | `myeolchi-jeot (fermented salted anchovies)` |
| French display | `myeolchi-jeot (anchois fermentés au sel)` |
| English aliases | `myeolchijeot` |
| French aliases | None |
| Category | `SAUCE_AND_CONDIMENT`, following the related named `ingredient-ref-saeu-jeot` condiment identity |
| Density and unit mappings | None |
| Forms, recipe links, and substitutions | None |

Keep the Korean product name in both displays so the shared primary term is stable across languages. Do not add a bare `anchovy` / `anchois` alias, generic `salted anchovies` alias, `jeotgal`, `myeolchi-aekjeot`, `anchovy sauce`, or `fish sauce`. `Jeotgal` denotes a broader salted-fermented seafood class, while `myeolchi-aekjeot` is a liquid anchovy product. Do not infer a fish species from the Korean product name.

The French display is descriptive and should retain its provisional wording status for independent Québec review. No exact Québec product title was found. The source evidence supports a distinct identity, but does not support additional region-specific French synonyms.

## Existing ownership and picker projection

The proposal-time snapshot has **1,696 active references**, **140 forms**, **56 legacy candidates**, and **2,052 ledger records**. Exact-key and identifier checks found no active reference, form, legacy name/alias, or dedicated ledger record for `myeolchi-jeot`, `myeolchijeot`, `멸치젓`, `salted fermented anchovies`, or the proposed `ingredient-ref-myeolchi-jeot` ID.

Nearby active ownership is explicit:

- `ingredient-ref-anchovy` owns `anchovy / anchois` and English `anchovies`.
- `ingredient-ref-anchovy-fillets-in-oil` owns its paired oil-packed fillet name.
- `ingredient-ref-anchovy-paste` owns `anchovy paste / pâte d'anchois`.
- `ingredient-ref-fish-sauce` owns generic fish sauce and its existing regional aliases.
- `ingredient-ref-saeu-jeot` owns the separate Korean salted-shrimp product.

The current ledger mentions `myeolchi-jeot / Salted Anchovies` only as a neighboring entry in the reused NIKL table source attached to the `ingredient-ref-saeu-jeot` record. That is source evidence, not an identity allocation. Existing WP05 research also mentions the candidate as open work; no earlier review gives it an active owner.

Picker projection uses [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized full-word phrases match first, with substring matching only if no full phrase matches. The projection adds the proposed row above with no form.

| Query | Current live result(s) | With proposal | Effect |
|---|---|---|---|
| `myeolchi-jeot`, `myeolchi jeot` | None | Myeolchi-jeot only | Exact Korean product phrase selects the proposed identity. |
| `myeolchijeot` | None | Myeolchi-jeot only | The sourced unhyphenated spelling reaches the same row. |
| `salted anchovies`, `fermented salted anchovies` | None | Myeolchi-jeot only | Qualified product wording selects the fermented product. |
| `anchois fermentés au sel` | None | Myeolchi-jeot only | The descriptive French phrase selects the product. |
| `anchovies` | Generic anchovy | Generic anchovy + Myeolchi-jeot | The broad plural query exposes the base fish and its named fermented product. |
| `anchois` | Anchovy, anchovy fillets in oil, anchovy paste | Those three + Myeolchi-jeot | Broad French search gains a visibly qualified product choice. |
| `anchovy` | Anchovy, anchovy fillets in oil, anchovy paste | Unchanged | The candidate does not add a singular species alias. |
| `anchovy paste`, `anchovy fillets in oil` | Their existing dedicated rows | Unchanged | Existing prepared-product boundaries remain intact. |
| `fish sauce`, `myeolchi-aekjeot`, `jeotgal` | Fish sauce only; no result; no result | Unchanged | The proposal adds no liquid-sauce or broad-class alias. |

No one broad search is made to look like a single fish identity: `anchovies` and `anchois` remain multi-result queries after the proposal.

## Recipe demand and numeric/substitution limits

A manifest-ordered scan covered all **114 recipe files**, all **1,123 ingredient rows**, and complete recipe JSON text. It found **zero** occurrences of the Korean name/romanizations, `salted anchovies`, fermented-salted-anchovy wording, the proposed French description, the adjacent `myeolchi-aekjeot` name, or the proposed reference ID. The corpus therefore supports no recipe link or relink.

The historical portal’s ingredient ratios, cup values, and fermentation duration are source-specific preparation observations, not a catalog quantity or default recipe measure. The 500 g retailer pack is a SKU quantity. Add no default density, unit mapping, form, package yield, cooking yield, or conversion.

The sources describe different roles for solid fermented anchovies, their extracted liquid, anchovy paste, oil-packed fillets, and generic fish sauce. No reviewed recipe establishes an amount or outcome for replacing one with another. Add no global or contextual substitution, warning, or recipe-line substitution link.

## Source-ID and URL ownership audit

Proposal-local IDs S01–S03 were checked against the live ledger and existing catalog proposal/batch archive before this file was created; the R374 prefix and each ID were unallocated. Their exact source URLs had no owner in the ledger or archive. Sources marked reused already have ledger URL owners and keep their existing IDs; no duplicate source entry is proposed. No source record is being added by this proposal.

| ID | Source and URL | Supported claim and limits |
|---|---|---|
| `WP04-SECTIONP-MYEOLCHI-JEOT-R374-20261016-S01` | Korean Traditional Knowledge Portal, Rural Development Administration, [Myeolchi Jeot (Salted/Fermented anchovies)](https://koreantk.com/ktkp2014/food/food-view.view?foodCd=TF10003323), item `TF10003323`, published from the 2008 *Korea Traditional Local Food* volume. | Exact product name and historical preparation/use. It reproduces older sources and does not specify a current Canadian SKU, stable market recipe, package, or transferable amount. |
| `WP04-SECTIONP-MYEOLCHI-JEOT-R374-20261016-S02` | Wooltari USA, [Gampo Jeonchon Jeosgal Salted Anchovy, 500 g](https://wooltariusa.com/collections/saltedshrimp/products/gampojeonconjeosgal-salted-anchovy-500g). | Indexed product title supplies a current U.S. Korean-retail product example with the Korean name and English description. The page was not retrievable in the web reader; no ingredient panel, stock claim, Canadian availability, or Québec wording is inferred. The listed package mass is not a recipe measure. |
| `WP04-SECTIONP-MYEOLCHI-JEOT-R374-20261016-S03` | Maangchi, [Fermented salted anchovies (myeolchi-jeot)](https://www.maangchi.com/ingredient/myeolchi-jeot), last updated 2021. | Supports the culinary name and unhyphenated `myeolchijeot` spelling. It is not a Québec terminology source or current Canadian product listing. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S13` *(reused)* | National Institute of Korean Language, [Standard Romanization and Translation of 200 Major Korean Food Names](https://www.korean.go.kr/common/download.do%3Bfront%3D691C836ACDEDE5A35426F3A54B4AAF1B?c_file_name=f9b97f04-a549-4fb7-9da2-892c599bb06c.pdf&file_path=notice&o_file_name=140502_%ED%95%9C%EC%8B%9D%EB%AA%85_%EB%A1%9C%EB%A7%88%EC%9E%90_%ED%91%9C%EA%B8%B0_%EB%B0%8F_%ED%91%9C%EC%A4%80_%EB%B2%88%EC%97%AD_%ED%99%95%EC%A0%95%EC%95%88_.pdf). | Official table pairs `Myeolchi-jeot` with `Salted Anchovies` and distinguishes it from shrimp jeot and broad jeotgal. It does not give a French equivalent. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S05` *(reused)* | Ministry of Food and Drug Safety / Food Safety Korea, [Food Standards and Specifications, 20-2 jeotgal](https://www.foodsafetykorea.go.kr/popup/safefoodlife/food/foodRvlv/foodRvlvDetail.do?rvlv_no=46). | Current Korean standard separates salted-fermented seafood, seasoned products, and filtered liquid extract products. It does not assign a retail name or exact formulation to this anchovy product. |
| `WP04-ANCHOVY-20261011-S01` *(reused)* | Office québécois de la langue française, [anchois (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois). | Establishes OQLF’s preferred generic French term `anchois`; it does not standardize a myeolchi-jeot compound. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S12` *(reused)* | Office québécois de la langue française, [fermentation (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088400/fermentation). | Establishes the French food-process term `fermentation`; it does not name myeolchi-jeot. |
| `WP04-SECTIONP-MYEOLCHI-JEOT-R374-20261016-R01` | Read-only review of the active Section P plan, current reference/form/legacy/ledger package, manifest-listed recipe corpus, WP04/WP05 archive, source-ID/URL ownership, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Proposal snapshot: 1,696 references, 140 forms, 56 legacy candidates, 2,052 ledger records, 9,234 source entries, 7,810 distinct source IDs, and 6,533 distinct source URLs. The recipe corpus is 114 files / 1,123 rows / 753,988 bytes; manifest-order digest `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. Read-only exact-name, picker, corpus, source-ID, and URL checks; no shared files changed. |

## Proposed disposition

Recommend one identity-only regional condiment row for the sourced Korean product, with only the unhyphenated romanization alias. Keep the French parenthetical explicitly descriptive and provisional. Preserve separate ownership for generic anchovy, oil-packed anchovy fillets, anchovy paste, fish sauce, and saeu-jeot. Add no forms, numeric behavior, recipe link, or substitution; the existing Section P checklist stays open.

No tests, build, or emulator work were run because this is a proposal-only documentation change.
