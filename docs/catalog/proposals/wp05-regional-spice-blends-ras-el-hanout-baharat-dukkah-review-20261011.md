# WP05 Section T — Ras el hanout, baharat, and dukkah identity review

- **Packet type:** source-checked identity, Québec naming, mixture-boundary, and recipe-demand review.
- **Source access date:** 2026-10-11.
- **Plan:** Section T, individual spices and seasoning blends.
- **Disposition:** accept and integrate three identity-only rows; keep formulas product-specific.
- **Proposal source IDs:** `WP05-T-REGIONAL-BLENDS-20261011-S01` through `S12`.

## Coordinator decision

The evidence supports three distinct named blend identities:

| ID | English display | French display | Aliases | Category | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-ras-el-hanout` | `ras el hanout` | `ras-el-hanout` | EN `ras-el-hanout`; FR `ras el hanout` | `BAKING_AND_SPICE` | Products sold as ras el hanout. OQLF documents the spelling with and without a hyphen and variable Moroccan spice composition. Do not add its broader English descriptor `Moroccan seasoning` as an alias. |
| `ingredient-ref-baharat` | `baharat` | `baharat` | None | `BAKING_AND_SPICE` | Products explicitly named baharat. Regional versions differ; the row does not define one regional formula or absorb every seven-spice blend. |
| `ingredient-ref-dukkah` | `dukkah` | `dukkah` | EN `duqqa` | `BAKING_AND_SPICE` | Products sold as dukkah/duqqa. Nut, seed, legume, and spice composition varies. Do not infer a universal allergen declaration. |

No recipe line in the 114-recipe bundle requests these blends. Add no forms, density, unit mapping, measurement, conversion, package yield, recipe link, or substitution. Recipe-specific ingredients and product labels remain authoritative for component and allergen details.

## Live audit and naming

At review time the package contained 1,039 references, 72 forms, 114 recipes, and 1,123 ingredient rows. The ledger contained 1,331 records, 4,380 source entries, and 3,613 distinct source IDs; the legacy file contained 75 candidates. No exact active-name, alias, form, or legacy-key collision was found for the reviewed terms or the proposed IDs. Exact normalized phrase scans across all manifest recipes found no ingredient-line or recipe-text demand for `ras el hanout`, `ras-el-hanout`, `raselhanout`, `baharat`, `dukkah`, `duqqa`, `dukka`, or `dokka`.

OQLF’s preferred French term is *ras-el-hanout* and its note accepts writing it without the hyphen. A French-language Québec Metro listing calls one item *Mélange Ras el Hanout*; the listing redirects to the English product view when opened directly, so the OQLF entry is the terminology authority and the retailer listing is product-label corroboration [S01–S02].

For baharat and dukkah, the reviewed local sources use the borrowed product names in English or bilingual retail contexts. No OQLF preferred French equivalent was found for either. Reuse `baharat` and `dukkah` as the French displays rather than inventing descriptive terms. Baharat can denote varied Middle Eastern/North African mixtures; `sept épices`, `sabaa baharat`, and Turkish-style products remain source-qualified rather than global aliases [S04–S07, S12].

## Blend boundaries

| Identity | Evidence and boundary | Decision |
|---|---|---|
| **Ras el hanout** | OQLF defines it as a Moroccan spice blend with variable composition. A Québec retailer lists one Dion mixture containing salt and a range of spices; a Québec producer references ras el hanout among its named blends. These sources support the name, not a universal ingredient list [S01–S03]. | Accept a named identity with only orthographic hyphen variants. Exclude `Moroccan seasoning`, `couscous spice`, tagine seasoning, and individual components as aliases. Do not encode the Dion formula. |
| **Baharat** | Canadian sellers describe baharat across Middle Eastern and North African cooking, with recipes varying by region. One Calgary seller labels a Turkish version, and Québec listings use “seven spices” or `Sabaa Baharat` for particular Lebanese/Arabic products [S04–S07, S12]. | Accept products explicitly named baharat. Keep Lebanese seven-spice, `sabaa baharat`, Turkish baharat, and other regional products qualified unless a source directly establishes an exact same-product crosswalk. Exclude generic “seven spices,” allspice, ras el hanout, and garam masala as aliases. |
| **Dukkah / duqqa** | Québec and Toronto sellers name dukkah as a blend. Crousset’s Québec product includes sesame and chickpeas; Toronto’s Spice Trader sells a nut-free variation with sesame; another Canadian listing describes roasted nuts, seeds, and spices and uses the spelling `Duqqa` [S08–S11]. | Accept the blend identity and English spelling alias `duqqa`. Do not store a fixed formula, grind, salt level, nut status, or allergen profile. Keep a product’s label and ingredient list in control of its actual components. Exclude `Egyptian spice blend`, `Daqa`, and brand/recipe names as broad aliases. |

The three blends remain distinct from each other, za’atar, garam masala, curry powder, Chinese five-spice, and generic spice mixtures. Similar use in couscous, rice, meats, vegetables, or dips does not establish identity or substitution.

## Sources

All sources were accessed 2026-10-11 and are used only for the claim stated.

| Source ID | Source | Supports and limit |
|---|---|---|
| `WP05-T-REGIONAL-BLENDS-20261011-S01` | Office québécois de la langue française, [ras-el-hanout (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351906/ras-el-hanout). | Gives the preferred French form, English equivalents, accepted hyphen variation, Moroccan scope, and variable composition. Does not define current commercial formulas. |
| `WP05-T-REGIONAL-BLENDS-20261011-S02` | Metro Québec, [Mélange Ras el Hanout Dion](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/epices/melange-ras-el-hanout/p/620383013291). | French indexed title and product number for one retail mix. The French URL currently redirects to an English view; do not treat this as a universal formula or OQLF terminology ruling. |
| `WP05-T-REGIONAL-BLENDS-20261011-S03` | Épices Crousset, [À propos](https://crousset.com/a-propos/). | Québec producer describes its Magog-origin product business and names ras el hanout and baharat among its spice blends. It supports local product usage, not an official French equivalent. |
| `WP05-T-REGIONAL-BLENDS-20261011-S04` | The Tea & Spice Shoppe, [Baharat](https://teaspiceshoppe.ca/products/baharat-specialty-blend). | Canadian seller labels a Baharat spice blend and gives one formula. It supports one product example only. |
| `WP05-T-REGIONAL-BLENDS-20261011-S05` | The Silk Road Spice Merchant, [Turkish Baharat](https://silkroadspices.ca/collections/all/products/turkish-baharat). | Canadian seller describes regional baharat variation and one Turkish-style formula. It does not establish all baharat products as Turkish seven-spice. |
| `WP05-T-REGIONAL-BLENDS-20261011-S06` | Costco Business Centre Canada, [PTI — Mélange arabe baharat de 7 épices](https://www.costcobusinesscentre.ca/p/-/pti-mlange-arabe-baharat-de-7-pices-500-g/2001167009?langId=-25). | Québec-language product title and one seven-spice product formula. It is not a global alias or universal baharat definition. |
| `WP05-T-REGIONAL-BLENDS-20261011-S07` | Le Pro 1600, [Sept épices — 85 g](https://lepro1600.com/products/7-epices-libanais-85-g). | Montréal-area French-language seller calls one Lebanese seven-spice product `Sabaa Baharat`. Supports a product-specific relation only. |
| `WP05-T-REGIONAL-BLENDS-20261011-S08` | Épices Crousset, [Dukkah](https://crousset.com/ca-en/product/dukkah/). | Québec seller labels dukkah a spice blend, states there are many varieties, and gives one formula of sesame, chickpeas, and spices. Supports local product wording and variation. |
| `WP05-T-REGIONAL-BLENDS-20261011-S09` | The Spice Trader, [Dukkah](https://thespicetrader.ca/products/dukkah). | Toronto seller names a nut-free dukkah and lists cumin, coriander, toasted sesame, and black pepper; it describes nuts as an optional addition. Demonstrates that nut content is not universal. |
| `WP05-T-REGIONAL-BLENDS-20261011-S10` | The Tuscan Kitchen, [Dukkah Spice Blend](https://www.thetuscankitchen.com/products/dukkah-spice-blend). | Canadian product page says dukkah is sometimes spelled `Duqqa` and lists a specific blend containing nuts, seeds, spices, salt, and oil. Supports one spelling alias and a distinct product formula. |
| `WP05-T-REGIONAL-BLENDS-20261011-S11` | Ameen Foods, [Dukka Spice](https://ameenfoods.ca/products/dokka-250g). | Canadian seller uses Dukka in the product title and describes one toasted-nut and seed blend. Its “also known as” list is marketplace-specific; `Daqa` and `Egyptian Spice Blend` are not activated as global aliases. |
| `WP05-T-REGIONAL-BLENDS-20261011-S12` | Épices Crousset, [À propos](https://crousset.com/a-propos/). | The Québec producer names Baharat among its spice blends. Supports local borrowed-name usage for this identity, not a universal regional formula or official French terminology ruling. |

## Integration record

The three rows and verified ledger records were integrated after the live collision, recipe-demand, and source-ID checks. Each row is identity-only. Package normalization and validation, reference normalization, generated-index freshness, ledger validation, UTF-8/no-BOM checks, and scoped whitespace checks passed. No tests or emulator were run for these database JSON additions. See the [integration README](../batches/wp05-regional-spice-blends-identity-integration-20261011/README.md).
