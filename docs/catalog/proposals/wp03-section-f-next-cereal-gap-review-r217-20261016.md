# WP03 Section F: Plain Cheerios cereal identity review (R217)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Submitted proposal accepted and integrated on 2026-10-16. The worker handoff itself changed no shared catalog data, ledger, plan, or recipes; see the R216–R218 integration README.
- **Open checklist:** Section F still calls for regionally significant cereal mixes and preprocessed grains in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3643), and its remaining grain/product coverage is explicitly open at [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L528).
- **Candidate:** the current Canadian plain, ready-to-eat Cheerios SKU, sold under the manufacturer title **Cheerios**.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, proposed ID `ingredient-ref-cheerios-original`, with manufacturer display names `Cheerios / Cheerios`. Keep aliases empty and add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions.

**Priority rationale:** This is the manufacturer’s plain flagship SKU, separately listed in its current Canadian English and French product families, while the catalog currently contains only named Cheerios variants. It fills the base-product gap and makes the plain SKU directly searchable without collapsing the broader brand family. Its priority is catalog coverage; the bundled corpus has no Cheerios-specific recipe demand.

## Product identity and Québec naming

General Mills Canada currently lists **Cheerios** as a distinct Canadian product and has a dedicated Canadian English product page under that title. Its French-Canadian page also titles the SKU **Cheerios** and describes it as a ready-to-eat cereal made with whole-grain oats. Use these exact manufacturer titles as the English and French displays. The name is a brand title in both locales; the French title does not require an invented translation.

Current Québec retail listings corroborate the market item and provide useful local descriptive wording: Mayrand titles it **Céréales Cheerios 570 g** and identifies Québec stores and item code `065633134652`; Maxi lists **Cheerios Saveur Originale, Format Familial, Céréales à Base de Grains Entiers** as a 570 g item. These retailer names support product identification and Québec availability context. Keep them out of aliases: the manufacturer’s bilingual title is direct, and the exact `Cheerios` phrase should return the plain SKU alongside other Cheerios products rather than turning retailer descriptors into a single owner for broader cereal or “original” searches.

The identity is the single plain, toasted-oat ring cereal SKU, not the Cheerios brand family as a whole. Its ingredient declaration lists whole-grain oats, corn starch, sugar, salt, and processing/nutrient ingredients, but no proportions. Do not decompose it into those ingredient references, map it to oats, or treat the cereal as a form of whole oats.

| Neighbor | Current owner or status | Boundary |
|---|---|---|
| `Multi-Grain Cheerios / céréales multigrains Cheerios` | `ingredient-ref-multi-grain-cheerios` ([R180](wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md)) | Separate formulated SKU; the shared brand is not equivalence. |
| `Strawberry Banana Cheerios / Cheerios Fraises et bananes` | `ingredient-ref-strawberry-banana-cheerios` ([R185](wp03-section-f-strawberry-banana-cheerios-identity-review-r185-20261016.md)) | Separate flavor and formulation. |
| Oat Crunch Almond, Cinnamon, and Oats ‘N Honey Cheerios | Three active references ([R198](wp03-section-f-oat-crunch-cheerios-family-review-r198-20261016.md)) | Separate ready-to-eat products; do not alias any flavor to plain Cheerios. |
| Honey Nut Cheerios and Lower Sugar Honey Nut Cheerios | Held together as a family in [R186](wp03-section-f-honey-nut-cheerios-family-picker-hold-review-r186-20261016.md) | Distinct products; this proposal does not reopen that hold. |
| Whole oats, rolled oats, corn starch, sugar, and other cereal ingredients | Existing ingredient references | Declared components do not establish a formula, form relation, or substitution. |
| Other current Cheerios SKUs | Manufacturer lists 17 products | This proposal covers only the plain SKU. It does not claim the entire brand lineup is catalogued. |

The [R180](wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md), [R181](wp03-section-f-cheerios-oat-crunch-cinnamon-identity-review-r181-20261016.md)/[R198](wp03-section-f-oat-crunch-cheerios-family-review-r198-20261016.md), [R185](wp03-section-f-strawberry-banana-cheerios-identity-review-r185-20261016.md), and [R186](wp03-section-f-honey-nut-cheerios-family-picker-hold-review-r186-20261016.md) reviews cover other named Cheerios SKUs or a separate flavor-family hold. Archive searches found no focused identity decision or hold for the plain SKU. These neighboring records do not decide its product name, Canadian presence, serving, recipe demand, or aliases.

## Active ownership, archive, and source-ID audit

At the audit snapshot the active package contains **1,611 ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,956 research-ledger records**. The live catalog has five Cheerios references, all for other products: Multi-Grain, Strawberry Banana, and the three Oat Crunch variants. No active display name is exactly `Cheerios`; no Cheerios form or legacy-import identity exists.

Exact checks of active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidates, ledger record IDs, the current plan, and proposal/batch archives found no owner or focused accepted/held/reviewed disposition for `ingredient-ref-cheerios-original`, the plain SKU, or its exact Canadian English/French product-page titles. The archive does contain the neighboring product reviews noted above. The proposed reference ID is currently unowned.

**Free source-ID namespace, reported but not allocated:** `WP03-PLAIN-CHEERIOS-R217-20261016-S01` through `WP03-PLAIN-CHEERIOS-R217-20261016-S06` did not appear in the live ledger or proposal/batch archive at the time of this review. This proposal does not add or reserve those source IDs in the ledger. The English product-list URL is already registered as `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03`, and the French product-list URL is already registered as `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S04`; reuse those existing records if the proposal is accepted rather than minting IDs for the same URLs.

The direct English/French product-page and Québec retailer URLs listed below were not present in the live ledger at the audit snapshot. No source record is being allocated here.

## Picker and alias boundary

The catalog already contains several Cheerios products, while the manufacturer lists 17 current products. The query **Cheerios** should continue to return a multi-result brand family; adding the plain SKU would add one result. Use the exact manufacturer title `Cheerios` in both display fields. Keep both alias arrays empty.

Do not add `Original Cheerios`, `Cheerios Original`, `regular Cheerios`, `Céréales Cheerios`, or the longer retailer product titles as aliases. The manufacturer product title is already bilingual and exact. Retailer descriptions are useful evidence of Canadian/Québec market identity, but they do not need to become alternate names; broad brand and cereal query behavior should not be narrowed to the plain product.

## Bundled recipe-corpus demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for the proposed ID, `Cheerios`, `Original Cheerios`, `Cheerios Original`, `céréales Cheerios`, the Québec retailer item code `065633134652`, and item number `11817`. The scan found **0 matching recipe files and 0 matching ingredient rows**. No recipe link or recipe-text change is supported. The existing `Chocolate Nutty Crisp` recipe calls for generic crispy rice cereal, which is a different product and remains linked to `ingredient-ref-rice-cereal`.

## Measurement, preparation, and substitution boundaries

- **Manufacturer serving:** The Canadian English and French product pages each state **1 cup / 1 tasse (27 g)** for the as-packaged cereal. If the identity is accepted, keep this as a product-specific `portion_weight` observation only. It is not a generic cereal measure, active volume-to-mass mapping, or density.
- **Package sizes:** The manufacturer lists 260 g, 350 g, 570 g, and 1 kg formats. These are net package sizes, not recipe amounts or yields. Québec retail sources corroborate a 570 g SKU.
- **Preparation and forms:** The cereal is sold ready to eat. The reviewed sources do not support a preparation form, cooking yield, density, or conversion; add none.
- **Substitution:** The manufacturer describes the cereal as a snack and says it can be used in recipes, but does not provide a tested, quantity-qualified replacement for another Cheerios product, crispy rice cereal, oats, or a different breakfast cereal. The recipe corpus has no plain-Cheerios demand. Add no global or contextual substitution rule.
- **Composition:** The label does not give ingredient proportions. Do not add component links, formula mappings, or ingredient-to-cereal substitutions.

## Conditional reference and ledger shape

If accepted, add this identity-only reference:

```json
{
  "id": "ingredient-ref-cheerios-original",
  "nameFr": "Cheerios",
  "nameEn": "Cheerios",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

Add no form or legacy-import mapping. If accepted, the ledger record could use `recordType: ingredient_reference`, `recordId: ingredient-ref-cheerios-original`, `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: researched_no_supported_substitute`. The 1 cup (27 g) panel amount, if recorded, must remain a source-specific observation for Cheerios as sold. Keep active measures, `unitMappings`, `substitutionFindings`, recipe links, and forms empty.

## Sources

Sources checked on 2026-10-16. No new source IDs are assigned in this proposal; see the free-namespace audit above. The two product-list sources reuse the existing ledger IDs named there.

| Source | Evidence and limits |
|---|---|
| General Mills / Cheerios Canada, [Cheerios](https://www.cheerios.ca/products/cheerios), product title, description, ingredients, package sizes, and Nutrition Facts panel. | Current Canadian English manufacturer product page. Supports the exact English title, whole-grain-oat cereal identity, formula boundary, 1 cup (27 g) panel serving, listed sizes, and recipe use. The manufacturer says package information governs if online content differs. |
| General Mills / Cheerios Canada, [Cheerios](https://www.cheerios.ca/fr-CA/products/cheerios), French title, description, ingredients, package sizes, and Valeur nutritive panel. | Current Canadian French manufacturer page. Supports the exact French display, product identity, ingredient boundary, 1 tasse (27 g) serving, and listed formats. |
| General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products). | Current English product list reports 17 Cheerios products and lists `Cheerios` separately from named variants. This URL already has a ledger source ID from R185; reuse it. |
| General Mills / Cheerios Canada, [Nos produits](https://www.cheerios.ca/fr-CA/products). | Current French-Canadian product list reports 17 products and lists `Cheerios` separately from named variants. This URL already has a ledger source ID from R181; reuse it. |
| Mayrand, [Céréales Cheerios 570 g](https://mayrand.ca/fr/nos-produits/epicerie/cereales-et-barre/cereales/cereales-cheerios-cheerios-11817), item number 11817 and unit UPC `065633134652`. | Current Québec retailer listing gives the local descriptive title, 570 g unit, bilingual ingredient information, and Québec store locations. The page showed “Bientôt disponible” at the checked stores; use it as naming and item-identity corroboration, not as an in-stock claim or measurement authority. |
| Maxi, [Cheerios Saveur Originale, Format Familial, Céréales à Base de Grains Entiers](https://www.maxi.ca/fr/cheerios-saveur-originale-format-familial-c-r-ales/p/21103499_EA). | Current Québec-facing French retail listing identifies the plain 570 g product and supports the retailer's original-flavor phrasing. This is a product title, not the manufacturer's canonical bilingual name or an approved alias. |

## Recommendation

**Add identity-only `ingredient-ref-cheerios-original` as `Cheerios / Cheerios`.** The current Canadian manufacturer pages establish the exact bilingual title, plain ready-to-eat cereal identity, distinct product-specific 1 cup (27 g) serving, and current package range; Québec listings corroborate the local market item. Keep it separate from the catalogued Multi-Grain, Strawberry Banana, and Oat Crunch products, and from the Honey Nut family hold. Keep aliases empty, record the label serving only as a product-specific ledger observation if accepted, and add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions. The bundled corpus has no matching recipe demand. Section F coverage remains open.

## Reopen conditions

- Recheck the manufacturer title, package sizes, or panel amount if General Mills changes the Canadian plain SKU.
- Review the Cheerios product family together if picker behavior needs a dedicated brand-family grouping or completeness target; this proposal does not claim all 17 current products are represented.
- Add forms, reusable measures, yields, recipe links, or substitutions only if source evidence or bundled recipes provide a concrete basis.
