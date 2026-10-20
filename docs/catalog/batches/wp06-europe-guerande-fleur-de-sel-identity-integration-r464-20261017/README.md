# WP06 Europe R464 — Guérande fleur de sel identity

Recorded on 2026-10-17 after root review of the [R464 proposal](../../proposals/wp06-europe-next-regional-identity-review-r464-20261017.md).

## Decision

Added identity-only `Fleur de sel de Guérande / Fleur-de-Sel de Guérande` as `ingredient-ref-fleur-de-sel-guerande-igp`, with empty alias arrays and no density or unit mappings. The IGP names both bottom-harvested grey `Sel de Guérande` and surface-harvested fleur de sel; only the latter is allocated here. The generic `ingredient-ref-fleur-de-sel` remains separate.

The existing 10.3 g/tablespoon observation stays on generic fleur de sel and is scoped to the tested San Francisco Salt Co. product. No forms, measures, mappings, conversions, recipe links, yields, or substitutions were added. The bundle has no matching demand.

## Evidence reviewed

- INAO, [Sel de Guérande ou Fleur de sel de Guérande](https://www.inao.gouv.fr/produit/sel-de-guerande-ou-fleur-de-sel-de-guerande-21934): IGP identity, geographic area, and distinction between surface and bottom salt.
- Le Paludier, [Fleur de sel](https://www.lepaludier.com/fr-ca/node/54): Canada-facing producer page names Fleur de sel de Guérande and states that the product follows the IGP specification.
- La Maison du Rôti, Montréal, [Fleur de sel de Guérande](https://maisonduroti.com/products/fleur-de-sel-de-guerande): current Québec French retail wording and Montréal delivery/pickup; the page does not display an IGP mark.
- The Salt Cellar, [Fleur-de-Sel de Guerande, France](https://thesaltcellar.ca/products/fleur-de-sel): Canadian English-market wording; the page showed sold out and does not attest IGP status.
- Reused OQLF generic fleur de sel and UCANR measurement evidence from the existing generic record; neither source is duplicated or transferred to the new identity.

## Validation record

The current package contains 1,748 references and 141 forms. The ledger contains 2,107 records, 9,595 source entries, 8,142 distinct source IDs, and 6,855 distinct URLs. The manifest remains 114 recipes / 1,123 ingredient rows. Package normalization, generated-index freshness, ledger/source ownership, picker projection, corpus, encoding, and local-document checks passed. No app or Android tests were run because this change only adds database JSON data under `AGENTS.md`.

Europe-wide coverage remains open.
