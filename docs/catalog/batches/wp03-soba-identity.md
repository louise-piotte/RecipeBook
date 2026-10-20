# WP03 Section G soba identity checkpoint

- Integrated: 2026-10-08; coordinator-reviewed partial acceptance of the soba proposal.
- Added `ingredient-ref-soba-noodles` as `soba noodles / nouilles de sarrasin` in
  `GRAIN_AND_CEREAL`. The only active alias is `soba` in both languages. OQLF's wider French
  phrases are documented but remain inactive to avoid claiming all buckwheat-and-wheat pasta is
  Japanese soba.
- MAFF documents wheat and egg binders and multiple product states, so this identity does not claim
  100% buckwheat or gluten-free composition. No forms were added because no bundled recipe needs
  state-specific handling.
- The ledger records USDA SR27's 114 g per source cup only as a cooked-soba portion observation.
  The source row omits cup capacity and packing/draining method; no density, active unit mapping, or
  dry/fresh conversion was activated.
- USDA ARS's dried-soba alternative is retained as a recipe-scoped finding for fresh buckwheat
  maltagliati. The target is not a canonical reference, so this remains blocked from a runtime rule.
- The repository's normalized-key audit found no exact collision, and scanning all 114 recipe JSON
  files found no candidate use. No recipe was changed.
- Sources: [OQLF, nouilles de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037421/nouilles-de-sarrasin),
  [Japan MAFF, grain products](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html),
  [USDA ARS, SR27 food group 20](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR27/reports/sr27fg20.pdf),
  and [USDA ARS, buckwheat maltagliati recipe](https://www.ars.usda.gov/ARSUserFiles/oc/AgLab/recipes/buckwheat/BuckwheatMaltagliatiBeanRagu.pdf).
- Validation: 409 references and 574 evidence records; package validation/normalization, generated
  import index, ledger schema, exact-key/recipe scan, and UTF-8 checks pass. All 9 Python package
  tests, 275 Android unit tests, `lintDebug`, and both debug APK assemblies pass. On Pixel 9a / API
  36, manual picker search `soba` returned one `soba noodles` result in English and one
  `nouilles de sarrasin` result in fr-CA. The connected instrumentation APK reported 29 cases: 27
  passed, 2 QA-only skips, and 0 failures. The original AVD had 403 MB free, so verification used
  `/tmp/recipebook-pixel9a-userdata.img`; the original user-data image was preserved. No item was
  selected, the blank probe was discarded, and the French home returned to 114 recipes.
- Screenshots: [English soba result](pixel9a-soba-picker-en.png), SHA-256
  `e3077889e47a1146e39b26f13ef8a7440431ef20bb0ff3ae75af1fb53a5633ec`; [fr-CA soba result]
  (pixel9a-soba-picker-fr-ca.png), SHA-256
  `901f3e7aed412a9dacf2cf0d17c926cb2d519dbd171d66f1f5061d66e82c1581`.
- The source packet and proposal are in `../proposals/wp03-grain-pasta-batch-20261008.md`. Broader
  Section F/G identity and independent Québec terminology review remain open.
