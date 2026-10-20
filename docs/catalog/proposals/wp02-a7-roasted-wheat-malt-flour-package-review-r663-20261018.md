# WP02 Section A7 R663: roasted-wheat-malt-flour measurement-scope review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted documentation-only hold; no catalog or ledger data changed.
- **Plan anchor:** The open [WP02 Section A7 checklist item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094) continues research on other grain meals and malted/toasted flour products.
- **Scope:** Determine whether current IREKS package and dosage values can be added to the existing `ingredient-ref-roasted-wheat-malt-flour` ledger row. R659, R660, and R662 reviewed other flour identities. R58 resolved the adjacent naming boundary; this review applies that boundary to a distinct numeric-ledger question and does not reopen R58’s identity decision.

## Recommendation

**Hold the IREKS numeric data outside the active ledger row.** The current IREKS page gives a 25 kg package and a 1–5% flour-basis bakery dosage for its named **IREKS AROMA WHEAT MALT K** product, described as slightly roasted wheat malt flour. The active ledger row represents the separately declared, unqualified `roasted wheat malt flour` ingredient, whose grade and treatment sequence are unspecified. R58 found that manufacturer sources do not establish equivalence across the active declaration, IREKS’s slightly roasted product, and other toasted or roasted wheat-malt products. Attaching IREKS values to the active row would imply a product match that the accepted boundary review does not support.

The exact proposal is **no data delta**:

- Keep `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`.
- Add no IREKS source, package observation, dose observation, candidate, or new identity to the ledger.
- Keep the active catalog, forms, package-yield data, picker, and recipes unchanged.

Although the ledger schema can represent a product-specific package observation, schema support does not resolve whether this named product belongs to the active generic identity. If a future identity review establishes that scope, a separate product-specific review can reassess the 25 kg package. The 1–5% commercial dosage remains source evidence and is not a household dose, recipe-line quantity, density, conversion, or substitution ratio.

## Source evidence and limits

IREKS North America’s current [IREKS AROMA WHEAT MALT K product page](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-wheat-malt-k), reopened on 2026-10-18, describes that product as slightly roasted wheat malt flour. Its product-information fields list a **25 kg paper bag** and a **1–5% dosage based on flour**. This is evidence for the IREKS product, not for every item called roasted wheat malt flour.

The active identity’s existing source **WP02-S129**, Diversi Foods Technical Sheet 74-05, separately declares ordinary wheat malt flour and roasted wheat malt flour in English and French. It does not give a roast grade or say whether the malt or flour is roasted. It therefore supports the active declared identity but does not connect that identity to IREKS’s more specific product.

The accepted [R58 equivalence review](wp02-a7-toasted-wheat-malt-flour-equivalence-boundary-review-20261013-round58.md) documents the boundary:

- IREKS’s current product wording is “slightly roasted wheat malt flour”; its French product search names `farine de blé malté légèrement grillée`.
- Moulins Bourgeois lists `toasted wheat malt flour` separately from `roasted wheat malt flour (black)` in its own product catalogue.
- These are manufacturer-specific labels and do not establish a shared product scope or process. R58 retained the active Diversi-declared row, kept toasted wording and IREKS’s qualified wording out of its aliases, and added no measurement, package yield, or substitution.

The active Québec French display remains `farine de malt de blé torréfié`. This review adds no translation, alias, or terminology decision. The reviewed evidence does not authorize applying IREKS’s differently ordered French product wording to the active display.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R663 disposition |
|---|---|---|
| Active identity | `ingredient-ref-roasted-wheat-malt-flour`, `roasted wheat malt flour / farine de malt de blé torréfié`; category `FLOUR_AND_STARCH`; no aliases. | Retain the current owner and names. Do not merge or alias the IREKS product wording. |
| Ledger | Identity is verified; measurement and substitution states are both `not_yet_researched`; no measurement observations. Existing sources include `WP02-S115`, `WP02-S116`, and `WP02-S129`, plus the Québec agreement review. | Preserve the current row. Do not attach the IREKS source or its measurements while the product scope is unresolved. |
| Numeric catalog fields | `defaultDensity` is `null`; `unitMappings` is empty; no form is attached. The package has 164 forms, zero global substitution rules, zero contextual substitution rules, and one unrelated active package-yield entry. | Keep every field and package part unchanged. No active numeric behavior is supported. |
| Legacy import | The 56 legacy candidates contain no exact target reference ID or reviewed English/French phrase. | No legacy candidate, alias, or identity is proposed. |
| Picker | Search uses the bilingual names and aliases, folds accents, and prefers complete word phrases ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The canonical English and French phrases and `roasted wheat malt` each return only the active reference. IREKS’s exact phrase `slightly roasted wheat malt flour` and its French product wording return no result; the broader `malt flour` query returns six current malt-flour identities. | Keep current search results. Do not add the IREKS phrase as an alias or route its exact product query to this row. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 structured ingredient rows were scanned. Accent-folded searches of complete recipe JSON and ingredient rows for the active names, IREKS product phrase, reviewed French phrase, and reference ID found zero hits and zero direct links. | No bundled recipe demand, link, relink, or recipe edit. |

At the R663 review snapshot before R665 integration, the active bundle contained 1,836 ingredient references, 164 forms, 56 legacy candidates, 2,209 research-ledger records, and 114 recipes. No form, rule, recipe, or active package-yield record references the target ID.

## Exact disposition

**Ledger delta:** none. Retain the existing `ingredient-ref-roasted-wheat-malt-flour` record and all of its fields, including the two `not_yet_researched` states and absence of measurement observations.

**Catalog/package delta:** none. Do not add a reference, alias, form, density, unit mapping, package-yield entry, substitution rule, or recipe link.

**Source/observation IDs:** none proposed. The IREKS URL is used in the R58 proposal archive under its proposal-local source IDs `WP02-A7-TOASTED-WHEAT-MALT-FLOUR-20261013-R58-S01` and `S02`; those are not active-ledger source records and are not copied into R663. The existing Diversi Foods source `WP02-S129` remains unchanged and owned by the active ledger row.

## Identifier and decision audit

- R663 is the globally allocated review ID. The R663 proposal path was absent before drafting.
- No new source, observation, candidate, form, or ingredient ID is assigned.
- The IREKS product-page URL has no owner in the active ledger; its evidence is already documented in R58’s proposal-local source register. No URL or source-ID duplication is proposed.
- Existing source `WP02-S129` remains the active row’s manufacturer declaration source and is not modified.
- This hold does not claim that IREKS’s page lacks numeric statements. It keeps those product-specific package/dosage statements out of an active row whose product match they do not establish.

## Static checks

- Re-read `AGENTS.md`, the relevant weight-volume requirement, current roadmap and A7 checklist, active catalog and ledger, ledger schema, forms, substitution rules, package yields, legacy candidates, and recent A7 proposals through R662.
- Reopened IREKS North America’s current product page on 2026-10-18 and checked its package, dosage, product wording, and product-specific scope against the existing R58 boundary review and active Diversi source.
- Confirmed the target ledger state and lack of observations; audited source/ID ownership, Québec display, aliases, adjacent identities, picker projections, all 56 legacy candidates, forms/rules/package yields, and all 114 manifest-listed recipes / 1,123 ingredient rows.
- This proposal and its integration add documentation only; no catalog or ledger data changed. The plan, roadmap, workflow, and hold README record the accepted boundary. No software tests, build, emulator run, or deployment were performed.
