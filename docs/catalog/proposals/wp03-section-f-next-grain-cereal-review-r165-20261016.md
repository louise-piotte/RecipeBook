# WP03 Section F — yellow corn kernels identity review (R165, 2026-10-16)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog JSON, research ledger, generated code, plan, roadmap, recipe, or batch README was changed.
- **Open checklist:** Section F continues to call for remaining grain and cereal coverage, including other unresolved grain products ([active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L519)). The R163 white-corn review explicitly keeps yellow and mixed grain corn separate from white corn, but does not allocate those identities ([R163 white-corn review](wp03-section-f-white-corn-kernels-identity-review-r163-20261016.md)). R164's Peruvian-purple-corn integration adds a different origin-qualified product and leaves ordinary yellow grain corn unreviewed ([R164 integration](../batches/wp02-wp03-wp04-r164-gap-review-integration-20261016/README.md)).
- **Candidate choice:** Yellow corn kernels are the strongest next Section F gap because Canadian grading recognizes a distinct yellow maize class, a Canadian supplier and a Canadian retail product page list food-grade whole yellow kernels, and the bundled catalog has no focused yellow whole-kernel review or owner. This review concerns the dry food-grain product, not fresh sweet corn, popcorn, or a color-neutral corn identity.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference: **`yellow corn kernels / grains de maïs jaune`**. Keep it distinct from generic corn kernels, sweet corn, popcorn, blue/white/Peruvian purple/Chulpe corn, white canjica, hominy, and milled or prepared maize products.
- **Prospective reference and ledger ID:** `ingredient-ref-yellow-corn-kernels` (unallocated).
- **Proposal-local source-ID prefix:** `WP03-YELLOW-CORN-KERNELS-R165-20261016-S` (S01–S07; unallocated). Reuse the existing Grains du Québec source ID for the exact URL already ledgered on the white-corn record.

## Candidate boundary and naming

The proposed identity is **dry, whole, shelled, food-grade yellow field-corn kernels marketed for human food use**, whether sold for cooking or milling. The row records a color-defined food-market product class. It does not identify one cultivar, hybrid, dent/flint type, origin, organic status, GMO status, or Canadian commercial grade.

The Canadian Grain Commission's current guide lists yellow, white, and mixed corn grades for both Eastern and Western Canada and says the color is appended to the grade name [S01]. This establishes an active Canadian grading distinction; it does not establish that a graded lot is suitable for human food. Codex's maize standard covers whole shelled dent and/or flint maize for human consumption, excludes processed maize, and defines yellow maize separately from other kernel-color classes [S02–S03]. Canadian product pages provide food-use evidence: Allzone's supplier page lists food-grade yellow corn with a whole-kernel grade and separate milling/food-processing uses [S04], while a Canadian retailer page lists **Organic Yellow Whole Corn Kernels**, describes dried food-grade kernels grown in British Columbia, and states home-cooking and milling uses [S05]. The retailer page showed the item as sold out when checked on 2026-10-16, so it supports a product listing, not current availability.

Québec French usage supports **`grains de maïs jaune`** as a transparent product construction, not a confirmed whole-kernel package title or an OQLF ruling. Grains du Québec identifies maize grain kernels as `grains`, names yellow as one of the kernel colors, distinguishes grain corn from sweet corn, and describes cooking uses [S06]. Usito lists both `maïs jaune` and `grain de maïs` in its Québec French co-occurrences for `maïs` [S07]. The display combines that local wording with the explicit whole-kernel qualifier. Do not add `maïs-grain` as an alias: it is broader agricultural/product-use terminology and does not select the yellow human-food product.

Keep the following outside this row:

- fresh, frozen, canned, or dried sweet corn, including `dried sweet corn kernels`;
- popcorn and yellow popping corn;
- blue, white, mixed-color, Peruvian purple, and Chulpe corn;
- white canjica maize, other hominy/canjiquinha products, and corn grits;
- cornmeal, corn flour, masa harina, polenta, flakes, puffed corn, and other milled or prepared products;
- feed-grade corn, planting seed, ornamental lots, and corn products with unspecified color or process.

Do not infer a cultivar, food-grade status, or a recipe substitution from color alone. The candidate is supported only when the product itself is sold as dry food-grade whole yellow kernels.

## Proposed reference delta

If accepted, add only this row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-yellow-corn-kernels",
  "nameFr": "grains de maïs jaune",
  "nameEn": "yellow corn kernels",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Add no form, legacy-import mapping, recipe link, package yield, conversion, measurement observation, density, unit mapping, or substitution rule. No alias is needed for `maïs jaune` because that complete phrase occurs inside the proposed French display. Keep English `maize` and broader French `maïs-grain` inactive rather than making the new row a catch-all corn destination.

## Existing ownership, exact-key audit, and source ownership

The current split seed package contains **1,540 references, 119 forms, and 114 manifest-listed recipe files / 1,123 structured ingredient rows**. The legacy-import file contains **61 candidates** and the research ledger contains **1,885 records**. Accent-, punctuation-, case-, and ligature-normalized checks found no exact active reference, form, legacy candidate, or ledger identity for:

- `ingredient-ref-yellow-corn-kernels` or `candidate-yellow-corn-kernels`;
- `yellow corn kernels`, `yellow corn`, `yellow maize kernels`, `grains de maïs jaune`, or `maïs jaune`.

The live catalog has color-qualified blue, white, and Peruvian purple kernel identities, but no yellow whole-kernel identity. The broad `ingredient-ref-corn-kernels` remains `corn kernels / maïs` in `VEGETABLE_AND_AROMATIC`, with no aliases. Its default density is null, unit mappings are empty, and its ledger record is still `not_yet_researched` with no source, measurement, or substitution entries. Keep that broad row unchanged.

Nearby records do not own the candidate:

| Existing neighbor | Current ownership and boundary |
|---|---|
| Generic corn kernels | `ingredient-ref-corn-kernels` — unqualified `corn kernels / maïs`; do not move it or add a yellow alias. |
| Dried sweet corn kernels | `ingredient-ref-dried-sweet-corn-kernels` — dehydrated sweet-corn product, separate from mature grain corn. |
| Popcorn | `ingredient-ref-popcorn` — popping product; do not treat yellow popcorn as this dry field-corn product. |
| Blue, white, Peruvian purple, and Chulpe corn | `ingredient-ref-blue-corn-kernels`, `ingredient-ref-white-corn-kernels`, `ingredient-ref-peruvian-purple-corn-kernels`, and `ingredient-ref-chulpe-corn`; retain their scoped identities and aliases. |
| White canjica and hominy | `ingredient-ref-canjica-white-maize` and `ingredient-ref-hominy-corn`; keep their product-processing distinctions. |
| Puffed corn | The ledger-only `candidate-puffed-corn` record concerns ready-to-eat puffed corn cereal and a manufacturer serving; it does not allocate dry whole yellow kernels. |
| Yellow corn flour | `ingredient-ref-whole-kernel-corn-flour` has Canadian Nutrient File observations for whole-grain yellow corn flour; those observations apply to flour only. |

No source URL below has an existing exact ledger owner except Grains du Québec, whose exact URL is already registered as `WP03-WHITE-CORN-KERNELS-R163-20261016-S03`. Reuse that source entry if the evidence is carried into the new record; do not add a duplicate URL entry. The proposed S01–S05 and S07 URLs are unowned in the ledger. The proposal-local source-ID prefix and proposed ingredient ID are unallocated in the references, forms, legacy file, ledger, and proposal archive.

## Picker projection

The projection follows the phrase-first, accent-folding search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses reference display names, aliases, and attached form terms; the proposed row adds only the two display names. Current and projected result counts are:

| Query | Current → proposed | Picker effect |
|---|---:|---|
| `yellow corn kernels` | 0 → 1 | New whole yellow-corn identity only. |
| `yellow corn` | 0 → 1 | New qualified identity only. |
| `grains de maïs jaune` | 0 → 1 | New French display only. |
| `maïs jaune` | 0 → 1 | Matches the contiguous phrase within the proposed French display after accent folding. |
| `corn kernels` | 5 → 6 | Adds yellow corn beside generic corn kernels, dried sweet corn kernels, and blue, white, and Peruvian purple corn. |
| `corn` | 31 → 32 | Adds one qualified grain result to the broad corn search. |
| `maïs` | 33 → 34 | Adds one qualified grain result to the broad French search. |
| `maize` | 4 → 4 | Unchanged; no broad English maize alias is added. |
| `cornmeal` / `corn grits` | 1 / 1 → 1 / 1 | Existing milling-product owners remain unchanged. |
| `hominy corn` / `hominy grits` | 1 / 1 → 1 / 1 | Existing processed-product owners remain unchanged. |
| `popcorn` / `maïs soufflé` | 1 / 1 → 1 / 1 | Existing popping product remains unchanged. |
| `sweet corn` / `dried sweet corn kernels` | 1 / 1 → 1 / 1 | Existing sweet-corn product remains unchanged. |
| `blue corn kernels` / `white corn kernels` / `Peruvian purple corn kernels` / `Chulpe corn` | 1 / 1 / 1 / 1 → unchanged | Existing color- and variety-qualified owners remain unchanged. |
| `white canjica maize` / `canjica white` | 1 / 1 → unchanged | Existing canjica product remains unchanged. |

This creates a useful exact color-qualified choice while intentionally adding one result to broad corn searches. It does not add `corn`, `maize`, `maïs`, `maïs-grain`, `maïs en grains`, or a generic `yellow maize` alias.

## Recipe demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were scanned for yellow-corn and yellow-maize variants, including `yellow corn kernels`, `yellow corn`, `whole yellow corn`, `yellow dent corn`, `yellow maize kernels`, `grains de maïs jaune`, `grain de maïs jaune`, `maïs jaune`, and `maïs-grain`. The scan found **zero candidate phrase hits in complete recipe files, zero candidate phrase hits in ingredient rows, and no link to the proposed ID**. No recipe link or relink is recommended.

Recipe 078 has one `1/2 cup frozen corn kernels` row linked to the unqualified `ingredient-ref-corn-kernels`; it does not name color or dry grain state. Keep it linked there. Do not infer that it uses yellow whole dry corn or change its amount, frozen preparation, or owner.

## Forms, measures, and substitution assessment

- **Forms:** The 119-form file has no form attached to the candidate or generic corn-kernel reference. The only direct corn form is dried corn husks, a separate ingredient. Add no dry/cooked, canned, frozen, popped, or nixtamalized form for this identity.
- **Reusable measures and density:** None are supported. Allzone's 25 kg / 50 kg bags and bulk bags are commercial shipping options [S04]; Hundredfold's 2 kg is a retail package size, not a recipe measure [S05]. The Codex maize standard's moisture limit is a food-quality specification, not a household portion [S03]. Canadian Grain Commission test-weight thresholds are grade criteria, not a transferable kitchen density or volume conversion [S01]. Hundredfold's soak and boil directions identify one seller's preparation method but provide no transferable water ratio, serving, or cooking yield [S05]. Keep `defaultDensity: null`, `unitMappings: []`, and measurement observations empty.
- **Adjacent numeric evidence:** The dried-sweet-corn ledger record has a source-specific 1/2 cup / 19 g serving for Augason freeze-dried sweet corn; the canjica record has a product-specific 50 g / 1/3 `xícara de chá` serving; and the ledger-only puffed-corn candidate has an Arrowhead ready-to-eat cereal 3/4 cup / 14 g serving. These belong to different product states and brands and must not transfer. The existing yellow corn-flour CNF portions likewise apply only to flour.
- **Substitutions:** No reviewed source establishes a quantity-backed or context-tested replacement involving dry yellow kernels. Shared maize species, color, or downstream uses do not establish interchangeability with generic frozen corn, sweet corn, popcorn, Chulpe, blue/white/Peruvian purple corn, canjica, hominy, grits, or milled products. Keep measurement and substitution findings empty and add no global or contextual rule.
- **Rule files, conversions, and package yields:** The global and contextual substitution-rule arrays contain no rules, the ledger's eight unit conversions contain no corn/maize entry, and the package-yield file contains no corn record. Add none.

## Proposed ledger disposition

If accepted, add one `ingredient_reference` record keyed `ingredient-ref-yellow-corn-kernels`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Register the source records below, reuse the already-ledgered Grains du Québec source ID, and leave `measurementObservations` and `substitutionFindings` empty. Record one accepted decision for the scoped dry food-grade whole-kernel class. Do not add a separate candidate record, forms, recipe links, numeric behavior, or substitutions.

## Source register

Sources were checked on 2026-10-16. Product availability and package options can change; retail and supplier details below are bounded to their pages. Proposal-local IDs are unallocated except S06, which names an existing ledger source for reuse.

| Local ID | Source | Evidence and limits |
|---|---|---|
| **WP03-YELLOW-CORN-KERNELS-R165-20261016-S01** | Canadian Grain Commission, [Maïs : tableaux de détermination des grades primaires et des grades d’exportation](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/17-mais/tableaux-determination-grades-primaires-exportation.html), current guide effective 2026-08-01. | Names yellow, white, and mixed corn grades for Eastern and Western Canada and says color is appended to the grade name. Supports the Canadian grade-class distinction, not human-food suitability, a cultivar, or a kitchen measure. Hectoliter test-weight thresholds are grading specifications only. |
| **WP03-YELLOW-CORN-KERNELS-R165-20261016-S02** | FAO/WHO Codex Alimentarius, [CXS 153-1985, Standard for Maize (Corn), current standards listing](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/en/?ids=91). | The current Codex listing identifies CXS 153-1985 as the maize standard and marks it last modified in 2026. This is a registry record, not the text of the standard. |
| **WP03-YELLOW-CORN-KERNELS-R165-20261016-S03** | FAO/WHO Codex Alimentarius, [CXS 153-1985, Standard for Maize (Corn), official PDF](https://www.fao.org/input/download/standards/51/CXS_153e.pdf). | The published text scopes the standard to whole shelled dent/flint maize for human consumption, excludes processed maize, and defines yellow maize in its color annex. The PDF identifies its adopted/revised edition as 1985/1995; use it for product scope and color terminology, not a current Canadian grade or recipe measure. |
| **WP03-YELLOW-CORN-KERNELS-R165-20261016-S04** | Allzone Trading, [Non-GMO Yellow Corn](https://allzonetrading.ca/supply/non-gmo-yellow-corn), current Canadian supplier page. | Lists food-grade yellow corn, a whole-kernel grade, and separate milling/food-processing lots. Bulk quantities, global sourcing, grade, origin, and availability are quotation-specific; the page is evidence of a current food-supply listing, not a consumer label or household measure. |
| **WP03-YELLOW-CORN-KERNELS-R165-20261016-S05** | Hundredfold Canada, [Organic Yellow Whole Corn Kernels](https://www.hundredfold.store/products/organic-yellow-whole-corn-2kg), retailer product page (shown sold out on 2026-10-16). | Titles the listing as whole yellow corn kernels and describes dried, food-grade kernels grown by British Columbia family farms for home cooking and milling. Its organic/non-GMO claims and 2 kg package size are product-specific; the page gives no reusable recipe measure, general specification, or current availability. |
| **Reused WP03-WHITE-CORN-KERNELS-R163-20261016-S03** | Grains du Québec, [Maïs du Québec](https://grainsduquebec.ca/nos-grains/mais), current French page. | Identifies maize kernels as `grains`, names yellow/white/purple kernel colors, distinguishes grain corn from sweet corn, and describes culinary use. Supports local French wording and context, not a direct whole-yellow-kernel label. The exact URL is already owned by the white-corn ledger record; reuse the existing source ID. |
| **WP03-YELLOW-CORN-KERNELS-R165-20261016-S07** | Usito, [maïs — exemples et cooccurrents](https://usito.usherbrooke.ca/d%C3%A9finitions/ma%C3%AFs/exemples_cooccurrents_citations), content current 2026-06-19. | Lists `maïs jaune`, `grain de maïs`, and `maïs séché, concassé` in Québec French co-occurrences. Supports the transparent display wording; it is not a terminology ruling or product specification. |

## Review checks

- Read current `AGENTS.md`, the Section F checklist through R164, the R161–R164 corn proposals and integration notes, active references/forms/legacy identities, the research ledger, and `IngredientSearch.kt` before drafting.
- Checked exact normalized candidate ownership, proposed ID/source-ID allocation, and exact source-URL ownership. The Grains du Québec source is reused; the other listed URLs are unowned in the ledger.
- Reproduced the picker projection against the current reference/form snapshot with the proposed display names appended.
- Parsed every manifest-listed recipe and structured ingredient row. No app, unit, instrumentation, emulator, deployment, or build tests were run; this is a proposal-only Markdown file.
