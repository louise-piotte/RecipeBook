# WP02 Section 04 A6 R168 — `Mandua Atta` finger-millet-flour alias review

## Review record

- **Scope:** The exact romanized phrase `Mandua Atta` as a search alias for the existing finger-millet-flour identity.
- **Recommendation:** **INTEGRATE** only `mandua atta` into `aliasesEn` on `ingredient-ref-finger-millet-flour`. Keep the current grain and flour identities, displays, measures, forms, and substitution state otherwise unchanged.
- **Checklist context:** The broad regional grain/flour review remains open in the [active A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1512). R165 covered `kauni`, R166 covered `arikelu` / `arikelu pindi`, and R167 held `varagu podi`; this is a separate finger-millet-flour spelling question. See the [R165 review](wp02-a6-next-regional-flour-review-r165-20261016-kauni.md), [R166 review](wp02-a6-next-regional-flour-review-r166-20261016.md), and [R167 review](wp02-a6-next-regional-flour-review-r167-20261016-varagu-podi.md).
- **Why this is the next bounded gap:** The R5 Mandua integration added `mandua` to finger-millet grain and `mandua flour` / `mandua ka atta` to finger-millet flour. It expressly left the distinct phrase `mandua atta` unassigned because that phrase was outside the evidence reviewed then. Two current maker pages now use the exact phrase for finger-millet flour, and the current FSSAI standard confirms the Mandua–finger-millet name/species relationship. This review resolves only that exact two-word phrase.
- **Archive boundary:** The [integrated R5 review](wp02-a6-next-regional-flour-gap-review-20261013-round5.md) is the only earlier A6 archive item with an explicit `mandua atta` disposition. Its exclusion did not create an alias, candidate, reference, or lasting evidence-based hold. No later proposal, batch, live reference, form, legacy candidate, or ledger record ID assigns this exact normalized phrase. Do not reopen or alter any R165–R167 decision.
- **Source IDs:** `WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S01` and `WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S02` are proposal-local and unallocated. If accepted, reuse the already allocated FSSAI source ID `WP02-A6-RAGI-ATTA-20261012-S01`; do not create a duplicate FSSAI entry.

## Evidence and naming boundary

Akkadi Roots' current [Finger Millet Flour / Ragi Hittu product page](https://www.akkadiroots.com/product-page/finger-millet-flour-ragi-hittu-1kg) says the flour is made with ragi/finger millet and lists `Mandua Atta (Hindi)` among names for that flour. The page presents the product as a 1 kg flour product and offers a purchase action. This is a maker's product-name mapping, not evidence of Canadian market frequency or Québec French terminology. [S01]

Shuddh Herb's live [Mandua (Ragi) Flour product page](https://shuddhherb.com/products/madwa-ragi) uses the exact wording `Mandua Atta`, identifies the product as finely ground finger millet, and its FAQ equates “Mandua atta” with ragi flour made from finger millet. The page currently marks the SKU sold out; no availability claim is made here. Its general wheat-substitution copy gives no ratio, recipe scope, or test method and is not used to create or change a substitution rule. [S02]

The current FSSAI Chapter 2.4 standard (Version 4, 2025-05-07) lists “Finger Millet (Ragi or Mandua) — *Eleusine coracana*” in its millet standard. The existing source ID on the flour ledger record already records that crosswalk. It confirms the crop-name boundary; the two maker pages supply the exact flour phrase. FSSAI does not establish a Québec French name. [WP02-A6-RAGI-ATTA-20261012-S01]

The proposed lookup phrase is a romanized Hindi name stored in the existing `aliasesEn` collection, alongside other romanized regional names. This array placement makes it searchable and does not label the phrase as English-language usage. Retain `finger millet flour` / `farine de ragi`; add no French alias or alternate display. Do not infer `farine de mandua`, `mandua aata`, `mandua ka aata`, `madua atta`, `madwa atta`, or `mandwa atta`. In particular, the similar-looking Patanjali product wording `Madwa Atta` is not the exact spelling under review.

## Exact ownership and proposed delta

The live ownership audit applied the normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and Unicode NFKD normalization, accent/ligature folding, punctuation-to-space conversion, and whitespace collapsing. It checked reference IDs/names/aliases, form IDs/labels/match terms, legacy-candidate IDs/names/aliases, and ledger record IDs.

| Normalized key or row | Current owner | Proposed disposition |
|---|---|---|
| `mandua atta` | No exact owner in active references, forms, legacy identities, or ledger record IDs. | Add as one English-search alias on `ingredient-ref-finger-millet-flour`. |
| `mandua flour`; `mandua ka atta` | `ingredient-ref-finger-millet-flour` aliases. | Preserve unchanged. |
| `mandua` | `ingredient-ref-finger-millet` alias. The picker also returns the flour because its existing aliases contain `mandua flour` and `mandua ka atta`. | Preserve both grain and flour results. |
| `mandua aata`; `mandua ka aata`; `madua atta`; `madwa atta`; `farine de mandua` | No exact owner. | Keep unassigned. |
| `ingredient-ref-finger-millet` | `finger millet / éleusine cultivée`; aliases `ragi`, `kurakkan`, `mandua`; category `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. | No change. |
| `ingredient-ref-finger-millet-flour` | `finger millet flour / farine de ragi`; aliases `ragi flour`, `nachni flour`, `ragi atta`, `kurakkan flour`, `mandua flour`, `mandua ka atta`; category `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []`. | Append only `mandua atta` to `aliasesEn`; set `updatedAt` to `2026-10-16T00:00:00Z` on integration. Keep `aliasesFr` empty. |

Neither target has an attached ingredient form. Do not create an `ingredient-ref-mandua-flour`, a new legacy mapping, or a form. The phrase names the flour product already represented by `ingredient-ref-finger-millet-flour`.

## Picker projection

The picker first selects complete normalized word-phrase matches across reference terms and attached form terms; only if none exist does it use substring matching. In particular, normalization does not remove the word `ka`, so `mandua atta` does not currently match the existing phrase `mandua ka atta`.

| Query | Current result | Projected result after the one alias |
|---|---|---|
| `mandua atta` | No result | `ingredient-ref-finger-millet-flour` only |
| `mandua` | `ingredient-ref-finger-millet` and `ingredient-ref-finger-millet-flour` | Same two rows |
| `mandua flour`; `mandua ka atta` | `ingredient-ref-finger-millet-flour` only | Same row |
| `finger millet flour`; `ragi flour`; `ragi atta`; `farine de ragi` | `ingredient-ref-finger-millet-flour` only for each query | Same row for each query |
| `mandua aata`; `mandua ka aata`; `madua atta`; `madwa atta` | No result for each query | No result for each query |
| Broad `atta` | Same 11 flour/atta rows, including `ingredient-ref-finger-millet-flour` | Same 11-row result set; the new alias adds no row |

The alias makes the exact source phrase searchable without redirecting `mandua` away from its existing grain-plus-flour choices or changing the broad `atta` result set.

## Bundled recipe demand

The full split-package manifest lists **114 recipe files** with **1,123 ingredient rows**. Every manifest-listed file and each ingredient row was scanned for normalized whole phrases covering the candidate, its nearby spellings, existing Mandua and finger-millet terms, the French display, and both target reference IDs.

- Candidate and neighboring phrase hits: **0 of 114 files; 0 of 1,123 ingredient rows**.
- Direct recipe links to `ingredient-ref-finger-millet`: **0**.
- Direct recipe links to `ingredient-ref-finger-millet-flour`: **0**.
- No recipe text, ingredient row, or reference link is proposed.

The ordered corpus fingerprint is SHA-256 `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`, computed over each manifest-ordered relative recipe path, a NUL byte, exact file bytes, and a final NUL byte. Total recipe-file bytes: 753,928.

## Forms, numeric data, and substitutions

There are no forms attached to either target reference. Keep both active `defaultDensity` values null and both `unitMappings` arrays empty. The finger-millet-flour ledger record remains `measurementState: researched_supported` and carries four source-specific laboratory bulk-density observations: 0.55 g/mL (light-brown, loose), 0.79 g/mL (light-brown, packed), 0.47 g/mL (dark-brown, loose), and 0.77 g/mL (dark-brown, packed). These refer to laboratory-prepared flour samples, not a Mandua retail product or a general cup fill; the cited paper's table unit also conflicts with its prose/method. Preserve these as research observations and do not promote them to an active density, unit mapping, volume conversion, or recipe measure.

The flour record has one existing substitution finding, `finger-millet-flour-general-wheat-replacement-blocked-20261012`, in `blocked_pending_evidence` state. It is limited to one fixed bread formula and does not support a universal wheat-replacement ratio. The global and contextual substitution-rule files currently contain zero active rules. Keep the finding and state unchanged; add no same-ingredient form conversion, contextual substitution, yield, recipe-line link, or replacement ratio. The broad wheat-substitution statement on S02 lacks a quantified, test-scoped basis and does not change this conclusion.

## Source register and collision audit

The two new source IDs below are proposal-local and unallocated. Exact-ID and exact-URL checks found no match for them in the live ledger or the catalog proposal/batch archive. The FSSAI URL is already present on the flour record under its existing source ID and is reused without duplicating the URL or source record.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S01** | Akkadi Roots, [Ragi Hittu / Finger Millet Flour, 1 kg](https://www.akkadiroots.com/product-page/finger-millet-flour-ragi-hittu-1kg), product copy and title; accessed 2026-10-16. | The maker identifies its product as finger-millet flour and lists `Mandua Atta (Hindi)` among its names. Direct exact-phrase product evidence; not a Canadian/Québec naming standard. |
| **WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S02** | Shuddh Herb, [Mandua (Ragi) Flour, 1 kg](https://shuddhherb.com/products/madwa-ragi), product description and FAQ; accessed 2026-10-16. | Uses `Mandua Atta`, identifies it as finely ground finger millet/ragi flour, and equates “Mandua atta” with ragi flour. Page marks the product sold out; it does not establish current availability. Its general wheat-substitution claim provides no reusable quantity or method. |
| **Reused: WP02-A6-RAGI-ATTA-20261012-S01** | FSSAI, [Food Safety and Standards, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §23(6), PDF p. 17; accessed 2026-10-16. | Current official standard maps Finger Millet (Ragi or Mandua) to *Eleusine coracana*. This source is already attached to the flour ledger record and confirms the crop boundary, not the exact retail phrase or Québec wording. Reuse the existing ID and source entry. |

If accepted, add S01 and S02 as source entries to the existing `ingredient-ref-finger-millet-flour` research record and record an accepted alias decision citing S01, S02, and the already allocated FSSAI source ID. Do not add any source entry to the grain record, create a ledger record, or allocate new form/measurement/substitution IDs. No new source URL is proposed for FSSAI.

## Snapshot and review checks

Read-only snapshot for this proposal: 1,543 active ingredient references; 119 forms; 61 legacy candidates; 1,887 research-ledger records, 8,066 source entries, 6,902 distinct source IDs, and 5,698 distinct source URLs. The manifest has 114 recipe paths. Exact-byte file hashes:

| File | SHA-256 |
|---|---|
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | `35076f6a6e0290e6f62a7b058579c34c6d35acbdb4de40189de0d6b7d9fd120f` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | `6ccfe3cc2655e690b37b59b005f40535951f843190ef201a380056f47a396c4e` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | `11af9bc63ccd53963e03f91d4e73054daee13de32f716b63925481f062ee2bc3` |
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The exact target row, existing accepted decisions, forms, source IDs/URLs, observation values, and substitution finding were inspected directly. The candidate alias was projected in memory against the live search terms using the implementation in `IngredientSearch.kt`; no shared catalog data was edited. This is proposal-only. No app, unit, instrumentation, emulator, build, or deployment tests were run.
