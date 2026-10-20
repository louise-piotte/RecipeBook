# WP04 Proposal: Blueberry-Pie Crust Count and Portion Review

**Review date:** 2026-10-10
**Status:** Coordinator integration completed 2026-10-10; see the integration note below.
**Scope:** One exact count line, Blueberry Pie `106#1`: `1 raw 5-inch pie crust, plus extra dough for the top crust`.

## Disposition

Keep the recipe line at `1 count` and leave its count-to-mass portion unavailable. The bundled source identifies a raw 5-inch shell and additional top-crust dough, but the accessible publisher recipe is for a 9-inch double-crust pie. The linked current pie-crust recipe also yields two 9-inch crusts. Neither source reports a mass for one raw 5-inch shell or for the bottom shell plus its top dough. The local linked component recipe names four 5-inch shells but has variable added water and optional sugar, no reported batch mass, and no per-shell weight; it cannot supply a direct portion observation.

Recommend **blocked pending an exact product- and size-matched portion source**. Preserve the saved wording, quantity, and reference. Do not derive mass from the current 9-inch recipe, scale by pan diameter or area, divide the component recipe's ingredient weights by its stated shell count, infer baked mass, or turn the count into a generic conversion, density, package yield, or substitution.

## Exact recipe demand and catalog state

| Field | Current evidence |
|---|---|
| Recipe | `106` — Blueberry Pie / *Tarte aux bleuets*; bundled file records Preppy Kitchen as source. |
| Ingredient line | `477572c0-6d31-4ba2-a7ae-20c4dde12e93-ingredient-1` (`106#1`). |
| Exact text | `1 raw 5-inch pie crust, plus extra dough for the top crust`. The English note calls it a “5-inch sweet pie shell, plus extra dough for the top crust.” |
| Structured amount | `quantity: 1`, `unit: "count"`; recipe yield is one 5-inch pie. The method says to fill a raw 5-inch shell, cover with extra dough, and bake 40 minutes at 400°F / 205°C. A note says to multiply the filling by four for a 9-inch pie. |
| Existing reference | `ingredient-ref-pie-crust`, `pie crust` / `pâte à tarte`, category `BAKING_MIXIN_AND_PANTRY`; aliases are empty, density is null, and unit mappings are empty. No ingredient form is linked. |
| Existing ledger state | `identityState: unreviewed`; `measurementState: not_yet_researched`; `substitutionResearchState: not_yet_researched`; no sources or decisions are recorded. |
| Local source provenance | The recipe URL is the Preppy Kitchen Blueberry Pie page. The local recipe records manual cleanup and no saved publisher-page snapshot or revision identifier, so the exact historical page behind the 5-inch formulation cannot be reconstructed from the bundled file. |

A corpus scan found six lines linked to `ingredient-ref-pie-crust`: `077#11` (“Pie crust,” with no structured amount), `089#8` (“4 individual 5-inch pie crusts”), and the four Preppy Kitchen lines `106#1`, `107#1` (prebaked 5-inch, cooled), `108#1` (raw 5-inch plus top dough), and `109#1` (raw 5-inch). This proposal covers only `106#1`; it does not establish a portion for the other, differently qualified lines.

## Evidence and measurement boundary

The [current Preppy Kitchen Blueberry Pie page](https://preppykitchen.com/blueberry-pie/) (John Kanell; page displays “Updated Jun 30, 2025”; accessed 2026-10-10) says the pie uses two store-bought crust sheets or one homemade double-crust recipe. Its method rolls a bottom crust to a 13-inch circle for a 9-inch pan and rolls the top crust to a 12-inch circle before cutting lattice strips. The card lists one homemade pie-crust recipe or two store-bought crusts. This is direct evidence for the current 9-inch recipe, not a matching 5-inch portion, and it supplies no mass for either raw crust.

The linked [Preppy Kitchen Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/) (John Kanell; page displays “Updated Sep 15, 2026”; accessed 2026-10-10) currently yields two 9-inch crusts. Its card lists 360 g flour, 227 g butter, and 60–90 mL ice water, with additional water added as needed; the page does not report total dough mass or the mass of an individual shell. These formula amounts and yield belong to that current 9-inch recipe. They cannot be scaled or divided to assign a weight to the bundled 5-inch line.

The bundled component recipe `041` links to that same publisher URL but locally says it makes four 5-inch tart shells from 300 g flour, 227 g butter, 60 mL water with more “as needed,” 0–4 tablespoons optional sugar, and salt. This local text documents the component formulation currently stored in RecipeBook; it is not an independent publisher measurement. It contains neither a measured total dough mass nor a mass for one shell. The ratio of ingredient inputs to four shells is not a source-reported per-shell weight, especially with variable water and optional sugar.

| Dimension | Supported by the exact bundled line | Not established; do not infer |
|---|---|---|
| Count and dimensions | One 5-inch pie-shell count is stored; the line includes additional dough for a top crust. | Whether the count means only the bottom shell, or the shell plus the unspecified top dough; shell thickness, trim, and top-crust quantity. |
| Product and formulation | A sweet pie shell is named in the local note. | Homemade vs. store-bought product, brand/SKU, dough formula, package, or a version-matched supplier. |
| State | The line and method describe a raw shell before baking. | A prebaked-shell weight, cooked/baked crust weight, filling-inclusive mass, or amount after trimming. |
| Mass and edible basis | No mass is stated for the line. | A one-shell mass, mass of bottom plus top dough, refuse/trim basis, or any edible-portion yield. |
| Yield and recipe relation | The local component recipe states four 5-inch shells; the blueberry recipe yields one 5-inch pie. | A measured component-batch mass, exact dough allocation per shell, or a scale factor from a 9-inch crust. |
| Other relationships | No volume amount, density, or substitution appears on this line. | Density, volume-to-mass mapping, generic `count` conversion, package yield, or crust substitution. |

## Prior-review check

The current WP04/WP12 proposal and batch files were searched for `106#1`, the ingredient-line ID, `ingredient-ref-pie-crust`, and the exact 5-inch wording. No earlier WP04/WP12 count or edible-portion review for this line was found. The existing WP04/WP12 packets and recent integrations cover other exact count/package cases, including the excluded produce/herb, egg, chicken, ham, tuna, butter, cocoa, maraschino-cherry, bread-and-butter-pickle, brioche, chipotle-in-adobo, and tomato-paste/pinto-bean lines. The WP08 pie-crust mentions concern flour substitutions and do not establish a count portion for `106#1`.

## Recommendation and future acceptance checks

**Recommendation: keep measurement blocked pending an exact match.** Preserve the one-count recipe line and existing generic pie-crust reference. No numeric observation is proposed.

A future source-specific portion observation for this line should be accepted only if evidence:

1. matches the imported 5-inch recipe version or identifies the exact crust product used by that line;
2. states whether the counted unit is the raw bottom shell alone or includes the top-crust dough, and reports a mass for that same scope;
3. retains the source's exact size, formulation/product, preparation state, count, value, unit, precision, method, URL, date/version, and locator;
4. distinguishes raw dough/shell from prebaked or baked crust and states any trim/refuse or edible-basis convention; and
5. reports the portion directly, rather than deriving it from a 9-inch crust, an assumed geometric scale, or a batch ingredient sum divided by an assumed shell count.

Until those checks are met, do not add an alias, form, density, unit mapping, count conversion, package-yield record, edible-portion factor, or recipe-specific substitution. Keep the other pie-crust count lines as separate open demands; their different count, size, and preparation wording is not resolved by this review.

## Sources and access

All web checks were made on **2026-10-10**.

| ID | Source | Evidence and limit |
|---|---|---|
| `WP04-PIE-CRUST-COUNT-20261010-S01` | Preppy Kitchen, [Blueberry Pie](https://preppykitchen.com/blueberry-pie/), John Kanell, updated Jun 30, 2025. | Current recipe specifies a 9-inch pan, bottom and top dough, and one homemade double-crust recipe or two store-bought sheets. It gives no raw 5-inch shell mass. |
| `WP04-PIE-CRUST-COUNT-20261010-S02` | Preppy Kitchen, [Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/), John Kanell, updated Sep 15, 2026. | Current recipe yields two 9-inch crusts; its water amount is 4–6 tablespoons, with additional water as needed. No total dough mass or per-crust weight is reported. |
| Local evidence | Bundled recipes `106` and `041`; `ingredient-ref-pie-crust` reference and ledger record. | Checked 2026-10-10. Confirms the exact stored demand, component link, local four-shell formula, and empty measurement/identity research state. The local component is not an independent source for a shell mass. |

## Remaining coverage gaps

- `106#1` has no version-matched mass for one raw 5-inch bottom shell plus its extra top dough.
- The other pie-crust rows remain separate, unreviewed measurement demands: four individual 5-inch shells (`089#8`), one prebaked 5-inch shell (`107#1`), one raw 5-inch shell plus top dough (`108#1`), and one raw 5-inch shell (`109#1`). `077#11` has no structured amount.
- No count weight, edible-portion value, baked yield, active conversion, density, package yield, or substitution is supported by the evidence checked here.

**Proposal-only conclusion:** `106#1` is a distinct exact count line, but the accessible source evidence does not match its 5-inch raw shell plus extra top dough. Keep the line unchanged and its measurement unavailable pending source-matched portion evidence.

## Coordinator integration — 2026-10-10

Root independently opened the current publisher pages. The blueberry pie page specifies a 9-inch pan with bottom and top dough and offers one homemade double-crust recipe or two store-bought crusts. The linked crust recipe currently yields two 9-inch crusts, gives variable added water, and reports no total dough mass or per-crust weight. The mismatch and missing exact portion are confirmed.

The shared `ingredient-ref-pie-crust` ledger record now marks measurement as `blocked_pending_evidence` and cites both current pages. Its decision is scoped to recipe `106#1`; the saved line, one-count value, linked generic reference, and recipe text are unchanged. No measurement observation, density, conversion, package or baked yield, form, alias, or substitution was added. A Python regression now checks the exact line and blocked evidence state.
