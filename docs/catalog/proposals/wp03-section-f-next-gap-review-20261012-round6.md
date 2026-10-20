# WP03 Section F: sprouted wheat berries identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only reference; one retailer serving remains a source-specific ledger observation.
- **Scope:** A shelf-stable, food-grade product of whole wheat kernels that have been soaked, germinated, and dried. It is sold as sprouted wheat berries/kernels for cooking or milling.
- **Recommendation:** Add identity-only `ingredient-ref-sprouted-wheat-berries` as **`sprouted wheat berries / grains de blé germés`** in `GRAIN_AND_CEREAL`. Keep the French alias list empty; the Canadian retailer's exact title variant `graines de blé germées` may be added as one source-attested alias if desired. Add no forms, active measures, density, unit mappings, yields, recipe links, conversions, or substitutions.
- **Plan context:** Section F still leaves regionally significant cereal mixes and preprocessed grains open at [plan line 2146](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239). The raw buckwheat-groats integration at [line 10666](../../RecipeBook-global-ingredient-catalog-plan.txt#L10947) is complete. This review covers a separate whole-wheat processing product and does not reopen it or the existing wheat-berries row.

## Why this is a distinct open candidate

The active catalog contains generic `wheat berries / grains de blé entiers`, plus species-specific wheat grains, wheat germ, wheat flour, sprouted brown rice, and sprouted rolled oats. No active row represents whole wheat kernels that have already been sprouted, dried back to shelf-stable moisture, and sold as a cooking grain. I found no focused proposal, batch, prior hold, exact ledger identity, or recipe link for sprouted wheat berries/kernels. The unrelated sprouted-wheat mention on the bulgur ledger record describes bulgur processing; it does not allocate a whole sprouted-kernel product.

Second Spring currently markets an `Organic Sprouted Wheat Berries` product made from organic red spring wheat grown in Saskatchewan. It describes soaking and sprouting the whole kernels, drying them to shelf-stable moisture, and boiling the product for use in grain bowls, salads, soups, stews, side dishes, and risotto [S01]. A Canadian retailer's indexed French product page names the same product `Graines de blé germées` and uses `grains de blé germés` in its description [S02]. The French page is retailer wording, not a manufacturer label or OQLF ruling. Use `grains de blé germés` as a source-attested descriptive display, not as an OQLF-preferred compound.

Keep the candidate distinct from ordinary wheat berries. A current product sold as sprouted whole kernels is already processed and dried by the seller; it is not the unsprouted grain sold for home sprouting, wheat germ (the separated embryo), sprouted wheat flour, or living wheatgrass/sprouts. It is also not the prepared, cracked, or fermented wheat used in bulgur, freekeh, malt, or bakery grain mixes. The existing whole-wheat-grain specification and producer records remain the source context for the unsprouted parent identity (`WP03-S57`–`WP03-S59` in the current ledger).

## Pre-integration catalog, ledger, and recipe audit

This pre-integration snapshot was checked in the workspace on 2026-10-12. Exact ownership checks used the catalog's `normalize_search_key` implementation, which lowercases, folds accents and compatibility characters, normalizes punctuation, and collapses whitespace.

| Artifact | Current count or result |
|---|---:|
| `ingredient-references.v1.json` | 1,310 references |
| `ingredient-forms.v1.json` | 98 forms |
| `legacy-import-identities.v1.json` | 64 candidates |
| `research-ledger.v1.json` | 1,618 records; 5,901 source entries |
| `package-yields.v1.json` | 1 record; no wheat/sprouted-wheat entry |
| Unit conversions | 8 generic entries; none for wheat or sprouted wheat |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows |

No active reference name or alias, form label or match term, legacy candidate, or ledger record ID owns `ingredient-ref-sprouted-wheat-berries`, `sprouted wheat berries`, `sprouted wheat kernels`, `grains de blé germés`, or `graines de blé germées`. The active generic `wheat berries / grains de blé entiers` row remains separate. The exact French phrase `germe de blé` is owned by the existing wheat-germ identity; OQLF defines that term as the embryo separated during milling, so it is not an alias for a whole germinated kernel [S04].

No form, package-yield entry, unit conversion, global substitution rule, or contextual substitution rule owns the candidate. The ledger contains one incidental bulgur-processing mention of sprouted wheat but no exact candidate record or source-ownership allocation. No legacy candidate reserves the proposed ID.

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for `sprouted wheat berries`, `sprouted wheat kernels`, `sprouted wheat`, `germinated wheat berries`, `grains de blé germés`, `graines de blé germées`, `baies de blé germées`, `blé germé`, and `germe de blé`. The scan found **zero matching recipe files and zero matching ingredient rows**. There is no recipe demand or recipe-link change to make.

Before drafting, the proposal-local source-ID prefix `WP03-SPRWHEATBERRY-20261012` and the round6 proposal path were checked absent from the workspace.

## Proposed identity and naming boundary

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-sprouted-wheat-berries` |
| English display | `sprouted wheat berries` |
| French display | `grains de blé germés` |
| English aliases | None proposed |
| French aliases | Prefer none. `graines de blé germées` is an exact Canadian retailer title variant and could be retained as a single fr-CA search alias if the integrator values matching that retailer wording [S02]. |
| Category | `GRAIN_AND_CEREAL` |
| Identity scope | Whole food-grade wheat kernels that have been sprouted, dried back to shelf-stable moisture, and are sold as a grain for cooking or milling. This does not imply organic status, a universal wheat cultivar, germination length, or a specific cooking outcome. |
| Forms | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Recipe links, yields, conversions, substitutions | None |

Keep the candidate separate from:

- unsprouted wheat berries and wheat kernels, including generic, durum, emmer, einkorn, and Khorasan wheat identities;
- wheat germ (`germe de blé`), which is the grain embryo rather than the whole kernel;
- sprouted wheat flour and other sprouted-grain flours;
- live sprouts, wheatgrass seed sold for home sprouting, and sprouted wheat included in bread or multigrain products;
- cracked wheat, bulgur, freekeh, malt, flakes, and other processes that crack, roll, cook, ferment, or mill the grain.

Do not add `wheat berries`, `wheat kernels`, `sprouted wheat`, or `blé germé` as aliases. Those are broader phrases that can point to the unsprouted parent, flour, seed/sprout uses, or a component in a composite bakery product. Do not add the product-page calque `baies de blé germées` as an alias. Keep `organic` and `red spring wheat` as source-product qualifiers, not general identity qualifiers.

## Identity, form, measurement, and substitution findings

| Concern | Evidence and decision |
|---|---|
| Product identity | The manufacturer identifies one ingredient, whole red-spring-wheat kernels, and says they are soaked, sprouted, then dried to shelf-stable moisture before sale [S01]. The Canadian French listing describes the same packaged food as a whole grain [S02]. Recommend a distinct processed-grain identity, separate from the unsprouted wheat-berries row. |
| French naming | `Grains de blé germés` appears in the current indexed French retail description; the page title uses `Graines de blé germées` [S02]. Treat both as Canadian-market wording, not an OQLF preference. OQLF's `germe de blé` names the embryo and must stay on wheat germ [S04]. A Québec bread listing uses `blé germé` for an ingredient within a finished bread; it does not establish that bare phrase as a standalone dried-grain product name [S05]. |
| Forms | Add no `IngredientForm`. The marketed identity already includes the germinated-kernel process and shelf-stable dried state. The manufacturer's boiling directions do not establish a reusable cooked form or cooking-yield relation. |
| Measures and conversions | The Canadian retailer's out-of-stock 493 g listing shows `1/4 cup dry (50 g)` [S02–S03]. This is retained in the ledger only as a retailer/SKU-specific portion observation. The manufacturer's current page shows 454 g and 1.5 kg package choices and no household serving conversion [S01]. Do not use the retailer value as default density, unit mapping, recipe measure, or current manufacturer measure. The package sizes are not household measures. |
| Preparation and yield | The manufacturer specifies one part grain to four parts water and a 30–40 minute simmer for that product [S01]. This is product-specific preparation guidance, not a cooking yield, conversion, or universal water ratio. Do not model a prepared form or yield from it. |
| Substitutions | The manufacturer says its product can replace unsprouted wheat berries 1:1 and can be used instead of rice or quinoa [S01]. It gives no measure basis, tested recipe scope, dish-role constraint, or adjustment. Record the claim as manufacturer context only; add no global or contextual substitution rule. |
| Recipe demand | The full manifest corpus has no candidate match. No recipe link, quantity, or substitution is justified. |

## Source register

The sources below were checked on 2026-10-12. IDs use the prefix `WP03-SPRWHEATBERRY-20261012` and are recorded in the shared research ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SPRWHEATBERRY-20261012-S01` | Second Spring, [Organic Sprouted Wheat Berries](https://secondspringfoods.com/product/organic-sprouted-wheat-berries/), current manufacturer product page. | Names the whole-kernel product, identifies organic red spring wheat grown in Spalding, Saskatchewan, and describes soaking/sprouting, drying to shelf-stable moisture, cooking, package options, and use. It reports a product-specific 1:1 replacement claim for unsprouted wheat berries and a broad rice/quinoa replacement suggestion, but does not state a substitution measure basis or recipe scope. |
| `WP03-SPRWHEATBERRY-20261012-S02` | Healthy Planet Canada, [Graines de blé germées biologiques Second Spring 493 g](https://www.healthyplanetcanada.com/fr/second-spring-organic-sprouted-wheat-berries-493g.html), indexed French retailer product page. | Directly names the product in French and repeats `grains de blé germés` in its description. It shows 1/4 cup dry = 50 g and says the grains are dried back to shelf-stable moisture. The retailer page was out of stock in the English version and the 493 g package differs from the manufacturer's current 454 g/1.5 kg options. **The French URL could not be fetched directly in this session (cache miss); the indexed page content was available in web search.** Use it as Canadian retail naming evidence, not an independently verified label image, OQLF preference, or current availability claim. |
| `WP03-SPRWHEATBERRY-20261012-S03` | Healthy Planet Canada, [Second Spring Organic Sprouted Wheat Berries 493 g](https://www.healthyplanetcanada.com/en/second-spring-organic-sprouted-wheat-berries-493g.html), English retailer product page. | The page is directly accessible and displays the product, single-ingredient listing, 1/4-cup dry 50 g panel, and shelf-stable-drying description. It was marked out of stock at review; its numeric details remain retailer/listing-specific and should not set an active mapping. |
| `WP03-SPRWHEATBERRY-20261012-S04` | OQLF, [GDT: `germe de blé`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432763/germe-de-ble), updated 1982. | Defines `germe de blé / wheat germ` as the embryo of the wheat kernel. This supports keeping the existing wheat-germ reference distinct from a whole sprouted kernel; it does not name sprouted wheat berries. |
| `WP03-SPRWHEATBERRY-20261012-S05` | Super C Québec, [Pain tranché aux grains entiers avec blé germé — Les Grains St-Méthode](https://prod-ereceipt.superc.ca/allees/pains-et-patisseries/pains-emballes/ble-entier-et-cereales/pain-tranche-aux-grains-entiers-avec-ble-germe/p/068505101325), indexed ingredient declaration and product description. | Attests the phrase `blé germé` in a Québec consumer-food listing, but only as a component of a multigrain bread. The page returned a cache miss when opened directly; use its indexed result as boundary evidence, not as a standalone sprouted-kernel product name or formulation specification for S01. |

## Proposal review checks before integration

- Re-read `AGENTS.md`, the current Section F checkpoint, and the latest round5/raw-buckwheat integration note.
- Checked exact and normalized candidate-name ownership across 1,310 references, 98 forms, 64 legacy candidates, and all 1,618 ledger records. Confirmed the generic wheat-berries and wheat-germ owners remain distinct; recorded the incidental bulgur source mention without treating it as an identity owner.
- Scanned the complete 114-file manifest corpus and all 1,123 ingredient rows for candidate and neighboring wheat-sprout names; found zero matching recipe files and rows.
- Checked package yields, unit conversions, forms, and substitution-rule files for candidate ownership; found none. Confirmed the source-ID prefix and proposal path were unused before drafting.
- Access limits: the Healthy Planet French page and Super C Québec page were available as indexed search results, but direct fetches returned cache misses. The manufacturer's English page, Healthy Planet English page, and OQLF entry opened directly; no manufacturer French package label or product image was verified.
- Verified the proposal text as UTF-8 without BOM and checked the new file for mojibake and whitespace errors. At proposal-review time, no shared catalog, ledger, plan, roadmap, recipe, or generated file had been edited.


## Integration result (2026-10-12)

Added `ingredient-ref-sprouted-wheat-berries` as identity-only `sprouted wheat berries / grains de blé germés` in `GRAIN_AND_CEREAL`, with empty aliases, null default density, and no unit mappings, forms, recipe links, yields, conversions, or substitutions. Added the five reviewed source records and an accepted identity decision to the shared ledger. The Healthy Planet 1/4-cup dry = 50 g listing is recorded as a single SKU-specific portion observation; general measurement research remains `blocked_pending_evidence`. The complete 114-recipe / 1,123-row corpus has no candidate match.

The static seed-package, reference-normalization, generated-index, ledger, normalized ownership, recipe-corpus, UTF-8/no-BOM, and whitespace checks passed. At the time of this integration, the package had 1,311 references; the ledger had 1,619 records, 5,909 source entries, and 4,930 distinct source IDs. All five new source IDs occur once. No app tests or emulator checks were run because this change only adds database JSON data and regenerates its index. See the batch integration note for the exact check results.
