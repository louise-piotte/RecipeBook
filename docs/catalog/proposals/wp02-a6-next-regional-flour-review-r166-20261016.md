# WP02 Section 04 A6 R166 — Arikelu / Arikelu Pindi Kodo naming boundary

## Review record

- **Scope:** one Telugu naming boundary across the existing kodo millet grain and kodo millet flour references: `Arikelu` for the grain and the exact product phrase `Arikelu Pindi` for the flour.
- **Recommendation:** integrate these two exact aliases on their matching existing references. Do not create an ingredient identity or a form.
- **Checklist context:** Section 04 A6 remains open for regional grain flours in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1507). R165 covered Kauni only on the foxtail-millet grain row; its flour alias remains held ([R165 proposal](wp02-a6-next-regional-flour-review-r165-20261016-kauni.md), [R165 integration](../batches/wp02-wp03-wp04-r165-gap-review-integration-20261016/README.md)).
- **Archive boundary:** the October 13 kodo atta proposal explicitly left `arikelu pindi` outside its scope because it was not then treating Organic Mandya's broader regional-name list as evidence for Canadian naming frequency. That was an exclusion from that exact `kodo millet atta` review, not an active alias decision for `Arikelu Pindi` ([earlier review](wp02-a6-next-regional-flour-gap-review-20261013.md)). No A6 proposal or integration has assigned this exact key.
- **Source IDs:** no new R166 source IDs are proposed. Reuse existing ledger IDs `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` (Organic Mandya product page) and `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` (IIMR crosswalk). They remain allocated to their existing URLs; this proposal does not allocate them again.

## Why this is the next bounded gap

Organic Mandya's current maker page for its single-grain Kodo Millet Flour directly lists `Arikelu Pindi (Telugu)` among names for that flour. The page separately describes the product as finely ground kodo millet. The current ICAR–Indian Institute of Millets Research (IIMR) language table lists Telugu `Arikelu, Arika` under Kodo Millet. Together, the maker's exact flour wording and the institute's grain crosswalk connect the phrase to the existing kodo flour and grain identities without inferring a new crop or milling product.

The flour wording comes from one current Indian manufacturer page. I found no Canadian product page using `Arikelu Pindi`, and no Québec source endorses a French rendering. The proposal therefore adds only the exact source-attested romanized search terms, keeps the existing Canadian/Québec-facing displays, and makes no Canadian availability or French terminology claim. This is a narrower and better bounded alias review than activating the other regional flour names listed on the same page.

## Live ownership and exact proposed delta

The snapshot contains **1,541 active references**, **119 forms**, **61 legacy import candidates**, and **1,886 research-ledger records** with **8,045 source entries**, **6,884 distinct source IDs**, and **5,682 distinct URLs**. Exact keys were checked after lowercasing, compatibility decomposition, accent and punctuation folding, and whitespace normalization, following [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Existing reference ID | Current names and aliases | Category and numeric fields | Proposed exact addition |
|---|---|---|---|
| `ingredient-ref-kodo-millet` | `kodo millet / kodo`; English aliases `koda millet`, `varagu`; no French aliases | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` | Append `arikelu` to `aliasesEn`. |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo`; English aliases `kodo millet atta`, `varagu maavu`; no French aliases | `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []` | Append `arikelu pindi` to `aliasesEn`. |

No active reference, form label or form match term, legacy candidate, or ledger record ID currently owns the normalized keys `arikelu` or `arikelu pindi`. The live forms catalog has no form attached to either target reference. Existing ledger mentions of the source phrase are evidence notes only; they do not establish catalog-key ownership. No new reference, form, legacy candidate, or research record ID is proposed.

Use the romanized regional terms in `aliasesEn` as searchable names, following the existing placement of regional names such as `varagu` and `varagu maavu`. Keep both display labels unchanged. Do not add `Arikelu Pindi` to the grain row or bare `Arikelu` to the flour row. Leave `Arika`, `Arika Pindi`, `Arikelu flour`, `Arikelu atta`, and literal French forms unassigned: only `Arikelu` and `Arikelu Pindi` have the relevant source support for the respective product scopes.

## English and French terminology boundary

- Keep the grain display `kodo millet` / `kodo` and the flour display `kodo millet flour` / `farine de millet kodo`.
- Add `arikelu` only as a searchable regional name for the kodo grain, and `arikelu pindi` only as a searchable regional product name for kodo millet flour. The maker labels the latter as Telugu; this is not an English display name.
- Add no French alias. The current Canadian French product wording and federal species terminology continue to support the existing display, but neither is a ruling on how to translate the Telugu name.
- Do not infer that every flour called `pindi` is kodo flour, that `Arika Pindi` is interchangeable, or that every grain named `Arika` has a flour counterpart in this catalog.

## Picker projection

The production search first returns complete normalized word-phrase matches, then falls back to substring matches. The following static projection uses the current references and forms with only the two proposed aliases added in memory:

| Query | Current picker result | Result with proposed aliases |
|---|---|---|
| `arikelu pindi` | none | `ingredient-ref-kodo-millet-flour` only |
| `arikelu` | none | `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` |
| `arika` | none | none |
| `arika pindi` | none | none |
| `pindi` | none | `ingredient-ref-kodo-millet-flour` through substring fallback |
| `kodo millet flour` | `ingredient-ref-kodo-millet-flour` only | same |
| `farine de millet kodo` | `ingredient-ref-kodo-millet-flour` only | same |
| `varagu maavu` | `ingredient-ref-kodo-millet-flour` only | same |
| `varagu` | `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` | same |

The deliberate `arikelu` grain alias prevents that shorter crop-name query from returning the flour alone: it offers the grain and flour choices, as the existing `varagu` boundary does. The suffix query `pindi` will also surface the flour because of the current substring fallback. This is a picker consequence of adding the full source phrase; it does not add `pindi` as a catalog alias or establish a generic flour equivalence.

## Bundled recipe demand

The split-package manifest lists **114 recipe files** containing **1,123 ingredient rows**. Every manifest-listed file was scanned across its serialized text, and each ingredient row was checked separately for the proposed terms, nearby spellings, existing kodo names and IDs, and French display wording.

- Candidate-term hits across recipe files: **0 of 114**.
- Candidate-term hits in ingredient rows: **0 of 1,123**.
- Direct ingredient links to `ingredient-ref-kodo-millet` or `ingredient-ref-kodo-millet-flour`: **0**.
- Scanned phrases: `arikelu pindi`, `arikelu`, `arika pindi`, `arika`, `kodo millet flour`, `kodo millet atta`, `varagu maavu`, `varagu flour`, `kodo millet`, `kodo`, and `farine de millet kodo`.

For repeatable corpus identification, the SHA-256 over each manifest-ordered UTF-8 relative path, NUL byte, raw recipe-file bytes, and NUL byte is `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`. No recipe text or ingredient link is proposed.

## Forms, measures, and substitutions

No ingredient forms are attached to either kodo reference, and no forms or form conversions are proposed. Keep both active densities null and both unit-mapping arrays empty. Do not infer a grain-to-flour yield, package yield, volume conversion, or household measure from the name evidence.

The kodo-flour ledger already has bounded measurement research. Preserve its laboratory bulk-density observation of **0.68 g/mL** as a study-specific flour-sample result, not a kitchen density. Preserve the separate recipe observation of **1 cup / 250 g** as one published portion; that source does not state the cup convention or flour-fill method, so it is not a reusable conversion. The flour record remains `measurementState: researched_supported`; neither observation changes the active `defaultDensity` or `unitMappings`.

The flour record's substitution research remains `blocked_pending_evidence`. One experimental unleavened-flatbread study reports a wheat/millet composite including kodo at a 3:1 proportion; one 2026 muffin study reports its result for flour treated at 30% moisture and 100°C, particularly at 75% replacement. Both findings are bound to their study formulas and conditions. There is no active global or contextual substitution rule for either kodo reference. Keep the existing findings and state unchanged; add no substitution, conversion, recipe link, or reusable replacement ratio.

## Source register and URL ownership

All sources below already exist in the ledger; they are reused, not reallocated. The two alias recommendations depend on the first two rows. Existing terminology and numeric research sources are listed to document the unchanged baseline.

| Existing source ID | Source and locator | Use and limits |
|---|---|---|
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), current product description and regional-names paragraph; checked 2026-10-16. | The live maker page calls its product Kodo Millet Flour, describes it as finely ground kodo millet, and lists `Arikelu Pindi (Telugu)`. Direct product-specific evidence for this exact phrase. It is one Indian manufacturer source, not Canadian market evidence or a Québec terminology ruling. URL already owned by this source ID on `ingredient-ref-kodo-millet-flour`; if integrated, refresh its locator/support/access date rather than minting another source ID. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` | ICAR–Indian Institute of Millets Research, [Millets Information](https://millets.res.in/millets_info.php), live common-name table, Kodo Millet row, lines 144–154; checked 2026-10-16. | Lists Telugu `Arikelu, Arika` under Kodo Millet. Supports the grain-level crosswalk, not a flour name, French term, Canadian package label, or recipe measure. URL already owned by this ID on both kodo references; if integrated, extend its locator/support to include the Telugu names. |
| `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S01` | Government of Canada Translation Bureau, [TERMIUM Plus: *Paspalum scrobiculatum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO). | Supports the species-qualified `kodo` terminology for grain-growing; it does not define a regional flour alias. Existing source on the flour record. |
| `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S03` | Spice Divine, [Farine de millet Kodo S&V](https://spicedivine.ca/fr/products/sv-kodo-millet-flour-907g), Canadian French product page. | Supports retaining the existing French display wording; it does not translate `Arikelu Pindi`. Existing source on the flour record. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S04` | Srilekha et al., [Evaluation of physical, functional and nutritional quality parameters of kodo millet flour](https://www.phytojournal.com/archives/2019.v8.i4.8848/evaluation-of-physical-functional-and-nutritional-quality-parameters-of-kodo-millet-flour), *Journal of Pharmacognosy and Phytochemistry* 8(4) (2019), pp. 193–194. | Existing lab bulk-density observation, 0.68 ± 0.00 g/mL. Not a household fill method or active density. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S05` | Millet Revival Project, [Kodo Millet Thattai](https://milletrevivalproject.in/2024/07/17/kodo-millet-thattai/), ingredient line. | Existing one-recipe `1 cup or 250 grams` portion observation. Cup and fill conventions are unspecified. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S06` | Sharma and Gujral, [Modulation in quality attributes of dough and starch digestibility of unleavened flat bread on replacing wheat flour with different minor millet flours](https://doi.org/10.1016/j.ijbiomac.2019.08.252), *International Journal of Biological Macromolecules* 141 (2019). | Existing study-specific flatbread finding; it does not establish a general substitute ratio. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S07` | Thakur et al., [Valorization of kodo millet for gluten-free muffin](https://doi.org/10.1016/j.bcdf.2026.100528), *Bioactive Carbohydrates and Dietary Fibre* 35 (2026), article 100528. | Existing treatment- and formula-specific muffin finding; it does not establish a general substitute ratio. |

The IIMR URL is also already present on the common-millet and proso-flour records under `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`. That ID documents the Proso rows. Keep it there; reuse the kodo-specific `...-S08` for the Kodo row and do not add another ledger source entry for the same URL. No new R166 source ID or source URL is needed.

## Integration instruction

Append only `arikelu` to `aliasesEn` for `ingredient-ref-kodo-millet` and `arikelu pindi` to `aliasesEn` for `ingredient-ref-kodo-millet-flour`. Record accepted alias decisions on those two existing ledger records citing `...-S08` for the grain name and `...-S03` plus `...-S08` for the flour name. Refresh the reused sources' locator/support/access date to record the current Telugu crosswalk and product wording. Preserve all other active reference fields, existing measurements and blocked substitution findings, forms, legacy candidates, recipe rows, and rules.

No app, unit, instrumentation, emulator, deployment, or build tests were run. This is a proposal-only catalog audit; the project instructions exempt database-JSON-only additions from tests.
