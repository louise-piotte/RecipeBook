# WP08 R1075 — beef broth to water in one chili formula

- **Reviewed:** 2026-10-19.
- **Status:** Accepted and integrated. The shared ledger and validation details are recorded in the [R1073–R1076 batch README](../batches/wp02-wp07-wp08-r1073-r1076-generic-gap-integration-20261019/README.md).
- **Scope:** Online substitution research for the accepted generic `ingredient-ref-beef-broth` identity, bounded to Ricardo's *Classic Beef Chili*. This review concerns generic culinary ingredients. It does not add or research a brand, product line, flavour family, SKU, or retailer roster; commercial-product counts do not add ingredient diversity.

## Recommendation summary

| Ingredient | Recommended research state | Supported context | Active rule |
| --- | --- | --- | --- |
| `ingredient-ref-beef-broth` | `researched_supported`, with this finding limited to Ricardo's named *Classic Beef Chili* | The original recipe lists **1/4 cup (60 ml) beef broth or water** in one ingredient slot. The linked RecipeBook line has the same source amount and already records water as an option. | None. A contextual rule cannot be limited to the named recipe. `tag-main-dish` would also expose the suggestion to the other linked beef-broth recipes; role/method restrictions are rejected by the resolver. |

The source offers water as a same-slot choice in one particular chili formula. This is not a general beef-broth conversion or a claim that water has the same flavour contribution as broth. Do not automatically apply it to other dishes.

## Why this is an open gap

WP08 Section 08 requires online substitution research for accepted ingredients, with source context, amount basis, adjustments, effects, restrictions, and uncertainty recorded. The verified generic beef-broth identity still has substitution state `not_yet_researched` and no substitution findings. This target is distinct from R1065 (jackfruit seeds and Matsumae-zuke), R1066 (breadcrumbs), R1069 (kale), R1072 (vegetable oil), and the concurrent R1076 pork dry rub review.

## Active identity and linked-recipe audit

- `ingredient-ref-beef-broth` is the verified generic `STOCK_AND_BROTH` identity `beef broth / bouillon de bœuf`. The active reference has no aliases, density, unit mappings, or forms. Its ledger record has substitution state `not_yet_researched`, no findings, and an accepted identity decision that keeps beef broth distinct from `ingredient-ref-beef-stock` / `fond de bœuf`.
- Existing ledger sources for this identity are OQLF terminology and Campbell Company of Canada's bilingual ready-to-use product page. Those sources support naming and a specific commercial formulation only. This review preserves them and does not transfer product composition, measurements, or claims to generic broth.
- `ingredient-ref-water` is a separate verified generic identity with null active density and no unit mappings. Its measurement state and source-qualified water observations remain unchanged. Water is a replacement ingredient here, not a synonym or merged identity for broth.
- The linked recipe corpus has three beef-broth uses. Recipe 034, *Classic Beef Chili*, is the only line with a water note and the original Ricardo page confirms it. Recipe 078, *Shepherd's Pie*, has 1 cup beef broth; its linked source lists that amount but no water alternative. Recipe 015, *Beef Stroganoff*, has `1 can beef broth` and no source URL in its bundled recipe record, so no package amount or substitute can be inferred. Do not transfer Recipe 034's option to Recipes 078 or 015.
- Both bundled substitution-rule files currently contain zero rules. The contextual resolver matches positive dish-type tags but rejects rules with role or cooking-method restrictions. An explicit recipe-line link still points to a contextual rule that the resolver can also discover for any recipe matching its dish-type tag; the current model therefore cannot enforce this exact recipe boundary. Recipe 034 is tagged `tag-main-dish`, which also appears on the other beef-broth recipes.

## Supported context: Ricardo's *Classic Beef Chili*

Ricardo's original English recipe page lists `1/4 cup (60 ml) beef broth or water` in the same ingredient line. The recipe serves six and combines the selected liquid with ground beef, tomatoes, kidney beans, coffee, ketchup, lime juice, and seasonings; the instructions bring the mixture to a boil and simmer it half-covered for 45 minutes or until the chili thickens. This directly supports selecting water instead of beef broth in this formula at the source's listed amount. It does not report a side-by-side test, comparative flavour or texture result, or any water-specific change to salt, timing, or other ingredients.

The source page labels the recipe content as sponsored. Keep that provenance visible in the evidence record. Ricardo's separate broth-replacement article gives general guidance to replace one cup of broth with one cup of water in soups, stews, braises, and risotto, and says to add more aromatics and salt if extra flavour is desired. That article provides context-specific corroboration, not a new measurement conversion or proof of identical flavour; its optional advice is not stated as a required adjustment in the chili recipe.

## Other candidates and context boundaries

| Candidate or evidence | Disposition |
| --- | --- |
| Water for beef broth in Ricardo's *Classic Beef Chili* | **Supported narrowly.** The original ingredient line offers both choices at 1/4 cup (60 ml). Keep the amount tied to that recipe formula. |
| Water for beef broth in *Shepherd's Pie* (Recipe 078) | **Not transferred.** Its source lists 1 cup beef broth and gives no water option. Ricardo's broader article mentions soups, stews, braises, and risotto, but this review does not classify or generalize that different filling as one of those source-tested contexts. |
| Water for the `1 can beef broth` in *Beef Stroganoff* (Recipe 015) | **Not established.** The bundled record has no source URL and package size is unknown. Do not infer an amount or use the chili finding. |
| Beef stock (`ingredient-ref-beef-stock`) | **Not proposed.** The accepted catalog deliberately separates beef stock from beef broth; no reviewed source supports transferring this broth finding to stock. |
| Vegetable broth or other broths | **Not proposed.** These are distinct generic ingredient identities. No source in this review supports replacing them in these recipes, and no broth-family rule is inferred. |

No branded-product or retailer roster was researched. Existing branded rows and product-scoped evidence remain untouched.

## Integrated ledger disposition

The integration updated only the existing `ingredient-ref-beef-broth` record's substitution state to `researched_supported` and appended one finding. Its identity, measurement state, existing identity sources and decisions, all product-scoped evidence, the beef-stock and water identities, and all recipe data remain unchanged. Other linked beef-broth uses remain outside this finding.

**Finding ID:** `beef-broth-water-ricardo-classic-beef-chili-r1075-20261019`

- `researchState`: `researched_supported`
- `fromIngredientRefId`: `ingredient-ref-beef-broth`; source gives no separate broth form.
- `replacements`: `ingredient-ref-water`, source amount `1/4 cup (60 ml)` as printed for the shared ingredient slot. Do not derive a new unit conversion from the parenthetical.
- `context`: Ricardo's *Classic Beef Chili*, six servings. The liquid is added with tomatoes, kidney beans, coffee, ketchup, lime juice, and seasonings; bring to a boil and simmer half-covered for 45 minutes or until thickened.
- `basis`: Same-slot alternative as explicitly listed by the source at `1/4 cup (60 ml)`. This is recipe guidance, not a controlled comparison or a general ratio for other recipes.
- `adjustments`: The recipe page states no water-specific adjustment. Ricardo's separate general article says additional aromatics and salt may be added if more flavour is wanted; preserve this as optional article-level guidance and do not attach it as a required chili adjustment.
- `expectedEffects`: The recipe gives no comparative sensory or texture result. Ricardo's article describes broth as a flavour contributor and water as a zero-sodium base; keep those general article statements separate from the chili's unreported outcome.
- `limitations`: Exact formula only. Do not transfer to shepherd's pie, stroganoff, sauces, or other broth/stock identities; do not infer reverse or family-wide rules. No source-neutral beef-broth product composition, broth/stock equivalence, density, or package conversion is established. The source page labels the recipe as sponsored. No allergy or dietary-safety equivalence is claimed.
- `sourceIds`: `WP08-R1075-BROTH-S01` and `WP08-R1075-BROTH-S02`. These two sources are now recorded on the shared ledger finding; S03 remains proposal documentation for the separate shepherd's-pie demand audit only.

Do not activate a global or contextual rule or add a recipe-line substitution link. Although the exact line has a source-supported choice, the resolver cannot constrain a rule to Recipe 034, and broad dish-type matching would expose it beyond the supported context.

## Queries recorded

Searches and direct page reviews were conducted on **2026-10-19**. Search results were used to locate original pages; the recipe and article pages were opened and checked for the stated lines, directions, amount basis, and boundaries.

- `site:ricardocuisine.com/en/recipes/5762-classic-beef-chili "beef broth" water`
- `Ricardo Classic Beef Chili 5762 beef broth substitute water recipe`
- `site:ricardocuisine.com "beef broth" "can be replaced" chili recipe`
- `site:ricardocuisine.com/en/articles/techniques/2057-how-to-replace-broth-in-a-recipe broth water 1 cup`
- Direct review of The Wholesome Dish, *The Best Classic Shepherd's Pie*, to audit a separate linked beef-broth use; it lists beef broth but no water substitution.

## Sources and locators

| ID | Source | Locator, support, and limits |
| --- | --- | --- |
| **WP08-R1075-BROTH-S01** | Ricardo Cuisine, [*Classic Beef Chili*](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili). | Ingredients, `1/4 cup (60 ml) beef broth or water`; recipe metadata states six servings; preparation: brown onion/pepper and ground beef, add seasonings and remaining ingredients, bring to a boil, then simmer half-covered 45 minutes or until the chili thickens. The page labels the content as sponsored. It directly supports the same-slot choice and amount in this one formula, not a head-to-head test or general broth conversion. `sourceKind: culinary_reference`. |
| **WP08-R1075-BROTH-S02** | Ricardo Cuisine, [*How to Replace Broth in a Recipe*](https://www.ricardocuisine.com/en/articles/techniques/2057-how-to-replace-broth-in-a-recipe). | Sections “What broth is and why you need it” and “How to replace it,” especially “With water.” The article names chicken, beef, and vegetable as broth varieties; gives 1 cup broth to 1 cup water; suggests more aromatics and salt when extra flavour is wanted; and says the option is ideal for soups, stews, braises, and risotto. General editorial guidance only; it does not evaluate the chili formula's sensory result. `sourceKind: culinary_reference`. |
| **WP08-R1075-BROTH-S03** | The Wholesome Dish, Amanda Finks, [*The Best Classic Shepherd's Pie*](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/). | Recipe ingredient list: 1 cup beef broth; method lines describe simmering the meat-and-vegetable gravy. Reviewed only to audit Recipe 078's separate linked use. The page does not list water as an alternative; no substitution finding is drawn from it. `sourceKind: culinary_reference`. |

## Final disposition

- Set `substitutionResearchState: researched_supported` for `ingredient-ref-beef-broth`, with the single supported use restricted to Ricardo's *Classic Beef Chili*.
- Preserve the source's 1/4 cup (60 ml) same-slot option and separately scoped optional broth-replacement article guidance.
- Keep the one-cup shepherd's-pie and one-can stroganoff uses outside this finding; do not infer stock or other-broth substitutions.
- Add no active rule, recipe-line substitution link, recipe edit, new identity, alias, form, measurement, density, unit mapping, or conversion.
- Preserve every existing generic and branded identity and all existing source-scoped evidence.
