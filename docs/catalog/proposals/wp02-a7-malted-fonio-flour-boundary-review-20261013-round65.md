# WP02 A7 — Malted Fonio Flour Boundary Review (Round 65)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only. No catalog JSON, research ledger, legacy identities, roadmap, plan, checklist, recipes, tests, or emulator state was changed.
- **Scope:** One previously unreviewed flour candidate: flour milled from malted white fonio (*Digitaria exilis*). This does not reopen generic fonio flour or the held roasted and precooked fonio-flour products.
- **Proposal-local source IDs:** `WP02-A7-MALTED-FONIO-FLOUR-20261013-R65-S01` through `S07`. These identify the citations below; they are not research-ledger records.

## Recommendation

Keep **malted fonio flour** as an unallocated research candidate. Primary food studies use this English phrase for laboratory-produced flour, but the reviewed sources do not establish a current standalone Canadian/Québec consumer product, a product-specific Québec French name, or an industry-stable specification. Do not add an active reference, alias, legacy identity, form, measure, recipe link, conversion, yield, density default, or substitution.

The research supports a real food-processing concept and is enough to document the boundary. It does not make the candidate interchangeable with `fonio flour`, generic `malt flour`, roasted fonio flour, or precooked fonio flour.

## Naming and product boundary

| Language | Evidence-backed wording | Decision |
| --- | --- | --- |
| English | **malted fonio flour** | Used for laboratory flour samples in primary food studies [S01–S02]. This is research terminology, not a verified retail product name. |
| Québec French | **No exact product name established.** OQLF lists *fonio* for the cereal; a Québec seller uses *farine de fonio* in the product title *Farine de Fonio Précuit* [S04–S05]. | `farine de fonio malté` is a transparent descriptive construction only. No Québec label or OQLF entry reviewed here attests that compound for this product, so do not use it as a canonical display or alias yet. |

OQLF's `farine maltée` means flour with malt extract or ground malt added to it [S06]. That differs from flour milled from malted fonio grain. Keep `farine maltée` on the existing generic malt-flour identity and do not assign it to this candidate.

The 2022 *acha* study describes washing, steeping, germinating, drying, dehulling, milling, and sieving *Digitaria exilis* into a malted flour [S01]. Its experiment then blends the flour with soybean flour. The 2025 study labels one experimental sample `Malted Fonio flour (MFF)` and separately tests a sample with 30% date-fruit powder [S02]. These are experimental food formulations, not a retail specification. Keep the date-fortified blend a compound formulation, not an alias or identity for malted fonio flour.

## Archive, ownership, and picker checks

The focused A7 proposal and batch archive has no earlier review of `malted fonio flour` or its French construction. The broader A7 meal/malt/toasted packet does not decide this fonio candidate. Prior fonio work is adjacent: A6 and the fonio-flour boundary review cover generic flour and hold the source-named roasted and precooked products pending process evidence; they do not review malting. The roadmap records the gluten-flour equivalence review as a separate A7 step, and the parent A7 catalog-plan item remains open.

The current reference catalog has the following neighboring owners:

- `ingredient-ref-fonio-flour` — `fonio flour / farine de fonio`, English alias `acha flour`.
- `ingredient-ref-black-fonio` — `black fonio / fonio noir`, English alias `iburu`.
- `ingredient-ref-white-fonio` — `white fonio / fonio blanc`, including the broad grain name `fonio`.
- `ingredient-ref-black-fonio-flour` — `black fonio flour / farine de fonio noir`, scoped to *Digitaria iburua*.
- `ingredient-ref-malt-flour` — `malt flour / farine maltée`, English alias `malted cereal flour`.
- Existing cereal-specific malted and roasted-malt flour references remain separate.

No current reference or form owns exact normalized `malted fonio flour` or `farine de fonio malté`. No fonio form, legacy-import candidate, or ledger record uses that candidate name; the ledger's `candidate-fonio-flakes` is a separate processed-cereal question. The live search normalizes accents and returns all rows with a complete contiguous word-phrase match before falling back to partial matching. At present `fonio flour` and `farine de fonio` each return both `ingredient-ref-fonio-flour` and `ingredient-ref-black-fonio-flour`, because the phrases occur in both qualified and unqualified names. `fonio` returns the two grain references and the two flour references. `malted fonio flour` and the proposed descriptive French phrase return no candidate. If later added with those names, the qualified English and French queries would each select the new candidate; `fonio flour` and `farine de fonio` would each return three flour choices, and `fonio` would also include the new flour alongside the existing four references. Do not assign `acha flour`, bare `acha`, or bare `fonio` as aliases: `acha flour` already resolves to generic fonio flour, while `acha` returns generic flour and white fonio. Keep any future French name qualified so base `farine de fonio` searches present the competing flour choices together.

Mako Foods' Québec listings name roasted and precooked fonio-flour products separately from generic fonio flour. Those product titles do not establish that malting is precooking, roasting, or the same process [S05]. No source reviewed here equates those products.

## Bundled recipe demand

The current package manifest lists **114 recipes** with **1,123 ingredient rows**. All manifest-listed recipe JSON and ingredient rows were searched for `malted fonio flour`, `malted fonio`, `fonio malt flour`, `fonio flour malted`, `farine de fonio malté`, `farine de fonio maltée`, `farine maltée de fonio`, and the accent-folded variants. There were **zero recipe-file hits and zero ingredient-row hits**. No recipe link, relink, or recipe-derived measurement is supported.

## Density, conversions, and substitutions

The 2022 study measures the **bulk density of blended complementary-food formulations**, not a standalone package of malted fonio flour. Its method defines density as tapped sample mass divided by the volume in a graduated cylinder. The table reports `0.65 ± 0.01` for malted, unfermented acha-soy blend and `0.73 ± 0.02` for malted, fermented acha-soy blend; the table heading inconsistently labels bulk density as a percentage while the method gives g/mL [S01]. Preserve those only as source-specific, method-bound observations if the study is later entered in the ledger. They are not a default density for malted fonio flour.

The 2024 study also evaluates bulk density across processing and storage and reports that it changes over time [S03]. Neither paper supplies a stable household-volume measure, a mass/volume conversion for the standalone flour, or a general cooking yield. A separate germination study shows large variety- and time-dependent density changes in germinated fonio flour, but it is not a malted retail product and cannot supply this candidate's density [S07].

The studies formulate porridges and composite foods; they do not establish a recipe-level replacement ratio for ordinary fonio flour, wheat flour, generic malt flour, or toasted/precooked fonio products. Add no unit mapping, form conversion, cooking yield, or directed/contextual substitution rule.

## Integration sketch

No integration is recommended now. If later product evidence establishes standalone culinary use and an independently reviewed Québec French label, add an identity-only `FLOUR_AND_STARCH` reference with English wording `malted fonio flour` and the exact source-backed French display. Keep it distinct from generic fonio flour, black fonio flour, roasted/precooked fonio products, and generic malt flour. Add only product-attested aliases. Do not carry over study density values, date/soy blend behavior, or experimental formulation ratios. Leave forms, default density, unit mappings, recipe links, yields, and substitutions empty unless later sources directly support them.

## Sources and limits

| ID | Source | What it supports and what it does not |
| --- | --- | --- |
| S01 | Eli, Z. W., Obochi, G. O., and Ahure, D., [Pasting, functional, microbial and sensory evaluation of complementary food blends produced from malted and fermented acha (*Digitaria exilis*) flour supplemented with soybeans flour (*Glycine max*)](https://www.foodsciencejournal.com/assets/archives/2022/vol7issue4/7-4-54-746.pdf), *International Journal of Food Science and Nutrition* 7(4), 23–31 (2022), especially pp. 24–27. | Primary study names and prepares malted acha flour, then measures a malted acha-soy blend. The 0.65 and 0.73 values are blended-formulation bulk-density observations, and the printed table unit conflicts with the method's g/mL definition. No consumer label, Québec name, or household measure. |
| S02 | Obayomi, O. V., Olaniran, A. F., and Owa, S. O., [Influence of malting and fermentation on the nutritional composition, thermal stability, structural and physicochemical properties of a gluten-free flour blend of *Digitaria exilis* (Fonio) and date fruits](https://doi.org/10.1016/j.afres.2024.100680), *Applied Food Research* 5(1), 100680 (2025). | Primary study identifies `Malted Fonio flour (MFF)` and a separate MFF-plus-30%-date-powder sample. It does not establish a standalone retail specification, Canadian/Québec availability, French label, or reusable recipe substitution. |
| S03 | Obayomi, O. V., Olaniran, A. F., and Owa, S. O., [Effects of bioprocessing on elemental composition, physicochemical, techno-functional, storage and sensorial properties of gluten-free flour from fonio and date fruit](https://doi.org/10.1016/j.fbio.2024.105143), *Food Bioscience* 62, 105143 (2024). | Primary study includes bulk-density testing and reports process/storage variation. It does not establish one stable consumer flour density or conversion. It is from the same research group as S02, not an independent commercial-product confirmation. |
| S04 | Office québécois de la langue française, [fonio blanc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc). | Supports Québec French `fonio` for the cereal *Digitaria exilis*. It does not name malted fonio flour. |
| S05 | Mako Foods Exotik, current Québec seller listings for [Farine de Fonio Précuit (700 g)](https://www.makofoods.ca/products/farine-de-fonio-precuit-700-g?variant=45458303549626) and [Farine de Fonio Torréfié (600 g)](https://www.makofoods.ca/products/farine-de-fonio-torrefie-600-g?variant=45458309415098). | Attests the local base phrase `farine de fonio` and separately named precooked and toasted products. Neither is a malted product label, and the listings do not explain process equivalence. |
| S06 | Office québécois de la langue française, [farine maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432785/farine-maltee). | Defines flour with added malt extract or ground malt. This is a neighboring ingredient identity, not the candidate flour made by milling malted fonio. |
| S07 | [Nutritional and physicochemical changes in two varieties of fonio (*Digitaria exilis* and *Digitaria iburua*) during germination](https://pmc.ncbi.nlm.nih.gov/articles/PMC10333611/), *Food Science & Nutrition* (2023), Table 4. | Primary study reports variety- and germination-time-dependent bulk-density values for laboratory germinated flours. Germinated flour is not a retail malted product; values are not transferred to this candidate. |

**Archive references checked:** [WP02 A7 grain-meal/malt/toasted boundary packet](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md), [fonio flour identity boundary review](wp02-fonio-flour-identity-boundary-review-20261011.md), [A6 regional grain-flour gaps](wp02-a6-regional-grain-flour-gaps-20261010.md), and the current [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). The latest A7 decisions remain unchanged.

## Root integration outcome

Accepted the hold on 2026-10-13. Malted fonio flour remains an unallocated research candidate; no catalog or research-ledger data changed. See the [integration record](../batches/wp02-a7-malted-fonio-flour-boundary-hold-integration-20261013/README.md). No tests were needed for this documentation-only decision.
