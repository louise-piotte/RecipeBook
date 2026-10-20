# WP02 / WP03 / WP04 round-seven gap-review integration

- Date: 2026-10-13.
- Scope: quinoa spelling, rolled-oat naming, and paired *Dissostichus* toothfish identities.
- The reviewers supplied proposal-only documents; root made the shared catalog and ledger changes.
- No app, unit, instrumentation, emulator, or application tests were run. These changes add database JSON data; static package, ledger, search-projection, and corpus checks were used.

## Integrated decisions

### WP02 A6: `quinua`

Added only `quinua` to the English aliases of the existing quinoa grain reference. TERMIUM Plus lists it as a standardized English synonym for *Chenopodium quinoa*. The French display remains `quinoa`; flour, brand, dry/cooked-form, measurement, and substitution data remain unchanged.

Sources: [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esr&lang=eng&srchtxt=KINUA), [OQLF GDT: quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa).

### WP03 Section F: old-fashioned rolled oats

Added `old-fashioned rolled oats` as an English alias on existing rolled oats. Kept `large flake oats` inactive because its `flake` token would make the broad picker query collapse from 24 results to one result. Added one AgroFusion 54 g per 1/2-cup product portion as ledger evidence only; default density stays null, mappings remain empty, and measurement research stays blocked. No French alias, form, recipe link, or substitution was added.

Sources: [Robin Hood Large Flake Oats](https://www.robinhood.ca/en/products/oats/large-flake), [Arva term pairing](https://arvaflourmills.com/blogs/recipes/arva-flour-mills-hot-cereal-cooking-instructions), [Québec Food Directory product record](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208540).

### WP04 Section P: Patagonian and Antarctic toothfish

Added separate identity-only rows for *Dissostichus eleginoides* (Patagonian toothfish / légine australe) and *D. mawsoni* (Antarctic toothfish / légine antarctique). Both have empty aliases, so generic `toothfish` and `légine` searches show both CFIA-listed species. Kept `Chilean sea bass`, `sea bass`, `bar de Patagonie`, and `bar du Chili` out of aliases because their market scope or broad picker effects are unsafe. Preserved the Montréal listing's minimum 280 g frozen *D. eleginoides* pavé only as a SKU-specific ledger observation; no species-wide measure was added.

Sources: [CFIA Fish List search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=Dissostichus), [Usito: légine](https://usito.usherbrooke.ca/d%C3%A9finitions/l%C3%A9gine), [Poissonnerie La Mer](https://www.lamer.ca/products/bar-de-patagonie-200-gr), [Pearlmark Foods](https://www.pearlmarkfoods.com/our-products/sea-bass-patagonian-toothfish).

## Static validation

Static checks cover bundled package validation and normalization state, generated ingredient-index freshness, research-ledger schema and ID uniqueness, focused phrase-first picker projections, the 114-file / 1,123-row recipe corpus, UTF-8 without BOM, and whitespace integrity. No app or emulator tests were run because this batch only adds database JSON data. A6, Section F, and Section P remain open.
