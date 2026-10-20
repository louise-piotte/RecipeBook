# WP03 Section F — Canarian Gofio Picker Boundary Hold (R46, 2026-10-13)

## Review record

- **Scope:** the distinct Canarian toasted-and-milled cereal product protected as *Gofio Canario*; this review does not cover the prepared pella, escaldón, or other gofio dishes.
- **Open checklist:** the parent item for regionally significant cereal mixes and preprocessed grains remains open in the [live Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Status:** proposal only. No shared catalog, ledger, plan, roadmap, batch README, recipe, generated file, or application file was changed.
- **Recommendation:** keep the candidate unallocated. Official sources establish a bounded Canarian product and a French-language form *gofio canarien*, and a Canadian storefront lists corn gofio. However, no Québec-facing dry-product label in French was verified. A separate Canadian listing uses *gofio* for whole-wheat from Galicia; adding a qualified Canarian row would make bare `gofio` resolve to that one regional row in the current picker. The recipe bundle has no demand to resolve this scope.
- **Data limits:** add no active identity, alias, ledger candidate, form, recipe link, measure, density, unit mapping, conversion, cooking yield, or substitution.
- **Proposal-local source-ID prefix:** `WP03-GOFIO-R46-20261013-S` (S01–S06); this prefix was absent from the research ledger and proposal/batch archive before drafting.

## Why this is an uncovered candidate

The live Section F parent remains unchecked. Exact searches for `gofio`, `Gofio Canario`, `gofio canarien`, `Canarian gofio`, `corn gofio`, `whole wheat gofio`, and `farine de gofio` found no prior decision in the active plan or roadmap, proposal or batch archive, ingredient references, ingredient forms, legacy-import candidates, research ledger, or bundled recipe text. The candidate is distinct from already reviewed roasted flours: the protected product is made by roasting and milling grain, may include sea salt, and may also include similarly processed pulses [S01].

The official Canary Islands product page describes gofio as flour made from toasted cereal and identifies the traditional roasting-and-milling process [S02]. The current specification posted by Gobierno de Canarias bounds the protected *Gofio Canario* name to production in the Canary Islands and permits several cereals and pulses, with or without sea salt [S01]. This supports a regional product candidate, but not one universal grain formula or a generic alias for every roasted grain flour.

## English, Québec French, and product boundary

| Use | Evidence and boundary |
|---|---|
| **English product wording** | Naturitas Canada lists a Gofio La Piña item as **Organic Corn Gofio** and currently shows a 500 g package [S04]. Its page is a Canada-facing English retail listing; it does not establish a Québec French retail display or confirm that this exact package carries the PGI. |
| **French wording** | The Fuerteventura interpretation-centre page uses **gofio canarien** and describes the product as roasted before milling [S03]. A French-language Canary Islands guide uses `Gofio (Farine)` [S05]. These are French-language regional tourism sources, not Québec terminology rulings. Targeted searches did not surface a Québec-facing French product label, OQLF entry, or TERMIUM entry for the dry product. Keep `gofio canarien` as source evidence, not an approved Québec display. |
| **Canadian market scope** | Naturitas Canada also lists whole-wheat gofio described as 100% Galician wheat [S06]. This is a retailer product-page sample, not proof of current stock. It shows why bare `gofio` in a Canadian picker need not mean the protected Canarian product. |
| **Protected product** | *Gofio Canario* is a dry, flour-like powder made in the Canary Islands by milling roasted cereal, optionally with sea salt; the specification also allows pulses processed like the cereals [S01]. It is not raw cornmeal, ordinary roasted corn flour, a prepared gofio dough, porridge, broth dish, or a product-specific grain formula. |
| **Not proposed as aliases** | Do not assign bare `gofio` to corn flour, roasted barley/wheat flour, *sattu*, *kinako*, or another region's toasted cereal flour. Do not add *pella*, *escaldón*, or *gofio escaldado* as ingredient aliases; these name preparations or dishes. |

## Exact ownership and picker effects

At the pre-proposal snapshot, the bundled reference catalog contains **1,369 references**, the form catalog **100 forms**, the legacy-import file **64 candidates**, and the research ledger **1,699 records**. Searches for the reviewed names found **no active reference, attached form, legacy candidate, ledger record, previous proposal, batch decision, or plan/roadmap decision**. The suggested source-ID prefix and prospective ID `ingredient-ref-canarian-gofio` are unused. No such ID or ledger row is being proposed for creation in this hold.

| Current owner | Exact boundary | Effect of this hold |
|---|---|---|
| None for *gofio*, *Gofio Canario*, or *gofio canarien* | No catalog, form, legacy, or ledger entry owns the product name. | Current search remains empty for these phrases; no owner changes. |
| `ingredient-ref-roasted-corn-flour` — `roasted corn flour / farine de maïs torréfiée` | Single-crop roasted corn flour; category `FLOUR_AND_STARCH`; no aliases, density, or unit mappings. | Keep the exact crop-qualified flour separate; it does not own `gofio`. |
| `ingredient-ref-roasted-barley-flour` — `roasted barley flour / farine d'orge torréfiée` | Barley-specific flour; English alias `toasted barley flour`; category `FLOUR_AND_STARCH`; no density or unit mappings. | Keep the existing generic barley-flour product unchanged; no `gofio` alias. |
| `ingredient-ref-roasted-wheat-flour` — `roasted wheat flour / farine de blé torréfiée` | Wheat-specific roasted flour with no aliases, density, or unit mappings. | Keep the single-crop milling identity distinct. |
| `ingredient-ref-chana-sattu` and `ingredient-ref-kinako` | Roasted chickpea and roasted soybean products, respectively. | Neither is a synonym for the Canarian multi-grain/pulse GI product. |

The static picker review follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9): it normalizes accents and punctuation, prefers a complete word phrase, then falls back to substring matching. No picker data change is proposed. The projection below is illustrative only: it assumes a bilingual row named `Canarian gofio / gofio canarien` and the protected name `Gofio Canario` as an exact alias; neither is proposed for integration in this hold.

| Query | Current result | Projected effect if a `Canarian gofio / gofio canarien` row were activated |
|---|---|---|
| `gofio`, `Gofio Canario`, `Canarian gofio`, `gofio canarien` | 0 | Each would return the proposed row because its display terms contain *gofio*. A separate alias for the official Spanish name would also make bare `gofio` return that row. |
| `roasted corn flour`, `farine de maïs torréfiée` | Existing roasted-corn-flour row only | Unchanged if no broad flour aliases are added. |
| `roasted barley flour`, `toasted barley flour`, `farine d'orge torréfiée` | Existing roasted-barley-flour row only | Unchanged if no broad flour aliases are added. |
| `corn` (20), `wheat` (43), `barley` (13) | Multiple crop-specific ingredient results | Unchanged with the illustrative display and protected-name alias; keep crop names off the gofio row because its permitted formula is variable. |

The first projected row creates a picker scope problem: Canadian retail use includes gofio products that are not Canarian, while the current search does not distinguish geographical qualifiers or product formulas. No Québec recipe demand is available to show that routing bare `gofio` to the Canarian product is intended.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were searched across the complete serialized recipe JSON and ingredient rows for *gofio*, *Gofio Canario*, *gofio canarien*, *Canarian gofio*, corn/whole-wheat gofio, and descriptive English/French toasted-cereal-flour phrases.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Links to a gofio identity: **0**.

The corpus provides no recipe need that resolves either the product name or the Canadian picker ambiguity.

## Forms, measurements, and substitutions

- **Forms:** add none. Roasted and milled describe the protected product's manufacture; a formed *pella*, prepared porridge, broth dish, or other recipe preparation is not a global ingredient form for this candidate.
- **Measures and density:** no exact-form household measure, mass-to-volume value, or bulk density was found. The Canadian product's 500 g package is package mass, not a recipe portion [S04]. Its product-specific instruction to add two or three tablespoons to milk supplies no mass for that volume and cannot become a reusable mapping [S04].
- **Process values:** the PGI specification's roasting process ceiling of 200 °C is a manufacturing constraint, not a recipe cooking temperature or ingredient conversion [S01]. Keep it out of measurement data.
- **Substitutions:** add no global or contextual rule with cornmeal, roasted corn flour, roasted barley/wheat flour, sattu, kinako, raw cereal flour, or prepared gofio dishes. The permitted crop mix, roast, milling texture, and use differ; the reviewed sources provide no transferable quantity or method equivalence.

## Source register

Sources were checked online on 2026-10-13. Source IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-GOFIO-R46-20261013-S01` | Gobierno de Canarias, [Pliego de condiciones IGP Gofio Canario](https://www.gobiernodecanarias.org/cmsgob2/export/sites/agpsa/icca/galerias/doc/calidad/Pliego_de_condiciones_IGP_Gofio_Canario.pdf), §§ B–E; linked from the current [Gofio Canario quality-products page](https://www.gobiernodecanarias.org/agpsa/icca/temas/productos_calidad/gofio/). | Defines the protected name as a powdered product made in the Canary Islands by milling roasted grain, optionally with sea salt and sometimes similarly processed pulses; lists permitted crops, required production geography, and labeling. The 200 °C roasting ceiling is a manufacturing limit. This specification establishes the PGI boundary, not every product sold as generic *gofio*. |
| `WP03-GOFIO-R46-20261013-S02` | Gobierno de Canarias, [Gofio Canario](https://www.gobiernodecanarias.org/agpsa/icca/temas/productos_calidad/gofio/) and [CanariWiki: Gofio](https://www3.gobiernodecanarias.org/medusa/wiki/index.php?title=Gofio). | Official regional sources describe toasted-and-milled cereal, crop-dependent varieties, and the protected regional product. They do not establish a Canadian or Québec retail label. |
| `WP03-GOFIO-R46-20261013-S03` | Centro de Interpretación de los Molinos de Tiscamanita, Fuerteventura, [L’expérience — French page](https://centrolosmolinosfuerteventura.es/lexperience/?lang=fr). | Uses `gofio canarien`, describes grain varieties, and says it is roasted before milling. This supports French-language regional wording, not a Québec terminology ruling or local retail name. |
| `WP03-GOFIO-R46-20261013-S04` | Naturitas Canada, [Organic Corn Gofio 500 g — Gofio La Piña](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/cornmeal/organic-corn-gofio-500-g-gofio-la-pina). | The Canada-facing page lists a 500 g corn-gofio item in CAD and describes toasted gofio; at time checked it showed the item in stock. The product page does not provide a reliable volume-to-mass measure and does not establish the PGI status of the exact package. |
| `WP03-GOFIO-R46-20261013-S05` | Binter Canarias, [Canarias — French travel guide](https://www.bintercanarias.com/assets/documents/guides/fr/canarias_fr.pdf), PDF p. 27. | Uses the heading `Gofio (Farine)` and describes the toasted flour in Canarian food. It is regional tourism material, not Québec terminology authority. |
| `WP03-GOFIO-R46-20261013-S06` | Naturitas Canada, [Whole-wheat gofio, Sol Natural](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/gofio-whole-wheat-eco-400-g-of-powder-sol-natural). | The Canada-facing product entry calls the item whole-wheat gofio and says the wheat is from Galicia, demonstrating Canadian storefront use beyond the Canarian product. Direct retrieval returned a cache miss during this review; current stock and complete product details are not claimed. |

## Next action

Keep the Canarian PGI product as an evidence-only candidate. Reopen after a Québec-facing French dry-product label is found or a bundled recipe requests the product, and decide whether the catalog should represent only *Gofio Canario* or a broader gofio product family before assigning the bare `gofio` picker term. Then repeat exact owner, phrase-search, and corpus checks. Research numeric data only for the exact marketed product and form; do not infer density or substitutions from the related roasted-flour rows.

No tests were run because this is proposal-only research.
