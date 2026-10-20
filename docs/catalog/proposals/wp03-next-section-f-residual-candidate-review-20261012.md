# WP03 Section F: cream-of-rye hot-cereal candidate review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** root-reconciled on 2026-10-12 as a documentation-only hold; no shared catalog, ledger, recipe, generated file, or application file changed. See the [integration note](../batches/wp03-cream-of-rye-hot-cereal-hold-integration-20261012/README.md).
- **Scope:** the English product class called cream of rye as a dry rye hot cereal, and whether current evidence supports a separate bilingual identity.
- **Open checklist:** Section F still leaves regional cereal mixes and preprocessed grains open at [plan line 2080](../../RecipeBook-global-ingredient-catalog-plan.txt#L2173), with the continuation repeated at [line 9016](../../RecipeBook-global-ingredient-catalog-plan.txt#L9297). The checklist now separately covers hot-cereal identities for cream of rice, cream of wheat, cream of barley, creamy buckwheat, Red River, and Sunny Boy; it does not review cream of rye. The [recent Grape-Nuts review](./wp03-next-open-section-f-grain-candidate-review-20261012.md) covers another named product and does not address rye.
- **Archive check:** repository-wide case-insensitive searches of the current plan, roadmap, proposal and batch archives, references, forms, legacy identities, ledger, and bundled package found no prior cream-of-rye identity or terminology review, and no exact candidate allocation. The [rye-flakes integration](./wp03-section-f-rye-flakes-identity-review-20261011.md) and rye-meal reviews define neighboring products but do not decide cream of rye.

## Recommendation

**Hold cream of rye outside the active catalog.** U.S. federal cereal guidance recognizes “cream of rye” as an example of a hot breakfast cereal, and a historical USDA questionnaire lists it among other hot cereals. This establishes a documented English product class. The reviewed sources do not provide a current Canadian or Québec dry-product label, composition, or French name.

The closest Québec wording is *gruau de seigle*, but it is unsuitable as this candidate’s French display. RICARDO uses it for rye porridge cooked in milk; the OQLF defines *gruau* as a prepared dish, with the sense extensible to dishes made from other cereals; and TERMIUM assigns the exact compound *gruau de seigle* to coarse rye meal. The live catalog already owns it on **rye meal / gruau de seigle**. The literal *crème de seigle* and explanatory *céréales chaudes de seigle* were not established as Québec product names. Neither should be invented for the bilingual catalog.

There is also unresolved product-boundary evidence: a secondary review of the former Roman Meal Cream of Rye product describes it as whole-grain flaked rye, while the active catalog already has a separate plain rye-flakes identity. The available evidence does not establish whether a general cream-of-rye class denotes a distinct grind, a flake product prepared hot, or one particular historical SKU.

No candidate ID is reserved. If a current Canadian/Québec package or authoritative terminology source later establishes a dry product, its English wording, and a distinct French name, a future review could consider one identity-only **cream of rye hot cereal / directly sourced French product name** reference in `GRAIN_AND_CEREAL`. Do not use `gruau de seigle` or `semoule de seigle`, which belong to the active rye-meal identity. On current evidence, the precise shared-file delta is **none**.

## Candidate scope and product boundaries

The candidate is limited to a dry rye-based product recognized as a hot breakfast cereal under the English name *cream of rye*. The evidence does not establish a universal recipe, grind, ingredient declaration, or current supplier. “Cream” is part of the cereal name; no source describes a dairy ingredient.

Keep this candidate separate from:

- **Rye meal / gruau de seigle**, the active coarse whole-kernel milling product used for pumpernickel; its French aliases include *semoule de seigle* and *farine à pumpernickel*.
- **Rye flakes / flocons de seigle**, the active plain flaked-grain identity. A historical Roman Meal product review suggests the former Cream of Rye SKU may have been made from flaked rye, but this secondary source does not prove that all cream-of-rye products are rye flakes or that they are interchangeable.
- Whole rye or rye berries, rye flour and its extraction grades, malted rye flour, puffed rye, rye bread, and cooked rye porridge.
- Cream of rice, cream of wheat, cream of barley, creamy buckwheat, Red River, Sunny Boy, and other branded or composite cereals. Shared breakfast use does not imply identical composition or process.
- Generic *hot cereal*, *cereal mix*, or *rye cereal*. These are broader classes, not aliases for this candidate.

The FDA category name is useful evidence for the English class but is not evidence that every product sold or described as cream of rye has one formulation. The USDA survey and former Roman Meal references are historical; they do not establish present retail availability in Québec or Canada.

## Current package snapshot

Snapshot rechecked from the live split seed package on 2026-10-12. File hashes cover exact bytes. The corpus fingerprint is SHA-256 over each manifest-ordered recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Artifact | Count/state | SHA-256 or corpus fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,277 references; 123 in `GRAIN_AND_CEREAL` | `35f1b3b98527b87d15648c9722af9a968e4b160e2b19714d8de66612bbd8d076` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 manifest-listed recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,585 records; 5,630 source entries; 4,661 distinct source IDs | `d75f02fafc1cfd015d10148a9e15c5862b438d190e4c3e8fa0cbc41313ceec97` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The last digest is an audit fingerprint, not a package-format checksum. No files were altered by this review.

## Exact ownership and related records

Exact-key checks use the repository’s normalization rules: lowercase, Unicode NFKD, accent and ligature folding, punctuation-to-space normalization, and whitespace folding. Exact normalized ownership is distinct from the picker’s phrase-in-a-longer-name behavior described below.

| Phrase or product | Active-reference / form owner | Legacy and ledger state |
|---|---|---|
| `cream of rye`, `cream of rye cereal`, `cream of rye hot cereal`, `cream rye cereal`, `rye hot cereal`, `hot rye cereal` | No exact active display, alias, form label, or form match term. No rye-specific form exists. | No exact legacy owner or cream-of-rye ledger record/string. The generic legacy candidate `cream / crème` does not own any of these complete phrases. |
| `crème de seigle`, `céréales chaudes de seigle` | No exact active reference or form owner. These are not proposed as sourced names. | No exact legacy owner or ledger record/string. |
| `rye meal`, `gruau de seigle` | Exact owner: `ingredient-ref-rye-meal`, category `FLOUR_AND_STARCH`, displayed `rye meal / gruau de seigle`. | Accepted ingredient-reference record; measurement and substitution research remain `not_yet_researched`. TERMIUM source ID `WP02-RYEMEAL-20261010-S01` is already recorded there. |
| `semoule de seigle` | Active French alias of `ingredient-ref-rye-meal`; do not reuse it for cream of rye. | Covered by the same accepted rye-meal record. |
| `rye flakes / flocons de seigle` | Exact owner: `ingredient-ref-rye-flakes`, category `GRAIN_AND_CEREAL`, no aliases or forms. | Accepted identity with eight existing sources; no measurement or substitution behavior. |
| `rye / seigle` | Exact owner: `ingredient-ref-rye-grain`, category `GRAIN_AND_CEREAL`. | Accepted identity. Its measurement state is researched, but that does not supply a hot-cereal measure or yield. |
| Other active rye rows | `ingredient-ref-rye-berries`, `ingredient-ref-rye-flour`, `ingredient-ref-light-rye-flour`, `ingredient-ref-medium-rye-flour`, `ingredient-ref-whole-rye-flour`, and `ingredient-ref-malted-rye-flour` remain distinct. | The ledger also has separate `candidate-puffed-rye` and `candidate-toasted-rye-flour` records. Neither covers cream of rye. |

The proposed English/French phrases and any cream-of-rye ID have no exact active, form, legacy, or ledger owner. No proposal-local source ID `WP03-CREAMRYE-20261012-S01` through `S08` was present in the ledger when checked; these IDs are local to this review and have not been registered there.

## Actual picker behavior

The recipe editor’s ingredient picker constructs `IngredientReferenceSearchIndex` from the active references and forms in `RecipeEditorScreen.kt` and calls `filterNormalized` while the user types. `IngredientSearch.kt` normalizes case, accents, ligatures, and punctuation; gives an exact attached-form phrase first priority; otherwise returns references whose display or alias contains the complete query as a word phrase; only if that returns no rows does it use substring matching. Results retain their full reference labels. The table is a static evaluation of this current source code and package snapshot, not emulator or UI testing.

| Current query | Current picker result |
|---|---|
| `cream of rye` | 0 results |
| `gruau de seigle` | 1 result: `ingredient-ref-rye-meal` |
| `semoule de seigle` | 1 result: `ingredient-ref-rye-meal` |
| `rye` or `seigle` | 9 qualified references: light rye flour; malted rye flour; medium rye flour; rye berries; rye flakes; rye flour; rye grain; rye meal; whole rye flour |
| `hot cereal` | 5: cream of rice hot cereal; cream of wheat hot cereal; creamy buckwheat hot cereal; Red River cereal; Sunny Boy cereal |
| `cereal` | 10: bran flakes cereal; cream of barley cereal; cream of rice hot cereal; cream of wheat hot cereal; creamy buckwheat hot cereal; malt flour (through its cereal-flour alias); crispy rice cereal; shredded wheat cereal; Red River cereal; Sunny Boy cereal |

As an English-only hypothetical, adding a display named `cream of rye hot cereal` would make `cream of rye` return that new row. It would also add that row to the broad `rye` query (10 results), `hot cereal` (6), and `cereal` (11). A suitable French display is unresolved, so French query behavior cannot be responsibly simulated. Adding `gruau de seigle` would return or collide with the existing rye-meal owner and would erase the product boundary.

## Full bundled recipe-demand scan

All 114 files named by the current manifest were searched across their complete serialized JSON text, and every ingredient row was searched across `originalText`, `ingredientName`, and `ingredientRefId`. The candidate/neighbor phrase set included cream of rye; cream of rye cereal; cream of rye hot cereal; cream rye cereal; rye hot cereal; hot rye cereal; rye porridge; *crème de seigle*; *céréales chaudes de seigle*; *gruau de seigle*; *semoule de seigle*; rye meal; rye flakes; rye berries; rye flour; rye; and seigle.

| Scope | Result |
|---|---:|
| Candidate and neighboring phrase hits in manifest recipe files | 0 / 114 |
| Candidate and neighboring phrase hits in ingredient rows | 0 / 1,123 |
| Supported recipe links | 0 |

This bundle has no direct cream-of-rye demand and no rye/seigle ingredient-line demand. No recipe link, amount, recipe-text change, or substitution is proposed.

## Measurements, forms, and substitutions

- **Forms:** add none. The sources do not agree on a distinct processing scope; the historical Roman Meal review describes its cream-of-rye SKU as flaked rye. A dry/cooked state, granulation, or “cream” form is not supported.
- **FDA category amount:** FDA’s nonbinding hot-breakfast-cereal guidance lists a reference amount of 1 cup prepared or 40 g plain dry cereal (55 g if flavored/sweetened), with cream of rye among its examples. This is a regulatory labeling category amount, not a current cream-of-rye package serving, a dry-to-prepared yield, or a mass-volume conversion. Do not add a serving, density, or unit mapping from it.
- **Historical USDA amount:** a 1977–78 USDA survey manual records 1 cup as 0.250 lb and a 22 oz package for the historical cream-of-rye category. This is an old survey coding value, not an identified current package specification. Do not treat it as a current measure, density, or conversion.
- **Current measurement evidence:** no reviewed Canadian/Québec manufacturer or package page establishes a current cream-of-rye serving, volume-to-mass value, preparation ratio, cook time, or dry-to-cooked yield. No package-size or brand-specific amount is transferable.
- **Substitutions:** add no global or contextual rule for rye flakes, rye meal, oats, other cream cereals, or cereal blends. Sources establish shared hot-cereal use or an old product example, not a tested ratio or method-specific interchangeability.
- **Catalog fields if later justified:** keep density null, unit mappings empty, and forms, yields, recipe links, and substitutions empty unless separate direct evidence resolves each question.

## Source register

Pages were reviewed on 2026-10-12. Sources S01–S08 below are proposal-local IDs only; no research-ledger changes were made. Existing source ID `WP02-RYEMEAL-20261010-S01` is reused as a cited ownership boundary and was not duplicated.

| Source ID | Source and direct URL | Evidence and limits |
|---|---|---|
| `WP03-CREAMRYE-20261012-S01` | U.S. Food and Drug Administration, [Guidance for Industry: Reference Amounts Customarily Consumed — products by category](https://www.fda.gov/media/102587/download). | Lists cream of rye among cereal-grains used as hot breakfast cereals. The category lists nonbinding label reference amounts; it does not define cream-of-rye composition, a Canadian product, a French display, or a recipe conversion. |
| `WP03-CREAMRYE-20261012-S02` | U.S. Department of Agriculture, [Nationwide Food Consumption Survey — 1987 household questionnaire](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/8788/nfcs8788_hhold.pdf), PDF page 46, “Other hot cereals.” | Lists cream of rye separately among other hot cereals. This is an historical U.S. survey category, not a current retail label, processing specification, or Canadian/Québec naming source. |
| `WP03-CREAMRYE-20261012-S03` | U.S. Department of Agriculture, [Manual of food codes and weights for the 1977–78 Nationwide Food Consumption Survey](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/7778/cfe_admin_rep_335.pdf), grain-products table, printed page 249. | Records the historical cream-of-rye survey category with a 1 cup weight of 0.250 lb and a 22 oz package. The measures are dated survey coding evidence and are not applied to a current ingredient identity. |
| `WP03-CREAMRYE-20261012-S04` | RICARDO, [Des céréales chaudes au petit déjeuner](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner), seigle paragraph. | Québec culinary article says *gruau de seigle ou d’avoine bouilli avec le lait de vache de la traite du matin*. Supports French wording for a prepared hot cereal/porridge, not a dry packaged cream-of-rye product. |
| `WP03-CREAMRYE-20261012-S05` | Office québécois de la langue française, [GDT: gruau, prepared-dish sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau). | Defines *gruau* as a hot dish made from cooked oatmeal and notes that its sense may extend to dishes made from other cereals. This is dish terminology, not a dry cereal product name. |
| `WP03-CREAMRYE-20261012-S06` | Office québécois de la langue française, [GDT: gruau, cereal-milling sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau). | Brewing/malt-crushing entry describes cereal grits and coarse/fine semolina; it does not define the retail hot cereal. Included to show that bare *gruau* also has a milling sense. |
| Existing `WP02-RYEMEAL-20261010-S01` | Government of Canada Translation Bureau, [TERMIUM Plus: rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE). | Existing ledger source defines rye meal/pumpernickel flour as whole-kernel rye, coarse and dark, for pumpernickel bread and rolls; it gives *gruau de seigle* and *semoule de seigle*. This is the authoritative naming and product boundary for the active rye-meal row, not cream of rye. |
| `WP03-CREAMRYE-20261012-S07` | Whole Foods Market, [Do Right by Rye](https://www.wholefoodsmarket.com/tips-and-ideas/archive/do-right-rye). | Older retailer editorial recommends cream-of-rye cereal as a breakfast use and separately mentions rye flakes. It supports English culinary usage only; it is not a manufacturer label, current availability evidence, or product specification. |
| `WP03-CREAMRYE-20261012-S08` | The Nibble, [Organic cereals product review](https://www.thenibble.com/reviews/nutri/breadstuffs/organic-cereal-brands5.asp), Roman Meal Cream of Rye entry. | Secondary historical review describes the former Roman Meal SKU as organic whole-grain flaked rye. This suggests possible overlap with the active rye-flakes identity but is not a primary ingredient declaration or a universal cream-of-rye definition. |

## Evidence limits and proposed future delta

The strongest identity evidence is U.S. category language, not a current product label. The Québec sources clarify why a literal French translation is unsafe and why *gruau de seigle* must remain with rye meal; they do not supply a French display for a dry cream-of-rye cereal. Bounded searches found no direct OQLF/TERMIUM entry or current Québec/Canadian packaged product with that exact product name. This does not prove that no such item is sold or used in Canada.

**Current integration delta: none.** Do not change active references, forms, legacy identities, ledger records, recipes, yields, measurements, or substitutions. Reopen only when a current Canadian/Québec plain rye hot-cereal product source or authoritative term supplies a directly attested bilingual identity and distinguishes it from rye meal and rye flakes. If that threshold is met, consider one identity-only `GRAIN_AND_CEREAL` reference using the exact sourced English and French product names, with empty aliases and no forms or numeric behavior unless separately supported. Keep Section F open.
