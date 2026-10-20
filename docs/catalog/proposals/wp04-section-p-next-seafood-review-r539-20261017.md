# WP04 Section P R539 — frozen squid tube form review

- **Review date:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. See the [R537–R539 integration README](../batches/wp02-wp03-wp04-r537-r539-gap-review-integration-20261017/README.md).
- **Candidate:** Frozen squid tubes under the existing generic `calamari / calmar` identity.
- **Recommendation:** Add one frozen-tube form to `ingredient-ref-calamari`, using only the exact bilingual labels `frozen squid tubes / tubes de calmar congelés`. Do not add aliases, species, a new identity, recipe link, measure, conversion, yield, or substitution.
- **Verification:** Read-only source, ownership, picker, and complete manifest-corpus audit. No software tests, build, emulator, or deployment were run.

## Open gap and prior-work boundary

Section P remains open for seafood product coverage under the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6280), including the broader fish-product review item at [plan line 14748](../../RecipeBook-global-ingredient-catalog-plan.txt#L14776). The plan already distinguishes the recipe-backed calamari ring-cut form from the commercial breaded-ring identity. This proposal reviews one other current product presentation under the existing generic calamari identity: frozen tube-cut squid.

This is distinct from [R368](wp04-section-p-next-gap-review-r368-20261016.md), which describes ring-cut shape and links only recipe `023#1`; from [R470](wp04-section-p-next-seafood-review-r470-20261017.md), which created a separate breaded-ring product identity; and from the dried-squid and calamari-in-marinara holds ([R36](wp04-section-p-dried-squid-product-boundary-review-20261013-round36.md), [R160](wp04-section-p-calamari-in-marinara-product-boundary-review-r160-20261016.md)). None allocates frozen tubes. The current [R523 fish-floss](wp04-section-p-fish-floss-product-boundary-review-r523-20261017.md), [R526 salmon kama](wp04-section-p-next-seafood-review-r526-20261017.md), [R530 kamaboko](wp04-section-p-kamaboko-boundary-review-r530-20261017.md), [R533 herring roe on kelp](wp04-section-p-roe-on-kelp-boundary-review-r533-20261017.md), and [R536 frozen Pangasius fillets](wp04-section-p-pangasius-frozen-fillets-form-review-r536-20261017.md) reviews are separate product or fish boundaries and remain unchanged.

At proposal review, exact searches found no earlier `squid tubes`, `tubes de calmar`, or tube-cut decision, and the proposed form ID was unallocated. Integration now allocates that form under the existing calamari parent.

## Current identity and product scope

At proposal review, the generic reference `ingredient-ref-calamari` was displayed as `calamari / calmar` with the English alias `squid`, null density, empty unit mappings, and only the cut-only ring form. Integration retains those values and adds `ingredient-form-calamari-frozen-tubes`; the separate `ingredient-ref-breaded-calamari-rings` remains a coated prepared product.

Mayrand, a Québec food retailer, currently lists paired English and French pages for Sea Ray SKU 41555 as **Frozen U10 Squid Tubes 2.5 lb / Tubes de calmar U10 congelés 2,5 lb**. Its French page lists Québec store locations and a 1 × 1.13 kg package; stock status varies by store and was shown as “coming soon” when reviewed. Loblaws also lists **Tubes de calmar surgelés**, 680 g, on a French Canadian product page. Those listings support the bilingual commercial presentation, not one species or a universal processing state.

The Canadian supplier Seafood Depot identifies its own `Squid Tubes` product as *Illex illecebrosus*, cleaned, frozen tubes, with several count grades. This is SKU-level evidence for that supplier’s product only. Mayrand and Loblaws do not identify a taxon, so do not transfer the supplier’s species to the retail products or to the generic calamari identity. The OQLF entry for `calmar` gives English `squid` and lists more than one Latin genus; reuse the existing OQLF source ownership for the parent name. Do not add `encornet`, species names, or product-specific cleaning wording as aliases.

## Proposed catalog delta

One form only; the JSON below records the form added to the bundled catalog:

```json
{
  "id": "ingredient-form-calamari-frozen-tubes",
  "ingredientRefId": "ingredient-ref-calamari",
  "formCode": "frozen",
  "labelEn": "frozen squid tubes",
  "labelFr": "tubes de calmar congelés",
  "prepState": "frozen",
  "matchTermsEn": [],
  "matchTermsFr": [],
  "densityGPerMl": null,
  "notesEn": "Commercial frozen tube presentation under the generic species-unspecified squid identity. Sources do not establish whether the product is raw or cooked. No measure, density, conversion, yield relationship, or substitution is established.",
  "notesFr": "Présentation commerciale de tubes de calmar congelés sous l’identité générique sans espèce précisée. Les sources ne précisent pas si le produit est cru ou cuit. Aucune mesure, densité, conversion, relation de rendement ou substitution n’est établie.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

Keep the existing calamari reference and ring form unchanged. Do not add a separate “squid tubes” reference, an alias for `tubes`, state-free match terms, tentacles, or species. The form is limited to the documented frozen tube presentation; the sources do not establish raw or cooked readiness, cleaning for the Mayrand or Loblaws products, or species.

## Snapshot and ownership audit

Read-only snapshot taken 2026-10-17; hashes are SHA-256 over exact file bytes.

| Artifact | Current count | Bytes | SHA-256 |
|---|---:|---:|---|
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,802 | 589,056 | `d84e245608dabe7f33b9507f7d17590f84e6b10af19f3dcacac1f1e8fb2e14b6` |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 145 | 115,688 | `f24f5a06aec56d0d89a6d0c22d3453eca80239636d2db7ceb800a4a1ce01cc78` |
| [Legacy import candidates](../legacy-import-identities.v1.json) | 56 | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json) | 2,160 records; 9,933 source entries; 8,406 unique source IDs; 7,114 unique URLs | 10,072,128 | `1b3956a7878fe7084805b7283857650a1368c825c45b6a08356c391ea9edd1e7` |
| [Bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

At proposal review, the forms file had no frozen-tube form under calamari; exact normalized checks also found no owner for the bilingual form labels, partial product phrases, or proposed ID. The integrated form leaves the parent’s `calamari / calmar` and `squid` terms unchanged, and the breaded rings remain a separate active identity.

| Source or ID | Existing ownership | R539 treatment |
|---|---|---|
| OQLF `calmar` URL | Ledger source `WP04-S38`, attached to `ingredient-ref-calamari`; the same URL is cited in previous proposals. | Reuse only for the generic `calmar / squid` naming boundary. Do not create another ledger source row. |
| Mayrand frozen-squid category URL | Ledger source `WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S02`, currently attached to `ingredient-ref-breaded-calamari-rings` after R470 integration. It lists SKU 41555 alongside ring and breaded-ring products. | Reuse the existing source ID only for category-level product distinction; do not allocate a duplicate ID or claim that it identifies the Sea Ray species. |
| Mayrand French and English SKU 41555 detail URLs | No exact URL or source-ID owner at proposal review. | Sources S01 and S02 are now attached to the form record and remain tied to this product evidence. |
| Loblaws French product URL | No exact URL or source-ID owner at proposal review. | Source S03 is now attached to the form record for French product wording only, not Québec stock or species assignment. |
| Seafood Depot squid-tubes URL | No exact URL or source-ID owner at proposal review. | Source S04 is now attached to the form record; its species, cleaning, and grade statements apply only to that supplier’s product. |
| R539 source-ID prefix `WP04-SECTIONP-SQUID-TUBES-R539-20261017-` | No matching ID before integration. | S01–S04 are now registered on the form record; reused OQLF and Mayrand category IDs retain their existing source ownership. |

At proposal review, the Mayrand category URL already had one exact ledger owner and the OQLF URL had one exact ledger source ID, while the Mayrand detail pages, Loblaws page, and Seafood Depot page were unowned. Integration registered only their product-specific sources S01–S04; the reused category and OQLF IDs retain their existing ownership.

## Ingredient picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): attached form labels and match terms contribute to the parent’s search terms; an exact complete form phrase returns the parent with a form hint. The proposed form uses no extra match terms.

| Query | Current result | With proposed form | Picker effect |
|---|---|---|---|
| `frozen squid tubes` | No result | `ingredient-ref-calamari`, with frozen-tubes form hint | Adds the exact English product phrase. |
| `tubes de calmar congelés` | No result | `ingredient-ref-calamari`, with frozen-tubes form hint | Adds the exact Québec-facing French product phrase. |
| `squid tubes`; `tubes de calmar` | No result | `ingredient-ref-calamari`, no form hint | The partial state-free phrases occur inside the full labels, but only the full state-qualified label selects the form hint. |
| `calamari`; `calmar` | Two results: generic calamari and breaded calamari rings | Same two references | Existing identity and prepared-product results stay unchanged. |
| `squid` | `ingredient-ref-calamari` | Same single reference | Existing English alias remains unchanged. |
| `calamari rings` | Two references: `ingredient-ref-breaded-calamari-rings` and `ingredient-ref-calamari`; the latter has the existing ring-form hint | Same two references; the generic calamari result retains its ring-form hint | The broad phrase also matches the prepared breaded-ring identity. |
| `squid rings`; `calmar tranché en rondelles` | `ingredient-ref-calamari`, with the existing ring-form hint | Same result and ring-form hint | The R368 cut-only form remains intact. |
| `tube` | Three substring-fallback results | Same three plus `ingredient-ref-calamari` | Broad partial search adds one result because `tube` is a substring of the proposed `tubes` label. |
| `tubes` | No result | `ingredient-ref-calamari`, no form hint | Broad shape-only search gains the parent. |
| `frozen` | 14 results | 15 results, adding `ingredient-ref-calamari` | The broad state query remains multiple-result. |
| `congelés` | One result | Two results, adding `ingredient-ref-calamari` | The broad French state query remains multiple-result. |

The exact state-qualified bilingual queries receive the intended form hint. The picker does not create a second identity, change broad `calamari`/`calmar` or `squid` results, or alter the existing ring form. The only newly expanded broad partial terms are `tube`, `tubes`, `frozen`, and `congelés`, with the result counts shown above.

## Full manifest recipe scan

The read-only scan parsed all **114 manifest-listed recipe files** and all **1,123 structured ingredient rows**. It read **753,988 exact recipe-file bytes** and searched decoded JSON and ingredient rows for squid/calamari tube wording in English and French, including `squid tube(s)`, `calamari tube(s)`, `tube(s) de calmar`, and frozen tube phrases. It found **0 matching recipe files, 0 matching ingredient rows, and 0 linked rows**.

The only related cephalopod row is Recipe **023#1**, `140 g sliced calamari`, currently linked to `ingredient-ref-calamari` and `ingredient-form-calamari-rings`, with bilingual preparation specifying rings. Its steps hand-bread the rings; it does not request frozen tubes. Preserve the row and 140 g quantity unchanged and do not attach the proposed form.

Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path encoded as UTF-8, NUL, exact file bytes, NUL, in manifest order. The manifest-relative scan is complete for this bundled corpus and is not evidence about unbundled recipes.

## Numeric, form, and substitution limits

- **State and preparation:** Keep only the state `frozen` in the proposed form. The Mayrand/Loblaws pages do not establish species, raw/cooked readiness, cleaning, thawing behavior, or a general preparation method. Seafood Depot’s “cleaned, tubes only” wording belongs only to its own product.
- **Packages and grade:** Mayrand’s 1.13 kg unit and 12 × 1.13 kg case, Loblaws’ 680 g listing, and Seafood Depot’s U-10/U-5 and 11–20 count grades are product-specific. Do not infer pieces per kilogram, a kitchen portion, count-to-mass conversion, reusable package unit, edible yield, or equivalence among suppliers.
- **Measures and conversions:** No reviewed source establishes household volume, density, thawed/cooked yield, or a reusable tube count. Keep `densityGPerMl` null and add no unit mapping or conversion.
- **Substitution:** No cited source or bundled recipe establishes interchangeability between tube-cut squid, ring-cut calamari, tentacles, cuttlefish, octopus, or any fish. Add no global or contextual substitution, warning, or recipe-line rule.

## Source register

Sources were rechecked on 2026-10-17. IDs marked reused already belonged to the ledger; S01–S04 were proposal-local at review and are now registered on the form record.

| Source ID | Source and locator | Evidence used and limits |
|---|---|---|
| **WP04-SECTIONP-SQUID-TUBES-R539-20261017-S01** | Mayrand, [Tubes de calmar U10 congelés 2,5 lb](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/calamar-surgele/tubes-de-calmar-surgele-sea-ray-41555), product title, code 41555, package and store sections (lines 62–143). | Current Québec-facing French name, Sea Ray SKU, UPC, unit/case presentation, and Québec store locations. Stock is store/date dependent; U10 and package amounts are SKU details. The listing does not state species, whether raw/cooked, or that the product is cleaned. |
| **WP04-SECTIONP-SQUID-TUBES-R539-20261017-S02** | Mayrand, [Frozen U10 Squid Tubes 2.5 lb](https://mayrand.ca/en/our-products/frozen-food/frozen-seafood/frozen-squid/tubes-de-calmar-surgele-sea-ray-41555), product title and code 41555 (lines 13–37). | English counterpart for the same SKU/UPC. It supports the paired English label; it adds no species or readiness statement. |
| **WP04-SECTIONP-SQUID-TUBES-R539-20261017-S03** | Loblaws, [Tubes de calmar surgelés — 680 g](https://www.loblaws.ca/fr/tubes-de-calmar-surgel-s/p/20809866_EA?source=nspt), French product page and product ID 20809866_EA (lines 239–260). | Corroborates French retail wording for frozen tubes. The selected store at review was in Markham and availability is dynamic; it does not establish Québec availability, species, or general package behavior. |
| **WP04-SECTIONP-SQUID-TUBES-R539-20261017-S04** | Seafood Depot, [Squid Tubes](https://www.seafooddepot.ca/product-squidtubes), product identity and characteristics (lines 29–37); Canadian company address (lines 58–63). | Identifies this supplier’s tubes as *Illex illecebrosus*, cleaned, frozen, with U-10/U-5 and 11–20 count grades. This single product cannot identify the Mayrand/Loblaws listings or the generic calamari reference; its sizes are not a general conversion. |
| **Reused `WP04-S38`** | OQLF, [GDT: calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), preferred terms and English/Latin equivalents (lines 2–44). | Supports Québec `calmar` and English `squid` for the parent identity, while listing more than one Latin genus. Entry last updated in 1998; it does not define a tube form or any retail product state. Existing source owner is `ingredient-ref-calamari`; reuse it. |
| **Reused `WP04-SECTIONP-CALAMARI-RINGS-R368-20261016-S02`** | Mayrand, [Calamar surgelé](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/calamar-surgele), current product category. | Category-level context separates tube SKU 41555 from unbreaded ring, breaded ring, and other calamari listings. This exact URL is already owned in the ledger by the breaded-ring record; reuse the existing source ID only and keep each product’s details source-specific. |
| **WP04-SECTIONP-SQUID-TUBES-R539-20261017-R01** | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6280), active references/forms, legacy candidates, ledger, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), every listed recipe, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and existing proposal/batch archive. | Proposal-time snapshot, exact ID/phrase/source ownership, picker projection, 114-file corpus scan, and numeric/substitution boundary audit. No shared records were allocated during proposal review. |

## Static validation

At proposal review, the embedded form JSON parsed, matched the form schema, pointed to the existing parent, and used an unallocated form ID. Its four source IDs were unique against the ledger and archive. The integrated package and ledger now validate; the complete integration checks are listed in the linked README. Only the proposal file was written during the proposal phase.

## Recommendation

**Integrated: added only `ingredient-form-calamari-frozen-tubes`** under the existing species-unspecified calamari identity, with `formCode: frozen`, `prepState: frozen`, labels `frozen squid tubes / tubes de calmar congelés`, empty match-term arrays, and null density. The current Québec retail pair establishes the commercial tube presentation in both languages; Loblaws independently corroborates the French frozen-tube wording. OQLF supports the parent’s `calmar / squid` terminology, while Canadian supplier evidence confirms why a species must not be copied from one tube product to another.

Do not change the generic `calamari / calmar` reference or English `squid` alias; do not alter the R368 ring form, the breaded-ring identity, or recipe 023. The integration adds no recipe link and no numeric or substitution behavior. Root integrated the form and recorded the shared-data changes in the linked README; Section P remains open.
