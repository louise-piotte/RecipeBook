# WP06 Mesoamerican herb identity integration and Pixel 9a QA

## Accepted scope

Added four separate source-named ingredients: epazote / epazote and hoja santa / hoja santa in
HERB; chipilín leaves / feuilles de chipilín in HERB; and loroco / loroco in
VEGETABLE_AND_AROMATIC. Epazote and hoja santa remain distinct species. Chipilín is scoped to the
leaves named by the local Guatemala source, without an assumed species. Loroco remains separate
from other edible flowers; the San Lorenzo origin designation does not make a global product
equivalence.

No aliases were added, including the broad quelite term or chipilín/chepil/chepiles spellings. No
forms, densities, unit mappings, measurements, conversions, substitutions, or recipe links were
added. The proposed French displays are provisional pending independent Québec terminology review.

## Evidence and package snapshot

- [CONABIO, Quelites](https://biodiversidad.gob.mx/diversidad/alimentos/quelites), updated
  2024-10-14 and accessed 2026-10-09: defines quelite as an umbrella for many edible plants and
  plant parts; separately identifies epazote as *Dysphania ambrosioides* and hoja santa as
  *Piper auritum*. This supports the separate plant identities, not an umbrella alias or a Québec
  term.
- [Secretaría de Agricultura y Desarrollo Rural, Mole verde estilo Oaxaca](https://www.gob.mx/agricultura/articulos/mole-verde-estilo-oaxaca),
  2023-09-03 and accessed 2026-10-09: names hoja santa separately from epazote and parsley in one
  Oaxaca recipe. Its quantities and preparation remain specific to that recipe.
- [Guatemala Ministry of Culture and Sports, SIC, Tamalitos de chipilín](https://www.sicultura.gob.gt/directory-directorio_c/listing/tamalitos-de-chipilin-smd/),
  source collection first edition 2023 and accessed 2026-10-09: names a bunch of chipilín leaves in
  one San Miguel Dueñas tradition-bearer's tamal recipe. It does not establish a botanical species
  or broader spellings as aliases.
- [El Salvador Travel, Festival del Loroco: una invitación a descubrir San Lorenzo](https://elsalvador.travel/esp/festival-del-loroco-una-invitacion-a-descubrir-san-lorenzo/),
  accessed 2026-10-09: identifies *Fernaldia pandurata* in the Loroco de San Lorenzo
  designation-of-origin context and documents local culinary use. Its origin designation and
  product examples are not generalized into forms or aliases.

Canonical source IDs are WP06-MEX-CENTAM-20261009-S04, S05, S08, and S15. Their detailed locators
and the wider regional gap review are in the
[Mexico and Central America WP06 proposal](../../proposals/wp06-mexico-central-america-gap-sweep-20261009.md).

After integration:

- 465 ingredient references; SHA-256
  02020683150bbebbaeb51662ac552ee586b082275b52e146faa132f933b0fa44.
- 17 ingredient forms.
- 631 research-ledger records, 854 source entries, and 747 distinct source IDs; ledger SHA-256
  0dd6f8bfe865223227bdd946473b1a9b3901bb7e85dfba7058dd9e61f625d4ac.
- 99 legacy candidates; 114 recipes and 1,123 ingredient lines. No candidate-term hit appears in
  the manifest-listed bundled recipe files.

## Verification

- Bundled package and research-ledger validation passed; the seed normalizer and generated catalog
  check passed at 465 references; git diff --check passed.
- All 9 Python package tests and all 287 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on emulator-5556: 29 XML test cases, 27 passed, 2 skipped,
  0 failures, and 0 errors. The repository deploy script installed and launched the debug app.
- English queries epazote, hoja santa, chipilin, and loroco each returned the intended single row.
  French queries epazote, hoja santa, feuilles de chipilin, and loroco returned the corresponding
  rows; the chipilín accent-folded search displayed feuilles de chipilín.
- The unsaved draft was discarded. The French home returned to Toutes les recettes (114).

## Screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English epazote result | [english-epazote-picker.png](english-epazote-picker.png) | 86dde9b097554b4184ae042b1258a233621ff84c19de4c2fad2f48d01fc0a14c |
| English hoja santa result | [english-hoja-santa-picker.png](english-hoja-santa-picker.png) | 8c0210dd9aff8ed8ab0d1b4bb8a4a4cb9232cc5cd9e43b8b2cc729bf205e1065 |
| English chipilín leaves result | [english-chipilin-picker.png](english-chipilin-picker.png) | 261e91e8032533604740cba178609d6f11dc234a58c1e5cf759de336ac92e917 |
| English loroco result | [english-loroco-picker.png](english-loroco-picker.png) | 50d46c306d903acb62c0722e39f1645fbc7fe95538c6e518dec2f73580210932 |
| French epazote result | [french-epazote-picker.png](french-epazote-picker.png) | 915dd25252cf6ba4ae5c0718b1d4c6aecd3eafda470b830d2a0aa86a817a1ad9 |
| French hoja santa result | [french-hoja-santa-picker.png](french-hoja-santa-picker.png) | d88b877061b816772aa5ad39c2e97928e54c8880d6f67d49f210ae63d31a7f29 |
| French chipilín leaves result | [french-chipilin-picker.png](french-chipilin-picker.png) | acf2cfd505d189e9b7f20f0f1ec512b46aba39006e72532acb68f0f180267bdd |
| French loroco result | [french-loroco-picker.png](french-loroco-picker.png) | 643a60cef866b49037add13737477244f69e9feedcd1c88d6948e965e744b88f |
| French library home after discarding the draft | [home-fr-ca-114.png](home-fr-ca-114.png) | b54b3098be10e7316fadab6aab3acae75e23e54ae49cd16072fc9900333d1633 |
