# WP02 Section E additive Québec French review — 2026-10-12

## Catalog decision

- Updated `ingredient-ref-acacia-gum` from `gomme d'acacia` to the OQLF-preferred food-additive name `gomme arabique`; retained `gomme d'acacia` and the CFIA-listed `gomme sénégal` as French aliases.
- Updated `ingredient-ref-sodium-carboxymethyl-cellulose` from `carboxyméthyl cellulose de sodium` to `carboxyméthylcellulose sodique`; retained both the former display and CFIA-listed spaced variant `carboxyméthyl cellulose sodique` as French aliases.
- Kept all English names and aliases, including `cellulose gum`, unchanged. The latter is a broad source synonym; OQLF cautions against using it as a literal French name. It has no exact phrase collision in the current catalog and should be reconsidered if more cellulose derivatives are added.
- The other 23 reviewed French displays remain unchanged. No recipe links, forms, density, unit mappings, conversions, substitutions, or numeric behavior changed.
- The parent permitted-additive inventory remains open. This was an independent Québec French review of the current 25 additive/hydrocolloid references, including the three pectin grade classes.

## Sources

- OQLF, [gomme arabique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086360/gomme-arabique): preferred Québec food-additive term and English equivalents.
- CFIA, [Tableau des synonymes autorisés pour les additifs alimentaires](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/additifs-alimentaires/synonymes-autorises): permitted Canadian common names and synonyms for acacia gum and sodium carboxymethyl cellulose.
- OQLF, [carboxyméthylcellulose (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086317/carboxymethylcellulose): preferred sodium-specific French term and note that `cellulose gum` is too broad for a literal translation.
- TERMIUM Plus, [sodium carboxymethylcellulose](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frw&lang=eng&srchtxt=CELLULOSE+GLYCOLATE+SODIUM): confirms the sodium-specific French term and English synonym.
- Chocolat-Chocolat, [gomme arabique / poudre d’acacia](https://www.chocolat-chocolat.com/fr/produit/gomme-arabique-poudre-dacacia-16oz/): Québec retail usage for gomme arabique.

The source records are attached to the two reference records in `docs/catalog/research-ledger.v1.json`. The former French displays remain searchable aliases rather than being deleted.

## Validation

- Package: 1,199 references, 86 forms, 114 recipes, 1,123 ingredient rows, and 66 legacy candidates.
- Ledger: 1,501 records, 5,066 source entries, 4,135 distinct source IDs, and 8 unit conversions.
- Reference/package normalization and validation, generated-index freshness, ledger validation, exact-key ownership, full recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds or updates database JSON data under `AGENTS.md`.
- SHA-256: references `f7311d15ffab705a74d47d1835467535722ae12e0c2f33b29d369c16cba2d1a5`; ledger `9e3ed46d91d445fe8ebb37928512973b3300e763644527d29fdcb3004e4a2d0c`.

The full 25-row review is in [`wp02-section-e-additive-quebec-french-review-20261012.md`](../../proposals/wp02-section-e-additive-quebec-french-review-20261012.md).
