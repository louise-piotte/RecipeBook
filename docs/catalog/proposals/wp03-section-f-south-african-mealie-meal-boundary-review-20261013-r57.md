# WP03 Section F R57: South African mealie meal identity and Québec naming boundary

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Root accepted the identity hold on 2026-10-13. Keep South African mealie meal unallocated because a distinct Québec French display and a safe catalog boundary from broad cornmeal are not established. No reference, alias, or ledger candidate was added.
- **Scope:** South African `mealie meal` / `mielie meal`, including the source-described maize-meal grades. This review does not allocate prepared pap, maize rice, samp, maize grits, maize flour, hominy products, or other South African maize products.
- **Changes:** Root added a checked Section F disposition to the plan and roadmap and created a batch record. No catalog, forms, ledger, recipe, or generated data changed. No tests were needed for this documentation-only hold.

## Recommendation

Keep South African mealie meal as a documented, unallocated Section F candidate. Do not add a new reference, add `mealie meal` or `mielie meal` as aliases to cornmeal, or add `maize meal` as a global alias. Reopen when a Québec-facing French product label or terminology review distinguishes the South African meal grades from the broad existing `cornmeal / semoule de maïs` identity.

The evidence supports a real regional family of dry milled maize products. South African sources use `maize meal`, `mealie meal`, and `mielie meal`, and the official grading rule distinguishes meal grades from samp, maize rice, maize grits, and maize flour [S02–S04]. However, the OQLF defines *semoule de maïs* as dried ground maize with fine, medium, and coarse grinds, and lists `maize meal` only as a United Kingdom English term for that same broad identity [S01]. That broad French term is already the display on `ingredient-ref-cornmeal`. No reviewed Québec source establishes a different French name or a product boundary that lets a second row be selected safely.

The official South African education guide calls the product `Mielie Meal or mielie pap or maize meal`, but also lists pap/porridge as a use and describes a recipe ingredient as `quick-cooking cornmeal (maize meal)` [S04]. That is useful evidence of regional wording and of use in recipes, but it does not resolve whether `mielie pap` names the dry ingredient or the prepared food in a given context. Keep `mielie pap`, `pap`, and `putu` out of ingredient aliases. The current Canadian listing sells Iwisa Super Maize Meal and describes making pap/putu, confirming Canadian availability for one branded grade; its 1 kg package size is not a reusable measure [S05].

## Ownership and overlap audit

The live package currently contains 1,382 ingredient references, 100 forms, 63 legacy candidates, and 1,713 research-ledger records. The exact normalized candidate phrases `mealie meal`, `mielie meal`, `mieliemeel`, `maize meal`, `mealie pap`, and `mielie pap` have no active reference, form, or legacy-candidate owner. There is no dedicated mealie-meal proposal or candidate ledger record. The existing R54 samp review mentions mealie meal only as an adjacent grind boundary; R55 explicitly keeps generic `maize meal` off the maize-rice row. The Section F checklist at plan line 2594 calls for mealie meal to remain separate from maize rice/grits and cornmeal while its own allocation is unresolved.

| Existing owner | Current live scope and data | Boundary for this candidate |
| --- | --- | --- |
| `ingredient-ref-cornmeal` — `cornmeal / semoule de maïs` | `FLOUR_AND_STARCH`; English alias `corn meal`; no French aliases or attached forms; `defaultDensity: null`; `unitMappings: []`; ledger measurement and substitution states are `not_yet_researched`. | OQLF includes `maize meal` as a UK term for this broad dry-ground-corn identity and says its grind may be fine, medium, or coarse [S01]. That does not independently establish a South African product crosswalk, so do not merge or alias on this evidence alone. |
| `ingredient-ref-whole-kernel-corn-flour` — `whole-kernel corn flour / farine de maïs` | `FLOUR_AND_STARCH`; English aliases `makki atta` and `makki ka atta`; no forms, density, or unit mappings. | Do not use `farine de maïs` as a display for a new South African meal row. The phrase is already assigned, and a full picker query also returns the related masa harina, precooked corn-flour, and roasted-corn-flour identities. |
| `ingredient-ref-south-african-maize-rice` — `maize rice / maize rice` | `GRAIN_AND_CEREAL`; English alias `mealie rice`; no forms, density, or unit mappings. Ledger records no supported generic measure or substitution. | Keep mealie meal distinct from maize rice and from the already owned `mealie rice` wording. |
| `ingredient-ref-south-african-samp` — `samp / samp` | `GRAIN_AND_CEREAL`; no aliases or forms; no density or unit mappings. | South African specifications distinguish broken-kernel samp from mealie meal [S03]. Do not alias or merge them. |
| `ingredient-ref-hominy-grits` — `hominy grits / gruau de maïs` | `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. | Keep South African maize meal separate from this ground, alkaline-treated product. Do not use generic `grits` wording. |

The existing cornmeal ledger record is `ingredient-ref-cornmeal`; it relies on OQLF’s broad dry-grind definition and does not have a separate mealie-meal candidate. The ledger’s existing whole-kernel-corn-flour record also cites the OQLF French term *farine de maïs*, which is why that wording cannot serve as a second French label. Other mentions of `maize meal` in the ledger occur as contextual source wording for cornmeal, whole-kernel corn flour, or South African maize rice, not as a mealie-meal allocation.

## Picker consequences

Picker behavior was audited against `IngredientSearch.kt`, which prefers complete normalized word phrases across reference and form names before falling back to substring matches.

| Query | Current result |
| --- | --- |
| `mealie meal`, `mielie meal`, `maize meal` | No active result. |
| `cornmeal`, `corn meal`, `semoule de maïs` | `ingredient-ref-cornmeal` only. |
| `farine de maïs` | Four corn-flour-family results because the phrase appears in the whole-kernel flour display and longer related French names; it is not a safe new display. |
| `maize rice`, `mealie rice` | `ingredient-ref-south-african-maize-rice` only. |
| `samp` | `ingredient-ref-south-african-samp` only. |
| `hominy grits` | `ingredient-ref-hominy-grits` only. |

Adding a standalone row would make the two source-qualified meal spellings searchable, but a French query that accurately distinguishes this candidate has not been verified. Reusing `semoule de maïs` would redirect an established cornmeal phrase; using `farine de maïs` would collide with the existing flour family. Do not add generic `maize meal`, `cornmeal`, `corn meal`, `semoule de maïs`, `farine de maïs`, `mielie pap`, `mealie pap`, `pap`, or `putu` as aliases while the scope and Québec label remain unresolved.

## Recipe demand, forms, measures, and substitutions

The current split bundled corpus has 114 recipe files and 1,123 ingredient rows. Exact and neighboring searches for `mealie meal`, `mielie meal`, `maize meal`, `maize rice`, `mealie rice`, `samp`, `cornmeal`, `corn meal`, `semoule de maïs`, `farine de maïs`, `maize grits`, and `hominy grits` found no matching bundled ingredient line. There is no recipe link or bundle demand for this candidate.

The South African grading rule gives sieve-based class specifications for super-fine, super, special, sifted, and unsifted maize meal [S02]. These are product-class criteria, not household-volume conversions, densities, or transferable forms for one unqualified catalog identity. The official education guide includes 250 mL of quick-cooking cornmeal (maize meal) in one specific recipe [S04]; it gives no mass equivalent, and the recipe’s quick-cooking material and amount do not support a general unit mapping. The Canadian 1 kg package is SKU net mass, not a household measure [S05]. No general cooked yield or tested substitution for mealie meal was found. Keep forms, density, unit mappings, conversions, yields, recipe links, and substitutions empty.

## Sources

Sources were checked on 2026-10-13. The identifiers below are local to this proposal; no shared ledger record was added.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-SA-MEALIE-20261013-R57-S01` | Office québécois de la langue française, [*semoule de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), updated 2019; definition, grind note, and English terms. | Defines *semoule de maïs* as dried ground maize, allows fine, medium, and coarse grinds, and lists `maize meal` as a United Kingdom English term for the broad entry. It does not identify South African mealie meal as a separate Québec product or provide a distinct French label. |
| `WP03-SA-MEALIE-20261013-R57-S02` | South African Government, [Agricultural Product Standards Act: Regulations: Grading, packing and marking of maize products intended for sale in South Africa](https://www.gov.za/documents/agricultural-product-standards-act-regulations-grading-packing-and-marking-maize-0), Government Gazette No. 39613, 22 January 2016, regulations 3–4 and Annexure Table 1. | Lists samp, maize rice, maize grits, maize flour, and multiple maize-meal grades as separate regulated classes. Table 1 gives grade-specific sieve, fat, and fibre criteria. Supports the regional product family and distinctions among South African grades; regulatory particle-size criteria are not household measures or a Québec crosswalk. This was the latest official maize-products grading rule located in the government search; the separately found 2024 rule concerns maize grain, not these processed product classes. |
| `WP03-SA-MEALIE-20261013-R57-S03` | South African Department of Basic Education, [2024 NSNP Food Specification Guidelines](https://www.education.gov.za/Portals/0/Documents/Publications/2024%20NSNP%20Food%20Specification%20Guidelines.pdf), §3.5.1, printed p. 19 / PDF p. 18. | Defines samp as broken dried corn kernels that are not as finely ground as mealie meal. This supports the product boundary from samp; it does not define a French name or a household measure for mealie meal. |
| `WP03-SA-MEALIE-20261013-R57-S04` | South African Department of Basic Education, [Grade 9 Teacher Guide: Food Commodities](https://www.education.gov.za/Portals/0/Documents/Manuals/Occupational%20Subjects/Grade%209/Grade%209%20TG%20FOOD%20COMMODITIES%20FINAL%2023%20NOV.pdf), pp. 5 and 17. | Page 5 uses `Mielie Meal` and `maize meal` for a relatively coarse maize flour and lists mealie rice separately; page 17 has a single recipe calling for 250 mL quick-cooking cornmeal (maize meal). Its terminology is an educational description rather than a regulatory definition, and its use of `mielie pap` alongside the product term leaves the prepared-food boundary unclear. The recipe quantity is source-specific only. |
| `WP03-SA-MEALIE-20261013-R57-S05` | South African Store, Canada, [Iwisa Super Maize Meal, 1 kg](https://southafricanstore.ca/products/iwisa-super-maize-meal-1-kg), current imported product listing. | Confirms Canadian availability of one South African maize-meal grade and describes its use for pap/putu. The net package size and brand-specific product copy do not establish a general unit mapping or French catalog name. |
| `WP03-SA-MEALIE-20261013-R57-S06` | Allem Brothers, [Maize Mill](https://allems.co.za/maze-mill/), current manufacturer product range. | Lists Super and Special Maize Meal separately from Mealie Rice, Putu, and Samp. Supports the regional product lineup; its package/bale sizes are not household measures, and it does not provide a Québec French term. |

## Outcome

Keep the mealie-meal family unallocated pending a Québec French product-term review. Preserve the exact distinctions from samp, maize rice, maize grits, and maize flour supported by South African sources, while retaining the existing cornmeal and whole-kernel corn-flour owners. No active reference, alias, form, measurement, density, unit mapping, recipe link, conversion, yield, or substitution is proposed.

## Root integration result

Accepted as a hold. The active `ingredient-ref-cornmeal` owner remains unchanged, and no new reference, alias, form, legacy candidate, or ledger record was added. The Section F and roadmap checklists now link to this disposition. See [`wp03-section-f-south-african-mealie-meal-hold-integration-20261013/README.md`](../batches/wp03-section-f-south-african-mealie-meal-hold-integration-20261013/README.md).
