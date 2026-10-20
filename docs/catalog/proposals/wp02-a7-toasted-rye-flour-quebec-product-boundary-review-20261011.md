# WP02 A7 toasted rye flour: Québec product and process boundary review

## Scope and status

- **Review date:** 2026-10-11
- **Scope:** Recheck the held toasted rye flour candidate against current product listings, Québec French terminology and usage, neighboring rye identities, and the bundled recipe corpus.
- **Status:** Proposal only. This review changes no catalog, ledger, plan, roadmap, recipe, code, or test file.
- **Proposal-local source IDs:** `WP02-A7-TOASTED-RYE-QC-20261011-S01` through `S10`. These are local to this document and are not research-ledger IDs.
- **Review inputs:** Current WP02 plan and A7 proposals, the rye-meal and whole-rye-flour reviews, the research-ledger candidate, current bundled references/forms/legacy identities, and all recipe files in the bundled manifest.

## Recommendation

| Candidate | Disposition | Catalog action | Reason |
|---|---|---|---|
| Toasted rye flour | **Hold** | Add no reference, French display, alias, form, or product behavior. Keep the existing ledger candidate unresolved. | Commercial bakery sources establish the English product label, and a French mill uses `farine de seigle toasté (bio)`. The French wording is not Québec-market or terminology-authority evidence. The Québec retail phrase found is specifically `farine de seigle malté toasté`, a malted-and-toasted ingredient. Sources do not establish whether an unqualified toasted rye flour is malted, whether rye grain or milled flour is heated, or a common boundary with `roasted rye flour`. |

The current A7 plan leaves this candidate unresolved. The ledger record `candidate-toasted-rye-flour` remains `needs_clarification`; its only source is Harinas Polo, and its decision already says not to alias the candidate to roasted barley, roasted wheat, malted rye, or ordinary rye flour. The evidence below strengthens the product-existence and French-wording record, but does not close the specific Québec naming or product-state gaps.

## Product and French evidence

Harinas Polo names a product **Toasted Rye flour**. Its page describes a family of “malted and toasted products” and says rye is among cereals malted and/or toasted. Its individual listing does not say whether this particular rye flour is malted, whether the whole grain or flour is heated, or what temperature or roast level applies [S01]. Eurogerm independently lists product 11156 as **Organic toasted rye flour** in its sensory-ingredient range [S02]. Molino Merano's 2024 catalogue lists toasted rye flour as a bakery ingredient and names it separately from rye flour and malted flour within several bread-mix ingredient declarations; that is evidence of one supplier's product separation, not a universal formulation or process definition [S03].

The clearest French-language product name found is the French mill Moulins Bourgeois's 2024 catalogue entry **Farine de seigle toasté (bio)**. The entry is under “ingrédients toastés / torréfiés” and says the product adds colour and toasted flavour to country or rye breads [S04]. This is direct French-market wording. It is not a Québec terminology ruling, and the catalogue does not say whether rye is malted, specify the heat-before-milling sequence, or define a process threshold.

The Québec-facing evidence is narrower. Metro's French listing for La Fournée Dorée sesame brioche buns includes **farine de seigle malté toasté** in the ingredient declaration [S05]. At the time checked, the listing displayed the item as out of stock. This is useful local label evidence for a malted-and-toasted rye ingredient; it does not name plain toasted rye flour and does not make that local phrase a synonym for the unqualified candidate.

OQLF's GDT entry pairs **farine de seigle** with **rye flour**, but gives no toasted or malted subclass [S06]. Targeted OQLF and TERMIUM searches in this review did not find an exact Québec-authority entry for *toasted rye flour* or a rye-flour translation using `toasté`, `grillé`, or `torréfié`. This is a bounded search result, not proof those expressions never occur in Québec French. OQLF does document **malt torréfié** and **malt grillé** in a malting entry [S07]; those terms apply there to malt and do not establish a preferred name for an unqualified toasted rye flour.

## Keep the product scopes separate

| Nearby product | Existing or source-defined scope | Boundary for this candidate |
|---|---|---|
| General rye flour | Active `rye flour / farine de seigle`. | Heating is a separate product claim. Do not add toasted/roasted language to the general row. |
| Whole rye flour | Active `whole rye flour / farine entière de seigle`, with source-backed English alias `complete rye flour`. | “Whole” describes a grain-retention claim, not a toast state. Do not infer whole-grain content from the toasted product title. |
| Malted rye flour | Active `malted rye flour / farine de seigle malté`. | Malting and toasting are distinct terms in the sources. Metro's `farine de seigle malté toasté` explicitly includes both descriptors; do not absorb it into the unqualified candidate or assign malt status to the candidate. |
| Roasted rye flour | No exact active owner found for this phrase. | The reviewed English product pages say *toasted*. No reviewed source establishes *roasted rye flour* as a global synonym. Do not add it as an alias or translate it as `farine de seigle torréfiée`. |
| Rye meal / pumpernickel meal | Active `rye meal / gruau de seigle`, with aliases `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`, `semoule de seigle`, and `farine à pumpernickel`. TERMIUM describes the product as coarse and dark, made from whole-kernel rye for pumpernickel bread and rolls [S08]. | The toasted-flour sources do not establish whole-kernel milling or a coarse grind. Do not assign `pumpernickel flour`, `pumpernickel meal`, `rye meal`, or their French aliases to toasted rye flour. |

Supplier terminology around *pumpernickel* is not fully consistent: Ardent Mills lists “Rye Meal Pumpernickel” as a whole rye flour and separately lists rye chops, rye flakes, and other flour formats [S10]. That product-specific taxonomy reinforces the need to keep the existing rye-meal aliases source-bounded; it does not establish equivalence with toasted rye flour.

Georg Plange separately lists **malted rye flours** as active, toasted, roasted, and fermented products, with its own product-specific color figures for some grades [S09]. This supports keeping malted rye flour's named states distinct within that supplier's range. It does not define un-malted toasted rye flour, establish that *toasted* and *roasted* are interchangeable outside that range, or justify transferring its figures into the catalog.

## Collision and recipe audit

The current bundled package snapshot contains **964 ingredient references**, **53 ingredient forms**, and **114 recipes with 1,123 ingredient rows**. The exact normalized-name scan covered reference displays and aliases, ingredient forms, and `docs/catalog/legacy-import-identities.v1.json`.

| Surface | Result |
|---|---|
| Active references, forms, and legacy identities | No exact owner for `toasted rye flour`, `roasted rye flour`, `farine de seigle toasté`/`toastée`, `farine de seigle grillé`/`grillée`, `farine de seigle torréfié`/`torréfiée`, or `farine de seigle malté toasté`. The exact neighboring displays remain assigned to general rye flour, whole rye flour, rye meal, and malted rye flour as listed above. |
| Bundled recipes | No ingredient-line or full-recipe JSON match for the candidate phrases or their reviewed French variants. The broader scan also found no `rye` or `seigle` mention in the 114 current bundled recipes, so there is no recipe line to link to this candidate. |
| Existing name collision to preserve | `pumpernickel flour` is already an English alias on `ingredient-ref-rye-meal`; do not transfer it to this candidate. |

Search normalization was case-insensitive, folded accents and common ligatures, and reduced punctuation and whitespace to word-separated alphanumeric keys. The recipe scan traversed the complete manifest-listed JSON files, not only ingredient names. A zero-result corpus scan is not evidence that the ingredient is unneeded in recipes outside the current seed.

## No numeric or behavior data

Add no density, unit mapping, package amount, mass-volume conversion, serving amount, temperature, heating time, heat level, roast/color value, extraction rate, particle size, yield, recipe link, conversion, or substitution. Manufacturer bag sizes, blend percentages, and product-specific color ratings are not recipe-ready values for this candidate. No source reviewed provides a transferable numerical behavior or conversion between toasted rye flour, ordinary rye flour, whole rye flour, malted rye flour, or rye meal.

## Proposal-local source register

Sources were accessed on 2026-10-11. Source IDs below are local to this proposal; source claims remain limited to the named supplier, product, or terminology entry.

| ID | Source and locator | Evidence used | Limits |
|---|---|---|---|
| **S01** | Harinas Polo, [Toasted Rye flour](https://www.harinaspolo.com/en/products/toasted-rye-flour/), product title and “Malted and toasted products” section. | Exact English product name; rye flour is also listed separately; family description covers cereals malted and/or toasted. | Does not specify whether this rye product is malted or the heating/milling sequence; no Québec French name. |
| **S02** | Eurogerm KB, [Organic Baking Ingredients](https://problend-eurogerm.com/products/organic.html), Sensory Ingredients, product 11156. | Lists “Organic toasted rye flour” as a commercial bakery ingredient. | English company page; does not supply a French display or product process details. |
| **S03** | Molino Merano, [General Product Catalogue (2024)](https://www.meranermuehle.it/media/74/b3/01/1707726283/EN_catalogo_generale_molino_merano.pdf), pp. 17, 23, and 47. | Lists toasted rye flour in bakery products, separately from rye flour and malted flour in some ingredient declarations; describes a bakery use. | Italian mill's product and blend context; does not define universal composition or heating sequence. No numeric values are adopted. |
| **S04** | Moulins Bourgeois, [Catalogue produits 2024](https://www.moulinsbourgeois.fr/pdf/Catalogue-produits-MoulinsBourgeois2024.pdf), p. 8, “Ingrédients toastés / torréfiés.” | Uses the exact French product wording `Farine de seigle toasté (bio)` and describes color/toasted-flavor use in breads. | French-market source, not a Québec terminology authority; no process order, product malt status, or general French agreement rule. |
| **S05** | Metro, [La Fournée Dorée Buns brioché au sésame](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-a-hamburger-et-petits-pains/petits-pains/buns-brioche-au-sesame/p/059243000216), item 059243000216, French ingredient declaration. | Local retailer label names `farine de seigle malté toasté`. | Finished bun ingredient wording, not a standalone flour listing, terminology ruling, or evidence for an unqualified toasted product. Page displayed out of stock at review. |
| **S06** | OQLF, [farine de seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle), entry 9489069. | Pairs `farine de seigle` with *rye flour*. | Entry last updated in 1982; does not cover toasted, roasted, malted, or meal subclasses. |
| **S07** | OQLF, [malt torréfié (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297313/malt-torrefie), entry 2297313. | Lists `malt torréfié` and `malt grillé` for the malt concept. | Malting-domain terminology; not a translation or alias ruling for rye flour. |
| **S08** | Government of Canada Translation Bureau, [TERMIUM Plus: rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE), Food Industries / Breadmaking. | Defines rye meal or pumpernickel flour as whole-kernel rye, coarse and dark, for pumpernickel breads; gives `gruau de seigle`, `semoule de seigle`, and `farine à pumpernickel` in context. | Terminology entry dated 2001; qualitative grind description only, no numerical particle-size standard. Applies to rye meal, not toasted flour. |
| **S09** | Georg Plange, [Nos produits maltés](https://www.plange.fr/fr/nos-produits-maltes.html), `Farines de seigle malté`. | Separates active, toasted, roasted, and fermented malted-rye flour products within one supplier's range. | One French supplier's product taxonomy; does not classify unqualified toasted rye flour or define cross-market synonyms. Supplier-specific color figures are not adopted. |
| **S10** | Ardent Mills, [Rye, Pumpernickel Flour: White, Medium & Dark](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/), product-family page. | Separates several rye flour formats and describes its Rye Meal Pumpernickel product as whole rye flour. | One supplier's taxonomy, which shows term overlap rather than a universal definition; no Québec French product label. |

## Integration boundary

Retain the candidate as unresolved in WP02 A7. Reconsider only if a Québec French authority or a Québec-market ingredient/product listing establishes the name for the exact unqualified product state, and a product source clarifies enough processing scope to distinguish it from malted/toasted rye flour and meal. Do not make an English-only reference or borrow a translation from the French-market catalogue in the meantime.
