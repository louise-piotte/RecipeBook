# WP04 Section P R452 — American lobster tail product-boundary review

- **Review and source-access date:** 2026-10-17.
- **Candidate:** frozen American-lobster tail / `queue de homard` market products, distinct from the whole-lobster identity.
- **Recommendation:** Keep a hypothetical **American lobster tail / queue de homard d’Amérique** identity unallocated. Current Canadian and Québec-facing listings establish the product, and one Metro listing identifies *Homarus americanus*, but an active English display such as `American lobster tail` would make the bare picker query `lobster tail` resolve to that row alone. OQLF maps that English term to `queue de langouste` (spiny/rock lobster), not `queue de homard`. The current picker cannot preserve that distinction. Do not add a row, form, alias, ledger record, numeric behavior, recipe link, or substitution.
- **Parent:** The WP04 Section P catalog work remains open. This is a product-cut review following the integrated American-lobster identity; it does not reopen the species row or alter the crab, langoustine, langouste, or European-lobster boundaries.
- **Status:** Root-reviewed and recorded as a documentation-only hold; see
  `docs/catalog/batches/wp04-section-p-american-lobster-tail-hold-integration-r452-20261017/README.md`.
- **Proposal-local source IDs:** `WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-S01` through `S04`; audit label `WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-R01`. These are evidence labels in this proposal, not ledger allocations. Reused evidence keeps its existing source ID.

## Why this is a distinct open product boundary

The integrated `ingredient-ref-lobster` row represents *Homarus americanus* as `American lobster / homard d’Amérique`, with `lobster` and `homard` among its aliases. Its reviewed integration explicitly keeps products such as lobster tails separate and adds no forms. The related ledger record has no tail product identity or form. This review addresses that excluded cut alone; the existing American-lobster identity, European-lobster row, and `langoustine / scampi` identity remain unchanged.

Current Canadian product evidence is concrete. Poissonnerie La Mer in Montréal lists **Canadian Lobster Tails** and describes frozen raw Canadian tails. Metro’s Québec listing is titled **Queue de homard surgelée** and its indexed ingredient detail identifies *Homarus americanus*. Costco Business Centre Canada currently lists **South Shore - Queue du homard 4/5 surgelée**. MAPAQ’s Québec crustacean sheet lists *H. americanus* tail products in multiple frozen/cooked and meat presentations. These sources support a distinct product boundary and local market wording; they do not erase the English/French terminology collision described below.

OQLF’s GDT entry for `queue de langouste` gives `lobster tail`, `spiny lobster tail`, and `rock lobster tail` as English terms. Its note says that English `lobster tail` is called `queue de langouste` or `langouste`, not `queue de homard`, because English `lobster` can refer to either homard or langouste. The Canadian retailers use `lobster tail` for products they describe as Canadian lobster, so the market sources and the OQLF terminology boundary expose a real search ambiguity. [S01–S04; reused source IDs below]

## Candidate scope and exclusions

The product under review is the tail cut of the species-qualified active American-lobster identity, *Homarus americanus*. Metro’s current indexed listing pairs `Queue de homard surgelée` with that Latin name; MAPAQ identifies Québec American lobster and separately lists its tail products. La Mer’s English/French product presentation uses `Canadian Lobster Tails` and `Queue de homard canadien congelée`. These are product-level attestations, not support for changing the existing whole-lobster identity.

The proposal does **not** treat the unqualified English phrase `lobster tail` as a safe alias for American lobster. OQLF assigns that phrase to langouste in its Québec seafood terminology entry. Do not map the phrase to `ingredient-ref-langoustine`; that row is `langoustine / scampi`, and it is not the OQLF’s langouste/rock-lobster boundary. Keep European lobster, spiny/rock lobster, langouste, langoustine, whole lobster, picked lobster meat, and lobster paste distinct.

The possible display `American lobster tail / queue de homard d’Amérique` is an audit aid, not an allocation. Even with that qualified name and no bare `lobster tail` alias, the current picker treats `lobster tail` as a complete phrase within the longer display and returns the proposed row alone. A qualifying adjective therefore does not protect the bare query under the current search behavior.

## Live ownership, archive, and ID audit

The live snapshot for this review contains **1,742 active ingredient references**, **141 forms**, **56 legacy-import candidates**, and **2,101 research-ledger records** with **9,564 source entries**, **8,113 distinct source IDs**, and **6,826 distinct URLs**. The bundled manifest lists **114 recipe files and 1,123 ingredient rows**.

| Surface | Current owner or overlap | R452 disposition |
|---|---|---|
| Active reference names and aliases | `ingredient-ref-lobster` owns `American lobster / homard d’Amérique`, including `lobster`, `North American lobster`, `homard`, and `homard américain`. `ingredient-ref-european-lobster` owns `European lobster / homard européen`. No active name or alias exactly owns `American lobster tail(s)`, `lobster tail(s)`, or `queue(s) de homard`. | Do not modify either species identity or add a product row. |
| Active forms | No form label or match term owns the candidate tail or queue phrases; there are 141 current forms. The American-lobster row has no tail form. | Do not add a same-ingredient form for a separate anatomical cut. |
| Legacy candidates | Exact normalized-name and candidate-ID checks found no tail owner among the 56 legacy-import candidates. | Add no legacy mapping. |
| Research ledger | `ingredient-ref-lobster` is the accepted whole-species identity. It mentions tail wording only as an excluded product from the earlier review; there is no `ingredient-ref-american-lobster-tail` or `candidate-american-lobster-tail` record. | Keep both candidate IDs and all source evidence proposal-local. |
| Prior proposal and integration archive | The 2026-10-12 generic lobster review explicitly excluded `lobster tail` from aliases and forms and found no exact owner at that time. Its integration added only the species row. No separate tail allocation or tail-form integration was found. | Treat this as a new product-boundary review, not a reopening of the accepted species decision. |
| Source and path allocation | The R452 proposal path, `ingredient-ref-american-lobster-tail`, `candidate-american-lobster-tail`, and source prefix were checked against the current catalog, ledger, proposals, and batches. The new retailer/OQLF URLs below have no exact ledger URL collision; species and MAPAQ evidence are reused under their existing source IDs. | R452 identifiers remain unallocated pending root review. |

The earlier archive reference is [WP04 lobster / homard identity boundary review](wp04-section-p-generic-lobster-homard-identity-review-20261012.md) and its [American-lobster integration README](../batches/wp04-section-p-american-lobster-identity-integration-20261012/README.md). The earlier exclusion is useful scope evidence; it did not allocate a tail identity.

## Picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): all search terms are normalized, complete word phrases are preferred, and partial matching is the fallback. The hypothetical row uses only `American lobster tail / queue de homard d’Amérique`, plus the grammatical plural variants `American lobster tails` and `queues de homard d’Amérique`. It does not add bare `lobster tail` as an alias.

| Query | Current results | With hypothetical row | Consequence |
|---|---:|---:|---|
| `American lobster tail` | 0 | 1 — hypothetical American-lobster tail | Qualified product query would work. |
| `queue de homard d’Amérique` | 0 | 1 — hypothetical American-lobster tail | Qualified French product query would work. |
| `lobster tail` | 0 | 1 — hypothetical American-lobster tail | **Unsafe singleton:** the phrase is contained in the qualified display, even though OQLF maps this English term to langouste. |
| `queue de homard` | 0 | 1 — hypothetical American-lobster tail | Returns the Canadian product’s bare market wording without the species qualifier. |
| `American lobster` | 1 — whole American lobster | 2 — whole lobster and tail cut | A real cut choice would appear. |
| `lobster`; `homard` | 2 each — American and European lobster | 3 each — adds the tail cut | Broad species-name searches remain multiple-choice. |
| `queue de langouste`; `langouste` | 0 | 0 | No alias or result is transferred to langouste. |

The picker makes the core problem explicit: the identity could be searched by a qualified phrase, but it would also capture the shorter `lobster tail` phrase as a unique result. The reviewed terminology does not support that assignment.

## Full manifest recipe scan

All **114 manifest-listed recipe JSON files and all 1,123 structured ingredient rows** were parsed. Complete recipe JSON text and every ingredient row were scanned for `American lobster tail(s)`, `North American lobster tail(s)`, `lobster tail(s)`, `queue(s) de homard`, `homard d’Amérique`, `queue(s) de langouste`, and `langouste`. The scan found **zero matching files and zero matching ingredient rows**. The recipe bundle has no tail-cut demand, species choice, amount, preparation method, or recipe link. This finding applies to the bundled 114-recipe corpus only.

## Numeric, form, and substitution boundaries

- **Forms:** Add no `raw`, `frozen`, `cooked`, or `shell-on` form under `ingredient-ref-lobster`. The tail is an anatomical cut with product states, not a same-ingredient conversion chain. No form is proposed under the langoustine row.
- **Numbers and measures:** Add no count, density, mass mapping, package yield, portion, conversion, or edible-yield observation. MAPAQ lists processor product/grade sizes; La Mer lists seller-specific size options and 2-unit or bulk formats; Costco lists its 2.27 kg / 4–5-per-pound SKU; Metro’s indexed listing shows an approximate 113 g item. These values do not establish one tail mass or a reusable count-to-mass rule. La Mer’s seller claim about edible-flesh recovery under its high-pressure process is specific to that product and is not a general yield.
- **Substitution:** Add no rule between lobster tail and whole lobster, lobster meat, lobster claws, European lobster, langouste/rock lobster, langoustine/scampi, or crab. The sources establish products and terms, not interchangeable recipe roles or amounts.
- **Ledger state:** Do not create an identity or candidate ledger record in this hold. If a future review can resolve the picker boundary, reassess identity, measurements, and substitutions separately from this evidence packet.

## Sources and limitations

New source IDs were assigned after checking the current ledger and archive. The current OQLF, La Mer, Metro, and Costco URLs below are proposal-local sources. The CFIA, OQLF American-lobster, and MAPAQ references are reused from `ingredient-ref-lobster` under their existing source IDs; the old lobster integration is not treated as a new source.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-S01** | Office québécois de la langue française, [queue de langouste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363515/queue-de-langouste), last updated 2002. | Gives `queue de langouste` / `langouste` as preferred French terms and `lobster tail`, `spiny lobster tail`, and `rock lobster tail` in English. It explicitly warns against translating English `lobster tail` as `queue de homard`. This is a terminology entry, not a current retailer inventory survey. |
| **WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-S02** | Poissonnerie La Mer, Montréal, [Canadian Lobster Tails](https://www.lamer.ca/en/products/queue-de-homard-canadien-congele), current product page. | The title is `Canadian Lobster Tails`; the French product image/title text is `Queue de homard canadien congelée`. The description calls the item frozen raw Canadian lobster tail and offers seller-specific size and package options. The page does not show a Latin species name; do not infer a universal state, size, package, or yield. |
| **WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-S03** | Metro Québec, [Queue de homard surgelée, item 208661](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/queue-de-homard-surgelee/p/208661), current indexed listing. | The indexed product title and details pair `Queue de homard surgelée` with *Homarus americanus* and Northwest Atlantic provenance; it shows approximately 113 g. Direct product-page retrieval returned 403 and the index showed out of stock. Rely only on the visible title/species pairing, not on stock, price, package amount, or contents beyond the indexed detail. |
| **WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-S04** | Costco Business Centre Canada, [South Shore - Queue du homard 4/5 surgelée](https://www.costcobusinesscentre.ca/p/-/south-shore-frozen-lobster-45-tails-227-kg/2001121709?DM_PersistentCookieCreated=true&langId=-25&remoteHost=app05), item 3505555. | Current Canadian French listing uses `Queue du homard surgelée` and shows one 2.27 kg, 4–5-per-pound SKU. Delivery is limited by region and can change. The page does not name a species, and its package/grade data are not recipe measures. |
| **Reused `WP04-LOBSTER-HOMARD-20261012-S01`** | CFIA Fish List, *Homarus americanus* result cited in the [integrated lobster review](wp04-section-p-generic-lobster-homard-identity-review-20261012.md). | Reuse for the Canadian species/name boundary only; it does not identify a tail cut or resolve the English term `lobster tail`. |
| **Reused `WP04-LOBSTER-HOMARD-20261012-S05`** | OQLF GDT / Faune et flore du pays, [homard d’Amérique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573556/homard-damerique), 2024. | Pairs *Homarus americanus* with `homard d’Amérique` and `North American Lobster`. Species evidence, not cut terminology. |
| **Reused `WP04-LOBSTER-HOMARD-20261012-S07`** | MAPAQ, [Les crustacés du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), American-lobster presentation table. | Identifies *H. americanus* and lists tail and tail-meat presentations with commercial size/package bands. Industry descriptions do not establish household portions, count-to-mass conversions, or edible yield. |
| **WP04-SECTIONP-AMERICAN-LOBSTER-TAIL-R452-20261017-R01** | Read-only audit of the Section P checklist, active references/forms, legacy candidates, research ledger, source URL and ID inventory, lobster proposals/batches, picker implementation, numeric/substitution files, manifest, and all bundled recipe files. | Confirms the live snapshot, exact-owner and allocation checks, simulated picker projection, and complete 114-file/1,123-row recipe scan. Repository evidence only. |

## Disposition and revisit condition

**Keep the American-lobster-tail candidate unallocated.** The reviewed sources establish a real Canadian/Québec product and a defensible species-specific boundary, while OQLF assigns bare English `lobster tail` to langouste. Under current phrase-first search, even the qualified display `American lobster tail` owns that bare query as a singleton. The recipe bundle does not request the product, so it provides no reason to accept that search risk.

Reopen when picker behavior can keep `American lobster tail` and `queue de homard d’Amérique` useful for qualified searches while preventing bare `lobster tail` from resolving to the American-lobster cut alone, or when a reviewed common-name model represents both lobster and langouste tails without a false singleton. Until then, keep the tail separate from the whole-lobster identity in the evidence record and add no catalog or ledger allocation. Section P remains open.
