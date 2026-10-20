# WP04 Section P — black pomfret picker-boundary review (R274)

- **Review and source-access date:** 2026-10-16.
- **Packet type:** Proposal-only species-name, exact-ownership, picker, market, and recipe-demand review.
- **Recommendation:** Keep black pomfret (*Parastromateus niger*) outside active references, forms, legacy identities, and the research ledger. CFIA supplies the bilingual label pair Black Pomfret / Castagnoline Noire, ITIS recognizes the species as valid, and current Ontario supplier and Montréal retailer pages show a black-pomfret market product. However, an active display containing Black Pomfret would make the broad query pomfret return this single species row, despite current market material distinguishing black, silver, and golden-pomfret-labelled products. No bundled recipe demand was found.
- **Scope:** This review addresses only black pomfret / *P. niger*. It does not reopen the R252 silver-pomfret hold, the integrated pompano market group, or other finfish. No shared catalog, ledger, plan, roadmap, recipe, generated file, or application code is changed. No tests, build, emulator, deployment, or screenshot checks were run.
- **Proposed integration README path if this hold is recorded:** [wp04-section-p-black-pomfret-picker-hold-integration-r274-20261016/README.md](../batches/wp04-section-p-black-pomfret-picker-hold-integration-r274-20261016/README.md). This proposal-only task does not create that README.

## Candidate and prior-work boundary

The candidate is the single species *Parastromateus niger*, which CFIA lists as Black Pomfret / Castagnoline Noire. ITIS reports TSN 168785 and current standing valid. This supports a species-scoped name pair; it does not establish that every product called pomfret is this species.

The latest silver-pomfret review, R252, explicitly identified black pomfret as a separate candidate and reported no black-pomfret-specific decision or allocation. Its current Ontario supplier source lists black and silver pomfret separately, and calls a *Trachinotus blochii* product Golden Pomfret (Pompano). R252 reviewed *Pampus argenteus* and held that candidate because adding it alone would make bare pomfret a misleading singleton. This packet follows up only the separate *P. niger* gap and does not reopen or revise R252. [R252 review](wp04-section-p-residual-seafood-gap-review-r252-20261016.md)

The active pompano row is a distinct *Trachinotus* market group. ITIS places black pomfret (*Parastromateus niger*) and *Trachinotus blochii* in Carangidae, and silver pomfret (*Pampus argenteus*) in Stromateidae. The supplier’s shared market word therefore spans distinct taxa and at least two families. Do not merge these products because their market names share pomfret. [S02, S05–S06]

The parent Section P checklist remains open for shellfish, roe, and regionally used seafood. The R109 pompano review and the R252 silver-pomfret hold are adjacent decisions, not owners of the *P. niger* identity. [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6883) · [R109 pompano review](wp04-section-p-pompano-market-group-identity-review-r109-20261014.md) · [R109 integration README](../batches/wp04-section-p-pompano-market-group-identity-integration-20261014/README.md)

## Exact ownership audit

The read-only package snapshot contains **1,656 active ingredient references**, **125 forms**, **4 legacy import identities**, and **2,004 research-ledger records**. The manifest lists **114 recipes**.

| Candidate term or allocation | Current owner | Audit result |
|---|---|---|
| ingredient-ref-black-pomfret; *Parastromateus niger*; black pomfret; castagnoline noire; pomfret noir | None in active references, forms, legacy identities, or ledger records | No exact owner or allocated candidate was found. No ID is reserved by this proposal. |
| Broad pomfret | No active reference, form, legacy identity, or ledger record | R252 records the current market ambiguity and independently holds *Pampus argenteus*. Its black-pomfret mention is context only, not a decision or allocation. |
| ingredient-ref-pompano / pompano | Active identity-only *Trachinotus* market-group row | Keep unchanged; do not add black-pomfret terms or the supplier’s Golden Pomfret wording as aliases. |
| Silver pomfret / *Pampus argenteus* | No active reference or form | R252 holds it outside active data; do not treat the separate silver row as available to disambiguate black pomfret in the current picker. |
| WP04-SECTIONP-BLACK-POMFRET-R274-20261016 source-ID prefix | No previous owner found in the ledger or catalog proposal/batch archive | IDs below are proposal-local and are not ledger allocations. |
| Proposed batch README path | No existing path found | The path above is unique in the current batch archive. |

The candidate name and taxonomy, proposed reference/candidate IDs, and source-ID prefix were searched across active references, forms, legacy-import identities, ledger records/source IDs, the Section P plan, proposal and batch archives, and the manifest-listed recipe files. The only focused prior discussion found was R252’s adjacent mention; it does not decide this species. R252’s Fresh Water Foods source is reused under its existing source ID, not assigned another ID here. [R01]

## Naming, taxonomy, and product-market evidence

CFIA’s Fish List associates TSN 168785 and *Parastromateus niger* with the Canadian fish-labelling names **Black Pomfret / Castagnoline Noire**. CFIA describes the list as an English/French accepted-name and scientific-name reference for Canadian fish labelling. The list’s histamine risk-group flag is not a culinary classification, recipe instruction, or substitute rule and is not proposed for app behavior. [S01]

ITIS lists *P. niger* as a valid species in Carangidae and gives black pomfret as its English common name. The California Academy of Sciences’ Eschmeyer’s Catalog of Fishes, updated 2026-08-13, also records the name as valid. These are taxonomy sources; neither proves the identity of an individual retail package. [S02, S03]

Fresh Water Foods Inc., a Richmond Hill, Ontario importer and wholesale distributor, lists Black Pomfret (*P. niger*) separately from Silver Pomfret (*Pampus argenteus*) and Golden Pomfret (Pompano) (*Trachinotus blochii*). The page describes its products as serving grocery, retail, and food-service channels across Ontario. This is a current supplier catalogue and a useful market-name distinction, not evidence of Québec stock or a general consumer label. The supplier lists its black pomfret as wild-caught, origin India, with whole-round/whole-cleaned IQF presentations and seller-specific size bands; these do not establish a Canadian fishery, universal form, standard portion, or package yield. [Reused WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S04]

A Montréal retailer’s page lists “BLACK POMFRET INDIAN (350-500 GR)” in its frozen-seafood category and identifies a Lasalle address. It gives no binomial, French display, package-label image, or current inventory status. Treat it as a local product-name listing only; it does not show that the listed product is *P. niger* or that this wording is generally preferred in Québec. [S04]

A targeted OQLF search during this review did not surface a GDT entry for *P. niger* or Castagnoline Noire. This limited search result is not proof that no other Québec terminology source exists. CFIA’s accepted French label is sufficient to document a Canadian label-name candidate, but independent Québec consumer wording remains unconfirmed.

## Culinary use and its limits

Fresh Water Foods describes black pomfret as firmer and larger than its silver-pomfret product and suggests curries, frying, and grilling. These are supplier-authored product descriptions, not a controlled cooking study, a Québec culinary standard, a recipe, or evidence that black and silver pomfret can be exchanged in equal amounts. The Montréal listing provides no recipe or preparation details. Record none of these statements as a reusable culinary form, measure, yield, conversion, or substitution.

No Canadian commercial fishery, landings, or harvest-management source was established in this bounded review. The Ontario supplier’s India origin and wild-caught statements are supplier-specific market metadata, not evidence of a Canadian fishery or of all black-pomfret supply.

## Picker projection

The projection follows the phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation normalization, complete-word phrase matches across bilingual displays/aliases/forms first, then partial matching when no phrase matches. Current results were checked against the active reference and form search terms. A hypothetical row is shown only to describe picker impact; it is not proposed active data.

| Query | Current results | With a hypothetical Black Pomfret / Castagnoline Noire display | Consequence |
|---|---|---|---|
| black pomfret | None | Black pomfret candidate only | The species-qualified English product phrase would be searchable. |
| castagnoline noire | None | Black pomfret candidate only | The CFIA French label pair would be searchable; local Québec usage remains unverified. |
| pomfret | None | Black pomfret candidate only | The broad market term would misleadingly appear resolved to *P. niger*, even though current market listings distinguish silver and golden pomfret products. |
| silver pomfret | None | None | Do not imply that black and silver products are equivalent or add the held silver candidate. |
| golden pomfret | None | None | Do not attach this *Trachinotus blochii* seller wording to black pomfret or to the generic pompano row. |
| pompano | Active pompano market-group row | Same active row | Keep its existing boundary unchanged. |

Under the recommended hold, all current query results remain unchanged. Do not try to fix bare pomfret by adding unsupported aliases, by relabeling the existing pompano row, or by activating both the R252 silver candidate and this black candidate in a one-species packet.

## Bundled-recipe demand

The manifest-listed recipe scan parsed all **114 recipes and 1,123 ingredient rows**, searching recipe JSON text and ingredient rows for black pomfret, pomfret variants, Castagnoline Noire, *Parastromateus niger*, and adjacent silver/golden pomfret phrases. **There were zero matching recipe files and zero matching ingredient rows.** No recipe link, portion, preparation role, product choice, form, or recipe-scoped substitution is supported. [R01]

## Proposed disposition

**No catalog or shared-ledger delta is proposed.** Keep the *P. niger* candidate outside active references, forms, legacy mappings, and the research ledger. Do not allocate ingredient-ref-black-pomfret; add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions. Keep the existing pompano row and the R252 silver-pomfret hold unchanged.

Revisit this identity if the picker can preserve multiple broader pomfret-market results or if a later multi-candidate review can safely represent the current market scope. A future Québec package or retailer source that displays Castagnoline Noire with a species declaration would strengthen the French market-language evidence, but it would not by itself remove the broad-query issue.

## Source register

Online sources were accessed on 2026-10-16 unless noted. New source IDs are proposal-local; R274 adds no sources to the shared ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-S01** | CFIA, [Fish List results for *Parastromateus niger*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&q=Parastromateus%20niger&wbdisable=true); [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Fish List row TSN 168785 pairs *P. niger* with Black Pomfret / Castagnoline Noire. CFIA says the Fish List supplies acceptable Canadian fish-labelling names and linked scientific names. Its risk-group flag is not recipe behavior. Naming and label-scope evidence, not a current local package or cooking source. |
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-S02** | Integrated Taxonomic Information System, [*Parastromateus niger*, TSN 168785](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168785) | Lists the taxon as valid, species rank, in Carangidae, and gives black pomfret as its English common name. Taxonomy only; not market-identity or recipe evidence. |
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-S03** | California Academy of Sciences, [Eschmeyer’s Catalog of Fishes: *Parastromateus niger*](https://researcharchive.calacademy.org/research/ichthyology/catalog/fishcatget.asp?spid=20563), online version updated 2026-08-13 | Lists *P. niger* as valid and summarizes taxonomic references. Taxonomy source; not a Canadian product label or food-use source. |
| **Reused WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S04** | Fresh Water Foods Inc. (Richmond Hill, Ontario), [Tropical fish products](https://freshwaterfood.ca/tropical-fish.html) | Current catalogue separately lists black pomfret (*P. niger*), silver pomfret (*Pampus argenteus*), and Golden Pomfret (Pompano), *Trachinotus blochii*. Its seller-specific product/origin, size, packaging, and culinary descriptions do not establish Québec stock, a universal market name, recipe form, measure, or substitution. Reuse the R252 source ID because the URL and source are unchanged. |
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-S04** | Madina Supermarket, Montréal, [Black Pomfret Indian](https://madinasupermarket.ca/product/black-pomfret-indian/) | Page lists “BLACK POMFRET INDIAN (350-500 GR)” under frozen seafood and gives a LaSalle, Québec address. It provides no binomial, French wording, package-label image, or current stock status. Local listing evidence only; do not treat its size range as a reusable measure. |
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-S05** | Integrated Taxonomic Information System, [*Pampus argenteus*, TSN 172572](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=0172572) | Lists silver pomfret as a valid species in Stromateidae. Taxonomy only; used to distinguish the adjacent R252 species, not to reopen its hold. |
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-S06** | Integrated Taxonomic Information System, [*Trachinotus blochii*, TSN 168716](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=168716) | Lists the species as valid in Carangidae and records tropical/snubnose pompano as English common names. Taxonomy only; the “Golden Pomfret (Pompano)” market wording comes from the reused Fresh Water Foods source. |
| **WP04-SECTIONP-BLACK-POMFRET-R274-20261016-R01** | Read-only audit of the Section P plan, active references/forms, legacy identities, research ledger, recipe manifest and files, proposal/batch archive, R252 and R109 packets, and [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Records exact ownership, source-ID and batch-path checks, the phrase-first picker projection, current file counts, and the 114-recipe / 1,123-row corpus result. Snapshot only; no shared files changed. |

## Review checks

- Checked active reference and form names/aliases/terms, legacy identities, ledger record/source IDs, and proposal/batch archive for black pomfret, *P. niger*, Castagnoline Noire, pomfret noir, and related IDs.
- Re-read the R252 silver-pomfret review and R109 pompano review; neither is reopened or treated as an allocation for black pomfret.
- Parsed all 114 manifest-listed recipe files and all 1,123 ingredient rows; found no candidate-term matches.
- Confirmed the proposal-local source-ID prefix and the proposed batch README path were unused before drafting.
- No application tests, build, instrumentation, emulator, deployment, or screenshot checks were run because this is a proposal-only documentation update.

