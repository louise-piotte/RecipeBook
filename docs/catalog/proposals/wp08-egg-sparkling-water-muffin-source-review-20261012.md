# WP08 source review: egg to sparkling water in a muffin

- **Review date:** 2026-10-12
- **Disposition:** Integrated on 2026-10-12 as one blocked, ledger-only finding. See the [integration README](../batches/wp08-egg-sparkling-water-muffin-finding-integration-20261012/README.md). No runtime rule or recipe-line link was added.
- **Direction:** Whole egg → plain sparkling water / seltzer only.
- **Candidate context:** Light, fluffy muffin batter where the egg is mixed with liquid ingredients and incorporated into dry ingredients. The closest bundled candidate is recipe `069`, Double Chocolate Muffins.

## Live plan and catalog state

The active WP08 workflow row remains `in_review` and asks for remaining high-value substitutions while preserving directional and contextual limits. The current substitution batch already records seltzer evidence, but the live research ledger has no egg-to-sparkling-water finding. The egg reference currently has a blocked egg-to-aquafaba finding; the sparkling-water reference is identity-only and its substitution research state is `not_yet_researched`.

The accepted target reference is `ingredient-ref-sparkling-water`, displayed as `sparkling water / eau pétillante`. Its scope is plain, unflavoured water containing dissolved carbon dioxide. It does not absorb sweetened or flavoured carbonated drinks, tonic, club soda, or bare `soda`; see the [WP05 water and ice boundary review](wp05-section-v-water-sparkling-ice-boundary-review-20261012.md). No density or unit mapping is recorded for sparkling water.

Bundled recipe `069` has one ingredient line, `81d376ac-c305-402f-a73d-8bb721045319-ingredient-1`, recorded as `1 egg` with unit `large egg`. The method combines margarine, egg, and brown sugar in one bowl, pours the wet ingredients into the dry ingredients, then alternates milk and flour into the batter. It is a family recipe with no source URL or reported egg-free trial. The instructions do not say whether the margarine mixture is creamed.

## Source evidence

| ID | Source | What it supports | Limits |
|---|---|---|---|
| **WP08-EGG-SPARKLING-20261012-S01** | University of Maine Cooperative Extension, [“Using Egg Substitutes in Baking and Cooking”](https://extension.umaine.edu/food-health/2023/02/16/using-egg-substitutes-in-baking-and-cooking/), published 2023-02-16; “Egg Substitutes in Baking” introduction and seltzer row. | UMaine says it tested substitutes in a yellow-cake recipe calling for two eggs. Its table gives **1/4 cup seltzer water per egg**; seltzer had the best texture and flavor among the alternatives tested, with pale color as a drawback. | It does not state the egg size, detailed mixing method, quantified result, or whether the result transfers to muffins or to this family formula. |
| **WP08-EGG-SPARKLING-20261012-S02** | King Arthur Baking, [“No eggs? Here’s your guide for substituting”](https://www.kingarthurbaking.com/blog/2021/01/21/guide-for-substituting-eggs-best-egg-replacers), published 2021-01-21; sparkling-water entry and Basic Muffin comparison. | Gives **1/4 cup (57 g) sparkling water per egg** and describes it as a less-reliable, sometimes hit-or-miss option for light, fluffy cakes, cupcakes, muffins, and quick breads. Its Basic Muffin comparison mixed eggs with other liquids before adding them to dry ingredients; sparkling-water muffins were very similar to the egg control. It also gives a muffin example where egg is whisked with melted butter. | The article warns that sparkling water does not blend well when eggs are creamed with butter. The Basic Muffin result is one test and the article says results may differ across formulas. Neither egg size nor an exact match to recipe `069` is established. |

The local recipe is close to King Arthur’s muffin category and has chemical leaveners, but it is not the tested Basic Muffin formula. In recipe `069`, the egg is combined with margarine and brown sugar rather than explicitly mixed with other liquids alone. The instructions do not establish whether this mixture behaves like the source’s butter-creamed case. Treat this as a promising but unresolved recipe-level lead, not a tested replacement for recipe `069`.

## Amount basis and scope

The sources give a **volume-to-count** replacement: 1/4 cup of sparkling water for one egg. King Arthur also prints **57 g for that same sparkling-water amount**. That parenthetical is not an egg mass, a count-to-mass conversion for eggs, or a mass-for-mass substitution. The local line is specifically one **large** egg, while the reviewed per-egg substitution advice does not specify egg size. Preserve that mismatch as unresolved; do not use the egg reference’s published portion weights to derive a seltzer amount.

Keep this direction limited to plain, unflavoured sparkling water replacing one whole egg in a selected muffin batter. Do not infer sparkling water → egg, egg-yolk or egg-white substitutions, suitability for every muffin or quick bread, or use in creamed-fat, egg-heavy, custard, soufflé, sponge, chiffon, angel-food, or foam-based recipes. The sources specify no adjustment to the recipe’s other liquid, leaveners, bake time, or yield. Do not make allergy-safety or vegan claims.

## Integrated ledger finding

The two source records above and the blocked finding below are recorded on `ingredient-ref-egg`. The finding remains blocked for recipe `069` until its margarine/egg mixing method and recipe-specific outcome are established. The stored replacement amount uses the source-published volume; the 57 g figure remains in the basis text as King Arthur’s mass for that same sparkling-water amount.

```json
{
  "findingId": "WP08-EGG-SPARKLING-20261012-F01",
  "researchState": "blocked_pending_evidence",
  "fromIngredientRefId": "ingredient-ref-egg",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-sparkling-water",
      "quantity": {
        "amount": 0.25,
        "unit": "cup"
      }
    }
  ],
  "context": "One-way egg-to-plain-sparkling-water candidate for the single whole-egg line in bundled recipe 069, limited to selected light, fluffy muffin batters where the egg is mixed with liquids and then incorporated into dry ingredients. Recipe 069 combines the egg with margarine and brown sugar; its instructions do not establish whether this is a creamed-fat method.",
  "basis": "University of Maine Extension gives 1/4 cup seltzer per egg in its tested two-egg yellow cake. King Arthur gives 1/4 cup (57 g) sparkling water per egg and reports a similar result in one Basic Muffin comparison. Store the 1/4 cup volume-to-count basis. The 57 g is King Arthur's mass for the same sparkling-water quantity, not egg mass; source egg size is unstated, while recipe 069 calls for one large egg.",
  "adjustments": [],
  "expectedEffects": [
    "King Arthur says the sparkling-water option can be hit-or-miss; its one Basic Muffin test was very similar to the egg control.",
    "In UMaine Extension's tested yellow cake, seltzer had the best texture and flavor among the tested substitutes but produced pale color."
  ],
  "limitations": [
    "The exact family muffin recipe has not been tested with sparkling water, and its margarine/egg mixing method is not sufficiently described to confirm fit with the source examples.",
    "Do not infer a mass-for-mass amount, a source-neutral egg-size mapping, or adjustment to the other liquids, leaveners, bake time, or yield.",
    "Use plain, unflavoured sparkling water only; exclude sweetened or flavoured carbonated drinks, tonic, club soda, and bare soda.",
    "Do not reverse the direction or generalize to other muffin, cake, quick-bread, egg-heavy, custard, or foam-based recipes.",
    "Keep out of runtime because the current rule model cannot preserve the count-to-volume basis and enforce the required recipe method."
  ],
  "sourceIds": [
    "WP08-EGG-SPARKLING-20261012-S01",
    "WP08-EGG-SPARKLING-20261012-S02"
  ]
}
```

No active substitution rule or recipe-line substitution link was added. The sources do not establish recipe-specific fit for recipe `069`.
