# WP02 / WP03 / WP04 R537–R539 gap-review integration

Integrated 2026-10-17. The batch adds three Canadian Quaker Life cereal identities with
variant-specific label portions, records bounded sweet-blue-lupin-flour evidence, and
adds a frozen squid-tubes form under the existing calamari identity. The B2, Section F,
and Section P workstreams remain open.

## R537 — Quaker Life cereals

Added three `GRAIN_AND_CEREAL` references for the current Canadian manufacturer-listed
products:

- `ingredient-ref-quaker-life-original-cereal` — `Quaker Life Original cereal / Quaker Céréales Life`
- `ingredient-ref-quaker-life-cinnamon-cereal` — `Quaker Life Cinnamon cereal / Quaker Céréales Life Cannelle`
- `ingredient-ref-quaker-life-multigrains-cereal` — `Quaker Life Multigrains cereal / Quaker Céréales Life Multigrains`

The official Canadian [English](https://www.tastyrewards.com/en-ca/brands/quaker/products-categories/life-cereal)
and [French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits-categories/life-cereal)
family pages list these same three products. The canonical catalog normalizer rejects
an identical alias owned by multiple references, so the integration uses distinct,
variant-qualified aliases (`Life cereal Original`, `Life cereal Cinnamon`, `Life cereal
Multigrains`, and their `Quaker Life cereal` counterparts). Queries for `Life cereal`,
`Quaker Life cereal`, and `Quaker Life` return all three products; product-specific
phrases return one row. French aliases remain empty.

The manufacturer’s label portions are recorded independently: Original, 3/4 cup (30 g);
Cinnamon, 3/4 cup (32 g); Multigrains, 3/4 cup (30 g). They remain product-specific
published portions. No reusable cereal measure, density, unit mapping, form, conversion,
yield, recipe link, or substitution was added.

See the [R537 proposal](../../proposals/wp03-section-f-next-gap-review-r537-20261017.md).

## R538 — sweet blue lupin flour evidence

Updated the existing `ingredient-ref-sweet-blue-lupin-flour` ledger record:

- Recorded Lupina’s 1/4 cup (30 g) Nutrition Facts serving as a product-specific published
  portion. The listing does not provide a cup-fill method or measured density.
- Recorded Pleming et al.’s *Lupinus angustifolius* bread study as a formula-specific
  finding. The study blended Australian sweet lupin flour with the named Australian
  Perfection Bakers Flour at 20:80 on a dry-matter basis and tested 0%, 2%, 3.5%, and 5%
  vital-gluten additions in rapid and sponge-and-dough methods. It remains evidence for
  that study’s formulation and does not establish a general replacement ratio.

The [primary study](https://ifst.onlinelibrary.wiley.com/doi/10.1111/ijfs.15323) and
[FSANZ species definition](https://www.foodstandards.gov.au/sites/default/files/science-data/monitoringnutrients/afcd/Documents/Industry%20Report%20-%20Australian%20Sweet%20Lupin.pdf)
support the scoped finding. No `ruleId`, active substitution rule, reusable measure,
density, unit mapping, form, or recipe link was added. The existing white-lupin flour
record and its research remain separate.

See the [R538 proposal](../../proposals/wp02-b2-sweet-blue-lupin-flour-measurement-substitution-review-r538-20261017.md).

## R539 — frozen squid tubes

Added `ingredient-form-calamari-frozen-tubes` under the existing species-unspecified
`ingredient-ref-calamari`:

- English / French: `frozen squid tubes / tubes de calmar congelés`
- `formCode` and `prepState`: `frozen`
- Empty match-term arrays and null density

The paired [Mayrand English and French SKU 41555 pages](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/calamar-surgele/tubes-de-calmar-surgele-sea-ray-41555)
support the bilingual commercial presentation; a [Loblaws French listing](https://www.loblaws.ca/fr/tubes-de-calmar-surgel-s/p/20809866_EA)
corroborates the wording. The species declaration for a different supplier’s tubes was
kept product-specific and was not transferred to Mayrand, Loblaws, or the generic parent.
No measure, density, mapping, conversion, yield, recipe link, or substitution was added.
The existing ring form and the separate breaded-ring identity remain unchanged.

The picker projection preserves both current results for `calamari rings`: the unbreaded
ring form on the generic calamari row and the separate breaded-ring reference. Exact
frozen-tube phrases resolve to the generic parent with the new form hint. The manifest
corpus contains only the existing ring-cut calamari line and no tube-cut demand.

See the [R539 proposal](../../proposals/wp04-section-p-next-seafood-review-r539-20261017.md).

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed; package
  normalization reported **0 additional changed parts**.
- The generated Kotlin import index is current at **1,805 references**.
- Research-ledger JSON Schema and cross-record source-reference validation passed. Every
  source ID maps to one URL; all decision, measurement, and finding source IDs resolve.
- Static picker projections passed for the three Life products, the existing Graham and
  Golden Grahams boundary, the two lupin flour identities, the existing calamari ring and
  breaded-ring results, and the new frozen-tube form.
- The complete manifest scan remains **114 recipes / 1,123 ingredient rows / 753,988
  recipe bytes**, with fingerprint
  `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. The three reviews
  found no candidate-specific recipe demand.
- Bundled seed JSON remains UTF-8 without BOM with non-ASCII characters stored as explicit
  Unicode escapes. Source ownership, local documentation links, encoding, and whitespace
  checks passed.
- No software tests, build, emulator run, or deployment were performed. These changes add
  database JSON data, so the JSON-only exemption in `AGENTS.md` applies.

Post-integration snapshot: **1,805 references / 146 forms / 56 legacy candidates**;
**2,164 research-ledger records / 9,957 source entries / 8,424 distinct source IDs /
7,132 URLs**; **114 recipes / 1,123 ingredient rows**.
