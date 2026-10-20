# WP03 Section F R801 — Love Crunch Dark Chocolate & Red Berries identity review (2026-10-19)

## Decision summary

- **Open parent:** “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” remains open in the [Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4923); R798’s Great Grains Nut Medley hold remains separate.
- **Accepted identity:** Add `ingredient-ref-love-crunch-dark-chocolate-red-berries-granola`, displayed as **Love Crunch Organic Dark Chocolate & Red Berries Granola / Granola au chocolat noir et baies rouges biologique, Love Crunch**, in `GRAIN_AND_CEREAL`, with no aliases.
- **Product match:** The English and French-localized Nature’s Path Canada product pages carry the same product-code digits, `058449771760`, in their image filenames. Metro Québec’s indexed French listing pairs that number with French product wording and a 325 g package. The matched identity is one finished granola variant, not a complete Love Crunch family roster.
- **Scope:** Keep it distinct from generic granola, ingredient components, Cranberry Almond Crunch, and Special K Red Berries. Add no forms, measures, mappings, density, conversions, yields, recipe links, component links, or substitutions. The package amount is not a recipe measure.
- **Shared source IDs assigned at integration:** `WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S01` (English manufacturer page), `-S02` (French manufacturer page), `-S03` (Metro Québec indexed listing), and `-S04` (manufacturer collection page). The review’s repository-audit handle is documentation-only and was not added to the ledger.

## Evidence and product boundary

Nature’s Path’s Canada-region English page identifies **Love Crunch Organic Dark Chocolate & Red Berries Granola**, shows the product image filename with `058449771760`, describes granola clusters with red berries and dark chocolate, and offers 325 g and 700 g multipacks. The page is evidence for this finished product identity only; it does not establish a household serving or component proportions. [S01]

The French-localized Canada product page is in the Love Crunch Granola collection and shows a product image filename carrying the same UPC digits. Its page title is **Chocolate noir et baies rouges Granola, socle 700 g**; the app display instead uses the Québec retailer wording below, which places the product name in natural French. The page also describes red berries and dark chocolate and identifies the product as organic. It does not support a complete bilingual roster of sibling variants. [S02]

Metro Québec’s French indexed listing pairs product number `058449771760` with **Granola au chocolat noir et baies rouges biologique, Love Crunch** and shows a 325 g package. Direct retrieval returned a cache miss during this pass, so the indexed title and item-number match are used for identity wording only; no current price, store availability, or stock claim is made. [S03]

The manufacturer’s Love Crunch collection displays this product among separately named sibling variants, including Dark Chocolate & Peanut Butter, Dark Chocolate & Hazelnut Butter, and Protein products. Do not add siblings, family-wide aliases, or cross-variant links from this single-product review. [S04]

## Exact ownership audit

The pre-integration package had **1,882 references**, **197 forms**, **56 legacy candidates**, **2,288 ledger records**, and **114 recipes / 1,123 structured ingredient rows**. Searches across reference names and aliases, form labels and match terms, legacy identities, ledger records, source URLs, and proposal archives found no exact Love Crunch Red Berries owner or UPC owner. Generic `granola`, Cranberry Almond Crunch, and Special K Red Berries remain separate. The selected reference ID and all four manufacturer/retailer URLs were unowned.

| Shared source ID | Source and observed evidence | Ownership and use |
|---|---|---|
| **WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S01** | Nature’s Path, [Love Crunch Organic Dark Chocolate & Red Berries Granola](https://naturespath.com/en-ca/products/dark-chocolate-and-red-berries-granola-lc-ca), Canada page, checked 2026-10-19. The product image filename includes `058449771760`. | Manufacturer identity evidence for one finished product; no serving, component proportions, or family roster. |
| **WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S02** | Nature’s Path, [Chocolate noir et baies rouges Granola, socle 700 g](https://naturespath.com/fr-ca/products/chocolate-noir-et-baies-rouges-granola-socle-700-g), French-localized Canada page. The Love Crunch collection breadcrumb and matching product-image UPC pair it with the English page. | Manufacturer evidence for this French-localized variant; the page title is not copied verbatim into the catalog display. No measure or sibling roster. |
| **WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S03** | Metro Québec, [Granola au chocolat noir et baies rouges biologique, Love Crunch](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/granola-au-chocolat-noir-et-baies-rouges-biologique/p/058449771760), French indexed listing, checked 2026-10-19. | The indexed title, 325 g package, and product number support the Québec French wording and product match. Direct retrieval returned a cache miss; no current price or availability is inferred. |
| **WP03-SECTIONF-LOVE-CRUNCH-RB-R801-20261019-S04** | Nature’s Path, [Love Crunch collection](https://naturespath.com/en-ca/collections/love-crunch), checked 2026-10-19. | Shows separately named product variants and supports the one-variant family boundary only. |

## Picker and recipe-corpus impact

Using the current phrase-first matcher, the integrated reference yields these changes:

| Query | Before | After |
|---|---:|---:|
| `Love Crunch` | 0 | 1 |
| `dark chocolate and red berries`; `chocolat noir et baies rouges` | 0 | 1 |
| `granola` | 6 | 7 |
| `red berries`; `baies rouges` | 1 / 1 | 2 / 2 |
| `Cranberry Almond Crunch` | 1 | 1 |

The manifest-ordered scan covered all **114** recipes and **1,123** ingredient rows. No Love Crunch, UPC, or product-name match was found. No recipe link or recipe edit was made.

## Integration disposition

Root added the identity-only reference with exact display names above, empty aliases, null density, empty mappings, and category `GRAIN_AND_CEREAL`; the ledger row is identity-verified with measurement and substitution states `researched_no_supported_value` and `researched_no_supported_substitute`. The broader Section F parent remains open. Static package validation, reference normalization, generated-index freshness, ownership, picker projection, corpus scan, encoding, link, and whitespace checks passed. No software tests, build, emulator run, or deployment were performed because this only adds database JSON data under `AGENTS.md`.
