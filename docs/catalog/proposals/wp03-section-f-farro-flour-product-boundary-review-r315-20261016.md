# WP03 Section F R315 — Farro Flour Grade/Product-Boundary Review

## Review record

- **Reviewed and sources checked:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, legacy identity, checklist, roadmap, generated file, recipe, or integration README was changed.
- **Scope:** Review whether a species-neutral `whole farro flour` child identity is supported under the open Section F farro species/flour boundary.
- **Plan context:** [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L533) keeps farro species and flour boundaries open; R147 and R148 recorded the narrower grain and flour market classes.
- **Prior completed work:** R147 added `farro grain / grains de farro`; R148 added the separate species-neutral market class `farro flour / farine de farro`. This review does not repeat either identity decision.
- **Recommendation:** **Hold a species-neutral `whole farro flour` identity outside the active catalog and ledger.** The current Canadian whole-flour products found are explicitly emmer products whose maker copy uses “farro” only as a product-scoped synonym. The Québec whole-flour listing found is explicitly spelt. No current Canadian or Québec source located names a whole-farro flour class across those species or establishes a Québec display such as `farine de farro entière`.

## Product and species boundary

The active [R148 row](wp03-section-f-farro-flour-boundary-review-r148-20261015.md) already owns flour products explicitly sold or described as `farro flour / farine de farro`, while leaving the wheat taxon unspecified. The sources in that review span emmer, spelt, einkorn, and a three-species farro flour product. A whole-grain qualifier on one emmer product cannot be carried across that species-neutral market class: it describes that SKU and its stated species, not every flour marketed as farro flour.

Current Canadian mill evidence makes the product-level boundary concrete. True Grain's current product is titled **Organic BC Whole Emmer Flour**. Its copy says “Emmer (or Farro),” identifies its ingredient as stone-ground BC wholegrain emmer flour, and explains that “whole” means the entire kernel is ground with nothing added or removed. The phrase `or Farro` occurs in the description of this emmer product; it does not rename whole spelt, einkorn, or multi-species products as whole emmer flour [S01]. Arva separately sells **Organic Whole Emmer Flour** and its French-language mill page titles the product **Farine d’amidonnier complet biologique**. Arva calls emmer one of the “Farro” cereals in its French flour guide, but the named product itself remains emmer-specific [S02–S03].

The current Québec listing reviewed is **Farine d'épeautre entière biologique**, a whole-spelt product sold by Mayrand at Québec locations. It identifies spelt and the whole-grain grade, not emmer or a species-neutral farro flour class [S04]. AB & CO essentiels' current indexed Québec storefront listing still uses `Farine de farro / épeautre` under an `ÉPEAUTRE` heading, without a whole-grade claim. The product detail page was not retrievable during this review, so this is limited to the indexed listing and the [R148 storefront review](wp03-section-f-farro-flour-boundary-review-r148-20261015.md) [S05].

OQLF's *amidonnier* entry identifies *Triticum dicoccum* and accepts `farro` for that cereal. TERMIUM's food-industries entry describes `farro` as an ethnobotanical term covering einkorn, emmer, and spelt. These terms sources explain why the whole-emmer listings cannot establish a species-neutral farro grade, and why `farro` must not become an alias on emmer flour [S06–S07].

The exact proposed French whole-grade phrase is also unverified. `Farine d'amidonnier complet` is manufacturer-attested in Arva's Ontario French page; it is not a Québec retail title or an OQLF whole-emmer-flour entry. Québec whole-grain wording exists for other named species, including Mayrand's `farine d'épeautre entière`; it cannot by itself standardize a cross-species `farine de farro entière` class. Targeted searches for `whole farro flour`, `wholegrain farro flour`, `farine de farro entière`, `farine de farro complète`, and Canadian/Québec variants surfaced the species-qualified emmer pages and the Québec spelt listing, but no current Québec product title that supports the proposed broad grade. This is a bounded search result, not proof that no such product exists.

## Exact ownership and archive audit

The review snapshot contains **1,673 active references, 127 forms, 59 legacy-import candidates, 2,020 ledger records, 114 manifest-listed recipes, and 1,123 structured ingredient rows**.

| Surface | Current ownership | R315 boundary |
|---|---|---|
| `ingredient-ref-farro-flour` | `farro flour / farine de farro`, `FLOUR_AND_STARCH`; no aliases, null density, empty unit mappings. | Keep the accepted R148 species-neutral market class unchanged. It owns the unqualified product phrase, not a whole-grade emmer specification. |
| `ingredient-ref-farro-grain` | `farro grain / grains de farro`, with English alias `farro grains`; `GRAIN_AND_CEREAL`. | Keep dry grain separate from flour. |
| `ingredient-ref-farro` | Ledger-only candidate, `identityState: needs_clarification`, with earlier unresolved decisions. | Keep bare `farro` unresolved and off all species-specific rows. |
| `ingredient-ref-emmer-flour` | `emmer flour / farine d'amidonnier`, `FLOUR_AND_STARCH`; no aliases, forms, density, or mappings. | The reviewed maker products are whole emmer flour at the SKU level. Their “farro” wording does not make `farro flour` or `whole farro flour` an emmer alias. |
| `ingredient-ref-emmer-grain` | `emmer wheat / blé amidonnier`, `GRAIN_AND_CEREAL`. | Keep the whole-kernel grain distinct from flour and from the farro market-class rows. |
| `ingredient-ref-spelt-flour`, `ingredient-ref-whole-spelt-flour`, and `ingredient-ref-einkorn-flour` | Separate species-specific spelt, whole-spelt, and einkorn-flour identities. | The Québec whole-spelt label remains attached to spelt; do not move it to the broader farro flour row. Keep einkorn and emmer distinct as well. |
| Proposed `ingredient-ref-whole-farro-flour` | No exact ID, canonical display, or alias owner in active refs, forms, legacy identities, or the ledger. | Hold without allocating this ID or adding a ledger candidate. |

No farro/emmer forms are present. The active substitutions and contextual-substitutions files contain no farro or emmer rule. Archive searches found the exact generic flour-class decision in R148 and the distinct grain decision in R147. The prior Canadian product-label and farro-boundary proposals preserve species-qualified emmer/spelt product evidence, but none is an earlier decision to create `whole farro flour` as a cross-species grade.

## Picker projection

The static projection follows the current normalized, phrase-first search with substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9). The hypothetical row in the final column is used only to show the effect of allocating the unverified name; it is not proposed for integration.

| Query | Current result | If `whole farro flour / farine de farro entière` were added | Boundary |
|---|---|---|---|
| `farro` | 2: farro grain and farro flour | 3, adding a whole-farro-flour result | Broad species/product query becomes less specific. |
| `farro grain` | farro grain | Same | Grain remains separately searchable. |
| `farro flour` | farro flour | farro flour and whole farro flour | Existing market-class query would return both parent-like and grade-labelled rows. |
| `farine de farro` | farro flour | farro flour and whole farro flour | Same broadening in French. |
| `whole farro flour` | No result | Hypothetical whole-farro-flour row | No current exact product owner. |
| `farine de farro entière` | No result | Hypothetical whole-farro-flour row | No reviewed Québec title supports this phrase. |
| `emmer flour` / `farine d'amidonnier` | emmer flour | Unchanged | The emmer-qualified identity remains separate. |

Because the recommendation is a hold, the active picker remains unchanged. Do not add `whole farro flour`, `wholegrain farro flour`, or French grade wording as aliases to either the species-neutral row or the emmer row.

## Recipe demand and numeric/substitution evidence

All **114 recipe files named by the bundled-library manifest** and all **1,123 ingredient rows** were scanned. Case-insensitive scans of the complete serialized recipe files and ingredient rows for `farro`, `farro flour`, `whole farro flour`, `wholegrain farro flour`, `farine de farro`, `farine de farro entière`, emmer, `whole emmer flour`, amidonnier, spelt, and einkorn found **zero matching recipe files and zero ingredient-row matches**. No recipe link points to either active farro row. No recipe link or relink is recommended.

- **Product mass:** True Grain offers 1 kg and 10 kg packages. Those are SKU/package sizes, not kitchen measures or a flour density [S01].
- **Whole-grain definition:** True Grain's explanation that its named whole-emmer product grinds the entire kernel is a product-specific milling statement. It is not a reusable grade definition for farro flour across other species [S01].
- **Baking guidance:** True Grain says to substitute its whole emmer flour for whole-wheat flour in recipes. Arva says its whole emmer flour may replace common whole-wheat flour in almost any recipe and that its product may need about one-quarter more moisture. This is producer advice for named emmer products, without a controlled recipe, fixed replacement ratio, or cross-species scope. Preserve it as source-specific evidence only; it does not support a catalog-wide measure, form conversion, yield, or substitution rule [S01–S03].
- **Other product values:** Arva reports a 12–16% protein range for its product and identifies it as fine-milled. Those claims belong to that mill's product and do not define whole farro flour [S02].
- **Catalog data:** Add no aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or global/contextual substitutions. R148's existing `farro flour` measurement and substitution states remain unchanged.

## Source register

The R315 IDs below are proposal-local and are not registered in the shared ledger while the candidate remains on hold.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-FARRO-GRADE-R315-20261016-S01` | True Grain, [Organic BC Whole Emmer Flour](https://www.truegrain.ca/products/copy-of-organic-bc-whole-emmer-flour), title, description, size selector, and ingredient statement. | Current BC mill product lists 1 kg and 10 kg options; says “Emmer (or Farro),” explains its whole-kernel milling, declares stone-ground BC wholegrain emmer flour, and recommends substituting its whole emmer flour for whole wheat flour. The ingredient and grade claims are explicitly scoped to this emmer product; package mass and baking advice are not general farro measures or substitution rules. |
| `WP03-FARRO-GRADE-R315-20261016-S02` | Arva Flour Mills, [Organic Whole Emmer Flour](https://arvaflourmills.com/products/whole-emmer-flour), product title and baking guidance. | Current Ontario mill page sells a named whole emmer flour and states that it may replace whole wheat flour in many recipes; it reports 12–16% protein and about one-quarter more moisture for its product. No household-volume measure or transferable substitution ratio is given. |
| `WP03-FARRO-GRADE-R315-20261016-S03` | Arva Flour Mills, [Farine Artisanale Arva](https://arvaflourmills.com/fr/pages/our-flours), Organic Emmer entry and adjacent spelt/farro wording. | The Canadian mill's French page names `Farine d'amidonnier complet biologique` and separately describes emmer and spelt as farro cereals. It supports a Canadian French, species-qualified whole-emmer wording; it is not a Québec retail title or direct French name for a species-neutral farro flour grade. |
| `WP03-FARRO-GRADE-R315-20261016-S04` | Mayrand, [Farine d'épeautre entière biologique 2 kg](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-de-specialite/farine-depeautre-entiere-biologique-la-milanaise-10801), title and Québec store availability. | Current Québec retail listing names whole spelt flour and shows in-stock stores in Anjou, Laval, Brossard, and Saint-Jérôme. It supports a species-qualified Québec whole-flour listing; it does not establish an emmer or farro name. The 2 kg is package mass. |
| `WP03-FARRO-GRADE-R315-20261016-S05` | AB & CO essentiels, [all products](https://abncoessentials.com/collections/all), current indexed product title. | Search-indexed storefront text lists `ÉPEAUTRE — Farine de farro / épeautre`. The direct page returned a cache miss. The indexed heading supports only this spelt-qualified local farro wording, with no whole-grade claim; see the earlier R148 review for the accessible storefront context. |
| `WP03-FARRO-GRADE-R315-20261016-S06` | OQLF, [amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), updated 2019. | Identifies *Triticum dicoccum* and lists `amidonnier` and `farro` as acceptable Québec French terms for this emmer entry, with English `emmer`, `emmer wheat`, and `farro`. It is scoped to emmer and does not define a flour grade or override other documented farro usages. |
| `WP03-FARRO-GRADE-R315-20261016-S07` | Translation Bureau, [TERMIUM Plus: farro, Food Industries record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN), record 1, 2022-03-10. | Describes farro in food industries as an ethnobotanical concept covering einkorn (*Triticum monococcum*), emmer (*T. dicoccon*), and spelt (*T. spelta*). This government terminology record supports the cross-species limit; it is not a milling specification. |

## Recommendation and reopen condition

**Hold `whole farro flour` outside the active references and ledger.** Keep the R148 `farro flour / farine de farro` row, species-specific emmer/spelt/einkorn flour identities, and farro-grain row unchanged. The current evidence supports whole-emmer flour as a named product state and shows that emmer can be called farro in that product context; it does not support a common whole-grade identity for the multi-species farro flour class or a Québec display for that class.

Reopen this specific boundary when a current Canadian or Québec producer/retailer names a standalone whole-farro flour product, explicitly states its species or blend and whole-grain scope, and supplies a Québec-supported French display. Reassess the broad `farro` and `farro flour` picker projections then. Keep product-specific package sizes and baking guidance out of reusable measurements or substitution behavior unless new sources directly support those values and scopes.

## Review checks

- Re-read `AGENTS.md`, `Requirements.md`, Section F of the catalog plan, active references/forms, ledger, legacy identities, and the R147/R148 proposals and batch records.
- Checked exact ownership for the proposed whole-farro-flour identity and phrase across active references, forms, legacy candidates, and ledger records; searched prior proposals and batches for an exact whole-farro grade decision.
- Projected picker results from current reference names/aliases using the documented phrase-first search behavior; this is a static source-data review, not a runtime UI test.
- Scanned all manifest-listed recipe files and structured ingredient rows, then inspected the active direct and contextual substitution files. No app tests, builds, emulator checks, or deployments were run for this proposal-only review.
