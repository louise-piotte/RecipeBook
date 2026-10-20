# WP02 Section B R263 — winged-bean flour integration

Integrated the [R263 review proposal](../../proposals/wp02-section-b-gap-review-r263-20261016.md).

## Decision

Added identity-only `ingredient-ref-winged-bean-flour` as `winged bean flour / farine de haricot ailé` in `FLOUR_AND_STARCH`, scoped to flour milled from dried mature seeds of *Psophocarpus tetragonolobus*. The seed identity and food-use statement are supported by Canadian sources, and primary studies document flour made from the seeds. The French flour display remains a provisional construction; no reviewed Québec flour package or OQLF flour term was found.

Keep the flour separate from whole seeds, immature pods, leaves, tubers, isolated starch, concentrates, defatted flour, and composite flours. Both alias arrays are empty. Do not use `farine de pois carré`: TERMIUM and Gaia report `pois carré` for winged bean, while OQLF assigns that term to *Pisum arvense* / field-pea wording. The existing whole-seed alias is unchanged pending separate adjudication.

## Measures and recipe demand

No active form, density, unit mapping, kitchen measure, conversion, yield, recipe link, or substitution was added. Laboratory absorption values and study-specific bread blends do not establish a reusable kitchen measure or general replacement ratio. The 114-recipe, 1,123-row bundle has no matching flour phrase or link.

## Integration record

- Added one reference and an identity ledger record. Reused the existing TERMIUM and Gaia source IDs; registered six R263 sources for EFAO, flour studies, and OQLF terminology.
- Updated the Section B checklist, plan integration log, proposal status, and roadmap. Broader Section B coverage remains open.
- Static package normalization/validation, generated-index freshness, ledger schema/source ownership, picker projection, recipe-corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run because this change only adds database JSON data and documentation under `AGENTS.md`.

## Evidence

The Canadian sources identify *P. tetragonolobus*, `winged bean / haricot ailé`, and say its dried seeds are used for flour: [Gaia Organic Seeds Canada](https://gaiaorganics.ca/product/winged-bean/) and the [Ecological Farmers Association of Ontario garden-sign guide, p. 39](https://efao.ca/wp-content/uploads/Demo-Garden-Signs-2024.pdf). OQLF lists `pois carré` for field-pea wording in its [pois des champs entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8876749/pois-des-champs). The proposal and ledger retain the study boundaries and complete source details.
