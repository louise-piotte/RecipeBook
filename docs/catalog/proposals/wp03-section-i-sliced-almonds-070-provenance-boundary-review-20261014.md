# WP03 Section I — sliced almonds on recipe 070#15: provenance hold

- **Reviewed:** 2026-10-14.
- **Plan item:** continue reviewing nut forms only where exact recipe demand and source evidence support the form link.
- **Candidate row:** saved recipe `070#15`, `20 g sliced almonds`.
- **Recommendation:** leave `ingredientFormId` unset on this row. The recipe has no source metadata; its note names Baked by an Introvert's Chocolate Coconut Cake as inspiration, but that source does not include almonds. A current Nanaimo-bars source uses roughly chopped almonds, which does not establish the saved sliced-almond addition or its provenance.
- **Shared-data effect:** none. Preserve the recipe row and existing sliced-almond form links unchanged; add no form, ledger record, measure, or substitution.
- **Tests:** none; this is a documentation-only provenance decision.

## Evidence

The bundled recipe `070-nanaimo-cake` has no `sourceName` or `sourceUrl`. Its note says the cake was inspired by Baked by an Introvert's Chocolate Coconut Cake and adapted into a Nanaimo-style cake. Row `070#15` names `sliced almonds`, but the saved record does not attribute that ingredient to an external source.

Baked by an Introvert's current Chocolate Coconut Cake page describes chocolate cake layers, coconut pastry cream, coconut buttercream, chocolate glaze, and shredded-coconut garnish. Its indexed ingredient list does not include almonds or sliced almonds. The current page could not be fetched directly during this check, so this conclusion is based on the search-indexed full ingredient list and instructions. [S01]

Mrs Jones's current Nanaimo Bars recipe uses 70 g almonds, skin-on, roughly chopped in the base and directs the cook to stir chopped almonds into the crumb mixture. It supports chopped almonds in that recipe, not sliced almonds in the saved adaptation. [S02]

The existing `ingredient-form-almonds-sliced` remains supported by its OQLF definition and source-attributed rows `003#6` and `110#16`. Those independent links remain valid. This review changes neither the form's identity nor its research states. [S03]

## Decision

Keep recipe row `070#15` exactly as saved and unlinked to `ingredient-form-almonds-sliced` until its own source or a source note for the almond addition is recovered. Do not substitute another recipe's form or quantity evidence for missing provenance. Leave the Section I form sweep open.

## Source register

These proposal-local IDs document this hold only; no new ledger sources are proposed.

| Source ID | Evidence | Limit |
| --- | --- | --- |
| `WP03-SECTIONI-SLICED-ALMONDS-070-PROVENANCE-20261014-S01` | Baked by an Introvert, [Chocolate Coconut Cake](https://www.bakedbyanintrovert.com/chocolate-coconut-cake/). The indexed current ingredient list uses chocolate cake, coconut pastry cream, coconut buttercream, glaze, and coconut garnish; no almond ingredient is listed. | This is the inspiration named in recipe 070's note, not a source for row 070#15. Direct page retrieval returned a cache miss during this review. |
| `WP03-SECTIONI-SLICED-ALMONDS-070-PROVENANCE-20261014-S02` | Mrs Jones's Kitchen, [Nanaimo Bars](https://www.mrsjoneskitchen.com/nanaimo-bars/). The current recipe card specifies skin-on roughly chopped almonds in the base and instructs mixing in chopped almonds. | A separate recipe; it does not establish the source or sliced preparation of 070#15. |
| `WP03-SECTIONI-SLICED-ALMONDS-070-PROVENANCE-20261014-S03` | OQLF, [amandes effilées](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541577/amandes-effilees), already recorded on the sliced-almond form ledger record. | Defines the sliced form and supports its name, not the source provenance of 070#15. |

## Static review record

- Confirmed recipe 070 has no source object or source URL; its note identifies the page only as inspiration.
- Confirmed the saved row's identity, text, 20 g amount, and lack of form link.
- Confirmed the existing sliced-almond form is already linked to independently sourced rows `003#6` and `110#16`.
- Reviewed current indexed and directly retrievable online source material; no evidence supports adding the form link to 070#15.
- No recipe, reference, form, ledger, generated file, or application data changed. This documentation-only decision required no tests.
