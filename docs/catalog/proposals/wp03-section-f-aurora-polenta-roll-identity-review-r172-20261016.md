# WP03 Section F: Aurora plain polenta roll identity review (R172)

## Reviewer recommendation and integration disposition

**Reviewer recommendation:** Integrate one product-specific identity: `Aurora plain polenta roll / polenta nature en rouleau Aurora`, category `GRAIN_AND_CEREAL`. Keep generic `polenta`, ordinary dry polenta products, and the existing cornmeal and grits identities separate. This recommendation covers the Canadian Aurora product CRPF-998 (UPC 0061659002739) only; it does not resolve the ledger's generic-polenta hold or assign bare `polenta` to this product.

**Root integration disposition:** Hold this SKU outside active references and forms. The two Acema source records are now allocated to the existing `ingredient-ref-polenta` candidate's unresolved decision. The evidence establishes one Canadian brand/SKU, and the recipe manifest has no polenta demand. Creating a row would make this lone SKU a picker result for broad `polenta` and `plain polenta` searches while the generic candidate remains unresolved. Reopen on an exact recipe/product request or independent evidence for a stable broader product category. No active identity, alias, measurement, or recipe link was added.

The live Section F checklist still leaves the broader polenta and related corn-product review open ([plan lines 3338–3358](../../RecipeBook-global-ingredient-catalog-plan.txt#L3347)). The prior boundary review held bare `polenta` because it can mean an OQLF-defined prepared dish or different dry retail products ([generic boundary review](wp03-polenta-grits-product-boundary-review-20261011.md)). The Aurora item is a narrower, separately packaged product with a bilingual Canadian listing and a defined ready-to-slice state.

## Evidence and identity boundary

Acema's bilingual catalog pages identify the same product code and UPC, Canadian origin, and 500 g package. The English page titles the product **Traditional plain polenta** and lists its ingredients, but does not describe a roll. The French page titles it **Polenta nature en rouleau** and says it is pre-cooked, molded into a cylinder, and ready to slice. Both pages list water, cornmeal / semoule de maïs, salt, tartaric acid, and sorbic acid. The paired pages establish that the English title and French roll description belong to the same SKU; the roll description itself is on the French page.

Keep this row separate from:

- the prepared polenta dish in OQLF's existing `WP03-S143` source;
- dry cornmeal / `semoule de maïs`, including coarse grind, which remains `ingredient-ref-cornmeal` ([active reference](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L4571));
- ordinary corn grits / `semoule de maïs de type grits` and hominy grits / `gruau de maïs` ([active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L4444), [hominy grits](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L8552));
- TIPIAK's dry, precooked corn semolina or Bob's Red Mill's dry, coarsely ground corn products previously cited in the generic-polenta boundary review; and
- home-cooked polenta or any other brand / package state.

Do not use this row for a recipe line that says only `polenta`; inspect whether that line means a prepared dish, a dry product, or a specified refrigerated roll.

## Reviewer-proposed delta (not integrated)

Add this proposal-local, unallocated reference row only:

```json
{
  "id": "ingredient-ref-aurora-polenta-roll",
  "nameFr": "polenta nature en rouleau Aurora",
  "nameEn": "Aurora plain polenta roll",
  "aliasesFr": [],
  "aliasesEn": ["Traditional plain polenta"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

The French display follows the product's named roll. The English display combines the listed English product name with the page's explicit roll description and brand; the only English alias preserves the exact English product-page title. Do not add bare `polenta`, `polenta nature`, `plain polenta`, `traditional polenta`, `semoule de maïs`, or `cornmeal` as aliases. The generic `ingredient-ref-polenta` candidate remains `needs_clarification` ([ledger record](../research-ledger.v1.json)); root added the Acema sources and SKU-specific unresolved hold to that record. If the proposed reference is integrated later, add a separate `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and an appropriate substitution status; keep the generic candidate unresolved.

## Ownership, picker, and recipe effects

At proposal review time, the live seed had 1,547 ingredient references and 119 forms. No active reference display or alias owned `polenta`, `polenta nature en rouleau`, `Aurora plain polenta roll`, or `CRPF-998`; no form or legacy-import candidate owned them. The generic-polenta owner is ledger-only. Existing names remain distinct: cornmeal owns `cornmeal / semoule de maïs` and alias `corn meal`; corn grits owns `corn grits / semoule de maïs de type grits`; hominy grits owns `hominy grits / gruau de maïs`; hominy corn and masa harina retain their separate displays. The proposed ingredient ID remains unallocated in the active seed, ledger, and legacy identities. The two Acema URLs and source IDs are now registered on the generic-polenta ledger candidate as evidence for the hold, not as support for an active ingredient row.

`IngredientSearch.kt` normalizes case, accents, and punctuation, prefers complete phrase matches, then falls back to substring matches ([search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L8)). With the proposed displays and no aliases, `polenta nature en rouleau` and `Aurora plain polenta roll` expose the product-specific row; a short `polenta` query also finds it because that word occurs in both displays. The picker label itself keeps the roll and Aurora qualification visible. This projection is a manual search result, not an automatic normalization rule for bare `polenta`.

I scanned every recipe file listed in the live manifest: **114 recipes and 1,123 ingredient rows**. There are zero ingredient-line hits, zero ingredient-reference links, and zero recipe-text hits for polenta, this product name/code, or related cornmeal/grits wording. Therefore add no recipe link and treat the new row as picker-only catalog coverage.

## Measures, forms, and substitutions

Add no forms, density, unit mapping, default measure, conversion, yield, or substitution. The 500 g figure is the package format, not a recipe portion or reusable product measure. The source gives no ingredient-component weights, volume relation, or dry-to-roll yield. The pre-cooked roll is a distinct packaged product identity; it does not establish a general cooked form of cornmeal or generic polenta. No global or contextual substitution is supported, and no recipe demand requires one.

## Source register

The two Acema source IDs below are now allocated to the existing `ingredient-ref-polenta` ledger candidate and its unresolved hold decision. They support the documented SKU boundary only; no separate active ingredient-reference record was created. The proposed reference ID remains unallocated.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-AURORA-POLENTA-R172-20261016-S01` | Acema, [Polenta nature en rouleau](https://www.acema.ca/fr/produits/crpf-998), product CRPF-998 / UPC 0061659002739; accessed 2026-10-16. | French name, Canadian origin, 500 g format, ingredients, and pre-cooked cylindrical roll ready to slice. Product-specific distributor listing. |
| `WP03-AURORA-POLENTA-R172-20261016-S02` | Acema, [Traditional plain polenta](https://www.acema.ca/en/products/CRPF-998), product CRPF-998 / UPC 0061659002739; accessed 2026-10-16. | English title, Aurora product context, same package/UPC, and ingredients. The English page does not itself describe a roll; the paired French page does. Product-specific distributor listing. |
| Existing `WP03-S143` | OQLF, [polenta](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557111/polenta). | Existing ledger source defines the prepared dish; it supports keeping the generic dish meaning outside this packaged roll identity. |
| Existing `WP03-S144` | OQLF, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais). | Existing ledger source defines the dry milling product and its grind range; it remains the cornmeal term, not an alias for the Aurora roll. |

The reviewer recommendation was not integrated. Root allocated the two source records above to the existing unresolved generic-polenta candidate and recorded the hold disposition; no active reference or form was added. No tests or builds were run.
