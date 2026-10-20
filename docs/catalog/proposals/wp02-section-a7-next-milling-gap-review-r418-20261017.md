# WP02 Section A7 R418: oat grits terminology and milling boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file changes no shared catalog JSON, forms, ledger, plan, roadmap, generated index, recipes, batch README, or tests.
- **Open checklist:** Continue A7 review of grain meals and milling products in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Recent decisions kept in force:** R415 added identity-only `buckwheat grits / gruau de sarrasin`; R412 added `barley grits / gruau d'orge`. The plan separately accepts `oat groats / gruau d'avoine entier` and named `Scottish oatmeal / gruau écossais`, while keeping generic dry oat meal unresolved.
- **Scope:** Review only the unqualified milling term pair `oat grits / gruau d'avoine`. Do not reopen the existing generic-oatmeal hold, oat-groats identity, Scottish-oatmeal identity, steel-cut oats, or any other grain decision.

## Recommendation

**Hold `oat grits` and `gruau d'avoine` outside active references and aliases.** Do not add a new reference or ledger candidate, and do not assign either term to oat groats or Scottish oatmeal.

TERMIUM Plus provides federal bilingual support for the phrase pair in a milling context and describes oat grits as whole oats ground coarsely [S01]. The same terminology results also say that *grits* can sometimes be synonymous with *groats*, while a separate record defines oat groats as the hulled whole kernel. Québec's OQLF defines unqualified *gruau* as a cooked oatmeal dish and allows the word to extend to porridges made from other cereals [S02]. These sources do not establish whether the proposed picker terms mean whole hulled kernels, coarse-ground kernels, or a prepared cereal in current Québec consumer use.

The active catalog already separates whole oat groats from a named coarse-ground product, Scottish oatmeal. A Canadian mill and Bob's Red Mill Canada provide product-specific evidence for the latter as `Scotch oatmeal` / `Scottish oatmeal` and `gruau écossais`; they do not establish `oat grits` as an equivalent product name [S03–S04]. Retain those existing decisions and keep the full qualifier on the oat-groats French display.

| Proposed field | Disposition |
|---|---|
| New identity or alias | None |
| Existing owner of `oat grits` / `oat grit` | None |
| Current phrase match for `gruau d'avoine` | `ingredient-ref-oat-groats`, through its qualified display `gruau d'avoine entier` |
| Forms, measures, density, unit mappings, conversions, yields | None added |
| Recipe links or substitutions | None added |

## Product boundary

| Neighbor | Boundary to retain |
|---|---|
| `ingredient-ref-oat-groats` — `oat groats / gruau d'avoine entier` | Whole hulled kernels. The full French qualifier remains on the row; do not shorten it to `gruau d'avoine`. Existing aliases are `hulless oats` and `avoine nue`. |
| `ingredient-ref-scottish-oatmeal` — `Scottish oatmeal / gruau écossais` | Named whole-groat product ground into coarse meal. Its accepted English aliases are `Scotch oatmeal` and `Scottish oats`; these do not support a generic `oat grits` alias. |
| `ingredient-ref-steel-cut-oats` — `steel-cut oats / avoine découpée` | Oat kernels cut into pieces. Do not treat cut kernels as interchangeable with the separate coarse-ground Scottish product. |
| `ingredient-ref-oat-flour` and `ingredient-ref-whole-grain-oat-flour` | Flour identities remain separate from groats and coarse meals. |
| `candidate-dry-oat-meal` | Keep the existing generic dry-oat-meal/oatmeal hold unchanged. R418 does not resolve bare `oatmeal`, `oat meal`, or `gruau`. |

## Current catalog, form, legacy, and ledger audit

The read-only audit used the split bundled seed package and catalog snapshot present on 2026-10-17. Hashes identify the files reviewed.

| Store | Snapshot | Ownership finding |
|---|---:|---|
| Active ingredient references | 1,719 rows; SHA-256 `6c4b0493f61e19ef452677a88a3d23fb033fc915c724c23d035387f7de6371ac` | No active name or alias owns `oat grits` or `oat grit`. The query `gruau d'avoine` phrase-matches only `ingredient-ref-oat-groats`, whose full display is `gruau d'avoine entier`. `ingredient-ref-scottish-oatmeal` has `gruau écossais` as its display and no French aliases. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term owns `oat grits` or `gruau d'avoine`. Neither oat groats nor Scottish oatmeal has an attached form. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No oat-grits legacy identity or alias was found. |
| Research ledger | 2,078 records / 9,411 source entries; SHA-256 `b9cf313e089fcf4c8928f3320212d537286753e40e18ad42380f1ccce5b60298` | No `candidate-oat-grits` record exists. Existing records are `ingredient-ref-oat-groats`, `ingredient-ref-scottish-oatmeal`, and the distinct unresolved `candidate-dry-oat-meal`. Their dispositions remain unchanged. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All listed paths exist and parse. The full corpus contains 1,123 ingredient rows. |

The static picker audit follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are preferred, then substring matching is used only when no complete phrase matches.

| Query | Current result | Hold effect |
|---|---|---|
| `oat grits`; `oat grit` | none | Leave unallocated. |
| `gruau d'avoine` | `ingredient-ref-oat-groats` | Preserve the whole-kernel result; do not add a second, unqualified result. |
| `gruau d'avoine entier`; `oat groats` | `ingredient-ref-oat-groats` | Unchanged. |
| `Scottish oatmeal`; `gruau écossais` | `ingredient-ref-scottish-oatmeal` | Unchanged. |
| `oatmeal` | Three products: Scottish oatmeal and the two PC Blue Menu Supergrains oatmeal products | Preserve existing product-specific results; add no generic oatmeal alias. |
| `grits` | Six results, including the adjacent grits identities and attiéké | Remains at six results. |
| `gruau` | Eleven results | Remains at eleven results. |

The proposal filename and source-ID prefix were checked against the proposal archive and ledger before drafting. No existing catalog row, legacy identity, form, recipe link, or measurement would be replaced.

## Bundled recipe-demand audit

All **114** paths in `manifest.v1.json` were read and parsed, covering **1,123 ingredient rows**. The full serialized files and structured ingredient rows were searched after lowercasing, accent folding, punctuation normalization, and whitespace normalization.

The search covered `oat grits`, singular `oat grit`, `gruau d'avoine`, `gruaux d'avoine`, `oat groats`, `Scottish oatmeal`, `Scotch oatmeal`, `oatmeal`, `oat meal`, `steel-cut oats`, and `gruau écossais`. Results: **0 matching recipe files and 0 matching ingredient rows** for these candidate and neighboring product terms. The broad word `gruau` occurs in two recipe files, both in oatmeal-related recipe metadata/titles; it occurs in **0 ingredient rows**. No recipe link or edit is proposed.

## Measurements and substitutions

- `ingredient-ref-oat-groats` has null default density, empty unit mappings, no forms, and no reusable measurement or yield. Its ledger state is `researched_no_supported_value`; its substitution state is `researched_no_supported_substitute`.
- `ingredient-ref-scottish-oatmeal` also has null density, empty unit mappings, no forms, and no active measure, conversion, yield, or substitution. Its ledger measurement and substitution research remain unreviewed.
- TERMIUM's illustrative instruction to grind oats until there is one cup [S01] gives no paired mass and is not a reusable measure. It does not override the no-supported-value findings for the existing rows.
- The bundled global and contextual substitution-rule files each contain **0** rules. The sole package-yield record belongs to canned black beans; no oat yield exists.
- No measurement, density, mapping, conversion, yield, recipe link, or substitution is proposed for this held phrase.

## Source register

Sources were checked on 2026-10-17. Terminology entries support the terms within their stated domains; product pages support their named products only.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-OAT-GRITS-R418-20261017-S01` | Translation Bureau, TERMIUM Plus, [grits search results](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=9&i=&index=enw&lang=eng&sg_kp_wet=1045178&srchtxt=GRITS), Milling and Cereal Industries record for `oat grits` and associated French `gruau d'avoine`; also reviewed the `groat` record on the same results page. | Record 3 supplies `oat grits` with the French term `gruau d'avoine`; its context describes coarsely grinding whole oats. The general grits note describes grain grits as coarser-ground than flour or meal. The groat record says hulled kernels are broken into fragments larger than grits and notes that *grits* is sometimes used synonymously with *groats*. | The entries are terminology evidence, not a current Canadian consumer product specification. The page's own records leave the whole-kernel/coarse-grind boundary overlapping and provide no sieve or particle-size specification for this oat product. |
| **Reused:** `DOAM-20261011-S07` | Office québécois de la langue française, [GDT: gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), preferred term, definition, and note. | Defines Québec/Canadian `gruau` as a cooked dish made from oat flakes and notes that the sense can extend to dishes made from other cereals. | It does not define dry `gruau d'avoine` as a milling product. |
| **Reused:** `WP03-S68` | Canadian Food Inspection Agency, [Bacterial Pathogens and Indicators in Oats, French report](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues/1-avril-2018-au-31-mars-2020-0), product categories. | Canadian French cereal-survey context distinguishes oat groats and other oat products; supports retaining the whole-kernel qualifier on the active oat-groats row. | A survey category is not a product naming ruling for oat grits. |
| **Reused:** `WP03-S69` | Canadian Grain Commission, [Glossary](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/28-glossary/glossary.html), `groat`. | Defines a groat as an oat caryopsis with its hull removed; supports the whole-kernel boundary of active oat groats. | Does not define oat grits or a cooked form. |
| **Reused:** `DOAM-20261011-S01` | Arva Flour Mill, [Scotch Oatmeal 650 g](https://arvaflourmills.com/products/scotch-oatmeal), product description. | Current Canadian mill evidence for a specifically named Scotch oatmeal product made from whole oat groats ground coarsely. | It supports that named product only; it does not say `oat grits` or set a general class equivalence. |
| **Reused:** `DOAM-20261011-S03` | Bob's Red Mill Canada, [Gruau écossais](https://www.bobsredmill.ca/produit/gruau-ecossais), French product page. | Current Canadian French product wording for Scottish oatmeal. | This is product-specific Canadian manufacturer wording, not OQLF endorsement of `gruau d'avoine` for dry oat grits. |

## Disposition

Keep `oat grits` and `gruau d'avoine` unallocated. Preserve `oat groats / gruau d'avoine entier`, named `Scottish oatmeal / gruau écossais`, and the existing unresolved generic dry-oat-meal candidate without changes. The federal terminology pairing is credible, but current evidence does not resolve whether it means whole kernels or coarse meal in the Québec picker, and the French phrase also approaches the Québec cooked-dish sense. Add no identity, alias, ledger candidate, form, measure, conversion, yield, recipe link, or substitution. This proposal is documentation-only; no software tests, build, emulator, or deployment checks were run.
