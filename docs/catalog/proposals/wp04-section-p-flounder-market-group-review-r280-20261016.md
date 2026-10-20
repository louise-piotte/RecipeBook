# WP04 Section P — flounder / plie market-name gap review (R280)

- **Review and source-access date:** 2026-10-16.
- **Packet type:** Proposal-only Canadian/Québec fish naming, market-group, picker, ownership, recipe-demand, product, measurement, conversion, and substitution review.
- **Checklist item:** The open Section P finfish line at [plan line 5607](../../RecipeBook-global-ingredient-catalog-plan.txt#L5616) includes sole, flounder, and regional fish.
- **Recommendation:** Represent the unqualified English **flounder** and French **plie** searches as an identity-only, species-neutral name group whose bilingual display says that the wording applies to multiple fish species. Keep the group distinct from the R277 sole market group and from species-specific fish.
- **Scope:** This review covers only the broad name boundary for **flounder / plie**. It does not decide a fish taxon, a fillet form, the identity of any product titled “flounder” or “plie,” or a relationship to the distinct sole market group. It does not change the existing holds for yellowtail or winter flounder, nor reopen turbot or any other flatfish decision.
- **Status:** Integrated on 2026-10-16. The accepted identity-only row, research-ledger record, Section P checklist item, roadmap entry, and static verification are recorded in the [R280 integration README](../batches/wp04-section-p-flounder-market-group-integration-r280-20261016/README.md).
- **Proposed integration README path:** `docs/catalog/batches/wp04-section-p-flounder-market-group-integration-r280-20261016/README.md`.
- **Proposal authoring scope:** At creation, this packet changed only the proposal file. The subsequent integration is recorded in the README. No software tests, builds, or emulator checks were run because the integration only adds database JSON data and documentation under `AGENTS.md`.

## Why this is a distinct bounded gap

The current Section P parent checklist still names flounder among the uncovered finfish at [plan line 5607](../../RecipeBook-global-ingredient-catalog-plan.txt#L5616). The earlier [finfish-gap review](wp04-finfish-gaps-20261010.md) kept broad sole/flounder terms unresolved, and the [yellowtail-flounder boundary review](wp04-section-p-next-seafood-batch-20261012.md) held a species row because it would make a broad `flounder` query look species-specific. The [winter-flounder review](wp04-section-p-winter-flounder-identity-boundary-review-20261013-round16.md) likewise preserves its species hold for that picker reason.

R277 subsequently represented the separate **sole** search with an explicitly qualified multi-species market group. Its accepted row keeps `flounder` and `plie` out of its aliases and display. This packet considers only whether the broad **flounder / plie** query itself merits a similarly explicit name group. It does not activate yellowtail flounder, winter flounder, American plaice, or another taxon. The group would represent overlapping common-name use, not a taxonomic rank or an exhaustive set of fish species.

## Canadian and Québec name boundary

CFIA describes its Fish List as a source of English and French common fish names acceptable for Canadian labelling, paired with scientific names and taxonomic serial numbers. [Reused overview source WP04-FINFISH-GAPS-20261010-S11] The live results associate **Flounder** and/or **Plie** names with numerous distinct taxa. Examples include *Glyptocephalus cynoglossus* and *G. zachirus*, each listed with `Flounder / Plie`; *Hippoglossoides platessoides*, listed with `Flounder` as well as species-qualified plaice names; and *Limanda ferruginea*, listed as Yellowtail Flounder and with the broad Flounder / Plie terms. Other rows use one of these terms alongside a different French or English common name. These are species-linked labelling names, not a recipe equivalence list. [Reused query source WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02]

OQLF’s [filet de plie entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298292/filet-de-plie) is explicit about the Québec boundary. It describes several Québec-caught flatfish sold under the North American commercial name **sole**, including grey sole, American plaice, winter flounder, and yellowtail flounder, and says these fish are flounders. The entry prefers **filet de plie** and discourages **filet de sole**. It was last updated in 1984, so it supports terminology distinctions, not current stock or universal product composition. Reuse its existing source allocation, **WP04-SECTIONP-SOLE-MARKET-GAP-R277-20261016-S01**; do not create a duplicate ledger source for the same page.

Current Québec-facing product wording confirms that `plie` remains visible in species-qualified product descriptions without establishing that the bare term identifies one taxon. Les Pêcheries Gaspésiennes lists fresh **plie canadienne** when available and a frozen **filet de plie canadienne**. That page URL already appears in the ledger under R167’s smoked-fish work; here the cited lines are separate, non-smoked product entries. Super C lists **Plie à grande bouche Blue Tide 907 g** as a seasonal frozen product. The captured page snapshot labels it unavailable, but the available browser capture is stale and does not establish current stock. Its page does not identify the species composition, and 907 g is a package-specific net weight. Neither listing establishes a bare `flounder` or `plie` product’s taxon, stock status, kitchen portion, or yield. [Sources S01–S02]

Taken together, the CFIA name rows and Québec terminology support a broad visible search group. They do not support assigning either broad word to American plaice, yellowtail flounder, winter flounder, arrowtooth flounder, or any other single species. The English and French search displays should be qualified but should not assert that every use of each word maps to one exhaustive matching set.

## Picker projection

The projection follows the live phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The picker displays the localized ingredient name, so the multi-species scope must appear in the visible display.

| Query | Before integration | Integrated result | Boundary |
|---|---|---|---|
| **flounder** | No result. | The group only, displayed as **flounder (name used for multiple fish species)** / **plie (nom utilisé pour plusieurs espèces de poissons)**. | The visible qualifier says the result does not select a single taxon. |
| **plie** | American plaice / plie canadienne. | American plaice plus the group. | Keep the species-qualified American plaice result distinct; the group adds a broad-name choice. |
| **plie canadienne** / **American plaice** | American plaice / plie canadienne. | Unchanged. | Do not add these terms as aliases to the group. |
| **sole** | R277 sole market group. | Unchanged. | Keep the sole market group separate and outside this row’s terms. The two broad names may overlap in fish usage; they are not conversion or substitution identities. |
| **filet de plie** / **filet de sole** | No result. | No result. | No fillet form or alias is proposed. |
| **yellowtail flounder**, **winter flounder**, **turbot** | No result. | No result. | The broad group does not add the species-qualified or turbot phrase. Existing species holds remain as recorded. |

With the integrated row, a bare **flounder** query resolves to a result whose displayed qualifier names its broad scope. A bare **plie** query has two visibly distinct results: a species-specific American plaice reference and the broad name group. The integrated row adds no species alias and does not use the group to bypass the existing picker holds for specific taxa.

## Integrated identity-only catalog shape

The accepted integration uses this identity-only shape. Active data and validation details are recorded in the integration README.

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-flounder-market-group` |
| Category | `PROTEIN` |
| English display | **flounder (name used for multiple fish species)** |
| Québec French display | **plie (nom utilisé pour plusieurs espèces de poissons)** |
| Aliases | None |
| Taxon | None; this is a name group, not a species or taxonomic group. |
| Forms, density, unit mappings | None |
| Recipe links, measures, yields, conversions, substitutions | None |

Do not add **American plaice**, **plie canadienne**, **yellowtail flounder**, **limande à queue jaune**, **winter flounder**, **plie rouge**, **sole**, **common sole**, **sole commune**, **filet de plie**, **filet de sole**, **turbot**, or scientific names as aliases. Keep `ingredient-ref-sole-market-group` distinct and unchanged. If a later recipe or product requires one of these species or a cut/product state, resolve that source-specific identity separately.

## Recipe demand and measures, conversions, and substitutions

The manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. Whole-phrase checks covered each file and its ingredient rows for `flounder`, `plie`, sole/common-sole terms, `American plaice`, `yellowtail flounder`, `winter flounder`, their reviewed French names, *Solea solea*, *Limanda ferruginea*, *Myzopsetta ferruginea*, and turbot. There were **zero matching recipe files and zero matching ingredient rows**. No recipe link, species, form, or recipe quantity follows from the current bundle.

There are no active flounder/plie forms, density values, unit mappings, or numeric observations. The American-plaice, R277 sole-group, and R280 flounder-group references have null densities and empty unit mappings. The shared substitution files contain no global or contextual rule; the package-yield file contains one unrelated entry; and the R280 ledger record has no supported measurement or unit conversion. The 907 g Super C package is a retail pack size, not a per-fillet mass, serving, edible yield, or conversion factor. No source supports a same-ingredient form conversion, global or contextual substitute, warning rule, or recipe-line substitution link. Keep all such behavior absent.

## Ownership, source-ID, and archive audit

The read-only snapshot before R279 integration contained **1,658 active references**, **125 forms**, **61 legacy-import candidates**, and **2,006 research-ledger records**. At proposal preparation, exact ID checks found no owner for `ingredient-ref-flounder-market-group` in active references, forms, legacy candidates, or ledger record IDs. Exact normalized-name checks found no active fish reference or form for **flounder** or the proposed multi-species display. **Plie** was present on the active species-specific **American plaice / plie canadienne** reference; it was not an owner for the proposed group. **Sole** belonged to the separate R277 multi-species sole row. A string-only form-note scan found an unrelated use of “applies” in the Hungarian wax-pepper notes; it is not a matching display, alias, or search term.

Before this proposal was created, the source prefix **WP04-SECTIONP-FLOUNDER-MARKET-GROUP-R280-20261016-** and its proposed new source ID **S01** were unallocated in the ledger and existing proposal/batch archive. The Super C URL had no prior ledger or proposal/batch allocation. The CFIA overview URL is already represented in the ledger by **WP04-FINFISH-GAPS-20261010-S11**, which is reused for that single URL. The CFIA flounder-query ID **WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02** appears in prior proposal history but not the ledger; reuse it only for the query-results URL so root can register one URL for that source entry. The OQLF `filet de plie` URL is already registered to the R277 sole-market-group record; its R277 source ID is reused. The Pêcheries Gaspésiennes page URL is already recorded under R167; this packet reuses that page/source ID with a new, record-specific locator for the `plie canadienne` lines and scoped support text, without changing R167’s smoked-fish evidence.

Prior-work boundary:

- The [2026-10-10 finfish-gap review](wp04-finfish-gaps-20261010.md) held broad sole/flounder terms because the source names span multiple taxa. This proposal keeps that species boundary and evaluates only an explicitly qualified result for the unqualified search.
- The [yellowtail-flounder review](wp04-section-p-next-seafood-batch-20261012.md) and [winter-flounder review](wp04-section-p-winter-flounder-identity-boundary-review-20261013-round16.md) keep those species outside active references. This proposal does not remove those holds or create aliases for the species.
- R277 added the separate [sole market group](../batches/wp04-section-p-sole-market-group-integration-r277-20261016/README.md) and explicitly excluded `flounder` and `plie` from that row. The R280 group preserves that exclusion.
- No prior proposal or batch allocates `ingredient-ref-flounder-market-group` or recommends an identity-only multi-species `flounder / plie` row. Historical broad-name holds are treated as boundaries, not as ownership of this proposed ID.

The proposal does not claim the historical holds were never reviewed: it evaluates a separate market-group representation of the broad query after the R277 sole-group integration. The accepted group and all species-specific decisions remain separately visible in picker results.

## Sources

Sources were accessed or rechecked on 2026-10-16 except the Super C listing, which was available only as a stale last-year browser snapshot. Its product wording and package size are retained as snapshot evidence; its availability is not treated as current. This source register records the evidence reviewed before integration; source allocations and record-specific locators are now in the research ledger.

| Source ID | Source and evidence | Limit |
|---|---|---|
| Reused ledger ID `WP04-FINFISH-GAPS-20261010-S11` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). The overview describes the list’s acceptable English/French fish-labelling names and corresponding scientific names / taxonomic serial numbers. | Canadian fish-labelling scope; it does not establish recipe or substitution equivalence. This row contains one URL. |
| Registered at integration under proposal-history ID `WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02` | CFIA, [Flounder results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=flounder). The results associate Flounder and Plie wording with multiple taxa. | Canadian fish-labelling names, not ingredient equivalence. The ledger entry owns only this query-results URL. |
| Reused: `WP04-SECTIONP-SOLE-MARKET-GAP-R277-20261016-S01` | OQLF GDT, [filet de plie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298292/filet-de-plie). The note names several Québec flatfish sold commercially as sole, states that these fish are flounders, and prefers `filet de plie` over `filet de sole`. | Last updated 1984; used for terminology scope, not present-day stock. This source is already registered by R277. |
| Reused: `WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S03` | Les Pêcheries Gaspésiennes, [products](https://pecheriesgaspesiennes.com/produits/). Use a new record-specific locator for lines 75 and 98: fresh `Plie canadienne` when available and frozen `Filet de plie canadienne`. | Product wording is species-qualified, and availability is conditional. Reuse the existing URL/source ID with plie-specific locator and support text for this record; leave R167’s smoked-fish support unchanged. |
| `WP04-SECTIONP-FLOUNDER-MARKET-GROUP-R280-20261016-S01` | Super C, [Plie à grande bouche Blue Tide 907 g](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/plie-a-grande-bouche/p/836443033165). The captured page snapshot shows a frozen product and 907 g package. | The snapshot labels the listing seasonal and unavailable, but it is stale last-year evidence and does not verify current availability. The page does not state species composition. Package weight is SKU-specific and is not a kitchen measure. |

## Integration decision

Added `ingredient-ref-flounder-market-group` as the identity-only bilingual name group specified above. The visible qualifier preserves broad common-name scope in the picker; no taxon, alias, product state, form, measurement, recipe link, conversion, yield, or substitution follows from these sources. R277’s sole market group and all species-level holds remain unchanged. The Section P parent checklist remains open. See the integration README for validation results.
