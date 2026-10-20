# WP02 Section A7 R1067: defatted barley bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes only this Markdown file; it does not edit shared catalog JSON, the research ledger, plan, roadmap, recipes, generated files, or code.
- **Open-plan anchor:** WP02 Section A7 remains open for “other grain meals (including the unresolved wheat-meal candidate) and milling products” ([catalog plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic culinary **defatted barley bran**, a source-grain-qualified bran material after fat removal.
- **Recommendation:** Add one identity-only GRAIN_AND_CEREAL reference, **defatted barley bran / son d’orge dégraissé**. Keep the French compound descriptive and provisional for Québec. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer-variant research was performed. Commercial-product counts do not add ingredient diversity.

## Identity boundary and naming

The candidate is barley bran that has undergone a defatting process. A primary biscuit study explicitly lists barley among the cereal brans defatted with hexane; its methods describe laboratory milling of barley bran, drying, grinding, and sieving the brans before biscuit testing, and its conclusion includes barley among the brans used in biscuits [S01]. This is direct human-food research use supporting a generic, grain-qualified ingredient identity. It supports an identity-only row, not a standardized product specification or a home-processing instruction.

Keep the candidate distinct from:

- **ingredient-ref-barley-bran — barley bran / son d’orge.** This is the unqualified barley-bran identity. Preserve its row, source ownership, and existing research states. Defatted barley bran is not an alias or form of the general bran identity.
- **ingredient-ref-barley-bran-flour — barley bran flour / farine de son d’orge**, added at R1028. That review concerns the source-named flour ingredient, not fat removal. Preserve its sources and evidence. Do not add barley bran flour, barley bran powder, or ground barley bran as aliases for the proposed defatted identity; the study’s sample preparation does not settle a universal flour grade.
- Barley flour and whole-barley flour, which are milled from barley grain rather than from bran; barley germ, middlings, grits, semolina, starch, malted or roasted flours, and extracted barley fibre fractions.
- Defatted rice bran and defatted oat bran, which are separate grain-specific identities. Their terminology, claims, forms, measurements, and study results do not transfer to barley.

The English display follows the study’s generic term. Use **son d’orge dégraissé** as a transparent French construction from the existing Canadian French term **son d’orge** and the ordinary fat-removal qualifier. The exact compound is not established by an OQLF entry or a Québec product label, so retain it as provisional and add no aliases. Reuse existing terminology sources only for their narrow claims [reused S02–S04].

## Scope and queued-work disposition

- The open plan repeats the named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead. That product-only line is **out of scope** because commercial-product counts do not add ingredient diversity. Stop pursuing it; preserve its historical R605 review, all existing branded entries and their product-specific evidence, and the unresolved generic wheat-meal question.
- No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. No branded measurement or claim is used for the proposed generic identity.
- R978's cited Kaur et al. cereal-bran biscuit study also lists barley among the cereal brans, but the R978 decision applied its identity claim to defatted oat bran. R1067 uses the separate Nagi et al. study for the barley-specific laboratory preparation and food-use evidence. Do not broaden R978's oat-scoped ledger claim or transfer any oat result to barley.
- R1028 reviewed barley bran flour, while R972 and R978 reviewed defatted rice bran and defatted oat bran respectively. Those are adjacent but distinct identities; their records and source-scoped claims remain intact. No focused defatted-barley-bran review or allocation was found.

## Live ownership and recipe-demand audit

Read-only audit of the live repository on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,068** references. No exact proposed ID, defatted barley bran wording, or checked French compound is present. Existing neighbors include barley bran, barley bran flour, barley flour, whole-barley flour, barley germ, middlings, grits, semolina, starch, and malt/roasted barley flours. | If accepted, add one separately qualified identity. Preserve all existing rows, aliases, and evidence. |
| Ingredient forms | **205** forms. No form, match term, or owner refers to defatted barley bran. | Add no form. Defatting identifies the processed bran ingredient; the study does not establish a reusable recipe form or state transition. |
| Research ledger | **2,473** records. No identity record, source entry, or decision owns the proposed ID or exact candidate wording. The Nagi et al. article URL and DOI are not registered in the ledger. Existing barley-bran and barley-bran-flour records remain verified with measurement states researched_no_supported_value; their substitution states are respectively researched_no_supported_substitute and blocked_pending_evidence. The R972 defatted-rice-bran and R978 defatted-oat-bran records are separate and retain their own sources and states. | If accepted, create a separate record and new source ID. Reuse the existing Health Canada and OQLF terminology sources only for their current narrow claims. Do not copy states, measures, or findings from adjacent owners. |
| Legacy import identities | **55** candidates. No exact English/French candidate wording or proposed ID is present. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | All **114** manifest-listed recipe files and **1,123** structured ingredient rows were scanned. Exact candidate phrase and ID searches found **0 matching files and 0 ingredient rows**. A separate scan found no barley-bran wording or adjacent barley-bran-flour wording in the recipe corpus. | No recipe demand, amount, or recipe link supports a reusable value. |
| Source and proposal history | No current ledger source entry matches the Nagi et al. URL, DOI, title, or proposed R1067 source ID. R1028, R972, and R978 cover the distinct adjacent identities described above; no prior focused defatted-barley-bran review was found. | Keep source IDs local to this proposal until integration; preserve the neighboring evidence and decisions. |

The live reference, forms, ledger, legacy, and recipe checks used exact and normalized variants including **defatted barley bran**, **barley bran defatted**, **son d’orge dégraissé**, **son d’orge déshuilé**, and **ingredient-ref-defatted-barley-bran**. No other catalog or recipe field is proposed.

## Measurements, forms, and substitution limits

The reviewed source does not establish a generic household mass-volume measure, bulk density, unit mapping, conversion, cooking yield, or repeatable home preparation state for defatted barley bran. Its barley bran originated from barley laboratory milling. The study then defatted cereal-bran samples with a 3:1 hexane-to-bran ratio for 24 hours, filtered and dried them, milled to a uniform sample particle size, and passed the material through a 48-mesh sieve [S01]. This is a study protocol, not a consumer instruction, universal defatting standard, residual-fat threshold, product grade, or measure. Keep defaultDensity null, unitMappings empty, and measurement research at **researched_no_supported_value**.

The article’s biscuit formulas, selected inclusion level, storage results, and sensory findings belong to its tested materials and protocol. They are not general recommendations for replacing barley flour, wheat flour, or ordinary barley bran. If a ledger record is created, set substitution research to **blocked_pending_evidence**; add no global or contextual substitution rule, recipe-line substitution link, conversion, or yield. Keep all forms absent.

## Proposal-local source evidence and narrow reuse

The R1067 source ID below is local to this proposal; no shared ledger record or source entry was added.

| Source | Exact source locator | Supports and limitations |
|---|---|---|
| **S01 / WP02-A7-DEFATTED-BARLEY-BRAN-R1067-20261019-S01** | H.P.S. Nagi, J. Kaur, B.N. Dar, and S. Sharma, [“Effect of Storage Period and Packaging on the Shelf Life of Cereal Bran Incorporated Biscuits”](https://scialert.net/fulltext/?doi=ajft.2012.301.310), *American Journal of Food Technology* 7 (2012), 301–310, DOI [10.3923/ajft.2012.301.310](https://doi.org/10.3923/ajft.2012.301.310). Publisher record: article history and citation; **Materials and Methods**, “Materials,” “Defatted bran,” “Drying,” “Grinding,” and “Sieving”; **Results and Discussion**, Tables 4–6 and the concluding paragraph. | Primary human-food study. It says barley bran was prepared by laboratory milling; lists barley among brans defatted with hexane; describes drying, grinding, and 48-mesh sieving; and concludes that full-fat and defatted brans including barley were used in biscuit preparation. This establishes a source-named food ingredient identity. Its solvent, barley sample, lab mill, particle size, formula levels, storage conditions, and results are study-specific. The article does not establish a universal defatting process, residual-fat threshold, household use, current retail availability, Québec French name, household measure, density, or transferable substitution rule. Do not generalize any sample-specific claim. |
| **Reused S02 / WP03-BARLEY-BRAN-20261013-R56-S02** | Santé Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), tableau 1, **Sons**, entry **Son d’orge**. Current owner: ingredient-ref-barley-bran. | Supports the French base name and barley-bran milling identity only. It does not name defatted barley bran, define defatting, or attest the proposed compound as preferred Québec terminology. Reuse its existing source ID and keep it on its current owner. |
| **Reused S03 / WP03-BARLEY-BRAN-QC-R89-20261013-S01** | Office québécois de la langue française, [GDT: son](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), **Alimentation > céréale traitée**, definition and note. Current owner: ingredient-ref-barley-bran. | Supports son as the Québec French cereal-milling term. It does not define barley bran as a human-food item or attest son d’orge dégraissé. Reuse only for the base term. |
| **Reused S04 / WP03-GENERIC-BARLEY-R52-20261013-S01** | Office québécois de la langue française, [GDT: orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), definition and English equivalent. Current owner: ingredient-ref-barley. | Supports orge / barley and the crop-word component only. It does not attest a defatted-bran compound. Reuse the existing source ID without moving or broadening its claim. |

## Proposed minimal data and ledger state

If accepted, add only this reference:

    {
      "id": "ingredient-ref-defatted-barley-bran",
      "nameEn": "defatted barley bran",
      "nameFr": "son d’orge dégraissé",
      "aliasesEn": [],
      "aliasesFr": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-19T00:00:00Z",
      "category": "GRAIN_AND_CEREAL"
    }

Proposed research-ledger state, if integrated:

- **recordId:** ingredient-ref-defatted-barley-bran; **recordType:** ingredient_reference.
- **identityState:** verified, narrowly based on the primary study’s named generic human-food ingredient; the French display remains provisional and is supported only compositionally by the reused Québec/Canadian terminology sources.
- **measurementState:** researched_no_supported_value.
- **substitutionResearchState:** blocked_pending_evidence.
- Add no aliases, forms, measurement observations, density, unit mappings, recipe links, conversions, yields, or active substitutions.
- Preserve existing barley, barley-bran, barley-bran-flour, and branded references and their source ownership. Do not transfer the study’s extraction protocol, formula amounts, sample properties, or outcomes to them or to other grains.

This proposal changes only this Markdown file. No software tests, builds, or emulator checks were run because the task is proposal-only. Section A7 remains open.
