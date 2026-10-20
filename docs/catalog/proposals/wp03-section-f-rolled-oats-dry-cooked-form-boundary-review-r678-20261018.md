# WP03 Section F R678 — rolled-oats dry/cooked-form boundary (2026-10-18)

- **Status:** Integrated 2026-10-18 as a documentation-only hold; see the [integration README](../batches/wp03-section-f-rolled-oats-dry-cooked-form-hold-integration-r678-20261018/README.md).
- **Plan anchor:** [Open dry-versus-cooked grain forms item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4538).
- **Question:** Does current recipe or measurement demand justify separate dry or cooked forms for rolled oats?

## Recommendation

Keep `ingredient-ref-rolled-oats` as the sole active rolled-oats reference, with no attached dry or cooked form. The two linked recipe rows use the flakes as an input before recipe preparation; neither lists cooked rolled oats as an ingredient. The “overnight oats” recipe hydrates the flakes in milk in its method, but still lists plain rolled oats as its ingredient. A separate dry form would duplicate the reference’s ordinary product state, while a cooked form has no recipe or measurement use to serve. Revisit only if a bundled recipe names cooked rolled oats as an input or a supported measurement/conversion needs an explicit state.

This answers one slice of the open Section F checklist. It does not resolve dry/cooked treatment for other grains or assert a cooking yield. Cooking yield remains a separate quantity relation.

## Evidence and boundary

The [OQLF entry for *flocon d'avoine*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine) defines the product as oat grain “précuit à la vapeur et aplati,” gives *flocon d'avoine* as the preferred Québec French term, and discourages *avoine roulée*. That steaming is part of the flakes’ product processing; it does not establish the recipe-prepared cooked-porridge state modeled by a `cooked` form. Keep the active display `rolled oats / flocons d'avoine` and current aliases unchanged.

Quaker Canada’s current [English product page](https://www.tastyrewards.com/en-ca/brands/quaker/products/large-flake-quakerr-oats) lists a 1/3-cup (30 g) serving and “100% rolled oats”; the current [French product page](https://www.tastyrewards.com/fr-ca/node/3022) gives the same serving in its narrative and declares “100 % de flocons d'avoine.” These are pages for the same branded product, and their portion evidence is already recorded as one product-specific observation by [R596](wp03-section-f-next-gap-review-r596-20261017.md). They do not call for a generic form, conversion, or yield. The French nutrition heading’s `1/3 coup` is an apparent typo; do not use it as a unit or alias.

The direct current pages and official terminology source support the existing product identity and wording. The decision not to add a form rests on the audited recipe demand below, not on extrapolating the Quaker portion.

## Active owner and picker effect

The active owner is [`ingredient-ref-rolled-oats`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), displayed as `rolled oats / flocons d'avoine`, category `GRAIN_AND_CEREAL`. It has aliases `old-fashioned oats`, `old-fashioned rolled oats`, and `gros flocons d'avoine`; density is null and unit mappings are empty. The ledger identity is verified, measurement research remains `blocked_pending_evidence`, and substitution research remains `not_yet_researched` ([ledger](../research-ledger.v1.json)). There are currently no forms attached to this reference ([forms file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)).

No aliases, forms, or rows are proposed, so the picker result set and form hint stay unchanged. The current phrase-first search returns 2 references for `rolled oats` (rolled oats and sprouted rolled oats), 1 for `old-fashioned rolled oats`, 4 for `flocons d'avoine`, and 1 for `gros flocons d'avoine`. `dry rolled oats` and `cooked rolled oats` currently return no result; this review finds no recipe-backed reason to add those form terms. Search and exact form hints are implemented in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

## Bundled recipe demand

Scanned every recipe listed in the [bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json): 114 recipe files and 1,123 ingredient rows. Exactly two rows link to `ingredient-ref-rolled-oats`:

| Recipe row | Ingredient line | Form relevance |
|---|---|---|
| [001 — Air Fryer Baked Oats](../../../app/src/main/assets/seed/bundled-library/recipes/001-air-fryer-baked-oats-0a8b29b8-faf0-4597-8514-e09335de6c03.v1.json), `#1` | `1/2 cup old-fashioned rolled oats` | The method blends the flakes into batter before air-frying. The ingredient line is a dry input, not cooked oats added to a recipe. |
| [065 — Overnight Oats](../../../app/src/main/assets/seed/bundled-library/recipes/065-gruau-sans-cuisson-overnight-oats-7dde7849-5f6e-4e20-b84f-e90fa780d871.v1.json), `#1` | `1 part rolled oats` | The method combines the flakes with milk and chia, then refrigerates overnight. Hydration occurs in the preparation method; it does not make cooked oats an ingredient input. |

A full-text scan also found an unlinked French `flocons d'avoine` mention in recipe 024, whose English method specifies quick oats and whose ingredient is linked to the quick-oats reference. It is not rolled-oats form demand. No bundled recipe line names cooked rolled oats, and no rolled-oats recipe link or quantity change is warranted.

## Source ownership and identifiers

| Evidence | Existing owner | Use in this review |
|---|---|---|
| OQLF, [*flocon d'avoine*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine), checked 2026-10-18; page last updated 2017 | Existing ledger source `WP03-FCR-20261010-S02` on `ingredient-ref-quick-oats` | Reuse its existing URL/source ID for Québec wording and product-processing context; do not re-register or reassign it. |
| Quaker Canada, [Large Flake Oats](https://www.tastyrewards.com/en-ca/brands/quaker/products/large-flake-quakerr-oats), checked 2026-10-18 | `WP03-ROLLED-OATS-QUAKER-LARGEFLAKE-R596-20261017-S01` on `ingredient-ref-rolled-oats` | Current manufacturer wording and same-product serving already recorded by R596. |
| Quaker Canada, [Gruau Quaker Gros flocons](https://www.tastyrewards.com/fr-ca/node/3022), checked 2026-10-18 | `WP03-ROLLED-OATS-QUAKER-LARGEFLAKE-R596-20261017-S02` on `ingredient-ref-rolled-oats` | Current French product wording and serving; it supports *flocons d'avoine*, not a new preferred display. |

`R678`, the proposal filename, and candidate ID `ingredient-form-rolled-oats-dry` are unused in the proposal archive, batch archive, ledger, and plan. No new source ID, catalog ID, URL ownership, observation, or ledger decision is proposed.

## Scope and checks

This review records a bounded hold only. No changes were made to the reference, forms, recipe rows, measurements, conversions, yields, substitutions, or research ledger. No software tests were run for this documentation-only review.

- Checked the current open Section F item, related proposal archive, active reference/forms, and ledger. R596 is a related product-portion review and explicitly left the dry/cooked-form question unresolved; R678 makes that distinct form-need decision.
- Rechecked the OQLF and bilingual Quaker pages online and audited source-ID and URL ownership before citing them.
- Scanned all manifest-listed recipe files and ingredient rows for linked rolled-oats demand and broader text mentions.
- Reproduced picker query results from the current reference/forms data using the phrase-first search rules in `IngredientSearch.kt`.
