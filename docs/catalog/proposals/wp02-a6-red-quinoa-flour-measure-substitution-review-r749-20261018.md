# WP02 A6 R749 — red-quinoa-flour measurement and substitution review — 2026-10-18

## Review record

- **Status:** Integrated in the [R749–R751 batch record](../batches/wp02-wp03-wp04-r749-r751-gap-review-integration-20261018/README.md). The shared change is limited to the existing red-quinoa-flour ledger row.
- **Plan anchor:** The open [Section A6 parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838) continues research for quinoa and other regional grain flours. This is a new, bounded review of the existing red-quinoa-flour row; it does not repeat R728's black-flour portion, R737/R740's white/black substitution reviews, R743's fonio measurement review, or R746's teff portion review.
- **Scope:** Review household measurement and substitution evidence for `ingredient-ref-red-quinoa-flour` only. Preserve its identity, names, aliases, and the separate red-quinoa grain identity.
- **Integrated IDs:** `WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S01` through `S04`; finding `red-quinoa-flour-bread-trial-context-blocked-r749-20261018`.

## Bounded recommendation

Keep reusable measurement and substitution behavior out of the active catalog. The integrated ledger row sets measurement research to `researched_no_supported_value` with no measurement observation, and set substitution research to `blocked_pending_evidence` with one source-scoped bread-study finding. Do not add a `defaultDensity`, unit mapping, form, global conversion, package yield, recipe link, alias, or active substitution rule.

The measurement review found two kinds of non-transferable evidence:

1. A current supplier offers white and red quinoa flour commercially in **20 kg paper bags**, but gives no household portion on the reviewed page. Its red-flour specification link was not accessible during this review, so no claim is made about fields in that document.
2. A 2026 primary study gives loose and tapped bulk densities for three freeze-milled quinoa seed samples, but names no sample as red quinoa. Its values cannot be assigned to the red-flour identity. The study's laboratory cylinder and tapping protocol is not a kitchen fill convention.

The substitution review found one controlled red-quinoa-flour bread study. It used red quinoa seeds from Bolivia, washed and ground in a laboratory, and tested stated 0–20% replacement levels against local Romanian type-000 wheat flour. Neither the study flour nor its wheat flour is matched to an active catalog product. Keep this formula-specific result blocked from general recipe use.

## Current target state

The latest integrated R746–R748 checkpoint reports **1,848 ingredient references, 179 forms, 114 recipes, 1,123 ingredient rows, and 2,236 ledger records**. The active package and ledger confirm the following target state:

| Surface | Current state | R749 disposition |
|---|---|---|
| Active reference | `ingredient-ref-red-quinoa-flour`: `red quinoa flour / farine de quinoa rouge`, category `FLOUR_AND_STARCH`; no aliases, null `defaultDensity`, empty `unitMappings`. | Keep names and all reference fields unchanged. |
| Neighboring references | Separate generic, roasted, white, and black quinoa-flour rows; separate red-quinoa grain row. | Keep the red-flour finding on its exact row. Do not transfer flour evidence to grain or neighboring flour rows. |
| Target ledger row | Identity `verified`; measurement and substitution research both `not_yet_researched`; existing identity/naming sources and decision; no measurement observations or substitution findings. | Update only the two research states, append the new sources, one blocked finding, and one review decision. Preserve existing evidence. |
| Forms, rules, and yields | No form, global or contextual substitution rule, or package yield targets the red-quinoa-flour ID. | Add none. |
| Recipes | No manifest-listed ingredient row references the target ID. | Add no recipe link or recipe-specific measure. |

## Current primary-source evidence

**Product and identity context.** GoGo Quinoa's current [English product page](https://gogoquinoa.com/products/macaroni-bundle-8-bags) describes organic white rice and red-and-white quinoa flour in its organic macaroni; the current [French page](https://gogoquinoa.com/fr/products/macaroni-bundle-8-bags) explicitly lists `farine de quinoa rouge biologique` among the pasta ingredients. Both pages describe a 227 g finished pasta package and pasta cooking instructions, not an amount of flour. These sources corroborate use of the named flour in a mixed product but do not provide its ratio, a stand-alone retail bag, or a flour measure.

Inka Power's current [quinoa-flour supplier page](https://inkapower.de/?page_id=4407&lang=en) lists white and red quinoa flour varieties, organic and conventional types, and 20 kg paper bags. Its page links a separate red-flour specification, but that Google Drive file was not retrievable in this review. The 20 kg commercial package is not a household portion, and this proposal makes no claim about the unavailable specification's contents.

**Bulk-density evidence.** Raikos et al., “Nutritional Content, Phytochemical Composition, and Physicochemical Properties of Different Quinoa (*Chenopodium quinoa* Willd.) Seed Varieties,” *Cereal Chemistry* 103 (2026), 93–109, [DOI 10.1002/cche.70031](https://doi.org/10.1002/cche.70031), [open full text](https://bibliotecadigital.ipb.pt/server/api/core/bitstreams/f01ad1ea-5d03-4695-8607-cf28829e9181/content), methods §§2.1 and 2.4 and Table 6. The authors freeze-milled Atlas and Temuco quinoa seed samples sourced in the UK and BRS Piaburu sourced in Brazil. Their Table 6 reports loose/tapped densities of 0.56/0.69, 0.51/0.70, and 0.59/0.78 g/mL, respectively. None is named or classified as red quinoa. Loose density used 2 g of powder in a 10 mL measuring cylinder without tapping; tapped density used a 15 cm drop onto a rubber mat for 120 taps or until constant volume. These results are sample-specific laboratory properties, not a red-quinoa-flour household mapping. The paper also reports significant between-sample differences, so the entries must not be assigned by color inference.

**Substitution evidence.** Codină, Franciuc, and Todosi-Sănduleac, “Studies on the Influence of Quinoa Flour Addition on Bread Quality,” *Food and Environment Safety* XV(2) (2016), 165–174, [journal PDF](https://fens.usv.ro/index.php/FENS/article/download/219/217). Sections 2.1–2.2 describe type-000 wheat flour from a local hypermarket and red quinoa seeds of Bolivian origin, washed repeatedly to remove saponins, dried, and ground separately in a laboratory grinder. The abstract reports replacing a portion of the type-000 wheat flour with red or white quinoa flour at stated levels of 0%, 5%, 10%, 15%, and 20%. The study observes changes in bread volume, elasticity, porosity, texture, and color; its conclusion limits the favorable 5–10% result to its bread formula and type-000 flour. It does not identify the quinoa material as a commercial flour matching an active product or the wheat flour as an active catalog reference. No general replacement amount or recipe rule is supported.

## Integrated ledger delta

Append the four new sources and one blocked finding to `ingredient-ref-red-quinoa-flour`; update only `measurementState` and `substitutionResearchState`; append one accepted review decision. Keep `measurementObservations` empty and preserve all existing sources and identity decisions. The following delta records the fields integrated on the current ledger row:

```json
{
  "recordId": "ingredient-ref-red-quinoa-flour",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S01",
      "url": "https://gogoquinoa.com/fr/products/macaroni-bundle-8-bags",
      "title": "GoGo Quinoa, Macaroni biologique - Riz, quinoa rouge et blanc",
      "accessedOn": "2026-10-18",
      "locator": "Product description, ingredient list, 227 g package and preparation directions.",
      "supports": "The current manufacturer page lists organic red quinoa flour as an ingredient in a mixed macaroni product. The package size and cooking directions concern finished pasta, not a household flour portion or red-flour amount.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S02",
      "url": "https://inkapower.de/?page_id=4407&lang=en",
      "title": "Inka Power, Quinoa Flour",
      "accessedOn": "2026-10-18",
      "locator": "Varieties and commercial-presentation sections; linked red-flour specification was not retrievable.",
      "supports": "The supplier lists red quinoa flour as a commercial variety and gives 20 kg paper bags. The reviewed page does not state a household portion or mass-volume pair; no claim is made about the unavailable specification.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S03",
      "url": "https://bibliotecadigital.ipb.pt/server/api/core/bitstreams/f01ad1ea-5d03-4695-8607-cf28829e9181/content",
      "title": "Raikos et al., Nutritional Content, Phytochemical Composition, and Physicochemical Properties of Different Quinoa (Chenopodium quinoa Willd.) Seed Varieties",
      "versionOrDate": "Cereal Chemistry 103 (2026), 93–109; DOI 10.1002/cche.70031",
      "accessedOn": "2026-10-18",
      "locator": "Methods §§2.1 and 2.4; Table 6.",
      "supports": "Reports loose and tapped laboratory bulk density for freeze-milled Atlas, Temuco, and BRS Piaburu quinoa seed samples. It does not identify a sample as red quinoa; its values do not support a density or household measure for red quinoa flour.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S04",
      "url": "https://fens.usv.ro/index.php/FENS/article/download/219/217",
      "title": "Codină, Franciuc, and Todosi-Sănduleac, Studies on the Influence of Quinoa Flour Addition on Bread Quality",
      "versionOrDate": "Food and Environment Safety XV(2) (2016), 165–174",
      "accessedOn": "2026-10-18",
      "locator": "Sections 2.1–2.2, 3, and 4.",
      "supports": "Tests laboratory-ground flour from washed Bolivian red quinoa seeds at stated 0–20% replacement levels in one bread formula using local type-000 wheat flour. The study does not identify a commercial flour match or catalog wheat-flour counterpart.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "red-quinoa-flour-bread-trial-context-blocked-r749-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "One wheat-bread study using laboratory-ground red quinoa flour at stated replacement levels of 0%, 5%, 10%, 15%, and 20%.",
      "basis": "The source flour came from Bolivian red quinoa seeds that were washed, dried, and ground in a laboratory. The wheat flour was type 000 obtained from a local hypermarket. The study reports outcomes for that formula and process only.",
      "limitations": [
        "The study's red quinoa flour is not matched to a named current retail product or to a catalog flour process.",
        "The type-000 wheat flour is not identified as an active catalog flour reference.",
        "The reported replacement levels and bread outcomes are formula-specific and do not establish a reusable quantity, adjustment, or substitution for arbitrary recipes.",
        "No bundled recipe line or exact ingredient pair supports a contextual substitution rule."
      ],
      "sourceIds": [
        "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S04"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the red-quinoa-flour measurement and substitution review without activating numeric behavior. The current supplier source gives only an industrial package size; the 2026 density study does not identify a red sample; and the red-flour bread study concerns one lab-prepared product and an unlinked type-000 wheat flour. Mark transferable measurement unsupported, retain the bread result as blocked evidence, and leave active catalog data unchanged.",
      "sourceIds": [
        "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S01",
        "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S02",
        "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S03",
        "WP02-A6-RED-QUINOA-FLOUR-R749-20261018-S04"
      ]
    }
  ]
}
```

The delta intentionally contains no `measurementObservations`, `defaultDensity`, `unitMappings`, `fromIngredientRefId`, `replacements`, or `ruleId`. No number from the density paper is assigned to the red-flour row, and the bread percentages are not converted into recipe amounts.

## Source and ID ownership

The live target row already owns `WP02-A6-QAM-FLOUR-20261011-S01`, `S08`, `S09`, `S10`, and `WP02-A6-FRWORD-20261011-S01`, `S07`. Those records cover the OQLF quinoa term, Canadian French pasta declarations, and product-class listing. None is the R749 study or source URL. A live-ledger scan found no owner for the four URLs in this proposal and no owner for the proposed R749 source IDs or finding ID. Keep the existing source records in place and append these at integration. The R749 prefix and proposed filename did not match existing files or ledger IDs when checked.

## Picker projection

The active row owns only the exact English phrase `red quinoa flour` and French phrase `farine de quinoa rouge`. [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches names and aliases, prefers complete word phrases, then falls back to substring matches. R749 changes no picker fields, so current results remain:

| Query | Current matching references | R749 effect |
|---|---|---|
| `red quinoa flour` | `ingredient-ref-red-quinoa-flour` | No change |
| `farine de quinoa rouge` | `ingredient-ref-red-quinoa-flour` | No change |
| `quinoa flour` / `farine de quinoa` | Generic, roasted, black, red, and white quinoa-flour rows | No change |
| `red quinoa` / `quinoa rouge` | `ingredient-ref-red-quinoa` and `ingredient-ref-red-quinoa-flour` | No change |

## Manifest-listed recipe scan

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. The target ID and exact phrases `red quinoa flour` and `farine de quinoa rouge` occur in **zero recipe files and zero ingredient rows**. A broader `quinoa` scan found two recipe files: recipe 016 has the only structured quinoa ingredient line, `2 cups cooked quinoa`, linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`; recipe 018 mentions generic quinoa in text only. Neither uses red quinoa flour or supports a flour portion, conversion, or substitution.

## Review checks

- Read current `AGENTS.md`, the A6 plan section, roadmap, workflow, R746–R748 checkpoint, target reference and ledger row, schema, related quinoa-flour proposals, forms, rules, yields, and recipe package.
- Verified current first-party GoGo and Inka Power product pages and inspected the primary Raikos et al. and Codină et al. studies. Kept sample identity, manufacturing, study formulation, and density method limits explicit.
- Checked source-ID and URL ownership, target ID uniqueness, exact bilingual ownership, forms/rules/yields, and picker projections against current seed data and the search implementation.
- Recomputed manifest counts and scanned serialized recipe text and structured rows; no candidate-specific use was found.
- Integration checks confirmed valid relative links, UTF-8 without BOM, no mojibake, and clean scoped whitespace. No software tests, build, emulator, or deployment were run because the only shared database change adds JSON research data under `AGENTS.md`.

The broader WP02 Section A6 review remains open.
