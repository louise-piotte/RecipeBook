# WP04 Section P R548 — rainbow-trout fillet picker-boundary review

- **Review and source-access date:** 2026-10-17.
- **Packet:** Finfish cut-form, bilingual naming, picker projection, source ownership, bundle-demand, and measurement/substitution review.
- **Status:** Integrated decision: hold the candidate form outside active data; no catalog or ledger entry was added.
- **Candidate:** A cut-only `fillet` form under the existing `ingredient-ref-rainbow-trout` identity.
- **Disposition:** **Hold the form outside active data for now.** Current Canadian and Québec product sources support the species-qualified names `rainbow trout fillet / filet de truite arc-en-ciel`, but the live picker would also match the broader phrases `trout fillet / filet de truite` to this one species alone. The bundled recipe corpus has no trout demand to justify that scope expansion.

## Open Section P item and exact prior-work check

The open Section P parent in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6337) still includes salmonids and regional finfish. R542's cutlassfish hold and R545's Atlantic-halibut steak form are separate decisions; neither resolves a trout cut. Keep the broader parent open.

Prior WP04 work established `ingredient-ref-rainbow-trout` as an identity-only *Oncorhynchus mykiss* row. The [finfish species follow-up](wp04-finfish-species-followup-20261009.md) explicitly added no form, measure, or substitution. R158 reviewed smoked-trout products, including smoked trout fillet, and deliberately kept those finished products separate from raw trout species; it did not allocate a fresh or state-neutral rainbow-trout fillet form. R201 reviewed canned trout as a species-neutral prepared-product group. R235 mentions rainbow trout only as a sibling while reviewing brown-trout identity. R268 records a source recipe's trout alternative but no bundled line, cut, or form. R545 concerns Atlantic halibut steak and does not assign a general fish-cut rule.

Before drafting this proposal, exact searches of active references/forms, legacy candidates, the ledger, proposals, batches, and the plan found no active owner or prior focused decision for `ingredient-form-rainbow-trout-fillet-cut`, `rainbow trout fillet`, or `filet de truite arc-en-ciel`. The only nearby `trout fillet` work is the R158 **smoked** trout boundary; its process and product state differ from this proposed cut-only form. Metro's paired SKU 223344 URLs and the Aliments du Québec product URL below have no exact URL owner in the current ledger.

## Product and Québec naming evidence

OQLF's edible-fish entry prefers **truite arc-en-ciel**, pairs it with English **rainbow trout** and *Oncorhynchus mykiss*, and distinguishes the freshwater farmed form from the marine/anadromous wording **saumon arc-en-ciel**. The page says four Québec salmonids are called trout and describes rainbow trout aquaculture and incidental commercial lake-trout capture. It is a terminology and identity source last updated in 2011, not current retail evidence or a product-cut definition. Keep `saumon arc-en-ciel`, `steelhead`, and bare `trout fillet / filet de truite` out of the active aliases.

Metro's paired English and French pages use the same product number, **223344**. The English page calls it **Fresh Ontario Rainbow Trout Fillet, Value Pack**; the French page calls it **Filet de truite arc-en-ciel fraîche de l’Ontario, Format économique**. Both identify *Oncorhynchus mykiss*, Canada provenance, farm raising, and two fillets per tray at about 900 g average. These are two language views of one retailer SKU, not independent products. The pages establish a species-qualified fish fillet presentation, but do not establish a general skin/bone condition, package size, portion size, fillet mass, or current availability at every store. Direct page opens returned HTTP 403; indexed product content was visible on the review date, so stock and any promotion are not claimed.

Aliments du Québec separately lists a Québec producer's product named **Filet de truite arc-en-ciel sans arêtes** and identifies Ferme Piscicole des Bobines as the producer. Its available formats are 5 lb and 10 lb and its listing names several retailers. This corroborates Québec product wording and local production, but the page does not supply a scientific name, confirm a consumer package, or define a reusable kitchen quantity. The specific `sans arêtes` wording applies to that product listing only.

## Current catalog and source-ID ownership

Read-only snapshot on 2026-10-17: **1,805 active ingredient references**, **147 forms**, **56 legacy candidates**, and **2,165 ledger records with 9,978 source entries / 8,444 distinct source IDs / 7,140 distinct URLs**. The manifest lists **114 recipe files** with **1,123 structured ingredient rows**.

The active parent `ingredient-ref-rainbow-trout` is displayed as `rainbow trout / truite arc-en-ciel`. Both alias arrays are empty; `defaultDensity` is null and `unitMappings` is empty. No active form is attached to it. Its existing identity ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`.

| Source or proposed ID | Current owner / R548 treatment |
|---|---|
| `WP04-FINFISH-FOLLOWUP-20261009-S01` | Existing ledger source on `ingredient-ref-rainbow-trout`; reuse the OQLF identity and Québec naming evidence. Do not create a duplicate source entry. |
| `WP04-FINFISH-FOLLOWUP-20261009-S02` | Existing ledger source on `ingredient-ref-rainbow-trout`; reuse DFO's *O. mykiss* and steelhead distinction. Do not create a duplicate source entry. |
| `WP04-SECTIONP-RAINBOW-TROUT-FILLET-R548-20261017-S01` and `-S02` | Proposal-local IDs for the English and French Metro product pages for SKU 223344. The IDs were unallocated before this proposal, and the exact URLs have no ledger owner. They are not being added to the ledger because the recommendation is a hold. |
| `WP04-SECTIONP-RAINBOW-TROUT-FILLET-R548-20261017-S03` | Proposal-local ID for the Aliments du Québec product listing. The ID was unallocated before this proposal, and the exact URL has no ledger owner. It is not being added to the ledger because the recommendation is a hold. |
| `ingredient-form-rainbow-trout-fillet-cut` | Unallocated candidate form ID. Do not add it while the picker boundary remains unresolved. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete word phrases inside a reference or form label are searchable; a form hint appears only for the complete form label. The existing picker currently returns seven references for `trout` and six for `truite`, while `rainbow trout` and `truite arc-en-ciel` each return the rainbow-trout identity alone.

The table below shows the exact effect if a cut-only form were added with only the source-backed labels `rainbow trout fillet / filet de truite arc-en-ciel` and no extra match terms. It is a projection only; no form was added.

| Query | Current picker | With hypothetical form | Form hint with hypothetical form |
|---|---|---|---|
| `rainbow trout fillet` | None | `ingredient-ref-rainbow-trout` | Yes |
| `filet de truite arc-en-ciel` | None | `ingredient-ref-rainbow-trout` | Yes |
| `trout fillet` | None | `ingredient-ref-rainbow-trout` only | No |
| `filet de truite` | None | `ingredient-ref-rainbow-trout` only | No |
| `trout` | Seven results: brook trout, brown trout, canned trout, lake trout, rainbow trout, smoked trout, and trout roe | Same seven results | No |
| `truite` | Six results: brook trout, brown trout, canned trout, rainbow trout, smoked trout, and trout roe | Same six results | No |
| `fillet` / `filet` | Seven results | Eight results, adding rainbow trout | No |

The exact qualified product searches would work, but the app's phrase matching would also turn both generic cut phrases into single-species choices. The returned display name includes the species, yet the query itself does not. No additional aliases or match terms can prevent that under the current picker behavior while retaining the proposed natural product labels. Keep the cut outside active data until generic trout-cut selection can preserve the ambiguity or a specific recipe/import establishes the intended species.

## Recipe demand, measurements, and substitutions

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `trout`, `truite`, rainbow-trout names, fillet/filet phrases, the binomial, and product number 223344. The scan found **zero matching recipe files and zero matching ingredient rows**. No row can be linked to the candidate, and there is no preparation, amount, role, method, or substitution request in the bundled corpus. This is limited to the bundled manifest, not unbundled or future recipes.

Metro's two-per-tray and approximately 900 g average describe only SKU 223344. Aliments du Québec's 5 lb and 10 lb formats describe that producer listing, not individual fillets. Neither source supports a typical per-fillet mass, household measure, density, serving, count-to-weight mapping, edible or cooking yield, or conversion. Keep the active parent's density and unit mappings unchanged; add no form, measurement observation, conversion, or yield.

No reviewed source or bundled recipe establishes a substitution between rainbow trout and brook, brown, or lake trout; steelhead; salmon; or another fish. OQLF's naming and species distinctions are not culinary equivalence evidence. Add no global or contextual substitution, warning, or recipe-line link.

## Bounded recommendation

**Hold only the proposed rainbow-trout fillet cut form** outside active references, forms, legacy mappings, and the shared ledger. Do not add a new identity, alias, or form; do not map `filet`, `fillet`, `trout fillet`, `filet de truite`, `steelhead`, or `saumon arc-en-ciel` to `ingredient-ref-rainbow-trout`. Preserve the existing species-qualified identity and its multi-result broad trout searches. Revisit this form if picker behavior can retain generic `trout fillet / filet de truite` ambiguity, or a recipe/import supplies species-specific demand. Section P and its broader finfish parent remain open.

The integrated review made no catalog or ledger change. No software tests, build, emulator check, or deployment were run.

## Sources and limits

Sources were checked on 2026-10-17. Existing ledger source IDs are reused rather than duplicated; new Metro and Aliments du Québec identifiers below remain proposal-local.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP04-FINFISH-FOLLOWUP-20261009-S01`** | OQLF, [truite arc-en-ciel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel), last updated 2011. | Pairs the Québec-preferred `truite arc-en-ciel` with `rainbow trout` and *O. mykiss*. Distinguishes freshwater farmed fish from marine/anadromous `saumon arc-en-ciel`; describes the Québec trout-name family and commercial exception. Terminology and historical market-context evidence, not a current retail listing, fillet definition, or recipe substitute. |
| **Reused `WP04-FINFISH-FOLLOWUP-20261009-S02`** | Fisheries and Oceans Canada, [Rainbow Trout](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/rainbow-trout-truite-arc-en-ciel-eng.html). | Confirms *Oncorhynchus mykiss* and distinguishes sea-run steelhead from landlocked rainbow trout. Species-profile evidence only; it does not define a food cut, current local retail stock, measurement, or substitution. |
| **`WP04-SECTIONP-RAINBOW-TROUT-FILLET-R548-20261017-S01`** | Metro, [Fresh Ontario Rainbow Trout Fillet, Value Pack, product 223344](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/salmon-trout-tuna/fresh-ontario-rainbow-trout-fillet/p/223344). | English page identifies the species, Canadian provenance, farm raising, and two-fillets-per-tray / approximately 900 g average package. Direct open returned 403; current indexed content was visible during review. One Metro SKU; package data are not a general measure, fillet weight, recipe portion, or current stock guarantee. |
| **`WP04-SECTIONP-RAINBOW-TROUT-FILLET-R548-20261017-S02`** | Metro, [Filet de truite arc-en-ciel fraîche de l’Ontario, Format économique, product 223344](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/saumons-truites-et-thons/filet-de-truite-arc-en-ciel-fraiche-de-l-ontario/p/223344). | French route for the same SKU as S01. Supports the paired Québec-facing wording; it is not an independent second product or a universal fresh-state rule. Direct open returned 403; availability and package-weight display can vary by store and date. |
| **`WP04-SECTIONP-RAINBOW-TROUT-FILLET-R548-20261017-S03`** | Aliments du Québec, [Filet de truite arc-en-ciel sans arêtes](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/filet-de-truite-arc-en-ciel-sans-aretes). | Lists a named Ferme Piscicole des Bobines product, 5 lb and 10 lb formats, and several retail/distribution channels. Product-specific wording and format only; it does not state the scientific name, consumer pack size, typical fillet mass, or current retailer inventory. |
| **R01 — repository audit** | Active references/forms, legacy candidates, research ledger, Section P plan and proposal/batch archive, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and every manifest-listed recipe. | Workspace snapshot on 2026-10-17. Confirms current IDs, source ownership, picker projection, and zero bundled candidate demand. No shared data files were changed. |


## Root source recheck and integration result

The hold is accepted because the current picker would make generic trout fillet / filet de truite queries resolve to rainbow trout alone, while the bundled corpus has no matching demand. Root could not independently retrieve Metro's proposed SKU 223344 pages (403). A separately opened Metro rainbow-trout fillet listing and the Aliments du Québec product page corroborate species-qualified fillet wording; neither supports a general fillet mass or measure. OQLF's entry confirms truite arc-en-ciel / rainbow trout and distinguishes saumon arc-en-ciel. No active data changed, and Section P remains open. See the [R546–R548 integration README](../batches/wp02-wp03-wp04-r546-r548-gap-review-integration-20261017/README.md).
