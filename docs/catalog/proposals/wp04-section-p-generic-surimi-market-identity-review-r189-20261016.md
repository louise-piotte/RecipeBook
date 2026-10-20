# WP04 Section P — generic surimi market-identity review (R189)

## Scope and recommendation

- **Review date:** 2026-10-16.
- **Scope:** Reassess the open generic `surimi` identity against current Canadian and Québec terminology, market use, active catalog ownership, picker behavior, and bundled recipe demand. This is a proposal only.
- **Recommendation:** Keep `candidate-surimi-product-boundary` unresolved. Do not add an active generic `surimi` reference, aliases, forms, measures, conversions, yields, recipe links, or substitutions. OQLF supports a technical fish-protein paste sense, but current Québec consumer material uses bare *surimi* for cooked, ready-to-eat seafood. The only Canadian maker found for raw paste presents it as a proprietary commercial/industrial input, without a product-matched French name. The term therefore does not yet identify one stable Canadian/Québec recipe ingredient across these sources.

This hold is limited to the unqualified generic identity. Keep the existing `fish balls / boulettes de poisson`, `fish tofu / tofu au poisson`, and `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe` identities distinct. The earlier holds on Aquamar `surimi shreds / râpé de surimi` and naruto maki remain in effect and are not reopened here.

## Identity and product boundary

| Wording or product | Evidence and boundary | Disposition |
|---|---|---|
| `surimi` (technical ingredient sense) | OQLF defines it as fish myofibrillar-protein paste with cryoprotectants, used notably to make imitation seafood; its preferred French and English terms are both `surimi`. This is a clear technical sense, but the definition does not determine what an unqualified consumer recipe line or retailer listing means. [S01] |
| `surimi brut / raw surimi` | OQLF separately defines this as fish-protein paste without additives. It is narrower than the general technical `surimi` entry. A supplier's “raw surimi paste” cannot be mapped here without evidence that it meets the no-additives boundary. [S02, S09] |
| `simili-fruits de mer / imitation shellfish` | OQLF defines finished foods made from textured, steamed surimi paste and notes the Japanese term `kamaboko`. This is a finished-product class, not raw paste or a generic synonym. [S03] |
| Canadian raw surimi paste | Toronto manufacturer Ocean Food Company lists a proprietary raw surimi paste under its commercial/industrial food-service market, separately from its ready-to-eat surimi crab, fish balls, and kamaboko product lines. It gives no consumer ingredient panel or paired French display for the raw paste. [S09] |
| Québec consumer `surimi` | Metro's French consumer article describes surimi as a cooked, ready-to-eat product made from precooked fish, typically pollock and whiting, seasoned with crab or lobster flavour, and used in salads, sandwiches, or other dishes. That usage conflicts with treating bare `surimi` as a raw paste ingredient in a consumer-facing picker. [S06] |
| Aquamar `surimi shreds / râpé de surimi` | Metro lists a specific 227 g prepared product under these English and French names. The 227 g is a package size only. This is the product already held outside the active catalog because it would otherwise own the bare `surimi` search alone. [S07, S08; see the existing hold in the current-ownership section] |
| Fish balls, fish tofu, and crab-flavoured pollock flakes | These are separate formed or prepared products with current active references. Their sources do not make any of them a generic surimi row or a default surimi form. See the existing owners linked below. |
| Naruto maki | Earlier review supports a specific steamed fish-paste cake but found no recipe demand and identified broad `fish cake`/`maki` picker effects. It remains outside active references and forms. See the existing boundary review linked below. |

CFIA guidance reinforces the need to name the finished product precisely: surimi is the fish paste input; Canadian rules do not prescribe a common name for finished products made from it, and labels should use a generally known or descriptive name with suitable descriptors. Products that imitate more expensive seafood should clearly identify the imitation. This guidance supports the boundary between ingredient material and finished food; it does not establish one Canadian retail meaning for bare `surimi`. [S04, S05]

## Current ownership and catalog mapping

| Surface | Current state |
|---|---|
| Active ingredient reference | No reference or alias owns `surimi`, `surimi paste`, `raw surimi`, `surimi brut`, `pâte de surimi`, `surimi shreds`, `râpé de surimi`, `imitation crab`, `similicrabe`, or `naruto maki`. Existing active rows are `ingredient-ref-fish-balls`, `ingredient-ref-fish-tofu`, and `ingredient-ref-crab-flavoured-pollock-flakes`, with the bilingual names shown above. |
| Ingredient forms | No surimi, fish-ball, fish-tofu, or crab-flavoured pollock form is active. The three existing references are identity-only. |
| Legacy import identities | The 61-candidate legacy file contains no matching surimi or adjacent product identity. No legacy allocation is proposed. |
| Research ledger | `candidate-surimi-product-boundary` is the sole generic surimi owner. It is `needs_clarification`, with `researched_no_supported_value` measurement state and `researched_no_supported_substitute` substitution research state. Retain that candidate; do not create a second generic record. Existing records own the fish-ball, fish-tofu, and crab-flavoured pollock references. |
| Proposal and batch archive | The [2026-10-11 surimi reassessment](wp04-fish-balls-surimi-current-source-reassessment-20261011.md) already recommended keeping the generic candidate unresolved. The [Aquamar shreds hold](../batches/wp04-section-p-surimi-shreds-search-hold-integration-20261012/README.md) and [naruto maki hold](wp04-section-p-naruto-maki-product-boundary-review-20261013-round38.md) are separately documented. The [fish-ball](wp04-fish-balls-surimi-product-boundary-review-20261011.md), [fish-tofu](wp04-section-p-fish-tofu-product-identity-review-r147-20261015.md), and [crab-flavoured pollock flakes](wp04-section-p-crab-flavoured-pollock-flakes-product-boundary-review-20261013-round29.md) proposals document the existing active owners. This review refreshes the market evidence and preserves those decisions rather than duplicating their product rows. |

If later accepted, the mapping should be decided only after a recipe or current Canadian/Québec product identifies which paste is intended: OQLF `surimi` (with cryoprotectants) or narrower `surimi brut` (without additives). Add one `PROTEIN` reference only for the source-defined paste, with only source-attested bilingual wording. Do not reserve an ID or add `surimi` as an alias to finished shreds, imitation crab, kamaboko, naruto maki, fish balls, or fish tofu. No forms, numeric values, conversions, yields, recipe links, or substitutions are supported here.

## Picker behavior and collision audit

`IngredientSearch.kt` normalizes case, accents, ligatures, punctuation, and whitespace; it returns complete normalized phrase matches before partial matches. The exact current catalog query results are:

| Query | Current active result |
|---|---|
| `surimi`, `surimi paste`, `raw surimi`, `surimi brut`, `pâte de surimi`, `surimi shreds`, `râpé de surimi` | No result. The candidate is ledger-only, and the Aquamar shreds product remains held. |
| `fish balls`, `fish ball`, `boulette de poisson` | `ingredient-ref-fish-balls` only. |
| `fish tofu`, `tofu au poisson`, `tofu de poisson` | `ingredient-ref-fish-tofu` only. |
| `crab-flavoured pollock flakes`, `goberge en flocons à saveur de crabe` | `ingredient-ref-crab-flavoured-pollock-flakes` only. |
| `pollock`, `goberge` | Alaska pollock and Atlantic pollock species plus the separate crab-flavoured pollock flakes product. Do not add a generic surimi species alias. |
| `imitation crab`, `similicrabe`, `fish cake`, `naruto maki`, `kamaboko` | No active result. The respective product boundaries remain unresolved or held. |

Activating a bare `surimi` row now would make a technical paste result appear to be the sole answer for a consumer term that Metro uses for a ready-to-eat food. Activating only the held shreds row would recreate the known single-result collision. Adding both would cause `surimi` to return both once each were active, but the existing evidence still does not tell which product a bare recipe request means. Keep both outside the picker until the intended scope is source-backed and the rows can be named distinctly.

## Bundled recipe demand and numeric/substitution evidence

The scan covered all 114 manifest-listed recipe files and all 1,123 ingredient rows, including full ingredient-line text. It found no request for generic surimi, surimi paste, raw surimi, surimi brut, Aquamar shreds, imitation crab, similicrabe, fish balls, fish tofu, crab-flavoured pollock flakes, kamaboko, or naruto maki. No recipe link is proposed.

The Metro shreds listing's 227 g value is a SKU package mass, not a portion, density, cup mapping, or yield. Metro's consumer article gives an 85 g nutrition portion for its ready-to-eat consumer product; that value does not describe raw paste and is not a recipe measure. No source reviewed here supplies a reproducible generic surimi-paste density, volume-to-mass mapping, preparation yield, or recipe quantity. No source establishes a directed substitution among raw surimi paste, finished shreds or imitation seafood, fish balls, fish tofu, fish cakes, or crab-flavoured pollock flakes. Add no numeric or substitution behavior.

## Reopen conditions

Revisit the hold when a bundled recipe or current Canadian/Québec product page requests a specific surimi paste state and supplies enough source-matched English/French wording to distinguish raw base paste from ready-to-eat surimi seafood. Verify any additives/state before choosing between `surimi` and `surimi brut`. Reassess the picker with the specific paste and prepared products visible as separate choices. Add measures, forms, yields, conversions, substitutions, or recipe links only when the corresponding quantity or tested direction is supported for that exact product and use.

## Source register

The R189 source IDs below are unique to this proposal; each ID points to one URL. They were checked online on 2026-10-16. Local catalog ownership and prior boundary reviews are linked in the sections above rather than entered as source records.

| Source ID | Source | Support and limits |
|---|---|---|
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S01** | OQLF, [surimi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199047/surimi). | Defines the technical fish-protein paste with cryoprotectants and gives `surimi` as both the preferred French term and English equivalent. It does not establish consumer recipe usage. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S02** | OQLF, [surimi brut (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199046/surimi-brut). | Defines raw surimi as paste made of fish myofibrillar proteins with no additives; gives `raw surimi` and `fresh surimi` as English terms. It is narrower than general surimi. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S03** | OQLF, [simili-fruits de mer (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199045/simili-fruits-de-mer). | Defines finished imitation shellfish foods from textured, steamed surimi paste and notes `kamaboko`; it does not make finished products aliases for the paste. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S04** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Current federal guidance defines surimi as a paste made from highly refined minced fish; finished products use generally known or descriptive names and should clearly identify imitations where applicable. This is labeling guidance, not a product approval. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S05** | CFIA, [Exigences en matière d’étiquetage pour le poisson et les produits de poisson](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/poisson). | French page gives the same boundary and examples including `goberge d’Alaska à saveur de crabe` and `kamaboko à saveur de homard`; it does not prescribe a generic surimi product name. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S06** | Metro, [Connaissez-vous le Surimi?](https://api.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/connaissez-vous-surimi). | Québec consumer education uses bare `surimi` for precooked fish, described as cooked and ready to eat, with salad, sandwich, and other meal uses. It establishes local retailer wording, not a technical definition or raw-paste equivalence. Its 85 g nutrition portion is product-context evidence only. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S07** | Metro, [Râpé de surimi Aquamar, 227 g](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/rape-de-surimi/p/605453810154). | Québec retailer page gives the French finished-product name, package size, and product number 605453810154. Product availability is location-specific; package weight is not a reusable recipe amount. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S08** | Metro, [Aquamar Surimi shreds, 227 g](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/surimi-shreds/p/605453810154). | English paired listing uses `Surimi shreds` for the same product number 605453810154; supports the bilingual finished-product pair, not raw paste identity. |
| **WP04-SECTIONP-GENERIC-SURIMI-R189-20261016-S09** | Ocean Food Company, [manufacturer overview and product markets](https://www.oceanfoodcompany.com/). | Toronto manufacturer separates its fresh/frozen surimi crab, fish balls, and kamaboko product lines from raw proprietary surimi paste sold for commercial/industrial use. The site provides no consumer-facing ingredient panel or French display for the raw paste. |

The generic candidate's earlier source record and the prior Aquamar-shreds hold remain in the live ledger and batch archive. No shared catalog or ledger data changed; the Section P checklist and roadmap now record this review in the R189 integration README.
