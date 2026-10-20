# WP06 Saskatoon berry identity integration and Pixel 9a QA

## Accepted scope

Added `ingredient-ref-saskatoon-berry` as `Saskatoon berry / amélanche` in `FRUIT`. The identity is
scoped to *Amelanchier alnifolia*. No aliases were added: OQLF's English terms June-berry,
service-berry, and shadbush may cover broader taxa or regional usage, and its French term
`Saskatoon` is limited to fruit from that region. Blueberry remains a separate identity. No form,
measurement, density, unit mapping, conversion, substitution, or recipe link was added.

## Evidence and package snapshot

- [OQLF Grand dictionnaire terminologique, amélanche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296928/amelanche), updated in 1991 and accessed 2026-10-09: identifies the fruit as *Amelanchier alnifolia*, gives Québec French `amélanche` and the English term `Saskatoon`, and restricts French `Saskatoon` to fruit from that region.
- [Canadian Food Focus, Classic Canadian Dish: Saskatoon Pie](https://canadianfoodfocus.org/food/classic-canadian-recipes-saskatoon-pie/), accessed 2026-10-09: uses `Saskatoon berry`, identifies the western species *Amelanchier alnifolia*, and documents Prairie pie use. The recipe quantities and fresh/frozen preparation remain recipe-specific.
- Canonical source IDs are `WP06-NA-CUISINE-20261009-S09` and `WP06-NA-CUISINE-20261009-S10`; full locator notes are in the [North American WP06 proposal](../../proposals/wp06-north-american-cuisine-gap-sweep-20261009.md).

After integration:

- 460 ingredient references; SHA-256
  `3f206f2889e1c178d32998675dc8d9455bec9b8bf5f7c39802c9ab5798a4149f`.
- 17 ingredient forms.
- 626 research-ledger records, 846 source entries, and 741 distinct source IDs; ledger SHA-256
  `cc795b3c40efcfd37448fbda5683f19b4ec959797f0679935641234dce3488a8`.
- 99 legacy candidates; 114 recipes and 1,123 ingredient lines. The regional proposal's manifest
  scan found no Saskatoon/amélanche recipe-line hit.

## Verification

- Bundled package and research-ledger validation passed; seed normalization and generated-index
  freshness passed at 460 references; `git diff --check` passed.
- All 9 Python package tests and all 285 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped,
  0 failures, and 0 errors. The repository deploy script installed and launched the debug app.
- English query `saskatoon berry` displayed `Saskatoon berry`. Accent-folded French query `amelanche`
  displayed `amélanche`. The blank draft was discarded; French home returned to
  `Toutes les recettes (114)`.

## Screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English `Saskatoon berry` result | [saskatoon-berry-en.png](saskatoon-berry-en.png) | `a57dae05e8b370915c73f8323fdc335e2a233208a0be93c3b4ab7648bcc65cca` |
| French `amélanche` result | [saskatoon-berry-fr-ca.png](saskatoon-berry-fr-ca.png) | `e6a07042bc4de2def87d3d2102285e3e8b3172d71fcc0c8f385e07744b07e991` |
| French library home after discarding the draft | [home-fr-ca-114.png](home-fr-ca-114.png) | `e0736bf8344b7932441b4061165ab3f01db83472d91cf462baebbcc53466a15b` |
