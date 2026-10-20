# WP02 Section 04 B3 R121 — modified wheat starch identity

- **Reviewed:** 2026-10-14.
- **Status:** Integrated on 2026-10-15; see [the batch README](../batches/wp02-b3-modified-and-resistant-wheat-starch-identity-integration-20261015/README.md).
- **Scope:** Plant-qualified modified wheat starch, distinct from ordinary wheat starch and other
  plant-qualified modified starches.

## Recommendation

Add one `FLOUR_AND_STARCH` identity as `modified wheat starch / amidon de blé modifié`, with no
aliases, forms, density, unit mappings, recipe links, conversions, yields, or substitutions. The
live catalog already has ordinary `wheat starch / amidon de blé` (`ingredient-ref-wheat-starch`),
but it has no modified-wheat-starch row. Current Canadian common-name rules require the plant
source for starch and modified starch. A current bilingual Canadian product page lists both
modified and ordinary wheat starch separately, and its French version uses the exact proposed
French display. A Québec-market tempura-mix page also lists modified wheat starch as an ingredient.
[S01–S08]

Use `ingredient-ref-modified-wheat-starch` if accepted. Keep broad `modified starch / amidon
modifié` unassigned; keep `resistant wheat starch / amidon résistant de blé` separate until its
product scope is reviewed. Health Canada's current fibre list describes one resistant wheat starch
made by chemical phosphorylation, but does not establish that all modified wheat starch is that
same product. [S04]

## Proposed reference delta

```json
{
  "id": "ingredient-ref-modified-wheat-starch",
  "nameEn": "modified wheat starch",
  "nameFr": "amidon de blé modifié",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not alias `wheat starch`, `modified starch`, `modified food starch`, `amidon modifié`, or
`amidon modifié de blé`. The first is the distinct native-starch identity. The generic terms omit
the plant source. Health Canada uses `amidon modifié de blé` in the context of one particular
resistant, chemically phosphorylated starch; extending it to the broader modified-wheat-starch
class would overstate that source's scope. Do not infer an E-number, chemical treatment, gluten-free
status, or functional equivalence from the proposed name. [S01–S05]

If accepted, add an `ingredient_reference` ledger record with `identityState: verified` and leave
measurement and substitution research `not_yet_researched`. This identity review does not establish
a household measure, density, conversion, or reusable substitute.

## Current identity and picker audit

The live reference JSON has 1,465 rows and 105 forms. The current wheat-starch row displays
`wheat starch / amidon de blé`, with `amidon de froment` as its French alias. No active reference,
form, legacy-import candidate, or ledger record owns the exact proposed identity. No exact modified-
wheat-starch mention was found in the active ledger. The proposed English and French phrases do not
collide with another current identity.

The picker normalizes case, accents, punctuation, and spacing, prefers complete word-phrase matches,
then falls back to substring matching. The projections below mirror that order over the current
reference names and aliases:

| Query | Current results | With proposed row |
|---|---|---|
| `modified wheat starch` | None | Modified wheat starch |
| `amidon de blé modifié` | None | Modified wheat starch |
| `wheat starch` | Wheat starch | Wheat starch; modified wheat starch |
| `amidon de blé` | Wheat starch | Wheat starch; modified wheat starch |
| `amidon de froment` | Wheat starch | Wheat starch |
| `modified starch` / `amidon modifié` | None | None |

The broad wheat-starch queries return both source-qualified identities after the addition, while
the modified phrase resolves alone. The existing `amidon de froment` alias stays on ordinary wheat
starch.

## Recipe demand and unresolved data

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. None contains
`modified wheat starch`, `amidon de blé modifié`, `amidon modifié de blé`, `wheat starch`, or
`amidon de blé`; the bundled recipes do not establish demand or a recipe link.

The reviewed material is identity and labelling evidence, not a standalone starch package or a
household conversion source. Keep density null and unit mappings empty. No source reviewed here
supports a general substitution or recipe ratio.

## Source register

All sources were checked on 2026-10-14.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S01** | CFIA, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components) | Current incorporated-by-reference Table 1, items 20–21; last modified 2026-02-11. Requires a plant-qualified common name for starch and modified starch. It gives a naming rule, not a standalone retail product or specific modification process. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S02** | CFIA, [Noms usuels d'ingrédients et de constituants](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants) | Current French Table 1, items 20–21; last modified 2026-02-11. The modified-starch construction is `amidon de` + plant name + `modifié` or `modifiée`, supporting `amidon de blé modifié`. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S03** | CFIA, [List of ingredients and allergens on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens) | Current labelling guidance explicitly gives `wheat starch` and `modified wheat starch` as examples where the plant source must be named. It does not establish a separate household product or measure. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S04** | Health Canada, [List of Dietary Fibres Reviewed and Accepted by the Food Directorate](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html) | French table lists `amidon résistant de blé ou amidon modifié de blé` and describes a cross-linked phosphorylated starch. This supports one specific Canadian modified-wheat-starch product context, not an alias or definition for every modified wheat starch. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S05** | OQLF, [amidon de froment (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432751/amidon-de-froment) | Québec terminology source lists `amidon de froment` and `amidon de blé` for `wheat starch`, defined as starch of *Triticum*. It supports the native base identity and local wording, not the modified qualifier. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S06** | Green Giant Canada, [Broccoli & Cheese Veggie Tots](https://greengiantcanada.ca/our-products/green-giant-broccoli-cheese-veggie-tots/) | Current Canadian manufacturer page lists `Modified Wheat Starch` and `Wheat Starch` separately. This is a finished-food ingredient list, not a starch-package specification. The manufacturer cautions that package labels carry the latest product information. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S07** | Green Giant Canada, [Bouchées de légumes brocoli et fromage](https://greengiantcanada.ca/fr/our-products/bouchees-de-legumes-brocoli-et-fromage-green-giant/) | Current French page lists `amidon de blé modifié` and `amidon de blé` separately, supporting the proposed Québec French display and the identity boundary. It is the same finished product class as S06. |
| **WP02-B3-MODIFIED-WHEAT-STARCH-R121-20261014-S08** | Mito, [Tempura Mix, 320 g](https://mito.ca/en/product/tempura-mix/) | Current Québec-market page lists `modified wheat starch` and says its product range is available at certain IGAs across Québec. The ingredient list is English and the page does not specify the starch grade. |

## Checks performed

- Read the current reference JSON, ledger record for ordinary wheat starch, B3 plan entries, and
  recent R118–R120 B3 proposal and batch notes.
- Confirmed the candidate reference ID and source-ID prefix are unused in the current catalog and
  research ledger/proposal files.
- Parsed the current bundled reference and form JSON. Mirrored the picker phrase/substring behavior
  for the query projection above; this was a static review, not an app test.
- Scanned the 114 manifest recipes and 1,123 ingredient rows for the qualified and base wheat-starch
  phrases; no matches were found.
- Integrated with its accepted identity-only reference and research-ledger record on 2026-10-15. No
  app, Gradle, instrumentation, or emulator tests were run under the updated JSON-only rule;
  package, ledger, normalization, and generated-index static checks are recorded in the batch README.
