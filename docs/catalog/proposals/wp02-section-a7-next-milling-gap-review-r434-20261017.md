# WP02 Section A7 R434: rye grits product and naming boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal-only bounded hold. This file changes no shared catalog JSON, research ledger, plan, roadmap, generated index, recipe, or batch README.
- **Checklist context:** The [active A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004) remains open for other grain-meal and milling boundaries.
- **Prior decision kept:** The 2026-10-10 [A7 overview](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md) noted that Statistics Canada lists rye grits separately from rye meal and kept the two concepts separate. It did not allocate a rye-grits identity or audit a current grits product, its French name, live picker effects, or exact recipe demand. This follow-up fills that bounded product/name review; it does not reopen active rye meal or cracked rye.
- **Recent related decisions kept:** R421 holds wheat grits; R418 holds oat grits; R415 adds buckwheat grits; R412 adds barley grits; R409 holds triticale grits; R53 holds pearl millet grits; and R31 holds unqualified rice grits. These are grain-specific decisions and do not establish a rye-grits label.
- **Scope:** Review only human-food rye grits and whether a current Canadian/Québec-facing bilingual product boundary can be named. Keep rye meal, cracked rye, whole rye/rye berries, rye flakes, rye flour, malted rye meal, and prepared grain cereals separate.

## Recommendation

**Keep `rye grits` and `rye grit` unallocated. Do not add an active reference, alias, or new ledger candidate.** In particular, do not alias either phrase to `ingredient-ref-cracked-rye` or `ingredient-ref-rye-meal`, and do not use `seigle concassé`, `gruau de seigle`, or `semoule de seigle` as a rye-grits display or alias.

Statistics Canada's current NAPCS examples recognize `rye grits` and `rye meal for human consumption` as separate names within human-consumption grain products [S01]. A current Minnesota mill offers an exact-name `Organic Rye Grits` product and describes it as cracked rye kernels eaten as cereal [S02]. These sources support rye grits as a real named product concept, but neither establishes a Canadian consumer milling boundary or Quebec French display.

Current Canadian/Québec sources document the neighboring product `cracked rye / seigle concassé`. The Canadian supplier offers several cracked-rye granulations without defining one as rye grits [WP03-CRYE-20261012-S04]. The Québec mill lists the paired English/French product names `Organic Cracked Rye / Seigle concassé biologique`, separate from whole rye and its multi-grain blends [WP03-CRYE-20261012-S01–S02]. That evidence does not establish that every locally sold cracked-rye granulation is the separately named cereal product `rye grits`.

The apparent French match is already owned: the federal TERMIUM entry assigns `gruau de seigle` and `semoule de seigle` to **rye meal**, describing whole-kernel rye ground coarse and dark for pumpernickel bread [WP02-RYEMEAL-20261010-S01]. OQLF separately records `gruau` as a cooked oatmeal dish whose meaning can extend to other cereal dishes, and its technical grits entry is scoped to malt crushing [WP03-BW-GROATS-QC-20261011-S01–S02]. Neither supplies a Quebec consumer name for rye grits. The evidence therefore does not support changing the rye-meal or cracked-rye ownership to force a bilingual result.

| Proposed data field | Disposition |
|---|---|
| Active identity / category | None; do not add a rye-grits reference. |
| English aliases | None; keep `rye grits` and `rye grit` unallocated. |
| French display or aliases | None; retain `seigle concassé` on cracked rye and `gruau de seigle` / `semoule de seigle` on rye meal. Do not invent `gruau de seigle` for grits. |
| New ledger candidate / source entries | None; no `candidate-rye-grits` record or shared source entry is proposed. |
| Forms, measures, density, unit mappings, conversions, and yields | None. |
| Recipe links or substitutions | None. |

## Product and ownership boundary

| Neighbor | Existing owner and boundary to retain |
|---|---|
| Cracked rye | `ingredient-ref-cracked-rye` — `cracked rye / seigle concassé`, category `GRAIN_AND_CEREAL`, with empty alias lists. Current Canadian and Québec listings establish this cracked-rye product name. Everspring says it offers multiple granulations; no source reviewed defines those granulations as rye grits. |
| Rye meal | `ingredient-ref-rye-meal` — `rye meal / gruau de seigle`, category `FLOUR_AND_STARCH`; French alias `semoule de seigle` and source-backed pumpernickel terms. TERMIUM's entry is for coarse, dark, whole-kernel meal used in pumpernickel. Do not move its French name to rye grits. |
| Whole rye and rye berries | `ingredient-ref-rye-grain` — `rye / seigle`; `ingredient-ref-rye-berries` — `rye berries / grains de seigle`. A cracked product is not an intact kernel or a synonym for the whole-grain rows. |
| Rye flakes and flours | `ingredient-ref-rye-flakes`, plus distinct rye-flour grade references. They do not establish a grits identity or particle-size crosswalk. |
| Composite and prepared cereals | Red River cereal and other multi-grain products keep their own product identities. Their ingredient lists or nutrition portions do not measure standalone rye grits. |

The earlier A7 overview's statement that rye grits and rye meal are distinct is retained. This proposal does not turn that distinction into an unsupported active identity: it adds the current product and name evidence needed to explain why the picker still has no safe bilingual row.

## Current catalog, form, legacy, and ledger audit

The read-only snapshot was taken from the live split seed package and research ledger on 2026-10-17. Hashes identify the exact files reviewed.

| Store | Live snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,729 rows; SHA-256 `a78fe43a9d263b0e893d63a544a60ae90a2841295b88e7eec9159f60bf914f5e` | No exact `rye grits` / `rye grit` name or alias. `ingredient-ref-cracked-rye` owns `cracked rye / seigle concassé`; `ingredient-ref-rye-meal` owns `rye meal / gruau de seigle` and `semoule de seigle`. Both have null default density and empty unit mappings. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No rye-related form is attached to the rye references; no form label or match term owns rye grits. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact rye-grits legacy identity or alias. |
| Research ledger | 2,088 records, 9,467 source entries, and 8 unit-conversion records; SHA-256 `ddb29ceba01bfb71c4e3e128d9683e17a709ba848009eae352a7be49f2d4405a` | No `candidate-rye-grits` or exact rye-grits record. Neighboring rye records and source notes do not allocate a grits identity. The existing cracked-rye and rye-meal records remain attached to their respective rows. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All paths exist and parse; full-corpus results are below. |

The picker uses complete normalized word phrases first, then substring fallback; see [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The static projections from the current references and forms are:

| Query | Current results | Hold effect |
|---|---|---|
| `rye grits`; `rye grit` | None | Keep unallocated. |
| `grits` | Six references: attiéké, barley grits, buckwheat grits, corn grits, hominy grits, and sorghum grits | No seventh result is added. |
| `rye`; `seigle` | Eleven references each, including the cracked-rye, rye-meal, grain, berries, flakes, bran, and flour identities | No additional broad-query result is added. |
| `gruau de seigle`; `semoule de seigle` | `ingredient-ref-rye-meal` | Preserve existing rye-meal ownership. |
| `seigle concassé`; `cracked rye` | `ingredient-ref-cracked-rye` | Preserve the current cracked-rye identity; do not assert rye grits is its synonym. |
| `rye meal` | `ingredient-ref-rye-meal` | Preserve the narrower meal identity. |

These are static query projections from current seed data and source-code behavior, not a live UI or emulator test. An English-only hypothetical row would make `rye grits` return a result and broaden `grits` to seven and `rye` to twelve results, while still leaving French search without a supported label. No such row is proposed.

## Complete bundled recipe demand

All **114** paths in the current manifest were read and parsed, covering **1,123 structured ingredient rows**. Each complete serialized recipe and each ingredient row was scanned for `rye grits`, `rye grit`, `grits of rye`, `gruau de seigle`, `gruaux de seigle`, `grits de seigle`, `seigle concassé`, `seigle cassé`, `cracked rye`, `rye meal`, `rye berries`, `rye kernels`, `rye flakes`, and `pumpernickel`. The scan found **zero candidate phrase hits in recipe files and zero ingredient-row hits**. A word-boundary scan for `rye` and `seigle` also found zero file or row demand; a raw substring-only `rye` scan's three hits were `fryer` text in air-fryer recipe files, not rye ingredients. No recipe supplies a measurement or link to add.

## Measures, density, forms, and substitutions

- The current standalone cracked-rye and rye-meal references both have null density, empty unit mappings, and no attached forms. No rye-grits form or reusable measurement exists.
- Natural Way Mills lists 5 lb and 50 lb packages for its own rye-grits SKUs [S02]. These are package sizes, not household measures or evidence for a general density. Everspring's 50 lb / 20 kg bulk formats and La Milanaise's 8–24-hour bread-use soaking note are also product-specific; neither supplies a mass/volume relation, cooking ratio, or yield [WP03-CRYE-20261012-S01, S04].
- The rye-grain ledger has one historical USDA portion for the specific `Rye grain` food record (1 cup = 169 g); it is not cracked rye or rye grits. Red River cereal has one manufacturer-reported approximate cup mass for the complete wheat/rye/flax cereal blend. Neither observation may be transferred to rye grits.
- The active global and contextual substitution-rule files each contain zero rules. The single current package-yield record is for canned black beans. No source reviewed provides a rye-grits replacement ratio or cooking substitution; add none.

## Sources checked on 2026-10-17

New source IDs below are proposal-local and are not shared-ledger records. Existing ledger source IDs are explicitly marked reused.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **Reused:** `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S06` | Statistics Canada, [NAPCS Canada 2022, class 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), modified 2026-01-08. | Lists rye grits and rye meal for human consumption separately among human-consumption grain products. | Classification examples do not define a milling state, retail scope, French name, recipe behavior, or equivalence with cracked rye. This source ID already exists in the ledger on `candidate-barley-meal`; do not duplicate it. |
| `WP02-A7-RYE-GRITS-R434-20261017-S01` | Natural Way Mills, [Organic Grits](https://www.naturalwaymills.com/products.php?cat=Organic+Grits), product listings for Organic Rye Grits (5 lb, product 307RG; 50 lb, product 305RG). | A current U.S. mill sells an exact-name rye-grits product and describes its product as rye kernels cracked and used as cereal. | Minnesota manufacturer, not a Canadian or Québec listing. It gives no particle-size specification, French product name, household measure, cooking ratio, or general yield. The two weights are SKU package sizes only. |
| **Reused:** `WP03-CRYE-20261012-S04` | Everspring Farms, [Cracked Rye](https://www.everspringfarms.ca/product/cracked-rye/), current Canadian supplier product details. | Lists Canadian-origin Cracked Rye and Organic Cracked Rye and says it offers a variety of granulations. | It does not use the name `rye grits`, give exact particle ranges, or provide a French display. Bulk bag sizes are not kitchen measures. |
| **Reused:** `WP03-CRYE-20261012-S01` | La Milanaise, [Seigle concassé biologique](https://lamilanaise.com/produits/seigle-concasse-biologique/), Québec mill product page. | Current French product title and bread-use instructions; names the neighboring cracked-rye product. | Does not name rye grits, define the product's granulation, or establish a grits synonym. The 8–24-hour soak is a preparation note, not a conversion. |
| **Reused:** `WP03-CRYE-20261012-S02` | La Milanaise, [Products archive, page 2](https://lamilanaise.com/en/produits/page/2/), current English product listing. | Names Organic Cracked Rye separately from Organic Rye and the mill's multi-grain blends. | Does not name rye grits or define a product-size boundary. Product-specific soaking instructions are not a form conversion. |
| **Reused:** `WP02-RYEMEAL-20261010-S01` | Translation Bureau, TERMIUM Plus, [rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE), Food Industries / Breadmaking, 2001-07-30. | Assigns `gruau de seigle` and `semoule de seigle` to coarse, dark whole-kernel rye meal used for pumpernickel; supports the active rye-meal boundary. | It does not translate `rye grits` or define a grits alias. It is already cited on `ingredient-ref-rye-meal`; do not duplicate the source record. |
| **Reused:** `WP03-BW-GROATS-QC-20261011-S01` | OQLF, [GDT: gruau, prepared-dish sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), 2002. | Defines Québec `gruau` as cooked oatmeal and notes the meaning can extend to other cereal dishes. | Prepared-food terminology, not a dry rye-grits product name. |
| **Reused:** `WP03-BW-GROATS-QC-20261011-S02` | OQLF, [GDT: gruau, malt-crushing sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), 1983. | Records a technical milling sense translated as grits and describes malt-crushing fractions. | Brewing/malt domain; it does not establish `gruau de seigle` as a Québec food name for rye grits. |

## Disposition and reopening condition

Keep `rye grits` / `rye grit` outside active references and aliases and leave the shared ledger unchanged. Preserve `cracked rye / seigle concassé` and `rye meal / gruau de seigle` with their current distinct names. Do not add a form, density, unit mapping, observation, conversion, yield, recipe link, or substitution. This proposal-only hold needs no tests, build, emulator, or deployment run.

Reopen only if a current Canadian or Québec source names a standalone rye-grits product and supplies both a product-matched French display and enough milling detail to distinguish it from the existing cracked-rye and rye-meal identities. New SKU package weights or a general grits definition alone would not satisfy that boundary.
