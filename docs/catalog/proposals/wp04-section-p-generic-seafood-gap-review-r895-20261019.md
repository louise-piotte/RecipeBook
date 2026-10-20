# WP04 Section P — generic abalone / ormeau name-group review (R895)

- **Review date:** 2026-10-19.
- **Status:** Accepted and integrated on 2026-10-19. The review was proposal-only when submitted; root added a separate qualified reference and ledger record in the R893–R895 integration batch, preserving the existing held candidate unchanged.
- **Open plan anchor:** [Sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood](../../RecipeBook-global-ingredient-catalog-plan.txt#L9303). Its earlier abalone child review remains recorded at [plan line 9319](../../RecipeBook-global-ingredient-catalog-plan.txt#L9319).
- **Prior decision:** `candidate-abalone-species-product-boundary` remains unchanged and unresolved. The new active identity is verified only for the visibly qualified repeated-label group.
- **Recommendation:** Add one separate identity-only, visibly qualified label-name group: `abalone (name used for multiple abalone species) / ormeau (nom utilisé pour plusieurs espèces d’ormeaux)`. Preserve the prior candidate and all of its sources because its existing supplier and product evidence does not transfer to this label group. The new row records repeated Canadian English/French fish-label wording. It is not a taxon, an exhaustive species list, a sale or harvest authorization, or a claim of culinary equivalence.

## Why reopen the prior hold

The 2026-10-11 review appropriately kept bare `abalone / ormeau` out of active references because a species-neutral identity would obscure species and product differences, and Northern Abalone is protected. This proposal narrows the concept to the repeated exact label pair `Abalone / Ormeau` shown for multiple taxa in the CFIA Fish List. The visibly qualified display describes that label-name overlap; it does not resolve a recipe or package to a species.

OQLF separately supports `ormeau` as the preferred Québec term in the edible-mollusc domain and gives English `abalone` and Latin *Haliotis* sp. Health Canada’s mixed-species raw-abalone food-composition entry independently documents abalone as an edible-food category. Together these support a useful generic culinary search identity distinct from clams, scallops, whelks, conch, and other gastropods. They do not establish a species-neutral product state or make the listed species interchangeable. [Reused `WP04-ABALONE-20261011-S01`; R895-S01 and R895-S02 below.]

The integration preserves the old candidate’s unresolved decision and its source history. It adds a separate search identity for the repeated, visibly qualified CFIA label pair; no supplier-specific source claim or measurement is transferred. The old review’s species and product boundaries remain applicable.

## Evidence for the bounded name group

The CFIA Fish List currently shows the exact English/French pair `Abalone / Ormeau` for multiple distinct rows, including *Haliotis laevigata*, *H. roei*, *H. rufescens*, and *Haliotis* spp. The same table also contains narrower or differently paired labels, including `Pink Abalone / Ormeau rose`, `Abalone / Ormeau Nordique`, and `Red Abalone / Ormeau rouge`. The proposed group covers only the repeated exact pair. The CFIA list is Canadian fish-labelling evidence, not a culinary-equivalence list, complete market census, or proof that each listed species may be harvested, imported, or sold.

CFIA’s naming guidance says that Fish List common names are tied to fish species, and that group names covering multiple species may be considered through its Fish List process. This supports treating the repeated wording as a bounded name group for search. It does not turn the proposed catalog display into an official CFIA group name or establish shared taste, preparation, safety, serving size, yield, or substitution behavior. [Reused `WP04-ABALONE-20261011-S03`.]

The dynamic Fish List query endpoint did not open directly in the browser tool. During integration, root rechecked the current official indexed results table, which continues to display the repeated exact pair for *H. laevigata*, *H. roei*, *H. rubra*, *H. rufescens*, and *Haliotis* spp. The current-table recheck is recorded as `R895-S03`; the dynamic endpoint limitation remains documented.

## Integrated reference data

Keep the existing candidate unchanged and add the following active reference; do not create another candidate or overwrite an active species or product entry.

```json
{
  "id": "ingredient-ref-abalone-market-group",
  "nameEn": "abalone (name used for multiple abalone species)",
  "nameFr": "ormeau (nom utilisé pour plusieurs espèces d’ormeaux)",
  "aliasesEn": ["abalones"],
  "aliasesFr": ["ormeaux"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The plural terms are search inflections for the same qualified display. The French qualifier is catalog-authored explanatory wording, not a compound term endorsed by OQLF; independent Québec review remains useful.

Do not alias `northern abalone`, `ormeau nordique`, `Japanese abalone`, `red abalone`, other species names, *Haliotis*, `pāua / paua`, `sea ear`, `oreille de mer`, `sea snail`, `shellfish`, or `seafood`. OQLF says `oreille de mer` was not retained by Québec’s fish-product terminology committee, and the reviewed evidence does not establish `pāua / paua` as a generic alias. The active `paua` query currently reaches the unrelated flattened-rice (`poha`) reference; keep that existing result unchanged.

Add one separate `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Keep the original candidate, its unresolved decision, all eight source entries, and its measurement/substitution states unchanged. The new record may reuse the OQLF, CFIA naming-guidance, and DFO species-boundary sources; do not copy the candidate’s supplier evidence. Keep CNF values tied to Food Code 3107. Add no form, household measure, density, unit mapping, package relationship, conversion, edible or cooking yield, recipe link, or substitution.

## Current ownership and picker projection

The proposal-time snapshot, before the R893–R895 integration, had **1,921 active ingredient references**, **201 forms**, **56 legacy identities**, and **2,324 research-ledger records** with **10,965 source entries** and **9,206 distinct source IDs**. It contained no active reference, form, or legacy identity for `abalone`, `abalones`, `ormeau`, `ormeaux`, *Haliotis*, or the proposed target ID. The only exact candidate owner was `candidate-abalone-species-product-boundary`, with `identityState: needs_clarification`; it already owned the prior OQLF, CFIA, DFO, CNF, and manufacturer source observations. [R01]

Picker results follow [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, punctuation, and spacing; prefer complete word-phrase matches; use substring matching only when there is no phrase match. The projection is:

| Query | Current active results | With proposed group | Boundary |
|---|---:|---:|---|
| `abalone` / `abalones` | 0 / 0 | 1 / 1 | Reaches only the visibly qualified name group. |
| `ormeau` / `ormeaux` | 0 / 0 | 1 / 1 | Reaches the catalog-authored qualified French group; the compound still needs independent Québec review. |
| Full English or French qualified display | 0 | 1 each | Selects only the proposed group. |
| `Haliotis`, `northern abalone`, `ormeau nordique`, `Japanese abalone`, `red abalone` | 0 | 0 | No scientific or species-specific alias is added. |
| `paua` / `pāua` | 1 / 1 | 1 / 1 | The current poha result is unchanged; neither spelling is added as an alias. |
| `oreille de mer`, `sea ear`, `sea snail`, `shellfish`, `seafood` | 0 | 0 | No broad, unretained, or unsupported term is added. |

The group would add one generic mollusc ingredient-search concept to a catalog that already represents distinct shellfish and other gastropods. It would not collapse or replace any neighboring identity.

## Bundled recipe demand

The manifest lists **114 recipes and 1,123 structured ingredient rows**. A read-only scan of every listed recipe JSON file, the full serialized recipe text, and the ingredient-row objects searched for `abalone`, `abalones`, `ormeau`, `ormeaux`, *Haliotis*, `pāua / paua`, `sea ear`, and `oreille de mer`. The scan found **zero matching recipe files and zero matching ingredient rows**. There is no recipe amount, product state, species, ingredient link, or substitution to infer. This proposal recommends identity coverage only; no recipe behavior follows.

## No-transfer and scope boundaries

- The candidate’s previous CNF observation is Food Code 3107 for **raw mixed-species abalone**; the page lists a 100 g edible portion and a 90 g food-guide serving. Keep those values scoped to that code and its named basis. Do not add them as measures, portions, or conversions for the proposed identity. The prior candidate’s source entry remains intact; this review cites the current public page only as a proposal source. [R895-S02.]
- Preserve the manufacturer-source observations on their original candidate record. Any package amount, weight, count, product state, formula, or claim from those named products stays attached to that source and product; this review did not inspect or generalize them.
- DFO identifies Northern Abalone (*Haliotis kamtschatkana*) as endangered under SARA, advises consumers not to buy or eat it, and states its harvest is prohibited in British Columbia. Keep `Northern Abalone / Ormeau Nordique` excluded from aliases and from any inferred group membership. These restrictions apply to that species and jurisdiction; the proposed row does not authorize purchase, sale, import, or harvest of any species. [Reused `WP04-ABALONE-20261011-S05`.]
- Keep shell-on product, cleaned edible tissue, raw, cooked, frozen, canned, sauced, extract, shell, and composite preparations distinct until an exact ingredient or product specification supports a separate review. Add no form or product identity here.
- Preserve all current branded and product-specific entries and their evidence. Do not delete, merge, or generalize them through this proposal; any later evidence transfer needs its own explicit transferability review.
- This is generic ingredient-diversity work, not a brand, product-line, flavour-family, SKU, manufacturer, or retailer-variant roster. No roster-only queued item was encountered in this Section P assignment, and no commercial-product roster was researched. Any such roster-only line remains out of scope because commercial-product counts do not add ingredient diversity.

## Source and ownership register

The source IDs marked “reused” already exist on the unresolved abalone candidate and are referenced by the separate label-group record without moving or changing their source entries. Integration added the three R895 source entries to the new record; the original candidate retains all eight of its prior sources. The current CNF route is distinct from the legacy URL stored under the old candidate’s source ID; the latter remains untouched.

| Source | Supports and limits |
|---|---|
| **R895-S01 — CFIA Fish List abalone lookup**, [results query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=abalone), checked 2026-10-19. | Current result rows show the exact pair `Abalone / Ormeau` for multiple *Haliotis* taxa, including *H. laevigata*, *H. roei*, *H. rufescens*, and *Haliotis* spp. Other rows have narrower labels. The dynamic query did not open directly; the official current results table displayed the rows after opening its indexed result. Recheck live rows at integration. Label scope only, not culinary equivalence or product authorization. |
| **R895-S02 — Health Canada, [Canadian Nutrient File, Food Code 3107](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3107), rechecked 2026-10-19.** | Identifies “Mollusks, abalone, mixed species, raw / Mollusques, ormeau, espèces diverses, crues.” It also lists 100 g edible portion and a 90 g food-guide serving; both remain scoped to this code and its raw edible-portion basis. This source is not a reusable measurement for the proposed identity. The old candidate’s CNF source record remains unchanged. |
| **R895-S03 — root current-table recheck**, [CFIA Fish List results table](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), accessed 2026-10-19. | The current official indexed table repeats `Abalone / Ormeau` for *H. laevigata*, *H. roei*, *H. rubra*, *H. rufescens*, and *Haliotis* spp. The direct dynamic query URL did not open in the browser tool; this recheck supports the bounded label group only. |
| **Reused `WP04-ABALONE-20261011-S01` — OQLF, [ormeau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198910/ormeau), updated 2012; rechecked 2026-10-19.** | Prefers `ormeau` in the edible-mollusc domain; gives English `abalone` and Latin *Haliotis* sp. It says `abalone` and `oreille de mer` were not retained by the fish-products terminology committee. It does not endorse the proposed explanatory compound display. |
| **Reused `WP04-ABALONE-20261011-S03` — CFIA, [guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; rechecked 2026-10-19.** | Sections 4 and 5.2.2 explain that Fish List common names are species-linked Canadian label names and that group names covering multiple species may be considered. This guidance does not approve the catalog display or define recipe equivalence. |
| **Reused `WP04-ABALONE-20261011-S05` — Fisheries and Oceans Canada, [Protecting British Columbia’s Northern Abalone](https://www.pac.dfo-mpo.gc.ca/fm-gp/shellfish-mollusques/docs/northern-abalone-ormeaux-nordique-eng.html), updated 2023-11-09.** | Northern Abalone is endangered under SARA; consumers are told not to buy or eat it, and harvest is prohibited in British Columbia. This evidence is species- and jurisdiction-specific and is not generalized to all abalone. |
| **R01 — repository audit.** | Read-only review of Section P plan status, active references and forms, legacy identities, the existing candidate and source owners, picker implementation, scope review, recipe manifest, and every manifest-listed recipe. Supports current ownership and demand only. |

## Files reviewed

`AGENTS.md`; the open Section P parent and earlier abalone hold in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9303); the [prior abalone review](wp04-abalone-ormeau-species-product-boundary-review-20261011.md); the [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md); active references and forms; legacy identities; the existing abalone candidate and its source entries; the recipe manifest and all 114 listed recipes; and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

## Recommendation

Add `ingredient-ref-abalone-market-group` as `abalone (name used for multiple abalone species) / ormeau (nom utilisé pour plusieurs espèces d’ormeaux)`, using the plural search inflections shown above. Preserve the prior candidate and its unresolved decision, retain Northern Abalone’s protected boundary, and keep all existing product-specific quantities scoped to their original sources. The new reference receives only evidence reviewed for the bounded label-name group; supplier-specific evidence is not transferred. Add no forms, measurements, recipes, conversions, yields, or substitutions. Section P remains open.
