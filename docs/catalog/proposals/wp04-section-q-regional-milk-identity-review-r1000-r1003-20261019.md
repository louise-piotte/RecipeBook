# WP04 Section Q R1000–R1003: regionally used milk identities

## Review record

- **Reviewed and integrated:** 2026-10-19.
- **Selected gap:** Generic camel, yak, mare, and donkey milks, all absent from the active catalog.
- **Scope:** Four species-qualified fluid-milk identities. No brands, product lines, flavour families, commercial SKUs, or retailer variants were researched.

## Identity decisions

Add four identity-only references in `DAIRY_AND_ALTERNATIVE`:

| ID | English display | French display | Alias scope |
|---|---|---|---|
| `ingredient-ref-camel-milk` | camel milk | lait de chamelle | None |
| `ingredient-ref-yak-milk` | yak milk | lait de yak | None |
| `ingredient-ref-mare-milk` | mare milk | lait de jument | `mare's milk` (OQLF) and `horse milk` (FAO) |
| `ingredient-ref-donkey-milk` | donkey milk | lait d'ânesse | `ass's milk` (OQLF) |

FAO identifies camel milk as a human food, distinguishes dromedary and Bactrian camel sources, documents yak milk use in tea, and groups mare/horse and donkey milk as separate equine milks. Its French page supplies `lait de chamelle`, `lait de yak`, `lait de jument`, and `lait d'ânesse`. OQLF's 1983 GDT entries confirm `lait de jument / mare's milk` and `lait d'ânesse / ass's milk`. [Sources S01–S03 per record]

Keep camel milk limited to *Camelus* species; do not use it as an alias for alpaca, llama, or other camelid milk. Keep yak milk, mare milk, and donkey milk separate from other animal milks and from processed dairy. In particular, fermented mare-milk drinks such as koumis and fermented milk products discussed by FAO do not become forms under these fluid-milk identities.

The FAO pages include comparative composition values and species-specific consumption or processing descriptions. Those remain source context only; no composition values, processing claims, household measures, density, unit mappings, forms, conversions, yields, recipe links, or substitution rules were added. Measurement and substitution states remain `not_yet_researched`. No bundled recipe demand was found.

## Ownership and recipe-demand audit

Read-only scan before integration on 2026-10-19:

| Surface | Before | Finding |
|---|---:|---|
| Active ingredient references | 2,014 | No matching English/French phrase or reference ID. Existing cow, goat, sheep, water-buffalo, generic milk, and processed-milk rows remain separate. |
| Ingredient forms | 205 | No matching name, alias, or form ID. |
| Research ledger | 2,420 | No matching identity or phrase. |
| Legacy import identities | 55 | No matching identity or phrase. |
| Bundled recipe corpus | 114 files / 1,123 ingredient rows | No matching species-qualified phrase; no recipe link or demand-driven measure is proposed. |

Existing branded entries and all existing source-specific evidence were preserved. No commercial roster item was found in the reviewed open queue; any such roster-only item remains out of scope because commercial-product counts do not add ingredient diversity.

## Sources

| Source ID suffix | Source and locator | Scope |
|---|---|---|
| `S01` | FAO, [Camels](https://www.fao.org/dairy-production-products/dairy/camels/en), dairy use and camel species description; for yak, mare, and donkey records use FAO, [Milk composition](https://www.fao.org/dairy-production-products/products/milk-composition/en), the corresponding species entry and food-use statement. | Generic species food identity and the stated regional culinary context. Comparative composition, processing descriptions, and examples are not converted into catalog behavior. |
| `S02` | FAO, [La composition du lait](https://www.fao.org/dairy-production-products/products/milk-composition/fr), corresponding French species entry. | French display wording and the same generic human-food context. Does not attest household measures or interchangeability. |
| `S03` | OQLF GDT, [lait de jument](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298610/lait-de-jument) or [lait d'ânesse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18073959/lait-danesse), preferred term and English equivalent. | Québec-facing terminology only; no use, measure, or substitution claim is transferred from these entries. |

The active ledger uses a distinct source ID for each cited claim: two FAO sources each for R1000–R1003 and one OQLF source each for R1002–R1003 (10 IDs total).

## Disposition

Integrate the four generic milk identities with only the listed terminology aliases. Keep all numeric behavior and unresearched measurement/substitution states empty. Preserve nearby animal milks, camelid meat, fermented products, all branded entries, and their evidence without merging or transfer.
