# WP03 Section K — black elderflower identity review (R891)

**Status:** Proposal only at drafting. Root independently reviewed and integrated the identity on 2026-10-19; the original review and source limits remain unchanged.

**Reviewed:** 2026-10-19

**Plan anchor:** Section K's open [documented edible-flower checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6627). Keep the broader review open; do not add a generic `edible flowers` identity.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **black elderflowers / fleurs de sureau noir**, limited to the flower or inflorescence of *Sambucus nigra*. The OQLF defines `fleur de sureau` / `elderflower` as the flower or inflorescence of elder and documents culinary uses; its separate `sureau noir` entry identifies *S. nigra*. The Royal Horticultural Society explicitly names elderflower as *S. nigra* and documents its culinary use in wine, cordials, tarts, jellies, and fritters. A Québec recipe also uses `fleurs de sureau`, but does not identify the species; it supports local culinary wording only, not a link to this species-scoped identity.

This is one generic culinary plant-part identity. It adds no brand, product-line, flavour-family, SKU, or retailer-specific coverage.

## Proposed data

```json
{
  "id": "ingredient-ref-black-elderflowers",
  "nameEn": "black elderflowers",
  "nameFr": "fleurs de sureau noir",
  "aliasesEn": ["black elderflower", "elderflower"],
  "aliasesFr": ["fleur de sureau noir"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If integrated, add one `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Store the sources below and an accepted identity decision. Add no forms, measurement observations, recipe links, density, unit mappings, conversions, yields, or substitutions. Keep all amounts, methods, and preservation details in cited recipes scoped to those recipes.

## Name and transfer boundaries

| Term or evidence | Treatment | Boundary |
|---|---|---|
| `black elderflowers` | English display | Culinary flowers of *Sambucus nigra* only. RHS uses `elderflower` for this taxon; OQLF identifies the species name `sureau noir` / `black elder`. |
| `fleurs de sureau noir` | Québec French display | Descriptive, species-qualified compound built from OQLF's `fleur de sureau` and `sureau noir`; do not present the full compound as a separate OQLF ruling. |
| `black elderflower`, `elderflower` | English aliases | The first is the singular form of the qualified display. OQLF pairs generic `elderflower` with `fleur de sureau`; RHS explicitly applies `elderflower` to *S. nigra*. These source terms support this scoped flower identity, not berries or prepared products. |
| `fleur de sureau noir` | French alias | Singular form of the qualified display. |
| `fleur de sureau` / `fleurs de sureau` | Do not add as explicit aliases | OQLF defines this broader name at the *Sambucus* genus level, and the Québec recipe does not identify a species. The current phrase-based picker will still match this phrase within the qualified display; its result will visibly retain `noir`. Do not turn the broad query into a claim that flowers of every *Sambucus* species are culinary. |
| *Sambucus nigra* | Taxonomic scope only | Do not expose the botanical name as a user-facing alias or extend this identity to other *Sambucus* taxa. OQLF lists *S. canadensis* as a distinct Canadian species; the Québec recipe source does not identify which species it uses. |
| Elderberry / `baie de sureau` | Keep separate | It is the existing fruit identity. Do not move the flower evidence, recipe amount, preparation, or other plant-part evidence onto it, and do not transfer fruit measurements or use claims to flowers. |
| Elderflower syrup, cordial, wine, liqueur, jelly, and other preparations | Keep separate | Culinary sources describe these as outputs or uses. Their formulas, proportions, product labels, and storage claims do not become flower properties or forms. |
| Other edible flowers, non-flower plant parts, medicinal uses, or wild-plant identification | Exclude | Do not create a genus-wide edible-part claim, a generic flower row, or foraging guidance from this review. |

The Québec recipe's `10 ombelles de fleurs de sureau` and all accompanying syrup and lemonade quantities stay attached to that recipe. The page does not name a botanical species, and its quantities do not establish reusable flower counts, weights, conversions, forms, or yields.

## Sources

The source IDs below are proposal-local and were checked against the current ledger and archive. No shared ledger entries are allocated by this proposal.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-K-BLACK-ELDERFLOWERS-R891-20261019-S01` | Office québécois de la langue française, [GDT: *fleur de sureau*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544160/fleur-de-sureau), updated 2018; accessed 2026-10-19. | Gives preferred French `fleur de sureau` and English `elderflower`; defines the flower or inflorescence of elder and documents taste/odor uses including wines, syrups, and jellies. It is a genus-level term and does not establish that every elder species has culinary flowers. `sourceKind: regional_authority`. |
| `WP03-K-BLACK-ELDERFLOWERS-R891-20261019-S02` | Office québécois de la langue française, [GDT: *sureau noir*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19474900/sureau-noir), updated 2019; accessed 2026-10-19. | Identifies *Sambucus nigra* and gives the English plant names `black elder`, `common elder`, and `European elder` variants. It is botanical naming evidence, not flower-specific culinary evidence. `sourceKind: regional_authority`. |
| `WP03-K-BLACK-ELDERFLOWERS-R891-20261019-S03` | Royal Horticultural Society, [Edible flowers: growing and using](https://www.rhs.org.uk/herbs/edible-flowers), accessed 2026-10-19. | Names `Elderflower (*Sambucus nigra*)`; documents use in wine, cordials, to flavour tarts and jellies, and battered/deep-fried. Supports culinary use of the named species and flower part only. It does not support *S. canadensis*, all *Sambucus* species, amounts, conversions, or a Québec retail-availability claim. `sourceKind: other`. |
| `WP03-K-BLACK-ELDERFLOWERS-R891-20261019-S04` | Défi je mange local, [Limonade aux fleurs de sureau](https://defijemangelocal.ca/limonade-aux-fleurs-de-sureau/), Centre-du-Québec recipe by Lysanne O’Bomsawin; accessed 2026-10-19. | Uses the Québec French phrase `fleurs de sureau`, then instructs removing stems so only flowers remain. Its `10 umbelles` and all other quantities, preparation, storage, and yield are recipe-specific. The recipe does not name a species, so it is not linked to the *S. nigra* candidate. `sourceKind: culinary_reference`. |

No manufacturer, branded-product, SKU, or retailer-variant source was used. No product measurement or claim is generalized to the ingredient category.

## Ownership, recipe demand, and picker projection

**Current ownership.** At review time, the bundled files contained 1,918 ingredient references and 201 forms; the research ledger contained 2,322 records, and the manifest listed 114 recipes with 1,123 ingredient rows. Exact active-name, alias, ID, form, legacy-candidate, ledger-record, proposal, and batch searches found no owner for `elderflower`, `black elderflower`, `fleur de sureau noir`, or `ingredient-ref-black-elderflowers`. The existing `ingredient-ref-elderberry` (`elderberry / baie de sureau`) remains a fruit identity, with no flower form. Its ledger record cites OQLF's separate `baie de sureau` entry and explicitly does not activate bare `sureau`; preserve that record and its evidence. The OQLF URLs proposed above and the R891 source-ID prefix had no existing ledger owner.

**Bundled recipe demand.** Parsed every manifest-listed recipe and ingredient row. Exact normalized phrase scans for `elderflower(s)`, `black elderflower(s)`, `fleur(s) de sureau`, `fleur(s) de sureau noir`, and *Sambucus nigra* found zero recipe-file hits and zero ingredient-row hits. This describes the current bundle only. The outside Québec recipe cited above is culinary-name evidence but is not a species-specific recipe link.

**Picker projection.** Simulated the existing phrase-first and substring-fallback matching in `IngredientSearch.kt` against active reference and form labels, aliases, then the proposed row. The proposed aliases are singular forms of the qualified labels; the broad `elderflower` match also follows the exact OQLF/RHS term evidence.

| Query | Current result | With proposal |
|---|---|---|
| `elderflower`; `black elderflower` | No result | `ingredient-ref-black-elderflowers` |
| `fleur de sureau`; `fleurs de sureau`; `fleur de sureau noir` | No result | `ingredient-ref-black-elderflowers` (display remains species-qualified as `fleurs de sureau noir`) |
| `elderberry` | `ingredient-ref-elderberry` | Unchanged |
| `elder`; `sureau` | `ingredient-ref-elderberry` | `ingredient-ref-elderberry` and `ingredient-ref-black-elderflowers`, distinguished by fruit versus flower in their displays |

The open parent task is generic edible-flower diversity, not a commercial-product roster. No brand-only queued work was encountered in this bounded review.

## Audit and unresolved limits

- Exact ownership checks covered bundled references and forms, legacy candidates, ledger records/source IDs, proposal files, batch records, and the full manifest-listed recipe corpus. The proposed ID, proposal path, and R891 source-ID prefix were unassigned.
- The French display is a descriptive compound; only its base terms are individually standardized by OQLF. Keep the OQLF genus-level `fleur de sureau` source boundary visible in review.
- The Québec recipe establishes local French use but does not identify the species. Do not attach it to *S. nigra* or copy its amounts, procedure, recipe yield, or storage advice into catalog behavior.
- No botanical identification guarantee, medicinal claim, species-wide safety statement, or cross-species culinary inference is proposed.
- Root integration added only database JSON plus the corresponding plan and research documentation. No software tests, build, emulator run, or deployment were performed under the JSON-only exception in `AGENTS.md`.
