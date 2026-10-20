# WP02 A6 R169: Kodra grain and flour search aliases — 2026-10-16

- **Recommendation:** Integrate the three bounded English-search aliases below on the existing Kodo grain and flour references.
- **Scope:** `kodra` for the Kodo millet grain; `kodra flour` and `kodra atta` for flour milled from Kodo millet (*Paspalum scrobiculatum*).
- **Disposition:** Alias-only. Create no ingredient reference, form, legacy identity, recipe link, measurement conversion, yield, or substitution rule. Add no French alias.
- **Proposal-local source ID:** `WP02-A6-KODO-KODRA-ALIASES-R169-20261016-S01`, not allocated in the shared ledger.
- **Plan context:** The broader A6 review remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). R165 through R168 cover Kauni, Arikelu, Varagu Podi, and Mandua Atta; this review concerns Kodra wording and leaves those decisions intact.

## Decision and exact delta

Add these terms to the existing `aliasesEn` arrays:

| Reference | Current identity | Proposed alias addition | Category and numeric fields |
| --- | --- | --- | --- |
| `ingredient-ref-kodo-millet` | `kodo millet / kodo`; current English aliases `koda millet`, `varagu`, `arikelu` | `kodra` | Keep `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo`; current English aliases `kodo millet atta`, `varagu maavu`, `arikelu pindi` | `kodra flour`; `kodra atta` | Keep `FLOUR_AND_STARCH`, `defaultDensity: null`, and `unitMappings: []`. |

This split follows the evidence at the two levels: ICAR–IIMR lists `Kodra` in the Kodo grain row, while current manufacturers explicitly use `Kodra Flour` or `Kodra Atta` for flour made from Kodo millet [S01–S03]. The flour page's “Kodra Atta (Hindi)” label does not agree with ICAR–IIMR's language columns, which list Kodra for Gujarati, Marathi, and Punjabi and Kodon for Hindi. The proposal records the supported product phrase without resolving that language attribution or making a broader linguistic claim.

Store these romanized names in the existing English-search alias field because the catalog has no separate regional-language alias field. This is a search mapping, not a claim that the phrases are English vocabulary or Québec product names. Keep the French displays `kodo` and `farine de millet kodo`; add no `aliasesFr` values, including `farine de kodra`.

## Prior decisions and boundary

The October 10 Kodo grain identity review kept `kodra` and other regional terms out of the initial alias set because that review had no matching local package wording or bundled-recipe demand. This proposal adds focused producer and official crosswalk evidence and recognizes that the no-demand finding still holds; it does not create recipe demand [earlier Kodo grain review](wp03-section-f-kodo-millet-identity-review-20261010.md). The October 13 Kodo flour-atta review explicitly excluded `kodra atta` while deciding only the exact phrase `kodo millet atta`; that exclusion did not assign or adjudicate Kodra [Kodo millet atta review](wp02-a6-next-regional-flour-gap-review-20261013.md). R166 then accepted `arikelu` / `arikelu pindi`, and R167 held `varagu podi` because it is also used for Kodo rava and affects the `podi` query. Neither decision covers the exact Kodra terms [R166](wp02-a6-next-regional-flour-review-r166-20261016.md), [R167](wp02-a6-next-regional-flour-review-r167-20261016-varagu-podi.md).

Keep `kodra aata`, `kodra ka atta`, `kodri no lot`, `kodon atta`, `harka atta`, `kodra peeth`, bare `kodon`, and literal French variants unassigned. Although Organic Mandya lists some of those names in the same product paragraph, those are distinct exact spellings or language-specific terms and are outside this narrow Kodra review. In particular, do not use this proposal to broaden the R167 `varagu podi` hold or to add names merely because they appear beside Kodra on a maker page.

## Live ownership and picker projection

The live audit covered all 1,544 ingredient references, 119 forms, 61 legacy import candidates, and 1,888 research-ledger records. Candidate keys were normalized using the folding and punctuation rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposed exact keys have no current owner in reference names or aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, or ledger text. The exact Kodo display keys remain owned by the existing Kodo references.

| Query/key | Current exact owner or picker result | Projection after proposed aliases |
| --- | --- | --- |
| `kodra` | No exact owner; no picker result | Both `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour`, because each has a term containing the complete one-word query. |
| `kodra flour` | No exact owner; no picker result | `ingredient-ref-kodo-millet-flour` only. |
| `kodra atta` | No exact owner; no picker result | `ingredient-ref-kodo-millet-flour` only. |
| `kodra aata`; `kodra ka atta`; `kodri no lot`; `kodon atta`; `harka atta` | No exact owner; no picker result | No result; these terms remain unassigned. |
| `kodo millet atta`; `kodo millet flour`; `farine de millet kodo` | Flour reference | Same flour reference. |
| `kodo`; `varagu`; `arikelu` | Grain and flour rows as already projected through existing terms | Unchanged. |

`IngredientReferenceSearchIndex` first returns all entries whose normalized terms contain the complete query phrase, then uses substring matching only when there are no phrase matches. The bare `kodra` alias therefore belongs on the grain row as well as the flour row's two qualified aliases: the bare query presents both ingredient choices, while each qualified query selects only flour. The existing broad `atta` and `flour` results remain unchanged because the flour row already owns `kodo millet atta` and `kodo millet flour`.

There are no forms attached to either Kodo reference. No form ID, match term, or French product term is proposed.

## Bundled recipe demand

The audit read all 114 recipe files listed by the [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), covering all 1,123 ingredient rows. The scan checked serialized recipe content and each ingredient row for Kodra spellings, Kodo grain/flour terms, and the already integrated neighboring names (`koda millet`, `varagu`, `varagu maavu`, `arikelu`, `arikelu pindi`, and `farine de millet kodo`). It found zero text hits for the proposed Kodra names and zero Kodo grain or flour `ingredientRefId` links. This is a picker-coverage improvement without current bundled-recipe demand.

For a reproducible read-only snapshot, the ordered manifest recipe content was 753,928 bytes with SHA-256 `f4f9c6a3647d877769729715a383733f49aaa4f8f4bba8f99ab27bdb760466e8` during this review.

## Forms, measurements, and substitutions

Keep the current Kodo flour record and its scoped evidence unchanged. It contains no attached ingredient form and currently has `defaultDensity: null`, `unitMappings: []`, no active recipe links, and no global or contextual substitution rules.

- The existing source-specific bulk-density observation is **0.68 g/mL** for a laboratory Kodo flour sample made from locally purchased Hyderabad grain. Its method is a lab bulk-density procedure, with no household fill or packing convention; do not promote it to a default density or cup conversion.
- One thattai recipe reports **1 cup or 250 g** of Kodo flour. It does not define cup size or filling method and remains a single recipe portion, not a reusable unit mapping.
- Two existing substitution findings remain `blocked_pending_evidence`: a study-specific **3:1** wheat/Kodo minor-millet unleavened-flatbread formulation and a heat-moisture-treated Kodo-flour muffin study reporting a preferred **75%** replacement in its own formulation. Neither is a general substitution ratio. Keep both blocked and add no global or contextual rule.

No numeric, form, or substitution consequence follows from the aliases.

## Source register and source-ID audit

| Source ID | Source and locator | Use and limits |
| --- | --- | --- |
| `WP02-A6-KODO-KODRA-ALIASES-R169-20261016-S01` (proposal-local; unallocated) | Aman Brand / S.P. Singh and Sons, [Aman Kodra Flour / Kodo Flour / Kodo Millet Flour](https://www.amanbrand.in/products/kodra-flour-kodo-flour), product title and description, checked 2026-10-16. | Manufacturer page names a “Kodra Flour” product and pairs Kodra Flour, Kodo Flour, and Kodo Millet Flour. Its displayed 1 kg package variant is packaging information, not a kitchen measure. The page showed sold out, so no current availability is inferred. This Indian maker source does not establish Canadian availability or Québec French terminology. The exact source ID and URL were absent from the live ledger and proposal/batch archive when checked. |
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` (reuse; do not duplicate) | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), product description and regional-names paragraph, lines 152–155, checked 2026-10-16. | Describes finely ground Kodo millet flour and names “Kodra Atta (Hindi)” for that flour. Reuse the existing ledger source ID and refresh its locator/support if integrated. It is an Indian manufacturer page, not Canadian-market or Québec-language evidence. |
| Existing `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` (reuse; do not duplicate) | ICAR–Indian Institute of Millets Research, [Millets Information](https://millets.res.in/millets_info.php), Kodo Millet row, lines 144–154; page footer updated 2026-07-07, checked 2026-10-16. | Lists Kodra for Gujarati, Marathi, and Punjabi in the Kodo grain row, and Kodon for Hindi. Supports the grain mapping only; it does not establish flour terminology, Québec naming, or a measure. Reuse the existing ledger source ID and extend its locator/support if integrated. |

The current ledger already owns the Organic Mandya URL under S03 and the IIMR URL under S08. Do not add duplicate source records for those URLs. The proposed Aman source ID and exact URL were checked against the live ledger and archived proposals/batches and were absent; keep S01 proposal-local until the independent integration review allocates or rejects it. No new ingredient, form, legacy-candidate, measurement-observation, substitution-finding, or recipe-link ID is proposed.

## Integration summary

1. Append `kodra` to `aliasesEn` for `ingredient-ref-kodo-millet`.
2. Append `kodra flour` and `kodra atta` to `aliasesEn` for `ingredient-ref-kodo-millet-flour`.
3. If accepted, attach the new Aman source entry using the proposal-local source details above; reuse S03 and S08 and update their locators/support without duplicating their URLs.
4. Preserve current French displays, measurement observations, blocked substitution findings, form state, and recipe links. Do not update shared catalog data as part of this proposal.
