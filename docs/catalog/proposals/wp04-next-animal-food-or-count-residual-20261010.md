# WP04 Proposal: Tuna-Steak Count and Portion Evidence

**Review date:** 2026-10-10
**Status:** Portion evidence integrated on 2026-10-10 into the sidecar research ledger using the source-preserving interval contract. Schema, validator, tests, and Pixel verification are recorded in [`catalog-residual-boundaries-integration-20261010`](../batches/catalog-residual-boundaries-integration-20261010/README.md). No recipe or active runtime mapping was added.
**Scope:** The next unclosed animal-food count/portion line after the prior WP04 audits, excluding their pork-rack, pork-shoulder, and chicken-breast work and the already-reviewed egg, pepper, herb, cherry, and CNF retrieval work.

## Disposition

The exact recipe source's per-steak weight range is now a source-qualified observation for recipe `111#1`. It remains evidence only: no scalar count weight, runtime conversion, tuna form, new tuna identity, or recipe edit was added.

The bundled line is `1 tuna steak` (`ingredient-ref-tuna`, quantity `1`, unit `count`). Its linked Anova recipe page is currently accessible and lists two tuna steaks for four servings, each about 1½–2 inches thick and 10–12 oz / 280–320 g. The page gives the weight per steak, so its recipe serving count does not need to be scaled to derive a per-piece value. The bundle contains one steak for two servings from this same source. The exact source's range is relevant to this line; it is not a universal weight for tuna steaks.

The in-v1 ledger schema now preserves interval endpoints and their qualifiers. The accepted ledger observation keeps both printed ranges separate; it does not choose a midpoint or endpoint, treat either unit as a conversion, or support a default count-to-mass rule.

## Current corpus and catalog match

The current bundled manifest lists **114 recipe files and 1,123 ingredient rows**. A fresh scan of the recipe rows found one tuna hit:

| Exact line | Current source data | Current catalog link | Disposition |
| --- | --- | --- | --- |
| `111#1` — Sous Vide Tuna; `b699f193-4545-4e7a-98ad-ce092a1e38e4-ingredient-1` | `1 tuna steak`; `quantity: 1`; `unit: count`; source URL `https://recipes.anovaculinary.com/recipe/sous-vide-tuna` | `ingredient-ref-tuna` | Retain the count and existing link. Attach the source-specific range only as recipe evidence; do not change the ingredient row or imply a species-specific product. |

The active `ingredient-ref-tuna` reference remains `tuna / thon`, with no aliases, null `defaultDensity`, and no unit mappings. No separate tuna-steak form is present. Its ledger record keeps `identityState: unreviewed` and `substitutionResearchState: not_yet_researched`; its measurement state is now `researched_supported`, with the Anova source, accepted decision, and preserved interval observation recorded.

The prior WP04 residual animal-food audit identified `111#1` as an unweighted fish piece but did not have a source mass for it. No earlier WP04 proposal found at review time handled its portion. The Anova source supplied direct, recipe-specific portion evidence.

## Species, product, and state boundaries

- **Species:** The page says tuna but does not name a tuna species. Keep `ingredient-ref-tuna` broad; do not infer albacore, skipjack, yellowfin, bigeye, or another species.
- **Product/cut:** The evidence concerns a tuna steak of the stated thickness in this recipe. It does not establish a general steak form, a specific anatomical cut, or a catalog alias for every tuna steak.
- **Preparation state:** The page places the steak in its ingredient list before sous-vide cooking and searing. This supports a pre-cook recipe-ingredient-stage weight. The page does not state whether the listed weight includes skin or bone, reflects trimming, or represents edible portion versus purchase weight.
- **Other products:** Do not transfer the observation to tuna fillet, canned tuna, smoked or dried tuna, cured products, another fish species, or cooked yield.

## Separate evidence status

| Evidence dimension | Status | Supported conclusion and limit |
| --- | --- | --- |
| **Portion / count** | **Source-supported, ledger evidence** | The direct recipe page specifies a per-steak interval with the thickness qualifier. The ledger preserves `10–12 oz` and `280–320 g` independently, with unknown endpoint semantics. Do not pick a single value or multiply this range into a generic conversion. |
| **Composition** | **Unavailable** | The recipe page gives no species, fat/moisture/protein composition, skin/bone status, or edible fraction. No composition value is proposed. |
| **Conversions** | **Unavailable** | No density, mass-volume relation, count-to-scalar-mass mapping, cooked yield, or edible-portion yield is supported. Preserve `1 count` in the recipe. The two source-stated unit intervals are not normalized into a unit-conversion factor. |
| **Substitutions** | **Not researched** | No species or product substitution was reviewed or supported. Leave the tuna ledger substitution state unchanged; do not infer tuna-to-other-fish or steak-to-fillet equivalence. |

## Source register

| ID | Source | Evidence and limits |
| --- | --- | --- |
| **WP04-TUNA-COUNT-20261010-S01** | Anova Culinary, [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna), attributed on-page to J. Kenji López-Alt; ingredient list, “Ingredients for 4.” | Direct source for the bundled recipe. Lists two tuna steaks, each about 1½–2 inches thick and 10–12 oz / 280–320 g. This supports the source-specific per-steak interval and thickness only. It does not identify species, edible/as-purchased basis, trim, skin/bone state, composition, a universal tuna-steak portion, or a conversion. Accessed 2026-10-10. |

## Search and source check

Re-read the current manifest-listed recipe rows, the active tuna reference and forms, the `ingredient-ref-tuna` ledger record, the WP04 plan's open count/edible-portion fixture item, and the prior WP04 animal-food and count/portion proposals. Opened the direct Anova source page. The source is accessible; no inaccessible source or CNF retrieval was needed for this line.
