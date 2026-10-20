# WP05 Section V culinary alcohol integration

- Date: 2026-10-12
- Status: verified two existing identities and added two identity-only references; the broader alcohol and Section V work remains open.

## Integrated decision

Verified the existing `white wine / vin blanc` and `mirin / mirin` references. Added identity-only `red wine / vin rouge` and `sake / saké`, with English aliases `saké`, `saki`, and the qualified `Japanese rice wine` on sake. Red wine stays distinct from red-wine vinegar; white wine stays distinct from white-wine vinegar. Both wine colors remain separate from unqualified rice wines.

The existing recipe links for mirin (recipe 066#9) and white wine (recipe 096#4) remain unchanged. No bundled recipe row calls for red wine or sake, so neither new identity is linked to a recipe.

Dry and sweet describe wine styles and were not added as aliases. Hon/shin/shio mirin, mirin-style seasonings, cooking sake, generic cooking wine, Shaoxing beverage and cooking products, and other regional rice wines remain held for review when a recipe or product provides exact wording. The OQLF sake list includes broad `rice wine`; only the qualified `Japanese rice wine` wording is active. No forms, densities, measurements, conversions, yields, or substitutions were added.

## Evidence

- The [CFIA Canadian Food Compositional Standards, Volume 2](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) defines wine from fresh grapes and separately defines fruit wine and vermouth (§§2.7.1–2.7.5). This supports the grape-wine boundary but is not a complete taxonomy for regional rice beverages or cooking products.
- OQLF confirms [vin blanc / white wine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353540/vin-blanc) and [vin rouge / red wine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354290/vin-rouge). Its [dry-wine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18947718/vin-sec) and [sweet-wine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353665/vin-doux) records treat these as styles; sweet wine can apply to several wine types.
- OQLF's [saké entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434071/sake) defines a Japanese fermented-rice alcoholic beverage and lists `sake`, `saké`, `saki`, `Japanese rice wine`, and `rice wine` in English. The active alias set omits the unqualified regional term.
- OQLF's [mirin entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544925/mirin) uses `mirin` in both languages and distinguishes hon, shin, and shio mirin by alcohol or salt content. [Kikkoman's product explanation](https://www.kikkoman.co.jp/enjoys/mirin/about.html) also separates traditional mirin from mirin-style and fermented mirin-type seasonings.
- The proposal records the additional product-specific evidence reviewed for Shaoxing wine/cooking wine, cooking sake, generic cooking wine, and mirin-style seasonings: `docs/catalog/proposals/wp05-section-v-culinary-alcohol-boundary-review-20261012.md`.

## Data checks

The package contains 1,135 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 71 entries. The ledger contains 1,432 records / 4,775 source entries / 3,908 distinct source IDs / 8 unit conversions.

Package validation and normalization checks passed; the generated Kotlin index is current; the research ledger validates with no errors. Exact phrase ownership found no competing owner for `red wine`, `vin rouge`, `sake`, `saké`, `saki`, or `Japanese rice wine`. The 114-recipe scan found no red-wine or sake ingredient rows and confirmed that only mirin recipe 066#9 and white wine recipe 096#4 are linked in this tranche. UTF-8/no-BOM and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates bundled database JSON data, consistent with `AGENTS.md`.
