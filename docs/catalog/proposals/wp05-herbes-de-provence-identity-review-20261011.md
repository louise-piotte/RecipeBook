# WP05 Section T — Herbes de Provence identity review

- **Review and source-access date:** 2026-10-11.
- **Status:** Integrated. Verified the existing `ingredient-ref-herbes-de-provence` identity and recorded its source evidence in the research ledger.
- **Catalog change:** No new reference or alias. The existing displays remain `herbes de Provence` in English and French.

## Identity and boundary

The INAO / Association interprofessionnelle pour les herbes de Provence specification describes the common commercial name as a dried aromatic-herb blend with freely varying composition. Its list of possible herbs is not a universal formula. Québec product listings independently use the name for dried-herb products with different SKU-specific compositions. This supports retaining the existing named blend identity without encoding a component list.

Keep generic Mediterranean herb mixtures, bouquet garni, and individual herbs distinct. Do not infer a fixed recipe, density, quantity, or substitution from one package. The existing category remains `BAKING_AND_SPICE`.

## Catalog and recipe audit

The active catalog has one matching reference, `ingredient-ref-herbes-de-provence`, with no aliases. The 114 manifest-listed recipes contain one direct line: recipe 105, “Pea Soup,” uses `Herbes de Provence, to taste` and already links to this reference. The identity review preserves that link and does not change recipe data. No forms, measurements, unit mappings, conversions, yields, or substitutions were added.

## Source register

All sources were accessed on 2026-10-11. Their full entries and source IDs are recorded on the existing ledger record.

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP05-HERBES-PROVENCE-20261011-S01` | INAO / AIHP, [Label Rouge specifications for Herbes de Provence](https://extranet.inao.gouv.fr/fichier/CDCPNOLA0203.pdf), general presentation, p. 3. | Describes the common commercial name as a dried aromatic-herb mixture with freely varying composition. The listed components are possibilities, not a universal blend formula. |
| `WP05-HERBES-PROVENCE-20261011-S02` | Québec Répertoire des aliments québécois, [Dion Herbes de Provence Biologiques](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207170). | Confirms Québec French market use and one product’s declared ingredients; the SKU formula is not generalized. |
| `WP05-HERBES-PROVENCE-20261011-S03` | Super C, [Mélange d’herbes de Provence Irrésistible](https://www.superc.ca/allees/garde-manger/fines-herbes-epices-et-sauces/melanges-de-fines-herbes-et-d-epices/melange-d-herbes-de-provence/p/059749961189). | Confirms Québec retail wording and a different SKU-specific ingredient list, not a generic composition. |

The existing recipe link remains unchanged. No tests or emulator were run for this database-JSON-only update; structural validation is recorded in the [integration README](../batches/wp05-section-t-spice-blends-identity-integration-20261011/README.md).

**Encoding:** UTF-8 without BOM.
