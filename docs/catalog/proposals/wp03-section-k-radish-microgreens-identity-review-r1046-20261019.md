# WP03 Section K R1046 — radish microgreens identity review

- **Review date:** 2026-10-19
- **Status:** proposal only; no shared catalog JSON, ledger, plan, roadmap, recipe, or generated file changed
- **Recommendation:** add one identity-only generic reference for radish microgreens, the young aerial shoots of cultivated radish (*Raphanus sativus* L.) harvested as a microgreen crop.
- **Plan anchor:** Section K keeps “other regional greens and shoots discovered in the independent sweeps” open at [line 6728](../../RecipeBook-global-ingredient-catalog-plan.txt#L6728). This proposal covers one crop-part identity only and does not close the wider sweep.
- **Scope:** crop-qualified radish microgreens only. No brand, product line, flavour, SKU, retailer variant, or commercial roster was researched.

## Recommendation and boundary

Use **radish microgreens / micropousses de radis** for the young aerial seedling shoots of *Raphanus sativus* L. raised for microgreen harvest. The French wording is a descriptive crop compound: OQLF gives `micropousse` as the Québec French term for English `microgreen`, while Québec MAPAQ lists `radis` among crops grown as `pousses`. Virginia Cooperative Extension identifies radish (*R. sativus*) as a common microgreen crop and describes the harvested material as juvenile plant tissue cut with the stem.

The identity covers the crop-qualified shoot ingredient. Keep it separate from mature radish roots, daikon roots, radish leaves, water-grown germinations/sprouts, and other crop-specific shoots. Do not add broad aliases such as `microgreens`, `shoots`, `pousses`, or `germes`. The sources use somewhat different developmental cut points for microgreens; do not encode an exact cotyledon/true-leaf threshold. The plant-part boundary remains the young aerial shoot, not the mature storage root or a water-grown germination.

OQLF describes micropousses generally as culinary young shoots, usually grown in substrate, and distinguishes them from germinated seeds consumed before cotyledons develop. MAPAQ independently separates germinations from substrate- or fabric-grown pousses, names radish as a pousse crop, and describes cutting ready shoots at the stem base. Virginia Tech’s broader production guide uses a somewhat later true-leaf harvest definition and leaves roots behind for typical cut harvest, while noting that some markets sell shoots with substrate and roots attached. That packaging exception is not a reason to expand this ingredient to roots: no root is proposed as part of the identity.

## Minimal proposed data

If accepted, add one reference row only:

| Field | Proposed value |
| --- | --- |
| `id` | `ingredient-ref-radish-microgreens` |
| `nameEn` | `radish microgreens` |
| `nameFr` | `micropousses de radis` (descriptive fr-CA crop compound) |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` |
| `category` | `VEGETABLE_AND_AROMATIC` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

Add no form, measure, recipe link, conversion, yield, or substitution. If accepted, keep measurement and substitution research states `not_yet_researched`: the reviewed sources support identity and production context, not kitchen behavior.

## Live ownership and recipe-demand audit

Current live snapshot checked on 2026-10-19: **2,053 ingredient references, 205 forms, 55 legacy-import candidates, and 2,458 ledger records with 11,483 source entries and 9,643 distinct source IDs**. The bundled package has **114 recipes and 1,123 ingredient rows**.

Exact and case-folded phrase scans across active references, forms, legacy candidates, ledger identities/source text, and bundled recipe ingredients found no owner or demand for `radish microgreens`, `micropousses de radis`, or `Raphanus sativus` microgreens. The recipe scan also found no ingredient row containing `radish` or `radis`; no recipe link is proposed. No matching legacy candidate or prior focused R1046 proposal exists.

| Existing owner | Evidence/part boundary to preserve |
| --- | --- |
| `ingredient-ref-radish` — `radish / radis` | General culinary radish identity, supported by its existing OQLF ledger allocation `WP03J-S08`. Keep its root use and evidence unchanged. |
| `ingredient-ref-daikon` — `daikon / daïkon` | Named radish-root identity with its existing OQLF source allocation `WP03J-S09`; retain its root-qualified aliases. Do not move these aliases or measurements to a shoot identity. |
| `ingredient-ref-radish-leaves` — `radish leaves / fanes de radis` | Separate leaf-part identity with existing OQLF/Québec/Extension/recipe sources and a `frozen` form. Preserve the complete source set, its recipe-specific amount, and the frozen form; none transfers to young shoots. |
| `ingredient-ref-pea-shoots` — `pea shoots / pousses de pois` | Preserve the pea-specific shoot identity and its `pea microgreens` aliases. Do not make pea wording a radish alias. |
| `ingredient-ref-sunflower-shoots` — `sunflower shoots / pousses de tournesol` | Preserve the sunflower-specific identity and its `sunflower microgreens` aliases. Its MAPAQ/R970 source allocation is sunflower-specific and is not evidence about radish. |
| `ingredient-ref-alfalfa-sprouts`, `ingredient-ref-mung-bean-sprouts`, `ingredient-ref-soybean-sprouts` | Keep each species-specific water-grown germination identity distinct from substrate-grown microgreens. Preserve all existing CNF and Québec evidence. |

The Québec MAPAQ page is already cited by `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S23` on other records and by `WP03-K-SUNFLOWER-SHOOTS-R970-20261019-S01` on the sunflower-shoot record. The former supports a general cultivation-method distinction; the latter supports sunflower-specific claims. If this proposal is accepted, use a new radish-specific source record and locator rather than changing either existing source record or transferring their crop claims. The OQLF `micropousse` and Virginia Tech URLs have no current ledger source owner.

## Measures, substitutions, and evidence limits

No reviewed source or bundled recipe establishes a household amount, count-to-mass or volume-to-mass conversion, density, unit mapping, reusable yield, or substitution for radish microgreens. Virginia Tech’s production timings, crop trials, seed density, substrate details, and package dimensions describe its cited growing or handling contexts; they are not kitchen measurements or transferable ingredient measures. OQLF’s general culinary description supports naming and part classification, not a recipe-line amount or substitution. Keep all those data fields empty and measurement/substitution states `not_yet_researched`.

## Queue and commercial scope

The selected open Section K work is generic produce-part diversity. No roster-only item was found in this focused queue scan. The plan’s already-dispositioned Section F commercial cereal rosters and named Anson Mills wheat-meal lead remain **out of scope** because commercial-product counts do not add ingredient diversity. No commercial line was researched or pursued. Preserve every existing branded row and product-scoped source as-is; none is used here.

## Evidence register

These IDs are proposal-local and do not modify or pre-allocate ledger entries.

| Source ID | Source | Supported claim and limit |
| --- | --- | --- |
| `WP03-K-RADISH-MICROGREENS-R1046-20261019-S01` | Office québécois de la langue française, [GDT: *micropousse*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26558997/micropousse), updated 2021; accessed 2026-10-19. `sourceKind: regional_authority`. | Gives preferred French `micropousse` (also `pousse`) and English `microgreen`; defines the edible young stem/cotyledon portion, generally grown in substrate, and distinguishes it from germinated seeds consumed before cotyledons develop. It does not name radish or a radish-specific phrase. Its general raw-consumption wording is a terminology definition, not a food-safety instruction. |
| `WP03-K-RADISH-MICROGREENS-R1046-20261019-S02` | Gouvernement du Québec / MAPAQ, [*Culture des pousses et germinations*](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/agriculture-urbaine/quoi-planter/pousses-germinations), updated 2026-05-11; accessed 2026-10-19. `sourceKind: regional_authority`. | Separates water-grown germinations from substrate/fabric-grown pousses, lists radish among crops for pousses, and describes cutting ready shoots at the stem base. Supports Québec crop/part context and the descriptive French phrase; it does not provide a botanical species name, a kitchen amount, or a transferable growing protocol. Keep its earlier general and sunflower-specific source records unchanged. |
| `WP03-K-RADISH-MICROGREENS-R1046-20261019-S03` | Virginia Cooperative Extension, Kaylee A. South et al., [*Introduction to Microgreen Production in Indoor Vertical Farms and Greenhouses* (SPES-756NP)](https://www.pubs.ext.vt.edu/SPES/spes-756.html), published 2026-01-30; accessed 2026-10-19. `sourceKind: extension`. | Identifies radish (*Raphanus sativus*) as a common microgreen and describes microgreens as edible immature plants harvested with the stem. Its true-leaf threshold is one source’s definition; do not promote it as a universal cutoff because OQLF’s general note describes the usual stage differently. Crop timing, trials, package dimensions, and other production details remain source-specific and establish no kitchen measure. |

The sources support one narrow generic radish-shoot identity with a Québec French display grounded in OQLF terminology. Keep the exact harvest threshold open, preserve radish-root, daikon, radish-leaf, pea-shoot, sunflower-shoot, and sprout owners, and leave measurements and substitutions unresearched. This packet is proposal-only; no tests were run.
