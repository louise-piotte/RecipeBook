# WP04 Proposal: Seitan and Textured Vegetable Protein Boundaries

**Review date:** 2026-10-11
**Status:** Coordinator-reviewed and integrated as identity-only seitan and generic textured vegetable protein. The bundled recipes contain no matching ingredient rows; the shared catalog, ledger, checklist, and verification record are in `docs/catalog/batches/wp02-wp03-wp04-residual-identities-integration-20261011/README.md`.

## Scope and disposition

This review follows the open WP04 Section R item for seitan and textured vegetable protein (TVP). The earlier protein/dairy inventory listed seitan, textured vegetable protein (PVT), and textured soy protein (PST) as candidates, but did not complete a focused recipe-demand and product-boundary review. The current bundled catalog now contains tempeh and vital wheat gluten, so both are checked as neighboring identities.

The Office québécois de la langue française (OQLF) supports two separate food identities:

| Suggested stable ID | Category | English display | Québec French display | Source-backed search terms | Scope |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-seitan` | `PROTEIN` | `seitan` | `seitan` | EN: `wheat meat` is listed by OQLF; no extra French alias | Wheat gluten cooked in seasoned broth as a fibrous food product. Keep distinct from vital wheat gluten as an industrial gluten ingredient. |
| `ingredient-ref-textured-vegetable-protein` | `PROTEIN` | `textured vegetable protein` | `protéine végétale texturée` | EN: `TVP`, `texturized vegetable protein`, `texturised vegetable protein`; FR: `PVT` | A generic extruded, dehydrated plant-protein product family that can be made from soy, wheat, pea, corn, or other plant inputs. |

The proposed displays and aliases are terminology candidates only; no IDs have been allocated and no catalog records are changed. OQLF defines textured soy protein / protéine de soya texturée (PST) as the narrower soybean-based class. Do not attach `textured soy protein`, `TSP`, `protéine de soya texturée`, or `PST` as aliases to a generic TVP identity. Hold a separate PST identity until a recipe or product-level requirement needs it. [S01–S03]

## Live catalog and recipe demand

The current seed has two relevant records:

| Existing record | Current state | Boundary to preserve |
| --- | --- | --- |
| `ingredient-ref-vital-wheat-gluten` | `vital wheat gluten` / `gluten de froment élastique`; category `GRAIN_AND_CEREAL`; English aliases `gluten flour`, French aliases `gluten de blé vital` and `farine de gluten`; no density or unit mappings | OQLF describes an industrial wheat-gluten product that exhibits agglomerating and elastic properties when hydrated or rehydrated. This is not the OQLF-defined seitan food cooked in seasoned broth. Do not add `seitan` or `wheat meat` to this record. [S04] |
| `ingredient-ref-tempeh` | `tempeh` / `tempeh`; category `PROTEIN`; no aliases, density, or unit mappings | OQLF defines tempeh as cooked and fermented soybeans, or less commonly other legumes or cereals, bound into a firm mass by *Rhizopus*. That fermentation product is distinct from extruded, dehydrated TVP and cooked wheat-gluten seitan. [S05] |

The fixed category list has no dedicated plant-protein category; `PROTEIN` is the existing category used for the integrated tempeh identity and fits these two proposed food products. The legacy identity file has no exact seitan, TVP/PVT, or PST candidate. No prior focused seitan/TVP proposal was found; the earlier broad plant-protein inventory remains the only prior candidate list.

I scanned all **114 manifest-listed recipe files and 1,123 ingredient rows**. There are zero ingredient-row or recipe-text matches for seitan, TVP/PVT, textured soy protein/PST, vital wheat gluten, or simulated meat/poultry. Recipe 095, *Satay*, mentions tempeh in its English and French notes, but has no tempeh ingredient row or tempeh amount. Leave that local note and its pork line unchanged; it supplies no amount or general substitution evidence.

## Product boundaries

### Seitan and vital wheat gluten

OQLF defines seitan as a high-protein, fibrous food made with wheat gluten cooked in seasoned broth; it lists English `seitan` and `wheat meat`. Its separate vital-wheat-gluten entry describes industrial wheat gluten by its behavior when hydrated or rehydrated. The source descriptions support separate product identities and do not support a synonym, recipe-line relink, gluten-to-seitan yield, or amount conversion. [S01, S04]

### Textured vegetable protein and soy-specific textured protein

OQLF defines TVP/PVT as plant material transformed by extrusion into a dried substance with varied textures and shapes. Soy residue is its most common input, while wheat, pea, and corn are also named. The entry describes flakes, pieces, strips, and balls; it is often rehydrated before use as a meat substitute or extender, but can also be used dry for texture. These are source-described product variants and uses, not approved ingredient forms or a universal recipe behavior. [S02]

The OQLF defines textured soy protein/PST as a textured vegetable protein made from soybeans. It is therefore a narrower substrate-specific identity, not a synonym suitable for every TVP product. No exact soy-textured-protein demand occurs in the bundle, so this proposal holds a separate PST row for now and keeps the term out of generic TVP aliases. [S02, S03]

### Tempeh and formulated meat substitutes

Tempeh is a cooked, fermented, *Rhizopus*-bound product. TVP is made through extrusion and is dehydrated; seitan is wheat gluten cooked in seasoned broth. Similar uses as plant-based protein foods do not make these products synonyms or interchangeable measures. [S01, S02, S05]

CFIA treats simulated meat and poultry as a separate product-level class. A food falls within that definition when it contains no meat, poultry, or fish product and has the appearance of a meat or poultry product, including through sensory traits or how it is represented. The guidance requires a corresponding simulated common name and applicable declarations. It also distinguishes foods that do not meet that definition, giving a tempeh patty as an example when it is not represented as resembling meat or poultry. Thus, seitan or TVP is not automatically a formulated simulated meat product; a formulated burger, sausage, or other meat analogue is not automatically TVP or seitan. Keep such formulations product-specific and do not alias them to these ingredient identities. [S06]

## Recommendation

1. Accept the two identity candidates above if WP04 integrates this bounded tranche: `seitan / seitan` and `textured vegetable protein / protéine végétale texturée`, both under `PROTEIN`.
2. Preserve OQLF's `wheat meat`, `TVP`, spelling variants, and `PVT` only as the narrow search aliases listed above. Do not equate seitan with vital wheat gluten, generic TVP with soy-specific PST, or either ingredient with a formulated simulated meat product.
3. Keep tempeh as its existing separate identity. Keep PST, soy curls, mycoprotein, natto, tofu variants, and formulated mince/sausage coverage open for their own source and demand reviews.
4. Add no forms, measures, conversions, density, package or cooking yields, recipe links, quantity changes, or substitutions. The recipe scan provides no ingredient demand, and none of the reviewed sources gives a RecipeBook-specific amount or reusable conversion.

## Source register

Sources were accessed on **2026-10-11**. Source IDs below use a new prefix; they are not shared-ledger entries.

| Source ID | Official source and locator | Claim supported and limits |
| --- | --- | --- |
| `WP04-SEITAN-TVP-20261011-S01` | OQLF, [seitan, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369808/seitan), food domain; updated 2025. | Defines the product as wheat gluten cooked in seasoned broth; preferred French term `seitan`; English terms `seitan` and `wheat meat`. Does not support a recipe measure, yield, or meat-substitution ratio. |
| `WP04-SEITAN-TVP-20261011-S02` | OQLF, [protéine végétale texturée, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086121/proteine-vegetale-texturee), food and nutrition domains; updated 2025. | Defines generic TVP/PVT as extruded, dehydrated plant protein; names soy, wheat, pea, and corn inputs and several shapes and uses. Separates the generic class from soy-specific textured protein. Does not standardize formulation, hydration ratio, measure, or recipe performance. |
| `WP04-SEITAN-TVP-20261011-S03` | OQLF, [protéine de soya texturée, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26560132/proteine-de-soya-texturee), food and nutrition domains; updated 2025. | Defines textured soy protein/PST as textured vegetable protein made from soybeans and supplies French/English terms. Supports the substrate-specific boundary only; no separate recipe requirement was found. |
| `WP04-SEITAN-TVP-20261011-S04` | OQLF, [gluten de froment élastique, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084319/gluten-de-froment-elastique), processed-cereal domain; updated 1990. | Pairs `gluten de froment élastique` with `vital wheat gluten` and describes industrial wheat gluten that shows agglomerating and elastic properties when hydrated or rehydrated. It is not the cooked seitan product in S01. |
| `WP04-SEITAN-TVP-20261011-S05` | OQLF, [tempeh, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17049860/tempeh), food domain; updated 2025. | Defines the cooked, fermented, *Rhizopus*-bound product and pairs French and English `tempeh`. Supports the process boundary from TVP and seitan; adds no measure or substitution. |
| `WP04-SEITAN-TVP-20261011-S06` | CFIA, [Simulated meat and simulated poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/simulated-products), regulatory guidance; modified 2024-03-18. | Summarizes the FDR product definition and common-name/label requirements, and distinguishes foods outside the definition, including its example of a non-represented tempeh patty. Product classification depends on composition, appearance, and representation; it is not an ingredient synonym rule. |

No tests were run because this is a proposal-only review. No source or data record was added to the shared ledger.
