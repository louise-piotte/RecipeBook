# WP03 Section L R639 — Ají Limo identity and fresh form

- **Status:** Integrated 2026-10-18.
- **Proposal:** [R639 review](../../proposals/wp03-section-l-next-fresh-chile-gap-review-r639-20261018.md).
- **Plan anchor:** Latin American and regional chile identity review in [Section L](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6209).

## Catalog decision

Added `ingredient-ref-aji-limo-pepper` as a source-named Peruvian culinary grouping:

| Field | Value |
| --- | --- |
| Category | `VEGETABLE_AND_AROMATIC` |
| English display | `ají limo pepper` |
| Québec French display | `piment ají limo` |
| English alias | `limo chili` |
| French aliases | None |
| Density and unit mappings | `null` and empty |

PROMPERÚ describes Limo as a highly diverse Peruvian grouping, lists fresh and canned presentations, and uses `Limo chili` in its English profile. Québec evidence includes a local sauce description naming `piments aji limo`, alongside seed sellers that identify Aji Limo products. The French display is descriptive local wording, not an OQLF standardization claim.

Added one `fresh` form, `fresh ají limo pepper / piment ají limo frais`. The Montréal frozen-food listing is not enough to define a frozen form: it does not state whether the package contains whole peppers, cut peppers, or purée. No species, cultivar, color, size, growing origin, or fixed heat is encoded. Keep the separate Ají Limón / Lemon Drop name, ají panca, ají dulce, generic pepper/chile terms, and PROMPERÚ's source common names out of aliases.

The ledger identity is verified; measurement and substitution research remain `not_yet_researched`. No recipe link or numeric behavior was added. The manifest-ordered scan found no matching term in the 114 recipes / 1,123 ingredient rows.

## Picker and verification

The new entries change these reference counts: `ají limo` and `aji limo` now find one row; `limo chili` finds one row; the fresh bilingual labels resolve through the form; and broad `piment`, `pepper`, `chili`, and `ají` result sets each gain one row while remaining multi-result. `ají limón` / `lemon drop` stay at zero. The unqualified `piments` query remains at zero.

Static package normalization and generated-index freshness passed; the index contains 1,830 references. Ledger schema/source-ID checks, picker projection, recipe scan, local links, UTF-8/no-BOM, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were needed for this database-JSON-only update under `AGENTS.md`.
