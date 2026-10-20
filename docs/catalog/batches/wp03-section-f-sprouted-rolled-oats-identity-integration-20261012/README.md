# WP03 Section F: sprouted rolled-oats identity integration

## Decision

Added `ingredient-ref-sprouted-rolled-oats` as an identity-only `GRAIN_AND_CEREAL` reference:
`sprouted rolled oats / flocons d'avoine germés`. No aliases, forms, measures, density, unit
mappings, recipe links, conversions, yields, or substitutions were added. Keep sprouted quick oats,
sprouted steel-cut oats, instant oatmeal, puffed oats, and composite cereals distinct.

The identity uses the One Degree product wording, the Canadian French product name, and OQLF's
preferred `flocon d'avoine` terminology. The manufacturer’s recipe suggestions remain product-specific
evidence and do not activate a substitution. The product pages' package sizes are not household
measures.

## Evidence

- [One Degree Organics, Organic Sprouted Rolled Oats](https://onedegreeorganics.com/products/organic-sprouted-rolled-oats-us/): product heading and description.
- [One Degree Organics, Sprouted Oats FAQs](https://onedegreeorganics.com/sprouted-oats-faqs/): distinguishes rolled, quick, and steel-cut sprouted styles and describes this manufacturer's processing.
- [Well.ca, One Degree Organics Sprouted Rolled Oats](https://well.ca/fr/produits/flocons-davoine-germs-one-degree-organics_183909.html): Canadian French product name and ingredient wording.
- [OQLF, flocon d'avoine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine): preferred Québec term and definition; the full sprouted compound is product-attested, not an OQLF ruling.

The source records are attached to the new ingredient-reference ledger entry. They do not support a
general measure or a universal sprouting process.

## Package and recipe audit

At integration, the package has 1,306 ingredient references, 98 forms, 114 bundled recipes, and
1,123 ingredient rows. The research ledger has 1,614 records, 5,863 source entries, 4,885 distinct
source IDs, and 8 shared unit conversions. The review found no prior exact identity owner and no
candidate phrase or ingredient-row matches in the complete recipe corpus.

## Validation

- Bundled-package normalization check and schema/package validation passed.
- Ingredient-reference normalization check passed.
- Generated catalog check passed at 1,306 references.
- Research-ledger validation passed with 1,614 records and zero errors.
- Both database JSON files are UTF-8 without BOM and contain only ASCII bytes, with French accents stored as JSON Unicode escapes.
- Proposal and batch README are UTF-8 without BOM; `git diff --check` passed.
- No app tests or emulator checks were run because this update only adds database JSON data; static data validation was used.

See [the source review](../../proposals/wp03-section-f-sprouted-rolled-oats-identity-review-20261012.md).
