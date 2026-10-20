# WP05 Section V — residual fruit-juice product boundaries

- **Date:** 2026-10-12
- **Status:** proposal only; no catalog, ledger, roadmap, checklist, or workflow data changed
- **Scope:** source-named fruit juices, juice reconstituted from concentrate, bottled lemon/lime products, fruit-juice concentrates, nectars, juice drinks/cocktails, and juice claims
- **Excluded except as boundaries:** integrated coconut water, tomato juice, vegetable juice, verjus/verjuice, tamarind paste, pomegranate molasses, and the existing fresh lemon/lime aliases
- **Source namespace:** `WP05-FRUIT-JUICE-RESIDUAL-20261012-S01` through `S10`; checked against current ledger and proposal sources, with no ID collision

## Recommendation

Use the fruit named in the product as the identity boundary. Recommend identity-only references for the bounded single-fruit juice names below; do not create one generic juice identity. A ready-to-use juice reconstituted from the concentrate of that same fruit belongs with that named juice under the Canadian standard, so recommend only source-named `from concentrate` / `reconstituted` aliases on that juice. The water-removed concentrate itself is a distinct product and must not be aliased to ready-to-use juice.

For remaining packaged products, keep the scope narrow:

- Hold a generic `fruit juice` reference, generic nectar, generic fruit-juice concentrate, fruit drinks, cocktails, and punch. None occurs in a recipe row, and broad names create unhelpful search matches.
- Treat apricot, peach, pear, and prune nectars as distinct from juice and from each other. Hold their identities until a recipe or explicit library requirement names one.
- Hold generic “bottled lemon/lime juice” and brand names as global aliases. A bottle describes packaging, and the reviewed Canadian products have product-specific formulations. If a later line names a particular ready-to-use reconstituted juice, retain its fruit-specific juice owner; if it names the water-removed concentrate, create a separate concentrate identity.
- Do not create an identity or alias for `100% juice`; it is a product claim. Keep named juice blends, sparkling juice, juice drinks, cocktails, and concentrate bases distinct from plain single-source juice.

No forms, densities, unit mappings, conversions, package yields, or substitutions are recommended. The only directly reported quantitative evidence is product-standard or manufacturer-specific; it does not establish a general kitchen conversion.

## Live package and recipe audit

Snapshot read on 2026-10-12. The package manifest was used to load every recipe and count every ingredient row. Hashes are over exact file bytes; the recipe-corpus digest is manifest-order path, NUL, exact file bytes, NUL.

| Data | Live count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,176 | `4dea98cb665a77e2c8e103af4c2c2225ff86a4df9b07bdd9f7948ad77c6ea237` |
| Ingredient forms | 85 | `897a1d2e80f49d08810f4a08cc1b9b38429338217a8a995224688ac0bbf49699` |
| Legacy-import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,476 records / 4,926 source entries / 4,033 distinct source IDs / 8 unit conversions | `37167524da5e12910677f6080c31638b31277ce940e632784bbd392eaa991a70` |
| Manifest recipe corpus | 114 recipes / 1,123 ingredient rows | `e3ce8e5c6f55a25d784c4976104c1a7fb31c2cec7caa4f8fec304ee11ca96894` |

I searched reference names/aliases, form labels/match terms, and legacy names/aliases with the app's accent-folded normalized phrase rules. I also scanned the `originalText`, `ingredientName`, preparation, notes, and group fields for every manifest ingredient row. Exact candidate-key search results are reported below; substring results are called out where they affect lookup.

### Recipe rows and current owners

There are **13 ingredient rows with juice wording** in the full corpus. Twelve are already linked to source-specific references; the remaining row is an unlinked recipe alternative. None requests a residual fruit juice, fruit nectar, bottled citrus product, juice drink, blend, or concentrate.

| Recipe / row | Exact ingredient wording | Current owner |
|---|---|---|
| 007 #5 — Refried Pinto Beans | `5 g vinegar or lime juice` | Unlinked compound alternative; keep unchanged. |
| 012 #6 — Lemon Crinkle Cookies | `60 ml fresh lemon juice` | `ingredient-ref-lemon-juice` |
| 014 #4 — Blueberry Cake Filling | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` |
| 019 #5 — Crab Balls | `2 tsp fresh lemon juice` | `ingredient-ref-lemon-juice` |
| 024 #3 — Date Squares | `2 tbsp lemon juice` | `ingredient-ref-lemon-juice` |
| 028 #5 — Cherry Almond Shortbread Cookies | `1 tbsp maraschino cherry juice` | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` |
| 029 #4 — Cherry Cake Filling | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` |
| 034 #13 — Classic Beef Chili | `3 tbsp lime juice` | `ingredient-ref-lime-juice` |
| 067 #6 — My Cherry Blossom Version | `2 tbsp maraschino cherry juice` | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` |
| 095 #7 — Satay | `1 tbsp fresh lime juice` | `ingredient-ref-lime-juice` |
| 106 #4 — Blueberry Pie | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice` |
| 108 #3 — Raspberry Pie | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice` |
| 113 #5 — Tzatziki | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` |

Current juice-adjacent owners and boundaries:

- `ingredient-ref-lemon-juice` is `lemon juice / jus de citron`, with existing `fresh lemon juice / jus de citron frais` aliases.
- `ingredient-ref-lime-juice` is `lime juice / jus de lime`, with existing `fresh lime juice`, `jus de lime frais`, and `jus de citron vert` aliases.
- `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` owns the recipe's maraschino-jar juice and `marasquino cherry juice`; it does not establish `cherry juice` as a broad alias.
- `ingredient-ref-verjuice` owns `verjuice / verjus` and the narrow alias `sour grape juice`. Generic `grape juice` remains a different source-fruit product.
- `ingredient-ref-monk-fruit-juice-concentrate` is an existing sweetener identity, not a generic fruit-juice owner.
- `ingredient-ref-apple`, `ingredient-ref-grapes`, `ingredient-ref-grapefruit`, `ingredient-ref-orange`, `ingredient-ref-pineapple`, and `ingredient-ref-cranberries` identify the fruits, not their juices. `ingredient-ref-pomegranate-molasses` remains a finished condiment, not juice or concentrate.
- The form file has no juice, nectar, or fruit-concentrate form. The legacy-candidate file has no exact or alias match for the residual candidates below.

The exact-key audit found no current owner for source-specific apple, grape, grapefruit, orange, pineapple, or cranberry juice; juice reconstituted from concentrate; named fruit-juice concentrates; named nectars; or fruit-juice drinks/cocktails. It did find these **search-only** overlaps: `fruit juice` and `fruit juice concentrate` occur as complete word phrases inside `monk fruit juice concentrate`; `nectar` falls back by substring to `nectarine`; and `sour grape juice` belongs to verjuice. `IngredientSearch.kt` prefers a complete word phrase and then falls back to substring matching, so these are material collisions even without an exact catalog key.

### Residual candidate decisions

| Candidate | Decision | Exact bilingual label and alias disposition | Recipe demand / owner |
|---|---|---|---|
| Single-fruit juice: apple | **Distinct identity** | `apple juice / jus de pomme`; no aliases proposed. | No juice row. Existing owner is apple fruit `ingredient-ref-apple`. |
| Single-fruit juice: grape | **Distinct identity** | `grape juice / jus de raisin`; no aliases proposed. Do not use `sour grape juice` here; that remains verjuice. | No juice row. Existing owner is grape fruit `ingredient-ref-grapes`; verjuice remains the sour, unripe-grape boundary. |
| Single-fruit juice: grapefruit | **Distinct identity** | `grapefruit juice / jus de pamplemousse`; no aliases proposed. | No juice row. Existing owner is grapefruit fruit `ingredient-ref-grapefruit`. |
| Single-fruit juice: orange | **Distinct identity** | `orange juice / jus d'orange`; no aliases proposed. | No juice row. Existing owner is orange fruit `ingredient-ref-orange`. |
| Single-fruit juice: pineapple | **Distinct identity** | `pineapple juice / jus d'ananas`; no aliases proposed. | No juice row. Existing owner is pineapple fruit `ingredient-ref-pineapple`. |
| Cranberry juice | **Hold; if later required, distinct identity** | `cranberry juice / jus de canneberge`; no aliases. | No juice row. Existing fresh and dried cranberry references do not own juice. OQLF uses `jus de canneberge` in its French grammar examples. |
| Generic fruit juice | **Hold** | `fruit juice / jus de fruits`; no aliases. | No row or exact owner. `fruit juice` also matches inside the monk-fruit concentrate display. Do not use this as an alias for any fruit-specific juice. |
| Juice from same-fruit concentrate, ready to use | **Alias to the same fruit's juice identity** | On `ingredient-ref-lemon-juice`: EN `lemon juice from concentrate`, `reconstituted lemon juice`; FR `jus de citron fait de concentré`, `jus de citron reconstitué`. On `ingredient-ref-lime-juice`: EN `lime juice from concentrate`, `reconstituted lime juice`; FR `jus de lime fait de concentré`, `jus de lime reconstitué`. For any future named fruit-juice identity, apply only the same-fruit wording. | No such row. These would be aliases to existing lemon/lime owners, with no new link or conversion. CFIA defines reconstituted named-fruit juice as juice made by adding water to concentrate from the same fruit and says it complies with that fruit's juice standard. |
| Generic bottled lemon/lime juice or brand names | **Hold** | No generic `bottled lemon juice / jus de citron embouteillé` or `bottled lime juice / jus de lime embouteillé` alias. Do not add `ReaLemon`, `ReaLime`, or `ReaLemon Infusions` as catalog-wide aliases. For a future brand-specific record, the manufacturer's exact labels are `ReaLemon Lemon Juice / jus de citron ReaLemon` and `ReaLime Lime Juice / jus de lime ReaLime`. | No bottled-product row. The existing lemon/lime owners remain as above. The manufacturer's product page describes water, concentrated juice, sulphites, and citrus oil, so a package or brand name alone cannot be generalized to every bottled juice. |
| Named fruit-juice concentrate, water removed | **Distinct from the ready-to-use juice; hold integration until named demand** | Examples with direct terminology: `lemon juice concentrate / jus de citron concentré`, with FR alternative `concentré de jus de citron`; `apple juice concentrate / jus de pomme concentré`, with FR alternative `concentré de jus de pomme`. The Canadian standard gives the wider source-specific pattern `concentrated (named fruit) juice / jus de (nom du fruit) concentré`. No generic concentrate identity or cross-fruit aliases. | No concentrate row. Do not alias to lemon/lime juice or to generic fruit juice. OQLF explicitly lists the lemon and apple French alternatives; CFIA defines named-fruit concentrate by water removal. |
| Frozen concentrated orange juice | **Distinct product; hold integration until named demand** | `frozen concentrated orange juice / jus d'orange concentré congelé`; no aliases. Keep a sweetened version separately qualified as `sweetened frozen concentrated orange juice / jus d'orange concentré congelé sucré`. | No matching row. CFIA Volume 4 names frozen orange concentrate and separately specifies the sweetened version; neither is an alias for ready-to-use orange juice. |
| Generic fruit-juice concentrate | **Hold** | `fruit juice concentrate / jus de fruit concentré`; no aliases. | No row or exact owner. `fruit juice concentrate` is contained within the existing monk-fruit concentrate search phrase. A source fruit must be named before a concentrate identity can be assigned. |
| Generic fruit nectar | **Hold** | `nectar / nectar`; `fruit nectar / nectar de fruit`; plural `fruit nectars / nectar de fruits`. No aliases. | No nectar row or exact owner. The bare search `nectar` currently falls back to `nectarine`. OQLF describes nectar as a fruit-juice-concentrate or purée beverage with water and sugar; that is not the same product as juice. |
| Apricot nectar | **Distinct from apricot juice; hold integration until named demand** | `apricot nectar / nectar d'abricot`; no aliases. | No row. Existing `ingredient-ref-apricot` is the whole fruit, not nectar. |
| Peach nectar | **Distinct from peach juice; hold integration until named demand** | `peach nectar / nectar de pêche`; no aliases. | No row. Existing `ingredient-ref-peach` is the whole fruit, not nectar. |
| Pear nectar | **Distinct from pear juice; hold integration until named demand** | `pear nectar / nectar de poire`; no aliases. | No row. Existing `ingredient-ref-pear` is the whole fruit, not nectar. |
| Prune nectar | **Distinct from prune juice; hold integration until named demand** | `prune nectar / nectar de pruneau`; no aliases. | No row. Keep it separate from prune juice and prunes. CFIA Volume 4 defines this product from concentrated aqueous extract of dried prunes with added water. |
| Fruit-juice blend | **Hold without named components; a named blend is distinct** | For example, a source-defined `apple and orange juice / jus de pomme et d'orange` would be a named blend, not an alias for apple juice or orange juice. No aliases proposed. | No blend row. CFIA's blend standard requires each named juice to meet its own standard; do not use generic `mixed juice` to hide the component fruits. |
| Fruit-juice drink, cocktail, or punch | **Hold as generic product identities; never alias to juice** | OQLF's exact term pair is `fruit juice punch / cocktail de jus de fruits`; Québec/Canada variant `coquetel de jus de fruits`; English alias `fruit punch`. These describe a beverage that may contain other non-alcoholic liquids and sweeteners, not plain juice. No aliases onto juice references. | No drink/cocktail row. The generic common names do not identify one recipe-stable formulation. |
| Sparkling fruit juice | **Distinct from still juice; hold integration until named demand** | `sparkling (named fruit) juice / jus de (nom du fruit) mousseux` or `jus de (nom du fruit) gazeux`; no generic sparkling-fruit alias. | No row. CFIA defines it as named fruit juice impregnated with carbon dioxide. Keep distinct from both still juice and sparkling water. |
| `100% juice` | **Not an ingredient identity or alias** | No bilingual catalog label proposed. Retain only as a label claim attached to the exact product. | No recipe row. CFIA's claim guidance treats `100%` as a composition claim; it does not identify a fruit or guarantee a single-source juice. |
| Cherry juice, beyond maraschino-jar juice | **Hold; if later required, distinct identity** | `cherry juice / jus de cerise`; no aliases to maraschino juice. | No generic cherry-juice row. The existing `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` owns only maraschino-jar juice rows 028#5 and 067#6. |
| Pomegranate juice or concentrate | **Hold; if later required, distinct from molasses and other reductions** | Descriptive source-fruit terms would be `pomegranate juice / jus de grenade` and `pomegranate juice concentrate / jus de grenade concentré`; no aliases proposed. | No row. Existing `ingredient-ref-pomegranate-molasses` stays a finished condiment. This packet does not resolve Narsharab or create a juice/molasses equivalence. |

The individual fruit-juice list is deliberately limited to CFIA's specifically named juice classes plus cranberry, which has an exact OQLF Québec usage example and an existing whole-fruit identity. The broader Canadian rule also permits source-named juices for other fruit; it does not justify bulk-creating every fruit juice identity without an exact line or an explicit coverage decision.

## Product-state boundaries

### Ready-to-use juice from concentrate versus concentrate

CFIA Volume 10 distinguishes concentrated named-fruit juice, made by removing water, from reconstituted named-fruit juice, made by adding water to concentrate from the **same named fruit**. It states that the latter is fruit juice under that fruit's standard. This supports source-specific aliases such as `orange juice from concentrate` on an orange-juice reference, but it does not support a generic `juice from concentrate` identity or alias. If the line names the water-removed concentrate as the ingredient, use a separate source-fruit concentrate identity. Do not infer the reconstitution amount from the standard; follow an exact product's directions only when a recipe names that product.

### Bottled lemon and lime products

The Canadian manufacturer pages call the products `ReaLemon Lemon Juice / jus de citron ReaLemon` and `ReaLime Lime Juice / jus de lime ReaLime`; their ingredients include water, concentrated juice, sulphites, and peel oil. The manufacturer claims that 50 mL of either product equals 50 mL of fresh lemon/lime juice and that 45 mL equals juice from one medium fruit. Those are direct, brand-specific statements. They support neither a generic alias for every bottled citrus product nor a universal fresh-to-bottled conversion, so no conversion, ingredient density, or substitution rule is proposed. The existing fresh lemon/lime aliases remain as-is.

### Nectars, drinks, cocktails, blends, and claims

The Canadian compositional standard defines apricot, peach, and pear nectars as pulpy beverages with specified fruit content and water, usually sweetener; Canada's identity standard separately defines prune nectar. These products are not aliases of juice, and the standards do not define one generic nectar formula. OQLF's French GDT entry supplies the general term `nectar`, `nectar de fruit`, and `nectar de fruits`, plus fruit-specific examples. Because the catalog already has `nectarine` and the app falls back to substring matching, do not add bare `nectar` as a general identity or alias.

OQLF defines a fruit-juice cocktail as a beverage made from fruit juice that may also contain other non-alcoholic liquids and sweeteners. Keep cocktail/punch and fruit-drink wording out of plain-juice aliases. CFIA defines sparkling named-fruit juice as juice carbonated under pressure; it is still a separately named product state. The `100%` wording is a claim, not a stable ingredient identity.

## Numeric evidence and limits

- CFIA's apple and grape juice standards state density intervals for regulatory composition checks at 20 °C; these are not validated cooking densities or cross-product unit conversions, so no default density is proposed.
- CFIA's same-fruit reconstitution definition supports the identity alias boundary only; it does not provide a kitchen dilution ratio.
- ReaLemon/ReaLime's 50 mL-to-50 mL and 45 mL-to-one-medium-fruit statements are manufacturer claims for those named products. Do not apply them to fresh-pressed juice generally or to other bottled brands.
- No source establishes generic juice/nectar substitution, concentrate-to-juice yield, yield from whole fruit to juice, or a universal juice density. No substitutions, numeric fields, package yields, or unit mappings are recommended.

## Prior decisions and boundaries retained

- The [WP05 fruit/vegetable juice review](wp05-section-v-fruit-and-vegetable-juices-followup-20261012.md) and [juice identities integration](../batches/wp05-section-v-juice-identities-integration-20261012/README.md) remain authoritative for integrated coconut water, tomato juice, and vegetable juice; their aliases and recipe links are unchanged.
- The [acidic-juice boundary review](wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md) and [integration README](../batches/wp05-section-v-acidic-juice-integration-20261012/README.md) remain authoritative for fresh lemon/lime aliases, verjuice, tamarind paste, and pomegranate molasses. This proposal only adds the narrower same-fruit reconstituted-juice versus concentrate distinction; it does not reopen verjuice, tamarind water, or pomegranate molasses.
- Preserve `sour grape juice` on verjuice; do not make it an alias of generic grape juice. Keep the two maraschino-jar recipe rows on their existing specific owner.
- WP03's fruit-product item for juices, concentrates, purées, and preserves remains a separate review boundary. This proposal addresses WP05's liquid pantry scope only and does not resolve fruit purées, juices used in canned-fruit packing media, or all possible fruit-derived preparations.

## Sources

Accessed 2026-10-12. CFIA sources establish Canadian product classes; OQLF GDT/BDL sources establish Québec French names and usage. Each source supports only the listed terms or boundaries.

| ID | Source | Supports | Limit |
|---|---|---|---|
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S01` | CFIA, [Canadian Food Compositional Standards, Volume 10 — Fruits, Vegetables, Their Products and Substitutes (EN)](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§10.3.2–10.3.16. | Named-fruit juices; specific apple, grape, grapefruit, lemon, lime, orange, and pineapple juice classes; concentrate versus same-fruit reconstituted juice; fruit-juice mixtures; sparkling juice; apricot/peach/pear nectar; regulatory apple/grape density ranges. | Regulatory standards; density ranges are not kitchen conversion data. It does not establish recipe demand or a global product family for every juice product. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S02` | CFIA, [Normes canadiennes de composition des aliments (FR)](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Vol. 10, §§10.3.2–10.3.16. | Current Canadian French standard terms including `jus de pomme`, `jus de raisin`, `jus de pamplemousse`, `jus de citron`, `jus de lime`, `jus d'orange`, `jus d'ananas`, `jus concentré`, `jus ... fait de concentré`, `jus ... reconstitué`, and the three named nectars. | Regulatory naming/composition, not a Québec alias list beyond the exact terms shown. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S03` | CFIA, [Normes d'identité canadiennes : Volume 4 — Produits de fruits ou de légumes transformés](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), current French page, §§66–69, 93–94. | Grape concentrate and grape juice from concentrate; `jus d'orange concentré congelé` and sweetened frozen orange concentrate as separate terms; `nectar de pruneau`; tomato/vegetable juice boundary cross-check. | Product-specific Canadian standards; not general aliases for all concentrates or nectars. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S04` | OQLF, [jus de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26543016/jus-de-fruits). | Preferred Québec term `jus de fruits` and English `fruit juice`. | Terminology entry, not a formula or ingredient catalog recommendation. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S05` | OQLF, [Nombre du complément de confiture, compote, jus… (BDL)](https://vitrinelinguistique.oqlf.gouv.qc.ca/22906/la-grammaire/le-nom/nombre-des-noms-dans-certains-emplois/nombre-du-complement-du-nom/nombre-du-complement-de-confiture-compote-jus). | Québec examples `jus d'orange`, `jus de citron`, `jus de pomme`, `jus de canneberge`, `jus de raisin`; explains singular source fruit versus plural `jus de fruits` for multiple kinds. | Grammar and usage source, not a product composition standard. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S06` | OQLF, [nectar (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529193/nectar). | Definition and preferred terms `nectar`, `nectar de fruit(s)`; examples nectar de pêche, pruneau, poire; distinguishes a beverage made with juice concentrate or fruit purée, water, and sugar. | General term entry; does not make nectar synonymous with juice or establish a generic standardized formula. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S07` | OQLF, [jus de citron concentré (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18968393/jus-de-citron-concentre). | Québec French `jus de citron concentré`, alternative `concentré de jus de citron`, English `lemon juice concentrate`. | Terminology entry dated 1984; current Canadian product boundary is taken from CFIA, not extrapolated from this entry. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S08` | OQLF, [jus de pomme (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2498024/jus-de-pomme) and [jus de pomme concentré (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059929/jus-de-pomme-concentre). | `jus de pomme / apple juice`; `jus de pomme concentré` and `concentré de jus de pomme / concentrated apple juice`. | Terminology entries; not kitchen density or yield evidence. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S09` | OQLF, [cocktail de jus de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17022977/cocktail-de-jus-de-fruits). | Definition and exact terms `cocktail de jus de fruits`, Québec/Canada `coquetel de jus de fruits`, English `fruit juice punch` / `fruit punch`. | Defines a beverage class that may include other liquids/sweeteners; it is not a recipe-stable plain-juice equivalent. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S10` | ReaLemon/ReaLime, [Les produits (FR)](https://www.realemon.ca/fr/products) and [Products (EN)](https://www.realemon.ca/en/products); CFIA, [Food composition and quality claims](https://inspection.canada.ca/en/food-labels/labelling/industry/composition-and-quality), `Concentrated, concentrate, condensed, strength, reconstituted` and `Fresh juice`. | Current bilingual ReaLemon/ReaLime product names, ingredient lists and the manufacturer's own fresh-juice comparisons; CFIA wording for concentrate/reconstituted and fresh-squeezed claims. | Manufacturer evidence is brand-specific. CFIA label guidance does not create a universal kitchen conversion or global identity alias. |

This packet changes no canonical reference, form, recipe, legacy candidate, ledger record, checklist, roadmap, or workflow. It is proposal-only; no tests or emulator checks were run.
