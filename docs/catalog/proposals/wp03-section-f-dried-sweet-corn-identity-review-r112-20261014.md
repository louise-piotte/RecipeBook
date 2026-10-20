# WP03 Section F: dried sweet corn identity review (R112)

## Packet record

- **Reviewed:** 2026-10-14.
- **Status:** Integrated on 2026-10-14 as an identity-only reference and ledger entry. See the [R112 integration README](../batches/wp03-section-f-dried-sweet-corn-identity-integration-20261014/README.md). The proposal's source snapshot and review findings below describe the pre-integration state.
- **Scope:** the dried-sweet-corn candidate in the open Section F inventory. The existing pearled-hominy, pozole-corn, and ordinary-grits decisions remain separate.
- **Disposition:** the product boundary and a defensible Canadian French display are now supported. Recommend one identity-only row for dried sweet-corn kernels, subject to coordinator integration: **`dried sweet corn kernels / maïs sucré séché`**, category `VEGETABLE_AND_AROMATIC`, suggested ID `ingredient-ref-dried-sweet-corn-kernels`. Keep aliases, forms, measures, density, conversions, yields, recipe links, and substitutions empty.

## Change from the earlier hold

The earlier [2026-10-10 dried-sweet-corn boundary review](wp03-section-f-dried-sweet-corn-boundary-review-20261010.md) accepted the product concept but held integration because it could not verify a Québec-facing dried-product name. New Canadian French usage closes that naming gap enough for a narrow identity-only row:

- A Canada-focused French consumer guide explicitly uses **maïs sucré séché** for the detached kernels it dehydrates, and distinguishes sweet corn from grain corn used for meal or polenta [S07]. The guide is not an OQLF terminology ruling; its wording is direct culinary usage.
- Walmart.ca's French-language listing names a whole freeze-dried product **Maïs sucré lyophilisé**. The listing says the product is whole and sweet, but was out of stock when checked and reports no reviews; it establishes retail wording, not current availability or Québec-market prevalence [S08].
- OQLF directly prefers **maïs sucré** for sweet corn and says it is sold as kernels as well as fresh ears and canned kernels. It does not name the dried product [S02].

Use **maïs sucré séché** as the fr-CA display. It appears in Canadian French culinary use and remains broader than the process-specific retail wording *maïs sucré lyophilisé*. Keep `lyophilisé` out of aliases so the row can cover air-dried and freeze-dried whole kernels without claiming those processes are interchangeable in a recipe.

## Plan and prior-review mapping

The live plan still has the aggregate “Grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates” item open at [plan line 2874](../../RecipeBook-global-ingredient-catalog-plan.txt#L2874). Its earlier focused dried-sweet-corn review is recorded at [plan line 2978](../../RecipeBook-global-ingredient-catalog-plan.txt#L2978). This packet revisits only that candidate and does not close the aggregate item. The latest [roadmap checkpoint](../../../roadmap.md#L832) is WP03 Section F R111; Section F remains open.

The [hominy-grits identity record](../batches/hominy-grits-identity.md), [hominy-grits Québec display review R111](wp03-section-f-hominy-grits-quebec-display-review-r111-20261014.md), [ordinary corn-grits boundary review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md), and [pozole/pearled-hominy review](wp03-section-f-pozole-corn-boundary-review-20261010.md) remain unchanged.

## Product identity and processing boundary

The candidate is kernels of sweet corn separated from the cob and dehydrated for dry storage or later use. Sweet corn is a specific maize type, not simply any mature dry field-corn kernel: CFIA distinguishes sweet corn from dent, floury, and popping types, and OQLF describes sweet corn as harvested immature for fresh table use and notes kernel sales [S01–S03]. Drying changes the product's moisture and use state while retaining its sweet-corn identity.

Air/tray-dried sweet-corn kernels are documented in a recent primary study; a Canadian primary-study abstract also reports acceptable air-dried and freeze-dried sweet corn. A current Canadian seller lists freeze-dried whole kernels, and a food-grade supplier documents machine-dried whole sweet corn [S04–S06, S08–S09]. The processing evidence supports the bounded dry-kernel product class. It does not support treating all dried corn as sweet corn, or assigning cooking, rehydration, or milling equivalence across drying methods.

| Neighbor | Current owner or status | Boundary decision |
| --- | --- | --- |
| Generic `corn kernels / maïs` | Active `ingredient-ref-corn-kernels`, `VEGETABLE_AND_AROMATIC`; aliases empty, density null, unit mappings empty | Keep the broad kernel row. It currently owns the recipe's frozen-kernel ingredient. Do not add dried sweet corn as an alias or form: the candidate specifies both sweet-corn type and a dry product. |
| Mature dry field/grain corn | No broad dry-field-corn identity is established by this review | Keep unqualified `dried corn` and `maïs séché` unresolved. Sweet corn and mature dent/grain corn have different type and culinary-use scopes [S01, S07]. |
| Whole-kernel hominy | Active `ingredient-ref-hominy-corn / maïs lessivé` | Keep separate: OQLF defines a preserved product made from fully developed dry corn placed in preserving liquid, with alkaline treatment described in its English note [S10]. |
| Hominy grits | Active `ingredient-ref-hominy-grits / gruau de maïs` | Keep separate as a ground hominy product. This candidate remains whole-kernel dry sweet corn. |
| Ordinary corn grits | Candidate remains unresolved under the [prior boundary review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md) | Keep separate as a ground product; do not use `grits` or `gruau de maïs` for dried sweet corn. |
| Cornmeal | Active `ingredient-ref-cornmeal / semoule de maïs`; English alias `corn meal` | Keep separate as a milled product. OQLF defines *semoule de maïs* as a milling of dried corn kernels [S11]. |
| Corn flours and masa harina | Active `ingredient-ref-whole-kernel-corn-flour`, `ingredient-ref-roasted-corn-flour`, `ingredient-ref-precooked-corn-flour`, and `ingredient-ref-masa-harina` | Keep separate as milled or nixtamalized products. “Whole-kernel” in the flour name describes its milling input, not a whole-kernel product. |

If integrated, `VEGETABLE_AND_AROMATIC` follows OQLF's food-vegetable treatment of sweet corn and matches the existing broad corn-kernels row. Do not create separate color, cultivar, air-dried, or freeze-dried identities on this evidence.

## Live seed, ledger, picker, and recipe audit

The current split seed has **1,453 ingredient references** and **105 ingredient forms**. The research ledger has **1,793 records**. No active dried-sweet-corn reference or corn-specific form exists. No `ingredient-ref-dried-sweet-corn-kernels` record or exact dried-sweet-corn candidate was found in the ledger. The older ledger-only `ingredient-ref-corn` remains a broad, unreviewed candidate and does not own this scoped product.

The picker projection follows the current `IngredientSearch.kt` phrase-first matching behavior over current displays, aliases, and form terms. It is a static ownership projection, not an emulator/UI test.

| Query | Current exact phrase owner(s) | Projection with the proposed row |
| --- | --- | --- |
| `dried sweet corn kernels`; `dried sweet corn`; `maïs sucré séché`; `maïs sucré` | None | Proposed dried-sweet-corn row only |
| `corn kernels` | `ingredient-ref-corn-kernels` | Existing corn-kernels row plus proposed dried-sweet-corn row; both labels state their scope |
| `corn` / `maïs` | 23 / 25 references | 24 / 26 references; broad crop-name searches remain multi-result |
| `hominy` | `ingredient-ref-hominy-corn`; `ingredient-ref-hominy-grits` | Unchanged |
| `hominy corn` / `maïs lessivé` | `ingredient-ref-hominy-corn` | Unchanged |
| `hominy grits` / `gruau de maïs` | `ingredient-ref-hominy-grits` | Unchanged |
| `cornmeal` / `semoule de maïs` | `ingredient-ref-cornmeal` | Unchanged |
| `corn flour` | Four references, including the three corn-flour identities and the `guinea corn flour` sorghum alias | Unchanged; no corn-flour alias is proposed |
| `dried corn`; `maïs séché` | None | None; keep the dry-field-corn ambiguity unassigned |

No aliases are needed for `dehydrated sweet corn`, `freeze-dried sweet corn`, `maïs sucré lyophilisé`, or `maïs doux séché`. The displays already match the source-backed base phrases; adding process or broad-crop aliases would enlarge picker ownership without resolving a recipe need.

The manifest lists **114 recipes** and **1,123 structured ingredient rows**. A normalized scan of all listed recipe JSON text and ingredient rows found **zero** hits for dried, dehydrated, or freeze-dried sweet corn and the reviewed French forms. The only direct kernel row is recipe 078's `1/2 cup frozen corn kernels`, owned by `ingredient-ref-corn-kernels`; recipe 044 asks for ears of corn. Other corn lines use starch or syrup. No dried-kernel recipe link, ingredient form, or substitution is supported.

## Numeric and substitution limits

Do not add a default measure, density, unit mapping, yield, conversion, cooking instruction, or substitution. The available numbers are method- or product-specific:

| Evidence | Numeric observation | Limit |
| --- | --- | --- |
| Current Canadian seller, Augason Farms freeze-dried sweet corn [S09] | `1/2 cup (19 g dry)`; 23 servings in the listed can | Retain only as a named-product serving observation. Do not transfer to air-dried kernels or set a reusable cup mapping/density. |
| Nayi et al. sweet-corn-kernel drying study [S04] | One *Madhuri* variety, initial moisture `75 ± 3.3%`; kernels were blanched and tray-dried at `55–70 °C`; the results section reports treatment-specific boiling-water rehydration ratios spanning `2.23–3.54` | The article's conclusion summarizes a narrower `2.56–3.54` range, inconsistent with the steam-blanched results (`2.23–3.13`). Treat the paper's detailed results as study-specific observations only; neither range is a kitchen conversion for other products. |
| Keful food-grade supplier page [S06] | Its listed whole-sweet-corn specification gives `8%` moisture | This is one supplier specification; it is not a universal dry endpoint or recipe ratio. |

The sources confirm that drying and rehydration behavior depend on processing. Keep all numeric fields empty/null and all substitution research inactive until a recipe or a product-specific use case justifies separate work.

## Proposed integration payload

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-dried-sweet-corn-kernels` |
| English display | `dried sweet corn kernels` |
| fr-CA display | `maïs sucré séché` |
| Category | `VEGETABLE_AND_AROMATIC` |
| Aliases | None |
| Forms, density, unit mappings, yields, conversions | None; density `null`, mappings empty |
| Recipe links, substitutions | None |

## Sources and access notes

Sources were opened or rechecked on 2026-10-14. The French display evidence supports a defensible Canadian/Québec-facing label; OQLF does not have a dedicated dried-sweet-corn term entry.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-DSC-R112-20261014-S01` | CFIA, [Biology of *Zea mays* L. (maize), French edition](https://inspection.canada.ca/fr/protection-vegetaux/varietes-vegetales/caracteres-nouveaux/demandeurs/directive-94-08/documents-biologie/zea-mays-lmais), table of corn types | Distinguishes sweet corn from dent, floury, and popping corn and describes the sugar/starch distinction. This is botanical/regulatory context, not a food-picker name standard. |
| `WP03-DSC-R112-20261014-S02` | OQLF, [maïs sucré](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082787/mais-sucre) | Preferred Québec term and English equivalent for sweet corn; explains immature harvest and kernel/canned use. Does not name dried kernels. |
| `WP03-DSC-R112-20261014-S03` | OQLF, [maïs en grains](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18057878/mais-en-grains) | Pairs *maïs en grains / kernel corn* and explicitly notes that sweet corn is sold in kernels. It does not name the dried product. |
| `WP03-DSC-R112-20261014-S04` | Nayi et al., [“Rehydration modeling and characterization of dehydrated sweet corn,” *Food Science & Nutrition* 11(6), 2023](https://onlinelibrary.wiley.com/doi/full/10.1002/fsn3.3303), DOI 10.1002/fsn3.3303 | Primary open-access study of pretreated sweet-corn kernels dried at multiple temperatures and rehydrated in boiling water. Supports the product/process and the treatment-dependent rehydration range; does not provide a universal home-cooking ratio. |
| `WP03-DSC-R112-20261014-S05` | Watson et al., [“Dehydrated Sweet Corn Quality,” *Canadian Institute of Food Science and Technology Journal* 12(1), 1979](https://www.sciencedirect.com/science/article/abs/pii/S0315546379730288), DOI 10.1016/S0315-5463(79)73028-8; [abstract record](https://eurekamag.com/research/005/100/005100224.php) | Indexed abstract text reports acceptable air-dried and freeze-dried products. The full article was not consulted, and direct page fetches were unavailable in this review; no detailed procedure, measurement, or kitchen quantity is inferred. |
| `WP03-DSC-R112-20261014-S06` | Keful Food Ingredients, [Dehydrated Sweet Corn](https://www.kf-food.com/dehydrated-vegetables/dehydrated-sweet-corn.html), product description/specification | Describes a human-food-grade whole-sweet-corn product made by threshing, cleaning, washing, and machine drying; the page lists an `8%` moisture target. Supplier specification only. |
| `WP03-DSC-R112-20261014-S07` | HarvestGuide.ca, [Comment déshydrater du maïs au Canada (maïs sucré ou maïs-grain)](https://www.harvestguide.ca/fr/blog/how-to-dehydrate-corn-canada/) | Canadian French culinary source, including Ontario, Québec, and B.C. context. Uses *maïs sucré séché* for dehydrated kernels and separates sweet corn from grain corn used for flour/polenta. It is a consumer method article with affiliate links, not a terminology or food-safety authority; its measures remain method-specific. |
| `WP03-DSC-R112-20261014-S08` | Walmart.ca, [Maïs sucré lyophilisé – Nutristore](https://www.walmart.ca/fr/ip/Ma-s-sucr-lyophilis-br-bo-te-de-conserve-no-10-Nutristore/6000199988644) | French-language Canadian retail listing uses the exact process-specific wording and identifies the food as whole and sweet. Listed out of stock with no reviews at access; page notes that some product details are supplied by manufacturers/third parties. Supports wording, not current availability or broad Québec-market prevalence. |
| `WP03-DSC-R112-20261014-S09` | Total Prepare Canada, [Augason Farms Freeze-Dried Sweet Corn](https://totalprepare.ca/products/augason-farms-freeze-dried-sweet-corn) | Canadian seller lists freeze-dried sweet corn, reconstitution use, and its own `1/2 cup (19 g dry)` serving. The measure belongs to that product and is not reusable by default. |
| `WP03-DSC-R112-20261014-S10` | OQLF, [maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive) | Defines preserved hominy from fully developed dry corn in preserving liquid and distinguishes it from plain dried sweet-corn kernels. |
| `WP03-DSC-R112-20261014-S11` | OQLF, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais) | Defines cornmeal as a milling of dried corn kernels; supports keeping a whole-kernel product separate from the milled output. |
| `WP03-DSC-R112-20261014-S12` | Prior repository evidence: [hominy-grits identity](../batches/hominy-grits-identity.md) and [ordinary corn-grits review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md) | Records the active ground-hominy identity and the separate unresolved ordinary-grits boundary; this review does not reassign either product. |

## Conclusion

The distinct identity is supported by sweet-corn type, whole-kernel presentation, and documented drying for food use. The earlier French-name hold can be lifted for the identity-only recommendation because **maïs sucré séché** now has Canadian French culinary usage, while the narrower *maïs sucré lyophilisé* is also present in a French Canadian retail listing. Keep the broader dry-corn phrase unassigned, preserve existing corn/hominy/grits/milling owners, and leave measurements and substitutions empty. The overall Section F checklist remains open.

## Coordinator source check

The coordinator opened the full Nayi et al. paper and confirmed that its Results section gives separate rehydration-ratio ranges for control, hot-water, steam, and microwave blanching. The steam-blanched values extend down to `2.23`, while the article's Conclusion begins its overall range at `2.56`. The corrected table above preserves this internal discrepancy; neither number is activated. The coordinator also confirmed the Canadian French guide's exact display phrase and its clear distinction between sweet corn and grain corn, and rechecked the CFIA corn-type distinction, OQLF base terminology, the current Walmart French listing, and the product-specific Canadian serving page.

## Coordinator integration

The proposed `ingredient-ref-dried-sweet-corn-kernels` row was added with the exact bilingual
displays and empty aliases, null density, and no mappings or forms. The ledger retains the source
records and only the product-specific Augason serving observation; no recipe link or active
rehydration/substitution behavior was added. The matching Section F child item is checked in the
catalog plan. The broader Section F checklist remains open. The integration README records package,
ledger, picker, recipe-corpus, encoding, and generated-index checks; no app tests were run because the
change only added database JSON data and its generated catalog entry.
