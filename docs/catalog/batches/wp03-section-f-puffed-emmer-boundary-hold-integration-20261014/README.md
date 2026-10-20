# WP03 Section F plain puffed-emmer boundary hold (R92)

Proposal reviewed and documentation-only hold integrated 2026-10-14. Section F remains open.

## Decision

Keep plain puffed emmer (*Triticum dicoccum*) outside active references and the research ledger until
a Canadian or Québec product or terminology source establishes a suitable French name for a
standalone product. No reference, alias, candidate record, form, measurement, conversion, yield,
recipe link, or substitution was added.

Prometeo documents a single-ingredient Italian product, *farro dicocco soffiato bio*, and a primary
grain-puffing study treats emmer as a distinct processed cereal. These sources establish product
identity, not a Canadian/Québec name. OQLF and federal procurement sources support the base grain
names *amidonnier* / *blé amidonnier*; they do not name puffed emmer. A Canadian-route 400 g listing
is a five-grain mix containing emmer, not a standalone emmer product or emmer measure. A French
phrase, *blé amidonnier soufflé*, appears only as a component of a Belgian composite bakery mix.
Neither source establishes a Québec retail title.

Keep the candidate separate from puffed einkorn, puffed wheat, puffed spelt, puffed Khorasan, emmer
grain, and emmer flour. Do not activate generic *farro* or the Italian product wording as aliases.

## Picker and recipe review

The current picker returns no result for `puffed emmer`, `puffed emmer wheat`, `emmer puffs`,
`farro dicocco soffiato`, or `blé amidonnier soufflé`. The existing emmer-grain row owns `emmer wheat`
and `blé amidonnier`; `emmer` returns the grain and flour rows; `puffed wheat` and `blé soufflé`
remain specific to puffed wheat; generic `farro` remains inactive.

All 114 manifest-listed recipes and 1,123 ingredient rows were rescanned. No candidate phrase or
related product link was found.

No reviewed source gives a household measure for plain puffed emmer. The 400 g amount belongs to the
five-grain mix. Puffed-wheat portion data does not transfer to emmer, and the puffing study does not
provide a volume-to-mass mapping or raw-to-puffed yield. Use descriptions do not support a reusable
substitution ratio.

## Integration and validation

- Added a checked review item under the still-open Section F grain checklist, plus this batch record
  and the roadmap entry.
- Rechecked the candidate against the current 1,424-reference catalog, 104 forms, 63 legacy-import
  candidates, and 1,763-record ledger. No exact active reference, form, legacy owner, or ledger
  record was allocated for puffed emmer. Existing grain and flour ownership remains unchanged.
- Reproduced phrase-first picker results and rescanned the 114 recipes / 1,123 ingredient rows.
  Package, ledger, normalization, and generated-index files were not changed for this hold.
- UTF-8/no-BOM, working local links, and scoped whitespace checks passed. No app, Gradle,
  instrumentation, or emulator tests were run because this documentation-only hold changed no
  database JSON or application code.

See the detailed [R92 review](../../proposals/wp03-section-f-puffed-emmer-identity-boundary-hold-20261014-r92.md).

## Main sources

- [Prometeo — Farro dicocco soffiato bio](https://shop.prometeofarro.it/collections/prodotti-di-farro-prometeo/products/farro-soffiato)
  lists the Italian single-ingredient product and its uses.
- [OQLF — amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier)
  supports the base cereal name and *Triticum dicoccum* identity.
- [World Pantry — Puffed 5-grain mix](https://www.worldpantry.uk/ca/products/breakfast/puffed-5-grain-mix-400g)
  lists puffed emmer as part of a five-grain blend.
- [Bruyerre / Komplet — Grainstar](https://www.bruyerre.be/shop/03080130-komplet-grainstar-10kg-14577/document/14382)
  lists *blé amidonnier soufflé* as a component of a composite bakery mix.
- [Mariotti et al. (2006)](https://doi.org/10.1016/j.jcs.2005.06.007) compares the physical properties
  of puffed emmer and other cereal grains.
