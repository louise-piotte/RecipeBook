# WP04 Section P — trout roe identity review (R395)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** culinary trout roe sold as `trout roe` / `œufs de truite`.
- **Recommendation:** Add identity-only `ingredient-ref-trout-roe` in `PROTEIN`, with narrow aliases `trout caviar` and `caviar de truite`. Keep species, curing, pasteurization, packaging, and serving data out of active runtime behavior.
- **Scope:** Edible roe as a separate market ingredient. This review does not reopen whole-trout references, salmon roe, tobiko, masago, lumpfish roe, bottarga, milt, sturgeon caviar, or sea-urchin gonads.
- **Proposal-only status:** This R395 review changes only this proposal file; it does not edit shared catalog, ledger, manifest, recipe, plan, roadmap, or generated files. No software tests, emulator, app, or deployment work was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-TROUT-ROE-R395-20261017-S01` through `S06`, plus audit ID `WP04-SECTIONP-TROUT-ROE-R395-20261017-R01`. These are evidence labels in this proposal only, not shared-ledger records. The OQLF caviar entry is reused under its existing archive ID, `WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S01`.

## Why this is an unallocated gap

The [Section P roe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7342) names roe and caviar products when recipes call for them. Existing proposals decide salmon roe, mentaiko, tarako, lumpfish roe, sturgeon caviar, uni, and other neighboring items; none gives trout roe a focused identity, ownership, or picker decision. The salmon-roe review mentions trout roe only as a separate product boundary, and its ledger record likewise lists trout roe as a distinct neighbor. Those mentions do not allocate a trout-roe identity, form, candidate, or source record. The plan and roadmap contain no trout-roe decision.

The current package snapshot contains **1,703 ingredient references**, **141 forms**, **56 legacy candidates**, and **2,059 research-ledger records / 9,285 source entries / 7,857 distinct source IDs / 6,579 distinct source URLs**. The manifest lists **114 recipe files / 1,123 ingredient rows**. No exact active, form, legacy, or ledger owner exists for the proposed identity or aliases. The IDs `ingredient-ref-trout-roe` and `candidate-trout-roe` are absent from shared data. Before this proposal was written, the R395 source-ID prefix had no collision in the ledger or prior proposal/batch archive; it is allocated only to the proposal-local labels in this file.

## Product and Québec naming evidence

CaviarHub’s current Canadian retailer pages offer an edible trout-roe product with the French product name **`Oeufs de truite - caviar rouge`** and English name **`Trout Roe`**. The French product page describes `œufs de truite` as a product also called `caviar de truite`, lists 50 g and 100 g formats, and includes the product for delivery to Québec City. Its English product page uses `trout caviar` as an alternate name. These first-party listing terms support the display and qualified aliases, not a universal recipe formulation. [S01–S03]

The [OQLF caviar entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428361/caviar) says that when caviar is made from a fish other than sturgeon, the fish name is specified, giving salmon and cod as examples. This supports keeping `caviar de truite` qualified; it does not support bare `caviar`, `caviar rouge`, or a claim that trout roe is sturgeon caviar. Reuse the archive source ID above rather than issuing a duplicate. [reused R34-S01]

Other listings confirm that the term identifies a culinary market product without establishing one species or process for every SKU. Oysters & Caviar Montréal lists a separate trout-roe product as *Oncorhynchus mykiss*, with 50 g and 100 g options and Germany as origin, but its page showed that product sold out at access. Do not generalize that SKU’s species or origin. CaviarHub’s specific trout listing says its product is Danish-farmed and pasteurized, while a later general FAQ on that same page describes all “red caviars” as wild; do not use those inconsistent page-wide statements to define a universal trout-roe state. [S04]

The French term `œufs de truite` also appears on a current SAIL page for Pautzke trout eggs, but SAIL categorizes that product under fishing lures and describes putting it in spawn netting. That is bait, not culinary roe, and must not be treated as food-product evidence or as a cue to alias fishing-bait wording. [S05]

OQLF’s rainbow-trout entry distinguishes Québec trout species and identifies the commercial aquaculture exception as rainbow trout. The food listings above do not jointly establish that all human-food trout roe comes from *Oncorhynchus mykiss*. Keep the identity species-neutral; do not attach *O. mykiss*, rainbow-trout roe, or any other taxon to the proposed row without a product-matched source. [S06]

## Exact ownership, archive, and source-ID audit

The audit used the key normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD, fold `œ` / `æ` / `ß` and `&`, remove diacritics, replace punctuation with spaces, and collapse whitespace. It compared active bilingual reference names and aliases, all form labels and match terms, legacy candidate names and aliases, ledger record IDs and text, plus focused proposal and batch archives.

| Candidate key or ID | Current owner / archive result | Boundary |
|---|---|---|
| `trout roe`; `œufs de truite`; `trout caviar`; `caviar de truite` | No exact active reference, form, legacy, or dedicated ledger record. | Allocate only to this edible roe identity if accepted. |
| `ingredient-ref-trout-roe`; `candidate-trout-roe` | Absent from active references, legacy IDs, and ledger record IDs. | Neither ID is allocated or reserved. |
| `WP04-SECTIONP-TROUT-ROE-R395-20261017-S01`–`S06`; `…-R01` | Absent from the current ledger and all prior proposal/batch files; declared only in this proposal. | No source-ID collision. The OQLF caviar source reuses its prior R34 archive ID. |
| `trout roe` in the salmon-roe R33 proposal / ledger decision | Appears only in a list of separate neighboring products and substitution exclusions. | It is not a trout-roe catalog or ledger allocation; retain the boundary from salmon roe. |
| `ingredient-ref-rainbow-trout`; other trout references | Existing whole-fish rows for brook, brown, lake, rainbow, and canned/smoked trout. None owns a roe phrase. | Keep roe separate from fish flesh and do not infer a single species from the general food listing. |
| `ingredient-ref-bottarga`; `ingredient-ref-fish-milt` | Existing roe-related rows; neither owns trout-specific phrases. | Keep dried processed mullet roe and male fish milt separate. |
| `ingredient-ref-finger-lime` / `lime caviar` | Existing owner for the phrase `caviar`. | Do not add bare `caviar`, `red caviar`, `fish roe`, or `roe` as aliases. A qualified `caviar de truite` alias still appears for the broad `caviar` query under phrase-first search; see picker projection. |

The archive search found no prior focused trout-roe proposal or batch. Its only substantive mentions are the R33 salmon-roe review and its integration README, both explicitly treating trout roe as a distinct neighboring product rather than assigning it. Exact checks for the new reference ID, candidate ID, and source-ID prefix returned no collisions. The complete counts and source-ID totals above were read from current seed JSON, legacy JSON, and research ledger, not inherited from older proposal snapshots. [R01]

## Picker projection

The projection follows the production logic in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including bilingual names, aliases, attached forms, accent/punctuation normalization, complete phrase matching first, and substring fallback only when no complete phrase matches. The counterfactual row uses `trout roe / œufs de truite` with `trout caviar / caviar de truite` aliases and no forms.

| Query | Current result | One-row projection |
|---|---|---|
| `trout roe`; `œufs de truite`; `trout caviar`; `caviar de truite` | None | `trout roe / œufs de truite` only |
| `roe` | Bottarga; milt (through `soft roe`) | Bottarga; milt; trout roe — three distinct results |
| `fish roe`; `œufs de poisson` | Bottarga | Unchanged; trout roe does not claim generic fish-roe wording |
| `caviar` | Finger lime (`lime caviar`) | Finger lime plus trout roe through the qualified alias; `caviar` is not added as a bare alias |
| `trout` | Brook, brown, canned, lake, rainbow, and smoked trout | The same six plus trout roe |
| `truite` | Brook, brown, canned, rainbow, and smoked trout | The same five plus trout roe |

The proposed aliases make the exact culinary terms searchable while retaining the market boundary. Broad `roe` remains a multiple-result query. Broad `caviar` becomes a two-result query that includes the existing citrus false positive; that behavior is explicit in the projection and is the cost of supporting the locally listed qualified `caviar de truite` wording. Do not add bare `caviar`, `caviar rouge`, `fish eggs`, `œufs de poisson`, or generic `roe` aliases. If the reviewer prefers to avoid widening the noisy broad `caviar` query, drop both caviar-qualified aliases together and retain the direct display names; do not keep only one language’s equivalent.

## Bundled-recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It checked complete recipe JSON and ingredient-row content for `trout roe`, `trout roes`, `œufs de truite`, `caviar de truite`, `trout caviar`, `trout eggs`, `trout spawn`, `roe`, `fish roe`, `œufs de poisson`, and `caviar`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe line, reference link, amount, role, or method selects trout roe. The retailer’s serving suggestions below are external product guidance, not bundled-recipe demand. [R01]

## Forms, measurements, density, conversions, yields, and substitutions

- **Forms:** Add none. The sources identify roe as the food product, but seller-level curing, pasteurization, refrigeration, or freshness statements are product-specific and inconsistent across the reviewed listings. Do not create universal fresh, salted, pasteurized, or frozen forms.
- **Measurements:** CaviarHub offers 50 g and 100 g packages and recommends 50 g for 1–2 people (100 g for 2–4). Treat these as source-specific product sizes and a seller serving suggestion. If preserved in the ledger, record the serving guidance as a published portion observation tied only to that CaviarHub SKU; do not create a reusable serving, package yield, recipe quantity, count mapping, or unit mapping. Oysters & Caviar’s 50 g / 100 g sizes belong to a different trout-roe SKU and are corroborating package options only. [S01, S04]
- **Density and volume:** No volume measure or density is supported. Add no default density or mass/volume mapping.
- **Conversions and yields:** No edible yield, draining/cooking yield, raw-to-cured conversion, or general package conversion is supported. Package sizes do not establish such a conversion.
- **Substitutions:** Add no global or contextual substitution and no recipe-line link. CaviarHub describes salmon roe as a bolder alternative, but gives no dish role, quantity ratio, adjustment, or outcome for replacing trout roe in a recipe. Treat this as product comparison, not a validated substitution. Keep trout roe distinct from salmon roe, tobiko, masago, lumpfish roe, bottarga, milt, sturgeon caviar, and uni.

## Proposed reference and ledger delta

Add an identity-only reference with the reviewed bilingual name and qualified aliases:

```json
{
  "id": "ingredient-ref-trout-roe",
  "nameFr": "œufs de truite",
  "nameEn": "trout roe",
  "aliasesFr": ["caviar de truite"],
  "aliasesEn": ["trout caviar"],
  "category": "PROTEIN",
  "defaultDensity": null,
  "unitMappings": []
}
```

Create a matching `ingredient_reference` ledger record with identity `verified`, measurement state `researched_no_supported_value`, and substitution state `researched_no_supported_substitute`. Preserve only the CaviarHub seller serving guide as a source-specific portion observation if the integration reviewer considers it useful; it must not drive runtime conversion. Add no form, recipe link, package-yield record, conversion, contextual rule, or aliases for generic roe/caviar terms. No recipe is relinked.

The identity is for a culinary market product category, not a taxonomic statement that every trout-roe SKU comes from rainbow trout. Keep *O. mykiss* and all other species-specific wording on the individual evidence only.

## Source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-S01** | CaviarHub, [Oeufs de truite - caviar rouge](https://caviarhub.ca/fr/products/trout-roe-red-caviar), accessed 2026-10-17. | Current Canadian French-language product listing; supports `œufs de truite`, the qualified alternate `caviar de truite`, 50 g / 100 g options, and the seller’s 50 g for 1–2 / 100 g for 2–4 guide. The serving guide and product handling claims are retailer-specific. The page’s specific Danish-farmed claim conflicts with a later general wild-red-caviar FAQ; neither production claim is generalized. |
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-S02** | CaviarHub, [Trout Roe](https://caviarhub.ca/products/trout-roe-red-caviar), accessed 2026-10-17. | Current English-language listing for the same seller product. Calls it `Trout Roe`, says `trout caviar` is an alternate term, and describes a flavor comparison to salmon roe. The retailer’s comparison does not set a recipe substitution amount or role. This is the English page for S01, not an independent SKU. |
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-S03** | CaviarHub, [Caviar & fish roe delivery in Québec City](https://caviarhub.ca/fr/pages/ville-de-quebec-caviar-esturgeon-oeufs-de-poisson-truffes), accessed 2026-10-17. | Current Canadian retailer page lists `Oeufs de truite - caviar rouge` for Québec City with a price and add-to-cart link, supporting Québec-facing product availability. The page is a retailer’s delivery offer, not a Québec terminology authority or province-wide inventory guarantee. |
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-S04** | Oysters & Caviar Montréal, [Trout Roe](https://oystersandcaviar.ca/products/trout-roe), accessed 2026-10-17. | Separate retailer listing identifies its product as *Oncorhynchus mykiss*, gives Germany as origin and 50 g / 100 g options, and says it is packed in Montréal. It showed sold out. These are facts about that SKU only; they do not establish species or origin for trout roe generally. |
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-S05** | SAIL, [Œufs de truite — Pautzke](https://www.sail.ca/fr-ca/products/pautzke-ufs-de-truite-1502848-25-005400001), accessed 2026-10-17. | Current Québec retailer page categorizes its `œufs de truite` item under fishing lures and describes use in spawn netting. It is fishing bait, not human-food roe; the identical phrase alone is not used as culinary-product evidence. |
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-S06** | OQLF, [GDT: truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel), last updated 2011; accessed 2026-10-17. | Identifies rainbow trout as *Oncorhynchus mykiss* and describes the Québec commercial context for trout species. It does not identify the species of the CaviarHub or other generic trout-roe listings. |
| **Reused: `WP04-SECTIONP-STURGEON-CAVIAR-20261013-R34-S01`** | OQLF, [GDT: caviar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428361/caviar), last updated 1983; accessed 2026-10-17. | Prior R34 source ID reused for OQLF’s terminology note that caviar made from non-sturgeon eggs is qualified by the fish name, with salmon and cod as examples. It does not establish trout-specific food state or a modern legal standard. |
| **WP04-SECTIONP-TROUT-ROE-R395-20261017-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest-listed recipe files, and focused Section P archive. | Static ownership, ID/source-ID, picker-projection, and corpus audit against 1,703 references, 141 forms, 56 legacy candidates, 2,059 ledger records / 9,285 source entries / 7,857 distinct source IDs / 6,579 URLs, and 114 recipe files / 1,123 ingredient rows. Repository snapshot; it does not establish availability beyond the listed retailer pages. |

## Final disposition

**Add identity-only trout roe / œufs de truite** as a culinary product reference with only the qualified `trout caviar` / `caviar de truite` aliases. Keep the product species-neutral, do not import seller-specific preparation or serving details into runtime behavior, and retain all other roe-product boundaries. The broad caviar search effect is documented above for reviewer confirmation. This proposal recommends a future catalog delta but does not edit shared data or plan files. No software tests were run.
