# WP04 Section P R814 — canned-crab label portions review

- **Review and source-access date:** 2026-10-19.
- **Target:** Existing `ingredient-form-crab-canned` ledger record under `ingredient-ref-crab`.
- **Recommendation:** Add two manufacturer-specific `portion_weight` observations for named Clover Leaf products, one each for `¼ cup (55 g)`. Keep both observations source-bounded; do not create a reusable cup conversion, density, alias, or substitution.
- **Write scope:** This proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, or generated file was edited.

## Why this is a distinct unfinished gap

The current Section P checklist still has open shellfish identity work ([global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8145)). The recent R811 review held Iceland cockle / `coque d’Islande` outside the picker because the qualified display would make broad `cockle` / `coque` searches look resolved. This review concerns no cockle identity and does not revisit that hold. It follows the already integrated R173 canned-crab form, whose current evidence record has two manufacturer product pages that publish a nutrition serving but still has no measurement observations.

The missing data is narrow and useful as source history: Clover Leaf’s product pages publish `¼ cup (55 g)` for two different canned crab products. Each value can be retained as that named product’s nutrition-label portion. The pages do not provide the filling method, cup capacity, drained state for the serving, or a general measurement protocol. They do not support a general canned-crab cup-to-mass conversion.

## Identity and bilingual label boundary

The active catalog already has one generic identity, `crab meat / chair de crabe` (`ingredient-ref-crab`), and its canned form, `canned crab meat / chair de crabe en conserve` (`ingredient-form-crab-canned`). OQLF’s existing source record `WP04-CRAB-MEAT-20261011-S01` pairs `chair de crabe` with English `crab meat`; the accepted R173 form uses `en conserve` descriptively. This review adds no new catalog name or alias.

The two manufacturer products are distinct evidence subjects:

- Clover Leaf’s English product page names **Chunk Crabmeat**. Its French-language product page is titled **Morceaux de crabe Clover Leaf**; that URL is already owned by `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S03` on a separate ledger record. Do not duplicate the URL or transfer that record’s species interpretation here.
- Clover Leaf’s French product page names **Chair de crabe 15% de chair de pattes Clover Leaf**; the English counterpart names **Crabmeat with 15% Leg meat**. The French page is already source `WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S02` on the target form. This proposal adds the unowned English counterpart so the product wording and label portion can be cross-checked in both languages.

These product names remain in the evidence only. Do not add brand, cut, grade, or percentage terms to the generic form’s searchable labels or aliases. Both manufacturer pages report *Portunus* sourcing, but those product-specific statements do not identify all canned crab meat and must not be added to the generic reference.

## Exact proposed ledger delta

For `ingredient-form-crab-canned`, retain `identityState: verified`, change `measurementState` from `researched_no_supported_value` to `researched_supported` because two labeled portions are now documented, and leave `substitutionResearchState: researched_no_supported_substitute` unchanged. Append the two sources and observations below, plus one accepted decision referencing the sources. Do not add a substitution finding.

The two observations are separate product-label servings, not independent measurements of a generic ingredient. The English and French pages for the 15% leg-meat product show the same maker product and serving; they are a language cross-check, not replicate evidence. The existing R173 sources already provide the English Chunk product page and the French 15% leg-meat product page.

```json
{
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S01",
      "url": "https://www.cloverleaf.ca/en/products/crabmeat-with-15-leg-meat/",
      "title": "Clover Leaf, Crabmeat with 15% Leg meat",
      "accessedOn": "2026-10-19",
      "locator": "Current English product page; product title and Nutrition Facts serving basis.",
      "supports": "Pairs the English product title with the French 15% leg-meat product page already on the target ledger record. Publishes Per 1/4 cup (55 g) for this product only; it does not state cup capacity, filling method, or a generic canned-crab conversion.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S02",
      "url": "https://www.cloverleaf.ca/en/recipes/cajun-crab-fondue/",
      "title": "Clover Leaf, Cajun Crab Fondue",
      "accessedOn": "2026-10-19",
      "locator": "Recipe ingredient list and product-specific alternative in the tip.",
      "supports": "Uses 3 cans (120 g each) of Chunk Crabmeat, drained, and says this formula also works with 2 cans of the maker's 15% Legmeat product, chopped before blending. The tip does not give the alternate can mass or establish equal drained yield or a reusable substitution.",
      "sourceKind": "culinary_reference"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "wp04-canned-crab-chunk-cloverleaf-quarter-cup-55g-r814-20261019",
      "relationship": "portion_weight",
      "ingredientFormId": "ingredient-form-crab-canned",
      "value": 55,
      "valueUnit": "g",
      "foodDescription": "One Clover Leaf Chunk Crabmeat Nutrition Facts serving.",
      "foodState": "Canned commercial crabmeat in the named product; the serving declaration does not say whether it is drained.",
      "measurementMethod": "The manufacturer page states Per 1/4 cup (55 g); cup capacity, filling/packing method, and weighing protocol are not stated.",
      "quantityBasis": "One source-specific product label serving only; not a general canned-crab portion, density, or volume-to-mass conversion.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Manufacturer label cup; its volume in mL and equivalence to the app cup are unspecified."
      },
      "observedMassG": 55,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S03"]
    },
    {
      "observationId": "wp04-canned-crab-15pct-leg-cloverleaf-quarter-cup-55g-r814-20261019",
      "relationship": "portion_weight",
      "ingredientFormId": "ingredient-form-crab-canned",
      "value": 55,
      "valueUnit": "g",
      "foodDescription": "One Clover Leaf Crabmeat with 15% Leg meat Nutrition Facts serving.",
      "foodState": "Canned commercial crabmeat in the named product; the serving declaration does not say whether it is drained.",
      "measurementMethod": "The English and French manufacturer pages state Per 1/4 cup (55 g); cup capacity, filling/packing method, and weighing protocol are not stated.",
      "quantityBasis": "One source-specific product label serving only; the paired-language pages are not replicate measurements and do not establish a generic canned-crab portion or conversion.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Manufacturer label cup; its volume in mL and equivalence to the app cup are unspecified."
      },
      "observedMassG": 55,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S02",
        "WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S01"
      ]
    }
  ],
  "decision": {
    "outcome": "accepted",
    "reason": "Record the two named Clover Leaf Nutrition Facts portions on the existing canned-crab form. They are source-specific product servings, not generic measurements. Keep density, unit mappings, active measures, substitution rules, and the existing form and bilingual labels unchanged.",
    "sourceIds": [
      "WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S02",
      "WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S03",
      "WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S01",
      "WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S02"
    ]
  }
}
```

Add the recipe source to the existing record only to preserve the reviewed substitution limit; do not add a substitution finding. Source `S01` and recipe source `S02` have no exact URL owners in the live ledger. The R814 source IDs have no ledger or proposal-archive collision.

Do not add an `observedVolumeMl`, `densityGPerMl`, unit mapping, conversion, package-yield row, or runtime measurement. The app’s `cup` unit is 236.5882 mL; the label pages do not state that their `cup` serving uses that convention. In particular, do not turn `55 g / 0.25 cup` into a density.

## Substitution review, separately

Clover Leaf’s [Cajun Crab Fondue](https://www.cloverleaf.ca/en/recipes/cajun-crab-fondue/) formula specifies three 120 g cans of Chunk Crabmeat, drained, and says that the recipe also works with two cans of Crabmeat 15% Legmeat, chopped before blending. The tip does not restate the second product’s can weight or say that the two options have equal drained mass. This is one maker formula’s named-SKU option, not a general substitution between crab ingredients or preparation forms.

Both named SKUs currently resolve to the same single active form, `ingredient-form-crab-canned`. A form-to-itself rule would be misleading, and the catalog has no SKU-level identity or property for these two products. Keep the existing `substitutionResearchState: researched_no_supported_substitute` for a reusable catalog-level rule; add no global/contextual rule, recipe-line link, or substitution finding. The review does not erase the manufacturer’s recipe-specific option.

## Catalog, source ownership, picker, and recipe audit

The live package contains **1,886 references** and **199 forms**; the ledger contains **2,294 records** and **10,761 source entries**. `ingredient-ref-crab` is `crab meat / chair de crabe`, category `PROTEIN`, with no aliases, default density, or unit mappings. `ingredient-form-crab-canned` is already the single canned presentation. Its ledger state is `identityState: verified`, `measurementState: researched_no_supported_value`, `substitutionResearchState: researched_no_supported_substitute`, with six sources and zero measurement observations or substitution findings. The existing Jumbo Lump form stays separate.

Exact source ownership was checked against ledger URLs and the proposal/batch archive:

| Source or key | Current owner | R814 handling |
|---|---|---|
| `ingredient-ref-crab`; `ingredient-form-crab-canned` | Active generic crab-meat reference and its one canned form. | Append evidence to this existing form ledger record only. |
| `canned crab meat`; `chair de crabe en conserve` | Existing bilingual form labels; no new alias is needed. | Keep unchanged. |
| R173 source S02 (French 15% Leg meat) and S03 (English Chunk) | Already on `ingredient-form-crab-canned`. | Reuse their source IDs for their matching observations. |
| English 15% Leg meat product URL | No ledger owner. | Add as R814-S01, paired with existing French R173-S02. |
| Cajun Crab Fondue recipe URL | No ledger owner. | Add as R814-S02 for the source-bounded substitution review only. |
| French Chunk product URL | Already owned by `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S03` on another record. | Do not duplicate or transfer its species interpretation. The canned-form observation uses existing R173 English Chunk page S03. |

The static picker projection follows production [phrase-first search behavior](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): a complete normalized word phrase inside a longer indexed term matches before substring fallback. The proposed change touches ledger evidence only, so every projection remains unchanged. The tested phrases below include shorter phrases within the active form labels:

| Query | Current projection | With R814 | Result |
|---|---|---|---|
| `canned crab meat`; `chair de crabe en conserve` | `ingredient-ref-crab` with the canned-form hint | Same | Full form phrases remain available. |
| `canned crab` | `ingredient-ref-crab` through the phrase inside `canned crab meat` | Same | Broad subphrase behavior remains intact. |
| `crab meat`; `chair de crabe` | Generic crab meat and imitation crab | Same | No extra identity or aliases. |
| `crab`; `crabe` | 14 and 13 results respectively | Same | The broad crab picker stays unchanged. |
| `canned`; `en conserve` | 20 and 19 results respectively, including generic crab meat | Same | Broad preservation queries stay unchanged. |
| `chunk crabmeat`; `15% leg meat` | No result | Same | Brand/product strings are not added as search aliases. |

The manifest lists **114 recipes** and **1,123 structured ingredient rows**. None asks for canned crab. The one crab row is recipe [019, `Boulettes de crabe / Crab Balls`](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json), row 8: `1 lb jumbo lump crab meat`, linked to `ingredient-form-crab-jumbo-lump`. It does not support canned-crab demand or a generic canned measure. The manufacturer’s Cajun recipe is external formula evidence, not a bundled recipe request.

## Source register

The following two records are proposed additions to the target form’s research ledger. The R173 URLs and IDs below are reused existing records and do not require duplicate source entries.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S01** | Clover Leaf, [Crabmeat with 15% Leg meat](https://www.cloverleaf.ca/en/products/crabmeat-with-15-leg-meat/), English manufacturer product page. Nutrition Facts states `Per 1/4 cup (55 g)`. The French counterpart is existing R173 source S02. | Product-specific label basis. Does not define cup capacity, filling method, whether this serving is drained, or a general canned-crab measure. Its listed `Portunus` sourcing remains SKU-specific. |
| **WP04-SECTIONP-CRAB-CANNED-PORTIONS-R814-20261019-S02** | Clover Leaf, [Cajun Crab Fondue](https://www.cloverleaf.ca/en/recipes/cajun-crab-fondue/), maker formula, serves 18. It specifies 3 × 120 g Chunk Crabmeat, drained, and a recipe tip allowing 2 cans of its 15% Legmeat product, chopped before blending. | One product- and formula-specific alternative. The tip gives no mass for the alternate cans and does not establish equal drained yield or a reusable substitution. |
| **Reused WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S02** | Clover Leaf, [Chair de crabe 15% de chair de pattes](https://www.cloverleaf.ca/fr/produits/chair-de-crabe-15-de-chair-de-pattes-clover-leaf/), current French manufacturer page. Nutrition Facts states `Par 1/4 cup (55 g)`. | Existing source on the target form; supports this French product title and serving only. |
| **Reused WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S03** | Clover Leaf, [Chunk Crabmeat](https://www.cloverleaf.ca/en/products/chunk-crabmeat/), current English manufacturer page. Nutrition Facts states `Per ¼ cup (55 g)`. | Existing source on the target form; supports this named product and serving only. Its *Portunus* sourcing is not generalized. |
| **Reused WP04-CRAB-MEAT-20261011-S01** | OQLF, [chair de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488141/chair-de-crabe). | Existing terminology source for the broad bilingual base identity, not a measurement source. |

## Static checks and testing disposition

- Read-only parsing confirmed the current references, forms, ledger, and manifest are valid JSON; counts in this proposal come from the live worktree.
- The two new source IDs and URLs were checked for exact ledger ownership and archive collisions. Existing R173 sources are reused; the French Chunk URL is explicitly excluded because another record already owns it.
- The picker table reflects production phrase-first matching and includes shorter subphrases of the existing English and Québec French canned-form labels. No active search data changes are proposed.
- The full manifest scan covered 114 recipe files and 1,123 ingredient rows; it found one Jumbo Lump crab row and no canned-crab row.
- No app tests, build, emulator run, or deployment were run. If accepted implementation changes only database JSON, current `AGENTS.md` says no software testing is needed.

## Recommendation

**Integrate two named-product `portion_weight` observations** on the existing `ingredient-form-crab-canned` ledger record, append the two reviewed sources and an accepted decision, and change only its `measurementState` to `researched_supported`. Preserve the existing bilingual catalog labels, generic crab identity, empty density and unit mappings, and `researched_no_supported_substitute` state. The numbers remain source-specific published portions; they do not become a mass-volume conversion, density, runtime default, or general canned-crab measure.
