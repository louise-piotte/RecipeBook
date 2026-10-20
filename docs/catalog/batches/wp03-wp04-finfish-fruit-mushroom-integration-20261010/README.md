# WP03/WP04 freshwater fish, fruit, and mushroom checkpoint — 2026-10-10

## Reviewed proposals

This checkpoint integrates the [freshwater finfish review](../../proposals/wp04-freshwater-finfish-gaps-20261010.md) and the [North American fruit review](../../proposals/wp03-north-american-fruit-gaps-20261010.md). It also records the held naming decisions from the [independent Québec mushroom terminology review](../../proposals/wp03-mushroom-quebec-term-review-20261010.md). Each proposal includes its source register and candidate audit.

## Decisions

| Catalog change | fr-CA / English | Boundary |
|---|---|---|
| Add walleye | `doré jaune` / `walleye` | Species-scoped to *Sander vitreus*. No aliases; keep pickerel and walleye pollock distinct. |
| Add northern pike | `grand brochet` / `northern pike` | Species-scoped to *Esox lucius*. No aliases for broad `pike`, `pickerel`, or `brochet`. |
| Add yellow perch | `perchaude` / `yellow perch` | Species-scoped to *Perca flavescens*. No broad `perch` or `perche` aliases. |
| Add chokecherry | `cerise de Virginie` / `chokecherry` | Fruit of *Prunus virginiana*. French aliases are `cerise à grappes`, `cerises de Virginie`, and `cerises à grappes`; no English aliases. Keep generic cherry and processed syrup products separate. |
| Add haskap berry | `camerise` / `haskap berry` | Culinary fruit of *Lonicera caerulea*. English aliases `haskap` and `honeyberry`; do not extend to ornamental honeysuckle or generic berries. |

All five active references are identity-only, with null densities and empty unit mappings. No recipe line or link, ingredient form, measurement, conversion, yield, or substitution changed.

The mushroom review keeps bare `button mushroom`, unqualified `shimeji`, and unqualified `porcini` held. Their candidates remain `needs_clarification`; no active mushroom reference or alias was added. For a product explicitly identified as *Boletus edulis*, the review records the conditional naming boundary `cèpe de Bordeaux` / `porcini mushroom` as a cross-source inference. It does not authorize assigning unqualified porcini products to that species or activating global `cèpe`, `bolet`, or `porcini` aliases. Section N remains open.

## Source basis

The fish names are supported by OQLF entries for [doré jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198870/dore-jaune), [grand brochet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872759/grand-brochet), and [perchaude](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198859/perchaude), paired with the Québec government’s species profiles for [doré jaune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/dore-jaune), [grand brochet](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/grand-brochet), and [perchaude](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/perchaude). CFIA’s [pollock list](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock) distinguishes marine walleye pollock from freshwater walleye.

OQLF directly supports the food-fruit names and aliases for [cerise de Virginie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869799/cerise-de-virginie) and [camerise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26501692/camerise). Health Canada’s [Canadian Nutrient File](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6260), OMAFRA’s [haskap crop profile](https://www.omafra.gov.on.ca/CropOp/en/spec_fruit/berries/hask.html), and AAFC’s [Canadian fruit-industry overview](https://agriculture.canada.ca/en/sector/horticulture/reports/statistical-overview-canadian-fruit-industry-2024) add food and crop context; no nutritional or numeric values were imported. The mushroom holds draw on the OQLF [champignon de Paris](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869343/champignon-de-paris) and [bolet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296987/bolet) entries, Canadian and Québec usage sources, and the sources recorded in the linked proposal.

## Pixel 9a picker verification

The fresh bundled seed was installed on the Pixel 9a / Android 16 AVD (`RecipeBook_Pixel_9a`, `emulator-5556`). English queries returned the five accepted English names. French accent-folded queries returned the localized names with correct accents:

| Locale | Query | Picker result |
|---|---|---|
| English | `walleye` | `walleye` |
| English | `northern pike` | `northern pike` |
| English | `yellow perch` | `yellow perch` |
| English | `chokecherry` | `chokecherry` |
| English | `haskap berry` | `haskap berry` |
| French | `dore jaune` | `doré jaune` |
| French | `grand brochet` | `grand brochet` |
| French | `perchaude` | `perchaude` |
| French | `cerises de Virginie` | `cerise de Virginie` |
| French | `camerise` | `camerise` |

The unsaved test draft was discarded without saving a recipe. The app was restored to the French home screen showing all 114 recipes.

| Screenshot | Query or state |
|---|---|
| `screenshots/pixel9a-en-walleye.png` | `walleye` → `walleye` |
| `screenshots/pixel9a-en-northern-pike.png` | `northern pike` → `northern pike` |
| `screenshots/pixel9a-en-yellow-perch.png` | `yellow perch` → `yellow perch` |
| `screenshots/pixel9a-en-chokecherry.png` | `chokecherry` → `chokecherry` |
| `screenshots/pixel9a-en-haskap-berry.png` | `haskap berry` → `haskap berry` |
| `screenshots/pixel9a-fr-dore-jaune.png` | `dore jaune` → `doré jaune` |
| `screenshots/pixel9a-fr-grand-brochet.png` | `grand brochet` → `grand brochet` |
| `screenshots/pixel9a-fr-perchaude.png` | `perchaude` → `perchaude` |
| `screenshots/pixel9a-fr-cerise-de-virginie.png` | `cerises de Virginie` → `cerise de Virginie` |
| `screenshots/pixel9a-fr-camerise.png` | `camerise` → `camerise` |
| `screenshots/pixel9a-home-fr-ca-114.png` | French home; 114 recipes |

Exact screenshot SHA-256 values are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Verification

- Bundled package normalization, ingredient-reference normalization, and generated Kotlin index freshness checks passed. The generated index contains 665 references.
- Research-ledger validation passed with zero errors. All 10 Python seed-package tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed all 317 Android unit tests. The deployment script’s full `test` task and debug assembly also passed.
- The default connected AVD (`emulator-5554`) lacked installation space; rerunning deployment against the Pixel 9a AVD (`emulator-5556`) installed and launched successfully. English and French picker searches passed, the draft was discarded, and the French 114-recipe home was restored.

## Package snapshot

Hashes cover exact file bytes. The recipe-corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order.

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 665 | `f3cff2bbf63f85c371103a92c42f9a9df640af48432d7eb47d3890de128e3c70` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 851 records / 1,475 source entries / 1,242 distinct source IDs | `056d57be104e8fe9d9506aa6717194505afc7678bbad369cf8a68e5be00209b3` |
| Legacy candidates | 86 | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `7b275f9696892e81ee05e247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The split seed package remains the full-library interchange format. Remaining Section M/N/P identities and product boundaries, broader independent Québec terminology review, and evidence-backed measurement and substitution work remain open.
