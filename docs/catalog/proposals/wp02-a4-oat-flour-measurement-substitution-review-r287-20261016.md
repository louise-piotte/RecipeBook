# WP02 A4 generic oat flour measurement and substitution review — R287 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Integrated into the generic oat-flour research record and checklist on 2026-10-16; see the [R287 integration README](../batches/wp02-a4-oat-flour-measurement-substitution-integration-r287-20261016/README.md).
- **Scope:** Research the unfinished measurement and substitution fields on the existing generic `ingredient-ref-oat-flour` identity. This does not reopen its bilingual name or add another oat-flour grade.
- **Checklist anchor:** [WP02 Section A, cereal-flour grades and distinctions](../../RecipeBook-global-ingredient-catalog-plan.txt#L1577). The checked R230 child item adds a distinct whole-grain row and leaves this generic row unchanged.
- **Source IDs:** `WP02-A4-OATF-R287-20261016-S01`–`S02` are now recorded on the existing generic oat-flour research row. Existing `WP02-S26`, `WP02-S32`, and `DOAM-20261011-S06` retain their prior ownership and are cited as reused evidence.

## Recommendation

**Keep `oat flour / farine d'avoine` unchanged, record one product-label portion observation, and add no reusable conversion or substitution rule.** If accepted into the ledger, set `measurementState` to `researched_no_supported_value` and preserve the Québec Food Directory label value as a single `manufacturer_label` `portion_weight` observation: Cuisine Soleil Organic Gluten Free Oat Flour, GTIN 851424000592, `1/4 cup = 30 g` [S01]. The source does not give a cup standard or filling method, and it does not specify whole-grain versus refined oat flour. Keep the observation SKU-scoped; do not derive `1 cup = 120 g`, set `defaultDensity`, or add `unitMappings`.

Set `substitutionResearchState` to `researched_no_supported_substitute` for a reusable catalog rule. OQLF says oat flour does not rise and is generally combined with wheat flour, but gives no ratio [reused `DOAM-20261011-S06`]. A 2023 study tested 10% (w/w) oat-flour replacement in one bread formula and reported lower specific volume, darker crust and crumb, and greater hardness and chewiness; the authors call for more formulation work [S02]. This is study-specific evidence, not a general home-recipe exchange amount. No global form conversion, contextual substitute, recipe-line link, or preferred alternative is proposed.

Keep `defaultDensity: null`, `unitMappings: []`, aliases empty, and the row in `FLOUR_AND_STARCH`. Add no ingredient form, yield, conversion, or recipe link. The current whole-grain oat-flour row added under R230 remains separate; its CNF food code and 20 g serving are not generic-row values.

## Current ownership and prior work

The live generic row is `ingredient-ref-oat-flour`, displayed as `oat flour / farine d'avoine`, with no aliases, null density, and empty unit mappings. Its ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it already reuses `WP02-S26` for a manufacturer’s bilingual `oat flour / farine d'avoine` wording and `WP02-S32` for the separately named whole-grain CNF class.

The archive contains prior holds and identity reviews for Scottish oatmeal, malted/roasted or thermal oat-flour products, and R230’s whole-grain identity. Those decisions leave generic `ingredient-ref-oat-flour` intact and do not research its generic measurement or reusable substitution behavior. R281 addressed whole barley flour and R284 addressed chickpea flour; neither covers this row. The current generic row still has no matching form and neither active global nor contextual substitution rules contain a rule for it.

## Naming and picker projection

Retain the existing display `oat flour / farine d'avoine` without aliases. OQLF prefers `farine d'avoine` and defines it broadly as flour milled from whole or non-whole oat grains; it also notes that flour may be made from flakes [reused `DOAM-20261011-S06`]. The MAPAQ product sheet calls its specific SKU `Organic Gluten Free Oat Flour` and describes it as light, sweet, stone-ground, and organic, but does not state whether it is whole-grain. Do not add `organic`, `gluten free`, `light`, `sweet`, or `stone-ground` as generic aliases or attributes.

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) projection was applied to the live references and forms:

| Query | Current result | R287 effect |
|---|---|---|
| `oat flour` or `farine d'avoine` | Generic oat flour and `whole grain oat flour` | Keep the family and grade as separate rows; no alias change. |
| `whole oat flour`, `whole grain oat flour`, or `farine d'avoine entière` | Whole-grain oat flour only | Preserve R230's qualified boundary. |
| `oatmeal` | Three oatmeal identities; not generic oat flour | Do not add this ambiguous English term as an alias even though OQLF lists it as a translation. |
| `malted oat flour`, `toasted oat flour`, or `oat bran flour` | No result | Keep these processed or bran phrases separate from the generic row. |

## Bundled recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Scans of ingredient text and reference IDs for oat flour, the French term, whole-grain variants, and `ingredient-ref-oat-flour` found **zero matching rows** and **zero direct links**. The bundle therefore supplies no recipe-specific measure, ingredient form, target flour, or dish context for a substitution.

## Measurement, forms, and substitution boundaries

- The Québec Food Directory’s Cuisine Soleil listing is an 800 g product, last updated 2026-07-24. Its product name is `Organic Gluten Free Oat Flour`, GTIN 851424000592, and its Nutrition Facts state **per 1/4 cup (30 g)** [S01]. This supports one product-label observation only. The entry is based on GS1 data and does not report a cup convention, fill method, or whole-grain status; it does not establish density or a transferable cup measure.
- Health Canada CNF code 6275 is specifically `Grains, oat flour, whole-grain / Grains céréaliers, farine d'avoine, grains entiers` and reports a 20 g serving [reused `WP02-S32`]. R230 assigned that code to the whole-grain row. Do not use its 20 g value for the generic row or treat it as a household-volume conversion.
- No ingredient form is attached to generic oat flour, and no active global or contextual substitution rule names this row. Plain milling identity is not a cooked, canned, or preserved form that calls for a same-ingredient form conversion.
- OQLF’s note that oat flour does not rise and is usually combined with wheat is qualitative and supplies no ratio [reused `DOAM-20261011-S06`]. The study's **10% (w/w)** result belongs to its bread formulation and tested oat-flour samples; its reported texture changes and call for further optimization do not support a reusable wheat-to-oat rule [S02]. The bundled corpus has no oat-flour recipe context from which to scope a contextual rule. Record no replacement amount, hydration correction, confidence, or risk rating as an active rule.

## Source register

New sources were accessed on **2026-10-16**. New IDs are local to this proposal; if integrated, record only the bounded evidence on the existing generic oat-flour ledger row.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A4-OATF-R287-20261016-S01` | Québec Food Directory / MAPAQ, [Organic Gluten Free Oat Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223779), product sheet, Nutrition Facts and ingredient statement; GTIN 851424000592. | Cuisine Soleil product name, 800 g package, `1/4 cup (30 g)` label serving, and organic gluten-free oat-flour ingredient. The serving is package-specific; the page does not state a cup method or whole-grain status. Product data is identified as GS1-sourced and last updated 2026-07-24. |
| `WP02-A4-OATF-R287-20261016-S02` | He et al., [“Effect on bread properties of partial substitution of wheat flour with oat flour and flour from oat grain germinated in the light or dark”](https://academic.oup.com/ijfst/article/58/4/1979/7807321), *International Journal of Food Science and Technology* 58(4), 2023, 1979–1986, DOI [10.1111/ijfs.16352](https://doi.org/10.1111/ijfs.16352), abstract and methods. | Tests 10% (w/w) oat-flour replacement in one bread formulation and reports lower specific volume, darker crust/crumb, and increased hardness/chewiness. The result concerns the tested laboratory flour and formula; the authors call for further optimization. It is not a household conversion or general substitution recommendation. |
| Reused `WP02-S26` | SATAU / Cuisine Soleil, [bilingual product portfolio](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-EN-2023-06-12.pdf), oat-flour package row. | Already owned by the generic oat-flour ledger record; reused only for the accepted bilingual identity. No measurement or substitution claim is taken from it here. |
| Reused `WP02-S32` | Health Canada, [Canadian Nutrient File code 6275](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6275), bilingual food-code name. | Already owned by the generic oat-flour ledger record; reused to confirm that code 6275 is explicitly whole-grain and belongs to the R230 grade boundary. Its 20 g serving is not applied to generic oat flour. |
| Reused `DOAM-20261011-S06` | OQLF, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine), definition, note, preferred term, and English translations. | Reused from the existing oat-term research. Supports the Québec base term, broad whole/non-whole definition, the note on combining with wheat, and the ambiguous English translation `oatmeal`; no numeric measure or substitution ratio. |

## Verification record

Re-read the current `AGENTS.md`, `Requirements.md` conversion and substitution sections, roadmap, WP02 plan, and recent proposal/integration archive including R281–R286. Confirmed the target remains open and is distinct from R230’s integrated whole-grain row, R281 whole barley flour, and R284 chickpea flour. Rechecked the live reference, ledger, form, and both substitution-rule files; exact source-ID and URL ownership; picker projection; and the manifest-listed recipe corpus. Opened the current MAPAQ and OQLF pages and the primary journal article online. No software tests, build, or emulator checks were run. This integration only adds database JSON data, as permitted by `AGENTS.md`.
