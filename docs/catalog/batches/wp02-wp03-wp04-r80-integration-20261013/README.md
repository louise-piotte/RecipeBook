# WP02 / WP03 / WP04 R80 integration (2026-10-13)

## Decisions

### WP02 B3 — resistant green-banana starch

Added identity-only `ingredient-ref-resistant-green-banana-starch`:

- English: `resistant green banana starch`
- French: `amidon résistant de bananes vertes`
- Category: `FLOUR_AND_STARCH`
- Aliases: none; density is null; unit mappings are empty

Health Canada provides the exact Canadian bilingual wording and describes the source as starch
from raw, unripe banana pulp obtained through conventional physical processing without chemical
modification. Kim and Lee separately isolate raw starch from green Songkibab and Cavendish
bananas. A Canadian bilingual fibre blend confirms the product-language use but does not establish
a standalone banana-starch package or disclose its banana-specific mass. Keep the reference separate
from green-banana flour and the unresolved plantain-starch candidate. The *Musa paradisiaca* noodle
formulation remains a cultivar-ambiguous research observation; it supplies no reusable measure,
conversion, or substitution.

The current search implementation also matches the contiguous words `banana starch` inside the
canonical English name. That broad query returns this visibly qualified identity; no broad alias or
plantain equivalence was added.

### WP03 Section F — puffed wild rice

Added identity-only `ingredient-ref-puffed-wild-rice`:

- English: `puffed wild rice`
- French: `riz sauvage soufflé`
- Category: `GRAIN_AND_CEREAL`
- Aliases: none; density is null; unit mappings are empty

Artisan Tradition's current English and Québec French ingredient panels attest the bilingual
wording, while a Québec recipe describes making the puffed preparation from wild rice. Keep the
identity distinct from plain wild rice, wild-rice blends, generic puffed rice, and the finished
wheat-based snack. The recipe's ½ cup / 85 g quantity is raw wild rice before processing, not a
measure of finished puffed wild rice. No species, forms, conversions, yields, recipe links, or
substitutions were added.

### WP04 Section P — sea lamprey

Added identity-only `ingredient-ref-sea-lamprey`:

- English: `sea lamprey`
- French: `lamproie`
- Species: *Petromyzon marinus*
- Category: `PROTEIN`
- Aliases: none; density is null; unit mappings are empty

OQLF supports the preferred Québec edible-fish term and species mapping. Exploramer describes the
species as not yet commercialized in Québec, and its 2021 and 2022 supplier directories list no
distributor. The identity therefore does not claim current Québec supply. Empty aliases preserve
the American-eel boundary; no forms, measures, yields, recipe links, or substitutions were added.

## Evidence and proposals

- [WP02 resistant green-banana starch review](../../proposals/wp02-b2-b3-next-regional-starch-review-r80-20261013.md)
- [WP03 puffed wild-rice review](../../proposals/wp03-section-f-next-grain-review-r80-20261013.md)
- [WP04 sea-lamprey review](../../proposals/wp04-section-p-next-seafood-gap-review-r80-20261013.md)

The manifest-ordered bundled corpus still contains 114 recipe files and 1,123 ingredient rows. No
matching rows or files were found for these candidates.

## Static verification

- The active package contains 1,408 ingredient references and 104 forms; the research ledger
  contains 1,747 records. No reference IDs, ledger record IDs, or new source IDs collide. The two
  reused WP03 source IDs were already registered in the ledger.
- The canonical reference file has exactly three new identity-only rows. Their aliases, densities,
  and unit mappings are empty. No forms, recipe links, conversion rules, yields, substitutions,
  legacy candidates, or recipe files changed for R80.
- Picker projections were checked against `IngredientSearch.kt`, including the `banana starch`
  phrase match, wild-rice family searches, unchanged generic puffed-rice searches, and the sea-lamprey
  boundary from eel queries.
- A manifest-ordered scan checked 114 recipe files / 1,123 ingredient rows and found zero candidate
  hits.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed, including
  research-ledger schema validation. Reference normalization and generated catalog freshness checks
  passed. R80 database JSON is UTF-8 without BOM, French accents are stored with explicit Unicode
  escapes, and the changed files have no trailing whitespace.
- No Gradle tests or emulator checks were run. This batch only adds database JSON data and the
  generated catalog index, so the current `AGENTS.md` rule does not require them.

The WP02 B3, Section F, and Section P parent checklist items remain open.
