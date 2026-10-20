# WP02 / WP03 / WP04 R531–R533 gap-review integration

Integrated 2026-10-17. The batch combined a Canadian cereal-family review, a soy-flour measurement review, and a seafood picker-boundary hold. The active flour, cereal, and seafood coverage remains open.

## R531 — Heritage Flakes and Heritage O’s

Added two separate `GRAIN_AND_CEREAL` references:

- `ingredient-ref-heritage-flakes-cereal` — Heritage Flakes cereal / Céréales Heritage Flakes; French alias `Céréales biologiques Heritage Flakes` from Maxi’s product listing.
- `ingredient-ref-heritage-os-cereal` — Heritage O’s cereal / Céréales Heritage O's; French alias `Céréales Héritage O's biologiques` from Mayrand’s product listing.

Nature’s Path presents the products separately, while Québec retailer listings provide product-specific French naming. The manufacturer French pages retain awkward English headings. The Maxi and Mayrand direct requests did not open, so indexed listing names and availability are recorded with that limitation. La Moisson directly lists the O’s SKU in French. Metro’s indexed Flakes phrase `grains anciens` is not an alias because it broadens the product search; Metro’s O’s `sept grains` phrase is excluded because it conflicts with the current manufacturer and La Moisson descriptions. UPCs, package sizes, and inventory remain source-specific SKU context.

The Maxi listing’s 1 cup (49 g) serving is a ledger observation for the Heritage Flakes 907 g SKU only. Heritage O’s has no supported total serving mass. Neither cereal received a density, active measure, unit mapping, conversion, form, recipe link, yield, or substitution rule. A manifest-wide scan of 114 recipes / 1,123 ingredient rows found no candidate demand.

See the [R531 proposal](../../proposals/wp03-section-f-heritage-flakes-and-os-paired-review-r531-20261017.md).

## R532 — generic soy-flour measurement

Added three source-specific observations to `ingredient-ref-soy-flour` and set `measurementState` to `researched_supported`:

- Health Canada CNF food code 3322, full-fat raw soy flour: 100 mL stirred = 35.9 g.
- The same CNF row: 250 mL stirred = 89.8 g.
- King Arthur Baking: 1/4 cup = 35 g in its unqualified chart row, corroborated by one Portuguese-muffin formula.

These values remain separate. No density, reusable unit mapping, default conversion, form, recipe link, or substitution rule was added. The CNF portions do not apply to defatted soy flour or Kinako, and the one recipe’s omission note does not establish a substitute. The 114-recipe corpus has no matching soy-flour row.

See the [R532 proposal](../../proposals/wp02-b2-soy-flour-measurement-review-r532-20261017.md).

## R533 — herring roe on kelp hold

Kept herring roe on kelp / herring spawn on kelp out of shared references and the ledger. Fisheries, processor, and terminology evidence distinguishes eggs harvested on kelp from detached herring roe, but a natural bilingual display would make broad `herring roe` / `œufs de hareng` searches resolve to that one specialized preparation while plain roe remains unresolved. The reviewed sources do not include a current Québec retail label, and the recipe corpus has no demand. Preserve the detached kazunoko, herring flesh, kombu, and other roe boundaries.

This is a documentation-only hold; no shared catalog or ledger data was added for R533.

See the [R533 proposal](../../proposals/wp04-section-p-roe-on-kelp-boundary-review-r533-20261017.md).

## Validation record

- Seed-package normalization reported 0 changed parts after the edits. Package validation passed.
- Generated ingredient catalog index was regenerated at 1,801 references; the freshness check passed.
- Research ledger schema validation passed with no missing decision/observation source references and no source IDs mapped to multiple URLs.
- Static picker projections confirmed Heritage queries return both products for the family phrase and one product for each specific name/retailer alias. The broad `biologiques` query returns four results (the two Heritage products and the two Mesa Sunrise products). No Heritage O’s quantity or measure hint was added.
- Manifest scan: 114 recipes / 1,123 ingredient rows; zero Heritage Flakes/O’s, soy-flour, or roe-on-kelp matches.
- Seed JSON remains UTF-8 without BOM and stores non-ASCII text as escaped Unicode. Documentation links, encoding, whitespace, and `git diff --check` passed.
- No software tests, Gradle build, emulator run, or deployment were performed. The shared application-data changes only add database JSON data, so tests are not required under `AGENTS.md`.

Post-integration snapshot: **1,801 ingredient references / 144 forms / 56 legacy candidates**; **2,158 ledger records / 9,922 source entries / 8,399 distinct source IDs / 7,107 distinct URLs**; **114 recipes / 1,123 ingredient rows**.
