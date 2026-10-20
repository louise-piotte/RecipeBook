# WP05 Section W R983 generic preserved-food gap review: Bashang suancai

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal only; no shared catalog or ledger data was changed.
- **Plan anchor:** The open Section W checklist asks for Chinese preserved greens and “further documented regional preserves” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10360). This review addresses one source-named regional preserve only; it does not close the parent checklist.
- **Candidate:** Generic regional preserve `Bashang suancai`, described in a peer-reviewed original study as a traditional fermented vegetable of the Bashang region and surrounding areas.
- **Scope rule:** The review focuses on generic culinary ingredient diversity. No brands, product lines, flavour families, SKUs, or retailer variants were researched. No roster-only queued task was encountered. If one is encountered later, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that research line. Preserve existing branded rows and their product-scoped evidence; do not generalize them without a transferability review.

## Ownership and existing boundaries

The current package snapshot contains **1,998 ingredient references**, **205 forms**, **55 legacy-import candidates**, **2,403 research-ledger records**, and **114 manifest-listed recipes**. A case-, punctuation-, and accent-insensitive search across active reference IDs, names, and aliases; form labels and match terms; legacy candidates; ledger record IDs; and recipe text found no active owner for `Bashang suancai`, `Bashang suan cai`, `suan cai`, `suancai`, `Bashang`, or `坝上酸菜`. No form or legacy candidate owns the proposed identity. The proposed ID `ingredient-ref-bashang-suancai` and source prefix `WP05-SECTIONW-BASHANG-SUANCAI-R983-20261019-` are unallocated.

The ledger does mention Bashang suancai in the existing `ingredient-ref-dongbei-suancai` record. Its R980 source `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-S03` is explicitly boundary evidence: it distinguishes Bashang from Dongbei by region and cabbage type, and says the Bashang process findings do not define Dongbei preparation. That record does not own the Bashang identity. Retain its source and decision unchanged. This R983 proposal uses the study directly for the Bashang candidate under a new source ID; it does not transfer Dongbei formula, measurement, or process evidence.

| Existing identity | Current scope | Boundary retained |
|---|---|---|
| `ingredient-ref-dongbei-suancai` — `Dongbei suancai / Dongbei suancai` | Northeast Chinese fermented-cabbage preserve. | Keep the region-qualified identity separate. The paper says Dongbei uses Chinese cabbage, while Bashang suancai is associated with common head cabbage and a different region/season. Neither name is an alias for the broader unqualified `suan cai`. [S01]. This distinction is also recorded by the existing boundary source `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-S03`. |
| `ingredient-ref-green-cabbage` — `green cabbage / chou pommé vert` | Raw cabbage. | Do not attach fermentation or preserve meanings as a form or alias of the fresh vegetable. A raw cabbage ingredient row does not establish demand for Bashang suancai. |
| `ingredient-ref-napa-cabbage` — `Napa cabbage / chou nappa` | Raw Chinese cabbage. | Keep this fresh vegetable distinct from both prepared preserves. |
| `ingredient-ref-pickled-radish` — `pickled radish / radis mariné` | Canadian salt-and-vinegar pickle class. | Do not map Bashang suancai to the generic vinegar-pickle identity merely because the study allows white radish among its ingredients. The source describes a regional fermented food, not a synonym for all pickled vegetables. |
| `ingredient-ref-pickled-mustard-greens` — `pickled mustard greens / feuilles de moutarde marinées` | Generic preserved mustard greens. | Keep the vegetable and regional-product boundary; no mustard-green wording is supported as an alias for Bashang suancai. |
| `ingredient-ref-kimchi` — `kimchi / kimchi` | Korean fermented-vegetable preparation. | Fermentation alone does not make kimchi equivalent or interchangeable with Bashang suancai. |

The paper is direct evidence for a Bashang regional food and does not establish a broad identity for every food named `suan cai`. Keep the regional qualifier visible in both displays. Do not alias the candidate to unqualified `suan cai`, `Chinese sauerkraut`, `sauerkraut`, `fermented cabbage`, `pickled cabbage`, `pickled vegetables`, `Chinese pickle`, or other region-qualified preserves.

## Recipe demand

All **114** manifest-listed recipe JSON files and **1,123** ingredient rows were scanned, including serialized recipe text and ingredient fields. The bounded query set (`Bashang suancai`, `Bashang suan cai`, `Bashang`, `坝上酸菜`, `suan cai`, `suancai`, `酸菜`, `fermented head cabbage`, and `pickled head cabbage`) returned **zero recipe-file or ingredient-row hits**. The recipe corpus therefore supplies no direct demand, recipe link, role, or recipe-derived measure for this preserve. Existing green-cabbage, Napa-cabbage, or other preserved-food rows do not establish Bashang demand. No recipe link or relinking is proposed.

## Identity and naming evidence

Liu et al.’s peer-reviewed original study calls Bashang suancai a traditional fermented vegetable and describes it as part of daily food use across the Bashang region and surrounding areas of Hebei, Inner Mongolia, and Shanxi. It distinguishes the product from Dongbei suancai by raw material and regional season: Bashang uses common head cabbage as its main vegetable and is generally fermented in summer or autumn; Dongbei uses Chinese cabbage and is generally fermented in winter or spring. These differences support a geographically qualified identity and keep the two products separate. They do not establish a universal taxonomy for unqualified `suan cai`. [S01]

The same paper says Bashang suancai can be made by pickling cabbage, white radish, and carrot individually or in combination, with cabbage predominant. The name should therefore not be defined as only one vegetable or one fixed blend. The source supports the romanized name `Bashang suancai`; no preserve-specific Québec French term was verified. Retain the borrowed name provisionally in both display fields and add no French descriptive alias. Do not infer a French term from the source’s raw-vegetable names.

The study’s materials-and-methods section records homemade samples from Kangbao County, Hebei, collected June 19–26. For its cabbage preparation it reports removing outer leaves, rinsing and cutting the cabbage into roughly 3 × 3 cm pieces, seasoning with 4% salt, and spontaneous fermentation under a weight at ambient 18–20°C for seven days. These are study-specific preparation details, including the paper’s stated “4%” without an independently established transferable basis. They are not a catalog formula, serving measure, standard process, or food-safety instruction. Do not copy them into reusable recipe or conversion behavior. [S01]

## Measurement and substitution review

The paper provides no finished-food serving weight, household measure, density, unit mapping, transferable yield, or preparation-independent conversion. Its salt percentage, batch conditions, cut size, fermentation period, and laboratory measurements belong to its documented Bashang sample and study procedure only. If integrated, use `measurementState: researched_no_supported_value`, `defaultDensity: null`, `unitMappings: []`, no forms, and no measurement observations.

No reviewed source recommends replacing finished Bashang suancai in a defined dish, role, method, and amount. Keep `substitutionResearchState: blocked_pending_evidence`; add no active substitution rule. Do not nominate Dongbei suancai, sauerkraut, kimchi, pickled mustard greens, pickled radish, fresh cabbage, or another preserve as a replacement based only on similar fermentation, vegetable, sourness, or naming.

## Unsupported limits

The reviewed source supports a named regional identity, but one study does not establish a complete definition across all household preparations or localities. It does not establish a fixed vegetable blend, cut, salt basis, salt level, temperature, duration, acidity, drained state, finished mass, portion, shelf life, or safety protocol. Preserve every ingredient and process observation at the scope of the study that reported it.

The evidence does not establish that Bashang suancai is equivalent to Dongbei suancai, generic `suan cai`, Hakka suan cai/fu cai/mei gan cai, kimchi, European sauerkraut, generic pickled cabbage, or generic pickled vegetables. It supports no Québec-standardized preserve name, aliases, recipe links, measures, or substitution rules. No maker, package, retailer, or commercial availability claims were researched.

## Proposed minimal state and source register

| Field | Proposed state |
|---|---|
| Candidate ID | `ingredient-ref-bashang-suancai` |
| `nameEn` | `Bashang suancai` |
| `nameFr` | `Bashang suancai` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases / French aliases | None / none |
| Forms, density, unit mappings, measures, conversions, yields | None |
| Recipe links and active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-BASHANG-SUANCAI-R983-20261019-S01` | Yuan Liu et al., [“Characterization of the microbial communities and their correlations with volatile flavor compounds and physicochemical factors in Bashang suancai, a traditional Chinese pickle”](https://www.frontiersin.org/journals/microbiology/articles/10.3389/fmicb.2024.1478207/full), *Frontiers in Microbiology* 15 (2024), article 1478207, [DOI: 10.3389/fmicb.2024.1478207](https://doi.org/10.3389/fmicb.2024.1478207), accessed 2026-10-19. | Peer-reviewed original study. Introduction identifies Bashang suancai as a regional traditional fermented vegetable and distinguishes it from Dongbei suancai by region, cabbage type, and season. Section 2.1 describes multiple possible vegetables, with cabbage predominant, and the study’s home-made Kangbao County sample and preparation. The reported 4% salt, roughly 3 × 3 cm cut, 18–20°C, seven-day period, and laboratory observations remain specific to this study; they are not universal measures, a standard formula, or safety guidance. |

**Disposition:** Propose one identity-only generic `Bashang suancai / Bashang suancai` reference in `SAUCE_AND_CONDIMENT`, with no aliases, forms, reusable measures, recipe links, or active substitutions. Keep the French display provisional and unqualified `suan cai` held. Preserve the existing Dongbei suancai identity and its source-scoped evidence. No commercial-product roster was researched. No tests or builds were run because this is a proposal-only document.
