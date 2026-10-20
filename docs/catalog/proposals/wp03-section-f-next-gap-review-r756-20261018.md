# WP03 Section F R756 — whole grain sorghum dry/cooked forms and yield review

## Review record

- **Reviewed:** 2026-10-18.
- **Plan fit:** The open Section F item asks for dry/cooked forms for remaining grains where recipes or measurements need them; it states that cooking yield is a separate quantity relation ([plan, lines 4695–4696](../../RecipeBook-global-ingredient-catalog-plan.txt#L4704)). The current sorghum sub-item from R580 leaves both the Food Code 4432 state/form question and the CNF 2026 row join open because the CNF page is state-unspecified and the 2026 CSVs could not be inspected ([R580](wp03-section-f-next-gap-review-r580-20261017.md)).
- **Target:** existing `ingredient-ref-grain-sorghum` (`grain sorghum / sorgho à graine`).
- **Recommendation:** Add two explicitly whole-grain forms, dry and cooked, and record the USDA Food Buying Guide's approximate dry-volume portion and dry-to-cooked volume yield as source-specific ledger observations. The cooked form is needed to identify the USDA table's cooked output state and cooked-volume meal-contribution servings; it is a form label only, not an active dry-to-cooked converter. This supports only whole sorghum; it does not assign the CNF 2015 Food Code 4432 observations to either form or close R580's CNF 2026 row join.
- **Bounded delta:** no new ingredient reference or alias; no density, active unit mapping, conversion, recipe link, package yield, or substitution.

This is separate from [R738's Oatmeal Crisp family hold](wp03-section-f-oatmeal-crisp-chocolate-almond-family-hold-r738-20261018.md), [R741's cooked-millet CNF access check](wp03-section-f-cnf-2026-cooked-millet-row-review-r741-20261018.md), [R744's prepared-kasha boundary](wp03-section-f-kasha-prepared-gruel-picker-boundary-review-r744-20261018.md), [R750's corn-poha thickness review](wp03-section-f-corn-poha-thickness-grade-review-r750-20261018.md), and [R753's sorghum-couscous product hold](wp03-section-f-sorghum-couscous-product-label-recheck-r753-20261018.md). R756 addresses the existing grain-sorghum identity's still-open whole-grain state forms using a separate current federal yield source; it does not reopen those candidates.

## Current catalog and evidence ownership

The active `ingredient-ref-grain-sorghum` record is in `GRAIN_AND_CEREAL`, with the OQLF display `grain sorghum / sorgho à graine`, French aliases `sorgho en grains` and `sorgho en grain`, and English aliases `jowar whole`, `guinea corn`, and `red sorghum`. It has no attached forms, density, or unit mappings. Related puffed sorghum, sorghum flour, grits, semolina, and starch remain separate identities.

The existing reference ledger record is identity-verified and has three CNF 2015 Food Code 4432 `portion_weight` observations: 100 mL = 81.2 g, 250 mL = 202.9 g, and 1 serving = 20.0 g. The page identifies only “Grains, sorghum / Grains céréaliers, sorgho”; it does not specify whole versus decorticated, dry versus cooked, or filling/packing method. Keep those values on the parent reference and do not attach or copy them to the proposed forms. Leave the R580 CNF 2026 row join open without a presence, absence, label, or value claim.

The existing Codex source `WP03-SORGHUM-GRAINS-20261012-S01` is already owned by the parent reference. OQLF source `WP03-S22` owns its bilingual display pair. The USDA PDF URL and proposed source ID below have no exact owner in the current research ledger or proposal archive; the form and observation IDs are also unallocated.

## Primary-source findings

| Source | Direct evidence | Limit |
|---|---|---|
| `WP03-SORGHUM-WHOLE-YIELD-R756-20261018-S01` — USDA Food and Nutrition Service, [Food Buying Guide for Child Nutrition Programs, Section 4: Grains](https://foodbuyingguide.fns.usda.gov/files/Reports/USDA_FBG_Section4_Grains_YieldTable.pdf), current official PDF, printed p. 4-17, accessed 2026-10-18. | The exact entry is “Sorghum (Group H), Whole, Dry,” with a one-pound purchase unit. In the “Servings per Purchase Unit, Edible Portion” and “Serving Size per Meal Contribution” columns, it gives 31.00 servings at 1/4 cup cooked, 15.50 at 1/2 cup cooked, and 10.33 at 3/4 cup cooked. Separately, its additional information says 1 lb dry is about 2-1/4 cups dry whole sorghum and about 7-3/4 cups cooked. These state labels support dry and cooked forms; only the two approximate one-pound relationships are proposed as observations. | This is a child-nutrition yield table, not a home-cooking protocol. The three cup sizes are meal-contribution servings, not recipe substitutions or volume-to-mass portions. The guide does not specify cultivar, water quantity, cooking method, time, or cooked mass. “About” is retained as an estimate; do not generalize the values into a household density or active unit mapping. The adjacent pearled-sorghum row is a separate product and is excluded. |
| Existing source `WP03-SORGHUM-GRAINS-20261012-S01` — FAO/WHO Codex Alimentarius, [Norme Codex pour le sorgho en grains, CXS 172-1989](https://www.fao.org/input/download/standards/57/CXS_172f.pdf), sections 2.1–2.1.3, reopened 2026-10-18 (existing ledger `accessedOn` remains 2026-10-12). | The French standard covers human-food *Sorghum bicolor* grain in whole or decorticated form, names the whole product `sorgho en grains entiers`, and distinguishes decorticated grain by removal of external casings and some or all of the germ. It directly grounds the whole-grain wording and scope boundary for the proposed forms. | Codex does not define a cooked form, household measure, or yield; use USDA FNS for those findings. This is the existing source record, so do not duplicate its source entry. |
| Existing source `WP03-S22` — OQLF, [sorgho à graine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001698/sorgho-a-graine). | Directly pairs the existing parent display `grain sorghum / sorgho à graine`. | This supports the parent display only, not a Québec-preferred whole-grain form name. |

The cooked form is needed in the active form model because the primary source explicitly names cooked whole sorghum as an output state and provides cooked-volume servings for that state. The forms let the catalog name the input and output states consistently; they do not make the source-specific yield available as a generic recipe conversion. The USDA table's 1/4-, 1/2-, and 3/4-cup cooked sizes remain meal-contribution serving bases only. R756 does not record them as recipe portions, weight observations, or substitutions.

## Proposed form and ledger delta

Add these two forms under `ingredient-ref-grain-sorghum`:

| Form ID | `formCode` / `prepState` | English / French label | Match terms | Density |
|---|---|---|---|---|
| `ingredient-form-grain-sorghum-whole-dry` | `whole_dry` / `dry` | `grain sorghum, whole, dry` / `sorgho en grains entiers, sec` | Empty arrays | `null` |
| `ingredient-form-grain-sorghum-whole-cooked` | `whole_cooked` / `cooked` | `grain sorghum, whole, cooked` / `sorgho en grains entiers, cuit` | Empty arrays | `null` |

The form labels are descriptive bilingual labels based on the USDA state wording and Codex's French whole-grain phrase; they are not presented as OQLF-preferred compound terms. Keep decorticated grain outside these forms. Do not add `dry` or `cooked` as unqualified aliases on the parent reference.

Create corresponding `ingredient_form` ledger records with verified form identity and no substitution finding. Add the new USDA source record to both form records. Add only these source-specific observations, each tied to its respective form record:

| Observation ID | Form / relationship | Proposed value | Recording boundary |
|---|---|---|---|
| `grain-sorghum-whole-dry-usda-fbg-portion-r756-20261018` | `ingredient-form-grain-sorghum-whole-dry` / `portion_weight` | Source quantity `2.25 cup` dry; approximate value `1 lb` | USDA reports about 2-1/4 cups dry whole sorghum per 1 lb. Mark `evidenceKind: estimate`; preserve the direction and approximation in `foodState`, `measurementMethod`, and `quantityBasis`. Do not derive density, grams per cup, or a unit mapping. |
| `grain-sorghum-whole-dry-to-cooked-usda-fbg-yield-r756-20261018` | `ingredient-form-grain-sorghum-whole-cooked` / `cooking_yield` | Source quantity `1 lb` dry; approximate value `7.75 cups cooked` | USDA reports about 7-3/4 cups cooked per 1 lb dry. Mark `evidenceKind: estimate`; explicitly state that no preparation method or water amount is supplied. This is a ledger-only yield relation, not an active conversion or recipe instruction. |

Keep the parent reference's three CNF 2015 observations unchanged and state-neutral. Do not mark those observations as measurements of either whole-grain form. Preserve `defaultDensity: null`, `unitMappings: []`, no active form-conversion rule, and `substitutionResearchState: not_yet_researched` on the parent. No cooking directions, ingredient amounts, recipe links, or substitution ratios are proposed.

## Bundled recipe corpus and scope check

The current manifest lists 114 recipe files containing 1,123 structured ingredient rows. A full-text and structured-reference scan found zero `sorghum`/`sorgho` hits and zero direct links to `ingredient-ref-grain-sorghum`. Recipe demand therefore does not motivate the forms; the qualifying need is the newly verified state-specific measurement/yield evidence, which fits the open Section F checklist. The forms add only precise state-qualified picker terms and no new ingredient identity or family alias.

R580 remains correct about the limits of CNF Food Code 4432 and inaccessible CNF 2026 row content. R756's independent USDA source resolves only the whole-grain dry/cooked form question and adds no claim about the CNF row. Reopen the CNF join only when its official files can be inspected and joined.

## Review checks

- Read current `AGENTS.md`, the catalog plan, latest roadmap entries, live reference/form/ledger JSON, R580 and recent Section F proposals, and the manifest-listed recipe corpus.
- Opened the official USDA FNS yield-table PDF at the sorghum rows and the official Codex French standard at its whole/decorticated definitions.
- Checked exact ownership for the USDA URL, proposed source ID, form IDs, and observation IDs; no collision was found.
- No shared catalog JSON, roadmap, plan, recipe, or integration file was edited. This is a standalone proposal only; no software tests, build, emulator, or deployment were run.
