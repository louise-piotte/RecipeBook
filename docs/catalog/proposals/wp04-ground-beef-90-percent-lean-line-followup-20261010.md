# WP04 Proposal: Shepherd’s Pie Ground-Beef Qualifier Follow-up

**Review date:** 2026-10-10
**Status:** reviewed and integrated on 2026-10-10. The exact source wording was restored on recipe 078#3 and the source was recorded on the existing ground-beef ledger row.
**Scope:** One source-backed animal-food ingredient line outside the prior WP04 egg, pork, chicken-breast, tuna, dairy-package, and produce-count reviews.

## Disposition

For recipe `078#3` (Shepherd’s Pie), recommend updating only the source text from `1 lb lean ground beef` to the publisher’s exact ingredient line, `1 lb. 90% lean ground beef -or ground lamb`. Keep `quantity: 1`, `unit: lb`, `ingredientName: ground beef`, and `ingredientRefId: ingredient-ref-ground-beef`. The existing bilingual notes already preserve the ground-lamb option; retain it as a recipe-local alternative. Do not create a ground-lamb alias, composition class, form, percentage-fat value, portion observation, or reusable substitution rule from this line.

The published amount is also one pound, so there is no supported quantity correction. The actionable delta is the omitted `90%` qualifier and the precise source wording. This exact source phrase is a product-choice qualifier on the recipe line, not a verified catalog composition value.

## Exact recipe demand and current match

| Recipe line | Bundled text and fields | Current model | Source-backed disposition |
| --- | --- | --- | --- |
| `078#3` — Shepherd’s Pie; `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-3` | `1 lb lean ground beef`; quantity `1`; unit `lb`; `ingredient-ref-ground-beef`; EN/FR notes say ground lamb can be used instead | Existing `ground beef / bœuf haché` reference; no reference form, density, or unit mapping for ground beef | The linked publisher’s ingredient line reads `1 lb. 90% lean ground beef -or ground lamb`. Preserve `90%` in source text. Keep the existing one-pound amount and default ground-beef link. Keep lamb as this recipe’s stated option only. |

A fresh scan of the live bundled package found **114 recipes and 1,123 ingredient rows**. It found three lines linked to ground beef:

| Recipe line | Current ingredient text | Source qualifier status |
| --- | --- | --- |
| `034#4` — Classic Beef Chili | `1 kg ground beef` | No lean/fat qualifier in bundled text |
| `074#1` — Meatloaf | `1 1/2 lb ground beef` | No lean/fat qualifier in bundled text |
| `078#3` — Shepherd’s Pie | `1 lb lean ground beef` | Bundled `lean` qualifier; linked publisher specifies `90% lean` |

This corrects the earlier WP04 residual audit’s statement that all three ground-beef lines were unqualified and that no recipe requested a lean ground-beef product. One bundled line is composition-qualified, and its direct source provides the more specific `90% lean` wording. The two other bundled lines remain unqualified.

## Catalog, ledger, and schema fit

- The active `ingredient-ref-ground-beef` has `nameEn: ground beef`, `nameFr: bœuf haché`, category `PROTEIN`, empty alias arrays, null `defaultDensity`, and no unit mappings. The active forms file has no ground-beef form.
- The ledger marks the ground-beef identity verified but leaves measurement and substitution research `not_yet_researched`. Its current sources WP04-S39 and WP04-S45 are OQLF terminology entries for `bœuf haché` and general `viande de bœuf`; they do not support a lean percentage, composition value, or substitution relation.
- `IngredientLine` can preserve publisher wording in `originalText`, but the schema has no explicit fat-class or lean-percentage field. The measurement-observation schema accepts numeric portion, count, density, yield, and package relationships; it has no composition relationship. Preserve the qualifier as source text rather than encoding it as a form, alias, or measurement observation.
- The current detail formatter uses the structured quantity, canonical reference name, and localized notes; it falls back to `originalText` only when the built label is blank. Updating `originalText` alone may therefore preserve the source record without showing `90% lean` in the ingredient row. Do not describe that source-text correction as a user-visible composition label; any localized rendering needs its own Québec French wording review.
- The active unit table already defines `lb` as a mass unit. Keep the source quantity in pounds; this proposal adds no unit conversion, ingredient mapping, or package-yield record.

## Species, product, preparation, and recipe-context boundaries

- **Species and product:** The default ingredient is ground beef. “90% lean” modifies that source-named product; it does not make `90% lean ground beef` a generic alias for every ground-beef item or establish a new catalog identity. Ground lamb is a different species and product, not an alias for beef.
- **Source alternative:** The publisher explicitly offers ground beef or ground lamb in this recipe. The existing notes preserve that choice. The source supports only this recipe-context option; it does not establish a global beef-to-lamb substitution or general yield equivalence. No ground-lamb reference is currently present in the active catalog.
- **Preparation state:** The recipe lists the meat before browning and then directs the cook to brown it. The page does not specify retail package, grind size, source cut, trim, frozen/fresh state, or post-cooking mass.
- **Portion basis:** The source amount is one pound of recipe input and the page lists six servings. It does not give a per-serving meat weight, an as-purchased versus edible basis, refuse, a cooked yield, or a package size.

## Separate evidence status

| Evidence dimension | Status | Supported conclusion and limit |
| --- | --- | --- |
| **Identity** | Existing base identity; source-qualified product wording | Keep `ingredient-ref-ground-beef` for the default ingredient. The source identifies a `90% lean` recipe choice but does not establish a separate canonical identity, alias, or form. |
| **Portion / count** | Exact source amount; no correction | The publisher and bundle both specify one pound. This is a mass amount, not a count-to-weight observation or per-serving portion. Keep the structured amount unchanged. |
| **Composition** | Qualifier supported; numeric composition unavailable | Preserve the source phrase `90% lean`. The recipe page is not a package label and identifies no brand or SKU. Do not infer or add a 10% fat value. Canada’s standardized `Lean Ground Beef` class is a separate market/category definition and does not quantify this recipe product. |
| **Conversions / yield** | No ingredient-specific relation supported | `lb` is already a mass unit. There is no source-backed mass-volume relation, edible fraction, cooking yield, or portion mapping for this recipe line. Do not derive one from the serving count or the `90% lean` wording. |
| **Substitution** | Recipe-local alternative supported; no catalog rule | The direct recipe source allows ground lamb in this dish, and the bundle already records it in bilingual notes. Keep species separate and do not promote the choice to an alias, universal rule, or ratio. |

## Source register

| ID | Source | Evidence and limits |
| --- | --- | --- |
| **WP04-GROUND-BEEF-90-20261010-S01** | The Wholesome Dish, [The Best Classic Shepherd’s Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/), ingredient list and recipe introduction. | Direct linked recipe page, accessed 2026-10-10. The ingredient list reads `1 lb. 90% lean ground beef -or ground lamb`; the introduction says the author wrote the recipe to use ground beef or ground lamb. Supports the exact source wording, quantity, and recipe-local choice only. It gives no retail product label, source cut, composition panel, edible fraction, or cooked yield. |
| **WP04-GROUND-BEEF-90-20261010-S02** | CFIA, [Canadian Food Compositional Standards, Volume 13, sections 13.1.4–13.1.6](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0). | The Canadian standard defines regular, medium, and lean ground beef using maximum fat contents; the `Lean Ground Beef` common name is capped at 17% fat. This is a Canadian standardized product class, not an exact composition value for the publisher’s `90% lean` recipe wording. |
| **Existing WP04-S39** | OQLF, [bœuf haché](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8888340/boeuf-hache). | Existing ledger source directly pairs `bœuf haché` with `ground beef`. It supports the current base identity and not the numeric qualifier. |
| **Held; not used** | USDA Food Safety and Inspection Service, [FSIS Directive 7130.1](https://www.fsis.usda.gov/policy/fsis-directives/7130.1). | Direct page open returned an internal error. A search result exposed only a snippet, which is not treated as verified evidence. The U.S. label interpretation remains unresolved; no composition conclusion here relies on it. |

## Review method and remaining boundary

Re-read the current recipe file, ingredient reference and form data, ground-beef ledger record, active WP04 plan status, and prior WP04 animal-food/count proposals. Counted 114 manifest recipe files and 1,123 ingredient rows, then rescanned all linked ground-beef rows. Opened the exact publisher page and the official CFIA standard above. The USDA FSIS directive listed as held was not used because the direct page could not be opened.

The previously reviewed count-unit animal-food rows remain excluded from this packet. No new animal count-to-mass, package-size, edible-portion, or cooked-yield relation was established here. Broader animal-food coverage, independent Québec naming review, and WP04 count/edible-portion fixtures remain open.


## Root integration review

Root opened the current publisher page and confirmed `1 lb. 90% lean ground beef -or ground lamb` in the ingredient list, then retained the existing recipe-local lamb note. Updated only `078#3.originalText` and `updatedAt`; quantity `1`, unit `lb`, `ingredientName`, `ingredientRefId`, and bilingual notes remain unchanged. Added source S01 and a bounded decision to `ingredient-ref-ground-beef`. No lean-percentage composition value, form, portion observation, conversion, ground-lamb identity, or active substitution was added.
