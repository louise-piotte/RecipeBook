# WP02 Section 04 B3 R92 — modified corn starch identity

- **Reviewed:** 2026-10-14.
- **Status:** Integrated 2026-10-14. The accepted identity row and ledger record are in the bundled data; integration details are recorded in [the batch README](../batches/wp02-b3-modified-corn-starch-identity-integration-20261014/README.md).
- **Scope:** The plant-specific modified-starch identity `modified corn starch / amidon de maïs modifié`, distinct from ordinary corn starch and from the recently integrated modified-pea-starch identity.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference and one research-ledger record. Keep aliases and forms empty, density and unit mappings unset, and recipe links, conversions, yields, and substitutions unchanged.
- **Source-ID prefix:** `WP02-B3-MODIFIED-CORN-STARCH-20261014-R92`; checked against existing ledger source IDs and proposal files with no collision.

## Why this is a separate open gap

The live Section 04 WP02 flour-and-starch checklist remains partial. The existing `ingredient-ref-cornstarch` represents ordinary extracted corn starch and owns `cornstarch / fécule de maïs`, with aliases `corn starch / amidon de maïs`. R91 added the separate source-specific product `modified pea starch / amidon de pois modifié`; it does not cover a modified product from corn. No active reference or form owns the qualified maize terms proposed here.

The current Canadian common-name rule distinguishes starch from modified starch and requires the plant source in each name. OQLF has an exact English/French entry for the maize-specific product, and current Québec-market bilingual ingredient labels repeat that pair. The candidate therefore has a supported product boundary and locale-ready display terms. The generic names `modified starch / amidon modifié` omit the plant source and are not safe aliases. [S01–S07]

This recommendation adds only the source-named identity class. Manufacturer sources show that modified starch grades vary in their intended processing conditions and functional properties. The broad label does not identify a specific chemical treatment or establish that grades are interchangeable. [S08–S09]

## Recommended reference delta

Add this single row to `ingredient-references.v1.json` if the proposal is accepted:

```json
{
  "id": "ingredient-ref-modified-corn-starch",
  "nameEn": "modified corn starch",
  "nameFr": "amidon de maïs modifié",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not add `modified starch`, `modified food starch`, `amidon modifié`, or `amidon transformé` as aliases. Do not add `modified cornstarch`, `modified maize starch`, E-number names, or specific treatment terms such as `cross-linked`, `acetylated`, `pregelatinized`, or `cold-water swelling` without source evidence that the exact term is a general consumer-facing synonym for this row. Keep the ordinary cornstarch row and its aliases unchanged. The exact qualified phrases distinguish the new identity without asserting a grade, process chemistry, or recipe function.

## Recommended ledger delta

Add one `ingredient_reference` record for `ingredient-ref-modified-corn-starch`; retain no form, measurement observation, unit conversion, or substitution finding:

```json
{
  "recordId": "ingredient-ref-modified-corn-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494324/amidon-de-mais-modifie",
      "title": "OQLF — amidon de maïs modifié (GDT)",
      "accessedOn": "2026-10-14",
      "locator": "Preferred French term and English translation; entry last updated 1987.",
      "supports": "Exact bilingual names amidon de maïs modifié / modified corn starch.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357365/amidon-modifie",
      "title": "OQLF — amidon modifié (GDT)",
      "accessedOn": "2026-10-14",
      "locator": "Definition and terminology note; entry last updated 2004.",
      "supports": "The generic modified-starch class is chemically treated to change physical properties such as viscosity or gelling.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais",
      "title": "OQLF — amidon de maïs (GDT)",
      "accessedOn": "2026-10-14",
      "locator": "Definition and preferred names; entry last updated 2004.",
      "supports": "The base product is starch from corn kernels; OQLF gives amidon de maïs / fécule de maïs and English corn starch.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S04",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components",
      "title": "CFIA — Common Names for Ingredients and Components",
      "accessedOn": "2026-10-14",
      "locator": "Table 1, items 20–21; last amended 2026-02-11.",
      "supports": "Canadian common-name construction distinguishes starch (plant name + starch) from modified starch (modified + plant name + starch).",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S05",
      "url": "https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants",
      "title": "ACIA — Noms usuels d'ingrédients et de constituants",
      "accessedOn": "2026-10-14",
      "locator": "Tableau 1, articles 20–21; dernière modification 2026-02-11.",
      "supports": "French common-name construction is amidon de + plant name + modifié/modifiée for modified starch.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S06",
      "url": "https://www.superc.ca/en/aisles/pantry/condiments-toppings/international-condiments/teriyaki-stir-fry-sauce/p/058744153469",
      "title": "Super C — VH Teriyaki Stir Fry Sauce, 355 mL",
      "accessedOn": "2026-10-14",
      "locator": "Search-indexed product information and bilingual ingredient declaration; page marks the item Made in Canada and Foods Prepared in Quebec. Direct page fetch returned 403 in this review.",
      "supports": "A current Québec-market listing uses Modified corn starch / amidon de maïs modifié.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S07",
      "url": "https://www.metro.ca/en/online-grocery/aisles/deli-prepared-meals/deli-meats/bologna-pastrami/chicken-bologna/p/067714003376",
      "title": "Metro — Zabiha Halal Chicken Bologna, 375 g",
      "accessedOn": "2026-10-14",
      "locator": "Search-indexed bilingual ingredient declaration for product 067714003376; direct page fetch failed in this review.",
      "supports": "The same listing separately names modified corn starch and corn starch, with corresponding French names; they are not interchangeable label synonyms.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S08",
      "url": "https://www.cargill.com/food-bev/na/modified-starches",
      "title": "Cargill — Modified Starches",
      "accessedOn": "2026-10-14",
      "locator": "Modified-food-starch portfolio, types, and applications.",
      "supports": "Manufacturer distinguishes thinned, stabilized, roll-dried, cold-water-swelling, ester, ether, and emulsifying starch product functions.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S09",
      "url": "https://www.roquette.com/food-nutrition/product-catalog/clearam-ch-30-20",
      "title": "Roquette — CLEARAM CH product family",
      "accessedOn": "2026-10-14",
      "locator": "Related modified-corn and modified-waxy-corn starch grade descriptions.",
      "supports": "Manufacturer product specifications distinguish modified corn and waxy-corn grades by temperature, shear, pH, viscosity, gelling, and applications.",
      "sourceKind": "manufacturer"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add modified corn starch / amidon de maïs modifié as a separate plant-specific identity from ordinary corn starch and modified pea starch. Keep aliases, forms, density, unit mappings, measures, recipe links, conversions, yields, and substitutions empty. The source-named class does not establish a specific modification chemistry or grade equivalence.",
      "sourceIds": [
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S01",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S02",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S03",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S04",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S05",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S06",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S07",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S08",
        "WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S09"
      ]
    }
  ]
}
```

## Ownership and picker projection

The live search index normalizes accents, punctuation, and case, then returns complete word-phrase matches before substring fallback. I checked exact normalized ownership in references, forms, legacy candidates, and ledger record IDs. There is no exact owner for `modified corn starch`, `amidon de maïs modifié`, or the proposed reference ID. The exact broad phrases `corn starch` and `amidon de maïs` currently belong to `ingredient-ref-cornstarch`. The ledger's `ingredient-ref-modified-pea-starch` and a finished-product ingredient-list mention of generic modified starch are not maize identities.

| Query | Current projection | Projection with proposed row |
|---|---|---|
| `modified corn starch` | No result | `ingredient-ref-modified-corn-starch` |
| `amidon de maïs modifié` | No result | `ingredient-ref-modified-corn-starch` |
| `corn starch` | `ingredient-ref-cornstarch` | `ingredient-ref-cornstarch`; `ingredient-ref-modified-corn-starch` |
| `amidon de maïs` | `ingredient-ref-cornstarch` | `ingredient-ref-cornstarch`; `ingredient-ref-modified-corn-starch` |
| `cornstarch` | `ingredient-ref-cornstarch` | `ingredient-ref-cornstarch` |
| `modified starch` / `amidon modifié` | No result | No result |
| `modified pea starch` / `amidon de pois modifié` | `ingredient-ref-modified-pea-starch` | `ingredient-ref-modified-pea-starch` |

The broad corn-starch searches continue to return both distinct product identities. The qualified searches return the modified product alone; no source-free modified-starch alias is introduced.

## Recipe demand, measurements, and substitutions

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. Searches of full recipe JSON text and ingredient rows for `modified corn starch`, `modified cornstarch`, `modified maize starch`, `modified starch`, `amidon de maïs modifié`, `amidon modifié de maïs`, `amidon modifié`, and `amidon transformé` found **zero** matching files and **zero** matching rows. No current recipe link or demand supports a recipe edit.

No reviewed source supplies a consumer household measure, product-matched mass/volume pair, or bulk density for a standalone modified corn starch ingredient. Metro's 355 mL sauce and 375 g bologna numbers describe finished packaged foods; neither gives the starch amount or a measure for starch powder. Cargill and Roquette report product-grade processing properties such as temperature, pH, shear, viscosity, and freeze/thaw stability, not household conversions. Keep density `null`, `unitMappings` empty, and measurement state `researched_no_supported_value`. [S06–S09]

No general substitution is recommended. Cargill describes different starch grades for different functions, and Roquette lists corn-starch grades with distinct property windows. That evidence does not support replacing one modified grade with ordinary cornstarch or another starch at a general ratio. The existing ledger finding that converts ordinary cornstarch to flour is explicitly restricted to `ingredient-ref-cornstarch` and a sauce/gravy-thickener method; do not attach it to this new identity. No `SubstitutionRule` or `ContextualSubstitutionRule` is proposed. [S02, S08–S09]

## Source register and limits

All sources were checked on 2026-10-14. The two retailer listings below were checked through current search-index content where direct page fetch failed. The prefix was not present in the active research ledger or existing proposal files.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S01** | OQLF, [amidon de maïs modifié (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494324/amidon-de-mais-modifie) | Exact preferred French term and English translation. Entry dates to 1987 and gives no modern grade or food-use specification. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S02** | OQLF, [amidon modifié (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357365/amidon-modifie) | Defines the generic class and notes viscosity/gelling changes. Updated 2004; not maize-specific. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S03** | OQLF, [amidon de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais) | Defines the base corn-starch product and lists `amidon de maïs / fécule de maïs` with English `corn starch`. Updated 2004; this is not the modified product. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S04** | CFIA, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components) | Current incorporated-by-reference rule, last amended 2026-02-11; Table 1 items 20–21 give plant-source naming for ordinary and modified starch. It does not identify an ingredient's modification chemistry or measure. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S05** | CFIA, [Noms usuels d'ingrédients et de constituants](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants) | French version of the current Canadian common-name rule, last amended 2026-02-11; Tableau 1 articles 20–21. It provides a naming construction, not a standalone retail product definition. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S06** | Super C, [VH Teriyaki Stir Fry Sauce, 355 mL](https://www.superc.ca/en/aisles/pantry/condiments-toppings/international-condiments/teriyaki-stir-fry-sauce/p/058744153469) | Current search-indexed Québec-market bilingual listing uses the exact ingredient pair and marks the item Made in Canada / Foods Prepared in Quebec. Direct page fetch returned 403; this is retailer content for finished sauce, not a starch package or manufacturer's specification, and ingredient data can change. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S07** | Metro, [Zabiha Halal Chicken Bologna, 375 g](https://www.metro.ca/en/online-grocery/aisles/deli-prepared-meals/deli-meats/bologna-pastrami/chicken-bologna/p/067714003376) | Search-indexed bilingual listing names modified corn starch separately from corn starch; direct page fetch failed in this review. This is a finished-food label, not a specification or evidence of ingredient proportions. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S08** | Cargill, [Modified Starches](https://www.cargill.com/food-bev/na/modified-starches) | Manufacturer portfolio describes several modified-starch types and functions for food processing. It is not a consumer-measure guide and does not establish one grade's equivalence to another. |
| **WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S09** | Roquette, [CLEARAM CH product catalog](https://www.roquette.com/food-nutrition/product-catalog/clearam-ch-30-20) | Current manufacturer pages distinguish modified corn and waxy-corn grades by process tolerance and application. Product-specific ranges are not transferable kitchen measurements or substitution ratios. |

## Static checks actually run

- Recomputed the live inventory from JSON: **1,425 references, 104 forms, 1,764 ledger records, 63 legacy candidates, 114 recipe files, and 1,123 ingredient rows**.
- Parsed all manifest-listed recipe JSON and scanned complete recipe text and ingredient rows for the qualified candidate phrases; found no demand.
- Rechecked exact normalized query ownership and mirrored the normalization and complete-phrase-first picker logic from `IngredientSearch.kt`. Qualified English/French queries return the new row alone; broad corn-starch queries return the ordinary and modified identities; unqualified modified-starch queries remain empty.
- Validated the ledger schema and the nine new source IDs; found no source-ID collision. Seed package normalization, reference normalization, generated-index freshness, and the 114-recipe / 1,123-row demand scan passed.
- Checked UTF-8/no-BOM, JSON examples, direct source links, and scoped whitespace. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated index under `AGENTS.md`.

This proposal recommends one identity-only integration and does not complete WP02 or the Section 04 B2/B3 checklist.
