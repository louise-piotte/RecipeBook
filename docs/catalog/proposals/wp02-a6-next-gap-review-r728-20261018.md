# WP02 A6 R728 — black quinoa flour portion evidence review

## Review record

- **Status:** Proposal only. No shared catalog, ledger, recipe, checklist, roadmap, workflow, generated file, or integration record was edited.
- **Plan anchor:** The open A6 parent at [global catalog plan line 1821](../../RecipeBook-global-ingredient-catalog-plan.txt#L1821) continues flour evidence work across buckwheat, sorghum, millet, quinoa, amaranth, fonio, and other regional grains.
- **Scope:** Research one still-unreviewed measurement question on the existing `ingredient-ref-black-quinoa-flour` row. This is separate from R719's Cuisine Soleil portion for generic quinoa flour, R616's roasted quinoa flour work, R722's white-fonio cookie formula, and R725's teff-flour substitution guidance.
- **Proposal-local IDs:** `WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01` and `S02`; observation `black-quinoa-flour-naturquinoa-60-g-r728-20261018`. None is allocated in shared data.

## Bounded recommendation

Append one source-specific `portion_weight` observation to the existing black-quinoa-flour ledger row for Naturquinoa's published **60 g nutrition portion**. Set `measurementState` to `researched_no_supported_value` for a transferable generic measure: Naturquinoa's page gives a mass-only `ración` and no household volume, fill method, or generalization basis. Preserve the observation as evidence about this named product only. Keep `defaultDensity: null`, `unitMappings: []`, and the bilingual display names unchanged.

The product page concerns ordinary `Harina de Quinoa Negra`, whose ingredient is milled organic black royal quinoa. The manufacturer's catalog distinguishes that flour from its separately described *precooked* black-quinoa flour. Record no alias, French display, form, reusable measure, density, conversion, package yield, recipe link, or substitution finding. Leave `substitutionResearchState: not_yet_researched` because the usage descriptions do not provide a replacement amount or tested alternative.

The page's indexed first-party text reports nutritional information per 100 g and per `ración (60 g)`. The product page returned an anti-bot interstitial when opened during this review, so the 60 g wording is available through the search-indexed text for the manufacturer's URL; it is corroborated as the same ordinary, non-precooked product by the manufacturer's catalog PDF. Keep that access limit explicit. Do not describe the 60 g as a directly weighed household serving or a package-label panel that was independently inspected.

## Current ownership and boundaries

| Surface | Current state | R728 disposition |
|---|---|---|
| Active reference | `ingredient-ref-black-quinoa-flour`: `black quinoa flour / farine de quinoa noir`, category `FLOUR_AND_STARCH`; no aliases, null density, empty unit mappings. | Preserve the row, display names, and numeric fields. Do not add the Spanish source phrase as an English/French alias. |
| Related references | Separate generic, roasted, white, red, and black quinoa flour rows exist. `ingredient-ref-black-quinoa` is the intact black-grain row. | Keep the observation on black quinoa flour only; transfer no amount to generic/color-adjacent flours or whole grain. |
| Forms and rules | No form is attached to the black-quinoa-flour reference. Only generic whole quinoa has dry and cooked forms. The global and contextual substitution-rule files have no black-quinoa-flour link. | Add no form or rule. The source's ordinary flour is distinct from its separately named precooked flour; R728 does not allocate a new identity for that product. |
| Package yields and recipes | No package-yield record or manifest-listed recipe ingredient references the target ID. | Add no package yield or recipe link. The manufacturer's 300 g / 500 g packs are package options, not portion conversions. |
| Research ledger | Identity is `verified`; measurement and substitution are `not_yet_researched`. The row has existing identity/naming sources and decisions only; no measurement observations or substitution findings. | Add only the two R728 sources, one mass-only product portion, and a measurement decision. Keep substitution research unreviewed. |

The existing bilingual name has prior support from OQLF's preferred masculine term `quinoa` and a Canadian French certification annex that lists `farine de quinoa noir`. That annex supports product-class wording, not a consumer package. The manufacturer uses Spanish `Harina de Quinoa Negra`; the Spanish adjective agrees with *harina*. This Spanish label is not evidence for a new Québec French display or an English/French search alias. The OQLF entry supplies the Québec base term and *Chenopodium quinoa* scope, not a flour-specific portion.

## Source-backed measurement evidence and limits

Naturquinoa's first-party [black quinoa flour page](https://naturquinoa.com/harina-quinoa-negra/) names `Harina de Quinoa negra`, identifies the ingredient as ground organic black royal quinoa, and presents nutrition per 100 g and per portion of 60 g. It gives no cup, spoon, or volume, no serving-preparation instruction, and no weighing method. Treat 60 g as one declared portion for this specific manufacturer product, not as a conversion or default for the color-qualified flour category.

The manufacturer's [2020 product catalog](https://naturquinoa.com/wp-content/uploads/2020/04/CATALOGO-NQ.V6.pdf), PDF p. 5 / printed p. 11, §2.3, describes `HARINA DE QUINOA NEGRA` as flour from polished, washed, physically desaponified, classified and milled organic black royal quinoa. Its next section for treated products separately describes `HARINA PRECOCIDA DE QUINOA REAL NEGRA` as ground and cooked. This confirms the ordinary product scope and prevents treating the 60 g portion as evidence for the precooked product. The catalog lists commercial package weights but no nutrition portion or home measure for black quinoa flour.

The page's application text names bakery and pastry uses and says the product requires cooking. It supplies no formula, wheat-flour replacement percentage, or measured comparison; R728 makes no substitution claim. No volume-to-mass value is derivable from a 60 g mass-only serving. The observed value cannot support `defaultDensity`, `unitMappings`, an active measure, or a conversion.

## Bilingual names, aliases, forms, and picker projection

The active row owns the exact English query `black quinoa flour` and French query `farine de quinoa noir`; both return only the black-quinoa-flour reference. `black quinoa` / `quinoa noir` returns both the black grain and black flour. The broader `quinoa flour` / `farine de quinoa` phrase returns the generic, roasted, and white/red/black flour references. `harina de quinoa negra` currently has no English/French catalog match.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, compatibility characters and punctuation, then prefers complete word-phrase matches before substring fallback. R728 adds no alias, so all query results remain unchanged. In particular, the Spanish product title is not added as an alias, and the short grain query remains a two-result choice rather than being made flour-only. Ledger-only evidence also leaves the picker projection unchanged.

## Manifest-listed recipe scan

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Searched serialized recipe content and ingredient rows for `ingredient-ref-black-quinoa-flour`, `black quinoa flour`, `farine de quinoa noir`, `harina de quinoa negra`, and `harina quinoa negra`. Found zero file-text hits and zero ingredient-row hits. There is no bundled demand, existing recipe link, or recipe-specific amount to support another measure or conversion.

## Proposed research-ledger delta

This schema-shaped `Record` example contains only proposed R728 entries; it is not a replacement for the live record. At integration, append the two sources and observation, append the decision, and update only `measurementState`. Preserve the existing identity evidence and decision; keep all active catalog and recipe files unchanged.

```json
{
  "recordId": "ingredient-ref-black-quinoa-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01",
      "url": "https://naturquinoa.com/harina-quinoa-negra/",
      "title": "Naturquinoa, Harina de Quinoa Negra",
      "accessedOn": "2026-10-18",
      "locator": "First-party indexed product-page text: product ingredient, nutritional-value table (per 100 g / per ración 60 g), applications, and logistics. The page returned an anti-bot interstitial when opened during review.",
      "supports": "The manufacturer page describes black quinoa flour made from ground organic black royal quinoa and lists nutrition per 100 g and per ración (60 g). This supports one mass-only portion for the named Naturquinoa product; the indexed text gives no household volume or weighing method and does not establish a generic measure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S02",
      "url": "https://naturquinoa.com/wp-content/uploads/2020/04/CATALOGO-NQ.V6.pdf",
      "title": "Naturquinoa, Catálogo de productos",
      "versionOrDate": "2020 catalog",
      "accessedOn": "2026-10-18",
      "locator": "PDF p. 5 / printed p. 11, §2.3, HARINA DE QUINOA NEGRA; PDF p. 6 / printed p. 12, §3.3, HARINA PRECOCIDA DE QUINOA REAL NEGRA.",
      "supports": "The catalog describes ordinary black quinoa flour as polished, washed, physically desaponified, classified and milled organic black royal quinoa. It separately describes precooked black quinoa flour as ground and cooked. It supports the product/process boundary, not the 60 g portion or a household measure.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "black-quinoa-flour-naturquinoa-60-g-r728-20261018",
      "relationship": "portion_weight",
      "value": 60,
      "valueUnit": "g",
      "foodDescription": "Naturquinoa Harina de Quinoa Negra, made from milled organic black royal quinoa; the manufacturer's catalog distinguishes this ordinary flour from its separately named precooked flour.",
      "foodState": "Dry, as sold; manufacturer's declared nutrition portion.",
      "measurementMethod": "The manufacturer product page presents nutrition values per 100 g and per ración (60 g); it gives no household-volume or direct-weighing method.",
      "quantityBasis": "One mass-only portion stated for the named Naturquinoa product. Do not infer a cup measure, default density, or transferable portion for generic black quinoa flour.",
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Naturquinoa's declared 60 g nutrition portion as product-specific evidence on the existing black-quinoa-flour row. No volume or method supports a reusable measure, density, mapping, or conversion; keep substitution research unreviewed and active catalog data unchanged.",
      "sourceIds": [
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01",
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S02"
      ]
    }
  ]
}
```

The observation has no `sourceQuantity` because the source supplies no volume. It records the published mass only, not a package yield. The two source IDs and observation ID are proposal-local and must be rechecked for ownership at integration.

## Source ownership and review checks

The live ledger already owns identity evidence for this row under `WP02-A6-QAM-FLOUR-20261011-S01`, `S07`, `S10`, and `WP02-A6-FRWORD-20261011-S01`, `S08`; those sources cover OQLF quinoa naming and the Canadian Tootsi/OCIA product-class language, not Naturquinoa's portion. The Naturquinoa page URL and 2020 catalog PDF URL have no source owner in the live ledger. The proposed R728 IDs and observation ID have no live owner or match in the current proposal/batch archive. At integration, preserve existing source ownership and append rather than replacing those identity records.

- [x] Read the current `AGENTS.md`, relevant bilingual-reference and conversion requirements in `Requirements.md`, the open A6 plan area, recent A6 roadmap/workflow entries, current reference/forms/rules/package-yield data, target ledger record and schema, and prior quinoa flour proposals.
- [x] Verified the OQLF quinoa entry and the two first-party Naturquinoa sources online. The 60 g portion comes from the search-indexed first-party product page; its access limitation is stated above, and the manufacturer's catalog independently establishes the ordinary versus precooked product boundary.
- [x] Checked live source-ID and URL ownership, source-ID uniqueness for the R728 examples, bilingual phrase ownership, form/rule/yield links, and picker projection. No shared data or existing alias is changed.
- [x] Scanned the complete manifest-listed corpus: 114 recipes, 1,123 ingredient rows, zero target-ID or target-name matches.
- [x] Validated the proposed `Record` example against `research-ledger.schema.json`; checked UTF-8 without BOM, no mojibake, local Markdown links, and scoped whitespace.
- [x] No software tests, build, emulator, or deployment were run. This is proposal-only; the current `AGENTS.md` also exempts changes limited to database JSON additions from software tests.

The broader WP02 Section A6 review remains open.
