# WP04 Section P R557 — swordfish steak / darne d’espadon picker-boundary review

- **Review and source-access date:** 2026-10-17.
- **Packet:** One swordfish cut form, bilingual product wording, source ownership, picker projection, recipe demand, package and measurement evidence, and substitution limits.
- **Integration status:** Accepted by root on 2026-10-17 as a documentation-only hold. The plan, roadmap, and R555–R557 integration README now record the decision; the shared catalog and ledger remain unchanged for R557.
- **Disposition:** **Hold the swordfish-steak form outside active data.** A recent Metro value-pack listing pairs `Swordfish Steak` with `Darne d’espadon` and identifies *Xiphias gladius*. However, the current picker’s substring fallback makes a generic `fish steak` query return swordfish alone. The existing Atlantic-halibut-steak form is not returned for that same broad query. No bundled recipe requests swordfish or this cut.
- **Candidate:** `ingredient-form-swordfish-steak` under the existing `ingredient-ref-swordfish`; candidate display if reopened: `swordfish steak / darne d’espadon`.
- **Worktree scope at proposal drafting:** This proposal file only; the shared catalog, ledger, plan, roadmap, recipes, and code were unchanged when the proposal was prepared.

## Exact checklist anchor and prior-work check

The open [Section P finfish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6343) includes salmon, cod, pollock, halibut, and regional fish. This proposal resolves only the swordfish cut-form boundary. Keep the broader parent open.

The current child at plan line 6320 integrates `Atlantic halibut steak / darne de flétan de l’Atlantique` under a different parent. It is direct evidence for the picker effect of a second species-qualified cut label, not ownership of swordfish or this form. R548's rainbow-trout-fillets hold, R551's Atlantic-halibut-cheeks hold, and R554's Haddock-loins hold concern different species and cuts; this review does not reopen them.

The earlier [swordfish identity review](wp04-section-p-swordfish-espadon-identity-review-20261012.md) integrated only `swordfish / espadon` for *Xiphias gladius*. Its R01 ownership audit found no form and explicitly kept forms out of scope. Its existing `WP04-SWORDFISH-ESPA-IDENTITY-20261012-S08` Pearlmark distributor page mentions steak and loin products, but it does not allocate a cut form, establish a Québec-facing cut label, or provide a recipe measure. No focused swordfish-steak form review or `ingredient-form-swordfish-steak` allocation was found in the current plan, active catalog, legacy candidates, ledger, or proposal/batch archive.

## Current ownership and source-ID audit

Read-only workspace snapshot on 2026-10-17: **1,805 ingredient references**, **148 forms**, **56 legacy candidates**, and **2,169 research-ledger records**. The ledger contains **10,016 source entries, 8,463 distinct source IDs, and 7,143 distinct source URLs**. The manifest covers **114 recipe files and 1,123 structured ingredient rows**.

| Current record or key | Current owner and state | R557 treatment |
|---|---|---|
| `ingredient-ref-swordfish` | Active `PROTEIN` identity displayed as `swordfish / espadon`; aliases empty; `defaultDensity: null`; `unitMappings: []`; no attached form. Its identity record is `verified`, its existing swordfish measurement evidence is source-specific, and its substitution finding is `researched_no_supported_substitute`. | Keep the parent unchanged. Reuse its existing species sources and no-substitute finding; do not duplicate or extend the parent identity. |
| `ingredient-form-atlantic-halibut-steak` | Existing `steak_cut` form under `ingredient-ref-atlantic-halibut`, with species-qualified labels, empty match terms, and null density. | Retain; its label is central to the `fish steak` projection check. |
| `ingredient-form-swordfish-steak` | No active form, ledger record, or legacy candidate. Exact form-ID search returned no owner. | Keep unallocated while the picker boundary is unresolved. |
| `swordfish steak`; `darne d’espadon`; product IDs 241275 and 225926 | No active name, alias, form, legacy, ledger-record, or exact-source URL owner was found. | Product sources and proposed R557 source IDs remain proposal-local. |
| OQLF `darne` source URL | Already owned by `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01`. | Reuse that source ID; do not re-register the URL under R557. It defines the Québec cut term, not swordfish-specific product use. |
| Swordfish identity evidence | Existing source IDs `WP04-SWORDFISH-ESPA-IDENTITY-20261012-S01` through `S08` belong to the current swordfish identity record. | Reuse the OQLF/CFIA/DFO identity sources, CNF observations, and Pearlmark product context only for their recorded scope. Do not create duplicate source IDs. |

The proposal-local prefix `WP04-SECTIONP-SWORDFISH-STEAK-R557-20261017-` was not found in the ledger, proposal archive, or batch archive before this file. New product/recipe URLs below were absent from the ledger. Existing owner IDs and URLs remain authoritative; the new IDs are not live ledger allocations.

## Product boundary and Québec names

Metro's **product 241275** value-pack page currently indexes the English title **Swordfish Steak, Value Pack** and French title **Darne d’espadon, Format économique**. The page reports an average of about **200 g each**, identifies *Xiphias gladius*, and gives Southeast Pacific / Chile origin and wild gillnet method. This is one Québec retailer's variable-weight product listing. The English and French routes are views of the same SKU, not independent products. Both URL paths place the listing under Metro's frozen-fish category, but the SKU title and product details do not explicitly say it is frozen; category placement alone does not establish its state, and no fresh-state inference is supported either. The English index crawl was last week and the French crawl yesterday relative to review; direct browser opens returned HTTP 403, while the indexed selected-store listing indicated out of stock. This confirms neither current local inventory nor a universal swordfish-steak specification.

Metro also indexes **product 225926** as **Frozen Swordfish Steak / Darne d’espadon surgelée**. It is a separate frozen SKU: the indexed page identifies *X. gladius*, gives a different origin (West Central Pacific / Vietnam) and handline method, and reported out of stock at the selected store. That English page's search-index crawl was about two months before this review; direct open returned HTTP 403, and the French route redirected to English. Treat the old indexed facts as stale corroboration only, with no current stock or listing-status claim. The French product title remains available in its indexed French route. This does not support labeling every swordfish steak frozen or merging its sourcing or package details with product 241275.

OQLF's [2025 `darne` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne), already owned by R545, defines a darne as a thick transverse raw cut of a large fish, gives English `fish steak`, and discourages `steak de poisson`. It names salmon and tuna as examples; it does not name swordfish. Metro's paired product label supplies the swordfish-specific English/French product wording. If a form is later accepted, use only the cut-level display `swordfish steak / darne d’espadon`; do not copy `Value Pack`, `Format économique`, `Frozen`, or `surgelée` into the reusable form, and add no aliases or generic match terms.

## Picker projection

The audit follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The picker returns complete normalized word-phrase matches first; only when none exist does it use substring fallback. Form labels and match terms are searched with the parent, and the form hint appears only for an exact normalized form label.

| Query | Current picker | With hypothetical `swordfish steak / darne d’espadon` form | Effect |
|---|---|---|---|
| `swordfish`; `espadon` | Swordfish parent | Same parent | Existing species queries remain unchanged. |
| `swordfish steak` | No result | Swordfish parent, with exact form hint | Exact English cut search works. |
| `darne d’espadon` | No result | Swordfish parent, with exact form hint | Exact Québec French product phrase works. |
| `darne` | Atlantic halibut | Atlantic halibut and swordfish | Adds a second species-qualified cut result, while other fish-steak forms remain unrepresented. |
| `steak` | Atlantic halibut, Montreal steak spice, steak sauce | Those results plus swordfish | The broad English query adds a second fish-cut result. |
| `fish steak` | No result | **Swordfish alone** | The fallback sees the substring `fish steak` inside the display `swordfish steak`; it does not return the existing Atlantic-halibut-steak form. This is the blocker: the generic phrase suggests a fish-cut family, but the picker would make it a swordfish singleton. |
| `steak de poisson` | No result | No result | Keep absent; OQLF discourages this wording. |
| `frozen swordfish steak` | No result | No result | Do not project the SKU-specific frozen state onto a cut-only form. |

The generic-query collision cannot be fixed by omitting match terms because the exact English display itself contains the substring. Keep `fish steak`, `fish steaks`, `steak de poisson`, generic `steak`, and generic `darne` out of parent aliases and form match terms. The current R545 form's generic `darne` singleton is preserved as an existing decision; this R557 candidate would expose a new English false singleton for `fish steak` while still not representing all matching fish cuts.

## Bundled demand and external recipe context

All **114 manifest-listed recipes** and **1,123 ingredient rows** were scanned for `swordfish`, `espadon`, *Xiphias gladius*, `swordfish steak(s)`, `fish steak(s)`, and `darne(s) d’espadon`. The scan found **0 matching files, 0 ingredient rows, and 0 linked rows**. The bundle therefore supplies no swordfish or swordfish-cut demand, amount, preparation, role, or reason to add a form.

Metro's older *Grilled Swordfish with Melon Salsa* recipe (published 2013-08-06 and still indexed) uses **2 lb (2 × 450 g) swordfish steaks, cut in two**, for four portions, and gives a recipe-specific grilling method. This establishes a Québec retailer's culinary use of the cut and a source-specific batch quantity; it is not a bundled recipe, a standard weight per steak, or a universal cooking instruction. The 241275 listing's approximate 200 g average item value is an unrelated SKU-specific observation and must not be reconciled into a standard with the recipe's 450 g pieces.

## Measurement, density, conversion, and substitution limits

The active swordfish identity ledger already records Health Canada's CNF code 3075: one **115.7 g** raw swordfish piece measuring 11 × 5 × 2 cm, a separate **90 g** food-guide serving, and 0% refuse. These are source-specific raw-food observations, not steak dimensions, a household serving, or a conversion. Metro's approximately 200 g value is specific to the variable-weight 241275 listing; the 450 g steaks belong to one Metro recipe. Their differences reinforce that none is a reusable swordfish-steak amount.

No reviewed evidence supports a swordfish-steak density, cup/volume conversion, universal count-to-mass mapping, standardized thickness, package yield, edible yield, cooked yield, or frozen-to-fresh conversion. If later accepted, this cut form should have null density and no active unit mapping, conversion, package-yield rule, recipe link, or default portion. The current identity's CNF observations remain attached to the parent with their existing source basis; do not transfer them to the form.

The existing swordfish ledger finding records no supported substitute. Metro's fish-counter article compares cooking swordfish with firm-fleshed fish such as halibut, sturgeon, and tuna, but cooking-style advice is not evidence of an equal amount or recipe substitution. No reviewed source tests a directed replacement between swordfish steak, Atlantic halibut steak, tuna steak, marlin, another fish cut, or a different product state with a defined role, amount, and method. Add no global form conversion, contextual rule, warning, or recipe-line link.

## Bounded decision and integration recommendation

**Hold `ingredient-form-swordfish-steak` outside active forms and the shared research ledger.** The product evidence supports the cut and a Québec-facing bilingual name, but under the current search implementation its natural English display makes the broad query `fish steak` resolve to swordfish alone, excluding the existing Atlantic-halibut-steak result. The complete recipe bundle has no matching demand.

Root accepted the hold as one checked child beneath the open Section P finfish parent. Make no reference, form, legacy, ledger, recipe, or substitution change. Keep the proposed form ID and R557 source IDs proposal-local. Reopen only when the picker can preserve the multi-species scope of `fish steak`, or when recipe/import demand and a reviewed search behavior resolve this collision.

## Sources and limits

Sources were accessed on 2026-10-17. Source IDs for new product and recipe pages are proposal-local; reused IDs remain owned by their original ledger records.

| Source ID | Source | Evidence and exact limits |
|---|---|---|
| `WP04-SECTIONP-SWORDFISH-STEAK-R557-20261017-S01` | Metro, [Swordfish Steak, Value Pack, product 241275](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/swordfish-steak/p/241275). | Indexed English listing gives the product name, approximately 200 g each, *Xiphias gladius*, Southeast Pacific / Chile, and wild gillnet method. Its URL is nested under the frozen-fish category, but neither title nor product details explicitly says this SKU is frozen. The index crawl was last week relative to review; direct browser open returned HTTP 403 and the selected-store listing showed out of stock. Average mass and sourcing are SKU-specific; neither product state nor current inventory is confirmed. |
| `WP04-SECTIONP-SWORDFISH-STEAK-R557-20261017-S02` | Metro, [Darne d’espadon, Format économique, product 241275](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/darne-d-espadon/p/241275). | Paired French route/title for S01, same SKU and product facts. Its category path is under frozen fish, but the indexed title/details do not explicitly identify frozen state; its index crawl was yesterday relative to review. Direct browser open returned HTTP 403; not independent product evidence. |
| `WP04-SECTIONP-SWORDFISH-STEAK-R557-20261017-S03` | Metro, [Frozen Swordfish Steak, product 225926](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-swordfish-steak/p/225926). | Separate indexed English listing identifies *X. gladius*, West Central Pacific / Vietnam, and wild handline method; the index reported out of stock at the selected store. Its crawl was about two months before review and direct open returned HTTP 403, so treat its status and product details as stale corroboration, not a current inventory or specification check. It gives no general swordfish state, amount, cut dimensions, or household measure. |
| `WP04-SECTIONP-SWORDFISH-STEAK-R557-20261017-S04` | Metro, [Darne d’espadon surgelée, product 225926](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/darne-d-espadon-surgelee/p/225926). | Indexed French title for S03's separate SKU. Opening the French route redirected to English; the title is not an independent product observation. The listing provides no current stock confirmation and must not be combined with 241275's mass or origin. |
| `WP04-SECTIONP-SWORDFISH-STEAK-R557-20261017-S05` | Metro, [Grilled Swordfish with Melon Salsa](https://www.metro.ca/en/recipes-occasions/recipes/grilled-swordfish-with-melon-salsa); French page [Espadon grillé à la salsa de melons](https://www.metro.ca/recettes-et-occasions/recettes/espadon-grille-a-la-salsa-de-melons), published 2013-08-06. | Metro's recipe specifies 2 lb / 2 × 450 g steaks cut in two for four servings and its own grilling directions. Recipe-specific amount and method, not a reusable measure, yield, or bundled demand; the paired routes describe one recipe. |
| **Reused `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01`** | OQLF, [darne (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne). | Defines the thick transverse raw fish cut, gives English `fish steak`, and discourages `steak de poisson`. Last updated 2025. Generic cut terminology only, not a swordfish product source. |
| **Reused `WP04-SWORDFISH-ESPA-IDENTITY-20261012-S01`, `S02`, `S03`** | OQLF [espadon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198924/espadon), CFIA [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/redirect-cfia-fish-list), and DFO [Swordfish species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/swordfish-espadon-eng.html) / [Espadon profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/swordfish-espadon-fra.html). | Existing ledger-owned sources establish the `swordfish / espadon` identity for *Xiphias gladius*. OQLF's species page was last updated 2011; the DFO profile was modified 2023-10-06. Identity only; do not reassign these IDs to the cut. |
| **Reused `WP04-SWORDFISH-ESPA-IDENTITY-20261012-S07`** | Health Canada, [CNF serving sizes, food code 3075](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3075). | Existing swordfish-level observations for a 115.7 g dimensioned raw piece, 90 g food-guide serving, and refuse value. They are not cut-form measures and remain attached to the parent with their current notes. |
| **Reused `WP04-SWORDFISH-ESPA-IDENTITY-20261012-S08`** | Pearlmark Foods, [Swordfish](https://www.pearlmarkfoods.com/our-products/swordfish). | Existing distributor page names *X. gladius* and steak/loin products and case sizes. It supplies no Québec French cut wording, consumer portion, or conversion. |
| **R01 — repository audit** | Current refs/forms, legacy identities, ledger/source URL ownership, plan, proposal/batch archive, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), manifest, and all listed recipes. | Workspace snapshot on 2026-10-17; confirms the stated ownership, picker projection, and zero bundle hits. No shared file was edited. |

## Integration status and static verification

The checked plan child records the broad-query collision and zero bundled demand. No active reference, form, ledger record, or source allocation was added for R557. Static review verified the current matcher’s partial-substring fallback and the Metro product/recipe distinctions documented above; UTF-8 and local Markdown links passed. No app tests, build, emulator run, or deployment were needed because this was a documentation-only hold.
