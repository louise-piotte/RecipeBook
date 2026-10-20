# WP04 Section P — calamari in marinara product-boundary review (R160)

- **Reviewed / sources accessed:** 2026-10-16.
- **Candidate:** The prepared seafood product marketed as **Calamari in Marinara Sauce / Calmar à la sauce marinara**, including O’Mer’s 115 g listing.
- **Recommendation:** **Hold** a separate product identity and any calamari form outside active references, forms, and the shared research ledger until a bundled recipe requests this prepared product.
- **Scope:** One composite, sauced product boundary. This does not reopen the generic calamari / calmar identity, marinara sauce, dried squid, squid ferments, or the general rule against universal canned or sauced forms.
- **Status:** Proposal-only. No shared catalog JSON, ledger, generated index, checklist, roadmap, README, or recipe changed. No tests, builds, emulator, or deployment work was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S01` through `S06`, plus audit ID `WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-R01`. They are not shared-ledger allocations.

## Open checklist and prior-work boundary

The [Section P seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4988) and the [preserved-fish product-state review](../../RecipeBook-global-ingredient-catalog-plan.txt#L11364) leave fish and seafood product boundaries open. That review keeps universal canned, packed, smoked, dried, and fermented forms inactive until an exact product or recipe calls for them. The [R158 smoked-trout integration](../batches/wp02-wp03-wp04-r158-gap-review-integration-20261016/README.md) and [R159 smoked-mussels integration](../batches/wp02-wp03-wp04-r159-gap-review-integration-20261016/README.md) accepted distinct named market products; neither allocates a squid product in sauce. The focused [dried-squid hold](wp04-section-p-dried-squid-product-boundary-review-20261013-round36.md) and [ika-shiokara hold](wp04-section-p-ika-shiokara-product-boundary-review-20261013-round39.md) address different product states and do not decide this prepared product.

This candidate is the O’Mer **calamari in marinara sauce** product and related retailer wording, not a new species name or a general form for plain squid. It contains a named sauce in the market title and is listed as a canned product. The existing generic calamari reference and the marinara-sauce reference remain separate. A package listing establishes a purchasable product boundary, but the bundled recipes do not ask for it.

## Québec wording and product evidence

OQLF prefers **calmar** as the Québec French food-mollusc term and gives English **squid**. It does not define or standardize the complete prepared-product name. [S01]

A Québec-facing Supermarché PA page names the brand **O’Mer**, displays the French title **Calmar à la sauce marinara**, shows **115 g**, and categorizes the item under canned products and fish. Its image alt text reads **Calamari In Marinara Sauce**. This is one seller’s listing; it does not expose a complete ingredient declaration or a transferable recipe quantity. [S02]

Apex Trades, a Montréal seafood distributor, separately shows the product label text **O’MER CALAMAR A LA SAUCE MARINARA** on its French brand page and **O’MER CALAMARI IN MARINARA SAUCE** on its English page. The pages support the bilingual product name and brand, but provide no formula, can details, or recipe use. [S03]

Marché Nuvo independently titles an O’Mer item **OMER, CALMAR EN MORCEAUX DANS SAUCE MARINARA 115G**. Adonis lists **O’mer Calamari in Marinara**, 115 g. These are retailer product listings, not specifications for every calamari-and-marinara product. L’Española in Montréal also lists **Calamars d’Espagne en Sauce Marinara**; its title supports a nearby French market wording but does not establish that it is the same product as O’Mer. [S04–S06]

Use `calmar` rather than `calamar` for the Québec base term. OQLF also lists `encornet`; the existing generic-calamari ledger decisions keep that term out of broad culinary aliases because its reviewed contexts are narrower. Preserve the retailer’s exact **à la sauce marinara** wording as the hypothetical French display only. Do not add `O’Mer`, `en conserve`, `calmar en morceaux`, `squid`, or `encornet` as aliases for a hypothetical product row. The reviewed pages do not identify a common squid species, one universal piece cut, recipe readiness, packing medium, sauce formula, or cross-brand equivalence.

## Exact ownership and ID/source audit

The live snapshot contains **1,534 references**, **119 forms**, **61 legacy candidates**, and **1,879 research-ledger records**. Exact normalized-key checks covered bilingual active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs/text.

| Candidate phrase or key | Current exact owner | Finding |
|---|---|---|
| `calamari in marinara sauce`; `calmar à la sauce marinara`; `calmar en morceaux dans sauce marinara`; `calamars d’Espagne en sauce marinara`; `canned calamari` | None in active names/aliases, forms, legacy candidates, or exact ledger record IDs. | No prepared-calamari-in-sauce identity or form is allocated. |
| `ingredient-ref-calamari-in-marinara-sauce`; `candidate-calamari-in-marinara-sauce` | Neither ID exists in references, forms, legacy candidates, or ledger record IDs. | Hypothetical IDs remain unallocated; this hold reserves neither. |
| `calamari`; `calmar`; `squid` | Active `ingredient-ref-calamari`, displayed `calamari / calmar`, with `squid` as its sole English alias. Category `PROTEIN`; no forms, density, or unit mappings. | Generic squid/calamari identity only. The exact OQLF source is already recorded there as `WP04-S38`; this proposal does not allocate another shared source entry for it. |
| `marinara sauce`; `sauce marinara` | Active `ingredient-ref-marinara-sauce`, category `SAUCE_AND_CONDIMENT`. | Sauce identity only; it does not own a seafood product containing that sauce. |
| `O’Mer` / `O'Mer` | No exact catalog or ledger identity owner. | Brand text stays product-source context and is not proposed as an alias. |
| R160 proposal-local source IDs `…-S01`–`S06` | No source-ID collision in the current ledger. The OQLF URL is already owned under `WP04-S38`; the five non-OQLF source records (retailer/distributor pages, with paired English/French URLs for S03) have no exact current ledger source entry. | Source labels are local to this proposal; no shared source IDs or ledger entries are allocated. |

No focused prior proposal, integration, active checklist decision, or roadmap item was found for calamari in marinara. The R160 source-ID prefix had no collision in the shared ledger or prior proposal/batch archive when checked; the hypothetical IDs remain absent from live seed data. [R01]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases match before substring fallback. The hypothetical row uses only `calamari in marinara sauce / calmar à la sauce marinara`, no aliases, and no forms. It is for impact analysis only.

| Query | Current result | Hypothetical result | Effect |
|---|---|---|---|
| `calamari in marinara sauce`; `calmar à la sauce marinara` | None | Prepared calamari in marinara | The product becomes directly searchable. |
| `calamari`; `calmar` | Generic calamari / calmar | Generic calamari / calmar plus prepared calamari in marinara | Broad seafood searches gain a second result. |
| `marinara sauce`; `sauce marinara`; `marinara` | Marinara sauce / sauce marinara | Marinara sauce plus prepared calamari in marinara | Sauce-only searches also return a composite seafood item. |
| `squid` | Generic calamari / calmar | Unchanged | The proposed display does not add `squid` as a product alias. |
| `canned calamari`; `O’Mer` | None | None | Neither term appears in the proposed display; no alias is proposed. |

The exact compound query would become useful, but the candidate adds overlapping results to both existing seafood and sauce terms without corresponding recipe demand. It should not be modeled as a form on generic calamari: the product title identifies calamari with a separate sauce, and no evidence says the product is equivalent to plain calamari for cooking or measurement.

## Bundled-recipe demand and numeric/substitution evidence

The manifest scan covered **114 recipe files / 1,123 ingredient rows**. It found no exact candidate phrase, brand, or hypothetical ID in recipe text or ingredient rows. The only related seafood row is recipe **023**, `140 g sliced calamari`, linked to `ingredient-ref-calamari`; it describes ring-cut calamari for breading and air frying, not a sauced canned product. Recipe **087** uses `1 cup marinara sauce` linked to the separate sauce reference. Neither line requests calamari in marinara, and they are not combined into one row. [R01]

The current `ingredient-ref-calamari` ledger record has `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, no measurement observations, and no substitution findings. Its sole recipe quantity is the corpus-specific 140 g line above; that amount does not support a package conversion, typical serving, sauce yield, or recipe link for this candidate. The marinara-sauce ledger record has blocked measurement research and no substitution findings. No calamari form or calamari substitution rule appears in the active package. [R01]

Retailer pages show **115 g package sizes** for the O’Mer listing, but that is package quantity only, not drained weight, edible portion, serving amount, household measure, density, or yield. No reviewed source supports a reusable measure or a conversion between plain calamari and the sauced product. No recipe or source supports a directed substitution between this product, plain calamari, marinara sauce, another seafood product, or another squid preparation. Add no form conversion, contextual substitution, warning rule, recipe-line link, or numeric value.

## Proposed delta

**No reference, alias, form, legacy mapping, source-ledger entry, or recipe link is proposed.** Keep both active references and all recipe rows unchanged. Do not allocate `ingredient-ref-calamari-in-marinara-sauce` or a candidate ID.

Reopen this boundary when a bundled recipe explicitly requests calamari in marinara or names the O’Mer product. At that point, decide from that recipe whether it needs a separately searchable prepared-product identity or only source-specific recipe context; then review the exact package state, amount, and any substitution evidence. Do not infer a product-to-plain-calamari conversion from the shared squid ingredient.

## Source register

All sources were accessed 2026-10-16. IDs below are local to this proposal. The OQLF URL is already represented in the ledger by `WP04-S38` and should be reused rather than duplicated if future integration requires it.

| ID | Source and locator | Support and limits |
|---|---|---|
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S01** | Office québécois de la langue française, [GDT: calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), preferred terms and English equivalent; updated 1998. | Supports Québec `calmar` and English `squid` in the food-mollusc domain. It does not standardize the prepared product or select a species for a retail can. Existing ledger source `WP04-S38`. |
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S02** | Supermarché PA, [O’Mer Calmar à la sauce marinara, 115 g](https://www.supermarchepa.com/products/omer-calamari-in-marinara-sauce-calmar-a-la-sauce-marinara-115g?view=fr), product title, brand, displayed package amount, department/category, and image alt text. | Direct Québec-facing French title and English image alt `Calamari In Marinara Sauce`; listed under canned products/fish. The page requires login to order and gives no full ingredient declaration or recipe measure. |
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S03** | Apex Trades, [French O’Mer brand page](https://www.apextrades.ca/fr/brands/view?id=109) and [English O’Mer brand page](https://www.apextrades.ca/en/brands/view?id=109), product image captions. | Distributor pages independently show the bilingual label text `O’MER CALMAR A LA SAUCE MARINARA` / `O’MER CALAMARI IN MARINARA SAUCE`. Captions do not specify formula, weight, species, or recipe use. |
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S04** | Marché Nuvo, [OMER, calmar en morceaux dans sauce marinara, 115 g](https://marchenuvo.ca/products/omer-calmar-en-morceaux-dans-sauce-marinara-115g), title and brand. | Corroborates French retailer wording for an O’Mer product. The listing does not establish the species, formula, drained amount, or a generic synonym. |
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S05** | Adonis, [O’Mer Calamari in Marinara, 115 g](https://livraison.groupeadonis.ca/store/adonis/products/29018822-o-mer-calamari-in-marinara-115-g), product title and displayed amount. | Independent Canadian retailer corroboration for English name and package size. The page showed out of stock when reviewed; that is not treated as current availability evidence. |
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-S06** | L’Española, [Calamars d’Espagne en Sauce Marinara, 115 g](https://lespanola.com/fr/products/calamari-from-spain-in-marinara-sauce-115g), product title and seller location. | Montréal retailer evidence for related French market wording from a different product. It does not establish equivalence to O’Mer, a common formulation, or a transferable culinary measure. |
| **WP04-SECTIONP-CALAMARI-MARINARA-R160-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4988), [preserved-fish review](../../RecipeBook-global-ingredient-catalog-plan.txt#L11364), current references/forms/legacy candidates/research ledger, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, substitution data, picker search code, and WP04 proposal/batch archive. | Read-only exact-key, ID/source-ID, archive, picker, form/substitution, and manifest audit at 1,534 refs, 119 forms, 61 legacy candidates, 1,879 ledger records, and 114 recipes / 1,123 ingredient rows. Snapshot only. |

## Final disposition

**Hold** this composite product outside the active catalog and ledger. Québec and distributor sources establish current bilingual product wording, but the product combines a broad existing calamari identity with a separately catalogued marinara sauce, creates overlapping picker results, and has no matching bundled recipe demand. The 115 g retail package is not a reusable recipe measure, and no product-specific conversion or substitution is supported. Add no reference, form, ledger record, alias, measure, recipe link, conversion, yield, or substitution. No tests were run for this proposal-only documentation change.
