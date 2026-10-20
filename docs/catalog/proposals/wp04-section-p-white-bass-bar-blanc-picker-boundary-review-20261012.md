# WP04 Section P — white bass / bar blanc picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, Canadian food-name, Québec regulatory-scope, and search-ownership review.
- **Disposition:** **Hold** *Morone chrysops* outside the active reference catalog and research ledger. Current authorities support the species and the food-name pair **white bass / bar blanc**. The live picker would make the qualified display the only result for the broad queries **bass** and **bar**, so activating it would assign unresolved generic fish searches to this one species.
- **Worktree scope:** this proposal file only. No canonical JSON, forms, legacy candidate, research ledger, recipe, plan, roadmap, generated file, code, or test was changed. No tests or emulator checks were run for this proposal-only review.

## Candidate and boundary

This review selects one previously unreviewed Section P fish identity: white bass, *Morone chrysops*. The Section P plan remains open for named and regional fish. The earlier finfish-gap review left broad bass/bream names unresolved; the striped-bass review concerns *Morone saxatilis*. White bass is a separate species, and this proposal does not reopen or expand the striped-bass hold.

If the picker can preserve the distinction between a broad query and a species-qualified identity, the proposed row would be:

| Proposed ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| **ingredient-ref-white-bass** | **PROTEIN** | **white bass** | **bar blanc** | *Morone chrysops* | None |

Use no alias for **bass**, **bar**, **silver bass**, **bar rayé**, **white perch**, or the obsolete scientific combination *Roccus chrysops*. The OQLF calls **bar blanc** the preferred Québec food-fish term and identifies **bar rayé** as a term used in some contexts that the fish-products terminology committee did not retain. CFIA assigns **Bar Blanc D’Amérique** to white perch, *Morone americana*, a distinct species. [S01–S03]

## Exact ownership and review-archive audit

The live files read for this review contained 1,288 ingredient references, 98 ingredient forms, 64 legacy candidates, and 1,596 research-ledger records. I searched normalized exact phrases and IDs across reference names and aliases, form labels and match terms, legacy names and aliases, ledger IDs and evidence, the Section P plan, all catalog proposals and batches, and the roadmap. No exact owner or earlier candidate-specific review was found for **white bass**, **bar blanc**, *Morone chrysops*, *Roccus chrysops*, **ingredient-ref-white-bass**, **candidate-white-bass**, or this proposal’s source-ID prefix.

The broader query **bass/bream** is explicitly unresolved in [the 2026-10-10 finfish-gap review](wp04-finfish-gaps-20261010.md). [The striped-bass review](wp04-section-p-striped-bass-picker-boundary-review-20261012.md) separately holds *M. saxatilis* because its food-name pair would claim bare **bass** and **bar** searches. Those records do not identify or hold *M. chrysops*; they document the generic-query boundary relevant to this candidate.

The existing freshwater-drum review and ledger mention **white perch** as an excluded, overlapping fish name and note its use for *M. americana*. There is no active white-perch reference, form, or legacy identity. Keep that name distinct from the proposed *M. chrysops* pair. CFIA’s separate species rows provide the authoritative name boundary. [S01, S04]

The proposed ID **ingredient-ref-white-bass**, legacy ID **candidate-white-bass**, and source prefix **WP04-SECTIONP-WHITE-BASS-20261012** are unused. The [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt) has no completed white-bass entry; its broad regional-fish work remains open. The scan found no pre-existing source IDs for this packet.

## Canadian and Québec name evidence

CFIA’s Fish List records *Morone chrysops* as **White Bass / Bar Blanc**. Its adjacent *M. americana* record is **White Perch / Bar Blanc D’Amérique**, with **Baret** and **Perche Blanche** also listed in French. CFIA describes the list as a source of English and French common names acceptable in Canada for fish labelling, along with species names and import-notification taxonomic identifiers. That is fish-label naming scope; it does not establish retail stock, source legality, culinary measurements, or interchangeability. [S01, S02]

The OQLF GDT entry places **bar blanc** in zoology/ichthyology and edible fish. It pairs the preferred French term with English **white bass** and *M. chrysops*. It says this is a fishery species with commercial potential in Québec; that statement does not confirm current Québec inventory. The entry notes that **bar rayé** was not retained by the fish-products terminology committee and marks *Roccus chrysops* as obsolete. Neither is proposed as a catalog alias. [S03]

Ontario’s current government species page identifies white bass as a fish native to Ontario and places its range in the lower Great Lakes; the page was updated 2026-09-02. It distinguishes white bass from similar white perch. The page supports the species identity and local presence, not a food product, sale channel, or kitchen specification. [S05]

### Canadian product and Québec sales scope

DFO’s 2024 freshwater landings table reports white-bass landings in Ontario of 370 tonnes live weight and a landed value of $1,234 thousand; its Canada total is the same. The Québec cells show no reported provincial data, which the table distinguishes from a reported zero. These are catch and landed-value statistics, not retail availability, a packaged product specification, or an ingredient quantity. [S06]

Presteve Foods, a Wheatley, Ontario fish processor, currently lists **White Bass** as wild and fresh and names Lake Erie and Manitoba lakes as source areas. Its page invites purchase inquiries; it gives no live inventory, binomial, package format, or retail stock guarantee. [S07]

Provigo’s Québec-language online grocery page lists **Bar blanc, entier** and marked it out of stock in the store view accessed for this review. The item page names no scientific species or catch source. It is evidence of a local product label appearing in a retailer catalog, not confirmation that the species was in stock or that a particular source accompanied the listing. [S08]

Québec’s current Regulation respecting aquaculture and the sale of fish names **white bass (*Morone chrysops*)** among species whose dead fish may not generally be sold. The same section authorizes specified channels: licensed commercial catch under the Québec fishery regulation, sales by a licensed fishing-pond operator, aquaculture origin, or qualifying imported commercial catch or commercial raising under the source jurisdiction’s laws. Section 32 requires the specified licensed sellers to provide an invoice recording the species and number sold. This is a scoped sale rule, not a blanket claim that white bass can never be sold or that any retailer listing meets an exception. The reviewed retailer page does not establish the source or exception for its out-of-stock listing. [S09]

The food-name authorities establish a human food-fish identity and Canadian label wording. They do not establish an unrestricted Québec sales channel. No feed or pet-food identity is in scope.

## Picker search ownership and hold rationale

The live search implementation in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes bilingual terms, prefers complete word-phrase matches across a result set, and uses substring matching only when the phrase stage has no results. I projected the supported display pair into the current references and forms without modifying them:

| Query | Current live result | Hypothetical result with white bass / bar blanc | Ownership consequence |
|---|---|---|---|
| **white bass** | None | White bass / bar blanc | Specific English food-name search would work. |
| **bar blanc** | None | White bass / bar blanc | Specific Québec French food-name search would work. |
| **bass** | Bottle gourd / courge bouteille, through the substring **bass** in the alias **courge calebasse** | White bass / bar blanc only | The complete-word **bass** match takes precedence over substring fallback and would claim the unresolved generic search. |
| **bar** | 22 substring-fallback results, including Bambara beans, barley, barramundi, barbecue sauce, brown bullhead, channel catfish, prickly pear, and rhubarb | White bass / bar blanc only | The complete-word **bar** match takes precedence over the broad fallback set and would claim the bare French/English search. |
| **white perch** or **bar blanc d’Amérique** | None | None | No white-perch identity is created; *M. americana* remains distinct. |

The broad **bass/bream** boundary remains unresolved in the earlier finfish packet. An active *M. chrysops* row would make the two generic queries appear species-specific even though the row is supported only by a qualified name. The exact bilingual queries are unowned today, but the picker’s precedence rule makes the broad-query capture a material search-ownership collision. Hold this species outside the catalog until the picker preserves those broader choices or the generic fish scope is resolved.

## Recipe demand, measurements, and substitutions

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for the complete normalized phrases **white bass**, **bar blanc**, *Morone chrysops*, and *Roccus chrysops*, along with all strings in each recipe object. Result: zero matching recipe files and zero matching ingredient rows. The manifest-ordered corpus digest at review time was `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. No recipe link or recipe-specific amount is supported.

No reusable form, count-to-mass mapping, density, volume conversion, edible yield, or cooking yield is supported by this review. DFO’s live-weight landing statistics are fishery data; the retailer’s whole-fish listing is not a recipe portion. No reviewed recipe or source establishes a directed substitution to white perch, striped bass, another bass, or another finfish. Add no global or contextual substitute and infer no cooking, curing, storage, or raw-consumption equivalence.

## Sources

Sources were accessed on 2026-10-12. Source IDs are proposal-local and were not added to the research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-WHITE-BASS-20261012-S01** | CFIA, [Fish List query for White Bass](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=White%20Bass) | Lists *Morone chrysops*, White Bass / Bar Blanc, family Moronidae. The neighboring White Perch entry assigns *M. americana* to White Perch / Bar Blanc D’Amérique, with Baret and Perche Blanche also present. Fish-label naming evidence, not retail authorization or culinary equivalence. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [French Fish List overview](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/poisson/liste-poissons) | States that the list provides English/French common names acceptable in Canada for fish labelling and scientific names/taxonomic identifiers. It does not prove current product supply or sale legality for a particular lot. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S03** | OQLF, [bar blanc, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198931/bar-blanc) | Preferred Québec edible-fish term, English White Bass, *M. chrysops*, and commercial-potential note. Records bar rayé as not retained for fish products and *Roccus chrysops* as obsolete. Last updated 2011; terminology, not current retail inventory. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S04** | CFIA, [White Perch query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=White%20Perch); freshwater-drum [proposal](wp04-section-p-freshwater-drum-malachigan-identity-boundary-review-20261012.md) and [ledger evidence](../research-ledger.v1.json) | CFIA scopes White Perch / Bar Blanc D’Amérique to *M. americana*. The existing drum materials preserve white perch only as an excluded overlapping name. No active white-perch reference or alias was found. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S05** | Ontario, [White Bass species page](https://www.ontario.ca/page/white-bass) | Identifies *M. chrysops* as native to Ontario and records its lower-Great-Lakes range; updated 2026-09-02. Species presence, not a product listing or recipe specification. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S06** | Fisheries and Oceans Canada, [Freshwater landings, 2024](https://www.dfo-mpo.gc.ca/stats/commercial/land-debarq/freshwater-eaudouce/2024-eng.htm) | Species table reports Ontario white-bass live-weight catches and landed value; Québec is shown as no provincial report. Commercial landing data, not retail or culinary measurement evidence. Page modified 2026-02-13. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S07** | Presteve Foods, [White Bass](https://presteve.com/project/white-bass/) | Ontario processor page lists wild, fresh White Bass and Lake Erie/Manitoba Lakes; directs purchase inquiries to sales. Commercial-product context only; no binomial, inventory, portion, or package specification. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S08** | Provigo, [Québec online grocery listing](https://www.provigo.ca/fr/alimentation/poissons-et-fruits-de-mer/hors-d-uvre-aux-produits-de-la-mer/c/28192) | Lists “Bar blanc, entier” and marked it out of stock in the accessed store view. No taxon or source is printed. Product-name context only, not confirmed in-stock species availability. |
| **WP04-SECTIONP-WHITE-BASS-20261012-S09** | Québec Official Publisher, [Regulation respecting aquaculture and the sale of fish, English text](https://www.legisquebec.gouv.qc.ca/en/pdf/cr/C-61.1%2C%20R.%207.pdf) and [current French text](https://www.legisquebec.gouv.qc.ca/fr/document/rc/c-61.1,%20r.%207) | Division VII, sections 30 and 32: restricted sale of dead fish of listed species, including white bass, scoped exceptions for specified licensed or commercial sources, and seller invoice details. Regulatory scope, not evidence that a particular listing or lot meets an exception. |

## Recommendation

**Hold** **ingredient-ref-white-bass** outside the active reference catalog and ledger. The supported name pair is **white bass / bar blanc** for *Morone chrysops*, with no aliases if the candidate is reconsidered. Keep the generic **bass** and **bar** searches unresolved, keep white perch and striped bass separate, and add no form, recipe link, kitchen measure, conversion, yield, density, or substitution from this review.
