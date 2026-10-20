# WP02 Section 04 A6 R163 — Kakum foxtail millet grain and flour aliases

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. This file changes no shared catalog, ledger, recipe, generated index, plan, roadmap, or integration README.
- **Open checklist:** The A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Scope:** Reconsider the uncovered regional name `Kakum` for the existing foxtail millet grain and flour references. Do not create a new ingredient identity.
- **Testing rule:** No app, unit, instrumentation, emulator, deployment, or build tests were run. This is a proposal-only catalog review; the current `AGENTS.md` rule also exempts changes limited to adding database JSON data from tests.

## Recommendation

Add the English alias **`kakum`** to the existing `ingredient-ref-foxtail-millet` grain row, **`kakun`** as a second grain spelling, and **`kakum flour`** to the existing `ingredient-ref-foxtail-millet-flour` row. Keep the displays `foxtail millet / millet d'Italie` and `foxtail millet flour / farine de millet d'Italie`, with no French aliases.

ICAR–Indian Institute of Millets Research (IIMR) identifies foxtail millet as *Setaria italica* and lists `Kakum (Hindi)` as a source-grain name. FSSAI's current cereal standard lists `Foxtail Millet (Kangni or Kakun) — Setaria italica`, supporting the alternate `Kakun` spelling. A Canada-facing Silkrute flour listing names a foxtail millet flour product and includes `Kakum` among its regional name list. These sources support aliases on the two existing references, not a separate Kakum identity, a milling grade, or a French product name.

The grain/flour pairing preserves the picker boundary: a bare `kakum` query will show both the grain and the flour; `kakum flour` will select the flour. Do not add bare `kakum` to both references because that would duplicate an exact alias key. Do not add `kakun flour`, `kakum atta`, `kakum mavu`, or French `farine de Kakum`; the reviewed sources do not support those exact qualified product names.

## Proposed alias delta

Append only these aliases and preserve all other fields on both rows:

~~~json
{
  "ingredient-ref-foxtail-millet": {
    "aliasesEn": ["thinai", "kangni", "korra", "rala", "navane", "kakum", "kakun"]
  },
  "ingredient-ref-foxtail-millet-flour": {
    "aliasesEn": ["thinai flour", "kangni flour", "korra flour", "navane atta", "kakum flour"]
  }
}
~~~

Add no new reference or legacy candidate. Keep the French displays and empty French alias arrays. Add no forms, density, unit mappings, measurement observations, conversions, yields, recipe links, or substitution rules.

## Identity and product boundary

| Wording or field | Recommendation | Evidence boundary |
|---|---|---|
| `kakum` | Add to the existing foxtail-millet grain row. | IIMR places Hindi `Kakum` under Foxtail Millet; the row remains the generic source-grain identity, not a regional cultivar or preparation. [existing sources A1–A2] |
| `kakun` | Add to the same grain row. | FSSAI's cereal standard gives `Kakun` as an alternate Foxtail Millet name and explicitly maps the crop to *Setaria italica*. [existing source A3] |
| `kakum flour` | Add to the existing foxtail-millet flour row. | The Canada-facing marketplace listing is a foxtail-millet-flour product whose alternate-name string includes `Kakum`; this supports the source-grain-qualified flour search term, not a universal milling specification. [existing source A4] |
| `kakun flour`, `kakum atta`, `kakum mavu`, `kakum` on the flour row | Leave inactive. | No reviewed Canadian-facing flour listing uses these exact qualified terms. The paired `kakum` grain and `kakum flour` alias already make the bare `kakum` query show both existing products. |
| French wording | Keep `millet d'Italie` and `farine de millet d'Italie`; add no French alias. | The reviewed sources do not establish a Québec French product label for Kakum or a French compound flour name. |
| New reference, form, or process identity | Add none. | Kakum and Kakun are regional names for the current foxtail-millet grain identity; flour remains the existing milling-product identity. Do not infer a polished/unpolished state, cultivar, or process from a regional name. |

## Live catalog, archive, exact-key, and source-ID audit

The read-only snapshot contains **1,538 ingredient references, 119 forms, 61 legacy-import candidates, and 1,883 research-ledger records**. The ledger has **8,016 source entries and 6,859 distinct source IDs**. The live rows are:

- `ingredient-ref-foxtail-millet` — `foxtail millet / millet d'Italie`, aliases `thinai`, `kangni`, `korra`, `rala`, and `navane`.
- `ingredient-ref-foxtail-millet-flour` — `foxtail millet flour / farine de millet d'Italie`, aliases `thinai flour`, `kangni flour`, `korra flour`, and `navane atta`.

Neither row has attached forms. Both have `defaultDensity: null` and empty `unitMappings`.

Exact normalized-key ownership was checked across reference names and aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs, using the lowercase, NFKD/accent-folding, punctuation, and whitespace rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Candidate phrase or ID | Current exact owner | Disposition |
|---|---|---|
| `kakum`, `kakun`, `kakum flour`, `kakun flour`, `kakum atta`, `kakun atta` | None in active references, forms, legacy candidates, or ledger record IDs. | Propose only `kakum` and `kakun` on the grain row and `kakum flour` on the flour row. |
| `ingredient-ref-kakum-foxtail-millet` / `ingredient-ref-kakum-flour` | No such active or ledger ID. | No new ID is proposed. |
| `foxtail millet`, `millet d'Italie` | `ingredient-ref-foxtail-millet` | Keep unchanged. |
| `foxtail millet flour`, `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Keep unchanged. |

The A6 plan has no Kakum allocation. The focused [Thinai flour review](wp02-a6-thinai-foxtail-millet-flour-alias-review-20261013.md) listed `kakum flour` among terms left inactive because that review had not established a Canadian-facing product pairing for its Thinai scope. It did not allocate or create a separate Kakum hold. The [Korra flour review](wp02-a6-korra-foxtail-millet-flour-alias-review-20261013.md) uses the same Canada-facing Silkrute foxtail-flour listing for `korra flour`, but its bounded recommendation did not decide Kakum. R163 reviews that distinct spelling against the live institutional crosswalk and the product's full alternate-name string.

**No new source IDs are proposed.** The evidence reuses source IDs already present in the ledger, attached to the corresponding foxtail rows or to a related millet candidate:

| Reused source ID | Existing ledger owner(s) | Reuse boundary |
|---|---|---|
| `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01` | Foxtail grain, foxtail flour, and pearl millet | Same live IIMR names page; its Foxtail Millet row lists Hindi `Kakum`. If the decision is integrated, extend the existing foxtail-row locator/support text without changing the source ID. Leave the separate pearl-millet entry scoped to its own row. |
| `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06` | Foxtail grain and foxtail flour | Same IIMR 2025 leaflet; it names *Setaria italica* and includes `Kakum (Hindi)`. Reuse the current source ID. |
| `WP03-LITTLE-MILLET-20261010-S01` | `candidate-little-millet` and `candidate-little-millet-flour` | Same FSSAI Version 4 cereal standard; §2.4.6 lists Foxtail Millet (Kangni or Kakun) — *Setaria italica*. Reuse the existing source ID across the relevant grain record if integrated; do not create a duplicate source entry solely for the same PDF. |
| `WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S03` | Foxtail flour | Same Canada-facing Silkrute listing, whose title's regional-name string includes `Kakum`. Reuse the source ID and extend its support text to describe the Kakum wording if integrated. The direct page fetch returned a cache miss in this review; use the current indexed listing for naming only, not stock or package claims. |

The proposed R163 source-ID prefix `WP02-A6-FOXTAIL-KAKUM-ALIASES-R163-20261016` has no matches in the ledger or proposal/batch archive. No new observation, finding, measurement, or substitution ID is proposed.

## Exact picker projection

The projection reproduces the phrase-first word matching and substring fallback in `IngredientSearch.kt` over current reference and form terms, then applies only the proposed aliases. It is a static data audit, not a runtime picker test.

| Query | Current result | Projected result | Effect |
|---|---|---|---|
| `kakum` | None | Foxtail-millet grain and foxtail-millet flour | The qualified flour alias contains the bare grain name, so both existing choices appear. |
| `kakum flour` | None | Foxtail-millet flour only | The specific query selects the flour row. |
| `kakun` | None | Foxtail-millet grain only | The FSSAI spelling is a grain alias; no `kakun flour` term is introduced. |
| `kakun flour`; `kakum atta`; `kakum mavu` | None | None | Unreviewed qualified constructions remain inactive. |
| `foxtail millet` | Foxtail-millet grain and flour | Same | Existing shared source-grain phrase remains a two-choice search. |
| `foxtail millet flour` | Foxtail-millet flour | Same | Existing qualified phrase remains unique. |
| `millet d'Italie`; `navane` | Foxtail-millet grain and flour | Same | Existing bilingual and alias behavior remains unchanged. |
| `millet flour` | Six generic/species-specific millet-flour rows | Same six | The broad flour query remains a multiple-choice search. |

## Bundled recipe demand

Every path in the seed manifest was scanned: **114 recipe files and 1,123 ingredient rows**. The scan searched serialized recipe text and ingredient-row fields for `kakum`, `kakun`, `kakum flour`, `kakun flour`, `kakum atta`, `kakun atta`, `foxtail millet`, `foxtail millet flour`, *Setaria italica*, and both existing target reference IDs.

- Recipe files containing a candidate phrase or target ID: **0 of 114**.
- Ingredient rows containing a candidate phrase or target ID: **0 of 1,123**.
- Direct links to `ingredient-ref-foxtail-millet` or `ingredient-ref-foxtail-millet-flour`: **0**.

The manifest-ordered recipe corpus is **753,928 bytes**, fingerprint **`0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`**. The fingerprint hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte in manifest order. No recipe text, amount, link, or instruction is proposed.

## Measurement, forms, conversions, yields, and substitutions

No candidate-specific numeric or runtime behavior is supported or proposed. The alias addition does not change the current grain/flour data:

- **Forms:** Neither target row has an attached form. Add none; these names describe the source grain and a separately catalogued flour product.
- **Active measurements:** Keep `defaultDensity: null` and `unitMappings: []` on both rows.
- **Research-ledger measurements:** The foxtail-flour record contains two study-specific bulk-density endpoints, **502.6–534.9 kg/m³** (0.5026–0.5349 g/mL), measured across samples with moisture from 11.11% to 42.86% dry basis. These are not household volume measures or a retail Kakum-flour default. Generic millet-flour serving values do not identify foxtail millet and remain unassigned.
- **Conversions and yields:** Add none. No Kakum-specific mass-volume relation, package yield, milling yield, or cooking yield is supported.
- **Substitutions:** Keep the existing foxtail-flour finding blocked. A 2023 study tested 0%, 10%, 20%, 30%, and 40% foxtail flour in one bread-ready-mix formula and selected 30% only within that experiment. It is not a general replacement ratio. Add no global, contextual, or recipe-line substitution.
- **Recipe links:** Add none because no bundled-recipe demand was found.

The grain row's measurement and substitution states remain `not_yet_researched`; the flour row keeps `researched_supported` measurements and `blocked_pending_evidence` substitution research.

## Source register

All links below are direct sources. IDs are existing ledger IDs and are reused without reallocation.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| **`WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01`** | ICAR–Indian Institute of Millets Research, [Millets Information: common names in Indian languages](https://www.millets.res.in/millets_info.php), Foxtail Millet row; page footer says updated 2026-07-07. | Lists Hindi `Kakum` under Foxtail Millet. This is an institutional grain-name crosswalk, not a flour grade or Canadian terminology ruling. |
| **`WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06`** | ICAR–Indian Institute of Millets Research, [Foxtail millet leaflet](https://www.millets.res.in/farmer/2025/Millets_chalisa/English/7Millets_chalisa_foxtail_millet.pdf), 2025, p. 1. | Identifies foxtail millet as *Setaria italica* and lists `Kakum (Hindi)` among its common names. It does not establish a Canadian flour label or household measure. |
| **`WP03-LITTLE-MILLET-20261010-S01`** | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §2.4.6(2), PDF p. 17. | Lists `Foxtail Millet (Kangni or Kakun) — Setaria italica` under whole or dehulled millets. Supports the Kakun grain spelling and species, not the Kakun flour wording or a recipe measurement. |
| **`WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S03`** | Silkrute Canada, [B&B Organics Foxtail Millet Flour (500 g)](https://www.silkrute.ca/grocery/cooking/flour/product-130613/), product title, alternate-name string, and ingredient declaration; existing listing was accessed 2026-10-13 and rechecked by current search index 2026-10-16. | Canada-facing marketplace title identifies a foxtail-millet flour product and includes `Kakum` among regional names. The product is Indian-origin and the seller is a marketplace, not a Canadian mill or Québec terminology authority. Direct retrieval returned a cache miss during this review; no current stock, package-measure, processing, or quality claim is used. |
| Reviewed, not used as ledger evidence | Walmart Canada, [Rani Foxtail Millet Polished (Setaria italica), 800 g](https://www.walmart.ca/en/ip/Rani-Foxtail-Millet-Polished-Setaria-italica-Ancient-Grains-800g-28oz-All-Natural-Gluten-Friendly-NON-GMO-Kosher-Vegan-Indian-Origin-Kangi-Kakum-Nava/0TC5XRJKVR60), title and structured ingredient field; accessed 2026-10-16. | The title includes `Kakum` and the ingredient field identifies foxtail millet (*Setaria italica*), but the listing was out of stock. Its free-text description contains a conflicting *Paspalum scrobiculatum* claim, so that text is excluded; the page is only a secondary spelling cross-check. |

## Disposition

**Proposal:** Integrate `kakum` and `kakun` on `ingredient-ref-foxtail-millet` and `kakum flour` on `ingredient-ref-foxtail-millet-flour`. Reuse the existing source IDs and extend their evidence descriptions in place if needed. Leave French wording, forms, numeric behavior, recipe links, and substitutions unchanged. WP02 Section 04 A6 remains open.
