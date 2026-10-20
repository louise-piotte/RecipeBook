# WP04 Section P — Pangasius market-group identity review (round 19)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only market-group identity, Canadian/Québec naming, picker, ownership, recipe-demand, measurement, and conservation-scope review.
- **Candidate:** Pangasius / pangasius, scoped to the CFIA-listed *Pangasius* spp. common-name group and retail products sold as pangasius or basa; no species is assigned.
- **Disposition:** **Add an identity-only group reference** as `ingredient-ref-pangasius-group`, category `PROTEIN`, with English display `Pangasius`, Québec French display `pangasius`, and English alias `basa`. This gives the documented group label and its current Québec retail synonym a group-level owner without selecting a species. Do not add `basa fish`, `swai`, `Bocourti`, `Sutchi catfish`, `poisson-chat du Mékong`, or generic catfish terms.
- **Worktree scope:** this proposal file only. No catalog JSON, research ledger, plan, roadmap, recipe, generated file, or other reviewer’s work was changed.

## Distinct open gap and identity boundary

The live Section P checklist and proposal/batch archive were checked after the round-18 Yellowmouth Rockfish hold. They contain no focused Pangasius identity decision, candidate, active reference, form, or recipe link. Exact and phrase searches across the current catalog, legacy-import identities, ledger, plan, and archive found no Pangasius, basa, swai, or *Pangasius* species allocation. This is a distinct unreviewed market group, not another rockfish species decision.

The narrow proposed identity is:

| Candidate ID | Category | English display | Québec French display | English aliases | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-pangasius-group` | `PROTEIN` | **Pangasius** | **pangasius** | `basa` | Group-level label following CFIA’s *Pangasius* spp. row and products sold under Pangasius/Basa wording; no scientific species assignment. |

CFIA’s Fish List returns a genus-group row, *Pangasius* spp., with the bilingual common name `Pangasius / Pangasius`. It also lists species-specific rows for *P. bocourti*, *P. hypophthalmus*, and *P. pangasius*. `Basa / Pangasius` is listed for both *P. bocourti* and *P. hypophthalmus*, so the English alias `basa` is useful only at the broader group level; it does not identify which species a product contains. Current Metro Québec and English routes for one SKU pair `Filets de pangasius` with `Frozen Basa Fillets`. These sources support one market-group reference while leaving the retail fish’s species unresolved. [R19-S01–S02, S06]

Do not make `Basa` the species display or add `basa fish`: CFIA’s `Basa Fish / Poisson-chat du Mékong` row is attached specifically to *P. bocourti*. Do not add `swai` or `Sutchi Catfish / Silure-requin`, which CFIA associates with *P. hypophthalmus*. Keep `Bocourti`, `Bocourti Catfish`, and `Bocourti Fish` species-scoped; do not add `poisson-chat du Mékong` as a market-wide French alias. Do not add `catfish`, `poisson-chat`, or `fish`/`poisson`: these are broader than the proposed group and would collide with unrelated fish-picker results. The CFIA names are Canadian fish-label guidance, not proof that an unlabelled product is a specific species or a recipe synonym. [R19-S01; reused CFIA guidance]

No direct OQLF preferred-term entry for `pangasius` or `basa` was located in the searches made for this review. The French display is supported by the bilingual CFIA group row and Metro’s current Québec-language retail wording; it is not presented as an OQLF preference. The Metro listing does not provide a Latin name, so do not resolve it to *P. bocourti*, *P. hypophthalmus*, or any other single species. [R19-S01–S02]

Keep *Pangasianodon gigas* (Mekong giant catfish) outside this market group. CITES’s current Appendices list that named species in Appendix I; the listing is taxon-specific and does not establish a legal status for all Pangasius-labeled products. Do not transfer that CITES status to the proposed *Pangasius* spp. market row or infer species from a trade name. This packet assigns no SARA, stock, harvest, or other conservation status to the group. [reused R17 CITES source]

## Exact ownership and picker projection

The exact-key audit used the app’s search normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, accent/ligature and punctuation folding, and collapsed spaces. The picker prefers complete normalized word phrases across reference names, aliases, and attached form terms, then falls back to substring matches.

The live snapshot contained **1,345 references, 98 forms, 64 legacy candidates, and 1,658 ledger records**. No exact key or ID owner exists for `pangasius`, `basa`, `swai`, `basa fish`, `poisson-chat du Mékong`, *Pangasius bocourti*, *Pangasius hypophthalmus*, or `ingredient-ref-pangasius-group` across the audited active references, forms, legacy-import identities, and ledger. There is no matching focused allocation in the plan or archive.

| Query | Current live picker | With the proposed row | Boundary |
|---|---|---|---|
| `pangasius` | No result | Pangasius / pangasius group only | Group-level display; does not name a species. |
| `basa` | No result | Pangasius / pangasius group only | Search-only alias for the two CFIA species rows carrying `Basa / Pangasius`; no species inference. |
| `basa fillets` or `frozen basa fillets` | No result | No result with the proposed base alias | The current picker requires the full query phrase to be present in a term. No product-state alias or frozen/fillet form is proposed. |
| `swai`, `Basa Fish`, `Bocourti`, `Sutchi Catfish`, `poisson-chat du Mékong` | No result | No result | Species-specific or broader label terms are deliberately excluded. |
| `catfish` | Brown bullhead and channel catfish | Same two references | No catfish alias or display term is added. |
| `poisson-chat` | No result | No result | The French phrase remains outside the candidate. |
| `fish`, `poisson` | Existing unrelated fish/product references | Same results | The proposed terms do not add either broad query. |
| `Pangasianodon gigas` | No result | No result | CITES-listed giant catfish remains outside the group. |

The proposed base name and alias provide exact picker results for `pangasius` and `basa` while the broader catfish terms keep their existing scope. The picker cannot display a taxonomic qualifier or choose a species from a bare retail label; that is why the row is explicitly group-level and omits species names.

## Canadian and Québec market evidence and limits

- **Canadian labeling names:** the CFIA Fish List query, whose page says it was modified 2023-09-18, returns *Pangasius* spp. as `Pangasius / Pangasius`. It also shows the overlap described above across the species rows. The dynamic Fish List query did not open directly in the browser during this review; its indexed query result supplied the rows, and CFIA’s accessible common-name guidance confirms the Fish List’s Canadian fish-labelling role. Treat the Fish List as naming guidance, not a culinary equivalence list or current retail inventory. [R19-S01; reused `WP04-ABALONE-20261011-S03`]
- **Current Québec retail wording:** Metro’s current product page is numbered **061763085499**. Its French route names `Filets de pangasius surgelés`; the English route names `Frozen Basa Fillets`. Both routes identify the same Catch of the Day SKU, list a **1 kg** package, and show ingredients `filets de pangasius` / `basa fillets, water, sodium phosphate`. The product pages supply no Latin name, farm, country of production, fishery, or lot traceability. Metro notes that product information can change and that price/availability depends on store and order date; no store-specific stock claim is made. A promotion date visible in an indexed product result had passed by this review date and is not used. [R19-S02, S06]
- **Retailer sourcing policy:** Metro’s policy page lists `Pangasius (Pangasius spp.)` under imported farmed fish in its continuous-improvement program. The policy describes supplier traceability for scientific name, provenance, and exploitation method, and says program suppliers must meet Metro requirements such as recognized certifications, conservation participation, and production improvements. This is Metro’s corporate sourcing category and policy, not a government conservation designation, a certification claim for SKU 061763085499, or proof of a specific farm/site. The page states that the policy was revised in 2022; its text was available in the current indexed result, while direct page retrieval returned an internal error. [R19-S03]
- **Québec government market context:** a MAPAQ sector diagnostic (publication code 20-0008) describes foreign-aquaculture products such as pangasius competing with Québec-caught groundfish. Its cited production and market figures are historical, including 2013–2017 data; it corroborates the imported-farmed market context but is not current sales, inventory, or species traceability evidence. [R19-S05]
- **Dated wholesale package examples:** the Aliments Chicoine catalog dated 2024-06-12 lists `Filet Basa 7 oz IQF (Pangasius) (Poisson) 1x4.54kg` and a separate retail-format Basa filet case. These are distributor SKU/case descriptions from that catalog date, not current availability or standardized fillet size and yield. [R19-S04]

Together the current retailer listing and Metro policy support a Québec market use of the group name and an imported-farmed product category. They do not establish that every product sold as basa/pangasius has the same species, origin, method, package state, or sustainability status. No Canadian wild fishery or Québec harvest status is inferred.

## Bundled recipe demand, measures, and substitutions

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and full recipe JSON text were scanned for `pangasius`, `basa`, `swai`, `poisson-chat du Mékong`, `bocourti`, `Sutchi catfish`, and *Pangasianodon gigas*. There were **zero matching recipe files and zero matching ingredient-row hits**. The manifest-ordered corpus was **753,792 bytes** with fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. No recipe link, requested species, product state, recipe amount, or substitute is supported.

| Evidence | Source-specific limit | Catalog consequence |
|---|---|---|
| Metro SKU 061763085499 is a 1 kg frozen-fillets package with water and sodium phosphate in its ingredient declaration. | One named retailer SKU; the declared package mass does not establish net Pangasius-flesh mass, portion count, or a fillet weight. | Do not add a 1 kg unit mapping, portion measure, net edible yield, default quantity, frozen form, or mass/volume conversion. |
| Chicoine’s 2024 catalog gives one 7 oz IQF basa-fillets case at 1x4.54 kg and a separate 10x2 lb retail-format case at 1x9.08 kg. | Dated, supplier-specific case formats; the 7 oz descriptor belongs to that item and is not a universal fillet/portion measure. | Keep these values as cited source observations only; do not transfer them into defaults or cross-SKU measures. |
| MAPAQ and Metro describe imported aquaculture at market/policy level. | Neither source identifies the species and origin of the Metro SKU’s lot or a validated preparation comparison. | Add no fishery measure, package yield, cooking yield, density, conversion, or sustainability flag. |

No evidence supports a global or contextual substitution from Pangasius/basa to cod, tilapia, catfish, or another fish. Add no form, recipe link, conversion, yield, or substitution rule. If a later recipe names `basa fillets`, the source phrase still needs its own picker/form review; this proposal does not turn the frozen fillet SKU into a global form.

## Source-ID and URL audit

New proposal-local IDs use `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-`; the prefix was absent from the current ledger and proposal/batch archive. The new Fish List query, Metro SKU routes, Metro policy, Aliments Chicoine catalog, and MAPAQ report URLs had no exact URL match in the ledger/archive. Reuse the exact prior ID when citing the already-documented CFIA guidance and CITES Appendices page. These source references are proposal-local; no shared ledger record was created.

| Source ID | Source and URL | Evidence and limit |
|---|---|---|
| **New `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S01`** | CFIA, [Fish List query for `pangasius`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=pangasius) | Lists *Pangasius* spp. as `Pangasius / Pangasius` and separate *P. bocourti*, *P. hypophthalmus*, and *P. pangasius* rows. The page says modified 2023-09-18. Fish-labelling names only; the dynamic query required indexed-result access in this review. |
| **Reused `WP04-ABALONE-20261011-S03`** | CFIA, [Guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Describes the Fish List as a collection of recognized English/French common names and says listed names apply to the species being sold or processed. Reused because the exact URL already has this source ID; not a recipe-search or product traceability rule. |
| **New `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S02`** | Metro, [French SKU 061763085499](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filets-de-pangasius-surgeles/p/061763085499) | French product route names pangasius fillets and gives the shared SKU, package, and ingredient declaration. It does not identify species, farm, or lot; availability and price vary. |
| **New `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S03`** | Metro, [Sustainable fisheries and aquaculture policy](https://www.bannieresdeproximite.ca/fr/produits-a-decouvrir/poissonnerie/notre-politique-de-peche-durable) | Metro lists Pangasius (*Pangasius* spp.) among imported farmed fish in its continuous-improvement program. Corporate policy text says policy revised in 2022; direct retrieval failed and current indexed text was reviewed. Not a government status or certification for a specific SKU. |
| **New `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S04`** | Aliments Chicoine, [2024 product catalog](https://www.alimentschicoine.ca/documents/catalogue.pdf) | Dated 2024-06-12, p. 73, two Basa filet case listings including a 7 oz IQF Pangasius case. Supplier-format evidence only, not current stock or transferable measures. |
| **New `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S05`** | MAPAQ, [Portrait-diagnostic sectoriel du flétan du Groenland](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/agriculture/types-de-productions/ED_portrait_diagnostic_industrie_fletan_MAPAQ.pdf) | MAPAQ publication code 20-0008, pp. 35–36, describes foreign-farmed pangasius as a competitor to Québec-caught groundfish. Market and production figures are historical; not current inventory or lot-level sourcing. |
| **New `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S06`** | Metro, [English route for SKU 061763085499](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-basa-fillets/p/061763085499) | English product route names Frozen Basa Fillets and gives the same product number, package, and ingredient declaration as the French route. It does not identify species, farm, or lot; availability and price vary. |
| **Reused `WP04-P-SPOTTED-WOLFFISH-20261013-S02`** | CITES, [Appendices I, II and III](https://cites.org/eng/app/appendices.php), valid from 2026-03-05 | Current table lists *Pangasianodon gigas* in Appendix I. This species-specific listing is not assigned to all Pangasius spp. products; it supports keeping the giant catfish separate. Same URL/source ID as the R17 proposal. |

## Recommendation and integration status

Add only the group-level identity projection `Pangasius / pangasius` with English alias `basa`, as described above. Keep species-specific names and broad catfish terms unassigned. Add no form, measure, density, mapping, recipe link, fishery/conservation status, conversion, yield, or substitution from this review.

At proposal time this packet changed no shared catalog JSON, ledger, plan, roadmap, or generated file. Root integration added the group-level reference and its source-backed identity decision; no species, form, measure, recipe link, conversion, yield, or substitution was added. No app, unit, instrumentation, or emulator tests were run under the updated `AGENTS.md` rule for database-JSON additions.
