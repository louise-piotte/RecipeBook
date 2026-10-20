# WP04 Section P — edible crab / tourteau (*Cancer pagurus*) identity review (R808)

- **Research date:** 2026-10-19.
- **Packet type:** narrowly scoped identity proposal for a previously unallocated crab species.
- **Candidate:** edible crab (also sold as brown crab), *Cancer pagurus*; Québec French **tourteau**.
- **Recommendation:** add one identity-only `PROTEIN` reference as `edible crab / tourteau`, with `brown crab` and `common crab` as English aliases. Keep `crabe tourteau`, `crabe dormeur`, `crabe commun`, `rock crab`, and generic `crab / crabe` out of its aliases.
- **Write scope:** this proposal only. No shared catalog, ledger, plan, roadmap, recipe, generated file, code, or test was changed.

## Why this is a new, useful Section P gap

The open Section P checklist still covers mussel, clam, oyster, cockle, and remaining shellfish identities. *Cancer pagurus* is not an active reference or a dedicated held candidate in the live package or proposal archive. Existing crab work covers generic crab meat, several other crab identities, the *Cancer irroratus* / Jonah-crab name overlap, and product cuts such as claws, legs, and snow-crab sections. Those decisions leave a distinct, recognized edible-crab identity unrepresented.

The Canadian Food Inspection Agency Fish List associates *C. pagurus* with `Crabe tourteau` and also with broad `Crab / Crabe`; its `Rock Crab` label is shared with other taxa. The Office québécois de la langue française (OQLF) provides a narrower Québec name pair: preferred **tourteau**, English **edible crab**, and *Cancer pagurus*. An accessible Atlantic-Canadian seafood distributor page, dated 2023-11-25, lists **Brown Crab / Edible Crab**, identifies *C. pagurus*, and states year-round availability; the page does not verify present inventory. Together, these sources support a species-scoped, identity-only row with the OQLF term as the French display and the supplier's `brown crab` plus OQLF's `common crab` as English search aliases. The latter is OQLF-backed but older; include it as a less current synonym, not as a contemporary retail label. [S01–S03]

The local phrase **crabe tourteau** needs a boundary. OQLF marks `crabe tourteau` as not retained for Québec commercial fish naming on its *Cancer irroratus* / `crabe commun` entry. A DFO article likewise says *C. pagurus* is what `tourteau` properly denotes, while *C. irroratus* is sometimes incorrectly called tourteau in Québec. Metro's Québec recipe page uses `crabes tourteau frais` without a scientific name. These are reasons to keep the compound phrase off the new alias list; they do not erase OQLF's preferred standalone term `tourteau`. The older MAPAQ glossary URL was checked but now redirects, so its indexed table is not relied on. [S04–S06]

This proposal does not reopen the generic crab-meat identity or the completed rock-crab/Jonah-crab holds. It distinguishes one species using the narrower bilingual terms supported by OQLF and a Canadian product listing dated 2023-11-25.

## Proposed identity boundary

| Field | Proposed value | Evidence and limit |
|---|---|---|
| Taxon | *Cancer pagurus* | OQLF and the Canadian distributor page dated 2023-11-25 directly tie the taxon to the edible-crab identity. [S01, S03] |
| English display | `edible crab` | OQLF lists this English equivalent; the Canadian distributor uses it alongside `brown crab`. [S01, S03] |
| Québec French display | `tourteau` | OQLF's preferred term for the edible crustacean mapped to *C. pagurus*. The source is a terminology record last updated in 2012, not a current retail package label. [S01] |
| English aliases | `brown crab`, `common crab` | `Brown crab` is exact supplier wording paired with *C. pagurus* on the distributor page dated 2023-11-25. OQLF also lists `common crab` as an English equivalent for *C. pagurus*; its terminology record was last updated in 2012. Neither source establishes a current Québec consumer label. [S01, S03] |
| French aliases | None | Do not add `crabe tourteau`: OQLF marks it as not retained under *C. irroratus*, and DFO describes local misapplication. Do not add `crabe dormeur` (OQLF says it was not retained for *C. pagurus*), `crabe commun`, or broad `crabe`. Although OQLF lists the English equivalent `common crab`, do not translate that into the French alias `crabe commun`, which OQLF associates with *C. irroratus* and notes may also be applied to *C. borealis*. [S01, S04, S05] |
| Category | `PROTEIN` | Edible crustacean identity. |
| Forms, density, mappings | None | Available product and terminology sources do not establish a reusable cooking state, household measure, density, or unit mapping. |

The exact proposed catalog row, if accepted, is:

```json
{
  "id": "ingredient-ref-edible-crab",
  "nameFr": "tourteau",
  "nameEn": "edible crab",
  "aliasesFr": [],
  "aliasesEn": ["brown crab", "common crab"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The scientific name belongs in the research evidence, not as a user-facing alias. Do not transfer the French names `crabe tourteau`, `crabe dormeur`, or `crabe commun`, or the ambiguous `rock crab`, onto this row. The English OQLF synonym `common crab` is retained as an alias; that does not justify the superficially similar French `crabe commun`. In particular, a French line containing the whole phrase `crabe tourteau` should remain unassigned until its product or cited recipe identifies which crab it means.

## Active catalog, ledger, and picker audit

The read-only audit used the current bundled package and the current research ledger, including the already-dirty worktree snapshot. The package contains **1,884 references** and **199 forms**; the legacy import identity file reports **56 candidates**; the research ledger contains **2,292 records**. The normalized-key check found no exact owner for `edible crab`, `brown crab`, `tourteau`, `crabe tourteau`, `common crab`, `rock crab`, or *Cancer pagurus* in active references, forms, or legacy candidates. No dedicated *C. pagurus* candidate or seafood source entry is present in the ledger. The unrelated `tourteau de chanvre` mention belongs to the hemp-flour record and does not own seafood wording.

The active `ingredient-ref-crab` remains the broad edible-meat identity `crab meat / chair de crabe`, with a Jumbo Lump grade form; its ledger record says measurements and substitution research are not yet researched. It is not *C. pagurus*. The current global and contextual substitution rule files contain no crab rules. The proposed species row therefore must not inherit the generic meat identity, Jumbo Lump form, or any measurement or substitution conclusions from it.

Search behavior was projected from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): full normalized word-phrase matches are returned before substring fallback. The table shows the current results and the result of a hypothetical row with only the proposed labels and both proposed English aliases.

| Query | Current picker | With proposed row | Disposition |
|---|---|---|---|
| `edible crab` | No result | Edible crab / tourteau only | Exact English identity. |
| `brown crab` | No result | Edible crab / tourteau only | Exact supplier-backed English alias. |
| `common crab` | No result | Edible crab / tourteau only | OQLF-backed English equivalent; French `crabe commun` remains excluded. |
| `tourteau` | No result | Edible crab / tourteau only | OQLF's preferred Québec term. |
| `crab` | 13 crab-containing results | 14 results | Adds a qualified edible-crab choice beside existing meat and named-crab results; no bare alias is added. |
| `crabe` | 13 crab-containing results | 13 results | Unchanged because the display term is `tourteau`, not generic `crabe`. |
| `crabe tourteau` | No result | No result | Intentionally not indexed as a phrase because local sources apply it across a species boundary. |
| `crabe dormeur` | Dungeness crab and Dungeness crab sections | Same two | Do not attach the Québec Dungeness term to *C. pagurus*. |

No exact active/reference or legacy key collision prevents this narrow identity. The known risk is the *meaning* of the compound local phrase, which the proposed aliases deliberately leave unresolved.

## Recipe demand

The bundled manifest lists **114 recipe files and 1,123 ingredient rows**. I scanned the manifest-listed recipe JSON and ingredient rows for `edible crab`, `brown crab`, `tourteau`, `crabe tourteau`, `common crab`, and *Cancer pagurus*. There were **zero matching files and zero matching ingredient rows**.

Recipe `019`, row 8 asks for **1 lb jumbo lump crab meat** and is linked to the existing generic crab-meat/Jumbo Lump identity. It does not select *C. pagurus*, a whole crab, or a brown-crab product. Keep the line and its quantity unchanged; it is not demand for this identity and does not provide a measure for it.

Metro's separate 2013 French recipe for crab cakes lists **227 g `crabes tourteau frais`** for 30 appetizer-sized cakes. It supplies a Quebec culinary wording example and a recipe-specific amount, but it names no taxon and uses the locally overlapping compound phrase. Keep that amount source-specific; do not attach it to *C. pagurus* or turn it into a reusable portion. [S06]

## Measurement, density, forms, and substitution evidence

**Measurements and density:** The distributor lists a **30 lb/box** package and claims over one-third of adult brown crab weight is edible meat. These are supplier/product claims, not a household quantity, recipe serving, or validated edible-yield conversion. No reviewed source establishes a cup or count mapping, density, generic meat yield, or a conversion between whole crab and picked meat. DFO's 1990 discussion includes biological size/weight claims for *C. pagurus* and a 25–35% edible-meat estimate for the different local species *C. irroratus*; neither is a recipe measure, and the latter must not transfer to this candidate. Record no active numeric behavior. [S03, S05]

**Forms:** The supplier's `Brown Crab` page does not define a standardized raw/cooked, live, picked, or ready-to-eat form for all *C. pagurus*. It only establishes a named food product and its own commercial package. Add no ingredient form.

**Substitutions:** No reviewed source establishes a tested or recipe-scoped replacement between *C. pagurus* and generic crab meat, Jumbo Lump crab meat, Jonah crab, rock crab, Dungeness crab, or another shellfish. The bundled Jumbo Lump line does not test a species substitution. Add no global form conversion, contextual substitution rule, or recipe-line substitution link.

## Static checks and testing disposition

- Read-only JSON parsing succeeded for the bundled references, forms, manifest, legacy identities, and research ledger.
- Exact normalized-key and proposal/source-prefix searches found no active identity, alias, form, legacy candidate, or prior *C. pagurus* review. The research-ledger audit found no candidate-specific record or source allocation.
- The picker projection used the current complete-phrase-first behavior and the proposed exact bilingual names and aliases; it is a static projection, not an app test.
- The complete manifest-listed recipe scan covered all 114 files and 1,123 ingredient rows.
- No app tests, build, emulator run, or deployment were run, as requested. If accepted implementation remains limited to adding this database JSON identity and its evidence, the current `AGENTS.md` database-JSON exemption also requires no software testing.

## Source register

Accessed 2026-10-19. Source IDs are local to this proposal and have not been allocated in the shared research ledger.

| ID | Source and evidence | Limit |
|---|---|---|
| **WP04-SECTIONP-EDIBLE-CRAB-R808-20261019-S01** | Office québécois de la langue française, [tourteau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198934/tourteau). Preferred Québec term `tourteau`; English equivalents include `edible crab` and `common crab`; Latin field gives *Cancer pagurus*. | Terminology record last updated 2012. It supports the bilingual identity pair, not a current retail label, quantity, or form. It says `crabe dormeur` was not retained for this product. |
| **WP04-SECTIONP-EDIBLE-CRAB-R808-20261019-S02** | Canadian Food Inspection Agency, [Fish List search results for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on%2F1000&cmbIn=e&lang=e&q=crab). Lists *C. pagurus* as `Rock Crab / Crabe tourteau` and `Crab / Crabe`; its `Rock Crab` common-name rows also include other taxa. | The Fish List is a Canadian fish-labelling name source; its broad market names do not resolve every Québec consumer use or establish culinary interchangeability. The page reports a data modification date of 2023-09-18. |
| **WP04-SECTIONP-EDIBLE-CRAB-R808-20261019-S03** | World Link Food Distributors Inc. (Goffs, Nova Scotia), [Brown Crab](https://atlanticlobster.ca/product/crab/). Calls the product `Brown Crab`, lists `Brown or Edible Crab`, directly identifies *Cancer pagurus*, states all-year availability, and lists 30 lb/box. The page is dated 2023-11-25. | Canadian wholesale listing dated 2023-11-25, not a Québec consumer label or independently verified 2026 inventory. The carton size and supplier edible-meat statement are product-specific. |
| **WP04-SECTIONP-EDIBLE-CRAB-R808-20261019-S04** | Office québécois de la langue française, [crabe commun (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198892/crabe-commun). Identifies *Cancer irroratus* and says `crabe tourteau` is not retained in Québec commercial naming; the note also says *C. irroratus* and *C. borealis* may both be sold under `crabe commun`. | Terminology record last updated 2012; supports the naming-confusion boundary, not a current product listing or the identity of every unqualified `crabe tourteau` recipe. |
| **WP04-SECTIONP-EDIBLE-CRAB-R808-20261019-S05** | Fisheries and Oceans Canada, [Le crabe (tourteau) commun (PDF)](https://waves-vagues.dfo-mpo.gc.ca/Library/166007.pdf), 1990 article compiled in the 1993 DFO collection. Says `tourteau` denotes *C. pagurus*, and that local *C. irroratus* has often been incorrectly called tourteau; the article separately describes the local species and historical fishery. | Historical context, not current availability. Its biological size/weight discussion is not a culinary measure; its *C. irroratus* meat-yield statement is not transferable to *C. pagurus*. |
| **WP04-SECTIONP-EDIBLE-CRAB-R808-20261019-S06** | Metro Canada, [Gâteau de crabe tourteau à la crème de maïs, pousses de coriandre](https://www.metro.ca/recettes-et-occasions/recettes/gateau-de-crabe-tourteau-a-la-creme-de-mais-pousses-de-coriandre), published 2013-08-06. Lists `227 g crabes tourteau frais` for 30 appetizer-sized cakes. | Local recipe wording, but no scientific taxon; the ingredient quantity is recipe-specific and cannot be assigned to this identity or generalized. |

## Recommendation

Add `ingredient-ref-edible-crab` as an identity-only `PROTEIN` reference with `edible crab / tourteau` and English aliases `brown crab` and `common crab`. Keep French compound and broad crab terms out of aliases. Record the reviewed lack of reusable measures and substitution evidence separately from identity; add no forms, density, mappings, recipe links, conversions, yields, or substitution rules. Section P remains open.
