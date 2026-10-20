# WP02 A6 R172: Kodon grain and flour naming review — 2026-10-16

- **Recommendation:** Integrate `kodon` on the existing Kodo millet grain reference and `kodon atta` on its existing flour reference.
- **Integration:** Accepted; both aliases are present in the active references and in the Kodo ledger decisions. No source ID or URL was added.
- **Scope:** One bounded name pair: the regional grain term `Kodon` and the manufacturer-attested flour phrase `Kodon Atta`.
- **Disposition:** Alias-only. Add no ingredient reference, form, legacy identity, French term, measurement behavior, recipe link, or substitution rule.
- **Source IDs:** Reuse Organic Mandya `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` and ICAR–IIMR `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08`. Create no source ID or duplicate URL.
- **Plan context:** The A6 parent remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). R169 left `kodon atta` outside its Kodra review; R170 and R171 decided Kodra Peeth and Harka names respectively. This review covers the distinct Kodon name pair [R169 Kodra proposal](wp02-a6-next-regional-flour-review-r169-20261016-kodra.md), [R170 Kodra Peeth proposal](wp02-a6-next-regional-flour-review-r170-20261016-kodra-peeth.md), [R171 Harka proposal](wp02-a6-next-regional-flour-review-r171-20261016-harka.md), [R171 integration record](../batches/wp02-wp03-wp04-r171-gap-review-integration-20261016/README.md).

## Decision and exact delta

Append these terms to the existing `aliasesEn` arrays:

| Reference | Current identity | Proposed addition | Category and numeric fields |
| --- | --- | --- | --- |
| `ingredient-ref-kodo-millet` | `kodo millet / kodo`; aliases `koda millet`, `varagu`, `arikelu`, `kodra`, `harka` | `kodon` | Keep `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo`; aliases `kodo millet atta`, `varagu maavu`, `arikelu pindi`, `kodra flour`, `kodra atta`, `kodra peeth`, `harka atta` | `kodon atta` | Keep `FLOUR_AND_STARCH`, `defaultDensity: null`, and `unitMappings: []`. |

The current Organic Mandya page identifies its item as Kodo millet flour, describes it as finely ground Kodo millet, and includes “Kodon Atta (Bengali)” in its list of regional flour names. ICAR–Indian Institute of Millets Research lists `Kodon` under Kodo Millet, establishing the grain mapping [S03, S08]. There is a language-label disagreement: Organic Mandya labels the flour phrase Bengali, while ICAR–IIMR lists Bengali `Kodo` and Hindi `Kodon`. This proposal records the exact product wording and grain match only; it does not adopt or resolve the manufacturer's language attribution.

Store these romanized regional terms in `aliasesEn` as searchable names; this field does not claim that they are English vocabulary. Keep the displays `kodo millet / kodo` and `kodo millet flour / farine de millet kodo`. Add no French term, including `farine de kodon`, because the sources do not establish French or Québec usage.

## Exact-key ownership and picker projection

The live audit covered 1,547 ingredient references, 119 forms, 61 legacy import candidates, and 1,891 research-ledger records. Candidate keys were normalized with the case, compatibility, accent, and punctuation folding used in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). No exact owner was found for `kodon`, `kodon atta`, `kodon aata`, `kodon ka atta`, `kodon flour`, `kodon millet`, `kodon millet flour`, or `kodon millet atta` in reference names/aliases, form IDs/labels/match terms, legacy candidates, or ledger record/decision keys. The words occur within the existing source record and R169 scope note, but no active identity or alias owns these exact keys.

| Query/key | Current owner or picker result | Projection after the proposed aliases |
| --- | --- | --- |
| `kodon` | No result | Both `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`; the grain alias is supported by the ICAR crosswalk, and the flour phrase contains the one-word query. |
| `kodon atta` | No result | `ingredient-ref-kodo-millet-flour` only. |
| `kodon aata`; `kodon ka atta`; `kodon flour`; `kodon millet` | No result | No result; keep these unreviewed variants out. |
| `kodo`; `kodra`; `harka` | Existing Kodo grain and flour choices | Unchanged. |
| `kodo millet flour`; `farine de millet kodo`; `kodra flour`; `kodra atta`; `kodra peeth`; `harka atta` | Existing Kodo flour result | Unchanged; flour only. |
| `atta`; `flour` | Existing broad multi-result sets | Unchanged; the Kodo flour row already matches these broad queries through existing terms. |

The bare `kodon` query should retain both grain and flour choices, while `kodon atta` selects the flour. No forms are attached to either Kodo reference, so this delta creates no form hint.

## Bundled recipe demand

The audit covered all 114 manifest-listed recipe files and all 1,123 ingredient rows. It searched serialized recipe content and row values for `kodon`, `kodon atta`, the unreviewed Kodon variants, `kodri no lot`, Kodo grain/flour terms, and the integrated neighbors `kodra`, `kodra atta`, `kodra flour`, `kodra peeth`, `harka`, `harka atta`, `varagu`, `varagu maavu`, `arikelu`, and `arikelu pindi`. It found zero file hits and zero row hits. Direct links to `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` remain zero. This would add search coverage without current bundled-recipe demand.

The ordered manifest recipe snapshot was 753,928 bytes, SHA-256 `f4f9c6a3647d877769729715a383733f49aaa4f8f4bba8f99ab27bdb760466e8` during this review.

## Forms, measurements, and substitutions

Neither Kodo reference has attached forms. Preserve the current evidence and behavior:

- The grain reference has `defaultDensity: null`, no unit mappings, and no measurement observations.
- The flour reference has `defaultDensity: null` and no unit mappings. Preserve the existing **0.68 g/mL** laboratory bulk-density observation and the single **1 cup or 250 g** recipe portion as source-specific findings. The lab sample has no household packing convention; the recipe does not specify cup convention or flour filling method. Neither value supports a reusable conversion.
- Preserve the two `blocked_pending_evidence` substitution findings: a study-specific **3:1** wheat/Kodo minor-millet flatbread formulation and a heat-moisture-treated muffin study reporting **75%** replacement in its own formulation. Neither is a general substitution ratio.
- The global and contextual substitution-rule files contain zero rules. Add no active substitution, yield, conversion, or recipe link.

## Source register and source-ID/URL audit

| Existing source ID | Current source and locator | Support and limits |
| --- | --- | --- |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), product description (lines 152–153) and regional-names paragraph (line 154); checked 2026-10-16. | The maker identifies a finely ground Kodo millet flour and explicitly lists “Kodon Atta (Bengali)” for it. Reuse the existing URL/source ID on the Kodo flour record; if integrated, extend its locator/support to include Kodon Atta while preserving the language-attribution caveat. This Indian manufacturer page is not Canadian-market or Québec-language evidence. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` | ICAR–Indian Institute of Millets Research, [Millets Information](https://millets.res.in/millets_info.php), Kodo Millet row (lines 144–154); page updated 2026-07-07, checked 2026-10-16. | Lists Hindi `Kodon` under Kodo Millet and Bengali `Kodo`. Supports the grain identity, not the flour suffix, a Bengali label, French wording, or measures. Reuse the existing URL/source ID; no second source record is needed. |

Both source IDs and URLs are already registered in the live ledger. No new source ID or URL is proposed. No ingredient, form, legacy-candidate, measurement-observation, substitution-finding, or recipe-link ID is proposed.

## Integration summary

1. Append `kodon` to `aliasesEn` for `ingredient-ref-kodo-millet`.
2. Append `kodon atta` to `aliasesEn` for `ingredient-ref-kodo-millet-flour`.
3. Reuse S03 and S08. If accepted, extend S03's and S08's existing locators/support for the product phrase and grain crosswalk; do not duplicate either URL or claim a Bengali terminology ruling.
4. Preserve both French displays, all measurement observations, and both blocked substitution findings. Add no French alias, form, active measure, recipe link, conversion, yield, or substitution.
