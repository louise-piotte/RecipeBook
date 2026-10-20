# WP03 Section F Regional Cereal-Process Gap Review — Barley Flakes

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal only. This packet changes no canonical seed, ledger, legacy, recipe, plan, roadmap, generated, or test file.
- **Scope:** one food-grade preprocessed grain product: plain barley flakes. This is a focused candidate for Section F's open regional cereal-mix and preprocessed-grain coverage. It does not reopen the recently reviewed farro, pot-barley, pozole-corn, dried-sweet-corn, grits, granola/muesli, or puffed-grain work.
- **Recommendation:** accept a separate identity-only reference for the marketed cereal product `barley flakes / flocons d'orge`. Keep both alias arrays empty and leave forms, measures, conversions, yields, and active substitutions empty. Keep independent Québec French terminology review open; the French display is supported by a current Canadian brand product page and Québec retail use, not an OQLF ruling.
- **Snapshot inspected:** 877 active references, 48 ingredient forms, 1,122 research-ledger records (2,735 source entries), 77 legacy candidates, 114 manifest-listed recipes, and 1,123 ingredient rows.

## Candidate boundary and proposed row

| Candidate or wording | Disposition | Scope and limits |
| --- | --- | --- |
| `barley flakes / flocons d'orge` | **Accept for integration review** | Food-grade barley marketed as flakes. A current Canadian brand page describes its product as barley grains that are steamed, rolled, and lightly roasted, and offers it for hot cereal, granola, baking, and soup. The accepted identity does not claim every product has that exact process, is whole-grain, organic, or ready to eat without cooking. |
| `rolled barley`, `flaked barley`, `orge aplati ou en flocons` | **Do not add as aliases in this packet** | Statistics Canada's bilingual commodity table uses these broader classification terms, but the simpler market display is directly attested on a Québec-facing bilingual product page. Keep the official classification wording as evidence, not extra search aliases. |
| `orge en flocons` | **Hold as a possible French alias** | A current Bulk Barn French search listing uses this as a product title and gives food-cooking directions, but the dynamic product page could not be fetched for direct review. The exact French display already has direct manufacturer and Québec retailer support. |
| `toasted barley flakes` / brewing-supply `flocons d'orge` | **Do not add as an alias or define as a separate row here** | A Québec brewing supplier sells a similarly named barley-flake adjunct for brewing, described as non-malted and partially gelatinized. Its precise process relationship to food cereal flakes is not established. Keep this qualifier out of the plain food identity pending a product-specific review. |
| `organic barley flakes`, `flocons d'orge biologiques` | **Do not add as aliases** | Organic is a product certification/claim, not a general ingredient name. |
| `barley cereal`, `breakfast cereal`, `cereal flakes`, or `malted barley flakes` | **Do not add as aliases** | These are broader product classes or may name different formulations and processing. |

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and data |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-barley-flakes` | `barley flakes` | `flocons d'orge` | none | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

The identity is distinct from intact/processed hulled or pearl barley and from barley flour. Flaking is the named product transformation, as with the existing corn-flakes and rolled-oats identities; do not represent it as a dry/cooked form of generic barley or hulled barley. Do not merge it with brewing malt or any of the active barley flour products.

## Current catalog, ledger, legacy, and collision audit

The live references contain `ingredient-ref-hulled-barley` (`hulled barley / orge mondé`), `ingredient-ref-pearl-barley` (`pearl barley / orge perlé`), and the separate `ingredient-ref-barley-flour`, `ingredient-ref-malted-barley-flour`, and `ingredient-ref-roasted-barley-flour` products. The roasted-flour row owns the English alias `toasted barley flour`; that key remains distinct from the proposed flake identity. No active barley reference has a barley-flake form.

I used the repository's `normalize_search_key` rules (case-folding, Unicode decomposition/accent folding, ligature folding, then punctuation-to-space normalization) against all active reference names and aliases, all form labels and match terms, and the proposed strings. There is no exact normalized collision for `ingredient-ref-barley-flakes`, `barley flakes`, or `flocons d'orge`. The ID is absent from the live seed. Exact lookup terms do not collide with the active hulled/pearl barley or flour identities; broad `barley` and `orge` searches can still match neighboring products and are not claimed to be unique.

The ledger contains existing barley-related identities and holds, including active hulled/pearl/barley-flour records plus `candidate-barley-meal` and `ingredient-ref-pot-barley` (`needs_clarification`). None of the ledger's 1,121 records contains an exact normalized candidate ID/name/alias for barley flakes. The 77 legacy candidates likewise contain no matching ID or exact normalized term. Preserve the unresolved pot-barley and barley-meal records; neither is an alias or substitute for flakes. The package contains 48 forms, none with an exact barley-flake label or match term.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched in `originalText`, `ingredientName`, and reference/form ID or label fields with accent- and punctuation-folded phrase matching.

| Query set | Recipe files / ingredient rows matched | Disposition |
| --- | --- | --- |
| `barley flakes`, `barley flake`, `rolled barley`, `flaked barley` | 0 / 0 | No recipe link or text change. |
| `flocons d'orge`, `orge en flocons`, `orge aplati`, `orge aplati ou en flocons` | 0 / 0 | No French recipe-line demand. |
| Broad `barley`, `orge` | 0 / 0 | No bundled barley ingredient lines, including lines for the neighboring active barley identities. |

This is no-demand coverage, not a reason to add a form or convert another barley row. The product is proposed to close one concrete catalog gap supported by current Canadian/Québec food-market evidence.

## Measurement, form, yield, and substitution status

| Concern | Evidence-qualified disposition |
| --- | --- |
| **Identity** | One new `GRAIN_AND_CEREAL` identity for the food product `barley flakes / flocons d'orge`; no cultivar, brand, organic, or specific whole-grain claim. |
| **Forms** | Add no `IngredientForm`. The flaked product is the identity's defining processed product; no bundled recipe requests its dry or cooked state. Do not create a barley dry/cooked form or attach flakes to hulled barley. |
| **Measurements** | Keep `defaultDensity` null and `unitMappings` empty. Yupik lists one branded product serving of 1/2 cup (45 g); this is a product-specific portion, not a general barley-flake density or transferable conversion. Do not promote it to a catalog default. |
| **Conversions and cooking yield** | Add no mass-volume conversion, water conversion, dry-to-cooked yield, or package yield. Yupik's product instructions give 1 cup flakes with 2 cups water and about 20 minutes; Bulk Barn's indexed product instructions give 1/2 cup flakes with 1 cup water and about 9–14 minutes. These are cooking directions for particular products, not a general quantity relation or cooked-yield measurement. |
| **Substitutions** | Activate no global or contextual rule. Yupik markets its flakes as an alternative to rolled oats and suggests using them in recipes calling for rolled oats, but supplies no general amount equivalence or method-specific limits. Retain that as a product-specific suggestion only; it does not establish a safe automatic replacement rule for bundled recipes. |
| **Research states** | If integrated, keep measurement and substitution research explicitly incomplete (`not_yet_researched`) unless the coordinator adds separately qualified source observations. No numeric or substitution data should be activated from this packet. |

## Source register

Sources were reviewed on 2026-10-10. Publication/update dates are shown where provided.

| Source ID | Source and URL | Evidence and limits |
| --- | --- | --- |
| `WP03-BARLEY-FLAKES-20261010-S01` | Health Canada, [Summary of its assessment of a health claim about barley products and blood cholesterol lowering](https://www.canada.ca/en/health-canada/services/food-nutrition/food-labelling/health-claims/assessments/assessment-health-claim-about-barley-products-blood-cholesterol-lowering.html), 2012-07-12 | Footnote 5 explicitly includes barley flakes among barley grain food products and lists them separately from pearl barley, grits, meal, flour, and bran. Supports a separate food-product class; it is not a flake-processing specification, term preference, or recipe-measure source. Accessed 2026-10-10. |
| `WP03-BARLEY-FLAKES-20261010-S02` | Statistics Canada, [Cereals and Oilseeds Review, November 2006](https://www150.statcan.gc.ca/n1/pub/22-007-x/22-007-x2006011-fra.pdf), p. 9, table 1 | Bilingual trade table lists `Barley, rolled or flaked / Orge, aplati ou en flocons` separately from `Barley, worked (hulled, pearled, etc.)`. Supports the processed-grain boundary and an official bilingual description; it is an older commodity classification, not a consumer-label standard. Accessed 2026-10-10. |
| `WP03-BARLEY-FLAKES-20261010-S03` | Yupik, [Organic Barley Flakes](https://yupik.com/en/organic-barley-flakes-p31002) | Current brand product listing names the Canadian product, describes steamed, rolled, lightly roasted barley grains, and identifies hot cereal, granola, baking, and soup uses. It also lists a brand-specific 1/2-cup (45 g) portion and product cooking directions; neither is generalized. The organic claim is not part of the proposed identity. Accessed 2026-10-10. |
| `WP03-BARLEY-FLAKES-20261010-S04` | Yupik, [Flocons d'orge biologiques](https://yupik.com/fr/organic-barley-flakes-p31002) | Paired French brand page for the same SKU uses the exact French product phrase `flocons d'orge`. Its description gives product-specific uses, instructions, and a brand portion, not a universal term ruling or measure. Accessed 2026-10-10. |
| `WP03-BARLEY-FLAKES-20261010-S05` | La Boîte à Grains, [Flocons d'Orge Biologiques (Vrac)](https://laboiteagrains.com/products/flocons-dorge-orge-biologiques-vrac) | Québec retailer listing uses `flocons d'orge` for a bulk food product sold by kilogram. It supports Québec-market French use but does not establish a non-organic product specification or any measurement mapping. Accessed 2026-10-10. |
| `WP03-BARLEY-FLAKES-20261010-S06` | Québec Food Directory, [Aphrodisiac](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202184), last updated 2026-07-08 | Montréal-made granola's ingredient statement includes `flocons d'orge` as a distinct component alongside oat and rye flakes. Supports local culinary use of the French phrase, not a standalone product's processing or a substitution. Accessed 2026-10-10. |
| `WP03-BARLEY-FLAKES-20261010-S07` | Bulk Barn, [Orge en flocons](https://www.bulkbarn.ca/fr/Products/All/Organic-Barley-Flakes-3051) | Search-indexed French listing gives this product title and food-cooking directions (1/2 cup flakes to 1 cup water). The dynamic page could not be fetched directly on 2026-10-10, so `orge en flocons` is not proposed as an alias and the indexed cooking details remain product-specific. |
| `WP03-BARLEY-FLAKES-20261010-S08` | Hoppy, Québec, [Toasted Barley Flakes (Flocons d'orge) — OIO](https://www.hoppy.ca/products/toasted-barley-flakes-flocons-dorge-oio) | Québec brewing-supply listing labels the product `Toasted Barley Flakes (Flocons d'orge)`, categorizes it under grains and malt for beer brewing, and describes it as non-malted and partially gelatinized. This supports keeping the brewing-qualified phrase out of the plain food alias set; it does not establish that the flakes are a separate ingredient identity. Accessed 2026-10-10. |

No OQLF or TERMIUM preferred entry for this food product surfaced in this review. The proposed French display is a current brand/Québec-market name, not an official-language-authority decision.

## Acceptance checks for coordinator integration

1. Add only `ingredient-ref-barley-flakes` with the display pair and empty aliases shown above, if accepted; retain `GRAIN_AND_CEREAL` classification.
2. Keep density null, unit mappings empty, and all ingredient forms, package yields, conversions, and active substitutions absent. Do not convert the brand-specific 45 g per 1/2 cup or cooking directions into generic catalog values.
3. Verify exact normalized searches for `barley flakes` and `flocons d'orge` resolve to the new identity in a clean catalog and do not relink hulled/pearl barley or barley-flour lines. Treat broad `barley` and `orge` searches as potentially multi-result.
4. Preserve the zero-hit recipe audit: no recipe text, ingredient reference, amount, or form change is supported.
5. Keep source-specific cooking and rolled-oat suggestions outside automatic conversion/substitution behavior; retain independent Québec wording review.

## Remaining Section F gaps

This packet does not close the wider Section F sweep. Keep the existing reviews and holds intact for generic sushi rice, unqualified farro, pot/Scotch barley and its French name, generic ordinary grits/polenta, pearled hominy, pozole corn, and dried sweet corn. Continue the bulgur grade crosswalk questions (including very-coarse/No. 5 terminology), regional cereal-mix coverage beyond the recently integrated granola and muesli, and remaining source-backed species/product discovery across millet, sorghum, fonio, quinoa, and amaranth. Independent Québec French review remains open. Add dry/cooked forms only when a specific recipe or separately qualified evidence requires them; this proposal creates no such requirement.
