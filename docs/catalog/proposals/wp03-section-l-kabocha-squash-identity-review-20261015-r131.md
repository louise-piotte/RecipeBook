# WP03 Section L R131 — kabocha squash identity review — 2026-10-15

- **Status:** integrated as proposed. The reference, source-specific mash finding, plan item, and batch record are in place; no recipe, form, or numeric data changed.
- **Integration record:** [`R131 batch README`](../batches/wp03-section-l-kabocha-identity-integration-r131-20261015/README.md).
- **Decision:** add one identity-only fresh produce reference, `kabocha squash / courge kabocha`. Keep aliases empty. Do not add a preparation form, measurement, unit mapping, conversion, yield, recipe link, or active substitution rule.
- **Scope:** the one still-open Kabocha item under the Section L squash checklist. This does not reopen tomato work, eggplant subtypes, delicata, or the wider pepper sweep.
- **Reviewed:** active plan, Requirements.md ingredient-search requirement, AGENTS.md, current seed references/forms, ledger, legacy-candidate file, relevant prior proposals/batches, picker/search code, and all manifest-listed recipes.

## Exact open checklist reference

[`docs/RecipeBook-global-ingredient-catalog-plan.txt:4380-4384`](../../RecipeBook-global-ingredient-catalog-plan.txt):

> [ ] Tomatillo, eggplant types, cucumber, zucchini, summer squash, pumpkin, butternut, acorn,
>     kabocha, delicata, and spaghetti squash.
>     [x] Add source-backed tomatillo, general eggplant, zucchini, summer-squash class, citrouille,
>         butternut, acorn, and spaghetti-squash identities; verify cucumber terminology. Eggplant
>         subtypes, kabocha, and delicata remain open pending narrower bilingual product labels.

The parent checkbox remains open after this bounded proposal because other listed products are unresolved.

## Catalog, ledger, archive, and recipe audit

The read-only snapshot on 2026-10-15 contains **1,480 active references, 109 forms, 61 legacy candidates, 1,825 ledger records, 7,599 source entries / 6,455 distinct source IDs, and 114 recipes / 1,123 ingredient rows**.

- **Active references:** no identity or alias contains `kabocha`, `courge kabocha`, `courge japonaise`, `Japanese squash`, or `Japanese pumpkin`. There is no generic `squash / courge` or `winter squash / courge d’hiver` parent identity. Nearby identities include `ingredient-ref-summer-squash`, `ingredient-ref-acorn-squash`, `ingredient-ref-butternut-squash`, `ingredient-ref-spaghetti-squash`, `ingredient-ref-pumpkin`, `ingredient-ref-zucchini`, and `ingredient-ref-eggplant`; none owns the proposed exact Kabocha phrase.
- **Active forms:** none of the 109 form records names Kabocha or a squash cultivar. Forms are the wrong layer for an unprocessed, named fresh produce type; the reviewed sources do not establish a reusable preparation or preservation state.
- **Ledger and legacy:** no Kabocha record, evidence entry, or legacy candidate exists. The current 61-candidate file has no Kabocha row or proposed ID collision. The previous Section L coordinator proposal leaves Kabocha open and asks for current Canadian bilingual product labeling, especially before broad aliasing; the retailer pages reviewed here now support the exact display pair.
- **Prior Section L decisions:** the coordinator review and 2026-10-09 integration are the only earlier focused Kabocha treatment; both leave it open. The R128 canned-whole, R129 canned-crushed, and R130 tomato-purée proposals and integration batches address distinct tomato forms/products. They mention Kabocha only in their residual-checklist context and make no Kabocha decision.
- **Recipe demand:** scanned all 114 manifest recipe files and all 1,123 ingredient rows for `kabocha`, `kabocha squash`, `courge kabocha`, `courge japonaise`, `Japanese squash`, `Japanese pumpkin`, `buttercup squash`, and `delicata`; there were **0 matches**. The separate Metro recipe below is external source evidence, not a bundled recipe link.
- **Picker implementation:** `IngredientSearch.kt` normalizes case, accents, and punctuation; it returns complete phrase matches before substring fallback, and folds attached form terms into the ingredient’s result. The exact Kabocha queries currently return no result. With the proposed display names, `kabocha`, `kabocha squash`, and `courge kabocha` each return the new identity. No alias is needed for the single word `kabocha`, which is present in both canonical phrases. `Japanese squash`, `courge japonaise`, `Japanese pumpkin`, and `buttercup squash` remain unassigned. Broad `squash` search grows from six current results to seven; broad `courge` grows from nine to ten.

The search projection was calculated from the current seed arrays and the implementation’s phrase/substring rules. It is not a UI screenshot or runtime test.

## Naming and product-boundary evidence

The sources now close the prior product-label gap with current Canadian English and Québec French market wording. The proposed display follows the exact commercial names, while the aliases remain empty because broader translated or sometimes-conflated phrases are less precise.

| ID | Source and access | Finding and limit |
|---|---|---|
| **WP03-L-KABOCHA-20261015-R131-S01** | Office québécois de la langue française, [courge d’hiver (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver), accessed 2026-10-15; last updated 1991. | The Québec terminology entry lists “la Kabocha ou courge japonaise” among winter squashes; its English description lists “kabocha or Japanese squash.” This establishes the winter-squash relationship and terminology context, but is an older family entry rather than a standalone Kabocha headword or current market label. |
| **WP03-L-KABOCHA-20261015-R131-S02** | Wholesale Club Québec, [Courges — French-language product listing](https://www.wholesaleclub.ca/fr/alimentation/fruits-et-l-gumes/l-gumes-frais/courges-et-citrouilles/squash/c/34519), accessed 2026-10-15. | The current French-facing catalogue lists the fresh product as **Courge kabocha**. The listing was out of stock in the retrieved snapshot; availability and price are transient. Its per-kilogram price is not a density, portion, or unit mapping. |
| **WP03-L-KABOCHA-20261015-R131-S03** | Extra Foods Canada, [Squash product listing](https://www.extrafoods.ca/en/food/fruits-vegetables/fresh-vegetables/squash-pumpkin/squash/c/34519), accessed 2026-10-15. | The Canadian English catalogue lists **Kabocha Squash** as a fresh squash product. The item was out of stock in the retrieved snapshot; the title supports the product name, not present local availability or a standard count weight. |
| **WP03-L-KABOCHA-20261015-R131-S04** | Ferme Bastien, [Courge Kabocha “Sweet Mama”](https://www.fermebastien.ca/Shopping/ProductDescription/VG3), accessed 2026-10-15. | A Québec grower names a specific `Sweet Mama` product as Kabocha and says its form/texture resembles Buttercup while distinguishing the exterior shape and storage/taste. The page’s seasonal availability banner is stale relative to the access date; this supports local product naming and a cultivar-specific comparison, not present stock or a universal cultivar definition. |
| **WP03-L-KABOCHA-20261015-R131-S05** | Metro, [Two Toned Vegetable and Squash Mash](https://www.metro.ca/en/recipes-occasions/recipes/two-toned-vegetable-and-squash-mash), published 2020-09-22, accessed 2026-10-15 via the publisher’s indexed recipe content. | The ingredient line offers kabocha **or** butternut squash for the squash component of this named mash. Direct page opening returned HTTP 403, so the evidence is limited to the indexed publisher content. This is one recipe-specific option only; it is not a generic squash substitution, conversion, or linked bundled recipe. |
| **WP03-L-KABOCHA-20261015-R131-S06** | BCfresh, [Squash](https://bcfresh.ca/squash/), accessed 2026-10-15. | The Canadian grower’s page calls the section “Kabocha, aka Buttercup Squash,” while OQLF lists Buttercup and Kabocha separately and the Québec grower above describes a comparison rather than equivalence. The inconsistent market usage is a reason to keep `Buttercup squash` out of aliases; it does not erase the exact Kabocha product supported by the Québec and Canadian listings. |

### Display, aliases, forms, and numeric behavior

Add the exact current market pair **`kabocha squash / courge kabocha`**. Keep `aliasesEn` and `aliasesFr` empty: the canonical terms already make the exact product searchable, and no extra alias is needed for `kabocha` alone. OQLF mentions `Japanese squash / courge japonaise` in a broad descriptive list rather than a standalone product headword; no current product listing reviewed here uses those phrases. Keep them out pending exact product-label evidence. Do not add `Japanese pumpkin`, `Buttercup squash`, or a broad `squash / courge` alias.

The sources describe a fresh squash, but cooking instructions or recipe methods do not justify catalog forms. Retail per-kilogram prices and approximate piece weights are retailer-specific product facts; they do not support `defaultDensity`, `unitMappings`, or a transferable count/volume conversion. Add no measurements, yields, or numeric observations.

The one Metro recipe line explicitly presents Kabocha and butternut as alternatives for its own vegetable mash. Record that as a narrowly scoped evidence finding only. Do not add an active contextual substitution rule or general interchangeability claim; the external recipe is not in the bundled library and the source page could not be opened directly during this review.

## Decision and proposed exact delta

**Integrated:** one fresh produce identity with the current Canadian/Québec display names. No legacy candidate was merged or removed. No forms, recipe rows, measurement values, mappings, yields, conversions, or active substitution rules were added. The following reference and ledger record were applied.

```json
{
  "ingredientReference": {
    "id": "ingredient-ref-kabocha-squash",
    "nameFr": "courge kabocha",
    "nameEn": "kabocha squash",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "VEGETABLE_AND_AROMATIC"
  },
  "ledgerRecord": {
    "recordId": "ingredient-ref-kabocha-squash",
    "recordType": "ingredient_reference",
    "identityState": "verified",
    "measurementState": "researched_no_supported_value",
    "substitutionResearchState": "researched_supported",
    "sources": [
      {
        "sourceId": "WP03-L-KABOCHA-20261015-R131-S01",
        "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver",
        "title": "Office québécois de la langue française, courge d’hiver (GDT)",
        "versionOrDate": "Last updated 1991; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Winter-squash list and English definition/notes.",
        "supports": "Lists Kabocha / courge japonaise within winter squash and kabocha / Japanese squash in the English description; this is not a standalone current product-label entry.",
        "sourceKind": "regional_authority"
      },
      {
        "sourceId": "WP03-L-KABOCHA-20261015-R131-S02",
        "url": "https://www.wholesaleclub.ca/fr/alimentation/fruits-et-l-gumes/l-gumes-frais/courges-et-citrouilles/squash/c/34519",
        "title": "Wholesale Club Québec, Courges product listing",
        "accessedOn": "2026-10-15",
        "locator": "Fresh-squash list, Courge kabocha item.",
        "supports": "Current French-facing Canadian retailer label for the fresh item. The item was out of stock in the retrieved view; its per-kilogram price is not reusable ingredient measurement evidence.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-KABOCHA-20261015-R131-S03",
        "url": "https://www.extrafoods.ca/en/food/fruits-vegetables/fresh-vegetables/squash-pumpkin/squash/c/34519",
        "title": "Extra Foods Canada, Squash product listing",
        "accessedOn": "2026-10-15",
        "locator": "Fresh-squash list, Kabocha Squash item.",
        "supports": "Current Canadian English retailer label for the fresh item. The item was out of stock in the retrieved view; the title is not a standard count weight or density.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-KABOCHA-20261015-R131-S04",
        "url": "https://www.fermebastien.ca/Shopping/ProductDescription/VG3",
        "title": "Ferme Bastien, Courge Kabocha Sweet Mama",
        "accessedOn": "2026-10-15",
        "locator": "Product title and description.",
        "supports": "Québec grower product naming for a Sweet Mama kabocha and a comparison with Buttercup; seasonal status text is stale and no universal cultivar or substitution claim is inferred.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-KABOCHA-20261015-R131-S05",
        "url": "https://www.metro.ca/en/recipes-occasions/recipes/two-toned-vegetable-and-squash-mash",
        "title": "Metro, Two Toned Vegetable and Squash Mash",
        "versionOrDate": "Published 2020-09-22; direct fetch returned HTTP 403 on 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Publisher-indexed ingredient line: kabocha or butternut squash.",
        "supports": "One named mash recipe explicitly offers kabocha or butternut in the same ingredient role; this does not support a general substitution or amount conversion.",
        "sourceKind": "culinary_reference"
      },
      {
        "sourceId": "WP03-L-KABOCHA-20261015-R131-S06",
        "url": "https://bcfresh.ca/squash/",
        "title": "BCfresh, Squash",
        "accessedOn": "2026-10-15",
        "locator": "Kabocha section heading and description.",
        "supports": "Shows one Canadian grower using Kabocha as an aka for Buttercup; this conflicts with other source distinctions and is not adopted as a picker alias.",
        "sourceKind": "other"
      }
    ],
    "decisions": [
      {
        "outcome": "accepted",
        "reason": "Add identity-only kabocha squash / courge kabocha using current Canadian English and Québec French retail wording, supported by the Québec terminology and grower sources. Keep aliases empty and leave all forms and numeric behavior unset.",
        "sourceIds": [
          "WP03-L-KABOCHA-20261015-R131-S01",
          "WP03-L-KABOCHA-20261015-R131-S02",
          "WP03-L-KABOCHA-20261015-R131-S03",
          "WP03-L-KABOCHA-20261015-R131-S04",
          "WP03-L-KABOCHA-20261015-R131-S06"
        ]
      },
      {
        "outcome": "accepted",
        "reason": "Record the Metro kabocha-or-butternut option as source-specific evidence for this one vegetable mash only. Do not create an active substitution rule or a general equivalence; the external source recipe is not linked to a bundled recipe row.",
        "sourceIds": [
          "WP03-L-KABOCHA-20261015-R131-S05"
        ]
      }
    ],
    "substitutionFindings": [
      {
        "findingId": "wp03-kabocha-metro-two-toned-mash-20261015",
        "researchState": "researched_supported",
        "fromIngredientRefId": "ingredient-ref-kabocha-squash",
        "replacements": [
          {
            "ingredientRefId": "ingredient-ref-butternut-squash",
            "roleInCompound": "optional squash component in Metro’s named vegetable-and-squash mash"
          }
        ],
        "context": "Only Metro’s Two Toned Vegetable and Squash Mash, where the publisher’s ingredient line explicitly offers kabocha or butternut squash for the same recipe role.",
        "basis": "The source-specific recipe line lists kabocha or butternut as alternatives. It does not establish interchangeability in other recipes or a change to quantity, moisture, flavour, or cooking time.",
        "limitations": [
          "Apply only to the named mash formula; do not generalize to roasting, soups, baking, or other squash recipes.",
          "The publisher page returned HTTP 403 on direct open; the ingredient wording was available in the publisher-indexed result.",
          "This recipe is not in the 114-recipe bundled library, so no recipe link or active runtime rule is proposed."
        ],
        "sourceIds": [
          "WP03-L-KABOCHA-20261015-R131-S05"
        ]
      }
    ]
  }
}
```

## Source-ID and artifact uniqueness

The six proposal-local IDs `WP03-L-KABOCHA-20261015-R131-S01` through `S06` were checked against current ledger source IDs and the proposal/batch archive before integration; none was previously assigned. The reference and finding IDs were also absent from active references, forms, ledger records, and legacy candidates. The reference and finding are now recorded in the live data.

## Remaining open question

Should the later picker review add `courge japonaise` / `Japanese squash` as explicit aliases, or keep those OQLF-listed descriptive terms unassigned? This proposal recommends keeping them unassigned until a current Canadian product label confirms that broader wording for the same product. The `Buttercup` overlap is also unresolved as a market-name boundary; it is deliberately not encoded as an alias here.
