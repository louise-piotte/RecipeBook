# WP05 Section X Thai paste identities — 2026-10-12

## Catalog decision

Added five identity-only references in `SAUCE_AND_CONDIMENT`:

| ID | English / fr-CA display | Aliases |
| --- | --- | --- |
| `ingredient-ref-yellow-curry-paste` | Thai yellow curry paste / `pâte de cari jaune thaïe` | None |
| `ingredient-ref-panang-curry-paste` | Panang curry paste / `pâte de cari panang thaïe` | None |
| `ingredient-ref-massaman-curry-paste` | Massaman curry paste / `pâte de cari massaman thaïe` | `Massamun curry paste`; `pâte de curry Massamun` |
| `ingredient-ref-nam-prik-pao` | Thai chili paste (nam prik pao) / `pâte de chili rouge thaï (nam prik pao)` | `nam phrik phao` in both languages |
| `ingredient-ref-pla-ra` | pla ra / `pla ra (sauce de poisson fermentée)` | `sauce de poisson fermentée (pla ra)` in French |

The Massamun spelling is a bounded inference from the Embassy's Massamun/Massaman dish crosswalk and Pantai's Massamun curry-paste label. `Nam phrik phao` is a spelling alias only; manufacturer-specific chili-paste ingredients and formulas are not generalized. The pla ra label uses a transparent Canadian retail descriptor. Thailand's agricultural standard covers raw Pla-Ra and explicitly excludes processed products, so no product form is asserted.

Kept the unqualified `red curry paste` relationship unresolved. Its active reference is unreviewed and the only bundled request is also unqualified; adding a Thai alias or a second Thai identity would make an unsupported scope decision. Retained existing green curry paste, Kapi, padaek, and other regional fermented-paste identities. No recipe links changed.

No matching style-specific recipe rows were found in the 114-recipe / 1,123-line bundle. No forms, density, unit mappings, measurements, conversions, yields, or substitutions were added.

## Sources

| Source ID | Source | Use and limit |
| --- | --- | --- |
| `WP05-THAI-RESIDUAL-20261012-S01` | [Pantainorasingh, Curry Pastes](https://pantainorasingh.com/collections/curry-pastes) | Names separate Thai yellow, Panang, and Massamun paste products; vendor assortment does not define universal formulas. |
| `WP05-THAI-RESIDUAL-20261012-S02` | [Canadian Intellectual Property Office, Journal des marques de commerce, Vol. 73 No. 3727](https://www.ic.gc.ca/opic-cipo/tmj/eng/01Apr2026_fr.pdf?edition=04-01&year=2026) | Lists the French names for Thai yellow, Panang, and Massaman curry pastes. Goods wording supports labels, not a terminology ruling or product standard. |
| `WP05-THAI-RESIDUAL-20261012-S03` | [Royal Thai Embassy in Copenhagen, “Taste of Thailand: Thai Street Food Festival”](https://copenhagen.thaiembassy.org/en/content/81638-%E2%80%9CTaste-of-Thailand%3A-Thai-Street-Food-Festival%E2%80%9D?cate=5d81e20015e39c161400214e) | Names “Massamun Curry (Gang-Massaman),” supporting a bounded spelling crosswalk. |
| `WP05-THAI-RESIDUAL-20261012-S04` | [Pantainorasingh, Pâte de Curry Massamun](https://www.pantainorasingh.com/fr-products/massamun-curry-paste) | Supports the manufacturer's Massamun paste wording only. |
| `WP05-THAI-RESIDUAL-20261012-S05` | [Pantainorasingh, Chili Paste with Soya Bean Oil](https://www.pantainorasingh.com/products/chili-paste-with-soya-bean-oil-medium-hot) | Names one SKU as also known as Nam Prik Pao; its soybean-oil wording and composition remain SKU-specific. |
| `WP05-THAI-RESIDUAL-20261012-S06` | [Chita Organic Food, Organic Thai Chilli Paste (Nam Prik Pao)](https://www.chitaorganicfood.co.th/en/product/47942-41421/organic-thai-chilli-paste-nam-prik-pao) | Independently names a Thai manufacturer's product; no universal recipe is inferred. |
| `WP05-THAI-RESIDUAL-20261012-S07` | [Kasetsart University thesis, Aroma-active compounds in Thai chili paste (Nam Phrik Phao)](https://doi.nrct.go.th/ListDoi/Download/56459?Resolve_DOI=10.14457%2FKU.the.2009.406) | Supports the source spelling `Nam Phrik Phao`; the studied formulation is not generalized. |
| `WP05-THAI-RESIDUAL-20261012-S08` | [Gordon Food Service Canada, Pâtes au crabe Tom Yum](https://gfs.ca/fr-ca/idees/recette/pates-au-crabe-tom-yum/) | Uses `pâte de chili rouge thaï (nam prik pao)` in French; recipe quantities are not copied. |
| `WP05-THAI-RESIDUAL-20261012-S09` | [Thailand National Bureau of Agricultural Commodity and Food Standards, TAS 7023–2018: Pla-Ra](https://tas2go.acfs.go.th/upload_standard/321_en.pdf) | Defines raw Pla-Ra and excludes processed Pla-Ra from its scope. |
| `WP05-THAI-RESIDUAL-20261012-S10` | [Office National du Tourisme de Thaïlande, Recette éprouvée](https://www.tourismethai.fr/experiences/cuisine-thai/recette/recette-eprouvee/) | Uses `pla ra (poisson fermenté)`; French wording is from France, not a Canadian terminology standard. |
| `WP05-THAI-RESIDUAL-20261012-S11` | [Sukanya Online Thai Food, Canadian French-language storefront](https://sukanyaonline.ca/fr) | Uses French fermented-fish descriptions and lists named pla ra products; supports a transparent descriptor, not a universal form. |

## Validation

- The package had 1,181 ingredient references before this batch and now has 1,186; forms remain 85. The manifest remains 114 recipes / 1,123 ingredient rows, and the 66 legacy candidates remain unchanged.
- The ledger now has 1,486 records / 4,960 source entries / 4,049 distinct source IDs / 8 unit conversions.
- No recipe files changed. The new entries use explicit Unicode escapes in bundled seed JSON and UTF-8 without BOM in documentation.
- Bundled package normalization/schema validation, reference normalization, generated-index freshness at 1,186 references, and ledger validation (zero errors) passed.
- Normalized exact-key ownership found zero collisions across references, forms, and legacy identities. UTF-8/no-BOM and trailing-whitespace checks passed for all seven changed data, generated, and documentation files; scoped `git diff --check` passed.
- No Gradle tests or emulator checks were run because this batch only adds database JSON data.

See the [proposal packet](../../proposals/wp05-section-x-thai-curry-paste-residual-styles-review-20261012.md). Broader Section X review remains open.
