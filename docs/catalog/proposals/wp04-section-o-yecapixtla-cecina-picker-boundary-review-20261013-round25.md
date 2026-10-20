# WP04 Section O — Yecapixtla cecina picker-boundary review

- **Reviewed:** 2026-10-13 (round 25)
- **Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, or generated file was changed.
- **Scope:** The Mexican cecina boundary, focused on the source-defined beef product `Cecina de Yecapixtla, Orgullo de Morelos`. This review does not reopen the existing Peruvian Amazon cecina identity or the R23 Cuban tasajo decision.
- **Disposition:** **Hold active integration.** Mexico’s official geographical-indication declaration defines Yecapixtla cecina as a beef product from the rear leg. Montréal market listings use `cecina` for Mexican beef and describe another cecina as being in the style of Yecapixtla; however, those listings do not establish that a local product is authorized to use the protected indication. The active picker already returns the Peruvian Amazon cecina for bare `cecina`. An active Yecapixtla row would give that bare query two regionally distinct results, and no bundled recipe requests either product. Preserve the scoped identity as a ledger-only candidate if the coordinator wants to retain it; add no active row or aliases.

## Prior decisions and exact-name boundary

The Section O plan keeps dried and cured meats open for product-specific review. The existing [Peruvian Amazon cecina review](wp06-cecina-boundary-review-20261009.md) integrated `ingredient-ref-peruvian-amazonian-cecina` as a source-named, regionally qualified dried-and-smoked meat family. Its sources explicitly do not claim that every product called `cecina` has the same region, species, or process. This proposal respects that scope and does not alter that identity.

The [R23 Cuban tasajo review](wp04-section-o-cuban-tasajo-picker-boundary-review-20261013-round23.md) used an Oaxaca source to distinguish beef tasajo from pork cecina enchilada. This packet examines the cecina side of that boundary with product-specific sources; it does not revise the tasajo decision. The Mexican evidence also identifies multiple cecina products: the protected Yecapixtla product is beef, while Larousse Cocina describes Oaxacan cecina enchilada as marinated pork. Those names must not be treated as synonyms or folded into one species-specific identity.

The exact-name check covered active reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs. The only active reference whose display contains the unqualified word `cecina` is `ingredient-ref-peruvian-amazonian-cecina`. No active reference, form, legacy candidate, or ledger identity currently owns `cecina de Yecapixtla`, `Yecapixtla cecina`, or `cecina mexicana` as an exact name. The research ledger has no Yecapixtla cecina candidate.

## Current package and recipe-corpus audit

The audit read the active ingredient references and forms, legacy candidates, research ledger, recipe manifest, all manifest-listed recipes, and the picker search implementation.

| Artifact | Snapshot |
|---|---:|
| Active ingredient references | 1,352 |
| Ingredient forms | 98 |
| Legacy candidates | 64 |
| Research-ledger records / source entries | 1,671 / 6,527 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Recipe-corpus digest | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and another NUL byte, in manifest order. A full text and ingredient-row scan found no occurrence of `cecina`, `Yecapixtla`, `cecina mexicana`, `cecina de res`, `cecina de cerdo`, or `cecina enchilada`. There is no recipe link, amount, preparation note, or substitution request for these products.

## Product identity and protected-name boundary

Mexico’s Diario Oficial de la Federación published the protection declaration for **“Cecina de Yecapixtla, Orgullo de Morelos.”** It defines the protected product as a meat product made mainly from beef, specifically lean cuts from the animal’s rear leg. Its production description includes salting, partial dehydration in the sun, and application of black pork lard. The protected geographic area is the municipality of Yecapixtla, Morelos. Use of the protected indication is restricted to authorized users under the declaration. These are source-defined identity and geographic facts; the regulation is not a recipe, household measure, food-safety instruction, or proof that a Québec listing is an authorized protected-indication product.

Québec market evidence supports local exposure to Mexican cecina terminology but has narrower limits:

- A Montréal butcher’s French-language [Latinos Québec business listing](https://latinosquebec.com/fr/commerce/boucherie-casa-mexico-456) lists `cecina` and says its cecina is in an authentic Yecapixtla style. It also mentions `enchilada à la cecina`. The page is a third-party business directory, not a protected-product certificate or independently verified current inventory. Its French text supports retaining the source name `cecina` and the expression `style de Yecapixtla`; it does not establish that the butcher’s product is the protected cecina, specify its species or formulation, or make `enchilada à la cecina` an alias.
- Montréal retailer Marché Andes lists `Cecina mexicana` and describes thin beef slices that are salted and marinated. This supports a local Mexican-beef product label, but does not name Yecapixtla or establish that the listed product is the protected product.
- Larousse Cocina defines Oaxacan cecina as pork sliced and marinated with a chile mixture, commonly grilled, and also called `cecina enchilada`. This is a separate product boundary, not a Yecapixtla synonym.

A targeted OQLF GDT search did not find a cecina-specific entry. That is bounded negative-search evidence, not proof that no Québec term exists. OQLF’s existing `viande séchée` entry is a broad category covering meat from different species and regional drying techniques; it does not support using `viande séchée` as a cecina alias.

## Québec French naming and aliases

If a ledger-only candidate is useful, keep the source name visible and use a provisional descriptive display for the protected product:

| Locale | Provisional candidate display | Status |
|---|---|---|
| English | `Yecapixtla cecina (beef)` | Source-scoped construction; not a Québec retailer’s exact product title. |
| French | `cecina de Yecapixtla (bœuf salé et séché au soleil)` | Provisional Québec French description. It retains the Spanish product name and reflects the federal declaration; it is not an OQLF-preferred term or evidence that a local style product is protected. |

Add no aliases. In particular, do not add bare `cecina`, `cecina mexicana`, `cecina de res`, `cecina enchilada`, `cecina de cerdo`, `carne enchilada`, `carne seca`, `viande séchée`, `jerky`, `charqui`, or `tasajo`. These names either span multiple products or refer to separate source-defined identities. The Québec listing’s phrase `style de Yecapixtla` is useful naming evidence, but it is not proposed as an alias for the protected product.

## Picker projection

The picker normalizes accents and punctuation, then returns complete word-phrase matches across names and aliases before falling back to partial matches. Current results and a hypothetical candidate projection are:

| Query | Current result | If one Yecapixtla candidate were active | Boundary |
|---|---|---|---|
| `cecina` | Peruvian Amazon cecina | Peruvian Amazon cecina and Yecapixtla cecina | Bare name becomes regionally ambiguous. |
| `cecina de Yecapixtla` | No result | Yecapixtla cecina only | Qualified query is source-scoped. |
| `Yecapixtla` | No result | Yecapixtla cecina only | Region qualifier selects the candidate. |
| `cecina mexicana` | No result | No result | Do not broaden the candidate to the broader Mexican family name. |
| `cecina enchilada` / `cecina de cerdo` | No result | No result | Keep Oaxacan pork cecina enchilada separate. |
| `cecina de res` | No result | No result | The protected product is beef, but this wider phrase is not an exact Québec alias and can describe other regional products. |
| `viande séchée` | Peruvian Amazon cecina | Peruvian Amazon cecina | Keep the OQLF’s broad category out of the Yecapixtla candidate’s aliases. |

Do not activate a row with the proposed display while bare `cecina` resolves to only one region. The source names can be preserved in the ledger for future picker work without creating a false alias or changing the Peruvian result.

## Forms, measurements, and substitutions

- **Forms:** The protected product declaration describes how a specific product is made. It does not establish reusable recipe forms such as fresh, cooked, shredded, or rehydrated cecina. Add no ingredient form or form match term.
- **Measurements:** No bundled recipe requests Yecapixtla cecina. The regulatory description contains no recipe amount or household measure; no default quantity, density, package yield, or portion is supported.
- **Substitutions and safety:** No recipe or source supplies a ratio for replacing Yecapixtla cecina with Peruvian Amazon cecina, Oaxacan cecina enchilada, tasajo, jerky, biltong, or charqui. Add no global or contextual substitution. Do not infer cooking, curing, storage, or raw-consumption equivalence from similar names or preservation language.

## Conditional ledger-only disposition

If the coordinator wants to preserve this source work, use a ledger-only candidate `candidate-cecina-de-yecapixtla` with identity state `needs_clarification`, scoped to the source-defined beef product named **“Cecina de Yecapixtla, Orgullo de Morelos.”** The proposed displays above remain provisional, and the local Québec “style of Yecapixtla” listing must not be represented as an authorized protected-indication product. If state fields are recorded, use `researched_no_supported_value` for measurement and `researched_no_supported_substitute` for substitution. Do not add an active reference, alias, form, recipe link, measure, conversion, yield, or substitution. Keep Section O open.

This proposal changes documentation only. No app, unit, instrumentation, or emulator tests were run.

## Source register

Sources were checked on 2026-10-13. Proposal-local IDs are unique to this review. The OQLF `viande séchée` URL is reused from existing ledger source `WP06-CECINA-20261009-S09`; no ledger record is changed here.

| ID | Source and supported scope |
|---|---|
| `WP04-SECTION-O-YECAPIXTLA-CECINA-20261013-R25-S01` | Diario Oficial de la Federación, [Declaration of Protection for the Geographical Indication “Cecina de Yecapixtla, Orgullo de Morelos”](https://sidof.segob.gob.mx/notas/docFuente/5778499), published 2026-01-20. Defines the protected product’s beef and hind-leg scope, partial sun-drying and pork-lard process, municipality boundary, and authorized-use restriction. It does not define a Québec retail product, recipe, household measure, or safety equivalence. |
| `WP04-SECTION-O-YECAPIXTLA-CECINA-20261013-R25-S02` | Québec butcher listing via Latinos Québec, [Casa Mexico](https://latinosquebec.com/fr/commerce/boucherie-casa-mexico-456), accessed 2026-10-13. French-language business directory lists cecina and describes it as being in the style of Yecapixtla; it also names `enchilada à la cecina`. Supports local market wording only. It does not establish protected status, product species/formula, or current inventory. |
| `WP04-SECTION-O-YECAPIXTLA-CECINA-20261013-R25-S03` | Marché Andes, [Carnicero](https://www.marcheandes.com/es/carniceria/), accessed 2026-10-13. Montréal retailer lists `Cecina mexicana` as thin beef slices that are salted and marinated. This listing does not name Yecapixtla or show that the product is the protected indication. |
| `WP04-SECTION-O-YECAPIXTLA-CECINA-20261013-R25-S04` | Larousse Cocina, [Cecina oaxaqueña](https://laroussecocina.mx/palabra/cecina-oaxaquena/), accessed 2026-10-13. Describes Oaxacan cecina as sliced, chile-marinated pork, commonly grilled, also called `cecina enchilada`; supports a separate regional product boundary, not a Québec French term. |
| Existing ledger source `WP06-CECINA-20261009-S09` (reused; not modified) | Office québécois de la langue française, [viande séchée — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544703/viande-sechee), updated 2018. Defines a broad dried-meat category covering multiple species and regional processes. It does not define cecina or support a cecina-specific alias. |

## Local evidence links

- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3553)
- [Peruvian Amazon cecina boundary review](wp06-cecina-boundary-review-20261009.md)
- [R23 Cuban tasajo boundary review](wp04-section-o-cuban-tasajo-picker-boundary-review-20261013-round23.md)
- [R24 pastirma/basturma boundary review](wp04-section-o-pastirma-basturma-product-boundary-review-20261013-round24.md)
- [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Legacy candidates](../legacy-import-identities.v1.json)
- [Picker implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)

## Coordinator decision

**Accepted as an unresolved ledger-only candidate.** The protected Yecapixtla product is recorded separately from local “Yecapixtla style” listings and from Peruvian Amazon and Oaxacan cecina. No active row or aliases were added because the bare `cecina` query would become regionally ambiguous. No forms, measurements, recipe links, conversions, yields, or substitutions were added.
