# WP03 Section F R270 — wild-rice CNF 2026 row-inspection access review (2026-10-16)

## Review record

- **Status:** Proposal-only static review. This review writes only this proposal; no catalog, ledger, checklist, roadmap, recipe, generated index, or application data was edited.
- **Selected open item:** Inspect CNF 2026 Food Name and Measure Weight Conversion rows for the existing wild-rice dry and cooked forms.
- **Why it remains open:** The current plan and R177 integration explicitly leave this row inspection pending. The official dataset listing identifies the relational resources, but the row files were not retrievable through the available browser or the restricted local network in this review. No claim is made that either row is present or absent in CNF 2026.
- **Recommendation:** Keep `ingredient-ref-wild-rice` at `measurementState: not_yet_researched` until its 2026 Food Name and measure rows can be inspected and joined. Do not infer the 2026 state from the older CNF 2015 serving pages.
- **Distinct proposed integration batch path:** `docs/catalog/batches/wp03-section-f-wild-rice-cnf-2026-row-inspection-integration-r270-20261016/README.md`.
- **Proposal-local source-ID prefix:** `WP03-WILDRICE-CNF2026-R270-20261016-S`. No IDs from this prefix are registered in the shared ledger.

## Why this is a distinct, bounded gap

The [global plan's dry-versus-cooked measurement item](../../RecipeBook-global-ingredient-catalog-plan.txt#L3796) keeps this work open for remaining grains. Its wild-rice subitem says that the bilingual state forms are already integrated, while measurement review remains open pending CNF 2026 row inspection. [R177](wp03-section-f-wild-rice-dry-cooked-form-review-r177-20261016.md) established the two forms and recorded CNF 2015 evidence as historical context; the [R177 integration record](../batches/wp02-wp03-wp04-r177-gap-review-integration-20261016/README.md) confirms it did not inspect the 2026 rows. This review covers only that outstanding row-level follow-up for the already existing wild-rice identity and forms.

The completed [R267 review](wp03-next-section-f-gap-review-r267-20261016.md) concerns cooked quinoa, Food Code 5917, and its 2026 measure rows. Wild rice is a different active reference with its own ledger record and CNF 2015 codes 4449/4450. The recent [R262](wp03-section-f-cranberry-almond-crunch-cereal-identity-review-r262-20261016.md), [R264](wp03-section-f-oreo-puffs-cereal-identity-review-r264-20261016.md), and [R265](wp03-section-f-gorilla-munch-cereal-identity-review-r265-20261016.md) decisions add three named ready-to-eat cereal products; R270 proposes no cereal identity and does not revisit any of them.

## Current seed and ledger state

The manifest-listed live package currently contains **1,656 ingredient references**, **125 forms**, **114 recipe files**, and **1,123 structured ingredient rows**. The active `ingredient-ref-wild-rice` row remains `wild rice / riz sauvage`, category `GRAIN_AND_CEREAL`, with empty alias lists, `defaultDensity: null`, and `unitMappings: []`.

The attached forms are:

| Form ID | English / French label | State | Match terms | Density |
|---|---|---|---|---|
| `ingredient-form-wild-rice-dry` | `wild rice, dry` / `riz sauvage, sec` | `dry` | Empty | `null` |
| `ingredient-form-wild-rice-cooked` | `wild rice, cooked` / `riz sauvage, cuit` | `cooked` | Empty | `null` |

The wild-rice ledger record remains `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its current sources include the R177 CNF 2015 dry and cooked pages, the Health Canada mixed-grain recipe, the CNF overview page, and the existing OQLF/OMAFRA identity sources. The active package has no wild-rice density, unit mapping, or measure conversion. No wild-rice rule appears in the active substitution or package-yield data.

A static scan of every manifest-listed recipe found **0 of 114 files**, **0 of 1,123 ingredient rows**, and **0 direct links** matching `wild rice`, `riz sauvage`, or `ingredient-ref-wild-rice`. The lack of bundled demand does not close the explicitly open CNF measurement review.

## Source findings and access limits

### Existing CNF 2015 rows

Health Canada's current online CNF serving pages still expose the bilingual product states and their older food-specific portions:

| Existing CNF 2015 row | Published page values | Use in this review |
|---|---|---|
| Food Code 4449, `Grains, rice, wild, dry` / `Grains céréaliers, riz sauvage, sec` | 100 g edible portion = 100 g; 100 mL = 67.6 g; 250 mL = 169.1 g; “amount to make 125 mL” = 32.5 g; total refuse = 0%. | Historical, food-code-specific source context already recorded by R177. The 100 g basis and refuse row are not kitchen measures; do not treat the “amount to make” entry as a paired dry/cooked yield or reusable measure. |
| Food Code 4450, `Grains, rice, wild, cooked` / `Grains céréaliers, riz sauvage, cuit` | 100 g edible portion = 100 g; 100 mL = 69.3 g; 125 mL = 86.6 g; 250 mL = 173.3 g; total refuse = 0%. | Historical, food-code-specific source context already recorded by R177. The 100 g basis and refuse row are not kitchen measures; the page does not specify a packing or preparation protocol. |

These values belong to the 2015 CNF online pages. They do not establish what the CNF 2026 downloadable rows contain. Do not activate either page's portions as a default measure, density, conversion, or cooking yield.

### CNF 2026 resources

Health Canada's CNF information page, modified 2026-06-19, describes the CNF as a bilingual food-composition database and says the 2026 file is published as relational CSVs. It identifies the 2015 online CNF as interim access while a more user-friendly route to 2026 is developed. The Open Government Portal listing for CNF 2026, modified 2026-10-04, lists the Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV resources.

This review attempted the Food Name and Measure Weight Conversion resource pages and their direct download URLs through the browser. The pages returned 403 or were not accessible through that tool. A local, read-only `urllib` request to the official CSV download URL failed before receiving data with `Temporary failure in name resolution`. No CSV bytes were retrieved, cached, or written, so no row-level CNF 2026 values or absence claims can be reported.

### Identity, French terminology, and state boundary

OQLF lists `riz sauvage` as its preferred Québec French term and pairs it with English `wild rice`; its definition describes the market grain but does not give a dry/cooked measure. Ontario's agriculture ministry identifies the reviewed northern wild-rice species as *Zizania palustris*, describes its culinary use as a cooked whole grain, and distinguishes it from ordinary cultivated rice. These sources support retaining the existing distinct identity and forms; they do not supply the missing CNF 2026 measure rows.

## What a row-level follow-up must check

When the official files are accessible, inspect and join the following for wild rice only:

1. In Food Name, find each exact wild-rice dry/cooked food description and record its `Food_Code`, bilingual description, alternate descriptions, source code, and last-updated date. Confirm whether those rows match the existing dry and cooked forms rather than a blend, recipe, or other prepared food.
2. Filter Measure Weight Conversion on each confirmed `Food_Code`; join the measure codes to Measure Name and Measure Type. Separate volume-to-weight portions from mass-labelled entries, refuse rows, and any preparation-specific quantity.
3. Record only exact, source-specific portion observations whose food state, measure label, and weight join are verified. Keep CNF 2026 edition and row dates explicit. Do not average them with 2015 values or treat different dry/cooked portions as a paired preparation experiment.
4. Add no active measure, density, unit mapping, conversion, or cooking yield from these records alone. A CNF portion row is not evidence of a standardized packing method or paired dry-to-cooked yield. Add no substitutions; the reviewed sources provide none.

No row-level result, ledger state change, new source ID, or observation ID is proposed in this packet. The review should be reopened after the official CSV contents can be read and joined.

## Remaining uncertainty and disposition

- **Unresolved:** Whether CNF 2026 contains exact generic wild-rice dry and cooked Food Name rows; whether their measure table has usable volume-to-weight observations; and how those values compare with the existing 2015 rows.
- **Known limitation:** The official CNF 2026 listing confirms the relevant relational resource names, but not the content of the rows. The 2015 pages cannot answer the 2026 row question.
- **No negative finding:** Access failure is not evidence that a CNF 2026 wild-rice row or portion is absent.
- **Disposition:** Leave the active reference, forms, all measurement/substitution fields, and the ledger's current measurement state unchanged. Section F remains open.

## Sources

Sources checked online on **2026-10-16**. The proposal-local IDs below are unallocated; the existing R177 sources remain the ledger sources for the 2015 pages and identity context.

| ID | Source | Exact evidence and limits |
|---|---|---|
| Reuse `WP03-WILDRICE-FORMS-R177-20261016-S01` | Health Canada, [CNF 2015 wild rice, dry, Food Code 4449](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4449). | The page displays `Grains, rice, wild, dry` / `Grains céréaliers, riz sauvage, sec`, Food Code 4449, and 100 mL = 67.6 g, 250 mL = 169.1 g, and “amount to make 125 mL” = 32.5 g. Page detail shows 2019-03-01; it is a 2015 CNF record, not 2026 evidence. |
| Reuse `WP03-WILDRICE-FORMS-R177-20261016-S02` | Health Canada, [CNF 2015 wild rice, cooked, Food Code 4450](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4450). | The page displays `Grains, rice, wild, cooked` / `Grains céréaliers, riz sauvage, cuit`, Food Code 4450, and 100 mL = 69.3 g, 125 mL = 86.6 g, and 250 mL = 173.3 g. Page detail shows 2019-03-01; it is a 2015 CNF record, not 2026 evidence. |
| `WP03-WILDRICE-CNF2026-R270-20261016-S01` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Modified 2026-06-19. States the CNF is bilingual; lists the 2026 users' guide and database-structure description; says CNF 2026 is relational CSV and CNF 2015 remains online as interim access. It does not publish wild-rice 2026 row contents. |
| `WP03-WILDRICE-CNF2026-R270-20261016-S02` | Open Government Portal, [Canadian Nutrient File, 2026 dataset and resource listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). | Search result for the official listing reports a 2026-10-04 modification and links Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV resources. The portal page and CSVs could not be opened in this review; the listing does not substantiate any row-level value. |
| `WP03-WILDRICE-CNF2026-R270-20261016-S03` | Office québécois de la langue française, [riz sauvage (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage). | Last updated 1985. Lists `riz sauvage` as preferred and gives `wild rice` as its English translation. Supports identity terminology, not current portion data. |
| `WP03-WILDRICE-CNF2026-R270-20261016-S04` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Riz sauvage](https://www.omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/wiri.html). | Page last updated 2012-10-17. Identifies northern wild rice as *Zizania palustris*; describes culinary use as a cooked whole grain and distinguishes it from ordinary rice. Supports product identity boundaries, not household measures. |
| `WP03-WILDRICE-CNF2026-R270-20261016-A01` | Static repository audit, 2026-10-16. | Read-only inspection of the active package manifest/references/forms, existing wild-rice ledger record, R177/262/264/265/267 proposal and batch records, and all 114 listed recipe files / 1,123 ingredient rows. Not an external source. |

## Static review only

The live manifest, reference and form JSON, ledger record, forms, source ownership, recent-proposal separation, and complete listed recipe corpus were inspected read-only. No tests, builds, emulator sessions, deployments, or integration checks were run. No shared database JSON, ledger, checklist, roadmap, generated index, or application file was changed.
