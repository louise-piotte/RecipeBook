# WP04 Section P — fish frames / carcasses de poisson boundary review (R938)

- **Review date:** 2026-10-19.
- **Status:** Research proposal accepted and integrated on 2026-10-19. The proposal author made no shared-data changes; the accepted integration is documented in the [R936–R938 README](../batches/wp02-wp03-wp04-r936-r938-generic-gap-integration-20261019/README.md).
- **Candidate:** Fish frames: the fish portion remaining after fillets are removed, a culinary stock input in a Canadian federal processing report.
- **Recommendation:** Add an identity-only generic `fish frames / carcasses de poisson` reference in `PROTEIN`, with the French display treated as locally attested but not terminology-authority standardized. Keep it separate from loose fish bones, fish heads, fish stock, fish trimmings, and named species. The available evidence supports the ingredient concept, but not a universal recipe use or a household measure.
- **Scope:** One generic fish-part gap in the open WP04 checklist. No brands, product lines, flavours, SKUs, or retailer-variant rosters were researched.

## Open checklist gap

The WP04 animal-foods parent remains open. Its recent R932 fish-bones decision explicitly kept fish frames distinct and said the frame required its own Québec French naming review ([R932 proposal](wp04-section-p-generic-seafood-gap-review-r932-20261019.md); [plan checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L23760)). This proposal investigates only that separate part.

Fisheries and Oceans Canada defines fish frames as the portions left after fillets are removed and uses them as the main ingredient in a fish-stock processing recipe. A WorldFish/FAO report describes fish carcasses as post-processing parts including the head, skeleton, fins, and tail, with variable flesh. It reports regional food uses including fried fish, soups, and sauces; the reviewed passage does not report a specific consommé use. Québec culinary sources use `carcasse de poisson` for a fish-stock ingredient, but the available wording does not establish a standardized one-to-one Québec French equivalent for every industrial use of `fish frame`. The French label below is therefore a bounded, reviewer-checkable proposal, not a confirmed terminology standard. [R938-S01–S03; reused R932-S03]

## Current ownership and demand

Current bundled-package snapshot: **1,955 ingredient references**, **204 forms**, **55 legacy-import identities**, and **2,359 research-ledger records**. Exact normalized phrase checks over active reference names/aliases and attached form labels/match terms found no owner for `fish frame(s)`, `fish carcass(es)`, or `carcasse(s) de poisson`. The legacy-import identities and ledger have no fish-frame candidate. The only current ledger match is `WP04-SECTION-P-FISH-BONES-R932-20261019-S03`, which already uses DFO’s frame definition as a boundary citation on the fish-bones record; it does not allocate a fish-frames identity or transfer the DFO industrial quantity to fish bones.

A scan of all **114** manifest-listed recipes and **1,123** structured ingredient rows found no frame/carcass term in recipe text or ingredient rows. No recipe link, recipe-derived quantity, or substitution context is supported.

The neighboring active references remain distinct:

| Current reference | Current scope | Proposed boundary |
|---|---|---|
| `ingredient-ref-fish-bones` — `fish bones / arêtes de poisson` | Loose fish skeletal bones used as a stock input. | A frame is the remaining post-filleting structure and may include parts and flesh beyond loose bones. Do not merge or alias. |
| `ingredient-ref-fish-heads` — `fish heads / têtes de poisson` | Fish heads as a culinary part. | A frame may include a head depending on processing, but the head is not equivalent to the rest of the frame. Keep independently searchable. |
| `ingredient-ref-fish-stock` — `fish stock / fumet de poisson` | Prepared liquid. | Keep the raw part separate from the liquid made from it. |
| Named fish and seafood references | Their recorded species/product scopes. | Do not add any species alias or infer a frame from a named fish. |

Proposed identity fields if accepted:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-fish-frames` |
| Category | `PROTEIN` |
| English display | `fish frames` |
| Québec French display | `carcasses de poisson` (locally attested; reviewer confirmation needed for the post-filleting scope) |
| English alias | `fish frame` |
| French alias | `carcasse de poisson` |
| Density / unit mappings | None |

Do not add `fish bones`, `arêtes de poisson`, `fish heads`, `têtes de poisson`, `fish trimmings`, `parures de poisson`, or salmon-specific carcass wording as aliases. The Québécois Zeste guidance explicitly says its fish fumet uses fish bones and trimmings rather than salmon carcasses because the stock would be cloudy; that preparation-specific caution cannot be generalized to every species, fish part, or stock method. [R938-S03]

Current picker phrase-first projection gives no result for `fish frame(s)` or `carcasse(s) de poisson`. If accepted, each qualified query would return the proposed row. Broad `fish` would change from 25 to 26 results and `poisson` from 16 to 17; existing exact queries for fish bones, fish heads, and fish stock remain attached to their own references. The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

## Measurement, form, and substitution limits

- **Measurements:** DFO’s `125 lb fish frames` in a 50-gallon steam-jacketed kettle is an industrial source recipe. Its washing and gill/eye instructions are specific to that batch. Do not treat the amount as a household measure, serving, yield, or transferable frame-to-stock conversion. The DFO source is already recorded as R932-S03 on the fish-bones record; any frame-specific reuse should cite that same source without altering the fish-bones ownership or copying its amount. [reused R932-S03]
- **Québec recipe evidence:** Recettes du Québec lists `carcasse de poisson` as an ingredient in one fish-stock recipe, while its directions subsequently say to crush/add `arêtes de poisson`. Its note of 1 kg is expressly for fish bones and the mirepoix amount belongs to that recipe. It neither isolates a frame amount nor proves the two ingredient identities interchangeable. [R938-S02]
- **Other Québec use:** Zeste describes fish-stock preparation with `arêtes et parures de poisson` and excludes salmon carcasses in that specific clear-fumet context. It supplies no frame quantity. Do not transfer the bones/trimmings wording or the salmon caution to all fish species and methods. [R938-S03]
- **Forms:** The candidate itself is an anatomical/process boundary. The reviewed sources do not establish a stable global raw/fresh/frozen/cleaned form set. Add no forms.
- **Density, mappings, conversion, or yield:** None is supported. Recommend `defaultDensity: null`, no unit mappings or conversions, and no package-yield record.
- **Substitution:** None of the reviewed sources establishes a tested replacement between fish frames, loose bones, heads, trimmings, stock, or named fish parts. Similar stock use does not prove interchangeability. Add no global or contextual rule or recipe-line substitution; the measurement state is `researched_no_supported_value` and substitution state should remain `not_yet_researched` unless a later focused review supplies stronger evidence.

## Scope disposition

This is generic culinary ingredient diversity, not a commercial-product count. No brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only queue item was pursued. Any such roster-only work remains out of scope because commercial-product counts do not add ingredient diversity. Preserve existing branded rows and evidence; this proposal transfers no branded claim, product measurement, or SKU behavior. Review transferability before any later reuse.

## Proposal source register

These proposal-local source IDs are evidence references only and are not registered in the shared ledger.

| Source | Evidence | Limits |
|---|---|---|
| **Reused R932-S03** | Fisheries and Oceans Canada, [Development of Seafood Products in Newfoundland](https://waves-vagues.dfo-mpo.gc.ca/Library/39104.pdf), Fish Stock recipe and definition, printed p. 6. Defines frames as the portions left after fillets are removed and uses them in a stock-processing recipe. | Canadian fish-processing source. Its 125 lb / 50 gallon quantity and cleaning instructions are industrial-batch-specific, not household data. Already listed on the R932 fish-bones record as boundary evidence. |
| **R938-S01** | Kabahenda and Hüsken, [Low Value Fish Products — Lake Victoria (French report excerpt)](https://digitalarchive.worldfishcenter.org/server/api/core/bitstreams/d0dbfd32-d6c4-4bce-9954-70b552d2136c/content), WorldFish Center/FAO, 2009, p. 9. Describes `carcasses de poisson`, variable retained flesh, the parts included in the regional by-product stream, and regional food uses including fried fish, soups, and sauces; the reviewed passage does not report consommé. | Lake Victoria fish-processing and food context. It informs the concept and French wording but does not establish Québec availability, a universal anatomy, or a kitchen measure. |
| **R938-S02** | Recettes du Québec, [Fumet de poisson](https://www.recettes.qc.ca/recettes/recette/fumet-de-poisson-3509), ingredient list and method. Uses singular `carcasse de poisson` as an input; later instructions refer to crushing and adding `arêtes de poisson`. | Community recipe source with mixed terminology. It attests local culinary wording, not a standardized frame definition. Its 1 kg note is for bones in that recipe and is not a frame measure. |
| **R938-S03** | Zeste, [Fonds et bouillons : comment les faire maison?](https://www.zeste.ca/articles/fonds-bouillons-comment-faire-maison), fish fumet section; updated 2023-01-17. Chef Caroline McCann’s Québec guidance uses bones and trimmings and excludes salmon carcasses for the stated clear-fumet preparation. | A species/method-specific culinary limitation; not a general rule for all frames, fish, or stock recipes, and gives no amount. |
| **R938-R01** | Read-only audit of the current open plan, active ingredient references/forms, legacy-import identities, ledger source ownership, search behavior, and all manifest-listed recipes. | Confirms present ownership, picker projection, and lack of bundled demand only. |

## Recommendation

Accepted and integrated as identity-only `fish frames / carcasses de poisson` in `PROTEIN`, separate from loose bones and heads. Keep the Québec French wording provisional pending terminology review. No form, density, measure, conversion, yield, recipe link, or substitution was added; the DFO industrial measure remains source-scoped. Section P remains open.
