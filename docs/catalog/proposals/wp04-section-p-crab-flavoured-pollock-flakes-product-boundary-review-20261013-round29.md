# WP04 Section P — crab-flavoured pollock flakes product-boundary review (round 29)

- **Reviewed / sources accessed:** 2026-10-13.
- **Disposition:** Advance one identity-only `PROTEIN` reference for the prepared flake product named **crab-flavoured pollock flakes / goberge en flocons à saveur de crabe**. Keep it separate from both active pollock species, crab meat, fish balls, Bonga powder, and unresolved surimi. Do not attach it as a form to a fish species.
- **Scope:** the current bilingual Metro Selection flake-style item, product number `059749955195`, and the matching prepared-product phrase used in Metro's published quiche recipe. This is a formulated product, not a fish-species identity, generic surimi identity, or generic imitation-crab identity.
- **Proposal-only status:** no shared references, forms, ledger, plan, roadmap, recipe, or batch files changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-CRAB-FLAVOURED-POLLOCK-FLAKES-20261013-R29-`. It was absent from the current ledger and proposal/batch archive before drafting. Four new IDs are local to this packet; existing OQLF and CFIA sources are reused by their prior IDs.

## Decision

The live Section P plan still leaves fish powder, fish balls, and surimi open. The active catalog covers fish balls, one source-scoped Bonga powder, Alaska and Atlantic pollock species, and crab meat, but none represents the prepared crab-flavoured pollock-flake product. The current Metro item has a paired Québec French and English retail name, a distinct formulated ingredient declaration, and a published recipe using the same product phrase. That is sufficient for a narrow identity-only reference.

Use these proposed search terms:

- **English display:** `crab-flavoured pollock flakes`
- **French display:** `goberge en flocons à saveur de crabe`
- **English alias:** `flake style crab flavoured pollock`
- **French alias:** `flocons de goberge à saveur de crabe`

Do not add `pollock`, `goberge`, `surimi`, `imitation crab`, `similicrabe`, `crab meat`, or any fish-ball or fish-powder wording as an alias. The retail name's “pollock” and “goberge” are product wording only: the reviewed package page gives no scientific species. Its ingredient declaration lists pollock with water, wheat starch, liquid egg white, starches, sugar, mirin, oil, seasonings, and crab flavour; its allergen summary also lists crab. These details support keeping the prepared product separate from raw pollock and actual crab meat, but do not establish one taxon, a standard formula, or a universal product-family definition.

The exact SKU is not assigned to `ingredient-ref-alaska-pollock` or `ingredient-ref-atlantic-pollock`. OQLF scopes `goberge` to *Pollachius virens* and separately names *Gadus chalcogrammus* as `goberge de l’Alaska`; CFIA's pollock list includes both species under `Pollock` and includes Alaska French variants. The retail page does not choose between those taxa. Preserve the bilingual retail phrase only and add no species or taxon alias [reused sources `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01`, `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01`, `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S03`].

Do not identify the SKU as generic `surimi` or `similicrabe`. OQLF defines `surimi` as a fish-protein paste and `similicrabe` as a surimi-based food imitating crab; CFIA says finished surimi products need a generally known name with appropriate descriptors and that imitations should be clearly identified. The reviewed Selection listing names pollock flakes, provides a multi-ingredient declaration, and includes crab in its allergen summary. Neither the product page nor the recipe assigns this SKU to OQLF's generic term `similicrabe`; leave these terms separate [reused sources `WP04-FBSUR-20261011-S13` and `WP04-CRAB-MEAT-20261011-S03`].

## Live catalog, ledger, exact ownership, and picker effects

The current worktree package contains **1,362 active references, 100 forms, 64 legacy candidates, and 114 manifest-listed recipes with 1,123 ingredient rows**. Exact-key checks used the app's `normalizeIngredientSearchKey` rules across active reference names/aliases, form labels/match terms, and legacy names/aliases. Picker behavior uses complete word-phrase matches before substring fallback.

| Candidate or nearby owner | Current exact ownership and boundary |
|---|---|
| `crab-flavoured pollock flakes`; `flake style crab flavoured pollock`; `goberge en flocons à saveur de crabe`; `flocons de goberge à saveur de crabe` | No exact active reference, form, or legacy owner. No focused earlier proposal or batch decision for this exact flake product was found. |
| `ingredient-ref-alaska-pollock` | Active identity `Alaska pollock / goberge de l’Alaska`, scoped to *Gadus chalcogrammus*. The new product is not a raw-fish form. |
| `ingredient-ref-atlantic-pollock` | Active identity `Atlantic pollock / goberge de l’Atlantique`, scoped to *Pollachius virens*. The new product is not a raw-fish form. |
| `ingredient-ref-crab` and its `ingredient-form-crab-jumbo-lump` | Active actual-crab-meat identity and grade form. Neither owns the proposed flake-product phrases. |
| `ingredient-ref-fish-balls`; `ingredient-ref-bonga-dried-fish-powder` | Active formed fish-ball identity and source-scoped powder identity; neither owns this product or supplies a form/substitution relation. |
| `candidate-surimi-product-boundary` | Ledger-only `needs_clarification` candidate with `researched_no_supported_value` measurement state and `researched_no_supported_substitute` substitution research. The bare term remains unresolved and is not an active picker result. |

The exact proposed English and French phrases currently return no picker result. With the proposed row, each qualified phrase would resolve to that row alone. Bare `pollock` and `goberge` currently return the two species rows; the new row would make each query return both species plus this clearly named prepared product. Bare `crab` and `crabe` currently return blue crab, Dungeness crab, Jonah crab, and crab meat; the new row would add a fifth, visibly qualified result. `crab meat` / `chair de crabe` would continue to return only the actual crab-meat row. `surimi`, `imitation crab`, and `similicrabe` currently have no active result and remain unassigned because none is added as an alias.

The proposal archive and the live catalog already cover the generic fish-ball decision, the Bonga-specific powder, the anchovy-powder hold, generic fish-powder hold, surimi paste/product ambiguity, and the held Aquamar surimi-shreds listing. This proposal does not reopen or duplicate those decisions.

## Recipe-demand audit

The full scan of all **114** manifest-listed recipe files, all **1,123** ingredient rows, and recipe JSON text found no bundled match for the proposed English/French product phrases or adjacent `pollock flakes`, imitation-crab, surimi, fish-ball, or fish-powder terms. No bundled recipe link is proposed.

Metro's still-published bilingual **Pollock Quiche / Quiche à la goberge** pages provide external recipe demand for this precise prepared-product wording. Both are dated 2013-08-06 and serve four. The English page specifies `1/2 lb (225 g) crab-flavoured pollock flakes`; the French page specifies `150 g (1/3 lb) flocons de goberge à saveur de crabe`. The shared title, date, preparation, and image indicate parallel versions, but their ingredient amounts disagree. This supports the product identity and a recipe-use example; it does not establish one reliable standard portion or a value to attach to the app's catalog.

## Numeric and substitution limits

The current Metro retail listing gives a **227 g package** for product `059749955195`. That is one package's declared mass, not a portion, density, volume mapping, or yield. The two Metro quiche versions disagree on amount; do not reconcile or average them. Neither source gives a household volume, cooked yield, edible fraction, or repeatable mass-volume measure. Add no active measurement, mapping, conversion, yield, or form.

No reviewed source establishes a directed recipe substitution between this formulated product and raw Alaska/Atlantic pollock, actual crab meat, fish balls, surimi paste, surimi shreds, or any fish powder. Product marketing and the “crab flavour” wording do not establish a recipe-tested ratio or equivalent cooking behavior. Add no substitution rule or recipe-line link.

## Source register

Retail pages were accessed 2026-10-13. Seller product details and inventory can change; the listed ingredients and package information are evidence for this retailer's named product only.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CRAB-FLAVOURED-POLLOCK-FLAKES-20261013-R29-S01** | Metro, [Selection Flake Style Crab Flavoured Pollock](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/flake-style-crab-flavoured-pollock/p/059749955195), product `059749955195`, 227 g; product description and ingredients. | Current English listing describes a pre-cooked prepared product and lists pollock plus water, starches, egg white, sugar, mirin, oil, seasonings, crab flavour, and crab in the allergen summary. No scientific pollock species or universal formula is stated. |
| **WP04-SECTIONP-CRAB-FLAVOURED-POLLOCK-FLAKES-20261013-R29-S02** | Metro, [Goberge en flocons à saveur de crabe](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/goberge-en-flocons-a-saveur-de-crabe/p/059749955195), same product `059749955195`, 227 g; product description and ingredients. | Paired Québec retailer display and the same SKU number. Uses `goberge` in its product name, but does not specify a biological species; this is product-name evidence, not taxonomic evidence. |
| **WP04-SECTIONP-CRAB-FLAVOURED-POLLOCK-FLAKES-20261013-R29-S03** | Metro, [Pollock Quiche](https://www.metro.ca/en/recipes-occasions/recipes/pollock-quiche), recipe dated 2013-08-06; ingredient list and yield. | Uses 225 g / 1/2 lb of crab-flavoured pollock flakes in a four-serving quiche. This recipe amount is product-specific and conflicts with its French parallel. |
| **WP04-SECTIONP-CRAB-FLAVOURED-POLLOCK-FLAKES-20261013-R29-S04** | Metro, [Quiche à la goberge](https://api.metro.ca/recettes-et-occasions/recettes/quiche-a-la-goberge), recipe dated 2013-08-06; ingredient list and yield. | Uses 150 g / 1/3 lb of flocons de goberge à saveur de crabe in a four-serving quiche. The English parallel gives 225 g; do not treat either as a standard portion. |
| **Existing `WP04-FBSUR-20261011-S13`** *(reused)* | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Surimi” section. | Current Canadian guidance distinguishes surimi paste from named finished products and calls for clear imitation naming where applicable. It is labelling guidance, not a determination that this SKU is a particular surimi or imitation-crab product. |
| **Existing `WP04-CRAB-MEAT-20261011-S03`** *(reused)* | OQLF, [similicrabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199054/similicrabe). | Defines `similicrabe` as a surimi-based food imitating crab. It is a neighboring boundary, not an alias for the reviewed pollock-flake listing. |
| **Existing `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01`, `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01`, and `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S03`** *(reused)* | OQLF, [goberge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge); CFIA Fish List, [Pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock); OQLF, [goberge de l’Alaska (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199004/goberge-de-lalaska). | Existing source records establish the raw-species naming overlap and support keeping this prepared product out of both fish identities. The CFIA list is species/common-name evidence, not a package declaration for the Selection product. |

The four new source IDs and exact product/recipe URLs were absent from the ledger and proposal/batch archive at drafting time. OQLF/CFIA sources reuse their existing ledger source IDs; this proposal does not add ledger entries.

## Next action

If accepted, add only the identity-only prepared-product reference and the four narrowly scoped phrases above. Keep the WP04 Section P powder/ball/surimi checklist open for the unresolved generic boundaries and any other product work. Do not modify the plan, roadmap, ledger, forms, recipe package, or tests as part of this proposal.
