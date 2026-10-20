# WP02/WP03/WP04 R85 integration

Reviewed and integrated on 2026-10-13.

## Decisions

- Added identity-only `chestnut starch / amidon de châtaigne` for starch isolated from edible
  *Castanea* chestnut fruit. The French display remains provisional: OQLF supports the general term
  `amidon` and recognizes `châtaigne` in some contexts, but no reviewed Québec source attests this
  exact starch-product compound. The row has no aliases, forms, density, unit mappings, measurements,
  conversions, yields, recipe links, or substitutions. It remains separate from whole-ground chestnut
  flour, whole sweet chestnuts, purée/spread, and water-chestnut products.
- Added identity-only `black glutinous rice / riz gluant noir` with product-attested aliases
  `glutinous black rice` and `riz noir glutineux`. Keep it distinct from generic black rice, generic
  glutinous rice, flour, flakes, and prepared rice products. It has no forms, measures, conversions,
  yields, recipe links, or substitutions.
- Held general Hiramasa outside active references and the ledger. A Montréal seller lists a Hiramasa
  fillet without a species or brand and a separate Clean Seas whole-fish product; Clean Seas maps its
  own product line to *Seriola lalandi*, while another market source applies Hiramasa to more than one
  Seriola species. CFIA's `sériole chicard` and OQLF's bare `sériole` refer to different species.
  Add no active row, alias, form, measure, or recipe link until the Québec supplier resolves the
  fillet's species or its connection to the branded line.

## Data snapshot

The active catalog now contains **1,417 references, 104 forms, 63 legacy candidates, and 1,756
research-ledger records**. The manifest lists **114 recipes with 1,123 ingredient rows**. Nine new
source IDs were integrated for the two accepted references. The recipe scan found no matches for
either candidate; Hiramasa also has no bundled recipe demand.

Exact black-glutinous-rice queries select the new row. Broad `black rice` and `glutinous rice`
searches gain it as an additional result. Exact chestnut-starch queries select only the new row;
broad `chestnut` and `châtaigne` discovery searches gain one result, while `water chestnut` and
`chestnut flour` remain on their existing rows. Hiramasa queries remain unallocated.

## Source reviews

- [WP02 chestnut-starch review](../../proposals/wp02-b2-b3-sweet-chestnut-starch-boundary-review-r85-20261013.md)
- [WP03 black-glutinous-rice review](../../proposals/wp03-section-f-next-grain-review-r85-20261013.md)
- [WP04 Hiramasa boundary review](../../proposals/wp04-section-p-hiramasa-product-boundary-review-r85-20261013.md)

## Static verification

- Bundled seed package: normalized and valid.
- Ingredient-reference JSON: normalized.
- Research ledger: valid against `research-ledger.schema.json`.
- Generated `BundledIngredientCatalog.kt`: current at 1,417 references.
- Reference IDs, source IDs, exact phrase ownership, picker projections, recipe phrase hits,
  UTF-8/no-BOM, local links, and changed-file whitespace: checked.
- No app tests, emulator checks, or deployment were run. This batch adds database JSON data and
  updates its generated catalog and documentation; the database-JSON rule in `AGENTS.md` exempts it
  from testing.
