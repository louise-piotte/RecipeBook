# WP04 Section P — Freshwater Drum / Malachigan Identity Boundary Review

**Review date:** 2026-10-12  
**Disposition:** Accepted and integrated by root as identity-only `freshwater drum / malachigan` for *Aplodinotus grunniens*, with no aliases, forms, measurements, recipe links, or substitutions.  
**Scope:** One Canadian freshwater food-fish species. This is not a family-level “drum” row and does not cover red drum, sheepshead porgy, white perch, roe, or preserved/prepared products.

## Why this is an open gap

The open Section P checklist still calls for regional fish identities. A search of the checklist, proposal and batch archive, active references, forms, legacy candidates, and ledger found no prior freshwater-drum or malachigan review or allocation. This species is distinct from the recently integrated brown bullhead, Québec redfish group, and mahi-mahi group.

Québec’s OQLF identifies **malachigan** as the preferred term in both the edible-fish and ichthyology domains, links it to *Aplodinotus grunniens*, and notes commercial potential in Québec. The CFIA Fish List independently assigns the English label **Drum** and French **Malachigan** to that same taxon, and also lists **Freshwater Drum**. These official food-name records resolve the identity more specifically than the broad terms in prior Section P holds. A 2017 Manitoba government assessment documents a food processor offering drum as a fish product; this is historical Canadian product evidence, not proof of current Québec or retail availability.

## Names and taxonomic boundary

| Field | Recommended value |
|---|---|
| English display | Freshwater drum |
| Québec French display | Malachigan |
| Scientific identity | *Aplodinotus grunniens* |
| Catalog category | **PROTEIN** |
| English aliases | None |
| French aliases | None |

Use the one species only. OQLF reports that **malachigan d’eau douce** and **tambour** were not retained by the fish-products terminology committee. TERMIUM and OQLF list **sheepshead** and **white perch** among English terms, but these names overlap with other fish: TERMIUM explicitly notes that white perch can also refer to *Morone americana*, and the CFIA Fish List separately assigns **Sheepshead Porgy** to *Archosargus probatocephalus*. The list also has **Red Drum / Tambour rouge** for *Sciaenops ocellatus*. CFIA lists **Silver Bass** for this taxon, while TERMIUM records **fresh water drum** as a spelling variant; neither is needed as an alias. Keep these identities separate and add none of these variants as aliases.

The CFIA’s accepted English **Drum** label is strong evidence for the drum word surfaced by search. Still, do not store a bare drum alias: the qualified display is sufficient, and the picker already finds the whole-word term inside it. If another drum-named species is added later, the broad drum query should return every matching qualified row. The broad query **freshwater** also returns this row because it is a word in the display. That is a partial browse result, not a generic freshwater identity or alias; the visible result remains labeled **freshwater drum / malachigan**.

## Ownership audit and live snapshot

Ownership was checked against exact normalized phrases, candidate IDs, and complete record text in the active reference file, forms file, legacy-import identities, and research ledger. Normalization follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold common ligatures, remove combining marks, turn punctuation into spaces, and collapse whitespace. Archive searches covered proposal and batch Markdown as well as the open plan.

| Key or ID | Exact active reference, form, legacy, or ledger owner |
|---|---|
| **freshwater drum**, **fresh water drum**, **malachigan**, *Aplodinotus grunniens* | None |
| **drum**, **sheepshead**, **sheephead**, **white perch**, **silver bass**, **malachigan d’eau douce**, **tambour** | None as an exact normalized catalog name, alias, form term, legacy name, or ledger identity |
| **ingredient-ref-freshwater-drum**, **ingredient-form-freshwater-drum**, **candidate-freshwater-drum** | None of these IDs is allocated |
| Source ID prefix **WP04-SECTIONP-FRESHWATER-DRUM-20261012** | No collision in the ledger or existing proposal/batch Markdown |

The ledger has one unrelated raw substring occurrence of “drum” inside **Coriandrum sativum**. It is not an exact normalized term or an ingredient owner.

Snapshot read from the live worktree on 2026-10-12. Hashes cover exact file bytes. The corpus digest hashes each manifest-listed relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,287 references | 15879a535316a33ab879e76ae3aa92edb3bc9213063568f7bb8ebbb5add2ba0b |
| ingredient-forms.v1.json | 97 forms | d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd |
| legacy-import-identities.v1.json | 64 candidates | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| research-ledger.v1.json | 1,594 records; 5,699 source entries; 4,730 distinct source IDs | a48e2010a9d8c3aed9de5cbbe50c899b8409a0c28d989e5814eae6ac553205d4 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

## Picker behavior

The live picker checks whole normalized word phrases first and only falls back to substring matching when there are no phrase results. Current query results are empty for the candidate’s names because no row exists yet. The unrelated query **perch** currently returns **yellow perch / perchaude** and **Nile perch / perche du Nil**.

The following is a projection of the live search rules after adding only the proposed display pair, with no aliases:

| Query | Current picker | Projected picker | Explanation |
|---|---|---|---|
| freshwater drum | No result | Freshwater drum / malachigan | Exact display phrase |
| malachigan | No result | Freshwater drum / malachigan | Exact French display |
| drum | No result | Freshwater drum / malachigan | Whole word in the qualified English display; no bare alias |
| freshwater | No result | Freshwater drum / malachigan | Whole word in the display; not an alias |
| fresh water drum | No result | No result | No spelling-variant alias proposed |
| white perch, sheepshead, silver bass | No result | No result | Overlapping source synonyms are deliberately omitted |
| red drum | No result | No result | Different species and not a substring of the qualified display |
| perch | Yellow perch and Nile perch | Yellow perch and Nile perch | No white-perch alias is added |

This does create a single-result drum query, like the broad-query shape noted in earlier Section P holds. There is a bounded exception here: the CFIA Fish List assigns standalone **Drum / Malachigan** to *A. grunniens* as an acceptable Canadian fish-label name, while it lists *S. ocellatus* under the distinct qualified label **Red Drum / Tambour rouge**. OQLF likewise lists “drum” as an English term for the edible fish while preferring the species-specific Québec French **malachigan**. Therefore the lone drum result is supported as the official Canadian common-name lookup for this species, not inferred from a broad fish-family alias. The display remains qualified in the result. The query still has a scope limit: a user intending a different drum species will currently see only this row until that separate identity is added.

This differs from the held boundaries:

- **Nile tilapia:** bare **tilapia** is a multi-species group term, and the species-only row would resolve a generic query to one taxon.
- **Cunner:** OQLF does not retain bare **tanche** for fish-product naming, and the reviewed Québec guide reports no local commercial fishing or commercialization.
- **Gilthead bream:** bare **bream** and **dorade** cover broader or overlapping fish-market names, so one species row would overclaim those queries.
- **Freshwater drum:** the bare English label **Drum** is itself assigned to this taxon by CFIA; French **Malachigan** is the normalized edible-fish term. No overlapping synonym is added.

## Full bundled recipe demand

I scanned all 114 manifest-listed recipe JSON files, every ingredient row, and all strings in the full recipe objects. The normalized whole-phrase scan included **freshwater drum**, **fresh water drum**, **malachigan**, **malachigan d’eau douce**, **tambour**, *Aplodinotus grunniens*, **drum**, **sheepshead**, **sheephead**, **white perch**, **silver bass**, **red drum**, and **tambour rouge**.

**Result: zero matching recipe files, zero ingredient-row matches, and zero matching recipe-text fields.** No bundled recipe requests this species or any of its reviewed synonyms; no recipe link or relink is supported.

Nearby seafood lines are different identities or generic wording:

| Recipe row | Request | Boundary |
|---|---|---|
| **019#8** | Jumbo-lump crab meat | Crab product, not finfish |
| **023#1** | Sliced calamari | Squid/calamari, not finfish |
| **077#10** | Skinless salmon fillets, cut into cubes | Salmon; no drum identity |
| **093#4** | “Cooked meat or seafood, to taste” | Unspecified choice; no fish-species assignment |
| **093#6**, **095#5** | Fish sauce | Condiment, not fish flesh |
| **111#1** | Tuna steak | Tuna; no drum identity |

## Measurement, product-state, and substitution limits

| Source observation | What it supports | What it does not support |
|---|---|---|
| Manitoba’s 2017 processor assessment lists **Drum (*Aplodinotus grunniens*)** among offered fish and says the processor’s fish products are sold whole or headless, fresh or frozen. | Historical Canadian food-product identity and product wording. | A current 2026 SKU, Québec retail availability, a standard package size, fillet yield, or a recipe measure. |
| Ontario’s species profile gives a **45–50 cm** fish length. | Biological body-size context for the species. | Edible weight, serving mass, count-to-weight conversion, or unit mapping. |
| Ontario’s fish-eating guide includes freshwater drum among location-specific sport-caught fish advice. | The species is addressed as an edible fish in a Canadian public-health guide. | A universal portion, recipe quantity, or product specification; advice varies by location and population. |
| Reviewed terminology and product sources contain no supported replacement quantity or culinary interchangeability statement. | No measure or substitution is justified by this evidence set. | A global or contextual substitute for another fish. |

The 2017 product note is not current Québec market evidence; OQLF’s “commercial potential in Québec” is not proof of present supply. The sources do establish the food identity and Canadian product context, sufficient for a species-only catalog row. Keep **defaultDensity** null and **unitMappings** empty. Add no active measure, form, package relationship, serving/edible-yield observation, conversion, recipe link, or substitution rule. Keep roe, preserved fish, fish powder, fish balls, and surimi as separate product boundaries.

## Integrated catalog delta

Added one **PROTEIN** reference: ID **ingredient-ref-freshwater-drum**; English name **freshwater drum**; French name **malachigan**; both alias arrays empty; **defaultDensity** null; **unitMappings** empty. The accepted ledger record under that ID has verified identity, researched-no-supported-value measurement status, researched-no-supported-substitute status, and the seven source records below. No legacy candidate, form, recipe link, recipe edit, active measure, conversion, yield, package data, or substitution was added.

After integration, the catalog contains 1,288 references, 97 forms, 64 legacy candidates, 1,595 ledger records, 5,706 source entries, and 4,737 distinct source IDs. The [integration batch README](../batches/wp04-section-p-freshwater-drum-malachigan-identity-integration-20261012/README.md) records the static validation and post-integration hashes.

## Source register

All sources were accessed or rechecked on 2026-10-12. These source IDs are proposal-local and were not written to the research ledger.

| Source ID | Primary source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S01** | OQLF GDT, [malachigan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198998/malachigan) | Edible-fish and ichthyology entry; preferred Québec term **malachigan**; English **freshwater drum**; Latin *Aplodinotus grunniens*; says the species has commercial potential in Québec. Last updated 2011. The “potential” note is not current-market proof; the page explicitly says **malachigan d’eau douce** and **tambour** were not retained for fish-product terminology. |
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S02** | Government of Canada Translation Bureau, [TERMIUM Plus: SHEEPHEAD](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=SHEEPHEAD) | Record dated 2023-01-04 links *A. grunniens* with **freshwater drum** and standardized French **malachigan**. It lists **sheepshead**, **white perch**, and **fresh water drum** as variants, but explicitly notes **white perch** also names *Morone americana*; no variants are proposed as aliases. |
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S03** | CFIA, [Fish List query for Drum](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Drum) | Lists *A. grunniens* under **Drum / Malachigan**, **Silver Bass**, and **Freshwater Drum**; nearby results assign **Red Drum / Tambour rouge** to *Sciaenops ocellatus* and **Sheepshead Porgy** to *Archosargus probatocephalus*. This is a Canadian fish-label name source, not a recipe or availability source. |
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S04** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the Fish List provides English/French common names acceptable for Canadian fish labelling and their scientific names. The overview describes regulatory naming scope; it does not establish retail stock. |
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S05** | Government of Manitoba, [Canadian Fish Guys packaging facility environmental assessment](https://www.gov.mb.ca/sd/eal/registries/5961fishguys/eap.pdf) | The assessment describes the processor’s 2017 operations, names Drum (*A. grunniens*) among offered fish, and says products were sold whole/headless, fresh/frozen. It is historical processor evidence only; no current SKU, pack mass, Québec product, or culinary measure. |
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S06** | Government of Ontario, [Guide to Eating Ontario Fish](https://www.ontario.ca/page/guide-eating-ontario-fish) | Current online guide lists freshwater drum in advice for sport-caught fish by location. It supports food use, not commercial availability or a universal recipe portion. |
| **WP04-SECTIONP-FRESHWATER-DRUM-20261012-S07** | Government of Ontario, [Freshwater Drum species profile](https://www.ontario.ca/page/freshwater-drum) | Identifies *A. grunniens* and gives 45–50 cm length context. Biological body length only; not edible yield or a kitchen measure. |

No app tests or emulator checks were run because the catalog change only adds database JSON data under `AGENTS.md`.
