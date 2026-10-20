# WP04 Section P — European lobster identity review (2026-10-14)

**Status:** Integrated on 2026-10-14 as `ingredient-ref-european-lobster`, with one accepted
research-ledger record. Section P remains open.

## Decision

**Recommend an identity-only addition** for *Homarus gammarus*: **European lobster / homard européen**, category `PROTEIN`. The OQLF identifies this as an edible crustacean and pairs the French and English names with the species. A Nova Scotia seafood distributor separately lists a European-lobster product under the same binomial. Keep it separate from the already integrated American lobster, langoustine, langouste/spiny lobster, and crayfish.

This review covers only the European-lobster identity. It does not claim that the product is commonly available at Québec retail or that `European lobster` is an accepted CFIA package-label name. The CFIA Fish List currently assigns its unqualified `Lobster / Homard` label to *H. americanus* and does not list *H. gammarus*. The catalog display should remain species-qualified and should not add unqualified terms as aliases.

## Section P and prior-work boundary

The active Section P checklist remains open for fish and seafood identities. The American-lobster integration explicitly kept European lobster separate and left it for a focused review; it did not resolve a European row or product boundary. A repository search of the current catalog, forms, legacy candidates, ledger, Section P proposals, and batches found no dedicated *H. gammarus* decision or identity allocation. The only earlier mentions are exclusion/context in the American-lobster review and its ledger evidence. This proposal does not revisit that decision.

The current live references already include `ingredient-ref-lobster` as **American lobster / homard d’Amérique**, with aliases `lobster`, `North American lobster`, `homard`, and `homard américain`, and `ingredient-ref-langoustine` as **scampi / langoustine**. No live reference, form, or legacy candidate owns `European lobster` or `homard européen`; no form covers a lobster state. The plan's earlier generic-lobster review is recorded in [the proposal](wp04-section-p-generic-lobster-homard-identity-review-20261012.md) and [integration note](../batches/wp04-section-p-american-lobster-identity-integration-20261012/README.md).

## Source review

| ID | Source and date | Evidence and limit |
|---|---|---|
| `WP04-SECTIONP-EUROPEAN-LOBSTER-R98-20261014-S01` | OQLF, [homard européen, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358906/homard-europeen), last updated 2004; accessed 2026-10-14 | The entry is in zoology and edible-crustacean domains; it pairs preferred French `homard européen`, English `European lobster`, and *Homarus gammarus*. It also lists unqualified `homard` and `lobster` under this species, and says it differs from the American lobster mainly in coloration and body shape while sharing morphology. These broader terms are not proposed as aliases because they already belong to the American row and the Canadian labeling source below scopes them there. |
| `WP04-SECTIONP-EUROPEAN-LOBSTER-R98-20261014-S02` | CFIA, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species), modified 2026-10-05; accessed 2026-10-14 | Lists *Homarus gammarus* as European lobster and *H. americanus* as American lobster. CFIA explicitly says this list is for aquatic-animal health and does **not** replace the Fish List for food labels; it supports the binomial/name distinction, not labeling authorization. |
| `WP04-SECTIONP-EUROPEAN-LOBSTER-R98-20261014-S03` | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), list modified 2023-09-18; accessed 2026-10-14 | The searchable entries list *H. americanus* as `American Lobster / Homard Américain` and also `Lobster / Homard`; the current list has no *H. gammarus* or `European Lobster` row. This is a Canadian food-label boundary, not evidence that the species is not edible. |
| `WP04-SECTIONP-EUROPEAN-LOBSTER-R98-20261014-S04` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; accessed 2026-10-14 | Explains that the Fish List provides English and French common names for Canadian fish labeling and that names not listed are assessed against the rule against misleading labels. This review therefore does not describe the proposed catalog display as a CFIA-approved label. |
| `WP04-SECTIONP-EUROPEAN-LOBSTER-R98-20261014-S05` | World Link Food Distributors, [European Lobster product page](https://atlanticlobster.ca/product/european-lobster/), visible page date 2023-11-25; accessed 2026-10-14 | Nova Scotia distributor page identifies the product as *H. gammarus*, describes live European lobster, states “All Year” availability, gives the north-eastern Atlantic catch area, and lists a 30 lb box. It is primary Canadian wholesale-market evidence; its date and sales channel do not establish current Québec retail stock or a consumer-package label. The box size remains a supplier package observation. |

The OQLF entry supports Québec French wording; the Canadian distributor supports a Canadian trade product and explicit species identity. CFIA's distinction limits how this should be represented as a Canadian fish label. Together they support a qualified culinary identity while keeping broad label wording on the American identity. No Québec retail listing or Québec recipe evidence was found in this bounded review.

## Catalog and picker boundary

The picker folds accents and matches complete word phrases across each reference's display names and aliases, then uses partial matching if there is no complete phrase. Under that behavior:

- `European lobster` and `homard européen` select the proposed *H. gammarus* row alone.
- Broad `lobster` and `homard` searches return both European lobster and the existing American lobster row because those words occur in the qualified display names. They become a two-choice picker result; this review adds no broad alias to the European row.
- `American lobster`, `homard d’Amérique`, `North American lobster`, and `homard américain` remain on `ingredient-ref-lobster`.
- `langoustine` / `scampi` remains on its separate existing row. No `langouste`, `spiny lobster`, `rock lobster`, or `crayfish` terms are assigned to this candidate.

The two *Homarus* identities share a genus, and OQLF describes similar morphology, but those facts do not prove recipe interchangeability. The qualified displays preserve the choice at selection time.

## Recipe demand and product data

The complete current manifest lists 114 recipe files and 1,123 ingredient rows. A case-insensitive scan of every manifest-listed recipe file found zero occurrences of `European lobster`, `homard européen`, `Homarus gammarus`, `lobster`, or `homard`. There is no recipe line to link, no recipe quantity or kitchen measure, and no recipe-specific product state or substitution evidence.

The distributor's live-product description and 30 lb case size describe its wholesale SKU. They do not support a reusable live form, a per-lobster measure, density, edible-yield value, or kitchen conversion. Add no forms, measures, mappings, conversions, yields, or substitutions. In particular, do not infer a general substitution from *H. gammarus* to American lobster; no source here validates it for a dish, role, or preparation method.

## Proposed canonical data if accepted

```json
{
  "id": "ingredient-ref-european-lobster",
  "nameEn": "European lobster",
  "nameFr": "homard européen",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN",
  "updatedAt": "2026-10-14T00:00:00Z"
}
```

Record the species scope as *Homarus gammarus* in the accepted ledger decision. Retain the OQLF alternative terms as source observations only; do not add them as aliases. The row has null density, empty unit mappings, and no forms, recipe links, conversions, yields, or substitutions.

## Static checks and test status

The source, ownership, picker, and recipe scans above were read-only. UTF-8/no-BOM encoding, LF line endings, final newline, whitespace, five unique source IDs, local links, picker projection, and the complete recipe scan passed. After integration, seed-package/reference normalization, ledger-schema validation, and generated-index freshness checks also passed. No application tests or emulator checks were run because this change only adds database JSON data.
