# WP04 Section P — fish bones identity review (R932)

- **Review date:** 2026-10-19.
- **Status:** Proposal only. No catalog, ledger, plan, workflow, roadmap, recipe, or batch file was changed.
- **Recommendation:** Add identity-only generic `fish bones / arêtes de poisson` as a `PROTEIN` reference for fish skeletal bones used as a culinary stock input. Keep it separate from fish heads, fish stock, fish frames, named fish, and other seafood parts.
- **Coverage boundary:** This is one generic anatomical ingredient gap. It does not propose a commercial brand, product line, flavour, SKU, or retailer variant.

## Open Section P gap

The active plan's [Section P seafood parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L7280) leaves broad fish, parts, and seafood coverage open. R906 recently added `fish heads / têtes de poisson` and expressly kept bones/frames distinct from that head identity and from fish stock ([R906 plan entry](../../RecipeBook-global-ingredient-catalog-plan.txt#L23562); [R906 review](wp04-generic-fish-heads-identity-review-r906-20261019.md)). This proposal advances the separate **fish bones** part only.

The open gap is generic culinary ingredient diversity: fish bones are used as an input to fish stock, and the Québec French term is directly documented. It is distinct from the head itself, the liquid stock produced from fish parts, and fish frames as a post-filleting remainder. This review does not treat every fish species' bones as interchangeable for every recipe.

## Current ownership and picker consequences

Current bundled package snapshot: **1,951 ingredient references**, **204 forms**, **55 legacy identities**, and **2,355 ledger records**. Exact searches across active display names and aliases, forms and match terms, legacy identities, and ledger IDs found no `fish bone(s)`, `arête(s) de poisson`, or `fish frame(s)` identity or form. The only ledger text match is R906's decision to keep bones/frames separate from fish heads; it is not a fish-bones identity record. Archive search found no focused fish-bones proposal or allocation.

The neighboring active rows remain unchanged:

| Existing row | Current scope | Effect of this proposal |
|---|---|---|
| `ingredient-ref-fish-heads` — `fish heads / têtes de poisson` | Fish heads as a culinary part; singular aliases only. | Remains a distinct choice; no head alias is transferred. |
| `ingredient-ref-fish-stock` — `fish stock / fumet de poisson` | Prepared stock liquid. | Remains a separate ingredient; no stock alias is added to bones. |
| Named fish and prepared seafood references | Their recorded taxa and product boundaries. | No fish-specific bone claim or product form is inferred for them. |

Proposed identity and scoped search terms:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-fish-bones` |
| Category | `PROTEIN` |
| English display | `fish bones` |
| Québec French display | `arêtes de poisson` |
| English alias | `fish bone` |
| French alias | `arête de poisson` |
| Density / unit mappings | None |

`arête de poisson / fish-bone` is the OQLF GDT term pair, and the Québec Metro recipe uses plural `arêtes de poisson` in its French fish-stock title and directions. Do not add bare `bone(s)`, `os de poisson`, `fish frame(s)`, `carcasse(s) de poisson`, `fish head(s)`, or species names as aliases. The frame is a distinct part definition and requires its own Québec naming review before allocation.

Static projection using current phrase-first picker behavior:

| Query | Current results | With proposed identity |
|---|---:|---:|
| `fish bones`, `fish bone` | 0 | 1 fish-bones result |
| `arêtes de poisson`, `arête de poisson` | 0 | 1 fish-bones result |
| `fish` | 24 | 25 |
| `poisson` | 15 | 16 |
| `bone` | 1 (`bone-in pork shoulder`) | 2, adding fish bones |

The broad queries gain a result through the qualified display words, not broad aliases. The proposed specific display keeps the added choice identifiable alongside the many existing fish/poisson results.

## Culinary evidence and boundary

The OQLF's GDT records `arête de poisson` with English `fish-bone`, credited to FAO's 1972 ichthyology terminology. This supplies the Québec-facing term pair, but by itself does not establish a recipe ingredient or preparation. [R932-S01]

Metro's bilingual consumer recipe **Fish Stock with Fish Head and Bones / Fumet de poisson avec tête et arêtes de poisson** explicitly uses fish head and bones as stock inputs. Its ingredient line combines them as `1 fish head and bones`, while its preparation says to add the rinsed head and bones. This supports culinary use but does not isolate the bones, establish a species, or give a standalone bone quantity. [R932-S02]

Fisheries and Oceans Canada's fish-processing report separately defines **fish frames** as the portions left after fillets are removed and uses frames in a fish-stock processing recipe. The report's `125 lb` in a `50 gallon` kettle is tied to that industrial formula; it does not measure loose fish bones or a household amount. The definition supports keeping frames distinct here rather than adopting `fish frames` as an alias. [R932-S03]

## Recipe demand and data behavior

A read-only scan of all **114 manifest-listed recipes and 1,123 structured ingredient rows** found no `fish bone(s)`, `arête(s) de poisson`, or `fish frame(s)` mention. There is no bundled recipe link or recipe-derived amount to add. Metro's external recipe is evidence of culinary use only; its combined one-head-and-bones input remains scoped to that recipe and its four-cup stock formula.

If accepted, add only the identity and the two singular, source-attested aliases shown above. Add no form, density, unit mapping, conversion, generic measure, yield, recipe link, or substitution. Keep fish frames, heads, trimmings, stock, pin bones in fillets, and species-specific fish parts outside this identity unless separately reviewed.

- **Measurement/density:** Research supports no reusable value. Metro's combined ingredient count is not a bone count or mass; DFO's industrial frame amount is not transferable to loose bones. Recommend `measurementState: researched_no_supported_value`, `defaultDensity: null`, and no unit mappings.
- **Substitution:** No role-, method-, or dish-scoped comparison establishes replacements among fish bones, frames, heads, stock, or other seafood parts. Recommend `substitutionResearchState: not_yet_researched`; add no rule.
- **Forms:** The sources do not specify a stable raw, cooked, fresh, frozen, or cleaned state for generic fish bones. Add none.

## Preservation and scope disposition

No brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task was pursued for this gap. Commercial-product counts do not add ingredient diversity, so any Section P queue item limited to such a roster should be marked out of scope with that reason and not researched further. Preserve all existing branded rows and their evidence. This proposal transfers no product-specific measurements or claims; any later evidence reuse requires a separate transferability review.

## Proposal source register

These proposal-local IDs are evidence references only and were not registered in the shared ledger.

| Source | Source and claim | Limit |
|---|---|---|
| **R932-S01** | OQLF, [Grand dictionnaire terminologique: arête de poisson](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19050602/arete-de-poisson), FAO terminology, 1972. Gives `arête de poisson` and English `fish-bone` in ichthyology. | Terminology support, not culinary use, preparation state, or measurement. |
| **R932-S02** | Metro Québec, [Fumet de poisson avec tête et arêtes de poisson](https://api.metro.ca/recettes-et-occasions/recettes/fumet-de-poisson-avec-tete-et-aretes-de-poisson) / [English rendering](https://api.metro.ca/en/recipes-occasions/recipes/fish-stock-with-fish-head-and-bones), recipe dated 2013-08-06. Uses rinsed fish head and bones for stock. | The `1 fish head and bones` amount belongs to this composite recipe and is not a standalone measurement for either part. The URL is already present on R906's fish-head ledger record for a separate head claim; this proposal does not alter that owner or transfer its record. |
| **R932-S03** | Fisheries and Oceans Canada, [Development of Seafood Products in Newfoundland](https://waves-vagues.dfo-mpo.gc.ca/Library/39104.pdf), Fish Stock recipe and definition on p. 6. Defines frames as the parts left after fillets are removed. | The report's frame definition and 125 lb / 50 gallon industrial batch stay source-scoped; they are not a fish-bones alias or household measure. |
| **R932-R01** | Repository audit of current plan, bundled references/forms, legacy import identities, research ledger, proposal/batch archive, picker implementation, manifest, and all manifest-listed recipes. | Confirms present ownership, picker projection, and bundled demand only. |

## Recommendation

Add identity-only `fish bones / arêtes de poisson` as the narrow generic fish-skeletal-part input used in cooking, with the singular aliases above. Keep `fish frames` separately bounded, and preserve fish heads, fish stock, all named fish identities, existing branded rows, and every product-scoped observation unchanged. Add no forms, reusable measurements, conversions, yields, recipe links, or substitutions. Section P remains open.
