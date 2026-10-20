# WP02 Section 04 A6 R357 — Kaon foxtail-millet grain alias and flour boundary

## Review record

- **Reviewed:** 2026-10-16; current institutional pages and Québec terminology were checked online.
- **Status:** Integrated in the bundled catalog on 2026-10-16; see the [integration README](../batches/wp02-a6-kaon-foxtail-millet-alias-integration-r357-20261016/README.md).
- **Target:** Existing `ingredient-ref-foxtail-millet` grain row. No new ingredient identity is proposed.
- **Scope:** The exact Bengali grain name `Kaon` and its boundary from foxtail-millet flour. This review does not reopen Kauni or any other recent A6 name decision.
- **Open checklist:** Section 04 A6 remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1694).

## Recommendation

Add only **`kaon`** as an English-search alias on the existing `ingredient-ref-foxtail-millet` grain reference. ICAR–Indian Institute of Millets Research (IIMR) currently places Bengali `Kaon` in the Foxtail Millet name row, and its 2025 foxtail-millet leaflet independently identifies the crop as *Setaria italica* and lists `Kaon (Bengali)` [reused sources S01 and S06]. A current seller title also uses `Kaon` for a whole-grain foxtail-millet product [reused source R165-S04].

Keep `kaon flour` inactive under the earlier [R13 Thinai-flour review](wp02-a6-thinai-foxtail-millet-flour-alias-review-20261013.md), which explicitly left that phrase unassigned. R357 does not reopen that flour decision. Add no `kaon atta`, `kaon millet flour`, or French Kaon construction as part of this grain-only change. The R165 Kauni review's separate finding that a Kauni recipe uses foxtail flour without naming it Kauni flour likewise remains unchanged; see the [R165 proposal](wp02-a6-next-regional-flour-review-r165-20261016-kauni.md) and [integration README](../batches/wp02-wp03-wp04-r165-gap-review-integration-20261016/README.md).

The French display remains **`millet d’Italie`** for the grain and **`farine de millet d’Italie`** for the flour. OQLF identifies *Setaria italica* and lists `millet d’Italie` among its preferred Québec French terms. Its entry also notes the bird-feed association of `millet des oiseaux`, so that broader term is not introduced as a new display or alias [reused source S04]. The existing flour compound remains its current transparent construction from the grain term; this review does not claim that OQLF lists a flour-specific term. Add no French alias.

## Prior-review and novelty audit

The A6 checklist and recent proposal/batch trail were reviewed before selecting this gap. R163 and R164 cover other foxtail names (`kakum`/`kakun`, `kangani`, and the exact flour phrase `kangani ka atta`). R165 added `kauni` to the grain row and held Kauni flour wording; the R165 marketplace source title happens to list `Kaon` among several whole-grain spellings, but the R165 recommendation and integrated checklist item adjudicate **Kauni**, not **Kaon**. The separate [R13 Thinai-flour review](wp02-a6-thinai-foxtail-millet-flour-alias-review-20261013.md) explicitly kept `kaon flour` inactive; R357 preserves that existing disposition and considers only the still-unassigned grain key. No active alias, hold, accepted ledger decision, or completed A6 item assigns `Kaon` at grain level. This proposal uses the already registered R165 title only as corroborating evidence and does not repeat that review.

The later R166–R172 A6 items concern Kodo millet spellings and are unrelated. R173 holds shared `kodri` because its one-owner alias model would collide between Kodo grain and flour; it does not cover the distinct `kaon` key. The R312 A6 review concerns generic millet-flour measurement only and does not change regional grain-name coverage. The reviewed artifacts include the [R165 proposal](wp02-a6-next-regional-flour-review-r165-20261016-kauni.md) and [integration README](../batches/wp02-wp03-wp04-r165-gap-review-integration-20261016/README.md), [R173 proposal](wp02-a6-next-regional-flour-review-r173-20261016-kodri.md) and [integration README](../batches/wp02-wp03-wp04-r173-gap-review-integration-20261016/README.md), and [R312 proposal](wp02-a6-next-regional-flour-gap-review-r312-20261016.md) and [integration README](../batches/wp02-wp05-r312-r313-measurement-research-integration-20261016/README.md).

The `kaon` decision key is absent from the live reference and form names/aliases, legacy-candidate names/aliases, and accepted ledger decision text. The spelling does occur in the title/locator of the already registered R165 marketplace source, but that source's accepted decision is Kauni-only. This proposal adds no new ledger source ID or URL; the existing IIMR, OQLF, and R165 source records can be reused if the alias is integrated.

## Current catalog and picker audit

The read-only snapshot contains **1,693 ingredient references**, **139 forms**, **56 legacy-import candidates**, and **2,049 research-ledger records**. The relevant active rows are:

| Reference | Current display and aliases | Category and active numeric fields | Forms |
|---|---|---|---|
| `ingredient-ref-foxtail-millet` | `foxtail millet / millet d’Italie`; English aliases `thinai`, `kangni`, `korra`, `rala`, `navane`, `kakum`, `kakun`, `kangani`, `kauni`; no French aliases | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` | None |
| `ingredient-ref-foxtail-millet-flour` | `foxtail millet flour / farine de millet d’Italie`; English aliases `thinai flour`, `kangni flour`, `korra flour`, `navane atta`, `kakum flour`, `kangani ka atta`; no French aliases | `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []` | None |

No exact normalized owner was found for `kaon`, `kaon flour`, `kaon atta`, `kaon millet`, or `kaon millet flour` in active references, forms, or legacy candidates. No ingredient reference or legacy candidate ID is proposed. Romanized `Kaon` is stored as a search alias in `aliasesEn` following the current catalog convention; this field placement does not describe it as English vocabulary.

The projection follows the phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current result | After adding `kaon` to the grain row |
|---|---|---|
| `kaon` | None | Foxtail millet grain only |
| `kaon flour`; `kaon atta`; `kaon millet`; `kaon millet flour` | None | None; no flour-qualified term is added |
| `kauni` | Foxtail millet grain | Same |
| `foxtail millet` | Foxtail millet grain and flour | Same |
| `foxtail millet flour`; `farine de millet d’Italie` | Foxtail millet flour only | Same |
| `millet d’Italie` | Foxtail millet grain and flour | Same |

No form hint is created. The single-word grain alias does not capture a flour-qualified Kaon query, and it does not change any existing broad millet or French result.

## Bundled recipe demand

The scan covered every path in the split-package manifest: **114 recipe files and 1,123 ingredient rows**. It searched normalized serialized recipe content and ingredient-row fields for `kaon`, `kaon dana`, `kaon flour`, `kaon atta`, `kaon millet`, `kaon millet flour`, both current foxtail displays, *Setaria italica*, and the two target reference IDs.

- Candidate-phrase file hits: **0 of 114**.
- Candidate-phrase ingredient-row hits: **0 of 1,123**.
- Direct recipe links to `ingredient-ref-foxtail-millet` or `ingredient-ref-foxtail-millet-flour`: **0**.

This would add regional picker coverage without bundled-recipe demand. No recipe text, quantity, link, form, yield, conversion, or substitution is proposed.

## Forms, measurements, and substitution limits

Neither target row has an attached form. Preserve every current numeric and substitution field:

- **Foxtail grain:** Keep `defaultDensity: null`, `unitMappings: []`, and its existing `not_yet_researched` measurement and substitution states. No grain measure, package conversion, yield, density, cooking conversion, or substitution is supported by the Kaon name sources.
- **Foxtail flour:** Keep `defaultDensity: null` and `unitMappings: []`. Its existing ledger retains two laboratory bulk-density endpoints, **502.6 and 534.9 kg/m³**, from flour samples spanning moisture levels of 11.11% to 42.86% on a dry basis. These observations are not a household measure or active default and are not Kaon-specific.
- **Substitution:** Preserve the flour row’s `blocked_pending_evidence` finding for a particular bread-ready-mix study that tested **0%, 10%, 20%, 30%, and 40%** foxtail flour and selected 30% within that formula. It is not a general wheat-replacement ratio for bread, roti, dosa, or other uses.
- **Kaon flour:** No direct product-matched flour amount, density, yield, package norm, or substitution evidence was found. Do not transfer the grain name or the existing generic foxtail-flour findings into a Kaon-specific form or rule.

## Existing source register

No new source ID or URL is proposed. If integrated, reuse the following existing ledger sources and extend their locator/support text only where noted:

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01** | ICAR–Indian Institute of Millets Research, [Millets Information](https://www.millets.res.in/millets_info.php), “Common name of Millets in Indian Languages,” Foxtail Millet row; page footer updated 2026-07-07; checked 2026-10-16. | Lists Bengali `Kaon` under English `Foxtail Millet`. Primary current regional-name crosswalk; it supports the grain alias, not a flour name or Québec terminology. If integrated, extend the existing source support to include Kaon. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06** | ICAR–Indian Institute of Millets Research, [Foxtail millet leaflet](https://www.millets.res.in/farmer/2025/Millets_chalisa/English/7Millets_chalisa_foxtail_millet.pdf), 2025, p. 1. | Identifies foxtail millet as *Setaria italica* and lists `Kaon (Bengali)` among common names. Independently confirms the grain mapping; it provides no flour term, Québec name, or recipe measure. If integrated, extend the existing source support to include Kaon. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S04** | Office québécois de la langue française, [GDT: millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), preferred terms, English/Latin fields, and usage note. | Identifies *Setaria italica*, includes `millet d’Italie` among preferred French terms, and notes the bird-feed association of `millet des oiseaux`. Supports retaining the existing Québec French grain display, not a French Kaon alias or a flour-specific ruling. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S05** | Spice Divine, [Farine de millet S&V Foxtail](https://spicedivine.ca/fr/products/sv-foxtail-millet-flour), French-facing Canadian product title and description. | Uses Canadian French-facing wording for a foxtail-flour product. It does not use Kaon, establish a Québec-preferred flour term, or support `farine de Kaon`. |
| **WP02-A6-KAUNI-FOXTAIL-R165-20261016-S04** | Gauraaj Valley Foods, [Milletzkart seller listing](https://www.milletzkart.com/store/gauraaj-valley-foods), whole-grain product title. | The existing title is “Foxtail Millet (Kauni)/Kakum/Kaon/Korra/Navane/Thina/Kang/rala/Kangam/kanghu.” This India-based marketplace title corroborates the spelling on a whole-grain foxtail listing, but is not the botanical authority or Canadian/Québec availability evidence. If integrated, extend the existing grain-ledger source support to mention Kaon. |

## Proposed delta

1. Append only `kaon` to `aliasesEn` on `ingredient-ref-foxtail-millet`.
2. Reuse the current IIMR and OQLF source IDs on the existing grain record; extend the existing R165 marketplace source text to capture the Kaon listing if root decides it should support the accepted alias.
3. Leave the flour aliases and display unchanged. Keep `kaon flour`, `kaon atta`, `kaon millet flour`, `farine de Kaon`, and other flour-qualified or French variants unassigned.
4. Add no new reference, legacy allocation, form, measurement observation, density, mapping, recipe link, conversion, yield, or substitution. Keep all existing measurement and blocked-substitution evidence unchanged.

**Disposition:** Integrate the grain alias `kaon` only; keep the proposed flour-qualified names outside the active catalog. Broader Section 04 A6 regional grain-flour review remains open.

## Integration record

- Added `kaon` only to `ingredient-ref-foxtail-millet.aliasesEn`; retained `kaon flour` as unassigned.
- Reused IIMR's existing crosswalk and leaflet sources and extended their source notes and the accepted grain-alias decision in the research ledger.
- Static package, generated-index, ledger, picker projection, recipe-corpus, UTF-8/no-BOM, local-link, and whitespace checks are recorded in the [integration README](../batches/wp02-a6-kaon-foxtail-millet-alias-integration-r357-20261016/README.md).
- No software tests were run because this change only adds database JSON data under `AGENTS.md`.
