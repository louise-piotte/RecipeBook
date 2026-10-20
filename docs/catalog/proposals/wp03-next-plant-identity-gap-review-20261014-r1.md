# WP03 Section K mizuna identity-gap review

- **Reviewed:** 2026-10-14
- **Status:** Accepted and integrated on 2026-10-14; see the root integration record at [WP03 Section K — mizuna](../batches/wp03-section-k-mizuna-identity-integration-20261014/README.md).
- **Scope:** one culinary leafy-green identity, mizuna.
- **Decision:** accept one identity-only candidate, `ingredient-ref-mizuna`, in `VEGETABLE_AND_AROMATIC`. Use `mizuna` for both EN and fr-CA display. Add no aliases, forms, density, unit mappings, conversions, yield, substitution rules, or bundled recipe links.
- **Source-ID prefix:** `WP03-K-MIZUNA-20261014-S`; the prefix was absent from the research ledger at the snapshot below.

## Exact plan item and review boundary

This proposal addresses the still-open Section K item in `docs/RecipeBook-global-ingredient-catalog-plan.txt`:

> [ ] Continue the broader lettuce, leafy-green, and brassica sweep beyond these named identities; resolve additional market and regional types with source evidence and reviewer input.

The named Section K coverage and other leafy-green proposals do not resolve mizuna. The identity is a fresh culinary leaf product of *Brassica rapa*. Sources vary in infraspecific/group labels, so the proposed catalog identity stays at the market commodity name and does not encode a narrower botanical rank. This is one candidate only; it does not close the broader sweep or the independent terminology review.

## Repository audit and snapshot

I searched existing WP03/WP06 proposals and batches, live reference and form JSON, legacy import identities, the research ledger, and all manifest-listed recipe files for `mizuna`, `Japanese mustard greens`, `verdurette japonaise`, and related red/green mizuna wording. There is no prior proposal or ledger source ID for this candidate, and no active reference, form, legacy candidate, or bundled recipe ingredient hit. The broad Section K checklist line remains open.

Snapshot at review time:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,457 references | `cb3f5edbd22b83558efc6c3c6011527d170df9c46bd5523f29273bdcb6fe50bd` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | 1,797 records / 7,363 source entries / 6,243 distinct source IDs | `68982051c6048c950440e436bb2716d3e09d25e1d64354c7d091038c6d268d68` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f` |

The corpus digest is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. Existing work in these shared files was left untouched.

## Candidate, names, and picker collision

| Candidate ID | Category | EN display | fr-CA display | Aliases | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-mizuna` | `VEGETABLE_AND_AROMATIC` | `mizuna` | `mizuna` | none | Culinary leaves and tender stems sold/prepared as mizuna; no generic mustard-green or microgreen extension. |

Quebec seed listings and a Montréal produce marketplace use the unaccented product name `Mizuna` in French-language contexts; English culinary and extension sources use the same name. Reusing this market name for both displays is supported as a practical fr-CA catalog label. It is **not** an OQLF approval: I found no mizuna-specific OQLF terminology entry in the reviewed material. Keep the display name subject to the open independent Québec terminology review.

The candidate has no exact normalized owner in the current reference, form, or legacy files. The app's ingredient search normalizes accents and punctuation and tries phrase matches before substring fallback (`app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`). Current queries for `mizuna`, `mizuna greens`, `mizuna leaves`, `Japanese mustard greens`, and `mizuna microgreens` return no mizuna result. The broad query `mustard greens` currently returns `ingredient-ref-mustard-greens` and `ingredient-ref-pickled-mustard-greens`. Penn State calls mizuna “Japanese mustard greens,” but adding that phrase as an alias would make a broad mustard-greens query return a third, distinct commodity. Omit the alias. Do not add `moutarde japonaise` or `verdurette japonaise`: neither was established as the name of fresh mizuna by a Quebec retail terminology authority. Keep red/green mizuna microgreens out of the general leaf identity.

## Recipe demand and source boundaries

The bundled corpus has zero mizuna ingredient-row or full-recipe hits across 114 recipes and 1,123 ingredient rows. External evidence establishes real culinary use and local market availability, but it creates no bundled recipe link. A Montréal Lufa recipe uses one chopped bunch of mizuna in soba salad. Another Lufa recipe uses two bunches of mizuna or Tokyo Bekana in one quick dumpling stir-fry. These are recipe-specific ingredient quantities and, for the optional alternative, a single dish/method context. A Kwantlen Polytechnic University recipe lists five cups of trimmed mizuna leaves. These observations demonstrate demand and recipe usage; they are not reusable unit mappings.

Source-specific quantity, waste, and substitution observations:

- Lufa lists an 80 g mizuna pack in its current Québec marketplace. This is a package size, not a cup weight or default serving.
- Lufa recipes use one bunch and two bunches, respectively, without a mass for either bunch. The Tokyo Bekana alternative is contextual to that stir-fry recipe only.
- KPU's five cups of trimmed leaves has no reported mass and does not support a general cup conversion.
- A Québec mesclun technical sheet gives 1 cup = 61 g for the *mixture*. Mizuna is one possible component; this is not mizuna-specific and must not be transferred.
- Japan's 2023 food-composition supplement reports 15% refuse for raw mizuna leaves. This is the source's raw-food composition/refuse observation, not a recipe yield, cooked yield, or reusable catalog percentage.
- Penn State Extension mentions using mizuna instead of basil or spinach in pesto. That is source-specific culinary advice, not a global substitution rule.

No mizuna density, ingredient unit mapping, transferable mass/volume conversion, preparation yield, or generally safe substitute was found. Activate none. There is no evidence here to link a recipe or add fresh/cooked/dried/microgreen forms.

## Sources reviewed

All pages were accessed 2026-10-14. Source IDs are proposal-local; do not write them into the shared ledger until a coordinator accepts and integrates this review.

| Proposed source ID | Source | Observation and boundary |
|---|---|---|
| `WP03-K-MIZUNA-20261014-S01` | Penn State Extension, [“Mizuna: an Asian Green”](https://extension.psu.edu/mizuna-an-asian-green), updated 2026-01-05. | Identifies *Brassica rapa* var. *nipposinica*, notes leaves and stems are edible, describes salads, sauté/stir-fry, soups/stews, and calls it Japanese mustard greens. Its pesto advice is source-specific; the common-name synonym is held to avoid picker collision. |
| `WP03-K-MIZUNA-20261014-S02` | Japan Ministry of Education, Culture, Sports, Science and Technology, [Food Composition Database, food 06072](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=6_06072_7), 2023 supplement. | Raw mizuna leaves; lists *Brassica rapa* Japonica Group and 15% refuse. Taxonomic rank is source-specific; refuse is raw-food data, not recipe yield or conversion. |
| `WP03-K-MIZUNA-20261014-S03` | Ferme Coop du Moulin (Québec), [Mizuna seed/product page](https://fermecoopdumoulin.com/products/mizuna). | French-language product title is “Mizuna”; describes green jagged leaves for salads and sandwiches, with mature leaves steamed or stir-fried and young leaves more tender. Seed/product copy, not a retail package or quantity standard. |
| `WP03-K-MIZUNA-20261014-S04` | Ferme Tourne-Sol (Québec), [Mizuna organic-seed page](https://fermetournesol.qc.ca/en/collections/quoi-planter-en-septembre-what-to-plant-in-septembre/products/br302). | Uses `Mizuna` and describes it in French as `verdurette japonaise` for salads and sautés; identifies *Brassica rapa*. Supports a Quebec French descriptive phrase, not a safe alias or retail-standard name. |
| `WP03-K-MIZUNA-20261014-S05` | Marché des Fermes Lufa (Montréal), [Laitues marketplace category](https://montreal.lufa.com/fr/marche/categorie/legumes/laitues). | Current French-market search listing shows fresh products named `Mizuna` from two Quebec producers in 80 g packs. The page is dynamically rendered; the marketplace search listing supports name and package size, not cup weight or a standard portion. |
| `WP03-K-MIZUNA-20261014-S06` | Marché des Fermes Lufa, [“Salade de nouilles soba en 15 minutes”](https://montreal.lufa.com/fr/marche/recette/salade-de-nouilles-soba-en-15-minutes-464). | French recipe lists one coarsely chopped bunch of mizuna. Recipe-specific bunch quantity; no mass conversion. |
| `WP03-K-MIZUNA-20261014-S07` | Marché des Fermes Lufa, [“Dumplings et sauté de légumes rapides”](https://montreal.lufa.com/fr/marche/recette/dumplings-et-saute-de-legumes-rapides-529). | Recipe lists two bunches of mizuna or Tokyo Bekana. This is a single recipe's contextual alternative, not a general ingredient substitution. |
| `WP03-K-MIZUNA-20261014-S08` | Kwantlen Polytechnic University, [“Grilled Mushroom Salad with Mizuna”](https://www.kpu.ca/agriculture/recipes/mushrooms-mizuna). | One recipe lists five cups of trimmed leaves, without weight. Keep as source-specific volume only. |
| `WP03-K-MIZUNA-20261014-S09` | Serres Québec / INAF, [technical sheet on baby lettuces and mesclun](https://www.serres.quebec/wp-content/uploads/progexia-files-list/production/commercialisation/10679_Bebeslaituesoumesclun-final_2.pdf). | Includes mizuna among possible Asian baby-green mesclun components; gives 1 cup = 61 g for the mesclun mixture. Mixture data is not a mizuna conversion. |

## Coordinator integration steps

1. Independently review the Québec display `mizuna` and accept, revise, or defer the candidate while Section K's regional terminology review remains open.
2. If accepted, add only `ingredient-ref-mizuna` in `VEGETABLE_AND_AROMATIC`, with `name.en` and `name.fr` both `mizuna`, no aliases, `defaultDensity: null`, and `unitMappings: []`.
3. Add no form, recipe link, general conversion, yield, or substitution from this evidence. Keep the source-specific recipe and raw refuse observations inactive unless separately accepted into the ledger with their conditions and provenance.
4. Before integration, repeat the exact-name and picker search against the then-current references/forms/legacy identities because the shared catalog is changing. Preserve the existing `mustard greens` results and do not add `Japanese mustard greens` as an alias.
5. If accepted, add the source records to the research ledger under the proposed source IDs and then update the coordinator-owned batch/plan/checklist files. This proposal itself changes none of those files.
