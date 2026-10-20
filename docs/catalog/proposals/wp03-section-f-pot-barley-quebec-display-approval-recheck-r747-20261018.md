# WP03 Section F R747 — pot-barley Québec French display recheck

- **Review date:** 2026-10-18
- **Status:** Integrated documentation-only recheck on 2026-10-18; no shared catalog or ledger data changed. The `orge en pot` display remains provisional pending independent Québec reviewer approval.
- **Scope:** Recheck the still-open independent Québec approval of the active pot-barley French display, `orge en pot`.
- **Disposition:** Keep the existing `ingredient-ref-pot-barley` row unchanged and keep `orge en pot` provisional. Do not add `orge mondé(e)` or another French alias. No catalog or ledger delta is proposed.

## Open question and finding

The live Section F packet still asks for independent Québec approval of pot barley’s market-attested `orge en pot` display ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L743), [packet](../batches/plant-grains-cereals.md#L542)). The row was integrated in R702, and two earlier source reviews kept the display provisional pending an actual Québec bilingual reviewer’s approval ([R702 naming proposal](wp03-pot-barley-quebec-french-name-resolution-20261011.md), [independent display review](wp03-pot-barley-display-independent-quebec-review-20261011.md), [second review](wp03-pot-barley-display-second-independent-review-20261011.md)). The current [workflow checkpoint](../ingredient-catalog-workflow.md#L3066) records R743–R745; R744 concerns prepared kasha and is outside this review. The latest [roadmap entry](../../../roadmap.md#L1495) likewise leaves Section F work open.

Current evidence continues to support `orge en pot` as a narrow French commercial product heading, but it does not establish the phrase as a preferred Québec term or as approval by a Québec language reviewer. OQLF’s current page pairs *orge mondé* with *hulled barley* and defines that grain by removal of its outer covering. The current TERMIUM record is less discriminating: it groups *pot barley*, *hulled barley*, and rare *Scotch barley* under *orge mondé / orge mondée*. These entries do not provide a unique French mapping for the two distinct English processing classes.

Current indexed commercial wording remains mixed. Healthy Planet’s French result calls a Canadian Oak Manor product *Orge en pot* but its ingredient line says *orge mondé*. Arva Flour Mill’s French shop result lists *Orge en pot 900 g*, and FoodServiceDirect’s French-Canada result shows *Agrofusion Orge En Pot* separately from *Orge Perlé*. Those results attest listed market wording; Arva is in Ontario, FoodServiceDirect is a distributor, and neither is a Québec terminology authority. Healthy Planet’s page also shows an October 13 product-expiry date, so R747 makes no current-stock claim. The previously registered Metro pages for UPC `062356506537` pair English *Pot Barley* with Québec French *Orge mondé*; a direct R747 fetch of the French page returned 403, so that earlier registered page is retained as historical listing evidence rather than represented as freshly verified.

The result is to preserve the narrow active display for search while leaving its independent Québec approval open. R747 does not present the row as OQLF-preferred or as human-approved.

## Exact proposed delta

**No shared-data delta.** Keep the current reference fields exactly as they are:

| Record | Current state | R747 disposition |
|---|---|---|
| `ingredient-ref-pot-barley` | `pot barley / orge en pot`; English alias `Scotch barley`; no French aliases; `GRAIN_AND_CEREAL`; null density; empty unit mappings. | Retain unchanged; continue to label `orge en pot` provisional pending Québec reviewer approval. |
| `ingredient-ref-hulled-barley` | `hulled barley / orge mondé`; French alias `orge à grains nus`; English aliases include `barley groats`, `hulless barley`, and `naked barley`. | Retain ownership of `orge mondé`; do not merge pot barley into this row. |
| `ingredient-ref-pearl-barley` | `pearl barley / orge perlé`; English alias `jau`; two state forms. | Retain as the separate pearled product. |

Do not add `orge mondé`, `orge mondée`, or `orge entière` to pot barley. Do not alter forms, aliases, measures, density, mappings, recipe links, yields, conversions, or substitutions. The pot-barley ledger record remains identity-verified with measurement and substitution research `not_yet_researched`; this wording review does not complete either research state.

## Picker projection

The current [IngredientSearch implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23) checks normalized complete word phrases first, then uses substring fallback only when no phrase result exists. The projection below was calculated against all 1,848 live references and 178 forms, including attached form labels and match terms:

| Query | Current result | R747 result |
|---|---|---|
| `pot barley`; `Scotch barley` | `ingredient-ref-pot-barley` | Unchanged. |
| `orge en pot` | `ingredient-ref-pot-barley` | Unchanged and uniquely identifies the provisional display. |
| `hulled barley`; `orge mondé` | `ingredient-ref-hulled-barley` | Unchanged. |
| `orge mondée` | No result | Unchanged; no French form is inferred from grammatical agreement. |
| `orge mond` | `ingredient-ref-hulled-barley` by substring fallback | Unchanged. |
| `barley`; `orge` | 20 references each | Unchanged. |
| `orge perlé`; `pearl barley` | `ingredient-ref-pearl-barley` | Unchanged. |

Adding `orge mondé` as a pot-barley alias would make that exact query return both the pot and hulled identities. That would encode the terminology conflict as a shared picker key, so it is not proposed. An `orge mondée` alias is also unsupported as a pot-specific mapping: TERMIUM groups it with both English product terms, and no current Québec product source resolves that ambiguity.

## Recipe corpus, measures, and forms

Read-only scan of all **114 manifest-listed recipe files** and **1,123 ingredient rows** found no text hit for `pot barley`, `Scotch barley`, `hulled barley`, `orge en pot`, `orge mondé(e)`, `orge perlé`, or `pearl barley`. No ingredient row links to the pot-, hulled-, or pearl-barley reference IDs. The pot-barley and hulled-barley references have no forms; both retain null density and empty unit mappings. No recipe-specific measure, conversion, yield, form, or substitution is supported by this recheck.

## Source IDs and URL ownership

R747 adds no source IDs or shared ledger entries. The sources below already have owners on `ingredient-ref-pot-barley`, except OQLF’s `WP03-S32`, which is shared by the pot- and hulled-barley records because it defines the latter:

| Existing source owner | Current evidence used | Ownership and limit |
|---|---|---|
| `WP03-S32`; `WP03-PB-NAME-20261011-S01` — [OQLF, *orge mondé*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde) | Current page pairs the preferred Québec term with *hulled barley*, defines the removed outer envelope, and gives the masculine compound form. | Same URL has existing ledger ownership on both relevant rows; it does not name pot barley. |
| `WP03-S84`; `WP03-PB-NAME-20261011-S02` — [TERMIUM Plus, *Scotch barley*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=SCOTCH+BARLEY) | Current search result shows modification date 2026-08-06 and groups pot, hulled, and rare Scotch barley with *orge mondé / orge mondée*. | Existing URL owner on the pot-barley ledger record; direct open returned a cache miss during R747. It documents terminological overlap, not product equivalence. |
| `WP03-PB-NAME-20261011-S03/S04` — [DND English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf) food specifications | Distinguish Scotch/pot processing from hulled barley; French text uses *orge mondé* for the pot/Scotch passage and *orge entière* for hulled barley. | Both URLs already belong to the pot-barley ledger record; dated 2018 procurement terminology, not a Québec retail authority. |
| `WP03-PB-NAME-20261011-S06` — [Healthy Planet, Oak Manor *Orge en pot*](https://www.healthyplanetcanada.com/fr/oak-manor-barley-pot-organic-1kg.html) | Search result crawled five days before R747 labels the product *Orge en pot*, says it is grown and processed in Canada, and lists ingredient *Orge mondé*. | Exact URL already owned by the pot-barley record; direct open returned a cache miss. Canadian listing, not proof of Québec-local terminology or an internally consistent technical name; the page shows an October 13 expiry date. |
| `WP03-PB-NAME-20261011-S07` — [FoodServiceDirect French-Canada barley listings](https://www.foodservicedirect.ca/fr-CA/foods/rice-grains/barley/barley.html) | Search result crawled the week of R747 shows *Agrofusion Orge En Pot* separately from *Agrofusion Orge Perlé*. | Existing URL owner; direct open returned a cache miss. Distributor product titles do not give a processing specification. |
| `WP03-PB-NAME-20261011-S08` — [Arva Flour Mill French grain listings](https://arvaflourmills.com/fr/collections/cereals-grains?page=4) | Search result crawled the month of R747 lists *Orge en pot 900 g*. | Existing URL owner; direct open returned a cache miss. Canadian French-market wording, not Québec-local approval. |
| `WP03-S85` — [Johnvince Foods 2024 product catalogue](https://johnvince.com/wp-content/uploads/2025/11/JVF-CATALOGUE-2024.pdf) | Pairs *Pot Barley / Orge mondé* and separately *Pearl Barley / Orge perlé*. | Existing URL owner; supplier catalogue wording reinforces the collision rather than approving a Québec display. |
| `WP03-PB-NAME-20261011-S09/S10` — [Metro English](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/quinoa-specialty-grains/pot-barley/p/062356506537) and [French](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/orge-monde/p/062356506537) listings | Existing pair records the same UPC as *Pot Barley* in English and *Orge mondé* in French. | Both URLs already belong to the pot-barley record; the direct French page returned 403 in R747, so this remains previously captured listing evidence. |

## Static review checks

- Re-read `AGENTS.md`, the active Section F plan, the grain/cereal packet, workflow and roadmap checkpoints, live reference/form JSON, the pot-barley ledger record, and the earlier pot-barley review files.
- Confirmed the existing proposed filename and R747 review prefix do not collide with a file or source ID. No new source ID is allocated.
- Recomputed current picker results from catalog names, aliases, and forms using the normalization and phrase-first/fallback behavior in `IngredientSearch.kt`.
- Parsed every manifest-listed recipe and structured ingredient row for candidate wording and existing barley reference IDs.
- Checked this review for UTF-8 without BOM, valid relative Markdown links, and trailing whitespace. It is a documentation-only recheck; no software tests, build, emulator, or deployment were run.

The recheck leaves the independent Québec reviewer approval open. See the [R746–R748 integration README](../batches/wp02-wp03-wp04-r746-r748-gap-review-integration-20261018/README.md).
