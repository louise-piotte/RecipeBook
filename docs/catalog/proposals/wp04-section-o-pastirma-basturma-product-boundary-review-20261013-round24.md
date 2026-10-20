# WP04 Section O — pastirma/basturma product-boundary review

**Reviewed:** 2026-10-13 (round 24)

**Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, or generated file was changed.

**Scope:** The unreviewed pastirma/basturma gap within Section O's dried/cured-meat family. This review does not reopen R21 bresaola, R22 beef jerky, R23 Cuban tasajo, or any other prior Section O product decision.

**Disposition:** **Hold active integration.** A Québec farm currently lists `Paprika-beef basturma (pastirma)`, and MAPAQ places basterma/pastirma within its French-language category of salted-and-dried beef charcuteries. A beef-only reference would still capture bare `pastirma` and `basturma` searches, while Türkiye's current meat-products communiqué defines pastırma from large-livestock meat, a class that includes cattle, water buffalo, and camel. The Québec listing fixes one beef product, but it does not make the bare family terms beef-specific. No active identity, aliases, forms, measures, recipe links, conversions, yields, or substitutions are proposed.

## Prior decisions and search boundary

The Section O plan leaves dried/cured meats open for source-scoped product review. R21, R22, and R23 already made separate decisions on beef bresaola, beef jerky, and Cuban tasajo; they remain closed to this packet. The active biltong, camelid charqui, Peruvian Amazon cecina, Montréal smoked meat, prosciutto, and other cured-meat references also retain their existing boundaries. None is proposed as a pastirma alias or substitute.

The exact-key audit covered the current active reference names and aliases, all attached form labels and match terms, legacy candidates, and ledger records. It found no current exact owner or prior product decision for `pastirma`, `pastırma`, `basturma`, or `basterma`. The OQLF pastrami source already recorded under `WP04-MSM-20261011-S02` is reused below only as a boundary reference; it distinguishes Québec `pastrami` from Montréal smoked meat and is not a prior pastirma review.

| Query/name | Current exact owner or state |
|---|---|
| `pastirma`, `pastırma`, `basturma`, `basterma` | No active reference, form, legacy candidate, or ledger identity owns these names. |
| `pastrami` | No active reference, form, or legacy candidate. OQLF's already-ledgered terminology entry describes cooked, lightly smoked beef and distinguishes it from Montréal smoked meat. |
| `biltong` | Active `ingredient-ref-biltong`; not a pastirma alias. |
| `charqui` | Active `ingredient-ref-charqui`, scoped to dried salted camelid meat; not a pastirma alias. |
| `cecina` / `viande séchée` | Active Peruvian Amazon cecina reference; its qualified French display contains the broader phrase. Do not assign that phrase to pastirma. |
| `smoked meat` / `Montréal smoked meat` | Active `ingredient-ref-montreal-smoked-meat`; retain the source-reviewed regional identity. |
| `bresaola`, `jerky`, `tasajo` | Separate R21–R23 decisions, not aliases or substitutes for this proposal. |

The live picker currently returns no result for `pastirma`, `pastırma`, `basturma`, `basterma`, or `pastrami`. The picker normalizes accents and punctuation, searches both language names and aliases, and returns complete word-phrase matches before partial matches. A hypothetical row named `beef pastirma (basturma) / pastirma de bœuf (basturma)` would therefore be the only result for the unqualified queries `pastirma`, `pastırma`, and `basturma`. A qualifier in the rest of the display would not keep those bare queries broad.

| Query | Current result | Hypothetical candidate result | Boundary |
|---|---|---|---|
| `pastirma` / `pastırma` | No result | Beef pastirma candidate only | The Turkish standard includes cattle, water buffalo, and camel; a beef-only row would be too narrow for the bare term. |
| `basturma` | No result | Beef pastirma candidate only | The Québec farm uses this as a paired product name, but the current source does not establish that all basturma products share its beef scope. |
| `pastirma de bœuf` / `beef pastirma` | No result | Beef pastirma candidate only | The qualified query would fit the candidate scope. |
| `basterma` | No result | No result unless added as an alias | MAPAQ's category document records this spelling, but it is not the Québec farm's exact name; keep it inactive pending a source-scoped alias decision. |
| `pastrami` | No result | No result | Preserve the separate Québec cooked-product name; do not add it as an alias. |
| `viande séchée` | One result: Peruvian Amazon cecina | Same cecina result | The broad French family description is already present in the qualified cecina display. |

## Current package and recipe-corpus audit

The audit read the active ingredient reference and form files, legacy candidates, research ledger, package-yield file, manifest, every manifest-listed recipe, and the current picker implementation.

| Artifact | Current snapshot |
|---|---:|
| Active ingredient references | 1,350 |
| Ingredient forms | 98 |
| Legacy identity candidates | 64 |
| Research-ledger records / source entries | 1,668 / 6,510 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Recipe-corpus digest | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and another NUL byte, in manifest order. A full-text scan of all 114 files and their 1,123 ingredient rows found no `pastirma`, `pastırma`, `basturma`, `basterma`, or `pastrami` occurrence; no recipe link, amount, preparation, or substitution request exists for these products. No recipe edit or recipe-specific substitution is supported.

## Product scope and Québec French naming

The 2026 Turkish Food Codex meat-products communiqué defines pastırma as a non-heat-treated cured and dried meat product made from pieces taken from large-livestock carcasses, using curing, washing, pressing, drying, a çemen coating, and further drying. In that communiqué, `large livestock` includes cattle, water buffalo, and camel. The Ministry's definition is product-standard evidence for Türkiye; it does not establish that every Québec product with a related name uses that process or species.

Québec sources support a narrower local product name, without resolving the full family:

- Ferme d'ORée, a Québec farm and processor, currently lists `Paprika-beef basturma (pastirma)`. The same product listing says it weighs about 50 g. It does not describe the product's ingredients or processing method, so its name and weight remain product-specific evidence.
- MAPAQ's 2019 French microbiology-guidelines document groups `viande des Grisons, basterma ou pastirma` as examples of salted-and-dried beef charcuteries. The document is an analytical classification guide, not a terminology ruling or product recipe.
- A Montréal-area restaurant menu uses `Pastirma (viande séchée turque)` in French for a börek ingredient. This is local French-language menu wording, but it does not specify the animal species.
- A targeted OQLF GDT search for `pastirma`, `pastırma`, `basturma`, and `basterma` returned no exact entry in this search pass. This is bounded negative-search evidence, not proof that no Québec terminology entry or local usage exists.

If a later ledger-only candidate is useful, the provisional displays would be `beef pastirma (basturma)` / `pastirma de bœuf (basturma)`. The French species qualifier is a transparent, provisional construction informed by MAPAQ's French-language classification and the Québec product listing; it is not an OQLF-preferred term or an exact French retail label. The unqualified French menu description `viande séchée turque` is too broad to use as an alias.

Do not alias `pastrami`. MAPAQ lists basturma/pastirma among raw salted-and-dried meat charcuteries and lists pastrami separately under cooked charcuteries. OQLF also defines Québec pastrami as cooked and lightly smoked beef and distinguishes it from Montréal smoked meat. The EU's protected `Kayseri Pastırması` name is a geographically bounded beef product; do not turn that qualified name or its specification into a universal pastirma row.

## Forms, measurements, and substitutions

- **Forms:** No pastirma form exists in the active form catalog. The Turkish standard's processing stages define the product family but do not establish recipe-level sliced, shaved, cooked, or rehydrated forms for this corpus. Do not create forms from a retailer's packaged offering or from protected Kayseri product formats.
- **Measurements:** No recipe requests pastirma. Ferme d'ORée's approximately 50 g listing is a single product-specific weight, not a serving, count conversion, density, package yield, or reusable household measure. Regulatory moisture, salt, and product-composition limits are not kitchen amounts and must not enter runtime conversion data.
- **Substitutions:** No recipe or source establishes a ratio for replacing pastirma with pastrami, Montréal smoked meat, bresaola, jerky, tasajo, charqui, cecina, or biltong. Add no global or contextual substitution. Do not infer cooking, curing, storage, or raw-consumption equivalence from similar preservation terms.

## Active catalog scope and conditional ledger-only disposition

**Active catalog scope:** none. Keep the current picker without a pastirma/basturma row until a family-and-variant model or search behavior can avoid routing an unqualified pastirma query to the one beef item.

**Conditional ledger-only disposition:** If a coordinator later wants to preserve the source work in the research ledger, use `candidate-beef-pastirma` with identity state `needs_clarification`, not an active ingredient reference. Candidate scope would be the Québec-listed beef basturma/pastirma product only; it must not imply that all pastirma is beef or that all basturma variants share one process. Proposed category if later approved: `PROTEIN`. Proposed displays: `beef pastirma (basturma)` / `pastirma de bœuf (basturma)`, with the French display marked provisional. If measurement and substitution states are recorded, use `researched_no_supported_value` and `researched_no_supported_substitute`; keep the approximately 50 g shop listing as a source-specific observation. No candidate, alias, form, measure, package yield, recipe link, conversion, or substitution is being added by this proposal.

This proposal changes documentation only. No tests or emulator checks were run.

## Source register

Sources were checked on 2026-10-13. IDs below are proposal-local unless marked as an existing ledger source. There were no exact source-URL matches for S01–S06 in the current research ledger. The OQLF pastrami source reuses its existing ledger record without changing it.

| ID | Source and supported scope |
|---|---|
| WP04-SECTION-O-PASTIRMA-20261013-R24-S01 | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [*Lignes directrices et normes pour l’interprétation des résultats analytiques en microbiologie alimentaire*](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/alimentation/publications-leaa/NM_lignes_directrices_normes_interpretation_microbiologie_alimentaire_MAPAQ.pdf), 2019 edition, §2.5.1–2.5.2, pp. 20–21. Names basterma and pastirma as examples of salted-and-dried beef charcuterie and lists cooked pastrami separately. Supports local French technical usage and a product-class boundary; not an OQLF term ruling, recipe, or general process standard. |
| WP04-SECTION-O-PASTIRMA-20261013-R24-S02 | Turkish Ministry of Agriculture and Forestry, [Turkish Food Codex Communiqué on Meat, Prepared Meat Mixtures and Meat Products, No. 2026/15](https://sanliurfa.tarimorman.gov.tr/Duyuru/661/Turk-Gida-Kodeksi-Et-Hazirlanmis-Et-Karisimlari-Ve-Et-Urunleri-Tebligi-_teblig-No-2026_15_), posted 2026-09-16, Arts. 4 and 9. Defines pastırma as non-heat-treated cured/dried meat and defines the relevant large-livestock category as cattle, water buffalo, and camel. Regulatory evidence for Türkiye; its composition thresholds and requirements are not recipe measures or Canadian rules. |
| WP04-SECTION-O-PASTIRMA-20261013-R24-S03 | Et ve Süt Kurumu (Turkish Meat and Milk Board), [Pastırma](https://www.esk.gov.tr/tr/11017/Pastirma), accessed 2026-10-13. Describes curing, washing, pressing, drying, çemen-coating, and further drying; lists normal, extra, and çemen-free types. Product description only; it does not define a Québec retail product or a transferable recipe form. |
| WP04-SECTION-O-PASTIRMA-20261013-R24-S04 | Ferme d’ORée, [Beef charcuteries](https://fermedoree.com/products/beef-charcuteries), accessed 2026-10-13. Current Québec producer listing `Paprika-beef basturma (pastirma)` at about 50 g. Supports one local name and product-specific weight, not a general composition, process, portion, or yield. |
| WP04-SECTION-O-PASTIRMA-20261013-R24-S05 | Restaurant Mirazu Chomedey, [Menu PDF](https://portal.restomontreal.ca/mirazu-chomedey/menu/menu_291-2024-08-20-58.pdf), accessed 2026-10-13, p. 1. Uses `Pastirma (viande séchée turque)` in a French börek listing. Supports one Québec menu gloss; it does not identify the meat species or establish a preferred French catalog name. |
| Existing ledger source `WP04-MSM-20261011-S02` (reused, not modified) | Office québécois de la langue française, [*pastrami* — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369657/pastrami), updated 2000. Defines Québec pastrami as cured, spiced, cooked, and lightly smoked beef from shoulder or round and distinguishes it from Montréal smoked meat. Terminology boundary only. |
| WP04-SECTION-O-PASTIRMA-20261013-R24-S06 | European Commission, [Commission Implementing Regulation (EU) 2026/725 entering *Kayseri Pastırması* in the PGI register](https://eur-lex.europa.eu/eli/reg_impl/2026/725/oj), 2026-03-24. Identifies the protected name as a beef product produced in Kayseri province. Product-specific geographical identity; not a universal pastirma definition, recipe amount, or conversion source. |

## Local evidence links

- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3492)
- [R21 bresaola product-gap review](wp04-section-o-bresaola-beef-product-gap-review-20261013-round21.md)
- [R22 beef-jerky picker-boundary review](wp04-section-o-jerky-gap-picker-boundary-review-20261013-round22.md)
- [R23 Cuban tasajo picker-boundary review](wp04-section-o-cuban-tasajo-picker-boundary-review-20261013-round23.md)
- [Cured-pork open-gap follow-up](wp04-cured-pork-open-gap-followup-review-20261012.md)
- [Live ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Live ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Live recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Picker search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)
## Coordinator integration decision (2026-10-13)

Accepted as unresolved ledger-only `candidate-beef-pastirma`; no active row, aliases, forms, measures, recipe links, conversions, yields, or substitutions were added. MAPAQ spells its examples `basterma` and `pastirma`; the Québec producer separately uses `basturma (pastirma)` for one beef product. Preserve the ambiguity across the family name and do not alias pastrami. See the [R24 integration record](../batches/wp02-wp03-wp04-round24-gap-review-integration-20261013/README.md).
