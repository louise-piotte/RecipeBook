# WP02 A6 R170: Kodra Peeth flour alias review — 2026-10-16

- **Recommendation:** Integrate one English-search alias, `kodra peeth`, on the existing Kodo millet flour reference.
- **Scope:** The exact manufacturer-attested phrase “Kodra Peeth (Marathi)” for flour made from Kodo millet.
- **Disposition:** Alias-only. Add no reference, form, French term, measurement behavior, recipe link, or substitution rule.
- **Source IDs:** Reuse the existing Organic Mandya source `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` and ICAR–IIMR source `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08`. Create no source ID or duplicate URL.
- **Plan context:** The A6 parent remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). The R169 Kodra review expressly left `kodra peeth` unassigned while reviewing `kodra`, `kodra flour`, and `kodra atta`; this proposal decides that one separate spelling only [R169 proposal](wp02-a6-next-regional-flour-review-r169-20261016-kodra.md), [R169 integration record](../batches/wp02-wp03-wp04-r169-gap-review-integration-20261016/README.md).

## Decision and exact delta

Append `kodra peeth` to `aliasesEn` on `ingredient-ref-kodo-millet-flour`. Keep the row's current display names `kodo millet flour / farine de millet kodo`, category `FLOUR_AND_STARCH`, existing aliases, `defaultDensity: null`, and `unitMappings: []`.

The live Organic Mandya product page describes its product as finely ground Kodo millet flour and lists “Kodra Peeth (Marathi)” among regional flour names. ICAR–Indian Institute of Millets Research independently lists Marathi `Kodra` under Kodo Millet. Together these support mapping the exact qualified flour phrase to the existing Kodo flour reference [S03, S08].

Store this romanized regional term in `aliasesEn` as a searchable name; the field does not assert that the phrase is English vocabulary. Keep the English and French displays unchanged and add no `aliasesFr` value. In particular, do not create `farine de kodra peeth` or a literal French translation: no Québec or French-language evidence supports one.

## Ownership, archive, and picker consequences

The live audit covered 1,545 ingredient references, 119 forms, 61 legacy import candidates, and 1,889 ledger records. Normalization follows the case, compatibility, accent, and punctuation folding in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). No exact normalized owner was found for `kodra peeth`, `kodra pith`, `kodo peeth`, or `kodo millet peeth` in reference names/aliases, form IDs/labels/match terms, legacy candidates, or ledger text. The exact phrase appears as an explicitly unassigned boundary in the R169 proposal; it has not been integrated.

| Query/key | Current owner or picker result | Projection after the proposed alias |
| --- | --- | --- |
| `kodra peeth` | No exact owner; no result | `ingredient-ref-kodo-millet-flour` only. |
| `peeth` | No exact owner; no result | `ingredient-ref-kodo-millet-flour` only, because the search matches complete query phrases inside alias terms. This adds a result and displaces no existing fallback. |
| `kodra` | Existing R169 grain and flour choices | Unchanged; both `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`. |
| `kodra atta`; `kodra flour`; `kodo millet flour`; `farine de millet kodo` | Existing Kodo flour result | Unchanged; flour only. |
| `kodra pith`; `kodo peeth`; `kodo millet peeth` | No exact owner; no result | No result; leave these spellings unassigned. |

The `peeth` side effect is bounded to the Kodo flour row: the current catalog has no `peeth` result for another ingredient, so this alias does not hide a pre-existing picker choice. Keep only the qualified alias `kodra peeth`; do not add bare `peeth` or infer other `-peeth` names.

## Bundled recipe demand

The audit read all 114 recipe paths in the [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), including all 1,123 ingredient rows. It searched serialized recipe text and row values for `kodra peeth`, `kodra pith`, `kodo peeth`, `kodo millet peeth`, Kodo grain/flour names, and the already integrated neighboring names `kodra`, `kodra atta`, `kodra flour`, `varagu maavu`, and `arikelu pindi`. It found zero file hits and zero ingredient-row hits. Direct links to `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` remain zero. This is a search-coverage addition without current bundled-recipe demand.

The ordered manifest recipe snapshot was 753,928 bytes, SHA-256 `f4f9c6a3647d877769729715a383733f49aaa4f8f4bba8f99ab27bdb760466e8` during this review.

## Forms, measurements, and substitutions

Neither Kodo reference has attached forms. Leave all current data unchanged:

- Kodo grain remains `defaultDensity: null` with no unit mappings or measurement findings.
- Kodo flour remains `defaultDensity: null` with no unit mappings. Preserve its existing source-specific **0.68 g/mL** laboratory bulk-density observation and one recipe's **1 cup or 250 g** portion. Neither provides a household packing convention or reusable cup conversion.
- Preserve both `blocked_pending_evidence` substitution findings: a study-specific **3:1** wheat/Kodo flour flatbread composite and a heat-moisture-treated muffin study reporting **75%** in its own formulation. Neither is a general substitution ratio.
- The bundled global and contextual substitution-rule files currently contain zero rules. Add no active rule, yield, or recipe link.

## Source register and source-URL audit

| Existing source ID | Current source and locator | Support and limits |
| --- | --- | --- |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), product description and regional-names paragraph, lines 152–155; checked 2026-10-16. | Identifies the product as finely ground Kodo millet flour and names “Kodra Peeth (Marathi)” for it. The URL is already registered on the existing Kodo flour record. If integrated, extend this source's locator/support to include Kodra Peeth; do not add a second record for the same URL. Indian maker evidence only, not Canadian-market or Québec French evidence. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` | ICAR–Indian Institute of Millets Research, [Millets Information](https://millets.res.in/millets_info.php), Kodo Millet row, lines 144–154; page updated 2026-07-07 and checked 2026-10-16. | Lists Marathi `Kodra` under Kodo Millet. Supports the base-grain match, not the flour suffix, a French display, or a measure. This URL is already registered; reuse the source record without duplication. |

Both source IDs and URLs are already present in the live research ledger. No new source ID or URL is proposed. No new ingredient, form, legacy candidate, measurement observation, substitution finding, or recipe-link ID is proposed.

## Integration summary

1. Append only `kodra peeth` to `aliasesEn` for `ingredient-ref-kodo-millet-flour`.
2. Reuse S03 and S08; if accepted, update S03's locator/support to include the current Kodra Peeth wording. Do not duplicate either URL.
3. Preserve both French displays and all existing measurement and blocked substitution research. Keep `peeth` as a picker consequence of the qualified alias only; add no bare `peeth` alias or French term.
