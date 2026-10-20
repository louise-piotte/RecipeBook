# WP03 Section F R723 — Canadian Froot Loops cereal-family identities (2026-10-18)

## Decision

- **Recommendation:** Add three identity-only `GRAIN_AND_CEREAL` references for the current Canadian WK Kellogg products `Froot Loops cereal / Céréales Froot Loops`, `Froot Loops Less Sugar cereal / Céréales Froot Loops Moins de sucre`, and `Froot Loops with Marshmallow cereal / Céréales Froot Loops avec guimauves`.
- **Scope:** These are three separately named ready-to-eat cereal products shown by the current Canadian manufacturer. The existing `Cocoa Loops cereal / Céréales Cocoa Loops` remains separate and unchanged.
- **Status:** Proposal only. No active catalog, ledger, form, recipe, plan, roadmap, workflow, generated-index, or integration file was changed.
- **Limits:** Add no aliases, forms, density, unit mappings, measurement observations, conversions, yields, recipe links, or substitutions. Do not add `Original` as a title or alias: the base Canadian product page calls it `Froot Loops Cereal`. Do not add broad `fruit loops`, generic fruit-cereal, or company-name aliases.

The Section F checklist remains open for remaining grain and cereal identities and terminology, including “other unresolved grain products” ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)). R491 accepted the separate Cocoa Loops identity and explicitly kept it distinct from Froot Loops; it cited the manufacturer roster but allocated no Froot Loops reference. This proposal covers the three current sibling products left outside that decision, without reopening Cocoa Loops. Recent R699, R705, R708, R711, R714, and R717 work concerns other grains, aliases, or product portions and remains unchanged.

## Proposed identities

Names below use the Canadian manufacturer’s product wording in English and French, with the manufacturer prefix omitted from the picker display. The French labels are manufacturer-authored Canadian French product names, not an OQLF ruling or a claim of generic Québec terminology.

| Proposal-local ID | English display | French display | Aliases | Numeric/form data |
|---|---|---|---|---|
| `ingredient-ref-froot-loops-cereal-r723-local` | `Froot Loops cereal` | `Céréales Froot Loops` | None | `defaultDensity: null`; `unitMappings: []`; no forms or observations |
| `ingredient-ref-froot-loops-less-sugar-cereal-r723-local` | `Froot Loops Less Sugar cereal` | `Céréales Froot Loops Moins de sucre` | None | `defaultDensity: null`; `unitMappings: []`; no forms or observations |
| `ingredient-ref-froot-loops-with-marshmallow-cereal-r723-local` | `Froot Loops with Marshmallow cereal` | `Céréales Froot Loops avec guimauves` | None | `defaultDensity: null`; `unitMappings: []`; no forms or observations |

The less-sugar product remains a separate variant, not an alias or property of the base cereal. The marshmallow product remains separate because its manufacturer title and ingredient declaration identify a distinct formulated cereal. No general composition claim is made from the product pages.

### Seed-reference examples

These examples conform to the current `IngredientReference` schema. IDs are proposal-local only and are not allocated in shared data.

```json
[
  {
    "id": "ingredient-ref-froot-loops-cereal-r723-local",
    "nameFr": "C\u00e9r\u00e9ales Froot Loops",
    "nameEn": "Froot Loops cereal",
    "category": "GRAIN_AND_CEREAL",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-18T00:00:00Z"
  },
  {
    "id": "ingredient-ref-froot-loops-less-sugar-cereal-r723-local",
    "nameFr": "C\u00e9r\u00e9ales Froot Loops Moins de sucre",
    "nameEn": "Froot Loops Less Sugar cereal",
    "category": "GRAIN_AND_CEREAL",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-18T00:00:00Z"
  },
  {
    "id": "ingredient-ref-froot-loops-with-marshmallow-cereal-r723-local",
    "nameFr": "C\u00e9r\u00e9ales Froot Loops avec guimauves",
    "nameEn": "Froot Loops with Marshmallow cereal",
    "category": "GRAIN_AND_CEREAL",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-18T00:00:00Z"
  }
]
```

If integrated, the corresponding ledger records should use `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. The current product sources state nutrition serving masses for some variants, but this bounded identity review does not assess those values or promote them to observations. No volume, repeatable fill method, transferable measure, density, or substitution evidence is established here.

### Example ledger record and source ownership

The following is a schema-shaped, proposal-local example for the base product. The other two product records follow the same structure with their respective proposal-local source IDs. Each direct manufacturer URL below is not yet owned by a ledger source entry.

```json
{
  "ledgerVersion": 1,
  "records": [
    {
      "recordId": "ingredient-ref-froot-loops-cereal-r723-local",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "not_yet_researched",
      "substitutionResearchState": "not_yet_researched",
      "sources": [
        {
          "sourceId": "WP03-FROOT-LOOPS-R723-20261018-S01",
          "url": "https://www.wkkellogg.ca/en/products/froot-loops-cereal-product",
          "title": "WK Kellogg Co Canada, Froot Loops Cereal",
          "accessedOn": "2026-10-18",
          "locator": "Canadian product title, description, current listed package sizes, and product ingredient panel.",
          "supports": "Identifies the Canadian ready-to-eat product as Froot Loops Cereal. The product page does not establish a generic fruit-cereal identity or reusable measure.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP03-FROOT-LOOPS-R723-20261018-S02",
          "url": "https://www.wkkellogg.ca/fr/produits/c-r-ales-froot-loops-product",
          "title": "WK Kellogg Co Canada, Céréales Froot Loops",
          "accessedOn": "2026-10-18",
          "locator": "French product title, description, and listed package variants.",
          "supports": "Identifies the corresponding Canadian French product as Céréales Froot Loops. Supports product wording, not an OQLF-preferred generic term or reusable measure.",
          "sourceKind": "manufacturer"
        }
      ],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Add one identity-only reference for the separately named Canadian Froot Loops cereal product. Keep the Less Sugar and with Marshmallow siblings distinct; add no aliases, forms, numeric behavior, recipe links, or substitutions.",
          "sourceIds": [
            "WP03-FROOT-LOOPS-R723-20261018-S01",
            "WP03-FROOT-LOOPS-R723-20261018-S02"
          ]
        }
      ]
    }
  ],
  "unitConversions": []
}
```

## Evidence and boundaries

The current WK Kellogg Canada English Froot Loops brand page lists four distinct products: Cocoa Loops, Froot Loops Less Sugar, Froot Loops with Marshmallow, and Froot Loops Cereal. The three proposed products each have a matching Canadian French product page. The manufacturer’s French `Où acheter` locator was reviewed with Québec selected on 2026-10-18; it listed the base Froot Loops, Less Sugar, and with Marshmallow variants with online-retailer counts of 1, 8, and 10, respectively. Those counts are a dated locator snapshot, not proof of store inventory or long-term continuity. The official French product titles support the proposed bilingual labels; the English family page supports the product-family boundary. The less-sugar page compares labelled sugar amounts for its product and the base product, but that comparison is not a transferable serving measure.

| Source ID / ownership | Source | What it supports and does not support |
|---|---|---|
| Reuse `WP03-COCOA-LOOPS-R491-20261017-S01` | WK Kellogg Canada, [Froot Loops brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/froot-loops). | Lists the base, Less Sugar, with Marshmallow, and Cocoa Loops as separately named Canadian products. The exact URL is already owned by the R491 Cocoa Loops ledger record; reuse its source ID rather than registering the URL again. It does not make Cocoa Loops an alias for Froot Loops. |
| `WP03-FROOT-LOOPS-R723-20261018-S01` | WK Kellogg Canada, [Froot Loops Cereal](https://www.wkkellogg.ca/en/products/froot-loops-cereal-product). | Product title and description identify the base Canadian cereal. The package variants are product packaging; no package-yield or measure is proposed. |
| `WP03-FROOT-LOOPS-R723-20261018-S02` | WK Kellogg Canada, [Céréales Froot Loops](https://www.wkkellogg.ca/fr/produits/c-r-ales-froot-loops-product). | Official Canadian French product title and description support the display `Céréales Froot Loops`. This is a product name, not an OQLF ruling. |
| `WP03-FROOT-LOOPS-R723-20261018-S03` | WK Kellogg Canada, [Froot Loops Less Sugar Cereal](https://www.wkkellogg.ca/en/products/froot-loops-less-sugar-cereal-froot-loops). | Names the distinct Less Sugar product, describes it as a variant, and compares product-specific labelled sugar amounts. No general formula or reusable portion conversion is proposed. |
| `WP03-FROOT-LOOPS-R723-20261018-S04` | WK Kellogg Canada, [Céréales Froot Loops Moins de sucre](https://www.wkkellogg.ca/fr/produits/froot-loops-less-sugar-cereal-froot-loops). | Official Canadian French title supports the Less Sugar display and distinct product naming. |
| `WP03-FROOT-LOOPS-R723-20261018-S05` | WK Kellogg Canada, [Froot Loops with Marshmallow Cereal](https://www.wkkellogg.ca/en/products/froot-loops-marshmallow-product). | Names the distinct with-Marshmallow cereal and describes the added marshmallow shapes. No ingredient-level aliases or recipe conversion are inferred. |
| `WP03-FROOT-LOOPS-R723-20261018-S06` | WK Kellogg Canada, [Céréales Kellogg’s Froot Loops avec guimauves](https://www.wkkellogg.ca/fr/produits/froot-loops-marshmallow-product). | Official Canadian French title supports the distinct product and French display. |
| Reuse `WP03-ALL-BRAN-FAMILY-R203-20261016-S03` | WK Kellogg Canada, [Où acheter](https://www.wkkellogg.ca/fr/ou-acheter), Québec selected. | The exact URL is already registered on the All-Bran family records and Cocoa Loops record. The current locator lists all three proposed French product names. If incorporated as evidence, reuse this existing source ID; do not create another ID for the same URL. Online-retailer counts are time-sensitive and do not establish inventory. |

## Ownership and prior-work audit

The audit used the current shared-workspace snapshot: **1,842 ingredient references**, **174 ingredient forms**, **56 legacy-import candidates**, and **2,225 research-ledger records**. No shared IDs are allocated by this proposal.

| Surface | Finding |
|---|---|
| Active references and aliases | The only exact neighboring identity is `ingredient-ref-cocoa-loops-cereal` (`Cocoa Loops cereal / Céréales Cocoa Loops`), with empty aliases. No exact Froot Loops, Less Sugar, or Froot Loops with Marshmallow reference or alias is present. Do not change Cocoa Loops or `crispy rice cereal`. |
| Ingredient forms | No exact candidate title or proposal-local identity has a form owner, and no existing form term contains `Froot`, `Loops`, or the proposed product-specific phrases. No form is proposed. |
| Legacy-import identities | No Froot Loops candidate or matching English/French label is present. |
| Research ledger | No Froot Loops product identity record exists. R491’s Cocoa Loops record owns the English Froot Loops family page under `WP03-COCOA-LOOPS-R491-20261017-S01`; the All-Bran family evidence already owns the French `Où acheter` locator under `WP03-ALL-BRAN-FAMILY-R203-20261016-S03`, also reused by Cocoa Loops. The six specific English/French product-page URLs in this proposal have no exact source owner. Assign only the six proposal-local IDs S01–S06 if accepted. |
| Prior proposals | R491 added Cocoa Loops and kept it separate from Froot Loops; it did not add or decide the three sibling identities. R488’s Chex family review is a precedent for separately named sibling products, but does not determine Froot Loops aliases. R699’s Lucky Charms hold, R714’s brown-rice-puffs alias hold, and R717’s 8 Grain product portion are distinct. |

## Picker projection

Projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior: NFKD/accent folding, normalized complete word-phrase matching before substring fallback, over reference names and aliases plus attached form terms. The current form catalog has no relevant `Froot`, `Loops`, or product-specific phrase terms, and no aliases are needed for the product names. Counts below compare the active reference snapshot with the three proposal-local reference examples.

| Query | Current → projected | Result |
|---|---:|---|
| `Froot Loops` | 0 → 3 | Returns base, Less Sugar, and with Marshmallow products. |
| `Froot Loops cereal` | 0 → 1 | Returns the base product only. |
| `Froot Loops Less Sugar` | 0 → 1 | Returns the Less Sugar product only. |
| `Froot Loops with Marshmallow` | 0 → 1 | Returns the with-Marshmallow product only. |
| `Céréales Froot Loops` | 0 → 3 | Returns the three products through the shared French product-name phrase. |
| `Céréales Froot Loops Moins de sucre` | 0 → 1 | Returns the Less Sugar product only. |
| `Céréales Froot Loops avec guimauves` | 0 → 1 | Returns the with-Marshmallow product only. |
| `Cocoa Loops` | 1 → 1 | Existing Cocoa Loops result is unchanged. |
| `Loops` | 1 → 4 | Adds the three products alongside Cocoa Loops; this remains a broad brand-word query. |
| `cereal` / `céréales` | 72 / 68 → 75 / 71 | Adds three separately named cereals to each broad-language result set. |

No short `Kellogg’s`, `fruit loops`, `fruit cereal`, `marshmallow cereal`, `céréales fruitées`, or other family-wide aliases are added. The manufacturer’s wording is retained in the full displays; search terms remain product-specific and localized.

## Bundled recipe corpus and links

The manifest-ordered scan parsed all **114** bundled recipe files and **1,123** structured ingredient rows, searching recipe content and ingredient rows for `Froot Loops`, `Céréales Froot Loops`, the Less Sugar and with-Marshmallow product titles, and the three proposal-local IDs.

- Candidate-specific recipe files: **0**.
- Candidate-specific ingredient rows: **0**.
- No recipe links or ingredient-line substitutions are proposed.
- Existing crispy-rice-cereal use in recipe 040 is unrelated and remains unchanged. The manufacturer’s separate Froot Loops treat recipe is outside the bundled corpus and is not imported as a RecipeBook link or a reusable volume-to-mass measure.

## Validation and test scope

- Proposed ingredient-reference examples were checked against the current `IngredientReference` definition in `docs/schemas/full-library.schema.v1.json`; the sample ledger record was checked against `docs/catalog/research-ledger.schema.json`.
- Picker counts were projected from the active names and aliases using the current `IngredientSearch.kt` phrase-first normalization behavior. No application code was run.
- The six product-page URLs are unique within the proposal and have no exact owner in the current research ledger. Existing brand-page and French-locator evidence are explicitly reused under their current IDs.
- JSON examples use escaped French accents as required for bundled database JSON. The Markdown proposal itself is UTF-8 without BOM; its French prose and links are encoded as valid UTF-8.
- **No software tests, build, emulator, or deployment were run.** This deliverable is proposal documentation only. If the three references are later integrated as additions only to database JSON, `AGENTS.md` explicitly says software testing is not required; static schema, source-ownership, picker, corpus, encoding, and package checks remain appropriate.
