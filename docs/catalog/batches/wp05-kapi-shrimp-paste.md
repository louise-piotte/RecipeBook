# WP05 Southeast Asia Kapi identity checkpoint

- Integrated: 2026-10-08; coordinator-owned partial acceptance of the Kapi proposal.
- Added `ingredient-ref-kapi-shrimp-paste` with EN `kapi` and fr-CA `pâte de crevettes Kapi`. English display uses the named standard/product term only, so generic `shrimp paste` is not an active alias or search label.
- The Thai Community Product Standard TCPS 61/2561 names Kapi as shrimp paste and defines it from fermented krill and/or shrimp with salt. Canadian product listings corroborate shrimp paste (Kapi); Unilever Food Solutions Canada uses the French ingredient wording `Pâte de crevettes Kapi`.
- Keep distinct from liquid fish sauce/patis, generic shrimp paste, belacan, terasi, bagoong alamang, and sambal terasi. No alias, form, density, measurement, unit mapping, conversion, package yield, or substitution rule was added.
- Recipe-line text audit across all 114 bundled recipes found no Kapi or ube halaya mentions.
- Sources: [Thai Community Product Standard TCPS 61/2561](https://tcps.tisi.go.th/pub/tcps0061_61%28%E0%B8%81%E0%B8%B0%E0%B8%9B%E0%B8%B4%29.pdf), [Haisue, Trachang Shrimp Paste (Kapi)](https://haisue.ca/products/trachang-shrimp-paste-kapi-400g), [D.J. Distributing, Pantai Shrimp Paste (Kapi)](https://djdist.ca/PANTAI-SHRIMP-PASTE-KAPI-48X100G-p147671399), [Unilever Food Solutions Canada, Cari Vert Thaï aux Fruits de Mer](https://www.unileverfoodsolutions.ca/fr/recipe/cari-vert-thai-aux-fruits-de-mer-R0073075.html).
- Package validation, generated-index freshness, ledger schema, exact-key/recipe audits, all 9 Python
  package tests, 275 Android unit tests, lint, and both debug APK assemblies passed after the broader
  catalog merge. Connected instrumentation on the temporary Pixel 9a / API 36 profile reported 29
  cases: 27 passed, 2 QA-only skips, and 0 failures. Install to the original AVD was rejected because
  it had 403 MB free; the original user-data image was preserved. A Kapi-specific live picker search
  remains unverified.
