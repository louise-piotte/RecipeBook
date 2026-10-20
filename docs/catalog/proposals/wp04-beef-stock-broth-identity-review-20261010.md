# WP04 Proposal: Separate Beef Stock and Beef Broth Identities

**Review date:** 2026-10-10  
**Status:** Integrated; see `docs/catalog/batches/wp04-beef-stock-broth-identity-integration-20261010/README.md`.  
**Scope:** Resolve the active beef-stock reference's unsupported `beef broth` alias and link exact bundled recipe lines that name beef broth.

## Decision

Keep `beef stock / fond de bœuf` and `beef broth / bouillon de bœuf` as separate `STOCK_AND_BROTH` identities. The OQLF gives each English term its own French equivalent and defines *fond* as a seasoned stock used for sauces and for moistening stews and braises. Campbell's Canadian English and French product pages likewise identify a ready-to-use beef broth, while its ingredient list contains beef stock / fond de bœuf. This supports related products, not a one-to-one synonym.

Update the existing stock reference's French display to `fond de bœuf`, remove its unsupported package-phrase alias `canette de bouillon de bœuf`, and remove `beef broth` as an English alias. Add an identity-only beef-broth reference with no aliases or numeric values. Link the exact `beef broth` rows in recipes 015, 034, and 078 to it. Keep recipe 015's `1 can` amount and its unknown package size unchanged.

Do not add a generic stock-to-broth alias, conversion, density, package size, form, or substitution. The recipe corpus directly names broth, and the local source for recipe 015 does not identify a product or package quantity.

## Recipe rows

| Recipe line | Source wording | Decision |
| --- | --- | --- |
| `015#4` — Beef Stroganov | `1 can beef broth` | Link to beef broth; retain `1 can` without a can-size conversion. |
| `034#11` — Classic Beef Chili | `1/4 cup beef broth` | Link to beef broth; retain the recipe's volume amount. |
| `078#13` — Shepherd's Pie | `1 cup beef broth` | Link to beef broth and correct the stale `beef stock` ingredient name; retain the recipe's volume amount. |

## Evidence

| ID | Source | Supports and limits |
| --- | --- | --- |
| `WP04-STOCK-BROTH-20261010-S01` | Office québécois de la langue française, [fond de bœuf (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18053069/fond-de-boeuf) | Pairs `fond de bœuf` with `beef stock`; defines a fond as seasoned broth used for sauces and to moisten stews and braises. This is the French display for the existing stock identity. |
| `WP04-STOCK-BROTH-20261010-S02` | Office québécois de la langue française, [bouillon de bœuf (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497442/bouillon-de-boeuf) | Pairs the preferred French term `bouillon de bœuf` with `beef broth`. It does not equate broth with stock. |
| `WP04-STOCK-BROTH-20261010-S03` | Campbell Company of Canada, [Ready To Use Beef Broth](https://www.campbellsoup.ca/product/campbells-ready-to-use-beef-broth/) and [Bouillon de Bœuf Prêt à utiliser](https://www.campbellsoup.ca/fr/product/bouillon-de-buf-prt-utiliser-de-campbells/) | Matching English/French manufacturer pages support the bilingual product name. The formula lists beef broth made with beef stock / bouillon de bœuf made with fond de bœuf, demonstrating that the terms can name related but distinct components. This is product-specific and does not establish a universal formula or amount. |

All sources accessed 2026-10-10. No measurement, substitution, or package-size research is claimed by this identity review.
