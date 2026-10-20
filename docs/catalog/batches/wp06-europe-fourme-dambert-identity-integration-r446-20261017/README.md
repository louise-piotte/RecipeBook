# WP06 Europe R446 Fourme d’Ambert identity integration

Integrated on 2026-10-17 after root review of the [R446 proposal](../../proposals/wp06-europe-next-regional-identity-review-r446-20261017.md).

## Decision

Added identity-only `Fourme d’Ambert / Fourme d’Ambert` as `ingredient-ref-fourme-dambert-pdo` in `CHEESE`, with empty alias arrays. The European Commission’s in-force product document names Fourme d’Ambert as a French PDO in the cheese class; paired Mayrand Québec product pages use the protected name in French and English for one Président item. The paired retailer pages are one bilingual listing, not independent market observations. The bundle has no matching recipe demand. Kept generic blue cheese, Fourme de Montbrison, and other named blue cheeses separate. No forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added.

The catalog name follows the registered protected name in both languages. The PDO wheel dimensions and Mayrand’s item-specific package amount do not establish recipe measures or yields. The identity sources do not establish a supported substitute; substitution research remains not yet researched.

## Catalog and corpus

- Added one reference and one identity ledger record with seven source entries; ingredient forms and recipe files were not changed.
- The complete 114-recipe / 1,123-row corpus contains no Fourme d’Ambert match or linked recipe ID.
- Current totals after integration: **1,740 references**, **141 forms**, **2,099 research-ledger records**, and **9,540 source entries**.
- Static package normalization, ledger schema/ownership validation, and generated-index freshness checks passed. No app tests, build, emulator check, or deployment was run because this change only adds database JSON data under `AGENTS.md`.

## Sources reviewed

- [European Commission, Implementing Regulation (EU) No 1207/2013](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32013R1207), including the consolidated PDO single document.
- [Mayrand Québec French listing](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/fromage-bleu/fromage-bleu-fourme-dambert-meule-president-25148) and [English listing](https://mayrand.ca/en/our-products/cheese-and-dairy/cheese/blue-cheese/fromage-bleu-fourme-dambert-meule-president-25148) for the same Président item 25148.
- [OQLF GDT entry for pâte persillée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17699971/pate-persillee), which treats Fourme d’Ambert as an example within the broader blue-cheese family.

WP06 Europe remains open for its other regional identities.
