# WP04 Section Q preserved-egg identity review — R348 — 2026-10-16

- **Reviewed:** 2026-10-16
- **Status:** Integrated as an identity-only catalog entry; no forms, measurements, conversions, yields, recipe links, or substitutions were added.
- **Scope:** Century egg / pidan identity and boundary against the whole duck-egg and salted-duck-egg records.
- **Recommendation:** Add one standalone `EGG` identity for century egg / pidan. Do not add it as a form under duck egg, chicken egg, or quail egg.

## Current catalog and ownership

The Section Q checklist remains open for culinary egg forms, including preserved eggs. Its liquid egg-white and salted whole-duck-egg subtasks are checked, but neither covers pidan. The existing [R292 salted-duck-egg form](wp04-section-q-salted-duck-egg-form-review-r292-20261016.md) says to keep preserved duck egg / century egg / pidan separate from salted duck egg; it did not add preserved-egg coverage.

Current seed data contains 1,689 ingredient references and 130 forms. The relevant references are `ingredient-ref-egg` (generic egg, used for hen egg when unqualified), `ingredient-ref-duck-egg`, `ingredient-ref-quail-egg`, `ingredient-ref-egg-white`, and `ingredient-ref-egg-yolk`. `ingredient-form-duck-egg-salted` is the only salted whole-egg form. There is no century-egg or pidan identity/form, and the 56 legacy-import candidates have no matching preserved-egg candidate; the only egg-related legacy candidate is egg substitute. The ledger contains pidan wording only in the R292 boundary notes, not a dedicated preserved-egg record.

The current R292 source `WP04-SALTED-DUCK-EGG-R292-20261016-S02` already owns the English T&T egg-category URL and documents that the live category separates salted duck eggs, preserved duck eggs, and salted duck-egg yolks. Reuse that source record for the category distinction; do not duplicate its URL or source ID. The proposed SAMR, BCCDC, OLO PDF, Walmart preserved-egg product, OQLF, and French-locale T&T category URLs below have no exact URL owner in the current ledger. The French-locale T&T category URL is distinct from the already-owned English-locale URL.

## Product identity and species boundary

Pidan is a finished egg product formed by a strong alkaline treatment that changes both white and yolk into characteristic gelled/darkened components. The current Chinese national standard GB/T 9694-2014 is titled **皮蛋 / Preserved egg** and is listed as current by the national standards information service. Its accessible metadata supports the product name and standard status only; the standard text was not accessible for review.

The 2024 BC Centre for Disease Control guidance calls the product **Pidan/Century egg/Hundred-year egg**. It says pidan is usually made from duck eggs but can also be made from chicken or quail eggs, and describes it as a chemical, high-alkalinity treatment rather than microbial fermentation. This cross-species product identity is the reason to keep it independent of the duck-egg reference. Do not create three species-specific pidan rows or imply that every pidan is duck egg.

This identity is distinct from `ingredient-form-duck-egg-salted`: brining/salting and alkaline pidan processing are different product processes. Keep salted duck egg, salted duck-egg yolk, and pidan separate. Do not alias pidan to generic `salted egg`, salted duck egg, balut, tea egg, egg white, or egg yolk. Do not use “fermented egg” as a search alias: the BCCDC guide explicitly classifies pidan as a non-microbial chemical process despite grouping its review within fermented-food guidance.

## Proposed record and aliases

| Field | Proposal |
| --- | --- |
| Reference ID | `ingredient-ref-century-egg` |
| Category | `EGG` |
| English name | century egg |
| Québec French name | œuf de cent ans |
| English aliases | century eggs; preserved egg(s); preserved duck egg(s); pidan; hundred-year egg(s); thousand-year-old egg(s); alkaline egg(s) |
| French aliases | œufs de cent ans; pidàn |
| Density / unit mappings | `null` / `[]` |
| Forms | None |

The bilingual French phrase **Pidàn/œuf de cent ans** is used in the Fondation OLO and Dispensaire diététique de Montréal food-profile guide for Chinese foods in Québec. The guide describes a common duck-egg preparation and its uses in cold dishes, steamed hot dishes, and soup; it also says the item is available at Chinese grocery stores in Québec. The OQLF’s general *œuf* entry says that an unqualified *œuf* refers to a hen’s egg and separately discusses duck eggs, but the targeted OQLF search found no pidan/century-egg entry. Therefore use the locally attested *œuf de cent ans* as a transparent product name, not as an OQLF-approved term. Do not add a literal French calque such as *œuf préservé* or a duck-specific French alias without Québec product evidence.

`preserved duck egg(s)` is included as a narrow retailer-attested search alias: Walmart Canada’s current product page calls the specific duck product “Preserved Duck Eggs” and identifies it as century egg/pidan. This alias has a measurable picker cost: a broad `duck egg` query will show both the existing duck-egg identity and the new century-egg identity. The row labels remain distinct, and selecting the century-egg identity does not assign a form to duck egg. Keep this consequence visible for the integration decision; dropping that one alias would preserve a single result for broad `duck egg`, but would lose the exact current retailer phrase. No French equivalent such as *œuf de cane préservé* is proposed.

Do not add the Chinese-script alias `皮蛋` in this data-only change: `normalizeIngredientSearchKey` strips non-Latin characters, leaving that alias unsearchable in the current picker. The Latin name *pidan* remains searchable. Do not add unverified transliterations such as “pee dan” or “pei dan.”

## Picker projection

The projection follows `IngredientReferenceSearchIndex` in `IngredientSearch.kt`, including attached form terms, normalized phrase matching, and the picker’s localized reference label. Counts are current exact-phrase results, with the proposal applied:

| Query | Current results | Proposed results |
| --- | --- | --- |
| `century egg(s)` | 0 | 1 — century egg / œuf de cent ans |
| `preserved egg(s)` | 0 | 1 — century egg / œuf de cent ans |
| `preserved duck egg(s)` | 0 | 1 — century egg / œuf de cent ans |
| `pidan` / `pidàn` | 0 | 1 — century egg / œuf de cent ans |
| `œuf(s) de cent ans` | 0 | 1 — century egg / œuf de cent ans |
| `duck egg` | 1 — duck egg, salted-form hint only for the exact salted query | 2 — duck egg and century egg; no pidan form hint |
| `œuf de canard` | 1 — duck egg | unchanged |
| `salted duck egg` / `œuf de canard salé` | 1 — duck egg with salted form hint | unchanged |
| `egg` / `œuf` | 8 / 5 | 9 / 6 |

The broad `duck egg` overlap is caused by the retailer-backed English alias; the French generic duck-egg query remains scoped to the duck-egg row because no duck-specific French pidan alias is added. No source phrase auto-selects a pidan *form*: this is a separate identity, and the user still selects the labeled row.

## Recipes, quantities, conversions, and substitutions

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for century egg(s), pidan, 皮蛋, preserved egg(s), preserved duck egg(s), œuf(s) de cent ans, and common related terms. No recipe document or ingredient row matched. There is no bundled recipe link, recipe-specific quantity, or substitution demand.

No reusable kitchen measure, count weight, density, unit mapping, conversion, yield, package yield, or substitution is supported. The available quantities are source-specific observations, not reusable ingredient data:

- The current Québec-locale T&T category lists **T&T Preserved Duck Eggs (600 g)**. It is a retailer product/package listing, not a per-egg or recipe amount; the live page shell could not be directly opened, so the product text was reviewed from its current indexed listing.
- Walmart Canada lists a **350 g** Six Fortune preserved-duck-egg product and identifies that SKU with century egg/pidan. Its size is specific to that listing, and its stock state is volatile.
- The OLO guide describes one preparation with a **50-day** wrapping period. The BCCDC guidance documents several production paths and time/chemistry examples, including a traditional process example of 125 g sodium carbonate, 65 g wood ash, 1 kg calcium oxide, and 100 g salt in 500 ml water or tea. These are method-specific production descriptions, not preparation-state durations or recipe measures for the catalog.

Do not infer a fresh-egg replacement ratio or substitute pidan for fresh duck, chicken, or quail egg, salted duck egg, egg white, or yolk. No source supplies paired quantities or a context-specific culinary role suitable for a substitution rule.

## Source record candidates and limits

| Suggested source ID | Source / URL | Supports | Limits / ownership |
| --- | --- | --- | --- |
| `WP04-PIDAN-R348-20261016-S01` | China National Standards Information Service, [GB/T 9694-2014](https://openstd.samr.gov.cn/bzgk/std/newGbInfo?hcno=D839B1FF668A354CAB8628022491B378) | Standard number, Chinese title *皮蛋*, English title *Preserved egg*, and current status. | Only metadata was accessible; do not infer an ingredient definition or species scope from the title. URL has no current ledger owner. |
| `WP04-PIDAN-R348-20261016-S02` | BC Centre for Disease Control, [Pidan/Century Egg food-safety guidance](https://www.bccdc.ca/resource-gallery/Documents/Educational%20Materials/EH/FPS/Food/Fermented/Fermented%20Foods%20Guidance%20-%203.14%20Pidan%20Century%20Egg.pdf) | Current Canadian public-health description; name variants; typical duck egg and possible chicken/quail egg inputs; alkaline chemical process, finished product, and production-method variability. Guidance updated December 2024 and reviewed with a national working group including Québec MAPAQ members. | Food-safety guidance, not a catalog standard or culinary substitution source. Production recipe examples are process-specific. URL has no current ledger owner. |
| `WP04-PIDAN-R348-20261016-S03` | Fondation OLO and Dispensaire diététique de Montréal, [*Découvrir le monde et ses diverses saveurs: Profils alimentaires* (PDF)](https://stage.fondationolo.ca/wp-content/uploads/2017/12/fondation-olo-profils-alimentaires-complet-2017.pdf) | Local French wording *Pidàn/œuf de cent ans*, one Québec-described culinary context, serving uses, and availability at Chinese groceries in Québec. The associated [Fondation OLO article](https://fondationolo.ca/fr/actualites/le-dispensaire-dietetique-de-montreal-et-la-fondation-olo-devoilent-profils-alimentaires/) describes the guide’s Quebec cultural-food reference purpose. | Guide was published in 2017 and describes a duck-egg preparation; it does not limit pidan to duck or establish a universal process. Its 50 days are source-specific. URLs have no current ledger owner. |
| Reuse `WP04-SALTED-DUCK-EGG-R292-20261016-S02`; new French-locale source `WP04-PIDAN-R348-20261016-S04` | T&T Supermarket, [English egg category](https://www.tntsupermarket.com/eng/product-categories/tt-dairy-frozen/tt-eggs.html); current French-locale [egg category](https://www.tntsupermarket.com/fr/product-categories/tt-dairy-frozen/tt-eggs.html) | Existing English category distinguishes preserved duck eggs from salted whole duck eggs, cooked salted eggs, and salted yolks. The French-locale listing currently indexes “T&T Preserved Duck Eggs (600g).” | Reuse the existing English URL/source ID already owned by the R292 form record. The French-locale URL is new and is only used for its indexed product name/package listing; direct open returned an internal error. Retailer taxonomy and 600 g SKU do not establish a general measure. |
| `WP04-PIDAN-R348-20261016-S05` | Walmart Canada, [Six Fortune Preserved Duck Eggs](https://www.walmart.ca/en/ip/Preserved-Duck-Eggs/6000197109351?selectedSellerId=0) | The product attributes identify duck eggs, a 350 g refrigerated SKU, and the product details call preserved egg century egg/pidan (皮蛋), ready to eat as a side dish. Supports the exact alias `preserved duck egg`. | Retailer page says product details may come from manufacturers/suppliers and are not independently verified; package size and availability are SKU-specific. URL has no current ledger owner. |
| `WP04-PIDAN-R348-20261016-S06` | OQLF, [GDT entry *œuf*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429205/oeuf) | Says an unqualified *œuf* denotes a hen’s egg, and separately discusses duck eggs; useful for the species-language boundary only. | Entry last updated in 1983 and is not a pidan naming source. No pidan/century-egg entry appeared in the targeted OQLF search. URL has no current ledger owner. |

## Recommendation

Accept one standalone `ingredient-ref-century-egg` identity in category `EGG`, labeled **century egg / œuf de cent ans**, with the bounded aliases above. It represents the recognizable alkaline-preserved finished egg product across species; it does not assert which bird supplied a particular product. Keep the current duck-egg and salted-duck-egg records untouched. Add no attached forms, ingredient measures, conversions, yields, recipe links, or substitution rules. Record package/process quantities only as source-specific evidence if the root integration requires them.

## Verification performed

- Read the current Section Q checklist, active reference/form files, legacy-import candidates, R292 salted-duck-egg proposal/integration, current IngredientSearch normalization/picker behavior, and relevant ledger/source ownership.
- Searched all 114 bundled recipe JSON documents (1,123 ingredient rows); found no pidan/century-egg terms.
- Checked the current Chinese standard metadata, current BCCDC guidance, Québec French food-profile wording, OQLF terminology context, T&T category listing, and Walmart product details online. Direct T&T category page fetch failed; its current indexed listing was reviewed and the limitation is recorded above.
- No software tests, build, or emulator verification were run, following `AGENTS.md` for this database JSON-only addition.

## Integration

Integrated by the root coordinator in [`wp04-section-q-century-egg-identity-integration-r348-20261016`](../batches/wp04-section-q-century-egg-identity-integration-r348-20261016/README.md). The active catalog now has one standalone `EGG` identity, `century egg / œuf de cent ans`, for pidan across egg species. The `preserved duck egg` alias intentionally makes the broad `duck egg` query return both the species identity and the distinct preserved product; the alias is a retailer-attested product name and does not attach a form to duck egg.
