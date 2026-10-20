# WP02 A6 R171: Harka grain and flour naming review — 2026-10-16

- **Recommendation:** Integrate `harka` on the existing Kodo millet grain reference and `harka atta` on its existing flour reference.
- **Scope:** One bounded Kannada name family: the grain name `Harka` and the maker-attested flour phrase `Harka Atta`.
- **Disposition:** Alias-only. Add no new reference, form, legacy identity, French term, measurement behavior, recipe link, or substitution rule.
- **Source IDs:** Reuse existing Organic Mandya source `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` and ICAR–IIMR source `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08`. Create no source ID or duplicate URL.
- **Plan context:** The active A6 parent remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). R169 explicitly left `harka atta` outside its Kodra decision; R170 covered only `kodra peeth`. This review adjudicates the distinct Harka names [R169 Kodra proposal](wp02-a6-next-regional-flour-review-r169-20261016-kodra.md), [R170 Kodra Peeth proposal](wp02-a6-next-regional-flour-review-r170-20261016-kodra-peeth.md).

## Decision and exact delta

Append the following terms to the existing `aliasesEn` arrays:

| Reference | Current identity and aliases | Proposed addition | Category and numeric fields |
| --- | --- | --- | --- |
| `ingredient-ref-kodo-millet` | `kodo millet / kodo`; aliases `koda millet`, `varagu`, `arikelu`, `kodra` | `harka` | Keep `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo`; aliases `kodo millet atta`, `varagu maavu`, `arikelu pindi`, `kodra flour`, `kodra atta`, `kodra peeth` | `harka atta` | Keep `FLOUR_AND_STARCH`, `defaultDensity: null`, and `unitMappings: []`. |

The current Organic Mandya product page identifies a Kodo millet flour product, titles it “Kodo Millet Flour (Kodo Atta / Harka Atta),” and lists “Harka Atta (Kannada)” among regional flour names. ICAR–Indian Institute of Millets Research lists Kannada `Harka` in its Kodo Millet grain row. These sources support the exact flour phrase and the base-grain name [S03, S08].

Store the romanized regional terms in `aliasesEn` as searchable terms; that field does not assert the terms are English vocabulary. Keep the displays `kodo millet / kodo` and `kodo millet flour / farine de millet kodo`. Add no French alias: the sources do not establish Canadian or Québec usage, and no French wording for Harka is proposed.

## Ownership and picker projection

The live audit covered 1,547 ingredient references, 119 forms, 61 legacy import candidates, and 1,891 research-ledger records. Candidate keys were normalized using the case, compatibility, accent, and punctuation rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). No active reference name/alias, form ID/label/match term, or legacy candidate owns the exact normalized keys `harka`, `harka atta`, `harka aata`, `harka ka atta`, `harka flour`, `harka millet`, `harka millet flour`, or `harka millet atta`. The ledger contains the current source title with “Harka Atta,” but no ingredient-reference or decision assigns that key yet.

| Query/key | Current owner or picker result | Projection after the proposed aliases |
| --- | --- | --- |
| `harka` | No result | Both `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`. The grain alias is warranted by the ICAR crosswalk; the flour alias phrase also contains this one-word query. |
| `harka atta` | No result | `ingredient-ref-kodo-millet-flour` only. |
| `harka aata`; `harka ka atta`; `harka flour`; `harka millet` | No result | No result; leave these spelling and qualified variants unassigned. |
| `kodo`; `kodra` | Existing Kodo grain and flour choices | Unchanged. |
| `kodra atta`; `kodra flour`; `kodra peeth`; `kodo millet flour`; `farine de millet kodo` | Existing Kodo flour result | Unchanged; flour only. |
| `atta`; `flour` | Existing broad multi-result sets | Unchanged; the Kodo flour row already matches these broad queries through its current display and `kodo millet atta` alias. |

The search index matches a complete normalized query phrase anywhere in an alias. Adding the grain-level `harka` term as well as flour-specific `harka atta` preserves a useful two-choice result for bare `harka`; the qualified query remains flour-only. No forms are attached to either Kodo reference, so no form hint or form ID changes.

## Bundled recipe demand

The audit read all 114 recipe files listed in the [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), including all 1,123 ingredient rows. It searched serialized recipe text and ingredient rows for `harka`, `harka atta`, the unassigned spelling variants, Kodo grain/flour names, and the already integrated nearby terms `kodra`, `kodra atta`, `kodra flour`, `kodra peeth`, `varagu`, `varagu maavu`, `arikelu`, and `arikelu pindi`. It found zero file hits and zero ingredient-row hits. Direct links to `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` remain zero. This is a search-coverage addition without current bundled-recipe demand.

The ordered manifest recipe snapshot was 753,928 bytes, SHA-256 `f4f9c6a3647d877769729715a383733f49aaa4f8f4bba8f99ab27bdb760466e8` during this review.

## Forms, measurements, and substitutions

Neither Kodo reference has attached forms. Leave all numeric and substitution data unchanged:

- Kodo grain remains `defaultDensity: null`, with no unit mappings or measurement findings.
- Kodo flour remains `defaultDensity: null`, with no unit mappings. Preserve its source-specific **0.68 g/mL** laboratory bulk-density observation and the single recipe portion of **1 cup or 250 g**. The study does not provide a household fill or packing convention; the recipe does not define its cup convention or filling method. Neither value is a reusable conversion.
- Preserve the two `blocked_pending_evidence` substitution findings: one study-specific **3:1** wheat/Kodo minor-millet unleavened-flatbread formulation and one heat-moisture-treated muffin formulation reporting **75%** in that study. Neither is a general replacement ratio.
- The bundled global and contextual substitution-rule files contain zero rules. Add no active substitution, yield, conversion, or recipe link.

## Source register and source-ID/URL audit

| Existing source ID | Current source and locator | Support and limits |
| --- | --- | --- |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), product title and description (lines 115–129), regional-names paragraph (line 154); checked 2026-10-16. | Identifies the product as Kodo millet flour and directly uses “Harka Atta” in the product title and regional-name list. Reuse the URL already registered on the Kodo flour record; if integrated, extend the current locator/support to record Harka Atta (Kannada). Indian maker evidence only, not Canadian-market or Québec-language evidence. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` | ICAR–Indian Institute of Millets Research, [Millets Information](https://millets.res.in/millets_info.php), Kodo Millet row (lines 144–154); page updated 2026-07-07, checked 2026-10-16. | Lists Kannada `Harka` under Kodo Millet. Supports the grain mapping, not the flour phrase, French display, or measures. Reuse the existing URL and extend its locator/support to include the Kannada entry; do not create a second source record. |

Both IDs and URLs are already registered in the live research ledger. The source wording is available there as evidence but has not been assigned as an active catalog key. No new source ID or URL is proposed, and no ingredient, form, legacy-candidate, measurement-observation, substitution-finding, or recipe-link ID is proposed.

## Integration summary

1. Append `harka` to `aliasesEn` on `ingredient-ref-kodo-millet`.
2. Append `harka atta` to `aliasesEn` on `ingredient-ref-kodo-millet-flour`.
3. Reuse S03 and S08 and update their existing locators/support for the Harka wording and crosswalk. Do not duplicate URLs.
4. Preserve both French displays, all measurement observations, and blocked substitution findings; add no French term or numeric, form, recipe-link, or substitution behavior.
