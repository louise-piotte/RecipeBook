# WP04 Section P R652 — Tench / *Tinca tinca* market and picker review

- **Status:** Integrated hold. No active catalog or ledger change.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** Section P’s broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** Tench / Tanche, *Tinca tinca* (CFIA TSN 163348).
- **Scope:** One freshwater-fish identity and Québec-facing product-evidence gap. This is distinct from R618 snakehead, R622 Catla, R626 Mrigal, R630 gilthead bream, R633 *Seriola rivoliana*, R637 Northern searobin, R641 Bowfin, R645 Blue Runner, and R649 Blue Whiting. The existing Rohu, common-carp, and cunner decisions are checked only for naming and picker boundaries; they are not reopened.

## Source findings and market limits

The CFIA Fish List gives a species row for *Tinca tinca* (TSN 163348) pairing **Tench / Tanche** under Cyprinidae. CFIA’s Fish List overview describes the resource as Canadian fish-labelling nomenclature tied to scientific names and TSNs. Together, these sources support the Canadian name/taxon pair; the Fish List is not evidence of a current product listing or sales volume. [S01, reused S11]

The current Gouvernement du Québec species profile independently lists French **Tanche**, English **Tench** and **Eurasian tench**, and scientific name *Tinca tinca*. It describes the fish as an invasive freshwater species established in the Richelieu River and St. Lawrence River. Its guidance says anglers should release a tanche if they do not wish to keep it for their own consumption; it also prohibits buying or possessing a live tanche. This is evidence that the Québec wildlife guidance recognizes personal-consumption retention of a catch. It is not evidence of a Québec retail SKU, commercial fishery, food-service supply, or recipe tradition. [S02]

OQLF’s GDT fiche 1198965 identifies **cunner / tanche-tautogue**, *Tautogolabrus adspersus*, in the edible-fish and ichthyology domains. It lists bare **tanche** among terms used in some contexts, but says that bare term was not retained for Québec fish-product marketing to avoid consumer-label confusion. That note is scoped to Cunner; it does not invalidate the CFIA and Gouvernement du Québec pairing of **Tanche** with *Tinca tinca*. For picker behavior, however, do not treat bare `tanche` as a Cunner alias. If both species ever have active rows with the source-backed displays `Tanche` and `tanche-tautogue`, a `tanche` query would surface both rows under the current phrase matcher, which is a visible multi-result choice rather than a silent species assignment. [S03]

A targeted search on 2026-10-18 for `tench fish for sale Canada Tinca tinca` and `tanche Tinca tinca poisson acheter Québec` did not surface a verifiable Canadian or Québec consumer product listing. This is a limited search observation, not proof that no such product exists. The Québec wildlife profile supports only the narrower personal-catch consumption context above. No source reviewed here establishes current retail availability or a culinary product demand sufficient for a bundled ingredient reference. [R01]

The names are source-supported, but catalog admission is not warranted by name evidence alone. The local official source describes an invasive wild species and personal-use retention, while this bundle and this market review supply no matching recipes or verified current Québec product.

## Exact proposed data delta

**Hold the candidate outside active data; add no JSON or ledger row.** Keep all of the following unallocated in active references, forms, legacy-import identities, and research-ledger decisions:

- `ingredient-ref-tench` and `candidate-tench`;
- `Tench`, `Tanche`, *Tinca tinca*, `Eurasian tench`, `tanche verte`, `tanche dorée`, and `tanche de Mongolie` as a new reference, alias, form, or accepted ledger decision.

The first two names and binomial are supported for species identification, but the alternative names are not established here as Québec consumer fish-product terms. Do not add a form, measure, density, unit mapping, recipe link, conversion, yield, or substitution. Do not infer a product or culinary relationship with Cunner, Rohu, Catla, or common carp. The source IDs in this proposal are local evidence labels only and do not allocate shared ledger IDs.

Reopen only if a Québec or Canadian culinary source supplies an identifiable Tench product or recipe use, or a comparable supported food-use case that justifies a bundled recipe ingredient identity. Any future row should remain limited to *Tinca tinca* and preserve the source-supported English/French pair; it must not assign the name `tanche` to Cunner.

## Active ownership, picker behavior, and recipe demand

The read-only audit covered active ingredient references and forms, legacy-import candidates, the research ledger, the Section P checklist and progress notes, prior proposals and batches, picker implementation, the bundled-library manifest, and every manifest-listed recipe. After the R651 and R653 integrations, current package totals are **1,833 references**, **164 forms**, **56 legacy candidates**, **2,206 research-ledger records**, and **114 recipe files with 1,123 structured ingredient rows**.

No active reference, form, legacy candidate, or ledger record owns `Tench`, `Tanche`, *Tinca tinca*, `Eurasian tench`, `ingredient-ref-tench`, `candidate-tench`, or the R652 source-ID prefix. No focused Tench / *Tinca tinca* proposal or integration batch was found. Existing `tanche` mentions in the archive belong to the separate Cunner terminology boundary, including its hold; they are not an allocation for *Tinca tinca*. [R01]

The current picker [normalizes accents and punctuation, prefers complete word-phrase matches, and falls back to substring matching](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The current catalog has no result for any of the candidate queries below. The hypothetical row column is diagnostic only; it assumes the official paired display names and no aliases or forms.

| Query | Current results | Hypothetical `Tench / Tanche` row | Boundary |
|---|---|---|---|
| `tench` | No result | Tench row | Exact English display term. |
| `tanche` | No result | Tench row | Exact Québec Government / CFIA display term for *Tinca tinca*. OQLF’s exclusion of bare `tanche` from Cunner product labelling is scoped to *Tautogolabrus adspersus*. |
| `tanche-tautogue` | No result | No result | Not an alias for Tench; keep the Cunner hold and its full qualified term separate. |
| `Tinca tinca` | No result | No result | Do not add the scientific name as an alias solely to force a picker result. |
| `Eurasian tench` | No result | No result | Government source records this as another English name, but this review does not establish it as a Québec product label or need for a search alias. |

The projected `tanche` singleton would accurately reflect the official *Tinca tinca* display in the current catalog. If a distinct Cunner row is later accepted under its full OQLF display, the same short query would match both species-qualified terms, so retain both visible results and do not alias `tanche` to Cunner.

All **114 recipe paths** from the manifest and all **1,123 ingredient rows** were scanned for *Tinca tinca*, Tench, Tanche, the Government-listed variants, and Eurasian tench. The scan found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe supports a recipe link, form, measurement, or substitution for this fish. [R01]

## Source-ID and URL ownership

The proposed reference ID, candidate ID, and R652 source-ID prefix are unallocated. The exact Québec species-profile and OQLF GDT URLs have no exact source-URL owner in the shared ledger. The generic CFIA results URL has existing ledger owners; this proposal uses only a proposal-local citation for its species row and reuses the existing Fish List overview source ID for the labelling scope. No source or candidate record is being added to the ledger. [R01]

| ID | Source and locator | Evidence and ownership limit |
|---|---|---|
| **New proposal-local WP04-SECTIONP-TENCH-R652-20261018-S01** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), row for TSN 163348. | Lists *Tinca tinca* with English `Tench` and French `Tanche`. Generic results URL has existing ledger owners; this ID remains proposal-local and creates no shared ledger record. It establishes Canadian fish-list naming, not current retail availability. |
| **Reused WP04-FINFISH-GAPS-20261010-S11** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing shared source ID for Canadian fish-labelling name, scientific-name, and TSN scope. |
| **New proposal-local WP04-SECTIONP-TENCH-R652-20261018-S02** | Gouvernement du Québec, [Tanche species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/tanche), updated 2026-10-15. | Pairs Tanche / Tench / *Tinca tinca*; reports invasive status in Québec and permits fishers to keep a catch for their own consumption. It does not document a consumer product or commercial sale. Exact URL has no exact ledger owner. |
| **New proposal-local WP04-SECTIONP-TENCH-R652-20261018-S03** | OQLF, [GDT: tanche-tautogue, fiche 1198965](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198965/tanche-tautogue), updated 2012. | Identifies Cunner / *Tautogolabrus adspersus* and scopes the non-retention of bare `tanche` to Québec fish-product marketing for that species. Exact URL has no exact ledger owner. |
| **R01** | Read-only audit of active references/forms, legacy candidates, ledger and URL/source-ID ownership, Section P archive, picker code, manifest, all recipes, and targeted Canadian/Québec product searches. | Repository and search observations only; no shared catalog, ledger, plan, roadmap, package, or recipe file was modified. |

## Recommendation and remaining scope

**Hold Tench / *Tinca tinca* outside active catalog data.** CFIA and Gouvernement du Québec support the identity pair `Tench / Tanche` with the binomial. The Québec source also documents personal-consumption retention of a locally caught fish, which should not be conflated with a current Québec retail product or commercial culinary supply. The targeted product searches found no verifiable listing, and the corpus has no matching demand. OQLF’s Cunner fiche does not reverse the official Tench/Tanche pairing; it cautions against assigning bare `tanche` to Cunner. Together, this supports a source-bounded hold until recipe or market evidence justifies a bundled ingredient row.

This hold does not change the separate Catla, Rohu, common-carp, or Cunner decisions, and it does not close Section P’s broader finfish and regional-fish work. No form, measure, density, unit mapping, recipe link, conversion, yield, or substitution is proposed.

## Integration and static checks

- Passed UTF-8/no-BOM, replacement-character, and trailing-whitespace checks.
- Confirmed internal Markdown links resolve; external links point to CFIA, Gouvernement du Québec, and OQLF primary sources.
- Confirmed proposed IDs and the R652 source-ID prefix are absent from active references/forms, legacy candidates, and the shared ledger. Confirmed the specific Québec and OQLF URLs have no exact ledger owner, the generic CFIA results URL has existing owners, and CFIA overview source ID `WP04-FINFISH-GAPS-20261010-S11` is already shared.
- Recomputed current and hypothetical picker projections and scanned all 114 manifest-listed recipes / 1,123 ingredient rows; no candidate-specific demand was found.
- Updated the Section P nested checklist and progress record, `roadmap.md`, the workflow, and the R652 status. No active data, code, or recipes changed. No software tests, build, emulator, or deployment were run; this is a documentation-only hold.
