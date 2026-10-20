# WP03 Section N proposal — wine cap mushroom identity review (R1005)

- **Reviewed:** 2026-10-19
- **Status:** Integrated in the [R1004–R1006 batch](../batches/wp02-wp03-wp04-r1004-r1006-generic-gap-integration-20261019/README.md). This file preserves the evidence and limits recorded when the proposal was drafted.
- **Scope:** one generic culinary fungus, scoped to *Stropharia rugosoannulata*. This is not a brand, product-line, flavour-family, SKU, retailer-variant, or commercial roster review.
- **Plan anchor:** Section N, “Huitlacoche and other documented culinary fungi,” and its open species-sensitive naming/substitution review.
- **Recommendation:** add one identity-only row, **wine cap mushroom / strophaire à anneau rugueux**, with the English alias **wine roundhead**. The English/French pairing is supported across sources by their shared scientific name, rather than a bilingual terminology record. Keep the identity scoped to *S. rugosoannulata*. Do not add forms, recipe links, measures, density, unit mappings, yields, conversions, or active substitutions.

## Why this is a generic identity gap

The Québec MycoQuébec species record identifies *Stropharia rugosoannulata* as **strophaire à anneau rugueux**. University of Missouri Extension calls the same species **wine cap** and describes its use as food. MycoQuébec also records **Wine Roundhead** as an English name. The common-name pairing therefore resolves through the same identified taxon. [S01–S03]

The reference would describe the culinary fruiting body of this species. It would not stand for the genus *Stropharia*, generic mushrooms, spawn, or other species. MycoQuébec says the species is considered edible when young and notes that colour can fade with age or dry weather, making identification harder. Those are source-scoped mycology observations, not app foraging or food-safety guidance. [S01, S02]

## Proposed reference row

If accepted, use these identity-only values:

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-wine-cap-mushroom` |
| nameEn | `wine cap mushroom` |
| nameFr | `strophaire à anneau rugueux` |
| aliasesEn | `wine caps`; `wine roundhead` |
| aliasesFr | none |
| defaultDensity | `null` |
| unitMappings | empty |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` if integrated with this review |

The active reference schema has no scientific-name field. Keep *S. rugosoannulata* in the source-backed ledger notes, not as a picker alias. Do not add `king stropharia`, `garden giant`, or other broadly used names: the two reviewed search terms and the species-scoped displays are sufficient for this entry.

## Current package audit

I checked the active references and forms, the legacy candidate file, the research ledger, the recipe manifest and all manifest-listed recipes, and both substitution-rule files. Counts below describe the working tree read for this proposal on 2026-10-19.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | 2,018 references. No `wine cap`, `wine roundhead`, *Stropharia rugosoannulata*, proposed ID, or proposed French display is active. Nearby identities include generic mushroom, black trumpet, chanterelle, and other species-specific fungi. | Add one new species-bounded culinary identity and preserve all current references. |
| Active forms | 205 forms. No form names wine cap or *Stropharia rugosoannulata*. The generic mushroom reference has an existing dried form; the separate ground dried candy-cap mushroom reference is also active. | Add no form and do not transfer generic or candy-cap product-state evidence to this identity. |
| Legacy candidates | 55 candidates. No wine-cap or *Stropharia* candidate is present. | No legacy row is promoted or removed. |
| Research ledger | 2,424 records. No wine-cap, *Stropharia*, or proposed-ID record is present. | If accepted, add a new identity record without replacing other evidence. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. There are no exact wine-cap, Wine Roundhead, French-name, or scientific-name hits. | No recipe link or relink is supported. |
| Substitution rules | The global and contextual substitution-rule files have zero entries. The package-yield file has no wine-cap match. | Add no substitution, yield, or conversion data. |

The relevant existing mushroom ingredient lines remain generic: recipe 037#7 says “white mushrooms, sliced,” recipe 037#12 says “extra sautéed mushrooms,” and recipe 089#3 says “mushrooms.” Recipe 100#2 is separately linked to ground dried candy-cap mushrooms. None names wine cap or identifies *S. rugosoannulata*. Preserve those lines and links as written.

## Measures, forms, and substitutions

No reusable measure is supported by the sources reviewed:

- MycoQuébec gives a biological cap-diameter range of 4–20 cm. That describes identification and growth, not a household portion, count-to-mass value, or yield. [S01]
- Missouri Extension describes slicing the mushrooms in halves or quarters and sautéing them for about 20 minutes in an open pan. This is one preparation instruction with no amount, weight, or transferable cooking-time rule. It does not support a measure, density, or conversion. [S03]
- The sources reviewed provide no wine-cap-specific household-volume measure, density, package yield, or fresh-to-dried relationship.

Keep `defaultDensity` null, `unitMappings` empty, and package yields absent. Add no fresh, dried, powdered, canned, reconstituted, or soaking-liquid form. The existing generic dried-mushroom form remains attached to `ingredient-ref-mushroom`; it does not create a form for a new species row.

The targeted substitution search found no credible, recipe-context recommendation with a defined direction and usable amount. Missouri Extension describes serving wine caps with asparagus and rice, on a hamburger, or alongside other spring vegetables; these are serving contexts, not substitutions. No replacement ratio or cooking adjustment is supported, so no global or contextual rule is proposed. If accepted, leave `substitutionResearchState` as `not_yet_researched`; this proposal did not perform a full species-to-species substitution study.

If accepted, the ledger states would be:

- **identityState:** `verified`, for the *S. rugosoannulata* identity and reviewed common-name pairing.
- **measurementState:** `researched_no_supported_value`, limited to the sources and observations reviewed here.
- **substitutionResearchState:** `not_yet_researched`, because no broad, dish-context substitution study was completed.

## Identity and evidence boundaries

| Item | Treatment |
|---|---|
| *Stropharia rugosoannulata* fruiting body | Proposed identity scope. The pairing of English `wine cap mushroom` with French `strophaire à anneau rugueux` is an explicit cross-source inference through the shared binomial. |
| Generic mushroom / `champignons` | Preserve the existing identity and plural alias. Generic recipe wording does not establish wine-cap demand. |
| Dried mushrooms under generic mushroom | Preserve the existing form and source evidence. No species-specific dried form or fresh-to-dried yield is inferred. |
| Ground dried candy-cap mushrooms | Preserve the separate active ingredient. It does not provide form or use evidence for wine caps. |
| Black trumpet, chanterelle, and other named fungi | Preserve each active identity and evidence. Do not merge names or infer mushroom-to-mushroom interchangeability. |
| Foraged specimens | The identity is not a foraging identification guide. MycoQuébec's maturity and identification observations stay in the cited source context. |
| Cultivation terms and named strains | Do not add spawn, cultivation material, strain, product, brand, or retailer-variant records. |

No commercial-roster-only queue item was encountered or researched. The selected gap is one generic species identity; commercial-product counts do not add ingredient diversity.

## Source register

Sources were accessed 2026-10-19. At proposal drafting these IDs were proposal-local; the R1005 integration registered them on the new species-scoped ledger record.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-SECTIONN-WINE-CAP-R1005-20261019-S01** | MycoQuébec, [*Stropharia rugosoannulata* species record](https://mycoquebec.org/scripts/fiche_pdf.php?dest=D&tag=Stropharia+rugosoannulata). | Identifies the species and Québec French name **strophaire à anneau rugueux**. It describes its habitat and biological features, says it is edible when young, and gives cap-size data. Those latter statements remain mycology evidence, not cooking measures or foraging guidance. |
| **WP03-SECTIONN-WINE-CAP-R1005-20261019-S02** | MycoQuébec, [“Une si belle strophaire”](https://blog.mycoquebec.org/blog/une-si-belle-strophaire/), 2022. | Connects *S. rugosoannulata* with the French name **strophaire à anneau rugueux** and English **Wine Roundhead**; describes its edible use when young and source-scoped identification cautions. The common-name pairing is taxon-mediated. |
| **WP03-SECTIONN-WINE-CAP-R1005-20261019-S03** | University of Missouri Center for Agroforestry, [“Cultivation and Cuisine: Getting Started with Wine Cap Mushrooms”](https://agebb.missouri.edu/agforest/archives/v23n2/gh4.php), 2019. | Identifies wine caps as *Stropharia rugosoannulata*, describes their culinary use, and provides one sauté preparation. The page gives no ingredient quantity or reusable measure; its growing instructions are out of scope. |
| **WP03-SECTIONN-WINE-CAP-R1005-20261019-S04** | Illinois Extension, [“Bed Farming”](https://extension.illinois.edu/mushrooms/bed-farming). | Independently pairs Wine Cap mushroom with *Stropharia rugoso-annulata* and lists other common terms. Used as a species/name cross-check; its cultivation guidance is not ingredient-form, measure, or substitution evidence. |

## Disposition

Recommend one identity-only **wine cap mushroom / strophaire à anneau rugueux** reference, with only the aliases listed above. Preserve every existing mushroom identity, form, recipe line, and source record. Add no forms, measures, density, mappings, yields, recipe links, conversions, or active substitutions. Section N remains open.
