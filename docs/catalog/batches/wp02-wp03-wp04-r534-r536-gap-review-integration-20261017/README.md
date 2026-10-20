# WP02 / WP03 / WP04 R534–R536 gap-review integration

Integrated 2026-10-17. The batch adds one Canadian finished-cereal identity, records
source-bounded pinto-flour measurement and patty evidence, and adds one frozen-fillet
form beneath the existing Pangasius group. The relevant flour, cereal, and seafood
checklists remain open.

## R534 — Golden Grahams cereal

Added `ingredient-ref-golden-grahams-cereal` as `Golden Grahams cereal / Céréales
Golden Grahams` in `GRAIN_AND_CEREAL`, with empty alias arrays. The 2024 English and
2023 French General Mills guides identify product code `13295000`, package GTIN
`65633132955`, and the `12/331 GR` case pack/weight. The French guide source ID is
reused from the existing Chex ledger record; no duplicate source ID was created.

Maxi Québec lists `Croque Graham Doré Céréales`, item `21104051_EA`, at 331 g, with a
nutrition-panel serving of 1 cup (41 g). That amount is recorded only as a published
portion observation tied to that retailer item. It does not create a general cereal
measure, density, or conversion. Maxi and Walmart ingredient panels differ about
honey, so the catalog and ledger do not assert a settled formula. Retailer titles
remain outside active aliases. The distinct `Croque Cannelle Graham` SKU remains held
under its existing R500 boundary.

No forms, density, unit mappings, conversions, yields, recipe links, or substitutions
were added for Golden Grahams.

See the [R534 proposal](../../proposals/wp03-section-f-next-gap-review-r534-20261017.md).

## R535 — whole pinto bean flour evidence

Updated the existing `ingredient-ref-pinto-bean-flour` ledger record:

- Set measurement research to `researched_no_supported_value`, with no observation.
  The reviewed laboratory density sample was dehulled and the paper conflicts between
  0.35 and 0.38 g/cm³; those values do not match the active whole-pinto product or a
  household measure.
- Set substitution research to `researched_supported` and recorded one bounded
  Felker et al. ground-beef-patty finding. The trial used either raw or separately
  jet-cooked/drum-dried pinto flour at 6%, 12%, or 18%, with equal-mass water in each
  100 g 80:20 ground-beef patty formula.
- Added no `ruleId`, active substitution rule, density, unit mapping, form, or recipe
  link. The finding applies only to the cited patty formulations and does not support
  a general meat replacement or flour substitution.

The source is the [primary Felker et al. study](https://onlinelibrary.wiley.com/doi/10.1155/2023/5915625).
The complete corpus contains one whole canned-pinto-bean line and no pinto-flour row.

See the [R535 proposal](../../proposals/wp02-b2-pinto-flour-measurement-substitution-review-r535-20261017.md).

## R536 — frozen basa / Pangasius fillets

Added one form under the existing `ingredient-ref-pangasius-group`:

- `ingredient-form-pangasius-frozen-fillets`
- English / French: `frozen basa fillets / filets de pangasius surgelés`
- `formCode: frozen`, `prepState: frozen`, no match terms, null density

The form ledger record reuses R19’s CFIA group and same-SKU Metro bilingual sources,
and records current Metro overview and Walmart French listing evidence. The group
remains species-neutral; SKU package mass and additives remain product-specific. No
state-free form terms, measures, mappings, yields, recipe links, or substitutions
were added. The complete recipe corpus has no Pangasius/basa demand.

See the [R536 proposal](../../proposals/wp04-section-p-pangasius-frozen-fillets-form-review-r536-20261017.md).

## Validation record

- Seed-package normalization reported 0 additional changed parts after the edits;
  package validation passed.
- The generated reference index is current at 1,802 references.
- Research-ledger schema validation passed. All decision, measurement-observation,
  and substitution-finding source IDs resolve; no source ID maps to multiple URLs.
- Static picker projections preserve the intended boundaries: `Golden Grahams` and
  `Grahams` select the new cereal, while exact `Graham` still returns its two existing
  flour/crumb results. The frozen-basa and French frozen-Pangasius phrases resolve to
  the existing Pangasius reference with the new form hint; `basa` remains the same
  group-level result.
- The manifest corpus remains 114 recipes / 1,123 ingredient rows. The three reviews
  found no matching recipe demand.
- Bundled seed JSON remains UTF-8 without BOM with non-ASCII text escaped. Source
  ownership, local links, document encoding, and `git diff --check` were verified.
- No software tests, Gradle build, emulator run, or deployment were performed. These
  changes add database JSON data and evidence records, so the test exemption in
  `AGENTS.md` applies.

Post-integration snapshot: **1,802 references / 145 forms / 56 legacy candidates**;
**2,160 research-ledger records / 9,933 source entries / 8,406 distinct source IDs /
7,114 distinct URLs**; **114 recipes / 1,123 ingredient rows**.
