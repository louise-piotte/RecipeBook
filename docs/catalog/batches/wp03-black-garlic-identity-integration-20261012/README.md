# WP03 Section J black-garlic identity integration — 2026-10-12

- **Status:** Integrated.
- **Source proposal:** [`wp03-section-j-black-garlic-identity-boundary-review-20261012.md`](../../proposals/wp03-section-j-black-garlic-identity-boundary-review-20261012.md).
- **Change:** Added identity-only `black garlic / ail noir` as `VEGETABLE_AND_AROMATIC`, with no aliases, density, or unit mappings. Added its five-source identity record to the research ledger.

## Evidence and boundaries

OQLF directly pairs preferred Québec French `ail noir` with English `black garlic` and defines the ingredient through the Maillard reaction. Québec producers list bulbs separately from paste, powder, and salt; Mayrand lists a local 100 g bulb product. These sources support the base identity and product boundaries, not transferable measures or a universal process. [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544773/ail-noir) · [BALSAÏ](https://www.balsai.ca/produits/) · [Mayrand](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/ail/ail-noir-biologique-bulbe-balsai-27580)

Keep ordinary garlic, garlic powder, garlic salt, garlic scapes, black-garlic paste/powder/salt, and other composites separate. No alias, form, measure, conversion, yield, recipe link, or substitution was added. Measurement and substitution research remain `not_yet_researched`.

Static picker review showed exact `black garlic` and `ail noir` searches each return the new row alone; broader `garlic` and `ail` searches remain multi-result, and plain `garlic cloves` remains assigned to ordinary garlic. A full scan of 114 bundled recipes / 1,123 ingredient rows found no black-garlic demand.

## Validation

After the black-garlic identity and the separate polvilho alias reconciliation, the shared package snapshot contains 1,278 references and 94 forms. The references file SHA-256 is `a70f429bacc4135384d86a22060c61ab4c53fb7b017b34fb3c1bce356d34d837`; the ledger has 1,586 records and 5,636 source entries, with SHA-256 `6ae3850bdebeccc7654b1f0f7e9375ed942147bf102628c1e46565a5ca5709f2`.

`python3 tools/seed_package/normalize_bundled_seed_package.py` reported zero changed parts. The seed-package `--check` passed, and `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` confirmed the generated index is current at 1,278 references. No app tests or emulator checks were run because this change only added database JSON data.
