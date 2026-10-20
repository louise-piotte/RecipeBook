# WP04 Section P — Atlantic argentine / grande argentine picker-boundary review (R163)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** *Argentina silus*, Atlantic argentine / grande argentine.
- **Recommendation:** Hold the candidate outside active references and the shared research ledger. The bilingual species name is well supported, but the proposed display would make the broad query `argentine` return this candidate alone. CFIA also assigns `Argentine / Argentine` to *Argentina elongata*, and OQLF explicitly rejects unqualified `argentine` for Québec fish-product marketing. No current Québec product listing or bundled-recipe request resolves that boundary.
- **Scope:** A distinct finfish/name review under the open Section P checklist. It does not reopen Atlantic or European smelt, Atlantic herring, Atlantic argentine’s source-only fishery history, or any prior tuna, hake, grouper, or seafood-product decision.
- **Status:** Proposal-only. No shared catalog JSON, ledger, generated Kotlin, plan, roadmap, recipe, or batch README changed. No app, unit, instrumentation, build, emulator, or deployment tests were run.

## Parent checklist and earlier work

The active Section P checklist remains open at [the plan’s fish and seafood parent item](../../RecipeBook-global-ingredient-catalog-plan.txt#L5036). The live snapshot contains 1,538 active references, 119 forms, 61 legacy-import candidates, and 1,883 research-ledger records with 8,016 source entries / 6,859 distinct source IDs. Its manifest contains 114 recipe files and 1,123 ingredient rows.

A read-only search of the active plan, roadmap, proposal and batch archive, references, forms, legacy identities, ledger, and generated catalog found no dedicated *A. silus* allocation or prior focused review. Two ledger records contain the word `Argentine` only in unrelated evidence: a source about Argentine food-code rules in the Peruvian-cecina record, and Argentine Food Code evidence in the yerba-mate record. Neither record describes a fish. There is no active or legacy owner for the candidate’s names, binomial, or prospective ID.

The nearby active smelt identities remain distinct: **American smelt / éperlan** and **European smelt / éperlan européen**. Their broad `smelt` query returns two results. The candidate does not need `smelt`, `silver smelt`, or `herring smelt` as aliases; the latter terms are recorded by some sources but are not the preferred Québec product name.

## Identity, Québec naming, and market limits

OQLF’s GDT identifies *Argentina silus* in edible-fish terminology and normalizes **grande argentine** as the Québec French term. It gives English **argentine**, notes commercial potential in Québec, and says the unqualified French terms **argentine** and **saumon doré** were not retained for Québec fish-product marketing to avoid label confusion. The note about commercial potential is terminology context, not evidence of current inventory or a Québec consumer product. [S01]

TERMIUM Plus’s 2023 record gives **Atlantic argentine** as the commercial name recommended by the fisheries terminology committee and Fisheries and Oceans Canada, paired with standardized **grande argentine**. It also records `argentine`, `great silver smelt`, `silver smelt`, and `herring smelt` as correct English terms. Those variants do not override OQLF’s Québec display boundary or establish interchangeable products. [S02]

The CFIA Fish List result page pairs TSN 162064, *A. silus*, with **Atlantic Argentine / Grande Argentine**. The same list also pairs TSN 162069, *Argentina elongata*, with **Argentine / Argentine**. The Fish List is Canadian fish-labelling evidence; it is not a recipe-equivalence source. [S03]

ITIS independently treats *A. silus* (TSN 162064) as a valid species and lists Atlantic argentine / grande argentine as its common names. [S04]

Québec market evidence is limited. OQLF’s historic note says “commercial potential,” while the regional [Mange ton Saint-Laurent! profile](https://mangetonsaintlaurent.com/especes/grande-argentine/) reports no directed fishery for this species in the St. Lawrence and only rare incidental captures in the Gulf. The DFO offshore-fishery atlas describes historic harvest and sale for human consumption as well as fish meal; it is not a current consumer-market or retail source. A bounded search of current Québec retailer and processor pages for the exact bilingual names found no species-identified product. This does not establish that the fish is unavailable throughout Canada or Québec. [S05–S06]

## Exact ownership and source-ID audit

Normalized exact-key checks used the same lowercasing, Unicode compatibility decomposition, accent and punctuation folding, and whitespace normalization as [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). They covered reference IDs, displays and aliases; form IDs, labels and match terms; legacy IDs, names and aliases; and ledger record IDs plus identity decisions.

| Key or name | Active reference / form | Legacy candidate | Ledger identity | Finding |
|---|---|---|---|---|
| `Atlantic argentine`; `grande argentine`; *Argentina silus* | No exact owner or attached form | None | None | Unallocated species identity and display pair. |
| `ingredient-ref-atlantic-argentine`; `candidate-atlantic-argentine` | None | None | None | Prospective keys are not reserved. |
| `argentine`; `saumon doré`; `silver smelt`; `herring smelt`; `great silver smelt` | No exact owner | None | None | Keep these source variants out of aliases; OQLF rejects the short French marketing names, and broader variants would add avoidable ambiguity. |
| `ingredient-ref-american-smelt` | American smelt / éperlan | None | Existing, separate identity | Keep unchanged. |
| `ingredient-ref-european-smelt` | European smelt / éperlan européen | None | Existing, separate identity | Keep unchanged. |
| *Argentina elongata* / `Argentine` | No active fish row | None | None | CFIA’s distinct name/taxon is the reason a singleton `argentine` picker result is unsafe. |

No exact URL owner was found for OQLF, TERMIUM, ITIS, DFO’s offshore-fishery atlas, or Mange ton Saint-Laurent’s species page. The CFIA all-names results page is already represented in the ledger by `WP04-ABALONE-20261011-S02`; the CFIA Fish List overview is already represented by `WP04-FINFISH-GAPS-20261010-S11` and other existing source IDs. Reuse existing CFIA source IDs if their general scope is needed; do not duplicate them as new ledger sources.

The proposal-local prefix `WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-` was checked against all 6,859 distinct ledger source IDs and proposal/batch Markdown. No source or finding ID with this prefix has a prior owner. Because the recommendation is a hold, these proposal-local IDs are not allocated to the shared ledger.

## Picker projection

The projection follows the live picker order in `IngredientSearch.kt`: exact form terms, complete normalized word phrases across display/alias/form terms, then substring fallback. The hypothetical row has only the bilingual displays below and no aliases or forms.

| Query | Current result | With hypothetical `Atlantic argentine / grande argentine` row | Boundary |
|---|---|---|---|
| `Atlantic argentine` | None | Atlantic argentine / grande argentine | The qualified English name identifies *A. silus*. |
| `grande argentine` | None | Atlantic argentine / grande argentine | The preferred Québec French phrase identifies *A. silus*. |
| `argentine` | None | Atlantic argentine / grande argentine only | Misleading singleton: CFIA also uses `Argentine / Argentine` for *A. elongata*, which would have no second result to show. OQLF also rejects the short French label for Québec fish-product marketing. |
| `Argentina silus` | None | None | Do not add scientific names as aliases. |
| `Atlantic` | 15 references | The same 15 plus this candidate | Geographic search remains a multi-result list. |
| `smelt` | American smelt; European smelt | The same two | Keep the candidate out of the smelt group; do not add `smelt` aliases. |
| `silver smelt`; `herring smelt`; `saumon doré` | None | None | Do not attach non-preferred variants to this candidate. |

Empty aliases cannot prevent `argentine` from selecting the candidate because that word is part of both display names. The source-backed qualified name is therefore insufficient to make a safe active row in the current picker. Do not make an unqualified search appear resolved by silently choosing *A. silus*.

## Bundled-recipe demand

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and the complete parsed JSON text for each recipe were scanned for `Atlantic argentine`, `grande argentine`, `Argentina silus`, `argentine`, `silver smelt`, `herring smelt`, `great silver smelt`, and `saumon doré`.

**Result: zero matching files and zero matching ingredient rows.** No bundled request identifies this fish or supports a species-specific form, recipe link, portion, or substitution.

## Forms, measurements, conversions, yields, and substitutions

The terminology and Fish List sources establish names and taxonomy, not kitchen measurements. The DFO atlas discusses historic fishing and biological context, but supplies no reusable recipe portion, density, volume mapping, current package amount, or edible/cooking yield for an ingredient catalog. The regional St. Lawrence profile is fishery context, not a portion source.

The current forms package has no form attached to this candidate; the global and contextual substitution-rule files are empty. No reviewed recipe or culinary source supports replacing Atlantic argentine with smelt, herring, or another fish. Add no active form, density, mapping, measurement observation, conversion, yield, recipe link, or substitution finding while the identity is held. Do not infer culinary interchange from shared fish family, historic fish-meal use, or a source’s alternate common names.

## Proposed conditional shape

This is a future identity shape only, not an active reference, ledger candidate, or reserved ID. It is shown to make the picker problem reviewable; do not add it under the present search behavior.

```json
{
  "id": "ingredient-ref-atlantic-argentine",
  "nameEn": "Atlantic argentine",
  "nameFr": "grande argentine",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Reconsider only if the picker can retain a broader `argentine` result alongside the qualified identity, a second Argentine fish identity is reviewed as a pair, or a product naming change avoids the colliding token while preserving a source-supported Québec display.

## Sources

Sources were reviewed on 2026-10-16. Proposal-local source IDs below are unique to this review unless a source is explicitly marked as reused.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-S01** | Office québécois de la langue française, [GDT: grande argentine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199002/grande-argentine), last updated 2011. | Pairs *A. silus* with preferred Québec French `grande argentine` and English `argentine`; records commercial potential and explicitly says `argentine` / `saumon doré` were not retained for fish-product marketing. Terminology evidence, not current retail or supply evidence. |
| **WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-S02** | Government of Canada Translation Bureau, [TERMIUM Plus: Atlantic argentine](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=ATLANTIC+ARGENTINE), record dated 2023-01-04. | Recommends `Atlantic argentine` as a commercial fish name and gives standardized `grande argentine`; lists other correct English terms. Terminology evidence, not a current market listing, recipe, or measurement. |
| **WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-S03** | CFIA, [Fish List results](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | The result table pairs TSN 162064, *A. silus*, with `Atlantic Argentine / Grande Argentine`, and TSN 162069, *A. elongata*, with `Argentine / Argentine`. Reuse existing ledger IDs `WP04-ABALONE-20261011-S02` for the all-names result page and `WP04-FINFISH-GAPS-20261010-S11` for the overview; no duplicate ledger source is proposed. Fish-labelling evidence, not recipe or substitution guidance. |
| **WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-S04** | ITIS, [*Argentina silus* report, TSN 162064](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=162064). | Treats *A. silus* as a verified valid species and records Atlantic argentine / grande argentine. Taxonomy and common-name cross-check only. |
| **WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-S05** | Fisheries and Oceans Canada, [Canadian Atlantic Offshore Fishery Atlas: Grande argentine](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/110145.pdf), historical atlas. | Describes *A. silus* distribution and historic harvesting/use for human consumption and fish meal. It does not establish current Québec retail supply, current consumer demand, recipe measures, or substitution. |
| **WP04-SECTIONP-ATLANTIC-ARGENTINE-R163-20261016-S06** | Mange ton Saint-Laurent!, [Grande argentine](https://mangetonsaintlaurent.com/especes/grande-argentine/), accessed 2026-10-16. | Reports no directed fishery in the St. Lawrence and rare incidental captures in the Gulf. This is regional resource context, not a legal status or proof of absence from every Québec or Canadian market. |

## Static review record

- Read the active Section P checklist and R162 blackfin-tuna hold; searched the plan, roadmap, proposal/batch archive, active references, forms, legacy identities, ledger, and generated catalog for the candidate identity, variant names, taxon, and prospective IDs.
- Checked current snapshot counts: 1,538 references, 119 forms, 61 legacy candidates, 1,883 ledger records, 8,016 source entries, and 6,859 distinct source IDs.
- Reproduced the phrase-first picker projection from the live bilingual displays, aliases, forms, and `IngredientSearch.kt`; confirmed that `argentine` becomes a singleton while `smelt` stays a two-row result.
- Scanned all 114 manifest recipes, 1,123 ingredient rows, and complete parsed recipe JSON; no candidate phrase or binomial matched.
- Checked proposal-local source-ID prefix uniqueness and source URL ownership. Existing CFIA Fish List source IDs are reused where applicable; no new source or identity ID is allocated to the ledger.
- This proposal changes no database JSON, so no tests or emulator checks were run under the current `AGENTS.md` rule.
