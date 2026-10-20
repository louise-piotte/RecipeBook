# WP03 Section U — Lovage identity review (R296, 2026-10-16)

- **Plan anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section U, “Fresh herbs botanical aromatics and regional flavorings,” line 7498: `Epazote, hoja santa, huacatay, papalo, lovage, sorrel, fenugreek leaves, lemon verbena, and lemon balm.`
- **Status:** Integrated as R296; the identity and bounded research finding are recorded in the bundled reference catalog and ledger.
- **Recommendation:** Add one identity-only `lovage / livèche` reference in category `HERB`, botanically bounded to *Levisticum officinale*. Add the leaf-qualified bilingual aliases `lovage leaf`, `lovage leaves`, `feuille de livèche`, and `feuilles de livèche`; keep the display names as `lovage` and `livèche`.
- **Product boundary:** The proposed row is the culinary leafy herb. Québec sources confirm that other parts are also eaten, but roots, stems, seeds, essential oil, and prepared products do not become forms or aliases of this herb row without separate demand and product review.
- **Data scope:** No forms, recipe links, measures, densities, unit mappings, conversions, yields, or active substitutions. The recipe bundle has no matching demand.
- **Proposal-local source IDs:** `WP03-LOVAGE-R296-20261016-S01` through `S03`; these IDs and the target reference ID were unallocated in the checked archive and ledger. At the time of proposal, this file did not register sources in the ledger or change shared data.

## Evidence and identity boundary

The Office québécois de la langue française GDT record gives the French term **livèche**, English **lovage**, and Latin name *Levisticum officinale* [S01]. The Ville de Montréal’s Espace pour la vie / Jardin botanique de Montréal page independently pairs `Livèche`, `Lovage`, and *Levisticum officinale*; it says all parts are edible and describes the leaves as celery- and parsley-like [S02]. The Université du Québec à Chicoutimi distinguishes culinary roots, stems, leaves, and seeds, and says leaves and seeds are most often used fresh or dried as seasonings [S03]. This supports one species-bounded culinary-herb identity with the leaves as the picker’s intended recipe-facing product; it does not support combining every part into one interchangeable form.

Use the direct bilingual pair `lovage / livèche`. The leaf aliases are descriptive ingredient phrases composed from the sources’ exact plant names and documented leaf use. Keep `celery`, `mountain celery`, `perpetual celery`, `céleri bâtard`, `céleri des montagnes`, `céleri perpétuel`, and `ache des montagnes` out of aliases. The local university source reports those vernacular names and a celery-like flavor, but the live catalog already has a separate `celery` owner; the resemblance and contextual use do not make lovage a celery synonym. Do not add the scientific name as a picker alias.

The source distinguishes plant parts that could matter in a recipe. It does not justify adding `lovage root`, seed, stem, dried-leaf, or essential-oil forms here. The checklist’s identity gap can be closed for the leafy herb without claiming those other products are equivalent or unavailable.

## Picker projection and ownership review

The live bilingual search normalizes accents and prioritizes complete phrase matches across reference names and aliases (`app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`). With the proposed names and leaf aliases, `lovage`, `lovage leaf/leaves`, `livèche`, `feuille(s) de livèche`, and unaccented `liveche` resolve to this one herb identity. The spelling `livêche` also folds to the same search key as `livèche`; it needs no separate alias. Excluding celery-like folk names prevents the new row from capturing the established celery query. Explicit part phrases such as `lovage root` or `lovage seed` remain unmatched rather than being assigned to the leaf herb.

The exact-key check covered current ingredient-reference display names and aliases, form labels and match terms, and all legacy candidate IDs/names/aliases. It found no owner for `lovage`, `livèche`, the four proposed leaf phrases, or `ingredient-ref-lovage`; the only adjacent term owner is `celery` on `ingredient-ref-celery`. The prior proposal and batch archive contains no lovage identity review. The exact proposed OQLF, Espace pour la vie, and UQAC URLs below were absent from the research ledger and catalog archive. The R296 filename and `WP03-LOVAGE-R296-20261016-S` source prefix were also absent before drafting.

## Recipe demand, numeric data, and substitutions

I searched all 114 recipe files listed by the bundled-library manifest, covering 1,123 ingredient rows. No row or ingredient text matched `lovage`, `livèche`/`livêche`, `Levisticum`, or the reviewed celery-like common names. This is a bundle-demand finding, not evidence that Québec cooks do not use the herb; the Québec horticultural and university sources establish culinary use independently.

The sources give culinary examples and plant-part descriptions, not transferable weights, volume measures, densities, yields, or conversions. No such numeric data or recipe links are proposed. UQAC says lovage can replace celery in salted-herb mixtures or celery salt [S03], but gives no formula, amount, or broader dish context. Record that as a qualitative, context-limited observation only; do not create a global or contextual substitution rule from it.

## Sources

| ID | Source | Support and limits |
|---|---|---|
| **WP03-LOVAGE-R296-20261016-S01** | Office québécois de la langue française, [livèche (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3694734/liveche), GDT record attributed to AFNOR (1990); checked 2026-10-16. | Directly pairs French `livèche`, English `lovage`, and *Levisticum officinale*. This is terminology/botanical evidence, not a recipe or portion source. |
| **WP03-LOVAGE-R296-20261016-S02** | Ville de Montréal, Espace pour la vie / Jardin botanique de Montréal, [Livèche](https://m.espacepourlavie.ca/carnet-horticole/liveche), no publication date shown; checked 2026-10-16, sections “Nom commun,” “Nom latin,” “Nom commun anglais,” and “Consommation.” | Pairs the French and English common names with the species; reports edible plant parts and a celery/parsley-like leaf flavor. It does not establish celery synonymy, a kitchen measure, or a substitution ratio. |
| **WP03-LOVAGE-R296-20261016-S03** | Université du Québec à Chicoutimi, Forêt nourricière, [Livèche, *Levisticum officinale*](https://www.uqac.ca/foretnourriciere/fines-herbes-epices-et-aromates/liveche/), no publication date shown; checked 2026-10-16, “Inspirations culinaires.” | Describes use of roots, stems, leaves, and seeds; says leaves and seeds are generally used fresh or dried as seasonings; mentions celery replacement only for salted herbs or celery salt. It gives no ratio or general substitution rule. |

## Verification performed

- Re-read `AGENTS.md` and the current WP03 plan before selecting the gap.
- Compared the proposal phrases and target ID against 1,665 active references, 127 forms, and 60 legacy candidates; checked prior catalog proposals/batches and ledger ownership for the exact candidate terms, proposed IDs, and cited URLs.
- Confirmed the manifest lists 114 recipe files, all present, and scanned all 1,123 bundled ingredient rows for matching names. No recipe demand was found.
- Reviewed the existing picker normalization/matching behavior for accent folding and complete-phrase projection. No software tests, build, or emulator were run; this is proposal-only research.
- Created this single proposal file only. No catalog, ledger, plan, roadmap, README, recipe, generated code, or other shared file was edited by this task.


## Integration record — accepted as R296

Added ingredient-ref-lovage as identity-only lovage / livèche in HERB, with leaf-qualified aliases and no other plant-part or celery-like aliases. The ledger records the three sources, identity verification, no supported reusable measurement, and UQAC’s celery replacement mention as qualitative, preparation-limited evidence without an active substitution rule. No recipe links or forms were added.

The WP03 Section U checklist and roadmap now point to this integration. Static seed-package, generated-index, ledger-schema/source-ownership, picker, corpus, encoding, link, and whitespace checks are recorded in the R296 integration README. No software tests, builds, or emulator runs were performed because the data changes are limited to bundled database JSON and related catalog documentation.
