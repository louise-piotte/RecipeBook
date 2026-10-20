# WP05 Section V named spirit identities — 2026-10-12

## Catalog decision

Added four identity-only references in `OTHER`:

| ID | English / fr-CA display | Aliases |
| --- | --- | --- |
| `ingredient-ref-rum` | rum / `rhum` | None |
| `ingredient-ref-whisky` | whisky / `whisky` | `whiskey` in English and French |
| `ingredient-ref-vodka` | vodka / `vodka` | None |
| `ingredient-ref-grappa` | grappa / `grappa` | None |

OQLF terminology pairs `rhum` with English `rum`, uses whisky/whiskey in both languages, and uses vodka and grappa in both languages. Its whisky note associates the whiskey spelling with Irish and American whisky; no regional or style-qualified aliases were added. Canadian compositional standards identify whisky/whiskey, rum, vodka, and grappa as distinct product classes, and explicitly distinguish grappa from generic wine brandy.

Kept generic `eau-de-vie` held as an umbrella for several simple spirits. Kept the generic liqueur/cordial umbrella held: the Canadian standard names a defined class, but there is no bundled recipe request for a generic liqueur or cordial. Preserved the accepted wine-brandy / `eau-de-vie de vin` identity and its recipe 057#25 link, and preserved the named Frangelico identity and recipe 021#21 link. Do not map Frangelico to a generic liqueur or add Cognac/Armagnac as brandy aliases.

The 114-recipe / 1,123-line bundle has no rum, whisky/whiskey, vodka, or grappa ingredient line. No recipe links changed. No forms, densities, unit mappings, measures, conversions, yields, or substitutions were added.

## Sources

| Source ID | Source | Use and limit |
| --- | --- | --- |
| `WP05-SPIRIT-RESIDUAL-20261012-S01` | [OQLF, rhum (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17026721/rhum) | Preferred Québec French `rhum`, English `rum`, and the sugar-cane spirit class. |
| `WP05-SPIRIT-RESIDUAL-20261012-S02` | [OQLF, whisky (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26543819/whisky) | French and English forms `whisky` and `whiskey`; the OQLF note associates the spelling `whiskey` with Irish and American whisky. |
| `WP05-SPIRIT-RESIDUAL-20261012-S03` | [OQLF, vodka (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17039537/vodka) | Same French and English name; no neutral-alcohol alias is inferred. |
| `WP05-SPIRIT-RESIDUAL-20261012-S04` | [OQLF, grappa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8416992/grappa) | Same French and English name; defines grappa as an Italian grape-pomace spirit. |
| `WP05-SPIRIT-RESIDUAL-20261012-S05` | [CFIA, Canadian Food Compositional Standards, Volume 2 — Alcoholic Beverages](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Sections 2.1, 2.2, 2.4.1–2.4.7, and 2.6.1 define separate whisky/whiskey, rum, grappa, and vodka classes. These legal class boundaries do not imply recipe interchangeability. |

The held generic eau-de-vie and liqueur/cordial boundaries are further documented in the [residual spirits and culinary liqueurs review](../../proposals/wp05-section-v-spirit-and-liqueur-residual-review-20261012.md), which also cites OQLF and CFIA sources. No residual alcohol content, cooking-loss, or substitution conclusion is drawn.

## Validation

- The package had 1,186 ingredient references before this batch and now has 1,190; forms remain 85. The manifest remains 114 recipes / 1,123 ingredient rows, and the 66 legacy candidates remain unchanged.
- The ledger now has 1,490 records / 4,968 source entries / 4,054 distinct source IDs / 8 unit conversions.
- Bundled package normalization/schema validation, reference normalization, generated-index freshness at 1,190 references, and ledger validation (zero errors) passed.
- Normalized exact-key ownership found zero collisions across references, forms, and legacy identities. UTF-8/no-BOM and trailing-whitespace checks passed for all seven changed data, generated, and documentation files; scoped `git diff --check` passed.
- No Gradle tests or emulator checks were run because this batch only adds database JSON data.

The broader Section V checklist remains open for sake, regional rice wines, named liqueurs, and other unresolved product classes.
