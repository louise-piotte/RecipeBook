# WP04 Section P R581 — Bluegill picker-boundary hold

Date: 2026-10-17

## Decision

CFIA and Québec sources identify Bluegill (*Lepomis macrochirus*) as `Bluegill / crapet arlequin`. However, the current picker would make the generic French query `crapet` return Bluegill alone if that display were added. OQLF defines `crapet` as a generic, non-taxonomic term for several fish species. Hold Bluegill outside active catalog and ledger data until the broader generic query can remain ambiguous or resolve to a reviewed group.

FinFish lists Bluegill fillets and battered Bluegill as separate 11 lb supplier items (codes 501603 and 501604). Those amounts do not state a per-fillet weight, count, consumer serving, or yield. Presteve's `Sunfish` listing also says “Bluegill” as a market name but provides no scientific name; keep that broader product separate. The bundle has no matching recipe demand.

No reference, alias, form, measurement, source record, recipe link, conversion, yield, or substitution was added. The plan and roadmap record this bounded hold; the finfish/regional-fish parent remains open.

## Verification

- Checked CFIA and Québec/OQLF naming, supplier boundaries, picker projection, and all 114 manifest-listed recipes / 1,123 ingredient rows.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No catalog or ledger data changed. No software tests, build, emulator run, or deployment were needed for this documentation-only review.

See the [R581 proposal](../../proposals/wp04-section-p-next-gap-review-r581-20261017.md), the [open Section P finfish checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6392), and the [R578 blue-catfish boundary hold](../wp04-blue-catfish-picker-boundary-hold-integration-r578-20261017/README.md).
