# WP03 Section F — hominy grits Québec French display review (R111, 2026-10-14)

## Review record

- **Status:** Integrated by root on 2026-10-14 as a documentation-only display review; the existing display remains provisional and no catalog or ledger data changed. See the [R111 batch README](../batches/wp03-section-f-hominy-grits-quebec-display-review-integration-20261014/README.md).
- **Scope:** Reassess the existing French display for `ingredient-ref-hominy-grits`. The ingredient remains a dry ground hominy product; this is not a new identity or a change to its processing boundary.
- **Recommendation:** Retain `hominy grits / gruau de maïs` as the current bilingual display, but keep the French display **provisional**. `Gruau de maïs` is understandable and has a direct Canadian human-food code mapping, yet current Québec usage also names ordinary white-corn grits this way. No reviewed source supports a clearer hominy-specific Québec food name.
- **Source-ID prefix:** `WP03-HG-QC-R111-20261014-S` (proposal-local only; no source records are proposed for the shared ledger).

## Plan and prior decision

The active Section F checklist already integrates `ingredient-ref-hominy-grits` as `hominy grits / gruau de maïs`, separate from whole hominy corn and ordinary corn grits. Its 2026-10-07 checkpoint records a one-row picker result for the accent-folded query `gruau de mais` and explicitly keeps Québec French review open because the phrase also appears for generic corn grits ([active plan, lines 8512–8528](../../RecipeBook-global-ingredient-catalog-plan.txt#L8532)). The original identity record also keeps aliases, forms, measures, and substitutions empty ([hominy-grits identity batch](../batches/hominy-grits-identity.md)).

The [October 10 residual-cereal review](wp03-section-f-residual-cereal-review-20261010.md) retained the identity but kept its Québec display provisional and alias-free. The adjacent [R109 oat-groats review](wp03-section-f-oat-groats-quebec-display-review-r109-20261014.md) and [R110 pot-barley recheck](wp03-section-f-pot-barley-quebec-display-recheck-r110-20261014.md) both treat current market wording as evidence distinct from formal Québec terminology approval. This review follows that naming-only scope and does not reopen those other cereal decisions.

## Québec French assessment

`Gruau de maïs` is a recognized French name for corn grits, but the evidence does not make it specific to **hominy** grits:

- OQLF lists `gruau de maïs` as its preferred French term in a brewing/malt-crushing entry. Its English terms include `grits`, `corn grits`, and U.S.-scoped `hominy grits`; the entry does not distinguish the human-food hominy process in its French term.
- TERMIUM's `grits` record gives `gruau de maïs` and `grosse semoule de maïs` for generic corn/maize grits in brewing and grain-growing domains. Its context describes raw maize or rice broken into pieces after germ removal. Another TERMIUM observation treats coarsely ground hominy as a Southern U.S. sense of `grits`; it does not supply a dedicated human-food French display for hominy grits.
- Statistics Canada's human-food MDFoodCode directly maps `Hominy grits` to `Gruau de maïs` (F232, row 918). This is the strongest direct bilingual food crosswalk found, but it is a food classification entry, not evidence that Québec consumers use the French phrase exclusively for alkali-treated hominy. The same table separately maps `Corn meal` to `Semoule de maïs`.
- OQLF's related `semoules du maïs` entry names the broader processed-hominy class and notes that its finest ground product is called `hominy grits`. It does not provide a distinct French name for that ground grade. Replacing the display with `semoules du maïs` would broaden the row to the hominy family rather than identify the grits product.
- CFIA's current Canadian feed-ingredient table calls a feed ingredient `gruau de maïs (ou gruau hominy)` and defines it by grind and bran/germ removal. The entry is explicitly for livestock feed, and its English class groups maize, corn, and hominy grits. It cannot establish a human-food Québec label or distinguish the hominy process for this picker.

Current Québec-facing product usage confirms the ambiguity. Bob's Red Mill Canada's French product page calls a coarse-ground dried-white-corn hot cereal `gruau de maïs crémeux`; its ingredient line says `maïs blanc` and does not identify the item as hominy. Québec retailer La Moisson uses the product title `Gruau de maïs blanc crémeux` for the same plain-white-corn grits product. RICARDO uses `gruau de maïs` in its description and `semoule de maïs de type grits` for a generic coarse-ground American corn ingredient; its note suggests a coarse polenta-type product for that particular recipe. These are evidence of Québec culinary usage, not hominy-process equivalence or a global polenta substitution.

An Ontario mill currently lists a dry food product as `Hominy Grits` and describes it as ground dried corn treated with an alkali solution. This supports the distinct English product available in Canada, but the page supplies no French product name. No current Québec product label found in this review names that specific product with a hominy-qualified French display.

There is no source-backed replacement that improves clarity without creating a new problem. `Semoule de maïs` is already the cornmeal display; `maïs lessivé` belongs to the separate whole-kernel hominy-corn row; `gruau hominy` is only supported here by the feed table; and `gruau` alone can suggest a cooked cereal or porridge. Keep those terms off the hominy-grits aliases. The current complete phrase is usable as a French search/display term, but it does not communicate the product's hominy processing reliably enough to call the Québec name settled.

## Product boundary

| Product | Current scope | This review's treatment |
|---|---|---|
| Hominy grits | Dry, ground hominy product | Retain the existing identity and provisional French display. |
| Hominy corn / `maïs lessivé` | Separate processed whole-kernel product | Keep under `ingredient-ref-hominy-corn`; do not substitute this wording for the ground product. |
| Ordinary corn grits | Separate dry-ground corn product; not the hominy-grits identity | Keep unallocated under the [prior ordinary-grits review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md). Do not infer that generic Québec `gruau de maïs` proves hominy treatment. |
| Cornmeal / `semoule de maïs` | Existing dry-milled cornmeal identity | Preserve its exact French ownership; no merge or alias. |
| Polenta | A prepared dish and a variable dry retail product name | Keep outside this identity and its aliases. The RICARDO replacement is recipe-specific. |
| Prepared porridge | Cooked state/dish | Keep separate from the dry ingredient reference. Do not add bare `gruau`. |

Codex's degermed-corn-grits standard expressly excludes hominy grits and alkaline-treated maize products. It supports preserving the product boundary; it does not decide the Québec French display.

## Current reference, forms, and ledger

The live seed has 1,452 ingredient references and 105 forms. The target row is:

| Field | Current value |
|---|---|
| ID | `ingredient-ref-hominy-grits` |
| Display | `hominy grits / gruau de maïs` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | `aliasesEn: []`; `aliasesFr: []` |
| Density and mappings | `defaultDensity: null`; `unitMappings: []` |
| Attached forms | None |

The ledger record is an existing verified `ingredient_reference`; measurement research is `not_yet_researched`, and substitution research is `not_yet_researched`. Its existing source history records the Statistics Canada mapping, the domain limits of OQLF and CFIA, and Québec usage for generic corn grits. No new identity or numeric evidence is proposed.

## Picker ownership and corpus effects

The static projection below follows the current phrase-first, accent- and punctuation-folding search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), over current references and attached forms. It is not emulator QA.

| Query | Current active picker result | Effect or boundary |
|---|---|---|
| `gruau de maïs` / `gruau de mais` | `ingredient-ref-hominy-grits` only | One active owner because accent folding equates the queries. Singleton app ownership does not remove the broader Québec usage collision. |
| `gruau` | 6 references: hominy grits, oat groats, raw buckwheat groats, rye meal, Scottish oatmeal, and sorghum grits | Keep the bare term off this row; it is broad and may refer to a prepared cereal. |
| `maïs` / `mais` | 25 references, including hominy grits, cornmeal, hominy corn, corn kernels, corn flour, corn starch, and other corn products | Broad query; no generic corn alias is proposed. |
| `hominy` | `ingredient-ref-hominy-corn` and `ingredient-ref-hominy-grits` | Preserves the current whole-kernel versus ground-product distinction. |
| `hominy grits` | `ingredient-ref-hominy-grits` only | Exact English identity remains unambiguous. |
| `hominy corn` / `maïs lessivé` | `ingredient-ref-hominy-corn` only | Whole-kernel processed-corn terms remain with their existing row. |
| `cornmeal` / `corn meal` / `semoule de maïs` | `ingredient-ref-cornmeal` only | Existing cornmeal ownership is unchanged. |
| `corn grits` | No active result | Ordinary corn grits remain unresolved; no exact current term is assigned. |
| `grits` | 3 references: hominy grits, sorghum grits, and attiéké | Generic query stays multi-result. |
| `gruau hominy` / `polenta` | No active result | Neither is added as a new display or alias. |

If a future ordinary-corn-grits row uses `gruau de maïs`, the full French phrase would become a two-row picker result. That possibility is another reason not to turn this provisional phrase into an exclusive alias or to assign it to a generic-grits candidate now.

The current manifest lists 114 recipe files and 1,123 structured ingredient rows. A whole-file and ingredient-row scan found zero matching ingredient rows for `hominy grits`, `hominy corn`, `hominy`, `gruau de maïs`, `corn grits`, `grits`, `cornmeal`, `semoule de maïs`, `polenta`, or `maïs lessivé`. The only whole-file `gruau` hits are oatmeal recipe metadata/titles; none is an ingredient row or hominy-grits demand. No recipe link or quantity change is proposed.

## Explicit data/no-data proposal

**No shared data change.** Retain the existing identity, display string, empty aliases, category, null density, empty mappings, absence of forms, and ledger research states as they are. Do not create a generic corn-grits row, alter `semoule de maïs`, add `gruau hominy` or `maïs lessivé` as an alias, attach a form, add measures/conversions/yields/substitutions, or relink a recipe. Keep the Québec display provisional until a Québec food-label or terminology source establishes wording for hominy grits that stays distinct from generic corn grits and whole hominy.

## Source register

Sources were checked online on **2026-10-14**. These identifiers are local to this proposal and have not been appended to `research-ledger.v1.json`.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-HG-QC-R111-20261014-S01` | Office québécois de la langue française, [gruau de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais), updated 1986. | Preferred term in a brewing/malt-crushing entry; English terms include generic `grits`/`corn grits` and U.S.-scoped `hominy grits`. Does not establish a hominy-specific French food name. |
| `WP03-HG-QC-R111-20261014-S02` | OQLF, [semoules du maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17036518/semoules-du-mais), updated 1987. | Names the hominy product family and says its finest ground form is called hominy grits. It does not give a French term for that grade. |
| `WP03-HG-QC-R111-20261014-S03` | Government of Canada Translation Bureau, [TERMIUM Plus: grits](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=GRITS), record dated 2008-10-20; accessed 2026-10-14. | `Gruau de maïs` and related French terms are attached to generic brewing/grain-growing grits. The domain and definition do not settle hominy-grits consumer naming. |
| `WP03-HG-QC-R111-20261014-S04` | Canadian Food Inspection Agency, [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), entry 1-202-007. | Uses `gruau de maïs (ou gruau hominy)` for a ground-maize **feed** ingredient. Not a human-food name or process-equivalence rule. |
| `WP03-HG-QC-R111-20261014-S05` | Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), F232 row 918 (1996 code table). | Direct human-food classification pair `Hominy grits / Gruau de maïs`; row 916 separately pairs `Corn meal / Semoule de maïs`. This is a code crosswalk, not consumer-language evidence. |
| `WP03-HG-QC-R111-20261014-S06` | Codex Alimentarius, [CXS 155-1985, Degermed Maize (Corn) Meal and Maize (Corn) Grits](https://www.fao.org/input/download/standards/53/CXS_155e.pdf), scope 1.1–1.3; revised 1995. | Excludes hominy grits and alkaline-treated maize products from the ordinary degermed-grits standard. Boundary evidence only. |
| `WP03-HG-QC-R111-20261014-S07` | Bob's Red Mill Canada, [Céréales chaudes de gruau de maïs crémeux](https://www.bobsredmill.ca/produit/cereales-chaudes-de-gruau-de-mais-cremeux), current Canadian French product page. | Uses `gruau de maïs` for coarse-ground dried white corn; its ingredient line is `Maïs blanc`. Does not identify the item as hominy grits. |
| `WP03-HG-QC-R111-20261014-S08` | La Moisson, [Gruau de maïs blanc crémeux](https://lamoisson.com/products/gruau-de-mais-blanc-cremeux-creamy-white-corn-grits), current Québec retailer page. | Uses the same French wording for the Bob's Red Mill white-corn grits product. Commercial wording, not hominy-specific terminology. |
| `WP03-HG-QC-R111-20261014-S09` | RICARDO, [Grits aux crevettes](https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes), ingredient list and team note. | Québec culinary text uses `gruau de maïs` and `semoule de maïs de type grits`, and describes generic coarse-ground American corn semolina. Its polenta-type replacement is recipe-specific. |
| `WP03-HG-QC-R111-20261014-S10` | Arva Flour Mill, Ontario, [Hominy Grits 850g](https://arvaflourmills.com/products/hominy-grits), current Canadian product listing. | English-only listing describes dried corn ground after alkali treatment. Confirms a Canadian hominy-grits product, not a Québec French label. |

## Read-only checks

- Re-read the active Section F plan, current roadmap checkpoints, `plant-grains-cereals.md`, the hominy-grits identity batch, the [R109](wp03-section-f-oat-groats-quebec-display-review-r109-20261014.md) and [R110](wp03-section-f-pot-barley-quebec-display-recheck-r110-20261014.md) Québec cereal-display reviews, and the [ordinary-corn-grits review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md).
- Inspected the live reference and form JSON, the hominy-grits ledger record, and legacy-import identities. The legacy file has no exact hominy/grits/cornmeal term owner; its unreviewed generic `corn / maïs` entry is not in the active picker.
- Projected phrase-first picker results from the current 1,452 references and 105 forms using the normalization and matching rules in `IngredientSearch.kt`.
- Scanned every manifest-listed recipe file and structured ingredient row; the package contains 114 files and 1,123 ingredient rows. No tests or emulator checks were run because this is a proposal-only terminology review.
