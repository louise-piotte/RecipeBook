# WP05 Section V — Fruit, vegetable, nectar, and coconut-water boundaries

- **Date:** 2026-10-12
- **Status:** proposal only; the Section V checklist item remains open
- **Scope:** general fruit juice and juice claims, drinks/cocktails, nectar, concentrates, coconut water, tomato juice, and vegetable juice
- **Source namespace:** `WP05-FRUIT-JUICE-20261012-S01` through `S11`; checked against the current ledger and proposal files, with no ID collision

## Recommendation

For a later, identity-only integration, consider three tightly bounded references:

1. `ingredient-ref-coconut-water` — `coconut water / eau de coco`, without aliases. Keep it separate from coconut beverage, culinary coconut milk, coconut cream, coconut fruit, and plain water.
2. `ingredient-ref-tomato-juice` — `tomato juice / jus de tomates`, without aliases. Keep it distinct from generic vegetable juice, tomato cocktail, tomato juice concentrate, tomato paste, and tomato sauce.
3. `ingredient-ref-vegetable-juice` — `vegetable juice / jus de légumes`, with exact standard-backed aliases `mixed vegetable juice` and `jus de légumes mélangés`. Keep it distinct from tomato juice and vegetable cocktails.

These candidates have clear Canadian product-class definitions and bilingual terminology, but no exact recipe or legacy-candidate demand. Treat them as optional Section V coverage, not as a reason to change any recipe line. Do not add generic `fruit juice`, `nectar`, fruit-juice concentrate, juice-drink/cocktail, or `100% juice` references or aliases in this tranche. Source-specific juices remain source-specific; the current lemon, lime, maraschino cherry, and verjuice owners are sufficient for their recipe uses.

No forms, recipe links, measurements, conversions, preservation guidance, or substitutions are proposed.

## Live repository and recipe audit

The snapshot was read on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order.

| Data | Snapshot | SHA-256 |
|---|---:|---|
| Ingredient references | 1,164 | `ddcaf40ec759a6d43eb327ab28bcac34b666059c64481689d43f6c39b4f36a14` |
| Ingredient forms | 85 | `897a1d2e80f49d08810f4a08cc1b9b38429338217a8a995224688ac0bbf49699` |
| Legacy-import candidates | 67 | `4efcc8fcf805bdd397376fa2a34063ed2becdf14304957b9cbec48b153277d68` |
| Research-ledger records / source entries / distinct source IDs / unit conversions | 1,465 / 4,893 / 4,002 / 8 | `be544a4b3f743b6447904d1948b693c19fe8680cddc4bcc2e3a752a8f4e4589b` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `443223a1e1514fa725cea2292f59d2f76c849d27c283ade603dc67048d4917b9` |

The worktree is being integrated concurrently; counts and hashes are a review snapshot and must be refreshed before any later integration.

### Current owners and candidate gaps

- `ingredient-ref-lemon-juice` owns `lemon juice / jus de citron`, including `fresh lemon juice` and `jus de citron frais` aliases.
- `ingredient-ref-lime-juice` owns `lime juice / jus de lime`, including `fresh lime juice`, `jus de lime frais`, and `jus de citron vert` aliases.
- `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` owns `maraschino cherry juice / jus du pot de cerises au marasquin` and its `marasquino cherry juice` alias.
- `ingredient-ref-verjuice` owns `verjuice / verjus`, with the narrow English alias `sour grape juice`; it does not own generic grape juice.
- `ingredient-ref-monk-fruit-juice-concentrate` is already a separate sweetener identity. `ingredient-ref-coconut-beverage` is separate from coconut water and culinary coconut milk. `ingredient-ref-pomegranate-molasses` remains distinct from pomegranate juice and concentrate.
- Tomato references already cover tomatoes, tomato paste, and tomato sauce. None is tomato juice.
- There is no current general fruit-juice, fruit-nectar, generic fruit-juice-concentrate, coconut-water, tomato-juice, or vegetable-juice reference. No juice/nectar/concentrate/water form was found. The 67 legacy candidates contain no matching candidate. The proposed IDs are absent from references, forms, legacy IDs, and ledger record IDs.
- An exact normalized-key scan found no existing reference, form, or legacy owner for the proposed coconut-water, tomato-juice, vegetable-juice, or mixed-vegetable-juice labels. `verjuice` and `sour grape juice` correctly resolve to `ingredient-ref-verjuice`. The broad query behavior differs from exact ownership: `fruit juice` occurs as a complete phrase inside `monk fruit juice concentrate`, while `nectar` currently finds `nectarine` by substring fallback.
- The ledger records the accepted fresh aliases on lemon/lime juice, monk-fruit juice concentrate as distinct from monk-fruit extract, verjuice as distinct from vinegar, coconut beverage as distinct from coconut water and culinary coconut milk, and pomegranate molasses as distinct from juice/concentrate. No new identity record is proposed in this proposal-only review.

The app's search implementation prefers complete normalized word-phrase matches, then falls back to substring matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The existing WP02 agave review records that `nectar` currently falls back to `ingredient-ref-nectarine`; a new generic nectar term would take over that complete-phrase query. Likewise, `fruit juice` is a phrase within `monk fruit juice concentrate`, and `fruit juice concentrate` is a phrase within the same existing name. With no recipe demand, adding these broad names would create avoidable search ambiguity. Revisit them only with exact recipe demand or a search behavior decision.

### Exact recipe rows

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for juice, jus, nectar, verjuice/verjus, and coconut-water wording. The 13 matching rows are already owned as follows; no line needs relinking.

| Recipe and row | Ingredient wording | Current owner |
|---|---|---|
| 007 #5 — Refried Pinto Beans | `vinegar or lime juice` | Unlinked compound alternative; leave unchanged. |
| 012 #6 — Lemon Crinkle Cookies | `fresh lemon juice` | `ingredient-ref-lemon-juice` |
| 014 #4 — Blueberry Cake Filling | `lemon juice` | `ingredient-ref-lemon-juice` |
| 019 #5 — Crab Balls | `fresh lemon juice` | `ingredient-ref-lemon-juice` |
| 024 #3 — Date Squares | `lemon juice` | `ingredient-ref-lemon-juice` |
| 028 #5 — Cherry Almond Shortbread Cookies | `maraschino cherry juice` | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` |
| 029 #4 — Cherry Cake Filling | `lemon juice` | `ingredient-ref-lemon-juice` |
| 034 #13 — Classic Beef Chili | `lime juice` | `ingredient-ref-lime-juice` |
| 067 #6 — My Cherry Blossom Version | `maraschino cherry juice` | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` |
| 095 #7 — Satay | `fresh lime juice` | `ingredient-ref-lime-juice` |
| 106 #4 — Blueberry Pie | `lemon juice` | `ingredient-ref-lemon-juice` |
| 108 #3 — Raspberry Pie | `lemon juice` | `ingredient-ref-lemon-juice` |
| 113 #5 — Tzatziki | `lemon juice` | `ingredient-ref-lemon-juice` |

There are no rows for generic fruit juice, nectar, juice drink/cocktail, any juice concentrate, coconut water, tomato juice, or vegetable juice. Tomato paste in recipes 078 #12 and 086 #12 and tomato sauce in 090 #1 retain their existing product owners; they are not juice evidence. The remaining tomato rows are tomatoes in 034 #8 and 096 #1, also not juice.

## Product and identity boundaries

### Fruit juice and the “100%” claim

CFIA's Canadian Standards of Identity defines named fruit juice as an unfermented fruit liquid and scopes the volume-4 standard to juices made without concentration or dilution; the compositional standards separately name fruit-specific juice and concentration states [S01–S04]. OQLF pairs `jus de fruits` with `fruit juice` [S05]. These sources support the category and bilingual term, but the bundle has no generic fruit-juice recipe line. Keep the existing source-specific lemon, lime, cherry, and verjuice references; do not add `fruit juice` as an alias to any of them.

CFIA treats `100% fruit juices` as a labeling claim; its guidance says the juice may or may not be reconstituted [S11]. Therefore, `100% juice` is not a source identity or preparation form. Do not make it an alias for plain juice or concentrate.

### Juice drinks, cocktails, and nectar

CFIA guidance distinguishes standardized juice from fruit-named drinks and cocktails, whose formulations may include water, sweeteners, colours, flavours, or juice; it also specifies labeling treatment for common names containing “juice” [S11]. OQLF defines a fruit-juice cocktail as a beverage that can include other non-alcoholic liquids and sweeteners, with Québec/Canada terms `cocktail de jus de fruits` and `coquetel de jus de fruits` and English `fruit juice punch` / `fruit punch` [S07]. Keep these product names out of plain-juice aliases. Do not use bare `fruit cocktail` as a juice term: it can identify a standardized canned mixed-fruit product.

OQLF defines `nectar` as a non-carbonated fruit beverage based on concentrated juice or purée with water and sugar, and records `nectar`, `nectar de fruit(s)`, and `fruit nectar` [S06]. The Canadian compositional standard names specific apricot, peach, and pear nectars rather than creating one universal recipe [S03–S04]. Nectar is a distinct product class, but there is no recipe demand, and the WP02 search review documents the collision with `nectarine`. Hold a generic nectar identity and all nectar aliases for now. A named nectar should be reviewed on its own if a recipe later requires it.

### Concentrate versus juice from concentrate

The Canadian standard separates concentrated named-fruit juice from reconstituted named-fruit juice / juice from concentrate [S03–S04]. These are distinct purchased product states: water-removed concentrate is not the same identity as the ready-to-use juice made by re-adding water. Keep both concepts out of this tranche because the corpus has no matching line. Do not add `fruit juice concentrate` as a generic alias or candidate while it collides with the existing monk-fruit concentrate phrase. The special monk-fruit juice-concentrate identity stays unchanged.

### Coconut water

OQLF's preferred term is `eau de coco`, translated as `coconut water`; it defines the liquid naturally contained in a coconut and explicitly distinguishes it from commercial coconut beverage commonly made from coconut milk, cream, or pulp plus water and other ingredients [S08]. This supports the bounded candidate `coconut water / eau de coco`. Do not add `coconut juice`, `coconut beverage`, `coconut milk`, or plain `water` as aliases. The OQLF note that `lait de coco` can occasionally mean coconut water in contexts where there is no confusion is too ambiguous for an active alias in this catalog, where culinary coconut milk already exists.

### Tomato juice and vegetable juice

The current CFIA Volume 4 standard defines vegetable juice and explicitly says that the vegetable-juice standard does not apply to tomato juice; tomato juice and concentrated tomato juice have separate named standards [S01–S02]. OQLF's French terms are `jus de légumes / vegetable juice` and `jus de tomates / tomato juice` [S09–S10]. This is direct evidence for two identities, not one: tomato juice must not be an alias of vegetable juice. The separate concentration standard also means concentrated tomato juice must not be an alias of tomato juice.

For vegetable juice, the exact standard language supports `mixed vegetable juice` and `jus de légumes mélangés` as aliases on the general vegetable-juice identity. Do not add `vegetable cocktail`, `tomato cocktail`, or branded tomato/clam cocktail terms. They describe formulated beverages and are not synonyms established by these standards. No alias is needed for tomato juice.

## Prior decision reconciliation and holds

- **WP05 acidic juice** ([proposal](wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md), [integration packet](../batches/wp05-section-v-acidic-juice-integration-20261012/README.md)): retain fresh lemon/lime aliases, verjuice, tamarind paste, and the existing pomegranate-molasses boundary. This review adds no bottled citrus subtype and does not turn verjuice into generic fruit juice.
- **WP05 water/coconut boundary** ([proposal](wp05-section-v-water-sparkling-water-ice-boundary-review-20261012.md)): coconut water remains separate from plain water. This proposal supplies the bilingual coconut-water identity candidate, without relinking any recipe.
- **WP04 coconut beverage** ([proposal](wp04-section-r-plant-beverage-coconut-boundaries-review-20261012.md)): retain coconut beverage as distinct from coconut water and culinary coconut milk; omit the ambiguous short aliases.
- **WP06 sour orange** ([review](wp06-mexico-central-america-gap-sweep-20261009.md)): keep `naranja agria / sour orange` unresolved. Do not relabel it as lemon juice, lime juice, orange juice, verjuice, or vinegar without a source-specific identity decision.
- **WP08 acidified milk** ([review](wp08-buttermilk-acidified-milk-context-review-20261010.md)): lemon juice and vinegar remain distinct ingredients in the narrow milk-preparation discussion. It adds no general juice identity, conversion, or equivalence.
- Keep prior holds for tamarind water, broad sour-grape preparations, fruit-specific nectars without recipe demand, juice drinks/cocktails, and pomegranate juice/concentrate as separately scoped products. Do not infer substitutions among these products.

## Source register

Accessed 2026-10-12. CFIA standards are authoritative Canadian naming/composition sources; OQLF entries support Québec terminology. Each source supports only the locator and boundary listed here.

| Source ID | Direct source and locator | Support | Limit |
|---|---|---|---|
| `WP05-FRUIT-JUICE-20261012-S01` | CFIA, [Canadian Standards of Identity, Volume 4 (EN)](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-standards-identity-volume-4), §§60, 70–72. | Fruit juice, vegetable juice, tomato juice, and concentrated tomato juice product classes; §70 excludes tomato juice from its standard. | Regulatory food standards, not recipe demand or evidence that all retail “juice” products share one formulation. |
| `WP05-FRUIT-JUICE-20261012-S02` | CFIA, [Normes d'identité canadiennes, volume 4 (FR)](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§60, 70–72. | French labels including `jus de légumes mélangés`, `jus de tomates`, and `jus de tomates concentré`; same tomato/vegetable separation. | Regulatory nomenclature; it does not establish aliases beyond the named standard terms. |
| `WP05-FRUIT-JUICE-20261012-S03` | CFIA, [Canadian Food Compositional Standards (EN)](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 10, §§10.3.1–10.3.18. | Named juices, concentrates, reconstituted juice/from concentrate, tomato juice, and specified nectars. | Product composition standards; the nectar sections specify apricot, peach, and pear, not every product sold as nectar. |
| `WP05-FRUIT-JUICE-20261012-S04` | CFIA, [Normes canadiennes de composition des aliments (FR)](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Volume 10, §§10.3.1–10.3.18. | French names and distinctions: `jus concentré`, `jus fait de concentré`, `nectar`, `jus de tomates`, and `jus de légume`. | Same scope as the English standard; does not support merging product classes. |
| `WP05-FRUIT-JUICE-20261012-S05` | OQLF, [jus de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26543016/jus-de-fruits). | Preferred `jus de fruits` and English `fruit juice`. | Terminology entry; no formulation or recipe evidence. |
| `WP05-FRUIT-JUICE-20261012-S06` | OQLF, [nectar (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529193/nectar). | Nectar definition and preferred bilingual terms. | Terminology entry; it does not make nectar synonymous with standardized juice. |
| `WP05-FRUIT-JUICE-20261012-S07` | OQLF, [cocktail de jus de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17022977/cocktail-de-jus-de-fruits). | Cocktail/punch wording; definition permits other non-alcoholic liquids and sweeteners. | Defines a beverage class, not a universal product formula. |
| `WP05-FRUIT-JUICE-20261012-S08` | OQLF, [eau de coco (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26556601/eau-de-coco). | Preferred French term and English `coconut water`; distinction from commercial coconut beverage. | Notes that `lait de coco` is used for coconut water only in some unambiguous contexts; not a safe global alias. |
| `WP05-FRUIT-JUICE-20261012-S09` | OQLF, [jus de tomates (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059870/jus-de-tomates). | French tomato-juice label and English equivalent. | Terminology entry last updated in 1979; current CFIA standards are the primary class boundary. |
| `WP05-FRUIT-JUICE-20261012-S10` | OQLF, [jus de légumes (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059875/jus-de-legumes). | French vegetable-juice label and English equivalent. | Terminology entry last updated in 1979; use current CFIA standards for product classification. |
| `WP05-FRUIT-JUICE-20261012-S11` | CFIA, [Guidelines for highlighted ingredients and flavours](https://inspection.canada.ca/en/food-labels/labelling/industry/composition-and-quality/guidelines), §8, fruit juices and fruit drinks, including “100% Claims on Juices.” | Distinguishes fruit drinks/cocktails from standardized juices; says juice used for a 100% claim may be reconstituted. | Labelling guidance, not an ingredient identity, recipe recommendation, or evidence for a specific brand's composition. |

This packet changes no canonical reference, form, recipe, legacy candidate, ledger record, checklist, roadmap, workflow, or shared integration file. It is proposal-only; no tests or emulator checks were run.
