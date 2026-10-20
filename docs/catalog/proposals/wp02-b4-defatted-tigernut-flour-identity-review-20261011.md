# WP02 B4 — Defatted tigernut flour identity review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, code, or test files changed.
- **Scope:** The single unresolved defatted-tigernut-flour candidate, separated from active whole-tuber tigernut flour. Other tigernut products and grades are out of scope.
- **Proposal-local source IDs:** `WP02-B4-DEFATTED-TIGERNUT-20261011-S01` through `S05`; not ledger entries.

## Recommendation

Accept one identity-only `FLOUR_AND_STARCH` reference for defatted tigernut flour. The oil-removal step is a material product distinction: the existing `tigernut flour / farine de souchet` row represents directly milled whole tubers, while sources describe defatted flour as oil-extracted flour and separately named it for research and food production. Keep the French display `farine de souchet dégraissée` **provisional for fr-CA**: it is supported by a current bilingual manufacturer's French product page and by French patent terminology, but no Québec or Canadian listing for the defatted product was located.

Do not change the existing whole-tuber row or add aliases, forms, densities, unit mappings, measurements, conversions, yields, recipe links, or substitution rules. In particular, do not add `defatted tigernut flour` as an alias to the existing generic row.

### Proposed ingredient-reference record

```json
{
  "id": "ingredient-ref-defatted-tigernut-flour",
  "nameFr": "farine de souchet dégraissée",
  "nameEn": "defatted tigernut flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The French phrase corrects adjective agreement and follows the French manufacturer's product description. Its Québec-market status remains provisional; the recommendation does not claim that a Québec supplier currently sells this processed grade.

### Proposed research-ledger record

```json
{
  "recordId": "ingredient-ref-defatted-tigernut-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-B4-DEFATTED-TIGERNUT-20261011-S01",
      "url": "https://www.tigernuts.com/products/defatted-tigernuts-flour/",
      "title": "Tigernuts Traders, Defatted tigernuts flour",
      "accessedOn": "2026-10-11",
      "locator": "Product and processing description",
      "supports": "Names defatted tigernut flour and describes oil extraction followed by pasteurization and micronization. Manufacturer-specific product evidence; its claim of being unique in the market is not treated as a market survey or universal process definition.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B4-DEFATTED-TIGERNUT-20261011-S02",
      "url": "https://www.tigernuts.com/fr/produits/farine-de-souchet-degraisse/",
      "title": "Tigernuts Traders, Farine de souchet dégraissée",
      "accessedOn": "2026-10-11",
      "locator": "Product heading and description",
      "supports": "The French page lists the defatted product separately and describes oil extraction, pasteurization, and micronization. The body uses the correctly agreeing phrase farine de souchet dégraissée; the page heading itself omits the final agreement accent. This is French manufacturer wording, not a Québec or Canadian product label.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B4-DEFATTED-TIGERNUT-20261011-S03",
      "url": "https://patentimages.storage.googleapis.com/bc/3c/bd/ce48da8e8951f3/EP3741221A1.pdf",
      "title": "European Patent Office, EP 3741221 A1, Produit alimentaire extrudé, expansé, soufflé et/ou grillé comportant de la farine de souchet",
      "accessedOn": "2026-10-11",
      "locator": "Description paragraphs 23–25, PDF pp. 3–4",
      "supports": "Describes flour from edible Cyperus esculentus tubers and distinguishes non-de-oiled (non-dégraissée / non-déshuilée) from de-oiled flour, including possible mixtures. Patent disclosure supports a recognized product distinction, not a food standard or market-wide composition rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B4-DEFATTED-TIGERNUT-20261011-S04",
      "url": "https://doi.org/10.1111/ijfs.16901",
      "title": "Wu et al., Defatted tigernut flour as a novel substitute for wheat flour: impact on physicochemical and rheological properties during frozen dough storage, International Journal of Food Science & Technology 59 (2024), 1524–1535",
      "accessedOn": "2026-10-11",
      "locator": "Abstract and study summary",
      "supports": "Treats defatted tigernut flour (DTF) as a distinct ingredient in specified frozen wheat-dough experiments. Study-specific blending results are not imported as recipe substitutions, conversions, or performance claims for the catalog.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B4-DEFATTED-TIGERNUT-20261011-S05",
      "url": "https://lamoisson.com/collections/farines-preparations-flour-meal-flour-mixtures/products/farine-de-noix-tigrees",
      "title": "La Moisson, Farine de noix tigrées",
      "accessedOn": "2026-10-11",
      "locator": "Current Québec retailer product description and ingredient declaration",
      "supports": "Québec retail evidence for the base product wording farine de souchet and a product whose sole ingredient is raw edible tiger nuts/tubers; it does not attest or name a defatted flour.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept an identity-only defatted tigernut flour row distinct from the existing directly milled whole-tuber flour. English identity and oil-removal boundary are supported by the manufacturer, patent disclosure, and food-science study. Use farine de souchet dégraissée as a provisional fr-CA display because the exact phrase is attested by the manufacturer's French page but no Québec or Canadian defatted-product label was found. Add no aliases, forms, numeric data, recipe links, conversions, yields, or substitutions. The current bundled corpus has no candidate-product lines.",
      "sourceIds": [
        "WP02-B4-DEFATTED-TIGERNUT-20261011-S01",
        "WP02-B4-DEFATTED-TIGERNUT-20261011-S02",
        "WP02-B4-DEFATTED-TIGERNUT-20261011-S03",
        "WP02-B4-DEFATTED-TIGERNUT-20261011-S04",
        "WP02-B4-DEFATTED-TIGERNUT-20261011-S05"
      ]
    }
  ]
}
```

## Checklist location and prior-work reconciliation

The precise open scope is Section 04, **B4 — Green-banana, plantain, breadfruit, tigernut, yam, taro, and other established regional root/fruit flours**, in `docs/RecipeBook-global-ingredient-catalog-plan.txt` lines 1283–1304. The accepted line at 1295–1299 adds whole-tigernut flour while explicitly keeping defatted tigernut flour separate. The following completed Québec-display review at 1300–1304 covers only the six existing flour displays, not the defatted product. The B4 checklist remains open.

Reconciliation with earlier work:

- `docs/catalog/proposals/wp02-regional-root-flour-boundaries-20261010.md` accepts `ingredient-ref-tigernut-flour` for ground whole tubers and says defatted flour is a separate product for review. It does not propose a second reference.
- `docs/catalog/proposals/wp02-tigernut-flour-boundary-review-20261010.md` explicitly keeps defatted flour separate and says it can be reviewed as a candidate later. Its cited manufacturer page establishes the oil-extraction/product distinction but that packet keeps the decision outside its whole-tuber scope.
- `docs/catalog/proposals/wp02-regional-root-flours-quebec-display-review-20261011.md` retains the current base display `farine de souchet` and repeats the whole-tuber/defatted boundary. Its Québec source is for the base flour only.
- No later WP02 proposal or batch integrates a defatted-tigernut-flour identity or decides its reference/ledger record. This packet resolves only that named follow-up; it does not reopen prior whole-flour or terminology decisions.

## Current catalog, ledger, forms, and name audit

Read-only snapshot on 2026-10-11: 1,024 active ingredient references, 70 forms, 75 legacy candidates, and 1,310 research-ledger records.

| Surface | Current state | Decision consequence |
|---|---|---|
| Active reference `ingredient-ref-tigernut-flour` | `tigernut flour / farine de souchet`; both alias arrays empty; `defaultDensity` null; `unitMappings` empty; category `FLOUR_AND_STARCH`. | Retain as the unqualified, whole-tuber flour row. Add no defatted alias to it. |
| Proposed exact names and ID | No active ref, form, legacy candidate, or ledger record ID owns `defatted tigernut flour`, `farine de souchet dégraissée`, or `ingredient-ref-defatted-tigernut-flour`. | The proposed ID is available in the audited surfaces; broad `tigernut flour` and `farine de souchet` remain owned by the existing whole-tuber row. |
| Forms | No form label or match term names a defatted tigernut product; no form ID collision for the proposed reference ID. | Model this product as an ingredient identity, not a form/preparation state. |
| Legacy candidates | No tigernut or defatted-tigernut candidate row. | No legacy merge or alias assignment is proposed. |
| Ledger | `ingredient-ref-tigernut-flour` is `verified`; its accepted decisions explicitly preserve defatted flour as separate. Existing source text cites the same manufacturer's page and notes the boundary. No separate defatted record or proposed source-ID collision was found. | Create a new record only if the proposed reference is accepted. The new proposal adds stronger independent product-class evidence and an explicit decision rather than duplicating the existing base record. |

The audit distinguishes exact ownership from embedded search overlap. If this row is added, broad searches for `tigernut flour` or `farine de souchet` may surface both whole and defatted results; that is useful qualified-product selection, not a duplicate. No alias is proposed for `tiger nut flour`, `tigernuts flour`, `chufa flour`, `farine de noix tigrées`, `farine de souchet déshuilée`, `defatted tiger nut flour`, or press-residue/by-product wording. These strings either lack exact Québec product evidence or may name different product states.

## Bundled recipe demand

The read-only audit parsed all **114** manifest-listed recipe files and their **1,123** ingredient rows. Using the app's ingredient-key normalization (case-folding, NFKD accent folding, punctuation-to-space normalization), it searched ingredient fields and serialized recipe text for `defatted tigernut flour`, `defatted tiger nut flour`, `defatted tiger-nut flour`, `defatted tigernuts flour`, `de-oiled tigernut flour`, `farine de souchet dégraissée`, `farine de souchet déshuilée`, `farine de noix de souchet dégraissée`, `farine dégraissée de souchet`, `farine de noix tigrées dégraissée`, and the unqualified `tigernut flour`, `tiger nut flour`, and `farine de souchet` names.

**Exact recipe-row result: 0 of 1,123 ingredient rows. Full recipe-text result: 0 of 114 recipes.** No recipe link, measurement, form, conversion, yield, or substitution is justified by the bundled corpus.

## Evidence and limits

| ID | Source and supported claim | Limit |
|---|---|---|
| **S01** | Tigernuts Traders, [Defatted tigernuts flour](https://www.tigernuts.com/products/defatted-tigernuts-flour/). The current English product page describes oil extraction followed by pasteurization and micronization and calls the material defatted tigernut flour. | Manufacturer product evidence. Its claim that the product is unique in the market is not independently established and is not relied upon. The listed processing sequence is not generalized to all defatted tigernut flours. |
| **S02** | Tigernuts Traders, [Farine de souchet dégraissée](https://www.tigernuts.com/fr/produits/farine-de-souchet-degraisse/). Current French counterpart names the product and repeats the oil-extraction process. The explanatory body uses `farine de souchet dégraissée`; the page heading spells `dégraissé`. | French manufacturer wording outside Québec. It supports a provisional French display, not Québec preference or Canadian retail availability. |
| **S03** | European Patent Office, [EP 3741221 A1](https://patentimages.storage.googleapis.com/bc/3c/bd/ce48da8e8951f3/EP3741221A1.pdf), paragraphs 23–25. Describes flour from edible *Cyperus esculentus* tubers, calls out non-de-oiled/non-defatted and de-oiled flour as distinct types, and allows mixtures. | Patent disclosure, not a Canadian or EU food standard and not proof of market prevalence. Its cited composition ranges and product formulations are not imported. |
| **S04** | Wu et al. (2024), [Defatted tigernut flour as a novel substitute for wheat flour](https://doi.org/10.1111/ijfs.16901), *International Journal of Food Science & Technology* 59:1524–1535. The primary study treats DTF as a defined flour ingredient and tests it in frozen wheat dough. | The study concerns specific composite formulas and storage conditions. No recipe-scale substitution or conversion is inferred. |
| **S05** | La Moisson, [Farine de noix tigrées](https://lamoisson.com/collections/farines-preparations-flour-meal-flour-mixtures/products/farine-de-noix-tigrees). Current Québec retail page calls its whole-tuber product `farine de souchet` in the body and identifies raw tiger nuts/tubers as the sole ingredient. | Establishes local base terminology and the whole-tuber contrast only; it does not attest a defatted product or its exact French name. |

No source supplies a generic density, household measure, unit conversion, yield, or universal culinary replacement for the defatted product. The primary research source's wheat-dough blend observations are not transferable to ordinary recipe substitution.

## Integration boundary

If accepted, add only the reference and ledger objects above. Keep the active whole-tuber identity and its French display unchanged. Leave the B4 aggregate checklist open for the other root/fruit flour work; this packet closes only the outstanding defatted-tigernut candidate. No tests were run or requested for this proposal-only review.
