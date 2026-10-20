# WP02/WP03/WP04 R219–R225 Gap Review Integration

Integrated 2026-10-16 after proposal and source review. Four identity-only references and their
ledger evidence were added. Two boundary reviews were recorded as holds. No recipe rows, ingredient
forms, active conversions, or application behavior changed.

## Accepted catalog changes

- **R219 — hard red winter wheat flour / farine de blé rouge d’hiver dur**
  (`ingredient-ref-hard-red-winter-wheat-flour`, `FLOUR_AND_STARCH`). Farinart’s Québec product
  range names a separate hard flour beside the R216 soft red winter flour. Keep it separate from
  hard red winter berries, bread/high-gluten grades, and formal CEHRW/CWRW assignments because the
  product page names no variety or class. Add no aliases, forms, measures, conversions, recipe links,
  yields, or substitutions; no bundled recipe demand was found.
- **R221 — frozen breaded fish sticks / bâtonnets de poisson panés surgelés**
  (`ingredient-ref-frozen-breaded-fish-sticks`, `PROTEIN`). Keep the species-neutral commercial
  product separate from raw home-cut fish, battered portions, breaded fillets, fish fries, burgers,
  cakes, fish balls, and surimi. The ledger retains Metro’s 700 g / 28-stick SKU package, Janes’
  480 g and 1.1 kg packages, High Liner’s species-specific 350 g package, and Codex’s 20–50 g coated
  stick product-standard interval only as source-bounded observations. None is a reusable kitchen
  measure or generic per-stick conversion. No aliases, forms, density, recipe link, conversion, or
  substitution was added; the corpus has no matching demand.
- **R222 — hard red spring wheat flour / farine de blé de force roux de printemps**
  (`ingredient-ref-hard-red-spring-wheat-flour`, `FLOUR_AND_STARCH`). Keep this source-class identity
  separate from hard red spring berries, high-gluten flour, and culinary/extraction grades. Engrained’s
  1 kg and 2.5 kg package formats remain product-specific observations. No aliases, forms, reusable
  measures, conversion, recipe link, or active substitution was added; the corpus has no demand.
- **R225 — soft white wheat flour / farine de blé tendre blanc**
  (`ingredient-ref-soft-white-wheat-flour`, `FLOUR_AND_STARCH`). Keep the flour separate from
  soft-white berries, soft red wheat, pastry grades, and white whole-wheat flour. The French display
  is a provisional construction from OQLF, Canadian Grain Commission, and French Canadian market
  wording; independent Québec wording review remains open. Peace Country’s 4.5 kg and 10 kg package
  sizes remain product-specific observations. Its same-amount all-purpose advice was not activated
  as a general substitution. No aliases, forms, reusable measures, recipe links, conversions, or
  active substitutions were added; no bundled recipe demand was found.

## Documented boundary holds

- **R220 — canjiquinha / canjiquinha de milho.** Embrapa uses canjiquinha as a popular name for a
  degermed maize grits fraction, while commercial canjiquinha has multiple grades. The current
  Canadian Amafil listing supplies no particle-size grade or crosswalk to the active Codex-bounded
  corn-grits identity. Keep the candidate unallocated until a Canadian SKU specification resolves
  whether it belongs under that row or represents a distinct grade. No reference, alias, or ledger
  record was added.
- **R224 — frozen tempura fish.** OQLF defines tempura broadly across fish, seafood, and vegetables.
  Adding this one frozen fish product would make the bare `tempura` query return a fish identity by
  itself, and the bundle has no matching demand. Keep the product unallocated until recipe demand
  appears or picker behavior can preserve the broader term. Keep tempura fish fries, species-specific
  battered fillets, and frozen breaded fish sticks separate. No catalog or ledger data was added.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py` completed successfully.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py` regenerated the Kotlin
  search index with **1,618 references**.
- Research-ledger schema validation passed for **1,963 records**. The whole-ledger audit found
  **8,565 source entries**, **7,269 distinct source IDs**, and **6,045 distinct URLs**, with no
  source-ID URL conflicts or unresolved source citations.
- The four new reference IDs, categories, empty alias arrays, null densities, empty unit mappings,
  package observations, and evidence source links were checked. The two holds added no catalog or
  ledger entries.
- The manifest remains **114 recipes / 1,123 ingredient rows**.
- No app tests, emulator checks, or deployment were run because the changes only add database JSON
  data and documentation under `AGENTS.md`.

Proposals: [R219 hard red winter flour](../../proposals/wp02-a-or-a6-hard-red-winter-wheat-flour-review-r219-20261016.md),
[R220 canjiquinha hold](../../proposals/wp03-section-f-canjiquinha-identity-boundary-hold-r220-20261016.md),
[R221 frozen fish sticks](../../proposals/wp04-section-p-frozen-fish-sticks-product-identity-review-r221-20261016.md),
[R222 hard red spring flour](../../proposals/wp02-a-or-a6-hard-red-spring-wheat-flour-review-r222-20261016.md),
[R224 frozen tempura fish hold](../../proposals/wp04-section-p-frozen-tempura-fish-product-boundary-review-r224-20261016.md), and
[R225 soft white wheat flour](../../proposals/wp02-a-or-a6-soft-white-wheat-flour-identity-review-r225-20261016.md).
The parent wheat-flour, cereal, and seafood checklist items remain open.
