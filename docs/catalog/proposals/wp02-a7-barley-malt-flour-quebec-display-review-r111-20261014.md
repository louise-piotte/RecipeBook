# WP02 A7 R111 — Barley malt flour Québec French display review

- **Reviewed:** 2026-10-14
- **Status:** Integrated by root on 2026-10-14 as a documentation-only Québec wording decision; no catalog or ledger data changed. See the [R111 batch README](../batches/wp02-a7-barley-malt-flour-quebec-display-review-integration-20261014/README.md).
- **Scope:** Recheck the Québec French displays for the active roasted and light-caramelized barley malt flour references. This reviews product wording and picker clarity; it does not reopen either identity decision or establish a general process taxonomy.
- **Source IDs:** Proposal-local `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S01` through `S11`; these IDs are not ledger records.

## Recommendation

**Retain both current displays, and keep both provisional pending an independent Québec bilingual reviewer.** Each French phrase is supported as wording for a named supplier product. Neither is established by an OQLF entry or a Québec retail label for that product. No better generic French display is justified by the reviewed evidence.

| Active reference | Current display | Review finding |
|---|---|---|
| `ingredient-ref-roasted-barley-malt-flour` | `roasted barley malt flour / farine de malt d'orge, pâle et grillée` | IREKS North America's current French product page uses this wording for its named Canadian product [S01–S02]. OQLF terminology supports `malt` and recognizes `griller` in the sense of `torréfier`; its specialized malterie entry also uses `torréfier` for roasting malt [S04–S06]. The current display is linguistically supported, but is supplier wording rather than an OQLF-standardized Québec name. Retain it provisionally; do not silently replace `grillée` with `torréfiée`. |
| `ingredient-ref-light-caramelized-barley-malt-flour` | `light caramelized barley malt flour / farine de malt d'orge légèrement caramélisée` | Castle Ingredients' English and French listings name its CaraBelga 30 product this way [S09–S10]. This supports the source-specific French display, not Québec preference or a general malt-process term. Retain it provisionally; do not recast it as a generic `farine d'orge maltée` term or turn its wording into a process rule. |

The established Québec term `farine d'orge maltée` is the preferred term for the adjacent ordinary malted-barley-flour identity; it does not standardize either qualified product [S03–S04]. Reusing that phrase as the start of both displays could make the ordinary query return several product types. The active phrase `farine de malt d'orge` instead returns the two qualified products together, with their distinct qualifiers visible in results.

Keep these two source-named products distinct from each other and from ordinary malted barley flour, roasted barley flour, and generic malt flour. Castle's catalog lists caramelized and roasted products separately in its own range, while IREKS names its own roasted product [S01–S02, S09–S10]. That supports preserving the source-specific identities. It does **not** show a universal process boundary between caramelized and roasted barley malt products, nor does it establish which material was heated in either product. Do not infer a common formulation, processing sequence, enzyme state, or interchangeability from the names. In particular, keep `non-diastatic` as a CaraBelga 30 product specification rather than a property of all caramelized barley malt flour.

## Québec terminology assessment

- **Base noun phrase:** OQLF's GDT gives `farine d'orge maltée` as the preferred Québec term for *malt barley flour* [S03]. TERMIUM Plus uses the same French wording for *malted barley flour* and describes that ordinary product as flour made from malted brewing barley [S04]. Arva Flour Mills' current Ontario French product listing also uses `farine d'orge maltée` for its ordinary malted barley flour [S08]. This is useful neighboring terminology, not evidence that the two qualified references are the same product.
- **`grillée` versus `torréfiée`:** OQLF's BDL says `griller` can mean `faire rôtir` or `torréfier`; its GDT malterie entry uses `torréfier` for exposing malt to high heat and gives `torréfaction du malt` as an example [S05–S06]. The more specialized verb is a plausible alternative, but the direct Canadian supplier description says `pâle et grillée`. No reviewed Québec authority requires a rewrite, and replacing the supplier's term would be an editorial normalization without a demonstrated gain for this exact product. Preserve the source wording pending Québec review.
- **`caramélisée`:** The exact French phrase appears in Castle's current French listing [S10]. The OQLF entry located for `caraméliser` is in culinary use and discusses caramel or sugar applied/cooked in pastry; it does not define caramelized malt flour [S07]. It neither invalidates Castle's product wording nor supplies a more exact malt-specific display.
- **Québec product context:** A Québec retail listing for Moulin Abénakis uses `farine d'orge` for flour ground from whole barley [S11]. This is a plain barley-flour comparator, not a malt-flour naming standard. No current Québec retail or Québec-manufacturer listing for either exact qualified barley malt flour was found in this review.

Do not add `farine d'orge maltée` as an alias to either qualified row. Do not add `farine de malt d'orge torréfiée` or `farine de malt d'orge caramélisée` as aliases: the source pages do not establish these as alternate Québec product names, and a future reviewer may still choose a different display.

## Picker ownership and corpus effects

The static projection below follows the normalization and complete-phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), over the current references and forms. It is not a live app-picker test.

| Query | Current result(s) | Effect of this proposal |
|---|---|---|
| `roasted barley malt flour`; `farine de malt d'orge, pâle et grillée` | `ingredient-ref-roasted-barley-malt-flour` only | Retained; no new term or alias. |
| `light caramelized barley malt flour`; `farine de malt d'orge légèrement caramélisée` | `ingredient-ref-light-caramelized-barley-malt-flour` only | Retained; no new term or alias. |
| `barley malt flour`; `farine de malt d'orge` | Both active barley malt flour references | Keep both qualified results. This broad query does not make the products synonyms. |
| `malted barley flour`; `farine d'orge maltée` | `ingredient-ref-malted-barley-flour` only | Preserve the exact ordinary-product owner. |
| `farine d'orge torréfiée`; `orge torréfiée` | `ingredient-ref-roasted-barley-flour` only | Preserve the separate plain roasted-barley-flour owner. |
| `malt flour` | Six references: generic malt flour, malted spelt flour, roasted oat malt flour, roasted wheat malt flour, and these two barley malt flour references | Keep the broad family result set; result qualifiers distinguish the source-named barley products. |
| `barley`; `orge` | Eighteen references each | No change; broad cereal search remains multi-result. |

The English and French full product displays each have one active exact name owner. Exact normalized searches across active reference names/aliases and forms found no competing owner for either full display. The ordinary phrase `farine d'orge maltée` remains owned by `ingredient-ref-malted-barley-flour`. The current ledger contains the two intended records; no exact product name or ID was found in the legacy-import candidates.

The current manifest lists **114 recipe files**. A read-only scan of all files and **1,123 ingredient rows** found **zero** direct links to either reference and **zero** occurrences of the full English/French product names or `CaraBelga 30` / `IREKS AROMA BARLEY MALT K`. No recipe relink, recipe text change, measurement, or substitution is supported by the corpus.

## Explicit data/no-data proposal

**No data change is proposed.** Preserve the existing reference IDs, category `FLOUR_AND_STARCH`, English and French displays, empty aliases, null density, and empty unit mappings. Preserve the ledger's current identity-verified state and its researched-no-supported-value / researched-no-supported-substitute findings. Add no forms, recipe links, product behavior, conversion, yield, measurement, or substitution. Do not edit the seed JSON, ledger, generated catalog index, active plan, roadmap, or integration README files as part of this review. Reopen the French display only if an independent Québec reviewer supplies a supported correction or endorsement.

## Source register

Sources were checked online on **2026-10-14**. Proposal-local IDs below are not appended to the shared research ledger.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S01` | IREKS North America, [IREKS AROMA BARLEY MALT K](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-barley-malt-k), current English product page. | Names `Light-coloured roasted barley malt flour`; identifies the North American supplier at its Brampton, Ontario address. Its 25 kg package and 1–5% flour-basis dosage are industrial product details, not reusable recipe measures. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S02` | IREKS North America, [French product search](https://www.ireksnorthamerica.com/fr/produits/recherche-de-produits), current product result for IREKS AROMA BARLEY MALT K. | Uses `Farine de malt d'orge, pâle et grillée avec une note de caramel malté` for the same Canadian product. Supports supplier-specific Canadian French wording, not a Québec terminology ruling. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S03` | Office québécois de la langue française, [farine d'orge maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee), updated 1984. | Preferred term for *malt barley flour* in the flour domain. Does not name the roasted or caramelized products. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S04` | Translation Bureau, [TERMIUM Plus: malted barley flour](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=TYPE+FARINE), milling/cereal and breadmaking record, 2012-01-11. | Gives `farine d'orge maltée` and a definition for ordinary malted barley flour; the cited record does not distinguish roasted or caramelized grades. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S05` | OQLF, [griller: usage note (BDL)](https://vitrinelinguistique.oqlf.gouv.qc.ca/22549/le-vocabulaire/paronymes/sens-et-emploi-de-grillager-et-de-griller). | Says `griller` can mean roasting or `torréfier`; general language guidance, not a barley-malt product entry. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S06` | OQLF, [torréfier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8891030/torrefier), malterie, 1982; and [malt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26545137/malt), updated 2018. | The malterie record uses `torréfier` for heat treatment of malt; the malt record defines malt as soaked, germinated, and dried grain and notes barley as the usual brewing grain. Neither names the IREKS product or prescribes its process. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S07` | OQLF, [caraméliser (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429179/carameliser), food/cooking, updated 1983. | Covers culinary uses involving caramel and pastry. It does not define barley malt caramelization or standardize a product name. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S08` | Arva Flour Mills, [Farine d'orge maltée](https://arvaflourmills.com/fr/products/malted-barley-flour), current Ontario French product page. | Uses the established adjacent name for ordinary malted barley flour and describes germinating, drying, and milling; it does not specify the roasted or caramelized products. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S09` | Castle Ingredients, [Malt](https://www.shop.castle-ingredients.com/shop/category/baking-flours-malt-15?order=name+asc), current English malt-flour listing. | Names CaraBelga 30 `Light caramelized barley malt flour, non-diastatic` and lists roasted barley malt flour separately. Castle identifies itself as a Belgian manufacturer; its list supports its own product labels, not a universal process taxonomy or Québec usage. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S10` | Castle Ingredients, [Farines de boulangerie](https://www.shop.castle-ingredients.com/fr/shop/category/farines-de-boulangerie-9), current French listing. | Names CaraBelga 30 `Farine de malt d'orge légèrement caramélisée, non diastatique`; separately lists roasted barley-malt products with `torréfiée`. This supports the manufacturer's French wording and own catalog organization only. |
| `WP02-A7-BARLEY-MALT-QC-DISPLAY-R111-20261014-S11` | La Moisson, [Farine d'Orge biologique](https://lamoisson.com/products/farine-dorge-biologique), current Québec retailer listing. | Names a Moulin Abénakis flour ground from whole barley as `farine d'orge`; useful plain-flour context, not a malt-flour terminology standard. |

## Read-only checks

- Read the active Section A7 checklist in [`RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), the [R57 roasted-barley-malt proposal](wp02-a7-roasted-barley-malt-flour-identity-boundary-review-20261013-round57.md) and [integration README](../batches/wp02-a7-roasted-barley-malt-flour-identity-integration-20261013/README.md), and the [R110 light-caramelized proposal](wp02-a7-light-caramelized-barley-malt-flour-review-20261014.md) and [integration README](../batches/wp02-a7-light-caramelized-barley-malt-flour-identity-integration-20261014/README.md). Also read the [R110 pot-barley Québec recheck proposal](wp03-section-f-pot-barley-quebec-display-recheck-r110-20261014.md); its wording decision concerns a different ingredient and does not transfer to barley malt flour.
- Read both active seed rows and their ledger records. Current snapshot: **1,452 references, 105 forms, 63 legacy candidates, 1,792 ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows**.
- Checked exact active names/aliases and form terms, the exact ledger IDs, and legacy-candidate text. The two complete English/French displays have one intended active owner each; no competing legacy owner was found.
- Reproduced representative picker results from the current `IngredientReferenceSearchIndex` normalization/matching rules. This was a static projection only; no app, unit, instrumentation, or emulator test was run.
- Scanned every manifest-listed recipe file and ingredient row for both IDs, complete English/French product names, and the two supplier product names. No direct recipe link or text hit was found.
- Rechecked the OQLF, TERMIUM, IREKS, Castle, Arva, and Québec retailer sources online on 2026-10-14. No catalog, ledger, plan, roadmap, generated-index, or app file was edited; this proposal is the sole intended file addition.
