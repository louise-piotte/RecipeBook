# WP03 Section F — whole-wheat couscous identity review (R84, 2026-10-13)

## Decision

- **Recommendation:** Integrate one identity-only `GRAIN_AND_CEREAL` reference for `whole wheat couscous / couscous de blé entier`.
- **Open checklist item:** [Section F, regionally significant cereal mixes and preprocessed grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L2794). This is an additional processed-grain gap; it does not close the parent checklist.
- **Scope:** The plain, single-ingredient couscous product TIPIAK names in its Canadian English and French product pages. The pages declare whole durum-wheat semolina. Do not infer a universal recipe, preparation process, measurement, or equivalence with other couscous products.
- **Recommendation type:** New reference row; no alias on generic couscous, no form, and no blended-product row.

## Archive and ownership audit

The current worktree contains 1,412 ingredient references, 104 forms, and 1,751 research-ledger records. Before this proposal, exact-phrase searches across the checklist, all prior proposals and batch notes, live references, forms, ledger, and recipe corpus found no `whole wheat couscous`, `whole-wheat couscous`, `couscous de blé entier`, or candidate-ID owner. The archive review included the R74–R83 Section F decisions; this is a separate couscous product and does not reopen any of them.

The live owners establish the picker boundary:

| Current owner | Current label or alias | Boundary |
| --- | --- | --- |
| [`ingredient-ref-couscous`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L4276) | `couscous / couscous` | Generic product; no aliases, density, mappings, or forms. Its OQLF definition is recorded in the [couscous identity batch](../batches/pasta-couscous-shapes.md#L26) and [ledger](../research-ledger.v1.json#L37717). |
| [`ingredient-ref-pearl-couscous`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L11783) | `pearl couscous / couscous perlé` | Separate named pearl product. |
| [`ingredient-ref-barley-couscous`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L1305) | `barley couscous / couscous d'orge`; alias `belboula` | Barley product; do not borrow its alias or substitution claim. |
| [`ingredient-ref-millet-couscous-thiere`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L10202) | `millet couscous (thiéré) / couscous de mil (thiéré)`; alias `tyere` | Millet-based regional product. |
| [`ingredient-ref-baddaz-corn-couscous`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L1007) | `Baddaz (Moroccan corn couscous) / Baddaz (couscous de maïs marocain)` | Regional corn-couscous product. |
| [`ingredient-ref-keskes-khoumassi`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L8640) | Five-cereal couscous labels | Named multi-cereal product. |
| [`ingredient-ref-maftool`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L9547) | Palestinian couscous labels | Named hand-rolled product; not generic couscous. |

The couscous-specific form rows are absent from the [forms file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json). The catalog already treats `whole-wheat pasta` separately from generic `pasta` ([live row](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L17720)), consistent with preserving the explicit whole-wheat couscous qualifier as its own searchable product identity. It is a grain-composition/product distinction, not a dry-versus-cooked preparation form.

## Source evidence

| Proposed source ID | Primary source | Evidence and limits |
| --- | --- | --- |
| `WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S01` | TIPIAK, [Whole Wheat Couscous](https://tipiak.ca/en/produit/whole-wheat-couscous/) | Canadian English product page names a plain whole-wheat couscous and lists `Durum whole wheat semolina` as the ingredient. It says the product is ready in 6 minutes. The time is not a measure, conversion, or yield. |
| `WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S02` | TIPIAK, [Couscous de Blé Entier](https://tipiak.ca/produit/couscous-de-ble-entier/) | Canadian French product page supplies the exact French display wording `couscous de blé entier` and lists `semoule de blé dur entier`. This supports Canadian French product naming; it is not an OQLF ruling. It also reports six minutes, not a kitchen quantity. |
| `WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S03` | TIPIAK, [Couscous Méditerranéen](https://tipiak.ca/produit/couscous-mediterraneen/) | Its ingredient list names `couscous de blé entier` as one component alongside regular couscous, flakes, cornmeal, seasonings, and vegetables. This supports keeping the multi-ingredient Mediterranean product separate from the plain identity. |
| `WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S04` | TIPIAK, [Couscous 500 g](https://tipiak.ca/produit/couscous-500-g/) | The manufacturer’s regular couscous listing names `semoule de blé dur`, providing a product-specific comparator. Its 500 g package title is not a serving measure and does not establish a generic couscous conversion. |

For the generic product boundary, reuse existing `WP03-S164` (OQLF, couscous as a treated cereal) and do not register a duplicate source. `WP03-BARLEY-COUSCOUS-R20-20261013-S06` records Health Canada CNF code 4420 for generic dry couscous; it is not a whole-wheat-couscous measure and is cited only to mark the non-transfer boundary.

These sources establish one current, unflavoured single-ingredient product and bilingual Canadian naming. They do not establish current retail stock in Québec, Canadian manufacturing origin, that all whole-wheat couscous products share one grain size or preparation, or that a couscous dish, pearl couscous, or formulated blend is the same product.

## Exact proposed JSON delta

Add this reference row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-whole-wheat-couscous",
  "nameFr": "couscous de bl\u00e9 entier",
  "nameEn": "whole wheat couscous",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Add one matching reference record to the research ledger. This proposal uses `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`; it proposes no active form, measurement, conversion, yield, recipe link, or substitution rule.

```json
{
  "recordId": "ingredient-ref-whole-wheat-couscous",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S01",
      "url": "https://tipiak.ca/en/produit/whole-wheat-couscous/",
      "title": "TIPIAK, Whole Wheat Couscous",
      "accessedOn": "2026-10-13",
      "locator": "Product title, preparation-time statement, and Ingredients list.",
      "supports": "Names the plain product Whole Wheat Couscous and lists Durum whole wheat semolina as its ingredient. The six-minute preparation statement is not a quantity, conversion, or yield.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S02",
      "url": "https://tipiak.ca/produit/couscous-de-ble-entier/",
      "title": "TIPIAK, Couscous de Bl\u00e9 Entier",
      "accessedOn": "2026-10-13",
      "locator": "French product title, preparation-time statement, and Ingr\u00e9dients list.",
      "supports": "Uses the Canadian French product wording couscous de bl\u00e9 entier and lists semoule de bl\u00e9 dur entier. The six-minute preparation statement is not a quantity, conversion, or yield.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S03",
      "url": "https://tipiak.ca/produit/couscous-mediterraneen/",
      "title": "TIPIAK, Couscous M\u00e9diterran\u00e9en",
      "accessedOn": "2026-10-13",
      "locator": "Product description and ingredient list.",
      "supports": "Lists couscous de bl\u00e9 entier as one component of a seasoned multi-ingredient couscous product. It does not make the blend equivalent to the plain whole-wheat couscous product.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S04",
      "url": "https://tipiak.ca/produit/couscous-500-g/",
      "title": "TIPIAK, Couscous 500 g",
      "accessedOn": "2026-10-13",
      "locator": "Product title and ingredient list.",
      "supports": "The regular product page lists semoule de bl\u00e9 dur. The 500 g package title is not a serving measure or mass-volume mapping.",
      "sourceKind": "manufacturer"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "whole-wheat-couscous-no-general-substitution-r84-20261013",
      "researchState": "researched_no_supported_substitute",
      "context": "Using whole-wheat couscous in place of generic couscous, or vice versa, across recipes.",
      "basis": "The reviewed manufacturer pages establish product identity but give no tested replacement ratio, method adjustment, or general culinary equivalence. Do not transfer the separate barley-couscous manufacturer claim to this product.",
      "sourceIds": [
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S01",
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S02",
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S04"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add an identity-only whole wheat couscous / couscous de bl\u00e9 entier reference for the plain product named on TIPIAK's Canadian bilingual pages. Keep generic couscous, pearl couscous, regional couscous products, and multi-ingredient couscous blends separately owned. Add no aliases, forms, measurements, conversions, yields, recipe links, or active substitutions.",
      "sourceIds": [
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S01",
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S02",
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S03",
        "WP03-WHOLE-WHEAT-COUSCOUS-R84-20261013-S04"
      ]
    }
  ]
}
```

## Picker projection

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L117) normalizes accents and punctuation, returns complete normalized word-phrase matches first, and uses partial matches only if no complete phrase matches. The current `couscous` query resolves to seven references: generic couscous, pearl couscous, barley couscous, millet couscous (thiéré), Baddaz, Keskes Khoumassi, and maftool.

| Query | Current owner/result | After proposed row | Boundary |
| --- | --- | --- | --- |
| `whole wheat couscous` | None | `ingredient-ref-whole-wheat-couscous` | Exact qualified English display resolves to this product. |
| `couscous de blé entier` | None | `ingredient-ref-whole-wheat-couscous` | Accent-normalized exact Canadian French display resolves to this product. |
| `couscous` | Seven current couscous-family references | Same seven plus `ingredient-ref-whole-wheat-couscous` | Broad search remains multi-result; generic couscous does not redirect to a subtype. |
| `whole wheat` / `blé entier` | Existing wheat meal/flour/pasta references | Those results plus the qualified couscous product | Broad grain-qualifier searches remain multi-result; no broad alias is added. |
| `whole grain couscous` / `couscous de blé complet` | None | None | Not the attested standalone product wording; do not add aliases by translation or inference. |
| `Couscous Méditerranéen` | No active reference | No active reference from this proposal | The flavored multi-ingredient blend remains out of this single-ingredient row. |

## Recipe demand and numeric boundaries

All **114 bundled recipes / 1,123 ingredient rows** were scanned in serialized recipe text and ingredient-reference IDs for the normalized strings `whole wheat couscous`, `whole-wheat couscous`, `couscous de blé entier`, `couscous de blé`, and `ingredient-ref-whole-wheat-couscous`. The scan found zero matching recipe files, zero matching ingredient rows, and zero direct links. No bundled recipe line is changed or linked.

- **Identity:** The direct bilingual source pages support a named, plain product based on whole durum-wheat semolina. Do not claim a finer grind, common formulation across brands, or a prepared couscous dish.
- **Forms:** Add none. `Whole wheat` is the product's grain-composition qualifier, not a dry/cooked state. The source pages do not support a separate cooked form or attached preparation state.
- **Measures and conversion:** Add no measure, density, unit mapping, or conversion. The pages' six-minute statement is preparation time only. The generic CNF 4420 observation (`100 mL = 73.1 g`) belongs to generic dry couscous (`WP03-BARLEY-COUSCOUS-R20-20261013-S06`) and does not transfer to this product.
- **Yield:** Add no cooking or package yield. No preparation ratio or dry-to-prepared quantity is established by the reviewed product pages.
- **Substitution:** Record that no general replacement is supported by the sources reviewed. Add no global form conversion, contextual substitution, or recipe-line link. In particular, do not transfer DARI's product-specific couscous replacement statement from the separate barley-couscous review.

## Static review record

- Re-read the current [`AGENTS.md`](../../../AGENTS.md) and active Section F checklist before selecting the candidate. The repo rule says no testing is needed for changes limited to database JSON data; this is a proposal-only review, so no app tests or emulator were run.
- Audited current references, forms, ledger ownership, prior proposals/batches, and the complete bundled recipe corpus. The candidate reference ID and four proposed source IDs have no current ledger/catalog collisions; all four source URLs are new in the ledger. The generic OQLF and CNF sources are reused by their existing IDs rather than duplicated.
- Rechecked TIPIAK's English, Canadian French, plain couscous, and Mediterranean blend pages on 2026-10-13. Their product title, ingredient list, and scope were inspected directly.
- Static checks passed: both JSON snippets parse; the reference row matches the live catalog field shape; the ledger record validates against `research-ledger.schema.json` (Draft 2020-12); the candidate reference ID, four source IDs, and four URLs have no live ledger/catalog collision; and every local Markdown path and `#L` anchor resolves. UTF-8 decoding, no-BOM, mojibake, and trailing-whitespace checks also passed. No shared catalog, ledger, checklist, roadmap, application, generated files, or tests were edited.
