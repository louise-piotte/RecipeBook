# WP04 Section P R197: mussels in brine

## Decision

Added identity-only `mussels in brine / moules en saumure` as `ingredient-ref-mussels-in-brine` in `PROTEIN`. The name follows Canadian product listings, MAPAQ's cooked mussel-meat format, OQLF's French `en saumure` term, and the French Statistics Canada classification. The row does not imply any one species, canned/jarred format, storage condition, readiness, ingredients beyond a particular label, or drained amount.

The unresolved generic mussel candidate remains unchanged. Blue, Mediterranean, and green-lipped mussel species, smoked mussels, Sardo marinated mussels, and canned mussels in escabeche remain separate. No aliases, forms, measurement observations, mappings, recipe links, or substitutions were added. The recipe bundle has no matching demand.

## Evidence and validation

The ledger record adds seven source IDs and reuses the already registered MAPAQ and CFIA IDs at their existing URLs. Food Basics gives a Cedar Phoenicia 111 g product with mussels, water, and salt; the second Canadian listing supports the same English product wording but the product-specific ingredients/stock were not confirmed. MAPAQ and the NAPCS/SCPAN entries distinguish brine from canning. No universal package, drained weight, or measure is inferred.

Static package, schema, catalog freshness, source ownership, picker projection, corpus, encoding, and whitespace checks passed. No software tests or emulator checks were run because this change only adds database JSON data.

See the [R197 proposal](../../proposals/wp04-section-p-mussels-in-brine-product-identity-review-r197-20261016.md). Section P remains open.
