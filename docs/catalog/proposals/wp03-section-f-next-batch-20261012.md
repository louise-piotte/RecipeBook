# WP03 Section F — Khorasan wheat grain identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No shared catalog, ledger, recipe, manifest, generated file, plan, or roadmap was changed.
- **Scope:** One intact human-food grain identity: Khorasan wheat sold as a whole grain.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for **`Khorasan wheat / blé khorasan`**. Keep aliases, forms, measures, active conversions, recipe links, yields, and substitutions empty.
- **Open checklist:** Section F continues to leave regionally significant cereal mixes and preprocessed grains open at [plan line 2117](../../RecipeBook-global-ingredient-catalog-plan.txt#L2210); the roadmap still marks Section F as in progress.
- **Prior-work boundary:** The active Khorasan-flour and Khorasan-flakes rows cover milling and flaking products. The wheat-flakes review mentions a composite Khorasan-containing cereal, and the durum-wheat-berries review covers a separate whole-grain label. None reviews the intact Khorasan product as its own grain identity.

## Current package snapshot

Counts and SHA-256 values below describe the live split package read on 2026-10-12. File hashes cover exact bytes. The manifest-ordered recipe digest hashes each relative path, a NUL byte, its exact file bytes, and a trailing NUL byte.

| Artifact | Current state | SHA-256 / corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,297 references; 125 `GRAIN_AND_CEREAL` | `963c463748970e5c1d9031d11c5d614e7def608ff25f157f2ac7df21acd9ef4a` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,605 records; 5,794 source entries; 4,819 distinct source IDs | `402f1746165778202dd6d7486793b839060fb93672825707f8afda4a0891c9fe` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,297 references | `3d92cb3f0c922d1aa28cc686a8a8f4f8a49de42cd260b8ac561925fa4b51ba14` |

All manifest paths existed at review time. The snapshot should be refreshed before any later integration.

## Product identity and proposed decision

The Québec retailer Artisan Tradition lists the same 5 kg product in English as **Khorasan Wheat Organic** and in French as **Blé Khorasan Bio**. Both language pages identify the ingredient as Khorasan wheat and give preparation directions for the grain itself [S01, S02]. The Office québécois de la langue française pairs the preferred French term **blé khorasan** with English **Khorasan wheat** and identifies *Triticum turanicum*. It describes Khorasan as an ancient variety of durum wheat and explicitly labels `Kamut` and `blé Kamut` trademarks [existing source `WP02A4-KH-S01`].

Current grain-supplier evidence identifies a whole-kernel food product: Fieldstone describes its product as whole-grain Khorasan and says the large kernels are suited to eating in whole-berry form [S03]. Storehouse Foods separately lists a Canadian-origin `Organic Kamut® Berries` product and states that Kamut is the brand name for Khorasan wheat [S04]. This corroborates the whole-grain market boundary; it does not make the trademark a generic alias.

| Proposed field | Recommendation |
|---|---|
| ID | `ingredient-ref-khorasan-wheat-grain` |
| English display | `Khorasan wheat` |
| Québec French display | `blé khorasan` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None in either language |
| Scope | Intact Khorasan wheat kernels sold as a food grain; exclude milled, flaked, puffed, or composite products. |
| Recipe links | None; no bundled recipe line matches. |
| Forms, density, unit mappings, active measures, conversions, yields, substitutions | None. |

Khorasan is a named grain class even though OQLF describes it as a variety of durum wheat. Retain it as a qualified identity alongside the broad `durum wheat berries / blé dur` and `wheat berries / grains de blé entiers` identities; this recommendation does not claim the taxa are unrelated. Keep `durum wheat`, `durum`, and `blé dur` off the Khorasan aliases. The exact Khorasan wording selects the named grain, while broad `Khorasan` searches will also find the existing flour and flake products.

Do not add `Kamut`, `Kamut wheat`, or `blé Kamut` as aliases because OQLF identifies these as trademarks. Do not add a generic `wheat berries` alias: that exact phrase is already owned by the generic wheat-berries row, and the more specific whole-kernel grain is adequately identified by `Khorasan wheat`. Do not add `Oriental wheat`; OQLF lists it as an English term, but the current Québec/Canadian product pages reviewed here use Khorasan wording. Do not map the separate Khorasan-flour or Khorasan-flakes products, or a Khorasan-containing multigrain cereal, to this row.

## Exact-key ownership and existing state

The audit used the repository's `normalize_search_key` implementation across reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs and text.

| Surface | Current owner/state |
|---|---|
| Active references | No exact normalized owner for `Khorasan wheat`, `blé khorasan`, `Khorasan wheat berries`, `whole grain Khorasan`, or proposed ID `ingredient-ref-khorasan-wheat-grain`. Related distinct rows are `ingredient-ref-khorasan-flour` (`khorasan flour / farine de khorasan`), `ingredient-ref-khorasan-flakes` (`Khorasan flakes / flocons de khorasan`), `ingredient-ref-wheat-berries` (`wheat berries / grains de blé entiers`), and `ingredient-ref-durum-wheat-berries` (`durum wheat berries / blé dur`). Each related row has null default density and no unit mappings. |
| Ingredient forms | No exact Khorasan-grain phrase, form, or proposed ID. No Khorasan form exists. |
| Legacy candidates | No exact Khorasan-grain phrase or proposed ID among 64 candidates. |
| Research ledger | No Khorasan-grain identity/candidate record, exact proposed ID, or exact proposed source-ID prefix. Existing Khorasan records cover only flour and flakes. The OQLF term is already registered as `WP02A4-KH-S01` on the flour record and is reused here rather than duplicated. The separate durum-wheat-berries record is already verified. |
| Prior proposals and batches | `wp02` Khorasan-flour work covers flour; the Section F Khorasan-flakes proposal/batch covers flakes; the durum-grain proposal covers durum kernels. The wheat-flakes packet's existing `WP03-WFLAKE-20261012-S07` describes a Khorasan-containing composite cereal, not intact Khorasan kernels. No focused whole-Khorasan-grain decision was found. |

Exact audit phrases also included `Khorasan wheat berry`, `Khorasan grain`, `Khorasan kernels`, `whole Khorasan wheat`, `grains de blé khorasan`, `grain de blé khorasan`, `blé khorasan entier`, `blé Kamut`, and `Kamut wheat berries`. None is proposed as an alias. A `Khorasan` query already reaches flour and flakes; after integration it would return those rows plus the new named grain. The broad `wheat berries` query remains a family query and must not be assigned as an alias to this row.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned, including complete serialized recipe text. The search set included `Khorasan wheat`, `Khorasan wheat berries`, `whole grain Khorasan`, `Khorasan grain`, `Khorasan kernels`, `blé khorasan`, `grains de blé khorasan`, `Kamut`, and `blé Kamut` with normalized case, accents, and punctuation.

| Search result | Count |
|---|---:|
| Candidate-phrase recipe-file hits | 0 / 114 |
| Candidate-phrase ingredient-row hits | 0 / 1,123 |
| Existing recipe links for Khorasan grain | 0 |

No recipe link, amount, preparation hint, or state form is justified by the bundled corpus.

## Measurements, forms, and substitutions

- **Product-specific directions:** Artisan Tradition gives one product's preparation: soak 1 cup of Khorasan in 3 cups of water for 12 hours, drain, then simmer in 4 cups fresh water for 60 minutes; it reports an approximate cooked yield of 3 cups [S01, S02]. The page does not state the cup-volume convention or a dry mass. This is a single retail-product instruction, not a transferable mass-volume measure, density, or general cooking-yield ratio. If retained in future ledger work, keep it as a source-specific preparation observation only.
- **Conflicting source detail:** Fieldstone's page identifies its product and whole-berry use, but its cooking-instruction paragraph says to combine “one part emmer” with water despite the Khorasan page context [S03]. Do not use that instruction as Khorasan measurement or yield evidence.
- **Package sizes:** The reviewed 5 kg, 2.5 kg, 10 kg, and 20 kg formats are package sizes, not serving measures or volume conversions [S01–S04].
- **Density and unit mappings:** None of the reviewed pages provides mass per household volume. Keep `defaultDensity` null and `unitMappings` empty.
- **Forms and cooking yield:** The proposed reference represents the grain sold intact. No dry/soaked/cooked form or reusable grain-to-cooked yield is needed by a bundled recipe or supported across products. Do not create forms under generic wheat berries.
- **Substitution:** Cooking uses in soups, salads, pilafs, and baked goods do not test Khorasan as a substitute for durum, emmer, spelt, generic wheat berries, or another grain. Add no global or contextual substitution and no recipe-line suggestion.

## Proposal-local source register

Sources were reviewed on 2026-10-12. New proposal-local source IDs below were checked absent from the shared research ledger. `WP02A4-KH-S01` is existing evidence and is reused without a duplicate entry.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Reused `WP02A4-KH-S01` | Office québécois de la langue française, [blé khorasan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan). | Preferred French `blé khorasan`, English `Khorasan wheat`, *Triticum turanicum*; describes Khorasan as an ancient variety of durum wheat and marks `Kamut`/`blé Kamut` as trademarks. Terminology and taxonomy evidence, not a retail package specification. |
| `WP03-KHORASAN-WHOLEGRAIN-20261012-S01` | Artisan Tradition, [Grains / Céréales (fr-CA)](https://www.artisan-tradition.ca/grains-cereals), entry `Blé Khorasan Bio`. | Québec retail page lists a 5 kg Khorasan-wheat product, ingredient name `Blé khorasan`, and the product-specific soak/cook directions and approximate yield noted above. Supports the French product wording and grain as sold; no mass-volume conversion or universal yield. |
| `WP03-KHORASAN-WHOLEGRAIN-20261012-S02` | Artisan Tradition, [Grains / Cereal (English)](https://www.artisan-tradition.ca/en/grains-cereals), entry `Khorasan Wheat Organic`. | Same retailer's English page gives the bilingual counterpart, product ingredient, package size, and preparation instructions. Supports the English product wording; does not specify cup volume or dry mass. |
| `WP03-KHORASAN-WHOLEGRAIN-20261012-S03` | Fieldstone Organics, [Organic Whole Grain Khorasan](https://www.fieldstoneorganics.ca/product/organic-whole-grain-khorasan/). | Current grain-supplier listing explicitly calls the product whole-grain Khorasan and says its large kernels suit whole-berry use in soups, salads, and sides. It also mentions Khorasan's relationship to durum. Its cooking-instruction paragraph contains an `emmer` wording mismatch and is excluded from measurement evidence. |
| `WP03-KHORASAN-WHOLEGRAIN-20261012-S04` | Storehouse Foods, [Organic Kamut® Berries](https://storehousefoods.ca/collections/grains-cereals/products/organic-kamut-berries). | Canadian-origin product listing identifies Kamut as a brand name for Khorasan wheat and describes cooking the grain whole or milling it. Supports the whole-grain market boundary and why the trademark phrase is excluded from generic aliases; package formats are not measures. |

## Proposed static review steps for integration

1. Recheck the proposed reference ID, exact bilingual names, and source IDs against the live references, forms, legacy candidates, ledger, proposals, and batches using `normalize_search_key`.
2. Rescan all manifest-listed recipe JSON and ingredient rows; add a recipe link only if an exact source line appears and its authored ingredient can be mapped without changing its text or amount.
3. Validate the identity and ledger JSON with the bundled-package validator; check reference normalization, generated-catalog freshness, and ledger-schema validity.
4. Confirm UTF-8 without BOM, the expected picker distinctions (`Khorasan wheat`, `blé khorasan`, broad `Khorasan`, and broad `wheat berries`), and a scoped `git diff --check`.
5. Under the current `AGENTS.md` rule, no app tests or emulator run are needed if the accepted implementation only adds database JSON data.

## Disposition

Recommend one identity-only `GRAIN_AND_CEREAL` reference for **`Khorasan wheat / blé khorasan`**, scoped to intact food-grade kernels. Keep all aliases, forms, measures, mappings, yields, recipe links, conversions, and substitutions empty. Reuse the OQLF citation already in the ledger, keep `Kamut` outside generic names, and preserve the existing Khorasan flour, Khorasan flakes, durum-kernel, and generic wheat-berry identities.
