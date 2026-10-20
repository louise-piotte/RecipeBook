# WP02 Section 04 B3 native waxy maize starch identity review — R192

- **Reviewed:** 2026-10-16.
- **Status:** Integrated on 2026-10-16 as an identity-only reference after root source, ownership, picker, and corpus review. Added one reference and one evidence record; no recipe links or numeric behavior were added.
- **Open checklist:** “Water-chestnut flour and other documented regional starches” in the live [Section 04 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2506). The parent remains open.
- **New source-ID prefix:** `WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016`; it applies only to the three new product-source URLs. Reuse the existing R189 source IDs for the two OQLF URLs. Each source ID maps to exactly one URL.
- **Citation labels:** `OQLF-WAXY` and `OQLF-AMIDON` refer to the reused R189 source IDs; `S01`–`S03` refer to the new R192 product sources in the register.

## Recommendation

**Add identity-only native waxy maize starch / amidon de maïs cireux natif** as `ingredient-ref-native-waxy-maize-starch` in `FLOUR_AND_STARCH`. A current Canadian supplier listing names food-grade native waxy maize starch as a quote-based grade. The Office québécois de la langue française (OQLF) supports the French source-qualified phrase `amidon de maïs cireux`; “natif” carries the supplier’s native-state qualifier. No current Québec culinary package with a matched French product label was found, so the French display is descriptive and terminology-based rather than a quoted package name. [OQLF-WAXY, OQLF-AMIDON, S01, S02]

Keep the proposed identity separate from generic cornstarch, high-amylose corn starch, modified corn starch, waxy-rice starch, and whole-grain corn flour or meal. Retain one English alias, `waxy corn starch`, from the Québec retailer’s ingredient wording. Add no forms, density, unit mappings, recipe links, conversions, yields, or substitutions.

## Why this is an unreviewed gap

The B3 parent checklist remains unchecked. The focused reviews already cover adjacent but distinct identities: generic cornstarch, modified corn starch (R92), high-amylose corn starch (R123), native waxy rice starch (R189), and pregelatinized wheat starch (R187). Those records do not resolve a maize-source waxy starch identity. No exact waxy-maize candidate or focused proposal was found in the active references, forms, legacy candidates, ledger, or proposal/batch archive. R191 is already used by a WP03 proposal, so this packet uses the unused R192 identifier.

## Product boundary and bilingual wording

| Candidate phrase | Decision | Evidence and boundary |
|---|---|---|
| Native waxy maize starch | Add as a separate identity-only reference. | The Canadian supplier lists “Native waxy maize starch” as a food-grade powder and describes sauces, soups, desserts, bakery creams, and other food applications. Its grade, producer documentation, package, and availability are confirmed only by quotation; the page is not a current stock guarantee. [S01] |
| Amidon de maïs cireux natif | Use as the French display. | OQLF defines waxy starch as starch extracted from selected cereal cultivars and particularly rich in amylopectin; it says the source-qualified French phrase `amidon de maïs cireux` may be used and lists `waxy maize starch` among the English terms. OQLF prefers `amidon` generally and reserves `fécule` more specifically for starch in tubers or underground plant organs. The added `natif` reflects the supplier’s product-state qualifier, not a claim that OQLF has entered this complete compound. [OQLF-WAXY, OQLF-AMIDON] |
| Waxy corn starch | Retain as one English alias. | A Québec retailer’s XPN Waxy Maize page declares “Waxy corn starch (45 g)” as a medicinal ingredient. The page currently shows the product sold out; this is a supplement listing, not evidence of a culinary grade or available kitchen product. It supports the wording only. [S02] |
| Generic corn starch / amidon de maïs | Keep on the existing generic cornstarch reference. | The new identity is source-qualified by waxy maize and must not become a synonym for ordinary cornstarch. The shared family query will return both identities. |
| High-amylose corn starch | Keep on the existing high-amylose identity. | It is a different starch composition and already has a separate active row. Do not add high-amylose or resistant-starch wording here. |
| Modified waxy corn starch | Keep with modified corn starch. | A current Canadian supplier lists NutriTex 680 as an E1422 modified waxy corn starch and describes physical and chemical modification. Do not put modified or E1422 wording on the native row. [S03] |
| Whole waxy maize grain, corn flour, or corn meal | Keep separate from extracted starch. | Waxy variety names describe a grain source; this candidate names the extracted starch ingredient. Do not add grain-only aliases such as `waxy maize` or `waxy corn`. |

The proposed French display follows OQLF’s source-specific `amidon de maïs cireux` wording with the supplier’s `native` qualifier translated as `natif`. The reviewed Québec product page uses English wording only; it does not supply an exact French package name. Do not add generic `amidon de grains cireux`, `amidon glutineux`, `amidon de maïs`, or `fécule de maïs` as candidate aliases: the display already carries the specific phrase where appropriate, while generic terms belong to existing broader rows.

## Integrated reference row

```json
{
  "id": "ingredient-ref-native-waxy-maize-starch",
  "nameEn": "native waxy maize starch",
  "nameFr": "amidon de maïs cireux natif",
  "aliasesEn": ["waxy corn starch"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The alias `waxy corn starch` is a source-attested spelling variant and keeps the candidate visible to the broad `corn starch` picker query. Keep French aliases empty because the French display itself contains the OQLF-supported phrase `amidon de maïs cireux`. Do not add `corn starch` / `amidon de maïs`, generic `waxy starch`, `waxy maize`, `corn flour`, brands, or modified-grade names.

## Ownership, picker, and corpus audit

At the pre-integration review snapshot the bundled package had 1,571 active ingredient references, 122 forms, 61 legacy-import candidates, 1,916 ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows. The proposed ID was absent from active references, forms, legacy candidates, and ledger record IDs. Exact normalized ownership checks found no reference term for `native waxy maize starch`, `amidon de maïs cireux natif`, or `waxy corn starch`. The modified-corn ledger record discusses modified waxy products, but it is not an owner for the integrated native identity or alias.

Current neighboring rows are:

- `ingredient-ref-cornstarch`: `cornstarch / fécule de maïs`, with `corn starch` and `amidon de maïs` aliases.
- `ingredient-ref-high-amylose-corn-starch`: `high amylose corn starch / amidon de maïs à haute teneur en amylose`.
- `ingredient-ref-modified-corn-starch`: `modified corn starch / amidon de maïs modifié`.
- `ingredient-ref-native-waxy-rice-starch`: `native waxy rice starch / amidon de riz cireux natif`, kept source-qualified from rice.

The picker is implemented in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`. It normalizes terms and accents, selects complete word-phrase matches across names and aliases, and uses substring fallback only if no phrase matches. The following projection compares the pre-integration snapshot with the integrated catalog:

| Query | Before integration | After integration |
|---|---|---|
| `native waxy maize starch` | None | Native waxy maize starch |
| `waxy maize starch` | None | Native waxy maize starch |
| `waxy corn starch` | None | Native waxy maize starch |
| `corn starch` | Cornstarch; high-amylose corn starch; modified corn starch | Those three plus native waxy maize starch |
| `amidon de maïs` | Fécule de maïs; high-amylose corn starch; modified corn starch | Those three plus native waxy maize starch |
| `modified corn starch` | Modified corn starch | Modified corn starch only |
| `high amylose corn starch` | High-amylose corn starch | High-amylose corn starch only |

The canonical phrases `waxy maize starch` and `amidon de maïs cireux` occur within the integrated displays. The single English alias adds a complete `corn starch` phrase, so broad corn-starch searches include the subtype without changing the existing modified or high-amylose matches. A `waxy maize` query also finds the new starch because the picker matches phrases within longer terms; there is no waxy-maize grain row in the catalog. Recheck that query if a whole waxy-maize grain identity is later added.

The recipe corpus contains no waxy-maize or waxy-corn starch ingredient row. It has nine generic cornstarch lines across eight recipes; these establish family-level cornstarch demand only and do not imply demand for or interchangeability with the waxy subtype. No recipe link is proposed.

## Measures, density, forms, and substitutions

The available supplier page specifies a standard powder presentation but publishes no fixed package, mass-per-volume measure, density, or exact grade documentation; those details are confirmed against the quoted material. The Québec supplement’s 45 g is a medicinal-ingredient amount, not a culinary serving or a volume-to-mass observation. No reusable household measure, default density, unit mapping, form, or yield is supported. [S01, S02]

Waxy composition and product-performance descriptions do not establish a general replacement ratio for cornstarch, nor do they support replacing native starch with a chemically or physically modified waxy grade. No source-reviewed recipe formula justifies a directional substitution. `measurementObservations` and `substitutionFindings` remain empty.

## Integrated ledger mapping

The accepted reference has one `ingredient_reference` ledger record. The two OQLF source IDs are reused from R189; the three R192 product-source IDs are unique and each maps to one URL.

```json
{
  "recordId": "ingredient-ref-native-waxy-maize-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux",
      "title": "OQLF, amidon de grains cireux (GDT)",
      "versionOrDate": "Last updated 1987",
      "accessedOn": "2026-10-16",
      "locator": "Definition, note on amidon de maïs cireux, and English waxy maize starch note.",
      "supports": "Defines waxy starch as cereal starch especially rich in amylopectin and supports the source-qualified French and English naming family; it does not attest a complete product label.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S07",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
      "title": "OQLF, amidon (GDT)",
      "versionOrDate": "Last updated 2026",
      "accessedOn": "2026-10-16",
      "locator": "Preferred term and note contrasting amidon with fécule.",
      "supports": "Supports amidon for cereal starch such as maize and distinguishes the more specific tuber/underground-organ use of fécule.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S01",
      "url": "https://allzonetrading.ca/supply/waxy-starch",
      "title": "Allzone, Waxy Starch — Bulk B2B Supply",
      "accessedOn": "2026-10-16",
      "locator": "Native waxy maize starch grade, food-grade description, applications, quotation and delivery notes.",
      "supports": "Current Canadian supplier listing identifies native waxy maize starch as a food-grade powder and notes Canadian delivery coverage; it gives no fixed price, stock, package, or guaranteed availability.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S02",
      "url": "https://keysnutrition.com/en/products/waxy-maize-plain-2kg",
      "title": "Keys Nutrition, XPN Waxy Maize 2 kg",
      "accessedOn": "2026-10-16",
      "locator": "Product heading, sold-out state, medicinal-ingredient declaration, and Québec City pickup location.",
      "supports": "Attests the English phrase waxy corn starch on a Québec retailer's supplement page; the product is sold out and is not used as evidence for a culinary package, household measure, or density.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S03",
      "url": "https://www.fineberry.ca/modifiedcornstarch.html",
      "title": "Fineberry Foods, Modified Corn Starch / NutriTex 680",
      "accessedOn": "2026-10-16",
      "locator": "NutriTex 680 product description and E1422 classification.",
      "supports": "Current Canadian supplier distinguishes an E1422 physically and chemically modified waxy-corn product from the proposed native identity.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only native waxy maize starch / amidon de maïs cireux natif, retaining the unique source-attested English alias waxy corn starch. Keep it distinct from generic, high-amylose, and modified corn starch and from whole maize products. No reusable measures, recipe links, or substitutions are supported.",
      "sourceIds": [
        "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03",
        "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S07",
        "WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S01",
        "WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S02",
        "WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S03"
      ]
    }
  ]
}
```

## Source register

| Citation key | Source ID | Source | Scope and limitation |
|---|---|---|---|
| `OQLF-WAXY` | `WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03` (reused) | Office québécois de la langue française, [amidon de grains cireux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux). | Defines waxy starch as cereal starch especially rich in amylopectin; says the source-specific term `amidon de maïs cireux` may be used and notes English `waxy maize starch`. It is a terminology entry, not a product package. |
| `OQLF-AMIDON` | `WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S07` (reused) | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon). | Prefers `amidon` generally, includes cereal examples such as maize, and reserves the more specific `fécule` sense for tubers or underground organs. |
| `S01` | `WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S01` (new) | Allzone, [Waxy Starch — Bulk B2B Supply](https://allzonetrading.ca/supply/waxy-starch), Toronto/GTA, Canada. | Current quote-based listing includes a food-grade native waxy maize starch grade. It has no fixed grade documents, stock, package, or guaranteed availability; grade and producer documentation are confirmed by quotation. |
| `S02` | `WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S02` (new) | Keys Nutrition, [XPN Waxy Maize 2 kg](https://keysnutrition.com/en/products/waxy-maize-plain-2kg), Québec City pickup location. | Current product page shows the item sold out and declares `Waxy corn starch (45 g)` as a medicinal ingredient. Used for the English alias and local retail context only, not as culinary-grade, measure, or density evidence. |
| `S03` | `WP02-SECTION-04-B3-NATIVE-WAXY-MAIZE-STARCH-R192-20261016-S03` (new) | Fineberry Foods, [Modified Corn Starch / NutriTex 680](https://www.fineberry.ca/modifiedcornstarch.html), Canadian supplier. | Distinguishes a current modified waxy-corn E1422 product from the proposed native identity. It is not evidence of a native-grade package or household use. |

## Reopen conditions

- Reopen the French display if a current Canadian or Québec culinary product supplies a product-matched French label or a manufacturer-backed bilingual name; the present French display remains terminology-based.
- Reopen current availability and product scope if a supplier confirms an exact standard native grade, producer, technical sheet, and orderable package. Do not infer those details from the quote-only listing or the sold-out supplement page.
- Add a density, household measure, unit mapping, or form only if the evidence identifies the exact grade and a reproducible measurement method.
- Add a substitution only after a recipe-method-specific comparison of waxy maize starch with the proposed substitute; the nine generic cornstarch lines are not such evidence.
- Reproject `waxy maize` picker results if a whole waxy-maize grain identity is added, and review functional cold-water-swelling grades separately if exact producer documentation establishes their scope.
