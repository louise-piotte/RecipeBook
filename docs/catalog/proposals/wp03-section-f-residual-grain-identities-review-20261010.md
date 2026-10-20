# WP03 Section F Residual Grain Identities Review — Rye Berries Delta

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal only; no canonical catalog, ledger, recipe, plan, roadmap, or test file changed.
- **Scope:** a narrowly scoped delta to [`wp03-section-f-residual-gap-audit-20261010.md`](wp03-section-f-residual-gap-audit-20261010.md). That audit kept rye berries unresolved pending product-level evidence. This review addresses only that candidate; it does not reopen its white-rice recommendation or repeat other Section F holds.
- **Recommendation:** accept a separate food-grain identity for intact rye kernels sold as rye berries, with proposed displays `rye berries / grains de seigle` and the source-attested English alias `rye kernels`. Keep forms, measurements, conversions, yields, and active substitutions empty.
- **Snapshot inspected:** 792 active ingredient references, 36 ingredient forms, 1,018 research-ledger records, 81 legacy candidates, 114 bundled recipe files, and 1,123 ingredient rows.

## Candidate boundaries and dispositions

| Candidate or wording | Disposition | Boundary |
| --- | --- | --- |
| `rye berries` | **Accept as a distinct identity for integration review** | Food-grade, intact rye kernels marketed as an ingredient. Do not treat the broad `rye / seigle` row as evidence for this narrower product by itself; the product sources below supply the missing whole-kernel scope. |
| `rye kernels` | **Accept as the only proposed English alias** | A Québec retail product page explicitly uses this wording for the intact kernels it also calls rye berries. Keep the alias plural and source-scoped. |
| `grains de seigle` | **Proposed fr-CA display; keep independent Québec terminology review open** | A Québec mill uses this wording for its food-grade rye-grain product. OQLF supports `seigle` for rye but does not give a dedicated entry for the rye-berries product or certify this longer display as a preferred term. |
| `rye`, `seigle`, `rye grain(s)`, `grain(s) de seigle`, `whole rye`, `seigle entier`, `seigle en grains` | **Do not add as aliases** | The broad `ingredient-ref-rye-grain` already owns `rye / seigle`; the other phrases do not consistently distinguish the intact-kernel product from broad rye or other rye products. Keep source wording available for a future exact-context review. |
| Cracked rye | **Keep separate; do not alias to rye berries** | La Milanaise presents its cracked rye product separately from its organic rye-grain product. This source supports the distinction, not a new cracked-rye row in this packet. |
| Rye flour, rye meal, and malted rye flour | **Retain existing identities unchanged** | These active milling products remain distinct from the intact-kernel food grain. Do not move their aliases or evidence. |
| Rye flakes, bran, sprouted rye, feed, and planting seed | **Outside the accepted identity scope** | No reviewed evidence supports treating these products or uses as aliases for the intact food kernels. |

## Proposed canonical row

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and fields |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-rye-berries` | `rye berries` | `grains de seigle` | `rye kernels` | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

The French display is a conservative, source-backed Québec food-use phrase rather than a claim of OQLF-preferred terminology. Do not add an organic qualifier, cultivar, botanical species, or processing claim to the canonical name. Do not activate `seigle criblé`: a retailer's French product title does not establish that phrase as a general Québec name for rye berries.

## Catalog, ledger, legacy, and collision audit

The active seed contains `ingredient-ref-rye-grain` (`rye / seigle`), `ingredient-ref-rye-flour` (`rye flour / farine de seigle`), `ingredient-ref-rye-meal` (`rye meal / gruau de seigle`), and `ingredient-ref-malted-rye-flour` (`malted rye flour / farine de seigle malté`). Their current aliases remain unchanged. No active reference or ingredient form has an exact normalized key for `rye berries`, `rye kernels`, or `grains de seigle`; the proposed ID is unused. The active seed has no rye-specific form.

The verified `ingredient-ref-rye-grain` ledger decision specifically kept `rye berries` and `grain de seigle` inactive until additional product evidence existed. No separate rye-berries ledger record or rye/seigle legacy candidate was present. The current product evidence below addresses that prior hold; root integration should update the existing rye-grain decision or create the candidate record using the project's ledger workflow rather than leave the old rationale stale.

The normalized exact-key check covered active reference displays and aliases, form match terms, and proposed names/aliases. It found no exact collision for the proposed ID, `rye berries`, `rye kernels`, or `grains de seigle`. Broad `rye` and `seigle` searches can continue to return neighboring rye products; the proposal does not claim those broad searches are unique or require a picker change.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned for `rye`, `seigle`, `rye berries`, `rye kernels`, `rye grains`, `grains de seigle`, `grain de seigle`, `seigle en grains`, and `seigle entier`, including line text, ingredient names, and reference IDs. The scan found **zero matching ingredient lines and zero matching recipe files**. No recipe link or text change is proposed.

## Keep identity, grain product, preparation forms, and numeric rules separate

| Concern | Recommendation |
| --- | --- |
| **Ingredient identity** | Use one new `GRAIN_AND_CEREAL` identity for the source-defined intact rye-kernel food product. Retain broad `rye / seigle` as a separate general grain identity; do not replace it, add rye berries as its alias, or merge rye berries with flour or meal. |
| **Grain product boundary** | “Intact kernels” describes the product boundary that distinguishes rye berries from cracked rye. It is not a milling grade, and this review does not define hull removal or another processing standard beyond the product sources' wording. |
| **Ingredient forms** | Add no `IngredientForm` rows. The reviewed use cases mention soaking and cooking, but the recipe corpus has no rye line that needs dry/cooked matching. Do not encode `whole` or `intact` as a preparation-state form. Revisit dry/cooked forms only if a later exact recipe or data requirement needs that distinction. |
| **Measurements** | Leave density, serving weights, and volume measures unassigned. The reviewed product pages provide no general measurement basis for the catalog. |
| **Conversions and yields** | Add no unit mappings, mass-volume conversion, soaking expansion, dry-to-cooked yield, or package yield. La Milanaise's 8–24-hour soaking instruction is process guidance; it is not a quantity relation or conversion factor. |
| **Substitutions** | Activate no rule. La Milanaise says its rye grains can replace rice in soups or salads. Preserve that as a source- and dish-context observation only: the page gives no amount or ratio, and it does not establish rye berries as a general rice substitute. Keep the ledger substitution state `not_yet_researched` and do not create a global or contextual runtime rule from this statement alone. |

## Source register

New IDs are local to this proposal and are not ledger source IDs. All sources were accessed on 2026-10-10.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-RYE-BERRIES-20261010-S01` | La Milanaise, [Seigle biologique](https://lamilanaise.com/produits/seigle-biologique/) | Current Québec manufacturer page. The product copy calls the food product `grains de seigle` and describes use in soups, salads, and bread after soaking. It supports the proposed French wording and food use, not a standardized English `rye berries` equivalence by itself. |
| `WP03-RYE-BERRIES-20261010-S02` | La Milanaise, [Organic Rye](https://lamilanaise.com/en/produits/organic-rye/) | The same Québec mill's English product page calls it `Organic Rye Grains`, with corresponding soup, salad, and bread uses. It supports a source-matched bilingual grain product; the product title does not use `berries`. |
| `WP03-RYE-BERRIES-20261010-S03` | La Milanaise, [Organic Cracked Rye](https://lamilanaise.com/en/produits/organic-cracked-rye/) | A separately named rye product page. Supports keeping cracked rye apart from the intact grain product; it does not settle the French display or all cracked-rye milling classes. |
| `WP03-RYE-BERRIES-20261010-S04` | Silo EST, Sherbrooke, [Seigle Criblé Bio](https://catalogue.lesilo.co/en/T-seigle-crible-bio) | Québec retailer page says rye kernels are also known as rye berries and defines them as intact rye kernels. Supports the proposed English alias and narrow product boundary. Its French page title is not adopted as a global French name. |
| `WP03-RYE-BERRIES-20261010-S05` | Fresh Acres, [Organic Rye Berries](https://freshacres.ca/products/organic-rye-berries) | Canadian farm product page describes whole Canadian-grown rye berries for milling or cooking as a grain. Corroborates current Canadian food-market use; does not set Québec French terminology or general measurement values. |
| `WP03-S53` (existing ledger source) | OQLF, [seigle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle) | Gives the bilingual pair `seigle / rye` and says `seigle` names both the plant and its grain. Supports the broad active identity, not the narrower rye-berries product; reused rather than duplicated. |

## Review disposition

Accept `ingredient-ref-rye-berries` for integration review with the proposed display pair and the one English alias shown above. Keep independent Québec terminology review open for `grains de seigle`. Preserve the existing broad rye, flour, and meal identities; add no forms, numeric records, conversions, yields, recipe links, or active substitutions. Other residual Section F candidates remain governed by their existing reviews and the prior residual-gap audit.
