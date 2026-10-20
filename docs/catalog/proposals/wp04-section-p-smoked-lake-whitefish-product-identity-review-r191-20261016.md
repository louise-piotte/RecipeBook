# WP04 Section P — smoked lake whitefish product identity review (R191)

- **Reviewed / source-access date:** 2026-10-16.
- **Status:** Integrated as one identity-only catalog row and bounded research-ledger record; the generic smoked-whitefish wording remains unallocated.
- **Candidate:** Species-scoped smoked lake whitefish / *grand corégone fumé*, *Coregonus clupeaformis*.
- **Recommendation:** **Add** one identity-only finished-food reference for smoked lake whitefish. Keep generic smoked whitefish / *poisson blanc fumé* unallocated and do not attach species-unknown listings to the proposed row.
- **Scope:** Fish of the already accepted lake-whitefish species that is sold or used as smoked fish, regardless of unestablished smoke temperature or cut. This does not set a universal smoked form, define smoked whitefish as one taxon, or reopen smoked cod, trout, salmon, mackerel, eel, haddock, herring, or fish spreads.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S01` through `S06`. They are unallocated. Existing OQLF and CFIA sources are explicitly reused under their existing IDs.

## Decision and identity boundary

The active [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt) leaves the preserved-fish item open: it retains the broad review of smoked, salted, dried, canned, oil-packed, water-packed, and fermented descriptors while allowing focused market-product decisions. The earlier [preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) rejected universal forms without a bounded product or recipe need; later packets added species- or product-scoped finished foods. This proposal follows the latter pattern for one species-qualified product. It does not add a `smoked` form to raw lake whitefish.

Canadian English and French food sources identify smoked *Coregonus clupeaformis* specifically. Freshwater Fish Marketing Corporation names *grand corégone* as *Coregonus clupeaformis* and says it is popular smoked. The Ontario government publishes a recipe ingredient as “smoked Ontario Lake Whitefish” in English and “grand corégone fumé de l’Ontario” in French. These support the bilingual, species-qualified product name `smoked lake whitefish / grand corégone fumé`. The OQLF standardizes *grand corégone* for *C. clupeaformis* and states that *poisson blanc* is not species-specific and was not retained as a Québec commercial fish-product name. [S01–S03; reused OQLF]

Current Québec marketplace evidence still needs a careful boundary. Wendake smokehouse Oushata lists *corégone fumé à froid* among its featured products, but the page does not name the species; its wording cannot establish that this item is lake whitefish. Toronto retailer FirstFish sells a “Hot Smoked Whole Whitefish” caught by Ile-a-la-Crosse fishers, but likewise gives no binomial or Québec French name. These listings corroborate current smoked-corégone/whitefish trade and demonstrate why the unqualified term must not be assigned to a species. Do not attach either listing’s product facts to the proposed *C. clupeaformis* reference. [S04–S05]

The proposed row describes the scoped fish product, not a fixed smoke process, salt/cure level, whole-fish or fillet cut, storage state, package, or readiness instruction. Oushata’s local product is expressly cold-smoked; the Ontario English recipe calls its product smoked without a process qualifier. Preserve those distinctions at the source level. Keep Québec-origin smoked-whitefish spread separate: the current La Boucanerie listing says it contains whitefish mixed with mayonnaise, so it is a composite, not plain smoked fish. Its 160 g package is spread-specific. [S04; S06]

## Archive and ownership audit

The live plan’s Section P preserved-fish checklist remains open. I reviewed its prior generic preservation decision and nearby focused product packets, including the [lake-whitefish identity](wp04-section-p-lake-whitefish-identity-review-20261012.md), [smoked cod R184](wp04-section-p-smoked-cod-market-boundary-review-r184-20261016.md), and [smoked eel R187](wp04-section-p-smoked-eel-product-boundary-review-r187-20261016.md) decisions. Those cover universal preservation-state boundaries, raw *C. clupeaformis*, and other distinct products; none allocates or holds `smoked lake whitefish`, `grand corégone fumé`, or `ingredient-ref-smoked-lake-whitefish`. The candidate is a species-scoped product group, not another generic smoked-fish decision.

Read-only ownership audit of the current bundle found 1,571 references, 122 forms, 61 legacy candidates, and 1,916 ledger records. The active reference `ingredient-ref-lake-whitefish` already owns `lake whitefish / grand corégone` for the raw/species identity; it has no attached forms. No active reference, form, legacy candidate, or ledger record owns the exact proposed names or proposed ID. The lake-whitefish ledger entry in the [research ledger](../research-ledger.v1.json) already owns OQLF source `WP04-LAKE-WHITEFISH-20261012-S04` and CFIA source `WP04-LAKE-WHITEFISH-20261012-S01`; these are reused rather than re-registered. The other source URLs and all six proposal-local IDs below had no exact ledger owner at review time. The lake-whitefish ledger’s 75 g Health Canada observation is for baked fish and does not transfer to this smoked product. Forms were also checked in the [active forms file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), and legacy ownership in the [legacy identities file](../legacy-import-identities.v1.json).

## Picker projection

The current picker normalizes accents and punctuation, prefers whole word phrases, and uses substring fallback only if no full-phrase result exists ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). A static projection against the live reference names and aliases gives:

| Query | Current result | With proposed reference |
|---|---|---|
| `smoked lake whitefish` | none | smoked lake whitefish only |
| `grand corégone fumé` | none | smoked lake whitefish only |
| `whitefish`, `lake whitefish`, `grand corégone`, `corégone` | lake whitefish | lake whitefish and smoked lake whitefish |
| `smoked whitefish`, `poisson blanc fumé`, `corégone fumé à froid` | none | none |

The qualified English/French phrases would directly find the proposed product. Shorter species queries would show both raw species and finished smoked product, making state visible rather than silently resolving a smoked product as raw. Keep aliases empty: adding `smoked whitefish` or `poisson blanc fumé` would incorrectly assign species-ambiguous wording to *C. clupeaformis*; do not add broad `whitefish`, `poisson blanc`, or `corégone` aliases.

## Recipe demand, measures, and substitutions

The manifest-listed corpus has **114 recipe files and 1,123 ingredient rows**. A read-only scan of every complete recipe JSON and ingredient-row field found **zero** matching files or rows for `smoked lake whitefish`, `smoked whitefish`, `smoked white fish`, `grand corégone fumé`, `corégone fumé`, `poisson blanc fumé`, or `lake whitefish`. The proposed identity has no bundled recipe link or user-recipe amount; the scan covered the recipe paths listed in the [active manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json).

Numeric evidence is recipe-specific. Ontario’s official smoked-whitefish dip calls for 1½ cups (375 mL) smoked Ontario lake whitefish, flaked, boned, and skinned, and yields four cups of dip. It does not report a fish mass or give a general conversion between smoked fish, raw fish, and volume. FirstFish’s current item has a size selector but no visible weight in the reviewed page; its $38 listing is price-only. La Boucanerie’s 160 g value is the package weight of a mayonnaise-based spread. Record no reusable portion, density, unit mapping, package yield, cooking yield, or conversion for the proposed reference. [S03, S05–S06]

The current global and contextual substitution-rule files contain **zero** rules. Neither the bundled corpus nor the reviewed sources gives a direction-, dish-, and method-specific quantity adjustment for replacing smoked lake whitefish with raw lake whitefish, another smoked fish, or species-unknown whitefish. Add no global or contextual substitution, warning, recipe-line link, or form-to-form conversion.

## Proposed data mapping if accepted

Add one `PROTEIN` ingredient reference:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-smoked-lake-whitefish` |
| `nameEn` | `smoked lake whitefish` |
| `nameFr` | `grand corégone fumé` |
| `aliasesEn`, `aliasesFr` | `[]`, `[]` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms and recipe-line links | None |

Add a research-ledger record under that ID with `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Link the proposed product/name evidence and the reused OQLF species terminology source. Keep `measurementObservations` empty: the source amount is a component quantity in one specific dip recipe, not one of the ledger’s reusable measurement relationships. Record a bounded no-supported-substitute finding and an accepted identity decision. Do not create a separate generic smoked-whitefish record, a legacy mapping, a lake-whitefish form, or an active recipe link.

## Source register

Pages were accessed on 2026-10-16 unless a source itself gives a different date. Each source ID below maps to one exact URL; the reused IDs retain their existing ledger URL ownership.

| Source ID | Source and exact URL | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S01` | Freshwater Fish Marketing Corporation, [Espèces](https://freshwaterfish.com/especes/) | Names grand corégone (*Coregonus clupeaformis*), describes whole, fillet, and minced product sales, and states that the fish is popular smoked. The current producer page does not specify a smoked SKU, process, cut, package, or recipe measure. |
| `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S02` | Foodland Ontario, [Smoked Lake Whitefish Dip](https://www.ontario.ca/foodland/recipes/smoked-lake-whitefish-dip) | Official Canadian recipe uses the exact “smoked Ontario Lake Whitefish” ingredient wording; it gives 1½ cups (375 mL), flaked, boned, and skinned, in a four-cup dip. This is a single recipe-specific amount, not a conversion or default measure. |
| `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S03` | Ontario terre nourricière, [Trempette de grand corégone fumé](https://www.ontario.ca/fr/terre-nourriciere/recette/trempette-de-grand-coregone-fume) | Official French counterpart uses `grand corégone fumé de l’Ontario` and the same recipe amount. It provides Canadian French usage, not a Québec SKU or universal product specification. |
| `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S04` | Oushata, [Fumoir artisanal](https://oushata.com/) | Current Wendake smokehouse page lists `corégone fumé à froid` among featured products and identifies the maker’s Québec location. It does not give a binomial; do not infer that the featured item is *C. clupeaformis*. |
| `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S05` | FirstFish, [Hot Smoked Whole Whitefish](https://www.firstfish.ca/product-page/smoked-whitefish) | Current Toronto retail listing names a whole hot-smoked “Whitefish” caught by Ile-a-la-Crosse fishers. It does not specify species or French display; the visible listing price and size selector do not provide a weight. |
| `WP04-SECTIONP-SMOKED-LAKE-WHITEFISH-R191-20261016-S06` | La Ferme Black River, [Smoked Whitefish Spread](https://lfbr.ca/product/smoked-whitefish-spread/) | Ontario retailer lists a Québec-origin La Boucanerie spread made from whitefish mixed with mayonnaise, with a 160 g package. This is a composite spread and its amount cannot be assigned to plain smoked fish. |
| Reused `WP04-LAKE-WHITEFISH-20261012-S04` | OQLF, [grand corégone (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199106/grand-coregone) | Directly pairs *grand corégone*, lake whitefish, and *C. clupeaformis*; identifies the Québec standardized term and warns that `poisson blanc` is broad and not species-specific. Last updated 2011. Reused from the existing lake-whitefish ledger entry. |
| Reused `WP04-LAKE-WHITEFISH-20261012-S01` | CFIA, [Fish List query: Lake Whitefish](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Lake%20Whitefish) | Existing source record distinguishes *C. clupeaformis* from a broad-whitefish taxon also called `Whitefish / Poisson Blanc`. Reused only for the species boundary; it does not identify either current smoked retail listing. |

## Reopen conditions and final disposition

The proposed reference is limited to *Coregonus clupeaformis*. Reopen this boundary if a recipe or current product uses only `smoked whitefish` / `poisson blanc fumé`, if a Québec label identifies a different corégone taxon, or if a maker specifies species, cut, cold/hot smoke, cure, storage, package, or readiness details that materially narrow a reusable state. A new recipe/source is also needed before recording a recipe-linked amount or a substitution. Any future reusable numeric entry must state its product and prep basis; do not derive it from the dip volume, spread package, or the baked lake-whitefish table observation.

**Disposition:** Integrated identity-only `smoked lake whitefish / grand corégone fumé` as a separate finished-food `PROTEIN` reference, with no aliases, forms, active measurements, mappings, recipe links, conversions, or yields. The ledger records a bounded no-supported-substitute finding. Generic `smoked whitefish / poisson blanc fumé` remains unresolved, and species-unknown Oushata or FirstFish items are not assigned to this row. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
