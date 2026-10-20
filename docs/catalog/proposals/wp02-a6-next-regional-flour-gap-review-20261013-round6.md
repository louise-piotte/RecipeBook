# WP02 A6 Round 6: Chaulai amaranth flour and name boundary

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated by root on 2026-10-13; see the [round-six integration](../batches/wp02-wp03-wp04-round6-gap-review-integration-20261013/README.md). The proposal-only reviewer changed no shared files.
- **Owner:** WP02 A6 regional-grain-flour review; root coordinator owns any shared-data integration.
- **Scope:** Resolve the still-open English flour wording `chaulai atta` / `chaulai aata` and distribute the unqualified name `chaulai` across the existing amaranth grain, amaranth flour, and amaranth greens identities. This is a naming and picker-boundary review, not a new ingredient identity.
- **Plan/archive:** The active [WP02 A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278) remains open. The A6 proposal and batch archive has no earlier Chaulai alias, identity, picker-boundary, density, or substitution decision. Chaulai appears in the integrated Rajgira review only as part of FSSAI's `Amaranthus (Chaulai or Rajgira)` grain cross-reference; that review added `rajgira flour` and `rajgira atta` only. No archived decision allocates Chaulai to an active row.
- **Recommendation:** Integrate the exact phrases in the table below on existing rows. Do not create a Chaulai flour row or a French Chaulai term. Preserve the intentional three-result bare `chaulai` picker result.
- **Proposal-local source IDs:** `WP02-A6-CHAULAI-ALIAS-20261013-R6-S01` through `S03`. Each was checked against the current ledger and proposal/batch archive and was absent. Reused source IDs are identified below.

## Root integration decision

The proposal recommended activating all three Chaulai senses, but root held every Chaulai alias after the static package validator rejected duplicate exact ownership of `chaulai` on the grain and greens rows. Under the current phrase-first picker, adding only the qualified flour aliases would also make bare `chaulai` return flour as a misleading singleton. The relevant sources and unresolved decisions are recorded on the existing grain, greens, and flour ledger rows; the manufacturer’s approximately 40–50 g starting range remains as a product-specific portion observation. No Chaulai alias or reference was added. See the [round-six integration](../batches/wp02-wp03-wp04-round6-gap-review-integration-20261013/README.md).

## Decision and exact ownership

The sources support three related but distinct matches. FSSAI's current standard names `Amaranthus (Chaulai or Rajgira)` for whole or dehulled pseudo-millet grain and lists three Amaranthus species. A Canadian-facing flour listing titles the product `Just Organik Amaranth Flour (Chaulai Aata)`, while the manufacturer's page uses the same product wording. A separate Canadian produce page names `Chaulai` as a name for amaranth leaves. The term therefore must not route a bare query to a single flour result.

| Normalized phrase | Exact proposed owner and field | Disposition and evidence boundary |
|---|---|---|
| `chaulai atta` | Add to `aliasesEn` on `ingredient-ref-amaranth-flour` (`amaranth flour / farine d'amarante`). | Accept the exact flour-qualified regional spelling. It is supported by a current Canadian-facing listing and product naming for Just Organik amaranth flour. Do not generalize to bare `atta`. |
| `chaulai aata` | Add to `aliasesEn` on `ingredient-ref-amaranth-flour`. | Accept the exact spelling used in the Canadian storefront listing and the manufacturer's product title. Keep it on the same generic amaranth-flour identity; the source does not establish a distinct species, extraction, or milling grade. |
| `chaulai` | Add to `aliasesEn` on both `ingredient-ref-amaranth-grain` (`amaranth / amarante`) and `ingredient-ref-amaranth-greens` (`amaranth greens / feuilles d'amarante`). | Accept as a shared search name. The current FSSAI whole/dehulled-foodgrain standard supports the grain use; a Canadian retailer's product title directly uses the name for leafy amaranth. Phrase matching will also surface flour because the proposed qualified flour aliases contain this word. The picker must present all three current identities. |
| `chaulai flour`, `chaulai ka atta`, `chaulai leaves`, `chaulai greens`, `farine de chaulai` | No owner proposed. | These exact phrases were not established by the reviewed Canadian listing or a Québec French source. The Canadian flour listing says `Chaulai Aata`; it does not title the product `Chaulai Flour`. The leaf listing names `Chaulai` but does not use the qualified English phrases above. |
| `ingredient-ref-chaulai-flour` | No new reference ID. | The name resolves to the existing generic amaranth-flour row. This proposed ID was checked and is unused. |

Retain all three current display pairs, categories, and existing aliases. Add no French alias, form, legacy candidate, recipe link, active density, unit mapping, conversion, yield, or substitution rule. Do not change the existing `rajgira flour` / `rajgira atta` aliases or their prior boundary decisions.

## Current ownership and picker projection

The static projection applies the current `IngredientSearch.kt` rules: lowercase with Unicode NFKD, fold the supported ligatures, remove combining accents, replace punctuation with spaces, then prefer complete normalized word-phrase matches before falling back to substring matches. Each target reference has no attached form. Exact ownership was checked over reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs.

| Query / normalized key | Current picker result | Projected picker result after proposed aliases |
|---|---|---|
| `chaulai` | No result | `ingredient-ref-amaranth-grain`, `ingredient-ref-amaranth-greens`, and `ingredient-ref-amaranth-flour` |
| `chaulai atta` | No result | `ingredient-ref-amaranth-flour` only |
| `chaulai aata` | No result | `ingredient-ref-amaranth-flour` only |
| `chaulai flour` | No result | No result |
| `chaulai ka atta` | No result | No result |
| `chaulai leaves` / `chaulai greens` | No result | No result |
| `farine de chaulai` | No result | No result |
| `rajgira flour` / `rajgira atta` | `ingredient-ref-amaranth-flour` | Same result; unchanged |
| `amaranth flour` / `farine d'amarante` | Generic and sprouted amaranth-flour rows | Same two rows; unchanged |

The proposed bare `chaulai` result is intentionally ambiguous by ingredient part, but it is explicit and honest: grain, leafy vegetable, and flour are distinct choices. The qualified aliases select flour alone. The flour row does **not** receive the bare alias `chaulai`; it appears in the bare search only because the current matcher finds `chaulai` within `chaulai atta` and `chaulai aata`.

Before the proposal, no exact normalized key among `chaulai`, `chaulai atta`, `chaulai aata`, `chaulai flour`, `chaulai leaves`, `chaulai greens`, `chaulai ka atta`, or `farine de chaulai` was owned by an active reference, form, legacy candidate, or ledger record ID. No target form is attached to any of the three references. The string's occurrence in the existing FSSAI source description is research text, not an active search-term owner.

## French wording and identity boundaries

Keep the existing Québec displays `amarante`, `farine d'amarante`, and `feuilles d'amarante`. OQLF's existing `amarante` source (`WP02-S28`) says the small seeds may be reduced to flour and supports the established Québec name. The reviewed Canadian and Indian product sources are evidence for English search aliases, not Québec French terms. Add no `farine de chaulai`, change no French display, and do not convert Chaulai into an Amaranthus species-level identity. FSSAI's scope covers multiple species; the active grain, flour, and greens rows remain generic.

The grain/greens split is supported by different source scopes. FSSAI's standard applies the Chaulai grain name to whole or dehulled amaranth foodgrain, while the Canadian ClickstoCart listing explicitly titles and describes a leafy amaranth vegetable as `Chaulai`. Neither source makes grain and greens the same ingredient part. The name is a picker alias on each relevant existing identity, not evidence for a form conversion.

## Measurement, density, and substitution evidence

The current flour reference has `defaultDensity: null`, `unitMappings: []`, no forms, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Keep those active fields and states unchanged.

The current Just Organik product page says approximately **40–50 g** is a practical starting amount for one person preparing roti, cheela, porridge, or another flour-based dish [S01]. This is a source-specific serving suggestion, not a recipe quantity with a stated volume, standardized portion, or weighing method. If this proposal is integrated, record it only as the following source-scoped ledger observation on `ingredient-ref-amaranth-flour`; do not turn it into a cup conversion or active unit mapping:

```json
{
  "observationId": "amaranth-flour-just-organik-chaulai-single-serving-range-20261013",
  "relationship": "portion_weight",
  "valueIntervals": [
    {
      "lowerValue": 40,
      "upperValue": 50,
      "unit": "g",
      "lowerInclusive": true,
      "upperInclusive": true,
      "intervalKind": "source_reported_range",
      "origin": "source_reported",
      "reportedText": "Approximately 40–50 g as a practical starting quantity for one person."
    }
  ],
  "foodDescription": "Just Organik amaranth flour (Chaulai Aata), source-suggested one-person starting quantity",
  "measurementMethod": "Manufacturer website usage guidance; no measured recipe amount or kitchen volume is provided.",
  "quantityBasis": "One-person practical starting quantity for roti, cheela, porridge, or another flour-based dish; not a standardized serving, volumetric conversion, or recipe yield.",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP02-A6-CHAULAI-ALIAS-20261013-R6-S01"]
}
```

The 500 g product/package amount in S01 is package mass, not a household measure. The previously reviewed amaranth-flour paper reports bulk-density values spanning 0.35–0.76 g/mL across particle-size fractions; those are study-specific measurements with significant fraction differences, not a density for the unspecified Chaulai product [existing `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S07`]. Keep the runtime density null. No reviewed source gives a Chaulai or generic amaranth-flour cup-to-mass conversion suitable for the catalog.

Just Organik lists uses but gives no flour-replacement ratio. The existing Canadian Ambrosia source presents an unclear 1:3 replacement instruction, and the cited paper reports controlled formulation experiments; neither supports a universal, directionally clear substitution rule [existing `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S07` and `S08`]. Retain the existing no-supported-substitute finding `amaranth-flour-no-supported-substitute-20261012`; do not add a new finding or active substitute. Do not infer any grain-to-flour conversion, baking equivalence, form rule, or recipe-line link.

## Source and finding ID collision audit

The three new source IDs below were checked for exact collision in all live ledger source entries and the proposal/batch archive; none was found. Existing sources are reused by their existing IDs; no duplicate source IDs or new identity IDs are proposed.

| Source ID | Source and scope |
|---|---|
| **WP02-A6-CHAULAI-ALIAS-20261013-R6-S01** | Just Organik, [Amaranth Flour (Chaulai Aata)](https://www.justorganik.com/products/amaranth-flour-chaulai-aata). Current indexed manufacturer page (indexed about three weeks before review) uses the exact flour title, identifies amaranth as the product, describes its source as Uttarakhand amaranth and stone-grinding, and gives the 40–50 g one-person practical starting amount. Direct page retrieval returned a cache miss, so this review does not claim current stock. Package weight and usage text do not establish a household volume measure. |
| **WP02-A6-CHAULAI-ALIAS-20261013-R6-S02** | Indiangoods, [Atta collection](https://www.indiangoods.shop/en-ca/collections/atta). Canadian-facing `/en-ca` storefront snapshot, indexed four days before review, lists `Just Organik Amaranth Flour (Chaulai Aata)` with amaranth flour as the key ingredient and a CAD price. Direct retrieval returned a cache miss; the snapshot supports local-facing wording only, not stock or Canadian manufacture. |
| **WP02-A6-CHAULAI-ALIAS-20261013-R6-S03** | ClickstoCart Inc., [Amaranth leaves, Mulai Keerai, Totakura, Cheera, Chaulai](https://clickstocart.ca/products/amaranth-leaves). Canadian product page checked 2026-10-13. The page title and description associate `Chaulai` with amaranth leaves/green vegetable; the page showed sold out. It supports Canadian naming, not present availability or a flour identity. |
| Existing `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S05` | FSSAI, [Chapter 2.4: Cereals and Cereal Products, Version 4 (2025-05-07)](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), §2.4.23. Applies to whole or dehulled millets and lists `Amaranthus (Chaulai or Rajgira)` with *A. caudatus*, *A. cruentus*, and *A. hypochondriacus*. Reuse this existing source ID; it supports grain-name and species-scope context, not a Canadian flour standard. |
| Existing `WP02-S28` | OQLF, [amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante). Reuse to retain the Québec French display and exclude an unsupported French Chaulai alias. |
| Existing `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S07` and `S08` | Coțovanu and Mironeasa's amaranth-flour fraction study and Ambrosia's generic Canadian amaranth-flour page. Reuse the prior source records for the bounded density and substitution conclusions; they are not Chaulai-specific product specifications. |

The proposed observation ID `amaranth-flour-just-organik-chaulai-single-serving-range-20261013` was checked against all 338 current ledger observation IDs and the proposal/batch archive; it is unused. No new substitution finding ID is proposed. The existing `amaranth-flour-no-supported-substitute-20261012` remains the only finding on the flour row and is unchanged. There are 190 distinct current finding IDs. `ingredient-ref-chaulai-flour` is absent from references, forms, legacy candidates, and ledger record IDs; no such ID is recommended.

## Recipe demand and baseline snapshot

The full manifest-listed recipe corpus was scanned in manifest order. The scan covered all recipe JSON text, ingredient-row `originalText`, `ingredientName`, `ingredientRefId`, and `ingredientFormId`, and direct links to each of the three target references.

- **Recipes / ingredient rows:** 114 files / 1,123 rows.
- **Files or ingredient rows containing a Chaulai candidate phrase:** 0.
- **Direct ingredient links to amaranth grain, amaranth flour, or amaranth greens:** 0.
- The alias recommendation comes from current/regional naming evidence; no recipe, amount, or instruction is being inferred or edited.

This is the baseline read on 2026-10-13; hashes cover exact file bytes. The recipe fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, its exact file bytes, and a final NUL byte.

| Store | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,339 | `0c82c3f233e7d4056a39a38cf637062dac7efa2ae3cae3953e32cac96beb5021` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,647 records; 6,265 source entries; 5,266 distinct source IDs; 338 observations; 190 findings; 8 unit conversions | `36a911dc6f79532bf3748c30fd03fde84f2c1ed35c420dab32ef18d68af382cf` |
| Seed manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Reviewed proposal delta and root integration outcome

1. Keep all proposed Chaulai aliases inactive. The validator and picker cannot currently preserve the distinct grain, greens, and flour meanings safely.
2. Add the proposal-local source evidence to the applicable existing grain, greens, and flour ledger records and record unresolved name-allocation decisions. Reuse the existing FSSAI and OQLF sources.
3. Retain the single source-specific 40–50 g one-person starting range as a product-specific portion observation. Keep default density null, mappings empty, measurement state `researched_no_supported_value`, and the existing no-supported-substitute finding unchanged.
4. Create no new ingredient reference, legacy candidate, form, recipe link, active measure, conversion, yield, or substitution.
5. Leave WP02 A6 open for further regional-flour work.

Static review checked the current A6 plan, proposal/batch archive, catalog workflow, live ownership, no-form boundary, source/observation/finding ID collisions, and all 114 manifest-listed recipes / 1,123 ingredient rows. The original proposed alias set failed package validation because `chaulai` had two exact owners. After holding the aliases, package and generated-index checks passed. No app, unit, instrumentation, emulator, or application tests were run for this database-JSON-only integration, under the rule in `AGENTS.md`.
