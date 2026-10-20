# WP04 Section P — grouper / mérou multi-species market group review (R680)

- **Review and source-check date:** 2026-10-18.
- **Open checklist:** Section P finfish coverage, including grouper, remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6705).
- **Candidate:** the broad market name `grouper / mérou`, represented as a visibly multi-species group.
- **Recommendation:** integrate one identity-only market-name group, `grouper (name used for multiple fish species) / mérou (nom utilisé pour plusieurs espèces de poissons)`, under `ingredient-ref-grouper-market-group`.
- **Limit:** this row represents the broad name only. It does not assert that grouper species are interchangeable, identify a taxon, or revise the separate R97 hold on Red Grouper / *Epinephelus morio*.
- **Shared-data effect:** proposal only. No catalog, ledger, recipe, manifest, plan, workflow, or roadmap data changed. No tests were run.

## Why this is distinct from prior work

The older finfish review held bare snapper and grouper terms rather than allocate them to one species. R97 then held the species-specific Red Grouper / *Epinephelus morio* row because its qualified label would capture broad `grouper / mérou` searches. Neither decision reviewed a **species-neutral market group with a visible multi-species qualifier**. Later Section P decisions use that bounded representation for bream, sea bream, flounder, sole, and mrigal. This proposal applies the existing market-group pattern to the still-open broad grouper term; the R97 species hold remains unchanged.

The CFIA Fish List assigns `Grouper` and, across multiple taxa, `Mérou` wording to several fish. OQLF defines Québec `mérou` broadly for edible fish in the Serranidae family, particularly *Epinephelus* and *Mycteroperca*. These sources support a broad name group, not a culinary-equivalence class. Current Montréal retailer evidence includes a grouper-fillet listing without a binomial and a dated bilingual arrival-list line `FILET DE MEROU NOIR / BLACK GROUPER FILLET`, also without a binomial. Keep that species-flavoured product wording out of the generic row’s aliases and forms.

## Pre-integration owner snapshot and exact picker effect

At proposal time, prospective ID `ingredient-ref-grouper-market-group` was absent from active references, forms, legacy candidates, and ledger record IDs. The package snapshot had **1,837 ingredient references and 169 forms**. Exact normalized phrase checks against the then-active reference names, aliases, and attached form terms found no owner for `grouper`, `mérou`, `red grouper`, `mérou nègre`, `black grouper`, or `mérou noir`. The R680 group has since been integrated; the table below records its pre-integration picker projection.

| Query | Current result | With the proposed row | Boundary |
|---|---|---|---|
| `grouper` | None | `grouper (name used for multiple fish species)` only | The visible qualifier says the query is not species-resolved. |
| `mérou` | None | `mérou (nom utilisé pour plusieurs espèces de poissons)` only | Uses the OQLF-preferred Québec term and makes its broad scope visible. |
| `red grouper`, `mérou nègre` | None | None | Keep the species-specific R97 candidate held. |
| `black grouper`, `mérou noir` | None | None | Do not infer a species or add the local supplier phrase as an alias. |

The projection follows the live phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Only the generic display terms are proposed; aliases stay empty. This is a static catalog projection, not a UI or software test.

If accepted, the bounded row is:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-grouper-market-group` |
| English / fr-CA display | `grouper (name used for multiple fish species)` / `mérou (nom utilisé pour plusieurs espèces de poissons)` |
| Category | `PROTEIN` |
| Aliases | `aliasesEn: []`; `aliasesFr: []` |
| Numeric data | `defaultDensity: null`; `unitMappings: []` |
| Forms / recipe links / substitutions | None |

Do not add a taxonomic family as a catalog field or treat the group as a substitution rule. Keep Red Grouper, Black Grouper, and other species-specific product claims outside this group unless each is separately reviewed with a Québec-facing name and safe picker behavior.

## Full bundled recipe-demand audit

I scanned all **114 manifest-listed recipe files** and **1,123 ingredient rows**, including all parsed bilingual ingredient data, notes, instructions, titles, and source fields. Search terms were `grouper`, `groupers`, `mérou`, `red grouper`, `mérou nègre`, `black grouper`, `mérou noir`, `Epinephelus`, `Serranidae`, and `Mycteroperca`.

- **Matching recipe files:** 0.
- **Matching ingredient rows:** 0.
- **Recipe links, amounts, or product forms supported:** none.

Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`. Manifest-ordered recipe-content SHA-256: `0c7d87b2072bc9f3b00d613618792ad773f8b7f63b5b00d339d2e6f1ac31f669`.

## Forms, measures, and substitutions

MTL Meats’ current Montréal listing describes grouper fillets, approximately 1.8 kg per box, delivered frozen across Greater Montréal. That box amount is supplier-specific, and the indexed listing provides no scientific name or French label. The La Mer supplier sheet identifies a `filet de mérou noir / black grouper fillet` line and uses `KG` as its sales unit. Its product wording is not a generic grouper form, and its sales unit is not a kitchen measure. The supplier list is dated 2026-04-28 and does not establish continuing stock or the product’s scientific identity.

No bundled recipe requests grouper, no source supplies a reusable household measure for the broad group, and no source establishes an ingredient replacement. If integrated, record identity as verified and measurement/substitution research as researched with no supported value or substitute. Add no form, density, unit mapping, conversion, yield, recipe link, or global/contextual substitution.

## Source-ID and URL ownership

The proposal filename, proposed reference ID, R680 source prefix, and MTL Meats URL were free when this proposal was drafted. R680-S01 now owns that product-page URL. The La Mer, grouper-query, and OQLF URLs had proposal owners, so this review reused their source IDs. Exact ledger checks at proposal time found no owners for those three URLs. Integration later added Health Canada source R680-S02 and attached these sources to the accepted grouper record.

| Source ID | Source and locator | Existing ownership and limits |
|---|---|---|
| `WP04-SECTIONP-GROUPER-MARKET-GROUP-R680-20261018-S01` | MTL Meats, [Grouper](https://mtlmeats.ca/products/grouper), current Greater Montréal delivery listing. | New source ID and URL; no existing ledger or proposal owner. Search-indexed page text retrieved 2026-10-18 describes wild-caught grouper fillets, an approximately 1.8 kg box, and frozen delivery across Greater Montréal. Direct page retrieval returned a cache miss, so this is limited retailer evidence; it supplies no binomial, French label, or reusable recipe amount. |
| `WP04-SECTIONP-GROUPER-MARKET-GROUP-R680-20261018-S02` | Health Canada, [Updating the Existing Risk Management Strategy for Mercury in Retail Fish](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/hpfb-dgpsa/pdf/nutrition/risk-risque_strat-eng.pdf), March 2007, Section 3.4.3. | Added during integration after the proposal's direct CFIA search page was inaccessible in the web reader. The federal report summarizes the CFIA Fish List as applying grouper wording to several Serranidae taxa, including multiple *Epinephelus* species. This is historical name-boundary evidence, not culinary-equivalence, availability, or fish-safety advice. |
| `WP04-SECTIONP-GOLDEN-TILEFISH-BOUNDARY-R82-20261013-S04` | Poissonnerie La Mer, [arrival list dated 2026-04-28](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_28-04-2026.pdf?v=1777318537), `FILETS / FILLETS` row `FILET DE MEROU NOIR / BLACK GROUPER FILLET`. | Same PDF URL is already owned by the R82 Golden Tilefish proposal for another row; reused it with this row-specific locator. Before integration no ledger record owned the URL; it is now attached to this grouper group. This is dated supplier-list evidence, not a binomial or proof of current stock. |
| `WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S02` | CFIA, [Fish List results for grouper](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=grouper). | The R97 proposal owns this query URL. Before integration the ID and URL had no ledger owner; they are now attached to this grouper group. The live result rows pair broad grouper wording with multiple taxa, including *Cephalopholis*, *Epinephelus*, and *Mycteroperca*. The list was modified 2023-09-18. This is labeling evidence, not recipe equivalence. |
| `WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S03` | OQLF, [GDT: mérou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428135/merou). | The R97 proposal owns the URL. Before integration the ID had no ledger owner; it is now attached to this grouper group. The 1983 entry marks `mérou` as the preferred Québec term and defines it broadly for Serranidae, especially *Epinephelus* and *Mycteroperca*. |

R680-S01 and R680-S02 are new source IDs in the live ledger. The La Mer, CFIA query, and OQLF IDs continue to identify their proposal-owned URLs; the existing CFIA overview ID is reused from the ledger. All source IDs map to one URL.

## Bounded recommendation

Add only the visibly qualified, identity-only `grouper / mérou` market group above. It gives users an honest result for the broad name while preserving the distinction between a multi-species market term and a species identity. Keep the R97 Red Grouper hold, species-specific aliases, supplier product wording, all forms and numeric data, recipe links, and substitutions unchanged. Section P remains open.

## Integration owner disposition

Integrated as `ingredient-ref-grouper-market-group` with the proposed bilingual qualified displays, no aliases, no form or numeric behavior, and a ledger record carrying the verified market-name evidence. Health Canada report R680-S02 was added during integration to support the multiple-taxa boundary. The shared group remains species-neutral; Red Grouper and supplier-specific Black Grouper wording remain outside it. See the R680–R682 integration README.
