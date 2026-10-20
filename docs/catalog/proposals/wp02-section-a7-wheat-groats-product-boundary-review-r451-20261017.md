# WP02 Section A7 R451: Dzedzaz wheat-groats product boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Reviewed and dispositioned as a documentation-only hold. No active catalog or ledger row was added; the plan and roadmap now record the decision.
- **Active checklist:** [WP02 Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004) remains open for other grain meals and milling products.
- **Recent decisions kept:** R440 added identity-only `emmer semolina / semoule de blé amidonnier`; R443 held `spelt semolina / semoule d'épeautre`; R448 added only the alias `barley groats` to hulled barley. Their decisions do not assign wheat-groats wording. See the [R440–R442 integration](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md), [R443–R445 integration](../batches/wp02-wp04-wp06-r443-r445-next-gap-review-integration-20261017/README.md), and [R448 integration](../batches/wp02-a7-barley-groats-alias-integration-r448-20261017/README.md).
- **Scope:** Assess the current, named `Dzedzaz wheat groats` product as a possible wheat-milling identity. Do not reopen the generic wheat-meal hold or R421's wheat-grits hold, and do not transfer its words to whole wheat kernels, cracked wheat, bulgur, semolina, or a hot cereal.
- **Source IDs:** IDs marked **proposal-local** are registered only in this file. IDs marked **reused** already occur in the shared research ledger, except where specifically marked as reused from R421's proposal.

## Recommendation

**Keep the named Dzedzaz wheat-groats product unallocated.** The current Haudecoeur/Legumor catalog establishes a specific European product sold under the paired names `Dzedzaz wheat groats / gruau de blé`; its description says the wheat grain has had its outer covering removed. It does not establish that this is the same whole-kernel state as the active wheat-berries identity, a fragmented groat or grit, or a partially milled wheat meal. No current Canadian or Québec product source was found that verifies this product or gives a product-matched Québec French name.

The exact product therefore supports a source-local candidate for further review, but not a new catalog row, alias, or ledger candidate now. Keep `Dzedzaz wheat groats`, `wheat groats`, and `gruau de blé` off the existing wheat-berries, wheat-meal, cracked-wheat, bulgur, wheat-semolina, and hot-cereal rows. Do not invent a French alias such as `blé mondé` or `blé émondé` from the source description.

| Proposed data field | Recommendation |
|---|---|
| Active identity / ID | None. Do not add `ingredient-ref-wheat-groats` or a Dzedzaz-specific row. |
| English display or alias | None. Keep `Dzedzaz wheat groats` and `wheat groats` unallocated. |
| French display or alias | None. Do not assign the France-market `gruau de blé` as a Québec ingredient name. |
| New ledger candidate or source records | None. The evidence remains proposal-local until a Canadian/Québec product boundary and French name are verified. |
| Forms, measurements, density, mappings, conversions, yields, recipe links, substitutions | None. |

## Current ownership and archive audit

The pre-integration snapshot for this review was read from the live split seed package and catalog files on 2026-10-17, before R449 and R450 were integrated. Hashes identify the files at that review point.

| Store | Snapshot | Exact-phrase finding |
|---|---:|---|
| Ingredient references | 1,740 rows; SHA-256 `5c1b45fdfc856745f6b63ebf2c980b41ab6467f66546324678a865026de0f36c` | No exact display or alias owns `wheat groats`, `wheat groat`, `Dzedzaz`, `gruau de blé`, or `gruaux de blé`. The existing wheat and neighboring cereal identities remain separate below. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term owns those phrases. The wheat-berries, wheat-meal, and cracked-wheat rows have no attached forms; bulgur's grind forms do not establish a wheat-groats form. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact Dzedzaz or wheat-groats identity or alias. |
| Research ledger | 2,099 records / 9,543 source entries / 8 unit conversions; SHA-256 `9c2b53067f2767d3405b7455130b512facc84308b8c79e66831f9d4e7724c6f3` | No `candidate-wheat-groats` or `ingredient-ref-wheat-groats` record. The existing `ingredient-ref-wheat-meal` record includes earlier exclusions of wheat groats as an alias; it does not decide the newly sourced Dzedzaz product as a standalone identity. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest paths exist and parse. The complete scan covers 1,123 ingredient rows; results are below. |

The archive audit found earlier boundary mentions, but no proposal that evaluated the Dzedzaz SKU or recommended a standalone wheat-groats identity. The [whole-wheat-meal follow-up](wp02-a7-wheat-meal-product-boundary-followup-20261010.md), [remaining-meals review](wp02-a7-remaining-meals-review-20261010.md), and R104 wheat-meal recheck keep generic wheat groats off the narrower whole-wheat-meal row. R421 reviews wheat grits separately and lists wheat groats only as a neighboring product; it does not decide wheat-groats ownership. This proposal isolates the newly evidenced Dzedzaz product boundary and preserves those prior decisions.

| Current owner | Existing identity and state to preserve |
|---|---|
| `ingredient-ref-wheat-berries` | `wheat berries / grains de blé entiers`; English alias `whole wheat kernels`; `GRAIN_AND_CEREAL`, null density, empty unit mappings. The Canadian food-grain specification describes whole kernels retaining bran, endosperm, and germ. Do not assume the Dzedzaz product retains those parts. |
| `ingredient-ref-cracked-wheat` | `cracked wheat / blé concassé`; CFIA defines angular fragments and OQLF maps `blé concassé` to cracked, crushed, and coarse-ground wheat. The Dzedzaz description does not establish this fragmented state. |
| `ingredient-ref-bulgur` | `bulgur / boulgour`, with four documented grind forms. Keep it separate from a product described only as having its covering removed. |
| `ingredient-ref-wheat-meal` | `whole wheat meal / farine de blé entier brute`, with the existing French alternate `farine de blé complet brute`. Bare `wheat meal` remains unresolved; no generic meal decision is changed. |
| Wheat semolina identities | `durum semolina / semoule de blé dur`, `spring wheat semolina / semoule de blé tendre`, and `emmer semolina / semoule de blé amidonnier` remain separate. The Dzedzaz label says durum wheat but does not name semolina or a grind. |
| `ingredient-ref-buckwheat-grits` and buckwheat groats | Existing grits and groats identities remain separate. Their `buckwheat` names create substring false positives for searches beginning with `wheat`. |

## Product boundary and evidence

The current Haudecoeur 2025–2026 catalog lists the Legumor product as **`Gruau de blé «Dzedzaz» / Dzedzaz’ wheat groats`**, with 1 kg and 25 kg formats. The current Haudecoeur product page gives reference `00005751`, EAN `3276650057511`, a 1 kg item, and `100% blé dur`. Its descriptive text says the cooked product has a soft, slightly creamy texture. This establishes a named human-food product and its ingredient species, not a milling standard.

The same catalog lists **`Blé entier «Hadig» / Hadig whole wheat`** separately and describes it as wheat whose outer envelope is removed. That nearby product description makes the proposed groats boundary less clear: the catalog does not explain how Dzedzaz differs from Hadig, whether bran or germ is removed, whether the kernel is intact, or whether either item is cooked or treated before sale. This uncertainty matters because the live wheat-berries row already represents whole wheat kernels, while cracked wheat, bulgur, grits, meal, and semolina have distinct owners or holds.

The Canadian terminology is not enough to settle the name. The Canadian Grain Commission's grading glossary defines *groats* in its oat context as oat caryopses with the hull removed; it does not define wheat groats. Statistics Canada's human-consumption grain-products classification lists wheat grits, wheat groats, and wheat meal as separate examples, which confirms that the phrases are not automatically interchangeable but gives no milling, kernel-retention, or French display definition. OQLF's food entry for `gruau` names the cooked oatmeal dish and notes that the sense can extend to dishes made from other cereals. The older federal TERMIUM record cited in R421 pairs `gruau de blé` with cracked wheat in a historical tariff observation. None supports `gruau de blé` as a current Québec name for this Dzedzaz product.

| Evidence question | Finding | Boundary |
|---|---|---|
| Does a named wheat-groats product exist? | Yes. Haudecoeur's current catalog and product page identify a Dzedzaz wheat product under that name. | Evidence is for that supplier's European SKU, not a universal wheat-groats definition. |
| Does the description establish a separate kernel state from wheat berries? | No. The source mentions removal of an outer covering, but does not say whether the kernel remains whole or retains bran and germ. | Do not assign it to `ingredient-ref-wheat-berries` or create a processed form. |
| Does it establish cracked wheat, grits, meal, or semolina? | No. It gives no particle size, fragmentation state, grind, or flour/semolina classification. | Keep those active rows and candidates separate. |
| Is `gruau de blé` verified as a Québec display? | No. The exact compound appears on a France-market brand listing. OQLF and TERMIUM evidence shows other cooked-food or cracked-wheat senses. | Keep the French phrase inactive for this product. |
| Is there Québec/Canadian product demand? | No current Canada- or Québec-specific Dzedzaz product label was verified in this review. | Reopen when a local product source or authoritative terminology source resolves both process and French wording. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): a complete normalized word phrase is preferred; substring matching is used only if there is no complete phrase match.

| Query | Current result | Hold effect |
|---|---|---|
| `wheat groats`; `wheat groat` | Two partial matches: `ingredient-ref-raw-buckwheat-groats` and `ingredient-ref-roasted-buckwheat-groats-dry` | False positives from the substring `wheat` within `buckwheat`; neither row owns wheat groats. No wheat-groats alias is added. |
| `Dzedzaz`; `Dzedzaz wheat groats` | No result | Remains unallocated. |
| `gruau de blé`; `gruaux de blé` | No result | No French name is assigned. |
| `wheat berries` | 11 wheat-kernel identities, including the generic row and named wheat classes | Unchanged. A Dzedzaz result should not be routed to these existing whole-kernel terms without a matching state boundary. |
| `whole wheat kernels`; `grains de blé entiers` | `ingredient-ref-wheat-berries` | Unchanged. |
| `wheat meal`; `whole wheat meal` | `ingredient-ref-wheat-meal` | Preserve the current scoped whole-wheat-meal result; the substring match does not resolve generic wheat meal. |
| `wheat grits` | `ingredient-ref-buckwheat-grits` by substring fallback | Existing false positive; no wheat-grits or wheat-groats ownership is inferred. |
| `cracked wheat`; `blé concassé` | `ingredient-ref-cracked-wheat` | Unchanged. |
| `bulgur`; `boulgour` | `ingredient-ref-bulgur` | Unchanged. |
| `semoule de blé` | Four semolina rows: durum, remilled durum, spring wheat, and emmer | Keep the phrase with those specific identities; do not add it to wheat groats. |
| `groats` | Five results, including canary seed groats, hulled barley (R448 alias), oat groats, and raw/roasted buckwheat groats | Unchanged; do not add a generic `groats` alias. |
| `gruau` | 11 results | Unchanged; do not add bare `gruau`. |

## Complete bundled recipe scan

All **114** files listed in `manifest.v1.json` were read and parsed, covering **1,123 ingredient rows**. The scan checked the complete decoded recipe JSON and each structured ingredient row after the same lowercasing, diacritic folding, punctuation normalization, and whitespace normalization used by the picker. Phrase matches required word boundaries so `buckwheat groats` would not be counted as recipe demand for `wheat groats`.

The search included `Dzedzaz`, `Dzedzaz wheat groats`, `wheat groats`, `wheat groat`, `gruau de blé`, `gruaux de blé`, `blé mondé`, `blé émondé`, `blé dépouillé`, `peeled wheat`, `whole peeled wheat`, `wheat kernels`, `whole wheat kernels`, `wheat berries`, `grains de blé entiers`, `wheat meal`, `whole wheat meal`, `wheat grits`, `cracked wheat`, `blé concassé`, `bulgur`, `boulgour`, `durum semolina`, `wheat semolina`, `semoule de blé`, `whole wheat grain`, and `blé dur`.

Results: **0 matching recipe files and 0 matching ingredient rows** for every candidate and neighboring phrase above. The broader word `gruau` appears in two recipe files' non-ingredient title/metadata fields and in **0 ingredient rows**. No bundled recipe references `ingredient-ref-wheat-berries`, `ingredient-ref-cracked-wheat`, `ingredient-ref-wheat-meal`, or `ingredient-ref-bulgur`; no recipe link, amount, or preparation context supports allocation.

## Numeric, form, and substitution boundaries

- The 1 kg / 25 kg formats, 15-unit case, and 100 g nutrition panel belong to the listed supplier product. They are package and nutrition declarations, not household measures or reusable conversion data.
- The product descriptions mention texture after cooking but establish no common cooking ratio, time, or yield for a general wheat-groats identity. Add no measures, density, unit mappings, cooking yield, or mass-volume conversion.
- No active form represents Dzedzaz or wheat groats. Add no form for peeled, dehulled, groats, grits, meal, or semolina states based only on this product name.
- The global and contextual substitution-rule files currently contain zero rules. No recipe provides a paired amount or role for replacing Dzedzaz with wheat berries, cracked wheat, bulgur, grits, meal, or semolina. Add no substitution or recipe link.

## Evidence limits

- Haudecoeur's 2025–2026 catalog and current product page are primary supplier evidence for one Legumor product, but they are France-market sources and do not establish Canadian or Québec availability or naming.
- The French catalog's explanation that the grain's outer covering is removed does not specify kernel integrity, bran/germ retention, heat treatment, or a milling fraction. Its nearby Hadig whole-wheat listing describes a similar outer-covering removal without defining the difference between the two products.
- Statistics Canada's examples are a classification aid, not product specifications or consumer terminology. The Canadian Grain Commission's groats definition is scoped to oats in grain grading and should not be generalized to every grain.
- OQLF's `gruau` page defines the Québec food term around a prepared dish; it does not approve `gruau de blé` for a dry ingredient. TERMIUM's historical association with cracked wheat is not a current product label or a ruling on Dzedzaz.
- The catalog contains no matching recipe demand. The product-page package and nutrition values do not establish a reusable cooking amount, density, or substitution.

## Source register

Sources were checked on 2026-10-17. Proposal-local IDs are unique to this file; reused IDs already exist in shared or prior proposal research.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **Proposal-local** `WP02-A7-WHEAT-GROATS-R451-20261017-S01` | Haudecoeur, [2025–2026 catalog](https://shop.haudecoeur.fr/fr/catalogue-haudecoeur-2025-2026.pdf), Legumor cereal entry. | Pairs `Gruau de blé «Dzedzaz»` with `Dzedzaz' wheat groats`; lists 1 kg and 25 kg formats and describes wheat grain with its covering removed. | France-market supplier catalog; does not establish Québec wording, current Canadian availability, exact grain integrity, or whether bran and germ remain. Formats are packages, not kitchen measures. |
| **Proposal-local** `WP02-A7-WHEAT-GROATS-R451-20261017-S02` | Haudecoeur, [Gruau de blé Dzedzaz 1 kg Legumor](https://shop.haudecoeur.fr/fr/produits/gruau-de-ble-dzedzaz-1-kg-legumor/dp-195), product reference 00005751 / EAN 3276650057511. | Current product page identifies the 1 kg item, lists 100% durum wheat, gives a product-specific nutrition panel, and describes the cooked texture. | France-market supplier page; no English name on this detail page, no milling specification, and no Québec retail evidence. Package and nutrition values are not transferable measures. |
| **Reused — ledger** `WP02-A7-BUCKWHEAT-MEAL-20261013-S01` | Statistics Canada, [NAPCS Canada 2022, human-consumption grain products, all examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), modified 2026-01-08. | R421's audit uses this source to list wheat grits, wheat groats, and wheat meal as distinct human-food examples. | Classification examples do not define a milling state, consumer product, or Québec French name. Reuse the existing ledger source. |
| **Reused — ledger** `WMA7-20261010-S07` | Canadian Grain Commission, [Glossary](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/28-glossary/glossary.html), `groats`. | Defines groats in the grain-grading context as hulled oat kernels; the term does not establish a general Canadian wheat-groats scope. | A grain-grading glossary, not a human-food wheat-groats product standard. |
| **Reused — ledger** `WP03-BW-GROATS-QC-20261011-S01` | OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), food entry. | Names cooked oatmeal as the Québec/Canada food sense and notes that the dish may be made with other cereals. | Does not provide a product name for dry wheat groats. |
| **Reused — ledger** `WMA7-20261010-S05` | OQLF, [blé concassé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494947/ble-concasse), food-product terminology. | Maps `blé concassé` to coarse-ground, cracked, and crushed wheat, supporting the existing cracked-wheat owner. | Does not name the Dzedzaz product or translate wheat groats. |
| **Reused — ledger** `WP02-S101` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 12, standards 12.1.6–12.1.7. | Defines crushed/coarse-ground wheat and cracked wheat separately. | Defines neither wheat groats nor Dzedzaz; regulatory sieve criteria are not transferred. |
| **Reused — ledger** `WP03-S57` | Department of National Defence, [Spécifications sur la qualité des aliments – Grain céréalier](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), SQA-24-17. | Names whole wheat grain as `grains de blé entiers` and describes whole kernels retaining bran, endosperm, and germ. | Procurement specification for whole wheat grain, not a Dzedzaz product definition. |
| **Reused — ledger** `WP02-S122` | ASFC, [Tarif des douanes T2026-2, chapitre 11](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html), wheat groats-and-meal classification. | Shows the tariff's collective French wording `gruaux et semoules de froment (blé)`. | Customs classification groups products; it does not assign one product-specific Québec picker name. |
| **Reused — R421 proposal-local** `WP02-A7-WHEAT-GRITS-R421-20261017-S01` | Translation Bureau, TERMIUM Plus, [GRUAU BLE](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+BLE), historical tariff observation dated 1986-04-15. | R421 records `gruau de blé` among French terms associated with cracked wheat. | The record is historical and does not translate the current Dzedzaz product. Reused from R421's proposal, not from the shared ledger. |

## Disposition

Keep the specific Dzedzaz wheat-groats product unallocated. Its supplier evidence establishes a named product but not a transferable wheat-groats process boundary or a Québec French display. Preserve the existing wheat-berries, wheat-meal, cracked-wheat, bulgur, wheat-grits, wheat-semolina, and cereal rows without changes. Add no identity, alias, form, measurement, density, mapping, conversion, yield, recipe link, or substitution. Reopen only when a current Canadian/Québec product or authoritative terminology source identifies both the product state and suitable French name. This is a documentation-only hold; no tests, build, emulator run, or deployment were performed.
