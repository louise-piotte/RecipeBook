# WP04 Section P R130 — Pacific oyster identity

## Decision

Added identity-only `ingredient-ref-pacific-oyster`, displayed as `Pacific oyster / huître creuse du Pacifique`, in `PROTEIN`. The row keeps only species-qualified aliases: English `Pacific oysters`, French `huître du Pacifique`, and `huîtres du Pacifique`. Bare `oyster`, `oysters`, `huître`, and `huîtres` remain absent as aliases; the generic fresh-oyster candidate stays unresolved and those broad searches remain multiple-choice.

OQLF gives `huître creuse du Pacifique` as the preferred Québec term and links it to *Crassostrea gigas*. ITIS and WoRMS accept *Magallana gigas* and retain *Crassostrea gigas* as a synonym/previous combination; CFIA’s September 2026 notice documents that name update for import-health lists. This is one species’ name transition, not two catalog identities. CFIA Fish List and a current British Columbia supplier support the qualified food name; the Metro Québec product page supports local plural wording but was out of stock when the proposal reviewed it and could not be fetched during this integration review.

No forms, density, unit mappings, package conversions, measures, recipe links, yields, or substitutions were added. The source-specific live whole-shell product and dozen case sizes are not general recipe measures. All 114 bundled recipes / 1,123 ingredient rows were audited; none mentions oyster or the proposed species-qualified names.

Sources: [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198688/huitre-creuse-du-pacifique), [ITIS](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=1267873), [WoRMS](https://www.marinespecies.org/aphia.php?id=836033&p=taxdetails), [CFIA taxonomy notice](https://inspection.canada.ca/en/animal-health/aquatic-animals/notices-industry/2026-09-04), [DFO 2026/27 fishery summary](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/oyster-huitre-ifmp-pgip-sm-eng.html), [Smokey Bay Seafood](https://smokeybay.com/pacific-oysters/), and [Metro Québec](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/huitres-du-pacifique-entieres-dans-l-eau/p/061362444406).

## Validation

No app, Gradle, unit, instrumentation, or emulator tests were run. `AGENTS.md` says tests are not needed when a change only adds database JSON data. Passed package validation and normalization checks, reference normalization, generated-index freshness, source-ID checks, picker phrase and ambiguity checks, recipe corpus scan, UTF-8/no-BOM checks, local-link checks, whitespace checks, and `git diff --check`. The proposal’s local repository audit source remains in the proposal and is not duplicated as an external ledger source.

After both R130 integrations, the package contains 1,480 references and 109 forms; the ledger contains 1,825 records / 7,599 source entries / 6,455 distinct source IDs; the legacy archive remains at 61 candidates. The bundle remains 114 recipes / 1,123 ingredient rows.

See the [proposal](../../proposals/wp04-section-p-pacific-oyster-species-picker-review-r130-20261015.md) and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Section P remains open.
