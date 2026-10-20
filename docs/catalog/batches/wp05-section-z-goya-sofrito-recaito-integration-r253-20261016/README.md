# WP05 Section Z R253 — Goya Sofrito and Recaito Integration

- **Status:** Integrated two brand-qualified `SAUCE_AND_CONDIMENT` identities.
- **Review date:** 2026-10-16.

## Integrated identities

| English display | French display | Package evidence |
|---|---|---|
| Goya Sofrito Tomato Cooking Base | base de cuisson Goya au sofrito de tomate | Manufacturer 6 oz, 12 oz, and 24 oz sizes; one Canadian 340 g listing |
| Goya Recaito Cooking Base | base de cuisson Goya au recaito | Manufacturer 6 oz, 12 oz, and 24 oz sizes; Canadian listings at 12 oz / 340 g |

Both references have empty alias arrays, null densities, and empty unit mappings. Their French
product descriptions are provisional; no Québec product labels or OQLF compound-name decisions
were found. Jar sizes remain distinct source-specific package observations, with no ounce-to-gram
conversion or household measure activated.

## Product boundaries

Keep Goya Sofrito and Goya Recaito separate from each other, homemade regional sofrito, Haitian
epis, Trinidadian green seasoning, and fresh herbs. Goya’s Recaito ingredient list names `CULANTRO`,
while some marketing and retailer text uses `cilantro`. The existing fresh `culantro /
chicória-do-Pará` reference is unchanged; the Recaito row gets no cilantro, culantro, or coriander
alias. No forms, recipe links, conversions, yields, substitutions, or recipe-specific behavior were
added. The 114-recipe / 1,123-row bundle has no matching demand.

## Sources and static checks

The [R253 proposal](../../proposals/wp05-section-z-goya-sofrito-recaito-identity-review-r253-20261016.md)
contains the full source register and the picker/corpus audit. Static checks cover seed-package
normalization and validation, generated-index freshness, research-ledger schema and source-ID/URL
ownership, new-record source references, reference/form ownership, picker projection, recipe corpus,
UTF-8/no-BOM and escaped seed Unicode, local links, and scoped whitespace.

Totals: 1,648 references, 125 forms, and 1,996 research-ledger records / 8,721 source entries /
7,390 distinct source IDs / 6,159 distinct source URLs; 114 recipes / 1,123 ingredient rows.

No software tests, emulator checks, or deployment were run because this batch only adds database
JSON data and documentation under `AGENTS.md`. Section Z remains open.
