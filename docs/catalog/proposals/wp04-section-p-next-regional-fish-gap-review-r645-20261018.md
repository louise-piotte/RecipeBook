# WP04 Section P R645 — Blue Runner / *Caranx crysos* identity review

- **Status:** Accepted and integrated on 2026-10-18 as identity-only `blue runner / carangue jaune` for *Caranx crysos*.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** The broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6552).
- **Candidate:** Blue Runner, *Caranx crysos* (CFIA TSN 168612).
- **Recommendation:** Advance one bounded, identity-only protein reference using English **blue runner** and Québec French **carangue jaune**, with no aliases. CFIA pairs Blue Runner with *C. crysos*. OQLF independently links the English term to the same scientific name, identifies the fish as edible, calls it a species with commercial potential in Québec, and selects carangue jaune for Québec fish-product commercialization.
- **Scope:** This is a species identity review, distinct from the recent bream, snakehead, Catla, Mrigal, gilthead-bream, *Seriola rivoliana*, searobin, and Bowfin decisions. It does not propose a Carangidae/Jack group, a fish form, or a current Québec inventory claim.

## Identity, Québec naming, and regional evidence

The CFIA Fish List query returns TSN 168612, *Caranx crysos*, with the English name **Blue Runner** and French name **Carangue Coubali**. It also has a separate *Caranx* genus row labelled Jack / Carangue, and separate species rows such as *C. hippos* / Crevalle Jack / Carangue Crevalle. Keep the proposed row at *C. crysos* scope; do not infer a generic Jack or Carangue market group from those nearby entries. CFIA's histamine risk grouping is source context only; no handling or hazard rule is proposed. [S01; reused S06]

OQLF's GDT fiche 1199021 is classified under ichthyology and edible fish, pairs **blue runner** with *Caranx crysos*, and describes the species as having commercial potential in Québec. Its preferred French fish-product term is **carangue jaune**. OQLF records **carangue coubali** as a term used in some contexts, then explicitly says that term was not retained by the fish-product terminology committee. Use the Québec-normalized term for the French display; do not add CFIA's Carangue Coubali as an alias. [S02]

A 2014 primary research report by Devine et al. records about 21 *C. crysos* specimens caught by commercial fishermen at two sites off southern Newfoundland in August–September 2013. The authors call these the first records in Newfoundland waters and discuss possible northward range expansion. This is dated regional capture evidence, not proof of a present fishery, current retail inventory, or a kitchen amount. [S03]

Seacore Seafood Inc., a Canadian wholesaler based in Vaughan, Ontario, currently has a first-party product page headed **Blue Runner**. The page prints the binomial as **Caranx crysops**, a spelling that does not match the candidate taxon, and gives two origin statements whose relationship is unclear (“Caught in Eastern Canada in the Atlantic Ocean” and “Product of U.S.A.”). Treat the page only as evidence that a Canadian supplier uses the trade name; do not use it to identify the SKU as *C. crysos*, establish its origin, or add a whole/fresh/frozen/wild form. [S04]

OQLF also lists **yellow jack** and **hard tail** among English terms. Do not add these as picker aliases: the Canadian English primary term Blue Runner already identifies the row, and the secondary terms are unnecessary for selection. The Guadeloupe government fishing decree pairs **Yellow jack / Carangue jaune** with *Caranx bartholomaei*, showing why regional names should not be promoted as universal aliases. Keep the French display scoped to OQLF's Québec product terminology and exclude **yellow jack** and **hard tail** from the English aliases. [S02, S05]

## Exact proposed catalog delta

If accepted, add only this identity-only PROTEIN reference:

    {
      "id": "ingredient-ref-blue-runner",
      "nameFr": "carangue jaune",
      "nameEn": "blue runner",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-18T00:00:00Z",
      "category": "PROTEIN"
    }

Do not add **carangue coubali**, **yellow jack**, **hard tail**, the genus-level **jack / carangue**, or the scientific binomial as picker aliases. Add no form, measure, density, unit mapping, package yield, conversion, recipe link, or substitution. The CFIA risk-group note is not encoded as a handling rule.

## Active ownership, picker behavior, and recipe demand

The read-only audit covered the current active references and forms, legacy-import identities, research ledger, Section P plan, recent proposal/integration archive, IngredientSearch.kt, the bundled recipe manifest, and every manifest-listed recipe. The current package has **1,832 active references**, **161 forms**, **56 legacy candidates**, **2,203 research-ledger records**, and **114 bundled recipes with 1,123 structured ingredient rows**.

No active reference, form, legacy candidate, or ledger record owns *Caranx crysos*, **Blue Runner**, **carangue jaune**, **carangue coubali**, **yellow jack**, **hard tail**, ingredient-ref-blue-runner, candidate-blue-runner, or the R645 source-ID prefix. The only prior archive mention of “blue runner” is the Bluefish review's incidental excluded-query string; that review did not investigate *C. crysos*. The candidate is distinct from the already integrated Bluefish / *Pomatomus saltatrix*. [R01]

The query projection follows the current [ingredient picker search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, punctuation, and compatibility characters, prefers complete word phrases, then falls back to substring matching.

| Query | Current results | With the proposed row | Boundary |
|---|---|---|---|
| *blue runner*; *carangue jaune* | No result | One Blue Runner / carangue jaune result | Each source-qualified phrase reaches the bounded species identity. |
| *carangue* | No result | One result, visibly named carangue jaune | A token query returns the qualified term; this is not a genus-level market group. |
| *blue* | 7 results | The same 7 plus Blue Runner | Remains a broad multi-result query. |
| *runner* | Scarlet runner beans | Scarlet runner beans and Blue Runner | Remains ambiguous; no plain runner alias is added. |
| *carangue coubali*; *yellow jack*; *hard tail*; *Caranx crysos* | No result | No result | The OQLF non-retained French term, secondary English translations, and binomial remain outside picker aliases. |

The manifest-ordered corpus audit searched complete recipe JSON text and ingredient-row values in **all 114 recipe files and 1,123 structured ingredient rows** for *Caranx crysos*, Blue Runner, carangue jaune, carangue coubali, yellow jack, hard tail, runner, and related spelling variants. It found **zero matching recipe files and zero matching ingredient rows**. The bundle supports no candidate-specific recipe demand, amount, preparation, form, conversion, or substitution. [R01]

## Source-ID and URL ownership

The proposed reference ID is unallocated in the active references, forms, and legacy-import identity list. The source-ID prefix WP04-SECTIONP-BLUE-RUNNER-R645-20261018-S01 through S05 has no owner in the shared research ledger. The exact CFIA Blue Runner query, OQLF fiche, Devine DOI, Seacore product page, and Guadeloupe decree URLs have no exact URL owner in the ledger. Do not reuse the separate CFIA q=Blue source IDs, which are scoped to other fish. Reuse the existing shared Fish List overview source ID for its general Canadian-labelling scope. [R01]

| ID | Source and locator | Evidence and ownership limit |
|---|---|---|
| **New WP04-SECTIONP-BLUE-RUNNER-R645-20261018-S01** | CFIA, [Fish List query for Blue Runner](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp?cmbIn=e&lang=e&q=Blue+Runner). | Result lists TSN 168612, *Caranx crysos*, Blue Runner / Carangue Coubali, Carangidae, and a histamine risk group. The exact query URL has no owner; the generic q=Blue query has other fish owners and is not reused. |
| **New WP04-SECTIONP-BLUE-RUNNER-R645-20261018-S02** | OQLF, [GDT: carangue jaune, fiche 1199021](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199021/carangue-jaune). | Exact fiche URL has no owner. Québec edible-fish terminology and commercial-potential note; not current retailer inventory. |
| **New WP04-SECTIONP-BLUE-RUNNER-R645-20261018-S03** | Devine et al., [First records of the blue runner *Caranx crysos* in Newfoundland waters](https://doi.org/10.1111/jfb.12438), *Journal of Fish Biology* 85(2), 2014. | DOI URL has no owner. Primary research documenting the dated commercial-fisher catches; not present-day supply evidence. |
| **New WP04-SECTIONP-BLUE-RUNNER-R645-20261018-S04** | Seacore Seafood Inc., [Blue Runner product page](https://www.seacoreseafood.com/product/Blue_Runner). | Exact URL has no owner. Canadian vendor trade-name evidence only; its printed *Caranx crysops* spelling and unreconciled origin statements do not establish the SKU's taxon or origin. |
| **New WP04-SECTIONP-BLUE-RUNNER-R645-20261018-S05** | Préfecture de la région Guadeloupe / DEAL, [Arrêté DM pêche de loisir du 20 août 2019](https://www.dm.guadeloupe.developpement-durable.gouv.fr/IMG/pdf/arrete_dm_peche_de_loisir_20-08-2019.pdf), annexed species table. | Exact URL has no owner. Cross-jurisdiction naming context for excluding yellow jack as an alias; it does not override Québec's OQLF term. |
| **Reused WP04-FINFISH-GAPS-20261010-S11** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing shared owner for the Fish List's Canadian food-labelling scope. Reuse the source ID; it does not establish current market stock. |
| **R01** | Read-only audit of package JSON, ledger/source ownership, legacy list, Section P plan, archive, picker implementation, manifest, and all bundled recipes. | Repository evidence only; no shared file was modified. |

## Recommendation and remaining scope

**Advance the bounded identity** for *Caranx crysos* as **blue runner / carangue jaune**, with empty alias arrays and no numeric or recipe behavior. CFIA and OQLF support the species and bilingual identity; OQLF resolves the Québec product name despite CFIA's non-retained French form. The Canadian supplier page supports the market name only because its binomial is misspelled; the Newfoundland paper is historical regional catch evidence, not a present supply claim. Keep secondary terms out of the picker and preserve the broad *runner* result as visibly ambiguous.

This proposal does not resolve remaining finfish and regional-fish gaps under Section P, nor does it add measurement, form, conversion, yield, or substitution evidence.

## Proposal-only static checks

- Passed UTF-8/no-BOM, replacement-character, and trailing-whitespace checks.
- Parsed the indented JSON delta and confirmed it matches the bounded identity-only recommendation.
- Resolved every relative Markdown link; confirmed the proposed reference/source IDs and exact source URLs have no ledger owner.
- Recomputed the picker query projection and scanned all 114 manifest recipes / 1,123 ingredient rows; no candidate-term hits were found.
- No shared files were changed. No app tests, build, emulator, or deployment were run because this is proposal-only documentation work and the applicable AGENTS.md rule exempts database-JSON-only additions from software tests.

## Root integration review

- Confirmed CFIA's result pairs Blue Runner with *Caranx crysos* and OQLF pairs that same taxon with the Québec preferred fish-product term `carangue jaune`; OQLF explicitly says `carangue coubali` was not retained.
- Kept English/French aliases empty. The Seacore page's printed *Caranx crysops* spelling and conflicting origin statements are supplier-name context only; the Guadeloupe table's `Yellow jack / Carangue jaune` pair for *C. bartholomaei* further supports excluding `yellow jack` as a universal alias.
- Added no form, numeric behavior, recipe link, or substitution. Static package, generated-index, ledger-schema, source ownership, picker projection, recipe-corpus, encoding, local-link, and scoped-whitespace checks passed. No software tests were run because this update only adds database JSON data under `AGENTS.md`.
