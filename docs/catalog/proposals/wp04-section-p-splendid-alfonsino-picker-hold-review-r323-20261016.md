# WP04 Section P R323 — Splendid alfonsino picker and market-boundary review

- **Review date:** 2026-10-16
- **Plan anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, lines 7140–7141: resolve vernacular fish names against identity evidence rather than treating different species as synonyms.
- **Candidate:** splendid alfonsino, *Beryx splendens*.
- **Decision:** hold the species-specific identity outside active references and the research ledger until the bare Canadian/Québec market label `alfonsino` can be represented without mapping it to only one of two source-attested species.
- **Scope:** identity and picker boundary only. This review does not cover *Beryx decadactylus* as a separate catalog candidate, product forms, or preparation states.
- **Write scope:** this proposal only. No shared catalog, ledger, checklist, roadmap, recipe, or generated file changed.

## Why this is a distinct open review

The unchecked vernacular-fish item at lines 7140–7141 remains open. A repository search for `alfonsino`, `alfonsin`, `kinmedai`, `Beryx splendens`, `alfonsin long`, `imperador`, and `red bream` found no focused prior proposal, integration record, active reference/form, legacy identity, or ledger record for this candidate. The neighboring active fish and bream references do not own these exact names. This is a new species-name and picker review; it does not reopen the Bombay-duck R320 review, the mackerel reviews, or any other completed candidate.

The live bundle currently has 1,676 ingredient references and 127 forms. The ownership and picker snapshot below was read on 2026-10-16 while other catalog integrations may be in progress; counts should be refreshed before any later integration.

## Identity and product boundary

Fisheries and Oceans Canada’s 2014 Québec-region species-code list gives the family *Berycidae* the broad names `alfonsin / alfonsino`, then distinguishes *Beryx decadactylus* as `béryx commun / red bream` and *Beryx splendens* as `alfonsin long / slender alfonsino`. The same report lists the two valid scientific names separately. This is strong Canadian bilingual taxonomic and naming evidence for a qualified *B. splendens* identity, but it is a Québec-region science code list, not a current consumer-label rule.

The Québec seafood supplier Terra Nostra currently lists **both** *B. decadactylus* and *B. splendens* under the same consumer-facing common name, `Alfonsino`. Its contact page identifies its location as Saint-Laurent, Québec. This direct Québec market evidence makes a bare `alfonsino` recipe/import query materially ambiguous, despite DFO’s more qualified species names. Tavora’s current Canadian fresh-fish listing also sells `Alfonsino / Imperador` without a binomial. A Toronto listing titled `Kinmedai - Splendid Alfonsino` shows the more specific Japanese-market wording for a species-qualified product; that title alone does not establish that `kinmedai` is a safe universal synonym for every product sold as alfonsino.

Do not assign `alfonsino`, `alfonsin`, `imperador`, `red bream`, `béryx commun`, or `kinmedai` as aliases to a future *B. splendens* row on this review. In particular, DFO assigns `red bream / béryx commun` to *B. decadactylus*, while the Québec supplier’s use of `Alfonsino` spans both species. Do not collapse the two taxa or treat a retailer’s unqualified label as species evidence.

## Ownership and picker projection

Active-reference and form ownership was checked using the live bundled catalog and the phrase-first search behavior documented in `IngredientSearch.kt`. Exact searches for `alfonsino`, `slender alfonsino`, `alfonsin`, `alfonsin long`, `kinmedai`, `imperador`, `red bream`, `béryx long`, and `Beryx splendens` currently return **0** active references. No exact legacy or ledger owner was found for those terms.

The current broad queries `fish` and `poisson` each return **10** references under the phrase-first projection. A hypothetical identity with only the source-qualified displays `slender alfonsino / alfonsin long` would leave those broad counts unchanged, but would make `alfonsino`, `alfonsin`, `slender alfonsino`, and `alfonsin long` each return that one new reference. The single-result behavior for bare `alfonsino` is the problem: the Québec source already applies that label to two different species, and the other species has no active picker row to expose the ambiguity. Do not simulate safety by assigning the broad term as an alias or by adding an unreviewed *B. decadactylus* row.

## Bundled recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned, including ingredient names, original text, reference/form IDs, and complete recipe-file strings. The scan found **0** occurrences of `alfonsino`, `alfonsin`, `slender alfonsino`, `alfonsin long`, `kinmedai`, *Beryx splendens*, `imperador`, or `red bream`. There is no recipe line to link or contextual phrase that would resolve which *Beryx* species the word `Alfonsino` denotes.

## Measurements and substitutions

No catalog measurement or substitution is proposed. A DFO-hosted 1979 translation of a 1977 study reports individual *B. splendens* samples 29–40 cm long and 303–765 g, plus a study-specific 43.6% edible-part estimate under its described cut basis. These are biological and processing-study observations, not a household portion, count-weight rule, package yield, or transferable cooking yield. The study also discusses boiled, fried, and canned uses; it does not establish equivalence to another fish or a substitution ratio. No bundled recipe or current Québec consumer product evidence supports a reusable measure or substitute.

## Recommendation and limits

Keep *B. splendens* unallocated for now and leave the plan’s vernacular-fish parent item open. Revisit after the related *Beryx* market identities have been reviewed together or the picker can explicitly preserve the known ambiguity of a bare `alfonsino` search. At that point, retain DFO’s `slender alfonsino / alfonsin long` pair as the leading species-qualified display candidate, then reassess aliases and picker behavior from current consumer labels. The present hold does not claim that the species is unavailable in Canada; it records that a current Québec supplier applies the same bare label to two taxa.

Targeted OQLF GDT searches for `alfonsino`, `slender alfonsino`, `alfonsin long`, and *Beryx splendens* did not locate an entry during this review. That search result is not proof that no relevant terminology record exists. The DFO bilingual species list supplies a Québec-region French/English species name, but it does not substitute for a Québec consumer-label source.

## Sources

| ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **WP04-SECTIONP-ALFONSINO-R323-20261016-S01** | Fisheries and Oceans Canada, Miller and Chabot, [*Code List of Marine Plants, Invertebrates and Vertebrates Used by the Quebec Region of DFO*](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/353303.pdf), Canadian Data Report of Fisheries and Aquatic Sciences 1254 (2014), Table 1, PDF p. 66. | The family *Berycidae* is listed as `alfonsin / alfonsino`; *B. decadactylus* as `béryx commun / red bream`; and *B. splendens* as `alfonsin long / slender alfonsino`. The adjacent code table keeps the species distinct. | A science-region species code list, not a current CFIA consumer-label standard. It describes taxonomy and names, not what a recipe or retail package means by bare `alfonsino`. |
| **WP04-SECTIONP-ALFONSINO-R323-20261016-S02** | Terra Nostra, [Fresh Fish](https://www.terranostrafoods.com/fresh-fish/), accessed 2026-10-16; page entries `Alfonsino / Beryx decadactylus` and `Alfonsino / Beryx splendens`; contact location `644 Rue Deslauriers, St. Laurent, QC`. | Current Québec seafood-market evidence that the same common display `Alfonsino` is used for both taxa. | Supplier page invites quote requests; it does not document a specific SKU, package, species-specific French consumer label, or current inventory. |
| **WP04-SECTIONP-ALFONSINO-R323-20261016-S03** | Tavora Foods, [Fresh Fish collection](https://shop.tavora.ca/collections/fresh-fish), accessed 2026-10-16; listed item `Alfonsino / Imperador`, shown at `$16.99/lb` on the page. | A current Canadian retail listing for the unqualified market names. | No binomial, species, package amount, portion, currency code, or Québec-specific French naming is given; the displayed price unit is not a recipe measure. |
| **WP04-SECTIONP-ALFONSINO-R323-20261016-S04** | Daily Seafood, [Kinmedai - Splendid Alfonsino](https://shop.dailyseafood.ca/products/61a052a9c8abab002d3ce49c/kinmedai-splendid-alfonsino), accessed 2026-10-16. | A Canadian retailer’s species-qualified English/Japanese product title; the description presents alfonsino as a culinary fish. | The page does not state a Latin binomial, and its broader “also known as” list does not establish that those names are safe aliases across species or sellers. Not Québec-specific. |
| **WP04-SECTIONP-ALFONSINO-R323-20261016-S05** | Fisheries and Marine Service, Dvinin and Konstantinova, [*Technochemical composition of some Atlantic deep-water fishes and recommendations for their use*](https://waves-vagues.dfo-mpo.gc.ca/Library/116320.pdf), Translation Series 4485 (1979; translation of 1977 source), PDF pp. 9–10. | Reports the study sample lengths and masses, cut-specific edible fraction, and culinary processing observations for *B. splendens*. | Historical translated research; sample/cut-specific values are not household measurements, general yields, current retail specs, or substitute evidence. |

**Accessed:** 2026-10-16. No software tests, builds, emulator checks, or deployments were run; this is a proposal-only review with no application or database changes.
