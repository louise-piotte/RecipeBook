# WP02 A6 round 11: Sajjalu aliases for pearl millet — 2026-10-13

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated by root in round eleven; the original review and integration record are preserved below.
- **Selected gap:** Telugu common name Sajjalu and the exact flour phrase Sajjalu flour, mapped to the existing pearl millet grain and plain pearl millet flour rows.
- **Plan state:** The active A6 checklist remains open at the broad review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours. The prior Guinea-corn decision is integrated; this candidate is not named in the active checklist.
- **Recommendation:** **Integrate two English search aliases on existing owners.** Add sajjalu to the pearl millet grain row and sajjalu flour to the pearl millet flour row. Do not create another identity or change French displays, forms, numeric behavior, recipe links, or substitutions.
- **Scope:** A bounded spelling and product-name mapping. The recommendation does not make a broad claim about every regional pearl millet name or every flour with a process qualifier.

## Candidate and archive audit

ICAR–IIMR’s vernacular-name table places Telugu Sajjalu in the Pearl Millet column [S01]. A current storefront page with Canadian currency explicitly presents the product as Pearl Millet Flour | Sajjalu | Bajra and says it is made from Pearl Millet (Sajjalu) [S02]. Those sources support the grain alias and the flour phrase separately.

This is distinct from the [prior WP03 pearl millet naming review](wp03-section-f-pearl-millet-bajra-grain-flour-boundary-review-20261010.md), which left sajje and kambu inactive because the reviewed source did not support those spellings. Neither spelling is proposed here. It is also distinct from the [WP02 A6 sprouted pearl millet hold](wp02-a6-sprouted-pearl-millet-flour-boundary-review-20261012.md): that packet’s reseller URL contained the joined string sajjalukambubajri-atta, but the packet reviewed a sprouted product and a missing Québec product name; it did not review the plain grain name Sajjalu, allocate the exact key, or evaluate a Sajjalu flour alias. The joined URL slug is not treated as independent alias evidence. The new primary crosswalk and the separate plain flour listing support this narrower decision.

No earlier A6 alias decision, hold, source register, or catalog entry assigns the exact normalized keys sajjalu or sajjalu flour. No grain or flour identity is created.

## Identity and Québec French boundary

The IIMR table maps the Telugu name Sajjalu to Pearl Millet [S01]. FSSAI’s current cereal standard defines Bajra (Pearl Millet) flour as product milled from pearl millet grain; it supports the existing flour class, not the Sajjalu spelling by itself [WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S01]. The current merchant listing supplies the direct flour-name evidence for Sajjalu [S02].

Retain the grain display **pearl millet / millet perlé** and the flour display **pearl millet flour / farine de mil chandelle**. OQLF supplies Québec pearl millet terminology, and Codex’s current French standard names the flour farine de mil chandelle; the existing accepted search alias farine de millet perlé also remains on the flour row [WP03-S18; WP02-S34; WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S01–S04]. This proposal adds no French wording. In particular, do not construct farine de Sajjalu or a new French transliteration from a regional name in Latin script.

The listing is a merchant page, not a Canadian package or Québec French label. The site shows a /ca page path and a CA$ price, but its contact address is in Telangana, India [S02]. Treat it as evidence of a current English listing presented with Canadian currency, not proof of a Canadian manufacturer, general shipping availability, or Québec label wording.

## Exact catalog ownership and proposed fields

The live catalog contains 1,342 references and 98 forms. The grain owner is ingredient-ref-pearl-millet, displayed as pearl millet / millet perlé, category GRAIN_AND_CEREAL, with English aliases bajra and bajri, null defaultDensity, and no unit mappings. The flour owner is ingredient-ref-pearl-millet-flour, displayed as pearl millet flour / farine de mil chandelle, category FLOUR_AND_STARCH, with English aliases bajra flour and bajri flour, French alias farine de millet perlé, null defaultDensity, and no unit mappings. Neither target has an attached form.

| Owner | Current aliasesEn | Exact proposed aliasesEn | Retain |
|---|---|---|---|
| ingredient-ref-pearl-millet | ["bajra", "bajri"] | ["bajra", "bajri", "sajjalu"] | Display, aliasesFr, category, null defaultDensity, empty unitMappings |
| ingredient-ref-pearl-millet-flour | ["bajra flour", "bajri flour"] | ["bajra flour", "bajri flour", "sajjalu flour"] | Display, existing French alias, category, null defaultDensity, empty unitMappings |

Use only the two aliases shown. Do not add sajjalu atta, sajjalu pindi, sajjala pindi, Telugu script terms, or a new reference, form, or legacy ID. The merchant source explicitly lists Telugu sajjala pindi and the Latin rendering Sajjala Pindi, but this proposal does not generalize one retailer’s transliteration or add a second spelling beyond the directly crosswalked Sajjalu name [S02]. Do not add Sajjalu to generic millet flour, sprouted pearl millet flour, or another millet species.

## Exact normalized ownership and picker projection

The ownership audit follows the app’s current normalization: lowercase, Unicode NFKD, compatibility folds for œ/æ/ß and ampersand, remove combining marks, map other punctuation to spaces, and collapse whitespace. It checks reference IDs, names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs.

| Normalized key | Current exact owner across references, forms, legacy candidates, and ledger record IDs | Proposed ownership |
|---|---|---|
| sajjalu | None | ingredient-ref-pearl-millet |
| sajjalu flour | None | ingredient-ref-pearl-millet-flour |
| sajjalu atta | None | None |
| sajjala pindi | None | None |
| sajje | None | None; retained outside this decision |
| kambu | None | None; retained outside this decision |
| pearl millet | ingredient-ref-pearl-millet | Unchanged |
| pearl millet flour | ingredient-ref-pearl-millet-flour | Unchanged |
| bajra | ingredient-ref-pearl-millet | Unchanged |

No target form contributes a competing search term. The current and projected results below follow the live picker logic, which checks complete phrases before partial matches, in IngredientSearch.kt. The projection appends only the two proposed aliases.

| Query | Current picker result | Projected picker result |
|---|---|---|
| sajjalu | No result | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour |
| sajjalu flour | No result | ingredient-ref-pearl-millet-flour only |
| sajjalu atta | No result | No result |
| sajjala pindi | No result | No result |
| sajje | No result | No result |
| kambu | No result | No result |
| pearl millet | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | Same two choices |
| pearl millet flour | ingredient-ref-pearl-millet-flour only | Same |
| millet flour | Finger, foxtail, kodo, generic millet, pearl millet, and proso millet flour rows | Same six rows |
| bajra | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | Same two choices |
| bajra flour | ingredient-ref-pearl-millet-flour only | Same |
| farine de millet perlé | ingredient-ref-pearl-millet-flour only | Same |

The bare Sajjalu query is intentionally a grain/flour choice: the grain alias owns the exact word and the qualified flour alias contains that word. The full Sajjalu flour phrase selects only flour. There is no form hint for either result.

## Source and ID collision audit

The two proposed source IDs were searched against the live ledger and all current proposal and batch records before drafting. Both were absent from the 5,326 distinct source IDs already represented in the ledger and absent from the archive. Source entries may intentionally recur across ledger records; no new entry is being added in this proposal.

| Proposed ID | Source | Collision result |
|---|---|---|
| WP02-A6-SAJJALU-PEARL-MILLET-20261013-R11-S01 | ICAR–IIMR, Nutritional and Health Benefits of Millets | Absent from the live ledger and prior proposal/batch archive |
| WP02-A6-SAJJALU-PEARL-MILLET-20261013-R11-S02 | Kalagura Gampa, Canadian-currency Pearl Millet Flour listing | Absent from the live ledger and prior proposal/batch archive |

No observation ID, substitution-finding ID, measurement record, decision record, recipe link, ingredient ID, form ID, or legacy candidate ID is proposed. The current flour ledger IDs remain pearl-millet-flour-bulk-density-irondi-2022 and pearl-millet-flour-wheat-bread-formula-20261012; both are already globally unique in the live ledger and remain unchanged. Existing source IDs for the FSSAI, OQLF, Codex, CNF, density, and bread-study records are reused as citations only; do not register them again.

## Bundled recipe demand

All 114 recipe files listed in the manifest and all 1,123 ingredient rows were scanned. The scan covered complete serialized recipe text, ingredient-row fields, and direct links to both target reference IDs. Candidate text included Sajjalu, Sajjalu flour, Sajjalu atta, Sajjala Pindi, Telugu spellings, pearl millet and flour names, Bajra/Bajri variants, the existing French names, sprouted pearl millet terms, and both reference IDs.

- Recipe-file hits for the candidate or target-name set: **0**.
- Ingredient-row hits: **0**.
- Direct links to either target reference: **0**.
- Recipe changes or links are not proposed.
- Corpus in manifest order: 114 files, 1,123 ingredient rows, 753,792 bytes; fingerprint **7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c**.

This is catalog naming coverage; recipe demand did not drive the recommendation.

## Measurement and substitution limits

Treat identity, measurement, and substitution evidence separately.

- **Identity:** Add the two sourced search aliases only. The source does not justify another ingredient identity, form, recipe link, grind grade, sprouting state, or ingredient conversion.
- **Current flour measurement state:** researched_supported, with the existing observation pearl-millet-flour-bulk-density-irondi-2022: a 100% whole pearl millet flour laboratory sample has bulk density 0.63 ± 0.01 g/mL. The paper prepared the sample by grinding whole pearl millet grain below 0.5 mm and used a dry 100 mL cylinder loaded with 50 g, tapped until volume stopped decreasing [WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S06]. This result is limited to that sample and method, not a household cup conversion or product-independent default. Keep defaultDensity null and unitMappings empty.
- **Canadian food-code portion:** Health Canada food code 6186, Grains, millet, flour, lists 250 mL = 125.7 g and a 20.0 g serving [WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S05]. It is generic millet flour with no pearl millet species identification, so neither quantity is transferable to this row.
- **Merchant package:** the 500 g on the S02 page is a package net amount, not a serving, household measure, density, or yield. No recipe conversion is inferred.
- **Substitution state:** blocked_pending_evidence. The existing finding pearl-millet-flour-wheat-bread-formula-20261012 records a Maktouf et al. test of 1%, 2%, 5%, and 10% pearl millet flour replacement by weight in one Tunisian wheat bread formula; its reported 5% result is not a general recipe replacement ratio [WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S07]. Keep no active global or contextual substitution rules, no substitution link, and no new finding.
- **Grain measurements:** the grain ledger state remains not_yet_researched. No flour measurement or product pack amount is transferred to the grain row.

Both active substitution-rule JSON files remain empty in the current baseline. The source page’s use suggestions and nutrition/health marketing are not conversion or substitution evidence.

## Baseline snapshot

Captured from the shared working tree on 2026-10-13 before this proposal was created. Hashes cover exact file bytes. The recipe fingerprint uses manifest order and hashes each relative recipe path, a NUL byte, file bytes, and a trailing NUL byte.

| Surface | Current snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active A6 plan | 935,318 bytes; broad A6 parent remains open | 50ece28eca4fea2ee99f4597896d453c3034b7222ce8edd7ea817da0b32d0bc4 |
| Ingredient references | 1,342 rows; 430,224 bytes | 1a66cb1c4ac57ffff1df85a058c94fe10d5d85385c3b2c12107326e712cc7d5f |
| Ingredient forms | 98 rows; 73,589 bytes | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import candidates | 64 rows; 15,264 bytes | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Research ledger | 1,653 records; 6,345 source entries; 5,326 distinct source IDs; 342 measurement observations; 191 substitution findings; 6,312,486 bytes | 4b85be2b024f00cc20bb2bafb80a8cbd549b70549cbe5107c41e03e2b71af0f0 |
| Seed manifest | 114 recipe paths; 12,011 bytes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Recipe corpus | 114 files; 1,123 rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |
| Generated BundledIngredientCatalog.kt | 1,342 references; 588,540 bytes | 35742dd9a9f5bb52b4eb45b1826fcf9633e58ffd4002ac97b95c1877a7ec0165 |
| Global substitution rules | 0 rules; 3 bytes | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| Contextual substitution rules | 0 rules; 3 bytes | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |

## Source register

Sources were accessed on 2026-10-13. S01 and S02 are new source IDs for this proposal only; they are not ledger entries. Existing ledger sources cited in the limits below are reused and must not be registered again.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP02-A6-SAJJALU-PEARL-MILLET-20261013-R11-S01** | ICAR–Indian Institute of Millets Research, [Nutritional and Health Benefits of Millets](https://millets.res.in/m_recipes/Nutritional_health_benefits_millets.pdf), printed 2017, vernacular-names table, printed p. 14 (PDF viewer p. 19). | Primary institutional reference; its table maps the Telugu term Sajjalu to the Pearl Millet column. Supports the grain alias only; it does not name flour or provide a recipe measure. |
| **WP02-A6-SAJJALU-PEARL-MILLET-20261013-R11-S02** | Kalagura Gampa, [Pearl Millet Flour, Sajjalu, Bajra, MYMB, 500 g](https://kalaguragampa.com/ca/product/pearl-millet-flour-sajjalu-bajra-mymb-500-grams), title and description. | Current store page with a /ca path and CA$ price shows in-stock status and calls the product Pearl Millet Flour (Sajjalu/Bajra), including Made from Premium Pearl Millet (Sajjalu). The page lists a 500 g package and the site identifies a Telangana contact address; it is not a Canadian manufacturer or Québec French label. Use only its exact product-name pairing, not its marketing claims, shipping assumptions, or package amount as a recipe measure. |

Existing sources rechecked on 2026-10-13 and already present on the indicated live ledger records:

- **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S01:** FSSAI, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.17, PDF p. 57–58; flour boundary only.
- **WP03-S18:** OQLF, [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle); Québec grain terminology.
- **WP02-S34:** Codex Alimentarius, [Norme pour la farine de mil chandelle (CXS 170-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B170-1989%252FCXS_170f.pdf); French product standard/display.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S01–S04:** OQLF, Usito, a French product listing, and Metro wording; sources for the existing French alias only.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S05:** Health Canada, [Canadian Nutrient File serving portion, food code 6186](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6186); generic millet flour, not species-specific.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S06:** Irondi et al., [pearl millet flour blend study](https://www.frontiersin.org/journals/food-science-and-technology/articles/10.3389/frfst.2022.974588/full); existing bulk-density observation limited to that study’s method and sample.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S07:** Maktouf et al., [pearl-millet/wheat bread trial](https://pmc.ncbi.nlm.nih.gov/articles/PMC4926890/); existing formula-specific substitution finding only.

## Static review checks

The live data and picker projection were read from the current package and search implementation; this review created only this proposal. The source, ownership, picker, measurement/substitution, and recipe scans above are static review evidence. No app, unit, instrumentation, emulator, or application tests were run. No tests are needed for a proposal-only review.

## Root integration result (2026-10-13)

Added `sajjalu` to `ingredient-ref-pearl-millet.aliasesEn` and `sajjalu flour` to `ingredient-ref-pearl-millet-flour.aliasesEn`. Registered S01 on the grain record and S02 on the flour record, with one accepted decision per alias. Existing displays, aliases, forms, flour density/measurement evidence, empty unit mappings, and blocked substitution research remain unchanged. No recipe links or measures were added.
