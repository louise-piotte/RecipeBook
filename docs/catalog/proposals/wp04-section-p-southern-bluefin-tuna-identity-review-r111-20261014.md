# WP04 Section P R111 — Southern bluefin tuna identity review

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only species identity, bilingual naming, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Add a separate identity-only `Southern bluefin tuna / thon rouge du Sud` reference for *Thunnus maccoyii*, with no aliases, forms, or numeric data. This is the third bluefin taxon left outside the accepted Atlantic/Pacific pair in R110.
- **Status:** Integrated by root on 2026-10-14 as an identity-only reference with source records. See the [R111 batch README](../batches/wp04-section-p-southern-bluefin-tuna-identity-integration-20261014/README.md). The proposal's source snapshot below predates integration.

## Scope and decision

The current [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4737) records the R101 Atlantic-bluefin hold and the later [R110 paired Atlantic/Pacific integration](../batches/wp04-section-p-bluefin-paired-identity-integration-20261014/README.md). R110 says explicitly that *T. maccoyii* is a distinct third taxon and is outside that pair. This review takes up only that species. It does not reopen the accepted Atlantic and Pacific rows, the yellowfin identity, the generic tuna identity, or recipe 111.

The CFIA Fish List assigns TSN 172431 to *Thunnus maccoyii*. Its tuna query returns `Southern Bluefin Tuna / Thon` and, on a separate bilingual-name row for the same taxon, `Tuna / Thon Rouge Du Sud`. The Québec government's current fish table and TERMIUM Plus both give the qualified pair `Southern bluefin tuna / thon rouge du Sud`. The qualified pair is the clearest catalog display: it names the species and keeps the shared terms searchable across multiple results.

The [R110 picker review](wp04-section-p-bluefin-paired-picker-review-r110-20261014.md) resolved the R101 singleton problem with two alias-free rows. Adding a third row whose displayed names contain `bluefin` and `thon rouge` preserves the intended broad results: both broad searches return all three bluefin taxa. It also gives the Southern taxon a distinct, directly searchable pair. No name change to either existing row is needed.

## Naming evidence and limits

CFIA identifies *T. maccoyii* separately from *T. thynnus* (TSN 172421) and *T. orientalis* (TSN 172422). In its tuna-query output, CFIA associates the Southern taxon with the English name `Southern Bluefin Tuna` and French `Thon`, then with English `Tuna` and French `Thon Rouge Du Sud`. The repeated rows are associated with the Fish List's hazard fields; they are not additional taxa. CFIA therefore supports both qualified names but does not place them together on one bilingual row in this query.

The [Québec government fish table](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson) directly pairs *Thunnus maccoyii* with `Thon rouge du Sud / Southern bluefin tuna`. Its page concerns parasite-risk controls for fish served raw or partly cooked; this review uses only its bilingual taxon row as naming evidence. TERMIUM Plus record 76, dated 2010-04-08, independently records *T. maccoyii* as `southern bluefin tuna / thon rouge du Sud`.

OQLF's GDT entry for [thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge), last updated in 2012, maps the unqualified term to *T. thynnus* and reflects the older treatment of Atlantic and Pacific fish as commercially undistinguished subspecies. It does not name *T. maccoyii*. DFO's bilingual [Bluefin Tuna / Thon rouge profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-eng.html) likewise identifies *T. thynnus*. These sources support retaining the geographic qualifier `du Sud`; they are not grounds to shorten this row to `thon rouge`.

Federal Canadian naming references also distinguish the species: the archived Fish Inspection Regulations list *T. maccoyii* as `thon rouge du sud` for canned tuna, and a 2017 Canada Gazette proposed regulatory table prints `Southern Bluefin Tuna / thon rouge du sud`. The Gazette item is proposed text and the archived regulation is limited to canned tuna, so neither is treated as the current fresh-fish naming standard. The current CFIA list and current Québec table carry the main naming decision.

Québec market material reviewed for R110 uses broad `Bluefin` / `Thon Bluefin` wording for products whose taxon is either Atlantic or Pacific, without naming Southern bluefin. A Toronto sushi-bar page lists Southern bluefin as one recognized tuna variety, while its surrounding product description refers generally to Bluefin and does not establish that its current offering is *T. maccoyii*. This is limited market-language context, not proof of a Québec retail item, supplier identity, or stock.

## Ownership and prior-work audit

The read-only ownership snapshot contains **1,452 active references**, **105 forms**, **63 legacy-import candidates**, and **1,792 research-ledger records**. The four active tuna references are:

- `ingredient-ref-tuna` — `tuna / thon`;
- `ingredient-ref-yellowfin-tuna` — `yellowfin tuna / thon à nageoires jaunes`;
- `ingredient-ref-atlantic-bluefin-tuna` — `Atlantic bluefin tuna / thon rouge de l’Atlantique`;
- `ingredient-ref-pacific-bluefin-tuna` — `Pacific bluefin tuna / thon rouge du Pacifique`.

No active reference, form, legacy candidate, or dedicated ledger record owns `ingredient-ref-southern-bluefin-tuna`, `Southern bluefin tuna`, `thon rouge du Sud`, or *Thunnus maccoyii*. The ledger's `candidate-wp04-tuna-species-scope` covers the unresolved species ambiguity of the generic tuna recipe line; it is not a Southern-bluefin identity decision. R110's proposal and integration README mention *T. maccoyii* only to reserve it for this separate review. The proposal-local source-ID prefix `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-` has no prior owner in the ledger or proposal/batch archive.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes bilingual display names and aliases, returns complete normalized word-phrase matches when present, and uses substring fallback otherwise. The proposed row adds no aliases; its displayed names already contain the qualified phrases and the shared broad terms.

| Query | Current result | With proposed row | Result behavior |
|---|---|---|---|
| `Southern bluefin tuna`, `Southern bluefin` | None | Southern bluefin tuna / thon rouge du Sud | One qualified result. |
| `thon rouge du Sud` | None | Southern bluefin tuna / thon rouge du Sud | One qualified Québec French result. |
| `bluefin`, `bluefin tuna` | Atlantic and Pacific bluefin | Atlantic, Pacific, and Southern bluefin | Broad search stays visibly multi-result. |
| `thon rouge` | Atlantic and Pacific bluefin | Atlantic, Pacific, and Southern bluefin | Broad search stays visibly multi-result. |
| `tuna`, `thon` | Generic tuna, yellowfin, Atlantic bluefin, and Pacific bluefin | Those four plus Southern bluefin | Generic tuna remains available among the species rows. |
| `Thunnus maccoyii` | None | None | The binomial is source-level taxonomy, not a proposed search alias. |

The display names should be `Southern bluefin tuna / thon rouge du Sud`, with both alias arrays empty. Do not add bare `bluefin`, `bluefin tuna`, `tuna`, `thon`, or `thon rouge` as aliases; the shared terms already match all three displays. Keep both accepted Atlantic/Pacific rows unchanged.

## Bundled recipe demand

The manifest-listed bundle scan covered **114 recipe files, 1,123 ingredient rows, and 753,928 recipe-file bytes**. It found zero full-file or ingredient-row hits for `Southern bluefin tuna`, `Southern bluefin`, `thon rouge du Sud`, *Thunnus maccoyii*, `bluefin`, `bluefin tuna`, or `thon rouge`.

Recipe 111's only tuna ingredient remains `1 tuna steak`, with `ingredientName: "tuna"`, `ingredientRefId: "ingredient-ref-tuna"`, and a count quantity of 1. It gives no species or weight. Keep this line and the generic tuna reference unchanged; no recipe-specific evidence supports linking it to *T. maccoyii*.

## Measurement and substitution limits

Health Canada's CNF food code 3079 describes `Fish, tuna, bluefin, fresh, raw` and gives a 90 g Food Guide serving. It does not distinguish species, so do not transfer that serving to Southern bluefin. The current generic tuna ledger entry records an Anova source observation of two tuna steaks at 10–12 oz / 280–320 g each; that source does not identify species or make recipe 111's one-count ingredient a weighed portion. R110's Québec supplier size bands concern Atlantic and Pacific whole-fish products, not *T. maccoyii* or kitchen portions. Transfer none of these values or grades.

No reviewed source provides a Southern-bluefin density, household measure, unit mapping, count-to-mass value, edible yield, cooking yield, package rule, or recipe portion. Add no form or active numeric data. The reviewed recipe and market evidence supplies no dish-, role-, or method-scoped substitution rule between Southern bluefin, the other bluefin taxa, generic tuna, or other fish. Add no substitution; if this proposal is later accepted, keep substitution research `not_yet_researched` until a focused review supports a narrower finding.

## Proposed exact reference shape

This is a proposal, not an integrated row:

```json
{
  "id": "ingredient-ref-southern-bluefin-tuna",
  "nameEn": "Southern bluefin tuna",
  "nameFr": "thon rouge du Sud",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
```

No form, measurement observation, recipe link, conversion, yield, package rule, or substitution is proposed. Section P remains open.

## Source register

Sources were accessed or rechecked on 2026-10-14. These IDs are proposal-local only; no ledger source records were added.

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S01` | CFIA, [Fish List tuna query](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna), modified 2023-09-18. | TSN 172431, *T. maccoyii*, `Southern Bluefin Tuna / Thon`, and a separate `Tuna / Thon Rouge Du Sud` row. Fish-label naming and taxon evidence; not recipe intent. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S02` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), modified 2019-06-28. | Explains that the list supplies Canadian English/French fish common names and corresponding scientific names/TSNs. It does not identify a recipe ingredient's species. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S03` | Gouvernement du Québec, [Risques associés à la consommation de poisson et exigences](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson). | Current table pairs *T. maccoyii* with `Thon rouge du Sud / Southern bluefin tuna`. Used for naming only; the page addresses parasite-risk controls, not recipe measure or substitution. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S04` | Translation Bureau, [TERMIUM Plus query for *Thunnus maccoyii*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=THUNNUS+MACCOYII), record 76 dated 2010-04-08. | Gives `southern bluefin tuna / thon rouge du Sud` for the binomial. Terminology evidence, not current supply. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S05` | OQLF, [GDT: thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge), last updated 2012. | Associates unqualified `thon rouge` with *T. thynnus* and an older Atlantic/Pacific subspecies treatment. Does not name *T. maccoyii*; supports retaining `du Sud`. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S06` | Fisheries and Oceans Canada, [Bluefin Tuna](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-eng.html) and [Thon rouge](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-fra.html), modified 2018-06-07. | Bilingual profile identifies *T. thynnus* / Atlantic bluefin. Relevant to keeping that accepted row scoped; it is not a Southern-bluefin profile. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S07` | Department of Justice Canada, [archived Fish Inspection Regulations, section 47](https://laws-lois.justice.gc.ca/fra/reglements/c.r.c.%2C_ch._802/20070801/P1TT3xt3.html). | Lists *T. maccoyii* as `thon rouge du sud` for canned tuna. Archived and product-scoped evidence, not the current fresh-fish naming standard. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S08` | Canada Gazette, [Safe Food for Canadians Regulations proposal, Part I — English](https://gazette.gc.ca/rp-pr/p1/2017/2017-01-21/html/reg1-eng.html) and [French](https://gazette.gc.ca/rp-pr/p1/2017/2017-01-21/html/reg1-fra.html), tuna table. | The parallel proposed tables pair *T. maccoyii* with `Southern Bluefin Tuna / thon rouge du sud`. Historical proposal; not represented here as current regulation. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S09` | Health Canada, [CNF serving portion 3079](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3079), modified 2019-03-01. | Gives a 90 g serving for generic raw bluefin tuna. No species distinction; do not assign to this row. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S10` | Anova Culinary, [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna); existing generic observation in the `ingredient-ref-tuna` ledger record. | Reports two steaks, each 10–12 oz / 280–320 g. No species or cut state is specified; retain the observation on generic tuna only and do not convert recipe 111's count. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S11` | YASU Toronto, [Our Fish](https://yasu-sushibar.com/menu.html). | Lists Southern bluefin among tuna varieties; the page separately says it uses Bluefin without tying a current product or portion to *T. maccoyii*. Market-language context only. |
| `WP04-SECTIONP-SOUTHERN-BLUEFIN-R111-20261014-S12` | Québec market examples: Poissonnerie La Mer, [Thon Bluefin listings](https://www.lamer.ca/collections/poissons?page=2); JANS Seafood, [products](https://www.jansseafood.ca/all-products). | La Mer uses broad Bluefin wording without a Latin name; R110 documents JANS's Atlantic and Pacific taxa under broad `Bluefin`. Neither is Southern-bluefin evidence or a transferable grade/portion. |

## Static review record

- Re-read the current Section P plan, R101 hold, R110 paired proposal and integration README, current tuna reference/form/legacy files, research ledger, recipe manifest, and `IngredientSearch.kt`.
- Checked the proposed ID, English/French names, binomial, and proposal-local source-ID prefix against current references, forms, legacy candidates, ledger, and proposal/batch archive. No active owner or prior dedicated Southern-bluefin decision was found; R110's explicit out-of-scope note was retained as prior context.
- Projected picker results from the current active data using the local word-phrase matching logic. This is a static projection, not a UI test.
- Scanned all 114 manifest-listed recipe files (1,123 ingredient rows) for Southern-bluefin names, the binomial, `bluefin`, and `thon rouge`; found no matches. Recipe 111 remains on generic `ingredient-ref-tuna`.
- Rechecked that the proposal is UTF-8 without a BOM and has a final newline. No tests or emulator checks were run; this task is proposal-only.
