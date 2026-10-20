# WP02 Section A — hard white spring wheat flour identity review (R227, 2026-10-16)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal-only; no shared catalog data changed. Root integration owner retains control of any catalog or ledger update.
- **Scope:** One source-qualified flour product under the open Section A checklist item, “Add the remaining functionally distinct regional wheat-flour identities.”
- **Prior-work boundary:** R153 added hard white spring wheat berries as a whole-kernel identity, not flour. R216, R219, R222, and R225 respectively added soft red winter, hard red winter, hard red spring, and soft white wheat flour identities; they remain separate. The white whole-wheat row owns the narrower alias `hard white whole wheat flour`. The 2026-10-10 white-whole-wheat review listed CWHWS, CPSW, CWSWS, and CEWW flour identities as outside its proposal scope, pending a Canadian mill product that named the source class and defined a marketed flour product. That was a deferred evidence condition, not an accepted or held identity decision. Rogers Foods now supplies a current Canadian mill product explicitly made from Canadian hard white spring wheat. No focused proposal, active reference, form, legacy candidate, or ledger identity for the full candidate phrase was found.
- **Proposed source-ID namespace:** `WP02-A-HWWSF-R227-20261016-S01` through `S02`. This prefix and the target proposal filename were unused in the active ledger and proposal/batch archive at review time. Existing Canadian Grain Commission and OQLF sources are reused by their registered IDs.

## Recommendation

**Add one identity-only reference: hard white spring wheat flour / farine de blé de force blanc de printemps**, category **`FLOUR_AND_STARCH`**.

Rogers Foods currently markets its White Peaks flour as milled from “Canadian Hard White Spring Wheat.” Its current commercial product page calls it an all-purpose flour, lists it under White Flours, and describes its use in Asian noodles, dumpling wrappers, and soft white bread and buns. This is direct Canadian manufacturer evidence for a flour product with a hard-white-spring source description. The Canadian Grain Commission (CGC) independently defines Canada Western Hard White Spring as a distinct milling class and describes flour production, bread, and noodle uses. The product page does not state a CGC class code, a wheat variety, or a production region beyond “Canadian,” so the catalog identity should preserve the seller’s source wording without assigning the product formally to CWHWS or any named variety.

The proposed French display is a transparent construction from the CGC’s official French class wording `blé de force blanc de printemps` and the OQLF’s preferred base term `farine de blé de force`. It is not an exact Québec product title or an OQLF entry for this full compound; keep independent Québec wording review open. A current Charlevoix mill specification uses `farine de blé blanc de printemps` for one component of a flour blended with red winter wheat. That phrase therefore does not establish a single-ingredient synonym and should not be added as an alias.

### Proposed reference fields

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-hard-white-spring-wheat-flour` |
| English display | **hard white spring wheat flour** |
| Québec French display | **farine de blé de force blanc de printemps** — provisional construction from official Canadian French class wording and the OQLF flour term |
| English aliases | None |
| French aliases | None |
| Category | `FLOUR_AND_STARCH` |
| Forms, default density, unit mappings, conversions, yields, recipe links, substitutions | None |

Do not add `hard white wheat flour`, `hard white flour`, `Canadian hard white spring wheat flour`, `Canada Western Hard White Spring flour`, `CWHWS flour`, `White Peaks`, `farine de blé blanc de printemps`, or the bare `farine de blé de force` as aliases. The source does not give an exact generic title for these variants, does not assign the product to the formal CWHWS class, and uses `all-purpose` as a product-grade description. The shorter French term `farine de blé de force` is already an alias on high-gluten flour and also begins the R222 hard-red-spring display; it should not collapse the source-specific white-spring identity into those results.

## Current ownership and prior decisions

The read-only snapshot contains **1,618 ingredient references, 122 forms, 61 legacy candidates, and 1,963 research-ledger records**.

| Existing identity or record | Boundary to preserve |
|---|---|
| `ingredient-ref-hard-white-spring-wheat-berries` | R153 whole-kernel food product. It is not flour; do not attach a flour alias or a milling form to it. |
| `ingredient-ref-white-whole-wheat-flour` | Its existing English alias is `hard white whole wheat flour`. That explicit whole-wheat phrase stays on this row; do not infer whole-grain status for the White Peaks product. |
| `ingredient-ref-all-purpose-flour` | Generic culinary grade. Rogers labels White Peaks all-purpose, but that product description is not a generic alias or source-class crosswalk. |
| `ingredient-ref-hard-red-spring-wheat-flour` and `ingredient-ref-high-gluten-flour` | R222 preserves hard-red source wording separately from the generic high-gluten grade. The white-spring source identity should likewise remain separate, and must not receive the existing broad French `farine de blé de force` alias. |
| `ingredient-ref-soft-white-wheat-flour` | R225's soft-white source identity is distinct by hardness and wheat colour. Do not assign the new candidate a soft-wheat use, extraction level, or seasonal class. |
| `ingredient-ref-whole-wheat-flour` and `ingredient-ref-whole-wheat-pastry-flour` | Existing whole-wheat identities are milling/process boundaries, not aliases for every white-wheat flour. |

Exact normalized ownership checks across active references, forms, legacy candidates, and the research ledger found no owner for `hard white spring wheat flour`, `hard white spring flour`, `farine de blé de force blanc de printemps`, `farine de blé blanc de printemps`, `ingredient-ref-hard-white-spring-wheat-flour`, or `candidate-hard-white-spring-wheat-flour`. The ledger has related hard-white-spring berry and CGC class research, but no exact flour identity record. No previous proposal or integration accepts or holds this exact flour candidate. The earlier white-whole-wheat proposal's mention of future CWHWS flour work does not make the product an existing candidate; its stated mill-product evidence condition is now met for the English identity.

The proposed R227 source IDs are also absent from the active source-ID set. The current archive includes the R153 hard-white-spring berry decision and the R216–R225 wheat-flour sequence; none makes an alias or form decision for hard white spring flour. The R153 sources for the CGC English and French class tables and the OQLF term can be reused as already-registered sources rather than added under new IDs.

## Canadian and Québec product and terminology evidence

Rogers Foods’ current **White Peaks** product page says the flour is milled from Canadian hard white spring wheat, labels the product all-purpose and unbleached/untreated, and recommends it for Asian noodles, dumpling wrappers, and soft white bread or buns. The page places it under White Flours and lists a 20 kg commercial bag [S01]. This supports the marketed flour/source identity. It does not name a variety, assign CWHWS or another formal CGC class, state that the grain is grown in a particular province, or establish a general grade, extraction level, or end-use rule for every hard-white-spring flour.

The CGC says Canadian wheat varieties are grouped into classes by functional characteristics and growing region. Its current English table lists Canada Western Hard White Spring (CWHWS) as a separate hard-white-spring milling class that produces flour, with bread and noodle uses; it separately lists Canada Prairie Spring White and Canada Western Soft White Spring [reused S02]. Its French class table gives the official class name `blé de force blanc de printemps de l’Ouest canadien` and distinguishes it from `blé blanc de printemps Canada Prairie` and `blé tendre blanc de printemps de l’Ouest canadien` [reused S03]. These are class and terminology sources, not proof that Rogers assigns White Peaks to a specific class or variety.

The OQLF GDT entry prefers `farine de blé de force` for flour made from hard wheat, rich in gluten and mainly used for bread. It supports this French base term but does not define a white-spring compound, and its broad phrase must not become an alias for the proposed source identity [reused S04].

For Québec market context, Moulin de Charlevoix’s current product listing names `Farine de blé blanc Tradition`, but does not state that it is hard or spring wheat [reused S06]. Its Mayrand-hosted BBCT20 technical sheet (version 2411FR) describes the product as flour made from white spring wheat **and** red autumn wheat, milled together in Québec [S05]. This is useful local French phrase evidence and a concrete blend boundary; it is not a product match for the single-source candidate. No current Québec product page for a single-ingredient flour explicitly marketed as hard white spring wheat flour was found.

## Picker and alias impact

The current picker normalizes accents and punctuation, prefers complete word phrases across all reference/form terms, then falls back to partial matches. A read-only projection using those current matching rules gives these results:

| Query | Current result | Expected after adding the proposed display with no aliases |
|---|---|---|
| `hard white spring wheat flour` | 0 | 1: proposed flour |
| `hard white spring` | 1: hard-white-spring wheat berries | 2: berries and flour |
| `hard white` | 2: hard-white-spring berries and white whole-wheat flour | 3: those two plus the proposed flour |
| `hard white whole wheat flour` | 1: white whole-wheat flour | unchanged; remains on the explicit whole-wheat row |
| `hard white wheat flour` | 0 | 0; do not add it as an alias |
| `farine de blé de force blanc de printemps` | 0 | 1: proposed flour |
| `blé de force blanc de printemps` | 1: hard-white-spring wheat berries | 2: berries and flour |
| `farine de blé de force` | 2: hard-red-spring flour and high-gluten flour | 3: those plus the proposed flour; broad query remains visibly ambiguous |
| `farine de blé blanc de printemps` | 0 | 0; do not add it as an alias |
| `all-purpose flour` | 1: generic all-purpose flour | unchanged; do not add a grade alias |

No existing exact-key collision prevents a distinct row. The candidate adds useful full English and French phrases while broad `hard white` and `blé de force blanc de printemps` searches visibly retain the grain/flour choice. Keep aliases empty to avoid changing picker ownership for the generic whole-wheat, all-purpose, or high-gluten queries.

## Forms, measurements, density, and substitutions

- The White Peaks page gives a 20 kg commercial package and product specifications (including protein, ash, moisture, and a 66.00 absorption value). These are product/package and technical values, not a household portion, volume-to-mass conversion, flour density, unit mapping, or general property of the class. Activate no density or unit mapping.
- The page markets one all-purpose, unbleached/untreated product. It does not enumerate multiple flour forms or a transferable form-conversion relationship. Create no form and do not model flour as a form of the wheat-berries reference.
- The use suggestions for noodles, dumpling wrappers, and soft white bread are not a replacement recommendation. No reusable substitution ratio or scoped contextual substitution is supported. Do not infer substitution for bread flour, high-gluten flour, generic all-purpose flour, white whole-wheat flour, or soft-white wheat flour.
- The Charlevoix blend sheet’s 20 kg package and its own 76% ± 3% absorption are specific to a separate flour made from multiple wheat sources. Do not transfer either figure to this identity or turn absorption into a recipe conversion.

If accepted, keep `defaultDensity: null` and `unitMappings: []`; add no forms, conversions, package yields, recipe links, or active substitution rules. Research state can record no supported transferable measure and no supported general substitute.

## Bundled recipe demand

The current seed manifest lists **114 recipe files and 1,123 structured ingredient rows**. Accent-, case-, and punctuation-normalized scans of every manifest-listed recipe file and structured ingredient row found **zero candidate hits** for `hard white spring wheat flour`, `hard white spring flour`, `hard white spring`, `farine de blé de force blanc de printemps`, `farine de blé blanc de printemps`, or the proposed reference ID. No recipe row links to the existing hard-white-spring wheat-berry, white-whole-wheat, all-purpose, or high-gluten references for this candidate. No recipe link, relink, or substitution link is proposed. The priority is the open regional/functionally distinct flour checklist and current Canadian product evidence, not current bundled recipe demand.

## Source register

New source IDs are proposal-local. Existing source IDs are cited for reuse only; this memo does not write them to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A-HWWSF-R227-20261016-S01` | Rogers Foods, [White Peaks](https://rogersfoods.com/shop/commercial-products/white-flours/white-peaks/), current manufacturer product page, accessed 2026-10-16. | Names a current Canadian commercial flour product milled from Canadian hard white spring wheat, calls it all-purpose and unbleached/untreated, lists noodle, dumpling-wrapper, and soft-bread uses, and gives a 20 kg bag. It does not name the variety, identify a formal CGC class, or state a universal grade or household measure. The package and technical specifications remain product-specific. |
| `WP02-A-HWWSF-R227-20261016-S02` | Moulin de Charlevoix, [BBCT20 technical sheet (Mayrand-hosted)](https://mayrand.ca/hubfs/13690%20Farine%20Bl%C3%A9%20Conventionnel%20Tradition.pdf), version 2411FR, accessed 2026-10-16. | The sheet says the flour is made from white spring wheat and red autumn wheat milled together; it identifies the province of origin as Québec and lists a 20 kg bag plus product-specific baking/absorption specifications. This supports local French wording and the blend boundary only; it is not evidence for a single-ingredient hard-white-spring flour alias or transferable measurement. |
| **Reused: `WP03-HWSW-R153-20261015-S03`** | Canadian Grain Commission, [Canadian wheat classes](https://www.grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html), current English class table. | Already registered on the R153 hard-white-spring berries record. Describes classes as functional and regional, lists CWHWS as a hard-white-spring milling class that produces flour, and gives bread/noodle uses; it also separates CPSW and CWSWS. It does not assign Rogers' product to CWHWS. |
| **Reused: `WP03-HWSW-R153-20261015-S01`** | Canadian Grain Commission, [Blé : Classes et variétés](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html), current French class table. | Already registered on R153. Provides official class wording `blé de force blanc de printemps de l’Ouest canadien` and distinguishes CPSW and CWSWS French names. It is class terminology, not a French flour product title or OQLF approval for the proposed full phrase. |
| **Reused: `WP03-HWSW-R153-20261015-S06`** | Office québécois de la langue française, [`farine de blé de force`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force), GDT entry. | Already registered on R153. Supports the Québec French base term for flour made from hard wheat. It does not name the white-spring class or approve the constructed compound; its unqualified phrase remains on the existing high-gluten-flour alias. |
| **Reused: `WP02-REGIONAL-FLOUR-CLASS-QC-20261011-S07`** | Moulin de Charlevoix, [flour products](https://www.moulin-charlevoix.net/farines-flour), current mill catalogue, accessed 2026-10-16. | Already registered on the regional flour-class review. The current catalogue also names `Farine de blé blanc Tradition`; its wording does not state hardness, season, or source-grain class, so this is Québec market-context evidence only. |

## Local evidence references

- Active checklist: [WP02 Section A open regional wheat-flour item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Previous deferred class boundary: [Québec white-whole-wheat identity review](wp02-wheat-flour-quebec-identity-gap-review-20261010.md).
- Adjacent flour identities: [R216 soft red winter wheat flour](wp02-a6-or-section-a-gap-review-r216-20261016.md), [R219 hard red winter wheat flour](wp02-a-or-a6-hard-red-winter-wheat-flour-review-r219-20261016.md), [R222 hard red spring wheat flour](wp02-a-or-a6-hard-red-spring-wheat-flour-review-r222-20261016.md), and [R225 soft white wheat flour](wp02-a-or-a6-soft-white-wheat-flour-identity-review-r225-20261016.md).
- Adjacent whole-kernel identity: [R153 hard white spring wheat berries](wp03-section-f-next-grain-gap-review-r153-20261015.md).
- Read-only ownership and demand checks used the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and manifest-ordered recipe corpus.
