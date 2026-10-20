# WP02 Section B polvilho azedo Québec retail alias integration — 2026-10-12

- **Status:** Integrated.
- **Source proposal:** [`wp02-next-section-b-residual-candidate-review-20261012.md`](../../proposals/wp02-next-section-b-residual-candidate-review-20261012.md).
- **Change:** Added only the French search alias `farine de polvilho azedo` to existing `ingredient-ref-brazil-polvilho-azedo`; recorded the local source and accepted alias decision in that identity's research-ledger record.

## Evidence and boundaries

Marché Brésil currently titles Amafil's product `Farine de Polvilho azedo premium 1 kg`. Its French description identifies manioc starch, and the retailer serves the Montréal region from Chambly, Québec. This supports the exact local retail wording as a search alias; it does not establish a preferred Québec display term. [Marché Brésil product listing](https://www.marchebresil.com/products/amafil-polvilho-azedo-premium-1kg)

Keep the French display `polvilho azedo` and English display `sour cassava starch (polvilho azedo)`. Keep `farine de manioc` on cassava flour, `fécule de manioc` on tapioca starch, and polvilho doce separate. The alias retains the named product qualifier. No form, measure, conversion, yield, recipe link, or substitution was added. Grupo PQ's 5 g teaspoon label remains source-specific evidence only. Measurement and substitution research remain `not_yet_researched`.

Picker review confirms `farine de polvilho azedo` resolves to the azedo identity; broad `polvilho` still returns the two distinct polvilho identities. `farine de manioc` remains on cassava flour and `fécule de manioc` remains on tapioca starch. The full 114-recipe / 1,123-row bundle has no matching recipe demand.

## Validation

The shared package snapshot contains 1,278 references and 94 forms. The references file SHA-256 is `a70f429bacc4135384d86a22060c61ab4c53fb7b017b34fb3c1bce356d34d837`; the ledger has 1,586 records and 5,636 source entries, with SHA-256 `6ae3850bdebeccc7654b1f0f7e9375ed942147bf102628c1e46565a5ca5709f2`.

`python3 tools/seed_package/normalize_bundled_seed_package.py` reported zero changed parts. The seed-package `--check` passed, and `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` confirmed the generated index is current at 1,278 references. No app tests or emulator checks were run because this change only added database JSON data.
