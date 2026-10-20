# WP02 Section A white spelt flour identity review — R209 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, generated file, or test was changed.
- **Scope:** One candidate under the open WP02 Section A item, “Add the remaining functionally distinct regional wheat-flour identities”: white spelt flour.
- **Checklist:** [WP02 Section A](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424). Keep the parent item open.
- **New source-ID namespace:** `WP02-A-FLOUR-GAP-R209-20261016-S01` through `S05`. These IDs are not in the current ledger. The Arva Flour Guide URL is already cited by two farro/emmer records for different page sections; R209 uses a new ID and the spelt-specific locator. Reuse the existing OQLF spelt source ID `WP02A4-SP-S01` and R206 Canadian Grain Commission source ID `WP02-A-FLOUR-GAP-R206-20261016-S03` instead of registering duplicates.

## Decision

**Add one identity-only reference: `white spelt flour / farine d'épeautre blanche`.** Current Québec mill product wording directly attests the French name, and a current Ontario mill product selector attests the English name. Both mills offer white and whole spelt products separately. Arva describes its white spelt flour as lightly sifted, lighter in texture, and easier to work with than its whole spelt flour. This is a useful retail milling boundary from the current unqualified spelt-flour identity.

Treat this as a market product identity, not as a standardized national milling class. The reviewed Québec mill calls one white-spelt product “T55 equivalent” and its whole-spelt product “T165 equivalent”; the Ontario mill publishes its own typical extraction ranges for its white and whole products. These are producer-specific claims and do not define one shared white-spelt grade. The Canadian Grain Commission source already recorded under R206 says spelt is not among the grains regulated under the Canada Grain Act; that finding does not establish that no other standard exists.

Keep the new row separate from generic spelt flour, whole spelt flour, malted spelt flour, sprouted spelt flour, spelt berries, and einkorn flour. Reuse the OQLF source for the base French term `épeautre / spelt`; the full French grade wording is directly supported by the Québec mill product page, not presented as an OQLF ruling. Do not add `non blanchie`, `organic`, `T55`, `T165`, an extraction percentage, or a product-use phrase as an alias. Do not crosswalk white spelt flour to all-purpose, French type 55, whole-wheat, or whole spelt flour.

### Proposed reference JSON delta

```json
{
  "id": "ingredient-ref-white-spelt-flour",
  "nameFr": "farine d'épeautre blanche",
  "nameEn": "white spelt flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

If accepted, add one verified `ingredient_reference` ledger record with `measurementState: researched_no_supported_value` and `substitutionResearchState: blocked_pending_evidence`. Record the producer-specific grade and recipe guidance in source notes only; add no measurement observation, substitution finding, or active substitution rule.

## Current owners and prior decisions

At the review snapshot, no active reference, ingredient form, legacy-import candidate, or ledger record owns `ingredient-ref-white-spelt-flour`, `white spelt flour`, or `farine d'épeautre blanche`. The proposed La Milanaise product URLs and Arva product/recipe URLs have no current ledger owners. The exact source URLs and IDs in S01–S03 and S05 are unregistered. The Arva Flour Guide URL in S04 already appears under `ingredient-ref-farro` (`FARRO-DELTA-S04`) and `ingredient-ref-farro-flour` (`WP03-FARRO-FLOUR-R148-20261015-S05`), but those entries point to its emmer/farro section. R209 scopes its distinct source ID to the guide’s white/whole-spelt entries and does not edit either existing record.

| Current owner | Existing identity and data | R209 boundary |
|---|---|---|
| `ingredient-ref-spelt-flour` | `spelt flour / farine d'épeautre`; no aliases, forms, density, or unit mappings. | Keep the generic row unchanged; do not add white-spelt wording to it. |
| `ingredient-ref-whole-spelt-flour` | `whole spelt flour / farine d'épeautre entière`, integrated under R206; no aliases, forms, density, or unit mappings. | Keep whole-grain milling distinct from the new white-spelt identity. |
| `ingredient-ref-malted-spelt-flour` | `malted spelt flour / farine d'épeautre malté`, with English alias `spelt malt flour`; no forms or numeric behavior. | Malting is a process qualifier, not the white/whole milling distinction. |
| `ingredient-ref-sprouted-spelt-flour` | `sprouted spelt flour / farine d'épeautre germé`; no forms, density, or unit mappings. | Sprouting remains separate from milling/extraction. R147 keeps product-specific replacement guidance inactive. |
| `ingredient-ref-spelt-berries` | `spelt berries / grains d’épeautre`; no aliases or forms. | Keep the whole-kernel grain row separate from both spelt-flour products. |
| `ingredient-ref-einkorn-flour` | `einkorn flour / farine de petit épeautre`; no aliases or forms. | Keep einkorn / `petit épeautre` distinct from spelt / `épeautre`. |

The earlier [spelt-flour identity note](../batches/spelt-flour-identity.md) left whole, white, extraction, and grind classes for separate review. R147 added sprouted whole-wheat flour, sprouted spelt flour, and whole Red Fife flour, while explicitly keeping manufacturer-specific replacement advice inactive. R206 added whole spelt flour and preserved it as distinct from white spelt flour; this review continues that boundary without changing R206.

The existing [French type-55 flour](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) is a country-qualified France class. La Milanaise's “T55 equivalent” wording is product-specific and is not used as an alias or crosswalk. The same rule applies to its T165 claim for its whole spelt product.

No active form attaches to the related spelt or einkorn references. No global conversion or contextual substitution rule mentions spelt. The current source record for spelt flour still has measurement and substitution research marked `not_yet_researched`; this proposal does not change that existing record.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it folds accents and punctuation, prefers complete word-phrase matches, and falls back to partial matching only when there are no phrase matches. Counts below are reference rows before and after adding only the proposed canonical names, with no aliases or form terms.

| Query | Current | Proposed | Effect |
|---|---:|---:|---|
| `white spelt flour` | 0 | 1 | Finds the new white-spelt row. |
| `farine d'épeautre blanche` | 0 | 1 | Finds the new row by its Québec French display. |
| `white spelt` | 0 | 1 | Finds the same row by phrase match. |
| `spelt flour` | 4 | 5 | Adds white spelt beside generic, whole, malted, and sprouted spelt flour. |
| `farine d'épeautre` | 4 | 5 | Adds white spelt beside the same four French spelt-flour rows. |
| `T55` | 0 | 0 | No T55 alias is proposed; the manufacturer’s product-level comparison must not become a French-grade crosswalk. |
| `farine d'épeautre blanche non blanchie biologique` | 0 | 0 | The full La Milanaise title is longer than the proposed canonical phrase and will not match as a query. No extended product-title alias is proposed because `non blanchie` and `biologique` are product qualifiers, not general white-spelt identity terms. |

The canonical French phrase remains searchable when entered directly, without adding producer-specific qualifiers as aliases. Broad `farine` / `flour` searches remain family searches and are not proposed aliases.

## Bundled recipe demand

Parsed all **114 manifest-listed recipes** and **1,123 structured ingredient rows**. Case-insensitive scans of the serialized recipe files and structured ingredient rows for `white spelt flour`, `farine d'épeautre blanche`, `farine d’épeautre blanche`, `unbleached white spelt`, and the proposed reference ID found **zero recipe-file hits and zero ingredient-row hits**. There are also zero direct links to the existing generic spelt-flour or R206 whole-spelt-flour references. A targeted scan of exported recipe JSON found no exact candidate phrase. No recipe link or relink is proposed; the product identity is justified by current Canadian and Québec market evidence, not bundled recipe demand.

## Measurements and substitutions

- La Milanaise lists a 1 kg package for its white-spelt product. Its product page gives `13% ± 2%` protein and “Équivalent: T55.” Those are producer-specific product claims, not a flour density, volume-to-mass conversion, or universal white-spelt specification. Do not use the package size as a recipe portion.
- For comparison, La Milanaise lists its separate whole-spelt product at 1 kg, 2 kg, or 5 kg and labels that product “T165 equivalent.” Arva lists its white and whole spelt products in 2.5 kg, 4.5 kg, and 20 lb sizes. These are package formats, not household measures. Arva’s Flour Guide provides its own typical white/whole extraction and protein figures and notes that actual values vary; keep those values source-specific and out of the reference.
- La Milanaise describes white spelt flour as usable like its regular all-purpose flour. Arva’s own classic sourdough article says to substitute up to 30% white spelt flour for a lighter, nuttier loaf. That percentage is tied to the named producer’s recipe and flour. It does not establish a general replacement range or a transferable contextual rule. Keep it inactive, with no direction to all-purpose flour or another spelt grade.
- La Milanaise’s whole-spelt page recommends combining its product with wheat flour. This is qualitative product guidance, not a ratio. It does not transfer to the proposed white-spelt row.

Keep `defaultDensity` null and `unitMappings` empty. Add no form, recipe link, conversion, package yield, reusable quantity, or substitution rule. The producer-specific substitutions make `blocked_pending_evidence` the appropriate ledger state for broader substitution research; the reviewed sources do not justify generalizing them.

## Source register

New pages were accessed on 2026-10-16. Product claims below stay attached to their named mills and products.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-A-FLOUR-GAP-R209-20261016-S01** | La Milanaise, [Farine d’épeautre blanche non blanchie biologique](https://lamilanaise.com/produits/farine-epeautre-blanche-non-blanchie-biologique/), product heading, use text, protein statement, T55 comparison, and package format. | Current Québec-mill product title supports `farine d'épeautre blanche`; page says it is used like regular all-purpose flour and lists 1 kg. Its `13% ± 2%` protein and “T55 equivalent” belong to this product and are not imported as class-wide properties or crosswalks. |
| **WP02-A-FLOUR-GAP-R209-20261016-S02** | La Milanaise, [Farine d’épeautre entière biologique](https://lamilanaise.com/produits/farine-epeautre-entiere-biologique/), product heading, use text, T165 comparison, and formats. | Same Québec mill separately lists whole spelt flour and recommends using it like whole-wheat flour; package sizes are 1 kg, 2 kg, and 5 kg. The “T165 equivalent” is not transferred to another mill or used as a class crosswalk. |
| **WP02-A-FLOUR-GAP-R209-20261016-S03** | Arva Flour Mills, [Organic Spelt Flour (White & Whole)](https://arvaflourmills.com/collections/organic-flour-cereals-grains/products/arva-flour-mills-white-spelt-flour), current product selector and mill details. | Ontario mill listing presents White Spelt Flour and Whole Spelt Flour as separate product options, in 2.5 kg, 4.5 kg, and 20 lb packages. Supports Canadian English product wording and market separation; package sizes are not kitchen measures. |
| **WP02-A-FLOUR-GAP-R209-20261016-S04** | Arva Flour Mills, [Flour Guide](https://arvaflourmills.com/pages/flour-guide), Organic White Spelt and Organic Whole Spelt entries and technical table. | Describes Arva white spelt as lightly sifted, lighter in texture, and easier to work with than whole spelt. Its typical extraction and protein figures apply to Arva’s products; the page says actual specs vary by crop year. This URL is already in the ledger for emmer/farro sections under other source IDs; R209 isolates the current spelt locator. |
| **WP02-A-FLOUR-GAP-R209-20261016-S05** | Arva Flour Mills, [Classic Sourdough Bread](https://arvaflourmills.com/blogs/news/classic-sourdough-bread-a-beginners-recipe-from-arva-flour-mills), “Arva Flour Mills Pairing Notes.” | Recommends replacing up to 30% of flour with Organic White Spelt Flour for this producer’s named sourdough loaf. This recipe-specific guidance is not a general substitute rule or class-wide numeric behavior. |
| **Reused `WP02A4-SP-S01`** | OQLF, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), preferred term, English equivalent, and definition. | Supports the Québec base term `épeautre / spelt` only; La Milanaise’s current product page supplies the full white-flour wording. This source ID is already attached to the generic and malted spelt records. |
| **Reused `WP02-A-FLOUR-GAP-R206-20261016-S03`** | Canadian Grain Commission, [Grains regulated under the Canada Grain Act](https://www.grainscanada.gc.ca/en/protection/payment/grains-regulated.html), list of regulated grains. | R206 records spelt among crops outside the Act’s regulated-grain list. This is a limit on that specific Canadian statutory grade system, not proof that every standard is absent. |

## Local evidence references

- Active checklist: [WP02 Section A, open parent item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Current neighboring identities: [spelt-flour note](../batches/spelt-flour-identity.md), [R147 residual review](wp02-a-regional-wheat-flour-residual-review-r147-20261015.md), and [R206 whole-spelt review](wp02-section-a-next-functional-wheat-flour-gap-review-r206-20261016.md).
- Current active ingredient references, ingredient forms, global and contextual substitution rules, research ledger, manifest-listed recipe corpus, legacy-import candidates, and source ownership were inspected read-only. The current search implementation was replayed over the live references and form terms.
