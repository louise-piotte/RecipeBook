# WP04 Section P — gizzard-shad name and market boundary review (R128)

- **Review and source-access date:** 2026-10-15.
- **Status:** Documentation-only hold integrated into the plan and roadmap; see the [R128 batch README](../batches/wp04-section-p-gizzard-shad-market-picker-hold-integration-r128-20261015/README.md).
- **Candidate:** gizzard shad, *Dorosoma cepedianum* (ITIS TSN 161737).
- **Recommendation:** Hold the candidate outside active references, forms, and the research ledger. Keep the existing American shad identity unchanged.
- **Worktree scope at proposal handoff:** This proposal only. The coordinator later added the batch README and plan/roadmap notes. No catalog, ledger, package, index, recipe, or code data changed. No tests were run.

## Parent checklist and bounded question

The exact open parent item is in the plan's **P Fish shellfish seafood products roe and other regional proteins** section:

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

This review covers only *D. cepedianum* and its English common-name boundary. It asks whether the species can be allocated safely under a bilingual identity when current Canadian retail wording uses **Gizzard Shad** for a Japanese-named fish, and Québec's sale rules restrict dead gizzard shad to specified licensed or imported sources.

### Prior-work audit

I read the Section P checklist, `AGENTS.md`, the relevant catalog requirements, and the recent Section P fish packets and their integration notes. The American-shad review treats alose à gésier as a distinct fish, and R126 mentions gizzard shad as a neighboring taxon, but neither allocates *D. cepedianum*, a reference ID, a ledger record, or its picker terms. R121's skate hold, R122's European-smelt review, R123's Atlantic-saury hold, R124's blueback-herring hold, R125's Atlantic-menhaden hold, and R126's hickory-shad hold concern different names and taxa. A repository-wide phrase audit found only the American-shad review and R126's hickory-shad packet mentioning this fish; neither is a focused gizzard-shad decision. The Section P parent remains open.

The user-facing bilingual ingredient names follow Requirements FR-3 and FR-7. For any future conversion or recipe behavior, FR-5 requires a supported density or explicit mapping; this review found no evidence for one.

## Name and market evidence

OQLF's GDT gives **alose à gésier** as the normalized French term for edible-fish naming and links it to **gizzard shad** and *D. cepedianum*. It says the species has commercial potential in Québec. It also records *alose noyer* as a contextual alternative that was not retained for fish-product marketing to avoid consumer-label confusion. This is strong Québec terminology and species-boundary evidence, but the entry was last updated in 2012 and does not document a current product or sale. [S01]

The CFIA Fish List is the Canadian source for English and French common names acceptable for fish labelling and their scientific names/TSNs. Its current chooser displays separate entries for **American Gizzard Shad**, **Gizzard Shad**, and **Dotted Gizzard Shad**. The live list's chooser and scientific-name index were reachable, but the species-result pages for the exact queries failed to load during this review. I therefore do not claim an exact Fish List label-to-taxon crosswalk beyond what the accessible sources establish. CFIA's aquatic-animal-health table pairs *D. cepedianum* with **American gizzard shad**, while explicitly warning that its animal-health names do not replace the Fish List for food labels. [S02, S03]

DFO Québec's 2014 regional species-code list and the current Québec Fishery Regulations separately identify *D. cepedianum* as **alose à gésier / gizzard shad**. The regulation's Schedule 3 is a fishery-species crosswalk, not a food-label standard. The OQLF and DFO evidence supports a French display, but the unqualified English phrase still has a current retail-market complication. [S04, S05]

Current Canadian and Québec human-food evidence shows that **gizzard shad** is being used in a different named-fish context:

- Toronto specialty retailer Daily Seafood currently lists **Kohada – Gizzard Shad** at CA$36/lb, in a 2 lb order option, with advance ordering for Thursday–Saturday availability. Its description calls the fish *Kohada* and *Konoshiro* in Japanese and describes pickling and sushi use. The page does not provide a binomial, origin field, or an explicit fresh/frozen state. The seller's Japanese naming, combined with the ITIS entry for valid *Konosirus punctatus* as dotted/konoshiro gizzard shad, **suggests** this is *K. punctatus*; that species assignment is an inference, because the seller does not publish the scientific name. The 2 lb option and $/lb price are SKU information, not reusable ingredient measures. [S06, S07]
- Montréal's current MICHELIN Guide description of Sushi Nishinokaze mentions finely vinegared **kohada** and says fish is mostly sourced from Japan. This supports a current Québec human-food use of the name, but the page does not give a species name or identify each fish's origin. It is not evidence for a *D. cepedianum* dish. [S08]
- ITIS treats *K. punctatus* as a valid species and lists **dotted gizzard shad** and **Konoshiro gizzard shad** as English common names. ITIS also treats *D. cepedianum* as a species and lists gizzard shad, American gizzard shad, eastern gizzard shad, hickory shad, and mud shad among its common names. FDA's U.S. Seafood List separately lists *K. punctatus* as “Dotted Gizzard Shad” and *D. cepedianum* as “Gizzard Shad” / market name “Shad, Gizzard.” These taxonomy and U.S. naming sources are not Canadian label rules; they reinforce that gizzard-shad wording is used for more than one taxon in English-language fish naming. [S07, S10, S13]

The Québec market evidence is not evidence that *D. cepedianum* is sold there. The Québec Official Publisher's regulation, current to 2026-05-01 in English and 2026-04-01 in French, prohibits sale of dead *D. cepedianum* or its hybrids except through specified commercial-fishing, fishing-pond, aquaculture, or imported commercial-source pathways. This is a qualified restriction, not an absolute ban on all sale or imports. It provides a local market constraint; the bounded search found no current Québec or Canadian human-food product specifically identifying *D. cepedianum*. [S11]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete-word phrases take precedence, then substring fallback. The hypothetical row below is a picker projection only; no row is proposed for activation.

| Query | Current catalog result | With hypothetical `American gizzard shad / alose à gésier` display, empty aliases | Effect |
|---|---|---|---|
| `American gizzard shad` | None | American gizzard shad | Qualified English phrase selects the candidate. |
| `alose à gésier` | None | American gizzard shad | Qualified Québec French name selects the candidate. |
| `gizzard shad` | None | American gizzard shad | The phrase becomes a singleton result even though a current Canadian retailer uses it in a Kohada product title, likely for *K. punctatus*. The picker would not represent that unresolved market ambiguity. |
| `shad` | American shad | American shad; American gizzard shad | The qualified display broadens the generic English search to two entries. |
| `alose` | American shad | American shad; American gizzard shad | The French display broadens the generic French search to two entries. |
| `alose noyer` | None | None | Keep the non-preferred term out; OQLF says it was not retained for Québec fish-product marketing. |
| `Kohada`, `Konoshiro`, `dotted gizzard shad`, `Konosirus punctatus` | None | None | Do not add these terms to a *D. cepedianum* row. The candidate taxa and product names must remain separate. |
| `mud shad`, `hickory shad`, `lake shad`, `sawbelly` | None | None | OQLF/DFO and FDA record variants, but they are unnecessary, potentially colliding names and are not supported by a current Canadian *D. cepedianum* food product or recipe. |

The bilingual display candidate is useful as a research projection, but including “gizzard shad” in its English display makes that query select one species while the current Canadian Kohada product uses the same words. No active *K. punctatus* identity currently disambiguates the product, and the seller does not print its binomial. Do not use the two English names as interchangeable, and do not resolve an unqualified `gizzard shad` recipe line to *D. cepedianum*.

## Recipe demand and data boundaries

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for **gizzard shad**, **American gizzard shad**, *Dorosoma cepedianum*, **alose à gésier**, **alose noyer**, **mud shad**, **hickory shad**, **lake shad**, **sawbelly**, **Kohada**, **Konoshiro**, *Konosirus punctatus*, and **dotted gizzard shad**. There were zero matching recipe files and zero matching ingredient rows. The broader `shad` and `alose` terms also produced no recipe ingredient-row demand. No recipe link, relink, preparation state, or substitution is justified.

No reviewed source supports a reusable form, default density, unit mapping, mass/volume conversion, count weight, edible yield, cooking yield, or substitution for *D. cepedianum*. The retailer's 2 lb order option is SKU-specific. Do not transfer any weight, form, or culinary practice from Kohada/*K. punctatus*, American shad, or another fish. Keep all numeric behavior unavailable.

## Recommendation

Keep *D. cepedianum* out of active ingredient references, forms, and the shared research ledger pending a current Canadian human-food listing or bundled recipe that identifies this species and resolves its product name. The Québec French taxon name is well supported, but OQLF's commercial-potential note is not a current sale record, the Québec sales rule limits ordinary dead-fish sales to enumerated source pathways, and a live Canadian food listing currently uses “Gizzard Shad” for a Kohada product whose species is not printed. Do not add a candidate JSON row, alias, form, measurement, recipe link, conversion, yield, or substitution in this review.

## Source register

These proposal-local source IDs are not shared-ledger records. The prefix **`WP04-SECTIONP-GIZZARD-SHAD-R128-20261015`** was checked against current ledger source IDs and the proposal/batch archive; no prior owner was found.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S01** | Office québécois de la langue française, [GDT: alose à gésier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199030/alose-a-gesier), last updated 2012. Pairs *D. cepedianum* with `alose à gésier / gizzard shad`, marks edible-fish context and commercial potential in Québec, and rejects `alose noyer` for fish-product marketing. | Terminology and commercial-potential note, not a current product listing or market census. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [interactive English-name chooser](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpsel.asp?lang=e), selector marked modified 2023-09-18. The overview defines its Canadian food-labelling role; the chooser displays `American Gizzard Shad`, `Gizzard Shad`, and `Dotted Gizzard Shad`. | Exact selected species-result pages were not retrievable in this review; no unverified CFIA name/taxon assignment is claimed from the chooser alone. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S03** | CFIA, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species), retrieved 2026-10-15. Pairs *D. cepedianum* with `American gizzard shad`. | CFIA says these are animal-health names and do not replace the CFIA Fish List for food labelling. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S04** | Fisheries and Oceans Canada, [Code List of Marine Plants, Invertebrates and Vertebrates Used by the Quebec Region of DFO](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-13-1254.pdf), 2014. Regional bilingual species-code evidence for `alose à gésier / gizzard shad` and distinct clupeid taxa. | Technical regional code list, not a current food-label rule or consumer-market evidence. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S05** | Government of Canada, [Quebec Fishery Regulations, 1990, Schedule 3](https://laws-lois.justice.gc.ca/eng/regulations/SOR-90-214/FullText.html), current to 2026-09-21. Associates `Gizzard shad / Alose à gésier` with *D. cepedianum*. | Fishery-species naming crosswalk, not a food-label standard or proof of sale. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S06** | Savoirs.Québec, [Alose à gésier](https://savoirs.quebec/vivant/alose-a-gesier), published 2026-09-05 and updated 2026-09-14. Identifies *D. cepedianum* and reports eight Québec GBIF observations. | Species and occurrence profile, not a human-food product or fishery landings record. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S07** | ITIS, [*Konosirus punctatus* report, TSN 551304](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=551304), retrieved 2026-10-15; and U.S. FDA, [Seafood List: *K. punctatus*](https://hfpappexternal.fda.gov/scripts/Fdcc/index.cfm?id=Konosirus_punctatus&set=SeafoodList). ITIS treats the species as valid and lists dotted/konoshiro gizzard shad; FDA lists dotted gizzard shad and U.S. market name `Gizzard or Scad`. | Taxonomy and U.S. seafood naming. Neither source establishes Canadian label acceptability or the exact species in the Daily Seafood SKU. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S08** | Daily Seafood, [Kohada – Gizzard Shad](https://shop.dailyseafood.ca/products/614b488e36c8e1002db0c881/kohada-gizzard-shad), retrieved 2026-10-15. Current Toronto seafood product page with the `Kohada – Gizzard Shad` title and Japanese-name/food-use description. | Seller gives no scientific name or product-origin field; the *K. punctatus* identification is an inference from its Kohada/Konoshiro naming. The displayed 2 lb option and price are SKU-specific. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S09** | MICHELIN Guide, [Sushi Nishinokaze, Montréal](https://guide.michelin.com/ca/fr/quebec/montreal_2433514/restaurant/sushi-nishinokaze), retrieved 2026-10-15. Current local restaurant description names finely vinegared `kohada`; it says fish is mostly sourced from Japan. | Dish and restaurant evidence, not a scientific identification, exact menu guarantee, or *D. cepedianum* product. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S10** | U.S. FDA, [Seafood List: *D. cepedianum*](https://hfpappexternal.fda.gov/scripts/Fdcc/index.cfm?id=Dorosoma_cepedianum&set=SeafoodList). Lists common name `Gizzard Shad`, market name `Shad, Gizzard`, and other cross-reference vernaculars. | U.S. market naming only; does not establish Canadian labels or household availability. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S11** | Québec Official Publisher, [Regulation respecting aquaculture and the sale of fish, CQLR c. C-61.1, r. 7](https://www.legisquebec.gouv.qc.ca/en/pdf/cr/C-61.1%2C%20R.%207.pdf), current to 2026-05-01; see s. 30. Prohibits sale of dead *D. cepedianum* or hybrids except through specified commercial-fishing, fishing-pond, aquaculture, or imported commercial-source pathways. | A legal sales constraint, not a market survey; the specified exceptions mean this is not a total ban on every possible sale. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S12** | Local static audit of the live references, forms, legacy candidates, ledger, manifest-listed recipe corpus, `IngredientSearch.kt`, and proposal/batch archive; accessed 2026-10-15. | Repository snapshot and bounded search only; absence from this bundle or selected market results is not proof of worldwide or universal Canadian nonavailability. |
| **WP04-SECTIONP-GIZZARD-SHAD-R128-20261015-S13** | ITIS, [*Dorosoma cepedianum* report, TSN 161737](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=161737), retrieved 2026-10-15. Treats *D. cepedianum* as a species and lists `gizzard shad`, `American gizzard shad`, `eastern gizzard shad`, `hickory shad`, and `mud shad` among its common names. | Taxonomy/common-name cross-references, not Canadian food-label rules or evidence that each vernacular is appropriate for a picker display. |

## Static review record

- Read `AGENTS.md`, Requirements FR-3/FR-5/FR-7, the exact Section P parent checklist, the current roadmap context, the American-shad identity review, the recent R121–R126 fish proposals and batch notes, and the Section P proposals/batches matching this candidate's names.
- Re-read the live split package: 1,476 ingredient references, 107 forms, 63 legacy candidates, and 1,819 research-ledger records with 7,533 source entries and 6,406 distinct source IDs. The manifest lists 114 recipe files with 1,123 ingredient rows.
- Checked normalized exact ownership for the proposed English/French names, binomial, Kohada/Konoshiro, dotted gizzard shad, and vernacular terms in references, forms, legacy candidates, and ledger records. No active owner or candidate identity ID was found. Prior mentions in the American-shad and hickory-shad reviews are only adjacent-species notes.
- Audited 114 manifest-listed recipe files and all 1,123 ingredient rows for the candidate names, taxon, adjacent Kohada names, and named vernaculars. No file or ingredient-row matches were found.
- Projected current matcher results for qualified and broad queries, then for the hypothetical alias-free bilingual display. Confirmed the candidate ID `ingredient-ref-american-gizzard-shad` is unallocated.
- Checked the R128 source-ID prefix against every ledger source ID and the proposal/batch archive; no prior owner was found. No package JSON or shared catalog data was changed.
- This is proposal-only documentation; no unit, instrumentation, Gradle, emulator, or other tests were run.
