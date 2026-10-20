# WP04 Section P — red snapper / vivaneau rouge species and picker boundary

- **Review date:** 2026-10-12.
- **Candidate:** *Lutjanus campechanus*, named by OQLF as red snapper / vivaneau rouge.
- **Prospective category:** PROTEIN if a future review resolves the label and picker scope; no active reference is allocated.
- **Disposition:** **Documented hold.** Keep the species row and generic snapper / vivaneau candidates unallocated; the decision is recorded in the [hold integration note](../batches/wp04-section-p-red-snapper-vivaneau-picker-hold-integration-20261012/README.md), the active plan, and the roadmap.
- **Reason:** OQLF maps the preferred Québec name vivaneau rouge to *L. campechanus*, but the CFIA Fish List also maps that exact French label to *Lutjanus purpureus* (Southern red snapper). Current Québec retailer listings use vivaneau rouge without a taxon. With only the proposed display red snapper / vivaneau rouge, the picker would also make the broader queries snapper and vivaneau return this one species alone.
- **Integration status:** No active red-snapper catalog row or identity ledger record was added. The hold documentation added no catalog reference, ledger record, form, measure, density, unit mapping, recipe link, conversion, package yield, or substitution. This refresh changes only this proposal; no app, unit, instrumentation, or emulator tests were run.

## Candidate and naming boundary

The candidate is *Lutjanus campechanus*. OQLF’s edible-fish entry prefers **vivaneau rouge**, pairs it with English **red snapper**, gives the scientific name, and describes the species as having commercial potential in Québec. The same entry notes **vivaneau campèche** as a term used in some contexts but says the Québec fish-products terminology committee did not retain it. This supports the OQLF term for its stated scope; the 2012 entry does not establish current retailer inventory. [S01]

CFIA’s Fish List gives a conflicting French labeling boundary. Its current search output lists *L. campechanus* as **Red Snapper / Vivaneau** and also **Snapper / Vivaneau Campèche**. It separately lists *Lutjanus purpureus* as **Southern Red Snapper / Vivaneau rouge**. The same snapper query returns many other taxa with **Snapper** or **Vivaneau** names, including species-level and group-level rows. CFIA defines the Fish List as common names acceptable in Canada for fish labeling and scientific names used for species identification; this is nomenclature evidence, not evidence that an unlabeled consumer product is *L. campechanus*. [S02–S04]

The current Québec consumer listings do not resolve that conflict. Caboria Poissonnerie in Laval lists **Vivaneau rouge** as a whole fish sold by the pound on a daily-arrivals page, with availability subject to change. Supermarché PA lists **vivaneau rouge frais nettoyé**, approximately 500 g, without a scientific name. Neither page establishes whether its own product is *L. campechanus*, *L. purpureus*, or another snapper taxon. The product-specific package amount is not species evidence. [S05–S06]

Keep the following distinctions explicit:

- Do not treat the retailer phrase **vivaneau rouge** as proof of *L. campechanus*; CFIA uses that exact French name for *L. purpureus*.
- Do not create a generic **snapper / vivaneau** reference from the species row. CFIA applies those names across multiple taxa.
- Do not add **vivaneau campèche** as an alias. Although CFIA lists it for *L. campechanus*, OQLF says the term was not retained for Québec fish-product marketing.
- Do not use color, family membership, or an unqualified “red snapper” product line to infer a taxon. Keep *L. campechanus*, *L. purpureus*, other snappers, and the existing Québec redfish / sébaste identity separate.
- A future item named **Northern red snapper** or a lot with an explicit scientific identity could support a narrower source-level interpretation, but no such current Québec consumer product was established in this review.

## Prior review and exact ownership

The earlier finfish gap review already kept generic snapper / grouper names unresolved because CFIA assigns these market terms to multiple taxa. This proposal does not reopen or replace that decision; it checks the distinct *L. campechanus* candidate against current Québec terminology and product labels. A repository search found no earlier focused *L. campechanus* / red snapper species review, active allocation, or hold. The nearby bluefish review mentions juvenile use of snapper as an excluded name, not as a red-snapper identity. [Earlier broad decision: [WP04 finfish gaps](wp04-finfish-gaps-20261010.md).]

The exact-key audit follows the project normalization used by IngredientSearch.kt: lowercase, Unicode NFKD, fold œ / æ / ß and &, remove combining marks, replace punctuation with spaces, and collapse whitespace. It checked active reference IDs, displays, and aliases; form IDs, labels, and match terms; legacy candidate IDs, names, and aliases; ledger record IDs; and source-ID allocation. No exact owner was found for these proposed names or IDs:

| Prospective key | Active reference | Form | Legacy candidate | Ledger |
|---|---|---|---|---|
| ingredient-ref-red-snapper / candidate-red-snapper | None | None | None | No matching record ID |
| red snapper / vivaneau rouge | None | None | None | No matching identity record |
| American red snapper / Caribbean red snapper / Mexican snapper / day snapper / Northern red snapper | None | None | None | No matching identity record |
| vivaneau campèche / snapper / vivaneau | No exact stored alias | None | None | No candidate identity allocation |
| *Lutjanus campechanus* / *Lutjanus purpureus* | None | None | None | No matching species record |

The earlier generic snapper review and its evidence remain in the archive; the table concerns exact live ownership and species allocation, not absence of all mentions of snapper in research notes. The proposal-local source prefix **WP04-SECTIONP-RED-SNAPPER-20261012-R1** remains unallocated: none of its S01–S06 IDs occurs among the 5,017 live ledger source IDs. The hold integration note confirms that no source IDs or ledger records were added.

## Live package snapshot

The snapshot was refreshed on 2026-10-12 after the hold documentation was integrated. File sizes and hashes cover exact bytes; all artifact counts and digests below match the live worktree. The corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| ingredient-references.v1.json | 1,323 references; 423,574 bytes | 86076e7b58fe1d06889f15792a0d2928f69951582bc0d39aaa13a3f7f54f3835 |
| ingredient-forms.v1.json | 98 forms; 73,589 bytes | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| legacy-import-identities.v1.json | 64 candidates; 15,264 bytes | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| research-ledger.v1.json | 1,631 records; 6,000 source entries; 5,017 distinct source IDs; 8 unit conversions; 5,955,122 bytes | 95da8ee4b608a3a8bc3cac26205762222765e7dfb5c72b6620aaff01a51fea84 |
| manifest.v1.json | 114 recipe paths; 12,011 bytes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |
| Generated BundledIngredientCatalog.kt | 1,323 references; 579,852 bytes | 9eff5dce691429d43cfc0c13a1feeac55c04c200f3615eaae03b0f713f0ac55d |
| substitution-rules.v1.json | 0 global rules; 3 bytes | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| contextual-substitution-rules.v1.json | 0 contextual rules; 3 bytes | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| package-yields.v1.json | 1 package-yield record; 853 bytes | 5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b |

The current catalog has no red-snapper reference, form, recipe link, density, or unit mapping. The package-yield record and the eight ledger conversions belong to other ingredients. No global or contextual substitution rule is present.

## Phrase-first picker audit

IngredientSearch.kt first returns complete normalized word-phrase matches across displays and aliases, then uses substring fallback only if no complete phrase matched. I projected the proposed displays **red snapper / vivaneau rouge**, with no aliases or forms, through that behavior:

| Query | Current picker | With the hypothetical row | Decision |
|---|---|---|---|
| red snapper | No result | Red snapper / vivaneau rouge only | The display is species-qualified in OQLF, but the plain English market phrase appears in multiple CFIA names. |
| vivaneau rouge | No result | Red snapper / vivaneau rouge only | Conflicts with CFIA’s same French name for *L. purpureus*. |
| snapper | No result | Red snapper / vivaneau rouge only | A broad market query would be assigned to one species, though CFIA uses Snapper across many taxa. |
| vivaneau | No result | Red snapper / vivaneau rouge only | A broad French query would be assigned to one species, though CFIA uses Vivaneau across many taxa. |
| vivaneau campèche | No result | No result | Do not add as alias; OQLF says the term was not retained for Québec fish-product marketing. |
| *Lutjanus campechanus* | No result | No result | Keep the scientific name as evidence only; it is not a consumer alias in this proposal. |
| red | 22 current references, including red drum and red hake | Those references plus the hypothetical row | The broad color word stays a multiple-choice query. |

Omitting **snapper** and **vivaneau** from alias arrays would not solve the problem: both terms are embedded in the bilingual displays and are matched as complete word phrases. Do not add the row or a generic alias until picker behavior can preserve the species and market-name alternatives or a taxon-identified product can be selected explicitly.

## Full recipe-corpus demand

All 114 manifest-listed JSON recipes and all 1,123 ingredient rows were searched across parsed recipe strings and ingredient fields. The whole-word-phrase audit included red snapper, American red snapper, Caribbean red snapper, Mexican snapper, day snapper, Northern red snapper, vivaneau rouge, vivaneau campèche, vivaneau, snapper, *Lutjanus campechanus*, *Lutjanus purpureus*, and ingredient-ref-red-snapper.

**Result: zero matching recipe files and zero matching ingredient rows.** There is no species-qualified line, generic snapper line, quantity, product state, or recipe link to resolve in the current corpus.

## Product, measurement, and substitution limits

The two local retail pages establish only their own product wording and presentation: Caboria lists a whole fish sold by the pound, and PA lists an approximately 500 g fresh-cleaned package. Neither source identifies a scientific taxon, so neither presentation nor amount can be assigned to *L. campechanus* or generalized to a whole-fish/fillet conversion. These are listing details, not household measures, edible yields, recipe amounts, or unit mappings. Add no form, density, quantity, package yield, conversion, or recipe link.

No recipe or reviewed source supports a directed substitution from *L. campechanus* to *L. purpureus*, another snapper, redfish, cod, or generic white fish. The Fish List’s common-name and species associations are not culinary interchangeability guidance. Add no global or contextual substitution.

## Source register and limits

Sources were checked online on 2026-10-12. Source IDs below are proposal-local only and were not allocated to the shared ledger.

| Source ID | Primary source | Supports and limits |
|---|---|---|
| WP04-SECTIONP-RED-SNAPPER-20261012-R1-S01 | OQLF, [vivaneau rouge, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199102/vivaneau-rouge) | Directly pairs preferred Québec edible-fish name vivaneau rouge with red snapper and *Lutjanus campechanus*; notes commercial potential in Québec. It identifies vivaneau campèche as a non-retained fish-product term. The 2012 terminology entry does not establish current local inventory. |
| WP04-SECTIONP-RED-SNAPPER-20261012-R1-S02 | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Says the Fish List gives French and English common names acceptable in Canada for fish labeling and scientific names used for species identification. It is regulatory nomenclature, not proof of a retailer’s species or a recipe synonym. |
| WP04-SECTIONP-RED-SNAPPER-20261012-R1-S03 | CFIA Fish List, [English snapper query results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=snapper) | Official search output lists *L. campechanus* as Red Snapper / Vivaneau and Snapper / Vivaneau Campèche; it also lists many other Snapper / Vivaneau taxa, including *L. purpureus*. The list result page shows a 2023-09-18 modification date. This is the label-name list, not current retail inventory. |
| WP04-SECTIONP-RED-SNAPPER-20261012-R1-S04 | CFIA Fish List, [Southern-name query results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Southern) | Official output directly lists *L. purpureus* as Southern Red Snapper / Vivaneau rouge. This demonstrates the French-label conflict with OQLF’s *L. campechanus* entry; it does not claim the two species are interchangeable. |
| WP04-SECTIONP-RED-SNAPPER-20261012-R1-S05 | Caboria Poissonnerie & Restaurant, [Laval daily fish arrivals](https://caborialaval.com/poisson-du-jour) | The current French page lists vivaneau rouge as a whole fish sold by the pound and states that arrivals are updated daily and subject to change. It gives no scientific name or product-specific weight. |
| WP04-SECTIONP-RED-SNAPPER-20261012-R1-S06 | Supermarché PA, [vivaneau rouge frais nettoyé](https://www.supermarchepa.com/products/fresh-cleaned-red-snapper-vivaneau-rouge-frais-nettoye?view=fr) | Current Québec online listing uses vivaneau rouge frais nettoyé and an approximate 500 g package. It provides no scientific name; the package amount is specific to the listing and cannot resolve the species or support a general measure. |

## Static checks

- Parsed the active references, forms, legacy candidates, ledger, manifest, substitution files, package yields, and all manifest-listed recipes as strict UTF-8 JSON without modifying them.
- Recomputed current counts, exact-byte hashes, and manifest-ordered corpus digest from the live worktree.
- Rechecked normalized exact ownership in active references, forms, legacy candidates, and ledger record IDs; checked the unused proposal path and source-ID prefix across ledger/proposal/batch/plan files.
- Reproduced the current phrase-first and substring-fallback behavior from IngredientSearch.kt for the proposed displays and the queries shown above.
- Scanned all 114 recipe files and 1,123 ingredient rows for the candidate and adjacent species/product terms; every scanned term had zero hits.
- This proposal is UTF-8 without BOM, ends in a newline, and has no trailing whitespace or common mojibake markers.
- This proposal refresh changes only this proposal; the hold integration is documentation-only. No app tests or emulator checks were run.
