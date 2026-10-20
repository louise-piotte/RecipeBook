# WP03 Section J R921 tiger-nut integration

## Decision

Added identity-only generic `tiger nut / souchet comestible` for the edible tuber of
*Cyperus esculentus* as `VEGETABLE_AND_AROMATIC`. Added only the TERMIUM-attested aliases
`tigernut` and `chufa`, `amande de terre`, `noix tigrée`, and `noix de tigre`.

Kept the whole tuber distinct from the existing tigernut-flour and defatted-tigernut-flour rows.
The *C. esculentus* scope is explicit; no broad weed or plant names were added as culinary aliases.
PROSEA's preparation descriptions and the extension source's beverage, oil, and grinding examples
remain source-scoped and were not turned into catalog forms or claims.

No form, density, unit mapping, reusable measure, recipe link, conversion, yield, or substitution was
added. The bundled corpus has no matching ingredient line.

## Cross-category scope

The open checklist review found no queued item limited to a commercial brand, product line, flavour,
SKU, or retailer variant. The existing cereal-roster clauses and named Anson Mills wheat-meal
follow-up remain out of scope because commercial-product counts do not add ingredient diversity.
Existing branded entries and product-only evidence remain intact.

## Validation

- Bundled package validation passed. Package normalization and ingredient-reference normalization
  checks both reported already normalized; the generated catalog check passed at 1,944 references.
- The package contains 1,944 references and 204 forms. The research ledger validates against its
  schema with 2,348 records; record and observation IDs are unique, no source-ID/URL conflicts were
  found, and all three R921 source IDs are unique.
- The recipe corpus contains 114 recipes and 1,123 ingredient rows, with no tiger-nut match.
- UTF-8/no-BOM, mojibake-marker, JSON syntax and ASCII escaping, local-link, and whitespace checks
  passed for the reviewed files. `git diff --check` passed for the tracked data and scope files.
- No software tests were run because this catalog addition only changes database JSON under
  `AGENTS.md`; the generated Kotlin reference index was refreshed from canonical JSON.

## Proposal

- [R921: generic tiger-nut identity](../../proposals/wp03-section-j-tiger-nut-identity-review-r921-20261019.md)
