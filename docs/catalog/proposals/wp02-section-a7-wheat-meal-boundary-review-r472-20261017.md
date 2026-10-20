# WP02 Section A7 R472: wheat-meal boundary review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Disposition integrated as a documentation-only hold. The shared catalog, ledger, recipes, and generated files remain unchanged; integration tracking is recorded in the plan, roadmap, workflow, and batch README.
- **Open checklist:** WP02 Section A7 still names the unresolved wheat-meal candidate among the remaining grain-meal and milling reviews ([plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004)).
- **Scope:** Recheck generic `wheat meal` and `wheatmeal` against the new current Canadian listing `Organic Soft Wheat Meal / Farine de blé mou biologique`, its nearby wheat-flour terms, and current wheat meal/grits/groats ownership. This does not reopen the accepted, narrower `whole wheat meal` identity.
- **Proposal-local source IDs:** `WP02-A7-WHEAT-MEAL-R472-20261017-S01` through `S09`. These IDs are local to this proposal and are not assigned to the shared ledger.

## Recommendation

**Keep generic `wheat meal` and `wheatmeal` unresolved and out of the active catalog.** Retain `ingredient-ref-wheat-meal` only as **`whole wheat meal / farine de blé entier brute`**, with its current French alternate **`farine de blé complet brute`**. Do not add the newly observed `Organic Soft Wheat Meal / Farine de blé mou biologique` listing to that row or create a new soft-wheat-meal identity from its title alone.

The new Natural Food Certifiers directory entry is a real bilingual product listing for La Meunerie Milanaise, and the directory separately lists `Blé mou biologique / Organic Soft Wheat` [S01]. It gives no ingredient composition, process, particle size, product code, package, use, or availability. The matching English/French wording is therefore not enough to establish whether the listed meal is whole-kernel, refined, coarse, or a flour product.

A current Québec government food-directory record for a different named item, **Organic Unbleached White Pastry Flour / Farine blanche non blanchie à pâtisserie biologique**, says it is made from lower-protein soft wheat, with the bran removed; its composition is listed as 100% organic soft wheat [S02]. That record has its own product title, GTIN, package declaration, and company-of-record details. No source links that SKU to the certification-directory item. OQLF defines `farine de blé mou` as soft wheat flour used mainly for pastry, so the French side of the new meal listing also overlaps an established flour term [S04]. This evidence identifies a product-name ambiguity; it does not establish one generic wheat-meal boundary or a product-matched Québec name.

| Proposed field | Disposition |
|---|---|
| Generic active identity / ID | None; keep `wheat meal` and `wheatmeal` unresolved. |
| Existing reference | Retain `ingredient-ref-wheat-meal` as `whole wheat meal / farine de blé entier brute`, with `farine de blé complet brute` unchanged. |
| New aliases | None. Do not add `wheat meal`, `wheatmeal`, `soft wheat meal`, `Organic Soft Wheat Meal`, `farine de blé mou`, or `farine de blé mou biologique` to the whole-wheat row. |
| New product-specific row | None; the certification listing does not disclose enough process or identity detail to define a catalog row. |
| French name | None for generic wheat meal. Do not infer `gruau de blé`, `gruaux de blé`, or `semoule de blé` from a historical term, customs class, or generic word translation. |
| Forms, measurements, densities, mappings, conversions, yields | None. |
| Recipe links or substitutions | None. |

Reopen the candidate when a product-specific manufacturer or Québec source connects the soft-wheat-meal title to an identifiable item, explains its milling boundary, and supports French wording that distinguishes it from soft-wheat flour and the accepted whole-wheat meal. Generic `wheat meal` still needs evidence that establishes a transferable consumer boundary beyond that one item.

## Product boundary and archive decisions

| Evidence or neighbor | Current finding | Boundary to preserve |
|---|---|---|
| `Organic Soft Wheat Meal / Farine de blé mou biologique` | NFC currently lists this paired product title, but publishes no product detail beyond the names [S01]. | Treat it as one qualified registry label; do not generalize it to all `wheat meal` or equate it with whole-kernel meal. |
| Soft-wheat pastry flour | The Québec Food Directory lists a separate white pastry-flour product made with soft wheat and with bran removed [S02]. OQLF defines `farine de blé mou` as soft wheat flour [S04]. | Keep flour separate. The government product's `1/3 cup (60 g)` serving belongs to that pastry flour and cannot be transferred to a meal. |
| Whole wheat meal | The active `ingredient-ref-wheat-meal` row is explicitly qualified in English and French. The live manufacturer and OQLF evidence reviewed in R406/R104 support that narrow scope. | Do not broaden the existing ID with bare `wheat meal`, `wheatmeal`, or the new soft-wheat product title. |
| Wheat flour and granular flour | Whole-wheat flour remains `ingredient-ref-whole-wheat-flour`; granular flour is the product-specific `ingredient-ref-granular-flour` / `farine granulaire` row integrated in R455. Other wheat flour identities also remain grain- or class-qualified. | Do not route meal to flour, granular flour, or an existing flour identity. |
| Cracked wheat and bulgur | `ingredient-ref-cracked-wheat` owns `cracked wheat / blé concassé`; `ingredient-ref-bulgur` owns `bulgur / boulgour`. CFIA defines cracked and crushed/coarse-ground wheat separately from its bread-ingredient mention of wheat meal [S06]. | Preserve their separate names and process evidence. Do not treat a tariff sieve threshold as a kitchen grind specification. |
| Wheat grits | R421 keeps `wheat grits` unallocated and does not assign `gruau de blé` as a Québec display. | Do not use grits as a synonym for wheat meal or add it to a meal row. |
| Wheat groats | R451 holds the Dzedzaz `wheat groats` product because its kernel state and Québec French term are unresolved. | Do not transfer groats wording to wheat meal. |
| Wheat semolina | Active grain-specific rows include durum, remilled durum, spring-wheat, emmer, and Khorasan semolina. R469 added Khorasan semolina; R454 added only the exact Ardent Farina labels to spring-wheat semolina. | Do not use generic `semoule de blé` or `farina` as a meal alias. The new product title does not displace those distinct identities. |

The prior generic holds remain in force: R22 and R104 retained the unresolved candidate, and R406 was the latest focused recheck before this proposal. R472 adds one current bilingual certification-directory title and a Québec government soft-wheat pastry-flour record; it does not repeat the R406 source set as new evidence. The more recent A7 reviews do not decide generic wheat meal: R458 holds spelt grits, R462 adds the species-qualified `spelt groats` alias to spelt berries, R465 holds amaranth grits, and R469 adds Khorasan semolina. These boundaries are separate. See the [R22 review](wp02-a7-unqualified-wheat-meal-round22-review-20261013.md), [R104 review](wp02-a7-unqualified-wheat-meal-wheatmeal-boundary-review-20261014-r104.md), [R406 recheck](wp02-section-a7-next-milling-gap-review-r406-20261017.md), [R421 wheat-grits hold](wp02-section-a7-next-milling-gap-review-r421-20261017.md), [R451 wheat-groats hold](wp02-section-a7-wheat-groats-product-boundary-review-r451-20261017.md), [R454 Farina alias review](wp02-section-a7-farina-bilingual-alias-review-r454-20261017.md), [R455 granular-flour identity review](wp02-section-a7-granular-flour-identity-review-r455-20261017.md), [R458 spelt-grits hold](wp02-section-a7-next-milling-gap-review-r458-20261017.md), [R462 spelt-groats alias review](wp02-section-a7-next-milling-gap-review-r462-20261017.md), [R465 amaranth-grits hold](wp02-section-a7-next-milling-gap-review-r465-20261017.md), and [R469 Khorasan-semolina review](wp02-section-a7-next-milling-gap-review-r469-20261017.md).

## Review-time ownership and allocation audit

Read-only review snapshot of the split seed package, legacy file, and research ledger on 2026-10-17. Hashes identify the exact inspected files at review time.

| Store | Current snapshot | Exact ownership and allocation finding |
|---|---:|---|
| Ingredient references | 1,752 rows; SHA-256 `c7bfe48e829eb9d329e1e7849b014336d1dea0bc1c21bc372ef7d46d61760b8f` | No active row owns bare `wheatmeal`, `soft wheat meal`, or `farine de blé mou biologique`. `ingredient-ref-wheat-meal` owns only the whole-wheat-qualified pair and French alternate described above. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No forms are attached to `ingredient-ref-wheat-meal`; no form row supplies a generic wheat-meal or soft-wheat-meal form. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No generic wheat-meal or wheatmeal candidate or alias is allocated. |
| Research ledger | 2,111 records / 9,621 source entries / 8,168 unique source IDs / 6,881 unique URLs; SHA-256 `f0db97fc3dbad717dfd14035911f1a398374c9e7bb85af488cb355530f21168c` | The existing `ingredient-ref-wheat-meal` record has 34 sources and six decisions, including unresolved generic-term decisions and the accepted whole-wheat scope. It has zero measurement observations and zero substitution findings; measurement and substitution states remain `not_yet_researched`. There is no separate generic wheat-meal candidate record. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All paths exist and parse. The fresh scan covers all 1,123 structured ingredient rows; details follow. |
| Numeric and substitution data | 8 ledger-level unit conversions; one package-yield row; zero global substitution rules and zero contextual rules | None of these records or rules refers to wheat meal. The sole package-yield row is for canned black beans. |

The exact active neighboring owners are `ingredient-ref-whole-wheat-flour` (`whole-wheat flour / farine de blé entier`), `ingredient-ref-japanese-weak-wheat-flour` (whose French alias is `farine de blé mou japonaise`), `ingredient-ref-cracked-wheat` (`cracked wheat / blé concassé`), `ingredient-ref-bulgur` (`bulgur / boulgour`), and `ingredient-ref-wheat-berries` (`wheat berries / grains de blé entiers`). `ingredient-ref-spring-wheat-semolina` owns `spring wheat semolina / semoule de blé tendre`, with the R454 aliases `farina flour / farine farina`; `ingredient-ref-granular-flour` owns `granular flour / farine granulaire`; and `ingredient-ref-khorasan-semolina` owns `Khorasan semolina / semoule de blé khorasan`. No wheat-grits or wheat-groats identity is active.

The new R472 source-ID prefix did not occur in the ledger or proposal/batch archive, and the target proposal path did not exist at review start. The exact Québec government product URL in S02 is absent from both the ledger and catalog archive. Some other URLs are reused: NFC's directory URL already occurs in two ledger sources for unrelated rye product rows; La Milanaise's consumer-catalog URL and the OQLF, CFIA, Statistics Canada, CBSA, and MyChopChop URLs also have prior ledger entries. The source register below identifies those reuses and gives each R472 locator; it does not allocate duplicate shared source records.

## Phrase-first picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spaces; return complete normalized word-phrase matches first; use substring matching only if no complete phrase matches. Reference names, aliases, and attached form terms were included.

| Query | Current result | R472 effect |
|---|---|---|
| `wheat meal` | `ingredient-ref-wheat-meal` | Search overlap: `wheat meal` occurs inside `whole wheat meal`; it is not a generic alias. No change. A future exact generic row would make this query return both rows. |
| `whole wheat meal`; `farine de blé entier brute`; `farine de blé complet brute` | `ingredient-ref-wheat-meal` | Preserve the accepted, qualified identity and alternate. |
| `wheatmeal`; `soft wheat meal`; `Organic Soft Wheat Meal`; `farine de blé mou biologique` | No result | The registry listing is not an active owner. Keep these phrases unassigned. |
| `farine de blé mou` | `ingredient-ref-japanese-weak-wheat-flour` by its qualified Japanese alias | Do not add the unqualified phrase to the meal row; it already overlaps a flour owner. |
| `semoule de blé` | Five wheat-semolina rows: durum, emmer, Khorasan, remilled durum, and spring wheat | Do not add as a generic wheat-meal French name. |
| `wheat grits` | `ingredient-ref-buckwheat-grits` by substring fallback | False positive from `wheat` inside `buckwheat`; not a wheat-grits owner. |
| `wheat groats` | Two buckwheat-groats rows by substring fallback | False positives from `wheat` inside `buckwheat`; not wheat-groats owners. |
| `cracked wheat`; `blé concassé` | `ingredient-ref-cracked-wheat` | Preserve the existing cracked-wheat boundary. |
| `farina flour`; `farine farina` | `ingredient-ref-spring-wheat-semolina` | Preserve R454's exact product aliases; do not extend them to meal. |

Because R472 holds all phrases, the picker results remain as shown. It does not add an alias to the existing whole-wheat-meal row or add a second generic result.

## Complete bundled-recipe scan

All **114** files listed in `manifest.v1.json` were read and parsed, covering all **1,123** structured ingredient rows. The scan checked the complete serialized recipe files and every ingredient row after lowercase, NFKD accent/ligature folding, punctuation normalization, and whitespace normalization.

The 24 unique phrases included `wheat meal`, `wheatmeal`, `whole wheat meal`, `soft wheat meal`, `organic soft wheat meal`, `farine de blé mou`, `farine de blé mou biologique`, both existing French whole-wheat-meal names, `wheat flour`, `soft wheat flour`, `wheat farina`, `granular flour`, `farine granulaire`, `farina flour`, `farine farina`, `wheat grits`, `wheat groats`, `Dzedzaz`, `cracked wheat`, `blé concassé`, `wheat semolina`, `semoule de blé`, and `wheat berries`.

Results: **0 matching recipe files, 0 matching ingredient rows, and 0 links** to `ingredient-ref-wheat-meal`. The bundle provides no demand, amount, preparation state, measure, or substitution context for generic or soft-wheat meal. No recipe link or relink is proposed.

## Forms, measurements, and substitution limits

- The active whole-wheat-meal row has `defaultDensity: null`, `unitMappings: []`, and no attached ingredient forms. The ledger records no measurement observations and no wheat-meal conversion.
- The Québec directory's 60 g per 1/3 cup serving is for its distinct white pastry-flour record [S02]. It is not a meal measurement, density, or cross-product conversion. The 2 kg item and 6 × 2 kg case are package declarations, not household measures.
- CFIA's bread standard lists wheat meal alongside other optional ingredients within a combined cap, but does not define wheat meal or provide a kitchen amount [S06]. The CBSA tariff's groats-and-meal heading and 1.25 mm sieve criterion classify a customs product group; they do not establish a culinary grind, conversion, or recipe substitute [S08].
- NFC supplies no package weight, amount, particle size, preparation direction, or yield for its soft-wheat-meal title [S01]. The separate Honeywell retailer page describes a 900 g whole-wheat-meal item and was marked sold out at access; it supplies no reusable household-volume measure [S09].
- The global and contextual substitution-rule files contain no rules. No source supplies a supported amount, dish/method scope, or conversion among generic wheat meal, whole wheat meal, soft-wheat flour, cracked wheat, grits, groats, bulgur, or semolina. Add no form, density, unit mapping, yield, conversion, or substitution.

## Source register

Sources were checked on 2026-10-17. R472-local IDs are not ledger allocations. Where a URL was already present in the ledger, the earlier IDs are shown for source-reuse tracking.

| Source ID | Source and locator | Supports | Limits and allocation notes |
|---|---|---|---|
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S01` | Natural Food Certifiers, [Find Certified Products](https://nfccertification.com/find-certified-products/), La Meunerie Milanaise entries at the current listing for `Farine de blé mou biologique / Organic Soft Wheat Meal` and `Blé mou biologique / Organic Soft Wheat`. | Confirms a current bilingual soft-wheat-meal product title and a separately listed soft-wheat grain product. | Directory gives no process, particle size, formulation, package, use, product code, or Québec retail availability. The URL is already used by ledger IDs `WP03-CRYE-20261012-S05` and `WP02-RYE-GRADES-20261011-S04` for different rye entries; S01 pins a distinct current product locator. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S02` | Québec government, [Répertoire des aliments québécois: Organic Unbleached White Pastry Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203704), product record 8203704, last updated 2025-10-29. | Lists a 2 kg white pastry flour from soft organic wheat, with bran removed; composition `100% blé mou biologique`; the serving description is 1/3 cup (60 g). | This is a separately titled pastry-flour product, not the NFC item. Its package, serving, and flour composition cannot be transferred. The exact product URL is not already in the ledger or catalog archive. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S03` | La Milanaise, [Nos produits](https://lamilanaise.com/nos-produits/), current consumer-facing catalog; the page reports 52 products and lists flour and semolina sections. | Provides a manufacturer-side view of current consumer product categories and separately named semolina products. | The catalog is not a product process specification or complete industrial catalog; omission of the NFC title from the consumer page cannot prove no commercial item exists. URL already used under `WP03-KHORASAN-FLAKES-20261012-S02` and `WP02-A-WHITE-RED-FIFE-R148-20261015-S01`. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S04` | OQLF, [farine de blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre), preferred terms and definition, last updated 2004. | Lists `farine de blé tendre` and `farine de blé mou`, translates the term as soft wheat flour, and describes its lower-gluten pastry/biscuit use. | Terminology record is for flour, not a meal process. Reuse existing ledger IDs `WP02A3-20261010-S05`, `WP02-REGIONAL-FLOUR-CLASS-QC-20261011-S01`, and `WP02-SECTION-A-GERMAN-WHEAT-20261012-S11`; no new shared source row. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S05` | OQLF, [farine de blé entier brute (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute), preferred French terms and English translations, last updated 1984. | Supports only the existing qualified pair `farine de blé entier brute` / `farine de blé complet brute` and English `whole wheat meal`. | Does not name generic wheat meal. Reuse ledger IDs `WMA7-20261010-S02` and `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S05`. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S06` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 12, §§12.1.6–12.1.7 and 12.2.1(h). | Lists wheat meal as one of several optional ingredients in standardized bread and defines crushed/coarse-ground and cracked wheat separately. | Does not define wheat meal or provide a household measure; bread-formula limits are not substitutions. Reuse `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S01`. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S07` | Statistics Canada, [NAPCS Canada 2022, 1821294](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1517204&D=1&Function=getVD&MLV=6&TVD=1517136&db=IMDB), plus [all examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022); current 2022 classification, updated 2026-01-08. | Lists `wheat meal (except durum semolina)` under human-consumption grain products; the full examples list also names wheat grits and wheat groats separately. | Classification separates named groups but gives no milling specification, consumer measurement, or Québec name. Reuse `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S04` and `WP02-A7-BUCKWHEAT-MEAL-20261013-S01`. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S08` | CBSA, [Customs Tariff T2026-2, Chapter 11 (English)](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html) and [French](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html), heading 11.03 and Note 3. | Groups wheat meal with groats; the tariff defines fragmented cereal products and a 95%-through-1.25-mm customs sieve criterion for non-corn cereals. | This is customs classification, not a culinary boundary or household grind. Reuse ledger IDs `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02` and `S03`. |
| **Proposal-local** `WP02-A7-WHEAT-MEAL-R472-20261017-S09` | MyChopChop, [Honeywell Whole Wheat Meal, 900 g](https://www.mychopchop.ca/products/honeywell-whole-wheat-meal), current Canadian retail listing. | Supports the existing product-qualified whole-wheat example; the page identifies a 900 g item and showed sold out at access. | Does not define generic wheat meal, identify the new NFC product, or provide a household-volume measure. Reuse `A7WM-20261011-S06` and `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S07`. |

## Disposition

Keep generic `wheat meal` and `wheatmeal` unresolved. Retain the accepted `whole wheat meal / farine de blé entier brute` identity and its existing alternate without changes. Keep soft-wheat flour, granular flour, cracked wheat, bulgur, wheat grits, wheat groats, and grain-specific semolinas separate. The new certification entry establishes a qualified product title but not its milling state or a Québec French identity that distinguishes it from flour. No identity, alias, legacy candidate, ledger source or decision, form, measurement, density, mapping, conversion, yield, recipe link, or substitution was added. This documentation-only hold is integrated; no tests were needed.
