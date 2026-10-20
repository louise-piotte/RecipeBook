# WP02 A6 R173: Kodri grain and flour search-name review — 2026-10-16

- **Proposal recommendation:** Integrate the standalone searchable name `kodri` on the existing Kodo millet grain and Kodo millet flour references. Keep `kodri no lot` unassigned.
- **Root integration disposition:** Hold `kodri` outside active references and the research ledger. Seed-package validation rejects the proposed shared alias because normalized reference names and aliases must have one owner. Adding it to only the grain or flour would make the exact query return only that one product class, so it would not preserve the proposal's intended grain/flour choice.
- **Scope:** The exact standalone spelling `Kodri` as a name paired with Kodo grain and its flour. The proposal does not adjudicate regional-language attribution or reopen the longer `Kodri no Lot` phrase.
- **Disposition:** Alias-only. Create no ingredient reference, form, French alias, measurement behavior, recipe link, or substitution rule.
- **Proposal-local source IDs:** `WP02-A6-KODO-KODRI-ALIASES-R173-20261016-S01` and `WP02-A6-KODO-KODRI-ALIASES-R173-20261016-S02`. They remain unallocated pending integration.
- **Plan context:** The broader A6 checklist remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). R169 integrated Kodra terms and left the distinct exact phrase `kodri no lot` unassigned; R172 integrated Kodon/Kodon Atta. This proposal covers the previously unowned standalone spelling `kodri` without changing those decisions ([R169](wp02-a6-next-regional-flour-review-r169-20261016-kodra.md), [R172](wp02-a6-next-regional-flour-review-r172-20261016-kodon-atta.md)).

## Evidence and terminology limits

Two current producer product pages pair the spelling `Kodri` with Kodo millet at the appropriate product levels. Vanabandhu Naturals sells a Kodo millet grain product and lists `Kodri` among names for Kodo millet. Pure Tree Foods’ current product page identifies a Kodo millet flour product and uses `Kodri` in the Kodo flour description. Organic Mandya’s current Kodo flour page separately lists the longer phrase `Kodri no Lot (Gujarati)` for its flour. Together, these support the standalone search spelling on the existing Kodo grain and flour rows; they do not establish a Canadian product name or Québec French wording [S01–S03].

The language labels are inconsistent. Vanabandhu labels `Kodri` Hindi, while the current ICAR–Indian Institute of Millets Research crosswalk lists Hindi `Kodon` and Gujarati `Kodra` under Kodo Millet; Organic Mandya labels `Kodri no Lot` Gujarati. Do not store a language attribution or generalize the source labels. Use `kodri` only as a source-backed searchable spelling on the existing Kodo identities. The catalog has no separate regional-language alias field, so the term belongs in `aliasesEn` as a search key; this is not a claim that it is English vocabulary.

Keep the displays `kodo millet / kodo` and `kodo millet flour / farine de millet kodo`. No reviewed source establishes a French or Québec term for Kodri, so add no French alias such as `farine de kodri`.

## Exact proposed delta

Append only the standalone term `kodri` to both existing English-search alias arrays:

| Existing reference | Current identity and aliases | Proposed addition | Preserve |
| --- | --- | --- | --- |
| `ingredient-ref-kodo-millet` | `kodo millet / kodo`; `koda millet`, `varagu`, `arikelu`, `kodra`, `harka`, `kodon` | `kodri` | `GRAIN_AND_CEREAL`, `defaultDensity: null`, `unitMappings: []`, existing French display |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo`; `kodo millet atta`, `varagu maavu`, `arikelu pindi`, `kodra flour`, `kodra atta`, `kodra peeth`, `harka atta`, `kodon atta` | `kodri` | `FLOUR_AND_STARCH`, `defaultDensity: null`, `unitMappings: []`, existing French display and source-scoped findings |

Do not add `kodri no lot`, `kodri flour`, `kodri atta`, `kodri aata`, or a French construction. In particular, retaining `kodri no lot` unassigned preserves the earlier R169 boundary and avoids a picker collision described below.

## Exact-key ownership and picker projection

The live audit covered 1,548 ingredient references, 119 forms, 61 legacy import candidates, and 1,892 research-ledger records. Candidate keys were normalized using the lowercase, compatibility/accent fold and punctuation handling in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). No active reference name or alias, form ID/label/match term, legacy candidate, or ledger decision owns the normalized exact key `kodri`; the qualified spelling variants above also have no active owner. The Kodo grain and flour references have no attached forms.

`IngredientReferenceSearchIndex` matches a complete normalized query phrase anywhere in a reference or form term, then returns those exact-phrase matches before it considers partial matches. The projection is:

| Query | Current result | After the proposed delta |
| --- | --- | --- |
| `kodri` | No result | `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` (grain and flour choices) |
| `kodri no lot` | No result | No result; keep the phrase unassigned |
| `kodri flour`; `kodri atta`; `kodri aata` | No result | No result; do not infer these exact product phrases |
| `kodo`; `kodra`; `kodon`; `harka` | Existing Kodo grain and flour choices | Unchanged |
| `farine de millet kodo` | Existing Kodo flour result | Unchanged |

The `kodri no lot` wording is present on the Organic Mandya page, but adding it as one alias would make the generic one-word query `lot` a complete-word phrase match on Kodo flour. The search index returns complete-phrase matches first and skips its partial-match fallback whenever it has one; this would replace the current partial-match results for `lot` with Kodo flour alone. Keep the exact compound unassigned rather than degrading that picker query. The standalone `kodri` alias avoids the `lot` collision while preserving the broader grain/flour choice.

## Bundled recipe demand

The scan covered all **114** recipe files named by the [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) and all **1,123** ingredient rows. It searched serialized recipe content and ingredient-row fields for `kodri`, `kodri no lot`, the qualified Kodri variants, `kodo millet`, `kodon`, `kodra`, `harka`, `arikelu`, and `varagu`. It found zero matching files, zero matching ingredient rows, and zero direct links to either `ingredient-ref-kodo-millet` or `ingredient-ref-kodo-millet-flour`. The alias would add picker coverage without current bundled-recipe demand.

## Forms, numeric evidence, and substitutions

Neither Kodo reference has an attached form. Keep all current numeric and substitution fields unchanged:

- The grain has `defaultDensity: null`, no unit mappings, no measurement observations, and no active substitution rules.
- The flour has `defaultDensity: null` and no unit mappings. Preserve its source-specific **0.68 g/mL** laboratory bulk-density observation [existing S04] and one recipe portion of **1 cup or 250 g** [existing S05] as scoped evidence only. The paper reports laboratory bulk density without a household fill or packing convention; the recipe does not define cup convention or flour filling method. Neither value supports a reusable conversion.
- Preserve both `blocked_pending_evidence` substitution findings: a study-specific **3:1** wheat/Kodo minor-millet flatbread formulation [existing S06] and **75%** replacement in a heat-moisture-treated Kodo-flour muffin formulation [existing S07]. Neither is a general substitution ratio.
- The bundled global and contextual substitution-rule files contain zero rules. Add no form, active measure, conversion, yield, recipe link, or substitution rule.

## Source register and source-ID/URL audit

| Source ID | Source and locator | Use and limits |
| --- | --- | --- |
| `WP02-A6-KODO-KODRI-ALIASES-R173-20261016-S01` (proposal-local, unallocated) | Pure Tree Foods, [Organic Kodo Millet Flour](https://puretreefoods.com/products/pure-tree-certified-organic-kodo-millet-flour-varagu-kodri-atta-kodo-millet-arikelu-organic-millets-unpolished-millets-flour-dehusked), product title and description (lines 29, 77–86), checked 2026-10-16. | Current producer page identifies a Kodo millet flour product and uses `Kodri` in its Kodo-millet flour wording. Its text does not give a regional-language label or a precise standalone definition for the spelling. Supports the spelling/product pairing only; it does not establish Canadian availability, a French name, or a recipe measure. This exact URL and proposal-local ID were absent from the live research ledger and catalog archive when checked. |
| `WP02-A6-KODO-KODRI-ALIASES-R173-20261016-S02` (proposal-local, unallocated) | Vanabandhu Naturals, [Kodo Millet](https://www.vanabandhunaturals.com/product-page/kodo-millet), grain description (lines 25–28) and product details (lines 52–58), checked 2026-10-16. | Current producer page identifies an unpolished Kodo millet grain product and lists `Kodri` among Kodo names. The page labels it Hindi, but the label conflicts with the official ICAR–IIMR table; do not adopt that attribution. This exact URL and proposal-local ID were absent from the live research ledger and catalog archive when checked. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` (existing; reuse) | Organic Mandya, [Kodo Millet Flour](https://organicmandya.com/products/kodo-millet-flour-500-gm), product description and regional-name paragraph, lines 152–154; checked 2026-10-16. | The maker identifies its flour as finely ground Kodo millet and lists the distinct phrase `Kodri no Lot (Gujarati)`. This is supporting context for the flour spelling, not evidence that the Gujarati attribution is correct or that the full phrase should be active. Reuse the existing source ID and URL; do not duplicate either. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` (existing; reuse) | ICAR–Indian Institute of Millets Research, [Millets Information](https://millets.res.in/millets_info.php), Kodo Millet row, lines 145–154; page updated 2026-07-07 and checked 2026-10-16. | Official crosswalk lists Gujarati `Kodra` and Hindi `Kodon` for Kodo Millet, not `Kodri`. It is used to record the source-attribution conflict, not to reject the Kodo product mapping or claim a language for Kodri. Reuse the existing source ID and URL; do not duplicate either. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S04` (existing; reuse) | Srilekha et al., [Evaluation of physical, functional and nutritional quality parameters of kodo millet flour](https://www.phytojournal.com/archives/2019.v8.i4.8848/evaluation-of-physical-functional-and-nutritional-quality-parameters-of-kodo-millet-flour). | Existing flour bulk-density observation only: 0.68 g/mL under the reported laboratory method, not an active default density or kitchen conversion. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S05` (existing; reuse) | Millet Revival Project, [Kodo Millet Thattai](https://milletrevivalproject.in/2024/07/17/kodo-millet-thattai/). | Existing recipe-specific 1 cup / 250 g portion only; no reusable cup conversion. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S06` (existing; reuse) | Sharma and Gujral, [unleavened flatbread study](https://doi.org/10.1016/j.ijbiomac.2019.08.252). | Existing formulation-specific 3:1 finding; no general substitution rule. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S07` (existing; reuse) | Thakur et al., [gluten-free Kodo muffin study](https://doi.org/10.1016/j.bcdf.2026.100528). | Existing heat-moisture-treated, formulation-specific 75% finding; no general substitution rule. |

The two new source IDs above are proposal-local and unallocated. Their URLs and IDs were checked against the live ledger and proposal/batch archive; neither URL nor ID is already registered. S03 and S08, along with numeric/substitution sources S04–S07, are already ledger-owned and must be reused rather than duplicated. No ingredient-reference, form, legacy-candidate, measurement-observation, substitution-finding, or recipe-link ID is proposed.

## Integration summary

1. Append `kodri` to `aliasesEn` for `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`.
2. If accepted, register S01 on the existing Kodo flour ledger row and S02 on the existing Kodo grain ledger row using the proposal-local details above. Reuse existing S03 and S08; record the language-label caveat without adding `kodri no lot` as an alias.
3. Keep all French displays, numeric observations, and blocked substitution findings unchanged. Leave `kodri no lot`, `kodri flour`, `kodri atta`, and `kodri aata` unassigned. Add no forms, measures, recipe links, conversions, yields, or substitutions.

## Root integration outcome

The recommendation was not integrated. Static validation reported `ingredient reference name/alias collision: kodri` for `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`. The seed-package validator enforces distinct normalized name/alias ownership, and a single-owner alias would suppress the other product class for an exact `kodri` query. The two proposal source IDs remain unallocated; no Kodo alias, source record, or ledger decision was added in R173. Revisit if the search model supports explicit multi-reference terms or if a distinct, source-backed qualified spelling can be assigned without making a broader query misleading.
