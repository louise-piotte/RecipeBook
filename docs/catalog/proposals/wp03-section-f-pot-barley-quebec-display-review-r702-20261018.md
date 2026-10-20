# WP03 Section F R702 — pot-barley Québec French display review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Independent naming review proposal; no shared catalog, plan, ledger, recipe, or runtime data changed.
- **Scope:** The existing `ingredient-ref-pot-barley` French display only. This review does not reopen the grain identity or its processing boundary.
- **Recommendation:** **Approve `orge en pot` as the fr-CA picker display for this catalog.** It is a clear, grammatically sound product name attested in current Canadian French listings and it avoids assigning the OQLF hulled-barley term to a second row. Describe it as market-attested wording, not as an OQLF-preferred or standardized Québec term. Keep the French alias list empty.

The approval is for a practical bilingual ingredient picker. It does not claim that all Canadian suppliers use the same French name or that the term has been officially standardized.

## Finding

The OQLF's current GDT entries reserve **`orge mondé`** for **hulled barley** and **`orge perlé`** for **pearl barley**. The entries give definitions that distinguish the latter two products: hulled barley has its exterior covering removed; pearl barley has both coverings removed and is polished into rounded grains [1–2]. A targeted OQLF search did not locate an entry for *pot barley* or *orge en pot*.

Current Canadian French commercial wording is mixed. A French-language Oak Manor listing uses **`Orge en pot`** as its product title and section heading, but its description and ingredient statement call the product *orge mondé* [5]. A current French-Canada wholesale listing shows Agrofusion **`Orge En Pot`** separately from **`Orge Perlé`** on the same barley page [6]. Metro's paired English and French listings use **Pot Barley** and **Orge mondé** for the same UPC, `062356506537` [7–8]. These examples show that the French market name is not uniform; the Metro pair also confirms that *orge mondé* is not a safe unique alias for pot barley in this catalog.

`Orge en pot` is an acceptable picker display on that evidence. The construction is understandable in French, it appears as a grain-product title rather than a container description in current retail listings, and the English/French pair shown by the app supplies the intended product sense. It is also the clearest available way to keep pot barley distinct from the exact OQLF names already used for hulled and pearl barley. This is a reviewer judgment about a user-facing catalog label, not an official terminology ruling.

## Identity and collision boundaries

The processing distinction remains useful and source-supported. Nith River Milling describes pot barley as dehulled barley lightly polished to remove some, but not all, of the bran; its dehulled barley retains the bran intact. It describes pearled barley as a more polished product [4]. This supports keeping pot barley separate from both hulled and pearl barley; it does not define a universal polishing tolerance or establish that every product called pot barley is processed identically.

| Term | Québec French review | Catalog disposition |
| --- | --- | --- |
| `pot barley / orge en pot` | Clear, current Canadian French product wording; not listed as an OQLF-preferred term. | Approve the existing display for the picker. Keep it as the sole French display and add no French alias. |
| `hulled barley / orge mondé` | Direct OQLF English–French pair. | Keep `orge mondé` with the hulled-barley row. Do not add `orge mondé` or `orge mondée` to pot barley. |
| `pearl barley / orge perlé` | Direct OQLF English–French pair for the separately polished product. | Keep the pearl-barley row separate. |
| `orge entière` | Appears in federal translation material, but is not the OQLF-preferred name for hulled barley and is not established here as a unique pot-barley term. | Do not assign it to pot barley. |
| `Scotch barley` | Existing English alias; TERMIUM marks it rare and groups it with pot and hulled barley. | Leave the current English alias unchanged; this review does not expand it. |

Do not substitute a constructed phrase such as *orge partiellement polie* as a display or alias. The reviewed Québec terminology and current Canadian retail sources do not establish it as a product name.

## Current catalog and recipe context

The live reference remains `ingredient-ref-pot-barley`, displayed as `pot barley / orge en pot`, with `Scotch barley` as its only alias. The French alias list is empty, density is null, unit mappings are empty, and no pot-barley form is defined. Its ledger identity is verified; measurement and substitution research remain `not_yet_researched`.

A fresh read-only scan of the current manifest-listed package found 114 recipe files and 1,123 structured ingredient rows, with **zero barley/orge ingredient-line matches**. There is no recipe demand that calls for a French alias, form, measurement, or substitution. No recipe links or numeric behavior are proposed.

The open Section F checklist at [plan line 4284](../../RecipeBook-global-ingredient-catalog-plan.txt#L4293) is the broad grain-product item. The pot-barley-specific pending display-approval item and its R110 recheck are recorded later in the plan; see the [R110 integration README](../batches/wp03-section-f-pot-barley-quebec-display-recheck-integration-20261014/README.md), [R110 proposal](wp03-section-f-pot-barley-quebec-display-recheck-r110-20261014.md), and the [grain/cereal packet](../batches/plant-grains-cereals.md). R110 kept the display provisional while awaiting an independent naming review; this proposal supplies that review and recommends accepting the display for catalog use.

## Source register

Sources were checked online on **2026-10-18**. Retail listings establish displayed product wording only; they do not override OQLF terminology or prove that all products sold under the English name share one processing specification.

| Ref. | Source and locator | Finding and limits |
| --- | --- | --- |
| [1] | Office québécois de la langue française, [orge mondé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde), last updated 2004. | Gives preferred masculine term `orge mondé`, defines barley with the outer covering removed, and pairs it with `hulled barley`. It does not name pot barley. |
| [2] | Office québécois de la langue française, [orge perlé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358518/orge-perle), last updated 2004. | Gives preferred masculine term `orge perlé`, defines the more completely polished product, and pairs it with `pearl barley`. It does not name pot barley. |
| [3] | Translation Bureau, [TERMIUM Plus: Scotch barley](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=SCOTCH+BARLEY), record dated 2021-10-14, modified 2026-08-06. | Current federal record groups *pot barley*, *hulled barley*, and rare *Scotch barley* under `orge mondé / orge mondée`, and notes that pot barley is less processed than pearl barley. This confirms the crosswalk collision; it does not establish equivalence of the English products or a unique Québec consumer label. |
| [4] | Nith River Milling, [Barley Products](https://www.nithriver.ca/barley), Pot Barley, Pearled Barley, and Milling (Dehulled) Barley sections. | Describes pot barley as lightly polished with some bran remaining, dehulled barley as retaining the bran layer, and pearled barley as more polished. Manufacturer process descriptions support separate products, not a French term or a universal process tolerance. |
| [5] | Healthy Planet Canada, [Oak Manor Barley Pot / Orge en pot](https://www.healthyplanetcanada.com/fr/oak-manor-barley-pot-organic-1kg.html), SKU A0039206. | Current indexed French page title and heading use `Orge en pot`; description and ingredient statement also use `orge mondé`. The page displayed an expiry date of 2026-10-13 when checked, so it is cited for wording only, not current stock. Direct open returned a cache miss. |
| [6] | FoodServiceDirect.ca, [French-Canada barley listings](https://www.foodservicedirect.ca/fr-CA/foods/rice-grains/barley/barley.html), Agrofusion 10 kg products. | Current indexed listing presents `Agrofusion Orge En Pot` separately from `Agrofusion Orge Perlé`. This is product-title evidence, not a Québec terminology decision or process specification; direct open returned a cache miss. |
| [7–8] | Metro, [Cedar Phoenicia Pot Barley, English](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/quinoa-specialty-grains/pot-barley/p/062356506537) and [same UPC in French](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/orge-monde/p/062356506537), product no. `062356506537`. | Current indexed pages identify the English product as `Pot Barley` and the French product as `Orge mondé` for the same UPC. Retailer naming demonstrates the collision; it does not change the OQLF entry or establish equivalence with hulled barley. |

## Disposition requested

Accept the independent review and approve the existing `orge en pot` display for the fr-CA picker, with the documentation qualifier **market-attested; not OQLF-preferred**. Keep pot barley distinct from hulled and pearl barley; retain the English alias `Scotch barley`; keep French aliases, forms, measurements, conversions, yields, recipe links, and substitutions empty. This proposal changes no shared data; the coordinator can update the checklist when integrating the disposition.

## Read-only review checks

- Re-read `AGENTS.md`, the WP03 Section F plan, the catalog workflow, the live reference and form files, the pot-barley ledger record, and prior pot-barley proposals and batch notes.
- Confirmed the active snapshot has **1,839 ingredient references, 173 forms, and 2,221 ledger records**; the pot-barley reference has no form.
- Rechecked current OQLF entries, the current TERMIUM record, the mill's processing descriptions, and current Canadian French retailer wording. Source-specific access limits are stated above.
- Scanned all manifest-listed recipe files and structured ingredient rows. The scan found **no barley/orge ingredient-line matches**.
- No tests, builds, emulator work, or deployment were run. No shared file was edited.
