# WP04 Section P generic fish-skin identity review — R981 — 2026-10-19

## Recommendation

Propose one identity-only generic culinary part, **fish skin / peau de poisson**, in `PROTEIN`. Treat this as skin used as food when supported for the fish in question. The identity must not imply that skin from every fish species is edible, safe to eat, or legally sourced. Keep species, processing, and preparation unspecified.

This is a distinct generic part from fish fillets with or without skin, fish heads, bones, frames, trimmings, and stock. The Québec French display is descriptive; the reviewed sources support the noun `peau` in fish preparation but do not establish `peau de poisson` as an official standardized term.

## Plan fit and ownership

WP04 is owned by the protein and dairy catalog agent. Section P remains open under the [seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7306) and broader [fish-powder, fish-ball, surimi, and regional-seafood follow-up](../../RecipeBook-global-ingredient-catalog-plan.txt#L16417); WP04's acceptance criteria retain useful differences in cuts and edible portions. The plan does not currently name fish skin as a checklist item; this proposal selects it as one remaining generic seafood-part gap within that open scope. The work is limited to ingredient diversity. No product, brand, product line, flavour, SKU, or retailer-variant roster was researched. No roster-only Section P assignment was found in the open-plan scan. The global scope review keeps commercial-only Section F cereal-roster clauses out of scope because commercial-product counts do not add ingredient diversity; this review does not reopen or research those clauses. See the [cross-category scope review](../batches/generic-ingredient-scope-review-20261019/README.md).

The closest active generic parts are `ingredient-ref-fish-heads`, `ingredient-ref-fish-bones`, `ingredient-ref-fish-frames`, and `ingredient-ref-fish-trimmings`. Each has its own active reference and ledger ownership. Fish skin is absent as a standalone identity from active references, forms, legacy candidates, and the research ledger. No aliases, measurements, or source observations are being copied from those neighboring entries.

The only directly related active reference is `ingredient-ref-salmon-fillets-without-skin`. Its R268 ledger record and recipe 077 document a **675 g skinless salmon-fillet** line. That is a salmon-fillets recipe quantity and state; neither the mass nor its source evidence transfers to generic fish skin. Preserve that reference, its R268 evidence, and every existing branded entry unchanged.

## Read-only catalog and recipe audit

The audited package contains 1,998 ingredient references, 205 forms, 2,403 ledger records, 55 legacy candidates, and 114 manifest-listed recipes. Searches across the full reference, form, ledger, and legacy-candidate files found no generic fish-skin owner. Fish whole-fish and steak forms remain attached to species-specific fish identities; none represents separated skin.

The recipe audit found one adjacent skin-state use: recipe `077#10` says “675 g salmon fillets without skin, cut into cubes” and links to `ingredient-ref-salmon-fillets-without-skin`. The 114-recipe corpus has no standalone fish-skin ingredient line, so this proposal adds no recipe link and does not convert the skinless-fillet line into demand for skin.

The proposal-local source IDs below were checked against the current research ledger; no existing ledger record owns these exact source URLs. They are proposal identifiers only. The sources establish the limited identity and culinary context described here, not a transferable amount or commercial specification.

## Evidence and source limits

| Proposal-local source ID | Source and locator | Claim supported and limits |
|---|---|---|
| `WP04-SECTIONP-FISH-SKIN-R981-20261019-S01` | Health Canada, [Un guide simple pour sélectionner le poisson](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/competences-culinaires/guide-simple-selectionner-poisson.html), “Différentes coupes de poisson” and “Conseils pour la cuisson”; page dated 2026-03-31, accessed 2026-10-19. | Names fillets with or without skin and steaks containing skin; for grilling or high heat it recommends skin-side-down cooking and says the skin can be removed after cooking. Supports French fish-preparation wording and culinary relevance. It does not establish standalone skin as an ingredient, a species-independent edibility rule, or a measure. |
| `WP04-SECTIONP-FISH-SKIN-R981-20261019-S02` | NOAA Fisheries, [Sockeye Salmon Recipes](https://www.fisheries.noaa.gov/insight/sockeye-salmon-recipes), “Salmon with Spiced Broccoli, Currants, and Pecan Sauce”; accessed 2026-10-19. | The recipe uses skin-on salmon fillets and cooks skin-side-down until crisp before serving. This is salmon-specific attached-skin use; the eight-fillet recipe quantity is not a skin amount or reusable measure. |
| `WP04-SECTIONP-FISH-SKIN-R981-20261019-S03` | FAO, [Management Techniques for Elasmobranch Fisheries](https://www.fao.org/4/a0212e/a0212e18.htm), section 14.2.3 “Skin,” “Skin as food”; accessed 2026-10-19. | Reports food use of shark skin in named regions and describes particular species and preparations, including processed skin dishes and soups. This supports a detached fish-skin culinary part only within the reported contexts. It is not evidence that all fish skins are edible, a current Canadian-market survey, a Québec name standard, or legal-sourcing guidance. |
| `WP04-SECTIONP-FISH-SKIN-R981-20261019-S04` | Office québécois de la langue française, [dépouiller (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887309/depouiller), food-processing definition; last updated 1983, accessed 2026-10-19. | Defines removing a fish's skin before or after cooking and pairs the French verb with English `skin`. Supports the French anatomical noun `peau` in this context, not a standardized ingredient name or edible-skin claim. |
| `WP04-SECTIONP-FISH-SKIN-R981-20261019-R01` | Read-only audit of the WP04 Section P plan, references, forms, legacy candidates, research ledger, package manifest, all 114 manifest-listed recipes, and adjacent fish-part proposals. | Local ownership and demand audit only. No shared JSON, ledger, plan, recipe, generated file, or test was changed. |

## Exact proposed minimal state

If accepted for integration, add only this new reference:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-fish-skin` |
| `nameEn` | `fish skin` |
| `nameFr` | `peau de poisson` — descriptive display, not claimed as standardized |
| `aliasesEn`, `aliasesFr` | `[]`, `[]` |
| `category` | `PROTEIN` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms | None |
| Recipe links | None |
| Conversions, yields, substitutions | None |

For a later ledger integration, use the four proposal-local evidence sources above and keep `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Do not create an active measurement or substitution from the reviewed recipe quantities or process descriptions. This proposal creates no shared ledger record.

## Unsupported bounds

- Do not imply universal edibility, safety, or legal availability for fish skin. FAO's detached-skin food examples are limited to specific elasmobranchs, places, and preparations; Health Canada and NOAA address skin attached to selected fish cuts.
- Do not add aliases such as `shark skin`, `salmon skin`, `fish lips`, or processed-food names. The evidence does not make these terms interchangeable with a general Québec recipe identity.
- Do not generalize the NOAA salmon-fillets quantity, Health Canada's cooking guidance, or FAO's species- and preparation-specific details into mass, yield, density, a cooking method, or a form.
- Do not add a skinning by-product, leather, gelatin, broth, dried, salted, smoked, or cooked form. Those are separate material or process claims outside this identity-only proposal.
- No branded evidence or product-specific measurement was transferred. No catalog data, ledger, plan, roadmap, recipe, generated code, or test was edited, and no test or build was run.
