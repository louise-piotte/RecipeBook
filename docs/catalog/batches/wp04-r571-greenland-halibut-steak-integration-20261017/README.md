# WP04 Section P R571 — Greenland-halibut steak form integration

Date: 2026-10-17

## Decision

Added `ingredient-form-greenland-halibut-steak` under the existing *Reinhardtius hippoglossoides* identity with the labels `Greenland halibut steak / darne de flétan du Groenland`. The form uses `steak_cut`, has empty match terms, and has null density. OceanTaste identifies frozen Greenland-halibut cross-cut steaks; Québec species and cut sources support the composed French label. No paired English/French product title verifies `darne` as the retailer's French wording.

The product-specific 400 g OceanTaste package, separate Walmart 400 g item, and separate T&T/Instacart 454 g listing remain source context only. None establishes a per-steak mass, count, reusable portion, density, conversion, or yield. The weaker Walmart and Instacart marketplace listings were kept out of the live form evidence.

The form ledger records no supported reusable measurement or substitution. No identity alias, recipe link, active conversion, yield, or substitution rule changed. Broad `halibut steak`, `darne de flétan`, and `darne` searches continue to return Atlantic, Pacific, and Greenland halibut; the exact species-qualified labels return Greenland halibut. The bundled corpus has no matching recipe demand.

## Sources

- [OceanTaste Greenland halibut steak](https://oceantaste.ca/products/halibut-steak-vp-400g): English product description, species, frozen state, cross-cut, and listing package amount.
- [Mange ton Saint-Laurent, flétan du Groenland](https://mangetonsaintlaurent.com/especes/fletan-du-groenland/): Québec species name and possible product cuts, including darnes; fillets are described as most common.
- Reused OQLF entries for [darne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne), [darne de flétan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298298/darne-de-fletan), and [flétan du Groenland](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland); the existing CFIA taxon source is reused from the Greenland-halibut identity record.

## Verification

- Static seed-package and research-ledger validation passed after integration.
- Picker projections confirmed exact qualified labels return Greenland halibut while broad cut queries remain multi-result; `fish steak` and `turbot` remain empty.
- UTF-8/no-BOM, local-link, source ownership, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.

The broader WP04 Section P finfish parent remains open. See the [R571 proposal](../../proposals/wp04-section-p-next-gap-review-r571-20261017.md).
