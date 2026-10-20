# WP02 A/B residual flour and starch coverage review

- **Reviewed:** 2026-10-11
- **Status:** Evidence review. Selected recommendations were integrated in [`wp02-a-b-residual-flour-boundaries-integration-20261011`](../batches/wp02-a-b-residual-flour-boundaries-integration-20261011/README.md); broader A/B questions remain open.
- **Scope:** Remaining source-backed questions in WP02 Sections A and B around all-purpose flour bleaching and measurement, rye grades, and coconut flour product scope. Previously reviewed A/B holds are carried forward without being reopened.
- **Source-ID prefix:** `WP02-AB-RESIDUAL-COVERAGE-20261011-S01` through `S21`. A repository search found no prior use of this prefix.

## Recommendations

| Open item | Exact proposal | Integration/review status |
|---|---|---|
| Generic all-purpose flour alias | On `ingredient-ref-all-purpose-flour`, remove only the French alias `farine tout usage non blanchie`. Retain the ID, displays `all-purpose flour / farine tout usage`, English aliases `ap flour` and `plain flour`, and other French aliases. Do not add separate bleached or unbleached references or forms from the evidence reviewed here. | This reopens the ledger's earlier accepted alias decision, in line with the baking-flour batch's unresolved alias disposition. The product-family relation is real, but the alias maps a process-qualified phrase to an unqualified picker result. No recipe currently uses the phrase. |
| All-purpose flour measurement | Keep `defaultDensity: null` and `unitMappings: []`. Retain the Health Canada and King Arthur values only as source-specific observations if separately entered into the research ledger. No one generic cup weight or density is selected. | The values are real but use different flour products, cup volumes, and packing protocols. Existing measurement state remains unresolved pending a reviewed catalog protocol. |
| Light/white rye flour | Proposed identity-only candidate: ID `ingredient-ref-light-rye-flour`; category `FLOUR_AND_STARCH`; EN display `light rye flour`; provisional fr-CA display `farine de seigle claire`; candidate EN alias `white rye flour`; candidate FR alias `farine de seigle blanche`. Arva's French page title also uses `farine de seigle légère`; keep it as a documented wording variant, not an alias pending review. | **Independent Québec bilingual review is required before activating the French display or aliases.** The product class is supported, but the strongest French class source is a withdrawn federal standard and the current bilingual mill page is from Ontario. |
| Medium/dark rye flour | Keep the candidate grades unresolved. Do not add `medium rye flour`, `dark rye flour`, `farine de seigle moyenne`, or `farine de seigle foncée` to the generic rye row, to a new light/white candidate, or to forms. | Current suppliers distinguish these products but provide no shared thresholds; Québec wording does not establish a stable product class. |
| Broad coconut flour | Keep ledger record `ingredient-ref-coconut-flour` unresolved. Do not create or alias an undifferentiated `coconut flour / farine de noix de coco` row. | The broad market name covers products with materially different processes and fat content. |
| Defatted coconut flour | Proposed narrow identity-only candidate: ID `ingredient-ref-defatted-coconut-flour`; category `FLOUR_AND_STARCH`; EN display `defatted coconut flour`; provisional fr-CA display `farine de noix de coco dégraissée`; no aliases. Scope it to finely milled flour made from dried coconut meat defatted before milling. | **Independent Québec bilingual review is required before activating the French display.** The exact French compound is a transparent proposal based on bilingual process descriptions, not an exact Québec product title. |

For both new candidates, add no forms, density, unit mapping, measurement, conversion, yield, recipe link, or substitution. A whole-grain/extraction class is an identity distinction here, not a flour `IngredientForm`. No source supports using light rye flour as a generic substitute for whole rye flour or rye meal. No source supports a general coconut-flour substitution rule.

## Evidence and exact boundaries

### All-purpose flour: process qualifier and measurement limit

The OQLF's preferred Canadian name is `farine tout usage`; it lists `all-purpose flour`, `all purpose flour`, and `plain flour` in English and notes that flour naming differs by country. The current seed displays already follow that pairing. [S01]

Health Canada's Canadian Nutrient File gives separate bilingual records for bleached and unbleached all-purpose flour. Both are still classified as all-purpose flour; each record reports 100 ml = 52.8 g and 250 ml = 132.1 g. Ardent Mills likewise describes bleached and unbleached commercial products under its all-purpose flour family in both English and French. It explicitly calls `farine tout usage non blanchie` a process-qualified product. [S02–S05]

The seed's existing alias `farine tout usage non blanchie` silently narrows a generic all-purpose reference to one processing state. Remove that alias rather than encode bleaching as a global synonym or create a separate identity without recipe demand. Preserve all other existing names and aliases.

This recommendation differs from the existing accepted ledger decision, which retained the term as a search phrase because unbleached flour is one product within the all-purpose family. The new disposition follows the specific open alias question in [`baking-flours-starches.md`](../batches/baking-flours-starches.md): product-family membership does not make the qualified phrase a safe synonym when the catalog cannot preserve the process qualifier. The candidate remains a valid all-purpose product; it simply should not resolve through this generic alias.

There are source-specific household measures, but they do not settle an app-wide mapping. King Arthur's chart says one cup of all-purpose flour weighs 120 g, without stating a cup volume or fill technique in that row. Its measurement article recommends fluffing, spooning, and leveling and says a cup can hold around 120 g with that method but up to 160 g when compacted. [S06–S07] The app's `cup` is the U.S. cup (236.5882 ml) in [`units.v1.json`](../../../app/src/main/assets/seed/bundled-library/units.v1.json); NIST lists the same U.S. cup volume. Health Canada's 250 ml measure is not the app cup. [S08]

For scale comparison only, linearly scaling Health Canada's 250 ml entry to a U.S. cup yields about 125 g, while King Arthur reports 120 g for its cup. This calculation is not a proposed mapping. The CNF gives useful bleached/unbleached source observations, and King Arthur gives a source- and technique-specific observation, but neither establishes a universal packed or spoon-and-level mass for every all-purpose flour. Keep the active density and unit mappings unavailable. [S02–S03, S06–S08]

### Rye grades: one narrow class supported, broad grade taxonomy still open

Arva Flour Mill currently sells light rye flour and describes it as white rye flour made from the rye endosperm. Its French page title says `farine de seigle légère`; the body says `farine de seigle claire, aussi appelée farine de seigle blanche`. TERMIUM Plus lists `white rye flour` and `farine de seigle blanche` as correct and describes white rye flour as endosperm-only. [S09–S11]

A bilingual 1987 Canadian General Standards Board specification, converted to GCS 32.6-87 in 2014, lists the class `Light Rye Flour / Farine de seigle claire`. The Government of Canada catalogue marks the standard withdrawn in April 2020. Use it only as historical Canadian class/name evidence; do not reuse its former ash or moisture limits as current requirements. [S12–S13]

These sources support a narrow light/white rye product candidate. They do not establish universal extraction thresholds or prove that every product sold as light or white rye has the same composition. Ardent Mills currently describes white rye as refined to remove bran and germ, with medium and dark products containing more bran than white, but supplies no common thresholds. Its separate product page describes its `Rye Meal Pumpernickel` as whole rye flour. OQLF provides the general Québec term `farine de seigle` and notes that darker and lighter flours differ, but does not define named grades. A Mayrand Québec listing uses `farine de seigle foncée` for a 5 kg product without a processing definition. [S14–S16]

Accordingly, do not add medium or dark rows or aliases. Keep the active generic `ingredient-ref-rye-flour`, `ingredient-ref-whole-rye-flour`, and `ingredient-ref-rye-meal` boundaries intact. The active rye-meal row already owns `pumpernickel meal`, `pumpernickel flour`, and `farine à pumpernickel`; existing rye-meal and whole-rye proposals document supplier overlap. Do not move or broaden those aliases in this packet, and do not attach any pumpernickel wording to the light/white candidate. [S14; see also the prior rye-meal and whole-rye proposals linked below]

Suggested candidate fields, subject to the Québec review gate:

| Field | Candidate value | Evidence/limit |
|---|---|---|
| ID | `ingredient-ref-light-rye-flour` | Unoccupied in current references, forms, legacy candidates, and ledger. |
| Category | `FLOUR_AND_STARCH` | Rye flour product, not rye grain, flakes, or meal. |
| EN display | `light rye flour` | Arva product title and historical Canadian class. |
| FR display | `farine de seigle claire` | Historical bilingual Canadian class and current Arva French description; provisional pending independent Québec review. |
| EN alias | `white rye flour` | Paired with light rye flour by Arva; also supported by TERMIUM. |
| FR alias | `farine de seigle blanche` | TERMIUM and Arva wording; provisional pending independent Québec review. |
| Alternate source wording | `farine de seigle légère` | Arva's French product-page title; retain as evidence, not an active alias until review. |
| Other fields | No aliases beyond those above; null density; empty mappings; no forms or substitutions | No transferable measurements, conversions, yields, or tested replacement ratios found. |

The new proposal does not reserve or assign medium/dark French displays. It does not change existing rye references or their current aliases.

### Coconut flour: isolate the process-qualified candidate

The broad market wording is not product-specific enough for one catalog identity. Svansø describes its `coconut flour` as dried and grated coconut and reports 65 g fat per 100 g. Yupik sells an English/French product titled `Organic Coconut Flour / Farine de noix de coco biologique`, but its bilingual description says the meat is defatted, dried, and finely ground. A Québec manufacturer, Cuisine Soleil, calls its product `Farine de noix-de-coco` and says it is made from fibre remaining after pressing the coconut to extract oil. [S17–S20]

These sources support a defatted product class while showing why the broad name should stay unresolved. The Yupik French page does not title the item `farine de noix de coco dégraissée`, and Cuisine Soleil uses an unqualified display. Therefore the proposed French display needs review before activation. Keep both generic `coconut flour` and `farine de noix de coco` off the narrow candidate's alias lists; they can still refer to products without a demonstrated defatting step. Farm Boy also markets a finely milled product as `Organic Coconut Flour` and reports 1 g fat per 15 g, but does not state its process; low fat content alone does not establish a standardized defatted class. [S18–S21]

Yupik reports 2 tbsp = 15 g for its product and suggests replacing one cup of white/grain flour with 1/4–1/3 cup of its coconut flour. These are brand-specific package/usage observations, not a generic coconut density or a safe one-size-fits-all substitution. The different source descriptions and absence of a common product specification leave reusable measurements and substitutions unavailable. [S17–S18]

Suggested candidate fields, subject to the Québec review gate:

| Field | Candidate value | Evidence/limit |
|---|---|---|
| ID | `ingredient-ref-defatted-coconut-flour` | Unoccupied in current references, forms, legacy candidates, and ledger. |
| Category | `FLOUR_AND_STARCH` | Coconut meat/fibre milled into flour. |
| EN display | `defatted coconut flour` | The English product description explicitly identifies dried, defatted coconut meat. |
| FR display | `farine de noix de coco dégraissée` | Proposed transparent term; not an exact reviewed Québec product title. Provisional pending independent Québec review. |
| Aliases | None | Do not map broad `coconut flour`, `farine de noix de coco`, or `farine de noix-de-coco` to this process-specific candidate. |
| Other fields | Null density; empty mappings; no forms or substitutions | Yupik's 2 tbsp/15 g and replacement ratio remain product-specific only. |

## Current snapshot, collisions, and recipe demand

Read-only pre-integration snapshot from the shared worktree on 2026-10-11. The repository was changing concurrently, so these counts and digests describe the files examined for this review.

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,078 (114 in `FLOUR_AND_STARCH`) | `e4c0e3cff89aac84631dd845d6c64a234c059f7b3f07e7f2df9a97a158cdfe20` |
| Active ingredient forms | 78; none linked to a `FLOUR_AND_STARCH` reference | `e80adb0f8d0f7a83c4726f4e60995d924bbd7c4c2324367ac43f69aa5fdf037d` |
| Research-ledger records | 1,376 | `cfd1e9f57e79fd24aa738f0c049dce6592108a56825ab51dd4bbab559835facf` |
| Legacy import candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes and ingredient rows | 114 / 1,123 | `3de065870e867a34d559515bd47714520a91fef32306678ede7c9993d0035139` |

The recipe fingerprint above is SHA-256 over manifest-order relative recipe paths, a NUL byte, then each exact recipe-file byte sequence. It describes the corpus scanned below.

**Exact collision audit:** no exact normalized English or French candidate label for light/white rye flour or defatted coconut flour is owned by an active reference, form, or legacy candidate. The proposed candidate IDs are also absent from those surfaces and the current ledger. The generic rye, whole-rye, and rye-meal references remain separate; their current names and aliases are listed above. The existing AP reference is the exact owner of `farine tout usage non blanchie`, the alias this packet recommends removing. The broad coconut-flour decision exists in the ledger as `ingredient-ref-coconut-flour` (`needs_clarification`), not as an active reference. No flour/starch `IngredientForm` is active.

**Recipe demand:** all 114 manifest-listed recipe files and all 1,123 ingredient rows were searched. For each phrase below, the scan compared a case-, diacritic-, and punctuation-folded phrase against `ingredientName`/`originalText` and the complete serialized recipe JSON. The new light/white rye and defatted-coconut candidate phrases, the generic coconut flour phrases, the AP bleaching qualifier, and the previously open candidate phrases produced zero hits. Generic `all-purpose flour` remains direct demand: 50 ingredient rows in 47 full recipe JSON files.

The A/B residual phrase families scanned were `light rye flour`, `white rye flour`, `medium rye flour`, `dark rye flour`, `farine de seigle claire`, `farine de seigle blanche`, `farine de seigle légère`, `farine de seigle moyenne`, `farine de seigle foncée`, `farine de seigle pâle`; `coconut flour`, `farine de noix de coco`, `farine de noix-de-coco`, `defatted coconut flour`, `farine de noix de coco dégraissée`, `farine de coco dégraissée`; `barley meal`, `gruau d’orge`, `dry oat meal`, `oat meal`, `oatmeal`, `gruau sec`, `toasted rye flour`, `farine de seigle toastée`, `farine de seigle malté toasté`, `roasted mong flour`, `roasted white rice flour`, `pregelatinized oat flour`, `roasted oat flour`, `mung bean flour`, `farine de haricot mungo`, `water chestnut flour`, `farine de châtaigne d'eau`, `taro corm starch`, `fécule de taro`, `yam starch`, `fécule d’igname`, `bracken starch`, `warabi-ko`, `malanga corm flour`, `farine de malanga`, `xanthosoma corm starch`, `gluten-free all-purpose flour blend`, `fufu flour`, `amala flour`, `abacha`, `agbelima`, `banku mix`, `native starch`, `pregelatinized starch`, and `wheat meal`. The AP-specific scan included `farine tout usage non blanchie`, `farine tout usage blanchie`, `all-purpose flour`, `all purpose flour`, `plain flour`, `ap flour`, `bleached all-purpose flour`, and `unbleached all-purpose flour`; of these, only generic `all-purpose flour` matched recipe demand.

The current linked flour/starch demand is 69 rows across six references:

| Active reference | Linked rows | Recipe quantity units observed |
|---|---:|---|
| `ingredient-ref-all-purpose-flour` | 50 across 47 recipes | 30 g, 7 tbsp, 13 cup |
| `ingredient-ref-cornstarch` | 9 | 6 tbsp, 2 g, 1 tsp |
| `ingredient-ref-cake-flour` | 4 | 4 g |
| `ingredient-ref-bread-flour` | 2 | 2 g |
| `ingredient-ref-almond-flour` | 2 | 2 g |
| `ingredient-ref-custard-powder` | 2 | 2 tbsp |
| **Total** | **69** | |

No candidate-specific recipe link or relink is justified. The AP rows establish that the existing flour is used in mass and volume quantities, but do not choose a universal density or cup method.

## Previously reviewed open A/B work carried forward

These are active boundaries or holds, not new research findings from this packet. The corresponding proposals remain the source of their decisions; this review does not supersede them or mark their broader plan headings complete.

| Current open boundary | Carry-forward decision | Prior proposal |
|---|---|---|
| Rye meal / pumpernickel overlap | Keep existing narrow rye-meal and pumpernickel aliases; do not merge them with the new light/white candidate or generic whole-rye flour. The whole-rye review previously held all light/white/medium/dark grades; this packet narrows that hold only for light/white based on the additional current Canadian product and historical bilingual class evidence. | [`wp02-rye-meal-identity-boundary-20261010.md`](wp02-rye-meal-identity-boundary-20261010.md), [`wp02-next-flour-gap-review-20261011-whole-rye-flour.md`](wp02-next-flour-gap-review-20261011-whole-rye-flour.md) |
| Barley meal | Keep unresolved; local French meal/product naming does not distinguish it safely from flour, cracked barley, groats, grits, or a cooked dish. | [`wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md`](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md) |
| Generic dry oat meal | Keep `oat meal`, `oatmeal`, and `dry oatmeal` unresolved; retain only the narrower Scottish oatmeal decision already integrated. | [`wp02-a7-dry-oat-meal-product-boundary-review-20261011.md`](wp02-a7-dry-oat-meal-product-boundary-review-20261011.md) |
| Untreated toasted rye flour | Keep unresolved; current Québec usage is specifically malted-and-toasted in a finished bun, while exact unqualified wording lacks a Québec product boundary. | [`wp02-a7-toasted-rye-flour-quebec-product-boundary-review-20261011.md`](wp02-a7-toasted-rye-flour-quebec-product-boundary-review-20261011.md) |
| Wheat meal and other A7 grain meals | Keep generic wheat meal unresolved; no new display or aliases from this packet. | [`wp02-a7-remaining-meals-review-20261010.md`](wp02-a7-remaining-meals-review-20261010.md) |
| Oat thermal grade / roasted Mong / historical roasted white rice flour | Keep held pending consistent process and product evidence. | [`wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md`](wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md) |
| Generic mung-bean flour | Keep held because Québec `haricot mungo` does not resolve the species scope found in sources. | [`wp02-b2-mung-bean-flour-quebec-review-20261011.md`](wp02-b2-mung-bean-flour-quebec-review-20261011.md) |
| Water-chestnut flour and other regional starches | Keep candidate-specific species/process holds and provisional Québec terms as recorded; no cross-aliases or reusable measures. | [`wp02-water-chestnut-independent-review-20261009.md`](wp02-water-chestnut-independent-review-20261009.md), [`wp02-b2-b3-next-open-flour-starch-review-20261011.md`](wp02-b2-b3-next-open-flour-starch-review-20261011.md), [`wp02-b2-b3-next-residual-20261010.md`](wp02-b2-b3-next-residual-20261010.md) |
| Coconut flour broad identity | Keep unresolved as above. This packet only recommends the separate defatted product class, pending French review. | [`wp02-coconut-flour-product-boundary-20261010.md`](wp02-coconut-flour-product-boundary-20261010.md) |

The larger A6/B1/B2/B3/B4 plan headings remain open for work beyond these bounded questions. Do not treat this packet as completion of regional flour coverage, root/fruit flour coverage, or starch terminology review.

## Validation and reviewer notes

- Read the project requirements, catalog workflow, active plan/roadmap, live seed references and forms, legacy candidates, research ledger, existing measurement packet, and the related A/B proposals and batch summaries before drafting.
- Recomputed the snapshot counts and corpus fingerprint from the live files; exact candidate-name and ID checks found no active/form/legacy collision for the two proposed candidates. The AP alias recommendation names its only current exact owner.
- Searched all manifest-listed recipe ingredient rows and complete recipe JSON files for the named candidate and carry-forward terms. No candidate row was found; current AP demand and its unit distribution are recorded above.
- Source IDs are proposal-local and unique within this packet. Values from CNF, King Arthur, Yupik, Farm Boy, and other products are not promoted to catalog mappings or general behavior.
- **Independent review required:** Québec French displays and aliases for light/white rye flour; proposed `farine de noix de coco dégraissée`. Neither reviewer has been recorded as completing this packet's review.
- The initial research packet was proposal-only. Accepted data changes and scoped checks are recorded in the integration README; no app tests were run under the JSON-only data rule.

## Proposal-local source register

All web sources were accessed or rechecked on 2026-10-11. Each source ID is unique to this packet and does not alter the shared research ledger.

| ID | Source and support | Limits |
|---|---|---|
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S01** | Office québécois de la langue française, [farine tout usage (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage). Supports the preferred Québec French term `farine tout usage`, listed English equivalents, and the warning that flour classifications differ by country. | Does not distinguish bleached from unbleached product names. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S02** | Health Canada, [Canadian Nutrient File: all-purpose bleached flour, food code 4501](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4501). Bilingual label identifies bleached all-purpose flour; reports 100 ml = 52.8 g and 250 ml = 132.1 g. | Source-specific food and volume portions; no filling/packing method or app-cup equivalence is given. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S03** | Health Canada, [Canadian Nutrient File: all-purpose unbleached flour, food code 6642](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6642). Bilingual label identifies unbleached all-purpose flour; reports the same 100 ml and 250 ml portions. | Same limits as S02; does not itself establish a generic all-purpose conversion. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S04** | Ardent Mills Canada, [All Purpose Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/all-purpose/). Lists unbleached and bleached products under its all-purpose flour family. | Commercial mill's product taxonomy; not an OQLF decision or recipe measure. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S05** | Ardent Mills Canada, [Tout usage](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/all-purpose/). Uses `farine non blanchie tout usage` for a named product and states the H&R all-purpose product is available bleached and unbleached. | Manufacturer's French product language; it does not support mapping the qualified phrase to a generic picker identity that loses process information. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S06** | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart). Gives one cup of all-purpose flour as 120 g. | The row does not state cup volume or flour-filling method; brand/test-kitchen measure. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S07** | Rossi Anastopoulo, King Arthur Baking, [How to measure flour the right way](https://www.kingarthurbaking.com/blog/2023/10/13/how-to-measure-flour), 2023-10-13. Recommends fluffing, spooning, and leveling; reports around 120 g with that method and up to 160 g when flour is compacted. | Technique-specific King Arthur guidance; the stated range demonstrates why a universal density should not be inferred. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S08** | National Institute of Standards and Technology, [NIST Guide to the SI, Appendix B.9](https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b9). Lists one U.S. cup as 236.5882 ml. | Unit definition only; it does not supply a flour mass. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S09** | Arva Flour Mill, [Light Rye Flour](https://arvaflourmills.com/products/light-rye-flour-1). Describes light rye as also known as white rye and made from rye endosperm. | Current Ontario mill product page; no standardized extraction threshold or Québec terminology decision. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S10** | Arva Flour Mill, [Farine de seigle légère](https://arvaflourmills.com/fr/products/light-rye-flour-1). French title uses `farine de seigle légère`; description uses `farine de seigle claire` and `farine de seigle blanche` for the endosperm product. | Ontario manufacturer's French page, not an independent Québec label or bilingual review. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S11** | Government of Canada, Translation Bureau, [TERMIUM Plus: white rye flour](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=90&i=&index=esb&lang=eng&sg_kp_wet=1906290&srchtxt=harina). Lists `white rye flour` and `farine de seigle blanche` as correct terms and describes endosperm-only flour. | Federal terminology record, not an OQLF ruling or Québec retail label. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S12** | Canadian General Standards Board, archived [Flours, Specialty / Farines spéciales, GCS 32.6-87 (PDF)](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-006-1987.pdf). Lists a bilingual light-rye-flour class, `Light Rye Flour / Farine de seigle claire`. | Historical document only; do not reuse its former product limits as current regulatory or commercial requirements. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S13** | Government of Canada Publications, [catalogue record for GCS 32.6-87](https://publications.gc.ca/site/eng/9.841363/publication.html). Records the standard's bilingual publication and withdrawal in April 2020. | Establishes withdrawal status, not present-day product naming rules. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S14** | Ardent Mills, [Rye, Pumpernickel Flour: White, Medium & Dark](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/). Distinguishes white, medium, and dark products by relative bran content; describes its pumpernickel meal as whole rye flour. | One commercial supplier taxonomy, without universal thresholds or Québec French names; the pumpernickel wording overlaps adjacent commercial usage. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S15** | OQLF, [farine de seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle). Supports the generic Québec display `farine de seigle` and notes lighter/darker rye flour differences. | Updated 1982; it does not define current light, medium, or dark product classes. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S16** | Mayrand, [Farine de seigle foncée](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-de-specialite/farine-de-seigle-foncee-13726). Current Québec retail listing for a 5 kg dark rye flour product. | Listing supports the local phrase, but not a product process, threshold, or equivalence to whole rye or rye meal. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S17** | Yupik, [Organic Coconut Flour](https://yupik.com/en/organic-coconut-flour-p31505). Describes flour made from dried, defatted coconut meat; gives product-specific 2 tbsp = 15 g and a replacement suggestion. | One branded product; its measure and replacement suggestion are not general. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S18** | Yupik, [Farine de noix de coco biologique](https://yupik.com/fr/organic-coconut-flour-p31505). The French product title is broad, while the description states that the coconut flesh is defatted, dried, and finely ground. | Does not use the proposed exact compound display `farine de noix de coco dégraissée`; not an independent Québec terminology ruling. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S19** | Cuisine Soleil, [Farine de noix-de-coco](https://cuisinesoleil.com/produit/farine-de-noix-de-coco/). Québec manufacturer uses this French product name and describes flour from coconut fibre remaining after oil pressing. | Product-specific process/name evidence; no standardized defatting threshold or generic measure. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S20** | Svansø, [Coconut flour](https://svansoe.dk/en/product/kokosmel/). Describes dried, grated coconut flour and reports 65 g fat per 100 g. | Danish product evidence showing one distinct use of the broad English name; not a Québec label. |
| **WP02-AB-RESIDUAL-COVERAGE-20261011-S21** | Farm Boy, [Organic Coconut Flour](https://www.farmboy.ca/products/farm-boy-organic-coconut-flour-1-kg/). Canadian product under the broad name; describes fine milling and reports 1 g fat per 15 g. | Does not identify whether or how the coconut was defatted; nutrition alone is not a process specification or reusable conversion. |
