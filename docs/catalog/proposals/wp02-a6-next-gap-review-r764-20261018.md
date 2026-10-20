# WP02 Section A6 R764 — Ivory teff flour substitution evidence review — 2026-10-18

## Review record

- **Status:** Proposal only. No shared catalog data, plan, roadmap, workflow, recipe, generated file, or integration record was edited.
- **Open checklist:** Continue the A6 review of regional grain flours in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1850). The checklist remains open after R761.
- **Exact target:** Existing `ingredient-ref-ivory-teff-flour`, `ivory teff flour / farine de teff ivoire`, `FLOUR_AND_STARCH`.
- **Exact open question:** Does current evidence support a recipe-specific wheat-flour replacement instruction for the source-named Berhan Ivory Teff Flour represented by this row?
- **Proposal-local IDs:** `WP02-A6-IVORY-TEFF-SUB-R764-20261018-S02` and `S03`; finding `ivory-teff-flour-berhan-substitution-scope-blocked-r764-20261018`. The R764 path, IDs, finding ID, and new source URLs were unallocated in the proposal/archive/ledger audit.

## Prior-decision and scope audit

The current reference row has no aliases, forms, density, or unit mappings. Its ledger record is identity-verified, has `measurementState: researched_no_supported_value`, `substitutionResearchState: not_yet_researched`, and no substitution findings. [R150](wp02-a6-next-regional-flour-gap-review-r150-20261015.md) established the identity and explicitly did not review substitution. [R151](wp02-a6-next-regional-flour-gap-review-r151-20261015.md) covers brown teff flour identity; [R156](wp02-a6-next-regional-flour-gap-review-r156-20261015.md)–[R157](wp02-a6-next-regional-flour-gap-review-r157-20261016-white-teff.md) cover teff color naming and boundaries. None decides whether substitution guidance applies to the Berhan ivory product.

Recent A6 work is distinct: [R725](wp02-a6-next-gap-review-r725-20261018.md) reviewed generic teff-flour guidance and explicitly declined to transfer an unqualified manufacturer's recommendation to color-qualified flour rows; [R746](wp02-a6-teff-flour-measurement-review-r746-20261018.md) recorded a generic teff-flour label portion. Neither researched the ivory row's source-specific substitution evidence. [R761](wp02-a6-next-gap-review-r761-20261018.md) concerns black fonio. The [roadmap](../../../roadmap.md#L1502) records R761–R763 as the latest integrated reviews and says A6 remains open. This proposal does not reopen any of those decisions.

## Bounded recommendation

Update only the existing ledger record for `ingredient-ref-ivory-teff-flour`:

1. Set `substitutionResearchState` to `blocked_pending_evidence`.
2. Reuse existing source `WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S01` for the Berhan product listing, refreshing its access date and `supports` text in place. Do not register the same URL under a new source ID.
3. Add the two proposal-local sources below and one blocked finding for the source-named Berhan product.
4. Append one decision describing why the reviewed evidence does not support an active replacement instruction.

Berhan's current Ontario Made product listing describes its Ivory Teff Flour as all-purpose, says it can be incorporated into any recipe, and lists pastries, cakes, injera, waffles, crepes, and sourdough bread. It gives no base flour, replacement proportion, paired formula, or adjustment. Maskal Teff's current FAQ lists the company's own ivory flour products and recommends a 1:1 teff-flour replacement in no-rise baked goods, but that is another manufacturer's general teff-flour guidance and is not shown as a test or instruction for Berhan's product. Ronda et al.'s primary study tests three Ethiopian cultivars, including two white-seed tefs, in one ciabatta-style wheat-bread formulation at replacement levels from 0% to 40%; it does not identify Berhan's commercial ivory product or support applying those study levels to other recipes.

Record these statements as source-scoped evidence only. Do not create a replacement pair, `fromIngredientRefId`, `SubstitutionRule`, `ContextualSubstitutionRule`, recipe-line link, or recipe link. Keep the current measurement state and empty observation list unchanged; add no measure, density, unit mapping, form, conversion, yield, or alias.

## Source register and ownership

| ID | Source and locator | Scope and limits |
|---|---|---|
| **Existing S01 — reused, not duplicated** | Ontario Made, [1 lb. Ivory Teff Flour — Berhan Grains Inc](https://supportontariomade.ca/explore-products/1-lb-ivory-teff-flour), product description and “Great for” list; existing ledger owner `WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S01`. Accessed 2026-10-18. | Current Canadian product listing attributed to Berhan and linked to the manufacturer. The listing supports broad recipe-use guidance, but provides no wheat-flour replacement amount or tested formula. Its “all-purpose” wording is not a measured ratio. The linked Berhan product URL was not retrievable in the web snapshot; reuse and refresh the already-owned Ontario Made source instead of creating a duplicate URL owner. |
| **R764-S02** | Maskal Teff, [Frequently Asked Questions](https://teffco.com/pages/faq), “Baking & Cooking” and “What is the difference between Brown and Ivory Teff?”; accessed 2026-10-18. | The manufacturer page lists its own Ivory Teff Flour products and says teff flour may replace wheat flour 1:1 in no-rise baked goods such as pancakes, waffles, cookies, and banana bread. The FAQ gives this as general teff-flour guidance, not a comparison of ivory versus brown flour, a Berhan-specific instruction, or a controlled formula. Keep it as a distinct manufacturer claim. |
| **R764-S03** | Ronda, F., Abebe, W., Pérez-Quirce, S., and Collar, C., [“Suitability of tef varieties in mixed wheat flour bread matrices: A physico-chemical and nutritional approach”](https://doi.org/10.1016/j.jcs.2015.05.009), *Journal of Cereal Science* 64 (2015), 139–146; publisher abstract and study materials. Accessed 2026-10-18. | Primary study identifies DZ-01-99 as brown-seed tef and DZ-Cr-37 and DZ-Cr-387/Quncho as white-seed tefs. It tests wheat replacement from 0% to 40% in ciabatta-style bread. These are cultivar- and formula-specific results; the study does not identify Berhan's “ivory” flour as either white cultivar or validate a home substitution range. |

The exact R764 identifiers and the S02/S03 URLs were checked against the live ledger and proposal/batch archive and had no prior owners. S01 is already owned by the R150 record and is intentionally reused. R725's Coleman et al. source remains owned under the generic teff-flour review; it is not duplicated here.

## Proposed ledger delta

This is an additive delta for the existing row, not a replacement record. Preserve its R150 identity evidence and decision. Refresh S01 in place as described above; append S02, S03, the finding, and the decision.

```json
{
  "recordId": "ingredient-ref-ivory-teff-flour",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-IVORY-TEFF-SUB-R764-20261018-S02",
      "url": "https://teffco.com/pages/faq",
      "title": "Maskal Teff, Frequently Asked Questions",
      "accessedOn": "2026-10-18",
      "locator": "Baking & Cooking; teff-flour use; Brown and Ivory Teff comparison.",
      "supports": "The manufacturer lists its own Ivory Teff Flour products and gives general teff-flour guidance to use a 1:1 replacement for wheat flour in no-rise baked goods. The guidance is not stated as Berhan-specific or validated separately for ivory teff flour.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-IVORY-TEFF-SUB-R764-20261018-S03",
      "url": "https://doi.org/10.1016/j.jcs.2015.05.009",
      "title": "Ronda et al., Suitability of tef varieties in mixed wheat flour bread matrices: A physico-chemical and nutritional approach",
      "versionOrDate": "2015",
      "accessedOn": "2026-10-18",
      "locator": "Publisher abstract and study materials; Journal of Cereal Science 64, 139–146.",
      "supports": "The primary study tests three named Ethiopian tef cultivars, including two white-seed cultivars, at 0–40% wheat-flour replacement in ciabatta-style bread. The study does not identify the flour as Berhan Ivory Teff Flour or validate a reusable recipe substitution range.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "ivory-teff-flour-berhan-substitution-scope-blocked-r764-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "Berhan's source-named Ivory Teff Flour listing describes broad recipe uses but does not identify a base flour, replacement amount, formula, or adjustment. Maskal's 1:1 no-rise guidance applies to its own general teff-flour product wording, and Ronda et al.'s percentages concern named tef cultivars in one ciabatta formulation. Neither source validates a replacement instruction for Berhan's product.",
      "limitations": [
        "Do not transfer Maskal Teff's manufacturer guidance to Berhan Ivory Teff Flour.",
        "Do not treat the study's 0–40% ciabatta flour blends as a home recipe range or a general teff-flour rule.",
        "No bundled recipe supplies ivory-teff-flour demand, ingredient role, or a recipe-specific replacement context."
      ],
      "sourceIds": [
        "WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S01",
        "WP02-A6-IVORY-TEFF-SUB-R764-20261018-S02",
        "WP02-A6-IVORY-TEFF-SUB-R764-20261018-S03"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Berhan's qualitative Ivory Teff Flour recipe-use statement and adjacent Maskal manufacturer and tef-bread study evidence as a blocked, source-scoped substitution finding. The sources do not validate a replacement amount for Berhan's named product. Keep measurementState researched_no_supported_value, measurement observations empty, and the active reference unchanged. Add no replacement pair, active substitution rule, recipe-line link, recipe link, measure, density, unit mapping, form, conversion, yield, or alias.",
      "sourceIds": [
        "WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S01",
        "WP02-A6-IVORY-TEFF-SUB-R764-20261018-S02",
        "WP02-A6-IVORY-TEFF-SUB-R764-20261018-S03"
      ]
    }
  ]
}
```

## Picker projection

This is ledger-only, so reference names and picker results remain unchanged. A static projection of the current phrase-first search over references and aliases gives:

| Query | Current and projected results |
|---|---|
| `ivory teff flour` / `farine de teff ivoire` | `ingredient-ref-ivory-teff-flour` only |
| `teff flour` / `farine de teff` | Generic, ivory, and brown teff-flour references |
| `teff` | Teff grain plus generic, ivory, and brown teff-flour references |

No aliases or picker-visible fields are added.

## Bundled recipe-corpus demand

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows** for `ingredient-ref-ivory-teff-flour`, `ivory teff flour`, `farine de teff ivoire`, `teff ivoire`, `teff flour`, and `farine de teff`. The scan found **0 matching files, 0 matching ingredient rows, and 0 direct reference-ID links**. The bundled corpus supplies no measure, substitution role, or recipe link for this reference.

## Proposal-local static checks

After writing, verify this file is UTF-8 without BOM, contains no mojibake or trailing whitespace, its embedded JSON delta parses, its relative links resolve, and no file other than this proposal was edited by this task. Do not run software tests, builds, emulator, or deployment checks for this proposal-only work.
