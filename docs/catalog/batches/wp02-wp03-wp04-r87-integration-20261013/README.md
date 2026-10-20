# WP02/WP03/WP04 R87 catalog integration (2026-10-13)

## Decisions integrated

- **WP02 B2 — defatted almond flour:** Added identity-only `defatted almond flour / farine d’amande déshuilée` in `FLOUR_AND_STARCH`, with the qualified Québec ingredient phrase `poudre d’amande partiellement déshuilée` as its only alias. The Québec wording is supported by ingredient declarations on composite products, not a standalone flour bag. Kept ordinary whole-ground flour/meal and almond protein isolates separate; added no forms, density, mappings, conversions, yields, recipe links, or substitutions.
- **WP03 Section F — uruchimai:** Added `uruchi rice` and `uruchimai` as English-search aliases on the existing generic `rice / riz` reference. The accepted term routes those Japanese queries to the generic rice row; no new identity, French alias, grain-length claim, sushi wording, form, numeric value, or substitution was added. Existing ledger research states remain unchanged.
- **WP04 Section P — Canary rockfish:** Held Canary rockfish / `sébaste canari` (*Sebastes pinniger*) outside active references and the ledger. A row would make broad `rockfish` resolve to one named species and would add the fish to the existing `canary` seed query. No current Québec consumer listing or bundled recipe demand was found. No catalog or ledger data changed for this hold.

The active catalog contains **1,419 ingredient references, 104 forms, and 1,758 research-ledger records**. Thirteen new source records were integrated across the almond-flour and generic-rice ledger records. The manifest still contains **114 recipes and 1,123 ingredient rows**; none matches the R87 candidate terms.

Picker projections show that `almond flour`, `farine d’amande`, and singular `poudre d’amande` return both ordinary and defatted flour. Qualified English and French phrases return only the defatted row; plural `poudre d’amandes` remains on ordinary almond flour. `uruchi rice` and `uruchimai` return generic rice, while broad `rice` / `riz` sets remain at 56 / 51 rows. `rockfish` still has no result, and `canary` still selects only canary-seed groats.

## Static validation

Passed:

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` (includes research-ledger schema validation)
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Reference and ledger record uniqueness, all 13 new source-ID ownership checks, and JSON/ledger schema validation
- Picker projection for the qualified almond-flour queries, Japanese rice aliases, existing grain and seafood boundaries, and broad result counts
- Scan of all 114 bundled recipes and 1,123 ingredient rows; zero R87 candidate matches
- UTF-8 without BOM, escaped Unicode in database JSON, final newlines, no trailing whitespace or mojibake, local proposal links, and scoped `git diff --check`

No app tests, Gradle tasks, emulator runs, or deployment were performed. The active catalog change only adds database JSON data; the Canary rockfish review is a documentation-only hold.
