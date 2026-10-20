# WP03 Section F R110 — pot-barley Québec French display evidence recheck

## Review record

- **Reviewed:** 2026-10-14.
- **Status:** Documentation-only review integrated in the R110 batch. The plan, roadmap, batch README,
  and this proposal record the disposition; no reference, form, ledger, recipe, code, or generated file
  changed.
- **Scope:** Recheck the still-open Québec bilingual approval for the existing pot-barley display
  `orge en pot`. This is not a new ingredient identity or a change to the processing boundary.
- **Recommendation:** **Hold final Québec display approval. Retain `pot barley / orge en pot` as the
  current provisional display, with no French alias.** The phrase is currently used as a Canadian
  French product heading and is useful in the picker, but no Québec terminology authority or
  independent Québec-language reviewer has approved it. No safer source-backed replacement avoids
  the existing `orge mondé` collision.
- **Source-ID prefix:** `WP03-PB-QC-R110-20261014-S` (proposal-local only; no source records are
  proposed for the shared ledger).

This recheck adds a current source pass and the historical Translation Bureau evidence below to
the earlier pot-barley reviews. It does not claim to complete the pending human reviewer gate. The
R109 oat-groats display review concerns a different cereal identity and is not reopened here.

## Current identity and ownership

The active row is `ingredient-ref-pot-barley`, category `GRAIN_AND_CEREAL`, displayed as
`pot barley / orge en pot`. Its only alias is the English `Scotch barley`; French aliases are empty,
`defaultDensity` is null, `unitMappings` is empty, and no ingredient form is attached. The ledger
record is identity-verified; its measurement and substitution research states remain
`not_yet_researched`.

The adjacent active identities are `hulled barley / orge mondé` and `pearl barley / orge perlé`.
The English product boundary remains supported: federal food-purchasing specifications distinguish
Scotch/pot barley, which retains more bran than pearl barley, from hulled barley, for which only the
inedible outer husk is removed. This processing distinction does not itself settle a French product
name.

Read-only exact-key review of the current reference, forms, legacy-import identities, and ledger
confirmed:

| Phrase or ID | Exact owner / status |
|---|---|
| `ingredient-ref-pot-barley`, `pot barley`, `Scotch barley`, `orge en pot` | Existing `ingredient-ref-pot-barley` row. |
| `orge mondé` | Existing `ingredient-ref-hulled-barley` display, consistent with the OQLF entry. Do not assign it to pot barley. |
| `orge mondée` | No exact active term; TERMIUM groups this form with the same ambiguous terminology family. |
| `orge entière` | No exact active term; a current phrase search matches the separate `whole barley flour / farine d'orge entière` row. |
| R110 source-ID prefix | No prior source-record or proposal-prefix owner was found. |

The archive already contains the 2026-10-10 picker-name refresh, the 2026-10-11 French name
resolution, and two proposal-only Québec display reviews. Those records established the current
provisional label and its limitations. This review does not create another ID or alias and does not
supersede the pending request for actual independent Québec bilingual approval.

## Québec French evidence and identity boundary

OQLF's current GDT entry lists masculine **`orge mondé`** as the preferred term for **hulled
barley** and defines it as barley whose grains have been stripped of their outer envelope [S01].
TERMIUM's grain-growing record groups *pot barley*, *hulled barley*, and rare *Scotch barley* under
`orge mondé / orge mondée` [S02]. The federal 2018 French food specification uses `orge mondé` in
the Scotch/pot paragraph and `orge entière` in its hulled-barley paragraph [S04]. Its English
version distinguishes the three English processing descriptions [S03]. The official sources
therefore document inconsistent bilingual crosswalks; they do not establish that the English
products are interchangeable.

A historical Translation Bureau terminology bulletin also records **`pot barley — orge mondé`**
in a 1974 agricultural entry [S05]. This confirms that the federal pairing is longstanding, but the
bulletin is historical terminology evidence and does not displace the more specific OQLF entry or
resolve present Québec consumer naming.

Current Canadian French product pages continue to show both naming patterns:

- Healthy Planet's French Oak Manor page is headed **`Orge en pot`**, while the same page's
  ingredient line says **`Orge mondé`** [S06].
- OnlineOrganics titles its French product **`Orge mondé biologique`**, uses the image label
  “Organic Pot Barley,” and describes partial bran removal [S07]. This is seller wording, not a
  controlled terminology definition; its text also contains imprecise barley comparisons.
- FoodServiceDirect's French-Canada list displays **`Agrofusion Orge En Pot`** separately from
  **`Agrofusion Orge Perlé`** [S08]. This establishes a commercial product-title distinction, not a
  Québec standard or a process specification.
- Metro's current indexed pages for the same Canadian UPC `062356506537` call the English item
  **Pot Barley** and the French item **Orge mondé** [S09–S10]. This is a direct retailer example of
  the collision on one product number, not evidence that OQLF's hulled-barley definition has
  changed.

Targeted OQLF and TERMIUM checks did not surface an authoritative entry for `orge en pot` or a
French compound that cleanly names this partially polished product. `Orge en pot` remains a
source-attested Canadian market label, not an OQLF-preferred term. Its exact product wording is
more useful for the present picker than borrowing `orge mondé`, but this documentary assessment is
not a Québec linguist's or bilingual reviewer's sign-off.

Keep pot barley distinct from hulled barley, pearl barley, quick-cooking barley, barley grits,
barley flakes, and barley flour. Do not add `orge mondé(e)`, `orge entière`, or a constructed
process phrase such as `orge partiellement polie` as aliases. The last phrase may describe a process,
but the reviewed Québec product sources do not attest it as the food's name.

## Measurement and substitution evidence

The federal description says pot barley should be pre-soaked and compares its texture and cooking
time with pearl and hulled barley [S03]. It supplies no household volume, mass-per-volume value,
package-to-recipe conversion, or transferable cooking yield. Current retailer package sizes (907 g,
1 kg, and 10 kg listings) are package sizes, not recipe measures. OnlineOrganics makes a general
volume-expansion statement for cooked barley, but it does not establish a product-matched starting
measure, process, or reusable pot-barley yield; do not transfer it to catalog behavior [S07].

One non-authoritative recipe publisher says pearl barley can replace pot barley in its particular
salad if package directions are followed, noting that pot barley takes longer [S11]. This is
contextual editorial advice without a tested quantity ratio or controlled comparison. It does not
support a global or contextual substitution rule in the catalog. The active record remains without
measurement observations or substitution findings; keep density, unit mappings, forms, conversions,
yields, and substitutions absent.

## Picker and bundled-recipe effects

The static projection follows the current normalization and complete-word-phrase-first behavior in
[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).
It uses the current 1,449-reference and 105-form snapshot; it is not emulator or UI testing.

| Query | Current result | Boundary effect |
|---|---|---|
| `pot barley` / `Scotch barley` | `ingredient-ref-pot-barley` only | Existing English access remains exact and unambiguous. |
| `orge en pot` | `ingredient-ref-pot-barley` only | Current French display is an exact, single-row picker result. |
| `orge mondé` | `ingredient-ref-hulled-barley` only | Preserves OQLF's exact preferred display for hulled barley. Adding it to pot barley would make the phrase return both rows. |
| `orge entière` | `ingredient-ref-whole-barley-flour` only, through the phrase inside `farine d'orge entière` | Adding this phrase to pot barley would create a second result and would also conflict with the federal French specification's hulled-barley wording. |
| `barley` / `orge` | 17 references each | Both broad queries remain multi-result; this review proposes no aliases and changes no count. |

The bundled manifest has **114 recipe files and 1,123 structured ingredient rows**. A read-only
whole-file and ingredient-row scan for `pot barley`, `Scotch barley`, `orge en pot`, `orge mondé`,
`orge mondée`, `orge entière`, `hulled barley`, `pearl barley`, and `orge perlé` found **zero
matches**. There is no bundled recipe demand to resolve the display or activate measurement or
substitution behavior. No recipe link or quantity change is proposed.

## Source register

Sources were checked online on **2026-10-14**. IDs use the proposal-local prefix above and have not
been appended to `research-ledger.v1.json`.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-PB-QC-R110-20261014-S01` | Office québécois de la langue française, [orge mondé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde), updated 2004; accessed 2026-10-14. | Preferred Québec term, masculine form, definition, and English equivalent `hulled barley`. Direct terminology authority; it does not name pot barley. |
| `WP03-PB-QC-R110-20261014-S02` | Translation Bureau, [TERMIUM Plus: Scotch barley](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=SCOTCH+BARLEY), record dated 2021-10-14, modified 2026-08-06; accessed 2026-10-14. | Current federal terminology record groups pot, hulled, and rare Scotch barley under `orge mondé / orge mondée`. The grouping demonstrates a collision; it does not prove product equivalence. Search result content was available; a direct page open returned a cache-miss error. |
| `WP03-PB-QC-R110-20261014-S03` | Department of National Defence, [Food Quality Specifications: Grains (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), FQS 24-01, paras. 11–14, pp. 2–3, dated 2018-04-01; accessed 2026-10-14. | Separates pearl, Scotch/pot, and hulled barley; says pot/Scotch barley retains more bran than pearl and hulled barley has only the outer husk removed. Federal purchasing specification, not Québec terminology approval. |
| `WP03-PB-QC-R110-20261014-S04` | Ministère de la Défense nationale, [Spécifications de qualité des aliments : céréales (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), SQA 24-01, paras. 11–14, pp. 2–3, dated 2018-04-01; accessed 2026-10-14. | Uses `orge mondé` for the Scotch/pot paragraph and `orge entière` for hulled barley. This documents the translation conflict; it is a federal procurement translation, not a current Québec retail standard. |
| `WP03-PB-QC-R110-20261014-S05` | Translation Bureau, [Terminology Bulletin 160, French PDF](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-160-3-fra.pdf), historical agricultural entry “pot barley — orge mondé,” source example dated 1974-10-10, PDF p. 112; accessed 2026-10-14. | Official historical federal translation evidence for that pairing. It does not establish current Québec preference or reconcile the OQLF definition. |
| `WP03-PB-QC-R110-20261014-S06` | Healthy Planet Canada, [Oak Manor Barley Pot / Orge en pot](https://www.healthyplanetcanada.com/fr/oak-manor-barley-pot-organic-1kg.html), French listing SKU A0039206; accessed 2026-10-14. | Current indexed product text uses `Orge en pot` as heading, says grown/processed in Canada, and lists `Orge mondé` as ingredient wording. The direct open returned a cache miss; this is retailer copy, not a package-panel image or terminology authority. Do not infer current stock. |
| `WP03-PB-QC-R110-20261014-S07` | OnlineOrganics, [Orge mondé biologique](https://onlineorganics.ca/fr/products/orge-monde-biologique), French seller page; accessed 2026-10-14. | Directly accessible page titles the product `Orge mondé biologique`, pairs the image text with “Organic Pot Barley,” and describes partial polishing. Seller wording and process text are not a controlled terminology definition; product format is not a recipe measure. |
| `WP03-PB-QC-R110-20261014-S08` | FoodServiceDirect.ca, [French-Canada barley listings](https://www.foodservicedirect.ca/fr-CA/foods/rice-grains/barley/barley.html), Agrofusion listings; accessed 2026-10-14. | Search-indexed current list names `Agrofusion Orge En Pot` separately from `Agrofusion Orge Perlé`. Product titles only; the direct open returned a cache-miss error and the page is not a Québec terminology authority. |
| `WP03-PB-QC-R110-20261014-S09` | Metro, [Cedar Phoenicia Pot Barley, English](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/quinoa-specialty-grains/pot-barley/p/062356506537), product no. `062356506537`; accessed 2026-10-14. | Current indexed page names the 907 g product `Pot Barley`. Paired with S10 to identify the same UPC across English and French pages; retailer title, not a process specification. |
| `WP03-PB-QC-R110-20261014-S10` | Metro, [Cedar Phoenicia Orge mondé, French](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/orge-monde/p/062356506537), product no. `062356506537`; accessed 2026-10-14. | Current indexed Québec French page calls the same 907 g product `Orge mondé`, showing the exact cross-language collision. Retail naming is not an OQLF decision. |
| `WP03-PB-QC-R110-20261014-S11` | French Kiss Cook, [Salade d'orge méditerranéenne](https://frenchkisscook.com/fr/salade-dorge-mediterraneenne/), section “Substitutions”; accessed 2026-10-14. | Editorially says pearl barley or pot barley can be used in that salad with package instructions, because pot barley takes longer. Non-primary recipe advice without a tested exchange ratio or evidence for a reusable catalog rule. |

## Disposition requested

Keep the active identity and current data unchanged: `pot barley / orge en pot`, English alias
`Scotch barley`, no French aliases, no forms or numeric data, and no substitutions. **Hold final
Québec bilingual approval** until an independent Québec reviewer accepts or revises `orge en pot`,
or an authoritative Québec source provides a precise name for the partial-polishing product. Do not
replace it with `orge mondé(e)` or `orge entière`; both terms already have competing or distinct
owners in the present search experience. This proposal is not that human approval, and the Section F
checklist remains open.

## Read-only review checks

- Re-read `AGENTS.md`, the open Section F checklist, the grain/cereal packet, the current pot-barley
  identity row and ledger record, and the prior pot-barley proposals/batch archive.
- Counted the current snapshot directly: **1,449 references / 105 forms / 63 legacy candidates /
  1,789 ledger records / 114 manifest recipes / 1,123 ingredient rows**.
- Checked exact phrase ownership and the R110 source-ID prefix across active terms, forms, legacy
  identities, the ledger, and proposal archive. The existing pot-barley row is the only exact owner
  of the approved English/display phrases; no R110 prefix collision was found.
- Reproduced the picker projection from `IngredientSearch.kt`; it is a static projection, not live
  UI testing. Scanned all manifest-listed recipe files and ingredient rows; no terms or direct
  references were found.
- Reopened the OQLF entry and federal English/French specifications; checked current Canadian
  listings and TERMIUM's current indexed entry. Direct-access limits are stated per source.
- No tests, Gradle tasks, emulator work, or app deployment were run. This review changes no database
  JSON or runtime behavior; the documentation-only disposition is recorded in the R110 plan, roadmap,
  and batch README.
