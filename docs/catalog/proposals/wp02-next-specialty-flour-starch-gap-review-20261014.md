# WP02 Section 04 B2 R96 — defatted soy flour identity review

- **Integration status:** accepted and integrated on 2026-10-14.
- **Decision:** Added one identity-only `FLOUR_AND_STARCH` reference for explicitly defatted soy flour.
- **Shared-data delta:** one canonical reference, one research-ledger record, and the regenerated Kotlin catalog index; no forms, active measurements, substitutions, or recipe links.
- **Scope:** Soybean flour ingredients whose source or label identifies fat removal. Do not treat every unqualified soy flour as defatted, and do not include textured soy flour, textured vegetable protein (TVP/PVT), soy protein concentrate, or soy protein isolate.
- **Proposal date:** 2026-10-14.
- **Source-ID prefix:** `WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014`; no current ledger record or proposal uses this prefix.

## Recommendation and boundary

Add the narrow product class **`defatted soy flour / farine de soya dégraissée`**. CFIA names defatted soy flour as an example of food produced by removing a constituent, and current food-grade supplier evidence confirms defatted soy flour is sold as a flour product. A current Québec maker's ingredient declaration uses the French phrase `farine de soya dégraissée`. These sources support the process-qualified ingredient identity, while the existing generic soy-flour record remains process-unspecified. [S01, S03–S05]

This is an identity for soy material milled as flour after fat removal. It does not specify how much fat remains, whether the flour is toasted or enzyme-active, protein dispersibility, heat treatment, particle size, or a brand or grade. Do not infer that the current generic soy-flour row means full-fat flour. Keep roasted Kinako, grits/flakes, textured soy flour, finished TVP/PVT, soy-protein concentrate, and soy-protein isolate separate. [S01–S04, S06]

Use the Québec label wording as the French display and the Canadian supplier/manufacturer wording as the English display. Add no aliases: the OQLF's `soybean flour`, `soya flour`, and `farine de soja` remain generic terms on the existing soy-flour row, while no source reviewed here establishes those unqualified forms as synonyms for the defatted class. Do not move or remove any existing alias. [S02–S05]

## Current ownership and overlap

The current package has **1,431 references, 105 forms, 1,771 research-ledger records, and 63 legacy candidates**. Normalized name and alias checks found no active owner for `defatted soy flour`, `farine de soya dégraissée`, or the proposed ID. No soy-flour or Kinako form exists. There is no focused legacy candidate or WP02 review for this flour identity.

Two nearby records need to remain distinct:

| Current record | Current scope | Boundary for this proposal |
|---|---|---|
| `ingredient-ref-soy-flour` — `soy flour / farine de soya`; aliases `soybean flour`, `soya flour`, and `farine de soja`. | OQLF-defined generic fine, sifted, hull-free soybean meal used as food; its display and aliases do not state fat-removal status. | Keep it unchanged. The new qualified row represents only sources that explicitly specify defatting. Do not alias generic terms onto the new row. [S02] |
| `ingredient-ref-kinako` — `kinako / poudre de soja Kinako`; alias `roasted soybean flour`. | Source-named roasted soybean flour. | Keep roasted Kinako separate from defatted soy flour. [S06] |
| `candidate-soy-curls` and `ingredient-form-textured-vegetable-protein-strips` in the ledger. | WP04 records a finished Québec TVP/PVT strip product and its product-specific preparation; the manufacturer's ingredient list says it contains defatted soy flour. | These records do not define a flour reference or flour form. Keep the TVP form and its hydration directions attached to the finished protein product; do not duplicate them as flour behavior. [S05] |

The exact wording `defatted soy flour` occurs in the existing WP04 product evidence for TVP, but only as an ingredient in that finished product. It has no dedicated WP02 identity, reference, form, legacy candidate, or flour-specific evidence record. The candidate ID and R96 source prefix are unallocated.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): exact normalized form terms take priority; otherwise the picker matches complete word phrases in displays and aliases, then falls back to substrings if no phrase match exists. Results below are a static simulation using the current reference and form package with the proposed row added.

| Query | Current results | With the proposed row |
|---|---|---|
| `defatted soy flour` | No result. | `ingredient-ref-defatted-soy-flour` |
| `farine de soya dégraissée` | No result. | `ingredient-ref-defatted-soy-flour` |
| `soy flour` | `ingredient-ref-soy-flour` | `ingredient-ref-soy-flour`; `ingredient-ref-defatted-soy-flour` |
| `farine de soya` | `ingredient-ref-soy-flour` | `ingredient-ref-soy-flour`; `ingredient-ref-defatted-soy-flour` |
| `farine de soja` | `ingredient-ref-soy-flour` | `ingredient-ref-soy-flour` |
| `soybean flour` | `ingredient-ref-kinako`; `ingredient-ref-soy-flour` | Same two results |
| `soya flour` | `ingredient-ref-soy-flour` | `ingredient-ref-soy-flour` |
| broad `soy` | 10 results, including generic soy flour | Same 10 plus `ingredient-ref-defatted-soy-flour` |
| broad `soya` | 19 results, including generic soy flour | Same 19 plus `ingredient-ref-defatted-soy-flour` |

The exact process-qualified English and French searches each select only the proposed identity. Generic English `soy flour` and Québec French `farine de soya` retain the generic identity and also offer the new qualified option. `Soybean flour` retains the existing generic/Kinako ambiguity; no new alias widens it. Broad `soy` and `soya` searches grow from 10 to 11 and 19 to 20 results respectively, with no existing result removed.

## Recipe demand

I scanned all **114 manifest-listed recipe JSON files and 1,123 ingredient rows**, including full recipe JSON text and ingredient-line fields. There were **zero matching files and zero ingredient rows** for `defatted soy flour`, `farine de soya dégraissée`, `soy flour`, `soybean flour`, `soya flour`, `farine de soya`, `farine de soja`, `kinako`, or `roasted soybean flour`. No recipe link, recipe-driven alias, or immediate bundled-recipe demand is proposed.

## Measures, forms, and substitutions

- **Measures and density:** No source reviewed supplies a reproducible kitchen measure or a class-wide flour density. Univar's listed 50 lb bag is a supplier package, not a household measure; Cargill's 50% protein figure is a product characteristic, not a volume-to-mass conversion. Keep `defaultDensity: null`, `unitMappings: []`, and `measurementObservations: []`. [S03–S04]
- **Forms:** Add no form. Fat removal is the defining process scope of this reference; heat treatment, protein dispersibility, mesh size, and textured/extruded presentations are either product grades or distinct products, not a shared preparation form. [S01, S03–S04]
- **Substitution:** Cargill describes functional bakery uses for its Prolia soy-flour products but gives no general replacement ratio in the reviewed page. Les Brutes' water-to-product hydration and meat-replacement directions concern finished TVP/PVT, not the flour ingredient. Add no global or contextual substitution rule, recipe-line substitution, yield, or equivalence with generic soy flour, Kinako, soy protein, TVP, or wheat flour. [S03, S05]

## Proposed canonical reference

If accepted, add this single row to the reference catalog:

```json
{
  "id": "ingredient-ref-defatted-soy-flour",
  "nameEn": "defatted soy flour",
  "nameFr": "farine de soya dégraissée",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Add no `IngredientForm`, unit mapping, package yield, recipe link, or substitution rule.

## Proposed ledger record

If the reference is accepted, add one evidence record for the new identity. It records no reusable measurement or substitution finding.

```json
{
  "recordId": "ingredient-ref-defatted-soy-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S01",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/true-nature",
      "title": "Canadian Food Inspection Agency, True nature of food",
      "versionOrDate": "Last modified 2025-01-15",
      "accessedOn": "2026-10-14",
      "locator": "Condition or treatment, lines 54–57",
      "supports": "Names defatted soy flour as an example of a food resulting from removal of a constituent; supports preserving defatting as a meaningful identity qualifier, not a flour standard or French naming authority.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya",
      "title": "Office québécois de la langue française, farine de soya (GDT)",
      "versionOrDate": "Last updated 1990",
      "accessedOn": "2026-10-14",
      "locator": "Preferred French terms, definition, and English terms",
      "supports": "Defines generic soy flour as a fine, sifted, hull-free soybean meal for human food and pairs farine de soya/farine de soja with soy flour, soybean flour, and soya flour; it does not specify fat status.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S03",
      "url": "https://www.cargill.com/food-bev/na/prolia-soy-flour",
      "title": "Cargill, Prolia Soy Flour",
      "accessedOn": "2026-10-14",
      "locator": "Product description and bakery applications",
      "supports": "Current manufacturer page describes Prolia soy-flour products for the food industry and identifies defatted soy flours; its protein and functional attributes are product evidence, not class-wide specifications or reusable conversions.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S04",
      "url": "https://www.univarsolutions.com/ca/en/16176226",
      "title": "Univar Solutions Canada, Prolia Soy Flour 200/70, Food Grade",
      "accessedOn": "2026-10-14",
      "locator": "Product title and details: food grade, powder, 50 lb bag; product no. 16176226",
      "supports": "Current Canada-region supplier listing identifies a food-grade Prolia soy-flour powder and describes defatted soy flour; the 50 lb bag is an industrial package, not a kitchen measure or retail-availability claim.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S05",
      "url": "https://lesbrutes.ca/products/la-fine-pvt-nature",
      "title": "Les Brutes, LA FINE – PVT nature",
      "accessedOn": "2026-10-14",
      "locator": "Current Québec product description, ingredient declaration, and manufacturer location",
      "supports": "The manufacturer identifies a finished textured soy-protein product, prepared in Québec, whose ingredient declaration names farine de soya dégraissée; supports this French ingredient wording, not a standalone flour package or flour measure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S06",
      "url": "https://lesbrutes.ca/en/products/plain-tvp",
      "title": "Les Brutes, Plain TVP",
      "accessedOn": "2026-10-14",
      "locator": "Current English product ingredient declaration and preparation directions",
    "supports": "The current English Québec manufacturer page names defatted soy flour as an ingredient in finished plain TVP; its hydration directions apply only to the finished TVP product.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the explicitly defatted soy-flour identity with source-attested English and Québec French displays. Keep generic soy-flour aliases, Kinako, and textured soy products separate; add no numeric or substitution behavior.",
      "sourceIds": [
        "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S01",
        "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S02",
        "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S03",
        "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S04",
        "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S05",
        "WP02-B2-DEFATTED-SOY-FLOUR-R96-20261014-S06"
      ]
    }
  ]
}
```

## Limits and checks

This review covers the current bundled catalog, ledger, legacy candidates, WP02/WP04 evidence, recipe corpus, and the sources listed above. It is not a survey of all soy-flour grades or Canadian retail availability. In particular, the Québec French phrase is attested as an ingredient on a textured-protein product label, while the standalone current Canadian food-grade listing is a bulk supplier product. Do not infer that a particular fat threshold, heat treatment, or protein specification applies to every defatted soy flour.

Static ownership, picker-projection, recipe-corpus, and proposal JSON/schema checks were performed before integration. After integration, package normalization, reference normalization, ledger schema, generated-index freshness, picker behavior, recipe links, encoding, local links, and scoped whitespace were checked. No app, Gradle, instrumentation, or emulator tests were run because the application change only adds database JSON data and its generated catalog index under the `AGENTS.md` exception.

## Root integration decision (2026-10-14)

Accepted `ingredient-ref-defatted-soy-flour` as an identity-only `FLOUR_AND_STARCH` reference with
the displays `defatted soy flour / farine de soya dégraissée` and empty alias arrays. Kept generic
soy-flour wording and aliases on `ingredient-ref-soy-flour`, and preserved separate Kinako and
textured-soy-product scopes. Added one accepted `ingredient_reference` ledger record with no
measurement observations, forms, unit mappings, recipe links, conversions, yields, or substitution
rules.

Updated the flour checklist and roadmap. The recipe bundle has no matching demand. See the integration
README for current counts and static validation results.

## Sources

| ID | Source and date | Evidence and limit |
|---|---|---|
| **S01** | CFIA, [True nature of food](https://inspection.canada.ca/en/food-labels/labelling/industry/true-nature), last modified 2025-01-15; accessed 2026-10-14. | Lists defatted soy flour as a result of fat removal, under food condition/treatment. It does not define a flour specification or translate the product name. |
| **S02** | OQLF, [farine de soya (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya), last updated 1990; accessed 2026-10-14. | Supports generic French/English wording and the existing generic aliases; it does not name a defatted class. |
| **S03** | Cargill, [Prolia Soy Flour](https://www.cargill.com/food-bev/na/prolia-soy-flour), current manufacturer page accessed 2026-10-14. | Describes the food-industry soy-flour line and defatted soy flours. Its 50% protein and functional baking claims are product-specific. |
| **S04** | Univar Solutions Canada, [Prolia Soy Flour 200/70, Food Grade](https://www.univarsolutions.com/ca/en/16176226), current Canada-region listing accessed 2026-10-14. | Lists product no. 16176226 as food-grade powder in a 50 lb bag and describes defatted soy flour. It is a bulk supplier listing, not a retail stock or kitchen-measure source. |
| **S05** | Les Brutes, [LA FINE – PVT nature](https://lesbrutes.ca/products/la-fine-pvt-nature), current Québec maker page accessed 2026-10-14. | Ingredient declaration uses `farine de soya dégraissée` for a finished textured soy-protein product and says it is prepared in Québec. It is not a standalone flour label. |
| **S06** | Les Brutes, [Plain TVP](https://lesbrutes.ca/en/products/plain-tvp), current English maker page accessed 2026-10-14. | Ingredient declaration uses `Defatted soy flour` for finished plain TVP; preparation directions apply to the TVP product only. |
