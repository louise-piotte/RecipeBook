# WP02/WP03/WP04 R812–R814 gap review integration — 2026-10-19

## Scope and disposition

Root reviewed and integrated the three independent proposals. The broader WP02 Section A7, WP03 Section F, and WP04 Section P work packets remain open.

- **R812 — einkorn flour:** added one Québec Food Directory product portion and four Jovial formula portions to the existing `ingredient-ref-einkorn-flour` ledger record. Preserved each named product and recipe amount as source-specific evidence. Recorded the scone flour option as blocked because the catalog has no forms for all-purpose and whole-grain einkorn flour. Added no active substitution, form, alias, density, unit mapping, recipe link, or conversion.
- **R813 — generic dry millet:** held a new form. CNF Food Code 4491 is species-qualified to *Panicum miliaceum* and its dry form and observations already belong to `ingredient-ref-common-millet`. A generic `millet, dry` label would take exact-form priority for `millet dry` and hide the existing common-millet result. No active data changed.
- **R814 — canned crab:** added two Clover Leaf product-label portions, each 1/4 cup (55 g), to the existing `ingredient-form-crab-canned` ledger record. Added the English page for the 15% leg-meat product and the maker's Cajun Crab Fondue recipe as source records. Kept the recipe's two-product option source-scoped; no active substitution or line link was added.

## Data and catalog effects

The research ledger is the only database file changed. It now has 2,294 records, 10,765 source entries, 9,057 distinct source IDs, 7,704 distinct source URLs, and 827 measurement observations. The existing `ingredient-ref-einkorn-flour` row now has five observations and one blocked substitution finding. The existing canned-crab form row has two observations and no new substitution finding. The R813 hold remains documentation-only.

The bundled catalog remains at 1,886 ingredient references and 199 forms; its 114 manifest recipes still contain 1,123 structured ingredient rows. No identity, active form, alias, recipe file, generated import index, density, mapping, conversion, yield, or active substitution changed.

## Static validation

- Research-ledger JSON Schema and integrity validation passed with zero errors.
- Seed package normalization and validation, ingredient-reference normalization, and generated-index freshness checks passed.
- Source-ID/URL ownership and proposed ID uniqueness checks passed; the R812 Québec Food Directory source was reused in place, and R814 reused the existing Clover Leaf source records where applicable.
- Phrase-first picker projections were reviewed. R812 and R814 do not change search terms; R813's proposed generic exact form label would shadow the species-qualified dry form.
- The full manifest corpus was scanned for the target IDs and einkorn, generic dry-millet, and canned-crab phrases. No target links or matching ingredient lines were found. The only crab recipe line is for jumbo-lump crab; `crab balls` is its recipe/group wording, not a canned-crab request.
- JSON is UTF-8 without BOM and remains ASCII-escaped; proposal and batch documentation are UTF-8 without BOM. Local links and scoped whitespace checks passed.

No software tests, app build, emulator run, or deployment were performed. R812 and R814 add database JSON evidence only, and R813 changes documentation only, so the `AGENTS.md` JSON-data testing rule applies.

See the [R812 proposal](../../proposals/wp02-section-a7-next-gap-review-r812-20261019.md), [R813 proposal](../../proposals/wp03-section-f-next-gap-review-r813-20261019.md), and [R814 proposal](../../proposals/wp04-section-p-next-gap-review-r814-20261019.md). The [R809–R811 integration README](../wp02-wp03-wp04-r809-r811-gap-review-integration-20261019/README.md) records the prior batch and unrelated dirty-worktree whitespace findings; those files remain untouched.
