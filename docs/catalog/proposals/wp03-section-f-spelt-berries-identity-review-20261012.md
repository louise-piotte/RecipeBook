# WP03 Section F: spelt-berries identity review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. This file does not change the active catalog, forms, ledger, recipes, plan, roadmap, generated catalog, or application data.
- **Scope:** Dry, food-grade whole spelt kernels sold for cooking as a grain, commonly marketed in English as spelt berries.
- **Open checklist:** The plan still calls for remaining Section F grains and processed cereals ([global catalog plan, line 8794](../../RecipeBook-global-ingredient-catalog-plan.txt#L9075)) and continues the broader regional cereal-mix/preprocessed-grain review ([line 9198](../../RecipeBook-global-ingredient-catalog-plan.txt#L9479)).
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, **`spelt berries / grains d’épeautre`**, proposed ID `ingredient-ref-spelt-berries`. Add no aliases, forms, measurements, recipe links, yields, conversions, or substitutions.
- **Candidate freshness:** No dedicated whole-spelt-kernel proposal, active identity, or ledger candidate was found. Earlier spelt-flakes and puffed-spelt reviews mention raw spelt kernels only as neighboring products; they do not review or allocate this identity. The lasagna-sheet work is outside this grain boundary.

This is a species-specific whole-kernel identity gap. Québec product evidence uses *grains d’épeautre* for a cooking grain identified as *Triticum spelta* (grand épeautre/spelt). OQLF pairs *épeautre* with English *spelt* and describes it as a variety of wheat. This supports retaining spelt berries separately from generic wheat berries and from products made by flattening, puffing, or milling spelt. The 98 live forms include no spelt/epeautre label or match term and no form is attached to the related whole-wheat, einkorn, durum, emmer, spelt-flake, or puffed-spelt references; the proposal therefore does not attach a spelt-specific state form to one of those identities.

## Proposed identity and boundary

| Field | Recommendation | Evidence and limit |
|---|---|---|
| Stable ID | `ingredient-ref-spelt-berries` | No active reference, legacy candidate, or ledger record has this ID. |
| English display | `spelt berries` | Used as a product name by Canadian grain sellers. Retain the product-qualified phrase; do not add bare `spelt` as an alias. |
| Québec French display | `grains d’épeautre` | Direct Québec product wording from a Coop Agrobio listing; its description identifies the food as whole-grain *Triticum spelta*. This is product-attested wording, not an OQLF ruling on the compound. |
| Aliases | None | The sources support the display pair but do not establish additional stable spelling or regional aliases. |
| Category | `GRAIN_AND_CEREAL` | OQLF identifies spelt as a wheat variety; Health Canada lists *épeautre* among examples of whole grains. |
| Forms and numeric data | None; `defaultDensity: null`, `unitMappings: []` | No bundled recipe demand or reusable mass-volume evidence was found. |

The identity covers the edible whole kernels sold as a dry cooking grain. It does not include unprocessed ears or kernels still enclosed in the adherent hull, spelt flour, bran, flakes, puffed spelt, sprouted spelt, or a prepared spelt cereal. Do not treat it as a synonym for generic wheat berries, emmer, einkorn, Khorasan wheat, or unqualified farro. The active catalog already has distinct generic wheat-berry, einkorn-berry, durum-kernel, Khorasan-wheat, spelt-flake, and puffed-spelt identities; the proposed row preserves those boundaries.

## Exact-key ownership and current records

The audit used the repository’s `normalize_search_key` implementation (case folding, Unicode compatibility decomposition and accent removal, ligature folding, punctuation-to-space conversion, and whitespace collapse). It compared exact normalized strings across every active reference string field, form string field, legacy-candidate string field, and every string value and record ID in the research ledger.

| Candidate key checked | Exact owner |
|---|---|
| `spelt berries`; `spelt berry`; `spelt grain`; `spelt grains`; `spelt kernel(s)`; `whole spelt`; `whole spelt grain`; `spelt wheat berries` | None |
| `grains d’épeautre`; `grain d’épeautre`; `grains entiers d’épeautre`; `grain entier d’épeautre`; `épeautre entier`; `grand épeautre`; `grains de grand épeautre` | None |
| `ingredient-ref-spelt-berries`; `candidate-spelt-berries` | None |

There are 1,302 active references, 98 forms, 64 legacy-import candidates, and 1,610 ledger records in this snapshot. The exact-key result does not mean broad queries are unique: `spelt` and `épeautre` are already visible in the accepted spelt-flakes and puffed-spelt identities, and a future spelt-berries row would appropriately add another distinct product result.

The ledger has no exact candidate phrase, proposed ID, or source ID. Its only related text hits are contextual: the spelt-flakes record describes flakes rolled from spelt grain, the puffed-spelt record describes puffing spelt kernels, and the einkorn-flour record contains an accent-folded partial match within its discussion of *farine d’épeautre entière*. None is a record for dry whole spelt kernels. All proposed source IDs in the register below were checked absent from the ledger.

## Recipe and ingredient-row audit

All manifest-listed bundled recipes and all structured ingredient rows were scanned, along with the extracted RecipeKeeper recipe archive. The case-, accent-, and punctuation-normalized phrase set included explicit singular and plural English variants, the candidate French names, whole-kernel variants, and the proposed IDs.

| Corpus | Recipe files | Ingredient rows/lines | Candidate hits |
|---|---:|---:|---:|
| Bundled manifest recipes | 114 | 1,123 | 0 files; 0 rows |
| Extracted RecipeKeeper JSON recipes | 114 | 1,103 | 0 files; 0 ingredient lines |
| Extracted RecipeKeeper `recipes.html` | 1 | — | 0 |

No recipe link, recipe-text correction, quantity, form, or conversion is indicated by the current library. Recipe demand is not a prerequisite for documenting this bounded species-specific grain identity, but the absence of demand keeps the recommendation identity-only.

## Forms, preparation, measurement, and substitutions

The Québec Coop Agrobio listing gives product-specific cooking directions for one cup of dry spelt grain and describes an approximate cooked yield of three cups. The listing does not establish an app-wide cup convention or a transferable yield for other spelt products. Keep those directions source-scoped; do not add a form, default density, unit mapping, general cooked yield, or conversion.

The reviewed sources do not establish a tested replacement ratio or a recipe-context substitution. Add no global or contextual substitution rule. The current recipe corpus contains no candidate line that would justify a recipe-specific trial.

## Live artifact snapshot

Read-only counts and SHA-256 values at review time on 2026-10-12:

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,302 references | 416,827 | `4a9aa7269070c0ce8f3d4141688c9dd5f63ace34f4daee05691937991463f5a5` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,610 records | 5,751,739 | `974c9e57139d748c3a073f7a3b12649620cb8b7d97b04a17329709cb4ce7c476` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe corpus | 114 files / 1,123 ingredient rows | — | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (manifest-path and exact-byte digest) |

The shared worktree may move after this read-only audit; recheck the package and corpus before any later integration.

## Source register

Sources were accessed on 2026-10-12. The proposal-local source IDs below are unallocated in the current research ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SPELTBERRIES-20261012-S01` | Office québécois de la langue française, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), updated 2007. | Gives preferred French *épeautre*, English *spelt*, and identifies spelt as a variety of wheat. It supports the base bilingual species name, not a whole-kernel product label. |
| `WP03-SPELTBERRIES-20261012-S02` | Coop Agrobio / Comptoir Saint-Vrac, [Grains d’épeautre Bio](https://comptoirstvrac.com/product/2088), product description and culinary-use section. | Québec product listing names *grains d’épeautre*, identifies *Triticum spelta* (grand épeautre/spelt), describes whole grain sold for cooking, and provides product-specific cooking directions. Package formats and directions are not catalog measures or transferable yields. |
| `WP03-SPELTBERRIES-20261012-S03` | Almanac Grain, [Spelt berries](https://almanacgrain.ca/products/spelt-berries). | A Québec-grown grain supplier uses the English product name and describes spelt berries for salads, stews, and sprouting. It does not establish a French label or a cooking conversion. |
| `WP03-SPELTBERRIES-20261012-S04` | Storehouse Foods, [Organic Spelt Berries](https://storehousefoods.ca/collections/grains-cereals/products/organic-spelt-berries). | Canadian retailer product page uses `Spelt Berries`, identifies the product as Canadian and whole grain, and distinguishes it from spelt flour. It is product wording evidence, not an independent botanical or Québec terminology authority. |
| `WP03-SPELTBERRIES-20261012-S05` | Government of Canada, [Bien manger avec le Guide alimentaire canadien — ressource à l’intention des éducateurs et communicateurs](https://publications.gc.ca/collections/Collection/H164-38-2-2007F.pdf), p. 23. | Lists *épeautre* among examples of whole grains and discusses whole grains in the cereal-products food group. This supports the category only; it supplies no product label, measure, or preparation relation. |

## Suggested acceptance checks for a later integration

1. Recheck `ingredient-ref-spelt-berries`, the display pair, and these source IDs against the live references, forms, legacy candidates, ledger, and all Section F proposals.
2. If accepted, add only the identity row with no aliases, forms, measurements, recipe links, conversions, yields, or substitutions. Keep the source-specific cooking direction out of reusable numeric fields.
3. Preserve the boundary from wheat berries, spelt flakes, puffed spelt, spelt flour/bran, einkorn, emmer, Khorasan wheat, and farro.
4. Re-run the complete bundled-recipe and ingredient-row audit before adding any future recipe link. No tests or emulator checks are needed for a later data-only JSON addition under `AGENTS.md`.

The proposal closes one narrow whole-spelt-kernel review only. Broader Section F grain, cereal, preprocessed-product, and Québec terminology work remains open.
