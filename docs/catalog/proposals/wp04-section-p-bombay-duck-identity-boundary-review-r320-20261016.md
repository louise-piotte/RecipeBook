# WP04 Section P — Bombay duck / Scopelodé identity and product-boundary review (R320)

- **Review and source-access date:** 2026-10-16.
- **Decision:** Recommend one identity-only `PROTEIN` reference for *Harpadon nehereus*, displayed **Bombay duck fish / Scopelodé**. CFIA lists *H. nehereus* with the accepted Canadian common-name pair **Bombay Duck / Scopelodé**. A current Montréal seller links its dried Lottia/Loitta product to the same scientific name, while Canadian retailer listings show separate frozen and prepared products. Keep the species row separate from poultry duck, regional dried-product wording, and prepared/frozen product states.
- **Data shape:** `ingredient-ref-bombay-duck`; category `PROTEIN`; English display `Bombay duck fish`; French display `Scopelodé`; aliases `[]` / `[]`; `defaultDensity: null`; `unitMappings: []`; no forms, package yields, recipe links, or substitutions.
- **Scope:** Proposal-only. Only this file was written. No shared references, forms, legacy identities, ledger, checklist, generated index, recipes, plan, or roadmap was changed. No software tests, build, emulator check, or deployment was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S01` through `S06`; `R01` denotes the repository audit. None are allocated to the shared research ledger.

## Exact open checklist anchor and non-overlap

The candidate sits under the still-open Section P checklist line **“Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.”** ([plan line 5715](../../RecipeBook-global-ingredient-catalog-plan.txt#L5724)). The parent remains unchecked. It is specifically the open regional-fish portion of this named-species gap.

The nearby fish/seafood preservation line ([plan line 6659](../../RecipeBook-global-ingredient-catalog-plan.txt#L6670)) has a checked child review that keeps generic preserved-fish identities and universal dried/smoked/canned forms inactive without an exact recipe or product request. R320 addresses one species identity with a current Montréal species-linked product listing; it does not propose a universal dried form or reopen that generic boundary. It also does not overlap the completed short-mackerel review R314: Bombay duck is *Harpadon nehereus*, not a *Rastrelliger* mackerel.

Searches of the active catalog, legacy identities, research ledger, proposal archive, and batch history found no earlier Bombay-duck, *Harpadon nehereus*, or Scopelodé identity decision, hold, or ownership allocation. [R01]

## Species name and product boundary

CFIA's Fish List pairs TSN 162425 and *Harpadon nehereus* with **Bombay Duck / Scopelodé** in family Synodontidae. CFIA describes its list as the English and French common names acceptable for Canadian fish labelling and provides the corresponding scientific name and TSN. The Fish List is the Canadian naming authority used here; its current page reports a last-modified date of 2023-09-18, so it is not represented as a newly published taxonomic assessment. CFIA's guidance says the listed common name(s) should be used for the species sold or processed in Canada. [S01, S02]

| Candidate or product wording | Recommendation | Boundary |
|---|---|---|
| *Harpadon nehereus* | Scope the identity to this species; use the CFIA name pair. | This is not a genus-wide *Harpadon* row or a general “duck” identity. Do not store the scientific binomial as a consumer alias. |
| `Bombay Duck` | English display: `Bombay duck fish`. | `Bombay duck` remains searchable as a complete phrase within the display. The word `fish`, also used in current Canadian retail listings, distinguishes the food from poultry in result lists. Do not alias bare `duck`. |
| `Scopelodé` | French display, matching CFIA. | A focused OQLF search did not surface a species-specific GDT entry for `Scopelodé`, `Bombay Duck`, or *H. nehereus*. The CFIA name is direct Canadian French nomenclature evidence; Québec retail familiarity with this French term was not verified. |
| `canard`, `canard de Bombay` | No French alias. | OQLF's food/poultry GDT entry defines `canard` as a palmiped bird in the Anatidae family. A literal French rendering would collide with duck egg and duck fat and is unsupported as a fish name. [S03] |
| `Dry Lottia`, `Loitta Shutki`, `Dry Loita` | Do not add as base-identity aliases or a form in this proposal. | Belaamie's Montréal listing uses these product-specific names for a dried fish SKU and states that it is *H. nehereus*. Mapping the terms directly to a form-free species row would erase the dried-product state. The listing supports this product's identity and state, not all regional spellings or a reusable form conversion. [S04] |
| Frozen Bombay Duck | Keep the package state outside the reference. | PriceSmart Foods lists a frozen, wild-caught, headed/tail-off, gutted product. The listing gives no scientific name or cooking equivalence. [S06] |
| Crispy Salt and Pepper Bombay Duck Fish | Keep the prepared product separate. | T&T lists a 250 g prepared item and gives air-fryer directions; it does not provide a binomial. Its package and heating directions do not establish raw-fish behavior or a general form. [S05] |

The English display retains the accepted CFIA common name as a searchable phrase while adding the retailer-supported clarifier `fish`. The French display uses the exact CFIA French name. Neither display claims that dry, frozen, and crispy prepared products share a usable amount, preparation method, or conversion.

## Exact ownership and archive audit

The read-only snapshot completed at **2026-10-16 23:49 UTC**, after the concurrent R317 catalog update, and contained **1,674 active references**, **127 forms**, **59 legacy candidates**, and **2,021 ledger records**. The active catalog snapshot therefore includes R317's unrelated kewra-water reference. Snapshot hashes were: references `6d6ad45f153de898ff781cd083ccfcf9319345158e9084513852b4b234e63ae0`; forms `aa10345fa769bb94f7827d6b7eaa52be865d4e608deb726b23f035d6bfd50cb2`; legacy identities `9167695ce41884213efb2dedc05fd3f4f56590a15c3add833239a43bf1a47fe8`; ledger `406f2207221ba12e69e17c86c0cf218ebf069caa1b9c234c3cf9d99a39f99c0e`. Candidate terms were checked case-insensitively across active reference names and aliases, attached form labels and match terms, legacy-import identities, ledger records, all `wp04-section-p` proposals and batch records, and recipe text. The candidate terms included `Bombay duck`, `Bombay duck fish`, `Harpadon nehereus`, `Scopelodé`, `Scopelode`, `Bombil`, `Bummalo`, `Loitta`, `Lottia`, `Lotia`, and `Loitta Shutki`; no exact owner or focused earlier review was found. [R01]

Existing adjacent picker identities are:

- `ingredient-ref-duck-egg` — `duck egg / œuf de canard`, with plural egg aliases and a salted duck egg form.
- `ingredient-ref-rendered-duck-fat` — `rendered duck fat / gras de canard fondu`.

The salted-egg form belongs to the egg row, not an independent duck-protein row. No fish form belongs to the candidate; no legacy alias or research-ledger candidate reserves its proposed ID. R314's short mackerel is a separate species and its review does not assign Bombay duck terms. The R320 ID and source prefix are not allocated in active data or the archive. [R01]

## Picker projection

The static projection follows the phrase-first normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it returns exact word-phrase matches across the whole result set and uses substring fallback only if there are no exact matches anywhere. Reference displays, aliases, and attached form terms are included. The `current` column below means the R320 pre-addition snapshot recorded above (1,674 references, 127 forms); the working tree now contains the integrated R320 row, so its live results match the `With proposed row` column.

| Query | Current results | With proposed row | Effect |
|---|---|---|---|
| `Bombay duck` | None | Bombay duck fish | Phrase is present in the English display. |
| `Bombay duck fish` | None | Bombay duck fish | Exact English display phrase. |
| `Scopelodé` | None | Scopelodé | Exact French display; accent folding leaves the display spelling intact. |
| `duck` | Duck egg; rendered duck fat | Those two plus Bombay duck fish | Broad English query gains a third, visibly qualified result. |
| `duck egg` | Duck egg | Duck egg | Precise query stays on the egg row, including its salted form. |
| `duck fat` | Rendered duck fat | Rendered duck fat | Precise query stays on the fat row. |
| `canard` | Duck egg; rendered duck fat | Same two | No fish alias is added. |
| `fish` | 9: Bonga dried fish powder; bottarga; fish balls; fish sauce; fish stock; fish tofu; flounder market group; frozen breaded fish sticks; sole market group | Same nine plus Bombay duck fish (10) | Broad fish query remains multi-result. `Redfish` and `cuttlefish` are not exact `fish` phrases. |
| `poisson` | 10: bagoong isda; Bonga dried fish powder; bottarga; fish balls; fish sauce; fish stock; fish tofu; frozen breaded fish sticks; pla ra; prahok | Same 10 | French display does not introduce a generic `poisson` alias. `Poissons` in a longer display is not an exact singular phrase match. |
| `Harpadon nehereus`, `Bombil`, `Loitta` | None | None | Binomial and product/local names remain unindexed until recipe naming justifies them. |

This is a static projection over the audited catalog and an in-memory proposal row, not an app test. [R01]

## Bundled recipe demand, measurements, and substitutions

The bundled manifest lists **114 recipe files** and **1,123 structured ingredient rows**. A scan of every manifest-listed recipe document and ingredient row found zero matches for Bombay duck, *Harpadon nehereus*, Scopelodé, Bombil, Bummalo, Loitta/Lottia/Lotia, and Loitta Shutki. No recipe currently requests this species or links to it. [R01]

The Montréal seller lists a **150 g net-weight** dried pack and instructs the customer to soak that product for **10–15 minutes**. The 150 g is package net weight; the soak time is a vendor instruction for that SKU, with no water amount, drain state, rehydrated yield, or generally applicable method. T&T's **250 g** amount and **200 °C for 8–10 minutes** refer to its ready-prepared crispy item. PriceSmart's **454 g** listing identifies an average package amount that may vary. These are source-specific retail observations, not recipe portions or reusable unit mappings. Add no density, household measure, conversion, yield, or package-yield record. [S04–S06]

The global and contextual substitution-rule files are empty, and the recipe scan found no affected recipe line. No source provides a tested, directional, quantity-bounded substitute for Bombay duck or a form conversion between dried, frozen, raw, and prepared products. Do not infer interchangeability with other finfish, dried fish, or poultry duck. Add no substitution rule or recipe-line link. [R01]

## Source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S01** | CFIA, [Fish List lookup for *Harpadon nehereus*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s&q=Harpadon%20nehereus) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), accessed 2026-10-16. | The results list TSN 162425, *Harpadon nehereus*, Bombay Duck, Scopelodé, Synodontidae. The overview says the list contains English/French common names acceptable for Canadian fish labelling plus scientific names and TSN. The list page is dated 2023-09-18; use it for Canadian common-name ownership, not as a current taxonomic revision. |
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S02** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), accessed 2026-10-16. | Says the Fish List collects Canadian French/English common names and that only the name(s) listed for a fish species should be used for that species sold or processed in Canada. This supports the name boundary, not catalog schema or culinary equivalence. |
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S03** | OQLF, [GDT: canard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428050/canard), accessed 2026-10-16. | The food/poultry entry defines `canard` as a palmiped aquatic bird of the Anatidae family and gives English `duck`. It supports keeping bare `canard` out of this fish row. Focused OQLF searches did not surface a fish-specific Scopelodé entry; that search result is not evidence that no OQLF record exists anywhere. |
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S04** | Belaamie, [Dry Lottia (150gm pack)](https://belaamie.com/product/dry-lotia/), accessed 2026-10-16. | Montréal local-pickup listing calls the product `Dry Lottia (Loitta Shutki)`, describes it as dried, gives 150 g net weight, and explicitly identifies *Harpadon nehereus* (Bombay Duck). It suggests soaking 10–15 minutes and use in bhorta/curries/fries. Seller product copy supports this SKU's naming/state/species link; it is not independent taxonomic review, a standardized French term, a recipe measurement, or a transferable hydration ratio. |
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S05** | T&T Supermarket, [Crispy Salt and Pepper Bombay Duck Fish (250g)](https://www.tntsupermarket.com/52429201-tnt-salt-pepper-bombay-duck-fish.html), accessed 2026-10-16. | Current Canadian retailer listing describes a ready-prepared 250 g item as made from wild-caught Bombay duck fish from the East China Sea and gives air-fryer instructions of 200 °C for 8–10 minutes. No scientific name is stated. The item description and package amount may change and are not raw-fish cooking or measurement evidence. |
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-S06** | PriceSmart Foods, [Smart Choice — Frozen Bombay Duck](https://www.pricesmartfoods.com/product/smart-choice-frozen-bombay-duck-id-00890265103666), accessed 2026-10-16. | Current Richmond, BC listing describes a 454 g frozen fish product as wild caught, headed/tail off, and gutted, with average weight varying by package. No binomial, French name, recipe, or cooking method is given. It is Canadian product-state evidence only. |
| **WP04-SECTIONP-BOMBAY-DUCK-R320-20261016-R01** | Read-only repository audit of [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, proposal/batch archive, substitution files, plan, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Supports exact-ownership search, catalog counts, picker projection, full recipe-corpus scan, and empty substitution-rule-file counts. Repository evidence only; proposal-local audit label, not a global ledger source. |

## Recommendation

**Recommend** adding one identity-only `PROTEIN` reference for *Harpadon nehereus*, displayed **Bombay duck fish / Scopelodé**, with no aliases, forms, measurements, recipe links, package yields, conversions, or substitutions. The name pair is listed by CFIA, and current Canadian listings demonstrate both Montréal dried-product recognition and other Canadian product states. Keep the dried Lottia/Loitta product wording and its vendor-specific soak instruction attached only to that source listing. The bundled recipe corpus does not establish recipe demand or reusable behavior. This is a distinct open regional-fish identity under the parent checklist; it does not claim that the generic preserved-fish form gap is complete.
