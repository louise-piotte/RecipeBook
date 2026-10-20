# WP05 Section X: Singapore laksa spice-paste identity review

- **Reviewed:** 2026-10-12.
- **Decision:** add identity-only `Singapore laksa spice paste / pâte d’épices pour laksa de Singapour` in `SAUCE_AND_CONDIMENT`, with no aliases or numeric behavior.
- **Scope:** the source-named concentrated spice paste for preparing Singapore laksa. This does not cover a generic laksa paste family, a ready-made soup base, a complete noodle meal kit, or the dish itself.

## Evidence and boundaries

Canadian foodservice distributor THL lists Asian Home Gourmet's `Spice Paste for Singapore Laksa`, SKU 40944, in a 60 g pack [S01]. Walmart Canada's French listing gives the Canadian-facing product label `Pâte d’épices pour Laksa de Singapour` [S02]. Vancouver retailer Gourmet Warehouse lists the product as `Singapore Laksa Paste, 60g`, describes its use with meat, coconut milk, and noodles, and provides its ingredient list [S03]. The observed 60 g is package mass only; no volume measure, density, mapping, or serving conversion is proposed.

Keep the Singapore qualifier in both displays. Do not add broad aliases `laksa paste`, `laksa spice paste`, `pâte de laksa`, or `laksa soup base`. Lee Kum Kee Canada separately sells a 157 mL `Base Pour Soupe Laksa` sauce sachet with coconut and shrimp ingredients; that is a different branded soup-base product and is not merged into this spice-paste identity [S04]. Measurement and substitution research remain `not_yet_researched`.

## Exact ownership and recipe demand

A normalized exact-key scan across ingredient references, forms, legacy import identities, and ledger identity records found no exact owner for either proposed display. The active catalog has related Thai curry-paste identities, but none owns the qualified Singapore-laksa phrases. The full manifest-listed corpus contains 114 recipes and 1,123 ingredient rows; it has no `laksa` text or ingredient-row demand. No recipe link is proposed.

## Source register

| ID | Source | Supports and limits |
|---|---|---|
| **S01** | THL Gourmet Foods, [Asian Home Gourmet Spice Paste for Singapore Laksa](https://thlfoods.com/product/asian-home-gourmet-spice-paste-for-singapore-laksa/). | Canadian foodservice distributor page lists product, SKU, package size, and Thailand origin; no generic measurement. |
| **S02** | Walmart Canada, [Asian Home Gourmet Laksa singapourienne, 60 g](https://www.walmart.ca/fr/ip/Asian-Home-Gourmet-Laksa-singapourienne-60g/6000200345384). | French retailer listing and package-label wording; one branded item, not an OQLF terminology ruling. |
| **S03** | Gourmet Warehouse, [Singapore Laksa Paste, 60 g](https://gourmetwarehouse.ca/singapore-laksa-paste-60g/). | Canadian retailer's product name, use description, SKU ingredients, and shipping availability; formula-specific. |
| **S04** | Lee Kum Kee Canada, [Base Pour Soupe Laksa](https://ca.lkk.com/fr-ca/products/laksa-soup-base). | Official French product page identifies a different sauce-sachet soup base. Used to preserve the paste/base boundary only. |

## Static checks if integrated

Recheck exact-key ownership, verify the Singapore qualifiers, category, empty aliases and numeric fields, rescan the manifest, validate the package and ledger, regenerate the Kotlin index, and check UTF-8/no-BOM and scoped whitespace. This review changes database JSON only, so no app tests or emulator checks are required under the user's rule.
