# WP03 Section F Haudenosaunee lyed-corn alias integration

## Decision

Added `lyed corn` as the only English alias on existing `ingredient-ref-hominy-corn`, whose displays
remain `hominy corn / maïs lessivé`. This source-attested name refers to the lye-treated corn product
and does not need a separate identity. `lyed white corn`, `lye corn`, `kanenhstóhare`, and constructed
French variants remain unassigned. Pearled hominy, pozole corn, hominy grits, and other processed-corn
products remain separate.

No form, measurement, density, unit mapping, conversion, yield, recipe link, or substitution changed.
The manifest-listed corpus has no matching recipe demand.

See the [source review](../../proposals/wp03-section-f-haudenosaunee-lyed-corn-alias-review-20261012.md)
for the exact-key and recipe scans, identity boundaries, and full source notes. Six Nations Tourism
identifies a local supplier of lyed white corn; an Ontario Culinary profile published by Six Nations
Tourism uses lyed corn for the family's processed white corn; a Haudenosaunee educator directly
identifies lyed corn as hominy; OQLF's existing record supplies the Québec display `maïs lessivé`.

## Data changes

- `ingredient-references.v1.json`: added the single English alias `lyed corn` to
  `ingredient-ref-hominy-corn`.
- `research-ledger.v1.json`: added three unique regional/product sources and recorded the alias decision
  on the existing hominy-corn identity.
- Generated Kotlin index refreshed from the canonical ingredient-reference JSON.

## Static verification

Bundled seed normalization/package validation, ingredient-reference normalization, generated-index
freshness, research-ledger validation, exact ownership, recipe corpus, UTF-8/no-BOM, and whitespace
checks were run. No app tests or emulator checks were run because this is a database-JSON data change.
