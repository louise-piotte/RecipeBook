# R874 generic borage-flower identity integration

Integrated 2026-10-19. This batch adds one edible flower identity from an open Section K generic ingredient gap.

## Identity and boundary

Added `ingredient-ref-borage-flowers` with displays `borage flowers / fleurs de bourrache`, English alias `borage blossoms`, and category `VEGETABLE_AND_AROMATIC`. It covers the edible floral part of positively identified, food-grown *Borago officinalis*. The Québec guide says to detach the flower from its hairy calyx and achenes. Plain `borage` and `bourrache` are not stored aliases, and the scientific name is not a picker alias. Search for those base words can still find the row through its visible flower display.

Keep leaves, whole plant, seeds, seed oil, and unrelated plants with similar common names separate. The OQLF entry supplies the base plant term and taxon; the flower-part French compound is attested in Québec production guidance, not presented as an OQLF-preferred compound.

## Source-specific caution

The Québec Filière guide is a 2009 edition (legal deposit 2010). It describes the edible flowers and food uses, but also says aboveground plant parts contain small quantities of pyrrolizidines reported as toxic in cited animal studies and notes greater concern with prolonged use. Preserve that as a dated source claim only. Do not infer a current human-risk estimate, safe daily intake, or serving amount. Colorado State Extension separately requires positive identification and food-safe flower sourcing; no foraging guarantee is made.

The UAF recipe examples and Québec cultivation or dried-flower production data remain source-specific. No recipe quantity, harvest amount, production yield, or product measurement is generalized to the ingredient category.

## Catalog and recipe audit

At integration, the catalog contains 1,905 references and 201 forms; the ledger contains 2,312 records and 10,904 source entries. The manifest lists 114 recipes / 1,123 ingredient rows. The pre-integration ownership audit found no matching reference, form, legacy identity, ledger record, or recipe occurrence. Exact flower phrases resolve to the new identity; its visible display keeps broad plant-word results clearly flower-qualified.

No forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions were added. Measurement and substitution research remain `not_yet_researched`.

## Generic-only scope

No brand, product-line, flavor-family, or retailer-variant roster was researched. The cross-category review found no open task whose only deliverable is such a roster; future roster-only expansion remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their product-scoped evidence remain untouched.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Research-ledger JSON Schema Draft 2020-12 validation.
- Source and ID ownership, picker projection, recipe corpus, UTF-8/no-BOM, Unicode escaping in bundled JSON, local links/anchors, and scoped whitespace checks.

No software tests, build, emulator, or deployment were run. `AGENTS.md` exempts database JSON-only additions from testing.
