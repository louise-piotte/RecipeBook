# WP02 Section E R242 — McCormick Ube Flavor identity review (2026-10-16)

**Status:** Accepted and integrated on 2026-10-16 by the parent agent. The ingredient-reference JSON, research ledger, generated index, plan, roadmap, and batch README are updated.

## Recommendation and integrated identity

Add identity-only `ingredient-ref-mccormick-ube-flavor`:

| Field | Value |
|---|---|
| English display | `McCormick Ube Flavor` |
| French display | `arôme d’ube McCormick` (provisional descriptive translation; no Québec product label was found) |
| English alias | `McCormick Ube Extract` (exact brand-qualified Canadian retailer wording) |
| French aliases | None |
| Category; density; mappings | `BAKING_AND_SPICE`; `null`; `[]` |

The product is a liquid flavouring sold for culinary use. AFOD Ltd., a Canadian importer/distributor, calls it McCormick Ube Flavor and Purple Yam Flavor. A Canadian grocery retailer calls the same product number McCormick Ube Extract. Since those names refer to the same exact product, preserve the brand-qualified retail phrase only. Do not add bare `ube extract` or `purple yam flavor` as global aliases; the retailer’s word *extract* does not establish the product’s source or formula.

Keep this product separate from ube halaya, actual fresh/dried/powdered ube, purple sweet potato, taro, and food colouring. Do not infer natural/artificial status, a recipe dose, or a colourant role. Record the one 20 mL bottle only as a package-specific ledger observation. No forms, density, active mappings, reusable measures, recipe links, conversions, yields, or substitutions were added. An exact bounded search of the 114 bundled recipes / 1,123 ingredient rows found no ube/flavouring demand.

## Québec French terminology

The French display is a descriptive construction based on OQLF’s food-chemistry term *aromatisant*. OQLF defines the category as an added flavouring substance and says it may be natural or synthetic; it does not give a ube-specific term. A French retailer lists a different 20 mL ube product as *Extrait d’ube* with *arôme naturel d’ube* in its ingredient list. That comparator supports French culinary wording only, not the McCormick formula, Québec retail label, or a natural-flavour claim. The English retailer’s “extract” title is kept brand-qualified.

## Local ownership and corpus audit

- Active references had `ingredient-ref-ube-halaya` but no McCormick Ube Flavor, Ube Extract, or ube-flavouring reference. Its existing halaya row is a sweetened jam and remains distinct.
- No active form, legacy-import candidate, or exact ledger owner was found for the McCormick product number / barcode `00052100089119` / `052100089119`.
- The current bundled recipe corpus contains no ingredient-row match for `ube`, `purple yam`, `ube flavor`, `ube flavour`, `ube extract`, or `McCormick Ube Flavor`.
- The McCormick record has no form, density, unit mapping, active conversion, recipe link, or substitution rule. The one 20 mL bottle is package data only.

## Proposal source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP02-SECTIONE-UBE-FLAVORING-R242-20261016-S01` | AFOD Ltd., [McCormick Ube Flavor](https://afodltd.com/product/mccormick-ube-flavor/) | Canadian importer/distributor listing gives `McCormick Ube Flavor`, `Purple Yam Flavor`, a 24 × 20 mL carton, SKU 90-024, and barcode 052100089119. Does not disclose formula or natural/artificial status. |
| `WP02-SECTIONE-UBE-FLAVORING-R242-20261016-S02` | Save-On-Foods, [McCormick Ube Extract](https://www.saveonfoods.com/sm/pickup/rsid/4410/product/mccormick-ube-extract-id-00052100089119) | Canadian grocery listing gives a 20 mL bottle, culinary uses, and product number 00052100089119, matching AFOD’s barcode with a leading zero. It does not establish an actual botanical extraction. |
| `WP02-SECTIONE-UBE-FLAVORING-R242-20261016-S03` | OQLF, [aromatisant (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402773/aromatisant) | Food-chemistry entry supports *aromatisant* / *agent aromatisant* for an added flavouring substance that may be natural or synthetic; it gives no ube term. |
| `WP02-SECTIONE-UBE-FLAVORING-R242-20261016-S04` | Nature & Découvertes, [Ube Factory Extrait d’ube](https://www.natureetdecouvertes.com/thes-epicerie/epicerie-sucree/aide-patisserie/extrait-d-ube-92774750) | French listing for a different brand and formula. Its ingredient list uses *arôme naturel d’ube*; this is French wording evidence only, not a McCormick or Québec product label. |

The broad Section E item remains open for other ube preparations, generic extract terms, food colouring, edible luster, and the independent Québec terminology review.
