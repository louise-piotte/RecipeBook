# WP02 Section 04 A6 R167 — Varagu Podi Kodo flour / rava boundary review

## Review record

- **Scope:** the exact romanized Malayalam name `Varagu Podi` as a possible search alias for the existing Kodo millet flour reference.
- **Recommendation:** **HOLD** `varagu podi` outside active aliases. Propose no active-reference, form, legacy-identity, recipe-link, or research-ledger delta.
- **Checklist context:** Section 04 A6 remains open for regional grain flours in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1507). R165 integrated `kauni` on the foxtail-millet grain row; R166 integrated `arikelu` and `arikelu pindi` on the existing Kodo grain and flour rows ([R165 proposal](wp02-a6-next-regional-flour-review-r165-20261016-kauni.md), [R166 proposal](wp02-a6-next-regional-flour-review-r166-20261016.md), [R166 integration record](../batches/wp02-wp03-wp04-r166-gap-review-integration-20261016/README.md)).
- **Why this is the next bounded gap:** `Varagu Podi` is an exact, still-unassigned name for the already represented Kodo flour, distinct from the integrated Tamil `varagu maavu` and Telugu `arikelu pindi`. Two current manufacturer pages attach the same romanization to different Kodo milling products: Organic Mandya names it for fine flour, while Sri Saraswathi Organics lists it for Kodo rava. The direct product evidence makes this a useful next boundary to review, but does not justify binding the term to one of those product classes.
- **Archive boundary:** exact-phrase searches across the A6 plan, proposal archive, batch archive, active reference and form terms, legacy identities, and ledger found no prior `varagu podi` assignment or hold. The prior [Varagu / Kodo review](wp02-a6-next-regional-flour-gap-review-20261013-round18-varagu-kodo.md) integrated only `varagu` for grain and `varagu maavu` for flour. The separate [generic Puttu podi family hold](wp03-section-f-puttu-podi-family-boundary-hold-20261013-r33.md) does not assign this exact Kodo name and is not reopened here.
- **Source-ID ownership:** reuse `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` for the existing Organic Mandya URL; do not create a duplicate URL record. `WP02-A6-VARAGU-PODI-BOUNDARY-R167-20261016-S01` is a **proposal-local, unallocated** identifier for the Sri Saraswathi Organics page. It does not appear in the live ledger or archive and must remain unallocated unless a later integration records the evidence.

## Evidence and product boundary

Organic Mandya's live [Kodo Millet Flour](https://organicmandya.com/products/kodo-millet-flour-500-gm) page describes its product as Kodo millet flour finely ground from Kodo millet and lists `Varagu Podi (Malayalam)` among regional names for that flour (checked 2026-10-16, product description and regional-name paragraph, lines 152–154). This is direct manufacturer evidence for the exact phrase on one fine-flour product.

Sri Saraswathi Organics' live [Kodo Millet Rava](https://saraswathiorganics.com/products/kodo-millet-rava/) page names the product `Kodo Millet Rava` (lines 179–181), describes its rava product and uses (lines 238–258), and lists Malayalam `വരகு റവ / വരகு പൊടി (Varagu Rava / Varagu Podi)` under regional languages for that product (lines 263–269; checked 2026-10-16). This is direct manufacturer evidence that the exact romanization is also used in a rava product context. The page's product title and use distinguish it from the fine flour described by Organic Mandya; the source does not state a particle-size specification or claim the two products are interchangeable.

These sources establish that `Varagu Podi` is used in current Kodo product naming, but they conflict on which milling product the exact phrase identifies. The review therefore does not infer that the phrase has one catalog-wide flour meaning, create a Kodo-rava reference, or treat rava as a form of fine Kodo flour. This is a product-page boundary finding, not a ruling on Malayalam usage generally.

## Live ownership and exact disposition

The current live snapshot has **1,542 ingredient references**, **119 forms**, **61 legacy-import candidates**, and **1,886 research-ledger records** containing **8,050 source entries**, **6,889 distinct source IDs**, and **5,687 distinct URLs**. The exact-key audit covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json), using the normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase compatibility folding, accent and punctuation folding, and whitespace normalization.

| Normalized key or target | Current owner and live fields | Proposed disposition |
|---|---|---|
| `varagu podi` | No exact normalized owner in active reference names/aliases, form labels/match terms, legacy candidate names/aliases, or a dedicated ledger record/decision. | Keep unassigned. Add no alias or candidate ID. |
| `varagu` | Alias on `ingredient-ref-kodo-millet`; its shorter picker query also phrase-matches `varagu maavu` on the flour row. | Preserve the existing grain/flour picker choice. |
| `varagu maavu` | Alias on `ingredient-ref-kodo-millet-flour`. | Preserve as the exact flour alias already integrated by R18. |
| `arikelu`; `arikelu pindi` | Respectively aliases on `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`, integrated in R166. | Preserve both exact owners. |
| `varagu rava`; `kodo millet rava` | No exact active reference, form, legacy, or ledger-candidate owner. | Keep unassigned; this proposal does not create a Kodo-rava identity. |
| `ingredient-ref-kodo-millet` | `kodo millet / kodo`; aliases `koda millet`, `varagu`, `arikelu`; category `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. | Reuse unchanged. |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo`; aliases `kodo millet atta`, `varagu maavu`, `arikelu pindi`; category `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []`. | Reuse unchanged; do not append `varagu podi`. |

No form is attached to either Kodo reference. The live global and contextual substitution-rule files also contain no Kodo grain/flour rule. No new ingredient reference, legacy identity, form, or ledger record ID is proposed.

## English and French terminology limits

- Keep the displays `kodo millet / kodo` and `kodo millet flour / farine de millet kodo` unchanged.
- The manufacturer labels the exact romanized term `Varagu Podi` as Malayalam. Do not present it as an English display or translate it into a French alias. The current Canadian French product wording `farine de millet kodo` remains supported by the existing TERMIUM and Canadian product sources; neither source translates `Varagu Podi`.
- Do not add `varagu rava`, `kodo millet rava`, `varagu flour`, bare `podi`, `varagu atta`, `farine de varagu`, or another constructed French phrase. Do not reassign `varagu` from its grain owner or alter `varagu maavu` / `arikelu pindi`.
- Keep `puttu podi` and grain-qualified Puttu products outside this decision. The existing generic Puttu-podi hold is a separate processed-product boundary.

## Picker projection

The production picker first returns complete normalized word-phrase matches and only uses substring matching when no phrase match exists. The static projection below reads the live references and forms with the behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The conditional column illustrates the effect of adding only `varagu podi` to the Kodo-flour aliases; it is not the recommendation.

| Query | Current result | Conditional result if `varagu podi` were added | Recommended result |
|---|---|---|---|
| `varagu podi` | None | `ingredient-ref-kodo-millet-flour` only | None; keep the exact key unassigned. |
| `varagu` | Kodo grain and Kodo flour | Same two references | Same two references. |
| `varagu maavu` | Kodo flour only | Same | Same. |
| `varagu rava`; `kodo millet rava` | None | None | None. |
| `kodo millet flour`; `kodo millet atta`; `farine de millet kodo` | Kodo flour only | Same | Same. |
| `podi` | Sapodilla only, through the current substring fallback | Kodo flour only: the new `podi` word in `varagu podi` becomes a phrase match, so phrase-first precedence suppresses the existing Sapodilla fallback result | Preserve the current projection by adding no alias. |

The conditional `podi` projection is a material consequence of the current search algorithm: an exact two-word alias affects a one-word query because every complete query phrase found inside an indexed term is returned before fallback results. Keeping the exact alias inactive avoids turning the generic query into a Kodo-flour result while the source pages also disagree on the product class.

## Bundled recipe demand

The split-package [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipe files** with **1,123 ingredient rows**. Every manifest-listed recipe was parsed; all serialized strings and ingredient-row `originalText`, `ingredientName`, and `ingredientRefId` values were checked for the exact candidate and adjacent Kodo names. Results:

- Candidate phrase hits across serialized recipe strings: **0 of 114 files**.
- Candidate phrase hits in ingredient rows: **0 of 1,123 rows**.
- Direct ingredient links to `ingredient-ref-kodo-millet` or `ingredient-ref-kodo-millet-flour`: **0**.
- Phrases checked: `varagu podi`, `varagu rava`, `varagu maavu`, `varagu flour`, `kodo millet flour`, `kodo millet rava`, `kodo millet atta`, `arikelu`, `arikelu pindi`, `farine de millet kodo`, and `puttu podi`.

The manifest SHA-256 is `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`. The manifest-ordered corpus fingerprint is SHA-256 `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`, computed over each relative recipe path, NUL byte, exact file bytes, and trailing NUL byte. No recipe link or recipe change is proposed.

## Numeric, form, and substitution assessment

No density, measure, unit mapping, conversion, yield, form, or substitution is proposed. The current Kodo-flour ledger state is `measurementState: researched_supported` and `substitutionResearchState: blocked_pending_evidence`; its active `defaultDensity` remains null and its `unitMappings` remain empty.

- **Existing flour observations:** the Kodo-flour record retains a study-specific bulk-density observation of **0.68 ± 0.00 g/mL** from a laboratory milled-flour sample, not a household filling method. It separately retains one published recipe portion of **1 cup / 250 g**, with no cup convention or flour-fill method stated; this is not a reusable cup conversion.
- **Candidate-form limitation:** neither value is measured for a product explicitly called `Varagu Podi`, and the product-form conflict means they must not be transferred to a Kodo-rava interpretation. The Rava page's package sizes and cooking directions do not establish a flour density or dry mass conversion.
- **Substitution findings:** one study-specific unleavened-flatbread formulation reports kodo among minor-millet flours in a 3:1 wheat/millet composite; a 2026 muffin study reports results for flour treated at 30% moisture and 100°C, particularly at 75% replacement. These do not establish a reusable substitution rule for plain Kodo flour, rava, or a product called `Varagu Podi`.
- **Rules and forms:** no active global or contextual Kodo-flour substitution rule is supported by this review. Preserve the two existing blocked findings and add no form, recipe-line link, grain-to-flour conversion, or substitution.

## Source register and URL ownership

The two product pages below drive the HOLD. Existing sources are reused for unchanged French wording and numeric/substitution context; no duplicate URLs or active ledger entries are proposed. Source IDs in the last column remain proposal-local unless already identified as existing.

| Source ID and status | Source and locator | Evidence and limits |
|---|---|---|
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), product description and regional-name paragraph, lines 152–154; checked 2026-10-16. | Describes fine Kodo millet flour and lists `Varagu Podi (Malayalam)` as a name for that flour. URL is already owned by this ID on `ingredient-ref-kodo-millet-flour`; if a later ledger decision cites the new wording, refresh its locator/support instead of adding a second source record. Indian manufacturer evidence only; not a Canadian label or French terminology ruling. |
| Proposal-local, unallocated `WP02-A6-VARAGU-PODI-BOUNDARY-R167-20261016-S01` | Sri Saraswathi Organics, [Kodo Millet Rava](https://saraswathiorganics.com/products/kodo-millet-rava/), product title and description (lines 179–181, 238–258), Malayalam name list (lines 263–269); checked 2026-10-16. | Lists `Varagu Podi` with `Varagu Rava` under Malayalam names for a Kodo-rava product. Direct maker-page evidence of the competing product context; no particle-size standard, French term, Canadian-market claim, or equivalence with fine flour. This URL was not found in the live ledger/archive. Keep this ID unallocated unless a later integration records it. |
| Existing `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S01` | Government of Canada Translation Bureau, [TERMIUM Plus: *Paspalum scrobiculatum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO). | Supports species-qualified `kodo` terminology in grain-growing contexts; does not translate `Varagu Podi` or name a Kodo-rava product. |
| Existing `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S03` | Spice Divine, [Farine de millet Kodo S&V](https://spicedivine.ca/fr/products/sv-kodo-millet-flour-907g), Canadian French-facing product page. | Supports retaining the existing French flour display; it does not endorse a French regional alias or resolve the flour/rava conflict. |
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S04` | Srilekha et al., [Evaluation of physical, functional and nutritional quality parameters of kodo millet flour](https://www.phytojournal.com/archives/2019.v8.i4.8848/evaluation-of-physical-functional-and-nutritional-quality-parameters-of-kodo-millet-flour), *Journal of Pharmacognosy and Phytochemistry* 8(4) (2019), pp. 193–194. | Existing laboratory bulk-density observation, 0.68 ± 0.00 g/mL; not a household measure or evidence about rava. |
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S05` | Millet Revival Project, [Kodo Millet Thattai](https://milletrevivalproject.in/2024/07/17/kodo-millet-thattai/), recipe ingredient line. | Existing one-recipe 1 cup / 250 g portion; cup and flour-fill conventions are unspecified. |
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S06` | Sharma and Gujral, [Unleavened flatbread study](https://doi.org/10.1016/j.ijbiomac.2019.08.252), *International Journal of Biological Macromolecules* 141 (2019). | Existing study-specific wheat/millet composite finding; no general substitution ratio. |
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S07` | Thakur et al., [Kodo millet gluten-free muffin study](https://doi.org/10.1016/j.bcdf.2026.100528), *Bioactive Carbohydrates and Dietary Fibre* 35 (2026), article 100528. | Existing treatment- and formula-specific muffin finding; no general substitution ratio. |

## Decision

Keep `varagu podi` unassigned and leave both live Kodo references, forms, recipe links, active numeric data, substitutions, and ledger records unchanged. A later review can reopen only this exact term if product-specific evidence resolves whether the intended picker destination is fine Kodo flour or a separately defined Kodo-rava product, and if the search effect of the one-word `podi` query is acceptable or the picker behavior has changed. Do not infer that source evidence for `Varagu Podi` supports a general English or French flour alias.

## Static review checks

- Re-read current `AGENTS.md`, the A6 checklist, R165/R166 proposals and integration archive, and the related Varagu and Puttu-podi decisions before selecting this boundary.
- Checked exact normalized ownership across active references, attached forms, all legacy candidates, ledger record IDs/decisions, the A6 plan, and proposal/batch Markdown archives.
- Projected current and conditional picker results from the phrase-first / substring-fallback behavior in `IngredientSearch.kt`; the conditional projection is static, not runtime picker QA.
- Parsed every manifest-listed recipe and checked every serialized recipe string and ingredient row; no recipe or reference links match the candidate.
- This is a proposal-only file. No shared catalog JSON, ledger, generated code, plan, roadmap, README, recipe file, or source record was modified. No app, unit, instrumentation, emulator, build, or deployment tests were run.
