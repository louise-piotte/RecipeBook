# WP03 Section F residual candidate review — plain puffed corn

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Root review integrated. The candidate and product-specific serving evidence are now in the shared research ledger; no active catalog row or conversion was added. The Section F parent remains open.
- **Scope:** one uncovered Section F product candidate: plain, human-food puffed corn sold as a single-grain ingredient or cereal. This does not review branded/formulated corn cereals, cornmeal-based products, popcorn, or any earlier puffed-grain candidate.
- **Recommendation:** retain the product as an unallocated candidate. Current manufacturer evidence supports a real `puffed corn` product class, but the reviewed Québec French labels either map `maïs soufflé` to the existing popcorn identity or describe a different, multi-ingredient cereal. Do not create an active reference or alias until the plain product has a defensible Québec French name and a sufficiently clear boundary from popcorn.
- **Plan location:** the open Section F checklist still calls for “remaining puffed-grain candidates” at [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt#L1767). This packet does not reopen the ordinary corn-grits, dried-sweet-corn, pozole, or previously reviewed puffed-grain decisions.
- **Snapshot audited:** 942 active references, 53 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,205 ledger records, and 75 legacy candidates. Seed and proposal scans were read-only.

## Candidate and identity boundary

Two manufacturers identify a plain puffed-corn food product. Arrowhead Mills names a “Puffed Corn Cereal,” says it is made with puffed whole-grain yellow corn, and lists “Puffed Corn” as its ingredient [S01]. Grainwell separately offers “Puffed Corn” as a pure puffed whole-grain component and describes it as an alternative to traditional popcorn [S02]. A Canadian retailer lists the Arrowhead product with the ingredient “Organic puffed corn” [S03]. This supports a real food product that merits consideration under the open puffed-grain checklist.

The evidence does not establish a common puffing method, corn variety, or a definitive technical distinction from popcorn. Keep the candidate narrowly scoped to the source-described plain, whole-grain puffed-corn product; do not use it for cornmeal-based products, sweetened or coated breakfast cereals, flavored snacks, or ordinary popcorn. The English product wording is usable as research wording, but an active bilingual row is premature.

| Field | Review decision |
|---|---|
| Research name | `puffed corn` / `puffed corn cereal`, source wording only. |
| Possible future ID | `ingredient-ref-puffed-corn`; do not allocate. |
| Possible category if later accepted | `GRAIN_AND_CEREAL`. |
| fr-CA display | Unresolved. Do not use `maïs soufflé` or `maïs éclaté`: OQLF maps both to the existing popcorn concept [S04]. |
| `céréales de maïs soufflé` | Do not assign to the plain product from the reviewed evidence. Metro uses this title for a Gorilla Munch cereal whose current listed ingredients are whole-grain corn meal, corn meal, cane sugar, and sea salt [S05]. That listing establishes Québec wording for a formulated cereal, not for the plain puffed-corn product described by Arrowhead Mills. |
| `grain de maïs soufflé` | Do not activate yet. A Wakefield natural-food store lists this phrase among cereals, but gives no product detail or process, and the phrase contains the OQLF popcorn term [S06]. It does not settle the identity or picker boundary. |
| Aliases | None proposed. In particular, do not add `corn puffs`, `popped corn`, `maïs soufflé`, or `maïs éclaté`. The reviewed sources do not establish these as unambiguous names for this product. |
| Adjacent identities | Keep the candidate separate from active `popcorn / maïs soufflé`, corn flakes, cornmeal, tortillas, and puffed grains of other species unless a future product-specific review proves a different identity relationship. |

## Québec French and picker boundary

OQLF's entry (updated 2017) defines `maïs soufflé` as a snack made from corn kernels popped by heat in a closed container, lists `maïs soufflé` and `maïs éclaté` as preferred terms, and gives English `popcorn` [S04]. The live catalog already assigns the exact normalized key `mais souffle` to `ingredient-ref-popcorn`. Reusing `maïs soufflé` would create an exact key collision; using `maïs éclaté` would assign an OQLF popcorn synonym to a different candidate without evidence that it names this product.

The longer Québec retail title `céréales de maïs soufflé` is not a clean answer for this candidate: the cited Metro product's listed ingredients are corn meals, sugar, and salt rather than the single ingredient `Puffed Corn` on Arrowhead Mills' page [S01, S05]. The less specific local listing `grain de maïs soufflé` does not state composition or processing, so it cannot establish whether the item is a distinct puffed-grain product, popcorn, or another cereal product [S06]. Do not translate `puffed corn` mechanically or infer a picker name from either listing.

The application search folds accents and punctuation and matches complete phrases within longer terms before falling back to substring matching [the ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). If `céréales de maïs soufflé` were attached to a new row, a query for `maïs soufflé` would match both that row and popcorn. A longer qualified French name could still be useful, but this review found no product-specific Québec label that both names the plain puffed-corn product and resolves the overlap.

## Catalog, ledger, legacy, and recipe audit

The audit used the repository's accent-, ligature-, case-, and punctuation-folding key function from `tools/seed_package/bundled_seed_package.py` against active reference names/aliases, form labels/match terms, ledger IDs and identity decisions, legacy candidates, prior proposals, and all manifest-listed recipe files. The query set included `puffed corn`, `puffed corn cereal`, `puffed whole corn`, `puffed whole grain corn`, `corn puffs`, `puffed maize`, `maize puffs`, `céréales de maïs soufflé`, `grain de maïs soufflé`, `maïs soufflé`, and `maïs éclaté`.

| Search surface | Result |
|---|---|
| Active reference exact normalized keys | The only exact candidate-set match is `maïs soufflé` → `ingredient-ref-popcorn`. No exact key exists for the English candidate names, `céréales de maïs soufflé`, or `grain de maïs soufflé`. |
| Active forms | No matching corn-puff form label or match term. |
| Ledger and legacy | No puffed-corn candidate ID, identity decision, or legacy candidate. The existing popcorn ledger record remains attached to popcorn. |
| Prior focused proposals | No prior proposal for puffed corn or puffed maize. This candidate is distinct from the completed/reviewed puffed sorghum, barley, buckwheat, spelt, oats, rye, teff, quinoa, millet, amaranth, wheat, and rice work. |
| Manifest recipes | 0 of 114 recipe files and 0 of 1,123 ingredient rows matched the query set. No recipe link, amount, preparation, or source text should change. |

Snapshot hashes: references `99dd50dfaeca7ff39689aa5578db70cdfedefcb4aad73d4668ec2a9513205e46`; forms `540eba0619c98e5b8fed5a3e1e3c808dd7f9e511940b1271707c55d14daf987a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `bb13eba0d750f77065dd00436395cf3020069963991d49355215741d87fd6a94`; legacy candidates `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0`. The manifest-ordered recipe corpus digest is `0aaa33d4579a21d8960f35b5b3e46dfe88f803e3afd8970d092d52ff95b2a31c`.

## Measurements, forms, conversions, and substitutions

- **Forms:** do not add an `IngredientForm`. The product's puffed processing defines the candidate product; no bundled recipe requires a raw-to-puffed form relation.
- **Density and unit mappings:** leave unknown. Arrowhead Mills reports one product serving of 3/4 cup (14 g) [S01]. Do not generalize that brand-specific portion into a default density or volume mapping.
- **Measurements and yields:** add no serving observation, package yield, puffing yield, or cooked-state yield. Retail package weights are SKU facts, not ingredient conversions.
- **Conversions:** add no mass-volume conversion or raw-corn-to-puffed-corn ratio. The sources do not report a transferable method or yield.
- **Substitutions:** add no substitution to popcorn, puffed rice, puffed sorghum, or another cereal. Similar uses as cereal, snack, or mix-in do not establish equivalent texture, quantity, or recipe behavior.
- **Recipe links:** none; the bundled corpus has no matching demand.

## Source-to-claim register

Sources were opened on 2026-10-11. These source IDs are now recorded on the shared candidate entry `candidate-puffed-corn` in the research ledger.

| Source ID | Source and scope | Supports / does not support |
|---|---|---|
| `WP03-PUFFCORN-20261011-S01` | Arrowhead Mills, [Puffed Corn Cereal](https://arrowheadmills.com/products/cold-hot-cereals/puffed-corn-cereal/), product description, ingredient list, serving panel. | Manufacturer names a ready-to-eat puffed-corn cereal, says it is made with puffed whole-grain yellow corn, and lists `Puffed Corn` as the ingredient. The 3/4 cup (14 g) serving belongs to this product. The page does not specify a corn variety or enough process detail to establish a universal product standard. |
| `WP03-PUFFCORN-20261011-S02` | Grainwell, [Puffed Corn](https://grainwellfoods.com/product/puffed-corn/) and [company overview](https://grainwellfoods.com/), product and process descriptions. | Supplier markets Puffed Corn among pure puffed whole-grain components and describes it as an alternative to traditional popcorn. Supports a distinct supplier product class and use context. It is B2B evidence, not Québec consumer terminology or a full processing specification. |
| `WP03-PUFFCORN-20261011-S03` | Natura Market, [Arrowhead Mills Puffed Corn Cereal, 170 g](https://naturamarket.ca/arrowhead-mills-puffed-corn-cereal-170g.html), retailer product page. | Canadian retailer lists the Arrowhead SKU and ingredient `Organic puffed corn`; its page says it ships across Canada but showed the item out of stock during this review. It supports Canadian product listing only, not current local availability, Québec French wording, or a general measure. |
| `WP03-PUFFCORN-20261011-S04` | Office québécois de la langue française, [maïs soufflé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358440/mais-souffle), updated 2017. | Defines `maïs soufflé` as `popcorn`, lists preferred `maïs soufflé` and `maïs éclaté`, and limits the term to the popcorn concept. Terminology evidence only; it does not name the separate manufacturer product. |
| `WP03-PUFFCORN-20261011-S05` | Metro Québec, [Céréales de maïs soufflé biologiques, Gorilla Munch](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-mais-souffle-biologiques-format-familial/p/058449870081), French product title and ingredient list. | Uses the exact local phrase `céréales de maïs soufflé` for a packaged cereal. The listed ingredients are whole-grain corn meal, corn meal, cane sugar, and salt; this does not establish the plain single-ingredient candidate's display or composition. Product pages and formulas can change. |
| `WP03-PUFFCORN-20261011-S06` | La Forêt, Wakefield, Québec, [available bulk natural foods](https://www.la-foret.ca/product_francais.html), cereals category. | Lists `grain de maïs soufflé` among grains/cereals. The page provides no brand, ingredient statement, puffing process, or distinction from popcorn, so it is only a Québec phrase lead, not an approved display. |

## Disposition and evidence needed to resume

**Hold `puffed corn` as an unallocated Section F candidate.** Keep the active popcorn identity and all current aliases unchanged. Before reconsidering integration, obtain a product-specific Québec or Canadian bilingual label for plain puffed corn that establishes its relation to popcorn and distinguishes it from cornmeal-based or formulated cereal products. Have the Québec display independently reviewed; do not infer it from `maïs soufflé`, `maïs éclaté`, or a mechanical translation. If that gate is cleared, rerun the exact-key and full-recipe audits and consider an identity-only `GRAIN_AND_CEREAL` row with no aliases or numeric behavior until those fields are researched separately.

## Root integration outcome

Root reviewed the product and Québec terminology sources and accepted the hold on 2026-10-11. The shared ledger now records this as `candidate-puffed-corn`, with all six source IDs and Arrowhead Mills' 3/4 cup (14 g) Nutrition Facts serving preserved strictly as a product-specific portion observation. The measurement state reflects that source-backed label observation; it does not create a default serving, density, or volume mapping. Substitution research remains `not_yet_researched`. No seed reference, form, recipe, generated index, or runtime behavior changed. The plan marks this scoped review complete while leaving the broader Section F checklist open.
