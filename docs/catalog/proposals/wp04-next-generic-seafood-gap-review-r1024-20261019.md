# WP04 Section P — sea urchin gonads demand and identity-boundary recheck (R1024)

- **Review and source-access date:** 2026-10-19.
- **Status:** Root review completed. The recommendation to maintain the existing candidate hold was accepted; no shared catalog or ledger data changed. The final disposition is recorded below and in the R1022–R1024 integration README.
- **Plan anchor:** Open Section P, “Fish shellfish seafood products roe and other regional proteins,” beginning at [line 7331](../../RecipeBook-global-ingredient-catalog-plan.txt#L7331). This is a non-fish seafood ingredient gap distinct from the recent turbot market-name group and salmon-belly boundary review.
- **Candidate:** edible sea urchin gonads, commonly called sea urchin roe and Japanese *uni*.
- **Recommendation:** Maintain the existing hold on extracted sea-urchin gonads/uni. Do not add an active reference, alias, form, measure, or recipe link. The live ledger already has a focused unresolved candidate record, and the bundled recipe corpus still supplies no demand. New Québec and technical evidence corroborates the edible-part boundary but does not meet the existing record’s stated trigger for activation: a bundled recipe or confirmed import.

## Scope and boundary

This proposal concerns the edible gonads removed from sea urchins, not whole live urchins, fish roe, fish eggs, caviar, or any one species. Fisheries and Oceans Canada (DFO) describes the edible part as commonly called roe but anatomically gonads, and notes both male and female gonads are consumed. Québec MAPAQ likewise states that only gonads are edible and documents a local sea-urchin fishery. Together these sources support a generic food identity for the edible part while preserving the anatomically accurate word in its English and French display. [S01–S02]

This is not a species group or claim that the gonads of different species, seasons, origins, grades, or handling states have equivalent flavour or culinary performance. DFO's historical Atlantic report names three sea-urchin species present in Canadian waters; MAPAQ's current page discusses Québec harvest and explicitly says gonad firmness and volume vary through the year, affecting commercial value and fishing season. Those details remain source-scoped and do not define a catalog form, standard grade, or species alias. [S01–S02]

The existing [tobiko/masago roe review](wp04-tobiko-masago-roe-boundary-review-20261009.md) already distinguishes sea-urchin “roe” from fish roe and says it must not alias to tobiko, masago, salmon roe, or caviar. It left broader non-fish roe outside its scope; this proposal addresses only that open sea-urchin ingredient. It does not reopen the tobiko/masago decisions or add any other non-fish roe identity. [S03]

## Active catalog delta

**None.** Keep the candidate unresolved in its current ledger record. Do not activate an identity or add aliases. Do not add whole-urchin wording as an alias: the animal and its edible gonads are different recipe materials. Do not add `uni`, `corail`, `urchin roe`, `sea urchin roe`, `œufs d’oursin`, or species names to active picker data. The existing candidate retains source-supported name options, including `sea urchin roe (uni)` and `gonades d’oursin (uni)`, as evidence only. A future naming decision should be bilingual and assess picker ambiguity before storing any of them.

No forms, aliases, density, unit mappings, active measures, conversions, package yields, edible yields, recipe links, or substitutions are proposed. Do not transfer any DFO price or historical yield figures, MAPAQ harvest or gonad-volume observations, or supplier pack information to a generic ingredient. The identity ledger, if this proposal is later accepted, should remain clear that the sources establish edible-part identity only; no reusable numeric behavior or substitute is supported.

## Normalized ownership and archive audit

The read-only snapshot contained **2,033 active ingredient references**, **205 forms**, **55 legacy-import candidates**, and **2,438 research-ledger records**. Normalized phrase checks covered the candidate ID and English/French name options plus `sea urchin`, `sea-urchin`, `urchin roe`, `sea urchin roe`, `uni`, `oursin`, `gonad`, and `gonade` across reference IDs, names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs, source titles/URLs, decisions, observations, and substitution findings.

No active reference, form, or legacy candidate owns the sea-urchin identity or name options. The research ledger **does** have the exact owner `candidate-sea-urchin-gonads-uni`, with `recordType: candidate`, `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It contains seven prior sources and an unresolved decision to keep extracted gonads/uni inactive until a bundled recipe or confirmed import creates demand. Other records mention `uni` only in boundary/substitution discussion, and `gonad` in separate fish-milt/scallop contexts; those are not sea-urchin identity owners. The current proposal confirms rather than replaces the candidate record; no source ID or ledger record is created here. The wording also appears in the historical R1009 tobiko/masago proposal as an adjacent boundary, but that packet leaves broader non-fish roe outside its scope.

Nearby active references for salmon roe, fish roe products, caviar, or other seafood remain separate and receive no aliases or evidence transfer. Preserve all existing branded products and their product-scoped claims. This review did not queue or pursue a brand, product-line, flavour-family, SKU, or retailer-only roster: commercial-product counts do not add ingredient diversity.

## Forms, numeric behavior, and substitution audit

No sea-urchin form is attached to an active reference, and no current form label or match term owns the candidate. The live package has no sea-urchin-specific form, density, unit mapping, package-yield row, or active conversion. It has **0 global same-ingredient substitution rules** and **0 contextual substitution rules**. No substitution is implied between sea-urchin gonads and fish roe, salmon roe, tobiko, masago, caviar, or any other seafood.

MAPAQ reports seasonal variability in firmness and gonad volume, while the DFO historical report's market/yield remarks are tied to its specific species, place, and time. Neither is a standard portion, mass-volume relationship, edible-yield factor, or recipe conversion. No value should be added as a reusable measure. No product-only or historical quantity should be transferred to the generic identity.

## Bundled recipe-demand audit

The seed manifest lists **114 recipe files** with **1,123 structured ingredient rows**. A manifest-ordered scan of full recipe JSON text and ingredient fields checked normalized phrases for `sea urchin`, `sea-urchin`, `urchin roe`, `sea urchin roe`, `uni`, `oursin`, `gonad`, and `gonade`. There were **zero matching recipe files and zero matching ingredient rows**. No recipe amount, form, preparation state, recipe link, or contextual substitution is supported by the bundle.

## Source register and limits

| ID | Source | What it supports and limit |
|---|---|---|
| **Reused `WP04-ROE-S11`** | Fisheries and Oceans Canada, [A Sea Urchin Fishery for Atlantic Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/88375.pdf), cited in the 2026-10-09 tobiko/masago review. | Says the portion commonly called roe is technically gonads and includes male and female gonads; identifies three sea-urchin species in Canadian waters. Supports the edible-part and non-fish boundary. Historical fishery report, not a current retail standard or universal species-equivalence claim. Keep its source ID with its existing citation owner. |
| **WP04-SECTIONP-SEA-URCHIN-GONADS-R1024-20261019-S01** | Québec MAPAQ, [L’oursin](https://www.mapaq.gouv.qc.ca/pechesicimangesici/Pages/index.aspx), page accessed 2026-10-19. | Says only gonads are edible, notes Québec fishers harvest urchins, and states gonad firmness and volume vary seasonally, affecting commercial value and fishing season. Supports Québec food context and the edible part; not a reusable amount, unit conversion, form, or species-independent culinary-performance claim. |
| **WP04-SECTIONP-SEA-URCHIN-GONADS-R1024-20261019-S02** | NOAA, [Green Sea Urchin Aquaculture in the Northeast US: Hatchery, Nursery, and Growout](https://repository.library.noaa.gov/view/noaa/70579/noaa_70579_DS1.pdf), 2024. | Describes green sea-urchin edible gonads as known by the Japanese word *uni* and discusses a commercial fishery in maritime Canada and other regions. Supports *uni* as culinary nomenclature and green urchin food context. U.S.-focused technical paper; not a bilingual Canadian label standard, not proof that every “uni” product is one species, and not a recipe conversion. |
| **Reused proposal citation, R1009** | [WP04 tobiko/masago roe boundary review](wp04-tobiko-masago-roe-boundary-review-20261009.md), “Sea-urchin roe / `uni`” boundary row and source register. | Records the distinction between non-fish sea-urchin gonads and fish roe products. The existing review's citations and evidence stay attached to that packet; this proposal does not assign a shared-ledger source ID for them. |
| **WP04-SECTIONP-SEA-URCHIN-GONADS-R1024-20261019-R01** | Repository audit of the Section P plan, live reference/form/legacy/ledger files, yield and substitution data, proposal/batch archive, and all manifest-listed recipes. | Snapshot evidence for ownership, form/numeric/substitution state, archive allocation, and recipe demand. Not an external product or culinary claim. |

## Recommendation

**Maintain the existing hold.** DFO and MAPAQ support the edible-gonad boundary, and MAPAQ supplies Québec food-fish context, but the new evidence neither creates recipe demand nor confirms an import that would supersede the candidate record’s activation condition. Keep source-backed wording on the unresolved candidate, keep fish roe products and other seafood identities separate, and reopen when a bundled recipe or confirmed import supplies the missing demand signal. Section P remains open.

## Root review disposition

Maintain the existing unresolved `candidate-sea-urchin-gonads-uni` record. The new seafood sources support the edible-gonad boundary and culinary use, but the existing candidate's activation condition still requires a bundled recipe or confirmed import; the reviewed bundle has neither. No reference, alias, form, measurement, recipe link, or substitution was added. Keep all older fish-roe and retailer-pack evidence with its existing owners.

The proposal's MAPAQ URL now redirects to the general Québec Ministry page when opened directly. Its indexed official-page text still shows the reported local fishery and edible-gonad wording, but the hold does not depend on treating that redirect as a current page. The final queue disposition and static checks are recorded in the [R1022–R1024 integration README](../batches/wp02-wp03-wp04-r1022-r1024-generic-gap-integration-20261019/README.md). No software tests were run because the active application changes only add database JSON under `AGENTS.md`.
