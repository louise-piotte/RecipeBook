# WP02 A7 R45: Malted Barley Meal Food-Use Boundary Review

- **Reviewed:** 2026-10-13
- **Status:** Proposal only. No shared catalog, form, recipe, ledger, plan, roadmap, or batch README was changed.
- **A7 anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt#L1444` remains open.
- **Scope:** The distinct phrase `malted barley meal`, not the previously reviewed plain `barley meal`, active malted barley flour, or generic malt flour. Exact phrase search found no prior A7 proposal, plan disposition, or ledger candidate for malted barley meal. Plain barley meal remains a separate unresolved ledger candidate.
- **Proposal-local source IDs:** `WP02-A7-MALTED-BARLEY-MEAL-20261013-R45-S01` through `S03`. Existing ledger source IDs are reused where applicable; these proposal-local IDs are not new ledger records.

## Recommendation

**Hold `malted barley meal` outside the food ingredient catalog.** The only current standalone product page found under this exact English name is Wurzelwerk's German-market gardening input, marketed as a soil activator and enzyme source; the page is marked sold out. A current human-food manufacturer instead lists `malted barley` as one ingredient in a wheat-farina cereal, separately from `Wheat Farina`. Neither source documents a standalone food-grade malted-barley meal product or a Québec French display.

Do not create an active identity or alias, and do not map the phrase to `ingredient-ref-malted-barley-flour`, `ingredient-ref-malt-flour`, or the unresolved plain-barley-meal candidate. This is a new, narrow candidate: the earlier barley-meal reviews cover unmalted whole-barley products and do not adjudicate the malted phrase or the nonfood product boundary.

## English and Québec French boundary

Wurzelwerk's product title is `Malted Barley Meal`; the same page identifies the material in German as `Gemälzte Gerste` and describes finely ground barley malt for Living Soil, garden beds, plants, and compost substrates [S01]. Its product page is set to Germany/EUR, gives shipping from Mannheim, and showed the product as sold out when reviewed. This is direct manufacturer/seller evidence for a nonfood use of the phrase, not evidence for an edible flour or meal.

Post Consumer Brands' current `Malt-O-Meal Original Hot Wheat Cereal` lists `Wheat Farina, Malted Barley` as its ingredients [S02]. That is human-food use of malted barley, but the manufacturer names it as an ingredient separate from the farina. The brand name `Malt-O-Meal` does not establish that the barley ingredient itself is meal.

Québec terminology does not resolve the missing food product. OQLF's `malt` entry uses `malt` for a cereal that has been soaked, germinated, and dried; it notes barley as the usual brewing grain, but does not name a ground food product [R45-S03]. OQLF's existing `farine d'orge maltée` entry pairs that French term with `malt barley flour` in the flour domain [WP02-S110]. It supports the existing malted-barley-flour boundary, not a meal alias. The separate OQLF `gruau` entry is in the brewing/malt-crushing domain and describes grits or semolina-like particles from crushed malt; it does not establish `gruau d'orge malté` as a Québec consumer-food name [WP03-BW-GROATS-QC-20261011-S02]. Do not invent or add that display.

CFIA's current incorporated food standards separately name malted barley flour as a permitted flour ingredient, malt flour in bread, and non-wheat meal among bread ingredients; they do not define a `malted barley meal` identity [WP02-S111]. This does not prove that such a food product cannot exist, but it leaves no Canadian standardized product boundary or bilingual naming bridge for this proposal.

## Live ownership and picker impact

The current package snapshot has 1,368 active references, 100 forms, 64 legacy candidates, 1,699 ledger records, and 8 unit-conversion records. Live neighbors include `ingredient-ref-malted-barley-flour` (`malted barley flour / farine d'orge maltée`), `ingredient-ref-barley-flour` (`barley flour / farine d'orge`), `ingredient-ref-malt-flour` (`malt flour / farine maltée`), and `ingredient-ref-roasted-barley-flour` (`roasted barley flour / farine d'orge torréfiée`). None is an exact owner for malted barley meal. The existing `candidate-barley-meal` ledger record is unresolved and concerns unqualified barley meal; it is not a picker row or an owner for this distinct malted phrase.

| Query | Current picker result / exact owner | Legacy or ledger status |
| --- | --- | --- |
| `malted barley meal` | No reference or form result | No exact legacy candidate or ledger candidate |
| `barley malt meal` | No reference or form result | No exact legacy candidate or ledger candidate |
| `farine de malt d'orge` | No reference or form result | No exact legacy candidate or ledger candidate |
| `gruau d'orge malté` | No reference or form result | No exact legacy candidate or ledger candidate |
| `malted barley flour`; `farine d'orge maltée` | Exact owner: `ingredient-ref-malted-barley-flour` | Existing active flour identity; keep it distinct |
| `barley meal` | No active picker result | `candidate-barley-meal` remains an unresolved ledger-only record |

The live picker uses complete normalized phrase matches before partial matching. `malted barley` currently returns only `ingredient-ref-malted-barley-flour`; `malt flour` returns four flour references. Holding the nonfood phrase leaves these searches unchanged. Adding it as a food row would introduce a direct `malted barley meal` result even though the product evidence reviewed here is for soil use; no such picker expansion is recommended.

## Bundled recipe demand

I scanned all 114 manifest-listed recipes and 1,123 ingredient-row objects. There are zero matching ingredient rows for `malted barley meal`, `barley malt meal`, `farine de malt d'orge`, or `gruau d'orge malté`. The Post cereal page is external product evidence and does not count as bundled recipe demand. No recipe link or relink is proposed.

## Numeric and substitution limits

- Wurzelwerk's listed directions are for gardening: 15–20 g per 10 L of soil for top-dressing, 100–200 g per 100 L of substrate, and one teaspoon for an enzyme tea [S01]. These are not food measures, densities, or recipe quantities; do not import them.
- Post's 3 tablespoon (35 g) serving is for the complete hot-wheat cereal [S02]. The manufacturer gives no quantity or measure for its `Malted Barley` ingredient, so the serving cannot be transferred to malted barley meal.
- Neither source supplies a food-meal household measure, volume-to-mass value, density, unit mapping, yield, or substitution. No substitution rule is proposed.

## Exact-form, archive, and corpus audit

The active references and aliases, form labels and match terms, 64 legacy candidates, and ledger records were checked for the English and French terms above. The exact candidate strings do not occur in prior A7 proposals or the A7 plan entries. The plain `candidate-barley-meal` record and active malted-barley-flour row were inspected as adjacent but distinct owners. The corpus search covered every manifest path and ingredient-row object. The query simulation followed the current `IngredientReferenceSearchIndex` complete-phrase-then-partial-match behavior.

## Sources and limits

| Source ID | Source and locator | Claim supported and limit |
| --- | --- | --- |
| `WP02-A7-MALTED-BARLEY-MEAL-20261013-R45-S01` | Wurzelwerk, [Malted Barley Meal](https://wurzelwerk.bio/products/wurzelwerk-malted-barley-meal), reviewed 2026-10-13; title/region/availability at page lines 70–81 and 98; soil use at lines 99–106; dosing at lines 109–121. | Direct listing for the exact English phrase; product is described for Living Soil, gardens, plants, and substrate, not human food. German-market page, no French product display; listing showed sold out. Horticultural dosage is excluded from recipe use. |
| `WP02-A7-MALTED-BARLEY-MEAL-20261013-R45-S02` | Post Consumer Brands, [Malt-O-Meal Original Hot Wheat Cereal](https://www.postconsumerbrands.com/brands/malt-o-meal-hot/products/malt-o-meal-original-hot-wheat-cereal/), reviewed 2026-10-13; product/serving at page lines 4–16 and ingredient statement at lines 68–79. | Current manufacturer food label says `Wheat Farina, Malted Barley`. The 3 Tbsp (35 g) amount is the complete cereal serving, not a barley-meal measure. U.S. product page; no Québec French wording or separate malted-barley amount. |
| `WP02-A7-MALTED-BARLEY-MEAL-20261013-R45-S03` | OQLF, [malt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26545137/malt), updated 2018; definition and notes at lines 19–47. | Supports French `malt` and the grain treatment meaning. It does not provide a food-meal name or support a `gruau`/`farine` translation for this candidate. |
| Reused `WP02-S110` | OQLF, [farine d'orge maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee), existing ledger source, last updated 1984; preferred French term and English equivalent. | Pairs `farine d'orge maltée` with `malt barley flour` in the flour domain. Does not define barley meal. |
| Reused `WP02-S111` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), current page rechecked 2026-10-13; Volume 12 clauses 12.1.1(c)(ii) and 12.2.1(f), (h), page lines 1677–79 and 1718–21. | Distinguishes malted barley flour, malt flour, and the broader non-wheat-meal ingredient class. It does not define malted barley meal or determine Québec consumer naming. |
| Reused `WP03-BW-GROATS-QC-20261011-S02` | OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), 1983 brewing/malt-crushing domain; definitions/notes at lines 19–43. | Describes technical grits from malt crushing; not a product-specific Québec French name for culinary malted barley meal. |

## Next action

Keep `malted barley meal` outside the active catalog and do not add an alias, form, legacy identity, ledger candidate, density, mapping, measure, recipe link, conversion, yield, or substitution. Reopen only if a current food manufacturer or technically accountable food supplier documents a standalone edible malted-barley meal product and its milling boundary, and a source-backed Québec French display is available. Any future measurement or substitution work must be for that food product/form, not the soil amendment or the complete Malt-O-Meal cereal.
