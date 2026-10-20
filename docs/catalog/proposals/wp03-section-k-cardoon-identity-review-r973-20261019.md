# WP03 Section K — cardoon identity review (R973)

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, workflow, or roadmap data was changed.
- **Disposition:** Recommend one identity-only generic reference, cardoon / cardon, for the cultivated cardoon vegetable harvested chiefly for its edible leaf stalks.
- **Plan anchor:** Section K remains open for further leafy-vegetable, stem, and regional produce identities in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6555).
- **Scope:** One generic culinary identity. No brand, product-line, cultivar, flavour-family, SKU, or retailer-variant roster was researched.

## Recommendation

Add ingredient-ref-cardoon as a generic vegetable identity:

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-cardoon |
| English display | cardoon |
| Québec French display | cardon |
| Category | VEGETABLE_AND_AROMATIC |
| English and French aliases | Empty arrays |
| Default density | null |
| Unit mappings | Empty list |

The identity covers cultivated cardoon used as a vegetable, especially the young leaf stalks that are blanched, harvested, and cooked. The OQLF’s food-domain entry directly pairs the Québec French term cardon with English cardoon and describes its long stalks and culinary uses. University of Florida IFAS and North Carolina State Extension independently describe cardoon stalks as edible and prepared as a vegetable. [S01–S03]

Keep cardoon separate from globe artichoke, celery, celeriac, and Swiss chard. Similar flavour or stalk appearance does not make these ingredients identical. The OQLF notes that cardon is sometimes confused with Swiss chard in North America, which is a further reason to keep the display narrowly on cardon and avoid broad aliases. Do not use edible thistle, artichoke thistle, Spanish artichoke, Scotch/Scottish thistle, or botanical names as aliases: those names are broader or taxonomically noisy. Do not add a separate leaf, root, flower, preserved, or other cardoon product identity in this proposal.

## Exact ownership and bundled demand

Read-only live package snapshot on 2026-10-19:

| Surface | Live count | Candidate ownership result |
|---|---:|---|
| Ingredient references | 1,989 | No exact owner for the proposed ID, bilingual displays, or reviewed cardoon terms |
| Ingredient forms | 205 | No matching label, alias, or match-term owner |
| Legacy import candidates | 55 | No matching ID, name, or alias |
| Research-ledger records | 2,394 | No matching record ID, source, URL, observation, finding, or decision |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 | No full-recipe text or ingredient-row match |

The normalized scans covered cardoon, cardoons, cardon, cardons, cardoon stalks/stems/leaves/ribs, cardes de cardon, côtes de cardon, tiges de cardon, Cynara cardunculus, and edible thistle across active references, forms, legacy candidates, and ledger text. The full bundled recipe files and all structured ingredient rows were searched for those terms; no candidate mention was found. There is no recipe link or relink to propose.

Nearby active identities to preserve include ingredient-ref-globe-artichoke (globe artichoke / artichaut), ingredient-ref-celery, ingredient-ref-celeriac, and ingredient-ref-swiss-chard. None owns cardoon wording. The recipe source discussed below offers frozen artichoke bottoms, but the active globe-artichoke reference has no frozen-artichoke-bottom form; do not imply that the form already exists.

The proposed source-ID prefix WP03-K-CARDOON-R973-20261019-S and the four reviewed URLs below have no current ledger owner. The proposal path and cardoon identity are unassigned in the proposal archive.

## Naming and boundary decisions

| Term or identity | Treatment | Reason |
|---|---|---|
| cardoon / cardon | Proposed English and Québec French displays | OQLF directly pairs these names for the food-domain vegetable. |
| cardoon stalks / cardoon stems | Covered by the cardoon identity; no aliases added | Extension and Québec terminology sources describe the vegetable through its edible leaf stalks. |
| edible thistle, artichoke thistle, Spanish artichoke, Scotch thistle, Scottish thistle | Omit as aliases | These are broad or overlapping common names. Cardoon itself is the clear source-supported name. |
| Cynara cardunculus | Do not add as a picker alias | Use as scientific scope evidence only. The name is also used in artichoke taxonomy and is not a safe culinary search synonym here. |
| globe artichoke / artichaut | Keep as a separate identity | Cardoon stalks and artichoke flower heads are distinct culinary ingredients, even when sources discuss their botanical relationship or similar flavour. |
| Swiss chard / bette à carde | Keep as a separate identity | OQLF notes that cardon is sometimes mistaken for bette; the names should not be merged. |
| celery / céleri and celeriac / céleri-rave | Keep separate | Similar stalk shape or preparation language does not establish ingredient equivalence. |

The French display is not a new compound translation: cardon is the established Québec term. No additional localized string resource is implicated.

## Measurement and substitution review

OQLF describes long cardoon stalks but gives no count-to-mass, cup-to-mass, density, or serving conversion. The reviewed Reform Judaism recipe for Hamin Kharshuf lists “1 medium cardoon” for six servings and offers “1¼ lbs. frozen artichoke bottoms” as an alternative in that same stew. The amount is recipe-specific, the recipe does not give a mass for the cardoon, and the artichoke amount is not a cardoon conversion. Do not derive a per-serving amount, count weight, unit mapping, density, edible yield, or package yield.

The same recipe gives one explicit contextual replacement suggestion: plain frozen artichoke bottoms may replace cardoon in its named long-cooked Hamin Kharshuf stew. Preserve this as source-specific evidence only. The replacement target is not an existing frozen form under ingredient-ref-globe-artichoke, and the source does not validate a reusable rule. If integrated, use substitutionResearchState: blocked_pending_evidence for the exact catalog-level replacement finding, retain the source note and its named dish context, and add no replacement link or active contextual rule. OQLF’s comparison of cardoon preparation with celery/asparagus is not a substitution claim.

If integrated, create one ingredient_reference ledger record for ingredient-ref-cardoon with identityState: verified and measurementState: researched_no_supported_value. Keep measurementObservations empty; there is no numeric cardoon measurement that the ledger schema can safely represent as a transferable observation. The recipe’s “1 medium” wording and its distinct artichoke-bottom alternative may remain in the source description and limitations. Do not add forms, active conversions, density, unit mappings, yields, recipe links, or active substitutions.

## Source ownership and evidence

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP03-K-CARDOON-R973-20261019-S01 | Office québécois de la langue française, [GDT: cardon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083803/cardon), updated 1990; accessed 2026-10-19. | Directly attests Québec French cardon, English cardoon, and the linked Latin name Cynara cardunculus. Describes the long stalks and culinary uses in soups, stews, side dishes, and cold preparations. Its English note contains a misspelling of the Latin name; use the linked Latin entry and the correctly spelled extension sources below. The entry is not evidence of current North American retail prevalence. |
| WP03-K-CARDOON-R973-20261019-S02 | University of Florida IFAS Extension, [Cardoon](https://gardeningsolutions.ifas.ufl.edu/plants/edibles/vegetables/cardoon/); accessed 2026-10-19. | Identifies cardoon as Cynara cardunculus and says it is grown for edible stalks and leaves, harvested young and typically cooked. This supports generic culinary identity and plant-part scope, not Québec naming or a transferable kitchen measure. |
| WP03-K-CARDOON-R973-20261019-S03 | North Carolina State Extension Gardener Plant Toolbox, [Cardoon — Cynara cardunculus](https://plants.ces.ncsu.edu/plants/cynara-cardunculus/common-name/cardoon/); accessed 2026-10-19. | Separately describes the young emerging leaf stalks as blanched, harvested, cooked, and eaten as a vegetable. The page lists numerous broad common names; none beyond cardoon is proposed as a catalog alias. Its cultivation details and plant-part descriptions do not establish household measurements. |
| WP03-K-CARDOON-R973-20261019-S04 | Union for Reform Judaism, Joel Haber, [Hamin Kharshuf](https://reformjudaism.org/reform-jewish-life/food-recipes/hamin-kharshuf); accessed 2026-10-19. | A six-serving recipe lists one medium cardoon or 1¼ lb of plain frozen artichoke bottoms and cooks the stalks or bottoms in an overnight stew. The quantity and alternative belong to this recipe. The page does not give a cardoon mass or establish a general conversion or substitution rule. |

No manufacturer or retailer pages were used. No product-specific claim or measurement was transferred to the generic identity. Existing branded references and their evidence remain untouched. If any future source is product-specific, review transferability separately and keep product-only values scoped to that product.

## Queue disposition

The current Section K queue contains generic leafy-green, stem, shoot, and edible-flower work; no brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task was found. The Section K Broccolini mention is a trademark-alias exclusion, not an assigned roster task. The cross-category scope review already marks the Section F commercial cereal-roster clauses and further Anson Mills named-wheat-meal research out of scope because commercial-product counts do not add ingredient diversity; neither line was researched here. See the [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md). Existing branded entries and product-specific evidence remain preserved.

## Disposition

Recommend one identity-only VEGETABLE_AND_AROMATIC reference: cardoon / cardon, scoped chiefly to cultivated edible leaf stalks. Keep aliases, forms, measurements, conversions, yields, recipe links, and active substitution rules empty. Record only the bounded identity sources and, if integrated, a blocked ledger finding for the single recipe-specific frozen-artichoke alternative. Section K's broader sweep remains open.

No software tests, builds, emulator checks, or deployment were run because this is proposal-only work and the requested task does not modify application data or code.
