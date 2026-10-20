# WP04 Section P Mrigal market-name group integration — R626 — 2026-10-18

## Accepted changes

Added identity-only `mrigal (name used for multiple fish species) / mrigal (nom utilisé pour plusieurs espèces de poissons)` as `ingredient-ref-mrigal-market-group`, category `PROTEIN`, with no aliases. CFIA's [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) assigns `Mrigal / Carpe` to both *Cirrhinus cirrhosus* (TSN 688892) and *Cirrhinus mrigala* (TSN 163679); the row names do not make the taxa synonymous or establish culinary interchangeability. FAO's [species fact sheet](https://www.fao.org/fishery/docs/DOCUMENT/aquaculture/CulturedSpecies/file/fr/fr_mrigalcarp.htm) supports French `Mrigal` for *C. mrigala*. OQLF's [carpe entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198858/carpe) uses Québec fish-market `carpe` for *Cyprinus carpio*, so `carpe` is excluded from this market group. Montréal retailer wording is retained only as local corroboration.

No species claim, aliases, forms, measurements, density, mappings, conversions, yields, recipe links, or substitutions were added. Measurement and substitution research are explicitly closed as no supported generic value or substitute; the bundle has no mrigal demand. The broader WP04 Section P checklist stays open.

## Files

- Added one active identity reference and one verified ledger record. Existing CFIA source IDs were reused where the URL and scope matched; new FAO, OQLF, and retailer evidence uses the R626 source prefix.
- Review proposal: [`wp04-section-p-mrigal-market-group-review-r626-20261018.md`](../../proposals/wp04-section-p-mrigal-market-group-review-r626-20261018.md).

## Validation

The full bundled seed package normalized and validated; the generated reference index was refreshed and is current; the research ledger schema and custom checks passed (2,198 records). The reference count is 1,827 and form count is 156. No app tests were required specifically for this database-JSON-only reference addition under the current `AGENTS.md` rule. The separate R627 parser change was verified with focused unit and emulator tests.
