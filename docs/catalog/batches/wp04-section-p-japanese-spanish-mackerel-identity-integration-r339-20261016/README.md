# WP04 Section P R339 — Japanese Spanish mackerel identity integration

Reviewed and integrated on 2026-10-16. Added one identity-only PROTEIN reference:

- `ingredient-ref-japanese-spanish-mackerel`: `Japanese Spanish mackerel / thazard oriental` for *Scomberomorus niphonius*.
- English alias: `sawara`.
- French aliases: none.

CFIA supplies the Canadian species-qualified English/French name pair. ITIS verifies *S. niphonius* and records both Japanese Spanish mackerel and thazard oriental; Japan MEXT independently identifies its raw food entry as this species. A Vancouver seafood seller pairs `Sawara` with `Japanese Spanish mackerel`, supporting that single English alias. OQLF assigns nearby unqualified `thazard`, `thazard tacheté`, and `maquereau espagnol` terms to other species; those remain outside the alias set. CFIA also lists Japanese seerfish without a French name and uses Australian Seerfish for another taxon, so that alternate English term remains unallocated.

Before R339, the catalog had 1,685 references, 129 forms, 57 legacy candidates, and 2,032 ledger records. The proposed ID, species, common names, and alias had no current owner. The manifest scan found no matching term across 114 recipes / 1,123 ingredient rows. No recipe link was added.

## Phrase-first picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Exact species-qualified phrases resolve to the new row, while broad searches retain the other species-qualified results:

| Query | Before R339 | After R339 |
|---|---|---|
| `Japanese Spanish mackerel`, `thazard oriental`, `sawara` | No result | New Japanese Spanish mackerel row |
| `Spanish mackerel` | Two rows | Three rows |
| `mackerel` | Eight rows | Nine rows |
| `thazard` | Two rows | Three rows |
| `maquereau` | Seven rows | Same seven rows |
| `maquereau espagnol`, `seerfish`, `Japanese seerfish` | No result | No result |
| `narrow-barred Spanish mackerel`, `spotted Spanish mackerel` | Their respective rows | Unchanged |

The ledger record is `identityState: verified`; measurement and substitution research remain `not_yet_researched`. No forms, measures, mappings, density, conversions, yields, recipe links, or substitutions were added. MEXT's food composition data and seller cooking tips are not used as recipe quantities or safety guidance.

The [proposal](../../proposals/wp04-section-p-japanese-spanish-mackerel-identity-review-r339-20261016.md) records all source boundaries and the full name-family projection. Static package, reference-normalization, generated-index, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. The combined catalog contains 1,686 references, 129 forms, 57 legacy candidates, and 2,033 ledger records. No software tests, builds, emulator checks, or deployment were run because this change adds database JSON data and its generated catalog projection under `AGENTS.md`.
