# WP03 Section F — Chiapas tascalate dry-mix identity review (R50, 2026-10-13)

- **Decision:** Recommend one identity-only reference for the named Chiapas dry tascalate mix: proposed `ingredient-ref-tascalate`, displayed as `tascalate / tascalate`, category `GRAIN_AND_CEREAL`. Keep aliases, forms, recipe links, measurements, conversions, yields, and substitutions empty.
- **Scope:** The named maize-based dry drink mix sold as tascalate in Chiapas. Do not use it for prepared tascalate beverage, fermented pozol, generic roasted corn flour, or other maize-and-cacao powders.
- **Open checklist:** Section F still lists “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” at [plan line 2539](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Recommendation limit:** The product identity is source-supported, but its ingredient proportions and exact recipe formulation are not standardized by the sources. The proposed row should represent the named dry mix, not encode a recipe formula.

## Review boundary and prior work

The 2026-10-09 WP06 Mexico/Central America sweep excluded finished drinks and named beverages, while explicitly leaving separately labeled retail dry beverage mixes open for product-level review [S04]. This review covers that product boundary: Chiapas's state-run artisan marketplace currently lists a 250 g bag titled `TASCALATE LINAVIDA`, and the official tourism page describes tascalate as a ground maize, cacao, cinnamon, achiote, and sugar mixture ground to powder [S01–S02]. Neither the broad sweep nor the current Section F archive contains a focused tascalate decision. Exact scans of the live plan, roadmap, proposals, catalog, forms, legacy candidates, and ledger found no tascalate spelling or source-ID collision before this proposal.

This is not a proposal for the prepared drink itself. It does not reopen pinole, atole, champurrado, pozol, the held hominy/pozole boundaries, or the existing corn-flour and cornmeal references.

## Product and naming boundary

| Boundary | Source-backed finding | Proposed catalog treatment |
|---|---|---|
| **Product identity** | The Chiapas state artisan marketplace lists a named bag of tascalate made from yellow maize, cacao, sugar, cinnamon, and achiote; the product page gives a 250 g package size and warns that handmade pieces can vary [S01]. The official Chiapas tourism page describes a ground maize/cacao/cinnamon/achiote/sugar mixture, made into reddish powder and mixed with water or milk [S02]. | Add only the regional product name `tascalate`. Keep `LINAVIDA` as source/brand context, not a catalog alias. The package size is not an ingredient measure. |
| **Composition limits** | The French-language Chiapas tourism guide also uses `tascalate`, but its 2014 gloss describes maize, chocolate, nuts, and vanilla rather than the current marketplace's ingredient list [S03]. The sources therefore do not establish one universal formulation. | Treat the dry mix as a named product family; do not store a fixed ingredient ratio or list individual components as aliases. Keep `pinole`, pozol, and other maize/cacao mixes distinct. |
| **English and Québec French** | The state product is titled `TASCALATE LINAVIDA`; the official English tourism page is indexed under `Tascalate`, and the French Chiapas guide keeps that spelling unchanged [S01–S03]. No Québec terminology ruling or Québec-facing package wording was located in this review. | Use `tascalate` in both display fields as a provisional loan name. Do not invent `poudre de tascalate`, `boisson de maïs au cacao`, or a generic `Mexican drink mix` alias. Québec wording remains open to independent confirmation. |
| **Alternate spellings and prepared forms** | The state product listing and official tourism page use `tascalate` [S01–S02]. The tourism source describes a powder used to prepare a beverage, not the beverage as a stored catalog form [S02]. | Add no unverified alternate-spelling aliases and no prepared/cooked form. Keep prepared tascalate outside this dry-product identity. |

## Exact ownership and picker effects

At this snapshot, the active catalog has **1,370 references** and **100 forms**; the legacy-import file has **64 candidates**, and the research ledger has **1,700 records**. Exact case-insensitive scans of active references, forms, legacy candidates, and ledger records found no owner or mention for `tascalate`, `tazcalate`, `taxcalate`, `tlascalate`, or `tascasalate`. The proposal-specific prefix `WP03-F-TASCALATE-R50-20261013-S` was also absent before this file was created.

| Current owner or neighbor | Exact boundary | Proposed effect |
|---|---|---|
| None for `tascalate` and the scanned spelling variants | No active reference, form, legacy candidate, or ledger record owns these names. | Add one proposed identity with no aliases; only exact `tascalate` search becomes a new result. |
| `ingredient-ref-roasted-corn-flour` — `roasted corn flour / farine de maïs torréfiée` | `FLOUR_AND_STARCH`; no aliases or forms, null density, and empty unit mappings. It denotes a generic roasted corn flour. | Keep it separate; the named tascalate mix also contains cacao, sugar, cinnamon, and achiote. |
| `ingredient-ref-cornmeal` — `cornmeal / semoule de maïs` | `FLOUR_AND_STARCH`; English alias `corn meal`; no forms or active numeric data. | Keep generic cornmeal separate; do not add tascalate as an alias. |
| `ingredient-ref-masa-harina` — `masa harina / farine de maïs nixtamalisée` | `FLOUR_AND_STARCH`; nixtamalized maize flour. | Keep separate; no source supports equivalence or substitution. |
| `ingredient-ref-corn-kernels`, `ingredient-ref-corn-tortillas`, cocoa-powder references, `ingredient-ref-ground-cinnamon`, and sugar references | Each row owns only its named ingredient; no row represents the full tascalate blend. No exact active achiote/annatto/roucou owner was found. | Keep component identities and their search terms unchanged; do not map the composite name to any one component. |

`IngredientSearch.kt` matches bilingual display names and aliases as normalized complete phrases before partial matching. Current `tascalate` returns **0** references. If the proposed identical English/French display name is added, `tascalate` returns **1** result; `tazcalate`, `taxcalate`, `tlascalate`, `tascasalate`, and `tascalate powder` remain at **0** because no aliases are proposed. Exact existing queries for `roasted corn flour`, `cornmeal`, `masa harina`, `corn tortillas`, `ground cinnamon`, and cocoa powders stay with their current owners.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across full recipe JSON for `tascalate`, `tazcalate`, `taxcalate`, `tlascalate`, and `tascasalate`.

- Candidate-term recipe files: **0**.
- Candidate-term ingredient rows: **0**.
- Existing ingredient-reference links to tascalate: **0**.

The identity is supported by current regional product evidence, not by existing bundled recipe demand. The recipe corpus supplies no tascalate-specific amount or substitution need.

## Numeric and substitution limits

- The marketplace's **250 g** value is the listed package size for one handmade product [S01]. It is not a cup, spoon, density, or reusable unit mapping.
- The official tourism page gives one preparation example with **250 g cacao, 2 kg dry maize, 1 kg sugar, 10 g achiote, 20 g cinnamon, five toasted tortillas, 3 L water, and ice** [S02]. Its preparation steps then say to mix the ground powder with water, ice, and sugar. These are beverage-recipe quantities; the page does not identify them as the composition of the listed bag or state a reliable package yield. Keep all values inactive.
- Add no default density, volume-to-mass conversion, portion measure, package-yield rule, or dry/prepared form pair. The available sources do not support transferring values from the example recipe to a packaged mix.
- Add no global or contextual substitution between tascalate and roasted corn flour, cornmeal, masa harina, cocoa powder, sweetened cocoa mix, atole mix, or pozol. These products differ in composition and preparation; the reviewed sources provide no tested ratio or method.

## Source register

Sources were checked online on 2026-10-13. These source IDs are unique to this proposal; the shared research ledger was not edited.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-F-TASCALATE-R50-20261013-S01` | Instituto Casa de las Artesanías de Chiapas / Gobierno del Estado de Chiapas, [“TASCALATE LINAVIDA” product page](https://casadelasartesaniaschiapas.gob.mx/online/detalle_producto.php?id=99). | Current state-run listing names a bag of tascalate, lists yellow maize, cacao, sugar, cinnamon, and achiote, gives 250 g, and notes handmade variation. It is one seller's listing, not a standard formula or a Québec package label. |
| `WP03-F-TASCALATE-R50-20261013-S02` | Visit Chiapas, [“Tascalate”](https://visitchiapas.com/v1/1tascalate); its English page is indexed as [“Tascalate”](https://en.visitchiapas.com/v1/1tascalate) (direct retrieval was unavailable during this review). | The Spanish official tourism page calls tascalate a ground-maize/cacao/cinnamon/achiote/sugar mixture, describes grinding to reddish powder and mixing with water or milk, and provides one beverage recipe. The English result confirms the same name only. Recipe amounts are not package proportions or a standardized measure. |
| `WP03-F-TASCALATE-R50-20261013-S03` | Chiapas tourism guide, [Guide Touristique de Chiapas](https://programadestinosmexico.com/guias-turisticas-de-mexico/chiapas-guia/Guide-Touristique-de-chiapas.pdf), p. 35. | French-language source uses `tascalate` unchanged and identifies it as a maize-based drink, but gives a different ingredient gloss (chocolate, nuts, vanilla). Supports the loan-name spelling only; it is older and not a current product label. |
| `WP03-F-TASCALATE-R50-20261013-S04` | WP06, [Mexico/Central America gap sweep, 2026-10-09](wp06-mexico-central-america-gap-sweep-20261009.md), scope and beverage boundary. | The sweep excluded finished beverages such as atole and champurrado while leaving a separately labeled dry beverage mix open to product-family review. It did not mention or decide tascalate. |

## Next action

Review the proposed identity-only `ingredient-ref-tascalate` for integration as `tascalate / tascalate` in `GRAIN_AND_CEREAL`, with no aliases or numeric/form data. Keep Section F open for its remaining cereal-mix and preprocessed-grain candidates. Seek independent Québec product wording if a Québec-facing package becomes available.

No shared catalog, ledger, plan, roadmap, generated file, or test was changed as part of this proposal-only review.
