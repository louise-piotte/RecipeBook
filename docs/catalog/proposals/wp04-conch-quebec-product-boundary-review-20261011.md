# WP04 Section P — conch / conque Québec product-boundary review

- **Packet type:** proposal-only identity and product-boundary review.
- **Research date:** 2026-10-11.
- **Scope:** bare food name `conch` and the Québec French form `conque`; Canadian and Québec species names, offered meat products, edible portion/state, recipe demand, measures, and substitutions.
- **Recommendation:** keep generic conch as a held candidate. The bare English and French names cross multiple gastropod taxa, and the bundle has no conch recipe line. A species-qualified Queen Conch meat product is documented in Canadian listings, but those listings do not establish a generic conch product, a recipe portion, or a general edible yield.
- **Write scope:** this report only. No shared catalog, ledger, plan, roadmap, code, tests, or recipes were changed.

## Recommendation and identity boundary

Do not add an active `conch / conque` reference, aliases, forms, measurements, or recipe links. The Canadian Food Inspection Agency (CFIA) Fish List applies `Conch` to both *Lobatus gigas* and *Strombus* spp.; for *Lobatus gigas* it also lists `Pink Conch` and `Queen Conch`. The same Fish List gives French `Conque` for *Lobatus gigas*, *Strombus* spp., and the *Busycon* genus. These are not one unambiguous edible product. [S01]

Québec terminology makes the collision more specific. The Office québécois de la langue française (OQLF) defines *conque canaliculée* as the edible commercial species *Busycon canaliculatum* and gives English `channeled whelk` and `channeled conch`; it defines *conque à nodules* as *Busycon carica*, with English `knobbed whelk` and `knobbed conch`. These local *Busycon* names are distinct from the Caribbean strombid Queen Conch. [S03, S04]

OQLF provides a more specific Québec term for Queen Conch: *strombe géant*, associated with *Strombus gigas* and English `queen conch`; its listed French terms also include *strombe rose* and *lambi*, with a note that *lambi* is used in the Antilles. This is useful species-qualified naming evidence. It does not make bare `conch` or `conque` a single Québec ingredient name. [S05]

If a later recipe or product import identifies Queen Conch specifically, reopen that bounded identity with the exact product and a current species-name check. Do not use generic `conch`, generic `conque`, or genus-level `strombe` as aliases that collapse Queen Conch with *Busycon* whelks or other gastropods. CFIA guidance says the common name listed for the actual species is the one to use for fish sold or processed in Canada; the Fish List is naming guidance, not proof that a particular product lot is approved for import or sale. [S01, S02]

## Canadian and Québec names

| Name or taxon | Source-supported scope | Catalog boundary |
|---|---|---|
| *Lobatus gigas* | CFIA lists `Pink Conch / Strombe rosé`, `Queen Conch` (no French name specified on that row), and `Conch / Conque`. [S01] | These are names attached to one listed species, not evidence that every bare `conch` recipe means Queen Conch meat. |
| *Strombus* spp. | CFIA separately lists `Conch / Conque`. [S01] | The genus-level entry cannot select a single species or a specific food product. |
| Queen Conch, *Strombus gigas* | OQLF’s species entry gives *strombe géant*, *strombe rose*, and *lambi*; the English terms are `queen conch` and `pink conch`. OQLF says *lambi* is in use in the Antilles. [S05] | Use only as contingent, species-qualified terminology. Do not generalize *lambi* to all conch or imply it is the ordinary Québec retail term. |
| *Busycon canaliculatum* | OQLF’s preferred Québec fishery-product term is *conque canaliculée*; English equivalents include `channeled whelk` and `channeled conch`. [S03] | Keep separate from Queen Conch and from bare `conch / conque`. |
| *Busycon carica* | OQLF’s preferred Québec fishery-product term is *conque à nodules*; English equivalents include `knobbed whelk` and `knobbed conch`. [S04] | Keep separate from Queen Conch, *B. canaliculatum*, and unqualified `conch / conque`. |

The taxonomic neighbors are also separate identities: CFIA lists whelk names for *Buccinum undatum* and *Busycon*; abalone / *ormeau* for *Haliotis* spp.; and periwinkle / *bigorneau* for *Littorina*. The reviewed whelk and abalone packets keep those candidates held and distinguish their own species/product boundaries. Sea cucumbers belong to echinoderms, class Holothuroidea, rather than gastropod molluscs. Do not alias conch to whelk, abalone, sea cucumber, periwinkle, snail, squid/calamari, bivalve shellfish, or generic seafood. Similar recipe use is not identity or substitution evidence. [S01, S12; see also the linked whelk and abalone reviews below]

## Product state and Canadian trade boundary

Canadian listings show that a species-qualified Queen Conch meat product can appear in the market, but they do not resolve the generic name:

- Pearlmark Foods lists `Conch Meat` under *Strombus gigas*, describes it as cleaned to 85% or 100% and quick-frozen, and gives separate pack/origin entries for Haiti and Cuba. The listing does not identify an anatomical edible portion or say whether the meat is raw or cooked; its package amounts are supplier-specific. [S09]
- PriceSmart Foods lists `Frozen Queen Conch Meat`, wild caught, 907 g, with an instruction to keep frozen. The page gives no scientific name and does not specify raw or cooked state. It is a store listing, not a product-specific regulatory determination. [S10]

These examples support a frozen meat product state for those listings only. They do not support shell-on meat yield, a generic cleaning percentage, or equivalence among products sold as `conch meat`. No Canadian source reviewed for this packet establishes a conch-specific edible-portion factor, raw-to-cooked factor, shell-to-meat yield, count weight, or household measure. Health Canada’s CNF Food Code 3127 is for “Mollusks, whelk, unspecified, raw”; its 100 g edible-portion and 90 g food-guide values are for whelk and must not be copied to conch. No conch-specific CNF serving/portion record was identified in this review. [S11]

The 2025 Canadian Wild Animal and Plant Trade Regulations list *Strombus gigas* as Queen Conch / *Strombe géante* in CITES Appendix II. Canadian guidance says Appendix II imports require the exporting country’s CITES export permit for listed specimens and products, including food products. This is a species-specific trade-control issue, not a blanket food prohibition or evidence that every conch product has the same import requirements. A future product record must retain its exact species and source so applicable controls can be checked. [S07, S08]

CFIA’s live/raw molluscan-shellfish page describes its own regulatory scope as bivalves and carnivorous marine gastropods, explicitly lists whelks, and excludes herbivorous abalone from that Part 1 definition. It does not classify the Queen Conch product reviewed here, so its whelk or abalone conditions should not be transferred to conch. [S13]

## Recipe demand and current catalog audit

The audit scanned all **114 manifest-listed recipe JSON files / 1,123 ingredient rows**, including recipe JSON text. It found **zero** mentions of `conch`, `conque`, `strombe`, `lambi`, *Strombus*, *Lobatus*, *Busycon*, or species-qualified forms in ingredient rows or recipe text.

Two broader references are not conch demand:

| Recipe / location | Current text | Why it does not establish conch demand |
|---|---|---|
| 093, ingredient row 4 | `Cooked meat or seafood, to taste` | It names no seafood species, product, or amount. It also specifies cooked food, whereas the reviewed Canadian conch listings say frozen meat but do not say raw or cooked. |
| 097, English recipe note | `This is a good base for mushrooms, seafood, or other add-ins.` | This is an optional narrative suggestion, not an ingredient row or a named product. |

The current active package has **943 ingredient references / 53 forms** and the legacy import file has **75 candidates**. Exact normalized-key checks, using the same lowercase/NFKD, accent-folding, punctuation/space normalization, phrase-first and substring-fallback behavior as `IngredientSearch.kt`, found no reference, form, or legacy-candidate owner for `conch`, `conque`, `queen conch`, `pink conch`, `conch meat`, `strombe`, `strombe géant`, `strombe rose`, `lambi`, *Strombus*, *Lobatus gigas*, *Busycon*, *conque canaliculée*, *conque à nodules*, `whelk`, `buccin`, `abalone`, `ormeau`, `sea cucumber`, `concombre de mer`, `holothurie`, `periwinkle`, or `bigorneau`. App-style picker queries for those phrases return no active reference. The ledger has no conch-specific candidate; its only relevant exact word occurrence is in the existing whelk candidate’s instruction to keep conch distinct. The proposal-local ID prefix `WP04-CONCH-20261011-` had no collision in the current ledger or catalog review files; no ledger entry was added.

Current manifest-listed recipe corpus digest: `9dbc9b8e17b860ecbb20bc67c218f344729630ee922a844af8fe9c13a30157e1` (sorted recipe basename, NUL, exact file bytes, NUL). Relevant current counts: manifest 114 recipes; 1,123 ingredient rows; 943 references; 53 forms; 75 legacy candidates; 1,210 research-ledger records.

## Unsupported measurement and substitution claims

Do not add a conch-specific household measure, mass/volume mapping, density, count measure, edible-portion factor, shell-on yield, cleaning conversion, package yield, raw-to-cooked conversion, or cooking-state form. Vendor pack sizes and cleaning labels are product-specific facts, not general recipe conversions. Do not import whelk’s CNF portion or CFIA’s whelk-specific live/raw provisions into a conch identity.

No reviewed source supports substituting conch for whelk, abalone, sea cucumber, periwinkle, another gastropod, or generic shellfish/seafood. No global or contextual substitution rule is proposed.

## Source register and limits

Sources accessed 2026-10-11. IDs are proposal-local and have not been added to the research ledger.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP04-CONCH-20261011-S01** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Dynamic species list for *Lobatus gigas*, *Strombus* spp., *Busycon*, *Buccinum undatum*, *Haliotis*, *Littorina*, and other entries. Naming reference; not a blanket import or sale authorization. |
| **WP04-CONCH-20261011-S02** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Directs sellers/processors to the common name(s) listed for the actual species. Does not establish a particular product’s species or import status. |
| **WP04-CONCH-20261011-S03** | OQLF, [conque canaliculée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199093/conque-canaliculee) | Québec edible commercial species *Busycon canaliculatum*; English `channeled whelk` / `channeled conch`. Species-qualified terminology only. |
| **WP04-CONCH-20261011-S04** | OQLF, [conque à nodules](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199094/conque-a-nodules) | Québec edible commercial species *Busycon carica*; English `knobbed whelk` / `knobbed conch`. Species-qualified terminology only. |
| **WP04-CONCH-20261011-S05** | OQLF, [strombe géant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358664/strombe-geant) | Maps *Strombus gigas* to English `queen conch` / `pink conch`, with French *strombe géant*, *strombe rose*, and *lambi*; notes *lambi* is used in the Antilles. Entry last updated 2004; species-specific terminology, not a generic alias. |
| **WP04-CONCH-20261011-S06** | OQLF, [strombe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358684/strombe) | Describes edible tropical gastropods in Strombidae and associates *strombe* / *lambi* with the genus *Strombus*. It does not identify one species or product. |
| **WP04-CONCH-20261011-S07** | Canada Gazette, [Wild Animal and Plant Trade Regulations amendments](https://gazette.gc.ca/rp-pr/p2/2025/2025-03-26/html/sor-dors73-eng.html) | Lists *Strombus gigas* as Queen Conch / *Strombe géante* in Appendix II. Trade listing, not food-safety or product-approval evidence. |
| **WP04-CONCH-20261011-S08** | Environment and Climate Change Canada, [Permits for trade in protected species](https://www.canada.ca/en/environment-climate-change/services/convention-international-trade-endangered-species/permits.html) | Appendix II import requirements apply to listed specimens/products; whether a specific lot complies depends on its species and documents. |
| **WP04-CONCH-20261011-S09** | Pearlmark Foods, [Conch Meat](https://www.pearlmarkfoods.com/our-products/conch-meat) | Canadian supplier listing for *Strombus gigas*, cleaned and quick-frozen, with source and pack-specific examples. Does not identify anatomical portion or raw/cooked state. |
| **WP04-CONCH-20261011-S10** | PriceSmart Foods, [Smart Choice Frozen Queen Conch Meat](https://www.pricesmartfoods.com/product/smart-choice-frozen-queen-conch-meat-00236634000004) | Retail listing says 907 g, wild-caught, keep frozen. Does not state scientific name or raw/cooked state; store listing is not regulatory evidence. |
| **WP04-CONCH-20261011-S11** | Health Canada, [CNF serving record, Food Code 3127](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3127) | Record is `Mollusks, whelk, unspecified, raw`; its edible-portion and serving entries are whelk-only and not conch measures. |
| **WP04-CONCH-20261011-S12** | Environment and Climate Change Canada, [Wild Species 2020: Sea cucumbers](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/general-status/wild-species-2020.html) | Identifies sea cucumbers as echinoderms in class Holothuroidea, separate from gastropod molluscs. Taxonomic distinction only. |
| **WP04-CONCH-20261011-S13** | CFIA, [Importing live and raw molluscan shellfish](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/importing-fish-and-shellfish/molluscan-shellfish) | Defines the scope of a specific import regime and examples including whelks and abalone. Does not determine conch import conditions. |

## Integration recommendation

1. Keep `conch / conque` held, with no active reference, alias, form, quantity, recipe link, or substitution.
2. Reopen only when a recipe or supplied product specifies the species and food product. For a documented Queen Conch target, use species-qualified evidence such as OQLF *strombe géant* and reconcile the exact package and current CFIA common-name requirements before proposing catalog labels.
3. Keep Queen Conch separate from *Busycon* whelks, *Buccinum* whelk, abalone, sea cucumber, periwinkle, other gastropods, and generic seafood.
4. Leave WP04 Section P open. See the separate [whelk review](wp04-whelk-species-product-boundary-review-20261011.md), [abalone review](wp04-abalone-ormeau-species-product-boundary-review-20261011.md), and [sea-cucumber review](wp04-sea-cucumber-species-product-boundary-review-20261011.md).
