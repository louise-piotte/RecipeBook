# WP04 Section O — generic pork / porc identity review (R992)

- **Review date:** 2026-10-19.
- **Status:** Proposal only; no shared catalog, ledger, plan, roadmap, code, or test files were changed.
- **Exact plan anchor:** The open WP04 species checklist at [global catalog plan, line 7192](../../RecipeBook-global-ingredient-catalog-plan.txt#L7192): “Beef, veal, pork, lamb, mutton, goat, chicken, turkey, duck, goose, quail, rabbit, and documented regional game.”
- **Recommendation:** Add one identity-only generic `PROTEIN` reference for **pork / porc**, with no aliases. Keep the existing pork cuts, rendered fat, cured products, ground preparations, and recipe-local alternatives distinct.
- **Scope:** One generic culinary animal-protein identity gap. Do not expand any brand, product-line, flavour-family, SKU, or retailer-variant roster.

## Identity decision and Québec naming

OQLF’s food-domain GDT entry selects **porc** and gives **pork** as its English equivalent; the English definition is meat derived from swine. MAPAQ’s Québec sector report separately tracks pork as a fresh/frozen retail meat category and separates it from ham. These support a generic ingredient identity named `pork / porc`; neither source identifies a cut, processing state, recipe amount, or current package label. [R992-S01–S02]

If accepted, keep the identity unqualified by cut or state. It does not assert fresh/raw, lean, boneless, ground, cured, cooked, or ready-to-eat status. Use the OQLF-preferred pair as the displays and leave aliases empty:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-pork` |
| Category | `PROTEIN` |
| English display | `pork` |
| Québec French display | `porc` |
| English aliases | None |
| French aliases | None |
| Default density | `null` |
| Unit mappings | `[]` |

Do not add `pig`, `swine`, `cochon`, or animal/taxonomic names as meat aliases. Do not use this row for rendered pork fat, offal, ground pork, cured pork, sausage, broth, dry rub, or a named cut. Specific recipe wording and preparation qualifiers remain on their existing identity or ingredient line.

## Current ownership, duplicates, and source ownership

Shared-worktree snapshot checked 2026-10-19: **2,005 active ingredient references, 205 forms, 55 legacy-import candidates, and 2,411 research-ledger records**. The exact proposed ID `ingredient-ref-pork` has no active reference, form, legacy candidate, or ledger record. No active display or alias is exactly the standalone headword `pork` or `porc`; those words occur only within specific cuts and other pork products. The shared worktree contains concurrent edits; recheck these ownership counts and exact matches before any integration.

| Current owner | Current scope and boundary |
|---|---|
| `ingredient-ref-beef` | The existing generic beef identity is a different animal-food identity. It does not own pork terminology. |
| `ingredient-ref-bone-in-pork-shoulder`, `ingredient-ref-boneless-pork-shoulder` | Separate shoulder-cut identities. Their current ledger records have no sources and remain unreviewed; do not turn either row into the generic parent. |
| `ingredient-ref-pork-loin-chops` | Boneless pork loin chops / côtelettes de longe de porc désossées. R297 sources S01–S04 remain owned by this cut identity, including CFIA item 1413 and one Mayrand package. Those sources establish a particular cut/display and package, not a new generic-pork claim; none is reused here. |
| `ingredient-ref-rack-of-ribs` | Existing cut-level `rack of ribs / carré de côtes levées`, used by recipe 036#1. Its identity record has no source; the recipe line itself specifies pork ribs. Keep the cut link as saved and do not count it as an unqualified pork ingredient request. |
| `ingredient-ref-rendered-pork-fat` | A separate `FAT_AND_OIL` identity. Its Codex and OQLF evidence remains on that record; do not broaden the fat identity into meat. |
| `ingredient-ref-salt-pork` candidate | Existing unresolved salt-pork candidate with OQLF, CFIA, and Québec product sources. Preserve its unresolved preparation/cut boundary; it is not the unqualified meat identity and is not promoted or reused here. |
| Recipe 036#3 `pork dry rub` | An unlinked compound seasoning line. It belongs to seasoning/compound review, not to the pork-meat identity. |

Exact URL ownership checks found no current ledger allocation for the new OQLF `porc` entry, MAPAQ sector report, or Health Canada Food Guide handout listed below. Proposal-local source IDs R992-S01–S03 are not registered in the shared ledger. The R297 CFIA pork-cut nomenclature, OQLF cut terminology, and Mayrand product evidence stay attached to their existing owner; the transferability review found no generic claim to carry over. Existing branded rows and their evidence remain unchanged.

## Exact bundled recipe demand scan

The scan covered all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. Matching `originalText`, `ingredientName`, and `ingredientRefId` fields case-insensitively for `pork`, `porc`, and `cochon` found four rows:

| Recipe row | Saved ingredient text | Current link | Interpretation |
|---|---|---|---|
| `036#1` | `1 rack pork ribs` | `ingredient-ref-rack-of-ribs` | Pork-specific ribs, but the selected ingredient is the more specific rack-of-ribs cut. Keep the existing link. |
| `036#3` | `3/4 cup pork dry rub, divided` | None | Compound seasoning, not a meat request. |
| `082#1` | `1 boneless pork shoulder` | `ingredient-ref-boneless-pork-shoulder` | Specific shoulder cut, not unqualified pork. |
| `095#1` | `1 lb boneless pork loin chops, cut into diagonal strips` | `ingredient-ref-pork-loin-chops` | Specific boneless loin-chop cut, not unqualified pork. |

There are **zero unqualified `pork / porc` ingredient rows**. The corpus supports existing cut identities but does not justify relinking any row to the proposed generic identity. Recipe 095’s chicken and tempeh alternatives are notes, not ingredient rows. The earlier [WP04 tempeh review](wp04-next-animal-food-review-20261010.md) already records that the note has no source URL or replacement amount; do not transfer its recipe-local method or infer a pork-to-chicken or pork-to-tempeh ratio.

## Measurement and substitution states

Review the two evidence tracks independently:

- **Density and unit mappings:** Keep `defaultDensity: null` and `unitMappings: []`. The sources reviewed do not support a generic pork mass-volume conversion.
- **Measurement state:** If the reference is integrated with the observation below, use `measurementState: researched_supported` for that source-scoped portion only. Health Canada’s legacy Food Guide handout says meat/fish/poultry/shellfish Food Guide servings are represented cooked and lists pork as **75 g / 125 mL (1/2 cup)** for one Food Guide serving [R992-S03]. This is a cooked dietary serving, not a recipe amount, not a raw-to-cooked yield, and not a density or mass-volume mapping. If recorded, retain only `75 g` as a `portion_weight` observation with `foodState: cooked`, `quantityBasis: one Food Guide serving`, and `evidenceKind: published_portion`; keep the paired `125 mL` as source wording, not a unit conversion. Add no generic measure, form, yield, or active conversion.
- **Substitution state:** Keep `substitutionResearchState: not_yet_researched` for any integration and add no substitution finding or rule. A preliminary online search is documented below, but it did not complete a dish- and form-scoped evidence review. The active global and contextual substitution files contain no pork-specific rule. The corpus offers only the source-less, recipe-local alternatives described above. No reviewed source establishes a general directed replacement, transferable quantity, or method equivalence for generic pork; the identity decision does not settle future dish-specific substitutions.

### Preliminary online substitution search (2026-10-19)

This pass checked for generic culinary guidance, not brands or product rosters. The exact web-search queries were:

1. `pork substitute in recipes extension pork meat substitution culinary`
2. `site:edu recipe substitute pork with chicken pork substitution cooking`
3. `pork substitute recipe ground pork beef turkey cooking university extension`
4. `vegetarian substitute pork recipe cooking guidance tempeh pork substitution source`

Pages opened or checked from these results:

| Page reviewed | Locator and result | Limit for this proposal |
|---|---|---|
| University of Maine Cooperative Extension EFNEP, [Make Your Own: Casserole](https://extension.umaine.edu/food-health/efnep/make-your-own/casserole/) | HTML, `Protein – Select One`, page lines 81–86; it gives 2 cups cooked lean ground meat as one option, and separately gives 2 cups cooked diced chicken, ham, lean beef, lean pork, or turkey. | Generic dish-building guidance shows a casserole can be built with listed cooked-protein options. It neither directs replacement of pork in a specified recipe nor provides a pork-specific ratio or adjustment. |
| Iowa State University Extension and Outreach, Spend Smart Eat Smart, [Sloppy Joes or Janes or Jimmys](https://spendsmart.extension.iastate.edu/spendsmart/2020/06/08/sloppy-joes-or-janes-or-jimmys/) | HTML, page lines 93–95; states that its Sloppy Joes recipe works with ground beef, turkey, pork, chicken, venison, or cooked lentils. | A dish-specific flexibility statement, without an explicit pork-to-alternative amount, form conversion, or adjustment. It cannot support a general substitution rule. |
| Johns Hopkins Bloomberg School of Public Health, [Plant-Based Swaps for Pork](https://meatlessmonday.publichealth.jhu.edu/resources/plant-based-swaps-pork) | Search-result page text was visible; direct open returned HTTP 403. | Not treated as verified evidence. The result described different plant ingredients for named dish styles but did not establish a universal replacement. The inaccessible page requires independent review before use. |
| Nebraska Department of Education CACFP, [What’s Cookin’ II](https://www.education.ne.gov/ns/cacfp/WhatsCookin/Whats_Cookin_II_complete.pdf) | Search-result snippet suggested a ground-meat note; direct PDF opened as a 240-page file, but text extraction and in-document search returned no locator or matching text. | Unverified lead only; excluded from the evidence and decision. |

The reviewed, accessible guidance is dish-specific and does not establish a reusable pork replacement direction, quantity, or method. This search is logged as incomplete rather than as `researched_no_supported_substitute`: it did not systematically examine pork forms and the contexts needed to decide specific replacements. Do not infer a replacement from recipe 095’s source-less chicken/tempeh note.

No source-specific product quantity or claim is transferred to the proposed identity. Existing branded entries stay intact. The current cross-category [scope review](../batches/generic-ingredient-scope-review-20261019/README.md) found no open roster-only assignment; any newly encountered brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only item remains out of scope because commercial-product counts do not add ingredient diversity.

## Source register

Sources were accessed 2026-10-19. These IDs are local to this proposal; no ledger entries were created.

| Source ID | Source type, URL, and locator | Evidence and limits |
|---|---|---|
| **R992-S01** | Office québécois de la langue française, [porc, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428106/porc); food domain `alimentation — viande de porc`, term and English-equivalent fields, definition. Last updated 1983. | Selects Québec French `porc`, English `pork`, and defines the English food sense as meat derived from swine. Terminology evidence for the generic identity; not a current label standard, cut definition, recipe, measurement, or substitution source. The entry is not currently allocated in the ledger. |
| **R992-S02** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Portrait-diagnostic sectoriel de l’industrie du porc au Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/agriculture/types-de-productions/ED_portrait_diagnostic_industrie_porcine_MAPAQ.pdf), printed p. 10 / PDF p. 9, Table 2; data cover 2016–2020. | Reports Québec retail sales categories for fresh/frozen meats and distinguishes `Porc` from `Jambon`. Supports generic local category context only. It is a retrospective market report, not a current product census, culinary definition, package/brand roster, household measure, or substitution study. The report is not currently allocated in the ledger. |
| **R992-S03** | Health Canada, [Eating Well with Canada’s Food Guide — “What is a Food Guide Serving of Meat and Alternatives”](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/hpfb-dgpsa/pdf/food-guide-aliment/serving_meat-viande_portion-eng.pdf), PDF p. 1, meat/fish/poultry/shellfish note and Pork row. Legacy serving handout; the retrieved PDF does not show a publication date. | States that all listed Food Guide servings are cooked and lists pork as 75 g / 125 mL for one serving. Supports only a source-specific cooked serving observation. It does not establish a general recipe portion, volume conversion, density, raw amount, cut, yield, or substitution. The URL is not currently allocated in the ledger. |
| **R992-S04** | University of Maine Cooperative Extension EFNEP, [Make Your Own: Casserole](https://extension.umaine.edu/food-health/efnep/make-your-own/casserole/), HTML, `Protein – Select One`, lines 81–86. | Supports only the listed cooked-protein options for this casserole framework. It is not a pork replacement trial, ratio, or general substitution source. Not currently allocated in the ledger. |
| **R992-S05** | Iowa State University Extension and Outreach, Spend Smart Eat Smart, [Sloppy Joes or Janes or Jimmys](https://spendsmart.extension.iastate.edu/spendsmart/2020/06/08/sloppy-joes-or-janes-or-jimmys/), HTML, lines 93–95. | Supports the named Sloppy Joes recipe's stated flexibility across the listed proteins. It supplies no pork-specific exchange quantity or method adjustment and no general rule. Not currently allocated in the ledger. |
| **R992-R01** | Repository audit of the current Section O checklist, active references/forms, legacy-import identities, research ledger, scope review, and all manifest-listed recipe rows. | Confirms the point-in-time ownership and demand findings in this proposal. It is not external ingredient, measure, or substitution evidence. |

## Minimal integration guidance

If accepted, add only `ingredient-ref-pork` in `PROTEIN` as `pork / porc`, with no aliases, forms, density, unit mappings, or recipe links. Add the new identity ledger record with verified identity; preserve the 75 g cooked Food Guide serving only as the source-scoped observation above; leave substitution state `not_yet_researched` until a dedicated context-scoped review is completed, and add no rule from this preliminary search. Leave the shoulder, rack, loin-chop, rendered-fat, salt-pork candidate, pork-rub, and all branded rows and source ownership unchanged. Close only a reviewed child of the open Section O species checklist; keep the parent open for its remaining species, cuts, offal, and cured-product work.

This proposal is documentation-only. No tests or builds were run.
