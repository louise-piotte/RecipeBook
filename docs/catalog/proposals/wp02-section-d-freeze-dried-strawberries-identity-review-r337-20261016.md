# WP02 Section D R337 — Freeze-dried strawberries identity review

- **Reviewed:** 2026-10-16
- **Status:** Accepted and integrated by root on 2026-10-16; see the [R337 integration README](../batches/wp02-section-d-freeze-dried-strawberries-identity-integration-r337-20261016/README.md). The original proposal records the evidence and recommended scope.
- **Scope:** source review for the existing `ingredient-ref-freeze-dried-strawberries` reference
- **Recommendation:** add two narrowly scoped English search aliases; retain the current identity, French display, category, recipe link, and empty numeric fields
- **Proposal source IDs:** `WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S01` through `S05`

## Recommendation

Keep the existing reference as **freeze-dried strawberries / fraises lyophilisées** in `NUT_SEED_AND_DRIED_FRUIT`. Add English aliases `lyophilized strawberries` and `lyophilised strawberries` to this existing row. The OQLF lists both English spellings as equivalents of Québec French *lyophilisé*; composing either supported adjective with the source-attested fruit name is a transparent search variant, not a new product identity. Do not add the adjective alone or the broad alias `strawberry powder`.

Keep `defaultDensity: null` and `unitMappings: []`; add no form, package yield, conversion, or active substitution. If the integration owner accepts this identity review, attach the proposal’s identity sources to the existing ledger row and set only `identityState` to `verified`. Keep general measurement research unresolved. The original recipe has a source-specific raspberry-buttercream variation; it does not support a global replacement rule or an amount ratio, so add no active substitution.

## Ownership and prior-work audit

The Section D checklist explicitly includes freeze-dried fruit in its open fruit-product coverage. The live reference is:

| Field | Current value |
|---|---|
| ID | `ingredient-ref-freeze-dried-strawberries` |
| English display | `freeze-dried strawberries` |
| Québec French display | `fraises lyophilisées` |
| Category | `NUT_SEED_AND_DRIED_FRUIT` |
| Aliases | none |
| Density / unit mappings | `null` / empty |
| Forms | none |

The matching research-ledger row is `identityState=unreviewed`, `measurementState=not_yet_researched`, and `substitutionResearchState=not_yet_researched`, with no sources or decisions. No exact legacy candidate or competing active owner was found. Adjacent active identities remain separate: `ingredient-ref-strawberries` (`strawberries / fraises`) and `ingredient-ref-freeze-dried-raspberries` (`freeze dried raspberries / framboises lyophilisées`).

Prior-work boundary:

- The WP02 Section D fruit-product review from 2026-10-10 and the 2026-10-12 confectionery/fruit gap sweep recorded this row and its recipe link, but expressly left freeze-dried strawberry identity evidence unreviewed.
- The WP02 baking-inclusions boundary review listed this row as adjacent demand and deferred it to the separate fruit-products checklist.
- WP03 fruit reviews mention the existing identity as a neighbor; they do not resolve the WP02 row’s identity evidence.
- R326 reviewed strawberry **jam**, and R333 reviewed raspberry **jam**. Neither covers freeze-dried strawberries. The formula-specific jam alternative recorded under R326 remains owned by its strawberry-jam ledger row.

No proposal dedicated to this existing row was found. The earlier gap reviews are relevant audit evidence, not completed identity reviews or holds.

## Recipe corpus and product boundary

The current manifest lists **114 recipes and 1,123 ingredient rows**. The exact ingredient-term scan found one direct line:

| Recipe line | Authored text | Current link | Disposition |
|---|---|---|---|
| 062 Strawberry Frosting, `e34243f0-f13c-47bf-991f-a8d50e3c67a8-ingredient-1` | `25 g freeze-dried strawberries` | `ingredient-ref-freeze-dried-strawberries` | Preserve the authored text, 25 g amount, unit, and link. |

This is an actual linked demand, not a reason to add another identity. Recipe 062’s instructions grind the purchased freeze-dried strawberries into powder during preparation. Keep `strawberry powder` and `poudre de fraises` as recipe-method wording, not aliases for the input ingredient or evidence for a separate purchased-product form. The source specifically distinguishes freeze-dried berries from fresh, frozen, and chewy air-dried strawberries for this buttercream. No general equivalence among those products follows.

The current Canadian Costco listing for DJ&A freeze-dried strawberries identifies a `5 × 100 g` package; this is one listing’s package size, not a culinary measure or package-yield rule. The bilingual label source gives one product-specific `1/4 cup (5 g)` serving. Sally’s source recipe gives `1 cup (about 25 g)` and says the ground ingredient produces around `1/2 cup` powder in that recipe. These are source-bound observations from different contexts. Keep them out of reusable catalog conversions and do not infer the density or finished-powder yield of all freeze-dried strawberries.

The same Sally recipe says to use freeze-dried raspberries for a raspberry-buttercream variation. Treat that as an alternative for this named buttercream formula only; the source does not specify a replacement ratio beyond the ingredient statement, and it does not support a broader strawberry-to-raspberry substitution. Add no active rule or recipe-line edit.

## Picker projection

The current picker normalizes accents and punctuation, then prefers complete word phrases before partial matching. Projection checked against current references and forms:

| Query | Current projection | Projection with proposed aliases |
|---|---|---|
| `freeze-dried strawberries` | exact phrase → `ingredient-ref-freeze-dried-strawberries` only | unchanged |
| `freeze dried strawberries` | exact phrase → `ingredient-ref-freeze-dried-strawberries` only | unchanged; hyphenation already normalizes |
| `fraises lyophilisées` | exact phrase → `ingredient-ref-freeze-dried-strawberries` only | unchanged |
| `lyophilized strawberries` | no result | exact phrase → `ingredient-ref-freeze-dried-strawberries` only |
| `lyophilised strawberries` | no result | exact phrase → `ingredient-ref-freeze-dried-strawberries` only |
| `strawberries` | exact word → fresh strawberries and freeze-dried strawberries | unchanged; do not make this a specific alias |
| `freeze-dried` | broad query returns three references, including both freeze-dried berry identities and a freeze-dried curry-leaf form | unchanged; do not add this as a broad alias |
| `strawberry powder` | no result | no result; it is produced inside recipe 062 and is not an ingredient-line request |

The two proposed aliases add only source-supported complete English phrases. Do not alias generic `lyophilized`, `freeze-dried`, fresh strawberries, `dried strawberries`, or the derived powder wording.

## Evidence gaps and integration boundary

- The OQLF entry supports the freeze-drying process and adjective equivalents, while the Canadian bilingual label attests the exact English and Québec French product names. Neither establishes one standard berry shape, slice size, sugar status, or brand-independent recipe behavior.
- The recipe and label quantities are product/formula-specific. No general volume-to-mass mapping or density is proposed; broader mass-volume research remains open.
- The source’s raspberry-buttercream option is formula-specific and gives no general substitution ratio. Do not add an active global rule; a separate substitution review would need to preserve that narrow use context.
- The shared reference and ledger were updated for the two accepted aliases. The recipe line and generated search behavior remain otherwise unchanged. No software tests or builds were run because the data change only adds database JSON content.

## Source register

Pages checked on 2026-10-16. Source IDs were searched for collisions before use.

| ID | Source and locator | Support and limits |
|---|---|---|
| `WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S01` | Office québécois de la langue française, [lyophilisé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408264/lyophilise), definition, preferred terms, and English terms. | The 2025 food-preservation entry lists *lyophilisé* and *séché à froid* as preferred French terms and lists English *freeze-dried*, *freeze dried*, *lyophilized*, and *lyophilised*. It says fruits are among the foods lyophilized. Supports the French process adjective and English synonym spellings; the full phrase aliases are a transparent composition with the strawberry name, not a directly quoted product label. It does not define a strawberry ingredient standard. |
| `WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S02` | Costco Canada, [bilingual Nutrition Facts panel for freeze-dried strawberries](https://www.costco.ca/wcsstore/CostcoCABCCatalogAssetStore/Attachment/690611_NFT.pdf), ingredient and serving lines. | The panel reads `FREEZE DRIED STRAWBERRIES / FRAISES LYOPHILISÉES`, gives strawberries as the ingredient, and reports `1/4 cup (5 g) / 1/4 tasse (5 g)`. The generic PDF filename does not expose the product SKU in the retrieved text. Use the exact name as label evidence and the serving only as a product-specific observation, not a universal conversion. |
| `WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S03` | Costco Canada, [DJ&A Freeze Dried Strawberries, 5 × 100 g](https://www.costco.ca/p/-/dja-freeze-dried-strawberries-5-100-g/4000345509), item 1918803, product details and package. | Current Canadian retailer listing confirms a freeze-dried strawberry product and a 500 g pack composed of five 100 g bags. It supports product availability and one package size only; the page does not provide a reusable cup measure or French display label. |
| `WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S04` | Sally McKenney, [Strawberry Buttercream Frosting](https://sallysbakingaddiction.com/strawberry-frosting/), updated 2025-08-07, ingredient list, method, and notes. | Lists `1 cup (about 25g) freeze-dried strawberries`, processes the berries into powder (around 1/2 cup in the recipe), distinguishes them from fresh, frozen, and chewy dried strawberries, and names freeze-dried raspberries as an alternative for raspberry buttercream. Supports recipe 062’s ingredient, recipe-specific processing, quantity, and one formula variation. It does not establish a global conversion, powder yield, or substitution ratio. |
| `WP02-D-FREEZE-DRIED-STRAWBERRIES-R337-20261016-S05` | Costco Canada, [bilingual Nutrition Facts panel for freeze-dried strawberries](https://www.costco.ca/wcsstore/CostcoCABCCatalogAssetStore/Attachment/9600662_NFT.pdf), ingredient and serving lines. | A separate retailer-hosted panel reads `FREEZE DRIED STRAWBERRIES / FRAISES LYOPHILISÉES` and reports `1/2 cup (9 g) / 1/2 tasse (9 g)`. The available PDF title does not establish its SKU. Retain only as another product-specific label observation; do not reconcile it with S02 or Sally’s formula into a generic density or conversion. |

