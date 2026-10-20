# WP03 Section I — kola-nut identity integration (R373)

## Change

Added identity-only `kola nuts / noix de kola` as `ingredient-ref-kola-nuts` in `NUT_SEED_AND_DRIED_FRUIT`, with the singular English alias `kola nut` and no French aliases. The scope is the food seeds of the two source-supported true kola species, *Cola acuminata* and *Cola nitida*. The reference has no forms, density, unit mappings, recipe links, or numeric behavior.

Keep `cola`, `cola nut`, `noix de cola`, bitter kola/cola, `petit cola`, *Garcinia kola*, extracts, and syrups outside the aliases. The `noix de cola` spelling is documented as research evidence, but using it at runtime would capture the existing broad `cola` query. Retailer-specific raw, roasted, and ground descriptions do not establish general forms or handling guidance.

## Picker and recipe boundary

The static search projection adds the new reference for `kola nut`, `kola nuts`, `noix de kola`, and `kola`. It leaves `cola` and `noix de cola` unchanged. Broad `nuts` and `noix` searches gain the expected additional seed identity. The manifest-listed recipe corpus contains no kola-nut candidate terms, so no recipe link or numeric inference was added.

## Sources and ledger

Added eight source records covering OQLF terminology, Kew taxonomy and name-index boundaries, a Canadian retailer, a Québec distributor, and a Montréal beverage ingredient list. The identity decision records the *Cola* species scope and keeps *Garcinia kola* separate. The ledger records that no supported household measure or substitution was established; no observations or active rules were added.

See the [R373 proposal](../../proposals/wp03-section-i-next-gap-review-r373-20261016.md).

## Verification

Bundled seed-package normalization, `--check`, and `--validate-only` passed. Research-ledger validation passed with 2,054 records. The generated ingredient catalog is current at 1,698 references. Static field/source ownership checks passed, and a manifest-ordered scan of all 114 recipe files found no candidate-term hits. The plan and roadmap links, UTF-8/no-BOM encoding, and scoped whitespace were checked. No software tests, Gradle tasks, emulator checks, or deployment were run because this change adds database JSON data under `AGENTS.md`.
