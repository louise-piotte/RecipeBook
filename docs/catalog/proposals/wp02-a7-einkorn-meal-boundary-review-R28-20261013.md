# WP02 A7 — Einkorn-meal product boundary review (R28, 2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. Keep the candidate unallocated; no shared catalog, form, ledger, recipe, plan, roadmap, or generated file is changed by this review. No app, unit, instrumentation, or emulator tests were run because this is research-only.
- **Open-plan item:** The candidate falls under the still-open WP02 A7 parent, “Continue A7 review of other grain meals…” ([plan, line 1435](../../RecipeBook-global-ingredient-catalog-plan.txt#L1435)). The adjacent A7 decision at lines 1454–1458 concerns triticale meal and is separate.
- **Proposal-local source prefix:** `WP02-A7-EINKORN-MEAL-BOUNDARY-R28-20261013-S01` through `S05`. This prefix was absent from the current proposal archive and research ledger before drafting; these IDs are local references, not ledger records.
- **Scope:** Determine whether *einkorn meal* is a distinct human-food milling product that can be distinguished from einkorn flour and whole einkorn grain, and whether current evidence supports a Québec French display.

## Recommendation

**Hold `einkorn meal` unallocated. Do not create an active reference, a legacy candidate, or an alias.** The available authoritative and primary sources identify einkorn as a cereal species and document einkorn flour and whole einkorn grain as products. They do not establish a current consumer product called *einkorn meal*, a meal-versus-flour particle-size boundary, or a Québec French name for such a product.

This is a product-evidence hold, not a claim that no one has ever ground einkorn coarsely or that such a product could never be marketed. A future package, mill specification, or authoritative terminology record naming a distinct food product and its French wording could reopen the question.

## Identity and Québec French decision

TERMIUM records *Triticum monococcum* as einkorn and gives the French names *petit épeautre* and *engrain*. Those are species names; they do not identify a milling grade. The Government of Québec food directory documents the local product **Farine de petit épeautre biologique** as flour, with einkorn as its ingredient. The live catalog separately represents whole grain as `einkorn berries / grains de petit épeautre` and flour as `einkorn flour / farine de petit épeautre`.

The mill catalog reviewed here separates flour, meal, semolina, flakes, and food grain as product categories. It lists wholegrain einkorn flour and whole einkorn grains, while its listed meal products are wheat, spelt, and rye at fine, medium, and coarse grinds. That is one supplier's assortment, not a universal taxonomy; it supplies no einkorn-meal product or specification.

**Québec French decision:** assign no French display or alias. Do not reuse `farine de petit épeautre` for meal because it is the current Québec flour wording and the exact active flour display. Do not use `grains de petit épeautre` because it names the whole-grain reference. Do not invent `gruau de petit épeautre`, `semoule de petit épeautre`, or `engrain moulu`: no source reviewed identifies one of those as a Québec consumer product name for einkorn meal. OQLF's general entry for `épeautre` identifies the ordinary spelt term; it does not settle a species-specific einkorn meal name.

The German mill's wholegrain-einkorn-flour label and the Québec flour listing must not be treated as evidence that a separate meal product is the same as flour. Conversely, the word *meal* alone does not establish an einkorn meal identity or a coarse-grind threshold.

## Archive reconciliation and selection check

Before selecting this item, I searched the proposal archive and plan for `einkorn meal`, `meal of einkorn`, and `meal` near `einkorn`. I found no prior focused einkorn-meal review or ledger decision. The existing [einkorn-berries review](wp03-section-f-einkorn-berries-grain-identity-review-20261012.md) covers whole grain, and the live einkorn-flour row covers flour; neither adjudicates meal.

The adjacent A7 reviews were checked to avoid repeating their decisions: the [2026-10-10 grain-meal/malt/toasted review](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md), [held-candidate and generic-malt recheck](wp02-a7-held-candidate-recheck-20261010.md), [barley-meal Québec review](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md), [dry-oat-meal review](wp02-a7-dry-oat-meal-product-boundary-review-20261011.md), [toasted-rye review](wp02-a7-toasted-rye-flour-quebec-product-boundary-review-20261011.md), [residual grain-meals follow-up](wp02-a7-residual-grain-meals-followup-20261011.md), [current wheat-meal product review](wp02-a7-wheat-meal-current-product-boundary-review-20261011.md), [R22 wheat-meal review](wp02-a7-unqualified-wheat-meal-round22-review-20261013.md), [R23 buckwheat-meal review](wp02-a7-buckwheat-meal-boundary-review-20261013-round23.md), [R24 malted-spelt review](wp02-a7-malted-spelt-flour-quebec-name-boundary-review-20261013-round24.md), [R25 micronised-toasted-millet review](wp02-a7-micronised-toasted-millet-flour-boundary-review-20261013-round25.md), and [R26 toasted-white-sorghum review](wp02-a7-toasted-white-sorghum-flour-boundary-review-20261013-round26.md). The residual review already holds triticale meal and other named cereal-meal candidates; this packet does not reopen them.

The R27 archive was also checked: the [WP02 B2 macadamia-flour review](wp02-b2-macadamia-flour-boundary-review-R27-20261013.md), [WP03 Section F pearl-barley dry/cooked-form review](wp03-section-f-pearl-barley-dry-cooked-form-review-R27-20261013.md), and [WP04 Section P European-turbot review](wp04-section-p-european-turbot-picker-market-boundary-review-20261013-round27.md) do not cover einkorn meal. No R27 proposal or integration record names this candidate.

## Current catalog, picker, and ledger collision audit

Read-only snapshot: **1,355 active ingredient references, 100 forms, and 64 legacy-import candidates**. Exact-key and phrase-search checks used the current English/French displays and aliases, plus form labels and match terms. Picker query matching was projected from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9-L43); no live emulator picker test was performed.

| Query or candidate | Current exact owner | Current phrase-search result | Decision |
|---|---|---|---|
| `einkorn meal`; `whole einkorn meal`; `einkorn wheat meal`; `meal of einkorn` | None in references or forms. | No reference result. | Keep unallocated; no alias or row. |
| `einkorn groats`; `einkorn grits` | None in references or forms. | No reference result. | Do not use these as meal aliases without product evidence. |
| `engrain moulu`; `petit épeautre moulu`; `gruau de petit épeautre`; `semoule de petit épeautre` | None in references or forms. | No reference result. | No Québec French display or alias is established. |
| `einkorn`; `petit épeautre` | No standalone exact alias. | Both return `ingredient-ref-einkorn-berries` and `ingredient-ref-einkorn-flour`. | Broad species wording already spans grain and flour. Do not add it to a held meal candidate. |
| `farine de petit épeautre`; `einkorn flour` | `ingredient-ref-einkorn-flour`. | Flour row only. | Preserve as flour wording. |
| `grains de petit épeautre`; `einkorn berries` | `ingredient-ref-einkorn-berries`. | Grain row only. | Preserve as whole-grain wording. |
| `ingredient-ref-einkorn-meal` | None in references, forms, legacy candidates, or ledger record IDs. | Not applicable. | Do not reserve the ID. |

The exact candidate phrases above have no active owner in the [ingredient-reference package](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [form package](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy-import candidate file](../legacy-import-identities.v1.json), or [research ledger](../research-ledger.v1.json). The ledger contains existing einkorn-grain and einkorn-flour evidence, but no einkorn-meal record or R28 source prefix. An exact miss does not establish that a distinct product exists.

## Bundled recipe demand

The current [seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipes** containing **1,123 ingredient rows**. All manifest-listed recipe files were scanned in full, including ingredient-row `originalText`, `ingredientName`, `preparation`, and `notes`, reference IDs, and complete serialized recipe text. Case, accents, ligatures, and punctuation were normalized to match the current search-key behavior.

There were **zero matching recipe files and zero ingredient rows** for exact and near candidate phrases: `einkorn meal`, `whole einkorn meal`, `einkorn wheat meal`, `meal of einkorn`, `einkorn groats`, `einkorn grits`, `engrain moulu`, `petit épeautre moulu`, `gruau de petit épeautre`, and `semoule de petit épeautre`. Adjacent references were also checked: `einkorn`, `einkorn flour`, `einkorn berries`, `wholemeal einkorn flour`, `farine de petit épeautre`, `grains de petit épeautre`, `petit épeautre`, and `engrain`; none occurs in this corpus. No recipe link or relink is proposed.

## Explicit data disposition

| Data area | Disposition |
|---|---|
| Identity | Hold; do not create `ingredient-ref-einkorn-meal` or another active reference. Do not create a new legacy candidate from an exact phrase alone. |
| English/French aliases | None. Do not alias meal to `einkorn flour`, `einkorn berries`, `farine de petit épeautre`, `grains de petit épeautre`, `engrain`, or unqualified `petit épeautre`. |
| Forms | None. No source establishes a reusable coarse, medium, fine, cooked, or other form for an einkorn-meal product. |
| Numeric data | None. Keep density null, unit mappings empty, and measurements/package portions unassigned. The Québec directory's 1/4 cup (30 g) serving is for its specific flour listing and cannot be transferred to a hypothetical meal product or treated as a density. |
| Conversions and yields | None. Do not infer grain-to-meal, grain-to-flour, or dry-to-cooked conversions or yields. |
| Substitutions | None. No source establishes an einkorn-meal replacement direction, ratio, or recipe context. |
| Recipe links | None. The bundled corpus has no exact or near demand. |

## Source register

Sources were checked on 2026-10-13. These proposal-local IDs are not ledger records.

| ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-EINKORN-MEAL-BOUNDARY-R28-20261013-S01` | Government of Canada Translation Bureau, [TERMIUM Plus, “EINKORN”](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=EINKORN), record dated 2022-03-10. | Gives the Latin entry *Triticum monococcum* and French names *petit épeautre* and *engrain* for English *einkorn*. | Species terminology only; it does not name a meal product, milling grade, or Québec French compound for meal. |
| `WP02-A7-EINKORN-MEAL-BOUNDARY-R28-20261013-S02` | Agriculture and Agri-Food Canada, [GRIN-Global Canada taxon record for *Triticum monococcum* subsp. *monococcum*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=40597). | Identifies the cultivated einkorn taxon and lists its common English and French names. | Taxonomy and germplasm record; it does not establish a human-food milling product or culinary name. |
| `WP02-A7-EINKORN-MEAL-BOUNDARY-R28-20261013-S03` | Gouvernement du Québec, [Répertoire des aliments québécois, La Milanaise “Farine de petit épeautre Biologique”](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203721), product record. | Records the Québec product title *Farine de petit épeautre Biologique*, classifies it under grains/flours, and lists organic einkorn as the ingredient. Supports the current local flour wording and its product scope. | The directory notes product data originate from GS1 and disclaims responsibility for accuracy. The listed 1/4-cup/30-g serving applies only to this flour product. It does not name or measure einkorn meal. |
| `WP02-A7-EINKORN-MEAL-BOUNDARY-R28-20261013-S04` | Heimatsmühle, [Milling products for commercial customers](https://www.heimatsmuehle.com/en/commercial-clients/products), product-category catalog. | Separates flour, flakes, meal, semolina, and food-grain categories. Lists wholegrain einkorn flour and whole einkorn grains, while its listed meal products are wheat, spelt, and rye in fine/medium/coarse grades. | One German mill's range, not a global taxonomy or Québec label. The product listing cannot prove that no other seller offers an einkorn meal. It supplies no meal specification for einkorn. |
| `WP02-A7-EINKORN-MEAL-BOUNDARY-R28-20261013-S05` | Office québécois de la langue française, [“épeautre” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354126/epeautre), updated 2005. | Identifies *épeautre* as the Québec French term for English *spelt*. It cautions against using unqualified *épeautre* as a species-specific meal name for einkorn. | General spelt terminology only. It does not define einkorn, meal, or a French name for an einkorn-meal product. |

## Review boundary

This proposal resolves only whether the present evidence supports an einkorn-meal catalog allocation. The answer is **no for now**: keep the candidate unassigned until a current food-product source establishes the product boundary and Québec French naming. The wider WP02 A7 parent remains open.
