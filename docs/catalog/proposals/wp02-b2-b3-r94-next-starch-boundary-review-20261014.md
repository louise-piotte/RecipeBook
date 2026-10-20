# WP02 B2/B3 R94 — modified tapioca starch identity review

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as an identity-only modified-tapioca-starch reference with source-specific ledger evidence. See the [R94 batch README](../batches/wp02-b3-modified-tapioca-starch-identity-integration-20261014/README.md). The proposal's ownership snapshot below predates integration.
- **Open checklist line:** `[ ] Cassava flour, tapioca starch, sweet/sour tapioca starch or polvilho, potato flour, potato starch, arrowroot, kudzu/kuzu, and sweet-potato starch.` The open B2/B3 checklist also continues to include documented starch products.
- **Scope:** Review source-qualified modified tapioca starch as an identity distinct from ordinary extracted tapioca starch, the recently added modified pea and modified corn starch identities, and specific commercial grades.
- **Recommendation:** Add one `FLOUR_AND_STARCH` reference, one source-specific cup/weight observation, and one recipe-specific substitution finding. Keep density, reusable unit mappings, forms, recipe links, conversions, yields, and active substitution rules empty.
- **Source-ID prefix:** `WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94`; no collision was found in the active ledger, proposal files, or active reference IDs.

## Recommendation and boundary

**Add `modified tapioca starch / amidon de tapioca modifié` as a separate identity.** Current Canadian and Québec evidence distinguishes modified tapioca starch from ordinary tapioca starch in ingredient declarations. The Québec French wording is supported by current food-label examples and OQLF terminology: use `amidon de tapioca modifié` as the display name and retain `fécule de tapioca modifiée` as a source-attested French alias. The general identity does not name a particular chemical treatment, brand, degree of pregelatinization, or functional grade. [S01–S06]

The current base reference, `ingredient-ref-tapioca-starch`, is `tapioca starch / fécule de manioc`, with English alias `manioc starch`, no French aliases, null density, and no unit mappings. OQLF defines `fécule de manioc` as wet-extracted starch from manioc roots and lists `tapioca starch` among its English terms. Modified tapioca starch is a separately labeled ingredient in current Québec products, so it should not be folded into the base row as an alias or a form. [S03–S05]

Do not add unqualified `modified starch / amidon modifié`, `modified food starch`, `modified cassava starch`, `modified manioc starch`, `modified tapioca flour`, brand names such as `Expandex`, E-numbers, or process terms such as `pregelatinized` as aliases. The common-name rule calls for a plant-qualified name for modified starch, and neither the checked product labels nor manufacturer specification establish these broader terms as interchangeable consumer synonyms for this row. The current Canadian specification covers one particular pregelatinized grade; the recipe evidence shows different replacement behavior across formulas. [S01, S05–S08]

## Product identity and Québec French

The CFIA's current incorporated common-name table separates ordinary starch from modified starch: ordinary starch uses the plant name plus “starch,” while modified starch uses “modified” plus the plant name plus “starch.” A Canadian manufacturer specification for NATIONAL 104 likewise identifies a pregelatinized modified starch derived from tapioca and gives its Canadian label as “Modified Tapioca Starch.” This supports an identity for the source-qualified modified product while leaving treatment and grade unspecified in the general catalog row. [S01, S06]

OQLF's 2026 entry gives `amidon` as the preferred general French term and says `fécule` is used more specifically for starch in tubers or underground plant organs. OQLF's entry for `fécule de manioc` describes the extracted cassava-root product and lists `tapioca starch` as an English equivalent. Abbott's Canadian French product sheet uses `amidon de tapioca modifié`; the Québec Food Directory also lists the ingredient in English on a current Québec product page. Kozy Shack's Canadian French label uses `fécule de tapioca modifiée` separately from `Tapioca`. Use the source-attested `amidon` phrase as the display and keep `fécule` as a search alias. [S02–S05, S09]

The sources support the ingredient name, not a single market-wide grade. Québec directory entries and manufacturer labels are declarations for finished products, not specifications for standalone starch packages. NATIONAL 104 is one food-service grade with defined freeze/thaw, heat, acid, and shear properties. Do not imply those properties apply to every modified tapioca starch. [S04–S06]

## Recommended reference delta

Add this row to `ingredient-references.v1.json` if the proposal is accepted:

```json
{
  "id": "ingredient-ref-modified-tapioca-starch",
  "nameEn": "modified tapioca starch",
  "nameFr": "amidon de tapioca modifié",
  "aliasesEn": [],
  "aliasesFr": ["fécule de tapioca modifiée"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not change `ingredient-ref-tapioca-starch` or add an ingredient form. Keep the new row distinct from ordinary tapioca starch and from modified pea and corn starch. Do not add general treatment variants or plant-name translations without direct evidence that they are used as names for this food ingredient.

## Recommended research-ledger delta

Add one `ingredient_reference` record for `ingredient-ref-modified-tapioca-starch`. The observation preserves one recipe's published portion; it is not an active measure or a density value. The substitution finding is limited to the cited sopapillas recipe and does not create a reusable rule.

```json
{
  "recordId": "ingredient-ref-modified-tapioca-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S01",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components",
      "title": "CFIA — Common Names for Ingredients and Components",
      "accessedOn": "2026-10-14",
      "locator": "Table 1, items 20–21; page last amended 2026-02-11.",
      "supports": "Current Canadian common-name construction distinguishes ordinary starch from modified starch and names the plant source.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
      "title": "OQLF — amidon (Grand dictionnaire terminologique)",
      "accessedOn": "2026-10-14",
      "locator": "Preferred term, usage note, and English translation; last updated 2026.",
      "supports": "`Amidon` is the preferred general term; `fécule` is used more specifically for starch in tubers or underground plant organs.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc",
      "title": "OQLF — fécule de manioc (Grand dictionnaire terminologique)",
      "accessedOn": "2026-10-14",
      "locator": "Definition and English terms; entry cites AFNOR 1979.",
      "supports": "Defines wet-extracted manioc-root starch and lists manioc starch, cassava starch, and tapioca starch as English terms; tapioca flour is marked obsolete.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S04",
      "url": "https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202941",
      "title": "Québec Food Directory — Coconut Milk Vegan Delight Raspberry and Blackcurrant",
      "accessedOn": "2026-10-14",
      "locator": "English ingredient declaration; last updated 2026-02-11.",
      "supports": "A current Québec product declaration lists modified tapioca starch as an ingredient, separately from native corn starch and other ingredients. This supports Québec-market product use, not the French display wording.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S05",
      "url": "https://www.kozyshack.ca/fr-ca/products/simply-well/simply-well-tapioca-pudding",
      "title": "Kozy Shack Canada — Pouding au tapioca Simply Well",
      "accessedOn": "2026-10-14",
      "locator": "French ingredient declaration; page footer © 2026.",
      "supports": "The French list names `Tapioca` and `Fécule de tapioca modifiée` as separate ingredients, supporting the exact alias and product boundary.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S06",
      "url": "https://www.ingredion.ca/content/dam/ingredion/technical-documents/na/NATIONAL%20104%20-%2012151301%20Technical%20Specification.pdf",
      "title": "Ingredion Canada — NATIONAL 104 Technical Specification",
      "versionOrDate": "Effective 2026-05-08; next review 2029-05-08.",
      "accessedOn": "2026-10-14",
      "locator": "Product description and regulatory data: source tapioca, Canadian label `Modified Tapioca Starch`.",
      "supports": "One current Canadian food-grade product is pregelatinized modified starch derived from tapioca; its documented functional properties are grade-specific.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S07",
      "url": "https://glutenfreeonashoestring.com/gluten-free-sopapillas/",
      "title": "Nicole Hunn — Gluten Free Sopapillas",
      "versionOrDate": "Updated 2025-01-16.",
      "accessedOn": "2026-10-14",
      "locator": "Ingredient list and recipe notes.",
      "supports": "The formula lists 1/4 cup (36 g) Expandex modified tapioca starch and says regular tapioca starch/flour can replace it in an equal amount in this recipe, with harder dough handling.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S08",
      "url": "https://glutenfreeonashoestring.com/wp-content/uploads/2024/11/Troubleshooting-Guide.pdf",
      "title": "Nicole Hunn — Gluten-Free Bread Troubleshooting Guide",
      "versionOrDate": "PDF published 2024-11.",
      "accessedOn": "2026-10-14",
      "locator": "Page 4, question on replacing Expandex in Bakes Bread recipes.",
      "supports": "The author says regular tapioca starch does not replace modified tapioca starch in the Bakes Bread recipes and notes that Ultratex products differ in strength from Expandex.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S09",
      "url": "https://www.nutrition.abbott/content/dam/an/abbottnutrition-global/ca/fr/products/similac-alimentum-237-ml-pret-a-servir/Similac-Alimentum-237-mL-pr%C3%AAt-%C3%A0-servir-fr.pdf",
      "title": "Abbott Nutrition Canada — Similac Alimentum 237 mL, French product information",
      "versionOrDate": "Copyright 2024",
      "accessedOn": "2026-10-14",
      "locator": "Page 2, French ingredient list: `Amidon de Tapioca Modifié`.",
      "supports": "A Canadian French manufacturer product sheet uses the exact proposed display phrase for a tapioca-derived modified starch in one finished formula. It does not specify modification chemistry or a general ingredient grade.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "expandex-sopapillas-quarter-cup-36g-r94",
      "relationship": "portion_weight",
      "value": 36,
      "valueUnit": "g",
      "foodDescription": "Expandex modified tapioca starch in Nicole Hunn's Gluten Free Sopapillas recipe.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup"
      },
      "observedMassG": 36,
      "quantityBasis": "One recipe-specific portion for the Expandex product; not a general measure for all modified tapioca starches.",
      "measurementMethod": "Published recipe ingredient listing; cup convention and filling or leveling method are not stated.",
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S07"]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "expandex-to-regular-tapioca-sopapillas-r94",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-modified-tapioca-starch",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-tapioca-starch"
        }
      ],
      "context": "Only Nicole Hunn's Gluten Free Sopapillas recipe; the formula calls for 1/4 cup (36 g) Expandex modified tapioca starch.",
      "basis": "The author says regular tapioca starch/flour may replace Expandex in an equal amount in this formula; the dough will be more difficult to handle but the recipe will still work.",
      "limitations": [
        "The recipe note does not clarify whether `equal amount` means equal volume or equal mass. Record no replacement quantity and do not create a reusable rule.",
        "This is one recipe-specific outcome for Expandex and the author's dough method; it does not establish interchangeability with all modified tapioca starch grades.",
        "The same author explicitly rejects regular tapioca starch as a replacement for modified tapioca starch in the Bakes Bread recipes; substitution behavior is recipe-specific.",
        "No form conversion, recipe link, global substitution rule, or contextual rule is proposed."
      ],
      "sourceIds": [
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S07",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S08"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add modified tapioca starch / amidon de tapioca modifié as a source-qualified identity separate from ordinary tapioca starch. Retain one brand-specific published portion and one recipe-specific replacement as evidence only; keep density, reusable unit mappings, forms, recipe links, conversions, yields, and active substitution rules empty because grade and recipe behavior are not generalizable.",
      "sourceIds": [
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S01",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S02",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S03",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S04",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S05",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S06",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S07",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S08",
        "WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S09"
      ]
    }
  ]
}
```

The proposed `measurementState` is `researched_supported` because the ledger retains a documented, source-specific portion. It does **not** mean the catalog has a default density or reusable cup conversion: the reference remains `defaultDensity: null` with `unitMappings: []`. No unit conversion is proposed.

## Current ownership and picker projection

The current reference catalog has **1,426 references**, **105 forms**, and **1,766 ledger records**; the legacy import file contains **63 candidates**. Exact ownership checks across reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs found no owner for the proposed ID, qualified English/French names, or French alias. The existing tapioca-starch row remains the sole owner of `tapioca starch`, `fécule de manioc`, and `manioc starch`. There are no current tapioca/manioc forms. [current package; `IngredientSearch.kt`]

The picker normalizes case, accents, ligatures, punctuation, and spacing. It returns complete contiguous word-phrase matches before substring matches. The new display name therefore also matches the phrase `tapioca starch`; adding the row broadens that query while the source-qualified phrase still identifies the new row alone.

| Query | Current picker results | Results with proposed row |
|---|---|---|
| `modified tapioca starch` | None | `ingredient-ref-modified-tapioca-starch` |
| `amidon de tapioca modifié` | None | `ingredient-ref-modified-tapioca-starch` |
| `fécule de tapioca modifiée` | None | `ingredient-ref-modified-tapioca-starch` |
| `tapioca starch` | `ingredient-ref-tapioca-starch` | `ingredient-ref-tapioca-starch`; `ingredient-ref-modified-tapioca-starch` |
| `tapioca` | `ingredient-ref-brazil-tapioca-granulada`; `ingredient-ref-tapioca-pearls`; `ingredient-ref-tapioca-starch` | Those three plus `ingredient-ref-modified-tapioca-starch` |
| `fécule de manioc` / `manioc starch` | `ingredient-ref-tapioca-starch` | `ingredient-ref-tapioca-starch` |
| `modified starch` / `amidon modifié` | None | None |

Do not add `modified tapioca starch` as an alias on ordinary tapioca starch: that would collapse two current product names into one result and erase the modified-product boundary.

## Recipe demand, measurements, and substitutions

All **114** manifest-listed recipe JSON files and **1,123** ingredient rows were scanned. There were no recipe-text or ingredient-line hits for modified tapioca starch, its French names, Expandex, tapioca starch, tapioca, or manioc. No bundled recipe link, recipe-driven alias, or immediate in-library demand supports this addition.

For household measures, Nicole Hunn's 2025 sopapillas recipe lists `1/4 cup (36 g)` Expandex modified tapioca starch. This is a useful exact published portion for that brand and formula, so preserve it as a `portion_weight` observation. The page does not state the cup convention, filling method, or leveling method, and it does not support a density for modified tapioca starch as a category. Ingredion's current Canadian NATIONAL 104 specification supplies grade and package details but no kitchen spoon/cup mass, mass/volume pair, or density. Keep active `defaultDensity` null and `unitMappings` empty. [S06–S07]

Substitution evidence is recipe-specific and conflicting across formulas. The sopapillas author says regular tapioca starch/flour may replace Expandex in that recipe in an equal amount, with harder dough handling. The same author's Bakes Bread troubleshooting guide says regular tapioca starch does not replace modified tapioca starch in those bread recipes and describes different strengths among modified products. Record the one supported sopapillas finding with no replacement quantity; do not generalize it to other formulas, brands, grades, or active rules. [S07–S08]

## Source register and limitations

All sources were checked on **2026-10-14**. The French CFIA page could not be fetched in this review; the current English CFIA table was accessible, and the proposed French display and alias are independently attested in Québec French product declarations and OQLF terminology. The Québec Food Directory reports company-provided label data and warns MAPAQ is not responsible for its accuracy. Manufacturer and recipe sources establish particular products and formulas, not universal grade behavior.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S01** | CFIA, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), Table 1 items 20–21; last amended 2026-02-11. | Establishes Canadian source-naming construction, not a particular modification chemistry, product grade, or household measure. The French page was not directly fetched during this review. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S02** | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), last updated 2026. | Supports preferred general headword and contextual use of `fécule`; does not name modified tapioca starch as a product. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S03** | OQLF, [fécule de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc). | Defines wet-extracted manioc starch and English equivalents; source entry cites AFNOR 1979 and is not about modified starch. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S04** | Québec Food Directory, [Coconut Milk Vegan Delight Raspberry and Blackcurrant](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202941), English ingredient list; last updated 2026-02-11. | Confirms modified tapioca starch in a current Québec-market product, not French wording or a standalone starch specification; the directory says MAPAQ does not verify company-provided information. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S05** | Kozy Shack Canada, [Pouding au tapioca Simply Well](https://www.kozyshack.ca/fr-ca/products/simply-well/simply-well-tapioca-pudding), French ingredient list. | Supports the exact alias `fécule de tapioca modifiée` and separation from `Tapioca` in one Canadian product label; does not establish ingredient quantities or grade equivalence. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S06** | Ingredion Canada, [NATIONAL 104 Technical Specification](https://www.ingredion.ca/content/dam/ingredion/technical-documents/na/NATIONAL%20104%20-%2012151301%20Technical%20Specification.pdf), effective 2026-05-08. | Names one pregelatinized modified tapioca product and grade properties; its 50 lb commercial package and technical data do not provide household measuring evidence. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S07** | Nicole Hunn, [Gluten Free Sopapillas](https://glutenfreeonashoestring.com/gluten-free-sopapillas/), updated 2025-01-16. | One author's formula gives 1/4 cup (36 g) Expandex and a one-recipe replacement note. It does not describe a general measure or clarify whether “equal amount” means equal volume or mass. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S08** | Nicole Hunn, [Gluten-Free Bread Troubleshooting Guide](https://glutenfreeonashoestring.com/wp-content/uploads/2024/11/Troubleshooting-Guide.pdf), page 4. | Author-reported Bakes Bread guidance; it is limited to that recipe collection and does not establish a general modified-starch equivalence standard. |
| **WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S09** | Abbott Nutrition Canada, [Similac Alimentum 237 mL — French product information](https://www.nutrition.abbott/content/dam/an/abbottnutrition-global/ca/fr/products/similac-alimentum-237-ml-pret-a-servir/Similac-Alimentum-237-mL-pr%C3%AAt-%C3%A0-servir-fr.pdf), copyright 2024. | Uses the exact French display phrase in a Québec-made infant-formula product; supports product naming, not a general grade, household measure, or use case. |

## Static checks actually run

- Read the open WP02 B2/B3 checklist and roadmap state, the current reference/form/ledger/legacy files, prior WP02 B2/B3 proposals and integrations, and `IngredientSearch.kt`.
- Parsed current package data: **1,426 references, 105 forms, 1,766 ledger records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows**.
- Compared exact normalized ownership for proposed names and aliases across active references, forms, legacy candidates, and ledger IDs; found no collision. Checked the R94 source-ID prefix in the current ledger and proposal files; found no collision.
- Mirrored the picker normalization and complete-phrase-first logic for proposed queries. Qualified phrases return the proposed row alone; `tapioca starch` returns ordinary plus modified starch; `tapioca` gains the proposed row alongside the three current tapioca-related references; unqualified modified-starch queries remain empty.
- Parsed every manifest-listed recipe JSON and scanned full recipe text and ingredient rows; found no tapioca/manioc or modified-tapioca demand in the 114-file, 1,123-row bundle.
- No app, Gradle, instrumentation, or emulator tests were run: this is a proposal-only review and the parent explicitly requested no app tests.

This proposal addresses one source-qualified identity within the still-open WP02 B2/B3 checklist. It does not complete the broader flour-and-starch review.
