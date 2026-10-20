# WP05 Section W fermented bamboo-shoot identity integration — 2026-10-12

## Catalog decision

- Added one identity-only reference, `ingredient-ref-fermented-bamboo-shoots`, displayed as `fermented bamboo shoots / pousses de bambou fermentées`. The category is `SAUCE_AND_CONDIMENT`; aliases are singular grammatical variants only.
- The Codex canned-shoot standard supports the French product name within its canned-product scope and distinguishes naturally fermented, acidified, and nonfermented shoots. OQLF supports the base `pousse de bambou` term. This identity does not cover every regional ferment.
- Kept fresh/plain shoots, acidified shoots, menma, Liuzhou `酸笋`, and generic retailer wording such as “pickled” or “sour” separate. Added no recipe links, forms, density, unit mappings, package/cooking yields, conversions, or substitutions.
- The 114 manifest-listed recipe files (1,123 ingredient rows) contain no matching shoot terms. No recipe data changed.

## Sources

- FAO/WHO Codex Alimentarius, [Norme pour les pousses de bambou en conserve, CXS 241-2003](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B241-2003%252FCXS_241f.pdf): supports the French name for a canned product and the separation of naturally fermented, acidified, and nonfermented products.
- OQLF, [pousse de bambou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083672/pousse-de-bambou): supports the base Québec French term.
- China SAMR, [DB4502/T 0030-2022](https://std.samr.gov.cn/db/search/stdDBDetailed?id=DEB42E85B0207CF4E05397BE0A0A4B1F): scopes `酸笋` to a Liuzhou luosifen ingredient-processing standard.
- Marumatsu Bussan, [Menma: reconstituting dried menma](https://www.marumatsu-mb.co.jp/menma/DriedMenma.html): describes one producer's fermented, dried menma product path.
- Haisue Canada, [Cock Brand Pickled Sour Bamboo Shoot](https://haisue.ca/products/cock-brand-pickled-sour-bamboo-shoot-slice-850g): uses pickled/sour wording for a brined item without stating fermentation.
- Bon pour toi, [Menma (bambou mariné)](https://bonpourtoi.ca/recettes/menma-bambou-marine/): documents Québec recipe usage for a quick preparation from canned shoots, not a fermentation process.

## Data and static validation

The package now has 1,193 references / 86 forms / 114 recipes / 1,123 ingredient rows, 66 legacy candidates, and 1,494 research-ledger records / 5,015 source entries / 4,092 distinct source IDs / 8 unit conversions. Reference normalization, package validation and normalization, generated-index freshness, research-ledger validation, exact-key ownership, the recipe scan, UTF-8/no-BOM checks, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
