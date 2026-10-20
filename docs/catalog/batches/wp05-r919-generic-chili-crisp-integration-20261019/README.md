# WP05 R919 generic chili crisp integration

## Decision

Added identity-only `ingredient-ref-chili-crisp` as generic `chili crisp / huile pimentée
croustillante`, with the source-attested French alias `huile piquante et croustillante`. Kept the
condiment separate from plain chili oil and the existing `Chiu Chow Style Chili Crisp Oil` reference.

The generic culinary evidence supports an oil-bearing chili condiment with retained crunchy solids;
the exact ingredients and proportions vary. The named Chiu Chow manufacturer evidence stays on that
existing style row. No recipe formula, ingredient list, quantity, ratio, heat level, preparation,
storage claim, serving suggestion, or other product-specific fact was transferred.

No form, density, unit mapping, reusable measurement, recipe link, conversion, yield, or substitution
was added. The bundled corpus has no chili-crisp ingredient line.

## Scope

Catalog work covers generic culinary ingredient diversity across ingredient types. Brand,
product-line, flavour-family, SKU, and retailer-variant rosters are out of scope because commercial
product counts do not add ingredient diversity. This review did not pursue such a roster. Existing
branded references remain intact.

## Validation

- At the R919 checkpoint, bundled package validation passed; package normalization and
  ingredient-reference normalization checks both reported already normalized. The generated
  ingredient catalog check passed at 1,943 references.
- At that checkpoint, the research ledger validated against `research-ledger.schema.json` with
  2,347 records. The recipe corpus had 114 recipes and 1,123 ingredient rows; no chili-crisp row was
  present.
- UTF-8/no-BOM, mojibake-marker, bundled-JSON ASCII escaping, local-link, and whitespace checks
  passed for the reviewed files. `git diff --check` passed for the tracked data and scope files.
- No software tests, build, emulator, or deployment were run because the catalog change adds JSON
  data under `AGENTS.md`; the generated Kotlin reference index was refreshed from the canonical data.

## Proposal

- [R919: generic chili-crisp identity](../../proposals/wp05-generic-chili-crisp-identity-review-r919-20261019.md)
