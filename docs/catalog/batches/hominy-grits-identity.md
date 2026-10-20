# WP03 hominy grits identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated; Québec French culinary review remains open.
- **Scope:** dry ground hominy grits as an identity. No cooking state, measure, yield, conversion,
  substitution, or recipe-link behavior is inferred.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-hominy-grits` | hominy grits | gruau de maïs | None | `GRAIN_AND_CEREAL` | Ground hominy product; separate from whole hominy corn, ordinary degermed corn grits, cornmeal, and generic grits. |

Statistics Canada's MDFoodCode directly maps the human-food category `Hominy grits` to `Gruau de maïs` under cereal grains, unmilled or milled. Codex CXS 155 applies to degermed corn grits for direct human consumption but expressly excludes hominy grits and alkaline-treated maize products. Together these sources support a separate ground product and a grain category.

Québec lexical and culinary sources require scope care. OQLF gives *gruau de maïs* in a brewing/malt-crushing entry and lists *hominy grits* only as a U.S. English term there. RICARDO uses *gruau de maïs* and *semoule de maïs de type grits* for a generic grits dish, and a Québec retailer uses *gruau de maïs* for coarse-ground white corn. These sources support the French wording in culinary contexts but do not establish that generic grits or cornmeal is hominy grits. Statistics Canada supplies the direct hominy-grits food-code pair. An independent audit agreed that this is the strongest direct French mapping while flagging that Québec readers may also understand *gruau de maïs* as generic corn grits; retain the row with no aliases and keep the Québec picker review open. Keep *semoule de maïs de type grits* and feed-scoped *gruau hominy* out of aliases.

## Product boundaries

- **Whole hominy corn / maïs lessivé:** already active as a processed whole-kernel product. The new row is the ground product and is not an alias.
- **Ordinary corn grits:** Codex's direct-human-consumption standard for degermed maize grits excludes hominy grits and alkaline-treated products.
- **Cornmeal / semoule de maïs:** remains in `FLOUR_AND_STARCH`. Keep it separate from hominy grits.
- **Generic grits:** remains unallocated because it can refer to different ground grains or prepared dishes.
- **Pearled hominy:** remains unresolved until a food-scope bilingual name is supported.

No aliases, forms, density, unit mappings, measurements, yields, conversions, or substitutions were added.

## Recipe and collision audit

The current canonical seed has 362 ingredient references and the bundled library has 114 recipes.
The normalized-key check found no existing exact display key for `hominy grits` or `gruau de maïs`;
the recipe scan found no matching ingredient wording. `semoule de maïs` remains attached to the
existing cornmeal identity. No recipe was relinked and no quantity changed.

## Sources

- **WP03-S140 — Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf):** food code F232 maps `Hominy grits` to `Gruau de maïs`.
- **WP03-S137 — Codex Alimentarius, [CXS 155-1985](https://www.fao.org/input/download/standards/53/CXS_155e.pdf):** defines ordinary degermed corn grits for direct human consumption and excludes hominy grits and alkaline-treated maize.
- **WP03-S138 — OQLF, [gruau de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais):** preferred French term; entry is scoped to brewing and malt crushing.
- **WP03-S139 — CFIA, [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail):** records *gruau de maïs (ou gruau hominy)* for a ground corn feed ingredient; not relied on for human-food scope.
- **WP03-S141 — RICARDO, [Grits aux crevettes](https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes):** Québec culinary wording for generic corn grits and a coarse-ground corn explanation.
- **WP03-S142 — La Moisson, [Gruau de maïs blanc crémeux](https://lamoisson.com/products/gruau-de-mais-blanc-cremeux-creamy-white-corn-grits):** Québec retail wording for a coarse-ground white-corn product; not identified as hominy.

## Verification record

Verified 2026-10-07 on Pixel 9a / Android 16 API 36 (1080×2424). The English picker returned exactly one row for `hominy grits`; the fr-CA picker returned exactly one `gruau de maïs` row for the accent-folded query `gruau de mais`. Screenshots: `pixel9a-hominy-grits-picker-en.png` (SHA-256 `f1c89bff4a47af9ee178b52d10732a92a50603106de44cb33ee05a6c4e4f5948`) and `pixel9a-hominy-grits-picker-fr-ca.png` (SHA-256 `c52d8c8f9b44ba658e1bbb72a1d421ab446491a274e69d5d44dd75134056df2f`).

The deployment script passed all 259 Android unit tests and assembled, installed, and launched the debug APK (SHA-256 `a6903d977f4d8d79b6a177cebcb99ae1d6903b6a112aaee6f4f7a7e9c0684079`). Connected Android 16 instrumentation reported 29 tests: 27 passed, 2 environment-gated skips, 0 failures. Seed/package normalization, generated-index and ledger checks, Python package tests, encoding, and diff checks are recorded in the plan checkpoint. The verified seed references file SHA-256 is `0015397c57e243fc720f601834109b60e96b741fa31ece31a17481fb0f095f93`; generated Kotlin index SHA-256 is `7b02f6c4a477683847882683487a66599529f4d122098f12a3bab7703dbe0260`; research ledger SHA-256 is `31a920323e83fab55d5cde21f6616d3a1901cf45892faf0b29ded3ccc2dd4f9b`.

### Cumulative ledger follow-up

Later Section F reviews added scoped edible red-rice evidence and the unresolved polenta boundary. The cumulative ledger now has 529 records and SHA-256 `de8074f7309d14728e1745e2ca7bb6bc2a4845fd67030463375e72de8070c37c`; the 362-reference seed/index hashes above remain the historical hominy-grits verification snapshot.
