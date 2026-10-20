# WP04 Section P — Québec live-crayfish product and picker reassessment

- **Review date:** 2026-10-12.
- **Scope:** Reassess the open crayfish/crawfish candidate using a current Québec live-product listing and the current active picker index. This is a focused follow-up to the broader [crayfish / crawfish / écrevisse boundary review](wp04-section-p-crayfish-crawfish-ecrevisse-boundary-review-20261012.md), not a duplicate of its full source survey.
- **Disposition:** **Hold** the existing `ingredient-ref-crayfish` ledger candidate in `needs_clarification`. The Québec product listing confirms local use of the name and a live retail product, but gives no species; its product-specific count does not generalize, and the recipe corpus still has no request to resolve the intended identity.
- **Root disposition:** Confirmed hold; no active row, alias, recipe link, or numeric data was added. See the [focused reassessment record](../batches/wp04-section-p-crayfish-live-product-picker-reassessment-20261012/README.md).

## New evidence and recommendation

Montréal fishmonger La Mer lists **Live Crayfish - 1lb** and describes it as “Live Quebec Crayfish,” a “Local product.” Its product image alt text is **Écrevisse vivante - 1lb**. The page was marked out of season and sold out when accessed. This is direct Québec consumer-market evidence for the ordinary English/French product wording and a live presentation. It does not identify a scientific species or establish that all retail products called `crayfish` or `crawfish` share one scope.

Keep the generic candidate unresolved. OQLF prefers `écrevisse` for a small freshwater crustacean and lists `crayfish` and `crawfish` as English terms, while noting colloquial use of both English terms for langouste. The current CFIA Fish List is species-specific and demonstrates the naming boundary: it uses `Cambarus` with `crawfish / écrevisse`, `Procambarus clarkii` with `crayfish` and `crawfish / écrevisse`, and `Cervimunida johni` with `crawfish / langouste` and also `crayfish` without a French equivalent. La Mer's local seller wording does not select among the listed taxa or settle an unqualified recipe term.

The source-backed product is a real narrow retail item, but its identity and recipe meaning are still uncertain. Do not promote the generic candidate, add aliases, or create a product-state form until a bundled recipe or requested product establishes whether it means a freshwater crayfish ingredient, a particular species, or a specific live/whole/tail/meat product. Keep American lobster, langoustine/scampi, langouste, crab, shrimp, and prepared seafood separate.

## Exact ownership audit

| Surface | Current owner or result |
|---|---|
| Active ingredient references | 1,245 current references; none has a name or alias containing `crayfish`, `crawfish`, `crawdad`, or `écrevisse`. |
| Active forms | 94 forms; none has a label or match term for those words. |
| Legacy import identities | 66 candidates; no crayfish-family name or alias was found. |
| Research ledger | `ingredient-ref-crayfish` is the sole family record, a candidate with identity `needs_clarification`, measurement `not_yet_researched`, and substitution `not_yet_researched`. It is not an active picker owner. |
| Nearby distinct identities | `ingredient-ref-lobster` is `American lobster / homard d’Amérique`, with `lobster` and `homard` aliases. `ingredient-ref-langoustine` is `scampi / langoustine`, with French plural `langoustines`. Neither owns crayfish-family terms. |

The exact-term audit used the current names and aliases, form labels and match terms, and legacy candidate names and aliases. The accent-insensitive key for `écrevisse` is `ecrevisse`; it has no active or legacy owner.

## Picker behavior

The recipe picker builds `IngredientReferenceSearchIndex` from active `ingredientReferences` and `ingredientForms` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) and [RecipeEditorScreen.kt](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt). The ledger candidate and legacy import candidates are not passed into that index. Search normalizes accents and punctuation before complete-phrase and partial matching.

A static query audit against the current active names, aliases, form labels, and form match terms returned no item for `crayfish`, `crawfish`, `crawdads`, `écrevisse`, `ecrevisse`, or `freshwater crayfish`. `lobster` and `homard` return the American-lobster row; `langoustine` returns the separate scampi/langoustine row. Adding `crayfish` or `crawfish` as a bare alias would create one picker result for the phrase even though the source records show species and langouste overlap. This is a catalog/code audit, not emulator or visual picker verification.

## Recipe demand

The current manifest-listed package has 114 recipe files and 1,123 ingredient rows. A case-insensitive scan of every recipe JSON string found zero occurrences of `crayfish`, `crawfish`, `crawdad`, or `écrevisse` and plural variants. Recipe 019's `jumbo lump crab meat` is explicitly linked to the crab reference; the optional “cooked meat or seafood, to taste” wording in recipe 093 does not select crayfish, a species, or a preparation state. No recipe link or catalog allocation follows from this review.

## Numeric and substitution limits

La Mer's one-pound listing says that its live Quebec crayfish are sold at **14–16 per pound**. This is a seller-specific count band for that local live listing, not a generic per-pound relationship for crayfish. The page gives no edible-meat yield, shelling yield, cooked yield, density, household volume measure, or recipe portion. It was out of season and sold out when checked. The seller's casserole, crayfish-bake, and chowder suggestions are use examples, not recipe measures or substitution evidence.

Add no count-to-mass or mass-to-volume mapping, density, package yield, recipe amount, conversion, or substitution. No evidence supports replacing crayfish with lobster, langoustine, langouste, crab, shrimp/prawn, or surimi, or converting live whole animals to tail/meat quantities.

## Source register

New source IDs use `WP04-CRAYFISH-LIVE-PICKER-20261012`; they were checked against the current research ledger, all proposal and batch documents, the active catalog, and legacy identity data before assignment. The OQLF and CFIA references from the earlier boundary review are reused under their original IDs.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-CRAYFISH-LIVE-PICKER-20261012-S01** | Poissonnerie La Mer, [Live Crayfish - 1lb](https://www.lamer.ca/en/products/ecrevisse-vivante) | Québec seller lists the English title, French image alt text `Écrevisse vivante - 1lb`, and describes a local Quebec product at 14–16 per pound. The page showed out of season/sold out. It gives no scientific species or general count/yield conversion. |
| **WP04-CRAYFISH-LIVE-PICKER-20261012-S02** | Gouvernement du Québec, [Écrevisse de Louisiane](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/ecrevisse-louisiane) | Current wildlife profile identifies *Procambarus clarkii* as `écrevisse de Louisiane`, notes its use as food in the United States, and states that it is absent from Québec; last updated 2026-07-30. Species boundary evidence only; it does not identify La Mer's product. |
| **WP04-CRAYFISH-20261012-S01** *(reused)* | OQLF, [écrevisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363436/ecrevisse) | Preferred Québec French term and freshwater definition; English `crayfish` and `crawfish`; records their colloquial overlap with langouste. Last updated 2011. |
| **WP04-CRAYFISH-20261012-S02** *(reused)* | CFIA, [Fish List lookup](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Rechecked current species rows for `Astacopsis franklinii`, `Cambarus`, *Procambarus clarkii*, and *Cervimunida johni*. Names include freshwater-crayfish entries and species-specific crayfish/crawfish labels that overlap with `langouste`; does not resolve the La Mer species or an unqualified recipe request. |
| **WP04-CRAYFISH-20261012-S03** *(reused)* | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says the Fish List provides species-specific English and French common names and that only listed names should be used for those species. Regulatory naming guidance, not a culinary identity or recipe measure. |

## Next open work

Keep the generic candidate held. Reopen it when a recipe or exact requested package resolves its scope. A source that names a specific species or supplies a species-linked label can support a narrower identity; a product-state request should retain its exact `live`, frozen, whole, tail, or meat wording. Continue to keep biological species claims separate from vendor-specific package quantities and culinary yield or substitution claims.
