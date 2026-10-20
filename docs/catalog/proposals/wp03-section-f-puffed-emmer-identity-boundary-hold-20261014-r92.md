# WP03 Section F R92 — puffed emmer identity boundary hold (2026-10-14)

## Review record

- **Reviewed:** 2026-10-14.
- **Open checklist:** Section F still calls for review of “remaining puffed-grain candidates” ([active plan, Section F puffed-grain item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2737)); the grain packet also leaves further puffed products open ([packet checklist](../batches/plant-grains-cereals.md#L267)).
- **Candidate:** a plain puffed *Triticum dicoccum* product, marketed in Italy as *farro dicocco soffiato*.
- **Recommendation:** **Hold outside the active catalog and ledger.** The product identity is supported by a first-party Italian manufacturer listing and a primary grain-puffing study, but the reviewed evidence does not establish a Canadian/Québec standalone product name in French. Québec sources support the base grain term *blé amidonnier*; they do not name this puffed product. A European ingredient declaration uses *blé amidonnier soufflé* inside a composite bakery mix, but that is not a Québec retail title or a plain product specification. Do not construct or activate that phrase as a Québec display without local product or terminology evidence.
- **Distinctness:** This is an emmer (*T. dicoccum*) candidate. It does not reopen R91’s puffed-einkorn (*T. monococcum*) hold, nor assign emmer to the active puffed-wheat, puffed-spelt, or puffed-Khorasan rows.
- **Integration:** Documentation-only hold recorded 2026-10-14. No catalog, form, ledger, legacy-candidate, recipe, or generated file changed; the plan, roadmap, and [batch README](../batches/wp03-section-f-puffed-emmer-boundary-hold-integration-20261014/README.md) now record the disposition.

## Product identity and naming evidence

Prometeo’s current Italian product page lists **Farro dicocco soffiato bio** under cereals, gives the ingredient as **farro dicocco bio**, and describes breakfast uses. The page showed the product as sold out when indexed. This is first-party evidence of a single-ingredient puffed-emmer product under an Italian name; it is not evidence of Canadian availability, a French product name, or a standardized puffing specification [S01].

The Office québécois de la langue française (OQLF) entry for *amidonnier* pairs the Québec French term with English *emmer* and *emmer wheat*, identifies *Triticum dicoccum*, and lists *farro* as an acceptable term for that cereal [WP03-S33; S02]. The federal bilingual food procurement specification separately names *blé amidonnier* / emmer and identifies *Triticum turgidum* subsp. *dicoccum* [WP03-S57; S03]. These primary terminology and procurement sources settle the base-grain identity, not the puffed product’s retail name.

The generic word *farro* remains unsafe as an app-wide alias here. The current Section F ledger candidate is held because other food-industry and Canadian product uses span emmer, einkorn, and spelt, as well as distinct grain and flour products [WP03-S71]. The OQLF entry is specifically scoped to emmer; it does not erase the broader market ambiguity documented in the existing candidate record. Keep *farro*, *puffed farro*, and the source’s Italian phrase out of global aliases.

The Canadian-facing evidence located was a World Pantry Canada-route listing for a **puffed 5-grain mix** containing 20% puffed emmer alongside puffed brown rice, spelt, millet, and quinoa. Its 400 g figure belongs to the finished blend. This is retailer/index evidence of one composite listing, not a Canadian-made product, standalone emmer SKU, or Québec French label; direct page retrieval returned a cache miss during this review [S04].

A Belgian ingredient listing for a 10 kg composite bakery mix uses **blé amidonnier soufflé (blé)** for one component [S05]. This supports that the descriptive French compound is used in a European ingredient declaration. It does not establish a Québec-preferred term or standalone consumer-facing product title. Targeted searches for *puffed emmer*, *emmer puffs*, *blé amidonnier soufflé*, and Canadian/Québec product wording did not surface an OQLF/TERMIUM entry or a Québec-facing standalone package. This is a bounded search result, not proof that no local wording exists.

Mariotti et al. experimentally puffed emmer wheat and compared its physical structure with common wheat, rye, barley, rice, and buckwheat [S06]. This supports treating puffed emmer as a processed grain product distinct from the raw kernel and from generic puffed wheat. The study does not define a consumer product class, Québec name, household measure, cooking yield, or substitution.

## Current ownership and picker projection

The proposal audit snapshot contained **1,421 ingredient references, 104 forms, 63 legacy-import candidates, and 1,760 research-ledger records**. The separate same-day R91 additions since that snapshot brought current totals to **1,424 references and 1,763 research-ledger records**; the forms, legacy candidates, and recipe corpus remain at **104, 63, and 114 recipes / 1,123 rows**.

| Current owner | Live scope | R92 boundary |
|---|---|---|
| ingredient-ref-emmer-grain | emmer wheat / blé amidonnier in GRAIN_AND_CEREAL; no aliases, null default density, empty unit mappings, no attached forms. Its ledger identity is verified; measurement and substitution research remain not yet researched. | Owns the raw species-qualified grain only. Do not add puffed-product terms to this row. |
| ingredient-ref-emmer-flour | emmer flour / farine d’amidonnier in FLOUR_AND_STARCH; no aliases or attached forms. | Keep the milling product separate. |
| ingredient-ref-puffed-wheat | puffed wheat / blé soufflé in GRAIN_AND_CEREAL; no aliases or attached forms. | Keep for its existing generic wheat product; do not route puffed emmer to it. |
| ingredient-ref-puffed-spelt; ingredient-ref-puffed-khorasan-wheat | Species-qualified puffed-grain rows with their own French displays. | Do not use either name as an emmer alias. |
| ingredient-ref-farro | Ledger-only candidate with identityState needs_clarification; no active picker row. | Leave the broader unresolved farro boundary unchanged. |
| Proposed puffed-emmer identity | No exact active reference, form, legacy candidate, ledger record, or prior focused proposal for puffed emmer was found. The prospective ID ingredient-ref-puffed-emmer is unallocated. | Hold without reserving a new row or candidate record. |

The picker projection below mirrors IngredientSearch.kt’s normalized complete-phrase-first search followed by substring fallback. It was run against live reference names, aliases, and attached form terms.

| Query | Current result | Boundary |
|---|---|---|
| puffed emmer; puffed emmer wheat; emmer puffs | No results. | No active product owner or alias. |
| farro dicocco soffiato; blé amidonnier soufflé | No results. | The Italian source wording and unverified French compound are not active aliases. |
| emmer wheat; blé amidonnier | ingredient-ref-emmer-grain only. | The species-qualified grain remains exact. |
| emmer | emmer grain and emmer flour. | Broad term remains a grain/flour family choice. |
| puffed wheat; blé soufflé | ingredient-ref-puffed-wheat only. | Existing generic puffed-wheat ownership remains unchanged. |
| farro | No active results. | The ledger-only candidate remains outside the picker. |

An active row named *puffed emmer wheat* would make the narrower English query selectable as its own product. A French display or alias is not approved here. Do not add *farro* to the proposed owner: it would turn the held, broad word into an active singleton despite its recorded species and product-state ambiguity.

## Recipe demand

I scanned every manifest-listed recipe’s serialized JSON and all **1,123 ingredient rows** for *puffed emmer*, *puffed emmer wheat*, *emmer puffs*, *farro dicocco*, *farro soffiato*, *blé amidonnier soufflé*, *emmer*, and adjacent puffed-wheat/emmer wording. The scan found **0 of 114 recipe files, 0 of 1,123 ingredient rows, and 0 direct links** to the emmer grain, emmer flour, or puffed-wheat references for this candidate. No recipe edit, link, or amount is justified.

## Forms, measurements, conversions, and substitutions

- **Forms:** Add none. Puffing defines the candidate product; it is not evidence for a dry/cooked state form or reusable conversion from the raw emmer kernel.
- **Measurements:** No reviewed source gives a household volume or mass for plain puffed emmer. The 400 g value in S04 is the whole five-grain blend package. It is not a puffed-emmer portion. The existing puffed-wheat record carries Health Canada’s historical 250 mL / 13 g observation for branded Quaker puffed wheat [WP03-PW-20261010-S05]; that does not transfer to emmer ([puffed-wheat review](wp03-section-f-next-residual-identities-20261010.md#L45)). The emmer-grain ledger record has no measurement observations.
- **Density and yield:** The puffing study reports physical changes, including increased water-holding capacity, but no household density, volume-to-mass mapping, or raw-to-puffed cooking yield. Keep all numeric fields absent.
- **Substitution:** Breakfast and snack use descriptions do not establish a replacement ratio. No source tests replacing emmer puffs with puffed wheat, puffed spelt, puffed Khorasan, or another cereal in a defined recipe or method. Add no global or contextual rule; preserve the existing emmer ledger state.

## Exact disposition

**Hold; no live JSON or ledger delta.** Keep the current emmer grain and flour rows, puffed-wheat and other puffed-grain rows, forms, recipe links, and ledger records unchanged. Do not add ingredient-ref-puffed-emmer, a candidate ledger record, aliases, measurements, conversions, yields, or substitutions. The proposal-local source labels S01–S06 are not shared-ledger IDs. Reuse the existing OQLF, DND, and TERMIUM records cited above rather than duplicating them if a later review revisits this candidate.

Reopen if a current Canadian/Québec producer or retailer supplies a standalone puffed-emmer product with a French-facing name, or if a Québec terminology authority establishes a suitable term. Then repeat the live ownership and picker audit before proposing integration. Section F remains open.

## Sources

The R92 labels S01–S06 are local to this proposal and are not appended to the research ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| WP03-PEMMER-R92-20261014-S01 | Prometeo, [Farro dicocco soffiato bio](https://shop.prometeofarro.it/collections/prodotti-di-farro-prometeo/products/farro-soffiato), product heading, ingredients, and use; accessed 2026-10-14. | First-party Italian listing for a single-ingredient puffed *farro dicocco* cereal. The manufacturer page was indexed with the item sold out; direct retrieval returned a cache miss. Not a Canadian/Québec name or availability source. |
| WP03-PEMMER-R92-20261014-S02 | OQLF, [amidonnier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), updated 2019; accessed 2026-10-14. | Gives *amidonnier / emmer / emmer wheat*, the Latin taxon *Triticum dicoccum*, and the Québec-accepted term *farro* for that entry. It does not define puffed emmer or resolve broader Canadian uses of unqualified farro. Reuse existing ledger source WP03-S33. |
| WP03-PEMMER-R92-20261014-S03 | Department of National Defence, [Food Quality Specifications: Grains, English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), FQS/SQA 24-06, emmer section; accessed 2026-10-14. | Federal procurement terminology pairs emmer with *blé amidonnier* and identifies *Triticum turgidum* subsp. *dicoccum*. It establishes the grain identity, not puffing, retail availability, or a kitchen measure. Reuse existing ledger source WP03-S57. |
| WP03-PEMMER-R92-20261014-S04 | World Pantry, [Puffed 5-grain mix 400 g](https://www.worldpantry.uk/ca/products/breakfast/puffed-5-grain-mix-400g), ingredients and package listing; indexed 2026-10-14. | Canada-route/CAD listing names puffed emmer as 20% of a five-grain mixture. It is a retailer listing, not a Canadian manufacturer or French package label; 400 g is the mixed product’s package mass, not a measure for emmer. Direct retrieval returned a cache miss. |
| WP03-PEMMER-R92-20261014-S05 | Bruyerre / Komplet, [Grainstar product document](https://www.bruyerre.be/shop/03080130-komplet-grainstar-10kg-14577/document/14382), ingredient declaration; indexed 2026-10-14. | A Belgian composite bakery mix ingredient list includes *blé amidonnier soufflé (blé)*. Direct opening redirected to the distributor homepage. This is French-language component wording in a composite, not a Québec term or standalone puffed-grain label. |
| WP03-PEMMER-R92-20261014-S06 | Mariotti, Alamprese, Pagani, and Lucisano, [“Effect of puffing on ultrastructure and physical characteristics of cereal grains and flours”](https://doi.org/10.1016/j.jcs.2005.06.007), *Journal of Cereal Science* 43(1), 47–56 (2006); University of Milan repository record accessed 2026-10-14. | Primary study evaluates gun-puffed emmer alongside other grains and reports grain-specific physical outcomes. It is not a consumer naming source, recipe, measure, conversion, or substitution study. |

## Static review performed

- Re-read the current AGENTS.md, Requirements.md, Section F checklist and packet, current roadmap entries, and the R91 puffed-einkorn proposal; checked the focused puffed-grain archive for an earlier emmer decision.
- Parsed the proposal-review reference, form, legacy-candidate, ledger, and manifest snapshot. The 1,421-reference / 1,760-record baseline preceded the separate R91 additions; current totals are 1,424 references and 1,763 ledger records, with 104 forms, 63 legacy candidates, 114 recipe files, and 1,123 ingredient rows.
- Searched active names/aliases, forms, legacy candidates, ledger records, and proposals for exact puffed-emmer ownership, the prospective ID, and the R92 source prefix. None was allocated.
- Reproduced the current picker’s normalized phrase-first and substring-fallback behavior over references and attached forms for the queries shown above.
- Scanned all manifest-listed recipe JSON files and structured ingredient rows for the candidate and its neighboring terms; no recipe demand or link was found.
- Checked the linked OQLF and University of Milan records online, reviewed current manufacturer/retailer search results, and recorded where direct retrieval returned a cache miss or redirected.
- No app, Gradle, instrumentation, or emulator tests were run. This is a documentation-only hold and changes no database JSON. The active checklist, roadmap, and batch record are linked above.
