# WP05 Section X Lao padaek identity checkpoint

- Integrated: 2026-10-08; coordinator-reviewed partial acceptance of the padaek proposal.
- Added `ingredient-ref-padaek` as `padaek / sauce padaek`, with `pa daek` (EN) and `padek` (fr-CA)
  as the only active aliases. Category is `SAUCE_AND_CONDIMENT`.
- JIRCAS and Lao News Agency support a distinct Lao salt-fermented freshwater-fish seasoning.
  Télé-Québec supports the Québec French recipe term and spelling and separately lists padaek and
  generic fish sauce. It remains distinct from fish sauce, pla ra, Kapi, belacan, terasi, bagoong,
  prahok, and ngapi.
- The ledger records identity as verified, measurement research as having no supported value, and
  substitution research as having no supported substitute in the reviewed ordinary cooking scope.
  A source recipe's 45 mL amount is not a mass conversion. No form, density, mapping, yield, or
  runtime substitution was added.
- The normalized-key audit found no exact collision; scanning all 114 recipe JSON files found no
  padaek or related candidate mention. Existing generic fish-sauce lines were left unchanged.
- Sources: [JIRCAS, pa daek usage and fermentation](https://www.jircas.go.jp/lo/publication/jircas_working_report/90/89),
  [Lao News Agency](https://kpl.gov.la/EN/detail.aspx?id=79553),
  and [Télé-Québec Cuisinez, sai oua](https://cuisinez.telequebec.tv/recettes/8042/sai-oua-boulettes-de-porc).
- Validation: 409 references and 574 evidence records; package validation/normalization, generated
  import index, ledger schema, exact-key/recipe scan, and UTF-8 checks pass. All 9 Python package
  tests, 275 Android unit tests, `lintDebug`, and both debug APK assemblies pass. On Pixel 9a / API
  36, manual fr-CA picker search `sauce padaek` returned one localized result. The connected
  instrumentation APK reported 29 cases: 27 passed, 2 QA-only skips, and 0 failures. The original
  AVD had 403 MB free, so verification used `/tmp/recipebook-pixel9a-userdata.img`; the original
  user-data image was preserved. No item was selected, the blank probe was discarded, and the
  French home returned to 114 recipes.
- Screenshot: [fr-CA padaek result](pixel9a-padaek-picker-fr-ca.png), SHA-256
  `6231769503cb9cdd6b67bc8d2daa9b61f350140869e82b972a66414e94a3c5c8`.
- The source packet and proposal are in `../proposals/wp05-east-southeast-asian-pantry-batch-20261008.md`.
  Other Section X countries, candidates, and independent Québec terminology review remain open.
