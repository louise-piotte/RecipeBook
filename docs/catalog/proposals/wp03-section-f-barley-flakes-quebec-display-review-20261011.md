# WP03 Section F — independent Québec French review of barley flakes

- **Reviewed:** 2026-10-11
- **Status:** Independent display review; proposal only.
- **Target:** Active `ingredient-ref-barley-flakes`, English display `barley flakes`, fr-CA display `flocons d'orge`.
- **Plan context:** The Section F plan records the row as integrated while leaving its independent Québec wording review open. This packet resolves that wording review only; broader Section F coverage remains open.
- **Scope:** Review Canadian and Québec food-product wording, exact catalog collisions, and bundled recipe demand. Keep human-food barley flakes separate from brewing adjuncts. No catalog, ledger, recipe, plan, roadmap, or integration file was changed.
- **Proposal-local source IDs:** `WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S01` through `S08`; `[S01]` etc. abbreviate the full prefix. These IDs belong only to this packet.

## Recommendation

**Accept the active fr-CA display `flocons d'orge` for the human-food barley-flakes identity.** The exact pair is present on Yupik’s Canadian English and French pages for the same SKU, and the French wording also appears in Québec food-retail listings. The label is product-attested and locally used; targeted OQLF and TERMIUM searches did not surface an entry for the exact compound, so this recommendation is not an official terminology ruling [S01–S04, S06–S07].

Keep the identity scoped to plain human-food barley flakes. The Québec brewing-supply page reviewed here uses the same short French phrase in the title of a brewing adjunct, but labels the full product `Toasted Barley Flakes`, places it under beer-brewing grains and malt, and describes it as non-malted and partially gelatinized [S05]. That product context does not make it an alias or food substitute. Keep the food reference’s aliases empty and do not map it to toasted, malted, or brewing-qualified flakes.

## Exact catalog and recipe audit

The current bundled package contains **1,088 active ingredient references**, **79 ingredient forms**, **75 legacy candidates**, and **1,387 research-ledger records**. Its manifest lists **114 recipes** with **1,123 ingredient rows**.

| Audit | Result |
| --- | --- |
| Active reference | `ingredient-ref-barley-flakes` occurs once and owns exactly `barley flakes / flocons d'orge`; both alias arrays are empty. `defaultDensity` is null and `unitMappings` is empty. |
| Exact normalized reference keys | `barley flakes` and `flocons d'orge` resolve only to the target row. No second active reference owns either key. Exact candidate spellings `barley flake`, `flaked barley`, `rolled barley`, `orge en flocons`, `orge aplati ou en flocons`, `toasted barley flakes`, `malted barley flakes`, and `flocons d'orge biologiques` have no active exact owner. |
| Neighboring active rows | Keep separate from `ingredient-ref-hulled-barley`, `ingredient-ref-pearl-barley`, `ingredient-ref-pot-barley`, `ingredient-ref-puffed-barley`, `ingredient-ref-barley-flour`, `ingredient-ref-whole-barley-flour`, `ingredient-ref-malted-barley-flour`, and `ingredient-ref-roasted-barley-flour`. The broad words `barley` and `orge` are shared across these rows and are not unique search terms. |
| Forms | No form label or match term exactly matches the reviewed flake names or variants. Do not add a dry/cooked form: flaking is the named product identity, and no recipe requests a preparation state. |
| Legacy candidates | No exact candidate ID, display, or alias matches the reviewed flakes terms; the target ID occurs zero times in legacy candidates. |
| Research ledger | One verified ingredient-reference record is keyed to `ingredient-ref-barley-flakes`. It records `researched_no_supported_value` for measurement and `researched_no_supported_substitute`; no separate exact candidate record was found. The unresolved pot-barley and barley-meal records remain distinct. |
| Manifest recipes | Exact and broad `barley` / `orge` searches across all manifest-listed ingredient rows found **0 matches in 0 recipes**: **0/114 recipe files** and **0/1,123 rows**. No recipe link or ingredient-line edit is supported. |

The search-key audit used the repository’s `normalize_search_key` behavior (case-folding, accent and ligature folding, and punctuation-to-space normalization). Recipe matching inspected each ingredient row’s string fields, including source text, ingredient name, preparation, notes, and reference/form identifiers where present.

## Source-to-claim table

| Source ID | Source | Claim supported and limits |
| --- | --- | --- |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S01 | Yupik, [Organic Barley Flakes](https://yupik.com/en/organic-barley-flakes-p31002) | The current English page names SKU P31002 `Organic Barley Flakes`, says it is prepared in Canada, and describes this SKU’s barley grains as steamed, rolled, and lightly roasted. It supports the English food-product identity and one product process example, not a universal process or the generic portion. Its 1/2-cup (45 g) serving is SKU-specific. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S02 | Yupik, [Flocons d'orge biologiques](https://yupik.com/fr/organic-barley-flakes-p31002) | The French page uses `flocons d'orge biologiques` in the title and product description for the same SKU P31002 and describes the same food product. Its ingredient line contains a grammatical omission (`Flocons orge`); this review relies on the title and description, not that line. Its organic qualifier and cooking ratio remain product-specific. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S03 | La Boîte à Grains, [Flocons d'Orge Biologiques (Vrac)](https://laboiteagrains.com/products/flocons-dorge-orge-biologiques-vrac) | A Québec retailer lists bulk barley under the exact compound and gives the format by kilogram. The current page reports the item out of stock, so this confirms local product naming, not current availability, a general measure, or non-organic specifications. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S04 | Avril, [Flocons d'orge biologiques](https://avril.ca/fr/flocons-biologiques-flocons-d-orge.html) | The Québec chain lists a Milanaise product as `Flocons d'orge biologiques` and describes its use in muffins and biscuits. The page shows no delivery or pickup availability at review time; retain it as product-name and use evidence, not an availability claim or process standard. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S05 | Hoppy, [Toasted Barley Flakes (Flocons d'orge) — OIO](https://www.hoppy.ca/products/toasted-barley-flakes-flocons-dorge-oio) | The Québec supplier categorizes the product under grains and malt for beer brewing. Its description says the OIO flakes are non-malted and partially gelatinized. The page demonstrates an overlapping French title in a brewing context; it does not make this brewing adjunct the same product as food flakes or establish a brewing alias. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S06 | OQLF, GDT: [orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge) | Gives `orge` as the preferred feminine term for barley as plant and grain. The entry is part of a brewing vocabulary and does not give a preferred compound for food flakes. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S07 | OQLF, GDT: [grain entier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544101/grain-entier) | Says whole grains can be intact, cracked, in flakes, broken, or milled. This supports flakes as one possible grain state in general, not the exact phrase `flocons d'orge`, a barley-specific process, or a claim that every barley-flake product is whole grain. |
| WP03-BARLEY-FLAKES-QUEBEC-DISPLAY-REVIEW-20261011-S08 | Statistics Canada, [Cereals and Oilseeds Review, November 2008](https://www150.statcan.gc.ca/n1/pub/22-007-x/22-007-x2008011-eng.pdf) | The bilingual commodity table lists `Barley, rolled or flaked / Orge, aplati ou en flocons` separately from worked barley such as hulled or pearled grain. This is older classification wording, not a current consumer-label standard or a reason to add that longer phrase as an alias. |

Exact compound searches in OQLF and TERMIUM did not surface a barley-flakes terminology record. That is a bounded search result, not proof that no record exists. The OQLF records above support the base term and general grain-flake state only; the exact display recommendation rests on paired Canadian product naming and Québec food-retail usage [S01–S04, S06–S07].

## Catalog disposition and limits

- Keep `ingredient-ref-barley-flakes` as `barley flakes / flocons d'orge` in `GRAIN_AND_CEREAL`; the independent fr-CA review accepts the display for human-food flakes.
- Keep EN and FR aliases empty. In particular, do not add `rolled barley`, `flaked barley`, `orge en flocons`, `orge aplati ou en flocons`, `organic barley flakes`, or the brewing-page title as aliases. The product title/source context is sufficient for this identity; broader terms could blur product classes or introduce certification claims.
- Keep density null, unit mappings empty, and forms absent. Yupik’s 1/2 cup (45 g), cooking ratio, and cooking time describe that SKU only [S01–S02]; they are not general barley-flake conversions.
- Keep the Québec brewing adjunct separate. Do not merge or alias it to the food identity based on shared French wording; its English qualifier, brewing category, and processing context define a different use [S05].
- The ledger’s prior verified identity and no-supported-measurement/substitute findings remain consistent with this wording review. No ledger edits are proposed.
- The Section F wording review for this identity can be marked complete during later coordination; the wider Section F task remains open.

## Review notes

- This packet independently reviews the active Québec French display and its product-scope boundary. It does not re-open the identity decision or add processing, measurements, forms, conversions, yields, recipe links, or substitutions.
- No tests were run; this was source research, read-only package auditing, and a proposal-file addition.
