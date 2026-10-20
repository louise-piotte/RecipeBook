# WP04 Section P — blackfin sea bass / bar à nageoires noires picker-boundary review (R328)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** *Lateolabrax latus* (CFIA TSN 643281), Blackfin Sea Bass / Bar à nageoires noires.
- **Recommendation:** Keep the species outside active references and the research ledger. CFIA provides a Canadian bilingual name pair and a Canadian Japanese-seafood distributor's catalogue lists the English product name, but the current picker would make broad `sea bass`, `blackfin`, and `bar` searches misleading single-result searches. No bundled recipe selects the fish, and no current Québec product label using the species-qualified pair was verified.
- **Scope:** One species-specific gap under the open Section P finfish checklist. This review does not revisit R323 splendid alfonsino, the separate *Centropristis striata* / black sea bass hold, or the *Thunnus atlanticus* / blackfin-tuna hold.
- **Status:** Proposal-only. No shared catalog JSON, forms, legacy identities, ledger, plan, roadmap, generated Kotlin, recipes, or application code changed. No software tests or builds were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S01` through `S05`, plus audit ID `WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-A01`. They remain unallocated and are not shared-ledger source entries.

## Why this is a distinct open gap

The live [Section P finfish parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L5737) remains open. Its nested decisions include a hold for *Centropristis striata* / black sea bass, and R162 holds *Thunnus atlanticus* / blackfin tuna. Both are different taxa from *Lateolabrax latus*. The prior black-sea-bass proposal records *L. latus* as one of several neighbouring CFIA names; it does not review this species' Canadian product evidence or its own prospective catalog row. R162 also identifies the shared `blackfin` name component as a collision, without allocating or reviewing *L. latus* itself. This packet evaluates only the latter species and does not reopen either accepted hold.

The current Canadian Food Inspection Agency (CFIA) Fish List pairs TSN 643281 and *Lateolabrax latus* with **Blackfin Sea Bass / Bar à nageoires noires**. The list separately assigns `Black Sea Bass / Fanfre Noir` and French-only `Bar noir` to *Centropristis striata*, `Asian Seabass / Bar d'Asie` to *L. japonicus*, and multiple other `bass` names to other fish. These are Canadian fish-label names, not claims that the fish are culinary substitutes. [S01, S02]

The public catalogue for Tsukiji Ohta, distributed by Ozawa Canada, contains a **HIRA SUZUKI / 平鱸 — BLACKFIN SEA BASS** entry. Its catalogue describes a wild whole fish, gives the supplier's size band as 3.31–4.41 lb, and lists possible applications including raw, baking, grilling, simmering, deep-frying, and pan-frying. Ozawa says its fresh-fish orders are processed at Tokyo's Toyosu market and flown to Toronto for business delivery twice weekly; it also lists a Montréal-area office. This establishes a Canadian seafood-distribution context and a product name in the distributor's catalogue, but the product entry itself supplies no binomial, and the company page does not confirm that this particular fish is currently offered to Montréal customers. Treat the size band and preparation notes as supplier-specific details only. [S03, S04]

Targeted OQLF GDT searches did not return a *Lateolabrax latus* entry or a Québec-preferred term for the CFIA phrase `bar à nageoires noires`. Therefore, that French display is supported here as CFIA bilingual label wording, not as an independently confirmed OQLF-preferred Québec consumer name. OQLF's separate entry for **bar noir** concerns *Centropristis striata* / black sea bass; do not shorten this candidate to `bar noir` or use it as an alias. [S05]

## Ownership and archive audit

The live snapshot contains **1,677 active ingredient references, 127 forms, 59 legacy-import candidates, and 2,024 research-ledger records**. Accent- and punctuation-normalized exact-key checks covered reference IDs, bilingual displays and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs and identity decisions.

No active or legacy owner was found for `blackfin sea bass`, `bar à nageoires noires`, `Lateolabrax latus`, `Hira Suzuki`, or the prospective `ingredient-ref-blackfin-sea-bass` / `candidate-blackfin-sea-bass` IDs. The exact display wording and ID are not present in the research ledger. The proposal and batch archive has no dedicated *L. latus* review or allocation. Its only prior treatment is comparative: the black sea-bass review lists this CFIA name among related taxa, and R162 cites it to document the separate blackfin-tuna name collision. These mentions do not create a row or ledger identity for *L. latus*.

The proposal-local source-ID prefix `WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-` was absent from the live ledger before this proposal. Existing CFIA overview data is already sourced in the ledger; if this candidate is later reconsidered for integration, reuse an applicable existing CFIA-overview source rather than duplicating that general source record. No source ID or URL is allocated by this proposal.

## Picker projection

The read-only projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases win over substring fallback. It compares the live reference/form terms with a hypothetical alias-free `blackfin sea bass / bar à nageoires noires` row.

| Query | Current result | With hypothetical row | Boundary |
|---|---|---|---|
| `blackfin sea bass` | None | Blackfin sea bass only | The full CFIA English name is species-qualified. |
| `bar à nageoires noires` | None | Blackfin sea bass only | The full CFIA French label is qualified, but Québec consumer usage was not independently verified. |
| `sea bass` | None | Blackfin sea bass only | CFIA uses the broader sea-bass name component for *L. japonicus*, *D. labrax*, *C. striata*, and other taxa. The picker would hide that scope. |
| `blackfin` | None | Blackfin sea bass only | CFIA also assigns Blackfin Tuna / Thon à nageoires noires to *Thunnus atlanticus*. R162 holds that tuna separately; this row alone would not expose both taxa. |
| `bar` | 38 substring-fallback references | Blackfin sea bass only | The complete French word in the display would win phrase-first matching and suppress the 38 current fallback results. |
| `bass` | Largemouth bass; smallmouth bass | Those two plus blackfin sea bass | This query remains multi-result, but the full `sea bass` query does not. |
| `black sea bass`; `bar noir`; `Fanfre Noir` | None | None | Keep these terms on the separate *C. striata* boundary; add no cross-species aliases. |
| `Hira Suzuki`; `平鱸` | None | None | The Japanese supplier wording is recorded as source-specific catalogue text, not activated as an English or French alias. |

Omitting aliases cannot prevent the single-result effect: `sea bass`, `blackfin`, and `bar` are words in the proposed bilingual display. Keep this row unallocated until the picker can preserve these broader name families or a reviewed search model can present the competing species.

## Bundled-recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. A read-only scan of full decoded recipe JSON and ingredient rows covered `blackfin sea bass`, `black fin sea bass`, `blackfin`, `bar à nageoires noires` and its accent-folded spelling, *Lateolabrax latus*, `Hira Suzuki`, and `hirasuzuki`. It found **zero matching recipe files and zero matching ingredient rows**. There is no bundled recipe link, recipe-specific amount, role, preparation method, or substitution basis for this candidate. [A01]

## Forms, measures, and substitutions

- **Forms and product state:** The Ozawa/Tsukiji Ohta catalogue calls its item whole fish, but gives no package identifier, orderable quantity, or species binomial on that product entry. Keep this supplier record out of active forms. It does not establish that all products sold as blackfin sea bass share a whole-fish state.
- **Measures and yield:** The catalogue's 3.31–4.41 lb band is a supplier size range for that whole-fish entry, not a serving, recipe amount, count conversion, standard purchase unit, or edible-yield measure. No species-matched Canadian Nutrient File amount was verified in this review; this is not proof that the 2026 CNF has no such record. No active measure, density, mapping, conversion, or yield is supported.
- **Substitutions:** The available product and label sources establish identity and naming only. The bundled recipe corpus provides no dish or amount context, and no reviewed source establishes a directed, method- and role-scoped substitution to *L. japonicus*, *D. labrax*, *C. striata*, blackfin tuna, or another fish. Add no global or contextual substitution, warning, or recipe-line link.
- **Food handling:** The distributor's possible-use icons are not validated cooking, raw-consumption, storage, or safety guidance for a selected recipe. Infer no safety equivalence from the name, taxonomic relationship, or listed preparation applications.

## Conditional identity shape

This is a future reference shape only, not an active row or reserved identifier:

| Field | Conditional value |
|---|---|
| ID | `ingredient-ref-blackfin-sea-bass` |
| Category | `PROTEIN` |
| English display | `blackfin sea bass` |
| Québec French display | `bar à nageoires noires` — CFIA-supported; OQLF/consumer usage not confirmed |
| Taxon | *Lateolabrax latus* (CFIA TSN 643281) |
| English/French aliases | None proposed |
| Forms, default density, unit mappings, recipe links | None |
| Measures, conversions, yields, substitutions | Unknown / unsupported |

## Proposed delta

**No catalog or shared-ledger delta is proposed.** Keep *Lateolabrax latus* outside active references, forms, legacy mappings, and the research ledger. Do not add `blackfin sea bass` to a different fish, use `bar noir`, `black sea bass`, or `Hira Suzuki` as aliases, or allocate the supplier's weight band as a kitchen measure. Reopen if a bundled recipe or a current Québec package identifies the species and the picker can show this taxon alongside the other CFIA species sharing `sea bass`, `blackfin`, and `bar`.

## Sources

Online sources were checked on 2026-10-16. Proposal-local source IDs are not ledger allocations.

| Source ID | Source | Finding and limit |
|---|---|---|
| **WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S01** | CFIA, [Fish List search for Blackfin Sea Bass](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Blackfin%20Sea%20Bass) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | The current result pairs *Lateolabrax latus*, TSN 643281, with `Blackfin Sea Bass / Bar à nageoires noires`. The list is Canadian fish-label naming evidence, not recipe equivalence or a traceability guarantee for every product. The general overview URL is already represented in the research ledger. |
| **WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S02** | ITIS, [*Lateolabrax latus*, TSN 643281](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=643281). | Lists the taxon as a valid species. Taxonomic cross-check; it does not establish Canadian retail supply or kitchen measurements. |
| **WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S03** | Ozawa Canada, [Tsukiji Ohta fresh-fish program](https://ozawa.ca/tsukijiohta/). | Describes a Tokyo-to-Toronto fresh-fish route, twice-weekly business delivery, and Toronto and Montréal-area offices. It does not confirm availability of this fish in Montréal. |
| **WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S04** | Ozawa Canada / Tsukiji Ohta, [seafood catalogue](https://ozawa.ca/wp-content/uploads/2024/12/Tsukiji-Ohta-Catalog.pdf), accessed 2026-10-16. | Indexed text for the entry `HIRA SUZUKI / 平鱸 — BLACKFIN SEA BASS` lists a wild whole fish, supplier size band 3.31–4.41 lb, and application icons. Direct PDF opening returned an internal error in the review tool. The entry gives no binomial, product code, consumer package, or French label; treat the indexed text, size, and applications as supplier-specific. |
| **WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-S05** | OQLF, [GDT: bar noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198928/bar-noir). | The distinct OQLF term `bar noir` belongs to *Centropristis striata* / black sea bass. Targeted OQLF searches did not return a GDT entry for *L. latus* or `bar à nageoires noires`; do not transfer `bar noir` to this candidate. |
| **WP04-SECTIONP-BLACKFIN-SEA-BASS-R328-20261016-A01** | [Open Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5737), current active references/forms/legacy identities/ledger, manifest-listed recipe corpus, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only ownership, proposal/batch archive, source-ID-prefix, current picker-projection, and recipe-demand audit. No catalog or shared-ledger values were allocated. |

## Final disposition

**Hold** *Lateolabrax latus* outside the active picker and ledger. The species and Canadian bilingual Fish List name are verified, and a Canadian distributor's catalogue offers a corresponding English-named whole-fish entry. The French term lacks independent Québec consumer/OQLF confirmation, and the current phrase-first picker would make broad `sea bass`, `blackfin`, and `bar` queries return this species alone. The bundle contains no recipe demand. Preserve the separate R162 blackfin-tuna and black-sea-bass decisions; no aliases, forms, measures, recipe links, conversions, yields, or substitutions are proposed.
