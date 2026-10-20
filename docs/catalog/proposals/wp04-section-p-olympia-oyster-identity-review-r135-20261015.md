# WP04 Section P — Olympia oyster identity review (R135)

- **Review date:** 2026-10-15.
- **Candidate under review:** Olympia oyster, *Ostrea lurida*; Québec French **huître plate du Pacifique**.
- **Disposition:** **Hold with no catalog or ledger delta.** The species-level identity and a Canadian supplier’s *O. lurida* product listing are supported, but CFIA assigns the exact English common name **Olympia Oyster** to both *O. conchaphila* and *O. lurida*. Its French **Huître Plate Du Pacifique** row is assigned to *O. conchaphila*, while OQLF pairs that term with *O. lurida*. The current picker cannot use a binomial as a non-searchable qualifier, so a qualified display containing “Olympia oyster” would still make that shared query select only the *O. lurida* row. No safe bilingual picker label is established.
- **Write scope:** this proposal only. No catalog JSON, ledger, plan, roadmap, recipe, generated file, or application code was changed.

## Candidate boundary and prior-work audit

The open WP04 Section P plan still covers “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5303)). The earlier fresh-oyster review kept the generic fresh-oyster candidate unresolved and mentioned Olympia oyster only among several Canadian species; it did not make a species-specific Olympia decision ([fresh-oyster boundary review](wp04-section-p-fresh-oyster-identity-boundary-review-20261012.md)). R130 and R131 separately integrated Pacific and Eastern oysters, and R132 held whole/live green sea urchin. The R133 Mediterranean-mussel review is a different species. None of those decisions allocates *Ostrea lurida*.

The audited snapshot contains **1,486 active references**, **109 forms**, **61 legacy-import candidates**, and **1,831 research-ledger records**. The manifest lists **114 recipes** and their ingredient arrays contain **1,123 rows**. No active reference, form, legacy candidate, or ledger identity currently owns *O. lurida* or its species-specific names. This review does not reserve an ingredient ID or reassign the unresolved **ingredient-ref-fresh-oyster** candidate.

The proposal-local source prefix **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015** was checked against the ledger, proposal archive, and batch archive before use; it has no match.

## Species name, taxonomy, and Canadian / Québec market evidence

The target is the current Canadian native species *Ostrea lurida*. COSEWIC’s report uses **Olympia Oyster / *Ostrea lurida***, says it was previously called *O. conchaphila*, and explains that the latter name refers to a separate, more-southern species. This resolves the older naming used in some federal shellfish pages. [S01, S06]

A current online listing from **Seacore Seafood Inc.**, a Canadian seafood supplier based in Vaughan, Ontario, identifies its product as **Olympia Oysters / *Ostrea lurida***. The listing specifies **1–1.5 inches**, **60 count per case**, **harvested in Washington**, **live**, and **Product of U.S.A.** It also says “Available weather permitting.” This is direct Canadian supplier evidence for a source-specific imported human-food product; it does not show that the item is in stock now or produced in Canada. The Washington origin distinguishes this listing from Canadian wild harvest. [S03, S04]

DFO’s 2026/27 Pacific oyster fishery notice says Olympia oyster harvest “for commercial or recreational purposes is prohibited.” That is evidence about harvesting in the Canadian Pacific fishery, not a statement that an imported U.S.-harvested product cannot be sold in Canada. Parks Canada likewise describes the local species as protected and directs people harvesting other oysters to avoid taking it accidentally. [S05, S07]

For Québec French, OQLF’s food-domain GDT entry directly links **Olympia oyster** and *O. lurida* to the preferred term **huître plate du Pacifique**. It also lists **huître indigène du Pacifique** as a term used in some contexts but says that wording was not retained by the committee for fish-product terminology. The entry’s 2012 note about commercial potential is terminology context, not proof of a current Québec product listing. No current Québec retailer listing for *O. lurida* was found in this review. [S02]

The CFIA Fish List creates a picker-level conflict. It lists the exact English common name **Olympia Oyster** under both TSN 568041, *O. conchaphila*, and TSN 79883, *O. lurida*. It lists **Huître Plate Du Pacifique** under the *O. conchaphila* row, while OQLF’s food-domain entry pairs **huître plate du Pacifique** with *O. lurida*. COSEWIC says *O. lurida* is the correct name for the Canadian native species and that *O. conchaphila* is a separate southern species; the supplier’s product page also explicitly identifies *O. lurida*. Those sources resolve which taxon the supplier product represents, but they do not make the shared English label unique or resolve the conflicting French food-label mapping. Do not claim OQLF’s term is an accepted CFIA label for *O. lurida*. [S01, S02, S03, S08, S09]

## Picker scope and common-name collision

[IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) indexes bilingual reference names and aliases, returns complete normalized word-phrase matches before substring fallback, and does not use a binomial as a separate disambiguation field. Adding a display such as **Olympia oyster (*Ostrea lurida*)** would still index the complete phrase **Olympia oyster**. The CFIA Fish List assigns that exact English common name to two distinct taxa; a hypothetical row would be the only picker result and falsely narrow the broad name to *O. lurida*.

| Query or candidate label | Current exact phrase results | With a hypothetical *O. lurida* row | Naming boundary |
|---|---:|---:|---|
| `Olympia oyster` / `Olympia oysters` | 0 | 1 | CFIA uses **Olympia Oyster** for both *O. conchaphila* and *O. lurida*. Adding the species row makes the shared name a singleton in this catalog. |
| `Olympia oyster (Ostrea lurida)` | 0 | 1 | The binomial in the display would not prevent the common phrase from matching; scientific names are not a separate non-searchable qualifier in the current reference shape. |
| `huître plate du Pacifique` / `huîtres plates du Pacifique` | 0 | 1 | OQLF pairs the French term with *O. lurida*, but CFIA assigns **Huître Plate Du Pacifique** to the *O. conchaphila* row. The discrepancy prevents a safe bilingual identity label. |
| `huître du Pacifique` | 1 | 1 | This shorter term already belongs to Pacific oyster. Do not add it to an Olympia candidate. |
| `oyster` / `oysters` / `huître` / `huîtres` | Multiple | Multiple | Broad queries stay multi-result; this does not fix the exact Olympia-name collision. |
| `huître indigène du Pacifique`, `native oyster`, `western oyster` | 0 | Not proposed | The French term was not retained for fish-product terminology; the English terms are broader and do not provide a safe species-qualified bilingual pair. |

The Seacore Vaughan supplier listing directly identifies its particular live, Washington-harvested, U.S.-origin product as *O. lurida*. That is species-specific product evidence, not proof that the unqualified consumer-facing/common query **Olympia oyster** uniquely identifies this taxon. The supplier page cannot resolve the CFIA common-name overlap, and the listing is not a current Québec retail SKU. Keep the product evidence in this review without turning it into a global picker identity.

No safe, useful bilingual label was established within the current reference schema. Including the shared English phrase would make it a one-result query; using the CFIA-conflicting French phrase would carry the corresponding taxon ambiguity. The species remains a documented hold until a competent naming source resolves the conflict or the picker can show and communicate the multiple taxonomic scopes.

## Recipe demand and product-state boundaries

The complete **114-file manifest-listed corpus** and all **1,123 ingredient rows** were scanned. The corrected scan searched only string fields inside each recipe’s **ingredients array**, using normalized whole-phrase matching for Olympia oyster(s), native/western oyster, the Québec preferred and contextual terms, and *O. lurida* / *O. conchaphila*. It found **0 matching recipe files and 0 matching ingredient rows**. Recipe instructions were not counted as ingredient demand.

The supplier’s size and case count describe that listing only; they are not reusable kitchen measures. Its **live** product state is not enough to define a reusable recipe form. Add no form, default density, unit mapping, count-to-mass conversion, package yield, cooking yield, recipe link, or substitution.

## Recommended no-delta hold

Keep *Ostrea lurida* unallocated in active references, forms, legacy candidates, and the research ledger. Do not reserve `ingredient-ref-olympia-oyster`; do not add the proposed English or French display, aliases, a ledger record, or a candidate record. This is an explicit no-delta decision for the current picker.

The evidence does establish that Seacore lists a specific *O. lurida* product. Keep that species-specific product distinct from the ambiguous general label **Olympia oyster**: the listing supports the identity of that supplier item but does not make the common name taxon-unique or establish Québec retail stock. DFO’s Canadian-harvest prohibition remains separate from the imported U.S.-origin product evidence.

The ingredient-only scan found no recipe demand. Add no form, measurement observation, default density, unit mapping, count conversion, package or cooking yield, recipe link, or substitution. The supplier’s size and case count remain listing-specific observations, not reusable kitchen measures. Revisit if the CFIA/OQLF name conflict is resolved for *O. lurida* or if picker behavior can preserve the shared name’s multiple taxonomic scopes.

## Source register

All pages were accessed or checked on **2026-10-15**. Direct source wording below is preserved where material; dates and evidence limits distinguish terminology from current product stock and taxonomic labels.

| Source ID | Direct source and exact wording used | Supports / limits |
|---|---|---|
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S01** | COSEWIC, [Assessment and status report on the Olympia Oyster, *Ostrea lurida*](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/olympia-oyster-2011.html), May 2011. Wording: “Olympia Oyster, *Ostrea lurida* (previously *Ostrea conchaphila*)”; the report says *O. lurida* was the correct name for Canadian native oysters and *O. conchaphila* refers to a separate species farther south. | Canadian species and taxonomic transition. The assessment is dated; use the 2026 DFO notice for current harvest restrictions. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S02** | Office québécois de la langue française, [huître plate du Pacifique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198689/huitre-plate-du-pacifique), updated 2012; food-domain terms: **Olympia oyster**, *Ostrea lurida*; preferred French term **huître plate du Pacifique**. It says **huître indigène du Pacifique** was not retained by the fish-products terminology committee. | Québec French and taxon pairing. Its commercial-potential note is not evidence of a current Québec sale or an up-to-date CFIA label. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S03** | Seacore Seafood Inc., [Olympia Oyster product listing](https://www.seacoreseafood.com/product/olympia-oyster-pacific-oyster), accessed 2026-10-15. Exact fields: **Olympia Oysters**, *Ostrea lurida*, **1-1.5 inches in size**, **60 count per case**, **Harvested in Washington**, **Live**, **Product of U.S.A.**, and **Available weather permitting**. | Precise Canadian supplier product/taxon pairing and product observations. The supplier is in Vaughan, Ontario; page wording is not a current inventory guarantee or a reusable measurement. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S04** | Seacore, [company profile](https://www.seacoreseafood.com/info/company-profile), identifies itself as a wholesaler based in Vaughan, Ontario, serving foodservice and retail customers. | Confirms the product page is a Canadian supplier source. It does not establish Québec retail availability. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S05** | Fisheries and Oceans Canada, [2026/27 Pacific oyster fishery notice](https://notices.dfo-mpo.gc.ca/fns-sap/index-eng.cfm?DOC_ID=345756&ID=all&pedisable=true&pg=view_notice), sent 2026-02-16. Exact clause: Olympia oyster (*Ostrea lurida*) harvesting “for commercial or recreational purposes is prohibited.” | Current Canadian Pacific harvest boundary. It does not negate the separately identified Washington-origin supplier product or determine import eligibility. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S06** | DFO, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), oyster guide section; it still labels the entry **Olympia oyster (*Ostrea conchaphila*)**. | Records the older federal identification name. COSEWIC’s taxonomic update, OQLF, and the supplier’s explicit *O. lurida* product control the proposed species identity. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S07** | Parks Canada, [Huître plate du Pacifique (*Ostrea lurida*)](https://parcs.canada.ca/pn-np/bc/pacificrim/nature/especes-species/huitreplatedupacifique-olympiaoyster), modified 2022-08-26. Names the species and states **“La pêche commerciale et récréative de l’huître plate du Pacifique est actuellement interdite”** in the local species-protection context. | Confirms current French species naming and local protection. It is not market evidence or a claim about imported product. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S08** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), checked 2026-10-15; list modified 2023-09-18. The result gives the exact English name **Olympia Oyster** to both TSN 568041, *O. conchaphila*, and TSN 79883, *O. lurida*. It lists **Huître Plate Du Pacifique** only on the *O. conchaphila* row; the *O. lurida* row has no French term and separately has an **Oyster / Huître** row. | Canadian consumer-label nomenclature and the exact common-name collision. The listed French name is not used here as evidence that CFIA assigns it to *O. lurida*. |
| **WP04-SECTIONP-OLYMPIA-OYSTER-R135-20261015-S09** | CFIA, [Guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; it says only common names listed for the species should be used for fish sold or processed in Canada. | Establishes why the Fish List mismatch matters for label claims. It does not resolve the common-name collision or provide a CFIA French name for the *O. lurida* row. |

## Static review record

- Read **AGENTS.md**, **Requirements.md**, the open Section P plan item and prior oyster decisions, current roadmap history, active references/forms, legacy candidates, research ledger, proposal/batch archive, and manifest-listed recipe bundle.
- Checked current name and ID ownership; no *O. lurida* identity is allocated, and no ingredient ID is reserved by this hold.
- Reproduced the phrase-first picker behavior from the live reference fields. Current `Olympia oyster` and `huître plate du Pacifique` searches have no exact results; a hypothetical candidate row would make each a single result despite CFIA’s conflicting two-taxon English mapping and the French mapping discrepancy.
- Parsed 114 manifest-listed recipes and 1,123 ingredient rows; the corrected ingredient-field-only scan found no matching oyster species or terms.
- Documentation-only no-delta proposal. No tests were run; no catalog or ledger data and no application behavior changed.
