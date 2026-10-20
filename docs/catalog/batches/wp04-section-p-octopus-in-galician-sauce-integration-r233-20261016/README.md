# WP04 Section P R233: octopus in Galician sauce

Added identity-only `ingredient-ref-octopus-in-galician-sauce` as a `PROTEIN` reference with the
display pair `octopus in Galician sauce / poulpe en sauce galicienne`. The only aliases are
`Galician sauce octopus`, `poulpe sauce galicienne`, and `poulpe à la sauce galicienne`. The row is
separate from generic octopus and the accepted octopus-in-olive-oil product.

The manufacturer’s trilingual catalogue and product code support the paired display names. Canadian
and Québec-facing Solfarmers and La Mer listings corroborate product-title variants. Manufacturer
ingredients, species, package format, 111 g net weight, and 67 g drained weight remain specific to
Cambados reference `511110201`; none is a generic measure or ingredient specification. The catalog
adds no density, unit mapping, form, conversion, yield, recipe link, or substitution. The bundled
recipe corpus has no matching demand.

The accepted record is in [`research-ledger.v1.json`](../../research-ledger.v1.json), using sources
S01–S07 and S10 under the R233 prefix. S08 (WoRMS), S09 (Codex), and the proposal audit record remain
proposal-only because they do not support the identity-only row. S10 is the correctly registered
Solfarmers French collection URL; the proposal’s earlier attempt to reuse the R181 source ID was
corrected because that ledger ID points to a different product URL.

Static package normalization, generated-index freshness, ledger schema and source ownership,
picker projection, recipe-corpus scan, UTF-8/no-BOM, local links, and whitespace checks passed. No
software tests or emulator checks were run because this change only adds database JSON data, with its
generated catalog index and progress documentation, under `AGENTS.md`.
