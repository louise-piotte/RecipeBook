# WP05 Section X fish-sauce and kecap identity integration

## Decision

Added `patis` as an English and French alias on the existing generic `fish sauce / sauce de poisson`
identity. The alias applies to liquid Philippine fish sauce called patis; it does not cover fish-
flavoured sauce, fish paste or bagoong, shrimp paste, patis flavour, or Japanese shottsuru. OQLF
describes patis as liquid extracted during bagoong fermentation and used as a Philippine sauce. The
Philippine FDA standards list names `Fish Sauce (Patis)` separately from `Fish Flavoured Sauce`, and a
Canadian French product listing uses `Sauce de poisson … Patis`.

Added separate identity-only `kecap manis / sauce soya sucrée Kecap Manis` and `kecap asin / kecap asin`
references. The sweet identity has `ketjap manis` as its only English and French alias, supported by
Québec French retailer and recipe wording. The salty identity uses the Indonesian name in both
languages and has `ketjap asin` as its only English alias; no Québec French descriptive term is
activated. Keep both distinct from generic soy sauce, sweet bean sauce, and Japanese soy-sauce styles.

Retained the active bottled oyster-sauce and vegan oyster-style sauce identities without changing
their aliases. No bundled recipe line matches patis, kecap manis, or kecap asin. Added no forms,
measurements, densities, unit mappings, recipe links, conversions, yields, or substitutions.

Sources: [research proposal](../../proposals/wp05-section-x-fish-sauce-kecap-gap-review-20261011.md),
[OQLF patis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395039/patis),
[Philippine FDA standards list](https://www.fda.gov.ph/wp-content/uploads/2022/04/CFRR-User-Manual-for-the-Modified-E-portal-V2.pdf),
[Walmart Canada Patis listing](https://www.walmart.ca/fr/ip/Sauce-de-poisson-Marca-Pina-Patis-1-L-par-bouteille/10304122),
[Indonesian BPOM Regulation No. 2 of 2026](https://www.peraturan.go.id/files/peraturan-bpom-no-2-tahun-2026.pdf),
[Épicerie Chanh Da](https://www.chanhda.ca/epicerie.php),
[Ricardo](https://www.ricardocuisine.com/recettes/7929-travers-de-b-uf-au-caramel-de-soya),
and [Inproba Ketjap Asin](https://www.inproba.com/oriental/products/381/salty-indonesian-soy-sauce-100-natural/).

## Files and verification

Updated the canonical ingredient-reference JSON, research ledger, generated Kotlin search index, global
catalog plan, and roadmap. The package now has 1,090 references / 79 forms / 114 recipes / 1,123
ingredient rows; the ledger has 1,389 records / 4,626 source entries / 3,785 distinct source IDs.

Seed-package normalization and validation, reference normalization, generated-index freshness,
research-ledger schema validation, alias collision and recipe-demand checks, UTF-8/no-BOM, whitespace,
and scoped `git diff --check` passed. No app tests or emulator run were needed for this database JSON
addition.
