# WP02 coconut-flour product-boundary review

## Scope and decision

- **Review date:** 2026-10-10
- **Scope:** products currently marketed as coconut flour and their composition/process boundaries.
- **Disposition:** hold an unqualified active coconut-flour reference. Québec-market naming is clear, but current manufacturer and retailer descriptions apply the same English/French names to products with markedly different fat content and incompletely described processing.
- **Coordinator integration:** add a `needs_clarification` candidate record and its evidence to the research ledger. Do not add an active reference, alias, form, recipe link, measurement, conversion, yield, or substitution.

## Catalog and recipe audit

The audit covered 679 active references, 34 forms, 84 legacy candidates, 865 research-ledger records, and all 114 manifest-listed recipes (1,123 ingredient rows). Exact normalized checks found no owner for `coconut flour` or `farine de noix de coco` in the active references, forms, ledger, or legacy candidates. Neither phrase appears in a bundled recipe ingredient line or recipe text.

## Evidence and limits

| Source | Support and limits |
| --- | --- |
| [Svansø, Coconut Flour](https://svansoe.dk/en/product/kokosmel/) | The manufacturer calls its product coconut flour and says it is made from gently dried, grated coconut. Its page reports 65 g fat per 100 g for that specific product. This supports a full-fat grated product bearing the name; it does not define all coconut flour. |
| [Farm Boy, Organic Coconut Flour](https://www.farmboy.ca/products/farm-boy-organic-coconut-flour-1-kg/) | The Québec/Ontario retailer lists a finely milled Sri Lankan product and the bilingual ingredient wording `Organic Coconut Flour / Farine De Noix De Coco Biologique`; its nutrition table reports 1 g fat per 15 g. The page does not state the processing step that explains the difference. |

The two listings show a large product difference under the same broad name. The reported amounts are product-label observations only; they are not adopted as catalog measurements or used to infer an unreported extraction process. A single active row would make materially different products appear interchangeable, and the bundled recipes provide no wording to choose between them.

## Held boundary

Keep `coconut flour` and `farine de noix de coco` inactive until a recipe or product specification identifies the intended product state. Do not infer that every coconut flour is defatted, full-fat, dried grated coconut, copra flour, or a form of shredded coconut. Keep coconut milk powder and coconut flakes separate. Do not add a numeric value, form, conversion, yield, or replacement rule.

## Candidate ledger record

| Field | Value |
| --- | --- |
| Candidate ID | `ingredient-ref-coconut-flour` |
| Proposed English wording | `coconut flour` |
| Proposed Québec French wording | `farine de noix de coco` |
| Possible category | `FLOUR_AND_STARCH` |
| Identity state | `needs_clarification` |

## Source register

- `WP02-COCONUT-FLOUR-20261010-S01` — Svansø, Coconut Flour; accessed 2026-10-10.
- `WP02-COCONUT-FLOUR-20261010-S02` — Farm Boy, Farm Boy Organic Coconut Flour; accessed 2026-10-10.
