# WP06 North American maple-flakes identity review (R295)

- **Date:** 2026-10-16
- **Status:** Integrated on 2026-10-16 as identity-only reference `ingredient-ref-maple-flakes`.
- **Target:** WP06 Section 05, “Run independent regional gap sweeps,” in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), lines 953–967, especially the open North American maple-flakes research task. The [North American sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) lists maple flakes as unresolved at lines 106 and 138 and requests product/packaging and recipe review at line 186.
- **Scope:** Maple flakes only. This does not reopen grated maple sugar, maple water, maple vinegar, maple alcohol, or the already integrated maple syrup, sugar, butter, and taffy identities. It is outside WP03 Section F and WP04 Section Q.
- **Recommendation:** Advance `ingredient-ref-maple-flakes` as an identity-only `SUGAR_AND_SWEETENER` candidate, displayed `maple flakes / flocons d’érable`. Keep production method unspecified, aliases empty, and all numeric or substitution behavior unavailable.

## Current catalog and ownership check

At review time on 2026-10-16, the live package had 1,663 ingredient references and 127 forms. I compared complete normalized phrases across reference names and aliases, form labels and match terms, the legacy candidates, the research ledger, prior proposal text, and the manifest-listed recipe files. The proposed reference ID `ingredient-ref-maple-flakes` and the exact English/French product names have no current reference, form, legacy, ledger, or prior proposal owner. The only prior packet hit is the North American sweep’s explicitly unresolved maple-product row.

The active maple identities remain separate: `ingredient-ref-maple-syrup` / `sirop d’érable`, `ingredient-ref-maple-sugar` / `sucre d’érable`, `ingredient-ref-maple-butter` / `beurre d’érable`, and `ingredient-ref-maple-taffy` / `tire d’érable`. No maple-linked form is active. At proposal time, the source-ID prefix `WP06-MAPLE-FLAKES-R295-20261016-S` and exact source URLs below were absent from the proposal archive and research ledger; the eight new source entries are now recorded on the maple-flakes ledger row.

## Identity, naming, and product boundary

Érable du Québec presents **flocons d’érable** as a named product made by freeze-drying/dehydrating maple syrup, and uses it as a finishing ingredient for desserts, meats, fish, breadcrumbs, spice mixtures, and cocktail rims [S01]. Its English counterpart uses **maple flakes** for the same product and uses [S02]. A Quebec maple producer also markets maple flakes with pure maple syrup as the sole ingredient and gives culinary finishing and breading uses [S06]. These sources support the bilingual product name and its use as a dry, ready-to-add ingredient.

I recommend a separate identity rather than a maple-syrup form or maple-sugar alias. Syrup is the starting liquid; the flakes are sold and requested as a distinct finished product with a dry texture and finishing/breading role. Érable du Québec separately names maple sugar, describes it as syrup boiled and cooled to form crystals, and lists multiple sugar granulations and pieces [S04]. Mayrand sells “Pure Maple Flakes 800 g” as a distinct SKU alongside a separate “Pur Maple Sugar 800 g”; its category breadcrumb places the flakes under maple sugar, which is a retailer classification, not proof that the products are synonyms [S05]. Keep `maple flakes` unaliased to maple syrup or maple sugar, and do not infer that maple flakes mean grated maple sugar.

There is a real production-description limit. Érable du Québec describes flakes as freeze-dried syrup [S01], while a current Gaspésie producer page indexed under the same French product name describes flakes as formed by complete syrup crystallization [S07]. The page could not be fetched directly during this review, so that secondary description needs confirmation before it is treated as representative. The recommended identity therefore follows the source-backed market name and culinary presentation; it does not assert a single production method or exclude differently made products sold under that name.

The French display is supported by a current Québec maple-industry source and a local producer’s product listing. I found no OQLF entry for this exact product during the targeted terminology review, so the proposal does not claim an OQLF-preferred term. Use the exact phrase `flocons d’érable`; do not activate a broad `flocons` alias or process-derived terms such as `sirop d’érable lyophilisé`.

## Picker projection

Projection uses the current `IngredientReferenceSearchIndex` phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), with no candidate persisted:

| Search | Current results | With candidate | Assessment |
|---|---:|---:|---|
| `maple flakes` / `flocons d’érable` | 0 | 1 exact result | Each exact phrase selects the candidate alone. |
| `maple` / `érable` | 7 | 8 | Broad search gains one result among the four existing maple products and three maple-flavoured packaged products. The exact display remains clear. |
| `maple syrup`, `maple sugar`, `maple butter`, `maple taffy` and their French names | 1 each for their existing identity | Unchanged | No aliases or form terms would broaden these exact product searches. |

The broad `maple` query already returns several flavoured packaged products. Keep the candidate’s alias lists empty so exact flakes terms remain specific and the broader search does not acquire unreviewed variants.

## Recipe demand and culinary evidence

The manifest lists 114 recipes and 1,123 ingredient rows. A full-text scan of all recipe files and a field scan of each ingredient row (`originalText`, `ingredientName`, `preparation`, `notes`, and `ingredientRefId`) found no exact maple-flakes phrase or matching candidate reference. The corpus has three explicitly linked maple-syrup ingredient lines; none requests flakes. No recipe relink is proposed.

Outside the bundle, Maple from Canada’s “The Ultimate Smoked-Tea Maple Salmon” includes “Maple flakes” as an unquantified garnish sprinkled over the cooked fish [S03]. This confirms an ingredient-line use beyond a product index, but it is one published recipe and does not provide a reusable measure. The maple-association recipe index also currently shows a category for recipes with maple flakes, but its count may overlap other product tags and is not treated as a corpus or cuisine-prevalence estimate.

## Forms, measures, conversions, and substitutions

- Do not add a form under maple syrup or maple sugar. Product naming and the reported production methods are not sufficiently uniform to encode a single normalized state.
- Do not add density, volume mapping, household measure, or conversion. The listed 120 g and 800 g packages are product-specific pack sizes; the salmon recipe gives no amount.
- The maple association’s ratio for panko and flakes is a recipe-specific breading mixture (3 parts panko to 1 part flakes), not a conversion between ingredients or a universal measure [S01].
- Do not suggest flakes as a substitute for granulated, brown, maple, or icing sugar. The association’s sugar-conversion guidance refers to maple sugar and syrup, not flakes [S01, S04]. One producer’s general claim that flakes can replace refined sugar in some recipes is not quantified or scoped to recipe types [S07].
- Do not add a contextual substitution between flakes and syrup, sugar, panko, or breadcrumbs. No source reviewed establishes an equivalent quantity or reliable role-level substitution.

## Sources

Sources were checked on 2026-10-16 and are recorded in the research ledger. Sources support only the claim and scope stated; the official CFIA page is included to record a boundary, not to imply a flakes-specific standard.

| ID | Source and locator | Claim used and limit |
|---|---|---|
| **WP06-MAPLE-FLAKES-R295-20261016-S01** | Érable du Québec, [Flocons d’érable](https://erableduquebec.ca/produits/flocons-derable/), product description and suggested uses. | Direct French product name, freeze-dried/dehydrated syrup description, finishing/breading uses, and a panko-to-flakes recipe mixture. This is the maple producers’ association’s current product guidance, not a government identity standard. |
| **WP06-MAPLE-FLAKES-R295-20261016-S02** | Maple from Canada, [Maple Flakes](https://maplefromcanada.ca/products/maple-flakes/), product description and suggested uses. | English counterpart for `maple flakes` and matching product/process/use claims. It is the same association’s English-language counterpart, not independent corroboration. |
| **WP06-MAPLE-FLAKES-R295-20261016-S03** | Maple from Canada, [The Ultimate Smoked-Tea Maple Salmon](https://maplefromcanada.ca/recipes/the-ultimate-smoked-tea-maple-salmon/), ingredient list and step 7. | Lists maple flakes and directs sprinkling them on salmon as a garnish; no amount is specified. One published recipe, not a general measure or substitution. |
| **WP06-MAPLE-FLAKES-R295-20261016-S04** | Érable du Québec, [Sucre d’érable](https://erableduquebec.ca/produits/sucre-derable/), product process and texture description. | Describes maple sugar as syrup boiled/cooled to crystallize and filtered, with multiple granulations and compact blocks. Supports a distinct product boundary; does not define flakes. |
| **WP06-MAPLE-FLAKES-R295-20261016-S05** | Mayrand, [Pure Maple Flakes 800 g](https://mayrand.ca/en/our-products/grocery/sugar/maple-sugar/flocons-derable-pur-decacer-34109), product name, store listing, and adjacent maple-sugar listing. | Confirms a separately listed Quebec-market flakes SKU and package size. Its maple-sugar breadcrumb is retailer taxonomy; this page does not publish an ingredients list or define a product standard. Stock and price are time-sensitive and not catalog amounts. |
| **WP06-MAPLE-FLAKES-R295-20261016-S06** | Amber Maple Products, [Maple flakes](https://www.ambermaple.ca/products/flocons-erable), product ingredients and uses. | Producer listing calls the product maple flakes, states the sole ingredient as pure Quebec maple syrup, and describes garnish, breading, and cocktail-rim uses. One producer’s product and marketing language, not a universal manufacturing specification. |
| **WP06-MAPLE-FLAKES-R295-20261016-S07** | Ma Cabane en Gaspésie, [Flocons d’érable purs](https://www.macabaneengaspesie.com/collections/produits-d-erable/products/flocons-derable), indexed product description. | Search-indexed product text describes crystallized pure maple syrup, food uses, package options, and maple syrup as the ingredient. Direct page retrieval returned a cache miss, so this is a discrepancy lead only and should be rechecked before relying on its process claim. |
| **WP06-MAPLE-FLAKES-R295-20261016-S08** | Canadian Food Inspection Agency, [Labelling requirements for maple products](https://inspection.canada.ca/en/food-labels/labelling/industry/maple-products), overview and common-name sections. | Gives broad maple-product labelling examples (maple sugar, soft maple sugar, maple butter, maple taffy) and explains that appropriate common names are used for other non-syrup maple products. It does not name maple flakes or establish a flakes-specific standard. |

## Integration record

Added `ingredient-ref-maple-flakes` as `maple flakes / flocons d’érable` in `SUGAR_AND_SWEETENER`, separate from maple syrup and maple sugar. The source-specific descriptions retain the freeze-drying versus crystallization uncertainty; no universal process attribute or aliases were added. No forms, measures, density, mappings, conversions, recipe links, yields, or substitutions were added. The corpus still has no matching ingredient demand.

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema/source ownership, picker projection, the 114-recipe / 1,123-row corpus, UTF-8/no-BOM, local-link, and scoped-whitespace checks passed. No software tests, build, or emulator run was performed because this change only adds database JSON data and its generated index under `AGENTS.md`. See the [R295 integration README](../batches/wp06-north-american-maple-flakes-integration-r295-20261016/README.md). WP06 Section 05 remains open.
