# WP02 A6 French alias review: pearl millet flour

## Review record

- **Reviewed and sources accessed:** 2026-10-12.
- **Status:** Integrated by root on 2026-10-12; see the [integration report](../batches/wp02-a6-pearl-millet-flour-french-alias-integration-20261012/README.md). The broader A6 checklist remains open.
- **Plan context:** The open WP02 A6 parent item continues review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours. The live pearl-millet flour row has the existing English alias `bajra flour`. A separate proposal recommends `bajri flour`, but that alias is not in the live catalog and is not re-adjudicated here. This review covers only a still-unassigned Canadian French product phrase.
- **Non-overlap:** The 2026-10-12 Bajri proposal retained `farine de mil chandelle` and recommended no French alias because it had no French product-name evidence in scope. The sprouted-pearl-millet review mentioned `farine de millet perlé` only as wording for plain flour while holding the separate sprouted product. This packet reviews that exact phrase as an alias for the existing plain pearl-millet flour.
- **Proposal-local source IDs:** `WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S01` through `S07`. The prefix and IDs were absent from the live ledger and the archived proposal/batch Markdown at the pre-draft check.
- **Proposal path:** This round-13 path was unused before drafting.
- **A6 status:** Keep the broader A6 review open.

## Recommendation

Add only the French alias **`farine de millet perlé`** to the existing `ingredient-ref-pearl-millet-flour` row. Keep the display pair `pearl millet flour / farine de mil chandelle`, the existing English alias `bajra flour`, and all numeric fields unchanged. Do not create a new identity or change the established Codex-based French display.

OQLF supplies Québec French terminology for the source grain, while current French-facing Canadian product listings use the exact qualified flour wording `farine de millet perlé` for pearl-millet/Bajra flour [S01, S03–S04]. This supports a search alias on the existing flour row. It does not establish that the alias should replace the Codex display or be called an OQLF-preferred flour term.

| Phrase or field | Recommendation | Evidence boundary |
|---|---|---|
| `farine de millet perlé` | Add as one French alias on `ingredient-ref-pearl-millet-flour`. | Canadian French-facing flour listings pair the phrase with pearl millet/Bajra flour; OQLF supports the source-grain identity. [S01, S03–S04] |
| `farine de mil chandelle` | Retain as the canonical French display. | Existing Codex source `WP02-S34` defines pearl millet flour and gives this French product name. |
| `farine de millet perle` | Do not add as a separate spelling. | Accent-folded search already maps it to the recommended alias; OQLF's grain entry prints `millet perle` without the adjectival construction. [S01] |
| `farine de millet à chandelle`; `farine de bajra`; `farine de bajri`; `farine de millet perlé germé` | Do not add in this pass. | No direct Québec/Canadian product evidence reviewed here establishes these exact phrases as flour aliases; the sprouted phrase remains a separate process boundary. |
| English displays and aliases | Retain unchanged. | `pearl millet flour` and `bajra flour` resolve to this row. The separate `bajri flour` proposal remains unintegrated and is outside this decision. |
| New identity, form, recipe link, active measure, density, mapping, yield, or substitution | Add none. | The name evidence does not justify numeric or recipe behavior. Measurement and baking studies remain source-specific. [S05–S07] |

## Québec French and product boundary

OQLF's live Grand dictionnaire terminologique entry identifies *millet perle* as the Québec French name for pearl millet and lists related preferred grain terms, including *millet à chandelle* [S01]. Usito's Québec French dictionary records the collocation *millet perlé* [S02]. Neither language source defines a flour product name. The exact flour wording comes from Canadian retail/product sources: Spice Divine's French-facing S&V product page is titled `Farine de millet perlé S&V` and describes it as made from pearl millet (`bajra`) [S03]. Metro's French-facing product information lists `farine de millet perlé` as a cereal ingredient; its English-facing ingredient list renders the same component as `pearl millet flour` [S04]. Metro's source is an ingredient declaration in a multigrain cereal, not a standalone flour package, so it supports wording and equivalence only.

Use the accented phrase exactly as found in the Canadian French-facing sources, without presenting it as an OQLF ruling. Keep `farine de mil chandelle` as the display because the existing Codex standard explicitly names that flour in French [WP02-S34]. Do not add the bare grain phrase `millet perlé` to the flour alias list: the grain row already owns it. Do not add product-process terms such as `germé`; the separate A6 sprouted-flour hold remains in force.

The existing FSSAI standard source `WP03-BAJRA-FLOUR-20261010-S01` remains the primary source for the English product boundary: it defines Bajra flour as milled pearl-millet grain. It is reused as existing ledger evidence and is not assigned a new source ID here.

## Current catalog, collision, and picker audit

The active reference is `ingredient-ref-pearl-millet-flour`, category `FLOUR_AND_STARCH`, with English name `pearl millet flour`, French name `farine de mil chandelle`, English alias `bajra flour`, no French aliases, `defaultDensity: null`, and `unitMappings: []`. The separate `bajri flour` proposal is not present on the live row. Its verified ledger row currently has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. No pearl-millet-flour form is attached.

Exact normalized ownership was checked across active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs. Normalization follows `IngredientSearch.kt`: lowercase, compatibility/accent/ligature folding, punctuation to spaces, then whitespace collapse.

| Normalized key | Current exact owner | Proposed disposition |
|---|---|---|
| `farine de millet perlé` / `farine de millet perle` | None | Add only the accented form as an alias to `ingredient-ref-pearl-millet-flour`. |
| `pearl millet flour`; `farine de mil chandelle`; `bajra flour` | `ingredient-ref-pearl-millet-flour` | Retain current owners. |
| `bajri flour` | None | Leave unassigned in this review; its separate proposal is still unintegrated. |
| `millet perlé` | `ingredient-ref-pearl-millet` | Keep as the grain name; do not attach the bare phrase to flour. |
| `farine de millet` | `ingredient-ref-millet-flour` | Retain the generic flour owner; the shorter query will also surface the pearl-millet flour after the qualified alias is added. |
| `farine de bajra`; `farine de bajri`; sprouted flour phrases | None | Leave unassigned. |
| `ingredient-ref-pearl-millet-flour` | Target reference and its ledger record ID | Retain the existing ID. No new ID is proposed. |

Static projection through the current phrase-containment search behavior gives these results:

- `farine de millet perlé` returns only `ingredient-ref-pearl-millet-flour` after the alias is added.
- `millet perlé` returns the existing pearl-millet grain and the pearl-millet flour. This is the expected grain/flour choice set for the shared qualified name.
- `farine de millet` currently returns the generic millet flour plus the foxtail-, kodo-, and proso-millet flour rows. The proposed alias adds pearl-millet flour as a fifth, more specific result for that broader query.
- `farine de mil chandelle`, `pearl millet flour`, and `bajra flour` keep their current single flour result. `bajri flour` remains without a result until its separate proposal is integrated. The held sprouted phrase still returns no result.

This is a static source-term projection, not a runtime picker test.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized string fields. Candidate phrases included both accent-folded spellings of `farine de millet perlé`, `pearl millet flour`, `farine de mil chandelle`, `bajra flour`, `millet perlé`, `farine de bajra`, the held sprouted phrase, and the target reference ID.

- Recipe files with a phrase hit: **0**.
- Ingredient rows with a phrase hit: **0**.
- Direct ingredient links to `ingredient-ref-pearl-millet-flour`: **0**.

No recipe change or link is proposed. The alias is justified by current Canadian French product wording and picker coverage, not bundled recipe demand.

## Measurements, density, and substitutions

Keep active `defaultDensity: null` and `unitMappings: []`. Health Canada's Canadian Nutrient File has a generic `Grains, millet, flour` record with `250 mL = 125.7 g` and a 20 g serving [S05]. The record does not identify pearl millet, so do not transfer its portion/density to this source-grain-qualified row. It is not an adequate household mapping for pearl-millet flour.

Irondi et al. report a bulk density of **0.63 ± 0.01 g/mL** for their whole pearl-millet flour sample [S06]. Their method uses a 100 mL cylinder, 50 g of sample, and gentle tapping until the flour settles; the grain was ground below 0.5 mm. This is a study- and protocol-specific bulk-density observation, not a household cup measure or a product-independent default.

Maktouf et al. tested pearl millet flour as a **1%, 2%, 5%, or 10% by-weight addition** in one wheat-bread formulation; 5% was the study's reported optimum for its dough/bread outcomes [S07]. That is formula-specific partial wheat replacement, not a general substitution ratio for rotis, other breads, baking, thickening, or other recipes. Add no global or contextual substitution rule. If this proposal is integrated, record the source-specific density observation in the ledger with `measurementState: researched_supported` and the bounded bread evidence with `substitutionResearchState: blocked_pending_evidence`. Keep `defaultDensity: null` and `unitMappings: []`: the supported laboratory observation is not a household conversion or product-independent default. Record the bread finding as blocked, with no active runtime substitution.

## Live snapshot and uniqueness checks

Snapshot read from the shared working tree on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, its exact file bytes, and a trailing NUL byte.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,325 rows; 424,329 bytes | `cf9aa167cb0f144f8a066a0e60b6ba3eb75bd39336747d075471ba2938973a42` |
| Ingredient forms | 98 rows; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,633 records; 6,041 source entries; 5,057 distinct source IDs; 8 unit conversions; 5,999,346 bytes | `d75e13648aa59375da93d0b0a331d0e4d5f45a22f473e9b163a686c74a0d73` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,325 reference constructors; 580,803 bytes | `b91e5d1e9016582f4d12968d40480f3ad7a334f9c453fb8b416cfbe39f1eb88c` |

The source prefix `WP02-A6-PEARL-MILLET-FR-ALIAS-20261012` was absent from all 798 proposal Markdown files, all 1,332 proposal/batch Markdown files scanned, and all 5,057 ledger source IDs. The proposed file path did not exist before drafting. Existing evidence `WP02-S34` and `WP03-BAJRA-FLOUR-20261010-S01` is reused without assigning duplicate IDs.

## Integration summary

1. Added only `farine de millet perlé` to `aliasesFr` on `ingredient-ref-pearl-millet-flour`.
2. Preserved the canonical French display, English display and live alias `bajra flour`, category, `defaultDensity: null`, and `unitMappings: []`. The separate `bajri flour` proposal remains outside this integration. No new reference, form, legacy candidate, recipe link, yield, conversion, or active substitution was added.
3. Added sources S01–S07 and an accepted French-alias decision to the existing ledger record. Set `measurementState: researched_supported` for the scoped study observation while leaving the active default density null. Set `substitutionResearchState: blocked_pending_evidence` for the bounded bread finding; no runtime substitution was added.
4. Left the broader WP02 A6 checklist open.

No app, unit, instrumentation, or emulator tests were run. This integration adds database JSON data under the current `AGENTS.md` rule; the generated catalog index was refreshed.

## Source register

All new pages below were checked on 2026-10-12. New source IDs are proposal-local and are not ledger entries.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S01** | Office québécois de la langue française, [millet perle, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle). Lists Québec French grain terms and English `pearl millet`. | Terminology for the grain, not a flour name; the entry prints `millet perle`, without the adjectival flour phrase. |
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S02** | Usito, Université de Sherbrooke, [millet: cooccurrents](https://usito.usherbrooke.ca/d%C3%A9finitions/millet/cooccurrents). Records the Québec French collocation `millet perlé`. | Lexical spelling/context only; it does not define pearl-millet flour or a product label. |
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S03** | Spice Divine, [Farine de millet perlé S&V 2,2 lb](https://spicedivine.ca/fr/products/sv-pearl-millet-flour-2lb) and [English product page](https://spicedivine.ca/products/sv-pearl-millet-flour-2lb). The French listing uses the exact phrase and describes the product as made from pearl millet (`bajra`). | Canadian retailer product wording; no standardized grind, recipe measure, or substitution is inferred. Retail marketing and health claims are excluded. |
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S04** | Metro, [Céréales muesli croquant au chocolat et noix Joyfull Millets](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-muesli-croquant-au-chocolat-et-noix/p/057174900070), product ingredient list in the French-facing listing; English-facing list names the corresponding component `Pearl millet flour`. | Canadian grocer's ingredient declaration for a multigrain prepared product, not a flour package. The page notes ingredients can change; use only as local French wording/equivalence evidence. |
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S05** | Health Canada, [Canadian Nutrient File: Grains, millet, flour, serving portions](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6186), food code 6186. Gives `250 mL = 125.7 g` and `1 serving = 20.0 g`. | Generic millet-flour record, page modified 2019-03-01; it does not specify pearl millet. Its value is not attached to this row. |
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S06** | Irondi et al., [“Physicochemical, antioxidant and starch-digesting enzymes inhibitory properties of pearl millet and sweet detar gluten-free flour blends, and sensory qualities of their breads”](https://www.frontiersin.org/journals/food-science-and-technology/articles/10.3389/frfst.2022.974588/full), *Frontiers in Food Science and Technology* (2022), methods §§2.2.1–2.2.2.4 and Table 2. | Reports 0.63 ± 0.01 g/mL for its whole pearl-millet flour sample and a tapped-cylinder protocol. Laboratory sample, not a retail-product default or household conversion. |
| **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S07** | Maktouf et al., [“Evaluation of dough rheological properties and bread texture of pearl millet-wheat flour mix”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4926890/), *Journal of Food Science and Technology* 53(4) (2016), 2061–2066, doi:[10.1007/s13197-015-2065-z](https://doi.org/10.1007/s13197-015-2065-z). | Tests 1–10% pearl-millet-flour additions in one bread formula and reports 5% as optimum for that study. Does not establish a reusable substitution rule for other recipes. |

**Reused ledger evidence:** Codex CXS 170-1989, source `WP02-S34`, supports the canonical French display `farine de mil chandelle`; FSSAI Chapter 2.4, source `WP03-BAJRA-FLOUR-20261010-S01`, supports the existing `bajra flour` identity boundary. Neither source is duplicated in the proposed source register.
