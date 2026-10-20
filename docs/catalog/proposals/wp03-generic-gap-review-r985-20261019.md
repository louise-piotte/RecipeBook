# WP03 Section M generic regional-fruit gap review — caimito (R985)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes no shared catalog data, research ledger, legacy candidates, recipes, plan, roadmap, or tests.
- **Scope:** One generic culinary fruit identity. No brand, product-line, flavour, cultivar, SKU, or retailer-variant roster.
- **Plan anchor:** Section M leaves “sapote, baobab, and regional fruits from cuisine sweeps” open ([catalog plan, line 7043](../../RecipeBook-global-ingredient-catalog-plan.txt#L7043)). Caimito (*Chrysophyllum cainito* L.) is a distinct edible fruit not covered by the represented star fruit / carambole or sapote identities.

## Recommendation

Recommend adding one identity-only **caimito / caïmite** reference for the edible fruit of *Chrysophyllum cainito* L. Kew’s Plants of the World Online accepts the species and records the fruit names “star apple” and “caimito” and its edible use. Espace pour la vie’s Montréal Biodôme page pairs the French fruit names `caïmite` and `pomme de lait` with the same scientific name. UF/IFAS Extension independently gives the species, common English and French names, and describes the ripe fruit as eaten fresh. These sources support a generic fruit identity and a narrow bilingual naming set. [S01–S03]

Keep caimito separate from star fruit / carambole (*Averrhoa carambola*): `star apple` is a source-attested name for *C. cainito*, whereas `star fruit` and `fruit étoile` remain on the existing carambole identity. Keep caimito separate from the existing sapote and sapodilla identities; related family membership does not establish synonyms or interchangeable ingredients. Do not use bare `star`, `sapote`, or botanical-family wording as aliases.

The French display `caïmite` and alias `pomme de lait` are documented for the fruit by Espace pour la vie. This review does not assert that either term is OQLF-standardized. UF/IFAS’s French `caimitier` names the tree and is not proposed as a fruit alias.

## Proposed minimal state

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-caimito` |
| `nameEn` | `caimito` |
| `nameFr` | `caïmite` |
| `aliasesEn` | [`star apple`] |
| `aliasesFr` | [`pomme de lait`] |
| `category` | `FRUIT` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| `updatedAt` | `2026-10-19T00:00:00Z` |
| Forms / recipe links | None |

The proposed ledger identity state is `verified`; measurement state is `researched_no_supported_value`; substitution research state remains `not_yet_researched`. Keep `measurementObservations`, `substitutionFindings`, and active recipe links empty. No conversions, yields, forms, or active substitution are proposed.

## Ownership, neighboring identities, and demand

The live package snapshot contains **2,001 ingredient references**, **205 forms**, **2,406 research-ledger records**, and **55 legacy candidates**. Its manifest lists **114 recipe files** with **1,123 structured ingredient rows**.

| Surface | Finding |
|---|---|
| Active references and forms | No owner was found for `caimito`, `caïmite`, `star apple`, `pomme de lait`, `cainito`, or *Chrysophyllum cainito*. The proposed reference ID is unused. No caimito form exists. |
| Legacy candidates | No matching candidate or synonym was found. Do not promote or reuse a neighboring legacy fruit candidate. |
| Research ledger and source ownership | No record owns the candidate names or taxon. The three exact source URLs below have no current ledger owner, and all three proposal-local source IDs are unused. No existing source evidence is transferred. |
| Prior proposal and batch archive | No focused caimito, caïmite, star-apple, or *C. cainito* identity review was found. |
| Existing adjacent references | Preserve `ingredient-ref-star-fruit` (`star fruit / carambole`, with `carambola` and `fruit étoile` aliases), `ingredient-ref-mamey-sapote`, `ingredient-ref-black-sapote`, `ingredient-ref-white-sapote`, and `ingredient-ref-sapodilla` with their current evidence and boundaries. |

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for `caimito`, `caïmite`, `star apple`, `pomme de lait`, `cainito`, and *Chrysophyllum cainito*. The scan found **zero file hits and zero ingredient-row hits**. No recipe link or relink is proposed; this is a generic catalog-coverage gap, not a bundle-demand-driven addition.

Section M’s open item concerns regional fruit identity diversity. No roster-only task was needed for this review. Any brand-, product-line-, flavour-family-, SKU-, cultivar-roster-, or retailer-variant-only task is out of scope because **commercial-product counts do not add ingredient diversity**; stop that research line. No such roster research is pursued here. Preserve every existing branded row and keep its product-scoped evidence and measurements attached to its current product. The UF/IFAS guide includes some variety names, but this proposal does not extract or enumerate them.

## Evidence limits

The sources establish botanical identity, edible fruit use, and a bilingual naming basis. They do not establish current Québec retail availability, recipe demand, a household portion, fruit count-to-mass conversion, density, edible-portion yield, or a suitable substitute. Kew’s fruit-diameter description and UF/IFAS’s horticultural, nutritional, harvest, and ripening data remain source-scoped; none is proposed as a kitchen measure, universal freshness threshold, conversion, or preparation rule. UF/IFAS’s ripe-fruit handling note remains guidance from its Florida home-landscape source and is not encoded as a global form or measure.

Do not transfer any star-fruit evidence or measurements to caimito, and do not generalize fruit-specific claims from named commercial varieties or products. No existing branded entry, source record, measurement, or recipe is edited or merged.

## Sources

These IDs are proposal-local, unique, and not present in the live ledger.

| ID | Source | Claim supported and limits |
|---|---|---|
| `WP03-M-CAIMITO-R985-20261019-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Chrysophyllum cainito* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:304384-2/general-information) (`other`); accessed 2026-10-19. | Accepts *C. cainito* and, through cited floras, identifies its edible fruit as star apple or caimito. Botanical and broad food-use evidence; not a Québec market source, recipe, or measure. The cited fruit diameter is not used as a portion value. |
| `WP03-M-CAIMITO-R985-20261019-S02` | Espace pour la vie, Montréal Biodôme, [Caïmitier, caïnitier](https://m.espacepourlavie.ca/flore-biodome/caimitier-cainitier) (`other`); accessed 2026-10-19. | Names the plant *Chrysophyllum cainito* L. and its fruit `caïmite` or `pomme de lait`. Supports the French fruit wording and species association; it is not an OQLF terminology decision, recipe, measure, or retail listing. |
| `WP03-M-CAIMITO-R985-20261019-S03` | University of Florida IFAS Extension, [Caimito (Star Apple) Growing in the Florida Home Landscape](https://edis.ifas.ufl.edu/publication/HS309/pdf) (`extension`); accessed 2026-10-19. | Identifies *C. cainito*, gives `star apple` / `caimito` and French `caimite`, and describes fresh-fruit use. The guide's named varieties, horticultural conditions, harvest, nutrition, and fruit-size details remain source-scoped; no cultivar roster, kitchen amount, density, or generic conversion is proposed. |

## Disposition

Recommend one identity-only `FRUIT` reference for caimito / caïmite with the narrow aliases above. Preserve star fruit, sapote, sapodilla, all branded rows, and all currently owned evidence. No forms, measurements, conversions, yields, recipe links, or active substitutions are added. The broader Section M regional-fruit sweep remains open.
