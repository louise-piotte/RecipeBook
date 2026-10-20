# WP06 arracacha root identity — 2026-10-09

This coordinator batch adds the Andean arracacha root as a source-backed ingredient identity.

## Catalog decision

- ID: `ingredient-ref-arracacha`
- English display: `arracacha root`
- French display: `arracacha` (provisional pending Québec terminology review)
- English alias: `Peruvian carrot` (source-attested)
- Category: `VEGETABLE_AND_AROMATIC`
- No French aliases, other regional-name aliases, forms, density, unit mappings, measurements,
  conversions, substitutions, or recipe links were added.
- Keep arracacha separate from ordinary carrot (*Daucus carota*), parsnip, potato, and cassava root.
  The display name remains `arracacha root`; the source English alias does not merge the identities.
- The complete bundled-library scan covered 114 recipes and 1,123 ingredient rows; no arracacha
  line or reference link was found.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S46` | Instituto Colombiano Agropecuario (ICA), [*Frutas y vegetales en fresco permitidos de Colombia a los Estados Unidos*](https://www.ica.gov.co/getdoc/955ba03f-76e1-4561-98e6-9cb6b948487e/productos-permitidos-desde-colombia.aspx) (2007-02-16), entries 25 and 74 | Pairs Arracacha (raíz), Peruvian carrot (root), and *Arracacia xanthorrhiza*; separately lists ordinary carrot as *Daucus carota*. This dated phytosanitary market-access list supports the identity and distinction, not handling or trade advice. |
| `WP06-SOUTHAM-20261009-S47` | Garnica Montaña, Gómez Tovar, and Ballesteros, [*Manual de cocina: Recetario de arracacha (Arracacia xanthorrhiza Bancr.) Agrosavia La 22 para la región Andina de Colombia*](https://doi.org/10.21930/agrosavia.manual.7404524), AGROSAVIA (2021) | The publisher describes 29 recipes using the tuberous root of the named AGROSAVIA La 22 variety. Supports culinary root use, not a universal recipe or product specification. |
| `WP06-SOUTHAM-20261009-S48` | FAO, [*Neglected crops: 1492 from a different perspective*](https://www.fao.org/4/t0646e/t0646e.pdf) (1994), chapter “Arracacha” | Identifies *Arracacia xanthorrhiza*, lists `arracacha` as a French and English common name, and documents edible tuberous-root use. Other lookalike and regional names remain research evidence. |

## Collision and search checks

- Before integration, `arracacha root`, `arracacha`, and `Peruvian carrot` had no exact match in the
  active references or forms; none of those terms appeared in bundled recipe files.
- After integration, each exact English/French search resolves to `ingredient-ref-arracacha`.
  `Peruvian carrot` resolves to the arracacha display label. A broad `carrot` query shows both
  arracacha and ordinary carrot as distinct choices.
- Huacatay is now integrated as a source-named culinary identity. Its documented Peruvian food use
  is associated especially with *Tagetes minuta*, while INIA's medicinal germplasm query also uses
  the name for *T. terniflora* accessions without documenting culinary use. The catalog does not
  claim one universal species; see
  [the huacatay boundary review](../../proposals/wp06-huacatay-boundary-review-20261009.md).

## Validation

- Package: 478 ingredient references (SHA-256
  `636c90ed02da33623d975c6292f11c3555f1985dc718d466efe33f083f67068e`), 17 forms (SHA-256
  `2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`); manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 644 records, 890 source entries, and 777 distinct source IDs (SHA-256
  `ca74b524af68a834081925c43b09537b190d92ba0d31de24c3bb9fb2c8ac83c9`). Ledger validation
  reported zero schema errors.
- Ingredient-reference normalization, seed-package normalization, generated-index freshness, all 9
  Python seed-package tests, bundled JSON UTF-8/no-BOM/escaped-Unicode checks, and
  `git diff --check` passed.
- Android unit tests: 298 passed, 0 failures/errors/skips. Pixel 9a / Android 16 instrumentation on
  `emulator-5556`: 29 cases, 27 passed, 2 skipped, 0 failures/errors.
- The deploy script installed and launched the app. Live English `arracacha root` and
  `Peruvian carrot` searches each showed one `arracacha root` result; broad `carrot` showed separate
  arracacha and carrot results. French `arracacha` showed one result. The unsaved drafts were
  discarded, and the French home screen returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: arracacha root](en-picker.png) | `536a5923fcaee97cd4dd71fa29a74c0181f6e51f2f64fc74deb52f1e6a0224cc` |
| [English picker: Peruvian carrot alias](en-alias-picker.png) | `b9e81c3a42fcc6bbb6a6342e2f373bf952f6692a883aa760029dc22c3188f0a2` |
| [English carrot boundary](carrot-boundary-en.png) | `6e009246bbad6b61e4820ba6a872ff152d4c7a2a07478cdbdc3429174c4908ca` |
| [French picker: arracacha](fr-picker.png) | `4db43f6e0cd6f1012655ba0dbf8c5b9d83aefec1bac5b84f18021542c7a7d53a` |
| [French library home, 114 recipes](fr-home-114.png) | `78bff2627066d4f2df0469672eb2aa9f6ac63548664f766de195b3db74887e3f` |

## Open work

Review the French display with an independent Québec culinary terminology reviewer. Continue the
Andean product review and broader WP06 South American coverage.
