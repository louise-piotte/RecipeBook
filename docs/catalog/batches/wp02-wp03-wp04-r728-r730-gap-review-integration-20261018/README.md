# WP02/WP03/WP04 R728–R730 integration — 2026-10-18

Integrated two bounded catalog updates and one documentation-only hold. Sections A6, F, and P remain open.

## Decisions

- **R728 — black quinoa flour portion:** Added Naturquinoa's 60 g nutrition serving as a product-specific `portion_weight` observation on the existing black quinoa flour research record. The manufacturer product page was available through indexed text but returned an anti-bot interstitial when opened. Its catalog distinguishes ordinary black quinoa flour (§2.3, PDF p. 5 / printed p. 11) from precooked black quinoa flour (§3.3, PDF p. 6 / printed p. 12). The 60 g serving provides no volume or weighing method, so measurement is `researched_no_supported_value`; no measure, density, mapping, alias, form, recipe link, or substitution was added. See the [R728 proposal](../../proposals/wp02-a6-next-gap-review-r728-20261018.md).
- **R729 — PC Organics cereal identity:** Added identity-only `Organic Ancient Grains Multigrain Cereal / Céréales Grains Anciens` for the paired Loblaw/Maxi 375 g listing `20036116_EA`, with no aliases or forms. The English listing's 60 g serving is recorded only as product-specific evidence. The French listing's indexed serving field is malformed and was not used as measurement evidence; neither listing verifies an UPC or physical package. No recipe link or substitution was added. See the [R729 proposal](../../proposals/wp03-section-f-next-gap-review-r729-20261018.md).
- **R730 — longfin hake hold:** Kept *Phycis chesteri* / longfin hake outside active references and the research ledger because current Canadian/Québec consumer-food naming was not established. DFO describes the species as non-commercial; OQLF's Québec fish-market entry scopes `merluche` to other species. No source allocation or catalog data was added. See the [R730 proposal](../../proposals/wp04-section-p-next-open-gap-review-r730-20261018.md).

## Package state

- 1,847 ingredient references, 174 forms, 114 recipes, and 1,123 structured recipe ingredient rows.
- 2,230 research-ledger records, 10,466 source entries, 8,835 distinct source IDs, and 7,483 distinct source URLs.
- No bundled recipe or ingredient row links to the new cereal; R728 changes measurement evidence only, and R730 remains held.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check --validate-only` — bundled package valid and normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,847 references.
- Research ledger validates against `docs/catalog/research-ledger.schema.json` and the package's semantic/source-ownership checks.
- All four new source IDs have one ledger owner and all four source URLs are unique; R730 has no source allocation.
- Picker projection: `ancient grains` adds one cereal result; `ancient grain` remains the existing Rogers porridge; `grains anciens` returns two clearly named products; `céréales grains anciens` returns one; `multigrain cereal` returns two. Existing `céréales multigrains` remains at three. R730's broad `hake` and `merluche` projections remain unchanged.
- Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows for R728–R730 candidate matches; none were found.
- Modified JSON and documentation files decode as UTF-8 without BOM; French catalog text remains stored as Unicode escapes. Local links and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were performed. R728 and R729 only add database JSON data, and R730 is documentation-only, under the rule in [AGENTS.md](../../../../AGENTS.md).
