# WP03 Section F rye bran identity integration — 2026-10-13

Integrated the [R58 rye-bran review](../../proposals/wp03-section-f-rye-bran-identity-review-20261013-r58.md).

## Catalog decision

Added identity-only `ingredient-ref-rye-bran` as `rye bran / son de seigle` in `GRAIN_AND_CEREAL`.
Both alias arrays are empty; density is null and unit mappings are empty. Keep the milling fraction
separate from rye grain, berries, cracked rye, meal, flour, flakes, feed by-products, and prepared
foods containing rye bran. The French wording is attested as an ingredient on a current Québec
retailer page; it is not an OQLF ruling.

CFIA's English and French guidance says the source grain must be named for non-wheat bran. A 2022
peer-reviewed industrial rye-milling study separates bran from wholemeal and white-flour fractions.
The retailer wording and milling study support the identity, not a generic grind specification or
home-kitchen conversion.

The research ledger record `ingredient-ref-rye-bran` has a verified identity, `researched_no_supported_value`
measurement state, and `researched_no_supported_substitute` substitution state. The manufacturer’s
13 g serving and 250 g package are SKU-specific. A Canadian rye-flour product gives a combined
1/4-cup / 30-g portion without a rye-bran ratio; none of these amounts was imported.

## Recipe and behavior limits

The 114-recipe / 1,123-row bundle has no matching ingredient demand. No alias, form, density, unit
mapping, reusable measure, recipe link, conversion, cooking yield, or substitution was added. Section
F now tracks 54 identities: 53 in `GRAIN_AND_CEREAL` and hominy corn in `VEGETABLE_AND_AROMATIC`.

## Integration checks

- Seed package: 1,383 ingredient references, 100 forms, and 63 legacy candidates.
- Generated bundled catalog: current with 1,383 references.
- Research ledger: 1,714 records; validation has zero errors.
- Static exact-key ownership and recipe-corpus checks passed; local links, UTF-8/no-BOM, mojibake, and scoped whitespace checks passed.
- No app tests or emulator checks were run because this change only adds database JSON data and regenerates its derived index.

Section F remains open.
