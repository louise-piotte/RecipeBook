# WP03 Section F cracked-rye identity integration (2026-10-12)

Added identity-only `cracked rye / seigle concassé` as `ingredient-ref-cracked-rye` in
`GRAIN_AND_CEREAL`. La Milanaise's current Québec product listings use the English and French names
for a cracked-grain product and list it separately from whole rye and cracked-grain mixes. A
Québec Food Directory ingredient statement independently uses `seigle concassé` in a Montréal
bakery's rye poolish. The source-backed identity boundary is detailed in the
[review proposal](../../proposals/wp03-section-f-next-gap-review-20261012-round4.md).

Added six source entries and one accepted identity decision to the research ledger. Keep aliases
empty: `Organic` is a product qualifier, the certification registry's `Organic Cracked Rye Berries`
wording would collide with the intact `rye berries` identity, and U.S. mill wording `rye chops` does
not support a global Canadian alias. No forms, measures, density, unit mappings, recipe links,
conversions, yields, or substitutions were added. The full 114-recipe / 1,123-row corpus has no rye
or seigle ingredient demand.

Package validation, reference normalization, generated-index freshness, ledger validation, source
ownership, corpus, UTF-8/no-BOM, and scoped whitespace checks passed. The package now has 1,309
references; the ledger has 1,617 records. No app tests or emulator checks were run because this adds
database JSON data and regenerates its index; no recipe or application code was changed. Broader
Section F work remains open.
