# WP02 Section 04 A6 R164 — Kangani foxtail millet names

## Review record

- **Reviewed:** 2026-10-16; live institutional and product sources checked for this review.
- **Status:** Proposal only. No shared catalog JSON, ledger, generated index, plan, roadmap, recipe, or batch README was changed.
- **Open checklist:** The broad WP02 Section 04 A6 review remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). R163 integrated `kakum` and `kakun` on foxtail grain and `kakum flour` on foxtail flour.
- **Scope:** Reconsider the distinct spelling `Kangani` for the existing foxtail-millet grain and the exact flour product phrase `Kangani ka Atta` for the existing foxtail-millet-flour row. Do not create a new identity.
- **Prior decision:** The 2026-10-13 Kangni review left `Kangani` and `Kangni Atta` inactive because its Canadian pages supported `Kangni` / `Kangni Flour`, not those exact forms. This proposal revisits the spelling with an ICAR–IIMR crop leaflet, a current Canadian grain listing, and current flour product titles that use `Kangani` and `Kangani ka Atta`. It does not add `Kangni Atta` or `Hari Kangni` wording.
- **Testing:** No app, unit, instrumentation, emulator, deployment, or build tests were run. This is a proposal-only data review. Under the updated `AGENTS.md` rule, implementation limited to adding database JSON data also needs no tests.

## Recommendation

Add the English alias **`kangani`** to `ingredient-ref-foxtail-millet` and the exact English product phrase **`kangani ka atta`** to `ingredient-ref-foxtail-millet-flour`. Keep the existing French displays and aliases unchanged. The bare query `kangani` will offer both existing grain and flour choices; the full `kangani ka atta` query will return the flour row alone.

ICAR–Indian Institute of Millets Research's 2025 foxtail leaflet explicitly lists `Kangani (Punjabi)` under *Setaria italica*. Singal's current Canadian retailer listing uses `Foxtail Millet Thinai Kangani` for a grain product. For flour, Bharat Vedica's current maker page titles a foxtail product `Organic kangani ka Atta`; DistaCart's current indexed international listing uses the same phrase and has Canada in its country selector. These sources support the exact pair on existing rows, not a cultivar, milling grade, French term, or Canadian availability claim.

Append only these aliases, preserving all other fields:

~~~json
{
  "ingredient-ref-foxtail-millet": {
    "aliasesEn": ["thinai", "kangni", "korra", "rala", "navane", "kakum", "kakun", "kangani"]
  },
  "ingredient-ref-foxtail-millet-flour": {
    "aliasesEn": ["thinai flour", "kangni flour", "korra flour", "navane atta", "kakum flour", "kangani ka atta"]
  }
}
~~~

Add no new reference, form, French alias, measurement, density, unit mapping, conversion, yield, recipe link, or active substitution. Leave `kangani flour`, `kangani atta`, `kangani aata`, `kangni atta`, and `Hari Kangni` / `Hari Kangani` terms inactive: this packet selects the exact product phrase `Kangani ka Atta` and does not translate, shorten, or expand it into adjacent spellings.

## Product and spelling boundary

| Wording | Recommendation | Evidence and limit |
|---|---|---|
| `kangani` | Add to the existing foxtail grain row. | The ICAR–IIMR leaflet identifies foxtail millet as *Setaria italica* and lists `Kangani (Punjabi)`. A current Canadian retailer titles a grain product `Foxtail Millet Thinai Kangani`. The current IIMR language table instead uses `Kangni` for Punjabi; retain that existing spelling as a separate alias and do not claim the spellings are used interchangeably in every source. [S01; reused A1–A2] |
| `kangani ka atta` | Add to the existing foxtail-millet-flour row. | Bharat Vedica names its product `Organic Foxtail Millet Flour - Organic kangani ka Atta`; the international DistaCart listing repeats the phrase. They support the exact flour-qualified name, not Canadian distribution, stock, or a universal milling specification. [S02–S03] |
| `kangani atta`, `kangani aata`, `kangani flour`, `kangni atta` | Leave inactive in this packet. | These are not the exact selected phrase. Do not remove `ka`, change `atta` to `aata`, or substitute the `Kangni` spelling based on the selected evidence. |
| `hari kangni`, `hari kangani`, and qualified variants | Leave unassigned to foxtail. | Brown-top millet flour remains an unallocated candidate with unresolved Québec naming. A qualified brown-top product phrase must not be redirected to *Setaria italica*. [A3] |
| French wording | Keep `millet d'Italie / farine de millet d'Italie`; add no French alias. | OQLF supports `millet d'Italie` for *Setaria italica*. No reviewed Québec or Canadian French source establishes a Kangani-specific term. [reused A4] |
| New identity, form, grade, or process | Add none. | The source names map to the existing grain and milling-product rows. The reviewed product titles do not establish a new crop identity, uniform flour extraction, activation, polishing, or grind grade. |

## Live catalog, active plan, and exact ownership

The active A6 parent remains unchecked. R163 is recorded in the current plan, and its proposal and integration README were reviewed before this candidate was selected. The prior Kangni decision is relevant archive context, not an active owner for `Kangani` or `Kangani ka Atta`: its earlier inactive boundary was based on the product evidence then available. This proposal's new evidence is specific to the alternate grain spelling and the exact `Kangani ka Atta` phrase.

The current read-only snapshot contains **1,539 ingredient references**, **119 ingredient forms**, **61 legacy-import candidates**, and **1,884 research-ledger records**. The ledger contains **8,023 source entries** with **6,864 distinct source IDs**. The manifest lists **114 recipes**.

| Existing reference | Current name and aliases | Current numeric/form state |
|---|---|---|
| `ingredient-ref-foxtail-millet` | `foxtail millet / millet d'Italie`; EN aliases `thinai`, `kangni`, `korra`, `rala`, `navane`, `kakum`, `kakun`; no FR aliases | `GRAIN_AND_CEREAL`; no attached form; `defaultDensity: null`; `unitMappings: []`; ledger measurement and substitution states are `not_yet_researched`. |
| `ingredient-ref-foxtail-millet-flour` | `foxtail millet flour / farine de millet d'Italie`; EN aliases `thinai flour`, `kangni flour`, `korra flour`, `navane atta`, `kakum flour`; no FR aliases | `FLOUR_AND_STARCH`; no attached form; `defaultDensity: null`; `unitMappings: []`; ledger measurement state is `researched_supported`, and substitution state is `blocked_pending_evidence`. |

Exact normalized-key ownership was checked across reference IDs, English/French names and aliases; form IDs, labels, and match terms; legacy-candidate IDs, names, and aliases; and ledger record IDs. Normalization follows `IngredientSearch.kt`: lowercase, NFKD and accent folding, punctuation-to-space conversion, then whitespace collapse.

| Candidate key or ID | Current exact owner | Proposed disposition |
|---|---|---|
| `kangani` | None across references, forms, legacy candidates, and ledger record IDs. | Add to `ingredient-ref-foxtail-millet`. |
| `kangani ka atta` | None across references, forms, legacy candidates, and ledger record IDs. | Add to `ingredient-ref-foxtail-millet-flour`. |
| `kangani atta`, `kangani aata`, `kangani flour`, `kangni atta` | None as exact keys. | Leave unassigned. |
| `ingredient-ref-kangani`, `ingredient-ref-kangani-foxtail-millet-flour` | No current reference, legacy, or ledger-record owner. | Allocate no new ID. |
| `ingredient-ref-foxtail-millet`; `ingredient-ref-foxtail-millet-flour` | Existing target references and corresponding ledger records. | Retain both IDs and identities. |

The normalized terms appear in earlier review prose as inactive candidates, but no current exact name, alias, form, legacy row, or ledger `recordId` owns either proposed key.

## Exact picker projection

This static projection applies the phrase-first matching and substring fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) to current reference and attached-form terms, then appends only the two proposed aliases. Neither target has an attached form, so none of these queries creates a form hint.

| Query | Current picker | Projected picker | Effect |
|---|---|---|---|
| `kangani` | No result | Foxtail grain and foxtail flour | The grain alias and the word inside `kangani ka atta` preserve the two existing choices. |
| `kangani ka atta` | No result | Foxtail flour only | The exact qualified product phrase selects flour. |
| `kangani atta`; `kangani aata`; `kangani flour`; `kangni atta` | No result | No result | Unreviewed constructions remain inactive. |
| `hari kangani`; `hari kangni`; `hari kangni atta` | No result | No result | Brown-top terms remain unassigned and are not added to foxtail. |
| `kangni` | Foxtail grain and flour | Same | Existing spelling and grain/flour behavior remain unchanged. |
| `kangni flour` | Foxtail flour only | Same | Existing qualified alias remains unique. |
| `foxtail millet` | Foxtail grain and flour | Same | Existing shared source-grain query remains a two-choice result. |
| `foxtail millet flour` | Foxtail flour only | Same | Existing qualified name remains unique. |
| `millet d'Italie` | Foxtail grain and flour | Same | Existing French phrase behavior remains unchanged. |

## Bundled recipe demand

Every recipe path in the split-package manifest was scanned: **114 recipe files** and **1,123 ingredient rows**. The scan searched serialized recipe text and ingredient-row fields for `kangani`, `kangani ka atta`, `kangani atta`, `kangani aata`, `kangani flour`, `kangni`, `kangni flour`, `kangni atta`, `foxtail millet`, `foxtail millet flour`, *Setaria italica*, and both existing target reference IDs.

- Files containing a candidate phrase or target ID: **0 of 114**.
- Ingredient rows containing a candidate phrase or target ID: **0 of 1,123**.
- Direct links to `ingredient-ref-foxtail-millet` or `ingredient-ref-foxtail-millet-flour`: **0**.

The manifest-ordered recipe corpus is **753,928 bytes**, fingerprint **`0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`**. The fingerprint hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte in manifest order. No recipe text, quantity, link, or instruction is proposed.

## Measurements, forms, and substitutions

The spelling addition does not change the current numeric or form state:

- **Forms:** Neither target row has an attached form. Add none.
- **Active measurements:** Keep `defaultDensity: null` and `unitMappings: []` on both references.
- **Research-ledger measurements:** The foxtail-flour record contains laboratory bulk-density endpoints of **502.6 and 534.9 kg/m³** for tested samples over a moisture-dependent range. These observations belong to that study, not to Kangani flour as a retail product or a household volume conversion. The grain record has no supported measurement and remains `not_yet_researched`.
- **Conversions and yields:** Add none. No reusable mass-volume relation, package yield, milling yield, or cooking yield is established for these regional product names.
- **Substitutions:** Keep the existing flour substitution finding blocked. A 2023 study's selected **30%** foxtail-flour blend applies to one wheat bread-ready-mix formula; it is not a general replacement ratio. No active foxtail-flour rule was found in either substitution-rules file. The grain substitution state remains `not_yet_researched`.
- **Recipe links:** Add none because the full manifest scan found no matching demand.

## Source-ID and URL ownership audit

The proposed source-ID prefix `WP02-A6-KANGANI-FOXTAIL-ALIAS-R164-20261016` has no match in the live ledger or proposal/batch archive. The two new URLs below are also absent from the ledger and archive; if this proposal is integrated, register them once on the relevant existing ledger records. No new reference, form, measurement-observation, substitution-finding, or recipe-link ID is proposed.

| ID | Source | Evidence and limits |
|---|---|---|
| **S01 — `WP02-A6-KANGANI-FOXTAIL-ALIAS-R164-20261016-S01`** | Bharat Vedica, [Organic Foxtail Millet Flour](https://bharatvedica.com/products/organic-foxtail-millet-flour), current product name and description; checked 2026-10-16. | Titles a current flour product `Organic Foxtail Millet Flour - Organic kangani ka Atta`. The page is an India-origin maker listing with INR prices; it supports the exact phrase and product category, not Canadian availability, a Québec name, or household measurements. Its product claims are not adopted. |
| **S02 — `WP02-A6-KANGANI-FOXTAIL-ALIAS-R164-20261016-S02`** | DistaCart, [Bharat Vedica Organic Foxtail Millet Flour — Organic Kangani ka Atta](https://www.distacart.com/collections/flours/products/organic-foxtail-millet-flour), search-indexed current listing checked 2026-10-16. | Repeats the exact phrase and has Canada in its country selector. The indexed page shows USD pricing and contradictory variant availability; direct retrieval returned a cache miss. Use only as international marketplace wording corroboration. Do not claim Canadian stock, Canadian manufacture, current delivery, or package measures. |
| **Reused `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06`** | ICAR–Indian Institute of Millets Research, [Foxtail millet leaflet](https://www.millets.res.in/farmer/2025/Millets_chalisa/English/7Millets_chalisa_foxtail_millet.pdf), 2025, p. 1. | The live PDF identifies *Setaria italica* and lists `Kangani (Punjabi)`. The source ID and URL are already on both target ledger records; reuse them and extend the support description if integrated. It is regional crop terminology, not flour naming or Canadian retail evidence. |
| **Reused `WP03-FOXTAIL-NAVANE-20261013-S01`** | Singal's Indian Grocery Delivery, [Organic Foxtail Millet Thinai Kangani](https://www.singals.ca/products/manna-foxtail-millet-thinai-kangani-500-gm), current grain listing. | Canadian retailer wording pairs `Foxtail Millet` with `Kangani` and says it ships across Canada. The existing source entry is on the foxtail-grain record; reuse its ID and URL, extending its support description if integrated. The package amount and shipping copy are not measurements or a guarantee of fulfillment. |
| **Reused `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01`** | ICAR–IIMR, [Millets Information](https://www.millets.res.in/millets_info.php), live common-name table; page footer updated 2026-07-07. | The current table uses `Kangni` for Punjabi and pairs it with Foxtail Millet. This is not the spelling selected for R164. The source is already registered on both target records; use it to state the source-level spelling difference, not to replace the 2025 leaflet's `Kangani` wording. |
| **Reused `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S04`** | Office québécois de la langue française, [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), GDT. | Supports the existing Québec grain term `millet d'Italie` for *Setaria italica*. It does not establish a French Kangani alias or a flour-specific ruling. Reuse the existing source ID and URL. |
| **Reused `WP03-LITTLE-MILLET-20261010-S01`** | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §2.4.6(2), PDF p. 17. | Lists `Foxtail Millet (Kangni or Kakun) — Setaria italica`, not `Kangani`. This supports the current crop/species boundary only; it is not the selected spelling or a flour product source. Reuse the existing source ID rather than registering the standard URL again. |

## Disposition

**Add** `kangani` to `ingredient-ref-foxtail-millet` and `kangani ka atta` to `ingredient-ref-foxtail-millet-flour`. Reuse the existing institutional, Canadian grain, and Québec terminology source entries; register only the two new flour-listing sources if integrated. Keep the exact term family bounded as described above. Preserve the existing displays, forms, measurements, conversions, recipe links, and blocked substitution research. Section 04 A6 remains open.
