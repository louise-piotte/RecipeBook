# R1018–R1020 generic ingredient integration

- **Date:** 2026-10-19.
- **Status:** Integrated.
- **Scope:** Generic grain milling, a species-bounded culinary fungus, and a cross-species seafood market name. Commercial rosters were excluded across categories.

## Decisions

- **R1018:** Added identity-only `rice bran flour / farine de son de riz` in `FLOUR_AND_STARCH`. Keep it separate from rice bran, defatted rice bran, rice-bran oil, rice-kernel flour, and unassigned rice-bran powder. The French compound is descriptive and provisional. Primary-study blend percentages and processing remain source-specific; measurement research found no reusable household measure, density, mapping, or yield, and substitution remains blocked. No aliases, forms, recipe links, conversions, yields, or active rules were added.
- **R1019:** Added identity-only `Blewitt mushroom / pied bleu`, bounded in evidence to *Lepista nuda*. Health Canada lists the English and French market terms in its edible-fungi crop group; MycoQuébec independently supports the Québec name and species pairing. This supports the catalog identity only, not field identification or safety advice. The four existing owners of the shared Health Canada English/French source IDs were preserved and their support descriptions were extended. No aliases, forms, measurements, recipe links, conversions, yields, or substitutions were added.
- **R1020:** Added `turbot (name used for multiple fish species) / turbot (nom utilisé pour plusieurs espèces de poissons)` as an identity-only `PROTEIN` market-name group. OQLF and Fisheries and Oceans Canada show the bare name applies to at least *Scophthalmus maximus* and *Reinhardtius hippoglossoides*. The group is not a taxon or culinary-equivalence claim. Keep the existing Greenland-halibut identity and its measurements unchanged. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added.

## Cross-category queue disposition

No new brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task was found. The named Anson Mills wheat-meal research remains out of scope because commercial-product counts do not add ingredient diversity; its R605 history is preserved. Existing branded entries and product-specific claims remain intact. No measurement or claim tied to a commercial product was transferred to a generic identity.

## Data checks

- Bundled references: **2,032** (up from 2,029).
- Ingredient forms: **205** (unchanged).
- Research ledger: **2,437** records (up from 2,434).
- Legacy import candidates: **55** (unchanged).
- Recipe bundle: **114** manifest-listed files and **1,123** ingredient rows (unchanged); none matches rice bran flour, Blewitt/Lepista nuda, or turbot.
- The R1019 shared Health Canada English and French source IDs remain owned by their original four fungal identities; the source notes now also name Blewitt/Pied bleu. New source IDs resolve to their reviewed URLs and ledger decisions.
- Package validation, reference normalization, generated-index freshness, ledger validation, exact identity checks, recipe scan, UTF-8/no-BOM checks, and scoped documentation checks passed.
- No software tests, build, emulator run, or deployment were run because the application data changes only add database JSON under `AGENTS.md`.

See the proposal packets for full source registers and boundary audits: [R1018](../../proposals/wp02-a7-next-generic-milling-gap-review-r1018-20261019.md), [R1019](../../proposals/wp03-next-generic-produce-gap-review-r1019-20261019.md), and [R1020](../../proposals/wp04-next-generic-seafood-gap-review-r1020-20261019.md).
