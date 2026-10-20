# WP05 Section W R947 generic kimchi-type gap review: baek-kimchi

- **Reviewed:** 2026-10-19.
- **Packet type:** Integrated identity and boundary review; see the [R945–R947 integration README](../batches/wp02-wp03-wp05-r945-r947-generic-gap-integration-20261019/README.md).
- **Scope:** One generic named Korean kimchi type, baek-kimchi. Brand, product-line, flavour-family, SKU, and retailer-variant rosters are out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their scoped evidence remain untouched.
- **Plan anchor:** Open Section W item “Gochujang, doenjang, ssamjang, chunjang, ganjang, gochugaru, named kimchi types, fermented shrimp, and other jeotgal” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10317).
- **Recommendation:** Add one identity-only `baek-kimchi` reference in `SAUCE_AND_CONDIMENT`, with source-attested English aliases `white kimchi` and `baekkimchi`, and use the borrowed name `baek-kimchi` provisionally in fr-CA. Add no forms, numeric data, recipe links, conversions, yields, or substitutions.

## Current ownership and open-work audit

The open Section W checklist leaves named kimchi types for separate identity review. The integrated R944 `dongchimi` review also names baek-kimchi as a different type and explicitly does not claim it as a dongchimi alias. Earlier Section W reviews retained named kimchi types outside the generic `kimchi` row. Baek-kimchi is therefore a distinct open identity candidate, not a spelling gap on another entry.

At the audit snapshot, the live seed contains **1,964 ingredient references and 205 forms**; the legacy-import file contains **55 candidates** and the research ledger **2,369 records**. Exact and punctuation/case-folded searches for `baek-kimchi`, `baekkimchi`, `baek kimchi`, `white kimchi`, `white cabbage kimchi`, and `백김치` found no owner in active references, forms, legacy candidates, or ledger records. No prior proposal or batch specifically assigns this identity; the only recent occurrence is the R944 boundary note that keeps it distinct from dongchimi. The proposed `ingredient-ref-baek-kimchi` ID is unowned.

The nearest active identities are:

| Existing owner | Current scope | Boundary for this proposal |
|---|---|---|
| `ingredient-ref-kimchi` — `kimchi / kimchi`, with OQLF-backed spelling aliases | Generic Korean preparation of seasoned, fermented vegetables. | Keep as the parent concept; do not add baek-kimchi as a spelling alias or replace its generic scope. |
| `ingredient-ref-kkakdugi` — `kkakdugi / kkakdugi` | Named diced-radish kimchi type. | Keep separate; baek-kimchi is not a radish-cutting alias or form. |
| `ingredient-ref-dongchimi` — `dongchimi / dongchimi`, with `radish water kimchi` | Named radish-and-brine kimchi type. | Keep separate; do not use `white kimchi` as a dongchimi or water-kimchi alias. |
| `ingredient-ref-pickled-radish` — `pickled radish / radis mariné` | Generic prepared radish identity. | Keep separate; do not map baek-kimchi to pickled radish. |

## Exact recipe-demand check

All **114** manifest-listed bundled recipes and **1,123** ingredient rows were scanned, including full recipe JSON text and ingredient objects. There were no matches for `baek-kimchi`, `baekkimchi`, `baek kimchi`, `white kimchi`, `white cabbage kimchi`, or `백김치`. No recipe link, recipe-driven measure, or substitution is proposed.

## Identity and naming recommendation

The Korea Tourism Organization’s official culinary entry is titled “White Kimchi (백김치 / Baekkimchi)” and describes it as a white-cabbage kimchi type. This supports a generic named identity and the English display gloss, distinct from unqualified kimchi. The page also describes one preparation’s filling and liquid; those details are source-scoped and are not proposed as a fixed formula, required ingredients, or catalog forms. [S01]

Use `baek-kimchi` as the English display and the same borrowed spelling provisionally in fr-CA. The Korean Tourism Organization’s fused spelling `Baekkimchi` supports the `baekkimchi` English search alias; its English title supports `white kimchi`. No OQLF subtype entry was found in the targeted terminology search. The OQLF entry for generic `kimchi` supports the borrowed parent term and its own spelling variants, but does not standardize the subtype or authorize a French descriptive alias. Do not add `kimchi blanc`, `kimchi non épicé`, or other French descriptions as global aliases. [S01–S02]

Keep baek-kimchi distinct from generic kimchi, kkakdugi, and dongchimi. The official culinary page’s no-red-chili description helps identify the named type, but does not establish a universal ingredient list, heat rating, or recipe. Do not treat it as a form of generic kimchi or as a substitute for another kimchi type. No global or contextual substitution is proposed.

## Proposed data and ledger states

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-baek-kimchi` |
| `nameEn` | `baek-kimchi` |
| `nameFr` | `baek-kimchi` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `white kimchi`; `baekkimchi` |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measurements, conversions, yields, substitutions | None |

The ledger row uses `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. The identity and English gloss are source-backed; the borrowed French display remains provisional. No brand-specific evidence or measurement is transferred. Any product-only roster task remains out of scope because commercial-product counts do not add ingredient diversity.

## Source register

Sources were reviewed online on 2026-10-19. Claims are paraphrased; product or recipe particulars are not promoted to catalog defaults.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-BAEK-KIMCHI-R947-20261019-S01` | Korea Tourism Organization, [White Kimchi (백김치 / Baekkimchi)](https://english.visitkorea.or.kr/svc/contents/contentsView.do?vcontsId=179874). | Official Korean culinary entry directly pairs the English name and Korean name/romanization and identifies it as white cabbage kimchi. Its described ingredient filling and broth/juice are source-specific; this page is not a universal formulation standard or a Québec terminology ruling. |
| **Reused `WP05-EAST-S06`** | Office québécois de la langue française, [kimchi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi). | Defines generic kimchi and lists its French and English spellings. It does not name baek-kimchi; the borrowed fr-CA subtype display is provisional and no French subtype alias is inferred. |

**Disposition:** Integrated one generic identity-only `baek-kimchi` reference and left the wider Section W named-kimchi checklist open. No commercial-product roster was pursued. No software tests were run because the catalog change only adds database JSON under `AGENTS.md`; static validation is recorded in the integration README.
