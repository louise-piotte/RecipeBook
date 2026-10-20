# WP02 B2/B3 R94 — modified tapioca starch integration

Proposal reviewed and integrated 2026-10-14. Section 04 B2/B3 remains open.

## Decision

Added identity-only `modified tapioca starch / amidon de tapioca modifié` as a separate
`FLOUR_AND_STARCH` reference from ordinary tapioca starch and the modified pea and corn starch
references. The French alias `fécule de tapioca modifiée` is retained from a Canadian product
label. The row has no English aliases or forms, null density, and no unit mappings.

The accepted ledger record preserves one Expandex recipe's published `1/4 cup (36 g)` portion as a
source-specific observation and one replacement finding limited to the author's sopapillas formula.
The same author's bread guidance documents different behavior, so no reusable substitution rule,
conversion, yield, or recipe link was added. No bundled recipe demand was found.

The qualified English and French phrases return the new identity alone. Broad `tapioca starch`
searches return both the ordinary and modified rows; generic `tapioca` also gains the modified row.
Unqualified modified-starch terms remain unassigned.

## Integration and validation

- Added one ingredient reference and one accepted `ingredient_reference` ledger record; regenerated
  the Kotlin ingredient catalog index. Current counts: 1,427 references, 105 forms, 1,767 ledger
  records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the B2/B3 checklist, the global catalog plan, and `roadmap.md`.
- Seed-package, reference-normalization, ledger-schema, and generated-index checks passed. The
  picker projection confirmed the qualified and broad query behavior above.
- Checked for duplicate source IDs and candidate ownership across active references, forms, legacy
  candidates, and ledger records. The full recipe bundle was already scanned in the proposal; it
  contains no matching demand.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because this change only adds
  database JSON data and its generated catalog index under `AGENTS.md`.

See the detailed [R94 review](../../proposals/wp02-b2-b3-r94-next-starch-boundary-review-20261014.md).

## Main sources

- [CFIA common-name rules](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components)
  distinguish ordinary from modified starch naming.
- [OQLF — amidon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon)
  supports the preferred French headword.
- [Abbott Nutrition Canada French product sheet](https://www.nutrition.abbott/content/dam/an/abbottnutrition-global/ca/fr/products/similac-alimentum-237-ml-pret-a-servir/Similac-Alimentum-237-mL-pr%C3%AAt-%C3%A0-servir-fr.pdf)
  uses `amidon de tapioca modifié`.
- [Kozy Shack Canada French label](https://www.kozyshack.ca/fr-ca/products/simply-well/simply-well-tapioca-pudding)
  uses `fécule de tapioca modifiée` separately from `Tapioca`.
- The proposal records the product-specific [Expandex sopapillas portion and substitution
  finding](https://glutenfreeonashoestring.com/gluten-free-sopapillas/) and the author's
  recipe-specific bread guidance.
