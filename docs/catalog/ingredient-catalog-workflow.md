# Ingredient catalog workflow

This document records the integration contract for `RecipeBook-global-ingredient-catalog-plan.txt`.
The split `app/src/main/assets/seed/bundled-library/` package remains the canonical full-library
source. Research batches are reviewed here before their data is merged into that package.

## Initial verified baseline

Rechecked on 2026-10-05 at revision `0caaef8` (`main`) before implementation; the worktree was
clean at that point.

- The split seed had 229 slug IDs without explicit categories, 81 densities, and 85 unit mappings.
- The hand-maintained Kotlin import catalog had 253 IDs: 148 overlapped seed IDs, 105 were Kotlin
  only, and 81 seed IDs were absent from the Kotlin list.
- Other seed parts had 2 forms, 2 form-conversion rules, 16 contextual rules, 4 units, and 114
  recipes. Baseline package checks and the 47-second unit-test run passed.
- The full-library schema expected UUID IDs and did not match actual stable slug IDs. Numeric
  evidence and contextual scope were not validated.

## Current implementation state (2026-10-06)

- The canonical package has 347 references and 114 recipes; the current reference JSON SHA-256 is
  `e93f731b87e5b08c2fdcaa6802518d29220e0516a90ec40f4f331e1a657d8f73`. Every reference now has an explicit
  value from the existing 19-category enum; all 148 overlapping categories match the former Kotlin
  classifier. There are 0 active densities, 0 active ingredient unit mappings, 10 forms, 0 active
  form-conversion rules, 0 active contextual rules, and 30 unit definitions.
- The evidence ledger has 506 records and SHA-256
  `9fe733df985ccc10879980409f9b32ebac0d7a458d757ffc0eb974d989d1b7d5`; the fonio-flour, broken-rice,
  farro, and instant-oats candidates record product-boundary evidence without assigning active
  references or numeric data.
- The former Kotlin-only identities are preserved without unsupported numeric values in
  `docs/catalog/legacy-import-identities.v1.json` as unreviewed candidates. They do not participate
  in automatic import matching, except that the source-verified whole-wheat flour ID has now been
  restored to the canonical package and removed from the unresolved-candidate file (99 candidates
  remain). Milk chocolate, lentils, black beans, and black-eyed peas were also promoted; Lima beans
  was added as a new source-backed identity.
- `BundledIngredientCatalog.kt` is generated from canonical seed JSON. Its `--check` command passes,
  and the RecipeKeeper audit uses the canonical generated reference index.
- Both v1 schemas accept stable string IDs and the recipe-line form/alias fields. Package validation
  checks JSON Schema conformance, numeric values, reference integrity, categories, aliases, units,
  contextual scope, and reviewed evidence requirements.
- The ledger stores unit conversion sources separately. NIST factors feed the canonical unit table
  and runtime graph; no ingredient-specific numeric conversions are active.
- Ingredient lines persist selected forms, alias hints, and nullable structured package amounts in
  DTOs and Room schema v10. The editor offers explicit form selection and parses package count, type,
  declared net size/unit, and stated usable basis while retaining original text. Source-specific
  package yields are available only for a matching ingredient/form/size/product record; conflicts
  remain unavailable and unbranded matches are visibly qualified in both languages.
- Startup seeding fills missing ingredient-reference IDs only for libraries carrying the bundled
  library ID. For an existing stored catalog, it also appends missing bundled form and package-yield
  IDs while preserving same-ID edits and unrelated catalog entries; it does not refresh a separately
  imported library.
- Contextual suggestions require matching positive dish scope. Explicit links use the same checks;
  automatic suggestions exclude high-risk rules, and explicit high-risk links require both French
  and English warnings. A complete normalized bilingual form phrase can carry one matching form
  through ingredient selection; partial/ambiguous wording and a sole catalog candidate do not.
- Ingredient lookup folds accents and common ligatures while retaining displayed spellings.
- Earlier full verification passed on 2026-10-05: 186 unit tests, lint, debug and Android-test APK
  assembly, 24 of 26 connected Pixel 9a / Android 16 instrumentation tests (two existing
  environment skips), and 9 Python package tests. Package/schema normalization, generated-index,
  encoding, and diff checks passed. The current build installed and launched on the Pixel 9a AVD.
  Visual QA confirmed the bilingual ingredient-form selector is distinct from free-text preparation,
  and the live ingredient picker returned the newly added `oat flour` identity for a search.
- Broad regional/category identity review, package-aware yield modeling, and full-population
  performance benchmarking remain open. Do not treat an evidence-pending measurement or research
  candidate as an active catalog record.
- WP02 integration now has forty-nine identity-only flour/starch rows across the A–B and specialist
  wheat-flour packets: whole-wheat flour, durum flour, durum semolina, remilled durum semolina,
  whole-kernel corn flour, cornmeal, masa harina, precooked corn flour, tapioca starch, teff flour, oat flour, rice flour, white rice flour, brown
  rice flour, glutinous rice flour,
  barley flour, malted barley flour, buckwheat flour, quinoa flour, amaranth flour, chickpea flour, sorghum flour, pearl millet flour, edible
  cassava flour, edible sago flour, canna starch, potato flour, potato starch, gari, atta, maida, pastry flour,
  whole-wheat pastry flour, high-gluten flour, self-rising flour, rye flour, spelt flour, einkorn
  flour, emmer flour, Khorasan flour, wheat starch, malted wheat flour, roasted barley flour, roasted
  wheat flour, roasted wheat malt flour, roasted corn flour, generic soy flour, Kinako, and chana sattu.
  The existing edible cassava-flour reference now has the source-backed French alias `farine de manioc`;
  Codex’s canonical `farine comestible de manioc` display and the separate wet-extracted tapioca-starch
  identity remain unchanged. No generic measure, form, conversion, recipe link, or substitution was
  added; B2/B3 and regional-starch checklists remain open.
  The roasted barley row has the single English alias `toasted barley flour` and no numeric/conversion
  data. `Hattai-ko` and `mugikogashi` remain unresolved regional names. See `batches/toasted-barley-boundary-review.md`. Atta uses the same English and Québec French display name
  and only OQLF-listed aliases. Maida
  keeps its regional name in both locales and has only `maida flour` as an English alias; broad
  all-purpose terms remain on the generic identity. Durum flour is separate from durum semolina and
  remilled durum semolina; the latter also has Italian and localized remilled-product search names.
  The packets remain under review for their other
  candidates and independent bilingual sign-off. No density,
  unit mapping, package value, or substitute was added. Potato flour remains distinct from potato starch;
  the English cross-reference is not activated as an alias. The source spelling `farine d'amaranthe`
  remains documented but inactive because it can collide with a food-dye term.
- WP02 Section A7 now has four separate `GRAIN_AND_CEREAL` identities: wheat bran / `son de blé`,
  wheat germ / `germe de blé`, cracked wheat / `blé concassé`, and vital wheat gluten /
  `gluten de froment élastique`. The first three have no aliases; vital wheat gluten has the Health Canada
  French label `gluten de blé vital` as its only alias. All four have no density, unit mapping, or
  substitution data, and no bundled recipe uses their names. A7 also includes six separate
  `FLOUR_AND_STARCH` identities: wheat starch / `amidon de blé` (French alias `amidon de froment`),
  malted barley flour / `farine d'orge maltée` (English alias `malt barley flour`), malted wheat
  flour / `farine de blé maltée`, roasted barley flour / `farine d'orge torréfiée`, roasted wheat
  flour / `farine de blé torréfiée`, and roasted wheat malt flour / `farine de malt de blé torréfié`.
  Aside from the three cited aliases (wheat starch, malted barley flour, roasted barley flour), these rows have no further aliases, density, unit mappings, or substitution data, and recipe audits found no uses. Cracked wheat is distinct from bulgur/boulgour; vital wheat
  gluten is distinct from high-gluten flour; wheat starch is distinct from wheat flour, corn starch,
  wheat meal, and vital wheat gluten; malted barley flour is distinct from general barley flour;
  malted wheat flour is distinct from general/whole-wheat flour and other malted identities. Roasted
  wheat flour is a mill-named product; the manufacturer declaration supports roasted wheat malt flour
  as a separately named ingredient but does not establish its detailed process. A Québec mill's
  roasted corn flour / `farine de maïs torréfiée` is also integrated as a separate named functional
  product; its source describes heat treatment to promote gelatinization, but does not equate it with
  precooked corn flour [S86–S89, S130–S131]. These roasted rows have no numeric/conversion/yield/
  substitution data. Other grain meals, other malted/toasted flours, gluten-flour terminology, and independent bilingual review
  remain open. Wheat meal is an unresolved human-food candidate: Canadian sources distinguish it
  from wheat flour and durum semolina, but current tariff wording groups it with groats and semolina;
  no standalone Québec French name or active row is assigned [S118–S122]. See `batches/wheat-meal-identity-review.md`,
  `batches/wheat-bran-germ-identities.md`, `batches/cracked-wheat-identity.md`,
  `batches/vital-wheat-gluten-identity.md`, `batches/wheat-starch-identity.md`,
  `batches/malted-barley-flour-identity.md`, `batches/malted-wheat-flour-identity.md`,
  `batches/roasted-wheat-flours-identity.md`, and `batches/roasted-corn-flour-identity.md`.
- WP07's second measurement review found no source-qualified g/mL or mapping value that meets the
  activation bar. Two granulated-sugar portion observations (USDA SR28, 200 g per source cup; King
  Arthur, 198 g per source cup) are now retained separately in the ledger. Cup convention and filling
  methods remain unresolved against the app's U.S. cup; neither is an active conversion. See
  `batches/common-baking-measurements.md`.
- WP08's evidence ledger now records source-supported cornstarch sauce-thickening, baking soda to
  baking powder, and aquafaba findings as blocked for automatic use. A dried-to-cooked chickpea yield
  range remains packet-only pending its own source and measurement review; interval support in the
  ledger does not by itself qualify that observation. No substitution arrays are active. See
  `batches/baking-substitutions.md`.
- WP03 grain/cereal, legume/pulse, and root/tuber identity research and WP04 protein/dairy identity
  research are under review. Forty-six source-backed WP03 Section F grain identities, four Section H pulse
  identities, five root/tuber identities, and two WP04 identities (cheese curds and skim milk) are
  integrated with bilingual displays. The four new pulse rows have no aliases, forms, or numeric
  data. Milk chocolate is integrated as a distinct Section D identity with source-backed
  English/French chip aliases; recipe 067 links to it and preserves its chips preparation hint. The
  combined milk-and-dark-chocolate recipe line remains unresolved. See
  `batches/chocolate-confectionery-identities.md`, `batches/plant-legumes-pulses.md`, and `batches/millet-amaranth-grains.md`.
  WP04 also removed the broad ground-beef alias, updated the Québec French calamari
  and sour-cream displays, removed a full-fat sour-cream alias, and removed 2%/skim milk aliases from
  standard milk. The Alfredo skim-milk recipe line now references skim milk directly. Wider Section
  F/H and O-R/V coverage and independent bilingual sign-off remain open.
- Earlier seed audit corrections made the quinoa display explicitly `cooked quinoa`, removed generic
  `rice` / `riz` aliases from cooked rice, and removed the unverified `instant oats` alias from quick
  oats. Later WP03 checkpoints applied the identity/form contract to rice and quinoa and promoted
  instant oats as a separate identity; do not restore it as a quick-oats alias.
- WP02 A1 verification checkpoint on 2026-10-05: 190 Android unit tests, 9 Python package
  tests, seed normalization, package validation/normalization, generated-index freshness, encoding
  audit, and `git diff --check`. The deployment script's full `test` task and debug assembly passed,
  and the build installed and launched on the Pixel 9a AVD. Clean-seed picker QA returned `basmati
  rice`, resolved `fromage en grains` to `cheese curds`, returned `grain sorghum`, matched unaccented
  `orge monde` to `hulled barley`, and returned no result for `instant oats`. WP04 clean-store checks
  returned `skim milk` for `lait ecreme`, showed no result for `lait 2`, returned `sour cream` for
  `creme sure`, and showed no result for `creme sure entiere`. The emulator's prior app data was
  backed up and restored; the restored home screen showed the existing 114-recipe library. The
  restored pre-change database still returns its previously stored `instant oats` alias for quick
  oats because insert-only refresh preserves existing reference rows. The same refresh policy keeps
  pre-change display names and aliases on existing WP04 rows while adding the new skim-milk ID;
  clean-store checks above validate the canonical seed. No draft-data migration was added.
- WP02 A2 atta verification checkpoint on 2026-10-06: the package had 298 references and the evidence ledger had
  448 records. All 201 Android unit tests and 9 Python package tests passed; package normalization,
  validation, generated-index freshness, ledger schema validation, alias-collision checks,
  UTF-8/no-BOM checks, and `git diff --check` passed. Pixel 9a / Android 16 instrumentation completed
  26 tests with 24 passes, no failures/errors, and two existing environment skips. The deploy script's
  `test` and debug assembly tasks passed and installed/launched the build. Picker searches `atta` and
  `farine a chapati` each returned only atta. The temporary probe was discarded and the library
  remained at 114 recipes. See `batches/atta-identity.md` for screenshots and source decisions.
- WP02 A2 Maida verification checkpoint on 2026-10-06: the canonical package has 299 references
  (SHA-256 `d94c76ea2cf452183236fbf767e7b49d0e2b00173a0051143bf2b881ecd981bc`) and the evidence
  ledger has 449 records. All 201 Android unit tests and 9 Python package tests passed; package and
  reference normalization, validation, generated-index freshness, ledger validation, alias-collision
  checks, UTF-8/no-BOM checks across 124 bundled JSON files, and `git diff --check` passed. Connected
  Pixel 9a / Android 16 instrumentation reported 26 cases with 24 passes, zero failures/errors, and
  two environment-gated skips. The deploy script's `test` and debug assembly tasks passed and installed
  and launched the build. Live picker searches `maida` and `maida flour` returned only Maida; `all
  purpose flour` and `farine tout usage` returned only generic all-purpose flour. The empty probe was
  discarded and the library remained at 114 recipes. See `batches/maida-identity.md` for screenshots
  and source decisions.
- WP02 A2 semola rimacinata verification checkpoint on 2026-10-06: the canonical package has 300
  references (SHA-256 `bc7ce9524ac3fc09359137bd38e1cb5deed64a0683e1d07f9c3db93812926f2d`) and the
  evidence ledger has 450 records. Unit/instrumentation, Python package, normalization, validation,
  generated-index, ledger, alias-collision, encoding, and diff checks passed; results are in
  `batches/semola-rimacinata-identity.md`. Live picker queries `semola rimacinata` and
  `semolina rimacinata` returned only remilled durum semolina; `semolina` showed the ordinary and
  remilled identities separately; `remoulue` returned only the remilled identity. Screenshots and the
  restored 114-recipe home state are recorded in the packet.
- WP02 A2 durum flour verification checkpoint on 2026-10-06: the canonical package has 301 references
  (SHA-256 `860d7e7f37b6fbe825d0fc2739a59e951975451a49f02c99872b376b82618e23`) and the evidence ledger has
  451 records (SHA-256 `cb1de9ade9d699be3231335d1a0524d9949b062cbf356c4a0d15aafe0fb73aff`). All 201 Android
  unit tests and 9 Python package tests passed; package/reference normalization, validation,
  generated-index freshness, ledger schema, alias-collision, UTF-8/no-BOM, and diff checks passed.
  Connected Pixel 9a / Android 16 instrumentation reported 26 cases with 24 passes, zero
  failures/errors, and two environment-gated skips. The deploy script's test and debug assembly tasks
  passed and installed/launched the APK. Picker queries `durum flour` and `durum wheat flour` each
  returned only durum flour; `durum` showed separate durum flour, durum semolina, and remilled durum
  semolina rows. The unsaved probe was dismissed and the home list still showed 114 recipes. See
  `batches/durum-flour-identity.md` for screenshots and evidence.
- WP02 A4 rye-flour verification checkpoint on 2026-10-06: the canonical package has 302 references
  (SHA-256 `f3b10cbe28cee065a339bc215e617a0217322d451d4e24dc6cf370cad3063a41`) and the evidence ledger
  has 452 records (SHA-256 `4281b713779da258a08b98ea7a83d220f17ab713c6bb324c03aaa765897feacb`). All 201 Android unit tests and 9 Python package tests
  passed; package/reference normalization, validation, generated-index freshness, ledger schema,
  alias-collision, UTF-8/no-BOM, and diff checks passed. Connected Pixel 9a / Android 16
  instrumentation reported 26 cases with 24 passes, zero failures/errors, and two environment-gated
  skips. The deploy script's test and debug assembly tasks installed and launched the APK. Live
  picker queries `rye flour` and `farine de seigle` each returned only rye flour; the unsaved probe
  was dismissed and the home list still showed 114 recipes. See `batches/rye-flour-identity.md` for
  screenshots and evidence.
- WP02 A4 spelt-flour verification checkpoint on 2026-10-06: the canonical package has 303 references
  (SHA-256 `1743e36345c4dde1fb95bc465b1723fc1093fcff70be041fb0966859a85457c2`) and the evidence ledger
  has 453 records (SHA-256 `4af722d2d01fb0bb9eeb06a3b29590354bed5e91fb8e996e5c2c0632b83c0444`). All 201 unit
  tests and 9 Python package tests passed; package/reference normalization, validation, generated-index
  freshness, ledger schema, alias-collision, UTF-8/no-BOM, and diff checks passed. Connected Pixel 9a /
  Android 16 instrumentation reported 26 cases with 24 passes, zero failures/errors, and two
  environment-gated skips. Live picker searches `spelt flour` and the accent-folded `farine d epeautre`
  each returned only spelt flour; the unsaved probe was dismissed and the home list remained at 114
  recipes. See `batches/spelt-flour-identity.md` for screenshots and evidence.
- WP02 A4 einkorn-flour verification checkpoint on 2026-10-06: the canonical package has 304 references
  (SHA-256 `f0b792cdfb055438274a3b528f0c38aa610be4a2b3944a22692f8141396d21f5`) and the evidence ledger
  has 454 records (SHA-256 `52d0fc25759ec034cde8a97f3fd62508207cd562b3ed5bd3ee1e1ec397db4e0c`). All 201 unit
  tests and 9 Python package tests passed; package/reference normalization, validation, generated-index
  freshness, ledger schema, alias-collision, UTF-8/no-BOM, and diff checks passed. Connected Pixel 9a /
  Android 16 instrumentation reported 26 cases with 24 passes, zero failures/errors, and two
  environment-gated skips. The deploy script's tests and debug assembly passed and the APK installed
  and launched. Live searches `einkorn flour` and accent-folded `farine de petit epeautre` each
  returned only einkorn flour; generic `epeautre` returned both einkorn and spelt flour. The unsaved
  probe was dismissed and the home list remained at 114 recipes. Screenshots and details are in
  `batches/einkorn-flour-identity.md`.
- WP02 A4 emmer-flour verification checkpoint on 2026-10-06: the canonical package has 305 references
  (SHA-256 `4f5c15ddb40e85dfc543af264c43062668ce5419313843862fd798e75df86145`) and the evidence ledger
  has 455 records (SHA-256 `dc9d0b657bc13cc83d5b627ec3e1318a86e243ef13e61034550b078f478d1697`). All 201
  unit tests and 9 Python package tests passed; package/reference normalization, validation,
  generated-index freshness, ledger schema, alias-collision, UTF-8/no-BOM, and diff checks passed.
  Connected Pixel 9a / Android 16 instrumentation reported 26 cases with 24 passes, zero
  failures/errors, and two environment-gated skips. The deploy script installed and launched the
  build. Live searches `emmer flour` and `farine d amidonnier` each returned only emmer flour;
  unqualified `farro` had no flour result. The unsaved probe was discarded and the home list remained
  at 114 recipes. See `batches/emmer-flour-identity.md`.
- WP02 A4 Khorasan-flour verification checkpoint on 2026-10-06: the canonical package has 306 references
  (SHA-256 `0259a6499ee6bac49dec93431ea5c6833fba935a486a3dbd818fe98e0ea12f4c`) and the evidence ledger
  has 456 records (SHA-256 `a9787d308e06fc4bdcbd95314397843421ea3d2d75f1da413dbd07481813e7d8`). All 201
  unit tests and 9 Python package tests passed; reference/package normalization, validation,
  generated-index freshness, ledger schema, alias-collision, UTF-8/no-BOM, and diff checks passed.
  Connected Pixel 9a / Android 16 instrumentation reported 26 tests with 24 passes, zero
  failures/errors, and two environment-gated skips. The deploy script installed and launched the
  build. Live picker searches `khorasan flour` and `farine de khorasan` each returned only Khorasan
  flour; `kamut` returned no Khorasan result. The unsaved probe was discarded and the home list stayed
  at 114 recipes. Screenshots and details are in `batches/khorasan-flour-identity.md`.
- WP02 A4 barley-flour integration checkpoint on 2026-10-06: the canonical package has 307 references
  (SHA-256 `392b68395d123e68ecb4ef369adc590929f5f67a57dc85b4b6541c66b09a8835`) and the evidence ledger
  has 457 records (SHA-256 `e868ad32a7e519d47f8fce8af5d50795699a9571f12d3539d0e7ca815ade3874`).
  The identity-only row is integrated and the recipe audit found no existing barley-flour line. All
  201 unit tests and 9 Python package tests passed. Pixel 9a / Android 16 instrumentation reported 26
  tests with 24 passes, zero failures/errors, and two environment-gated skips. Reference/package
  normalization and validation, generated-catalog freshness, ledger-schema and alias-collision,
  UTF-8/no-BOM, and diff checks passed. The deploy script installed and launched on a temporary
  8 GB Pixel 9a profile after the original 6 GB AVD reported insufficient storage; its data was
  preserved. Live searches `barley flour` and `farine d'orge` each returned only barley flour;
  `malt barley flour` returned no result. The unsaved probe was discarded and the home list remained
  at 114 recipes. See `batches/barley-flour-identity.md` for screenshots and evidence.
- WP02 A4/B5 glutinous-rice-flour verification checkpoint on 2026-10-06: the canonical package has
  308 references (SHA-256 `db2c505e090df9d45c641bb899d20b7c4da0f109e238bb3fc5433bedffaabcdb`) and the
  research ledger has 458 records (SHA-256 `c4a9a5c70d72a144aae538dfd5ba4a8725a142c87d02524e063722d22611098e`).
  The new identity is distinct from ordinary rice flour and glutinous rice grain, with only the
  manufacturer-supported English aliases `sweet rice flour` and `sweet rice powder`. The recipe
  audit found no use. All 202 Android unit tests, 9 Python package tests, and API 36 instrumentation
  (24 passed, two skipped, zero failed/errors) passed; the deploy script installed and launched on the
  Pixel 9a. Exact English/alias searches, the French query, separation from ordinary rice flour, and
  exclusion of `mochiko` / `shiratamako` from the generic row were checked live. The 2026-10-11
  follow-up added Mochiko and Shiratamako as separate identity-only products, without generic aliases
  or numeric behavior; their Québec displays remain pending independent bilingual approval. The unsaved probe was discarded and the
  home list remained at 114. Package normalization/validation, generated-catalog freshness,
  UTF-8/no-BOM review, and diff checks passed. See `batches/glutinous-rice-flour-identity.md` for
  retained screenshots. Independent bilingual review, native Japanese product naming, measurement,
  and substitution work remain open.
- WP02 A4 white/brown rice-flour source-grade integration checkpoint on 2026-10-06: added distinct
  white- and brown-rice flour references while retaining unqualified `rice flour` as the family
  entry. OQLF describes the family as originating from either white or brown rice; Canadian mill
  listings carry separate English and French products, and USA Rice documents the bran-retention
  distinction [S27, S77–S80]. The final package has 310 references (SHA-256
  `40c44054cc34f1aa277e8f885b89ae2e8e7c472080b5ff1eb3cc18243af7bfaa`) and the research ledger has
  460 records (SHA-256 `454d4fac42ce4e8663ffbcfb93a5a539c80ed13294a2bb08f6a1ef4e6a33b37e`). All 203
  unit tests and 9 Python package tests passed; Pixel 9a instrumentation had 24 passes, two expected
  isolated-QA-package skips, and zero failures/errors. English and French family/grade searches
  returned distinct results in the live picker, and the discarded probe left 114 recipes. Package,
  generated-catalog, encoding, and diff checks passed. Screenshots and verification details are in
  `batches/rice-flour-source-grades.md`. Independent bilingual review, measurements, substitutions,
  and remaining A4 distinctions remain open.
- WP02 A5 masa-harina integration checkpoint on 2026-10-06: added `masa harina` / `farine de maïs
  nixtamalisée` as a separate nixtamalized-maize-flour identity. It remains distinct from cornmeal,
  whole-kernel corn flour, cornstarch, and precooked refined maize flour; no aliases or numeric data
  were added. The 114-recipe audit found no related ingredient line. The package now has 311
  references (SHA-256 `56c251d1724ac379d1686c39d08eb23b8905f7e83a98f6cea844881a9d7963eb`) and the ledger
  has 461 records (SHA-256 `0bb072965e15711c6d608fcbf559e22fca7f4e69b17a59b47fe317bcd17fd8e3`). All
  204 unit tests and 9 Python package tests passed; API 36 Pixel 9a instrumentation reported 24
  passes, two QA-gated skips, and zero failures/errors. The deploy script installed/launched the app
  on a temporary 8 GB Pixel 9a profile after the original AVD reported insufficient storage. Live
  English and Québec French searches returned the exact `masa harina` and
  `farine de maïs nixtamalisée` results; the discarded draft left the home list at 114 recipes.
  Reference/package checks, generated-catalog freshness, UTF-8/no-BOM review, and diff checks passed.
  Screenshots and package hashes are recorded in `batches/masa-harina-identity.md`. The subsequent
  corn-flour naming and cornmeal-grind review is recorded below. Independent bilingual approval for
  the maize-flour identities, measurements, substitutions, and broader catalog work remains open.
- WP02 A5 precooked-corn-flour integration checkpoint on 2026-10-06: added `precooked corn flour` /
  `farine de maïs précuite` as a separate precooked maize-flour identity. The technical review
  distinguishes it from dehydrated nixtamalized flour; P.A.N. documents its product as 100% pre-cooked
  white corn flour, and a Montréal supplier uses the exact French name [S85–S87]. No aliases, brand or
  color qualifiers, density, mappings, conversions, or substitutions were added. All 114 recipe files
  were audited with no matching ingredient line. The final package has 312 references (SHA-256
  `21fd07b36a70bd1ced76cb8d2c8f2e575c434cac7557fc1dd2eb95539d3b1b19`) and the research ledger has
  462 records (SHA-256 `a39870dff7b9654050be71cbf292fcf05d35437ff7a2133bc583d3170191fe43`). Unit and
  package tests pass; Pixel 9a instrumentation, deployment, and live bilingual picker evidence are
  recorded in `batches/precooked-maize-flour-identity.md`. Generic corn-flour naming, cornmeal-grind
  review is completed in the following checkpoint. Independent bilingual approval, measurements,
  substitutions, and broader catalog work remain open.

- WP02 A5 corn-flour disambiguation checkpoint on 2026-10-06: removed the unqualified `corn flour`
  alias from cornstarch because OQLF documents the regional collision with whole-kernel maize flour.
  Fine, medium, and coarse cornmeal remain grind descriptors under one identity. No ingredient line
  in the 114 bundled recipe files used the removed alias; the 312-reference count and 37 flour/starch
  identity count are unchanged. The final reference JSON SHA-256 is
  `5d933e22f2fb78b28a64e86c6a86ba48467cfc9919a07cc62e8dce9be632e82d`; the 462-record evidence ledger
  SHA-256 is `e3dce6d0df1b8b1df4aaac5e6859d908df49e9ef45facf65f7c399743c71c56a`. Unit, package,
  instrumentation, deploy, and live bilingual picker verification passed; exact-key lookup remains
  unassigned while substring search shows qualified flour results. Screenshots and details are in
  `batches/corn-flour-disambiguation.md`. Independent bilingual review, measurements, substitutions,
  and broader catalog work remain open.

- WP02 A6 teff-flour checkpoint on 2026-10-06: added `ingredient-ref-teff-flour` as `teff flour` /
  `farine de teff`, supported by a manufacturer product page and Québec French-market product wording.
  OQLF records `tef` as a recommended but non-current spelling; neither `tef` nor bare `teff` is an
  active flour alias. No aliases or numeric data were added. The 114-recipe audit found no related
  ingredient line. See `batches/teff-flour-identity.md` for final package hashes, tests, deploy, and
  Pixel 9a screenshots. Independent bilingual review and broader A6 work remain open.

## Identity and batch contract

- **Identity** is a distinct food a recipe may request whose culinary behavior or interpretation is
  meaningfully different. Keep existing IDs stable. New IDs use stable ASCII slugs and are never
  regenerated from editable display labels.
- **Variant/form** is a preparation state of the same base ingredient when recipes need to retain
  that state for matching, measurement, or directional form conversion. Do not make the full
  ingredient-by-preparation Cartesian product.
- **Alias** is a vetted synonym, regional name, spelling, or transliteration for the same identity.
  Do not use aliases to erase meaningful qualifiers such as drained, dried, sweetened, ground, or
  chocolate type. Ambiguous aliases stay unresolved until disambiguated.
- **Compound ingredient** is a prepared food a recipe can request directly, such as a sauce, blend,
  filling, or commercial mixture. Preserve materially different formulations.
- Every accepted identity has English and Québec French display names, one of the existing 19
  `IngredientCategory` values, and collision-reviewed aliases. Category subtypes, cuisine, original
  script, scientific names, and provenance belong in research artifacts unless the v1 schema is
  deliberately extended.
- Identity, measurement, and substitution are independent. A missing numeric value stays absent;
  no default density, category average, source, ratio, yield, or safety claim may be inferred.
- Each batch names its owner/reviewer, exact source revision, scope, sources, accepted and rejected
  candidates, ambiguity decisions, validation results, and remaining work. Researchers edit only
  their own batch files; the integration owner controls IDs, shared schema/runtime files, seed merges,
  and final acceptance.

## Evidence states

The sidecar research ledger is keyed by stable ingredient, form, rule, unit, or package-relation IDs.
An empty source list means evidence has not been collected; existing seed numbers are not thereby
verified.

- Identity: `unreviewed`, `verified`, `needs_clarification`, `merged`, or `rejected`.
- Measurement: `not_yet_researched`, `researched_supported`, `researched_no_supported_value`,
  `existing_value_needs_source_review`, or `blocked_pending_evidence`.
- Substitution: `not_yet_researched`, `researched_supported`,
  `researched_no_supported_substitute`, or `blocked_pending_evidence`.
- Numeric observations record their exact unit, food state, method/basis, source locator, access date,
  and any calculation. A measurement observation is exactly one scalar (`value` + `valueUnit`) or a
  non-empty `valueIntervals` array; keep each reported interval's unit, source text/precision,
  endpoint semantics, interval kind, and origin. Do not infer a midpoint or convert co-reported
  ranges. For `count_weight`, interval result units are mass, while `sourceQuantity` retains the item
  count and preparation basis. Keep conflicting observations separate unless evidence justifies a
  selection.
- Substitutions are directional and context-qualified. Existing rules require review before they can
  be described as verified. Safety-sensitive preservation, allergy, and infant-feeding contexts do
  not receive generic equivalence suggestions.

## Repository implementation decisions

1. The split bundled JSON package is the source of truth for the shipped catalog and full-library
   interchange. Generate the import audit's Kotlin index from canonical reference JSON; keep
   unreviewed legacy-only records outside automatic matching.
2. Keep all current seed IDs as strings in v1. Reconcile the schema to actual stable IDs instead of
   rewriting identities or recipe references to UUIDs.
3. Add explicit categories from the existing 19-value enum. Do not infer a broad category from a
   density, alias, or approximate search match.
4. Persist explicitly selected forms and personal alias hints in ingredient lines. Do not infer a form
   from raw text or a single candidate; retain original text and hints for deliberate matching.
5. Conversion paths are unit-normalized, scope-qualified, bounded, deterministic, and rejected when
   paths materially disagree. Package conversions remain inactive pending package modeling.
6. Explicitly linked substitutions go through the same contextual checks as automatic candidates;
   high-risk rules are not ordinary automatic suggestions.
7. Package contents and drained/usable yield are source-specific relationships. They are not generic
   count units and cannot be represented by a note or a universal can factor.
8. Keep evidence and research state in a stable-ID sidecar unless all v1 DTOs, mappers, schema,
   examples, seed-package parts, persistence, and documentation can be changed together without
   introducing unsupported fields.
9. Existing-user catalog refresh must be additive and preserve saved recipes, custom references,
   favorites, and edited catalog values. Full-library replace/import is not a catalog-refresh path.
10. Search normalization folds accents and common ligatures for lookup while preserving displayed
    spellings. Conflicting normalized aliases must be rejected or explicitly disambiguated.

## Current packet record

| Packet | Owner | Status | Scope / current result | Next action |
| --- | --- | --- | --- | --- |
| WP00 | integration lead | in_progress | Repository audit, runtime safeguards, insert-only refresh, automated checks, and Pixel 9a verification are complete. Current state is above. | Continue global identity review; resolve package-yield modeling and intended-scale benchmarking. |
| WP01 | integration lead | done | Identity/evidence states, shared-file ownership, and the stable-ID sidecar contract are defined and schema-validated. | Start independent research batches; implement collision/reconciliation checks during WP10. |
| WP02 | baking catalog researcher + integration lead | in_progress | Ten Italian/French regional wheat-flour class references and the earlier A/B flour/starch products remain integrated as identity-only rows. The 2026-10-11 A/B follow-up removed process-qualified `farine tout usage non blanchie` from generic all-purpose flour, retained five source-specific AP measurement observations, and added light rye flour and defatted coconut flour after independent Québec wording review. The 2026-10-12 Section B follow-up added the OQLF-supported `farine de manioc` alias to edible cassava flour while retaining the Codex display and separate tapioca starch; no generic measurements or substitutions were added. Medium/dark rye grades and broad coconut flour remain unresolved. Section E includes 22 identity-only gelling/hydrocolloid references and five presentation forms. Mochiko and Shiratamako remain separate identities; roasted/precooked products, further pectin inventory, and other bilingual review remain open. No new A/B measurements became active mappings or substitutions. See `batches/wp02-a-b-residual-flour-boundaries-integration-20261011/README.md`, `batches/baking-flours-starches.md`, `batches/wp02-section-e-gelling-hydrocolloid-identity-integration-20261011/README.md`, and `batches/wp02-wp07-wp08-flour-egg-evidence-integration-20261010/README.md`. | R624/R628/R631 added product- and recipe-specific wheat-germ, wheat-bran, and Scottish-oatmeal portions to existing ledger rows; conflicting portions did not activate density or mappings. Continue reviewing unmerged candidates and retain unresolved alias/product-class boundaries. R635 added five product-label, chart, and formula-specific durum-semolina observations to the existing ledger row; no active measure, density, mapping, recipe link, or substitution was added. R638 added one retailer-transcribed 1/4 cup dry (48 g) label portion for Shiloh Farms barley grits UPC 047593213110; the active reference and substitution state remain unchanged. R640 recorded Anson Mills' 1½ cups (8 ounces) of its Ancient Emmer Semolina in one Gnocchi alla Romana formula on the existing ledger row; no reusable measure, density, mapping, or substitution was activated. |
| WP03 | plant foods research + integration lead | in_progress | Grain/cereal, legumes/pulses, root/tuber, allium, and regional roots/shoots packets are in review. Section F identities and eighteen new Section J identities are integrated; the existing carrot row is source-reviewed. Arborio, Carnaroli, Bomba, Calrose, long-grain rice, medium-grain rice, short-grain rice, brown rice, `buckwheat groats, roasted, dry`, parboiled rice, broken rice / `riz en brisures`, rye, wheat berries, steel-cut oats, oat groats, emmer, freekeh, teff grain, triticale, instant oats, puffed rice, flattened rice (poha), scoped crispy rice cereal, separate white and black fonio, foxtail millet / `millet d'Italie`, and common millet / `millet commun`, Job's tears / `larme-de-Job`, and finger millet / `éleusine cultivée` identities are integrated. Brown rice has only the OQLF-supported `hulled rice` and `riz cargo` aliases. Generic millet and edible-seed amaranth remain separate from pearl millet and amaranth flour; foxtail and common millet are species-qualified identities with no generic French aliases. Generic rice, quinoa, and oat bran have dry/cooked forms; triticale grain is distinct from wheat, rye, and flour; teff grain is distinct from teff flour. The roasted dry groats identity remains separate from prepared *kacha / kasha*, and its French display awaits independent Québec review. Broken rice has no aliases or numeric/form data; generic sushi rice and other grain products remain unresolved; pot barley is integrated as `pot barley / orge en pot`, with independent Québec display approval still open. New identity rows have no unsupported aliases or numeric data. Section M includes a crushed-pineapple form linked to recipe 053#14 and a mashed-ripe-banana form linked only to recipe 073#10; fruit package-state, drained-volume, ripeness-threshold, and measurement behavior remain unspecified. Section H now has a dried adzuki form linked only to recipe 004#1; Section I verified generic nuts for 031#4, linked peanuts in 090#17, and recorded recipe 114#20's pecan cup/mass pair as ledger-only evidence. Wider H/I coverage remains open.  R629 corrected the existing jalapeño French display to OQLF-preferred `piment jalapeno`, added the regular plural alias `jalapenos`, and added one fresh-market form. R632 added the English plural alias `serrano peppers` and a fresh-market form under the existing Serrano identity; it preserved the source-specific count and left recipe 066 unlinked because the line does not state fresh. R636 added a fresh-market form to the existing verified Scotch Bonnet pepper identity, with no aliases, measurements, recipe link, or substitution; the separate sauce row remains unchanged. R639 added the source-named ají limo pepper culinary grouping, PROMPERÚ’s `limo chili` alias, and a fresh-market form; the species and ají limón boundaries remain explicit. R642 added source-named ají charapita pepper / piment Charapita with one fresh form and the PROMPERÚ `charapita chili` alias; species and cultivar remain unassigned, and the French display is provisional from Québec seed-product wording.| Continue Section F and Section H review, then proceed with remaining roots, herbs, fungi, nuts, produce, and regional sweeps. |
| WP04 | protein/dairy research + integration lead | in_progress | Protein/dairy packet is in review. Cheese curds / fromage en grains and skim milk / lait écrémé are merged as two identity-only rows; the other O-R/V coverage remains open. The generic salmon and tuna recipe identities remain broad; species-specific splits are documented as unresolved because neither recipe identifies a taxon. The generic cockle/coque identity is held as an unresolved candidate because CFIA assigns its French label to two species and current products omit the binomial. Unqualified eel / anguille is also held unresolved: CFIA applies the bilingual label to multiple species, while OQLF scopes the Québec fish term to American eel; the existing species row and query behavior remain unchanged.  R630 added the species-scoped *Sparus aurata* reference `gilthead bream / dorade royale` with only OQLF’s `gilthead sea bream` alias; the R604 multi-species groups remain separate. R633 reviewed *Seriola rivoliana* and kept it outside active data because no distinct bilingual Québec-facing display is supported. R637 added identity-only Northern searobin / grondin for *Prionotus carolinus*, supported by OQLF species-specific Québec fish-product terminology and DFO species naming; no aliases, forms, measures, recipe links, or substitutions were added, and measurement/substitution research remain open. R641 added identity-only Bowfin / poisson-castor for *Amia calva*, with only `Bow Fin` as an English alias and no forms or numeric behavior.| Review named cuts, preservation, fat/function, and Canadian French labels before further integration. |
| WP05-WP06 | assigned by scope | in_progress | Pantry/compound coverage and independent cuisine sweeps are underway. WP05 now includes Québec cretons, fruit ketchup, green-tomato ketchup, maple butter, maple taffy, and six Section W identities: sweet bean sauce, tonkatsu sauce, okonomi sauce, gochugaru, zha cai, and Yibin ya cai. Section X adds identity-only Thai yellow, Panang, and Massaman curry pastes, nam prik pao, and pla ra; the red-paste boundary review is complete, with its ownership held pending recipe 095 source provenance or owner confirmation. Section V adds rum/rhum, whisky/whiskey, vodka, and grappa identities; generic eau-de-vie and generic liqueur/cordial remain held. Five source-specific juice identities have bounded same-fruit reconstituted aliases; residual acidic-juice product boundaries are reviewed and held where no exact recipe demand exists. The acid-concentration audit found no product-specific acidity or preservation evidence in the 15 recipe rows; the safety checklist remains open for exact product/application evidence. Generic juice, nectar, and concentrates remain held. The cooking-wine boundary review keeps salted wine and mirin-style sweet-seasoning products distinct from plain wine/mirin, but inactive until recipe demand. Section Z now includes identity-only `fruit mostarda / mostarda`, with provisional borrowed Québec French wording and no broad mustard alias; broader maple products, preserved foods, and regional cuisines remain open. | Recover recipe 095 source provenance or obtain owner confirmation before changing the red-paste scope; obtain exact acidity/application evidence before setting product constraints or preservation suitability; proceed with independent cuisine sweeps and keep the overall checklist open. |
| WP07 | measurement researcher + integration lead | in_review | Source-qualified CNF/USDA egg count-to-edible-mass observations are recorded for whole eggs (13 observations), whites (5), and yolks (5); conflicting source portions remain distinct, with no active egg mapping or density. Prior sugar observations also remain source-limited. R721 added historical CNF 2015 Food Code 422 olive-oil portions as ledger-only evidence; measurement remains blocked pending current CNF 2026 and source/app unit-convention review. See `batches/wp02-wp07-wp08-flour-egg-evidence-integration-20261010/README.md` and `batches/common-baking-measurements.md`. | Retrieve readable FDC egg portion details and independent sample variability; resolve source/app unit compatibility and research broader forms. |
| WP08 | substitution researcher + integration lead | in_review | Twelve contextual wheat-flour findings are recorded in the ledger: narrow tested directions, compound replacements, and bounded no-supported cases. None are active runtime rules because recipe context, quantity basis, adjustments, and compound ingredients are not fully representable. Existing thickener, leavener, and aquafaba findings remain separately scoped. See `batches/wp02-wp07-wp08-flour-egg-evidence-integration-20261010/README.md` and `batches/baking-substitutions.md`. | Review remaining high-value substitutions; preserve directional limits and keep unsupported contexts unavailable until the model can represent them. |
| WP09 | integration lead | in_progress | Accent/ligature search folding is implemented; catalog translation coverage remains under review. | Continue bilingual review with accepted identity batches. |
| WP10 | integration lead | in_progress | Schema, generation, validation, selected forms, unit graph, resolver safeguards, insert-only reference refresh, and final automated/device checks are complete. | Continue reviewed data batches; retain benchmark/package modeling as open gates. |
| WP11 | integration lead | in_progress | Automated checks and Pixel 9a visual QA passed; independent review and global coverage audit remain. | Review accepted batches and run the final intended-scale audit after WP02-WP06 and WP12 progress. |
| WP12 | integration lead | in_progress | Structured package amounts persist in schema v1 and nullable Room JSON; the split package-yield catalog and resolver keep net contents and drained mass distinct. R627 aligns English `can`/`tin` and French `boîte(s) de conserve` aliases across free-text and unit fields. R634 scales the stored package count in recipe detail while preserving declared size, qualifiers, packing medium, requested basis, and original text; reset returns to the stored amount. The focused recipe-detail unit class passed 21 tests and the Pixel 9a Android 16 package-yield interaction class passed 3 tests. Manual APK install and launch succeeded after the deploy script stopped at 11 catalog/picker failures in the 431-test unit gate. Inverse package counts remain unavailable, and the full connected regression remains open. See `batches/package-yield-wp12.md` and the R634 README. | Keep inverse counts unavailable without a supported path; rerun the broader gates after catalog/picker failures are resolved. |

- Follow-up WP02 integration added sorghum flour, pearl millet flour, edible cassava flour, and edible
  sago flour with Codex-backed product names. All four have no aliases, density, unit mapping, form,
  or substitution data. Cassava flour remains distinct from tapioca starch; edible sago flour remains
  distinct from cassava products regionally called sago. WP02 remains in review.

- Follow-up WP02 verification on 2026-10-05: 190 Android unit tests and all 9 Python seed-package
  tests passed. The ingredient-only normalizer, full-package validation/normalization, generated
  catalog check, ledger JSON Schema validation, and diff check passed. The Pixel 9a build installed
  and launched with the existing 114-recipe library. The live picker returned `sorghum flour` for
  an English query and `edible cassava flour` for the French query `farine comestible de manioc`;
  the unsaved probe recipe was discarded without changing the recipe count.

- Second follow-up WP02 verification on 2026-10-05 (historical 260-reference checkpoint): the potato flour, potato starch, and gari rows
  bring the package to 260 references (SHA-256 `44706b444c38f859cd91497c6811c7c7dce957825b9def75dccf6ce8ddf6d759`).
  All 190 Android unit tests and all 9 Python package tests passed; seed normalization, package
  validation, generated-index freshness, ledger schema validation, and diff checks passed. The app
  installed and launched on the Pixel 9a AVD with 114 recipes. The live picker returned `potato flour`
  and `potato starch`; the unsaved probe was discarded without adding a recipe. Gari is covered by the
  catalog test but was not separately searched in this UI pass.

- First-tranche WP03 root/tuber integration on 2026-10-05 added celeriac, parsnip, Jerusalem artichoke, rutabaga,
  and turnip as five identity-only rows. OQLF-backed Québec names and conservative alias boundaries
  are recorded in `batches/plant-roots-tubers.md`. The current reference file has 265 records and
  SHA-256 `5c7cde95739576a1d58afb6f87a5822cfd99d6c1cddc4ed6e9fdeea67454a654`; WP03 and independent
  bilingual review remained open at that 265-reference checkpoint.
  First-tranche verification passed 191 Android unit tests, all 9 Python seed-package tests,
  ingredient/package normalization and validation, generated-index freshness, evidence-ledger schema
  validation (419 records), and diff checks. The deployment script's full `test` task and debug
  assembly passed; Pixel 9a picker search `topinambour` returned `Jerusalem artichoke`. The unsaved
  probe was discarded, and the home screen still showed 114 recipes.

- WP03 root-vegetable follow-up on 2026-10-05 verified the existing carrot / carotte identity and
  removed its unsupported size/product aliases `baby carrots` and `petites carottes`. Four new
  identity-only rows add beet / betterave, radish / radis, daikon / daïkon, and kohlrabi / chou-rave.
  At that checkpoint, the package had 269 references and SHA-256
  `0b6f9ee7b0a169e90e58469ee85143c68cfd28e8005d17f1a636d87463d0dac6`. See
  `batches/plant-root-vegetables-follow-up.md`; independent bilingual review and the rest of Section J
  remain open. Verification passed 192 Android unit tests, all 9 Python seed-package tests,
  normalization and validation checks, generated-index freshness, evidence-ledger schema validation
  (423 records), and diff checks. The deployment script's full `test` task and debug assembly passed;
  Pixel 9a picker search `radis blanc` returned `daikon`. The empty probe was discarded and the home
  screen remained at 114 recipes. The retained emulator database may still contain the former carrot
  aliases because insert-only refresh preserves existing catalog rows; the canonical seed and
  generated index omit them, and the unit test checks that canonical search state.

- WP03 allium follow-up on 2026-10-05 reconciled the legacy shallot and common-chive candidates and
  added Chinese chives. The canonical package now has 272 references (SHA-256
  `200ee378e166ac71067824677952a9cb43191a118ec51acb3d61c6e1141339a3`). OQLF-backed names and
  Québec ambiguity decisions are recorded in `batches/plant-alliums-aromatics.md`; the three rows
  have no numeric, form, yield, or substitution data. Verification passed 193 Android tests, all 9
  Python package tests, seed normalization/validation, generated-index freshness, 424 ledger records,
  and encoding/diff checks. Pixel 9a searches `chinoise` and `eschalot` returned `Chinese chives` and
  `shallot`. The empty probe was discarded and the home screen remained at 114 recipes; independent
  bilingual and broader Section J review remain open.

- WP03 regional roots and shoots follow-up on 2026-10-05 added jicama, lotus root, burdock, water
  chestnut, bamboo shoots, and hearts of palm as identity-only references. The current package has
  278 references (SHA-256
  `2a27af4479e13e27aa75520a9e5cc8b76bb7f181b9365b9a542880aba7694852`); 114 recipe files were
  checked and none directly reference these identities. OQLF-supported alias decisions keep `yam
  bean`, `water nut`, and water caltrop out of broad alias mapping. See
  `batches/plant-regional-roots-shoots.md`. The 194 Android unit tests, 9 Python package tests,
  package/schema/encoding checks, and Pixel 9a picker verification passed; the French query `dolique`
  returned `jicama`, and the unsaved probe was discarded. Arrowhead and independent bilingual review
  remain open.

- WP03 Section K leafy-greens and brassicas follow-up on 2026-10-05 integrated 15 source-backed
  identities, reviewed existing broccoli/kale, and modeled baby spinach as a form of the existing
  spinach identity while preserving its reference ID. The package now has 293 references
  (SHA-256 `008cb9fc173f5e0eafd64b41181df71ef1a1f0028958b3579df1e266de93082f`), three forms, and
  114 recipes. OQLF alias boundaries keep generic cabbage/Chinese cabbage terms, the short ambiguous
  `savoy`, and trademark `Broccolini` out of generic mapping. See
  `batches/plant-leafy-greens-brassicas.md`; Pixel 9a picker searches `gai lan` and `bette` returned
  `Chinese broccoli` and only `Swiss chard`, respectively. Screenshots are retained with the batch
  evidence. Independent bilingual review and the broader Section K sweep remain open.

- WP02 A1 specialist wheat-flour follow-up on 2026-10-05 added pastry flour, whole-wheat pastry flour,
  high-gluten flour, and self-rising flour with source-backed English/Québec French names. The
  unsupported `farine à pâtisserie` cake-flour alias was removed and now belongs to the distinct
  pastry-flour identity. The package now has 297 references (SHA-256
  `f7ca3b37bf58862f09f032d587f0419f499f3bd8e8ae24b071e492f8fb025f90`), three forms, and 114 recipes.
  No measurements, yields, or substitutions were added. Four existing recipe lines refer to cake
  flour; none refer to the four new identities. The 201 unit tests, 24/26 connected Android tests
  (two environment skips), Python/package/ledger checks, and Pixel 9a picker searches passed; the live
  French pastry and cake queries returned separate rows. Screenshots and source details are in
  `batches/baking-specialty-wheat-flours.md`; independent bilingual review and remaining A1/A2 baking
  coverage remain open.

- WP03/WP02/WP07 focused integration on 2026-10-06 added white fonio / *fonio blanc*, removed the
  malformed `of pinto beans` alias, recorded fonio-flour product/process sources as an unresolved
  candidate, and added separate USDA SR28 (200 g/source cup) and King Arthur (198 g/source cup)
  granulated-sugar observations to the ledger. The canonical package has 314 references (SHA-256
  `745706a4981225f5617f67be70ae9fe9d45e46e43c9b55b725adc3c251a3f7bf`) and the evidence ledger has
  465 records (SHA-256 `234ab15124ffb6eea495a5c7543acbe2d70561dba6126fe1c2dd7bdac37f7c2b`). All 209
  Android unit tests and 9 Python package tests passed. Android 16 / API 36 Pixel 9a instrumentation
  completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. Package/ledger, reference,
  generator, encoding, and diff checks passed. The deploy script installed/launched successfully on
  the Pixel 9a; live searches `white fonio` and `fonio blanc` returned one localized result each, and
  the discarded probe left the French home screen at 114 recipes. Screenshots are in
  `batches/white-fonio-identity.md`. Independent bilingual review, fonio flour identity boundaries,
  sugar cup compatibility, and the broader catalog remain open.

- WP03 integration on 2026-10-06 added black fonio / *fonio noir* as a distinct `GRAIN_AND_CEREAL`
  reference, separate from white fonio. Health Canada French and FAO bilingual taxonomy sources
  support the names and *Digitaria iburua* identity; no aliases, state variants, or numeric data were
  inferred. The canonical package has 315 references (SHA-256
  `a2542ddc80d1e23409e9d6098a4c0626fc41d8d5c6db5e00cafe35c32c6f097e`) and the ledger has 466
  records (SHA-256 `b57ee338329415647fdceb5b25987a6924f57a39653ac31efd099d0a8158ca67`). The 114-file
  ingredient-name/original-text audit found no match. Automated, instrumentation, deploy, and live
  All 210 Android unit tests and 9 Python package tests passed. Android 16 / API 36 Pixel 9a
  instrumentation completed 26 cases: 24 passed and two QA-gated skips, zero failures/errors. The
  deploy script installed/launched successfully; live searches `black fonio` and `fonio noir` each
  returned one result, and discarding the draft left the French home screen at 114 recipes.
  Screenshots are in `batches/black-fonio-identity.md`.

- WP03 integration on 2026-10-06 promoted the legacy Arborio candidate to `arborio rice / riz
  arborio`, using OQLF's bilingual name and variety definition. Cooked rice remains distinct, with
  no alias, form, measurement, or conversion inferred. The 114-recipe ingredient audit found no
  Arborio match. The canonical package now has 316 references (SHA-256
  `ef79945a16b23b82b57e4f3db9399a2159cc196bcade357eb2f4d8bdc5f9f1b6`); the ledger has 466 records
  (SHA-256 `d77bec241c745fcd88608b686e09e3e209642c9cf1aa85bbef85ecb7904b6c2c`); and 103 unreviewed
  legacy candidates remain. All 211 Android unit tests and 9 Python tests passed. Android 16 / API
  36 Pixel 9a instrumentation passed 24 of 26 cases, with two QA-gated skips and zero failures.
  The deploy script and live `arborio rice` / `riz arborio` picker checks passed; the French home
  remained at 114 recipes. Screenshots are in `batches/arborio-rice-identity.md`.

- WP03 integration on 2026-10-06 added `carnaroli rice / riz carnaroli` from the direct OQLF variety
  entry. It remains separate from Arborio and cooked rice; `risotto rice` is not an alias. The
  114-recipe ingredient audit found no Carnaroli match. The canonical package now has 317 references
  (SHA-256 `e27bef955f12ce826891dfd9462bfb40db83246ef929277e432f880d942e51c3`) and the evidence
  ledger has 467 records (SHA-256 `d2b7f42b920bfd787d873616e06db50ee21232c80da04910f1b6c583d045a6a5`).
  All 212 Android unit tests and 9 Python tests passed. Android 16 / API 36 Pixel 9a instrumentation
  passed 24 of 26 cases, with two QA-gated skips and zero failures. The deploy script and live English
  and French picker checks passed; the French home remained at 114 recipes. Screenshots are in
  `batches/carnaroli-rice-identity.md`.

- WP03 integration on 2026-10-06 added `bomba rice / riz bomba` as a distinct named variety using
  RICARDO's bilingual lexicon and the EU *Arroz de Valencia* variety specification. Paella use is
  context, not an alias; no aliases, forms, measurements, or substitutions were added. No Bomba
  mention or reference appears in the 114 bundled recipe files. The canonical package has 318
  references (SHA-256 `90b2495d5964e8a0d2ab783c42469d0afedc2d95a8b0f2c837a76e414e46d194`) and the
  ledger has 468 records (SHA-256 `10bfcc65053d1ce368578bf49e2d9a793551a080dfe9516088b6583a289c1f10`).
  All 213 Android unit tests and 9 Python package tests passed; Pixel 9a instrumentation passed 24
  of 26 cases with two QA-gated skips and no failures. Deployment and live `bomba rice` / `riz bomba`
  searches passed, and the French home remained at 114 recipes. Screenshots and the detailed audit
  are in `batches/bomba-rice-identity.md`.

- WP03 integration on 2026-10-06 added `calrose rice / riz Calrose` as the named California
  medium-grain market type. RICARDO provides the bilingual labels; University of California rice
  breeding material and the California Rice Commission define the market class. Generic sushi rice
  remains separate, and RICARDO's short-grain description was not imported. No Calrose or generic
  sushi-rice mention appears in the 114 bundled recipes. The canonical package has 319 references
  (SHA-256 `d335a2112b06196f344bc40e8e721b176eb4364d838eb2885230bdc00a69300a`) and the ledger has
  469 records (SHA-256 `8e2262152ed4f683ad1779d47fab9316957767a0e67dc5f7e37113b6450bd31d`).
  All 214 Android unit tests and 9 Python package tests passed. Pixel 9a / Android 16 instrumentation
  passed 24 of 26 cases, with two QA-gated skips and zero failures/errors. Normalization, package and
  ledger validation, generated-index freshness, UTF-8/no-BOM checks, and `git diff --check` passed.
  The deploy script installed and launched the app on the temporary 8 GB Pixel 9a AVD after the
  original 6 GB AVD ran short of storage; its persisted data was preserved. Live `calrose rice` and
  `riz calrose` searches each returned one localized result. Generic `sushi rice` and `riz a sushi`
  returned no Calrose result. The empty probe was discarded; the French home remained at 114
  recipes. Pixel 9a screenshots and detailed results are in `batches/calrose-rice-identity.md`.

- WP03/WP-D focused integration on 2026-10-06 added four pulse identities and milk chocolate; the
  Cherry Blossom milk-chocolate-chip line now links to the base identity. The current seed has 324
  references, the ledger has 470 records, and 99 legacy candidates remain. All 215 unit tests and 9
  Python package tests passed; Pixel 9a / Android 16 instrumentation passed 24 of 26 cases with two
  existing environment skips. Live English/French picker checks and the restored 114-recipe French
  home passed. See `batches/chocolate-confectionery-identities.md` and
  ``batches/plant-legumes-pulses.md`, and `batches/millet-amaranth-grains.md`.

- WP02 Section 03 / Section D chocolate-form follow-up on 2026-10-06 added six forms beneath the
  semisweet, white, dark, and milk chocolate identities and linked 12 recipe lines while preserving
  source text. The canonical package remains at 324 references and 114 recipes; it now has 10 forms,
  and the ledger has 478 records. Exact complete form phrases carry a unique form hint through the
  ingredient picker; other phrase searches retain their previous behavior. Repository tests cover
  insert-only refresh and same-ID/imported-catalog preservation. All 228 Android unit tests and 9
  Python tests passed; focused Pixel 9a / Android 16 editor instrumentation passed. Seed/reference
  normalization, schema/evidence/alias validation, generated-index freshness, encoding checks, and
  `git diff --check` passed. The deploy script installed/launched the build; live search showed the
  semisweet base result and chips sublabel, and the discarded probe left the 114-recipe home intact.
  See `batches/chocolate-form-hints.md` and its linked screenshots. Independent Québec French review
  and broader WP02/Section D coverage remain open.

- WP02 Section A7 identity follow-up on 2026-10-06 added separate wheat bran / `son de blé` and
  wheat germ / `germe de blé` references, using OQLF and Canadian product-list naming evidence.
  Both are `GRAIN_AND_CEREAL` with empty alias lists, null density, empty unit mappings, and no
  substitutions. The 114-recipe word-boundary audit found no matches, so no recipe lines changed.
  The package has 326 references (SHA-256
  `fa6c4b9df4d53515d6926bf9865ccff5e03bc4db5ee70348354c26ea11cb55bb`); the ledger has 480 records
  (SHA-256 `5c291c42f980d159ff748560e93e8b64c4db0b92fd62b5e0b54b49bd820d2195`). See
  `batches/wheat-bran-germ-identities.md`; the broader A7 item remains open.

- WP02 Section A7 follow-up on 2026-10-06 added `cracked wheat / blé concassé` as a separate
  `GRAIN_AND_CEREAL` identity. Canadian standards distinguish cracked wheat from crushed/coarse-
  ground wheat; OQLF distinguishes unprocessed cracked wheat from precooked/dried bulgur. No aliases,
  measurements, or substitutions were added, and the 114-recipe name audit found no use. The package
  has 327 references (SHA-256
  `d461db849c417fa3ca449d22959ef3e1b9034a58dfbb676f23f0077d1b5d7606`); the ledger has 481 records
  (SHA-256 `8fe524536046a05e6dd9de4734dc8e9731905a347d2c6c76589018a57c110a2b`). See
  `batches/cracked-wheat-identity.md`; broader A7 review remains open.

- WP02 Section A7 follow-up on 2026-10-06 added `vital wheat gluten / gluten de froment élastique`
  as an identity-only `GRAIN_AND_CEREAL` reference. OQLF supplies the preferred Québec French term
  and processed-cereal category; Health Canada's `gluten de blé vital` is a French search alias.
  CFIA's separately standardized `Gluten Flour` name remains unmapped pending equivalence evidence.
  No density, measurement, form, conversion, or substitution was activated, and the 114-recipe
  audit found no matching ingredient lines. The package now has 328 references (SHA-256
  `324e9fc91390484a68d1e1739c3aa0c2c899ccf840917331885f0ffec239c899`) and the ledger has 482
  records (SHA-256 `3efb96503365656610203aef474c92a7fd288a44004b4e96a6d2d7ab6385907e`). All 231
  Android unit tests and 9 Python package tests passed; the Pixel 9a / Android 16 live English,
  French, and alias picker checks passed and left the 114-recipe library intact. See
  `batches/vital-wheat-gluten-identity.md` and its linked screenshots; independent Québec French
  review and the wider A7 list remain open.

- WP02 Section A7 follow-up on 2026-10-06 added `wheat starch / amidon de blé` as an identity-only
  `FLOUR_AND_STARCH` reference, with OQLF's `amidon de froment` as a French search alias. CFIA
  separately lists wheat starch and wheat flour; no density, measurement, form, conversion, or
  substitution was activated. The 114-recipe name audit found no matches. The package now has 329
  references (SHA-256 `12e6cf81eb4d6036486bb21054aea560f4233b234b3bb69a65bd57164a397f1b`) and the
  ledger has 483 records (SHA-256 `ec160a3ff29af6f28defe316ffb495edf3aaed521d751aa5e5eedcdbbc4aa969`).
  All 232 Android unit tests and 9 Python package tests passed; normalization, package validation,
  generated-index, encoding, and diff checks passed. The Pixel 9a / Android 16 English, French, and
  alias picker searches passed and left the 114-recipe library intact. See
  `batches/wheat-starch-identity.md` and its linked screenshots; independent Québec French review
  and the wider A7 list remain open.

- WP02 Section A7 follow-up on 2026-10-06 added `malted barley flour / farine d'orge maltée` as a
  distinct `FLOUR_AND_STARCH` reference. OQLF's English `malt barley flour` is its sole alias; general
  barley flour and malted wheat flour remain separate. No broad `malt flour` alias or diastatic form,
  density, measurement, conversion, or substitution was activated. The 114-recipe name audit found
  no matches. The package now has 330 references (SHA-256
  `cbce256e3cad40b92a0a3b36e5833a3a974cec4ce06afa237426870a355e563b`) and the ledger has 484
  records (SHA-256 `d7a07dc2754d932c4271b4ddd3178d0b9c05c99cdc067af7c0cb13e41ed5a73a`). All 233
  Android unit tests and 9 Python package tests passed; normalization, package validation,
  generated-index, encoding, and diff checks passed. Pixel 9a / Android 16 English, alias, and French
  picker searches passed; blank drafts were discarded and the 114-recipe library remains intact. See
  `batches/malted-barley-flour-identity.md` and its linked screenshots; independent Québec French
  review and the wider A7 list remain open.


- WP02 Section A7 follow-up on 2026-10-06 added `malted wheat flour / farine de blé maltée` as a
  separate `FLOUR_AND_STARCH` identity, distinct from general/whole-wheat flour, malted barley flour,
  and vital wheat gluten. It has no aliases or numeric, form, conversion, yield, or substitution data.
  The accent-folded 114-recipe audit found no matches. The package now has 331 references (SHA-256
  `50e01d83117d276235c5980a26e33ea626af17128a0052a0e9d29ffb5b20fcf8`) and the ledger has 485
  records (SHA-256 `957c06b0f93d0eaad859d9253b5963c226444f4b783f0978a5f7d3b01e7c5209`). All 234
  Android unit tests and 9 Python package tests passed; normalization, package validation,
  generated-index, escaped-Unicode/no-BOM, and diff checks passed. Pixel 9a / Android 16 English
  and fr-CA picker searches returned the intended name; the blank draft was discarded and the
  114-recipe French home restored. See `batches/malted-wheat-flour-identity.md` and its linked
  screenshots; independent Québec French review and the wider A7 list remain open.

- WP02 Section A7 wheat-meal review on 2026-10-06 retained `ingredient-ref-wheat-meal` as an
  unresolved ledger candidate, not an active reference. CFIA and Statistics Canada distinguish the
  human-food product from wheat flour and durum semolina, while the tariff groups wheat meal with
  groats and semolina and does not provide a standalone Québec French name. `semoule de blé` overlaps
  the two active durum-semolina rows. No exact candidate names occur in the active catalog or 114
  bundled recipes; no recipe was edited. The ledger now has 486 records (SHA-256
  `a371644ae478c93b2a1333f7887c3de6a1bf326516152526c5e4dba4940ccf05`); package validation,
  generated-index check, 9 Python package tests, and `git diff --check` pass. See
  `batches/wheat-meal-identity-review.md` and sources WP02-S118–S122.

- WP02 A7/B6 integrated `roasted barley flour / farine d'orge torréfiée` as a distinct
  `FLOUR_AND_STARCH` identity from a Québec mill's bilingual product pages, correcting adjective
  agreement from its French source title. Eurogerm manufacturer evidence later supported the sole
  English alias `toasted barley flour` at the shared ingredient-class level. The row has no French
  aliases, density, unit mapping, forms, conversions, yields, or substitutions; `hattai-ko` and
  `mugikogashi` remain unresolved. A later form audit confirms roasted split/dehulled Desi chickpeas
  match a grain form, not flour, and do not settle the pottukadalai-maavu/chana-sattu boundary; see
  `proposals/wp02-roasted-flour-product-boundaries-review-20261011.md`. The 114-recipe audit found no
  prior exact name or recipe use; no recipe changed. The current package has 338 references (SHA-256
  `842401a34b68f45e6cbd49aaa55b29089ee99270714dcacf0998524d028af2fa`) and the 493-record ledger
  has SHA-256 `82f9b91bfb89a35b69f154302e49e947b47e7ecaf440aec903213db34550842c`. All 242 Android
  unit tests and 9 Python package tests passed. Direct AndroidJUnitRunner verification completed 29
  instrumentation cases, with 27 passes, 2 assumption skips, and no failures after Gradle's
  connected installer hit the emulator storage limit. Live Pixel 9a English and fr-CA searches,
  screenshots, and remaining independent Québec French review are recorded in
  `batches/toasted-barley-boundary-review.md`.

- WP02 A7 integrated `roasted wheat flour / farine de blé torréfiée` from a Québec mill's bilingual
  product pages and `roasted wheat malt flour / farine de malt de blé torréfié` from a manufacturer
  declaration listing malted and roasted malt flours separately. Both are identity-only
  `FLOUR_AND_STARCH` rows with no aliases or numeric/conversion/yield/substitution data. The source
  does not support an extraction class for roasted wheat flour or a detailed processing specification
  for roasted wheat malt flour. The package has 334 references (SHA-256
  `6bd08f1544bf28ea19ec89b96ffbd6cb96d17afa31758a31617784f52a8df356`) and the ledger has 489 records
  (SHA-256 `923565f2482875a1660cc2b2dee96d8e095fee5b5ff9679ac7bd0c263074eff0`). All 236 Android unit
  tests and 9 Python package tests passed; normalization, validation, generated-index, escaped-Unicode/
  no-BOM, and `git diff --check` audits passed. Pixel 9a / Android 16 live English and accent-folded
  fr-CA searches returned each intended row; `toasted wheat flour` and `roasted malt flour` returned
  no result. The blank probes were discarded, and the app was restored to the French home with all
  114 recipes. Screenshots and remaining review work are in
  `batches/roasted-wheat-flours-identity.md`; independent Québec French review and broader A7/B6 work
  remain open.

- WP02 Sections A5/A7/B6 added `roasted corn flour / farine de maïs torréfiée` as a distinct,
  identity-only flour reference. The Québec mill's bilingual pages describe a heat-treated
  functional flour, while P.A.N. and a Montréal supplier separately name precooked corn flour; the
  sources do not establish equivalence. The new row has no aliases, numeric data, forms, or
  conversions, and `toasted corn flour` remains unresolved. The 114-recipe audit found no matching
  lines. The canonical package has 335 references (SHA-256
  `a187ece7f7a834bd6fb5adb8368605cc55908999de185b81be36894730c1178c`) and the ledger has 490
  records (SHA-256 `26e9c10aab4f31e98688031b90f0ca412f6b3fd58ff5baf2ebe5f56056584375`). All 238
  Android unit tests and 9 Python package tests passed; Pixel 9a / Android 16 API 36 instrumentation
  passed 27 of 29 cases, with two environment-gated skips and no failures/errors. Normalization,
  package validation, generated-index freshness, escaped-Unicode/no-BOM audit, and `git diff --check`
  passed. Live English and accent-folded fr-CA picker searches showed roasted and precooked corn flour
  as separate rows; `toasted corn flour` returned no result. The temporary draft was discarded and
  the French home was restored with all 114 recipes. Screenshots and sources are in
  `batches/roasted-corn-flour-identity.md`; independent Québec French review and wider A5/A7/B6 work
  remain open.

- WP02 Sections B1/B6 add two distinct identity-only references: generic `soy flour / farine de soya`
  with OQLF's English and French lexical variants, and `kinako / poudre de soja Kinako` with MAFF's
  English `roasted soybean flour` synonym. OQLF's definition keeps the generic hull-free soybean-meal
  identity separate from the source-named roasted product; no other processing equivalence is
  inferred. Both rows have null density and empty unit mappings, with no forms, conversions, yields,
  measurements, or substitutions. The exact catalog and 114-recipe audits found no prior soy-flour or
  Kinako names. The canonical package has 337 references (SHA-256
  `2ca046c1afa41ad457aabd491d8873c3a7b66840a044754a6a5185c7bb11d9b1`), and the ledger has 492
  records (SHA-256 `39306a1b86d5273f2f54efcde0734d3a74957c4ea9b4c99580ef8a6d622d54b0`). All 240
  Android unit tests and 9 Python package tests passed; Pixel 9a / Android 16 API 36 instrumentation
  passed 27 of 29 tests, with two environment-gated skips and no failures/errors. Normalization,
  package validation, generated-index freshness, ledger-schema validation, escaped-Unicode/no-BOM
  audit across 125 bundled JSON files, and `git diff --check` passed. Live English searches returned
  Kinako for `kinako` and `roasted soybean flour`, and generic soy flour for `soy flour`; the shared
  `soybean flour` query showed both rows. French searches returned `poudre de soja Kinako` and
  `farine de soya`. The blank probe was discarded and the French home was restored with all 114
  recipes. Screenshots are in `batches/soy-flour-kinako-identities.md`; independent bilingual review
  and broader B1/B6 coverage remain open.

- WP02 Sections B1/B6 add `chana sattu / farine de sattu` as a separate identity-only roasted Bengal
  gram flour product. FSSAI defines Chana Sattu as flour ground from roasted *Cicer arietinum*;
  eNAM separately lists Chickpea Flour (Besan) and Roasted Bengal Gram Flour (Chana Sattu), and
  Canadian French-market product listings support the local Sattu name. Generic chickpea flour/besan
  and broader grain-based `sattu` remain separate or unresolved. The new row uses only source-backed
  roasted-grain names and has no density, unit mapping, form, conversion, yield, measurement, or
  substitution data. The pre-integration catalog and 114 bundled recipe audit found no Sattu name or
  matching recipe line; no recipe changed. All 242 Android unit tests and 9 Python package tests
  passed; package and ledger schema, generated index, escaped-Unicode/no-BOM across 125 bundled JSON
  files, and `git diff --check` passed. The connected Gradle task could not install the APK under the
  emulator storage limit; direct APK installation followed by AndroidJUnitRunner completed 29 tests,
  with 27 passes, 2 environment-gated skips, and no failures. Live English searches for `chana sattu`
  and `roasted Bengal gram flour` showed the new row; `chickpea flour` displayed both options. French
  searches for `farine de sattu` and accent-folded `farine de pois chiches grilles` showed the new row;
  singular `farine de pois chiche` returned generic chickpea flour. The draft was discarded and the
  French home restored with all 114 recipes. The package has 338 references (SHA-256
  `7a230d9f9f2c1488f8403ceb61b595e419da551f766c40d6fb4cab8d1a9052ff`) and the ledger has 493
  records (SHA-256 `66458ed7c3b2a9534abc2e8bd693faf035621a4669d7e7654471bb85e7c56025`). Screenshots
  and details are in `batches/chana-sattu-identity.md`; independent bilingual review and broader
  B1/B6 coverage remain open.
- WP02 A7/B6 generic toasted-barley boundary review: Eurogerm manufacturer sources define its toasted
  barley flour as barley in a roasted-cereal flour line made by milling roasted cereal, supporting the
  English alias `toasted barley flour` on `ingredient-ref-roasted-barley-flour`. No generic row is
  added; no brand-specific process or performance equivalence is claimed. `Hattai-ko`/`mugikogashi`
  remain unresolved because regional cereal inputs vary and Québec French naming is missing. Alias
  unit/device verification is recorded in `batches/toasted-barley-boundary-review.md`.

- WP03 Section F integration on 2026-10-06 added `parboiled rice / riz étuvé` as a processing identity
  and broad `rye / seigle` beside the existing rye-flour identity. OQLF and Codex support the parboiled
  name and process boundary; OQLF plus the federal grain-use schedules support rye / seigle. The
  trademark `Converted rice`, contextual `riz précuit`, instant-rice wording, and unverified `rye
  berries` phrase remain inactive. No aliases, numeric data, forms, yields, or substitutions were
  added, and the 114-recipe audit found no matches. The current package has 342 references (SHA-256
  `a5442958af6f356b3e7a985b7a5ac99aeec948c7abaaeb66683e7544033f8f7e`); the ledger has 498 records
  (SHA-256 `3a6c3e5d64e9e21e70c0f891b3be456bed984b3e775c7991692351b48bf555bf`). All 246 Android unit
  tests and 9 Python package tests pass; package, seed, and generated-index checks plus the encoding
  audit passed. Pixel 9a searches showed `parboiled rice`, `riz étuvé`, separate `rye` / `rye flour`,
  and `seigle` / `farine de seigle`; the blank draft was discarded and the French home restored to
  114 recipes. An install retry required uninstalling the existing emulator app because `/data` had
  421 MB free; its emulator-local app data was cleared and the bundled library reseeded. Screenshots
  and source evidence are in `batches/parboiled-rice-rye-identities.md`. Independent Québec French
  review and broader Section F coverage remain open. A Luna reviewer also corrected the kasha boundary:
  OQLF documents *kacha / kasha* as a roasted-buckwheat gruel, which does not establish an alias for
  dry groats; the unresolved candidate is recorded in the ledger and packet [WP03-S15, S56].

- WP03 Section F integration on 2026-10-06 added `wheat berries / grains de blé entiers` and
  `steel-cut oats / avoine découpée` as identity-only rows. Canadian whole-kernel product descriptions,
  federal French food-grain wording, and OQLF's direct bilingual oat entry support the names. No aliases,
  forms, numeric values, yields, conversions, or substitutions were added; the 114-recipe audit found no
  matches. At that 2026-10-06 checkpoint, broken rice remained unresolved pending the generic rice
  identity/form decision. The 2026-10-07 rice-state update resolved the base/form relationship, and
  the later broken-rice checkpoint below integrates its separately named milling-grade identity.
  The canonical package has 344 references (SHA-256
  `136feb056112df94ba254d01b6fb3dc597f1791863667a2dc1a21f6aad8304de`) and the research ledger has
  501 records (SHA-256 `ec02b77bd80616705ab5016117a1a15fdb60e08203093a6909ba01eecaca13c9`). All 247
  Android unit tests and 9 Python package tests passed; package normalization, validation, generated
  catalog freshness, and encoding checks passed. Pixel 9a searches verified the English and French
  display names, then restored the French home to 114 recipes. Storage recovery required uninstalling
  the emulator app and cleared its local app data before bundled-library reseeding. Screenshots and
  source evidence are in `batches/wheat-berries-steel-cut-oats.md`. Independent Québec French review
  and broader Section F coverage remain open.

- WP03 Section F added oat groats / `gruau d'avoine entier`, emmer wheat / `blé amidonnier`, and
  freekeh / `freekeh` as identity-only rows. CFIA distinguishes whole oat groats from cut, rolled,
  quick, and instant oats; TERMIUM resolves emmer from species-ambiguous `farro` and defines freekeh
  as roasted, crushed immature wheat. Instant oats and unqualified farro remain ledger candidates;
  neither is an active alias. The 114-recipe audit found no related terms. The package has 347
  references (SHA-256
  `e93f731b87e5b08c2fdcaa6802518d29220e0516a90ec40f4f331e1a657d8f73`) and the ledger has 506
  records (SHA-256 `9fe733df985ccc10879980409f9b32ebac0d7a458d757ffc0eb974d989d1b7d5`). All 247
  Android unit tests and 9 Python package tests pass; validation, normalization, generated-index, and
  encoding checks pass. Pixel 9a searches verified all three English and fr-CA picker labels and the
  French home with 114 recipes. Storage recovery required uninstalling the emulator app and cleared
  emulator-local app data before reseeding. Screenshots and source evidence are in
  `batches/oat-groats-emmer-freekeh.md`; independent Québec French review and broader Section F
  coverage remain open.

- WP03 rice/quinoa/oat-bran state-form checkpoint on 2026-10-07: applied the completed WP01
  identity/form contract. Kept stable `ingredient-ref-rice` and `ingredient-ref-quinoa` as generic
  bases with dry/cooked forms; added `ingredient-ref-oat-bran` and dry/cooked forms. The four
  bundled recipe lines explicitly requesting cooked rice or cooked quinoa now reference the matching
  forms; the more specific “Cooked white rice” line remains unlinked. No measurement, density,
  conversion, yield, or substitution was added. The package has 348 references (SHA-256
  `cc1e0f735cb1e9ac106ba555e912269d885f82d3e1aa2409d710453cc849acbc`) and 16 forms (SHA-256
  `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`); the manifest SHA-256 is
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`. The research ledger has 513
  records (SHA-256 `3ef57f0d4c2de8fec023fc7494a9b0120cdfd74187a5d9664ac4f721f1a5cb84`). All 249
  Android unit tests and 9 Python package tests passed; seed/ledger schemas, package normalization,
  reference normalization, generated-index freshness, escaped-Unicode/no-BOM audit, and `git diff
  --check` passed. Pixel 9a / Android 16 API 36 confirmed English cooked/dry rice, French cooked rice,
  French dry quinoa, and the French oat-bran cooked form; the final French home showed 114 recipes.
  Installing required uninstalling the emulator-only package because of storage pressure, then
  reseeding the bundled library. Screenshots are in `batches/rice-quinoa-oat-bran-state-forms.md`.
  Independent Québec French review, measurements, conversions, yields, substitutions, and broader
  Section F coverage remain open.

- WP03 teff and triticale grain identity checkpoint on 2026-10-07: added `teff / teff d'Abyssinie`
  separately from teff flour and `triticale / triticale` as a food-grain identity distinct from
  wheat, rye, flour, feed, silage, and forage. Both rows have empty aliases and unit mappings, null
  density, no forms, and no recipe links or numeric/conversion/yield/substitution data. All 114
  bundled recipes were scanned; no matching lines or exact normalized-key collisions were found.
  Source, package, test, and Pixel 9a verification results are recorded in
  `batches/teff-triticale-grain-identities.md`, including current English and French picker
  screenshots for both grains. Package hashes match the 357-reference, 522-record verification;
  independent Québec French review and broader Section F coverage remain open.

- WP03 pot-barley and crispy-rice-cereal reviews on 2026-10-07: confirmed pot/Scotch barley is a
  separate processing class from hulled barley, but left it as a ledger candidate because *orge
  mondé* is used for both products. Scoped the existing rice-cereal reference and recipe 040 to
  `crispy rice cereal / céréales de riz croustillantes`, without changing its six-cup amount or
  activating broad rice-cereal, puffed-rice, rice-flake, or trademark aliases. The 357-reference
  package and 522-record ledger hashes match the completed automated checkpoint; Pixel 9a picker
  checks and recipe 040 detail screens passed in English and French. Fresh screenshots and hashes
  are in `batches/crispy-rice-cereal-identity.md`; the pot-barley naming review remains open.

- WP03 poha and broken-rice boundary checkpoint on 2026-10-07: initially integrated flattened rice
  (poha) / *flocons de riz (poha)* with no aliases or numeric data. The recipe/catalog audit found
  no use or exact collision. The 357-reference package and 522-record ledger hashes match that
  completed automated checkpoint; English and French poha picker checks passed on Pixel 9a. Fresh
  screenshots and hashes are in `batches/flattened-rice-poha-identity.md`. At that checkpoint,
  broken rice remained a candidate because its generic French label was unresolved; the later
  2026-10-07 checkpoint below integrates `broken rice / riz en brisures` as an identity-only milling
  grade.

- WP03 poha synonym and thickness-grade follow-up on 2026-10-10: added the source-backed English
  aliases `rice flakes`, `flaked rice`, and `beaten rice`, the Canadian French aliases *riz aplati*
  and *riz battu*, and three commercial grade forms: thin, medium, and thick poha. Retail product
  evidence supports the market classes and French picker labels but establishes no standardized
  dimensions. Kept `chiwda`, regional transliterations, manufacturer-specific super-thin/nylon/paper
  terms, red-rice poha, and maize poha outside the generic row. No bundled recipe uses poha; no
  measurements, densities, conversions, substitutions, or recipe links were added. Exact normalized
  reference-key review found no collision. Package checks passed; Android and Pixel verification is
  recorded in `batches/poha-thickness-synonyms-integration-20261010/README.md`.

- WP03 instant-oats and puffed-rice identity checkpoint on 2026-10-07: promoted the existing
  `ingredient-ref-instant-oats` candidate in place as `instant oats / flocons d'avoine à cuisson
  instantanée`, separate from quick oats and prepared/flavoured oatmeal packets. Added
  `ingredient-ref-puffed-rice` as `puffed rice / riz soufflé`, separate from generic rice, poha, and
  recipe 040's crispy rice cereal. Both are identity-only with empty aliases, null density, empty
  unit mappings, no forms, and no recipe links. The 114-recipe and exact-key audits found no use or
  collision. At that checkpoint, the seed had 353 references and 16 forms; the ledger had 518 records.
  Final verification was completed at the later medium-grain checkpoint on the 356-reference package and 521-record ledger; the English
  and French picker screens and recipe 040 boundary screenshot are recorded in
  `batches/instant-oats-puffed-rice-identities.md` and its `screenshots/` folder.

- WP03 long-grain rice identity checkpoint on 2026-10-07: integrated
  `ingredient-ref-long-grain-rice` as `long-grain rice / riz à grain long`, with the OQLF-preferred
  French variant `riz à grains longs` as its only alias. Do not add the unhyphenated English spelling
  as an alias because it normalizes to the display key. Codex provides alternative length-class
  methods, so no universal numeric cutoff is stored; generic rice state forms remain on the generic
  row. The 114-recipe and normalized-key audits found no use or exact collision. The integration
  checkpoint had 354 references and 16 forms; the ledger had 519 records. Final package, tests,
  emulator verification, hashes, and screenshots are complete and recorded in
  `batches/long-grain-rice-identity.md`.

- WP03 short-grain rice identity checkpoint on 2026-10-07: integrated
  `ingredient-ref-short-grain-rice` as `short-grain rice / riz à grain court`, with the OQLF-preferred
  French variant `riz à grains courts` as its only alias. Do not add the unhyphenated English spelling
  as an alias because it normalizes to the display key. Codex gives multiple length-classification
  options, so no universal numeric cutoff is stored; generic rice state forms remain on the generic
  row. The 114-recipe and normalized-key audits found no use or exact collision. The integration
  checkpoint had 355 references and 16 forms; the ledger had 520 records. Final package, tests,
  emulator verification, hashes, and screenshots are complete and recorded in
  `batches/short-grain-rice-identity.md`.

- WP03 medium-grain rice identity checkpoint on 2026-10-07: integrated
  `ingredient-ref-medium-grain-rice` as `medium-grain rice / riz à grain moyen`, with the OQLF-
  preferred French variant `riz à grains moyens` as its only alias. The English spelling `medium
  grain rice` normalizes to the display key. Codex offers three classification methods, so no
  universal numeric cutoff is stored; Calrose, Arborio, Carnaroli, and generic rice state forms
  remain separate. The 114-recipe and normalized-key audits found no use or collision. The current
  package at this verification checkpoint had 356 references and 16 forms; the ledger had 521 records. Final checks and Pixel 9a
  picker screenshots are recorded in `batches/medium-grain-rice-identity.md`.
- WP03 brown rice identity checkpoint on 2026-10-07: integrated `ingredient-ref-brown-rice` as
  `brown rice / riz brun`, with OQLF-supported aliases `hulled rice` and `riz cargo`. Other French
  variants and Europe-scoped `cargo rice` remain inactive pending regional review. The milling
  distinction overlaps grain-length classes; brown rice flour remains separate and no state forms or
  measurements were added. The 114-recipe and normalized-key audits found no use or collision. The
  current package has 357 references, 16 forms, and 522 ledger records; verification and Pixel 9a
  picker screenshots are recorded in `batches/brown-rice-identity.md`.

- WP03 roasted buckwheat groats identity checkpoint on 2026-10-07: integrated
  `ingredient-ref-roasted-buckwheat-groats-dry` as the exact Health Canada product label
  `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`. It remains separate from
  buckwheat flour and prepared *kacha / kasha*; no aliases or numeric/form data were added. The
  114-recipe audit found no match. All 255 Android unit tests and 9 Python package tests passed;
  package and generated-index validation passed. Connected Pixel 9a instrumentation could not
  install its test APK with 512 MB free and ran zero tests. The repository deploy script did install
  and launch the app; English `buckwheat` and French `sarrasin` picker checks showed flour and groats
  separately. The empty drafts were discarded and the French home remained at 114 recipes. Screenshots,
  hashes, and the pending instrumentation result are in
  `batches/roasted-buckwheat-groats-identity.md`. Independent Québec review and broader Section F
  coverage remain open.

- WP03 broken-rice identity checkpoint on 2026-10-07: integrated
  `ingredient-ref-broken-rice` as `broken rice / riz en brisures`, an identity-only milling-grade
  reference. The current Canadian Customs Tariff supplies the bilingual commodity pair at item
  1006.40.00, and Codex scopes broken-kernel classes to rice for direct human consumption. No recipe
  requests it; the 114-recipe and normalized-key audits found no text hit or exact collision. The row
  has no aliases, forms, or numeric/conversion data. The seed has 359 references and 16 forms; the
  ledger has 523 records. All 256 Android unit tests and 9 Python package tests passed, as did package
  normalization, validation, generated-index freshness, encoding, and diff checks. The Pixel 9a
  English and French picker searches returned the matching localized label. Both empty QA drafts
  were discarded and the French home remained at 114 recipes. Connected instrumentation remains
  open because the retained AVD had 523 MB free (91% used) and earlier test APK installs failed
  before running tests. Sources, hashes, and screenshots are in
  `batches/broken-rice-identity.md`; independent Québec review and the wider Section F checklist
  remain open.

- WP03 edible red-rice and corn-product follow-up on 2026-10-07: integrated `red rice / riz rouge`
  as a scoped edible red-bran food identity, and integrated separate `hominy corn / maïs lessivé`
  and `hominy grits / gruau de maïs` products. Kept generic sushi rice, polenta, pearled hominy,
  pozole corn, dried sweet corn, and generic grits unassigned where their product or French-name
  boundaries remain unresolved. The 2026-10-11 review rechecked the generic grits and polenta
  boundary and retained those holds; cornmeal and hominy grits remain unchanged. Evidence packets
  and Pixel 9a checks are in the corresponding `docs/catalog/batches/` files, with the follow-up
  boundary review in `proposals/wp03-polenta-grits-product-boundary-review-20261011.md`; the
  detailed Section F checklist remains open.

- WP03 Section G pasta base checkpoint on 2026-10-07: added broad `pasta / pâtes alimentaires` as
  an identity-only `GRAIN_AND_CEREAL` reference with the source-backed singular French alias
  `pâte alimentaire`. Kept dry/fresh, composition, shapes, and unqualified noodles outside the row.
  The 114-recipe scan found only serving-context mentions of noodles and couscous, so no recipe was
  relinked. The 364-reference seed, 533-record ledger, generated index, 261 Android unit tests, 9
  Python package tests, and connected Pixel 9a instrumentation passed validation; 2 of 29
  instrumentation cases were environment-gated skips. The English and fr-CA picker screenshots and
  hashes are in `batches/pasta-identity.md`. Broader Section F and G work remains open.

- WP03 Section G pasta-shape and Asian-noodle follow-up on 2026-10-07: added shape-specific
  `spaghetti / spaghetti`, rice-flour `rice vermicelli / vermicelle de riz`, and mung-bean-flour
  `bean thread cellophane noodles / nouilles à base de farine de haricot mungo`. Kept the separate
  OQLF prepared-dish sense of spaghetti out of the ingredient row; generic rice noodles, rice sticks,
  and glass noodles remain unresolved rather than aliases. The 114-recipe and normalized-key audits
  found no direct ingredient use or exact collision; no recipe was relinked. The 367-reference seed,
  537-record ledger, 263 Android unit tests, 9 Python package tests, and Pixel 9a API 36 instrumentation
  (27 passed, 2 skips, 0 failures) passed. English and French-mode picker screenshots, hashes, and
  package/encoding/diff checks are recorded in `batches/pasta-shapes-asian-noodles.md`. Independent
  Québec French review and broader Section F/G work remain open.

- WP03 Section G couscous, pasta-shape, and noodle checkpoint on 2026-10-07: added
  `couscous / couscous`, separate `pearl couscous / couscous perlé`, `orzo / orzo`,
  `macaroni / macaroni`, `ramen noodles / nouilles ramen`, and `penne / penne`. Active aliases are
  limited to OQLF-supported `orzos`, `risoni`, `macaronis`, bilingual `ramen`, French `pennes`, and
  English `mostaccioli`; product-specific Israeli, Jerusalem, Mograbieh, and ptitim names, instant-
  noodle phrases, penne surface variants, and the occasional French term `plume` remain inactive.
  The 114-recipe and exact-key audits found no ingredient use or collision; the existing couscous
  serving suggestion was left unchanged. Independent Québec terminology review confirmed the four
  couscous and pasta-shape identities and independently audited penne; ramen terms are directly
  supported by OQLF. The 373-reference catalog, 543-record ledger, 267 Android unit tests, 9 Python
  tests, package/index/schema/encoding checks, and Pixel 9a / Android 16 picker verification passed;
  instrumentation reported 27 passes, 2 skips, and no failures. Screenshots and hashes are in
  `batches/pasta-couscous-shapes.md`. Remaining Section F/G identities and broader review stay open.

- WP03 Section G farfalle checkpoint on 2026-10-07: added `farfalle / farfalle` with French plural
  `farfalles` and English alias `bow tie pasta`. OQLF also lists `bow tie`, `butterfly`, `boucle`, and
  `papillon`; omitting those broad common terms is a conservative catalog false-match judgment, not
  an OQLF exclusion. The project assigns `GRAIN_AND_CEREAL` without inferring grain composition.
  Independent Québec terminology review is complete; the 114-recipe ingredient-line and exact-key
  audits found no hit. The 374-reference package/index and 544-record ledger passed normalization,
  schema, and encoding checks; 9 Python and 268 Android unit tests passed; Pixel 9a instrumentation
  reported 27 passes and 2 skips. English and French picker searches were verified. Screenshots and
  artifact hashes are recorded in `batches/pasta-shapes-farfalle.md`; remaining Section F/G identities
  and broader review stay open.

- WP03 Section F foxtail millet checkpoint on 2026-10-07: added `foxtail millet / millet d'Italie`
  for *Setaria italica*, separate from generic and pearl millet. OQLF supports the bilingual name
  and notes the bird-feed use of `millet des oiseaux`; that term and broad alternatives remain
  inactive as catalog aliases. Health Canada lists millet d'Italie among cereal crops, and FAO treats
  foxtail millet as a cereal in human nutrition. Independent Québec terminology and collision audits
  found the selected label appropriate, no exact normalized collision, and no candidate ingredient
  line in the 114 bundled recipes. The 375-reference package and 545-record ledger passed
  normalization, index, schema, encoding, and collision checks; 9 Python and 269 Android unit tests
  passed; Pixel 9a instrumentation reported 27 passes and 2 skips. English and French picker searches
  were verified, the installed APK matched the local build, and the app returned to the French home
  with 114 recipes. Screenshots and artifact hashes are recorded in `batches/foxtail-millet.md`;
  remaining Section F/G identities and broader review stay open.

- WP03 Section G fusilli checkpoint on 2026-10-07: added `fusilli / fusilli` with French plural
  `fusillis`. OQLF notes the occasional term `spirale`; it is omitted as a broad shape description
  by catalog judgment. The project assigns `GRAIN_AND_CEREAL` without asserting a specific pasta
  composition. An independent Québec terminology review confirmed the label, plural, and boundary;
  exact normalized-key and 114-recipe ingredient-line audits found no collision or use. The 376-row
  package and 546-record ledger passed package/index/schema/encoding checks; 9 Python and 270 Android
  unit tests passed, and connected Pixel 9a instrumentation reported 27 passes, 2 skips, and no
  failures. English `fusilli` and French `fusillis` picker searches each returned one row, the blank
  draft was discarded, and the app returned to the French 114-recipe home. Screenshots and hashes
  are recorded in `batches/pasta-shape-fusilli.md`. Remaining Section F/G identities and broader
  review stay open.

- WP03 Section F common millet checkpoint on 2026-10-07: added species-qualified `common millet /
  millet commun` for *Panicum miliaceum*, with `proso millet` as the sole English alias. OQLF supports
  the bilingual naming and species; Health Canada separates proso millet from other cereal millet
  taxa, and FAO sources support the grain scope. Generic `millet`, `mil`, and unsupported
  `millet proso` remain inactive. The normalized-key and 114-recipe ingredient-line audits found no
  collision or use. The 377-reference package and 547-record ledger passed package/index/schema/
  encoding checks; 9 Python and 271 Android unit tests passed, and connected Pixel 9a instrumentation
  reported 27 passes, 2 skips, and no failures. English `common millet` and French `millet commun`
  picker searches each returned one row; the blank drafts were discarded and the app returned to the
  French 114-recipe home. Screenshots and hashes are recorded in
  `batches/common-millet-identity.md`. Remaining Section F/G identities and broader review stay open.

- WP03 Section F Job's tears checkpoint on 2026-10-07: added the edible grain identity
  Job's tears / larme-de-Job for *Coix lacryma-jobi*, with English aliases adlay and adlai and
  French plural alias larmes-de-Job. OQLF supplies the Quebec French botanical term and plural;
  Philippine DOST-FNRI and Department of Agriculture sources support the edible grain and alias
  spellings and separate bead-making, feed, beverage, and medicinal uses. Health Canada and CFIA
  corroborate cereal/grain placement. The exact-key and 114-recipe audits found no collision or use.
  The 378-reference package and 548-record ledger passed package/index/schema/encoding checks;
  9 Python and 272 Android unit tests passed, and connected Pixel 9a instrumentation reported
  27 passes, 2 skips, and no failures. English and French picker searches each returned one row,
  the blank drafts were discarded, and the app returned to the French 114-recipe home. Screenshots
  and artifact hashes are in batches/jobs-tears-identity.md. Remaining Section F/G identities and
  broader terminology review stay open.

- WP03 Section F finger millet checkpoint on 2026-10-07: integrated `finger millet / éleusine cultivée` as the edible grain of *Eleusine coracana* subsp. *coracana*, with only `ragi` as an alias. Health Canada supports the Canadian English/French taxon and cereal classification; FAO supports the staple-grain use and alias; Espace pour la vie supplies local French crop usage. `Millet africain` remains inactive because the OECD glossary also assigns it to pearl millet. Independent Luna review, normalized-key review, and the 114-recipe audit found no exact collision or recipe-line use. All 273 Android unit tests and 9 Python package tests passed; connected Pixel 9a instrumentation reported 29 XML cases (27 pass, 2 skip, 0 failures). English `finger millet` returned one picker row; unaccented French input `eleusine cultivee` returned one displayed `éleusine cultivée` row. The blank probe was deleted and the French home restored to 114 recipes. Screenshots and artifact hashes are in `batches/finger-millet-identity.md`; Section F/G coverage and wider terminology review remain open.

- WP05 Section W/X/Y first identity checkpoint on 2026-10-08: integrated six source-backed sauce/condiment identities (including three promoted legacy IDs), updated existing fish sauce and sriracha aliases, and added source-qualified boundaries for oyster, black-bean sauce, tahini, hoisin, plum sauce, and sweet mango chutney. The first-tranche test covers these identities and search boundaries.
- WP05 Section Y pickle checkpoint on 2026-10-08: integrated mango pickle / marinade de mangue and lime pickle / marinade de lime as separate prepared identities. Patak's Canada bilingual pages and OQLF marinades terminology support names and pickle boundaries; recipe-text audit found no mentions in the 114 bundled recipes. No numeric, form, or substitution data was added. The 387-reference catalog and 554-record evidence ledger passed the 9 Python package tests, 274 Android unit tests, generated-index check, reference normalizer check, and git diff --check. Remaining WP05 candidates and broad regional/category coverage stay open. See batches/wp05-pantry-condiments-first-tranche.md and batches/wp05-pickles-mango-lime.md.

- WP05 Section W follow-up on 2026-10-08: added generic kimchi with OQLF-supported spellings and separate light/dark soy sauce identity rows. Product styles were represented as identities because the current ingredient-form model describes preparation states; Japanese style crosswalks and name collisions remain explicit gaps. No numeric or substitution data was added. The 390-reference catalog and 557-record ledger passed 9 Python package tests, 274 Android unit tests, reference normalization, generated-index freshness, and `git diff --check`. See batches/wp05-kimchi-soy-sauce-styles.md.

- WP05 Section Y follow-up on 2026-10-08: integrated labneh, za'atar, amchur powder, and sumac as four identity-only rows; promoted two existing legacy IDs and added only source-supported aliases. The 394-reference catalog and 559-record ledger passed all 9 Python package tests and 274 Android unit tests, reference normalization, generated-index freshness, and `git diff --check`. Mixed Pickles and the remaining South/Central Asia–MENA candidates remain open. See batches/wp05-mena-labneh-spices.md.

- WP05 Section X follow-up on 2026-10-08: integrated Thai Kapi as a distinct identity with the exact Canadian French wording and no generic shrimp-paste alias or numeric/form/substitution data. Package normalization, schema, generated-index, Python, Android unit, lint, and APK assembly checks passed. Pixel 9a verification used a temporary user-data image because the retained AVD had 403 MB free; connected instrumentation reported 29 cases (27 passed, 2 QA-only skips, 0 failures). Ube halaya and broader Southeast Asian coverage remain open. See batches/wp05-kapi-shrimp-paste.md.

- WP05 Section X Lao follow-up on 2026-10-08: integrated `padaek / sauce padaek` with only the source-supported `pa daek` and `padek` aliases. JIRCAS, Lao News Agency, and Télé-Québec support its distinct regional identity; no density, conversion, yield, or substitution was activated. The 409-reference catalog and 574-record ledger passed package, generated-index, ledger-schema, normalized-key, 9 Python, 275 Android unit, lint, and APK assembly checks. Pixel 9a / API 36 fr-CA picker QA returned `sauce padaek`; connected instrumentation reported 29 cases (27 passed, 2 QA-only skips, 0 failures) on a temporary user-data image. Independent Québec terminology review and broader Section X work remain open. See batches/wp05-padaek-identity.md.

- WP05 Section Y MENA/Caucasus follow-up on 2026-10-08: integrated twelve source-backed condiment identities: harissa, chermoula, amba, zhug, shatta, biber salçası, muhammara, rose syrup, pomegranate molasses, date syrup, tkemali, and ajika. The date-syrup portion/use evidence and single-recipe pomegranate-molasses/honey note remain source-scoped; no active conversion or substitution rule was added. Package, generated-index, ledger-schema, collision/recipe scans, 9 Python, 275 Android unit, lint, and APK assembly checks passed. Pixel 9a / API 36 picker spot checks returned `harissa` in English and `mélasse de grenade` in fr-CA; connected instrumentation passed 27 of 29 cases with 2 QA-only skips. Independent Québec terminology review and broader Section Y coverage remain open. See batches/wp05-mena-condiments-followup.md.

- WP03 Section G soba follow-up on 2026-10-08: integrated `soba noodles / nouilles de sarrasin` with only `soba` as the EN/fr-CA alias. USDA SR27's 114 g per source cup is stored as a cooked-soba portion observation without cup conversion or density; the USDA ARS replacement note remains blocked because its fresh buckwheat maltagliati target is not cataloged. Package, generated-index, ledger-schema, collision/recipe scans, 9 Python, 275 Android unit, lint, and APK assembly checks passed. Pixel 9a / API 36 picker search `soba` returned the English and fr-CA labels; connected instrumentation passed 27 of 29 cases with 2 QA-only skips. Independent Québec terminology review and broader Section F/G work remain open. See batches/wp03-soba-identity.md.

- WP03 Section G udon follow-up on 2026-10-09: integrated `udon noodles / nouilles udon` with only bilingual `udon` aliases. MAFF, OQLF, Québec usage, MEXT, and one Québec turkey recipe support the identity boundary and source-specific usage; the recipe's 500 mL cooked portion and long-pasta note do not activate a conversion or substitute. No forms or numeric mappings were added. The 412-reference package, 577-record ledger, all 9 Python package tests, 276 Android unit tests, lint, and both APK assemblies passed. Pixel 9a/API 36 picker search returned the English and fr-CA labels; instrumentation reported 27 passes, 2 QA-only skips, and no failures. The probe was discarded and home returned to 114 recipes on a temporary data image; the original AVD was preserved. See `batches/wp03-udon-identity.md`.

- WP05 Section X ube halaya follow-up on 2026-10-09: integrated prepared ube halaya / purple yam jam as a distinct sweet spread. The French display is descriptive and provisional pending independent Québec review; `ube jam` remains inactive as a broad alias. No forms, measurements, or substitutions were added. The 412-reference package, 577-record ledger, 9 Python package tests, 276 Android unit tests, lint, and APK assemblies passed. Pixel 9a/API 36 searches returned the English and fr-CA rows; instrumentation reported 27 passes, 2 QA-only skips, and no failures. The probe was discarded and home returned to 114 recipes on a temporary data image; original AVD data was preserved. See `batches/wp05-ube-halaya.md` and `proposals/wp05-ube-halaya-review-20261009.md`.

- WP05 Section Y Ajvar follow-up on 2026-10-09: integrated `ajvar / ajvar` with only English `ayvar` as a spelling alias. FAO and Serbian appellation evidence support the variable Balkan red-pepper condiment boundary; local Canadian product listings support the name and show variant formulations. No forms, measurements, conversions, package yields, or substitutions were added. The 412-reference package, 577-record ledger, 9 Python package tests, 276 Android unit tests, lint, and APK assemblies passed. Pixel 9a/API 36 searches returned `ajvar` in English and fr-CA; instrumentation reported 27 passes, 2 QA-only skips, and no failures. The probe was discarded and home returned to 114 recipes on a temporary data image; original AVD data was preserved. See `batches/wp05-ajvar-identity.md`.

- WP03 Section G somen and WP05 pandan checkpoint on 2026-10-09: added `somen noodles / somen` as an identity-only row with no aliases because the fr-CA display is already searchable bilingually. OQLF and Japan's MAFF distinguish somen from udon and hiyamugi; Health Canada's cooked-somen portion observations lack a preparation/packing basis, so they remain evidence only. One Kikkoman recipe's 300 g for four and spaghetti option is retained as a source-scoped recipe finding, without a runtime substitution. Added one raw-leaf identity, `pandan leaves / feuilles de pandan`, owned by WP05 and cross-referenced in the plan's two other sections; pandan juice, powder, extract, essence, paste, and kaya remain distinct/open, with independent Québec French review then pending (completed in R345 on 2026-10-16). The package has 414 references (SHA-256 `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e`) and the ledger has 579 records (SHA-256 `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647`). All 277 Android unit tests, 9 Python package tests, lint, APK assemblies, normalizer/package/index checks, and Pixel 9a/API 36 picker checks passed; connected instrumentation reported 27 passes, 2 QA-only skips, and no failures on an isolated temporary data image. The original AVD was restored without the app installed. See `batches/wp03-somen-identity.md` and `batches/wp05-pandan-leaves.md`.

- WP05 Narsharab boundary review on 2026-10-09: leave the identity unresolved against the existing pomegranate molasses row. Azerbaijan's active AZS 065:2023 describes Narsharab within a standardized wild-pomegranate-juice condiment scope, while the official catalogue's English title for the replaced AZS 065-2001 is “Pomegranate molasses”; the current standard's full text and an independent Québec name review were unavailable. No canonical row, alias, or substitution changed. See `proposals/wp05-narsharab-boundary-review-20261009.md`.

- Proposal-only follow-ups on 2026-10-09: hiyamugi is recommended as a separate `GRAIN_AND_CEREAL` identity, with `nouilles hiyamugi` explicitly provisional pending Québec review and no forms, measurements, or substitutions (`proposals/wp03-hiyamugi-identity-20261009.md`). Ginger-garlic paste is recommended as one compound `SAUCE_AND_CONDIMENT` identity, distinct from standalone ginger/garlic pastes; product-specific ratios and recipe spoon amounts remain evidence only (`proposals/wp05-ginger-garlic-paste-identity-20261009.md`). The independent kaya review supports one compound spread identity across pandan and caramel styles, rejects broad `coconut jam` as an alias, and recommends `kaya` in both locales until a Québec French descriptor is confirmed (`proposals/wp05-kaya-compound-spread-review-20261009.md`). These audits used the 414-reference, 16-form, 99-legacy-candidate, 579-record, 114-recipe / 1,123-line package snapshot. No canonical catalog or plan data changed; all three remain proposal-only.

- WP02 Section E / WP04 Section P / WP05 Section W integration on 2026-10-09: narrowed the yeast parent to baker's yeast and added active-dry, instant, compressed, and osmotolerant identities; linked only recipe 072's exact instant-yeast line. Added separate dried-shrimp and dried-scallop identities with source-supported aliases. Added shoyu as an English alias of generic soy sauce, retained tamari as distinct, and removed generic gluten-free tamari aliases. Product-specific package/measure observations, recipe alternatives, and conflicting yeast replacement guidance remain source-scoped; no active density, unit mapping, conversion, yield, or substitution was introduced. The package now has 453 references (SHA-256 52bc70c5d568f09521bb7aae2d28d0c00520edc0e34579e5dda72986d780324c), 17 forms (2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15), and 620 ledger records / 808 source entries (54c1102732a2a89b580f0441ba360bb79f6c3e9b84bf01adc16360751ede3816). The manifest hash is b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984; legacy candidates remain 99 (63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b), with 114 recipes / 1,123 ingredient rows and recipe-corpus digest b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194 (recipe basenames sorted; each basename, NUL, exact file bytes, NUL). Package normalization and generated-index freshness passed, all 9 Python package tests and 282 Android unit tests passed, and the deploy script's test / assemble / install / launch steps succeeded. Pixel 9a / Android 16 (emulator-5556) instrumentation reported 29 cases, 27 passed, 2 environment skips, and 0 failures. Gradle also discovered emulator-5554, ran zero tests there, and reported insufficient install space; this did not affect the 5556 report. Live fr-CA / English picker checks covered dried shrimp/scallop, instant yeast, shoyu/tamari, dark corn syrup, oyster/vegan oyster sauce, and the makhana form hint. Screenshots and per-file hashes are in batches/ingredient-catalog-merge-20261009/README.md. The unsaved probes were discarded and the library remained at 114 recipes. Broad category coverage and independent Québec review remain open.

- WP02 Section E / WP04 Section P / WP05 Section W continuation on 2026-10-09: integrated separate `dried oyster / huître séchée`, `sourdough starter / levain naturel`, and Japanese `white soy sauce / sauce soya extra-claire (shiro shoyu)` identities. The oyster 4-tael FEHD amount remains a source-specific ledger observation without a serving basis or conversion; `Yokhoss` was not activated as a global alias. Sourdough discard/build states and yeast replacement remain inactive; the starter's French wording and shiro's French compound remain provisional pending independent Québec review. No recipe rows were linked. Package: 456 references (`94c76bcee57ffb4759eee5ff0d5778b6a530d5d362cd8a6a66edfa3633463296`), 17 forms (`2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`), 623 ledger records / 831 source entries (`61c8b5bda4dbb10eecda7e7aad842382903a8e7174e929e5a500584b97f382e5`), 99 legacy candidates, and 114 recipes / 1,123 ingredient rows. Package normalization, index freshness, ledger/package validation, 9 Python tests, and 282 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 cases, 27 passed, 2 skipped, and no failures; `emulator-5554` ran zero tests and reported insufficient install space. The deploy script installed and launched on `emulator-5556`; English and fr-CA picker checks passed, the blank probes were discarded, and the French library home remained at 114 recipes. Screenshot hashes are in `batches/ingredient-catalog-continuation-20261009/README.md`. Sections E/P/W and independent Québec terminology review remain open.
- WP05 Section W saishikomi follow-up on 2026-10-09: integrated `saishikomi soy sauce / sauce soya refermentée (saishikomi)` as a distinct Japanese style, with qualified English aliases and provisional Québec French pending terminology review. Kept the Serious Eats 1/2 cup (120 ml) choice source-local; no runtime measure, conversion, substitution, form, or recipe relink was added. Proposal-only WP04 tobiko/masago review remains deferred because the bundled corpus has no roe use; WP02 ammonium-leavener names remain unresolved pending product and independent chemistry/Québec review. The package now has 457 references (`89586580eb03269159e3ada21e6a0310b3fb0cc2f4ce98d2f5f1d71e50422610`), 17 forms, and 624 ledger records / 840 source entries (`bdcc5d8ebf93da1043c13d08d7a70f6eb4ed78a21b3a78053d506c1abd6c381c`). Normalization, generated-index, ledger/package validation, 9 Python tests, and 282 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 cases, 27 passed, 2 skipped, 0 failures; the deploy script installed/launched on `emulator-5556`. English and French picker checks passed, both unsaved drafts were discarded, and the French home returned to 114 recipes. Screenshot hashes are recorded in `batches/ingredient-catalog-continuation-20261009/README.md`. Section W and broader E/P coverage remain open. See `proposals/wp05-saishikomi-soy-sauce-identity-review-20261009.md`, `proposals/wp04-tobiko-masago-roe-boundary-review-20261009.md`, and `proposals/wp02-baking-ammonia-ammonium-leaveners-review-20261009.md`.

- WP05 Section Y Toum checkpoint on 2026-10-09: integrated `toum / sauce toum` with only the source-attested Québec French alias `sauce libanaise à l’ail (toum)`. The English product title stays evidence rather than an alias because its generic `garlic sauce` suffix would match through the picker’s partial-search fallback. Farm Boy, Club House Canada, and Bon pour toi support the identity and terms. No form, package yield, recipe link, or numeric data was added. Preserved lemon remains unmodeled because no bundled ingredient line uses it and the current form model does not distinguish whole salt-cured fruit from rind-only use without recipe-specific evidence. Section Y remains open. See `proposals/wp05-mena-toum-preserved-lemon-followup.md`.

- WP06 North America maple sugar checkpoint on 2026-10-09: promoted the pending `ingredient-ref-maple-sugar` candidate to a distinct `SUGAR_AND_SWEETENER` identity, `maple sugar / sucre d’érable`, on OQLF's direct definition and bilingual pairing. Kept rare Québec terms `sucre du pays` and `sucre d’habitant` out of global aliases because alias scope is not represented. Added no form, measurement, density, mapping, conversion, substitution, or recipe link. English and French picker searches each resolved to the dedicated identity; syrup and the rare terms did not return it. WP06 remains in review with North American recommendations and Mexico/Central America and South America research still open. See `proposals/wp06-north-american-cuisine-gap-sweep-20261009.md` and `batches/wp06-maple-sugar-identity-20261009/README.md`.

- WP06 North America Saskatoon berry checkpoint on 2026-10-09: integrated `Saskatoon berry / amélanche` as `ingredient-ref-saskatoon-berry` in `FRUIT`. OQLF gives the species-qualified Québec French term and limits French Saskatoon to fruit from that region; Canadian Food Focus uses Saskatoon berry for Prairie *Amelanchier alnifolia*. Left broad June-berry, service-berry, shadbush, and blueberry aliases inactive. Added no form, amount, density, conversion, substitution, or recipe link. English and accent-folded French picker searches resolved to the same dedicated row, and broad berry terms did not. WP06 remains in review. See `proposals/wp06-north-american-cuisine-gap-sweep-20261009.md` and `batches/wp06-saskatoon-berry-identity-20261009/README.md`.

- WP06 South America Brazil nut checkpoint on 2026-10-09: added `Brazil nut / noix du Brésil` as a distinct `NUT_SEED_AND_DRIED_FRUIT` identity. OQLF pairs the bilingual term and identifies *Bertholletia excelsa*; the Ministry of Health's regional food contents list three Portuguese names for a North-region fruit entry. No EN/FR aliases were activated, including alternate OQLF terms; no Portuguese names could be represented in the existing alias fields. No form, numeric data, conversion, substitution, or recipe link was added. English and French picker searches resolved to the dedicated row; chestnut, mixed nuts, and alternate terms did not. WP06 remains in review. See `proposals/wp06-south-american-cuisine-gap-sweep-20261009.md` and `batches/wp06-brazil-nut-identity-20261009/README.md`.

- WP06 Mexico and Central America herb checkpoint on 2026-10-09: integrated separate source-named identities for epazote / epazote and hoja santa / hoja santa (HERB), chipilín leaves / feuilles de chipilín (HERB), and loroco / loroco (VEGETABLE_AND_AROMATIC). CONABIO and SADER distinguish epazote and hoja santa; Guatemala SIC names chipilín leaves in one local tamal; El Salvador Travel identifies Fernaldia pandurata and regional loroco use. No aliases, forms, numeric data, conversions, substitutions, or recipe links were added. Proposed French displays remain provisional pending independent Québec review. Package: 465 references (02020683150bbebbaeb51662ac552ee586b082275b52e146faa132f933b0fa44), 17 forms, 631 ledger records / 854 source entries / 747 distinct source IDs (0dd6f8bfe865223227bdd946473b1a9b3901bb7e85dfba7058dd9e61f625d4ac), 99 legacy candidates, and 114 recipes / 1,123 ingredient lines. Package normalization, generated-index freshness, research-ledger validation, 9 Python tests, and 287 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases, 27 passed, 2 skipped, and no failures; deployment and English/French picker checks passed on emulator-5556, the unsaved draft was discarded, and the French home remained at 114 recipes. Screenshots and hashes are in batches/wp06-mesoamerican-herbs-identity-20261009/README.md. WP06 remains in review; regional coverage and independent Québec terminology review stay open.

- WP06 South American condiment checkpoint on 2026-10-09: integrated `merkén / merkén` with source-supported `merquén` and `cassareep / cassareep` with source-supported `casareep`. Chile Travel and CDBP support the dry merkén seasoning identity but differ on cilantro leaf versus seed; the blend remains source-scoped. Guyana Ministry supports cassareep naming, bitter-cassava-juice origin, and culinary use; its reported preserving role is context, not a tested method or safety claim. No form, measurement, conversion, substitution, or recipe link was added; French display terms remain provisional pending independent Québec review. Package: 467 references (`40a04c3a1a1b07c547dbee3fa20d320c883941d1bf0432290d6e8de4d07bbf94`), 17 forms, and 633 ledger records / 857 source entries / 750 distinct source IDs (`7c7ff46e169db1021b6c357485af0a02db812b0070a87699a7fd478b7b55e1ae`). All 9 Python package tests and 288 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures); deployment and English/French `merquen` and `casareep` picker searches passed on `emulator-5556`. The temporary draft was discarded and the French home remained at 114 recipes. Screenshots and hashes are in `batches/wp06-south-american-condiments-identity-20261009/README.md`. WP06 regional coverage and independent Québec terminology review remain open.

- WP06 Southern Cone yerba mate elaborada checkpoint on 2026-10-09: added source-named `yerba mate elaborada / yerba mate elaborada` as an identity-only `HERB` row. The current Argentine Food Code directly defines the dried *Ilex paraguariensis* product and separately names canchada, con palo, despalada/despalillada, toasted, and soluble products. OQLF identifies French `maté` and English `yerba mate` with the plant/infusion, so these are not aliases of the processed ingredient; the fr-CA display remains provisional pending product terminology review. No forms, measurements, conversions, substitutions, or recipe links were added. Package: 468 references (`b6f9e9ee0abe6b44a2a24ab990b846ab59293b5c8cd51d5c0eab8847763429a3`), 17 forms, and 634 ledger records / 861 source entries / 754 distinct source IDs (`66a6d0cd7375343023515828587dad648dc9795f178fc45b0fee2bb005470308`). All 9 Python package tests and 289 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures); deployed English/French picker checks passed on `emulator-5556`, the draft was discarded, and the French home returned to 114 recipes. Screenshots and hashes are in `batches/wp06-yerba-mate-elaborada-identity-20261009/README.md`. Other South American regional coverage and independent Québec terminology review remain open.

- WP06 Amazonian tucupi checkpoint on 2026-10-09: added `tucupi / tucupi` as a distinct `SAUCE_AND_CONDIMENT` identity with no aliases. The Ministry of Health source describes a partially fermented cassava press-liquid sauce; the Fisheries Ministry lists it separately from cassava gum, jambu, and shrimp in tacacá. Keep raw manipueira, cassareep, cassava flour, tapioca starch, cassava gum, and unresolved `tucupi-doce` out of its alias list. No forms, measurements, conversions, substitutions, or recipe links were added; French display remains provisional. Package: 469 references (`8938b9cd5bc23d6b835e90145768c3287cbd86397bfd74b694439563b616f281`), 17 forms, and 635 ledger records / 863 source entries / 755 distinct source IDs (`5022265d490cc4a2d88d97393831a6317b0738a60657b42dbb9ea93387fa92d3`). All 9 Python package tests and 290 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures); the English/French picker checks and French 114-recipe home restoration succeeded on `emulator-5556`. Screenshots and hashes are in `batches/wp06-tucupi-identity-20261009/README.md`. Broader Amazonian and South American coverage and independent Québec review remain open.
- WP06 Amazonian fruit checkpoint on 2026-10-09: integrated `açaí fruit / açaï` as a species-neutral `FRUIT` reference with OQLF-listed English `assai`, and `cupuaçu / cupuaçu` as a separate source-named `FRUIT` row. OQLF and Embrapa document source-specific açaí palm species; no single species was assigned. Cupuaçu remains distinct from cacao, pulp, and seed-derived chocolate-like products. No forms, measurements, conversions, substitutions, or recipe links were added. The 114-recipe scan found no matching ingredient rows. Package: 471 references (`1bf65a37654f72e16981045c242a932d01baac01d64231c23750dcdb72c54e74`), 17 forms, and 637 ledger records / 868 source entries / 758 distinct source IDs (`8a5577f26eee6ec0e1bc46a9d667d437a6192872d002182e33cd8b565f43d7d5`). All 9 Python package tests and 291 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures); English and French picker searches resolved, and the French home was restored at 114 recipes. Screenshots and hashes are in `batches/wp06-amazonian-fruits-identity-20261009/README.md`. Independent Québec terminology review for cupuaçu and broader Amazonian/South American coverage remain open.
- WP06 Amazonian jambu checkpoint on 2026-10-09: integrated `jambu / jambu` as a source-named `HERB` anchored to Embrapa's *Acmella oleracea* and the Fisheries Ministry's separate tacacá component list. Portuguese `agrião-do-Pará` and related terms remain evidence only; no English/French alias to watercress was added. No form, measurement, conversion, substitution, or recipe link was added; the recipe scan found no matching ingredient lines. Package: 472 references (`ac8a45d16036ee41fd01b8b37371feb46c2a300ad3c5834fb569839de307ca41`), 17 forms, and 638 ledger records / 870 source entries / 759 distinct source IDs (`480a3e99095788a13b810e874d78a22288120205d70fc989229b4b51e1cc1581`). All 9 Python package tests and 292 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures); live English/French picker searches resolved, and the French home was restored at 114 recipes. Screenshots and hashes are in `batches/wp06-jambu-identity-20261009/README.md`. French terminology review and broader Amazonian/South American coverage remain open.
- WP06 Amazonian chicória-do-Pará checkpoint on 2026-10-09: integrated `ingredient-ref-culantro` with English display `culantro` and provisional French display `chicória-do-Pará` as a `HERB`. Embrapa identifies *Eryngium foetidum* and its aromatic seasoning use; Health Canada uses `culantro` for that species and lists cilantro separately as *Coriandrum sativum*. The tacacá source lists chicória-do-Pará apart from jambu and other components. Portuguese lookalike terms remain evidence only; no forms, measurements, conversions, substitutions, or recipe links were added. The 114-recipe scan found no hits. Package: 473 references (`052202cb01d157049b3126355539facce3491661510965e4603bac436e1250ce`), 17 forms, and 639 ledger records / 873 source entries / 761 distinct source IDs (`d209ec648678fd167c51cbba31ca22ada249bb36f34d2f341573a1097deca7a7`). Normalization, generated-index freshness, ledger schema, 9 Python tests, and 293 Android unit tests passed. Pixel 9a / API 36 instrumentation on `RecipeBook_Pixel_9a` reported 29 cases (27 passed, 2 skipped, 0 failures); the stock `Pixel_9a` AVD had insufficient install space and ran zero cases. Deployment succeeded on the usable profile; English `culantro` and separate `cilantro`, plus French source-name and English-name queries, were checked live. The temporary draft was discarded and the French library returned to 114 recipes. Screenshots and hashes are in `batches/wp06-chicoria-do-para-identity-20261009/README.md`. French terminology review, pimenta-de-cheiro, and broader Amazonian/South American coverage remain open.
- WP06 Amazonian pimenta-de-cheiro checkpoint on 2026-10-09: added `ingredient-ref-pimenta-de-cheiro` as a `VEGETABLE_AND_AROMATIC` identity using the source name in both language fields. Embrapa describes a variable aromatic *Capsicum chinense* group; no cultivar or fixed pungency was assigned, and pimenta bode, cumari-do-Pará, murupi, habanero, biquinho, and generic pepper terms remain separate. No aliases, forms, measurements, conversions, substitutions, or recipe links were added; the 114-recipe scan found no hits. Package: 474 references (`a5ce30a420717b559969cea09f7ed8b59c68986a78db2321d397939a24e28ba4`), 17 forms, and 640 ledger records / 876 source entries / 763 distinct source IDs (`78b74f0fef8c352ae49f4e91e81d64842c04acf28637e307be5e01a605c139ff`). Normalization, generated-index freshness, ledger schema, 9 Python tests, and 294 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 cases (27 passed, 2 skipped, 0 failures); deployment and English/French picker searches succeeded on `emulator-5556`. The unsaved draft was discarded and the French library returned to 114 recipes. Screenshots and hashes are in `batches/wp06-pimenta-de-cheiro-identity-20261009/README.md`. French terminology review and broader Amazonian/South American coverage remain open.
- WP06 Bahia crude palm oil / azeite de dendê checkpoint on 2026-10-09: added `ingredient-ref-crude-palm-oil` as `crude palm oil (azeite de dendê)` / provisional `huile de palme brute (azeite de dendê)` in `FAT_AND_OIL`. Anvisa reserves azeite de dendê for crude palm oil or fat; Codex distinguishes palm oil from palm-kernel oil and fractions. No aliases, forms, numeric data, conversions, substitutions, or recipe links were added; the 114-recipe scan found no hits. Package: 475 references (`0edcef47371ba3afd77617e275404594f30a7d5a266b35d561b54b585cfbd7e0`), 17 forms, and 641 ledger records / 882 source entries / 769 distinct source IDs (`c117ec1ef3180a670445e2fe3aa38b8502986b182c2085231ded54fc04cebc30`). Normalization, generated-index freshness, ledger schema, 9 Python tests, and 295 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 cases (27 passed, 2 skipped, 0 failures); deployment and English/French picker searches succeeded on `emulator-5556`. The unsaved draft was discarded and the French library returned to 114 recipes. Screenshots and hashes are in `batches/wp06-crude-palm-oil-identity-20261009/README.md`. Québec terminology review and broader Brazilian/South American coverage remain open.
- WP06 Brazil fresh cassava-root checkpoint on 2026-10-09: added `ingredient-ref-cassava-root` as
  `cassava root / manioc` in `VEGETABLE_AND_AROMATIC`. OQLF defines manioc as a root consumed as a
  vegetable or used to prepare tapioca; Codevasf and Embrapa document Brazilian table-root names,
  distinguish table roots from industrial roots, and separate roots from processed products. Keep
  this identity distinct from edible cassava flour, tapioca starch, gari, sago flour, and polvilhos.
  Regional names remain evidence rather than aliases; no forms, numeric data, conversions,
  substitutions, or recipe links were added. The 114-recipe scan found no matches. Package: 476
  references (`d3fc5a123a37273ce0c622b4397899b8ec72cbda72691f4f3067be8ea2da1f67`), 17 forms, and
  642 ledger records / 886 source entries / 773 distinct source IDs
  (`c03d73f7f46cf3585ec6b76f565d91945f8fabd721714716cd6810aaa6ab2c8b`). Normalization, generated
  index, ledger schema, all 9 Python tests, and all 296 Android unit tests passed. Pixel 9a / API 36
  instrumentation reported 29 cases (27 passed, 2 skipped, 0 failures); deployment and English
  `cassava root` plus French `manioc` picker checks passed on `emulator-5556`. The French `manioc`
  query displayed the root separately from flour and starch; the blank draft was discarded and the
  home returned to 114 recipes. Screenshots and hashes are in
  `batches/wp06-cassava-root-identity-20261009/README.md`. Québec French terminology review and
  broader Brazilian/South American coverage remain open.
- WP06 Andean papa seca checkpoint on 2026-10-09: added `ingredient-ref-papa-seca` as `dried
  potato (papa seca) / papa seca` under `VEGETABLE_AND_AROMATIC`, with French wording provisional.
  Perú Travel names papa seca in a carapulcra ingredient list and gives one recipe-specific
  toast/wash/soak/drain sequence; that method was not generalized or stored as conversion data.
  Keep the product distinct from generic potato, potato flour, potato starch, chuño, and tunta. No
  aliases, forms, numeric data, conversions, substitutions, or recipe links were added; the 114-recipe
  scan found no matches. Package: 477 references
  (`eddaa022806187a6bfc67f21f47d86a5caaa39be9ea40fb324731924f13416f1`), 17 forms, and 643 ledger
  records / 887 source entries / 774 distinct source IDs
  (`8a3fb850ebb1741150437e76f432fdf48b33bcb153b468ad629f9bfd436ac7c4`). Normalization, generated
  index, ledger schema, all 9 Python tests, and all 297 Android unit tests passed. Pixel 9a / API 36
  instrumentation reported 29 cases (27 passed, 2 skipped, 0 failures); deployment and the English
  `dried potato` and French `papa seca` picker checks passed on `emulator-5556`. The blank drafts were
  discarded, and the French home returned to 114 recipes. Screenshots and hashes are in
  `batches/wp06-papa-seca-identity-20261009/README.md`. Québec terminology review and Andean product
  boundaries remain open.
- WP06 Andean arracacha-root checkpoint on 2026-10-09: added `ingredient-ref-arracacha` as
  `arracacha root / arracacha` in `VEGETABLE_AND_AROMATIC`, with provisional French wording and the
  source-attested English alias `Peruvian carrot`. ICA distinguishes this root (*Arracacia
  xanthorrhiza*) from ordinary carrot (*Daucus carota*); AGROSAVIA documents 29 recipes using the
  tuberous root, and FAO records arracacha as a French and English common name. The active picker
  displays `arracacha root`, keeps carrot as a separate reference, and shows two distinct choices
  for broad `carrot` search. No other regional aliases, forms, numeric data, conversions,
  substitutions, or recipe links were added; the 114-recipe scan found no matches. Package: 478
  references (`636c90ed02da33623d975c6292f11c3555f1985dc718d466efe33f083f67068e`), 17 forms, and
  644 ledger records / 890 source entries / 777 distinct source IDs
  (`ca74b524af68a834081925c43b09537b190d92ba0d31de24c3bb9fb2c8ac83c9`). Normalization,
  generated-index freshness, ledger schema, all 9 Python tests, UTF-8/no-BOM/escaped-Unicode checks,
  and all 298 Android unit tests passed. Pixel 9a / API 36 instrumentation reported 29 cases
  (27 passed, 2 skipped, 0 failures); deployment and English root/alias/boundary plus French
  `arracacha` picker checks succeeded on `emulator-5556`. The unsaved drafts were discarded and
  the French home returned to 114 recipes. Screenshots and hashes are in
  `batches/wp06-arracacha-identity-20261009/README.md`. Independent Québec terminology review,
  broader Andean/South American coverage remain open.
- WP06 Andean charqui checkpoint on 2026-10-09: added `ingredient-ref-charqui` as
  `charqui (dried salted camelid meat) / charqui (viande de camélidé séchée et salée)` in `PROTEIN`.
  Peru's SEACE specification defines defatted, salted alpaca, llama, or hybrid camelid meat dried or
  dehydrated; OQLF supports French `charqui`; SENASA distinguishes charqui from ovine chalona in one
  regional context. Keep it separate from ordinary jerky, charque, chalona, cecina, and generic
  dried meat; no aliases, forms, numeric data, conversions, substitutions, or recipe links were
  added. The 114-recipe scan found no matches. Package: 479 references
  (`c827616bb3a7d0124575d22a9420974cb1942ef3ce5f59531741a49ad2f742b2`), 17 forms, and 645 ledger
  records / 893 source entries / 780 distinct source IDs
  (`bf3a9b04258d4461f72518aa3465a0aa80b7289c7c22d26707080b931676e617`). Normalization, generated
  index, ledger schema, all 9 Python tests, UTF-8/no-BOM/escaped-Unicode checks, and all 299 Android
  unit tests passed. Pixel 9a / API 36 instrumentation reported 29 XML cases (27 passed, 2 skipped,
  0 failures or errors); deployment and English and French `charqui` picker checks each returned one
  correctly localized result on `emulator-5556`. The unsaved draft was discarded and the French
  home returned to 114 recipes. Screenshots and hashes are in
  `batches/wp06-charqui-identity-20261009/README.md`. Continue South American product-boundary
  research and independent Québec terminology review.
- WP06 Andean huacatay checkpoint on 2026-10-09: integrated `ingredient-ref-huacatay` as the
  source-named culinary identity `huacatay / huacatay` in `VEGETABLE_AND_AROMATIC`. Peruvian food
  sources associate documented culinary use especially with *Tagetes minuta*; INIA's medicinal
  germplasm records also use the common name for *T. terniflora* accessions without documenting
  culinary use. The row makes no universal species claim and has no aliases, forms, numeric data,
  conversions, substitutions, or recipe links. Exact normalized-key review and the 114-recipe,
  1,123-row ingredient scan found no pre-existing owner or recipe use. The 480-reference package
  and 646-record ledger passed normalization, generated-index, schema, 9 Python, UTF-8/no-BOM, and
  300 Android unit checks. Pixel 9a / Android 16 instrumentation reported 29 XML cases (27 passed,
  2 skipped, 0 failures); deployment and live English/French picker searches each returned one
  `huacatay` result, and the French home returned to 114 recipes. Screenshots and artifact hashes
  are in `batches/wp06-huacatay-identity-20261009/README.md`. Independent Québec terminology
  review and broader Andean/South American coverage remain open.
- WP06 Peruvian Amazon cecina checkpoint on 2026-10-09: integrated
  `ingredient-ref-peruvian-amazonian-cecina` as `Peruvian Amazon cecina (smoked, dried meat) /
  cecina de l’Amazonie péruvienne (viande séchée et fumée)` in `PROTEIN`, with provisional fr-CA
  wording. CONCYTEC describes Peruvian Amazon cecina as dried and smoked and says regional
  preparations vary by meat species, seasonings, and smoking method; common pork dishes do not make
  pork universal. Keep this family separate from camelid charqui, charque, chalona, generic jerky,
  and broad dried/smoked-meat terms. No aliases, forms, numeric data, conversions, substitutions,
  package yields, or recipe links were added. The 114-recipe / 1,123-row scan found no matches. The
  pre-integration exact-key audit is recorded in the proposal. Current package: 481 references,
  17 forms, 647 ledger records / 912 source entries / 799 distinct source IDs. Package normalization,
  generated-index, ledger schema, 9 Python tests, UTF-8/no-BOM, and 301 Android unit checks passed.
  Pixel 9a / Android 16 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures);
  deployment and English/French picker searches returned the localized cecina result. The temporary
  draft was discarded and the French home returned to 114 recipes. Screenshots and artifact hashes
  are in `batches/wp06-cecina-identity-20261009/README.md`. Québec terminology and broader South
  American gap review remain open.
- WP06 tropical leafy-greens checkpoint on 2026-10-09: integrated four distinct identities for
  water spinach, Malabar spinach, genus-level jute leaves, and molokhia leaves. The records keep
  water spinach separate from ordinary spinach, Malabar spinach at *Basella* genus scope, and
  molokhia separate from generic *Corchorus* leaves. All are identity-only: no forms, numeric data,
  conversions, substitutions, or recipe links. A 62-key normalized audit found no catalog or recipe
  collisions among 114 recipes / 1,123 ingredient rows. Package: 493 references
  (`2bbb650402dae4437f8d0c0b814b0d445963bdee02777c88dffe1d5a57413a65`), 22 forms, and 664 ledger
  records / 1,010 source entries / 865 distinct source IDs
  (`a67cf228bc05c69b454bdec7e38b297d4d8a29ac3e9397bb2a8d03d3e7aa9477`). Package normalizers,
  generated-index freshness, all 9 Python package tests, and 309 Android unit tests passed. Pixel 9a /
  Android 16 instrumentation reported 29 XML cases (27 passed, 2 skipped, 0 failures or errors);
  deployment and English/French picker checks passed on `emulator-5556`. The temporary drafts were
  discarded and French home returned to 114 recipes. Screenshot hashes and terminology caveats are
  in `batches/wp06-tropical-leafy-greens-identity-20261009/README.md`. Independent Québec/community
  terminology review and broader leafy-green coverage remain open.

- WP06 rocoto checkpoint on 2026-10-09: integrated `ingredient-ref-rocoto-pepper` and five
  source-qualified forms (fresh, whole dried, powder, qacha, and specifically qualified fresh-ground).
  Generic Capsicum names and ambiguous ground/paste/sauce/preserved products remain outside global
  matches. The pre-integration 110-phrase / 101-key audit across 493 references, 22 forms, and 99
  legacy candidates found no rocoto-family exact owner or recipe hit in 114 recipes / 1,123 rows.
  No recipe or numeric/conversion/substitution data changed. Package after the following jackfruit
  checkpoint: 495 references (`da7b807bdca06eb986c474ffc3357a4645b6cb7d3ef47ca1eb3e4d3cdd48a8a8`),
  27 forms (`77714ce34b71f84fc0fc5fe6027d4b54fa7ca58a6816f9028b9a97f5f6cbb053`), and 671 ledger
  records / 1,030 source entries / 881 distinct source IDs
  (`8218d17bd33ef9ecf66ae7b2ce6683c3f0a55a9cfa1a88f2d6fbe4f9fef7a83e`). All 9 Python package
  tests and 311 Android unit tests passed. Pixel 9a / Android 16 instrumentation reported 29 cases
  (27 passed, 2 skipped, 0 failures/errors); deployment and English/French picker checks passed, with
  `rocoto molido` unresolved. See `batches/wp06-rocoto-identity-20261009/README.md` for screenshots
  and hashes. Broader Capsicum boundaries and independent Québec terminology review remain open.
- WP06 jackfruit checkpoint on 2026-10-09: integrated `ingredient-ref-jackfruit` as identity-only
  `jackfruit / jaque`, with `jakfruit / jacque` spelling aliases. No maturity forms, product rows,
  numeric data, conversions, substitutions, or recipe links were added. A 21-phrase coordinator
  re-audit after greens covered 493 references, 22 forms, 99 legacy candidates, and 114 recipes /
  1,123 rows: no active exact/phrase owner or recipe hit; `jack` matched only the inactive Monterey
  Jack legacy row and remains excluded. English `jackfruit` and French `jaque` resolved in the picker;
  `green jackfruit` / `jaque vert` remained unresolved. Final package and verification totals are
  recorded in the preceding checkpoint; Pixel deployment and bilingual QA passed, and the French
  home returned to 114 recipes. See `batches/wp06-jackfruit-identity-20261009/README.md` for
  screenshots and hashes. Maturity/product scope and independent Québec terminology review remain
  open.
- WP02/WP03/WP04 fruit, wheat-meal, and cured-pork checkpoint on 2026-10-10: integrated six scoped fruits, `whole wheat meal`, bacon, pancetta, guanciale, and prosciutto; verified the existing ham identity. Broad salt pork and unqualified `jamón` remain unresolved. No recipe links, forms, conversions, yields, or substitutions changed. Package totals are 676 references, 33 forms, 862 ledger records / 1,518 source entries / 1,284 distinct source IDs, and 85 legacy candidates; the 114-recipe / 1,123-row corpus is unchanged. Package normalization, generated-index freshness, ledger validation, 10 Python tests, 317 Android unit tests, Pixel 9a / Android 16 English and French picker checks, screenshot checksums, and restoration of the French 114-recipe home passed. Baobab pulp is classified as `NUT_SEED_AND_DRIED_FRUIT`; the wheat identity omits the colliding English alias `coarse whole wheat flour`. Other Section M/O/A7 work and independent Québec terminology review remain open. See `batches/wp02-wp03-wp04-fruit-grain-cured-pork-integration-20261010/README.md`.


## 2026-10-10 coordinator checkpoint — rice flour, farro, and Greek yogurt

- Reviewed the Japanese `mochiko` and `shiratamako` product names against MAFF, manufacturer, Québec recipe, and Canadian retailer evidence. Both remain unassigned; the generic glutinous-rice-flour identity and aliases stay unchanged.
- Rechecked unqualified `farro` across OQLF, TERMIUM, federal food-quality, protected-product, Québec retail, and producer evidence. It remains unresolved across species and grain/flour contexts, with no active alias, form, or recipe link.
- Promoted the existing Greek-yogurt candidate to `Greek-style yogurt / yogourt grec`, added `plain Greek-style yogurt / yogourt grec nature`, and relinked the four recipe lines whose source text explicitly says `plain Greek yogurt`. Generic plain yogurt remains separate; the optional `sour cream or plain yogurt` line stays unlinked, and the generic yogurt candidate remains held.
- The catalog now has 677 references and 34 forms. The ledger has 863 records / 1,550 source entries / 1,309 distinct source IDs; 84 legacy candidates remain. The recipe corpus remains at 114 recipes / 1,123 ingredient rows. Full verification and screenshots are recorded in `batches/wp02-wp03-wp04-rice-farro-greek-yogurt-integration-20261010/README.md`.

## 2026-10-10 coordinator checkpoint — rye meal, dried orange zest, and salt pork

- Added `ingredient-ref-rye-meal` (`rye meal / gruau de seigle`, `FLOUR_AND_STARCH`) with TERMIUM-backed `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`, `semoule de seigle`, and `farine à pumpernickel` aliases; general rye-flour grades remain open.
- Added `ingredient-ref-dried-orange-zest` (`dried orange zest / zeste d'orange déshydraté`, `SAUCE_AND_CONDIMENT`) from OQLF terminology. Generic citrus zest, lemon zest, full peel, dried peel, and candied citrus remain separate.
- Rechecked salt pork against OQLF, CFIA, and two Québec retail listings. The broad candidate stays unresolved because the sources identify differing cooked and brined products but do not settle the state or cut intended by every recipe. `salt pork`, `petit salé`, `lard salé`, and `porc salé` remain inactive.
- No recipe links or forms, measurements, density, unit mapping, conversion, yield, or substitution data were added. The corpus remains 114 recipes / 1,123 ingredient rows. The final package has 679 references / 34 forms; the ledger has 865 records / 1,558 source entries / 1,317 distinct source IDs; 84 legacy candidates remain. The reference, forms, ledger, legacy, manifest, and recipe-corpus hashes, all checks, and bilingual Pixel 9a screenshots are in [the batch report](batches/wp02-wp03-wp04-rye-zest-salt-pork-integration-20261010/README.md). All eight screenshot checksums passed; English/French picker queries passed, salt pork remained unresolved, the database retained 114 recipes / 1,123 rows, and the French home returned to 114 recipes. Package validation, generated-index freshness, 10 Python tests, 320 Android unit tests, and 30 instrumentation cases (28 passed, 2 skipped) passed.

## 2026-10-10 coordinator checkpoint — alternative flour identities

- Added identity-only `hazelnut flour / farine de noisette` and `chestnut flour / farine de châtaigne`; kept broad `coconut flour / farine de noix de coco` unresolved because manufacturer and retailer listings use the same names for products with substantially different composition and do not establish a shared process. Hazelnut meal, defatted/roast-qualified hazelnut products, chestnut powder/paste, and water-chestnut flour remain distinct. Independent Québec terminology review remains open.

- 2026-10-10 WP02/WP07/WP08 integration: added ten identity-only Italian tipo 00/0/1/2 and French T45/T55/T65/T80/T110/T150 flour classes; recorded 23 source-qualified chicken egg count-to-edible-mass portions across whole eggs, whites, and yolks; and integrated twelve directional/contextual wheat-flour findings as ledger evidence only. No egg mapping, density, flour runtime rule, recipe relink, or form was added. French flour display constructions remain provisional pending independent Québec review. Package totals, source IDs, checks, and Pixel verification are recorded in `batches/wp02-wp07-wp08-flour-egg-evidence-integration-20261010/README.md`.
- No recipe links or forms, measurements, density, unit mappings, conversions, yields, or substitutions changed. The corpus remains 114 recipes / 1,123 ingredient rows. The final package has 681 references / 34 forms; the ledger has 868 records / 1,566 source entries / 1,325 distinct source IDs; 84 legacy candidates remain. The hashes, source analysis, and eight Pixel 9a screenshots are in [the batch report](batches/wp02-alt-flours-hazelnut-coconut-chestnut-integration-20261010/README.md).
- Package validation, reference normalization, generated-index freshness, ledger validation, 10 Python tests, 322 Android unit tests, and 30 instrumentation cases (28 passed, 2 skipped) passed. English and French picker checks returned both accepted flours and no coconut-flour result; the blank drafts were discarded and the French 114-recipe home restored.

- 2026-10-10 WP02/WP06 focused integration: added four identity-only regional starch references and eight Africa-sweep identities; kept native/pregelatinized as a process boundary and held matooke as unresolved. Updated flour alias search terms after independent Québec review: bare T55/T65 and short Italian type-1/type-2 French aliases are inactive. No recipe links, forms, numeric measurements, conversions, yields, or substitutions were added. The package now has 703 references / 34 forms and 892 ledger records / 1,682 source entries / 1,388 source IDs; 114 recipes / 1,123 ingredient rows remain unchanged. All 10 Python package tests and 322 Android unit tests passed; connected Android 16 instrumentation had 30 cases (28 passed, 2 skipped). Pixel 9a bilingual picker checks and French home restoration passed. Broader WP02 starch coverage, WP06 cuisine coverage, and provisional French labels remain open; see `batches/wp02-wp06-regional-flour-starch-africa-integration-20261010/README.md`.
## 2026-10-10 coordinator checkpoint — Brazilian polvilho and regional boundaries

- Added `ingredient-ref-brazil-polvilho-doce` and `ingredient-ref-brazil-polvilho-azedo` as separate identity-only references with product-specific English cassava-starch descriptors, Brazilian source names visible in the French display fields, no aliases, null density, and empty unit mappings. Do not map either item to generic tapioca starch or infer a conversion. Their French terminology remains provisional, and the recipe scan found no matching rows.
- Reviewed groundnut-paste and red-palm/zomi aliases against product context. No global alias or product-state merge was supported; keep the broader Section Z item open. Rechecked official FDC retrieval routes for chicken-egg portions; no official `food_portion` payload was readable, so no mirror-only values entered the ledger and retrieval remains open.
- The package has 705 ingredient references / 34 forms; the evidence ledger has 894 records / 1,690 source entries / 1,393 source IDs. Recipe corpus remains 114 files / 1,123 ingredient rows. Package, generated-index, ledger, Python, Android unit, instrumentation, and Pixel 9a picker verification are recorded in [the batch report](batches/wp02-wp06-wp07-polvilho-regional-boundary-integration-20261010/README.md).

## 2026-10-10 coordinator checkpoint — almond flour, awaze, and thickening direction

- Kept one almond-flour identity, removed the broad `ground almonds` alias after it collided with whole almonds in the `almonds` search, retained `poudre d'amande`, and added the attested French-market plural `poudre d'amandes`. Almond meal remains unassigned without a stable product boundary or recipe demand.
- Added source-bounded Ethiopian `awaze` as an identity-only condiment reference with narrow English phrases. Its borrowed French display remains provisional; berbere and generic pepper sauces stay separate. No recipe rows, forms, measurements, conversions, yields, or substitutions were added.
- Recorded all-purpose flour → cornstarch as a separate sauce/gravy-thickening direction with a fixed-liquid volume basis. Keep it distinct from cornstarch → flour and inactive at runtime because role, context, method, and quantity basis cannot be enforced.
- Source decisions, live picker searches, package totals, hashes, tests, and Pixel 9a screenshots are in [the focused integration report](batches/wp02-wp06-wp08-banana-plantain-shito-buttermilk-integration-20261010/README.md).

## 2026-10-10 coordinator checkpoint — Ethiopian mitmita

- Added `ingredient-ref-mitmita` as an identity-only `BAKING_AND_SPICE` reference with `mitmita` in both display fields and the source-attested English alias `mitmita powder`. Québec French food material and a regional Ethiopian field study distinguish it from berbere and document its powder identity; no fixed formula or national preparation was inferred. Keep the borrowed French display provisional, generic chili powder separate, and prepared awaze in `SAUCE_AND_CONDIMENT`.
- No forms, numeric data, recipe links, conversions, yields, or substitutions were added. The integration is documented with the same focused package report; package and Pixel checks remain pending after this catalog change.

## 2026-10-10 coordinator checkpoint — hazelnut meal and cultured-dairy substitutions

- Rechecked hazelnut flour versus meal. Kept `hazelnut flour / farine de noisette` and its empty aliases unchanged; left hazelnut meal unassigned because direct manufacturer and industry sources show overlapping names, while one indexed supplier listing distinguishes coarse and fine grades but was not directly accessible. No bundled recipe asks for either product, and no flour forms or measurements were added.
- Recorded four source-bounded Greek-yogurt substitution findings in the ledger: sour cream → plain Greek-style yogurt in selected baked goods, one USU ranch formula, and method-limited soup; plus plain Greek-style yogurt → sour cream for selected uncooked cold uses. Preserved amount, fat, and method limits, kept the older generic-plain-yogurt draft records blocked, and left the runtime arrays and bundled recipe lines unchanged.
- The evidence and decision limits are in the [focused integration report](batches/wp02-wp06-wp08-banana-plantain-shito-buttermilk-integration-20261010/README.md) and the corresponding WP02/WP08 proposal files. Package and Pixel verification remain pending.


## 2026-10-10 residual cohort — arrow-root, white rice, and beef

The 2026-10-10 review integrated three narrowly scoped changes: source-backed label aliases on the
existing extracted arrow-root starch identity; a separate `white rice / riz blanchi` identity with
dry/cooked forms and one exact recipe link; and generic `beef / bœuf` for recipe 015's exact 400 g
line. Recipe 066's optional `Cooked white rice, for serving` line now links to the white-rice cooked
form. No generic rice, ground beef, beef stock, cut, or stew-meat row was merged. Measurements, active
densities, unit mappings, conversions, cooking yields, and substitutions remain absent; arrowroot's
manufacturer cup weights are source-specific ledger observations. The plan remains open for broader
WP02 B2/B3, WP03 Section F, WP04 animal-food coverage, count/edible-portion fixtures, and independent
Québec review.

The package has 753 ingredient references and 36 forms. Research sources and exact fingerprints are
recorded in `batches/wp02-wp03-wp04-arrowroot-white-rice-beef-integration-20261010/README.md`.

## 2026-10-10 coordinator checkpoint — sourdough starter, wrappers, and offal

- Kept maintained sourdough culture under `ingredient-ref-sourdough-starter`; added the sourced fr-CA alias `levain chef` and one `dehydrated_reactivatable` form for a Québec culture explicitly sold for reactivation. Recipe-built levain, discard/activity states, bare `levain`, and ambiguous dried wording remain out of global matches. No recipe line uses this identity.
- Added five identity-only wrapper references: rice-paper sheets, wonton wrappers, gyoza wrappers, wheat spring-roll pastry, and egg-roll wrappers. Generic dumpling wrapper and unqualified spring-roll wording remain unresolved. No bundled recipe line uses a wrapper.
- Reviewed beef, pork, veal, and poultry offal terms against CFIA/OQLF species boundaries; no offal ingredient line exists, so no reference was added. The only `kidney` hit is kidney beans.
- No recipe links, forms for wrappers, densities, measurements, unit mappings, conversions, yields, or substitutions changed. The 114-recipe / 1,123-row corpus is unchanged. Independent Québec terminology review and broader Sections E, G, and O remain open.
- See `batches/wp02-sourdough-state-form-integration-20261010/README.md`, `batches/wp03-section-g-wrappers-integration-20261010/README.md`, and `proposals/wp04-section-o-offal-identity-gap-review-20261010.md` for evidence, picker screenshots, checksums, and verification.

The current package has 867 references / 48 forms and 1,113 ledger records / 2,679 source entries / 2,096 source IDs. The reference JSON SHA-256 is `6fb175c66019050aaef8e8f34a405200eda893bfb3fd67c5acaf77ad3a1cdf95`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; ledger `92192fb3de6c0707ab7ea3ad0e6b0f66ecf40aa348e4a9b40eaf6b60c0b1b040`; generated ingredient index `6ce4dcafaaf076fd59d1c31aecd591f1897a58184424642e6bbfbcdfa2816795`.

Reference/package normalization, generated-index freshness, ledger validation, 37 Python package tests, and 355 Android unit tests passed. Connected Android 16 instrumentation passed 29 of 31 cases with 2 skips; a first run's Compose teardown failure did not reproduce in the isolated rerun or full rerun. `tools/deploy_to_pixel9a_emulator.sh` passed. Disposable Pixel 9a picker searches passed for English/French accepted terms and held generic terms; the French 114-recipe home was restored. All screenshots are 1080×2424 PNGs with passing SHA-256 checks. The original `Pixel_9a` AVD was left untouched; the QA clone was removed.

## 2026-10-10 coordinator checkpoint — baking and bread product boundaries

- Added source-backed aliases to the existing baking-soda and baking-powder references, preserving all 43 exact recipe links and keeping the two identities separate. Added technical aliases to cream of tartar without adding a form or measurement rule.
- Added identity-only cracker crumbs, matzo meal, croutons, corn tortillas, pita bread, and lavash bread; promoted the matching legacy flour-tortilla ID in place. None of these new references has recipe links, forms, density, unit mappings, measurements, conversions, yields, or substitutions. Broad `tortilla` search remains intentionally ambiguous and suggests both qualified tortilla products; chips, crackers, wraps, and generic flatbread remain outside those identities.
- Preserved panko as distinct from generic breadcrumbs and linked only exact recipe lines 019#9, 023#2, and 087#4. Added strawberry puree / purée de fraises for exact recipe line 051#12, retaining its authored amount, unit, source text, and reduced / réduite preparation.
- Kept breakfast sausage and merguez separate, retained recipe 078's ground-lamb alternative as a recipe-local bilingual note, and left recipe 018's source-version conflict unresolved. Chorizo, andouille, kielbasa, and broad rice-noodle identities remain unintegrated because the current bundle has no exact demand or has unresolved product/search boundaries.
- The corpus remains 114 recipes / 1,123 ingredient rows. The package has 876 references / 48 forms; the ledger has 1,121 records / 2,731 source entries / 2,145 distinct source IDs; 77 legacy candidates remain. Reference SHA-256: `3aaf4b0623a6a3fcd69dfbd77cf3cc0935c2be6c0d18bd2b7b71d3e02a6363d8`; ledger SHA-256: `2baa4cf3dca147215d4ab5f4ff17888881669f5d55e2c1bbc3d1ef6e19040425`.
- Reference and package normalization, generated-index freshness, all 37 Python package tests, and all 361 Android unit tests passed. Connected Android 16 instrumentation passed 29 of 31 cases with 2 skips. Deploy, English/French Pixel 9a picker checks, and restoration of the French 114-recipe home passed. See [the batch report](batches/catalog-product-boundary-followup-20261010/README.md) for screenshots, checksums, and other artifact fingerprints.

## 2026-10-10 WP02 / WP03 / WP04 follow-up — yam starch, little millet, tempeh, and stew meat

- Added identity-only `tempeh / tempeh` under `PROTEIN`, with no aliases, forms, density, or unit mappings. Recorded Health Canada CNF food code 4986's cooked soybean-tempeh serving of 150 g as a source-specific portion observation; it is not applied to recipe 095's local, unquantified tempeh variation.
- Recorded held candidates for extracted *Dioscorea* yam starch and little millet (*Panicum sumatrense*) because the exact Québec French displays remain unresolved. `petit mil` remains inactive because OQLF also uses it for foxtail and pearl millet.
- Added source evidence and an unresolved identity state to the existing stew-meat ledger record. The exact recipe link and saved 454 g amount remain unchanged; the publisher's optional chicken, beef, or pork choices stay recipe-specific.
- No recipe, form, active conversion, yield, or reusable substitution changed. The reference package has 888 rows, 48 forms, and 114 recipes / 1,123 ingredient rows; the ledger has 1,138 records. Package validation, ledger/index checks, tests, and Pixel verification are recorded in `batches/wp02-wp03-wp04-yam-little-millet-tempeh-integration-20261010/README.md`.

## 2026-10-11 coordinator checkpoint — CNF produce count portions

- Retrieved the official CNF 2026 Food Name, Measure Name, Measure Type, and Measure Weight Conversion CSVs and joined exact rows for raw garlic (3 g/clove), raw onion (150 g/large), raw carrot (50 g/small, 14 cm), raw leek (89 g/leek), and red-ripe raw tomato (182 g/large whole, 7.6 cm diameter). Separate refuse values remain source qualifiers.
- Added five source-specific observations to the research ledger only. Preserved USDA ERS's distinct 110 g medium onion assumption. Carrot and tomato dimensions do not appear in their recipe lines, so their masses remain unapplied to those demands. No seed reference, recipe, active mapping, form, yield, or substitution changed.
- See `batches/wp04-wp12-cnf-2026-portion-retrieval-integration-20261011/README.md`; the broader count/edible-portion fixtures and remaining category coverage stay open.

## 2026-10-11 coordinator checkpoint — placali identity

- Added `ingredient-ref-placali` as an identity-only regional cassava food in `FLOUR_AND_STARCH`, with `placali` in both display fields and no aliases. Food-science and IITA sources document context-dependent cooked-dough and raw fermented/pressed-pulp usage; Québec retailers attest the French-facing name but do not resolve the state of frozen products.
- Kept placali distinct from generic cassava flour/semolina, gari, lafun, Pupuru, attiéké, and generic fufu/amala. No forms, household measures, density, unit mappings, conversions, yields, substitutions, or recipe links were added. The study-specific flour/water ratio remains source-bound in the proposal, not catalog behavior.
- Package validation, research-ledger checks, search tests, and Android 16 / Pixel 9a picker verification are recorded in `batches/wp02-placali-identity-integration-20261011/README.md`.

## 2026-10-11 WP02 checkpoint — Agbelima hold

- Reviewed Agbelima separately from the active Placali identity. Ghanaian sources identify fermented cassava dough/meal, but the Québec-facing frozen listing combines Placali and Agbelima in one title and does not define their relationship; no standalone Québec French name was established. Keep Agbelima unallocated and add no alias, form, numeric behavior, substitution, or recipe link.
- See `proposals/wp02-agbelima-quebec-identity-boundary-review-20261011.md`; this review does not reopen or alter Placali.

## 2026-10-11 WP04 checkpoint — sweet-potato count portion

- Recorded Cotter Crunch's paired 10 oz / 280 g source-card amount for about two small peeled and cubed sweet potatoes only as the source-specific portion attached to bundled recipe 090#13. The weighing stage remains unknown, so no per-potato mass or reusable conversion was added and the recipe line stayed intact.
- See `proposals/wp04-next-small-sweet-potato-count-portion-review-20261011.md`; the overall count/edible-portion review remains open.

## 2026-10-11 WP04 checkpoint — mashed-banana portion gap

- Reviewed recipe 073#10 against its linked publisher card and CNF 1704. The publisher confirms three very-ripe mashed bananas as 1 1/2 cups but supplies no mass; generic CNF mashed portions do not establish matching ripeness or measurement basis. The banana ledger now records the evidence and unresolved state without adding a numeric observation, density, or mapping.
- The bundled line remains three bananas, count, with its existing very-ripe and mashed preparation. See `proposals/wp04-next-banana-mashed-portion-gap-review-20261011.md`.

## 2026-10-11 WP04 checkpoint — celery stalk portion gap

- Reviewed bundled recipe 077#5 against its linked RICARDO card and existing Health Canada CNF portions. The recipe says one celery branch, cut into small dice, but gives no size or mass; CNF's stalk weights are size-specific. Recorded the direct source and unresolved line decision while retaining the three existing CNF observations. No recipe edit, line-specific weight, trim adjustment, cooked yield, or runtime mapping was added.
- See `proposals/wp04-next-celery-stalk-portion-gap-review-20261011.md`; count-to-mass research remains open.

## 2026-10-11 WP03 Section F checkpoint — puffed sorghum

- Added identity-only `puffed sorghum / sorgho soufflé` with source-attested English aliases `popped sorghum` and `sorghum puffs`. It is a separate ready-to-eat grain product, distinct from raw grain sorghum and sorghum flour. No species/cultivar, puffing method, hull state, density, unit mappings, forms, measurements, recipe links, conversions, yields, or substitutions were added.
- See `proposals/wp03-section-f-puffed-sorghum-identity-review-20261011.md` and `batches/wp03-puffed-sorghum-identity-integration-20261011/README.md`; broader Section F work and independent Québec review remain open.

## 2026-10-11 WP03 Section F checkpoint — sushi-rice wording review

- Independently rechecked current French wording and the dry-product/prepared-rice boundary. Québec retail listings use `riz à sushi` for different grain classes, while Manitoba Health's French guide uses it for cooked, seasoned rice. KitchenAid Canada's 2026 cooker guide uses `Riz à sushi` as a dry-rice program separate from short-grain white rice, but does not establish an ingredient class.
- Keep generic sushi rice as a ledger-only `needs_clarification` candidate. No recipe demand, alias, active reference, or numeric behavior was added; the wider Section F review remains open.
- See `proposals/wp03-section-f-sushi-rice-independent-review-20261011.md`.

## 2026-10-11 WP04 checkpoint — package-count and composition corpus audit

- Scanned all 114 manifest-listed recipes / 1,123 ingredient rows and rechecked current WP04 package/count and composition-sensitive coverage. Nine package/count lines were identified; six already have exact source-specific reviews, while beef broth, half a box of mushrooms, and one box of cranberries lack sufficient source or package-content evidence. The ground-meat qualifier and dairy-choice reviews produced no new reusable composition or conversion evidence.
- No catalog, ledger, recipe, or numeric behavior changed. Keep the WP04 fixture deliverable open and retain the unresolved source/version gaps. See `proposals/wp04-count-package-composition-corpus-audit-20261011.md`.

## 2026-10-11 WP02 checkpoint — banku mix boundary hold

- Reviewed the local English-only `GAF Banku Mix 1kg` listing against Ghanaian technical and manufacturer sources. Keep `banku mix` unallocated because the Québec product has no French display, ingredient panel, or process description; keep cooked banku and its maize/cassava components distinct. Add no reference, alias, form, recipe link, or numeric behavior.
- See `proposals/wp02-banku-mix-quebec-boundary-review-20261011.md`; revisit only when a Québec package or bilingual source resolves the product name and composition.

## 2026-10-11 WP02/WP03/WP04 checkpoint — Mochiko, pot barley, and onion portion

- Added separate identity-only Mochiko and Shiratamako glutinous-rice-flour references while retaining the generic flour and aliases. Promoted pot barley as `pot barley / orge en pot`, distinct from hulled and pearl barley, and kept the conflicting French wording out of aliases. Scoped CNF 2026's `1 large onion = 150 g` portion to recipe 105#3 without changing its count-only line or activating a conversion.
- The package has 954 references / 53 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,223 records / 3,679 source entries / 2,993 distinct source IDs / 8 unit conversions / 0 validation errors. Normalizers, generated index, 108 Python tests, 410 Android unit tests, Android 16/API 36 instrumentation (34 passed, 2 skipped), deployment, and bilingual Pixel 9a picker verification passed. The French broad search showed the generic flour plus both named products; pot barley and hulled barley remain separate. The empty draft was discarded and the French 114-recipe home restored.
- See `batches/wp02-wp03-wp04-mochiko-barley-onion-integration-20261011/README.md`. Independent Québec bilingual approval of `orge en pot`, Mochiko, and Shiratamako remains open.

## 2026-10-11 WP02 checkpoint — rye-meal Québec French review

- An independent source-based review accepts `gruau de seigle` as the rye-meal display and `semoule de seigle` as a French alias, supported by TERMIUM and current Québec ingredient declarations. Keep `farine à pumpernickel` provisional: TERMIUM lists it in the matching product context, but the reviewed Québec product sources did not corroborate that exact phrase. Do not add bare `gruau`, `pumpernickel`, or dark/whole-rye-flour wording as aliases.
- No seed, ledger, recipe, measurement, or substitution data changed. The rye-meal terminology review is complete; rye extraction/grind classes remain open. See `proposals/wp02-rye-meal-quebec-french-independent-review-20261011.md`.

## 2026-10-11 WP06 checkpoint — Caribbean cuisine gap integration

- Promoted the existing pigeon-pea candidate and added identity-only ackee, Scotch Bonnet, Cubanelle, Puerto Rican ají dulce, Haitian djon djon mushrooms, Colombo powder, and bois d’Inde leaves. Added direct Trinidad and Tobago names to culantro, ground cumin, and okra. Spanish terms remain source terminology because the reference schema has only English and French alias fields.
- Kept roselle calyces and Trinidadian pimento pepper unresolved; unqualified sorrel still collides with common sorrel, and pimento pepper lacks a reviewed Québec French name. Other locale-specific names remain out of unscoped aliases. No forms, measurements, densities, conversions, yields, substitutions, or recipe links changed.
- The package has 962 references / 53 forms / 114 recipes / 1,123 ingredient lines; the ledger has 1,233 records / 3,716 source entries / 3,020 distinct source IDs. Three bounded Caribbean language/cuisine sweeps are recorded in `batches/wp06-caribbean-identities-integration-20261011/README.md`; wider island, diaspora, recipe, and independent Québec terminology coverage remains open.

## 2026-10-11 WP03 Section K checkpoint — edible-flower identities

- Added identity-only culinary lavender, rose petals, nasturtium flowers, and dried *Hibiscus sabdariffa* calyces. Product evidence resolved the roselle calyx identity; plant-level `oseille de Guinée`, generic hibiscus/sorrel, ornamental flowers, rose hips, and tuberous nasturtium remain outside those matches. No recipe lines, forms, measurements, conversions, yields, or substitutions changed.
- Seed normalization, package and ledger validation, generated-catalog freshness, and whitespace checks passed; no tests were run for the database-JSON change under `AGENTS.md`. The current package has 1,016 references / 66 forms / 114 recipes / 1,123 ingredient rows and 1,296 ledger records / 4,171 source entries / 3,419 distinct source IDs / 8 unit conversions.
- See `batches/wp03-edible-flowers-identities-integration-20261011/README.md`; other documented edible flowers remain open.

## 2026-10-11 WP03 Section M checkpoint — fruit pitting forms

- Added pitted-only forms for generic dates, Medjool dates, and cherries, using OQLF's Québec French `dénoyauté` wording and exact recipe/product evidence. Kept chopped/lightly packed, fresh/frozen, and dried-state boundaries explicit.
- Recorded the Medjool 425 g / 2½ cup and cherry 460 g / 1 lb amounts as source-specific recipe portions; attached the existing USDA one-pitted-Medjool-date = 24 g observation to the pitted form. No active conversion, pitting yield, recipe edit, or substitution was added.
- The broader fruit qualifier, Section M, and global catalog work remain open. See `batches/wp03-section-m-fruit-pitting-form-integration-20261011/README.md`.


## 2026-10-11 WP02/WP03/WP04 checkpoint — cassava granules, snake gourd, sardines

- Added identity-only Brazilian tapioca granules / `tapioca granulé du Brésil`, scoped to the MAPA irregular-polyhedral `tapioca granulada` subgroup. Generic fufu flour and blends remain held; tapioca pearls remain separate.
- Added snake gourd / `courge serpent` for the cultivated immature fruit of *Trichosanthes cucumerina*, based in part on Québec bilingual seed-catalog wording. Mature fruit and other plant parts remain outside this identity.
- Added European pilchard / `sardine européenne` (*Sardina pilchardus*) and Pacific sardine / `sardine du Pacifique` (*Sardinops sagax*). The generic sardine/pilchard family and preserved products remain unresolved.
- No recipe row matched these candidates. No forms, recipe links, measures, conversions, yields, densities, or substitutions were added. The package has 1,020 references / 69 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,303 records / 4,213 sources / 3,453 distinct source IDs. Package normalization and validation, generated-index freshness, UTF-8/no-BOM, and whitespace checks passed. Tests were skipped under the JSON-only data rule.
- See `batches/wp02-wp03-wp04-starch-gourd-sardine-integration-20261011/README.md` and the linked review proposals. Broader WP02/WP03/WP04 coverage remains open.


## 2026-10-11 WP02 Section E checkpoint — gelling agents and hydrocolloids

- Added 22 source-backed gelling/hydrocolloid references and five presentation forms: agar flakes/powder, gelatin powder/sheets, and psyllium husk powder. Named pectin classes and NH Nappage, kappa/iota/lambda carrageenan, common gums, alginate/cellulose products, and calcium salts are separate identity rows.
- All new catalog values remain identity-only. There are no recipe links, density or unit-mapping defaults, or active conversions/substitutions. The Bon Appétit xanthan-to-psyllium note is recorded only for its exact oat-chia bread formula; no runtime rule was added. The generic low-sugar pectin label remains unresolved.
- Current package: 1,072 references / 77 forms / 114 recipes / 1,123 recipe ingredient rows; ledger: 1,369 records. Package validation and generated-index freshness passed. No tests or emulator were run under the JSON-only exception in `AGENTS.md`.
- See `batches/wp02-section-e-gelling-hydrocolloid-identity-integration-20261011/README.md`; additive-list coverage and independent Québec wording review remain open.


## 2026-10-11 WP03 Sections H–I checkpoint — exact pulse and nut-row gaps

- Added a dried adzuki form linked only to recipe 004#1. Verified generic `nuts / noix` and linked only the optional, species-unspecified crushed-nuts garnish in 031#4; linked the peanut component of 090#17 without changing its cilantro note.
- Recorded Sally's Baking Addiction's 1 cup / 125 g chopped-pecan pair for recipe 114#20 as a recipe-specific ledger observation. The transferable measurement remains blocked; no density, unit mapping, conversion, or chopped form was added.
- Current package: 1,072 references / 78 forms / 114 recipes / 1,123 ingredient rows; ledger: 1,370 records. Package and ledger-schema validation passed. No tests or emulator were run under the database JSON exception in `AGENTS.md`.
- See `batches/wp03-section-h-i-pulses-nuts-gap-integration-20261011/README.md`; broader H/I form, species, and measurement coverage remains open.


## 2026-10-11 WP05 checkpoint — Québec cretons and ketchup identities

- Added identity-only pork cretons, fruit ketchup, and green tomato ketchup, with OQLF, Canadian-English, Québec government, and local product evidence. Kept rillettes, plant-based cretons-style products, generic tomato ketchup, and variably used chow-chow wording separate. No recipe demand, forms, numeric evidence, conversions, yields, or substitutions were added.
- The package has 1,023 references / 69 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,306 records / 4,223 source entries / 3,462 source IDs / 8 unit conversions. Normalizers, package/ledger validation, generated-index freshness, UTF-8/no-BOM, and targeted whitespace checks passed. Tests were not run because this change only adds database JSON data, as specified in `AGENTS.md`. See `batches/wp05-quebec-cretons-ketchup-identities-integration-20261011/README.md`.

## 2026-10-11 WP05 Section W checkpoint — East Asian condiment identities

- Added six identity-only references: sweet bean sauce, tonkatsu sauce, okonomi sauce, gochugaru, zha cai, and Yibin ya cai. The only added alias is English `okonomiyaki sauce` for okonomi sauce. Kept sweet soy sauce distinct, bounded Yibin ya cai to its registered name, and preserved the separate sauce/product categories.
- No matching bundled ingredient rows were found. No forms, recipe links, density or unit mappings, measurements, conversions, yields, or active substitutions were added. The package now has 1,078 references / 78 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,376 records / 4,535 source entries / 3,713 distinct source IDs.
- Package validation, generated-catalog freshness, and ledger-schema validation passed. No tests or emulator were run under the JSON-only data rule in `AGENTS.md`. See `batches/wp05-section-w-east-asian-condiment-identities-20261011/README.md`; the wider Section W review remains open.

## 2026-10-11 WP02 checkpoint — A/B residual flour boundaries

- Removed `farine tout usage non blanchie` from generic all-purpose flour. Added four Health Canada bleached/unbleached volume-portion observations and King Arthur's source-specific 1 cup / 120 g observation; density and unit mappings remain unavailable.
- Added identity-only light rye flour / `farine de seigle claire`, with independently reviewed aliases `white rye flour`, `farine de seigle blanche`, and `farine de seigle légère`. Added identity-only defatted coconut flour / `farine de noix de coco dégraissée`, with no aliases. Medium/dark rye classes and broad coconut flour remain unresolved.
- Current package: 1,080 references / 78 forms / 114 recipes / 1,123 ingredient rows; ledger: 1,378 records / 4,560 source entries / 3,733 distinct source IDs. Package validation, reference normalization, generated-index freshness, ledger-schema validation, encoding, and scoped whitespace checks passed. No tests or emulator were run under the JSON-only data rule in `AGENTS.md`.
- See `batches/wp02-a-b-residual-flour-boundaries-integration-20261011/README.md`; broader A/B and WP02 coverage remains open.


## 2026-10-11 WP05 Section W checkpoint — koikuchi and usukuchi

- Added separate identity-only references for Japanese koikuchi and usukuchi soy-sauce styles, with qualified `koikuchi shoyu` / `usukuchi shoyu` aliases and independently reviewed Québec displays. Kept generic `shoyu`, Chinese-style light/dark soy sauce, shiro shoyu, saishikomi, and tamari on their separate identities.
- No bundled recipe line names either style. No forms, measures, densities, mappings, conversions, yields, or substitutions were added. The package has 1,083 references / 79 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,382 records / 4,590 source entries / 3,755 distinct source IDs.
- Reference/package normalization, package and ledger validation, generated-catalog freshness, exact-name and source-ID checks, no-demand scan, UTF-8/no-BOM, and whitespace checks passed. No tests or emulator runs were needed for these database JSON additions under `AGENTS.md`.
- See `batches/wp05-koikuchi-usukuchi-soy-style-integration-20261011/README.md`; the broader Section W review remains open.


## 2026-10-11 WP02 A6 checkpoint — color-qualified quinoa flour and sprouted amaranth flour

- Added identity-only white, red, and black quinoa flour references and sprouted amaranth flour. Kept generic quinoa and amaranth flour rows unchanged and added no aliases. Independent Québec review accepted all four displays; black quinoa wording is supported by a Canadian French certification annex rather than consumer package evidence, and the sprouted-amaranth French retail evidence names whole sprouted grain rather than flour.
- No matching recipe lines were found; no forms, density, unit mappings, measurements, conversions, yields, or substitutions were added. The package has 1,087 references / 79 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,386 records / 4,613 source entries / 3,773 distinct source IDs.
- Package and ledger validation, reference normalization, generated-index freshness, exact-name/source-ID checks, no-demand scan, UTF-8/no-BOM, and whitespace checks passed. No tests or emulator runs were needed for the database JSON additions under `AGENTS.md`.
- See `batches/wp02-a6-quinoa-amaranth-flour-integration-20261011/README.md`; the broader A6 grain-flour review remains open.

## 2026-10-12 WP05 Section X checkpoint — fermented fish and shrimp pastes

- Added identity-only Malaysian belacan, Indonesian terasi, Philippine bagoong alamang and bagoong isda, and Cambodian prahok. Their descriptive French labels retain each regional name and are not presented as OQLF-standardized terms. Keep broad ngapi held because its sources cover separate fish and shrimp products; kapi, padaek, and liquid fish sauce/patis remain distinct.
- No recipe lines matched these names. No forms, densities, unit mappings, measurements, package yields, conversions, or substitution rules were added. The package has 1,095 references / 79 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,395 records / 4,646 source entries / 3,805 distinct source IDs / 8 unit conversions, including unresolved `candidate-ngapi` held because the unqualified name covers distinct fish and shrimp products.
- Package validation, reference normalization, generated-index freshness, exact-key ownership, recipe-line scan, and UTF-8/no-BOM checks passed. No tests or emulator checks were run because the change only adds database catalog data. See `batches/wp05-fermented-paste-identities-integration-20261012/README.md` and `proposals/wp05-fermented-fish-shrimp-condiments-review-20261011.md`.


## 2026-10-12 WP02/WP03/WP05 identity-only follow-up

- Added species-qualified kodo, proso/common, and foxtail millet flour identities; kept little-millet flour held because its French product name and species scope remain unresolved.
- Added plain black sesame paste as a distinct identity with colour-qualified black-sesame-butter aliases. Kept tahini, Chinese sesame paste, composite products, and the unresolved generic sesame-paste candidate separate.
- Added Thai green curry paste and bottled Thai-style sweet chili sauce as distinct `SAUCE_AND_CONDIMENT` identities. Québec wording is supported by local product/recipe usage; no OQLF standardization claim is made for the product compounds.
- All six new references are identity-only. No recipe lines matched; no forms, densities, unit mappings, measures, yields, conversions, or substitutions were added. The package has 1,101 references / 79 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,401 records / 4,668 source entries / 3,827 distinct source IDs / 8 unit conversions.
- Package normalization/validation, reference normalization, generated-index freshness, ledger-schema validation, exact-key ownership, recipe-demand scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for these database catalog additions under `AGENTS.md`.
- Proposals: `proposals/wp02-a6-next-regional-millet-flours-review-20261012.md`, `proposals/wp03-section-i-black-sesame-paste-boundary-review-20261012.md`, and `proposals/wp05-section-x-green-curry-paste-sweet-chili-review-20261012.md`. Integration notes: `batches/wp02-wp03-wp05-identity-integration-20261012/README.md`.


## 2026-10-12 WP03/WP05 checkpoint — lentil forms and Filipino condiments

- Reviewed lentil whole/split and coated/dehulled states as forms; added no forms without recipe or product demand. Removed the unscoped `lentilles corail` alias from the broad red-lentil identity and kept the phrase unassigned pending form-specific evidence.
- Added identity-only banana ketchup / `ketchup aux bananes` with scoped `banana catsup` and `ketchup à la banane` aliases, plus bottled toyomansi soy sauce with calamansi / `sauce soya toyomansi` with no aliases. Kept fresh table-mixed toyomansi separate. Reassessed the existing padaek identity and retained its current display and aliases without data changes.
- No recipe links, forms, measurements, unit mappings, package yields, conversions, or substitutions were added. The package has 1,103 references / 79 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,403 records / 4,688 source entries / 3,847 distinct source IDs.
- Package normalization and validation, generated catalog freshness, ledger-schema validation, exact-key ownership, recipe-demand scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run.
- See `batches/wp03-wp05-lentil-filipino-condiment-integration-20261012/README.md`; broader Section H forms and WP05 Section X regional-product coverage remain open.


## 2026-10-12 WP03 Section J — regional root and tuber boundary review

- Reassessed arrowhead, eddoe/arvi/dasheen, taro products, malanga/yautía, and true-yam boundaries against Québec terminology, Canadian retail wording, agricultural sources, and the bundled recipe corpus.
- Kept unqualified arrowhead and eddoe terms held; retained the active taro, malanga, and true-yam identities and their separate root/flour/leaf/starch boundaries. The country-scoped Dominican `yautía` alias remains with its existing WP06 proposal owner.
- No active catalog, recipe, or evidence-ledger data changed. The 114-recipe scan found no demand for these terms. The proposal documents the source register and limitations; no tests were run because this review did not change database JSON or code.
- See `proposals/wp03-section-j-regional-tuber-gap-review-20261012.md`; broader Section J discovery and independent Québec terminology review remain open.


## 2026-10-12 WP04 Section R checkpoint — tofu product boundaries

- Added identity-only generic tofu, pressed tofu, silken tofu, smoked tofu, and tofu skin. English bean curd is scoped to generic tofu; block tofu and regular tofu are scoped to pressed tofu; yuba is an English alias for tofu skin.
- Kept softness/firmness as qualifiers, not global identities. Fried tofu remains unresolved between a named retail product and a preparation step. Existing white/red fermented bean-curd references stay separate, and generic fermented-curd wording stays held.
- No bundled recipe rows matched these products. No recipe links, forms, densities, unit mappings, measurements, yields, conversions, or substitutions were added. The package has 1,108 references / 79 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,409 records / 4,698 source entries / 3,856 distinct source IDs / 8 unit conversions.
- Package validation/normalization, generated-catalog freshness, ledger-schema validation, exact-key ownership, recipe-demand scan, and UTF-8/no-BOM checks passed. No tests or emulator checks were run for this database JSON addition under AGENTS.md.
- See batches/wp04-tofu-product-boundaries-integration-20261012/README.md and proposals/wp04-section-r-tofu-product-boundaries-review-20261012.md; broader Section R remains open.


## 2026-10-12 WP05 Section S checkpoint — fats and oils

- Added extra-virgin olive, canola, corn, soybean, sunflower, peanut, and generic sesame oil identities; promoted the legacy peanut-oil ID. Corrected generic vegetable-oil and toasted-sesame-oil aliases and display wording.
- Relinked only the two explicit extra-virgin olive-oil lines and the unqualified sesame-oil line. Kept generic vegetable-oil choices, seven unqualified olive-oil lines, and explicit toasted sesame linked to their existing references.
- No recipe quantity, note, form, density, unit mapping, measurement, yield, conversion, or substitution changed. Package totals are 1,115 references / 79 forms / 114 recipes / 1,123 ingredient rows; 74 legacy candidates; 1,415 ledger records / 4,712 source entries / 3,866 distinct source IDs / 8 unit conversions.
- Package validation/normalization, generated-catalog freshness, ledger-schema validation, exact-key ownership, form/legacy collision checks, recipe-link checks, and UTF-8/no-BOM checks passed. No tests or emulator checks were run for this database JSON update under AGENTS.md.
- See batches/wp05-section-s-fats-oils-integration-20261012/README.md and proposals/wp05-section-s-fats-oils-gap-review-20261012.md; broader Section S remains open.


## 2026-10-12 WP05 Section V checkpoint — vinegar identities

- Verified the existing white-vinegar and apple-cider-vinegar identities with source-backed aliases; omitted the unsupported unqualified English alias `distilled vinegar`. Promoted the existing red-wine, white-wine, and balsamic-vinegar IDs, and added identity-only malt, coconut, and cane vinegars. The generic vinegar ledger now records the distinction from verjus.
- Kept all five audited recipe rows unchanged, including generic vinegar and white vinegar links. Coconut-water, coconut-sap, mixed, and regional/spiced products remain separate or unresolved; sherry, unqualified wine vinegar, broad fruit/palm vinegar, glazes, and preparations remain held. No forms, numeric data, conversions, preservation instructions, or substitutions were added.
- The package has 1,121 references / 79 forms / 114 recipes / 1,123 ingredient rows; there are 71 legacy candidates and 1,418 ledger records / 4,736 source entries / 3,876 distinct source IDs / 8 unit conversions. Package validation and normalization, generated-index freshness, ledger-schema validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates database JSON data under `AGENTS.md`.
- See `batches/wp05-section-v-vinegar-acid-integration-20261012/README.md` and `proposals/wp05-section-v-vinegar-acid-gap-review-20261012.md`; broader Section V remains open.

## 2026-10-12 WP05 Section V checkpoint — acidic juice identities

- Added `fresh lemon juice` and `fresh lime juice` as English aliases on the existing juice references and `jus de lime frais` on lime juice. Added identity-only verjus/verjuice (`sour grape juice`) and tamarind paste references. Reused the existing OQLF verjus and Canadian vinegar-boundary evidence; kept pomegranate molasses unchanged.
- The acid-term scan found no need to relink recipe rows. Existing fresh lemon/lime rows retain their links and preparation state. Bottled-juice subtypes, tamarind water, Narsharab, and broad sour-grape phrases remain unresolved. No forms, numeric data, conversions, preservation instructions, or substitutions were added.
- The package has 1,123 references / 79 forms / 114 recipes / 1,123 ingredient rows; 71 legacy candidates; and 1,420 ledger records / 4,744 source entries / 3,882 distinct source IDs / 8 unit conversions. Package and ledger validation, normalization, generated-index freshness, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for this database JSON update under `AGENTS.md`.
- See `batches/wp05-section-v-acidic-juice-integration-20261012/README.md` and `proposals/wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md`; broader Section V remains open.

## 2026-10-12 WP05 Section V checkpoint — residual acidic-juice boundaries

- Reviewed water-removed lemon/lime concentrates, bottled and brand-specific citrus juice, tamarind
  water/juice/concentrate, and unripe-grape products. Kept the existing same-fruit reconstituted
  aliases and verjuice boundary; held the other product states because the recipe corpus has no exact
  ingredient-row demand and some wording lacks Québec terminology support. Added no catalog or recipe
  data, measurements, conversions, preservation instructions, or substitutions.
- The residual boundary review is complete; revisit individual product states when exact recipe or
  product demand and naming evidence are available. Broader WP05/Section V coverage remains open.
- See `batches/wp05-section-v-acidic-juice-residual-boundaries-review-20261012/README.md` and
  `proposals/wp05-section-v-acidic-juice-residual-boundaries-review-20261012.md`.

## 2026-10-12 WP05 Section V checkpoint — acidity and preservation limits

- Audited 15 vinegar/lemon/lime-related recipe rows against current Canadian class standards and
  current product pages. No row identifies a product with measured acidity, pH, or titratable
  acidity. Regulatory class minima and a single product's 5% acetic-acid label remain research
  observations, not generic catalog defaults or recipe conversions.
- Kept all recipe text and links unchanged. Added no measurements, substitutions, conversions,
  preservation guidance, or ledger rule changes. The plan remains open for exact product and tested
  application evidence before adding any acidity constraint or preservation suitability claim.
- See `batches/wp05-section-v-acidity-preservation-constraints-review-20261012/README.md` and
  `proposals/wp05-section-v-acidity-preservation-constraints-review-20261012.md`.

## 2026-10-12 WP05 Section S checkpoint — regional oils

- Added identity-only walnut, hazelnut, pumpkin-seed, safflower, rice-bran, virgin-coconut, and palm-kernel oils under `FAT_AND_OIL`, with only the reviewed aliases. Kept unqualified coconut oil on its generic reference and palm-kernel oil distinct from crude palm oil and palm fractions.
- Held refined/deodorized coconut mappings, toasted pumpkin-seed oil, high-oleic safflower oil, and red-palm aliases. No ingredient rows matched these products; no forms, numeric data, conversions, yields, or substitutions were added.
- The package has 1,132 references / 79 forms / 114 recipes / 1,123 ingredient rows; 71 legacy candidates; and 1,429 ledger records / 4,762 source entries / 3,899 distinct source IDs / 8 unit conversions. Package and ledger validation, normalization, generated-index freshness, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for this database JSON update under `AGENTS.md`.
- See `batches/wp05-section-s-regional-oils-integration-20261012/README.md` and `proposals/wp05-section-s-regional-oils-and-product-boundaries-gap-review-20261012.md`; broader Section S remains open.

## 2026-10-12 WP04 Section R checkpoint — natto and mycoprotein

- Added identity-only natto and mycoprotein / mycoprotéine references under `PROTEIN`. Kept natto separate from other fermented soy products and mycoprotein separate from mushroom fruiting bodies and finished products.
- Kept soy curls held as a generic identity, retained the existing PST/TVP boundary, and did not create a catch-all plant-based mince/sausage identity. No recipe rows matched; no aliases, forms, numeric data, conversions, yields, or substitutions were added.
- The package has 1,132 references / 79 forms / 114 recipes / 1,123 ingredient rows; 71 legacy candidates; and 1,429 ledger records / 4,762 source entries / 3,899 distinct source IDs / 8 unit conversions. Package and ledger validation, normalization, generated-index freshness, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for this database JSON update under `AGENTS.md`.
- See `batches/wp04-section-r-plant-protein-integration-20261012/README.md` and `proposals/wp04-section-r-remaining-plant-protein-products-gap-review-20261012.md`; broader Section R remains open.

## 2026-10-12 WP05 Section V checkpoint — generic broth

- Added identity-only generic `broth / bouillon` under `STOCK_AND_BROTH` and linked only recipe 090#9, whose ingredient line is unqualified broth. Kept the generic reference separate from beef stock, named broths, concentrates, powders, and consommé.
- The publisher recipe's mention of broth or stock is contextual to that stew; no global equivalence or substitution was added. No quantity, note, form, measurement, conversion, or substitution changed.
- The package has 1,133 references / 79 forms / 114 recipes / 1,123 ingredient rows; 71 legacy candidates; and 1,430 ledger records / 4,764 source entries / 3,900 distinct source IDs / 8 unit conversions. Package and ledger validation, normalization, generated-index freshness, exact-key ownership, recipe-link scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for this database JSON update under `AGENTS.md`.
- See `batches/wp05-generic-broth-identity-integration-20261012/README.md`; broader Section V remains open.


## 2026-10-12 WP05 Section V checkpoint — culinary alcohol identities

- Verified the existing white-wine and mirin identities; added identity-only red wine and sake. Sake keeps the source-listed spelling aliases and qualified `Japanese rice wine`; unqualified `rice wine` stays outside the identity. White/red wine vinegar remain separate.
- Kept dry/sweet as wine-style qualifiers. Hon/shin/shio mirin, mirin-style seasoning, cooking sake, generic cooking wine, Shaoxing beverage/cooking products, and other regional rice wines remain held for product-specific review. The existing mirin and white-wine recipe links remain unchanged; no recipe rows were relinked.
- Added no forms, densities, measurements, conversions, yields, or substitutions. The package contains 1,135 references / 79 forms / 114 recipes / 1,123 ingredient rows; there are 71 legacy candidates and 1,432 ledger records / 4,775 source entries / 3,908 distinct source IDs / 8 unit conversions. Package validation and normalization, generated-index freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates database JSON data under `AGENTS.md`.
- See `batches/wp05-section-v-culinary-alcohol-integration-20261012/README.md` and the proposal `proposals/wp05-section-v-culinary-alcohol-boundary-review-20261012.md`; broader Section V remains open.


## 2026-10-12 WP04 Section R checkpoint — plant beverages and coconut products

- Promoted the oat and almond legacy candidates using `oat beverage / boisson d’avoine` and `almond beverage / boisson d’amande`. Added identity-only soy, rice, and coconut beverages with Québec/Canadian displays; soy and almond use only the directly sourced `soy drink`, `boisson de soja`, and `almond drink` aliases. Coconut beverage has no short aliases because the Québec term can sometimes refer to a coconut-water drink.
- Added identity-only coconut cream / `crème de coco`; verified existing coconut milk and retained its canned alias and three recipe links. Verified cream of coconut as the sweetened product and updated its French display to `crème de coco sucrée`; its recipe link is unchanged. The OQLF coconut-cream source was reused from the existing coconut-butter ledger record.
- No plant-beverage/coconut-cream recipe rows matched. No recipe links were added or changed; no forms, densities, measures, conversions, yields, or substitutions were added. The package contains 1,141 references / 79 forms / 114 recipes / 1,123 ingredient rows; there are 69 legacy candidates and 1,436 ledger records / 4,793 source entries / 3,920 distinct source IDs / 8 unit conversions. Package validation and normalization, generated-index freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates database JSON data under `AGENTS.md`.
- See `batches/wp04-section-r-plant-beverages-coconut-boundaries-integration-20261012/README.md` and the proposal `proposals/wp04-section-r-plant-beverage-coconut-boundaries-review-20261012.md`; broader Section R remains open.


## 2026-10-12 WP05 Section S checkpoint — animal fats and margarine

- Added identity-only lard, leaf lard, rendered pork fat, beef suet, edible tallow, and rendered duck fat; promoted the existing vegetable-shortening candidate and verified margarine. Kept lard/leaf lard/rendered pork fat, suet/tallow, and shortening/margarine distinct.
- Preserved all six margarine recipe links and left the sole `oil spray` ingredient row unlinked because its source oil and delivery format are unspecified. Goose/chicken fats, generic poultry fat, baking spreads, and generic shortening wording remain held. No recipe rows, forms, numeric data, conversions, yields, or substitutions changed.
- The package has 1,148 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,442 ledger records / 4,814 source entries / 3,934 distinct source IDs / 8 unit conversions. Static package and ledger validation, normalization, generated-index freshness, exact phrase ownership, recipe checks, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates database JSON data under `AGENTS.md`.
- See `batches/wp05-section-s-animal-fats-integration-20261012/README.md` and `proposals/wp05-section-s-animal-fats-spreads-gap-review-20261012.md`; broader Section S remains open.


## 2026-10-12 WP04 Section R checkpoint — plant replacement products

- Added identity-only `plant-based yogurt substitute / substitut de yogourt végétalien` and `vegan cheese substitute / substitut de fromage végétalien`, using the OQLF-defined product scopes and source-listed substitute terms. The former is a fermented plant-origin product; the latter is the vegan subclass made from plant or fungal ingredients. Broader partial cheese replacements and dairy products remain separate.
- Held generic plant cream, whipping alternatives, butter/spreads, cream-cheese alternatives, and the generic egg-substitute candidate because labels and product composition vary. Kept aquafaba, flax, chia, and purées as natural ingredients, separate from formulated replacements.
- No recipe rows matched the new identities. No recipe links, forms, density, unit mappings, measurements, conversions, yields, or substitutions were added. The package has 1,151 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,445 ledger records / 4,826 source entries / 3,946 distinct source IDs / 8 unit conversions. Static data checks passed; no tests or emulator checks were run for this JSON-only change.
- See `batches/wp04-section-r-plant-replacements-integration-20261012/README.md` and `proposals/wp04-section-r-plant-dairy-replacements-and-egg-replacers-boundary-review-20261012.md`.

## 2026-10-12 WP05 Section S checkpoint — garlic-infused oil

- Added identity-only `garlic-infused oil / huile infusée à l’ail` with no aliases. Kept base-oil species and chopped-garlic-in-oil preparations separate; preserved the existing chili oil and Chiu Chow chili-crisp identities.
- Held scallion oil, annatto oil, generic infused-oil phrases, and source-unspecified oil spray. Recipe 033#8 remains unlinked because the recipe does not identify the oil or spray product. No matching rows need the new identity.
- No forms, density, unit mappings, measures, conversions, yields, or substitutions changed. The package has 1,151 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,445 ledger records / 4,826 source entries / 3,946 distinct source IDs / 8 unit conversions. Static data checks passed; no tests or emulator checks were run for this JSON-only update.
- See `batches/wp05-section-s-infused-oil-integration-20261012/README.md` and `proposals/wp05-section-s-infused-oils-cooking-spray-boundary-review-20261012.md`.


## 2026-10-12 WP05 Section V checkpoint — water and sparkling water

- Verified the existing plain-water identity using CFIA bilingual packaged-water common-name guidance. Added identity-only sparkling water / `eau pétillante`, with OQLF-supported `eau gazeuse`, `eau gazéifiée`, `eau de Seltz`, `carbonated water`, `soda water`, `seltzer water`, and `seltzer` aliases.
- Kept bare `soda`, club soda, tonic, flavoured/sweetened beverages, source-defined mineral/spring water, and stocks/broths distinct. Held standalone ice identity/form modeling: the corpus has two ice-water rows linked to water but no standalone ice ingredient; other uses are process/equipment references. No recipe lines need relinking.
- No forms, numeric data, conversions, yields, or substitutions were added. The package has 1,152 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,448 ledger records / 4,841 source entries / 3,956 distinct source IDs / 8 unit conversions. Static package, ledger, alias, recipe, encoding, and whitespace checks passed; no tests or emulator checks were run for this JSON-only update.
- See `batches/wp05-section-v-water-sparkling-ice-integration-20261012/README.md` and `proposals/wp05-section-v-water-sparkling-water-ice-boundary-review-20261012.md`.


## 2026-10-12 WP04 Section R checkpoint — textured vegetable protein forms

- Added four OQLF-listed commercial shape forms beneath the existing generic TVP identity: flakes, small pieces, strips, and balls. A current Québec manufacturer product supports the strip presentation, while its brand/product wording remains scoped to that SKU.
- Kept generic `soy curls` unresolved: the phrase is product-specific and the reviewed Québec product has a different ingredient description than the branded whole-soybean product. PST/TSP remains a soy-only subtype rather than a generic TVP alias. Formulated plant mince and sausage products remain product-specific.
- No bundled recipe rows matched. No recipe links, dry/rehydrated states, measures, densities, unit mappings, hydration ratios, conversions, yields, or substitutions were added. The package has 1,152 references / 83 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,453 ledger records / 4,853 source entries / 3,962 distinct source IDs / 8 unit conversions. Static data validation passed; no tests or emulator checks were run for this database JSON change.
- See `batches/wp04-section-r-tvp-shape-forms-integration-20261012/README.md` and `proposals/wp04-section-r-plant-protein-product-forms-followup-20261012.md`.


## 2026-10-12 WP05 Section S checkpoint — goose and chicken fats

- Added identity-only `goose fat / graisse d’oie` with `gras d’oie` as the only French alias; no rendering process is asserted. Added `rendered chicken fat / gras de poulet fondu` with the source-backed English alias `chicken schmaltz`; its French wording is supported by a Canadian manufacturer's compound-product ingredient label.
- Kept goose and chicken distinct from rendered duck fat. Kept raw chicken abdominal fat tissue, plain `gras de poulet`, generic poultry fat/gras de volaille, and bare `schmaltz` outside active aliases and identities. The remaining baking-spread boundary stays open.
- No bundled recipe rows matched either new identity. No links, forms, measures, densities, conversions, yields, or substitutions were added. The package has 1,154 references / 83 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,456 ledger records / 4,866 source entries / 3,975 distinct source IDs / 8 unit conversions. Static package, ledger, collision, recipe, encoding, and whitespace checks passed; no tests or emulator checks were run for this JSON-only update.
- See `batches/wp05-section-s-poultry-fats-integration-20261012/README.md` and `proposals/wp05-section-s-animal-fat-poultry-species-followup-20261012.md`.


## 2026-10-12 WP04/WP05 follow-up checkpoint — oils, replacements, vinegar, coffee, and tea

- Added identity-only grapeseed oil / `huile de pépins de raisin` and promoted the exact avocado-oil legacy candidate. Kept neutral/mixed-oil wording and source-unspecified oil spray out of active aliases. No recipe rows matched.
- Added separate generic wine vinegar and sherry vinegar identities with empty aliases. Kept protected `Vinagre de Jerez`, red/white wine vinegar, fruit, maple, and broad palm-vinegar boundaries distinct or held. No vinegar recipe lines matched.
- Added plant-based whipping cream / `crème à fouetter à base de plantes` and a narrower plant-based butter-substitute identity. The aliases are `vegan butter` and `beurre végane`; broad `plant butter`, `beurre végétal`, and baking-spread wording remain held after reconciling the WP04 and WP05 reviews.
- Added dry roasted coffee, whole-bean and ground forms, instant coffee, black tea, and green tea. Existing brewed-coffee and espresso-powder links remain unchanged; matcha stays separate and cocoa/malt drink mixes remain held.
- No new recipe links, measurements, conversions, yields, or substitutions were added. The package has 1,164 references / 85 forms / 114 recipes / 1,123 ingredient rows; 67 legacy candidates; and 1,465 ledger records / 4,893 source entries / 4,002 distinct source IDs / 8 unit conversions. Static package, ledger, generated-index, exact-key, recipe-demand, encoding, and whitespace checks passed; no tests or emulator checks were run for these JSON-only changes.
- See `batches/wp05-section-s-oils-followup-integration-20261012/README.md`, `batches/wp05-section-v-wine-vinegar-followup-integration-20261012/README.md`, `batches/wp04-section-r-plant-cream-spread-followup-integration-20261012/README.md`, `batches/wp05-section-v-coffee-tea-followup-integration-20261012/README.md`, and `proposals/wp05-section-s-baking-spread-product-boundaries-followup-20261012.md`.


## 2026-10-12 WP05 Section W checkpoint — takuan

- Added identity-only `takuan (pickled daikon) / takuan (radis daïkon mariné)` with empty aliases. Kept the identity separate from generic daikon, generic pickled radish, and the separately marketed sweet Korean-style product. The 114-recipe / 1,123-row corpus has no match; no links, forms, measurements, conversions, yields, or substitutions changed.
- The package has 1,165 references / 85 forms / 114 recipes / 1,123 ingredient rows; 67 legacy candidates; and 1,466 ledger records / 4,899 source entries / 4,008 distinct source IDs / 8 unit conversions. Static package, ledger, generated-index, exact-key, recipe, encoding, and whitespace checks passed. No tests or emulator checks were run for this JSON-only change.
- See `batches/wp05-section-w-takuan-integration-20261012/README.md`.


## 2026-10-12 WP05 Section S and V checkpoint — deodorized coconut oil and juice identities

- Added identity-only deodorized coconut oil / `huile de noix de coco désodorisée`, with only the
  French search alias `huile de coco désodorisée`. Generic and virgin coconut oils remain separate;
  refined, neutral, RBD, and related wording is not mapped globally.
- Added identity-only coconut water / `eau de coco`, tomato juice / `jus de tomates`, and vegetable
  juice / `jus de légumes`. The only additional juice aliases are the standard-backed mixed-vegetable
  terms. Keep coconut water distinct from coconut beverage/milk, and tomato juice distinct from
  vegetable juice, tomato cocktail, and concentrate. No recipe lines matched.
- Added no recipe links, forms, measurements, density, unit mappings, conversions, yields, or
  substitutions. The package has 1,169 references / 85 forms / 114 recipes / 1,123 ingredient rows;
  67 legacy candidates; and 1,470 ledger records / 4,909 source entries / 4,017 distinct source IDs /
  8 unit conversions. Static package, reference-normalization, generated-index, ledger, exact-key,
  recipe-scan, encoding, and whitespace checks passed. No tests or emulator checks were run for this
  additive database-JSON change under `AGENTS.md`.
- See `batches/wp05-section-s-deodorized-coconut-oil-integration-20261012/README.md`,
  `batches/wp05-section-v-juice-identities-integration-20261012/README.md`, and the proposal packets
  under `proposals/`; broader Sections S and V remain open.


## 2026-10-12 WP05 Section V checkpoint — stock and broth identities

- Promoted chicken stock / `fond de poulet` from its legacy candidate and split vegetable stock /
  `fond de légumes` from vegetable broth / `bouillon de légumes`. Added fish stock / `fumet de
  poisson`, three flavor-qualified bouillon-cube identities, and the Better Than Bouillon base family.
  Removed `vegetable broth` from the vegetable-stock aliases and removed Better Than Bouillon from the
  generic broth-concentrate aliases. Generic broth concentrate remains provisional for 044#5.
- Relinked only 099#3 to Better Than Bouillon base and 105#2 to vegetable broth. Preserved their
  source wording, quantities, and recipe notes. Beef broth, generic broth, and low-salt chicken broth
  links remain as they were. No forms, measures, density, unit mappings, conversions, yields, or
  substitutions were added; cube reconstitution directions remain inactive.
- The package has 1,176 references / 85 forms / 114 recipes / 1,123 ingredient rows; 66 legacy
  candidates; and 1,476 ledger records / 4,926 source entries / 4,033 distinct source IDs / 8 unit
  conversions. Package/reference normalization and validation, generated-index freshness, ledger,
  exact-key ownership, exact-row checks, encoding, and whitespace checks passed. No app tests or
  emulator checks were run for this bundled database-JSON update.
- See `batches/wp05-section-v-stock-broth-identities-integration-20261012/README.md` and the source
  proposal; stock concentrates, consommé, demi-glace, generic dashi/fish broth, cubes and powders
  beyond the named products remain open.

## 2026-10-12 WP05 Section V checkpoint — cooking-wine product boundaries

- Reviewed salted white and red cooking wine, salted Shaoxing cooking wine, mirin-style sweet
  cooking seasoning, shio mirin, and the broader `cooking wine / vin de cuisine` wording. Product
  labels show distinct named formulations, while the generic umbrella does not identify one
  composition. Keep each named product class separate from plain wine or mirin if a recipe later
  specifies it; do not add active references or aliases while the bundled corpus has no matching
  demand.
- Recipe 066#9 requests only unqualified mirin; 096#4 requests plain white wine. No recipe specifies
  a salted or sweetened cooking product. No forms, recipe links, measurements, conversions, yields,
  or substitutions changed. The T&T Huadiao/rice products and Mizkan sweet cooking seasoning remain
  held pending package ingredient declarations and exact recipe demand.
- This review changed documentation only. No database files were changed, so no tests or emulator
  checks were needed. See `batches/wp05-section-v-cooking-wine-boundary-review-20261012/README.md`
  and `proposals/wp05-section-v-salted-cooking-wines-boundary-review-20261012.md`.

## 2026-10-12 WP05 Section V checkpoint — named fruit juices

- Added identity-only apple, grape, grapefruit, orange, and pineapple juice references in the `FRUIT`
  category. Each has only the source-named same-fruit ready-to-use `from concentrate` and
  `reconstituted` aliases. Added the same bounded aliases to the existing lemon/lime juice owners.
  Keep the water-removed concentrate as a separate product and keep generic fruit juice, nectars,
  blends, drinks/cocktails, and brand-specific bottled citrus products held.
- No recipe rows matched; existing recipe links are unchanged. No forms, default densities, unit
  mappings, yields, or substitutions were added. The current package has 1,181 references / 85 forms /
  114 recipes / 1,123 ingredient rows; 66 legacy candidates; and 1,481 ledger records / 4,945 source
  entries / 4,038 distinct source IDs / 8 unit conversions. Package normalization, generated-index
  freshness, ledger validation, normalized exact-key ownership, encoding, and whitespace checks
  passed. No app tests or emulator checks were run because this change only adds database JSON data.
- See `batches/wp05-section-v-fruit-juice-residual-integration-20261012/README.md` and its
  source-backed proposal.

## 2026-10-12 WP05 Section X checkpoint — Thai paste identities

- Added identity-only Thai yellow curry paste, Panang curry paste, Massaman curry paste, nam prik
  pao, and pla ra. Massamun is a bounded spelling alias for the Massaman paste; nam phrik phao is
  the only nam prik pao spelling alias. Pla ra uses a transparent Canadian French descriptor.
- Reviewed the existing unqualified red curry-paste reference against product and Québec French
  evidence. Thai red curry paste is a named style, but neither the current reference nor recipe 095
  can be assigned to it from the available sources. The archived RecipeKeeper export has a null
  `sourceUrl` and only an unqualified bilingual product request, so the current reference and aliases
  remain unchanged pending source provenance or recipe-owner confirmation.
  Retained green curry paste, Kapi, padaek, and other regional fermented-paste identities. No
  bundled recipe rows request the new names, and no recipe links changed. No forms, measurements,
  density, unit mappings, conversions, yields, or substitutions were added.
- See `batches/wp05-section-x-thai-paste-identities-integration-20261012/README.md` and the
  source-backed proposal. The overall Section X item remains open.

## 2026-10-12 WP05 Section V checkpoint — named spirit identities

- Added identity-only rum / `rhum`, whisky / `whisky`, vodka / `vodka`, and grappa / `grappa` in
  `OTHER`. Added only `whiskey` as the bilingual spelling alias for whisky.
- Kept generic eau-de-vie and generic liqueur/cordial unallocated. Preserved the existing brandy /
  `eau-de-vie de vin` and Frangelico entries and their recipe links unchanged. No bundled recipe row
  requests the newly added spirit classes; no forms, measures, numeric behavior, conversions,
  yields, or substitutions changed.
- See `batches/wp05-section-v-spirit-identities-integration-20261012/README.md` and the
  source-backed residual review. The broader Section V item remains open.

## 2026-10-12 WP05 Section X checkpoint — pure pandan leaf powder form

- Added `pandan leaf powder / poudre de feuilles de pandan` as one dry `powdered` form under the
  existing `pandan leaves / feuilles de pandan` herb identity. A Canadian retailer's named product
  page declares 100% pure pandan leaf powder, and the Canadian French brand listing supplies the
  fr-CA display wording. A second Canadian listing calls one pure-leaf SKU “Pandan Powder”; that
  single product does not justify bare `pandan powder` as a global alias or match term.
- Kept leaf juice, extract powder, essence, and paste separate from the raw-leaf identity. Added no
  density, unit mapping, measure, conversion, yield, recipe link, or substitution. No recipe row
  matches pandan; the 114-recipe / 1,123-ingredient-row corpus remains unchanged.
- The package has 1,190 references / 86 forms / 114 recipes / 1,123 ingredient rows and 66 legacy
  candidates. The ledger has 1,491 records / 4,974 source entries / 4,057 distinct source IDs / 8
  unit conversions. Static package validation, normalization, reference normalization, generated-
  index freshness, ledger validation, form/key ownership, recipe demand, UTF-8/no-BOM, and scoped
  whitespace checks passed. No app tests or emulator checks were run because this batch only adds
  database JSON data. The independent Québec French display review was completed in R345 without
  broadening labels or aliases; see `batches/wp05-section-x-pandan-leaf-powder-form-integration-20261012/README.md`.

## 2026-10-12 WP05 Section V checkpoint — beer, cider, and fortified-wine boundaries

- Reviewed beer and named beer-style distinctions, alcoholic cider and cider subtypes, and the
  boundaries for sherry, port, Madeira, Marsala, and vermouth against CFIA/ACIA, OQLF, and
  appellation sources. No bundled ingredient row requests one of these candidates, so activation,
  recipe links, and numeric behavior remain held. Keep protected-origin products separate from
  similarly styled products and keep beer/cider regulatory thresholds out of recipe conversions,
  alcohol-retention assumptions, or substitutions.
- The audit still covers the current 114-recipe / 1,123-ingredient-row corpus (SHA-256
  `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`). The current package has
  1,190 references / 85 forms / 66 legacy candidates; the ledger has 1,490 records / 4,968 source
  entries / 4,054 distinct source IDs / 8 unit conversions. No catalog or recipe data changed.
- Documentation only; no tests or emulator checks were run or needed. See
  `batches/wp05-section-v-beer-cider-fortified-wine-boundary-review-20261012/README.md` and
  `proposals/wp05-section-v-beer-cider-fortified-wine-review-20261012.md`. The overall Section V
  item remains open.


## 2026-10-12 WP02/WP05 catalog review integration

- Integrated separate identity-only ammonium bicarbonate / `bicarbonate d’ammonium` and ammonium carbonate / `carbonate d’ammonium` references. Bounded bicarbonate aliases are active; ambiguous baker’s/baking ammonia, hartshorn, and sal volatile stay unresolved, and ammonium-carbonate composition remains product-specific. No recipe rows matched. See `batches/wp02-ammonium-leavener-identities-integration-20261012/README.md`.
- Updated ras el hanout with EN alias `Moroccan seasoning` and updated dukkah to FR display `dukka`, FR alias `dukkah`, and EN alias `duqqa`. Held FR `épices couscous` and preserved baharat regional boundaries. No recipe lines or prose matched. See `batches/wp05-regional-spice-blends-terminology-integration-20261012/README.md`.
- Rechecked malt-flour, extract, syrup, activity, and improver boundaries. The five active flour references remain unchanged; zero of 114 recipes / 1,123 rows demand a new malt row or form. Section E remains open; see `proposals/wp02-malt-extract-diastatic-boundary-review-20261012.md`.
- Resulting package: 1,192 references / 86 forms / 114 recipes / 1,123 rows; ledger: 1,493 records / 5,009 source entries / 4,086 distinct source IDs / 8 unit conversions. Package validation, reference normalization, generated-index freshness, and ledger validation passed. No tests or emulator checks were run for these catalog-data changes.

## 2026-10-12 WP02 A/B rye alias and boundary follow-up

- Added the current Québec mill wording `farine de seigle entière` as a French alias on the existing
  whole rye flour identity. Kept unqualified dark rye flour unresolved because supplier descriptions
  do not establish one shared milling scope. Existing light, medium, whole, generic rye flour, and rye
  meal identities remain separate.
- No recipe rows, forms, numeric behavior, conversions, yields, or substitutions changed. Static
  package validation, generated-catalog freshness, exact-key ownership, UTF-8/no-BOM, and scoped
  whitespace checks passed. No tests or emulator checks were needed for this database-JSON-only
  change; see `batches/wp02-whole-rye-alias-dark-rye-boundary-integration-20261012/README.md`.


## 2026-10-12 WP03 Section F checkpoint — wheat flakes

- Added identity-only `wheat flakes / flocons de blé` as `GRAIN_AND_CEREAL`. Recorded Yupik’s
  1/3 cup (30 g) serving as a brand-specific ledger observation; its rolled-oats replacement claim
  remains blocked pending recipe-specific evidence. No aliases, forms, active measures, conversions,
  mappings, yields, recipe links, or substitutions were added.
- No bundled recipe phrase matched. Farro, generic sushi rice, pearled hominy, pozole corn, and the
  wider Section F review remain open. No tests or emulator checks were run because this only adds
  database JSON data. See `batches/wp03-section-f-wheat-flakes-integration-20261012/README.md`.

## 2026-10-12 WP04 Section P checkpoint — red hake

- Added species-qualified `red hake / merluche-écureuil` for *Urophycis chuss* as an identity-only
  `PROTEIN` reference. Generic hake/merluche, generic pollock, Atlantic pollock, and bare `goberge`
  remain held. No recipe links, aliases, forms, measurements, conversions, yields, or substitutions
  were added.
- No bundled recipe phrase matched. No tests or emulator checks were run because this only adds
  database JSON data. See `batches/wp04-section-p-red-hake-integration-20261012/README.md`; the wider
  Section P review remains open.


## 2026-10-12 WP03 Section F checkpoint — amaranth flakes

- Added identity-only `amaranth flakes / flocons d'amarante` as `GRAIN_AND_CEREAL`. Canadian retail
  evidence supports a standalone English product; a Québec ingredient declaration attests the French
  phrase, and OQLF supports the base noun. The retailer's pre-cooked description remains product-
  specific; no form, measure, numeric behavior, recipe link, or substitution was added.
- The full bundle has no matching phrase. No tests or emulator checks were run because this adds only
  database JSON data. See
  `batches/wp03-section-f-amaranth-flakes-integration-20261012/README.md`; Section F remains open.

## 2026-10-12 WP04 Section P checkpoint — cuttlefish / seiche

- Promoted the held `ingredient-ref-cuttlefish` candidate to identity-only `cuttlefish / seiche` in
  `PROTEIN`. OQLF supplies the Québec food-mollusc term and *Sepia* scope; CFIA pairs the generic
  name with *Sepia* spp. and *S. pharaonis*, while Canadian and Québec listings corroborate consumer
  product naming. The exact species remains unspecified.
- Kept squid/calamari and octopus separate; did not add `seiches`, species names, `Sepia`, ink, or
  processed products as aliases/forms. No recipe link, form, measure, density, unit mapping,
  conversion, yield, or substitution was added. The 114-recipe bundle has no cuttlefish row.
- No tests or emulator checks were run because this integration only adds database JSON data and its
  generated index under `AGENTS.md`. See
  `batches/wp04-section-p-cuttlefish-identity-integration-20261012/README.md`. Other Section P
  identities and broader species/product work remain open.

## 2026-10-12 WP02 A6 checkpoint — brown-top millet flour hold

- Confirmed brown-top millet flour as a distinct open product candidate, but kept it unallocated
  because current Canadian/Québec evidence does not establish a French display. FSSAI identifies
  brown top as *Urochloa ramosa* and defines a mixed-millet-flour class; manufacturer pages list
  brown-top flour, but not a Québec label.
- Kept `farine de millet brun` off the proposed *U. ramosa* identity because current French retail
  evidence declares *Panicum miliaceum*. The maker-specific activated/soaked process and regional
  product wording remain inactive. No aliases or runtime behavior were added; no recipe requests
  this flour.
- No catalog data changed and no tests or emulator checks were needed. See
  `batches/wp02-a6-brown-top-millet-flour-hold-integration-20261012/README.md`; A6 remains open.


## 2026-10-12 WP04 Section P checkpoint — octopus / pieuvre

- Promoted the held `ingredient-ref-octopus` candidate to identity-only `octopus / pieuvre` in
  `PROTEIN`, with `poulpe` as the sole French alias. CFIA, OQLF, and Canadian/Quebec retail evidence
  support the unqualified consumer identity without selecting a species.
- Kept named species, `tako`, size/presentation descriptors, prepared products, squid/calamari, and
  cuttlefish/seiche separate. No recipe link, form, measure, density, mapping, conversion, yield, or
  substitution was added. The bundled recipes contain no octopus-specific ingredient row.
- No tests or emulator checks were run because this integration only adds database JSON data and its
  generated index under `AGENTS.md`. See
  `batches/wp04-section-p-octopus-identity-integration-20261012/README.md`; Section P remains open.


## 2026-10-12 WP03 Section F checkpoint — millet flakes

- Added identity-only `millet flakes / flocons de millet` as a separate `GRAIN_AND_CEREAL` reference.
  Canadian product evidence and Québec/Canadian French wording support the unqualified market name;
  no species or production/readiness state was selected.
- Kept species-qualified flakes, millet flour, puffed millet, and composite cereals distinct. No alias,
  recipe link, form, measure, conversion, yield, or substitution was added. No bundled recipe row
  matches this product.
- No tests or emulator checks were run because this integration only adds database JSON data and its
  generated index under `AGENTS.md`. See
  `batches/wp03-section-f-millet-flakes-integration-20261012/README.md`; Section F remains open.

## 2026-10-12 WP02 A6 checkpoint — barnyard millet flour hold

- Kept barnyard millet flour unallocated. The Canadian product listing does not state its source-grain
  species or French name; Québec millet-flour wording remains generic, and available uses of
  `millet japonais` span different *Echinochloa* taxa in non-food or international sources.
- Did not add an active reference, alias, form, ledger record, recipe link, measurement, or substitution.
  No tests or emulator checks were needed. See
  `batches/wp02-a6-barnyard-millet-flour-hold-integration-20261012/README.md`; A6 remains open.


## 2026-10-12 WP04 Section P checkpoint — generic clam hold

- Kept the existing `ingredient-ref-clam` candidate unresolved. CFIA uses `Clam` for multiple taxa
  with differing French names; OQLF retains Québec market terminology at species scope, and current
  Montréal retail headings group several clam products. No bundled ingredient row names a clam.
- Did not add an active `clam / palourde` reference, alias, form, recipe link, or new ledger record. No
  tests or emulator checks were needed. See
  `batches/wp04-section-p-clam-hold-integration-20261012/README.md`; Section P remains open.


## 2026-10-12 WP03 Section F checkpoint — cream of rice hot cereal

- Added identity-only `cream of rice hot cereal / crème de riz` in `GRAIN_AND_CEREAL`. The English
  display retains the explicit hot-cereal scope; the French display follows Québec culinary and
  retail wording. Health Canada's bilingual category and current Canadian product listings support
  the dry hot-cereal boundary.
- Kept rice, rice flour, crispy rice cereal, poha, congee, and brown-rice farina distinct. No aliases,
  forms, measurements, density, unit mappings, conversion, yield, recipe link, or substitution was
  added. The recipe bundle contains no matching ingredient row.
- No tests or emulator checks were run because this integration only adds database JSON data and its
  generated index under `AGENTS.md`. See
  `batches/wp03-section-f-cream-of-rice-hot-cereal-integration-20261012/README.md`; Section F remains
  open.


## 2026-10-12 WP02 A6 checkpoint — Sikiya / crab-finger flour hold

- Kept possible Sikiya / crab-finger millet flour (*Digitaria sanguinalis*) unallocated. Indian food
  and agricultural sources support localized grain and reported flour use, but no Canadian/Québec
  flour label or Québec French food display was found. OQLF and CFIA names apply in botanical or
  weed/seed contexts; they are not flour names.
- Kept `Sikiya`, `Sikya`, species terms, and botanical weed names off the generic
  `millet flour / farine de millet` reference. Rechecked exact ownership and all 114 manifest recipes;
  only the existing generic millet-flour row owns its names, with zero recipe hits for the candidate
  terms. No catalog or ledger data changed.
- No tests or emulator checks were needed. See
  `batches/wp02-a6-sikiya-crab-finger-flour-hold-integration-20261012/README.md`; the broad A6 review
  remains open.


## 2026-10-12 WP04 Section P checkpoint — generic crab hold

- Kept a separate unqualified `crab / crabe` reference held beyond the active `crab meat / chair de
  crabe` identity and its Jumbo Lump form. CFIA and OQLF apply crab names across multiple species;
  current Québec listings distinguish species and products. No recipe asks for a separate generic
  whole-crab ingredient.
- Recipe 019#8 already requests `1 lb jumbo lump crab meat` and links to the existing reference and
  form. Bare `crab` and `crabe` queries already match the crab-meat row by complete-word phrase
  search. No active reference, alias, form, ledger record, recipe link, or numeric behavior changed.
- No tests were needed for this review and documentation update. See
  `batches/wp04-section-p-generic-crab-hold-integration-20261012/README.md`; Section P remains open.

## 2026-10-12 WP02/WP03/WP04 jowar, poha, and langoustine integration

- Added only `jowar flour` as an English alias of existing `sorghum flour / farine de sorgho`, based
  on the FSSAI product definition and current Canadian mill wording. Grain sorghum remains separate.
- Kept bare `chiwda/chivda` out of flattened-rice aliases. Reused the existing CSIR evidence source
  and added seven current Canadian sources plus the accepted hold decision to the poha ledger record;
  the active poha row and forms did not change.
- Promoted the held langoustine candidate to identity-only `langoustine / scampi`, with French plural
  `langoustines` as a search alias. Kept related species names, prepared French `scampi`, product
  forms, recipe links, and numeric behavior outside this identity.
- All 114 manifest recipes and 1,123 ingredient rows were rechecked. None uses the reviewed terms.
  Package validation, generated-index freshness, ledger schema validation, ownership/demand, encoding,
  and scoped whitespace checks passed. No tests or emulator checks were run because the changes were
  limited to database JSON data and the generated index under `AGENTS.md`.
- Integration record: `batches/wp02-wp03-wp04-jowar-poha-langoustine-integration-20261012/README.md`.

## 2026-10-12 continued catalog sweep — A6, Section F, and Section P

- Added `ragi atta` as one English alias on the existing `ingredient-ref-finger-millet-flour` row.
  Retained the current bilingual display and `ragi flour` / `nachni flour` aliases; bare `ragi`
  remains on the finger-millet grain row, and sprouted ragi atta remains outside the unqualified
  alias. Added five source records and an accepted decision to the existing flour ledger record.
- Added identity-only `ingredient-ref-bran-flakes-cereal` as `bran flakes cereal / céréales de son
  en flocons` in `GRAIN_AND_CEREAL`. Kept wheat bran, wheat flakes, brands, frosted cereals, and
  composites distinct. Added four sources and one accepted ledger decision; no aliases, forms,
  numeric behavior, or recipe links were added.
- Kept the existing crayfish/crawfish and fresh-oyster candidates unresolved after OQLF, CFIA, DFO,
  and Canadian/Québec product review. Neither hold changed catalog, ledger, recipe, form, or numeric
  data. Their dedicated subchecks are complete, while the broader A6, Section F, and Section P
  parent checklists remain open.
- The complete manifest has 114 recipes and 1,123 ingredient rows; no reviewed alias or identity
  matched a recipe, and no recipe links were added.
- Current package snapshot: 1,226 ingredient references (SHA-256
  `4946cf6b6256f8d1ef2714ee534ebad44f02d29bdfbf0dfa84f20146a133220f`), 86 forms (SHA-256
  `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 66 legacy candidates
  (SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`), and 1,525 ledger
  records / 5,212 sources / 4,275 distinct source IDs (SHA-256
  `6954a3784dfff117b9ab926914123af8a503e32c18aee5ea7f90859ba115e953`). The generated Kotlin
  catalog contains 1,226 references (SHA-256
  `8cf3119845a873644779c118a3e58963d8215058a46564954546b2362ecf5a3c`).
- Seed-package validation, reference normalization, generated-index freshness, ledger validation,
  exact ownership, recipe scanning, UTF-8/no-BOM, scoped whitespace, and `git diff --check` passed.
  No tests or emulator checks were run for the database-JSON additions, consistent with the current
  `AGENTS.md` rule.
- Integration records: `batches/wp02-a6-ragi-atta-finger-millet-flour-alias-integration-20261012/README.md`,
  `batches/wp03-section-f-bran-flakes-cereal-identity-integration-20261012/README.md`,
  `batches/wp04-section-p-crayfish-crawfish-ecrevisse-hold-integration-20261012/README.md`, and
  `batches/wp04-section-p-fresh-oyster-hold-integration-20261012/README.md`.

## 2026-10-12 WP03 Section F — shredded wheat cereal

- Added identity-only `shredded wheat cereal / blé filamenté` as `ingredient-ref-shredded-wheat-cereal` in `GRAIN_AND_CEREAL`. Canadian product evidence, Health Canada's bilingual Canadian Nutrient File entry, Québec government usage, and Usito support the cereal class and French display.
- Kept wheat grain and flakes, puffed wheat, bran flakes, bran-added cereals, and composites distinct. Added no aliases, forms, measurements, conversions, yields, recipe links, or substitutions; the full 114-recipe / 1,123-row package has no candidate match.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact ownership, recipe scanning, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this integration only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,227 ingredient references (SHA-256 `255496df3d6cf09d667e87759989af0c858942a685142846802d187af185b882`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 66 legacy candidates (`bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`), 1,526 ledger records / 5,217 source entries / 4,280 distinct source IDs (`b6016f97ad0159dec2741910bdcf74d9e7a42a08ba609269671d0b68a60a0cee`), and 1,227 generated Kotlin references (`c9a55e13dbb2484bd4043d6811c2f551b1cbcd915a2e47c3aeab3aa3a4fba590`). The manifest remains 114 recipes (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`); recipe content remains unchanged (`dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`).
- Integration record: `batches/wp03-section-f-shredded-wheat-cereal-integration-20261012/README.md`; source review: `proposals/wp03-section-f-shredded-wheat-cereal-identity-review-20261012.md`.

## 2026-10-12 WP04 Section P — scallop / pétoncle

- Promoted the held `ingredient-ref-scallop` candidate in place to identity-only `scallop / pétoncle` in `PROTEIN`, scoped to the marketed edible adductor muscle. Added only `scallops`, `pétoncles`, and `scallop meat` as aliases; kept dried scallop/conpoy, roe, named species, breaded products, `noix`, and European `coquille Saint-Jacques` distinct.
- Added six source entries and an accepted decision to the existing ledger record. The complete 114-recipe / 1,123-row package has no target match. No forms, measurements, recipe links, conversions, yields, or substitutions were added.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact ownership, recipe scanning, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this integration only adds database JSON data under `AGENTS.md`.

## 2026-10-12 WP02 A6 — sprouted pearl-millet-flour hold

- Kept sprouted Bajra / pearl millet flour as a distinct open candidate, without allocating a row or adding process-qualified aliases to plain pearl-millet flour. Dhatu and a Canadian-facing reseller identify the product, while current French evidence covers plain pearl millet flour or a different multigrain sprouted flour.
- The complete 114-recipe / 1,123-row scan found no candidate match. No catalog, ledger, recipe, form, or numeric data changed. No tests were needed.
- See `batches/wp02-a6-sprouted-pearl-millet-flour-hold-integration-20261012/README.md` and `proposals/wp02-a6-sprouted-pearl-millet-flour-boundary-review-20261012.md`; broader A6 review remains open.
- Current package snapshot, after shredded-wheat and scallop integration (the hold above made no data changes): 1,228 ingredient references (SHA-256 `b9371dba388639d211f9b856e4e76de168edd372785206c90f8fc6e951c05a7d`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 66 legacy candidates (`bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`), 1,526 ledger records / 5,223 source entries / 4,286 distinct source IDs (`8a606c12f274d4cd87f8c154280211df2b6f8b04b5ba1a2dca7417806d605dfe`), and 1,228 generated Kotlin references (`e2c09021b4878149a8a7f06018b9b779955a983600ac2fe8a5ceea580ce5e19b`). The manifest remains 114 recipes (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`); the recipe corpus remains 114 files / 1,123 ingredient rows (`dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`).

## 2026-10-12 WP02 Section B checkpoint — cassava-flour French alias

- Added `farine de manioc` as a French alias on the existing `ingredient-ref-cassava-flour` identity. Kept `edible cassava flour / farine comestible de manioc` as the canonical display and `ingredient-ref-tapioca-starch` as a separate wet-extracted starch identity.
- Added eight source records and an accepted follow-up decision to the existing ledger entry. OQLF terminology and Codex support the identity/label boundary; current Québec retail headings support the shorter French search wording. No process-qualified alias, form, measurement, density, mapping, conversion, yield, recipe link, or substitution was added. Both research-state fields remain `not_yet_researched`.
- The 114-recipe / 1,123-row scan found no cassava-flour phrase or linked line. Static package validation, reference normalization, generated-catalog freshness, ledger validation, normalized exact-key ownership, recipe scanning, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for this database-data addition under `AGENTS.md`.
- Current snapshot: 1,228 ingredient references (SHA-256 `373845dac8aa1453d0d4f85eaeb35033efc6130c347b75dc48e351b842576dde`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 66 legacy candidates (`bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`), 1,526 ledger records / 5,231 source entries / 4,294 distinct source IDs (`239362c04fe319180fdd78929b29383a174e5f605792dd4fea4ade7e6a93a563`), and 1,228 generated Kotlin references (`b20d530da179c1a91174d8290476685a8a0883ac48139f1185aa4965934b9720`). The manifest remains 114 recipes (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`); the corpus remains 114 files / 1,123 ingredient rows (`dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`).
- Integration record: `batches/wp02-section-b-cassava-flour-alias-integration-20261012/README.md`; source review: `proposals/wp02-section-b-alternative-flour-starch-gap-sweep-20261012.md`.

## 2026-10-12 WP03 Section F — Dalia product boundary

- Added eight product and terminology sources and an accepted boundary decision to the existing `ingredient-ref-cracked-wheat` ledger record. Qualified Dalia labels remain inactive, and bare Dalia remains ambiguous across wheat, split-chickpea, and multigrain product usage.
- Fortinos' Suraj listing reports a 40 g serving but describes the product as coarsely ground. Since CFIA distinguishes crushed/coarse-ground wheat from cracked wheat, the serving was not entered under the current cracked-wheat identity; `measurementState` remains `not_yet_researched` and there is no measurement observation.
- The 114-recipe / 1,123-row scan found no candidate phrase. No active reference, alias, form, recipe, or numeric data changed. Static package, reference normalization, generated-index, ledger, ownership, recipe, encoding, and whitespace checks passed. No tests or emulator checks were run for this database-JSON evidence update under `AGENTS.md`.
- Current snapshot: 1,233 references (SHA-256 `0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 66 legacy candidates (`bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f`), and 1,531 ledger records / 5,271 source entries / 4,313 distinct source IDs (`d665f791e7f6077054ce3bcc2e0b6aeb2434b346703b62e74257aa9fde8edbdd`). Generated Kotlin catalog: 1,233 references (`3b7d7141bcc3692b255e2e37b0b5c9d5de6bbbe49c53036eb89553e682d57795`). The manifest remains 114 recipes (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`); recipe corpus remains 114 files / 1,123 rows (`2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`).
- Integration record: `batches/wp03-section-f-dalia-boundary-integration-20261012/README.md`; source review: `proposals/wp03-section-f-regional-cereal-mixes-residual-gap-sweep-20261012.md`.

## 2026-10-12 recipe 090#17 peanut-component link reconciliation

- Added the previously accepted `ingredient-ref-peanuts` link to the peanut component of recipe 090#17. Preserved the combined original text, `ingredientName`, optional flag, and bilingual cilantro note. Cotter Crunch lists dry-roasted peanuts and fresh cilantro as separate garnish components; cilantro remains unlinked.
- The manifest still has 114 recipes and 1,123 ingredient rows; 27 rows remain unlinked. Package validation, reference normalization, generated-catalog freshness, and ledger schema validation passed. The existing package assertion was updated to match the accepted link; no tests or emulator checks were run under the `AGENTS.md` JSON-data exception.
- Current recipe corpus snapshot: 752,993 bytes; manifest-ordered digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`. Other package snapshots remain unchanged from the cassava-flour alias checkpoint above.
- Integration record: `batches/peanut-stew-component-link-reconciliation-20261012/README.md`; source: [Cotter Crunch African peanut stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/).

## 2026-10-12 WP02 Section A — German wheat-flour types

- Added identity-only Type 405, 550, 812, 1050, and 1600 wheat flours with country-qualified English and French display names and one literal German lookup alias each. The German numbering describes mineral/ash content, not fineness or an equivalence to another country's flour grades. No French aliases, forms, measurements, conversions, yields, recipe links, or substitutions were added.
- Added 30 source entries to the new records. Added DIN and German government evidence plus an unresolved Backschrot 1700 hold to the existing whole-wheat-meal ledger record; no Backschrot reference was created. The independent Québec review accepted the five descriptive French grade displays; no catalog aliases or crosswalks were added.
- The complete 114-recipe / 1,123-row corpus had no candidate phrase match. Package validation, reference normalization, generated-catalog freshness, ledger schema, normalized-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run for this database JSON integration under `AGENTS.md`.
- Current package snapshot: 1,233 references (SHA-256 `0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 66 legacy candidates (`bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`), and 1,531 ledger records / 5,263 source entries / 4,305 distinct source IDs (`d26175916691ffa17d6ac3b7b79edf8d08afcfbe2da0d26411b52bc2211cc9fa`). Generated Kotlin catalog: 1,233 references (`3b7d7141bcc3692b255e2e37b0b5c9d5de6bbbe49c53036eb89553e682d57795`). The manifest remains 114 recipes (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`); recipe corpus remains 114 files / 1,123 rows (`2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`).
- Integration record: `batches/wp02-section-a-german-wheat-types-integration-20261012/README.md`; Québec wording review: `batches/wp02-section-a-german-flour-quebec-display-review-20261012/README.md`; proposal and source register: `proposals/wp02-section-a-residual-flour-gap-sweep-20261012.md`.


## 2026-10-12 WP02 Section D cocoa nibs and caramel sauce

Integrated identity-only `cocoa nibs / cacao en grains` and `caramel sauce / sauce au caramel`. The cocoa-nib row uses `grué de cacao`, `cocoa nib`, and `cacao nibs`; the sauce row has no aliases. Nibs remain separate from chocolate forms, and caramel sauce remains separate from dulce de leche and confectionery bits. Source-specific recipe quantities and one-off package sizes were not promoted into general measurements or package yields. The 114-recipe bundle had no term hits. Package/ledger/reference normalization and generated-index checks passed. No tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`. See `batches/wp02-section-d-cocoa-nibs-caramel-sauce-integration-20261012/README.md`; broader Section D review remains open.


## 2026-10-12 coordinator follow-up — potato-starch Québec alias

Added the OQLF-preferred plural French term `amidon de pommes de terre` to the existing potato-starch reference. The retail phrase `farine de pommes de terre` remains unassigned; whole-potato flour stays separate. The ledger now records five bounded sources and an accepted naming decision while preserving the existing unresearched measurement and substitution states. No recipe links, forms, or numeric behavior changed. See the [review proposal](proposals/wp02-section-b-regional-starch-residual-gap-sweep-20261012.md) and [integration report](batches/wp02-b2-potato-starch-quebec-alias-integration-20261012/README.md).


## 2026-10-12 coordinator follow-up — idli-rava boundary hold

Added `candidate-idli-rava` as an unresolved ledger-only candidate with nine bounded sources. Research evidence identifies a coarse rice product used for idli, but current Canadian listings do not consistently state whether it is parboiled, and available Québec French retail wording is not stable or authoritative enough to activate. Keep `rava`/`rawa`, wheat semolina, prepared mixes, intact rice, and cream-of-rice hot cereal distinct. No active reference, alias, form, recipe link, measure, conversion, yield, or substitution changed. See the [boundary proposal](proposals/wp03-section-f-idli-rava-boundary-review-20261012.md) and [integration report](batches/wp03-section-f-idli-rava-boundary-integration-20261012/README.md).


## 2026-10-12 WP04 Section P — Pacific cod

- Added identity-only `Pacific cod / morue du Pacifique` for *Gadus macrocephalus* with only the English aliases `gray cod` and `grey cod`. DFO's Atlantic-cod marketplace-equivalence note is not recipe-substitution evidence.
- Added six source entries, three bounded CNF portion observations, and accepted identity and no-supported-substitute decisions. The raw fillet's 66% refuse basis remains unresolved; the volume observations apply only to cooked, flaked cod. No density, unit mapping, form, conversion, yield, recipe link, or substitution rule was added. The 114-recipe / 1,123-row bundle has no candidate match.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe audit, and UTF-8/no-BOM checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,236 references (`5777a596ace933894fca32a4b5f0269894a4543b10d45f798013d05f3dda1c9f`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,535 ledger records / 5,300 source entries / 4,342 distinct source IDs (`9b330827411ea776a62e8b68a21a49ea7a809ccf1e5d3f64febc34c08bcacb23`), and 1,236 generated Kotlin references (`ad8eabce6f1aa18d84c20d5803f2ede2ebb3485f98a9bf3ac4ce24cd4f6c16fa`). The manifest has 114 recipes / 1,123 ingredient rows; its corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp04-section-p-pacific-cod-identity-integration-20261012/README.md`; source review: `proposals/wp04-section-p-uncovered-seafood-gap-review-20261012.md`. Section P remains open.


## 2026-10-12 WP04 Section P — lake whitefish

- Added identity-only `lake whitefish / grand corégone` for *Coregonus clupeaformis* with no aliases. OQLF supports the standardized Québec display and direct English equivalent; DFO confirms the species in both languages. Broader `whitefish`, `corégone`, and `poisson blanc` terms remain outside the alias arrays.
- Added six sources and one Health Canada Table 8 observation for the 75 g baked reference food. It is not a raw-fish portion, count weight, general density, or recipe-serving recommendation. No recipe links, forms, unit mappings, conversions, yields, or substitutions were added; the complete 114-recipe / 1,123-row bundle has no candidate match.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe audit, and UTF-8/no-BOM checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,237 references (`bc1019f85e7a9fd2a51b3d0ef869021ac692739b3215e80d50fa85ae3e693961`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,536 ledger records / 5,306 source entries / 4,348 distinct source IDs (`bc91b5d06952415060722f077428885e521fbfc524a4bd3f17d0c113b1ceb334`), and 1,237 generated Kotlin references (`51fc242214c36f0adf4bbeda88b3a3f5322b8f7cb32ac595dcde58f93ee3da60`). The manifest has 114 recipes / 1,123 ingredient rows; its corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp04-section-p-lake-whitefish-identity-integration-20261012/README.md`; source review: `proposals/wp04-section-p-lake-whitefish-identity-review-20261012.md`. Section P remains open.


## 2026-10-12 WP02 B2/B3 — konjac flour

- Added identity-only `konjac flour / farine de konjac` as `ingredient-ref-konjac-flour` in `FLOUR_AND_STARCH`, with no aliases. Keep the row scoped to food-grade flour from konjac tubers/corms without assigning one species or composition. Keep powders, gum, glucomannan, konnyaku, true-yam flour, and finished shirataki noodles distinct.
- Added four new source entries and an accepted identity decision; reused the existing OQLF and MAFF source IDs from the shirataki boundary record. Measurement and substitution research remain `not_yet_researched`; no measures, forms, recipe links, or numeric behavior were added. The full 114-recipe / 1,123-row scan found no candidate match.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe audit, and UTF-8/no-BOM checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,238 references (`c30fa9e8000a1547f44a82c45cc574c5e840123197b595600649052a39ee8c11`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,537 ledger records / 5,310 source entries / 4,352 distinct source IDs (`71bb49893b67b6f93d95304060c7c22c61a534635e4e3d1deee4581658f51d20`), and 1,238 generated Kotlin references (`3b1edb28aa213222477ad558262e921193940febb30729f06039a1b86665f3a8`). The manifest has 114 recipes / 1,123 ingredient rows; its corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp02-b2-b3-konjac-flour-identity-integration-20261012/README.md`; source review: `proposals/wp02-b2-b3-konjac-flour-identity-gap-review-20261012.md`. Broader WP02 B2/B3 review remains open.


## 2026-10-12 WP03 Section I — pili-nut identity

- Added identity-only `pili nuts / noix de pili` for the edible kernel of *Canarium ovatum*, with English aliases `pili nut` and `pilinut`. Kept `noyer de pili` as crop/tree wording, `pili-pili` as a pepper, other *Canarium* species, and activated/sprouted/salted/dehydrated products separate.
- Added eight source entries and one accepted identity decision. Measurement state is `researched_no_supported_value`; substitution research remains `not_yet_researched`. No form, recipe link, measure, conversion, yield, or substitution was added. The 114-recipe / 1,123-row corpus has no candidate-term match and is unchanged.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,239 references (`fe3c4a2c0ec423a2a0e9bb2b1eaa43cd4fb73dfa20e44bc1050d3f551ec98f71`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,538 ledger records / 5,318 source entries / 4,360 distinct source IDs (`bda81990f4d69c2c69fff716dfd22a8287d59c35de4907194f63821a1c4bdb33`), and 1,239 generated Kotlin references (`21221563616307ec1bbed4cdea8302014b5eb1ca45a64589472c2d258f1b621d`). The manifest has 114 recipes / 1,123 ingredient rows; corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp03-section-i-pili-nut-identity-integration-20261012/README.md`; source review: `proposals/wp03-section-i-pili-nut-identity-review-20261012.md`. Broader Section I seed/kernel coverage remains open.


## 2026-10-12 WP04 Section P — American shad

- Added identity-only `american shad / alose savoureuse` for *Alosa sapidissima*, with no aliases. OQLF marks `alose savoureuse` as the normalized Québec edible-fish term and pairs it with American shad and the species; CFIA and TERMIUM corroborate the bilingual species name. Keep generic `shad / alose`, `alose d’Amérique`, gaspareau, herring, and other related fish separate.
- Added seven sources and an accepted species identity. Biological fish lengths and body weights do not support recipe portions or culinary conversions. No measure, density, form, recipe link, conversion, yield, or substitution rule was added. The ledger records no supported recipe substitute in the bounded review; no bundled recipe requests this species.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,240 references (`a3c211873aea5f994829e65a2a4c069db48dfbf4e9ed5f5ee2870ec711ff2341`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,539 ledger records / 5,325 source entries / 4,367 distinct source IDs (`8819b1aff9867a26f3100e49c29422c1787223dbc60d26868ee8788c7efd6d20`), and 1,240 generated Kotlin references (`8ac1ec1a271f2b18f1383810705e70afc3e4ab270872b21aa131565e3848c6af`). The manifest has 114 recipes / 1,123 ingredient rows; corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp04-section-p-american-shad-identity-integration-20261012/README.md`; source review: `proposals/wp04-section-p-american-shad-identity-review-20261012.md`. Section P remains open.


## 2026-10-12 WP02 B2/B3 — canna starch

- Added identity-only `canna starch / fécule de toloman` for food-grade starch extracted from edible *Canna indica* rhizomes, including the older *Canna edulis* name. Added English aliases `achira starch`, `canna indica starch`, and `toloman starch`, plus the Canadian French goods phrase `amidon de canna indica à usage alimentaire` as a French alias. Keep whole-rhizome flour, bare `sagú`/`sagu`, and Queensland-arrowroot wording separate. The French display is provisional and is not an OQLF ruling.
- Added nine source entries and an accepted identity decision. Measurement and substitution states remain `not_yet_researched`; no forms, recipe links, measurements, conversions, yields, or substitutions were added. The 114-recipe / 1,123-row corpus has no candidate phrase match.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,242 references (`d40be0bdff5ae32179dfe0a099ba17c931972cd50e5fd26801f716fc8ebc1c86`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,541 ledger records / 5,341 source entries / 4,383 distinct source IDs (`f00bf8b007542fc2f33b0223f77354159ac5304fa9235590f3a1947cf861bdce`), and 1,242 generated Kotlin references (`7e03ea281d3c64120881e3546c0949765a8f3601289a01576c55b06d111e98cc`). The manifest has 114 recipes / 1,123 ingredient rows; corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp02-b2-b3-canna-starch-identity-integration-20261012/README.md`; source review: `proposals/wp02-b2-b3-canna-starch-identity-gap-review-20261012.md`. Broader WP02 B2/B3 review remains open.


## 2026-10-12 WP03 Section I — perilla seeds

- Added identity-only `perilla seeds / graines de périlla` for food seeds of *Perilla frutescens*, with singular aliases `perilla seed` and `graine de périlla`. Keep leaves/shiso, seed oil, powder, sowing seed, and sesame separate. Health Canada's listing covers whole or minimally processed seeds and describes a history of food use; it is not a food-use safety assessment or preparation guide.
- Added seven source entries and an accepted identity decision. Measurement and substitution states remain `not_yet_researched`; no forms, recipe links, measurements, conversions, yields, or substitutions were added. The 114-recipe / 1,123-row corpus has no candidate phrase match.
- Static package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,242 references (`d40be0bdff5ae32179dfe0a099ba17c931972cd50e5fd26801f716fc8ebc1c86`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,541 ledger records / 5,341 source entries / 4,383 distinct source IDs (`f00bf8b007542fc2f33b0223f77354159ac5304fa9235590f3a1947cf861bdce`), and 1,242 generated Kotlin references (`7e03ea281d3c64120881e3546c0949765a8f3601289a01576c55b06d111e98cc`). The manifest has 114 recipes / 1,123 ingredient rows; corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp03-section-i-perilla-seeds-identity-integration-20261012/README.md`; source review: `proposals/wp03-section-i-perilla-seed-identity-review-20261012.md`. Broader Section I seed/kernel coverage remains open.


## 2026-10-12 WP03 Section I — chironji seeds

- Added identity-only `chironji seeds / graines de chironji` for food seeds of *Buchanania lanzan*, with the singular aliases `chironji seed` and `graine de chironji`. Keep fruit pulp, seed oil, planting use, and the regional/common names `charoli`, `Cuddapah almond`, and `almondette` outside the alias arrays.
- Added five sources and one accepted identity decision. The measurement state is `researched_no_supported_value`: NIFTEM's example tablespoon quantity and cultivar kernel weights do not establish a transferable measure or density. Its broad almond-confectionery comparison supplies no recipe ratio or adjustment; the ledger records no supported substitute and adds no rule. No forms, observations, recipe links, or general numeric behavior were added.
- The 114-recipe / 1,123-row corpus has no candidate-term match. Package validation, reference normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,243 references (`9be692678b8bd18ea4e64ef478e27a2c6824a0738a21097192c378a4fa2ad0e9`), 86 forms (`24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`), 1,542 ledger records / 5,346 source entries / 4,388 distinct source IDs (`0cca662548a16d399cc0b06437077a7716cdb319184311676f39d0fdfb7bd20f`), and 1,243 generated Kotlin references (`53ae99d6df20027693b138d6beeb9a0713d908f6b742e42762972a10d949c26e`). The manifest has 114 recipes / 1,123 ingredient rows; corpus digest remains `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- Integration record: `batches/wp03-section-i-chironji-seeds-identity-integration-20261012/README.md`; source review: `proposals/wp03-section-i-chironji-seeds-identity-review-20261012.md`. Broader Section I seed/kernel coverage remains open.


## 2026-10-12 WP03 Section I — crushed-nuts garnish form

- Added `ingredient-form-nuts-crushed` (`crushed nuts / noix concassées`) under generic `nuts / noix` and linked only recipe 031#4's optional species-unspecified garnish. Preserved original text and optional state; named peanut, hazelnut, and almond rows remain on their own identities. The recipe supplies no amount, species, or exact particle size, so no density, measure, or conversion was added.
- Reused the existing Cooking With Ayeh source entry on the generic-nuts ledger record and recorded a later accepted form decision. Static package, reference, form ownership, ledger, exact-row, corpus, UTF-8/no-BOM, and whitespace checks passed. No tests or emulator checks were run for this database-JSON-only update under `AGENTS.md`.
- Current snapshot: 1,243 references (`9be692678b8bd18ea4e64ef478e27a2c6824a0738a21097192c378a4fa2ad0e9`), 87 forms (`20330400c65f80f7ef470ca959bf3b5f1a29886c4d26a6b02fb842108969aa54`), 1,542 ledger records / 5,346 source entries / 4,388 distinct source IDs (`d0dfd1cb48958c06097786ae7883dc25e0c36a4d6a5c135c40ade0e659875518`), and 1,243 generated Kotlin references (`53ae99d6df20027693b138d6beeb9a0713d908f6b742e42762972a10d949c26e`). The manifest has 114 recipes / 1,123 ingredient rows; the 753,051-byte corpus digest is `f1435e690f238e09a76bc7fdfcf9b332e72d25760f4952a2c391b8a2d5cdf500`.
- Integration record: `batches/wp03-section-i-crushed-nuts-form-integration-20261012/README.md`. Broader Section I preparation-form coverage remains open.


## 2026-10-12 WP03 Section F — multigrain flakes

- Added identity-only `multigrain flakes / flocons multigrains` with `multi-grain flakes` as its only English alias. Québec manufacturer wording supports the French display; OQLF supports the adjective and English spelling but has no dedicated compound entry. Kept species-specific flakes and formulated cereals separate. No forms, measures, recipe links, conversions, yields, or substitutions were added; the bundle has no matching demand.
- Added the accepted identity record and seven source entries to the research ledger. Measurement and substitution review found no reusable kitchen measure or supported replacement ratio.
- Static package, generated-index, ledger, ownership, corpus, encoding, and whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- Integration record: `batches/wp03-section-f-multigrain-flakes-identity-integration-20261012/README.md`; source review: `proposals/wp03-section-f-next-cereal-grain-batch-20261012.md`. Section F remains open.

## 2026-10-12 WP02 B2/B3 and WP04 Section P — naming and picker holds

- Kept Korean acorn starch outside the active catalog and evidence ledger pending a Québec-facing human-food product name in French. The reviewed sources distinguish extracted starch from whole-acorn flour but do not establish the Québec display. Documentation only; no tests were needed. See `batches/wp02-b2-b3-acorn-starch-quebec-name-hold-integration-20261012/README.md` and `proposals/wp02-b2b3-next-flour-starch-batch-20261012.md`.
- Kept silver hake / merlu argenté (*Merluccius bilinearis*) outside the catalog and ledger because CFIA assigns overlapping market names to *M. bilinearis* and *M. hubbsi*, while the picker cannot present that taxonomic ambiguity. The recipe bundle has no matching demand. Documentation only; no tests were needed. See `batches/wp04-section-p-silver-hake-picker-hold-integration-20261012/README.md` and `proposals/wp04-section-p-next-seafood-batch-review-20261012-root.md`; Section P remains open.

## 2026-10-13 WP02 A6 — Korra foxtail-millet aliases

- Added `korra` to the existing foxtail-millet grain row and `korra flour` to its flour row. FSSAI and ICAR–IIMR support the spelling and grain/flour relationship; a Canada-facing product listing corroborates the flour wording. The French displays remain unchanged, and Korale/Andukorralu stay on the separate brown-top millet hold.
- Existing measurement observations and blocked substitution research were preserved. No forms, recipe links, measures, conversions, yields, or active substitution rules were added; the 114-recipe / 1,123-row corpus has no Korra match.
- Static package normalization, generated-index freshness, ledger validation, picker/ownership, corpus, encoding, and scoped whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data.
- Integration record: `batches/wp02-a6-korra-foxtail-millet-flour-alias-integration-20261013/README.md`; proposal: `proposals/wp02-a6-korra-foxtail-millet-flour-alias-review-20261013.md`. A6 remains open.

## 2026-10-17 WP02 A7 / WP04 Section P / WP06 Europe — R434–R436

- Held rye grits unallocated: current product and classification evidence does not establish a Canadian/Québec French name and milling boundary distinct from cracked rye and rye meal. Preserved `seigle concassé`, `gruau de seigle`, and `semoule de seigle` with their existing identities.
- Added identity-only `crab claws / pinces de crabe` and `Pecorino Romano AOP / Pecorino Romano PDO`. Kept crab meat, picked claw meat, species-specific crab, crab cakes, imitation products, and other pecorino varieties distinct. No bundled recipe demand or reusable measurement was found; no forms, recipe links, conversions, yields, or substitutions were added. Crab substitution research is `researched_no_supported_substitute`; Pecorino Romano substitution research remains `not_yet_researched`.
- Static package and ledger validation, reference normalization, generated-index freshness, source/phrase ownership, corpus, encoding, local-link, and scoped whitespace checks passed. No tests or emulator checks were run because this integration only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,731 references (`4b789265f9656463d19ec4de6601d4b8bd41a21593a3761ab04164d46c0abe39`), 141 forms (`2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed`), 2,090 ledger records / 9,483 source entries / 8,035 distinct source IDs / 6,751 distinct source URLs (`8e9e1654d690eff724e79268ad74572af7e97b562855abac4bfc566f2356a993`), and 1,731 generated Kotlin references (`3ce1aba9de1ef6b5e472d63176f56e852e4740f90067ad8ce264fe19a68c5ebf`). The manifest remains 114 recipes / 1,123 ingredient rows; its corpus fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`.
- Integration record: `batches/wp02-wp04-wp06-r434-r436-gap-review-integration-20261017/README.md`; proposals: `proposals/wp02-section-a7-next-milling-gap-review-r434-20261017.md`, `proposals/wp04-section-p-crab-claws-product-identity-review-r435-20261017.md`, and `proposals/wp06-europe-pecorino-romano-identity-review-r436-20261017.md`. The three broader work packages remain open.

## 2026-10-17 WP02 A7 / WP04 Section P / WP06 Europe — R437–R439

- Held `quinoa grits` / `quinoa grit` unallocated: a research milling fraction and a Québec recipe for cooked whole-quinoa `gruau` do not establish a retail grits product or product-matched French name. Kept whole quinoa, quinoa meal, flour, and flakes distinct; transferred no whole-quinoa portions or experimental particle sizes. The 114-recipe / 1,123-row bundle has no candidate-term match.
- Added identity-only `breaded butterfly shrimp / crevettes en papillon panées` with product-title variants supported by OQLF and current Canadian product pages. Kept shrimp species, generic breaded shrimp, frozen/cooked states, coconut and popcorn variants, and shrimp balls distinct. Package sizes and one brand's 4 shrimp / 84 g panel do not support reusable measures, forms, or yields.
- Added identity-only `Tomates pelées San Marzano AOP / San Marzano PDO peeled tomatoes` for the protected Campania peeled product. Kept generic tomatoes, Canadian `San Marzano Type` products, and sauces/passata distinct; product specifications and SKU package sizes do not support reusable measures or yields.
- No candidate has recipe demand. Added no forms, measurement observations, recipe links, conversions, yields, or substitutions. Both new identity records are verified with `researched_no_supported_value` measurement state and `not_yet_researched` substitution state. No app tests or emulator checks were run because this integration only adds database JSON data under `AGENTS.md`.
- Integration record: `batches/wp02-wp04-wp06-r437-r439-gap-review-integration-20261017/README.md`; proposals: `proposals/wp02-section-a7-quinoa-grits-boundary-review-r437-20261017.md`, `proposals/wp04-section-p-breaded-butterfly-shrimp-product-identity-review-r438-20261017.md`, and `proposals/wp06-europe-san-marzano-pdo-tomato-identity-review-r439-20261017.md`. A7, Section P, and WP06 Europe remain open.

## 2026-10-17 WP02 Section A7 — R454 farina product aliases

- Added exact Ardent Mills Canada product-title aliases `farina flour` and `farine farina` to the existing spring-wheat-semolina reference. Kept its canonical display and all measurement, form, recipe-link, conversion, yield, and substitution data unchanged. OQLF terminology and the product's Canadian hard-red-spring-wheat endosperm description support the alias boundary.
- The phrase aliases make the picker return the relevant row for broad `farina` and `farine` queries. The former now returns five results and the latter 171. Bare `farina` and generic `farine` were not stored as aliases. The manifest scan found no matching recipe demand.
- Static package normalization, generated-index freshness, source-ID and alias-scope checks, and UTF-8/no-BOM checks passed. No software tests or emulator checks were run because this update only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,742 references, 141 forms, 2,101 ledger records / 9,564 source entries / 8,113 distinct source IDs / 6,826 distinct URLs, and 114 recipes / 1,123 ingredient rows. Integration record: `batches/wp02-a7-farina-alias-integration-r454-20261017/README.md`; proposal: `proposals/wp02-section-a7-farina-bilingual-alias-review-r454-20261017.md`. Section A7 remains open.

## 2026-10-17 WP04 Section P / WP06 Europe — R452–R453 holds

- Held the American-lobster tail cut because the current picker would make `lobster tail` resolve to an American-lobster cut alone, while OQLF maps that English term to `queue de langouste` and explicitly distinguishes it from `queue de homard`. Canadian product evidence supports the product boundary, but the 114-recipe / 1,123-row bundle has no demand. No catalog or ledger data changed.
- Held Piedmontese `grissino stirato` because adding the regional item would make broad `grissino` a singleton, and its source-attested plural alias would make broad `grissini` a singleton as well. Regione Piemonte supports the regional product; OQLF covers generic `gressin / breadstick`, while Québec Torino/Torinesi shelf titles do not verify method or origin. The bundle has no demand. No catalog or ledger data changed.
- Both decisions are documentation-only; no software tests or emulator checks were run. Records: `batches/wp04-section-p-american-lobster-tail-hold-integration-r452-20261017/README.md` and `batches/wp06-europe-grissino-stirato-hold-integration-r453-20261017/README.md`; proposals: R452 and R453 in `proposals/`. Section P and WP06 Europe remain open.

## 2026-10-17 WP06 Europe — R457 Turrón de Jijona hold

- Held Turrón de Jijona unallocated because its qualified regional name would make broad `turrón` / `turron` queries return a single PGI subtype. The European Commission distinguishes it from Turrón de Alicante PGI; a Montréal retailer groups both styles under the broader family. OQLF records generic `touron` but does not identify Jijona. The bundle has no demand; no catalog or ledger data changed.
- Documentation-only decision; no software tests or emulator checks were run. Record: `batches/wp06-europe-turron-jijona-hold-integration-r457-20261017/README.md`; proposal: `proposals/wp06-europe-next-regional-identity-review-r457-20261017.md`. Europe-wide coverage remains open.

## 2026-10-17 WP02 Section A7 — R455 granular flour

- Added identity-only `granular flour / farine granulaire` as `ingredient-ref-granular-flour` from Ardent Mills Canada’s exact current bilingual product titles. The manufacturer’s portfolio separates the product from Farina and Wheatlets; generic instant-blending wording remains evidence-only. No aliases, forms, measures, mappings, conversions, recipe links, yields, or substitutions were added. The 114-recipe / 1,123-row bundle has no matching demand.
- Static package validation, generated-index freshness, source ownership, picker projection, and UTF-8/no-BOM checks passed. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
- R455 integration snapshot: 1,743 references / 141 forms; 2,102 ledger records / 9,568 source entries / 8,117 distinct source IDs / 6,830 distinct URLs; 114 recipes / 1,123 rows. See `batches/wp02-a7-granular-flour-identity-integration-r455-20261017/README.md` and `proposals/wp02-section-a7-granular-flour-identity-review-r455-20261017.md`. Section A7 remains open.

## 2026-10-17 WP04 Section P — R456 lobster claws

- Added identity-only `lobster claws / pinces de homard` as `ingredient-ref-lobster-claws`, with exact plural displays and no aliases. Québec market and MAPAQ evidence separates claws from whole lobster, tails, and picked lobster meat; no species is inferred for unqualified retail items. Kept the singular French retailer phrase out of aliases because it would make broad `pince` searches hide crab claws. The 114-recipe / 1,123-row bundle has no matching demand. No forms, measures, conversions, yields, recipe links, or substitutions were added.
- Static package validation, generated-index freshness, ledger schema, source ownership, picker projection, full recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
- Current snapshot: 1,744 references / 141 forms; 2,103 ledger records / 9,575 source entries / 8,122 distinct source IDs / 6,835 distinct URLs; 114 recipes / 1,123 ingredient rows. See `batches/wp04-section-p-lobster-claws-identity-integration-r456-20261017/README.md` and `proposals/wp04-section-p-lobster-claws-product-boundary-review-r456-20261017.md`. Section P remains open.

## 2026-10-17 WP02 Section A7 — R458 spelt-grits hold

- Held standalone `spelt grits / spelt grit` unallocated. Supplier pages establish grits as a distinct spelt product, but the reviewed evidence does not establish a current Canadian grits product, Québec-facing product-matched French name, or common milling boundary for medium and wholegrain grits. No active reference, candidate, ledger record, or recipe link was added; the recipe bundle has no matching demand.
- This documentation-only hold required no tests. See the [R458 proposal](proposals/wp02-section-a7-next-milling-gap-review-r458-20261017.md) and [integration README](batches/wp02-a7-spelt-grits-bounded-hold-integration-r458-20261017/README.md). Section A7 remains open.

## 2026-10-17 WP04 Section P — R459 breaded shrimp

- Added identity-only `breaded shrimp / crevettes panées` as a species-neutral preparation, separate from butterfly, popcorn, coconut, tempura, and species-specific rows. The bundle has no matching demand; package and preparation amounts remain source-specific. No forms, measures, mappings, conversions, yields, recipe links, or substitutions were added.
- Static package, generated-index, ledger, source-ownership, picker, corpus, encoding, and whitespace checks passed. No app or Android tests were run for this database-JSON addition under `AGENTS.md`.
- Post-integration snapshot: 1,747 references / 141 forms; 2,106 ledger records / 9,588 source entries / 8,135 distinct source IDs / 6,848 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R459 proposal](proposals/wp04-section-p-next-seafood-review-r459-20261017.md) and [integration README](batches/wp04-section-p-breaded-shrimp-identity-integration-r459-20261017/README.md). Section P remains open.

## 2026-10-17 WP06 Europe — R460 Krokos Kozanis PDO saffron

- Added identity-only `Krokos Kozanis PDO saffron / safran Krokos Kozanis AOP` with `Krokos Kozani Saffron` as the only English alias. Kept generic saffron separate and left regional filament/powder forms out because the broad form search would otherwise resolve only to this PDO origin. Commercial package sizes are not reusable measures; no matching recipe demand was found.
- Static package normalization, generated-index freshness, ledger-schema validation, source ownership, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. No app or Android tests were run for this database-JSON addition under `AGENTS.md`.
- Snapshot: 1,746 references / 141 forms; 2,105 ledger records / 9,584 source entries / 8,131 distinct source IDs / 6,844 distinct source URLs; 114 recipes / 1,123 ingredient rows. See `batches/wp06-europe-krokos-kozanis-pdo-identity-integration-r460-20261017/README.md` and `proposals/wp06-europe-next-regional-identity-review-r460-20261017.md`. Europe-wide coverage remains open.

## 2026-10-17 WP02 Section D — R461 lemon curd

- Added identity-only `lemon curd / crème au citron` with the exact Canadian French retail alias `crème de citron`. Kept OQLF-listed lemon cheese, lemon cheese curd, and lemon butter outside picker aliases to avoid broadening cheese and butter searches. The manifest scan found no matching line among 114 recipes and 1,123 ingredient rows.
- Kept PC Black Label's 250 ml package and 34 ml labelled serving SKU-specific. Added no forms, reusable measurements, mappings, density, recipe links, conversions, yields, or substitutions; substitution research remains open.
- The derived Kotlin catalog was regenerated. Static data checks are recorded in the R461 proposal and README; no software tests were run for this database-JSON addition under `AGENTS.md`.
- Snapshot: 1,745 references / 141 forms; 2,104 ledger records / 9,578 source entries / 8,125 distinct source IDs / 6,838 distinct URLs; 114 recipes / 1,123 ingredient rows. See `batches/wp02-section-d-lemon-curd-identity-integration-r461-20261017/README.md` and `proposals/wp02-section-d-lemon-curd-identity-review-r461-20261017.md`. Broader Section D fruit-product coverage remains open.

## 2026-10-17 WP02 Section A7 — R462 spelt groats alias

- Added only the English alias `spelt groats` to the existing whole-kernel `spelt berries / grains d’épeautre` reference. The current Ontario product page names `Organic Spelt Groats (Kernels)` and equates groats with hulled spelt kernels; Québec grain sources support the existing French display. Kept grits, meal, semolina, flour, and flakes separate.
- Generic `groats` and `groat` picker queries each gain spelt berries; the broad `spelt` result set and French display remain unchanged. The bundle has no matching recipe demand. No French alias, form, measure, mapping, conversion, yield, recipe link, or substitution was added.
- Static package normalization, generated-index freshness, ledger schema, source ownership, picker projection, corpus, encoding, and whitespace checks passed. No software tests were run for this database-JSON addition under `AGENTS.md`.
- R462 integration snapshot: 1,747 references / 141 forms; 2,106 ledger records / 9,591 source entries / 8,138 distinct source IDs / 6,851 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R462 proposal](proposals/wp02-section-a7-next-milling-gap-review-r462-20261017.md) and [integration README](batches/wp02-a7-spelt-groats-alias-integration-r462-20261017/README.md). Section A7 remains open.

## 2026-10-17 WP04 Section P — R463 salmon-jerky hold

- Held `salmon jerky / jerky de saumon` outside active references and the research ledger. Québec and Canadian product listings support the preparation, but an active salmon-only row would make bare `jerky` return one species while the existing beef-jerky candidate remains unresolved. R169 excluded the preparation without deciding it; the bundle has no matching demand. No catalog or ledger data changed.
- No tests were needed for this documentation-only hold. See the [R463 proposal](proposals/wp04-section-p-next-seafood-review-r463-20261017.md) and [integration README](batches/wp04-section-p-salmon-jerky-hold-integration-r463-20261017/README.md). Section P remains open.

## 2026-10-17 WP06 Europe — R464 Guérande fleur de sel

- Added identity-only `Fleur de sel de Guérande / Fleur-de-Sel de Guérande` for the IGP surface-harvested salt, distinct from generic fleur de sel and bottom-harvested grey Sel de Guérande. Kept the 10.3 g/tablespoon observation on generic fleur de sel scoped to its San Francisco source; no measure, form, conversion, yield, recipe link, or substitution was added. The bundle has no matching demand.
- Static package normalization, generated-index freshness, ledger/source ownership, picker projection, recipe corpus, encoding, and local-document checks passed. No software tests were run for this database-JSON addition under `AGENTS.md`.
- Integration snapshot: 1,748 references / 141 forms; 2,107 ledger records / 9,595 source entries / 8,142 distinct source IDs / 6,855 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R464 proposal](proposals/wp06-europe-next-regional-identity-review-r464-20261017.md) and [integration README](batches/wp06-europe-guerande-fleur-de-sel-identity-integration-r464-20261017/README.md). Europe-wide coverage remains open.

## 2026-10-17 WP02 Section A7 — R465 amaranth-grits hold

- Held `amaranth grits / amaranth grit` unallocated because the Ukrainian supplier's English pages conflict on product state and no Canadian/Québec product-matched French name or milling boundary is established. R29's amaranth-meal decision remains separate; no active row, alias, form, measure, conversion, yield, recipe link, substitution, or ledger candidate was added. The recipe bundle has no matching demand.
- This documentation-only hold changed no database JSON and needed no tests. See the [R465 proposal](proposals/wp02-section-a7-next-milling-gap-review-r465-20261017.md) and [integration README](batches/wp02-a7-amaranth-grits-hold-integration-r465-20261017/README.md). Section A7 remains open.

## 2026-10-17 WP06 Europe — R466 Prosciutto di Parma

- Added identity-only `Prosciutto di Parma` in both display fields with `jambon de Parme AOP` as its only French alias. The European Commission identifies the protected raw, aged ham and limits production to the Province of Parma; current Canadian product listings use the Italian name. Kept generic prosciutto and ham, Prosciutto di San Daniele, and other cured hams distinct; left English `Parma ham` unallocated in light of the Consortium's Canadian naming context.
- The bundle has no matching recipe demand. Added no forms, measures, mappings, conversions, yields, recipe links, or substitutions. No reusable measure was supported; the 100 g local listing and 7 kg online SKU stay product-specific.
- Static package normalization, generated-index freshness, ledger/source ownership, picker projection, recipe corpus, encoding, and local-document checks passed. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
- Integration snapshot: 1,749 references / 141 forms; 2,108 ledger records / 9,601 source entries / 8,148 distinct source IDs / 6,861 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R466 proposal](proposals/wp06-europe-next-regional-identity-review-r466-20261017.md) and [integration README](batches/wp06-europe-prosciutto-di-parma-identity-integration-r466-20261017/README.md). Europe-wide coverage remains open.

## 2026-10-17 WP04 Section P — R467 shrimp-cracker hold

- Held `shrimp crackers / craquelins de crevettes` outside the active catalog because the display would make broad `crackers` return only this seafood snack. Avoided `prawn crackers`, `shrimp chips`, and `chips aux crevettes` aliases because they would also divert broad `prawn` or `chips` searches. The bundle has no matching demand; no catalog or ledger data changed.
- This documentation-only hold needed no tests. See the [R467 proposal](proposals/wp04-section-p-next-seafood-review-r467-20261017.md) and [integration README](batches/wp04-section-p-shrimp-crackers-hold-integration-r467-20261017/README.md). Section P remains open.

## 2026-10-17 WP06 Europe — R468 Aceto Balsamico di Modena PGI

- Added identity-only `Balsamic Vinegar of Modena PGI / Vinaigre balsamique de Modène IGP` as `ingredient-ref-balsamic-vinegar-of-modena-pgi`, with `Aceto Balsamico di Modena IGP` as its only alias. Kept generic balsamic vinegar, Traditional Modena PDO, Reggio Emilia PDO, and prepared balsamic products separate.
- Generic English and French balsamic-vinegar searches now include three qualified rows; the phrase-first French query `vinaigre balsamique de Modène` returns the PGI row alone, while the qualified Traditional PDO query remains on its existing row. The bundle has no matching demand.
- No forms, measures, density, conversions, yields, recipe links, or substitutions were added. Static package and generated-index checks, ledger schema/source ownership, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. No software tests were run for this database-JSON addition under `AGENTS.md`.
- Post-integration snapshot: 1,750 references / 141 forms; 2,109 ledger records / 9,607 source entries / 8,154 distinct source IDs / 6,867 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R468 proposal](proposals/wp06-europe-next-regional-identity-review-r468-20261017.md) and [integration README](batches/wp06-europe-modena-pgi-balsamic-integration-r468-20261017/README.md). Europe-wide regional coverage remains open.

## 2026-10-17 WP02 Section A7 — R469 Khorasan semolina

- Added identity-only `Khorasan semolina / semoule de blé khorasan` with empty aliases. Manufacturer, Québec milling-study, and finished-pasta evidence support the Khorasan semolina product while keeping KAMUT® brand wording and fine/re-milled/whole grades separate. The 114-recipe / 1,123-row corpus has no matching demand.
- Added no forms, measures, density, mappings, conversions, yields, recipe links, or substitutions. The experimental milling fractions and finished-pasta packages remain source-specific. Static seed normalization, generated-index freshness, ledger schema/source ownership, picker projection, recipe corpus, encoding, local links, and whitespace checks passed. No software tests were run for this database-JSON addition under `AGENTS.md`.
- Post-integration snapshot: 1,751 references / 141 forms; 2,110 ledger records / 9,613 source entries / 8,160 distinct source IDs / 6,873 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R469 proposal](proposals/wp02-section-a7-next-milling-gap-review-r469-20261017.md) and [integration README](batches/wp02-a7-khorasan-semolina-integration-r469-20261017/README.md). Section A7 remains open.

## 2026-10-17 WP04 Section P — R470 breaded calamari rings

- Added identity-only `breaded calamari rings / rondelles de calmar panées` as `ingredient-ref-breaded-calamari-rings`. Kept the product separate from the existing raw calamari / calmar identity and its cut-only ring form. No aliases or forms were added.
- Recipe 023 still contains 140 g sliced raw calamari and hand-breading instructions. It does not request a ready-breaded commercial product and was not relinked. The 114-recipe / 1,123-row bundle has no structured ingredient row for breaded calamari rings.
- Added no measures, density, mappings, conversions, yields, recipe links, or substitutions. Static package normalization, generated-index freshness, ledger schema/source ownership, picker projection, recipe scan, encoding, local links, and whitespace checks passed. No software tests were run for this database-JSON addition under `AGENTS.md`.
- Post-integration snapshot: 1,753 references / 141 forms; 2,112 ledger records / 9,624 source entries / 8,171 distinct source IDs / 6,884 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R470 proposal](proposals/wp04-section-p-next-seafood-review-r470-20261017.md) and [integration README](batches/wp04-section-p-breaded-calamari-rings-integration-r470-20261017/README.md). Section P remains open.

## 2026-10-17 WP06 Europe — R471 Gorgonzola PDO

- Added identity-only `Gorgonzola AOP / Gorgonzola PDO` as `ingredient-ref-gorgonzola-pdo`, with `Gorgonzola DOP` and official French/Italian style phrases as aliases. Kept generic blue cheese, Roquefort, Fourme d’Ambert, and other named varieties separate; Metro and Mayrand unqualified product titles do not establish PDO status. The 114-recipe / 1,123-row corpus has no matching demand.
- No forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were added. Static package normalization, generated-index freshness, ledger schema/source ownership, picker projection, recipe corpus, encoding, local links, and whitespace checks passed. No software tests were run for this database-JSON addition under `AGENTS.md`.
- Post-integration snapshot: 1,752 references / 141 forms; 2,111 ledger records / 9,621 source entries / 8,168 distinct source IDs / 6,881 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R471 proposal](proposals/wp06-europe-next-regional-identity-review-r471-20261017.md) and [integration README](batches/wp06-europe-gorgonzola-pdo-integration-r471-20261017/README.md). Europe-wide coverage remains open.

## 2026-10-17 WP02 Section A7 — R472 wheat-meal boundary hold

- Kept generic `wheat meal` and `wheatmeal` unresolved. The NFC title `Organic Soft Wheat Meal / Farine de blé mou biologique` lacks a milling description; a distinct Québec pastry-flour record does not establish its identity. Retained `ingredient-ref-wheat-meal` only for the whole-wheat-qualified identity and current French alternate.
- The recipe scan found no matching phrases or ingredient rows. No catalog, ledger, recipe, or generated-index data changed; no software tests were needed for this documentation-only hold.
- See the [R472 proposal](proposals/wp02-section-a7-wheat-meal-boundary-review-r472-20261017.md) and [integration README](batches/wp02-a7-wheat-meal-hold-integration-r472-20261017/README.md). Section A7 remains open.

## 2026-10-17 WP03/WP04/WP06 gap review — R479–R481

- Added English `Irish oats` / `pinhead oats` and French `avoine irlandaise` aliases to the existing `steel-cut oats / avoine découpée` row. Kept prepared, Scottish, discouraged, and broad-flake phrases out of aliases.
- Added identity-only `lobster meat / chair de homard` with one cooked-frozen form, separate from species rows, intact claws, the held tail, paste, tomalley, roe, cocktail, and imitation products.
- Added identity-only `dried Gnetum leaves / feuilles séchées de Gnetum` at genus scope with no aliases; local names and species remain source-specific.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. Static seed normalization/validation, generated-index freshness, ledger schema and source ownership, recipe scan, UTF-8/no-BOM, escaped-Unicode, and scoped whitespace checks passed. No software tests were run for these database-JSON-only additions under `AGENTS.md`.
- Post-integration snapshot: 1,759 references / 143 forms / 56 legacy candidates; 2,118 ledger records / 9,663 source entries / 8,201 distinct source IDs / 6,914 distinct source URLs; 114 recipes / 1,123 ingredient rows. See the [R479 proposal](proposals/wp03-section-f-next-gap-review-r479-20261017.md), [R480 proposal](proposals/wp04-section-p-lobster-meat-product-boundary-review-r480-20261017.md), [R481 proposal](proposals/wp06-african-next-regional-review-r481-20261017.md), and [integration README](batches/wp03-wp04-wp06-r479-r481-gap-review-integration-20261017/README.md). Section F, Section P, and African regional coverage remain open.

## 2026-10-17 WP03 Section F — R482 CNF 2026 rice row access hold

- Documented that direct CNF 2026 CSV row access for cooked white long-grain rice, Food Code 4523, was unavailable in this review. Kept the CNF 2015 observations edition-specific and made no 2026 row-presence or value claim; the row-inspection checkbox remains open. No catalog or ledger data changed.
- This documentation-only hold needed no tests. See the [R482 proposal](proposals/wp03-section-f-next-gap-review-r482-20261017.md) and [integration README](batches/wp03-section-f-cnf-2026-rice-row-access-hold-integration-r482-20261017/README.md).

## 2026-10-17 WP04 Section P / WP06 Africa — R483–R484

- Held generic `fish burger(s) / burger(s) de poisson` unallocated because current Canadian and Québec product pages use burger wording for materially different breaded-pollock, whole-fillet-in-batter, and tuna-mixture products. The bundled corpus has no matching demand. R171's fish-cake/croquette hold and R221's frozen fish-stick identity remain separate; no active catalog data changed.
- Added identity-only `grains of Selim / grains de Selim` for *Xylopia aethiopica*, with English `Uda seeds` and `Selim pepper` and French `poivre de Sélim` aliases. Kept the ambiguous `graines de Guinée` alias on grains of paradise. Added no forms, measures, conversions, yields, recipe links, or substitutions.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. Static seed/package, generated-index, ledger schema/source ownership, picker, recipe, encoding, and documentation checks passed. No software tests were run because R484 only adds database JSON data and R483 is a documentation-only hold under `AGENTS.md`. See the [R483 proposal](proposals/wp04-section-p-next-seafood-review-r483-20261017.md), [R484 proposal](proposals/wp06-african-next-regional-review-r484-20261017.md), and [integration README](batches/wp04-wp06-r483-r484-gap-review-integration-20261017/README.md). Section P and broader African regional coverage remain open.

## 2026-10-17 WP03 Section F / WP04 Section P / WP06 Africa — R485–R487

- R485 held a single Canadian Rice Chex identity pending family-wide Chex picker review. The current manufacturer guide lists four distinct Chex siblings, so a Rice-only row would make the broad `Chex` query misleading. No active catalog or ledger data changed for this hold.
- R486 added identity-only `coconut shrimp / crevettes à la noix de coco`, with singular French `crevette à la noix de coco` as a search alias. Coconut butterfly, plain breaded, popcorn, and tempura shrimp remain separate; no shrimp/crevette recipe demand was found.
- R487 added identity-only `ugu leaves / feuilles de courge cannelée (ugu)` for the edible leaf product of *Telfairia occidentalis*, with no aliases. Keep its seed products, ordinary pumpkin/squash leaves, and unscoped regional names distinct; the descriptive French display remains provisional pending Québec terminology review.
- No forms, measures, mappings, conversions, yields, recipe links, or substitutions were added. The unchanged recipe corpus has 114 files / 1,123 ingredient rows. The package now has 1,762 references, 143 forms, and 56 legacy candidates; the ledger has 2,121 records, 9,688 source entries, 8,220 distinct source IDs, and 6,933 distinct source URLs.
- Static package/reference normalization, package validation, generated-index freshness, ledger schema/source ownership, picker projections, recipe scan, UTF-8/no-BOM, escaped seed Unicode, local links, and scoped whitespace checks passed. No software tests were run because the only active data changes add database JSON and R485 is a documentation hold under `AGENTS.md`. See the [R485 proposal](proposals/wp03-section-f-next-gap-review-r485-20261017.md), [R486 proposal](proposals/wp04-section-p-next-seafood-review-r486-20261017.md), [R487 proposal](proposals/wp06-african-next-regional-review-r487-20261017.md), and [integration README](batches/wp03-wp04-wp06-r485-r487-gap-review-integration-20261017/README.md). Section F, Section P, and broader African regional coverage remain open.

## 2026-10-17 WP03 Section F R488 / WP04 Section P R489 / WP06 Africa R490

- Replaced R485’s single-Rice-Chex hold with five identity-only references for the current Québec-evidenced Rice, Cinnamon, Honey Nut, Chocolate, and Apple Cinnamon Chex products. The five are not a complete family roster; Corn and Peanut Butter remain out for the documented evidence gaps. `Chex` returns five, `Cinnamon Chex` returns two, and generic `rice cereal` remains unchanged.
- Added species-neutral `canned cod liver / foie de morue en conserve` with only exact Mayrand product-name aliases after R404 changed the broad `liver` / `foie` picker state. The queries now show canned cod liver and steamed monkfish liver as separate named choices; package quantities remain SKU-specific.
- Resolved the existing ledger-only shiro candidate in place and added `shiro powder / poudre de shiro` with `shiro flour` as its only alias. The powder/stew, plain chickpea flour, and formulation boundaries remain explicit; the French display is provisional pending Québec review.
- Added no forms, reusable measures, conversions, yields, recipe links, or substitutions. No candidate-specific demand occurs in the 114-recipe / 1,123-row corpus. Static reference/package, generated-index, ledger schema/source ownership, picker, recipe, and encoding checks passed. No software tests were run because the active data changes add database JSON under `AGENTS.md`.
- Post-integration snapshot: 1,769 references / 143 forms / 56 legacy candidates; 2,127 ledger records / 9,725 source entries / 8,241 distinct source IDs / 6,954 URLs; 114 recipes / 1,123 ingredient rows. See the [R488 proposal](proposals/wp03-section-f-chex-family-current-quebec-picker-review-r488-20261017.md), [R489 proposal](proposals/wp04-section-p-canned-cod-liver-picker-reassessment-r489-20261017.md), [R490 proposal](proposals/wp06-african-next-regional-review-r490-20261017.md), and [integration README](batches/wp03-wp04-wp06-r488-r490-gap-review-integration-20261017/README.md). Section F, Section P, and broader African regional coverage remain open.


- 2026-10-17 WP03 Section F R491 / WP04 Section P R492 / WP06 Africa R493: added identity-only `Cocoa Loops cereal / Céréales Cocoa Loops`, `smoked Arctic char / omble chevalier fumé`, and `calabash nutmeg / muscade calebasse`. Kept the cereal’s 1 cup (33 g) on its manufacturer label, the char’s 100 g on one MAPAQ recipe, and the qualitative West African nutmeg-use statement in source-scoped ledger evidence only; no reusable measures or active substitution rules were added. The recipe corpus has no candidate-specific demand. Static package normalization/validation, generated-index freshness, ledger schema/source ownership, picker projections, corpus, encoding, local links, and whitespace checks passed. No software tests were run because the data changes add database JSON under `AGENTS.md`. Snapshot: 1,772 references / 143 forms / 56 legacy candidates; 2,130 ledger records / 9,745 source entries / 8,254 distinct source IDs / 6,967 distinct URLs; 114 recipes / 1,123 rows. See `batches/wp03-wp04-wp06-r491-r493-gap-review-integration-20261017/README.md` and the [R491](proposals/wp03-section-f-next-gap-review-r491-20261017.md), [R492](proposals/wp04-section-p-next-seafood-review-r492-20261017.md), and [R493](proposals/wp06-african-next-regional-review-r493-20261017.md) proposals. Section F, Section P, and broader African regional coverage remain open.

- 2026-10-17 WP03 Section F R494 / WP04 Section P R495 / WP06 Africa R496: resolved the Shreddies Original picker hold by adding separate Original, Honey, and Cinnamon Vanilla identities; added identity-only canned Québec redfish / sébaste du Québec en conserve, separate from raw redfish; and added identity-only African basil leaves / feuilles de basilic africain for *Ocimum gratissimum*, with English `scent leaf/leaves` aliases and provisional French. No candidate-specific recipe demand, forms, measures, conversions, yields, recipe links, or substitutions were added. Static package, ledger/source ownership, picker, corpus, encoding, local-link, and whitespace checks passed. No software tests were run because these changes add database JSON under `AGENTS.md`. See the [integration README](batches/wp03-wp04-wp06-r494-r496-gap-review-integration-20261017/README.md) and the [R494](proposals/wp03-section-f-next-gap-review-r494-20261017.md), [R495](proposals/wp04-section-p-next-seafood-review-r495-20261017.md), and [R496](proposals/wp06-african-next-regional-review-r496-20261017.md) proposals. Section F, Section P, and African regional coverage remain open.


## 2026-10-17 WP03 Section F R497 / WP04 Section P R498 / WP06 Africa R499

- Resolved the standard Honey Nut Cheerios hold with separate Canadian standard-sugar and Lower Sugar identities; retained four 37 g label servings only as SKU-specific ledger observations and kept the brand query multi-result.
- Reopened the broad monkfish / baudroie hold after R404 made steamed monkfish liver the only bare-name result. Added an explicitly multi-species market-name group, separate from liver, species-specific terms, and burbot / lotte.
- Added identity-only gboma leaves / feuilles de gboma for *Solanum macrocarpon*. The French display remains provisional pending Québec consumer-name review; broad eggplant terms remain unassigned.
- Added no forms, recipe links, densities, reusable measures, mappings, conversions, yields, or substitutions. The 114-recipe / 1,123-row corpus has no candidate-specific demand. Static package, generated-index, ledger/schema/source-ownership, picker, corpus, encoding, link, and whitespace checks passed. No software tests were run because these changes add database JSON under AGENTS.md.
- Post-integration snapshot: 1,781 references / 143 forms / 56 legacy candidates; 2,139 ledger records / 9,794 source entries / 8,289 source IDs / 7,001 distinct URLs. See the [integration README](batches/wp03-wp04-wp06-r497-r499-gap-review-integration-20261017/README.md) and [R497](proposals/wp03-section-f-next-gap-review-r497-20261017.md), [R498](proposals/wp04-section-p-next-seafood-review-r498-20261017.md), and [R499](proposals/wp06-african-next-regional-review-r499-20261017.md) proposals.

## 2026-10-17 WP03 Section F R500 / WP04 Section P R501 / WP06 Africa R502

- Reassessed the R358 Cinnamon Toast Crunch hold with current retailer listings; several siblings are listed in Canada, but there is no stable Canadian manufacturer roster or bilingual family-query rule. Keep the plain cereal outside active references and the shared ledger.
- Promoted the existing crayfish candidate in place to identity-only `freshwater crayfish / écrevisse d’eau douce`; keep species and product state open, and leave `crawfish` out of global aliases.
- Added identity-only waterleaf / water leaf for edible *Talinum fruticosum* leaves with *T. triangulare* as a synonym alias. The borrowed French display remains provisional; retailer metadata `Feuilles d’eau` is not generalized as a catalog name.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. No forms, reusable measures, conversions, yields, recipe links, or active substitutions were added. Static package, generated-index, ledger/source-ownership, picker, corpus, encoding, link, and whitespace checks passed. No software tests were run: R501/R502 only add database JSON data under `AGENTS.md`, while R500 is a documentation-only hold review.
- Post-integration snapshot: 1,783 references / 143 forms / 56 legacy candidates; 2,140 ledger records / 9,808 source entries / 8,303 source IDs / 7,013 URLs. See the [integration README](batches/wp03-wp04-wp06-r500-r502-gap-review-integration-20261017/README.md) and [R500](proposals/wp03-section-f-cinnamon-toast-crunch-family-review-r500-20261017.md), [R501](proposals/wp04-section-p-crayfish-boundary-recheck-r501-20261017.md), and [R502](proposals/wp06-african-next-regional-review-r502-20261017.md) proposals.

## 2026-10-17 WP03 Section F R506 / WP04 Section P R504 / WP06 Africa R505

- Added identity-only snow-crab sections / sections de crabe des neiges for the marketable section/cluster assembly. Kept it distinct from crab legs, picked meat, claws, crayfish, and the R12 species-level hold; no taxonomic claim or numeric behavior was added.
- Added identity-only garden egg fruit / aubergine écarlate for *Solanum aethiopicum*. The French display remains provisional. A single-market density observation and qualitative eggplant replacement statement stay blocked in the ledger; neither became runtime behavior.
- Added `white corn grits` as an English alias on existing corn grits. French aliases remain empty to preserve hominy grits ownership of `gruau de maïs`.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. Static package and index checks, ledger schema/source ownership, picker projections, corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests were run because the changes add database JSON data under `AGENTS.md`; the generated index was refreshed from the canonical package. Snapshot: 1,785 references / 143 forms; 2,142 ledger records / 9,829 source entries / 8,317 source IDs / 7,027 URLs. See the [R504–R506 integration README](batches/wp03-wp04-wp06-r504-r506-gap-review-integration-20261017/README.md) and individual proposals; Section F, Section P, and African regional coverage remain open.

## 2026-10-17 WP03 Section F R507

- Rechecked official CNF 2026 access for dry quinoa, Food Code 4495. The listing confirms the relational CSV files, but the file contents remain inaccessible through browser and workspace routes; no local copy was available and no row claim is made. Keep the joined-row inspection open and CNF 2015 portions edition-specific. No catalog or ledger data changed.
- This documentation-only access hold needed no software tests. See the [R507 proposal](proposals/wp03-section-f-next-gap-review-r507-20261017.md) and [integration README](batches/wp03-section-f-cnf-2026-dry-quinoa-row-access-recheck-integration-r507-20261017/README.md).

## 2026-10-17 WP04 Section P R508

- Held general shrimp dumplings / dumplings aux crevettes unallocated after reviewing current Canadian/Québec product wording, the broader Québec dumpling terminology, and distinct product styles/fillings. An active shrimp-specific identity would make broad `dumpling(s)` queries resolve to a singleton, and the 114-recipe / 1,123-row corpus has no matching demand.
- No catalog or ledger data changed. This documentation-only hold needed no software tests. See the [R508 proposal](proposals/wp04-section-p-next-seafood-review-r508-20261017.md) and [integration README](batches/wp04-section-p-shrimp-dumpling-boundary-hold-integration-r508-20261017/README.md).

## 2026-10-17 WP06 African regional R509

- Added identity-only dried kinkeliba leaves / feuilles de kinkéliba séchées for the dried-leaf infusion ingredient. The descriptive Québec French remains provisional; prepared beverage terms are not aliases. The Dakar study's batch quantities remain source-specific text, not reusable measures; no forms, conversions, yields, recipes, or substitutions were added.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. Seed-package normalization/validation, generated-index freshness, ledger schema and source ownership, and scoped whitespace checks passed. No software tests were run because this change adds database JSON under `AGENTS.md`. See the [R509 proposal](proposals/wp06-african-next-regional-review-r509-20261017.md) and [integration README](batches/wp06-african-kinkeliba-identity-integration-r509-20261017/README.md).

## 2026-10-17 WP03 Section F R510

- Rechecked access to the CNF 2026 joined rows for dry pearl barley, Food Code 4411. Health Canada confirms the relational CSV publication format and the continued interim 2015 web route, but the direct dataset listing and CSV contents remained inaccessible in this environment. No 2026 row claim is made; keep the joined inspection open and the two 2015 portions edition-specific.
- No catalog or ledger data changed. This documentation-only access recheck needed no software tests. See the [R510 proposal](proposals/wp03-section-f-next-gap-review-r510-20261017.md) and [integration README](batches/wp03-section-f-pearl-barley-cnf-2026-access-recheck-integration-r510-20261017/README.md).

## 2026-10-17 WP04 Section P R511

- Held general shrimp ring / `couronne de crevettes` unallocated after reviewing current Canadian and Québec listings. Product ingredient and sauce details are SKU-specific, and adding the row would replace broad `ring` and `couronne` picker results with one shrimp product; the recipe bundle has no matching demand.
- Kept the R183 canned cocktail-shrimp and R501 freshwater-crayfish boundaries. No catalog or ledger data changed. This documentation-only hold needed no software tests. See the [R511 proposal](proposals/wp04-section-p-next-seafood-review-r511-20261017.md) and [integration README](batches/wp04-section-p-shrimp-ring-boundary-hold-integration-r511-20261017/README.md).

## 2026-10-17 WP06 African regional R512

- Added identity-only `uziza leaves / feuilles d’uziza` for *Piper guineense* leaves, with `uziza leaf` as the sole English alias and provisional French wording from Montréal-facing seller copy. Kept the fruit/seed spice, broad pepper terms, and other *Piper* species separate.
- The 114-recipe / 1,123-row corpus has no matching demand. No forms, reusable measures, mappings, conversions, yields, recipe links, or substitutions were added. Static package/ledger validation, generated-index freshness, picker projections, and source ownership passed. No software tests were run because the change adds database JSON under `AGENTS.md`. See the [R512 proposal](proposals/wp06-african-next-regional-review-r512-20261017.md) and [integration README](batches/wp06-african-uziza-leaves-identity-integration-r512-20261017/README.md).

## 2026-10-17 WP03 Section F R513

- Held Inno Foods Blueberry Oat Puffs outside active references and the ledger until a product-matched Québec-facing French product title is verified. The manufacturer confirms a formulated cereal but the linked package mockup text was not readable; retailer sources do not establish Québec availability.
- Kept the cereal distinct from plain puffed oats and its component ingredients. The 114-recipe / 1,123-row corpus has no matching demand; no catalog or ledger data changed. This documentation-only hold needed no software tests. See the [R513 proposal](proposals/wp03-section-f-next-gap-review-r513-20261017.md) and [integration README](batches/wp03-section-f-inno-blueberry-oat-puffs-boundary-hold-integration-r513-20261017/README.md).

## 2026-10-17 WP04 Section P R514

- Added identity-only `canned sardines in tomato sauce / sardines en conserve à la sauce tomate` as a species-neutral Canadian prepared-product group. Kept generic canned sardines, raw fish species, herring in tomato sauce, smoked sardine fillets, and standalone tomato sauce distinct.
- The 114-recipe / 1,123-row corpus has no sardine demand; the unrelated tomato-sauce row in African Peanut Stew remains unchanged. No forms, measures, mappings, conversions, yields, recipe links, or substitutions were added.
- Static package and ledger validation, generated-index freshness, picker projections, and source ownership passed. No software tests were run because the change adds database JSON under `AGENTS.md`. See the [R514 proposal](proposals/wp04-section-p-next-seafood-review-r514-20261017.md) and [integration README](batches/wp04-section-p-canned-sardines-tomato-sauce-identity-integration-r514-20261017/README.md); Section P remains open.

## 2026-10-17 WP06 African regional R515

- Added identity-only `oha leaves / feuilles d’oha` for *Pterocarpus mildbraedii* leaves used in Southern Nigerian soups. Added `oha leaf` as an English alias and `oha feuille` only as Toronto marketplace search wording; the French display remains provisional.
- Kept `ora`, `uha`, prepared soup names, scientific-name wording, and other soup leaves out of aliases. The picker projection shows `oha` resolving to the new complete phrase instead of three partial poha matches; the broad `ora` collision remains unchanged.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. No forms, measures, conversions, yields, recipe links, or substitutions were added. Static package and ledger validation, generated-index freshness, picker projection, and source ownership passed. No software tests were run because this adds database JSON data under `AGENTS.md`. See the [R515 proposal](proposals/wp06-african-next-regional-review-r515-20261017.md) and [integration README](batches/wp06-african-oha-leaves-identity-integration-r515-20261017/README.md); broader African regional coverage remains open.

## 2026-10-17 WP03 Section F R516

- Added identity-only `Sugar Crisp cereal / Céréales Sugar-Crisp` for the named Canadian packaged cereal, separate from plain puffed wheat. Added no aliases, forms, densities, mappings, conversions, yields, recipe links, or substitutions.
- Retained Provigo's indexed 1 cup (40 g) nutrition-panel portion for its named listing only in the research ledger. No reusable cup measure or conversion was activated. No matching demand occurs in the 114-recipe / 1,123-row corpus.
- Static package/ledger validation, generated-index freshness, picker projection, recipe scan, and source ownership passed. No software tests were run because this adds database JSON under `AGENTS.md`. See the [R516 proposal](proposals/wp03-section-f-next-gap-review-r516-20261017.md) and [integration README](batches/wp03-section-f-sugar-crisp-cereal-identity-integration-r516-20261017/README.md); Section F remains open.

## 2026-10-17 WP04 Section P R517

- Added identity-only `Dungeness crab cluster / section de crabe dormeur` for the species-qualified cluster/section product, with product-specific English and French terms. Kept it distinct from Dungeness species, snow-crab sections, loose legs, picked meat, and other crab products.
- No matching demand occurs in the 114-recipe / 1,123-row corpus. No forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were added. Static package/ledger validation, generated-index freshness, picker projection, and source ownership passed. No software tests were run because this adds database JSON under `AGENTS.md`.
- See the [R517 proposal](proposals/wp04-section-p-next-seafood-review-r517-20261017.md) and [integration README](batches/wp04-section-p-dungeness-crab-sections-identity-integration-r517-20261017/README.md); Section P remains open.

## 2026-10-17 WP06 African regional R518

- Added identity-only `bitter kola seeds / noix de bitter kola` for *Garcinia kola*, separate from true kola nuts. The French display is provisional Canadian retailer wording; `bitter cola`, `petit cola`, and scientific-name phrases remain outside aliases.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. No forms, measures, mappings, conversions, yields, recipe links, or substitutions were added; substitution research remains unresearched. Static package, ledger, generated-index, picker, and source-ownership checks passed. No software tests were run because this adds database JSON under `AGENTS.md`.
- Snapshot at R518 integration, before the later R516/R517 integrations: 1,790 references / 143 forms / 56 legacy candidates; 2,147 ledger records / 9,853 source entries / 8,340 source IDs / 7,050 URLs. See the [R518 proposal](proposals/wp06-african-next-regional-review-r518-20261017.md) and [integration README](batches/wp06-african-bitter-kola-seeds-identity-integration-r518-20261017/README.md); broader African regional coverage remains open.

## 2026-10-17 WP03 Section F R519

- Added identity-only `Honeycomb cereal / Céréales Honeycomb` for the named current Canadian finished cereal. Kept it distinct from honey, corn and oat ingredients, plain puffed grains, and honeycomb candy or topping; added no aliases, forms, measures, mappings, conversions, yields, recipe links, or substitutions.
- The 114-recipe / 1,123-row corpus has no candidate-specific demand. Static package/ledger validation, generated-index freshness, picker projections, and source ownership passed. No software tests were run because this adds database JSON under `AGENTS.md`.
- At R519 integration: 1,793 references / 143 forms / 56 legacy candidates; 2,150 ledger records / 9,866 source entries / 8,350 distinct source IDs / 7,060 distinct URLs. See the [R519 proposal](proposals/wp03-section-f-next-gap-review-r519-20261017.md) and [integration README](batches/wp03-section-f-honeycomb-cereal-identity-integration-r519-20261017/README.md); Section F remains open.

## 2026-10-17 WP04 Section P R520

- Held unqualified `silverside / capucette` outside active data because Metro’s indexed Québec listing identifies *Odontesthes regia*, while OQLF assigns Québec `capucette` to *Menidia menidia*; CFIA lists overlapping short names across the species. No alias or species identity was activated, and existing smelt and capelin rows remain separate.
- The full 114-recipe / 1,123-row corpus has no matching demand. No catalog or ledger data changed; the four review source IDs remain proposal-local. No software tests were run for this documentation-only hold.
- See the [R520 proposal](proposals/wp04-section-p-next-seafood-review-r520-20261017.md) and [integration README](batches/wp04-section-p-silverside-capucette-naming-boundary-hold-integration-r520-20261017/README.md). The broad WP04 vernacular-fish checklist remains open.

## 2026-10-17 WP06 African regional R521

- Promoted the existing Matooke ledger candidate in place to identity-only `East African highland cooking bananas (matooke) / banane matooke`. The French display is provisional Québec-facing retailer wording; broad banana and plantain terms remain unassigned.
- Used the accessible Uganda Gazette to distinguish raw Matooke from Gonja plantain and the prepared dish. The newer 2026 UNBS attachments could not be inspected. No forms, measures, conversions, yields, recipe links, or substitutions were added.
- Static package/ledger, generated-index, source-ownership, picker, and corpus checks passed. No software tests were run because the change only adds database JSON data under `AGENTS.md`. See the [R521 proposal](proposals/wp06-african-next-regional-review-r521-20261017.md) and [integration README](batches/wp06-african-matooke-identity-integration-r521-20261017/README.md); broader African regional coverage remains open.

## 2026-10-17 WP03 Section F R522

- Added three separate identity-only Honey Bunches of Oats finished cereals: Honey Roasted, with Almonds, and with Real Strawberries, each with a descriptive Canadian French display. Kept aliases, forms, measures, conversions, recipe links, and substitutions empty. The French family page has an unresolved chocolate image; no chocolate identity was added.
- The 114-recipe / 1,123-row manifest corpus has no matching demand. Eight unique manufacturer sources were attached as twelve ledger entries because the two brand pages provide shared context for all three products.
- Static package/ledger, generated-index, picker, source-ownership, encoding, and corpus checks passed. No software tests were run because the change only adds database JSON data under `AGENTS.md`. See the [R522 proposal](proposals/wp03-section-f-next-gap-review-r522-20261017.md) and [integration README](batches/wp03-section-f-honey-bunches-of-oats-cereal-identity-integration-r522-20261017/README.md); Section F remains open.

## 2026-10-17 WP04 Section P R523

- Kept generic `fish floss` unallocated. Current Canadian retail evidence shows pollock, marlin, and tuna floss products alongside soy floss, but does not establish a common formulation, a Québec-facing French consumer name, or a basis for species-specific rows.
- Exact `fish floss` and `rousong de poisson` queries would resolve to a hypothetical row; bare `floss` would also become a misleading singleton. The full 114-recipe / 1,123-row corpus has no matching demand.
- No catalog or ledger data changed; all six proposed source IDs remain proposal-local. This documentation-only hold needed no software tests. See the [R523 proposal](proposals/wp04-section-p-fish-floss-product-boundary-review-r523-20261017.md) and [integration README](batches/wp04-section-p-fish-floss-boundary-hold-integration-r523-20261017/README.md); WP04 fish-product coverage remains open.

## 2026-10-17 WP03 Section F R524

- Held Quaker Harvest Crunch Canadian Maple outside active data pending a family-level bilingual picker review. The current Canadian English manufacturer page lists nine family variants, while the French Croque Nature page lists seven; a single Maple row would make both broad family queries misleading singletons. The full 114-recipe / 1,123-row corpus has no matching demand.
- No catalog or research-ledger data changed, and all seven proposed source IDs remain proposal-local. This documentation-only hold needed no software tests. See the [R524 proposal](proposals/wp03-section-f-next-gap-review-r524-20261017.md) and [integration README](batches/wp03-section-f-quaker-harvest-crunch-canadian-maple-hold-integration-r524-20261017/README.md); broader Section F coverage remains open.

## 2026-10-17 WP02 B2 R525 — precooked chickpea flour

- Added `precooked chickpea flour / farine de pois chiche précuite` as a form under the existing generic chickpea-flour reference. Keep it separate from raw flour, roasted sattu, and pregelatinized flour; the descriptive Québec French display is provisional and has no match-term aliases.
- Added seven source entries to the form ledger record and retained the Naturelka study’s 0.70 ± 0.00 g/mL bulk-density result only as a sample-specific lab observation. Active form density remains null; no reusable measure, mapping, recipe link, or substitution was added. The bundle has no matching demand.
- Static package, ledger/schema/source ownership, generated-index, picker, encoding, corpus, local-link, and scoped whitespace checks are recorded in the [R525 integration README](batches/wp02-b2-precooked-chickpea-flour-form-integration-r525-20261017/README.md). No software tests were run for this database-JSON addition under `AGENTS.md`; broader B2 work remains open.

## 2026-10-17 WP04 Section P R526 — salmon kama / collar

- Held salmon kama/collar outside active references, forms, aliases, legacy identities, and the research ledger. Canadian menus pair prepared “salmon kama” dishes with collar wording, but the reviewed French evidence does not establish a Québec salmon-collar term or a reusable raw-cut boundary. Do not attach it to generic salmon fillets or a species row.
- The full 114-recipe / 1,123-row corpus has no collar/kama demand. All eight proposed source IDs remain proposal-local; no catalog or ledger data changed.
- This documentation-only hold needed no software tests. See the [R526 proposal](proposals/wp04-section-p-next-seafood-review-r526-20261017.md) and [integration README](batches/wp04-section-p-salmon-kama-collar-boundary-hold-integration-r526-20261017/README.md); Section P remains open.

## 2026-10-17 WP08 / WP09 R527 — icing sugar

- Verified the existing bilingual icing-sugar identity and alias set from OQLF, TERMIUM Plus, the Canadian Sugar Institute, Metro, Collins, and King Arthur. Kept the active reference unchanged. Exact `sucre glace` and `sucre en poudre` searches return icing sugar; the broader `sucre à glacer` phrase returns both icing sugar and the distinct fondant-sugar reference. No alias was added or removed.
- Added one evidence-only, volume-based homemade powdered-sugar substitution and kept weight-based batter/dough use blocked because the reviewed pages do not report the prepared substitute’s mass. Preserved the nine source-specific measurement observations and blocked measurement state. Added no runtime rule, conversion, recipe link, or recipe edit. The 114-recipe / 1,123-row corpus contains 30 existing icing-sugar rows across 26 recipes.
- Ledger schema/source ownership, picker projection, corpus, encoding, local links, and scoped whitespace checks passed. No software tests were needed for this evidence-only JSON update under `AGENTS.md`. See the [R527 proposal](proposals/wp08-icing-sugar-substitution-review-r527-20261017.md) and [integration README](batches/wp08-wp09-icing-sugar-alias-substitution-integration-r527-20261017/README.md); broader WP08/WP09 coverage remains open.

## 2026-10-17 WP03 Section F R528 — Mesa Sunrise cereal pair

- Added separate identity-only references for Mesa Sunrise cereal and Mesa Sunrise with raisins, using Canadian product names and product-specific French Metro title aliases. The maker’s 750 g and 825 g package entries and UPCs remain product context only; no forms, measures, densities, mappings, conversions, yields, recipes, or substitutions were added.
- The full 114-recipe / 1,123-row corpus scan found no matching demand. The French Metro listing text was available in search indexing, while direct opens redirected to English pages; both manufacturer multipacks showed sold out at review.
- Static package, generated-index, ledger/schema/source ownership, picker projection, corpus, encoding, and documentation checks passed. No software tests were needed for this database-JSON addition under `AGENTS.md`. See the [R528 proposal](proposals/wp03-section-f-next-gap-review-r528-20261017.md) and [R528–R530 integration README](batches/wp02-wp03-wp04-r528-r530-gap-review-integration-20261017/README.md); Section F remains open.

## 2026-10-17 WP02 B2 R529 — sweet lupin flour

- Added one Ecoideas-specific 2 tbsp (15 g) label portion and one Spina et al. formula-bounded white-lupin-for-re-milled-semolina bread finding to the existing sweet-lupin ledger record. Kept density and reusable measures unset; added no active substitution rule, recipe link, or general replacement ratio.
- The 114-recipe / 1,123-row corpus has no matching lupin-flour demand. The B2 parent checklist remains open.
- Ledger schema/source ownership, source-linked observations/findings, and documentation checks passed. No software tests were needed for this evidence-only JSON update under `AGENTS.md`. See the [R529 proposal](proposals/wp02-b2-next-flour-starch-gap-review-r529-20261017.md) and [R528–R530 integration README](batches/wp02-wp03-wp04-r528-r530-gap-review-integration-20261017/README.md).

## 2026-10-17 WP04 Section P R530 — kamaboko family hold

- Kept generic kamaboko outside active references and the research ledger. Reviewed Japanese, Canadian, and Québec sources use the term at different product scopes and do not establish one Québec-facing French name for the family; the existing chikuwa, fish-ball, naruto-maki, fish-cake, and surimi boundaries remain distinct.
- The full 114-recipe / 1,123-row corpus scan found no matching demand. No shared catalog or ledger data changed, and the seven proposal-local source IDs remain unregistered.
- This documentation-only hold needed no software tests. See the [R530 proposal](proposals/wp04-section-p-kamaboko-boundary-review-r530-20261017.md) and [R528–R530 integration README](batches/wp02-wp03-wp04-r528-r530-gap-review-integration-20261017/README.md); Section P remains open.


## 2026-10-18 WP02 / WP03 / WP04 R624–R626 and WP12 R627

- R624 appended two source-bounded King Arthur wheat-germ portions and two named-recipe optional alternatives to the existing ledger row. No active density, measure, conversion, recipe link, or substitution rule changed.
- R625 promoted the existing legacy candidate to identity-only `bell pepper / poivron`, keeping Cubanelle and broad/color terms distinct. R626 added the qualified Mrigal multi-species market-name group and excluded `carpe`; neither row has forms, measures, or recipe links.
- Package normalization, generated-index freshness, and research-ledger schema/custom validation passed (1,827 references, 156 forms, 2,198 ledger records). The database-JSON-only updates did not require dedicated software tests under `AGENTS.md`; the separate R627 code change was tested with focused commands.
- R627 fixed inconsistent package aliases in parser code. `PackageYieldConverterTest` passed 12 tests; the focused Pixel 9a `PackageYieldInteractionTest` passed 2 tests. The APK assembled, installed, and launched; the recipe list showed 114 recipes. The broader unit task reported 11 catalog/picker search-boundary failures among 430 tests, so the standard deploy script stopped at its test gate. See the individual review proposals and integration READMEs.


## 2026-10-18 WP02 Section A7 R628 — wheat bran

- Recorded King Arthur's chart and Banana Pancakes wheat-bran portions and Bob's Red Mill's named-product serving on the existing ledger row. The different same-volume amounts remain source-scoped; no density, active conversion, recipe link, or runtime substitution was enabled.
- The wheat-germ alternative is limited to the optional ingredient role in King Arthur's Banana Pancakes. The 114-recipe corpus has no wheat-bran line.
- Ledger schema/custom validation passed. No software tests were required for this database-JSON-only update under `AGENTS.md`. See the [R628 proposal](proposals/wp02-a7-next-grain-meal-evidence-review-r628-20261018.md) and [integration README](batches/wp02-a7-wheat-bran-measure-substitution-integration-r628-20261018/README.md); broader Section A7 work remains open.

## 2026-10-18 WP03 Section L R629 — jalapeño fresh form

- Corrected the existing French display to OQLF-preferred `piment jalapeno`, added the regular plural alias `jalapenos`, and added one fresh-market form. Chipotle and pickled/canned/ground products remain separate.
- Preserved the prior recipe-specific USDA count observation and left the sole bundled jalapeño line unlinked because it does not specify fresh. No numeric behavior, package yield, conversion, or substitution was added.
- Seed package, generated index, and research-ledger validation passed. No software tests were run because this change only edits database JSON data under `AGENTS.md`. See the [R629 proposal](proposals/wp03-section-l-next-fresh-chile-gap-review-r629-20261018.md) and [integration README](batches/wp03-section-l-jalapeno-fresh-integration-r629-20261018/README.md); Section L remains open.

## 2026-10-18 WP04 Section P R630 — gilthead bream

- Added identity-only `gilthead bream / dorade royale` for *Sparus aurata* with the OQLF-attested English alias `gilthead sea bream`. R604’s multi-species market groups remain distinct; broad search returns the groups and species row.
- No bundled recipe demand, form, numeric data, recipe link, or substitution was found or added.
- Seed-package, generated-index, ledger, ownership, picker-projection, recipe corpus, and scoped encoding checks passed. No software tests were run because the change only adds database JSON data under `AGENTS.md`. See the [R630 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r630-20261018.md) and [integration README](batches/wp04-section-p-gilthead-bream-identity-integration-r630-20261018/README.md); Section P remains open.

## 2026-10-18 WP02 Section A7 R631 — Scottish-oatmeal portion

- Recorded Bob’s Red Mill’s 1/4 cup (36 g) serving on the existing Scottish-oatmeal ledger row. The English and Canadian French pages show the same product label, so this remains one product-specific observation. Density and mappings stay empty; substitution research stays open.
- Package, generated-index, and ledger validation passed with 1,828 references, 158 forms, and 2,199 ledger records. No software tests were needed for the database-JSON-only update under `AGENTS.md`. See the [R631 proposal](proposals/wp02-a7-next-grain-meal-gap-review-r631-20261018.md) and [integration README](batches/wp02-a7-scottish-oatmeal-portion-integration-r631-20261018/README.md); A7 remains open.

## 2026-10-18 WP03 Section L R632 — Serrano fresh-market form

- Added the English plural alias `serrano peppers` and a fresh-market form under the existing Serrano identity. French aliases remain empty to preserve broad `piments` search. The recipe 066 line remains unlinked because it does not specify fresh, and its source-specific count observation is unchanged.
- Static package, generated-index, ledger, picker projection, and recipe corpus checks passed. No app tests were run because the change only edits database JSON under `AGENTS.md`. See the [R632 proposal](proposals/wp03-section-l-next-fresh-chile-gap-review-r632-20261018.md) and [integration README](batches/wp03-section-l-serrano-fresh-integration-r632-20261018/README.md); Section L remains open.

## 2026-10-18 WP04 Section P R633 — Almaco-jack naming hold

- Kept *Seriola rivoliana* outside active data because available Canadian and Québec-facing wording does not establish a distinct bilingual picker display for this species. CFIA’s `Sériole` label overlaps other taxa and OQLF scopes Québec `sériole` to *S. dumerili*.
- No reference, ledger candidate, alias, form, or recipe data changed. The 114-recipe corpus has no matching demand. This documentation-only hold needed no software tests. See the [R633 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r633-20261018.md) and [hold README](batches/wp04-section-p-seriola-rivoliana-hold-integration-r633-20261018/README.md); Section P remains open.

## 2026-10-18 WP12 R634 — package yield under serving scaling

- Recipe-detail scaling now adjusts the structured package count used for package-yield display while preserving declared size and unit, package type, qualifiers, packing medium, requested basis, and original ingredient text. Reset returns to the stored amount. No inverse mass-to-package-count estimate was added.
- Focused `RecipeDetailScreenTest`: 21 tests passed. Pixel 9a profile / Android 16 `PackageYieldInteractionTest`: 3 tests passed, including 480 g at four servings and 240 g after reset. The deploy script’s unit gate completed 431 tests with 11 catalog/picker search-boundary failures and stopped before install. Manual APK installation, app launch, and loading of all 114 recipes succeeded. The full connected regression remains open. See the [R634 integration README](batches/package-yield-serving-scaling-integration-r634-20261018/README.md).

## 2026-10-18 WP02 Section A7 R635 — durum-semolina portions

- Added five directly published product-label, chart, package-formula, and test-kitchen portions to the existing durum-semolina ledger row. Kept the active reference unchanged, default density null, unit mappings empty, and substitution research open; no recipe link or active conversion was added.
- Ledger validation passed with 2,199 records and zero errors. Source and observation ownership checks passed; the Bob's chart source ID was reused for the same URL. The 114-recipe/1,123-line corpus scan found no semolina demand. No software tests were needed for this database-JSON-only update under `AGENTS.md`. See the [R635 proposal](proposals/wp02-a7-next-grain-meal-gap-review-r635-20261018.md) and [integration README](batches/wp02-a7-durum-semolina-measurement-integration-r635-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP03 Section L R636 — Scotch Bonnet fresh-market form

- Added one fresh-market form to the existing verified Scotch Bonnet pepper identity. No aliases, measurements, density, recipe links, or substitutions were added; the separate sauce identity remains unchanged. CFIA's report lists the whole fresh retail pepper type separately, with OQLF and Jamaica Ministry sources supporting the retained name and fresh state.
- Static package normalization, generated-index freshness, ledger validation, picker projection, recipe-corpus scan, encoding, and local-link checks passed. No software tests were needed because this change only adds database JSON data under `AGENTS.md`. See the [R636 proposal](proposals/wp03-section-l-next-fresh-chile-gap-review-r636-20261018.md) and [integration README](batches/wp03-section-l-scotch-bonnet-fresh-integration-r636-20261018/README.md); Section L remains open.
## 2026-10-18 WP04 Section P R637 — Northern searobin identity

- Added identity-only `Northern searobin / grondin` for *Prionotus carolinus*. OQLF fiche 1199013 ties the Québec fish-product term to this species; DFO species codes support the English name. CFIA genus-level `Searobin` and `Gurnard / Grondin` labels remain search-scope caveats; Houbou `Sea Robin` remains distinct. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added. Ledger measurement and substitution research remain open.
- Static package normalization passed; the generated catalog now contains 1,829 references. Ledger validation, source ownership, picker projection, recipe scan, local-link, encoding, and scoped-whitespace checks passed. No software tests were needed for this database-JSON-only update under `AGENTS.md`. See the [R637 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r637-20261018.md) and [integration README](batches/wp04-section-p-northern-searobin-identity-integration-r637-20261018/README.md); Section P remains open.
## 2026-10-18 WP02 Section A7 R638 — barley-grits label portion

- Added one product-specific `portion_weight` observation, 1/4 cup dry (48 g), to the existing barley-grits ledger row for Shiloh Farms UPC 047593213110. Vitacost and iHerb both transcribe that package label; they are not replicate weighings. Updated the manufacturer source to describe its product and linked label image without treating its conflicting whole-grain-per-serving text as portion evidence. The active reference, density, mappings, and substitution state remain unchanged; no recipe link or conversion was added.
- Static package normalization, generated-index freshness, ledger validation, source/observation ownership, recipe scan, encoding, links, and scoped whitespace checks passed. No software tests were needed for this database-JSON-only evidence update under `AGENTS.md`. See the [R638 proposal](proposals/wp02-a7-next-grain-meal-gap-review-r638-20261018.md) and [integration README](batches/wp02-a7-barley-grits-measurement-integration-r638-20261018/README.md); A7 remains open.
## 2026-10-18 WP03 Section L R639 — ají limo identity and fresh form

- Added source-named `ají limo pepper / piment ají limo` as a Peruvian culinary grouping, with the PROMPERÚ English alias `limo chili` and one fresh-market form. Kept botanical species and cultivar unspecified, excluded ají limón / Lemon Drop and the source common names from aliases, and did not add a frozen form for the ambiguous Montréal listing. No recipe demand, reusable measure, density, conversion, yield, or substitution was established.
- Static package normalization, generated-index freshness, ledger validation, source and ID ownership, picker projection, recipe scan, local links, encoding, and scoped whitespace checks passed. No software tests were needed for this database-JSON-only update under `AGENTS.md`. See the [R639 proposal](proposals/wp03-section-l-next-fresh-chile-gap-review-r639-20261018.md) and [integration README](batches/wp03-section-l-aji-limo-fresh-identity-integration-r639-20261018/README.md); Section L remains open.

## 2026-10-18 WP02 Section A7 R640 — emmer-semolina recipe portion

- Recorded Anson Mills' *Gnocchi alla Romana* formula amount, 1½ cups (8 ounces) of its Ancient Emmer Semolina, as one source-bounded `portion_weight` observation on the existing ledger row. The source gives no cup convention or filling method; the ounce value remains as published. No reusable measure, density, mapping, conversion, form, recipe link, or substitution was added.
- Package and generated-index checks passed; research-ledger schema validation found zero errors across 2,201 records. The full corpus still has no emmer-semolina demand. No software tests were run because this update only adds database JSON data under `AGENTS.md`.
- See the [R640 proposal](proposals/wp02-a7-emmer-semolina-recipe-portion-review-r640-20261018.md) and [integration README](batches/wp02-a7-emmer-semolina-recipe-portion-integration-r640-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP04 Section P R641 — Bowfin identity

- Added identity-only `Bowfin / poisson-castor` for *Amia calva*, with `Bow Fin` as the only English alias. OQLF ties the Québec fish-product name to the species and excludes other French terms from that consumer context; CFIA corroborates the bilingual name and taxon. The BAPE report's 2008 catch table is historical context only.
- No recipe demand, form, measure, density, mapping, conversion, yield, recipe link, or substitution was added. Measurement and substitution research remain open.
- Static package, generated-index, ledger/schema/source ownership, picker projection, and recipe-corpus checks passed. No software tests were needed for this database-JSON-only update under `AGENTS.md`. See the [R641 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r641-20261018.md) and [integration README](batches/wp04-section-p-bowfin-identity-integration-r641-20261018/README.md); Section P remains open.

## 2026-10-18 WP03 Section L R642 — Charapita identity and fresh form

- Added `ají charapita pepper / piment Charapita` with only PROMPERÚ's `charapita chili` alias and one fresh form. Kept species, cultivar, fixed heat, and other forms unresolved because source classifications conflict; the French display is provisional from Québec seed-product wording.
- The 114-recipe corpus has no matching demand. No reusable measure, density, conversion, yield, recipe link, or substitution was added; measurement and substitution research remain open.
- Static package, generated-index, ledger/schema/source ownership, picker projection, recipe-corpus, encoding, local-link, and scoped-whitespace checks passed. No software tests were needed for this database-JSON-only update under `AGENTS.md`. See the [R642 proposal](proposals/wp03-section-l-charapita-identity-review-r642-20261018.md) and [integration README](batches/wp03-section-l-charapita-identity-fresh-form-integration-r642-20261018/README.md); Section L remains open.

## 2026-10-18 WP02 Section A7 R643 — barley-semolina formula portion

- Recorded the Québec *Pouding semoule d'orge* batch amount of 1½ cups (315 g) for medium-size barley semolina on the existing ledger row, reusing R397 source S01. This is one 25-portion formula only; no per-serving amount, reusable measure, density, conversion, form, recipe link, or substitution was added.
- Static package validation passed; the generated index is current at 1,832 references. Research-ledger schema and source/observation ownership checks passed. No software tests were run because this update only adds database JSON data under `AGENTS.md`.
- See the [R643 proposal](proposals/wp02-a7-barley-semolina-recipe-portion-review-r643-20261018.md) and [integration README](batches/wp02-a7-barley-semolina-recipe-portion-integration-r643-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP03 Section L R644 — ají dulce fresh form

- Added one `fresh` form under the existing Puerto Rican ají dulce pepper identity. The University of Puerto Rico journal article documents fresh culinary use; Télé-Québec names the pepper in an uncooked salsa. The recipe quantity and salsa yield remain source-specific, and the seed seller's alternate names were not added as aliases.
- Kept existing reference names and aliases unchanged; no species, cultivar, pungency, additional form, measure, density, conversion, recipe link, or substitution was added. The 114-recipe corpus has no matching demand.
- Static package validation passed; the generated catalog is current at 1,832 references. Research-ledger schema, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, local-link, and scoped-whitespace checks passed. No software tests were run because this update adds database JSON data under `AGENTS.md`.
- See the [R644 proposal](proposals/wp03-section-l-aji-dulce-fresh-form-review-r644-20261018.md) and [integration README](batches/wp03-section-l-aji-dulce-fresh-form-integration-r644-20261018/README.md); Section L remains open.

## 2026-10-18 WP04 Section P R645 — Blue Runner identity

- Added identity-only `blue runner / carangue jaune` for *Caranx crysos*, with no aliases. CFIA pairs the English market name with the taxon; OQLF pairs the same English and Latin terms and selects `carangue jaune` for Québec fish-product terminology, while explicitly noting that `carangue coubali` was not retained.
- Kept the genus-level Jack / Carangue row, secondary names, and binomial out of aliases. Seacore's *Caranx crysops* spelling and conflicting origin statements do not identify that SKU as *C. crysos*. The 2013 Newfoundland catches are historical evidence, not current supply.
- No recipe demand, form, measure, density, mapping, conversion, yield, or substitution was added. Static package validation passed; the generated catalog is current at 1,833 references. Ledger schema, source ownership, picker projection, recipe corpus, encoding, local links, and scoped whitespace checks passed. No software tests were run because this update only adds database JSON data under `AGENTS.md`.
- See the [R645 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r645-20261018.md) and [integration README](batches/wp04-section-p-blue-runner-identity-integration-r645-20261018/README.md); Section P remains open.


## 2026-10-18 WP02 Section A7 R646 — cracked-rye recipe portion

- Recorded Janie's Mill's published ⅓ cup (70 g) of its Organic Cracked Rye in the mill's Pumpkin Rye Scones formula as one source-bounded ledger observation. The amount is pre-cooking; the page gives no independent cup-fill or weighing method, cooked yield, or per-scone amount.
- Reused the existing product identity source and added the current product and recipe pages as sources. Kept active identity, aliases, picker behavior, density, unit mappings, forms, recipe links, and substitutions unchanged.
- Static package validation and ledger schema/source/observation ownership checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R646 proposal](proposals/wp02-a7-cracked-rye-recipe-portion-review-r646-20261018.md) and [integration README](batches/wp02-a7-cracked-rye-recipe-portion-integration-r646-20261018/README.md); Section A7 remains open.


## 2026-10-18 WP02 Section A7 R647 — cornmeal label portion

- Recorded Bob’s Red Mill Canada’s French-page nutrition-label serving of 1/4 cup (41 g) for its named coarse-ground cornmeal product as one source-bounded observation. The page does not specify a cup convention, fill method, or independent weighing procedure.
- Reused the existing OQLF terminology source and left the active cornmeal and corn-grits identities, display names, aliases, picker behavior, null density, empty mappings, forms, recipe links, yields, and substitutions unchanged.
- Static package validation and ledger schema/source/observation ownership checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R647 proposal](proposals/wp02-a7-cornmeal-label-portion-review-r647-20261018.md) and [integration README](batches/wp02-a7-cornmeal-label-portion-integration-r647-20261018/README.md); Section A7 remains open.


## 2026-10-18 WP03 Section L R648 — sun-dried tomato form

- Added one `sun_dried` form under the generic tomato identity with the Québec-facing label `tomates séchées au soleil`. The form models dry state only; the air-packed CFIA survey and oil-containing Metro Québec listings do not establish a universal package, oil, seasoning, or hydration state.
- Added four sources and one accepted decision to a new ledger record for the form. Kept the raw tomato measurement on the generic tomato row and did not transfer it to the dried form. Metro recipe quantities remain source-specific; no recipe link, reusable measure, density, conversion, yield, or substitution was added.
- Static package validation, generated-index freshness, and ledger schema/source ownership checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R648 proposal](proposals/wp03-section-l-sun-dried-tomato-form-review-r648-20261018.md) and [integration README](batches/wp03-section-l-sun-dried-tomato-form-integration-r648-20261018/README.md); Section L remains open.


## 2026-10-18 WP04 Section P R649 — Blue Whiting market-name hold

- Held *Micromesistius poutassou* outside active data. CFIA applies the exact English label `Blue Whiting` to both *M. poutassou* and *M. australis*; the associated French names overlap OQLF's *Merlangius merlangus* `merlan` and Québec product wording for *M. australis* as `merlan bleu austral`.
- A hypothetical single row would over-resolve broad English and French queries to one species. The bundled corpus has no candidate-specific recipe demand. No reference, form, legacy candidate, ledger row, alias, or recipe data changed.
- No software tests, build, emulator, or deployment were needed for this documentation-only hold. See the [R649 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r649-20261018.md) and [hold integration README](batches/wp04-section-p-blue-whiting-market-boundary-hold-integration-r649-20261018/README.md); Section P remains open.


## 2026-10-18 WP02 Section A7 R650 — cracked-wheat recipe portion

- Recorded King Arthur Test Kitchen's published 1/4 cup (39 g) of cracked wheat in its Harvest Wheat Bread for the Bread Machine formula as one source-bounded ledger observation. The amount is listed before soaking; the page gives no brand, particle-size specification, cup-fill method, or independent weighing procedure.
- Reused existing Canadian standard source `WP02-S101` for the identity boundary. Kept the active cracked-wheat/bulgur identities, bilingual names, aliases, density, mappings, forms, recipe links, and substitutions unchanged; the prior Dalia 40 g serving remains excluded.
- Static package validation and ledger schema/source/observation ownership checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R650 proposal](proposals/wp02-a7-cracked-wheat-recipe-portion-review-r650-20261018.md) and [integration README](batches/wp02-a7-cracked-wheat-recipe-portion-integration-r650-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP03 Section L R651 — oil-packed sun-dried tomato form

- Added `sun_dried_packed_in_oil` under generic tomatoes as a separate presentation from the R648 dry form, with the Québec-facing label `tomates séchées au soleil dans l’huile`.
- Added a form-specific ledger record with five new sources, one reused Metro recipe source from R648, and one accepted decision. The 30 g federal labeling amount and the recipe-local quantity were not adopted as measures. No aliases on the generic tomato reference, measurements, density, conversion, recipe links, or substitutions were added.
- The 114-recipe / 1,123-row corpus has no matching demand. Static package validation, generated-index freshness, and ledger schema/source ownership checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R651 proposal](proposals/wp03-section-l-oil-packed-tomato-form-review-r651-20261018.md) and [integration README](batches/wp03-section-l-oil-packed-tomato-form-integration-r651-20261018/README.md); Section L remains open.

## 2026-10-18 WP04 Section P R652 — Tench market-boundary hold

- Held Tench / *Tinca tinca* outside active references and the research ledger. CFIA and the Gouvernement du Québec support `Tench / Tanche`; Québec guidance describes personal-consumption retention of a catch but does not document a retail product. Targeted Canadian/Québec searches found no verifiable listing, and the 114-recipe / 1,123-row corpus has no matching demand.
- Kept OQLF's bare `tanche` non-retention note scoped to Cunner and preserved the visible naming boundary. No reference, legacy candidate, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution was added.
- Reviewed CFIA's Fish List, the Québec species profile, OQLF's GDT entry, and targeted product searches. No app tests, build, emulator, or deployment were needed for this documentation-only hold. See the [R652 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r652-20261018.md) and [hold integration README](batches/wp04-section-p-tench-market-boundary-hold-integration-r652-20261018/README.md); Section P remains open.

## 2026-10-18 WP02 Section A7 R653 — remilled durum-semolina recipe portion

- Recorded one published 300 g amount of Caputo Semolina Flour in the manufacturer's Traditional Semolina Pasta Dough formula on the existing `ingredient-ref-semola-rimacinata` ledger row. The product page describes that named flour as pure durum and double-milled; the amount is source-specific to the formula and product.
- No active measure, density, mapping, conversion, yield, form, recipe link, or substitution was added. Substitution research remains open; the recipe's 460 g prepared-dough yield is not an ingredient yield. The recipe corpus has no matching demand.
- Ledger schema and custom validation passed with zero errors; source and observation ownership checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R653 proposal](proposals/wp02-a7-remilled-durum-semolina-recipe-portion-review-r653-20261018.md) and [integration README](batches/wp02-a7-remilled-durum-semolina-recipe-portion-integration-r653-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP03 Section L R654 — dried ñora pepper identity

- Added identity-only `dried ñora pepper / piment ñora séché` as `ingredient-ref-nora-pepper`, with English aliases `ñora peppers` and `nyora peppers` and French alias `piments ñora`. The Québec French display is provisional local Montréal usage, not an OQLF-approved named term.
- Kept fresh pimiento de bola, ground pimentón/paprika, pimiento choricero, and prepared ñora pulp outside the aliases and identity. No bundled recipe demand, form, measure, density, mapping, conversion, yield, recipe link, or substitution was added. Measurement and substitution research remain `not_yet_researched`.
- Added nine new sources and one accepted identity decision to the research ledger; reused the existing OQLF generic `piment` source entry by ID. Static package validation, generated-index freshness, ledger schema/custom validation, source/ID ownership, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No software tests were needed because this adds database JSON data under `AGENTS.md`. See the [R654 proposal](proposals/wp03-section-l-nora-dried-pepper-identity-review-r654-20261018.md) and [integration README](batches/wp03-section-l-nora-dried-pepper-identity-integration-r654-20261018/README.md); Section L remains open.

## 2026-10-18 WP04 Section P R655 — White Sucker / meunier noir market-boundary hold

- Held *Catostomus commersonii* outside active picker data. CFIA and OQLF pair the English and Québec French names with the species, and current Québec nutrition and fish-consumption sources support human-food use. The hold is due to the current picker's singleton results for broad `sucker` and `meunier` queries, plus no matching bundled recipe demand; it is not a claim that the fish lacks food evidence.
- DFO's 2016 profile says it is not usually fished except as bait. The 2017–18 commercial-plan response lists the species but marks it as observed during characterization, not as a species-specific landing. The 2009 commercialization report records historical wholesale interest and a low-demand niche, not current retail stock. No reference, candidate, ledger row, alias, form, measure, recipe link, or substitution was added.
- Rechecked the CFIA Fish List, OQLF GDT, current Gouvernement du Québec nutrition page and sport-fish guide, DFO profile, 2019 environmental registry response, 2009 UQAC report, and the bundled corpus. This documentation-only hold needed no software tests. See the [R655 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r655-20261018.md) and [hold integration README](batches/wp04-section-p-white-sucker-market-boundary-hold-integration-r655-20261018/README.md); Section P remains open.

## 2026-10-18 WP02 Section A7 R656 — Khorasan semolina recipe portion

- Recorded Kitchen Stories' published 70 g of kamut semolina in its two-serving porridge formula on the existing Khorasan-semolina ledger row. The full recipe amount remains formula-specific; its serving count does not support deriving a per-serving amount.
- Kept the active bilingual identity and picker behavior unchanged. Added no alias, reusable measure, density, mapping, conversion, form, package yield, recipe link, or substitution; substitution research remains open.
- Static package and generated-index validation, ledger schema/custom validation, source and observation ownership, UTF-8/no-BOM, local-link, and scoped-whitespace checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R656 proposal](proposals/wp02-a7-khorasan-semolina-recipe-portion-review-r656-20261018.md) and [integration README](batches/wp02-a7-khorasan-semolina-recipe-portion-integration-r656-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP03 Section L R657 — whole dried Kashmiri red chilli identity

- Added identity-only `whole dried Kashmiri red chilli pepper / piment rouge du Cachemire entier séché`
  as `VEGETABLE_AND_AROMATIC`, with the narrow source-attested English alias and two French variants.
  Treat the Québec French display as descriptive local product language, not an OQLF-approved Kashmiri term.
- Kept whole dried chilli distinct from generic chili powder, red chili flakes, and the separately held
  Kashmiri paste candidate. The sources do not establish a universal species, cultivar, origin, heat, or
  color specification. No recipe demand, form, measure, density, mapping, conversion, yield, recipe link,
  or substitution was added.
- Added seven sources and one accepted identity decision to the ledger. Static package/index, ledger,
  ownership, corpus, encoding, local-link, and whitespace checks passed. No software tests were needed
  for this database-JSON-only addition under `AGENTS.md`. See the [R657 proposal](proposals/wp03-section-l-kashmiri-whole-dried-chilli-identity-review-r657-20261018.md)
  and [integration README](batches/wp03-section-l-kashmiri-whole-dried-chilli-identity-integration-r657-20261018/README.md);
  Section L remains open.

## 2026-10-18 WP04 Section P R658 — Yellowfin Sole identity

- Added identity-only `yellowfin sole / sole à nageoires jaunes` for *Limanda aspera* as a `PROTEIN`
  reference with no aliases. CFIA identifies the English name and taxon; Pearlmark's parallel English
  and French supplier pages pair the names with that binomial and matching product codes.
- Kept OQLF's `limande à queue jaune` / *L. ferruginea* distinct. The broad `sole` search retains both
  the species-neutral market group and the qualified fish. The 114-recipe corpus has no candidate-specific
  match. No form, amount, density, mapping, conversion, yield, recipe link, or substitution was added.
- No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the
  [R658 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r658-20261018.md) and
  [integration README](batches/wp04-section-p-yellowfin-sole-identity-integration-r658-20261018/README.md);
  Section P remains open.

## 2026-10-18 WP02 Section A7 R659 — roasted-wheat-flour measurement evidence

- Set `measurementState` to `researched_no_supported_value` on the existing `ingredient-ref-roasted-wheat-flour` ledger row. The current bilingual Québec-mill pages identify the product and suggest bakery uses but provide no recipe quantity, serving, package amount, mass-volume pair, density, or measurement method.
- Refreshed existing manufacturer source records `WP02-S126` and `WP02-S127` with current locators and limits, and appended one accepted decision. No source ID or URL was added; observations remain empty and substitution research remains `not_yet_researched`.
- The active reference, null density, empty unit mappings, picker results, forms, conversions, yields, recipe links, and substitutions remain unchanged. Ledger schema/custom validation and source ownership checks passed. No software tests were needed because this is a database-JSON-only update under `AGENTS.md`. See the [R659 proposal](proposals/wp02-a7-roasted-wheat-flour-measurement-review-r659-20261018.md) and [integration README](batches/wp02-a7-roasted-wheat-flour-measurement-integration-r659-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP02 Section A7 R660 — malted-wheat-flour recipe portion

- Recorded Hodmedod's directly published 50 g malted-wheat-flour portion in its named *Malted Loaf*
  recipe as one `portion_weight` observation on the existing ledger row. The recipe line offers malted
  naked oat flour as an alternative; no substitution was generalized or added.
- Reused the already owned Hodmedod source ID and metadata. Molino Moras and IRCA manufacturer
  pages provide product-specific dosing guidance and packaging, not a household measure or transferable
  density. Substitution research stays open; active catalog and picker behavior remain unchanged.
- Static ledger/schema/source/observation ownership checks passed. No software tests were needed because
  this only updates database JSON data under `AGENTS.md`. See the [R660 proposal](proposals/wp02-a7-malted-wheat-flour-portion-review-r660-20261018.md)
  and [integration README](batches/wp02-a7-malted-wheat-flour-portion-integration-r660-20261018/README.md);
  Section A7 remains open.

## 2026-10-18 WP04 Section P R661 — Greenland shark market-boundary hold

- Held *Somniosus microcephalus* outside active references, forms, legacy-import identities, and the ledger. The 2025 COSEWIC report supports the Canadian bycatch and non-retention boundary while explicitly recording directed artisanal fisheries in Iceland and Greenland; DFO's older profile supports only the food-safety warning in this review.
- Targeted Québec retailer searches found no current consumer product, and the manifest's 114 recipes / 1,123 ingredient rows contain no matching demand. A hypothetical `Greenland shark / laimargue atlantique` identity would make broad `shark` queries resolve to one species. No active data, ledger source, recipe link, or behavior changed.
- The French wildlife name is not represented as an OQLF-normalized fish-market term, and the hold does not claim the species is never targeted or lacks a legal label. No software tests were needed for this documentation-only hold. See the [R661 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r661-20261018.md) and [hold integration README](batches/wp04-section-p-greenland-shark-boundary-hold-integration-r661-20261018/README.md); Section P remains open.

## 2026-10-18 WP02 Section A7 R662 — malted-rye-flour recipe portion

- Recorded Briess's directly published 3/4 cup (98 g) amount for BriesSpecialty Malted Rye Flour L100 in its *Malted Rye Rolls* formula as one source- and formula-specific `portion_weight` observation on the existing ledger row. Preserved the paired amounts without inferring a cup convention, density, reusable conversion, or general measure.
- Reused existing product identity source S08 without changing its metadata. The new manufacturer recipe PDF is the single owner of the new observation; no active reference field, alias, density, mapping, form, recipe link, conversion, yield, or substitution changed. Substitution research remains open.
- Static ledger schema/custom validation and source/observation ID ownership checks passed. No software tests were needed for this database-JSON-only update under `AGENTS.md`. See the [R662 proposal](proposals/wp02-a7-malted-rye-flour-portion-review-r662-20261018.md) and [integration README](batches/wp02-a7-malted-rye-flour-portion-integration-r662-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP02 Section A7 R663 — roasted wheat malt flour package-scope hold

- Held IREKS AROMA WHEAT MALT K's 25 kg package and 1–5% flour-basis dosage outside the generic `ingredient-ref-roasted-wheat-malt-flour` ledger row. Accepted R58 evidence does not establish that IREKS's named slightly roasted product matches the active unqualified ingredient declaration.
- Kept measurement and substitution states `not_yet_researched`, observations empty, and active catalog values unchanged. Added no source, package observation, package-yield record, alias, form, or recipe data. The bundle has no matching recipe demand.
- This documentation-only hold needed no software tests, build, emulator run, or deployment. See the [R663 proposal](proposals/wp02-a7-roasted-wheat-malt-flour-package-review-r663-20261018.md) and [hold integration README](batches/wp02-a7-roasted-wheat-malt-flour-package-hold-integration-r663-20261018/README.md); Section A7 remains open.

## 2026-10-18 WP04 Section P R664 — blue ling market-name boundary hold

- Held *Molva dypterygia* outside active references and the ledger. OQLF and DFO's Québec Region support `blue ling / lingue bleue`, and a current Canadian supplier lists the fish; TERMIUM documents that the exact pair also names *M. macrophthalma* and that `ling / lingue` span multiple fish taxa.
- The phrase-first picker would make `blue ling`, `lingue bleue`, `ling`, and `lingue` each return only the candidate. The current recipe bundle has no demand; the supplier listing is Alberta-based and does not establish Québec availability. No active data, source record, alias, form, measurement, recipe link, or substitution changed.
- Static ownership, picker, and recipe checks passed. This documentation-only hold needed no software tests, build, emulator run, or deployment. See the [R664 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r664-20261018.md) and [hold integration README](batches/wp04-section-p-blue-ling-market-boundary-hold-integration-r664-20261018/README.md); Section P remains open.

## 2026-10-18 WP03 Section L R665 — Aleppo pepper identity

- Added identity-only `Aleppo pepper / piment d'Alep` as `BAKING_AND_SPICE`, with only `Aleppo pepper flakes` and `Aleppo chili pepper flakes` as English aliases. Québec recipe publishers support `piment d'Alep` as local wording; the reused OQLF source supports only generic `piment` and does not approve an Aleppo-specific term.
- Kept the broad Halaby/Halabi, Pul biber, Maraş/Marash, Armenian/Syrian/Near East, and Aleppo paprika seller synonyms out of aliases. Generic red chili flakes, chili powder, gochugaru, and other named dried chiles remain separate. The recipe bundle has no Aleppo demand. No form, measurement, density, mapping, conversion, yield, recipe link, or substitution was added; measurement and substitution research remain open.
- Added eight new sources and reused the existing generic OQLF `piment` source by ID. Static package/index, ledger schema/custom, source/ID ownership, picker, corpus, encoding, local-link, and whitespace checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R665 proposal](proposals/wp03-section-l-aleppo-pepper-identity-review-r665-20261018.md) and [integration README](batches/wp03-section-l-aleppo-pepper-identity-integration-r665-20261018/README.md); Section L remains open.

## 2026-10-18 WP02 Section A7 R666 — cornmeal portions and dusting alternative

- Added six source-specific `portion_weight` observations to the existing cornmeal ledger row: three CNF 4418 entries, two distinct King Arthur chart rows, and the Spoonbread formula amount. Kept the prior Bob’s Red Mill portion separate; none of these establishes a general cornmeal measure or density.
- Recorded King Arthur durum semolina as an alternative only for dusting a bread sheet. Added no active substitution rule, mapping, form, recipe link, or yield; Section A7 remains open.
- Static bundled-package, ledger schema/custom, source/observation ownership, picker, and encoding checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R666 proposal](proposals/wp02-a7-cornmeal-measure-substitution-review-r666-20261018.md) and [integration README](batches/wp02-wp03-wp04-r666-r669-catalog-coverage-integration-20261018/README.md).

## 2026-10-18 WP03 Section L R667 — fresh tomato form

- Added `ingredient-form-tomatoes-fresh` under the existing generic tomato reference. Linked only recipe 096#1 because its source prefers fresh tomatoes and identifies canned diced tomatoes as a fallback; the recipe’s wording, quantity, unit, and preparation are preserved.
- Kept the existing CNF raw-tomato amount and recipe-local comparison source-specific. Added no general measure, density, mapping, conversion, yield, or substitution. Section L remains open.
- Static package, ledger, form ownership, recipe-link, picker, and encoding checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R667 proposal](proposals/wp03-section-l-tomato-product-form-review-r667-20261018.md) and [integration README](batches/wp02-wp03-wp04-r666-r669-catalog-coverage-integration-20261018/README.md).

## 2026-10-18 WP04 Section P R668 — whole-thawed Atlantic mackerel form hold

- Held the proposed whole-thawed Atlantic mackerel form outside active data. Metro’s paired English/French product routes identify the same *Scomber scombrus* SKU and currently show it out of stock; DFO’s 2026 decision keeps the commercial fishery closed while retaining other fishery provisions. This does not establish that imported products are unavailable.
- The proposed retail phrases would narrow broad `whole mackerel / maquereau entier` picker searches to one Atlantic result, and the recipe bundle has no matching demand. No catalog or ledger data changed; Section P remains open.
- Static source, picker, recipe-corpus, and encoding checks passed. This documentation-only hold needed no software tests. See the [R668 proposal](proposals/wp04-section-p-next-regional-fish-gap-review-r668-20261018.md) and [integration README](batches/wp02-wp03-wp04-r666-r669-catalog-coverage-integration-20261018/README.md).

## 2026-10-18 WP03 Section L R669 — whole smoked-and-dried chipotle form

- Added a whole smoked-and-dried chipotle form under the existing jalapeño reference, following OQLF’s smoked-and-dried product relationship and current whole-product listings. Kept `chipotle in adobo` as a separate condiment; bare `chipotle` returns both choices, while explicit `chipotle chili/chilli` phrases indicate the dried form.
- No reusable amount, density, recipe link, or substitution was added; substitution research remains open. Section L remains open.
- Static package, ledger, form/source ownership, picker projection, recipe-corpus, and encoding checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R669 proposal](proposals/wp03-section-l-jalapeno-chipotle-form-review-r669-20261018.md) and [integration README](batches/wp02-wp03-wp04-r666-r669-catalog-coverage-integration-20261018/README.md).

## 2026-10-18 WP03 Section L R670 — canned young jackfruit in brine form

- Added one source-named `young jackfruit in brine / jeune fruit du jacquier en saumure` form under the existing jackfruit identity, based on the current manufacturer product pages and Québec listings. Generic green/unripe/young maturity terms, ripe jackfruit, seeds, and other processed products remain outside the form.
- Accepted and recorded the known search effect: bare French `jacquier` returns the jackfruit parent without a form hint because the exact product wording contains the term. OQLF's tree-name note is respected; no tree identity or `jacquier` base alias was added.
- Added one form-specific ledger record with the source-backed product scope and no generic measure or substitution evidence. No recipe demand, recipe link, density, mapping, conversion, yield, or runtime substitution was added. Section L remains open.
- Static package, ledger schema/custom, ID/URL ownership, picker projection, recipe corpus, encoding, and documentation checks passed. No software tests were needed because the integration only changed database JSON data under `AGENTS.md`. See the [R670 proposal](proposals/wp03-section-l-jackfruit-maturity-form-review-r670-20261018.md) and [integration README](batches/wp03-section-l-jackfruit-young-in-brine-form-integration-r670-20261018/README.md).

## 2026-10-18 WP02 Section A7 R671 — roasted-corn-flour evidence states

- Updated the existing `ingredient-ref-roasted-corn-flour` ledger record after rechecking the current bilingual Québec-mill product pages. The pages describe the heat-treated functional flour and list bakery uses, but provide no measure, serving, package amount, mass-volume pair, density, or measuring method; they also give no replacement percentage.
- Set measurement and substitution research to `researched_no_supported_value` and `researched_no_supported_substitute`. Refreshed the existing manufacturer source records `WP02-S130` and `WP02-S131` without creating new source IDs. Kept catalog fields, observations, forms, recipe links, conversions, yields, and runtime rules unchanged.
- Static ledger schema/custom and ownership validation passed. No software tests were needed because this only updates database JSON under `AGENTS.md`. See the [R671 proposal](proposals/wp02-a7-next-grain-meal-review-r671-20261018.md) and [integration README](batches/wp02-a7-roasted-corn-flour-measure-substitution-integration-r671-20261018/README.md); A7 remains open.

## 2026-10-18 WP04 Section P R672 — frozen Hoki fillet form hold

- Kept a frozen *Macruronus novaezelandiae* fillet form outside active catalog data. Canadian supplier catalogues support the frozen fillet product, but the reviewed pages do not establish current Québec stock or a stocked Québec SKU.
- Static phrase-first projection: `fillet` returns seven current references but would return Hoki alone if `frozen hoki fillet` were added, because the exact singular token outranks the existing plural `fillets` substring results. French `filet` stays multi-result (two current references, three with the proposed form). The English narrowing supports the hold.
- No active reference, alias, form, ledger source, recipe link, measure, conversion, yield, or substitution changed. The bundle has no Hoki demand. Section P remains open.
- Static source, picker, corpus, encoding, and documentation checks passed. No software tests were run for this documentation-only hold. See the [R672 proposal](proposals/wp04-section-p-next-regional-fish-review-r672-20261018.md) and [hold README](batches/wp04-section-p-frozen-hoki-fillet-hold-integration-r672-20261018/README.md).

## 2026-10-18 WP02 Section A7 R673 — roasted-red-rice-flour formula evidence

- Recorded Baku Kitchen's published 400 g roasted red rice flour quantity only for its approximately 20-nest String Hoppers formula. Set measurement research to `researched_supported`; no cup weight, per-nest amount, density, conversion, unit mapping, or package yield was inferred.
- Set substitution research to `blocked_pending_evidence` and recorded the white-rice-flour alternative only as scoped evidence. The page does not clarify whether that flour is roasted, despite saying roasting affects the dough. No active global or contextual substitution rule was added.
- Refreshed and reused Niru source IDs S05/S07 and added the Baku recipe page once under R673 source ID S01. Active names, aliases, forms, recipe links, package yields, and picker projections remain unchanged. A7 remains open.
- Static package, ledger schema/custom, ownership, picker, corpus, encoding, and documentation checks passed. No software tests were needed because the update only adds database JSON data under `AGENTS.md`. See the [R673 proposal](proposals/wp02-a7-next-grain-meal-review-r673-20261018.md) and [integration README](batches/wp02-a7-roasted-red-rice-flour-ledger-integration-r673-20261018/README.md).

## 2026-10-18 WP02 Section A7 R674 — whole-wheat-meal evidence hold

- Added Delishar's 18-muffin recipe as a source-scoped research lead on `ingredient-ref-wheat-meal`. It lists 1 cup (128 g) whole wheat/meal flour and permits an all-purpose-flour option in the formula, but does not specify the coarse meal grade named by the active identity.
- Set measurement and substitution research to `blocked_pending_evidence`; recorded no measurement observation and one blocked, formula-scoped substitution finding. No active rule, measure, alias, form, density, mapping, conversion, yield, or recipe link was added. A7 remains open.
- Static package/ledger schema, source ownership, decision-source resolution, recipe-corpus, encoding, link, and whitespace checks passed. No software tests were needed because this update only adds database JSON data under `AGENTS.md`. See the [R674 proposal](proposals/wp02-a7-next-grain-meal-review-r674-20261018.md) and [integration README](batches/wp02-a7-whole-wheat-meal-evidence-integration-r674-20261018/README.md).

## 2026-10-18 WP03 Section L R675 — whole dried Ancho form

- Added whole dried Ancho as a form under `ingredient-ref-poblano-pepper`. OQLF calls dried Poblano `piment ancho / ancho pepper`; Canadian whole-product listings support the whole presentation. Added `ancho` as an English form match, not a parent alias, so an exact `ancho` query resolves to Poblano with the dried-form hint. French match terms remain phrase-qualified.
- Added a form-level ledger record with no supported measurement or substitution. Kept ground Ancho separate; added no recipe link, measure, density, conversion, yield, or rule. The 114-recipe bundle has no Ancho/Poblano demand. Section L remains open.
- Static package, ledger schema/custom, source-ID/URL ownership, picker, recipe-corpus, encoding, links, and whitespace checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R675 proposal](proposals/wp03-section-l-next-produce-pepper-review-r675-20261018.md) and [integration README](batches/wp03-section-l-poblano-whole-dried-ancho-integration-r675-20261018/README.md).

## 2026-10-18 WP04 Section P R676 — fresh whole Barramundi form

- Added a fresh-whole form under the existing `ingredient-ref-barramundi`, using Metro's Québec-facing bilingual product wording and CFIA/OQLF identity sources. Exact bilingual product phrases and qualified whole-fish terms point to the form; generic `whole fish / poisson entier`, `fillet`, and `filet` searches stay unchanged.
- Added a form-level ledger record with verified identity and researched no-supported-value/no-supported-substitute states. No recipe demand, form-linked measurement, density, unit mapping, conversion, yield, recipe link, or substitution was added. Section P remains open.
- Static package, ledger schema/custom, source-ID/URL ownership, picker, corpus, encoding, links, and whitespace checks passed. No software tests were needed because this only adds database JSON data under `AGENTS.md`. See the [R676 proposal](proposals/wp04-section-p-next-regional-fish-review-r676-20261018.md) and [integration README](batches/wp04-section-p-barramundi-fresh-whole-form-integration-r676-20261018/README.md).

## 2026-10-18 WP02 Section B3 R677 — arrowroot Cherry Cake Filling evidence hold

- Reused the Baking With Butter Cherry Cake Filling source ID on the arrowroot ledger record and refined the existing Bob's Red Mill source summary. The recipe lists arrowroot as an option but its method uses a cornstarch slurry and boils for around five minutes; manufacturer guidance does not settle that method, and one reader report remains anecdotal.
- Set substitution research to `blocked_pending_evidence`, added one unresolved decision and one recipe-scoped blocked finding, and preserved recipe 029's cornstarch link and all active catalog behavior.
- Research-ledger schema/custom validation, source-ID/URL ownership, corpus, encoding, local-link, and whitespace checks passed. No software tests were run because this only adds database JSON research data under `AGENTS.md`. See the [R677 proposal](proposals/wp02-b3-arrowroot-cherry-filling-substitution-review-r677-20261018.md) and [integration README](batches/wp02-b3-arrowroot-cherry-filling-substitution-integration-r677-20261018/README.md); B2/B3 remains open.

## 2026-10-18 WP03 Section F R678 — rolled-oats dry/cooked-form hold

- Kept the existing rolled-oats identity without dry or cooked forms. Two linked recipes use the flakes as an ingredient input before batter preparation or overnight hydration; neither calls for cooked oats as an input. OQLF's definition of steamed-and-flattened flakes is product processing, not a cooked recipe form.
- No catalog, research-ledger, recipe, or picker data changed. The broader dry/cooked-grain question remains open.
- Static active-owner/form, picker projection, recipe-demand, source ownership, encoding, local-link, and whitespace checks passed. No software tests were run for this documentation-only hold. See the [R678 proposal](proposals/wp03-section-f-rolled-oats-dry-cooked-form-boundary-review-r678-20261018.md) and [hold README](batches/wp03-section-f-rolled-oats-dry-cooked-form-hold-integration-r678-20261018/README.md); Section F remains open.

## 2026-10-18 WP03 Section I R679 — Makhana French match term

- Added `noix de renard` only as a French match term on the existing roasted-popped *Euryale ferox* form. The Canadian French WK Kellogg recipe pairs the phrase with Makhana; it supports observed usage, not an OQLF-preferred display. The existing species-qualified display stays unchanged, and lotus wording remains excluded.
- Added two new ledger sources for the WK Kellogg recipe and Metro product title; reused the existing OQLF FAQ source ID. No measurements, recipe links, recipe changes, or substitutions were added.
- Static seed-package normalization/validation, generated index, ledger schema/custom and ownership, picker, corpus, encoding, local links, and whitespace checks passed. No software tests were run because this only adds database JSON data under `AGENTS.md`. See the [R679 proposal](proposals/wp03-section-i-makhana-quebec-naming-review-r679-20261018.md) and [integration README](batches/wp03-section-i-makhana-noix-de-renard-match-term-integration-r679-20261018/README.md); Section I remains open.

## 2026-10-18 WP04–WP06 R680–R682 — grouper addition and naming holds

- Added identity-only `grouper (name used for multiple fish species) / mérou (nom utilisé pour plusieurs espèces de poissons)` as `ingredient-ref-grouper-market-group`. Health Canada's report summarizes the CFIA Fish List as applying grouper wording across multiple Serranidae taxa; OQLF supports the Québec term `mérou`. Kept Red Grouper, Black Grouper, and supplier-specific wording outside the group. Added five new source IDs and six record-level source entries, reusing the CFIA Fish List overview source ID. The bundle has no matching recipe demand; no aliases, forms, numeric behavior, recipe links, or substitutions were added.
- Reviewed the dry Nigerian pepper-soup spice blend. English naming and product identity are supported, but the proposal's French display is not directly attested as a Québec product name. French sources use `soupe au poivre` for the dish, and one recipe says `mélange d'épices soupe au poivre`; those sources do not establish the proposed localized display. Kept the candidate outside active catalog and ledger data pending a supported Québec French term.
- Kept generic brown sauce outside active data. OQLF's `sauce brune` entry defines a stock-based foundation sauce, its 2025 `sauce` entry notes *gravy* is more specific to a brown sauce, and current Québec products use `sauce brune` for local sauce products and mixes. HP's `sauce brune anglaise` wording is specific to its British condiment. No recipe demand or active catalog/ledger change.
- Static bundled-package, generated-index, ledger schema/custom, source-ID/URL ownership, picker, recipe-corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests were run because the only application-data change adds database JSON, as directed by `AGENTS.md`; R681 and R682 are documentation-only holds.
- See the [R680 grouper proposal](proposals/wp04-section-p-grouper-market-group-review-r680-20261018.md), [R681 pepper-soup proposal](proposals/wp06-nigerian-pepper-soup-spice-blend-review-r681-20261018.md), [R682 brown-sauce proposal](proposals/wp05-section-z-brown-sauce-identity-boundary-review-r682-20261018.md), and [integration README](batches/wp04-wp05-wp06-r680-r682-gap-review-integration-20261018/README.md). Section P, WP06, and Section Z remain open.

## 2026-10-18 WP02/WP04/WP06 R683–R685 — naming and form holds

- Held an Atlantic-cod fillet form outside active data. High Liner and Pearlmark listings support the cut, and OQLF supports the parent Québec species name; the singular `fillet` form label would suppress seven existing generic fish-fillet results. `cod fillet` and `filet de morue` would also appear species-resolved without paired Pacific-cod evidence. The recipe corpus has no candidate demand.
- Rechecked the Nigerian pepper-soup blend French display gate. Savanna Select uses `mélange d'épices Pepper Soup` as Canadian French recipe wording, not a product title; a Canadian product page has an English title, and the reviewed Québec grocer does not name the blend. Kept the candidate and phrase out of active data pending product-matched Québec French evidence.
- Held a precooked yellow-pea-flour form outside active data. Armada and Ebro establish a commercial precooked-flour class, but the reviewed Canadian source names split-pea powder and Québec retail evidence covers ordinary yellow-pea flour only. Kept the active parent unchanged.
- No catalog, forms, ledger, recipes, or generated files changed. No software tests were run for this documentation-only integration. The proposals record ownership, picker projection, source limits, and full-corpus demand checks; broader Section P, WP06, and B2 work remains open.
- See the [R683 Atlantic-cod fillet proposal](proposals/wp04-section-p-atlantic-cod-fillet-form-boundary-review-r683-20261018.md), [R684 French display review](proposals/wp06-nigerian-pepper-soup-french-display-gate-r684-20261018.md), [R685 yellow-pea-flour proposal](proposals/wp02-b2-precooked-yellow-pea-flour-form-boundary-review-r685-20261018.md), and [integration README](batches/wp02-wp04-wp06-r683-r685-gap-review-integration-20261018/README.md).

## 2026-10-18 WP04/WP06 R686–R687 — octopus form and wattleseed hold

- Added `frozen whole octopus / pieuvre entière surgelée` under the existing species-neutral octopus identity. The paired Québec supplier pages support the product wording and frozen state; a Montréal listing corroborates local whole-product language without transferring its cleaning claim. SKU-specific species, ingredients, grades, and package details remain bounded to their sources. Added one form-level ledger record with no supported measure or substitution; the bundle has no octopus demand.
- Kept `candidate-wattleseed` unresolved because current supplier products name *Acacia victoriae* but authoritative Australian sources show a broader multi-species scope. The bare picker term would become misleading if assigned to one species. Added no active catalog or ledger data for R687.
- Static seed-package, ledger schema/custom, source ownership, picker, recipe-corpus, UTF-8/no-BOM, link, and whitespace checks passed. No software tests/build/emulator were run because R686 adds database JSON data only; R687 is documentation-only. Section P and WP06 remain open.
- See the [R686 proposal](proposals/wp04-section-p-frozen-whole-octopus-form-review-r686-20261018.md), [R687 proposal](proposals/wp06-wattleseed-species-picker-boundary-review-r687-20261018.md), and [integration README](batches/wp04-wp06-r686-r687-review-integration-20261018/README.md).

## 2026-10-18 WP02 B3 R688 — Yoki polvilho doce portion

- Added the Yoki label's **20 g per 1 `colher de sopa`** as a manufacturer-specific `portion_weight` observation on the existing `ingredient-ref-brazil-polvilho-doce` research-ledger record. Preserved the Portuguese source quantity without converting it to a Canadian tablespoon or inferring a fill method.
- Added the manufacturer source and a Québec-facing Marché Brésil product-listing source. The retailer's 1 kg Yoki listing is out of stock and does not state a serving measure or French translation. Kept the separate polvilho azedo identity and generic starch rows unchanged.
- Set measurement research to `researched_supported` for the product-specific observation; left default density null, unit mappings empty, and substitution research `not_yet_researched`. The full recipe corpus has no matching demand. No active conversion, form, package yield, recipe link, or substitution was added.
- Static ledger validation, JSON/encoding, source ownership, and scoped documentation checks passed. No software tests were run for this database-JSON-only evidence addition under `AGENTS.md`; no app code or generated index changed. See the [R688 proposal](proposals/wp02-b3-polvilho-doce-yoki-portion-measure-review-r688-20261018.md) and [integration README](batches/wp02-b3-polvilho-doce-yoki-portion-integration-r688-20261018/README.md); B3 remains open.
- 2026-10-18 WP02 Section A R689: added Bob's Red Mill's whole-grain oat-flour cookie recommendation as an evidence-only substitution finding on the existing row. The 20% / 1/4-cup-per-1-1/4-cups guidance remains product- and cookie-specific; no runtime rule or generic/sprouted transfer was added, and the CNF 6275 observation is unchanged. No recipe demand. Static JSON and ledger validation only; no software tests were run for the database-JSON-only update under `AGENTS.md`. See the [R689 proposal](proposals/wp02-a4-whole-grain-oat-flour-substitution-review-r689-20261018.md) and [R689–R691 integration README](batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md); Section A remains open.
- 2026-10-18 WP03 Section F R690: added the bounded dry No. 5 half-cuts bulgur form under the existing bulgur identity. Match exact No. 5 wording only; the federal four-sizes/No. 5 inconsistency remains, and generic very-coarse or manufacturer “extra-large grind” wording is not mapped. No recipe demand, measurement, density, conversion, yield, or substitution was added. Static JSON/package and ledger checks only; no software tests were run for this database-JSON-only update under `AGENTS.md`. See the [R690 proposal](proposals/wp03-section-f-bulgur-no5-half-cuts-form-review-r690-20261018.md) and [R689–R691 integration README](batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md); Section F remains open.
- 2026-10-18 WP04 Section P R691: held Metro's fresh Ontario Yellow perch fillet form outside active data because its wording would make generic `perch fillets` appear species-resolved while the catalog has five perch-family results. No matching recipe demand or ledger allocation. This documentation-only hold needed no software tests. See the [R691 proposal](proposals/wp04-section-p-yellow-perch-ontario-fillet-boundary-review-r691-20261018.md) and [R689–R691 integration README](batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md); Section P remains open.

## 2026-10-18 WP02/WP03/WP04 R692–R694 — flour evidence, bulgur form, sardine hold

- Recorded the Québec mill’s roasted-wheat-flour co-use statement as a blocked, source-scoped blending lead. It names no partner flour, recipe formula, or proportion, so no replacement or active rule was added.
- Added the dry `extra fine bulgur / boulgour extra fin` form under the existing bulgur identity. Duru’s extra-fine and fine size ranges overlap; they remain brand-specific evidence, with no universal threshold or cross-brand number mapping. Added no measure, density, unit mapping, conversion, yield, recipe link, or substitution.
- Held canned sardines in olive oil outside active data because there is no bundled recipe demand and an oil-only identity would conceal a smoked-sardine product boundary. No ledger allocation was made.
- Static package/ledger, source ownership, picker projection, encoding, and documentation checks passed. No software tests were run for the database-JSON changes; the sardine hold was documentation-only. See the [R692](proposals/wp02-a7-roasted-wheat-flour-substitution-review-r692-20261018.md), [R693](proposals/wp03-section-f-bulgur-extra-fine-form-review-r693-20261018.md), and [R694](proposals/wp04-section-p-canned-sardines-olive-oil-boundary-review-r694-20261018.md) proposals and [integration README](batches/wp02-wp03-wp04-r692-r694-gap-review-integration-20261018/README.md). Sections A7, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R695–R697 — oatcake finding, Little Millet hold, dried capelin form

- Recorded Bob’s Red Mill’s briefly pulsed Old Fashioned Rolled Oats and Quick Cooking Rolled Oats as alternatives only for its named Scottish oatcake formula. No replacement amount, ratio, recipe link, or active substitution rule was added.
- Held Little Millet outside active data. AAFC directly names `petit millet` for *Panicum sumatrense*, and Ceylon Groceries lists `samai`; however, the proposed `petit mil` alias on the generic, foxtail, and pearl millet rows violates the seed package’s unique normalized-name invariant. The Little Millet reference and proposed aliases remain unallocated.
- Added one dry form, `dried Atlantic capelin / capelan de l’Atlantique séché`, under the existing Atlantic-capelin identity using Raymer’s Québec listing. The source leaves whole-fish state, salting, trimming, rehydration, measures, and substitutions unspecified.
- The package now has 1,838 references / 173 forms / 114 recipes / 1,123 ingredient rows; the ledger has 2,220 records / 10,406 source entries / 8,782 distinct source IDs / 7,431 distinct URLs. Static package/ledger, source-ownership, picker-projection, UTF-8/no-BOM, link, and whitespace checks passed. No software tests, build, emulator, or deployment were run for the database JSON additions under `AGENTS.md`. See the [R695 proposal](proposals/wp02-a7-scottish-oatmeal-oatcake-substitution-review-r695-20261018.md), [R696 review](proposals/wp03-section-f-little-millet-picker-boundary-review-r696-20261018.md), [R697 proposal](proposals/wp04-section-p-dried-atlantic-capelin-form-review-r697-20261018.md), and [integration README](batches/wp02-wp03-wp04-r695-r697-gap-review-integration-20261018/README.md). A7, Section F, and Section P remain open.

## 2026-10-18 WP02/WP03/WP04 R698–R700 — Wheatlets identity, Lucky Charms and snapper holds

- Added identity-only `Wheatlets / Wheatlets` as `ingredient-ref-wheatlets` in `FLOUR_AND_STARCH`. Reused the Ardent Mills English and French portfolio source IDs already recorded for granular flour. Kept the product distinct from Talisman granular flour, Farina, semolinas, whole-wheat meal, and cracked wheat. No aliases, forms, density, unit mappings, conversions, package yields, recipe links, or substitution rules were added. The 114-recipe / 1,123-row bundle has no Wheatlets demand.
- Held the standard Canadian Lucky Charms cereal candidate pending a family-level picker review. Metro lists a separate Fruit Lucky Charms SKU, and General Mills Canada's brand page does not provide a complete current Canadian roster. No active reference or ledger identity was allocated; the bundle has no matching demand.
- Held Yellowtail snapper / `vivaneau à queue jaune` outside active data because its supported bilingual display would make broad `snapper` and `vivaneau` queries appear species-specific, while CFIA lists those names across multiple taxa. OQLF and CFIA support the species/name pair, but the bundle has no matching demand. No active reference or ledger identity was allocated.
- The package now has 1,839 references / 173 forms / 114 recipes / 1,123 ingredient rows; the ledger has 2,221 records / 10,408 source entries / 8,782 distinct source IDs / 7,431 distinct URLs. The generated import-audit index was regenerated at 1,839 references. Static package/ledger, source-ownership, picker, recipe-corpus, and encoding checks passed. No software tests, build, emulator, or deployment were run under the updated `AGENTS.md` JSON-data rule. See the [R698 proposal](proposals/wp02-a7-next-open-gap-review-r698-20261018.md), [R699 proposal](proposals/wp03-section-f-next-open-grain-gap-review-r699-20261018.md), [R700 proposal](proposals/wp04-section-p-next-open-seafood-gap-review-r700-20261018.md), and [integration README](batches/wp02-wp03-wp04-r698-r700-gap-review-integration-20261018/README.md). Sections A7, F, and P remain open.


## 2026-10-18 WP02/WP03/WP04 R701–R703 — Wheatlets measure, pot barley wording, imitation crab

- R701 kept Wheatlets measurement research at `researched_no_supported_value`: Ardent Mills code 10287's industrial pack and wheat-middlings application do not support a household measure or a named substitution. No new source or observation IDs were needed.
- R702 approved the existing `pot barley / orge en pot` picker display as market-attested Québec wording, not OQLF-preferred; the French alias list stays empty and hulled/pearl barley remain separate.
- R703 added identity-only `imitation crab / similicrabe` with the source-backed full-phrase aliases. Exact `crab meat` and `chair de crabe` searches intentionally return both clearly labelled identities; raw surimi, crab-flavoured pollock flakes, and other formed fish products remain distinct. No recipe demand, form, numeric data, conversion, yield, or substitution was added.
- The bundled package now has 1840 ingredient references, 173 forms, 114 recipes, and 1,123 ingredient rows; the research ledger has 2222 records. No software tests, build, emulator run, or deployment were performed for the database JSON addition under `AGENTS.md`.
- See the [R701](proposals/wp02-a7-wheatlets-measurement-review-r701-20261018.md), [R702](proposals/wp03-section-f-pot-barley-quebec-display-review-r702-20261018.md), and [R703](proposals/wp04-section-p-imitation-crab-product-class-boundary-review-r703-20261018.md) reviews, plus the [integration README](batches/wp02-wp03-wp04-r701-r703-gap-review-integration-20261018/README.md). A7, Section F, and Section P remain open.


## 2026-10-18 WP02/WP03/WP04 R704–R706 — barley-flour hold, Riceberry identity, sablefish hold

- Held the proposed sprouted whole-barley-flour form under `ingredient-ref-whole-barley-flour` pending manufacturer confirmation. Québec retailers list the ingredient on Little Big Bread, while Silver Hills’ current English and French pages omit barley. No active form, identity, alias, or ledger record was added.
- Added identity-only `Riceberry rice / riz violet Riceberry` as `ingredient-ref-riceberry-rice`. The source-named variety remains separate from generic purple rice, black rice, black glutinous rice, jasmine rice, and Riceberry-containing blends. Added four sources; kept aliases, forms, observations, density, mappings, recipe links, conversions, yields, and substitutions empty. The recipe corpus has no Riceberry demand.
- Held the frozen sablefish fillet form because the paired Montréal product pages’ natural labels would make broad `cod fillet` and `filet de morue` searches return sablefish alone. No form or ledger record was added.
- The package now has 1,841 references / 173 forms / 114 recipes / 1,123 ingredient rows; the ledger has 2,223 records / 10,417 source entries / 8,789 distinct source IDs / 7,438 distinct URLs. Static package and ledger checks, generated-index freshness, source ownership, picker projection, recipe corpus, encoding, and documentation checks passed. No software tests, build, emulator, or deployment were run: the active data change only adds database JSON data, and the other reviews are documentation-only. See the [R704](proposals/wp02-a7-sprouted-whole-barley-flour-form-review-r704-20261018.md), [R705](proposals/wp03-section-f-next-grain-gap-review-r705-20261018.md), and [R706](proposals/wp04-section-p-next-seafood-gap-review-r706-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r704-r706-gap-review-integration-20261018/README.md). Sections A7, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R707–R709 — Wheatlets evidence, pori hold, Atlantic salmon form

- Recorded Ardent Mills’ Wheatlets/wheat-middlings application statement only as a blocked lead on the existing Wheatlets ledger row. USDA AMS defines middlings in a feedstuffs glossary, but no human-food recipe, replacement direction, product grade, method, or proportion is supported; no active rule or alias was added.
- Held `pori` outside puffed-rice aliases because Tamil Nadu’s crop guide describes expanded rice from parboiled paddy while TNAU labels its use `Pori (Popped rice)` without a process description. The existing puffed-rice identity and aliases remain unchanged.
- Added `fresh whole Atlantic salmon / saumon de l’Atlantique frais entier` under the existing Atlantic-salmon identity, with qualified match terms and no cleaning-state/origin inference, numeric data, recipe link, or substitution.
- The package now has 1,841 references / 174 forms / 114 recipes / 1,123 ingredient rows; the ledger has 2,224 records / 10,420 source entries / 8,792 distinct source IDs / 7,441 distinct URLs. Static package and ledger checks, source ownership, picker projection, recipe corpus, encoding, and documentation checks passed. No software tests, build, emulator, or deployment were run because the active changes only add database JSON data. See the [R707](proposals/wp02-a7-wheatlets-substitution-review-r707-20261018.md), [R708](proposals/wp03-section-f-puffed-rice-pori-alias-boundary-review-r708-20261018.md), and [R709](proposals/wp04-section-p-atlantic-salmon-fresh-whole-form-review-r709-20261018.md) reviews and the [integration README](batches/wp02-wp03-wp04-r707-r709-gap-review-integration-20261018/README.md). Sections A7, F, and P remain open.


## 2026-10-18 WP02/WP03/WP04 R710–R712 — durum portions, broken-rice alias, scrod boundary

- R710 recorded King Arthur's one-cup, 124 g observation for Durum Flour SKU 100243 and Janie's Mill's one-cup, 129.5 g observation for its named Organic Durum Flour. The values remain product-specific; only Janie's Mill gives a light-fill instruction, neither chart states cup capacity, and no generic density or conversion was derived.
- R711 added only romanized Hindi `tukda chawal` to the existing broken-rice search aliases. Organic Mandya directly identifies the phrase; the indexed Sports Authority procurement listing is corroborating wording only. Brewing-scoped French wording, rice-grits boundaries, and all other aliases remain unchanged.
- R712 added qualified English aliases `scrod cod` and `scrod haddock` to the existing species references. Bare `scrod` remains unassigned and `schrod` remains excluded; the aliases do not change canonical names or assert labeling status.
- Snapshot: 1,841 ingredient references / 174 forms / 114 recipes / 1,123 ingredient rows; 2,224 ledger records / 10,433 source entries / 8,802 distinct source IDs / 7,451 distinct URLs. Static package and ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, and local documentation checks passed. No software tests, build, emulator run, or deployment were performed because the active changes only add database JSON data under `AGENTS.md`.
- See the [R710](proposals/wp02-a7-next-open-gap-review-r710-20261018.md), [R711](proposals/wp03-section-f-next-open-gap-review-r711-20261018.md), and [R712](proposals/wp04-section-p-next-open-gap-review-r712-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r710-r712-gap-review-integration-20261018/README.md). Sections A7, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R713–R715 — cracked-wheat finding, puffed-rice alias hold, coho alias

- Recorded Fleischmann's explicit wheat-germ alternative only for its Cracked Wheat Loaf formula. The recipe gives no wheat-germ amount or process adjustment, so the finding remains ledger-only and no runtime rule or recipe link was added.
- Held `brown rice puffs` out of active aliases because the phrase would make `rice puffs` resolve to the brown-specific row alone; no source or ledger ownership was allocated for R714.
- Added `silver salmon` to the English aliases for coho salmon, supported by NOAA, FDA, and the existing OQLF source record. Kept `coho salmon / saumon coho` as the canonical display and left `saumon argenté` unassigned.
- Snapshot: 1,841 references / 174 forms / 114 recipes / 1,123 ingredient rows; 2,224 ledger records / 10,436 source entries / 8,805 source IDs / 7,454 URLs. Static package/schema, generated-index, source-ownership, picker, corpus, UTF-8/no-BOM, and documentation checks passed. No software tests, build, emulator run, or deployment were performed under `AGENTS.md` because active changes only add database JSON data; R714 was documentation-only.
- See the [R713](proposals/wp02-a7-cracked-wheat-substitution-review-r713-20261018.md), [R714](proposals/wp03-section-f-puffed-brown-rice-puffs-alias-review-r714-20261018.md), and [R715](proposals/wp04-section-p-coho-silver-salmon-alias-review-r715-20261018.md) reviews and the [integration README](batches/wp02-wp03-wp04-r713-r715-gap-review-integration-20261018/README.md). A7, Section F, and Section P remain open.


## 2026-10-18 WP02/WP03/WP04 R716–R718 — polvilho finding, cereal portion, fish picker hold

- R716 added a directed, evidence-only polvilho azedo-to-polvilho doce finding for partial replacement in the 2016 UFC biscuit formula. The 30–50% denominator is inferred from its 100-part azedo line and the source gives no mass/volume basis; no active rule or recipe link was added.
- R717 recorded Healthy Planet's 1/4 cup (45 g) value for Bob's Red Mill 8 Grain SKU A0063910. The P101125 match is based on the Canadian product title, package size, and soy-containing formula and remains unverified by UPC; no density or reusable cup mapping was added.
- R718 held Northern and Southern Rock Sole and Common Dab outside active data. Those companion identities would make `rock sole` and `limande` visibly multi-result, but Common Dab makes broad `dab` return alone, conflicting with CFIA's broader fish names and the prior R126 hold.
- Snapshot: 1,841 ingredient references / 174 forms / 114 recipes / 1,123 ingredient rows; 2,224 ledger records / 10,439 source entries / 8,808 distinct source IDs / 7,457 distinct URLs. Static package/ledger validation, generated-index freshness, schema examples, source ownership, corpus, encoding, and documentation checks passed. No software tests were run under `AGENTS.md` because active changes only add database JSON data; R718 was documentation-only.
- See the [R716](proposals/wp02-b2-b3-next-flour-starch-gap-review-r716-20261018.md), [R717](proposals/wp03-section-f-next-cereal-grain-gap-review-r717-20261018.md), and [R718](proposals/wp04-section-p-next-fish-gap-review-r718-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r716-r718-gap-review-integration-20261018/README.md). Sections A7, F, and P remain open.


## 2026-10-18 WP02/WP05/WP07 R719–R721 — quinoa-flour portion, fruit mostarda, olive-oil evidence

- R719 recorded Cuisine Soleil's 1/4 cup (30 g) quinoa-flour label serving as a product-specific observation on the generic row. It does not support a transferable measure, density, or mapping; substitution research remains unreviewed.
- R720 added identity-only `fruit mostarda / mostarda` with `mostarda di frutta` as its narrow English search alias. Québec French menu usage is recorded as provisional borrowed-name evidence; the wider Section Z review remains open.
- R721 recorded 5 mL = 4.6 g, 15 mL = 13.7 g, and 100 mL = 91.3 g from historical CNF 2015 Food Code 422 as source-specific observations only. Measurement remains blocked pending current CNF 2026 row and app-unit convention review. Removed only the unrelated evaporated-milk decision copied onto olive oil; its original evaporated-milk decision and sources remain intact.
- Snapshot: 1,842 ingredient references / 174 forms / 114 recipes / 1,123 ingredient rows; 2,225 ledger records / 10,450 source entries / 8,819 distinct source IDs / 7,468 distinct source URLs. Static package and ledger validation, generated-index freshness, schema examples, source ownership, picker projection, recipe corpus, encoding, and documentation checks passed. No software tests were run for this database-JSON update under the current `AGENTS.md` rule.
- See the [R719](proposals/wp02-a6-next-gap-review-r719-20261018.md), [R720](proposals/wp05-section-z-next-condiment-gap-review-r720-20261018.md), and [R721](proposals/wp07-next-portion-gap-review-r721-20261018.md) proposals and the [integration README](batches/wp02-wp05-wp07-r719-r721-gap-review-integration-20261018/README.md). A6, Section Z, and WP07 remain open.

## 2026-10-18 WP02/WP03/WP04 R722–R724 integration checkpoint

- R722 added one experimental 50% white-fonio share from a sugar-cookie flour blend to the existing fonio-flour ledger row. The source reports a 75.5 g base flour amount but does not identify a mass/volume basis for the component percentages, so no component mass or reusable replacement was inferred; measurement remains not yet researched.
- R723 added identity-only Canadian references for Froot Loops cereal, Froot Loops Less Sugar cereal, and Froot Loops with Marshmallow cereal, using paired manufacturer English/French names. Cocoa Loops remains distinct. No aliases, forms, measures, recipe links, or substitutions were added.
- R724 held the Red Mullet group outside active data because a Québec French name coextensive with its *Mullus* + *Upeneichthys* market scope was not established. No catalog or ledger data was allocated.
- Validation results and the package snapshot are recorded in `batches/wp02-wp03-wp04-r722-r724-gap-review-integration-20261018/README.md`. No software tests, build, emulator, or deployment were run under the JSON-only testing rule in `AGENTS.md`.


## 2026-10-18 WP02/WP03/WP04 R725–R727 — teff evidence, cereal-family hold, sailfish identity

- R725 recorded Westpoint Naturals' recommendation for its unqualified Teff Flour in chocolate cookies, cakes, and brownies as a bounded ledger finding. The source says to reduce recipe flour by 10–20% and replace the removed amount with equal weight of teff, but does not identify the percentage basis. Refreshed existing Bob's Red Mill source `WP02-S91` in place to retain its separate approximately 25% product guidance. Measurement remains `not_yet_researched`; no active substitution rule or recipe link was added.
- R726 held Holy Crap Apple Cinnamon Superseed cereal and the Well.ca indexed 2 tbsp / 30 g listing pending a bilingual review of the maker's four-product cereal family. A one-row addition would make shared family queries return one variant and replace Nature's Path as the phrase-first `superseed` result. No catalog or ledger data was allocated.
- R727 added identity-only `sailfish / voilier` for the CFIA genus-level `Istiophorus spp.` label scope, corroborated by OQLF's genus-level French term. The separate Indo-Pacific species label remains unassigned; no aliases, forms, measures, conversions, recipes, yields, or substitutions were added.
- Snapshot: 1,846 ingredient references / 174 forms / 114 recipes / 1,123 ingredient rows; 2,229 research-ledger records / 10,462 source entries / 8,831 distinct source IDs / 7,479 distinct source URLs.
- Static package and ledger-schema validation, generated-index freshness, source ownership, picker projection, corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests, build, emulator run, or deployment were performed: shared catalog edits add database JSON, and R726 is documentation-only.
- See the [R725](proposals/wp02-a6-next-gap-review-r725-20261018.md), [R726](proposals/wp03-section-f-next-gap-review-r726-20261018.md), and [R727](proposals/wp04-section-p-next-gap-review-r727-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r725-r727-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.


## 2026-10-18 WP02/WP03/WP04 R728–R730 — quinoa portion, cereal identity, hake hold

- R728 recorded Naturquinoa's 60 g nutrition portion for its ordinary black quinoa flour as a product-specific `portion_weight` observation. The first-party page was available through indexed text but returned an anti-bot interstitial when opened; the manufacturer catalog confirms the ordinary-versus-precooked product boundary. The source gives no volume or weighing method, so transferable measurement research is `researched_no_supported_value`. No measure, density, mapping, alias, form, recipe link, yield, or substitution was added.
- R729 added identity-only `Organic Ancient Grains Multigrain Cereal / Céréales Grains Anciens` for the paired Loblaw/Maxi 375 g listing `20036116_EA`. The English listing supplies a 60 g serving recorded only as a SKU-specific portion observation. The French indexed serving field is malformed; no UPC or physical package was inspected. No aliases, forms, reusable measures, conversions, yields, recipe links, or substitutions were added.
- R730 held longfin hake (*Phycis chesteri*) outside active references and the ledger. DFO calls it non-commercial, while OQLF's Québec fish-market entry names two other species within commercial `merluche`; no current Canadian/Québec consumer product or recipe demand was found. No source record or identity was allocated.
- Snapshot: 1,847 ingredient references / 174 forms / 114 recipes / 1,123 ingredient rows; 2,230 research-ledger records / 10,466 source entries / 8,835 distinct source IDs / 7,483 distinct source URLs.
- Static package and ledger-schema validation, generated-index freshness, source ownership, picker projection, corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests, build, emulator run, or deployment were performed: R728/R729 add database JSON under the current `AGENTS.md`, and R730 is documentation-only.
- See the [R728](proposals/wp02-a6-next-gap-review-r728-20261018.md), [R729](proposals/wp03-section-f-next-gap-review-r729-20261018.md), and [R730](proposals/wp04-section-p-next-open-gap-review-r730-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r728-r730-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R731–R733 — buckwheat portion, Apple Jacks, wolffish whole form

- R731 recorded Coop Agrobio's 2023 1/4 cup (40 g) serving only as a product-specific observation on generic buckwheat flour. The current homepage confirms the product class, not the serving; no generic measure, density, mapping, or conversion was activated. Substitution research remains unreviewed.
- R732 added identity-only `Kellogg's Apple Jacks cereal / Céréales Kellogg's Apple Jacks` from paired Canadian SmartLabel entries and recorded their 1 cup (39 g) portion only for UPC `00064100133396`. Walmart's separate 320 g listing has no visible UPC crosswalk to the 345 g manufacturer label; it was not used for measurement.
- R733 added one `whole Atlantic wolffish / loup de l’Atlantique entier` form under the existing species identity based on La Mer's dated whole-fish list. The adjacent fillet line remains excluded to preserve broad `fillet` search results; the source does not establish freshness, freezing, cleaning, size, measure, or yield.
- Snapshot: 1,848 ingredient references / 175 forms / 114 recipes / 1,123 ingredient rows; 2,232 research-ledger records / 10,472 source entries / 8,841 distinct source IDs / 7,488 distinct source URLs.
- Static package and ledger-schema validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests, build, emulator, or deployment were run because catalog changes add database JSON under `AGENTS.md`.
- See the [R731](proposals/wp02-a6-next-gap-review-r731-20261018.md), [R732](proposals/wp03-section-f-next-open-gap-review-r732-20261018.md), and [R733](proposals/wp04-section-p-whole-atlantic-wolffish-form-review-r733-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r731-r733-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R734–R736 — white quinoa flour portion, Reese's Puffs hold, Haddock form

- R734 recorded Tootsi's 1/4 cup (40 g) manufacturer Nutrition Facts portion only for organic white quinoa flour product 31501. The bilingual pages show one product label; no generic measure, density, mapping, conversion, or substitution was added.
- R735 held the Reese's Puffs Canadian family outside active data because General Mills' bilingual guides and Metro's bilingual listings reverse the plain/Bats package-code mapping, while Metro also indexes a Dark Chocolate product absent from the Canadian guide set. No catalog or ledger identifiers were allocated.
- R736 added one `fresh_whole` form under the existing Haddock identity as `fresh whole haddock / églefin frais entier`. The form does not imply cleaning state, a measure, yield, recipe link, or substitution; existing smoked/scrod/loin boundaries remain unchanged.
- Snapshot: 1,848 ingredient references / 176 forms / 114 recipes / 1,123 ingredient rows; 2,233 ledger records / 10,476 source entries / 8,845 distinct source IDs / 7,492 distinct source URLs.
- Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped JSON, local links, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were performed because active changes only add database JSON under `AGENTS.md`.
- See the [R734](proposals/wp02-a6-next-gap-review-r734-20261018.md), [R735](proposals/wp03-section-f-next-open-gap-review-r735-20261018.md), and [R736](proposals/wp04-section-p-haddock-fresh-whole-form-review-r736-20261018.md) proposals and [integration README](batches/wp02-wp03-wp04-r734-r736-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.


## 2026-10-18 WP02/WP03/WP04 R737–R739 — quinoa substitution hold, cereal-family hold, cod form

- R737 completed the deferred white-quinoa-flour substitution review. Tootsi product 31501 says its flour can replace up to 25% of flour in recipes, but names no base flour, denominator, mass/volume basis, recipe scope, or adjustments. Two studies use other quinoa flours in specific formulations. The ledger now retains this claim as `blocked_pending_evidence`; no replacement pair, active rule, alias, measure, or recipe link was added.
- R738 held only the Oatmeal Crisp Chocolate Almond candidate while the family-level picker decision remains open. The current manufacturer lists seven English/French products; adding one row would make `Oatmeal Crisp` and `Avoine Croquante` misleading one-result queries. Its 1 cup (58 g) label portion remains proposal evidence, and no IDs or active data were allocated. The recipe scan found no product demand.
- R739 added `fresh whole Atlantic cod / morue de l’Atlantique fraîche entière` as one `fresh_whole` form under the Atlantic-cod identity. A current Canadian supplier's fresh whole product is head-off and gutted; this prep state stays SKU-specific. Current Seafood from Canada profiles list HOG/H&G, and the DFO whole-dressed wording is historical. Broad cod, whole-fish, and fillet queries remain unchanged. No recipe demand, measure, yield, conversion, or substitution was added.
- Snapshot: 1,848 ingredient references / 177 forms / 114 recipes / 1,123 ingredient rows; 2,234 research-ledger records / 10,483 source entries / 8,850 distinct source IDs / 7,497 distinct source URLs.
- Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped JSON, local links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run because the active catalog change adds database JSON under `AGENTS.md`; R738 is proposal/plan documentation only.
- See the [R737](proposals/wp02-a6-white-quinoa-flour-substitution-review-r737-20261018.md), [R738](proposals/wp03-section-f-oatmeal-crisp-chocolate-almond-family-hold-r738-20261018.md), and [R739](proposals/wp04-section-p-atlantic-cod-fresh-whole-form-review-r739-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r737-r739-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R740–R742 — black quinoa evidence, millet access hold, Pacific cod form

- R740 recorded Ballester-Sánchez et al.'s 25% whole-black-quinoa-flour bread blend as a formula-specific `blocked_pending_evidence` finding on the existing black-quinoa-flour row. The study's supermarket wheat flour has no exact catalog counterpart, and its flour preparation does not match the Naturquinoa product evidence. No active replacement or substitution rule was added.
- R741 rechecked the official CNF 2026 Food Code 4492 sources for cooked millet. The portal lists relational files, but no code-4492 row contents were accessible. The three CNF 2015 portions remain edition-specific; the current-edition join is still open, with no row-presence or absence claim.
- R742 added `fresh whole Pacific cod / morue du Pacifique fraîche entière` as one `fresh_whole` form under the existing Pacific-cod identity. Current Metro bilingual guidance describes a whole, fresh/frozen Pacific-cod fish-counter offer in species context; Canfisco's detailed whole-round table dates to June 2023. No current SKU, Québec inventory, cleaning state, measure, yield, recipe link, conversion, or substitution is claimed.
- Snapshot: 1,848 ingredient references / 178 forms / 114 recipes / 1,123 ingredient rows; 2,235 ledger records / 10,491 source entries / 8,855 distinct source IDs / 7,502 distinct source URLs.
- Static package/ledger/schema validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped JSON, local links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run under the database-JSON-only testing rule in `AGENTS.md`.
- See the [R740](proposals/wp02-a6-black-quinoa-flour-substitution-review-r740-20261018.md), [R741](proposals/wp03-section-f-cnf-2026-cooked-millet-row-review-r741-20261018.md), and [R742](proposals/wp04-section-p-pacific-cod-fresh-whole-form-review-r742-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r740-r742-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R743–R745 — fonio measurement, kasha picker hold, Blue Crab form hold

- R743 completed the deferred measurement review for the existing white-fonio-flour row. Native Acha loose/tapped densities are not species-resolved or measured by a reproduced household method; current *D. exilis* product instructions give cup amounts without paired mass. The ledger now marks transferable measurement `researched_no_supported_value` with no measurement observations, density, or mappings. R722 substitution evidence is preserved.
- R744 held prepared `kacha / kasha` outside active references and aliases. OQLF's term is a prepared gruel, while a current Québec product listing calls dry roasted buckwheat “Kasha.” The current substring fallback makes unqualified `kacha` return fingerroot, so no identity or alias was allocated. Section F remains open.
- R745 held a proposed `live blue crab / crabe bleu vivant` form under the verified *Callinectes sapidus* identity. The supplier evidence is taxon-specific and seasonal/special-order; in the current picker, adding it would make generic `live` and `vivant` one-result Blue-Crab queries and suppress current `live` substring results. No catalog or ledger data was allocated.
- Snapshot: 1,848 ingredient references / 178 forms / 114 recipes / 1,123 ingredient rows; 2,235 ledger records / 10,493 source entries / 8,857 distinct source IDs / 7,504 distinct source URLs.
- Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks are recorded in the batch README. No software tests, build, emulator, or deployment were run: the only shared database change is a research-ledger JSON update, and R744/R745 are documentation-only holds.
- See the [R743](proposals/wp02-a6-fonio-flour-measurement-review-r743-20261018.md), [R744](proposals/wp03-section-f-kasha-prepared-gruel-picker-boundary-review-r744-20261018.md), and [R745](proposals/wp04-section-p-blue-crab-live-form-picker-hold-r745-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r743-r745-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R746–R748 — teff label portion, pot-barley recheck, Northern-pike form

- R746 recorded Bob’s Red Mill Teff Flour’s manufacturer-label 1/4 cup (35 g) serving as one product-specific observation on the existing teff-flour ledger row. The label provides no cup capacity or flour fill/weigh method, so reusable measurement remains unsupported. The R725 substitution finding is preserved.
- R747 rechecked the provisional `pot barley / orge en pot` display and its exact picker ownership. It adds no shared data; independent Québec reviewer approval remains open.
- R748 added `fresh whole northern pike / grand brochet frais entier` under the existing Northern-pike identity based on a supplier page listing Northern Pike within “Whole Fish and Fillets” under Local Fresh Fish. No SKU, Québec inventory, cleaning/head state, measure, yield, recipe link, conversion, or substitution is claimed.
- Snapshot: 1,848 references / 179 forms; 2,236 ledger records / 10,496 source entries / 8,858 distinct source IDs / 7,505 distinct URLs; 114 recipes / 1,123 ingredient rows.
- Static package and ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped JSON, links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run: R746 and R748 only add database JSON data, and R747 is documentation-only under `AGENTS.md`.
- See the [R746](proposals/wp02-a6-teff-flour-measurement-review-r746-20261018.md), [R747](proposals/wp03-section-f-pot-barley-quebec-display-approval-recheck-r747-20261018.md), [R748](proposals/wp04-section-p-northern-pike-fresh-whole-form-review-r748-20261018.md), and [integration README](batches/wp02-wp03-wp04-r746-r748-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R749–R751 — red quinoa flour, corn poha grades, Walleye

- R749 completed measurement and substitution research on the existing red-quinoa-flour row. Measurement is `researched_no_supported_value`; the red-quinoa bread trial remains one `blocked_pending_evidence` finding. The freeze-milled density study does not identify a red sample, and the bread result is specific to laboratory-ground Bolivian red quinoa in one type-000 wheat formula. No measurement observation or active substitution was added.
- R750 held thin/medium/thick forms outside corn poha. Reviewed manufacturer/distributor and Canadian retailer catalogs list corn poha separately from those grade labels; copying rice-poha form labels would make `thin poha` and `poha fin` return both maize and flattened rice. No catalog or ledger data changed.
- R751 added `whole walleye / doré jaune entier` as one `whole_fish` form under the existing Walleye reference. The product is identified as Walleye and sold whole; fresh/frozen state, cleaning state, product weight, Québec availability, and recipe behavior remain unclaimed.
- Snapshot: 1,848 ingredient references / 180 forms / 114 recipes / 1,123 ingredient rows; 2,237 ledger records / 10,503 source entries / 8,863 distinct source IDs / 7,510 distinct source URLs.
- Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run: R749 and R751 only add database JSON data and R750 is documentation-only under `AGENTS.md`.
- See the [R749](proposals/wp02-a6-red-quinoa-flour-measure-substitution-review-r749-20261018.md), [R750](proposals/wp03-section-f-corn-poha-thickness-grade-review-r750-20261018.md), [R751](proposals/wp04-section-p-walleye-whole-fish-form-review-r751-20261018.md), and [integration README](batches/wp02-wp03-wp04-r749-r751-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R752–R754 — millet-flour findings, sorghum-couscous hold, Atlantic halibut

- R752 added two formula-specific wheat–millet flour findings to the existing generic millet-flour ledger row as `blocked_pending_evidence`. The accessible studies do not identify millet species or support a household replacement rule; no active substitution was added.
- R753 retained the sorghum-couscous candidate as unresolved and ledger-only. The Moroccan bilingual listing names a current 500 g product but leaves its full composition and processing state unresolved and does not meet the Québec-label condition.
- R754 added a species-qualified fresh-whole Atlantic-halibut form under the existing identity. The supplier pages list whole fish fresh or frozen without the head; that state remains supplier-specific, and no current stock or preparation details are generalized.
- Snapshot: 1,848 ingredient references / 181 forms / 114 recipes / 1,123 ingredient rows; 2,238 ledger records / 10,511 source entries / 8,870 distinct source IDs / 7,517 distinct source URLs.
- Static package/ledger/schema validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped JSON, local links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run because the shared catalog changes only add database JSON under `AGENTS.md`.
- See the [R752](proposals/wp02-a6-generic-millet-flour-substitution-review-r752-20261018.md), [R753](proposals/wp03-section-f-sorghum-couscous-product-label-recheck-r753-20261018.md), [R754](proposals/wp04-section-p-atlantic-halibut-fresh-whole-form-review-r754-20261018.md), and [integration README](batches/wp02-wp03-wp04-r752-r754-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.

## 2026-10-18 WP02/WP03/WP04 R785–R787 — glutinous rice flour, Rice Krispies family, pollock forms

- R785 recorded five Bob’s Red Mill and King Arthur Baking product- or formula-specific glutinous-rice-flour portions. Bob’s named Sweet White Rice Flour chart supports its own spoon-and-level 1/4-cup and 1-cup values; the KAB recipe amounts remain formula-specific. Generic reusable measurement remains unsupported; no density, mapping, form, recipe link, or substitution changed.
- R786 superseded the Holiday-only Rice Krispies hold with three identity-only family references: Holiday Edition, Spring Edition, and standard/Original. The generic crispy-rice-cereal reference, recipe link, and R291’s SKU-specific 28 g observation remain unchanged. Refreshed existing French family source WP03-S88 under its existing owner; the English family source is shared across the three new records.
- R787 resolved R574’s Alaska-pollock singleton hold with paired frozen Alaska and fresh Atlantic pollock fillet forms. Species-qualified singular French terms make generic English/French pollock-fillet searches return both species, while broad fish-cut queries remain multi-result. Metro tray averages and PA package amounts remain SKU-specific; no measure, yield, recipe link, or active substitution was added.
- Snapshot: 1,873 references / 195 forms / 114 recipes / 1,123 ingredient rows; 2,277 ledger records / 10,661 source entries / 8,973 distinct source IDs / 7,620 distinct URLs.
- Static ledger/package validation passed with zero errors; the bundled package was normalized and the generated Kotlin reference index is current at 1,873 references. Picker projection and the full 114-recipe corpus scan passed; no candidate-specific recipe rows were found. UTF-8 without BOM, escaped Unicode in seed JSON, source ownership, local links, and scoped whitespace were checked. No software tests, build, emulator, or deployment were run because the database changes only add JSON data under AGENTS.md.
- See the [R785](proposals/wp02-a6-glutinous-rice-flour-measurement-review-r785-20261018.md), [R786](proposals/wp03-section-f-rice-krispies-family-picker-review-r786-20261018.md), and [R787](proposals/wp04-section-p-pollock-fillet-pair-boundary-review-r787-20261018.md) proposals and the [integration README](batches/wp02-wp03-wp04-r785-r787-gap-review-integration-20261018/README.md). Sections A6, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R788–R790 — glutinous rice flour, Quaker Squares, canned tuna

- R788 added one source-scoped ICE finding to the existing glutinous-rice-flour ledger row: the named fermented garlic-scape kimchi pancakes may use all-purpose flour alone. The source gives no revised amount; R785 measurement observations and state remain unchanged. No active substitution rule or recipe link was added.
- R789 added bilingual identity-only references for Quaker Corn Squares, Oatmeal Squares, and Maple & Brown Sugar Oatmeal Squares. Each gets one product-specific manufacturer label portion; no general cereal measure, form, recipe link, or substitution was added.
- R790 added one canned-tuna-in-water form under the existing canned-tuna market identity. Three Clover Leaf half-can drained (55 g) label portions remain separate product observations; no common can size, conversion, yield, recipe link, or substitution was added.
- Snapshot: 1,876 references / 196 forms / 114 recipes / 1,123 ingredient rows; 2,281 ledger records / 10,678 source entries / 8,987 distinct source IDs / 7,634 distinct source URLs.
- Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped JSON, links, and scoped whitespace checks are recorded in the integration README. No software tests, build, emulator, or deployment were run because active catalog changes only add database JSON data under AGENTS.md.
- See the [R788](proposals/wp02-b2-b3-next-open-gap-review-r788-20261019.md), [R789](proposals/wp03-section-f-next-open-gap-review-r789-20261019.md), [R790](proposals/wp04-section-p-next-open-gap-review-r790-20261019.md), and [integration README](batches/wp02-wp03-wp04-r788-r790-gap-review-integration-20261019/README.md). Sections A6, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R791–R793 — polvilho, Krave cereal, canned salmon

- R791 added four source records and a `blocked_pending_evidence` finding to the existing polvilho-doce ledger row. The indexed Ana Maria Braga snapshot documents a recipe-specific half-swap tip, but the directly accessible canonical page serves a different sour-polvilho recipe without the tip. Preserve the page-version conflict; no active substitution, recipe link, measurement, or alias was added. R688's product portion and R716's separate biscuit evidence remain unchanged.
- R792 added three bilingual identity-only Kellogg's Krave cereal references with one exact-GTIN/package SmartLabel portion each. No reusable cereal measure, forms, mappings, recipe links, or substitutions were added.
- R793 added one canned-salmon-in-water form under the existing salmon identity and one product-specific half-can drained (55 g) observation. No generic can measure, yield, recipe link, or substitution was added.
- Snapshot: 1,879 references / 197 forms / 114 recipes / 1,123 ingredient rows; 2,285 ledger records / 10,701 source entries / 9,003 distinct source IDs / 7,650 distinct source URLs.
- Static package/ledger validation, generated-index freshness, source ownership, recipe-corpus, encoding, links, and scoped whitespace checks are recorded in the integration README. No software tests, build, emulator, or deployment were run because the application data changes only add database JSON data under `AGENTS.md`.
- See the [R791](proposals/wp02-b3-polvilho-doce-cheese-bread-comparison-review-r791-20261019.md), [R792](proposals/wp03-section-f-next-open-gap-review-r792-20261019.md), [R793](proposals/wp04-section-p-canned-salmon-in-water-form-review-r793-20261019.md), and [integration README](batches/wp02-wp03-wp04-r791-r793-gap-review-integration-20261019/README.md). Sections B3, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R794–R796 — hominy grits, Red River cereal, dried flatfish powder

- R794 recorded Pearl Milling Quick Grits' 1/4 cup (37 g) dry product-label serving on the existing hominy-grits ledger row. It remains specific to the named product and does not create a generic grits measure, density, mapping, conversion, or form.
- R795 added identity-only Red River Cream of Whole Wheat cereal, resolving the R175 hold with product-matched French naming. It remains separate from Original Red River, 7 Grain, generic cream of wheat, and component grains; no aliases, forms, measures, recipe links, or substitutions were added.
- R796 added identity-only dried flatfish powder / poudre de poissons plats séchés with the single English alias `dried flounder fish powder`. It remains species-neutral and separate from generic fish powder, Bonga, bonito, flounder, and sole; no form, measure, recipe link, or substitution was added.
- Snapshot: 1,881 references / 197 forms / 114 recipes / 1,123 ingredient rows; 2,287 ledger records / 10,715 source entries / 9,016 distinct source IDs / 7,663 distinct URLs / 817 measurement observations.
- Static package normalization, validation, and generated-index freshness passed. No software tests were run after this JSON-only integration under `AGENTS.md`; the broader Section A7, F, and P checklist items remain open.
- See the [R794](proposals/wp02-section-a7-next-grain-meal-gap-review-r794-20261019.md), [R795](proposals/wp03-section-f-next-cereal-grain-gap-review-r795-20261019.md), [R796](proposals/wp04-section-p-next-seafood-gap-review-r796-20261019.md), and [integration README](batches/wp02-wp03-wp04-r794-r796-gap-review-integration-20261019/README.md).

## 2026-10-19 WP02/WP03/WP04 R797–R799 — Khorasan flour, Great Grains hold, mackerel in tomato sauce

- R797 recorded the Québec Food Directory's 1/3 cup (60 g) nutrition serving for La Milanaise Organic Unbleached White Khorasan Flour as one product-specific published-portion observation on the existing flour ledger row. The generic identity, aliases, density, mappings, and substitution state remain unchanged; the value does not transfer to Khorasan semolina or other flours.
- R798 held Post Great Grains Nut Medley outside active references and ledger data because current Canadian product identity and product-matched Québec French naming could not be established. The 2018 phrase “great grains mélange de noix” and 385 g listing remain historical or SKU-specific evidence, not active catalog terms.
- R799 added identity-only, species-neutral `canned mackerel in tomato sauce / maquereau en conserve à la sauce tomate`, with two exact French product-name aliases. Reused R176's Brunswick and Walmart source IDs; added Toyo, Provigo, and Grace Foods sources. Grace's current French catalogue distinguishes plain tomato-sauce mackerel from chili-qualified mackerel and chinchard. No forms, measures, conversions, yields, recipe links, or substitutions were added.
- Snapshot: 1,882 ingredient references / 197 forms / 114 recipes / 1,123 ingredient rows; 2,288 ledger records / 10,720 source entries / 9,019 distinct source IDs / 7,666 distinct URLs / 818 measurement observations.
- Static package/ledger validation, reference normalization, generated-index freshness, source ID/URL ownership, picker projection, recipe corpus, UTF-8/no-BOM and escaped-JSON checks, links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run because active catalog changes only add database JSON data under `AGENTS.md`.
- See the [R797](proposals/wp02-section-a7-next-grain-meal-gap-review-r797-20261019.md), [R798](proposals/wp03-section-f-next-cereal-grain-gap-review-r798-20261019.md), [R799](proposals/wp04-section-p-canned-mackerel-tomato-sauce-product-review-r799-20261019.md), and [integration README](batches/wp02-wp03-wp04-r797-r799-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R800–R802 — emmer flour, Love Crunch, canned tuna in olive oil

- R800 recorded Purcell Mountain Farms Organic Emmer Flour’s manufacturer-published 1/4 cup (45 g) nutrition serving on the existing emmer-flour ledger row. The observation remains specific to the whole-grain Unifine product; no generic flour measure or conversion was activated.
- R801 added one identity-only bilingual reference for Love Crunch Organic Dark Chocolate & Red Berries Granola. The English and French-localized Nature’s Path pages share the product-code digits; a Québec Metro listing adds French product wording. The identity stays separate from generic granola, components, and sibling variants; no aliases, measures, forms, links, or substitutions were added.
- R802 added one canned-tuna-in-olive-oil form under the existing canned-tuna identity. Reused the parent-owned Metro Québec source and added four Clover Leaf English/French category and product sources. The tuna’s species, cut, formula, package, drained state, and product handling remain source-specific; no general measure or rule was added.
- Snapshot: 1,883 references / 198 forms / 114 recipes / 1,123 ingredient rows; 2,290 ledger records / 10,730 source entries / 9,028 distinct source IDs / 7,675 distinct URLs / 819 measurement observations.
- Static package normalization and validation, reference normalization, and generated-index freshness passed. Source IDs map consistently to URLs; new source IDs and the R800 observation ID are unique. Picker projections and the full manifest-listed recipe corpus were checked; no candidate-specific recipe rows were found. JSON remains ASCII-escaped without BOM and documentation remains UTF-8 without BOM; local links and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run because the active catalog changes only add database JSON data under `AGENTS.md`.
- See the [R800](proposals/wp02-section-a7-next-grain-meal-gap-review-r800-20261019.md), [R801](proposals/wp03-section-f-love-crunch-red-berries-identity-review-r801-20261019.md), [R802](proposals/wp04-section-p-canned-tuna-in-olive-oil-form-review-r802-20261019.md), and [integration README](batches/wp02-wp03-wp04-r800-r802-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R803–R805 — pastry flour portions, Love Crunch Coconut, canned tuna in broth and oil

- R803 recorded King Arthur Baking’s linked-product 1 cup (96 g) chart portion on the existing whole-wheat pastry-flour ledger row. A direct audit found conflicting Québec Food Directory fields for the same GTIN (Nutrition Facts 1/4 cup / 30 g and supplemental serving 1/3 cup / 60 g); both Québec values are held. Reused `WP02A1-S03`, `WP02A1-S04`, and shared chart ID `WP07-KAB-IWC`; no generic measure, density, mapping, conversion, form, or substitution was added.
- R804 added identity-only Love Crunch Organic Dark Chocolate & Coconut Granola / Granola avec noix de coco et chocolat noir biologique, Love Crunch, matched to UPC `058449772019`. It remains distinct from R801 Red Berries, generic granola, and component ingredients; it is not a complete brand roster.
- R805 added one bilingual canned-tuna-in-broth-and-oil form under the existing canned-tuna parent, using six new product sources and the two parent-owned R168 catalog sources. Species, cut, broth/oil ratios, ingredients, packages, and drained servings remain product-specific; the water and olive-oil-only forms stay separate.
- Snapshot: 1,884 references / 199 forms / 114 recipes / 1,123 ingredient rows; 2,292 ledger records / 10,741 source entries / 9,036 distinct source IDs / 7,683 distinct URLs / 820 measurement observations.
- Static package and ledger schema validation, reference normalization, generated-index freshness, source ownership, picker projections, corpus, encoding, links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run because the active database changes only add JSON data under `AGENTS.md`.
- See the [R803](proposals/wp02-section-a7-whole-wheat-pastry-flour-measurement-review-r803-20261019.md), [R804](proposals/wp03-section-f-love-crunch-dark-chocolate-coconut-identity-review-r804-20261019.md), [R805](proposals/wp04-section-p-canned-tuna-in-broth-and-oil-form-review-r805-20261019.md), and [integration README](batches/wp02-wp03-wp04-r803-r805-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R806–R808 — malted rye alias, kiwicha, edible crab

- R806 added the English alias `rye malt flour` to existing malted rye flour and recorded no transferable substitute. The R662 3/4 cup (98 g) Briess L100 portion remains unchanged; the plain-medium-rye ratio was not transferred.
- R807 added `kiwicha` as an English alias on the existing amaranth-grain row, reusing OQLF's terminology source and adding Peru MIDAGRI and INIA sources. The earlier R168 alias hold is superseded; the French display and numeric/substitution behavior remain unchanged.
- R808 added identity-only edible crab / `tourteau` for *Cancer pagurus* with English aliases `brown crab` and `common crab`. The overlapping French compound and generic crab names remain unassigned. No reusable measure, recipe link, form, or substitution was added.
- Snapshot: 1,885 references / 199 forms / 114 recipes / 1,123 ingredient rows; 2,293 ledger records / 10,752 source entries / 9,047 distinct source IDs / 7,694 distinct URLs.
- Static package normalization/validation, ledger schema and source ownership, generated-index freshness, picker projection, full recipe corpus, encoding, links, and whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r806-r808-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run under the JSON-only rule in `AGENTS.md`.
- See the [R806](proposals/wp02-section-a7-milling-gap-review-r806-20261019.md), [R807](proposals/wp03-section-f-grain-gap-review-r807-20261019.md), and [R808](proposals/wp04-section-p-shellfish-gap-review-r808-20261019.md) proposals. Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R809–R811 — semolina evidence, Love Crunch identity, Iceland cockle hold

- R809 recorded King Arthur Baking's directional baking advice on the existing durum-semolina ledger row: equal-volume bread flour and an unquantified all-purpose-flour alternative. No alias or runtime substitution was added.
- R810 added identity-only Love Crunch Organic Peanut Butter Protein Granola matched by UPC `058449251309`, with product-qualified English and Metro French title aliases. The 312 g package amount remains separate from serving measures; no form, component link, recipe link, density, mapping, or substitution was added.
- R811 held Iceland cockle / `coque d’Islande` outside active data because the qualified row would make broad `cockle` and `coque` searches singletons while generic cockle remains unresolved. No species-matched Canadian product or recipe demand was found.
- Snapshot: 1,886 references / 199 forms / 114 recipes / 1,123 ingredient rows; 2,294 ledger records / 10,761 source entries / 9,053 distinct source IDs / 7,700 distinct URLs.
- Static package normalization/validation, ledger schema and source ownership, generated-index freshness, phrase-first picker projection, full manifest recipe scan, encoding, links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r809-r811-gap-review-integration-20261019/README.md). A full-worktree whitespace check also reported unrelated dirty files; those files were left untouched. No software tests, build, emulator, or deployment were run: the active application change only adds database JSON under `AGENTS.md`, and R811 is documentation-only.
- See the [R809](proposals/wp02-section-a7-durum-semolina-baking-substitution-review-r809-20261019.md), [R810](proposals/wp03-section-f-love-crunch-peanut-butter-protein-identity-review-r810-20261019.md), and [R811](proposals/wp04-section-p-iceland-cockle-species-boundary-review-r811-20261019.md) proposals. Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R812–R814 — einkorn portions, millet boundary, canned-crab portions

- R812 recorded one Québec Food Directory serving and four Jovial formula portions on the existing einkorn-flour ledger row. The values remain source-scoped; all-purpose and whole-grain scone flour remain a blocked formula-specific alternative because the catalog has no separate forms.
- R813 held a generic dry-millet form. CNF Food Code 4491 identifies *Panicum miliaceum* and already belongs to the common-millet dry form. Exact `millet, dry` matching would shadow that species-qualified form; the generic millet identity and its species-unspecified cooked Food Code 4492 form remain unchanged.
- R814 recorded two Clover Leaf 1/4 cup (55 g) canned-crab product servings on the existing form record. The Cajun Crab Fondue product option remains source-scoped because the alternate can count has no stated mass or equal drained yield.
- Snapshot: 1,886 ingredient references / 199 forms / 114 recipes / 1,123 ingredient rows; 2,294 ledger records / 10,765 source entries / 9,057 distinct source IDs / 7,704 distinct URLs / 827 measurement observations.
- Static research-ledger schema validation passed with zero errors. Seed package validation, normalizer checks, generated-index freshness, source ownership, picker projection, corpus, encoding, links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r812-r814-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run: the only database change adds source-specific research JSON, while R813 is documentation-only under `AGENTS.md`.
- See the [R812](proposals/wp02-section-a7-next-gap-review-r812-20261019.md), [R813](proposals/wp03-section-f-next-gap-review-r813-20261019.md), and [R814](proposals/wp04-section-p-next-gap-review-r814-20261019.md) proposals. Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R815–R817 — malted-wheat study, Froot Loops portions, Eastern-oyster CNF portions

- R815 recorded a blocked, Anapo-specific improver-substitution finding on the existing malted-wheat-flour ledger row. The controlled 0.5% soft-bread result is not a general household ratio or an active substitution rule.
- R816 recorded separate SmartLabel portions of 1 cup (39 g) for English GTIN `00064100595705` / 825 g and 1 tasse (39 g) for French GTIN `00064100144699` / 780 g. The portions are package-specific; no density, conversion, or package yield was added.
- R817 recorded seven CNF 2015 source-specific portions for wild Eastern oyster Food Code 3118 and farmed Food Code 3191. CNF's 2015 guide defines conversion weights as edible portions without refuse. Inspection of the current CNF 2026 food and measure rows remains open.
- Snapshot: 1,886 references / 199 forms / 114 recipes / 1,123 ingredient-array entries, including 1,097 rows with an `ingredientRefId`; 2,294 ledger records / 10,771 source entries / 9,063 distinct source IDs / 7,709 distinct source URLs / 836 measurement observations.
- Research-ledger schema validation passed with zero errors; source ID/URL conflicts and duplicate observation/finding IDs were not found. The seed package and generated index are unchanged. Source verification, picker and corpus review, encoding, links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r815-r817-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the only database change adds research JSON under the current `AGENTS.md` rule.
- See the [R815](proposals/wp02-section-a7-next-gap-review-r815-20261019.md), [R816](proposals/wp03-section-f-next-gap-review-r816-20261019.md), and [R817](proposals/wp04-section-p-next-gap-review-r817-20261019.md) proposals. Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R818–R820 — pastry-flour guidance, Frosted Flakes serving, calamari CNF portion

- R818 refreshed the existing King Arthur SKU 212374 product source and recorded its statement that the whole-wheat pastry flour can be used interchangeably with regular pastry flour. This remains a product-scoped ledger finding, with no amount or active rule.
- R819 recorded one 1 cup (38 g) Frosted Flakes portion for current English GTIN `00064100108301` / 1,410 g. The older French 580 g SmartLabel package was held from measurement data because its size is absent from the searchable French size list.
- R820 recorded one raw, mixed-species CNF 2015 squid portion (Food Code 3125): 1 squid = 272.0 g. It remains a historical count observation on generic calamari and does not describe the 140 g ring-cut recipe.
- Snapshot: 1,886 references / 199 forms / 114 recipes / 1,123 ingredient-array entries, including 1,097 rows with an `ingredientRefId`; 2,294 ledger records / 10,774 source entries / 9,066 distinct source IDs / 7,711 distinct source URLs / 838 measurement observations / 361 substitution findings.
- Research-ledger schema validation passed with zero errors; source ID/URL conflicts and duplicate observation/finding IDs were not found. The seed package and generated index are unchanged. Source verification, picker and corpus review, encoding, links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r818-r820-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the only database change adds research JSON under the current `AGENTS.md` rule.
- See the [R818](proposals/wp02-section-a7-next-gap-review-r818-20261019.md), [R819](proposals/wp03-section-f-next-gap-review-r819-20261019.md), and [R820](proposals/wp04-section-p-next-gap-review-r820-20261019.md) proposals. Sections A7, F, and P remain open; current CNF 2026 oyster/squid row verification is still pending.

## 2026-10-19 WP02/WP03/WP04 R821–R823 — whole-wheat flour, couscous, blue mussel

- R821 recorded two historical CNF 2015 Food Code 4500 whole-wheat-flour portions (100 mL = 50.7 g; 250 mL = 126.8 g) on the existing ledger row and reused its source S3. No density, app-cup mapping, conversion, alias, or recipe link was added; CNF 2026 values remain unverified.
- R822 recorded five historical CNF 2015 volume portions for dry and cooked couscous, Food Codes 4420 and 4490, plus the Food Code 4420 “amount to make” relationship of 34.5 g dry input to 125 mL prepared product as ledger-only `cooking_yield`. It adds no active forms, aliases, conversions, recipe links, or substitutions. Recipe 018 mentions couscous only as a serving suggestion; CNF 2026 rows remain unverified.
- R823 recorded five historical CNF 2015 Food Code 3115 portions for raw blue mussel. Treat their masses as edible portions without refuse; do not infer shell-on mass or yield from the separate 70% refuse field. No active form, numeric behavior, recipe link, or substitution was added; CNF 2026 rows remain unverified.
- Snapshot: 1,886 references / 199 forms / 114 recipes / 1,123 ingredient-array entries, including 1,097 with `ingredientRefId`; 2,294 ledger records / 10,779 source entries / 9,071 distinct source IDs / 7,713 distinct source URLs / 851 measurement observations / 361 substitution findings.
- Research-ledger JSON parsed and validated against its schema with zero errors. Observation/finding IDs and source-ID/URL integrity checks passed. No seed package or generated index changed. Proposal source verification, corpus/picker review, encoding, links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r821-r823-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the only database change adds research JSON under `AGENTS.md`.
- See the [R821](proposals/wp02-section-a7-next-gap-review-r821-20261019.md), [R822](proposals/wp03-section-f-next-gap-review-r822-20261019.md), and [R823](proposals/wp04-section-p-next-gap-review-r823-20261019.md) proposals. Sections A7, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R824–R826 — white whole-wheat flour, parboiled rice, scallop

- R824 recorded King Arthur Baking’s shared 1 cup (113 g) flour amount from one Ancient Grains Bread formula. The amount applies to white whole-wheat flour only if that either/or option is selected; it is not an independent white-flour-only weight or a generic conversion.
- R825 recorded two historical CNF 2015 Food Code 4472 dry parboiled-rice portions (100 mL = 78.2 g; 250 mL = 195.5 g) and the source’s 25.7 g input to make 125 mL as a directional, ledger-only cooking-yield relation. CNF 2026 row inspection remains open.
- R826 recorded two historical CNF 2015 Food Code 3213 raw mixed-species scallop count portions (one small = 6.0 g; one large = 15.0 g). The observations are edible portions without refuse; the blank refuse field does not mean zero, and roe state, size cutoffs, and weighing method remain unspecified. CNF 2026 row inspection remains open.
- Snapshot: 1,886 active ingredient references / 199 forms / 114 recipes / 1,123 ingredient-array entries, including 1,097 with an `ingredientRefId`; 2,294 ledger records / 10,783 source entries / 9,075 distinct source IDs / 7,715 distinct source URLs / 857 measurement observations / 361 substitution findings.
- Research-ledger schema validation, source ID/URL integrity, and observation/finding-ID uniqueness passed. The bundled catalog, generated index, and recipe corpus were not changed. Proposal source checks, encoding, links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r824-r826-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run under the updated `AGENTS.md` rule because the active database changes add research JSON only.
- See the [R824](proposals/wp02-section-a7-next-gap-review-r824-20261019.md), [R825](proposals/wp03-section-f-next-gap-review-r825-20261019.md), and [R826](proposals/wp04-section-p-next-gap-review-r826-20261019.md) proposals. Sections A7, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R827–R829 — precooked corn flour, common millet, blue crab

- R827 recorded P.A.N.’s 3 Tbsp. (30 g) serving from its named 1 kg pre-cooked white-corn label on the existing precooked-corn-flour ledger row. The serving remains product-specific; no generic conversion, density, or package yield was inferred.
- R828 recorded CNF 2015 and CNF 2026 Food Code 4491 “amount to make 125 mL” entries for dry common millet as separate ledger-only input-to-volume observations: 46.0 g and 46.04 g. The values were not compared or averaged; method, output mass, and cooked form remain unspecified.
- R829 recorded CNF 2015 Food Code 3096’s raw blue-crab portion, 1 crab (150 g) = 23.1 g. CNF’s separately reported 86% refuse was retained as source context without reconciliation or derivation; CNF 2026 row inspection remains open.
- Snapshot: 1,886 active ingredient references / 199 forms / 114 recipes / 1,123 ingredient-array entries, including 1,097 with an `ingredientRefId`; 2,294 ledger records / 10,788 source entries / 9,080 distinct source IDs / 7,717 distinct source URLs / 861 measurement observations / 361 substitution findings.
- Research-ledger schema validation, source ownership, source ID/URL integrity, and observation/finding-ID uniqueness passed. The active catalog, generated index, and recipe corpus were unchanged. Proposal source checks, encoding, local links, and scoped whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r827-r829-gap-review-integration-20261019/README.md). No software tests, app build, emulator, or deployment were run; the active database changes add research JSON data only under `AGENTS.md`.
- See the [R827](proposals/wp02-section-a7-next-gap-review-r827-20261019.md), [R828](proposals/wp03-section-f-next-gap-review-r828-20261019.md), and [R829](proposals/wp04-section-p-next-gap-review-r829-20261019.md) proposals. Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R830–R832 — barley flour, white rice, cuttlefish

- R830 recorded Bob’s Red Mill’s 50% barley-flour recommendation for replacing part of recipe whole-wheat flour as a narrow source-scoped finding. The broader study-based block remains, and no active substitution rule or conversion was added.
- R831 recorded separate CNF 2015 and CNF 2026 dry-white-rice input-to-stated-125-mL observations (35.3 g and 35.29 g). CFIA guidance supports direction only; no preparation method, output mass, cooked form, or active conversion was inferred. The CNF 2026 row evidence was carried forward from R553 and was not freshly downloaded in this review.
- R832 recorded CNF 2015 Food Code 3114’s raw mixed-species cuttlefish guide portion of 90.0 g. Blank refuse fields remain unreported; CNF 2026 row inspection remains open.
- Snapshot: 1,886 active ingredient references / 199 forms / 114 recipes / 1,123 ingredient-array entries, including 1,097 with `ingredientRefId`; 2,294 ledger records / 10,792 source entries / 9,082 distinct source IDs / 7,718 distinct source URLs / 864 measurement observations / 362 substitution findings.
- Research-ledger schema validation, source ownership, source ID/URL integrity, and observation/finding-ID uniqueness passed. The active catalog, generated index, and recipe corpus were unchanged. Proposal source checks, encoding, links, and scoped whitespace checks are in the [integration README](batches/wp02-wp03-wp04-r830-r832-gap-review-integration-20261019/README.md). No software tests, app build, emulator, or deployment were run because these are database-JSON-only changes under `AGENTS.md`.
- See the [R830](proposals/wp02-section-a7-next-gap-review-r830-20261019.md), [R831](proposals/wp03-section-f-next-gap-review-r831-20261019.md), and [R832](proposals/wp04-section-p-next-gap-review-r832-20261019.md) proposals. Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R833–R835 — granular flour, parboiled rice access, lobster

- R833 completed the substitution-evidence review for the existing granular-flour reference. Ardent Mills’ current bilingual pages and 2023 portfolios list bakery, dusting, and thickening applications but no replacement ingredient, direction, amount, ratio, or method. A source-bounded no-supported-substitute finding was added to the ledger; no active rule was added.
- R834 rechecked the official CNF 2026 Food Code 4472 access paths. The release listing and its CSV resources are visible in portal metadata, but the CSV contents and documented API responses remained inaccessible. No 2026 row-presence or row-absence claim is made; the join remains open.
- R835 recorded four CNF 2015 Food Code 3210 portions for boiled or steamed American lobster: 100 mL diced = 61.3 g, 250 mL = 153.2 g, one food-guide serving = 75.0 g, and 125 mL = 76.6 g. The separate 78% refuse field was not used to derive shell-on mass or yield; CNF 2026 continuity remains unverified.
- The ledger now has 2,294 records / 10,795 source entries / 9,085 distinct source IDs / 7,719 distinct source URLs / 868 measurement observations / 363 substitution findings. The active catalog remains at 1,886 references / 199 forms; the bundle remains at 114 recipes / 1,123 ingredient rows. No active catalog, generated index, or recipe file changed.
- Ledger schema, source-ID/URL integrity, source ownership, observation/finding ID uniqueness, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No software tests, app build, emulator run, or deployment were performed under the database-JSON-only rule in AGENTS.md.
- See the [R833](proposals/wp02-section-a7-next-gap-review-r833-20261019.md), [R834](proposals/wp03-section-f-cnf2026-parboiled-rice-row-recheck-r834-20261019.md), and [R835](proposals/wp04-section-p-next-gap-review-r835-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r833-r835-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R836–R838 — emmer semolina, finger millet, Atlantic herring

- R836 completed the substitution-evidence review on existing emmer semolina with a source-bounded `researched_no_supported_substitute` finding and no replacements. Anson Mills gives no replacement direction; King Arthur Baking's equal-volume advice is for durum semolina and was not transferred. No active rule was added.
- R837 added only `nachni` as a search alias to the existing finger-millet grain row. FSSAI lists Nachni as a Marathi finger-millet name, and Mithila Foods uses the name for whole finger millet. The separate `nachni flour` alias stays on the flour row; no French alias or other catalog behavior changed.
- R838 recorded CNF 2015 Food Code 3014's 1 fillet = 189.3 g and 1 food-guide serving = 90.0 g for raw Atlantic herring. The separate 46% refuse figure remains context only; no whole-fish mass or yield was inferred, and CNF 2026 continuity remains unverified.
- Ledger totals: 2,294 records / 10,802 source entries / 9,088 distinct source IDs / 7,722 distinct URLs / 870 measurement observations / 364 substitution findings. Active catalog: 1,886 references / 199 forms; recipe bundle: 114 recipes / 1,123 ingredient rows. R837 changes one alias; no forms, recipes, conversions, yields, or active substitution rules changed.
- Static ledger schema, source-ID/URL integrity, observation/finding uniqueness, bundled-package normalization, generated-index freshness, picker projection, corpus, UTF-8/no-BOM, local links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run under the database-JSON-only rule in `AGENTS.md`.
- See the [R836](proposals/wp02-section-a7-next-gap-review-r836-20261019.md), [R837](proposals/wp03-section-f-next-gap-review-r837-20261019.md), and [R838](proposals/wp04-section-p-next-gap-review-r838-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r836-r838-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R839–R841 — white whole-wheat flour, couscous, Atlantic cod

- R839 added King Arthur Baking’s direction to replace up to 50% of all-purpose flour with its white whole-wheat flour as a ledger-only finding. The source does not state a mass/volume basis or an enforceable dish/method scope; no active substitution rule was added. Generic whole-wheat findings remain unchanged.
- R840 added separate dry and cooked couscous forms under the existing ingredient reference. The five CNF 2015 Food Code 4420/4490 volume portions are attached to their named states; the 34.5 g input to a stated 125 mL prepared-product amount remains unassigned and ledger-only. No density, reusable conversion, or generalized yield was added.
- R841 recorded historical CNF 2015 raw Atlantic-cod portions of 231.0 g per fillet and 90.0 g per food-guide serving. The 66% refuse remains separate context; no yield or whole-fish mass was inferred, and CNF 2026 continuity remains unverified.
- Snapshot: 1,886 active ingredient references / 201 forms / 114 recipes / 1,123 ingredient rows; 2,294 ledger records / 10,805 source entries / 9,089 unique source IDs / 7,723 unique source URLs / 872 measurement observations / 365 substitution findings.
- Research-ledger schema, source URL ownership, observation/finding/form-ID uniqueness, bundled seed package validation, and generated-index freshness passed. R839/R841 changed ledger evidence only; R840 changed forms and ledger JSON. No software tests, app build, emulator, or deployment were run under the database-JSON-only rule in `AGENTS.md`.
- See the [R839](proposals/wp02-section-a7-next-gap-review-r839-20261019.md), [R840](proposals/wp03-section-f-next-gap-review-r840-20261019.md), and [R841](proposals/wp04-section-p-next-gap-review-r841-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r839-r841-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R842–R844 — cracked-rye porridge, Fruity Cheerios, Atlantic mackerel

- R842 recorded Janie's Mill's cracked-wheat option only within its named Cracked Rye porridge formula; its one-cup amount is contextual and no active substitution rule was added.
- R843 added identity-only Fruity Cheerios / Cheerios fruitées and one manufacturer-label serving observation (1 cup / 38 g) for the named product. No generic cereal measure, density, conversion, or substitution was added.
- R844 recorded two historical CNF 2015 Food Code 3021 Atlantic-mackerel portions (1 fillet = 115.2 g; 1 food-guide serving = 90.0 g). Refuse remains separate context and CNF 2026 continuity is unverified.
- Static ledger/schema, source ownership, package, generated-index, picker, corpus, encoding, link, and scoped whitespace checks are recorded in the integration README. No software tests, build, emulator, or deployment were run because active application data changes add database JSON under `AGENTS.md`.
- See the [R842](proposals/wp02-section-a7-next-gap-review-r842-20261019.md), [R843](proposals/wp03-section-f-next-gap-review-r843-20261019.md), and [R844](proposals/wp04-section-p-next-gap-review-r844-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R845–R847 — wheat-starch lead, Very Berry Cheerios, Alaska pollock

- R845 recorded Lantmännen Biorefineries’ native wheat-starch statement as a blocked, product-specific replacement lead. The page does not name the flour, amount, ratio, formula, or method; no replacement or active rule was added.
- R846 added identity-only Very Berry Cheerios / Cheerios Petits fruits exquis and one manufacturer-label serving observation (1 cup / 36 g) for the named product. The direct bilingual product pages support the row; the existing product-list ledger sources were not changed.
- R847 recorded historical CNF 2015 Food Code 3039 portions for raw Alaska pollock: 1 fillet = 84.9 g and 1 food-guide serving = 90.0 g. The separate 66% refuse remains context only; no yield or reusable conversion was inferred, and CNF 2026 continuity remains unverified.
- Static ledger/schema, source ownership, package, generated-index, picker, corpus, encoding, link, and scoped whitespace checks are recorded in the integration README. No software tests, build, emulator, or deployment were run because the application data changes add database JSON under `AGENTS.md`.
- See the [R845](proposals/wp02-section-a7-wheat-starch-substitution-review-r845-20261019.md), [R846](proposals/wp03-section-f-next-gap-review-r846-20261019.md), and [R847](proposals/wp04-section-p-next-gap-review-r847-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R848–R850 — durum-flour lead, Chocolate Cheerios, Channel Catfish

- R848 recorded King Arthur Baking's optional "finely ground semolina" note as a blocked, recipe-specific lead on the existing durum-flour row. The source does not identify the semolina grade or whether "up to half" is by mass or volume; 7 cups (868 g) remains formula context. No replacement identity, measure, or active rule was added.
- R849 added identity-only Chocolate Cheerios / Chocolat Cheerios and one manufacturer-label serving observation (1 cup / 38 g) for the named cereal. No generic cereal measure, form, component link, recipe link, or substitution was added.
- R850 recorded four historical CNF 2015 Channel Catfish portions, keeping wild Food Code 2993 and farmed Food Code 3180 distinct. Each row lists 1 fillet = 159.0 g and 1 food-guide serving = 90.0 g. Wild 65% refuse remains context; farmed refuse is unreported. CNF 2026 continuity remains unchecked.
- Static data, source ownership, package, generated-index, picker, corpus, encoding, links, and whitespace checks are recorded in the [integration README](batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run for these database JSON changes under `AGENTS.md`.
- See the [R848](proposals/wp02-a7-next-gap-review-r848-20261019.md), [R849](proposals/wp03-section-f-next-gap-review-r849-20261019.md), and [R850](proposals/wp04-section-p-next-gap-review-r850-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R851–R853

- R851 completed the substitution-evidence review for the existing spring-wheat-semolina identity. U.S. Hard Red Spring flour or semolina as an alternative to durum semolina for pasta remains a rejected class-level lead because the source does not match the Canadian product or provide a grade or formula; the accepted finding has no replacements or active rule.
- R852 added identity-only Chocolate Strawberry Cheerios / Cheerios Chocolat et fraise. No measure was recorded because the English manufacturer page conflicts between 38 g promotional text and a 36 g Nutrition Facts serving, and the paired pages do not identify package codes.
- R853 recorded three ledger-only CNF 2015 Food Code 3206 portions for wild, baked-or-broiled rainbow trout: 100 mL flaked = 57.5 g, 250 mL = 143.7 g, and one food-guide serving = 75.0 g. The separate 65% refuse remains context; CNF 2026 row continuity is unverified, and the values are not transferred to the fresh-whole form.
- The catalog has 1,890 references / 201 forms; the bundle has 114 recipes / 1,123 ingredient rows. The ledger has 2,298 records / 10,834 source entries / 9,106 unique source IDs / 7,739 unique source URLs / 886 measurement observations / 369 substitution findings. Schema, source/ID ownership, package normalization, generated-index freshness, picker projection, recipe corpus, encoding, local links, and scoped whitespace checks passed.
- No software tests, build, emulator, or deployment were run for the database-JSON additions under `AGENTS.md`. See the [R851](proposals/wp02-section-a7-next-gap-review-r851-20261019.md), [R852](proposals/wp03-section-f-next-gap-review-r852-20261019.md), and [R853](proposals/wp04-section-p-next-gap-review-r853-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.


## 2026-10-19 WP02/WP03/WP04 R854–R856 — hominy grits, Kellogg's Corn Flake Crumbs, Atlantic salmon

- R854 retained Quaker's Quick Grits - Original to regular/enriched hominy-grits direction as a blocked, recipe-specific finding. The current recipe's water/milk conflict and missing product crosswalk prevent an executable adjustment; no grade mapping or active rule was added.
- R855 added identity-only Kellogg's Corn Flake Crumbs / Chapelure Kellogg's Corn Flake Crumbs and a bilingual, exact-GTIN 1/3 cup (30 g) manufacturer-label serving. The product remains separate from generic corn flakes and breadcrumbs.
- R856 recorded two historical CNF 2015 Food Code 3049 portions for wild, raw Atlantic salmon: 1/2 fillet = 198.0 g and one food-guide serving = 90.0 g. The 65% refuse remains context; no whole-fish mass, yield, or generic fillet conversion was inferred, and CNF 2026 continuity is unverified.
- Static catalog, ledger/schema, source-ID/URL, generated-index, picker, recipe-corpus, encoding, local-link, and scoped-whitespace checks passed. No software tests, build, emulator, or deployment were run under the database-JSON-only rule in `AGENTS.md`.
- See the [R854](proposals/wp02-section-a7-next-gap-review-r854-20261019.md), [R855](proposals/wp03-section-f-next-gap-review-r855-20261019.md), and [R856](proposals/wp04-section-p-next-gap-review-r856-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r854-r856-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R857–R859 — Khorasan semolina, roasted buckwheat, walleye

- R857 kept InGrain Pastificio's Khorasan-grain-to-durum-semolina statement as an unallocated lead. It does not identify a Khorasan-semolina product, grade, amount, or process crosswalk, so the semolina substitution state remains `not_yet_researched` and no source or finding is added to that ledger row.
- R858 added `sarrasin grillé` as one French alias on the existing roasted, dry buckwheat-groats reference and recorded the Québec product/recipe sources on the target row. The same sources show that local usage also calls dry groats `kasha`, while OQLF defines `kacha/kasha` as a cooked gruel; the separate candidate now records that ambiguity and remains unresolved. The 40 g / 1/4 tasse topping amount stays recipe-specific.
- R859 recorded CNF 2015 Food Code 3202 raw walleye portions of 1 fillet = 159.0 g and 1 food-guide serving = 90.0 g on the Walleye reference ledger row. The separate 65% refuse remains context; no value transfers to the whole-fish form, and CNF 2026 continuity remains unverified.
- The canonical package has 1,891 references and 201 forms; the manifest has 114 recipes / 1,123 ingredient rows. The ledger has 2,299 records, 10,853 source entries, 9,118 distinct source IDs, 7,751 unique source URLs, 891 measurement observations, and 370 substitution findings.
- Package/schema validation, generated-index freshness, scoped source/ID/observation checks, picker projections, recipe scan, UTF-8/no-BOM, local links/plan anchors, and scoped whitespace checks passed. No software tests, app build, emulator run, or deployment were performed; the application data changes only add bundled database JSON under `AGENTS.md`.
- See the [R857](proposals/wp02-section-a7-next-gap-review-r857-20261019.md), [R858](proposals/wp03-section-f-quebec-buckwheat-groats-display-review-r858-20261019.md), and [R859](proposals/wp04-section-p-next-gap-review-r859-20261019.md) proposals and the [integration README](batches/wp02-wp03-wp04-r857-r859-gap-review-integration-20261019/README.md). Sections A7, F, and P remain open.

## 2026-10-19 catalog scope review — generic ingredient diversity

- Remaining catalog work across all ingredient types targets generic culinary ingredients. Additional brand-specific products, product lines, flavor families, and retailer-specific variants are out of scope because commercial-product roster coverage is not ingredient diversity.
- The three agents assigned to R857–R859 had completed their work. The active plan review found no explicit open checklist task solely for another branded product roster; broad source and measurement rules that mention manufacturers or brands remain general evidence guidance. The open Section F regional cereal-mix/preprocessed-grain parent remains open for generic ingredient gaps.
- Existing branded references remain intact. Their product-specific measurements stay scoped to the named product, and no evidence is transferred to a generic category without a separate transferability review. Manufacturer pages may support generic ingredient identity when the evidence applies beyond the named product.
- See the [scope review README](batches/generic-ingredient-scope-review-20261019/README.md) and the scope decisions in [plan Section 01](../RecipeBook-global-ingredient-catalog-plan.txt).

## 2026-10-19 WP02 R860 — generic egg wash identity

- Added identity-only `egg wash / dorure à l'œuf` and linked bundled recipe 072#13. OQLF distinguishes egg-based `dorure à l'œuf` from other kinds of `dorure`; King Arthur Baking documents conventional egg wash separately from plant-based alternatives.
- The recipe provides neither composition nor quantity. The example egg-to-water ratio on the culinary source remains source-specific; no aliases, forms, reusable portions, density, mapping, conversion, yield, or substitution was added.
- The bundled reference and recipe data changed as JSON, with the ledger record documenting identity evidence only. The seed package remained normalized and passed validation; the generated import catalog is current at 1,892 references, and the ledger schema passes at 2,300 records. Scoped source ownership, recipe linkage, encoding, and plan-link checks passed; no application tests, build, emulator run, or deployment were needed under the JSON-only rule in `AGENTS.md`.
- See the [R860 proposal](proposals/wp02-generic-egg-wash-identity-review-r860-20261019.md) and [integration README](batches/wp02-generic-egg-wash-identity-integration-r860-20261019/README.md). The plan's egg checklist and the generic-ingredient scope review were updated.

## 2026-10-19 WP02/WP03/WP04 R861–R863 — generic flour, leafy green, and fish identities

- R861 added identity-only generic `potato flakes / flocons de pommes de terre`, distinct from potato flour, potato starch, potato granules, whole potato, and `papa seca`. The manufacturer source supports the generic processing class; no product measurements or industrial performance claims were generalized. The 1982 OQLF entry remains an explicit terminology-age limitation.
- R862 added identity-only `common purslane / pourpier commun` for *Portulaca oleracea*, with only `purslane / pourpier` as aliases. It remains separate from waterleaf, parsley, other *Portulaca* species, and the `pursley` collision risk. No foraging guarantee or recipe amount was added.
- R863 added identity-only `witch flounder / plie grise` for *Glyptocephalus cynoglossus*, without aliases. It remains separate from multi-species flounder and sole market groups. The DFO French profile was inaccessible; the OQLF source supplies the Québec French term.
- The cross-category queue recheck found no open brand-roster task. Section K's Broccolini mention is a pre-existing trademark alias exclusion, not a task. Existing branded rows and product-specific evidence remain intact; product measurements were not transferred.
- Static package/schema validation, generated-index freshness, source and identity ownership, picker projection, recipe-corpus scan, encoding, links/anchors, and scoped whitespace checks are recorded in the [R861–R863 integration README](batches/wp02-wp03-wp04-r861-r863-generic-identity-integration-20261019/README.md). No software tests, build, emulator, or deployment were run for these database-JSON additions under `AGENTS.md`.
- See the [R861](proposals/wp02-generic-flour-starch-diversity-review-r861-20261019.md), [R862](proposals/wp03-generic-produce-herb-diversity-review-r862-20261019.md), and [R863](proposals/wp04-generic-seafood-diversity-review-r863-20261019.md) proposals. Sections B2, K, and P remain open.

## 2026-10-19 WP02/WP03/WP04 R864–R866 — barley-meal hold, tomato pulp, and snapper market group

- R864 reviewed the existing generic barley-meal candidate and kept it unresolved. The current Statistics Canada questionnaire page could not be opened directly, and the accessible French classification's illustrative examples do not establish a consumer boundary or Québec French label. No source or decision was added from the inaccessible questionnaire; the candidate's existing product-specific evidence remains unchanged.
- R865 added identity-only generic `tomato pulp / pulpe de tomates`, supported by OQLF's Québec French/English term pair and CFIA's separate tomato-pulp product standard. It remains distinct from purée, passata, paste, sauce, juice, and canned tomato cuts. CFIA solids and specific-gravity criteria are product-class requirements, not kitchen measures or reusable densities. No aliases, forms, recipe links, conversions, yields, or substitutions were added.
- R866 added identity-only `snapper (name used for multiple fish species) / vivaneau (nom utilisé pour plusieurs espèces de poissons)` as a species-neutral market-name group. CFIA's Fish List applies the paired broad terms to multiple taxa. The visible qualifier keeps the group from implying a single taxon; red, gray, and yellowtail snapper and their qualified French labels remain outside its aliases. No forms, measures, recipe links, conversions, yields, or substitutions were added.
- Existing product references and product-scoped evidence were preserved; no brand roster was researched or expanded. Package validation and normalization, generated-index freshness, ledger-schema validation, source/reference ownership, corpus, encoding, local links, and scoped whitespace checks are recorded in the [R864–R866 integration README](batches/wp02-wp03-wp04-r864-r866-generic-identity-integration-20261019/README.md). No software tests, build, emulator, or deployment were run for the database-JSON addition under `AGENTS.md`.
- See the [R864](proposals/wp02-generic-grain-meal-diversity-review-r864-20261019.md), [R865](proposals/wp03-generic-tomato-preparation-diversity-review-r865-20261019.md), and [R866](proposals/wp04-generic-seafood-species-diversity-review-r866-20261019.md) proposals. Sections A7, L, and P remain open.

## 2026-10-19 WP02 Section A7 R867 — sorghum bran identity

- Added identity-only generic `sorghum bran / son de sorgho` as a grain milling fraction. FAO AGROVOC attests the French source-product term; FAO processing material documents variable bran fractions; CFIA supports naming the grain; and a 2024 primary study documents one sorghum-bran sample used in steamed bread.
- The study sample, formula, amounts, and performance claims remain study-specific. The source-specific manufacturer milling offer was excluded from generic claims. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added.
- OQLF supports `son` as a French base noun but does not establish `son de sorgho` as a Québec-preferred food compound; its broader note also discusses feed by-products. The French display remains provisional pending independent Québec review.
- Existing generic and branded rows and product-scoped evidence were preserved. The reviewed A7/B2 queue had no brand-only child assignment.
- Package and ledger schema checks, normalization, generated-index freshness, ownership, recipe corpus, encoding, links/anchors, and scoped whitespace are recorded in the [R867 integration README](batches/wp02-a7-sorghum-bran-identity-integration-r867-20261019/README.md). No software tests, build, emulator, or deployment were run because the change only adds database JSON data under `AGENTS.md`.

## 2026-10-19 WP03 Section K R868 — celtuce identity

- Added identity-only generic `celtuce / laitue asperge` as a distinct lettuce crop chiefly used for its thick edible stem. OQLF supplies the preferred Québec French term and English names; OMAFRA and UC Davis support the crop boundary and culinary use.
- Kept celery, asparagus, and ordinary lettuce separate. Retained the source-attested `asparagus lettuce` and `stem lettuce` aliases and documented the broad-query overlap. Historical cross and varietal-name claims were not adopted as catalog taxonomy.
- No forms, measurements, recipe links, conversions, yields, or substitutions were added; measurement and substitution research remain `not_yet_researched`. No bundled recipe demand was found.
- Existing entries and product-scoped evidence were preserved. The cross-category queue review found no open brand-roster task; remaining R867, R869, and R870 assignments are generic milling, seafood, and produce gaps. Additional brand, product-line, flavor, and retailer-variant rosters remain out of scope across all ingredient types.
- Package and ledger schema checks, normalization, generated-index freshness, ownership, picker projection, recipe corpus, encoding, links/anchors, and scoped whitespace are recorded in the [R868 integration README](batches/wp03-section-k-celtuce-identity-integration-r868-20261019/README.md). No software tests, build, emulator, or deployment were run because the change only adds database JSON data under `AGENTS.md`.


## 2026-10-19 WP03/WP04 R869–R870 — generic mackerel group and chive blossoms

- Added identity-only `mackerel (name used for multiple fish species) / maquereau (nom utilisé pour plusieurs espèces de poissons)` for the exact paired Canadian CFIA label across multiple taxa. Kept the visible qualifier; the market-name group is not a taxon or interchangeability claim. Existing species-qualified, canned, and smoked mackerel rows remain separate.
- Added identity-only `chive blossoms / fleurs de ciboulette` for the edible flowers of correctly identified, food-grown *Allium schoenoprasum*. Kept garlic-chive flowers, other *Allium* species, the base chives row, and Chinese chives distinct. The source recipe quantity remains recipe-specific and was not generalized.
- Added no forms, measurements, recipe links, conversions, yields, or substitutions. Existing branded entries and product-specific evidence were preserved. The cross-category audit found no open brand-roster-only task; further brand, product-line, flavor, and retailer-variant roster expansion remains out of scope because commercial-product counts do not add ingredient diversity.
- Package/ledger schemas, normalization, generated index, source ownership, picker boundaries, recipe corpus, encoding, links/anchors, and scoped whitespace are recorded in the [R869–R870 integration README](batches/wp03-wp04-r869-r870-generic-identity-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because these changes only add database JSON data under `AGENTS.md`.


## 2026-10-19 WP02 Section A7 R872 — triticale bran

- Added identity-only generic `triticale bran / son de triticale` as a distinct edible cereal milling fraction. Primary milling and food studies support separate triticale-bran fractions and use in yogurt/bread research; those source-specific fractions, formulas, inclusion amounts, and findings remain scoped to their studies.
- OQLF supports `triticale` and the base term `son`, but not the compound `son de triticale` as a Québec-preferred food name. Keep the French display provisional pending independent review. CFIA supports qualifying non-wheat bran by grain in English.
- Kept triticale grain, flour, flakes, the unresolved meal candidate, and bran from other grains separate. Added no aliases, forms, measures, recipe links, conversions, yields, or substitutions. Existing branded rows and product-scoped evidence remain unchanged; no brand-only A7 task was found.
- Package/ledger schemas, normalization, generated index, source ownership, picker boundaries, recipe corpus, encoding, links/anchors, and scoped whitespace are recorded in the [R872 integration README](batches/wp02-a7-triticale-bran-identity-integration-r872-20261019/README.md). No software tests, build, emulator, or deployment were run because this change only adds database JSON under `AGENTS.md`.


## 2026-10-19 WP03/WP04 R871 and R873 — generic oyster name group and garden orach

- Promoted the held `ingredient-ref-fresh-oyster` candidate in place to a qualified, species-neutral `oyster / huître` market-name group. The qualifier makes the broad scope visible; it does not select a taxon or imply culinary, preparation, yield, measurement, safety, or substitution equivalence. Existing oyster species, dried oyster, sauces, mushrooms, and prior hold decisions remain intact.
- Added identity-only `garden orach / arroche des jardins` for the leafy culinary use of *Atriplex hortensis*. Kept other *Atriplex* species and spinach distinct. The OQLF entry is from 1990; the 2023 Québec Gazette crosswalk corroborates the crop name but does not establish retail availability.
- Added no forms, measurements, recipe links, conversions, yields, or substitutions. No product-specific amount or claim was transferred to a generic category.
- The cross-category queue review found no open task whose sole purpose is expanding a brand/product roster. Future brand, product-line, flavor, and retailer-variant rosters remain out of scope because product counts do not add ingredient diversity; existing branded rows and evidence remain preserved.
- Package and ledger schema validation, normalization, generated-index freshness, ownership, picker boundaries, recipe scan, encoding, links/anchors, and scoped whitespace are recorded in the [R871/R873 integration README](batches/wp03-wp04-r871-r873-generic-identity-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because this change only adds database JSON data under `AGENTS.md`.


## 2026-10-19 WP03 Section K R874 — borage flowers

- Added identity-only `borage flowers / fleurs de bourrache` for the edible floral part of positively identified, food-grown *Borago officinalis*. The Québec source says to detach the flowers from the hairy calyx and achenes; no whole-plant, leaf, seed, or oil alias was added.
- OQLF supplies the base plant-name pair but does not standardize the flower-part compound. The Québec French phrase is attested in a MAPAQ-supported production guide. Colorado State and Alaska Cooperative Extension sources also document edible culinary uses and sourcing/identification limits.
- The Québec guide (2009 edition) reports pyrrolizidines in aerial parts and cites animal toxicity; that dated statement remains scoped to the source. No human safety threshold, daily amount, or serving measure was inferred. Recipe-specific flower uses and any amounts remain source-scoped.
- No forms, measurements, recipe links, conversions, yields, or substitutions were added. The cross-category scope review found no brand-roster-only task; further commercial brand/product-line/flavor/retailer rosters remain out of scope because they do not add ingredient diversity.
- Package and ledger schema validation, normalization, generated-index freshness, ownership, picker boundaries, recipe scan, encoding, links/anchors, and scoped whitespace are recorded in the [R874 integration README](batches/wp03-section-k-borage-flowers-identity-integration-r874-20261019/README.md). No software tests, build, emulator, or deployment were run because this change adds database JSON data under `AGENTS.md`.

## 2026-10-19 WP02/WP03/WP04 R881–R883 — proso millet bran, chayote shoots, mussel name group

- Added identity-only generic `proso millet bran / son de millet commun` for the bran fraction of *Panicum miliaceum*, with `common millet bran` as its English search alias. OQLF's crop crosswalk, Canadian source-grain naming guidance, and two primary food studies support the scoped identity. The exact French compound remains provisional; fractions, amounts, formulas, and results remain study-specific.
- Added identity-only generic `chayote shoots / pousses de chayotte` for tender culinary shoots of *Sechium edule*. The French compound is descriptive and provisional. The fruit, mature leaves, root, vine, and non-food uses remain separate.
- Promoted the existing `ingredient-ref-mussel` candidate in place to the visibly qualified `mussel (name used for multiple mussel species) / moule (nom utilisé pour plusieurs espèces de moules)` label-name group. Retained the candidate's earlier unresolved decisions and every species and prepared-product row. CFIA name overlap is not treated as taxonomic or culinary equivalence; the Québec bare display `moule` stays attached to *Mytilus edulis*.
- Additional Anson Mills named-product-only wheat-meal research remains out of scope under the R875 disposition because another commercial item does not add ingredient diversity. Preserved R605 history and the unresolved generic wheat-meal review. Existing branded references and product-scoped measurements remain unchanged.
- No forms, measurements, recipe links, conversions, yields, or substitutions were added. Data package validation, ledger schema/source checks, generated-index freshness, picker projections, recipe scans, encoding, links, and scoped whitespace checks are recorded in the [R881–R883 integration README](batches/wp02-wp03-wp04-r881-r883-generic-gap-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the catalog changes add database JSON under `AGENTS.md`.


## 2026-10-19 WP02/WP03/WP04 R884–R886 — buckwheat bran, ivy gourd fruit, eel name group

- Added identity-only generic `buckwheat bran / son de sarrasin` as a common-buckwheat milling fraction. The French compound remains provisional. Primary studies support the fraction and human-food use; study-specific milling streams, samples, quantities, formulas, and results remain source-scoped. Tartary-buckwheat bran flour stays separate.
- Added identity-only `ivy gourd fruit / fruit de courge lierre (Coccinia grandis)` for young green fruits used as a vegetable. Keep the French display provisional because `courge lierre` is attested here in a Health Canada NHP ingredient table, not a Québec culinary-market source. Leaves/shoots and ripe fruit stay separate.
- Promoted the held eel-boundary candidate in place to a qualified name group for CFIA’s repeated `Eel / Anguille` label on *Anguilla dieffenbachii*, *A. japonica*, and *A. rostrata*. Preserved the earlier unresolved decision, the OQLF-backed bare `anguille` on American eel, separate smoked eel and species rows, and all product-specific evidence. The new group is not a taxon or culinary-equivalence claim.
- No forms, measurements, conversions, yields, recipe links, or substitutions were added. Measurement and substitution research remain open for the two new identities. No brand or product roster was pursued. Further Anson Mills named-product-only research remains out of scope because commercial-product counts do not add ingredient diversity; R605 history and existing entries remain intact.
- Static package/ledger validation, normalizer checks, generated-index freshness, source/reference ownership, picker projections, corpus scan, encoding, links/anchors, and scoped whitespace are recorded in the [R884–R886 integration README](batches/wp02-wp03-wp04-r884-r886-generic-gap-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the database changes only add JSON data under `AGENTS.md`.


## 2026-10-19 WP02/WP03/WP04 R887–R889 — spelt bran, coriander roots, shrimp name group

- R887 added identity-only generic `spelt bran / son d’épeautre` as a distinct grain milling fraction. The Québec directory supports generic milling wording and culinary uses; its named-product claims and package are excluded, and study-specific fractions remain scoped.
- R888 added identity-only `coriander roots / racines de coriandre` for culinary roots of *Coriandrum sativum*. Keep leaves, seeds, stems, Vietnamese coriander, and culantro separate; the Québec recipe’s amount and preparation remain recipe-specific.
- R889 added a visibly qualified generic shrimp/crevette label-name group for the repeated CFIA pair across multiple taxa. It is not a taxon or a culinary-equivalence claim. Preserve species-specific and prepared-product rows and the earlier fresh-shrimp/prawn hold; `prawn` remains unassigned.
- Reconfirmed the cross-category scope: no brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific evidence remain preserved and scoped.
- Static package/ledger validation, generated-index freshness, source/reference ownership, picker projection, recipe-corpus scan, encoding, local links/anchors, and scoped whitespace are recorded in the [R887–R889 integration README](batches/wp02-wp03-wp04-r887-r889-generic-gap-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because these additions only add database JSON data under `AGENTS.md`.

## 2026-10-19 WP02/WP03/WP04 R890–R892 — foxtail millet bran, black elderflowers, clam name group

- R890 added identity-only generic `foxtail millet bran / son de millet d'Italie`. The French compound remains provisional; study samples, mixed bran-rich fraction, processing, particle sizes, amounts, and results remain study-specific.
- R891 added identity-only generic `black elderflowers / fleurs de sureau noir` for the culinary flowers of *Sambucus nigra*. The Québec French compound is descriptive, the local recipe is not species-identified, and its quantity and method remain recipe-specific.
- R892 promoted the existing `ingredient-ref-clam` candidate in place to a visibly qualified group for the repeated CFIA `Clam / Palourde` label pair. The old unresolved decision and species holds remain; CFIA wording does not define a taxon or culinary equivalence.
- Reconfirmed cross-category scope. No brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued. The two open Section F roster references remain out of scope because commercial-product counts do not add ingredient diversity; generic cereal diversity remains open. Existing branded rows and product-scoped evidence were preserved, and no product-specific claim was generalized.
- No forms, reusable measures, conversions, yields, recipe links, or substitutions were added. Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe scan, encoding, local links/anchors, and whitespace are recorded in the [R890–R892 integration README](batches/wp02-wp03-wp04-r890-r892-generic-gap-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the database additions only add JSON under `AGENTS.md`.

## 2026-10-19 WP02/WP03/WP04 R893–R895 — finger-millet bran, dill flower heads, abalone name group

- Added identity-only generic `finger millet bran / son d’éleusine cultivée` for the edible *Eleusine coracana* seed-coat fraction. The French compound remains provisional. Study fractions, extraction methods, amounts, formulas, composition, and results remain study-specific.
- Added identity-only `dill flower heads / ombelles d’aneth` for the whole green/flexible umbel of *Anethum graveolens* used in pickling. Keep foliage, mature seeds, preserved foods, and recipe quantities separate. The French compound remains descriptive and provisional.
- Added a separate visibly qualified label-name group for the repeated CFIA `Abalone / Ormeau` wording across multiple *Haliotis* taxa. Preserved the existing broad candidate and its unresolved decision, protected Northern Abalone boundary, and all source-scoped product evidence. Supplier-specific evidence was not transferred. The group is not a taxon or culinary-equivalence claim.
- The cross-category queue review found no new assignment limited to a named brand or retailer variant. The two open Section F commercial-roster clauses remain out of scope because commercial-product counts do not add ingredient diversity; generic cereal coverage remains open. Existing branded rows and product-scoped amounts were preserved.
- No forms, reusable measurements, mappings, conversions, yields, recipe links, or substitutions were added. Package and reference normalization, generated-index freshness, ledger validation, ownership, picker projection, recipe scan, and scoped documentation checks are recorded in the [R893–R895 integration README](batches/wp02-wp03-wp04-r893-r895-generic-ingredient-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the active data additions only change ingredient-catalog JSON under `AGENTS.md`.

## 2026-10-19 WP02/WP03/WP04 R896–R898 — pearl-millet bran, kohlrabi leaves, sea-cucumber name group

- R896 added identity-only generic `pearl millet bran / son de millet perle`, with the French compound provisional. Root review verified the two primary study sources and reused the OQLF crop-name source; the CFTRI PDF could not be loaded and was excluded from the ledger.
- R897 added identity-only `kohlrabi leaves / feuilles de chou-rave`, with only part-qualified aliases. OQLF supports the base crop/taxon, while the Québec culinary and university extension sources support leaf use; comparison and storage claims remain source-scoped.
- R898 added a separate qualified sea-cucumber / concombre de mer shared-name group for the exact bilingual label pair applied to multiple species. The held `candidate-sea-cucumber` ledger record, its prior decision, all 13 sources, and the two species references plus orange-footed form were left unchanged. Only the generic OQLF name source was reused; species/product evidence was not transferred. The group is not a taxon, edible-part identity, retail label authorization, or culinary-equivalence claim.
- The cross-category queue audit found no open roster-only assignment. The two Section F commercial-roster clauses remain out of scope because commercial-product counts do not add ingredient diversity; generic cereal work remains open. Existing branded entries and product-specific evidence remain intact.
- Static seed/reference normalization, package and ledger validation, generated-index freshness, source ownership, picker projection, recipe scan, encoding, links, and whitespace are recorded in the [R896–R898 integration README](batches/wp02-wp03-wp04-r896-r898-generic-ingredient-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the active changes only add database JSON under `AGENTS.md`.

## 2026-10-19 WP02/WP03/WP04 R899–R901 — amaranth bran, fennel fronds, tilapia name group

- R899 added identity-only generic `amaranth bran / son d’amarante`. The French compound remains provisional; the OQLF sources support only the crop and milling base terms. Experimental milling and snack fractions, measures, formulations, and outcomes remain study-specific.
- R900 added identity-only fresh `fennel fronds / frondes de fenouil` as a `HERB`, with only part-qualified leaf aliases. The existing fennel bulb and seed identities remain unchanged. Extension evidence supports fresh leaf use; garnish amounts, storage and drying notes stay source-scoped.
- R901 added a separate, visibly qualified tilapia name group for the exact CFIA `Tilapia / Tilapia` common-name pair used for multiple fish species. Root review recorded the indexed query as `R901-S01`; no species membership, culinary equivalence, product state, or label authorization is inferred. Existing tilapia fillet/whole identities and the held Nile candidate remain unchanged.
- Cross-category scope remains generic-only. No brand, product-line, flavour-family, SKU, or retailer roster was researched or added. The historical Anson Mills wheat-meal product-only lead remains out of scope because commercial-product counts do not add ingredient diversity; its existing records remain preserved.
- Package/reference normalization, ledger validation, generated-index freshness, source ownership, static picker projections, recipe scan, encoding, links, and whitespace are recorded in the [R899–R901 integration README](batches/wp02-wp03-wp04-r899-r901-generic-ingredient-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the active ingredient additions only add database JSON under `AGENTS.md`.



## 2026-10-19 WP02/WP03/WP04 R902–R904 — quinoa bran hold, grape leaves, conch name group

- R902 reviewed generic quinoa bran as a distinct milling fraction. Research and bread studies support its identity and experimental food use, but the available evidence does not establish the processing state and food-use boundary for a generic recipe-picker entry. Quinoa-bran saponin measurements, milling fractions, processing, and bread results remain study-specific; no household removal procedure or category-wide safety claim is inferred. Keep this generic gap on hold until transferable processing evidence is available.
- R903 added identity-only `grape leaves / feuilles de vigne` for culinary leaves of *Vitis vinifera*, with singular part-qualified aliases only. OQLF supports Québec wording and cooked-wrapper context; UIC supports the edible leaf identity and wrapper use. RICARDO was not used as ledger evidence because direct access failed. Keep leaf identities separate from fruit, juice, seed, oil, verjuice, and other wrapper leaves.
- No brand, product-line, flavour, SKU, or retailer roster was researched. Commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific evidence remain intact; no measurements or claims were transferred.
- R904 added a visibly qualified generic `Conch / Conque` name group for the exact current CFIA pair on *Lobatus gigas* and *Strombus* spp. It is a label-name group, not a taxon, species assignment, product specification, or culinary-equivalence claim. The earlier `candidate-conch`, all 13 of its sources, its unresolved decision, and every product-specific observation remain unchanged. The bundle has no matching recipe demand.
- Static package/ledger validation, generated-index freshness, ownership, picker projection, recipe scan, encoding, local links/anchors, and scoped whitespace are recorded in the [R902–R904 integration README](batches/wp02-wp03-wp04-r902-r904-generic-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the active additions only add database JSON under `AGENTS.md`; R902 changed documentation only.


## 2026-10-19 WP03 Section K R905 — Good King Henry

- Added identity-only generic `Good King Henry / ansérine Bon-Henri` for the leafy culinary use of *Blitum bonus-henricus*, reconciling OQLF's *Chenopodium bonus-henricus* with Kew's current accepted name and RHS culinary evidence. The shared `wild spinach` term stays out of aliases because OQLF applies it to multiple *Chenopodium* species.
- Li and Savage's oxalate measurements and boiling result remain scoped to their study samples and method. No general intake, safety, composition, or cooking rule was inferred. No forms, measurements, recipe links, conversions, yields, or substitutions were added.
- The cross-category queue scan found no brand-roster-only assignment beyond the two Section F commercial-roster clauses and the previously dispositioned Anson Mills lead; those remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific evidence remain unchanged.
- Static package/ledger validation, generated-index freshness, source ownership, picker projection, recipe scan, encoding, local links/anchors, and scoped whitespace are recorded in the [R905 integration README](batches/wp03-section-k-good-king-henry-identity-integration-r905-20261019/README.md). No software tests, build, emulator, or deployment were run because the active data addition only changes database JSON under `AGENTS.md`.

## 2026-10-19 WP04 R906 — fish heads

- Added identity-only generic `fish heads / têtes de poisson`, separate from fish bones/frames, fish stock, named fish species, and formed seafood products.
- The Northwest Territories guide’s 75 g cooked-whitefish-head amount remains a published reference portion for that item only. Metro’s `1 fish head and bones` remains a composite amount in its four-cup stock recipe; no standalone or general measure was inferred.
- The cross-category queue scan found no new roster-only assignment. The two Section F commercial-roster clauses and further research on the named Anson Mills wheat-meal product remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-scoped evidence remain intact.
- Package/reference normalization, ledger validation, generated-index freshness, picker projection, recipe scan, encoding, links, and whitespace are recorded in the [R906 integration README](batches/wp04-generic-fish-heads-identity-integration-r906-20261019/README.md). No software tests, build, emulator, or deployment were run because the active addition only adds database JSON under `AGENTS.md`.

## 2026-10-19 WP02 R907 — whole canary-seed meal

- Added identity-only `whole canary seed meal / gruau complet d’alpiste des Canaries` for dehulled, glabrous brown or yellow *Phalaris canariensis* intended for human food. Health Canada distinguishes whole meal from groats and whole-grain flour; the French display is descriptive and provisional for Québec.
- Preserved the existing flour and groats identities. The flour's study density and formula-specific trial findings, Health Canada's prototype percentages, and its wheat-allergy caution remain source-scoped; no evidence was transferred to the new meal row.
- Added no aliases, forms, measures, recipe links, conversions, yields, or substitutions. Measurement and substitution research remain open. The recipe corpus contains no matching demand.
- No roster-only work was pursued. Across all ingredient types, commercial brand/product-line/flavour/SKU/retailer rosters remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific values remain intact.
- Package/reference normalization, ledger validation, generated-index freshness, source ownership, picker projection, recipe scan, encoding, local links, and scoped whitespace are recorded in the [R907 integration README](batches/wp02-generic-canary-seed-whole-meal-integration-r907-20261019/README.md). No software tests, build, emulator, or deployment were run because the active data addition only changes database JSON under `AGENTS.md`.

## 2026-10-19 WP04 R909 — freshwater crayfish tails

- Added identity-only `freshwater crayfish tails / queues d’écrevisses d’eau douce` as a generic `PROTEIN` cut identity separate from whole freshwater crayfish. The OQLF fisheries entry defines a crustacean tail as the abdominal portion and includes écrevisse; Metro’s bilingual guides support the culinary use of the tail.
- Kept species, shelling, cooking, and preservation states unresolved. Retained only freshwater-qualified singular aliases; left `crawfish` and `crawdads` out because the English terms also overlap with langouste in Québec usage.
- Added no forms, measurements, mappings, conversions, yields, recipe links, or substitutions. The bundled corpus has no crayfish-tail demand. Existing whole-crayfish and other crustacean rows and evidence remain unchanged.
- No commercial roster was researched. Across all ingredient types, brand/product-line/flavour/SKU/retailer-variant-only work remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific evidence remain intact.
- Package/reference normalization, ledger validation, generated-index freshness, source ownership, picker projection, recipe scan, encoding, local links, and scoped whitespace are recorded in the [R909 integration README](batches/wp04-generic-crayfish-tail-identity-integration-r909-20261019/README.md). No software tests, build, emulator, or deployment were run because the active addition only changes database JSON under `AGENTS.md`.

## 2026-10-19 WP03 Section K R908 — radish leaves

- Added generic `radish leaves / fanes de radis` as a distinct edible plant-part identity, separate from radish root, daikon, and the existing greens. Added the source-attested frozen form with no density or fresh/frozen conversion.
- Recorded Le Québec cuisine’s 100 g amount only for the complete eight-portion `Soupe aux feuilles` formula. No per-serving amount, household measure, or bundled recipe link was added.
- The Kitchn supports radish greens in place of Swiss chard or mustard greens in a named sautéed dish. This is recorded as contextual ledger evidence only; there is no active or global substitution rule, quantity, or adjustment.
- The cross-category review found no brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task to pursue. Commercial rosters remain out of scope because product counts do not add ingredient diversity; existing branded rows and scoped evidence remain intact.
- Static catalog/package/ledger validation, source ownership, picker phrases, recipe corpus, encoding, links, and whitespace are recorded in the [R908 integration README](batches/wp03-r908-radish-leaves-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because this change only adds ingredient database JSON under `AGENTS.md`.

## 2026-10-19 WP03 Sections L/M/N R910–R912 — generic produce and mushroom gaps

- R910 added the generic maturity form `unripe green tomatoes / tomates vertes non mûres` under the existing tomato reference. Mature green cultivars remain ambiguous and are not included by the qualified match terms; the existing green-tomato-ketchup identity stays separate. USDA NDB 11527 portions and Télé-Québec's 20-tomato ketchup count remain source-scoped and were not transferred. No active measure, mapping, conversion, yield, recipe link, or substitution was added.
- R911 promoted the exact reviewed legacy ID `ingredient-ref-avocado` to generic `avocado / avocat` in `FRUIT`. It remains separate from avocado oil and the held seed-flour candidate. The eight CNF 1511 portions remain tied to the source food code and exact puree/cube/slice or fruit-count descriptions; the 100 g edible-portion basis and 26% seeds-and-skin refuse were not converted into general values. Density and unit mappings remain empty.
- R912 added one identity-only black-trumpet reference scoped in its evidence to Québec/eastern North American *Craterellus fallax*. The English/French display pairing is a cross-source inference through the shared species; ambiguous names remain excluded. No form, measure, recipe link, conversion, yield, or substitution was added.
- The queue review found no new roster-only task. Commercial brand, product-line, flavour-family, SKU, and retailer-variant expansion remains out of scope because commercial-product counts do not add ingredient diversity; existing branded rows and product-only evidence remain unchanged.
- Package, schema, source ownership, observation IDs, generated-index, picker phrases, recipe corpus, encoding, links, and scoped whitespace checks are recorded in the [R910–R912 integration README](batches/wp03-r910-r912-generic-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the active changes add ingredient database JSON under `AGENTS.md`.


## 2026-10-19 WP03 R913–R916 generic boundary integration

- R913 held plantain maturity aliases/forms until an accepted recipe requires them; green color is not treated as a universal unripe synonym. R914 retained generic apple without a cooking form or alias because the Québec term `pomme à cuire` varies by cooking outcome and also has a separate seasonal market designation. R916 held new melon/cantaloupe identities and aliases because OQLF documents overlapping terms and the bundled recipes contain no matching line.
- Added one `dried mushrooms / champignons séchés` form under generic mushroom. Recorded the Télé-Québec recipe’s 14 g forest-blend sachet as one published portion observation with its recipe scope explicit. The recipe’s 250 mL water and 20-minute rehydration, and Health Canada’s 190 mL alternative to its named fresh mushrooms, remain source-scoped. No general measurement, density, conversion, yield, or substitution is active.
- Existing plantain flour/starch, apple, watermelon, winter-melon, bitter-melon, dried candy-cap, djon djon, and mushroom-seasoning records remain unchanged. The cross-category queue review found no new roster-only assignment; commercial product counts remain out of scope because they do not add ingredient diversity.
- Seed package and ledger static checks are documented in `batches/wp03-r913-r916-generic-boundary-integration-20261019/README.md`. No software tests were run because the only active catalog data change adds database JSON under `AGENTS.md`.

## 2026-10-19 WP03 Section M R917–R918 — cherry subtypes and dried citrus peel

- Added fresh `sweet cherries / cerises douces` and `sour cherries / cerises acides` as generic, identity-only `FRUIT` references bounded to the OQLF-defined species groups. Kept the unqualified cherry identity, pitted form, recipe 029 link, and dried-cherry identities unchanged.
- Expanded the existing Baking With Butter source locator to record its sweet/sour ingredient guidance. Its 460 g / 1 lb amount remains specific to the published recipe and was not transferred to either new identity.
- Added generic `dried citrus peel / écorce d’agrumes séchée` as an identity-only aromatic, separate from citrus zest, dried orange zest, and candied peel. The detailed mandarin example and the MSU pith-removal method remain source-scoped.
- The cross-category queue scan found no roster-only assignment. Brand, product-line, flavour-family, SKU, and retailer-variant roster work remains out of scope because commercial product counts do not add ingredient diversity. Existing branded references remain intact.
- No forms, reusable measures, recipe links, conversions, yields, or substitutions were added. Static checks and the no-test disposition are recorded in the [R917–R918 integration README](batches/wp03-r917-r918-generic-fruit-integration-20261019/README.md).

## 2026-10-19 WP05 R919 — generic chili crisp

- Added generic `chili crisp / huile pimentée croustillante` with the source-attested French alias `huile piquante et croustillante`. The generic identity describes an oil-bearing chili condiment with retained crunchy solids, separate from plain chili oil.
- Preserved the `Chiu Chow Style Chili Crisp Oil` row and its manufacturer evidence. No formula, product-specific ingredient list, measure, process, heat level, storage claim, or use was transferred.
- The bundle has no chili-crisp ingredient line. No form, reusable measure, recipe link, conversion, yield, or substitution was added.
- The cross-category scope remains generic-only; brand and commercial-variant rosters do not add ingredient diversity and were not researched. Existing branded rows remain intact. Static validation and the no-test disposition are recorded in the [R919 integration README](batches/wp05-r919-generic-chili-crisp-integration-20261019/README.md).

## 2026-10-19 WP03 R920 — generic citrus-juice boundary hold

- Held `citrus juice / jus d’agrumes` as a generic identity. Retain the existing species-specific lemon, lime, grapefruit, and orange juice references.
- The OQLF entry supports generic fruit-juice terminology but not a transferable citrus-only identity. CFIA standards name individual juices and define blends from named fruit components. The current corpus has no generic citrus-juice or citrus-blend request.
- No database entries, aliases, measures, forms, recipe links, conversions, yields, or substitutions changed. The SARI residual import category was not used as culinary-identity evidence.
- See the [R920 proposal](proposals/wp03-section-m-generic-citrus-juice-boundary-review-r920-20261019.md) and [hold README](batches/wp03-r920-citrus-juice-hold-integration-20261019/README.md). No tests were needed for this documentation-only disposition.

## 2026-10-19 WP03 Section J R921 — generic tiger nut

- Added identity-only `tiger nut / souchet comestible` for the edible tuber of *Cyperus esculentus*. Kept the whole tuber separate from the existing tigernut-flour identities, oil, beverage, and other preparations.
- TERMIUM supplies the bilingual food-industry definition and aliases; PROSEA and North Carolina State Extension support the species and edible-tuber scope. Preparation examples remain source-scoped.
- Added no forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions. The bundled corpus has no matching ingredient line.
- The cross-category queue scan found no new roster-only task. Brand, product-line, flavour, SKU, and retailer-variant rosters remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded entries and product-specific evidence remain intact.
- See the [R921 proposal](proposals/wp03-section-j-tiger-nut-identity-review-r921-20261019.md) and [integration README](batches/wp03-section-j-tiger-nut-identity-integration-r921-20261019/README.md). No software tests were run because the catalog addition only changes database JSON under `AGENTS.md`.


## 2026-10-19 WP02/WP03/WP04 R1018–R1020

- Added identity-only generic rice bran flour, scoped in evidence to primary baking studies without reusing their blend percentages or sample processing as general measures or substitutions.
- Added identity-only Blewitt mushroom / pied bleu for *Lepista nuda*. Extended the existing shared Health Canada source notes across all four current owners and preserved the regulatory crop-group scope.
- Added a visibly qualified turbot market-name group for the documented use of that name for multiple species. Existing European-turbot and Greenland-halibut identities and evidence remain separate.
- No brand or commercial roster was pursued. The Anson Mills product-only lead remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific measurements remain intact.
- Static data checks and no-test disposition are recorded in `batches/wp02-wp03-wp04-r1018-r1020-generic-gap-integration-20261019/README.md`.


## 2026-10-19 WP03 Section J R1021

- Added identity-only ramps / ail trilobé for *Allium tricoccum*, keeping the generic allium name boundary narrow and omitting overlapping common-name aliases.
- Preserved CNF green-onion and leek measures on their existing references. No forms, reusable measures, recipe links, conversions, yields, or substitutions were added.
- No commercial roster was pursued; commercial-product counts do not add ingredient diversity, and existing branded rows and source-scoped evidence remain intact.
- Static data checks and the no-test disposition are recorded in `batches/wp03-r1021-generic-ramps-integration-20261019/README.md`.


## 2026-10-19 WP02/WP03/WP04 R1022–R1024

- Added identity-only corn bran flour / farine de son de maïs and moringa pods / gousses de moringa. Keep the corn-bran milling samples and baking formulations source-scoped; keep moringa pod identity separate from the existing leaves row and retain leaf recipe measures on that owner.
- Maintained the existing unresolved sea-urchin gonads / uni candidate because its recorded activation condition still requires a bundled recipe or confirmed import; no active data changed for it.
- All assignments stayed on generic ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer roster was pursued. Existing branded entries and product-scoped claims and measures remain intact; the cereal rosters and named Anson Mills product lead remain out of scope because commercial-product counts do not add ingredient diversity.
- Final static checks and the no-test disposition are recorded in `batches/wp02-wp03-wp04-r1022-r1024-generic-gap-integration-20261019/README.md`.


## 2026-10-19 WP02/WP03/WP05 R1025–R1027

- Added identity-only generic oat bran flour / farine de son d’avoine as a bran-based milling ingredient named in noodle and muffin studies. Study formulas and outcomes remain source-scoped. OQLF supports the French base term `son d’avoine`, not the proposed compound as a standardized Québec display; aliases remain empty.
- Added species-bounded umbilicate hydnum / hydne ombiliqué for the culinary fruiting body of *Hydnum umbilicatum*. Keep *H. repandum*, generic mushroom, lion’s mane, and the generic dried-mushroom form separate. The cap dimensions and 2013 market price remain source-scoped, not kitchen measures.
- Added generic chonggak-kimchi as a named prepared-food type made with whole young radishes and leaves. The French display is a descriptive provisional construction. Preserve existing kimchi, radish, and pickle identities.
- No forms, reusable measures, recipe links, conversions, yields, or active substitutions were added. Existing branded entries and their product-specific evidence remain intact.
- Reconfirmed that brand-, product-line-, flavour-family-, SKU-, and retailer-variant-only roster work is out of scope across ingredient types because commercial-product counts do not add ingredient diversity. No such roster was pursued; product-specific evidence remains scoped pending a separate transferability review.
- See the [R1025–R1027 integration README](batches/wp02-wp03-wp05-r1025-r1027-generic-gap-integration-20261019/README.md).


## 2026-10-19 WP07 / WP08 R1064–R1066 — generic measurement and substitution evidence

- Added two source-qualified jackfruit-seed sample ranges without deriving a kitchen measure; the Matsumae-zuke composition code remains composition-only.
- Recorded an unquantified jackfruit-seed curry alternative as blocked and no supported replacement for finished Matsumae-zuke in the reviewed contexts.
- Recorded quick oats in the one-cup WSU meatloaf binder slot only. No active runtime rule, generic mass ratio, or unrelated recipe adjustment was added.
- No brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster work was pursued. Existing branded entries and product-scoped evidence remain intact across all ingredient types.
- See the [R1064–R1066 integration README](batches/wp07-wp08-r1064-r1066-measurement-substitution-integration-20261019/README.md). No software tests were run because this change only adds database JSON research data under `AGENTS.md`.


## 2026-10-19 WP08 R1069 — kale-to-spinach evidence

- Added two recipe-specific spinach options under the existing generic kale ledger record: one six-ounce casserole slot and one four-ounce strata greens slot. Kept the recipes’ amounts and methods separate; added no conversion, spinach form, recipe link, or active rule.
- No commercial products or rosters were researched. Existing branded rows and product-scoped evidence remain intact across ingredient types.
- See the [R1069 integration README](batches/wp08-r1069-kale-spinach-substitution-integration-20261019/README.md). No software tests were run because this update only adds database JSON research data under `AGENTS.md`.


## 2026-10-19 WP02/WP07/WP08 R1067–R1068 and R1072

- Added identity-only generic defatted barley bran, retaining its provisional French compound and keeping the primary study's defatting protocol, sample preparation, biscuit formulas, and outcomes source-specific.
- Closed the almond-extract measure review as bounded no-supported-value for accessible sources; CNF 2026 row-level data remains unchecked because the CSV download could not be opened. No catalog or ledger data changed for R1068.
- Recorded two vegetable-oil-to-canola choices in distinct named cake formulas. Each amount and method stays tied to its recipe; no active rule, general equivalence, or recipe change was added.
- The all-category queue review found no remaining unchecked commercial-only roster item. Section F cereal rosters, the named Anson Mills wheat-meal lead, and previously dispositioned Nu Life Market/Dempsey and Mochiko/Shiratamako tasks remain out of scope because commercial-product counts do not add ingredient diversity. Preserve existing branded references and review transferability before reusing product-specific information.
- See the [R1067/R1068/R1072 integration README](batches/wp02-wp07-wp08-r1067-r1068-r1072-generic-gap-integration-20261019/README.md).


## 2026-10-19 WP02/WP07/WP08 R1073–R1076

- Added generic defatted wheat bran from two human-food studies, keeping their extraction procedures and biscuit formulas study-specific.
- Recorded three SR28 almond portion observations for unroasted whole, sliced, and slivered almonds. Cup weights remain source-native and form-scoped; no density or unit conversion was activated. Existing almond-flour product evidence was preserved without transfer.
- Recorded a water option for beef broth only in Ricardo's *Classic Beef Chili*. The resolver cannot enforce the named-recipe boundary, so no active rule or recipe-line substitution link was added.
- Added generic pork dry rub and linked Recipe 036's existing line. Recipe 042's blend formula and source-specific yield and use rate remain scoped to that preparation; no generic measure was added.
- Reviewed the queued commercial-only items across categories. No additional unchecked roster-only task was found; the previously identified cereal and named-product leads remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific evidence remain intact.
- See the [R1073–R1076 integration README](batches/wp02-wp07-wp08-r1073-r1076-generic-gap-integration-20261019/README.md). No software tests were run because the app changes add database JSON data only, as allowed by `AGENTS.md`.
