# WP02 A6 white quinoa flour substitution review — R737 — 2026-10-18

## Review record

- **Reviewed and sources accessed:** 2026-10-18.
- **Status:** Integrated in the WP02/WP03/WP04 R737–R739 batch. The bounded blocked finding is recorded on the existing white-quinoa-flour ledger row.
- **Scope:** Resolve the substitution question explicitly deferred by R734 for the existing `ingredient-ref-white-quinoa-flour` record. This review does not reopen the accepted identity or R734 measurement finding.
- **Plan anchor:** The A6 parent remains open at the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1827). R734's [measurement proposal](wp02-a6-next-gap-review-r734-20261018.md#L23) explicitly left the product page's replacement statement to a separate review.
- **Roadmap/workflow:** The current R734–R736 checkpoint says A6 remains open; this proposal does not update either shared checklist or workflow file.
- **Source-ID audit:** R737's proposed filename, finding ID, source-ID prefix, and academic source URLs are absent from the current proposal/batch archive and ledger. Reuse the two Tootsi source IDs already owned by the target row; add each new academic URL only once.

## Bounded recommendation

Update only the existing research-ledger record for `ingredient-ref-white-quinoa-flour`:

- Keep `measurementState: researched_no_supported_value` and its R734 product-specific portion observation unchanged.
- Set `substitutionResearchState` to `blocked_pending_evidence` and append one finding that retains Tootsi's product-specific advice and the limits of the supporting food-science evidence.
- Keep `identityState: verified`, the active reference, and all names and numeric fields unchanged. Add no alias, density, unit mapping, form, conversion, package yield, recipe link, global rule, contextual rule, or rule-backed replacement.

Tootsi's current product 31501 page says its white quinoa flour can replace up to 25% of flour in recipes, and says the flour does not add body. The bilingual pages repeat the same product statement. They do not name the flour being replaced, define how the percentage is calculated, state whether the amount is by mass or volume, or give recipe-type, method, or adjustment limits. This is useful manufacturer guidance for product 31501, but it does not identify a catalog replacement pair or a scope that the current rule model can enforce.

The primary studies below test quinoa-flour blends in particular products with different flour materials and methods. They support that quinoa flour has been used as a partial flour ingredient, while also documenting product-specific outcomes. Neither study establishes equivalence between its flour and Tootsi 31501 or validates a broad 25% home-recipe rule. The ledger should preserve this evidence without activating a substitution.

## Current record and boundaries

The live reference is `ingredient-ref-white-quinoa-flour`, displayed as `white quinoa flour / farine de quinoa blanc`, category `FLOUR_AND_STARCH`. Its aliases are empty, `defaultDensity` is null, `unitMappings` is empty, and no form is attached. The ledger record is identity-verified, has `measurementState: researched_no_supported_value` from R734, and still has `substitutionResearchState: not_yet_researched`; it has one R734 measurement observation and no substitution findings. No global/contextual rule or package-yield record targets this reference. The active recipe corpus has no matching line.

Keep the R734 measure separate: its 1/4 cup (40 g) Nutrition Facts portion is a product-specific portion for Tootsi 31501 and provides no replacement amount. Do not infer a mass/volume basis for the 25% statement from that nutrition label.

## First-party and primary research evidence

- Tootsi's existing R734 [English product page](https://tootsi.com/en-GB/Product/Detail/31501) identifies code 31501, says the product is made from finely ground white quinoa seeds, and describes use in batters and baked goods. It says quinoa flour can replace up to 25% of flour in recipes, but does not name the other flour, define the percentage basis, or state recipe-specific adjustments.
- Tootsi's existing R734 [French product page](https://tootsi.com/fr-FR/Product/Detail/31501) names `farine de quinoa blanc (bio)` and repeats the same advice. It is the French-language view of the same supplier product page, not an independent trial. The existing English/French source IDs, `WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S01` and `...-S02`, remain owned by this ledger row and should be reused without adding duplicate source objects.
- Wang et al.'s primary [2015 study](https://onlinelibrary.wiley.com/doi/abs/10.1111/jtxs.12128) blended quinoa flour into wheat flour at several weight ratios and tested cookies, bread, and Chinese steamed bread. The authors report different quality effects by product type, including reduced specific volume and changes in density, hardness, chewiness, and color. The article does not identify Tootsi's product or support a universal home-recipe ratio.
- Alvarez et al.'s open-access [2025 shortcrust-cookie study](https://link.springer.com/article/10.1186/s43014-025-00323-2) tested 15% and 30% wheat-flour replacement with quinoa flour alongside sugar reductions. The study flour was a named Blanca de Juli product from RENACER S.A.C., with its own classification, desaponification, drying, texturization, and 60-mesh sifting. The study reported its best consumer acceptance for a 15% quinoa treatment with 10% sugar reduction, while the higher-quinoa/high-sugar-reduction treatments scored lower. This is a tested cookie formulation using different source material, not a Tootsi 31501 or general recipe instruction.

These sources support retaining a bounded manufacturer lead and the product-specific nature of current studies. They do not provide a replacement ingredient ID, denominator/amount convention, or matching recipe role. Therefore, use `blocked_pending_evidence` rather than creating a `researched_supported` finding or active rule. Reopen if Tootsi supplies a named base flour and explicit basis/scope, or a product-matched tested formula establishes them.

## Identity, alias, numeric, and picker audit

No identity or alias change is proposed. Product descriptors `organic`, `bio`, `Tootsi`, and `31501` remain evidence context and are not added as generic search aliases. The reference remains `white quinoa flour / farine de quinoa blanc`, with no reusable density or mapping. R734's 40 g observation remains product-specific and is not converted into an amount for substitution.

The current `IngredientSearch.kt` projection, using reference names, aliases, and forms, gives:

| Query | Current result | R737 effect |
|---|---|---|
| `white quinoa flour` | `ingredient-ref-white-quinoa-flour` | No change; no terms added. |
| `farine de quinoa blanc` | `ingredient-ref-white-quinoa-flour` | No change; no terms added. |
| `quinoa flour`; `farine de quinoa` | Five distinct rows: generic, roasted, black, red, and white quinoa flour. | No change. |
| `organic white quinoa flour`; `31501` | No result. | No change; product/brand terms stay out of aliases. |

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. Searches of serialized recipe content and ingredient rows for the target reference ID, `white quinoa flour`, `farine de quinoa blanc`, `organic white quinoa flour`, and product code `31501` found **no hits**. The quinoa-bites recipe uses whole quinoa, not quinoa flour. No recipe-line substitution or recipe link is proposed.

## Proposed ledger delta

The following is a delta to the existing target row, not a replacement record. Preserve all R734 sources, its accepted identity decision, and its single measurement observation. Reuse the R734 Tootsi source IDs cited in the finding; append only the two new study sources and the proposed finding/decision.

```json
{
  "recordId": "ingredient-ref-white-quinoa-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-WHITE-QUINOA-SUB-R737-20261018-S01",
      "url": "https://onlinelibrary.wiley.com/doi/abs/10.1111/jtxs.12128",
      "title": "Wang, Opassathavorn, and Zhu, Influence of Quinoa Flour on Quality Characteristics of Cookie, Bread and Chinese Steamed Bread",
      "versionOrDate": "Journal of Texture Studies 46(4), 281\u2013292 (2015); DOI 10.1111/jtxs.12128",
      "accessedOn": "2026-10-18",
      "locator": "Abstract: quinoa-to-wheat blend ratios, tested products, and product-type-dependent quality effects.",
      "supports": "Primary study blends quinoa flour with wheat flour at multiple weight ratios and tests cookies, bread, and Chinese steamed bread. Product quality effects vary by product type; the flour is not identified as Tootsi product 31501, and the work does not establish a universal home-recipe replacement rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-WHITE-QUINOA-SUB-R737-20261018-S02",
      "url": "https://link.springer.com/article/10.1186/s43014-025-00323-2",
      "title": "Alvarez et al., Sugar reduction and replacement of wheat flour with quinoa flour in shortcrust cookies: effects on nutritional, physical, and sensory properties",
      "versionOrDate": "Food Production, Processing and Nutrition 7, article 72 (2025); DOI 10.1186/s43014-025-00323-2",
      "accessedOn": "2026-10-18",
      "locator": "Abstract and Materials and Methods, Raw Materials and Manufacture of Cookies; Tables 1 and 6.",
      "supports": "Primary study tests 15% and 30% wheat-flour replacement with a named Blanca de Juli quinoa flour from RENACER S.A.C. in shortcrust cookies with separately varied sugar reduction. It does not identify the flour as Tootsi product 31501 or support a general replacement rule.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "white-quinoa-flour-tootsi-partial-flour-replacement-scope-blocked-r737-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "Tootsi product 31501 states that its white quinoa flour can replace up to 25% of flour in recipes; determine whether this can be represented as a reusable replacement for the catalog reference.",
      "basis": "The Tootsi English and French product pages identify the same product and repeat the same manufacturer advice. They name no source flour, do not define the percentage denominator or mass/volume basis, and give no recipe-type, method, or adjustment limits. Wang et al. test multiple quinoa-to-wheat ratios across cookies, bread, and Chinese steamed bread and report product-type-dependent effects. Alvarez et al. test a separate RENACER Blanca de Juli flour in shortcrust cookies at 15% and 30% wheat-flour replacement, with outcomes also depending on sugar reduction. Neither study matches Tootsi 31501.",
      "limitations": [
        "Retain the up-to-25% statement as Tootsi product 31501 guidance only; it does not name the flour to replace or define an enforceable replacement pair.",
        "Do not assume the percentage is by mass or volume or derive a recipe amount from the separate R734 nutrition portion.",
        "The studies use other quinoa-flour materials and specified formulations; do not transfer their ratios or outcomes to Tootsi 31501 or to unqualified home recipes.",
        "No matching bundled recipe line exists, and the current rule model cannot express the unnamed product-specific base flour and broad recipe scope."
      ],
      "sourceIds": [
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S01",
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S02",
        "WP02-A6-WHITE-QUINOA-SUB-R737-20261018-S01",
        "WP02-A6-WHITE-QUINOA-SUB-R737-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the deferred substitution review by recording Tootsi's up-to-25% product guidance as a blocked, source-scoped finding. The named base flour, ratio basis, and recipe scope are not established, and studies of other quinoa flours are formulation-specific. Keep active substitution behavior and all catalog data unchanged.",
      "sourceIds": [
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S01",
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S02",
        "WP02-A6-WHITE-QUINOA-SUB-R737-20261018-S01",
        "WP02-A6-WHITE-QUINOA-SUB-R737-20261018-S02"
      ]
    }
  ]
}
```

The proposed JSON does not add a `fromIngredientRefId` or replacement because the manufacturer does not name the flour being replaced. Leave active references, forms, substitution rules, contextual rules, package yields, and recipes untouched. No density, unit mapping, measure, or conversion is derived.

## Ownership and review checks

- The R734 English and French Tootsi product-page URLs are already owned by the target ledger row under the existing R734 source IDs; reuse them and do not mint duplicate sources.
- The two new Wang and Alvarez URLs and R737 source IDs are now owned once by the existing white-quinoa-flour record; the finding ID and output filename remain unique. The R734 Tootsi URLs and source IDs are reused without duplicate source entries.
- Current state: 1,848 references, 176 forms, 114 manifest-listed recipes / 1,123 ingredient rows, and 2,233 ledger records. The target has no forms, active substitution rule, recipe link, or package yield.
- The proposal contains working relative links to the plan and R734 proposal. The integrated ledger row passed the [research-ledger schema](../research-ledger.schema.json) and semantic validator; UTF-8/no-BOM, mojibake, source ownership, and scoped whitespace checks are recorded in the batch README.
- No software tests, build, emulator run, or deployment were performed. This is proposal-only work and the proposed integration changes database JSON, which is exempt from testing by `AGENTS.md`.

The broader WP02 Section A6 review remains open.
