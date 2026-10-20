# WP02 Round R342 proposal: fancy molasses

- **Status:** Accepted and integrated. See the [R342 integration README](../batches/wp02-section-c-fancy-molasses-integration-r342-20261016/README.md).

## Plan fit

This is a distinct, unfinished candidate under WP02 Section 04 C, whose open checklist includes regular/fancy molasses, blackstrap molasses, and other syrup grades. It does not reopen the prior generic-molasses hold or the accepted blackstrap identity.

## Suggested disposition

Add one identity-only `SUGAR_AND_SWEETENER` reference for the Canadian source-defined `fancy molasses` class. Use the OQLF preferred French display `mélasse de fantaisie`. Keep the generic `molasses / mélasse` candidate unresolved under its existing owner.

The accepted identity scope is the Canadian class made from clarified or unclarified sugar-cane juice, evaporated and partially inverted before any sugar has been extracted. The current Canadian standard limits moisture to 25% and sulphated ash to 3%. These are compositional limits, not reusable kitchen measures.

## Supported names

| Field | Proposed value | Evidence and limits |
|---|---|---|
| English display | `fancy molasses` | Exact English class name in the Canadian standard and OQLF translation. |
| Québec French display | `mélasse de fantaisie` | OQLF-preferred term for `fancy molasses`. |
| English aliases | None | No shorter or broader English form is needed; do not add `fancy`, `molasses`, or `cane molasses`. |
| French aliases | `mélasse qualité fantaisie`; `mélasse de qualité fantaisie` | Both phrases occur in current Québec retail product wording; the first also appears as the Canadian French class wording. Keep the OQLF preferred term as the display. |

Do not use `table molasses`, `refiners' molasses`, `blackstrap molasses`, `cooking molasses`, `dark molasses`, or `treacle` as aliases. The Canadian standard defines distinct source/process classes for fancy, table, and residual refiners'/blackstrap/cooking molasses. The unqualified retail cooking product may be a blend rather than the fancy class.

## Current ownership, picker, and recipe review

- Active references include `ingredient-ref-blackstrap-molasses` (`blackstrap molasses / mélasse verte`, with `blackstrap`, `black strap`, and `third molasses` English aliases) and `ingredient-ref-pomegranate-molasses` (`pomegranate molasses / mélasse de grenade`). Keep both identities and categories unchanged.
- The legacy file still has `ingredient-ref-molasses` (`molasses / mélasse`) with `reviewState: unreviewed`; the research ledger retains it as an unresolved candidate. Do not reuse or promote that ID for this grade.
- No active reference, form, or legacy owner was found for `fancy molasses`, `mélasse de fantaisie`, or the proposed product-label variants. The proposed qualified queries should resolve to the new reference alone.
- The current phrase-first picker test asserts that `molasses` returns the blackstrap and pomegranate-molasses references. Adding this row would make that broad query return all three distinct results. A broad `mélasse` query would show four rows after integration: blackstrap molasses, fancy molasses, golden syrup (through its OQLF-backed `mélasse claire` and `mélasse légère` aliases), and pomegranate molasses. This is expected discovery behavior, not synonymy. Do not add broad names as aliases.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for `molass`, `mélasse`, and `treacle`; none matched. No recipe link or recipe-driven quantity is proposed.

Picker implementation inspected at `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`; the current broad English-query assertion is in `app/src/test/java/app/recipebook/data/local/recipes/BundledIngredientCatalogTest.kt`. No picker code change is proposed.

## Numeric and substitution boundaries

The current Crosby product page distinguishes its fancy and blackstrap products and describes its cooking molasses as a blend of those two. Crosby says its cooking product can commonly replace its fancy product in many recipes, with a more robust result. Keep that advice scoped to Crosby's product family and record it, if desired, only as source-specific evidence; no global substitution rule or reverse rule is supported.

Crosby's product material also gives brand-specific package sizes and a 1 tablespoon (20 g) serving. Record the label serving only as a source-specific ledger observation; do not set a default density or unit mapping from it. Record the directional Crosby cooking-blend advice as blocked pending a transferable product/context scope. Add no forms, conversions, yields, recipe links, or active substitutions.

## Implementation notes

Suggested active reference shape:

```json
{
  "id": "ingredient-ref-fancy-molasses",
  "nameFr": "mélasse de fantaisie",
  "nameEn": "fancy molasses",
  "aliasesFr": [
    "mélasse qualité fantaisie",
    "mélasse de qualité fantaisie"
  ],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "SUGAR_AND_SWEETENER"
}
```

Create a distinct research-ledger identity record with the source claims below. Keep the existing generic-molasses candidate's status and evidence ownership intact. No recipe files or picker code need changes. The accepted catalog, ledger, checklist, picker projection, and static validation are recorded in the integration README.

## Sources

| Source ID | Source | Supported claim and scope |
|---|---|---|
| `WP02-C-FANCY-MOLASSES-R342-20261016-S01` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 15, §15.1.8 | Defines the English `Fancy Molasses` class, its cane-juice process, and maximum moisture and sulphated-ash levels. Adjacent sections define table and residual refiners'/blackstrap/cooking classes separately. |
| `WP02-C-FANCY-MOLASSES-R342-20261016-S02` | CFIA, [Normes canadiennes de composition des aliments](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Volume 15, §15.1.8 | Current French standard uses `La mélasse qualité fantaisie` and describes the same source/process class. |
| `WP02-C-FANCY-MOLASSES-R342-20261016-S03` | OQLF, [« mélasse de fantaisie » (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497794/melasse-de-fantaisie) | OQLF preferred Québec French term and English translation `fancy molasses`; terminology record, not a product composition standard. |
| `WP02-C-FANCY-MOLASSES-R342-20261016-S04` | Crosby Foods, [Our Molasses](https://www.crosbys.com/product/) | Current Canadian manufacturer page presents Fancy, Blackstrap, and Cooking as separate products; describes Fancy as cane juice condensed, inverted, and purified, and Cooking as a Fancy/Blackstrap blend. Brand-specific identity corroboration and usage advice. |
| `WP02-C-FANCY-MOLASSES-R342-20261016-S05` | Metro, [Crosby's Mélasse de fantaisie, 675 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/miels-et-sirops/melasse-de-fantaisie/p/056786000352) | Current Québec retailer product title and listing; the ingredient wording includes `Mélasse qualité fantaisie`. SKU listing, not a generic package amount. |
| `WP02-C-FANCY-MOLASSES-R342-20261016-S06` | Metro, [Grandma Mélasse de qualité fantaisie, 675 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/miels-et-sirops/melasse-de-qualite-fantaisie/p/068932401234) | Current Québec retailer display corroborates the `mélasse de qualité fantaisie` wording on a separate named product. Product-specific listing. |
| `WP02-C-FANCY-MOLASSES-R342-20261016-S07` | Crosby Foods, [Pure Sweetness ebook](https://www.crosbys.com/wp-content/uploads/2021/10/6633-Crosbys-Pure-Sweetness-eBook.pdf), p. 2 | Manufacturer product image shows bilingual package wording and a label serving of 1 tablespoon (20 g). Historical, brand-specific observation only; no reusable conversion. |
