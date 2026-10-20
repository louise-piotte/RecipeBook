# WP04 Section P R694 — canned sardines in olive oil boundary review

- **Review and source-access date:** 2026-10-18.
- **Open checklist:** Section P’s preserved-fish and seafood item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8067).
- **Candidate:** `canned sardines in olive oil / sardines en conserve à l’huile d’olive`, hypothetically `ingredient-ref-canned-sardines-in-olive-oil`.
- **Recommendation:** **Hold** the oil-specific product identity outside active data. Québec listings establish the product, but the corpus has no matching demand and the phrase `sardines in olive oil` also describes a smoked sardine product whose cut is unspecified. A new oil-only result would conceal that product boundary in the picker.
- **Status:** Integrated on 2026-10-18 as a documentation-only hold. The candidate and proposal-local source IDs remain outside active data. See the [R692–R694 integration README](../batches/wp02-wp03-wp04-r692-r694-gap-review-integration-20261018/README.md). No software tests, build, emulator, or deployment were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SARDINES-OLIVE-OIL-R694-20261018-S01`–`S03`; audit ID `WP04-SECTIONP-SARDINES-OLIVE-OIL-R694-20261018-R01`. None is allocated in shared data.

## Product evidence and scope

Mayrand currently lists Pastene **Sardines dans l’huile d’olive**, a 120 g product, and showed it in stock at its Anjou store; the Laval, Brossard, and Saint-Jérôme listings showed “Bientôt disponible.” This supports the Québec French product wording and location-specific availability, not general provincial stock or a reusable measure. The page does not identify the fish species. [S01]

NURI’s manufacturer catalogue separates **Sardines in Olive Oil** from spicy-oil and tomato-sauce variants and describes its products as canned sardines. Its specific 125 g product page confirms the English oil-packed name. These are manufacturer product claims, not a Canadian species assignment or evidence that all sardines in olive oil share one recipe or taxon. [S02–S03]

This candidate is distinct from the active generic `canned sardines / sardines en conserve` group and the separate tomato-sauce group added by R514. [R170 proposal](wp04-section-p-canned-sardine-product-boundary-review-r170-20261016.md) left packing media product-specific. The nearby [R256 review](wp04-section-p-gap-review-r256-20261016.md) integrated smoked sardine fillets but explicitly kept non-fillet-labelled smoked products out of that row. Its reused Nice Cans source, **Sardines fumées à l’huile d’olive biologique et au sel de mer**, documents a smoked sardine product in olive oil with no stated fillet cut. It does not identify that product as the plain Pastene/NURI product, but it shows that the broad oil-packed search phrase spans a smoke distinction. The separate tomato-sauce group was added in the [R514 review](wp04-section-p-next-seafood-review-r514-20261017.md). Keep these product boundaries separate.

## Ownership and exact picker projection

The active snapshot contains **1,838 ingredient references**, **171 forms**, **56 legacy candidates**, and **2,218 ledger records** (10,395 source entries; 8,775 distinct source IDs; 7,424 distinct URLs). Exact normalized checks found no active, form, legacy, or ledger owner for `ingredient-ref-canned-sardines-in-olive-oil`, `canned sardines in olive oil`, or `sardines en conserve à l’huile d’olive`. No earlier focused review assigned a plain sardines-in-olive-oil identity. R170, R256, and R514 are adjacent product decisions, not owners of the candidate ID.

The Mayrand and NURI URLs below have no exact shared-ledger URL owner. The Nice Cans URL is already owned by R256 source `WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S07`; reuse that source only for the smoked-product boundary. Reuse R170’s existing manufacturer source IDs for its canned-sardine scope and the existing OQLF sardine / Codex canned-sardine sources for terminology and product-standard context. Do not allocate duplicate source IDs or URLs.

The counterfactual below uses phrase-first matching from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is for review only; no ID is allocated.

| Field | Counterfactual value |
|---|---|
| ID | `ingredient-ref-canned-sardines-in-olive-oil` |
| English display | `canned sardines in olive oil` |
| Québec French display | `sardines en conserve à l’huile d’olive` |
| French alias | `sardines dans l’huile d’olive` (Mayrand’s product wording) |
| Other aliases | None |
| Density / unit mappings | `null` / `[]` |

| Query | Current picker | With hypothetical identity | Effect |
|---|---|---|---|
| `canned sardines in olive oil` | No result | Candidate only | Adds an exact English product query. |
| `sardines en conserve à l’huile d’olive` | No result | Candidate only | Adds the composed Québec French product query. |
| `sardines dans l’huile d’olive` | No result | Candidate only | Matches Mayrand’s exact French product wording. |
| `sardines in olive oil` | No result | Candidate only | This shorter phrase also appears within the reviewed smoked-product wording; the candidate would present it as an oil-only singleton. |
| `canned sardines` / `sardines en conserve` | Two results each: generic canned sardines and tomato-sauce sardines | Three results each | The qualified product names remain visibly distinct. |
| `sardines` | Five results: canned sardines, canned sardines in tomato sauce, European pilchard, Pacific sardine, and smoked sardine fillets | Six results | Broad search remains multi-result. |

## Full bundled-recipe demand and data behavior

I scanned all **114 manifest-listed recipes**, all **1,123 structured ingredient rows**, and all decoded recipe strings for sardine / sardines, canned sardines, olive-oil sardines, and the proposed English and French phrases. The manifest-ordered corpus snapshot is **754,048 bytes**, SHA-256 `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`. The scan found **0 matching recipe files and 0 matching ingredient rows**. There is no recipe link, amount, method, or substitution context for the candidate. [R01]

The listed package amounts (120 g at Mayrand and 125 g on the NURI product page) are product-specific. They establish no common can size, drained amount, serving, unit mapping, density, or yield. If the identity is reconsidered, use `defaultDensity: null` and `unitMappings: []`; ledger research states would be `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`, with no measurement observations or substitution findings. No reviewed source establishes a replacement between this product, generic canned sardines, tomato-sauce sardines, smoked sardines, or a raw sardine species.

## Bounded disposition

Keep the candidate outside active references, forms, legacy identities, and the shared ledger. Do not allocate `ingredient-ref-canned-sardines-in-olive-oil` or the proposal-local source IDs. Keep the current canned-sardine, tomato-sauce, and smoked-sardine records unchanged. Revisit if recipe demand selects the oil-packed product or a more specific search label can preserve the plain-versus-smoked distinction. Section P remains open.

## Source register

Sources were accessed 2026-10-18. S01–S03 are proposal-local and unallocated; already-owned URLs and source IDs are explicitly reused.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SARDINES-OLIVE-OIL-R694-20261018-S01** | Mayrand, [Sardines dans l’huile d’olive 120 g](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/sardines-dans-lhuile-dolive-pastene-49932). | Current Québec retailer product title, SKU/package amount, and store-specific stock listing. The item showed in stock at Anjou and “Bientôt disponible” at the three other listed stores. This does not establish province-wide availability, species, drained mass, or a reusable recipe measure. URL has no exact ledger owner. |
| **WP04-SECTIONP-SARDINES-OLIVE-OIL-R694-20261018-S02** | NURI, [official English product catalogue](https://nuriartisanalsardine.com/?lang=en). | Manufacturer lists sardines in olive oil separately from spicy-oil and tomato-sauce variants and describes traditional canned sardines. This does not establish Canadian stock or a species shared by other brands. URL has no exact ledger owner. |
| **WP04-SECTIONP-SARDINES-OLIVE-OIL-R694-20261018-S03** | NURI, [Sardines in Olive Oil, 125 g](https://nuriartisanalsardine.com/produtos/nuri-sardines-in-olive-oil/?lang=en). | Manufacturer product title and package format. The page does not identify a scientific species, provide a reusable measure, or establish Québec availability. URL has no exact ledger owner. |
| **Reused `WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S07`** | Nice Cans, [Sardines fumées à l’huile d’olive biologique et au sel de mer](https://justnicecans.com/fr/products/smoked-sardines-in-organic-olive-oil-and-sea-salt). | The existing R256 ledger source documents a smoked product packed in olive oil without a stated fillet cut. Reused only to preserve the smoke/product boundary; it does not identify the Mayrand or NURI product. |
| **Reused R170 / OQLF / Codex source IDs** | Brunswick Canada, [Frequently Asked Questions](https://brunswickcanada.ca/faq/); OQLF, [sardine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198919/sardine); FAO/WHO Codex, [CXS 94-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B94-1981%2FCXS_094e.pdf). | Existing ledger owners retain these URLs and IDs. Reuse only for the established species/product boundary, Québec base term, and broader canned-sardine product-standard scope; none settles this specific oil-packed identity or authorizes a species assignment. |
| **WP04-SECTIONP-SARDINES-OLIVE-OIL-R694-20261018-R01** | Read-only audit of the Section P plan and roadmap, R170/R256/R514 proposals and integrations, active references/forms, legacy candidates, ledger ID/URL ownership, `IngredientSearch.kt`, and the manifest recipe corpus. | Confirms snapshot counts, candidate/source ownership, picker projection, and recipe-demand result above; not a ledger source. |
