# WP04 Section P R574 — Alaska pollock frozen fillet form boundary review

- **Review date:** 2026-10-17.
- **Status:** Integrated as a bounded picker-boundary hold on 2026-10-17; no catalog or ledger data changed.
- **Plan anchor:** [Open WP04 Section P finfish item, lines 6378–6379](../../RecipeBook-global-ingredient-catalog-plan.txt#L6387). Keep the broad finfish parent open.
- **Scope:** One proposed frozen-fillet form beneath the existing `ingredient-ref-alaska-pollock`; no new fish identity, aliases, recipe link, or shared catalog change.
- **Decision:** **Hold the form outside active data.** Metro’s bilingual listing supports one frozen fillet SKU explicitly named as Alaska pollock, but this picker would make unqualified `pollock fillet(s)` and `filets de goberge` return Alaska pollock alone. The current names and CFIA list show that pollock/goberge also covers Atlantic pollock. The recipe bundle has no matching demand. Keep all R574 product IDs and evidence proposal-local; add no form or ledger record.

## Prior-work and ownership audit

The live Section P child checklist under the open finfish parent now includes the recent cod and halibut reviews. This is a separate existing-species product-form gap:

- **R545** added Atlantic halibut steak; **R554** held haddock loins; **R557** held swordfish steak; **R560** added Atlantic and Pacific cod loins; **R565** held Atlantic cod centre cut; **R568** added Pacific halibut steak; and **R571** added Greenland halibut steak. R574 does not reopen those species or cuts.
- **R536** added frozen basa fillets under the separate Pangasius group. That state-qualified form is a useful schema precedent, but it does not settle Alaska-pollock identity or picker scope.
- Earlier pollock work established the existing Alaska-pollock identity and kept it separate from Atlantic pollock. R398 addressed boneless salted pollock with species unspecified; R29 addressed crab-flavoured pollock flakes; R224 reviewed a multi-species fish-in-tempura product; R483 held generic fish burgers. None is a frozen raw Alaska-pollock fillet form.
- Exact repository searches for `Alaska pollock fillet`, `pollock fillet`, `goberge … filet`, the proposed form ID, and the two Metro routes found no earlier focused form review or source allocation. The active form list has no Alaska-pollock form.

The active catalog contains **1,805 references and 153 forms**. `ingredient-ref-alaska-pollock` is already verified as `Alaska pollock / goberge de l’Alaska`, with empty aliases, null default density, and no unit mappings. Its ledger record owns the existing species sources and remains at `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; R574 makes no parent-level state change. `ingredient-ref-atlantic-pollock` remains the separate `Atlantic pollock / goberge de l’Atlantique` identity, with its own sourced French alias. The same pollock query also finds the separately scoped boneless-salted-pollock and crab-flavoured-pollock-flakes rows.

The candidate form ID `ingredient-form-alaska-pollock-frozen-fillets` is absent from active forms and the research ledger. Proposed source IDs `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S01` through `-S03` are unused; each cited R574 route URL has zero current ledger source entries. They remain proposal-local because the decision is a hold. Reuse the already owned Alaska-pollock identity sources `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01` (CFIA Fish List) and `-S03` (OQLF GDT), and the Atlantic-pollock source `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S09` (Sea Star Seafoods), if this boundary is revisited; do not create duplicate source records for those URLs.

## Bilingual product evidence and species boundary

| Proposal-local source ID | Source observation | Scope and limits |
|---|---|---|
| `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S01` | Metro, [Frozen Alaska Pollock Fillets, product 226631](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-alaska-pollock-fillets/p/226631). The indexed listing gives `1 per tray`, `300 g avg.`, product number **226631**, and an ingredient/taxon line `(Gadus chalcogrammus)` with origin Northwest Pacific, Russia; wild, trawl. | The English page title explicitly says frozen Alaska pollock fillets. The route is also under Metro’s frozen aisle. This is one retailer SKU, not an independent weight standard or species-wide form claim. The search index reported it crawled last month as of this review; direct opening returned HTTP 403. Its selected-store state says out of stock, which does not establish nationwide unavailability or current stock elsewhere. |
| `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S02` | Metro, [Filets de goberge de l’Alaska surgelés, product 226631](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filets-de-goberge-de-l-alaska-surgeles/p/226631). The indexed French listing gives the paired title, same product number **226631**, `1 par barquette`, `300 g env.`, and the same taxon/origin/method text. | This is the French route for the same Metro item, not a second independent product or package-weight observation. The title and route identify the frozen state. Direct opening also returned HTTP 403; the evidence is the indexed product snapshot, not a live checkout or direct label inspection. |
| `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S03` | Supermarché PA, [fish department listing](https://www.supermarchepa.com/collections/all/fish-department?page=2&view=fr), currently indexed as `Filets de goberge Atlantique frais`, approximately 400 g. | A separate Québec listing, not Metro SKU 226631. It supplies a French Atlantic-qualified fillet phrase and listing-specific approximate package amount, but no binomial, English counterpart, item SKU, or link to the Metro product. Its search snapshot was crawled last week. |

The exact English/French SKU pair supports the bilingual display wording `frozen Alaska pollock fillets / filets de goberge de l’Alaska surgelés`. Its product-declared taxon is *Gadus chalcogrammus*. Reused parent-owned sources add authoritative naming context:

- The CFIA Fish List [Pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock), already recorded as `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01`, lists *G. chalcogrammus* with `Alaska Pollock` and French `Goberge`, while it also lists *Pollachius virens* as `Pollock`. It was modified 2023-09-18. This supports the taxonomic boundary and explains why the unqualified English market name must not be assigned to one species.
- The OQLF GDT [goberge de l’Alaska entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199004/goberge-de-lalaska), already recorded as `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S03`, identifies the preferred Québec French name and lists English equivalents including `Alaska pollock`. Its last update is 2011 and it uses the former taxon *Theragra chalcogramma*. It supports the Québec wording, not current taxonomy or current inventory; the CFIA list and Metro listing supply the current taxon context.
- Atlantic-pollock fillets have separate source-backed market use: the current PA listing above gives `Filets de goberge Atlantique frais`, while the existing Atlantic-pollock ledger source `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S09` is a Canadian supplier page titled `Atlantic Pollock Fillets (Pollachius virens)` that says the fish may also be called `Goberge` and distinguishes Alaska pollock. The PA listing does not identify a taxon; Sea Star is not a paired Québec SKU. Together with CFIA’s overlapping generic names, these product sources explain why a bare pollock/goberge-fillet query cannot safely become an Alaska-only result.

The Metro pages are retailer product evidence, and their crawl snapshot does not establish stock availability beyond the page’s selected-store notice. They do not establish the fish’s processing details beyond the listed frozen state, the number of fillets in one tray, mass per fillet, skin/bone status, or a general Alaska-pollock market norm. Do not add `pollock`, `goberge`, `lieu de l’Alaska`, the old binomial, or the product’s origin as parent aliases.

## Picker projection

The static projection used the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior: normalized complete word phrases are returned first; substring matching runs only when no complete phrase matches. Forms are searched on their parent reference, and only an exact full form label produces a form hint. The counterfactual uses the two labels above and no `matchTermsEn` or `matchTermsFr`.

| Query | Current projection | With proposed form | Effect |
|---|---|---|---|
| `frozen Alaska pollock fillets` | No result | Alaska pollock | Exact English form phrase; one result and an exact form hint. |
| `filets de goberge de l’Alaska surgelés` | No result | Alaska pollock | Exact French form phrase; one result and an exact form hint. |
| `Alaska pollock` / `goberge de l’Alaska` | Alaska pollock | Alaska pollock | No reference-count change; neither shorter query is an exact form hint. |
| `pollock` / `goberge` | Four references: Alaska pollock, Atlantic pollock, boneless salted pollock, and crab-flavoured pollock flakes | The same four references | Broad market-name ambiguity remains visible. |
| `pollock fillet` / `pollock fillets` | No result | Alaska pollock alone | **Unsafe species singleton:** the proposed full display contains the unqualified contiguous phrase. |
| `filets de goberge` | No result | Alaska pollock alone | **Unsafe species singleton:** the proposed full French display contains this generic phrase before the species qualifier. |
| `fillet(s)` | Seven fish references | Eight after Alaska pollock is added | Multi-result. |
| `filet` / `filets` | Two / seven fish references, respectively | Two / eight after Alaska pollock is added | Both remain multi-result; the broader counts do not remove the unqualified `pollock fillet(s)` / `filets de goberge` collision above. |
| `frozen pollock` / `surgelés goberge` | No result | No result | The product display does not match these reordered phrases. |

The bilingual labels are sufficiently species-qualified as product titles, but this picker does not require the qualifier when a shorter complete phrase occurs inside a label. Since generic `pollock` maps to both Alaska and Atlantic pollock in the CFIA list, the new singleton queries would imply a species choice that the user did not make. Do not try to solve this by adding aliases: aliases would widen the same collision. Reopen the form only after picker behavior can preserve generic pollock-fillets searches as multi-result or an exact recipe need justifies a reviewed search boundary.

## Bundled demand, amount, and substitutions

The read-only scan followed all **114 recipe paths in the manifest** and all **1,123 `ingredients[]` rows**. It found no `Alaska pollock`, `pollock`, `goberge`, `filet(s)`, or proposed full-title match in recipe ingredient text, no candidate-specific ingredient row, and no recipe link. This form therefore has no direct bundle demand.

Metro’s `1 per tray` and approximately **300 g average** belong to SKU 226631 and its retailer’s average-weight listing. The bilingual routes are the same product number and must not be counted as two product measurements. The listing does not say how many fillets are in the tray or that the average is a per-fillet mass. Do not convert the amount to an individual fillet, recipe portion, density, standard package size, edible yield, or cooking yield. If the product is reconsidered later, retain the amount as SKU-specific evidence only; do not activate a reusable measure or unit mapping.

No reviewed recipe or product source provides a tested substitution ratio, cooking method, role, or adjustment between frozen Alaska pollock fillets and Atlantic pollock, cod, haddock, other white-fish fillets, breaded pollock, or crab-flavoured pollock products. The common `pollock` naming and retailer species entry do not support a directed ingredient substitution. Add no conversion, active substitution rule, warning, yield, or recipe link.

## Bounded disposition and integration recommendation

Keep `ingredient-ref-alaska-pollock` and the Section P plan parent unchanged. Add no active form, aliases, new identity, ledger source record, measurement observation, recipe association, mapping, conversion, yield, or substitution in this review. Retain the R574 Metro sources as proposal-local evidence only. If the picker later avoids qualifier-loss, the candidate delta is limited to one `frozen` form `ingredient-form-alaska-pollock-frozen-fillets` under `ingredient-ref-alaska-pollock`, with the paired product labels above, empty match-term arrays, and null density. No package value should become a form-level measure.

The parent stays open for distinct finfish identities, forms, and evidence gaps. The [R574 integration README](../batches/wp04-r574-alaska-pollock-frozen-fillet-hold-integration-20261017/README.md) records the disposition and static checks. This documentation-only hold requires no app tests under the current `AGENTS.md` rule.
