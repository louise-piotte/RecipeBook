# WP02 Section B: black-bean-flour identity integration

Integrated on 2026-10-12 from the [focused identity review](../../proposals/wp02-section-b-black-bean-flour-identity-review-20261012.md).

## Catalog change

Added `ingredient-ref-black-bean-flour` as `black bean flour / farine de haricots noirs`, category `FLOUR_AND_STARCH`. At that initial integration it had no aliases, forms, density, unit mappings, or recipe links. The follow-up [sprouted-flour review](../wp02-b2-sprouted-black-bean-flour-form-integration-20261012/README.md) adds one sprouted form under this reference; the base row still has no aliases, density, unit mappings, or recipe links. The name-level association with common *Phaseolus vulgaris* black beans is an inference from the ordinary bean name and Canadian supplier listings; it does not identify a specific flour lot, cultivar, heat treatment, or milling specification.

The base row remains separate from whole black beans, black-bean sauce, and *Vigna mungo* / black-gram flour. Sprouted black-bean flour is represented as a process form under the base row, not a separate identity. The recipe corpus contains no matching line.

## Measurement and substitution boundary

Siddiq et al. report a 0.515 g/mL bulk density for study flour made from selected dry *P. vulgaris* varieties. That study-specific value is preserved in the research ledger only; it is not an active density, household cup conversion, or product-wide default. A Pulse Canada recipe's flour-or-whole-bean wording remains source-specific. Everspring's sprouted product guidance distinguishes a 1:1 whole-sprouted-bean claim from flour advice that calls for more liquid, so no general flour substitution or ratio was activated.

## Evidence

- [OQLF, haricot noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350002/haricot-noir) identifies the ordinary black bean with *Phaseolus vulgaris*.
- [OQLF, haricot mungo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo) documents the separate mungo/black-gram naming boundary.
- [Diefenbaker Spice & Pulse](https://www.dspdirect.ca/special-crop-products.php), [Everspring's product list](https://www.everspringfarms.ca/product-category/beans/), and [Ontario Bean Growers](https://ontariobeans.on.ca/bean-flours/) list bean flours separately from whole pulses. [Everspring's sprouted black-bean flour](https://www.everspringfarms.ca/product/sprouted-black-bean-flour/) supports keeping sprouting as a product qualifier.
- [Pulse Canada's gluten-free recipe booklet](https://ontariobeans.on.ca/wp-content/uploads/2020/06/Pulse-Canada-Gluten-Free-recipe-Pamphlet.pdf) contains the source-specific flour/whole-bean wording; a [Cuisinart Canadian French booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1770545043648/Instruction%20Booklet/CYM-100C_fr.pdf) uses `farine de haricots noirs`.
- [Siddiq et al. (2010)](https://doi.org/10.1016/j.lwt.2009.07.009) is the source for the study-specific bulk-density observation. [Everspring's FAQ](https://www.everspringfarms.ca/shop/) is retained only as product-specific guidance, not a global substitution rule.

## Validation

The complete bundle has 114 recipes and 1,123 ingredient rows; none contains the candidate terms. The accepted names have one exact active owner each. The package validator, reference normalization check, generated-index check, and research-ledger validation passed at 1,284 references, 97 forms, and 1,591 ledger records; the ledger has 5,679 source entries and 4,710 distinct source IDs. JSON files are UTF-8 without BOM and contain only ASCII bytes through escaped Unicode where needed. No app tests or emulator checks were run because this change only adds database JSON data.
