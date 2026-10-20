# WP03 Section L bell-pepper identity integration — R625 — 2026-10-18

## Accepted changes

Promoted the existing legacy candidate ID to one identity-only active reference: `bell pepper / poivron`, category `VEGETABLE_AND_AROMATIC`. Its aliases are English `bell peppers`, `sweet pepper` and French `piment doux`, `poivrons`. OQLF's [poivron entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082786/poivron) supports the preferred terms and describes the food as used raw or cooked; CFIA's [fresh-pepper directive](https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/10-01) supports the fresh commodity context. Metro's [indexed Québec listing](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/nos-fruits-legumes-et-fines-herbes/poivrons-verts) corroborates local retail wording only; direct access was blocked during review.

The broad `pepper`, `piment`, and color-qualified terms remain out of the aliases. The existing Cubanelle identity stays distinct, so `poivron` and `piment doux` can return the generic row alongside Cubanelle. No forms, measures, density, unit mappings, package yields, conversions, recipe links, or substitutions were added. Measurement and substitution research remain `not_yet_researched`; the recipe bundle has no bell-pepper line.

## Files

- Added `ingredient-ref-bell-pepper` to `ingredient-references.v1.json` and promoted the matching ledger record in place.
- The legacy candidate entry remains as the legacy-source record; no second stable ID was created.
- Review proposal: [`wp03-section-l-bell-pepper-identity-review-r625-20261018.md`](../../proposals/wp03-section-l-bell-pepper-identity-review-r625-20261018.md).

## Validation

The full bundled seed package normalized and validated; the generated reference index was refreshed and is current; the research ledger schema and custom checks passed (2,198 records). The reference count is 1,827 and form count is 156. No app tests were required specifically for this database-JSON-only reference addition under the current `AGENTS.md` rule. The separate R627 parser change was verified with focused unit and emulator tests.
