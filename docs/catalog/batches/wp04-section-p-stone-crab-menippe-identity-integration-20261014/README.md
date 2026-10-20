# WP04 Section P — stone crab identity integration

Reviewed and integrated 2026-10-14. The broader Section P seafood sweep remains open.

## Decision

Added identity-only **stone crab / crabe caillou** for the CFIA-listed *Menippe* spp. market group.
CFIA also assigns the same bilingual names to *M. mercenaria*; Florida's current fishery page
groups *M. mercenaria* and *M. adina* under stone crab. The catalog row therefore represents the
bounded market group and does not identify every product as *M. mercenaria*.

The row retains `crabe de pierre` only as a search alias documented on Metro Québec's same-SKU
French and English listings. Metro gives no scientific name, so the alias is not a taxonomic or
OQLF terminology claim. Keep OQLF's **crabe épineux / Northern stone crab** (*Lithodes maia*)
separate.

No forms, measures, mappings, conversions, yields, recipe links, or substitutions were added. The
114-recipe / 1,123-ingredient-row corpus has no stone-crab demand. The existing jumbo-lump crab-meat
recipe line remains linked to `ingredient-ref-crab` and its crab-meat form.

## Integration and static review

- Added `ingredient-ref-stone-crab` with an empty English alias list and French alias `crabe de
  pierre`.
- Added one accepted research-ledger record with seven sources and no measurement observations or
  substitution findings.
- Updated the Section P checklist, roadmap, and reviewed proposal; refreshed the generated catalog.
- After integration: 1,436 references, 105 forms, and 1,776 research-ledger records.
- Package normalization/validation, reference normalization, ledger-schema validation,
  generated-index freshness, source ownership, picker projection, recipe scan, encoding, local
  links, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database
  JSON data and its generated catalog index.

See the detailed [review proposal](../../proposals/wp04-section-p-stone-crab-menippe-identity-review-r99-20261014.md).

## Sources

- CFIA's [Fish List crab query](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab)
  assigns `Stone crab / Crabe caillou` to *M. mercenaria* and *Menippe* spp., and distinguishes
  *Lithodes* / `crabe épineux`. CFIA's [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names)
  explains the Fish List's role in Canadian fish labeling.
- OQLF's [crabe épineux entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198939/crabe-epineux)
  pairs `crabe épineux` with Northern stone crab and *Lithodes maia*.
- Metro lists [Pinces de crabe de pierre cuites surgelées](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/pinces-de-crabe-de-pierre-cuites-surgelees/p/058973933757)
  in French and [Frozen Cooked Stone Crab Claws](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cooked-stone-crab-claws/p/058973933757)
  in English under product number 058973933757.
- Canadian supplier [Seafood Depot](https://www.seafooddepot.ca/product-stonecrab) identifies its
  stone-crab product as *M. mercenaria*. Florida's Fish and Wildlife Conservation Commission names
  [*M. mercenaria* or *M. adina*](https://myfwc.com/fishing/saltwater/commercial/stone-crab/) under
  its stone-crab fishery page.
