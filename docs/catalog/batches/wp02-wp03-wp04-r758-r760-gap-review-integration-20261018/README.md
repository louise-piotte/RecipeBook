# WP02/WP03/WP04 R758–R760 integration — 2026-10-18

## Integrated changes

- **R758 — generic buckwheat flour:** Updated the existing `ingredient-ref-buckwheat-flour` ledger record with Health Canada’s qualitative advice, King Arthur’s recipe-context starting levels (25% for non-yeasted recipes and 15% for yeasted bread), and Eren and Akkaya’s 10%, 20%, and 30% whole-buckwheat bread trial. The finding remains `blocked_pending_evidence`: these sources do not define one reusable substitution, and the current rule model cannot represent replacing only part of the wheat-flour line while retaining the remainder. No active rule, form, measure, density, mapping, or recipe link was added.
- **R759 — Apple Cinnamon Cheerios:** Added identity-only `ingredient-ref-apple-cinnamon-cheerios` as `Apple Cinnamon Cheerios / Pomme et Cannelle Cheerios`, with the source-backed French alias `Cheerios Pomme et cannelle`. Recorded the Canadian manufacturer’s 1 cup (39 g) Nutrition Facts serving only as a product-specific `portion_weight` observation. Package sizes and ingredient declarations remain source context; no generic cereal measure, form, conversion, yield, recipe link, or substitution was added.
- **R760 — lake trout:** Added `ingredient-form-lake-trout-whole-fish` as `whole lake trout / touladi entier` under the existing *Salvelinus namaycush* identity. It records only the state-neutral whole-fish presentation offered by Freshwater Fish Marketing Corporation; fresh/frozen periods, retail availability, cleaning state, measures, yields, and recipe use were not generalized. The existing OQLF source ID is reused in the form record.

The three parent catalog-plan sections remain open. R758–R760 close only these bounded child reviews.

## Source and ownership record

The source IDs added by this integration are unique and map to nine distinct new URLs:

- R758: `WP02-A6-BUCKWHEAT-SUB-R758-20261018-S01` through `S03`.
- R759: `WP03-APPLE-CINNAMON-CHEERIOS-R759-20261018-S01` through `S03`.
- R760: `WP04-SECTIONP-LAKE-TROUT-WHOLE-FORM-R760-20261018-S01` through `S03`.

The R760 form ledger record reuses `WP04-NEXT-FISH-GAP-20261012-S01` for the established Québec species name. R759 did not copy the optional Cheerios product-list source because its bilingual product pages directly establish this variant. No source ID or URL was duplicated as a new source.

The final sources and scoped findings are recorded in [research-ledger.v1.json](../../research-ledger.v1.json). The proposal files are [R758](../../proposals/wp02-a6-next-gap-review-r758-20261018.md), [R759](../../proposals/wp03-section-f-next-gap-review-r759-20261018.md), and [R760](../../proposals/wp04-section-p-next-open-gap-review-r760-20261018.md).

## Catalog and picker impact

After integration the bundled package contains **1,849 references** and **185 forms**; the research ledger contains **2,243 records**. Compared with the pre-integration snapshot, nine source IDs and nine source URLs were added. The lake-trout form reuses one existing OQLF source ID.

- R758 is ledger-only; buckwheat-flour names and picker results are unchanged.
- R759 changes `Cheerios` from 8 to 9 results and `Apple Cinnamon` / `Pomme et Cannelle` from one Chex result to two distinct cereal products. Generic `cereal` / `céréales` counts stay 77 / 73.
- R760 makes exact `whole lake trout` and `touladi entier` queries selectable. Broad `whole` / `entier` counts increase from 50 / 23 to 51 / 24; existing `lake trout` / `touladi`, `trout` / `truite`, `whole fish` / `poisson entier`, and fresh-whole searches keep their prior scope.

## Recipe corpus

The complete manifest-listed corpus contains **114 recipe files** and **1,123 structured ingredient rows**. Scans documented in the proposals found no matching file or ingredient row for the buckwheat substitution target, Apple Cinnamon Cheerios, or whole lake trout. No bundled recipe was changed or linked.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated reference index)
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; it validates package content and the research-ledger schema.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 1,849 references.
- Source ownership and ID uniqueness, ASCII-escaped JSON/no-BOM encoding, Markdown links, whitespace, and the 114-file / 1,123-row recipe scan passed. The recipe scan found no candidate hits.
- The generated `BundledIngredientCatalog.kt` reference index was refreshed from the canonical JSON. No hand-written application logic or `DESIGN.md` file changed.

No software tests, build, emulator, or deployment were run: the shared catalog changes only add database JSON data under the current `AGENTS.md` rule.
