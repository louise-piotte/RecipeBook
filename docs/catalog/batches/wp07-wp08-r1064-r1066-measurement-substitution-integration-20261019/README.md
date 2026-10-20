# WP07 / WP08 R1064–R1066 measurement and substitution integration

## Findings

- **R1064 — jackfruit seeds:** added two separate, measured count-weight ranges from ecological/food-processing study samples: 6–8 g per seed in a 15-fruit Huasteca Potosina sample and 1.5–14 g per seed in a fresh, unprepared Assam seed sample. They are retained as source-qualified observations only; no mean, kitchen count conversion, serving, edible yield, or cooked weight was derived. Jackfruit seeds are marked `researched_supported` for these observations, while density, unit mappings, forms, and active conversions remain absent.
- **R1064 — Matsumae-zuke:** added MEXT food-composition code 18023 as evidence for its exact prepared-food entry. It provides no household portion, volume relation, or generic finished-food yield; measurement state remains `researched_no_supported_value`.
- **R1065 — jackfruit-seed substitutions:** recorded the Konkani curry source's potato, yam, and eggplant suggestions as blocked, because the source gives no replacement amount or basis. Its 20–30 seed recipe quantity and tenderness/cooking notes remain scoped to that recipe.
- **R1065 — Matsumae-zuke substitutions:** recorded no supported replacement for finished Matsumae-zuke in the reviewed rice-accompaniment/snack, ochazuke, pasta, omelet, marinade-seasoning, and cold-tofu contexts. Ingredient swaps made while preparing Matsumae-zuke remain component-level variations, not replacements for the finished preserve.
- **R1066 — breadcrumbs:** recorded one narrow, one-cup quick-oats binder option in the Washington State University / Clark County Extension meatloaf framework. The quantity remains in that source's unqualified cup convention. The evidence does not support mass conversion, transfer of The Kitchn's separate liquid quantity, a general rule, or an active runtime substitution.

## Integration

- Updated only the existing research-ledger records for `ingredient-ref-jackfruit-seeds`, `ingredient-ref-matsumae-zuke`, and `ingredient-ref-breadcrumbs`.
- Added the sources and observations/findings under their existing generic ingredient owners. Preserved prior identities, decisions, evidence ownership, product-specific entries, and product-scoped claims.
- Added no ingredient references, aliases, forms, densities, unit mappings, recipe links, yields, recipe edits, or active global/contextual substitution rules.
- The scope review applies across every ingredient type: commercial brand, product-line, flavour-family, SKU, retailer-variant, and roster-only work remains out of scope because product counts do not add ingredient diversity. Existing branded entries remain intact; no product-specific evidence was generalized.

## Validation

Static package validation and normalization checks passed; the generated ingredient catalog is current at 2,068 references. The research ledger passed its schema, source-linkage, observation/finding ID, UTF-8, and no-BOM checks at 2,473 records, 11,533 source entries, and 9,692 distinct source IDs. No software tests were run because this update only adds research data to the database JSON and documentation, as allowed by `AGENTS.md`.

## Sources

- [Trejo Rodríguez et al., jackfruit seed flour study](https://doi.org/10.3390/molecules26164854)
- [Khan, jackfruit seed mass study](https://doi.org/10.1016/j.actao.2003.11.007)
- [MEXT Food Composition Database, Matsumae-zuke code 18023](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=18_18023_7)
- [Cook with Kushi, Bikkand Gashi](https://www.cookwithkushi.com/jackfruit-seed-curry-recipe/)
- [Hokkaido Regional Agricultural Administration Office, Matsumae-zuke](https://www.maff.go.jp/hokkaido/suishin/shokuiku/dentoshoku_matumaeduke.html)
- [TubeRecipe transcription of だれウマ's Matsumae-zuke recipe](https://tuberecipe.com/recipe/8192/detail)
- [Washington State University / Clark County Extension, Mix-and-Match Meatloaf](https://s3.wp.wsu.edu/uploads/sites/2079/2014/04/Mix-and-Match-Meatloaf.pdf)
- [The Kitchn, Easy Oatmeal Meatloaf](https://www.thekitchn.com/oatmeal-meatloaf-23214762)

See the [R1064 measurement proposal](../../proposals/wp07-r1061-r1062-measurement-review-r1064-20261019.md), [R1065 substitution proposal](../../proposals/wp08-r1061-r1062-substitution-review-r1065-20261019.md), and [R1066 substitution proposal](../../proposals/wp08-next-generic-substitution-review-r1066-20261019.md).
