# WP05 Section V — beer, cider, and fortified-wine boundary review

- **Date:** 2026-10-12
- **Status:** reviewed boundary subtask; no catalog or recipe data changed.
- **Scope:** beer and named beer styles; alcoholic cider and cider subtypes; sherry, port, Madeira,
  Marsala, and vermouth. Plain wine and cooking-wine boundaries remain covered by their earlier
  Section V reviews.

## Decision

Treat generic beer and alcoholic cider as potential ingredient identities, with source-named beer
styles and regulated cider products kept distinct when an exact recipe or imported product calls
for them. Keep sherry, port, Madeira, and Marsala scoped to their named products and origins; do not
map similarly styled products to protected-origin names. Keep vermouth separate from plain wine and
from any generic fortified- or aromatized-wine umbrella.

No bundled ingredient row names these candidates, so their activation remains held. The recipe audit
covered all 114 bundled recipes and 1,123 ingredient rows. Current corpus SHA-256:
`dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`.

The OQLF distinguishes alcoholic `cidre / cider` from the unfermented US `apple cider` use and lists
`hard cider` for the alcoholic US term. It also defines `cidre de glace / ice cider` separately and
notes that Québec regulation uses `ice cider`; keep that phrase out of a general cider alias set.
CFIA/ACIA separately defines cider, Champagne cider, beer, vermouth, and other alcoholic-beverage
classes. These compositional and labeling rules establish product boundaries; they do not support
recipe amounts, ingredient conversions, cooking retention factors, or substitutions. OQLF likewise
keeps `porto / port` distinct from `vin de type porto / port-style wine`. The protected-origin sources
keep Jerez-Xérès-Sherry, Douro Port, Madeira, and Marsala bounded to their respective regional
products.

No catalog identities, aliases, forms, measures, conversions, yields, recipe links, alcohol-retention
assumptions, or substitutions were added or changed. Existing apple-cider vinegar and sherry vinegar
remain vinegars; substring search hits are not identity equivalences. The broader Section V item
remains open.

## Current package snapshot

- 1,190 ingredient references / 85 forms / 114 recipes / 1,123 ingredient rows.
- 66 legacy candidates.
- 1,490 research-ledger records / 4,968 source entries / 4,054 distinct source IDs / 8 unit
  conversions.
- Recipe corpus digest remains the value above; current reference, form, legacy, and ledger counts
  include subsequent Thai-paste and spirit integrations that were absent from the proposal's earlier
  snapshot.

## Sources

- The reviewed source packet contains the full source table and claim limits: [beer, cider, and
  fortified-wine research proposal](../../proposals/wp05-section-v-beer-cider-fortified-wine-review-20261012.md).
- CFIA/ACIA, [Canadian Food Compositional Standards — Alcoholic Beverages (FR)](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), §§2.7–2.9.
- OQLF, [cidre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17039582/cidre), [cidre de glace](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354228/cidre-de-glace), and [porto](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353301/porto).
- Sherry Wines Consejo Regulador, [The Consejo Regulador](https://www.sherry.wine/sherry-region/consejo-regulador); IVBAM, [Vinho Madeira](https://ivbam.madeira.gov.pt/); European Commission, [Marsala PDO specification](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX:52026XC05127).

This was a documentation-only review. No tests or emulator checks were run because no code or
database data changed in this batch.
