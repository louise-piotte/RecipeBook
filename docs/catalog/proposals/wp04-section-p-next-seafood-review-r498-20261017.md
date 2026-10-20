# WP04 Section P — Monkfish / baudroie multi-species market-name review (R498)

- **Review and source-access date:** 2026-10-17.
- **Packet type:** Proposal-only Canadian/Québec naming, market-group, product-boundary, picker, ownership, and recipe-demand review.
- **Recommendation:** Add one identity-only, species-neutral market-name group for monkfish / baudroie fish flesh. The display explicitly says the common wording covers multiple fish species. Keep it separate from steamed monkfish liver, burbot / lotte, and any species-qualified *Lophius* product.
- **Status:** Proposed; no shared catalog, ledger, plan, roadmap, workflow, recipe, or generated file was changed.

## Scope and reason to reopen the earlier hold

This review covers the unqualified fish-flesh market names **monkfish / baudroie**. It does not select a *Lophius* taxon, resolve a named species product, or establish a cut, state, or package identity. The proposed group is a search and naming choice for fish flesh sold under a broad market name, not a taxonomic group or claim that every market use has the same species composition.

The earlier [R12 monkfish / baudroie hold](wp04-section-p-monkfish-baudroie-picker-boundary-review-20261012.md) correctly kept the broad name unallocated: OQLF and CFIA evidence spans more than one *Lophius* species, and an *L. americanus*-only row would make bare **monkfish** / **baudroie** queries appear species-specific. Its picker context has changed. R404 has since added a visibly qualified **steamed monkfish liver / foie de baudroie cuit à la vapeur** reference. Today, bare **monkfish** and **baudroie** queries return that organ product alone. Adding a clearly labelled multi-species fish-flesh group would make each query show two different, visibly named choices instead of leaving the liver result to stand in for the broader fish name. It does not add a species-only row or collapse the fish and liver identities. [R404 proposal](wp04-section-p-next-seafood-gap-review-r404-20261017.md); [R403–R405 integration](../batches/wp02-wp04-wp06-r403-r405-gap-review-integration-20261017/README.md).

This reopens only the broad market-name boundary. The R495 canned Québec redfish product, species-scoped fish references, the R404 steamed-liver product, and R489 canned cod liver remain separate decisions. There are no monkfish recipe hits in the current corpus, so the benefit is a more accurate general picker choice rather than a recipe-linked allocation.

## Naming and identity boundary

| Candidate | Category | English display | Québec French display | Alias | Scope |
|---|---|---|---|---|---|
| Monkfish / baudroie market-name group | `PROTEIN` | **monkfish (market name used for multiple fish species)** | **baudroie (appellation commerciale utilisée pour plusieurs espèces de poissons)** | English: `monk fish`; French: none | Species-neutral fish-flesh name group. OQLF reports *Lophius piscatorius* and *L. americanus* may occur in commerce; this display does not assert those are an exhaustive list. |

OQLF prefers **baudroie** in the edible-fish and Québec commercial context, gives English **monk fish** and Latin *Lophius* sp., and says two species can be found in commerce. CFIA’s Fish List separately applies the English name **Monkfish** to *L. americanus* and *L. piscatorius*. A current supplier’s product listing provides one concrete species-specific example: fresh monkfish tails labelled *L. piscatorius* and French **Baudroie commune**. Together, these sources support a visible multi-species name group, not an exact taxon for an unqualified recipe line or for any one SKU.

Do not add these other terms to the group:

- **American monkfish** and **baudroie d’Amérique** are species-qualified wording for *L. americanus*; they remain outside this species-neutral group.
- **Baudroie commune** is the supplier’s name for its *L. piscatorius* SKU; it is not a broad alias.
- **Angler** and **goosefish** appear as English terms in the OQLF entry, but are not safe global aliases here. CFIA also lists **Goosefish** for *Lophiomus setigerus* and has species-scoped **Angler** entries; those names need separate treatment.
- **Crapaud de mer** was not retained by OQLF for Québec fish-product marketing.
- **Lotte** stays with the active freshwater burbot identity (*Lota lota*); OQLF discourages using it for baudroie.
- Do not alias **liver**, **monkfish liver**, **ankimo**, **fish**, **white fish**, or any generic fish preparation to this group.

## Current ownership and prior coverage

The current seed has **1,777 ingredient references** and **143 forms**. It has one monkfish-name reference: `ingredient-ref-steamed-monkfish-liver`, displayed as **steamed monkfish liver / foie de baudroie cuit à la vapeur**, with English alias `ankimo`. There is no active generic monkfish / baudroie fish-flesh reference, species-specific *Lophius* reference, or monkfish/baudroie form. The active `ingredient-ref-burbot` owns Québec **lotte**. The 56-candidate [legacy-import identity file](../legacy-import-identities.v1.json) has no monkfish, monk fish, baudroie, or *Lophius* candidate.

The ledger contains **2,135 records**, **9,772 source entries**, **8,274 distinct source IDs**, and **6,987 distinct URLs**. No record ID owns `ingredient-ref-monkfish-market-group`; the R404 record owns the existing steamed-liver identity and already registers OQLF source S01 and DFO English source S03 from the earlier monkfish review. R12 assigned CFIA S02 and DFO French S04 in its archive, but neither source ID is registered in the live ledger. No earlier proposal or integration allocates the proposed market-group ID or the proposed R498 source prefix.

| Surface | Current owner or evidence | Proposed treatment |
|---|---|---|
| Active references | R404 steamed monkfish liver; burbot / lotte. No whole-flesh market group or species-specific *Lophius* row. | Add only the market-name group above; retain liver and burbot unchanged. |
| Forms | No form label or match term for monkfish, monk fish, baudroie, or *Lophius*. | Add no form, cut, or preparation state. |
| Legacy import | No candidate for the proposed ID or name family. | Add no legacy mapping. |
| Research ledger | R404 has the steamed-liver record; no generic group record ID. R404 already registers OQLF S01 and DFO English S03. The R12 CFIA S02 and DFO French S04 IDs are archive-only; the CFIA endpoint URL itself is already registered under other source IDs. | If accepted, add one identity record and five source entries: reuse live S01/S03; newly register archive-only S02/S04 to their R12 URLs; and register the new R498 Salties source. |
| Prior proposal/archive | R12 held generic monkfish; R404 added a distinct steamed organ product; R489 added canned cod liver. R495 concerns canned Québec redfish. | Reopen only the generic flesh-name picker boundary; change none of the prior decisions. |
| New identifiers | `ingredient-ref-monkfish-market-group` and `WP04-SECTIONP-MONKFISH-MARKET-GROUP-R498-20261017-` have no current ledger, reference, form, legacy, proposal, or batch owner. | Keep proposed until review. Three source IDs would be new to the live ledger: archive-only R12 S02 and S04, plus new R498 S01 for Salties. |

## Source IDs and URL ownership

The source-ID-to-URL pairs below are exact. S01 and S03 are already registered in the live ledger and are reused from the R404 record. S02 and S04 are assigned in the R12 archive but absent from the live ledger; if accepted, register those archive-only IDs against their original R12 URLs. The CFIA results endpoint is a shared dynamic URL already registered under many other IDs, so registering S02 adds a source ID but no unique URL. The DFO French URL is not in the live ledger. Salties is the only new R498 source ID and its product-page URL is also unowned.

| Source ID and ownership | Source and exact URL | Evidence and limits |
|---|---|---|
| Reuse `WP04-SECTIONP-MONKFISH-20261012-S01` (currently in the R404 ledger record) | OQLF GDT, [baudroie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198872/baudroie), updated 2011 | Prefers Québec **baudroie**, gives English **monk fish** and *Lophius* sp., and says *L. piscatorius* and *L. americanus* may occur in commerce. It also discourages **lotte** for baudroie and says **crapaud de mer** was not retained for Québec fish-product marketing. This is terminology and market-scope evidence, not an exhaustive taxon list or culinary measure. |
| Register archive-only `WP04-SECTIONP-MONKFISH-20261012-S02` from R12 in the live ledger | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), page marked modified 2023-09-18 | Lists **Monkfish** for both *L. americanus* and *L. piscatorius*; the *L. piscatorius* entry also pairs it with **Baudroie Commune**. This is an acceptable fish-name list, not evidence that every product or recipe labelled monkfish is one of those two species. The page is a shared results endpoint, not a stable, query-specific product page. Its exact URL already has other ledger owners; S02 is a new live source-ID mapping but adds no distinct URL. |
| Reuse `WP04-SECTIONP-MONKFISH-20261012-S03` (currently in the R404 ledger record) | Fisheries and Oceans Canada, [Monkfish](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/monkfish-baudroie-amerique-eng.html) | Identifies *Lophius americanus* as a Canadian species called monkfish. It is a species profile, not a general fish-flesh product definition. Whole-animal size and weight are biological observations, not kitchen measures. |
| Register archive-only `WP04-SECTIONP-MONKFISH-20261012-S04` from R12 in the live ledger | Fisheries and Oceans Canada, [Baudroie d’Amérique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/monkfish-baudroie-amerique-fra.html) | Confirms the species-qualified French name **baudroie d’Amérique** for *L. americanus*. That qualified name is excluded from the group’s aliases. This species profile does not support culinary measures or a species-agnostic substitution. Both this source ID and its exact URL are absent from the live ledger; adding S04 adds one distinct URL. |
| New live source ID `WP04-SECTIONP-MONKFISH-MARKET-GROUP-R498-20261017-S01` | Salties, [Fresh Monkfish Tails, skin on](https://www.salties.ca/products/fresh-monkfish-tails-skin-on) | The supplier page identifies a fresh-tail SKU as monkfish, *L. piscatorius*, and French **Baudroie commune**. The indexed product-page capture also says tail size 750 g+, bones in/skin on, and a 10 kg minimum order. This is one supplier’s species-specific presentation; the stated size and order threshold are not recipe portions, household measures, or conversions. The exact URL and R498 source ID are new to the ledger. The page could not be opened directly in the browser, so current stock and page changes were not independently confirmed. |

The proposed record would contain **five source entries spanning five distinct exact URLs**: S01 and S03 are existing live source-ID mappings; archive-only R12 S02 and S04 plus R498 S01 are three source IDs newly registered in the live ledger. OQLF, CFIA, and DFO English URLs already occur in the current ledger; DFO French and Salties are two previously unowned URLs. Starting from **6,987 distinct URLs**, the expected ledger count after integration is **6,989** (**+2**), assuming no intervening ledger changes. Counts would move from **2,135 to 2,136 records**, **9,772 to 9,777 source entries**, and **8,274 to 8,277 distinct source IDs**. The five exact source-ID-to-URL mappings are the ones shown in the table above; no source ID is assigned to more than one URL. Do not mint an R498 ID for the OQLF or DFO English URL already owned in the R404 record, and do not claim the Salties size wording as a reusable observation.

## Phrase-first picker projection

Projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases take priority, with substring matching only when there is no phrase match. Reference names, aliases, and any attached form terms participate. There are no monkfish forms today; the proposed row adds only the two displays and exact English alias **monk fish**.

| Query | Current phrase-first result | With proposed row | Boundary |
|---|---|---|---|
| **monkfish** | `ingredient-ref-steamed-monkfish-liver` — steamed monkfish liver / foie de baudroie cuit à la vapeur | Same liver row plus `ingredient-ref-monkfish-market-group` — monkfish (market name used for multiple fish species) / baudroie (appellation commerciale utilisée pour plusieurs espèces de poissons) | Two visibly qualified product/identity choices; no single species is selected. |
| **baudroie** | R404 steamed monkfish liver | R404 steamed monkfish liver plus the proposed multi-species group | The French query no longer presents the organ product as the only baudroie choice. |
| **monk fish** | No result | Proposed group only, by its exact English alias | This preserves OQLF’s two-word English term. |
| **monkfish liver**; **foie de baudroie** | R404 steamed monkfish liver | Unchanged | Keep the named organ product distinct from fish flesh. |
| **liver**; **foie** | R489 canned cod liver and R404 steamed monkfish liver | Unchanged | The generic group does not add a liver alias. |
| **American monkfish**; **baudroie d’Amérique**; **baudroie commune** | No result | No result | Do not assign a species-qualified product phrase to a species-neutral row. |
| **angler**; **goosefish**; **crapaud de mer** | No result | No result | Do not add ambiguous or non-retained names as aliases. |
| **lotte** | Burbot / lotte | Unchanged | Preserve the separate freshwater species identity. |

The projection does not add a broad `fish` term, a fish-liver term, or a cut name. Search text remains a selection aid; the group does not make its source taxa interchangeable in every recipe.

## Manifest recipe scan

I scanned every manifest-listed recipe file and every parsed string in each file, including every ingredient row. Whole-phrase checks covered **monkfish**, **monk fish**, **monkfish liver**, **monk fish liver**, **baudroie**, **baudroie d’Amérique**, **baudroie commune**, *Lophius*, *L. americanus*, *L. piscatorius*, **goosefish**, **angler**, **anglerfish**, **stargazer**, **crapaud de mer**, and **lotte**.

- Manifest recipe files: **114**.
- Ingredient rows: **1,123**.
- Files containing any reviewed phrase: **0**.
- Ingredient rows containing any reviewed phrase: **0**.
- Total exact recipe-file bytes: **753,988**.
- Manifest-order SHA-256: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

The digest uses each manifest-relative path, a NUL byte, its exact file bytes, then a trailing NUL byte, in manifest order. The bundle provides no recipe link, amount, cut, taxon, cooking state, or context-specific substitute for this market-name group.

## Data limits and proposed ledger state

- **Identity:** Set `identityState` to `verified`. Keep the row species-neutral and category `PROTEIN`. The parenthetical displays identify a multi-species market-name group; do not create a scientific taxon field or species alias.
- **Names:** Use the bilingual displays above and the single English alias `monk fish`. Keep `baudroie d’Amérique`, `baudroie commune`, `angler`, `goosefish`, `crapaud de mer`, and `lotte` out of aliases.
- **Forms and units:** Add no form, preparation or cut mapping, density, or unit mapping. Salties’ tail description does not define a reusable tail or fillet form.
- **Measurements:** Set `measurementState` to `researched_no_supported_value`; add no measurement observation. The supplier’s 750 g+ item size and 10 kg minimum order are product/order specifications, not portions or a household-measure conversion. No density, yield, or package conversion follows.
- **Substitutions:** Set `substitutionResearchState` to `not_yet_researched`; add no global or contextual rule. The reviewed naming and product sources do not establish a tested or safe replacement for cod, halibut, lobster, another *Lophius* species, or fish liver.
- **Recipes:** Add no recipe link or ingredient-row mapping; the full corpus scan is zero.

If accepted, add only `ingredient-ref-monkfish-market-group` with the fields above and one identity-reference ledger record citing the reused OQLF, CFIA, and DFO IDs plus the new Salties source. Keep `measurementObservations` empty and record the measurement and substitution evidence states described above. This packet changes only its own proposal file; no tests, builds, emulator checks, or deployment were run.
