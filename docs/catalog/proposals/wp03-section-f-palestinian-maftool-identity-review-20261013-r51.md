# WP03 Section F — Palestinian maftool product identity review (R51, 2026-10-13)

- **Decision:** Recommend one identity-only reference, proposed `ingredient-ref-maftool`, displayed as `maftool (Palestinian couscous) / maftoul (couscous palestinien)`, category `GRAIN_AND_CEREAL`. Leave aliases, forms, recipe links, measurements, density, unit mappings, conversions, yields, and substitutions empty.
- **Scope:** The Palestinian hand-rolled, bulgur-based grain product sold as maftool/maftoul. This is a bounded product identity, not a universal recipe or synonym for every couscous product.
- **Open checklist:** Section F still lists “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” at [plan line 2539](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Recommendation limit:** Current producer and Canadian seller sources support the product name and hand-rolled grain identity. Their ingredient and cooking details are product-specific; no general formulation or measure is proposed.

## Review boundary and prior work

The current Section F checklist remains open. Focused searches of the plan, roadmap, proposal archive, active catalog, forms, legacy-import candidates, research ledger, and bundled recipe corpus found no earlier `maftool`, `maftoul`, or `couscous palestinien` decision or owner. A related accepted pearl-couscous ledger decision says its cited Québec product does not establish Mograbieh, ptitim, Israeli couscous, or Jerusalem couscous as universal pearl-couscous aliases; it does not mention or decide maftool [S05]. The present review does not reopen that boundary.

The producer describes its Maftool as hand-rolled whole-wheat Palestinian couscous and lists bulgur, salt, wheat flour, water, and cumin for its product [S01]. A Canadian seller independently markets hand-rolled Palestinian Maftool made with sun-dried bulgur and whole-wheat flour [S02]. These sources support a specific named product identity. They do not establish one formulation for all Palestinian maftool. OQLF's general couscous definition is agglomerated durum-wheat semolina, steamed and dried [S03], which is a useful scope contrast but does not define maftool.

This is separate from the active generic couscous and pearl-couscous references, and from barley couscous, Senegalese millet couscous (thiéré), Moroccan corn couscous (Baddaz), and five-cereal Khoumassi couscous. It is also separate from bulgur as an ingredient: bulgur is one source-listed component/material, while maftool is the hand-rolled finished grain product. Do not map it to Mograbieh, Moughrabieh, ptitim, Israeli couscous, Jerusalem couscous, or generic couscous.

## Product and naming boundary

| Boundary | Source-backed finding | Proposed catalog treatment |
|---|---|---|
| **Product identity** | The Palestinian producer calls its product `Maftool`, describes it as hand-rolled whole-wheat Palestinian couscous, and lists bulgur, salt, wheat flour, water, and cumin [S01]. The Canadian product page uses `Maftool`, describes the grains as hand-rolled from sun-dried bulgur and whole-wheat flour, and identifies the product as Palestinian [S02]. | Add one `GRAIN_AND_CEREAL` identity named `maftool (Palestinian couscous)` in English and `maftoul (couscous palestinien)` in French. The names carry the descriptive phrases; add no separate aliases. |
| **English and Québec French** | The current producer and Canadian product listing use `Maftool` [S01–S02]. A French-language Agriculture and Agri-Food Canada report calls a Canaan Fair Trade product “le couscous palestinien de type « maftoul »” [S04]. OQLF defines generic couscous but has no maftool entry [S03]. | Use `maftool` in the English name and the French-language federal spelling `maftoul` in the French name, with the source-backed descriptors. No current Québec package label or OQLF maftool term was located; treat the French wording as a supported provisional name, not an OQLF ruling. |
| **Spelling and product-family boundary** | The sources use `maftool` and `maftoul` for the Palestinian product [S01–S02, S04]. The pearl-couscous record explicitly does not treat Mograbieh, ptitim, Israeli couscous, or Jerusalem couscous as universal pearl-couscous aliases [S05]. | The two display names cover the attested spelling variants. Add no aliases for Mograbieh/Moughrabieh, ptitim, Israeli/Jerusalem couscous, `couscous` alone, bulgur, or durum semolina. Keep all neighboring identities distinct. |
| **Composition** | Mawasem lists bulgur, salt, wheat flour, water, and cumin for its product [S01]; the Canadian seller describes bulgur and whole-wheat flour without giving a complete ingredient statement [S02]. | Treat the listed ingredients as evidence about those products only. Do not store a universal ingredient formula or composition ratio. |

## Exact ownership and picker effects

At this static snapshot, the active catalog contains **1,371 references** and **100 forms**; the legacy-import file lists **64 candidates**, and the research ledger contains **1,701 records**. Exact candidate-term scans found no active reference, form, legacy candidate, or ledger record for `maftool`, `maftoul`, `maftul`, `maftūl`, `maftol`, or `couscous palestinien`. The one nearby ledger match in a broader couscous-family scan is the pearl-couscous record [S05]; it discusses other named products and does not assign maftool. The unique source-ID prefix `WP03-F-MAFTOOL-R51-20261013-S` was absent before this proposal was created.

| Current owner or neighbor | Exact boundary | Proposed effect |
|---|---|---|
| None for `maftool`, `maftoul`, or `couscous palestinien` | No active reference, attached form, legacy-import candidate, or candidate-specific ledger decision owns the proposed name. | Add one proposed `ingredient-ref-maftool`, with the attested English and French product spellings in its bilingual display names and no aliases. |
| `ingredient-ref-couscous` — `couscous / couscous` | `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. OQLF's definition describes durum-semolina grains agglomerated, steam-precooked, and dried [S03]. | Keep the generic ingredient unchanged. The maftool product is separately named and hand-rolled from bulgur/whole wheat. |
| `ingredient-ref-pearl-couscous` — `pearl couscous / couscous perlé` | `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. Its ledger decision says the named pearl-couscous seller terms do not establish universal aliases [S05]. | Keep pearl couscous separate; do not attach Palestinian maftool spellings or Mograbieh-family names to it. |
| `ingredient-ref-barley-couscous`, `ingredient-ref-millet-couscous-thiere`, `ingredient-ref-baddaz-corn-couscous`, and `ingredient-ref-keskes-khoumassi` | Each has a distinct regional grain identity; current active terms include `belboula`, `thiéré`/`tyere`, and `Keskes Moukhamess` where supported. | Preserve each row and its existing regional boundary; add no maftool alias or cross-link. |
| `ingredient-ref-bulgur` — `bulgur / boulgour` | `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. | Keep bulgur as its own ingredient/material; do not collapse the finished hand-rolled maftool product into bulgur. |
| `ingredient-ref-whole-wheat-flour` — `whole-wheat flour / farine de blé entier` | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. | Keep flour as a component/material, not an alias or substitution for maftool. |

The static picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), which searches normalized bilingual display names and aliases as complete phrases before partial matching. Current queries `maftool`, `maftoul`, `Palestinian couscous`, and `couscous palestinien` return **0** references; with the proposed display names each returns **1**. A bare `couscous` query currently returns **6** regional/generic product references and would return **7**, because the proposed display name includes the source-backed descriptor. Exact queries `pearl couscous`, `couscous perlé`, `bulgur`, and `boulgour` remain with their current owner(s). No aliases are proposed for alternate pearl-couscous names.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across full recipe JSON and ingredient fields for `maftool`, `maftoul`, `maftul`, `maftūl`, `maftol`, `Palestinian couscous`, and `couscous palestinien`.

- Candidate-term recipe files: **0**.
- Candidate-term ingredient rows: **0**.
- Existing ingredient-reference links to a maftool identity: **0**.

The regional product evidence supports reviewing the identity, but the bundled recipes create no direct measurement or substitution demand for it.

## Numeric and substitution limits

- The Canadian seller lists a **500 g** pack, currently marked sold out [S02]. This is one seller's package size, not an ingredient measure, density, or package-yield rule.
- The same seller gives an approximate ratio of one part Maftool to 1.5–2 parts water or broth and a cooking time of 20–25 minutes [S02]. It does not define whether “part” is mass or volume. Keep the directions as product-specific preparation guidance; do not turn them into active unit mappings, a density, a dry/cooked conversion, or a general yield.
- The producer's ingredient list is product-specific and supplies no proportions [S01]. Do not infer ingredient ratios, a universal formula, or quantities from it.
- Add no mass-volume mapping, cup/spoon measure, default density, package conversion, cooked form, or recipe link. No reviewed source supplies a reusable exact-form measurement.
- Add no global or contextual substitution between maftool and generic couscous, pearl couscous, bulgur, durum semolina, or whole-wheat flour. The source-backed grain form and composition differ, and no tested replacement ratio or method was found.

## Source register

Sources were checked online on 2026-10-13. The source IDs below are unique to this proposal; the shared research ledger was not edited.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-F-MAFTOOL-R51-20261013-S01` | Mawasem / New Farm Co., [Maftool product page](https://mawasem.ps/products/maftool/). | Producer page gives the `Maftool` spelling, describes hand-rolled whole-wheat Palestinian couscous, lists one product's ingredients, and names the Ramallah packing/quality-control company. It does not establish a universal formula, ratios, household measures, or Québec terminology. |
| `WP03-F-MAFTOOL-R51-20261013-S02` | Watany Palestinian Products (Watani & Sons Corp.), [Palestinian Hand-Rolled Maftool](https://watanypalestinianproducts.com/products/maftool). | Current Canadian seller page uses `Maftool`, identifies the product as Palestinian, describes bulgur/whole-wheat production, lists one 500 g package, and gives product-specific directions. The listing is currently sold out; its “parts” basis and instructions are not a general standard. |
| `WP03-F-MAFTOOL-R51-20261013-S03` | Office québécois de la langue française, [GDT: couscous](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous). | Defines generic couscous as agglomerated durum-wheat semolina, steamed and dried; the entry was updated in 2009 and does not define maftool. Used only to distinguish the general term and identify a Québec authority limit. |
| `WP03-F-MAFTOOL-R51-20261013-S04` | Agriculture and Agri-Food Canada, [Pâtes alimentaires et couscous aux États-Unis](https://publications.gc.ca/collections/collection_2012/agr/A74-1-97-2012-fra.pdf), September 2012 report, p. 6. | Uses the French descriptor “couscous palestinien de type « maftoul »” for a Canaan Fair Trade product and describes traditional hand-rolling in Palestinian women's cooperatives. This is older federal market-report wording, not a current Québec retail label or a standard recipe. |
| `WP03-F-MAFTOOL-R51-20261013-S05` | Existing research-ledger record `ingredient-ref-pearl-couscous`, source IDs `WP03-S167`–`WP03-S169`; summarized in the [Barkoukch product-boundary review](wp03-section-f-barkoukch-product-boundary-hold-20261013-r40.md). | Internal prior decision preserves pearl couscous as a separate product family and declines to make Mograbieh, ptitim, Israeli couscous, or Jerusalem couscous universal aliases. It does not mention or decide Palestinian maftool. |

## Next action

Review the proposed `ingredient-ref-maftool` as an identity-only `GRAIN_AND_CEREAL` reference with the bilingual product names above. Keep all numeric, form, conversion, yield, recipe-link, and substitution fields empty. Keep maftool separate from generic and pearl couscous and from bulgur; keep Section F open while other checklist work remains.

No shared catalog, ledger, plan, roadmap, generated file, or tests were changed for this proposal-only review.
