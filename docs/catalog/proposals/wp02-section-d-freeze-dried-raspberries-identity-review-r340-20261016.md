# WP02 Section D — freeze-dried raspberries identity review (R340, 2026-10-16)

- **Status:** Accepted and integrated by root on 2026-10-16; see the [R340 integration README](../batches/wp02-section-d-freeze-dried-raspberries-identity-integration-r340-20261016/README.md). The proposal records the source review and bounded scope.
- **Target:** The open WP02 Section D fruit-product checklist item for freeze-dried fruit.
- **Scope:** Review the existing ingredient-ref-freeze-dried-raspberries identity and its two linked lines in recipe 112.
- **Recommendation:** Add two narrowly scoped English search aliases to the existing identity. Keep all other identity fields and recipe links unchanged; leave measurement and substitution research unresolved.

## Recommendation

Retain the existing display names **freeze dried raspberries / framboises lyophilisées** in **NUT_SEED_AND_DRIED_FRUIT**. Add **lyophilized raspberries** and **lyophilised raspberries** as English aliases. OQLF lists both spellings as English equivalents of the preferred Québec French adjective *lyophilisé*. Combining those spellings with the source-attested fruit name gives useful exact phrases; the label evidence directly attests the current canonical English and French product names.

The French display already matches the exact bilingual Costco label. No French alias is needed. Do not add the adjective alone, generic **raspberries**, **dried raspberries**, or **raspberry powder** as aliases. Keep defaultDensity null and unitMappings empty; add no form, conversion, package yield, or substitution. The Costco panel reports one product-specific portion of 1/4 cup (5 g), but its generic file does not identify a SKU. Do not activate or generalize that portion; keep measurement research at **not_yet_researched**.

If accepted by the integration owner, attach the identity sources below to the existing ledger record and set only identityState to **verified**. Keep measurementState and substitutionResearchState at their current **not_yet_researched** values.

## Ownership and prior-work audit

The WP02 Section D fruit-product checklist remains open. Before integration, the live catalog contained 1,686 references, 129 forms, 57 legacy-import candidates, and 2,033 research-ledger records. The existing reference and matching research-ledger row were:

| Field | Current value |
|---|---|
| ID | ingredient-ref-freeze-dried-raspberries |
| English display | freeze dried raspberries |
| Québec French display | framboises lyophilisées |
| Category | NUT_SEED_AND_DRIED_FRUIT |
| Aliases before R340 | none |
| Density / unit mappings | null / empty |
| Forms | none |
| Ledger identity / measurement / substitution | unreviewed / not_yet_researched / not_yet_researched |
| Ledger sources / decisions | none / none |

There is no second active exact owner: fresh raspberries remain ingredient-ref-raspberries, raspberry jam remains ingredient-ref-raspberry-jam, and freeze-dried strawberries remain ingredient-ref-freeze-dried-strawberries. No exact legacy candidate or dedicated prior freeze-dried-raspberry identity review was found in the catalog assets and proposal/batch archive.

Prior-work boundaries:

- The 2026-10-10 WP02 fruit-product review and 2026-10-12 Section D confectionery/fruit sweep listed the two recipe 112 links but left this row's identity, measurement, and substitution evidence unreviewed.
- The WP02 baking-inclusions/decorations review noted recipe 112 as adjacent fruit-product demand and deferred it to the separate Section D fruit checklist.
- WP03 fruit proposals mention the row as an existing neighbor; they do not own or resolve this WP02 identity.
- R337 reviewed freeze-dried **strawberries** and added two strawberry aliases. It did not review or change this raspberry row. Its OQLF adjective source is relevant and reused below; it does not by itself establish the raspberry product label.
- R337's Sally McKenney source says freeze-dried raspberries can be used for that author's raspberry-buttercream variant. That formula-specific option remains owned by the R337 strawberry review. It is not a general substitution rule and is not duplicated as a new ledger finding here.
- R326 and R333 own strawberry jam and raspberry jam respectively; neither covers freeze-dried raspberries.

## Recipe demand and product boundary

The current manifest lists **114 recipes and 1,123 ingredient rows**. A scan of its listed recipe files found exactly two direct ingredient rows for this reference, both in recipe 112:

| Recipe line | Authored text | Current link | Disposition |
|---|---|---|---|
| 112 Raspberry Truffles, b109cd15-b162-4825-9479-bbc022bd6cb4-ingredient-3 | 10 g freeze-dried raspberries | ingredient-ref-freeze-dried-raspberries | Preserve authored text, 10 g, unit, and link. |
| 112 Raspberry Truffles, b109cd15-b162-4825-9479-bbc022bd6cb4-ingredient-4 | Extra freeze-dried raspberries for coating | ingredient-ref-freeze-dried-raspberries | Preserve authored text, note, and link; no amount is stated. |

The linked recipe cites The Sum of All Sweets' *3 Ingredient White Chocolate Raspberry Truffles*. Its ingredient card gives 10 g plus extra for coating. Its method grinds the freeze-dried berries into dust, sifts the powder to remove seeds, adds it to the ganache, and uses more powder to coat the truffles. Here, **raspberry powder** is a preparation made from the linked freeze-dried ingredient, not a separately requested purchased ingredient. Do not add a powder form or alias, separate identity, quantity for the unspecified coating amount, or recipe substitution.

The external recipe's 10 g is formula-specific. The Costco panel's 1/4 cup (5 g) is label-specific, and the panel filename does not establish its SKU. These separate statements do not establish a generic cup-to-mass conversion, density, package yield, or a replacement ratio. R337's raspberry-buttercream option is also confined to that formula and does not establish a cross-recipe substitution.

## Phrase-first picker projection

The picker normalizes accents and punctuation, prefers a complete word phrase across ingredient names and aliases, then falls back to partial matching. The projection below was calculated from the live references and forms using IngredientSearch.kt.

| Query | Current projection | Projection with proposed aliases |
|---|---|---|
| freeze dried raspberries | Complete phrase → ingredient-ref-freeze-dried-raspberries only | Unchanged |
| freeze-dried raspberries | Complete phrase → ingredient-ref-freeze-dried-raspberries only | Unchanged; punctuation folds to the same phrase |
| framboises lyophilisées | Complete phrase → ingredient-ref-freeze-dried-raspberries only | Unchanged |
| lyophilized raspberries | No match | Complete phrase → ingredient-ref-freeze-dried-raspberries only |
| lyophilised raspberries | No match | Complete phrase → ingredient-ref-freeze-dried-raspberries only |
| raspberries | Complete word phrase → fresh raspberries and freeze-dried raspberries | Unchanged |
| freeze-dried | Complete phrase → curry leaves, freeze-dried raspberries, and freeze-dried strawberries | Unchanged; do not add a broad alias |
| raspberry powder | No match | No match; recipe-method output, not an ingredient-line identity |

The English aliases add only the two alternate adjective spellings. They do not create ambiguity for exact raspberry queries and do not alter broad berry or freeze-dried results.

## Evidence gaps and integration boundary

- The label directly supports **FREEZE DRIED RASPBERRIES / FRAMBOISES LYOPHILISÉES**; the proposed lyophilized and lyophilised phrases are a transparent composition of OQLF-listed adjective equivalents and the fruit name, not label-quoted product names.
- The Costco PDF contains separate raspberry and strawberry panels but does not identify the SKU associated with the raspberry panel. Its 1/4 cup (5 g) portion must remain product-specific and inactive.
- The evidence does not establish a universal whole/crumb/granule state, seed treatment, added-sugar policy, general recipe behavior, or a volume-to-mass relationship.
- Recipe 112's measured 10 g and unmeasured coating extra are source-specific. No reusable measure, density, unit mapping, or active substitution follows.
- This proposal does not authorize a recipe, reference, alias, form, or ledger edit. The integration owner controls any later shared-data change.

## Source register

Pages checked on 2026-10-16. New R340 source IDs were searched for collisions. R337's Sally source is reused under its original owner and ID rather than duplicated.

| ID | Source and locator | Support and limits |
|---|---|---|
| WP02-D-FREEZE-DRIED-RASPBERRIES-R340-20261016-S01 | Office québécois de la langue française, [GDT: framboise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357943/framboise), preferred term and English translation. | Updated 2004. Gives preferred Québec French framboise, English raspberry, and botanical identification. Supports the fruit name only, not its freeze-dried state or product measures. |
| WP02-D-FREEZE-DRIED-RASPBERRIES-R340-20261016-S02 | Costco Canada, [bilingual nutrition panels for freeze-dried raspberries and strawberries](https://www.costco.ca/wcsstore/CostcoCABCCatalogAssetStore/Attachment/690611_NFT.pdf), raspberry panel product-name, ingredients, and portion lines. | The PDF contains separate raspberry and strawberry panels. The raspberry panel reads FREEZE DRIED RASPBERRIES / FRAMBOISES LYOPHILISÉES, lists freeze-dried raspberries as the ingredient, and states Per 1/4 cup (5 g) / par 1/4 tasse (5 g). The generic PDF filename does not identify the product SKU associated with this panel. Use the bilingual product name as direct label evidence; treat the serving as one label-specific observation, not a general conversion. |
| WP02-D-FREEZE-DRIED-RASPBERRIES-R340-20261016-S03 | Rachel / The Sum of All Sweets, [3 Ingredient White Chocolate Raspberry Truffles](https://www.thesumofallsweets.com/3-ingredient-white-chocolate-raspberry-truffles/), published 2020-02-07, ingredient card and method. | Lists 10 g freeze-dried raspberries plus extra for coating; instructs grinding into dust, sifting to remove seeds, and using powder in and on the truffles. Supports recipe 112's source, amount, and recipe-specific preparation only; it is not a generic serving or conversion source. |
| Reuse WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S01 | OQLF, [GDT: lyophilisé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408264/lyophilise). | Already owned by R337. Its terminology applies to both fruit names. Reuse this source ID if integrating; do not duplicate it in the research ledger. |
| Reuse WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S04 | Sally McKenney, [Strawberry Buttercream Frosting](https://sallysbakingaddiction.com/strawberry-frosting/), recipe notes. | Already owned by R337. Names freeze-dried raspberries as an alternative for that raspberry-buttercream formula. It supports no generic substitution and is cited only to preserve R337 ownership. |
| WP02-D-FREEZE-DRIED-RASPBERRIES-R340-20261016-R01 | Read-only audit of Section D, current ingredient references/forms, matching research-ledger record, prior proposals/batches, and IngredientSearch.kt. | Establishes the open checklist, sole active exact owner, unresolved ledger state, prior-review ownership boundaries, and phrase-first picker rules. Repository evidence, not an external naming or product source. |
| WP02-D-FREEZE-DRIED-RASPBERRIES-R340-20261016-R02 | Read-only scan of the 114 recipe files listed by the bundled manifest. | Establishes two linked recipe 112 ingredient lines among 1,123 ingredient rows. Does not establish demand outside the bundled corpus. |

