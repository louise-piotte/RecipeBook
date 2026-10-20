# WP02 R113: Roasted Mong / Mung Flour Boundary Review

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only hold; `Roasted Mong Flour` remains an unresolved candidate and no catalog or ledger data changed. See the [R113 batch README](../batches/wp02-roasted-mung-flour-boundary-hold-integration-20261014/README.md).
- **Proposal-local source IDs:** `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S01` through `S09`. These IDs are local to this document and are not ledger source records.
- **Scope:** Recheck the unresolved Niru `Roasted Mong Flour` product under the open WP02 Hattai-ko / other roasted-gram checklist item. Keep it distinct from generic mung-bean flour, whole roasted mung beans, extracted mung-bean starch, bean-thread noodles, urid flour, and chana sattu. This review does not reopen the regional Hattai-ko/mugikogashi decision.

## Recommendation

**Hold `Roasted Mong Flour` as an unresolved product candidate. Do not add an active identity, French display, alias, form, recipe link, numeric behavior, or substitution. Do not alias it to generic mung-bean flour or mung-bean starch.**

Niru, a Scarborough manufacturer, currently lists the product under the exact English name `Roasted Mong Flour`. Its description calls it both a flour and “a very fine grain starch” made from “mong beans,” but supplies no botanical species, extraction or whole-bean boundary, treatment sequence, or French name [S01–S02]. The same manufacturer lists `Roasted Mung` as a separate product and describes that item as roasted beans [S03–S04]. These pages establish source-specific products and names; they do not establish that Niru's flour is the same product as a whole-bean mung flour, an extracted starch, or another manufacturer's roasted flour.

Canadian product evidence confirms that roasted mung/green-gram flour is a real, specifically processed product class: Walmart Canada's `PTI Moong Flour` listing describes split green gram with its seed coat removed, roasted, and then ground. It is a separate product description and does not state that it is Niru's item. The listing was marked out of stock when checked and warns that suppliers provide product information that Walmart does not separately verify [S05].

The Québec French boundary remains unresolved. OQLF maps `haricot mungo` to both *Vigna radiata* (English `mung bean`, `green gram`, `golden gram`) and *V. mungo* (English `urd`, `black gram`) [S06–S07]. CFIA's French organic seed/grain code table separates those two species for grain, but does not name roasted flour [S08]. A Canadian snack maker uses `farine de haricot mungo` in a French ingredient list, but only for flour inside a multi-ingredient snack; that listing does not give the species or roasted product process [S09]. Do not infer a Québec French display such as `farine de haricot mungo torréfiée` for Niru's unresolved product.

Keep the separate generic `candidate-mung-bean-flour` hold in place. The generic flour question and Niru's source-named roasted product are separate candidates; this review supplies no evidence to merge them. The earlier [generic mung-bean-flour Québec review](wp02-b2-mung-bean-flour-quebec-review-20261011.md) and [roasted-flour boundary review](wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md) remain consistent with this decision.

## Product boundary

| Evidence item | Finding | Catalog boundary |
| --- | --- | --- |
| Niru `Roasted Mong Flour` | Current manufacturer heading and collection use that exact product name. The description says “very fine grain starch” made from “mong beans,” then refers to “this flour”; 450 g and 900 g are package sizes [S01–S02]. | Hold the exact product. Species, whole-bean flour versus extracted starch, roast/milling order, and French product name are unresolved. Package masses are not recipe measures. |
| Niru `Roasted Mung` | The manufacturer lists a separate product and describes its contents as roasted mung beans [S03–S04]. | Keep this source-named whole-bean product separate. Do not make `roasted mung` an alias for the flour candidate or add a roasted whole-bean form from this review. |
| Walmart Canada `PTI Moong Flour` | Retail listing describes split green gram, testa removed, roasted, and ground; its 800 g package was marked out of stock [S05]. | One source-specific roasted flour description. It does not establish identity or interchangeability with Niru's ambiguous `Roasted Mong Flour`. Do not transfer its split/dehulled process to Niru. |
| Generic mung-bean flour | A separate, previously reviewed candidate. OQLF's French base term is species-ambiguous, and the local French snack ingredient evidence is not a standalone flour label [S06–S09]. | Keep `candidate-mung-bean-flour` separate and held. Do not add `mung bean flour`, `moong flour`, or `green gram flour` as aliases to Niru's candidate. |

No reviewed source supports merging `mong` with an active reference solely by spelling. Do not assign Niru's item to *V. radiata*, *V. mungo*, `ingredient-ref-mung-beans`, `ingredient-ref-mung-bean-starch`, `ingredient-ref-mung-bean-sprouts`, `ingredient-ref-bean-thread-cellophane-noodles`, `ingredient-ref-urid-flour`, `ingredient-ref-roasted-urid-flour`, or `ingredient-ref-chana-sattu`.

## Current catalog, ledger, and picker state

The live package contains 1,455 ingredient references and 105 forms. Exact normalized display/alias checks found no active reference, form, or legacy candidate owning `roasted mong flour`, `roasted mong`, `roasted mung flour`, `mung bean flour`, `moong flour`, `green gram flour`, or `farine de haricot mungo`. The existing `candidate-roasted-mong-flour` ledger record remains `needs_clarification`; its measurement and substitution research states remain `not_yet_researched`. The separate `candidate-mung-bean-flour` is also `needs_clarification` [prior ledger evidence; see the generic flour review above].

| Existing owner | Current state | Keep separate from the candidate |
| --- | --- | --- |
| `ingredient-ref-mung-beans` | `mung beans / haricots mungo`, with `mung bean`, `green gram`, `golden gram`, and `haricot mungo` aliases; ledger identity is limited to *Vigna radiata*. No forms, density, or unit mappings. | Whole pulse, not flour or extracted starch. |
| `ingredient-ref-mung-bean-starch` | `mung bean starch / amidon de haricot mungo`; no aliases, forms, density, or unit mappings. Ledger identity remains `needs_clarification`. | Retain the existing starch wording; Niru's phrase “very fine grain starch” is insufficient to assign the product here. |
| `ingredient-ref-bean-thread-cellophane-noodles` | `bean thread cellophane noodles / nouilles à base de farine de haricot mungo`; no aliases or forms. | Finished noodles. The French display contains the phrase `farine de haricot mungo`; it is not a flour reference. |
| `ingredient-ref-mung-bean-sprouts` | `mung bean sprouts / germes de haricot mungo`; no aliases or forms. | Sprouts, not flour. |
| `ingredient-ref-urid-flour`, `ingredient-ref-roasted-urid-flour`, `ingredient-ref-chana-sattu` | Existing source-specific pulse-flour identities; no forms, density, or unit mappings. | Preserve the *Vigna mungo*/urd and roasted *Cicer arietinum* boundaries. Do not broaden them to `mong`, `mung`, or generic roasted gram. |

Picker behavior was reviewed against the current bilingual search implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It normalizes accents and punctuation, checks full word phrases, then falls back to partial matching. Replaying that behavior over the current reference and form files gives:

| Query | Current result |
| --- | --- |
| `roasted mong flour`; `roasted mung flour`; `mung bean flour`; `moong flour` | No result. |
| `farine de haricot mungo` | `bean thread cellophane noodles` only, because the phrase occurs within its French display. |
| `amidon de haricot mungo` | `mung bean starch`. |
| `haricot mungo` | Mung beans, mung-bean sprouts, mung-bean starch, and bean-thread cellophane noodles. |

The picker has no source-specific or species-conditional alias mechanism. Adding the unresolved French phrase as a normal alias would create a global assignment, while the phrase currently also occurs in the finished-noodle display.

## Bundled recipe audit

Every manifest-listed recipe file was checked: **114 recipes and 1,123 ingredient rows**. The scan covered all string fields and ingredient rows for `roasted mong flour`, `roasted mong`, `roasted mung`, `mung bean flour`, `mung flour`, `moong flour`, `green gram flour`, `farine de haricot mungo`, `amidon de haricot mungo`, `chana sattu`, `roasted Bengal gram`, `pottukadalai maavu`, `roasted urid flour`, `Hattai-ko`, and `mugikogashi`. It found **zero text matches**. Direct ingredient-reference links to the mung-bean, starch, noodle, sprout, chana-sattu, urid-flour, and roasted-urid rows also total **zero**. The manifest-ordered recipe corpus fingerprint at review time is `6da951379f244128afc89f9f0e347df7713928ba78cb6256937a637583410c5d`.

The recipe bundle therefore supplies no demand for an identity, alias, form, measure, or link for this product. The whole corpus scan does not imply that the products lack culinary use.

## Numeric, form, and substitution limits

- **Measures and density:** Add no density, cup or spoon mass, mass-volume conversion, or volume mapping. Niru's 450 g / 900 g package sizes and PTI's 800 g package size are retail net masses only.
- **Forms and process:** Add no dry, raw, split, dehulled, roasted, cooked, or flour/starch form. PTI's split/dehulled/roasted/milled sequence applies only to its listed product. Niru does not say whether it roasts beans before milling, roasts flour after milling, or extracts starch.
- **Conversions and yields:** Add no grain-to-flour yield, flour-to-starch equivalence, package yield, or conversion between Niru, PTI, generic mung flour, mung starch, or whole mung. No reviewed source supplies a reusable quantity relation.
- **Substitutions:** Add no global or contextual substitution to or from whole mung beans, mung-bean starch, bean-thread noodles, urid flour, roasted urid flour, chana sattu, chickpea flour, or other pulse flours. The two substitution-rule files contain no rules for the adjacent active references.
- **Recipe links:** Add or relink no recipe line. The recipe audit found no matching line or current direct link.

Reopen the candidate only when a current product specification or bilingual package identifies the botanical species, whether the product is whole-bean flour or extracted starch, the order of roasting and milling, and its French product name. A source-specific recipe may establish a recipe link only after that product identity is resolved.

## Source register

All web sources below were accessed on 2026-10-14. Proposal-local IDs are not ledger records.

| ID | Source and evidence used | Limit |
| --- | --- | --- |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S01` | Niru Enterprise Inc., [Roasted Mong Flour](https://niru.com/product/roasted-mong-flour/), product heading and description. Names the item, calls it a “very fine grain starch” made from “mong beans,” then refers to “this flour”; lists 450 g and 900 g package sizes and a Scarborough, Ontario address. | Does not identify species, whole-bean versus extracted-starch composition, roast/milling sequence, or French name. Package sizes are not cooking measures. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S02` | Niru Enterprise Inc., [Rice & Flour collection](https://niru.com/product-category/rice/), current product listings. Separately lists `Roasted Mong Flour`, `Urid Flour`, and `Urid Flour (Roasted)`. | Product listing only; does not define process or composition. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S03` | Niru Enterprise Inc., [All Products archive, page 4](https://niru.com/product-category/all-products/page/4/), current product names. Lists `Roasted Mong Flour` and `Roasted Mung` as separate products. | Names alone do not establish species or flour equivalence. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S04` | Niru Enterprise Inc., [Roasted Mung](https://niru.com/product/roasted-mung/), product heading and description. Calls the product roasted mung beans, lists a 450 g package, and gives the same Scarborough manufacturer address. | Supports a separate whole-bean product name, not a flour form, botanical species, or conversion. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S05` | Walmart Canada, [PTI Moong Flour](https://www.walmart.ca/en/ip/PTI-Moong-Flour/6000196867429), product description and key specifications. Describes split green gram, seed-coat removal, roasting, and grinding; lists an 800 g package and was marked out of stock at review. | Retail listing says suppliers provide details and Walmart does not separately verify them. This product-specific description does not identify Niru's product or support an equivalence; package size is not a recipe measure. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S06` | OQLF, [haricot mungo — *Vigna radiata*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082840/haricot-mungo), preferred term and English equivalents. Pairs *V. radiata* with `mung bean`, `green gram`, and `golden gram`. | Names the pulse, not roasted flour. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S07` | OQLF, [haricot mungo — *Vigna mungo*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo), note on the French term's two-species use and English equivalents `urd` / `black gram`. | Establishes a French-name collision, not a flour product name. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S08` | CFIA, [Organic seed and grain product codes, Chapter 07](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme), table rows for *V. mungo* and *V. radiata* grain. | Canadian commodity classification separates the species for grain; it is not a flour naming standard. |
| `WP02-ROASTED-MUNG-FLOUR-BOUNDARY-R113-20261014-S09` | Remix Snacks, [French product page](https://remixsnacks.ca/fr), Beanies ingredient declaration. Uses `farine de haricot mungo` for an ingredient in a multi-ingredient puff made with sorghum flour and carrot. | Supports the phrase as an ingredient declaration in a Canadian snack only; no species, standalone flour label, or roasted process is specified. |

## Decision boundary

Keep the broad WP02 Hattai-ko / other roasted-product checklist item open. Retain `candidate-roasted-mong-flour` and `candidate-mung-bean-flour` as separate unresolved ledger candidates. No active identity, alias, form, source record, recipe link, numeric mapping, conversion, yield, or substitution is proposed by this review.
