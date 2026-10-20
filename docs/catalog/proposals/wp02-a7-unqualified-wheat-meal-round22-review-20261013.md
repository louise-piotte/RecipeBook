# WP02 Section A7: unqualified wheat-meal candidate, R22 recheck

## Review record

- **Review date:** 2026-10-13
- **Scope:** Recheck the unresolved generic `wheat meal` candidate after acceptance of the narrower whole-wheat-meal identity.
- **Disposition:** **Hold the generic candidate.** Keep the existing qualified reference unchanged; add no active identity or alias.
- **Status:** Integrated on 2026-10-13 as a refreshed ledger-only unresolved decision on `ingredient-ref-wheat-meal`; the narrow active row and its aliases remain unchanged. See the [R22 integration batch](../batches/wp02-wp03-wp04-round22-gap-review-integration-20261013/README.md).

## Recommendation

Keep `ingredient-ref-wheat-meal` scoped to **`whole wheat meal` / `farine de blé entier brute`**, with the existing French alternate **`farine de blé complet brute`**. Keep unqualified **`wheat meal`** unresolved, without a separate active reference, alias, or proposed Québec French display.

The current Canadian retailer and manufacturer evidence is for a specifically named Honeywell **Whole Wheat Meal** product. It supports the existing qualified row; it does not establish that every human-food product called *wheat meal* has the same whole-kernel composition, use, or French name. Current Canadian regulatory and trade listings continue to use the unqualified term without a consumer milling definition. The inspected Québec terminology evidence names whole wheat meal specifically, not generic wheat meal.

Do not add `wheat meal` to the existing row as an alias. The picker already returns that narrow row for the broad query because `wheat meal` is a complete phrase inside the display `whole wheat meal`; that result is a search overlap, not evidence that the generic candidate is identical to the whole-wheat product.

## Evidence rechecked

- Honeywell Flour Mills' current [product catalogue](https://www.honeywellfood.com/products/) lists **Honeywell Whole Wheat Meal** under a **Whole Grain** label and lists **Honeywell Semolina** separately. This is current manufacturer naming for a qualified product, not a general definition of *wheat meal*. Its linked product-detail page could not be fetched during this review.
- The Canadian retailer MyChopChop's current [Honeywell Whole Wheat Meal listing](https://www.mychopchop.ca/products/honeywell-whole-wheat-meal) names a **900 g** product, describes it as made from **100% whole wheat** and finely milled, and gives Nigerian swallow preparation context. The listing was marked **sold out** when checked. It gives no Québec French display and is product-specific retail copy, not a generic Canadian milling standard. Its mention of Honeywell Whole Semolina and mixed-grain swallow as similar/alternative products is not a recipe substitution rule.
- The [OQLF GDT entry for `farine de blé entier brute`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute) lists `farine de blé entier brute` and `farine de blé complet brute` as preferred French terms, with English equivalents `coarse whole wheat flour` and `whole wheat meal`. The entry was last updated in 1984 and is terminology support for this qualified identity; it does not name generic `wheat meal`.
- The current [CFIA Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) list `wheat meal` among ingredients that may be used in standardized bread without defining its composition there. In the same section CFIA separately defines `crushed wheat or coarse ground wheat` and `cracked wheat`; those definitions do not define wheat meal or make the names interchangeable.
- The Government of Canada's [Canadian Importers Database](https://ised-isde.canada.ca/app/ixb/cid-bdic/searchProductResults.html?hs4endCode=1109&hs4startCode=1101&hs6Code=1101) lists `Wheat meal` under HS 110311 in the cereal groats, meal, and pellets group. This trade classification confirms the term's use but supplies no consumer product boundary or Québec French name. The existing ledger's current French tariff source likewise groups wheat groats and meal collectively as `gruaux et semoules de froment (blé)`; it does not isolate a generic Québec display. The source was added to the existing ledger record with an R22 unresolved decision.
- Search indexing still returns text for the [Ottawa Valley Grain whole-grain wheat meal page](https://www.ottawavalleygrain.ca/products/wheat/whole-grain-wheat-meal/), describing whole wheat with bran, germ, and endosperm retained. A direct page open returned **404**, so I do not count the indexed copy as an accessible current source or as evidence for bare `wheat meal`.

## Current catalog, picker, and recipe audit

The split bundled package currently has **1,348 references** and **98 forms**. `ingredient-ref-wheat-meal` remains the sole active owner of the qualified English and French names. Its display is `whole wheat meal` / `farine de blé entier brute`; its only alias is the French alternate `farine de blé complet brute`. The row remains in `FLOUR_AND_STARCH`, with `defaultDensity: null` and no unit mappings. No form, package yield, substitution rule, or recipe link refers to this reference.

The current search implementation returns:

| Query | Current result | Boundary |
| --- | --- | --- |
| `wheat meal` | `ingredient-ref-wheat-meal` | Complete phrase occurs inside `whole wheat meal`; this does not resolve the unqualified candidate. |
| `whole wheat meal` | `ingredient-ref-wheat-meal` | Exact qualified identity. |
| `farine de blé entier brute`; `farine de blé complet brute` | `ingredient-ref-wheat-meal` | Exact qualified French names. |
| `semoule de blé` | `ingredient-ref-durum-semolina`; `ingredient-ref-semola-rimacinata` | Both active durum-semolina names contain the query phrase; do not reuse it as a generic wheat-meal alias. |
| `farina` | Four Italian soft-wheat flour-grade rows (types 0, 00, 1, and 2) | Existing Italian aliases make this a poor generic meal query. |
| `wheat farina`; `wheat grits`; `gruau de blé`; `gruaux de blé` | No result | No active generic owner. |

The picker falls back to substring matching after complete-phrase matching. As a result, `wheat groats` also returns two buckwheat-groats rows because `wheat` occurs within `buckwheat`; this is a search-boundary artifact, not evidence of a wheat-groats owner. No picker behavior change is proposed in this review.

I searched all **114 manifest-listed recipes / 1,123 ingredient rows**, checking `originalText`, `ingredientName`, `preparation`, and `notes` for `wheat meal`, `whole wheat meal`, wheat farina/groats/grits, cracked or coarse-ground wheat, and the relevant French phrases. There were **zero matching rows**. No recipe link or relink is proposed.

## Ledger and quantitative behavior

The ledger record `ingredient-ref-wheat-meal` is now `identityState: verified` for the scoped active whole-wheat-meal identity. Its decision history retains a separate unresolved decision for bare `wheat meal`; the narrower acceptance does not replace that hold. The record's measurement and substitution research states remain `not_yet_researched`.

The 900 g retailer package size is package net weight, not a kitchen volume-to-mass observation. No source reviewed establishes a cup, spoon, or other household measure, density, unit mapping, yield, or general conversion. The retailer's product alternatives are market suggestions, not ingredient substitution evidence. Add no measurement observation, substitution finding, conversion, form, or package yield.

## Exact disposition

1. **Retain:** `ingredient-ref-wheat-meal` as `whole wheat meal / farine de blé entier brute`, with `farine de blé complet brute` as its existing French alias and category `FLOUR_AND_STARCH`.
2. **Hold:** generic `wheat meal` as unresolved and inactive. Do not add it as an alias to the qualified row, and do not invent a generic Québec French display.
3. **Keep separate:** wheat flour, whole-wheat flour, cracked/coarse-ground wheat, wheat groats, durum semolina, and the whole-wheat-meal row. In particular, do not add `semoule de blé`, `gruau(x) de blé`, `coarse whole wheat flour`, or `farina` as generic aliases.
4. **Add no behavior:** no forms, recipe links, measurements, density, unit mappings, package yields, conversions, or substitution rules.

Reopen the generic candidate only if a source identifies a standalone human-food product called *wheat meal* with a sufficiently specific milling boundary and independently supportable Québec French wording, distinct from the existing whole-wheat-meal, cracked-wheat, flour, and durum-semolina identities.
