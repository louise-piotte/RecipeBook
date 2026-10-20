# WP03 Section U R330 — Mahlab identity and retail forms

Reviewed and integrated on 2026-10-16.

Added `mahlab / mahlab` in `BAKING_AND_SPICE` for the aromatic culinary kernel from *Prunus mahaleb*. English aliases are `mahleb` and `mahlepi`. The proposal also suggested bare `mahaleb`; integration omits it because the OQLF GDT defines `mahaleb` as the wild cherry tree in arboriculture. The picker has no tree-versus-spice context. Tree names, fruit, wood, oils, extracts, and non-food products stay outside the ingredient identity.

Added separate dry retail forms `mahlab seeds / mahlab en grains` and `mahlab powder / mahlab en poudre`, with source-attested French match term `mahlab moulu` for the powdered form. These labels are Montréal retailer wording. Whole kernels and powder are not treated as numerically interchangeable. No measure, density, unit mapping, form conversion, yield, recipe link, or active substitution was added. The Canadian retailer's approximate half-teaspoon-per-500-g-flour suggestion remains seller guidance, not a standardized recipe amount. The bundled recipe corpus has no matching row.

Key evidence includes [Kew's accepted taxon entry](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:729931-1/general-information), the [University of Reading Herbarium's culinary account](https://research.reading.ac.uk/herbarium/2020/12/04/adventbotany-day-4-mahleb-prunus-mahaleb-l/), Montréal labels for [Mahlab en grains](https://www.epicesanatol.com/fr/epices/mahlab-grains/) and [Mahlab en poudre](https://www.epicesanatol.com/fr/epices/mahlab-poudre/), its [French spice-blend ingredient list](https://www.epicesanatol.com/fr/epices/epice-shish-taouk/), the [Canadian whole-kernel listing](https://ameenfoods.ca/products/mahlab-seeds-100g), and the [OQLF GDT entry for the tree](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17033249/mahaleb).

The [R330 proposal](../../proposals/wp03-section-u-next-regional-aromatic-review-r330-20261016.md) contains the ownership, demand, picker, and source-boundary review. It proposed `mahaleb` as an alias; the root integration excludes that bare form for the OQLF tree collision described above.

Static seed-package validation and normalization, ingredient-reference normalization, generated-index freshness, and research-ledger schema/semantic validation passed. Picker projection returned only `ingredient-ref-mahlab` for `mahlab`, `mahleb`, `mahlepi`, `Mahlab seeds`, `Mahlab en grains`, `Mahlab powder`, `Mahlab en poudre`, and `mahlab moulu`; form hints appeared only for the four form-qualified phrases. No matching row appeared in the 114-recipe / 1,123-ingredient-row bundled corpus. UTF-8/no-BOM and escaped-Unicode checks, local links, and whitespace checks passed. No software tests, builds, emulator checks, or deployment were run because this change only adds database JSON data and catalog documentation under `AGENTS.md`.

Section U's regional-aromatics checklist remains open.
