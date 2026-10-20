# WP04 Section P — ring-cut calamari form review (R368)

- **Review date:** 2026-10-16.
- **Status:** Proposal-only; no shared catalog, ledger, plan, roadmap, README, recipe, or code changed.
- **Scope:** One cut-shape form for the existing generic `calamari / calmar` identity. This does not add a species, a frozen or cooked state, a breaded product, a prepared seafood identity, or a preservation form.
- **Recommendation:** Integrate `calamari rings / rondelles de calmar` as `ingredient-form-calamari-rings` under `ingredient-ref-calamari`, and link only recipe `023#1` to that form. Keep its quantity and all numeric, conversion, yield, and substitution data unchanged.
- **Verification:** Read-only source, ownership, picker, and manifest checks only. No software tests, build, or emulator were run.

## Open gap and prior-work boundary

Section P remains open for fish and seafood identity and form work in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5864). Its seafood product-state checklist also remains open [at line 6851](../../RecipeBook-global-ingredient-catalog-plan.txt#L6869). This proposal selects one recipe-backed cut form on the already active calamari identity; it does not add a new seafood identity or decide a preservation state.

The focused [R36 dried-squid review](wp04-section-p-dried-squid-product-boundary-review-20261013-round36.md) holds a dried product and explicitly keeps it separate from the fresh/general calamari recipe row. The [R160 calamari-in-marinara review](wp04-section-p-calamari-in-marinara-product-boundary-review-r160-20261016.md) holds a sauced, canned product; it notes recipe 023's rings only to distinguish that recipe from the canned product. Neither review creates or links a ring-cut form. The archive search found those two contextual mentions, but no prior ring-cut form decision or allocation. R365’s GuineaSea dried-pagne hold is outside this candidate and remains unchanged.

## Existing identity and Québec wording

The live reference is `ingredient-ref-calamari`, displayed as **calamari / calmar**, category `PROTEIN`, with `squid` as its sole English alias. It has no attached form, density, or unit mapping. Its existing OQLF record `WP04-S38` gives preferred Québec French `calmar` and English `squid`; the OQLF page treats the item as an edible mollusc and does not define a ring-cut form. Reuse that existing source record rather than adding a duplicate ledger source.

The narrow form question is whether the cut shape stated in recipe 023 should be represented as a form. It is not a question about which squid species the recipe means. Keep `encornet` and species names outside the alias set, and do not infer a species from the retail listings.

## Recipe demand and current form data

The manifest lists **114 recipes**. A read-only parse covered all files and **1,123 ingredient rows**. Only `023#1` is a matching ingredient row: `140 g sliced calamari`, linked to `ingredient-ref-calamari`. The row already has structured bilingual preparation text: `preparation.en` is `sliced into rings`, and `preparation.fr` is `tranché en rondelles`. It has **no** `ingredientFormId` today. Thus the ring cut is explicit in structured recipe preparation text, but is not yet linked to a catalog form. The recipe instructions also describe coating those rings in flour, egg, and panko; that context does not make the purchased calamari breaded or precooked.

No other manifest-listed row matched calamari-ring terms. The 140 g amount is one recipe’s ingredient quantity; it does not establish a usual portion, ring count, per-ring mass, household measure, density, or package conversion.

## Product and terminology evidence

OQLF’s GDT entry prefers **calmar** for the edible mollusc and gives English **squid**. The entry is terminology evidence for the parent identity, not a cut-shape standard. [S01]

A Québec-facing Metro listing names a Blue Tide frozen product **Rondelles de calmar surgelé**, 454 g, and lists the product as rings. Its indexed ingredient panel includes squid rings plus water, triphosphate, citric acid, and sodium citrate. This is a specific frozen SKU and formulation, not a universal ingredient definition. The direct Metro page returned 403 during this review; its product listing was available in search indexing, so it is corroborating evidence rather than the sole basis for the recommendation. [S02]

Mayrand’s current Québec catalog separately lists unbreaded **Rondelles de calmar 454 g** and **Rondelles de calmar surgelées 2 lb**, as well as a distinct **Rondelles de calmar panées surgelées 2 lb** product. This supports `rondelles de calmar` as current Québec-facing product wording and shows that cut shape can be distinguished from breaded status. The listed package sizes are commercial SKU quantities only. [S03]

Use the qualified form phrase **calamari rings / rondelles de calmar**. Keep breaded or precooked rings, ring-and-tentacle mixes, frozen state, additives, and species out of the form definition. No retailer description or package amount is generalized to every calamari product.

## Ownership, ID, and URL uniqueness checks

The live snapshot contains **1,694 active references**, **139 forms**, **56 legacy candidates**, and **2,050 ledger records**. Exact normalized-key checks covered active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs. The proposed form ID `ingredient-form-calamari-rings` and candidate ID `candidate-calamari-rings` are unallocated. Exact keys `calamari rings`, `squid rings`, `rondelles de calmar`, `rondelle de calmar`, `calmar en rondelles`, and `anneaux de calmar` have no current reference, form, legacy, or ledger-record owner. No existing calamari form is attached to the live catalog.

The proposed source IDs `WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S01` and `…-S02` were checked against the shared ledger and pre-existing proposal/batch archive; neither has a collision. The OQLF URL below is already owned by ledger source `WP04-S38` and must be reused if a later integration writes sources. The Metro and Mayrand URLs below have no exact URL entry in the current shared ledger or focused WP04 archive; no shared source IDs or ledger records are allocated by this proposal.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): attached form terms contribute to the parent ingredient’s search entry, and a form hint is returned only for a complete phrase matching one form term. The proposed form stays attached to the one generic calamari reference; it does not create a second picker identity.

| Query | Current result | With the proposed form | Effect |
|---|---|---|---|
| `calamari rings`, `squid rings`, `rondelles de calmar` | No result | `ingredient-ref-calamari`, with the ring form available as the form hint | Adds a direct, qualified search for the recipe-backed cut. |
| `calamari`, `squid`, `calmar` | `ingredient-ref-calamari` | Same single reference | Does not change the generic identity result or add aliases. |
| `ring` | 16 existing unrelated or incidental phrase matches | Same 16 plus `ingredient-ref-calamari` | Broad partial search gains one result; the form label keeps the full calamari qualifier. |
| `rings`, `rondelles` | No result | `ingredient-ref-calamari` | Broad shape-only queries gain the calamari reference; no separate ingredient result is created. |

No broad standalone alias such as `rings`, `rondelles`, or `rounds` is proposed. Keep any English/French match terms product-qualified (for example, `squid rings` and `calmar tranché en rondelles`). The stable picker tradeoff is limited to generic shape-only queries; the exact bilingual phrases lead to the intended parent and form hint.

## Numeric and substitution limits

Preserve recipe `023#1` at **140 g** and retain its existing bilingual preparation text. Do not derive ring counts or per-ring weights. The Metro 454 g listing and Mayrand 454 g / 2 lb packages are package amounts; none is a serving size, recipe conversion, or form yield.

No reviewed source establishes density, household measure, frozen-to-fresh conversion, draining or thawing yield, cooked yield, or a reusable ring count. Add no default density, unit mapping, conversion, or yield. The form is a cut shape only and does not imply freezing, cooking, or breading.

No recipe or source supports replacing ring-cut calamari with squid strips, tentacles, cuttlefish, octopus, breaded or precooked rings, or another seafood product at a shared ratio. Add no global or contextual substitution, warning, or recipe-line substitution rule.

## Proposed catalog delta for coordinator review

- Add one form, `ingredient-form-calamari-rings`, under `ingredient-ref-calamari`, with form code/preparation state `ring_cut`, label `calamari rings / rondelles de calmar`, and only qualified ring-cut match terms.
- Link only recipe `023#1` to that form, preserving its existing 140 g amount, ingredient reference, original text, and bilingual preparation.
- Add no identity, parent alias, measurement, density, mapping, package yield, conversion, substitution, or shared-ledger source record.

## Source register

Sources were accessed on 2026-10-16. Source IDs below are proposal-local except the explicitly reused OQLF ledger ID. Direct URLs are provided for review.

| ID | Source and locator | Evidence used and limits |
|---|---|---|
| **WP04-S38** *(existing ledger source; reused)* | Office québécois de la langue française, [GDT: calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), preferred terms and English equivalent. | Supports Québec `calmar` and English `squid` for the edible mollusc. It does not define a ring-cut form. The exact URL is already in the shared ledger; do not allocate it again. |
| **WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S01** | Metro, [Rondelles de calmar surgelé Blue Tide, 454 g](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/rondelles-de-calmar-surgele/p/836443000433), product listing and indexed ingredient panel. | Québec retail wording and one frozen SKU; ingredient details indicate that SKU contains added water and processing ingredients. Direct page fetch returned 403, so use as corroboration, not as the sole source. |
| **WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S02** | Mayrand, [Calamar surgelé](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/calamar-surgele), current product listing. | Separates unbreaded `Rondelles de calmar` listings from `Rondelles de calmar panées surgelées`; product size and state remain specific to each SKU. This retailer evidence does not establish a universal formulation or measure. |
| **WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5864), current references/forms/legacy candidates/research ledger, [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipe files, [picker search code](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and WP04 proposal/batch archive. | Read-only ownership, source-ID/URL, picker, form-link, archive, and corpus audit at 1,694 references, 139 forms, 56 legacy candidates, 2,050 ledger records, and 114 recipes / 1,123 ingredient rows. Snapshot only. |

## Disposition

**Recommend integrate the one ring-cut form.** Recipe 023 already has a structured bilingual preparation specifying rings, and current Québec product listings confirm the same cut wording while distinguishing unbreaded from breaded products. A form under the existing generic identity answers that exact recipe need without assigning a species or preservation state. Keep the form numeric-free and substitution-free. This is a proposal-only review; root handles any integration decision and shared-data changes.
