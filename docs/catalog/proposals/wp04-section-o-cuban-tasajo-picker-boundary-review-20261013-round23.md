# WP04 Section O — Cuban tasajo picker-boundary review

**Reviewed:** 2026-10-13 (round 23)

**Status:** Proposal only; no live catalog, ledger, recipe, plan, or generated file was changed.

**Scope:** The Cuban *tasajo* gap routed to WP04 by the Caribbean cuisine sweep.

**Disposition:** **Hold active integration.** If a ledger candidate is later useful, retain it as `candidate-cuban-tasajo` with identity state `needs_clarification`; do not activate a reference, aliases, forms, measures, package yield, recipe links, or substitutions.

Historic and regional sources support *tasajo* as a Cuban ajiaco ingredient and describe salt-cured beef shipped from the Río de la Plata to Havana. Current Mexican sources use the same name for a different regional product: thin, salted beef strips dried in the air or sun, sometimes lightly smoked. An active Cuban-only row would be the picker’s sole result for unqualified `tasajo`, while a qualified Oaxacan query would still have no result. No Québec-specific French product name surfaced; `tasajo cubain` is only a provisional French-language construction, not a verified Québec label. The regional boundary and picker behavior are unresolved.

## Prior decisions and search boundary

The WP06 Caribbean cuisine sweep identifies Cuban *tasajo* in its Camagüey ajiaco review and explicitly routes the meat identity to WP04. That review says the dish mention alone is insufficient to define the meat style or its aliases. The R22 beef-jerky review also lists *tasajo* as a separate product scope and does not treat it as jerky or charqui. Searches of the current live references, forms, research ledger, legacy candidate file, recipe package, roadmap, and archived proposals found no standalone tasajo candidate or integration. The dedicated prior decision is a deferral, not an identity ruling.

Nearby active identities remain separately scoped:

- `ingredient-ref-charqui` is displayed as charqui (dried salted camelid meat) / charqui (viande de camélidé séchée et salée), with no aliases.
- `ingredient-ref-peruvian-amazonian-cecina` is displayed as Peruvian Amazon cecina (smoked, dried meat) / cecina de l’Amazonie péruvienne (viande séchée et fumée), with no aliases.
- Biltong, beef jerky, bresaola, and Montréal smoked meat have their own distinct decisions. None supplies a tasajo alias or a general dried-meat identity.

Do not add *tasajo*, `charqui`, `charque`, `jerky`, `viande séchée`, `salt-cured beef`, or `dried salted beef` as aliases to any of these rows. The OQLF entry for charqui gives that term an Andean Quechua origin and a broad terminology definition; the active catalog row is intentionally narrower. The OQLF entry for *viande séchée* is a generic family term and lists several regional products as examples, including charqui. Neither entry adjudicates tasajo as a synonym.

## Current catalog, search, and recipe snapshot

The review inspected the active reference and form files, the full recipe manifest and listed recipe files, package yields, legacy candidates, research ledger, and the current picker implementation.

| Artifact | Current snapshot |
|---|---:|
| Active ingredient references | 1,349 |
| Ingredient forms | 98 |
| Legacy identity candidates | 64 |
| Research-ledger records / source entries | 1,665 / 6,493 |
| Global / contextual substitution rules | 0 / 0 |
| Package-yield records | 1 total; none for tasajo |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

No tasajo wording occurs in the live reference or form files, ledger, or legacy candidate file. Current picker behavior was projected from `IngredientSearch.kt`: it normalizes bilingual reference names and aliases plus attached-form labels and match terms, prefers complete word-phrase matches, then falls back to partial matching.

| Query | Current picker result |
|---|---|
| `tasajo` | No result |
| `Cuban tasajo` | No result |
| `tasajo cubain` / `tasajo cubano` | No result |
| `tasajo de res` / `Oaxacan tasajo` | No result |
| `charqui` | One result: `ingredient-ref-charqui`, the camelid-scoped row |
| `charque` | No result |
| `viande séchée` | One result: `ingredient-ref-peruvian-amazonian-cecina` |
| `jerky` / `beef jerky` | No active result; the R22 beef-jerky decision is ledger-only |

For boundary analysis only, a hypothetical single candidate with English name `Cuban tasajo`, French name `tasajo cubain`, and no broad aliases would project as follows:

| Query | Hypothetical result | Boundary concern |
|---|---|---|
| `tasajo` | Cuban tasajo candidate only | A bare query could refer to the Oaxacan product or another regional use; the picker would route it to Cuba. |
| `Cuban tasajo` / `tasajo cubain` | Cuban tasajo candidate only | The qualifiers select the intended regional candidate. The French name remains provisional. |
| `tasajo cubano` | No result without a Spanish alias | The catalog has bilingual EN/FR search fields; no additional-language alias is proposed here. |
| `Oaxacan tasajo` / `tasajo de res` | No result | The candidate cannot represent the other documented regional product. |
| `charqui` | Existing camelid charqui only | No overlap is introduced unless an unsupported charqui alias is added. |
| `viande séchée` | Existing Peruvian Amazon cecina only | Keep this broad French description off a regional tasajo row. |

The recipe corpus was searched both as full recipe JSON and by ingredient row for `tasajo`, Cuban and Oaxacan forms, jerky, charqui, charque, biltong, cecina, bresaola, Montréal smoked meat, and dried/salted-beef phrases. There were **no matches**. The current corpus digest (manifest-relative path, NUL, file bytes, NUL for each listed recipe) is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. No recipe provides demand, an amount, a method, or a substitution context.

## Regional product and process boundary

The Cuba Travel Camagüey cultural-traditions page places tasajo in the region’s ajiaco and describes the dish’s meat context as including salt-dried beef. Andrew Sluyter’s historical study describes salt-cured beef called tasajo produced around the Río de la Plata during the nineteenth century and shipped to Havana; its abstract says it draws on contemporary descriptions and shipping records. Together these sources support the Cuban historical food context, but do not establish one current commercial specification, cut, seasoning, or preparation standard.

The El Colegio de México dictionary gives a broad Mexican Spanish meat sense: a long piece of dried and salted meat, including *tasajo de res*. A 2025 Oaxaca article describes the local product as long thin beef strips salted and dried in the sun or air, with light wood smoke possible; it distinguishes Oaxaca’s pork *cecina enchilada*. A current Oaxaca producer page likewise describes thin, flat beef strips salted and dried outdoors with wood smoke. These are regional and maker-specific descriptions, not a universal Mexican or Cuban standard. They show why a single regional display name cannot safely own unqualified *tasajo* without a deliberate family-and-variant decision.

## Québec French naming

Targeted searches of OQLF’s Grand dictionnaire terminologique and Québec government and food-product domains did not surface a tasajo-specific French term or a Québec tasajo product listing. This is bounded negative-search evidence, not proof that no Québec usage exists. The OQLF’s preferred broad term *viande séchée* is too general for an alias and already occurs in the active cecina display. Its charqui entry favors *charqui* / *charque* for that terminology family and discourages French *jerky*; it does not establish *tasajo* or *tasajo cubain* as a Québec synonym.

If a future, separately approved candidate needs a French display for review, `tasajo cubain` is a transparent provisional construction. It is not source-attested Québec product wording. Keep the Spanish source name *tasajo* visible and do not translate it to `charqui`, `viande séchée`, or `bœuf salé et séché` as a search alias without region-specific Québec evidence and an explicit picker policy.

## Forms, measures, and substitutions

- **Forms:** No tasajo form or bilingual form wording is present in the 98 active forms. Do not infer fresh/dried, rehydrated, shredded, smoked, or cooked forms from a regional dish or product page.
- **Measures:** No bundled recipe requests tasajo. A producer’s 1 kg package is a maker-specific retail format, not a general package yield, portion, piece count, density, or cooking conversion. No measure is supported.
- **Substitutions:** No recipe context or source supplies a ratio for replacing tasajo with charqui, jerky, cecina, biltong, bresaola, or another meat. No global or contextual substitution is supported.

## Proposal-only candidate and disposition

**Hold integration** while the family boundary and French naming remain unresolved. If a later coordinator decision needs a ledger-only placeholder, use `candidate-cuban-tasajo` with:

- Proposed scope: the Cuban/Camagüey *tasajo* use supported by regional and historical sources; the record must not imply it covers Oaxaca or every Spanish-language tasajo product.
- English display candidate: `Cuban tasajo`.
- French display candidate: `tasajo cubain`, provisional and not Québec-attested.
- Identity state: `needs_clarification`.
- Measurement state: `researched_no_supported_value`.
- Substitution research state: `researched_no_supported_substitute`.
- Category if later approved: `PROTEIN`.
- No active ID, aliases, forms, density, unit mapping, package yield, recipe link, conversion, or substitution now.

Revisit after regional tasajo identities can be represented without routing an unqualified picker query to one regional product, and after Québec French naming is supported. Keep the Section O dried/cured-meat gap open. This is a documentation-only proposal; no tests were run.

## Source register

Sources were checked on 2026-10-13. IDs below are proposal-local. The two OQLF URLs already appear in the research ledger as `WP06-CECINA-20261009-S09` and `WP06-SOUTHAM-20261009-S51` / `WP06-CECINA-20261009-S10`; they are reused without altering those records. The other URLs below had no exact URL match in the current ledger.

| ID | Source | Evidence and limits |
|---|---|---|
| WP04-SECTION-O-TASAJO-20261013-R23-S01 | Cuba Travel, [Camagüey: traditions and customs](https://www.cuba.travel/destinos/camaguey/tradiciones-y-costumbres), accessed 2026-10-13 | Regional tourism page says the “true Camagüey ajiaco” includes tasajo and, in the same ajiaco section, describes salt-dried beef among its meat ingredients. Supports regional dish context, not a technical tasajo specification. |
| WP04-SECTION-O-TASAJO-20261013-R23-S02 | Andrew Sluyter, [“The Hispanic Atlantic’s Tasajo Trail,” *Latin American Research Review*](https://www.cambridge.org/core/journals/latin-american-research-review/article/hispanic-atlantics-tasajo-trail/048C8548C41ACE0D98B83B040E3A8E9C), published online by Cambridge University Press 2022-09-05 | Abstract identifies nineteenth-century salt-cured beef tasajo produced around the Río de la Plata and shipped to Havana; it says the study uses contemporary descriptions and shipping records. Historical trade evidence, not a current product or recipe standard. |
| WP04-SECTION-O-TASAJO-20261013-R23-S03 | El Colegio de México, [*Diccionario del Español de México*, “tasajo”](https://dem.colmex.mx/ver/tasajo), accessed 2026-10-13 | Gives a broad Mexican Spanish meat sense: long pieces of dried and salted meat, including *tasajo de res*. A dictionary definition, not a Cuban/Oaxacan specification or French translation. |
| WP04-SECTION-O-TASAJO-20261013-R23-S04 | Fabiola Hidalgo, El Universal Oaxaca, [“¿Qué es el tasajo, el ingrediente principal de las tlayudas de Oaxaca?”](https://oaxaca.eluniversal.com.mx/mas-de-oaxaca/que-es-el-tasajo-el-ingrediente-principal-de-las-tlayudas-de-oaxaca/), 2025-05-23 | Describes Oaxacan tasajo as thin beef strips salted and dried by sun or air, sometimes lightly smoked; distinguishes the local pork cecina enchilada. Regional journalism, not a product standard. |
| WP04-SECTION-O-TASAJO-20261013-R23-S05 | Sargazo, [Tasajo de Oaxaca](https://sargazo.com/producto/tasajo/), accessed 2026-10-13 | Maker page describes thin, flat strips of salted beef dried outdoors with wood smoke and lists a 1 kg package. Supports one current maker’s product/process only; the package size is not a general measure. |
| WP04-SECTION-O-TASAJO-20261013-R23-S06 | Office québécois de la langue française, [*viande séchée* — GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544703/viande-sechee), updated 2018 | Defines a broad dried-meat family, notes varied regional techniques and species, and lists charqui among examples. It does not mention tasajo and does not support `viande séchée` as a tasajo-specific alias. Existing ledger source ID: `WP06-CECINA-20261009-S09`. |
| WP04-SECTION-O-TASAJO-20261013-R23-S07 | Office québécois de la langue française, [*charqui* — GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542161/charqui), updated 2016 | Records charqui and charque as preferred French terms, notes the Andean/Quechua origin, and gives a broad dried-meat definition. It does not equate tasajo with charqui. Existing ledger source IDs: `WP06-SOUTHAM-20261009-S51` and `WP06-CECINA-20261009-S10`. |

## Local evidence links

- [WP06 Caribbean review routing tasajo to WP04](wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md)
- [R22 beef-jerky picker-boundary review](wp04-section-o-jerky-gap-picker-boundary-review-20261013-round22.md)
- [R21 bresaola product-gap review](wp04-section-o-bresaola-beef-product-gap-review-20261013-round21.md)
- [Cured-pork open-gap follow-up](wp04-cured-pork-open-gap-followup-review-20261012.md)
- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3492)
- [Live ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Live ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Live recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Picker implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)
## Coordinator integration decision (2026-10-13)

Accepted as ledger-only unresolved `candidate-cuban-tasajo`; no active identity or picker aliases were added. Keep the regional candidate separate from Oaxacan tasajo and from charqui, jerky, cecina, biltong, and bresaola until regional boundaries and Québec French naming are resolved. See the [R23 integration record](../batches/wp02-wp03-wp04-round23-gap-review-integration-20261013/README.md).
