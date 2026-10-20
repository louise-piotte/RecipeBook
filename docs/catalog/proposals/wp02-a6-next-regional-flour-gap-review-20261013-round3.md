# WP02 A6 regional flour gap review: Japanese `soba-ko` — 2026-10-13

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated. Added `soba-ko` to the existing buckwheat-flour aliases and recorded the accepted alias and fused-`sobako` hold in the ledger; see the [round-three integration note](../batches/wp02-wp03-wp04-round3-gap-review-integration-20261013/README.md). No form or numeric behavior was added.
- **Scope:** Review the Japanese buckwheat-flour term `soba-ko` / `sobako` for the existing plain buckwheat-flour identity. This is one bounded romanized-name review, not a new flour identity or a review of soba noodles, soba-grade milling classes, or buckwheat measurements.
- **Recommendation:** Integrate only the independently attested, hyphenated spelling `soba-ko` as an English search alias on `ingredient-ref-buckwheat-flour`. Hold the fused spelling `sobako` because it normalizes to the same key as the currently emerging, buckwheat-free `SOBAKO` product brand. Keep that brand/product distinct from buckwheat flour; do not create an ingredient row for an early-stage concept.
- **Proposal-local source IDs:** `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S01` through `S08`. They were checked against current ledger source IDs and all other proposal/batch records before drafting and rechecked after drafting with this file excluded.
- **A6 status:** The broader regional-flour checklist remains open.

## Recommendation and exact ownership

Add exactly `soba-ko` to `aliasesEn` on the existing **`ingredient-ref-buckwheat-flour`** row (`buckwheat flour / farine de sarrasin`). Keep the canonical display, `FLOUR_AND_STARCH` category, current `kuttu` aliases, and French alias list unchanged. Do not create a separate `soba-ko` ingredient or map the term to the existing soba-noodle row.

| Field | Current value | Proposed value |
|---|---|---|
| Reference ID | `ingredient-ref-buckwheat-flour` | unchanged |
| English display | `buckwheat flour` | unchanged |
| Québec French display | `farine de sarrasin` | unchanged |
| English aliases | `kuttu atta`, `kuttu ka atta`, `kuttu flour` | add `soba-ko` only |
| French aliases | empty | empty |
| Category | `FLOUR_AND_STARCH` | unchanged |
| Attached forms | none | none |
| `defaultDensity` / `unitMappings` | `null` / `[]` | unchanged |

The Japanese Food Composition Database uses `そば粉` for buckwheat flour; a current Hokkaido mill’s English product glossary explicitly pairs `SOBA-KO` with `BUCKWHEAT FLOUR`; the Edo Sobalier Association translates 蕎麦粉 as `sobako`; and Japan’s MAFF writes `soba-ko` and glosses it as buckwheat flour. These independent sources establish a common Japanese flour noun and an exact hyphenated romanization, rather than a manufacturer-specific flour identity [S01–S04]. The existing catalog identity already represents flour from buckwheat, so no new ingredient row is warranted.

### Hyphenated and fused spellings; brand boundary

`Soba-Ko` is independently printed as the buckwheat-flour label in the Hokkaido manufacturer’s product glossary and appears as `soba-ko (buckwheat flour)` in MAFF’s current regional-cuisine material [S02, S04]. Add that spelling only. The app normalizer lowercases and replaces punctuation with spaces, so `soba-ko` and `soba ko` normalize to `soba ko`.

The fused Japanese common noun `sobako` is also well supported in Japanese and older Canadian culinary material [S03, S05, S07]. However, the official `SOBAKO` site currently describes a new soba-style flour made with **0% buckwheat**, distinct in composition from buckwheat flour, and identifies the brand project as early-stage [S06]. The picker folds capitalization, so `sobako` and `SOBAKO` would share the exact normalized key. I therefore hold the fused `sobako` alias while adding the separately attested hyphenated key. The English Canadian retailer page for Gishi buckwheat flour is current and deliverable to Canada; it mentions `sobako` in the stone-mill description, but not as the product title or a Canadian common-name field [S05]. Soba Canada’s Toronto site calls `Sobako` flour and describes 500 g / 1 kg packs, but the site states it was last updated 2020; this supports historical Canadian usage only, not current stock or market prevalence [S07].

The SOBAKO page says the concept is still in early development; no current Canadian product listing for that buckwheat-free brand was found in this bounded review. This lowers present Canadian retail exposure but does not resolve the exact-key collision: the live official brand page is online, and normalization cannot use capitalization to distinguish it. Do not turn the brand into an alias for buckwheat flour or claim it is currently available. If a stable formulated SOBAKO ingredient later reaches market, review it as a compositionally separate identity and revisit the fused spelling.

Do not add `soba` as a buckwheat-flour alias: it is already the exact alias on the prepared soba-noodle row. Do not add `soba flour`, `soba noodle flour`, grade names, Japanese milling-process names, or a French alias from this review. The title and body of the French-language specialist page `FARINE DE SARRASIN (SOBA-KO)` corroborate the hyphenated wording, but do not establish a Québec French search term; keep the OQLF-aligned local display `farine de sarrasin` [S08, existing source `WP02-S31`].

## Evidence dimensions

### Identity and alias

This is an alias-only terminology decision for the verified flour made from buckwheat. MEXT’s food-composition record identifies `そば粉` as buckwheat flour of *Fagopyrum esculentum*; the record examined is specifically “middle layer” flour and is not used to define a catalog grade. The Hokkaido mill and soba association support the romanized common noun; MAFF also explicitly distinguishes noodles called Okinawa soba from flour called `soba-ko` [S01–S04]. The current Canadian JapaneseTaste page sells Gishi buckwheat flour and uses `Ishiusu-biki sobako` in its milling description; that wording corroborates the noun in a Canadian retail context but is not itself a product alias field [S05].

The sources support the existing ingredient identity, not a new “soba flour” product class or a prepared noodle. The official SOBAKO concept is compositionally separate because its own page says it contains no buckwheat; its early-stage status is why this review does not allocate a brand/product identity [S06]. Keep `sobako` unassigned and keep the `soba` noodle alias on `ingredient-ref-soba-noodles`.

### Measurement and density

The live buckwheat-flour row has `defaultDensity: null` and `unitMappings: []`; there are no attached forms. The MEXT record’s nutrient values are on an edible-portion mass basis, not a volume measure. Gishi’s 120 g net content and the Canadian retailer’s package listing are package mass, not a household portion, density, or flour conversion [S01, S05]. Soba Canada’s 500 g / 1 kg package wording is historical package information only [S07]. None of these sources establishes a matching cup/spoon volume, fill method, or mass-to-volume relation.

No measurement observation, numeric value, form, unit mapping, or measurement-state change is proposed. Retain the current ledger state `measurementState: not_yet_researched`. This alias review does not repeat or close the broader buckwheat measurement task; no numbers are transferred from soba noodles, flour composition tables, package weights, or another flour.

### Substitution

No reviewed source establishes a reusable substitute for plain buckwheat flour. The current Canadian retailer page says its particular Gishi flour can be used in recipes such as soba noodles, pancakes, and bread in place of “regular flour,” with water adjusted to the recipe [S05]. It supplies no source/replacement quantities, tested recipe formula, flour blend, context-specific performance measurements, or consistent meaning for “regular flour”; treat it as retailer guidance for that product, not a general substitution rule. MAFF’s description of flour, water, and binding ingredients in soba noodles is a recipe/process description, not a replacement relation [S04].

No substitution finding ID, recipe-line substitution, global/contextual rule, or numeric ratio is proposed. Retain the current `substitutionResearchState: not_yet_researched`; this alias-only pass does not complete the target’s broader substitution research. The brand’s buckwheat-free marketing claims are not used as an allergy-safety conclusion or as substitute evidence [S06].

## Ownership, forms, and picker projection

Exact ownership was checked across current reference IDs, names, and aliases; form IDs, labels, and match terms; legacy candidate IDs, names, and aliases; and ledger record IDs. Normalization follows `IngredientSearch.kt`: lowercase with `Locale.ROOT`, NFKD accent folding, punctuation to spaces, and whitespace collapse.

| Exact normalized key | Current internal owner | Proposed outcome |
|---|---|---|
| `soba ko` (`soba-ko`) | none | `ingredient-ref-buckwheat-flour` via EN alias |
| `sobako` (`SOBAKO`) | none in the catalog | hold; same fused key is used by the official buckwheat-free SOBAKO concept |
| `soba` | `ingredient-ref-soba-noodles` | keep on soba noodles only |
| `soba noodles` / `nouilles de sarrasin` | `ingredient-ref-soba-noodles` | unchanged |
| `buckwheat flour` / `farine de sarrasin` | `ingredient-ref-buckwheat-flour` | unchanged |
| Proposed new reference ID | none proposed | none |

No form or legacy candidate owns `soba-ko`, `soba ko`, or `sobako`; the exact phrases are also absent as ledger record IDs. The official SOBAKO brand is an external-name collision, not a current catalog owner. The `ingredient-ref-buckwheat-flour` ledger record remains `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`.

The following static projection was reproduced from the current reference and form rows using `IngredientReferenceSearchIndex`’s phrase-first matching rules. “Projected” means only the proposed `soba-ko` alias was added in memory; no catalog file was edited.

| Query | Current picker result | With `soba-ko` alias |
|---|---|---|
| `sobako` / `SOBAKO` | none | none; fused key remains held |
| `soba-ko` | none | `ingredient-ref-buckwheat-flour` only |
| `soba ko` | none | `ingredient-ref-buckwheat-flour` only |
| `soba` | `ingredient-ref-soba-noodles` | `ingredient-ref-buckwheat-flour` and `ingredient-ref-soba-noodles` |
| `soba noodles` | `ingredient-ref-soba-noodles` only | same |
| `buckwheat flour` | plain buckwheat flour and sprouted buckwheat flour | same |
| `farine de sarrasin` | plain buckwheat flour and sprouted buckwheat flour | same |

The broad `soba` result becomes two clearly named choices because the accepted alias contains the word `soba`; the qualified hyphenated query selects only buckwheat flour. Case-only `SOBAKO` remains unmatched, while the separate-word `soba ko` query selects flour. No ordering, ranking, recipe, or code change is proposed.

## Bundled recipe demand

The audit covered every path in the live seed manifest and every string field in the recipe files. It scanned all 114 manifest-listed files and all 1,123 entries in their `ingredients` arrays for normalized whole-phrase matches for `soba-ko`, `soba ko`, `sobako`, `soba`, `soba noodles`, `buckwheat flour`, and `farine de sarrasin`.

- Recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Direct `ingredientRefId` links to `ingredient-ref-buckwheat-flour`: **0**.
- Recipe wording changes, recipe links, and recipe-specific substitutions: **none**.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Manifest-ordered recipe corpus fingerprint: `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

The regional alias decision is supported by terminology and product naming, not current bundled-recipe demand.

## Proposed ledger delta

If integrated, update only the existing `ingredient-ref-buckwheat-flour` record:

1. Add source records S01–S08 below, without replacing the existing buckwheat/Kuttu sources.
2. Add one accepted decision for the exact English alias `soba-ko`, citing S01–S05 and S08; state that the canonical Québec display and all numeric fields remain unchanged.
3. Add one unresolved decision for the fused spelling `sobako`, citing S03–S07; explain the current exact-key collision with an emerging 0%-buckwheat product brand and retain no alias for that key.
4. Keep `defaultDensity: null`, `unitMappings: []`, no forms, no recipe links, and both broader research states unchanged.

No measurement observations or substitution findings are proposed. The ledger schema defines `findingId` only for substitution findings; since this alias packet proposes no such findings, **no finding IDs are allocated**. The collision audit found 5,229 distinct existing source IDs and 190 distinct substitution-finding IDs; all eight proposal-local source IDs below are absent from the current ledger and other proposal/batch records. The exact `soba-ko` key has no internal owner, and no proposed ingredient or finding ID collides. Recheck all live ownership and source IDs before any integration because the shared catalog is being updated in parallel.

## Baseline snapshot

Read-only snapshot captured on 2026-10-13 before drafting. File hashes cover exact bytes.

| Surface | Baseline | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,338 rows; target has 3 English aliases, no French aliases, no forms, null density and empty mappings | `2e7900418e95d420b0fe16f44d64e870f59c032e0134b187375d329698e3a88a` |
| Ingredient forms | 98 rows; zero attached to plain buckwheat flour | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,646 records; 6,225 source entries; 5,229 distinct source IDs; 190 distinct finding IDs; buckwheat-flour states verified / not yet researched / not yet researched | `43a6523376af96b26ab0bc7c7c23c56dc66b1c44f029cdb7fa49e169257c7436` |
| Generated Kotlin ingredient catalog | 1,338 references; 586,669 bytes | `3fe619271d9f59f865bd4955651b655f824b26b2f9652b98586f0e3cf4958596` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows | Fingerprint above |

## Source register

Sources were accessed or rechecked on 2026-10-13. IDs are proposal-local and were not added to the ledger.

| Source ID | Source and locator | Support and limits |
|---|---|---|
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S01` | Japan Ministry of Education, Culture, Sports, Science and Technology (MEXT), [Food Composition Database, food 01124](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01124_7), `穀類/そば/そば粉/中層粉`, English label “CEREALS/Buckwheat flour/middle layer.” | Official food record pairs `そば粉` with buckwheat flour and *Fagopyrum esculentum*. The record is for middle-layer flour; do not use it to assert a universal grade or numeric conversion. Nutrient data per mass is not density or a household measure. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S02` | Hokkaido Yamaka Buckwheat Flour Milling Inc., [English company and product page](https://www.yamaka-seifun.co.jp/english/index.html), product glossary image alt text at “PRODUCTS.” | Current primary mill page labels `そば粉, SOBA-KO, BUCKWHEAT FLOUR`; nearby text describes its buckwheat flour products. Image alt text is the exact evidence for the hyphenated romanization; the maker’s milling descriptions are not generalized to every product. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S03` | Edo Sobalier Association, [How to make SOBA](https://www.edosobalier-kyokai.jp/pdf/How_to_make_SOBA.pdf), p. 1, “FLOUR.” | Association glossary lists `sobako : buckwheat flour` and Japanese `蕎麦粉`. Supports the fused common noun; it does not override the alias hold arising from an external exact-key homonym. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S04` | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), [Okinawa Soba](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/5566/index.html), lines describing ingredients and the `soba-ko` term. | Government culinary page explicitly glosses `soba-ko` as buckwheat flour and distinguishes it from Okinawa soba noodles made with wheat flour. It supports the qualified ingredient word, not a noodle/flour equivalence. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S05` | JapaneseTaste Canada, [Gishi Buckwheat Flour, 120 g](https://japanesetaste.ca/products/gishi-buckwheat-flour-gluten-free-multipurpose-soba-noodle-flour-120g), current listing and description. | Current Canada-deliverable retailer listing names buckwheat flour, offers it for sale, and mentions “Ishiusu-biki sobako” in the milling description. It is Canadian product-context evidence; the exact word occurs in a mill/process phrase, not the product title. Net 120 g is package content, not a household measure. Retailer’s broad flour-replacement instructions are not a tested reusable substitution rule. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S06` | SOBAKO, [official English product concept page](https://sobako.com/index-en.html), “What is SOBAKO?” and development status. | Brand’s own current page says the soba-style flour contains 0% buckwheat and lists a multi-ingredient concept; it says the project is in an early development phase. It establishes a real homonym and composition boundary, not commercial availability in Canada, a finalized formulation, or an allergy-safety conclusion. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S07` | Soba Canada, [Soba and Our Policy](https://www.sobacanada.com/SCI2014-SanTatePolicyE.html), flour classes and retail section; current site footer reports last update 2020-03-06. | Toronto-based operator’s page uses `Sobako 蕎麦粉 (Flour)` and describes 500 g / 1 kg flour packages. Supports historical Canadian common-noun use; page age means it is not current availability evidence. |
| `WP02-A6-SOBA-KO-FLOUR-ALIAS-20261013-R3-S08` | Cuisine Japonaise, [Farine de sarrasin (Soba-ko)](https://cuisine-japonaise.com/aliments_farine-et-fecule/farine-de-sarrasin-soba-ko/), page title and description. | French-language specialist page explicitly pairs “farine de sarrasin” and `SOBA-KO` and describes its use for soba noodles and cakes. It corroborates the spelling variant; it is not a Québec terminology authority or measurement/substitution source. |

**Existing source reused without a new ID:** OQLF, [farine de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin), already recorded on the target as `WP02-S31`; it supports retaining the Québec French display and does not list `soba-ko`.

## Verification evidence and limits

- Re-read repository instructions, the active A6 checklist, the plan’s Sections 03 and 06–09, the current roadmap entries, and current A6 proposals/batches before selecting the phrase. The archive search found no earlier exact `soba-ko` / `sobako` review; this does not reopen completed Kuttu, sprouted-buckwheat, millet alias, identity, measurement, or substitution decisions.
- Verified MEXT, MAFF, mill, association, current Canadian retailer, official SOBAKO brand, and historical Toronto source pages directly. `soba-ko` is supported as a common Japanese buckwheat-flour noun by primary and association sources; the unhyphenated `sobako` is also a common noun, but held from catalog allocation because the fused key is used by the distinct emerging brand.
- Audited current reference/form/legacy/ledger ownership and statically projected exact picker queries from `IngredientSearch.kt`, including `sobako`, `soba-ko`, `soba`, and the existing plain/sprouted buckwheat queries.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; found no candidate wording and no direct buckwheat-flour recipe link.
- Checked all eight source IDs against the 5,229 ledger source IDs and other proposal/batch files; none collide. No measurement observations or substitution findings are proposed, so no finding IDs are allocated. The requested output path was free before writing; after drafting, source ID checks exclude this file itself.
- Integration updated only database JSON and the generated search index. Static package, ledger, alias-ownership, picker, recipe-corpus, encoding, and whitespace checks are recorded in the integration note. No app or emulator tests were run because this was a database-data change.
