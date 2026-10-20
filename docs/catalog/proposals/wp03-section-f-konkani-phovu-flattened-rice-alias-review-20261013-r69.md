# WP03 Section F — Konkani `phovu` flattened-rice alias review (2026-10-13, round 69)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, ledger, roadmap, plan, checklist, or code file was changed.
- **Candidate:** Bare Roman-script Konkani `phovu` as a product search name for flattened rice / rice flakes.
- **Disposition:** The word is not unambiguous across every Konkani food context: it also appears inside names for prepared dishes. The product sense is directly supported in a food-grains table and in recipe ingredient lines, so accept only bare `phovu` as an English-search alias on the existing flattened-rice identity. Keep dish phrases and other spellings out.
- **Open checklist:** The Section F item for regionally significant cereal mixes and preprocessed grains remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2701) and the [plant-grains checklist](../batches/plant-grains-cereals.md).

## Prior-review and ownership audit

Before this file was written, searches of the existing proposal/batch archive, active plan, and research ledger found no `phovu` mention or disposition. The current round of poha reviews has separately integrated `chiura`, `aval`, `atukulu`, `avalakki`, `chira`, `chuda`, and `sira`; none covers this spelling. This candidate is therefore distinct from the recorded aliases and prior holds.

A normalized exact-key scan covered active ingredient reference names and aliases, form labels and match terms, legacy candidate fields, and all ledger record strings. It found no exact owner for `phovu` in any of those collections. Current package counts are 1,390 active references, 100 forms, 63 legacy candidates, and 1,723 ledger records. Before this proposal was added to the archive, its five proposal-local source IDs and new URLs below were absent from the ledger and existing proposal/batch files. Sources already registered in the ledger are cited under their existing IDs.

| Existing owner or neighbor | Current state | Boundary retained |
| --- | --- | --- |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`; English aliases include `rice flakes`, `chiura`, `aval`, `atukulu`, `avalakki`, `chira`, `chuda`, and `sira`; French aliases are `riz aplati` and `riz battu`. | Proposed owner for the bare ingredient sense `phovu`. Keep the English and French displays and all French aliases unchanged. |
| `ingredient-ref-puffed-rice` | Separate puffed-rice product. | Konkani language table lists `Phovu` as rice flakes and a different Konkani name for puffed rice. Keep the products separate. |
| `ingredient-ref-red-rice-flakes` | Red-rice flakes; owns qualified wording such as `red rice poha`. | Do not add a red/color-qualified product under bare `phovu`. |
| `ingredient-ref-corn-poha` | Maize flakes sold under poha wording. | Do not use bare `phovu` for corn flakes. |
| `ingredient-ref-brown-rice-flakes` | Brown-rice flakes. | Keep grain-color wording explicit. |

## Identity evidence and scope of the term

The Central Bank of India’s Konkani language-learning table places `Phovu` under “Foodgrains/Pulses” and pairs it with English “RICE FLAKES.” A current Konkani cooking page uses `phovu` in the ingredient line for “flattened rice (medium thick poha variety)” and names the prepared stir-fry `phovu phaan`. Another calls a potato-and-beaten-rice prepared dish `Batat Phovu`. Together these support the bare product sense while showing why the alias must not absorb compound dish names.

The word should not be described as universally ingredient-only. The cited table and recipe sources cover Konkani food terminology and GSB home-cooking contexts. A secondary [Wiktionary Konkani entry for `phovu`](https://en.wiktionary.org/wiki/%E0%A4%AB%E0%A5%8B%E0%A4%B5%E0%A5%81), citing Turner’s 1969–1985 comparative dictionary, records both flattened rice/poha and a dish-by-metonym sense. I treat that as evidence of lexical ambiguity, not as a direct inspection of Turner’s printed dictionary. Here the catalog use is narrower: a bare ingredient query selects a catalog ingredient. An exact multiword query for a prepared dish is not added and, with this one-word alias, does not match the flattened-rice row.

For the underlying product class, the existing CFTRI record identifies rice flakes as poha and describes one traditional process using soaked paddy, roasting, and flaking. The current National Portal of India separately describes poha as flattened parboiled rice and names puffed rice as another product. These sources support the existing product identity and process boundary; they do not define a universal process for every product called `phovu`.

## Bilingual product naming

| Field | Current / proposed treatment |
| --- | --- |
| English display | Keep `flattened rice (poha)`. |
| English aliases | Add only bare `phovu` to the existing aliases. |
| Québec French display | Keep `flocons de riz (poha)`. A current Provigo fr-CA listing uses this wording for Suraj Poha; existing ledger source `WP03-S95` records the same Canadian French product wording. |
| French aliases | Keep `riz aplati` and `riz battu`; do not add `phovu` to `aliasesFr`. No reviewed Québec French source gives `phovu` as a French product name or alias. |
| Category | Keep `GRAIN_AND_CEREAL`. |

The Central Bank source is a Konkani/Roman-transliteration language-learning table, not a Canadian product label or a Québec terminology ruling. Its indexed row renders the Konkani entry as `पोतू / Phovu`; only the Roman form is used here. Do not introduce a Devanagari alias based on that table’s script rendering. The current Canadian French retailer wording supports the existing display only; it does not establish a formal OQLF-preferred term or local availability in every Québec store.

## Exact picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers whole normalized phrase matches and uses substring matching only when no phrase match exists. A static projection over the current names, aliases, and forms gives:

| Query | Current result | With only bare `phovu` added |
| --- | --- | --- |
| `phovu` | No result | Sole result: `ingredient-ref-flattened-rice-poha` |
| `phova` | No result | No result; spelling not proposed. |
| `phovu phaan`, `Batat Phovu`, or `Godu Phovu` | No result | No result; no prepared-dish phrase is indexed. |
| `poha` | Three results: flattened rice, red-rice flakes, and corn poha | Same three results. |
| `flattened rice` | Flattened rice only | Same result. |
| `rice flakes` | Brown-rice flakes, flattened rice, and red-rice flakes | Same three results. |
| `flocons de riz` | Brown-rice flakes and flattened rice | Same two results. |
| `riz aplati` / `riz battu` | Flattened rice only | Same result. |
| `red rice poha` | Red-rice flakes only | Same result. |
| `medium poha` | Flattened rice only, with the current medium form label | Same result and form hint. |

The alias replaces the current empty result for the exact bare term. It does not change English/French displays, existing poha collisions, grade hints, or French query behavior. This is a static projection of the current search code, not runtime picker QA.

## Recipe-demand scan

A read-only scan covered all manifest-listed recipe JSON files, complete serialized contents, ingredient rows, and existing reference links.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Hits for `phovu`, `phova`, `phov`, or `fov` | 0 |
| Hits for poha / flattened-rice names or existing flattened-rice reference ID | 0 |
| Existing links to `ingredient-ref-flattened-rice-poha` | 0 |

The bundled corpus has no current recipe demand for the term or the base ingredient. No recipe link or recipe edit is proposed.

## Forms, numeric behavior, and substitutions

The existing flattened-rice reference has `defaultDensity: null` and `unitMappings: []`. Its thin, medium, and thick commercial forms all have `densityGPerMl: null`. Keep those values and forms unchanged; do not create a `phovu` form, grade, conversion, package yield, cooking yield, or default measure.

The current Konkani recipe sources include `3/4 cup` of medium-thick phovu for a one-to-two-serving `phovu phaan` recipe and `1 cup` of medium-thick white beaten rice in a two-serving `Batat Phovu` recipe. These are recipe-specific quantities, with no mass or reproducible conversion basis. Do not turn them into a density or generic cup-to-gram observation. The industrial CFTRI process figures concern paddy-to-flake processing and a particular processing setup; they are not household portions or a generic cooking yield.

The active flattened-rice ledger record is `measurementState: researched_supported` because it already contains a distinct Bangladesh FAO/BBF `Chirar Polao` observation: 60 g / three fistfuls for the complete formula for one 230 g cooked bowl and two servings, dry chira before cooking. It is not per serving and has no fist-size protocol. Preserve that observation without generalizing it to `phovu`.

Keep `substitutionResearchState: blocked_pending_evidence`. Existing poha-grade records say thin, medium, and thick grades have no supported cross-grade replacement or ratio for a scoped dish and method. The reviewed sources provide no substitution between phovu, other rice-flake products, rice, or another ingredient. Add no global conversion, contextual substitution, or recipe-line substitution link.

## Integration sketch

| Target | If accepted for integration |
| --- | --- |
| `ingredient-ref-flattened-rice-poha.aliasesEn` | Append only `phovu`. |
| English/French display and French aliases | Keep `flattened rice (poha)`, `flocons de riz (poha)`, `riz aplati`, and `riz battu` unchanged. |
| Forms and numeric fields | Keep all three thickness forms, null densities, `defaultDensity: null`, and empty `unitMappings`; add no yield or conversion. |
| Ledger | Add the source records below and one accepted decision scoped to bare Konkani ingredient `phovu`; preserve existing measurement and blocked substitution state. |
| Recipes / other references / legacy identities | No recipe link, new reference, form, or legacy candidate. |

## Source register and limits

The five proposal-local IDs and URLs proposed as new records were checked against the live ledger and proposal/batch archive; no exact ID or URL collision was found. URLs under reused source IDs are cited without proposing duplicate records. Proposal-local sources were accessed 2026-10-13; reused source records retain their existing access dates.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PHOVU-20261013-R69-S01` | Central Bank of India, [Cent Saral Bhasha E-Learning, Konkani PDF](https://centralbankofindia.co.in/sites/default/files/%E0%A4%95%E0%A5%8B%E0%A4%95%E0%A4%A3%E0%A5%80.pdf), “Foodgrains/Pulses,” row 17. | Official language-learning table pairs English `RICE FLAKES` with Roman Konkani `Phovu`. The web index dates the document to roughly 2022, but the PDF itself does not show a clear issue date. It is language-learning material, not a food standard, product label, Québec source, or measure source. Rely on Roman `Phovu` only; the script rendering is not used as an alias. |
| `WP03-PHOVU-20261013-R69-S02` | KonkaniFoodRecipes.com, [Simple Konkani Breakfast From My Granny’s Kitchen — Poha Recipe (Phovu Phaan)](https://www.konkanifoodrecipes.com/recipes/simple-konkani-breakfast-from-my-granny-s-kitchen-poha-recipe-phovu-phaan-recipe), ingredient list and method. | Ingredient line calls `3/4 cup` flattened rice, medium-thick poha, `phovu`; the finished stir-fry is called `phovu phaan`. Community cooking source, not a regulatory or product-standard authority. Quantity is recipe-specific and has no mass conversion. |
| `WP03-PHOVU-20261013-R69-S03` | KonkaniFoodRecipes.com, [Rice flakes / Beaten rice with Potatoes (Batat Phovu, Potato Poha)](https://www.konkanifoodrecipes.com/recipes/rice-flakes-beaten-rice-with-potatoes-batat-phovu-potato-poha), title, description, and ingredient list. | Distinguishes the prepared compound name `Batat Phovu` from the ingredient line `1 cup white beaten rice (medium thick)`. Community recipe, not a standardized naming source or measure-conversion source. |
| `WP03-PHOVU-20261013-R69-S04` | Wiktionary, [फोवु (`phovu`), Konkani](https://en.wiktionary.org/wiki/%E0%A4%AB%E0%A5%8B%E0%A4%B5%E0%A5%81), lexical definitions and cited reference. | Secondary entry gives flattened rice/poha and a dish-by-metonym sense, and cites Ralph Lilley Turner, *A Comparative Dictionary of the Indo-Aryan Languages* (1969–1985). Supports the scope caution only; the Turner entry itself was not retrieved or independently inspected. |
| `WP03-PHOVU-20261013-R69-S05` | KonkaniFoodRecipes.com, [Guide to using beaten rice/flattened rice/poha in GSB Konkani cooking (Phovu)](https://www.konkanifoodrecipes.com/recipes/guide-to-using-beaten-rice-poha-in-gsb-konkani-cooking-phovu), product guide and linked dish names. | Current community guide uses `Phovu` for the beaten-rice/poha ingredient and lists compound names such as `Godu Phovu`, `Phovu Phaan`, and `Batat Phovu`. Supports the ingredient/dish-name boundary in GSB cooking context; it is not a formal dictionary or product standard. |
| Reused `WP03-RRFLAKE-QC-ALIAS-20261012-S03` | Provigo, [Aliments de l’Asie du Sud (fr-CA)](https://www.provigo.ca/fr/alimentation/aliments-internationaux/aliments-de-l-asie-du-sud/c/58045), Suraj product listing. | Existing source record for `Suraj Flocons de riz (Poha) 300 g`. Supports the current French-facing display wording in a retailer context, not an official Québec terminology ruling, phovu wording, or general availability. Package mass is not a household measure. |
| Reused `WP03-S92` | Central Food Technological Research Institute, [Improvement of the traditional process for rice flakes](https://ir.cftri.res.in/6762/), 1982 article abstract. | Identifies rice flakes as Poha/Avalakki and describes one traditional process using soaked paddy, roasting, and flaking. This is process evidence for the underlying product family, not a phovu-specific process, recipe measure, or general cooking yield. |
| Reused `WP03-S94` | National Portal of India, [Rice-based products — poha etc.](https://www.india.gov.in/explore-india/odop/details/rice-based-products-poha-etc), product description. | Describes poha as made by flattening parboiled rice and separately mentions puffed rice. The page reports a 2026-07-16 review/update date. It supports the existing product/process boundary, not the Konkani name or numeric behavior. |
| Reused `WP03-S95` | Atlantic Superstore, [International Foods (fr-CA)](https://www.atlanticsuperstore.ca/fr/clpplp/clpplp/clpplp/food/international-foods/c/58044), Suraj listing. | Existing ledger source for the Canadian French product wording `Flocons de riz (Poha)`. Retail-market wording only, not a Québec terminology ruling or phovu evidence. |

## Review checks

- Re-read current `AGENTS.md`, the Section F plan item and batch checklist, the proposal/batch archive, active catalog, legacy identities, and ledger before choosing the candidate.
- Recomputed normalized ownership, source-ID/URL collisions, picker projection, and manifest recipe counts from the current worktree.
- This file is UTF-8 without BOM. No app tests or emulator checks were run; this work is proposal-only.

## Root integration outcome

Accepted the bare `phovu` English alias on `ingredient-ref-flattened-rice-poha` on 2026-10-13, using the official food-grains table and current Konkani ingredient-line evidence. Prepared-dish phrases remain excluded. The alias was added to the seed reference and the five reviewed source records plus this scoped decision were added to the existing research-ledger record. Displays, French aliases, forms, numeric fields, recipe links, and substitution state remain unchanged. See the [integration record](../batches/wp03-section-f-phovu-alias-integration-20261013/README.md). No app tests or emulator checks were run for this database-JSON addition.
