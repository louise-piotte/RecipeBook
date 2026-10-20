# WP02 B3 R595 — tapioca-starch chart-measure evidence review

- **Reviewed:** 2026-10-17.
- **Status:** Integrated into the existing tapioca-starch research-ledger record and catalog review log. See the [integration README](../batches/wp02-b3-tapioca-starch-measurement-integration-r595-20261017/README.md).
- **Scope:** One measurement-evidence gap for the existing `ingredient-ref-tapioca-starch` identity.
- **Open plan anchors:** The B3 checklist at [line 3042](../../RecipeBook-global-ingredient-catalog-plan.txt#L3042) still lists tapioca starch within the open cassava/tapioca/polvilho/potato/arrowroot/kudzu/sweet-potato group. The broader WP02 parent remains unchecked at [line 15872](../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). Completed R585, R588, and R591 reviews address pea starch, cornstarch portions, and sweet-potato-starch measurements respectively; this review concerns tapioca starch only.
- **Recommendation:** **Evidence-only add** two source-specific `portion_weight` observations to the existing tapioca-starch ledger record. Keep the measurement state blocked for a generic kitchen value, `defaultDensity: null`, and `unitMappings: []`. Add no form, conversion, recipe link, yield, or substitution.

## Existing identity and evidence boundary

The active reference is `ingredient-ref-tapioca-starch`, displayed as `tapioca starch / fécule de manioc`, category `FLOUR_AND_STARCH`, with the existing English alias `manioc starch`. It has no French aliases, no forms, null default density, and an empty unit-mapping list. Its ledger record currently has verified identity, `measurementState: not_yet_researched`, and one previously researched qualitative substitution finding; it has no measurement observations.

The OQLF entry for [fécule de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc) defines wet-extracted manioc starch and lists `tapioca starch` and `manioc starch` as English terms; it marks English `tapioca flour` as obsolete. Retain the current Québec French display and existing English alias. Do not add `tapioca flour` or new French aliases. Reuse the existing source ID `WP02-S24` for this terminology evidence.

The current references also include modified, native waxy, and resistant tapioca-starch rows. A static phrase projection through `IngredientSearch.kt` gives four results for `tapioca starch` (the generic row and those three qualified rows) and one result for `fécule de manioc` (the generic row). The source-specific observations below change no search terms, so both result sets remain unchanged. King Arthur's separate `Tapioca (quick cooking)` chart row is not the extracted-starch row reviewed here and is excluded.

## Source-specific observations

| Proposed observation ID | Published entry and scope | Evidence limit |
|---|---|---|
| `tapioca-starch-kab-chart-1-cup-113g-r595-20261017` | King Arthur Baking’s [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) says `Tapioca starch or flour`, 1 cup = 4 oz = 113 g. Record the chart’s exact tapioca-starch-or-flour row. | The row does not identify a product or brand, cup capacity, or filling method. The chart also has a separate quick-cooking-tapioca entry; that different product is excluded. Do not infer a mass density or a metric cup conversion. |
| `tapioca-starch-bobs-chart-1-cup-120g-r595-20261017` | Bob’s Red Mill’s [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart) lists `Tapioca Flour/Starch` at 1 cup = 120 g. The same row also lists 1/4 cup = 30 g; record only the 1-cup observation because the quarter-cup entry is the same chart’s proportional quantity, not an independent measurement. | The article describes a chart for the publisher’s flour products and generally recommends spoon-and-level measurement, but does not specify the cup capacity or tapioca-row fill method, product SKU, or lot. Preserve it as a manufacturer-chart observation. |

The two chart entries differ by 7 g per nominal cup. Neither page defines a shared cup capacity or row-specific fill protocol, and neither identifies a sample lot. Keep each publisher’s observation separate; do not average them, scale one to the other, or activate either as a generic kitchen conversion. If integrated, set `measurementState: blocked_pending_evidence` to reflect that the available chart evidence does not establish a common transferable measure; retain `defaultDensity: null` and empty unit mappings.

Proposed observation fields for either row are `relationship: portion_weight`, `evidenceKind: published_portion`, `valueUnit: g`, and `sourceQuantity: {amount: 1, unit: cup}`. Preserve the publisher-specific quantity basis and note that cup capacity and filling method are unspecified where the page does not state them. Do not calculate `g/ml` from a cup value.

## Source ownership and round collision audit

Both exact chart URLs already have ledger owners, so reuse their registered IDs rather than creating duplicate source registrations:

- King Arthur chart URL: `WP07-KAB-IWC` (already used by other ingredient records, including cornstarch, at the same exact URL). This proposal relies only on the distinct tapioca-starch-or-flour row.
- Bob’s Red Mill chart URL: `WP02-B23-RESIDUAL-20261010-S05` (already used for exact rows on arrowroot, cornstarch, rice flour, and white rice flour). This proposal relies only on its tapioca-flour/starch row.
- OQLF terminology URL: `WP02-S24`, already registered to `ingredient-ref-tapioca-starch`.

Before this proposal was written, no R595 prefix or either proposed observation ID was found in the plan, roadmap, proposal/batch archive, or ledger. No new source ID is proposed, and every reused source ID retains its exact registered URL. R588’s cornstarch review recorded different rows from the same two chart pages; this proposal neither reopens nor transfers those cornstarch values.

## Forms, substitutions, and bundled recipe demand

No `IngredientForm` currently attaches to `ingredient-ref-tapioca-starch`; no form is proposed. The ledger’s existing one-way qualitative finding allows tapioca starch as a liquid-thickening substitute for cornstarch only in the stated context, without an amount. This measurement review does not support a replacement ratio or alter that finding. It adds no active substitution rule, rule link, or recipe-line link.

A manifest-ordered scan of all **114 bundled recipe files** and **1,123 ingredient rows** found zero ingredient-row text containing tapioca/tapioca starch or the French name `fécule de manioc`, and zero direct links to `ingredient-ref-tapioca-starch`. The bundle provides no candidate-specific recipe demand.

## Review checks

- [x] Read the active WP02 plan anchors, R585/R588/R591 entries, the current roadmap, and prior B2/B3 proposals and batch notes.
- [x] Confirmed active identity ownership, exact bilingual wording, aliases, related tapioca-starch identities, absence of attached forms, empty numeric fields, and current ledger measurement/substitution state.
- [x] Checked the current primary publisher charts and the OQLF terminology entry; each claim is limited to its exact source row.
- [x] Audited source-ID reuse and the R595/observation-ID namespace; existing IDs remain attached to their registered URLs.
- [x] Scanned all 114 bundled recipes / 1,123 ingredient rows for recipe text and direct reference links.
- [x] Kept this as one proposal-only file. Static UTF-8/no-BOM, local-link, unique-ID, and whitespace checks passed.

The accepted evidence and decision are now in `docs/catalog/research-ledger.v1.json`. No application code changed. Database-JSON-only additions required no app tests, build, emulator run, or deployment under `AGENTS.md`.
