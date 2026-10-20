# WP02 Section D — cocoa nibs, caramel sauce, and remaining confectionery and fruit boundaries

- **Reviewed:** 2026-10-12
- **Status:** integrated; two identity-only additions, no recipe-line edits
- **Scope:** one unresolved Section D sub-batch covering cocoa nib identity, caramel sauce identity, remaining chocolate presentation demand, chocolate/nut paste boundaries, and the fruit-product gaps that remain after the strawberry-purée integration.
- **Integration:** coordinator-owned catalog and checklist changes are complete; the integration report and final snapshot are in [`../batches/wp02-section-d-cocoa-nibs-caramel-sauce-integration-20261012/README.md`](../batches/wp02-section-d-cocoa-nibs-caramel-sauce-integration-20261012/README.md).

## Recommendation

Two distinct identity-only references are integrated:

1. `cocoa nibs / cacao en grains`, with the source-supported alias `grué de cacao` and selected English search aliases listed below. Cocoa nibs are edible cacao-bean pieces. They are not chocolate chips, chocolate shavings, cocoa powder, cocoa mass, or a form of finished chocolate.
2. `caramel sauce / sauce au caramel`, with no aliases. A dessert sauce is distinct from dulce de leche, caramel and toffee bits, butterscotch chips, and other confectionery or topping products.

Add no form, recipe link, density, unit mapping, package yield, conversion, or substitution rule. Keep the wider fruit-product row and the remaining chocolate-form checklist open. Do not revisit the already integrated strawberry purée, chocolate chips/melted chocolate forms, chocolate shavings, paste identities, baking inclusions, or caramel/toffee-bit holds.

## Live snapshot and collision audit

The pre-integration shared-worktree snapshot was refreshed on 2026-10-12 after the concurrent Section A and Section B integrations. File hashes cover exact bytes. The recipe fingerprint hashes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and a trailing NUL in manifest order.

| Artifact | Live count | SHA-256 or fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,233 references | `0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,531 records; 5,271 source entries; 4,313 distinct source IDs | `d665f791e7f6077054ce3bcc2e0b6aeb2434b346703b62e74257aa9fde8edbdd` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The proposed reference IDs `ingredient-ref-cocoa-nibs` and `ingredient-ref-caramel-sauce` are absent from active references and ledger records. At the pre-integration snapshot, the proposal source namespace `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S01` through `S15` was absent from the ledger and existing proposal/batch files. Root also checked new source `S16` before integration.

The exact-phrase collision audit used the project `normalize_search_key` behavior (Unicode NFKD/case folding, accent and common-ligature folding, punctuation-to-space, and trimming). It checked active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs. No exact owner exists for any proposed new phrase or alias below.

| Phrase or phrase family checked | Exact normalized owner | Decision |
| --- | --- | --- |
| `cocoa nibs`, `cocoa nib`, `cacao nibs`, `cacao en grains`, `grué de cacao`, `cracker cocoa` | none | Use the established cocoa/cacao nib terms; keep the low-precision `cracker cocoa` wording out of picker aliases. |
| `caramel sauce`, `sauce au caramel` | none | Safe for the proposed identity. |
| `dulce de leche`, `confiture de lait` | WP06 proposal candidate only; no active reference/form/legacy owner found in this audit | Keep as the separately tracked milk-and-sugar spread candidate; do not alias it to sauce. |
| `caramel bits`, `toffee bits`, `butterscotch chips` | Butterscotch chips is an existing active identity; caramel/toffee-bit holds are documented in the completed Section D packet | Preserve the different products and the existing hold. |
| `chocolate shavings`, chocolate chips, and the six existing chocolate forms | Existing active identities/forms | Preserve completed mappings; do not use them as nib aliases or create additional forms without matching demand. |
| `fruit purée`, `fruit powder`, `fruit paste`, `fruit curd`, `fruit filling`, and blueberry pie-filling wording | no exact generic owner; product-specific pie-filling evidence is discussed below | Do not create a generic umbrella alias or relink homemade filling recipes. |

The audit did not treat a related word as a collision by itself. Cocoa nibs stay separate from cocoa powder, cocoa butter, cocoa mass/liquor, and finished chocolate. Caramel sauce stays separate from the sweetened chestnut spread, Nutella, gianduja, praline paste, dulce de leche, and candy-chip references.

## Full recipe-demand audit

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned. Candidate phrases were also searched in the full recipe JSON text. Neither proposed identity appears in a recipe line or elsewhere in the current recipe text. The adjacent demand below explains why no extra forms or recipe links follow from the broader checklist.

### Chocolate forms and presentation

The package already has four linked chip forms and two linked melted forms. Their complete recipe-line demand remains as follows:

| Recipe line | Authored ingredient text | Current form | Disposition |
| --- | --- | --- | --- |
| 001 #10, `0a8b29b8-faf0-4597-8514-e09335de6c03-ingredient-10` | `2 tbsp chocolate chips` | semisweet chips | Keep. |
| 009 #7, `3e2bd9d9-95fc-43ea-8d33-140de5b7de25-ingredient-7` | `1 cup chocolate chips` | semisweet chips | Keep. |
| 026 #4, `ff66e4f7-c719-4203-970b-06993cdb25de-ingredient-4` | `1 1/3 cups semisweet chocolate chips` | semisweet chips | Keep. |
| 040 #3, `798352ab-d4ad-4e5d-9c90-f0484609bca2-ingredient-3` | `2 cups dark chocolate chips` | dark chips | Keep. |
| 047 #8, `3a206140-a145-4871-92c6-7024ce958858-ingredient-8` | `1 cup semisweet chocolate chips` | semisweet chips | Keep. |
| 054 #9, `ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-9` | `270 g semisweet chocolate chips, plus more for decorating` | semisweet chips | Keep. |
| 067 #1, `4a10822e-551d-4738-b0c2-d7492fb5b86f-ingredient-1` | `1 cup dark chocolate chips` | dark chips | Keep. |
| 067 #2, `4a10822e-551d-4738-b0c2-d7492fb5b86f-ingredient-2` | `1 cup milk chocolate chips` | milk chips | Keep. |
| 069 #9, `81d376ac-c305-402f-a73d-8bb721045319-ingredient-9` | `1 cup white chocolate chips` | white chips | Keep. |
| 045 #15, `b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-15` | `Melted white chocolate, to taste` | melted white chocolate | Keep. |
| 071 #7, `fcd1d029-7265-4735-83d9-ce8ea7d40c2a-ingredient-7` | `680 g semisweet chocolate, melted` | melted semisweet chocolate | Keep. |
| 088 #7, `d9ce5a86-561d-4c36-975f-5f4249aa9df5-ingredient-7` | `1/3 cup semisweet chocolate, melted` | melted semisweet chocolate | Keep. |

Ten other chocolate lines mark chopped size or preparation on their ingredient lines rather than request a purchasable product form: 013 #8 unsweetened chocolate, chopped; 057 #1 bittersweet chocolate, finely chopped, #15 white chocolate, chopped, #19 and #20 bittersweet chocolate, chopped; 061 #1 white chocolate chopped into small pieces; 070 #4 and #20 semisweet chocolate, finely chopped; 102 #1 70% dark chocolate, chopped; and 107 #4 unsweetened chocolate, finely chopped. Preserve the existing `preparation` values; do not create a `chopped chocolate` form.

Two existing chocolate-shavings lines remain linked to `ingredient-ref-chocolate-shavings`: 057 #28 `Bittersweet and white chocolate shavings, for garnish`, and 068 #11 `Chocolate shavings`. Recipe 064 #1 says marzipan is grated; it is not grated chocolate. The corpus has no ingredient line asking for chocolate bars, chunks, wafers, fèves, nibs, or grated chocolate as purchasable forms. Plain chocolate lines without an explicit product state stay on their current base identities. No new chocolate form is supported in this batch.

### Chocolate and nut paste/spread boundaries

The seven direct paste/spread lines remain on their present references:

| Recipe line | Authored ingredient text | Current reference | Disposition |
| --- | --- | --- | --- |
| 003 #1, `8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d-ingredient-1` | `16 oz homemade almond paste` | almond paste | Keep. |
| 011 #6, `2d1a7685-9425-40ae-bdd5-6eaf2a55792f-ingredient-6` | `198 g almond paste` | almond paste | Keep. |
| 030 #2, `dfa44a33-5dff-4304-9308-1d8326055a58-ingredient-2` | `1/3 cup Nutella` | brand-specific Nutella | Keep. |
| 045 #14, `b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-14` | `500 g pink marzipan` | marzipan box | Keep. |
| 056 #7, `04dff954-4213-492a-9194-4bed8553d145-ingredient-7` | `40 g pistachio paste` | pistachio paste | Keep. |
| 056 #16, `04dff954-4213-492a-9194-4bed8553d145-ingredient-16` | `30 g pistachio paste` | pistachio paste | Keep. |
| 064 #1, `d21fb531-f3be-49a3-b361-d429150c05b2-ingredient-1` | `198 g marzipan, grated` | marzipan box | Keep; grated is preparation. |

There is no direct purchased-ingredient demand for gianduja, praline paste, hazelnut spread with cocoa, generic chocolate spread, chestnut purée, or sweetened chestnut spread. Their completed identities and boundaries stay unchanged. In particular, do not make generic `chocolate spread` or `chocolate hazelnut spread` an alias for Nutella or hazelnut spread with cocoa, and do not merge gianduja or praline paste with almond paste/marzipan. The brand-specific Nutella ledger row remains `unreviewed`; this proposal does not re-open that row. Pistachio paste remains without general measurement or substitution evidence.

### Fruit purées, powders, pastes, jams, curds, and fillings

The five exact fruit-product lines already found in the prior integrated purée review remain unchanged:

| Recipe line | Authored ingredient text | Current reference/state | Disposition |
| --- | --- | --- | --- |
| 010 #10, `a1e9ba5d-be5c-447d-a368-3ae4954a0a07-ingredient-10` | `120 ml raspberry jam` | raspberry jam | Keep; no relink. |
| 051 #12, `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-12` | `1/2 cup reduced strawberry puree` | strawberry purée; `reduced / réduite` preparation | Keep the integrated link and authored amount/text. |
| 062 #1, `e34243f0-f13c-47bf-991f-a8d50e3c67a8-ingredient-1` | `25 g freeze-dried strawberries` | freeze-dried strawberries | Keep; no relink. |
| 112 #3, `b109cd15-b162-4825-9479-bbc022bd6cb4-ingredient-3` | `10 g freeze dried raspberries` | freeze-dried raspberries | Keep; no relink. |
| 112 #4, `b109cd15-b162-4825-9479-bbc022bd6cb4-ingredient-4` | `Extra freeze dried raspberries for coating` | freeze-dried raspberries | Keep; no relink. |

The corpus also has component recipes titled Blueberry Cake Filling (014) and Cherry Cake Filling (029). Their lines list fresh or frozen blueberries/cherries, sugar, cornstarch or arrowroot, citrus, vanilla, salt, and (for the cherry filling) almond extract. Recipes 106 Blueberry Pie and 108 Raspberry Pie likewise list whole fruit with sugar, citrus, salt, and cornstarch inside the recipe. None contains a purchased fruit filling ingredient row. No ingredient row asks for fruit powder, fruit paste, fruit curd, a generic fruit filling, dulce de leche, caramel sauce, or cocoa nibs. Phrase searches of the full recipe files found no direct candidate-term demand.

The three fruit-product ledger rows other than strawberry purée remain source-unreviewed: raspberry jam, freeze-dried strawberries, and freeze-dried raspberries each have `identityState=unreviewed`, `measurementState=not_yet_researched`, `substitutionResearchState=not_yet_researched`, and no ledger sources in the live snapshot. Keep their current recipe links; a later batch should research their terms and boundaries without assuming this packet settles them.

## Accepted identity and evidence decisions

### Cocoa nibs

The OQLF GDT entry `cacao en grains` defines cacao beans that have been cleaned, shelled, and germ-removed, and lists English `cocoa nib`, `cocoa nibs`, U.S.-marked `cacao nib`, `cacao nibs`, and `cracker cocoa`. Callebaut’s Québec-facing ingredient page uses `grué de cacao` for roasted, shelled cacao beans and describes their roasted-cacao flavor and crisp texture. Its Cacao Barry product listing calls the product roasted pure-cacao pieces and lists a 1 kg bucket. The name `cacao en grains` therefore follows the OQLF term, while `grué de cacao` is a sourced commercial French alias. The picker uses `cocoa nib`, `cacao nibs`, and `cocoa nibs`; it leaves the U.S.-marked singular `cacao nib`, the low-precision `cracker cocoa`, and unspecific `nibs` out of aliases.

The OQLF definition of chocolate describes a product made from cacao materials and sucrose, with or without cocoa butter. Together with the product listing’s pure roasted-cacao pieces, this supports keeping nibs separate from finished chocolate and from cocoa powder/mass/butter. It does not establish a roast, grind, or sweetening form for general use, so add no form.

### Caramel sauce

Metro’s Québec French recipe page uses the title `Sauce au caramel`; its English counterpart uses `Caramel Sauce`. The pages show a home formulation with brown sugar, corn syrup, butter, milk, and cornstarch, served over ice cream; the English page displays a 1 L yield for that named recipe. A second Metro recipe, `Sauce au caramel à la fleur de sel`, uses sugar and water with cream, salt, and butter and reports four servings. Callebaut markets a ready-to-use caramel topping as a sauce for warm or cold dessert finishing in a 1 kg bottle. These sources show different formulations and source-specific quantities, but do not establish a general product composition, density, or conversion. Use no aliases for `caramel topping`, salted sauce, butterscotch sauce, or dulce de leche.

OQLF defines `confiture de lait / dulce de leche` as a milk-and-sugar spread slowly cooked until caramelized. This is a separate spread identity, already tracked by the WP06 candidate review. Do not duplicate it, merge it into caramel sauce, or use it as a substitute.

## Measurements, density, and substitution findings

| Candidate | Source-specific observation | Shared numeric decision | Substitution decision |
| --- | --- | --- | --- |
| Cocoa nibs | Callebaut lists a 1 kg bucket for its Cacao Barry grué product. The package mass identifies one SKU/pack size; it is not a cup weight or bulk density. | `defaultDensity: null`; `unitMappings: []`; no form density, package yield, or recipe measure. | No general substitution. Do not equate nibs with chocolate chips/shavings, cocoa powder, cocoa mass, or sweetened chocolate. No recipe-specific substitute is in scope. |
| Caramel sauce | Metro displays a 1 L yield for one named recipe and four servings for another formulation; Callebaut lists a specific 1 kg topping bottle. Keep each quantity source-bound; none is a generic conversion, density, or package yield. | `defaultDensity: null`; `unitMappings: []`; no general sauce density, unit mapping, or package yield. | No general substitution. Keep separate from dulce de leche, caramel/toffee bits, butterscotch chips, and confectionery caramels. No recipe-specific substitute is in scope. |

No source supports a reusable density, volume-to-mass mapping, or substitution for these candidates. The source-specific 1 L recipe yield, four-serving recipe, and 1 kg packages remain attached to their sources and do not become general measures or package-yield records. The currently integrated strawberry purée reference remains unchanged.

## Integrated shared-file changes

The coordinator integrated two identity-only references in ID order: `ingredient-ref-cocoa-nibs` and `ingredient-ref-caramel-sauce`. Final aliases, evidence records, and accepted decisions are in `ingredient-references.v1.json` and `research-ledger.v1.json`. Both references have null default density and empty unit mappings; neither has forms, recipe links, substitutions, or package-yield data. The caramel record preserves the 1 L yield and four-serving count as source descriptions only, without treating them as generic values.

Eight sources (S01–S08) support the two primary decisions; S16 records the salted-caramel recipe boundary. S09–S15 remain proposal-only fruit-product evidence. The generated catalog was regenerated, and package counts and validation results are recorded in the integration README.

Recipe files, ingredient forms, substitution rules, package-yield data, and legacy candidates remain unchanged. The generated Kotlin catalog was regenerated from the two new references. No recipe line is linked to either new reference because there is no direct recipe demand.

## Evidence and access limits

All web pages below were accessed or search-index checked on 2026-10-12. Source IDs S01–S08 and S16 are recorded on the two accepted ledger records; S09–S15 remain proposal-only evidence for documented holds. Product package sizes, recipe yield, and serving counts remain source-specific.

| ID | Source | Evidence used and limit |
| --- | --- | --- |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S01` | Office québécois de la langue française, [cacao en grains (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8420762/cacao-en-grains) | Names `cacao en grains`, defines cleaned/shelled/de-germed cacao beans, and lists English `cocoa nib`, `cocoa nibs`, and `cacao nibs`; `cacao nib` is marked U.S. usage. Supports the identity and term variants, not a kitchen measure. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S02` | Office québécois de la langue française, [chocolat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8399643/chocolat) | Defines chocolate as a product made from cacao materials and sucrose, with or without cocoa butter. Used with S01/S03/S04 to preserve the cacao-piece versus finished-chocolate boundary; not a composition standard for every product. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S03` | Callebaut, [Ingrédients dérivés du cacao](https://www.callebaut.com/fr-CA/ingr%C3%A9dients-d%C3%A9riv%C3%A9s-du-cacao) | Québec-facing manufacturer page uses `grué de cacao` for roasted, shelled beans and describes the roasted flavor and crisp texture. Product-family naming evidence, not an OQLF preferred-term ruling. `sourceKind: manufacturer`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S04` | Cacao Barry / Callebaut, [Grué de cacao — seau de 1 kg](https://www.callebaut.com/fr-CA/products/cacao-barry/grue-de-cacao/NIBS-S-609) | Calls the product roasted pure-cacao pieces, categorizes it as a cacao ingredient, and gives one 1 kg bucket size. Supports the product identity and one commercial pack size only; no density or mass/volume relation. `sourceKind: manufacturer`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S05` | Metro, [Sauce au caramel (French recipe)](https://api.metro.ca/recettes-et-occasions/recettes/sauce-au-caramel) | Uses the Québec French name and gives one home formulation with brown sugar, corn syrup, butter, milk, and cornstarch, served over ice cream. It does not establish universal composition. `sourceKind: culinary_reference`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S06` | Metro, [Caramel Sauce (English recipe)](https://api.metro.ca/en/recipes-occasions/recipes/caramel-sauce) | English counterpart confirms the exact English wording and same formulation as S05. Its 1 L displayed yield applies to that recipe, not to caramel sauce generally. `sourceKind: culinary_reference`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S07` | Callebaut, [Ready To Use Caramel Topping — 1 kg bottle](https://www.callebaut.com/en-GB/products/callebaut/caramel-topping/TOF-6042CARAE4-Z38) | Calls a specific ready-to-use topping a sauce, lists warm/cold dessert finishing use, and gives a 1 kg bottle. The formulation and size are product-specific and do not supply general density or synonymy for every caramel sauce. `sourceKind: manufacturer`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S08` | Office québécois de la langue française, [confiture de lait (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544281/confiture-de-lait) | Defines dulce de leche as a milk-and-sugar spread cooked slowly until caramelized, and accepts both French `confiture de lait` and `dulce de leche`. Supports a distinct spread boundary; its identity is already tracked in WP06 and should not be duplicated. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S09` | Office québécois de la langue française, [purée de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889579/puree-de-fruits) | Defines cooked fruit purées and gives generic `purée de fruits`. Its broad/older definition does not define one purchased puree composition or make purée equivalent to jam, coulis, powder, or filling. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S10` | Gouvernement du Québec, [Culture des fraises et des framboises](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/culture-fraises-framboises) | Lists coulis, jams, jellies, and purées as separate berry products. Industry overview only; no product standards or general conversions. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S11` | Gouvernement du Québec, [Culture du bleuet](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/culture-bleuet) | Lists pie fillings, jams, coulis, purées, jellies, juices, concentrates, and confections as distinct blueberry products. Supports the product-family boundary, not a generic filling identity. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S12` | MAPAQ, [Les petits fruits : une forte présence sur les marchés d’exportation](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/publications-adm/bulletins/Bioclips/2023/BU_Bioclips_Vol31_no25_MAPAQ.pdf) | Describes Québec berry processing into purées, dry extracts/powders, concentrates, and frozen products. Supports that powder and purée are distinct processed products; it provides no universal ingredient definition or recipe conversion. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S13` | Office québécois de la langue française, [pâte de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351156/pate-de-fruits) | Defines a pectin-set confection made from fruit purée and sugar, cooked, molded/cut, and sugared. This confection is not a generic fruit purée or pie filling. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S14` | Office québécois de la langue française, [pâte de fruits déshydratés (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502371/pate-de-fruits-deshydrates) | Defines fruit leather from pectin, juice, and dried fruit and distinguishes a snack product from a generic puree or filling. Does not establish a shared “fruit paste” alias. `sourceKind: regional_authority`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S15` | Metro, [E.D. Smith Garniture pour tarte aux bleuets, 540 mL](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/ensembles-melanges-et-garnitures/garniture-pour-tarte-aux-bleuets/p/067200003231) | Québec retail listing uses the specific French product name and lists blueberries, water, sugar, modified corn starch, and concentrated lemon juice for one 540 mL SKU. It shows a species-specific prepared filling exists but gives no generic fruit-filling equivalence or density. `sourceKind: other`. |
| `WP02-SECTION-D-CONF-FRUIT-GAP-20261012-S16` | Metro, [Sauce au caramel à la fleur de sel (French recipe)](https://api.metro.ca/recettes-et-occasions/recettes/sauce-au-caramel-a-la-fleur-de-sel) | Uses a distinct salt-qualified recipe title and a second sugar/water/cream/butter formulation; reports four servings. It supports formula variation, not a generic alias or yield. `sourceKind: culinary_reference`. |

The direct product listing in S15 is the Blueberry Pie Filling SKU, not any of the homemade component recipes in the bundled corpus. Its label and 540 mL package size do not support relinking a recipe or making a general fruit-filling entity.

## Explicit holds and remaining gaps

- **Chocolate forms:** hold bars, chunks, wafers, fèves, nibs-as-a-form, grated chocolate, and chopped chocolate forms. The only new chocolate-adjacent acceptance here is the separate cocoa-nib ingredient. Keep the six existing chip/melted forms and existing chocolate-shavings identity unchanged.
- **Chocolate/nut pastes:** keep the completed gianduja, praline paste, hazelnut spread with cocoa, almond paste, marzipan, pistachio paste, chestnut purée, and sweetened chestnut spread boundaries. Do not create generic chocolate-spread aliases. Recipe 030 remains brand-specific Nutella.
- **Fruit purées and powders:** no unreviewed generic fruit parent is justified. Keep the existing strawberry-purée identity and its recipe link. Fruit powder is a broad family with species and processing differences; no bundled ingredient row requests it.
- **Fruit pastes, curds, and fillings:** hold a generic parent. The Québec evidence distinguishes pectin-set fruit confection from fruit leather and lists many product types. The blueberry pie-filling listing is one named, species-specific SKU with no matching recipe line; do not promote it as an umbrella identity from this batch.
- **Jams and freeze-dried fruit:** preserve all existing rows. Their exact recipe links remain, but their active ledger identities still need source/measurement/substitution review.
- **Dulce de leche:** keep the existing WP06 candidate and its OQLF-supported French terms there; do not duplicate it under WP02 or merge it with caramel sauce.
- **Caramel/toffee bits:** retain the completed Section D hold for lack of product breadth and an accepted Québec French generic name. Do not merge those held products with this accepted sauce identity, butterscotch chips, or wrapped caramel candies.
- **Measurements/substitutions:** no supported general density, conversion, package yield, or substitute was found for the two accepted identities. Future product-specific measurements must remain tied to their exact product and size.

Section D’s broader chocolate/confectionery and fruit-product checklist therefore remains open. This packet adds two researched identities and documents the current recipe demand and no-demand boundaries without reopening completed rows.
