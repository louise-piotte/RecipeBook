# WP02 Flour and Starch Identity Batch (Section 04 A–B)

## Packet record

- **Owner:** WP02 baking catalog researcher (`baking_flour_identity`)
- **Reviewers:** integration lead — pending; bilingual culinary terminology reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Dependencies:** WP01 identity/evidence contract; WP00 repository audit. Both are present in the plan. Final ID reservation, data merge, and runtime acceptance remain with the integration owner (WP10).
- **Scope:** identity and English/Québec French naming review for Global Category Checklist A (wheat flours, cereal flours, milling products) and B (alternative flours, starches, regional starch products). This is an identity-only research batch; it does not establish measurement or substitution evidence.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` (`main`); the plan is modified in the worktree and was read at SHA-256 `659924a458cde14c16d3e6a33a9980ae9f6611e4d317849479bf10b4ce0e8cbc`; current canonical reference snapshot `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` was read at SHA-256 `f5787aa24b5ec99130fa83ac78138ae06385702dd684b17b5840b6239729dd62`. The secondary whole-wheat ID cross-check used `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` at SHA-256 `2f252e7259238f0669b38bf2b24a5da67fd16c4419f20e7f4bcd0287202b94e3`. The 114 recipe JSON files under `app/src/main/assets/seed/bundled-library/recipes` have a combined SHA-256 fingerprint `76c0c1f78887269b43b5a585667be536a34c2b227548e34f7edc0717d8e3ca18`, computed over sorted relative filename, NUL, file bytes, NUL for each file. The seed reference and recipe files are modified in the shared worktree; this packet reflects these working-tree snapshots, not the committed baseline. Recipe-line counts below were recalculated from the fingerprinted recipe snapshot.
- **Input state caveat:** other worktree edits were already present (`roadmap.md`, the plan, `docs/catalog/`, the seed reference JSON, and recipe JSON files). This packet does not attribute those edits to this research subtask.

## Integration update (2026-10-05)

The 229-reference fingerprint above is the research packet's pre-merge snapshot. The first integration
pass accepted eleven identity-only rows into the canonical seed, which then had 240 references:

| Stable ID | English / fr-CA name | Accepted alias decision | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-whole-wheat-flour` | whole-wheat flour / farine de blé entier | Reused the legacy stable ID; the unhyphenated spelling has the same normalized search key, so no duplicate alias is stored. | Identity verified; no numeric data copied from legacy catalog. |
| `ingredient-ref-durum-semolina` | durum semolina / semoule de blé dur | Did not assign generic `semolina` as an alias. | Identity verified; measurement and substitution research remain open. |
| `ingredient-ref-whole-kernel-corn-flour` | whole-kernel corn flour / farine de maïs | Did not assign unqualified `corn flour`, which is also a UK term for cornstarch. | Identity verified; name is explicitly disambiguated. |
| `ingredient-ref-cornstarch` | cornstarch / fécule de maïs | Removed the unqualified `corn flour` alias because the spelling names Québec whole-kernel corn flour and UK cornstarch. | Identity verified; locale collision remains documented. |
| `ingredient-ref-cornmeal` | cornmeal / semoule de maïs | Added `corn meal`; fine, medium, and coarse remain grind descriptors. | Identity verified; no separate IDs by grind. |
| `ingredient-ref-masa-harina` | masa harina / farine de maïs nixtamalisée | No aliases; keep separate from unprocessed whole-kernel flour, cornmeal, cornstarch, and precooked maize flour. | Identity verified; no numeric or substitution data. |
| `ingredient-ref-precooked-corn-flour` | precooked corn flour / farine de maïs précuite | No aliases; keep separate from nixtamalized masa harina, whole-kernel flour, cornmeal, and cornstarch. | Identity verified; no numeric or substitution data. |
| `ingredient-ref-roasted-corn-flour` | roasted corn flour / farine de maïs torréfiée | No aliases; keep distinct from the separately named precooked product unless equivalence is established. | Identity verified; no numeric or substitution data. |
| `ingredient-ref-soy-flour` | soy flour / farine de soya | EN: `soybean flour`, `soya flour`; FR: `farine de soja`; preserve as the generic OQLF-defined product. | Identity verified; no numeric or substitution data. |
| `ingredient-ref-kinako` | kinako / poudre de soja Kinako | EN: `roasted soybean flour`; keep generic soy-flour terms on their own identity. | Identity verified; no numeric or substitution data. |
| `ingredient-ref-chana-sattu` | chana sattu / farine de sattu | EN: `roasted Bengal gram flour`, `roasted chickpea flour`; FR: `farine de pois chiches grillés`. Keep broad `besan`, `gram flour`, `chickpea flour`, and unqualified `sattu` off this row. | Identity verified as roasted Bengal gram (Cicer arietinum) flour; no numeric or substitution data. |
| `ingredient-ref-tapioca-starch` | tapioca starch / fécule de manioc | EN: `manioc starch`; keep `cassava starch` unassigned because it overlaps the two active Brazilian polvilho displays; keep deprecated `tapioca flour` inactive. | Identity verified; extracted starch remains distinct from whole-root flour. |
| `ingredient-ref-oat-flour` | oat flour / farine d'avoine | No extra aliases; flour remains distinct from rolled and quick oats. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-rice-flour` | rice flour / farine de riz | Keep as an unqualified family-level search identity; do not assume white or brown rice as the default or alias rice starch. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-white-rice-flour` | white rice flour / farine de riz blanc | Separate source-grade identity; no aliases, grind grades, or gluten-free package qualifiers. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-brown-rice-flour` | brown rice flour / farine de riz brun | Separate source-grade identity; no aliases, wholegrain, organic, or package qualifiers. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-glutinous-rice-flour` | glutinous rice flour / farine de riz gluant | EN: `sweet rice flour`, `sweet rice powder`; no FR aliases. Keep separate from ordinary rice flour and the glutinous-rice grain. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-buckwheat-flour` | buckwheat flour / farine de sarrasin | No alias to wheat flour. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-quinoa-flour` | quinoa flour / farine de quinoa | Kept distinct from whole or cooked quinoa. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-amaranth-flour` | amaranth flour / farine d'amarante | The supplier spelling `farine d'amaranthe` is documented but not activated as an alias because it can be confused with a red food-dye term. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-chickpea-flour` | chickpea flour / farine de pois chiche | Added `farine de pois chiches` as a documented French product-label alias. Did not merge with whole chickpeas or add `besan` / `gram flour`. | Identity verified; regional preparation-specific aliases remain unresolved. |

The ledger records specific government, OQLF, and Canadian manufacturer sources and limits each claim
to identity or terminology. The first eleven reference rows had null density and empty unit mappings; measurement and
substitution states remain `not_yet_researched`. The four follow-up rows have the same identity-only state. The whole-wheat ID was removed from the 105-row
legacy unresolved list, leaving 104 candidates. The rest of this packet remains `in_review`; the
independent bilingual reviewer has not signed off on its remaining proposals. The post-merge
`ingredient-references.v1.json` SHA-256 at that stage was
`3120832e2253d8a89dad456c851eb9561dc77dddfc73a76542110a70ae109a33`.

## Follow-up integration update (2026-10-05)

The integration owner completed normalized-key collision review for four more identity-only rows.
At this follow-up checkpoint, the canonical seed had 257 references and WP02 contributed fifteen accepted flour/starch
identities in total:

| Stable ID | English / fr-CA name | Accepted alias decision | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-sorghum-flour` | sorghum flour / farine de sorgho | No aliases; keep separate from grain sorghum. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-pearl-millet-flour` | pearl millet flour / farine de mil chandelle | No aliases; keep separate from pearl millet grain and generic millet meal. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-cassava-flour` | edible cassava flour / farine comestible de manioc | French alias `farine de manioc`; keep separate from extracted tapioca starch. | Identity verified; no generic measurement or substitution is supported. |
| `ingredient-ref-sago-flour` | edible sago flour / farine de sagou comestible | No aliases; do not map cassava/tapioca products sold regionally as sago. | Identity verified; measurements and substitutions remain unresearched. |

These rows use Codex product standards for the named flour identities and boundaries. They have
`FLOUR_AND_STARCH`, null density, empty unit mappings, no form, and no substitution data. The packet
remains `in_review`; the other proposals and independent bilingual review are still open. The current
canonical reference-file SHA-256 at that checkpoint was `9e3252cc57538a8979fdb191fd52818ac7b10f1c7d404e824a7db53facb5d619`.


## Follow-up integration update (2026-10-05)

The integration owner completed normalized-key collision review for three source-backed identity-only
rows. At this WP02 checkpoint, the canonical seed had 260 references and WP02 contributed eighteen accepted flour/starch
identities in total:

| Stable ID | English / fr-CA name | Accepted alias decision | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-potato-flour` | potato flour / farine de pomme de terre | No aliases; keep separate from extracted potato starch. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-potato-starch` | potato starch / fécule de pomme de terre | French variants `amidon de pomme de terre`, `fécule de pommes de terre`, and the later OQLF-preferred plural `amidon de pommes de terre`; do not activate English `potato flour`. | Identity verified; measurements and substitutions remain unresearched. |
| `ingredient-ref-gari` | gari / gari | No aliases; preserve the same product name in both locales; keep distinct from cassava flour and tapioca starch. | Identity verified; measurements and substitutions remain unresearched. |

The potato records use bilingual food-code and Québec terminology sources, with technical process
evidence to resolve OQLF's ambiguous English cross-reference. Codex defines gari as a named processed
cassava product. All three rows use `FLOUR_AND_STARCH`, null density, empty unit mappings, no forms,
and no substitution data. The current canonical reference-file SHA-256 is
`44706b444c38f859cd91497c6811c7c7dce957825b9def75dccf6ce8ddf6d759`. WP02 remains `in_review`;
remaining proposals and independent bilingual review are still open.

## A1 specialist wheat-flour integration update (2026-10-05)

Four additional source-backed A1 identities were integrated in the focused packet
`baking-specialty-wheat-flours.md`: pastry flour, whole-wheat pastry flour, high-gluten flour, and
self-rising flour. The unsupported French alias `farine à pâtisserie` was removed from the existing
cake-flour row and assigned to the distinct pastry-flour row. OQLF provides the French/English term
pair, and manufacturer evidence distinguishes pastry flour from cake flour. The package now has 297
references with SHA-256
`f7ca3b37bf58862f09f032d587f0419f499f3bd8e8ae24b071e492f8fb025f90`; these additions have null
densities and empty unit mappings. See the new packet for source-level decisions and verification.


Verification for this tranche: all 190 Android unit tests and all 9 Python seed-package tests passed.
Ingredient/package normalization, package validation, generated-index freshness, evidence-ledger schema
validation, and `git diff --check` passed. The deployment script built, installed, and launched on Pixel
9a / Android 16; the live picker returned `potato flour` and `potato starch`. The unsaved probe was
discarded and the 114-recipe library remained unchanged. Gari has generated-catalog unit coverage but
was not separately searched in this UI pass.

## A2 atta identity integration update (2026-10-05)

One source-backed regional wheat-flour identity was added in `atta-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-atta` | atta / atta | EN: `ata`, `chapati flour`, `chappati flour`; FR: `farine atta`, rare `farine à chapati` | OQLF identifies atta in both languages and supports the listed terms. No measurement or substitution data was added. |

The new row is distinct from generic whole-wheat flour and has null density with empty unit mappings.
The canonical reference package now has 298 rows and SHA-256
`0f81e8dddbc9feacd22e1458cd7c6f04da643190c2b44eb8e8c4889a0516c0b6`. Search fixtures cover its
canonical name and documented alias. At this 298-reference checkpoint, `maida` had not yet been
integrated; its later source review and integration are recorded below.

Verification on 2026-10-06: 201 Android unit tests passed; connected Pixel 9a / Android 16
instrumentation completed 26 tests with 24 passes, zero failures/errors, and two existing
environment-gated skips. All 9 Python package tests, seed normalization/validation, generated-index
freshness, ledger validation (448 records), alias-collision checks, UTF-8/no-BOM checks, and
`git diff --check` passed. The deploy script passed `test` and `:app:assembleDebug`, installed, and
launched the app. Live searches for `atta` and `farine a chapati` each returned only atta. The unsaved
probe was discarded; the home screen still showed 114 recipes. Screenshots are in the focused packet.

## A2 maida identity integration update (2026-10-06)

One source-backed regional wheat-flour identity was added in `maida-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-maida` | maida / maida | EN: `maida flour`; no FR aliases. The wider retail headings “All Purpose Flour, Maida” and “Farine tout usage, Maida” remain documentary only. | FSSAI defines the regional refined-wheat product; Canadian English/French listings retain `Maida` in their product names. No equivalence with generic all-purpose flour is activated. |

The row is distinct from both atta and generic all-purpose flour; it has null density and empty unit
mappings. The current reference JSON has 299 rows and SHA-256
`d94c76ea2cf452183236fbf767e7b49d0e2b00173a0051143bf2b881ecd981bc`. Search fixtures cover Maida
without making broad all-purpose queries match it. Verification passed: 201 Android unit tests, 26
connected test cases (24 passed, two environment-gated skips), and all 9 Python package tests; package,
ledger, generated-index, encoding, collision, and diff checks passed. Pixel 9a / Android 16 live
searches returned Maida for `maida` and `maida flour`, and generic all-purpose flour for `all purpose
flour` and `farine tout usage`. Screenshots are listed in `maida-identity.md`; the unsaved probe was
discarded and the home screen remained at 114 recipes.

## A2 semola rimacinata identity integration update (2026-10-06)

One separately named remilled durum-semolina class was added in `semola-rimacinata-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-semola-rimacinata` | remilled durum semolina / semoule de blé dur remoulue | EN: `semola rimacinata`, `semolina rimacinata`; FR: `semola rimacinata` | Italian regulation permits remilling semola; the Pane di Matera specification calls semola rimacinata extra-fine semola and distinguishes it from semolato. OQLF defines base durum semolina as a coarse milling product. |

It remains distinct from `ingredient-ref-durum-semolina`; no unqualified semolina alias, density,
measurement, conversion, form, or substitution was activated. The current reference JSON has 300 rows
and SHA-256 `bc7ce9524ac3fc09359137bd38e1cb5deed64a0683e1d07f9c3db93812926f2d`; the evidence ledger
has 450 records. Verification passed: 201 Android unit tests, 26 connected cases (24 passes, two
environment-gated skips), and all 9 Python package tests, plus package, ledger, generated-index,
encoding, collision, and diff checks. Pixel 9a / Android 16 searches returned the remilled identity
for `semola rimacinata`, `semolina rimacinata`, and `remoulue`; `semolina` showed the base and remilled
identities separately. Screenshots and the final 114-recipe home-state check are listed in the packet.

## A2 durum flour identity integration update (2026-10-06)

The source-backed durum-flour identity was added in `durum-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-durum-flour` | durum flour / farine de blé dur | EN: `durum wheat flour`; FR: `farine de blé durum` | OQLF supports the bilingual labels; Italian regulation defines durum flour as non-granular and semola as granular. |

It remains distinct from durum semolina and remilled durum semolina. No semolina alias, density,
measurement, unit mapping, conversion, form, or substitution was activated. The current reference JSON
has 301 rows and SHA-256 `860d7e7f37b6fbe825d0fc2739a59e951975451a49f02c99872b376b82618e23`; the evidence ledger has 451 records and SHA-256 `cb1de9ade9d699be3231335d1a0524d9949b062cbf356c4a0d15aafe0fb73aff`. All 201 Android unit tests passed. Pixel 9a / Android 16 instrumentation reported 26 cases, with 24 passes, no failures/errors, and two environment-gated skips; all 9 Python package tests and package, ledger, generated-index, encoding, collision, and diff checks passed. The deploy script's `test` and debug assembly tasks passed and installed/launched the APK. Live searches `durum flour` and `durum wheat flour` each returned only the new identity; `durum` showed durum flour, durum semolina, and remilled durum semolina separately. Screenshots and the final 114-recipe home check are recorded in `durum-flour-identity.md`.

The earlier 260-reference hash is the WP02 checkpoint. At the later WP03 roots/tubers follow-up
snapshot, the first WP03 root tranche had brought the package to 265 references and the subsequent
snapshot had 269 references, SHA-256
`0b6f9ee7b0a169e90e58469ee85143c68cfd28e8005d17f1a636d87463d0dac6`; see
`plant-root-vegetables-follow-up.md`. The latest package count is recorded above.

## A4 rye flour identity integration update (2026-10-06)

The source-backed general rye-flour identity was added in `rye-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-rye-flour` | rye flour / farine de seigle | None | OQLF and a Québec product catalog support the general bilingual pair; extraction-qualified rye products remain separate review work. |

It is an identity-only `FLOUR_AND_STARCH` row with no aliases, density, unit mapping, conversion,
form, or substitution. The current reference JSON has 302 rows (SHA-256
`f3b10cbe28cee065a339bc215e617a0217322d451d4e24dc6cf370cad3063a41`) and the ledger has 452 records
(SHA-256 `4281b713779da258a08b98ea7a83d220f17ab713c6bb324c03aaa765897feacb`). All 201 Android unit
tests passed. Pixel 9a / Android 16 instrumentation reported 26 cases with 24 passes, zero
failures/errors, and two environment-gated skips; all 9 Python package tests and package, ledger,
generated-index, encoding, alias-collision, and diff checks passed. The deploy script's `test` and
debug assembly tasks passed and installed/launched the APK. Live searches `rye flour` and
`farine de seigle` each returned only rye flour. Screenshots and the final 114-recipe home check are
recorded in `rye-flour-identity.md`.

## A4 spelt flour identity integration update (2026-10-06)

The source-backed general spelt-flour identity was added in `spelt-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-spelt-flour` | spelt flour / farine d'épeautre | None | OQLF supports `épeautre / spelt`; a Québec flour label uses the bilingual pair. `Petit épeautre` is identified as engrain and remains separate. |

It is an identity-only `FLOUR_AND_STARCH` row with no aliases, density, unit mapping, conversion,
form, or substitution. The reference JSON has 303 rows (SHA-256
`1743e36345c4dde1fb95bc465b1723fc1093fcff70be041fb0966859a85457c2`) and the ledger has 453 records
(SHA-256 `4af722d2d01fb0bb9eeb06a3b29590354bed5e91fb8e996e5c2c0632b83c0444`). Unit, instrumentation,
Python package, normalization, schema, encoding, collision, and diff checks passed. The Pixel 9a
picker returned only spelt flour for `spelt flour` and for the accent-folded French query; the
unsaved probe was discarded and the 114-recipe home state restored. Screenshots and detailed query
wording are in `spelt-flour-identity.md`.

## A4 einkorn flour identity integration update (2026-10-06)

The source-backed general einkorn-flour identity was added in `einkorn-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-einkorn-flour` | einkorn flour / farine de petit épeautre | None | La Milanaise directly pairs the product names and distinguishes einkorn/petit épeautre from spelt/épeautre. |

It is an identity-only `FLOUR_AND_STARCH` row with no aliases, density, unit mapping, conversion,
form, or substitution. The reference JSON has 304 rows (SHA-256
`f0b792cdfb055438274a3b528f0c38aa610be4a2b3944a22692f8141396d21f5`) and the ledger has 454 records
(SHA-256 `52d0fc25759ec034cde8a97f3fd62508207cd562b3ed5bd3ee1e1ec397db4e0c`). All 201 Android unit
tests passed. Pixel 9a / Android 16 instrumentation reported 26 cases with 24 passes, zero
failures/errors, and two environment-gated skips; all 9 Python package tests and normalization,
package, generated-index, ledger, encoding, collision, and diff checks passed. The deploy script
installed and launched the build. Live searches for `einkorn flour` and accent-folded
`farine de petit epeautre` each returned only einkorn flour; `epeautre` returned both einkorn and
spelt flour. The unsaved probe was dismissed and the 114-recipe home state restored. Screenshots and
query details are in `einkorn-flour-identity.md`.

## A4 emmer flour identity integration update (2026-10-06)

The source-backed general emmer-flour identity was added in `emmer-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-emmer-flour` | emmer flour / farine d'amidonnier | None | OQLF pairs amidonnier with emmer; Ontario and French-language flour product pages corroborate the flour form [S62–S64]. |

It is an identity-only `FLOUR_AND_STARCH` row with no aliases, density, unit mapping, conversion,
form, or substitution. The OQLF entry records `farro` as a cereal term, but the flour identity does
not accept unqualified `farro`; WP03 still owns the grain/form disposition. The reference JSON has
305 rows (SHA-256 `4f5c15ddb40e85dfc543af264c43062668ce5419313843862fd798e75df86145`) and the ledger has
455 records (SHA-256 `dc9d0b657bc13cc83d5b627ec3e1318a86e243ef13e61034550b078f478d1697`). All 201 Android
unit tests and all 9 Python package tests passed. Pixel 9a / Android 16 instrumentation reported 26
cases with 24 passes, zero failures/errors, and two environment-gated skips. The deploy script
installed and launched the build. Live searches `emmer flour` and accent/punctuation-folded
`farine d amidonnier` each returned only emmer flour; `farro` returned no flour result. The unsaved
probe was discarded and the 114-recipe home state restored. Screenshots and query details are in
`emmer-flour-identity.md`.

## A4 Khorasan flour identity integration update (2026-10-06)

The source-backed general Khorasan-flour identity was added in `khorasan-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-khorasan-flour` | khorasan flour / farine de khorasan | None; Kamut remains excluded as a trademark | OQLF identifies `blé khorasan` and labels Kamut a trademark; Québec product listings use Khorasan flour names in both locales [S65–S68]. |

It is an identity-only `FLOUR_AND_STARCH` row, distinct from generic durum flour, with no aliases,
density, unit mapping, conversion, form, or substitution. Whole, white, sifted, organic, and other
product grades remain outside this general identity. The reference JSON has 306 rows (SHA-256
`0259a6499ee6bac49dec93431ea5c6833fba935a486a3dbd818fe98e0ea12f4c`) and the ledger has 456 records
(SHA-256 `a9787d308e06fc4bdcbd95314397843421ea3d2d75f1da413dbd07481813e7d8`). All 201 Android unit
tests and all 9 Python package tests passed; Pixel 9a / Android 16 instrumentation reported 26 tests,
24 passes, zero failures/errors, and two environment-gated skips. The deploy script installed and
launched the build. Live English and French picker queries each returned only Khorasan flour, while
`kamut` had no Khorasan result. Screenshots and query details are in `khorasan-flour-identity.md`.

## A4 barley flour identity integration update (2026-10-06)

The source-backed general barley-flour identity was added in `barley-flour-identity.md`:

| Stable ID | English / fr-CA name | Accepted aliases | Evidence state |
| --- | --- | --- | --- |
| `ingredient-ref-barley-flour` | barley flour / farine d'orge | None; malted barley flour remains separate | OQLF directly pairs `farine d'orge` with `barley flour`; La Milanaise lists whole barley flour in both locales [S69–S72]. |

It is an identity-only `FLOUR_AND_STARCH` row, distinct from hulled and pearl barley grains, with no
aliases, density, unit mapping, conversion, form, or substitution. Whole-grain and organic grades
remain outside the general identity; malted and toasted barley-flour products retain their separate
qualifiers. The reference JSON has 307 rows (SHA-256
`392b68395d123e68ecb4ef369adc590929f5f67a57dc85b4b6541c66b09a8835`) and the ledger has 457 records
(SHA-256 `e868ad32a7e519d47f8fce8af5d50795699a9571f12d3539d0e7ca815ade3874`). All 201 unit tests,
9 Python package tests, and 24 of 26 connected Pixel 9a instrumentation tests passed; two
environment-gated instrumentation cases skipped, with no failures. Package validation, generated
catalog freshness, normalization, ledger/schema and alias-collision checks, encoding audit, and diff
checks passed. The deploy script installed and launched the app on a temporary 8 GB Pixel 9a profile
after the original 6 GB AVD reported insufficient storage. Searches `barley flour` and `farine d'orge`
each returned one barley-flour result; `malt barley flour` returned none. The unsaved probe was
discarded and the home screen remained at 114 recipes. See `barley-flour-identity.md` for details and
screenshots.

## A4/B5 glutinous rice flour identity integration update (2026-10-06)

The generic flour identity is integrated as `ingredient-ref-glutinous-rice-flour`, separate from
ordinary `rice flour` and the existing glutinous-rice grain. Its display names are `glutinous rice
flour / farine de riz gluant`; only `sweet rice flour` and `sweet rice powder` are active aliases.
`mochiko` and `shiratamako` remain outside this row pending their milling/product review [S73–S76].
The reference JSON has 308 rows (SHA-256
`db2c505e090df9d45c641bb899d20b7c4da0f109e238bb3fc5433bedffaabcdb`) and the research ledger has
458 records (SHA-256 `c4a9a5c70d72a144aae538dfd5ba4a8725a142c87d02524e063722d22611098e`). No measurement,
conversion, form, or substitution data was added. All 202 unit tests, 9 Python seed-package tests,
and API 36 Pixel 9a instrumentation (24 passed, two skipped, zero failures/errors) passed. The deploy
script installed and launched the app. Live searches confirmed the exact English name, both accepted
English aliases, the French name query, and separate `rice flour` / `glutinous rice flour` results;
`mochiko` and `shiratamako` did not resolve to a generic row. The unsaved probe was discarded and the
home count remained 114. Normalizers, package validation, generated-catalog freshness, UTF-8/no-BOM
review, and diff checks passed. Screenshots and verification details are in
`glutinous-rice-flour-identity.md`. Independent bilingual review, Japanese product naming, and
measurement/substitution evidence remain open.

## A4 white and brown rice flour source-grade integration update (2026-10-06)

Added `ingredient-ref-white-rice-flour` / `farine de riz blanc` and
`ingredient-ref-brown-rice-flour` / `farine de riz brun` as separate `FLOUR_AND_STARCH` identities.
The unqualified `ingredient-ref-rice-flour` remains the family-level search identity because OQLF
defines rice flour as originating from either white or brown rice [S27]. USA Rice distinguishes flour
milled with bran from flour milled without bran and describes differing color, texture, and flavor;
Canadian manufacturers list the source grades as separate English and French products [S77–S80]. No
aliases, densities, unit mappings, forms, conversions, or substitutions were added. The 114-recipe
audit found no exact white/brown rice-flour lines. The final reference JSON has 310 rows (SHA-256
`40c44054cc34f1aa277e8f885b89ae2e8e7c472080b5ff1eb3cc18243af7bfaa`); the ledger has 460 records
(SHA-256 `454d4fac42ce4e8663ffbcfb93a5a539c80ed13294a2bb08f6a1ef4e6a33b37e`). All 203 Android unit
tests and 9 Python package tests passed. Pixel 9a / Android 16 instrumentation reported 26 tests,
with 24 passes, two isolated-QA-package skips, and zero failures/errors. The deploy script installed
and launched the app. Live English `rice flour` and French `farine de riz` searches showed the family,
white and brown grades, and glutinous flour as distinct results; exact French grade queries each
returned their matching localized name. The unsaved probe was discarded and the French home count
remained at 114. Seed/package normalizers, validation, generated-catalog freshness, UTF-8/no-BOM
review, and diff checks passed. Screenshots are
`pixel9a-rice-flour-family-grades-en.png`, `pixel9a-rice-flour-family-grades-fr-ca.png`, and
`pixel9a-rice-flour-home-fr-ca-114.png` in the same batch directory. Independent bilingual approval,
measurement/substitution research, and remaining A4 distinctions stay open; details are in
`rice-flour-source-grades.md`.

## A5 masa harina identity integration update (2026-10-06)

Added `ingredient-ref-masa-harina` as `masa harina` / `farine de maïs nixtamalisée`, a distinct
`FLOUR_AND_STARCH` identity defined by nixtamalization. University of Saskatchewan distinguishes it
from cornmeal and untreated whole-kernel corn flour; the Québec-market supplier uses the exact French
name [S81–S82]. A technical review and P.A.N. manufacturer listing document precooked refined maize
flour as a separate product path, so it remains outside this identity [S83–S84]. No aliases, density,
unit mapping, form, conversion, or substitution data were added. The 114-recipe audit found no masa
harina, nixtamalized-maize-flour, or precooked-corn-flour ingredient lines. The final package has 311
references (SHA-256
`56c251d1724ac379d1686c39d08eb23b8905f7e83a98f6cea844881a9d7963eb`) and the ledger has 461 records
(SHA-256 `0bb072965e15711c6d608fcbf559e22fca7f4e69b17a59b47fe317bcd17fd8e3`). Verification passed:
204 unit tests, all 9 Python package tests, and API 36 instrumentation with 24 passes, two QA-gated
skips, and zero failures/errors. The deploy script installed and launched on the temporary 8 GB
Pixel 9a profile after the original AVD reported insufficient storage. Live English and Québec French
picker searches returned the intended identities; the unsaved draft was discarded and the home count
settled at 114. Reference/package checks, generated-catalog freshness, the 124-file UTF-8/no-BOM audit,
and `git diff --check` passed. Screenshots are in `masa-harina-identity.md`; precooked maize flour
The separate precooked-maize-flour identity was added in a later checkpoint. The generic corn-flour
collision and cornmeal-grind review is now recorded below; independent bilingual review and broader
catalog work remain open.

## A5 unqualified corn-flour and cornmeal-grind review (2026-10-06)

OQLF's updated `farine de maïs` entry defines finely ground maize and lists English `corn flour`,
while also marking `cornstarch` as a UK English term for that product [S88]. OQLF's `amidon de maïs`
entry gives `corn starch` as the English term and marks `corn flour` as UK usage for starch [S89].
Because this catalog cannot scope aliases by English locale, removed the global `corn flour` alias
from `ingredient-ref-cornstarch`. Keep `cornstarch / fécule de maïs` and the disambiguated `whole-kernel
corn flour / farine de maïs` searchable. The exact normalized catalog key `corn flour` is unassigned.
The live picker uses substring matching: that query shows the clearly qualified `precooked corn flour`
and `whole-kernel corn flour` rows, but not cornstarch. The explicit English `cornstarch` and French
`fécule de maïs` queries return the cornstarch identity. Cornmeal remains one identity across fine,
medium, and coarse grinds, which OQLF identifies as grind descriptors [S5]; no extra grind IDs or
aliases were added. The audit of all 114 recipe files found no ingredient line using the removed alias.
Verification details and screenshots are in `corn-flour-disambiguation.md`; independent bilingual
review remains open.

## A5 precooked corn flour identity integration update (2026-10-06)

Added `ingredient-ref-precooked-corn-flour` as `precooked corn flour` / `farine de maïs précuite`,
defined by the pre-cooked flour product pathway. The technical review distinguishes precooked
refined maize flour from dehydrated nixtamalized flour [S85]. P.A.N. calls its product pre-cooked
white corn meal while specifying that it is 100% pre-cooked white corn flour [S86]; a Montréal
supplier uses the exact Québec French name `farine de maïs précuite` [S87]. Brand and color
qualifiers, `pre-cooked corn meal`, `masa harina`, density, unit mappings, measurements, and
substitutions were not added as aliases or data. The 114-recipe audit found no matching ingredient
line. Package hashes, test and Pixel 9a verification, and screenshots are recorded in
`precooked-maize-flour-identity.md`. The later corn-flour collision and cornmeal-grind review is
recorded above; independent bilingual review remains open.

## Findings from the fingerprinted pre-merge canonical seed

The fingerprinted input reference file had 229 records and explicit `category` on all 229. Seven IDs
matched this flour/starch discovery pass, of which six were flour or starch products and one was a
whole-pulse identity:

| Current canonical ID | Seed English / French display | Current category | Disposition |
| --- | --- | --- | --- |
| `ingredient-ref-all-purpose-flour` | all-purpose flour / farine tout usage | `FLOUR_AND_STARCH` | Keep ID and display names. OQLF confirms `farine tout usage` and documents `all-purpose flour` and `plain flour` as English terms [S1]. Review the broad aliases below. |
| `ingredient-ref-almond-flour` | almond flour / farine d'amande | `FLOUR_AND_STARCH` | Keep ID. Remove the broad English alias `ground almonds` because it makes `almonds` return both whole almonds and almond flour. Retain `poudre d'amande` and add source-attested `poudre d'amandes`; keep almond meal unassigned because product labels and grind boundaries vary [S146–S154]. |
| `ingredient-ref-arrowroot` | arrowroot / arrow-root | `FLOUR_AND_STARCH` | Keep ID. Québec French `arrow-root` and English `arrowroot` / `arrowroot starch` are documented [S6]. Do not infer one botanical species: OQLF notes commercial arrow-root may be extracted from several tropical plants. |
| `ingredient-ref-bread-flour` | bread flour / farine à pain | `FLOUR_AND_STARCH` | Keep ID and display names. The French label is supported by Québec/Canadian flour packaging [S18]; retain “bread flour” as a functional class rather than merging it with unqualified flour. |
| `ingredient-ref-cake-flour` | cake flour / farine à gâteau | `FLOUR_AND_STARCH` | Keep ID and display names. `farine à gâteau` is listed in a bilingual Canadian food code [S4]. Do not silently treat existing alias `farine à pâtisserie` as equivalent to every pastry flour; keep that alias under review because the checklist separately names pastry flour and technical baking sources distinguish the classes [S7]. |
| `ingredient-ref-cornstarch` | cornstarch / fécule de maïs | `FLOUR_AND_STARCH` | Keep ID and French name. OQLF lists `amidon de maïs` and `fécule de maïs`; it also flags English `corn flour` as a UK term for starch, while its separate maize-flour entry uses `corn flour` for finely ground whole kernels [S5]. The existing unqualified English alias `corn flour` collides and should not silently resolve. |
| `ingredient-ref-chickpeas` | chickpeas / pois chiches | `LEGUME_AND_PULSE` | Keep as the whole/dried-or-canned pulse identity. It is not chickpea flour or besan; do not add a flour alias to this record. A separate flour product is justified [S9, S10]. |

Current exact-ID recipe-line counts in the fingerprinted 114-recipe package: all-purpose flour 50, almond flour 2, bread flour 2, cake flour 4, cornstarch 9, chickpeas 0, arrowroot 0. One recipe ingredient line says “cornstarch or arrowroot” while linking only to cornstarch; this is an observed collapsed alternative, not evidence that the two ingredients are aliases.

The seed snapshot has six true flour/starch IDs, not seven: chickpeas is a separate whole pulse. Existing seed categories are now explicit on those records and align with the broad enum. All seven related existing records have `defaultDensity: null` and empty `unitMappings` in this snapshot; this identity packet adds no conversion evidence.

## Identity and naming proposals

Rows marked **accepted ID** show merged records. Rows still marked **candidate slug** are suggestions only; they are not allocated or accepted. Use an existing slug where noted; the integration owner controls stable ID allocation and collision checks. All proposed catalog categories use the current enum; no category values are invented.

| Checklist | Proposed identity / ID disposition | Proposed English display | Proposed fr-CA display | Vetted aliases or forms | Category | Evidence and decision |
| --- | --- | --- | --- | --- | --- | --- |
| A1 | Whole-wheat flour; reuse secondary-catalog ID `ingredient-ref-whole-wheat-flour` if reconciliation confirms it | whole-wheat flour | farine de blé entier | `wholemeal flour` may be a locale-tagged alias; `farine de blé complet` remains a reviewer decision | `FLOUR_AND_STARCH` | Genuine canonical-seed gap, but not a wholly new repository identity: the separate Kotlin catalog already carries this ID. Health Canada uses “wheat flour, whole-wheat / farine de blé entier”; CFIA distinguishes whole-wheat/entire-wheat flour and graham flour [S2, S3]. Do not copy the Kotlin numeric fields as evidence. |
| A2 | Durum semolina; accepted ID `ingredient-ref-durum-semolina` | durum semolina | semoule de blé dur | No generic aliases beyond the display names; keep remilled durum semolina as its separate accepted identity | `FLOUR_AND_STARCH` | OQLF defines semolina as a coarse durum-wheat milling product; Codex has a separate durum wheat semolina/flour standard; StatCan lists “durum semolina and flour / semoule et farine de blé dur” [S4, S8]. Flour and semolina remain distinct milling products. |
| A2 | Durum flour; accepted ID `ingredient-ref-durum-flour` | durum flour | farine de blé dur | EN: `durum wheat flour`; FR: `farine de blé durum`; do not alias semolina terms | `FLOUR_AND_STARCH` | OQLF provides the English and Québec French terms; Italian regulation defines durum flour as non-granular and semola as granular [S51–S52]. Keep separate from durum semolina and remilled durum semolina. |
| A2 | Atta; accepted ID `ingredient-ref-atta` | atta | atta | `ata`, `chapati flour`, `chappati flour`; FR `farine atta`, rare `farine à chapati`; exclude qualified `chakki atta` from aliases | `FLOUR_AND_STARCH` | OQLF accepts the English/French name `atta`, lists the aliases, and defines the Indian flour identity [S41]. It remains distinct from the generic whole-wheat flour record; no composition or conversion data is inferred. |
| A2 | Maida; accepted ID `ingredient-ref-maida` | maida | maida | EN: `maida flour`; no FR aliases. Do not activate generic `all-purpose flour` or `farine tout usage`, including broad retail-title phrases | `FLOUR_AND_STARCH` | FSSAI defines maida as a refined wheat-milling product; Canadian English and French product listings use Maida in both localized headings [S42–S44]. Preserve the named regional product and do not infer a one-to-one equivalence with generic Canadian all-purpose flour. |
| A2 | Semola rimacinata; accepted ID `ingredient-ref-semola-rimacinata` | remilled durum semolina | semoule de blé dur remoulue | EN: `semola rimacinata`, `semolina rimacinata`; FR: `semola rimacinata`; do not alias unqualified semolina | `FLOUR_AND_STARCH` | Italian regulation permits remilling semola; the Pane di Matera specification calls semola rimacinata extra-fine semola, distinct from fine semolato. OQLF describes ordinary durum semolina as coarse; a Québec importer and manufacturer support the localized product names [S45–S50]. No particle-size number or measurement is imported. |
| A4 | Whole-kernel maize flour; accepted ID `ingredient-ref-whole-kernel-corn-flour` | whole-kernel corn flour | farine de maïs | Do not activate unqualified `corn flour` across locales; no alias to cornstarch | `FLOUR_AND_STARCH` | OQLF defines `farine de maïs` as finely ground kernels and documents the English false-friend overlap with British `cornstarch` [S5]. Keep it separate from meal/grits and extracted starch. |
| A4 | Cornstarch; existing ID `ingredient-ref-cornstarch` | cornstarch | fécule de maïs | Do not activate unqualified `corn flour` without locale scope | `FLOUR_AND_STARCH` | OQLF lists `corn flour` for Québec whole-kernel maize flour and as a UK English term for cornstarch; the catalog cannot encode regional alias scope, so the ambiguous spelling is not stored [S88–S89]. |
| A4 | Maize meal; accepted ID `ingredient-ref-cornmeal` | cornmeal | semoule de maïs | `corn meal`; OQLF also records `Indian meal` and UK `maize meal`; grind (fine/medium/coarse) is not a separate identity for every grind | `FLOUR_AND_STARCH` | OQLF defines dried ground maize meal and explicitly allows fine, medium, or coarse grind [S5]. Codex treats whole/de-germed meal and grits as milling classes [S8]. Keep separate from finely milled whole-kernel flour and cornstarch. |
| A5 | Masa harina; accepted ID `ingredient-ref-masa-harina` | masa harina | farine de maïs nixtamalisée | No aliases; do not assign `corn flour`, `cornmeal`, brand names, or precooked maize flour | `FLOUR_AND_STARCH` | University of Saskatchewan distinguishes masa harina, made from maize cured with limewater, from cornmeal and untreated American corn flour; a Canadian supplier uses the exact French name. Technical review distinguishes dehydrated nixtamalized flour from precooked refined maize flour [S81–S84]. |
| A5 | Precooked corn flour; accepted ID `ingredient-ref-precooked-corn-flour` | precooked corn flour | farine de maïs précuite | No aliases; keep separate from masa harina and precooked-cornmeal wording; do not add brand or color qualifiers | `FLOUR_AND_STARCH` | Technical review treats precooked refined maize flour as distinct from dehydrated nixtamalized flour; manufacturer specifies its precooked white-corn product is flour; Montréal supplier uses the exact French name [S85–S87]. |
| A5/A7/B6 | Roasted corn flour; accepted ID `ingredient-ref-roasted-corn-flour` | roasted corn flour | farine de maïs torréfiée | No aliases; keep distinct from the source-named precooked white corn flour; do not infer equivalence or alias `toasted corn flour` | `FLOUR_AND_STARCH` | A Québec mill names roasted corn flour in English and French and describes heat treatment to promote corn-starch gelatinization. The catalog corrects French adjective agreement. P.A.N.'s separately named precooked white corn flour is not mapped as an alias because the sources do not establish equivalence [S86–S89, S130–S131]. No numeric data is imported. See `roasted-corn-flour-identity.md`. |
| A3/A6 | Accepted ID `ingredient-ref-oat-flour` | oat flour | farine d'avoine | no additional alias verified in this pass | `FLOUR_AND_STARCH` | Canadian bilingual product packaging and the Canadian Nutrient File support these terms [S26, S32]. Existing rolled/quick oats are not aliases for flour. |
| A4/A6 | Accepted ID `ingredient-ref-rice-flour` | rice flour | farine de riz | Family-level discovery term; do not assume a white/brown default or alias rice starch | `FLOUR_AND_STARCH` | OQLF says rice flour can come from white or brown rice. Keep the unqualified family identity available alongside separate source-grade identities [S27, S77–S80]. Existing cooked quinoa and rice are not flour records. |
| A4 | Accepted ID `ingredient-ref-white-rice-flour` | white rice flour | farine de riz blanc | No aliases; retain supplier-specific superfine/grind and gluten-free claims outside the general identity | `FLOUR_AND_STARCH` | QUeen Milling lists distinct English and French white-rice flour products; USA Rice documents the polished-rice, bran-removed source grain [S77–S79]. |
| A4 | Accepted ID `ingredient-ref-brown-rice-flour` | brown rice flour | farine de riz brun | No aliases; do not import wholegrain, organic, package, or grind qualifiers | `FLOUR_AND_STARCH` | SATAU and QUeen Milling use separate bilingual brown-rice flour product labels; USA Rice documents the retained-bran source grain [S77–S80]. |
| A4/B5 | Accepted ID `ingredient-ref-glutinous-rice-flour` | glutinous rice flour | farine de riz gluant | EN: `sweet rice flour`, `sweet rice powder`; keep `mochiko` and `shiratamako` unassigned pending milling/product review | `FLOUR_AND_STARCH` | MAFF uses glutinous rice flour and short-grain rice flour separately in one recipe. A Canadian manufacturer lists the English name and sweet-rice aliases; SUE Foods uses the exact French product name [S73–S76]. |
| A6 | Accepted ID `ingredient-ref-buckwheat-flour` | buckwheat flour | farine de sarrasin | no additional alias verified in this pass | `FLOUR_AND_STARCH` | OQLF directly pairs the preferred Québec French term with its English translation; Canadian product packaging also uses the pair [S25, S26, S31]. Buckwheat is not wheat; do not alias it to wheat flour. |
| A6 | Sorghum flour; accepted ID `ingredient-ref-sorghum-flour` | sorghum flour | farine de sorgho | no aliases; keep sorghum grain and flour separate | `FLOUR_AND_STARCH` | Codex’s French standard list uses `farine de sorgho`; King Arthur’s technical baking chart lists sorghum flour as a baking ingredient [S7, S8]. |
| A6 | Pearl-millet flour; accepted ID `ingredient-ref-pearl-millet-flour` | pearl millet flour | farine de mil chandelle | no aliases; keep separate from pearl millet grain and generic millet meal | `FLOUR_AND_STARCH` | Codex lists a standard for pearl millet flour and the French title `farine de mil chandelle` [S8]. This is a documented millet product, not generic millet meal. |
| A6 | Teff flour; accepted ID `ingredient-ref-teff-flour` | teff flour | farine de teff | No aliases; keep bare `teff`, OQLF spelling `tef`, organic, brand, and whole-grain qualifiers outside this flour identity | `FLOUR_AND_STARCH` | Bob's Red Mill identifies a teff-flour product; a Québec French-market product page uses `farine de teff`. OQLF records `tef` as recommended but non-current, so it is not activated as an alias [S90–S92]. |
| A6 | Accepted ID `ingredient-ref-quinoa-flour` | quinoa flour | farine de quinoa | no additional alias verified | `FLOUR_AND_STARCH` | Canadian bilingual product packaging uses this label [S25, S26]. Existing quinoa is a different product/state and must not absorb it. |
| A6 | Accepted ID `ingredient-ref-amaranth-flour` | amaranth flour | farine d'amarante | Supplier spelling `farine d'amaranthe` stays documentary and is not an automatic alias | `FLOUR_AND_STARCH` | Canadian product packaging documents the bilingual name; OQLF supports the preferred French plant name and flour use [S26, S28]. A separate OQLF entry distinguishes the plant from a red food-colour term with the older spelling `amaranthe`, so this supplier spelling is not active search data [S30]. |
| A7 | Cassava flour; accepted ID `ingredient-ref-cassava-flour` | edible cassava flour | farine comestible de manioc | French alias `farine de manioc`; keep separate from tapioca starch | `FLOUR_AND_STARCH` | OQLF defines `farine de manioc` as dry-ground manioc-root flour; Codex defines the edible whole-root flour and retains `farine comestible de manioc` as the label name [S155, S157]. Québec retail headings support the shorter search wording [S160–S161]. Keep it distinct from wet-extracted tapioca/cassava starch; no generic measurement or substitution is supported. |
| A7 | Wheat starch; accepted ID `ingredient-ref-wheat-starch` | wheat starch | amidon de blé | French alias: `amidon de froment`; keep separate from wheat flour, corn starch, and wheat gluten | `FLOUR_AND_STARCH` | OQLF defines wheat starch from *Triticum*, gives `amidon de blé` and `amidon de froment` as preferred French terms, and pairs them with English `wheat starch`. CFIA lists wheat starch separately from wheat flour, wheat meal, and gluten flour as a bread ingredient [S108–S109]. No numeric data is imported. |
| A7 | Malted barley flour; accepted ID `ingredient-ref-malted-barley-flour` | malted barley flour | farine d'orge maltée | EN alias: `malt barley flour` per OQLF; keep separate from general barley flour and malted wheat flour; do not alias broad `malt flour` or activate diastatic/non-diastatic variants as forms | `FLOUR_AND_STARCH` | OQLF pairs `farine d'orge maltée` with `malt barley flour`; CFIA lists `malted barley flour` distinctly from malted wheat flour as a flour ingredient, and an Ontario mill describes its bilingual product as germinated, dried, ground barley [S110–S113]. No numeric data is imported. See `malted-barley-flour-identity.md` for verification. |
| A7 | Malted wheat flour; accepted ID `ingredient-ref-malted-wheat-flour` | malted wheat flour | farine de blé maltée | No aliases; keep separate from general/whole-wheat flour, malted barley flour, and vital wheat gluten | `FLOUR_AND_STARCH` | CFIA names malted wheat flour separately from malted barley flour; Government of Canada terminology pairs the English/French names, and milling/product evidence supports flour from malted wheat [S114–S117]. No numeric data is imported. See `malted-wheat-flour-identity.md` for verification. |
| A7/B6 | Roasted barley flour; accepted ID `ingredient-ref-roasted-barley-flour` | roasted barley flour | farine d'orge torréfiée | English alias: `toasted barley flour`; keep regional `hattai-ko`/`mugikogashi` terms unassigned | `FLOUR_AND_STARCH` | Québec mill sources name a roasted barley flour and describe heat treatment; Eurogerm sources classify a barley product as toasted barley flour and define its line as roasted-cereal flour made by milling roasted grain [S123–S125, S144–S145]. Keep the bilingual display and French spelling under independent review. No numeric data is imported. See the identity and boundary-review packets. |
| A7 | Roasted wheat flour; accepted ID `ingredient-ref-roasted-wheat-flour` | roasted wheat flour | farine de blé torréfiée | No aliases; keep separate from general and malted wheat flour | `FLOUR_AND_STARCH` | Les Moulins de Soulanges names the product in English and French and explicitly describes roasting of the flour; OQLF supports `farine de blé` for wheat flour. Correct the French adjective agreement in the catalog, and do not infer extraction class, density, conversions, yields, or substitutions [S114–S116, S126–S128]. See `roasted-wheat-flours-identity.md`. |
| A7 | Roasted wheat malt flour; accepted ID `ingredient-ref-roasted-wheat-malt-flour` | roasted wheat malt flour | farine de malt de blé torréfié | No aliases; keep distinct from roasted wheat flour and ordinary malted wheat flour | `FLOUR_AND_STARCH` | A manufacturer's bilingual ingredient declaration separately lists wheat malt flour and roasted wheat malt flour. This supports a distinct declared ingredient name, not a specific process or a kitchen conversion [S114–S117, S129]. See `roasted-wheat-flours-identity.md`. |
| A7/B2 | Tapioca starch; accepted ID `ingredient-ref-tapioca-starch` | tapioca starch | fécule de manioc | `fécule de tapioca` is a current Canadian French product label; `tapioca flour` / `farine de tapioca` occur on other product labels, so retain label/locale context; plain `tapioca` is ambiguous across powder, flakes, small balls, and pearls | `FLOUR_AND_STARCH` | OQLF defines tapioca as a cassava-derived food starch and documents `fécule de manioc`; current SATAU product listings use `fécule de tapioca`, while Canadian bilingual product portfolios use `farine de tapioca` / `tapioca flour` [S6, S18, S21]. This is not edible cassava flour [S11]. |
| B2 | Accepted IDs `ingredient-ref-brazil-polvilho-doce` and `ingredient-ref-brazil-polvilho-azedo` | `sweet cassava starch (polvilho doce)`; `sour cassava starch (polvilho azedo)` | `polvilho doce`; `polvilho azedo` | No aliases. Do not add global `sweet/sour tapioca starch`, `cassava starch`, or generic `fécule de manioc` cross-links. The two English descriptors remain paired with the Brazilian names; French display terms await Québec review. | `FLOUR_AND_STARCH` | MAPA guidance and Embrapa distinguish the named polvilhos from generic fécula; Grupo PQ supplies product-specific English translations for its respective products. These are distinct source-named culinary identities, not uniform process specifications or conversions [WP06-BR-CASSAVA-20261009-S03; WP02-POLVILHO-LABELS-20261010-S01, S03–S05]. |
| A4 | Rye flour; accepted ID `ingredient-ref-rye-flour` | rye flour | farine de seigle | No aliases; defer light, medium, dark, whole-grain, and extraction/grind qualifiers | `FLOUR_AND_STARCH` | OQLF directly pairs `farine de seigle` with `rye flour`; a Québec product catalog uses the same bilingual pair. Keep source-specific whole/extraction classes outside this general identity [S53–S55]. |
| A4 | Spelt flour; accepted ID `ingredient-ref-spelt-flour` | spelt flour | farine d'épeautre | No aliases; defer whole/extraction/grind qualifiers and keep `petit épeautre` (einkorn) separate | `FLOUR_AND_STARCH` | OQLF pairs `épeautre` with English `spelt`; Québec product evidence names petit épeautre as engrain and the mill distinguishes it from spelt [S56–S58, S59–S60]. |
| A4 | Einkorn flour; accepted ID `ingredient-ref-einkorn-flour` | einkorn flour | farine de petit épeautre | No aliases; keep `engrain` and spelt names separate | `FLOUR_AND_STARCH` | La Milanaise’s French and English product pages pair the names and explicitly distinguish einkorn/petit épeautre from spelt/épeautre. Québec Food Directory corroborates market wording [S59–S61]. |
| A4 | Emmer flour; accepted ID `ingredient-ref-emmer-flour` | emmer flour | farine d'amidonnier | No aliases; keep unqualified `farro` outside the flour identity pending grain/form review | `FLOUR_AND_STARCH` | OQLF pairs amidonnier with emmer and identifies *Triticum dicoccum*; an Ontario mill and a French-language mill list corresponding flour products [S62–S64]. |
| A4 | Khorasan flour; accepted ID `ingredient-ref-khorasan-flour` | khorasan flour | farine de khorasan | No aliases, including the trademark Kamut; keep whole, white, and sifted grades separate | `FLOUR_AND_STARCH` | OQLF identifies blé khorasan as *Triticum turanicum* and labels Kamut a trademark. Québec Food Directory and La Milanaise list the flour in English and French [S65–S68]. |
| A4 | Barley flour; accepted ID `ingredient-ref-barley-flour` | barley flour | farine d'orge | No aliases; keep malted and toasted barley-flour products separate | `FLOUR_AND_STARCH` | OQLF directly pairs the bilingual names; La Milanaise lists a whole barley flour product in both locales. Hulled and pearl barley remain grain identities [S69–S72]. |
| B2 | Accepted ID `ingredient-ref-potato-flour` | potato flour | farine de pomme de terre | no alias to potato starch; product text `potato flakes` is not a safe universal alias | `FLOUR_AND_STARCH` | Canadian bilingual food code records `potato flour / farine de pomme de terre`; technical baking reference says it is cooked, dried, ground whole potato [S37, S38]. |
| B2 | Accepted ID `ingredient-ref-potato-starch` | potato starch | fécule de pomme de terre | French variants `amidon de pomme de terre`, `fécule de pommes de terre`, and `amidon de pommes de terre`; keep the conflicting English cross-reference `potato flour` inactive | `FLOUR_AND_STARCH` | OQLF defines the French starch product and records its naming variants; technical baking evidence distinguishes it from whole-tuber potato flour [S38, S39, WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S01]. OQLF also cross-lists “potato flour,” so that English term is not activated as an alias. |
| B1 | Accepted ID `ingredient-ref-chickpea-flour` | chickpea flour | farine de pois chiche | `farine de pois chiches` as a Canadian product-label variant; `besan` only when preparation is established; `gram flour` remains ambiguous | `FLOUR_AND_STARCH` | Health Canada and Canadian bilingual product labels use the French ingredient name [S26, S29]. Do not merge into `ingredient-ref-chickpeas` or assume every regional chickpea flour has the same preparation. |
| B2 | Edible sago flour; accepted ID `ingredient-ref-sago-flour` | edible sago flour | farine de sagou comestible | no aliases; keep regional `sago` wording unresolved unless source material is known | `FLOUR_AND_STARCH` | Codex explicitly limits edible sago flour to palm pith and excludes cassava products sometimes called sago flour; official French Codex text and FAO terminology give `farine de sagou comestible` [S12]. This is a real identity, not a tapioca alias. |
| B8 | Accepted ID `ingredient-ref-gari` | gari | gari | no aliases; retain the same product name in both locales; no `cassava flour` alias | `FLOUR_AND_STARCH` | Codex defines gari as a processed cassava product and retains `gari` as the product name in French [S40]. Keep it distinct from edible cassava flour and extracted tapioca starch. |
| B5 | Kinako; candidate slug `ingredient-ref-kinako` | kinako (roasted soybean flour) | `kinako`; French descriptor not established in this batch | keep `kinako` as the original-language display/search alias; do not alias to unroasted soy flour | `FLOUR_AND_STARCH` | Japan MAFF uses `kinako (roasted soybean flour)` for regional foods; Canadian labels use `farine de soya` for soy flour [S14, S18]. Roasting is a real preparation distinction; a Québec French descriptor remains an explicit naming gap. |
| B6 | Gluten-free flour blends; no generic ingredient ID proposed | use exact named product/formula in English | use exact Canadian French product label | no universal alias among all-purpose, cup-for-cup, bread, or pastry blends | `BAKING_MIXIN_AND_PANTRY` for named blends; confirm with integration owner | King Arthur distinguishes designated gluten-free flours from replacement blends and shows a specific rice/tapioca/potato-starch formulation; current Canadian product catalog shows another chickpea/potato/tapioca/sorghum/fava formula with a different French display label [S15, S18]. Each exact named blend is a composition-dependent compound product; do not equate the category phrase with a universal formula. |

Accepted rows and proposed candidates use only current enum categories; candidates absent from the canonical seed are not yet allocated. The existing enum currently has `FLOUR_AND_STARCH`, `GRAIN_AND_CEREAL`, `LEGUME_AND_PULSE`, and `BAKING_MIXIN_AND_PANTRY`; no subcategory field exists. Bran, germ, cracked grain, vital wheat gluten, and non-flour meals need item-level category review (usually `GRAIN_AND_CEREAL`), rather than inheriting the flour category by proximity. Wheat starch uses `FLOUR_AND_STARCH` as an extracted starch; malted barley flour uses it as a barley-milling flour product.

## Section 04 checklist disposition

This is a coverage review, not a claim that every listed identity is ready. “Partial” means that candidate identities or decision rules were researched, while naming, alias collision, or exact subfamily evidence remains open.

| Plan item | Review status | Batch disposition / remaining work |
| --- | --- | --- |
| A1 — all-purpose, bleached/unbleached, bread, high-gluten, cake, pastry, whole-wheat, white whole-wheat, whole-wheat pastry, self-rising | Partial | The four added identities now cover high-gluten, pastry, whole-wheat pastry, and self-rising flour; pastry is separate from cake flour. Whole-wheat flour remains in the canonical seed. Bleached/unbleached remain process/product qualifiers, not aliases. White whole-wheat and additional product-grade claims still need source review. |
| A2 — durum flour, semolina, semola rimacinata, atta, maida, regional wheat flours | Partial | Durum flour is integrated as a non-granular product and remains distinct from both semolina identities [S51–S52]. `atta` is integrated with OQLF-backed English and Québec French terms [S41]. `maida` is integrated as a separate regional identity with the same product name in both locales; broad all-purpose headings remain inactive aliases [S42–S44]. `semola rimacinata` is integrated as remilled durum semolina, distinct from coarse durum semolina and fine semolato [S45–S50]. Other regional flour distinctions remain open. |
| A3 — Italian tipo 00/0/1/2 and French T-type classes | Ten identity-only classes integrated; independent Québec French review remains open | Italian type 00/0/1/2 and French T45/T55/T65/T80/T110/T150 now have separate source-backed references and qualified aliases. The ash/protein criteria stay in the ledger; no class crosswalk, density, form, yield, conversion, recipe link, or substitution was added. French display compounds use OQLF's generic farine de blé tendre wording, but the full grade constructions remain provisional pending independent Québec review. See `batches/wp02-wp07-wp08-flour-egg-evidence-integration-20261010/README.md`. |
| A4 — rye by useful extraction/grind, pumpernickel meal, spelt, einkorn, emmer, khorasan, barley, oat, rice white/brown, sweet/glutinous rice | Partial | General rye flour is integrated as `rye flour / farine de seigle`; light/medium/dark and whole-grain distinctions remain unresolved rather than aliases [S53–S55]. Spelt, einkorn, emmer, Khorasan, and barley flour now have distinct identities; their terminology and product sources are recorded separately [S56–S72]. Barley flour remains distinct from hulled/pearl barley; a source-defined roasted barley flour is integrated with the manufacturer-backed English alias `toasted barley flour`. Regional roasted-grain terms and other malted/toasted product coverage remain separate review items [S110–S113, S123–S125, S144–S145]. Oat and ordinary rice flour identities are integrated; white and brown rice flour are separate source-grade identities, while glutinous rice flour remains separate with manufacturer-backed sweet-rice aliases [S73–S80]. Native Japanese milling products remain under review. Pumpernickel meal remains an identity/naming candidate. Kamut remains outside generic aliases as a trademark. Unqualified farro remains a WP03 grain/form review item, not an emmer-flour alias. “Sweet/glutinous” describes a rice class, not added sugar or wheat gluten. |
| A5 — corn flour, cornmeal grind, masa harina, precooked maize flour | Partial | Whole-kernel corn flour, cornmeal, and cornstarch remain distinct; OQLF's same English `corn flour` spelling is regional for the whole-kernel and starch products, so it is unassigned globally. Cornmeal fine, medium, and coarse grinds stay descriptors. Masa harina and precooked corn flour are integrated as separate nixtamalized and precooked product identities [S5, S81–S89]. A Québec mill's roasted corn flour / `farine de maïs torréfiée` is a separate source-named functional-flour product; its heat treatment promotes starch gelatinization, but the sources do not establish equivalence with the precooked white-corn product [S86–S89, S130–S131]. No aliases, generic equivalence, or substitution are asserted; independent bilingual approval remains open. |
| A6 — buckwheat, sorghum, millet, teff, quinoa, amaranth, fonio, other grain flours | Partial | Buckwheat, sorghum, pearl millet, quinoa, and amaranth names have source coverage in the proposal table; teff flour is integrated as `teff flour / farine de teff` using manufacturer and Québec French-market naming evidence [S90–S92]. Keep the grain-level `tef` spelling and all teff aliases out pending reviewer judgment. White fonio grain / *fonio blanc* is integrated in WP03 [WP03-S34–S35]. Flour product research found Canadian fonio-flour listings plus separate Québec roasted and precooked flour products [S93–S97]; the flour identity, process boundary, and generic fr-CA display remain unresolved. No arbitrary cap is applied. |
| A7 — bran, germ, cracked wheat, grain meal, malted flour, vital wheat gluten, toasted flour | Partial | Wheat bran, wheat germ, and cracked wheat are integrated as separate `GRAIN_AND_CEREAL` identities (`ingredient-ref-wheat-bran`, `ingredient-ref-wheat-germ`, and `ingredient-ref-cracked-wheat`), with no aliases or numeric/substitution data [S98–S104]. Vital wheat gluten / `gluten de froment élastique` is a separate identity using OQLF's preferred Québec French term and Health Canada's `gluten de blé vital` as a search alias; it remains distinct from high-gluten flour. CFIA's separately standardized `Gluten Flour` wording is not mapped as an alias because equivalence is not established [S105–S107]. Wheat starch / `amidon de blé` is separately integrated as `FLOUR_AND_STARCH`, with `amidon de froment` as its only French alias [S108–S109]. Malted barley flour / `farine d'orge maltée` is separately integrated as `FLOUR_AND_STARCH`, with OQLF's `malt barley flour` as its English alias; general barley flour remains distinct [S110–S113]. Malted wheat flour / `farine de blé maltée` is another separate `FLOUR_AND_STARCH` identity, distinct from general/whole-wheat flour, malted barley flour, and vital wheat gluten [S114–S117]. Roasted barley flour / `farine d'orge torréfiée` is a separate Québec-mill product with the English alias `toasted barley flour`, supported by Eurogerm manufacturer sources defining toasted barley flour as part of a roasted-cereal milling product line [S123–S125, S144–S145]. Regional names `hattai-ko` and `mugikogashi` remain unresolved because their cereal inputs vary and Québec French naming is not established [S141–S143]. Roasted wheat flour / `farine de blé torréfiée` is a Québec-mill product distinct from general and malted wheat flour; roasted wheat malt flour is a separate declared compound ingredient, distinct from both roasted wheat flour and ordinary malted wheat flour [S126–S129]. Roasted corn flour / `farine de maïs torréfiée` is a separate named functional-flour product whose manufacturer describes heat treatment to promote corn-starch gelatinization; do not equate it with precooked corn flour or add a toasted alias without evidence [S86–S89, S130–S131]. Roasted barley has no numeric data; roasted wheat/corn rows have no aliases or numeric/conversion/yield/substitution data. The roasted wheat malt source does not establish a process specification. Cracked wheat remains separate from bulgur/boulgour and from CFIA's crushed/coarse-ground wheat class [S101–S104]. Wheat meal remains an unresolved human-food candidate: Canadian sources separate it from wheat flour and durum semolina, but the tariff groups it with groats and semolina under `gruaux et semoules de froment (blé)`, so no standalone Québec French label or active reference is assigned [S118–S122]. Other grain meals, other malted/toasted flours, and gluten-flour equivalence remain open; other generic toasted names remain unassigned absent product-specific evidence. See `roasted-barley-flour-identity.md`, `roasted-wheat-flours-identity.md`, and `roasted-corn-flour-identity.md`. |
| B1 — almond flour/meal, hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, lupin flours | Partial | Generic soy flour / `farine de soya` is integrated with OQLF's listed French and English terms; keep roasted Kinako separate [S132–S135]. Chana sattu / `farine de sattu` is now a specific roasted Bengal gram (Cicer arietinum) flour identity; generic chickpea flour remains separate, and `besan` is not assigned without preparation context [S136–S140]. Almond flour is retained as one identity, `ground almonds` is removed as an ambiguous alias, and `poudre d'amandes` is added as an attested French-market variant; keep almond meal unassigned until a product or recipe establishes its grind/process scope [S146–S154]. Chickpea flour remains separate from whole chickpeas. Health Canada lists chickpea, fava, lentil, and yellow-pea flours [S9]; Canadian labels support coconut/quinoa/amaranth and other selected flours [S18]. Hazelnut meal, peanut, lentil, pea, and lupin still need independent bilingual naming/source review. |
| B2 — cassava flour, tapioca, polvilho doce/azedo, potato flour/starch, arrowroot, kudzu/kuzu, sweet-potato starch | Partial | Cassava flour vs tapioca starch and potato flour vs potato starch are separate. The existing arrow-root starch identity now accepts source-backed `arrowroot starch`, `arrowroot flour`, `arrowroot powder`, `farine d'arrow-root`, and `fécule d'arrow-root` labels. Two Bob's Red Mill cup weights remain product-specific ledger observations with no active density or unit mapping. Brazilian government guidance and product sources support separate identity-only `polvilho doce` and `polvilho azedo` references. Their English descriptors stay paired with the Brazilian names; no global sweet/sour tapioca alias or generic-starch crosswalk is active. French display wording remains provisional pending Québec review. R73 records the MEXT food-table crosswalk for kudzu starch, while the broad commercial botanical scope and wider B2 coverage remain open. A local English-only `banku mix` listing lacks a French product name, composition, or process details; keep it as a held regional preparation-mix candidate, separate from cooked banku and its component flours, pending Québec package or bilingual evidence [WP02-BANKU-MIX-QUEBEC-20261011-S01–S05]. See `proposals/wp02-banku-mix-quebec-boundary-review-20261011.md`. |
| B3 — mung-bean starch, water-chestnut flour, lotus-root starch, sago, other regional starches | Partial | Sago flour is source-backed and must exclude cassava products locally called sago [S12]. Mung-bean starch / `amidon de haricot mungo` and lotus-root starch / `amidon de racine de lotus` are separate identity-only references; their French displays remain provisional. Bracken-rhizome starch is a distinct held candidate: current Canadian `warabi-ko` listings are blends, and no pure-starch package with a Québec French product name was established. Water-chestnut flour and other regional products remain open. See `proposals/wp02-b2-b3-next-open-flour-starch-review-20261011.md`. |
| B4 — green-banana, plantain, breadfruit, tigernut, yam, taro, other root/fruit flours | Partial | Identity-only `green banana flour / farine de banane verte` and `green plantain flour / farine de banane plantain verte` are integrated as separate source-bounded `FLOUR_AND_STARCH` references. EAS 1106:2023 covers both under one specification but does not establish synonymy; both rows have no aliases, forms, density, mappings, conversions, yields, recipe links, or substitutions. Keep broad `banana flour` / `plantain flour`, ripe products, extracted starch, and peel inclusion unresolved; the French plantain-flour compound remains provisional pending Québec review. See `proposals/wp02-b4-banana-plantain-flour-review-20261010.md`. Breadfruit flour already has an identity-only reference. The French compound remains provisional pending Québec review; all 114 bundled recipes were checked with no demand. Study-specific bulk densities and one cake formulation are recorded in the ledger only; no default density, conversion, or substitution is active. Tigernut, yam, taro, and other regional flours remain open. See `proposals/wp02-breadfruit-flour-boundary-review-20261010.md`. |
| B5 — mochiko, shiratamako, related glutinous-rice products | Partial | Generic glutinous rice flour is integrated separately from ordinary rice flour [S73–S76]. MAFF identifies shiratamako as glutinous-rice flour and joshinko as short-grain rice flour, but this does not establish how `mochiko` and `shiratamako` should be split as catalog products [S74]. Keep the native names unassigned until Japanese milling specifications and Canadian French product naming support their precise identities. |
| B6 — kinako, toasted barley flour, roasted gram flour, functional toasted flours | Partial | Kinako / `poudre de soja Kinako` is integrated as a named roasted-soybean flour product with MAFF-backed English `roasted soybean flour`; generic soy flour remains a separate identity [S132–S135]. Chana sattu / `farine de sattu` is integrated as roasted Bengal gram flour; do not generalize it to all sattu or unqualified gram flour [S136–S140]. Québec mill products also include source-defined roasted barley flour / `farine d'orge torréfiée` and roasted corn flour / `farine de maïs torréfiée`, each as a separate identity [S123–S125, S130–S131]. Eurogerm manufacturer sources support `toasted barley flour` as the English alias of the Québec mill's roasted-barley flour at the shared ingredient-class level [S144–S145]; this does not assert identical brand-specific processing or performance. No French alias is added. Do not infer that a `roasted` label covers all `toasted` products or that roasted corn flour is an alias for the pre-cooked white-corn product. `Hattai-ko` and `mugikogashi` remain unresolved as regional names because exact ingredient scope and Québec French naming are not established [S14, S141–S143]. Other roasted gram products and other functional toasted flours still need review. |
| B7 — gluten-free all-purpose/cup-for-cup/bread/pastry blends | Partial | Treat as composition-dependent products. Keep each recipe’s intended product/formula, label, and ingredient list; no generic gluten-free replacement claim. Category enum choice for a generic family vs brand/product IDs needs integration review. |
| B8 — gari, fufu blends, amala flour, fermented cassava, tapioca pearls, sago pearls, regional granules | Partial | Gari is independently specified; fufu flour blends and amala flour can differ by root/cereal composition, so retain exact regional name/product rather than treating them as one cassava flour. Brazilian polvilho forms are distinct. Pearls/granules need source-material plus form: sago palm and tapioca/cassava are not interchangeable, and “sago” may be used regionally for cassava [S12]. Fufu, amala, and pearl product naming remains open. |
| B9 — whole-root flour vs extracted starch; raw vs pregelatinized/precooked product | Partially reviewed | Source-backed boundaries here are cassava flour vs tapioca starch, potato flour vs potato starch, and non-fermented vs fermented polvilho [S7, S11, S20]. Raw vs pregelatinized/precooked starch remains a research and naming gap; preserve it as a product/form distinction only where sources and recipes support the exact product. No full preparation cross-product is proposed. |

## Rejected, merged, and ambiguous candidates

| Candidate / alias | Disposition | Reason and evidence |
| --- | --- | --- |
| `corn flour` as an unconditional alias of current `ingredient-ref-cornstarch` | Reject global mapping; remove or locale-qualify during integration | OQLF documents the term on both sides of a regional split: finely milled whole maize in one sense, and UK cornstarch in another [S5]. It must prompt disambiguation or use recipe locale/context. |
| Unqualified `farine tout usage non blanchie` as an alias of generic all-purpose flour | Ambiguous; reclassify as a process-qualified product/form or remove alias | “Unbleached” is a meaningful processing qualifier and Canadian product labels sell it as such [S18]. The current seed alias silently supplies a bleaching state that the canonical English display does not specify. |
| `farine à pâtisserie` as a synonym of cake flour | Rejected and corrected | OQLF maps `farine à pâtisserie` to pastry flour; the updated seed assigns it to `ingredient-ref-pastry-flour` and removes it from cake flour. See `baking-specialty-wheat-flours.md`. |
| `ground almonds` as an unconditional alias for almond flour | Rejected and removed | The phrase does not specify grind or processing, and it makes the query `almonds` return both whole almonds and almond flour. Keep exact `almond flour` and its reviewed French labels; leave `almond meal` unassigned [S146–S154]. |
| `almond meal` as a second ingredient identity in every case | Merge when same product/grind; retain distinct form when grind/skin differs | A name label alone is not a stable identity boundary; coarse/unblanched products may behave or appear differently, while same-grind products are described as interchangeable by the cited baking source [S7]. |
| Whole chickpeas or canned/dried chickpeas as chickpea flour/besan | Reject merge | FSSAI defines besan as a ground flour product from dehusked Bengal gram; the existing seed ID describes the pulse itself [S9, S10]. |
| Tapioca starch / tapioca flour as edible cassava flour | Reject merge | Tapioca is extracted cassava starch; Codex cassava flour is milled dried chips/paste with fibre separated by sifting [S6, S11, S18]. |
| Potato starch as potato flour | Reject merge despite a confusing OQLF English cross-reference | Whole cooked/dried potato powder and washed/extracted potato starch differ in composition and baking use [S38, S39]. Use package/manufacturing context where source wording says “flour.” |
| Sago flour or sago pearls as tapioca by default | Reject silent merge; require source-material evidence | Codex sago flour is palm-pith product; the standard excludes cassava tapioca even though some regions call tapioca “sago flour” [S12]. Pearl shape alone does not identify the starch source. |
| `sweet rice flour` as sweetened flour or wheat-gluten flour | Reject | MAFF uses “glutinous rice flour”; Canadian labels use “farine de riz blanc gluant” [S14, S18]. `Sweet`/`glutinous` is a rice identity descriptor, not added sugar or wheat gluten. |
| `polvilho azedo` as `polvilho doce` or plain cassava starch | Reject merge | Brazilian MAPA says these are cassava-derived products fermented to different degrees; the fermentation changes product identity/function [S20]. |
| `fufu flour`, `amala flour`, and `gari` as aliases of each other | No merge | Exact compositions and processing are region/product dependent; Codex explicitly defines gari as a processed cassava food [S13]. Fufu/amala require regional primary sources before naming records can be accepted. |
| Cornmeal, whole-kernel corn flour, masa harina, precooked corn flour, and cornstarch | Keep separate; ambiguous `corn flour` alias removed | Whole-kernel flour, meal, and extracted starch remain distinct [S5, S8]. The English spelling `corn flour` collides between Québec whole-kernel maize flour and UK cornstarch, so it is not a global alias [S88–S89]. Masa harina is nixtamalized; precooked corn flour follows a separate precooking pathway [S81–S87]. Fine/medium/coarse cornmeal grinds are descriptors [S5]. |

## Measurements and substitutions

- **Identity evidence:** accepted IDs above passed integration review; the remaining proposed identities still need reviewer approval.
- **Measurement state:** no new observations researched in this packet. At the initial packet audit, the seven related existing records had `defaultDensity: null` and empty `unitMappings`; all proposed candidates and newly accepted identities remain `not_yet_researched`. This packet provides no density, cup weight, cooking yield, or measurement conversion.
- **Substitution state:** no substitutes researched in this packet. Every new candidate remains `not_yet_researched`. No flour blend, flour type, meal, or starch is claimed to be interchangeable with another.
- Product identity and usage terms cited from baking sources do not authorize a substitution ratio.

## Acceptance checks and review status

| Check | Evidence / state |
| --- | --- |
| Canonical snapshot inspected before proposing records | Pass: the fingerprinted packet snapshot had 229 references; seven related ID/name hits; six actual flour/starch product IDs and one whole-chickpea ID are listed above. Twenty-five identity-only rows from this A–B packet are now integrated; four A1 specialist-flour rows are documented in `baking-specialty-wheat-flours.md`. |
| Current model categories grounded in repository | Pass: the current `IngredientCategory` enum contains `FLOUR_AND_STARCH`, `GRAIN_AND_CEREAL`, `LEGUME_AND_PULSE`, and `BAKING_MIXIN_AND_PANTRY`; the eighteen flour/starch identities at the 260-reference checkpoint used the existing `FLOUR_AND_STARCH` value. The separate A1 and later A2/A4 additions use that same existing category. |
| Existing IDs preserved and secondary-catalog overlaps identified | Pass: `ingredient-ref-whole-wheat-flour` existed in the former Kotlin catalog and is now restored to canonical seed under the same stable ID; no new ID reservation was needed. |
| English/fr-CA names supported by named sources | Partial: source-backed proposals are marked with source IDs; unresolved names are listed without invented translations. Bilingual reviewer sign-off remains open. |
| Alias collisions and rejected merges documented | Pass: corn flour, unbleached AP flour, pastry/cake flour, almond meal, cassava/tapioca, potato flour/starch, sago/tapioca, besan/chickpea, and rice terminology are addressed. |
| No unsupported numeric evidence added | Pass: this artifact contains no proposed conversion, density, yield, or substitute ratio. |
| Research packet independently reviewed and accepted for integration | Partial: the original A–B packet enumerated 48 flour/starch rows and four A7 grain/cereal milling-fraction or processed-cereal rows. Ten Italian/French regional classes were added in the 2026-10-10 follow-up; broad category coverage and independent Québec terminology review remain open. |
| Global plan checklist A–B updated | Partial: progress and accepted IDs are recorded in the plan; category-level A–B checkboxes remain open because most checklist coverage is incomplete. |

The research-only phase did not run builds or tests. After the partial integration merge, seed normalization, schema validation, package tests, the full Gradle suite, and Pixel 9a QA passed; exact results are recorded in the plan execution update.

## Unresolved gaps and next review actions

1. The whole-wheat ID reconciliation is complete. Have the bilingual terminology reviewer approve or reject the remaining proposed English/fr-CA labels and distinctions for flour grades, potato flour/starch, and regional native names.
2. Resolve remaining aliases already in the seed: `corn flour`, `farine tout usage non blanchie`, and `ground almonds`.
3. Continue source review for other regional flour distinctions; complete independent Québec review of remaining flour labels; review white whole-wheat flour, pumpernickel meal, remaining extraction/grind grades for rye, spelt, einkorn, emmer, Khorasan, and barley, teff product grades/aliases, fonio flour processing and its generic-vs-qualified product boundary, vital gluten, and other malted/toasted flour products; hazelnut, chestnut, peanut, lentil, pea, lupin, coconut, and other alternative flours; water-chestnut flour; and the remaining broad kudzu botanical scope plus Québec wording for the integrated kudzu, sweet-potato, mung-bean, lotus-root, and polvilho starch identities. Continue green-banana and green-plantain flour boundary review only for unqualified/ripe products, extracted starch, and process qualifiers, plus tigernut/yam/taro flours (breadfruit flour is already identity-only, with Québec naming and numeric evidence reviewed separately); the milling/product split for mochiko and shiratamako; regional Hattai-ko/mugikogashi products and roasted gram; and fufu/amala and regional pearls/granules. The manufacturer-backed English alias `toasted barley flour` is integrated for the shared roasted-barley-flour class; regional Japanese terms remain unresolved. See `soy-flour-kinako-identities.md` for the distinct soy-flour and Kinako records, and `toasted-barley-boundary-review.md` for the regional-product boundary.
4. For every accepted identity, separately collect evidence for measurement and substitution. Do not reuse product-chart weights in this identity batch.
5. Re-run duplicate and normalized-alias collision checks against both current data sources for each later batch.

## Source register

Sources S1–S97 were accessed on 2026-10-05; S98–S145 were accessed on 2026-10-06. Sources are used only for the specific identity/name/process statements noted above. Nutrition portion values and baking weight charts were not imported as measurements.

| Ref | Source | Use / limits |
| --- | --- | --- |
| S1 | [OQLF, farine tout usage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage) | Québec French preferred term and English all-purpose/plain flour terms; notes naming/classification vary by country. |
| S2 | [CFIA, Canadian Food Compositional Standards, Volume 12](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Canadian identity/process definitions for whole-wheat/entire-wheat, graham, gluten flour, cracked/coarse-ground wheat, and corn starch. Not a density source. |
| S3 | [Health Canada, Canadian Nutrient File: wheat flour, whole-wheat](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4500) | Bilingual food name `wheat flour, whole-wheat / farine de blé entier`; serving data deliberately not copied. |
| S4 | [Statistics Canada, Food Code (bilingual, archived)](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf) | Canadian bilingual terminology for cake flour, durum semolina/flour, oat flour, rice flour, rye flour, corn flour/meal, wheat germ, bran, and related milling products. Older food-code names are terminology evidence, not current product standards. |
| S5 | [OQLF, farine de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais); [OQLF, semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais); [OQLF, amidon de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais) | Québec definitions and English regional labels for whole-kernel corn flour, corn meal, and corn starch; supports the `corn flour` collision decision. |
| S6 | [OQLF, arrow-root](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522596/arrow-root); [OQLF, fécule de pomme de terre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre); [OQLF, amidon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon); [OQLF, tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca); [OQLF, fécule de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc) | Québec French starch names and definitions, including extraction source and the potential English potato-flour cross-reference ambiguity. |
| S7 | [King Arthur Baking, Flour 101](https://www.kingarthurbaking.com/learn/flour); [Whole Grains](https://www.kingarthurbaking.com/learn/guides/whole-grains); [Almond flour 101](https://www.kingarthurbaking.com/blog/2021/01/11/almond-flour-guide-gluten-free-baking); [How to substitute for potato flour](https://www.kingarthurbaking.com/blog/2017/11/17/potato-flour-substitute) | Technical baking distinctions and product/process behavior (wheat classes, almond meal/grind, potato flour vs extracted starch). Do not transplant its weights as universal conversions. |
| S8 | [Codex standards list for cereals and milling products](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/en/?ids=91); [French Codex list](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/fr/) | Product-specific standards and recognized classes including durum wheat semolina/flour, sorghum flour, pearl millet flour, maize products, wheat flour, oats, rice, and quinoa. |
| S9 | [Health Canada, list of food and food ingredient determinations that are not novel](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) | French names for chickpea, fava, yellow-lentil, and yellow-pea flours; list is terminology/food-history evidence, not baking performance or safety advice. |
| S10 | [FSSAI, Cereals and Cereal Products standards](https://fssai.gov.in/upload/uploadfiles/files/5_%20Chapter%202_4%20%28Cereals%20and%20Cereal%20products%29%281%29.pdf) | India-specific definitions for atta, maida, semolina/suji/rawa, and besan; do not map regional classes one-to-one to Canadian/US flour types. |
| S11 | [Codex, Standard for Edible Cassava Flour (English)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ar/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+176-1989%2FCXS_176e.pdf); [French version](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B176-1989%252FCXS_176f.pdf) | Defines the whole-root edible cassava flour product and provides the French name; separates it from tapioca starch. |
| S12 | [Codex, Regional Standard for Edible Sago Flour (French)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ru/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B301R-2011%252FCXS_301Rf.pdf); [FAO terminology entry](https://www.fao.org/faoterm/viewentry/en/?entryId=172732) | Palm-pith sago flour definition and explicit exclusion of tapioca/cassava products also called sago regionally; French `farine de sagou comestible`. |
| S13 | [Codex, Standard for Gari (French)](https://www.fao.org/input/download/standards/49/CXS_151f.pdf) | Regional cassava-processing identity, French definition, and retained product name `gari`. |
| S14 | [Japan MAFF, Beko mochi](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4348/index.html); [Kushi-dango](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/7285/index.html); [Yaseuma](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/6819/index.html) | Regional product usage and names for shiratamako, joshinko, kinako, and hattai-ko/mugikogashi; recipes are not a comprehensive milling taxonomy. |
| S15 | [King Arthur Baking, Which gluten-free flour should I use?](https://www.kingarthurbaking.com/blog/2023/05/04/which-gluten-free-flour-should-i-use) | Shows that a branded gluten-free flour blend is a specific formulation/use class, not a universal flour identity or a substitution rule. |
| S16 | [Italy, DPR 9 February 2001 no. 187](https://www.normattiva.it/atto/caricaDettaglioAtto?atto.codiceRedazionale=001G0242&atto.dataPubblicazioneGazzetta=2001-05-22&bloccoAggiornamentoBreadCrumb=true&classica=true&dataVigenza=&generaTabId=true&qId=&tabID=&tipoDettaglio=multivigenza&title=lbl.dettaglioAtto) | Legal type labels for Italian soft-wheat flours, including tipo 00/0/1/2; not interchangeable with other national classifications by number alone. |
| S17 | [FranceAgriMer, Enquête sur les types de farines](https://www.franceagrimer.fr/sites/default/files/rdd/documents/ETU-CER-farine%202010_2.pdf); [French Ministry regional education guide](https://driaaf.ile-de-france.agriculture.gouv.fr/IMG/pdf/Guide_pratique_de_l_accueil_des_ecoles_primaires_chez_les_professionnels_de_la_filiere_cerealiere_cle054b17.pdf) | French T classes are regional classes keyed to ash/mineral content and milling/extraction, distinct from US classes. Regional source is not a Québec naming authority. |
| S18 | [Bob’s Red Mill 2026 Canadian French product list](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/4-5/); [page 6–7](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/6-7/); [page 8–9](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/8-9/); [2022 Canadian list, baking essentials](https://bobs-ebooks.cld.bz/2022-Canadian-Product-List/Baking-Essentials/) | Canadian French product-label terminology and ingredient lists for named flour/starch products and blends. The 2022 product list specifically labels potato flour `Farine de Pomme de Terre`; brand-specific compositions and labels must not be generalized to every product carrying a similar name. |
| S19 | [Bob’s Red Mill 2026 US product list, flour/meal page](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Product-List) | Brand labels distinguish corn flour/masa harina and cornmeal products; used only to support product-label distinctions, not as universal recipes or composition standards. |
| S20 | [Brazil MAPA, Polvilhos technical guidance](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/arquivos/orientacao_tecnica_oficio_circular_nr_01_2022-polvilhos); [Emater-MG, cassava polvilho processing](https://www.emater.mg.gov.br/doc/site/serevicoseprodutos/livraria/Agroind%C3%BAstria/processamento%20artesanal%20da%20mandioca%20-%20fabrica%C3%A7%C3%A3o%20do%20polvilho.pdf) | Regional Portuguese source distinguishing native/non-fermented cassava starch and fermented polvilho doce/azedo. French display labels remain open. |
| S21 | [SATAU / Cuisine Soleil, Canadian bilingual flour portfolio](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-GTA-2020-10-29.pdf); [SATAU, current French Cuisine Soleil product list](https://satau.ca/fr/nos-produits/cuisine-soleil/) | The bilingual portfolio labels quinoa, amaranth, brown-rice, buckwheat, millet, chickpea, soy, coconut, and tapioca flour products; the current French product listing uses forms including `farine de quinoa`, `farine d'amarante`, and `fécule de tapioca`. Manufacturer labels establish documented market wording, not universal composition or density/substitution data. |
| S22 | [Bob's Red Mill Canada, almond flour](https://www.bobsredmill.ca/produit/almond-meal-flour); [Robin Hood Canada, almond flour](https://www.robinhood.ca/fr/produits/farine-de-specialite/amande) | Canadian manufacturer pages use `Almond Flour / Farine d'amandes` and `Farine d'amande`, and identify finely ground blanched almonds as a product; used for naming and product-specific identity only. They do not establish a universal meal/flour equivalence. |
| S23 | [OQLF, semoule de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur) | Québec terminology and definition for durum semolina; the integration accepts only the durum-qualified English display and leaves generic `semolina` unassigned. |
| S24 | [OQLF, fécule de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc) | Defines extracted manioc starch and lists `tapioca starch` as an English term; supports keeping starch distinct from whole-root cassava flour. |
| S25 | [SATAU / Cuisine Soleil, current French product list](https://satau.ca/fr/nos-produits/cuisine-soleil/) | Current Canadian French labels include buckwheat, chickpea, quinoa, and brown-rice flours; these are market names, not universal composition or conversion evidence. |
| S26 | [SATAU / Cuisine Soleil, bilingual product portfolio](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-EN-2023-06-12.pdf) | Product packages pair oat flour, amaranth flour, quinoa flour, brown-rice flour, buckwheat flour, and chickpea flour with Canadian French labels. Its amaranth package spelling is recorded for review but not activated as an alias. The portfolio supports product naming only. |
| S27 | [OQLF, farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz) | Current Québec French term and definition for rice flour; notes white- and brown-rice source forms. |
| S28 | [OQLF, amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante) | Preferred Québec French botanical name and note that the seeds can be milled into flour; supports `farine d'amarante`. |
| S29 | [Health Canada, food ingredient determinations that are not novel](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) | Uses the exact French name `farine de pois chiche` in a dated ingredient entry; used for terminology only, not a safety recommendation. |
| S30 | [OQLF, amaranthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8884624/amaranthe) | Defines `amaranthe` as a red-brown powder used to colour foods and associates `amarante`; supports leaving the supplier spelling out of unconditional automatic matching. |
| S31 | [OQLF, farine de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin) | Directly pairs the preferred Québec French term `farine de sarrasin` with English `buckwheat flour`. |
| S32 | [Health Canada, Canadian Nutrient File: whole-grain oat flour](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6275) | Uses the bilingual identity `oat flour, whole-grain / farine d'avoine, grains entiers`; serving values were not imported. |
| S33 | [Codex, Norme pour la farine de sorgho (CXS 173-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+173-1989%2FCXS_173f.pdf) | Confirms sorghum flour as a named milling product separate from grain sorghum and gives the official French name. |
| S34 | [Codex, Norme pour la farine de mil chandelle (CXS 170-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B170-1989%252FCXS_170f.pdf) | Defines pearl millet flour as a distinct product and uses the exact French name `farine de mil chandelle`. |
| S35 | [Codex, Norme pour la farine comestible de manioc (CXS 176-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B176-1989%252FCXS_176f.pdf) | Names whole-root edible cassava flour and supports keeping it separate from extracted tapioca starch. |
| S36 | [Codex, Norme régionale pour la farine de sagou comestible (CXS 301R-2011)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ru/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B301R-2011%252FCXS_301Rf.pdf) | Limits edible sago flour to palm pith and excludes cassava/tapioca products sometimes called sago regionally. |
| S37 | [Statistics Canada, Food Code (bilingual, archived)](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf) | Entry 1650/F448, p. 29, pairs `potato flour` with `farine de pomme de terre`. |
| S38 | [King Arthur Baking, How to substitute for potato flour](https://www.kingarthurbaking.com/blog/2017/11/17/potato-flour-substitute) | Distinguishes cooked, dried, ground whole-potato flour from starch extracted by washing crushed potatoes; process distinction only, not a conversion or substitution recommendation. |
| S39 | [OQLF, fécule de pomme de terre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre) | Supports the Québec French potato-starch display and French naming variants; its English cross-reference to `potato flour` remains inactive due to the distinct product identity. |
| S40 | [Codex, Standard for Gari (CXS 151, French)](https://www.fao.org/input/download/standards/49/CXS_151f.pdf) | Defines the processed cassava product and retains `gari` as the French product name. |
| S41 | [OQLF, atta](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574258/atta) | Québec French and English terms for atta, including accepted French and English aliases; defines this Indian wheat-flour identity. No measurement data is used. |
| S42 | [FSSAI, Chapter 2.4 Cereal (Cereals and cereal products)](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4%20%28Cereals%20and%20Cereal%20products%29%281%29.pdf) | Section 2.4.2 defines maida (refined wheat flour) as wheat milled with bran and germ essentially removed and the remainder comminuted to a suitable fineness. No numeric specifications are imported. |
| S43 | [Metro, Farine tout usage Maida Divya](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage/p/062781201595) | French-language Canadian listing, same product number 062781201595, uses `Farine tout usage, Maida`; the broad phrase is not made an alias. |
| S44 | [Food Basics, Divya Maida All Purpose Flour](https://www.foodbasics.ca/aisles/pantry/baking-ingredients/flour-baking-essentials/all-purpose-flour/p/062781201595) | English-language Canadian listing, same product number 062781201595, uses `All Purpose Flour, Maida`; it supports retaining the name Maida but not a generic all-purpose alias. |
| S45 | [Gazzetta Ufficiale, Presidential Decree No. 187, Article 2](https://www.gazzettaufficiale.it/atto/serie_generale/caricaArticolo?art.codiceRedazionale=001G0242&art.dataPubblicazioneGazzetta=2001-05-22&art.flagTipoArticolo=0&art.idArticolo=2&art.idGruppo=1&art.idSottoArticolo=1&art.idSottoArticolo1=10&art.progressivo=0&art.versione=1) | Defines durum semola as a granular milling product and permits remilling semola and semolato for breadmaking and consumers. No numeric limit is activated. |
| S46 | [European Commission, Pane di Matera PGI specification amendment (French)](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=oj%3AJOC_2017_305_R_0013) | Names semola rimacinata as extra-fine semola and distinguishes it from semolato (fine semolina) for the protected bread product. |
| S47 | [OQLF, semoule de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur) | Defines ordinary durum semolina as coarsely milled and gives `durum semolina` as the English equivalent. |
| S48 | [Les Importations Olea, Vecchio Molino rice and flours](https://olea.ca/fr/produits-alimentaires-italiens/riz-et-farines/vecchio-molino) | Québec-market importer lists `Semola rimacinata` and the French label `Semoule de blé dur remoulue` for the same item. |
| S49 | [Le 5 Stagioni, Semola Rimacinata](https://le5stagioni.com/en/prodotto/semola-rimacinata/) | Manufacturer uses `durum wheat remilled semolina` in English; no product-performance claims are activated. |
| S50 | [Bulk Mart, 5 Stagioni Semolina Rimacinata](https://bulkmart.ca/collections/pizza-flour/products/5-stagioni-semolina-rimacinata-durum-wheat-remilled-semolina-10-kg) | Canadian product title pairs `Semolina Rimacinata` with `Durum Wheat Remilled Semolina`, supporting the English alias spelling. |
| S51 | [Gazzetta Ufficiale, Presidential Decree No. 187, Article 2](https://www.gazzettaufficiale.it/atto/serie_generale/caricaArticolo?art.codiceRedazionale=001G0242&art.dataPubblicazioneGazzetta=2001-05-22&art.flagTipoArticolo=0&art.idArticolo=2&art.idGruppo=1&art.idSottoArticolo=1&art.idSottoArticolo1=10&art.progressivo=0&art.versione=1) | Defines durum flour as non-granular and semola as granular; legal limits are not imported. |
| S52 | [OQLF, farine de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357377/farine-de-ble-dur) | Supports the Québec French display and alias plus English `durum flour` / `durum wheat flour`. |
| S53 | [OQLF, farine de seigle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle) | Prefers the Québec French term and lists `rye flour` as the English equivalent; notes that rye flours include light and dark products. |
| S54 | [AGROBIO, 2023 product catalog](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf) | Québec-grown rye flour package pairs `FARINE DE SEIGLE` and `ORGANIC RYE FLOUR`. Product-specific claims are not imported. |
| S55 | [La Milanaise, organic whole rye flour](https://lamilanaise.com/produits/farine-de-seigle-entiere-biologique-la-milanaise/) | Québec mill offers a separately qualified whole-rye flour; no grade or numeric data is activated in the general identity. |
| S56 | [OQLF, épeautre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre) | Gives `spelt` as the English equivalent and identifies the botanical taxon *Triticum aestivum* subsp. *spelta*. |
| S57 | [AGROBIO, 2023 product catalog](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf) | Page 5 and the bilingual bag label support `farine d’épeautre / organic spelt flour`; product-specific claims are not imported. |
| S58 | [Québec Food Directory, organic small-spelt flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203721) | Names `farine de petit épeautre` and describes petit épeautre as engrain; it remains outside the spelt alias set. |
| S59 | [La Milanaise, farine de petit épeautre entière biologique](https://lamilanaise.com/produits/farine-de-petit-epeautre-entiere-biologique/) | Uses the French flour name, calls petit épeautre engrain, and explicitly distinguishes it from épeautre/spelt despite similar names. Product qualifiers are not imported. |
| S60 | [La Milanaise, Organic Whole Einkorn Flour](https://lamilanaise.com/en/produits/organic-whole-einkorn-flour/) | Pairs the English name with the French product and explicitly distinguishes einkorn from spelt. Product-specific qualifiers and properties are not imported. |
| S61 | [Québec Food Directory, organic einkorn flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203721) | Lists `Farine de petit épeautre Biologique` in French and `Organic Einkorn Flour` in English; the page credits product data to GS1. No serving or nutrition data is used. |
| S62 | [OQLF, amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier) | Pairs `amidonnier` with `emmer`, identifies *Triticum dicoccum*, and records `farro` as an acceptable cereal term; it does not establish unqualified `farro` as a flour ingredient. |
| S63 | [Arva Flour Mill, Organic Whole Emmer Flour](https://arvaflourmills.com/products/whole-emmer-flour) | Ontario mill product title supports the English flour identity; whole-grain and organic qualifiers are not imported. |
| S64 | [Biofarm, farine d'amidonnier mi-blanche](https://biofarm.ch/fr/emmerhalbweissmehl-ch-16760-g) | French-language flour product title and ingredient list support `farine d'amidonnier`; its Swiss origin and mi-blanche grade are not imported. |
| S65 | [OQLF, blé khorasan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan) | Identifies the preferred French term `blé khorasan`, English `Khorasan wheat`, and *Triticum turanicum*; explicitly marks `Kamut` and `blé Kamut` as trademarks. |
| S66 | [Québec Food Directory, La Milanaise Khorasan flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201408) | Lists the English `Organic Unbleached White Khorasan Flour` and French `Farine de Khorasan blanche non blanchie biologique` names for the same Québec-market product. Grade, organic, nutrition, enrichment, and baking claims are not imported. |
| S67 | [La Milanaise, Organic Whole Khorasan Flour](https://lamilanaise.com/en/produits/organic-whole-khorasan-flour/) | Québec mill's English product title corroborates Khorasan as a flour identity; whole and organic qualifiers are not imported. |
| S68 | [La Milanaise, farine de khorasan entière biologique](https://lamilanaise.com/produits/farine-de-khorasan-entiere-biologique/) | Québec mill's French product title corroborates `farine de khorasan`; whole and organic qualifiers are not imported. |
| S69 | [OQLF, farine d'orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge) | Directly pairs the preferred Québec French term `farine d'orge` with English `barley flour`; its historical technical note is not used for current performance claims. |
| S70 | [La Milanaise, Organic Whole Barley Flour](https://lamilanaise.com/en/produits/organic-whole-barley-flour/) | Québec mill's English product page corroborates barley flour; whole-grain and organic qualifiers, classifications, numeric details, and usage claims are not imported. |
| S71 | [La Milanaise, farine d'orge entière biologique](https://lamilanaise.com/produits/farine-orge-entiere-biologique/) | Québec mill's French product page corroborates `farine d'orge`; whole-grain and organic qualifiers, classifications, numeric details, and usage claims are not imported. |
| S72 | [OQLF, farine d'orge maltée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee) | Pairs `farine d'orge maltée` with English `malt barley flour`, supporting a product name distinct from general barley flour; the English term is now an alias only on the separate malted-barley-flour identity. |
| S73 | [OQLF, riz glutineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux) | Lists `riz gluant` as a preferred Québec French term for the source grain alongside `riz glutineux` and `riz doux`; used for the source-grain qualifier, not a flour alias. |
| S74 | [Japan Ministry of Agriculture, Forestry and Fisheries, Kushi-dango](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/7285/index.html) | Identifies shiratamako as glutinous rice flour and joshinko as short-grain rice flour, then uses both separately in one recipe. Native product names remain under review. |
| S75 | [Kosa Foods, Glutinous Rice Flour](https://www.kosafoods.com/shop/) | Manufacturer product listing names glutinous rice flour, lists glutinous rice as its ingredient, and gives `sweet rice flour` and `sweet rice powder` as alternate names. |
| S76 | [SUE Foods, Farine de riz gluant](https://suefoods.com/products/king-elephant-brand-farine-de-riz-gluant) | Québec-market listing uses the exact French product name and describes the flour as made from glutinous rice. |
| S77 | [USA Rice, Rice Flour 101](https://www.usarice.com/thinkrice/detail-pages/blog/rice-flour-101-everything-you-need-to-know) | Distinguishes bran-retaining brown rice flour from white rice flour milled without bran and describes differences in color, texture, and flavor; no numeric or substitution claim is used. |
| S78 | [QUeen Milling, product collection](https://www.queenmilling.ca/collections/all) | Canadian mill lists superfine white rice flour and wholegrain brown rice flour as separate products. |
| S79 | [QUeen Milling, French storefront](https://www.queenmilling.ca/fr) | Lists separate French products `farine de riz blanc extra-fine` and `farine de riz brun complet superfine`. |
| S80 | [SATAU / Cuisine Soleil, current French product list](https://satau.ca/fr/nos-produits/cuisine-soleil/) | Uses the standalone Québec-market name `farine de riz brun`; supplier package, organic, and certification qualifiers are not imported. |
| S81 | [University of Saskatchewan, Traditional corn tortillas](https://gardening.usask.ca/articles-and-lists/articles-recipes/corn-tortillas.php) | Defines masa harina as maize cured with limewater (nixtamalization) and distinguishes it from cornmeal and untreated American corn flour; no recipe ratio or nutrition claim is imported. |
| S82 | [Casa Sabor, Farine de maïs nixtamalisée (masa harina)](https://www.casa-sabor.ca/product/21076646/farine-de-mais-nixtamalisee-masa) | Québec-market supplier uses the exact French product name and identifies masa harina as nixtamalized maize flour. Product size and serving/use claims are not imported. |
| S83 | [Gwirtz and Garcia-Casal, Processing maize flour and corn meal food products](https://pubmed.ncbi.nlm.nih.gov/24329576/) | Technical review treats precooked refined maize flour and dehydrated nixtamalized flour as separate processing products; no numeric or nutritional data is used. |
| S84 | [P.A.N. Food Business Solutions, Pre-cooked White Corn Meal](https://panfoodbusiness.global/en/harina-precocida-de-maiz-blanco-english/) | Manufacturer documents pre-cooked white corn flour as its own product; supports a separate precooked-maize review, not an alias or equivalence claim. |
| S85 | [Gwirtz and Garcia-Casal, Processing maize flour and corn meal food products](https://pubmed.ncbi.nlm.nih.gov/24329576/) | Abstract identifies precooked refined maize flour and dehydrated nixtamalized flour as separate products with different processing pathways; no nutritional or numeric claim is imported. |
| S86 | [P.A.N. Food Business Solutions, Pre-cooked White Corn Meal](https://panfoodbusiness.global/en/harina-precocida-de-maiz-blanco-english/) | Manufacturer calls its product pre-cooked and specifies it is 100% pre-cooked white corn flour, contrasting it with whole corn and raw corn flour; no brand, color, or application qualifier is imported. |
| S87 | [L'Española, Farine de maïs précuite DOÑA AREPA](https://lespanola.com/fr/products/chapelure-pan-rallado-500-g-1) | Montréal supplier uses the exact French product name and lists its ingredient as precooked corn flour; the brand name is not an alias. |
| S88 | [OQLF, farine de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais) | Defines farine de maïs as fine powder from milled kernels; lists English `corn flour` and flags `cornstarch` as a UK term. The entry was updated in 2025. |
| S89 | [OQLF, amidon de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais) | Defines the maize starch product and lists English `corn starch`, `maize starch` (UK), and `corn flour` (UK); supports leaving the region-colliding spelling out of global aliases. |
| S90 | [OQLF, tef](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef) | Defines the cereal, gives English `teff`, and marks French `tef` as recommended but non-current; `tef` is not activated as a flour alias. |
| S91 | [Bob's Red Mill, Teff Flour](https://www.bobsredmill.com/product/teff-flour) | Manufacturer labels the milling product `Teff Flour` and lists whole grain teff as its ingredient. Whole-grain, gluten-free, nutrition, and use claims are not imported. |
| S92 | [La Chèvre et le Chou, Farine de teff bio](https://lachevreetlechou.ca/produits/farine-de-teff-bio) | Québec French-market product page uses the exact name `farine de teff` and lists teff as the ingredient; organic and brand qualifiers are not imported. |
| S93 | [Aga's Wholesome, Fonio (Acha) Flour](https://www.agaswholesome.ca/products/fonio-flour) | Canadian product page identifies flour made from 100% ground dehulled fonio grain (*Digitaria exilis*); brand, dietary, nutrition, and use claims are not generalized. |
| S94 | [MyChopChop, Fonio Flour (Acha Fufu)](https://www.mychopchop.ca/products/acha-flour) | Canadian retail listing says the flour is made by milling whole fonio grains sourced from West Africa. This is a second product description, not proof of an identical dehulling/milling process. |
| S95 | [Afrique Verte, Analyse de la valeur nutritive des produits transformés au Burkina](https://www.afriqueverte.org/r2_public/media/fck/File/Documentation/Etudes/valeur-nutritive-des-cereales-transformees-au-burkina.pdf) | Regional processing report (2010), pp. 14–15, names flour from decorticated/whitened fonio and separately discusses precooked and steamed fonio products; used only to keep products/processes distinct. |
| S96 | [Mako Foods, Farine de Fonio Torréfié](https://www.makofoods.ca/products/farine-de-fonio-torrefie-600-g?variant=45458309415098) | Québec-market product listing gives a roasted-fonio flour name; keep roasting explicit pending identity/form review. |
| S97 | [Mako Foods, Farine de Fonio Précuit](https://www.makofoods.ca/products/farine-de-fonio-precuit-700-g?variant=45458303549626) | Québec-market product listing gives a precooked-fonio flour name; keep precooking explicit pending identity/form review. |
| S98 | [OQLF, son de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18097318/son-de-ble) | Québec terminology entry pairs the preferred French term `son de blé` with English `wheat bran`; naming evidence only. |
| S99 | [OQLF, germe de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432763/germe-de-ble) | Defines `germe de blé` as the wheat-kernel embryo, notes its removal during milling, and gives English `wheat germ`; supports a separate milling-fraction identity. |
| S100 | [Bob’s Red Mill, 2026 Canadian French Product List, pages 28–29](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/28-29/) | Lists `Son de blé / Wheat Bran` and `Germe de blé / Wheat Germ` as separately named Canadian-market products; used for bilingual naming only, not numeric or functional claims. |
| S101 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Section 12.1.7 defines cracked wheat separately from crushed/coarse-ground wheat; sieve, ash, and moisture limits are not imported into the catalog. |
| S102 | [CFIA, cereals and bakery products (French)](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie) | Official French cereal guidance uses `blé concassé`; supports French naming only. |
| S103 | [Arva Flour Mills, Blé concassé 700 g](https://arvaflourmills.com/fr/products/cracked-wheat) | Ontario mill's French product page uses `blé concassé` and describes crushed whole raw wheat kernels; no brand or product-specific behavior is generalized. |
| S104 | [OQLF, boulgour](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour) | Defines `boulgour / bulgur` as sprouted wheat that is precooked, dried, and cracked, supporting separation from raw cracked wheat. |
| S105 | [OQLF, gluten de froment élastique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084319/gluten-de-froment-elastique) | Preferred Québec French term and English `vital wheat gluten`; defines the industrial wheat-gluten product by its hydrated/rehydrated agglomerating and elastic properties. |
| S106 | [Health Canada, Canadian Nutrient File: Wheat, vital wheat gluten](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6591) | Bilingual name `Wheat, vital wheat gluten / Blé, gluten de blé vital`; the serving value is not imported. |
| S107 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Section 12.1.5 separately standardizes `Gluten Flour` and sets moisture/starch limits; no universal alias/equivalence is inferred for vital wheat gluten. |
| S108 | [OQLF, amidon de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432751/amidon-de-froment) | Defines wheat starch from *Triticum*, pairs it with English `wheat starch`, and lists `amidon de blé` and `amidon de froment` as preferred French terms. |
| S109 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Section 12.2.1 lists wheat starch separately from wheat flour, wheat meal, and gluten flour as a possible grain ingredient in bread; numeric limits are not imported. |
| S110 | [OQLF, farine d'orge maltée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee) | Pairs the preferred Québec French term `farine d'orge maltée` with English `malt barley flour` in the flour domain. |
| S111 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Volume 12, section 12.1.1 names malted barley flour separately from malted wheat flour as a permitted flour ingredient; limits and amounts are not imported. |
| S112 | [Arva Flour Mills, Malted Barley Flour](https://arvaflourmills.com/products/malted-barley-flour) | Ontario mill's English product page describes barley that is germinated, dried, and ground. Diastatic/non-diastatic product variants are not generalized into catalog forms. |
| S113 | [Arva Flour Mills, Farine d'orge maltée](https://arvaflourmills.com/fr/products/malted-barley-flour) | The French product page uses `farine d'orge maltée` for the same malted-barley-flour product; product-specific variants are not generalized. |
| S114 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Volume 12, section 12.1.1 names malted wheat flour separately from malted barley flour; limits and amounts are not imported. |
| S115 | [TERMIUM Plus, Government of Canada](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esw&lang=eng&srchtxt=TRIGO) | Bilingual terminology entry pairs `malted wheat flour` with `farine de blé maltée`. |
| S116 | [Molino Bongiovanni, catalogue de produits maltés](https://www.molinobongiovanni.com/files/ProductsCatalogVer1-FR.pdf) | French product name and description of flour made by germinating, drying, and milling wheat; no technical quantity is imported. |
| S117 | [Whole-Grains, Canadian product list](https://whole-grains.ca/) | Bilingual ingredient lists name malted wheat and barley flours separately in products containing both cereal ingredients. |

| S118 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Volume 12, section 12.2.1(h) lists wheat meal separately from whole-wheat flour, graham flour, gluten flour, and wheat starch as a possible bread ingredient, without defining its composition. Amounts are not imported. |
| S119 | [Statistics Canada, NAPCS 2022, 1821294 Grain products for human consumption, n.e.c.](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1821294&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502) | Lists `wheat meal (except durum semolina)` as an illustrative human-consumption grain product. |
| S120 | [Statistics Canada, NAPCS 2022, 18212 Flour and other grain mill products](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=2&CPV=18212&CST=17022022&CVD=1384663&D=1&Function=getVD&MLV=4&TVD=1384502) | Excludes wheat meal from the wheat-flour class and redirects it to grain products for human consumption, n.e.c. |
| S121 | [CBSA, Customs Tariff T2026-2, Chapter 11 (English)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html) | Heading 11.03 groups wheat groats and meal; note 3 defines the group by cereal-grain fragmentation and particle-size criteria. Thresholds are not imported into a kitchen ingredient identity. |
| S122 | [ASFC, Tarif des douanes T2026-2, chapitre 11 (français)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html) | The corresponding wheat entry uses the collective wording `gruaux et semoules de froment (blé)` for groats and meal; no standalone Québec French equivalent for wheat meal is inferred. |
| S123 | [Les Moulins de Soulanges, Roasted Barley Flour](https://moulinsdesoulanges.com/language/en/roasted-barley-flour/) | Québec mill product heading, roasting/heat-treatment description, and bakery uses; product performance, nutrition, and health claims are not imported. |
| S124 | [Les Moulins de Soulanges, Farine d'Orge Torréfié](https://moulinsdesoulanges.com/language/fr/farine-dorge-torrefie/) | Same Québec mill's French product heading and roasting/heat-treatment description; catalog display corrects adjective agreement and does not add the source spelling as an alias. |
| S125 | [OQLF, farine d'orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge) | Pairs general Québec French `farine d'orge` with English `barley flour`, supporting the base name separate from the roasted product. |
| S126 | [Les Moulins de Soulanges, Roasted Wheat Flour](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/) | Québec mill product heading and description establish a named roasted-wheat-flour product and its bakery role; performance, nutrition, and health claims are not imported. |
| S127 | [Les Moulins de Soulanges, Farine de Blé Torréfié](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/) | Same mill's French product page names the corresponding product and explicitly describes roasting of wheat flour. The catalog corrects adjective agreement and does not activate the source spelling as an alias. |
| S128 | [OQLF, farine de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297140/farine-de-froment) | Pairs English `wheat flour` with Québec French `farine de froment` and lists `farine de blé` as a preferred French term, supporting the unqualified base name. |
| S129 | [Diversi Foods, Technical Sheet 74-05](https://diversifoods.com/uploads/files/technical-reports/74-05.pdf) | Bilingual ingredient declaration separately lists wheat malt flour and roasted wheat malt flour. Supports a distinct declared ingredient name only; no detailed process, home-kitchen conversion, or quantity is imported. |
| S130 | [Les Moulins de Soulanges, Roasted Corn Flour](https://moulinsdesoulanges.com/language/en/roasted-corn-flour/) | Québec mill names a functional roasted-corn-flour product and describes heat treatment intended to promote gelatinization of corn starch; product-performance, gluten-free, nutrition, and health claims are not imported. |
| S131 | [Les Moulins de Soulanges, Farine de Maïs Torréfié](https://moulinsdesoulanges.com/language/fr/farine-de-mais-torrefie/) | French product page names the same mill product and describes thermal treatment. The catalog corrects agreement to `farine de maïs torréfiée`; no alias or process-equivalence claim is imported. |
| S132 | [OQLF, farine de soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya) | Lists preferred French `farine de soya` and `farine de soja`, English `soy flour`, `soybean flour`, and `soya flour`, and defines generic soy flour as a fine, sifted, hull-free soybean meal for human food. Not a density or process-conversion source. |
| S133 | [Japan Ministry of Agriculture, Forestry and Fisheries, Akaneko](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/2675/index.html) | Names `kinako (roasted soybean flour)` and lists `Kinako Roasted Soybean Flour`, supporting the English synonym and a distinct named product. |
| S134 | [Gouvernement du Québec, Allergènes et leurs différentes appellations](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations) | Lists `Kinako` among other appellations under French `Soja`; supports the native term in Québec French context but not a product definition. |
| S135 | [Qualifirst, Poudre de soja Kinako](https://odoo.qualifirst.com/fr_CA/food/flours/kinako-soybean-powder-l) | Canadian supplier's French product heading and description name Kinako and describe a finely ground flour made from roasted soybeans. Vendor replacement, nutrition, and health claims are not imported. |
| S136 | [FSSAI, Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products.pdf) | Section 2.4.33 names Roasted Bengal Gram Flour (Chana Sattu) and defines it as flour ground from roasted gram (*Cicer arietinum*). No standards or measurements are imported. |
| S137 | [eNAM, Commodity list](https://enam.gov.in/commodity/commodity-list) | Lists Chickpea Flour (Besan) and Roasted Bengal Gram Flour (Chana Sattu) as separate commodity entries; supports retaining the source-named identities separately. |
| S138 | [Spice Divine, Sattu bio 24 Mantra (farine de pois chiches grillés)](https://spicedivine.ca/fr/products/24-mantra-organic-sattu-roasted-chickpea-flour-1kg) | Canadian French product heading and description pair Sattu with `farine de pois chiches grillés`. Retailer text is used for naming only, not nutrition or performance claims. |
| S139 | [Spice Divine, 24 Mantra Organic Sattu (Roasted Chickpea Flour)](https://spicedivine.ca/products/24-mantra-organic-sattu-roasted-chickpea-flour-1kg) | Canadian product heading and description call the item Sattu (Roasted Chickpea Flour); supports the English product phrase only. Vendor nutrition and culinary-performance claims are not imported. |
| S140 | [Walmart Canada, Angur Farine de Sattu, Farine de Gramme Rôtie](https://www.walmart.ca/fr/ip/Angur-Farine-de-Sattu-Farine-de-Gramme-R-tie-2-lb-Faite-Partir-de-Pois-Chiches-R-tis-V-gane-non-OGM/22GLDNIKO26D) | Canadian French-market product listing uses `Farine de Sattu` and identifies the named product as roasted chickpea/Bengal gram flour. Seller-provided health, nutrition, and culinary claims are not imported. |
| S141 | [Maehara Seifun, Hattai-ko](https://gishi.co.jp/home/item.asp?ct=28) | Japanese product description says regional versions use barley, naked barley, and in some places corn or millet, which are roasted and ground. The page's English text mistranslates naked barley as rye; Japanese wording is read with NARO's barley classification. This source shows regional-name variability, not equivalence to the Québec mill product. |
| S142 | [MAFF Chugoku-Shikoku regional bureau, barley and naked-barley meeting record](https://www.maff.go.jp/chushi/seisan/mugi/mugiproject/attach/pdf/event-19.pdf) | Page 1 mentions Hattai-ko and roasted barley flour as traditional storage foods and roasting as a processing approach; it does not define a uniform product or milling specification. |
| S143 | [NARO, What is high beta-glucan barley?](https://www.naro.go.jp/publicity_report/publication/files/20180731nics_kind_pamph.pdf) | Classifies naked barley as a barley type, supporting the Japanese-language reading of S141 and correcting the supplier page's English rendering. |
| S144 | [Eurogerm / ProBlend, Bakery Ingredients catalogue](https://www.problend-eurogerm.com/images/fiche-bakery-ingredient.pdf) | Page 2 identifies product 23143, Parfen Orge Fruite, under toasted barley flour and lists that flour as the ingredient. Product naming only; no usage or measurement claims are imported. |
| S145 | [Eurogerm, Parfen Taste Colour Ingredients](https://www.problend-eurogerm.com/images/Fiches%20pdf%20ANG/Parfen_ANG08.pdf) | Defines Parfen as roasted cereal flours made by milling roasted cereal and lists Orge Fruité 130 as barley, supporting the shared roasted/toasted barley-flour class without claiming identical brand-specific process or performance. |
| S146 | [CFIA, Standards of identity for food](https://inspection.canada.ca/en/food-labels/labelling/industry/standards-identity) | General Canadian distinction between standardized and unstandardized foods; the reviewed material does not define an almond-flour/meal class. |
| S147 | [CFIA, Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) | General naming guidance for unstandardized foods; does not establish an almond-specific common name. |
| S148 | [MAPAQ, Répertoire des aliments québécois: Poudre d'amande / Amandes blanchies moulues](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208081) | A named Québec product uses `poudre d'amande` for blanched, ground almonds and is rendered in English as `Almond Meal / Ground Blanched Almonds`; one product record, not a general meal/flour definition. |
| S149 | [Robin Hood Canada, Almond Flour](https://www.robinhood.ca/en/products/specialty-flours/almond); [Farine d'amande](https://www.robinhood.ca/fr/produits/farine-de-specialite/amande) | Canadian manufacturer uses the English/Québec French display pair and describes its product as finely ground blanched almonds; product-specific evidence only. |
| S150 | [King Arthur Baking, Almond flour 101](https://www.kingarthurbaking.com/blog/2021/01/11/almond-flour-guide-gluten-free-baking) | Describes variable flour/meal labels and grind texture, including meal used for flour when grind is similar; not a universal naming standard. |
| S151 | [Almond Board of California, Almond Forms for Every Function](https://www.almonds.org/sites/default/files/2021-01/Almond%20Forms%20For%20Every%20Function%20v2_0.pdf) | Describes typical finer blanched flour and coarser meal, and separately identifies defatted almond flour; typical product distinctions only. |
| S152 | [Bob's Red Mill, Natural Almond Flour](https://www.bobsredmill.com/product/natural-almond-meal-flour) | Manufacturer calls a skin-on whole-almond product `Natural Almond Flour` and `almond meal flour`, showing overlapping product-label usage; no universal definition is inferred. |
| S153 | [La Guilde Culinaire, Poudre d'Amande](https://www.laguildeculinaire.com/products/poudre-damande-500gr) | Québec retailer uses `poudre d'amande` for a 100% almond product made from shelled, blanched almonds; product-specific wording only. |
| S154 | [Metro Canada, Bob's Red Mill Poudre d'amandes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/poudre-d-amandes/p/039978313812) | Canadian French-market product heading attests the plural spelling `poudre d'amandes`; retailer title only, with no processing or composition inference. |
| S155 | [OQLF, farine de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc) | Exact Québec French headword; defines powder obtained by dry-grinding manioc roots and lists `manioc flour` and `cassava flour`. The entry attributes its definition to AFNOR (1979), so it supports the broad product family, not a current process specification or measure. |
| S156 | [OQLF, farine de manioc (GDT, 1982 entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432779/farine-de-manioc) | Describes variable flour fineness and water absorption/cohesion; it is not a controlled product specification or kitchen measure. |
| S157 | [Codex Alimentarius, Norme pour la farine comestible de manioc (CXS 176-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B176-1989%252FCXS_176f.pdf) | Defines edible cassava flour made from dried cassava flakes or paste that is milled and sifted; section 7.1 gives `farine comestible de manioc` as the label name. No household measure or substitution is supplied. |
| S158 | [OQLF, fécule de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc) | Defines wet-extracted manioc starch, lists `manioc starch`, `cassava starch`, and `tapioca starch`, and marks `tapioca flour` as obsolete; supports keeping extracted starch separate from whole-root flour. |
| S159 | [OQLF, tapioca (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca) | Updated 2025; defines tapioca as food starch obtained from manioc and lists powder, flakes, small balls, and pearls as presentations. |
| S160 | [Marché Kaïa, SAC – Cassava Flour – Farine De Manioc](https://marchekaia.com/products/sac-cassava-flour-farine-de-manioc) | Current Grand Montréal retailer title pairs the English cassava-flour name with `Farine De Manioc`; product composition and milling details are not shown. |
| S161 | [Marché des Continents, Farine de manioc (Cameroun)](https://marchedescontinents.ca/products/farine-manioc-cameroun) | Québec City retailer product title uses the exact French phrase; the page was out of stock when reviewed and gives no process specification. |
| S162 | [Otto's Naturals, Organic Cassava Flour](https://www.ottosnaturals.com/products/ottos-organic-cassava-flour) | Manufacturer describes a single-ingredient organic product and offers brand-specific replacement advice (1:1 by weight or 25% less volume). This does not establish a generic density, mapping, conversion, or substitution. |

## 2026-10-10 almond flour/meal boundary review

Keep `ingredient-ref-almond-flour` and its English display `almond flour` / Québec French display
`farine d'amande`. Retain `poudre d'amande` and add the source-attested Canadian French-market
variant `poudre d'amandes`. Remove `ground almonds` from the English aliases: it describes a
preparation without a stable grind/process, and its current match caused the plural query `almonds`
to return both whole almonds and almond flour. Keep `almond meal` unassigned; the reviewed sources
use the label for different textures and products, including ground blanched almonds, and the
114-recipe bundle contains no almond-meal demand. Do not infer skin, grind, or defatting from either
display label. This identity review adds no form, measurement, density, unit mapping, yield, or
substitution.

The bundled catalog search audit now returns only the flour identity for `almond flour`,
`farine d'amande`, `poudre d'amande`, and `poudre d'amandes`; `ground almonds` and `almond meal`
return no result; `almonds` returns only the whole-almond identity. The two exact recipe rows remain
the Linzer Cookies and Almond Frangipane Mini Tarts lines documented in
`proposals/wp02-almond-flour-meal-boundary-review-20261010.md`.


## 2026-10-10 coordinator follow-up — regional starch identities and flour terminology

The B2/B3 gap review integrated four identity-only starch references: kudzu starch / kouzou, sweet-potato starch / fécule de patate douce, mung-bean starch / amidon de haricot mungo, and lotus-root starch / amidon de racine de lotus. The English and French search terms remain source-bounded; R73 records the MEXT item 02029 nomenclature crosswalk for kudzu starch, while the broad commercial botanical scope and the latter two Québec French displays remain flagged for clarification. Whole sweet potato, mung beans and mung-bean flour, lotus-root vegetable/flour, and broad arrowroot remain separate. Native and pregelatinized describe processing states, so the ledger records the distinction without a generic catalog row. No form, density, measurement, unit mapping, yield, conversion, recipe link, or substitution was added. The checklist remains open for other B2/B3 products. See `proposals/wp02-regional-starches-open-gap-review-20261010.md` and the integrated batch report.

The independent Québec French review supported `farine de blé tendre` as generic wording but found the full grade constructions descriptive rather than preferred Québec terms. Québec-made T55/T65 product labels make the bare strings ambiguous: unqualified `farine T55`, `T55`, `French T55 flour`, and corresponding T65 aliases were removed. French type 55/65 qualified wording stays available; no equivalence with the French national classes is implied. Short French aliases for Italian type 1 and 2 were also removed for lack of local product evidence. The local Tipo 00 and T50 wording remains product-specific and is not a class crosswalk.

## 2026-10-10 coordinator follow-up — Brazilian polvilho identities

Added separate identity-only rows for `polvilho doce` and `polvilho azedo`, using the product-specific English descriptions `sweet cassava starch (polvilho doce)` and `sour cassava starch (polvilho azedo)` while keeping `polvilho doce` and `polvilho azedo` as provisional fr-CA displays. MAPA's 2022 guidance describes different named products and notes that no repeatable method distinguishes fécula, the polvilhos, and mixtures; Grupo PQ's individual product pages support the English descriptions. Do not infer a universal fermentation threshold or baking conversion. No aliases, forms, density, mappings, measurements, yields, substitutions, or recipe links were added. `sweet tapioca starch` and `sour tapioca starch` remain unmatched. The recipe scan found no corresponding ingredient rows. See the [label-boundary review](../proposals/wp02-brazilian-polvilho-label-boundary-review-20261010.md) and the [integrated batch report](wp02-wp06-wp07-polvilho-regional-boundary-integration-20261010/README.md).


## 2026-10-10 arrow-root product-label follow-up

The existing `ingredient-ref-arrowroot` remains the broad extracted-starch identity with the OQLF
preferred display `arrow-root`. Add the source-attested English product labels `arrowroot starch`,
`arrowroot flour`, and `arrowroot powder`, plus the Metro French labels `farine d'arrow-root` and
`fécule d'arrow-root`. Keep marante, Japanese arrowroot/kudzu, tapioca, cassava starch, and whole-root
flour out of its aliases. The manufacturer chart's 36 g per 1/4 cup and 144 g per cup are recorded as
product-specific portion observations only; cup convention and packing method are unspecified. No
form, density, active unit mapping, recipe change, yield, or substitution was added. Water-chestnut
products remain source-distinct holds pending safe bilingual names. See the 2026-10-10 residual cohort
integration report for checks and package fingerprints.


## 2026-10-10 coordinator follow-up — water-chestnut, kudzu, and taro starch boundaries

Keep the unqualified Canadian-market `water chestnut flour` wording unresolved: sources use it for
whole Chinese-sedge corm flour, extracted corm starch, and dried *Trapa* fruit flour, and the review
did not establish one safe Québec product name. Add only the exact English alias `kudzu flour` to the
existing extracted kudzu-starch identity; do not add `kuzu flour`, `Japanese arrowroot powder`, or a
French flour alias, and keep whole-root kudzu powder separate. Record extracted *Colocasia
esculenta* corm starch as a held candidate distinct from fresh taro and whole-corm taro flour; retain
`taro starch` as English research wording while `fécule de taro` remains provisional. No recipe
links, measurements, densities, unit mappings, conversions, yields, or substitutions were added.
See the [water-chestnut/kudzu review](../proposals/wp02-water-chestnut-kudzu-flour-review-20261010.md)
and [taro-starch review](../proposals/wp02-taro-corm-starch-boundary-review-20261010.md).

## 2026-10-10 gluten-free blend boundary review

The B7 review found no gluten-free flour-blend recipe line and no common composition across Canadian all-purpose, cup-for-cup/1:1, bread, or pastry blends. Keep the generic blend family inactive, preserve full product wording if a later recipe names an exact product, and do not attach qualified gluten-free names to conventional wheat flour. Two Bob’s Red Mill quarter-cup label servings (34 g for its all-purpose blend; 37 g for its 1-to-1 blend) are recorded as separate product-specific ledger observations, not as a density or general conversion. No form, recipe link, or substitution was added. See the [gluten-free blend review](../proposals/wp02-gluten-free-flour-blends-boundary-review-20261010.md).



## 2026-10-12 coordinator follow-up — Québec French potato-starch alias

The existing `ingredient-ref-potato-starch` now includes the exact OQLF-preferred plural `amidon de pommes de terre` as a French alias, alongside its existing singular `amidon de pomme de terre` and `fécule de pommes de terre` variants. Keep `farine de pommes de terre` unassigned: the reviewed Canadian retail title does not establish a general product class or a process, while whole-potato flour remains a distinct active identity. No form, measurement, density, mapping, recipe link, yield, conversion, or substitution was added; the potato-starch measurement and substitution states remain unresearched. See the [boundary proposal](../proposals/wp02-section-b-regional-starch-residual-gap-sweep-20261012.md) and [integration report](wp02-b2-potato-starch-quebec-alias-integration-20261012/README.md).
