# WP03 Section M — generic melon naming review

- **Reviewed:** 2026-10-19
- **Status:** proposal only; recommend holding active catalog changes.
- **Scope:** generic fresh melon identity and Québec French naming for melon, melon brodé, and cantaloupe/cantaloup. The review excludes named cultivars and commercial-product rosters.
- **Plan anchor:** [Resolve generic melon/cantaloupe naming, plantain ripeness, cherry subtype, and cooking-class boundaries](../../RecipeBook-global-ingredient-catalog-plan.txt#L6982).

## Recommendation

Hold on adding a generic `melon / melon`, `melon brodé / netted melon`, or `cantaloupe / cantaloup` identity or alias. Preserve the existing nearby references and their scoped names. The OQLF supports the terms and documents their overlap, but the bundled library contains no melon or cantaloupe ingredient line to show which generic identity a recipe needs. The Section M checklist says to make this boundary decision when source and recipe evidence supports a separate identity; current recipe demand is absent.

Do not place bare `melon`, `cantaloup`, or `cantaloupe` on watermelon, winter melon, bitter melon, or their seed products. If a bundled recipe later calls for bare melon, assess a generic `melon / melon` row under the OQLF term. If it says cantaloupe/cantaloup or melon brodé, retain the recipe’s exact phrase and resolve whether it means the common North American netted melon or the distinct fruit that OQLF calls cantaloup before assigning a row or alias.

## Current catalog and recipe state

The read-only snapshot contains 1,939 ingredient references, 203 forms, and 114 manifest-listed recipes with 1,123 ingredient rows.

| Artifact | Current state | Disposition |
|---|---|---|
| Generic melon and cantaloupe | No active reference or form has the exact generic display or alias `melon`, `melon brodé`, `netted melon`, `cantaloupe`, or `cantaloup`. No matching legacy candidate or separate research-ledger candidate is present. | Add none without recipe demand. |
| Bitter melon | `ingredient-ref-bitter-melon`: English `bitter melon`, French `margose`; French aliases include `melon amer` and `courge amère`. | Preserve the named bitter-melon identity and its aliases. Do not add bare `melon`. |
| Watermelon | `ingredient-ref-watermelon`: `watermelon / melon d’eau`, with `pastèque` as a French alias. | Preserve as a distinct fruit identity. |
| Watermelon seed products | Separate references for watermelon-seed flour and dried watermelon-seed kernels. | Keep seed products separate from fresh melon naming. |
| Winter melon | `ingredient-ref-winter-melon`: `winter melon / melon d’hiver`, with specific French and English aliases. | Preserve as a distinct vegetable identity; do not add bare `melon`. |
| Forms | No current form matches these terms. | Add none. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; no ingredient line or stored text names melon, melon brodé, cantaloupe, or cantaloup. | No relink, form, or identity demand is present. |

The literal `melon` search surface is already shared by several specific active names and aliases, including bitter melon, watermelon and its seed products, and winter melon. This reflects their explicit names, not synonymy. No active row owns the exact bare query as an alias.

## Québec terminology and boundary evidence

The OQLF entries support precise French names while explaining why a generic English/French `cantaloupe / cantaloup` mapping is unsafe without recipe context:

| ID | Source and relevant evidence | Limit |
|---|---|---|
| **S01 — WP03-M-GENERIC-MELON-NAMING-R916-20261019-S01** | OQLF, [melon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084072/melon). The preferred French term is `melon`; the English equivalent is `melon`, and the entry gives *Cucumis melo*. This supports the generic bilingual wording if a future recipe requires that broad fruit identity. | The entry is broad and its notes include several kinds of melon. It does not show which specific fruit an unqualified bundled recipe would mean. |
| **S02 — WP03-M-GENERIC-MELON-NAMING-R916-20261019-S02** | OQLF, [melon brodé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8352909/melon-brode). Preferred Québec terms are `melon brodé` and `melon musqué`; English terms include `netted melon`. The note says `cantaloup` in French and `cantaloupe`/`cantaloupe melon` in English are commonly used in North America for melon brodé, even though the OQLF treats cantaloup as another fruit. | This documents common regional usage and a distinct terminological meaning; it does not establish that an unqualified recipe uses the preferred term’s stricter category. |
| **S03 — WP03-M-GENERIC-MELON-NAMING-R916-20261019-S03** | OQLF, [cantaloup (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8352910/cantaloup). Preferred French terms are `cantaloup` and `melon cantaloup`; the English equivalent is `cantaloupe`; the entry gives *Cucumis melo* var. *cantalupensis*. Its note also records common North American use of cantaloup/cantaloupe for melon brodé. | The same term has a strict fruit meaning and a common North American meaning for another melon. No cultivar-level research is used here. |
| **S04 — WP03-M-GENERIC-MELON-NAMING-R916-20261019-S04** | OQLF, [melon d’eau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297115/melon-deau). The preferred Québec terms are `melon d’eau` and `pastèque`, with English `watermelon`; its note distinguishes it from cantaloup and melon brodé. | Supports keeping the existing watermelon row separate; it does not establish a generic melon alias. |

No brand, product-line, flavour, SKU, or retailer sources or counts were researched. Such commercial-only counts would not add generic ingredient diversity and remain out of scope. Existing seed and flour identities remain unchanged and do not supply fresh-fruit naming evidence.

## Reopen criteria

Reopen when a bundled or otherwise accepted recipe line names `melon`, `melon brodé`, `cantaloupe`, or `cantaloup`. Use the exact source wording and its recipe context to decide whether it refers to a generic melon, the North American netted melon commonly called cantaloupe, or the distinct fruit called cantaloup by OQLF. Keep the Québec preferred display `melon brodé` available if that fruit is established; do not use `cantaloup` or `cantaloupe` as an unscoped alias across both meanings. Preserve watermelon, winter melon, bitter melon, and seed-product identities.

The source IDs in this proposal are citations only; this proposal does not add ledger records or change shared catalog data.


## Root integration decision

Accepted as a hold. No generic melon/cantaloupe identity, alias, or form was added because the recipe bundle has no matching line and the OQLF evidence records an ambiguous common North American term. Existing watermelon, winter melon, bitter melon, and seed-product identities remain unchanged. The Section M parent remains open. See the [R913–R916 integration README](../batches/wp03-r913-r916-generic-boundary-integration-20261019/README.md).
