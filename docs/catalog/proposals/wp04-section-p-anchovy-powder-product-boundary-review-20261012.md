# WP04 Section P — anchovy powder product-boundary review

- **Reviewed / sources accessed:** 2026-10-12.
- **Disposition:** Hold the candidate `anchovy powder / poudre d’anchois` as a separate identity or form. Korean `멸치 가루` (`myeolchi garu`) is a distinct culinary powder concept, but current Canadian evidence also uses “anchovy powder” for a blend of corn maltodextrin, anchovy extract, and salt. The bundle has no matching recipe demand and no Canadian/Québec standalone product label that resolves the product scope.
- **Scope:** one powder candidate within the open Section P fish-powder/fish-balls/surimi work. The existing Bonga fish-powder, anchovy fish, anchovy-paste, stock/dashi, fish-ball, and surimi decisions are retained.
- **Worktree change:** this proposal only. No catalog JSON, ledger, recipe, plan, roadmap, checklist, code, or test file is changed.
- **New source IDs:** `WP04-ANCHOVY-POWDER-20261012-S01` through `S04`. These IDs were checked against the live ledger, all proposal files, and batch notes; no collision was found. Previously registered OQLF, CFIA, and Bonga sources are cited by their existing IDs.

## Recommendation

Keep `anchovy powder` unresolved. Do not add an ingredient reference, alias, or `powdered` form to the active anchovy row in this review.

The candidate is narrower than generic fish powder: Korean public broadcaster KBS World describes anchovy, kelp, mushroom, and mussel powders as products sold for convenient broth-making and records the Korean spelling `멸치 가루` for ground anchovy [S01]. A Korean cooking source shows a 100% anchovy powder used in soup stock [S02]. Neither source establishes a Canadian SKU, Québec display, Latin species, or a universal preparation state. By contrast, current Walmart Canada product information uses the French term `poudre d’anchois` for a powder ingredient in Caesar dressing and lists that powder as corn maltodextrin, anchovy extract, and salt [S03]. Costco Canada reports the same type of extract/carrier/salt composition in a Caesar dressing [S04]. Those retail declarations show that the unqualified powder wording can refer to a formulated anchovy-extract ingredient rather than ground whole fish.

The Québec-facing OQLF entry supports `anchois` for the edible fish and gives the family *Engraulidae*; it does not establish a powder-specific French term or product scope [existing source `WP04-ANCHOVY-20261011-S01`]. The Walmart label independently attests `poudre d’anchois` in a Canadian French product list, but only inside a prepared salad-kit formulation. Do not promote that nested ingredient phrase to a standalone catalog display. No source reviewed here supports a single French name that distinguishes pure ground anchovy from anchovy extract powder with carriers.

## Live catalog, exact-name ownership, and recipe demand

The live bundled package read on 2026-10-12 has **1,244 ingredient references, 94 forms, and 114 manifest-listed recipes with 1,123 ingredient rows**. The legacy-import file has **66 candidates**; the research ledger has **1,550 records**.

| Existing owner or boundary | Current state | Relevance to this candidate |
|---|---|---|
| `ingredient-ref-anchovy` | `anchovy / anchois`, category `PROTEIN`; English plural alias `anchovies`; no forms | Biological edible-fish identity, family-scoped by the reviewed OQLF/CFIA evidence. It does not own a powder phrase. |
| `ingredient-ref-anchovy-paste` | `anchovy paste / pâte d’anchois`, category `SAUCE_AND_CONDIMENT`; no aliases | A separate paste product, not a powder synonym or form. Existing evidence includes OQLF and a Québec paste product [existing `WP04-ANCHOVY-20261011-S08`]. |
| `ingredient-ref-bonga-dried-fish-powder` | `Bonga dried fish powder / poudre de poisson Bonga`; no aliases | A source-scoped, smoked/dried/ground Bonga product; its displays contain broad `fish powder / poudre de poisson` phrases, but not anchovy wording [existing `WP04-BONGA-POWDER-20261011-S01`–`S03`]. |
| Fish stock and stock seasonings | Active fish stock, Hondashi, and shiro dashi identities | Prepared stock or seasoning products; not aliases for pure ground fish or anchovy-extract powder. |
| Fish balls and surimi | `ingredient-ref-fish-balls` is active. Generic `surimi` remains an unresolved paste-versus-finished-product candidate. | These are separate formed or paste/finished products, not powder states [the existing fish-ball/surimi proposals cited below]. |

Normalized exact-key checks for `anchovy powder`, `dried anchovy powder`, `poudre d’anchois`, `poudre d’anchois séchés`, and `myeolchi garu` found no exact owner among active reference names/aliases, form labels/match terms, or legacy names/aliases. A literal scan also found no `멸치 가루` value in those files. The current `normalizeIngredientSearchKey` removes Hangul because its character filter retains only `a-z0-9`, so that Korean spelling currently produces an empty search key; do not add it as a usable alias without Unicode-aware search support. The exact base term `anchovy / anchois` remains owned by `ingredient-ref-anchovy`; `anchovy paste / pâte d’anchois` remains owned by its paste row. No anchovy-powder entry or matching ledger candidate was found. The broad fish-powder phrase remains attached only to the Bonga product display, not as a generic alias.

A structured scan of all **114** manifest-listed recipe files found **zero** ingredient-row or recipe-text matches for anchovy powder, dried/powdered anchovy, `poudre d’anchois`, `myeolchi garu`, Korean `멸치 가루`, generic fish powder, fish balls, or surimi. No recipe row or link is proposed.

## Name and product-state boundaries

| Wording / product | Evidence and boundary | Disposition |
|---|---|---|
| `anchovy / anchois` | OQLF connects the edible-fish term to *Engraulidae*. The CFIA Fish List applies fish names by species; the prior anchovy review found `Anchovy / Anchois` across multiple listed species. Reused sources: `WP04-ANCHOVY-20261011-S01`–`S03`. | Retain the family-scoped fish identity. Do not infer a Latin species from Korean origin, the powder name, or a prepared-food ingredient declaration. |
| Korean `멸치 가루` (`myeolchi garu`) | KBS World says powders made from anchovy and other seafood ingredients are sold for broth-making and gives the spaced Korean spelling; a Korean cooking source describes a 100% anchovy powder used for soup stock [S01–S02]. | Treat as a plausible pure-ground-anchovy candidate. These sources do not establish a Canadian/Québec standalone label, species, drying method, or equivalence to every item called `anchovy powder`. |
| Canadian `poudre d’anchois` / `anchovy powder` in prepared dressing | Walmart Canada’s bilingual Caesar-salad listing names the nested powder as corn maltodextrin, anchovy extract, and salt; its page says product information is supplied by manufacturers/suppliers and is not separately verified by Walmart [S03]. Costco’s listing reports the same ingredient makeup [S04]. | A compound anchovy-extract ingredient, not evidence of a standalone ground-fish powder or a form of whole anchovy. Keep the nested phrase out of aliases on the fish and paste rows. |
| Bonga powder | Marché Mamou’s Montréal product listing gives a named Bonga powder; the earlier review scopes it to that specific product [existing `WP04-BONGA-POWDER-20261011-S01`–`S03`]. | Do not generalize Bonga powder to anchovy powder, generic fish powder, or dried fish. Keep its current name and no-alias decision. |
| Fish stock, dry broth bases, Hondashi, and shiro dashi | Prior fish-powder and broth-powder reviews document multi-ingredient stock/seasoning products separately from single-fish powders [existing proposals `wp04-section-p-fish-powder-identity-boundary-review-20261011.md` and `wp05-bouillon-powder-product-boundary-review-20261011.md`]. | Do not alias or substitute them for either pure anchovy powder or the anchovy-extract blend. |
| Fish balls and surimi | Fish balls are a formed product; `surimi` remains unresolved because sources use it for fish-paste material and finished retail seafood products [existing proposals `wp04-fish-balls-surimi-product-boundary-review-20261011.md` and `wp04-fish-balls-surimi-current-source-reassessment-20261011.md`]. | Keep both outside this powder review; no cross-product aliases or substitutions. |

## Measurement and substitution limits

No kitchen measurement is supported. KBS describes broth use but provides no amount or reconstitution ratio; the Korean cooking source describes use without a portable measure. Walmart and Costco list the powder as a compound ingredient in prepared food, not as a kitchen-use package. Do not infer a density, teaspoon-to-gram conversion, broth yield, package yield, or serving amount from these sources.

No substitution is supported. Pure anchovy powder, an anchovy-extract carrier blend, anchovy paste, whole anchovies, Bonga powder, fish stock, Hondashi, and surimi have different product states or compositions. No recipe or source establishes a global or method-scoped replacement among them. Add no measurement observation, mapping, conversion, yield, form, or substitution rule.

## Source register

Sources accessed 2026-10-12. Product-listing ingredient statements are seller/manufacturer-provided descriptions, not independent composition tests.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-ANCHOVY-POWDER-20261012-S01** | KBS World Korean, [멸치 다시, 멸치 가루](https://world.kbs.co.kr/service/contents_view.htm?board_seq=229185&id=&lang=k&menu_cate=learnkorean). | Describes powders of anchovy, kelp, mushroom, and mussel as commercially sold for convenient broth-making. Gives `멸치 가루` as the written form for ground anchovy; the article does not specify a Canadian product or recipe quantity. |
| **WP04-ANCHOVY-POWDER-20261012-S02** | My Korean Kitchen, [Anchovy Powder (Myeolchi Garu)](https://mykoreankitchen.com/anchovy-powder/). | Describes a 100% anchovy powder used instead of whole anchovy for some soup stocks. This is a cooking-site product example, not a Canadian market listing or a species/formulation standard. |
| **WP04-ANCHOVY-POWDER-20261012-S03** | Walmart Canada, [Ensemble pour salade César Mon marché fraîcheur, 553 g](https://www.walmart.ca/fr/ip/ensemble-pour-salade-csar-mon-march-fracheur-en-format-conomique/6000206418732). | Current French retailer page uses `poudre d’anchois` within a Caesar-dressing ingredient list and identifies the powder sub-ingredients as corn maltodextrin, anchovy extract, and salt. It is a nested ingredient in one prepared salad product; Walmart says listing information is supplied by other parties and not separately verified. |
| **WP04-ANCHOVY-POWDER-20261012-S04** | Costco Canada Same-Day, [Kirkland Signature Caesar Salad](https://sameday.costco.ca/store/costco-canada/products/21114606-caesar-salad-per-lb). | Current listing names `Anchovy Powder` in dressing and lists maltodextrin, anchovy extract, and salt. One prepared-food ingredient declaration; not evidence of a standalone powder SKU. |

Existing sources reused without new IDs: OQLF [anchois (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois) (`WP04-ANCHOVY-20261011-S01`); CFIA fish-name guidance and Fish List anchovy query (`WP04-ANCHOVY-20261011-S02`–`S03`); the OQLF paste source (`WP04-ANCHOVY-20261011-S08`); and the Marché Mamou Bonga listing (`WP04-BONGA-POWDER-20261011-S01`). No powder-specific OQLF term was located in the targeted terminology check; the current Walmart product label is the local evidence for the compound phrase `poudre d’anchois`.

## Next open work

Keep the combined Section P fish-powder/fish-balls/surimi checklist open. Fish balls have an identity-only reference; unqualified surimi remains unresolved; Bonga powder is one named product only. Revisit anchovy powder if a recipe names a specific product state or a Canadian/Québec standalone label distinguishes pure ground anchovy from extract-based powder. Any future measurement or substitution work needs recipe-level quantities and product-matched evidence.
