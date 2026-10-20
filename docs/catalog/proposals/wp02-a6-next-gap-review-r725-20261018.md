# WP02 A6 R725 — teff-flour substitution evidence review

- **Status:** Proposal only. No shared reference, ledger, rule, recipe, checklist, roadmap, workflow, generated file, or integration record was edited.
- **Open checklist:** Continue the regional-grain-flour review in [Section A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1815). This review addresses the unresearched substitution field on the existing generic teff-flour row.
- **Scope:** One manufacturer-specific teff-flour substitution recommendation for chocolate-flavored baking. Do not reopen teff identity or Québec wording, the separate ivory/brown teff rows, or the R616, R620, R719, and R722 topics.
- **Proposal-local identifiers:** `WP02-A6-TEFF-SUB-R725-20261018-S01` through `S03`; `teff-westpoint-chocolate-baked-goods-r725-20261018`. None is allocated in shared data.

## Bounded recommendation

Append one source-scoped `SubstitutionFinding` to `ingredient-ref-teff-flour` for Westpoint Naturals' unqualified Teff Flour. Its current manufacturer page recommends reducing the recipe flour by 10–20% in chocolate cookies, cakes, and brownies, then replacing the removed amount with an equal weight of teff flour. The same page describes the relevant flavor profile as cocoa, chocolate, brown butter, or brown sugar.

Record the recommendation as Westpoint product guidance for those recipe contexts only. The page specifies an equal-weight replacement, but does not state whether the 10–20% reduction itself is based on mass or volume, and it gives no named formula or controlled outcome. Preserve the range in text; do not calculate an amount, call it a 10–20% mass replacement, or turn it into an active runtime rule. The finding's `fromIngredientRefId` is limited to all-purpose flour; the source also mentions gluten-free blends, but does not identify a single blend reference.

If accepted, set the generic teff-flour row's `substitutionResearchState` to `researched_supported` for this source-specific finding. Leave `measurementState` as `not_yet_researched`; no measurement observation, density, unit mapping, form, yield, alias, recipe link, or active global/contextual substitution rule is proposed. Westpoint's separate pancake and banana-bread suggestions are not folded into this finding.

This does not establish a generic teff replacement percentage. Bob's Red Mill's existing product page says about 25% of the white/all-purpose flour for baked goods, while its separate alternative-flour guide lists 20% of the recipe flour called for; neither states the percentage basis. A primary study tests a range of teff blend proportions across four baked-product types and reports different results by product. These sources support keeping the Westpoint finding bounded to its product and recipe context.

## Current ownership and prior decisions

| Surface | Current state | R725 recommendation |
|---|---|---|
| Generic teff flour | `ingredient-ref-teff-flour` owns `teff flour / farine de teff`, category `FLOUR_AND_STARCH`, with no aliases, null density, and empty unit mappings. | Retain the identity and all names unchanged. Add only the proposed ledger evidence. |
| Color-qualified teff flours | `ingredient-ref-ivory-teff-flour` and `ingredient-ref-brown-teff-flour` are separate active rows; neither has aliases, density, or unit mappings. | Do not transfer Westpoint's unqualified product recommendation to either row. |
| Research ledger | The generic row is identity-verified; measurement and substitution states are `not_yet_researched`, with no observations or substitution findings. Existing sources are `WP02-S90`–`WP02-S92`. | Add one source-scoped finding and its new sources. Refresh existing `WP02-S91` in place with the current Bob's Red Mill substitution text; do not add a duplicate owner for its URL. Keep measurement research open. |
| Forms and active data | No teff-flour form is present; both bundled substitution-rule files contain no rules. The generic row has no density or unit mapping. | Add no form, conversion, yield, or active rule. A ledger finding is evidence only. |
| Recipe corpus | The current manifest-listed bundle contains 114 recipe files and 1,123 structured ingredient rows; no teff-flour line or term is present. | Add no recipe link or recipe change. |

Recent A6 reviews R616 (roasted quinoa measurement/substitution), R620 (sprouted amaranth evidence), R719 (quinoa-flour label portion), and R722 (fonio-flour cookie formula) concern different rows and questions. Earlier teff reviews R150, R151, and R157 established identity boundaries for ivory, brown, and white teff products; they did not review substitution guidance for the unqualified teff-flour row. R725 reopens none of those decisions.

## Source-backed finding and limits

Westpoint Naturals' manufacturer page identifies its Teff Flour as 100% teff grains grown in South Africa. For recipes involving cocoa, chocolate, brown butter, or brown sugar, it recommends reducing recipe flour by 10–20% and substituting an equal weight of teff. The page associates this direction with chocolate cookies, cakes, and brownies. This is a direct manufacturer instruction, not a tested formula. Its separate 25% teff-pancake suggestion and 50/50 teff/all-purpose banana-bread example are distinct applications and are not part of R725's finding.

Bob's Red Mill's existing product page says to substitute about 25% of the white or all-purpose flour called for in baked-goods recipes. Its current one-page alternative-flour guide lists 20% for Teff Flour when replacing part of recipe flour. Neither source gives a mass-versus-volume basis for those percentages. These documents are not merged with Westpoint's 10–20% guidance.

Coleman et al.'s primary study made cakes, cookies, biscuits, and bread in triplicate with 0%, 10%, 20%, 30%, 40%, and 100% teff flour blends. The PubMed abstract reports lower bread and cake volume as teff increased, but that difference was not statistically significant (p > 0.05); cookie spread was significantly greater at 40% and 100%, and biscuit height and color also differed among treatments. The abstract's study percentages do not identify a measurement basis or a single practical replacement rule. R725 uses this only to limit generalization, not as a recommended ratio.

### Source register and ownership audit

| ID | Source | What it directly supports and limits |
|---|---|---|
| **WP02-S91, existing owner** | Bob's Red Mill, [Teff Flour](https://www.bobsredmill.com/product/teff-flour). | Already owned by `ingredient-ref-teff-flour` for product identity. The current page also recommends about 25% replacement of white/all-purpose flour in baked goods. At integration, refresh this existing source's locator/supports and access date; do not append another source with the same URL. Its page also has a 1/4-cup (35 g) serving, which R725 does not review or record. |
| **R725-S01, proposal-local** | Bob's Red Mill, [Baking with Alternative Flours](https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/5906-baking-with-alternative-flours-info-sheet/file), one-page PDF, Teff Flour row and instructions above the table. | The manufacturer guide lists 20% of the flour called for in the recipe when substituting alternative flours. It does not specify mass versus volume, a particular recipe, or product SKU. It is manufacturer guidance, not controlled testing. |
| **R725-S02, proposal-local** | Westpoint Naturals, [Teff Flour](https://www.westpointnaturals.com/products/teff-flour/), Ingredients, Directions, Uses, and Nutrition sections. | The page names SKUs, states 100% teff from South Africa, and directly gives the 10–20% flour-reduction/equal-weight instruction for chocolate-oriented baking. The page does not say whether the percentage uses mass or volume, provide a recipe formula, or report comparative testing. Its 3 tbsp (30 g) nutrition serving is not treated as a reusable measure. |
| **R725-S03, proposal-local** | Coleman, J. et al., [“The suitability of teff flour in bread, layer cakes, cookies and biscuits”](https://pubmed.ncbi.nlm.nih.gov/23730794/), *International Journal of Food Sciences and Nutrition* 64(7), 877–881 (2013), DOI 10.3109/09637486.2013.800845; PubMed abstract. | The primary-study abstract reports triplicate baked products made from wheat/teff blends at 0%, 10%, 20%, 30%, 40%, and 100% teff and product-dependent results. The abstract does not establish a general home substitution ratio or specify a mass/volume basis. |

The exact R725 source IDs, finding ID, and all three proposed new URLs were checked against the live research ledger and current proposal/batch archive. None has an existing owner. `WP02-S91` remains the exact existing owner for the Bob's Red Mill product-page URL. All R725 identifiers remain proposal-local.

## Bilingual names, alias collisions, and picker projection

The display pair remains `teff flour / farine de teff`, with no aliases. R725 adds no French wording; its English-language manufacturer sources do not establish Québec display terms. The nearby `ivory teff flour / farine de teff ivoire`, `brown teff flour / farine de teff brun`, and teff-grain identities remain separate.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, compatibility characters, punctuation, and spaces. It prefers complete phrase matches before substring fallback. Since this proposal is ledger-only, projected search results are unchanged:

| Query | Current results | R725 projection |
|---|---|---|
| `teff flour` | Generic, ivory, and brown teff-flour rows | Same three rows |
| `farine de teff` | Generic, ivory, and brown teff-flour rows | Same three rows |
| `teff` | Teff grain plus generic, ivory, and brown teff-flour rows | Same four rows |
| `tef` | Teff-grain row | Same single row |

No alias is added, so no existing picker collision or result count changes.

## Manifest-listed recipe scan

Scanned every current manifest-listed recipe file (114 files; 1,123 structured ingredient rows) and each serialized recipe for `ingredient-ref-teff-flour`, `teff flour`, `farine de teff`, and `teff`. The scan found zero file-text hits and zero ingredient-row hits. No bundled recipe supplies demand, a formula, an ingredient role, or a link for this evidence. No recipe-line substitution or recipe link is proposed.

## Proposed research-ledger delta

This schema-shaped `Record` example contains only the R725 additions; it is not a replacement for the existing ledger row. At integration, append the new sources and finding, append the decision, and update existing `WP02-S91` in place. Preserve all earlier sources and identity decisions. Update only `substitutionResearchState`; leave the reference, forms, active rules, measurement fields, and recipe files unchanged.

```json
{
  "recordId": "ingredient-ref-teff-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-A6-TEFF-SUB-R725-20261018-S01",
      "url": "https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/5906-baking-with-alternative-flours-info-sheet/file",
      "title": "Bob's Red Mill, Baking with Alternative Flours",
      "accessedOn": "2026-10-18",
      "locator": "One-page PDF, instructions above the table and Teff Flour row.",
      "supports": "When replacing part of the whole-wheat or white flour called for in a recipe, the guide lists 20% for Teff Flour. It does not specify mass versus volume, a particular formula, or product SKU.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-TEFF-SUB-R725-20261018-S02",
      "url": "https://www.westpointnaturals.com/products/teff-flour/",
      "title": "Westpoint Naturals, Teff Flour",
      "accessedOn": "2026-10-18",
      "locator": "Ingredients, Directions, Uses, and Nutrition sections.",
      "supports": "The page lists a Teff Flour product made from 100% teff grains grown in South Africa. For cocoa-, chocolate-, brown-butter-, or brown-sugar-oriented cookies, cakes, and brownies, it recommends reducing recipe flour by 10–20% and substituting an equal weight of teff. It does not specify whether the percentage reduction is by mass or volume, name a tested formula, or report comparative test results.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-TEFF-SUB-R725-20261018-S03",
      "url": "https://pubmed.ncbi.nlm.nih.gov/23730794/",
      "title": "Coleman et al., The suitability of teff flour in bread, layer cakes, cookies and biscuits",
      "versionOrDate": "2013",
      "accessedOn": "2026-10-18",
      "locator": "PubMed abstract; journal citation 64(7), 877–881; DOI 10.3109/09637486.2013.800845.",
      "supports": "The primary-study abstract reports triplicate cakes, cookies, biscuits, and breads made with 0%, 10%, 20%, 30%, 40%, and 100% teff flour blends, with different physical outcomes among product types. It does not establish a general home substitution ratio or state the percentages' mass/volume basis.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "teff-westpoint-chocolate-baked-goods-r725-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-all-purpose-flour",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-teff-flour",
          "roleInCompound": "Westpoint Teff Flour replacing part of the recipe's all-purpose flour; the manufacturer directs an equal-weight replacement for the amount removed."
        }
      ],
      "context": "Westpoint Naturals' unqualified Teff Flour product, made from 100% South African teff, in chocolate cookies, cakes, or brownies involving cocoa, chocolate, brown butter, or brown sugar.",
      "basis": "Westpoint directs reducing recipe flour by 10–20% and replacing the removed amount with an equal weight of teff. Although equal-weight replacement is explicit, the page does not state whether the 10–20% reduction itself is based on mass or volume. Preserve the source wording and range; do not derive a numeric replacement amount or an active ratio.",
      "expectedEffects": [
        "Westpoint says this product enhances earthy flavor in these baked goods; the page does not report a controlled comparison."
      ],
      "limitations": [
        "One manufacturer's product and chocolate-oriented recipe contexts only; do not generalize to all teff flour, including color-qualified rows.",
        "The source gives no named formula or test result; the percentage basis is unspecified even though the replacement is described by equal weight.",
        "The source's separate pancake suggestion and 50/50 banana-bread example are not part of this finding.",
        "No global or contextual runtime substitution rule or recipe-line link is supported by this finding alone."
      ],
      "sourceIds": [
        "WP02-A6-TEFF-SUB-R725-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Westpoint's 10–20% flour-reduction/equal-weight teff instruction as product- and recipe-context-specific evidence. Bob's Red Mill's product page and guide give different percentages, while the study reports product-dependent outcomes; none supports one transferable teff-flour replacement rule. Keep measurement research open and add no active rule or recipe link.",
      "sourceIds": [
        "WP02-S91",
        "WP02-A6-TEFF-SUB-R725-20261018-S01",
        "WP02-A6-TEFF-SUB-R725-20261018-S02",
        "WP02-A6-TEFF-SUB-R725-20261018-S03"
      ]
    }
  ]
}
```

## Review checks

- [x] Read current `AGENTS.md`, substitution requirements, the open A6 checklist, recent roadmap/workflow entries through integrated R722, current references/forms/rules/ledger/schema, and prior teff/A6 reviews.
- [x] Verified Westpoint and Bob's Red Mill manufacturer guidance and the Coleman et al. primary-study abstract online; preserved each source's product, context, and measurement limits.
- [x] Audited existing `WP02-S91` ownership and checked new source IDs, URLs, and finding ID against the live ledger and proposal/batch archive; new identifiers remain proposal-local.
- [x] Checked bilingual names and picker projection against `IngredientSearch.kt`; no alias, display, or picker change is proposed.
- [x] Scanned all 114 manifest-listed recipes and 1,123 structured ingredient rows; found zero teff terms, target links, or recipe demand.
- [x] Validated the proposed `Record` example against `research-ledger.schema.json`; verified UTF-8 without BOM and no mojibake.
- [x] No software tests, build, emulator, or deployment were run. This is proposal-only; if later integrated as database-JSON-only changes, the current `AGENTS.md` exempts software testing.

The broader WP02 Section A6 review remains open.
