# WP04 Section P R578 — Blue catfish identity and picker boundary review

- **Review date:** 2026-10-17.
- **Status:** Integrated as a bounded picker-boundary hold. Blue catfish remains outside active references and the shared ledger; see the [R578 integration README](../batches/wp04-blue-catfish-picker-boundary-hold-integration-r578-20261017/README.md).
- **Scope:** One candidate identity, blue catfish (*Ictalurus furcatus*), under the open Section P finfish parent. This does not reopen the recent cut-form decisions or the existing channel-catfish and bullhead identities.
- **Decision:** **Hold blue catfish outside active references and the research ledger.** CFIA supplies a bilingual species name, but the proposed French display `Poisson-chat bleu` would make the unqualified French query `poisson-chat` return blue catfish alone. OQLF’s older entry associates the unqualified term with a different taxon name, and CFIA/Metro evidence also uses the French phrase for channel catfish. No recipe demand or species-matched Québec retail product resolves the picker problem. Add no identity, alias, form, measure, source record, recipe link, or substitution.
- **Integration:** Updated the catalog plan and roadmap and added the [R578 integration README](../batches/wp04-blue-catfish-picker-boundary-hold-integration-r578-20261017/README.md). No shared catalog, ledger, manifest, recipe, or code data changed.

## Plan anchor and prior-work check

The exact open plan anchor is **“P Fish shellfish seafood products roe and other regional proteins” → `[ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.”** The parent remains open. R578 addresses only the species-level blue-catfish question under `catfish`.

The immediate R545–R577 plan children address halibut, trout, haddock, swordfish, cod, pollock, and salmon cuts; none is reopened here. R577 specifically holds Atlantic-salmon steak and remains unchanged. Prior catfish-family work is adjacent but does not decide *I. furcatus*:

- The 2026-10-10 finfish gaps packet advanced channel catfish / `barbue de rivière` and left generic catfish unresolved.
- Later work added brown and yellow bullhead identities, kept black bullhead as a separate species, and held stonecat after a food-market review. The spotted-wolffish review also recorded the broad English market-name overlap only to protect that species boundary.
- Exact searches across plan, proposals, batches, active references/forms, legacy import identities, and ledger for `blue catfish`, `poisson-chat bleu`, *Ictalurus furcatus*, `ingredient-ref-blue-catfish`, and `candidate-blue-catfish` found no prior dedicated allocation or hold. These sibling decisions are not substitutes for an *I. furcatus* review.

## Live catalog, ledger, and source-ID ownership

The current bundled package contains **1,805 ingredient references and 153 forms**. The related active references are:

| Reference | Current display and aliases | Boundary |
|---|---|---|
| `ingredient-ref-brown-bullhead` | `brown bullhead / barbotte`; `brown catfish` and `barbotte brune` aliases | *Ameiurus nebulosus*. Existing record and source ownership remain unchanged. |
| `ingredient-ref-channel-catfish` | `channel catfish / barbue de rivière`; no aliases | *Ictalurus punctatus*. Existing record and source ownership remain unchanged. |
| `ingredient-ref-yellow-bullhead` | `yellow bullhead / barbotte jaune`; no aliases | *Ameiurus natalis*. Existing record and source ownership remain unchanged. |

The proposed ID `ingredient-ref-blue-catfish`, exact display pair, binomial, and candidate ID are absent from active references, forms, legacy identities, and ledger records. The shared ledger already owns neighboring evidence: `WP04-FINFISH-GAPS-20261010-S03`–`S05` for channel catfish and `WP04-BROWN-BULLHEAD-20261012-S01` for brown bullhead; the yellow-bullhead sources are on `ingredient-ref-yellow-bullhead`. Reuse these only for those existing species facts.

The CFIA English `Blue` query is already cited under other source IDs: `?lang=e&q=Blue` is owned by the blue-crab records, while `?lang=e&q=Blue&wbdisable=true` is cited by bluefish and blue-mussel records. The unfiltered CFIA results URL is also shared by many other species records. Those ledger support descriptions are scoped to their respective taxa and do not claim the blue-catfish fact or the broader catfish rows shown on those pages. R578 therefore uses proposal-local source IDs for the retrieved blue-catfish and unfiltered-list evidence and does not reuse or alter those owners. The exact OQLF `poisson-chat` page and Metro SKU 219018 routes have no source entries in the current ledger. The CFIA guidance source `WP04-FINFISH-GAPS-20261010-S12` and channel-catfish query source `WP04-FINFISH-GAPS-20261010-S05` are reused rather than reissued. Because the disposition is a hold, none of the R578 proposal-local source IDs should be registered in the shared ledger.

## Evidence and limits

| Source ID | Source | What it supports, and its limits |
|---|---|---|
| `WP04-SECTIONP-BLUE-CATFISH-R578-20261017-S01` | CFIA, [Fish List results for “Blue”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true), retrieved 2026-10-17. | The result identifies TSN 163997, *Ictalurus furcatus*, family Ictaluridae, with `Blue Catfish / Poisson-chat bleu`. Canadian fish-label name/taxon evidence; not evidence of a current Québec product, recipe demand, serving size, or culinary interchangeability. The table also carries a contaminant-risk grouping, which is not recipe handling guidance. The URL is shared with other ledgered “Blue” searches, so this R578 ID is proposal-local. |
| `WP04-SECTIONP-BLUE-CATFISH-R578-20261017-S05` | CFIA, [Fish List searchable results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), retrieved 2026-10-17. | The current result set uses `Catfish` for several distinct taxa, including *Anarhichas lupus*, *Bagre bagre*, and *Ictalurus punctatus*; it also lists blue catfish and other catfish-named entries. Supports a broad English market-name boundary, not a complete family taxonomy or product-market survey. This unfiltered URL is already used by ledger records for unrelated taxa; the R578 source ID is proposal-local. |
| Reused `WP04-FINFISH-GAPS-20261010-S12` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | CFIA describes the Fish List as a source of English/French common names and taxon numbers for Canadian fish labeling, and says names for the listed species should be used. Naming guidance only; it does not establish local retail availability or recipe equivalence. |
| Reused `WP04-FINFISH-GAPS-20261010-S05` | CFIA, [Fish List query for Channel Catfish](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Channel%20Catfish), accessed 2026-10-17. | Shows the neighboring *I. punctatus* name rows, including `Channel Catfish / Poisson Chat` and `Catfish / Barbue De Rivière`. It supports the existing channel-catfish boundary, not blue catfish. |
| `WP04-SECTIONP-BLUE-CATFISH-R578-20261017-S02` | OQLF, [poisson-chat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395497/poisson-chat), last updated 1996; accessed 2026-10-17. | OQLF gives French `poisson-chat` and English `catfish`; its Latin field renders `Ammeriurus nebulosus` (spelling as displayed), not *I. furcatus*. The entry therefore associates the unqualified French term with a different named taxon, though its old Latin spelling is not independently validated here. It makes the unqualified query risky; it is not a current product listing or a complete treatment of all catfish taxa. Do not silently transfer its French term to blue catfish. |
| `WP04-SECTIONP-BLUE-CATFISH-R578-20261017-S03a` and `WP04-SECTIONP-BLUE-CATFISH-R578-20261017-S03b` | Metro, [Cajun Catfish Fillet, product 219018 (English)](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/cajun-catfish-fillet/p/219018) and [Filet de poisson-chat aux épices cajun (French)](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filet-de-poisson-chat-aux-epices-cajun/p/219018), retrieved 2026-10-17. | Paired current retailer routes for the same SKU, not two products. Both identify product 219018 as *Ictalurus punctatus* and show an average **200 g each**; English metadata says United States origin and pond aquaculture. This is one Cajun-seasoned catfish-fillet SKU, not *I. furcatus* evidence. The average is SKU-specific, not a standard fillet mass, household serving, edible yield, density, or conversion. The title does not itself say fresh or frozen; its category path is under fresh fish. Direct page access was blocked in the review tool, so product details were read from current indexed captures. |
| `WP04-SECTIONP-BLUE-CATFISH-R578-20261017-S04` | USDA Food Safety and Inspection Service, [Catfish from Farm to Table](https://www.fsis.usda.gov/food-safety/safe-food-handling-and-preparation/meat-fish/catfish-farm-table). | US consumer information distinguishes blue catfish from channel catfish and notes their differing relative size and edible-meat percentage. It is not Québec-market evidence and gives no reusable household portion, yield, density, or substitution ratio. |

No current species-matched Québec consumer product for blue catfish was verified in the reviewed sources. Exact-name retailer searches surfaced the paired Metro channel-catfish SKU above, not a blue-catfish SKU. This is a bounded search result, not proof that no Canadian supply exists. US food-market references establish food use in that jurisdiction only.

## Bilingual naming and picker projection

The only supported candidate French name located in the Canadian fish-label source is `Poisson-chat bleu`. Do not replace it with an invented `barbue bleue`, use bare `poisson-chat` as an alias, or claim the CFIA label is OQLF’s preferred Québec culinary term. The OQLF page’s older taxon field is not *I. furcatus*, and Metro’s paired Québec listing uses `poisson-chat` for an *I. punctatus* product. Together with CFIA’s `Channel Catfish / Poisson Chat` row, these sources show that the unqualified French phrase is not exclusive to blue catfish.

Static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases in displays and aliases are returned before substring fallback. The hypothetical identity row is `Blue catfish / Poisson-chat bleu`, category `PROTEIN`, with empty aliases and no forms. Empty aliases would not prevent the display names themselves from matching their component phrases.

| Query | Current picker result | If the identity were added | Effect |
|---|---|---|---|
| `Blue catfish` | None | Blue catfish | Qualified English phrase works. |
| `Poisson-chat bleu` | None | Blue catfish | CFIA-qualified French phrase works. |
| `catfish` | Brown bullhead; channel catfish | Brown bullhead; channel catfish; blue catfish | Broad English query expands from two to three rows; CFIA’s list also assigns the name to additional taxa beyond this active subset (S05). |
| `poisson-chat` or `poisson chat` | None | Blue catfish alone | **Unsafe French singleton:** the query appears in an OQLF record whose taxon field is not *I. furcatus*, and CFIA uses `Poisson Chat` for channel catfish. The picker would conceal that ambiguity. |
| `Ictalurus furcatus` | None | None | No scientific-name alias is proposed. |

The hold is driven by the unqualified French singleton that the bilingual display necessarily creates under current search behavior. Do not add a “poisson-chat” alias to blue catfish to improve recall. Revisit if the picker can preserve multi-species results for the French family query and a suitable Québec display remains supported.

## Bundle demand, quantities, and substitutions

A manifest-ordered scan covered all **114 recipe files and 1,123 ingredient rows**, including every string in each parsed recipe object. Searches for `blue catfish`, `Ictalurus furcatus`, `poisson-chat bleu`, `poisson chat bleu`, `catfish`, `channel catfish`, `poisson-chat`, and the related barbotte/barbue terms found **zero matching recipe files and zero ingredient rows**. The corpus digest (manifest path, NUL, exact file bytes, NUL per recipe) is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

No reviewed source supplies a blue-catfish household portion, density, package yield, edible yield, or unit conversion. Metro SKU 219018’s 200 g average belongs only to its *I. punctatus* product and must not be transferred to *I. furcatus*. No source establishes a directed, quantity-backed global form conversion or contextual substitution between blue catfish, channel catfish, bullheads, generic white fish, or another species. Shared family and market words, US food use, or the USDA relative-size note do not support a substitute or a cooking-safety equivalence. Add no numeric or substitution data.

## Bounded decision

Keep blue catfish outside active data and the shared ledger for this review. Add no `ingredient-ref-blue-catfish`, aliases, forms, measurements, recipe links, conversions, yields, source entries, or substitution rules. Preserve current brown bullhead, channel catfish, yellow bullhead, black bullhead, stonecat, and R577 salmon-steak decisions unchanged; leave the broad Section P finfish parent open.

If later evidence justifies a reconsideration, the smallest identity candidate is `ingredient-ref-blue-catfish`, `Blue catfish / Poisson-chat bleu`, `PROTEIN`, with empty alias arrays and no forms or numeric data. Before activation, resolve the `catfish` / `poisson-chat` picker behavior and obtain candidate-specific Québec consumer-product or recipe evidence. Keep every product amount SKU-specific and the alternative `barbue bleue` unused unless a primary Québec terminology source supports it.

This documentation-only hold adds no catalog or ledger data; no software tests, app build, emulator, or deployment were needed under `AGENTS.md`. See the integration README for static source, picker, corpus, encoding, link, and whitespace checks.
