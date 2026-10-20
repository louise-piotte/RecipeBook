# WP05 Section T dill seed identity and ground form — 2026-10-12

- **Status:** Integrated as one ingredient reference and one form.
- **New identity:** `ingredient-ref-dill-seed`.
- **Display:** `dill seed / graines d’aneth`.
- **Alias:** `dill seeds`.
- **Form:** dry ground dill seed, displayed as `ground dill seed / graines d’aneth moulues`.

## Evidence and boundary

The OQLF-hosted GDT entry places `aneth` in the spice and seasoning domain and pairs it with English `dill seed`. The active catalog already assigns bare `aneth / dill` to the broader dill-herb identity, so the seed row keeps the Quebec retail wording `graines d’aneth` and does not claim bare `aneth`. The Canadian Food Compositional Standards define dill seed, whole or ground, as the dried fruit of *Anethum graveolens* or *Anethum sowa*. [OQLF, aneth (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3499921/aneth) · [CFIA, Canadian Food Compositional Standards, §6.1.17](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0)

Québec Provigo listings use the French product title `Graines d’aneth` for a whole seed spice and `graines d’aneth moulues` for a ground product. Its English listings use `Dill Seeds` and `Ground Dill Seed`. Package weights and product descriptions do not establish household measures or conversion factors. [Provigo Québec, President’s Choice dill seeds](https://www.provigo.ca/fr/graines-d-aneth/p/21117324_EA?icta=recommended-carousel) · [Provigo Québec, French ground dill-seed listing](https://www.provigo.ca/fr/alimentation/garde-manger/pices-et-assaisonnements/c/28188?page=14) · [Provigo Canada, English ground dill-seed listing](https://www.provigo.ca/en/food/pantry/spices-seasonings/c/28188?page=8)

The full 114-recipe bundle has no `dill seed` or `graines d’aneth` ingredient demand. Dill leaves remain on the existing broad herb reference. No density, unit mapping, measurement, recipe link, conversion, yield, or substitution was added.

## Validation

Bundled-package validation, reference normalization, generated-index freshness, ledger schema validation, exact-key ownership, recipe scan, UTF-8/no-BOM/escaped-Unicode, and scoped whitespace checks passed. The package now has 1,281 references, 96 forms, 114 recipes, and 1,123 ingredient rows; the ledger has 1,588 records. No app tests or emulator checks were run because the change adds database JSON data, consistent with `AGENTS.md`.
