# WP03 Section F: corn poha thickness-grade review (R750)

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated as a documentation-only hold in the [R749–R751 batch record](../batches/wp02-wp03-wp04-r749-r751-gap-review-integration-20261018/README.md); no catalog or ledger data changed.
- **Scope:** Determine whether thin, medium, and thick commercial thickness grades can be assigned to the existing `ingredient-ref-corn-poha` identity, while keeping the distinct rice-poha forms on their current owner.
- **Plan checkpoint:** The regional cereal and preprocessed-grain sweep remains open at [Section F, line 4813](../../RecipeBook-global-ingredient-catalog-plan.txt#L4840). The maize identity itself was integrated as an identity-only row in the [maize-poha integration record](../batches/wp03-section-f-maize-poha-identity-integration-20261012/README.md). This review asks a separate, bounded forms question; it does not reopen that identity decision.
- **Disposition:** **Hold; make no catalog or ledger change.** The reviewed sources do not establish thin, medium, and thick as grades of corn poha. The clear grade and French labels in the active catalog belong to rice poha; other sources either list corn and graded poha separately or describe one manufacturer's corn product without named grades.

## Exact proposed delta

None. Keep `ingredient-ref-corn-poha` unchanged as `corn poha / poha de maïs`, with its current aliases. Do not add thin, medium, or thick corn-poha forms, form match terms, French grade labels, measurements, or source records. Keep the existing thin, medium, and thick forms attached only to `ingredient-ref-flattened-rice-poha`.

In particular, do not copy the rice forms' French labels (`flocons de riz fins/moyens/épais (poha)`) onto maize. Do not infer that Babji's product called “Makai Poha Small” is a thin-grade product: its page describes small maize grits and fine pressing, but does not call the resulting poha thin, medium, or thick. Add no density, unit mapping, volume or mass measure, conversion, cooking yield, recipe link, or substitution, and do not change the corn-poha ledger research states.

## Live catalog and source ownership

The current active reference is [ingredient-ref-corn-poha](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json); its English aliases are `maize poha`, `makai poha`, and `makka poha`, and its French alias is `makkai poha`. It has null default density and no unit mappings. It has no forms in [ingredient-forms.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json).

The separate `ingredient-ref-flattened-rice-poha` owns the three commercial forms in that same forms file. The catalog's source ledger attaches their prior grade evidence to the rice-poha record, not the corn-poha record: [research-ledger.v1.json](../research-ledger.v1.json), source IDs `WP03-POHA-GRADES-20261010-S01` through `S04`. In particular, the Canadian French listings for `Poha fin` and `Poha épais (flocons de riz)` explicitly describe flattened rice. The existing review says these are market-grade names without standardized dimensional cutoffs and excludes maize poha from that decision; see the [rice-poha grade integration record](../batches/poha-thickness-synonyms-integration-20261010/README.md).

The table distinguishes already-owned evidence from the source URLs newly inspected for this proposal. `R750-Sxx` labels are local references for this review only; **no ledger source ID is proposed**.

| Review label | Source and observed evidence | Ownership and limit |
| --- | --- | --- |
| Existing `WP03-MAKAI-20261012-S04`; reviewed again as R750-S01 | [Babji Food Industries, maize flakes and Makai Poha](https://babjifoods.com/). The current manufacturer page lists “Corn Flakes (Makai Poha)” and “Corn Flakes (Makai Poha Small)” separately. The small product is made from small maize grits using fine pressing; the page says thickness is uniform but gives no thin/medium/thick product-grade family. | This URL is already owned by `ingredient-ref-corn-poha` under `WP03-MAKAI-20261012-S04`; no new source ID or duplicate ledger row. Its small-grit process and bulk package are manufacturer-specific, not a reusable grade or measure. The page separately distinguishes maize grits and cattle-feed “Poha Waste”; those boundaries remain intact. |
| R750-S02 | [HOS Global Foods, Laxmi 2024 catalog](https://laxmihos.com/static/media/LAXMI-CATALOG-2024-FINAL-2.3bbaee70c7de4a144951.pdf). The North American brand catalog lists a distinct `LAXMI CORN POHA` item (LCPC5), alongside `LAXMI POHA THIN` and `LAXMI POHA THICK` item codes. | Exact URL has no existing research-ledger owner. This is a 2024 catalog and the latest Laxmi catalog located in this review; it identifies separate product lines but does not say the thin/thick items are corn products or describe their grain. It cannot establish corn-poha thickness forms. |
| R750-S03 | [Pramukh Food, Indian Cereals](https://pramukhfood.com/products/indian_cereals). The manufacturer's current indexed catalog lists `Thin Poha`, `Medium Poha`, and `Thick Poha` as separate entries and also lists `Poha Corn` separately. | Exact URL has no existing research-ledger owner. Search-indexed page text was available, but a direct open returned a cache miss. The listing does not state that thin/medium/thick entries are corn products; it supports keeping the corn and grade entries separate at this source boundary only. |
| R750-S04 | [Namaste Supermarket, Poha (Flattened Rice)](https://namastemississauga.ca/category/flour-grains-rice/01a05979-7b1a-7dd3-a067-b8c9c18b0ddb/poha-flattened-rice/a0b0f2dc-7593-4b39-a255-5f4ada2fc06f) and [Chakki Fresh brand listing](https://namastemississauga.ca/brand/chakki-fresh/019a4da4-2fda-788c-ac04-addd29ae1817). The current indexed Canadian listings show Chakki Fresh Corn Poha separately from Chakki Fresh Poha Thin and Fresh Thick Poha. | Neither exact URL has an existing research-ledger owner. Namaste is a Mississauga retailer, not the product manufacturer. The indexed category page is headed “Poha (Flattened Rice)”; however, the direct brand-page retrieval did not expose its indexed product rows, so these listings are corroborative retail evidence, not proof of a corn grade or a live-stock claim. |
| R750-S05 | [Indya Foods, Rice Flakes](https://indyafoods.com.au/products-range/dry-grocery/rice-flakes). Under a page headed “Rice Flakes” and describing flakes made from rice grains, the distributor lists thin, medium, and thick poha products separately from `Indya Makai Poha (Corn Poha)` SKUs. | Exact URL has no existing research-ledger owner. This is an Australian distributor, not a Canadian market source or corn-poha manufacturer; it corroborates that this supplier's named grades and corn product are distinct, but does not define universal taxonomy. |

No reviewed Canadian/Québec source provides the bilingual grade names `thin corn poha` / `poha de maïs fin`, or attaches `thin poha` / `poha fin` to corn poha. The existing Québec French forms remain supported only for flattened rice. The current provisional corn display and alias remain unchanged; no OQLF or TERMIUM terminology ruling for a corn-poha grade is claimed.

## Picker projection

I inspected [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Search normalizes accents, prefers complete word phrases across reference names, aliases, and attached form terms, and returns matching base references. Static projection against the current references and forms gives:

| Query | Current exact result | If rice-grade names/match terms were copied to corn poha |
| --- | --- | --- |
| `thin poha` | `ingredient-ref-flattened-rice-poha` | `ingredient-ref-corn-poha` and `ingredient-ref-flattened-rice-poha` |
| `poha fin` | `ingredient-ref-flattened-rice-poha` | `ingredient-ref-corn-poha` and `ingredient-ref-flattened-rice-poha` |
| `medium poha` / `poha moyen` | `ingredient-ref-flattened-rice-poha` | Corn and flattened rice |
| `thick poha` / `poha épais` | `ingredient-ref-flattened-rice-poha` | Corn and flattened rice |
| `corn poha` / `poha de maïs` / `makai poha` | `ingredient-ref-corn-poha` | Corn poha only |
| `poha` | Corn poha, flattened rice poha, red rice flakes | Same three base references; forms do not create a fourth identity |

The duplicate phrase projection would make the exact English and French thin-grade queries ambiguous and would attach rice-worded French labels to maize. New grain-qualified terms could avoid that collision only if source-supported bilingual labels were found; this review found none. No forms are proposed, so the live picker remains unchanged.

## Bundled recipe demand

I scanned all recipe paths listed in [manifest.v1.json](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json): **114 recipes and 1,123 structured ingredient rows**. There are no ingredient rows linked to `ingredient-ref-corn-poha` and no recipe text hits for `corn poha`, `maize poha`, `makai poha`, `makka poha`, `poha de maïs`, `makkai poha`, `thin poha`, or `poha fin`. The corpus supplies no demand for a corn thickness form.

## Static review checks

- Re-read [AGENTS.md](../../../AGENTS.md#L25), the active [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4840), the current [roadmap](../../../roadmap.md), the maize-poha integration record, and the rice-poha grade integration record. Section F remains open; this is a separate forms review from the completed identity row.
- Confirmed current IDs, names, aliases, null density, empty mappings, and form ownership by reading both active catalog JSON files. Confirmed ledger ownership for the existing Babji source and prior rice-grade sources; exact URL checks found no ledger owner for R750-S02 through S05. No ledger change is proposed.
- Audited current and conditional picker results from the search implementation and live data; scanned the manifest-listed recipe corpus as reported above.
- This was integrated as a documentation-only hold. No app tests, build, emulator run, or deployment were run; [AGENTS.md](../../../AGENTS.md#L25) exempts database-JSON-only additions, and this review made no database change.
- Verified the saved Markdown for UTF-8 without BOM, all 12 relative links resolving, no trailing whitespace, and no mojibake markers.
