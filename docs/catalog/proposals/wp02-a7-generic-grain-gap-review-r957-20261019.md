# WP02 A7 R957: barley middlings identity review

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes no shared catalog, ledger, plan, roadmap, checklist, or recipe data.
- **Open-plan anchor:** The A7 parent remains open for other grain meals and milling products, including the unresolved generic wheat-meal candidate ([active plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Candidate:** Generic, food-grade **barley middlings**, a distinct intermediate milling fraction of barley.
- **Recommendation:** If accepted, add one identity-only `GRAIN_AND_CEREAL` reference for barley middlings intended for human food. Primary food research defines the fraction and uses it in bread formulations. The studies do not establish a universal milling specification, household measure, or transferable substitution ratio.
- **Scope:** Generic culinary ingredient diversity across all ingredient types. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. The already-listed follow-up on a named wheat-meal product is out of scope because commercial-product counts do not add ingredient diversity; no further product research was done. Existing branded rows and product-scoped evidence remain untouched.

## Identity boundary

Limit the proposed identity to barley middlings prepared as a human-food ingredient. The 2011 study describes a milling fraction that contains particles too large to pass flour sieves but small enough to pass bran-separation sieves. Depending on the milling stream, it can contain germ, larger endosperm particles, and smaller pericarp, aleurone, and subaleurone particles. This is a mixed intermediate fraction, not a synonym for any one of those tissues.

Keep the candidate separate from:

- `ingredient-ref-barley-bran` (`barley bran / son d'orge`), `ingredient-ref-barley-germ`, barley flour, grits, semolina, and starch;
- feed-grade barley middlings or other feed by-products, which are not established as human-food ingredients by the cited studies;
- wheat middlings and their source- or product-scoped evidence.

The prior barley-bran review explicitly excluded `barley middlings` from barley-bran aliases because it can denote a different milling fraction or a feed by-product ([R89 review](wp03-section-f-r89-next-grain-review-20261013.md)). This proposal preserves that boundary: do not add middlings as an alias to the bran row or merge, rename, delete, or generalize any existing row or evidence.

## Ownership and recipe-demand scan

Read-only scan of the current repository on 2026-10-19:

| Surface checked | Current state | Proposal consequence |
| --- | --- | --- |
| Ingredient references | 1,975 references. No owner for `ingredient-ref-barley-middlings`, `barley middlings`, `barley middling`, or the proposed French display. Related barley identities include barley, barley bran, barley germ, barley flour, barley grits, barley semolina, and barley starch. | A single separate identity is unowned. Preserve every existing barley row and its aliases and evidence. Add no aliases. |
| Ingredient forms | 205 forms. No form matches the candidate or proposed ID. | Add no form; the sources do not define a reusable form taxonomy. |
| Legacy import candidates | 55 candidates. No exact candidate wording or proposed ID. | No legacy promotion, merge, or alias transfer is proposed. |
| Research ledger | 2,380 records. No candidate identity record, barley-middlings term, proposed ID, or ownership of either cited DOI/source URL. A prior wheat-middlings application lead remains wheat-specific and source-scoped; it is not transferred or pursued here. | Allocate the two proposal-local sources to a new identity record only if accepted. Leave all existing records and product-specific findings unchanged. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows for the candidate terms, proposed French display, and ID. There were zero file matches, zero ingredient-row matches, and no direct links. | No recipe demand, quantity, or recipe link supports the addition. |
| Nearby A7 decisions | R948 covered a separate corn-germ flour; R951 held sorghum germ because the reviewed evidence did not establish standalone human-food use; R954 added Tartary buckwheat bran flour. R89 kept barley middlings out of the barley-bran alias set. | None owns barley middlings. Retain those decisions and their source limits. |

The open A7 checklist has no new brand- or retailer-roster assignment. Further research on the named wheat-meal product is already marked out of scope in the plan and prior reviews because commercial-product counts do not add ingredient diversity. This proposal does not revisit it.

## Primary evidence and limits

| Proposal-local source ID | Source and evidence | Limits |
| --- | --- | --- |
| `WP02-A7-BARLEY-MIDDLINGS-R957-20261019-S01` | Sullivan et al., [“The utilisation of barley middlings to add value and health benefits to white breads”](https://www.sciencedirect.com/science/article/abs/pii/S0260877411001361), *Journal of Food Engineering* 105(3) (2011), 493–502, DOI [10.1016/j.jfoodeng.2011.03.011](https://doi.org/10.1016/j.jfoodeng.2011.03.011). The primary study defines the mixed middlings fraction from milled wholegrain and pearled barley and uses it in wheat-bread formulations. | Direct evidence for a distinct barley milling fraction and a human-food use. The sieving description is from this study, not an industry-wide standard. Milling streams, samples, ingredient proportions, dough and bread results, and any reported nutritional outcomes remain specific to the study. Do not generalize its blend ratios as recipe substitutions or make health claims. The paper says barley middlings were not widely used in human foods and were more commonly used in animal feed at the time; this proposal therefore excludes feed-grade material and makes no retail-prevalence claim. |
| `WP02-A7-BARLEY-MIDDLINGS-R957-20261019-S02` | Sullivan et al., [“Chemical composition and microstructure of milled barley fractions”](https://openurl.ebsco.com/contentitem/gcd%3A47481315?crl=c&id=ebsco%3Agcd%3A47481315&jrnl=14382377&sid=ebsco%3Aplink%3Acrawler-gcd), *European Food Research & Technology* 230(4) (2010), p. 579 onward, DOI [10.1007/s00217-009-1196-8](https://doi.org/10.1007/s00217-009-1196-8). Its abstract reports roller-milling wholegrain and peeled/pearled barley into separately identified endosperm, middlings, and bran fractions. | Corroborates a distinct milling-fraction boundary for the studied barley streams. It does not establish a universal grade, composition, human-food retail use, or French term. The reported samples and analytical results remain study-specific. |

Both sources are primary studies by the same research group, not independent evidence of a standardized consumer ingredient. The sources support an identity-level proposal only. No manufacturer claim or product-specific measurement is used.

## Proposed minimal data and ledger state

If accepted, add only the following identity row:

```json
{
  "id": "ingredient-ref-barley-middlings",
  "nameEn": "barley middlings",
  "nameFr": "fraction intermédiaire de mouture d’orge",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The French display is a provisional descriptive rendering of the fraction, not a Québec terminology ruling or an alias. The cited research does not establish a preferred Québec culinary term; review the display separately before treating it as settled.

Proposed ledger disposition, if accepted:

- `recordId`: `ingredient-ref-barley-middlings`
- `recordType`: `ingredient_reference`
- `identityState`: `verified`, supported by S01–S02 for a distinct barley fraction and direct human-food research use.
- `measurementState`: `researched_no_supported_value`; no transferable household measure, density, unit mapping, conversion, or yield is supported. Keep all study quantities, compositions, and results attached to their cited source.
- `substitutionResearchState`: `blocked_pending_evidence`; experimental bread blends do not establish a general replacement direction or rule for recipes.
- Add only one identity decision and the two source records above. Add no aliases, forms, measures, density, mappings, conversions, yields, recipe links, or substitutions.

## Remaining uncertainty

1. The cited studies establish research use, but do not show current retail prevalence or ordinary household use.
2. The sieving definition and mixed tissue composition are study- and process-scoped; no universal barley-middlings grade is established.
3. The proposed French display remains provisional and has no direct Québec terminology source.
4. The recipe corpus has no demand for this ingredient. No study proportion is promoted into a recipe rule or reusable measurement.

Recommend one generic, identity-only barley-middlings entry if the proposal is accepted. Keep it distinct from barley bran and every other current barley identity, preserve the existing product-scoped wheat evidence, and leave all quantitative, alias, recipe, and substitution data empty. No tests were run because this is proposal-only.
