# WP02 B3 R688 — Yoki polvilho doce portion integration

Added one source-specific `portion_weight` observation to the existing `ingredient-ref-brazil-polvilho-doce` research-ledger record: Yoki reports **20 g per 1 `colher de sopa`** for its Polvilho Doce product. The Portuguese quantity is retained as printed. The manufacturer does not specify spoon volume or a fill/leveling method, so the observation is not a standardized tablespoon measure, density, or transferable conversion.

Added two sources: Yoki's manufacturer nutrition panel for the serving declaration and Marché Brésil's Québec-facing Yoki 1 kg listing for product context. The Chambly listing was out of stock with pickup unavailable when reviewed; it provides no serving value or French product translation. Existing MAPA and Grupo PQ sources continue to support the distinct source-named polvilho products and manufacturer descriptor.

Set the existing record's `measurementState` to `researched_supported` for this source-specific observation. Kept `defaultDensity` null, `unitMappings` empty, and `substitutionResearchState` at `not_yet_researched`. Added no form, alias, package yield, active conversion, recipe link, or substitution. The full 114-recipe / 1,123-row corpus has no matching terms or direct links.

No software tests were run for this database-JSON-only evidence addition under `AGENTS.md`. Static ledger validation, JSON/encoding, source ownership, and scoped documentation checks passed. Broader WP02 B3 starch review remains open.

See the [R688 proposal](../../proposals/wp02-b3-polvilho-doce-yoki-portion-measure-review-r688-20261018.md).
