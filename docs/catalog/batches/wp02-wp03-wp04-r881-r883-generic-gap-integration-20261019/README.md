# WP02/WP03/WP04 R881–R883 generic ingredient integration

**Date:** 2026-10-19

**Scope:** Generic grain milling fraction, edible produce part, and species-neutral shellfish name-group coverage. No commercial product roster work was pursued.

## Integrated decisions

- **R881 — proso millet bran:** Added identity-only `proso millet bran / son de millet commun`, with the qualified English alias `common millet bran`. The French display remains provisional because the sources support the crop crosswalk and French base noun but do not establish a Québec-preferred compound. OQLF maps `millet commun` to common/proso millet and *Panicum miliaceum*; CFIA says non-wheat bran should name its source grain; two primary food studies support human-food use of proso millet bran. The studies' sample fractions, amounts, particle sizes, formulas, and measured outcomes remain source-specific. [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), [CFIA](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), [2020 study](https://www.sciencedirect.com/science/article/abs/pii/S0733521019306162), [2023 study](https://pmc.ncbi.nlm.nih.gov/articles/PMC10187571/).
- **R882 — chayote shoots:** Added identity-only `chayote shoots / pousses de chayotte` for tender culinary shoots of *Sechium edule*. The French compound is descriptive and provisional. Chayote fruit, mature leaves, tuberous root, whole vines, and non-food/propagation uses remain separate. OQLF supports the base name and states that young shoots are food; UF/IFAS, Singapore NParks, and a peer-reviewed article support culinary shoot use. [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26558714/chayotte), [UF/IFAS](https://ask.ifas.ufl.edu/publication/HS1454), [NParks](https://www.nparks.gov.sg/florafaunaweb/flora/5/9/5957), [Aung et al.](https://doi.org/10.1007/BF02860483).
- **R883 — mussel name group:** Promoted existing `ingredient-ref-mussel` in place to `mussel (name used for multiple mussel species) / moule (nom utilisé pour plusieurs espèces de moules)`, with plural search aliases only. CFIA assigns Mussel and/or Moule wording to multiple species-linked rows; this supports a visibly qualified label-name group, not a taxon or culinary-equivalence claim. The OQLF-normalized bare `moule` remains on blue mussel (*Mytilus edulis*), and existing mussel species and prepared-product rows remain distinct. The prior unresolved candidate decisions remain in the ledger as history. [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=mussel), [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule), [DFO](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm).

## Scope disposition

The review applies the cross-category rule in [`AGENTS.md`](../../../../AGENTS.md) and the [generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md): additional brand-, product-line-, flavour-, SKU-, and retailer-variant-only coverage is out of scope because commercial-product counts do not add ingredient diversity. No such roster was researched or added.

R881 reconfirmed that further work solely on Anson Mills' named `Colonial-Style Toasted Stone Cut Wheat Meal` is out of scope. R875 already recorded this disposition. The R605 history, existing product-scoped evidence, and all active reference rows remain preserved; generic wheat meal remains unresolved. Product- and study-specific quantities or claims were not transferred to any generic ingredient.

## Data delta

- Active ingredient references: **1,912** total, including two new generic rows and the promoted mussel name-group row.
- Ingredient forms: **201**, unchanged.
- Research-ledger records: **2,317** total, including two new identity records and the existing mussel candidate promoted in place.
- New source IDs: **7** (two for R881, four for R882, one for R883). R881 also attaches three reused OQLF/CFIA source entries to the new identity record. Existing source history and prior mussel decisions were preserved.
- Bundled recipes: **114 files / 1,123 ingredient rows**, unchanged. No recipe links were added.
- No forms, active measurements, substitutions, conversions, yields, or safety statements were added.

## Verification

- `tools/seed_package/normalize_bundled_seed_package.py --validate-only` and `--check` passed.
- `tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` and `tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed.
- Research-ledger schema validation, reference/ledger ownership, source-ID integrity, picker projection, bundled-recipe scan, local-link resolution, UTF-8/no-BOM checks, escaped bundled French text, and scoped whitespace checks passed.
- No software tests, app build, emulator, or deployment were run. The only active catalog changes add data to database JSON; this follows `AGENTS.md`'s no-testing rule for that case.

See the proposal-only reviews for [R881](../../proposals/wp02-next-generic-grain-gap-review-r881-20261019.md), [R882](../../proposals/wp03-next-generic-produce-gap-review-r882-20261019.md), and [R883](../../proposals/wp04-next-generic-seafood-gap-review-r883-20261019.md).
