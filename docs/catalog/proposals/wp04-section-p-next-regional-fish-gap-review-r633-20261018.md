# WP04 Section P R633 — Almaco jack / *Seriola rivoliana* naming boundary

- **Status:** Reviewed and held on 2026-10-18. No active reference or ledger candidate was added. See the [R633 hold integration README](../batches/wp04-section-p-seriola-rivoliana-hold-integration-r633-20261018/README.md).
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** The broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6508).
- **Candidate:** Almaco jack, *Seriola rivoliana* (CFIA TSN 168691).
- **Recommendation:** **Hold** the candidate outside active references, forms, legacy identities, and the research ledger. Canadian sources verify the species and a current Canadian market product, but CFIA's French label `Sériole` overlaps other *Seriola* taxa and OQLF assigns Québec fish-market `sériole` to *S. dumerili*. The other CFIA French pair, `Sériole Limon`, has no matching OQLF or Québec product confirmation. Current Québec-facing retail evidence uses `Kanpachi` without a binomial or French product name.
- **Scope:** This review follows R334's explicit exclusion of unreviewed *Seriola* taxa. It does not revise the accepted Greater amberjack or Japanese amberjack rows, or reopen the separate R85 Hiramasa hold for *S. lalandi*.

## Why this is a distinct open gap

R334 integrated *S. dumerili* and *S. quinqueradiata* as separately qualified references and left *S. rivoliana* among the unreviewed *Seriola* taxa. Its Canadian storefront source showed `Kanpachi / Greater amberjack` without a binomial, so R334 kept `kanpachi` unallocated. R633 checks the currently available *S. rivoliana* evidence directly; it does not re-review the two R334 identities. [R334 proposal](wp04-section-p-seriola-amberjack-family-coverage-review-r334-20261016.md)

CFIA's Fish List identifies TSN 168691 as *S. rivoliana*. It lists two bilingual name pairs for that taxon: `Almaco Jack / Sériole` and `Jack / Sériole Limon`. The same list assigns `Sériole` to other *Seriola* rows, including *S. dumerili*, *S. zonata*, and *Seriola* spp. CFIA describes the Fish List as names acceptable for Canadian fish labelling, paired with scientific names and TSNs. These rows support Canadian label terminology and show that the shorter French term is not unique to *S. rivoliana*. [WP04-SECTIONP-ALMACO-JACK-R633-20261018-S01, WP04-FINFISH-GAPS-20261010-S11]

OQLF's edible-fish entry prefers `sériole` for *S. dumerili* and gives `greater amberjack` as English. The entry does not name *S. rivoliana* or normalize `sériole limon`. A targeted GDT search for *S. rivoliana*, `Almaco Jack`, `Sériole Limon`, and `Kanpachi` found no species-specific Québec entry. This makes the CFIA-only phrase `Sériole Limon` a possible Canadian label, but not a verified Québec display for the RecipeBook picker. [WP04-SECTION-P-SERIOLA-R334-20261016-S02]

There is direct Canadian food-market evidence for the species. Seafood Depot's current Vaughan product page names `Kona Kampachi`, identifies it as *S. rivoliana*, and lists `Almaco Jack` and `Kahala` as other names. It gives no Québec French label. True World Foods Canada's current product list includes `Hawaiian Kanpachi (Amber Jack)` and a separate `Kanpachi Fillet`, and lists a Montreal branch; the page does not give a binomial or French product name and says availability may vary by location. Thus the local product wording supports market presence, but it does not establish a bilingual, taxon-matched Québec display. [WP04-SECTIONP-ALMACO-JACK-R633-20261018-S02, WP04-SECTIONP-ALMACO-JACK-R633-20261018-S03]

As a further name-boundary check, the U.S. FDA Seafood List says `Amberjack or Kanpachi` is an acceptable U.S. market name for **ocean-farmed** *S. rivoliana*. That is U.S. labeling guidance, not a Canadian name rule. It confirms that `Kanpachi` is used for *S. rivoliana* in a defined market context; it does not resolve the Canadian storefront use of `Kanpachi / Greater amberjack` without a binomial. [WP04-SECTIONP-ALMACO-JACK-R633-20261018-S04, WP04-SECTION-P-SERIOLA-R334-20261016-S09]

## Exact disposition

**No active JSON delta.** Do not allocate `ingredient-ref-almaco-jack`, `candidate-almaco-jack`, any alias, or a new ledger record. Keep the existing R334 references unchanged:

- `ingredient-ref-greater-amberjack` — `Greater amberjack / sériole`, *S. dumerili*.
- `ingredient-ref-japanese-amberjack` — `Japanese amberjack / sériole du Japon`, *S. quinqueradiata*, with `hamachi` as its existing alias.

Do not add `Almaco Jack / sériole` as a bilingual row: the French display would duplicate the existing `sériole` display and would conflict with OQLF's *S. dumerili* scope. Do not construct `Almaco Jack / sériole limon`; CFIA lists `Almaco Jack / Sériole` and separately `Jack / Sériole Limon`, while no OQLF or Québec product source supports the combined pair. Do not add `Kanpachi`, `Kampachi`, `Kahala`, `Amberjack`, `Jack`, `sériole`, `sériole limon`, a binomial, or other common name as a picker alias. The reviewed Canadian listings either lack a species name or use the names in a way that does not settle a French taxon mapping.

The evidence supports a bounded *S. rivoliana* food-fish identity at the taxon level, but **does not support a bilingual Québec-facing identity under the current picker names**. Reconsider after a current Québec-facing product or terminology source pairs *S. rivoliana* with a distinct French name, or when picker behavior can represent the competing common-name scopes without repeating the `sériole` display. No culinary equivalence or substitution with the two active amberjacks, Hiramasa, or another fish is inferred.

## Active ownership, picker behavior, and recipe demand

The read-only snapshot contains **1,828 active ingredient references**, **157 forms**, **56 legacy-import identities**, and **2,199 research-ledger records**. Exact ownership searches found no active reference, form, legacy identity, or ledger record for `ingredient-ref-almaco-jack`, `candidate-almaco-jack`, *S. rivoliana*, `Almaco Jack`, `Sériole Limon`, `Kampachi`, `Kahala`, or the candidate's proposed R633 source-ID prefix. The R334 ledger rows remain the owners of the existing Greater and Japanese amberjack identities. The word `kanpachi` appears in prior R334 decision/source text, but is not an active reference, form, legacy identity, or identity-record owner. [R01]

The current picker projection follows the active reference terms and the phrase-first query behavior:

| Query | Current active result | Boundary finding |
|---|---|---|
| `greater amberjack` | Greater amberjack / sériole | Existing qualified result; unchanged. |
| `sériole` | Greater amberjack / sériole; Japanese amberjack / sériole du Japon | The French query already returns visibly different displays. Adding `Almaco Jack / sériole` would create a third result with a duplicate French display and an OQLF taxon conflict. |
| `Japanese amberjack`; `sériole du Japon`; `hamachi` | Japanese amberjack / sériole du Japon | Existing R334 row and alias remain unchanged. |
| `Almaco Jack`; `Seriola rivoliana`; `sériole limon`; `Kanpachi`; `Kampachi`; `Kahala` | No active result | No candidate identity or alias is added. |
| `amberjack` | Greater amberjack / sériole; Japanese amberjack / sériole du Japon | Existing two qualified choices remain unchanged. |

The manifest-ordered audit scanned **all 114 bundled recipe files and 1,123 ingredient rows** for *Seriola rivoliana*, `Almaco Jack`, `Sériole Limon`, `Kanpachi`, `Kampachi`, and `Kahala`. It found **zero recipe-file matches and zero ingredient-row matches**. No recipe link, form, recipe amount, reusable measure, density, unit mapping, conversion, yield, package yield, or substitution is supported.

## Source-ID and URL ownership

R633 source IDs below are proposal-local only. Reuse existing shared-ledger IDs for the CFIA overview and OQLF entry; do not duplicate their existing ledger source rows. The exact CFIA taxon-query URL, Seafood Depot product URL, True World Foods Canada page, and FDA Seafood List URL have no exact URL owner in the shared ledger. R334-S09 is cited from the archived R334 proposal; it was proposal-local there and is not a shared-ledger source row. [R01]

| ID | Source and evidence | Ownership and limit |
|---|---|---|
| **New `WP04-SECTIONP-ALMACO-JACK-R633-20261018-S01`** | CFIA, [Fish List lookup for *Seriola rivoliana*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Seriola%20rivoliana). TSN 168691; `Almaco Jack / Sériole` and `Jack / Sériole Limon`. | No exact query-URL or source-ID owner was found. Official Canadian fish-labelling terminology; the `Sériole` name is also used for other taxa. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing shared source ID reused for the list's Canadian labelling-name scope; it is not product-availability or culinary-equivalence evidence. |
| **Reused `WP04-SECTION-P-SERIOLA-R334-20261016-S02`** | OQLF, [GDT: sériole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198975/seriole). The preferred edible-fish term maps to *S. dumerili*; the entry does not list *S. rivoliana*. | Existing shared source ID owned by the R334 Greater amberjack ledger record; reuse it. This is terminology evidence, not current market stock. |
| **New `WP04-SECTIONP-ALMACO-JACK-R633-20261018-S02`** | Seafood Depot, [Kona Kampachi](https://www.seafooddepot.ca/product-konakampachi). Names *S. rivoliana*, Almaco Jack/Kahala, and product of Hawaii. | No exact URL or source-ID owner was found. Canadian retailer product evidence; its state, origin, whole/fillet options, and freshness details are seller-specific and do not become reusable forms or measures. |
| **New `WP04-SECTIONP-ALMACO-JACK-R633-20261018-S03`** | True World Foods Canada, [Fresh Seafood](https://trueworldfoods.ca/fresh-seafood-7/). Lists Hawaiian Kanpachi (Amber Jack), Kanpachi Fillet, and a Montreal branch. | No exact URL or source-ID owner was found. Québec-channel wording, but no binomial or French name; stated size and year-round schedule are vendor-specific and availability may vary. |
| **New `WP04-SECTIONP-ALMACO-JACK-R633-20261018-S04`** | U.S. FDA, [Seafood List: *Seriola rivoliana*](https://www.hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Seriola_rivoliana&set=SeafoodList). Acceptable market name `Amberjack or Kanpachi (Ocean-Farmed)`. | No exact URL or source-ID owner was found. U.S. legal market-name context only; it does not establish a Canadian accepted label. |
| **R334-S09, reused from proposal archive** | Seafood City, [weekly seafood picks](https://www.seafoodcitygi.com/), recorded in the [R334 proposal](wp04-section-p-seriola-amberjack-family-coverage-review-r334-20261016.md). The listing says `Kanpachi / Greater amberjack` without a binomial. | Existing proposal-local evidence, not a shared-ledger source entry. It supports the Canadian wording collision, not a species assignment. |
| **R01** | Read-only audit of current references/forms, legacy identities, ledger and source IDs, plan, roadmap, R334/R85 archive records, picker behavior, and all bundled recipes. | Repository evidence only. No shared file was modified. |

## Final recommendation

**Keep *Seriola rivoliana* on hold.** CFIA and a Canadian retailer establish the species-level English market identity; the Québec fish-channel evidence shows `Kanpachi` without species or French naming; CFIA's `Sériole` overlaps a different fish; and OQLF's normalized `sériole` term specifically identifies *S. dumerili*. No source-reviewed bilingual display preserves both Canadian species identity and Québec naming without duplicating or misassigning a current picker term. Keep all R334 and R85 decisions unchanged, add no reference or ledger candidate, and leave Section P open.

This is a proposal-only documentation change. No software tests or build/emulator checks were run; the bounded static checks were ownership, source-ID/URL, recipe-corpus, local-link, UTF-8/no-BOM, and whitespace review.
