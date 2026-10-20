# WP02 Section D — strawberry purée product boundary

- **Reviewed:** 2026-10-10
- **Status:** reviewed and integrated; one identity and one exact recipe-line link
- **Scope:** the Section D fruit-product cluster was scanned; this packet focuses on the sole uncovered ingredient line, recipe-made reduced strawberry purée
- **Integration:** the accepted reference, ledger evidence, and recipe link are recorded in the canonical bundled package. The broader fruit-product checklist remains open.

## Recommendation

Add one active identity, `ingredient-ref-strawberry-puree`, with English name **strawberry puree**, French (Québec) name **purée de fraises**, category `FRUIT`, and no aliases. Link only recipe 051 ingredient `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-12` to this reference. Preserve its original text, ingredient name, quantity, unit, and group. Add bilingual line preparation `reduced` / `réduite` to retain the recipe-specific process.

This recommendation is for the purée identity; it does not merge purée with fresh strawberries. The source recipe makes its purée from its separately listed fresh strawberries, while Québec product listings also use *purée de fraises* for commercial products with different processing and sugar status. Do not add aliases for `reduced strawberry puree`, `purée de fruits`, `fruit sauce`, or fresh strawberries. Add no form, density, unit mapping, yield, or substitution rule.

## Recipe demand across the 114-recipe manifest

The manifest and all 114 bundled recipe files were scanned for fruit product terms including purée, powder, freeze-dried fruit, paste, jam, curd, filling, coulis, sauce, dulce de leche, and candied/glacé fruit. Five ingredient rows matched this product scope:

| Recipe line | Authored ingredient text | Current reference | Disposition |
| --- | --- | --- | --- |
| 010 Linzer cookies, `a1e9ba5d-be5c-447d-a368-3ae4954a0a07-ingredient-10` | `120 ml raspberry jam` | `ingredient-ref-raspberry-jam` | Already linked; no change. |
| 051 Strawberry Cake, `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-12` | `1/2 cup reduced strawberry puree` | none | Link to proposed strawberry-purée identity; retain `reduced` as line preparation. |
| 062 Strawberry Frosting, `e34243f0-f13c-47bf-991f-a8d50e3c67a8-ingredient-1` | `25 g freeze-dried strawberries` | `ingredient-ref-freeze-dried-strawberries` | Already linked; no change. |
| 112 Raspberry Truffles, `b109cd15-b162-4825-9479-bbc022bd6cb4-ingredient-3` | `10 g freeze-dried raspberries` | `ingredient-ref-freeze-dried-raspberries` | Already linked; no change. |
| 112 Raspberry Truffles, `b109cd15-b162-4825-9479-bbc022bd6cb4-ingredient-4` | `Extra freeze-dried raspberries for coating` | `ingredient-ref-freeze-dried-raspberries` | Already linked; no change. |

Recipe 051 also lists `454 g fresh strawberries` at ingredient `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-1`, linked to `ingredient-ref-strawberries`. Its instructions say to blend the strawberries and simmer the purée before adding it to the cake. The purée line is therefore a named recipe intermediate, not evidence that the fresh-fruit reference should absorb purée as a global alias. Preserve both authored lines; do not infer a purchase-total calculation or a fresh-to-reduced conversion.

Recipes 014 (blueberry cake filling) and 029 (cherry cake filling) are component recipes whose ingredient rows list blueberries or cherries with other ingredients. They do not request purchased blueberry or cherry filling as an ingredient. No other line in the manifest requests fruit powder, fruit paste, curd, dulce de leche, caramel sauce, or a standalone fruit filling. This is a line-level corpus finding, not a claim that those products are unavailable or out of scope for future recipes.

## Snapshot and collision check

Counts and hashes are the shared-worktree snapshot read on 2026-10-10; the workspace was changing concurrently, so re-read these artifacts before integration.

| Artifact | Snapshot | SHA-256 |
| --- | ---: | --- |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Ingredient references | 867 rows | `6fb175c66019050aaef8e8f34a405200eda893bfb3fd67c5acaf77ad3a1cdf95` |
| Ingredient forms | 48 rows | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research ledger | 1,113 records | `92192fb3de6c0707ab7ea3ad0e6b0f66ecf40aa348e4a9b40eaf6b60c0b1b040` |
| Legacy import identities | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus, names and bytes | 114 files | `073a9b7f1b15aaa167a2fdfdb58d66fe52bc006d71f832ba859406b04f24d633` |

Exact normalized phrase checks found no owner in active references, forms, legacy candidates, or ledger for `strawberry puree`, `strawberry purée`, `reduced strawberry puree`, `purée de fraises`, or `purée de fraises réduite`. The proposed ID is unused. Current adjacent owners are:

- `ingredient-ref-strawberries` — `strawberries` / `fraises`; no aliases, density, unit mapping, or associated form.
- `ingredient-ref-raspberry-jam` — `raspberry jam` / `confiture de framboises`.
- `ingredient-ref-freeze-dried-strawberries` — `freeze-dried strawberries` / `fraises lyophilisées`.
- `ingredient-ref-freeze-dried-raspberries` — `freeze dried raspberries` / `framboises lyophilisées`.
- Legacy only: `ingredient-ref-strawberry-jam` — `strawberry jam` / `confiture de fraise`; this is a jam candidate, not a purée collision.

The four existing fruit-product ledger records above are `unreviewed`, with measurement and substitution research marked `not_yet_researched`. This proposal does not change those ledger states or imply that their identities have been source-reviewed. Requirements.md FR-3 and FR-7 call for bilingual reference names and linkable ingredient lines; the `IngredientLine.preparation` field supports retaining the recipe-specific reduction wording.

## Identity, form, numeric, and substitution decisions

### Identity and bilingual record

Merge-ready record outline:

```text
id: ingredient-ref-strawberry-puree
nameEn: strawberry puree
nameFr: purée de fraises
aliasesEn: []
aliasesFr: []
category: FRUIT
defaultDensity: null
unitMappings: []
```

The identity covers strawberry purée as a fruit product. It does not assign a fixed sugar level, seed/skin state, cooking state, freezing state, or concentration. Keep it separate from `ingredient-ref-strawberries` and from `ingredient-ref-strawberry-jam`.

### Exact recipe-line mapping

For recipe 051 ingredient `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-12` only:

```text
ingredientRefId: ingredient-ref-strawberry-puree
preparation.en: reduced
preparation.fr: réduite
```

Leave `originalText` as `1/2 cup reduced strawberry puree`, `ingredientName` as `reduced strawberry puree`, `quantity` as `0.5`, `unit` as `cup`, and `group` as `Cake`. Do not change ingredient 051 #1, split the line, or use the link to imply the two line quantities are additive shopping amounts.

### Measurement and substitution

The recipe’s authored 1/2 cup remains unchanged. No generic density or volume mapping follows from a recipe-specific cooked/reduced intermediate or from commercial product listings. Although the source recipe documents how its own purée is prepared, this packet does not encode a yield, ratio, or mass/volume conversion.

No substitution is proposed. The Québec product sources show purées that are frozen and either sweetened or unsweetened; those product listings do not establish equivalence to this recipe’s reduced purée. Do not substitute jam, freeze-dried fruit, powder, or another purée based only on shared fruit identity.

## Evidence and access limits

All pages below were accessed 2026-10-10.

| Source | Evidence used | Limit |
| --- | --- | --- |
| [S01 Sally’s Baking Addiction — Homemade Strawberry Cake](https://sallysbakingaddiction.com/strawberry-cake/) | Primary recipe source lists fresh strawberries and a later reduced-purée ingredient; the instructions make the purée from the strawberries and use it in the cake. | Supports this recipe’s intermediate only; not a commercial-product identity or a universal measure. |
| [S02 OQLF GDT — purée de fraises](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497502/puree-de-fraises) | The OQLF search-result preview displays the exact French term `purée de fraises` as the entry heading. | Direct page open returned a cache-miss error. The exact term is recorded from the preview only; no preferred-term status, definition, or technical equivalence is claimed from this entry. |
| [S03 OQLF GDT — purée de fruits](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889579/puree-de-fruits) | Directly accessed GDT page gives `purée de fruits` as the preferred generic term and describes cooked fruit purées. | Entry was last updated in 1982; it is generic and does not define reduced strawberry purée. |
| [S04 Gouvernement du Québec — Culture des fraises et des framboises](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/culture-fraises-framboises) | Québec government page names coulis, confitures, gelées, and purées as distinct processed-fruit products. | Broad industry description, not a product specification. |
| [S05 Aliments du Québec — Purée de fraises 10% sucre ajouté](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/puree-de-fraises-10-sucre-ajoute) | Déliss product listing uses the French product name, describes frozen purée with added sugar, and lists pâtisserie among uses. | Product-specific listing; does not define the recipe-made purée. |
| [S06 Aliments du Québec — Purée de fraises sans sucre ajouté](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/puree-de-fraises-sans-sucre-ajoute) | Déliss product listing uses the same product-class wording for a frozen no-added-sugar product and lists pâtisserie among uses. | Product-specific listing; no substitution or composition equivalence is inferred. |
| [S07 Répertoire des aliments québécois — Déliss strawberry purée](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8244548) | Product record describes a frozen, unsweetened, sifted purée; page identifies its data as GS1-sourced and was last updated 2026-04-09. | Directory states MAPAQ is not responsible for information accuracy; use as product-record evidence, not an independent standard. |

The direct Déliss site (`https://deliss.ca`) returned HTTP 400 in the browser retrieval tool. No technical specification from the manufacturer’s own site was available; branded product details above are limited to the accessible Québec product listings. The GDT generic entry, manufacturer-branded listing, recipe source, and government processing categories support the identity and French name, but do not settle generic purée forms or recipe substitutions.

## Remaining Section D work

This proposal does not close the broader checklist row for fruit powders, pastes, jams, curds, fillings, dulce de leche, or caramel sauces. The four matching recipe lines for jam and freeze-dried fruit already have references; the only mapped change here is recipe 051 #12. The strawberry-purée integration is recorded below; re-scan the live corpus before any later family additions.

## Coordinator disposition — 2026-10-10

Accepted and integrated `strawberry puree / purée de fraises` as an identity separate from fresh strawberries, jam, and freeze-dried fruit. Recipe 051 ingredient 12 now links to the new reference and carries `reduced / réduite` as its line preparation; the original text, `ingredientName`, 1/2-cup amount, unit, and group remain intact. The ledger records the recipe-specific process and Québec product/name evidence. No form, density, unit mapping, yield, conversion, or substitution was added. The inaccessible OQLF strawberry-specific page was not used as a technical source; the generic OQLF entry and accessible Québec product listings support the chosen French wording. Broader Section D product coverage remains open.
