# WP02 Section 04 A6 R158 — Jowari flour wording and picker boundary

## Review record

- **Reviewed and sources checked:** 2026-10-16.
- **Status:** Proposal only. This review changes no shared catalog, forms, legacy identities, ledger, recipes, generated files, checklist, roadmap, or integration README.
- **Open checklist:** Continue regional grain-flour review under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1452). R157's white-teff hold is already integrated; A6 remains open.
- **Candidate:** The English flour-qualified spelling `jowari flour` as a possible alias of existing `ingredient-ref-sorghum-flour`.
- **Proposal-local source-ID prefix:** `WP02-A6-JOWARI-FLOUR-R158-20261016-S01` through `S04`. The prefix and these IDs were absent from live ledger source IDs and proposal/batch archive text before drafting. They remain proposal-local because the recommendation is a hold.
- **New ingredient ID:** None proposed. `ingredient-ref-jowari-flour` was checked as an unallocated audit placeholder only.

## Recommendation

**Hold `jowari flour` off the active English aliases for now. Do not create a separate flour row.** Current Canadian flour listings use `jowari` as another name for sorghum: Natural Focus labels its product Sorghum Flour, identifies whole sorghum as the ingredient, and says sorghum is also known as `jowari`; Westpoint Naturals makes a similar statement on its Organic Sorghum Flour listing [S01, A3]. FSSAI's standard defines `Jowar Flour (Sorghum Flour)` as a product milled from *Sorghum bicolor*, and its food publication lists `Jwari (Marathi)` among sorghum's regional names [A1, S02]. This supports a sorghum relationship, but the Canadian wording does not use the exact product phrase `jowari flour` as a title or a package label.

The exact phrase has a material picker effect. With `jowari flour` added to the existing sorghum-flour aliases, the current phrase-first substring search would also make a bare `jowari` query return **only** `ingredient-ref-sorghum-flour`. FSSAI identifies `Jwari` as a regional name for sorghum grain, while the existing grain-sorghum reference has no `jowari` alias. The recent WP03 Section F grain review excluded `jowari` and `jwari` from its grain aliases based on its own source packet [A4]. This A6 proposal does not reopen that grain decision or claim that flour is the right singleton for a bare grain-name query.

Keep the English display `sorghum flour` and Québec French display `farine de sorgho`. Current Québec product-directory wording uses `Farine de Sorgho`, and OQLF lists `sorgho` as the preferred base term; neither source attests `farine de jowari` [S03–S04, A2]. Do not add `jowari flour`, `jwari flour`, `jowari atta`, bare `jowari`, or a French Jowari alias in this pass. Reconsider the qualified flour phrase after a separate grain-scoped review establishes how a bare Jowari query should route, or if search can preserve the `flour` qualifier.

## Wording boundary

| Phrase or identity | Recommendation | Evidence limit |
|---|---|---|
| `jowari flour` | Hold off `ingredient-ref-sorghum-flour` aliases. | Canadian sorghum-flour listings identify sorghum as `jowari`, but do not title a flour SKU `Jowari Flour`; the alias is a contextual construction from the flour product and crop synonym. [S01, A3] |
| `sorghum flour` / `farine de sorgho` | Keep existing displays on `ingredient-ref-sorghum-flour`. | FSSAI's Jowar Flour standard supports the sorghum-flour class. OQLF supports the Québec base term `sorgho`; a Québec product directory lists `Farine de Sorgho`. Neither is a Québec ruling on Jowari wording. [A1–A2, S03] |
| `jowar flour`, `jowar atta`, `guinea corn flour`, `sweet white sorghum flour` | Keep current accepted English aliases unchanged. | These have prior focused decisions on the existing sorghum-flour reference. This review neither broadens nor retracts them. [A1, A5] |
| `jowari` / `jwari` on grain sorghum | Leave unchanged. | The WP03 round-five grain review excluded these variants from that source packet. R158 records the search consequence and does not reopen or reverse the grain-level boundary. [A4] |
| `farine de jowari`, `farine de jwari` | Do not add French aliases. | Current OQLF and Québec product wording supports `sorgho` / `farine de sorgho`; no current Québec product source uses these transliterations. [A2, S03–S04] |
| Separate `jowari flour` identity | Do not create. | The sources point to sorghum flour, not a distinct milling product or a source-grain class separate from sorghum. [A1, S01–S02] |

## Exact ownership, ID, and archive audit

The current read-only package contains **1,530 ingredient references, 119 ingredient forms, and 61 legacy-import candidates**. The research ledger contains **1,875 records, 7,949 source entries, and 6,797 distinct source IDs**.

Exact normalized ownership was checked across reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and research-ledger record IDs. Normalization follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase NFKD normalization, accent and ligature folding, punctuation-to-space conversion, and whitespace collapse.

| Normalized phrase or ID | Current exact owner or result |
|---|---|
| `jowari flour`; `jwari flour`; `jowari`; `jwari`; `farine de jowari`; `farine de jwari` | No exact owner in references, forms, legacy candidates, or ledger record IDs. |
| `ingredient-ref-jowari-flour` | Absent from references, forms, legacy IDs, and ledger record IDs. Audit placeholder only; no identity is proposed. |
| `sorghum flour`; `farine de sorgho` | Exact owner: `ingredient-ref-sorghum-flour`. |
| `jowar flour`; `jowar atta`; `guinea corn flour`; `sweet white sorghum flour`; `farine douce de sorgho blanc` | Existing aliases of `ingredient-ref-sorghum-flour`. |
| `grain sorghum`; `sorgho à graine` | Exact display owner: `ingredient-ref-grain-sorghum`; no `jowari`/`jwari` alias is active. |
| Sorghum forms | No form is attached to either the current grain-sorghum or sorghum-flour reference; none of the 119 form labels or match terms exactly owns the candidate phrases. |
| Source-ID prefix `WP02-A6-JOWARI-FLOUR-R158-20261016-S` | No live ledger source-ID or proposal/batch archive hit before drafting. S01–S04 are proposal-local and are not ledger entries. |

The archive sweep found no prior WP02 A6 review of the exact flour-qualified phrase `jowari flour`. The only focused archive reference to bare `jowari`/`jwari` is the [WP03 Section F round-five grain review](wp03-section-f-next-cereal-gap-review-20261013-round5.md), which says not to add the regional spellings to the grain row from that review's evidence packet. The existing [Jowar-flour review](wp02-a6-jowar-sorghum-flour-terminology-review-20261012.md) accepted only the exact `jowar flour` alias and kept the grain row separate. This R158 decision addresses the uncovered `jowari flour` wording and its bare-query behavior, not either prior decision's source scope.

## Static picker projection

This is a static projection of current reference and form search terms using phrase-first matching followed by substring fallback. It is not runtime picker testing.

| Query | Current result | Result if `jowari flour` were added |
|---|---|---|
| `jowari flour` | No result. | `ingredient-ref-sorghum-flour`. |
| `jowari` | No result. | `ingredient-ref-sorghum-flour` only, because the query is a full word phrase inside the proposed alias. |
| `jwari flour`; `jwari` | No result. | No result; R158 does not propose the spelling `jwari`. |
| `jowar flour`; `jowar atta` | `ingredient-ref-sorghum-flour`. | Unchanged. |
| `sorghum flour`; `farine de sorgho` | `ingredient-ref-sorghum-flour`. | Unchanged. |
| `sorghum`; `sorgho` | Six sorghum-related references, including grain, puffed grain, flour, grits, semolina, and starch. | Unchanged; no generic sorghum alias is proposed. |

Holding the spelling leaves both the exact `jowari flour` and bare `jowari` queries unmatched. Adding only the flour-qualified alias would cause a bare grain synonym to select flour alone. Resolving that short query would need an independent grain-scope decision and a deliberate multi-result projection, or search behavior that requires the qualifier.

## Manifest-wide recipe scan

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `jowari flour`, `jwari flour`, bare `jowari`/`jwari`, French candidate phrases, existing Jowar flour aliases, sorghum-flour wording, sorghum-grain wording, and the existing/prospective IDs. The scan found:

- zero full recipe-file text hits for these candidate and neighboring sorghum terms;
- zero ingredient-row hits;
- zero links to `ingredient-ref-sorghum-flour`, `ingredient-ref-grain-sorghum`, or the unallocated `ingredient-ref-jowari-flour` placeholder.

The manifest-ordered corpus snapshot is **753,928 bytes**, SHA-256 **`0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`**. The fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order. No bundled recipe requires this alias, a new reference, a line amount, or a recipe link.

## Forms, measurements, conversions, yields, and substitutions

- **Forms:** Add none. The candidate is spelling coverage for the existing sorghum milling product; the current sorghum-flour and grain-sorghum rows have no attached forms.
- **Measures and density:** Do not add a reusable measure or density. Natural Focus's 2 kg value and Westpoint's package sizes are retail package quantities, not household measures. The current sorghum-flour reference has `defaultDensity: null` and `unitMappings: []`. Its ledger already contains a Westpoint product-label observation of 3 tbsp = 30 g, limited to that organic whole-grain product; it is not a universal mass-volume mapping. Keep that existing observation unchanged. [S01, A3, A5]
- **Conversions and yields:** Add none. FSSAI's flour standard supplies moisture and particle-size quality limits, not kitchen conversions, grain-to-flour yield, or cooking yield. The product pages do not establish a reusable yield or volume-to-mass relationship. [A1, S01]
- **Substitutions:** Add no active rule or new finding. Natural Focus describes baking uses and suggests combining its sorghum flour with tapioca starch, cornstarch, and/or legume flours without a ratio or controlled method. The existing sorghum-flour ledger already records blocked substitution research; leave it unchanged. [S01, A5]
- **Ledger scope if integrated:** Root may append S01–S04 as source records and a bounded held-alias decision to the existing `ingredient-ref-sorghum-flour` ledger record. Keep its verified identity, existing measurement state/observation, blocked substitution state/finding, French and English displays, aliases, category, active density, mappings, forms, and recipe links unchanged. No active reference, candidate row, observation, conversion, yield, or substitution rule is proposed.

## Source register

New source pages were checked on **2026-10-16**. Source IDs below are unique to this proposal; existing FSSAI, OQLF, and Westpoint sources are cited by their existing IDs and are not reallocated.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **S01 — WP02-A6-JOWARI-FLOUR-R158-20261016-S01** | Natural Focus Health, [Sorghum Flour — 2 kg](https://naturalfocus.ca/products/sorghum-flour), product heading, description, ingredient, uses, package listing. | Current Canadian retailer page names a Sorghum Flour product, says it is milled from 100% whole-grain sorghum, lists whole sorghum grain, and states sorghum is also known as `jowari`. The page listed a 2 kg package and an Add-to-Cart control at access. It does not title or label a product `Jowari Flour`, give a Québec name, or provide a household measure or substitution ratio. No stock claim is inferred. |
| **S02 — WP02-A6-JOWARI-FLOUR-R158-20261016-S02** | Food Safety and Standards Authority of India, [Healthy Food for Defence](https://www.fssai.gov.in/upload/knowledge_hub/19928164b641b8a487eHealthy%20food%20for%20Defence.pdf), “Sorghum” section. | Government food-information publication identifies *Sorghum bicolor* and lists `Jwari (Marathi)` among regional sorghum names. Supports the regional spelling family and grain context; it is not a flour-specific standard or Canadian/Québec naming authority. |
| **S03 — WP02-A6-JOWARI-FLOUR-R158-20261016-S03** | Aliments du Québec, [Farine de Sorgho](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-sorgho), Moissonneries du pays product listing. | Current Québec directory search result names `Farine de Sorgho`, lists Québec grocery channels and 10 kg / 20 kg formats. Direct page retrieval returned a cache miss at review time; the current indexed product wording is used for naming only, not availability or a household measure. It does not use Jowari wording. |
| **S04 — WP02-A6-JOWARI-FLOUR-R158-20261016-S04** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Répertoire des aliments québécois: Mélange à farine tout usage SG](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202592), ingredient list; last updated 2026-07-24. | The current Québec product record includes `farine de sorgho` among ingredients. It supports current local French ingredient wording, not a standalone product name or a Jowari translation. The record's whole-blend preparation instruction is not a sorghum-flour substitution or measure. |
| **A1 — existing FSSAI source** | FSSAI, [Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §2.4.18, PDF p. 58; ledger source `WP02-A6-JOWAR-FLOUR-20261012-S01`. | Defines `Jowar Flour (Sorghum Flour)` as product milled from grains of *Sorghum bicolor*. Its quality limits do not define household measures or Canadian flour behavior. Reused without re-registration. |
| **A2 — existing Québec terminology source** | OQLF, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), existing ledger source `WP02-A6-JOWAR-FLOUR-20261012-S03`. | Lists preferred Québec French `sorgho`, with English `sorghum` and Latin *Sorghum bicolor*. It concerns the plant term, not a Jowari flour product. Reused without re-registration. |
| **A3 — reopened existing Canadian source** | Westpoint Naturals, [Organic Sorghum Flour](https://westpointnaturals.shop/products/organic-sorghum-flour), existing ledger source `WP02-A6-MILO-FLOUR-PICKER-HOLD-20261013-R4-S03`, rechecked 2026-10-16. | The Canadian supplier's current listing names its product Organic Sorghum Flour and describes sorghum as also known as `jowari`; it says the flour is ground from whole organic sorghum and lists product of USA. Product/package and supplier claims remain specific to this page. The source ID is reused, not reallocated. |
| **A4 — related prior grain boundary** | [WP03 Section F R5 cereal-name review](wp03-section-f-next-cereal-gap-review-20261013-round5.md). | Keeps `jowari` and `jwari` off the grain-sorghum aliases based on that review's evidence. It does not review or decide a `jowari flour` alias. No decision is reopened by R158. |
| **A5 — current sorghum-flour ledger record** | Existing record `ingredient-ref-sorghum-flour`, including its accepted `jowar flour`/`jowar atta` and `guinea corn flour`/`sweet white sorghum flour` decisions, source-specific 3 tbsp = 30 g observation, and blocked substitution finding. | Reuse the current state and source history; do not duplicate source IDs, measurements, or substitution findings. |

## Proposal-only checks

Exact ownership, source-prefix, static picker, ledger-state, and manifest scans above are read-only. This proposal does not modify database JSON or application code; no tests or builds are required.
