# WP04 Proposal: Boneless Pork Loin Chop Bilingual Display Alignment (R297)

**Review date:** 2026-10-16

**Status:** Integrated as R297; the existing display and research ledger were updated, with no recipe, form, measurement, conversion, yield, or substitution change.

## Recommendation

Keep the existing `ingredient-ref-pork-loin-chops` identity and French display, but change the English display from `pork loin chops` to **`boneless pork loin chops`**. Retain category `PROTEIN`, leave both alias arrays empty, and do not add a form, measurement mapping, conversion, yield, recipe link, or substitution rule.

The current French name explicitly says the chops are boneless, and the one matching bundled ingredient line says the same in English. CFIA distinguishes ordinary pork loin chops (item 1410) from boneless pork loin chops (item 1413), then pairs item 1413 with the French product name already used by this reference. This is a bounded bilingual display correction on the existing identity, not a second cut identity.

## Checklist target and current state

Target the open WP04 Section O checklist line in `docs/RecipeBook-global-ingredient-catalog-plan.txt` beginning **“Steaks, roasts, shoulder, shank, ribs, brisket, belly, loin, breast, thigh, wing, whole bird…”**. The cut-name delta is also called out in `docs/catalog/batches/protein-dairy-identities.md`: its audit says the English display omits the boneless qualifier that appears in French.

The active `ingredient-ref-pork-loin-chops` row is currently `pork loin chops / côtelettes de longe de porc désossées`, category `PROTEIN`, with no aliases, density, or unit mappings. There are no forms attached to the row. Its ledger record has no sources or decisions and remains `identityState: unreviewed`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`.

One exact recipe demand appears in the 114-recipe, 1,123-ingredient-row bundle: recipe `095#1`, ingredient UUID `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-1`, says `1 lb boneless pork loin chops, cut into diagonal strips` and links to this reference. Its archived RecipeKeeper export also says `sourceUrl: null`, so the local ingredient text is evidence of the bundled request but not a traceable external recipe citation. Earlier tempeh review mentions the pork row only to preserve the line while reviewing a separate note-only alternative; it does not resolve this display mismatch.

## Naming, identity, and picker projection

CFIA's Canadian wholesale nomenclature distinguishes item 1410, `Pork loin chops`, from item 1413, `Pork loin chops, boneless`. The French page makes the same distinction and names item 1413 `Côtelettes de longe de porc, désossées` [S01–S02]. Mayrand currently lists a Québec product as `Côtelettes de longe de porc désossées` [S04]. The proposed English and French displays therefore name the same bone-removed loin-chop product.

Keep the identity limited to pork loin chops with the bones removed. Do not broaden it to pork chops generally, bone-in loin chops, tenderloin, loin roast, pork ribs, marinated or seasoned products, or a specific center-cut, ribeye, blade, or sirloin subtype. OQLF's `côtelette désossée milieu de longe` is specifically a boneless center-cut chop; it is useful as a boundary and does not justify replacing the broader CFIA item-1413 display with that narrower subtype [S03].

The current phrase-first picker has one result for `pork loin chops` and one for `côtelettes de longe de porc désossées`; an exact search for `boneless pork loin chops` currently has no result because that qualifier is absent from the English display. With the proposed display, the full recipe wording will return the existing row, while the shorter `pork loin chops` phrase remains within the display and continues to return it. Do not add broad aliases such as `pork chop`, `pork chops`, or `pork loin`; those would discard the cut or bone qualifier and may overlap later identities.

## Forms, measures, and substitutions

No separate form is needed: the existing row itself is the named boneless cut, and there is no active generic pork-loin-chop parent. Keep the recipe's `1 lb` as its own ingredient quantity. The archived line’s count/thickness wording is also recipe-specific and has no source URL; it does not establish a reusable chop count-to-mass value. Mayrand's current `160 g x9` listing is one package presentation only and is not a per-chop conversion or default measure [S04]. Add no density, unit mapping, portion, edible-yield, package-yield, raw-to-cooked yield, or cooking conversion.

Do not create a global substitution from this cut to bone-in chops, pork shoulder, ribs, chicken, or tempeh. Recipe 095 contains local alternatives elsewhere in its archived notes, but the export provides no source URL or replacement amount. Those notes do not establish a reusable ratio, method equivalence, or food-safety rule. No substitution behavior is recommended.

## Proposed integration shape

| Stable ID | Category | English display | French display | Aliases / numeric behavior |
| --- | --- | --- | --- | --- |
| `ingredient-ref-pork-loin-chops` | `PROTEIN` | `boneless pork loin chops` | `côtelettes de longe de porc désossées` | No aliases; retain empty forms, density, unit mappings, and substitutions. |

The accepted R297 integration records the sources below on the existing ledger record and marks only the identity as verified. Measurement and substitution research remain unreviewed; none of the listed numeric product details is a reusable recipe measure.

## Source and ownership review

The proposed source IDs below are not present in the current research ledger or proposal archive. Exact URL checks found no existing ledger/proposal owner for these four source URLs. The existing ingredient ledger record is source-empty, and exact searches in the active references, forms, prior proposals, and legacy candidate audit found no competing owner for this bilingual identity.

| Source ID | Source | Supports and limit |
| --- | --- | --- |
| `WP04-PORK-LOIN-DISPLAY-R297-20261016-S01` | CFIA, [Pork wholesale nomenclature — 400 series (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/wholesale-meat/pork), items 1410 and 1413. | Separates general pork loin chops from the boneless item and defines item 1413. Regulatory cut nomenclature, not a recipe measure or retail-package standard. |
| `WP04-PORK-LOIN-DISPLAY-R297-20261016-S02` | CFIA, [Nomenclature du porc pour la vente en gros — série 400 (français)](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/viande-vendue-gros/porc), items 1410 and 1413. | Pairs item 1413 with `Côtelettes de longe de porc, désossées`. The specifications do not establish a portion, count, cooking yield, or substitution. |
| `WP04-PORK-LOIN-DISPLAY-R297-20261016-S03` | OQLF, [côtelette désossée milieu de longe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428048/cotelette-desossee-milieu-de-longe), pork-food domain. | Defines a narrower boneless center-cut chop and says the animal species belongs in a meat-label expression. Do not treat it as a synonym for every boneless loin chop. |
| `WP04-PORK-LOIN-DISPLAY-R297-20261016-S04` | Mayrand, [Côtelettes de longe de porc désossées 160 g x9](https://mayrand.ca/fr/nos-produits/boucherie/porc/porc-cotelette-longe-desossee-fr-50220), current Québec product listing. | Attests the exact French display in local retail/foodservice use. The nine-piece package and listed package weight are product-specific and do not establish a general chop weight. |



## Integration record — accepted as R297

Updated the existing reference display to boneless pork loin chops and marked its identity verified with the four sources above. The French display and empty alias arrays are unchanged. Measurement and substitution states remain not_yet_researched; no form, recipe link, reusable measure, conversion, yield, or substitution was added. Recipe 095#1 remains linked to the existing reference.

The WP04 Section O plan checklist, protein/dairy audit, and roadmap now point to this integration. Static seed-package, generated-index, ledger-schema/source-ownership, picker, corpus, encoding, link, and whitespace checks are recorded in the R297 integration README. No software tests, builds, or emulator runs were performed because the data changes are limited to bundled database JSON and related catalog documentation.
