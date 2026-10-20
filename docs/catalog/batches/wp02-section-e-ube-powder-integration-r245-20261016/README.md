# WP02 Section E R245 ube powder integration (2026-10-16)

Added identity-only `ube powder / poudre d’ubé` for pure *Dioscorea alata* powder. The active row has no aliases, default density, or unit mappings. Kubo’s 1 kg and 5 kg formats are recorded only as source-specific package observations in the research ledger. No form, recipe link, dose, reusable measure, conversion, active package yield, or substitution was added; the bundled corpus has no matching ingredient line.

See the [R245 proposal](../../proposals/wp02-section-e-ube-powder-identity-review-r245-20261016.md) for source details, species boundaries, and the French term basis.

## Static validation

- Ingredient-reference, bundled-package, and generated-index checks pass at 1,638 references.
- The research ledger validates against its JSON Schema: 1,983 records and 7,345 distinct source IDs, with no source-ID-to-URL conflicts.
- The 114 bundled recipes (1,123 ingredient rows) contain no ube-powder matches.
- Static picker projection: `ube powder` returns only the new reference, `McCormick Ube` returns only the flavor reference, and broad `ube` keeps the three separate choices (powder, flavor, and halaya).
- JSON text is ASCII without BOM; the proposal and this README are UTF-8 without BOM. Local links and whitespace checks pass.
- No tests or emulator checks were run because this only adds database JSON data under `AGENTS.md`.

The broader Section E checklist remains open.
