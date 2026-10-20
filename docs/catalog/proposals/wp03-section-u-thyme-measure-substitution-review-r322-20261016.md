# WP03 Section U R322 — Thyme measurement and substitution evidence

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal-only. This review writes only this proposal file. It does not edit the active reference catalog, forms, substitutions, research ledger, plan, roadmap, generated files, recipes, or integration documentation. No software tests, build, emulator, or deployment was run.
- **Checklist fit:** Section U of the global ingredient-catalog plan lists thyme with other culinary herbs and asks for “fresh/dried/frozen/paste/ground forms with independent measurement and substitution evidence” ([plan lines 7607–7636](../../RecipeBook-global-ingredient-catalog-plan.txt#L7625)). This review records evidence for the existing fresh- and dried-thyme references only; it does not complete the broader herb/forms checklist.
- **Reviewed identities:** `ingredient-ref-thyme` (`thyme / thym`), `ingredient-ref-dried-thyme` (`dried thyme / thym seche`), and `ingredient-ref-dried-thyme-leaves` (`dried thyme leaves / feuilles de thym séchées`), all category `HERB`.
- **Prior-work boundary:** The three ledger records have no prior sources, observations, findings, or decisions. No thyme-specific measurement or substitution proposal/integration was found. Nearby thyme mentions concern za’atar components, examples, or other ingredients and do not establish a thyme conversion. The legacy-import identity file contains no thyme candidate. No active form is attached to these references.
- **New source-ID prefix:** `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S`. S01–S06 were checked against the current ledger, proposals, and batches; no collision was found. Existing source IDs owned by the thyme records are absent.

## Recommended disposition

Keep the active catalog unchanged. Record the published portions as separate, historical source observations, but set `measurementState` to `blocked_pending_evidence` for the three references. Health Canada now identifies CNF 2026 as the current dataset and says the online CNF 2015 remains accessible as an interim measure; the exact 2026 thyme food and measure rows were not verified in this review. This is an evidence-freshness gap, not a claim that a current row is absent. [S04]

For substitution research, set `ingredient-ref-thyme` and `ingredient-ref-dried-thyme` to `researched_supported` with reciprocal, evidence-only findings for one published turkey formula. The source offers 1 tablespoon snipped fresh thyme **or** 1 teaspoon dried thyme, crushed, in its seasoning. Record each direction within that formula only. This is a recipe alternative, not a comparative test, flavor guarantee, or reusable conversion. Keep all active rules and recipe lines unchanged. [S06]

Set `ingredient-ref-dried-thyme-leaves` substitution research to `blocked_pending_evidence`: its narrower catalog identity has measure evidence, but the recipe source says “dried thyme, crushed” and does not resolve whether it belongs to the separate leaf-labelled reference. Do not reassign that recipe formula to the leaf-only identity without supporting evidence.

Add no default density, unit mapping, ingredient form, form conversion, contextual substitution rule, recipe-line link, alias, or display-name change. Keep CNF millilitres and USDA teaspoon/tablespoon portions as independent observations; do not average, scale, or turn them into kitchen conversions. The generic Health Canada “one-third dried in place of fresh” advice is useful context, but it does not name thyme and does not justify a thyme-wide rule. [S05]

## Measurement evidence

| Existing reference | Proposed evidence-only observations | Limits |
|---|---|---|
| `ingredient-ref-thyme` | CNF 2015 fresh thyme: 5 ml = 0.8 g and 15 ml = 2.4 g. USDA SR28 fresh thyme: 1 tsp = 0.8 g and 0.5 tsp = 0.4 g. [S01, S03] | Sources do not define the fresh sample’s cut, packing, or spoon method. CNF also prints “1 leaf = 4.0 g”; this is not proposed as a count observation because its meaning is unexplained and it is anomalous beside the volume portions. Do not label the CNF volume as chopped or whole-leaf thyme. |
| `ingredient-ref-dried-thyme` | CNF 2015 dried thyme, ground: 5 ml = 1.4 g and 15 ml = 4.4 g. USDA SR28 dried thyme, ground: 1 tsp = 1.4 g. [S02, S03] | Ground-state data only. These do not characterize the active dried-thyme recipe lines, which do not specify grinding or product. |
| `ingredient-ref-dried-thyme-leaves` | CNF 2015 dried thyme, leaves: 5 ml = 1.0 g and 15 ml = 2.7 g. USDA SR28 dried thyme, leaves: 1 tsp = 1.0 g and 1 tbsp = 2.7 g. [S02, S03] | These are source-named leaf portions, not evidence of a mass/volume density or an active conversion for unspecified dried thyme. |

The CNF figures come from the online 2015 pages, food codes 215 and 210. Health Canada describes that online surface as an interim measure while CNF 2026 is the current relational release. USDA SR28 is also historical (2015). Proposed observations should preserve their source descriptions, exact volume units, states, and versions. The two sources do not specify spoon capacity/fill/leveling method in the cited portion listings. No source supports a default density for any active identity. [S01–S04]

## Substitution evidence and boundaries

The University of Pennsylvania HR-hosted “Traditional Herbed Roast Turkey” recipe lists a 12–14 lb turkey and the seasoning alternative “1 tablespoon snipped fresh thyme or 1 teaspoon dried thyme, crushed.” It seasons the turkey cavity and outside and roasts it; the document credits *Diabetic Living* (2007) and is reproduced in a 2020 Association of Diabetes Care & Education Specialists holiday-recipe PDF. This supports two ledger findings scoped to that formula: fresh thyme to dried thyme at the stated amounts, and the reverse direction for the same stated alternative. The page does not report a side-by-side test, sensory outcome, or general substitution method. [S06]

Health Canada’s general herb guidance says dried herbs may often be used at one-third the fresh amount and gives 5 ml dried herbs for 15 ml fresh herbs. It also describes different best uses and timing for fresh and dried herbs. Because it does not name thyme, do not use that guidance to activate or widen the thyme formula finding. [S05]

Suggested ledger finding content, for review only:

```json
{
  "findingId": "thyme-roast-turkey-fresh-to-dried-r322",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-thyme",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-dried-thyme",
      "quantity": { "amount": 1, "unit": "tsp" }
    }
  ],
  "context": "Traditional Herbed Roast Turkey for a 12–14 lb turkey; the herb seasoning is put inside the cavity and on the exterior before roasting.",
  "basis": "The recipe lists 1 tablespoon snipped fresh thyme or 1 teaspoon dried thyme, crushed.",
  "limitations": [
    "One recipe formula and turkey-roasting process; not a controlled comparison or general herb conversion.",
    "The source does not state a flavor or performance outcome for choosing either option.",
    "The recipe says dried thyme, crushed; it does not establish a separate dried-thyme-leaves catalog link."
  ],
  "sourceIds": [
    "WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S06"
  ]
}
```

For the reverse finding under `ingredient-ref-dried-thyme`, use `findingId: thyme-roast-turkey-dried-to-fresh-r322`, `fromIngredientRefId: ingredient-ref-dried-thyme`, and replacement `ingredient-ref-thyme` at 1 tablespoon. Keep the same context, basis, limitation, and S06 source. These are ledger findings only; do not create a runtime `SubstitutionRule` or `ContextualSubstitutionRule`.

Do not mark frozen, paste, or a separate ground form as reviewed forms. The ingredient-forms file has no thyme form, and the cited ground/leaf measurements are source descriptions rather than authorization to create forms. No source reviewed here supports another thyme-to-thyme form conversion, an herb-for-herb replacement, or a substitution in any other recipe type.

## Catalog, picker, and bundle audit

The active rows remain exactly as stored: `thyme / thym` with aliases `fresh thyme / thym frais`; `dried thyme / thym seche`; and `dried thyme leaves / feuilles de thym séchées`. All have null `defaultDensity` and empty `unitMappings`. No forms are linked to them. The read-only ledger snapshot shows all three with identity `unreviewed`, measurement `not_yet_researched`, substitution `not_yet_researched`, and empty sources/observations/findings/decisions.

The current picker uses normalized phrase-first matching, then partial fallback. With the current references and no thyme forms, the static result projection is:

| Query | Current result IDs | Boundary |
|---|---|---|
| `thyme` or `thym` | `ingredient-ref-dried-thyme`, `ingredient-ref-dried-thyme-leaves`, `ingredient-ref-thyme` | Broad query returns all three existing rows. |
| `fresh thyme` or `thym frais` | `ingredient-ref-thyme` | Exact current fresh alias/display. |
| `dried thyme` | `ingredient-ref-dried-thyme`, `ingredient-ref-dried-thyme-leaves` | Existing overlapping broad and leaf-qualified identities. |
| `dried thyme leaves` or `feuilles de thym séchées` | `ingredient-ref-dried-thyme-leaves` | Qualified leaf identity. |
| `thym séché` | `ingredient-ref-dried-thyme` | Existing French display is stored as `thym seche`. |

The proposal adds no terms, so it does not change those results. In particular, it does not resolve the existing generic “dried thyme” overlap or the unqualified recipe row below.

The full manifest-listed bundle was scanned: **114 recipes and 1,123 structured ingredient rows**. Four rows directly link to the reviewed IDs:

| Recipe / line | Existing source text | Existing reference | Note |
|---|---|---|---|
| 037#4 | `1/2 tsp thyme` | `ingredient-ref-thyme` | No fresh/dried qualifier; keep the current link and amount. |
| 042#6 | `4 tsp dried thyme` | `ingredient-ref-dried-thyme` | No ground/leaf specification. |
| 043#5 | `1 tbsp dried thyme` | `ingredient-ref-dried-thyme` | Dry blend component; no separate form. |
| 078#6 | `1 tsp dried thyme` | `ingredient-ref-dried-thyme` | No ground/leaf specification. |

There is no bundled line linked to `ingredient-ref-dried-thyme-leaves`. Other text hits are not structured demand: recipe 041 notes an unlinked quiche variation adding 1 tsp thyme; recipe 076 notes that dried herbs such as thyme can be mixed into flour; recipe 111 has an optional grouped “fresh aromatics” line listing thyme without a quantity or separate reference. Recipe instructions mention thyme in recipes 037 and 078. None establishes the preparation state or supports editing a recipe line. No active global or contextual substitution rule mentions these IDs.

At the final read-only data snapshot on 2026-10-16, the catalog had 1,676 ingredient references, 127 forms, and 2,023 ledger records; the manifest listed 114 recipes with 1,123 ingredient rows. SHA-256 values for the checked files were:

| File | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `82eb822209d8325e304a89d6eb1958e0b909a378edc75d5da0de4dc75a0f3fb2` |
| `ingredient-forms.v1.json` | `aa10345fa769bb94f7827d6b7eaa52be865d4e608deb726b23f035d6bfd50cb2` |
| `research-ledger.v1.json` | `3b94fafbc6a31224fd0333f887a7cc543823182f560a8f2595378172258f8d12` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Proposed ledger state summary

| Record | Measurement state | Substitution research state | Proposed changes |
|---|---|---|---|
| `ingredient-ref-thyme` | `blocked_pending_evidence` | `researched_supported` | Add four separately described historical fresh-thyme portion observations and one fresh-to-dried turkey-formula finding. |
| `ingredient-ref-dried-thyme` | `blocked_pending_evidence` | `researched_supported` | Add three separate historical ground-thyme observations and one dried-to-fresh turkey-formula finding. |
| `ingredient-ref-dried-thyme-leaves` | `blocked_pending_evidence` | `blocked_pending_evidence` | Add four separate leaf-thyme observations. Keep substitution state blocked until a source resolves whether the recipe’s “dried thyme, crushed” matches this distinct row. |

All proposed observations are research-ledger evidence only. Leave `identityState` unchanged, and leave active references, aliases, mappings, forms, recipes, and rules unchanged. The broad Section U forms-and-evidence checklist remains open for independent sources and any future evidence on frozen, paste, or explicitly ground products.

## Evidence register

Sources accessed 2026-10-16. The S01–S06 source IDs below are new R322 IDs; existing identity-source ownership is unchanged.

| ID | Source | Direct support and limitations |
|---|---|---|
| **S01 — `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S01`** | Health Canada, [Canadian Nutrient File serving portion, Food Code 215](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=215). | Names “Spices, thyme, fresh / Épices, thym, frais”; reports 5 ml = 0.8 g, 15 ml = 2.4 g, 1 leaf = 4.0 g, and 32% stems/refuse. The leaf count is recorded in this review as an unexplained source entry, not a proposed count observation. This is the online CNF 2015 surface. |
| **S02 — `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S02`** | Health Canada, [Canadian Nutrient File serving portion, Food Code 210](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=210). | Names “Spices, thyme, dried / Épices, thym, déshydraté”; separately reports 5 ml = 1.4 g and 15 ml = 4.4 g for ground thyme, and 5 ml = 1.0 g and 15 ml = 2.7 g for leaves. This is the online CNF 2015 surface; no brand or spoon-fill method is stated. |
| **S03 — `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S03`** | USDA Agricultural Research Service, [Standard Reference Release 28, Food Group 02: Spices and Herbs](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), NDB 02049 and 02042. | Fresh thyme: 1 tsp = 0.8 g and 0.5 tsp = 0.4 g. Dried thyme: 1 tsp leaves = 1.0 g, 1 tbsp leaves = 2.7 g, and 1 tsp ground = 1.4 g. Release 28 is 2015; the measure table does not state brand or fill/leveling method. Preserve its tsp/tbsp quantities separately from CNF millilitres. |
| **S04 — `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S04`** | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Identifies CNF 2026 as the current downloadable relational dataset and states that online CNF 2015 remains accessible as an interim measure. The exact current thyme food/measure rows were not inspected in this review. |
| **S05 — `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S05`** | Health Canada, [Best uses for fresh and dried herbs](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/best-uses-fresh-dried-herbs.html). | Gives general one-third dry-for-fresh guidance and 5 ml dried/15 ml fresh example; provides general use/timing advice. It does not name thyme; do not turn it into a thyme-specific rule. |
| **S06 — `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S06`** | University of Pennsylvania Human Resources, [Healthier Holiday Recipes PDF](https://www.hr.upenn.edu/docs/default-source/wellness/healthy-holiday-recipes_cwn.pdf?Status=Master&sfvrsn=4b119656_5%2FHealthy-Holiday-Recipes_CWN.pdf), “Traditional Herbed Roast Turkey,” pp. 3–4. | For a 12–14 lb turkey, lists 1 tablespoon snipped fresh thyme or 1 teaspoon dried thyme, crushed; instructions season the cavity and exterior before roasting. The PDF credits *Diabetic Living* (2007) and is copyright 2020 Association of Diabetes Care & Education Specialists. It is one recipe formula, not a comparative test or general substitution authority. |

## Review limitations

- The exact CNF 2026 thyme rows and serving-measure method remain unchecked. Historical 2015 observations are therefore retained only as source-specific research evidence with `blocked_pending_evidence` measurement states.
- The CNF fresh-thyme `1 leaf = 4.0 g` entry is reported by the page but its meaning is unclear and inconsistent with the nearby spoon portions. It should not become a reusable count observation without source clarification.
- USDA and CNF portions use different displayed units and potentially different samples. Do not average or scale them into equivalent values. Spoon mass portions are not a density.
- The roast-turkey recipe provides an explicit alternative within one formula, but no controlled comparison or substitution outcome. It supports no app-wide or other-recipe rule.
- Existing broad and leaf-qualified dried-thyme references overlap in the picker. This review records the state ambiguity but does not merge or rename catalog identities.

## Static review only

Read-only checks covered `AGENTS.md`, `Requirements.md`, the Section U checklist, live references/forms/ledger and ledger schema, legacy candidates, prior proposals/batches and source-ID ownership, picker search behavior, active substitution records, and every manifest-listed recipe file. The proposal adds no new recipe demand or app behavior. No software tests, build, emulator, or deployment were run, as directed for this proposal-only task.
