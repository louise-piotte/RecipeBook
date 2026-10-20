# WP03 Section K — radish-leaf gap review (R908)

**Status at drafting:** Proposal only. No shared catalog, ledger, workflow, plan, roadmap, or scope-log data was changed.

**Reviewed:** 2026-10-19

**Plan anchors:** The exact unchecked Section K parent is [“Other regional greens and shoots discovered in the independent sweeps”](../../RecipeBook-global-ingredient-catalog-plan.txt#L6670). This is a generic edible plant-part gap under the project's [FR-7 ingredient-reference requirement](../../../Requirements.md#L375) and [catalog scope rule](../../../AGENTS.md). Latest progress is recorded for [Section K R905](../../../roadmap.md#L1563) and [WP04 R906](../../../roadmap.md#L1564), with the corresponding [workflow entries](../ingredient-catalog-workflow.md#L3471).

## Recommendation

Add one generic culinary plant-part identity:

- English display: **radish leaves**
- Québec French display: **fanes de radis**
- Reference ID: **ingredient-ref-radish-leaves**
- Category: **VEGETABLE_AND_AROMATIC**

The name covers edible leafy tops of culinary radishes. It identifies a distinct ingredient part; it is not a form or alias of the radish root. Keep the current generic radish root, daikon, pickled radish, turnip greens, and beet greens as separate existing identities. Do not add botanical names, bare radish/radis variants, sprouts, seed pods, or daikon-specific leaf terms as aliases. The sources support radish leaves generally; this proposal does not assert that every radish taxon or separately catalogued daikon form has an interchangeable leaf ingredient.

The [Gouvernement du Québec](https://www.quebec.ca/sante/alimentation/reduire-gaspillage-alimentaire) directly names “fanes de radis” among edible parts, and university and government horticulture sources independently confirm that radish leaves are edible. This supplies generic culinary ingredient diversity, rather than a commercial-product variation. The Québec display is source-attested local wording; no separate OQLF ruling for the compound was found or is claimed. [S01–S03]

### Names and boundaries

| Term | Proposed treatment | Limit |
|---|---|---|
| radish leaves | English display | Edible leaves/tops of culinary radishes; distinct from roots. |
| fanes de radis | Québec French display | Exact Québec government wording; descriptive, not claimed as an OQLF-standardized compound. |
| radish leaf; radish greens; radish green; radish top; radish tops | English aliases | Source-supported singular/plural and common leaf/top wording. The picker effects of the qualified phrases are listed below. |
| feuilles de radis; feuille de radis; fane de radis | French aliases | Québec recipe wording plus singular inflections; no bare radis alias. |
| daikon leaves/greens; botanical names; wild-radish names | Do not add | No part-specific crosswalk or broader taxonomic claim is established here. Keep the separate daikon reference and its current aliases unchanged. |
| radish root, pickled radish, turnip greens, beet greens, radish seed pods, and sprouts | Keep separate | Different parts, preparations, or existing identities; none is merged into this proposal. |

## Current ownership, recipes, and picker effects

Read-only snapshot of the live package and research files on 2026-10-19:

| Artifact | Current count |
|---|---:|
| Ingredient references | 1,935 |
| Ingredient forms | 201 |
| Legacy candidates | 56 |
| Research-ledger records | 2,338 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

Current nearby references are ingredient-ref-radish, ingredient-ref-daikon, ingredient-ref-pickled-radish, ingredient-ref-turnip-greens, and ingredient-ref-beet-greens. Exact normalized phrase checks across reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs found no owner for the proposed leaf wording, its French terms, or ingredient-ref-radish-leaves. No leaf form or prior radish-leaf research record exists. The proposal path and source-ID prefix WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S were unassigned before drafting. Existing rows and cited evidence remain untouched.

I scanned every manifest-listed recipe file and all 1,123 ingredient rows for the English and French leaf/top wording. There are no matching bundled recipes, so no bundled recipe link is proposed. The separate Québec Cuisine recipe below provides external regional recipe evidence, not current bundled-corpus demand.

The projection below follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the picker prefers complete word phrases, folds accents and punctuation, and uses substring matches only when no phrase match exists. The “with proposal” projection includes the proposed aliases and frozen-form phrase.

| Query | Current results | With proposal |
|---|---|---|
| radish leaves; radish leaf; radish greens; radish tops | No result | New radish-leaf reference only |
| fanes de radis; fane de radis; feuilles de radis | No result | New radish-leaf reference only |
| frozen radish leaves; feuilles de radis congelées | No result | New radish-leaf reference, with frozen form hint |
| radish | Four: daikon, kkakdugi, pickled radish, radish root | Those four plus radish leaves |
| radis | Five: daikon, kkakdugi, pickled radish, radish root, takuan | Those five plus fanes de radis |
| greens | Ten existing leafy-green results | Those ten plus radish leaves |
| tops | Beet greens and turnip greens | Those two plus radish leaves |
| daikon | Daikon and takuan | Unchanged; no daikon-leaf alias is added |

The qualified aliases make the part-specific searches useful. Broad radish/radis and greens/tops searches gain one result, while the existing identities remain visible and unchanged.

## Source review and limits

| Source ID | Source | What it supports and what remains source-specific |
|---|---|---|
| WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S01 | Gouvernement du Québec, [Réduire le gaspillage alimentaire](https://www.quebec.ca/sante/alimentation/reduire-gaspillage-alimentaire), last updated 2026-05-04; accessed 2026-10-19. | Names “fanes de radis” among edible parts and says recipes can use them. Supports Québec French wording and edible-part identity; gives no measure, form conversion, density, or substitution. |
| WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S02 | University of Saskatchewan, [Radishes](https://gardening.usask.ca/gardening-advice/gardenline-nested-pages/food-plant-pages/vegetables/radish.php), accessed 2026-10-19. | Says radish leaves are edible and calls them “tops”; younger leaves are described as more tender. This supports the English leaf/top wording, not a cooking rule or kitchen measure. |
| WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S03 | Singapore National Parks Board, [Radish](https://gardeningsg.nparks.gov.sg/gardening-resource-library/radish/), dated 2023-07-19; accessed 2026-10-19. | Identifies radish as an edible crop and states that both the root and leaves are edible; it notes younger leaves are tender. The page’s botanical wording is evidence only, not a picker alias or a claim about every radish species. |
| WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S04 | Le Québec cuisine, [Soupe aux feuilles](https://quebecuisine.ca/recipes/soupe-aux-feuilles/), accessed 2026-10-19. | A Minganie recipe for eight portions lists “100 g de feuilles de radis fraîches ou congelées hachées finement.” This supports local French recipe wording, a generic frozen state, and one recipe-level amount. The 100 g applies to this complete eight-portion formula and its specified chopped leaves; it is not a per-serving quantity, general measure, density, or fresh/frozen conversion. The recipe’s handling and simmer directions are not proposed as general rules. |
| WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S05 | University of Illinois Extension, [Waste Not From Root to Stalk](https://extension.illinois.edu/blogs/simply-nutritious-quick-and-delicious/2016-11-29-waste-not-root-stalk), 2016-11-29; accessed 2026-10-19. | Uses “radish tops” and “radish greens,” describes the leaves as edible, and includes a greens chimichurri recipe. The recipe’s five loosely packed cups, blanching time, and yield belong to that recipe only and are not adopted as generic measures or cooking instructions. |
| WP03-SECTIONK-RADISH-LEAVES-R908-20261019-S06 | The Kitchn, [How to Use Radish Greens for Zero-Waste Deliciousness](https://www.thekitchn.com/dont-toss-those-radish-greens-145724), updated 2023-03-01; accessed 2026-10-19. | Describes radish greens as edible and says they can be used in place of other strong greens such as Swiss chard or mustard greens in a sautéed chickpea, pancetta, and shallot dish. This supports only that contextual culinary replacement, not an unrestricted substitution or quantity. The source’s “a few leaves” in stews and “two cups’ worth” for braising belong to its examples and are not generic measures. |

No manufacturer or retailer pages were used. The source set is limited to generic radish leaves and a Québec recipe. No brand, product line, flavour family, SKU, or retailer variant was researched or added.

## Recommended data scope if integrated

Add one ingredient reference with the name and aliases above. Set default density to null and unit mappings to an empty list. Keep the identity focused on the culinary edible leaves; do not merge it with an existing row or infer the species-part scope of another catalogued radish identity.

Add one explicit frozen form because the Québec recipe names frozen leaves as an alternative ingredient state:

- Form ID: ingredient-form-radish-leaves-frozen
- Form code / prep state: frozen / frozen
- English label / French label: frozen radish leaves / feuilles de radis congelées
- Match terms: frozen radish leaves / feuilles de radis congelées
- Form density: null

The unqualified reference remains state-neutral; no fresh form is needed. The Québec recipe’s same-line fresh-or-frozen option is limited to that formula and does not establish any general equivalence, thawing, yield, or conversion between states.

Record the single Québec recipe amount as one source-specific portion-weight observation if integrated: 100 g, fresh or frozen and finely chopped, as the ingredient amount for the entire recipe yielding eight portions. Keep “eight portions” as recipe context; do not derive 12.5 g per serving, a household-volume conversion, or a reusable ingredient measure. With this source-published recipe amount, measurement research can be marked researched_supported while default density remains null and unitMappings stay empty.

The targeted substitution search found one explicit, context-limited culinary replacement: The Kitchn says radish greens can stand in for Swiss chard or mustard greens in a sautéed chickpea, pancetta, and shallot dish. Record these as supported ledger findings with the named sauté context and no quantities or adjustments. It does not support a global replacement or an active contextual rule across all sautéed greens. Do not model the Québec soup’s co-ingredients (lettuce, beet/chard leaves, spinach, and leek) as substitutes. Add no recipe-line link or active substitution rule.

## Cross-category scope disposition

The latest cross-category review states that no open checklist task solely requests another commercial-product roster; it explicitly marks roster-only expansion out of scope because commercial-product counts do not measure ingredient diversity. It also preserves completed branded rows and keeps product-only evidence attached to its named product. See the [2026-10-19 generic-ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md) and the latest [R905](../../../roadmap.md#L1563) and [R906](../../../roadmap.md#L1564) progress entries. The Section F cereal-roster and Anson Mills named-wheat-meal work remains out of scope for that reason; this proposal pursues only the generic Section K plant-part gap. No existing branded row is deleted, merged, or generalized.

**Recommended delta:** one generic radish-leaves identity, one evidence-backed frozen form, one recipe-specific 100 g observation scoped to the Québec eight-portion recipe, and ledger-only contextual replacement findings from The Kitchn. Keep density, unit mappings, generic conversions, active substitution rules, yields, and bundled recipe links empty.

No software tests, builds, emulator checks, or deployment were run for this proposal-only review.

## Integration (root, 2026-10-19)

Integrated the generic identity, frozen form, recipe-scoped amount, and contextual substitution findings described above. The active ledger now marks identity, measurement, and substitution research supported, but no active substitution rule or bundled recipe link was added. Static catalog/package/ledger and documentation validation is recorded in the [R908 integration README](../batches/wp03-r908-radish-leaves-integration-20261019/README.md). No software tests, build, emulator, or deployment were run because the integrated change only adds ingredient database JSON under `AGENTS.md`.
