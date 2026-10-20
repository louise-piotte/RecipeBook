# WP02 A6 follow-up: proso millet atta alias review

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated on 2026-10-13. The single English alias was added to the existing proso-millet-flour reference. The ledger now records the bounded no-measurement result and two formula-specific blocked substitution findings. No form, recipe, or active numeric conversion was added.
- **Scope:** Decide whether the exact English product phrase `proso millet atta` belongs as an alias on the existing proso-millet-flour identity. This is one phrase review, not a new ingredient identity or a sweep of proso millet regional names.
- **Recommendation:** Integrate `proso millet atta` as one English alias on `ingredient-ref-proso-millet-flour`.
- **Proposal-local source IDs:** `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S01` through `S07`; checked absent from the current ledger and all other proposal/batch files, then rechecked after drafting.
- **A6 status:** Keep the broader regional grain-flour checklist open.

## Recommendation and exact ownership

Add only `proso millet atta` to `aliasesEn` on the existing **`ingredient-ref-proso-millet-flour`** row (`proso millet flour / farine de millet commun`). Keep its `FLOUR_AND_STARCH` category, displays, French aliases, forms, `defaultDensity: null`, and `unitMappings: []` unchanged. Do not add a proso-millet-flour identity or alter the separate proso-grain identity.

| Field | Current value | Proposed value |
|---|---|---|
| Reference ID | `ingredient-ref-proso-millet-flour` | unchanged |
| English display | `proso millet flour` | unchanged |
| French display | `farine de millet commun` | unchanged |
| English aliases | empty | `proso millet atta` |
| French aliases | empty | empty |
| Category | `FLOUR_AND_STARCH` | unchanged |
| Forms | none | none |
| `defaultDensity` / `unitMappings` | `null` / `[]` | unchanged |

A current Canadian grocer catalogue lists “S&V Proso Millet Flour 2L” under its flour category and identifies the retailer in Thornhill, Ontario [S07]. This supports Canadian product-category context for the existing flour identity, not the word “atta.” Exact alias support comes from the manufacturer's current product page, which titles the product “Proso Millet Flour (Chenna Atta)” and describes proso millet atta as finely milled proso millet [S02]. A Canada-localized Distacart listing gives the exact phrase “Organic Mandya Proso Millet Atta (Flour)” [S01], though its storefront snapshot is stale and does not support a current availability claim. Together these sources establish the qualified phrase as flour made from proso millet. The official IIMR page lists proso millet and regional names such as Cheena, Chena, Baragu, and Pani varagu [S03]; it supports the source-grain crosswalk, not flour names. The active row is already verified as the flour of *Panicum miliaceum*.

Add only the exact species-qualified phrase. Do not add bare `atta`, `proso atta`, `Cheena Atta`, `Chenna Atta`, `Pani Varagu Maavu`, `Panivaragu Mavu`, `Baragu Hittu`, `millet atta`, or a French construction. Regional grain-name evidence does not establish each regional expression as a Canadian flour label. The manufacturer spelling variants `Chenna Atta` and `Cheena Atta` remain source-specific; the Canadian storefront result independently supports `Proso Millet Atta`, the only alias proposed here. Keep generic `atta` and wheat atta distinct.

The English alias does not establish a new French term. Retain `farine de millet commun`, already supported by the target ledger's OQLF source and a Canadian French product description. OQLF's entry (last updated 2010, rechecked 2026-10-13) maps *Panicum miliaceum* to `millet commun` and English `proso millet`; it does not name flour or atta [existing ledger source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S04`]. Do not create `farine de millet atta` or another French alias.

## Evidence dimensions

### Identity and alias

This is an alias-only decision. The current Canadian grocer catalogue supplies local product-category context for proso millet flour, while the maker explains that proso millet atta is finely milled proso millet [S02, S07]. The manufacturer is not a Canadian source. The Canada-localized Distacart result supplies the exact qualified phrase but its accessible snapshot is stale and is not evidence of present stock or Canadian manufacture [S01]. IIMR's regional list corroborates names for the grain species only and is not being used to expand flour aliases [S03]. No source supports changing the already accepted identity, display pair, or category.

### Measurement and density

The current row has no active density or unit mappings. The product page's 500 g package declaration is package mass, not a cup, volume, flour density, or portion [S02]. A 2020 study reports 0.79 g/mL for intact proso millet grain bulk density. Its method uses 100 g of grains in a cylinder and tapping; this is not flour density. The same paper separately grinds grain into fine flour and reports water/oil absorption properties for flour, not a kitchen volume-to-mass measure [S04]. Do not transfer the grain value, the absorption results, or package mass to the flour row.

No reviewed source supplies a matching household volume, fill method, or product-specific cup-to-mass measure. If this research is accepted with the alias, update the ledger's `measurementState` to `researched_no_supported_value` with S02 and S04 as the bounded review evidence; add no measurement observation, density, unit mapping, estimate, or recipe-line mass. This state records the completed narrow search, not a claim that no useful value can ever be found.

### Substitution

Two studies show proso-millet flour in specific wheat-blend formulas, with different bread systems and conditions [S05–S06]. The 2023 Egyptian balady-bread study tested 10–25% proso-millet-flour replacement in a blend with 87.5%-extraction wheat flour and reported highest overall acceptability at 15% proso flour [S05]. A 2013 wheat/proso bread study optimized a 50:50 blend using emulsifiers and enzymes, and reported that higher millet addition required higher dough moisture [S06]. These are formula-specific trial outcomes. They do not support a general replacement ratio for arbitrary bread, chapati, roti, cake, cookie, pastry, or thickening use.

If integrated, update `substitutionResearchState` to `blocked_pending_evidence` and retain the two studies as separate formula-scoped findings with their formula, flour blend, and limits. Do not add an active global or contextual substitution, a form conversion, a recipe-line substitution, or a generalized percentage. No numeric recipe adjustment should be inferred from either abstract.

## Ownership, forms, and picker projection

Exact normalized ownership was checked across active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs. The repository normalization lowercases, folds accents and common ligatures, converts punctuation to spaces, and collapses whitespace.

| Exact key | Active reference owner | Form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| `proso millet atta` | none | none | none | none |
| `proso millet flour` | `ingredient-ref-proso-millet-flour` | none | none | none |
| `farine de millet commun` | `ingredient-ref-proso-millet-flour` | none | none | none |
| `proso millet` | `ingredient-ref-common-millet` as an exact alias; also phrase-matches the flour display | none | none | none |
| `atta` | `ingredient-ref-atta` as an exact display | none | none | none |
| `Cheena Atta`, `Chenna Atta`, `Pani Varagu Maavu`, `Panivaragu Mavu`, `Baragu Hittu` | none | none | none | none |

No form is attached to the flour target, and there is no exact legacy candidate for the proposed phrase. The ledger record for `ingredient-ref-proso-millet-flour` is verified; its measurement and substitution states are currently `not_yet_researched`.

The static projection follows `IngredientSearch.kt`: normalized complete-word phrase matching takes precedence over substring fallback. It was calculated from the current references and forms, then repeated with only the proposed alias added in memory.

| Query | Current result | With proposed alias |
|---|---|---|
| `proso millet atta` | none | `ingredient-ref-proso-millet-flour` only |
| `proso millet flour` | `ingredient-ref-proso-millet-flour` only | same |
| `proso millet` | `ingredient-ref-common-millet` and `ingredient-ref-proso-millet-flour` | same two |
| `proso` | `ingredient-ref-common-millet` and `ingredient-ref-proso-millet-flour` | same two |
| `atta` | seven references: amaranth, atta, barley, buckwheat, finger millet, kodo millet, and whole-kernel corn flour | those seven plus `ingredient-ref-proso-millet-flour` |
| `Cheena Atta` / `Chenna Atta` | none | none |
| `farine de millet commun` | `ingredient-ref-proso-millet-flour` only | same |

The exact proposed query has one flour result. The broad `atta` query gains the expected qualified flour choice; the generic `atta` identity remains separately available. No grain alias is warranted because `proso millet` already returns the grain and flour choices.

## Bundled recipe demand

The audit covered all 114 manifest-listed recipe files and all 1,123 ingredient rows, searching serialized recipe text and ingredient-row values for `proso millet atta`, `proso atta`, `proso millet flour`, `proso millet`, *Panicum miliaceum*, the regional flour phrases above, and `farine de millet commun`.

- Direct `ingredientRefId` links to `ingredient-ref-proso-millet-flour`: **0**.
- Recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Recipe links, recipe wording changes, and recipe-specific substitutions proposed: **none**.
- Manifest-ordered recipe-corpus fingerprint: `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

The alias recommendation rests on product naming, not bundled recipe demand.

## Proposed ledger delta if integrated

Keep `recordId: ingredient-ref-proso-millet-flour`, `recordType: ingredient_reference`, and `identityState: verified`. Append new sources S01–S07; reuse the existing OQLF source ID noted above without assigning it a new source ID. Add one accepted decision for the single English alias, citing S01–S03, S07, and the existing target identity evidence. Preserve the target displays, French aliases, category, forms, null density, and empty unit mappings.

- Set `measurementState: researched_no_supported_value`; add no numeric observation. S04's 0.79 g/mL belongs to intact grain and must not be copied to flour.
- Set `substitutionResearchState: blocked_pending_evidence`; add separate findings for the balady-bread and wheat/proso-bread formulas. Keep ratios and conditions within each study and make no active rule.
- Add no recipe links or recipe edits.

Proposed checked-unique finding IDs:

- `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-FINDING-BALADY-BREAD`
- `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-FINDING-WHEAT-PROSO-BREAD`

## Baseline snapshot

Read-only snapshot captured on 2026-10-13. Hashes cover exact file bytes.

| Surface | Baseline | SHA-256 |
|---|---|---|
| Active ingredient references | 1,337 references; target aliases empty, density null, mappings empty | `c7bdd65a833d345292f6a480867267a72321cdce4f631018afb4040b9644c8ae` |
| Ingredient forms | 98 forms; no target form | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 candidates; no exact proposed phrase | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,645 records; 6,206 source entries; 5,210 distinct source IDs; target verified with both research states not yet researched | `f57a7dc26346beda9f850bc5f42a0da0c4c4385d8035c11c7113a1ab9e0c44ec` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | fingerprint above |

At the initial check, S01–S06 were absent from all 5,210 ledger source IDs and every other proposal/batch file. S07 was added during the final source review. All seven source IDs and both proposed finding IDs were then rechecked against the ledger and archive and had no collisions. Recheck live ownership and source IDs at integration because the shared catalog may change after this review.

## Source register

Sources were checked on 2026-10-13. The S01–S07 identifiers are local to this proposal and were not added to the ledger.

| ID | Source and locator | What it supports and limits |
|---|---|---|
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S01` | Distacart, [Canada-locale millet-flour collection](https://www.distacart.com/en-ca/collections/millet-flour), listing title and displayed currency for “Organic Mandya Proso Millet Atta (Flour).” | Search-indexed Canada storefront result showed the exact qualified phrase and a CAD price. The search result was crawled about four months ago; the direct collection open served a snapshot marked 11 months old, and the product-specific route returned a cache miss. Use only as corroborating Canada-facing product-label evidence, not for current stock, availability, or Canadian manufacture. |
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S02` | Organic Mandya, [Proso Millet Flour (Chenna Atta), 500 g](https://organicmandya.com/products/proso-millet-flour-500-gm), title and description, especially product description and regional names. | Maker names proso millet flour/atta and describes the flour as finely milled proso millet. It lists regional variants including Cheena Atta and Pani Varagu Maavu; these are not added as aliases in this Canadian-focused review. The 500 g is package mass, not a household measure. Maker claims about nutrition, health, and suitability are not adopted. |
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | ICAR–Indian Institute of Millets Research, [Millets Information: common names in Indian languages](https://millets.res.in/millets_info.php), proso-millet entry. | Official regional agriculture research source lists *Panicum miliaceum* as proso millet and gives names including Cheena, Chena, Baragu, and Pani varagu. It attests grain names, not flour/atta names or Canadian product terminology. |
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S04` | Khatoniar and Das, [“Physical and Functional Properties of Some Millet Varieties of Assam”](https://www.ijcmas.com/9-5-2020/Sushmita%20Khatoniar%20and%20Pranati%20Das.pdf), *International Journal of Current Microbiology and Applied Sciences* 9(5) (2020), pp. 1508–1515; grain-density method/results pp. 1509–1511. | Reports proso grain bulk density 0.79 g/mL using 100 g grain in a graduated cylinder with tapping; flour density is not reported. Flour water/oil absorption tests are functional measurements, not household volume conversions. No value is transferred to the active flour row. |
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S05` | Omran, Mohamed, and Alfauomy, [“Proso Millet and Phalaris as Alternatives for Wheat Flour in Preparing Balady Bread”](https://ftrj.journals.ekb.eg/article_324132_feb4b7ce3479be6a2473850835ce300a.pdf), *Food Technology Research Journal* 2(3) (2023), pp. 1–14; publisher issue listing and study abstract. The publisher PDF fetch timed out during this review; the abstract is available through the [DOAJ record](https://doaj.org/article/1734b1e876ad4df691f995f0f14e5b5e). | Abstract reports testing 10–25% proso flour in balady bread made with 87.5%-extraction wheat flour, with the study's highest overall acceptability at 15% proso flour. This is one Egyptian flatbread system, not a general replacement rule. Publisher index and PDF masthead differ in issue wording (“2(3)” versus “special issue 2”); this bibliographic discrepancy is retained rather than normalized. |
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S06` | Schoenlechner et al., [“Optimisation of bread quality produced from wheat and proso millet (*Panicum miliaceum* L.)”](https://doi.org/10.1016/j.lwt.2012.10.020), *LWT—Food Science and Technology* 51(1) (2013), pp. 361–366; publisher abstract. | Publisher abstract describes optimization of a 50:50 wheat/proso blend with emulsifiers and enzymes and notes higher dough-moisture needs at higher millet addition. Full page access returned 403; use the indexed abstract only for its stated formula context. It does not support a general replacement or hydration rule. |
| `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S07` | Little India Grocers, [Atta and Flour catalogue](https://littleindiagrocers.ca/shop/flour-19949), `S&V PROSO MILLET FLOUR 2L` entry and retailer address in Thornhill, Ontario. | Direct page checked on 2026-10-13; browser's page snapshot was crawled last month. Supports a current Canadian retail product label for proso millet flour and local flour-category context. It does not use “atta,” confirm current stock, or independently establish the phrase as an alias. |

**Existing source reused, no new source ID:** OQLF, [millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S04` already on the target ledger record. Rechecked 2026-10-13; it identifies *Panicum miliaceum* and lists `proso millet` as an English equivalent, but does not define flour or atta.

## Verification evidence and limits

- Confirmed the requested proposal path did not exist before writing.
- Read the active A6 checklist, current roadmap entries, catalog workflow, the plan's Sections 03 and 06–09, and the previous A6 alias/identity/hold proposals and batches before choosing this unreviewed exact phrase.
- Checked current reference, form, legacy, and ledger ownership; the exact phrase had no owner. Reproduced current picker normalization and phrase-first behavior with target alias projected in memory only.
- Audited all 114 manifest-listed recipes and 1,123 ingredient rows; no candidate phrase or target reference link was found.
- Rechecked all seven proposal-local source IDs and both proposed finding IDs after drafting; none were found in the ledger or other proposal/batch files.
- No app tests or emulator checks were run. This is proposal-only documentation, and the project instructions exempt database-JSON-only work from testing; no app or database files were changed.
