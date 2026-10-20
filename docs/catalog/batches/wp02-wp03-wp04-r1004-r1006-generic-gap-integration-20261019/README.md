# WP02/WP03/WP04 R1004–R1006 generic ingredient research integration

Integrated three generic ingredient research gaps. The catalog-wide generic scope applies across every ingredient type; these assignments did not add a commercial brand, product line, flavour family, SKU, or retailer variant. Existing branded references were preserved. See the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).

## Changes

- **R1004 — spelt bran:** Updated the existing ledger record to `researched_no_supported_value` for household measurement and `blocked_pending_evidence` for substitution. Recorded two primary studies with their sample and method limits. Laboratory binding/swelling properties, Mixolab values, cookie replacement levels, and sensory results remain source-specific; no measurement observation, density, kitchen measure, or active replacement rule was added.
- **R1005 — wine cap mushroom:** Added identity-only `wine cap mushroom / strophaire à anneau rugueux` for *Stropharia rugosoannulata* in `VEGETABLE_AND_AROMATIC`, with English aliases `wine caps` and `wine roundhead`. No forms, reusable measures, recipe links, conversions, yields, or active substitutions were added. Mycology dimensions and one sauté method remain in their source context.
- **R1006 — veal:** Added identity-only `veal / veau` in `PROTEIN` and one 75 g cooked portion, scoped to one serving in the cited Health Canada Food Guide handout. Its paired 125 mL is not a conversion. No cuts, aliases, forms, recipe links, or substitutions were added.

The separate [R1007 Mexican herb batch](../wp06-section-u-mexican-herbs-r1007-integration-20261019/README.md) was already integrated. Across R1004–R1007, existing identities were retained and no recipe row was relinked.

## Current audit and static validation

- Final bundled catalog: **2,021 references**, **205 forms**, **55 legacy candidates**; research ledger: **2,427 records**.
- The manifest contains **114 recipes / 1,123 ingredient rows**. Exact target scans found no bundled recipe demand for the reviewed names.
- Exact normalized ownership checks found only the intended identities for spelt bran, wine cap mushroom and its aliases, veal / veau, and the R1007 epazote, hoja-santa, and pápalo terms. No competing form or legacy owner was found.
- Bundled seed package validation passed. Research-ledger schema and source-ownership validation passed with zero errors. The generated Kotlin ingredient index is current at 2,021 references.
- UTF-8/no-BOM checks passed for the changed JSON, generated index, proposals, batch README, plan, and roadmap. Local links and scoped `git diff --check` passed.

No software tests, build, emulator, or deployment were run. The application changes only add database JSON data, which `AGENTS.md` exempts from testing.

## Proposals

- [R1004 — spelt-bran measurement and substitution review](../../proposals/wp02-a7-spelt-bran-measure-substitution-review-r1004-20261019.md)
- [R1005 — generic wine cap mushroom identity](../../proposals/wp03-section-n-generic-wine-cap-mushroom-identity-review-r1005-20261019.md)
- [R1006 — generic veal / veau identity](../../proposals/wp04-section-o-generic-veal-identity-review-r1006-20261019.md)

