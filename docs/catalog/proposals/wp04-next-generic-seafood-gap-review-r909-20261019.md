# WP04 Section P — freshwater crayfish tails identity review (R909)

- **Review and source-access date:** 2026-10-19.
- **Packet type:** proposal-only review of a generic edible cut left unresolved by the existing freshwater-crayfish identity.
- **Recommendation:** Add a separate identity-only `freshwater crayfish tails / queues d’écrevisses d’eau douce` reference, in `PROTEIN`, with singular scoped aliases. Add no forms, measures, conversions, yields, recipe links, or substitutions.
- **Status:** Proposal only. No catalog JSON, ledger, generated code, plan, roadmap, workflow, scope log, or recipe was changed. Root owns any integration.
- **Scope:** The anatomical tail portion of edible freshwater crayfish as a generic culinary ingredient. Species, shelling, cooking, and preservation states remain unresolved.

## Open checklist item and reason for this gap

The exact open plan parent is **“Shrimp/prawn by meaningful preparation; crab and crayfish”** at [Section P line 8220](../../RecipeBook-global-ingredient-catalog-plan.txt#L8220). Its crayfish portion remains open after the generic whole-animal identity was integrated in R501. R501 explicitly left live, cooked, frozen, whole-animal, tail, and picked-meat states unresolved; this review advances only the tail cut.

The gap is a generic anatomical food part, not a brand, product-line, flavour, SKU, or retailer-variant roster. It is distinct from whole freshwater crayfish and from crab claws, crab legs, and picked crab meat. The current active catalogue contains the whole-animal reference `ingredient-ref-crayfish`, but no crayfish-tail reference or form.

The 2026-10-19 cross-category scope review recorded in the plan already puts the two Section F cereal-roster clauses and further Anson Mills named-wheat-meal research out of scope because commercial-product counts do not add ingredient diversity. This proposal does not reopen those assignments or remove any existing branded rows or their product-specific evidence.

## Live ownership and picker projection

Snapshot read from the bundled seed package: 1,934 active references, 201 forms, and 114 manifest-listed recipes. The sole matching active reference is `ingredient-ref-crayfish` (`freshwater crayfish / écrevisse d’eau douce`), with empty alias arrays and no default density or unit mappings. No active reference alias or form owns crayfish-tail wording. The existing reference remains unchanged.

`IngredientSearch.kt` normalizes case and accents and prefers complete word phrases across a display name or alias. A static projection against the live references and forms gives these results:

| Query | Current result | With proposed row | Effect |
|---|---|---|---|
| `crayfish` / `écrevisse` | Whole freshwater crayfish | Whole crayfish and crayfish tails | Makes the whole-animal versus tail choice explicit. |
| `freshwater crayfish` / `écrevisse d’eau douce` | Whole freshwater crayfish | Whole crayfish and crayfish tails | Remains a two-result category query. |
| `crayfish tail` / `crayfish tails` | None | Crayfish tails only | Adds direct English cut lookup. |
| `queue d’écrevisse` / `queues d’écrevisses d’eau douce` | None | Crayfish tails only | Adds direct Québec French cut lookup. |
| `crawfish` | None | None | Preserves R501’s decision to keep this colliding English term out of global aliases. |

The proposed singular aliases retain the freshwater qualifier: `freshwater crayfish tail` and `queue d’écrevisse d’eau douce`. The names allow the unqualified search phrases `crayfish tail` and `queue d’écrevisse` as contiguous phrase matches while showing the freshwater scope in the result. Do not add `crawfish`, `crawdad`, `langouste`, or `spiny lobster` aliases.

## Recipe demand

All 114 recipe paths listed by `manifest.v1.json` contain 1,123 ingredient rows. A case-insensitive scan of every listed recipe’s decoded text and ingredient data found **zero** occurrences of `crayfish`, `crawfish`, `crawdad`/`crawdads`, `écrevisse`/`ecrevisse`, or the corresponding crayfish-tail phrases. There is no recipe link or bundled recipe measure to attach. This proposal therefore treats the tail as a generic coverage gap, not as a recipe-demand finding.

## Proposed identity and picker behavior

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-crayfish-tail` |
| Category | `PROTEIN` |
| English display | `freshwater crayfish tails` |
| Québec French display | `queues d’écrevisses d’eau douce` |
| English aliases | `freshwater crayfish tail` |
| French aliases | `queue d’écrevisse d’eau douce` |
| Density and unit mappings | None |
| Forms | None |
| Scope | Anatomical tail portion of edible freshwater crayfish; no species or other preparation state selected. |
| Exclusions | Whole-animal crayfish, picked meat without a tail claim, langouste/spiny lobster, lobster tails, crab, shrimp/prawn, and branded or prepared seafood products. |

The ID is not present in active references, forms, the research ledger, or the proposal archive. The proposed row is separate from `ingredient-ref-crayfish`; it is not a replacement, alias, or form of the whole-animal reference. Preserve the existing crayfish, crab, and lobster identities and all their evidence.

## Source claims and limits

The Metro English and French consumer guides say that the tail is the edible part generally kept from crayfish because the claws contain too little meat. They support considering the tail as its own generic culinary cut. They do not identify a species, define a peeled or shell-on recipe state, or provide a reusable measure. OQLF’s fisheries terminology defines a crustacean’s tail as its abdominal portion, often still in its shell, and explicitly includes écrevisse among the species covered. This supports the anatomical boundary and the Québec French term; it does not establish a yield or make shelling state uniform.

| Proposal-local source ID | Source and reviewed claim | Limits and ownership |
|---|---|---|
| `WP04-SECTIONP-CRAYFISH-TAIL-IDENTITY-R909-20261019-S01` | Metro, [Crayfish](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/crayfish). English consumer guide: only the tail is kept because claws do not contain enough meat. | General consumer guidance, not a named species, specific product listing, tail-shelling specification, or quantity. This URL is already recorded on the R501 whole-crayfish ledger entry for its whole-animal identity claim; this new proposal-local locator records a separately reviewed tail claim and does not change that entry. The search index returned the guide text; direct page opening returned 403. |
| `WP04-SECTIONP-CRAYFISH-TAIL-IDENTITY-R909-20261019-S02` | Metro Québec, [Tout sur les écrevisses](https://api.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/ecrevisses). French consumer guide: “On ne consomme que la queue de l’écrevisse, ses pinces ne contenant pas assez de chair.” | Confirms the corresponding French usage and generic cooking guidance; no species, shelling state, or measure. The URL is already recorded on the R501 whole-crayfish ledger entry. This is a new locator for the directly reviewed tail claim, not a transfer or rewrite of the existing source entry. The search index returned the guide text; direct page opening returned 403. |
| `WP04-SECTIONP-CRAYFISH-TAIL-IDENTITY-R909-20261019-S03` | OQLF, [queue (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199076/queue). Fisheries-product terminology: `queue / tail` is a marketable anatomical part; covered species include écrevisse; a crustacean tail is the abdominal part, often still in its carapace. | Terminology standard last updated in 1998. It defines the anatomical and bilingual term boundary, not a culinary yield, measure, recipe state, or current product offering. Search-index text was available; direct page opening returned a cache miss. |
| Existing `WP04-MOLLUSKS-20261009-S04` | OQLF, [écrevisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363436/ecrevisse), already owned by `ingredient-ref-crayfish`. | Retain its current freshwater and crayfish/crawfish collision finding on the existing record. This proposal does not reassign or broaden that evidence. |

The new R909 IDs were checked against the current ledger and proposal/batch archive. Metro’s existing R501 entries and the current whole-crayfish source record remain untouched. The earlier La Mer count of 14–16 live animals per pound and Costco’s 10–15 whole cooked crawfish per pound are source- and product-specific; neither is transferable to tails. Do not merge those counts into this identity or use them to infer an edible yield.

## Measurement, form, and substitution recommendation

- **Identity:** Add only the generic anatomical tail identity for freshwater crayfish. The Metro guides describe it as the portion generally eaten; OQLF gives its anatomical boundary. Do not equate it with the whole animal or with independently picked tail meat.
- **Measurement:** Add no piece count, mass, volume, density, unit mapping, package quantity, edible yield, or cooking yield. None of the reviewed generic sources provides a supported tail measure. Whole-animal counts and Metro’s whole-animal storage guidance remain scoped to their stated subjects.
- **Forms and conversions:** Add no raw, cooked, peeled, shell-on, fresh, or frozen form. The generic sources leave these states open; OQLF notes that a crustacean tail is often still in its carapace. Add no form conversion or unit conversion.
- **Substitutions:** Add no global or contextual substitutions between crayfish tails, whole crayfish, lobster, crab, shrimp/prawn, or other seafood. No reviewed source establishes a role-, method-, or dish-scoped replacement rule, and the recipe bundle has no such context.
- **Recipe linking:** Add no recipe link or line-level substitution because the bundled corpus has no matching request.

This review adds one generic cut identity to the unfinished Section P checklist parent while preserving existing species identities, forms, product-scoped evidence, and unresolved preparation boundaries.
