# WP08 proposal: contextual wheat-flour substitution evidence review

**Review date:** 2026-10-10  
**Disposition:** Proposal only. No ledger, catalog, plan, roadmap, recipe, code, or test files were changed.  
**Scope:** Active wheat-flour identities, prioritizing all-purpose, bread, cake, and pastry flour in explicit bread, cookie, and cake uses. This does not repeat the existing cornstarch-to-flour sauce-thickening finding.

## Refreshed artifact snapshot

Counts and SHA-256 values were refreshed on 2026-10-10. Recipe aggregate hashing uses sorted paths relative to the bundled-library package, then path + NUL + exact file bytes + NUL for each recipe.

| Artifact | Count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 681 references | `719bf518ca9156789d629268b9cf8f3b85e5d177bee161b3606cb9bdf326f77a` |
| ingredient-forms.v1.json | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| substitution-rules.v1.json | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| contextual-substitution-rules.v1.json | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| research-ledger.v1.json | 868 findings | `1e9c1e466d269d68aa0f91a06230d6630cc1c65ea3fdd7b9515e30f7ae962131` |
| Bundled recipes | 114 files; 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

All 18 listed wheat-flour references have no ingredient-form entries. The all-purpose-flour record has `substitutionResearchState=existing_rule_needs_review`; the ledger also has a `researched_supported` cornstarch-to-all-purpose-flour finding for sauce/gravy thickening. The other 17 listed flour records remain `not_yet_researched`. No flour-to-flour substitution finding or runtime rule is active. Current identities are `ingredient-ref-all-purpose-flour`, `ingredient-ref-atta`, `ingredient-ref-bread-flour`, `ingredient-ref-cake-flour`, `ingredient-ref-durum-flour`, `ingredient-ref-einkorn-flour`, `ingredient-ref-emmer-flour`, `ingredient-ref-high-gluten-flour`, `ingredient-ref-khorasan-flour`, `ingredient-ref-maida`, `ingredient-ref-malted-wheat-flour`, `ingredient-ref-pastry-flour`, `ingredient-ref-roasted-wheat-flour`, `ingredient-ref-roasted-wheat-malt-flour`, `ingredient-ref-self-rising-flour`, `ingredient-ref-spelt-flour`, `ingredient-ref-whole-wheat-flour`, and `ingredient-ref-whole-wheat-pastry-flour`. Buckwheat, wheat starch, wheat meal, and semolina references are different ingredients/products and were not treated as flour synonyms.

## Recipe-use audit

Audit covered all 114 bundled recipe files and linked flour-reference rows, with free-text mentions checked separately. Counts below are line counts, not recipe counts.

| Use | Audited recipe IDs and linked lines |
|---|---|
| Bread/buns | `005` steamed bao: AP; `072` hamburger buns: AP in tangzhong and bread flour in dough (separate components, not an alternative); `073` chocolate banana bread: AP; `076` pizza dough: AP-linked line whose text says “all-purpose flour or bread flour” (free-text alternative, not an established catalog rule). |
| Cookies | Nine AP cookie-dough lines across `009`, `010`, `011`, `012`, `013`, `017`, `028`, `047`, and `094`. In `094` (#7–8), 125 g AP and 95 g bread flour are co-ingredients in the same cookie dough, not alternatives; that bread-flour line provides no swap evidence. Its #16 65 g AP filling line is a separate use. |
| Cakes | Direct cake-flour lines in `008`, `021`, `051`, `091`. AP cake-tagged lines in `045`, `049`, `050`, `052`, `053`, `054`, `055` (three separate lines), `056`, `057`, `058`, `070`, and `114`. |
| Pastry/tart | AP lines in `002` pie crust, `041` pie crust, `080` puff pastry, and `110` frangipane mini tarts. No linked pastry-flour or self-rising-flour recipe lines. `077` and `078` use AP in savory fillings/sauce, not pastry dough. |

There are no linked recipe rows for the other active wheat-flour identities. This is a current-library coverage result, not evidence that the flours are interchangeable or unusable. Recipe tags and free-text “or” wording were not converted to substitution rules.

## Direction- and context-specific dispositions

Ratios below are retained only where a source explicitly gives them. Proposal source labels F01–F13 are local references for this review, not IDs inserted into the shared ledger.

| Direction and context | Evidence and disposition | Rejected generalization / remaining limit |
|---|---|---|
| All-purpose → bread flour, yeast sandwich bread | **Ledger candidate: narrow support.** King Arthur’s Classic Sandwich Bread comparison reports a similar rise and shape with bread flour, tighter crumb, and stiffer dough from greater absorption. It says to use the same amount in that tested recipe; adjust dough feel with a little water or flour as needed (F01). Treat the quantity as that formula’s result, not a universal ratio. | Do not apply to every bread. Flour protein varies by brand; no sourced generic mass/volume basis or universal liquid offset. |
| Bread flour → all-purpose, yeast bread | **Ledger candidate: narrow support, qualitative.** Side-by-side tests found AP workable in milk bread but less reliable at slicing, while bread flour gave materially better structure in focaccia, baguette, and sourdough (F03). | No generic replacement ratio or liquid adjustment is supplied. Do not infer a reverse rule from F01. High-hydration breads are especially unsupported. |
| All-purpose → bread flour, chocolate-chip cookies | **Ledger candidate: tested, caution.** King Arthur explicitly recommends 1:1 for its tested chocolate-chip cookie context; its article says to add 1–2 tsp liquid per cup of flour only if the dough seems dry. Bread flour made the cookies chewier/bendier (F02). The article does not state a mass-versus-volume basis for that 1:1 guidance. | Do not extend the ratio to all cookie styles or other flour brands. No automatic reverse rule. |
| Bread flour → all-purpose, cookies | **Ledger candidate: qualitative only.** A reverse-direction King Arthur test used AP in a bread-flour snickerdoodle formula; the cookies worked but were more tender and less chewy (F02). | No ratio or adjustment is explicitly stated for this reverse test. Do not borrow the chocolate-chip-cookie ratio. |
| Cake flour → all-purpose, cakes | **Ledger candidate: qualitative, caution.** King Arthur says AP can stand in for cake flour, with a somewhat coarser crumb (F04). | No direct AP-only ratio is stated. Cake formula, mixing, and desired crumb matter. Do not assign `1:1` based on third-party broad claims. |
| All-purpose → cake flour, cake/bar/cookie | **No generic substitute supported.** King Arthur warns that cake flour can sink in AP-developed cakes/bars and make cookies too delicate or prone to falling apart; its Angel Food Cake recipe is a named exception that permits either flour (F04). | The exception is formula-specific, not a reverse of cake→AP and not evidence for all cakes. Keep unsupported for a generic runtime rule. |
| All-purpose + cornstarch → cake flour, cake | **Ledger candidate: sourced compound replacement only.** King Arthur gives 3/4 cup + 2 tbsp (105 g) AP flour plus 2 tbsp (14 g) cornstarch as a homemade cake-flour substitute, to match the recipe quantity by weight or volume (F04). | This is not AP↔cake flour identity or a single-ingredient replacement. Current rule DTO/resolver cannot represent a multi-ingredient replacement. Do not collapse the blend into a direct flour rule. |
| Pastry flour → AP, or AP → pastry flour, pie/scones/cookies/cake | **No supported direct rule found.** The product page describes pastry flour as soft-wheat/lower-protein and intended for tender biscuits, scones, and pie crust, but gives no swap ratio or direct comparative test (F05). | Do not transfer cake-flour guidance to pastry flour; the products are distinct. No tested direct direction or recipe-specific adjustment was found. |
| AP ↔ pastry flour blend, named pie-crust/scone recipes | **Recipe-specific alternatives, but wrong target identity for a pastry-flour rule.** King Arthur’s All-Butter Pie Crust uses equal volume of AP or its AP/pastry-flour blend (2.5 cups; 300 g vs 283 g). Its Scones & Biscuits recipe likewise uses 2.75 cups of either (330 g vs 311 g) (F06–F08). | The blend is not plain pastry flour. Equal volume but different stated mass is not a mass ratio. Do not attach these alternatives to `ingredient-ref-pastry-flour` or generalize beyond those named formulas. |
| AP ↔ whole-wheat flour, cookies/bars/brownies | **Research candidate only; no generic rule.** King Arthur’s Golden Wheat (white whole-wheat product) tests support replacing half the AP in its cookie/bar/brownie contexts without other changes; some drop-cookie tests use 100%, with texture/rest limits. For a dough rested/chilled over 25 minutes, the article suggests about 2 tsp water or orange juice per cup of Golden Wheat (F10). | Golden Wheat is product-specific and is not established as identical to the catalog’s generic whole-wheat flour. Shortbread/rolled crisp cookies may be gritty. No reverse direction supported. |
| AP ↔ whole-wheat flour, cakes | **No generic ratio.** Carrot, lemon, and devil’s-food cake/cupcake tests compared AP, half Golden Wheat, and all Golden Wheat; whole-wheat results can be rough/crumbly or gritty (F11). | Angel-food/sponge cakes were excluded. Do not infer a universal 50/50 ratio or apply the cookie result to cakes. |
| AP ↔ whole-wheat flour, yeast bread/rolls/pizza | **Research candidate only; source-specific.** King Arthur supports up to half the white flour by volume as Golden Wheat in its yeast-bread contexts, with no other adjustment. For 100% Golden Wheat it suggests starting with 2 tsp additional liquid per cup and a 20–30 minute rest; high-hydration ciabatta is a stated exception (F12). | Product-specific; no universal mass basis. No general reverse direction or rule for other wheat-flour identities. |
| AP → self-rising flour, cookies/banana bread/cake | **No direct-flour rule.** A tested substitution is conditional on the recipe’s baking-powder/salt content; remove or adjust those ingredients, and cookies spread more/faster. Soda-only recipes remain unresolved (F09). | This changes leavening and salt as well as flour. It is a compound recipe modification, not a flour identity conversion; no active recipe lines here. |
| Self-rising flour → AP + baking powder + salt | **Ledger candidate as a compound replacement only.** King Arthur explicitly gives 1 cup (120 g) AP + 1.5 tsp baking powder + 1/4 tsp table salt, used 1:1 by weight or volume for a recipe calling for self-rising flour; liquid may need increasing (F09). | Not a reverse direct-flour rule. Current runtime target is one ingredient ID and cannot encode the compound replacement or its recipe leavening interactions. |
| Other active flours ↔ AP/bread/cake/pastry flour | **Researched-no-supported-substitute for this bounded review.** No directional, context-specific test evidence was found in the sources reviewed for atta, durum, einkorn, emmer, high-gluten, khorasan, maida, malted wheat, roasted wheat, roasted wheat malt, spelt, or whole-wheat pastry flour. These IDs have no linked recipe use in this library. | Absence of relevant tests is not proof that no substitute exists. Keep candidate directions/context explicit and no ratio. Do not treat regional names (e.g., atta/maida) as synonyms for AP flour without identity evidence. |

## Existing evidence not repeated

The current ledger already records `WP08-cornstarch-to-flour-sauce-thickening` (`ingredient-ref-cornstarch`, source `WP08-S12`) for a narrow sauce/gravy thickening context, with integration blocked for runtime. This proposal does not duplicate that direction or context. No new flour finding is present in the shared ledger as of the refreshed snapshot.

## Repository schema fit and recommendation

Recommend **ledger-only research records** for the narrow findings above; do not propose active runtime rules yet. `SubstitutionFinding` can preserve context, basis, adjustments, expected effects, limitations, rejected candidates, multiple replacements, and source IDs. Suggested confidence/risk labels from the current domain enums:

- Use `TESTED` + `CAUTION` only for directly tested, named recipe/product evidence such as bread-flour chocolate-chip cookies or the Classic Sandwich Bread comparison. Preserve the exact recipe context, brand, stated quantity basis, and texture change.
- Use `APPROXIMATE` + `CAUTION` for qualitative or formulation-advice findings without a fully quantified test ratio. Do not turn qualitative success into a ratio.
- Use `researched_no_supported_substitute` for screened directions with no source-backed substitute; include the context and rejected broad candidates. Do not record a ratio.
- Do not use `EXACT` or `SAFE` here: these flour swaps change gluten development, absorption, crumb, spread, or leavening, and source coverage is formula/brand-specific.

Runtime is not justified by the current `ContextualSubstitutionRule` shape. It has one source and one target ingredient, a scalar ratio/offset, context filters, confidence/risk and bilingual notes/warnings; it has no source IDs, no source/target unit basis, and no compound replacement. The resolver accepts only positive same-unit ratios with no offset, requires an allowed dish type, rejects rules with role or method filters, and suppresses high-risk suggestions. It cannot faithfully express multi-ingredient cake/self-rising replacements, a source-given volume ratio applied to a recipe mass quantity, or recipe-specific liquid/leavener changes. Explicit ingredient-line links can carry bilingual warnings, but that does not repair those modeling gaps.

Do not reverse a directional finding, chain rules, infer synonymy, or generalize across flour brands/formulas. Future runtime candidates would need separately sourced directions and contexts, source/target quantity bases, representable adjustments, and warning text. The `076` “AP or bread flour” wording is not enough to establish a reusable rule.

## Search log and sources

Searches performed on 2026-10-10:

- `site:kingarthurbaking.com/blog substitute bread flour all-purpose flour bread cookies cake flour`
- `site:kingarthurbaking.com/blog cake flour substitute all-purpose flour cornstarch 1 cup`
- `site:kingarthurbaking.com/blog pastry flour substitute all-purpose flour cake flour ratio`
- `site:seriouseats.com cake flour bread flour all-purpose flour cookies substitution test`
- `King Arthur Baking pastry flour substitute all purpose cake flour 1:1 bread flour cookies`
- `site:americastestkitchen.com pastry flour substitute all purpose flour cake flour`
- `site:bonappetit.com pastry flour substitute all purpose flour cake flour`
- `site:food52.com pastry flour substitute all purpose cake flour`
- `site:foodnetwork.com pastry flour substitute all purpose flour`
- `site:kingarthurbaking.com/blog self-rising flour all-purpose flour substitute cookies cake`

The following sources were opened and accessed 2026-10-10. King Arthur Baking is both a flour manufacturer and test kitchen; evidence is useful for its reported recipes/products but is not an independent inter-brand study. Excerpts below are paraphrased; source-specific ratios and limits are retained.

| Ref | Source and relevant scope | Direct URL |
|---|---|---|
| F01 | King Arthur Baking, “How to substitute bread flour for all-purpose flour” (2016-07-21): Classic Sandwich Bread comparison; same amount only in that test; tighter crumb/stiffer dough. | [kingarthurbaking.com/blog/2016/07/21/substitute-bread-flour-for-all-purpose-flour](https://www.kingarthurbaking.com/blog/2016/07/21/substitute-bread-flour-for-all-purpose-flour) |
| F02 | King Arthur Baking, “Bread flour for cookies — here's why it works so well” (2020-09-02): chocolate-chip 1:1 suggestion; optional liquid if dry; reverse snickerdoodle test is qualitative. | [kingarthurbaking.com/blog/2020/09/02/bread-flour-for-cookies](https://www.kingarthurbaking.com/blog/2020/09/02/bread-flour-for-cookies) |
| F03 | King Arthur Baking, “Bread flour vs. all-purpose flour: Does it really make a difference?” (2022-09-22): four bread comparisons; structure and absorption vary by formula. | [kingarthurbaking.com/blog/2022/09/22/bread-flour-vs-all-purpose-flour](https://www.kingarthurbaking.com/blog/2022/09/22/bread-flour-vs-all-purpose-flour) |
| F04 | King Arthur Baking, “Cake flour vs all-purpose flour: What's the difference?” (2023-01-18): qualitative direct swap limits; formula-specific Angel Food Cake exception; full AP+cornstarch formula. | [kingarthurbaking.com/blog/2023/01/18/cake-flour-vs-all-purpose-flour](https://www.kingarthurbaking.com/blog/2023/01/18/cake-flour-vs-all-purpose-flour) |
| F05 | King Arthur Baking product page, Pastry Flour: product description/use guidance, no substitution ratio. | [shop.kingarthurbaking.com/items/pastry-flour](https://shop.kingarthurbaking.com/items/pastry-flour) |
| F06 | King Arthur Baking product page, Pastry Flour Blend: confirms blend is AP plus pastry flour, distinct from plain pastry flour. | [shop.kingarthurbaking.com/items/pastry-flour-blend](https://shop.kingarthurbaking.com/items/pastry-flour-blend) |
| F07 | King Arthur Baking, All-Butter Pie Crust (updated 2026-08-17): AP or pastry-flour blend, equal volume with differing masses. | [kingarthurbaking.com/recipes/all-butter-pie-crust-recipe](https://www.kingarthurbaking.com/recipes/all-butter-pie-crust-recipe) |
| F08 | King Arthur Baking, Scones & Biscuits (updated 2024-10-22): AP or pastry-flour blend in this formula, equal volume with differing masses. | [kingarthurbaking.com/recipes/scones-biscuits-recipe](https://www.kingarthurbaking.com/recipes/scones-biscuits-recipe) |
| F09 | King Arthur Baking, “How to substitute self-rising flour for AP flour and vice versa” (updated 2026-03-30): conditional swaps with leavening/salt changes; reverse compound formula. | [kingarthurbaking.com/blog/2026/03/30/substitute-self-rising-flour](https://www.kingarthurbaking.com/blog/2026/03/30/substitute-self-rising-flour) |
| F10 | King Arthur Baking, “Substituting whole wheat flour in cookies and bars” (2014-03-11): Golden Wheat product tests, cookie/bar-specific blend and hydration findings. | [kingarthurbaking.com/blog/2014/03/11/cookies-brownies-and-bars](https://www.kingarthurbaking.com/blog/2014/03/11/cookies-brownies-and-bars) |
| F11 | King Arthur Baking, “Converting cake & cupcakes to whole wheat” (2014-05-16): Golden Wheat cake/cupcake comparisons; sponge/angel food excluded. | [kingarthurbaking.com/blog/2014/05/16/cake-cupcakes](https://www.kingarthurbaking.com/blog/2014/05/16/cake-cupcakes) |
| F12 | King Arthur Baking, “Substituting whole wheat flour in yeasted bread recipes” (2014-02-28): Golden Wheat bread/roll/pizza blend and 100% hydration guidance; ciabatta exception. | [kingarthurbaking.com/blog/2014/02/28/yeast-bread-rolls-and-pizza](https://www.kingarthurbaking.com/blog/2014/02/28/yeast-bread-rolls-and-pizza) |
| F13 | The Kitchn, “Out of All-Purpose Flour? Here’s What to Use Instead” (updated 2020-04-28): secondary broad-scope swap claims used only as a cross-check and not adopted. | [thekitchn.com/flour-substitute-23023177](https://www.thekitchn.com/flour-substitute-23023177) |

America's Test Kitchen pages were blocked to this research session by robots.txt; no claim was attributed to them. The broad secondary 1:1 pastry/cake-to-AP guidance found at F13 was rejected as too broad for the required direction/context granularity. No source found here supports treating pastry flour and cake flour as synonyms or applying one swap ratio across all flour types or recipe uses.

## Remaining research gaps

1. Independent, cross-brand bake tests for AP/bread-flour swaps, with recipe quantity basis and dough-water measurements.
2. Direct, named recipe comparisons for plain pastry flour versus AP in pie crust, scones, cookies, and cakes; pastry-flour blend results cannot fill this gap.
3. Exact recipe-specific AP/cake-flour reverse tests beyond the named Angel Food Cake exception.
4. Definition of which whole-wheat product the active generic identity represents; Golden Wheat test results should not be merged until that product boundary is settled.
5. More evidence for the low-usage active flour identities before proposing any candidate rule.
6. Runtime model support for source/target quantity basis, compound replacements, and adjustments before considering even well-sourced contextual findings for automatic suggestions.
