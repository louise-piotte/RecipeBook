# WP02 Section A7 R969: brewers' spent grain flour identity review

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only generic ingredient review. No shared catalog, ledger, recipe, plan, roadmap, or checklist data was changed.
- **Open-plan anchor:** Section A7 remains open to other grain meals and milling products ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). The latest [R966–R968 integration](../batches/wp02-wp03-wp05-r966-r968-generic-gap-integration-20261019/README.md) retained the rice-germ name hold and integrated two unrelated generic identities.
- **Selected gap:** Flour made from brewers' spent grain, a dried and milled cereal residue from brewing.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference if accepted. The Québec government source directly uses `farine issue de drêches de brasserie` for a human-food reuse example, and primary food studies use brewers' spent grain as a baking ingredient. These establish a recognizable process-defined ingredient and a supported Québec French display. They do not establish a standard grist, grade, retail prevalence, household measure, or replacement ratio.
- **Scope:** Generic culinary ingredient diversity only. Do not add brewer, product-line, flavor, SKU, or retailer rosters. Preserve existing branded entries and product-scoped evidence.
- **Proposal-local source IDs:** `WP02-A7-BSG-FLOUR-R969-20261019-S01` through `S04`; the four IDs and URLs were checked against the live ledger and are unallocated.

## Candidate identity and boundary

The proposed ingredient is flour made from cereal solids left after brewing mash is filtered to separate wort. The identity is defined by that process residue after drying and milling, not by one grain species or one brewery's recipe. Brewing grists can vary; this proposal does not assign a universal barley, wheat, or other cereal composition. The reviewed primary study specifically used barley brewers' spent grain, so its materials and results remain limited to that sample.

Keep the candidate separate from:

- fresh or wet, unground brewers' spent grain; the proposal covers flour made from spent grain, not a home drying or storage method;
- distillers' grains and dried distillers grains with solubles, which come from a different production stream;
- spent hops, brewer's yeast, brewing trub, malt sprouts, barley bran, wheat bran, and ordinary malt or barley flour;
- BSG-derived protein, fibre, extracts, isolates, and blended bakery products containing BSG flour;
- named branded or upcycled flour products, unless each identity and its evidence are separately reviewed.

Brewers' spent grain is not simply bran. The 2020 study describes its particular barley sample as mainly husk with smaller pericarp and endosperm fragments and notes that brewing inputs and processing affect composition [S03]. Preserve that study-specific description; do not apply it as a universal composition specification or transfer it to another brewing by-product.

## Québec naming and recipe demand

RECYC-QUÉBEC lists flour made from brewery spent grains as an example of food reuse for human consumption [S01]. This supports the proposed French display `farine issue de drêches de brasserie` with wording directly attested in Québec. The OQLF GDT record gives `drêche sèche` and related French forms for the brewery-filtration material, with English `dried brewers grain`; its older technical note is not evidence of culinary use or a food substitution [S02]. The French display remains descriptive, not an OQLF term approval.

The package search found no recipe ingredient row or complete recipe file containing the candidate, the French display, or the reviewed spent-grain phrases. The identity is supported by the Québec institutional example and primary food research, not by demand in the current bundled recipes. If accepted, do not add a recipe link or a formula-derived quantity.

## Current ownership and demand scan

Read-only scan of the live split seed and research ledger on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | 1,986 references. No exact owner for `ingredient-ref-brewers-spent-grain-flour`, brewers' spent-grain flour, spent-grain flour, or the proposed French display. The nearest cereal milling rows include barley/corn/wheat brans, malt and barley flours, and other grain-derived meals. | No merge, rename, alias transfer, or existing row change. If accepted, add one separate flour identity. |
| Ingredient forms | 205 forms. No form owns the proposed ID or spent-grain flour wording. | Add no form. The studies do not define a reusable wet/dry or flour-grade form set. |
| Legacy import identities | 55 candidates. No exact or normalized candidate wording or proposed ID was found. | No legacy promotion or resolution is proposed. |
| Research ledger | 2,391 records, 9,425 distinct source IDs, and 8,020 distinct source URLs. No candidate identity, candidate wording, or proposed ID is allocated. All four R969 source IDs and URLs are unowned. | Create one identity record with the scoped sources only if accepted. Do not alter evidence attached to any bran, germ, malt, meal, or branded entry. |
| Bundled recipe corpus | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. There were zero file matches and zero ingredient-row matches for the candidate, French display, proposed ID, and reviewed English/French variants. | No recipe demand, quantity, or recipe link supports the addition. |
| Archive and queue | No focused prior brewers' spent-grain-flour review was found in the catalog proposals, batches, active plan, or roadmap. The named Anson Mills wheat-meal lead remains out of scope because commercial-product counts do not add ingredient diversity. | Review this single generic candidate; do not pursue the named wheat-meal product or commercial-product rosters. |

## Source evidence and limits

| Proposal-local source ID | Source and supported finding | Scope limit |
|---|---|---|
| `WP02-A7-BSG-FLOUR-R969-20261019-S01` | RECYC-QUÉBEC, [Réemploi et suprarecyclage](https://www.recyc-quebec.gouv.qc.ca/municipalites/matieres-organiques/suprarecyclage), section « Nourrir des gens »; accessed 2026-10-19. Gives flour made from brewery spent grains as an example of reusing food by-products for human food. | Québec institutional evidence for the human-food context and display wording; not a product specification, standardized recipe ingredient grade, or measure. |
| `WP02-A7-BSG-FLOUR-R969-20261019-S02` | Office québécois de la langue française, [GDT: drêche sèche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898327/dreche-seche), dated 1982. Lists `drêche sèche`, related French terms, and English `dried brewers grain`; the domain is brewery filtration of spent grains. | Supports the Québec French lexical base only. Its older technical note does not establish human-food use, the proposed flour name, or a transferable bran substitution. |
| `WP02-A7-BSG-FLOUR-R969-20261019-S03` | Tiziana Amoriello et al., [“Technological Properties and Consumer Acceptability of Bakery Products Enriched with Brewers’ Spent Grains”](https://pmc.ncbi.nlm.nih.gov/articles/PMC7603150/), *Foods* 9(10) (2020), 1492, DOI [10.3390/foods9101492](https://doi.org/10.3390/foods9101492), especially Materials and Methods §§2.1–2.4. A primary study dried fresh barley BSG from one craft brewery, milled and sieved it as fine flour, and tested it in bread, breadsticks, and pizza. | Direct identity and human-food-use evidence for the studied barley BSG flour. Drying, moisture endpoint, particle size, formula levels, composition, rheology, sensory results, and product performance are sample- and method-specific. Do not turn the experimental blends into general recipe advice or nutrition claims. |
| `WP02-A7-BSG-FLOUR-R969-20261019-S04` | E. Ktenioudaki et al., [“Brewer’s spent grain as a functional ingredient for breadsticks”](https://doi.org/10.1111/j.1365-2621.2012.03032.x), *International Journal of Food Science & Technology* 47(8) (2012), 1765–1771. The primary study evaluates BSG as an ingredient in baked breadsticks. | Corroborates a second human-food application; its test formulations and reported product properties are study-specific and do not set a general use level or substitution rule. |

No manufacturer or retailer product page, branded measure, or product-only claim is used to define the generic identity. No such evidence is transferred from existing branded rows.

## Proposed minimal state if accepted

```json
{
  "id": "ingredient-ref-brewers-spent-grain-flour",
  "nameEn": "brewers' spent grain flour",
  "nameFr": "farine issue de drêches de brasserie",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Keep both alias lists empty. The proposed English and French displays are source-supported; no additional synonym is needed to define this process-specific flour. Do not add an `IngredientForm`, recipe link, household measure, density, unit mapping, cooking yield, conversion, or active substitution.

If a ledger identity record is accepted, use:

- `recordId`: `ingredient-ref-brewers-spent-grain-flour`
- `recordType`: `ingredient_reference`
- `identityState`: `verified`, supported by the Québec human-food example and primary food studies;
- `measurementState`: `researched_no_supported_value`; source-study drying endpoints, particle size, analytical values, and ingredient-to-flour processing are not kitchen measures or reusable density evidence;
- `substitutionResearchState`: `blocked_pending_evidence`; the studies use BSG in particular bakery formula blends, but do not establish a generally applicable replacement direction, amount, or adjustment for recipes.

Do not activate or generalize the studies' flour-blend percentages, recipe formulas, drying parameters, or food-composition findings. No density, mass/volume conversion, yield, or substitution ratio is supported for ordinary recipes.

## Cross-category scope and unresolved limits

This review concerns one generic milling ingredient. No brand, product-line, flavour-family, SKU, retailer-variant, or named-product roster was researched. The plan's Anson Mills lead remains out of scope because another commercial product does not add ingredient diversity; preserve its historical evidence without pursuing it. Existing branded entries remain intact, and product-specific measurements or claims require their own transferability review before reuse.

The studies establish food-use research, not routine consumer availability, a standard brewery grist, or one universal drying/milling specification. Those limits do not prevent an identity-only row for the process-defined flour, but they do prevent claims about composition, market prevalence, measurement, nutritional benefit, or recipe equivalence. Keep the identity distinct from fresh spent grain and all other brewing and distilling by-products.

## Proposal checks

- Recounted live data: 1,986 references, 205 forms, 55 legacy candidates, 2,391 ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows.
- Audited normalized name and ID ownership across references, aliases, forms, legacy candidates, ledger records, recipe files, recipe ingredient rows, prior proposals, batches, plan, and roadmap; no owner or focused prior review was found.
- Checked the four proposal-local source IDs and URLs against current ledger sources; all are unallocated.
- No software tests, build, emulator run, or deployment were performed because this is a proposal-only document.
