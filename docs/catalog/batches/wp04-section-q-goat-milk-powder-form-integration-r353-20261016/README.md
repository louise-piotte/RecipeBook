# WP04 Section Q R353 — whole goat milk powder form integration

## Integrated data

Added `ingredient-form-whole-goat-milk-powder` under the existing `ingredient-ref-goat-milk`:

- English label: `whole goat milk powder`
- Québec French label: `lait de chèvre entier en poudre`
- English match terms: `powdered whole goat milk`, `dried whole goat milk`
- French match terms: none; the French search phrase stays with the directly attested label
- `formCode` / `prepState`: `powdered`
- Density: none

Federal regulation separately names goat milk powder and skimmed or partly skimmed goat milk powder. The active form therefore represents only explicitly whole goat milk powder. The fluid goat-milk identity, goat-milk products, and powder forms of other animal milks remain separate.

## Evidence and limits

- The current English [Food and Drug Regulations, B.08.029](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.08.029.html) names goat milk powder and separately names skimmed and partly skimmed goat milk powder in its vitamin provisions. The French text uses `lait de chèvre en poudre`, `lait de chèvre partiellement écrémé en poudre`, and `lait de chèvre écrémé en poudre`. Its 100 mL ready-to-serve basis is not a powder reconstitution quantity.
- Canadian manufacturer [CAPRISS](https://www.capriss.ca/WholeGoatMilkPowder) calls the product `Whole Goat Milk Powder`; Canada Royal Milk’s [brand page](https://www.canadaroyalmilk.com/our-brands) independently uses that product class.
- The Canadian French product listing [CAPRISS Lait de chèvre entier en poudre](https://supportontariomade.ca/fr/explore-products/capriss-whole-goat-milk-powder) directly supports the French display. OQLF entries for [lait de chèvre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073045/lait-de-chevre) and [lait entier en poudre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9473357/lait-entier-en-poudre) support the species term and broader whole-powder terminology; they do not provide a goat-specific whole-powder synonym.
- CFIA’s [dairy labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy) says standards for milk in CFCS Sections 7.1.1–7.1.20 do not apply to non-cow milk and that dairy from another animal source must identify the source. Cow-milk powder percentages are not transferred to goat milk.
- Québec’s [caprine dairy reporting form](https://cdn-contenu.quebec.ca/cdn-contenu/adm/org/rmaaq/publications-adm/formulaires/entreprises-laitieres/FO_Rapport-produits-laitiers-caprins_RMAAQ.pdf), marked `MOD. 02-2004`, lists `Poudre de lait` as a caprine product and inventory category. It does not establish current production or a product formula.

Happy Days Dairy’s English human-food page says its product is spray-dried whole goat milk, gives 4 Tbsp powder with 1 cup warm water, and states 1 kg makes 8 L. The French human-food page gives 3 tablespoons with 1 cup water and also says 1 kg makes 8 L. The tablespoon amounts conflict, so both pages are recorded in ledger source notes only. No preparation direction is an active conversion, reusable measure, density, package yield, or substitution.

## Picker projection and recipe demand

| Query | Result after R353 |
|---|---|
| `whole goat milk powder`, `powdered whole goat milk`, `dried whole goat milk` | Goat milk row with the whole-powder form hint |
| `lait de chèvre entier en poudre` | Goat milk row with the whole-powder form hint |
| `goat milk powder` | Goat milk row, no form hint; no exact generic term was added |
| `milk powder` | Existing milk and skim-milk rows plus goat milk; no form hint |
| `poudre de lait` | Existing milk and skim-milk rows; no goat result from the new form |
| `lait de chèvre en poudre`, `poudre de lait de chèvre` | No result from the new form; these unqualified/reordered phrases are not exact terms |
| `goat milk`, `lait de chèvre` | Existing goat-milk row, unchanged |

The bundle contains 114 manifest-listed recipes and 1,123 ingredient rows. No goat-milk-powder or broader goat-milk ingredient line matched. No recipe link, amount, measure, or substitution was added.

## Validation

- Bundled seed-package normalization and validation passed; the package now contains 1,691 references and 134 forms.
- The generated reference index remains current at 1,691 references.
- Research ledger JSON schema and source-reference validation passed; the ledger now has 2,042 records.
- Static picker projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed.
- No software tests, build, emulator check, or deployment was run because this change only adds database JSON data under the updated `AGENTS.md` rule.
