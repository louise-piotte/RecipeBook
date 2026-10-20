# WP02/WP03/WP04 R875–R877 generic identity integration

Integrated 2026-10-19. The reviews followed the cross-category catalog scope: prioritize generic
culinary ingredient diversity; keep commercial product counts out of scope; preserve existing rows;
and keep product-specific evidence attached to the product it describes.

## Decisions

- **WP02 A7 R875 — wheat meal:** kept bare `wheat meal` / `wheatmeal` unresolved. Generic Canadian
  sources recognize a human-food category, but the reviewed evidence does not establish one stable
  culinary milling boundary or Québec French display distinct from whole-wheat meal, flour,
  semolina, bran, cracked wheat, and groats/grits. The active
  `ingredient-ref-wheat-meal` row remains limited to whole wheat meal and its existing French
  alternate. Further research on Anson Mills' named Colonial-Style Toasted Stone Cut Wheat Meal is
  out of scope: one more commercial product does not add ingredient diversity. The historical R605
  record and all catalog entries remain preserved. No shared reference or ledger data changed for
  R875.
- **WP03 K R876 — calendula petals:** added identity-only
  `calendula petals / pétales de calendula` for the edible petals of correctly identified,
  food-grown *Calendula officinalis*. The only aliases are French `pétales de souci officinal`;
  unqualified `marigold`, *Tagetes*, other *Calendula* species, leaves, ornamental flowers, and
  non-food preparations remain separate. OQLF, UQAC, and university extension sources support the
  name and culinary petal identity. Fresh or dried use descriptions do not create forms or reusable
  measures.
- **WP04 P R877 — cockle/coque:** promoted the existing `ingredient-ref-cockle` ledger candidate in
  place to an identity-only, visibly qualified name group:
  `cockle (name used for multiple cockle species) / coque (nom utilisé pour plusieurs espèces de
  coques)`, with plural aliases `cockles` and `coques`. CFIA, DFO, and TERMIUM support the
  multi-species naming boundary. The old unresolved decision remains in the ledger as history and
  remains accurate for assigning bare `cockle/coque` to one species. Greenland- and Iceland-cockle
  holds and the separate generic clam candidate were not changed. The display qualifier is a
  catalog scope note, not an official market label, taxonomic claim, or equivalence claim.

## Data boundaries

- The two new/updated references have null density and empty unit mappings. No forms, measurements,
  recipe links, conversions, yields, or substitutions were added.
- Calendula has five scoped source entries; the existing cockle candidate retains its original six
  sources and receives four new source entries. The existing product/category observations remain
  scoped and unchanged.
- The full bundled recipe corpus contains 114 recipes and 1,123 ingredient rows. The checked
  calendula and cockle terms had no recipe-text matches; no recipe link was inferred.
- Static picker projection gives a single qualified cockle result for `cockle`, `cockles`, `coque`,
  and `coques`. Calendula's part-qualified queries resolve to its one identity; broad `petals` /
  `pétales` now returns rose petals and calendula petals. Unqualified `marigold` remains unassigned.
- The queued Anson Mills product-only lead is recorded as out of scope in the A7 checklist and the
  cross-category scope review because adding a commercial product count does not add ingredient
  diversity. No existing brand or product row was deleted, merged, or generalized.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed seed and
  ledger schema/integrity validation.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — references
  already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated
  Kotlin index current at 1,907 references.
- Scoped source-ID checks found all nine new source IDs unused before integration and each now maps
  to one URL. The recipe corpus search returned zero matches. JSON files are UTF-8 without BOM; the
  bundled reference JSON retains escaped Unicode. Scoped `git diff --check` passed.
- No software tests, build, emulator, or deployment were run because the active catalog change only
  adds or updates database JSON under `AGENTS.md`. The generated Kotlin index was refreshed from the
  canonical JSON.

Sections A7, K, and P remain open for their other generic ingredient gaps.

## Review packets

- [R875 — generic wheat meal](../../proposals/wp02-a7-generic-wheat-meal-milling-gap-review-r875-20261019.md)
- [R876 — calendula petals](../../proposals/wp03-section-k-calendula-petals-identity-review-r876-20261019.md)
- [R877 — cockle/coque name group](../../proposals/wp04-section-p-generic-cockle-name-group-review-r877-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
