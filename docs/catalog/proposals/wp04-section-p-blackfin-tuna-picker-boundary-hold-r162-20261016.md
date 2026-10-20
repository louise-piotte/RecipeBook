# WP04 Section P — blackfin tuna / thon à nageoires noires picker-boundary review (R162)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** *Thunnus atlanticus*, blackfin tuna / thon à nageoires noires.
- **Recommendation:** Hold the species outside active references and the research ledger. The bilingual identity is supported, but adding the English display would make the current `blackfin` query return this tuna alone even though CFIA assigns **Blackfin Sea Bass** to a different taxon. No bundled recipe or species-identified Québec product resolves that picker gap.
- **Scope:** This is a distinct finfish gap under the open Section P parent checklist. It does not reopen the generic `tuna / thon` reference, the existing tuna species identities, the *Lateolabrax latus* blackfin-sea-bass hold, or the R161 soft-shell-clam / `mye` review.
- **Status:** Proposal-only. No shared JSON, ledger, generated catalog, plan, roadmap, recipe, or batch README changed. No tests, build, emulator, or deployment work was run.

## Checklist and earlier work

The Section P parent checklist still includes tuna and regional fish ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5022)). The [R161 soft-shell-clam review](wp04-section-p-mye-commune-species-picker-boundary-review-r161-20261016.md) covers *Mya arenaria* only and has no relation to this finfish candidate.

A read-only search of the plan, proposal and batch archive, active references, forms, legacy identities, and ledger found no dedicated *T. atlanticus* decision, reference, form, or ledger identity. The broader tuna proposals cover other taxa and retain recipe 111's unqualified `1 tuna steak`; none assigns that line to blackfin tuna. The only nearby English name is **Blackfin Sea Bass / Bar à nageoires noires** for *Lateolabrax latus*, documented in the [black-sea-bass review](wp04-section-p-black-sea-bass-bar-noir-picker-boundary-review-20261013.md). That is a different fish and is not an existing active catalog result.

## Identity and Québec name evidence

The Gouvernement du Québec's current food-establishment page lists *Thunnus atlanticus* with the bilingual names **thon à nageoires noires / blackfin tuna**. The page is updated 2026-06-08. This review uses its table only as a Québec food-species name crosswalk; it does not apply the page's parasite-management or food-safety guidance to catalog behavior. [S01]

TERMIUM Plus places the name pair in the **Fish**, **Seafood and Freshwater Food**, and **Commercial Fishing** fields. Its 2023-01-04 record identifies *T. atlanticus* and marks **blackfin tuna** as the commercial name recommended by the fisheries terminology committee and Fisheries and Oceans Canada. It marks **thon à nageoires noires** as the standardized French commercial name. TERMIUM also lists **thon noir** as a correct French variant, but this review does not promote it as an alias because the qualified display is sufficient and the shorter name is not needed to identify the candidate. [S02]

ICCAT's species-identification chapter also pairs *Thunnus atlanticus* with **Blackfin tuna / Thon à nageoires noires**. TERMIUM records older taxonomic combinations including *Thunnus coretta* and *Parathunnus atlanticus*; these are source-level identity notes only, not proposed search aliases. [S02, S04]

These sources establish a species and a Québec-facing food name. The Québec government table is not a consumer package or current inventory listing, and no species-identified Québec retail package was located in this review. The proposal therefore makes no availability claim.

## Exact ownership and archive audit

The current snapshot contains **1,537 active references**, **119 forms**, **61 legacy-import candidates**, and **1,882 research-ledger records**. The recipe manifest lists **114 files / 1,123 ingredient rows**.

Normalized exact-key checks covered active reference IDs, display names and aliases; form IDs, labels and match terms; legacy IDs, names and aliases; and ledger record IDs. They found no current owner for `ingredient-ref-blackfin-tuna`, `candidate-blackfin-tuna`, `blackfin tuna`, `thon à nageoires noires`, `thon noir`, *Thunnus atlanticus*, *Thunnus coretta*, *Parathunnus atlanticus*, or *Thynnus atlanticus*. The existing `ingredient-ref-tuna` is the broad tuna identity; it does not allocate *T. atlanticus*. No form belongs to a blackfin-tuna identity.

Before R162 was drafted, the archive search found no dedicated blackfin-tuna proposal, candidate, or integration. It did find the separate CFIA naming record **Blackfin Sea Bass / Bar à nageoires noires** for *Lateolabrax latus* in the black-sea-bass proposal and in a fresh CFIA Fish List query. The two English names share the searchable component `blackfin`; they must not be merged or treated as synonyms. The R162 proposal-local source prefix `WP04-SECTIONP-BLACKFIN-TUNA-R162-20261016-` was absent from the ledger and archive before this file was drafted.

The exact Québec source URL below is already recorded in the ledger under three tuna identity records. Reuse those source IDs if the evidence is ever integrated; do not duplicate that source entry. The CFIA Fish List overview is also already ledgered on multiple fish records. R162 source labels in this proposal are proposal-local and do not allocate ledger IDs.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases match within display names before substring fallback. The hypothetical row has only its qualified bilingual display and no aliases. This is a static projection, not a UI test.

| Query | Current result | With a hypothetical `blackfin tuna / thon à nageoires noires` row | Boundary |
|---|---|---|---|
| `blackfin tuna` | None | Blackfin tuna / thon à nageoires noires | The qualified English phrase identifies *T. atlanticus*. |
| `thon à nageoires noires` | None | Blackfin tuna / thon à nageoires noires | The Québec French phrase identifies *T. atlanticus*. |
| `blackfin` | None | Blackfin tuna / thon à nageoires noires only | A misleading singleton: CFIA also assigns Blackfin Sea Bass / Bar à nageoires noires to *Lateolabrax latus*, which has no active row to present as the second choice. |
| `tuna`; `thon` | Eight references | Nine references | Broad tuna choices remain visible; the generic tuna row is preserved. |
| `Thunnus atlanticus`; `thon noir` | None | None | Do not add scientific names or the unneeded French variant as aliases. |

The bilingual identity itself is well supported, but the English display necessarily contains `blackfin`. Empty alias arrays cannot prevent the short query from selecting one species. The result would conceal the separate CFIA fish-name scope without a matching active identity. Keep the candidate unallocated until the picker can represent both identities or prevent the component query from appearing species-specific.

## Bundled-recipe demand

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and complete parsed recipe text were scanned for `blackfin tuna`, `blackfin`, `thon à nageoires noires`, `thon noir`, *Thunnus atlanticus*, *Thunnus coretta*, *Parathunnus atlanticus*, and *Thynnus atlanticus*.

**Result: zero matching files and zero matching ingredient rows.** Recipe 111 row 1 remains `1 tuna steak`, linked to `ingredient-ref-tuna`; it does not identify a tuna species. Do not link or relink it to blackfin tuna. No recipe-specific amount, form, or substitution can be inferred.

## Forms, measurements, conversions, yields, and substitutions

The active form package has no tuna-named forms. There is no species-specific form, default density, unit mapping, volume conversion, count-to-mass value, edible yield, or cooking yield for *T. atlanticus* in the reviewed sources. The Québec crosswalk and TERMIUM record provide names, not kitchen measurements.

The generic tuna ledger record contains separate source-reported steak mass intervals from an external sous-vide recipe; that observation does not specify species or edible-versus-as-purchased basis. Do not transfer it to *T. atlanticus* or to recipe 111. Other tuna-species portions are likewise not evidence for this species. The current global and contextual substitution-rule files contain no rules, and no reviewed source or bundled recipe supports a directed substitution involving blackfin tuna. Add no form, measurement, conversion, yield, recipe link, or substitution finding while the candidate is held.

## Proposed conditional shape

This is a future identity shape only. It is not an active row, ledger candidate, or reserved ID:

```json
{
  "id": "ingredient-ref-blackfin-tuna",
  "nameEn": "blackfin tuna",
  "nameFr": "thon à nageoires noires",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Do not add a reference or ledger candidate at this review. Reopen if search can show the separate Blackfin Sea Bass identity beside blackfin tuna, or if a bundled recipe/product supplies a species-qualified request and the picker boundary can be made clear. Keep `tuna / thon`, all existing tuna rows, and recipe 111 unchanged.

## Sources

Sources were reviewed on 2026-10-16. R162 IDs below are local to this proposal unless marked as reused ledger sources.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BLACKFIN-TUNA-R162-20261016-S01** | Gouvernement du Québec, [Risques associés à la consommation de poisson et exigences](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson), updated 2026-06-08. | Pairs *T. atlanticus* with `Thon à nageoires noires / Blackfin tuna` in a food-establishment species table. Used only for the name and species crosswalk. Reuse existing ledger source IDs `WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S02`, `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S02`, or `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S03`; no duplicate URL entry is needed. |
| **WP04-SECTIONP-BLACKFIN-TUNA-R162-20261016-S02** | Government of Canada Translation Bureau, [TERMIUM Plus: blackfin tuna](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=BLACKFIN+TUNA), record dated 2023-01-04. | In Fish / Seafood and Freshwater Food / Commercial Fishing fields, identifies *T. atlanticus*, recommends `blackfin tuna` as a commercial name, and records standardized `thon à nageoires noires`; also lists `thon noir` and older taxonomic combinations. Terminology evidence, not current Québec inventory, recipe, or measure evidence. No exact source URL owner was found in the ledger. |
| **WP04-SECTIONP-BLACKFIN-TUNA-R162-20261016-S03** | CFIA, [Fish List search for Blackfin Sea Bass](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Blackfin%20Sea%20Bass) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Current search result assigns `Blackfin Sea Bass / Bar à nageoires noires` to *Lateolabrax latus* (TSN 643281). The Fish List overview says it supplies accepted English/French fish-label names and associated taxa. This proves a second taxon uses the `Blackfin` name component; it does not make the fish a tuna synonym or a recipe substitute. Reuse the existing ledgered CFIA overview source `WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S02` if needed. |
| **WP04-SECTIONP-BLACKFIN-TUNA-R162-20261016-S04** | International Commission for the Conservation of Atlantic Tunas (ICCAT), [Blackfin Tuna species-identification chapter](https://www.iccat.int/Documents/SCRS/Manual/CH2/2_1_10_7_BLF_FRA.pdf), last updated 2021-06. | Identifies *Thunnus atlanticus* (ICCAT code BLF) and pairs `Blackfin tuna / Thon à nageoires noires`; lists taxonomic synonyms and regional vernaculars. Species and name evidence only, not a Québec product listing or kitchen measure. |

## Static review record

- Re-read the current Section P fish checklist, the R161 clam hold, tuna identity/scope records, current references/forms, legacy identities, ledger, manifest, and proposal/batch archive.
- Reproduced current picker results from the live reference/form data: `tuna` and `thon` each return eight rows, while `blackfin` returns none; the hypothetical display would add a sole `blackfin` result.
- Scanned the full 114-file manifest corpus and all 1,123 ingredient rows; no blackfin-tuna phrase or binomial demand was found.
- Before drafting, checked exact names, IDs, taxonomic spellings, form terms, ledger identities, source URLs, source-ID prefix, and prior proposal/batch names. The only nearby taxon is the separate CFIA-named Blackfin Sea Bass.
- This proposal changes documentation only. No unit, instrumentation, Gradle, emulator, build, or deployment tests were run.
