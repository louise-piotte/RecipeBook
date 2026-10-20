# WP02 Section E R244 — McCormick Pandan Flavor identity review (2026-10-16)

**Status:** Accepted and integrated on 2026-10-16. The ingredient reference, source-specific package observation, generated index, plan, roadmap, and batch README are updated.

## Integrated identity

Add brand-specific `ingredient-ref-mccormick-pandan-flavor`:

| Field | Value |
|---|---|
| English display | `McCormick Pandan Flavor` |
| French display | `arôme de pandan McCormick` (provisional descriptive wording; no Québec product label was found) |
| English alias | `McCormick Pandan Extract` (exact Canadian retailer wording for the same product number) |
| French aliases | None |
| Category; density; mappings | `BAKING_AND_SPICE`; `null`; `[]` |

This is a named commercial flavoring product, separate from pandan leaves and pure leaf powder, leaf juice, fresh extract, extract powders, pastes, and the separate McCormick Buko Pandan product. Do not infer that the commercial liquid is made by extracting pandan leaves. Keep aliases brand-qualified; do not add bare `pandan`, `pandan extract`, `pandan flavor`, `screwpine`, `Daun Pandan`, or botanical names. Do not claim a formula or natural/artificial status in the catalog.

The matching Canadian retail product number identifies one 20 mL bottle. Retain it only as a package-specific ledger observation, not a recipe dose or household measure. The manufacturer gives broad use directions including `1/2 tsp or 3% per 100ml`; these do not establish a recipe-specific quantity or a conversion and are not added as active measurement data. No forms, density, reusable measures, conversions, yields, recipe links, or substitutions are supported.

## Ownership, picker, and recipe demand

The pre-integration package contained **1,636 ingredient references**, **122 forms**, **61 legacy candidates**, and **1,981 research-ledger records**. An exact-name audit found no McCormick pandan product in references, forms, legacy identities, or ledger records. The only existing active pandan identity is `pandan leaves / feuilles de pandan`, with a separate pure-leaf powdered form.

The picker already returns the pandan-leaf identity for `pandan`. Adding the branded flavor title gives a second result for `pandan`, preserving both the leaf and the commercial flavor choice. The `McCormick Pandan Extract` alternate title stays brand-qualified; the broad product family and unqualified extract name remain unresolved. Keep this identity separate from McCormick Buko Pandan, whose importer barcode is different.

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for `pandan extract`, `McCormick pandan`, `pandan flavor extract`, `pandan flavor`, `arôme artificiel de pandan`, and `extrait de pandan`. **No recipe text or ingredient row matched.** The row therefore has no recipe links or recipe-dose evidence.

## Sources

Sources were checked on 2026-10-16. IDs below are recorded on the research-ledger entry.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP02-SECTIONE-PANDAN-FLAVOR-R244-20261016-S01` | McCormick Philippines, [Pandan Flavor 20ml](https://www.mccormick.com.ph/food-extracts-colors-flavors/200-pandan-flavor-20ml.html) | Manufacturer product title, 20 mL size, product code `052100089010`, and use directions for cakes, baked products, beverages, confectionery, fillings, ice cream, and sherbets. It does not disclose a complete formula or say whether the flavour is natural or artificial. Its suggested usage expressions are not recipe-specific. |
| `WP02-SECTIONE-PANDAN-FLAVOR-R244-20261016-S02` | AFOD Ltd., [McCormick Pandan Flavor](https://afodltd.com/shop/page/17/?gridcookie=list) | Canadian importer/distributor listing for 24 × 20 mL, SKU `90-153`, barcode `052100089010`. Supports the Canadian distribution package and product identity, not local Québec stocking or a French package label. |
| `WP02-SECTIONE-PANDAN-FLAVOR-R244-20261016-S03` | Save-On-Foods, [McCormick Pandan Extract, 20 Millilitre](https://www.saveonfoods.com/sm/pickup/rsid/4410/product/mccormick-pandan-extract-id-00052100089010) | Current Canadian grocery title, culinary-use description, 20 mL size, and product number `00052100089010`, which is the same code with leading zeros as the manufacturer/importer code. Retail wording does not prove a botanical extraction process or disclose a formula. |
| `WP02-SECTIONE-PANDAN-FLAVOR-R244-20261016-S04` | Office québécois de la langue française, [arôme artificiel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086415/arome-artificiel) | Supports Québec terminology `arôme artificiel` for a flavoring whose aromatic principles come partly or entirely from another source. It does not establish the formulation of this McCormick product; the catalog display therefore uses the more general `arôme de pandan`. |
| `WP02-SECTIONE-PANDAN-FLAVOR-R244-20261016-S05` | Target, [McCormick Pandan Flavoring Extract, UPC `052100089010`](https://www.target.com/p/-/A-1002279351) | A retailer listing for the matching UPC describes the flavour as artificial and confirms the Philippine product origin. This is retailer classification, not a complete manufacturer ingredient declaration or Canadian package-label evidence; no natural/artificial claim was added to the active row. |

## Decision

Accept one identity-only branded flavoring row and one package-only observation. Retain the French display as provisional and descriptive. Keep generic pandan extract, actual leaf extract/juice, leaf and extract powders, paste, and compound Buko Pandan products unresolved or separate. The bundled corpus has no matching demand. No substitution research was added.
