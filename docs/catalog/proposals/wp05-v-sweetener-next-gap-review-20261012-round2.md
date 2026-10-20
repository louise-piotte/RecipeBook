# WP05 Section V sweetener next-gap review — no new identity

- **Date:** 2026-10-12
- **Status:** proposal-only scope audit; no catalog, ledger, plan, roadmap, recipe, or batch README was changed.
- **Decision:** do not propose a new sweetener identity from Section V. The plan's plausible sweetening-related leads are already active, explicitly held in WP05 reviews, or too generic to identify a product.

## Scope and candidate dispositions

Section V covers vinegars, acids, juices, stocks, beverages, and culinary alcohol. Its current open beverage checklist does not name a distinct sweetener product that is both unreviewed and product-bounded. I checked the nearby Section V leads that could look like sweetener work:

| Section V lead | Current disposition | Why it is not a new sweetener identity in this review |
|---|---|---|
| Monk-fruit juice concentrate | **Already active:** `ingredient-ref-monk-fruit-juice-concentrate`, `monk fruit juice concentrate / concentré de jus de fruit de moines`, category `SUGAR_AND_SWEETENER`. | WP02 established it as the food-ingredient class distinct from tabletop monk-fruit extract. The existing owner is explicit in the [WP05 fruit-and-vegetable-juice follow-up](wp05-section-v-fruit-and-vegetable-juices-followup-20261012.md). Do not duplicate it as a generic fruit concentrate. |
| Pomegranate molasses | **Already active:** `ingredient-ref-pomegranate-molasses`, `pomegranate molasses / mélasse de grenade`, category `SAUCE_AND_CONDIMENT`. | Section V acidic-juice work retains this finished condiment and its existing boundary from juice and concentrate. The [acidic-juice proposal](wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md) expressly keeps the active owner unchanged; Narsharab and generic pomegranate syrup remain unresolved. |
| Generic fruit juice, fruit nectar, generic juice concentrate, drinks/cocktails/punch, and named juice concentrates without a fruit-specific recipe | **Held by the existing Section V residual review.** | The [residual fruit-juice product review](wp05-section-v-fruit-juice-residual-products-sweep-20261012.md) keeps these out of the active catalog where the product or source fruit is unspecified, notes no matching ingredient rows, and documents search collisions for `fruit juice`, `fruit juice concentrate`, and `nectar`. A sweetened beverage is not a pure sweetener identity. |
| Hot-chocolate/cocoa mix and malt drink mix | **Held by the existing Section V beverage review.** | The [coffee, tea, and beverage follow-up](wp05-section-v-coffee-tea-beverages-followup-20261012.md) records current retail examples as formulation-specific products and holds generic mix identities until exact recipe demand. Sugar or glucose syrup in a product label is not evidence for a separate sweetener row. |
| Salt-added cooking wines and sweetened mirin-style seasonings | **Held as product-specific cooking-wine candidates.** | The [cooking-wine boundary review](wp05-section-v-salted-cooking-wines-boundary-review-20261012.md) keeps these distinct from plain wine and mirin but inactive without an exact recipe product. Their added sugar is part of a formulated cooking seasoning, not a generic sweetener candidate. |
| Recipe 065's optional `sweetener, to taste` line | **No product identity is specified.** | The row is unlinked and its notes offer `anko` or `maple syrup` as examples. Maple syrup has an active identity; anko is mentioned as a recipe example but has no active ingredient-reference identity. The phrase does not justify mapping the row to either example or adding a generic `sweetener` ingredient. |

Other syrup and sugar entries in Section C belong to WP02's sweetener review. The source-specific Kampong Speu palm-sugar syrup belongs to the earlier WP05 Southeast Asian proposal; it is neither a Section V lead nor an unreviewed candidate. This audit does not reopen those decisions.

## Live recipe and catalog check

I read the current bundled package and every recipe path in its manifest. The package has 114 recipes and 1,123 ingredient rows. The only unlinked generic sweetener row is recipe 065, row 4, `Sweetener, to taste`; its examples are anko and maple syrup. The exact beverage and juice product candidates above do not appear as recipe ingredient rows.

The current catalog already assigns the exact active keys for monk-fruit juice concentrate and pomegranate molasses. The held fruit-juice, drink-mix, and cooking-wine candidates remain owned by their cited WP05 review packets. No additional Section V sweetener product was found that clears both the existing-owner and prior-review checks.

## Sources and scope limits

This audit reuses the cited local review packets and their source registers. In particular, those packets distinguish the active monk-fruit concentrate and pomegranate-molasses identities from generic juice products; they do not make sugar-containing drinks, mixes, or cooking seasonings synonyms for their individual sweeteners. The recipe 065 option list is recipe context only and is not a general substitution rule.

**Disposition:** no identity, alias, recipe link, form, measure, conversion, yield, or substitution is proposed. Section V's broader beverage checklist remains open.
