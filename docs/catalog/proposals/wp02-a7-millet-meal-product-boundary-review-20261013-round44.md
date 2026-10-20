# WP02 A7 R44: Millet Meal Product-Boundary Review

- **Reviewed:** 2026-10-13
- **Status:** Proposal only. No shared catalog, form, recipe, ledger, plan, roadmap, or integration README was changed.
- **A7 anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt#L1444` remains open.
- **Scope:** Focused current-source recheck of `millet meal`. The 2026-10-11 residual grain-meals review already recorded this phrase as a grouped hold; this review makes that prior disposition explicit and adds current manufacturer evidence, rather than claiming the candidate had never been reviewed.
- **Proposal-local source IDs:** `WP02-A7-MILLET-MEAL-20261013-R44-S01` through `S02`. Reused source IDs are identified separately below; these proposal-local IDs are not ledger records.

## Recommendation

**Hold `millet meal` unallocated.** Do not create an active identity or alias, and do not map it to `ingredient-ref-millet-flour`, `ingredient-ref-pearl-millet-flour`, or `ingredient-ref-finger-millet-flour`.

The new current manufacturer page for Ozery Morning Rounds uses `millet meal` as one component of a multigrain mix. It confirms Canadian food-label usage, but does not describe a standalone meal product, the millet species, or a grind boundary. The only matching Canadian retail listing reviewed is a third-party marketplace page whose English and French titles differ in product class (`Millet Meal` versus `Farine de millet`); Walmart explicitly says it does not separately verify the supplied details. These sources do not establish a stable, independent catalog identity or a Québec French display.

## Source-backed product and naming boundary

Ozery Bakery's current manufacturer page lists its Multi Grain Morning Rounds as a six-count, 450 g product and includes `millet meal` within a multigrain mix alongside cracked wheat, cracked rye, flax, cracked triticale, barley grits, sunflower seeds, rolled oats, and durum semolina [S01]. This is stronger current Canadian usage evidence than the previously reviewed marketplace listing, but the phrase is only a declared component in a composite baked product. The maker gives no separate ingredient specification or milling description and provides no French ingredient list on this page.

The OQLF Grand dictionnaire terminologique entry gives `millet`, `mil`, and `petit mil` as French terms for the cereal and says unqualified `millet` can group multiple species [WP02-A6-GRAIN-FLOUR-GAPS-20261010-S02]. It does not define a processed meal or support a translation such as `gruau de millet` or `semoule de mil`.

The Walmart Canada English page titles the marketplace product `Millet Meal Stone Ground`; the French listing for the same SKU `6NRGALCVE0DH` and UPC `00634740003931` is titled `Farine de Millet Moulue sur Pierre` [WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S12]. Both pages identify seller Wholesale2go, and Walmart says marketplace product details are supplied by third parties and are not separately verified. The French wording is therefore seller-provided product-page text, not an OQLF ruling or independent Québec naming confirmation. It also cannot establish that meal and flour are generally equivalent.

A historical CIPO goods list names `Millet Meal` and `Millet Flour Stone Ground` separately [WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S13]. The application was abandoned on 2025-01-08, so it is not evidence of a current product or a technical grind specification. It is only a further reason not to infer universal meal-to-flour equivalence from one marketplace translation.

## Live ownership and picker impact

The current package snapshot contains 1,368 active ingredient references, 100 forms, 64 legacy candidates, 1,699 research-ledger records, and 8 unit-conversion records. The active grain neighbors include `ingredient-ref-millet` (`millet / millet`), `ingredient-ref-millet-flour` (`millet flour / farine de millet`), species-qualified millet and flour references, millet flakes, millet couscous, and other named millet foods. None is an exact owner for meal.

| Search phrase | Active reference/form owner | Legacy or ledger exact owner |
| --- | --- | --- |
| `millet meal` | None | None |
| `millet meal stone ground` | None | None |
| `farine de millet moulue sur pierre` | None | None |
| `gruau de millet` | None | None |

There is no millet-meal form, form hint, density, or unit mapping. Exact-phrase then partial search against the live reference/form terms returns no result for `millet meal`, `Millet Meal Stone Ground`, or `farine de millet moulue sur pierre`. The broader `millet` query returns 18 active references; `millet flour` returns six millet-flour references; `farine de millet` returns five species-qualified or generic millet-flour references. Holding the phrase preserves those existing results and avoids routing meal queries into a flour reference. No new picker term is proposed.

## Recipe-demand audit

I scanned every manifest-listed recipe file: 114 recipes containing 1,123 ingredient-row objects. The scan found no ingredient-row text containing `millet`, `millet meal`, `Millet Meal Stone Ground`, `farine de millet moulue sur pierre`, `gruau de millet`, or `millet flour`. There is no current bundled recipe demand, recipe link, or relink recommendation for this phrase.

## Measurement and substitution limits

- Ozery's serving information is **one whole bun (75 g)** [S01]. It does not disclose how much millet meal the bun contains, so the bun mass cannot be used as a meal measure or density.
- Walmart's **22 lb** is a seller listing's package size, not a household measure; the third-party listing does not supply a verified volume-to-mass value [WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S12].
- Bob's Red Mill's current standalone product is explicitly **millet flour**, described as stone-ground from whole-grain millet. Its **1/4 cup (40 g)** serving and advice to replace up to **25%** of recipe flour are specific to that flour product [S02]. Neither value nor substitution guidance transfers to millet meal.
- No exact-form meal measure, density, unit mapping, yield, or substitution evidence was found. Add none; do not infer a measure or substitution from flour, a finished bun, or an adjacent millet product.

## Static query and corpus snapshot

The exact-owner audit covered reference displays and aliases, form labels and match terms, legacy candidate text, and ledger records. The search behavior check used the live `IngredientReferenceSearchIndex` rule: prefer complete normalized phrases, then fall back to partial matches. The recipe audit covered all 114 paths in `manifest.v1.json`. Counts above describe the live worktree snapshot at review time; they are not a proposed catalog update.

## Sources and limits

| Source ID | Source and locator | Claim supported and limit |
| --- | --- | --- |
| `WP02-A7-MILLET-MEAL-20261013-R44-S01` | Ozery Bakery, [Morning Rounds – Multi Grain](https://ozerybakery.com/our-products/morning-rounds-multi-grain/), reviewed 2026-10-13; product name/pack size at page lines 29–34, ingredient list at lines 52–54, serving at lines 55–58. | Current maker page names `millet meal` as a multigrain-mix ingredient and gives the finished product's package and bun weights. It does not describe standalone meal, millet species, process/grind, ingredient quantity, or French label. The page notes that Ozery no longer offers online delivery; it is not a stock or availability guarantee. |
| `WP02-A7-MILLET-MEAL-20261013-R44-S02` | Bob's Red Mill, [Millet Flour](https://www.bobsredmill.com/product/millet-flour), reviewed 2026-10-13; product identity/process and flour-only substitution note at lines 257–269, serving at lines 282–284, ingredient at lines 345–347. | Manufacturer distinguishes its product as stone-ground whole-grain millet flour and provides a flour-specific serving and baking suggestion. These data are comparator evidence only and do not specify meal. The page is not a Québec French meal naming source. |
| Reused `WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S12` | Walmart Canada, [English listing](https://www.walmart.ca/en/ip/Millet-Meal-Stone-Ground/6NRGALCVE0DH) and [French listing](https://www.walmart.ca/fr/ip/Pierre-de-Millet-Moulue/6NRGALCVE0DH), rechecked 2026-10-13; English title/22 lb package at lines 46–60, seller and verification limit at lines 87 and 105–113, SKU/UPC at lines 129–135; French title at lines 43–50 and same SKU/UPC at lines 118–124. | Same marketplace listing has English `meal` and French `farine` wording and identifies seller Wholesale2go. Walmart's disclaimer says third-party data are not separately verified. It does not define grind or establish a general meal/flour equivalence. Package weight is not a household measure. |
| Reused `WP02-A7-RESIDUAL-GRAIN-MEALS-20261011-S13` | Canadian Intellectual Property Office, [trademark application 1978912](https://ised-isde.canada.ca/cipo/trademark-search/1978912), rechecked 2026-10-13; goods list at lines 165–167, status at lines 83–97, abandonment history at lines 168–178. | The historical goods list separates millet meal from stone-ground millet flour; the application was filed in 2019 and abandoned in 2025. It is not current product or process evidence. |
| Reused `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S02` | Office québécois de la langue française, [millet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), updated 2010; preferred terms and generic-species note at lines 19–44. | Supports generic cereal naming only; it does not name millet meal or a processed millet product. |

## Next action

Retain the current hold as an unallocated phrase. Do not add a reference, alias, legacy candidate, ledger candidate, form, measure, density, mapping, recipe link, conversion, yield, or substitution. Reopen only if a current manufacturer or technically accountable supplier documents a standalone meal product and its milling boundary, with a source-backed Québec French display. Any later measurement or substitution work must use evidence for that exact meal product/form.
