# WP03 Section F — popped barley alias boundary review (2026-10-13, R81)

- **Status:** Proposal-only review; hold the new alias.
- **Open checklist:** The remaining puffed-grain coverage is open at [plan line 2661](../../RecipeBook-global-ingredient-catalog-plan.txt#L2661); broader preprocessed-grain coverage is open at [plan line 2770](../../RecipeBook-global-ingredient-catalog-plan.txt#L2770).
- **Scope:** Whether Canadian product wording `popped barley` belongs as an English alias on the existing plain-grain identity `ingredient-ref-puffed-barley` (`puffed barley / orge soufflée`). This does not reopen that accepted identity or propose a separate `popped barley` row.
- **Decision:** **Hold `popped barley` out of aliases.** The only current Canadian product page found describes a flavored snack line, offers no ingredient statement or French label, and does not establish that its product is the same plain ingredient identity as the existing puffed-barley row.

## Findings

Expeditor Dry Goods, an Alberta Canadian seller, currently lists a product titled **Popped Barley** and says it is made from whole-grain barley that is air-popped. The listing offers Salt & Vinegar, Whiskey Tango, and Maple Cinnamon variants. It reports 50 g (approximately 1 cup) per package, but does not expose an ingredient panel or a French label. Direct page retrieval succeeded on 2026-10-13. This supports a current Canadian flavored product name and air-popped process; it does not establish a plain unflavored product or a source-neutral alias.

The existing `ingredient-ref-puffed-barley` identity is already a verified human-food grain product. Its manufacturer source describes pressure-and-steam puffing; it does not claim that every expanded barley grain uses that process. A primary cereal-science paper uses `popped barley` for heat-expanded kernels in cattle-feed research and documents variable degrees of expansion. That supports a related process term, but not a human-food alias or equivalence between this seller's flavored, air-popped snack and the existing plain identity.

The current fr-CA display `orge soufflée` is supported by local Québec culinary usage recorded in the existing ledger; OQLF confirms `orge` as feminine for the grain and pairs it with English `barley`. OQLF does not standardize the compound `orge soufflée`. No current Canadian or Québec French page was found that labels the Expeditor product or a plain popped-barley ingredient in French. Do not invent `orge éclatée`, or add the existing French display as a new alias for this English-only product line.

## Ownership, recipe demand, and picker boundary

The post-R80 package has **1,408 references, 104 forms, 1,747 ledger records, and 63 legacy candidates**. The active row [`ingredient-ref-puffed-barley`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L12374) is `puffed barley / orge soufflée`, category `GRAIN_AND_CEREAL`, with empty alias arrays, null `defaultDensity`, and empty `unitMappings`; its [`verified` ledger record](../research-ledger.v1.json#L80401) leaves measurement and substitution research `not_yet_researched`. No active name, alias, form, legacy candidate, or ledger decision exactly owns `popped barley`. `ingredient-ref-puffed-sorghum` already owns the related English alias `popped sorghum`; that species-qualified term is not a barley owner. The full earlier [puffed-barley identity review](wp03-section-f-next-gap-review-20261011-puffed-barley.md) integrated the current row and discussed `barley puffs` and `puffed barley cereal`, but did not review or decide `popped barley`.

The scan covered all **114 manifest-listed recipes and 1,123 ingredient rows**, checking serialized recipe strings, ingredient text, and direct reference links. It found no occurrences of `popped barley`, `popped black barley`, `puffed barley`, `orge soufflée`, or `barley puffs`, and no recipe links to `ingredient-ref-puffed-barley`. The bundle has no demand supporting an alias or recipe link.

`IngredientSearch.kt` normalizes accents and punctuation, searches both reference aliases and attached form terms, prefers complete word-phrase matches, and uses substring fallback only when there is no phrase match ([normalization](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L12), [reference/form indexing](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L69), [filter implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L117)). The current exact projection is:

| Query | Current picker projection | If `popped barley` were added as an alias |
| --- | --- | --- |
| `popped barley` | No result | `ingredient-ref-puffed-barley` only |
| `popped` | `ingredient-ref-makhana-seeds` (through its `popped makhana` form term) and `ingredient-ref-puffed-sorghum` | Those two rows plus `ingredient-ref-puffed-barley` |
| `puffed barley` | `ingredient-ref-puffed-barley` only | Unchanged |
| `orge soufflée` | `ingredient-ref-puffed-barley` only | Unchanged |
| `barley` | 17 barley references, including grain, flakes, flour, cereal, and processed-grain rows | Unchanged |

The exact new query would be useful, but the alias would also direct a query matching the Canadian flavored snack title to a plain puffed-grain ingredient. Keep the English phrase unallocated until a plain product and a corresponding bilingual/Québec-facing name resolve that boundary.

## Data boundaries and exact future delta

- **Identity:** Keep the existing puffed-barley identity. Do not create `popped barley` as a second row; the available source describes a flavored product line and does not prove a distinct plain ingredient identity.
- **Forms:** Add no `IngredientForm`. Popping/puffing is a processed-product identity question, not a dry/cooked state form.
- **Measures and density:** The seller's 50 g (approximately 1 cup) is a product-line/SKU serving observation, not a reusable volume-to-mass mapping for plain puffed barley. Keep `defaultDensity: null` and `unitMappings: []`; do not transfer the number into the catalog.
- **Conversion and yield:** Add no conversion or cooking yield. Neither the package serving nor the processing descriptions establish a general volume conversion or input-to-output yield.
- **Substitution:** Add no global or contextual substitution rule. Snack/topping uses are not amount-preserving recipe substitution evidence. Keep the existing ledger research state unchanged.
- **Recommended integration delta now:** none. Do not change the active reference, ledger, forms, or recipes.
- **Conditional future JSON delta only if a plain human-food product and bilingual scope are verified:** add one English alias to the existing reference; add no French alias or other runtime data.

```json
{
  "id": "ingredient-ref-puffed-barley",
  "aliasesEn": ["popped barley"]
}
```

This is a conditional patch fragment, not a complete schema object and not the current recommendation. `IngredientReferenceDto` defines the `id` and `aliasesEn` fields used here ([DTO](../../../app/src/main/java/app/recipebook/data/schema/SchemaDtos.kt#L284)). If later evidence still supports only this flavored product line, keep the hold.

## Source register

| ID | Source | What it establishes and limits |
| --- | --- | --- |
| `WP03-POPBARLEY-R81-20261013-S01` | Expeditor Dry Goods, [Popped Barley](https://expeditordrygoods.com/products/popped-black-barley), current Canadian product listing, accessed 2026-10-13. | Names a Canada-shipped product `Popped Barley`, describes whole-grain barley as air-popped, offers Salt & Vinegar, Whiskey Tango, and Maple Cinnamon variants, and reports a 50 g / approximately 1 cup package serving. No plain/unflavored SKU, ingredient panel, or French label is exposed; the package serving remains product-specific. |
| `WP03-POPBARLEY-R81-20261013-S02` | Reeve and Walker, [“The Microscopic Structure of Popped Cereals”](https://www.cerealsgrains.org/publications/cc/backissues/1969/Documents/chem46_227.pdf), *Cereal Chemistry* 46 (1969), section “Popped Barley and Wheat.” | Primary laboratory study about popped grain used in cattle-feed research labels heat-expanded barley samples as popped barley and describes expansion varying from slightly swollen/cracked kernels to kernels opened to about twice their original size. It supports the processed-grain term, not a human-food product alias, and provides no kitchen measurements. |
| Reused `WP03-PBARLEY-20261011-S01` | SchapfenMühle, [Puffed barley](https://schapfenmuehle.de/en/commercial-customers/products/puffed-cereals/puffed-barley), manufacturer page rechecked 2026-10-13. | The current plain puffed-barley source says its kernels are expanded using pressure and steam and retain their original shape. This is one supplier's process, not a universal definition. |
| Reused `WP03-PBARLEY-20261011-S04` | OQLF, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), updated 2019. | Supports `orge / barley`, the French feminine form for the grain, and a Québec food/cereal context. It does not standardize `orge soufflée` or name popped barley. |
| Reused `WP03-PBARLEY-20261011-S05` | Chez Rioux & Pettigrew, Québec City, [2026–2027 event menu (French PDF)](https://chezriouxetpettigrew.com/wp-content/uploads/2026/04/FR_Blanche-Offres-evenementielles-2026-2027.pdf), spring/summer 2026 menu. | Indexed menu text uses `orge soufflée` as a culinary component. Direct PDF retrieval exceeded the content-size limit. It supports local wording for the existing display, not a product label for the popped-barley snack. |

No source IDs are proposed for addition to the shared ledger while the alias is held. The two `WP03-POPBARLEY-R81-20261013-*` IDs are unique to this proposal and are not reused from the live ledger.

## Static review record

Static checks passed on 2026-10-13: the proposal decodes as UTF-8 without a BOM, has a final newline and no trailing whitespace, and the conditional JSON fragment parses and uses the active reference DTO field names. All local Markdown links resolve, including the plan, catalog row, ledger record, code, DTO, and prior review anchors. Each new source ID is defined once in this proposal and has no collision in the live ledger or prior proposal/archive; the reused puffed-barley source IDs match the existing ledger. The scan of 114 manifest-listed recipes counted 1,123 ingredient rows and found no candidate-term or target-reference matches. The current search implementation was mirrored over all 1,408 references and 104 forms; its projections match the table, including the existing `popped` result from the popped-makhana form. No shared catalog, ledger, checklist, roadmap, or code files were changed. No app tests or emulator work applies to this proposal-only review; the repository rule also exempts changes that only add database JSON data from app testing.
