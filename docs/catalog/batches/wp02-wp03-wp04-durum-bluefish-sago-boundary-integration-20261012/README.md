# WP02/WP03/WP04 — durum grain, bluefish, and sago-starch boundary integration

Integrated on 2026-10-12 from three proposal-only reviews. This batch adds two identity-only
references and records one unresolved edible-sago-starch candidate in the research ledger.

## Accepted identities

| ID | English / Québec French | Scope |
|---|---|---|
| `ingredient-ref-durum-wheat-berries` | durum wheat berries / blé dur | Intact human-food durum kernels; separate from generic wheat berries, durum flour, durum semolina, and remilled durum semolina. No aliases or runtime measures. |
| `ingredient-ref-bluefish` | bluefish / tassergal | *Pomatomus saltatrix* only. No aliases; snapper and other species remain separate. |

The current Québec product and OQLF sources support the durum-kernel name pair. OQLF and CFIA support
bluefish / tassergal for *P. saltatrix*. Both rows have no bundled recipe link, form, density, or unit
mapping. Bluefish retains NOAA's one-recipe `4-ounce fillet per person` as a source-specific portion
observation only. It is not a general fillet weight or conversion. The historical USDA durum-wheat
cup row remains unactivated because its scientific-name field conflicts with the OQLF durum taxon and
its preparation and packing bases are unspecified.

## Held candidate

`candidate-edible-sago-starch` remains `needs_clarification`. Codex defines edible sago flour from
*Metroxylon* palm pith; Malaysia's MS 470:2012 names edible sago starch for food use from the same
pith source. The reviewed public specification does not establish whether the products are
synonymous. Keep `sago starch` off the flour aliases and leave `fécule de sagou` unassigned because
the OQLF-hosted AFNOR definition also includes *Cycas*. The candidate has no active ingredient row,
recipe link, form, measurement, conversion, yield, or substitution. Preserve the existing palm-sago
pearl and cassava/tapioca boundaries.

The recipe corpus contains 114 manifest-listed recipes and 1,123 ingredient rows. It had zero exact
candidate-term hits for durum wheat berries or bluefish. Exact English phrases `durum wheat berries`
and `bluefish` each resolve only to their new row in the current reference index. Broad `durum` and
French `blé dur` remain multi-result terms, which keeps the flour and semolina choices visible. The
held sago phrases remain unassigned; the existing broad `sago` query continues to show edible sago
flour and sago pearls.

## Research records

- [Durum wheat berries review](../../proposals/wp03-section-f-durum-wheat-berries-identity-review-20261012.md)
- [Bluefish / tassergal review](../../proposals/wp04-section-p-bluefish-tassergal-identity-review-20261012.md)
- [Edible sago starch boundary review](../../proposals/wp02-b2-b3-edible-sago-starch-identity-boundary-review-20261012.md)
- The evidence and decisions are recorded in `docs/catalog/research-ledger.v1.json`; no recipe text or quantity changed.

## Validation snapshot

- Seed package: 1250 ingredient references, 94 forms, 114 recipes / 1,123 ingredient rows.
- Research ledger: 1558 records, 5418 source entries, 4456 distinct source IDs, and 8 unit conversions.
- `normalize_bundled_seed_package.py --check`: passed; package already normalized.
- `normalize_bundled_seed_package.py --validate-only`: passed.
- Ingredient-reference normalization `--check`: passed.
- Generated ingredient index `--check`: passed at 1250 references.
- Research-ledger schema validation: passed with 0 errors.
- Exact-owner, English phrase, candidate-term corpus, UTF-8/no-BOM, and targeted whitespace checks: passed.
- No app tests or emulator checks were run because this integration only adds database JSON data and regenerates its data index, under the current `AGENTS.md` rule.
- SHA-256: `ingredient-references.v1.json` `c6e2de7a57665fc3795821387a24fdd5b5372f43f6ed3bea5810fe06ff5ff376`; `research-ledger.v1.json` `01453d4513a92b7855463ec94ad39fa6f67d64f789199d35728bfc0bf93f4db9`.

## Source links

- [OQLF, blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357379/ble-dur), [Moulin Abénakis, blé dur rond](https://moulinabenakis.com/products/ble-dur-rond-bio), and [La Boîte à Grains, durum wheat berries](https://laboiteagrains.com/en/products/organic-durum-wheat-grains-bulk).
- [CFIA Fish List, bluefish query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true), [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), [OQLF, tassergal](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198905/tassergal), and [NOAA Fisheries bluefish recipe](https://www.fisheries.noaa.gov/insight/main-dish-recipes).
- [Codex edible sago flour standard](https://openknowledge.fao.org/handle/20.500.14283/ce0229en), [Malaysia MS 470:2012 preview](https://mysol.jsm.gov.my/preview-file/eyJpdiI6Im5PZFBPcElHTGxxVStFSE5yTlJ2Z1E9PSIsInZhbHVlIjoiS2VDMDl4Q2Ixa2J0QW5uZ2V4SXNmdz09IiwibWFjIjoiZmM4ZTkwNDVjNjIzMWQwMjJhNTIxNDI1M2JiMjlkZTBlYmRmNDFiMDRkMWM3MWJhOWNmYzVlMzg4NGRjYzNkNSJ9), and [OQLF, fécule de sagou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287213/fecule-de-sagou).
