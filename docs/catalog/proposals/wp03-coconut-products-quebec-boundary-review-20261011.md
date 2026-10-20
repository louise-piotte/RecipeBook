# WP03 Section I coconut products: Québec boundary review

## Scope and status

- **Review date:** 2026-10-11
- **Scope:** Fresh coconut meat; dried/desiccated coconut; shredded and flaked cuts; toasted and sweetened/unsweetened variants; coconut butter.
- **Status:** Proposal only. No seed package, ledger, plan, roadmap, recipe, code, test, or README was changed.
- **Proposal-local source IDs:** `WP03-COCONUT-QC-20261011-S01` through `S11`. These IDs are local to this document, not ledger IDs.
- **Inputs:** Current bundled references, forms, units, package yields, substitutions, research-ledger records, legacy candidates, all manifest-listed recipe files, and the open WP03 Section I item in the catalog plan.

## Recommendation

Run one focused WP03 Section I coconut integration batch:

1. **Keep one base `coconut / noix de coco` identity** for the edible coconut meat. Do not add a second `fresh coconut` identity: the active `ingredient-ref-coconut` already owns the generic fruit and its French `chair de noix de coco` alias. Treat fresh versus dried as a product-state/form distinction.
2. **Consolidate the current `shredded coconut` reference under that coconut identity** rather than keeping a second ingredient identity for the dried cut. Model moisture state (`fresh` versus `dried/desiccated`) and cut (`shredded` versus `flaked`) as separate attributes/forms. Preserve toasted and sweetened/unsweetened as independent product/preparation qualifiers on a line. Do not create a reference for every combination such as toasted-unsweetened-flaked coconut. If the current form representation cannot compose these properties, keep them in the recipe line's existing bilingual preparation/notes fields until it can; do not approximate them with combination rows.
3. **Add one separate identity-only `coconut butter / beurre de noix de coco` reference** in `FAT_AND_OIL`, scoped to a spread/paste made by grinding coconut meat. Keep it distinct from coconut oil, coconut milk, cream of coconut, coconut flour, and coconut sugar. Do not alias `creamed coconut`, `coconut cream`, or the shorter `beurre de coco` without product-qualified evidence.
4. **Make no measurement, conversion, yield, or substitution changes.** Preserve exact recipe quantities and qualifiers. No reviewed evidence supports a transferable mass-volume mapping, fresh-to-dried yield, or general substitution among these products.

This one-batch normalization removes the current generic-versus-shredded identity split without multiplying rows for cut, moisture, toast, and sugar states. Future integration should preserve recipe text and quantity; if the split is consolidated, relink the existing dried-coconut lines to the one base identity and retain their independent qualifiers.

## Boundary decisions

| Term or property | Recommended catalog treatment | Evidence and limits |
|---|---|---|
| Fresh whole coconut / fresh meat | Existing `coconut / noix de coco` identity; record freshness explicitly when stated, using `fresh coconut meat / chair de noix de coco fraîche` as a form label/search term. Do not infer that an unqualified recipe line means fresh meat. | Metro Québec lists a whole `Noix de coco` and describes the edible flesh as fresh [S03]. Fresh is not an alias for dried/desiccated product. |
| Dried/desiccated coconut | Form of the same coconut-meat identity, separate from fresh by moisture state; not a new ingredient identity. A short French form label such as `noix de coco desséchée` is a proposal inferred from Metro's exact product wording `noix de coco râpée desséchée non sucrée`, not an OQLF-preferred term. Restrict the English `desiccated coconut` product name to the exact dried-product sense supported by its source; do not let it silently absorb sweetened or toasted states. | Canadian Government procurement specifications define desiccated as a moisture state of the meat and say it is sold shredded or flaked [S02]. Codex defines a narrower desiccated product and explicitly excludes sugared and roasted products from that standard [S01]. Current Metro wording includes `râpée desséchée non sucrée` [S04]. |
| Shredded vs flaked | Distinct cut forms, not aliases. Use product wording `shredded coconut / noix de coco râpée` and `flaked coconut / noix de coco en flocons` only when those cuts are meant. Avoid treating `shredded`, `grated`, and `flakes` as universal synonyms. | The Canadian procurement description distinguishes thin strands from larger, coarser flakes; Québec retail listings sell sweetened shredded coconut and coconut flakes as separate products [S02, S05, S06]. Some marketing prose loosely calls shredded product “flakes,” so keep the cut evidence source-specific [S07]. |
| Sweetened vs unsweetened | Independent formulation qualifier on the dried product, not a second ingredient identity and not an alias pair. Preserve `sweetened / sucré` and `unsweetened / non sucré` on recipe lines. | The Canadian specification describes both variants; current Metro product records show sugar and other added ingredients in its sweetened item, while the unsweetened item lists coconut and sulfites [S02, S04, S05]. The formulations are not compositionally identical. |
| Toasted | Preparation state, not ingredient identity. It can coexist with a cut and sweetening state; keep the axes independent. French retail wording `grillé` is attested, but no toast level, process, or universal flavor/conversion behavior is established. | The Canadian specification says unsweetened shredded coconut is also sold toasted [S02]. Edward & Sons describes a single product as sliced, dehydrated, toasted, and unsweetened; its Canadian French Walmart listing uses `flocons de noix de coco grillés` [S08, S09]. |
| Coconut butter | Separate food identity for ground whole coconut meat/paste, not a form alias for coconut oil. Provisional Québec display `beurre de noix de coco`; keep the scope tied to whole-meat paste rather than every product sold under “coconut butter.” | Québec maker Cru Nature identifies raw coconut meat as its single ingredient and says it grinds the meat into the spread [S10]. OQLF's coconut-oil entry defines oil as extracted from coconut kernels, a different product [S11]. No recipe in the current corpus asks for coconut butter. |
| `coco râpé` | Do not use as a blanket alias for unsweetened shredded coconut. | OQLF's 1991 entry defines `coco râpé` as dried and grated coconut with sugar added [S11]. Current Canadian product pages distinguish sweetened and unsweetened `noix de coco râpée`; the old term's stated scope does not safely cover both [S04–S06]. |
| `creamed coconut`, `coconut cream`, `beurre de coco` | Hold as aliases for coconut butter. Keep the active `cream of coconut` identity separate. | No reviewed Québec food authority or product source establishes equivalence between these names and whole-meat coconut butter. The corpus already has a separate `cream of coconut` reference and line. |

**French-display note.** The existing broad `noix de coco` display is attested by Québec retail. For form labels, prefer product-grounded `chair de noix de coco fraîche`, `noix de coco râpée`, `noix de coco en flocons`, `noix de coco desséchée non sucrée`, `noix de coco sucrée`, and `flocons de noix de coco grillés`. These are not all interchangeable aliases; modifiers preserve the product state. The proposed `beurre de noix de coco` display is supported by the Québec maker's food-product wording, not an OQLF term ruling.

## Live catalog, ledger, and corpus audit

The current bundled catalog has two relevant coconut-meat references:

- `ingredient-ref-coconut`: `coconut / noix de coco`, FR alias `chair de noix de coco`, category `FRUIT`; no English aliases, density, or unit mappings.
- `ingredient-ref-shredded-coconut`: `shredded coconut / noix de coco râpée`, FR aliases `noix de coco en flocons` and `noix de coco séchée`, English alias `desiccated coconut`, category `BAKING_MIXIN_AND_PANTRY`; no density or unit mappings. These aliases currently conflate cut (`en flocons`), moisture state (`séchée`), and the broader product name (`desiccated`).

The active references for coconut oil, coconut milk, and cream of coconut are already separate from coconut meat and should stay independent. Coconut sugar is also a separate sap-derived sweetener. The broad coconut-flour candidate remains held by its existing review because product sources use the same flour name for products with materially different composition and do not resolve a common process; that issue is outside this batch.

The research ledger has no dedicated coconut-butter record. The generic coconut record is `unreviewed`, with no sources and measurement/substitution work not yet researched. The shredded-coconut record is `unreviewed`; it has no sources and records that source-less draft density and unit mappings were removed, leaving measurement evidence blocked pending support. Its substitution research is not yet researched. This proposal does not promote either record's measurement or substitution state based on identity evidence.

There are **no coconut ingredient forms, package yields, unit mappings, densities, or substitution rules** in the live package. In particular, there is no evidence-backed fresh/dried yield or shredded/flaked/toasted/sweetened conversion.

The manifest-listed corpus has **114 recipes and 1,123 ingredient rows**. Ten lines refer to coconut meat preparations:

- Three lines say `flaked coconut` and point to generic `coconut`: `006#6`, `026#5`, `058#12`.
- Three lines say `toasted coconut` or `toasted coconut flakes` and point to generic `coconut`: `058#16`, `081#2`, and `081#6`. Recipe 081 stores the flake cut in notes and `toasted` as preparation.
- Four lines point to `shredded coconut`: sweetened at `035#1` and `114#19`; unsweetened at `067#5` and `070#11`.

No line requests fresh coconut meat or coconut butter. Five additional coconut-derived ingredient lines are already separate products and remain untouched: coconut oil (`022#6`); coconut milk (`070#10`, `086#13`, `095#2`); and cream of coconut (`081#12`). The single `can` quantity for cream of coconut has a recipe note specifying a 15 oz can; that is not package-yield evidence for coconut butter or coconut meat.

## Measurement and substitution evidence kept separate

The reviewed sources include product serving declarations and package sizes, but they are not comparable generic measurements. For example, Camino reports one product's 2 tablespoons as 15 g [S07], while the toasted-flake product lists 3 tablespoons as 15 g [S08, S09]. These are source/product-specific label observations, not a default density or unit mapping; no mapping should be inferred from them. The existing recipe masses and volume amounts remain recipe data, not transfer rules.

No reviewed source supports:

- a general mass-volume conversion for fresh, shredded, flaked, sweetened, unsweetened, toasted, or butter forms;
- converting fresh coconut meat to dried/desiccated coconut, including a moisture/yield ratio;
- substituting sweetened for unsweetened coconut without adjusting the recipe;
- substituting shreds for flakes or toasted for untoasted coconut in every context; or
- substituting coconut butter for coconut oil, coconut milk, cream of coconut, or another nut/seed butter.

Keep all such values and recommendations absent unless a later source documents the exact product, serving basis, preparation, and culinary context.

## Proposal-local source register

Pages and documents were accessed on **2026-10-11**. Retailer listings support the named product and displayed wording, not a universal standard. Proposal-local IDs do not change the shared ledger.

| ID | Source and locator | Evidence used | Limits |
|---|---|---|---|
| **S01** | FAO/WHO Codex Alimentarius Commission, [CXS 177-1991, Standard for Desiccated Coconut](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B177-1991%252FCXS_177e.pdf), §§1–2.2 and 9.1. | Defines desiccated coconut as processed dried kernel and recognizes fine/medium plus special cuts such as thin flakes, chips, and shreds; standard scope excludes sugared and roasted products. | International standard, not a Québec display ruling or proof that every retail item using the term complies. |
| **S02** | Department of National Defence, [Food Quality Specifications (2018 PDF)](https://www.publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-20-2018-eng.pdf), FQS-20-09, pp. 9–10, paras. 42–48. | Canadian procurement description of coconut meat; defines desiccation by moisture state, distinguishes shredded thin strands from larger/coarser flakes, notes sweetened/unsweetened and toasted variants. | Procurement specification narrative, not a current retail standard or universal terminology ruling. |
| **S03** | Metro, [Noix de coco](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/fruits/avocats-et-fruits-exotiques/noix-de-coco/p/4261), product 4261, description. | Québec listing sells one whole coconut and describes the fresh edible flesh. | Direct page retrieval returned HTTP 403 during this review; indexed page text was used for the listing description. Product page is not an ingredient standard. |
| **S04** | Metro, [Selection Noix de coco râpée desséchée non sucrée](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/fruits-graines-et-noix/noix-de-coco-rapee-dessechee-non-sucree/p/059749976428), product 059749976428. | Current bilingual listing pairs English “Unsweetened Shredded Desiccated Coconut” with French `noix de coco râpée desséchée non sucrée`; ingredient list is coconut and sulfites. | Direct page retrieval returned a cache miss; indexed current product text was used. Retailer information can change. |
| **S05** | Metro, [Selection Noix de coco sucrée en flocons](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/fruits-graines-et-noix/noix-de-coco-sucree-en-flocons/p/059749903479), product 059749903479. | Current French title uses `noix de coco sucrée en flocons`; ingredient list shows coconut, sugar, water, propylene glycol, salt, and sulfites. | Product formula and availability are SKU-specific. |
| **S06** | Metro, [Selection Noix de coco sucrée râpée moyenne](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/fruits-graines-et-noix/noix-de-coco-sucree-rapee-moyenne/p/059749903462), product 059749903462. | Current Québec listing uses `noix de coco sucrée râpée moyenne`, distinct from sweetened coconut flakes. | Listing displayed out of stock at retrieval; it supports the displayed product wording and not a universal medium-shred grade. |
| **S07** | Camino, [Shredded coconut — Unsweetened](https://camino.ca/products/baking-products/coconut/shredded-coconut-unsweetened/), product description, ingredients, and nutrition label. | Canadian brand uses `Shredded coconut` and `Unsweetened` as separate product descriptors and lists coconut as the sole ingredient; its label gives a product-specific serving weight. | Manufacturer product and label only. Marketing prose calls the shreds “flakes,” so it does not establish that “shredded” and “flaked” are universal synonyms. |
| **S08** | Edward & Sons, [Let's Do Organic Organic Unsweetened Toasted Coconut Flakes](https://store.edwardandsons.com/products/organic-toasted-coconut-flakes), product description and ingredients. | Manufacturer describes flakes from fresh coconut meat as sliced, dehydrated, and toasted; no sweeteners are added. | US manufacturer item sold in Canada; its process and product declaration do not define all toasted coconut. |
| **S09** | Walmart Canada, [Let's Do Organic toasted coconut flakes](https://www.walmart.ca/fr/ip/Let-s-Do-biologique-Flocons-de-Noix-de-Coco-Grill-s-100-Biologiques-Non-Sucr-s-7-oz/4N98L99LMQYQ), French listing and ingredient panel. | Canadian French listing uses `flocons de noix de coco grillés` and describes the item as unsweetened; ingredient panel says organic coconut, sliced, dehydrated, and toasted. | Retail listing may include supplier/marketplace text and is not a Québec terminology ruling. |
| **S10** | Cru Nature, [Beurre de noix de coco crues Bio](https://crunature.com/products/beurre-de-noix-de-coco-crues), product description and ingredient/method sections. | Québec food maker uses the phrase `beurre de noix de coco`; identifies coconut meat as the single ingredient and describes grinding it into a spread. | Product-specific method; direct page retrieval returned a cache miss, so indexed page text was used. Does not establish a universal standard for every “coconut butter” product. |
| **S11** | OQLF, [coco râpé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17021264/coco-rape) and [huile de noix de coco (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084453/huile-de-noix-de-coco). | The 1991 `coco râpé` entry explicitly describes dried grated coconut with sugar added. The coconut-oil entry identifies oil as extracted from coconut kernels and gives `huile de noix de coco`, `huile de coco`, and `huile de coprah`. | The `coco râpé` entry is old and does not cover current unsweetened retail product wording; the oil entry is older terminology and does not define coconut butter. |

## Integration boundary

Accept the one-base-identity plus orthogonal-form/qualifier model and add only the separate whole-meat coconut-butter identity. Keep the product names `fresh coconut meat`, `dried/desiccated`, `shredded`, `flaked`, `toasted`, `sweetened`, and `unsweetened` scoped to the exact property each source supports. Do not add combination identities, measurement values, conversions, yields, or substitutions. Keep current recipe quantities and the existing coconut oil, milk, and cream-of-coconut references separate.
