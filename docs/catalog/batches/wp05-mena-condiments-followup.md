# WP05 Section Y MENA and Caucasus pantry checkpoint

- Integrated: 2026-10-08; coordinator-reviewed partial acceptance of twelve identity rows from the
  MENA/Caucasus proposal: harissa, chermoula, amba, zhug, shatta, biber salçası, muhammara, rose
  syrup, pomegranate molasses, date syrup, tkemali, and ajika.
- The rows use the fixed category taxonomy and keep product families separate where sources leave
  boundaries open. Examples: harissa powder is not folded into the harissa condiment; sweet/hot
  biber salçası variants, narsharab, and tkemali remain separate boundaries; no generic chile-paste,
  pomegranate, or regional-sauce equivalences were inferred. Only source-supported aliases were
  activated.
- No ingredient forms, default densities, unit mappings, or runtime conversion rules were added.
  The OQLF's 37–40 °Bé date-syrup concentration range is not a density. The Academy of Nutrition and
  Dietetics' 1 tbsp / 15 g serving is recorded only for its own recipe-derived syrup. It also gives
  qualitative date-syrup-for-honey/maple guidance in named cooking contexts, without a ratio; that
  finding remains contextual and inactive.
- Harvard T.H. Chan's single Turkish muhammara recipe says honey can replace its pomegranate
  molasses. The ledger records that one-recipe finding without a quantity or generalized rule. No
  substitution runtime rule was added.
- The normalized-key audit found no exact collision, and scanning all 114 recipe JSON files found no
  candidate mention. No recipes changed.
- Sources include [OQLF, harissa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357796/harissa),
  [OQLF, sirop de dattes](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433496/sirop-de-dattes),
  [Academy of Nutrition and Dietetics, simple date syrup](https://www.eatright.org/recipes/desserts/simple-date-syrup-recipe),
  [Health Canada, muhammara](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/recipes/muhammara-dip-red-bell-pepper-walnut.html),
  [Harvard T.H. Chan, Turkish muhammara](https://nutritionsource.hsph.harvard.edu/turkish-muhammara/),
  [UK Government, Ajika GI specification](https://assets.publishing.service.gov.uk/media/6437e4e2db4ba9000c448e40/1_Ajika_%E1%83%90%E1%83%AF%E1%83%98%E1%83%99%E1%83%90_Other_products_of_Annex_I_of_the_Treaty__spices_etc._.pdf),
  and [Sakpatenti, Tkemali GI specification](https://www.sakpatenti.org.ge/media/publication_pdf/BL112022_eng.pdf).
- Validation: 409 references and 574 evidence records; package validation/normalization, generated
  import index, ledger schema, exact-key/recipe scan, and UTF-8 checks pass. All 9 Python package
  tests, 275 Android unit tests, `lintDebug`, and both debug APK assemblies pass. On Pixel 9a / API
  36, manual picker search `harissa` returned one English result, and accent-folded `melasse de
  grenade` returned one fr-CA result displayed as `mélasse de grenade`. Unit fixtures cover the
  accepted aliases and important non-match boundaries across the batch. Connected instrumentation
  reported 29 cases: 27 passed, 2 QA-only skips, and 0 failures. The original AVD had 403 MB free,
  so verification used `/tmp/recipebook-pixel9a-userdata.img`; the original user-data image was
  preserved. No item was selected, both blank probes were discarded, and the French home returned
  to 114 recipes.
- Screenshots: [English harissa result](pixel9a-mena-condiments-picker-en.png), SHA-256
  `d3d9181cce6224086862372239d12f049cd04a988389ed878f45e00b26c7e66e`; [fr-CA mélasse de grenade
  result](pixel9a-mena-condiments-picker-fr-ca.png), SHA-256
  `34e9452bbd1475ad7dc7a411c58cc26e27ba8459ad7dbb45258494745b299085`.
- The source packet and proposal are in `../proposals/wp05-mena-pantry-batch-20261008.md`. The
  broader Section Y sweep, recipe miss review, and independent Québec terminology review remain open.
