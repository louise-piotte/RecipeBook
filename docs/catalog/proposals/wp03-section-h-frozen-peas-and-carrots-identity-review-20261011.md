# WP03 Section H — frozen peas-and-carrots product identity review

- **Reviewed:** 2026-10-11
- **Packet type:** proposal only; no catalog, recipe, ledger, plan, roadmap, code, or test file was changed.
- **Scope:** one exact mixed frozen-vegetable row, recipe 078#14, and its product identity boundary.
- **Recommendation:** add one `VEGETABLE_AND_AROMATIC` reference for **frozen peas and carrots / petits pois et carottes surgelés**, then link only recipe 078#14. Do not link the row to peas alone, create a pea form for this mixture, add component proportions, or derive a cup conversion.

## Why this is the next bounded item

The exact product was surfaced and held by the earlier [WP03 Section H coordinator review](wp03-lentils-peas-soybeans-coordinator-review-20261009.md#bundled-recipe-demand) (2026-10-09, recipe-demand row for 078#14). That review correctly classified it as a mixed frozen vegetable product, not a standalone peas line, and left it unlinked while focusing on pulse identities. The current package still has no reference for the mixture. This packet resolves that specific product-identity gap without reopening the already reviewed pea identities or making the 1-cup quantity a peas-only measure.

The global plan’s broad **“Complete plant-food checklist and resolve overlap with baking owner”** remains open at [docs/RecipeBook-global-ingredient-catalog-plan.txt:458](../../RecipeBook-global-ingredient-catalog-plan.txt#L458). There is no dedicated checkbox for frozen peas-and-carrots mixes. Section H’s open whole/split/hulled and dry/soaked/cooked/canned/puréed/refried/fermented items remain at lines 2133–2137; this frozen composite does not close those items. The prior Section H review’s exact 078#14 audit is the specific reconciliation point for this proposal.

The nearby Section M fruit-product line remains open at plan lines 2431–2432. Its completed sub-items now include dried-orange zest, citrus zest, crushed pineapple, and mashed ripe banana; date/cherry pitting forms were reviewed separately. This packet does not repeat those fruit-product or pitting proposals and does not claim that Section M is complete.

## Live catalog, ledger, legacy, and name audit

Read-only snapshot taken 2026-10-11. SHA-256 values cover exact file bytes. The recipe-corpus digest was computed in manifest order by hashing each relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Artifact | Current state | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,027 active references | `b63ae0206120f62b9879dfed2eee0bf0af43c2057981f1154c5fd1475dc67e0b` |
| `ingredient-forms.v1.json` | 71 forms | `1db31d8f54262555a18e15173f2a69b0d164cad5d53bf14fad86dac390c7989a` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 1,316 records; 4,266 source entries; 3,502 distinct source IDs | `2227ba0b0f4bdeb5c86eb08488ec998cdb1cab3f0c460cfcc7bfd87bff0db939` |
| `legacy-import-identities.v1.json` | 75 candidates | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows | `d44012b2c6714aa5dcbe57cd7a6ec2f2aa41f0a4ecef3193f3b9d3ce93bb3f80` |

The active nearby references are:

| ID | Current identity and relevant state |
|---|---|
| `ingredient-ref-peas` | `green peas / petits pois`; EN aliases `frozen peas`, `peas`; no forms, density, or unit mappings. Its ledger identity is verified, measurement is `blocked_pending_evidence`, and substitution research is `not_yet_researched`. |
| `ingredient-ref-carrot` | `carrot / carotte`; no aliases or forms. Its ledger identity and measurements have separate source-backed decisions; this packet changes nothing on that record. |
| `ingredient-ref-yellow-peas` | `dried yellow peas / pois jaunes séchés`; distinct dry product, not the frozen vegetable mix. |
| `ingredient-ref-dried-whole-peas` | `dried whole peas / pois secs entiers`; distinct color-unspecified dry product, not the frozen mix. |

No current form belongs to peas or carrots. No active reference, form, ledger record, legacy candidate, or recipe link owns candidate ID `ingredient-ref-frozen-peas-and-carrots`. No current active or legacy name owns the complete candidate phrases `frozen peas and carrots`, `frozen mixed peas and carrots`, `petits pois et carottes surgelés`, or `pois et carottes congelés`. The proposed source IDs listed below were also absent from all live ledger sources at audit time. The reversed wording `carrots and peas / carottes et pois congelés` is deliberately excluded: CFIA defines that order as a product with the larger weight share of carrots, so it is not an alias for this pea-first product.

The app search index checks whether a complete query phrase occurs within a reference or attached form term. If accepted, broad component queries `frozen peas` and `petits pois` will therefore return both the existing standalone pea reference and the mixture reference. This is an expected component/product overlap, not an identity equivalence: `frozen peas and carrots` and `peas and carrots` resolve to the proposed mixture, while the full product label disambiguates it in the picker. Keep the existing standalone `frozen peas` alias; do not move it to the composite or add a bare `peas`/`pois` alias to the new row.

## Exact recipe-row audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned. The search covered exact and normalized variants of `peas and carrots`, `frozen mixed peas and carrots`, `carrots and peas`, `pois et carottes`, `petits pois et carottes`, and nearby standalone pea/carrot ingredient names, together with each row’s original text, ingredient name, reference/form links, preparation, and notes.

| Row | Exact stored data | Current link | Disposition |
|---|---|---|---|
| `078#14` — `recipes/078-pate-chinois-shepherd-s-pie-d356eec5-b3c4-4e22-b943-63900317e569.v1.json`, row ID `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-14` | `1 cup frozen peas and carrots`; ingredient name `peas and carrots`; quantity `1`; unit `cup`; preparation `{ "fr": "congelé", "en": "frozen" }` | No `ingredientRefId` or form link | **Proposed:** add only `ingredientRefId: ingredient-ref-frozen-peas-and-carrots`. Preserve the text, name, quantity, cup unit, and frozen preparation. |
| `105#1` | `2 cups dried yellow peas` | `ingredient-ref-yellow-peas` | Separate dry pea product; no change and no inference about the mixed product. |
| `016#4`, `053#12`, `090#14`, `105#6` | Grated, grated, sliced, and diced carrot rows | `ingredient-ref-carrot` | Standalone carrot uses, not peas-and-carrots mix demand; no change. |

No other ingredient row names the pea-and-carrot mixture. Recipe 078’s source URL is the linked publisher page reviewed below; the stored line is a direct match for its product wording. The 2026-10-09 coordinator packet’s “do not relink to peas alone” conclusion remains correct; this proposal adds the missing composite identity.

## Recommendation and boundaries

Use a distinct reference because the requested ingredient is the named two-vegetable product, not a state of peas alone. `ingredient-ref-peas` cannot represent the carrots; `ingredient-ref-carrot` cannot represent the peas. The source-backed reference name includes `frozen`, since the exact row and the current Canadian product listing both name the frozen product. No fresh peas-and-carrots recipe demand was found, so this packet does not create a generic fresh-mix identity or a second form.

Keep `VEGETABLE_AND_AROMATIC`, `defaultDensity: null`, and `unitMappings: []`. CFIA’s standard defines allowed component weight ranges for this named frozen product, but it does not establish this recipe’s exact mixture ratio, its cup mass, or a conversion. The linked publisher’s fallback of 1/2 cup peas plus 1/2 cup sliced carrots is a source-specific recipe workaround; do not turn it into a global substitution rule, component-yield rule, or measurement mapping.

## Proposed reference and recipe data

Add the following single reference object to the active catalog:

```json
{
  "id": "ingredient-ref-frozen-peas-and-carrots",
  "nameEn": "frozen peas and carrots",
  "nameFr": "petits pois et carottes surgel\u00e9s",
  "aliasesEn": ["frozen mixed peas and carrots"],
  "aliasesFr": ["pois et carottes congel\u00e9s"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

For recipe `078#14`, the exact row after the proposed one-field link is:

```json
{
  "id": "d356eec5-b3c4-4e22-b943-63900317e569-ingredient-14",
  "originalText": "1 cup frozen peas and carrots",
  "ingredientName": "peas and carrots",
  "ingredientRefId": "ingredient-ref-frozen-peas-and-carrots",
  "quantity": 1,
  "unit": "cup",
  "preparation": {
    "fr": "congel\u00e9",
    "en": "frozen"
  }
}
```

Do not add an ingredient form, density, unit mapping, package yield, contextual/global substitution, mixture percentage, or component quantity.

## Proposed ledger record

Add this identity-only record for the new reference. Measurement and substitution research stay open; no measurement observations are proposed.

```json
{
  "recordId": "ingredient-ref-frozen-peas-and-carrots",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-H-FROZEN-PEAS-CARROTS-20261011-S01",
      "url": "https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4",
      "title": "Normes d'identit\u00e9 canadiennes : Volume 4 \u2013 Produits de fruits ou de l\u00e9gumes transform\u00e9s",
      "accessedOn": "2026-10-11",
      "versionOrDate": "2024-12-18",
      "locator": "Article 53(1)-(2), frozen peas and carrots; reversed carrots-and-peas class.",
      "supports": "Defines pois et carottes congel\u00e9s as 52-75% peas and 25-48% carrots by weight, and separately defines carottes et pois congel\u00e9s with the larger share reversed. Supports a distinct pea-first frozen mixture identity and French regulatory product term; does not give this recipe's exact ratio, cup mass, or conversion.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-H-FROZEN-PEAS-CARROTS-20261011-S02",
      "url": "https://www.thewholesomedish.com/the-best-classic-shepherds-pie/",
      "title": "The Wholesome Dish, The Best Classic Shepherd's Pie",
      "accessedOn": "2026-10-11",
      "locator": "Ingredient card and method; note on unavailable frozen mixed peas and carrots.",
      "supports": "The linked recipe page lists 1 cup frozen mixed peas & carrots, its method names frozen peas and carrots, and its note suggests 1/2 cup frozen peas plus 1/2 cup frozen sliced carrots if the mix is unavailable. Supports the exact product wording and one source-specific workaround only; it does not establish a general substitution or cup-to-mass conversion.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-H-FROZEN-PEAS-CARROTS-20261011-S03",
      "url": "https://www.iliosfoods.ca/products",
      "title": "ILIOS Foods, Products (English product catalog)",
      "accessedOn": "2026-10-11",
      "locator": "Frozen vegetables, item FZ003016.",
      "supports": "Lists Frozen Peas and Carrots as item FZ003016, pack 12x750G, imported from Greece. Supports current Canadian-market English product wording and SKU identity; it does not establish the recipe's brand, component ratio, or cup mass.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-H-FROZEN-PEAS-CARROTS-20261011-S04",
      "url": "https://fr.iliosfoods.ca/products",
      "title": "ILIOS Foods, Produits (catalogue de produits en fran\u00e7ais)",
      "accessedOn": "2026-10-11",
      "locator": "L\u00e9gumes surgel\u00e9s, item FZ003016.",
      "supports": "Lists Petits pois et carottes surgel\u00e9s under the same FZ003016 item and 12x750G pack as the English catalog. Supports the current French-language product wording and bilingual Canadian-market SKU pairing; it does not establish the recipe's brand, component ratio, or cup mass.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept a separate frozen peas-and-carrots mixture identity for the exact unlinked 078#14 row. The current Canadian standard, linked recipe source, and bilingual Canadian-market SKU identify the mixed product; do not map it to peas alone. Keep the recipe quantity and frozen preparation unchanged and add no ratio, measurement, yield, form, or substitution data.",
      "sourceIds": [
        "WP03-H-FROZEN-PEAS-CARROTS-20261011-S01",
        "WP03-H-FROZEN-PEAS-CARROTS-20261011-S02",
        "WP03-H-FROZEN-PEAS-CARROTS-20261011-S03",
        "WP03-H-FROZEN-PEAS-CARROTS-20261011-S04"
      ]
    }
  ]
}
```

## Source support and limits

- [CFIA, Normes d'identité canadiennes, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), article 53 (page last modified 2024-12-18): lines 302–304 define the pea-first and carrot-first frozen mixes separately and give their permitted weight ranges. These ranges establish a product boundary, not the recipe's mix ratio or a measuring conversion.
- [The Wholesome Dish, The Best Classic Shepherd's Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/), ingredient card and method: lists 1 cup frozen mixed peas and carrots and later names frozen peas and carrots. Its note offers 1/2 cup peas plus 1/2 cup sliced carrots only as a fallback for this recipe. It is the linked recipe publisher, not evidence that the bundled recipe's exact retail SKU is ILIOS.
- [ILIOS Foods English product catalog](https://www.iliosfoods.ca/products) and [French product catalog](https://fr.iliosfoods.ca/products), item FZ003016: the same 12x750G item is listed as “Frozen Peas and Carrots” and “Petits pois et carottes surgelés,” imported from Greece. This is bilingual Canadian-market product evidence, not evidence of Canadian manufacture, recipe-specific brand, a measurement basis, or a universal product formula outside the CFIA standard.

## Limits and handoff

This proposal advances one exact mixed frozen-product identity and one existing recipe link. It leaves the broader plant-food checklist open, does not complete Section H, and does not resolve frozen standalone-pea forms, pea/carrot densities, component ratios for this package, cup weights, or substitutions. No tests were run; this is a proposal-only review, and no shared database or checklist file was edited.
