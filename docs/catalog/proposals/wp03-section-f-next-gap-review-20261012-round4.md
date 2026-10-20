# WP03 Section F: cracked rye identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as identity-only `ingredient-ref-cracked-rye`; see the [integration README](../batches/wp03-section-f-cracked-rye-identity-integration-20261012/README.md). No recipe, form, measure, yield, conversion, or substitution data changed.
- **Scope:** Plain cracked rye as a Québec/Canadian marketed food-grain product, reviewed as a distinct preprocessed-grain candidate.
- **Recommendation:** Add identity-only `cracked rye / seigle concassé` in `GRAIN_AND_CEREAL`, with no aliases, forms, active measures, conversions, yields, recipe links, or substitutions.
- **Open checklist:** The plan still leaves regionally significant cereal mixes and preprocessed grains open at [plan line 2146](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239).

At review time, no cracked-rye row had been allocated after the rye-berries and rye-flakes reviews. The 2026-10-10 rye-berries packet explicitly kept cracked rye separate from intact rye berries but did not review or allocate a cracked-rye row ([prior residual-grain review](wp03-section-f-residual-grain-identities-review-20261010.md)). The review snapshot represented rye grain, rye berries, rye flakes, rye flour, and rye meal separately; none owned cracked rye. Current La Milanaise product listings name cracked rye separately from whole rye and cracked-grain mixes. This integration fills that distinct identity gap without reopening those accepted rows.

## Current catalog, ledger, and recipe audit

The snapshot was checked in the current workspace on 2026-10-12. Exact ownership used the repository's case-, accent-, ligature-, punctuation-, and whitespace-normalized search keys.

| Artifact | Current count or result |
|---|---:|
| `ingredient-references.v1.json` | 1,308 references |
| `ingredient-forms.v1.json` | 98 forms |
| `legacy-import-identities.v1.json` | 64 candidates |
| `research-ledger.v1.json` | 1,616 records; 5,876 source entries |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows |

No active reference, ingredient form, legacy candidate, or ledger record ID owns `ingredient-ref-cracked-rye`, `cracked rye`, `cracked rye berries`, `cracked rye grains`, `seigle concassé`, or `seigle concassé biologique`. There is **no dedicated cracked-rye candidate record or hold**. The ledger contains incidental mentions on the Original Red River, rye-flakes, and Sunny Boy records, where cracked rye is a component or product-boundary detail. Those mentions do not allocate a rye identity. The Original Red River record also lists cracked rye as one component of its composite cereal; that is not a recipe or ownership link to a standalone ingredient.

Current neighboring catalog rows are `ingredient-ref-rye-grain` (`rye / seigle`), `ingredient-ref-rye-berries` (`rye berries / grains de seigle`), `ingredient-ref-rye-flakes` (`rye flakes / flocons de seigle`), and the separate rye flour, rye meal, and malted rye flour identities. `ingredient-ref-cracked-wheat` is a useful product-model precedent for a separately named cracked-grain ingredient; it does not imply wheat/rye equivalence. No current rye form, package-yield row, or substitution rule was found, and the proposed ID is unused.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for `cracked rye`, `cracked rye berries`, `cracked rye grains`, `rye chops`, `rye grits`, `seigle concassé`, and related spellings. The audit found **zero matching recipe files and zero matching ingredient rows**. A separate broad-word scan found no `rye` or `seigle` ingredient rows. No recipe link or recipe change is proposed.

## Proposed identity and naming boundary

La Milanaise, a Québec mill, lists **Seigle concassé biologique** as a consumer grain product and advises soaking it for 8–24 hours before adding it to bread recipes [S01]. Its French product family lists the cracked product separately from **Seigle biologique** and from named 6- and 9-grain cracked mixes [S01]. The same mill's English product listing calls the corresponding item **Organic Cracked Rye**, separately from Organic Rye and the composite grain mixes [S02; existing English product evidence is also cited in the prior rye-berries packet]. A current Québec Food Directory product record lists `seigle concassé` as an ingredient in a Montréal bakery's rye poolish, independently supporting that French wording in local food use [S03].

| Integrated identity field | Value |
|---|---|
| ID | `ingredient-ref-cracked-rye` |
| English display | `cracked rye` |
| French display | `seigle concassé` |
| English aliases | None |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` |
| Identity scope | Dry rye grain sold as a cracked product for food use. The name does not assign a universal particle size, cultivar, or organic status. |
| Forms | None. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []`. |
| Recipe links, yields, conversions, substitutions | None. |

Keep cracked rye separate from:

- intact rye grain and `rye berries / grains de seigle`;
- rye flakes, rye meal, rye flour, and malted rye flour;
- cracked wheat and bulgur, which have separate grain identities and processing boundaries;
- formulated 6-, 9-, and 12-grain mixes, Original Red River cereal, bread, and other finished foods that may list cracked rye as one component.

Do not add `organic` as an alias: it is a source-product qualifier, not part of the general ingredient identity. Do not add `cracked rye berries` as an alias. A certification registry associates La Milanaise's product with the wording “Organic Cracked Rye Berries” [S05], but this is registry wording rather than the manufacturer's consumer title. More importantly, the current picker matches a complete query phrase inside a longer name or alias. Adding `cracked rye berries` would cause the exact query `rye berries` to return both the intact-kernel rye-berries row and this cracked product. The candidate's exact display `cracked rye` already covers the directly marketed English name. Do not add `rye chops` as a global alias either: one U.S. mill uses that term for its own medium-fine granules, while Canadian suppliers report multiple cracked-rye granulations [S04, S06].

The recommended French display is directly used by a Québec grain mill and appears in a current Québec bakery ingredient statement. OQLF's existing `seigle` entry supports the base bilingual term `seigle / rye` (existing ledger source `WP03-RYE-RECHECK-20261010-S01`); it does not rule on the full compound `seigle concassé`. No OQLF preference for the compound is claimed.

## Picker and search boundary

The current search code prioritizes full word-phrase matches across display names and aliases, then falls back to substring matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Static comparison predicts that the proposed exact queries `cracked rye` and `seigle concassé` will resolve to this identity. Broad `rye` and `seigle` searches will also find the new product alongside existing rye identities, as expected. Keep `cracked rye berries` out of the aliases to preserve the current exact `rye berries` query for intact kernels. This is a source-code behavior review, not live picker or emulator QA.

## Identity, form, measurement, and substitution findings

| Concern | Evidence and decision |
|---|---|
| Product identity | Current bilingual manufacturer listings establish a marketed cracked-rye grain product distinct from whole rye and multi-grain mixes [S01, S02]. Recommend one identity-only row, parallel to the existing distinct `cracked wheat` product boundary. |
| Forms | Add no `IngredientForm`. The dry cracked product as sold is the identity. The 8–24-hour soaking instruction is one manufacturer preparation direction for bread use, not evidence of a reusable soaked/cooked form or a dry-to-soaked conversion [S01, S02]. |
| Measures and conversions | The manufacturer pages give no mass/volume value, serving weight, cooking ratio, or yield. Everspring offers 50 lb or 20 kg supplier packages [S04]; these are package sizes, not household measures or product-level density. A package amount cannot be assigned to La Milanaise's product or to a general cracked-rye measure. Add no observation, density, unit mapping, conversion, or yield. |
| Source-specific numeric detail | Preserve the 8–24-hour soak only as preparation context. It is a duration, not a serving quantity or measure relation. Do not infer an amount of water or a cooked yield. |
| Substitutions | La Milanaise says its cracked product can be added to bread recipes, but does not state a replacement ingredient, ratio, or method boundary [S01, S02]. Its separate whole-rye page suggests whole rye grains in place of rice for soups or salads; do not transfer that statement to cracked rye. Add no substitution finding or rule. |
| Recipe demand | No bundled row or recipe file mentions rye or seigle. No recipe link, relink, quantity change, or form relationship is justified. |

The broad `ingredient-ref-rye-grain` ledger contains one source-specific historical USDA observation for NDB 20062, “Rye grain,” at 1 cup = 169 g. It does not describe cracked rye and must not be transferred. The rye-berries record explicitly keeps that value on the separate USDA record and has no measurement observation or conversion. This review adds no numeric behavior to any rye identity.

## Existing evidence reused

- The prior [rye-berries residual review](wp03-section-f-residual-grain-identities-review-20261010.md) cites La Milanaise's English **Organic Cracked Rye** product page as `WP03-RYE-BERRIES-20261010-S03`; it used that page only to distinguish cracked rye from intact rye berries. The current proposal reuses that citation context rather than representing it as a new shared-ledger source.
- The live Original Red River record cites Arva's current English and French product pages, `WP03-REDRIVER-20261012-S01` and `S02`, which list cracked rye as one component of the original composite cereal. Those records are used only as component-boundary evidence.
- OQLF's base entry `seigle / rye` is already recorded as `WP03-RYE-RECHECK-20261010-S01` on the broad rye ledger record. No duplicate terminology source is proposed.

## Proposal-local source register

The IDs below use the prefix `WP03-CRYE-20261012`, checked absent from the live research ledger before drafting and added to the new identity record during integration. Sources were reviewed on 2026-10-12.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-CRYE-20261012-S01` | La Milanaise, [Grains biologiques](https://lamilanaise.com/categorie-produits/grains-biologiques/), current French product listing: `Seigle concassé biologique`, `Seigle biologique`, and separate cracked-grain mixes. | Names the cracked product in French, gives a bread-use soak direction of 8–24 hours, and lists it separately from whole rye and composite grain mixes. It does not define a universal cut size, household measure, or cooking yield. La Milanaise identifies its location as Saint-Jean-sur-Richelieu, Québec. |
| `WP03-CRYE-20261012-S02` | La Milanaise, [Products archive, page 2](https://lamilanaise.com/en/produits/page/2/), current English listing: `Organic Cracked Rye` and `Organic Rye`. | Supports the current English product name, separate whole-rye listing, and the same bread-use soak direction. Existing product-page evidence is also cited in the prior rye-berries review; this source does not provide a mass/volume measure or a transferable preparation ratio. |
| `WP03-CRYE-20261012-S03` | Québec Food Directory, [Inéwa Boulangerie Alternative multigrain rye bread](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8239544), product record and rye-poolish ingredient statement; updated 2026-07-24. | The Québec product record's French ingredient list uses `seigle concassé` within a rye poolish in Montréal-made bread. Supports current Québec food-use wording; the composite bread is not a plain cracked-rye product and its 500 g net content is not a grain measure. |
| `WP03-CRYE-20261012-S04` | Everspring Farms, [Cracked Rye](https://www.everspringfarms.ca/product/cracked-rye/), Canadian supplier product details and sizing. | Current Ontario supplier lists Canadian-origin cracked rye with multiple granulations and sells bulk 50 lb or 20 kg packages. Supports a Canadian product class and warns that granulation can vary; package sizes are not household measures and no French display is supplied. |
| `WP03-CRYE-20261012-S05` | Nature's Food Certifiers, [Find Certified Products](https://nfccertification.com/find-certified-products/), La Meunerie Milanaise entry `Seigle Concasse Biologique / Organic Cracked Rye Berries`. | Documents a certification-registry wording variant that includes `berries`. It is not a consumer product page or Québec terminology ruling. Keep the phrase out of the active alias set because it would make exact `rye berries` queries find both the intact and cracked products. |
| `WP03-CRYE-20261012-S06` | Janie's Mill, [Organic Cracked Rye](https://www.janiesmill.com/collections/retail/products/cracked-rye-chops), product description. | This U.S. mill calls its own medium-fine cracked rye granules “rye chops.” Supports treating `rye chops` as mill-specific wording rather than a Canadian/Québec global alias or universal grain-size crosswalk. |

## Verification performed

Static review covered pre-integration exact-key ownership across references, forms, legacy candidates, and ledger IDs; incidental ledger mentions; all active rye-related forms, package yields, and substitution files; the current picker source; and all 114 manifest-listed recipe files and 1,123 ingredient rows. After integration, package/reference normalization, package validation, generated-index freshness, ledger schema/source validation, source ownership, UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator run was needed because this change only adds database JSON data and regenerates its Kotlin index; recipe files and application behavior were not changed.
