# WP04 Section P — European flat oyster identity and product boundary (R139)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** European flat oyster, *Ostrea edulis*; preferred Québec French **huître plate**.
- **Recommendation:** Add one identity-only `PROTEIN` reference. Keep the existing generic fresh-oyster candidate unresolved and keep the Olympia-oyster hold separate.
- **Scope:** The English display follows the OQLF translation **European flat oyster**; the French display uses the OQLF preferred term **huître plate**. Add only the qualified CFIA/OQLF English alternate **European oyster** as an alias. Do not alias bare `oyster`/`huître`, the supplier-specific `Belon` label, or the Latin name.
- **Data boundary:** The Canadian supplier lists a fresh, France-origin item with a case count and size band. Those are product-specific details, not kitchen portions, transferable count-to-weight evidence, or reusable forms. No form, measurement, yield, conversion, recipe link, or substitute is proposed.
- **Write scope:** This proposal changes no shared catalog JSON, research ledger, generated file, plan, roadmap, or batch file. No app or Gradle tests were run; this review is proposal-only.

## Candidate selection and ownership audit

The active Section P parent is **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.”** in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5340). Recent oyster decisions are separate: R130 integrated Pacific oyster, R131 integrated Eastern oyster, R135 held Olympia oyster because its exact English common name is shared across taxa, and R137 integrated Kumamoto oyster. The R138 Japanese sea-cucumber work is outside this oyster review. This proposal selects *O. edulis*, which is not one of those identities.

The live snapshot contains **1,493 ingredient references**, **113 ingredient forms**, **61 legacy-import candidates**, and **1,838 research-ledger records** (**7,704 source entries**). The bundled manifest lists **114 recipes**. Exact normalized ownership checks across reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs found no owner for:

- `ingredient-ref-european-flat-oyster`;
- `European flat oyster`, `European oyster`, `flat oyster`, or `huître plate`;
- *Ostrea edulis* or `Belon`.

The proposal ID and source prefix `WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015` were also checked against the current reference, form, legacy, ledger, proposal, and batch data; no allocation or source-prefix collision was found. Archive phrase matches for `huître plate` were only the distinct Olympia review’s **huître plate du Pacifique** wording. No earlier *O. edulis* identity review was found.

The generic `ingredient-ref-fresh-oyster` remains an unresolved ledger candidate (`needs_clarification`), not an active reference. This species-specific addition would not resolve that generic candidate or attach a species to unqualified oyster wording. Existing dried oyster, Pacific oyster, Eastern oyster, Kumamoto oyster, oyster sauces, and oyster-named mushrooms remain separate.

## Identity, Canadian naming, and Québec French

The OQLF GDT entry is the strongest Québec terminology source: its preferred term is **huître plate**, it links that entry to English **European flat oyster** and Latin *Ostrea edulis*, and its English translations also include **European oyster** and **flat oyster**. The entry is in the food / edible-mollusk domain and notes **“Nom d'une espèce halieutique à potentiel commercial au Québec.”** It was last updated in 2012. That note establishes Québec commercial potential as terminology context; it does not establish a present local fishery or a current Québec retailer listing. The GDT also says **belon** and **huître belon** were not retained by the fish-products terminology committee. [S01]

CFIA's Fish List associates TSN 79885 and *Ostrea edulis* with **European Oyster / Huître Plate**, in addition to generic **Oyster** and **Edible Oyster / Huître** rows. The adjacent *Ostrea lurida* rows include **Olympia Oyster** and generic **Oyster / Huître**. This table is a Canadian food common-name resource; CFIA's labeling guidance says its listed names are considered acceptable and recommends their use. The exact Fish List wording is **European Oyster / Huître Plate**; the app display **European flat oyster** is the OQLF English translation, not a claim that CFIA lists that exact string. [S02–S03]

The sources support a clear distinction between the preferred Québec species name and a supplier’s item name:

- **Québec terminology:** OQLF supports **huître plate** for *O. edulis*, with English **European flat oyster**. It also rejects **belon** / **huître belon** as retained fish-product terminology. [S01]
- **Canadian product listing:** Seafood Depot, whose contact address is in Vaughan, Ontario, lists **Belon Oysters — Ostrea edulis**. The page says the item is **Fresh**, **Harvested in France**, **Product of France**, **100 count per case**, and **1.5–3.5 inches in size**, with availability “weather permitting.” This is direct Canadian-supplier evidence for a France-origin human-food product listing, not proof of Canadian harvest, a Québec seller’s inventory, or guaranteed stock on the access date. [S04]

Do not add `Belon` or `Belon oysters` as aliases. The supplier’s species-specific SKU proves that this vendor uses that name for an *O. edulis* item; the OQLF entry separately records that **belon** terminology was not retained by the fish-products terminology committee. Keep the vendor wording as source context rather than making it the app-wide species label. Do not add scientific-name aliases: the binomial is documented evidence, not a user-facing market term in this catalog.

## Picker projection and alias boundary

Projection uses the current `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: exact normalized word-phrase matching first, then substring fallback, with current reference display names/aliases and form labels/match terms. The proposal adds the bilingual display plus one sourced English alternate. The table reports unique reference results, not duplicate form matches.

| Query | Current results | With proposed row | Interpretation |
|---|---:|---:|---|
| `oyster` | 8 | 9 | Broad English search remains multi-result. |
| `oysters` | 4 | 4 | No unsourced plural alias is added; query remains multi-result. |
| `huître` | 6 | 7 | Broad Québec French search remains multi-result. |
| `huîtres` | 6 | 6 | No unsourced plural alias is added; query remains multi-result. |
| `European flat oyster` | 0 | 1 | Exact OQLF English display resolves to *O. edulis*. |
| `European oyster` | 0 | 1 | Exact CFIA/OQLF qualified alternate resolves to the same species. |
| `flat oyster` | 0 | 1 | OQLF lists this translation; it is a phrase within the English display, not an additional alias. |
| `huître plate` | 0 | 1 | Exact OQLF preferred Québec term and CFIA French common name resolve to *O. edulis*. |
| `Belon` / `Belon oysters` | 0 | 0 | Vendor item wording is intentionally excluded from aliases. |
| `Ostrea edulis` | 0 | 0 | Scientific name remains out of picker terms. |

Do not alias bare `oyster`, `oysters`, `huître`, `huîtres`, or other broad oyster names. Each broad query stays a multiple-choice search after the row is proposed. The Olympia hold remains a separate source-conflict decision; if it is reconsidered later, re-run phrase matching for `huître plate` against its proposed qualified names before integration.

## Manifest recipe demand

The complete manifest-listed corpus was scanned: **114 recipe files and 1,123 ingredient rows**. The scan read only each ingredient row’s `ingredientName` and `originalText` fields. It did not count recipe titles, instructions, descriptions, tags, or text outside ingredient rows as ingredient demand. Search terms covered *Ostrea edulis*, European flat/European/flat oyster wording, `huître plate(s)`, `Belon`, and broad oyster/huître wording.

**Result: zero matching recipe files and zero matching ingredient rows** across those terms. The bundle does not currently request this species or generic fresh oysters. Do not attach a recipe link or relink a generic oyster ingredient.

## Product state, forms, measures, and substitutions

Seafood Depot’s listing reports one item as fresh, France-origin, 100 per case, and 1.5–3.5 inches. Those details are scoped to that product page. A case count is not a recipe serving amount, and a size range is not a count-to-mass observation. The listing does not provide mass per oyster, package net mass, edible yield, shell-on-to-meat yield, or a standardized culinary measure. It also does not explicitly define a reusable `fresh` or `in-shell` ingredient form. Add no form, amount, density, unit mapping, package yield, measurement observation, or conversion; use ledger state `researched_no_supported_value`.

No manifest recipe or reviewed source supplies a contextual comparison, quantity, dish role, or method supporting substitution between this species and Pacific oyster, Eastern oyster, Kumamoto oyster, or another ingredient. Add no global form conversion, contextual substitution, warning, or recipe-line link; use ledger state `researched_no_supported_substitute`.

## Recommendation and exact proposal JSON

Add an identity-only `PROTEIN` reference for **European flat oyster / huître plate**. Retain only the source-backed, species-qualified English alias `European oyster`. Keep the generic fresh-oyster candidate unresolved, the Olympia hold separate, and broad oyster / huître terms out of aliases. Do not convert the Canadian supplier’s SKU details into shared forms or measurements.

### Ingredient reference

```json
{
  "id": "ingredient-ref-european-flat-oyster",
  "nameFr": "hu\u00eetre plate",
  "nameEn": "European flat oyster",
  "aliasesFr": [],
  "aliasesEn": [
    "European oyster"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

### Research-ledger record

```json
{
  "recordId": "ingredient-ref-european-flat-oyster",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199091/huitre-plate",
      "title": "Office québécois de la langue française, GDT, huître plate",
      "versionOrDate": "Last updated 2012",
      "accessedOn": "2026-10-15",
      "locator": "Preferred-term, linked English/Latin records, note, and English translation fields.",
      "supports": "In the food / edible-mollusk domain, designates huître plate as the preferred Québec term, links it to European flat oyster and Ostrea edulis, and lists European oyster and flat oyster as English translations. Notes commercial potential in Québec. Says belon and huître belon were not retained by the fish-products terminology committee.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, CFIA Fish List output for Ostrea edulis",
      "accessedOn": "2026-10-15",
      "locator": "Rows for TSN 79885: Ostrea edulis, European Oyster / Huître Plate, and generic Oyster / Edible Oyster / Huître entries.",
      "supports": "Associates TSN 79885 and Ostrea edulis with European Oyster / Huître Plate. The same taxon also has generic Oyster / Edible Oyster / Huître entries; nearby Ostrea lurida rows also carry generic Oyster / Huître. This source is the CFIA Fish List common-name output, not an app alias list.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S03",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish",
      "title": "Canadian Food Inspection Agency, Labelling requirements for fish and fish products",
      "accessedOn": "2026-10-15",
      "locator": "Common name and CFIA Fish List guidance sections.",
      "supports": "CFIA says Fish List names are considered acceptable common names and their use is recommended; it says the list associates each species with a TSN and related hazards. This supports interpreting S02 as common-name guidance and does not claim that European flat oyster is the exact Fish List wording.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S04",
      "url": "https://www.seafooddepot.ca/product-belon2",
      "title": "Seafood Depot, Belon Oysters",
      "accessedOn": "2026-10-15",
      "locator": "Product title and binomial; characteristics, availability note, and Vaughan contact address.",
      "supports": "Lists Belon Oysters / Ostrea edulis. The page says the item is fresh, harvested in France, product of France, 100 count per case, 1.5–3.5 inches in size, and available weather permitting; the supplier contact address is in Vaughan, Ontario. This is Canadian-supplier product evidence, not a stock guarantee or Québec retailer listing. Its count and size are SKU-specific and do not support a reusable culinary measure or yield.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only European flat oyster / huître plate for Ostrea edulis, with the source-backed qualified English alternate European oyster. Keep Belon as supplier-specific wording, broad oyster / huître terms out of aliases, the generic fresh-oyster candidate unresolved, and the Olympia decision separate.",
      "sourceIds": [
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S01",
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S02",
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S03",
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S04"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "No reusable kitchen measure, edible yield, ingredient form, or species substitution is supported. Keep the supplier’s fresh state, case count, and shell-size range as listing-specific evidence only; add no measurement observation, form, density, unit mapping, conversion, package yield, or substitution finding.",
      "sourceIds": [
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S01",
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S02",
        "WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S04"
      ]
    }
  ]
}
```

## Static review record

- Confirmed active reference, form, legacy, ledger, proposal, and batch ownership before drafting; verified the generic fresh-oyster candidate remains separate.
- Mirrored current picker normalization, phrase matching, and substring fallback across the current 1,493-reference / 113-form snapshot; broad queries remain multi-result.
- Scanned only manifest-listed recipe ingredient-row `ingredientName` and `originalText` fields; all 114 files / 1,123 rows were included and candidate-specific as well as broad oyster terms returned zero rows.
- Reviewed the proposed ledger record against `docs/catalog/research-ledger.schema.json`; it contains no measurement observations or substitution findings and marks both research states explicitly.
- This file is the only intended output of R139. No app, unit, instrumentation, emulator, or Gradle tests were run.
