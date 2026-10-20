# WP02 Section A7 R707: Wheatlets substitution evidence review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. No shared catalog JSON, research ledger, plan, workflow, roadmap, generated file, recipe, or other proposal is changed.
- **Plan anchor:** Section A7 remains open for grain meals and milling products ([plan, line 2114](../../RecipeBook-global-ingredient-catalog-plan.txt#L2114)). R698 established the existing identity-only `Wheatlets / Wheatlets` reference; R701 reviewed its measurement evidence and explicitly left substitution research `not_yet_researched` ([R698](wp02-a7-next-open-gap-review-r698-20261018.md), [R701](wp02-a7-wheatlets-measurement-review-r701-20261018.md)).
- **Target:** Existing `ingredient-ref-wheatlets`, category `FLOUR_AND_STARCH`.
- **Selection audit:** This is a follow-up to the unreviewed substitution evidence dimension, not a second identity or measurement review. R698–R700 integrated the identity with no rule; R701–R703 retained `substitutionResearchState: not_yet_researched`; neither proposal appends a Wheatlets substitution finding. R455 mentions Wheatlets as distinct from granular flour, R454 excludes it from the semolina row, and R704 concerns a separate barley form. No earlier proposal targets a Wheatlets substitution finding.

## Recommendation

**Add only a blocked, source-scoped application lead to the existing Wheatlets research record; hold any supported substitution finding and every active rule.** Ardent Mills says code 10287 Wheatlets is “ideal where wheat middlings are required,” so there is a real manufacturer-stated use lead to record. The portfolio does not say which human-food recipe or method it refers to, give a replacement direction, identify the relevant middlings specification, or provide a quantity or formula. USDA AMS defines wheat middlings as a mixture of milling fractions in a feedstuffs glossary. That definition establishes an important boundary; it does not establish culinary interchangeability.

If integrated later, set the target ledger row to `substitutionResearchState: blocked_pending_evidence` and append one blocked finding without `fromIngredientRefId`, `replacements`, or `ruleId`. A blocked state preserves the manufacturer lead without turning it into a validated food-recipe substitution. Do not use `researched_no_supported_substitute` here: the manufacturer has named a use case, although it is too broad to support a directed recipe rule. Keep the ingredient reference, aliases, forms, measures, conversions, and picker unchanged.

Reopen only if a product-matched manufacturer or test-kitchen source specifies the food application, the ingredient being replaced, direction, method/role, and a usable quantity or proportion. If the evidence is for a non-food industrial or feed application, keep it scoped to that application rather than projecting it into recipe substitutions.

## Evidence and limits

| Source | Evidence checked 2026-10-18 | Disposition |
|---|---|---|
| Ardent Mills Canada, [Flour Portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf), February 2023, code 10287; existing ledger source `WP02-A7-GRANULAR-FLOUR-R455-20261017-S03`, reused on the Wheatlets row by R698. | Calls Wheatlets a coarse granular product made from purified endosperm and says it is “ideal where wheat middlings are required.” | Manufacturer product/application evidence. The statement does not give a dish, preparation method, replacement direction, middlings grade, or proportion. It does not support a global same-quantity substitution or a recipe rule. |
| Ardent Mills Canada, [Gamme de farine](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf), February 2023; existing ledger source `WP02-A7-GRANULAR-FLOUR-R455-20261017-S04`, reused on the Wheatlets row by R698. | The French portfolio names Wheatlets separately and describes the coarse, purified-endosperm product. | Bilingual product confirmation only; it adds no recipe, replacement direction, process, or ratio. Reuse the existing source entry; do not add a duplicate source ID. |
| U.S. Department of Agriculture, Agricultural Marketing Service, [Livestock, Poultry and Grain Feedstuffs Terms](https://www.ams.usda.gov/market-news/livestock-poultry-and-grain-feedstuffs-terms), “Wheat Middlings (midds)” entry. | Defines wheat midds as milling output from any wheat class consisting of fine wheat bran, shorts, germ flour, and some mill-tail offal. The page is expressly a feedstuffs glossary. | Authoritative term and scope boundary. This is a multi-fraction milling product, unlike Ardent’s purified-endosperm description. The feed definition is not culinary substitution evidence and gives no food recipe or usable replacement method. The source identifier below is proposal-local only. |

The manufacturer application statement is stronger than an unsupported inference from product names, so it should remain visible as a lead. It is not specific enough to decide whether Wheatlets replaces a human-recipe ingredient, which direction applies, or how to adjust a recipe. The two descriptions also do not establish that every product sold as wheat middlings shares one composition or behavior. This review therefore records the lead as blocked rather than treating Wheatlets and wheat middlings as aliases, equivalent identities, or a ready-to-use substitution pair.

## Current catalog, ledger, identifier, and archive audit

| Surface | Current state and proposal effect |
|---|---|
| Ingredient reference | The 1,841-row reference catalog has exactly one `ingredient-ref-wheatlets` row: `Wheatlets / Wheatlets`, `FLOUR_AND_STARCH`, no aliases, null `defaultDensity`, and empty `unitMappings`. Keep it unchanged. |
| Research ledger | The 2,223-record ledger has one `ingredient-ref-wheatlets` record: identity `verified`, measurement `researched_no_supported_value`, substitution `not_yet_researched`. Its existing sources are Ardent IDs S03/S04; it has no substitution finding. The proposed state and finding are not written to the ledger. |
| Forms and active rules | None of the 173 ingredient forms targets Wheatlets. The global and contextual substitution-rule files each have zero entries. Keep forms and active rules absent. |
| Package yields | The one-row package-yield file has no Wheatlets match. Keep it unchanged. |
| Legacy identity data | The 56-candidate `legacy-import-identities.v1.json` has no Wheatlets name or `ingredient-ref-wheatlets` ID. No legacy candidate or ID is allocated by this review. |
| Identifier/source ownership | The active reference ID and matching ledger record already belong to Wheatlets; no new ingredient ID is needed. Existing Ardent source IDs `WP02-A7-GRANULAR-FLOUR-R455-20261017-S03` and `...-S04` already appear on both the granular-flour and Wheatlets ledger rows as R698 reuse. Retain those IDs and URLs without duplication. `WP02-A7-WHEATLETS-SUBSTITUTION-R707-20261018-S01` is reserved only as a **proposal-local** handle for the USDA link in this document; it is not allocated to the shared ledger. |
| Neighboring identities | Keep `ingredient-ref-granular-flour`, `ingredient-ref-spring-wheat-semolina`, `ingredient-ref-durum-semolina`, `ingredient-ref-wheat-meal` (whole wheat meal), `ingredient-ref-cracked-wheat`, `ingredient-ref-wheat-bran`, `ingredient-ref-wheat-germ`, and `ingredient-ref-cream-of-wheat-hot-cereal` distinct. Do not add `wheat middlings`, `wheat midds`, `wheatmeal`, or their French descriptions as Wheatlets aliases. The generic middlings term is not assigned a human-food ingredient identity here. |
| Proposal and batch archive | The A7 archive contains R698 identity and R701 measurement reviews for Wheatlets, plus older R455/R454 boundary mentions; no prior Wheatlets substitution review or finding was found. The R701–R703 batch reiterates that no Wheatlets substitution was added. R692 and R695 are useful precedents for, respectively, a blocked co-use lead and a narrowly recipe-scoped supported alternative, but neither concerns this target. No R707 proposal path or R707 identifier was present before drafting. |

## Bundled recipe scan

The read-only scan parsed all **114** recipe files listed by `manifest.v1.json` and all **1,123** structured ingredient rows, including serialized recipe text and reference IDs. It found:

- zero `ingredient-ref-wheatlets` links;
- zero mentions of Wheatlets or Wheatlets product variants;
- zero mentions of wheat middlings/midds, wheat granules, or `granules de blé`.

The bundled recipes therefore provide no recipe-specific demand, role, method, or amount for this application lead. No recipe link is proposed.

## Phrase-first picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, punctuation, and spacing, prefers complete word-phrase matches across reference names, aliases, and form terms, and falls back to substring matching only when no phrase match exists. This proposal changes only a future ledger research state/finding. Since no catalog name or alias is proposed, the current and projected picker results are the same:

| Query | Current result | Projected result |
|---|---|---|
| `Wheatlets` | `ingredient-ref-wheatlets` (1) | unchanged |
| `wheat middlings`; `wheat midds` | 0 | 0; no alias or reference proposed |
| `wheatlets coarse`; `wheatlets coarse wheat granules` | 0 | 0; product-description phrases remain unindexed |
| `granular flour` | `ingredient-ref-granular-flour` (1) | unchanged |
| `wheat meal` | `ingredient-ref-wheat-meal` (1; whole-wheat-meal owner) | unchanged; this does not resolve generic middlings |
| `farina` | 5, including `ingredient-ref-spring-wheat-semolina` | unchanged |
| `wheat` | 62 broad matches | unchanged |

Do not add the application phrase or product descriptors as aliases. A ledger finding does not create a searchable name or claim picker equivalence.

## Proposal-only ledger disposition

The following is a future integration sketch only. It does not update the shared ledger. The USDA source handle is proposal-local; the Ardent IDs are the existing shared IDs already on the Wheatlets record.

```json
{
  "recordId": "ingredient-ref-wheatlets",
  "substitutionResearchState": "blocked_pending_evidence",
  "source": {
    "sourceId": "WP02-A7-WHEATLETS-SUBSTITUTION-R707-20261018-S01",
    "url": "https://www.ams.usda.gov/market-news/livestock-poultry-and-grain-feedstuffs-terms",
    "title": "USDA Agricultural Marketing Service, Livestock, Poultry and Grain Feedstuffs Terms",
    "accessedOn": "2026-10-18",
    "locator": "W section, Wheat Middlings (midds) entry.",
    "supports": "Defines wheat midds as fine particles of bran, shorts, germ flour, and some mill-tail offal from commercial wheat-flour milling. The glossary is about feedstuffs and provides no human-recipe substitution method or ratio.",
    "sourceKind": "other"
  },
  "substitutionFinding": {
    "findingId": "wheatlets-middlings-application-lead-r707-20261018",
    "researchState": "blocked_pending_evidence",
    "context": "Ardent Mills says code 10287 Wheatlets is ideal where wheat middlings are required. The reviewed evidence does not identify a human-food dish, replacement direction, middlings grade, or method.",
    "basis": "The manufacturer establishes a source-stated application lead, while USDA AMS defines wheat middlings as a mixture of milling fractions in a feedstuffs glossary. Neither source gives a product-matched food-recipe substitution instruction.",
    "limitations": [
      "Treat the manufacturer statement as a blocked application lead only; do not encode a supported food substitution.",
      "Do not infer direction, recipe role, quantity, ratio, hydration, or a preparation adjustment.",
      "Do not generalize from the feedstuffs definition to a human recipe or to all wheat middlings products.",
      "Do not merge Wheatlets with wheat middlings or add middlings terms as Wheatlets aliases.",
      "Do not create a global or contextual active rule without a product-matched food application and method."
    ],
    "sourceIds": [
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S03",
      "WP02-A7-WHEATLETS-SUBSTITUTION-R707-20261018-S01"
    ]
  }
}
```

No ingredient ID, source ID, finding ID, replacement owner, alias, form, recipe link, conversion, package yield, or active substitution rule is allocated by this proposal. No tests, builds, emulator runs, or deployment were performed.
