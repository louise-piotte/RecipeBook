# WP03 Section F R85 — black glutinous rice identity review

## Review record

- **Reviewed:** 2026-10-13.
- **Chosen open checklist item:** “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” remains open in the [live Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2802).
- **Recommendation:** Add identity-only `black glutinous rice / riz gluant noir` as `ingredient-ref-black-glutinous-rice`, category `GRAIN_AND_CEREAL`. Add the product-attested English alias `glutinous black rice` and French alias `riz noir glutineux`.
- **Scope:** Plain, dry edible rice product that has both the black-pigmented and glutinous characteristics. The reviewed listings do not identify a cultivar or establish a universal origin, growing region, or process specification. `Glutinous` describes the rice type; it does not mean the rice contains gluten.
- **Work boundary:** Proposal only. No reference, form, ledger, plan, roadmap, recipe, generated file, or batch README was edited.

## Product identity and Québec French wording

Metro’s French listing names the Young & Young product **Riz noir glutineux**, gives a 2 kg size, identifies product number **069112274440**, and lists **Riz gluant noir** as its ingredient. Metro marked the selected item out of stock when reviewed; this supports the product and local French wording, not present availability. [S01]

Food Basics’ English listing identifies the same brand, item number, package size, and single ingredient as **Black Glutinous Rice**. Its page carries stale sale-date information, so no current price or stock claim is made. [S02]

Canadian distributor Dan-D Foods separately lists **Glutinous Black Rice** in its Rice & Other Grains category, alongside Glutinous White Rice. This supports the alternate English word order as a product phrase; its 12 × 1 kg case is wholesale packaging, not household quantity evidence. [S03]

Use `riz gluant noir` as the French display: Metro’s ingredient declaration uses that exact phrase, and OQLF’s existing `WP03-S11` source supports `riz gluant` as the Québec French term for *glutinous rice*. Metro’s product title also attests `riz noir glutineux`, retained as a French alias. The compounded display is supported by Québec retail usage but is not an OQLF ruling or a federal standardized name. The independent federal rice specification already supports the broader bilingual pair `black rice / riz noir`; it does not name this intersection. [WP03-S11, WP03-S128, WP03-S129]

IRRI reports black-rice varieties that are glutinous and others that are non-glutinous. That makes blackness and glutinous type intersecting characteristics rather than interchangeable names. Keep this qualified product separate from generic black rice and generic glutinous rice, without implying that all black rice is glutinous. [WP03-S130]

## Ownership, overlap, and live snapshot

The live snapshot read for this proposal contains **1,415 ingredient references, 104 forms, 63 legacy candidates, 1,754 ledger records, 114 manifest-listed recipe files, and 1,123 ingredient rows**. Counts were recomputed from the active files linked below.

| Existing owner | Current data | R85 boundary |
|---|---|---|
| [`ingredient-ref-black-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L1911) | `black rice / riz noir`, `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. Its [ledger record](../research-ledger.v1.json#L25497) cites the federal bilingual rice specification and IRRI’s black-rice variety distinction. | Keep the broad color identity unchanged. R85’s qualified row represents an attested intersection and does not replace it. |
| [`ingredient-ref-glutinous-rice`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L6819) | `glutinous rice / riz gluant`; English aliases `sweet rice`, `waxy rice`; French aliases `riz doux`, `riz glutineux`; no forms, density, or unit mappings. Its [ledger record](../research-ledger.v1.json#L53217) retains the separate sticky-rice wording boundary. | Keep the generic glutinous type and its aliases unchanged. Do not move the color-qualified product onto this row. |
| Rice flours and prepared rice products | Separate active rows include generic and specialty rice flours, black-rice flakes (held), puffed rice products, crispy rice cereal, and generic flattened rice. | Do not reuse the candidate name for flour, flakes, puffed grains, cereal, a prepared rice dish, or a state form. |
| Exact candidate key and names | No reference, form label/match term, ledger record ID, or legacy candidate owns `ingredient-ref-black-glutinous-rice`, `black glutinous rice`, `glutinous black rice`, `riz gluant noir`, or `riz noir glutineux`. | The proposed ID is unused. The existing generic black-rice ledger decision mentions black glutinous rice only as a separate boundary; it does not allocate or decide this product row. |
| Proposal/archive overlap | R82 reviews black-rice flakes and holds those product listings; it does not review intact black glutinous rice. The generic glutinous-rice alias review keeps `sweet rice` and `waxy rice` on the existing type row, without deciding this black-qualified intersection. The R84 whole-wheat-couscous decision is unrelated. | R85 adds a new, distinct intact-grain identity and does not reopen those decisions. |

The archive audit searched the live plan, roadmap, proposals, batch READMEs, active references, forms, legacy candidates, ledger IDs and sources, and recipe package for the proposed ID and exact candidate phrases. The earlier note under the black-rice identity says to keep black glutinous rice distinct; it is boundary evidence, not an active owner or a focused prior product review. New R85 source IDs below were checked absent from the current ledger.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files and 1,123 ingredient rows**, including serialized recipe text and ingredient rows. Exact candidate phrases, spellings, and the proposed reference ID returned **zero recipe files, zero ingredient rows, and zero reference links**. No recipe association or state form is proposed.

## Picker projection

Projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L117): normalized complete word phrases are matched before substring fallback; French accents are folded for search while display text remains unchanged.

| Query | Current picker | With proposed row |
|---|---|---|
| `black glutinous rice` | No result. | New row only. |
| `glutinous black rice` | No result. | New row only, using the source-attested English alias. |
| `riz gluant noir` | No result. | New row only. |
| `riz noir glutineux` | No result. | New row only, using Metro’s product-title wording. |
| `black rice` / `riz noir` | `ingredient-ref-black-rice` only. | Existing black-rice row plus the qualified row, through its English and French aliases. |
| `glutinous rice` / `riz gluant` | Generic glutinous-rice row and its three named flour rows. | Same four plus the qualified row. |
| `black sticky rice` / `sticky rice` | No result. | Still no result; do not activate the ambiguous `sticky rice` phrase family as an alias. |
| `rice` | Broad rice-related result set. | Same set plus one row. |

The qualified phrase remains selectable without redirecting the broad black-rice and glutinous-rice searches. The two broad search families intentionally gain the product as an additional result.

## Identity, form, measurement, yield, and substitution limits

| Dimension | Evidence and decision |
|---|---|
| **Identity** | The same Canadian grocery item is named black glutinous rice in English and lists a single matching ingredient in both language pages. The proposed row represents this intersection; it does not claim a cultivar, country of origin, or universal production method. |
| **Forms** | Add no `IngredientForm`. Black pigmentation and glutinous type are identity characteristics of this marketed rice, not dry/cooked or other preparation states. The generic black-rice and glutinous-rice rows remain independent. |
| **Measurements** | Metro and Food Basics list a 2 kg SKU; Dan-D lists a 12 × 1 kg wholesale case. These are pack sizes only. No reviewed source supplies a serving, cup, spoon, volume-to-mass relation, or transferable density. Leave `defaultDensity` null and `unitMappings` empty; add no measurement observation. |
| **Conversion and yield** | No source reports before/after cooking masses or volumes, so no dry-to-cooked conversion or cooking yield is supported. Add no conversion or package yield. |
| **Substitution** | None of the reviewed sources gives a tested replacement ratio, target dish, role, or method adjustment. Do not treat this product as a global substitute for black rice, white glutinous rice, generic glutinous rice, or another grain. Add no global or contextual rule; record `researched_no_supported_substitute`. |
| **Recipe use** | The bundled corpus contains no matching term or ingredient row. Do not add a recipe link or modify any recipe. |

## Exact prospective JSON delta

If accepted for a later integration, add one reference object and one ledger record. No forms, legacy mappings, recipe links, measures, conversions, yields, or substitution rules are part of the delta.

Reference object for `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-black-glutinous-rice",
  "nameEn": "black glutinous rice",
  "nameFr": "riz gluant noir",
  "aliasesEn": ["glutinous black rice"],
  "aliasesFr": ["riz noir glutineux"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Ledger record for `research-ledger.v1.json` (reuses the existing OQLF and federal/IRRI source IDs without allocating duplicate IDs):

```json
{
  "recordId": "ingredient-ref-black-glutinous-rice",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S01",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/riz/riz-noir-glutineux/p/069112274440",
      "title": "Metro, Riz noir glutineux Young & Young 2 kg",
      "accessedOn": "2026-10-13",
      "locator": "French product title, product number 069112274440, 2 kg package, availability notice, ingredient declaration",
      "supports": "The Québec-facing French listing names the product Riz noir glutineux and gives Riz gluant noir as the ingredient for this Young & Young SKU. The page said out of stock at review; the package size is not a household measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S02",
      "url": "https://www.foodbasics.ca/aisles/pantry/pasta-rice-beans/rice/black-glutinous-rice/p/069112274440",
      "title": "Food Basics, Black Glutinous Rice, Young & Young",
      "accessedOn": "2026-10-13",
      "locator": "English product title, brand, product number 069112274440, 2 kg package, ingredient declaration",
      "supports": "Identifies the same Canadian product number and brand as Metro’s French page, lists Black Glutinous Rice as its sole ingredient, and shows a 2 kg package. The page contains an expired sale date, so no current price or availability is inferred.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S03",
      "url": "https://www.dandpak.ca/product/glutinous-black-rice-12-1-kg/",
      "title": "Dan-D Foods, Glutinous Black Rice 12/1 kg",
      "accessedOn": "2026-10-13",
      "locator": "Product title, Rice & Other Grains category, SKU DDPK 083800, case packsize",
      "supports": "The Canadian food distributor lists Glutinous Black Rice as a product in Rice & Other Grains, separately from Glutinous White Rice. Supports the alternate English phrase only; 12/1 kg is wholesale packaging, not a kitchen measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-S11",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux",
      "title": "OQLF, riz glutineux",
      "accessedOn": "2026-10-05",
      "locator": "Preferred terms and English equivalents",
      "supports": "Records riz gluant and glutinous rice for the glutinous rice type. It supports the base French term, not the complete black-qualified compound.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-S128",
      "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf",
      "title": "Government of Canada, Food Quality Specifications — Rice (English)",
      "accessedOn": "2026-10-07",
      "locator": "FQS-22-02, Black Rice",
      "supports": "Names the broader black-rice food product and gives Indonesian black rice and Thai jasmine black rice as examples. It does not say all black rice is glutinous.",
      "sourceKind": "other",
      "versionOrDate": "2018-04-01"
    },
    {
      "sourceId": "WP03-S129",
      "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf",
      "title": "Government of Canada, Spécifications sur la qualité des aliments — Riz (français)",
      "accessedOn": "2026-10-07",
      "locator": "SQA-22-02, Riz noir",
      "supports": "Uses riz noir as the French label for the broader black-rice class; it does not name the black-glutinous intersection.",
      "sourceKind": "other",
      "versionOrDate": "2018-04-01"
    },
    {
      "sourceId": "WP03-S130",
      "url": "https://ricetoday.irri.org/innovators-in-rice-science/",
      "title": "International Rice Research Institute, Innovators in rice science",
      "accessedOn": "2026-10-07",
      "locator": "Black-rice variety discussion",
      "supports": "Reports black-rice varieties that include both glutinous and non-glutinous types; supports keeping this qualified product separate from the broad black-rice and glutinous-rice identities.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add black glutinous rice / riz gluant noir as an identity-only GRAIN_AND_CEREAL reference for the source-attested intersection product. Add only the source-attested English and French word-order aliases. Keep it distinct from generic black rice, generic glutinous rice, glutinous white rice, flour, prepared dishes, and other rice products. Add no forms, measurements, conversions, yields, recipe links, or active substitutions.",
      "sourceIds": [
        "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S01",
        "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S02",
        "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S03",
        "WP03-S11",
        "WP03-S128",
        "WP03-S129",
        "WP03-S130"
      ]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "black-glutinous-rice-general-substitution-20261013",
      "researchState": "researched_no_supported_substitute",
      "context": "Black glutinous rice as a replacement for generic black rice, generic glutinous rice, glutinous white rice, or another grain.",
      "basis": "The reviewed sources define a distinct rice product but give no tested replacement ratio, target dish, role, or method adjustment.",
      "limitations": [
        "Do not infer equivalence from shared rice identity, black color, or glutinous type.",
        "No global or contextual substitution rule is supported."
      ],
      "rejectedCandidates": [
        {
          "candidate": "Use black glutinous rice as a general substitute for black rice, glutinous rice, or another grain.",
          "reason": "No reviewed source tests a ratio or scoped culinary replacement.",
          "sourceIds": [
            "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S01",
            "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S02",
            "WP03-S130"
          ]
        }
      ],
      "sourceIds": [
        "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S01",
        "WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S02",
        "WP03-S130"
      ]
    }
  ]
}
```

The existing [black-rice record](../research-ledger.v1.json#L25497), [glutinous-rice record](../research-ledger.v1.json#L53217), and [ledger schema](../research-ledger.schema.json) supply the referenced base evidence and record shape. Any later change limited to new database JSON data needs no app tests under [AGENTS.md](../../../AGENTS.md#L21); this proposal review runs no app tests or emulator.

## Static review record

Checks completed on this proposal file:

- UTF-8 decode, no BOM, no replacement character or known mojibake markers, final newline, and no trailing whitespace: **passed**.
- Parsed both JSON snippets. The reference object has the live reference key shape and a category present in the active catalog; the ledger record validates against `research-ledger.schema.json`: **passed**.
- Candidate ID is unused across references, forms, ledger records, and legacy candidates. All three new R85 source IDs are unique and absent from the live ledger; reused source IDs exist and source IDs are unique within the proposed record: **passed**.
- Local Markdown targets and line anchors: **10 local targets resolved; all anchors in range**. All seven direct HTTP(S) source URLs in the JSON delta have valid URL syntax: **passed**.
- Whitespace review: custom trailing-whitespace scan found none. `git diff --check` does not include the untracked proposal file; the proposal was checked directly instead.
- Only this unique R85 proposal file was created by this review. No app tests or emulator checks were run.
