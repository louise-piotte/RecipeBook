# WP02 A6 R743 — fonio-flour measurement review — 2026-10-18

- **Status:** Integrated. The existing fonio-flour ledger row now records measurement research as `researched_no_supported_value`, with two source records, one decision, and the existing Aga source refreshed in place. No active catalog or recipe data changed; root updated the plan, roadmap, workflow, and batch integration README.
- **Checklist fit:** The broad [Section A6 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1827) remains open. The nested [R722 checkpoint](wp02-a6-next-open-gap-review-r722-20261018.md) explicitly leaves measurement research on `ingredient-ref-fonio-flour` unreviewed. The latest [R740–R742 checkpoint](../batches/wp02-wp03-wp04-r740-r742-gap-review-integration-20261018/README.md) concerns black quinoa flour, cooked millet, and Pacific cod; it contains no later measurement review of this fonio-flour row.
- **Scope:** Review whether the existing white-fonio flour identity has a transferable household mass/volume measure or density. Do not reopen identity, names, aliases, R722 substitution evidence, or other fonio products.
- **Recommendation:** Close this measurement review as `researched_no_supported_value`. The study reports laboratory bulk densities for market-sourced Acha whose species is unspecified. Current *Digitaria exilis* flour pages provide cup-only use instructions, without a verified paired gram amount. Do not add a measurement observation, density, unit mapping, form, yield, recipe link, or conversion.
- **Proposal-local source IDs:** `WP02-A6-FONIO-FLOUR-MEASURE-R743-20261018-S01` and `...-S02`. Both were absent from the current ledger; neither has an existing owner.

## Current target state

The current package has **1,848 ingredient references and 178 forms**; its manifest lists **114 recipes and 1,123 ingredient rows**. The current research ledger has **2,235 records and 10,491 source entries**.

| Surface | Current state | R743 disposition |
|---|---|---|
| Active reference `ingredient-ref-fonio-flour` | `fonio flour / farine de fonio`, category `FLOUR_AND_STARCH`; sole English alias `acha flour`; null `defaultDensity`; empty `unitMappings`. | Keep identity, displays, alias, category, and all active values unchanged. |
| Target ledger row | Identity `verified`; `measurementState: not_yet_researched`; `substitutionResearchState: researched_supported`; one R722 substitution finding; no measurement observations. | Change only the measurement research state. Preserve all R722 substitution data and other existing evidence. |
| Forms, rules, and yields | No fonio flour form, active global/contextual substitution rule, or package yield targets the row. | Add none. |
| Existing Canadian source ownership | The Aga’s Wholesome URL is already owned on this row by `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S04` and `WP02-S93`. | Do not create another owner for that URL. Refresh `WP02-S93` in place to include its current volume-only recipe instruction. |

The prior [fonio identity boundary review](wp02-fonio-flour-identity-boundary-review-20261011.md) scopes this generic flour row to white fonio, *Digitaria exilis*. Black fonio flour remains a separate reference. R743 does not broaden or rename either identity.

## Measurement evidence and limits

Sobowale, Omotoso, and Agbawodike report functional properties for native and fermented Acha flour in [“Effect of fermentation duration on microstructure and quality of acha flour and its cookies acceptability”](https://www.nature.com/articles/s41538-024-00353-z), *npj Science of Food* 9, 7 (2025), [DOI 10.1038/s41538-024-00353-z](https://doi.org/10.1038/s41538-024-00353-z). Table 1 gives native Acha flour loose bulk density as **0.57 ± 0.00 g/mL** and tapped bulk density as **0.84 ± 0.01 g/mL**. The methods say bulk density was determined by the method of Adeleke et al.; the article does not reproduce the measurement protocol. The native flour was made from grains purchased at Mile 12 Market in Lagos, winnowed, washed/desstoned, dried at 45 °C, attrition-milled, and sieved through 50 μm. The article describes Acha as *D. exilis* and *D. iburua* but does not identify which species was used for the purchased study sample. These sample-specific loose/tapped laboratory values therefore do not establish density for the target’s white *D. exilis* flour, or a kitchen fill convention.

Two current product pages supply species-resolved but volume-only instructions:

- Nafajama’s [White Fonio Flour page](https://nafajama.com/product/premium-quality-all-natural-white-fonio-flour/) identifies the flour as white fonio (*Digitaria exilis*) and says to use **¼ cup** as part of a flour blend. The accessible page text gives no gram mass paired with this amount. Package weights are not portion weights. Its Nutrition Facts is embedded as an image; I could not verify any mass/volume pair from that image, so I do not claim its contents are absent.
- Aga’s Wholesome’s [Canadian Fonio (Acha) Flour page](https://www.agaswholesome.ca/products/fonio-flour) identifies 100% ground, dehulled *D. exilis* and gives a pancake formula using **¾ cup** fonio flour. Its listed 400 g is the package size, not the recipe amount; the accessible page text does not pair the recipe measure with a gram mass.

Thus, within these reviewed primary/product sources, a species-resolved cup instruction exists, but **no species-resolved household mass/volume pair was verified**. The R743 hold is specifically on a reusable gram-per-cup measure or density. Do not convert either cup instruction to grams or use the Acha study densities as a substitute.

## Source ownership and proposed ledger delta

| Source ID | URL and current owner | R743 use |
|---|---|---|
| `WP02-A6-FONIO-FLOUR-MEASURE-R743-20261018-S01` (new) | [Nature article](https://www.nature.com/articles/s41538-024-00353-z); no matching article URL, DOI, or source ID owner was found in the current ledger/archive. | Cite the study’s native-Acha loose/tapped values, sample preparation, cited method, and unresolved species. Keep the values out of target measurement observations. |
| `WP02-A6-FONIO-FLOUR-MEASURE-R743-20261018-S02` (new) | [Nafajama product page](https://nafajama.com/product/premium-quality-all-natural-white-fonio-flour/); no matching URL or source ID owner was found in the current ledger/archive. | Cite its species-resolved ¼-cup use instruction and the absence of a paired gram mass in accessible page text. Do not infer the inaccessible nutrition-image contents. |
| `WP02-S93` (existing; same target row) | [Aga’s Wholesome product page](https://www.agaswholesome.ca/products/fonio-flour); URL is also owned by existing source `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S04` on this row. | Refresh `WP02-S93` in place: set `accessedOn` to `2026-10-18`; locator to the product description, “How to Use” pancake line, and ingredients; supports to note dehulled *D. exilis*, its ¾-cup pancake instruction, and that the 400 g package size is not paired with the recipe quantity. Do not add another source record for this URL. |

Append the two new source records above and one accepted decision to `ingredient-ref-fonio-flour`; update `WP02-S93` in place as described. Set only `measurementState` to `researched_no_supported_value`. Keep `measurementObservations` with no entries; preserve `substitutionResearchState: researched_supported`, the R722 finding, all other sources, and all identity decisions. No active reference or recipe data change is proposed.

The decision should state that the article’s Acha sample is not species-resolved and its bulk-density method is only referenced, while the current *D. exilis* product instructions provide cup amounts without a verified paired mass. These sources do not support a reusable mass/volume measure or default density. Cite S01, S02, and the refreshed existing `WP02-S93` source ID.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches reference names and aliases and includes attached form terms. This proposal changes no picker fields, so these current results remain unchanged:

| Query | Current matching references | R743 effect |
|---|---|---|
| `fonio flour` | Black fonio flour; generic fonio flour | No change |
| `farine de fonio` | Black fonio flour; generic fonio flour | No change |
| `acha flour` | Generic fonio flour | No change |
| `fonio` | Black fonio; black fonio flour; generic fonio flour; precooked fonio; white fonio | No change |
| `acha` | Generic fonio flour; white fonio | No change |

## Recipe-corpus scan

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. No file or ingredient row contains either `ingredient-ref-fonio-flour` or `ingredient-ref-black-fonio-flour`, nor the whole-word terms `fonio`, `fonio flour`, `farine de fonio`, `fonio blanc`, `fonio noir`, `acha`, or `acha flour`. A substring-only `acha` search can match “sriracha”; it is unrelated. No bundled recipe supports a recipe link, portion, conversion, or substitution.

## Review checks

- Verified the Section A6/R722 open item against the current plan, roadmap, workflow, R740–R742 checkpoint, target catalog row, forms, rules, yields, and ledger.
- Rechecked online publisher and manufacturer pages and audited current source URL/ID ownership. New source IDs and the proposed filename are unique.
- Recomputed the picker projection from the current references/forms and the normalizer/search behavior in `IngredientSearch.kt`.
- Scanned every manifest-listed recipe and ingredient row; no relevant corpus use was found.
- Checked relative links in this proposal, UTF-8 without BOM, trailing whitespace, and mojibake markers. No software tests, build, emulator run, or deployment were performed; this is a proposal-only review.

The broader Section A6 checklist remains open. Integration closes only the generic fonio-flour measurement evidence question.
