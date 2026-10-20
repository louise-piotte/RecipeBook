# Chocolate and confectionery identity integration

## Integration record

| Field | Value |
|---|---|
| Scope | Milk-chocolate identity and explicitly qualified milk-chocolate chips |
| Status | Integrated; independent bilingual review remains open |
| Date | 2026-10-06 |
| Canonical ID | `ingredient-ref-milk-chocolate` |
| Display names | `milk chocolate` / `chocolat au lait` |
| Category | `CHOCOLATE_AND_CANDY` |

## Evidence and decisions

- The OQLF Grand dictionnaire terminologique pairs the preferred Québec French name `chocolat au
  lait` with English `milk chocolate` [S1]. No composition percentage from that entry was copied
  into the catalog.
- The CFIA identifies milk chocolate as a standardized chocolate product and distinguishes real
  chocolate chips from compound coating chips [S2]. The catalog therefore maps explicitly named
  milk chocolate chips to the milk-chocolate base while leaving product coating/composition details
  out of the record.
- Two Canadian French recipe sources use `pépites de chocolat au lait` for a discrete ingredient:
  Les Producteurs laitiers du Canada uses it in a hot-chocolate recipe, and the Fédération des
  producteurs d’œufs du Québec melts it for frosting [S3, S4]. The exact phrase is a French alias.
- The record has no density, unit mapping, preparation form, or substitution data. The `chips`
  preparation hint remains on a recipe line rather than becoming a separate ingredient identity.
- The existing generic `chocolate chips` alias remains on semisweet chocolate. Existing white,
  dark, and bittersweet chip aliases retain their matching base identities. The rule does not strip
  `chips` from non-chocolate products.

## Recipe coverage

Recipe 067, *My Cherry Blossom Version*, explicitly requests `1 cup milk chocolate chips` and names
milk chocolate. Its ingredient line now references `ingredient-ref-milk-chocolate`; the original
text and English/French chips preparation hints are preserved. Recipe 056's combined `milk and dark
chocolate` line remains unlinked because it names a mixture without proportions.

## Acceptance checks

- `milk chocolate`, `milk chocolate chips`, `chocolat au lait`, and `pépites de chocolat au lait`
  resolve to `ingredient-ref-milk-chocolate`.
- Generic chocolate chips still resolve to semisweet chocolate. White, dark, and bittersweet chip
  phrases still resolve only to their matching identities.
- The recipe link preserves the source wording and chip preparation metadata.
- No form, density, unit mapping, measurement, conversion, yield, or substitution was activated.

## Sources

1. OQLF, [chocolat au lait | Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17027692/chocolat-au-lait).
2. CFIA, [Labelling requirements for confectionery, chocolate and snack food products](https://inspection.canada.ca/en/food-labels/labelling/industry/confectionery-chocolate-and-snacks).
3. Les Producteurs laitiers du Canada, [Chocolat chaud sur un bâton](https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/recettes/chocolat-chaud-sur-un-baton).
4. Fédération des producteurs d’œufs du Québec, [Rondelles de hockey au chocolat](https://oeuf.ca/recettes/rondelles-de-hockey-au-chocolat/).

## Verification

- All 215 Android unit tests and all 9 Python seed-package tests passed. Android 16 / API 36 Pixel 9a
  instrumentation completed 26 cases: 24 passed, two environment-gated skips, and zero failures or
  errors. The skipped cases were the existing OpenRouter settings and activity-recreation checks.
- Reference normalization, bundled-package normalization and validation, research-ledger schema and
  alias-collision validation, generated-index freshness, UTF-8/no-BOM checks across 124 bundled JSON
  files, and `git diff --check` passed. The deployment script's `test` and debug-assembly tasks also
  passed.
- On Pixel 9a at 1080×2424, the English picker query `milk chocolate chips` returned one
  `milk chocolate` result. In French, the accent-folded query `pepites de chocolat au lait` returned
  one `chocolat au lait` result.
- The unsaved test recipe was discarded. The French home screen still showed 114 recipes. Screenshots:
  [English milk-chocolate result](pixel9a-milk-chocolate-picker-en.png),
  [French milk-chocolate result](pixel9a-milk-chocolate-picker-fr-ca.png), and
  [French home with 114 recipes](pixel9a-catalog-home-fr-ca-114.png).
- The APK was exercised using a temporary emulator data directory; that directory was removed after
  QA. The original emulator app data was not the install target.

## Form-hint follow-up — 2026-10-06

Six source-backed chips and melted forms now sit under the semisweet, white, dark, and milk chocolate identities. Exact bilingual form phrases in the picker carry a form selection while preserving the source line; no measurement, conversion, yield, or substitution data was added. The 12 recipe lines, evidence, and test results are recorded in [Chocolate Form Hints](chocolate-form-hints.md). Broader WP02 and Section D review remains open.


## Cocoa powder follow-up — 2026-10-10

Natural, Dutch-process, and black cocoa are distinct process/product identities. The seed now uses `natural cocoa powder / cacao en poudre naturel`, `dutch-process cocoa powder / cacao en poudre alcalinisé`, and `black cocoa powder / poudre de cacao noir`; the last retains only the narrow English alias `black cocoa`. The two recipe lines that explicitly say “unsweetened natural cocoa powder” now point to the natural identity. The 14 process-unqualified lines remain linked to the existing unsweetened-powder row; their text does not identify a process. The old unqualified French `hollandaise` cocoa terms were removed to avoid the prepared-sauce collision.

USDA and manufacturer portions remain source-specific observations. No density, unit mapping, or global conversion was activated. Baking substitution evidence is stored as context-specific research only; no runtime rule or recipe amount change was added. The independent review is [`wp02-cocoa-products-residual-review-20261010.md`](../proposals/wp02-cocoa-products-residual-review-20261010.md).
